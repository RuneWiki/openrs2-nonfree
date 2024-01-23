import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static3 {

	@OriginalMember(owner = "client!ac", name = "c", descriptor = "I")
	public static int anInt70 = 0;

	@OriginalMember(owner = "client!ac", name = "i", descriptor = "Lclient!kh;")
	private static Class60 aClass60_33 = Static200.method3116("Attack");

	@OriginalMember(owner = "client!ac", name = "e", descriptor = "Lclient!kh;")
	public static Class60 aClass60_31 = aClass60_33;

	@OriginalMember(owner = "client!ac", name = "g", descriptor = "Lclient!kh;")
	public static Class60 aClass60_32 = Static200.method3116("da dieser Computer gegen unsere ");

	@OriginalMember(owner = "client!ac", name = "j", descriptor = "Lclient!kh;")
	public static Class60 aClass60_34 = Static200.method3116(": ");

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(Lclient!mg;ILclient!mg;)V")
	public static void method55(@OriginalArg(0) Class1_Sub1_Sub14 arg0, @OriginalArg(2) Class1_Sub1_Sub14 arg1) {
		if (Static43.aBoolean59) {
			Static124.method2106(arg0, arg1);
			return;
		}
		if (Static134.anInt2902 == 0 || Static134.anInt2902 == 5) {
			arg0.method3314(Static5.aClass60_43, 382, 225, 16777215, -1);
			Static76.method1374(230, 233, 304, 34, 9179409);
			Static76.method1374(231, 234, 302, 32, 0);
			Static76.method1367(232, 235, Static105.anInt2388 * 3, 30, 9179409);
			Static76.method1367(Static105.anInt2388 * 3 + 232, 235, 300 - Static105.anInt2388 * 3, 30, 0);
			arg0.method3314(Static12.aClass60_97, 382, 256, 16777215, -1);
		}
		@Pc(108) short local108;
		@Pc(116) int local116;
		if (Static134.anInt2902 == 20) {
			Static55.aClass73_2.method2270(382 - Static55.aClass73_2.anInt2959 / 2, 271 - Static55.aClass73_2.anInt2956 / 2);
			local108 = 211;
			arg0.method3314(Static12.aClass60_104, 382, 211, 16776960, 0);
			local116 = local108 + 15;
			arg0.method3314(Static12.aClass60_96, 382, 226, 16776960, 0);
			@Pc(124) int local124 = local116 + 15;
			arg0.method3314(Static12.aClass60_98, 382, 241, 16776960, 0);
			@Pc(132) int local132 = local124 + 15;
			@Pc(133) int local133 = local132 + 10;
			arg0.method3317(Static34.method611(new Class60[] { Static165.aClass60_1031, Static123.method3304(Static12.aClass60_95) }), 272, 266, 16777215, 0);
			@Pc(153) int local153 = local133 + 15;
			arg0.method3317(Static34.method611(new Class60[] { Static12.aClass60_107, Static12.aClass60_94.method1802() }), 274, 281, 16777215, 0);
			@Pc(174) int local174 = local153 + 15;
		}
		if (Static134.anInt2902 == 10) {
			Static55.aClass73_2.method2270(202, 171);
			if (Static94.anInt2196 == 0) {
				local108 = 251;
				arg0.method3314(Static179.aClass60_1425, 382, 251, 16776960, 0);
				local116 = local108 + 30;
				Static79.aClass73_3.method2270(229, 271);
				arg0.method3298(Static34.aClass60_270, 229, 271, 144, 40, 16777215, 0, 1, 1, 0);
				Static79.aClass73_3.method2270(389, 271);
				arg0.method3298(Static49.aClass60_394, 389, 271, 144, 40, 16777215, 0, 1, 1, 0);
			} else if (Static94.anInt2196 == 2) {
				local108 = 211;
				arg0.method3314(Static12.aClass60_104, 382, 211, 16776960, 0);
				local116 = local108 + 15;
				arg0.method3314(Static12.aClass60_96, 382, 226, 16776960, 0);
				local116 += 15;
				arg0.method3314(Static12.aClass60_98, 382, 241, 16776960, 0);
				local116 += 15;
				local116 += 10;
				@Pc(309) boolean local309;
				if (Static29.anInt699 == 0 && Static42.anInt910 % 40 < 20 && Static204.aBoolean242) {
					local309 = true;
				} else {
					local309 = false;
				}
				arg0.method3317(Static34.method611(new Class60[] { Static165.aClass60_1031, Static123.method3304(Static12.aClass60_95), local309 ? Static22.aClass60_176 : Static12.aClass60_99 }), 272, 266, 16777215, 0);
				local116 += 15;
				if (Static29.anInt699 == 1 && Static42.anInt910 % 40 < 20 && Static204.aBoolean242) {
					local309 = true;
				} else {
					local309 = false;
				}
				arg0.method3317(Static34.method611(new Class60[] { Static12.aClass60_107, Static12.aClass60_94.method1802(), local309 ? Static22.aClass60_176 : Static12.aClass60_99 }), 274, 281, 16777215, 0);
				Static79.aClass73_3.method2270(229, 301);
				local116 += 15;
				arg0.method3314(Static183.aClass60_1315, 302, 326, 16777215, 0);
				Static79.aClass73_3.method2270(389, 301);
				arg0.method3314(Static185.aClass60_1341, 462, 326, 16777215, 0);
			} else if (Static94.anInt2196 == 3) {
				arg0.method3314(Static115.aClass60_870, 382, 211, 16776960, 0);
				local108 = 236;
				arg0.method3314(Static92.aClass60_702, 382, 236, 16777215, 0);
				local116 = local108 + 15;
				arg0.method3314(Static153.aClass60_1181, 382, 251, 16777215, 0);
				local116 += 15;
				arg0.method3314(Static1.aClass60_28, 382, 266, 16777215, 0);
				local116 += 15;
				arg0.method3314(Static60.aClass60_472, 382, 281, 16777215, 0);
				local116 += 15;
				Static79.aClass73_3.method2270(309, 301);
				arg0.method3314(Static185.aClass60_1341, 382, 326, 16777215, 0);
			}
		}
		if (Static156.anInt3468 != 1) {
			if (Static27.anInt643 > 0) {
				Static129.method938(Static27.anInt643);
				Static27.anInt643 = 0;
			}
			Static74.method1345();
		}
		Static73.aClass73Array2[Static56.aBoolean74 ? 1 : 0].method2270(725, 463);
		if (Static134.anInt2902 <= 5 || Static128.anInt2810 == 2) {
			return;
		}
		if (Static125.aClass73_4 == null) {
			Static125.aClass73_4 = Static148.method3515(Static152.aClass7_Sub1_23, Static92.anInt2176);
		}
		if (Static125.aClass73_4 == null) {
			return;
		}
		Static125.aClass73_4.method2270(5, 463);
		arg0.method3314(Static34.method611(new Class60[] { Static197.aClass60_1436, Static140.aClass60_1103, Static40.method681(Static9.anInt4432) }), 55, 478, 16777215, 0);
		if (Static59.aClass20_1 != null) {
			arg1.method3314(Static40.aClass60_305, 55, 492, 16777215, 0);
			return;
		}
		arg1.method3314(Static180.aClass60_1305, 55, 492, 16777215, 0);
		return;
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(IZI)V")
	public static void method56(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		Static96.aClass1_Sub9_Sub1_3.method953(95);
		Static96.aClass1_Sub9_Sub1_3.method910(arg0);
		Static96.aClass1_Sub9_Sub1_3.method914(arg1);
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(B)J")
	public static synchronized long method57() {
		@Pc(11) long local11 = System.currentTimeMillis();
		if (Static110.aLong77 > local11) {
			Static91.aLong67 += Static110.aLong77 - local11;
		}
		Static110.aLong77 = local11;
		return local11 + Static91.aLong67;
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(BLclient!of;)V")
	public static void method59(@OriginalArg(1) Class1_Sub21 arg0) {
		@Pc(5) long local5 = 0L;
		if (arg0.anInt3160 == 0) {
			local5 = Static84.method1047(arg0.anInt3156, arg0.anInt3155, arg0.anInt3148);
		}
		if (arg0.anInt3160 == 1) {
			local5 = Static133.method2219(arg0.anInt3156, arg0.anInt3155, arg0.anInt3148);
		}
		if (arg0.anInt3160 == 2) {
			local5 = Static31.method593(arg0.anInt3156, arg0.anInt3155, arg0.anInt3148);
		}
		if (arg0.anInt3160 == 3) {
			local5 = Static184.method2913(arg0.anInt3156, arg0.anInt3155, arg0.anInt3148);
		}
		@Pc(65) int local65 = 0;
		@Pc(67) int local67 = -1;
		@Pc(69) int local69 = 0;
		if (local5 != 0L) {
			local67 = Integer.MAX_VALUE & (int) (local5 >>> 32);
			local69 = (int) local5 >> 20 & 0x3;
			local65 = (int) local5 >> 14 & 0x1F;
		}
		arg0.anInt3153 = local69;
		arg0.anInt3157 = local67;
		arg0.anInt3147 = local65;
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(ILclient!ah;)Z")
	public static boolean method60(@OriginalArg(1) Class6 arg0) {
		if (arg0.anIntArray25 == null) {
			return false;
		}
		for (@Pc(17) int local17 = 0; local17 < arg0.anIntArray25.length; local17++) {
			@Pc(24) int local24 = Static28.method2168(local17, arg0);
			@Pc(29) int local29 = arg0.anIntArray29[local17];
			if (arg0.anIntArray25[local17] == 2) {
				if (local29 <= local24) {
					return false;
				}
			} else if (arg0.anIntArray25[local17] == 3) {
				if (local29 >= local24) {
					return false;
				}
			} else if (arg0.anIntArray25[local17] == 4) {
				if (local29 == local24) {
					return false;
				}
			} else if (local29 != local24) {
				return false;
			}
		}
		return true;
	}
}
