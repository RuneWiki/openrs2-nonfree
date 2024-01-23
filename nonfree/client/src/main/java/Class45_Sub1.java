import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hn")
public final class Class45_Sub1 extends Class45 {

	@OriginalMember(owner = "client!hn", name = "l", descriptor = "I")
	private int anInt2304 = 1;

	@OriginalMember(owner = "client!hn", name = "p", descriptor = "J")
	private long aLong83 = 0L;

	@OriginalMember(owner = "client!hn", name = "o", descriptor = "J")
	private long aLong82 = 0L;

	@OriginalMember(owner = "client!hn", name = "m", descriptor = "J")
	private long aLong81 = 0L;

	@OriginalMember(owner = "client!hn", name = "q", descriptor = "I")
	private int anInt2305 = 0;

	@OriginalMember(owner = "client!hn", name = "n", descriptor = "[J")
	private long[] aLongArray7 = new long[10];

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(B)V")
	@Override
	public void method4593() {
		if (this.aLong83 < this.aLong81) {
			this.aLong83 += this.aLong81 - this.aLong83;
		}
		this.aLong82 = 0L;
	}

	@OriginalMember(owner = "client!hn", name = "b", descriptor = "(I)J")
	private long method1991() {
		@Pc(6) long local6 = Static298.method4535() * 1000000L;
		@Pc(12) long local12 = local6 - this.aLong82;
		@Pc(14) long local14 = 0L;
		this.aLong82 = local6;
		if (local12 > -5000000000L && local12 < 5000000000L) {
			this.aLongArray7[this.anInt2305] = local12;
			if (this.anInt2304 < 10) {
				this.anInt2304++;
			}
			this.anInt2305 = (this.anInt2305 + 1) % 10;
		}
		for (@Pc(55) int local55 = 1; local55 <= this.anInt2304; local55++) {
			local14 += this.aLongArray7[(this.anInt2305 + 10 - local55) % 10];
		}
		return local14 / (long) this.anInt2304;
	}

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(IBI)I")
	@Override
	public int method4592(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(9) long local9 = (long) arg1 * 1000000L;
		Static282.method4345((long) arg0);
		this.aLong83 += this.method1991();
		if (this.aLong83 < this.aLong81) {
			Static282.method4345((this.aLong81 - this.aLong83) / 1000000L);
			this.aLong82 += this.aLong81 - this.aLong83;
			this.aLong83 += this.aLong81 - this.aLong83;
			this.aLong81 += local9;
			return 1;
		}
		@Pc(72) int local72 = 0;
		do {
			local72++;
			this.aLong81 += local9;
		} while (local72 < 10 && this.aLong81 < this.aLong83);
		if (this.aLong81 < this.aLong83) {
			this.aLong81 = this.aLong83;
		}
		return local72;
	}

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(I)J")
	@Override
	public long method4595() {
		return this.aLong83;
	}
}
