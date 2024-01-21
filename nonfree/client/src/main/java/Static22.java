import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static22 {

	@OriginalMember(owner = "client!db", name = "ob", descriptor = "I")
	public static int anInt683;

	@OriginalMember(owner = "client!db", name = "Nb", descriptor = "Lclient!n;")
	public static Class5_Sub2_Sub1_Sub3 aClass5_Sub2_Sub1_Sub3_2;

	@OriginalMember(owner = "client!db", name = "hb", descriptor = "Lclient!r;")
	public static Class61 aClass61_202 = Static129.method2060("Ihr Spielkonto wird bereits benutzt)3");

	@OriginalMember(owner = "client!db", name = "jb", descriptor = "Z")
	public static boolean aBoolean22 = false;

	@OriginalMember(owner = "client!db", name = "rb", descriptor = "Lclient!r;")
	private static Class61 aClass61_204 = Static129.method2060("To play on this world move to a free area first)3");

	@OriginalMember(owner = "client!db", name = "qb", descriptor = "Lclient!r;")
	public static Class61 aClass61_203 = aClass61_204;

	@OriginalMember(owner = "client!db", name = "Gb", descriptor = "Lclient!r;")
	public static Class61 aClass61_205 = Static129.method2060("-5berpr-Ufen Sie Ihr Mitteilungsfach)3");

	@OriginalMember(owner = "client!db", name = "Hb", descriptor = "Lclient!r;")
	public static Class61 aClass61_206 = Static129.method2060("null");

	@OriginalMember(owner = "client!db", name = "Lb", descriptor = "Lclient!ge;")
	public static Class29 aClass29_7 = new Class29(30);

	@OriginalMember(owner = "client!db", name = "Mb", descriptor = "Lclient!r;")
	public static Class61 aClass61_207 = Static129.method2060("Ausw-=hlen");

	@OriginalMember(owner = "client!db", name = "Ob", descriptor = "I")
	public static int anInt697 = 0;

	@OriginalMember(owner = "client!db", name = "g", descriptor = "(I)V")
	public static void method482() {
		while (true) {
			if (Static47.aClass5_Sub14_Sub1_2.method1495(Static80.anInt2057) >= 27) {
				@Pc(18) int local18 = Static47.aClass5_Sub14_Sub1_2.method1492(15);
				if (local18 != 32767) {
					@Pc(23) boolean local23 = false;
					if (Static67.aClass5_Sub2_Sub2_Sub3_Sub1Array1[local18] == null) {
						local23 = true;
						Static67.aClass5_Sub2_Sub2_Sub3_Sub1Array1[local18] = new Class5_Sub2_Sub2_Sub3_Sub1();
					}
					@Pc(39) Class5_Sub2_Sub2_Sub3_Sub1 local39 = Static67.aClass5_Sub2_Sub2_Sub3_Sub1Array1[local18];
					Static61.anIntArray225[Static100.anInt2607++] = local18;
					local39.anInt2900 = Static58.anInt1422;
					@Pc(55) int local55 = Static47.aClass5_Sub14_Sub1_2.method1492(1);
					@Pc(60) int local60 = Static47.aClass5_Sub14_Sub1_2.method1492(5);
					if (local60 > 15) {
						local60 -= 32;
					}
					@Pc(73) int local73 = Static115.anIntArray353[Static47.aClass5_Sub14_Sub1_2.method1492(3)];
					if (local23) {
						local39.anInt2909 = local39.anInt2919 = local73;
					}
					@Pc(86) int local86 = Static47.aClass5_Sub14_Sub1_2.method1492(1);
					if (local86 == 1) {
						Static132.anIntArray445[Static83.anInt2281++] = local18;
					}
					local39.aClass5_Sub2_Sub12_1 = Static29.method626(Static47.aClass5_Sub14_Sub1_2.method1492(14));
					@Pc(110) int local110 = Static47.aClass5_Sub14_Sub1_2.method1492(5);
					if (local110 > 15) {
						local110 -= 32;
					}
					local39.anInt2914 = local39.aClass5_Sub2_Sub12_1.anInt2493;
					local39.anInt2913 = local39.aClass5_Sub2_Sub12_1.anInt2504;
					local39.anInt2878 = local39.aClass5_Sub2_Sub12_1.anInt2506;
					local39.anInt2918 = local39.aClass5_Sub2_Sub12_1.anInt2498;
					local39.anInt2877 = local39.aClass5_Sub2_Sub12_1.anInt2508;
					local39.anInt2888 = local39.aClass5_Sub2_Sub12_1.anInt2510;
					if (local39.anInt2888 == 0) {
						local39.anInt2919 = 0;
					}
					local39.anInt2892 = local39.aClass5_Sub2_Sub12_1.anInt2511;
					local39.anInt2915 = local39.aClass5_Sub2_Sub12_1.anInt2494;
					local39.anInt2917 = local39.aClass5_Sub2_Sub12_1.anInt2492;
					local39.method1857(local110 + Static81.aClass5_Sub2_Sub2_Sub3_Sub2_10.anIntArray346[0], Static81.aClass5_Sub2_Sub2_Sub3_Sub2_10.anIntArray350[0] + local60, local55 == 1);
					continue;
				}
			}
			Static47.aClass5_Sub14_Sub1_2.method1499();
			return;
		}
	}

	@OriginalMember(owner = "client!db", name = "h", descriptor = "(I)V")
	public static void method483() {
		aClass61_203 = null;
		aClass29_7 = null;
		aClass61_207 = null;
		aClass5_Sub2_Sub1_Sub3_2 = null;
		aClass61_206 = null;
		aClass61_202 = null;
		aClass61_205 = null;
		aClass61_204 = null;
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(IBIIIII)I")
	public static int method485(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if ((arg1 & 0x1) == 1) {
			@Pc(17) int local17 = arg2;
			arg2 = arg0;
			arg0 = local17;
		}
		@Pc(25) int local25 = arg4 & 0x3;
		if (local25 == 0) {
			return arg5;
		} else if (local25 == 1) {
			return arg3;
		} else if (local25 == 2) {
			return 7 + 1 - arg5 - arg2;
		} else {
			return 7 + 1 - arg3 - arg0;
		}
	}
}
