import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kc")
public final class Class130 implements Runnable {

	@OriginalMember(owner = "client!kc", name = "j", descriptor = "[B")
	private byte[] aByteArray60;

	@OriginalMember(owner = "client!kc", name = "k", descriptor = "Lclient!iu;")
	private Class112 aClass112_5;

	@OriginalMember(owner = "client!kc", name = "n", descriptor = "I")
	private int anInt3271 = 0;

	@OriginalMember(owner = "client!kc", name = "e", descriptor = "I")
	private int anInt3267 = 0;

	@OriginalMember(owner = "client!kc", name = "t", descriptor = "Z")
	private boolean aBoolean291 = false;

	@OriginalMember(owner = "client!kc", name = "i", descriptor = "Z")
	private boolean aBoolean289 = false;

	@OriginalMember(owner = "client!kc", name = "A", descriptor = "Ljava/net/Socket;")
	private final Socket aSocket1;

	@OriginalMember(owner = "client!kc", name = "w", descriptor = "Lclient!ng;")
	private final Class162 aClass162_3;

	@OriginalMember(owner = "client!kc", name = "h", descriptor = "Ljava/io/InputStream;")
	private InputStream anInputStream1;

	@OriginalMember(owner = "client!kc", name = "m", descriptor = "Ljava/io/OutputStream;")
	private OutputStream anOutputStream1;

	@OriginalMember(owner = "client!kc", name = "<init>", descriptor = "(Ljava/net/Socket;Lclient!ng;)V")
	public Class130(@OriginalArg(0) Socket arg0, @OriginalArg(1) Class162 arg1) throws IOException {
		this.aSocket1 = arg0;
		this.aClass162_3 = arg1;
		this.aSocket1.setSoTimeout(30000);
		this.aSocket1.setTcpNoDelay(true);
		this.anInputStream1 = this.aSocket1.getInputStream();
		this.anOutputStream1 = this.aSocket1.getOutputStream();
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(I[BZI)V")
	public void method2666(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(3) int arg2) throws IOException {
		if (this.aBoolean291) {
			return;
		}
		while (arg0 > 0) {
			@Pc(14) int local14 = this.anInputStream1.read(arg1, arg2, arg0);
			if (local14 <= 0) {
				throw new EOFException();
			}
			arg2 += local14;
			arg0 -= local14;
		}
	}

	@OriginalMember(owner = "client!kc", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			while (true) {
				label80: {
					@Pc(40) int local40;
					@Pc(24) int local24;
					synchronized (this) {
						if (this.anInt3267 == this.anInt3271) {
							if (this.aBoolean291) {
								break label80;
							}
							try {
								this.wait();
							} catch (@Pc(20) InterruptedException local20) {
							}
						}
						local24 = this.anInt3271;
						if (this.anInt3271 <= this.anInt3267) {
							local40 = this.anInt3267 - this.anInt3271;
						} else {
							local40 = 5000 - this.anInt3271;
						}
					}
					if (local40 <= 0) {
						continue;
					}
					try {
						this.anOutputStream1.write(this.aByteArray60, local24, local40);
					} catch (@Pc(64) IOException local64) {
						this.aBoolean289 = true;
					}
					this.anInt3271 = (local40 + this.anInt3271) % 5000;
					try {
						if (this.anInt3267 == this.anInt3271) {
							this.anOutputStream1.flush();
						}
					} catch (@Pc(89) IOException local89) {
						this.aBoolean289 = true;
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
				this.aByteArray60 = null;
				break;
			}
		} catch (@Pc(118) Exception local118) {
			Static62.method1006(local118, null);
		}
	}

	@OriginalMember(owner = "client!kc", name = "b", descriptor = "(B)V")
	public void method2668() {
		if (this.aBoolean291) {
			return;
		}
		synchronized (this) {
			this.aBoolean291 = true;
			this.notifyAll();
		}
		if (this.aClass112_5 != null) {
			while (this.aClass112_5.anInt2969 == 0) {
				Static57.method5056(1L);
			}
			if (this.aClass112_5.anInt2969 == 1) {
				try {
					((Thread) this.aClass112_5.anObject5).join();
				} catch (@Pc(54) InterruptedException local54) {
				}
			}
		}
		this.aClass112_5 = null;
	}

	@OriginalMember(owner = "client!kc", name = "b", descriptor = "(I)V")
	public void method2669() throws IOException {
		if (!this.aBoolean291 && this.aBoolean289) {
			this.aBoolean289 = false;
			throw new IOException();
		}
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(III[B)V")
	public void method2670(@OriginalArg(2) int arg0, @OriginalArg(3) byte[] arg1) throws IOException {
		if (this.aBoolean291) {
			return;
		}
		if (this.aBoolean289) {
			this.aBoolean289 = false;
			throw new IOException();
		}
		if (this.aByteArray60 == null) {
			this.aByteArray60 = new byte[5000];
		}
		synchronized (this) {
			for (@Pc(36) int local36 = 0; local36 < arg0; local36++) {
				this.aByteArray60[this.anInt3267] = arg1[local36];
				this.anInt3267 = (this.anInt3267 + 1) % 5000;
				if (this.anInt3267 == (this.anInt3271 + 4900) % 5000) {
					throw new IOException();
				}
			}
			if (this.aClass112_5 == null) {
				this.aClass112_5 = this.aClass162_3.method3278(3, this);
			}
			this.notifyAll();
		}
	}

	@OriginalMember(owner = "client!kc", name = "c", descriptor = "(B)I")
	public int method2672() throws IOException {
		return this.aBoolean291 ? 0 : this.anInputStream1.read();
	}

	@OriginalMember(owner = "client!kc", name = "d", descriptor = "(B)V")
	public void method2674() {
		if (!this.aBoolean291) {
			this.anInputStream1 = new InputStream_Sub1();
			this.anOutputStream1 = new OutputStream_Sub1();
		}
	}

	@OriginalMember(owner = "client!kc", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		this.method2668();
	}

	@OriginalMember(owner = "client!kc", name = "e", descriptor = "(I)I")
	public int method2675() throws IOException {
		return this.aBoolean291 ? 0 : this.anInputStream1.available();
	}
}
