import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qp")
public final class Class171 implements Runnable {

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "[B")
	private byte[] aByteArray82;

	@OriginalMember(owner = "client!qp", name = "r", descriptor = "Lclient!dj;")
	private Class51 aClass51_8;

	@OriginalMember(owner = "client!qp", name = "e", descriptor = "Z")
	private boolean aBoolean481 = false;

	@OriginalMember(owner = "client!qp", name = "n", descriptor = "I")
	private int anInt5432 = 0;

	@OriginalMember(owner = "client!qp", name = "m", descriptor = "Z")
	private boolean aBoolean482 = false;

	@OriginalMember(owner = "client!qp", name = "y", descriptor = "I")
	private int anInt5440 = 0;

	@OriginalMember(owner = "client!qp", name = "x", descriptor = "Lclient!lh;")
	private final Class120 aClass120_4;

	@OriginalMember(owner = "client!qp", name = "t", descriptor = "Ljava/net/Socket;")
	private final Socket aSocket1;

	@OriginalMember(owner = "client!qp", name = "j", descriptor = "Ljava/io/InputStream;")
	private InputStream anInputStream1;

	@OriginalMember(owner = "client!qp", name = "b", descriptor = "Ljava/io/OutputStream;")
	private OutputStream anOutputStream1;

	@OriginalMember(owner = "client!qp", name = "<init>", descriptor = "(Ljava/net/Socket;Lclient!lh;)V")
	public Class171(@OriginalArg(0) Socket arg0, @OriginalArg(1) Class120 arg1) throws IOException {
		this.aClass120_4 = arg1;
		this.aSocket1 = arg0;
		this.aSocket1.setSoTimeout(30000);
		this.aSocket1.setTcpNoDelay(true);
		this.anInputStream1 = this.aSocket1.getInputStream();
		this.anOutputStream1 = this.aSocket1.getOutputStream();
	}

	@OriginalMember(owner = "client!qp", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			while (true) {
				label80: {
					@Pc(34) int local34;
					@Pc(24) int local24;
					synchronized (this) {
						if (this.anInt5432 == this.anInt5440) {
							if (this.aBoolean481) {
								break label80;
							}
							try {
								this.wait();
							} catch (@Pc(20) InterruptedException local20) {
							}
						}
						local24 = this.anInt5432;
						if (this.anInt5432 > this.anInt5440) {
							local34 = 5000 - this.anInt5432;
						} else {
							local34 = this.anInt5440 - this.anInt5432;
						}
					}
					if (local34 <= 0) {
						continue;
					}
					try {
						this.anOutputStream1.write(this.aByteArray82, local24, local34);
					} catch (@Pc(62) IOException local62) {
						this.aBoolean482 = true;
					}
					this.anInt5432 = (this.anInt5432 + local34) % 5000;
					try {
						if (this.anInt5440 == this.anInt5432) {
							this.anOutputStream1.flush();
						}
					} catch (@Pc(87) IOException local87) {
						this.aBoolean482 = true;
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
				} catch (@Pc(111) IOException local111) {
				}
				this.aByteArray82 = null;
				break;
			}
		} catch (@Pc(116) Exception local116) {
			Static103.method2841(local116, null);
		}
	}

	@OriginalMember(owner = "client!qp", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		this.method4637();
	}

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "([BIII)V")
	public void method4628(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) throws IOException {
		if (this.aBoolean481) {
			return;
		}
		while (arg1 > 0) {
			@Pc(14) int local14 = this.anInputStream1.read(arg0, arg2, arg1);
			if (local14 <= 0) {
				throw new EOFException();
			}
			arg2 += local14;
			arg1 -= local14;
		}
	}

	@OriginalMember(owner = "client!qp", name = "b", descriptor = "(I)V")
	public void method4629() {
		if (!this.aBoolean481) {
			this.anInputStream1 = new InputStream_Sub1();
			this.anOutputStream1 = new OutputStream_Sub1();
		}
	}

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "(Z)V")
	public void method4634() throws IOException {
		if (!this.aBoolean481 && this.aBoolean482) {
			this.aBoolean482 = false;
			throw new IOException();
		}
	}

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "([BZII)V")
	public void method4636(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1) throws IOException {
		if (this.aBoolean481) {
			return;
		}
		if (this.aBoolean482) {
			this.aBoolean482 = false;
			throw new IOException();
		}
		if (this.aByteArray82 == null) {
			this.aByteArray82 = new byte[5000];
		}
		synchronized (this) {
			for (@Pc(43) int local43 = 0; local43 < arg1; local43++) {
				this.aByteArray82[this.anInt5440] = arg0[local43];
				this.anInt5440 = (this.anInt5440 + 1) % 5000;
				if ((this.anInt5432 + 4900) % 5000 == this.anInt5440) {
					throw new IOException();
				}
			}
			if (this.aClass51_8 == null) {
				this.aClass51_8 = this.aClass120_4.method3232(this, 3);
			}
			this.notifyAll();
		}
	}

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "(B)V")
	public void method4637() {
		if (this.aBoolean481) {
			return;
		}
		synchronized (this) {
			this.aBoolean481 = true;
			this.notifyAll();
		}
		if (this.aClass51_8 != null) {
			while (this.aClass51_8.anInt1229 == 0) {
				Static270.method5481(1L);
			}
			if (this.aClass51_8.anInt1229 == 1) {
				try {
					((Thread) this.aClass51_8.anObject1).join();
				} catch (@Pc(50) InterruptedException local50) {
				}
			}
		}
		this.aClass51_8 = null;
	}

	@OriginalMember(owner = "client!qp", name = "f", descriptor = "(I)I")
	public int method4638() throws IOException {
		return this.aBoolean481 ? 0 : this.anInputStream1.available();
	}

	@OriginalMember(owner = "client!qp", name = "g", descriptor = "(I)I")
	public int method4639() throws IOException {
		return this.aBoolean481 ? 0 : this.anInputStream1.read();
	}
}
