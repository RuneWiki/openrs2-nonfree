import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uq")
public final class Class202 implements Runnable {

	@OriginalMember(owner = "client!uq", name = "d", descriptor = "Lclient!tj;")
	private Class193 aClass193_7;

	@OriginalMember(owner = "client!uq", name = "w", descriptor = "[B")
	private byte[] aByteArray72;

	@OriginalMember(owner = "client!uq", name = "l", descriptor = "I")
	private int anInt6365 = 0;

	@OriginalMember(owner = "client!uq", name = "n", descriptor = "I")
	private int anInt6366 = 0;

	@OriginalMember(owner = "client!uq", name = "m", descriptor = "Z")
	private boolean aBoolean526 = false;

	@OriginalMember(owner = "client!uq", name = "p", descriptor = "Z")
	private boolean aBoolean527 = false;

	@OriginalMember(owner = "client!uq", name = "y", descriptor = "Ljava/net/Socket;")
	private final Socket aSocket1;

	@OriginalMember(owner = "client!uq", name = "i", descriptor = "Lclient!wd;")
	private final Class215 aClass215_8;

	@OriginalMember(owner = "client!uq", name = "c", descriptor = "Ljava/io/InputStream;")
	private InputStream anInputStream1;

	@OriginalMember(owner = "client!uq", name = "o", descriptor = "Ljava/io/OutputStream;")
	private OutputStream anOutputStream1;

	@OriginalMember(owner = "client!uq", name = "<init>", descriptor = "(Ljava/net/Socket;Lclient!wd;)V")
	public Class202(@OriginalArg(0) Socket arg0, @OriginalArg(1) Class215 arg1) throws IOException {
		this.aSocket1 = arg0;
		this.aClass215_8 = arg1;
		this.aSocket1.setSoTimeout(30000);
		this.aSocket1.setTcpNoDelay(true);
		this.anInputStream1 = this.aSocket1.getInputStream();
		this.anOutputStream1 = this.aSocket1.getOutputStream();
	}

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(Z)I")
	public int method5473() throws IOException {
		return this.aBoolean526 ? 0 : this.anInputStream1.available();
	}

	@OriginalMember(owner = "client!uq", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		this.method5477();
	}

	@OriginalMember(owner = "client!uq", name = "b", descriptor = "(I)V")
	public void method5475() throws IOException {
		if (!this.aBoolean526 && this.aBoolean527) {
			this.aBoolean527 = false;
			throw new IOException();
		}
	}

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(ZI[BI)V")
	public void method5476(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) throws IOException {
		if (this.aBoolean526) {
			return;
		}
		while (arg2 > 0) {
			@Pc(19) int local19 = this.anInputStream1.read(arg1, arg0, arg2);
			if (local19 <= 0) {
				throw new EOFException();
			}
			arg2 -= local19;
			arg0 += local19;
		}
	}

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(B)V")
	public void method5477() {
		if (this.aBoolean526) {
			return;
		}
		synchronized (this) {
			this.aBoolean526 = true;
			this.notifyAll();
		}
		if (this.aClass193_7 != null) {
			while (this.aClass193_7.anInt5986 == 0) {
				Static163.method2863(1L);
			}
			if (this.aClass193_7.anInt5986 == 1) {
				try {
					((Thread) this.aClass193_7.anObject7).join();
				} catch (@Pc(48) InterruptedException local48) {
				}
			}
		}
		this.aClass193_7 = null;
	}

	@OriginalMember(owner = "client!uq", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			while (true) {
				label77: {
					@Pc(43) int local43;
					@Pc(32) int local32;
					synchronized (this) {
						if (this.anInt6365 == this.anInt6366) {
							if (this.aBoolean526) {
								break label77;
							}
							try {
								this.wait();
							} catch (@Pc(28) InterruptedException local28) {
							}
						}
						local32 = this.anInt6365;
						if (this.anInt6365 > this.anInt6366) {
							local43 = 5000 - this.anInt6365;
						} else {
							local43 = this.anInt6366 - this.anInt6365;
						}
					}
					if (local43 <= 0) {
						continue;
					}
					try {
						this.anOutputStream1.write(this.aByteArray72, local32, local43);
					} catch (@Pc(71) IOException local71) {
						this.aBoolean527 = true;
					}
					this.anInt6365 = (this.anInt6365 + local43) % 5000;
					try {
						if (this.anInt6365 == this.anInt6366) {
							this.anOutputStream1.flush();
						}
					} catch (@Pc(93) IOException local93) {
						this.aBoolean527 = true;
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
				} catch (@Pc(117) IOException local117) {
				}
				this.aByteArray72 = null;
				return;
			}
		} catch (@Pc(122) Exception local122) {
			Static268.method4816(null, local122);
		}
	}

	@OriginalMember(owner = "client!uq", name = "c", descriptor = "(I)I")
	public int method5478() throws IOException {
		return this.aBoolean526 ? 0 : this.anInputStream1.read();
	}

	@OriginalMember(owner = "client!uq", name = "b", descriptor = "(B)V")
	public void method5479() {
		if (!this.aBoolean526) {
			this.anInputStream1 = new InputStream_Sub1();
			this.anOutputStream1 = new OutputStream_Sub1();
		}
	}

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(III[B)V")
	public void method5480(@OriginalArg(2) int arg0, @OriginalArg(3) byte[] arg1) throws IOException {
		if (this.aBoolean526) {
			return;
		}
		if (this.aBoolean527) {
			this.aBoolean527 = false;
			throw new IOException();
		}
		if (this.aByteArray72 == null) {
			this.aByteArray72 = new byte[5000];
		}
		synchronized (this) {
			for (@Pc(37) int local37 = 0; local37 < arg0; local37++) {
				this.aByteArray72[this.anInt6366] = arg1[local37];
				this.anInt6366 = (this.anInt6366 + 1) % 5000;
				if (this.anInt6366 == (this.anInt6365 + 4900) % 5000) {
					throw new IOException();
				}
			}
			if (this.aClass193_7 == null) {
				this.aClass193_7 = this.aClass215_8.method5654(this, 3);
			}
			this.notifyAll();
		}
	}
}
