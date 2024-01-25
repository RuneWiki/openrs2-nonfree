import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static2 {

	@OriginalMember(owner = "client!ab", name = "k", descriptor = "I")
	public static int anInt3794;

	@OriginalMember(owner = "client!ab", name = "f", descriptor = "Lclient!fn;")
	public static final Class77 aClass77_96 = new Class77(96, 20);

	@OriginalMember(owner = "client!ab", name = "j", descriptor = "[Z")
	public static final boolean[] aBooleanArray84 = new boolean[8];

	@OriginalMember(owner = "client!ab", name = "l", descriptor = "[I")
	public static final int[] anIntArray464 = new int[4];

	@OriginalMember(owner = "client!ab", name = "m", descriptor = "Z")
	public static boolean aBoolean280 = false;

	@OriginalMember(owner = "client!ab", name = "o", descriptor = "Lclient!tm;")
	public static final Class221 aClass221_128 = new Class221("Loading textures - ", "Lade Texturen - ", "Chargement des textures - ", "Carregando texturas - ");

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(IILclient!ms;IILclient!vb;Lclient!aq;I)V")
	public static void method3449(@OriginalArg(1) int arg0, @OriginalArg(2) Class155 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class201 arg4, @OriginalArg(6) Class5 arg5, @OriginalArg(7) int arg6) {
		if (arg5 == null) {
			return;
		}
		@Pc(14) int local14;
		if (Static283.anInt5017 == 4) {
			local14 = (int) Static18.aFloat8 & 0x3FFF;
		} else {
			local14 = (int) Static18.aFloat8 + Static232.anInt4267 & 0x3FFF;
		}
		@Pc(36) int local36 = Math.max(arg1.anInt4170 / 2, arg1.anInt4214 / 2) + 10;
		@Pc(44) int local44 = arg0 * arg0 + arg3 * arg3;
		if (local44 > local36 * local36) {
			return;
		}
		@Pc(54) int local54 = Class104.anIntArray705[local14];
		@Pc(58) int local58 = Class104.anIntArray706[local14];
		if (Static283.anInt5017 != 4) {
			local58 = local58 * 256 / (Static48.anInt942 + 256);
			local54 = local54 * 256 / (Static48.anInt942 + 256);
		}
		@Pc(94) int local94 = local58 * arg3 + local54 * arg0 >> 15;
		@Pc(105) int local105 = arg0 * local58 - local54 * arg3 >> 15;
		arg5.method4995(local94 + arg2 + arg1.anInt4170 / 2 - arg5.method4990() / 2, -local105 + arg6 - (-(arg1.anInt4214 / 2) - -(arg5.method4992() / 2)), arg4, arg2, arg6);
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(ILjava/lang/String;I)V")
	public static void method3450(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = Static168.anInt3003;
		@Pc(9) int[] local9 = Static7.anIntArray24;
		@Pc(11) boolean local11 = false;
		for (@Pc(13) int local13 = 0; local13 < local7; local13++) {
			@Pc(21) Class12_Sub1_Sub2_Sub2 local21 = Static90.aClass12_Sub1_Sub2_Sub2Array1[local9[local13]];
			if (local21 != null && Static267.aClass12_Sub1_Sub2_Sub2_1 != local21 && local21.aString51 != null && local21.aString51.equalsIgnoreCase(arg0)) {
				local11 = true;
				if (arg1 == 1) {
					Static19.method552(Static380.aClass41_203);
					Static39.aClass2_Sub13_Sub2_4.method4190(local9[local13]);
					Static39.aClass2_Sub13_Sub2_4.method4195(0);
				} else if (arg1 == 4) {
					Static19.method552(Static377.aClass41_202);
					Static39.aClass2_Sub13_Sub2_4.method4199(local9[local13]);
					Static39.aClass2_Sub13_Sub2_4.method4215(0);
				} else if (arg1 == 5) {
					Static19.method552(Static369.aClass41_197);
					Static39.aClass2_Sub13_Sub2_4.method4236(0);
					Static39.aClass2_Sub13_Sub2_4.method4212(local9[local13]);
				} else if (arg1 == 6) {
					Static19.method552(Static354.aClass41_187);
					Static39.aClass2_Sub13_Sub2_4.method4212(local9[local13]);
					Static39.aClass2_Sub13_Sub2_4.method4207(0);
				} else if (arg1 == 7) {
					Static19.method552(Static315.aClass41_168);
					Static39.aClass2_Sub13_Sub2_4.method4190(local9[local13]);
					Static39.aClass2_Sub13_Sub2_4.method4215(0);
				}
				break;
			}
		}
		if (!local11) {
			Static366.method5530(Static239.aClass221_150.method5229(Static189.anInt5185) + arg0);
		}
	}
}
