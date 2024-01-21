import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!b")
public final class Class2_Sub1_Sub2 extends Class2_Sub1 {

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method2986(@OriginalArg(0) int arg0) {
		@Pc(16) int[] local16 = super.aClass3_39.method62(arg0);
		if (super.aClass3_39.aBoolean5) {
			@Pc(26) int[] local26 = this.method2980(0, arg0);
			@Pc(32) int[] local32 = this.method2980(1, arg0);
			@Pc(38) int[] local38 = this.method2980(2, arg0);
			for (@Pc(40) int local40 = 0; local40 < Static129.anInt3118; local40++) {
				@Pc(46) int local46 = local38[local40];
				if (local46 == 4096) {
					local16[local40] = local26[local40];
				} else if (local46 == 0) {
					local16[local40] = local32[local40];
				} else {
					local16[local40] = (4096 - local46) * local32[local40] + local26[local40] * local46 >> 12;
				}
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(BLclient!oa;I)V")
	@Override
	public void method2987(@OriginalArg(1) Class2_Sub18 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			super.aBoolean183 = arg0.method2387() == 1;
		}
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(BI)[[I")
	@Override
	public int[][] method2982(@OriginalArg(1) int arg0) {
		@Pc(21) int[][] local21 = super.aClass11_39.method511(arg0);
		if (super.aClass11_39.aBoolean37) {
			@Pc(31) int[] local31 = this.method2980(2, arg0);
			@Pc(37) int[][] local37 = this.method2991(arg0, 0);
			@Pc(43) int[][] local43 = this.method2991(arg0, 1);
			@Pc(47) int[] local47 = local21[0];
			@Pc(51) int[] local51 = local37[0];
			@Pc(55) int[] local55 = local21[1];
			@Pc(59) int[] local59 = local43[0];
			@Pc(63) int[] local63 = local37[2];
			@Pc(67) int[] local67 = local21[2];
			@Pc(71) int[] local71 = local43[1];
			@Pc(75) int[] local75 = local43[2];
			@Pc(79) int[] local79 = local37[1];
			for (@Pc(81) int local81 = 0; local81 < Static129.anInt3118; local81++) {
				@Pc(87) int local87 = local31[local81];
				if (local87 == 4096) {
					local47[local81] = local51[local81];
					local55[local81] = local79[local81];
					local67[local81] = local63[local81];
				} else if (local87 == 0) {
					local47[local81] = local59[local81];
					local55[local81] = local71[local81];
					local67[local81] = local75[local81];
				} else {
					@Pc(139) int local139 = 4096 - local87;
					local47[local81] = local59[local81] * local139 + local51[local81] * local87 >> 12;
					local55[local81] = local71[local81] * local139 + local87 * local79[local81] >> 12;
					local67[local81] = local87 * local63[local81] + local139 * local75[local81] >> 12;
				}
			}
		}
		return local21;
	}
}
