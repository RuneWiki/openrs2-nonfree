import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static171 {

	@OriginalMember(owner = "client!uh", name = "m", descriptor = "Lclient!vb;")
	public static Class82 aClass82_68;

	@OriginalMember(owner = "client!uh", name = "q", descriptor = "Lclient!rh;")
	public static Class77 aClass77_13;

	@OriginalMember(owner = "client!uh", name = "j", descriptor = "[[B")
	public static byte[][] aByteArrayArray9 = new byte[1000][];

	@OriginalMember(owner = "client!uh", name = "p", descriptor = "Lclient!tg;")
	public static Class81 aClass81_1383 = Static120.method2057("RuneScape wird geladen )2 bitte warten)3)3)3");

	@OriginalMember(owner = "client!uh", name = "r", descriptor = "Z")
	public static boolean aBoolean164 = false;

	@OriginalMember(owner = "client!uh", name = "t", descriptor = "[I")
	public static int[] anIntArray418 = new int[100];

	@OriginalMember(owner = "client!uh", name = "v", descriptor = "Lclient!tg;")
	public static Class81 aClass81_1384 = Static120.method2057("Mem:");

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(I)V")
	public static void method3009() {
		@Pc(13) Object local13 = Static163.anObject4;
		synchronized (Static163.anObject4) {
			if (Static13.anInt268 != 0) {
				Static13.anInt268 = 1;
				try {
					Static163.anObject4.wait();
				} catch (@Pc(23) InterruptedException local23) {
				}
			}
		}
	}

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(B)V")
	public static void method3010() {
		for (@Pc(11) Class1_Sub6 local11 = (Class1_Sub6) Static2.aClass30_2.method1115(); local11 != null; local11 = (Class1_Sub6) Static2.aClass30_2.method1125()) {
			if (local11.aClass1_Sub2_Sub8_1 != null) {
				local11.method222();
			}
		}
	}

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(II)Lclient!ea;")
	public static Class1_Sub2_Sub5 method3011(@OriginalArg(0) int arg0) {
		@Pc(10) Class1_Sub2_Sub5 local10 = (Class1_Sub2_Sub5) Static52.aClass59_11.method1970((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static68.aClass82_28.method2942(arg0, 9);
		local10 = new Class1_Sub2_Sub5();
		local10.anInt1016 = arg0;
		if (local20 != null) {
			local10.method760(new Class1_Sub8(local20));
		}
		local10.method765();
		Static52.aClass59_11.method1973(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!uh", name = "b", descriptor = "(I)V")
	public static void method3012() {
		anIntArray418 = null;
		aClass82_68 = null;
		aClass77_13 = null;
		aClass81_1384 = null;
		aByteArrayArray9 = null;
		aClass81_1383 = null;
	}

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(Lclient!na;Lclient!na;B)V")
	public static void method3013(@OriginalArg(0) Class1_Sub2_Sub2_Sub2_Sub1 arg0, @OriginalArg(1) Class1_Sub2_Sub2_Sub2_Sub1 arg1) {
		if (Static45.aBoolean43) {
			Static16.method233(arg1, arg0);
			return;
		}
		if (Static112.anInt2525 == 0 || Static112.anInt2525 == 5) {
			arg0.method1948(Static41.aClass81_370, 382, 225, 16777215, -1);
			Static4.method2563(230, 233, 304, 34, 9179409);
			Static4.method2563(231, 234, 302, 32, 0);
			Static4.method2572(232, 235, Static44.anInt1088 * 3, 30, 9179409);
			Static4.method2572(Static44.anInt1088 * 3 + 232, 235, 300 - Static44.anInt1088 * 3, 30, 0);
			arg0.method1948(Static165.aClass81_1338, 382, 256, 16777215, -1);
		}
		@Pc(105) short local105;
		@Pc(113) int local113;
		if (Static112.anInt2525 == 20) {
			Static40.aClass1_Sub2_Sub2_Sub4_2.method2581(382 - Static40.aClass1_Sub2_Sub2_Sub4_2.anInt3358 / 2, 271 - Static40.aClass1_Sub2_Sub2_Sub4_2.anInt3361 / 2);
			local105 = 211;
			arg0.method1948(Static165.aClass81_1342, 382, 211, 16776960, 0);
			local113 = local105 + 15;
			arg0.method1948(Static165.aClass81_1337, 382, 226, 16776960, 0);
			@Pc(121) int local121 = local113 + 15;
			arg0.method1948(Static165.aClass81_1339, 382, 241, 16776960, 0);
			@Pc(129) int local129 = local121 + 15;
			@Pc(130) int local130 = local129 + 10;
			arg0.method1949(Static127.method2169(new Class81[] { Static57.aClass81_472, Static186.method1941(Static165.aClass81_1344) }), 272, 266, 16777215, 0);
			@Pc(150) int local150 = local130 + 15;
			arg0.method1949(Static127.method2169(new Class81[] { Static104.aClass81_803, Static165.aClass81_1340.method2817() }), 274, 281, 16777215, 0);
			@Pc(171) int local171 = local150 + 15;
		}
		if (Static112.anInt2525 == 10) {
			Static40.aClass1_Sub2_Sub2_Sub4_2.method2581(202, 171);
			if (Static2.anInt46 == 0) {
				local105 = 251;
				arg0.method1948(Static148.aClass81_1201, 382, 251, 16776960, 0);
				Static118.aClass1_Sub2_Sub2_Sub4_3.method2581(229, 271);
				local113 = local105 + 30;
				arg0.method1937(Static94.aClass81_729, 229, 271, 144, 40, 16777215, 0, 1, 1, 0);
				Static118.aClass1_Sub2_Sub2_Sub4_3.method2581(389, 271);
				arg0.method1937(Static111.aClass81_913, 389, 271, 144, 40, 16777215, 0, 1, 1, 0);
			} else if (Static2.anInt46 == 2) {
				local105 = 211;
				arg0.method1948(Static165.aClass81_1342, 382, 211, 16776960, 0);
				local113 = local105 + 15;
				arg0.method1948(Static165.aClass81_1337, 382, 226, 16776960, 0);
				local113 += 15;
				arg0.method1948(Static165.aClass81_1339, 382, 241, 16776960, 0);
				@Pc(296) boolean local296;
				if (Static150.anInt3390 == 0 && Static142.anInt3104 % 40 < 20 && Static110.aBoolean104) {
					local296 = true;
				} else {
					local296 = false;
				}
				local113 += 15;
				local113 += 10;
				arg0.method1949(Static127.method2169(new Class81[] { Static57.aClass81_472, Static186.method1941(Static165.aClass81_1344), local296 ? Static8.aClass81_86 : Static165.aClass81_1343 }), 272, 266, 16777215, 0);
				local113 += 15;
				if (Static150.anInt3390 == 1 && Static142.anInt3104 % 40 < 20 && Static110.aBoolean104) {
					local296 = true;
				} else {
					local296 = false;
				}
				arg0.method1949(Static127.method2169(new Class81[] { Static104.aClass81_803, Static165.aClass81_1340.method2817(), local296 ? Static8.aClass81_86 : Static165.aClass81_1343 }), 274, 281, 16777215, 0);
				Static118.aClass1_Sub2_Sub2_Sub4_3.method2581(229, 301);
				arg0.method1948(Static170.aClass81_1379, 302, 326, 16777215, 0);
				Static118.aClass1_Sub2_Sub2_Sub4_3.method2581(389, 301);
				local113 += 15;
				arg0.method1948(Static16.aClass81_139, 462, 326, 16777215, 0);
			} else if (Static2.anInt46 == 3) {
				arg0.method1948(Static92.aClass81_719, 382, 211, 16776960, 0);
				local105 = 236;
				arg0.method1948(Static31.aClass81_285, 382, 236, 16777215, 0);
				local113 = local105 + 15;
				arg0.method1948(Static110.aClass81_909, 382, 251, 16777215, 0);
				local113 += 15;
				arg0.method1948(Static48.aClass81_1304, 382, 266, 16777215, 0);
				local113 += 15;
				arg0.method1948(Static103.aClass81_793, 382, 281, 16777215, 0);
				Static118.aClass1_Sub2_Sub2_Sub4_3.method2581(309, 301);
				arg0.method1948(Static16.aClass81_139, 382, 326, 16777215, 0);
				local113 += 15;
			}
		}
		if (Static96.anInt2113 != 1) {
			if (Static160.anInt3650 > 0) {
				Static27.method612(Static160.anInt3650);
				Static160.anInt3650 = 0;
			}
			Static50.method892();
		}
		Static162.aClass1_Sub2_Sub2_Sub4Array10[Static62.aBoolean61 ? 1 : 0].method2581(725, 463);
		if (Static112.anInt2525 <= 5 || Static154.anInt3506 == 2 || Static125.anInt2756 != 0) {
			return;
		}
		if (Static125.aClass1_Sub2_Sub2_Sub4_4 == null) {
			Static125.aClass1_Sub2_Sub2_Sub4_4 = Static63.method1121(Static160.anInt3656, Static104.aClass82_Sub1_11);
		}
		if (Static125.aClass1_Sub2_Sub2_Sub4_4 == null) {
			return;
		}
		Static125.aClass1_Sub2_Sub2_Sub4_4.method2581(5, 463);
		arg0.method1948(Static127.method2169(new Class81[] { Static85.aClass81_151, Static115.aClass81_950, Static149.method2548(Static48.anInt3637) }), 55, 478, 16777215, 0);
		if (Static40.aClass37_1 != null) {
			arg1.method1948(Static86.aClass81_673, 55, 492, 16777215, 0);
			return;
		}
		arg1.method1948(Static144.aClass81_1130, 55, 492, 16777215, 0);
		return;
	}
}
