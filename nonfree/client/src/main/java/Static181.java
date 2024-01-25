import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static181 {

	@OriginalMember(owner = "client!gq", name = "w", descriptor = "I")
	public static int anInt3476;

	@OriginalMember(owner = "client!gq", name = "x", descriptor = "I")
	public static int anInt3477;

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "(Lclient!oa;IIILclient!vu;Lclient!jd;)Z")
	public static boolean method3010(@OriginalArg(0) Class90 arg0, @OriginalArg(4) Class336 arg1, @OriginalArg(5) Class6_Sub22 arg2) {
		@Pc(7) int local7 = Integer.MAX_VALUE;
		@Pc(9) int local9 = Integer.MIN_VALUE;
		@Pc(11) int local11 = Integer.MAX_VALUE;
		@Pc(13) int local13 = Integer.MIN_VALUE;
		if (arg1.anIntArray708 != null) {
			local9 = (Static490.anInt1921 - Static490.anInt1912) * (arg2.anInt4395 + arg1.anInt9753 - Static490.anInt1915) / (Static490.anInt1914 - Static490.anInt1915) + Static490.anInt1912;
			local7 = (arg2.anInt4395 + arg1.anInt9757 - Static490.anInt1915) * (Static490.anInt1921 - Static490.anInt1912) / (Static490.anInt1914 - Static490.anInt1915) + Static490.anInt1912;
			local11 = Static490.anInt1920 - (Static490.anInt1920 - Static490.anInt1916) * (arg1.anInt9745 + arg2.anInt4398 - Static490.anInt1923) / (Static490.anInt1913 - Static490.anInt1923);
			local13 = Static490.anInt1920 - (arg2.anInt4398 + arg1.anInt9767 - Static490.anInt1923) * (Static490.anInt1920 - Static490.anInt1916) / (Static490.anInt1913 - Static490.anInt1923);
		}
		@Pc(99) Class71 local99 = null;
		@Pc(101) int local101 = 0;
		@Pc(103) int local103 = 0;
		@Pc(105) int local105 = 0;
		@Pc(107) int local107 = 0;
		if (arg1.anInt9766 != -1) {
			if (arg2.aBoolean323 && arg1.anInt9754 != -1) {
				local99 = arg1.method7788(true, arg0);
			} else {
				local99 = arg1.method7788(false, arg0);
			}
			if (local99 != null) {
				local101 = arg2.anInt4397 - (local99.AA() + 1 >> 1);
				if (local101 < local7) {
					local7 = local101;
				}
				local103 = arg2.anInt4397 + (local99.AA() + 1 >> 1);
				local105 = arg2.anInt4394 - (local99.a() + 1 >> 1);
				if (local103 > local9) {
					local9 = local103;
				}
				if (local105 < local11) {
					local11 = local105;
				}
				local107 = arg2.anInt4394 + (local99.a() + 1 >> 1);
				if (local13 < local107) {
					local13 = local107;
				}
			}
		}
		@Pc(209) Class329 local209 = null;
		@Pc(211) int local211 = 0;
		@Pc(213) int local213 = 0;
		@Pc(215) int local215 = 0;
		@Pc(217) int local217 = 0;
		@Pc(219) int local219 = 0;
		@Pc(221) int local221 = 0;
		@Pc(223) int local223 = 0;
		@Pc(272) int local272;
		@Pc(295) int local295;
		if (arg1.aString89 != null) {
			local209 = Static469.method6539(arg1.anInt9762);
			if (local209 != null) {
				local211 = Static557.aClass202_14.method4975(Static12.aStringArray1, arg1.aString89, null, null);
				local213 = arg2.anInt4394;
				if (local99 == null) {
					local213 -= local209.method7441() * local211 / 2;
				} else {
					local213 -= (local99.a() >> 1) + local211 * local209.method7445();
				}
				for (local272 = 0; local272 < local211; local272++) {
					@Pc(278) String local278 = Static12.aStringArray1[local272];
					if (local272 < local211 - 1) {
						local278 = local278.substring(0, local278.length() - 4);
					}
					local295 = local209.method7447(local278);
					if (local215 < local295) {
						local215 = local295;
					}
				}
				local217 = arg2.anInt4397 - local215 / 2;
				local219 = arg2.anInt4397 + local215 / 2;
				if (local7 > local217) {
					local7 = local217;
				}
				local221 = local213;
				if (local219 > local9) {
					local9 = local219;
				}
				if (local221 < local11) {
					local11 = local221;
				}
				local223 = local209.method7445() * local211 + local213;
				if (local13 < local223) {
					local13 = local223;
				}
			}
		}
		if (local9 < Static490.anInt1912 || local7 > Static490.anInt1921 || local13 < Static490.anInt1916 || Static490.anInt1920 < local11) {
			return true;
		}
		@Pc(403) int local403;
		if (arg1.anIntArray708 != null) {
			@Pc(401) int[] local401 = new int[arg1.anIntArray708.length];
			for (local403 = 0; local403 < local401.length / 2; local403++) {
				local295 = arg1.anIntArray708[local403 * 2] + arg2.anInt4395;
				@Pc(429) int local429 = arg1.anIntArray708[local403 * 2 + 1] + arg2.anInt4398;
				local401[local403 * 2] = (Static490.anInt1921 - Static490.anInt1912) * (-Static490.anInt1915 + local295) / (Static490.anInt1914 - Static490.anInt1915) + Static490.anInt1912;
				local401[local403 * 2 + 1] = Static490.anInt1920 - (local429 - Static490.anInt1923) * (Static490.anInt1920 - Static490.anInt1916) / (Static490.anInt1913 - Static490.anInt1923);
			}
			Static579.method7904(arg0, local401, arg1.anInt9771);
			for (local295 = 0; local295 < local401.length / 2 - 1; local295++) {
				arg0.method7481(local401[(local295 + 1) * 2], arg1.anInt9776, local401[local295 * 2], local401[local295 * 2 + 1], local401[local295 * 2 + 1 + 2]);
			}
			arg0.method7481(local401[0], arg1.anInt9776, local401[local401.length - 2], local401[local401.length - 1], local401[1]);
		}
		if (local99 != null) {
			if (Static49.anInt883 > 0 && (Static50.anInt8645 != -1 && Static50.anInt8645 == arg2.anInt4399 || Static119.anInt7220 != -1 && arg1.anInt9756 == Static119.anInt7220)) {
				if (Static190.anInt7946 <= 50) {
					local272 = Static190.anInt7946 * 2;
				} else {
					local272 = 200 - Static190.anInt7946 * 2;
				}
				local403 = local272 << 24 | 0xFFFF00;
				arg0.method7490(arg2.anInt4397, arg2.anInt4394, local99.QA() / 2 + 7, local403);
				arg0.method7490(arg2.anInt4397, arg2.anInt4394, local99.QA() / 2 + 5, local403);
				arg0.method7490(arg2.anInt4397, arg2.anInt4394, local99.QA() / 2 + 3, local403);
				arg0.method7490(arg2.anInt4397, arg2.anInt4394, local99.QA() / 2 + 1, local403);
				arg0.method7490(arg2.anInt4397, arg2.anInt4394, local99.QA() / 2, local403);
			}
			local99.method7775(arg2.anInt4397 - (local99.AA() >> 1), arg2.anInt4394 + -(local99.a() >> 1));
		}
		if (arg1.aString89 != null && local209 != null) {
			Static452.method6339(local211, local213, local209, arg2, arg1, local215, arg0);
		}
		if (arg1.anInt9766 != -1 || arg1.aString89 != null) {
			@Pc(723) Class6_Sub38 local723 = new Class6_Sub38(arg2);
			local723.anInt7282 = local105;
			local723.anInt7284 = local223;
			local723.anInt7289 = local219;
			local723.anInt7291 = local101;
			local723.anInt7287 = local103;
			local723.anInt7293 = local107;
			local723.anInt7292 = local217;
			local723.anInt7285 = local221;
			Static288.aClass298_170.method6812(local723);
		}
		return false;
	}

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "(I)I")
	public static int method3011() {
		@Pc(6) int local6;
		if (!Static58.aClass6_Sub17_Sub1_1.aBoolean597) {
			for (local6 = 0; local6 < Static459.anInt8079; local6++) {
				if (Static80.anInterface5Array1[local6].method6890() == 's' || Static80.anInterface5Array1[local6].method6890() == 'S') {
					Static58.aClass6_Sub17_Sub1_1.aBoolean597 = true;
					break;
				}
			}
		}
		@Pc(61) int local61;
		if (Static312.aClass22_32 == Static26.aClass22_1) {
			@Pc(51) Runtime local51 = Runtime.getRuntime();
			local61 = (int) ((local51.totalMemory() - local51.freeMemory()) / 1024L);
			@Pc(64) long local64 = Static416.method5922();
			if (Static315.aLong142 == 0L) {
				Static315.aLong142 = local64;
			}
			if (local61 > 16384 && local64 - Static315.aLong142 < 5000L) {
				if (local64 - Static82.aLong26 > 1000L) {
					System.gc();
					Static82.aLong26 = local64;
				}
				return 0;
			}
		}
		if (Static26.aClass22_2 == Static312.aClass22_32) {
			if (Static452.aClass54_1 == null) {
				Static452.aClass54_1 = new Class54(Static469.aClass180_3, Static468.aClass219_3, Static209.aBigInteger4, Static282.aBigInteger5);
			}
			if (!Static452.aClass54_1.method986()) {
				return 0;
			}
			Static202.method3338(0, false);
			Static217.aClass248_32 = Static429.method6104(true, 32, false);
			Static409.aClass248_77 = Static429.method6104(true, 33, false);
			Static550.aClass248_107 = Static429.method6104(true, 13, false);
		}
		if (Static26.aClass22_3 == Static312.aClass22_32) {
			Static409.aClass248_77.method5781();
			local6 = Static355.aClass58_Sub1Array2[33].method1069();
			local6 += Static355.aClass58_Sub1Array2[32].method1069();
			local6 += Static355.aClass58_Sub1Array2[13].method1069();
			local6 += Static409.aClass248_77.method5792();
			if (local6 != 400) {
				return local6 / 4;
			}
			Static138.anInt3428 = Static217.aClass248_32.method5801();
			Static249.anInt4575 = Static409.aClass248_77.method5801();
			Static280.method4222(Static217.aClass248_32);
			local61 = Static58.aClass6_Sub17_Sub1_1.anInt9270;
			Static522.aClass293_1 = new Class293(Static172.aClass68_4, Static188.anInt28, Static409.aClass248_77);
			@Pc(211) int[] local211 = Static522.aClass293_1.method6558(local61);
			@Pc(216) Class203 local216 = new Class203(Static217.aClass248_32);
			if (local211.length > 0) {
				Static309.anInterface6Array1 = new Interface6[local211.length];
				for (@Pc(225) int local225 = 0; local225 < Static309.anInterface6Array1.length; local225++) {
					Static309.anInterface6Array1[local225] = new Class162(Static522.aClass293_1.method6563(local211[local225]), local216);
				}
			}
		}
		if (Static312.aClass22_32 == Static26.aClass22_4) {
			Static454.method6350(Static550.aClass248_107, Static371.method6441(), Static217.aClass248_32);
		}
		if (Static312.aClass22_32 == Static26.aClass22_5) {
			local6 = Static415.method5917();
			local61 = Static288.method6401();
			if (local6 < local61) {
				return local6 * 100 / local61;
			}
		}
		if (Static312.aClass22_32 == Static26.aClass22_6) {
			Static462.method6471(Static554.aClass90_12);
			Static517.method7069(Static554.aClass90_12);
			Static436.method6188(1);
		}
		if (Static312.aClass22_32 == Static26.aClass22_7) {
			for (local6 = 0; local6 < 4; local6++) {
				Static30.aClass138Array1[local6] = Static250.method3897(Static18.anInt5706, Static80.anInt1367);
			}
		}
		if (Static312.aClass22_32 == Static26.aClass22_8) {
			Static114.aClass248_20 = Static429.method6104(true, 8, false);
			Static186.aClass248_28 = Static429.method6104(true, 0, false);
			Static194.aClass248_30 = Static429.method6104(true, 1, false);
			Static265.aClass248_37 = Static429.method6104(true, 2, false);
			Static532.aClass248_103 = Static429.method6104(true, 3, false);
			Static492.aClass248_96 = Static429.method6104(true, 4, false);
			Static88.aClass248_15 = Static429.method6104(true, 5, true);
			Static262.aClass248_36 = Static429.method6104(false, 6, true);
			Static509.aClass248_75 = Static429.method6104(true, 7, false);
			Static182.aClass248_25 = Static429.method6104(true, 9, false);
			Static333.aClass248_54 = Static429.method6104(true, 10, false);
			Static63.aClass248_11 = Static429.method6104(true, 11, false);
			Static63.aClass248_10 = Static429.method6104(true, 12, false);
			Static35.aClass248_8 = Static429.method6104(false, 14, false);
			Static460.aClass248_89 = Static429.method6104(true, 15, false);
			Static274.aClass248_41 = Static429.method6104(true, 16, false);
			Static282.aClass248_43 = Static429.method6104(true, 17, false);
			Static107.aClass248_16 = Static429.method6104(true, 18, false);
			Static572.aClass248_109 = Static429.method6104(true, 19, false);
			Static535.aClass248_105 = Static429.method6104(true, 20, false);
			Static364.aClass248_63 = Static429.method6104(true, 21, false);
			Static277.aClass248_42 = Static429.method6104(true, 22, false);
			Static302.aClass248_45 = Static429.method6104(true, 23, true);
			Static295.aClass248_44 = Static429.method6104(true, 24, false);
			Static483.aClass248_94 = Static429.method6104(true, 25, false);
			Static557.aClass248_108 = Static429.method6104(true, 26, true);
			Static259.aClass248_35 = Static429.method6104(true, 27, false);
			Static134.aClass248_83 = Static429.method6104(true, 28, true);
			Static440.aClass248_84 = Static429.method6104(true, 29, false);
			Static482.aClass248_93 = Static429.method6104(true, 30, true);
			Static347.aClass248_58 = Static429.method6104(true, 31, true);
		}
		if (Static312.aClass22_32 == Static26.aClass22_9) {
			local6 = 0;
			for (local61 = 0; local61 < 34; local61++) {
				local6 += Static355.aClass58_Sub1Array2[local61].method1069() * Static367.anIntArray471[local61] / 100;
			}
			if (local6 != 100) {
				return local6;
			}
			Static140.method2334(Static114.aClass248_20);
			Static454.method6350(Static550.aClass248_107, Static371.method6441(), Static114.aClass248_20);
		}
		if (Static312.aClass22_32 == Static26.aClass22_10) {
			Static130.method2062();
			Static436.method6188(2);
		}
		if (Static312.aClass22_32 == Static26.aClass22_11) {
			Static329.method5062(Static482.aClass248_93, Static174.aClass313_24);
		}
		if (Static26.aClass22_12 == Static312.aClass22_32) {
			if (!Static134.aClass248_83.method5781()) {
				return Static134.aClass248_83.method5792();
			}
			Static171.method7161(Static134.aClass248_83.method5795(1));
			Static428.method6090(Static134.aClass248_83.method5795(3));
			if (Static417.anInt7443 != -1 && !Static509.aClass248_75.method5788(0, Static417.anInt7443)) {
				return 99;
			}
		}
		if (Static312.aClass22_32 == Static26.aClass22_13) {
			local6 = Static5.method78("jaggl");
			if (local6 >= 0 && local6 < 100) {
				return local6;
			}
		}
		if (Static312.aClass22_32 == Static26.aClass22_14) {
			local6 = Static5.method78("jagdx");
			if (local6 >= 0 && local6 < 100) {
				return local6;
			}
		}
		if (Static26.aClass22_15 == Static312.aClass22_32) {
			local6 = Static5.method78("jagmisc");
			if (local6 >= 0 && local6 < 100) {
				return local6;
			}
			if (local6 == 100) {
				Static536.aClient1.method1025();
			}
		}
		if (Static312.aClass22_32 == Static26.aClass22_16) {
			local6 = Static5.method78("sw3d");
			if (local6 >= 0 && local6 < 100) {
				return local6;
			}
		}
		if (Static26.aClass22_17 == Static312.aClass22_32) {
			local6 = Static5.method78("jaclib");
			if (local6 >= 0 && local6 < 100) {
				return local6;
			}
			if (local6 == 100) {
				Static536.aClient1.method1017();
			}
		}
		if (Static312.aClass22_32 == Static26.aClass22_18) {
			local6 = Static5.method78("hw3d");
			if (local6 >= 0 && local6 < 100) {
				return local6;
			}
		}
		if (Static312.aClass22_32 == Static26.aClass22_19 && !Static347.aClass248_58.method5781()) {
			return 0;
		}
		if (Static26.aClass22_20 == Static312.aClass22_32) {
			if (!Static557.aClass248_108.method5781()) {
				return Static557.aClass248_108.method5792();
			}
			Static214.anInterface2_13 = new Class121(Static557.aClass248_108, Static182.aClass248_25, Static114.aClass248_20);
		}
		if (Static26.aClass22_21 == Static312.aClass22_32) {
			Static265.aClass248_37.method5781();
			local6 = Static265.aClass248_37.method5792();
			Static274.aClass248_41.method5781();
			local6 += Static274.aClass248_41.method5792();
			Static282.aClass248_43.method5781();
			local6 += Static282.aClass248_43.method5792();
			Static107.aClass248_16.method5781();
			local6 += Static107.aClass248_16.method5792();
			Static572.aClass248_109.method5781();
			local6 += Static572.aClass248_109.method5792();
			Static535.aClass248_105.method5781();
			local6 += Static535.aClass248_105.method5792();
			Static364.aClass248_63.method5781();
			local6 += Static364.aClass248_63.method5792();
			Static277.aClass248_42.method5781();
			local6 += Static277.aClass248_42.method5792();
			Static295.aClass248_44.method5781();
			local6 += Static295.aClass248_44.method5792();
			Static483.aClass248_94.method5781();
			local6 += Static483.aClass248_94.method5792();
			Static259.aClass248_35.method5781();
			local6 += Static259.aClass248_35.method5792();
			Static440.aClass248_84.method5781();
			local6 += Static440.aClass248_84.method5792();
			if (local6 < 1200) {
				return local6 / 12;
			}
			Static111.aClass259_1 = new Class259(Static172.aClass68_4, Static188.anInt28, Static265.aClass248_37);
			Static81.aClass12_1 = new Class12(Static172.aClass68_4, Static188.anInt28, Static265.aClass248_37);
			Static108.aClass249_2 = new Class249(Static172.aClass68_4, Static188.anInt28, Static265.aClass248_37, Static114.aClass248_20);
			Static86.aClass94_7 = new Class94(Static172.aClass68_4, Static188.anInt28, Static282.aClass248_43);
			Static457.aClass7_6 = new Class7(Static172.aClass68_4, Static188.anInt28, Static265.aClass248_37);
			Static429.aClass41_5 = new Class41(Static172.aClass68_4, Static188.anInt28, Static265.aClass248_37);
			Static518.aClass242_2 = new Class242(Static172.aClass68_4, Static188.anInt28, Static265.aClass248_37, Static509.aClass248_75);
			Static410.aClass21_1 = new Class21(Static172.aClass68_4, Static188.anInt28, Static265.aClass248_37);
			Static498.aClass271_1 = new Class271(Static172.aClass68_4, Static188.anInt28, Static265.aClass248_37);
			Static85.aClass27_1 = new Class27(Static172.aClass68_4, Static188.anInt28, true, Static274.aClass248_41, Static509.aClass248_75);
			Static358.aClass320_3 = new Class320(Static172.aClass68_4, Static188.anInt28, Static265.aClass248_37, Static114.aClass248_20);
			Static242.aClass274_3 = new Class274(Static172.aClass68_4, Static188.anInt28, Static265.aClass248_37, Static114.aClass248_20);
			Static119.aClass226_4 = new Class226(Static172.aClass68_4, Static188.anInt28, true, Static107.aClass248_16, Static509.aClass248_75);
			Static119.aClass244_4 = new Class244(Static172.aClass68_4, Static188.anInt28, true, Static111.aClass259_1, Static572.aClass248_109, Static509.aClass248_75);
			Static497.aClass309_1 = new Class309(Static172.aClass68_4, Static188.anInt28, Static265.aClass248_37);
			Static388.aClass324_2 = new Class324(Static172.aClass68_4, Static188.anInt28, Static535.aClass248_105, Static186.aClass248_28, Static194.aClass248_30);
			Static57.aClass14_1 = new Class14(Static172.aClass68_4, Static188.anInt28, Static265.aClass248_37);
			Static376.aClass116_1 = new Class116(Static172.aClass68_4, Static188.anInt28, Static265.aClass248_37);
			Static475.aClass291_2 = new Class291(Static172.aClass68_4, Static188.anInt28, Static364.aClass248_63, Static509.aClass248_75);
			Static22.aClass350_1 = new Class350(Static172.aClass68_4, Static188.anInt28, Static265.aClass248_37);
			Static496.aClass307_2 = new Class307(Static172.aClass68_4, Static188.anInt28, Static265.aClass248_37);
			Static506.aClass174_2 = new Class174(Static172.aClass68_4, Static188.anInt28, Static265.aClass248_37);
			Static344.aClass173_1 = new Class173(Static172.aClass68_4, Static188.anInt28, Static277.aClass248_42);
			Static382.aClass78_1 = new Class78(Static172.aClass68_4, Static188.anInt28, Static265.aClass248_37);
			Static1.method55(Static114.aClass248_20, Static550.aClass248_107, Static509.aClass248_75, Static532.aClass248_103);
			Static365.method5402(Static440.aClass248_84);
			Static73.aClass209_1 = new Class209(Static188.anInt28, Static295.aClass248_44, Static483.aClass248_94);
			Static186.aClass266_1 = new Class266(Static188.anInt28, Static295.aClass248_44, Static483.aClass248_94, new Class194());
			Static70.method980();
			Static85.aClass27_1.method518(!Static58.aClass6_Sub17_Sub1_1.method7353(Static79.anInt2700));
			Static65.aClass51_1 = new Class51();
			Static28.method407();
			Static44.method720(Static259.aClass248_35);
			Static8.method101(Static509.aClass248_75, Static214.anInterface2_13);
		}
		if (Static26.aClass22_22 == Static312.aClass22_32) {
			local6 = Static367.method5428(Static114.aClass248_20) + Static50.method6874(true);
			local61 = Static532.method7258() + Static288.method6401();
			if (local61 > local6) {
				return local6 * 100 / local61;
			}
		}
		if (Static312.aClass22_32 == Static26.aClass22_23) {
			if (!Static333.aClass248_54.method5773("huffman", "")) {
				return 0;
			}
			@Pc(1178) Class301 local1178 = new Class301(Static333.aClass248_54.method5794("", "huffman"));
			Static189.method3218(local1178);
		}
		if (Static26.aClass22_24 == Static312.aClass22_32 && !Static532.aClass248_103.method5781()) {
			return Static532.aClass248_103.method5792();
		} else if (Static26.aClass22_25 == Static312.aClass22_32 && !Static63.aClass248_10.method5781()) {
			return Static63.aClass248_10.method5792();
		} else if (Static312.aClass22_32 == Static26.aClass22_26 && !Static550.aClass248_107.method5781()) {
			return Static550.aClass248_107.method5792();
		} else {
			if (Static312.aClass22_32 == Static26.aClass22_27) {
				if (!Static302.aClass248_45.method5803("details")) {
					return Static302.aClass248_45.method5780("details");
				}
				Static490.method1745(Static302.aClass248_45, Static457.aClass7_6, Static429.aClass41_5, Static85.aClass27_1, Static358.aClass320_3, Static242.aClass274_3, Static65.aClass51_1);
			}
			if (Static26.aClass22_28 == Static312.aClass22_32) {
				Static280.aStringArray24 = new String[Static496.aClass307_2.anInt8656];
				Static2.anIntArray4 = new int[Static506.aClass174_2.anInt4829];
				Static224.aBooleanArray14 = new boolean[Static506.aClass174_2.anInt4829];
				for (local6 = 0; local6 < Static506.aClass174_2.anInt4829; local6++) {
					if (Static506.aClass174_2.method4091(local6).anInt7801 == 0) {
						Static224.aBooleanArray14[local6] = true;
						Static131.anInt2496++;
					}
					Static2.anIntArray4[local6] = -1;
				}
				Static271.method4040();
				Static320.anInt6124 = Static532.aClass248_103.method5777("loginscreen");
				Static428.anInt7625 = Static532.aClass248_103.method5777("lobbyscreen");
				Static88.aClass248_15.method5782(false);
				Static262.aClass248_36.method5782(true);
				Static114.aClass248_20.method5782(true);
				Static550.aClass248_107.method5782(true);
				Static333.aClass248_54.method5782(true);
				Static532.aClass248_103.method5782(true);
				Static280.aBoolean361 = true;
				Static265.aClass248_37.anInt7247 = 2;
				Static282.aClass248_43.anInt7247 = 2;
				Static274.aClass248_41.anInt7247 = 2;
				Static107.aClass248_16.anInt7247 = 2;
				Static572.aClass248_109.anInt7247 = 2;
				Static535.aClass248_105.anInt7247 = 2;
				Static364.aClass248_63.anInt7247 = 2;
			}
			if (Static26.aClass22_30 == Static312.aClass22_32) {
				Static566.aBoolean663 = Static58.aClass6_Sub17_Sub1_1.aBoolean597;
				Static58.aClass6_Sub17_Sub1_1.aBoolean597 = true;
				Static58.aClass6_Sub17_Sub1_1.method7359(Static174.aClass313_24);
				if (Static566.aBoolean663) {
					Static584.method7942(0);
				} else {
					Static584.method7942(Static58.aClass6_Sub17_Sub1_1.anInt9281);
				}
				Static192.method3260(Static58.aClass6_Sub17_Sub1_1.anInt9294, false, -1, -1);
				Static462.method6471(Static554.aClass90_12);
				Static517.method7069(Static554.aClass90_12);
				Static346.method5046(Static554.aClass90_12, Static114.aClass248_20);
				Static498.method6896(Static390.aClass71Array43);
				Static209.method3406(null);
				Static309.anInterface6Array1 = null;
				Static409.aClass248_77 = null;
				Static522.aClass293_1 = null;
				Static217.aClass248_32 = null;
			}
			return Static314.method4914();
		}
	}
}
