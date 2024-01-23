import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ig")
public final class Class2_Sub1_Sub15 extends Class2_Sub1 {

	@OriginalMember(owner = "client!ig", name = "R", descriptor = "I")
	private int anInt2102 = 1;

	@OriginalMember(owner = "client!ig", name = "W", descriptor = "I")
	private int anInt2107 = 1;

	@OriginalMember(owner = "client!ig", name = "<init>", descriptor = "()V")
	public Class2_Sub1_Sub15() {
		super(1, false);
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method3201(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass73_41.method2249(arg0);
		if (super.aClass73_41.aBoolean188) {
			@Pc(31) int local31 = this.anInt2102 + this.anInt2102 + 1;
			@Pc(35) int local35 = 65536 / local31;
			@Pc(43) int local43 = this.anInt2107 + this.anInt2107 + 1;
			@Pc(46) int[][] local46 = new int[local31][];
			@Pc(50) int local50 = 65536 / local43;
			@Pc(71) int local71;
			for (@Pc(56) int local56 = arg0 - this.anInt2102; local56 <= arg0 + this.anInt2102; local56++) {
				@Pc(66) int[] local66 = this.method3203(Static195.anInt4423 & local56, 0);
				@Pc(69) int[] local69 = new int[Static62.anInt1675];
				local71 = 0;
				for (@Pc(75) int local75 = -this.anInt2107; local75 <= this.anInt2107; local75++) {
					local71 += local66[Static41.anInt1259 & local75];
				}
				@Pc(96) int local96 = 0;
				while (Static62.anInt1675 > local96) {
					local69[local96] = local50 * local71 >> 16;
					local71 -= local66[local96 - this.anInt2107 & Static41.anInt1259];
					local96++;
					local71 += local66[Static41.anInt1259 & local96 + this.anInt2107];
				}
				local46[this.anInt2102 + local56 - arg0] = local69;
			}
			for (@Pc(153) int local153 = 0; local153 < Static62.anInt1675; local153++) {
				@Pc(157) int local157 = 0;
				for (local71 = 0; local71 < local31; local71++) {
					local157 += local46[local71][local153];
				}
				local11[local153] = local157 * local35 >> 16;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(Lclient!ea;II)V")
	@Override
	public void method3204(@OriginalArg(0) Class2_Sub3 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt2107 = arg0.method209();
		} else if (arg1 == 1) {
			this.anInt2102 = arg0.method209();
		} else if (arg1 == 2) {
			super.aBoolean286 = arg0.method209() == 1;
		}
	}

	@OriginalMember(owner = "client!ig", name = "b", descriptor = "(IB)[[I")
	@Override
	public int[][] method3211(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass99_41.method3152(arg0);
		if (super.aClass99_41.aBoolean280) {
			@Pc(29) int local29 = this.anInt2102 + this.anInt2102 + 1;
			@Pc(33) int local33 = 65536 / local29;
			@Pc(42) int local42 = this.anInt2107 + this.anInt2107 + 1;
			@Pc(45) int[][][] local45 = new int[local29][][];
			@Pc(49) int local49 = 65536 / local42;
			@Pc(59) int local59;
			@Pc(61) int local61;
			for (@Pc(55) int local55 = arg0 - this.anInt2102; local55 <= arg0 + this.anInt2102; local55++) {
				local59 = 0;
				local61 = 0;
				@Pc(69) int[][] local69 = this.method3205(0, Static195.anInt4423 & local55);
				@Pc(71) int local71 = 0;
				@Pc(75) int[][] local75 = new int[3][Static62.anInt1675];
				@Pc(79) int[] local79 = local69[0];
				@Pc(83) int[] local83 = local69[1];
				@Pc(87) int[] local87 = local69[2];
				for (@Pc(91) int local91 = -this.anInt2107; local91 <= this.anInt2107; local91++) {
					@Pc(97) int local97 = local91 & Static41.anInt1259;
					local61 += local87[local97];
					local71 += local79[local97];
					local59 += local83[local97];
				}
				@Pc(128) int[] local128 = local75[1];
				@Pc(132) int[] local132 = local75[0];
				@Pc(136) int[] local136 = local75[2];
				@Pc(138) int local138 = 0;
				while (Static62.anInt1675 > local138) {
					local132[local138] = local71 * local49 >> 16;
					local128[local138] = local49 * local59 >> 16;
					local136[local138] = local49 * local61 >> 16;
					@Pc(172) int local172 = local138 - this.anInt2107 & Static41.anInt1259;
					local71 -= local79[local172];
					local59 -= local83[local172];
					local61 -= local87[local172];
					local138++;
					@Pc(198) int local198 = Static41.anInt1259 & this.anInt2107 + local138;
					local61 += local87[local198];
					local71 += local79[local198];
					local59 += local83[local198];
				}
				local45[local55 + this.anInt2102 - arg0] = local75;
			}
			@Pc(244) int[] local244 = local11[0];
			@Pc(248) int[] local248 = local11[1];
			@Pc(252) int[] local252 = local11[2];
			for (local59 = 0; local59 < Static62.anInt1675; local59++) {
				local61 = 0;
				@Pc(260) int local260 = 0;
				@Pc(262) int local262 = 0;
				for (@Pc(264) int local264 = 0; local264 < local29; local264++) {
					@Pc(270) int[][] local270 = local45[local264];
					local260 += local270[1][local59];
					local262 += local270[2][local59];
					local61 += local270[0][local59];
				}
				local244[local59] = local61 * local33 >> 16;
				local248[local59] = local33 * local260 >> 16;
				local252[local59] = local262 * local33 >> 16;
			}
		}
		return local11;
	}
}
