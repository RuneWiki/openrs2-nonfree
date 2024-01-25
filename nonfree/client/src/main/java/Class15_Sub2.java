import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qt")
public final class Class15_Sub2 extends Class15 {

	@OriginalMember(owner = "client!qt", name = "k", descriptor = "J")
	private long aLong165 = 0L;

	@OriginalMember(owner = "client!qt", name = "m", descriptor = "I")
	private int anInt5714 = 0;

	@OriginalMember(owner = "client!qt", name = "l", descriptor = "I")
	private int anInt5713 = 1;

	@OriginalMember(owner = "client!qt", name = "j", descriptor = "[J")
	private final long[] aLongArray6 = new long[10];

	@OriginalMember(owner = "client!qt", name = "n", descriptor = "J")
	private long aLong166 = 0L;

	@OriginalMember(owner = "client!qt", name = "o", descriptor = "J")
	private long aLong167 = 0L;

	@OriginalMember(owner = "client!qt", name = "a", descriptor = "(B)V")
	@Override
	public void method6105() {
		if (this.aLong167 < this.aLong165) {
			this.aLong167 += this.aLong165 - this.aLong167;
		}
		this.aLong166 = 0L;
	}

	@OriginalMember(owner = "client!qt", name = "a", descriptor = "(II)I")
	@Override
	public int method6110(@OriginalArg(1) int arg0) {
		this.aLong167 += this.method4784();
		@Pc(12) long local12 = (long) arg0 * 1000000L;
		if (this.aLong165 > this.aLong167) {
			Static88.method4161((this.aLong165 - this.aLong167) / 1000000L);
			this.aLong166 += this.aLong165 - this.aLong167;
			this.aLong167 += this.aLong165 - this.aLong167;
			this.aLong165 += local12;
			return 1;
		}
		@Pc(31) int local31 = 0;
		do {
			this.aLong165 += local12;
			local31++;
		} while (local31 < 10 && this.aLong167 > this.aLong165);
		if (this.aLong167 > this.aLong165) {
			this.aLong165 = this.aLong167;
		}
		return local31;
	}

	@OriginalMember(owner = "client!qt", name = "b", descriptor = "(I)J")
	@Override
	public long method6111() {
		return this.aLong167;
	}

	@OriginalMember(owner = "client!qt", name = "c", descriptor = "(I)J")
	private long method4784() {
		@Pc(4) long local4 = Static449.method6552() * 1000000L;
		@Pc(9) long local9 = local4 - this.aLong166;
		this.aLong166 = local4;
		if (local9 > -5000000000L && local9 < 5000000000L) {
			this.aLongArray6[this.anInt5714] = local9;
			this.anInt5714 = (this.anInt5714 + 1) % 10;
			if (this.anInt5713 < 10) {
				this.anInt5713++;
			}
		}
		@Pc(47) long local47 = (long) 0;
		for (@Pc(49) int local49 = 1; local49 <= this.anInt5713; local49++) {
			local47 += this.aLongArray6[(this.anInt5714 + 10 - local49) % 10];
		}
		return local47 / (long) this.anInt5713;
	}
}
