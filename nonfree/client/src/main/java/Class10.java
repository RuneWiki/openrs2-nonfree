import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ca")
public final class Class10 implements Runnable {

	@OriginalMember(owner = "client!ca", name = "k", descriptor = "[B")
	private byte[] aByteArray7;

	@OriginalMember(owner = "client!ca", name = "x", descriptor = "Lclient!f;")
	private Class19 aClass19_1;

	@OriginalMember(owner = "client!ca", name = "p", descriptor = "I")
	private int anInt318 = 0;

	@OriginalMember(owner = "client!ca", name = "c", descriptor = "Z")
	private boolean aBoolean12 = false;

	@OriginalMember(owner = "client!ca", name = "y", descriptor = "I")
	private int anInt324 = 0;

	@OriginalMember(owner = "client!ca", name = "m", descriptor = "Z")
	private boolean aBoolean13 = false;

	@OriginalMember(owner = "client!ca", name = "g", descriptor = "Ljava/net/Socket;")
	private final Socket aSocket1;

	@OriginalMember(owner = "client!ca", name = "s", descriptor = "Lclient!cc;")
	private final Class12 aClass12_1;

	@OriginalMember(owner = "client!ca", name = "z", descriptor = "Ljava/io/InputStream;")
	private final InputStream anInputStream1;

	@OriginalMember(owner = "client!ca", name = "D", descriptor = "Ljava/io/OutputStream;")
	private final OutputStream anOutputStream1;

	@OriginalMember(owner = "client!ca", name = "<init>", descriptor = "(Ljava/net/Socket;Lclient!cc;)V")
	public Class10(@OriginalArg(0) Socket arg0, @OriginalArg(1) Class12 arg1) throws IOException {
		this.aSocket1 = arg0;
		this.aClass12_1 = arg1;
		this.aSocket1.setSoTimeout(30000);
		this.aSocket1.setTcpNoDelay(true);
		this.anInputStream1 = this.aSocket1.getInputStream();
		this.anOutputStream1 = this.aSocket1.getOutputStream();
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(I)V")
	public void method251() {
		if (this.aBoolean12) {
			return;
		}
		synchronized (this) {
			this.aBoolean12 = true;
			this.notifyAll();
		}
		if (this.aClass19_1 != null) {
			while (this.aClass19_1.anInt799 == 0) {
				Static51.method1782(1L);
			}
			if (this.aClass19_1.anInt799 == 1) {
				try {
					((Thread) this.aClass19_1.anObject3).join();
				} catch (@Pc(50) InterruptedException local50) {
				}
			}
		}
		this.aClass19_1 = null;
	}

	@OriginalMember(owner = "client!ca", name = "b", descriptor = "(I)I")
	public int method254() throws IOException {
		return this.aBoolean12 ? 0 : this.anInputStream1.read();
	}

	@OriginalMember(owner = "client!ca", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		this.method251();
	}

	@OriginalMember(owner = "client!ca", name = "d", descriptor = "(I)I")
	public int method259() throws IOException {
		return this.aBoolean12 ? 0 : this.anInputStream1.available();
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(III[B)V")
	public void method260(@OriginalArg(0) int arg0, @OriginalArg(3) byte[] arg1) throws IOException {
		if (this.aBoolean12) {
			return;
		}
		if (this.aBoolean13) {
			this.aBoolean13 = false;
			throw new IOException();
		}
		if (this.aByteArray7 == null) {
			this.aByteArray7 = new byte[5000];
		}
		synchronized (this) {
			for (@Pc(38) int local38 = 0; local38 < arg0; local38++) {
				this.aByteArray7[this.anInt324] = arg1[local38];
				this.anInt324 = (this.anInt324 + 1) % 5000;
				if ((this.anInt318 + 4900) % 5000 == this.anInt324) {
					throw new IOException();
				}
			}
			if (this.aClass19_1 == null) {
				this.aClass19_1 = this.aClass12_1.method324(this, 3);
			}
			this.notifyAll();
		}
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "([BIII)V")
	public void method261(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) throws IOException {
		if (this.aBoolean12) {
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

	@OriginalMember(owner = "client!ca", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			while (true) {
				label80: {
					@Pc(40) int local40;
					@Pc(28) int local28;
					synchronized (this) {
						if (this.anInt324 == this.anInt318) {
							if (this.aBoolean12) {
								break label80;
							}
							try {
								this.wait();
							} catch (@Pc(24) InterruptedException local24) {
							}
						}
						local28 = this.anInt318;
						if (this.anInt324 >= this.anInt318) {
							local40 = this.anInt324 - this.anInt318;
						} else {
							local40 = 5000 - this.anInt318;
						}
					}
					if (local40 <= 0) {
						continue;
					}
					try {
						this.anOutputStream1.write(this.aByteArray7, local28, local40);
					} catch (@Pc(65) IOException local65) {
						this.aBoolean13 = true;
					}
					this.anInt318 = (this.anInt318 + local40) % 5000;
					try {
						if (this.anInt318 == this.anInt324) {
							this.anOutputStream1.flush();
						}
					} catch (@Pc(86) IOException local86) {
						this.aBoolean13 = true;
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
				} catch (@Pc(110) IOException local110) {
				}
				this.aByteArray7 = null;
				break;
			}
		} catch (@Pc(115) Exception local115) {
			Static108.method2075(local115, null);
		}
	}
}
