import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ps")
public final class Class14_Sub1_Sub29 extends Class14_Sub1 {

	@OriginalMember(owner = "client!ps", name = "<init>", descriptor = "()V")
	public Class14_Sub1_Sub29() {
		super(3, false);
	}

	@OriginalMember(owner = "client!ps", name = "a", descriptor = "(ZI)[[I")
	@Override
	public int[][] method8905(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass279_41.method6840(arg0);
		if (super.aClass279_41.aBoolean571) {
			@Pc(21) int[] local21 = this.method8897(2, arg0);
			@Pc(27) int[][] local27 = this.method8904(0, arg0);
			@Pc(33) int[][] local33 = this.method8904(1, arg0);
			@Pc(37) int[] local37 = local11[0];
			@Pc(41) int[] local41 = local11[1];
			@Pc(45) int[] local45 = local11[2];
			@Pc(49) int[] local49 = local27[0];
			@Pc(53) int[] local53 = local27[1];
			@Pc(57) int[] local57 = local27[2];
			@Pc(61) int[] local61 = local33[0];
			@Pc(65) int[] local65 = local33[1];
			@Pc(69) int[] local69 = local33[2];
			for (@Pc(71) int local71 = 0; local71 < Static371.anInt6835; local71++) {
				@Pc(77) int local77 = local21[local71];
				if (local77 == 4096) {
					local37[local71] = local49[local71];
					local41[local71] = local53[local71];
					local45[local71] = local57[local71];
				} else if (local77 == 0) {
					local37[local71] = local61[local71];
					local41[local71] = local65[local71];
					local45[local71] = local69[local71];
				} else {
					@Pc(109) int local109 = 4096 - local77;
					local37[local71] = local77 * local49[local71] + local109 * local61[local71] >> 12;
					local41[local71] = local53[local71] * local77 + local109 * local65[local71] >> 12;
					local45[local71] = local69[local71] * local109 + local57[local71] * local77 >> 12;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!ps", name = "a", descriptor = "(Lclient!so;II)V")
	@Override
	public void method8903(@OriginalArg(0) Class14_Sub29 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			super.aBoolean734 = arg0.method5866() == 1;
		}
	}

	@OriginalMember(owner = "client!ps", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method8898(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass211_41.method5137(arg0);
		if (super.aClass211_41.aBoolean432) {
			@Pc(26) int[] local26 = this.method8897(0, arg0);
			@Pc(32) int[] local32 = this.method8897(1, arg0);
			@Pc(38) int[] local38 = this.method8897(2, arg0);
			for (@Pc(40) int local40 = 0; local40 < Static371.anInt6835; local40++) {
				@Pc(46) int local46 = local38[local40];
				if (local46 == 4096) {
					local11[local40] = local26[local40];
				} else if (local46 == 0) {
					local11[local40] = local32[local40];
				} else {
					local11[local40] = local46 * local26[local40] + local32[local40] * (4096 - local46) >> 12;
				}
			}
		}
		return local11;
	}
}
