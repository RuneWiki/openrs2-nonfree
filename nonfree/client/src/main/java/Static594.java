import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static594 {

	@OriginalMember(owner = "client!sr", name = "h", descriptor = "I")
	public static int anInt9285;

	@OriginalMember(owner = "client!sr", name = "i", descriptor = "[Lclient!tl;")
	public static Class4_Sub2[] aClass4_Sub2Array5;

	@OriginalMember(owner = "client!sr", name = "d", descriptor = "Lclient!cga;")
	public static final Class60 aClass60_191 = new Class60();

	@OriginalMember(owner = "client!sr", name = "c", descriptor = "Lclient!lk;")
	public static final Class225 aClass225_177 = new Class225(14, 7);

	@OriginalMember(owner = "client!sr", name = "g", descriptor = "I")
	public static int anInt9286 = 0;

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(BILclient!nca;I)Lclient!ln;")
	public static Class229 method8178(@OriginalArg(1) int arg0, @OriginalArg(2) Class254 arg1) {
		@Pc(9) byte[] local9 = arg1.method6087(0, arg0);
		return local9 == null ? null : new Class229(local9);
	}

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(Lclient!tt;III)V")
	public static void method8179(@OriginalArg(0) Class2_Sub6_Sub20 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (arg0 == null || Static273.aClass60_88.aClass2_47 == arg0) {
			return;
		}
		@Pc(18) int local18 = arg0.anInt9598;
		@Pc(21) int local21 = arg0.anInt9599;
		@Pc(24) int local24 = arg0.anInt9603;
		@Pc(28) int local28 = (int) arg0.aLong302;
		if (local24 >= 2000) {
			local24 -= 2000;
		}
		@Pc(39) long local39 = arg0.aLong302;
		@Pc(82) Class2_Sub33 local82;
		if (local24 == 3) {
			if (Static565.anInt8888 > 0 && Static102.aClass184_1.method6058(82) && Static102.aClass184_1.method6058(81)) {
				Static233.method3334(Static243.anInt3820 + local18, Static241.aClass4_Sub2_Sub1_Sub2_Sub1_2.aByte133, local21 + Static224.anInt11062);
			} else {
				Static55.anInt902 = arg2;
				Static427.anInt6966 = 1;
				Static394.anInt6507 = arg1;
				Static29.anInt415 = 0;
				local82 = Static592.method8154(Static335.aClass349_80, Static487.aClass221_2.aClass48_1);
				local82.aClass2_Sub20_Sub2_1.method8533(3774, Static224.anInt11062 + local21);
				local82.aClass2_Sub20_Sub2_1.method8582(local18 + Static243.anInt3820);
				Static487.aClass221_2.method5173(local82);
			}
		}
		if (local24 == 30) {
			Static394.anInt6507 = arg1;
			Static55.anInt902 = arg2;
			Static29.anInt415 = 0;
			Static427.anInt6966 = 2;
			local82 = Static592.method8154(Static79.aClass349_26, Static487.aClass221_2.aClass48_1);
			local82.aClass2_Sub20_Sub2_1.method8572(Static359.anInt5735);
			local82.aClass2_Sub20_Sub2_1.method8533(3774, Static224.anInt11062 + local21);
			local82.aClass2_Sub20_Sub2_1.method8577(Static203.anInt3318);
			local82.aClass2_Sub20_Sub2_1.method8551(Static243.anInt3820 + local18);
			local82.aClass2_Sub20_Sub2_1.method8551(Integer.MAX_VALUE & (int) (local39 >>> 32));
			local82.aClass2_Sub20_Sub2_1.method8533(3774, Static166.anInt2883);
			local82.aClass2_Sub20_Sub2_1.method8584(Static102.aClass184_1.method6058(82) ? 1 : 0);
			Static487.aClass221_2.method5173(local82);
			Static625.method8451(local21, local39, local18);
		}
		@Pc(240) Class2_Sub33 local240;
		if (local24 == 2) {
			@Pc(217) Class2_Sub49 local217 = (Class2_Sub49) Static467.aClass218_37.method5095((long) local28, 0);
			if (local217 != null) {
				Static29.anInt415 = 0;
				Static394.anInt6507 = arg1;
				Static55.anInt902 = arg2;
				Static427.anInt6966 = 2;
				@Pc(230) Class4_Sub2_Sub1_Sub2_Sub2 local230 = local217.aClass4_Sub2_Sub1_Sub2_Sub2_3;
				local240 = Static592.method8154(Static426.aClass349_97, Static487.aClass221_2.aClass48_1);
				local240.aClass2_Sub20_Sub2_1.method8549(Static203.anInt3318);
				local240.aClass2_Sub20_Sub2_1.method8572(local28);
				local240.aClass2_Sub20_Sub2_1.method8582(Static359.anInt5735);
				local240.aClass2_Sub20_Sub2_1.method8572(Static166.anInt2883);
				local240.aClass2_Sub20_Sub2_1.method8532(Static102.aClass184_1.method6058(82) ? 1 : 0);
				Static487.aClass221_2.method5173(local240);
				Static633.method8625(-2, local230.method2046(), local230.anIntArray183[0], 0, local230.method2046(), local230.anIntArray182[0], true, 0);
			}
		}
		@Pc(304) Class349 local304 = null;
		if (local24 == 4) {
			local304 = Static708.aClass349_160;
		} else if (local24 == 23) {
			local304 = Static617.aClass349_141;
		} else if (local24 == 48) {
			local304 = Static14.aClass349_6;
		} else if (local24 == 18) {
			local304 = Static454.aClass349_106;
		} else if (local24 == 1010) {
			local304 = Static539.aClass349_127;
		} else if (local24 == 1002) {
			local304 = Static67.aClass349_162;
		}
		@Pc(371) Class2_Sub33 local371;
		if (local304 != null) {
			Static394.anInt6507 = arg1;
			Static55.anInt902 = arg2;
			Static427.anInt6966 = 2;
			Static29.anInt415 = 0;
			local371 = Static592.method8154(local304, Static487.aClass221_2.aClass48_1);
			local371.aClass2_Sub20_Sub2_1.method8551(Static243.anInt3820 + local18);
			local371.aClass2_Sub20_Sub2_1.method8582(Static224.anInt11062 + local21);
			local371.aClass2_Sub20_Sub2_1.method8550(Static102.aClass184_1.method6058(82) ? 1 : 0);
			local371.aClass2_Sub20_Sub2_1.method8533(3774, (int) (local39 >>> 32) & Integer.MAX_VALUE);
			Static487.aClass221_2.method5173(local371);
			Static625.method8451(local21, local39, local18);
		}
		if (local24 == 52) {
			@Pc(427) Class273 local427 = Static147.method2144(local21, local18);
			if (local427 != null) {
				Static643.method8704();
				@Pc(434) Class2_Sub31 local434 = Static91.method1412(local427);
				Static498.method7107(local434.method3010(), local427, local434.anInt3442);
				Static175.aString127 = Static83.method1240(local427);
				if (Static175.aString127 == null) {
					Static175.aString127 = "Null";
				}
				Static701.aString94 = local427.aString82 + "<col=ffffff>";
			}
			return;
		}
		if (local24 == 46) {
			Static427.anInt6966 = 2;
			Static55.anInt902 = arg2;
			Static29.anInt415 = 0;
			Static394.anInt6507 = arg1;
			local371 = Static592.method8154(Static445.aClass349_103, Static487.aClass221_2.aClass48_1);
			local371.aClass2_Sub20_Sub2_1.method8533(3774, Static359.anInt5735);
			local371.aClass2_Sub20_Sub2_1.method8582(Static166.anInt2883);
			local371.aClass2_Sub20_Sub2_1.method8533(3774, local28);
			local371.aClass2_Sub20_Sub2_1.method8572(local21 + Static224.anInt11062);
			local371.aClass2_Sub20_Sub2_1.method8549(Static203.anInt3318);
			local371.aClass2_Sub20_Sub2_1.method8584(Static102.aClass184_1.method6058(82) ? 1 : 0);
			local371.aClass2_Sub20_Sub2_1.method8572(local18 + Static243.anInt3820);
			Static487.aClass221_2.method5173(local371);
			Static367.method5267(local18, local21);
		}
		if (local24 == 49) {
			Static427.anInt6966 = 1;
			Static394.anInt6507 = arg1;
			Static55.anInt902 = arg2;
			Static29.anInt415 = 0;
			local371 = Static592.method8154(Static572.aClass349_135, Static487.aClass221_2.aClass48_1);
			local371.aClass2_Sub20_Sub2_1.method8533(3774, Static359.anInt5735);
			local371.aClass2_Sub20_Sub2_1.method8582(Static166.anInt2883);
			local371.aClass2_Sub20_Sub2_1.method8551(Static243.anInt3820 + local18);
			local371.aClass2_Sub20_Sub2_1.method8577(Static203.anInt3318);
			local371.aClass2_Sub20_Sub2_1.method8551(local21 + Static224.anInt11062);
			Static487.aClass221_2.method5173(local371);
			Static633.method8625(-4, 1, local18, 0, 1, local21, true, 0);
		}
		@Pc(620) Class349 local620 = null;
		if (local24 == 11) {
			local620 = Static539.aClass349_126;
		} else if (local24 == 10) {
			local620 = Static276.aClass349_131;
		} else if (local24 == 44) {
			local620 = Static75.aClass349_24;
		} else if (local24 == 21) {
			local620 = Static338.aClass349_81;
		} else if (local24 == 8) {
			local620 = Static132.aClass349_39;
		} else if (local24 == 1007) {
			local620 = Static445.aClass349_102;
		}
		if (local620 != null) {
			Static427.anInt6966 = 2;
			Static394.anInt6507 = arg1;
			Static55.anInt902 = arg2;
			Static29.anInt415 = 0;
			local240 = Static592.method8154(local620, Static487.aClass221_2.aClass48_1);
			local240.aClass2_Sub20_Sub2_1.method8550(Static102.aClass184_1.method6058(82) ? 1 : 0);
			local240.aClass2_Sub20_Sub2_1.method8582(local18 + Static243.anInt3820);
			local240.aClass2_Sub20_Sub2_1.method8572(local21 + Static224.anInt11062);
			local240.aClass2_Sub20_Sub2_1.method8572(local28);
			Static487.aClass221_2.method5173(local240);
			Static367.method5267(local18, local21);
		}
		if (local24 == 22) {
			@Pc(741) Class4_Sub2_Sub1_Sub2_Sub1 local741 = Static157.aClass4_Sub2_Sub1_Sub2_Sub1Array1[local28];
			if (local741 != null) {
				Static394.anInt6507 = arg1;
				Static55.anInt902 = arg2;
				Static427.anInt6966 = 2;
				Static29.anInt415 = 0;
				@Pc(761) Class2_Sub33 local761 = Static592.method8154(Static296.aClass349_72, Static487.aClass221_2.aClass48_1);
				local761.aClass2_Sub20_Sub2_1.method8551(Static359.anInt5735);
				local761.aClass2_Sub20_Sub2_1.method8550(Static102.aClass184_1.method6058(82) ? 1 : 0);
				local761.aClass2_Sub20_Sub2_1.method8533(3774, local28);
				local761.aClass2_Sub20_Sub2_1.method8577(Static203.anInt3318);
				local761.aClass2_Sub20_Sub2_1.method8533(3774, Static166.anInt2883);
				Static487.aClass221_2.method5173(local761);
				Static633.method8625(-2, local741.method2046(), local741.anIntArray183[0], 0, local741.method2046(), local741.anIntArray182[0], true, 0);
			}
		}
		if (local24 == 47 || local24 == 1001) {
			Static411.method6030(local28, arg0.aString106, local21, local18);
		}
		@Pc(844) Class349 local844 = null;
		if (local24 == 53) {
			local844 = Static367.aClass349_88;
		} else if (local24 == 16) {
			local844 = Static162.aClass349_47;
		} else if (local24 == 25) {
			local844 = Static343.aClass349_84;
		} else if (local24 == 19) {
			local844 = Static183.aClass349_52;
		} else if (local24 == 50) {
			local844 = Static167.aClass349_50;
		} else if (local24 == 1009) {
			local844 = Static461.aClass349_107;
		}
		@Pc(923) Class2_Sub33 local923;
		if (local844 != null) {
			@Pc(900) Class2_Sub49 local900 = (Class2_Sub49) Static467.aClass218_37.method5095((long) local28, 0);
			if (local900 != null) {
				Static427.anInt6966 = 2;
				Static55.anInt902 = arg2;
				Static394.anInt6507 = arg1;
				@Pc(915) Class4_Sub2_Sub1_Sub2_Sub2 local915 = local900.aClass4_Sub2_Sub1_Sub2_Sub2_3;
				Static29.anInt415 = 0;
				local923 = Static592.method8154(local844, Static487.aClass221_2.aClass48_1);
				local923.aClass2_Sub20_Sub2_1.method8582(local28);
				local923.aClass2_Sub20_Sub2_1.method8550(Static102.aClass184_1.method6058(82) ? 1 : 0);
				Static487.aClass221_2.method5173(local923);
				Static633.method8625(-2, local915.method2046(), local915.anIntArray183[0], 0, local915.method2046(), local915.anIntArray182[0], true, 0);
			}
		}
		if (local24 == 1003 || local24 == 1011 || local24 == 1004 || local24 == 1008 || local24 == 1006) {
			Static555.method7745(local28, local18, local24);
		}
		@Pc(1004) Class349 local1004 = null;
		if (local24 == 13) {
			local1004 = Static13.aClass349_5;
		} else if (local24 == 51) {
			local1004 = Static478.aClass349_112;
		} else if (local24 == 45) {
			local1004 = Static36.aClass349_11;
		} else if (local24 == 57) {
			local1004 = Static30.aClass349_10;
		} else if (local24 == 59) {
			local1004 = Static435.aClass349_98;
		} else if (local24 == 15) {
			local1004 = Static38.aClass349_12;
		} else if (local24 == 5) {
			local1004 = Static129.aClass349_37;
		} else if (local24 == 20) {
			local1004 = Static606.aClass349_139;
		} else if (local24 == 12) {
			local1004 = Static577.aClass349_137;
		} else if (local24 == 17) {
			local1004 = Static20.aClass349_7;
		}
		if (local1004 != null) {
			@Pc(1093) Class4_Sub2_Sub1_Sub2_Sub1 local1093 = Static157.aClass4_Sub2_Sub1_Sub2_Sub1Array1[local28];
			if (local1093 != null) {
				Static427.anInt6966 = 2;
				Static29.anInt415 = 0;
				Static55.anInt902 = arg2;
				Static394.anInt6507 = arg1;
				local923 = Static592.method8154(local1004, Static487.aClass221_2.aClass48_1);
				local923.aClass2_Sub20_Sub2_1.method8551(local28);
				local923.aClass2_Sub20_Sub2_1.method8597(Static102.aClass184_1.method6058(82) ? 1 : 0);
				Static487.aClass221_2.method5173(local923);
				Static633.method8625(-2, local1093.method2046(), local1093.anIntArray183[0], 0, local1093.method2046(), local1093.anIntArray182[0], true, 0);
			}
		}
		@Pc(1188) Class2_Sub33 local1188;
		if (local24 == 6) {
			if (Static565.anInt8888 > 0 && Static102.aClass184_1.method6058(82) && Static102.aClass184_1.method6058(81)) {
				Static233.method3334(Static243.anInt3820 + local18, Static241.aClass4_Sub2_Sub1_Sub2_Sub1_2.aByte133, local21 + Static224.anInt11062);
			} else {
				local1188 = Static107.method1596(local18, local21, local28);
				if (local28 == 1) {
					local1188.aClass2_Sub20_Sub2_1.method8584(-1);
					local1188.aClass2_Sub20_Sub2_1.method8584(-1);
					local1188.aClass2_Sub20_Sub2_1.method8551((int) Static213.aFloat46);
					local1188.aClass2_Sub20_Sub2_1.method8584(57);
					local1188.aClass2_Sub20_Sub2_1.method8584(Static91.anInt1623);
					local1188.aClass2_Sub20_Sub2_1.method8584(Static505.anInt8017);
					local1188.aClass2_Sub20_Sub2_1.method8584(89);
					local1188.aClass2_Sub20_Sub2_1.method8551(Static241.aClass4_Sub2_Sub1_Sub2_Sub1_2.anInt10229);
					local1188.aClass2_Sub20_Sub2_1.method8551(Static241.aClass4_Sub2_Sub1_Sub2_Sub1_2.anInt10228);
					local1188.aClass2_Sub20_Sub2_1.method8584(63);
				} else {
					Static394.anInt6507 = arg1;
					Static29.anInt415 = 0;
					Static427.anInt6966 = 1;
					Static55.anInt902 = arg2;
				}
				Static487.aClass221_2.method5173(local1188);
				Static633.method8625(-4, 1, local18, 0, 1, local21, true, 0);
			}
		}
		if (local24 == 9) {
			@Pc(1304) Class273 local1304 = Static147.method2144(local21, local18);
			if (local1304 != null) {
				Static664.method9062(local1304);
			}
		}
		if (local24 == 58 && Static13.aClass273_1 == null) {
			Static618.method8400(local21, local18);
			Static13.aClass273_1 = Static147.method2144(local21, local18);
			Static371.method5299(Static13.aClass273_1);
		}
		if (local24 == 60) {
			Static55.anInt902 = arg2;
			Static29.anInt415 = 0;
			Static427.anInt6966 = 2;
			Static394.anInt6507 = arg1;
			local1188 = Static592.method8154(Static296.aClass349_72, Static487.aClass221_2.aClass48_1);
			local1188.aClass2_Sub20_Sub2_1.method8551(Static359.anInt5735);
			local1188.aClass2_Sub20_Sub2_1.method8550(Static102.aClass184_1.method6058(82) ? 1 : 0);
			local1188.aClass2_Sub20_Sub2_1.method8533(3774, Static241.aClass4_Sub2_Sub1_Sub2_Sub1_2.anInt2320);
			local1188.aClass2_Sub20_Sub2_1.method8577(Static203.anInt3318);
			local1188.aClass2_Sub20_Sub2_1.method8533(3774, Static166.anInt2883);
			Static487.aClass221_2.method5173(local1188);
		}
		if (Static581.aBoolean787) {
			Static643.method8704();
		}
		if (Static411.aClass273_12 != null && Static642.anInt9855 == 0) {
			Static371.method5299(Static411.aClass273_12);
		}
	}
}
