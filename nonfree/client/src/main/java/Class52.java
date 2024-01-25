import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cga")
public final class Class52 implements Runnable {

	@OriginalMember(owner = "client!cga", name = "k", descriptor = "Lclient!oaa;")
	private Class224 aClass224_2;

	@OriginalMember(owner = "client!cga", name = "z", descriptor = "[B")
	private byte[] aByteArray6;

	@OriginalMember(owner = "client!cga", name = "g", descriptor = "Z")
	private boolean aBoolean82 = false;

	@OriginalMember(owner = "client!cga", name = "h", descriptor = "I")
	private int anInt1168 = 0;

	@OriginalMember(owner = "client!cga", name = "p", descriptor = "Z")
	private boolean aBoolean83 = false;

	@OriginalMember(owner = "client!cga", name = "c", descriptor = "I")
	private int anInt1165 = 0;

	@OriginalMember(owner = "client!cga", name = "u", descriptor = "Ljava/net/Socket;")
	private final Socket aSocket2;

	@OriginalMember(owner = "client!cga", name = "f", descriptor = "Lclient!tt;")
	private final Class313 aClass313_11;

	@OriginalMember(owner = "client!cga", name = "n", descriptor = "Ljava/io/InputStream;")
	private InputStream anInputStream1;

	@OriginalMember(owner = "client!cga", name = "a", descriptor = "Ljava/io/OutputStream;")
	private OutputStream anOutputStream2;

	@OriginalMember(owner = "client!cga", name = "<init>", descriptor = "(Ljava/net/Socket;Lclient!tt;)V")
	public Class52(@OriginalArg(0) Socket arg0, @OriginalArg(1) Class313 arg1) throws IOException {
		this.aSocket2 = arg0;
		this.aClass313_11 = arg1;
		this.aSocket2.setSoTimeout(30000);
		this.aSocket2.setTcpNoDelay(true);
		this.anInputStream1 = this.aSocket2.getInputStream();
		this.anOutputStream2 = this.aSocket2.getOutputStream();
	}

	@OriginalMember(owner = "client!cga", name = "a", descriptor = "(B)I")
	public int method968() throws IOException {
		return this.aBoolean83 ? 0 : this.anInputStream1.available();
	}

	@OriginalMember(owner = "client!cga", name = "a", descriptor = "(I[BII)V")
	public void method970(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) throws IOException {
		if (this.aBoolean83) {
			return;
		}
		while (arg2 > 0) {
			@Pc(18) int local18 = this.anInputStream1.read(arg1, arg0, arg2);
			if (local18 <= 0) {
				throw new EOFException();
			}
			arg2 -= local18;
			arg0 += local18;
		}
	}

	@OriginalMember(owner = "client!cga", name = "a", descriptor = "(I)V")
	public void method971() {
		if (this.aBoolean83) {
			return;
		}
		synchronized (this) {
			this.aBoolean83 = true;
			this.notifyAll();
		}
		if (this.aClass224_2 != null) {
			while (this.aClass224_2.anInt6632 == 0) {
				Static183.method3079(1L);
			}
			if (this.aClass224_2.anInt6632 == 1) {
				try {
					((Thread) this.aClass224_2.anObject14).join();
				} catch (@Pc(56) InterruptedException local56) {
				}
			}
		}
		this.aClass224_2 = null;
	}

	@OriginalMember(owner = "client!cga", name = "a", descriptor = "(Z)V")
	public void method972() throws IOException {
		if (!this.aBoolean83 && this.aBoolean82) {
			this.aBoolean82 = false;
			throw new IOException();
		}
	}

	@OriginalMember(owner = "client!cga", name = "a", descriptor = "(III[B)V")
	public void method973(@OriginalArg(0) int arg0, @OriginalArg(3) byte[] arg1) throws IOException {
		if (this.aBoolean83) {
			return;
		}
		if (this.aBoolean82) {
			this.aBoolean82 = false;
			throw new IOException();
		}
		if (this.aByteArray6 == null) {
			this.aByteArray6 = new byte[5000];
		}
		synchronized (this) {
			for (@Pc(32) int local32 = 0; local32 < arg0; local32++) {
				this.aByteArray6[this.anInt1168] = arg1[local32];
				this.anInt1168 = (this.anInt1168 + 1) % 5000;
				if ((this.anInt1165 + 4900) % 5000 == this.anInt1168) {
					throw new IOException();
				}
			}
			if (this.aClass224_2 == null) {
				this.aClass224_2 = this.aClass313_11.method6991(3, this);
			}
			this.notifyAll();
		}
	}

	@OriginalMember(owner = "client!cga", name = "b", descriptor = "(Z)V")
	public void method975() {
		if (!this.aBoolean83) {
			this.anInputStream1 = new InputStream_Sub2();
			this.anOutputStream2 = new OutputStream_Sub2();
		}
	}

	@OriginalMember(owner = "client!cga", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			while (true) {
				label77: {
					@Pc(43) int local43;
					@Pc(32) int local32;
					synchronized (this) {
						if (this.anInt1165 == this.anInt1168) {
							if (this.aBoolean83) {
								break label77;
							}
							try {
								this.wait();
							} catch (@Pc(28) InterruptedException local28) {
							}
						}
						local32 = this.anInt1165;
						if (this.anInt1168 < this.anInt1165) {
							local43 = 5000 - this.anInt1165;
						} else {
							local43 = this.anInt1168 - this.anInt1165;
						}
					}
					if (local43 <= 0) {
						continue;
					}
					try {
						this.anOutputStream2.write(this.aByteArray6, local32, local43);
					} catch (@Pc(69) IOException local69) {
						this.aBoolean82 = true;
					}
					this.anInt1165 = (this.anInt1165 + local43) % 5000;
					try {
						if (this.anInt1165 == this.anInt1168) {
							this.anOutputStream2.flush();
						}
					} catch (@Pc(94) IOException local94) {
						this.aBoolean82 = true;
					}
					continue;
				}
				try {
					if (this.anInputStream1 != null) {
						this.anInputStream1.close();
					}
					if (this.anOutputStream2 != null) {
						this.anOutputStream2.close();
					}
					if (this.aSocket2 != null) {
						this.aSocket2.close();
					}
				} catch (@Pc(118) IOException local118) {
				}
				this.aByteArray6 = null;
				return;
			}
		} catch (@Pc(123) Exception local123) {
			Static214.method5693(null, local123);
		}
	}

	@OriginalMember(owner = "client!cga", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		this.method971();
	}

	@OriginalMember(owner = "client!cga", name = "b", descriptor = "(I)I")
	public int method976() throws IOException {
		return this.aBoolean83 ? 0 : this.anInputStream1.read();
	}
}
