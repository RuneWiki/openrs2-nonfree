import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static203 {

	@OriginalMember(owner = "client!lm", name = "i", descriptor = "I")
	public static int anInt3730;

	@OriginalMember(owner = "client!lm", name = "j", descriptor = "Ljava/lang/String;")
	public static String aString31;

	@OriginalMember(owner = "client!lm", name = "h", descriptor = "Lclient!fn;")
	public static final Class77 aClass77_95 = new Class77(61, 5);

	@OriginalMember(owner = "client!lm", name = "k", descriptor = "I")
	public static int anInt3731 = -1;

	@OriginalMember(owner = "client!lm", name = "l", descriptor = "[I")
	public static final int[] anIntArray444 = new int[2048];

	@OriginalMember(owner = "client!lm", name = "m", descriptor = "[[I")
	public static final int[][] anIntArrayArray22 = new int[128][128];

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(IIIIIII)V")
	public static void method3380(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		if (Static332.anInt5823 <= arg3 - arg2 && Static202.anInt3722 >= arg3 + arg2 && arg4 - arg2 >= Static313.anInt5542 && arg2 + arg4 <= Static345.anInt6084) {
			Static211.method3586(arg1, arg0, arg4, arg5, arg3, arg2);
		} else {
			Static99.method1781(arg0, arg4, arg5, arg2, arg3, arg1);
		}
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(B)V")
	public static void method3381() {
		if (Static295.aFloat73 < 1024.0F) {
			Static295.aFloat73 = 1024.0F;
		}
		if (Static295.aFloat73 > 3072.0F) {
			Static295.aFloat73 = 3072.0F;
		}
		while (Static18.aFloat8 >= 16384.0F) {
			Static18.aFloat8 -= 16384.0F;
		}
		while (Static18.aFloat8 < 0.0F) {
			Static18.aFloat8 += 16384.0F;
		}
		@Pc(41) int local41 = Static243.anInt4394 >> 7;
		@Pc(45) int local45 = Static301.anInt5428 >> 7;
		@Pc(51) int local51 = Static18.method508(Static301.anInt5428, Static331.anInt5804, Static243.anInt4394);
		@Pc(53) int local53 = 0;
		@Pc(71) int local71;
		if (local41 > 3 && local45 > 3 && local41 < 100 && local45 < 100) {
			for (local71 = local41 - 4; local71 <= local41 + 4; local71++) {
				for (@Pc(77) int local77 = local45 - 4; local77 <= local45 + 4; local77++) {
					@Pc(81) int local81 = Static331.anInt5804;
					if (local81 < 3 && Static231.method3806(local71, local77)) {
						local81++;
					}
					@Pc(92) int local92 = 0;
					if (Static314.aClass134_Sub1_3.aByteArrayArrayArray16 != null && Static314.aClass134_Sub1_3.aByteArrayArrayArray16[local81] != null) {
						local92 = (Static314.aClass134_Sub1_3.aByteArrayArrayArray16[local81][local71][local77] & 0xFF) * 8;
					}
					@Pc(125) int local125 = local92 + local51 - Static17.aClass33Array1[local81].method4057(local71, local77);
					if (local125 > local53) {
						local53 = local125;
					}
				}
			}
		}
		local71 = local53 * 1536;
		if (local71 > 786432) {
			local71 = 786432;
		}
		if (local71 < 262144) {
			local71 = 262144;
		}
		if (Static369.anInt6437 < local71) {
			Static369.anInt6437 += (local71 - Static369.anInt6437) / 24;
		} else if (Static369.anInt6437 > local71) {
			Static369.anInt6437 += (local71 - Static369.anInt6437) / 80;
			return;
		}
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(IC)C")
	public static char method3382(@OriginalArg(1) char arg0) {
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

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(I)Lclient!cp;")
	public static Class38 method3384() {
		try {
			return (Class38) Class.forName("Class38_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(14) Throwable local14) {
			return null;
		}
	}
}
