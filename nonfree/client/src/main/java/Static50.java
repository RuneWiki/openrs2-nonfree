import java.awt.Font;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static50 {

	@OriginalMember(owner = "client!ei", name = "wb", descriptor = "Ljava/awt/Font;")
	public static Font aFont2;

	@OriginalMember(owner = "client!ei", name = "yb", descriptor = "Lclient!uf;")
	public static Class1_Sub2_Sub5_Sub5 aClass1_Sub2_Sub5_Sub5_4;

	@OriginalMember(owner = "client!ei", name = "Ab", descriptor = "I")
	public static int anInt1407;

	@OriginalMember(owner = "client!ei", name = "zb", descriptor = "Lclient!oc;")
	private static final Class65 aClass65_876 = Static118.method2249("M");

	@OriginalMember(owner = "client!ei", name = "xb", descriptor = "Lclient!oc;")
	public static Class65 aClass65_875 = aClass65_876;

	@OriginalMember(owner = "client!ei", name = "Bb", descriptor = "Lclient!oc;")
	public static Class65 aClass65_877 = aClass65_876;

	@OriginalMember(owner = "client!ei", name = "c", descriptor = "(II)V")
	public static void method915(@OriginalArg(0) int arg0) {
		@Pc(6) int[] local6 = Static189.aClass1_Sub2_Sub5_Sub3_8.anIntArray204;
		@Pc(9) int local9 = local6.length;
		for (@Pc(11) int local11 = 0; local11 < local9; local11++) {
			local6[local11] = 1;
		}
		@Pc(38) int local38;
		@Pc(40) int local40;
		for (@Pc(26) int local26 = 1; local26 < 103; local26++) {
			local38 = (52736 - local26 * 512) * 4 + 24628;
			for (local40 = 1; local40 < 103; local40++) {
				if ((Static106.aByteArrayArrayArray67[arg0][local40][local26] & 0x18) == 0) {
					Static99.method1889(local6, local38, arg0, local40, local26);
				}
				if (arg0 < 3 && (Static106.aByteArrayArrayArray67[arg0 + 1][local40][local26] & 0x8) != 0) {
					Static99.method1889(local6, local38, arg0 + 1, local40, local26);
				}
				local38 += 4;
			}
		}
		Static189.aClass1_Sub2_Sub5_Sub3_8.method1303();
		local38 = (int) (Math.random() * 20.0D) + ((int) (Math.random() * 20.0D) + 238 - 10 << 16) + ((int) (Math.random() * 20.0D) + 228 << 8) + 238 - 10;
		local40 = (int) (Math.random() * 20.0D) + 238 - 10 << 16;
		@Pc(148) int local148;
		for (@Pc(145) int local145 = 1; local145 < 103; local145++) {
			for (local148 = 1; local148 < 103; local148++) {
				if ((Static106.aByteArrayArrayArray67[arg0][local148][local145] & 0x18) == 0) {
					Static37.method676(local145, arg0, local148, local38, local40);
				}
				if (arg0 < 3 && (Static106.aByteArrayArrayArray67[arg0 + 1][local148][local145] & 0x8) != 0) {
					Static37.method676(local145, arg0 + 1, local148, local38, local40);
				}
			}
		}
		Static41.anInt1105 = 0;
		for (local148 = 0; local148 < 104; local148++) {
			for (@Pc(214) int local214 = 0; local214 < 104; local214++) {
				@Pc(220) long local220 = Static26.method479(Static207.anInt4425, local148, local214);
				if (local220 != 0L) {
					@Pc(233) Class1_Sub2_Sub13 local233 = Static5.method65((int) (local220 >>> 32) & Integer.MAX_VALUE);
					@Pc(236) int local236 = local233.anInt1997;
					if (local236 >= 0) {
						@Pc(240) int local240 = local148;
						@Pc(242) int local242 = local214;
						if (local236 != 22 && local236 != 29 && local236 != 34 && local236 != 36 && local236 != 46 && local236 != 47 && local236 != 48) {
							@Pc(274) int[][] local274 = Static83.aClass57Array1[Static207.anInt4425].anIntArrayArray23;
							for (@Pc(276) int local276 = 0; local276 < 10; local276++) {
								@Pc(282) int local282 = (int) (Math.random() * 4.0D);
								if (local282 == 0 && local240 > 0 && local148 - 3 < local240 && (local274[local240 - 1][local242] & 0x12C0108) == 0) {
									local240--;
								}
								if (local282 == 1 && local240 < 103 && local148 + 3 > local240 && (local274[local240 + 1][local242] & 0x12C0180) == 0) {
									local240++;
								}
								if (local282 == 2 && local242 > 0 && local214 - 3 < local242 && (local274[local240][local242 - 1] & 0x12C0102) == 0) {
									local242--;
								}
								if (local282 == 3 && local242 < 103 && local242 < local214 + 3 && (local274[local240][local242 + 1] & 0x12C0120) == 0) {
									local242++;
								}
							}
						}
						Static100.anIntArray286[Static41.anInt1105] = local233.anInt1998;
						Static67.anIntArray164[Static41.anInt1105] = local240;
						Static180.anIntArray448[Static41.anInt1105] = local242;
						Static41.anInt1105++;
					}
				}
			}
		}
		Static188.aClass37_1.method1451();
	}

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(IB)Lclient!a;")
	public static Class1_Sub1 method917(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			return new Class1_Sub1_Sub22();
		} else if (arg0 == 1) {
			return new Class1_Sub1_Sub24();
		} else if (arg0 == 2) {
			return new Class1_Sub1_Sub37();
		} else if (arg0 == 3) {
			return new Class1_Sub1_Sub35();
		} else if (arg0 == 4) {
			return new Class1_Sub1_Sub28();
		} else if (arg0 == 5) {
			return new Class1_Sub1_Sub17();
		} else if (arg0 == 6) {
			return new Class1_Sub1_Sub15();
		} else if (arg0 == 7) {
			return new Class1_Sub1_Sub4();
		} else if (arg0 == 8) {
			return new Class1_Sub1_Sub26();
		} else if (arg0 == 9) {
			return new Class1_Sub1_Sub30();
		} else if (arg0 == 10) {
			return new Class1_Sub1_Sub29();
		} else if (arg0 == 11) {
			return new Class1_Sub1_Sub16();
		} else if (arg0 == 12) {
			return new Class1_Sub1_Sub23();
		} else if (arg0 == 13) {
			return new Class1_Sub1_Sub32();
		} else if (arg0 == 14) {
			return new Class1_Sub1_Sub18();
		} else if (arg0 == 15) {
			return new Class1_Sub1_Sub12();
		} else if (arg0 == 16) {
			return new Class1_Sub1_Sub2();
		} else if (arg0 == 17) {
			return new Class1_Sub1_Sub34();
		} else if (arg0 == 18) {
			return new Class1_Sub1_Sub10_Sub1();
		} else if (arg0 == 19) {
			return new Class1_Sub1_Sub8();
		} else if (arg0 == 20) {
			return new Class1_Sub1_Sub11();
		} else if (arg0 == 21) {
			return new Class1_Sub1_Sub6();
		} else if (arg0 == 22) {
			return new Class1_Sub1_Sub39();
		} else if (arg0 == 23) {
			return new Class1_Sub1_Sub21();
		} else if (arg0 == 24) {
			return new Class1_Sub1_Sub27();
		} else if (arg0 == 25) {
			return new Class1_Sub1_Sub20();
		} else if (arg0 == 26) {
			return new Class1_Sub1_Sub1();
		} else if (arg0 == 27) {
			return new Class1_Sub1_Sub38();
		} else if (arg0 == 28) {
			return new Class1_Sub1_Sub5();
		} else if (arg0 == 29) {
			return new Class1_Sub1_Sub33();
		} else if (arg0 == 30) {
			return new Class1_Sub1_Sub14();
		} else if (arg0 == 31) {
			return new Class1_Sub1_Sub9();
		} else if (arg0 == 32) {
			return new Class1_Sub1_Sub31();
		} else if (arg0 == 33) {
			return new Class1_Sub1_Sub19();
		} else if (arg0 == 34) {
			return new Class1_Sub1_Sub25();
		} else if (arg0 == 35) {
			return new Class1_Sub1_Sub36();
		} else if (arg0 == 36) {
			return new Class1_Sub1_Sub3();
		} else if (arg0 == 37) {
			return new Class1_Sub1_Sub7();
		} else if (arg0 == 38) {
			return new Class1_Sub1_Sub13();
		} else if (arg0 == 39) {
			return new Class1_Sub1_Sub10();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(IIIII)V")
	public static void method918(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(12) int local12;
		if (arg3 > arg0) {
			for (local12 = arg0; local12 < arg3; local12++) {
				Static40.anIntArrayArray11[local12][arg1] = arg2;
			}
		} else {
			for (local12 = arg3; local12 < arg0; local12++) {
				Static40.anIntArrayArray11[local12][arg1] = arg2;
			}
		}
	}

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(IJ)V")
	public static void method920(@OriginalArg(1) long arg0) {
		if (arg0 == 0L) {
			return;
		}
		if (Static33.anInt973 >= 100 && Static58.anInt1537 != 1 || Static33.anInt973 >= 200) {
			Static31.method603(0, Static117.aClass65_1665, Static49.aClass65_809);
			return;
		}
		@Pc(35) Class65 local35 = Static134.method2558(arg0).method2488();
		for (@Pc(37) int local37 = 0; local37 < Static33.anInt973; local37++) {
			if (arg0 == Static206.aLongArray10[local37]) {
				Static31.method603(0, Static117.aClass65_1665, Static109.method2004(new Class65[] { local35, Static71.aClass65_1074 }));
				return;
			}
		}
		for (@Pc(71) int local71 = 0; local71 < Static29.anInt859; local71++) {
			if (arg0 == Static197.aLongArray9[local71]) {
				Static31.method603(0, Static117.aClass65_1665, Static109.method2004(new Class65[] { Static42.aClass65_689, local35, Static149.aClass65_2018 }));
				return;
			}
		}
		if (local35.method2470(Static201.aClass6_Sub4_Sub1_3.aClass65_479)) {
			Static31.method603(0, Static117.aClass65_1665, Static148.aClass65_2006);
			return;
		}
		Static125.aClass65Array41[Static33.anInt973] = local35;
		Static206.aLongArray10[Static33.anInt973] = arg0;
		Static9.anIntArray16[Static33.anInt973] = 0;
		Static53.aClass65Array19[Static33.anInt973] = Static117.aClass65_1665;
		Static46.anIntArray116[Static33.anInt973] = 0;
		Static68.anInt1494 = Static1.anInt4459;
		Static33.anInt973++;
		Static45.aClass1_Sub14_Sub1_8.method1761(52);
		Static45.aClass1_Sub14_Sub1_8.method1721(arg0);
	}

	@OriginalMember(owner = "client!ei", name = "d", descriptor = "(II)I")
	public static int method921(@OriginalArg(0) int arg0) {
		@Pc(0) int local0 = arg0 - 1;
		@Pc(10) int local10 = local0 | local0 >>> 1;
		@Pc(21) int local21 = local10 | local10 >>> 2;
		@Pc(27) int local27 = local21 | local21 >>> 4;
		@Pc(33) int local33 = local27 | local27 >>> 8;
		@Pc(39) int local39 = local33 | local33 >>> 16;
		return local39 + 1;
	}

	@OriginalMember(owner = "client!ei", name = "e", descriptor = "(B)Lclient!cb;")
	public static Class1_Sub2_Sub4 method922() {
		if (Static115.aClass1_Sub2_Sub4_1 == null) {
			Static115.aClass1_Sub2_Sub4_1 = new Class1_Sub2_Sub4();
		}
		return Static115.aClass1_Sub2_Sub4_1;
	}
}
