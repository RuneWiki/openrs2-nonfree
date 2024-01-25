import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static540 {

	@OriginalMember(owner = "client!un", name = "e", descriptor = "Lclient!pfa;")
	public static Class251 aClass251_59;

	@OriginalMember(owner = "client!un", name = "b", descriptor = "Lclient!cga;")
	public static final Class47 aClass47_62 = new Class47(6, 2);

	@OriginalMember(owner = "client!un", name = "d", descriptor = "[I")
	public static final int[] anIntArray253 = new int[3];

	@OriginalMember(owner = "client!un", name = "g", descriptor = "I")
	public static int anInt4070 = 0;

	@OriginalMember(owner = "client!un", name = "i", descriptor = "[[I")
	public static final int[][] anIntArrayArray25 = new int[][] { { 0, 1, 2, 3 }, { 1, 2, 3, 0 }, { 1, 2, -1, 0 }, { 2, 0, -1, 1 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 1, 3, -1 }, { -1, 0, 2, -1 }, { 3, 5, 2, 0 }, { 0, 2, 5, 3 }, { 0, 2, 3, 5 }, { 0, 1, 2, 3 } };

	@OriginalMember(owner = "client!un", name = "j", descriptor = "[I")
	public static int[] anIntArray254 = null;

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(BIII)V")
	public static void method3555(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(9) int local9 = Static39.anInt4952 + arg1;
		@Pc(13) int local13 = Static138.anInt3088 + arg0;
		if (Static270.aClass276ArrayArrayArray2 == null || arg1 < 0 || arg0 < 0 || Static473.anInt8075 <= arg1 || arg0 >= Static165.anInt6749) {
			return;
		}
		@Pc(43) long local43 = (long) (local9 | local13 << 14 | arg2 << 28);
		@Pc(49) Class6_Sub51 local49 = (Class6_Sub51) Static478.aClass128_40.method3263(local43);
		if (local49 == null) {
			Static573.method7681(arg2, arg1, arg0);
			return;
		}
		@Pc(71) Class6_Sub10 local71 = (Class6_Sub10) local49.aClass361_68.method7838();
		if (local71 == null) {
			Static573.method7681(arg2, arg1, arg0);
			return;
		}
		@Pc(85) Class4_Sub4_Sub1 local85 = (Class4_Sub4_Sub1) Static573.method7681(arg2, arg1, arg0);
		if (local85 == null) {
			local85 = new Class4_Sub4_Sub1();
		} else {
			local85.anInt1816 = local85.anInt1823 = -1;
		}
		local85.anInt1814 = local71.anInt1069;
		local85.anInt1813 = local71.anInt1068;
		label46: while (true) {
			@Pc(113) Class6_Sub10 local113 = (Class6_Sub10) local49.aClass361_68.method7845();
			if (local113 == null) {
				break;
			}
			if (local85.anInt1814 != local113.anInt1069) {
				local85.anInt1816 = local113.anInt1069;
				local85.anInt1824 = local113.anInt1068;
				while (true) {
					@Pc(134) Class6_Sub10 local134 = (Class6_Sub10) local49.aClass361_68.method7845();
					if (local134 == null) {
						break label46;
					}
					if (local85.anInt1814 != local134.anInt1069 && local85.anInt1816 != local134.anInt1069) {
						local85.anInt1817 = local134.anInt1068;
						local85.anInt1823 = local134.anInt1069;
					}
				}
			}
		}
		@Pc(178) int local178 = Static160.method2951((arg0 << 9) + 256, (arg1 << 9) + 256, arg2);
		Static242.method4222(arg2, arg1, arg0, local178, local85);
	}

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(II)V")
	public static void method3559(@OriginalArg(0) int arg0) {
		Static164.aLong87 = 1000000000L / (long) arg0;
	}

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(Lclient!ts;ZII)V")
	public static void method3563(@OriginalArg(0) Class6_Sub45 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg0 == null || Static182.aClass361_23.aClass6_287 == arg0) {
			return;
		}
		@Pc(15) int local15 = arg0.anInt8733;
		@Pc(18) int local18 = arg0.anInt8735;
		@Pc(21) int local21 = arg0.anInt8730;
		@Pc(25) int local25 = (int) arg0.aLong235;
		if (local21 >= 2000) {
			local21 -= 2000;
		}
		@Pc(32) long local32 = arg0.aLong235;
		@Pc(54) Class6_Sub31 local54;
		if (local21 == 1009) {
			Static499.anInt8329 = arg1;
			Static445.anInt7719 = 2;
			Static404.anInt7179 = arg2;
			Static212.anInt4275 = 0;
			local54 = Static114.method2007(Static234.aClass47_74, Static337.aClass324_1);
			local54.aClass6_Sub21_Sub2_2.method6052(local25);
			Static534.method7251(local54);
		}
		@Pc(90) Class6_Sub31 local90;
		@Pc(71) Class4_Sub1_Sub1_Sub2 local71;
		if (local21 == 4) {
			local71 = Static588.aClass4_Sub1_Sub1_Sub2Array3[local25];
			if (local71 != null) {
				Static445.anInt7719 = 2;
				Static212.anInt4275 = 0;
				Static404.anInt7179 = arg2;
				Static499.anInt8329 = arg1;
				local90 = Static114.method2007(Static582.aClass47_149, Static337.aClass324_1);
				local90.aClass6_Sub21_Sub2_2.method6062(Static365.aClass155_1.method4042(82) ? 1 : 0);
				local90.aClass6_Sub21_Sub2_2.method6023(local25);
				Static534.method7251(local90);
				Static32.method910(-2, true, local71.method5892(), local71.anIntArray521[0], 0, 0, local71.method5892(), local71.anIntArray522[0]);
			}
		}
		if (local21 == 5) {
			Static499.anInt8329 = arg1;
			Static404.anInt7179 = arg2;
			Static445.anInt7719 = 2;
			Static212.anInt4275 = 0;
			local54 = Static114.method2007(Static256.aClass47_79, Static337.aClass324_1);
			local54.aClass6_Sub21_Sub2_2.method6052(Static188.anInt3896);
			local54.aClass6_Sub21_Sub2_2.method6045(Static593.anInt9601);
			local54.aClass6_Sub21_Sub2_2.method6025(Static365.aClass155_1.method4042(82) ? 1 : 0);
			local54.aClass6_Sub21_Sub2_2.method6023(Static328.aClass4_Sub1_Sub1_Sub2_2.anInt7126);
			local54.aClass6_Sub21_Sub2_2.method6039(Static115.anInt2199);
			Static534.method7251(local54);
		}
		if (local21 == 50) {
			Static212.anInt4275 = 0;
			Static404.anInt7179 = arg2;
			Static445.anInt7719 = 2;
			Static499.anInt8329 = arg1;
			local54 = Static114.method2007(Static142.aClass47_152, Static337.aClass324_1);
			local54.aClass6_Sub21_Sub2_2.method6023(Static115.anInt2199);
			local54.aClass6_Sub21_Sub2_2.method6023((int) (local32 >>> 32) & Integer.MAX_VALUE);
			local54.aClass6_Sub21_Sub2_2.method6037(local18 + Static138.anInt3088);
			local54.aClass6_Sub21_Sub2_2.method6037(Static39.anInt4952 + local15);
			local54.aClass6_Sub21_Sub2_2.method6033(Static593.anInt9601);
			local54.aClass6_Sub21_Sub2_2.method6052(Static188.anInt3896);
			local54.aClass6_Sub21_Sub2_2.method6025(Static365.aClass155_1.method4042(82) ? 1 : 0);
			Static534.method7251(local54);
			Static479.method6617(local32, local15, local18);
		}
		if (local21 == 11) {
			Static404.anInt7179 = arg2;
			Static212.anInt4275 = 0;
			Static499.anInt8329 = arg1;
			Static445.anInt7719 = 2;
			local54 = Static114.method2007(Static106.aClass47_34, Static337.aClass324_1);
			local54.aClass6_Sub21_Sub2_2.method6052(local15 + Static39.anInt4952);
			local54.aClass6_Sub21_Sub2_2.method6037(local18 + Static138.anInt3088);
			local54.aClass6_Sub21_Sub2_2.method6015(Static365.aClass155_1.method4042(82) ? 1 : 0);
			local54.aClass6_Sub21_Sub2_2.method6023(Integer.MAX_VALUE & (int) (local32 >>> 32));
			Static534.method7251(local54);
			Static479.method6617(local32, local15, local18);
		}
		@Pc(377) Class6_Sub31 local377;
		@Pc(370) Class4_Sub1_Sub1_Sub1 local370;
		@Pc(355) Class6_Sub34 local355;
		if (local21 == 30) {
			local355 = (Class6_Sub34) Static593.aClass128_43.method3263((long) local25);
			if (local355 != null) {
				Static404.anInt7179 = arg2;
				Static499.anInt8329 = arg1;
				Static212.anInt4275 = 0;
				local370 = local355.aClass4_Sub1_Sub1_Sub1_2;
				Static445.anInt7719 = 2;
				local377 = Static114.method2007(Static226.aClass47_69, Static337.aClass324_1);
				local377.aClass6_Sub21_Sub2_2.method6015(Static365.aClass155_1.method4042(82) ? 1 : 0);
				local377.aClass6_Sub21_Sub2_2.method6039(local25);
				Static534.method7251(local377);
				Static32.method910(-2, true, local370.method5892(), local370.anIntArray521[0], 0, 0, local370.method5892(), local370.anIntArray522[0]);
			}
		}
		if (local21 == 25) {
			local71 = Static588.aClass4_Sub1_Sub1_Sub2Array3[local25];
			if (local71 != null) {
				Static499.anInt8329 = arg1;
				Static445.anInt7719 = 2;
				Static404.anInt7179 = arg2;
				Static212.anInt4275 = 0;
				local90 = Static114.method2007(Static440.aClass47_119, Static337.aClass324_1);
				local90.aClass6_Sub21_Sub2_2.method6052(local25);
				local90.aClass6_Sub21_Sub2_2.method6062(Static365.aClass155_1.method4042(82) ? 1 : 0);
				Static534.method7251(local90);
				Static32.method910(-2, true, local71.method5892(), local71.anIntArray521[0], 0, 0, local71.method5892(), local71.anIntArray522[0]);
			}
		}
		if (local21 == 13) {
			local355 = (Class6_Sub34) Static593.aClass128_43.method3263((long) local25);
			if (local355 != null) {
				Static499.anInt8329 = arg1;
				Static404.anInt7179 = arg2;
				local370 = local355.aClass4_Sub1_Sub1_Sub1_2;
				Static445.anInt7719 = 2;
				Static212.anInt4275 = 0;
				local377 = Static114.method2007(Static34.aClass47_16, Static337.aClass324_1);
				local377.aClass6_Sub21_Sub2_2.method6025(Static365.aClass155_1.method4042(82) ? 1 : 0);
				local377.aClass6_Sub21_Sub2_2.method6023(local25);
				Static534.method7251(local377);
				Static32.method910(-2, true, local370.method5892(), local370.anIntArray521[0], 0, 0, local370.method5892(), local370.anIntArray522[0]);
			}
		}
		@Pc(574) Class292 local574;
		if (local21 == 3) {
			local574 = Static391.method5747(local18, local15);
			if (local574 != null) {
				Static489.method6689();
				@Pc(581) Class6_Sub3 local581 = Static67.method1354(local574);
				Static398.method5831(local574, local581.method245(), local581.anInt316);
				Static104.aString16 = Static394.method5797(local574);
				Static22.aString33 = local574.aString79 + "<col=ffffff>";
				if (Static104.aString16 == null) {
					Static104.aString16 = "Null";
				}
			}
			return;
		}
		if (local21 == 1001) {
			Static499.anInt8329 = arg1;
			Static212.anInt4275 = 0;
			Static404.anInt7179 = arg2;
			Static445.anInt7719 = 2;
			local355 = (Class6_Sub34) Static593.aClass128_43.method3263((long) local25);
			if (local355 != null) {
				local370 = local355.aClass4_Sub1_Sub1_Sub1_2;
				@Pc(636) Class273 local636 = local370.aClass273_1;
				if (local636.anIntArray537 != null) {
					local636 = local636.method6159(Static498.aClass101_1);
				}
				if (local636 != null) {
					@Pc(655) Class6_Sub31 local655 = Static114.method2007(Static299.aClass47_88, Static337.aClass324_1);
					local655.aClass6_Sub21_Sub2_2.method6052(local636.anInt7462);
					Static534.method7251(local655);
				}
			}
		}
		if (local21 == 1011) {
			Static212.anInt4275 = 0;
			Static404.anInt7179 = arg2;
			Static499.anInt8329 = arg1;
			Static445.anInt7719 = 2;
			local54 = Static114.method2007(Static282.aClass47_84, Static337.aClass324_1);
			local54.aClass6_Sub21_Sub2_2.method6052(local25);
			Static534.method7251(local54);
		}
		if (local21 == 20) {
			Static499.anInt8329 = arg1;
			Static404.anInt7179 = arg2;
			Static445.anInt7719 = 2;
			Static212.anInt4275 = 0;
			local54 = Static114.method2007(Static357.aClass47_100, Static337.aClass324_1);
			local54.aClass6_Sub21_Sub2_2.method6037(Static138.anInt3088 + local18);
			local54.aClass6_Sub21_Sub2_2.method6024(Static365.aClass155_1.method4042(82) ? 1 : 0);
			local54.aClass6_Sub21_Sub2_2.method6023(local15 + Static39.anInt4952);
			local54.aClass6_Sub21_Sub2_2.method6037(Integer.MAX_VALUE & (int) (local32 >>> 32));
			Static534.method7251(local54);
			Static479.method6617(local32, local15, local18);
		}
		if (local21 == 60) {
			local574 = Static391.method5747(local18, local15);
			if (local574 != null) {
				Static186.method3402(local574);
			}
		}
		if (local21 == 21) {
			Static212.anInt4275 = 0;
			Static445.anInt7719 = 2;
			Static499.anInt8329 = arg1;
			Static404.anInt7179 = arg2;
			local54 = Static114.method2007(Static213.aClass47_135, Static337.aClass324_1);
			local54.aClass6_Sub21_Sub2_2.method6023(local25);
			local54.aClass6_Sub21_Sub2_2.method6037(Static138.anInt3088 + local18);
			local54.aClass6_Sub21_Sub2_2.method6024(Static365.aClass155_1.method4042(82) ? 1 : 0);
			local54.aClass6_Sub21_Sub2_2.method6052(local15 + Static39.anInt4952);
			Static534.method7251(local54);
			Static593.method7820(local18, local15);
		}
		if (local21 == 46) {
			Static404.anInt7179 = arg2;
			Static499.anInt8329 = arg1;
			Static212.anInt4275 = 0;
			Static445.anInt7719 = 2;
			local54 = Static114.method2007(Static515.aClass47_136, Static337.aClass324_1);
			local54.aClass6_Sub21_Sub2_2.method6039(local25);
			local54.aClass6_Sub21_Sub2_2.method6023(local18 + Static138.anInt3088);
			local54.aClass6_Sub21_Sub2_2.method6024(Static365.aClass155_1.method4042(82) ? 1 : 0);
			local54.aClass6_Sub21_Sub2_2.method6037(Static188.anInt3896);
			local54.aClass6_Sub21_Sub2_2.method6052(Static115.anInt2199);
			local54.aClass6_Sub21_Sub2_2.method6033(Static593.anInt9601);
			local54.aClass6_Sub21_Sub2_2.method6023(local15 + Static39.anInt4952);
			Static534.method7251(local54);
			Static593.method7820(local18, local15);
		}
		if (local21 == 44 && Static518.aClass292_13 == null) {
			Static534.method7249(local15, local18);
			Static518.aClass292_13 = Static391.method5747(local18, local15);
			Static464.method6502(Static518.aClass292_13);
		}
		if (local21 == 15) {
			Static212.anInt4275 = 0;
			Static404.anInt7179 = arg2;
			Static499.anInt8329 = arg1;
			Static445.anInt7719 = 2;
			local54 = Static114.method2007(Static111.aClass47_35, Static337.aClass324_1);
			local54.aClass6_Sub21_Sub2_2.method6023(local15 + Static39.anInt4952);
			local54.aClass6_Sub21_Sub2_2.method6052(Integer.MAX_VALUE & (int) (local32 >>> 32));
			local54.aClass6_Sub21_Sub2_2.method6024(Static365.aClass155_1.method4042(82) ? 1 : 0);
			local54.aClass6_Sub21_Sub2_2.method6039(local18 + Static138.anInt3088);
			Static534.method7251(local54);
			Static479.method6617(local32, local15, local18);
		}
		if (local21 == 19) {
			local71 = Static588.aClass4_Sub1_Sub1_Sub2Array3[local25];
			if (local71 != null) {
				Static212.anInt4275 = 0;
				Static404.anInt7179 = arg2;
				Static499.anInt8329 = arg1;
				Static445.anInt7719 = 2;
				local90 = Static114.method2007(Static186.aClass47_54, Static337.aClass324_1);
				local90.aClass6_Sub21_Sub2_2.method6062(Static365.aClass155_1.method4042(82) ? 1 : 0);
				local90.aClass6_Sub21_Sub2_2.method6052(local25);
				Static534.method7251(local90);
				Static32.method910(-2, true, local71.method5892(), local71.anIntArray521[0], 0, 0, local71.method5892(), local71.anIntArray522[0]);
			}
		}
		if (local21 == 17) {
			local71 = Static588.aClass4_Sub1_Sub1_Sub2Array3[local25];
			if (local71 != null) {
				Static212.anInt4275 = 0;
				Static404.anInt7179 = arg2;
				Static445.anInt7719 = 2;
				Static499.anInt8329 = arg1;
				local90 = Static114.method2007(Static22.aClass47_67, Static337.aClass324_1);
				local90.aClass6_Sub21_Sub2_2.method6015(Static365.aClass155_1.method4042(82) ? 1 : 0);
				local90.aClass6_Sub21_Sub2_2.method6037(local25);
				Static534.method7251(local90);
				Static32.method910(-2, true, local71.method5892(), local71.anIntArray521[0], 0, 0, local71.method5892(), local71.anIntArray522[0]);
			}
		}
		if (local21 == 22 || local21 == 1002) {
			Static182.method3323(local15, arg0.aString97, local25, local18);
		}
		if (local21 == 47) {
			local355 = (Class6_Sub34) Static593.aClass128_43.method3263((long) local25);
			if (local355 != null) {
				Static404.anInt7179 = arg2;
				Static445.anInt7719 = 2;
				Static212.anInt4275 = 0;
				local370 = local355.aClass4_Sub1_Sub1_Sub1_2;
				Static499.anInt8329 = arg1;
				local377 = Static114.method2007(Static57.aClass47_26, Static337.aClass324_1);
				local377.aClass6_Sub21_Sub2_2.method6052(local25);
				local377.aClass6_Sub21_Sub2_2.method6062(Static365.aClass155_1.method4042(82) ? 1 : 0);
				Static534.method7251(local377);
				Static32.method910(-2, true, local370.method5892(), local370.anIntArray521[0], 0, 0, local370.method5892(), local370.anIntArray522[0]);
			}
		}
		if (local21 == 57) {
			local71 = Static588.aClass4_Sub1_Sub1_Sub2Array3[local25];
			if (local71 != null) {
				Static404.anInt7179 = arg2;
				Static445.anInt7719 = 2;
				Static499.anInt8329 = arg1;
				Static212.anInt4275 = 0;
				local90 = Static114.method2007(Static256.aClass47_79, Static337.aClass324_1);
				local90.aClass6_Sub21_Sub2_2.method6052(Static188.anInt3896);
				local90.aClass6_Sub21_Sub2_2.method6045(Static593.anInt9601);
				local90.aClass6_Sub21_Sub2_2.method6025(Static365.aClass155_1.method4042(82) ? 1 : 0);
				local90.aClass6_Sub21_Sub2_2.method6023(local25);
				local90.aClass6_Sub21_Sub2_2.method6039(Static115.anInt2199);
				Static534.method7251(local90);
				Static32.method910(-2, true, local71.method5892(), local71.anIntArray521[0], 0, 0, local71.method5892(), local71.anIntArray522[0]);
			}
		}
		if (local21 == 23) {
			Static499.anInt8329 = arg1;
			Static212.anInt4275 = 0;
			Static404.anInt7179 = arg2;
			Static445.anInt7719 = 2;
			local54 = Static114.method2007(Static487.aClass47_126, Static337.aClass324_1);
			local54.aClass6_Sub21_Sub2_2.method6037(Static39.anInt4952 + local15);
			local54.aClass6_Sub21_Sub2_2.method6062(Static365.aClass155_1.method4042(82) ? 1 : 0);
			local54.aClass6_Sub21_Sub2_2.method6039((int) (local32 >>> 32) & Integer.MAX_VALUE);
			local54.aClass6_Sub21_Sub2_2.method6037(Static138.anInt3088 + local18);
			Static534.method7251(local54);
			Static479.method6617(local32, local15, local18);
		}
		if (local21 == 2) {
			local355 = (Class6_Sub34) Static593.aClass128_43.method3263((long) local25);
			if (local355 != null) {
				Static445.anInt7719 = 2;
				local370 = local355.aClass4_Sub1_Sub1_Sub1_2;
				Static404.anInt7179 = arg2;
				Static212.anInt4275 = 0;
				Static499.anInt8329 = arg1;
				local377 = Static114.method2007(Static130.aClass47_42, Static337.aClass324_1);
				local377.aClass6_Sub21_Sub2_2.method6024(Static365.aClass155_1.method4042(82) ? 1 : 0);
				local377.aClass6_Sub21_Sub2_2.method6052(local25);
				Static534.method7251(local377);
				Static32.method910(-2, true, local370.method5892(), local370.anIntArray521[0], 0, 0, local370.method5892(), local370.anIntArray522[0]);
			}
		}
		if (local21 == 48) {
			local71 = Static588.aClass4_Sub1_Sub1_Sub2Array3[local25];
			if (local71 != null) {
				Static404.anInt7179 = arg2;
				Static212.anInt4275 = 0;
				Static499.anInt8329 = arg1;
				Static445.anInt7719 = 2;
				local90 = Static114.method2007(Static121.aClass47_38, Static337.aClass324_1);
				local90.aClass6_Sub21_Sub2_2.method6052(local25);
				local90.aClass6_Sub21_Sub2_2.method6024(Static365.aClass155_1.method4042(82) ? 1 : 0);
				Static534.method7251(local90);
				Static32.method910(-2, true, local71.method5892(), local71.anIntArray521[0], 0, 0, local71.method5892(), local71.anIntArray522[0]);
			}
		}
		if (local21 == 1012 || local21 == 1010 || local21 == 1003 || local21 == 1008 || local21 == 1007) {
			Static122.method2523(local15, local25, local21);
		}
		if (local21 == 49) {
			Static212.anInt4275 = 0;
			Static445.anInt7719 = 2;
			Static404.anInt7179 = arg2;
			Static499.anInt8329 = arg1;
			local54 = Static114.method2007(Static63.aClass47_28, Static337.aClass324_1);
			local54.aClass6_Sub21_Sub2_2.method6015(Static365.aClass155_1.method4042(82) ? 1 : 0);
			local54.aClass6_Sub21_Sub2_2.method6037(local18 + Static138.anInt3088);
			local54.aClass6_Sub21_Sub2_2.method6023(Static39.anInt4952 + local15);
			local54.aClass6_Sub21_Sub2_2.method6023(local25);
			Static534.method7251(local54);
			Static593.method7820(local18, local15);
		}
		if (local21 == 8) {
			if (Static582.anInt9457 > 0 && Static365.aClass155_1.method4042(82) && Static365.aClass155_1.method4042(81)) {
				Static284.method4645(Static328.aClass4_Sub1_Sub1_Sub2_2.aByte108, local18 + Static138.anInt3088, local15 + Static39.anInt4952);
			} else {
				Static212.anInt4275 = 0;
				Static445.anInt7719 = 1;
				Static499.anInt8329 = arg1;
				Static404.anInt7179 = arg2;
				local54 = Static114.method2007(Static39.aClass47_78, Static337.aClass324_1);
				local54.aClass6_Sub21_Sub2_2.method6052(local18 + Static138.anInt3088);
				local54.aClass6_Sub21_Sub2_2.method6023(Static39.anInt4952 + local15);
				Static534.method7251(local54);
			}
		}
		if (local21 == 9) {
			if (Static582.anInt9457 > 0 && Static365.aClass155_1.method4042(82) && Static365.aClass155_1.method4042(81)) {
				Static284.method4645(Static328.aClass4_Sub1_Sub1_Sub2_2.aByte108, local18 + Static138.anInt3088, Static39.anInt4952 + local15);
			} else {
				local54 = Static163.method2978(local25, local15, local18);
				if (local25 == 1) {
					local54.aClass6_Sub21_Sub2_2.method6062(-1);
					local54.aClass6_Sub21_Sub2_2.method6062(-1);
					local54.aClass6_Sub21_Sub2_2.method6052((int) Static428.aFloat160);
					local54.aClass6_Sub21_Sub2_2.method6062(57);
					local54.aClass6_Sub21_Sub2_2.method6062(Static185.anInt3860);
					local54.aClass6_Sub21_Sub2_2.method6062(Static291.anInt5446);
					local54.aClass6_Sub21_Sub2_2.method6062(89);
					local54.aClass6_Sub21_Sub2_2.method6052(Static328.aClass4_Sub1_Sub1_Sub2_2.anInt9542);
					local54.aClass6_Sub21_Sub2_2.method6052(Static328.aClass4_Sub1_Sub1_Sub2_2.anInt9540);
					local54.aClass6_Sub21_Sub2_2.method6062(63);
				} else {
					Static404.anInt7179 = arg2;
					Static212.anInt4275 = 0;
					Static499.anInt8329 = arg1;
					Static445.anInt7719 = 1;
				}
				Static534.method7251(local54);
				Static32.method910(-4, true, 1, local15, 0, 0, 1, local18);
			}
		}
		if (local21 == 58) {
			local355 = (Class6_Sub34) Static593.aClass128_43.method3263((long) local25);
			if (local355 != null) {
				Static212.anInt4275 = 0;
				Static404.anInt7179 = arg2;
				local370 = local355.aClass4_Sub1_Sub1_Sub1_2;
				Static445.anInt7719 = 2;
				Static499.anInt8329 = arg1;
				local377 = Static114.method2007(Static552.aClass47_146, Static337.aClass324_1);
				local377.aClass6_Sub21_Sub2_2.method6037(local25);
				local377.aClass6_Sub21_Sub2_2.method6023(Static188.anInt3896);
				local377.aClass6_Sub21_Sub2_2.method6045(Static593.anInt9601);
				local377.aClass6_Sub21_Sub2_2.method6062(Static365.aClass155_1.method4042(82) ? 1 : 0);
				local377.aClass6_Sub21_Sub2_2.method6023(Static115.anInt2199);
				Static534.method7251(local377);
				Static32.method910(-2, true, local370.method5892(), local370.anIntArray521[0], 0, 0, local370.method5892(), local370.anIntArray522[0]);
			}
		}
		if (local21 == 16) {
			Static499.anInt8329 = arg1;
			Static212.anInt4275 = 0;
			Static445.anInt7719 = 2;
			Static404.anInt7179 = arg2;
			local54 = Static114.method2007(Static397.aClass47_109, Static337.aClass324_1);
			local54.aClass6_Sub21_Sub2_2.method6039(local25);
			local54.aClass6_Sub21_Sub2_2.method6052(Static39.anInt4952 + local15);
			local54.aClass6_Sub21_Sub2_2.method6052(Static138.anInt3088 + local18);
			local54.aClass6_Sub21_Sub2_2.method6062(Static365.aClass155_1.method4042(82) ? 1 : 0);
			Static534.method7251(local54);
			Static593.method7820(local18, local15);
		}
		if (local21 == 45) {
			Static445.anInt7719 = 1;
			Static212.anInt4275 = 0;
			Static404.anInt7179 = arg2;
			Static499.anInt8329 = arg1;
			local54 = Static114.method2007(Static308.aClass47_92, Static337.aClass324_1);
			local54.aClass6_Sub21_Sub2_2.method6039(Static115.anInt2199);
			local54.aClass6_Sub21_Sub2_2.method6023(Static138.anInt3088 + local18);
			local54.aClass6_Sub21_Sub2_2.method6037(Static188.anInt3896);
			local54.aClass6_Sub21_Sub2_2.method6033(Static593.anInt9601);
			local54.aClass6_Sub21_Sub2_2.method6039(Static39.anInt4952 + local15);
			Static534.method7251(local54);
			Static32.method910(-4, true, 1, local15, 0, 0, 1, local18);
		}
		if (local21 == 1004) {
			Static499.anInt8329 = arg1;
			Static212.anInt4275 = 0;
			Static404.anInt7179 = arg2;
			Static445.anInt7719 = 2;
			local54 = Static114.method2007(Static518.aClass47_137, Static337.aClass324_1);
			local54.aClass6_Sub21_Sub2_2.method6023(Integer.MAX_VALUE & (int) (local32 >>> 32));
			local54.aClass6_Sub21_Sub2_2.method6039(Static138.anInt3088 + local18);
			local54.aClass6_Sub21_Sub2_2.method6062(Static365.aClass155_1.method4042(82) ? 1 : 0);
			local54.aClass6_Sub21_Sub2_2.method6052(Static39.anInt4952 + local15);
			Static534.method7251(local54);
			Static479.method6617(local32, local15, local18);
		}
		if (local21 == 51) {
			local355 = (Class6_Sub34) Static593.aClass128_43.method3263((long) local25);
			if (local355 != null) {
				local370 = local355.aClass4_Sub1_Sub1_Sub1_2;
				Static212.anInt4275 = 0;
				Static404.anInt7179 = arg2;
				Static445.anInt7719 = 2;
				Static499.anInt8329 = arg1;
				local377 = Static114.method2007(Static377.aClass47_102, Static337.aClass324_1);
				local377.aClass6_Sub21_Sub2_2.method6039(local25);
				local377.aClass6_Sub21_Sub2_2.method6025(Static365.aClass155_1.method4042(82) ? 1 : 0);
				Static534.method7251(local377);
				Static32.method910(-2, true, local370.method5892(), local370.anIntArray521[0], 0, 0, local370.method5892(), local370.anIntArray522[0]);
			}
		}
		if (local21 == 12) {
			Static445.anInt7719 = 2;
			Static404.anInt7179 = arg2;
			Static499.anInt8329 = arg1;
			Static212.anInt4275 = 0;
			local54 = Static114.method2007(Static529.aClass47_71, Static337.aClass324_1);
			local54.aClass6_Sub21_Sub2_2.method6052(local25);
			local54.aClass6_Sub21_Sub2_2.method6052(local18 + Static138.anInt3088);
			local54.aClass6_Sub21_Sub2_2.method6015(Static365.aClass155_1.method4042(82) ? 1 : 0);
			local54.aClass6_Sub21_Sub2_2.method6037(Static39.anInt4952 + local15);
			Static534.method7251(local54);
			Static593.method7820(local18, local15);
		}
		if (local21 == 18) {
			Static445.anInt7719 = 2;
			Static404.anInt7179 = arg2;
			Static499.anInt8329 = arg1;
			Static212.anInt4275 = 0;
			local54 = Static114.method2007(Static538.aClass47_142, Static337.aClass324_1);
			local54.aClass6_Sub21_Sub2_2.method6052(local18 + Static138.anInt3088);
			local54.aClass6_Sub21_Sub2_2.method6037(local15 + Static39.anInt4952);
			local54.aClass6_Sub21_Sub2_2.method6025(Static365.aClass155_1.method4042(82) ? 1 : 0);
			local54.aClass6_Sub21_Sub2_2.method6039(local25);
			Static534.method7251(local54);
			Static593.method7820(local18, local15);
		}
		if (local21 == 6) {
			local71 = Static588.aClass4_Sub1_Sub1_Sub2Array3[local25];
			if (local71 != null) {
				Static499.anInt8329 = arg1;
				Static212.anInt4275 = 0;
				Static404.anInt7179 = arg2;
				Static445.anInt7719 = 2;
				local90 = Static114.method2007(Static69.aClass47_31, Static337.aClass324_1);
				local90.aClass6_Sub21_Sub2_2.method6023(local25);
				local90.aClass6_Sub21_Sub2_2.method6062(Static365.aClass155_1.method4042(82) ? 1 : 0);
				Static534.method7251(local90);
				Static32.method910(-2, true, local71.method5892(), local71.anIntArray521[0], 0, 0, local71.method5892(), local71.anIntArray522[0]);
			}
		}
		if (local21 == 10) {
			local71 = Static588.aClass4_Sub1_Sub1_Sub2Array3[local25];
			if (local71 != null) {
				Static499.anInt8329 = arg1;
				Static404.anInt7179 = arg2;
				Static445.anInt7719 = 2;
				Static212.anInt4275 = 0;
				local90 = Static114.method2007(Static43.aClass47_19, Static337.aClass324_1);
				local90.aClass6_Sub21_Sub2_2.method6037(local25);
				local90.aClass6_Sub21_Sub2_2.method6015(Static365.aClass155_1.method4042(82) ? 1 : 0);
				Static534.method7251(local90);
				Static32.method910(-2, true, local71.method5892(), local71.anIntArray521[0], 0, 0, local71.method5892(), local71.anIntArray522[0]);
			}
		}
		if (local21 == 59) {
			local71 = Static588.aClass4_Sub1_Sub1_Sub2Array3[local25];
			if (local71 != null) {
				Static404.anInt7179 = arg2;
				Static499.anInt8329 = arg1;
				Static212.anInt4275 = 0;
				Static445.anInt7719 = 2;
				local90 = Static114.method2007(Static14.aClass47_9, Static337.aClass324_1);
				local90.aClass6_Sub21_Sub2_2.method6062(Static365.aClass155_1.method4042(82) ? 1 : 0);
				local90.aClass6_Sub21_Sub2_2.method6052(local25);
				Static534.method7251(local90);
				Static32.method910(-2, true, local71.method5892(), local71.anIntArray521[0], 0, 0, local71.method5892(), local71.anIntArray522[0]);
			}
		}
		if (Static199.aBoolean458) {
			Static489.method6689();
		}
		if (Static25.aClass292_2 != null && Static155.anInt3339 == 0) {
			Static464.method6502(Static25.aClass292_2);
		}
	}
}
