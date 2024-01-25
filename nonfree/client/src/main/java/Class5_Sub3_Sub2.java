import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bj")
public final class Class5_Sub3_Sub2 extends Class5_Sub3 {

	@OriginalMember(owner = "client!bj", name = "<init>", descriptor = "()V")
	public Class5_Sub3_Sub2() {
		super(3, false);
	}

	@OriginalMember(owner = "client!bj", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method9206(@OriginalArg(1) int arg0) {
		@Pc(21) int[][] local21 = super.aClass343_41.method7661(arg0);
		if (super.aClass343_41.aBoolean592) {
			@Pc(31) int[] local31 = this.method9205(arg0, 2);
			@Pc(37) int[][] local37 = this.method9207(arg0, 0);
			@Pc(43) int[][] local43 = this.method9207(arg0, 1);
			@Pc(47) int[] local47 = local21[0];
			@Pc(51) int[] local51 = local21[1];
			@Pc(55) int[] local55 = local21[2];
			@Pc(59) int[] local59 = local37[0];
			@Pc(63) int[] local63 = local37[1];
			@Pc(67) int[] local67 = local37[2];
			@Pc(71) int[] local71 = local43[0];
			@Pc(75) int[] local75 = local43[1];
			@Pc(79) int[] local79 = local43[2];
			for (@Pc(81) int local81 = 0; local81 < Static7.anInt102; local81++) {
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
					@Pc(101) int local101 = 4096 - local87;
					local47[local81] = local101 * local71[local81] + local59[local81] * local87 >> 12;
					local51[local81] = local101 * local75[local81] + local63[local81] * local87 >> 12;
					local55[local81] = local87 * local67[local81] + local101 * local79[local81] >> 12;
				}
			}
		}
		return local21;
	}

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method9208(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass234_41.method5232(arg0);
		if (super.aClass234_41.aBoolean392) {
			@Pc(27) int[] local27 = this.method9205(arg0, 0);
			@Pc(33) int[] local33 = this.method9205(arg0, 1);
			@Pc(41) int[] local41 = this.method9205(arg0, 2);
			for (@Pc(43) int local43 = 0; local43 < Static7.anInt102; local43++) {
				@Pc(49) int local49 = local41[local43];
				if (local49 == 4096) {
					local11[local43] = local27[local43];
				} else if (local49 == 0) {
					local11[local43] = local33[local43];
				} else {
					local11[local43] = local27[local43] * local49 + local33[local43] * (4096 - local49) >> 12;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "(ILclient!wq;I)V")
	@Override
	public void method9211(@OriginalArg(1) Class5_Sub36 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			super.aBoolean769 = arg0.method7291() == 1;
		}
	}
}
