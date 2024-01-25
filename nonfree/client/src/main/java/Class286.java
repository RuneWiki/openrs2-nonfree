import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qw")
public final class Class286 implements Runnable {

	@OriginalMember(owner = "client!qw", name = "g", descriptor = "Lclient!av;")
	private Class26 aClass26_31;

	@OriginalMember(owner = "client!qw", name = "s", descriptor = "[B")
	private byte[] aByteArray76;

	@OriginalMember(owner = "client!qw", name = "c", descriptor = "Z")
	private boolean aBoolean610 = false;

	@OriginalMember(owner = "client!qw", name = "e", descriptor = "I")
	private int anInt8105 = 0;

	@OriginalMember(owner = "client!qw", name = "q", descriptor = "I")
	private int anInt8112 = 0;

	@OriginalMember(owner = "client!qw", name = "n", descriptor = "Z")
	private boolean aBoolean611 = false;

	@OriginalMember(owner = "client!qw", name = "A", descriptor = "Ljava/net/Socket;")
	private final Socket aSocket1;

	@OriginalMember(owner = "client!qw", name = "z", descriptor = "Lclient!vk;")
	private final Class359 aClass359_6;

	@OriginalMember(owner = "client!qw", name = "r", descriptor = "Ljava/io/InputStream;")
	private InputStream anInputStream2;

	@OriginalMember(owner = "client!qw", name = "l", descriptor = "Ljava/io/OutputStream;")
	private OutputStream anOutputStream2;

	@OriginalMember(owner = "client!qw", name = "y", descriptor = "I")
	private final int anInt8118;

	@OriginalMember(owner = "client!qw", name = "<init>", descriptor = "(Ljava/net/Socket;Lclient!vk;I)V")
	public Class286(@OriginalArg(0) Socket arg0, @OriginalArg(1) Class359 arg1, @OriginalArg(2) int arg2) throws IOException {
		this.aSocket1 = arg0;
		this.aClass359_6 = arg1;
		this.aSocket1.setSoTimeout(30000);
		this.aSocket1.setTcpNoDelay(true);
		this.anInputStream2 = this.aSocket1.getInputStream();
		this.anOutputStream2 = this.aSocket1.getOutputStream();
		this.anInt8118 = arg2;
	}

	@OriginalMember(owner = "client!qw", name = "a", descriptor = "(III[B)V")
	public void method6799(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) throws IOException {
		if (this.aBoolean611) {
			return;
		}
		while (arg0 > 0) {
			@Pc(18) int local18 = this.anInputStream2.read(arg2, arg1, arg0);
			if (local18 <= 0) {
				throw new EOFException();
			}
			arg0 -= local18;
			arg1 += local18;
		}
	}

	@OriginalMember(owner = "client!qw", name = "a", descriptor = "(I)V")
	public void method6800() throws IOException {
		if (!this.aBoolean611 && this.aBoolean610) {
			this.aBoolean610 = false;
			throw new IOException();
		}
	}

	@OriginalMember(owner = "client!qw", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			while (true) {
				label77: {
					@Pc(44) int local44;
					@Pc(32) int local32;
					synchronized (this) {
						if (this.anInt8105 == this.anInt8112) {
							if (this.aBoolean611) {
								break label77;
							}
							try {
								this.wait();
							} catch (@Pc(28) InterruptedException local28) {
							}
						}
						local32 = this.anInt8105;
						if (this.anInt8112 >= this.anInt8105) {
							local44 = this.anInt8112 - this.anInt8105;
						} else {
							local44 = this.anInt8118 - this.anInt8105;
						}
					}
					if (local44 <= 0) {
						continue;
					}
					try {
						this.anOutputStream2.write(this.aByteArray76, local32, local44);
					} catch (@Pc(72) IOException local72) {
						this.aBoolean610 = true;
					}
					this.anInt8105 = (local44 + this.anInt8105) % this.anInt8118;
					try {
						if (this.anInt8112 == this.anInt8105) {
							this.anOutputStream2.flush();
						}
					} catch (@Pc(98) IOException local98) {
						this.aBoolean610 = true;
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
					if (this.aSocket1 != null) {
						this.aSocket1.close();
					}
				} catch (@Pc(122) IOException local122) {
				}
				this.aByteArray76 = null;
				return;
			}
		} catch (@Pc(127) Exception local127) {
			Static420.method6396(null, local127);
		}
	}

	@OriginalMember(owner = "client!qw", name = "b", descriptor = "(I)V")
	public void method6801() {
		if (!this.aBoolean611) {
			this.anInputStream2 = new InputStream_Sub2();
			this.anOutputStream2 = new OutputStream_Sub1();
		}
	}

	@OriginalMember(owner = "client!qw", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		this.method6807();
	}

	@OriginalMember(owner = "client!qw", name = "a", descriptor = "(ZII[B)V")
	public void method6803(@OriginalArg(1) int arg0, @OriginalArg(3) byte[] arg1) throws IOException {
		if (this.aBoolean611) {
			return;
		}
		if (this.aBoolean610) {
			this.aBoolean610 = false;
			throw new IOException();
		}
		if (this.aByteArray76 == null) {
			this.aByteArray76 = new byte[this.anInt8118];
		}
		synchronized (this) {
			for (@Pc(38) int local38 = 0; local38 < arg0; local38++) {
				this.aByteArray76[this.anInt8112] = arg1[local38];
				this.anInt8112 = (this.anInt8112 + 1) % this.anInt8118;
				if (this.anInt8112 == (this.anInt8118 + this.anInt8105 - 100) % this.anInt8118) {
					throw new IOException();
				}
			}
			if (this.aClass26_31 == null) {
				this.aClass26_31 = this.aClass359_6.method8278(3, this);
			}
			this.notifyAll();
		}
	}

	@OriginalMember(owner = "client!qw", name = "c", descriptor = "(I)I")
	public int method6805() throws IOException {
		return this.aBoolean611 ? 0 : this.anInputStream2.read();
	}

	@OriginalMember(owner = "client!qw", name = "a", descriptor = "(B)I")
	public int method6806() throws IOException {
		return this.aBoolean611 ? 0 : this.anInputStream2.available();
	}

	@OriginalMember(owner = "client!qw", name = "b", descriptor = "(B)V")
	public void method6807() {
		if (this.aBoolean611) {
			return;
		}
		synchronized (this) {
			this.aBoolean611 = true;
			this.notifyAll();
		}
		if (this.aClass26_31 != null) {
			while (this.aClass26_31.anInt762 == 0) {
				Static57.method1062(1L);
			}
			if (this.aClass26_31.anInt762 == 1) {
				try {
					((Thread) this.aClass26_31.anObject3).join();
				} catch (@Pc(54) InterruptedException local54) {
				}
			}
		}
		this.aClass26_31 = null;
	}
}
