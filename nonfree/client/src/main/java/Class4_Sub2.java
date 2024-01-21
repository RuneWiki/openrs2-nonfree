import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ve")
public final class Class4_Sub2 extends Class4 {

	@OriginalMember(owner = "client!ve", name = "w", descriptor = "I")
	private int anInt2797;

	@OriginalMember(owner = "client!ve", name = "K", descriptor = "I")
	private int anInt2803;

	@OriginalMember(owner = "client!ve", name = "L", descriptor = "I")
	private int anInt2804;

	@OriginalMember(owner = "client!ve", name = "M", descriptor = "I")
	private int anInt2805;

	@OriginalMember(owner = "client!ve", name = "R", descriptor = "J")
	private long aLong91;

	@OriginalMember(owner = "client!ve", name = "I", descriptor = "[J")
	private final long[] aLongArray5 = new long[10];

	@OriginalMember(owner = "client!ve", name = "<init>", descriptor = "()V")
	public Class4_Sub2() {
		this.method1908();
	}

	@OriginalMember(owner = "client!ve", name = "c", descriptor = "(I)V")
	@Override
	public void method1910() {
		for (@Pc(7) int local7 = 0; local7 < 10; local7++) {
			this.aLongArray5[local7] = 0L;
		}
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(IZI)I")
	@Override
	public int method1913(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(9) int local9 = this.anInt2797;
		@Pc(16) int local16 = this.anInt2804;
		this.anInt2804 = 300;
		this.anInt2797 = 1;
		this.aLong91 = Static89.method1462();
		if (this.aLongArray5[this.anInt2803] == 0L) {
			this.anInt2804 = local16;
			this.anInt2797 = local9;
		} else if (this.aLongArray5[this.anInt2803] < this.aLong91) {
			this.anInt2804 = (int) ((long) (arg1 * 2560) / (this.aLong91 - this.aLongArray5[this.anInt2803]));
		}
		if (this.anInt2804 < 25) {
			this.anInt2804 = 25;
		}
		if (this.anInt2804 > 256) {
			this.anInt2804 = 256;
			this.anInt2797 = (int) ((long) arg1 - (this.aLong91 - this.aLongArray5[this.anInt2803]) / 10L);
		}
		if (this.anInt2797 > arg1) {
			this.anInt2797 = arg1;
		}
		this.aLongArray5[this.anInt2803] = this.aLong91;
		this.anInt2803 = (this.anInt2803 + 1) % 10;
		@Pc(136) int local136;
		if (this.anInt2797 > 1) {
			for (local136 = 0; local136 < 10; local136++) {
				if (this.aLongArray5[local136] != 0L) {
					this.aLongArray5[local136] -= -((long) this.anInt2797);
				}
			}
		}
		if (this.anInt2797 < arg0) {
			this.anInt2797 = arg0;
		}
		Static40.method822((long) this.anInt2797);
		local136 = 0;
		while (this.anInt2805 < 256) {
			local136++;
			this.anInt2805 += this.anInt2804;
		}
		this.anInt2805 &= 0xFF;
		return local136;
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(I)V")
	@Override
	public void method1908() {
		this.anInt2797 = 1;
		this.anInt2805 = 0;
		this.anInt2804 = 256;
		this.aLong91 = Static89.method1462();
		for (@Pc(21) int local21 = 0; local21 < 10; local21++) {
			this.aLongArray5[local21] = this.aLong91;
		}
	}
}
