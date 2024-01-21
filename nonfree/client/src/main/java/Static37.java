import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static37 {

	@OriginalMember(owner = "client!fe", name = "gb", descriptor = "[Lclient!pb;")
	public static Class1_Sub1_Sub4_Sub4[] aClass1_Sub1_Sub4_Sub4Array6;

	@OriginalMember(owner = "client!fe", name = "ib", descriptor = "Lclient!kc;")
	public static Class38 aClass38_1;

	@OriginalMember(owner = "client!fe", name = "hb", descriptor = "Lclient!kd;")
	private static Class39 aClass39_522 = Static108.method1915("Loaded gamescreen");

	@OriginalMember(owner = "client!fe", name = "S", descriptor = "Lclient!kd;")
	public static Class39 aClass39_517 = aClass39_522;

	@OriginalMember(owner = "client!fe", name = "U", descriptor = "Lclient!kd;")
	private static Class39 aClass39_518 = Static108.method1915("Welcome to RuneScape");

	@OriginalMember(owner = "client!fe", name = "V", descriptor = "I")
	public static int anInt1116 = 0;

	@OriginalMember(owner = "client!fe", name = "bb", descriptor = "Lclient!kd;")
	public static Class39 aClass39_519 = Static108.method1915("Begeben Sie sich in ein freies Gebiet)1 um");

	@OriginalMember(owner = "client!fe", name = "eb", descriptor = "Lclient!kd;")
	public static Class39 aClass39_520 = Static108.method1915("Die Adresse dieses Computers wurde gesperrt)1");

	@OriginalMember(owner = "client!fe", name = "fb", descriptor = "Lclient!kd;")
	public static Class39 aClass39_521 = Static108.method1915(")4slr)3ws?order=LPWM");

	@OriginalMember(owner = "client!fe", name = "jb", descriptor = "Lclient!kd;")
	public static Class39 aClass39_523 = aClass39_518;

	@OriginalMember(owner = "client!fe", name = "kb", descriptor = "I")
	public static int anInt1124 = 0;

	@OriginalMember(owner = "client!fe", name = "d", descriptor = "(B)V")
	public static void method665() {
		aClass39_523 = null;
		aClass38_1 = null;
		aClass39_519 = null;
		aClass39_521 = null;
		aClass39_520 = null;
		aClass39_518 = null;
		aClass39_522 = null;
		aClass39_517 = null;
		aClass1_Sub1_Sub4_Sub4Array6 = null;
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(IBLclient!kd;)V")
	public static void method666(@OriginalArg(0) int arg0, @OriginalArg(2) Class39 arg1) {
		Static103.aClass1_Sub18_Sub1_5.method2203(234);
		Static103.aClass1_Sub18_Sub1_5.method2189(arg0);
		Static103.aClass1_Sub18_Sub1_5.method2160(arg1.method1186());
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(ZZIIZ)Lclient!ua;")
	public static Class62_Sub1 method668(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3) {
		@Pc(1) Class61 local1 = null;
		if (Static101.aClass56_3 != null) {
			local1 = new Class61(arg2, Static101.aClass56_3, Static120.aClass56Array58[arg2], 1000000);
		}
		return new Class62_Sub1(local1, Static46.aClass61_4, arg2, arg3, arg0, arg1);
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(IZIIILclient!q;)V")
	public static void method669(@OriginalArg(0) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) Class62 arg3) {
		Static35.anInt1070 = arg0;
		Static121.anInt2969 = arg2;
		Static13.aBoolean48 = false;
		Static29.anInt972 = arg1;
		Static90.aClass62_26 = arg3;
		Static49.anInt1364 = 10000;
		Static25.anInt837 = 1;
	}

	@OriginalMember(owner = "client!fe", name = "c", descriptor = "(I)V")
	public static void method671() {
		@Pc(10) int local10 = Static79.aClass1_Sub18_Sub1_3.method2199(8);
		@Pc(19) int local19;
		if (Static57.anInt1547 > local10) {
			for (local19 = local10; local19 < Static57.anInt1547; local19++) {
				Static79.anIntArray384[Static53.anInt1465++] = Static12.anIntArray91[local19];
			}
		}
		if (local10 > Static57.anInt1547) {
			throw new RuntimeException("gppov1");
		}
		Static57.anInt1547 = 0;
		for (local19 = 0; local19 < local10; local19++) {
			@Pc(69) int local69 = Static12.anIntArray91[local19];
			@Pc(73) Class1_Sub1_Sub2_Sub1_Sub2 local73 = Static38.aClass1_Sub1_Sub2_Sub1_Sub2Array1[local69];
			@Pc(78) int local78 = Static79.aClass1_Sub18_Sub1_3.method2199(1);
			if (local78 == 0) {
				Static12.anIntArray91[Static57.anInt1547++] = local69;
				local73.anInt2514 = Static45.anInt1256;
			} else {
				@Pc(101) int local101 = Static79.aClass1_Sub18_Sub1_3.method2199(2);
				if (local101 == 0) {
					Static12.anIntArray91[Static57.anInt1547++] = local69;
					local73.anInt2514 = Static45.anInt1256;
					Static117.anIntArray460[Static94.anInt2224++] = local69;
				} else {
					@Pc(148) int local148;
					@Pc(158) int local158;
					if (local101 == 1) {
						Static12.anIntArray91[Static57.anInt1547++] = local69;
						local73.anInt2514 = Static45.anInt1256;
						local148 = Static79.aClass1_Sub18_Sub1_3.method2199(3);
						local73.method1799(local148, false);
						local158 = Static79.aClass1_Sub18_Sub1_3.method2199(1);
						if (local158 == 1) {
							Static117.anIntArray460[Static94.anInt2224++] = local69;
						}
					} else if (local101 == 2) {
						Static12.anIntArray91[Static57.anInt1547++] = local69;
						local73.anInt2514 = Static45.anInt1256;
						local148 = Static79.aClass1_Sub18_Sub1_3.method2199(3);
						local73.method1799(local148, true);
						local158 = Static79.aClass1_Sub18_Sub1_3.method2199(3);
						local73.method1799(local158, true);
						@Pc(212) int local212 = Static79.aClass1_Sub18_Sub1_3.method2199(1);
						if (local212 == 1) {
							Static117.anIntArray460[Static94.anInt2224++] = local69;
						}
					} else if (local101 == 3) {
						Static79.anIntArray384[Static53.anInt1465++] = local69;
					}
				}
			}
		}
	}
}
