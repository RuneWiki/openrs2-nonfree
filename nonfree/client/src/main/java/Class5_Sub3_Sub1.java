import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ah")
public final class Class5_Sub3_Sub1 extends Class5_Sub3 {

	@OriginalMember(owner = "client!ah", name = "<init>", descriptor = "()V")
	public Class5_Sub3_Sub1() {
		super(3, false);
	}

	@OriginalMember(owner = "client!ah", name = "b", descriptor = "(IB)[I")
	@Override
	public int[] method6011(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass188_41.method5318(arg0);
		if (super.aClass188_41.aBoolean490) {
			@Pc(27) int[] local27 = this.method6020(0, arg0);
			@Pc(35) int[] local35 = this.method6020(1, arg0);
			@Pc(41) int[] local41 = this.method6020(2, arg0);
			for (@Pc(43) int local43 = 0; local43 < Static7.anInt129; local43++) {
				@Pc(49) int local49 = local41[local43];
				if (local49 == 4096) {
					local11[local43] = local27[local43];
				} else if (local49 == 0) {
					local11[local43] = local35[local43];
				} else {
					local11[local43] = (4096 - local49) * local35[local43] + local49 * local27[local43] >> 12;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(Lclient!rg;BI)V")
	@Override
	public void method6017(@OriginalArg(0) Class5_Sub12 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			super.aBoolean592 = arg0.method5115() == 1;
		}
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(IZ)[[I")
	@Override
	public int[][] method6016(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass53_41.method969(arg0);
		if (super.aClass53_41.aBoolean83) {
			@Pc(21) int[] local21 = this.method6020(2, arg0);
			@Pc(27) int[][] local27 = this.method6023(0, arg0);
			@Pc(33) int[][] local33 = this.method6023(1, arg0);
			@Pc(37) int[] local37 = local11[0];
			@Pc(41) int[] local41 = local11[1];
			@Pc(45) int[] local45 = local11[2];
			@Pc(49) int[] local49 = local27[0];
			@Pc(53) int[] local53 = local27[1];
			@Pc(57) int[] local57 = local27[2];
			@Pc(61) int[] local61 = local33[0];
			@Pc(65) int[] local65 = local33[1];
			@Pc(69) int[] local69 = local33[2];
			for (@Pc(71) int local71 = 0; local71 < Static7.anInt129; local71++) {
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
					@Pc(107) int local107 = 4096 - local77;
					local37[local71] = local107 * local61[local71] + local77 * local49[local71] >> 12;
					local41[local71] = local77 * local53[local71] + local65[local71] * local107 >> 12;
					local45[local71] = local77 * local57[local71] + local69[local71] * local107 >> 12;
				}
			}
		}
		return local11;
	}
}
