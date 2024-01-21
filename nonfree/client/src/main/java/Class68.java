import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!we")
public final class Class68 implements Runnable {

	@OriginalMember(owner = "client!we", name = "e", descriptor = "Lclient!u;")
	private Class62 aClass62_56;

	@OriginalMember(owner = "client!we", name = "y", descriptor = "[B")
	private byte[] aByteArray24;

	@OriginalMember(owner = "client!we", name = "j", descriptor = "Z")
	private boolean aBoolean136 = false;

	@OriginalMember(owner = "client!we", name = "q", descriptor = "I")
	private int anInt2959 = 0;

	@OriginalMember(owner = "client!we", name = "f", descriptor = "Z")
	private boolean aBoolean135 = false;

	@OriginalMember(owner = "client!we", name = "F", descriptor = "I")
	private int anInt2967 = 0;

	@OriginalMember(owner = "client!we", name = "c", descriptor = "Lclient!ra;")
	private final Class54 aClass54_4;

	@OriginalMember(owner = "client!we", name = "b", descriptor = "Ljava/net/Socket;")
	private final Socket aSocket1;

	@OriginalMember(owner = "client!we", name = "A", descriptor = "Ljava/io/InputStream;")
	private final InputStream anInputStream1;

	@OriginalMember(owner = "client!we", name = "i", descriptor = "Ljava/io/OutputStream;")
	private final OutputStream anOutputStream1;

	@OriginalMember(owner = "client!we", name = "<init>", descriptor = "(Ljava/net/Socket;Lclient!ra;)V")
	public Class68(@OriginalArg(0) Socket arg0, @OriginalArg(1) Class54 arg1) throws IOException {
		this.aClass54_4 = arg1;
		this.aSocket1 = arg0;
		this.aSocket1.setSoTimeout(30000);
		this.aSocket1.setTcpNoDelay(true);
		this.anInputStream1 = this.aSocket1.getInputStream();
		this.anOutputStream1 = this.aSocket1.getOutputStream();
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(Z)V")
	public void method1935() {
		if (this.aBoolean135) {
			return;
		}
		synchronized (this) {
			this.aBoolean135 = true;
			this.notifyAll();
		}
		if (this.aClass62_56 != null) {
			while (this.aClass62_56.anInt2572 == 0) {
				Static39.method862(1L);
			}
			if (this.aClass62_56.anInt2572 == 1) {
				try {
					((Thread) this.aClass62_56.anObject4).join();
				} catch (@Pc(47) InterruptedException local47) {
				}
			}
		}
		this.aClass62_56 = null;
	}

	@OriginalMember(owner = "client!we", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			while (true) {
				label77: {
					@Pc(41) int local41;
					@Pc(52) int local52;
					synchronized (this) {
						if (this.anInt2959 == this.anInt2967) {
							if (this.aBoolean135) {
								break label77;
							}
							try {
								this.wait();
							} catch (@Pc(28) InterruptedException local28) {
							}
						}
						if (this.anInt2967 >= this.anInt2959) {
							local41 = this.anInt2967 - this.anInt2959;
						} else {
							local41 = 5000 - this.anInt2959;
						}
						local52 = this.anInt2959;
					}
					if (local41 <= 0) {
						continue;
					}
					try {
						this.anOutputStream1.write(this.aByteArray24, local52, local41);
					} catch (@Pc(69) IOException local69) {
						this.aBoolean136 = true;
					}
					this.anInt2959 = (this.anInt2959 + local41) % 5000;
					try {
						if (this.anInt2959 == this.anInt2967) {
							this.anOutputStream1.flush();
						}
					} catch (@Pc(91) IOException local91) {
						this.aBoolean136 = true;
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
				} catch (@Pc(115) IOException local115) {
				}
				this.aByteArray24 = null;
				return;
			}
		} catch (@Pc(120) Exception local120) {
			Static42.method908(null, local120);
		}
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "([BIII)V")
	public void method1937(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) throws IOException {
		if (this.aBoolean135) {
			return;
		}
		while (arg1 > 0) {
			@Pc(19) int local19 = this.anInputStream1.read(arg0, arg2, arg1);
			if (local19 <= 0) {
				throw new EOFException();
			}
			arg1 -= local19;
			arg2 += local19;
		}
	}

	@OriginalMember(owner = "client!we", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		this.method1935();
	}

	@OriginalMember(owner = "client!we", name = "b", descriptor = "(I)I")
	public int method1940() throws IOException {
		return this.aBoolean135 ? 0 : this.anInputStream1.read();
	}

	@OriginalMember(owner = "client!we", name = "c", descriptor = "(I)I")
	public int method1941() throws IOException {
		return this.aBoolean135 ? 0 : this.anInputStream1.available();
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(I[BIB)V")
	public void method1942(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1) throws IOException {
		if (this.aBoolean135) {
			return;
		}
		if (this.aBoolean136) {
			this.aBoolean136 = false;
			throw new IOException();
		}
		if (this.aByteArray24 == null) {
			this.aByteArray24 = new byte[5000];
		}
		synchronized (this) {
			for (@Pc(30) int local30 = 0; local30 < arg1; local30++) {
				this.aByteArray24[this.anInt2967] = arg0[local30];
				this.anInt2967 = (this.anInt2967 + 1) % 5000;
				if (this.anInt2967 == (this.anInt2959 + 4900) % 5000) {
					throw new IOException();
				}
			}
			if (this.aClass62_56 == null) {
				this.aClass62_56 = this.aClass54_4.method1495(3, this);
			}
			this.notifyAll();
		}
	}
}
