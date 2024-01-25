import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ho")
public final class Class103_Sub1 extends Class103 {

	@OriginalMember(owner = "client!ho", name = "k", descriptor = "J")
	private long aLong80 = 0L;

	@OriginalMember(owner = "client!ho", name = "l", descriptor = "J")
	private long aLong81 = 0L;

	@OriginalMember(owner = "client!ho", name = "m", descriptor = "[J")
	private final long[] aLongArray5 = new long[10];

	@OriginalMember(owner = "client!ho", name = "n", descriptor = "I")
	private int anInt2588 = 1;

	@OriginalMember(owner = "client!ho", name = "p", descriptor = "I")
	private int anInt2589 = 0;

	@OriginalMember(owner = "client!ho", name = "o", descriptor = "J")
	private long aLong82 = 0L;

	@OriginalMember(owner = "client!ho", name = "<init>", descriptor = "()V")
	public Class103_Sub1() {
		this.aLong80 = System.nanoTime();
		this.aLong81 = System.nanoTime();
	}

	@OriginalMember(owner = "client!ho", name = "b", descriptor = "(I)V")
	@Override
	public void method4087() {
		if (this.aLong80 < this.aLong81) {
			this.aLong80 += this.aLong81 - this.aLong80;
		}
		this.aLong82 = 0L;
	}

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "(BI)I")
	@Override
	public int method4086(@OriginalArg(1) int arg0) {
		@Pc(11) long local11 = (long) arg0 * 1000000L;
		this.aLong80 += this.method2427();
		if (this.aLong80 < this.aLong81) {
			Static185.method3004((this.aLong81 - this.aLong80) / 1000000L);
			this.aLong82 += this.aLong81 - this.aLong80;
			this.aLong80 += this.aLong81 - this.aLong80;
			this.aLong81 += local11;
			return 1;
		}
		@Pc(31) int local31 = 0;
		do {
			this.aLong81 += local11;
			local31++;
		} while (local31 < 10 && this.aLong81 < this.aLong80);
		if (this.aLong80 > this.aLong81) {
			this.aLong81 = this.aLong80;
		}
		return local31;
	}

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "(I)J")
	@Override
	public long method4084() {
		return this.aLong80;
	}

	@OriginalMember(owner = "client!ho", name = "c", descriptor = "(I)J")
	private long method2427() {
		@Pc(6) long local6 = System.nanoTime();
		@Pc(12) long local12 = local6 - this.aLong82;
		this.aLong82 = local6;
		if (local12 > -5000000000L && local12 < 5000000000L) {
			this.aLongArray5[this.anInt2589] = local12;
			this.anInt2589 = (this.anInt2589 + 1) % 10;
			if (this.anInt2588 < 1) {
				this.anInt2588++;
			}
		}
		@Pc(57) long local57 = 0L;
		for (@Pc(59) int local59 = 1; local59 <= this.anInt2588; local59++) {
			local57 += this.aLongArray5[(this.anInt2589 + 10 - local59) % 10];
		}
		return local57 / (long) this.anInt2588;
	}
}
