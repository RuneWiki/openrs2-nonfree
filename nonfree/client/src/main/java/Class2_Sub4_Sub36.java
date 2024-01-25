import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uba")
public final class Class2_Sub4_Sub36 extends Class2_Sub4 {

	@OriginalMember(owner = "client!uba", name = "G", descriptor = "I")
	private int anInt9330 = 1;

	@OriginalMember(owner = "client!uba", name = "L", descriptor = "I")
	private int anInt9334 = 1;

	@OriginalMember(owner = "client!uba", name = "<init>", descriptor = "()V")
	public Class2_Sub4_Sub36() {
		super(1, false);
	}

	@OriginalMember(owner = "client!uba", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method8900(@OriginalArg(1) int arg0) {
		@Pc(17) int[] local17 = super.aClass348_41.method8072(arg0);
		if (super.aClass348_41.aBoolean680) {
			@Pc(29) int local29 = this.anInt9334 + this.anInt9334 + 1;
			@Pc(33) int local33 = 65536 / local29;
			@Pc(42) int local42 = this.anInt9330 + this.anInt9330 + 1;
			@Pc(46) int local46 = 65536 / local42;
			@Pc(49) int[][] local49 = new int[local29][];
			@Pc(70) int local70;
			for (@Pc(55) int local55 = arg0 - this.anInt9334; local55 <= arg0 + this.anInt9334; local55++) {
				@Pc(65) int[] local65 = this.method8892(local55 & Static463.anInt7489, 0);
				@Pc(68) int[] local68 = new int[Static395.anInt6816];
				local70 = 0;
				for (@Pc(74) int local74 = -this.anInt9330; local74 <= this.anInt9330; local74++) {
					local70 += local65[Static104.anInt2340 & local74];
				}
				@Pc(91) int local91 = 0;
				while (local91 < Static395.anInt6816) {
					local68[local91] = local46 * local70 >> 16;
					local70 -= local65[Static104.anInt2340 & local91 - this.anInt9330];
					local91++;
					local70 += local65[this.anInt9330 + local91 & Static104.anInt2340];
				}
				local49[local55 + this.anInt9334 - arg0] = local68;
			}
			for (@Pc(157) int local157 = 0; local157 < Static395.anInt6816; local157++) {
				@Pc(161) int local161 = 0;
				for (local70 = 0; local70 < local29; local70++) {
					local161 += local49[local70][local157];
				}
				local17[local157] = local161 * local33 >> 16;
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!uba", name = "a", descriptor = "(Lclient!sl;II)V")
	@Override
	public void method8895(@OriginalArg(0) Class2_Sub17 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt9330 = arg0.method2859();
		} else if (arg1 == 1) {
			this.anInt9334 = arg0.method2859();
		} else if (arg1 == 2) {
			super.aBoolean763 = arg0.method2859() == 1;
		}
	}

	@OriginalMember(owner = "client!uba", name = "a", descriptor = "(BI)[[I")
	@Override
	public int[][] method8901(@OriginalArg(1) int arg0) {
		@Pc(16) int[][] local16 = super.aClass68_41.method1901(arg0);
		if (super.aClass68_41.aBoolean188) {
			@Pc(29) int local29 = this.anInt9334 + this.anInt9334 + 1;
			@Pc(33) int local33 = 65536 / local29;
			@Pc(42) int local42 = this.anInt9330 + this.anInt9330 + 1;
			@Pc(46) int local46 = 65536 / local42;
			@Pc(49) int[][][] local49 = new int[local29][][];
			@Pc(73) int local73;
			@Pc(75) int local75;
			for (@Pc(55) int local55 = arg0 - this.anInt9334; local55 <= this.anInt9334 + arg0; local55++) {
				@Pc(65) int[][] local65 = this.method8898(0, Static463.anInt7489 & local55);
				@Pc(69) int[][] local69 = new int[3][Static395.anInt6816];
				@Pc(71) int local71 = 0;
				local73 = 0;
				local75 = 0;
				@Pc(79) int[] local79 = local65[0];
				@Pc(83) int[] local83 = local65[1];
				@Pc(87) int[] local87 = local65[2];
				for (@Pc(91) int local91 = -this.anInt9330; local91 <= this.anInt9330; local91++) {
					@Pc(97) int local97 = local91 & Static104.anInt2340;
					local71 += local79[local97];
					local75 += local87[local97];
					local73 += local83[local97];
				}
				@Pc(124) int[] local124 = local69[0];
				@Pc(128) int[] local128 = local69[1];
				@Pc(132) int[] local132 = local69[2];
				@Pc(134) int local134 = 0;
				while (local134 < Static395.anInt6816) {
					local124[local134] = local71 * local46 >> 16;
					local128[local134] = local73 * local46 >> 16;
					local132[local134] = local75 * local46 >> 16;
					@Pc(167) int local167 = Static104.anInt2340 & local134 - this.anInt9330;
					local75 -= local87[local167];
					local73 -= local83[local167];
					local71 -= local79[local167];
					local134++;
					@Pc(193) int local193 = local134 + this.anInt9330 & Static104.anInt2340;
					local75 += local87[local193];
					local71 += local79[local193];
					local73 += local83[local193];
				}
				local49[this.anInt9334 + local55 - arg0] = local69;
			}
			@Pc(239) int[] local239 = local16[0];
			@Pc(243) int[] local243 = local16[1];
			@Pc(247) int[] local247 = local16[2];
			for (local73 = 0; local73 < Static395.anInt6816; local73++) {
				local75 = 0;
				@Pc(255) int local255 = 0;
				@Pc(257) int local257 = 0;
				for (@Pc(259) int local259 = 0; local259 < local29; local259++) {
					@Pc(265) int[][] local265 = local49[local259];
					local75 += local265[0][local73];
					local255 += local265[1][local73];
					local257 += local265[2][local73];
				}
				local239[local73] = local33 * local75 >> 16;
				local243[local73] = local255 * local33 >> 16;
				local247[local73] = local33 * local257 >> 16;
			}
		}
		return local16;
	}
}
