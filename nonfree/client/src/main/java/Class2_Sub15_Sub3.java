import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dga")
public final class Class2_Sub15_Sub3 extends Class2_Sub15 {

	@OriginalMember(owner = "client!dga", name = "<init>", descriptor = "()V")
	public Class2_Sub15_Sub3() {
		super(3, false);
	}

	@OriginalMember(owner = "client!dga", name = "a", descriptor = "(ZI)[[I")
	@Override
	public int[][] method9723(@OriginalArg(1) int arg0) {
		@Pc(21) int[][] local21 = super.aClass38_41.method1080(arg0);
		if (super.aClass38_41.aBoolean64) {
			@Pc(31) int[] local31 = this.method9725(2, arg0);
			@Pc(37) int[][] local37 = this.method9727(0, arg0);
			@Pc(43) int[][] local43 = this.method9727(1, arg0);
			@Pc(47) int[] local47 = local21[0];
			@Pc(51) int[] local51 = local21[1];
			@Pc(55) int[] local55 = local21[2];
			@Pc(59) int[] local59 = local37[0];
			@Pc(63) int[] local63 = local37[1];
			@Pc(67) int[] local67 = local37[2];
			@Pc(71) int[] local71 = local43[0];
			@Pc(75) int[] local75 = local43[1];
			@Pc(79) int[] local79 = local43[2];
			for (@Pc(81) int local81 = 0; local81 < Static329.anInt6017; local81++) {
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
					@Pc(139) int local139 = 4096 - local87;
					local47[local81] = local59[local81] * local87 + local71[local81] * local139 >> 12;
					local51[local81] = local63[local81] * local87 + local75[local81] * local139 >> 12;
					local55[local81] = local67[local81] * local87 + local139 * local79[local81] >> 12;
				}
			}
		}
		return local21;
	}

	@OriginalMember(owner = "client!dga", name = "a", descriptor = "(IZLclient!ol;)V")
	@Override
	public void method9718(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub8 arg1) {
		if (arg0 == 0) {
			super.aBoolean803 = arg1.method5203() == 1;
		}
	}

	@OriginalMember(owner = "client!dga", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method9724(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass338_41.method8470(arg0);
		if (super.aClass338_41.aBoolean712) {
			@Pc(28) int[] local28 = this.method9725(0, arg0);
			@Pc(36) int[] local36 = this.method9725(1, arg0);
			@Pc(44) int[] local44 = this.method9725(2, arg0);
			for (@Pc(46) int local46 = 0; local46 < Static329.anInt6017; local46++) {
				@Pc(52) int local52 = local44[local46];
				if (local52 == 4096) {
					local11[local46] = local28[local46];
				} else if (local52 == 0) {
					local11[local46] = local36[local46];
				} else {
					local11[local46] = (4096 - local52) * local36[local46] + local52 * local28[local46] >> 12;
				}
			}
		}
		return local11;
	}
}
