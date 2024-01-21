import java.awt.FontMetrics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static110 {

	@OriginalMember(owner = "client!me", name = "F", descriptor = "Ljava/awt/FontMetrics;")
	public static FontMetrics aFontMetrics1;

	@OriginalMember(owner = "client!me", name = "I", descriptor = "Lclient!ta;")
	public static Class2 aClass2_1;

	@OriginalMember(owner = "client!me", name = "J", descriptor = "Lclient!u;")
	public static Class76 aClass76_91;

	@OriginalMember(owner = "client!me", name = "T", descriptor = "I")
	public static int anInt3091;

	@OriginalMember(owner = "client!me", name = "v", descriptor = "Lclient!fc;")
	public static Class25 aClass25_17 = new Class25(30);

	@OriginalMember(owner = "client!me", name = "x", descriptor = "Lclient!rf;")
	private static Class70 aClass70_1006 = Static49.method1293("RuneScape is loading )2 please wait)3)3)3");

	@OriginalMember(owner = "client!me", name = "A", descriptor = "Lclient!rf;")
	public static Class70 aClass70_1007 = aClass70_1006;

	@OriginalMember(owner = "client!me", name = "B", descriptor = "Lclient!rf;")
	public static Class70 aClass70_1008 = Static49.method1293("lila:");

	@OriginalMember(owner = "client!me", name = "E", descriptor = "Lclient!ig;")
	public static Class39 aClass39_30 = null;

	@OriginalMember(owner = "client!me", name = "P", descriptor = "I")
	public static int anInt3088 = 0;

	@OriginalMember(owner = "client!me", name = "Q", descriptor = "I")
	public static int anInt3089 = 0;

	@OriginalMember(owner = "client!me", name = "R", descriptor = "I")
	public static int anInt3090 = 0;

	@OriginalMember(owner = "client!me", name = "U", descriptor = "I")
	public static int anInt3092 = -1;

	@OriginalMember(owner = "client!me", name = "V", descriptor = "I")
	public static int anInt3093 = 3;

	@OriginalMember(owner = "client!me", name = "d", descriptor = "(I)V")
	public static void method2282() {
		@Pc(10) int local10 = Static98.aClass1_Sub9_Sub1_2.method1288(8);
		@Pc(19) int local19;
		if (Static104.anInt2960 > local10) {
			for (local19 = local10; local19 < Static104.anInt2960; local19++) {
				Static151.anIntArray380[Static67.anInt2096++] = Static26.anIntArray46[local19];
			}
		}
		if (local10 > Static104.anInt2960) {
			throw new RuntimeException("gppov1");
		}
		Static104.anInt2960 = 0;
		for (local19 = 0; local19 < local10; local19++) {
			@Pc(53) int local53 = Static26.anIntArray46[local19];
			@Pc(57) Class1_Sub1_Sub4_Sub2_Sub1 local57 = Static113.aClass1_Sub1_Sub4_Sub2_Sub1Array1[local53];
			@Pc(62) int local62 = Static98.aClass1_Sub9_Sub1_2.method1288(1);
			if (local62 == 0) {
				Static26.anIntArray46[Static104.anInt2960++] = local53;
				local57.anInt2026 = Static47.anInt1654;
			} else {
				@Pc(85) int local85 = Static98.aClass1_Sub9_Sub1_2.method1288(2);
				if (local85 == 0) {
					Static26.anIntArray46[Static104.anInt2960++] = local53;
					local57.anInt2026 = Static47.anInt1654;
					Static48.anIntArray167[Static161.anInt4212++] = local53;
				} else {
					@Pc(132) int local132;
					@Pc(142) int local142;
					if (local85 == 1) {
						Static26.anIntArray46[Static104.anInt2960++] = local53;
						local57.anInt2026 = Static47.anInt1654;
						local132 = Static98.aClass1_Sub9_Sub1_2.method1288(3);
						local57.method1512(local132, false);
						local142 = Static98.aClass1_Sub9_Sub1_2.method1288(1);
						if (local142 == 1) {
							Static48.anIntArray167[Static161.anInt4212++] = local53;
						}
					} else if (local85 == 2) {
						Static26.anIntArray46[Static104.anInt2960++] = local53;
						local57.anInt2026 = Static47.anInt1654;
						local132 = Static98.aClass1_Sub9_Sub1_2.method1288(3);
						local57.method1512(local132, true);
						local142 = Static98.aClass1_Sub9_Sub1_2.method1288(3);
						local57.method1512(local142, true);
						@Pc(196) int local196 = Static98.aClass1_Sub9_Sub1_2.method1288(1);
						if (local196 == 1) {
							Static48.anIntArray167[Static161.anInt4212++] = local53;
						}
					} else if (local85 == 3) {
						Static151.anIntArray380[Static67.anInt2096++] = local53;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(Z)V")
	public static void method2283() {
		aClass76_91 = null;
		aClass2_1 = null;
		aClass70_1008 = null;
		aClass39_30 = null;
		aFontMetrics1 = null;
		aClass70_1006 = null;
		aClass70_1007 = null;
		aClass25_17 = null;
	}

	@OriginalMember(owner = "client!me", name = "b", descriptor = "(II)V")
	public static void method2284(@OriginalArg(0) int arg0) {
		for (@Pc(10) Class1_Sub4 local10 = (Class1_Sub4) Static6.aClass30_1.method1470(); local10 != null; local10 = (Class1_Sub4) Static6.aClass30_1.method1473()) {
			if ((local10.aLong147 >> 48 & 0xFFFFL) == (long) arg0) {
				local10.method3499();
			}
		}
	}

	@OriginalMember(owner = "client!me", name = "c", descriptor = "(B)V")
	public static void method2285() {
		Static171.method3407(aClass39_30);
		Static184.anInt4566++;
		if (Static80.aBoolean93 && Static48.aBoolean61) {
			@Pc(24) int local24 = Static21.anInt591;
			@Pc(26) int local26 = Static70.anInt2156;
			local24 -= Static147.anInt3873;
			if (local24 < Static132.anInt3450) {
				local24 = Static132.anInt3450;
			}
			if (local24 + aClass39_30.anInt2340 > Static132.anInt3450 + Static119.aClass39_35.anInt2340) {
				local24 = Static119.aClass39_35.anInt2340 + Static132.anInt3450 - aClass39_30.anInt2340;
			}
			@Pc(64) int local64 = aClass39_30.anInt2320;
			local26 -= Static123.anInt3348;
			@Pc(81) int local81 = local24 + Static119.aClass39_35.anInt2354 - Static132.anInt3450;
			if (Static81.anInt2479 > local26) {
				local26 = Static81.anInt2479;
			}
			@Pc(95) int local95 = local24 - Static13.anInt428;
			if (local26 + aClass39_30.anInt2369 > Static119.aClass39_35.anInt2369 + Static81.anInt2479) {
				local26 = Static81.anInt2479 + Static119.aClass39_35.anInt2369 - aClass39_30.anInt2369;
			}
			@Pc(120) int local120 = local26 - Static96.anInt2798;
			@Pc(128) int local128 = local26 + Static119.aClass39_35.anInt2341 - Static81.anInt2479;
			if (Static184.anInt4566 > aClass39_30.anInt2392 && (local64 < local95 || -local64 > local95 || local120 > local64 || -local64 > local120)) {
				Static26.aBoolean29 = true;
			}
			@Pc(169) Class1_Sub19 local169;
			if (aClass39_30.anObjectArray18 != null && Static26.aBoolean29) {
				local169 = new Class1_Sub19();
				local169.aClass39_31 = aClass39_30;
				local169.anInt3084 = local81;
				local169.anInt3080 = local128;
				local169.anObjectArray27 = aClass39_30.anObjectArray18;
				Static60.method1460(local169);
			}
			if (Static109.anInt3064 == 0) {
				if (Static26.aBoolean29) {
					if (aClass39_30.anObjectArray14 != null) {
						local169 = new Class1_Sub19();
						local169.anObjectArray27 = aClass39_30.anObjectArray14;
						local169.anInt3084 = local81;
						local169.aClass39_29 = Static121.aClass39_36;
						local169.aClass39_31 = aClass39_30;
						local169.anInt3080 = local128;
						Static60.method1460(local169);
					}
					if (Static121.aClass39_36 != null && Static131.method2564(aClass39_30) != null) {
						Static131.aClass1_Sub9_Sub1_3.method1283(209);
						Static131.aClass1_Sub9_Sub1_3.method1245(aClass39_30.anInt2344);
						Static131.aClass1_Sub9_Sub1_3.method1276(Static121.aClass39_36.anInt2355);
						Static131.aClass1_Sub9_Sub1_3.method1231(aClass39_30.anInt2355);
						Static131.aClass1_Sub9_Sub1_3.method1245(Static121.aClass39_36.anInt2344);
					}
				} else if ((Static154.anInt4063 == 1 || Static108.method2265(Static162.anInt4331 - 1)) && Static162.anInt4331 > 2) {
					Static26.method551();
				} else if (Static162.anInt4331 > 0) {
					Static71.method1642(Static162.anInt4331 - 1);
				}
				aClass39_30 = null;
			}
		} else if (Static184.anInt4566 > 1) {
			aClass39_30 = null;
		}
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(Lclient!u;ILclient!u;)V")
	public static void method2286(@OriginalArg(0) Class76 arg0, @OriginalArg(2) Class76 arg1) {
		Static163.aClass76_126 = arg1;
		Static63.aClass76_55 = arg0;
	}
}
