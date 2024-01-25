import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mj")
public final class Class3_Sub3_Sub22 extends Class3_Sub3 {

	@OriginalMember(owner = "client!mj", name = "<init>", descriptor = "()V")
	public Class3_Sub3_Sub22() {
		super(3, false);
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(Lclient!fb;ZI)V")
	@Override
	public void method5731(@OriginalArg(0) Class3_Sub4 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			super.aBoolean454 = arg0.method3643() == 1;
		}
	}

	@OriginalMember(owner = "client!mj", name = "c", descriptor = "(II)[[I")
	@Override
	public int[][] method5734(@OriginalArg(0) int arg0) {
		@Pc(21) int[][] local21 = super.aClass84_41.method2091(arg0);
		if (super.aClass84_41.aBoolean144) {
			@Pc(31) int[] local31 = this.method5733(arg0, 2);
			@Pc(37) int[][] local37 = this.method5729(0, arg0);
			@Pc(43) int[][] local43 = this.method5729(1, arg0);
			@Pc(47) int[] local47 = local21[0];
			@Pc(51) int[] local51 = local21[1];
			@Pc(55) int[] local55 = local21[2];
			@Pc(59) int[] local59 = local37[0];
			@Pc(63) int[] local63 = local37[1];
			@Pc(67) int[] local67 = local37[2];
			@Pc(71) int[] local71 = local43[0];
			@Pc(75) int[] local75 = local43[1];
			@Pc(79) int[] local79 = local43[2];
			for (@Pc(81) int local81 = 0; local81 < Static131.anInt2755; local81++) {
				@Pc(87) int local87 = local31[local81];
				if (local87 == 4096) {
					local47[local81] = local59[local81];
					local51[local81] = local63[local81];
					local55[local81] = local67[local81];
				} else if (local87 == 0) {
					local47[local81] = local71[local81];
					local51[local81] = local75[local81];
					local55[local81] = local79[local81];
				} else {
					@Pc(116) int local116 = 4096 - local87;
					local47[local81] = local71[local81] * local116 + local87 * local59[local81] >> 12;
					local51[local81] = local75[local81] * local116 + local63[local81] * local87 >> 12;
					local55[local81] = local67[local81] * local87 + local79[local81] * local116 >> 12;
				}
			}
		}
		return local21;
	}

	@OriginalMember(owner = "client!mj", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method5727(@OriginalArg(0) int arg0) {
		@Pc(16) int[] local16 = super.aClass217_41.method5701(arg0);
		if (super.aClass217_41.aBoolean451) {
			@Pc(26) int[] local26 = this.method5733(arg0, 0);
			@Pc(32) int[] local32 = this.method5733(arg0, 1);
			@Pc(38) int[] local38 = this.method5733(arg0, 2);
			for (@Pc(40) int local40 = 0; local40 < Static131.anInt2755; local40++) {
				@Pc(46) int local46 = local38[local40];
				if (local46 == 4096) {
					local16[local40] = local26[local40];
				} else if (local46 == 0) {
					local16[local40] = local32[local40];
				} else {
					local16[local40] = local26[local40] * local46 + local32[local40] * (4096 - local46) >> 12;
				}
			}
		}
		return local16;
	}
}
