import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static359 {

	@OriginalMember(owner = "client!rk", name = "m", descriptor = "Lclient!n;")
	public static Class11 aClass11_5;

	@OriginalMember(owner = "client!rk", name = "r", descriptor = "[Z")
	public static boolean[] aBooleanArray20;

	@OriginalMember(owner = "client!rk", name = "u", descriptor = "Lclient!gw;")
	public static Class93 aClass93_8;

	@OriginalMember(owner = "client!rk", name = "v", descriptor = "I")
	public static int anInt6118;

	@OriginalMember(owner = "client!rk", name = "n", descriptor = "Lclient!pa;")
	public static final Class183 aClass183_16 = new Class183(6, 14);

	@OriginalMember(owner = "client!rk", name = "p", descriptor = "Lclient!of;")
	public static final Class174 aClass174_175 = new Class174("Loading interface scripts - ", "Lade Interface-Skripte - ", "Chargement des interfaces - ", "Carregando interfaces - ");

	@OriginalMember(owner = "client!rk", name = "q", descriptor = "Lclient!of;")
	public static final Class174 aClass174_176 = new Class174(" has logged in.", " loggt sich ein.", " s'est connecté.", " entrou no jogo.");

	@OriginalMember(owner = "client!rk", name = "s", descriptor = "Lclient!of;")
	public static final Class174 aClass174_177 = new Class174("Starting 3D Library", "Starte 3D-Softwarebibliothek.", "Démarrage de la librairie 3D", "Iniciando biblioteca 3D");

	@OriginalMember(owner = "client!rk", name = "t", descriptor = "I")
	public static int anInt6117 = 0;

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "(IIIIIII[I)V")
	public static void method5018(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(7) int[] arg5) {
		if (arg1 > 0 && !Static94.method1600(arg1)) {
			throw new IllegalArgumentException("");
		} else if (arg4 <= 0 || Static94.method1600(arg4)) {
			@Pc(47) int local47 = 0;
			@Pc(54) int local54 = arg1 < arg4 ? arg1 : arg4;
			@Pc(58) int local58 = arg1 >> 1;
			@Pc(62) int local62 = arg4 >> 1;
			@Pc(64) int[] local64 = arg5;
			@Pc(69) int[] local69 = new int[local62 * local58];
			while (true) {
				OpenGL.glTexImage2Di(arg0, local47, arg2, arg1, arg4, 0, 32993, arg3, local64, 0);
				if (local54 <= 1) {
					return;
				}
				@Pc(85) int local85 = 0;
				@Pc(87) int local87 = 0;
				@Pc(91) int local91 = arg1;
				for (@Pc(93) int local93 = 0; local93 < local62; local93++) {
					for (@Pc(97) int local97 = 0; local97 < local58; local97++) {
						@Pc(104) int local104 = local64[local87++];
						@Pc(109) int local109 = local64[local87++];
						@Pc(114) int local114 = local64[local91++];
						@Pc(118) int local118 = local104 & 0xFF;
						@Pc(124) int local124 = local104 >> 16 & 0xFF;
						@Pc(130) int local130 = local104 >> 8 & 0xFF;
						@Pc(135) int local135 = local64[local91++];
						@Pc(141) int local141 = local104 >> 24 & 0xFF;
						@Pc(147) int local147 = local118 + (local109 & 0xFF);
						@Pc(155) int local155 = local124 + (local109 >> 16 & 0xFF);
						@Pc(163) int local163 = local141 + (local109 >> 24 & 0xFF);
						@Pc(171) int local171 = local130 + (local109 >> 8 & 0xFF);
						@Pc(179) int local179 = local171 + (local114 >> 8 & 0xFF);
						@Pc(185) int local185 = local147 + (local114 & 0xFF);
						@Pc(193) int local193 = local163 + (local114 >> 24 & 0xFF);
						@Pc(201) int local201 = local155 + (local114 >> 16 & 0xFF);
						@Pc(207) int local207 = local185 + (local135 & 0xFF);
						@Pc(215) int local215 = local201 + (local135 >> 16 & 0xFF);
						@Pc(223) int local223 = local193 + (local135 >> 24 & 0xFF);
						@Pc(231) int local231 = local179 + (local135 >> 8 & 0xFF);
						local69[local85++] = (local231 & 0x3FC) << 6 | (local223 & 0x3FC) << 22 | (local215 & 0x3FC) << 14 | local207 >> 2 & 0xFF;
					}
					local91 += arg1;
					local87 += arg1;
				}
				@Pc(280) int[] local280 = local69;
				local69 = local64;
				local64 = local280;
				arg1 = local58;
				arg4 = local62;
				local54 >>= 0x1;
				local62 >>= 0x1;
				local58 >>= 0x1;
				local47++;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "(ZII)Z")
	public static boolean method5020(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x220) == 544 | (arg1 & 0x18) != 0;
	}

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "(ZIIBZLjava/lang/String;IILjava/lang/String;JI)V")
	public static void method5021(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) String arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) String arg7, @OriginalArg(9) long arg8, @OriginalArg(10) int arg9) {
		if (!Static367.aBoolean425 && Static276.anInt4608 < 500) {
			@Pc(24) int local24 = arg6 == -1 ? Static302.anInt5198 : arg6;
			@Pc(38) Class3_Sub38 local38 = new Class3_Sub38(arg7, arg4, local24, arg1, arg5, arg8, arg9, arg2, arg3, arg0);
			Static325.aClass193_54.method4527(local38);
			Static276.anInt4608++;
		}
	}
}
