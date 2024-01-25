import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static344 {

	@OriginalMember(owner = "client!vl", name = "M", descriptor = "[I")
	public static int[] anIntArray383;

	@OriginalMember(owner = "client!vl", name = "O", descriptor = "[[I")
	public static int[][] anIntArrayArray50;

	@OriginalMember(owner = "client!vl", name = "I", descriptor = "Lclient!jn;")
	public static final Class106 aClass106_166 = new Class106("Loaded fonts", "Schriftsätze geladen.", "Polices chargées", "Fontes carregadas");

	@OriginalMember(owner = "client!vl", name = "L", descriptor = "Lclient!vq;")
	public static final Class217 aClass217_161 = new Class217(37, 6);

	@OriginalMember(owner = "client!vl", name = "N", descriptor = "Lclient!jn;")
	public static final Class106 aClass106_167 = new Class106("Prepared sound engine", "Musik-Engine vorbereitet.", "Moteur son préparé", "Mecanismo de som preparado");

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(IZ)V")
	public static void method4469(@OriginalArg(1) boolean arg0) {
		for (@Pc(14) Class1_Sub40 local14 = (Class1_Sub40) Static99.aClass42_13.method1543(); local14 != null; local14 = (Class1_Sub40) Static99.aClass42_13.method1551()) {
			if (local14.aClass1_Sub6_Sub2_2 != null) {
				Static324.aClass1_Sub6_Sub3_2.method3786(local14.aClass1_Sub6_Sub2_2);
				local14.aClass1_Sub6_Sub2_2 = null;
			}
			if (local14.aClass1_Sub6_Sub2_1 != null) {
				Static324.aClass1_Sub6_Sub3_2.method3786(local14.aClass1_Sub6_Sub2_1);
				local14.aClass1_Sub6_Sub2_1 = null;
			}
			local14.method6045();
		}
		if (!arg0) {
			return;
		}
		for (@Pc(53) Class1_Sub40 local53 = (Class1_Sub40) Static136.aClass42_40.method1543(); local53 != null; local53 = (Class1_Sub40) Static136.aClass42_40.method1551()) {
			if (local53.aClass1_Sub6_Sub2_2 != null) {
				Static324.aClass1_Sub6_Sub3_2.method3786(local53.aClass1_Sub6_Sub2_2);
				local53.aClass1_Sub6_Sub2_2 = null;
			}
			local53.method6045();
		}
		for (@Pc(80) Class1_Sub40 local80 = (Class1_Sub40) Static367.aClass38_33.method1474(); local80 != null; local80 = (Class1_Sub40) Static367.aClass38_33.method1470()) {
			if (local80.aClass1_Sub6_Sub2_2 != null) {
				Static324.aClass1_Sub6_Sub3_2.method3786(local80.aClass1_Sub6_Sub2_2);
				local80.aClass1_Sub6_Sub2_2 = null;
			}
			local80.method6045();
		}
	}

	@OriginalMember(owner = "client!vl", name = "b", descriptor = "(II)V")
	public static void method4470(@OriginalArg(0) int arg0) {
		Static212.anInt4255 = arg0;
		@Pc(12) Class21 local12 = Static288.aClass21_148;
		synchronized (Static288.aClass21_148) {
			Static288.aClass21_148.method857();
		}
	}

	@OriginalMember(owner = "client!vl", name = "g", descriptor = "(I)V")
	public static void method4471() {
		@Pc(12) Class183 local12 = null;
		try {
			@Pc(16) Class121 local16 = Static227.aClass75_5.method2353();
			while (local16.anInt3693 == 0) {
				Static135.method2737(1L);
			}
			if (local16.anInt3693 == 1) {
				local12 = (Class183) local16.anObject2;
				@Pc(42) Class1_Sub7 local42 = new Class1_Sub7(Static338.anInt6427 * 6 + 3);
				local42.method2121(1);
				local42.method2144(Static338.anInt6427);
				for (@Pc(52) int local52 = 0; local52 < Static7.anIntArray24.length; local52++) {
					if (Static237.aBooleanArray11[local52]) {
						local42.method2144(local52);
						local42.method2115(Static7.anIntArray24[local52]);
					}
				}
				local12.method4937(0, local42.anInt2219, local42.aByteArray41);
			}
		} catch (@Pc(83) Exception local83) {
		}
		try {
			if (local12 != null) {
				local12.method4934();
			}
		} catch (@Pc(90) Exception local90) {
		}
		Static123.aLong98 = Static183.method3462();
		Static174.aBoolean271 = false;
	}

	@OriginalMember(owner = "client!vl", name = "c", descriptor = "(II)V")
	public static void method4473(@OriginalArg(1) int arg0) {
		Static28.anInt669 = arg0;
		Static226.aClass21_123.method857();
	}

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(BIII)V")
	public static void method4474(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(35) String local35 = "tele " + arg1 + "," + (arg0 >> 6) + "," + (arg2 >> 6) + "," + (arg0 & 0x3F) + "," + (arg2 & 0x3F);
		System.out.println(local35);
		Static268.method4842(true, local35);
	}
}
