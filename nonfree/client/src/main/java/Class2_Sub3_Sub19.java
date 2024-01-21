import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!og")
public final class Class2_Sub3_Sub19 extends Class2_Sub3 {

	@OriginalMember(owner = "client!og", name = "hb", descriptor = "I")
	private int anInt2900;

	@OriginalMember(owner = "client!og", name = "kb", descriptor = "I")
	private int anInt2903;

	@OriginalMember(owner = "client!og", name = "qb", descriptor = "I")
	private int anInt2907;

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(IBLclient!ab;)V")
	@Override
	public void method2904(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub2 arg1) {
		if (arg0 == 0) {
			this.anInt2900 = arg1.method1698();
		} else if (arg0 == 1) {
			this.anInt2907 = arg1.method1698();
		} else if (arg0 == 2) {
			this.anInt2903 = arg1.method1680();
		}
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method2889(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = super.aClass33_39.method1306(arg0);
		if (super.aClass33_39.aBoolean93) {
			for (@Pc(22) int local22 = 0; local22 < Static54.anInt1423; local22++) {
				@Pc(28) int local28 = Static36.anIntArray74[local22];
				@Pc(38) int local38 = local28 % (4096 / this.anInt2900) * this.anInt2900;
				@Pc(45) int local45 = local28 * this.anInt2900 >> 12;
				@Pc(49) int local49 = Static21.anIntArray50[arg0];
				@Pc(56) int local56 = this.anInt2907 * local49 >> 12;
				@Pc(66) int local66 = local49 % (4096 / this.anInt2907) * this.anInt2907;
				if (this.anInt2903 > local66) {
					for (local45 -= local56; local45 < 0; local45 += 4) {
					}
					while (local45 > 3) {
						local45 -= 4;
					}
					if (local45 != 1) {
						local16[local22] = 0;
						continue;
					}
					if (this.anInt2903 > local38) {
						local16[local22] = 0;
						continue;
					}
				}
				if (local38 < this.anInt2903) {
					for (local45 -= local56; local45 < 0; local45 += 4) {
					}
					while (local45 > 3) {
						local45 -= 4;
					}
					if (local45 > 0) {
						local16[local22] = 0;
						continue;
					}
				}
				local16[local22] = 4096;
			}
		}
		return local16;
	}
}
