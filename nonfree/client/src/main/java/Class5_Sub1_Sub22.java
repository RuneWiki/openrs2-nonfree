import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nd")
public final class Class5_Sub1_Sub22 extends Class5_Sub1 {

	@OriginalMember(owner = "client!nd", name = "O", descriptor = "I")
	private int anInt2671 = 204;

	@OriginalMember(owner = "client!nd", name = "ab", descriptor = "I")
	private int anInt2681 = 1;

	@OriginalMember(owner = "client!nd", name = "X", descriptor = "I")
	private int anInt2679 = 1;

	@OriginalMember(owner = "client!nd", name = "<init>", descriptor = "()V")
	public Class5_Sub1_Sub22() {
		super(0, true);
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method3195(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass101_41.method2886(arg0);
		if (super.aClass101_41.aBoolean174) {
			for (@Pc(21) int local21 = 0; local21 < Static174.anInt3489; local21++) {
				@Pc(27) int local27 = Static117.anIntArray274[local21];
				@Pc(34) int local34 = local27 * this.anInt2679 >> 12;
				@Pc(38) int local38 = Static147.anIntArray321[arg0];
				@Pc(45) int local45 = local38 * this.anInt2681 >> 12;
				@Pc(55) int local55 = this.anInt2679 * (local27 % (4096 / this.anInt2679));
				@Pc(65) int local65 = local38 % (4096 / this.anInt2681) * this.anInt2681;
				if (local65 < this.anInt2671) {
					for (local34 -= local45; local34 < 0; local34 += 4) {
					}
					while (local34 > 3) {
						local34 -= 4;
					}
					if (local34 != 1) {
						local11[local21] = 0;
						continue;
					}
					if (this.anInt2671 > local55) {
						local11[local21] = 0;
						continue;
					}
				}
				if (local55 < this.anInt2671) {
					for (local34 -= local45; local34 < 0; local34 += 4) {
					}
					while (local34 > 3) {
						local34 -= 4;
					}
					if (local34 > 0) {
						local11[local21] = 0;
						continue;
					}
				}
				local11[local21] = 4096;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(Lclient!ce;II)V")
	@Override
	public void method3190(@OriginalArg(0) Class5_Sub6 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt2679 = arg0.method3062();
		} else if (arg1 == 1) {
			this.anInt2681 = arg0.method3062();
		} else if (arg1 == 2) {
			this.anInt2671 = arg0.method3077();
		}
	}
}
