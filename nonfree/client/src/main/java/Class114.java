import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kg")
public final class Class114 implements Runnable {

	@OriginalMember(owner = "client!kg", name = "c", descriptor = "Lclient!sm;")
	private Class185 aClass185_3;

	@OriginalMember(owner = "client!kg", name = "j", descriptor = "[B")
	private byte[] aByteArray52;

	@OriginalMember(owner = "client!kg", name = "n", descriptor = "I")
	private int anInt3468 = 0;

	@OriginalMember(owner = "client!kg", name = "t", descriptor = "Z")
	private boolean aBoolean275 = false;

	@OriginalMember(owner = "client!kg", name = "r", descriptor = "Z")
	private boolean aBoolean274 = false;

	@OriginalMember(owner = "client!kg", name = "x", descriptor = "I")
	private int anInt3475 = 0;

	@OriginalMember(owner = "client!kg", name = "l", descriptor = "Ljava/net/Socket;")
	private final Socket aSocket1;

	@OriginalMember(owner = "client!kg", name = "g", descriptor = "Lclient!ml;")
	private final Class134 aClass134_2;

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "Ljava/io/InputStream;")
	private InputStream anInputStream1;

	@OriginalMember(owner = "client!kg", name = "p", descriptor = "Ljava/io/OutputStream;")
	private OutputStream anOutputStream1;

	@OriginalMember(owner = "client!kg", name = "<init>", descriptor = "(Ljava/net/Socket;Lclient!ml;)V")
	public Class114(@OriginalArg(0) Socket arg0, @OriginalArg(1) Class134 arg1) throws IOException {
		this.aSocket1 = arg0;
		this.aClass134_2 = arg1;
		this.aSocket1.setSoTimeout(30000);
		this.aSocket1.setTcpNoDelay(true);
		this.anInputStream1 = this.aSocket1.getInputStream();
		this.anOutputStream1 = this.aSocket1.getOutputStream();
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(B)I")
	public int method3161() throws IOException {
		return this.aBoolean274 ? 0 : this.anInputStream1.available();
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(Z[BII)V")
	public void method3163(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1) throws IOException {
		if (this.aBoolean274) {
			return;
		}
		if (this.aBoolean275) {
			this.aBoolean275 = false;
			throw new IOException();
		}
		if (this.aByteArray52 == null) {
			this.aByteArray52 = new byte[5000];
		}
		synchronized (this) {
			for (@Pc(32) int local32 = 0; local32 < arg1; local32++) {
				this.aByteArray52[this.anInt3475] = arg0[local32];
				this.anInt3475 = (this.anInt3475 + 1) % 5000;
				if (this.anInt3475 == (this.anInt3468 + 4900) % 5000) {
					throw new IOException();
				}
			}
			if (this.aClass185_3 == null) {
				this.aClass185_3 = this.aClass134_2.method3762(3, this);
			}
			this.notifyAll();
		}
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(I)V")
	public void method3164() throws IOException {
		if (!this.aBoolean274 && this.aBoolean275) {
			this.aBoolean275 = false;
			throw new IOException();
		}
	}

	@OriginalMember(owner = "client!kg", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		this.method3165();
	}

	@OriginalMember(owner = "client!kg", name = "b", descriptor = "(Z)V")
	public void method3165() {
		if (this.aBoolean274) {
			return;
		}
		synchronized (this) {
			this.aBoolean274 = true;
			this.notifyAll();
		}
		if (this.aClass185_3 != null) {
			while (this.aClass185_3.anInt5682 == 0) {
				Static249.method4396(1L);
			}
			if (this.aClass185_3.anInt5682 == 1) {
				try {
					((Thread) this.aClass185_3.anObject4).join();
				} catch (@Pc(50) InterruptedException local50) {
				}
			}
		}
		this.aClass185_3 = null;
	}

	@OriginalMember(owner = "client!kg", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			while (true) {
				label77: {
					@Pc(37) int local37;
					@Pc(48) int local48;
					synchronized (this) {
						if (this.anInt3475 == this.anInt3468) {
							if (this.aBoolean274) {
								break label77;
							}
							try {
								this.wait();
							} catch (@Pc(24) InterruptedException local24) {
							}
						}
						if (this.anInt3468 <= this.anInt3475) {
							local37 = this.anInt3475 - this.anInt3468;
						} else {
							local37 = 5000 - this.anInt3468;
						}
						local48 = this.anInt3468;
					}
					if (local37 <= 0) {
						continue;
					}
					try {
						this.anOutputStream1.write(this.aByteArray52, local48, local37);
					} catch (@Pc(68) IOException local68) {
						this.aBoolean275 = true;
					}
					this.anInt3468 = (this.anInt3468 + local37) % 5000;
					try {
						if (this.anInt3475 == this.anInt3468) {
							this.anOutputStream1.flush();
						}
					} catch (@Pc(94) IOException local94) {
						this.aBoolean275 = true;
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
				} catch (@Pc(118) IOException local118) {
				}
				this.aByteArray52 = null;
				return;
			}
		} catch (@Pc(123) Exception local123) {
			Static289.method4874(null, local123);
		}
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(I[BII)V")
	public void method3168(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(3) int arg2) throws IOException {
		if (this.aBoolean274) {
			return;
		}
		while (arg0 > 0) {
			@Pc(24) int local24 = this.anInputStream1.read(arg1, arg2, arg0);
			if (local24 <= 0) {
				throw new EOFException();
			}
			arg2 += local24;
			arg0 -= local24;
		}
	}

	@OriginalMember(owner = "client!kg", name = "b", descriptor = "(B)I")
	public int method3170() throws IOException {
		return this.aBoolean274 ? 0 : this.anInputStream1.read();
	}

	@OriginalMember(owner = "client!kg", name = "b", descriptor = "(I)V")
	public void method3171() {
		if (!this.aBoolean274) {
			this.anInputStream1 = new InputStream_Sub1();
			this.anOutputStream1 = new OutputStream_Sub1();
		}
	}
}
