import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static116 {

	@OriginalMember(owner = "client!ua", name = "f", descriptor = "[Z")
	public static boolean[] aBooleanArray27;

	@OriginalMember(owner = "client!ua", name = "i", descriptor = "Lclient!he;")
	private static Class26 aClass26_1632 = Static6.method100("Press (Wrecover a locked account(W on front page)3");

	@OriginalMember(owner = "client!ua", name = "d", descriptor = "Lclient!he;")
	public static Class26 aClass26_1630 = aClass26_1632;

	@OriginalMember(owner = "client!ua", name = "l", descriptor = "Lclient!he;")
	private static Class26 aClass26_1634 = Static6.method100("Your account has been disabled)3");

	@OriginalMember(owner = "client!ua", name = "h", descriptor = "Lclient!he;")
	public static Class26 aClass26_1631 = aClass26_1634;

	@OriginalMember(owner = "client!ua", name = "j", descriptor = "Lclient!he;")
	public static Class26 aClass26_1633 = Static6.method100("Unerwartete Antwort vom Anmelde)2Server");

	@OriginalMember(owner = "client!ua", name = "m", descriptor = "I")
	public static int anInt3059 = 0;

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(I)V")
	public static void method2087() {
		if (Static86.aClass19_1 != null) {
			@Pc(11) Class19 local11 = Static86.aClass19_1;
			synchronized (Static86.aClass19_1) {
				Static86.aClass19_1 = null;
			}
		}
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(II)[B")
	public static synchronized byte[] method2088(@OriginalArg(1) int arg0) {
		@Pc(18) byte[] local18;
		if (arg0 == 100 && Static105.anInt2860 > 0) {
			local18 = Static124.aByteArrayArray20[--Static105.anInt2860];
			Static124.aByteArrayArray20[Static105.anInt2860] = null;
			return local18;
		} else if (arg0 == 5000 && Static74.anInt2081 > 0) {
			local18 = Static12.aByteArrayArray1[--Static74.anInt2081];
			Static12.aByteArrayArray1[Static74.anInt2081] = null;
			return local18;
		} else if (arg0 == 30000 && Static10.anInt279 > 0) {
			local18 = Static43.aByteArrayArray18[--Static10.anInt279];
			Static43.aByteArrayArray18[Static10.anInt279] = null;
			return local18;
		} else {
			return new byte[arg0];
		}
	}

	@OriginalMember(owner = "client!ua", name = "b", descriptor = "(II)Z")
	public static boolean method2089(@OriginalArg(1) int arg0) {
		return (arg0 >> 29 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(Z)V")
	public static void method2090() {
		aClass26_1630 = null;
		aClass26_1632 = null;
		aClass26_1634 = null;
		aClass26_1633 = null;
		aBooleanArray27 = null;
		aClass26_1631 = null;
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(Lclient!od;ILclient!od;)V")
	public static void method2091(@OriginalArg(0) Class3_Sub1_Sub4_Sub2_Sub1 arg0, @OriginalArg(2) Class3_Sub1_Sub4_Sub2_Sub1 arg1) {
		if (Static78.aBoolean105) {
			Static13.method213(arg1, arg0);
			return;
		}
		if (Static89.anInt2466 == 0 || Static89.anInt2466 == 5) {
			arg0.method1611(Static5.aClass26_1755, 382, 225, 16777215, -1);
			Static77.method2228(230, 233, 304, 34, 9179409);
			Static77.method2228(231, 234, 302, 32, 0);
			Static77.method2214(232, 235, Static4.anInt137 * 3, 30, 9179409);
			Static77.method2214(Static4.anInt137 * 3 + 232, 235, 300 - Static4.anInt137 * 3, 30, 0);
			arg0.method1611(Static55.aClass26_828, 382, 256, 16777215, -1);
		}
		@Pc(96) short local96;
		@Pc(120) int local120;
		if (Static89.anInt2466 == 20) {
			local96 = 211;
			Static39.aClass3_Sub1_Sub4_Sub1_6.method345(382 - Static39.aClass3_Sub1_Sub4_Sub1_6.anInt509 / 2, -(Static39.aClass3_Sub1_Sub4_Sub1_6.anInt511 / 2) + 271);
			arg0.method1611(Static55.aClass26_834, 382, 211, 16776960, 0);
			local120 = local96 + 15;
			arg0.method1611(Static55.aClass26_830, 382, 226, 16776960, 0);
			@Pc(128) int local128 = local120 + 15;
			arg0.method1611(Static55.aClass26_833, 382, 241, 16776960, 0);
			@Pc(136) int local136 = local128 + 15;
			@Pc(137) int local137 = local136 + 10;
			arg0.method1617(Static119.method2136(new Class26[] { Static41.aClass26_675, Static129.method1614(Static55.aClass26_832) }), 272, 266, 16777215, 0);
			@Pc(157) int local157 = local137 + 15;
			arg0.method1617(Static119.method2136(new Class26[] { Static63.aClass26_954, Static55.aClass26_829.method823() }), 274, 281, 16777215, 0);
			@Pc(178) int local178 = local157 + 15;
		}
		if (Static89.anInt2466 == 10) {
			Static39.aClass3_Sub1_Sub4_Sub1_6.method345(202, 171);
			if (Static90.anInt2491 == 0) {
				local96 = 251;
				arg0.method1611(Static71.aClass26_1008, 382, 251, 16776960, 0);
				local120 = local96 + 30;
				Static31.aClass3_Sub1_Sub4_Sub1_8.method345(229, 271);
				arg0.method1606(Static103.aClass26_1506, 229, 271, 144, 40, 16777215, 0, 1, 1, 0);
				Static31.aClass3_Sub1_Sub4_Sub1_8.method345(389, 271);
				arg0.method1606(Static113.aClass26_1608, 389, 271, 144, 40, 16777215, 0, 1, 1, 0);
			} else if (Static90.anInt2491 == 2) {
				local96 = 211;
				arg0.method1611(Static55.aClass26_834, 382, 211, 16776960, 0);
				local120 = local96 + 15;
				arg0.method1611(Static55.aClass26_830, 382, 226, 16776960, 0);
				local120 += 15;
				arg0.method1611(Static55.aClass26_833, 382, 241, 16776960, 0);
				local120 += 15;
				local120 += 10;
				arg0.method1617(Static119.method2136(new Class26[] { Static41.aClass26_675, Static129.method1614(Static55.aClass26_832), Static4.anInt136 % 40 < 20 & Static21.anInt820 == 0 ? Static98.aClass26_1441 : Static55.aClass26_831 }), 272, 266, 16777215, 0);
				local120 += 15;
				arg0.method1617(Static119.method2136(new Class26[] { Static63.aClass26_954, Static55.aClass26_829.method823(), Static4.anInt136 % 40 < 20 & Static21.anInt820 == 1 ? Static98.aClass26_1441 : Static55.aClass26_831 }), 274, 281, 16777215, 0);
				Static31.aClass3_Sub1_Sub4_Sub1_8.method345(229, 301);
				arg0.method1611(Static111.aClass26_1601, 302, 326, 16777215, 0);
				Static31.aClass3_Sub1_Sub4_Sub1_8.method345(389, 301);
				local120 += 15;
				arg0.method1611(Static132.aClass26_1814, 462, 326, 16777215, 0);
			} else if (Static90.anInt2491 == 3) {
				arg0.method1611(Static52.aClass26_813, 382, 211, 16776960, 0);
				local96 = 236;
				arg0.method1611(Static38.aClass26_633, 382, 236, 16777215, 0);
				local120 = local96 + 15;
				arg0.method1611(Static7.aClass26_110, 382, 251, 16777215, 0);
				local120 += 15;
				arg0.method1611(Static87.aClass26_1261, 382, 266, 16777215, 0);
				local120 += 15;
				arg0.method1611(Static95.aClass26_1398, 382, 281, 16777215, 0);
				Static31.aClass3_Sub1_Sub4_Sub1_8.method345(309, 301);
				arg0.method1611(Static132.aClass26_1814, 382, 326, 16777215, 0);
				local120 += 15;
			}
		}
		if (Static35.anInt1134 != 1) {
			if (Static20.anInt587 > 0) {
				Static79.method1378(Static20.anInt587);
				Static20.anInt587 = 0;
			}
			Static11.method173();
		}
		Static133.aClass3_Sub1_Sub4_Sub1Array5[Static55.aBoolean87 ? 1 : 0].method345(725, 463);
		if (Static89.anInt2466 > 5 && Static40.anInt1264 != 2 && Static27.anInt978 == 0) {
			if (Static31.aClass3_Sub1_Sub4_Sub1_9 == null) {
				Static31.aClass3_Sub1_Sub4_Sub1_9 = Static2.method9(Static55.aClass26_831, Static103.aClass26_1508, Static20.aClass16_Sub1_3);
			} else {
				Static31.aClass3_Sub1_Sub4_Sub1_9.method345(5, 463);
				arg0.method1611(Static119.method2136(new Class26[] { Static38.aClass26_637, Static114.aClass26_1626, Static122.method2170(Static101.anInt2759) }), 55, 478, 16777215, 0);
				if (Static70.aClass64_2 == null) {
					arg1.method1611(Static42.aClass26_695, 55, 492, 16777215, 0);
				} else {
					arg1.method1611(Static72.aClass26_1028, 55, 492, 16777215, 0);
				}
			}
		}
		try {
			@Pc(625) Graphics local625 = Static58.aCanvas1.getGraphics();
			Static102.aClass6_1.method881(local625);
		} catch (@Pc(633) Exception local633) {
			Static58.aCanvas1.repaint();
		}
	}
}
