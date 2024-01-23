import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static210 {

	@OriginalMember(owner = "client!s", name = "G", descriptor = "[[Z")
	public static boolean[][] aBooleanArrayArray2;

	@OriginalMember(owner = "client!s", name = "w", descriptor = "Lclient!lc;")
	public static Class79 aClass79_30 = new Class79(30);

	@OriginalMember(owner = "client!s", name = "D", descriptor = "Z")
	public static boolean aBoolean226 = true;

	@OriginalMember(owner = "client!s", name = "E", descriptor = "I")
	public static int anInt4599 = -1;

	@OriginalMember(owner = "client!s", name = "K", descriptor = "Ljava/lang/String;")
	public static String aString325 = null;

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(IIII)V")
	public static void method3477(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(16) Class1_Sub2_Sub18 local16 = Static13.method232(arg2, 11);
		local16.method3810();
		local16.anInt5015 = arg1;
		local16.anInt5009 = arg0;
	}

	@OriginalMember(owner = "client!s", name = "b", descriptor = "(II)Lclient!gk;")
	public static Class1_Sub2_Sub8 method3478(@OriginalArg(1) int arg0) {
		@Pc(15) Class1_Sub2_Sub8 local15 = (Class1_Sub2_Sub8) Static247.aClass79_37.method2483((long) arg0);
		if (local15 != null) {
			return local15;
		}
		local15 = Static70.method1364(Static138.aClass51_46, Static264.aClass51_88, arg0);
		if (local15 != null) {
			Static247.aClass79_37.method2486(local15, (long) arg0);
		}
		return local15;
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(IIZILclient!g;)V")
	public static void method3481(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class45 arg3) {
		if (Static230.anInt5417 >= 400) {
			return;
		}
		if (arg3.anIntArray154 != null) {
			arg3 = arg3.method1460();
		}
		if (arg3 == null || !arg3.aBoolean123) {
			return;
		}
		@Pc(28) String local28 = arg3.aString123;
		if (arg3.anInt1995 != 0) {
			@Pc(43) String local43 = Static68.anInt1404 == 1 ? Static158.aString241 : Static165.aString253;
			local28 = local28 + Static170.method2960(Static83.aClass9_Sub1_Sub1_1.anInt356, arg3.anInt1995) + " (" + local43 + arg3.anInt1995 + ")";
		}
		if (Static183.anInt5174 == 1) {
			Static199.method3319(Static255.anInt5424, (long) arg1, arg0, Static197.aString146, Static199.aString296 + " -> <col=ffff00>" + local28, (short) 5, arg2);
		} else if (Static88.aBoolean138) {
			@Pc(340) Class1_Sub2_Sub10 local340 = Static215.anInt4738 == -1 ? null : Static16.method3757(Static215.anInt4738);
			if ((Static8.anInt152 & 0x2) != 0 && (local340 == null || arg3.method1461(Static215.anInt4738, local340.anInt3511) != local340.anInt3511)) {
				Static199.method3319(Static167.anInt3914, (long) arg1, arg0, Static106.aString183, Static120.aString194 + " -> <col=ffff00>" + local28, (short) 21, arg2);
			}
		} else {
			@Pc(108) String[] local108 = arg3.aStringArray12;
			if (Static75.aBoolean125) {
				local108 = Static251.method4073(local108);
			}
			@Pc(118) int local118;
			if (local108 != null) {
				for (local118 = 4; local118 >= 0; local118--) {
					if (local108[local118] != null && (Static68.anInt1404 != 0 || !local108[local118].equalsIgnoreCase(Static131.aString52))) {
						@Pc(138) byte local138 = 0;
						if (local118 == 0) {
							local138 = 6;
						}
						@Pc(147) int local147 = -1;
						if (arg3.anInt2012 == local118) {
							local147 = arg3.anInt1999;
						}
						if (arg3.anInt2035 == local118) {
							local147 = arg3.anInt1997;
						}
						if (local118 == 1) {
							local138 = 37;
						}
						if (local118 == 2) {
							local138 = 42;
						}
						if (local118 == 3) {
							local138 = 45;
						}
						if (local118 == 4) {
							local138 = 12;
						}
						Static199.method3319(local147, (long) arg1, arg0, local108[local118], "<col=ffff00>" + local28, local138, arg2);
					}
				}
			}
			if (Static68.anInt1404 == 0 && local108 != null) {
				for (local118 = 4; local118 >= 0; local118--) {
					if (local108[local118] != null && local108[local118].equalsIgnoreCase(Static131.aString52)) {
						@Pc(233) short local233 = 0;
						if (local118 == 0) {
							local233 = 6;
						}
						@Pc(242) short local242 = 0;
						if (arg3.anInt1995 > Static83.aClass9_Sub1_Sub1_1.anInt356) {
							local242 = 2000;
						}
						if (local118 == 1) {
							local233 = 37;
						}
						if (local118 == 2) {
							local233 = 42;
						}
						if (local118 == 3) {
							local233 = 45;
						}
						if (local118 == 4) {
							local233 = 12;
						}
						if (local233 != 0) {
							local233 += local242;
						}
						Static199.method3319(arg3.anInt2014, (long) arg1, arg0, local108[local118], "<col=ffff00>" + local28, local233, arg2);
					}
				}
			}
			Static199.method3319(Static202.anInt4460, (long) arg1, arg0, Static208.aString319, "<col=ffff00>" + local28, (short) 1005, arg2);
		}
	}

	@OriginalMember(owner = "client!s", name = "f", descriptor = "(I)V")
	public static void method3482() {
		@Pc(8) int local8 = Static172.aByteArrayArray8.length;
		for (@Pc(14) int local14 = 0; local14 < local8; local14++) {
			if (Static172.aByteArrayArray8[local14] != null) {
				@Pc(22) int local22 = -1;
				for (@Pc(24) int local24 = 0; local24 < Static147.anInt3559; local24++) {
					if (Static236.anIntArray445[local24] == Static169.anIntArray298[local14]) {
						local22 = local24;
						break;
					}
				}
				if (local22 == -1) {
					Static236.anIntArray445[Static147.anInt3559] = Static169.anIntArray298[local14];
					local22 = Static147.anInt3559++;
				}
				@Pc(58) int local58 = 0;
				@Pc(65) Class1_Sub13 local65 = new Class1_Sub13(Static172.aByteArrayArray8[local14]);
				while (Static172.aByteArrayArray8[local14].length > local65.anInt2395 && local58 < 511) {
					@Pc(77) int local77 = local22 | local58++ << 6;
					@Pc(81) int local81 = local65.method1764();
					@Pc(85) int local85 = local81 >> 14;
					@Pc(89) int local89 = local81 & 0x3F;
					@Pc(103) int local103 = (Static169.anIntArray298[local14] & 0xFF) * 64 + local89 - Static29.anInt907;
					@Pc(109) int local109 = local81 >> 7 & 0x3F;
					@Pc(122) int local122 = local109 + (Static169.anIntArray298[local14] >> 8) * 64 - Static64.anInt1786;
					@Pc(128) Class45 local128 = Static155.method2756(local65.method1764());
					if (Static36.aClass9_Sub1_Sub2Array2[local77] == null && (local128.aByte6 & 0x1) > 0 && Static171.anInt3993 == local85 && local122 >= 0 && local128.anInt2021 + local122 < 104 && local103 >= 0 && local128.anInt2021 + local103 < 104) {
						Static36.aClass9_Sub1_Sub2Array2[local77] = new Class9_Sub1_Sub2();
						@Pc(176) Class9_Sub1_Sub2 local176 = Static36.aClass9_Sub1_Sub2Array2[local77];
						Static142.anIntArray260[Static16.anInt4955++] = local77;
						local176.anInt484 = Static156.anInt3722;
						local176.method223(local128);
						local176.method212(local176.aClass45_1.anInt2021);
						local176.anInt418 = local176.anInt419 = Static34.anIntArray78[local176.aClass45_1.aByte9];
						local176.anInt432 = local176.aClass45_1.anInt2027;
						local176.anInt404 = local176.aClass45_1.anInt2004;
						if (local176.anInt404 == 0) {
							local176.anInt419 = 0;
						}
						local176.method206(local176.method208(), true, local103, local122);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!s", name = "c", descriptor = "(B)Ljava/lang/String;")
	public static String method3483() {
		@Pc(5) String local5 = "www";
		if (Static25.anInt848 != 0) {
			local5 = "www-wtqa";
		}
		@Pc(16) String local16 = "";
		if (Static135.aString214 != null) {
			local16 = "/p=" + Static135.aString214;
		}
		return "http://" + local5 + ".runescape.com/l=" + Static135.anInt3311 + "/a=" + Static145.anInt3517 + local16 + "/";
	}
}
