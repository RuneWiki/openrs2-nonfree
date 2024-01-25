import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!id")
public final class Class131 implements Runnable {

	@OriginalMember(owner = "client!id", name = "k", descriptor = "Ljava/io/IOException;")
	private IOException anIOException1;

	@OriginalMember(owner = "client!id", name = "d", descriptor = "I")
	private int anInt4471 = 0;

	@OriginalMember(owner = "client!id", name = "q", descriptor = "I")
	private int anInt4480 = 0;

	@OriginalMember(owner = "client!id", name = "o", descriptor = "Ljava/io/InputStream;")
	private InputStream anInputStream1;

	@OriginalMember(owner = "client!id", name = "i", descriptor = "I")
	private final int anInt4474;

	@OriginalMember(owner = "client!id", name = "f", descriptor = "[B")
	private final byte[] aByteArray44;

	@OriginalMember(owner = "client!id", name = "h", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread1;

	@OriginalMember(owner = "client!id", name = "<init>", descriptor = "(Ljava/io/InputStream;I)V")
	public Class131(@OriginalArg(0) InputStream arg0, @OriginalArg(1) int arg1) {
		this.anInputStream1 = arg0;
		this.anInt4474 = arg1 + 1;
		this.aByteArray44 = new byte[this.anInt4474];
		this.aThread1 = new Thread(this);
		this.aThread1.setDaemon(true);
		this.aThread1.start();
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(I[BII)I")
	public int method3744(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(3) int arg2) throws IOException {
		if (arg2 < 0 || arg0 < 0 || arg2 + arg0 > arg1.length) {
			throw new IOException();
		}
		synchronized (this) {
			@Pc(46) int local46;
			if (this.anInt4480 > this.anInt4471) {
				local46 = this.anInt4471 + this.anInt4474 - this.anInt4480;
			} else {
				local46 = this.anInt4471 - this.anInt4480;
			}
			if (arg2 > local46) {
				arg2 = local46;
			}
			if (arg2 == 0 && this.anIOException1 != null) {
				throw new IOException(this.anIOException1.toString());
			}
			if (this.anInt4474 < arg2 + this.anInt4480) {
				@Pc(97) int local97 = this.anInt4474 - this.anInt4480;
				Static559.method5957(this.aByteArray44, this.anInt4480, arg1, arg0, local97);
				Static559.method5957(this.aByteArray44, 0, arg1, arg0 + local97, arg2 + -local97);
			} else {
				Static559.method5957(this.aByteArray44, this.anInt4480, arg1, arg0, arg2);
			}
			this.anInt4480 = (arg2 + this.anInt4480) % this.anInt4474;
			this.notifyAll();
			return arg2;
		}
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(IB)Z")
	public boolean method3747(@OriginalArg(0) int arg0) throws IOException {
		if (arg0 <= 0 || this.anInt4474 <= arg0) {
			throw new IOException();
		}
		synchronized (this) {
			@Pc(41) int local41;
			if (this.anInt4480 <= this.anInt4471) {
				local41 = this.anInt4471 - this.anInt4480;
			} else {
				local41 = this.anInt4471 + this.anInt4474 - this.anInt4480;
			}
			if (local41 >= arg0) {
				return true;
			} else if (this.anIOException1 == null) {
				return false;
			} else {
				throw new IOException(this.anIOException1.toString());
			}
		}
	}

	@OriginalMember(owner = "client!id", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(33) int local33;
			synchronized (this) {
				while (true) {
					if (this.anIOException1 != null) {
						return;
					}
					if (this.anInt4480 == 0) {
						local33 = this.anInt4474 - this.anInt4471 - 1;
					} else if (this.anInt4471 > this.anInt4480) {
						local33 = this.anInt4474 - this.anInt4471;
					} else {
						local33 = this.anInt4480 - this.anInt4471 - 1;
					}
					if (local33 > 0) {
						break;
					}
					try {
						this.wait();
					} catch (@Pc(60) InterruptedException local60) {
					}
				}
			}
			@Pc(77) int local77;
			try {
				local77 = this.anInputStream1.read(this.aByteArray44, this.anInt4471, local33);
				if (local77 == -1) {
					throw new EOFException();
				}
			} catch (@Pc(85) IOException local85) {
				@Pc(85) IOException local85x = local85;
				synchronized (this) {
					this.anIOException1 = local85x;
					return;
				}
			}
			synchronized (this) {
				this.anInt4471 = (local77 + this.anInt4471) % this.anInt4474;
			}
		}
	}

	@OriginalMember(owner = "client!id", name = "c", descriptor = "(I)V")
	public void method3748() {
		this.anInputStream1 = new InputStream_Sub2();
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(B)V")
	public void method3749() {
		synchronized (this) {
			if (this.anIOException1 == null) {
				this.anIOException1 = new IOException("");
			}
			this.notifyAll();
		}
		try {
			this.aThread1.join();
		} catch (@Pc(34) InterruptedException local34) {
		}
	}
}
