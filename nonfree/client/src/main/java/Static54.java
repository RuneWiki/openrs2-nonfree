import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static54 {

	@OriginalMember(owner = "client!cd", name = "c", descriptor = "I")
	public static int anInt4080 = 0;

	@OriginalMember(owner = "client!cd", name = "l", descriptor = "Lclient!h;")
	public static final Class114 aClass114_85 = new Class114("Loading additional fonts - ", "Lade Zusatzschriftarten - ", "Chargement de polices secondaires - ", "Carregando fontes principais - ");

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(Ljava/lang/String;ZILjava/lang/String;)V")
	public static void method3635(@OriginalArg(0) String arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) String arg2) {
		Static160.aBoolean215 = arg1;
		Static469.aString68 = arg2;
		Static29.aString5 = arg0;
		if (!Static160.aBoolean215 && Static41.anInt1359 != 3 && (Static29.aString5.equals("") || Static469.aString68.equals(""))) {
			Static110.method2414(3);
			return;
		}
		Static5.aBoolean5 = false;
		if (Static41.anInt1359 != 1) {
			Static357.anInt6477 = 0;
			Static106.anInt2476 = -1;
		}
		Static110.method2414(-3);
		Static546.anInt9466 = 1;
		Static547.anInt9476 = 0;
		Static138.anInt9428 = 0;
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(Lclient!ds;IIIIB)V")
	public static void method3637(@OriginalArg(0) Class1_Sub9 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg0.anInt2359 == -1 && arg0.anIntArray188 == null) {
			return;
		}
		@Pc(21) int local21 = 0;
		@Pc(29) int local29 = arg0.anInt2351 * Static89.aClass1_Sub28_Sub1_1.anInt4913 >> 8;
		if (arg0.anInt2363 < arg2) {
			local21 = arg2 - arg0.anInt2363;
		} else if (arg0.anInt2348 > arg2) {
			local21 = arg0.anInt2348 - arg2;
		}
		if (arg3 > arg0.anInt2364) {
			local21 += arg3 - arg0.anInt2364;
		} else if (arg0.anInt2353 > arg3) {
			local21 += arg0.anInt2353 - arg3;
		}
		if (arg0.anInt2350 == 0 || local21 - 64 > arg0.anInt2350 || Static89.aClass1_Sub28_Sub1_1.anInt4913 == 0 || arg1 != arg0.anInt2352) {
			if (arg0.aClass1_Sub12_Sub1_2 != null) {
				Static445.aClass1_Sub12_Sub3_2.method6363(arg0.aClass1_Sub12_Sub1_2);
				arg0.aClass1_Sub12_Sub1_2 = null;
			}
			if (arg0.aClass1_Sub12_Sub1_1 != null) {
				Static445.aClass1_Sub12_Sub3_2.method6363(arg0.aClass1_Sub12_Sub1_1);
				arg0.aClass1_Sub12_Sub1_1 = null;
			}
			return;
		}
		local21 -= 64;
		if (local21 < 0) {
			local21 = 0;
		}
		@Pc(160) int local160 = local29 * (arg0.anInt2350 - local21) / arg0.anInt2350;
		if (arg0.aClass1_Sub12_Sub1_2 != null) {
			arg0.aClass1_Sub12_Sub1_2.method2352(local160);
		} else if (arg0.anInt2359 >= 0) {
			@Pc(175) Class77 local175 = Static551.method2366(Static51.aClass160_93, arg0.anInt2359, 0);
			if (local175 != null) {
				@Pc(182) Class1_Sub32_Sub1 local182 = local175.method2365().method5929(Static224.aClass42_1);
				@Pc(187) Class1_Sub12_Sub1 local187 = Static550.method2348(local182, local160);
				local187.method2351(-1);
				Static445.aClass1_Sub12_Sub3_2.method6369(local187);
				arg0.aClass1_Sub12_Sub1_2 = local187;
			}
		}
		if (arg0.aClass1_Sub12_Sub1_1 != null) {
			arg0.aClass1_Sub12_Sub1_1.method2352(local160);
			if (!arg0.aClass1_Sub12_Sub1_1.method7979()) {
				arg0.aClass1_Sub12_Sub1_1 = null;
			}
		} else if (arg0.anIntArray188 != null && (arg0.anInt2361 -= arg4) <= 0) {
			@Pc(240) int local240 = (int) ((double) arg0.anIntArray188.length * Math.random());
			@Pc(248) Class77 local248 = Static551.method2366(Static51.aClass160_93, arg0.anIntArray188[local240], 0);
			if (local248 != null) {
				@Pc(255) Class1_Sub32_Sub1 local255 = local248.method2365().method5929(Static224.aClass42_1);
				@Pc(260) Class1_Sub12_Sub1 local260 = Static550.method2348(local255, local160);
				local260.method2351(0);
				Static445.aClass1_Sub12_Sub3_2.method6369(local260);
				arg0.aClass1_Sub12_Sub1_1 = local260;
				arg0.anInt2361 = arg0.anInt2354 + (int) (Math.random() * (double) (arg0.anInt2355 - arg0.anInt2354));
				return;
			}
		}
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(ILjava/lang/String;B)V")
	public static void method3641(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		Static444.method6416(Static31.aClass186_8);
		Static192.aClass1_Sub13_Sub2_1.method3060(Static443.method6412(arg1) + 1);
		Static192.aClass1_Sub13_Sub2_1.method3061(arg1);
		Static192.aClass1_Sub13_Sub2_1.method3021(arg0);
	}
}
