import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gha")
public final class Class118 implements Runnable {

	@OriginalMember(owner = "client!gha", name = "o", descriptor = "Ljava/io/IOException;")
	private IOException anIOException1;

	@OriginalMember(owner = "client!gha", name = "k", descriptor = "I")
	private int anInt4421 = 0;

	@OriginalMember(owner = "client!gha", name = "m", descriptor = "I")
	private int anInt4422 = 0;

	@OriginalMember(owner = "client!gha", name = "a", descriptor = "I")
	private final int anInt4413;

	@OriginalMember(owner = "client!gha", name = "c", descriptor = "Ljava/io/InputStream;")
	private InputStream anInputStream1;

	@OriginalMember(owner = "client!gha", name = "i", descriptor = "[B")
	private final byte[] aByteArray51;

	@OriginalMember(owner = "client!gha", name = "l", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread3;

	@OriginalMember(owner = "client!gha", name = "<init>", descriptor = "(Ljava/io/InputStream;I)V")
	public Class118(@OriginalArg(0) InputStream arg0, @OriginalArg(1) int arg1) {
		this.anInt4413 = arg1 + 1;
		this.anInputStream1 = arg0;
		this.aByteArray51 = new byte[this.anInt4413];
		this.aThread3 = new Thread(this);
		this.aThread3.setDaemon(true);
		this.aThread3.start();
	}

	@OriginalMember(owner = "client!gha", name = "a", descriptor = "(I)V")
	public void method3866() {
		synchronized (this) {
			if (this.anIOException1 == null) {
				this.anIOException1 = new IOException("");
			}
			this.notifyAll();
		}
		try {
			this.aThread3.join();
		} catch (@Pc(34) InterruptedException local34) {
		}
	}

	@OriginalMember(owner = "client!gha", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(33) int local33;
			synchronized (this) {
				while (true) {
					if (this.anIOException1 != null) {
						return;
					}
					if (this.anInt4421 == 0) {
						local33 = this.anInt4413 - this.anInt4422 - 1;
					} else if (this.anInt4421 < this.anInt4422) {
						local33 = this.anInt4413 - this.anInt4422;
					} else {
						local33 = this.anInt4421 - this.anInt4422 - 1;
					}
					if (local33 > 0) {
						break;
					}
					try {
						this.wait();
					} catch (@Pc(63) InterruptedException local63) {
					}
				}
			}
			@Pc(80) int local80;
			try {
				local80 = this.anInputStream1.read(this.aByteArray51, this.anInt4422, local33);
				if (local80 == -1) {
					throw new EOFException();
				}
			} catch (@Pc(88) IOException local88) {
				@Pc(88) IOException local88x = local88;
				synchronized (this) {
					this.anIOException1 = local88x;
					return;
				}
			}
			synchronized (this) {
				this.anInt4422 = (local80 + this.anInt4422) % this.anInt4413;
			}
		}
	}

	@OriginalMember(owner = "client!gha", name = "a", descriptor = "(III[B)I")
	public int method3868(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) byte[] arg2) throws IOException {
		if (arg0 < 0 || arg1 < 0 || arg1 + arg0 > arg2.length) {
			throw new IOException();
		}
		synchronized (this) {
			@Pc(49) int local49;
			if (this.anInt4422 >= this.anInt4421) {
				local49 = this.anInt4422 - this.anInt4421;
			} else {
				local49 = this.anInt4413 + this.anInt4422 - this.anInt4421;
			}
			if (arg0 > local49) {
				arg0 = local49;
			}
			if (arg0 == 0 && this.anIOException1 != null) {
				throw new IOException(this.anIOException1.toString());
			}
			if (this.anInt4413 < arg0 + this.anInt4421) {
				@Pc(97) int local97 = this.anInt4413 - this.anInt4421;
				Static653.method7723(this.aByteArray51, this.anInt4421, arg2, arg1, local97);
				Static653.method7723(this.aByteArray51, 0, arg2, arg1 + local97, arg0 - local97);
			} else {
				Static653.method7723(this.aByteArray51, this.anInt4421, arg2, arg1, arg0);
			}
			this.anInt4421 = (this.anInt4421 + arg0) % this.anInt4413;
			this.notifyAll();
			return arg0;
		}
	}

	@OriginalMember(owner = "client!gha", name = "c", descriptor = "(I)V")
	public void method3869() {
		this.anInputStream1 = new InputStream_Sub1();
	}

	@OriginalMember(owner = "client!gha", name = "a", descriptor = "(IZ)Z")
	public boolean method3870(@OriginalArg(0) int arg0) throws IOException {
		if (arg0 <= 0 || arg0 >= this.anInt4413) {
			throw new IOException();
		}
		synchronized (this) {
			@Pc(40) int local40;
			if (this.anInt4422 < this.anInt4421) {
				local40 = this.anInt4413 + this.anInt4422 - this.anInt4421;
			} else {
				local40 = this.anInt4422 - this.anInt4421;
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
