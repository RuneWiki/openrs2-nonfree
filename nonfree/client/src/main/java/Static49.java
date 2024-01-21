import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static49 {

	@OriginalMember(owner = "client!kb", name = "F", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray37;

	@OriginalMember(owner = "client!kb", name = "E", descriptor = "Lclient!fe;")
	public static Class17 aClass17_97 = new Class17(50);

	@OriginalMember(owner = "client!kb", name = "L", descriptor = "I")
	public static int anInt2692 = 0;

	@OriginalMember(owner = "client!kb", name = "M", descriptor = "I")
	public static int anInt2693 = 0;

	@OriginalMember(owner = "client!kb", name = "N", descriptor = "Lclient!lc;")
	public static Class31 aClass31_933 = Static56.method1206(" (Xlevel)2");

	@OriginalMember(owner = "client!kb", name = "O", descriptor = "Lclient!lc;")
	public static Class31 aClass31_934 = Static56.method1206("Loaded gamescreen");

	@OriginalMember(owner = "client!kb", name = "Q", descriptor = "I")
	public static int anInt2694 = 0;

	@OriginalMember(owner = "client!kb", name = "S", descriptor = "I")
	public static int anInt2696 = 0;

	@OriginalMember(owner = "client!kb", name = "T", descriptor = "Z")
	public static volatile boolean aBoolean143 = true;

	@OriginalMember(owner = "client!kb", name = "b", descriptor = "(Z)V")
	public static void method1696() {
		aByteArrayArrayArray37 = null;
		aClass31_934 = null;
		aClass17_97 = null;
		aClass31_933 = null;
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(II[BI)Lclient!lc;")
	public static Class31 method1697(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) {
		@Pc(11) Class31 local11 = new Class31();
		local11.aByteArray17 = new byte[arg0];
		local11.anInt1901 = arg0;
		Static112.method991(arg1, arg2, local11.aByteArray17, 0, arg0);
		return local11;
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(BLclient!qd;Ljava/awt/Component;)V")
	public static void method1698(@OriginalArg(1) Class51 arg0, @OriginalArg(2) Component arg1) {
		try {
			@Pc(8) Class6_Sub1 local8 = (Class6_Sub1) Class.forName("Class6_Sub1_Sub2").getDeclaredConstructor().newInstance();
			local8.method1572(arg0, 2048);
			Static3.aClass6_1 = local8;
		} catch (@Pc(16) Throwable local16) {
			try {
				Static3.aClass6_1 = new Class6_Sub1_Sub1(arg0, arg1);
			} catch (@Pc(24) Throwable local24) {
				if (Static84.aString3.toLowerCase().indexOf("microsoft") >= 0) {
					try {
						Static3.aClass6_1 = new Class6_Sub2();
						return;
					} catch (@Pc(44) Throwable local44) {
					}
				}
				Static3.aClass6_1 = new Class6(8000);
			}
		}
	}

	@OriginalMember(owner = "client!kb", name = "d", descriptor = "(I)V")
	public static void method1699() {
		if (Static100.anInt2732 == 0) {
			return;
		}
		@Pc(22) int local22 = 0;
		if (Static19.anInt851 != 0) {
			local22 = 1;
		}
		for (@Pc(31) int local31 = 0; local31 < 100; local31++) {
			if (Static28.aClass31Array6[local31] != null) {
				@Pc(41) int local41 = Static59.anIntArray286[local31];
				@Pc(45) Class31 local45 = Static8.aClass31Array5[local31];
				if (local45 != null && local45.method1226(Static38.aClass31_518)) {
					local45 = local45.method1222(5);
				}
				if (local45 != null && local45.method1226(Static7.aClass31_102)) {
					local45 = local45.method1222(5);
				}
				if ((local41 == 3 || local41 == 7) && (local41 == 7 || Static12.anInt527 == 0 || Static12.anInt527 == 1 && Static59.method1282(local45))) {
					@Pc(104) int local104 = 329 - local22 * 13;
					local22++;
					if (Static85.anInt2508 > 4 && Static61.anInt2102 - 4 > local104 - 10 && Static61.anInt2102 - 4 <= local104 - -3) {
						@Pc(149) int local149 = Static98.aClass2_Sub1_Sub3_Sub3_4.method961(Static37.method974(new Class31[] { Static20.aClass31_704, local45, Static28.aClass31Array6[local31] })) + 25;
						if (local149 > 450) {
							local149 = 450;
						}
						if (Static85.anInt2508 < local149 + 4) {
							if (Static67.anInt2204 >= 1) {
								Static17.method523(0, Static37.method974(new Class31[] { Static57.aClass31_928, local45 }), 2011, 0, 0);
							}
							Static17.method523(0, Static37.method974(new Class31[] { Static48.aClass31_618, local45 }), 2010, 0, 0);
							Static17.method523(0, Static37.method974(new Class31[] { Static13.aClass31_186, local45 }), 2009, 0, 0);
						}
					}
					if (local22 >= 5) {
						return;
					}
				}
				if ((local41 == 5 || local41 == 6) && Static12.anInt527 < 2) {
					local22++;
					if (local22 >= 5) {
						return;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!kb", name = "e", descriptor = "(I)[Lclient!cb;")
	public static Class2_Sub1_Sub3_Sub1[] method1700() {
		@Pc(8) Class2_Sub1_Sub3_Sub1[] local8 = new Class2_Sub1_Sub3_Sub1[Static41.anInt1575];
		for (@Pc(10) int local10 = 0; local10 < Static41.anInt1575; local10++) {
			@Pc(20) Class2_Sub1_Sub3_Sub1 local20 = local8[local10] = new Class2_Sub1_Sub3_Sub1();
			local20.anInt434 = Static15.anInt655;
			local20.anInt435 = Static58.anInt1946;
			local20.anInt431 = Static95.anIntArray366[local10];
			local20.anInt433 = Static76.anIntArray316[local10];
			local20.anInt432 = Static50.anIntArray74[local10];
			local20.anInt436 = Static91.anIntArray346[local10];
			local20.anIntArray60 = Static67.anIntArray301;
			local20.aByteArray7 = Static77.aByteArrayArray10[local10];
		}
		Static4.method95();
		return local8;
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(IBIILclient!lb;)V")
	public static void method1701(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class2_Sub1_Sub8 arg3) {
		if (Static59.anInt2044 >= 400) {
			return;
		}
		if (arg3.anIntArray271 != null) {
			arg3 = arg3.method1189();
		}
		if (arg3 == null || !arg3.aBoolean94) {
			return;
		}
		@Pc(34) Class31 local34 = arg3.aClass31_662;
		if (arg3.anInt1866 != 0) {
			local34 = Static37.method974(new Class31[] { local34, Static89.method1498(arg3.anInt1866, Static37.aClass2_Sub1_Sub4_Sub6_Sub1_1.anInt1732), aClass31_933, Static89.method1499(arg3.anInt1866), Static93.aClass31_870 });
		}
		if (Static63.anInt2118 == 1) {
			Static17.method523(arg1, Static37.method974(new Class31[] { Static10.aClass31_132, Static40.aClass31_711, Static31.aClass31_439, local34 }), 37, arg0, arg2);
		} else if (Static47.anInt1737 != 1) {
			@Pc(122) Class31[] local122 = arg3.aClass31Array8;
			if (Static66.aBoolean112) {
				local122 = Static92.method1049(local122);
			}
			@Pc(132) int local132;
			if (local122 != null) {
				for (local132 = 4; local132 >= 0; local132--) {
					if (local122[local132] != null && !local122[local132].method1210(Static45.aClass31_582)) {
						@Pc(151) byte local151 = 0;
						if (local132 == 0) {
							local151 = 46;
						}
						if (local132 == 1) {
							local151 = 41;
						}
						if (local132 == 2) {
							local151 = 30;
						}
						if (local132 == 3) {
							local151 = 13;
						}
						if (local132 == 4) {
							local151 = 45;
						}
						Static17.method523(arg1, Static37.method974(new Class31[] { local122[local132], Static105.aClass31_950, local34 }), local151, arg0, arg2);
					}
				}
			}
			if (local122 != null) {
				for (local132 = 4; local132 >= 0; local132--) {
					if (local122[local132] != null && local122[local132].method1210(Static45.aClass31_582)) {
						@Pc(230) short local230 = 0;
						@Pc(232) int local232 = 0;
						if (arg3.anInt1866 > Static37.aClass2_Sub1_Sub4_Sub6_Sub1_1.anInt1732) {
							local230 = 2000;
						}
						if (local132 == 0) {
							local232 = local230 + 46;
						}
						if (local132 == 1) {
							local232 = local230 + 41;
						}
						if (local132 == 2) {
							local232 = local230 + 30;
						}
						if (local132 == 3) {
							local232 = local230 + 13;
						}
						if (local132 == 4) {
							local232 = local230 + 45;
						}
						Static17.method523(arg1, Static37.method974(new Class31[] { local122[local132], Static105.aClass31_950, local34 }), local232, arg0, arg2);
					}
				}
			}
			Static17.method523(arg1, Static37.method974(new Class31[] { Static7.aClass31_100, local34 }), 1003, arg0, arg2);
		} else if ((Static105.anInt2787 & 0x2) == 2) {
			Static17.method523(arg1, Static37.method974(new Class31[] { Static85.aClass31_866, Static105.aClass31_950, local34 }), 34, arg0, arg2);
			return;
		}
	}
}
