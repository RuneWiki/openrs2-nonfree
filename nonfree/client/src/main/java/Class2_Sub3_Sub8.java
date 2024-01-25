import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fd")
public final class Class2_Sub3_Sub8 extends Class2_Sub3 {

	@OriginalMember(owner = "client!fd", name = "O", descriptor = "I")
	private int anInt3562 = 1;

	@OriginalMember(owner = "client!fd", name = "R", descriptor = "I")
	private int anInt3564 = 1;

	@OriginalMember(owner = "client!fd", name = "<init>", descriptor = "()V")
	public Class2_Sub3_Sub8() {
		super(1, false);
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(Lclient!cea;II)V")
	@Override
	public void method9157(@OriginalArg(0) Class2_Sub11 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt3564 = arg0.method8383();
		} else if (arg1 == 1) {
			this.anInt3562 = arg0.method8383();
		} else if (arg1 == 2) {
			super.aBoolean748 = arg0.method8383() == 1;
		}
	}

	@OriginalMember(owner = "client!fd", name = "c", descriptor = "(II)[I")
	@Override
	public int[] method9150(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass281_41.method7189(arg0);
		if (super.aClass281_41.aBoolean607) {
			@Pc(28) int local28 = this.anInt3562 + this.anInt3562 + 1;
			@Pc(32) int local32 = 65536 / local28;
			@Pc(40) int local40 = this.anInt3564 + this.anInt3564 + 1;
			@Pc(44) int local44 = 65536 / local40;
			@Pc(47) int[][] local47 = new int[local28][];
			@Pc(68) int local68;
			for (@Pc(53) int local53 = arg0 - this.anInt3562; local53 <= arg0 + this.anInt3562; local53++) {
				@Pc(63) int[] local63 = this.method9156(Static591.anInt6375 & local53, 0);
				@Pc(66) int[] local66 = new int[Static222.anInt4971];
				local68 = 0;
				for (@Pc(72) int local72 = -this.anInt3564; local72 <= this.anInt3564; local72++) {
					local68 += local63[local72 & Static620.anInt10845];
				}
				@Pc(89) int local89 = 0;
				while (local89 < Static222.anInt4971) {
					local66[local89] = local44 * local68 >> 16;
					local68 -= local63[local89 - this.anInt3564 & Static620.anInt10845];
					local89++;
					local68 += local63[local89 + this.anInt3564 & Static620.anInt10845];
				}
				local47[local53 + this.anInt3562 - arg0] = local66;
			}
			for (@Pc(146) int local146 = 0; local146 < Static222.anInt4971; local146++) {
				@Pc(150) int local150 = 0;
				for (local68 = 0; local68 < local28; local68++) {
					local150 += local47[local68][local146];
				}
				local11[local146] = local150 * local32 >> 16;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!fd", name = "d", descriptor = "(II)[[I")
	@Override
	public int[][] method9155(@OriginalArg(0) int arg0) {
		@Pc(18) int[][] local18 = super.aClass10_41.method211(arg0);
		if (super.aClass10_41.aBoolean11) {
			@Pc(30) int local30 = this.anInt3562 + this.anInt3562 + 1;
			@Pc(34) int local34 = 65536 / local30;
			@Pc(42) int local42 = this.anInt3564 + this.anInt3564 + 1;
			@Pc(46) int local46 = 65536 / local42;
			@Pc(49) int[][][] local49 = new int[local30][][];
			@Pc(73) int local73;
			@Pc(75) int local75;
			for (@Pc(55) int local55 = arg0 - this.anInt3562; local55 <= this.anInt3562 + arg0; local55++) {
				@Pc(65) int[][] local65 = this.method9147(Static591.anInt6375 & local55, 0);
				@Pc(69) int[][] local69 = new int[3][Static222.anInt4971];
				@Pc(71) int local71 = 0;
				local73 = 0;
				local75 = 0;
				@Pc(79) int[] local79 = local65[0];
				@Pc(83) int[] local83 = local65[1];
				@Pc(87) int[] local87 = local65[2];
				for (@Pc(91) int local91 = -this.anInt3564; local91 <= this.anInt3564; local91++) {
					@Pc(97) int local97 = Static620.anInt10845 & local91;
					local75 += local87[local97];
					local71 += local79[local97];
					local73 += local83[local97];
				}
				@Pc(128) int[] local128 = local69[0];
				@Pc(132) int[] local132 = local69[1];
				@Pc(136) int[] local136 = local69[2];
				@Pc(138) int local138 = 0;
				while (local138 < Static222.anInt4971) {
					local128[local138] = local71 * local46 >> 16;
					local132[local138] = local73 * local46 >> 16;
					local136[local138] = local75 * local46 >> 16;
					@Pc(172) int local172 = Static620.anInt10845 & local138 - this.anInt3564;
					local71 -= local79[local172];
					local138++;
					local73 -= local83[local172];
					local75 -= local87[local172];
					@Pc(199) int local199 = local138 + this.anInt3564 & Static620.anInt10845;
					local75 += local87[local199];
					local73 += local83[local199];
					local71 += local79[local199];
				}
				local49[local55 + this.anInt3562 - arg0] = local69;
			}
			@Pc(245) int[] local245 = local18[0];
			@Pc(249) int[] local249 = local18[1];
			@Pc(253) int[] local253 = local18[2];
			for (local73 = 0; local73 < Static222.anInt4971; local73++) {
				local75 = 0;
				@Pc(261) int local261 = 0;
				@Pc(263) int local263 = 0;
				for (@Pc(265) int local265 = 0; local265 < local30; local265++) {
					@Pc(271) int[][] local271 = local49[local265];
					local75 += local271[0][local73];
					local261 += local271[1][local73];
					local263 += local271[2][local73];
				}
				local245[local73] = local75 * local34 >> 16;
				local249[local73] = local261 * local34 >> 16;
				local253[local73] = local34 * local263 >> 16;
			}
		}
		return local18;
	}
}
