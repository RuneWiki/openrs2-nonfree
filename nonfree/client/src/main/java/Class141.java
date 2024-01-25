import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lc")
public final class Class141 implements Runnable {

	@OriginalMember(owner = "client!lc", name = "b", descriptor = "Ljava/io/IOException;")
	private IOException anIOException2;

	@OriginalMember(owner = "client!lc", name = "e", descriptor = "I")
	private int anInt4429 = 0;

	@OriginalMember(owner = "client!lc", name = "k", descriptor = "I")
	private int anInt4433 = 0;

	@OriginalMember(owner = "client!lc", name = "h", descriptor = "Ljava/io/InputStream;")
	private InputStream anInputStream2;

	@OriginalMember(owner = "client!lc", name = "c", descriptor = "I")
	private final int anInt4428;

	@OriginalMember(owner = "client!lc", name = "l", descriptor = "[B")
	private final byte[] aByteArray59;

	@OriginalMember(owner = "client!lc", name = "d", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread2;

	static {
		new Class21("You are not currently in a clan channel.", "Du befindest dich derzeit nicht in einem Chatraum.", "Vous n'êtes pas dans un canal de clan.", "No momento você não está em um canal de clã.");
	}

	@OriginalMember(owner = "client!lc", name = "<init>", descriptor = "(Ljava/io/InputStream;I)V")
	public Class141(@OriginalArg(0) InputStream arg0, @OriginalArg(1) int arg1) {
		this.anInputStream2 = arg0;
		this.anInt4428 = arg1 + 1;
		this.aByteArray59 = new byte[this.anInt4428];
		this.aThread2 = new Thread(this);
		this.aThread2.setDaemon(true);
		this.aThread2.start();
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(II)Z")
	public boolean method3805(@OriginalArg(0) int arg0) throws IOException {
		if (arg0 <= 0 || arg0 >= this.anInt4428) {
			throw new IndexOutOfBoundsException();
		}
		synchronized (this) {
			@Pc(40) int local40;
			if (this.anInt4429 < this.anInt4433) {
				local40 = this.anInt4429 + this.anInt4428 - this.anInt4433;
			} else {
				local40 = this.anInt4429 - this.anInt4433;
			}
			if (arg0 <= local40) {
				return true;
			} else if (this.anIOException2 == null) {
				return false;
			} else {
				throw new IOException(this.anIOException2.toString());
			}
		}
	}

	@OriginalMember(owner = "client!lc", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(39) int local39;
			synchronized (this) {
				while (true) {
					if (this.anIOException2 != null) {
						return;
					}
					if (this.anInt4433 == 0) {
						local39 = this.anInt4428 - this.anInt4429 - 1;
					} else if (this.anInt4433 >= this.anInt4429) {
						local39 = this.anInt4433 - this.anInt4429 - 1;
					} else {
						local39 = this.anInt4428 - this.anInt4429;
					}
					if (local39 > 0) {
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
				local81 = this.anInputStream2.read(this.aByteArray59, this.anInt4429, local39);
				if (local81 == -1) {
					throw new EOFException();
				}
			} catch (@Pc(90) IOException local90) {
				@Pc(90) IOException local90x = local90;
				synchronized (this) {
					this.anIOException2 = local90x;
					return;
				}
			}
			synchronized (this) {
				this.anInt4429 = (this.anInt4429 + local81) % this.anInt4428;
			}
		}
	}

	@OriginalMember(owner = "client!lc", name = "c", descriptor = "(I)V")
	public void method3809() {
		this.anInputStream2 = new InputStream_Sub2();
	}

	@OriginalMember(owner = "client!lc", name = "d", descriptor = "(I)V")
	public void method3810() {
		synchronized (this) {
			if (this.anIOException2 == null) {
				this.anIOException2 = new IOException("");
			}
			this.notifyAll();
		}
		try {
			this.aThread2.join();
		} catch (@Pc(33) InterruptedException local33) {
		}
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "([BIIB)I")
	public int method3811(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		if (arg1 < 0 || arg2 < 0 || arg0.length < arg1 + arg2) {
			throw new IndexOutOfBoundsException();
		}
		synchronized (this) {
			@Pc(46) int local46;
			if (this.anInt4429 >= this.anInt4433) {
				local46 = this.anInt4429 - this.anInt4433;
			} else {
				local46 = this.anInt4429 + this.anInt4428 - this.anInt4433;
			}
			if (local46 < arg1) {
				arg1 = local46;
			}
			if (arg1 == 0 && this.anIOException2 != null) {
				throw new IOException(this.anIOException2.toString());
			}
			if (arg1 + this.anInt4433 <= this.anInt4428) {
				Static474.method3327(this.aByteArray59, this.anInt4433, arg0, arg2, arg1);
			} else {
				@Pc(102) int local102 = this.anInt4428 - this.anInt4433;
				Static474.method3327(this.aByteArray59, this.anInt4433, arg0, arg2, local102);
				Static474.method3327(this.aByteArray59, 0, arg0, arg2 + local102, arg1 - local102);
			}
			this.anInt4433 = (this.anInt4433 + arg1) % this.anInt4428;
			this.notifyAll();
			return arg1;
		}
	}
}
