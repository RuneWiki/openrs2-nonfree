import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oga")
public final class Class257 implements Runnable {

	@OriginalMember(owner = "client!oga", name = "e", descriptor = "[B")
	private byte[] aByteArray54;

	@OriginalMember(owner = "client!oga", name = "l", descriptor = "Lclient!tj;")
	private Class330 aClass330_6;

	@OriginalMember(owner = "client!oga", name = "b", descriptor = "I")
	private int anInt6940 = 0;

	@OriginalMember(owner = "client!oga", name = "r", descriptor = "Z")
	private boolean aBoolean576 = false;

	@OriginalMember(owner = "client!oga", name = "p", descriptor = "I")
	private int anInt6949 = 0;

	@OriginalMember(owner = "client!oga", name = "s", descriptor = "Z")
	private boolean aBoolean577 = false;

	@OriginalMember(owner = "client!oga", name = "k", descriptor = "Lclient!kk;")
	private final Class192 aClass192_3;

	@OriginalMember(owner = "client!oga", name = "a", descriptor = "Ljava/net/Socket;")
	private final Socket aSocket2;

	@OriginalMember(owner = "client!oga", name = "h", descriptor = "Ljava/io/InputStream;")
	private InputStream anInputStream2;

	@OriginalMember(owner = "client!oga", name = "g", descriptor = "Ljava/io/OutputStream;")
	private OutputStream anOutputStream2;

	@OriginalMember(owner = "client!oga", name = "n", descriptor = "I")
	private final int anInt6947;

	@OriginalMember(owner = "client!oga", name = "<init>", descriptor = "(Ljava/net/Socket;Lclient!kk;I)V")
	public Class257(@OriginalArg(0) Socket arg0, @OriginalArg(1) Class192 arg1, @OriginalArg(2) int arg2) throws IOException {
		this.aClass192_3 = arg1;
		this.aSocket2 = arg0;
		this.aSocket2.setSoTimeout(30000);
		this.aSocket2.setTcpNoDelay(true);
		this.anInputStream2 = this.aSocket2.getInputStream();
		this.anOutputStream2 = this.aSocket2.getOutputStream();
		this.anInt6947 = arg2;
	}

	@OriginalMember(owner = "client!oga", name = "a", descriptor = "(I[BII)V")
	public void method6185(@OriginalArg(1) byte[] arg0, @OriginalArg(3) int arg1) throws IOException {
		if (this.aBoolean577) {
			return;
		}
		if (this.aBoolean576) {
			this.aBoolean576 = false;
			throw new IOException();
		}
		if (this.aByteArray54 == null) {
			this.aByteArray54 = new byte[this.anInt6947];
		}
		synchronized (this) {
			for (@Pc(39) int local39 = 0; local39 < arg1; local39++) {
				this.aByteArray54[this.anInt6940] = arg0[local39];
				this.anInt6940 = (this.anInt6940 + 1) % this.anInt6947;
				if ((this.anInt6947 + this.anInt6949 - 100) % this.anInt6947 == this.anInt6940) {
					throw new IOException();
				}
			}
			if (this.aClass330_6 == null) {
				this.aClass330_6 = this.aClass192_3.method4334(this, 3);
			}
			this.notifyAll();
		}
	}

	@OriginalMember(owner = "client!oga", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			while (true) {
				label80: {
					@Pc(35) int local35;
					@Pc(24) int local24;
					synchronized (this) {
						if (this.anInt6940 == this.anInt6949) {
							if (this.aBoolean577) {
								break label80;
							}
							try {
								this.wait();
							} catch (@Pc(20) InterruptedException local20) {
							}
						}
						local24 = this.anInt6949;
						if (this.anInt6940 >= this.anInt6949) {
							local35 = this.anInt6940 - this.anInt6949;
						} else {
							local35 = this.anInt6947 - this.anInt6949;
						}
					}
					if (local35 <= 0) {
						continue;
					}
					try {
						this.anOutputStream2.write(this.aByteArray54, local24, local35);
					} catch (@Pc(64) IOException local64) {
						this.aBoolean576 = true;
					}
					this.anInt6949 = (this.anInt6949 + local35) % this.anInt6947;
					try {
						if (this.anInt6940 == this.anInt6949) {
							this.anOutputStream2.flush();
						}
					} catch (@Pc(90) IOException local90) {
						this.aBoolean576 = true;
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
				} catch (@Pc(114) IOException local114) {
				}
				this.aByteArray54 = null;
				break;
			}
		} catch (@Pc(119) Exception local119) {
			Static280.method4194((String) null, local119);
		}
	}

	@OriginalMember(owner = "client!oga", name = "a", descriptor = "(B)V")
	public void method6187() {
		if (this.aBoolean577) {
			return;
		}
		synchronized (this) {
			this.aBoolean577 = true;
			this.notifyAll();
		}
		if (this.aClass330_6 != null) {
			while (this.aClass330_6.anInt9132 == 0) {
				Static452.method7478(1L);
			}
			if (this.aClass330_6.anInt9132 == 1) {
				try {
					((Thread) this.aClass330_6.anObject19).join();
				} catch (@Pc(48) InterruptedException local48) {
				}
			}
		}
		this.aClass330_6 = null;
	}

	@OriginalMember(owner = "client!oga", name = "a", descriptor = "(I)V")
	public void method6188() throws IOException {
		if (!this.aBoolean577 && this.aBoolean576) {
			this.aBoolean576 = false;
			throw new IOException();
		}
	}

	@OriginalMember(owner = "client!oga", name = "a", descriptor = "([BIIB)V")
	public void method6189(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		if (this.aBoolean577) {
			return;
		}
		while (arg1 > 0) {
			@Pc(26) int local26 = this.anInputStream2.read(arg0, arg2, arg1);
			if (local26 <= 0) {
				throw new EOFException();
			}
			arg1 -= local26;
			arg2 += local26;
		}
	}

	@OriginalMember(owner = "client!oga", name = "b", descriptor = "(I)V")
	public void method6191() {
		if (!this.aBoolean577) {
			this.anInputStream2 = new InputStream_Sub1();
			this.anOutputStream2 = new OutputStream_Sub2();
		}
	}

	@OriginalMember(owner = "client!oga", name = "b", descriptor = "(B)I")
	public int method6192() throws IOException {
		return this.aBoolean577 ? 0 : this.anInputStream2.read();
	}

	@OriginalMember(owner = "client!oga", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		this.method6187();
	}

	@OriginalMember(owner = "client!oga", name = "c", descriptor = "(B)I")
	public int method6193() throws IOException {
		return this.aBoolean577 ? 0 : this.anInputStream2.available();
	}
}
