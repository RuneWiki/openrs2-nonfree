import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static296 {

	@OriginalMember(owner = "client!sm", name = "K", descriptor = "Lclient!ns;")
	public static final Class155 aClass155_1 = new Class155();

	@OriginalMember(owner = "client!sm", name = "L", descriptor = "Ljava/lang/String;")
	public static String aString210 = "You can't add yourself to your own friend list.";

	@OriginalMember(owner = "client!sm", name = "M", descriptor = "I")
	public static int anInt5689 = -1;

	@OriginalMember(owner = "client!sm", name = "c", descriptor = "(II)Lclient!na;")
	public static Class14_Sub3 method5063(@OriginalArg(1) int arg0) {
		if (arg0 == 0) {
			return new Class14_Sub3_Sub23();
		} else if (arg0 == 1) {
			return new Class14_Sub3_Sub1();
		} else if (arg0 == 2) {
			return new Class14_Sub3_Sub28();
		} else if (arg0 == 3) {
			return new Class14_Sub3_Sub35();
		} else if (arg0 == 4) {
			return new Class14_Sub3_Sub4();
		} else if (arg0 == 5) {
			return new Class14_Sub3_Sub34();
		} else if (arg0 == 6) {
			return new Class14_Sub3_Sub25();
		} else if (arg0 == 7) {
			return new Class14_Sub3_Sub14();
		} else if (arg0 == 8) {
			return new Class14_Sub3_Sub18();
		} else if (arg0 == 9) {
			return new Class14_Sub3_Sub17();
		} else if (arg0 == 10) {
			return new Class14_Sub3_Sub15();
		} else if (arg0 == 11) {
			return new Class14_Sub3_Sub8();
		} else if (arg0 == 12) {
			return new Class14_Sub3_Sub20();
		} else if (arg0 == 13) {
			return new Class14_Sub3_Sub11();
		} else if (arg0 == 14) {
			return new Class14_Sub3_Sub16();
		} else if (arg0 == 15) {
			return new Class14_Sub3_Sub22();
		} else if (arg0 == 16) {
			return new Class14_Sub3_Sub10();
		} else if (arg0 == 17) {
			return new Class14_Sub3_Sub6();
		} else if (arg0 == 18) {
			return new Class14_Sub3_Sub2_Sub1();
		} else if (arg0 == 19) {
			return new Class14_Sub3_Sub37();
		} else if (arg0 == 20) {
			return new Class14_Sub3_Sub7();
		} else if (arg0 == 21) {
			return new Class14_Sub3_Sub13();
		} else if (arg0 == 22) {
			return new Class14_Sub3_Sub36();
		} else if (arg0 == 23) {
			return new Class14_Sub3_Sub32();
		} else if (arg0 == 24) {
			return new Class14_Sub3_Sub33();
		} else if (arg0 == 25) {
			return new Class14_Sub3_Sub9();
		} else if (arg0 == 26) {
			return new Class14_Sub3_Sub12();
		} else if (arg0 == 27) {
			return new Class14_Sub3_Sub30();
		} else if (arg0 == 28) {
			return new Class14_Sub3_Sub39();
		} else if (arg0 == 29) {
			return new Class14_Sub3_Sub5();
		} else if (arg0 == 30) {
			return new Class14_Sub3_Sub38();
		} else if (arg0 == 31) {
			return new Class14_Sub3_Sub29();
		} else if (arg0 == 32) {
			return new Class14_Sub3_Sub21();
		} else if (arg0 == 33) {
			return new Class14_Sub3_Sub3();
		} else if (arg0 == 34) {
			return new Class14_Sub3_Sub31();
		} else if (arg0 == 35) {
			return new Class14_Sub3_Sub27();
		} else if (arg0 == 36) {
			return new Class14_Sub3_Sub24();
		} else if (arg0 == 37) {
			return new Class14_Sub3_Sub26();
		} else if (arg0 == 38) {
			return new Class14_Sub3_Sub19();
		} else if (arg0 == 39) {
			return new Class14_Sub3_Sub2();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(IIIB)V")
	public static void method5064(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 == 0) {
			Static164.aClass14_Sub4_Sub2_3.method2557(88);
		}
		if (arg0 == 1) {
			Static164.aClass14_Sub4_Sub2_3.method2557(58);
		}
		Static164.aClass14_Sub4_Sub2_3.method2535(arg1 + Static151.anInt3234);
		Static164.aClass14_Sub4_Sub2_3.method2538(Static345.aBooleanArray30[82] ? 1 : 0);
		Static164.aClass14_Sub4_Sub2_3.method2535(Static251.anInt3170 + arg2);
		Static140.anInt2984 = arg1;
		Static213.anInt4250 = arg2;
		Static276.aBoolean348 = false;
		Static297.method5073();
	}

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(ZI)Lclient!wp;")
	public static Class220 method5066(@OriginalArg(1) int arg0) {
		@Pc(5) Class11 local5 = Static190.aClass11_84;
		@Pc(19) Class220 local19;
		synchronized (Static190.aClass11_84) {
			local19 = (Class220) Static190.aClass11_84.method209((long) arg0);
		}
		if (local19 != null) {
			return local19;
		}
		@Pc(39) byte[] local39 = Static227.aClass143_83.method3745(Static127.method2659(arg0), Static284.method4797(arg0));
		local19 = new Class220();
		local19.anInt6680 = arg0;
		if (local39 != null) {
			local19.method5971(new Class14_Sub4(local39));
		}
		local19.method5963();
		if (local19.anInt6651 != -1) {
			local19.method5974(method5066(local19.anInt6653), method5066(local19.anInt6651));
		}
		if (local19.anInt6656 != -1) {
			local19.method5959(method5066(local19.anInt6656), method5066(local19.anInt6691));
		}
		if (!Static57.aBoolean90 && local19.aBoolean444) {
			local19.aString251 = Static46.aString47;
			local19.aBoolean445 = false;
			local19.aStringArray77 = Static333.aStringArray72;
			local19.anInt6685 = 0;
			local19.aStringArray78 = Static240.aStringArray73;
			local19.anIntArray647 = null;
		}
		@Pc(115) Class11 local115 = Static190.aClass11_84;
		synchronized (Static190.aClass11_84) {
			Static190.aClass11_84.method219((long) arg0, local19);
			return local19;
		}
	}

	@OriginalMember(owner = "client!sm", name = "b", descriptor = "(IIIIIIII)V")
	public static void method5067(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg0;
		@Pc(11) int local11 = 0;
		@Pc(16) int local16 = arg5 - arg3;
		@Pc(20) int local20 = arg0 - arg3;
		@Pc(24) int local24 = arg5 * arg5;
		@Pc(28) int local28 = arg0 * arg0;
		@Pc(32) int local32 = local16 * local16;
		@Pc(36) int local36 = local20 * local20;
		@Pc(40) int local40 = local28 << 1;
		@Pc(44) int local44 = local24 << 1;
		@Pc(48) int local48 = local36 << 1;
		@Pc(52) int local52 = local32 << 1;
		@Pc(56) int local56 = arg0 << 1;
		@Pc(60) int local60 = local20 << 1;
		@Pc(69) int local69 = local40 + local24 * (1 - local56);
		@Pc(78) int local78 = local28 - (local56 - 1) * local44;
		@Pc(87) int local87 = local32 * (1 - local60) + local48;
		@Pc(95) int local95 = local36 - local52 * (local60 - 1);
		@Pc(99) int local99 = local24 << 2;
		@Pc(103) int local103 = local28 << 2;
		@Pc(107) int local107 = local32 << 2;
		@Pc(111) int local111 = local36 << 2;
		@Pc(115) int local115 = local40 * 3;
		@Pc(121) int local121 = (local56 - 3) * local44;
		@Pc(125) int local125 = local48 * 3;
		@Pc(131) int local131 = local52 * (local60 - 3);
		@Pc(137) int local137 = local103;
		@Pc(143) int local143 = local99 * (arg0 - 1);
		@Pc(145) int local145 = local111;
		@Pc(172) int local172;
		@Pc(180) int local180;
		@Pc(189) int local189;
		@Pc(197) int local197;
		if (arg4 >= Static32.anInt750 && Static112.anInt2485 >= arg4) {
			@Pc(163) int[] local163 = Static104.anIntArrayArray31[arg4];
			local172 = Static222.method3991(arg6 - arg5, Static275.anInt5244, Static6.anInt136);
			local180 = Static222.method3991(arg5 + arg6, Static275.anInt5244, Static6.anInt136);
			local189 = Static222.method3991(arg6 - local16, Static275.anInt5244, Static6.anInt136);
			local197 = Static222.method3991(local16 + arg6, Static275.anInt5244, Static6.anInt136);
			Static27.method690(local189, local163, arg2, local172);
			Static27.method690(local197, local163, arg1, local189);
			Static27.method690(local180, local163, arg2, local197);
		}
		@Pc(221) int local221 = local107 * (local20 - 1);
		while (local9 > 0) {
			@Pc(234) boolean local234 = local9 <= local20;
			if (local69 < 0) {
				while (local69 < 0) {
					local78 += local137;
					local69 += local115;
					local7++;
					local137 += local103;
					local115 += local103;
				}
			}
			if (local234) {
				if (local87 < 0) {
					while (local87 < 0) {
						local95 += local145;
						local87 += local125;
						local145 += local111;
						local125 += local111;
						local11++;
					}
				}
				if (local95 < 0) {
					local95 += local145;
					local87 += local125;
					local125 += local111;
					local145 += local111;
					local11++;
				}
				local87 += -local221;
				local95 += -local131;
				local131 -= local107;
				local221 -= local107;
			}
			if (local78 < 0) {
				local69 += local115;
				local78 += local137;
				local137 += local103;
				local115 += local103;
				local7++;
			}
			local78 += -local121;
			local69 += -local143;
			local121 -= local99;
			local143 -= local99;
			local9--;
			local172 = arg4 - local9;
			local180 = local9 + arg4;
			if (local180 >= Static32.anInt750 && local172 <= Static112.anInt2485) {
				local189 = Static222.method3991(local7 + arg6, Static275.anInt5244, Static6.anInt136);
				local197 = Static222.method3991(arg6 - local7, Static275.anInt5244, Static6.anInt136);
				if (local234) {
					@Pc(414) int local414 = Static222.method3991(arg6 + local11, Static275.anInt5244, Static6.anInt136);
					@Pc(423) int local423 = Static222.method3991(arg6 - local11, Static275.anInt5244, Static6.anInt136);
					@Pc(430) int[] local430;
					if (local172 >= Static32.anInt750) {
						local430 = Static104.anIntArrayArray31[local172];
						Static27.method690(local423, local430, arg2, local197);
						Static27.method690(local414, local430, arg1, local423);
						Static27.method690(local189, local430, arg2, local414);
					}
					if (local180 <= Static112.anInt2485) {
						local430 = Static104.anIntArrayArray31[local180];
						Static27.method690(local423, local430, arg2, local197);
						Static27.method690(local414, local430, arg1, local423);
						Static27.method690(local189, local430, arg2, local414);
					}
				} else {
					if (local172 >= Static32.anInt750) {
						Static27.method690(local189, Static104.anIntArrayArray31[local172], arg2, local197);
					}
					if (Static112.anInt2485 >= local180) {
						Static27.method690(local189, Static104.anIntArrayArray31[local180], arg2, local197);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(BLclient!jg;)V")
	public static void method5068(@OriginalArg(1) Class14_Sub4 arg0) {
		@Pc(9) int local9 = arg0.method2525();
		Static155.aClass211Array1 = new Class211[local9];
		for (@Pc(14) int local14 = 0; local14 < local9; local14++) {
			Static155.aClass211Array1[local14] = new Class211();
			Static155.aClass211Array1[local14].anInt6540 = arg0.method2525();
			Static155.aClass211Array1[local14].aString242 = arg0.method2528();
		}
		Static206.anInt6742 = arg0.method2525();
		Static237.anInt4637 = arg0.method2525();
		Static232.anInt2216 = arg0.method2525();
		Static343.aClass6_Sub1Array2 = new Class6_Sub1[Static237.anInt4637 + 1 - Static206.anInt6742];
		for (@Pc(78) int local78 = 0; local78 < Static232.anInt2216; local78++) {
			@Pc(84) int local84 = arg0.method2525();
			@Pc(92) Class6_Sub1 local92 = Static343.aClass6_Sub1Array2[local84] = new Class6_Sub1();
			local92.anInt4505 = arg0.method2548();
			local92.anInt4501 = arg0.method2510();
			local92.anInt4518 = Static206.anInt6742 + local84;
			local92.aString167 = arg0.method2528();
			local92.aString168 = arg0.method2528();
		}
		Static297.anInt5710 = arg0.method2510();
		Static232.aBoolean154 = true;
	}

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(IZ)V")
	public static void method5069(@OriginalArg(1) boolean arg0) {
		Static164.aClass14_Sub4_Sub2_3.method2557(251);
		for (@Pc(18) Class14_Sub27 local18 = (Class14_Sub27) Static198.aClass25_20.method697(); local18 != null; local18 = (Class14_Sub27) Static198.aClass25_20.method694()) {
			if (!local18.method5989()) {
				local18 = (Class14_Sub27) Static198.aClass25_20.method697();
				if (local18 == null) {
					break;
				}
			}
			if (local18.anInt5192 == 0) {
				Static81.method2015(true, arg0, local18);
			}
		}
		if (Static278.aClass146_51 != null) {
			Static166.method3295(Static278.aClass146_51);
			Static278.aClass146_51 = null;
		}
	}
}
