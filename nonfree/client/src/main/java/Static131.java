import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static131 {

	@OriginalMember(owner = "client!eha", name = "c", descriptor = "Lclient!rf;")
	public static Class309 aClass309_3;

	@OriginalMember(owner = "client!eha", name = "b", descriptor = "I")
	public static int anInt2079;

	@OriginalMember(owner = "client!eha", name = "d", descriptor = "Lclient!ho;")
	public static final Class160 aClass160_59 = new Class160(119, 3);

	@OriginalMember(owner = "client!eha", name = "a", descriptor = "(Lclient!uda;IIB)V")
	public static void method2013(@OriginalArg(0) Class14_Sub2_Sub20 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 == null || arg0 == Static111.aClass32_7.aClass14_27) {
			return;
		}
		@Pc(18) int local18 = arg0.anInt10004;
		@Pc(21) int local21 = arg0.anInt10000;
		@Pc(24) int local24 = arg0.anInt10001;
		@Pc(28) int local28 = (int) arg0.aLong281;
		@Pc(31) long local31 = arg0.aLong281;
		if (local24 >= 2000) {
			local24 -= 2000;
		}
		@Pc(58) Class14_Sub54 local58;
		if (local24 == 23) {
			Static354.anInt6058 = 1;
			Static440.anInt2581 = 0;
			Static216.anInt6484 = arg2;
			Static404.anInt7010 = arg1;
			local58 = Static72.method1195(Static277.aClass347_2.aClass197_2, Static109.aClass251_62);
			local58.aClass14_Sub21_Sub2_2.method7702(local21 + Static550.anInt9242);
			local58.aClass14_Sub21_Sub2_2.method7745(Static613.anInt10111);
			local58.aClass14_Sub21_Sub2_2.method7733(Static254.anInt4789);
			local58.aClass14_Sub21_Sub2_2.method7705(Static36.anInt617 + local18);
			local58.aClass14_Sub21_Sub2_2.method7702(Static578.anInt9567);
			Static277.aClass347_2.method8308(local58);
			Static369.method5538(local21, true, 1, 0, -4, 0, 1, local18);
		}
		if (local24 == 4) {
			Static440.anInt2581 = 0;
			Static354.anInt6058 = 2;
			Static404.anInt7010 = arg1;
			Static216.anInt6484 = arg2;
			local58 = Static72.method1195(Static277.aClass347_2.aClass197_2, Static676.aClass251_278);
			local58.aClass14_Sub21_Sub2_2.method7745(Static613.anInt10111);
			local58.aClass14_Sub21_Sub2_2.method7733(Static578.anInt9567);
			local58.aClass14_Sub21_Sub2_2.method7699(Static89.aClass207_3.method5068(82) ? 1 : 0);
			local58.aClass14_Sub21_Sub2_2.method7751(local28);
			local58.aClass14_Sub21_Sub2_2.method7705(Static254.anInt4789);
			local58.aClass14_Sub21_Sub2_2.method7705(Static36.anInt617 + local18);
			local58.aClass14_Sub21_Sub2_2.method7751(Static550.anInt9242 + local21);
			Static277.aClass347_2.method8308(local58);
			Static191.method2890(local18, local21);
		}
		@Pc(183) Class251 local183 = null;
		if (local24 == 46) {
			local183 = Static342.aClass251_145;
		} else if (local24 == 20) {
			local183 = Static297.aClass251_127;
		} else if (local24 == 10) {
			local183 = Static559.aClass251_229;
		} else if (local24 == 9) {
			local183 = Static242.aClass251_109;
		} else if (local24 == 1008) {
			local183 = Static383.aClass251_158;
		} else if (local24 == 1012) {
			local183 = Static331.aClass251_142;
		}
		if (local183 != null) {
			Static404.anInt7010 = arg1;
			Static216.anInt6484 = arg2;
			Static440.anInt2581 = 0;
			Static354.anInt6058 = 2;
			@Pc(258) Class14_Sub54 local258 = Static72.method1195(Static277.aClass347_2.aClass197_2, local183);
			local258.aClass14_Sub21_Sub2_2.method7705(Static550.anInt9242 + local21);
			local258.aClass14_Sub21_Sub2_2.method7747(Static89.aClass207_3.method5068(82) ? 1 : 0);
			local258.aClass14_Sub21_Sub2_2.method7705(Static36.anInt617 + local18);
			local258.aClass14_Sub21_Sub2_2.method7705((int) (local31 >>> 32) & Integer.MAX_VALUE);
			Static277.aClass347_2.method8308(local258);
			Static291.method7607(local18, local21, local31);
		}
		@Pc(306) Class251 local306 = null;
		if (local24 == 3) {
			local306 = Static214.aClass251_100;
		} else if (local24 == 49) {
			local306 = Static226.aClass251_137;
		} else if (local24 == 8) {
			local306 = Static658.aClass251_267;
		} else if (local24 == 59) {
			local306 = Static213.aClass251_147;
		} else if (local24 == 19) {
			local306 = Static391.aClass251_162;
		} else if (local24 == 58) {
			local306 = Static629.aClass251_250;
		} else if (local24 == 51) {
			local306 = Static558.aClass251_228;
		} else if (local24 == 22) {
			local306 = Static505.aClass251_208;
		} else if (local24 == 15) {
			local306 = Static29.aClass251_15;
		} else if (local24 == 53) {
			local306 = Static282.aClass251_123;
		}
		@Pc(381) Class4_Sub3_Sub3_Sub3_Sub2 local381;
		@Pc(401) Class14_Sub54 local401;
		if (local306 != null) {
			local381 = Static269.aClass4_Sub3_Sub3_Sub3_Sub2Array4[local28];
			if (local381 != null) {
				Static404.anInt7010 = arg1;
				Static354.anInt6058 = 2;
				Static440.anInt2581 = 0;
				Static216.anInt6484 = arg2;
				local401 = Static72.method1195(Static277.aClass347_2.aClass197_2, local306);
				local401.aClass14_Sub21_Sub2_2.method7751(local28);
				local401.aClass14_Sub21_Sub2_2.method7737(Static89.aClass207_3.method5068(82) ? 1 : 0);
				Static277.aClass347_2.method8308(local401);
				Static369.method5538(local381.anIntArray201[0], true, local381.method2870(0), 0, -2, 0, local381.method2870(0), local381.anIntArray200[0]);
			}
		}
		@Pc(483) Class14_Sub54 local483;
		if (local24 == 44) {
			if (Static469.anInt11068 > 0 && Static89.aClass207_3.method5068(82) && Static89.aClass207_3.method5068(81)) {
				Static489.method7382(Static550.anInt9242 + local21, Static294.aClass4_Sub3_Sub3_Sub3_Sub2_1.aByte146, local18 + Static36.anInt617);
			} else {
				Static404.anInt7010 = arg1;
				Static440.anInt2581 = 0;
				Static354.anInt6058 = 1;
				Static216.anInt6484 = arg2;
				local483 = Static72.method1195(Static277.aClass347_2.aClass197_2, Static411.aClass251_170);
				local483.aClass14_Sub21_Sub2_2.method7705(Static550.anInt9242 + local21);
				local483.aClass14_Sub21_Sub2_2.method7705(Static36.anInt617 + local18);
				Static277.aClass347_2.method8308(local483);
			}
		}
		if (local24 == 12) {
			Static440.anInt2581 = 0;
			Static404.anInt7010 = arg1;
			Static354.anInt6058 = 2;
			Static216.anInt6484 = arg2;
			local483 = Static72.method1195(Static277.aClass347_2.aClass197_2, Static134.aClass251_74);
			local483.aClass14_Sub21_Sub2_2.method7751(local18 + Static36.anInt617);
			local483.aClass14_Sub21_Sub2_2.method7702(Static578.anInt9567);
			local483.aClass14_Sub21_Sub2_2.method7705(Integer.MAX_VALUE & (int) (local31 >>> 32));
			local483.aClass14_Sub21_Sub2_2.method7745(Static613.anInt10111);
			local483.aClass14_Sub21_Sub2_2.method7733(Static254.anInt4789);
			local483.aClass14_Sub21_Sub2_2.method7699(Static89.aClass207_3.method5068(82) ? 1 : 0);
			local483.aClass14_Sub21_Sub2_2.method7733(Static550.anInt9242 + local21);
			Static277.aClass347_2.method8308(local483);
			Static291.method7607(local18, local21, local31);
		}
		if (local24 == 16) {
			if (Static469.anInt11068 > 0 && Static89.aClass207_3.method5068(82) && Static89.aClass207_3.method5068(81)) {
				Static489.method7382(Static550.anInt9242 + local21, Static294.aClass4_Sub3_Sub3_Sub3_Sub2_1.aByte146, Static36.anInt617 + local18);
			} else {
				local483 = Static649.method9104(local21, local28, local18);
				if (local28 == 1) {
					local483.aClass14_Sub21_Sub2_2.method7747(-1);
					local483.aClass14_Sub21_Sub2_2.method7747(-1);
					local483.aClass14_Sub21_Sub2_2.method7751((int) Static139.aFloat16);
					local483.aClass14_Sub21_Sub2_2.method7747(57);
					local483.aClass14_Sub21_Sub2_2.method7747(Static405.anInt7023);
					local483.aClass14_Sub21_Sub2_2.method7747(Static195.anInt3404);
					local483.aClass14_Sub21_Sub2_2.method7747(89);
					local483.aClass14_Sub21_Sub2_2.method7751(Static294.aClass4_Sub3_Sub3_Sub3_Sub2_1.anInt11184);
					local483.aClass14_Sub21_Sub2_2.method7751(Static294.aClass4_Sub3_Sub3_Sub3_Sub2_1.anInt11178);
					local483.aClass14_Sub21_Sub2_2.method7747(63);
				} else {
					Static216.anInt6484 = arg2;
					Static404.anInt7010 = arg1;
					Static440.anInt2581 = 0;
					Static354.anInt6058 = 1;
				}
				Static277.aClass347_2.method8308(local483);
				Static369.method5538(local21, true, 1, 0, -4, 0, 1, local18);
			}
		}
		if (local24 == 30) {
			@Pc(739) Class299 local739 = Static384.method5875(local21, local18);
			if (local739 != null) {
				Static214.method3269();
				@Pc(746) Class14_Sub6 local746 = Static80.method1360(local739);
				Static135.method2054(local739, local746.anInt455, local746.method482());
				Static529.aString102 = Static380.method5856(local739);
				if (Static529.aString102 == null) {
					Static529.aString102 = "Null";
				}
				Static621.aString117 = local739.aString95 + "<col=ffffff>";
			}
			return;
		}
		if (local24 == 50) {
			Static354.anInt6058 = 2;
			Static404.anInt7010 = arg1;
			Static440.anInt2581 = 0;
			Static216.anInt6484 = arg2;
			local483 = Static72.method1195(Static277.aClass347_2.aClass197_2, Static538.aClass251_218);
			local483.aClass14_Sub21_Sub2_2.method7733(Static294.aClass4_Sub3_Sub3_Sub3_Sub2_1.anInt3238);
			local483.aClass14_Sub21_Sub2_2.method7730(Static613.anInt10111);
			local483.aClass14_Sub21_Sub2_2.method7705(Static578.anInt9567);
			local483.aClass14_Sub21_Sub2_2.method7732(Static89.aClass207_3.method5068(82) ? 1 : 0);
			local483.aClass14_Sub21_Sub2_2.method7702(Static254.anInt4789);
			Static277.aClass347_2.method8308(local483);
		}
		if (local24 == 13) {
			local381 = Static269.aClass4_Sub3_Sub3_Sub3_Sub2Array4[local28];
			if (local381 != null) {
				Static354.anInt6058 = 2;
				Static440.anInt2581 = 0;
				Static404.anInt7010 = arg1;
				Static216.anInt6484 = arg2;
				local401 = Static72.method1195(Static277.aClass347_2.aClass197_2, Static538.aClass251_218);
				local401.aClass14_Sub21_Sub2_2.method7733(local28);
				local401.aClass14_Sub21_Sub2_2.method7730(Static613.anInt10111);
				local401.aClass14_Sub21_Sub2_2.method7705(Static578.anInt9567);
				local401.aClass14_Sub21_Sub2_2.method7732(Static89.aClass207_3.method5068(82) ? 1 : 0);
				local401.aClass14_Sub21_Sub2_2.method7702(Static254.anInt4789);
				Static277.aClass347_2.method8308(local401);
				Static369.method5538(local381.anIntArray201[0], true, local381.method2870(0), 0, -2, 0, local381.method2870(0), local381.anIntArray200[0]);
			}
		}
		@Pc(929) Class251 local929 = null;
		if (local24 == 48) {
			local929 = Static17.aClass251_11;
		} else if (local24 == 11) {
			local929 = Static396.aClass251_165;
		} else if (local24 == 17) {
			local929 = Static137.aClass251_78;
		} else if (local24 == 2) {
			local929 = Static658.aClass251_268;
		} else if (local24 == 5) {
			local929 = Static283.aClass251_124;
		} else if (local24 == 1010) {
			local929 = Static444.aClass251_184;
		}
		if (local929 != null) {
			Static354.anInt6058 = 2;
			Static440.anInt2581 = 0;
			Static404.anInt7010 = arg1;
			Static216.anInt6484 = arg2;
			local401 = Static72.method1195(Static277.aClass347_2.aClass197_2, local929);
			local401.aClass14_Sub21_Sub2_2.method7751(local21 + Static550.anInt9242);
			local401.aClass14_Sub21_Sub2_2.method7747(Static89.aClass207_3.method5068(82) ? 1 : 0);
			local401.aClass14_Sub21_Sub2_2.method7733(local28);
			local401.aClass14_Sub21_Sub2_2.method7702(Static36.anInt617 + local18);
			Static277.aClass347_2.method8308(local401);
			Static191.method2890(local18, local21);
		}
		if (local24 == 47) {
			@Pc(1049) Class299 local1049 = Static384.method5875(local21, local18);
			if (local1049 != null) {
				Static183.method2670(local1049);
			}
		}
		@Pc(1058) Class251 local1058 = null;
		if (local24 == 45) {
			local1058 = Static258.aClass251_115;
		} else if (local24 == 52) {
			local1058 = Static587.aClass251_236;
		} else if (local24 == 21) {
			local1058 = Static482.aClass251_198;
		} else if (local24 == 25) {
			local1058 = Static690.aClass251_279;
		} else if (local24 == 57) {
			local1058 = Static433.aClass251_178;
		} else if (local24 == 1003) {
			local1058 = Static499.aClass251_206;
		}
		@Pc(1114) Class14_Sub44 local1114;
		@Pc(1131) Class4_Sub3_Sub3_Sub3_Sub1 local1131;
		@Pc(1137) Class14_Sub54 local1137;
		if (local1058 != null) {
			local1114 = (Class14_Sub44) Static100.aClass125_9.method2630((long) local28);
			if (local1114 != null) {
				Static354.anInt6058 = 2;
				Static404.anInt7010 = arg1;
				Static440.anInt2581 = 0;
				Static216.anInt6484 = arg2;
				local1131 = local1114.aClass4_Sub3_Sub3_Sub3_Sub1_2;
				local1137 = Static72.method1195(Static277.aClass347_2.aClass197_2, local1058);
				local1137.aClass14_Sub21_Sub2_2.method7732(Static89.aClass207_3.method5068(82) ? 1 : 0);
				local1137.aClass14_Sub21_Sub2_2.method7751(local28);
				Static277.aClass347_2.method8308(local1137);
				Static369.method5538(local1131.anIntArray201[0], true, local1131.method2870(0), 0, -2, 0, local1131.method2870(0), local1131.anIntArray200[0]);
			}
		}
		if (local24 == 60) {
			local1114 = (Class14_Sub44) Static100.aClass125_9.method2630((long) local28);
			if (local1114 != null) {
				local1131 = local1114.aClass4_Sub3_Sub3_Sub3_Sub1_2;
				Static354.anInt6058 = 2;
				Static216.anInt6484 = arg2;
				Static440.anInt2581 = 0;
				Static404.anInt7010 = arg1;
				local1137 = Static72.method1195(Static277.aClass347_2.aClass197_2, Static545.aClass251_153);
				local1137.aClass14_Sub21_Sub2_2.method7702(Static254.anInt4789);
				local1137.aClass14_Sub21_Sub2_2.method7702(local28);
				local1137.aClass14_Sub21_Sub2_2.method7705(Static578.anInt9567);
				local1137.aClass14_Sub21_Sub2_2.method7699(Static89.aClass207_3.method5068(82) ? 1 : 0);
				local1137.aClass14_Sub21_Sub2_2.method7730(Static613.anInt10111);
				Static277.aClass347_2.method8308(local1137);
				Static369.method5538(local1131.anIntArray201[0], true, local1131.method2870(0), 0, -2, 0, local1131.method2870(0), local1131.anIntArray200[0]);
			}
		}
		if (local24 == 6 || local24 == 1011) {
			Static77.method1251(arg0.aString113, local28, local18, local21);
		}
		if (local24 == 18 && Static432.aClass299_7 == null) {
			Static94.method1600(local21, local18);
			Static432.aClass299_7 = Static384.method5875(local21, local18);
			Static538.method7933(Static432.aClass299_7);
		}
		if (local24 == 1001 || local24 == 1007 || local24 == 1009 || local24 == 1006 || local24 == 1002) {
			Static336.method5051(local28, local24, local18);
		}
		if (Static546.aBoolean727) {
			Static214.method3269();
		}
		if (Static588.aClass299_10 != null && Static406.anInt7030 == 0) {
			Static538.method7933(Static588.aClass299_10);
		}
	}
}
