import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static321 {

	@OriginalMember(owner = "client!pv", name = "M", descriptor = "Lclient!on;")
	public static Class130 aClass130_1;

	@OriginalMember(owner = "client!pv", name = "b", descriptor = "I")
	public static int anInt5511 = 0;

	@OriginalMember(owner = "client!pv", name = "e", descriptor = "Lclient!os;")
	public static final Class182 aClass182_199 = new Class182("Loaded wordpack", "Wordpack geladen.", "Module texte chargé", "Pacote de palavras carregado");

	@OriginalMember(owner = "client!pv", name = "I", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray35 = new String[100];

	@OriginalMember(owner = "client!pv", name = "L", descriptor = "S")
	public static short aShort77 = 32767;

	@OriginalMember(owner = "client!pv", name = "a", descriptor = "(III)V")
	public static void method4391(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(20) boolean local20 = Static309.aClass11ArrayArrayArray2[0][arg1][arg2] != null && Static309.aClass11ArrayArrayArray2[0][arg1][arg2].aClass11_1 != null;
		for (@Pc(22) int local22 = arg0; local22 >= 0; local22--) {
			if (Static309.aClass11ArrayArrayArray2[local22][arg1][arg2] == null) {
				@Pc(46) Class11 local46 = Static309.aClass11ArrayArrayArray2[local22][arg1][arg2] = new Class11(local22, arg1, arg2);
				if (local20) {
					local46.aByte1++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!pv", name = "a", descriptor = "(IIII[FII)V")
	public static void method4393(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) float[] arg4, @OriginalArg(6) int arg5) {
		if (arg0 > 0 && !Static131.method2284(arg0)) {
			throw new IllegalArgumentException("");
		} else if (arg5 <= 0 || Static131.method2284(arg5)) {
			@Pc(34) int local34 = Static254.method3688(6408);
			@Pc(36) int local36 = 0;
			@Pc(43) int local43 = arg5 <= arg0 ? arg5 : arg0;
			@Pc(47) int local47 = arg0 >> 1;
			@Pc(51) int local51 = arg5 >> 1;
			@Pc(61) float[] local61 = arg4;
			@Pc(68) float[] local68 = new float[local47 * local51 * local34];
			while (true) {
				OpenGL.glTexImage2Df(3553, local36, 34842, arg0, arg5, 0, 6408, 5126, local61, 0);
				if (local43 <= 1) {
					return;
				}
				@Pc(89) int local89 = arg0 * local34;
				for (@Pc(91) int local91 = 0; local91 < local34; local91++) {
					@Pc(95) int local95 = local91;
					@Pc(97) int local97 = local91;
					@Pc(101) int local101 = local89 + local91;
					for (@Pc(103) int local103 = 0; local103 < local51; local103++) {
						for (@Pc(107) int local107 = 0; local107 < local47; local107++) {
							@Pc(113) float local113 = local61[local97];
							local97 += local34;
							@Pc(123) float local123 = local113 + local61[local97];
							@Pc(129) float local129 = local123 + local61[local101];
							local97 += local34;
							local101 += local34;
							@Pc(143) float local143 = local129 + local61[local101];
							local68[local95] = local143 * 0.25F;
							local101 += local34;
							local95 += local34;
						}
						local101 += local89;
						local97 += local89;
					}
				}
				@Pc(187) float[] local187 = local68;
				local68 = local61;
				arg0 = local47;
				local61 = local187;
				arg5 = local51;
				local36++;
				local47 >>= 0x1;
				local43 >>= 0x1;
				local51 >>= 0x1;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!pv", name = "a", descriptor = "(B)V")
	public static void method4394() {
		if (Static240.aString39.toLowerCase().indexOf("microsoft") != -1) {
			Static461.anIntArray718[219] = 42;
			Static461.anIntArray718[187] = 27;
			Static461.anIntArray718[192] = 58;
			Static461.anIntArray718[222] = 59;
			Static461.anIntArray718[186] = 57;
			Static461.anIntArray718[191] = 73;
			Static461.anIntArray718[190] = 72;
			Static461.anIntArray718[189] = 26;
			Static461.anIntArray718[221] = 43;
			Static461.anIntArray718[223] = 28;
			Static461.anIntArray718[220] = 74;
			Static461.anIntArray718[188] = 71;
			return;
		}
		Static461.anIntArray718[45] = 26;
		Static461.anIntArray718[91] = 42;
		Static461.anIntArray718[46] = 72;
		Static461.anIntArray718[93] = 43;
		Static461.anIntArray718[47] = 73;
		Static461.anIntArray718[44] = 71;
		if (Static240.aMethod1 == null) {
			Static461.anIntArray718[222] = 59;
			Static461.anIntArray718[192] = 58;
		} else {
			Static461.anIntArray718[222] = 58;
			Static461.anIntArray718[520] = 59;
			Static461.anIntArray718[192] = 28;
		}
		Static461.anIntArray718[61] = 27;
		Static461.anIntArray718[92] = 74;
		Static461.anIntArray718[59] = 57;
	}
}
