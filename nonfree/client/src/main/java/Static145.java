import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static145 {

	@OriginalMember(owner = "client!kj", name = "b", descriptor = "Lclient!nm;")
	public static Class119 aClass119_53;

	@OriginalMember(owner = "client!kj", name = "l", descriptor = "I")
	public static int anInt2809;

	@OriginalMember(owner = "client!kj", name = "f", descriptor = "J")
	public static long aLong103 = 0L;

	@OriginalMember(owner = "client!kj", name = "o", descriptor = "Lclient!ui;")
	public static Class175 aClass175_22 = new Class175(32);

	@OriginalMember(owner = "client!kj", name = "p", descriptor = "Lclient!jo;")
	public static Class96 aClass96_8 = new Class96();

	@OriginalMember(owner = "client!kj", name = "q", descriptor = "I")
	public static int anInt2812 = 0;

	@OriginalMember(owner = "client!kj", name = "r", descriptor = "Lclient!ui;")
	public static Class175 aClass175_23 = new Class175(5);

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(ILclient!si;)Lclient!si;")
	public static Class157 method2516(@OriginalArg(1) Class157 arg0) {
		if (arg0.anInt4671 != -1) {
			return Static206.method3444(arg0.anInt4671);
		}
		@Pc(20) int local20 = arg0.anInt4672 >>> 16;
		@Pc(25) Class182 local25 = new Class182(Static224.aClass86_27);
		for (@Pc(38) Class1_Sub20 local38 = (Class1_Sub20) local25.method4508(); local38 != null; local38 = (Class1_Sub20) local25.method4507()) {
			if (local38.anInt3422 == local20) {
				return Static206.method3444((int) local38.aLong210);
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(Lclient!si;IIIBIIILjava/lang/String;Lclient!uj;)V")
	public static void method2517(@OriginalArg(0) Class157 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) String arg7, @OriginalArg(9) Class1_Sub5_Sub9 arg8) {
		@Pc(13) int local13 = arg1 * arg1 + arg2 * arg2;
		@Pc(20) int local20 = Static69.anInt1492 + (int) Static148.aFloat64 & 0x7FF;
		@Pc(32) int local32 = Math.max(arg0.anInt4680 / 2, arg0.anInt4689 / 2) + 10;
		if (local32 * local32 < local13) {
			return;
		}
		@Pc(43) int local43 = Class87.anIntArray177[local20];
		@Pc(47) int local47 = Class87.anIntArray173[local20];
		@Pc(55) int local55 = local47 * 256 / (Static289.anInt5250 + 256);
		@Pc(63) int local63 = local43 * 256 / (Static289.anInt5250 + 256);
		@Pc(73) int local73 = local63 * arg2 + arg1 * local55 >> 16;
		@Pc(78) int local78 = arg8.method2867(arg7, 100);
		@Pc(84) int local84 = local73 - local78 / 2;
		@Pc(95) int local95 = arg8.method2873(arg7);
		@Pc(105) int local105 = local63 * arg1 - local55 * arg2 >> 16;
		if (local84 < -arg0.anInt4680 || arg0.anInt4680 < local84 || local105 < -arg0.anInt4689 || arg0.anInt4689 < local105) {
			return;
		}
		if (Static71.aBoolean165) {
			Static93.method1763((Class1_Sub5_Sub6_Sub2) arg0.method3973(false));
		} else {
			Static77.method1592(arg0.anIntArray533, arg0.anIntArray539);
		}
		arg8.method2854(arg7, local84 + arg6 + arg0.anInt4680 / 2, -local95 + -local105 + arg0.anInt4689 / 2 + arg3 + -arg4, local78, 50, arg5, 0, 1, 0, 0);
		if (Static71.aBoolean165) {
			Static93.method1765();
		} else {
			Static77.method1586();
		}
	}

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(IIIIBZZ)V")
	public static void method2518(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) boolean arg5) {
		if (arg2 >= arg0) {
			return;
		}
		@Pc(11) int local11 = arg2;
		@Pc(17) int local17 = (arg0 + arg2) / 2;
		@Pc(21) Class4_Sub1 local21 = Static25.aClass4_Sub1Array3[local17];
		Static25.aClass4_Sub1Array3[local17] = Static25.aClass4_Sub1Array3[arg0];
		Static25.aClass4_Sub1Array3[arg0] = local21;
		for (@Pc(33) int local33 = arg2; local33 < arg0; local33++) {
			if (Static41.method728(arg5, arg4, arg1, arg3, Static25.aClass4_Sub1Array3[local33], local21) <= 0) {
				@Pc(54) Class4_Sub1 local54 = Static25.aClass4_Sub1Array3[local33];
				Static25.aClass4_Sub1Array3[local33] = Static25.aClass4_Sub1Array3[local11];
				Static25.aClass4_Sub1Array3[local11++] = local54;
			}
		}
		Static25.aClass4_Sub1Array3[arg0] = Static25.aClass4_Sub1Array3[local11];
		Static25.aClass4_Sub1Array3[local11] = local21;
		method2518(local11 - 1, arg1, arg2, arg3, arg4, arg5);
		method2518(arg0, arg1, local11 + 1, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(I)V")
	public static void method2519() {
		Static17.aClass175_3.method4287();
		Static253.aClass175_37.method4287();
		Static96.aClass175_14.method4287();
		Static26.aClass175_5.method4287();
	}

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(Z)V")
	public static void method2521() {
		Static217.aClass175_34.method4287();
		Static255.aClass175_38.method4287();
		Static45.aClass175_9.method4287();
	}

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(II)Lclient!ie;")
	public static Class1_Sub1 method2522(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			return new Class1_Sub1_Sub2();
		} else if (arg0 == 1) {
			return new Class1_Sub1_Sub38();
		} else if (arg0 == 2) {
			return new Class1_Sub1_Sub27();
		} else if (arg0 == 3) {
			return new Class1_Sub1_Sub3();
		} else if (arg0 == 4) {
			return new Class1_Sub1_Sub11();
		} else if (arg0 == 5) {
			return new Class1_Sub1_Sub34();
		} else if (arg0 == 6) {
			return new Class1_Sub1_Sub39();
		} else if (arg0 == 7) {
			return new Class1_Sub1_Sub25();
		} else if (arg0 == 8) {
			return new Class1_Sub1_Sub7();
		} else if (arg0 == 9) {
			return new Class1_Sub1_Sub26();
		} else if (arg0 == 10) {
			return new Class1_Sub1_Sub5();
		} else if (arg0 == 11) {
			return new Class1_Sub1_Sub31();
		} else if (arg0 == 12) {
			return new Class1_Sub1_Sub16();
		} else if (arg0 == 13) {
			return new Class1_Sub1_Sub29();
		} else if (arg0 == 14) {
			return new Class1_Sub1_Sub22();
		} else if (arg0 == 15) {
			return new Class1_Sub1_Sub21();
		} else if (arg0 == 16) {
			return new Class1_Sub1_Sub32();
		} else if (arg0 == 17) {
			return new Class1_Sub1_Sub17();
		} else if (arg0 == 18) {
			return new Class1_Sub1_Sub18_Sub1();
		} else if (arg0 == 19) {
			return new Class1_Sub1_Sub28();
		} else if (arg0 == 20) {
			return new Class1_Sub1_Sub14();
		} else if (arg0 == 21) {
			return new Class1_Sub1_Sub36();
		} else if (arg0 == 22) {
			return new Class1_Sub1_Sub24();
		} else if (arg0 == 23) {
			return new Class1_Sub1_Sub20();
		} else if (arg0 == 24) {
			return new Class1_Sub1_Sub6();
		} else if (arg0 == 25) {
			return new Class1_Sub1_Sub23();
		} else if (arg0 == 26) {
			return new Class1_Sub1_Sub12();
		} else if (arg0 == 27) {
			return new Class1_Sub1_Sub30();
		} else if (arg0 == 28) {
			return new Class1_Sub1_Sub35();
		} else if (arg0 == 29) {
			return new Class1_Sub1_Sub4();
		} else if (arg0 == 30) {
			return new Class1_Sub1_Sub1();
		} else if (arg0 == 31) {
			return new Class1_Sub1_Sub15();
		} else if (arg0 == 32) {
			return new Class1_Sub1_Sub19();
		} else if (arg0 == 33) {
			return new Class1_Sub1_Sub33();
		} else if (arg0 == 34) {
			return new Class1_Sub1_Sub8();
		} else if (arg0 == 35) {
			return new Class1_Sub1_Sub13();
		} else if (arg0 == 36) {
			return new Class1_Sub1_Sub37();
		} else if (arg0 == 37) {
			return new Class1_Sub1_Sub10();
		} else if (arg0 == 38) {
			return new Class1_Sub1_Sub9();
		} else if (arg0 == 39) {
			return new Class1_Sub1_Sub18();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!kj", name = "c", descriptor = "(I)V")
	public static void method2523() {
		@Pc(6) int local6 = Static10.aClass1_Sub13_Sub1_117.method1883(8);
		@Pc(12) int local12;
		if (Static275.anInt5043 > local6) {
			for (local12 = local6; local12 < Static275.anInt5043; local12++) {
				Static304.anIntArray601[Static128.anInt2549++] = Static135.anIntArray210[local12];
			}
		}
		if (Static275.anInt5043 < local6) {
			throw new RuntimeException("gppov1");
		}
		Static275.anInt5043 = 0;
		for (local12 = 0; local12 < local6; local12++) {
			@Pc(64) int local64 = Static135.anIntArray210[local12];
			@Pc(68) Class11_Sub4_Sub1 local68 = Static14.aClass11_Sub4_Sub1Array1[local64];
			@Pc(73) int local73 = Static10.aClass1_Sub13_Sub1_117.method1883(1);
			if (local73 == 0) {
				Static135.anIntArray210[Static275.anInt5043++] = local64;
				local68.anInt3822 = Static167.anInt637;
			} else {
				@Pc(96) int local96 = Static10.aClass1_Sub13_Sub1_117.method1883(2);
				if (local96 == 0) {
					Static135.anIntArray210[Static275.anInt5043++] = local64;
					local68.anInt3822 = Static167.anInt637;
					Static18.anIntArray36[Static125.anInt2513++] = local64;
				} else {
					@Pc(139) int local139;
					@Pc(149) int local149;
					if (local96 == 1) {
						Static135.anIntArray210[Static275.anInt5043++] = local64;
						local68.anInt3822 = Static167.anInt637;
						local139 = Static10.aClass1_Sub13_Sub1_117.method1883(3);
						local68.method3361(1, local139);
						local149 = Static10.aClass1_Sub13_Sub1_117.method1883(1);
						if (local149 == 1) {
							Static18.anIntArray36[Static125.anInt2513++] = local64;
						}
					} else if (local96 == 2) {
						Static135.anIntArray210[Static275.anInt5043++] = local64;
						local68.anInt3822 = Static167.anInt637;
						if (Static10.aClass1_Sub13_Sub1_117.method1883(1) == 1) {
							local139 = Static10.aClass1_Sub13_Sub1_117.method1883(3);
							local68.method3361(2, local139);
							local149 = Static10.aClass1_Sub13_Sub1_117.method1883(3);
							local68.method3361(2, local149);
						} else {
							local139 = Static10.aClass1_Sub13_Sub1_117.method1883(3);
							local68.method3361(0, local139);
						}
						local139 = Static10.aClass1_Sub13_Sub1_117.method1883(1);
						if (local139 == 1) {
							Static18.anIntArray36[Static125.anInt2513++] = local64;
						}
					} else if (local96 == 3) {
						Static304.anIntArray601[Static128.anInt2549++] = local64;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(III)I")
	public static int method2524(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(15) int local15 = 1;
		while (arg0 > 1) {
			if ((arg0 & 0x1) != 0) {
				local15 *= arg1;
			}
			arg0 >>= 0x1;
			arg1 *= arg1;
		}
		if (arg0 == 1) {
			return local15 * arg1;
		} else {
			return local15;
		}
	}

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(Lclient!ge;IIIIIZZZ)Lclient!lj;")
	public static Class1_Sub5_Sub6 method2525(@OriginalArg(0) Class61 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5, @OriginalArg(7) boolean arg6, @OriginalArg(8) boolean arg7) {
		@Pc(9) Class3 local9 = Static69.method1330(arg2);
		if (arg1 > 1 && local9.anIntArray13 != null) {
			@Pc(17) int local17 = -1;
			for (@Pc(19) int local19 = 0; local19 < 10; local19++) {
				if (arg1 >= local9.anIntArray14[local19] && local9.anIntArray14[local19] != 0) {
					local17 = local9.anIntArray13[local19];
				}
			}
			if (local17 != -1) {
				local9 = Static69.method1330(local17);
			}
		}
		@Pc(63) Class11_Sub1_Sub2 local63 = local9.method78(arg0);
		if (local63 == null) {
			return null;
		}
		@Pc(70) Class1_Sub5_Sub6_Sub1 local70 = null;
		if (local9.anInt125 != -1) {
			local70 = (Class1_Sub5_Sub6_Sub1) method2525(arg0, 10, local9.anInt148, 0, 1, true, false, true);
			if (local70 == null) {
				return null;
			}
		} else if (local9.anInt127 != -1) {
			local70 = (Class1_Sub5_Sub6_Sub1) method2525(arg0, arg1, local9.anInt137, arg3, arg4, true, false, false);
			if (local70 == null) {
				return null;
			}
		}
		@Pc(120) int[] local120 = Static77.anIntArray131;
		@Pc(122) int local122 = Static77.anInt1706;
		@Pc(124) int local124 = Static77.anInt1704;
		@Pc(127) int[] local127 = new int[4];
		Static77.method1583(local127);
		@Pc(135) Class1_Sub5_Sub6_Sub1 local135 = new Class1_Sub5_Sub6_Sub1(36, 32);
		Static77.method1594(local135.anIntArray117, 36, 32);
		Static119.method2151();
		Static119.method2160(16, 16);
		Static119.aBoolean211 = false;
		@Pc(149) int local149 = local9.anInt169;
		if (arg7) {
			local149 = (int) ((double) local149 * 1.5D);
		} else if (arg4 == 2) {
			local149 = (int) ((double) local149 * 1.04D);
		}
		@Pc(179) int local179 = local149 * Class87.anIntArray177[local9.anInt132] >> 16;
		@Pc(188) int local188 = Class87.anIntArray173[local9.anInt132] * local149 >> 16;
		local63.method2900(local9.anInt147, local9.anInt120, local9.anInt132, local9.anInt129, local188 + local9.anInt146 - local63.method4297() / 2, local179 - -local9.anInt146, -1L);
		if (arg4 >= 1) {
			local135.method1285(1);
			if (arg4 >= 2) {
				local135.method1285(16777215);
			}
			Static77.method1594(local135.anIntArray117, 36, 32);
		}
		if (arg3 != 0) {
			local135.method1275(arg3);
		}
		if (local9.anInt125 != -1) {
			local70.method3195(0, 0);
		} else if (local9.anInt127 != -1) {
			Static77.method1594(local70.anIntArray117, 36, 32);
			local135.method3195(0, 0);
			local135 = local70;
		}
		if (arg6 && (local9.anInt135 == 1 || arg1 != 1) && arg1 != -1) {
			Static282.aClass1_Sub5_Sub9_Sub2_1.method2878(Static171.method2952(arg1), 0, 9, 16776960, 1);
		}
		Static77.method1594(local120, local122, local124);
		Static77.method1603(local127);
		Static119.method2151();
		Static119.aBoolean211 = true;
		return Static71.aBoolean165 && !arg5 ? new Class1_Sub5_Sub6_Sub2(local135) : local135;
	}
}
