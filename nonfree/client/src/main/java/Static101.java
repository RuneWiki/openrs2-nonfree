import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static101 {

	@OriginalMember(owner = "client!hg", name = "e", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray14 = new int[2][][];

	@OriginalMember(owner = "client!hg", name = "g", descriptor = "[I")
	public static int[] anIntArray272 = new int[128];

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(IIIB)V")
	public static void method2280(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 == 0) {
			Static81.aClass1_Sub16_Sub1_1.method2676(58);
			Static81.aClass1_Sub16_Sub1_1.method2621(5);
		}
		if (arg0 == 1) {
			Static81.aClass1_Sub16_Sub1_1.method2676(219);
			Static81.aClass1_Sub16_Sub1_1.method2621(19);
		}
		Static81.aClass1_Sub16_Sub1_1.method2657(Static82.anInt1972 + arg2);
		Static81.aClass1_Sub16_Sub1_1.method2662(Static35.aBooleanArray2[82] ? 1 : 0);
		Static81.aClass1_Sub16_Sub1_1.method2617(Static266.anInt5790 + arg1);
		Static52.anInt1401 = arg1;
		Static4.anInt139 = arg2;
	}

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(II)Lclient!ii;")
	public static Class1_Sub2_Sub11 method2281(@OriginalArg(0) int arg0) {
		@Pc(8) Class1_Sub2_Sub11 local8 = (Class1_Sub2_Sub11) Static265.aClass125_10.method3669((long) arg0);
		if (local8 != null) {
			return local8;
		}
		@Pc(23) byte[] local23 = Static167.aClass83_119.method2306(arg0, 0);
		if (local23 == null) {
			return null;
		}
		local8 = new Class1_Sub2_Sub11();
		@Pc(46) Class1_Sub16 local46 = new Class1_Sub16(local23);
		local46.anInt3328 = local46.aByteArray39.length - 2;
		@Pc(57) int local57 = local46.method2652();
		@Pc(68) int local68 = local46.aByteArray39.length - local57 - 2 - 12;
		local46.anInt3328 = local68;
		@Pc(75) int local75 = local46.method2610();
		local8.anInt2552 = local46.method2652();
		local8.anInt2553 = local46.method2652();
		local8.anInt2555 = local46.method2652();
		local8.anInt2554 = local46.method2652();
		@Pc(99) int local99 = local46.method2655();
		@Pc(110) int local110;
		@Pc(117) int local117;
		if (local99 > 0) {
			local8.aClass117Array1 = new Class117[local99];
			for (local110 = 0; local110 < local99; local110++) {
				local117 = local46.method2652();
				@Pc(124) Class117 local124 = new Class117(Static227.method3943(local117));
				local8.aClass117Array1[local110] = local124;
				while (local117-- > 0) {
					@Pc(139) int local139 = local46.method2610();
					@Pc(143) int local143 = local46.method2610();
					local124.method3445(new Class1_Sub10(local143), (long) local139);
				}
			}
		}
		local46.anInt3328 = 0;
		local8.aString79 = local46.method2639();
		local110 = 0;
		local8.aStringArray11 = new String[local75];
		local8.anIntArray247 = new int[local75];
		local8.anIntArray246 = new int[local75];
		while (local68 > local46.anInt3328) {
			local117 = local46.method2652();
			if (local117 == 3) {
				local8.aStringArray11[local110] = local46.method2611().intern();
			} else if (local117 >= 100 || local117 == 21 || local117 == 38 || local117 == 39) {
				local8.anIntArray246[local110] = local46.method2655();
			} else {
				local8.anIntArray246[local110] = local46.method2610();
			}
			local8.anIntArray247[local110++] = local117;
		}
		Static265.aClass125_10.method3671(local8, (long) arg0);
		return local8;
	}

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(IJ)Ljava/lang/String;")
	public static String method2282(@OriginalArg(1) long arg0) {
		Static167.aCalendar1.setTime(new Date(arg0));
		@Pc(13) int local13 = Static167.aCalendar1.get(7);
		@Pc(17) int local17 = Static167.aCalendar1.get(5);
		@Pc(21) int local21 = Static167.aCalendar1.get(2);
		@Pc(25) int local25 = Static167.aCalendar1.get(1);
		@Pc(29) int local29 = Static167.aCalendar1.get(11);
		@Pc(39) int local39 = Static167.aCalendar1.get(12);
		@Pc(43) int local43 = Static167.aCalendar1.get(13);
		return Static240.aStringArray29[local13 - 1] + ", " + local17 / 10 + local17 % 10 + "-" + Static56.aStringArray5[local21] + "-" + local25 + " " + local29 / 10 + local29 % 10 + ":" + local39 / 10 + local39 % 10 + ":" + local43 / 10 + local43 % 10 + " GMT";
	}

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(III)V")
	public static void method2283(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(16) int local16 = arg0 * Static239.anInt5264 >> 8;
		if (arg1 == -1 && !Static191.aBoolean212) {
			Static28.method535();
		} else if (arg1 != -1 && (arg1 != Static282.anInt6020 || !Static233.method4058()) && local16 != 0 && !Static191.aBoolean212) {
			Static112.method1806(arg1, local16, Static210.aClass83_139);
		}
		Static282.anInt6020 = arg1;
	}

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(ILjava/lang/String;III)V")
	public static void method2285(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(10) Class116 local10 = Static127.method2179(arg0, arg2);
		if (local10 == null) {
			return;
		}
		if (local10.anObjectArray2 != null) {
			@Pc(20) Class1_Sub27 local20 = new Class1_Sub27();
			local20.anInt4897 = arg3;
			local20.anObjectArray32 = local10.anObjectArray2;
			local20.aString151 = arg1;
			local20.aClass116_13 = local10;
			Static22.method392(local20);
		}
		@Pc(38) boolean local38 = true;
		if (local10.anInt4301 > 0) {
			local38 = Static59.method1156(local10);
		}
		if (!local38 || !Static37.method866(local10).method1105(arg3 - 1)) {
			return;
		}
		if (arg3 == 1) {
			Static81.aClass1_Sub16_Sub1_1.method2676(143);
			Static81.aClass1_Sub16_Sub1_1.method2606(arg2);
			Static81.aClass1_Sub16_Sub1_1.method2624(arg0);
		}
		if (arg3 == 2) {
			Static81.aClass1_Sub16_Sub1_1.method2676(246);
			Static81.aClass1_Sub16_Sub1_1.method2606(arg2);
			Static81.aClass1_Sub16_Sub1_1.method2624(arg0);
		}
		if (arg3 == 3) {
			Static81.aClass1_Sub16_Sub1_1.method2676(164);
			Static81.aClass1_Sub16_Sub1_1.method2606(arg2);
			Static81.aClass1_Sub16_Sub1_1.method2624(arg0);
		}
		if (arg3 == 4) {
			Static81.aClass1_Sub16_Sub1_1.method2676(54);
			Static81.aClass1_Sub16_Sub1_1.method2606(arg2);
			Static81.aClass1_Sub16_Sub1_1.method2624(arg0);
		}
		if (arg3 == 5) {
			Static81.aClass1_Sub16_Sub1_1.method2676(192);
			Static81.aClass1_Sub16_Sub1_1.method2606(arg2);
			Static81.aClass1_Sub16_Sub1_1.method2624(arg0);
		}
		if (arg3 == 6) {
			Static81.aClass1_Sub16_Sub1_1.method2676(128);
			Static81.aClass1_Sub16_Sub1_1.method2606(arg2);
			Static81.aClass1_Sub16_Sub1_1.method2624(arg0);
		}
		if (arg3 == 7) {
			Static81.aClass1_Sub16_Sub1_1.method2676(73);
			Static81.aClass1_Sub16_Sub1_1.method2606(arg2);
			Static81.aClass1_Sub16_Sub1_1.method2624(arg0);
		}
		if (arg3 == 8) {
			Static81.aClass1_Sub16_Sub1_1.method2676(232);
			Static81.aClass1_Sub16_Sub1_1.method2606(arg2);
			Static81.aClass1_Sub16_Sub1_1.method2624(arg0);
		}
		if (arg3 == 9) {
			Static81.aClass1_Sub16_Sub1_1.method2676(40);
			Static81.aClass1_Sub16_Sub1_1.method2606(arg2);
			Static81.aClass1_Sub16_Sub1_1.method2624(arg0);
		}
		if (arg3 == 10) {
			Static81.aClass1_Sub16_Sub1_1.method2676(29);
			Static81.aClass1_Sub16_Sub1_1.method2606(arg2);
			Static81.aClass1_Sub16_Sub1_1.method2624(arg0);
		}
	}

	@OriginalMember(owner = "client!hg", name = "b", descriptor = "(B)V")
	public static void method2287() {
		if (Static18.method379() != 2) {
			return;
		}
		@Pc(20) byte local20 = (byte) (Static121.anInt2729 - 4 & 0xFF);
		@Pc(24) int local24 = Static121.anInt2729 % 104;
		@Pc(30) int local30;
		@Pc(35) int local35;
		for (local30 = 0; local30 < 4; local30++) {
			for (local35 = 0; local35 < 104; local35++) {
				Static269.aByteArrayArrayArray51[local30][local24][local35] = local20;
			}
		}
		if (Static145.anInt3477 == 3) {
			return;
		}
		for (local30 = 0; local30 < 2; local30++) {
			Static73.anIntArray186[local30] = -1000000;
			Static92.anIntArray217[local30] = 1000000;
			Static22.anIntArray48[local30] = 0;
			Static277.anIntArray596[local30] = 1000000;
			Static94.anIntArray609[local30] = 0;
		}
		if (Static280.anInt5999 != 1) {
			local30 = Static220.method3905(Static229.anInt5072, Static157.anInt3612, Static145.anInt3477);
			if (local30 - Static48.anInt1350 < 800 && (Static126.aByteArrayArrayArray24[Static145.anInt3477][Static229.anInt5072 >> 7][Static157.anInt3612 >> 7] & 0x4) != 0) {
				Static253.method4311(Static229.anInt5072 >> 7, Static157.anInt3612 >> 7, false, 1, Static132.aClass1_Sub14ArrayArrayArray2);
			}
			return;
		}
		if ((Static126.aByteArrayArrayArray24[Static145.anInt3477][Static239.aClass25_Sub1_Sub1_2.anInt1635 >> 7][Static239.aClass25_Sub1_Sub1_2.anInt1604 >> 7] & 0x4) != 0) {
			Static253.method4311(Static239.aClass25_Sub1_Sub1_2.anInt1635 >> 7, Static239.aClass25_Sub1_Sub1_2.anInt1604 >> 7, false, 0, Static132.aClass1_Sub14ArrayArrayArray2);
		}
		if (Static38.anInt1151 >= 310) {
			return;
		}
		@Pc(174) int local174 = Static239.aClass25_Sub1_Sub1_2.anInt1635 >> 7;
		local30 = Static229.anInt5072 >> 7;
		local35 = Static157.anInt3612 >> 7;
		@Pc(187) int local187 = Static239.aClass25_Sub1_Sub1_2.anInt1604 >> 7;
		@Pc(198) int local198;
		if (local187 > local35) {
			local198 = local187 - local35;
		} else {
			local198 = local35 - local187;
		}
		@Pc(217) int local217;
		if (local174 > local30) {
			local217 = local174 - local30;
		} else {
			local217 = local30 - local174;
		}
		if (local217 == 0 && local198 == 0 || local217 <= -104 || local217 >= 104 || local198 <= -104 || local198 >= 104) {
			Static217.method3829("RC: " + local30 + "," + local35 + " " + local174 + "," + local187 + " " + Static82.anInt1972 + "," + Static266.anInt5790, null);
			return;
		}
		@Pc(296) int local296;
		@Pc(298) int local298;
		if (local217 <= local198) {
			local296 = local217 * 65536 / local198;
			local298 = 32768;
			while (local187 != local35) {
				if (local35 < local187) {
					local35++;
				} else if (local187 < local35) {
					local35--;
				}
				if ((Static126.aByteArrayArrayArray24[Static145.anInt3477][local30][local35] & 0x4) != 0) {
					Static253.method4311(local30, local35, false, 1, Static132.aClass1_Sub14ArrayArrayArray2);
					break;
				}
				local298 += local296;
				if (local298 >= 65536) {
					local298 -= 65536;
					if (local174 > local30) {
						local30++;
					} else if (local174 < local30) {
						local30--;
					}
					if ((Static126.aByteArrayArrayArray24[Static145.anInt3477][local30][local35] & 0x4) != 0) {
						Static253.method4311(local30, local35, false, 1, Static132.aClass1_Sub14ArrayArrayArray2);
						break;
					}
				}
			}
			return;
		}
		local296 = local198 * 65536 / local217;
		local298 = 32768;
		while (local30 != local174) {
			if (local174 > local30) {
				local30++;
			} else if (local30 > local174) {
				local30--;
			}
			if ((Static126.aByteArrayArrayArray24[Static145.anInt3477][local30][local35] & 0x4) != 0) {
				Static253.method4311(local30, local35, false, 1, Static132.aClass1_Sub14ArrayArrayArray2);
				break;
			}
			local298 += local296;
			if (local298 >= 65536) {
				if (local35 < local187) {
					local35++;
				} else if (local35 > local187) {
					local35--;
				}
				local298 -= 65536;
				if ((Static126.aByteArrayArrayArray24[Static145.anInt3477][local30][local35] & 0x4) != 0) {
					Static253.method4311(local30, local35, false, 1, Static132.aClass1_Sub14ArrayArrayArray2);
					break;
				}
			}
		}
	}
}
