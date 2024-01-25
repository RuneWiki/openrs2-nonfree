import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gl")
public final class Class2_Sub15_Sub8 extends Class2_Sub15 {

	@OriginalMember(owner = "client!gl", name = "F", descriptor = "I")
	private int anInt4176 = 1;

	@OriginalMember(owner = "client!gl", name = "O", descriptor = "I")
	private int anInt4182 = 1;

	@OriginalMember(owner = "client!gl", name = "<init>", descriptor = "()V")
	public Class2_Sub15_Sub8() {
		super(1, false);
	}

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method9724(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass338_41.method8470(arg0);
		if (super.aClass338_41.aBoolean712) {
			@Pc(24) int local24 = this.anInt4176 + this.anInt4176 + 1;
			@Pc(28) int local28 = 65536 / local24;
			@Pc(37) int local37 = this.anInt4182 + this.anInt4182 + 1;
			@Pc(41) int local41 = 65536 / local37;
			@Pc(44) int[][] local44 = new int[local24][];
			@Pc(64) int local64;
			for (@Pc(49) int local49 = arg0 - this.anInt4176; local49 <= this.anInt4176 + arg0; local49++) {
				@Pc(59) int[] local59 = this.method9725(0, Static426.anInt11132 & local49);
				@Pc(62) int[] local62 = new int[Static329.anInt6017];
				local64 = 0;
				for (@Pc(68) int local68 = -this.anInt4182; local68 <= this.anInt4182; local68++) {
					local64 += local59[Static386.anInt7302 & local68];
				}
				@Pc(85) int local85 = 0;
				while (local85 < Static329.anInt6017) {
					local62[local85] = local64 * local41 >> 16;
					local64 -= local59[local85 - this.anInt4182 & Static386.anInt7302];
					local85++;
					local64 += local59[local85 + this.anInt4182 & Static386.anInt7302];
				}
				local44[this.anInt4176 + local49 - arg0] = local62;
			}
			for (@Pc(141) int local141 = 0; local141 < Static329.anInt6017; local141++) {
				@Pc(145) int local145 = 0;
				for (local64 = 0; local64 < local24; local64++) {
					local145 += local44[local64][local141];
				}
				local11[local141] = local28 * local145 >> 16;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(ZI)[[I")
	@Override
	public int[][] method9723(@OriginalArg(1) int arg0) {
		@Pc(16) int[][] local16 = super.aClass38_41.method1080(arg0);
		if (super.aClass38_41.aBoolean64) {
			@Pc(28) int local28 = this.anInt4176 + this.anInt4176 + 1;
			@Pc(32) int local32 = 65536 / local28;
			@Pc(40) int local40 = this.anInt4182 + this.anInt4182 + 1;
			@Pc(44) int local44 = 65536 / local40;
			@Pc(47) int[][][] local47 = new int[local28][][];
			@Pc(71) int local71;
			@Pc(73) int local73;
			for (@Pc(53) int local53 = arg0 - this.anInt4176; local53 <= arg0 + this.anInt4176; local53++) {
				@Pc(63) int[][] local63 = this.method9727(0, local53 & Static426.anInt11132);
				@Pc(67) int[][] local67 = new int[3][Static329.anInt6017];
				@Pc(69) int local69 = 0;
				local71 = 0;
				local73 = 0;
				@Pc(77) int[] local77 = local63[0];
				@Pc(81) int[] local81 = local63[1];
				@Pc(85) int[] local85 = local63[2];
				for (@Pc(89) int local89 = -this.anInt4182; local89 <= this.anInt4182; local89++) {
					@Pc(95) int local95 = local89 & Static386.anInt7302;
					local73 += local85[local95];
					local71 += local81[local95];
					local69 += local77[local95];
				}
				@Pc(122) int[] local122 = local67[0];
				@Pc(126) int[] local126 = local67[1];
				@Pc(130) int[] local130 = local67[2];
				@Pc(132) int local132 = 0;
				while (Static329.anInt6017 > local132) {
					local122[local132] = local44 * local69 >> 16;
					local126[local132] = local71 * local44 >> 16;
					local130[local132] = local44 * local73 >> 16;
					@Pc(166) int local166 = local132 - this.anInt4182 & Static386.anInt7302;
					local71 -= local81[local166];
					local69 -= local77[local166];
					local132++;
					local73 -= local85[local166];
					@Pc(192) int local192 = Static386.anInt7302 & this.anInt4182 + local132;
					local71 += local81[local192];
					local69 += local77[local192];
					local73 += local85[local192];
				}
				local47[local53 + this.anInt4176 - arg0] = local67;
			}
			@Pc(234) int[] local234 = local16[0];
			@Pc(238) int[] local238 = local16[1];
			@Pc(242) int[] local242 = local16[2];
			for (local71 = 0; local71 < Static329.anInt6017; local71++) {
				local73 = 0;
				@Pc(250) int local250 = 0;
				@Pc(252) int local252 = 0;
				for (@Pc(254) int local254 = 0; local254 < local28; local254++) {
					@Pc(260) int[][] local260 = local47[local254];
					local252 += local260[2][local71];
					local73 += local260[0][local71];
					local250 += local260[1][local71];
				}
				local234[local71] = local73 * local32 >> 16;
				local238[local71] = local250 * local32 >> 16;
				local242[local71] = local252 * local32 >> 16;
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(IZLclient!ol;)V")
	@Override
	public void method9718(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub8 arg1) {
		if (arg0 == 0) {
			this.anInt4182 = arg1.method5203();
		} else if (arg0 == 1) {
			this.anInt4176 = arg1.method5203();
		} else if (arg0 == 2) {
			super.aBoolean803 = arg1.method5203() == 1;
		}
	}
}
