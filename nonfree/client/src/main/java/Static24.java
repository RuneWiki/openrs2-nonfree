import java.awt.Dimension;
import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static24 {

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(I)V")
	public static void method589() {
		Static311.method4750(false);
		Static512.anInt8593 = 0;
		@Pc(12) boolean local12 = true;
		for (@Pc(14) int local14 = 0; local14 < Static501.aByteArrayArray20.length; local14++) {
			if (Static633.anIntArray729[local14] != -1 && Static501.aByteArrayArray20[local14] == null) {
				Static501.aByteArrayArray20[local14] = Static48.aClass97_6.method2545(0, Static633.anIntArray729[local14]);
				if (Static501.aByteArrayArray20[local14] == null) {
					local12 = false;
					Static512.anInt8593++;
				}
			}
			if (Static516.anIntArray595[local14] != -1 && Static478.aByteArrayArray18[local14] == null) {
				Static478.aByteArrayArray18[local14] = Static48.aClass97_6.method2565(Static516.anIntArray595[local14], Static564.anIntArrayArray73[local14], 0);
				if (Static478.aByteArrayArray18[local14] == null) {
					local12 = false;
					Static512.anInt8593++;
				}
			}
			if (Static440.anIntArray533[local14] != -1 && Static19.aByteArrayArray10[local14] == null) {
				Static19.aByteArrayArray10[local14] = Static48.aClass97_6.method2545(0, Static440.anIntArray533[local14]);
				if (Static19.aByteArrayArray10[local14] == null) {
					local12 = false;
					Static512.anInt8593++;
				}
			}
			if (Static502.anIntArray283[local14] != -1 && Static501.aByteArrayArray19[local14] == null) {
				Static501.aByteArrayArray19[local14] = Static48.aClass97_6.method2545(0, Static502.anIntArray283[local14]);
				if (Static501.aByteArrayArray19[local14] == null) {
					Static512.anInt8593++;
					local12 = false;
				}
			}
			if (Static350.anIntArray421 != null && Static237.aByteArrayArray12[local14] == null && Static350.anIntArray421[local14] != -1) {
				Static237.aByteArrayArray12[local14] = Static48.aClass97_6.method2565(Static350.anIntArray421[local14], Static564.anIntArrayArray73[local14], 0);
				if (Static237.aByteArrayArray12[local14] == null) {
					local12 = false;
					Static512.anInt8593++;
				}
			}
		}
		if (Static318.aClass313_2 == null) {
			if (Static103.aClass2_Sub5_Sub19_1 == null || !Static612.aClass97_149.method2555(Static103.aClass2_Sub5_Sub19_1.aString77 + "_staticelements")) {
				Static318.aClass313_2 = new Class313(0);
			} else if (Static612.aClass97_149.method2562(Static103.aClass2_Sub5_Sub19_1.aString77 + "_staticelements")) {
				Static318.aClass313_2 = Static231.method3866(Static259.aBoolean404, Static103.aClass2_Sub5_Sub19_1.aString77 + "_staticelements", Static612.aClass97_149);
			} else {
				local12 = false;
				Static512.anInt8593++;
			}
		}
		if (!local12) {
			Static219.anInt4548 = 1;
			return;
		}
		Static491.anInt8369 = 0;
		local12 = true;
		@Pc(267) int local267;
		@Pc(278) int local278;
		for (@Pc(248) int local248 = 0; local248 < Static501.aByteArrayArray20.length; local248++) {
			@Pc(254) byte[] local254 = Static478.aByteArrayArray18[local248];
			if (local254 != null) {
				local267 = (Static349.anIntArray395[local248] >> 8) * 64 - Static451.anInt7933;
				local278 = (Static349.anIntArray395[local248] & 0xFF) * 64 - Static470.anInt8063;
				if (Static462.anInt8018 != 0) {
					local278 = 10;
					local267 = 10;
				}
				local12 &= Static638.method6580(local254, Static3.anInt46, local267, Static270.anInt5194, local278);
			}
			local254 = Static501.aByteArrayArray19[local248];
			if (local254 != null) {
				local267 = (Static349.anIntArray395[local248] >> 8) * 64 - Static451.anInt7933;
				local278 = (Static349.anIntArray395[local248] & 0xFF) * 64 - Static470.anInt8063;
				if (Static462.anInt8018 != 0) {
					local267 = 10;
					local278 = 10;
				}
				local12 &= Static638.method6580(local254, Static3.anInt46, local267, Static270.anInt5194, local278);
			}
		}
		if (!local12) {
			Static219.anInt4548 = 2;
			return;
		}
		if (Static219.anInt4548 != 0) {
			Static86.method1555(Static600.aClass87_15, true, Static628.aClass369_12.method8475(Static377.anInt6756) + "<br>(100%)", Static428.aClass64_11, Static305.aClass114_29);
		}
		Static77.method1461();
		Static320.method4827();
		Static99.method1703();
		@Pc(375) boolean local375 = false;
		if (Static600.aClass87_15.method7962() && Static404.aClass2_Sub13_2.aClass33_Sub20_1.method6515() == 2) {
			for (local267 = 0; local267 < Static501.aByteArrayArray20.length; local267++) {
				if (Static501.aByteArrayArray19[local267] != null || Static19.aByteArrayArray10[local267] != null) {
					local375 = true;
					break;
				}
			}
		}
		if (Static404.aClass2_Sub13_2.aClass33_Sub13_1.method4689() == 1) {
			local267 = Static612.anIntArray696[Static526.anInt8766];
		} else {
			local267 = Static164.anIntArray259[Static526.anInt8766];
		}
		if (Static600.aClass87_15.method7915()) {
			local267++;
		}
		Static363.method5524(Static600.aClass87_15, Static509.anInt8575, Static3.anInt46, Static270.anInt5194, local267, local375, Static600.aClass87_15.method7953() > 0);
		Static362.method5521(Static226.anInt4631);
		if (Static226.anInt4631 == 0) {
			Static585.method8075(null);
		} else {
			Static585.method8075(Static573.aClass64_15);
		}
		for (local278 = 0; local278 < 4; local278++) {
			Static19.aClass179Array2[local278].method4349();
		}
		Static315.method5513();
		Static219.method3758(false);
		Static459.method7102();
		Static287.aBoolean411 = false;
		Static587.aClass17_1 = null;
		Static77.method1461();
		System.gc();
		Static311.method4750(true);
		Static194.method3444();
		Static324.anInt5883 = Static404.aClass2_Sub13_2.aClass33_Sub2_1.method1495();
		Static66.aBoolean115 = Static545.anInt9053 >= 96;
		Static347.aBoolean477 = Static404.aClass2_Sub13_2.aClass33_Sub20_1.method6515() == 2;
		Static223.aBoolean386 = Static404.aClass2_Sub13_2.aClass33_Sub28_1.method8390() == 1;
		Static446.anInt7903 = Static404.aClass2_Sub13_2.aClass33_Sub26_1.method8294() == 1 ? -1 : Static576.anInt9519;
		Static506.aBoolean634 = Static404.aClass2_Sub13_2.aClass33_Sub18_1.method6344() == 1;
		Static216.aBoolean377 = Static404.aClass2_Sub13_2.aClass33_Sub4_1.method1808() == 1;
		Static580.aClass45_Sub1_2 = new Class45_Sub1(4, Static3.anInt46, Static270.anInt5194, false);
		if (Static462.anInt8018 == 0) {
			Static584.method8058(Static501.aByteArrayArray20, Static580.aClass45_Sub1_2);
		} else {
			Static303.method4691(Static580.aClass45_Sub1_2, Static501.aByteArrayArray20);
		}
		Static608.method2874(Static270.anInt5194 >> 4, Static3.anInt46 >> 4);
		Static569.method7833();
		if (local375) {
			Static364.method5552(true);
			Static515.aClass45_Sub1_1 = new Class45_Sub1(1, Static3.anInt46, Static270.anInt5194, true);
			if (Static462.anInt8018 == 0) {
				Static584.method8058(Static19.aByteArrayArray10, Static515.aClass45_Sub1_1);
				Static311.method4750(true);
			} else {
				Static303.method4691(Static515.aClass45_Sub1_1, Static19.aByteArrayArray10);
				Static311.method4750(true);
			}
			Static515.aClass45_Sub1_1.method8520(Static580.aClass45_Sub1_2.anIntArrayArrayArray22[0]);
			Static515.aClass45_Sub1_1.method8518(null, null, Static600.aClass87_15);
			Static364.method5552(false);
		}
		Static580.aClass45_Sub1_2.method8518(local375 ? Static515.aClass45_Sub1_1.anIntArrayArrayArray22 : null, Static19.aClass179Array2, Static600.aClass87_15);
		if (Static462.anInt8018 == 0) {
			Static311.method4750(true);
			Static210.method3645(Static478.aByteArrayArray18, Static580.aClass45_Sub1_2);
			if (Static237.aByteArrayArray12 != null) {
				Static512.method7215();
			}
		} else {
			Static311.method4750(true);
			Static295.method4633(Static580.aClass45_Sub1_2, Static478.aByteArrayArray18);
		}
		Static320.method4827();
		if (Static545.anInt9053 < 96) {
			Static184.method3328();
		}
		Static311.method4750(true);
		Static580.aClass45_Sub1_2.method8527(null, Static600.aClass87_15, local375 ? Static164.aClass112Array1[0] : null);
		Static580.aClass45_Sub1_2.method8537(false, Static600.aClass87_15);
		Static311.method4750(true);
		if (local375) {
			Static364.method5552(true);
			Static311.method4750(true);
			if (Static462.anInt8018 == 0) {
				Static210.method3645(Static501.aByteArrayArray19, Static515.aClass45_Sub1_1);
			} else {
				Static295.method4633(Static515.aClass45_Sub1_1, Static501.aByteArrayArray19);
			}
			Static320.method4827();
			Static311.method4750(true);
			Static515.aClass45_Sub1_1.method8527(Static178.aClass112Array2[0], Static600.aClass87_15, null);
			Static515.aClass45_Sub1_1.method8537(true, Static600.aClass87_15);
			Static311.method4750(true);
			Static364.method5552(false);
		}
		Static125.method2513();
		@Pc(766) int local766 = Static580.aClass45_Sub1_2.anInt10216;
		if (Static16.anInt308 < local766) {
			local766 = Static16.anInt308;
		}
		if (Static16.anInt308 - 1 > local766) {
			local766 = Static16.anInt308 - 1;
		}
		if (Static404.aClass2_Sub13_2.aClass33_Sub26_1.method8294() == 0) {
			Static306.method4187(local766);
		} else {
			Static306.method4187(0);
		}
		@Pc(804) int local804;
		@Pc(808) int local808;
		for (@Pc(800) int local800 = 0; local800 < 4; local800++) {
			for (local804 = 0; local804 < Static3.anInt46; local804++) {
				for (local808 = 0; local808 < Static270.anInt5194; local808++) {
					Static228.method3855(local800, local804, local808);
				}
			}
		}
		Static331.method4926();
		Static77.method1461();
		Static155.method2926();
		Static320.method4827();
		Static569.method7836();
		@Pc(857) Class2_Sub50 local857;
		if (Static503.aFrame3 != null && Static439.aClass210_1 != null && Static538.anInt8985 == 11) {
			local857 = Static595.method8194(Static610.aClass310_2, Static195.aClass269_91);
			local857.aClass2_Sub34_Sub2_2.method6864(1057001181);
			Static311.method4754(local857);
		}
		if (Static462.anInt8018 == 0) {
			local804 = (Static415.anInt7580 - (Static3.anInt46 >> 4)) / 8;
			local808 = (Static415.anInt7580 + (Static3.anInt46 >> 4)) / 8;
			@Pc(896) int local896 = (Static127.anInt2955 - (Static270.anInt5194 >> 4)) / 8;
			@Pc(904) int local904 = ((Static270.anInt5194 >> 4) + Static127.anInt2955) / 8;
			for (@Pc(908) int local908 = local804 - 1; local908 <= local808 + 1; local908++) {
				for (@Pc(914) int local914 = local896 - 1; local914 <= local904 + 1; local914++) {
					if (local804 > local908 || local908 > local808 || local914 < local896 || local904 < local914) {
						Static48.aClass97_6.method2544("m" + local908 + "_" + local914);
						Static48.aClass97_6.method2544("l" + local908 + "_" + local914);
					}
				}
			}
		}
		if (Static538.anInt8985 == 4) {
			Static51.method997(3);
		} else if (Static538.anInt8985 == 8) {
			Static51.method997(7);
		} else {
			Static51.method997(10);
			if (Static439.aClass210_1 != null) {
				local857 = Static595.method8194(Static610.aClass310_2, Static35.aClass269_7);
				Static311.method4754(local857);
			}
		}
		Static270.method4338();
		Static77.method1461();
		Static352.method5456();
		Static445.aBoolean594 = true;
		if (Static287.aBoolean412) {
			Static576.method8008("Took: " + (Static438.method6517() - Static186.aLong109) + "ms");
			Static287.aBoolean412 = false;
		}
	}

	@OriginalMember(owner = "client!as", name = "b", descriptor = "(I)V")
	public static void method590() {
		if (Static600.aClass87_15.method7958()) {
			Static600.aClass87_15.method7946(Static147.aCanvas5);
			Static619.method8429();
			if (Static558.aBoolean680) {
				Static448.method6636(Static147.aCanvas5);
			} else {
				@Pc(26) Dimension local26 = Static147.aCanvas5.getSize();
				Static600.aClass87_15.method7974(Static147.aCanvas5, local26.width, local26.height);
			}
			Static600.aClass87_15.method7891(Static147.aCanvas5);
		} else {
			Static352.method5455(false, Static404.aClass2_Sub13_2.aClass33_Sub24_1.method7329());
		}
		Static539.method7534();
		Static445.aBoolean594 = true;
	}

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(IIIIIIIIIZ)V")
	public static void method591(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5, @OriginalArg(8) int arg6) {
		if (arg3 < 512 || arg4 < 512 || Static3.anInt46 * 512 - 1024 < arg3 || arg4 > Static270.anInt5194 * 512 - 1024) {
			Static269.anIntArray354[0] = Static269.anIntArray354[1] = -1;
			return;
		}
		@Pc(53) int local53 = Static582.method8038(arg5, arg3, arg4) - arg2;
		if (Static558.aBoolean680) {
			Static439.method6541(true);
		} else {
			Static386.aClass6_27.method6694(arg1, 0, 0);
			Static600.aClass87_15.method7896(Static386.aClass6_27);
		}
		if (Static172.aBoolean322) {
			Static600.aClass87_15.HA(arg3, local53, arg4, Static388.anInt6979, Static269.anIntArray354);
		} else {
			Static600.aClass87_15.da(arg3, local53, arg4, Static269.anIntArray354);
		}
		if (Static558.aBoolean680) {
			Static295.method4627();
		} else {
			Static386.aClass6_27.method6694(-arg1, 0, 0);
			Static600.aClass87_15.method7896(Static386.aClass6_27);
		}
	}

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(IIIIIII)Z")
	public static boolean method592(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(7) int local7 = arg3 + arg1;
		@Pc(11) int local11 = arg5 + arg2;
		@Pc(23) int local23 = arg4 + arg0;
		if (!Static99.method1690(local23, local23, local7, local11, arg4, local11, arg1, arg1, local11)) {
			return false;
		} else if (Static99.method1690(arg4, local23, local7, local11, arg4, local11, local7, arg1, local11)) {
			if (Static60.anInt1260 <= arg1) {
				if (!Static99.method1690(arg4, local23, local7, local11, local23, local11, local7, local7, arg2)) {
					return false;
				}
				if (!Static99.method1690(arg4, arg4, local7, local11, local23, arg2, local7, local7, arg2)) {
					return false;
				}
			} else if (!Static99.method1690(arg4, local23, arg1, local11, local23, local11, arg1, arg1, arg2)) {
				return false;
			} else if (!Static99.method1690(arg4, arg4, arg1, local11, local23, arg2, arg1, arg1, arg2)) {
				return false;
			}
			if (Static558.anInt9264 <= arg4) {
				if (!Static99.method1690(local23, local23, local7, local11, local23, local11, arg1, arg1, arg2)) {
					return false;
				}
				if (!Static99.method1690(local23, local23, local7, local11, local23, arg2, local7, arg1, arg2)) {
					return false;
				}
			} else if (!Static99.method1690(arg4, arg4, local7, local11, arg4, local11, arg1, arg1, arg2)) {
				return false;
			} else if (!Static99.method1690(arg4, arg4, local7, local11, arg4, arg2, local7, arg1, arg2)) {
				return false;
			}
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(ILjava/net/Socket;I)Lclient!ma;")
	public static Class210 method593(@OriginalArg(1) Socket arg0) throws IOException {
		return new Class210_Sub1(arg0, 7500);
	}
}
