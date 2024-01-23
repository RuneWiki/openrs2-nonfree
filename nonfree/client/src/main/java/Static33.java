import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static33 {

	@OriginalMember(owner = "client!cc", name = "g", descriptor = "[I")
	public static int[] anIntArray50;

	@OriginalMember(owner = "client!cc", name = "s", descriptor = "I")
	public static int anInt764;

	@OriginalMember(owner = "client!cc", name = "e", descriptor = "[J")
	public static long[] aLongArray1 = new long[100];

	@OriginalMember(owner = "client!cc", name = "j", descriptor = "[I")
	public static int[] anIntArray51 = new int[] { 0, 1, 2, 3, 4, 5, 6, 14 };

	@OriginalMember(owner = "client!cc", name = "t", descriptor = "[[Z")
	public static boolean[][] aBooleanArrayArray1 = new boolean[][] { { true, true, true }, { false, false }, { false, true }, { true, false }, { false, true, true }, { true, false, true }, { false, true, false }, { true, false, false } };

	@OriginalMember(owner = "client!cc", name = "u", descriptor = "[I")
	public static int[] anIntArray53 = new int[32];

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(ZLjava/lang/String;)Ljava/lang/String;")
	private static String method526(@OriginalArg(1) String arg0) {
		@Pc(10) String local10 = Static72.method1149(Static31.method513(arg0));
		if (local10 == null) {
			local10 = "";
		}
		return local10;
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(BLclient!tk;)Z")
	public static boolean method527(@OriginalArg(1) Class159 arg0) {
		if (arg0.anIntArray404 == null) {
			return false;
		}
		for (@Pc(13) int local13 = 0; local13 < arg0.anIntArray404.length; local13++) {
			@Pc(32) int local32 = Static53.method844(arg0, local13);
			@Pc(37) int local37 = arg0.anIntArray396[local13];
			if (arg0.anIntArray404[local13] == 2) {
				if (local32 >= local37) {
					return false;
				}
			} else if (arg0.anIntArray404[local13] == 3) {
				if (local37 >= local32) {
					return false;
				}
			} else if (arg0.anIntArray404[local13] == 4) {
				if (local37 == local32) {
					return false;
				}
			} else if (local32 != local37) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(ILjava/lang/String;B)V")
	public static void method528(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		@Pc(19) String local19 = Static19.method344(method526(arg1));
		@Pc(21) boolean local21 = false;
		for (@Pc(23) int local23 = 0; local23 < Static61.anInt1336; local23++) {
			@Pc(32) Class36_Sub3_Sub1 local32 = Static230.aClass36_Sub3_Sub1Array1[Static85.anIntArray123[local23]];
			if (local32 != null && local32.aString144 != null && local32.aString144.equalsIgnoreCase(local19)) {
				if (arg0 == 1) {
					Static66.aClass8_Sub2_Sub1_4.method2398(85);
					Static66.aClass8_Sub2_Sub1_4.method2384(0);
					Static66.aClass8_Sub2_Sub1_4.method2345(Static85.anIntArray123[local23]);
				} else if (arg0 == 4) {
					Static66.aClass8_Sub2_Sub1_4.method2398(79);
					Static66.aClass8_Sub2_Sub1_4.method2345(Static85.anIntArray123[local23]);
					Static66.aClass8_Sub2_Sub1_4.method2368(0);
				} else if (arg0 == 5) {
					Static66.aClass8_Sub2_Sub1_4.method2398(103);
					Static66.aClass8_Sub2_Sub1_4.method2366(Static85.anIntArray123[local23]);
					Static66.aClass8_Sub2_Sub1_4.method2384(0);
				} else if (arg0 == 6) {
					Static66.aClass8_Sub2_Sub1_4.method2398(172);
					Static66.aClass8_Sub2_Sub1_4.method2345(Static85.anIntArray123[local23]);
					Static66.aClass8_Sub2_Sub1_4.method2368(0);
				} else if (arg0 == 7) {
					Static66.aClass8_Sub2_Sub1_4.method2398(173);
					Static66.aClass8_Sub2_Sub1_4.method2340(0);
					Static66.aClass8_Sub2_Sub1_4.method2345(Static85.anIntArray123[local23]);
				}
				local21 = true;
				break;
			}
		}
		if (!local21) {
			Static47.method746(0, Static187.aString132 + local19, "");
		}
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(I)V")
	public static void method530() {
		if (Static267.aClass8_Sub1_Sub2_2 == null) {
			return;
		}
		if (Static286.anInt5464 < 10) {
			if (!Static161.aClass132_56.method3178(Static267.aClass8_Sub1_Sub2_2.aString20)) {
				Static286.anInt5464 = Static172.aClass132_61.method3182(Static267.aClass8_Sub1_Sub2_2.aString20) / 10;
				return;
			}
			Static144.method2276();
			Static286.anInt5464 = 10;
		}
		if (Static286.anInt5464 == 10) {
			Static140.anInt2782 = Static267.aClass8_Sub1_Sub2_2.anInt650 >> 6 << 6;
			Static221.anInt4539 = (Static267.aClass8_Sub1_Sub2_2.anInt642 >> 6 << 6) + 64 - Static140.anInt2782;
			Static220.anInt4522 = Static267.aClass8_Sub1_Sub2_2.anInt644 >> 6 << 6;
			Static156.anInt3157 = (Static267.aClass8_Sub1_Sub2_2.anInt649 >> 6 << 6) + 64 - Static220.anInt4522;
			@Pc(95) int[] local95 = Static267.aClass8_Sub1_Sub2_2.method423(Static34.anInt770, (Static21.aClass36_Sub3_Sub1_1.anInt4118 >> 7) + Static130.anInt2601, Static49.anInt1089 + (Static21.aClass36_Sub3_Sub1_1.anInt4117 >> 7));
			@Pc(97) int local97 = -1;
			@Pc(99) int local99 = -1;
			if (local95 != null) {
				local99 = Static221.anInt4539 + Static140.anInt2782 - local95[2] - 1;
				local97 = local95[1] - Static220.anInt4522;
			}
			if (local97 >= 0 && local97 < Static156.anInt3157 && local99 >= 0 && Static221.anInt4539 > local99) {
				local99 += (int) (Math.random() * 10.0D) - 5;
				local97 += (int) (Math.random() * 10.0D) - 5;
				Static218.anInt4483 = local99;
				Static52.anInt1147 = local97;
			} else {
				@Pc(188) int[] local188;
				if (Static162.anInt3359 == -1 || Static118.anInt2385 == -1) {
					local188 = Static267.aClass8_Sub1_Sub2_2.method425(Static267.aClass8_Sub1_Sub2_2.anInt647 >> 14 & 0x3FFF, Static267.aClass8_Sub1_Sub2_2.anInt647 & 0x3FFF);
					Static52.anInt1147 = local188[1] - Static220.anInt4522;
					Static218.anInt4483 = Static140.anInt2782 + Static221.anInt4539 - local188[2] - 1;
				} else {
					local188 = Static267.aClass8_Sub1_Sub2_2.method425(Static162.anInt3359, Static118.anInt2385);
					Static118.anInt2385 = -1;
					Static162.anInt3359 = -1;
					if (local188 != null) {
						Static218.anInt4483 = Static221.anInt4539 + Static140.anInt2782 - local188[2] - 1;
						Static52.anInt1147 = local188[1] - Static220.anInt4522;
					}
				}
			}
			if (Static267.aClass8_Sub1_Sub2_2.anInt640 == 37) {
				Static224.aFloat47 = 3.0F;
				Static138.aFloat29 = 3.0F;
			} else if (Static267.aClass8_Sub1_Sub2_2.anInt640 == 50) {
				Static224.aFloat47 = 4.0F;
				Static138.aFloat29 = 4.0F;
			} else if (Static267.aClass8_Sub1_Sub2_2.anInt640 == 75) {
				Static224.aFloat47 = 6.0F;
				Static138.aFloat29 = 6.0F;
			} else if (Static267.aClass8_Sub1_Sub2_2.anInt640 == 100) {
				Static224.aFloat47 = 8.0F;
				Static138.aFloat29 = 8.0F;
			} else if (Static267.aClass8_Sub1_Sub2_2.anInt640 == 200) {
				Static224.aFloat47 = 16.0F;
				Static138.aFloat29 = 16.0F;
			} else {
				Static224.aFloat47 = 8.0F;
				Static138.aFloat29 = 8.0F;
			}
			Static286.method4120();
			Static247.anIntArray475 = new int[Static211.anInt4341 + 1];
			@Pc(305) int local305 = Static221.anInt4539 >> 6;
			@Pc(309) int local309 = Static206.anInt4271 >> 1;
			@Pc(315) int local315 = Static218.anInt4484 >> 2 << 10;
			@Pc(319) int local319 = Static156.anInt3157 >> 6;
			Static257.anIntArrayArrayArray15 = new int[local319][local305][];
			Static141.aByteArrayArrayArray7 = new byte[local319][local305][];
			Static197.aByteArrayArrayArray11 = new byte[local319][local305][];
			Static74.aByteArrayArrayArray3 = new byte[local319][local305][];
			Static182.aByteArrayArrayArray10 = new byte[local319][local305][];
			Static16.anIntArrayArrayArray8 = new int[local319][local305][];
			Static81.anIntArrayArrayArray4 = new int[local319][local305][];
			Static66.aByteArrayArrayArray13 = new byte[local319][local305][];
			Static176.method2711(local315, local309);
			Static286.anInt5464 = 20;
		} else if (Static286.anInt5464 == 20) {
			Static277.method4271(new Class8_Sub2(Static161.aClass132_56.method3162(Static267.aClass8_Sub1_Sub2_2.aString20, "underlay")));
			Static286.anInt5464 = 30;
			Static49.method773(true);
			Static159.method2557();
		} else if (Static286.anInt5464 == 30) {
			Static90.method1461(new Class8_Sub2(Static161.aClass132_56.method3162(Static267.aClass8_Sub1_Sub2_2.aString20, "overlay")));
			Static286.anInt5464 = 40;
			Static159.method2557();
		} else if (Static286.anInt5464 == 40) {
			Static146.method2311(new Class8_Sub2(Static161.aClass132_56.method3162(Static267.aClass8_Sub1_Sub2_2.aString20, "overlay2")));
			Static286.anInt5464 = 50;
			Static159.method2557();
		} else if (Static286.anInt5464 == 50) {
			Static136.method2202(new Class8_Sub2(Static161.aClass132_56.method3162(Static267.aClass8_Sub1_Sub2_2.aString20, "loc")));
			Static286.anInt5464 = 60;
			Static49.method773(true);
			Static159.method2557();
		} else if (Static286.anInt5464 == 60) {
			if (Static161.aClass132_56.method3170(Static267.aClass8_Sub1_Sub2_2.aString20 + "_labels")) {
				if (!Static161.aClass132_56.method3178(Static267.aClass8_Sub1_Sub2_2.aString20 + "_labels")) {
					return;
				}
				Static245.aClass130_2 = Static27.method461(Static161.aClass132_56, Static267.aClass8_Sub1_Sub2_2.aString20 + "_labels");
			} else {
				Static245.aClass130_2 = new Class130(0);
			}
			Static286.anInt5464 = 70;
			Static159.method2557();
		} else if (Static286.anInt5464 == 70) {
			Static163.aClass102_9 = new Class102(11, true, Static39.aCanvas1);
			Static286.anInt5464 = 73;
			Static49.method773(true);
			Static159.method2557();
		} else if (Static286.anInt5464 == 73) {
			Static134.aClass102_2 = new Class102(12, true, Static39.aCanvas1);
			Static286.anInt5464 = 76;
			Static49.method773(true);
			Static159.method2557();
		} else if (Static286.anInt5464 == 76) {
			Static168.aClass102_11 = new Class102(14, true, Static39.aCanvas1);
			Static286.anInt5464 = 79;
			Static49.method773(true);
			Static159.method2557();
		} else if (Static286.anInt5464 == 79) {
			Static197.aClass102_8 = new Class102(17, true, Static39.aCanvas1);
			Static286.anInt5464 = 82;
			Static49.method773(true);
			Static159.method2557();
		} else if (Static286.anInt5464 == 82) {
			Static270.aClass102_10 = new Class102(19, true, Static39.aCanvas1);
			Static286.anInt5464 = 85;
			Static49.method773(true);
			Static159.method2557();
		} else if (Static286.anInt5464 == 85) {
			Static2.aClass102_1 = new Class102(22, true, Static39.aCanvas1);
			Static286.anInt5464 = 88;
			Static49.method773(true);
			Static159.method2557();
		} else if (Static286.anInt5464 == 88) {
			Static188.aClass102_6 = new Class102(26, true, Static39.aCanvas1);
			Static286.anInt5464 = 91;
			Static49.method773(true);
			Static159.method2557();
		} else {
			Static193.aClass102_7 = new Class102(30, true, Static39.aCanvas1);
			Static286.anInt5464 = 100;
			Static49.method773(true);
			Static159.method2557();
			System.gc();
		}
	}
}
