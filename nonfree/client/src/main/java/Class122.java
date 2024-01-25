import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gca")
public final class Class122 implements Runnable {

	@OriginalMember(owner = "client!gca", name = "e", descriptor = "Ljava/io/IOException;")
	private IOException anIOException1;

	@OriginalMember(owner = "client!gca", name = "h", descriptor = "I")
	private int anInt3131 = 0;

	@OriginalMember(owner = "client!gca", name = "k", descriptor = "I")
	private int anInt3133 = 0;

	@OriginalMember(owner = "client!gca", name = "b", descriptor = "I")
	private final int anInt3128;

	@OriginalMember(owner = "client!gca", name = "m", descriptor = "Ljava/io/InputStream;")
	private InputStream anInputStream1;

	@OriginalMember(owner = "client!gca", name = "f", descriptor = "[B")
	private final byte[] aByteArray28;

	@OriginalMember(owner = "client!gca", name = "i", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread2;

	@OriginalMember(owner = "client!gca", name = "<init>", descriptor = "(Ljava/io/InputStream;I)V")
	public Class122(@OriginalArg(0) InputStream arg0, @OriginalArg(1) int arg1) {
		this.anInt3128 = arg1 + 1;
		this.anInputStream1 = arg0;
		this.aByteArray28 = new byte[this.anInt3128];
		this.aThread2 = new Thread(this);
		this.aThread2.setDaemon(true);
		this.aThread2.start();
	}

	@OriginalMember(owner = "client!gca", name = "b", descriptor = "(I)V")
	public void method2671() {
		this.anInputStream1 = new InputStream_Sub2();
	}

	@OriginalMember(owner = "client!gca", name = "c", descriptor = "(I)V")
	public void method2672() {
		synchronized (this) {
			if (this.anIOException1 == null) {
				this.anIOException1 = new IOException("");
			}
			this.notifyAll();
		}
		try {
			this.aThread2.join();
		} catch (@Pc(33) InterruptedException local33) {
		}
	}

	@OriginalMember(owner = "client!gca", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(30) int local30;
			synchronized (this) {
				while (true) {
					if (this.anIOException1 != null) {
						return;
					}
					if (this.anInt3131 == 0) {
						local30 = this.anInt3128 - this.anInt3133 - 1;
					} else if (this.anInt3131 < this.anInt3133) {
						local30 = this.anInt3128 - this.anInt3133;
					} else {
						local30 = this.anInt3131 - this.anInt3133 - 1;
					}
					if (local30 > 0) {
						break;
					}
					try {
						this.wait();
					} catch (@Pc(61) InterruptedException local61) {
					}
				}
			}
			@Pc(78) int local78;
			try {
				local78 = this.anInputStream1.read(this.aByteArray28, this.anInt3133, local30);
				if (local78 == -1) {
					throw new EOFException();
				}
			} catch (@Pc(87) IOException local87) {
				@Pc(87) IOException local87x = local87;
				synchronized (this) {
					this.anIOException1 = local87x;
					return;
				}
			}
			synchronized (this) {
				this.anInt3133 = (this.anInt3133 + local78) % this.anInt3128;
			}
		}
	}

	@OriginalMember(owner = "client!gca", name = "a", descriptor = "([BZII)I")
	public int method2673(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) throws IOException {
		if (arg1 < 0 || arg2 < 0 || arg2 + arg1 > arg0.length) {
			throw new IOException();
		}
		synchronized (this) {
			@Pc(48) int local48;
			if (this.anInt3133 >= this.anInt3131) {
				local48 = this.anInt3133 - this.anInt3131;
			} else {
				local48 = this.anInt3128 + this.anInt3133 - this.anInt3131;
			}
			if (arg1 > local48) {
				arg1 = local48;
			}
			if (arg1 == 0 && this.anIOException1 != null) {
				throw new IOException(this.anIOException1.toString());
			}
			if (this.anInt3128 >= this.anInt3131 + arg1) {
				Static655.method4109(this.aByteArray28, this.anInt3131, arg0, arg2, arg1);
			} else {
				@Pc(103) int local103 = this.anInt3128 - this.anInt3131;
				Static655.method4109(this.aByteArray28, this.anInt3131, arg0, arg2, local103);
				Static655.method4109(this.aByteArray28, 0, arg0, local103 + arg2, arg1 - local103);
			}
			this.anInt3131 = (arg1 + this.anInt3131) % this.anInt3128;
			this.notifyAll();
			return arg1;
		}
	}

	@OriginalMember(owner = "client!gca", name = "a", descriptor = "(II)Z")
	public boolean method2674(@OriginalArg(1) int arg0) throws IOException {
		if (arg0 <= 0 || arg0 >= this.anInt3128) {
			throw new IOException();
		}
		synchronized (this) {
			@Pc(40) int local40;
			if (this.anInt3133 < this.anInt3131) {
				local40 = this.anInt3128 + this.anInt3133 - this.anInt3131;
			} else {
				local40 = this.anInt3133 - this.anInt3131;
			}
			if (local40 >= arg0) {
				return true;
			} else if (this.anIOException1 == null) {
				return false;
			} else {
				throw new IOException(this.anIOException1.toString());
			}
		}
	}
}
