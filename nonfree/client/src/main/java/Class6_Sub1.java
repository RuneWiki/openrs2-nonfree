import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ag")
public final class Class6_Sub1 extends Class6 {

	@OriginalMember(owner = "client!ag", name = "h", descriptor = "J")
	private long aLong8 = 0L;

	@OriginalMember(owner = "client!ag", name = "i", descriptor = "J")
	private long aLong9 = 0L;

	@OriginalMember(owner = "client!ag", name = "j", descriptor = "[J")
	private final long[] aLongArray1 = new long[10];

	@OriginalMember(owner = "client!ag", name = "l", descriptor = "I")
	private int anInt154 = 0;

	@OriginalMember(owner = "client!ag", name = "m", descriptor = "J")
	private long aLong10 = 0L;

	@OriginalMember(owner = "client!ag", name = "k", descriptor = "I")
	private int anInt153 = 1;

	@OriginalMember(owner = "client!ag", name = "<init>", descriptor = "()V")
	public Class6_Sub1() {
		this.aLong9 = System.nanoTime();
		this.aLong8 = System.nanoTime();
	}

	@OriginalMember(owner = "client!ag", name = "b", descriptor = "(I)V")
	@Override
	public void method4871() {
		if (this.aLong9 < this.aLong8) {
			this.aLong9 += this.aLong8 - this.aLong9;
		}
		this.aLong10 = 0L;
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(II)I")
	@Override
	public int method4870(@OriginalArg(1) int arg0) {
		this.aLong9 += this.method136();
		@Pc(20) long local20 = (long) arg0 * 1000000L;
		if (this.aLong8 > this.aLong9) {
			Static248.method4401((this.aLong8 - this.aLong9) / 1000000L);
			this.aLong10 += this.aLong8 - this.aLong9;
			this.aLong9 += this.aLong8 - this.aLong9;
			this.aLong8 += local20;
			return 1;
		}
		@Pc(72) int local72 = 0;
		do {
			local72++;
			this.aLong8 += local20;
		} while (local72 < 10 && this.aLong8 < this.aLong9);
		if (this.aLong8 < this.aLong9) {
			this.aLong8 = this.aLong9;
		}
		return local72;
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(B)J")
	@Override
	public long method4867() {
		return this.aLong9;
	}

	@OriginalMember(owner = "client!ag", name = "d", descriptor = "(I)J")
	private long method136() {
		@Pc(1) long local1 = System.nanoTime();
		@Pc(7) long local7 = local1 - this.aLong10;
		this.aLong10 = local1;
		if (local7 > -5000000000L && local7 < 5000000000L) {
			this.aLongArray1[this.anInt154] = local7;
			this.anInt154 = (this.anInt154 + 1) % 10;
			if (this.anInt153 < 1) {
				this.anInt153++;
			}
		}
		@Pc(51) long local51 = (long) 0;
		for (@Pc(53) int local53 = 1; local53 <= this.anInt153; local53++) {
			local51 += this.aLongArray1[(this.anInt154 + 10 - local53) % 10];
		}
		return local51 / (long) this.anInt153;
	}
}
