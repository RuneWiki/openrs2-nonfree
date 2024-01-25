import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ij")
public final class Class163 implements Runnable {

	@OriginalMember(owner = "client!ij", name = "d", descriptor = "Lclient!th;")
	private Class338 aClass338_5;

	@OriginalMember(owner = "client!ij", name = "p", descriptor = "[B")
	private byte[] aByteArray39;

	@OriginalMember(owner = "client!ij", name = "b", descriptor = "I")
	private int anInt4470 = 0;

	@OriginalMember(owner = "client!ij", name = "l", descriptor = "Z")
	private boolean aBoolean299 = false;

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "I")
	private int anInt4469 = 0;

	@OriginalMember(owner = "client!ij", name = "e", descriptor = "Z")
	private boolean aBoolean298 = false;

	@OriginalMember(owner = "client!ij", name = "t", descriptor = "Lclient!ec;")
	private final Class92 aClass92_3;

	@OriginalMember(owner = "client!ij", name = "r", descriptor = "Ljava/net/Socket;")
	private final Socket aSocket2;

	@OriginalMember(owner = "client!ij", name = "h", descriptor = "Ljava/io/InputStream;")
	private InputStream anInputStream1;

	@OriginalMember(owner = "client!ij", name = "q", descriptor = "Ljava/io/OutputStream;")
	private OutputStream anOutputStream1;

	@OriginalMember(owner = "client!ij", name = "k", descriptor = "I")
	private final int anInt4475;

	@OriginalMember(owner = "client!ij", name = "<init>", descriptor = "(Ljava/net/Socket;Lclient!ec;I)V")
	public Class163(@OriginalArg(0) Socket arg0, @OriginalArg(1) Class92 arg1, @OriginalArg(2) int arg2) throws IOException {
		this.aClass92_3 = arg1;
		this.aSocket2 = arg0;
		this.aSocket2.setSoTimeout(30000);
		this.aSocket2.setTcpNoDelay(true);
		this.anInputStream1 = this.aSocket2.getInputStream();
		this.anOutputStream1 = this.aSocket2.getOutputStream();
		this.anInt4475 = arg2;
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(Z)V")
	public void method3819() throws IOException {
		if (!this.aBoolean298 && this.aBoolean299) {
			this.aBoolean299 = false;
			throw new IOException();
		}
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(I)I")
	public int method3820() throws IOException {
		return this.aBoolean298 ? 0 : this.anInputStream1.read();
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(B)I")
	public int method3821() throws IOException {
		return this.aBoolean298 ? 0 : this.anInputStream1.available();
	}

	@OriginalMember(owner = "client!ij", name = "b", descriptor = "(I)V")
	public void method3822() {
		if (this.aBoolean298) {
			return;
		}
		synchronized (this) {
			this.aBoolean298 = true;
			this.notifyAll();
		}
		if (this.aClass338_5 != null) {
			while (this.aClass338_5.anInt9321 == 0) {
				Static26.method592(1L);
			}
			if (this.aClass338_5.anInt9321 == 1) {
				try {
					((Thread) this.aClass338_5.anObject18).join();
				} catch (@Pc(50) InterruptedException local50) {
				}
			}
		}
		this.aClass338_5 = null;
	}

	@OriginalMember(owner = "client!ij", name = "c", descriptor = "(I)V")
	public void method3823() {
		if (!this.aBoolean298) {
			this.anInputStream1 = new InputStream_Sub2();
			this.anOutputStream1 = new OutputStream_Sub2();
		}
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(I[BIZ)V")
	public void method3824(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) throws IOException {
		if (this.aBoolean298) {
			return;
		}
		while (arg2 > 0) {
			@Pc(20) int local20 = this.anInputStream1.read(arg1, arg0, arg2);
			if (local20 <= 0) {
				throw new EOFException();
			}
			arg2 -= local20;
			arg0 += local20;
		}
	}

	@OriginalMember(owner = "client!ij", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			while (true) {
				label80: {
					@Pc(35) int local35;
					@Pc(24) int local24;
					synchronized (this) {
						if (this.anInt4470 == this.anInt4469) {
							if (this.aBoolean298) {
								break label80;
							}
							try {
								this.wait();
							} catch (@Pc(20) InterruptedException local20) {
							}
						}
						local24 = this.anInt4470;
						if (this.anInt4470 <= this.anInt4469) {
							local35 = this.anInt4469 - this.anInt4470;
						} else {
							local35 = this.anInt4475 - this.anInt4470;
						}
					}
					if (local35 <= 0) {
						continue;
					}
					try {
						this.anOutputStream1.write(this.aByteArray39, local24, local35);
					} catch (@Pc(61) IOException local61) {
						this.aBoolean299 = true;
					}
					this.anInt4470 = (this.anInt4470 + local35) % this.anInt4475;
					try {
						if (this.anInt4470 == this.anInt4469) {
							this.anOutputStream1.flush();
						}
					} catch (@Pc(83) IOException local83) {
						this.aBoolean299 = true;
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
					if (this.aSocket2 != null) {
						this.aSocket2.close();
					}
				} catch (@Pc(107) IOException local107) {
				}
				this.aByteArray39 = null;
				break;
			}
		} catch (@Pc(112) Exception local112) {
			Static456.method6140((String) null, local112);
		}
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(ZI[BI)V")
	public void method3825(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1) throws IOException {
		if (this.aBoolean298) {
			return;
		}
		if (this.aBoolean299) {
			this.aBoolean299 = false;
			throw new IOException();
		}
		if (this.aByteArray39 == null) {
			this.aByteArray39 = new byte[this.anInt4475];
		}
		synchronized (this) {
			for (@Pc(33) int local33 = 0; local33 < arg0; local33++) {
				this.aByteArray39[this.anInt4469] = arg1[local33];
				this.anInt4469 = (this.anInt4469 + 1) % this.anInt4475;
				if (this.anInt4469 == (this.anInt4470 + this.anInt4475 - 100) % this.anInt4475) {
					throw new IOException();
				}
			}
			if (this.aClass338_5 == null) {
				this.aClass338_5 = this.aClass92_3.method1871(this, 3);
			}
			this.notifyAll();
		}
	}

	@OriginalMember(owner = "client!ij", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		this.method3822();
	}
}
