import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ua")
public final class Class310 implements Runnable {

	@OriginalMember(owner = "client!ua", name = "l", descriptor = "Lclient!sba;")
	private Class280 aClass280_8;

	@OriginalMember(owner = "client!ua", name = "x", descriptor = "[B")
	private byte[] aByteArray115;

	@OriginalMember(owner = "client!ua", name = "t", descriptor = "Z")
	private boolean aBoolean676 = false;

	@OriginalMember(owner = "client!ua", name = "r", descriptor = "Z")
	private boolean aBoolean675 = false;

	@OriginalMember(owner = "client!ua", name = "b", descriptor = "I")
	private int anInt8953 = 0;

	@OriginalMember(owner = "client!ua", name = "m", descriptor = "I")
	private int anInt8960 = 0;

	@OriginalMember(owner = "client!ua", name = "k", descriptor = "Lclient!pe;")
	private final Class246 aClass246_7;

	@OriginalMember(owner = "client!ua", name = "p", descriptor = "Ljava/net/Socket;")
	private final Socket aSocket2;

	@OriginalMember(owner = "client!ua", name = "e", descriptor = "Ljava/io/InputStream;")
	private InputStream anInputStream2;

	@OriginalMember(owner = "client!ua", name = "n", descriptor = "Ljava/io/OutputStream;")
	private OutputStream anOutputStream2;

	@OriginalMember(owner = "client!ua", name = "<init>", descriptor = "(Ljava/net/Socket;Lclient!pe;)V")
	public Class310(@OriginalArg(0) Socket arg0, @OriginalArg(1) Class246 arg1) throws IOException {
		this.aClass246_7 = arg1;
		this.aSocket2 = arg0;
		this.aSocket2.setSoTimeout(30000);
		this.aSocket2.setTcpNoDelay(true);
		this.anInputStream2 = this.aSocket2.getInputStream();
		this.anOutputStream2 = this.aSocket2.getOutputStream();
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(I)V")
	public void method7511() throws IOException {
		if (!this.aBoolean676 && this.aBoolean675) {
			this.aBoolean675 = false;
			throw new IOException();
		}
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(I[BII)V")
	public void method7512(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(3) int arg2) throws IOException {
		if (this.aBoolean676) {
			return;
		}
		while (arg0 > 0) {
			@Pc(14) int local14 = this.anInputStream2.read(arg1, arg2, arg0);
			if (local14 <= 0) {
				throw new EOFException();
			}
			arg0 -= local14;
			arg2 += local14;
		}
	}

	@OriginalMember(owner = "client!ua", name = "b", descriptor = "(I)V")
	public void method7513() {
		if (this.aBoolean676) {
			return;
		}
		synchronized (this) {
			this.aBoolean676 = true;
			this.notifyAll();
		}
		if (this.aClass280_8 != null) {
			while (this.aClass280_8.anInt8467 == 0) {
				Static566.method8004(1L);
			}
			if (this.aClass280_8.anInt8467 == 1) {
				try {
					((Thread) this.aClass280_8.anObject16).join();
				} catch (@Pc(56) InterruptedException local56) {
				}
			}
		}
		this.aClass280_8 = null;
	}

	@OriginalMember(owner = "client!ua", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		this.method7513();
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(B)I")
	public int method7516() throws IOException {
		return this.aBoolean676 ? 0 : this.anInputStream2.read();
	}

	@OriginalMember(owner = "client!ua", name = "b", descriptor = "(B)I")
	public int method7517() throws IOException {
		return this.aBoolean676 ? 0 : this.anInputStream2.available();
	}

	@OriginalMember(owner = "client!ua", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			while (true) {
				label77: {
					@Pc(43) int local43;
					@Pc(28) int local28;
					synchronized (this) {
						if (this.anInt8953 == this.anInt8960) {
							if (this.aBoolean676) {
								break label77;
							}
							try {
								this.wait();
							} catch (@Pc(24) InterruptedException local24) {
							}
						}
						local28 = this.anInt8953;
						if (this.anInt8960 >= this.anInt8953) {
							local43 = this.anInt8960 - this.anInt8953;
						} else {
							local43 = 5000 - this.anInt8953;
						}
					}
					if (local43 <= 0) {
						continue;
					}
					try {
						this.anOutputStream2.write(this.aByteArray115, local28, local43);
					} catch (@Pc(71) IOException local71) {
						this.aBoolean675 = true;
					}
					this.anInt8953 = (this.anInt8953 + local43) % 5000;
					try {
						if (this.anInt8953 == this.anInt8960) {
							this.anOutputStream2.flush();
						}
					} catch (@Pc(92) IOException local92) {
						this.aBoolean675 = true;
					}
					continue;
				}
				try {
					if (this.anInputStream2 != null) {
						this.anInputStream2.close();
					}
					if (this.anOutputStream2 != null) {
						this.anOutputStream2.close();
					}
					if (this.aSocket2 != null) {
						this.aSocket2.close();
					}
				} catch (@Pc(116) IOException local116) {
				}
				this.aByteArray115 = null;
				return;
			}
		} catch (@Pc(121) Exception local121) {
			Static5.method211(local121, null);
		}
	}

	@OriginalMember(owner = "client!ua", name = "c", descriptor = "(B)V")
	public void method7518() {
		if (!this.aBoolean676) {
			this.anInputStream2 = new InputStream_Sub1();
			this.anOutputStream2 = new OutputStream_Sub2();
		}
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "([BIII)V")
	public void method7519(@OriginalArg(0) byte[] arg0, @OriginalArg(3) int arg1) throws IOException {
		if (this.aBoolean676) {
			return;
		}
		if (this.aBoolean675) {
			this.aBoolean675 = false;
			throw new IOException();
		}
		if (this.aByteArray115 == null) {
			this.aByteArray115 = new byte[5000];
		}
		synchronized (this) {
			for (@Pc(32) int local32 = 0; local32 < arg1; local32++) {
				this.aByteArray115[this.anInt8960] = arg0[local32];
				this.anInt8960 = (this.anInt8960 + 1) % 5000;
				if ((this.anInt8953 + 4900) % 5000 == this.anInt8960) {
					throw new IOException();
				}
			}
			if (this.aClass280_8 == null) {
				this.aClass280_8 = this.aClass246_7.method6134(this, 3);
			}
			this.notifyAll();
		}
	}
}
