import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mi")
public final class Class2_Sub4_Sub23 extends Class2_Sub4 {

	@OriginalMember(owner = "client!mi", name = "U", descriptor = "I")
	private int anInt2797 = 204;

	@OriginalMember(owner = "client!mi", name = "ab", descriptor = "I")
	private int anInt2798 = 1;

	@OriginalMember(owner = "client!mi", name = "ib", descriptor = "I")
	private int anInt2804 = 1;

	@OriginalMember(owner = "client!mi", name = "<init>", descriptor = "()V")
	public Class2_Sub4_Sub23() {
		super(0, true);
	}

	@OriginalMember(owner = "client!mi", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method3127(@OriginalArg(0) int arg0) {
		@Pc(7) int[] local7 = super.aClass78_41.method2318(arg0);
		if (super.aClass78_41.aBoolean144) {
			for (@Pc(17) int local17 = 0; local17 < Static118.anInt2608; local17++) {
				@Pc(23) int local23 = Static141.anIntArray130[local17];
				@Pc(30) int local30 = this.anInt2798 * local23 >> 12;
				@Pc(40) int local40 = this.anInt2798 * (local23 % (4096 / this.anInt2798));
				@Pc(44) int local44 = Static2.anIntArray5[arg0];
				@Pc(51) int local51 = local44 * this.anInt2804 >> 12;
				@Pc(61) int local61 = this.anInt2804 * (local44 % (4096 / this.anInt2804));
				if (local61 < this.anInt2797) {
					for (local30 -= local51; local30 < 0; local30 += 4) {
					}
					while (local30 > 3) {
						local30 -= 4;
					}
					if (local30 != 1) {
						local7[local17] = 0;
						continue;
					}
					if (this.anInt2797 > local40) {
						local7[local17] = 0;
						continue;
					}
				}
				if (local40 < this.anInt2797) {
					for (local30 -= local51; local30 < 0; local30 += 4) {
					}
					while (local30 > 3) {
						local30 -= 4;
					}
					if (local30 > 0) {
						local7[local17] = 0;
						continue;
					}
				}
				local7[local17] = 4096;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(IBLclient!kd;)V")
	@Override
	public void method3120(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub11 arg1) {
		if (arg0 == 0) {
			this.anInt2798 = arg1.method1534();
		} else if (arg0 == 1) {
			this.anInt2804 = arg1.method1534();
		} else if (arg0 == 2) {
			this.anInt2797 = arg1.method1557();
		}
	}
}
