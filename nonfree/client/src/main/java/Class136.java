import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gl")
public final class Class136 implements Runnable {

	@OriginalMember(owner = "client!gl", name = "q", descriptor = "Lclient!uga;")
	private Class361 aClass361_3;

	@OriginalMember(owner = "client!gl", name = "t", descriptor = "[B")
	private byte[] aByteArray34;

	@OriginalMember(owner = "client!gl", name = "f", descriptor = "I")
	private int anInt3496 = 0;

	@OriginalMember(owner = "client!gl", name = "m", descriptor = "Z")
	private boolean aBoolean251 = false;

	@OriginalMember(owner = "client!gl", name = "n", descriptor = "I")
	private int anInt3502 = 0;

	@OriginalMember(owner = "client!gl", name = "p", descriptor = "Z")
	private boolean aBoolean252 = false;

	@OriginalMember(owner = "client!gl", name = "c", descriptor = "Ljava/net/Socket;")
	private final Socket aSocket1;

	@OriginalMember(owner = "client!gl", name = "e", descriptor = "Lclient!tga;")
	private final Class349 aClass349_3;

	@OriginalMember(owner = "client!gl", name = "j", descriptor = "Ljava/io/InputStream;")
	private InputStream anInputStream1;

	@OriginalMember(owner = "client!gl", name = "l", descriptor = "Ljava/io/OutputStream;")
	private OutputStream anOutputStream1;

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "I")
	private final int anInt3500;

	@OriginalMember(owner = "client!gl", name = "<init>", descriptor = "(Ljava/net/Socket;Lclient!tga;I)V")
	public Class136(@OriginalArg(0) Socket arg0, @OriginalArg(1) Class349 arg1, @OriginalArg(2) int arg2) throws IOException {
		this.aSocket1 = arg0;
		this.aClass349_3 = arg1;
		this.aSocket1.setSoTimeout(30000);
		this.aSocket1.setTcpNoDelay(true);
		this.anInputStream1 = this.aSocket1.getInputStream();
		this.anOutputStream1 = this.aSocket1.getOutputStream();
		this.anInt3500 = arg2;
	}

	@OriginalMember(owner = "client!gl", name = "b", descriptor = "(I)I")
	public int method3205() throws IOException {
		return this.aBoolean252 ? 0 : this.anInputStream1.available();
	}

	@OriginalMember(owner = "client!gl", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		this.method3207();
	}

	@OriginalMember(owner = "client!gl", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			while (true) {
				label77: {
					@Pc(45) int local45;
					@Pc(57) int local57;
					synchronized (this) {
						if (this.anInt3502 == this.anInt3496) {
							if (this.aBoolean252) {
								break label77;
							}
							try {
								this.wait();
							} catch (@Pc(28) InterruptedException local28) {
							}
						}
						if (this.anInt3496 < this.anInt3502) {
							local45 = this.anInt3500 - this.anInt3502;
						} else {
							local45 = this.anInt3496 - this.anInt3502;
						}
						local57 = this.anInt3502;
					}
					if (local45 <= 0) {
						continue;
					}
					try {
						this.anOutputStream1.write(this.aByteArray34, local57, local45);
					} catch (@Pc(76) IOException local76) {
						this.aBoolean251 = true;
					}
					this.anInt3502 = (this.anInt3502 + local45) % this.anInt3500;
					try {
						if (this.anInt3502 == this.anInt3496) {
							this.anOutputStream1.flush();
						}
					} catch (@Pc(98) IOException local98) {
						this.aBoolean251 = true;
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
				} catch (@Pc(126) IOException local126) {
				}
				this.aByteArray34 = null;
				return;
			}
		} catch (@Pc(131) Exception local131) {
			Static522.method7115(local131, (String) null);
		}
	}

	@OriginalMember(owner = "client!gl", name = "b", descriptor = "(I[BII)V")
	public void method3206(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1) throws IOException {
		if (this.aBoolean252) {
			return;
		}
		if (this.aBoolean251) {
			this.aBoolean251 = false;
			throw new IOException();
		}
		if (this.aByteArray34 == null) {
			this.aByteArray34 = new byte[this.anInt3500];
		}
		synchronized (this) {
			for (@Pc(37) int local37 = 0; local37 < arg1; local37++) {
				this.aByteArray34[this.anInt3496] = arg0[local37];
				this.anInt3496 = (this.anInt3496 + 1) % this.anInt3500;
				if ((this.anInt3500 + this.anInt3502 - 100) % this.anInt3500 == this.anInt3496) {
					throw new IOException();
				}
			}
			if (this.aClass361_3 == null) {
				this.aClass361_3 = this.aClass349_3.method7746(this, 3);
			}
			this.notifyAll();
		}
	}

	@OriginalMember(owner = "client!gl", name = "d", descriptor = "(I)V")
	public void method3207() {
		if (this.aBoolean252) {
			return;
		}
		synchronized (this) {
			this.aBoolean252 = true;
			this.notifyAll();
		}
		if (this.aClass361_3 != null) {
			while (this.aClass361_3.anInt9720 == 0) {
				Static620.method7045(-4, 1L);
			}
			if (this.aClass361_3.anInt9720 == 1) {
				try {
					((Thread) this.aClass361_3.anObject20).join();
				} catch (@Pc(68) InterruptedException local68) {
				}
			}
		}
		this.aClass361_3 = null;
	}

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(B)V")
	public void method3209() throws IOException {
		if (!this.aBoolean252 && this.aBoolean251) {
			this.aBoolean251 = false;
			throw new IOException();
		}
	}

	@OriginalMember(owner = "client!gl", name = "c", descriptor = "(I)V")
	public void method3210() {
		if (!this.aBoolean252) {
			this.anInputStream1 = new InputStream_Sub1();
			this.anOutputStream1 = new OutputStream_Sub2();
		}
	}

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(I[BII)V")
	public void method3211(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) throws IOException {
		if (this.aBoolean252) {
			return;
		}
		while (arg0 > 0) {
			@Pc(17) int local17 = this.anInputStream1.read(arg1, arg2, arg0);
			if (local17 <= 0) {
				throw new EOFException();
			}
			arg2 += local17;
			arg0 -= local17;
		}
		if (false) {
			this.run();
		}
	}

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(I)I")
	public int method3212() throws IOException {
		return this.aBoolean252 ? 0 : this.anInputStream1.read();
	}
}
