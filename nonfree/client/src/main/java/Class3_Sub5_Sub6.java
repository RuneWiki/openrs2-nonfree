import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!f")
public final class Class3_Sub5_Sub6 extends Class3_Sub5 {

	@OriginalMember(owner = "client!f", name = "M", descriptor = "I")
	private int anInt1055;

	@OriginalMember(owner = "client!f", name = "ab", descriptor = "I")
	private int anInt1064;

	@OriginalMember(owner = "client!f", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method3172(@OriginalArg(1) int arg0) {
		@Pc(16) int[][] local16 = super.aClass89_41.method2876(arg0);
		if (super.aClass89_41.aBoolean160) {
			@Pc(28) int local28 = this.anInt1064 + this.anInt1064 + 1;
			@Pc(36) int local36 = this.anInt1055 + this.anInt1055 + 1;
			@Pc(39) int[][][] local39 = new int[local28][][];
			@Pc(63) int local63;
			@Pc(69) int local69;
			for (@Pc(45) int local45 = arg0 - this.anInt1064; local45 <= arg0 + this.anInt1064; local45++) {
				@Pc(55) int[][] local55 = this.method3163(0, local45 & Static23.anInt543);
				@Pc(57) int local57 = 0;
				@Pc(61) int[][] local61 = new int[3][Static104.anInt2195];
				local63 = 0;
				@Pc(67) int[] local67 = local55[0];
				local69 = 0;
				@Pc(73) int[] local73 = local55[1];
				@Pc(77) int[] local77 = local55[2];
				for (@Pc(81) int local81 = -this.anInt1055; local81 <= this.anInt1055; local81++) {
					@Pc(87) int local87 = Static112.anInt2517 & local81;
					local57 += local67[local87];
					local63 += local73[local87];
					local69 += local77[local87];
				}
				@Pc(118) int[] local118 = local61[1];
				@Pc(122) int[] local122 = local61[0];
				@Pc(126) int[] local126 = local61[2];
				@Pc(128) int local128 = 0;
				while (local128 < Static104.anInt2195) {
					local122[local128] = local57 / local36;
					local118[local128] = local63 / local36;
					local126[local128] = local69 / local36;
					@Pc(155) int local155 = Static112.anInt2517 & local128 - this.anInt1055;
					local57 -= local67[local155];
					local63 -= local73[local155];
					local69 -= local77[local155];
					local128++;
					@Pc(181) int local181 = Static112.anInt2517 & this.anInt1055 + local128;
					local69 += local77[local181];
					local57 += local67[local181];
					local63 += local73[local181];
				}
				local39[local45 + this.anInt1064 - arg0] = local61;
			}
			@Pc(229) int[] local229 = local16[0];
			@Pc(233) int[] local233 = local16[1];
			@Pc(237) int[] local237 = local16[2];
			for (local63 = 0; local63 < Static104.anInt2195; local63++) {
				local69 = 0;
				@Pc(245) int local245 = 0;
				@Pc(247) int local247 = 0;
				for (@Pc(249) int local249 = 0; local249 < local28; local249++) {
					@Pc(255) int[][] local255 = local39[local249];
					local247 += local255[1][local63];
					local245 += local255[2][local63];
					local69 += local255[0][local63];
				}
				local229[local63] = local69 / local28;
				local233[local63] = local247 / local28;
				local237[local63] = local245 / local28;
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method3173(@OriginalArg(0) int arg0) {
		@Pc(19) int[] local19 = super.aClass39_41.method1114(arg0);
		if (super.aClass39_41.aBoolean66) {
			@Pc(31) int local31 = this.anInt1064 + this.anInt1064 + 1;
			@Pc(39) int local39 = this.anInt1055 + this.anInt1055 + 1;
			@Pc(42) int[][] local42 = new int[local31][];
			@Pc(62) int local62;
			for (@Pc(47) int local47 = arg0 - this.anInt1064; local47 <= arg0 + this.anInt1064; local47++) {
				@Pc(57) int[] local57 = this.method3167(Static23.anInt543 & local47, 0);
				@Pc(60) int[] local60 = new int[Static104.anInt2195];
				local62 = 0;
				for (@Pc(66) int local66 = -this.anInt1055; local66 <= this.anInt1055; local66++) {
					local62 += local57[Static112.anInt2517 & local66];
				}
				@Pc(87) int local87 = 0;
				while (Static104.anInt2195 > local87) {
					local60[local87] = local62 / local39;
					local62 -= local57[Static112.anInt2517 & local87 - this.anInt1055];
					local87++;
					local62 += local57[Static112.anInt2517 & local87 + this.anInt1055];
				}
				local42[local47 + this.anInt1064 - arg0] = local60;
			}
			for (@Pc(149) int local149 = 0; local149 < Static104.anInt2195; local149++) {
				@Pc(153) int local153 = 0;
				for (local62 = 0; local62 < local31; local62++) {
					local153 += local42[local62][local149];
				}
				local19[local149] = local153 / local31;
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(IILclient!mb;)V")
	@Override
	public void method3169(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub17 arg1) {
		if (arg0 == 0) {
			this.anInt1055 = arg1.method2107();
		} else if (arg0 == 1) {
			this.anInt1064 = arg1.method2107();
		} else if (arg0 == 2) {
			super.aBoolean178 = arg1.method2107() == 1;
		}
	}
}
