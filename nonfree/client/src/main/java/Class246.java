import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nfa")
public final class Class246 implements Runnable {

	@OriginalMember(owner = "client!nfa", name = "d", descriptor = "Ljava/io/IOException;")
	private IOException anIOException1;

	@OriginalMember(owner = "client!nfa", name = "b", descriptor = "I")
	private int anInt6551 = 0;

	@OriginalMember(owner = "client!nfa", name = "n", descriptor = "I")
	private int anInt6558 = 0;

	@OriginalMember(owner = "client!nfa", name = "c", descriptor = "I")
	private final int anInt6552;

	@OriginalMember(owner = "client!nfa", name = "j", descriptor = "Ljava/io/InputStream;")
	private InputStream anInputStream2;

	@OriginalMember(owner = "client!nfa", name = "f", descriptor = "[B")
	private final byte[] aByteArray56;

	@OriginalMember(owner = "client!nfa", name = "l", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread5;

	@OriginalMember(owner = "client!nfa", name = "<init>", descriptor = "(Ljava/io/InputStream;I)V")
	public Class246(@OriginalArg(0) InputStream arg0, @OriginalArg(1) int arg1) {
		this.anInt6552 = arg1 + 1;
		this.anInputStream2 = arg0;
		this.aByteArray56 = new byte[this.anInt6552];
		this.aThread5 = new Thread(this);
		this.aThread5.setDaemon(true);
		this.aThread5.start();
	}

	@OriginalMember(owner = "client!nfa", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(37) int local37;
			synchronized (this) {
				while (true) {
					if (this.anIOException1 != null) {
						return;
					}
					if (this.anInt6551 == 0) {
						local37 = this.anInt6552 - this.anInt6558 - 1;
					} else if (this.anInt6558 > this.anInt6551) {
						local37 = this.anInt6552 - this.anInt6558;
					} else {
						local37 = this.anInt6551 - this.anInt6558 - 1;
					}
					if (local37 > 0) {
						break;
					}
					try {
						this.wait();
					} catch (@Pc(68) InterruptedException local68) {
					}
				}
			}
			@Pc(85) int local85;
			try {
				local85 = this.anInputStream2.read(this.aByteArray56, this.anInt6558, local37);
				if (local85 == -1) {
					throw new EOFException();
				}
			} catch (@Pc(93) IOException local93) {
				@Pc(93) IOException local93x = local93;
				synchronized (this) {
					this.anIOException1 = local93x;
					return;
				}
			}
			synchronized (this) {
				this.anInt6558 = (this.anInt6558 + local85) % this.anInt6552;
			}
		}
	}

	@OriginalMember(owner = "client!nfa", name = "a", descriptor = "(III[B)I")
	public int method5501(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) byte[] arg2) throws IOException {
		if (arg1 < 0 || arg0 < 0 || arg0 + arg1 > arg2.length) {
			throw new IOException();
		}
		synchronized (this) {
			@Pc(45) int local45;
			if (this.anInt6551 <= this.anInt6558) {
				local45 = this.anInt6558 - this.anInt6551;
			} else {
				local45 = this.anInt6552 + this.anInt6558 - this.anInt6551;
			}
			if (local45 < arg1) {
				arg1 = local45;
			}
			if (arg1 == 0 && this.anIOException1 != null) {
				throw new IOException(this.anIOException1.toString());
			}
			if (arg1 + this.anInt6551 > this.anInt6552) {
				@Pc(99) int local99 = this.anInt6552 - this.anInt6551;
				Static681.method4034(this.aByteArray56, this.anInt6551, arg2, arg0, local99);
				Static681.method4034(this.aByteArray56, 0, arg2, arg0 + local99, arg1 + -local99);
			} else {
				Static681.method4034(this.aByteArray56, this.anInt6551, arg2, arg0, arg1);
			}
			this.anInt6551 = (arg1 + this.anInt6551) % this.anInt6552;
			this.notifyAll();
			return arg1;
		}
	}

	@OriginalMember(owner = "client!nfa", name = "a", descriptor = "(II)Z")
	public boolean method5502(@OriginalArg(1) int arg0) throws IOException {
		if (arg0 <= 0 || this.anInt6552 <= arg0) {
			throw new IOException();
		}
		synchronized (this) {
			@Pc(48) int local48;
			if (this.anInt6558 >= this.anInt6551) {
				local48 = this.anInt6558 - this.anInt6551;
			} else {
				local48 = this.anInt6552 + this.anInt6558 - this.anInt6551;
			}
			if (arg0 <= local48) {
				return true;
			} else if (this.anIOException1 == null) {
				return false;
			} else {
				throw new IOException(this.anIOException1.toString());
			}
		}
	}

	@OriginalMember(owner = "client!nfa", name = "a", descriptor = "(I)V")
	public void method5504() {
		this.anInputStream2 = new InputStream_Sub1();
	}

	@OriginalMember(owner = "client!nfa", name = "a", descriptor = "(B)V")
	public void method5505() {
		synchronized (this) {
			if (this.anIOException1 == null) {
				this.anIOException1 = new IOException("");
			}
			this.notifyAll();
		}
		try {
			this.aThread5.join();
		} catch (@Pc(29) InterruptedException local29) {
		}
	}
}
