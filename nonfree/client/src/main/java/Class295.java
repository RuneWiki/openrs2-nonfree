import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qda")
public final class Class295 implements Runnable {

	@OriginalMember(owner = "client!qda", name = "r", descriptor = "[B")
	private byte[] aByteArray85;

	@OriginalMember(owner = "client!qda", name = "u", descriptor = "Lclient!vn;")
	private Class380 aClass380_6;

	@OriginalMember(owner = "client!qda", name = "A", descriptor = "I")
	private int anInt8223 = 0;

	@OriginalMember(owner = "client!qda", name = "z", descriptor = "Z")
	private boolean aBoolean622 = false;

	@OriginalMember(owner = "client!qda", name = "e", descriptor = "Z")
	private boolean aBoolean621 = false;

	@OriginalMember(owner = "client!qda", name = "j", descriptor = "I")
	private int anInt8234 = 0;

	@OriginalMember(owner = "client!qda", name = "s", descriptor = "Lclient!ft;")
	private final Class122 aClass122_30;

	@OriginalMember(owner = "client!qda", name = "w", descriptor = "Ljava/net/Socket;")
	private final Socket aSocket1;

	@OriginalMember(owner = "client!qda", name = "B", descriptor = "Ljava/io/InputStream;")
	private InputStream anInputStream2;

	@OriginalMember(owner = "client!qda", name = "d", descriptor = "Ljava/io/OutputStream;")
	private OutputStream anOutputStream2;

	@OriginalMember(owner = "client!qda", name = "t", descriptor = "I")
	private final int anInt8224;

	@OriginalMember(owner = "client!qda", name = "<init>", descriptor = "(Ljava/net/Socket;Lclient!ft;I)V")
	public Class295(@OriginalArg(0) Socket arg0, @OriginalArg(1) Class122 arg1, @OriginalArg(2) int arg2) throws IOException {
		this.aClass122_30 = arg1;
		this.aSocket1 = arg0;
		this.aSocket1.setSoTimeout(30000);
		this.aSocket1.setTcpNoDelay(true);
		this.anInputStream2 = this.aSocket1.getInputStream();
		this.anOutputStream2 = this.aSocket1.getOutputStream();
		this.anInt8224 = arg2;
	}

	@OriginalMember(owner = "client!qda", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			while (true) {
				label80: {
					@Pc(39) int local39;
					@Pc(24) int local24;
					synchronized (this) {
						if (this.anInt8223 == this.anInt8234) {
							if (this.aBoolean622) {
								break label80;
							}
							try {
								this.wait();
							} catch (@Pc(20) InterruptedException local20) {
							}
						}
						local24 = this.anInt8223;
						if (this.anInt8234 >= this.anInt8223) {
							local39 = this.anInt8234 - this.anInt8223;
						} else {
							local39 = this.anInt8224 - this.anInt8223;
						}
					}
					if (local39 <= 0) {
						continue;
					}
					try {
						this.anOutputStream2.write(this.aByteArray85, local24, local39);
					} catch (@Pc(67) IOException local67) {
						this.aBoolean621 = true;
					}
					this.anInt8223 = (this.anInt8223 + local39) % this.anInt8224;
					try {
						if (this.anInt8234 == this.anInt8223) {
							this.anOutputStream2.flush();
						}
					} catch (@Pc(93) IOException local93) {
						this.aBoolean621 = true;
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
				} catch (@Pc(121) IOException local121) {
				}
				this.aByteArray85 = null;
				break;
			}
		} catch (@Pc(126) Exception local126) {
			Static550.method7785(local126, (String) null);
		}
	}

	@OriginalMember(owner = "client!qda", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		this.method7199();
	}

	@OriginalMember(owner = "client!qda", name = "b", descriptor = "(I)V")
	public void method7191() throws IOException {
		if (!this.aBoolean622 && this.aBoolean621) {
			this.aBoolean621 = false;
			throw new IOException();
		}
	}

	@OriginalMember(owner = "client!qda", name = "a", descriptor = "(III[B)V")
	public void method7192(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) throws IOException {
		if (this.aBoolean622) {
			return;
		}
		while (arg0 > 0) {
			@Pc(27) int local27 = this.anInputStream2.read(arg2, arg1, arg0);
			if (local27 <= 0) {
				throw new EOFException();
			}
			arg0 -= local27;
			arg1 += local27;
		}
	}

	@OriginalMember(owner = "client!qda", name = "b", descriptor = "(B)V")
	public void method7193() {
		if (!this.aBoolean622) {
			this.anInputStream2 = new InputStream_Sub2();
			this.anOutputStream2 = new OutputStream_Sub1();
		}
	}

	@OriginalMember(owner = "client!qda", name = "a", descriptor = "(Z)I")
	public int method7195() throws IOException {
		return this.aBoolean622 ? 0 : this.anInputStream2.read();
	}

	@OriginalMember(owner = "client!qda", name = "a", descriptor = "(I)I")
	public int method7196() throws IOException {
		return this.aBoolean622 ? 0 : this.anInputStream2.available();
	}

	@OriginalMember(owner = "client!qda", name = "a", descriptor = "(BII[B)V")
	public void method7198(@OriginalArg(1) int arg0, @OriginalArg(3) byte[] arg1) throws IOException {
		if (this.aBoolean622) {
			return;
		}
		if (this.aBoolean621) {
			this.aBoolean621 = false;
			throw new IOException();
		}
		if (this.aByteArray85 == null) {
			this.aByteArray85 = new byte[this.anInt8224];
		}
		synchronized (this) {
			for (@Pc(37) int local37 = 0; local37 < arg0; local37++) {
				this.aByteArray85[this.anInt8234] = arg1[local37];
				this.anInt8234 = (this.anInt8234 + 1) % this.anInt8224;
				if (this.anInt8234 == (this.anInt8223 + this.anInt8224 - 100) % this.anInt8224) {
					throw new IOException();
				}
			}
			if (this.aClass380_6 == null) {
				this.aClass380_6 = this.aClass122_30.method3352(this, 3);
			}
			this.notifyAll();
		}
	}

	@OriginalMember(owner = "client!qda", name = "d", descriptor = "(I)V")
	public void method7199() {
		if (this.aBoolean622) {
			return;
		}
		synchronized (this) {
			this.aBoolean622 = true;
			this.notifyAll();
		}
		if (this.aClass380_6 != null) {
			while (this.aClass380_6.anInt10067 == 0) {
				Static255.method4444(1L);
			}
			if (this.aClass380_6.anInt10067 == 1) {
				try {
					((Thread) this.aClass380_6.anObject25).join();
				} catch (@Pc(61) InterruptedException local61) {
				}
			}
		}
		this.aClass380_6 = null;
	}
}
