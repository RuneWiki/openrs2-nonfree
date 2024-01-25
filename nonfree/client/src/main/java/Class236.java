import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!st")
public final class Class236 implements Runnable {

	@OriginalMember(owner = "client!st", name = "e", descriptor = "[B")
	private byte[] aByteArray84;

	@OriginalMember(owner = "client!st", name = "o", descriptor = "Lclient!ln;")
	private Class157 aClass157_8;

	@OriginalMember(owner = "client!st", name = "c", descriptor = "Z")
	private boolean aBoolean435 = false;

	@OriginalMember(owner = "client!st", name = "p", descriptor = "I")
	private int anInt6878 = 0;

	@OriginalMember(owner = "client!st", name = "a", descriptor = "Z")
	private boolean aBoolean434 = false;

	@OriginalMember(owner = "client!st", name = "n", descriptor = "I")
	private int anInt6877 = 0;

	@OriginalMember(owner = "client!st", name = "f", descriptor = "Lclient!nv;")
	private final Class183 aClass183_4;

	@OriginalMember(owner = "client!st", name = "h", descriptor = "Ljava/net/Socket;")
	private final Socket aSocket1;

	@OriginalMember(owner = "client!st", name = "m", descriptor = "Ljava/io/InputStream;")
	private InputStream anInputStream1;

	@OriginalMember(owner = "client!st", name = "y", descriptor = "Ljava/io/OutputStream;")
	private OutputStream anOutputStream1;

	@OriginalMember(owner = "client!st", name = "<init>", descriptor = "(Ljava/net/Socket;Lclient!nv;)V")
	public Class236(@OriginalArg(0) Socket arg0, @OriginalArg(1) Class183 arg1) throws IOException {
		this.aClass183_4 = arg1;
		this.aSocket1 = arg0;
		this.aSocket1.setSoTimeout(30000);
		this.aSocket1.setTcpNoDelay(true);
		this.anInputStream1 = this.aSocket1.getInputStream();
		this.anOutputStream1 = this.aSocket1.getOutputStream();
	}

	@OriginalMember(owner = "client!st", name = "a", descriptor = "(II[BI)V")
	public void method5226(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) throws IOException {
		if (this.aBoolean434) {
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

	@OriginalMember(owner = "client!st", name = "a", descriptor = "(IIB[B)V")
	public void method5227(@OriginalArg(1) int arg0, @OriginalArg(3) byte[] arg1) throws IOException {
		if (this.aBoolean434) {
			return;
		}
		if (this.aBoolean435) {
			this.aBoolean435 = false;
			throw new IOException();
		}
		if (this.aByteArray84 == null) {
			this.aByteArray84 = new byte[5000];
		}
		synchronized (this) {
			for (@Pc(36) int local36 = 0; local36 < arg0; local36++) {
				this.aByteArray84[this.anInt6878] = arg1[local36];
				this.anInt6878 = (this.anInt6878 + 1) % 5000;
				if ((this.anInt6877 + 4900) % 5000 == this.anInt6878) {
					throw new IOException();
				}
			}
			if (this.aClass157_8 == null) {
				this.aClass157_8 = this.aClass183_4.method4141(this, 3);
			}
			this.notifyAll();
		}
	}

	@OriginalMember(owner = "client!st", name = "a", descriptor = "(B)V")
	public void method5228() throws IOException {
		if (!this.aBoolean434 && this.aBoolean435) {
			this.aBoolean435 = false;
			throw new IOException();
		}
	}

	@OriginalMember(owner = "client!st", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		this.method5236();
	}

	@OriginalMember(owner = "client!st", name = "a", descriptor = "(I)V")
	public void method5229() {
		if (!this.aBoolean434) {
			this.anInputStream1 = new InputStream_Sub1();
			this.anOutputStream1 = new OutputStream_Sub1();
		}
	}

	@OriginalMember(owner = "client!st", name = "b", descriptor = "(B)I")
	public int method5231() throws IOException {
		return this.aBoolean434 ? 0 : this.anInputStream1.read();
	}

	@OriginalMember(owner = "client!st", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			while (true) {
				label77: {
					@Pc(40) int local40;
					@Pc(28) int local28;
					synchronized (this) {
						if (this.anInt6878 == this.anInt6877) {
							if (this.aBoolean434) {
								break label77;
							}
							try {
								this.wait();
							} catch (@Pc(24) InterruptedException local24) {
							}
						}
						local28 = this.anInt6877;
						if (this.anInt6878 >= this.anInt6877) {
							local40 = this.anInt6878 - this.anInt6877;
						} else {
							local40 = 5000 - this.anInt6877;
						}
					}
					if (local40 <= 0) {
						continue;
					}
					try {
						this.anOutputStream1.write(this.aByteArray84, local28, local40);
					} catch (@Pc(65) IOException local65) {
						this.aBoolean435 = true;
					}
					this.anInt6877 = (local40 + this.anInt6877) % 5000;
					try {
						if (this.anInt6877 == this.anInt6878) {
							this.anOutputStream1.flush();
						}
					} catch (@Pc(86) IOException local86) {
						this.aBoolean435 = true;
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
				} catch (@Pc(110) IOException local110) {
				}
				this.aByteArray84 = null;
				return;
			}
		} catch (@Pc(115) Exception local115) {
			Static247.method3669(null, local115);
		}
	}

	@OriginalMember(owner = "client!st", name = "c", descriptor = "(B)I")
	public int method5235() throws IOException {
		return this.aBoolean434 ? 0 : this.anInputStream1.available();
	}

	@OriginalMember(owner = "client!st", name = "b", descriptor = "(Z)V")
	public void method5236() {
		if (this.aBoolean434) {
			return;
		}
		synchronized (this) {
			this.aBoolean434 = true;
			this.notifyAll();
		}
		if (this.aClass157_8 != null) {
			while (this.aClass157_8.anInt4667 == 0) {
				Static289.method4249(1L);
			}
			if (this.aClass157_8.anInt4667 == 1) {
				try {
					((Thread) this.aClass157_8.anObject13).join();
				} catch (@Pc(45) InterruptedException local45) {
				}
			}
		}
		this.aClass157_8 = null;
	}
}
