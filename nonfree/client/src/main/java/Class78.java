import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ra")
public final class Class78 implements Runnable {

	@OriginalMember(owner = "client!ra", name = "m", descriptor = "Lclient!wg;")
	private Class94 aClass94_6;

	@OriginalMember(owner = "client!ra", name = "v", descriptor = "[B")
	private byte[] aByteArray42;

	@OriginalMember(owner = "client!ra", name = "e", descriptor = "I")
	private int anInt3399 = 0;

	@OriginalMember(owner = "client!ra", name = "k", descriptor = "I")
	private int anInt3403 = 0;

	@OriginalMember(owner = "client!ra", name = "g", descriptor = "Z")
	private boolean aBoolean138 = false;

	@OriginalMember(owner = "client!ra", name = "o", descriptor = "Z")
	private boolean aBoolean139 = false;

	@OriginalMember(owner = "client!ra", name = "t", descriptor = "Ljava/net/Socket;")
	private final Socket aSocket1;

	@OriginalMember(owner = "client!ra", name = "p", descriptor = "Lclient!na;")
	private final Class61 aClass61_3;

	@OriginalMember(owner = "client!ra", name = "q", descriptor = "Ljava/io/InputStream;")
	private final InputStream anInputStream1;

	@OriginalMember(owner = "client!ra", name = "h", descriptor = "Ljava/io/OutputStream;")
	private final OutputStream anOutputStream1;

	@OriginalMember(owner = "client!ra", name = "<init>", descriptor = "(Ljava/net/Socket;Lclient!na;)V")
	public Class78(@OriginalArg(0) Socket arg0, @OriginalArg(1) Class61 arg1) throws IOException {
		this.aSocket1 = arg0;
		this.aClass61_3 = arg1;
		this.aSocket1.setSoTimeout(30000);
		this.aSocket1.setTcpNoDelay(true);
		this.anInputStream1 = this.aSocket1.getInputStream();
		this.anOutputStream1 = this.aSocket1.getOutputStream();
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(IIB[B)V")
	public void method2415(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) byte[] arg2) throws IOException {
		if (this.aBoolean139) {
			return;
		}
		while (arg0 > 0) {
			@Pc(19) int local19 = this.anInputStream1.read(arg2, arg1, arg0);
			if (local19 <= 0) {
				throw new EOFException();
			}
			arg1 += local19;
			arg0 -= local19;
		}
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(I)I")
	public int method2416() throws IOException {
		return this.aBoolean139 ? 0 : this.anInputStream1.available();
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(B)V")
	public void method2417() {
		if (this.aBoolean139) {
			return;
		}
		synchronized (this) {
			this.aBoolean139 = true;
			this.notifyAll();
		}
		if (this.aClass94_6 != null) {
			while (this.aClass94_6.anInt4472 == 0) {
				Static135.method2059(1L);
			}
			if (this.aClass94_6.anInt4472 == 1) {
				try {
					((Thread) this.aClass94_6.anObject3).join();
				} catch (@Pc(58) InterruptedException local58) {
				}
			}
		}
		this.aClass94_6 = null;
	}

	@OriginalMember(owner = "client!ra", name = "b", descriptor = "(I)I")
	public int method2418() throws IOException {
		return this.aBoolean139 ? 0 : this.anInputStream1.read();
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(I[BIB)V")
	public void method2419(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1) throws IOException {
		if (this.aBoolean139) {
			return;
		}
		if (this.aBoolean138) {
			this.aBoolean138 = false;
			throw new IOException();
		}
		if (this.aByteArray42 == null) {
			this.aByteArray42 = new byte[5000];
		}
		synchronized (this) {
			for (@Pc(36) int local36 = 0; local36 < arg1; local36++) {
				this.aByteArray42[this.anInt3399] = arg0[local36];
				this.anInt3399 = (this.anInt3399 + 1) % 5000;
				if ((this.anInt3403 + 4900) % 5000 == this.anInt3399) {
					throw new IOException();
				}
			}
			if (this.aClass94_6 == null) {
				this.aClass94_6 = this.aClass61_3.method1792(3, this);
			}
			this.notifyAll();
		}
	}

	@OriginalMember(owner = "client!ra", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		this.method2417();
	}

	@OriginalMember(owner = "client!ra", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			while (true) {
				label80: {
					@Pc(39) int local39;
					@Pc(24) int local24;
					synchronized (this) {
						if (this.anInt3403 == this.anInt3399) {
							if (this.aBoolean139) {
								break label80;
							}
							try {
								this.wait();
							} catch (@Pc(20) InterruptedException local20) {
							}
						}
						local24 = this.anInt3403;
						if (this.anInt3403 > this.anInt3399) {
							local39 = 5000 - this.anInt3403;
						} else {
							local39 = this.anInt3399 - this.anInt3403;
						}
					}
					if (local39 <= 0) {
						continue;
					}
					try {
						this.anOutputStream1.write(this.aByteArray42, local24, local39);
					} catch (@Pc(67) IOException local67) {
						this.aBoolean138 = true;
					}
					this.anInt3403 = (this.anInt3403 + local39) % 5000;
					try {
						if (this.anInt3403 == this.anInt3399) {
							this.anOutputStream1.flush();
						}
					} catch (@Pc(88) IOException local88) {
						this.aBoolean138 = true;
					}
					continue;
				}
				try {
					if (this.anInputStream1 != null) {
						this.anInputStream1.close();
					}
					if (this.anOutputStream1 != null) {
						this.anOutputStream1.close();
					}
					if (this.aSocket1 != null) {
						this.aSocket1.close();
					}
				} catch (@Pc(112) IOException local112) {
				}
				this.aByteArray42 = null;
				break;
			}
		} catch (@Pc(117) Exception local117) {
			Static67.method1005(local117, null);
		}
	}
}
