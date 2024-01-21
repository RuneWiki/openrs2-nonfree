import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ne")
public final class Class2_Sub1_Sub19 extends Class2_Sub1 {

	@OriginalMember(owner = "client!ne", name = "U", descriptor = "I")
	private int anInt2807 = 204;

	@OriginalMember(owner = "client!ne", name = "P", descriptor = "I")
	private int anInt2804 = 1;

	@OriginalMember(owner = "client!ne", name = "bb", descriptor = "I")
	private int anInt2812 = 1;

	@OriginalMember(owner = "client!ne", name = "<init>", descriptor = "()V")
	public Class2_Sub1_Sub19() {
		super(0, true);
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(ZI)[I")
	@Override
	public int[] method3256(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass52_41.method1596(arg0);
		if (super.aClass52_41.aBoolean103) {
			for (@Pc(22) int local22 = 0; local22 < Static135.anInt2897; local22++) {
				@Pc(28) int local28 = Static107.anIntArray304[local22];
				@Pc(32) int local32 = Static81.anIntArray174[arg0];
				@Pc(39) int local39 = local28 * this.anInt2812 >> 12;
				@Pc(49) int local49 = local28 % (4096 / this.anInt2812) * this.anInt2812;
				@Pc(56) int local56 = local32 * this.anInt2804 >> 12;
				@Pc(66) int local66 = local32 % (4096 / this.anInt2804) * this.anInt2804;
				if (this.anInt2807 > local66) {
					for (local39 -= local56; local39 < 0; local39 += 4) {
					}
					while (local39 > 3) {
						local39 -= 4;
					}
					if (local39 != 1) {
						local11[local22] = 0;
						continue;
					}
					if (local49 < this.anInt2807) {
						local11[local22] = 0;
						continue;
					}
				}
				if (this.anInt2807 > local49) {
					for (local39 -= local56; local39 < 0; local39 += 4) {
					}
					while (local39 > 3) {
						local39 -= 4;
					}
					if (local39 > 0) {
						local11[local22] = 0;
						continue;
					}
				}
				local11[local22] = 4096;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(Lclient!ra;IZ)V")
	@Override
	public void method3264(@OriginalArg(0) Class2_Sub3 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt2812 = arg0.method260();
		} else if (arg1 == 1) {
			this.anInt2804 = arg0.method260();
		} else if (arg1 == 2) {
			this.anInt2807 = arg0.method269();
		}
	}
}
