import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nd")
public final class Class1_Sub3_Sub28 extends Class1_Sub3 {

	@OriginalMember(owner = "client!nd", name = "X", descriptor = "I")
	private int anInt2849 = 1;

	@OriginalMember(owner = "client!nd", name = "T", descriptor = "I")
	private int anInt2847 = 1;

	@OriginalMember(owner = "client!nd", name = "eb", descriptor = "I")
	private int anInt2854 = 204;

	@OriginalMember(owner = "client!nd", name = "<init>", descriptor = "()V")
	public Class1_Sub3_Sub28() {
		super(0, true);
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method3475(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = super.aClass79_41.method2341(arg0);
		if (super.aClass79_41.aBoolean125) {
			for (@Pc(22) int local22 = 0; local22 < Static76.anInt1531; local22++) {
				@Pc(28) int local28 = Static23.anIntArray47[arg0];
				@Pc(32) int local32 = Static106.anIntArray202[local22];
				@Pc(39) int local39 = local32 * this.anInt2849 >> 12;
				@Pc(46) int local46 = local28 * this.anInt2847 >> 12;
				@Pc(56) int local56 = local32 % (4096 / this.anInt2849) * this.anInt2849;
				@Pc(66) int local66 = local28 % (4096 / this.anInt2847) * this.anInt2847;
				if (this.anInt2854 > local66) {
					for (local39 -= local46; local39 < 0; local39 += 4) {
					}
					while (local39 > 3) {
						local39 -= 4;
					}
					if (local39 != 1) {
						local16[local22] = 0;
						continue;
					}
					if (local56 < this.anInt2854) {
						local16[local22] = 0;
						continue;
					}
				}
				if (this.anInt2854 > local56) {
					for (local39 -= local46; local39 < 0; local39 += 4) {
					}
					while (local39 > 3) {
						local39 -= 4;
					}
					if (local39 > 0) {
						local16[local22] = 0;
						continue;
					}
				}
				local16[local22] = 4096;
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(IILclient!pg;)V")
	@Override
	public void method3466(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub17 arg1) {
		if (arg0 == 0) {
			this.anInt2849 = arg1.method2142();
		} else if (arg0 == 1) {
			this.anInt2847 = arg1.method2142();
		} else if (arg0 == 2) {
			this.anInt2854 = arg1.method2178();
		}
	}
}
