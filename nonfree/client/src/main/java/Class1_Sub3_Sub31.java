import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!od")
public final class Class1_Sub3_Sub31 extends Class1_Sub3 {

	@OriginalMember(owner = "client!od", name = "W", descriptor = "I")
	private int anInt3151 = 1;

	@OriginalMember(owner = "client!od", name = "S", descriptor = "I")
	private int anInt3147 = 1;

	@OriginalMember(owner = "client!od", name = "<init>", descriptor = "()V")
	public Class1_Sub3_Sub31() {
		super(1, false);
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method3475(@OriginalArg(1) int arg0) {
		@Pc(7) int[] local7 = super.aClass79_41.method2341(arg0);
		if (super.aClass79_41.aBoolean125) {
			@Pc(24) int local24 = this.anInt3147 + this.anInt3147 + 1;
			@Pc(28) int local28 = 65536 / local24;
			@Pc(36) int local36 = this.anInt3151 + this.anInt3151 + 1;
			@Pc(40) int local40 = 65536 / local36;
			@Pc(43) int[][] local43 = new int[local36][];
			@Pc(64) int local64;
			for (@Pc(49) int local49 = arg0 - this.anInt3151; local49 <= this.anInt3151 + arg0; local49++) {
				@Pc(59) int[] local59 = this.method3468(Static171.anInt3496 & local49, 0);
				@Pc(62) int[] local62 = new int[Static76.anInt1531];
				local64 = 0;
				for (@Pc(68) int local68 = -this.anInt3147; local68 <= this.anInt3147; local68++) {
					local64 += local59[local68 & Static121.anInt2385];
				}
				@Pc(85) int local85 = 0;
				while (Static76.anInt1531 > local85) {
					local62[local85] = local64 * local28 >> 16;
					local64 -= local59[local85 - this.anInt3147 & Static121.anInt2385];
					local85++;
					local64 += local59[this.anInt3147 + local85 & Static121.anInt2385];
				}
				local43[this.anInt3151 + local49 - arg0] = local62;
			}
			for (@Pc(145) int local145 = 0; local145 < Static76.anInt1531; local145++) {
				@Pc(149) int local149 = 0;
				for (local64 = 0; local64 < local36; local64++) {
					local149 += local43[local64][local145];
				}
				local7[local145] = local40 * local149 >> 16;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(IZ)[[I")
	@Override
	public int[][] method3467(@OriginalArg(0) int arg0) {
		@Pc(16) int[][] local16 = super.aClass56_41.method1552(arg0);
		if (super.aClass56_41.aBoolean90) {
			@Pc(28) int local28 = this.anInt3151 + this.anInt3151 + 1;
			@Pc(32) int local32 = 65536 / local28;
			@Pc(40) int local40 = this.anInt3147 + this.anInt3147 + 1;
			@Pc(44) int local44 = 65536 / local40;
			@Pc(47) int[][][] local47 = new int[local28][][];
			@Pc(73) int local73;
			@Pc(71) int local71;
			for (@Pc(53) int local53 = arg0 - this.anInt3151; local53 <= this.anInt3151 + arg0; local53++) {
				@Pc(63) int[][] local63 = this.method3465(Static171.anInt3496 & local53, 0);
				@Pc(67) int[][] local67 = new int[3][Static76.anInt1531];
				@Pc(69) int local69 = 0;
				local71 = 0;
				local73 = 0;
				@Pc(77) int[] local77 = local63[0];
				@Pc(81) int[] local81 = local63[2];
				@Pc(85) int[] local85 = local63[1];
				for (@Pc(89) int local89 = -this.anInt3147; local89 <= this.anInt3147; local89++) {
					@Pc(95) int local95 = local89 & Static121.anInt2385;
					local71 += local81[local95];
					local73 += local85[local95];
					local69 += local77[local95];
				}
				@Pc(122) int[] local122 = local67[0];
				@Pc(126) int[] local126 = local67[1];
				@Pc(130) int[] local130 = local67[2];
				@Pc(132) int local132 = 0;
				while (Static76.anInt1531 > local132) {
					local122[local132] = local44 * local69 >> 16;
					local126[local132] = local73 * local44 >> 16;
					local130[local132] = local44 * local71 >> 16;
					@Pc(166) int local166 = local132 - this.anInt3147 & Static121.anInt2385;
					local69 -= local77[local166];
					local132++;
					local71 -= local81[local166];
					local73 -= local85[local166];
					@Pc(193) int local193 = local132 + this.anInt3147 & Static121.anInt2385;
					local69 += local77[local193];
					local73 += local85[local193];
					local71 += local81[local193];
				}
				local47[local53 + this.anInt3151 - arg0] = local67;
			}
			@Pc(235) int[] local235 = local16[0];
			@Pc(239) int[] local239 = local16[1];
			@Pc(243) int[] local243 = local16[2];
			for (local73 = 0; local73 < Static76.anInt1531; local73++) {
				local71 = 0;
				@Pc(251) int local251 = 0;
				@Pc(253) int local253 = 0;
				for (@Pc(255) int local255 = 0; local255 < local28; local255++) {
					@Pc(261) int[][] local261 = local47[local255];
					local71 += local261[0][local73];
					local251 += local261[1][local73];
					local253 += local261[2][local73];
				}
				local235[local73] = local32 * local71 >> 16;
				local239[local73] = local251 * local32 >> 16;
				local243[local73] = local253 * local32 >> 16;
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(IILclient!pg;)V")
	@Override
	public void method3466(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub17 arg1) {
		if (arg0 == 0) {
			this.anInt3147 = arg1.method2142();
		} else if (arg0 == 1) {
			this.anInt3151 = arg1.method2142();
		} else if (arg0 == 2) {
			super.aBoolean213 = arg1.method2142() == 1;
		}
	}
}
