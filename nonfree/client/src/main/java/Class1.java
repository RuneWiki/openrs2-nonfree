import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!a")
public final class Class1 implements Runnable {

	@OriginalMember(owner = "client!a", name = "e", descriptor = "[B")
	private byte[] aByteArray1;

	@OriginalMember(owner = "client!a", name = "q", descriptor = "Lclient!ca;")
	private Class14 aClass14_1;

	@OriginalMember(owner = "client!a", name = "d", descriptor = "I")
	private int anInt2 = 0;

	@OriginalMember(owner = "client!a", name = "o", descriptor = "Z")
	private boolean aBoolean1 = false;

	@OriginalMember(owner = "client!a", name = "u", descriptor = "Z")
	private boolean aBoolean2 = false;

	@OriginalMember(owner = "client!a", name = "s", descriptor = "I")
	private int anInt11 = 0;

	@OriginalMember(owner = "client!a", name = "l", descriptor = "Lclient!qd;")
	private final Class68 aClass68_1;

	@OriginalMember(owner = "client!a", name = "p", descriptor = "Ljava/net/Socket;")
	private final Socket aSocket1;

	@OriginalMember(owner = "client!a", name = "a", descriptor = "Ljava/io/InputStream;")
	private final InputStream anInputStream1;

	@OriginalMember(owner = "client!a", name = "j", descriptor = "Ljava/io/OutputStream;")
	private final OutputStream anOutputStream1;

	@OriginalMember(owner = "client!a", name = "<init>", descriptor = "(Ljava/net/Socket;Lclient!qd;)V")
	public Class1(@OriginalArg(0) Socket arg0, @OriginalArg(1) Class68 arg1) throws IOException {
		this.aClass68_1 = arg1;
		this.aSocket1 = arg0;
		this.aSocket1.setSoTimeout(30000);
		this.aSocket1.setTcpNoDelay(true);
		this.anInputStream1 = this.aSocket1.getInputStream();
		this.anOutputStream1 = this.aSocket1.getOutputStream();
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(I)I")
	public int method2() throws IOException {
		return this.aBoolean2 ? 0 : this.anInputStream1.read();
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "([BIII)V")
	public void method3(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) throws IOException {
		if (this.aBoolean2) {
			return;
		}
		while (arg1 > 0) {
			@Pc(20) int local20 = this.anInputStream1.read(arg0, arg2, arg1);
			if (local20 <= 0) {
				throw new EOFException();
			}
			arg2 += local20;
			arg1 -= local20;
		}
	}

	@OriginalMember(owner = "client!a", name = "b", descriptor = "(I)I")
	public int method4() throws IOException {
		return this.aBoolean2 ? 0 : this.anInputStream1.available();
	}

	@OriginalMember(owner = "client!a", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		this.method10();
	}

	@OriginalMember(owner = "client!a", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			while (true) {
				label80: {
					@Pc(36) int local36;
					@Pc(24) int local24;
					synchronized (this) {
						if (this.anInt2 == this.anInt11) {
							if (this.aBoolean2) {
								break label80;
							}
							try {
								this.wait();
							} catch (@Pc(20) InterruptedException local20) {
							}
						}
						local24 = this.anInt2;
						if (this.anInt11 >= this.anInt2) {
							local36 = this.anInt11 - this.anInt2;
						} else {
							local36 = 5000 - this.anInt2;
						}
					}
					if (local36 <= 0) {
						continue;
					}
					try {
						this.anOutputStream1.write(this.aByteArray1, local24, local36);
					} catch (@Pc(61) IOException local61) {
						this.aBoolean1 = true;
					}
					this.anInt2 = (local36 + this.anInt2) % 5000;
					try {
						if (this.anInt11 == this.anInt2) {
							this.anOutputStream1.flush();
						}
					} catch (@Pc(86) IOException local86) {
						this.aBoolean1 = true;
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
				this.aByteArray1 = null;
				break;
			}
		} catch (@Pc(115) Exception local115) {
			Static124.method2117(null, local115);
		}
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(I[BIB)V")
	public void method6(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1) throws IOException {
		if (this.aBoolean2) {
			return;
		}
		if (this.aBoolean1) {
			this.aBoolean1 = false;
			throw new IOException();
		}
		if (this.aByteArray1 == null) {
			this.aByteArray1 = new byte[5000];
		}
		synchronized (this) {
			for (@Pc(40) int local40 = 0; local40 < arg1; local40++) {
				this.aByteArray1[this.anInt11] = arg0[local40];
				this.anInt11 = (this.anInt11 + 1) % 5000;
				if (this.anInt11 == (this.anInt2 + 4900) % 5000) {
					throw new IOException();
				}
			}
			if (this.aClass14_1 == null) {
				this.aClass14_1 = this.aClass68_1.method2193(this, 3);
			}
			this.notifyAll();
		}
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(Z)V")
	public void method10() {
		if (this.aBoolean2) {
			return;
		}
		synchronized (this) {
			this.aBoolean2 = true;
			this.notifyAll();
		}
		if (this.aClass14_1 != null) {
			while (this.aClass14_1.anInt516 == 0) {
				Static35.method627(1L);
			}
			if (this.aClass14_1.anInt516 == 1) {
				try {
					((Thread) this.aClass14_1.anObject1).join();
				} catch (@Pc(50) InterruptedException local50) {
				}
			}
		}
		this.aClass14_1 = null;
	}
}
