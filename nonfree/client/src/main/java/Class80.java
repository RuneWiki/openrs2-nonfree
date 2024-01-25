import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!em")
public final class Class80 implements Runnable {

	@OriginalMember(owner = "client!em", name = "c", descriptor = "Ljava/io/IOException;")
	private IOException anIOException2;

	@OriginalMember(owner = "client!em", name = "e", descriptor = "I")
	private int anInt2725 = 0;

	@OriginalMember(owner = "client!em", name = "j", descriptor = "I")
	private int anInt2728 = 0;

	@OriginalMember(owner = "client!em", name = "g", descriptor = "Ljava/io/InputStream;")
	private InputStream anInputStream1;

	@OriginalMember(owner = "client!em", name = "f", descriptor = "I")
	private final int anInt2726;

	@OriginalMember(owner = "client!em", name = "d", descriptor = "[B")
	private final byte[] aByteArray31;

	@OriginalMember(owner = "client!em", name = "m", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread2;

	@OriginalMember(owner = "client!em", name = "<init>", descriptor = "(Ljava/io/InputStream;I)V")
	public Class80(@OriginalArg(0) InputStream arg0, @OriginalArg(1) int arg1) {
		this.anInputStream1 = arg0;
		this.anInt2726 = arg1 + 1;
		this.aByteArray31 = new byte[this.anInt2726];
		this.aThread2 = new Thread(this);
		this.aThread2.setDaemon(true);
		this.aThread2.start();
	}

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(I)V")
	public void method2487() {
		this.anInputStream1 = new InputStream_Sub1();
	}

	@OriginalMember(owner = "client!em", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(26) int local26;
			synchronized (this) {
				while (true) {
					if (this.anIOException2 != null) {
						return;
					}
					if (this.anInt2725 == 0) {
						local26 = this.anInt2726 - this.anInt2728 - 1;
					} else if (this.anInt2725 < this.anInt2728) {
						local26 = this.anInt2726 - this.anInt2728;
					} else {
						local26 = this.anInt2725 - this.anInt2728 - 1;
					}
					if (local26 > 0) {
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
				local77 = this.anInputStream1.read(this.aByteArray31, this.anInt2728, local26);
				if (local77 == -1) {
					throw new EOFException();
				}
			} catch (@Pc(85) IOException local85) {
				@Pc(85) IOException local85x = local85;
				synchronized (this) {
					this.anIOException2 = local85x;
					return;
				}
			}
			synchronized (this) {
				this.anInt2728 = (local77 + this.anInt2728) % this.anInt2726;
			}
		}
	}

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(II)Z")
	public boolean method2488(@OriginalArg(1) int arg0) throws IOException {
		if (arg0 <= 0 || arg0 >= this.anInt2726) {
			throw new IOException();
		}
		synchronized (this) {
			@Pc(37) int local37;
			if (this.anInt2728 >= this.anInt2725) {
				local37 = this.anInt2728 - this.anInt2725;
			} else {
				local37 = this.anInt2726 + this.anInt2728 - this.anInt2725;
			}
			if (arg0 <= local37) {
				return true;
			} else if (this.anIOException2 == null) {
				return false;
			} else {
				throw new IOException(this.anIOException2.toString());
			}
		}
	}

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(I[BII)I")
	public int method2489(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) throws IOException {
		if (arg2 < 0 || arg0 < 0 || arg0 + arg2 > arg1.length) {
			throw new IOException();
		}
		synchronized (this) {
			@Pc(42) int local42;
			if (this.anInt2725 > this.anInt2728) {
				local42 = this.anInt2728 + this.anInt2726 - this.anInt2725;
			} else {
				local42 = this.anInt2728 - this.anInt2725;
			}
			if (local42 < arg2) {
				arg2 = local42;
			}
			if (arg2 == 0 && this.anIOException2 != null) {
				throw new IOException(this.anIOException2.toString());
			}
			if (arg2 + this.anInt2725 <= this.anInt2726) {
				Static604.method5910(this.aByteArray31, this.anInt2725, arg1, arg0, arg2);
			} else {
				@Pc(102) int local102 = this.anInt2726 - this.anInt2725;
				Static604.method5910(this.aByteArray31, this.anInt2725, arg1, arg0, local102);
				Static604.method5910(this.aByteArray31, 0, arg1, local102 + arg0, -local102 + arg2);
			}
			this.anInt2725 = (arg2 + this.anInt2725) % this.anInt2726;
			this.notifyAll();
			return arg2;
		}
	}

	@OriginalMember(owner = "client!em", name = "b", descriptor = "(I)V")
	public void method2490() {
		synchronized (this) {
			if (this.anIOException2 == null) {
				this.anIOException2 = new IOException("");
			}
			this.notifyAll();
		}
		try {
			this.aThread2.join();
		} catch (@Pc(29) InterruptedException local29) {
		}
	}
}
