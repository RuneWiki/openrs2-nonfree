import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vj")
public final class Class367 implements Runnable {

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "Lclient!sq;")
	private Class319 aClass319_8;

	@OriginalMember(owner = "client!vj", name = "v", descriptor = "[B")
	private byte[] aByteArray104;

	@OriginalMember(owner = "client!vj", name = "b", descriptor = "I")
	private int anInt10087 = 0;

	@OriginalMember(owner = "client!vj", name = "g", descriptor = "Z")
	private boolean aBoolean728 = false;

	@OriginalMember(owner = "client!vj", name = "r", descriptor = "Z")
	private boolean aBoolean729 = false;

	@OriginalMember(owner = "client!vj", name = "q", descriptor = "I")
	private int anInt10097 = 0;

	@OriginalMember(owner = "client!vj", name = "s", descriptor = "Lclient!qg;")
	private final Class286 aClass286_5;

	@OriginalMember(owner = "client!vj", name = "j", descriptor = "Ljava/net/Socket;")
	private final Socket aSocket2;

	@OriginalMember(owner = "client!vj", name = "f", descriptor = "Ljava/io/InputStream;")
	private InputStream anInputStream2;

	@OriginalMember(owner = "client!vj", name = "o", descriptor = "Ljava/io/OutputStream;")
	private OutputStream anOutputStream2;

	@OriginalMember(owner = "client!vj", name = "m", descriptor = "I")
	private final int anInt10095;

	@OriginalMember(owner = "client!vj", name = "<init>", descriptor = "(Ljava/net/Socket;Lclient!qg;I)V")
	public Class367(@OriginalArg(0) Socket arg0, @OriginalArg(1) Class286 arg1, @OriginalArg(2) int arg2) throws IOException {
		this.aClass286_5 = arg1;
		this.aSocket2 = arg0;
		this.aSocket2.setSoTimeout(30000);
		this.aSocket2.setTcpNoDelay(true);
		this.anInputStream2 = this.aSocket2.getInputStream();
		this.anOutputStream2 = this.aSocket2.getOutputStream();
		this.anInt10095 = arg2;
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(II[BI)V")
	public void method8567(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1) throws IOException {
		if (this.aBoolean729) {
			return;
		}
		if (this.aBoolean728) {
			this.aBoolean728 = false;
			throw new IOException();
		}
		if (this.aByteArray104 == null) {
			this.aByteArray104 = new byte[this.anInt10095];
		}
		synchronized (this) {
			for (@Pc(31) int local31 = 0; local31 < arg0; local31++) {
				this.aByteArray104[this.anInt10087] = arg1[local31];
				this.anInt10087 = (this.anInt10087 + 1) % this.anInt10095;
				if ((this.anInt10097 + this.anInt10095 - 100) % this.anInt10095 == this.anInt10087) {
					throw new IOException();
				}
			}
			if (this.aClass319_8 == null) {
				this.aClass319_8 = this.aClass286_5.method6575(3, this);
			}
			this.notifyAll();
		}
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(I[BZI)V")
	public void method8568(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(3) int arg2) throws IOException {
		if (this.aBoolean729) {
			return;
		}
		while (arg2 > 0) {
			@Pc(20) int local20 = this.anInputStream2.read(arg1, arg0, arg2);
			if (local20 <= 0) {
				throw new EOFException();
			}
			arg0 += local20;
			arg2 -= local20;
		}
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(I)V")
	public void method8569() {
		if (this.aBoolean729) {
			return;
		}
		synchronized (this) {
			this.aBoolean729 = true;
			this.notifyAll();
		}
		if (this.aClass319_8 != null) {
			while (this.aClass319_8.anInt8562 == 0) {
				Static440.method6322(1L);
			}
			if (this.aClass319_8.anInt8562 == 1) {
				try {
					((Thread) this.aClass319_8.anObject19).join();
				} catch (@Pc(50) InterruptedException local50) {
				}
			}
		}
		this.aClass319_8 = null;
	}

	@OriginalMember(owner = "client!vj", name = "b", descriptor = "(I)I")
	public int method8570() throws IOException {
		return this.aBoolean729 ? 0 : this.anInputStream2.available();
	}

	@OriginalMember(owner = "client!vj", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		this.method8569();
	}

	@OriginalMember(owner = "client!vj", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			while (true) {
				label80: {
					@Pc(40) int local40;
					@Pc(28) int local28;
					synchronized (this) {
						if (this.anInt10087 == this.anInt10097) {
							if (this.aBoolean729) {
								break label80;
							}
							try {
								this.wait();
							} catch (@Pc(24) InterruptedException local24) {
							}
						}
						local28 = this.anInt10097;
						if (this.anInt10097 <= this.anInt10087) {
							local40 = this.anInt10087 - this.anInt10097;
						} else {
							local40 = this.anInt10095 - this.anInt10097;
						}
					}
					if (local40 <= 0) {
						continue;
					}
					try {
						this.anOutputStream2.write(this.aByteArray104, local28, local40);
					} catch (@Pc(66) IOException local66) {
						this.aBoolean728 = true;
					}
					this.anInt10097 = (local40 + this.anInt10097) % this.anInt10095;
					try {
						if (this.anInt10087 == this.anInt10097) {
							this.anOutputStream2.flush();
						}
					} catch (@Pc(92) IOException local92) {
						this.aBoolean728 = true;
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
				this.aByteArray104 = null;
				break;
			}
		} catch (@Pc(121) Exception local121) {
			Static25.method7457(local121, (String) null);
		}
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(B)V")
	public void method8572() {
		if (!this.aBoolean729) {
			this.anInputStream2 = new InputStream_Sub2();
			this.anOutputStream2 = new OutputStream_Sub1();
		}
	}

	@OriginalMember(owner = "client!vj", name = "d", descriptor = "(I)I")
	public int method8574() throws IOException {
		return this.aBoolean729 ? 0 : this.anInputStream2.read();
	}

	@OriginalMember(owner = "client!vj", name = "c", descriptor = "(B)V")
	public void method8575() throws IOException {
		if (!this.aBoolean729 && this.aBoolean728) {
			this.aBoolean728 = false;
			throw new IOException();
		}
	}
}
