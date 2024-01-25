import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static292 {

	@OriginalMember(owner = "client!sl", name = "l", descriptor = "Lclient!vo;")
	public static Class211 aClass211_1;

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "Lclient!kn;")
	public static final Class116 aClass116_43 = new Class116();

	@OriginalMember(owner = "client!sl", name = "f", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray68 = new String[100];

	@OriginalMember(owner = "client!sl", name = "i", descriptor = "Z")
	public static boolean aBoolean421 = true;

	@OriginalMember(owner = "client!sl", name = "k", descriptor = "I")
	public static int anInt5680 = 127;

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "(BC)C")
	public static char method4886(@OriginalArg(1) char arg0) {
		if (arg0 == ' ' || arg0 == ' ' || arg0 == '_' || arg0 == '-') {
			return '_';
		} else if (arg0 == '[' || arg0 == ']' || arg0 == '#') {
			return arg0;
		} else if (arg0 == 'à' || arg0 == 'á' || arg0 == 'â' || arg0 == 'ä' || arg0 == 'ã' || arg0 == 'À' || arg0 == 'Á' || arg0 == 'Â' || arg0 == 'Ä' || arg0 == 'Ã') {
			return 'a';
		} else if (arg0 == 'è' || arg0 == 'é' || arg0 == 'ê' || arg0 == 'ë' || arg0 == 'È' || arg0 == 'É' || arg0 == 'Ê' || arg0 == 'Ë') {
			return 'e';
		} else if (arg0 == 'í' || arg0 == 'î' || arg0 == 'ï' || arg0 == 'Í' || arg0 == 'Î' || arg0 == 'Ï') {
			return 'i';
		} else if (arg0 == 'ò' || arg0 == 'ó' || arg0 == 'ô' || arg0 == 'ö' || arg0 == 'õ' || arg0 == 'Ò' || arg0 == 'Ó' || arg0 == 'Ô' || arg0 == 'Ö' || arg0 == 'Õ') {
			return 'o';
		} else if (arg0 == 'ù' || arg0 == 'ú' || arg0 == 'û' || arg0 == 'ü' || arg0 == 'Ù' || arg0 == 'Ú' || arg0 == 'Û' || arg0 == 'Ü') {
			return 'u';
		} else if (arg0 == 'ç' || arg0 == 'Ç') {
			return 'c';
		} else if (arg0 == 'ÿ' || arg0 == 'Ÿ') {
			return 'y';
		} else if (arg0 == 'ñ' || arg0 == 'Ñ') {
			return 'n';
		} else if (arg0 == 'ß') {
			return 'b';
		} else {
			return Character.toLowerCase(arg0);
		}
	}

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "(I)V")
	public static void method4888() {
		Static244.aClass198_176.method5213();
	}

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "(III)V")
	public static void method4889(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) Class43 local10 = new Class43(16);
		for (@Pc(19) Class4_Sub19 local19 = (Class4_Sub19) Static165.aClass43_20.method1283(); local19 != null; local19 = (Class4_Sub19) Static165.aClass43_20.method1278()) {
			local19.method5687();
			@Pc(30) int local30 = (int) (local19.aLong223 >> 28);
			@Pc(41) int local41 = (int) (local19.aLong223 >> 14 & 0x3FFFL) - arg0;
			@Pc(50) int local50 = (int) (local19.aLong223 & 0x3FFFL) - arg1;
			if (local50 >= 0 && local41 >= 0 && Static350.anInt6637 > local50 && local41 < Static105.anInt2647) {
				local10.method1276(local19, (long) (local30 << 28 | local41 << 14 | local50));
			}
		}
		Static165.aClass43_20 = local10;
	}

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "(Z)V")
	public static void method4890() {
		if (Static349.anInt6620 == -1 || Static9.anInt215 == -1) {
			return;
		}
		@Pc(24) int local24 = ((Static306.anInt5909 - Static110.anInt2696) * Static212.anInt2930 >> 16) + Static110.anInt2696;
		Static212.anInt2930 += local24;
		if (Static212.anInt2930 >= 65535) {
			Static212.anInt2930 = 65535;
			if (Static17.aBoolean28) {
				Static91.aBoolean436 = false;
			} else {
				Static91.aBoolean436 = true;
			}
			Static17.aBoolean28 = true;
		} else {
			Static17.aBoolean28 = false;
			Static91.aBoolean436 = false;
		}
		@Pc(56) float local56 = (float) Static212.anInt2930 / 65535.0F;
		@Pc(59) float[] local59 = new float[3];
		@Pc(63) int local63 = Static212.anInt2911 * 2;
		@Pc(89) int local89;
		@Pc(122) int local122;
		@Pc(130) int local130;
		@Pc(135) int local135;
		@Pc(143) int local143;
		@Pc(160) int local160;
		for (@Pc(65) int local65 = 0; local65 < 3; local65++) {
			@Pc(77) int local77 = Static283.anIntArrayArrayArray33[Static349.anInt6620][local63][local65] * 3;
			local89 = Static283.anIntArrayArrayArray33[Static349.anInt6620][local63 + 1][local65] * 3;
			local122 = (Static283.anIntArrayArrayArray33[Static349.anInt6620][local63 + 2][local65] + Static283.anIntArrayArrayArray33[Static349.anInt6620][local63 + 2][local65] - Static283.anIntArrayArrayArray33[Static349.anInt6620][local63 + 3][local65]) * 3;
			local130 = Static283.anIntArrayArrayArray33[Static349.anInt6620][local63][local65];
			local135 = local89 - local77;
			local143 = local77 + local122 - local89 * 2;
			local160 = local89 + Static283.anIntArrayArrayArray33[Static349.anInt6620][local63 + 2][local65] - local122 - local130;
			local59[local65] = (local56 * ((float) local143 + local56 * (float) local160) + (float) local135) * local56 + (float) local130;
		}
		Static112.anInt2705 = (int) local59[1] * -1;
		Static129.anInt3039 = (int) local59[2] - Static136.anInt3193 * 128;
		Static240.anInt4829 = (int) local59[0] - Static286.anInt6699 * 128;
		@Pc(214) float[] local214 = new float[3];
		local89 = Static290.anInt5649 * 2;
		for (local122 = 0; local122 < 3; local122++) {
			local130 = Static283.anIntArrayArrayArray33[Static9.anInt215][local89][local122] * 3;
			local135 = Static283.anIntArrayArrayArray33[Static9.anInt215][local89 + 1][local122] * 3;
			local143 = (Static283.anIntArrayArrayArray33[Static9.anInt215][local89 + 2][local122] + Static283.anIntArrayArrayArray33[Static9.anInt215][local89 + 2][local122] - Static283.anIntArrayArrayArray33[Static9.anInt215][local89 + 3][local122]) * 3;
			local160 = Static283.anIntArrayArrayArray33[Static9.anInt215][local89][local122];
			@Pc(290) int local290 = local135 - local130;
			@Pc(299) int local299 = local143 + local130 - local135 * 2;
			@Pc(318) int local318 = Static283.anIntArrayArrayArray33[Static9.anInt215][local89 + 2][local122] + local135 - local160 - local143;
			local214[local122] = local56 * ((float) local290 + local56 * (local56 * (float) local318 + (float) local299)) + (float) local160;
		}
		@Pc(353) float local353 = local214[0] - local59[0];
		@Pc(368) float local368 = -1.0F * (local214[1] - local59[1]);
		@Pc(377) float local377 = local214[2] - local59[2];
		@Pc(387) double local387 = Math.sqrt((double) (local353 * local353 + local377 * local377));
		Static337.anInt6445 = (int) (Math.atan2((double) local368, local387) * 2607.5945876176133D) & 0x3FFF;
		Static217.anInt4437 = (int) (-Math.atan2((double) local353, (double) local377) * 2607.5945876176133D) & 0x3FFF;
		Static80.anInt2124 = (Static212.anInt2930 * (Static283.anIntArrayArrayArray33[Static349.anInt6620][local63 + 2][3] - Static283.anIntArrayArrayArray33[Static349.anInt6620][local63][3]) >> 16) + Static283.anIntArrayArrayArray33[Static349.anInt6620][local63][3];
	}

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "(IIBIII)V")
	public static void method4891(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(8) int local8 = arg4 + 1;
		Static135.method2878(Static223.anIntArrayArray124[arg4], arg0, arg3, arg2);
		@Pc(17) int local17 = arg1 - 1;
		Static135.method2878(Static223.anIntArrayArray124[arg1], arg0, arg3, arg2);
		for (@Pc(25) int local25 = local8; local25 <= local17; local25++) {
			@Pc(31) int[] local31 = Static223.anIntArrayArray124[local25];
			local31[arg2] = local31[arg0] = arg3;
		}
	}
}
