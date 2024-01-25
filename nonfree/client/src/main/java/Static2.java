import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static2 {

	@OriginalMember(owner = "client!aaa", name = "a", descriptor = "I")
	public static int anInt10934 = 0;

	@OriginalMember(owner = "client!aaa", name = "l", descriptor = "I")
	public static int anInt10935 = 0;

	@OriginalMember(owner = "client!aaa", name = "c", descriptor = "Lclient!jia;")
	public static final Class186 aClass186_192 = new Class186(137, 6);

	@OriginalMember(owner = "client!aaa", name = "a", descriptor = "(Lclient!hca;Lclient!ha;BIII)V")
	public static void method9130(@OriginalArg(0) Class144 arg0, @OriginalArg(1) Class67 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(9) Class404 local9 = Static567.aClass405_3.method9356(arg0.anInt4403);
		if (local9.anInt11190 == -1) {
			return;
		}
		if (arg0.aBoolean377) {
			@Pc(24) int local24 = arg2 + arg0.anInt4412;
			arg2 = local24 & 0x3;
		} else {
			arg2 = 0;
		}
		@Pc(40) Class9 local40 = local9.method9349(arg2, arg0.aBoolean384, arg1);
		if (local40 == null) {
			return;
		}
		@Pc(47) int local47 = arg0.anInt4444;
		@Pc(50) int local50 = arg0.anInt4410;
		if ((arg2 & 0x1) == 1) {
			local50 = arg0.anInt4444;
			local47 = arg0.anInt4410;
		}
		@Pc(72) int local72 = local40.method8619();
		@Pc(75) int local75 = local40.method8613();
		if (local9.aBoolean807) {
			local72 = local47 * 4;
			local75 = local50 * 4;
		}
		if (local9.anInt11191 == 0) {
			local40.method8620(arg3, arg4 + 4 - local50 * 4, local72, local75);
		} else {
			local40.method8604(arg3, arg4 + 4 - local50 * 4, local72, local75, 0, local9.anInt11191 | 0xFF000000, 1);
		}
	}

	@OriginalMember(owner = "client!aaa", name = "a", descriptor = "(Lclient!ej;IIB)V")
	public static void method9131(@OriginalArg(0) Class3_Sub4_Sub5 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 == null || Static562.aClass357_54.aClass3_303 == arg0) {
			return;
		}
		@Pc(18) int local18 = arg0.anInt2777;
		@Pc(21) int local21 = arg0.anInt2776;
		@Pc(24) int local24 = arg0.anInt2775;
		@Pc(28) int local28 = (int) arg0.aLong105;
		if (local24 >= 2000) {
			local24 -= 2000;
		}
		@Pc(37) long local37 = arg0.aLong105;
		if (local24 == 50) {
			@Pc(47) Class20 local47 = Static244.method3731(local21, local18);
			if (local47 != null) {
				Static394.method5925(local47);
			}
		}
		@Pc(56) Class286 local56 = null;
		if (local24 == 6) {
			local56 = Static521.aClass286_90;
		} else if (local24 == 44) {
			local56 = Static707.aClass286_129;
		} else if (local24 == 59) {
			local56 = Static708.aClass286_130;
		} else if (local24 == 48) {
			local56 = Static514.aClass286_87;
		} else if (local24 == 1006) {
			local56 = Static413.aClass286_71;
		} else if (local24 == 1004) {
			local56 = Static330.aClass286_56;
		}
		@Pc(129) Class3_Sub48 local129;
		if (local56 != null) {
			Class19_Sub1_Sub3_Sub1.lb = arg2;
			Static290.anInt5227 = 2;
			anInt10935 = arg1;
			Static139.anInt2624 = 0;
			local129 = Static89.method1200(local56, Static532.aClass400_3.aClass399_2);
			local129.aClass3_Sub28_Sub2_1.method5282(Static714.anInt11156 + local18);
			local129.aClass3_Sub28_Sub2_1.method5313(local21 + Static339.anInt5859);
			local129.aClass3_Sub28_Sub2_1.method5329(Static419.aClass133_1.method3450(82) ? 1 : 0);
			local129.aClass3_Sub28_Sub2_1.method5282((int) (local37 >>> 32) & Integer.MAX_VALUE);
			Static532.aClass400_3.method9223(local129);
			Static172.method2685(local37, local21, local18);
		}
		if (local24 == 47) {
			@Pc(185) Class19_Sub1_Sub3_Sub2_Sub2 local185 = Static681.aClass19_Sub1_Sub3_Sub2_Sub2Array1[local28];
			if (local185 != null) {
				Static139.anInt2624 = 0;
				Static290.anInt5227 = 2;
				Class19_Sub1_Sub3_Sub1.lb = arg2;
				anInt10935 = arg1;
				@Pc(205) Class3_Sub48 local205 = Static89.method1200(Static484.aClass286_80, Static532.aClass400_3.aClass399_2);
				local205.aClass3_Sub28_Sub2_1.method5309(Static397.anInt7112);
				local205.aClass3_Sub28_Sub2_1.method5282(Static575.anInt9446);
				local205.aClass3_Sub28_Sub2_1.method5284(Static419.aClass133_1.method3450(82) ? 1 : 0);
				local205.aClass3_Sub28_Sub2_1.method5282(Static198.anInt3491);
				local205.aClass3_Sub28_Sub2_1.method5313(local28);
				Static532.aClass400_3.method9223(local205);
				Static372.method5394(true, 0, local185.lb[0], local185.anIntArray430[0], 0, -2, local185.method6592(), local185.method6592());
			}
		}
		if (local24 == 45) {
			if (Static651.anInt10450 > 0 && Static419.aClass133_1.method3450(82) && Static419.aClass133_1.method3450(81)) {
				Static405.method6054(local21 + Static339.anInt5859, Static251.aClass19_Sub1_Sub3_Sub2_Sub2_2.aByte146, Static714.anInt11156 + local18);
			} else {
				local129 = Static150.method2439(local21, local28, local18);
				if (local28 == 1) {
					local129.aClass3_Sub28_Sub2_1.method5329(-1);
					local129.aClass3_Sub28_Sub2_1.method5329(-1);
					local129.aClass3_Sub28_Sub2_1.method5282((int) Static658.aFloat196);
					local129.aClass3_Sub28_Sub2_1.method5329(57);
					local129.aClass3_Sub28_Sub2_1.method5329(Static543.anInt9108);
					local129.aClass3_Sub28_Sub2_1.method5329(Static61.anInt953);
					local129.aClass3_Sub28_Sub2_1.method5329(89);
					local129.aClass3_Sub28_Sub2_1.method5282(Static251.aClass19_Sub1_Sub3_Sub2_Sub2_2.anInt11204);
					local129.aClass3_Sub28_Sub2_1.method5282(Static251.aClass19_Sub1_Sub3_Sub2_Sub2_2.anInt11211);
					local129.aClass3_Sub28_Sub2_1.method5329(63);
				} else {
					Class19_Sub1_Sub3_Sub1.lb = arg2;
					Static290.anInt5227 = 1;
					anInt10935 = arg1;
					Static139.anInt2624 = 0;
				}
				Static532.aClass400_3.method9223(local129);
				Static372.method5394(true, 0, local21, local18, 0, -4, 1, 1);
			}
		}
		if (local24 == 57) {
			Static139.anInt2624 = 0;
			Static290.anInt5227 = 1;
			anInt10935 = arg1;
			Class19_Sub1_Sub3_Sub1.lb = arg2;
			local129 = Static89.method1200(Static506.aClass286_85, Static532.aClass400_3.aClass399_2);
			local129.aClass3_Sub28_Sub2_1.method5311(Static397.anInt7112);
			local129.aClass3_Sub28_Sub2_1.method5270(local21 + Static339.anInt5859);
			local129.aClass3_Sub28_Sub2_1.method5292(Static575.anInt9446);
			local129.aClass3_Sub28_Sub2_1.method5270(Static198.anInt3491);
			local129.aClass3_Sub28_Sub2_1.method5292(Static714.anInt11156 + local18);
			Static532.aClass400_3.method9223(local129);
			Static372.method5394(true, 0, local21, local18, 0, -4, 1, 1);
		}
		@Pc(467) Class286 local467 = null;
		if (local24 == 20) {
			local467 = Static85.aClass286_19;
		} else if (local24 == 22) {
			local467 = Static264.aClass286_41;
		} else if (local24 == 46) {
			local467 = Static215.aClass286_36;
		} else if (local24 == 15) {
			local467 = Static8.aClass286_1;
		} else if (local24 == 5) {
			local467 = Static486.aClass286_81;
		} else if (local24 == 9) {
			local467 = Static313.aClass286_53;
		} else if (local24 == 13) {
			local467 = Static648.aClass286_120;
		} else if (local24 == 8) {
			local467 = Static453.aClass286_76;
		} else if (local24 == 18) {
			local467 = Static537.aClass286_93;
		} else if (local24 == 58) {
			local467 = Static525.aClass286_91;
		}
		@Pc(570) Class3_Sub48 local570;
		if (local467 != null) {
			@Pc(550) Class19_Sub1_Sub3_Sub2_Sub2 local550 = Static681.aClass19_Sub1_Sub3_Sub2_Sub2Array1[local28];
			if (local550 != null) {
				Class19_Sub1_Sub3_Sub1.lb = arg2;
				Static290.anInt5227 = 2;
				Static139.anInt2624 = 0;
				anInt10935 = arg1;
				local570 = Static89.method1200(local467, Static532.aClass400_3.aClass399_2);
				local570.aClass3_Sub28_Sub2_1.method5329(Static419.aClass133_1.method3450(82) ? 1 : 0);
				local570.aClass3_Sub28_Sub2_1.method5270(local28);
				Static532.aClass400_3.method9223(local570);
				Static372.method5394(true, 0, local550.lb[0], local550.anIntArray430[0], 0, -2, local550.method6592(), local550.method6592());
			}
		}
		@Pc(617) Class286 local617 = null;
		if (local24 == 52) {
			local617 = Static271.aClass286_47;
		} else if (local24 == 53) {
			local617 = Static613.aClass286_110;
		} else if (local24 == 51) {
			local617 = Static589.aClass286_101;
		} else if (local24 == 4) {
			local617 = Static283.aClass286_48;
		} else if (local24 == 60) {
			local617 = Static610.aClass286_109;
		} else if (local24 == 1001) {
			local617 = Static536.aClass286_92;
		}
		if (local617 != null) {
			Static139.anInt2624 = 0;
			Static290.anInt5227 = 2;
			anInt10935 = arg1;
			Class19_Sub1_Sub3_Sub1.lb = arg2;
			local570 = Static89.method1200(local617, Static532.aClass400_3.aClass399_2);
			local570.aClass3_Sub28_Sub2_1.method5292(Static714.anInt11156 + local18);
			local570.aClass3_Sub28_Sub2_1.method5270(local28);
			local570.aClass3_Sub28_Sub2_1.method5270(local21 + Static339.anInt5859);
			local570.aClass3_Sub28_Sub2_1.method5284(Static419.aClass133_1.method3450(82) ? 1 : 0);
			Static532.aClass400_3.method9223(local570);
			Static353.method5122(local21, local18);
		}
		if (local24 == 17) {
			anInt10935 = arg1;
			Class19_Sub1_Sub3_Sub1.lb = arg2;
			Static139.anInt2624 = 0;
			Static290.anInt5227 = 2;
			local570 = Static89.method1200(Static484.aClass286_80, Static532.aClass400_3.aClass399_2);
			local570.aClass3_Sub28_Sub2_1.method5309(Static397.anInt7112);
			local570.aClass3_Sub28_Sub2_1.method5282(Static575.anInt9446);
			local570.aClass3_Sub28_Sub2_1.method5284(Static419.aClass133_1.method3450(82) ? 1 : 0);
			local570.aClass3_Sub28_Sub2_1.method5282(Static198.anInt3491);
			local570.aClass3_Sub28_Sub2_1.method5313(Static251.aClass19_Sub1_Sub3_Sub2_Sub2_2.anInt7796);
			Static532.aClass400_3.method9223(local570);
		}
		if (local24 == 30) {
			@Pc(800) Class3_Sub13 local800 = (Class3_Sub13) Static612.aClass136_44.method3503((long) local28);
			if (local800 != null) {
				anInt10935 = arg1;
				@Pc(811) Class19_Sub1_Sub3_Sub2_Sub1 local811 = local800.aClass19_Sub1_Sub3_Sub2_Sub1_2;
				Static139.anInt2624 = 0;
				Static290.anInt5227 = 2;
				Class19_Sub1_Sub3_Sub1.lb = arg2;
				@Pc(823) Class3_Sub48 local823 = Static89.method1200(Static645.aClass286_118, Static532.aClass400_3.aClass399_2);
				local823.aClass3_Sub28_Sub2_1.method5313(Static198.anInt3491);
				local823.aClass3_Sub28_Sub2_1.method5325(Static397.anInt7112);
				local823.aClass3_Sub28_Sub2_1.method5313(Static575.anInt9446);
				local823.aClass3_Sub28_Sub2_1.method5284(Static419.aClass133_1.method3450(82) ? 1 : 0);
				local823.aClass3_Sub28_Sub2_1.method5292(local28);
				Static532.aClass400_3.method9223(local823);
				Static372.method5394(true, 0, local811.lb[0], local811.anIntArray430[0], 0, -2, local811.method6592(), local811.method6592());
			}
		}
		@Pc(883) Class286 local883 = null;
		if (local24 == 12) {
			local883 = Static512.aClass286_86;
		} else if (local24 == 23) {
			local883 = Static150.aClass286_27;
		} else if (local24 == 3) {
			local883 = Static293.aClass286_49;
		} else if (local24 == 25) {
			local883 = Static45.aClass286_12;
		} else if (local24 == 19) {
			local883 = Static297.aClass286_52;
		} else if (local24 == 1011) {
			local883 = Static179.aClass286_32;
		}
		if (local883 != null) {
			@Pc(939) Class3_Sub13 local939 = (Class3_Sub13) Static612.aClass136_44.method3503((long) local28);
			if (local939 != null) {
				Static290.anInt5227 = 2;
				Class19_Sub1_Sub3_Sub1.lb = arg2;
				@Pc(948) Class19_Sub1_Sub3_Sub2_Sub1 local948 = local939.aClass19_Sub1_Sub3_Sub2_Sub1_2;
				anInt10935 = arg1;
				Static139.anInt2624 = 0;
				@Pc(962) Class3_Sub48 local962 = Static89.method1200(local883, Static532.aClass400_3.aClass399_2);
				local962.aClass3_Sub28_Sub2_1.method5315(Static419.aClass133_1.method3450(82) ? 1 : 0);
				local962.aClass3_Sub28_Sub2_1.method5313(local28);
				Static532.aClass400_3.method9223(local962);
				Static372.method5394(true, 0, local948.lb[0], local948.anIntArray430[0], 0, -2, local948.method6592(), local948.method6592());
			}
		}
		@Pc(1028) Class3_Sub48 local1028;
		if (local24 == 2) {
			Static290.anInt5227 = 2;
			Class19_Sub1_Sub3_Sub1.lb = arg2;
			anInt10935 = arg1;
			Static139.anInt2624 = 0;
			local1028 = Static89.method1200(Static103.aClass286_22, Static532.aClass400_3.aClass399_2);
			local1028.aClass3_Sub28_Sub2_1.method5313(Static198.anInt3491);
			local1028.aClass3_Sub28_Sub2_1.method5270((int) (local37 >>> 32) & Integer.MAX_VALUE);
			local1028.aClass3_Sub28_Sub2_1.method5325(Static397.anInt7112);
			local1028.aClass3_Sub28_Sub2_1.method5284(Static419.aClass133_1.method3450(82) ? 1 : 0);
			local1028.aClass3_Sub28_Sub2_1.method5270(Static339.anInt5859 + local21);
			local1028.aClass3_Sub28_Sub2_1.method5292(local18 + Static714.anInt11156);
			local1028.aClass3_Sub28_Sub2_1.method5292(Static575.anInt9446);
			Static532.aClass400_3.method9223(local1028);
			Static172.method2685(local37, local21, local18);
		}
		if (local24 == 49) {
			if (Static651.anInt10450 > 0 && Static419.aClass133_1.method3450(82) && Static419.aClass133_1.method3450(81)) {
				Static405.method6054(Static339.anInt5859 + local21, Static251.aClass19_Sub1_Sub3_Sub2_Sub2_2.aByte146, Static714.anInt11156 + local18);
			} else {
				anInt10935 = arg1;
				Static290.anInt5227 = 1;
				Class19_Sub1_Sub3_Sub1.lb = arg2;
				Static139.anInt2624 = 0;
				local1028 = Static89.method1200(Static319.aClass286_127, Static532.aClass400_3.aClass399_2);
				local1028.aClass3_Sub28_Sub2_1.method5282(Static339.anInt5859 + local21);
				local1028.aClass3_Sub28_Sub2_1.method5282(local18 + Static714.anInt11156);
				Static532.aClass400_3.method9223(local1028);
			}
		}
		if (local24 == 11 || local24 == 1007) {
			Static298.method3453(local28, arg0.aString50, local21, local18);
		}
		if (local24 == 21 && Static70.aClass20_4 == null) {
			Static582.method8683(local18, local21);
			Static70.aClass20_4 = Static244.method3731(local21, local18);
			Static391.method5905(Static70.aClass20_4);
		}
		if (local24 == 16) {
			anInt10935 = arg1;
			Static290.anInt5227 = 2;
			Class19_Sub1_Sub3_Sub1.lb = arg2;
			Static139.anInt2624 = 0;
			local1028 = Static89.method1200(Static517.aClass286_88, Static532.aClass400_3.aClass399_2);
			local1028.aClass3_Sub28_Sub2_1.method5329(Static419.aClass133_1.method3450(82) ? 1 : 0);
			local1028.aClass3_Sub28_Sub2_1.method5270(local18 + Static714.anInt11156);
			local1028.aClass3_Sub28_Sub2_1.method5313(Static575.anInt9446);
			local1028.aClass3_Sub28_Sub2_1.method5270(Static198.anInt3491);
			local1028.aClass3_Sub28_Sub2_1.method5282(local28);
			local1028.aClass3_Sub28_Sub2_1.method5311(Static397.anInt7112);
			local1028.aClass3_Sub28_Sub2_1.method5282(local21 + Static339.anInt5859);
			Static532.aClass400_3.method9223(local1028);
			Static353.method5122(local21, local18);
		}
		if (local24 == 1010 || local24 == 1003 || local24 == 1008 || local24 == 1002 || local24 == 1009) {
			Static539.method8106(local24, local28, local18);
		}
		if (local24 != 10) {
			if (Static212.aBoolean297) {
				Static427.method6535();
			}
			if (Static532.aClass20_17 != null && Static63.anInt991 == 0) {
				Static391.method5905(Static532.aClass20_17);
			}
			return;
		}
		@Pc(1336) Class20 local1336 = Static244.method3731(local21, local18);
		if (local1336 == null) {
			return;
		}
		Static427.method6535();
		@Pc(1343) Class3_Sub29 local1343 = Static87.method1164(local1336);
		Static229.method3585(local1336, local1343.anInt5441, local1343.method4617());
		Static177.aString97 = Static182.method2796(local1336);
		if (Static177.aString97 == null) {
			Static177.aString97 = "Null";
		}
		Static90.aString28 = local1336.aString8 + "<col=ffffff>";
	}

	@OriginalMember(owner = "client!aaa", name = "a", descriptor = "(IIIIZIIFZ)[[I")
	public static int[][] method9132(@OriginalArg(7) float arg0) {
		@Pc(9) int[][] local9 = new int[256][64];
		@Pc(13) Class3_Sub2_Sub11 local13 = new Class3_Sub2_Sub11();
		local13.anInt3943 = 4;
		local13.aBoolean331 = false;
		local13.anInt3951 = 3;
		local13.anInt3952 = 4;
		local13.anInt3950 = (int) (arg0 * 4096.0F);
		local13.method9205();
		Static702.method9177(64, 256);
		for (@Pc(46) int local46 = 0; local46 < 256; local46++) {
			local13.method3321(local46, local9[local46]);
		}
		return local9;
	}
}
