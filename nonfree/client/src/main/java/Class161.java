import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mr")
public final class Class161 implements Runnable {

	@OriginalMember(owner = "client!mr", name = "b", descriptor = "[B")
	private byte[] aByteArray59;

	@OriginalMember(owner = "client!mr", name = "x", descriptor = "Lclient!gu;")
	private Class100 aClass100_8;

	@OriginalMember(owner = "client!mr", name = "a", descriptor = "Z")
	private boolean aBoolean312 = false;

	@OriginalMember(owner = "client!mr", name = "c", descriptor = "I")
	private int anInt4580 = 0;

	@OriginalMember(owner = "client!mr", name = "m", descriptor = "I")
	private int anInt4587 = 0;

	@OriginalMember(owner = "client!mr", name = "e", descriptor = "Z")
	private boolean aBoolean313 = false;

	@OriginalMember(owner = "client!mr", name = "p", descriptor = "Lclient!kj;")
	private final Class138 aClass138_3;

	@OriginalMember(owner = "client!mr", name = "v", descriptor = "Ljava/net/Socket;")
	private final Socket aSocket1;

	@OriginalMember(owner = "client!mr", name = "l", descriptor = "Ljava/io/InputStream;")
	private InputStream anInputStream1;

	@OriginalMember(owner = "client!mr", name = "s", descriptor = "Ljava/io/OutputStream;")
	private OutputStream anOutputStream1;

	@OriginalMember(owner = "client!mr", name = "<init>", descriptor = "(Ljava/net/Socket;Lclient!kj;)V")
	public Class161(@OriginalArg(0) Socket arg0, @OriginalArg(1) Class138 arg1) throws IOException {
		this.aClass138_3 = arg1;
		this.aSocket1 = arg0;
		this.aSocket1.setSoTimeout(30000);
		this.aSocket1.setTcpNoDelay(true);
		this.anInputStream1 = this.aSocket1.getInputStream();
		this.anOutputStream1 = this.aSocket1.getOutputStream();
	}

	@OriginalMember(owner = "client!mr", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		this.method3764();
	}

	@OriginalMember(owner = "client!mr", name = "a", descriptor = "(I)V")
	public void method3761() throws IOException {
		if (!this.aBoolean312 && this.aBoolean313) {
			this.aBoolean313 = false;
			throw new IOException();
		}
	}

	@OriginalMember(owner = "client!mr", name = "b", descriptor = "(I)V")
	public void method3762() {
		if (!this.aBoolean312) {
			this.anInputStream1 = new InputStream_Sub1();
			this.anOutputStream1 = new OutputStream_Sub1();
		}
	}

	@OriginalMember(owner = "client!mr", name = "a", descriptor = "([BIII)V")
	public void method3763(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) throws IOException {
		if (this.aBoolean312) {
			return;
		}
		if (this.aBoolean313) {
			this.aBoolean313 = false;
			throw new IOException();
		}
		if (this.aByteArray59 == null) {
			this.aByteArray59 = new byte[5000];
		}
		synchronized (this) {
			for (@Pc(37) int local37 = 0; local37 < arg1; local37++) {
				this.aByteArray59[this.anInt4580] = arg0[local37];
				this.anInt4580 = (this.anInt4580 + 1) % 5000;
				if ((this.anInt4587 + 4900) % 5000 == this.anInt4580) {
					throw new IOException();
				}
			}
			if (this.aClass100_8 == null) {
				this.aClass100_8 = this.aClass138_3.method3220(3, this);
			}
			this.notifyAll();
		}
	}

	@OriginalMember(owner = "client!mr", name = "c", descriptor = "(I)V")
	public void method3764() {
		if (this.aBoolean312) {
			return;
		}
		synchronized (this) {
			this.aBoolean312 = true;
			this.notifyAll();
		}
		if (this.aClass100_8 != null) {
			while (this.aClass100_8.anInt2365 == 0) {
				Static67.method1189(1L);
			}
			if (this.aClass100_8.anInt2365 == 1) {
				try {
					((Thread) this.aClass100_8.anObject4).join();
				} catch (@Pc(55) InterruptedException local55) {
				}
			}
		}
		this.aClass100_8 = null;
	}

	@OriginalMember(owner = "client!mr", name = "a", descriptor = "(B)I")
	public int method3765() throws IOException {
		return this.aBoolean312 ? 0 : this.anInputStream1.available();
	}

	@OriginalMember(owner = "client!mr", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			while (true) {
				label80: {
					@Pc(33) int local33;
					@Pc(44) int local44;
					synchronized (this) {
						if (this.anInt4587 == this.anInt4580) {
							if (this.aBoolean312) {
								break label80;
							}
							try {
								this.wait();
							} catch (@Pc(20) InterruptedException local20) {
							}
						}
						if (this.anInt4580 >= this.anInt4587) {
							local33 = this.anInt4580 - this.anInt4587;
						} else {
							local33 = 5000 - this.anInt4587;
						}
						local44 = this.anInt4587;
					}
					if (local33 <= 0) {
						continue;
					}
					try {
						this.anOutputStream1.write(this.aByteArray59, local44, local33);
					} catch (@Pc(64) IOException local64) {
						this.aBoolean313 = true;
					}
					this.anInt4587 = (this.anInt4587 + local33) % 5000;
					try {
						if (this.anInt4580 == this.anInt4587) {
							this.anOutputStream1.flush();
						}
					} catch (@Pc(89) IOException local89) {
						this.aBoolean313 = true;
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
				} catch (@Pc(113) IOException local113) {
				}
				this.aByteArray59 = null;
				break;
			}
		} catch (@Pc(118) Exception local118) {
			Static315.method4700(local118, null);
		}
	}

	@OriginalMember(owner = "client!mr", name = "a", descriptor = "(IZI[B)V")
	public void method3769(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) throws IOException {
		if (this.aBoolean312) {
			return;
		}
		while (arg0 > 0) {
			@Pc(14) int local14 = this.anInputStream1.read(arg2, arg1, arg0);
			if (local14 <= 0) {
				throw new EOFException();
			}
			arg0 -= local14;
			arg1 += local14;
		}
	}

	@OriginalMember(owner = "client!mr", name = "c", descriptor = "(B)I")
	public int method3770() throws IOException {
		return this.aBoolean312 ? 0 : this.anInputStream1.read();
	}
}
