import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ds")
public final class Class6_Sub8_Sub3 extends Class6_Sub8 {

	@OriginalMember(owner = "client!ds", name = "I", descriptor = "I")
	private int anInt2231 = 1;

	@OriginalMember(owner = "client!ds", name = "B", descriptor = "I")
	private int anInt2236 = 1;

	@OriginalMember(owner = "client!ds", name = "<init>", descriptor = "()V")
	public Class6_Sub8_Sub3() {
		super(1, false);
	}

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "(ILclient!jc;I)V")
	@Override
	public void method8929(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub15 arg1) {
		if (arg0 == 0) {
			this.anInt2231 = arg1.method3030();
		} else if (arg0 == 1) {
			this.anInt2236 = arg1.method3030();
		} else if (arg0 == 2) {
			super.aBoolean766 = arg1.method3030() == 1;
		}
	}

	@OriginalMember(owner = "client!ds", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method8935(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass325_41.method7756(arg0);
		if (super.aClass325_41.aBoolean671) {
			@Pc(32) int local32 = this.anInt2236 + this.anInt2236 + 1;
			@Pc(36) int local36 = 65536 / local32;
			@Pc(44) int local44 = this.anInt2231 + this.anInt2231 + 1;
			@Pc(48) int local48 = 65536 / local44;
			@Pc(51) int[][] local51 = new int[local32][];
			@Pc(72) int local72;
			for (@Pc(57) int local57 = arg0 - this.anInt2236; local57 <= this.anInt2236 + arg0; local57++) {
				@Pc(67) int[] local67 = this.method8930(Static165.anInt3453 & local57, 0);
				@Pc(70) int[] local70 = new int[Static83.anInt1268];
				local72 = 0;
				for (@Pc(76) int local76 = -this.anInt2231; local76 <= this.anInt2231; local76++) {
					local72 += local67[Static333.anInt5727 & local76];
				}
				@Pc(93) int local93 = 0;
				while (local93 < Static83.anInt1268) {
					local70[local93] = local72 * local48 >> 16;
					local72 -= local67[local93 - this.anInt2231 & Static333.anInt5727];
					local93++;
					local72 += local67[this.anInt2231 + local93 & Static333.anInt5727];
				}
				local51[this.anInt2236 + local57 - arg0] = local70;
			}
			for (@Pc(154) int local154 = 0; local154 < Static83.anInt1268; local154++) {
				@Pc(158) int local158 = 0;
				for (local72 = 0; local72 < local32; local72++) {
					local158 += local51[local72][local154];
				}
				local11[local154] = local158 * local36 >> 16;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method8934(@OriginalArg(1) int arg0) {
		@Pc(16) int[][] local16 = super.aClass140_41.method3749(arg0);
		if (super.aClass140_41.aBoolean331) {
			@Pc(28) int local28 = this.anInt2236 + this.anInt2236 + 1;
			@Pc(32) int local32 = 65536 / local28;
			@Pc(40) int local40 = this.anInt2231 + this.anInt2231 + 1;
			@Pc(44) int local44 = 65536 / local40;
			@Pc(47) int[][][] local47 = new int[local28][][];
			@Pc(73) int local73;
			@Pc(75) int local75;
			for (@Pc(53) int local53 = arg0 - this.anInt2236; local53 <= this.anInt2236 + arg0; local53++) {
				@Pc(65) int[][] local65 = this.method8928(0, Static165.anInt3453 & local53);
				@Pc(69) int[][] local69 = new int[3][Static83.anInt1268];
				@Pc(71) int local71 = 0;
				local73 = 0;
				local75 = 0;
				@Pc(79) int[] local79 = local65[0];
				@Pc(83) int[] local83 = local65[1];
				@Pc(87) int[] local87 = local65[2];
				for (@Pc(91) int local91 = -this.anInt2231; local91 <= this.anInt2231; local91++) {
					@Pc(99) int local99 = local91 & Static333.anInt5727;
					local73 += local83[local99];
					local75 += local87[local99];
					local71 += local79[local99];
				}
				@Pc(126) int[] local126 = local69[0];
				@Pc(130) int[] local130 = local69[1];
				@Pc(134) int[] local134 = local69[2];
				@Pc(138) int local138 = 0;
				while (Static83.anInt1268 > local138) {
					local126[local138] = local71 * local44 >> 16;
					local130[local138] = local73 * local44 >> 16;
					local134[local138] = local75 * local44 >> 16;
					@Pc(174) int local174 = Static333.anInt5727 & local138 - this.anInt2231;
					local71 -= local79[local174];
					local73 -= local83[local174];
					local138++;
					local75 -= local87[local174];
					@Pc(200) int local200 = Static333.anInt5727 & this.anInt2231 + local138;
					local73 += local83[local200];
					local75 += local87[local200];
					local71 += local79[local200];
				}
				local47[this.anInt2236 + local53 - arg0] = local69;
			}
			@Pc(254) int[] local254 = local16[0];
			@Pc(258) int[] local258 = local16[1];
			@Pc(264) int[] local264 = local16[2];
			for (local73 = 0; local73 < Static83.anInt1268; local73++) {
				local75 = 0;
				@Pc(272) int local272 = 0;
				@Pc(274) int local274 = 0;
				for (@Pc(276) int local276 = 0; local276 < local28; local276++) {
					@Pc(282) int[][] local282 = local47[local276];
					local272 += local282[1][local73];
					local274 += local282[2][local73];
					local75 += local282[0][local73];
				}
				local254[local73] = local32 * local75 >> 16;
				local258[local73] = local272 * local32 >> 16;
				local264[local73] = local32 * local274 >> 16;
			}
		}
		return local16;
	}
}
