import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static342 {

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "Lclient!go;")
	public static Class95 aClass95_14 = null;

	@OriginalMember(owner = "client!rg", name = "d", descriptor = "Lclient!gk;")
	public static final Class7_Sub14 aClass7_Sub14_6 = new Class7_Sub14(new byte[5000]);

	@OriginalMember(owner = "client!rg", name = "h", descriptor = "Lclient!dp;")
	public static final Class55 aClass55_119 = new Class55("Loaded client variable data", "Client-Variablen geladen", "Variables du client chargées", "As variáveis do sistema foram carregadas");

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(I[B)Z")
	public static boolean method4433(@OriginalArg(1) byte[] arg0) {
		@Pc(8) Class7_Sub14 local8 = new Class7_Sub14(arg0);
		@Pc(12) int local12 = local8.method3981();
		if (local12 != 2) {
			return false;
		}
		@Pc(38) boolean local38 = local8.method3981() == 1;
		if (local38) {
			Static216.method944(local8);
		}
		Static35.method3783(local8);
		return true;
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(III)Z")
	public static boolean method4434(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static381.method4854(arg0, arg1) & Static42.method575(arg0, arg1);
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(Z)V")
	public static void method4435() {
		Static47.aClass126_7.method2821();
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(Lclient!mh;III)V")
	public static void method4437(@OriginalArg(0) Class156 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		Static259.aClass156ArrayArray1[arg1][arg2] = arg0;
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(III[IIBII)V")
	public static void method4438(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		if (arg0 > 0 && !Static217.method3066(arg0)) {
			throw new IllegalArgumentException("");
		} else if (arg4 <= 0 || Static217.method3066(arg4)) {
			@Pc(42) int local42 = 0;
			@Pc(53) int local53 = arg4 > arg0 ? arg0 : arg4;
			@Pc(57) int local57 = arg0 >> 1;
			@Pc(61) int local61 = arg4 >> 1;
			@Pc(67) int[] local67 = arg3;
			@Pc(72) int[] local72 = new int[local61 * local57];
			while (true) {
				OpenGL.glTexImage2Di(arg1, local42, arg2, arg0, arg4, 0, 32993, arg5, local67, 0);
				if (local53 <= 1) {
					return;
				}
				@Pc(88) int local88 = 0;
				@Pc(90) int local90 = 0;
				@Pc(94) int local94 = arg0;
				@Pc(96) int[] local96 = local72;
				for (@Pc(98) int local98 = 0; local98 < local61; local98++) {
					for (@Pc(102) int local102 = 0; local102 < local57; local102++) {
						@Pc(109) int local109 = local67[local90++];
						@Pc(114) int local114 = local67[local90++];
						@Pc(119) int local119 = local67[local94++];
						@Pc(123) int local123 = local109 & 0xFF;
						@Pc(128) int local128 = local67[local94++];
						@Pc(134) int local134 = local109 >> 16 & 0xFF;
						@Pc(140) int local140 = local109 >> 24 & 0xFF;
						@Pc(146) int local146 = local109 >> 8 & 0xFF;
						@Pc(154) int local154 = local134 + (local114 >> 16 & 0xFF);
						@Pc(162) int local162 = local146 + (local114 >> 8 & 0xFF);
						@Pc(170) int local170 = local140 + (local114 >> 24 & 0xFF);
						@Pc(176) int local176 = local123 + (local114 & 0xFF);
						@Pc(182) int local182 = local176 + (local119 & 0xFF);
						@Pc(190) int local190 = local162 + (local119 >> 8 & 0xFF);
						@Pc(198) int local198 = local170 + (local119 >> 24 & 0xFF);
						@Pc(206) int local206 = local154 + (local119 >> 16 & 0xFF);
						@Pc(212) int local212 = local182 + (local128 & 0xFF);
						@Pc(220) int local220 = local190 + (local128 >> 8 & 0xFF);
						@Pc(228) int local228 = local206 + (local128 >> 16 & 0xFF);
						@Pc(236) int local236 = local198 + (local128 >> 24 & 0xFF);
						local72[local88++] = local212 >> 2 & 0xFF | (local220 & 0x3FC) << 6 | (local236 & 0x3FC) << 22 | (local228 & 0x3FC) << 14;
					}
					local94 += arg0;
					local90 += arg0;
				}
				local72 = local67;
				arg4 = local61;
				local67 = local96;
				arg0 = local57;
				local53 >>= 0x1;
				local57 >>= 0x1;
				local61 >>= 0x1;
				local42++;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}
}
