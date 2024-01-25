import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ik")
public final class Class143 implements Runnable {

	@OriginalMember(owner = "client!ik", name = "b", descriptor = "Ljava/io/IOException;")
	private IOException anIOException1;

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "I")
	private int anInt5340 = 0;

	@OriginalMember(owner = "client!ik", name = "h", descriptor = "I")
	private int anInt5345 = 0;

	@OriginalMember(owner = "client!ik", name = "m", descriptor = "I")
	private final int anInt5348;

	@OriginalMember(owner = "client!ik", name = "n", descriptor = "Ljava/io/InputStream;")
	private InputStream anInputStream1;

	@OriginalMember(owner = "client!ik", name = "k", descriptor = "[B")
	private final byte[] aByteArray35;

	@OriginalMember(owner = "client!ik", name = "j", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread2;

	@OriginalMember(owner = "client!ik", name = "<init>", descriptor = "(Ljava/io/InputStream;I)V")
	public Class143(@OriginalArg(0) InputStream arg0, @OriginalArg(1) int arg1) {
		this.anInt5348 = arg1 + 1;
		this.anInputStream1 = arg0;
		this.aByteArray35 = new byte[this.anInt5348];
		this.aThread2 = new Thread(this);
		this.aThread2.setDaemon(true);
		this.aThread2.start();
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(B)V")
	public void method4391() {
		this.anInputStream1 = new InputStream_Sub2();
	}

	@OriginalMember(owner = "client!ik", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(30) int local30;
			synchronized (this) {
				while (true) {
					if (this.anIOException1 != null) {
						return;
					}
					if (this.anInt5340 == 0) {
						local30 = this.anInt5348 - this.anInt5345 - 1;
					} else if (this.anInt5340 >= this.anInt5345) {
						local30 = this.anInt5340 - this.anInt5345 - 1;
					} else {
						local30 = this.anInt5348 - this.anInt5345;
					}
					if (local30 > 0) {
						break;
					}
					try {
						this.wait();
					} catch (@Pc(64) InterruptedException local64) {
					}
				}
			}
			@Pc(81) int local81;
			try {
				local81 = this.anInputStream1.read(this.aByteArray35, this.anInt5345, local30);
				if (local81 == -1) {
					throw new EOFException();
				}
			} catch (@Pc(90) IOException local90) {
				@Pc(90) IOException local90x = local90;
				synchronized (this) {
					this.anIOException1 = local90x;
					return;
				}
			}
			synchronized (this) {
				this.anInt5345 = (local81 + this.anInt5345) % this.anInt5348;
			}
		}
	}

	@OriginalMember(owner = "client!ik", name = "b", descriptor = "(I)V")
	public void method4392() {
		synchronized (this) {
			if (this.anIOException1 == null) {
				this.anIOException1 = new IOException("");
			}
			this.notifyAll();
		}
		try {
			this.aThread2.join();
		} catch (@Pc(34) InterruptedException local34) {
		}
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(I[BIB)I")
	public int method4393(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) throws IOException {
		if (arg2 < 0 || arg0 < 0 || arg1.length < arg0 + arg2) {
			throw new IOException();
		}
		synchronized (this) {
			@Pc(51) int local51;
			if (this.anInt5345 < this.anInt5340) {
				local51 = this.anInt5345 + this.anInt5348 - this.anInt5340;
			} else {
				local51 = this.anInt5345 - this.anInt5340;
			}
			if (arg2 > local51) {
				arg2 = local51;
			}
			if (arg2 == 0 && this.anIOException1 != null) {
				throw new IOException(this.anIOException1.toString());
			}
			if (this.anInt5348 >= this.anInt5340 + arg2) {
				Static653.method6537(this.aByteArray35, this.anInt5340, arg1, arg0, arg2);
			} else {
				@Pc(115) int local115 = this.anInt5348 - this.anInt5340;
				Static653.method6537(this.aByteArray35, this.anInt5340, arg1, arg0, local115);
				Static653.method6537(this.aByteArray35, 0, arg1, local115 + arg0, arg2 - local115);
			}
			this.anInt5340 = (this.anInt5340 + arg2) % this.anInt5348;
			this.notifyAll();
			return arg2;
		}
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(IB)Z")
	public boolean method4394(@OriginalArg(0) int arg0) throws IOException {
		if (arg0 <= 0 || arg0 >= this.anInt5348) {
			throw new IOException();
		}
		synchronized (this) {
			@Pc(48) int local48;
			if (this.anInt5340 > this.anInt5345) {
				local48 = this.anInt5348 + this.anInt5345 - this.anInt5340;
			} else {
				local48 = this.anInt5345 - this.anInt5340;
			}
			if (local48 >= arg0) {
				return true;
			} else if (this.anIOException1 == null) {
				return false;
			} else {
				throw new IOException(this.anIOException1.toString());
			}
		}
	}
}
