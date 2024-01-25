import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!f")
public final class Class10_Sub1 extends Class10 {

	@OriginalMember(owner = "client!f", name = "e", descriptor = "[J")
	private final long[] aLongArray1 = new long[10];

	@OriginalMember(owner = "client!f", name = "d", descriptor = "I")
	private int anInt1453 = 0;

	@OriginalMember(owner = "client!f", name = "i", descriptor = "J")
	private long aLong51 = 0L;

	@OriginalMember(owner = "client!f", name = "f", descriptor = "J")
	private long aLong49 = 0L;

	@OriginalMember(owner = "client!f", name = "h", descriptor = "I")
	private int anInt1454 = 1;

	@OriginalMember(owner = "client!f", name = "g", descriptor = "J")
	private long aLong50 = 0L;

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(II)I")
	@Override
	public int method3295(@OriginalArg(1) int arg0) {
		this.aLong49 += this.method1362();
		@Pc(18) long local18 = (long) arg0 * 1000000L;
		if (this.aLong49 < this.aLong51) {
			Static278.method5283((this.aLong51 - this.aLong49) / 1000000L);
			this.aLong50 += this.aLong51 - this.aLong49;
			this.aLong49 += this.aLong51 - this.aLong49;
			this.aLong51 += local18;
			return 1;
		}
		@Pc(26) int local26 = 0;
		do {
			local26++;
			this.aLong51 += local18;
		} while (local26 < 10 && this.aLong49 > this.aLong51);
		if (this.aLong49 > this.aLong51) {
			this.aLong51 = this.aLong49;
		}
		return local26;
	}

	@OriginalMember(owner = "client!f", name = "c", descriptor = "(B)J")
	private long method1362() {
		@Pc(4) long local4 = Static245.method4300() * 1000000L;
		@Pc(9) long local9 = local4 - this.aLong50;
		this.aLong50 = local4;
		if (local9 > -5000000000L && local9 < 5000000000L) {
			this.aLongArray1[this.anInt1453] = local9;
			this.anInt1453 = (this.anInt1453 + 1) % 10;
			if (this.anInt1454 < 10) {
				this.anInt1454++;
			}
		}
		@Pc(55) long local55 = 0L;
		for (@Pc(57) int local57 = 1; local57 <= this.anInt1454; local57++) {
			local55 += this.aLongArray1[(this.anInt1453 + 10 - local57) % 10];
		}
		return local55 / (long) this.anInt1454;
	}

	@OriginalMember(owner = "client!f", name = "b", descriptor = "(B)J")
	@Override
	public long method3296() {
		return this.aLong49;
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(I)V")
	@Override
	public void method3298() {
		if (this.aLong51 > this.aLong49) {
			this.aLong49 += this.aLong51 - this.aLong49;
		}
		this.aLong50 = 0L;
	}
}
