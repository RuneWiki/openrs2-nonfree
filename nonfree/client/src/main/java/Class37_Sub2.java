import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eb")
public final class Class37_Sub2 extends Class37 {

	@OriginalMember(owner = "client!eb", name = "n", descriptor = "J")
	private long aLong50 = 0L;

	@OriginalMember(owner = "client!eb", name = "o", descriptor = "[J")
	private long[] aLongArray31 = new long[10];

	@OriginalMember(owner = "client!eb", name = "l", descriptor = "I")
	private int anInt1028 = 0;

	@OriginalMember(owner = "client!eb", name = "p", descriptor = "J")
	private long aLong51 = 0L;

	@OriginalMember(owner = "client!eb", name = "q", descriptor = "I")
	private int anInt1029 = 1;

	@OriginalMember(owner = "client!eb", name = "m", descriptor = "J")
	private long aLong49 = 0L;

	@OriginalMember(owner = "client!eb", name = "d", descriptor = "(I)J")
	private long method919() {
		@Pc(4) long local4 = Static135.method2186() * 1000000L;
		@Pc(9) long local9 = local4 - this.aLong51;
		this.aLong51 = local4;
		if (local9 > -5000000000L && local9 < 5000000000L) {
			this.aLongArray31[this.anInt1028] = local9;
			this.anInt1028 = (this.anInt1028 + 1) % 10;
			if (this.anInt1029 < 10) {
				this.anInt1029++;
			}
		}
		@Pc(55) long local55 = 0L;
		for (@Pc(57) int local57 = 1; local57 <= this.anInt1029; local57++) {
			local55 += this.aLongArray31[(this.anInt1028 + 10 - local57) % 10];
		}
		return local55 / (long) this.anInt1029;
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(B)J")
	@Override
	public long method2929() {
		return this.aLong49;
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(Z)V")
	@Override
	public void method2928() {
		this.aLong51 = 0L;
		if (this.aLong49 < this.aLong50) {
			this.aLong49 += this.aLong50 - this.aLong49;
		}
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(III)I")
	@Override
	public int method2935(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		Static202.method3246((long) arg0);
		this.aLong49 += this.method919();
		@Pc(16) long local16 = (long) arg1 * 1000000L;
		if (this.aLong50 > this.aLong49) {
			Static202.method3246((this.aLong50 - this.aLong49) / 1000000L);
			this.aLong51 += this.aLong50 - this.aLong49;
			this.aLong49 += this.aLong50 - this.aLong49;
			this.aLong50 += local16;
			return 1;
		}
		@Pc(69) int local69 = 0;
		do {
			local69++;
			this.aLong50 += local16;
		} while (local69 < 10 && this.aLong49 > this.aLong50);
		if (this.aLong49 > this.aLong50) {
			this.aLong50 = this.aLong49;
		}
		return local69;
	}
}
