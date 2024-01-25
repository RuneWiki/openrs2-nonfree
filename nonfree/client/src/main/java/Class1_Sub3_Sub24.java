import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mq")
public final class Class1_Sub3_Sub24 extends Class1_Sub3 {

	@OriginalMember(owner = "client!mq", name = "<init>", descriptor = "()V")
	public Class1_Sub3_Sub24() {
		super(3, false);
	}

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(IILclient!bg;)V")
	@Override
	public void method5526(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub8 arg1) {
		if (arg0 == 0) {
			super.aBoolean647 = arg1.method4532() == 1;
		}
	}

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5529(@OriginalArg(0) int arg0) {
		@Pc(19) int[] local19 = super.aClass122_41.method3385(arg0);
		if (super.aClass122_41.aBoolean342) {
			@Pc(29) int[] local29 = this.method5532(0, arg0);
			@Pc(35) int[] local35 = this.method5532(1, arg0);
			@Pc(41) int[] local41 = this.method5532(2, arg0);
			for (@Pc(43) int local43 = 0; local43 < Static153.anInt3378; local43++) {
				@Pc(49) int local49 = local41[local43];
				if (local49 == 4096) {
					local19[local43] = local29[local43];
				} else if (local49 == 0) {
					local19[local43] = local35[local43];
				} else {
					local19[local43] = local49 * local29[local43] + local35[local43] * (4096 - local49) >> 12;
				}
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!mq", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method5538(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass144_41.method3947(arg0);
		if (super.aClass144_41.aBoolean415) {
			@Pc(31) int[] local31 = this.method5532(2, arg0);
			@Pc(37) int[][] local37 = this.method5528(arg0, 0);
			@Pc(43) int[][] local43 = this.method5528(arg0, 1);
			@Pc(47) int[] local47 = local11[0];
			@Pc(51) int[] local51 = local11[1];
			@Pc(55) int[] local55 = local11[2];
			@Pc(59) int[] local59 = local37[0];
			@Pc(63) int[] local63 = local37[1];
			@Pc(67) int[] local67 = local37[2];
			@Pc(71) int[] local71 = local43[0];
			@Pc(75) int[] local75 = local43[1];
			@Pc(79) int[] local79 = local43[2];
			for (@Pc(81) int local81 = 0; local81 < Static153.anInt3378; local81++) {
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
					@Pc(119) int local119 = 4096 - local87;
					local47[local81] = local71[local81] * local119 + local59[local81] * local87 >> 12;
					local51[local81] = local75[local81] * local119 + local87 * local63[local81] >> 12;
					local55[local81] = local87 * local67[local81] + local79[local81] * local119 >> 12;
				}
			}
		}
		return local11;
	}
}
