import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ga")
public final class Class29 implements Runnable {

	@OriginalMember(owner = "client!ga", name = "i", descriptor = "Lclient!sh;")
	private Class78 aClass78_2;

	@OriginalMember(owner = "client!ga", name = "q", descriptor = "[B")
	private byte[] aByteArray23;

	@OriginalMember(owner = "client!ga", name = "b", descriptor = "I")
	private int anInt1385 = 0;

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "Z")
	private boolean aBoolean71 = false;

	@OriginalMember(owner = "client!ga", name = "d", descriptor = "I")
	private int anInt1387 = 0;

	@OriginalMember(owner = "client!ga", name = "e", descriptor = "Z")
	private boolean aBoolean72 = false;

	@OriginalMember(owner = "client!ga", name = "l", descriptor = "Lclient!ma;")
	private final Class50 aClass50_2;

	@OriginalMember(owner = "client!ga", name = "o", descriptor = "Ljava/net/Socket;")
	private final Socket aSocket1;

	@OriginalMember(owner = "client!ga", name = "j", descriptor = "Ljava/io/InputStream;")
	private final InputStream anInputStream1;

	@OriginalMember(owner = "client!ga", name = "f", descriptor = "Ljava/io/OutputStream;")
	private final OutputStream anOutputStream1;

	@OriginalMember(owner = "client!ga", name = "<init>", descriptor = "(Ljava/net/Socket;Lclient!ma;)V")
	public Class29(@OriginalArg(0) Socket arg0, @OriginalArg(1) Class50 arg1) throws IOException {
		this.aClass50_2 = arg1;
		this.aSocket1 = arg0;
		this.aSocket1.setSoTimeout(30000);
		this.aSocket1.setTcpNoDelay(true);
		this.anInputStream1 = this.aSocket1.getInputStream();
		this.anOutputStream1 = this.aSocket1.getOutputStream();
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(II[BI)V")
	public void method965(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) throws IOException {
		if (this.aBoolean72) {
			return;
		}
		while (arg2 > 0) {
			@Pc(23) int local23 = this.anInputStream1.read(arg1, arg0, arg2);
			if (local23 <= 0) {
				throw new EOFException();
			}
			arg0 += local23;
			arg2 -= local23;
		}
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(I)I")
	public int method966() throws IOException {
		return this.aBoolean72 ? 0 : this.anInputStream1.available();
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(B)V")
	public void method967() {
		if (this.aBoolean72) {
			return;
		}
		synchronized (this) {
			this.aBoolean72 = true;
			this.notifyAll();
		}
		if (this.aClass78_2 != null) {
			while (this.aClass78_2.anInt3646 == 0) {
				Static27.method564(1L);
			}
			if (this.aClass78_2.anInt3646 == 1) {
				try {
					((Thread) this.aClass78_2.anObject3).join();
				} catch (@Pc(54) InterruptedException local54) {
				}
			}
		}
		this.aClass78_2 = null;
	}

	@OriginalMember(owner = "client!ga", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			while (true) {
				label80: {
					@Pc(33) int local33;
					@Pc(43) int local43;
					synchronized (this) {
						if (this.anInt1387 == this.anInt1385) {
							if (this.aBoolean72) {
								break label80;
							}
							try {
								this.wait();
							} catch (@Pc(20) InterruptedException local20) {
							}
						}
						if (this.anInt1387 >= this.anInt1385) {
							local33 = this.anInt1387 - this.anInt1385;
						} else {
							local33 = 5000 - this.anInt1385;
						}
						local43 = this.anInt1385;
					}
					if (local33 <= 0) {
						continue;
					}
					try {
						this.anOutputStream1.write(this.aByteArray23, local43, local33);
					} catch (@Pc(60) IOException local60) {
						this.aBoolean71 = true;
					}
					this.anInt1385 = (local33 + this.anInt1385) % 5000;
					try {
						if (this.anInt1387 == this.anInt1385) {
							this.anOutputStream1.flush();
						}
					} catch (@Pc(85) IOException local85) {
						this.aBoolean71 = true;
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
				} catch (@Pc(109) IOException local109) {
				}
				this.aByteArray23 = null;
				break;
			}
		} catch (@Pc(114) Exception local114) {
			Static19.method441(null, local114);
		}
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(III[B)V")
	public void method969(@OriginalArg(1) int arg0, @OriginalArg(3) byte[] arg1) throws IOException {
		if (this.aBoolean72) {
			return;
		}
		if (this.aBoolean71) {
			this.aBoolean71 = false;
			throw new IOException();
		}
		if (this.aByteArray23 == null) {
			this.aByteArray23 = new byte[5000];
		}
		synchronized (this) {
			for (@Pc(30) int local30 = 0; local30 < arg0; local30++) {
				this.aByteArray23[this.anInt1387] = arg1[local30];
				this.anInt1387 = (this.anInt1387 + 1) % 5000;
				if (this.anInt1387 == (this.anInt1385 + 4900) % 5000) {
					throw new IOException();
				}
			}
			if (this.aClass78_2 == null) {
				this.aClass78_2 = this.aClass50_2.method1748(this, 3);
			}
			this.notifyAll();
		}
	}

	@OriginalMember(owner = "client!ga", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		this.method967();
	}

	@OriginalMember(owner = "client!ga", name = "b", descriptor = "(I)I")
	public int method970() throws IOException {
		return this.aBoolean72 ? 0 : this.anInputStream1.read();
	}
}
