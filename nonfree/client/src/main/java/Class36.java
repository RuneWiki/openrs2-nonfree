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
public final class Class36 implements Runnable {

	@OriginalMember(owner = "client!ga", name = "h", descriptor = "Lclient!la;")
	private Class56 aClass56_5;

	@OriginalMember(owner = "client!ga", name = "q", descriptor = "[B")
	private byte[] aByteArray10;

	@OriginalMember(owner = "client!ga", name = "n", descriptor = "I")
	private int anInt1297 = 0;

	@OriginalMember(owner = "client!ga", name = "r", descriptor = "I")
	private int anInt1300 = 0;

	@OriginalMember(owner = "client!ga", name = "x", descriptor = "Z")
	private boolean aBoolean53 = false;

	@OriginalMember(owner = "client!ga", name = "B", descriptor = "Z")
	private boolean aBoolean54 = false;

	@OriginalMember(owner = "client!ga", name = "t", descriptor = "Lclient!hf;")
	private final Class41 aClass41_2;

	@OriginalMember(owner = "client!ga", name = "A", descriptor = "Ljava/net/Socket;")
	private final Socket aSocket1;

	@OriginalMember(owner = "client!ga", name = "y", descriptor = "Ljava/io/InputStream;")
	private final InputStream anInputStream1;

	@OriginalMember(owner = "client!ga", name = "z", descriptor = "Ljava/io/OutputStream;")
	private final OutputStream anOutputStream1;

	@OriginalMember(owner = "client!ga", name = "<init>", descriptor = "(Ljava/net/Socket;Lclient!hf;)V")
	public Class36(@OriginalArg(0) Socket arg0, @OriginalArg(1) Class41 arg1) throws IOException {
		this.aClass41_2 = arg1;
		this.aSocket1 = arg0;
		this.aSocket1.setSoTimeout(30000);
		this.aSocket1.setTcpNoDelay(true);
		this.anInputStream1 = this.aSocket1.getInputStream();
		this.anOutputStream1 = this.aSocket1.getOutputStream();
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "([BBII)V")
	public void method857(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) throws IOException {
		if (this.aBoolean54) {
			return;
		}
		while (arg2 > 0) {
			@Pc(14) int local14 = this.anInputStream1.read(arg0, arg1, arg2);
			if (local14 <= 0) {
				throw new EOFException();
			}
			arg1 += local14;
			arg2 -= local14;
		}
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(I[BII)V")
	public void method858(@OriginalArg(1) byte[] arg0, @OriginalArg(3) int arg1) throws IOException {
		if (this.aBoolean54) {
			return;
		}
		if (this.aBoolean53) {
			this.aBoolean53 = false;
			throw new IOException();
		}
		if (this.aByteArray10 == null) {
			this.aByteArray10 = new byte[5000];
		}
		synchronized (this) {
			for (@Pc(36) int local36 = 0; local36 < arg1; local36++) {
				this.aByteArray10[this.anInt1297] = arg0[local36];
				this.anInt1297 = (this.anInt1297 + 1) % 5000;
				if ((this.anInt1300 + 4900) % 5000 == this.anInt1297) {
					throw new IOException();
				}
			}
			if (this.aClass56_5 == null) {
				this.aClass56_5 = this.aClass41_2.method1044(this, 3);
			}
			this.notifyAll();
		}
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(Z)I")
	public int method859() throws IOException {
		return this.aBoolean54 ? 0 : this.anInputStream1.read();
	}

	@OriginalMember(owner = "client!ga", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		this.method862();
	}

	@OriginalMember(owner = "client!ga", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			while (true) {
				label77: {
					@Pc(40) int local40;
					@Pc(52) int local52;
					synchronized (this) {
						if (this.anInt1297 == this.anInt1300) {
							if (this.aBoolean54) {
								break label77;
							}
							try {
								this.wait();
							} catch (@Pc(28) InterruptedException local28) {
							}
						}
						if (this.anInt1297 < this.anInt1300) {
							local40 = 5000 - this.anInt1300;
						} else {
							local40 = this.anInt1297 - this.anInt1300;
						}
						local52 = this.anInt1300;
					}
					if (local40 <= 0) {
						continue;
					}
					try {
						this.anOutputStream1.write(this.aByteArray10, local52, local40);
					} catch (@Pc(69) IOException local69) {
						this.aBoolean53 = true;
					}
					this.anInt1300 = (local40 + this.anInt1300) % 5000;
					try {
						if (this.anInt1297 == this.anInt1300) {
							this.anOutputStream1.flush();
						}
					} catch (@Pc(94) IOException local94) {
						this.aBoolean53 = true;
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
				this.aByteArray10 = null;
				return;
			}
		} catch (@Pc(123) Exception local123) {
			Static84.method2582(null, local123);
		}
	}

	@OriginalMember(owner = "client!ga", name = "b", descriptor = "(Z)V")
	public void method862() {
		if (this.aBoolean54) {
			return;
		}
		synchronized (this) {
			this.aBoolean54 = true;
			this.notifyAll();
		}
		if (this.aClass56_5 != null) {
			while (this.aClass56_5.anInt2418 == 0) {
				Static117.method1813(1L);
			}
			if (this.aClass56_5.anInt2418 == 1) {
				try {
					((Thread) this.aClass56_5.anObject2).join();
				} catch (@Pc(51) InterruptedException local51) {
				}
			}
		}
		this.aClass56_5 = null;
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(I)I")
	public int method863() throws IOException {
		return this.aBoolean54 ? 0 : this.anInputStream1.available();
	}
}
