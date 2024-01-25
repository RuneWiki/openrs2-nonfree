import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static524 {

	@OriginalMember(owner = "client!rl", name = "j", descriptor = "Lclient!lc;")
	public static Class207 aClass207_4;

	@OriginalMember(owner = "client!rl", name = "e", descriptor = "I")
	public static int anInt8097 = -1;

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(Lclient!qh;BII)V")
	public static void method7049(@OriginalArg(0) Class4_Sub5_Sub17 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg0 == null || Static87.aClass163_14.aClass4_127 == arg0) {
			return;
		}
		@Pc(15) int local15 = arg0.anInt7674;
		@Pc(18) int local18 = arg0.anInt7676;
		@Pc(21) int local21 = arg0.anInt7673;
		@Pc(25) int local25 = (int) arg0.aLong226;
		if (local21 >= 2000) {
			local21 -= 2000;
		}
		@Pc(32) long local32 = arg0.aLong226;
		@Pc(52) Class4_Sub48 local52;
		if (local21 == 11) {
			Static645.anInt10146 = 2;
			Static81.anInt1716 = arg2;
			Static23.anInt506 = 0;
			Static400.anInt5823 = arg1;
			local52 = Static335.method4615(Static159.aClass216_59, Static669.aClass196_2);
			local52.aClass4_Sub11_Sub1_2.method8891(local25);
			local52.aClass4_Sub11_Sub1_2.method8822(Static231.aClass102_6.method4311(82) ? 1 : 0);
			local52.aClass4_Sub11_Sub1_2.method8891(Static321.anInt5000 + local18);
			local52.aClass4_Sub11_Sub1_2.method8891(local15 + Static445.anInt6949);
			Static410.method5170(local52);
			Static255.method3695(local18, local15);
		}
		if (local21 == 30) {
			Static400.anInt5823 = arg1;
			Static23.anInt506 = 0;
			Static645.anInt10146 = 2;
			Static81.anInt1716 = arg2;
			local52 = Static335.method4615(Static135.aClass216_49, Static669.aClass196_2);
			local52.aClass4_Sub11_Sub1_2.method8863(Static169.anInt3012);
			local52.aClass4_Sub11_Sub1_2.method8849(Static270.anInt4357);
			local52.aClass4_Sub11_Sub1_2.method8838(local25);
			local52.aClass4_Sub11_Sub1_2.method8889(Static231.aClass102_6.method4311(82) ? 1 : 0);
			local52.aClass4_Sub11_Sub1_2.method8849(Static292.anInt4612);
			local52.aClass4_Sub11_Sub1_2.method8849(local18 + Static321.anInt5000);
			local52.aClass4_Sub11_Sub1_2.method8876(local15 + Static445.anInt6949);
			Static410.method5170(local52);
			Static255.method3695(local18, local15);
		}
		if (local21 == 58) {
			Static400.anInt5823 = arg1;
			Static81.anInt1716 = arg2;
			Static23.anInt506 = 0;
			Static645.anInt10146 = 2;
			local52 = Static335.method4615(Static606.aClass216_141, Static669.aClass196_2);
			local52.aClass4_Sub11_Sub1_2.method8849(Static554.aClass3_Sub1_Sub2_Sub2_Sub1_4.anInt9961);
			local52.aClass4_Sub11_Sub1_2.method8838(Static270.anInt4357);
			local52.aClass4_Sub11_Sub1_2.method8889(Static231.aClass102_6.method4311(82) ? 1 : 0);
			local52.aClass4_Sub11_Sub1_2.method8838(Static292.anInt4612);
			local52.aClass4_Sub11_Sub1_2.method8845(Static169.anInt3012);
			Static410.method5170(local52);
		}
		@Pc(248) Class4_Sub48 local248;
		@Pc(229) Class3_Sub1_Sub2_Sub2_Sub1 local229;
		if (local21 == 50) {
			local229 = Static180.aClass3_Sub1_Sub2_Sub2_Sub1Array20[local25];
			if (local229 != null) {
				Static23.anInt506 = 0;
				Static400.anInt5823 = arg1;
				Static81.anInt1716 = arg2;
				Static645.anInt10146 = 2;
				local248 = Static335.method4615(Static601.aClass216_138, Static669.aClass196_2);
				local248.aClass4_Sub11_Sub1_2.method8866(Static231.aClass102_6.method4311(82) ? 1 : 0);
				local248.aClass4_Sub11_Sub1_2.method8849(local25);
				Static410.method5170(local248);
				Static254.method3686(true, -2, local229.anIntArray694[0], 0, local229.method8514(), 0, local229.anIntArray693[0], local229.method8514());
			}
		}
		if (local21 == 1011) {
			Static645.anInt10146 = 2;
			Static400.anInt5823 = arg1;
			Static23.anInt506 = 0;
			Static81.anInt1716 = arg2;
			local52 = Static335.method4615(Static678.aClass216_158, Static669.aClass196_2);
			local52.aClass4_Sub11_Sub1_2.method8838(local25);
			Static410.method5170(local52);
		}
		if (local21 == 4) {
			if (Static279.anInt4498 > 0 && Static231.aClass102_6.method4311(82) && Static231.aClass102_6.method4311(81)) {
				Static98.method1981(Static445.anInt6949 + local15, local18 + Static321.anInt5000, Static554.aClass3_Sub1_Sub2_Sub2_Sub1_4.aByte141);
			} else {
				Static645.anInt10146 = 1;
				Static81.anInt1716 = arg2;
				Static23.anInt506 = 0;
				Static400.anInt5823 = arg1;
				local52 = Static335.method4615(Static271.aClass216_79, Static669.aClass196_2);
				local52.aClass4_Sub11_Sub1_2.method8891(local18 + Static321.anInt5000);
				local52.aClass4_Sub11_Sub1_2.method8849(Static445.anInt6949 + local15);
				Static410.method5170(local52);
			}
		}
		if (local21 == 16) {
			Static400.anInt5823 = arg1;
			Static23.anInt506 = 0;
			Static81.anInt1716 = arg2;
			Static645.anInt10146 = 2;
			local52 = Static335.method4615(Static76.aClass216_24, Static669.aClass196_2);
			local52.aClass4_Sub11_Sub1_2.method8891(Static321.anInt5000 + local18);
			local52.aClass4_Sub11_Sub1_2.method8889(Static231.aClass102_6.method4311(82) ? 1 : 0);
			local52.aClass4_Sub11_Sub1_2.method8838(local25);
			local52.aClass4_Sub11_Sub1_2.method8849(local15 + Static445.anInt6949);
			Static410.method5170(local52);
			Static255.method3695(local18, local15);
		}
		if (local21 == 44) {
			local229 = Static180.aClass3_Sub1_Sub2_Sub2_Sub1Array20[local25];
			if (local229 != null) {
				Static23.anInt506 = 0;
				Static81.anInt1716 = arg2;
				Static400.anInt5823 = arg1;
				Static645.anInt10146 = 2;
				local248 = Static335.method4615(Static606.aClass216_141, Static669.aClass196_2);
				local248.aClass4_Sub11_Sub1_2.method8849(local25);
				local248.aClass4_Sub11_Sub1_2.method8838(Static270.anInt4357);
				local248.aClass4_Sub11_Sub1_2.method8889(Static231.aClass102_6.method4311(82) ? 1 : 0);
				local248.aClass4_Sub11_Sub1_2.method8838(Static292.anInt4612);
				local248.aClass4_Sub11_Sub1_2.method8845(Static169.anInt3012);
				Static410.method5170(local248);
				Static254.method3686(true, -2, local229.anIntArray694[0], 0, local229.method8514(), 0, local229.anIntArray693[0], local229.method8514());
			}
		}
		if (local21 == 6) {
			local229 = Static180.aClass3_Sub1_Sub2_Sub2_Sub1Array20[local25];
			if (local229 != null) {
				Static23.anInt506 = 0;
				Static81.anInt1716 = arg2;
				Static645.anInt10146 = 2;
				Static400.anInt5823 = arg1;
				local248 = Static335.method4615(Static490.aClass216_156, Static669.aClass196_2);
				local248.aClass4_Sub11_Sub1_2.method8877(Static231.aClass102_6.method4311(82) ? 1 : 0);
				local248.aClass4_Sub11_Sub1_2.method8849(local25);
				Static410.method5170(local248);
				Static254.method3686(true, -2, local229.anIntArray694[0], 0, local229.method8514(), 0, local229.anIntArray693[0], local229.method8514());
			}
		}
		if (local21 == 9) {
			Static23.anInt506 = 0;
			Static645.anInt10146 = 2;
			Static400.anInt5823 = arg1;
			Static81.anInt1716 = arg2;
			local52 = Static335.method4615(Static414.aClass216_103, Static669.aClass196_2);
			local52.aClass4_Sub11_Sub1_2.method8849(local18 + Static321.anInt5000);
			local52.aClass4_Sub11_Sub1_2.method8866(Static231.aClass102_6.method4311(82) ? 1 : 0);
			local52.aClass4_Sub11_Sub1_2.method8838(local15 + Static445.anInt6949);
			local52.aClass4_Sub11_Sub1_2.method8849((int) (local32 >>> 32) & Integer.MAX_VALUE);
			Static410.method5170(local52);
			Static534.method7458(local18, local32, local15);
		}
		if (local21 == 57) {
			local229 = Static180.aClass3_Sub1_Sub2_Sub2_Sub1Array20[local25];
			if (local229 != null) {
				Static81.anInt1716 = arg2;
				Static400.anInt5823 = arg1;
				Static645.anInt10146 = 2;
				Static23.anInt506 = 0;
				local248 = Static335.method4615(Static416.aClass216_106, Static669.aClass196_2);
				local248.aClass4_Sub11_Sub1_2.method8849(local25);
				local248.aClass4_Sub11_Sub1_2.method8889(Static231.aClass102_6.method4311(82) ? 1 : 0);
				Static410.method5170(local248);
				Static254.method3686(true, -2, local229.anIntArray694[0], 0, local229.method8514(), 0, local229.anIntArray693[0], local229.method8514());
			}
		}
		if (local21 == 2) {
			Static400.anInt5823 = arg1;
			Static81.anInt1716 = arg2;
			Static645.anInt10146 = 2;
			Static23.anInt506 = 0;
			local52 = Static335.method4615(Static324.aClass216_88, Static669.aClass196_2);
			local52.aClass4_Sub11_Sub1_2.method8822(Static231.aClass102_6.method4311(82) ? 1 : 0);
			local52.aClass4_Sub11_Sub1_2.method8876(local15 + Static445.anInt6949);
			local52.aClass4_Sub11_Sub1_2.method8891(local18 + Static321.anInt5000);
			local52.aClass4_Sub11_Sub1_2.method8876(Integer.MAX_VALUE & (int) (local32 >>> 32));
			Static410.method5170(local52);
			Static534.method7458(local18, local32, local15);
		}
		if (local21 == 25) {
			local229 = Static180.aClass3_Sub1_Sub2_Sub2_Sub1Array20[local25];
			if (local229 != null) {
				Static645.anInt10146 = 2;
				Static81.anInt1716 = arg2;
				Static400.anInt5823 = arg1;
				Static23.anInt506 = 0;
				local248 = Static335.method4615(Static253.aClass216_76, Static669.aClass196_2);
				local248.aClass4_Sub11_Sub1_2.method8877(Static231.aClass102_6.method4311(82) ? 1 : 0);
				local248.aClass4_Sub11_Sub1_2.method8891(local25);
				Static410.method5170(local248);
				Static254.method3686(true, -2, local229.anIntArray694[0], 0, local229.method8514(), 0, local229.anIntArray693[0], local229.method8514());
			}
		}
		if (local21 == 1004 || local21 == 1009 || local21 == 1002 || local21 == 1001 || local21 == 1006) {
			Static667.method8903(local25, local15, local21);
		}
		if (local21 == 51) {
			Static81.anInt1716 = arg2;
			Static23.anInt506 = 0;
			Static645.anInt10146 = 2;
			Static400.anInt5823 = arg1;
			local52 = Static335.method4615(Static416.aClass216_105, Static669.aClass196_2);
			local52.aClass4_Sub11_Sub1_2.method8838(local15 + Static445.anInt6949);
			local52.aClass4_Sub11_Sub1_2.method8877(Static231.aClass102_6.method4311(82) ? 1 : 0);
			local52.aClass4_Sub11_Sub1_2.method8845(Static169.anInt3012);
			local52.aClass4_Sub11_Sub1_2.method8876(Static292.anInt4612);
			local52.aClass4_Sub11_Sub1_2.method8891(Static321.anInt5000 + local18);
			local52.aClass4_Sub11_Sub1_2.method8849(Static270.anInt4357);
			local52.aClass4_Sub11_Sub1_2.method8838(Integer.MAX_VALUE & (int) (local32 >>> 32));
			Static410.method5170(local52);
			Static534.method7458(local18, local32, local15);
		}
		@Pc(1004) Class4_Sub48 local1004;
		@Pc(995) Class3_Sub1_Sub2_Sub2_Sub2 local995;
		@Pc(982) Class4_Sub45 local982;
		if (local21 == 18) {
			local982 = (Class4_Sub45) Static597.aClass66_41.method1994((long) local25);
			if (local982 != null) {
				Static23.anInt506 = 0;
				Static81.anInt1716 = arg2;
				Static400.anInt5823 = arg1;
				Static645.anInt10146 = 2;
				local995 = local982.aClass3_Sub1_Sub2_Sub2_Sub2_2;
				local1004 = Static335.method4615(Static142.aClass216_87, Static669.aClass196_2);
				local1004.aClass4_Sub11_Sub1_2.method8891(local25);
				local1004.aClass4_Sub11_Sub1_2.method8877(Static231.aClass102_6.method4311(82) ? 1 : 0);
				Static410.method5170(local1004);
				Static254.method3686(true, -2, local995.anIntArray694[0], 0, local995.method8514(), 0, local995.anIntArray693[0], local995.method8514());
			}
		}
		if (local21 == 53) {
			local982 = (Class4_Sub45) Static597.aClass66_41.method1994((long) local25);
			if (local982 != null) {
				Static400.anInt5823 = arg1;
				Static81.anInt1716 = arg2;
				Static645.anInt10146 = 2;
				Static23.anInt506 = 0;
				local995 = local982.aClass3_Sub1_Sub2_Sub2_Sub2_2;
				local1004 = Static335.method4615(Static117.aClass216_44, Static669.aClass196_2);
				local1004.aClass4_Sub11_Sub1_2.method8877(Static231.aClass102_6.method4311(82) ? 1 : 0);
				local1004.aClass4_Sub11_Sub1_2.method8838(local25);
				Static410.method5170(local1004);
				Static254.method3686(true, -2, local995.anIntArray694[0], 0, local995.method8514(), 0, local995.anIntArray693[0], local995.method8514());
			}
		}
		if (local21 == 20) {
			Static400.anInt5823 = arg1;
			Static23.anInt506 = 0;
			Static81.anInt1716 = arg2;
			Static645.anInt10146 = 2;
			local52 = Static335.method4615(Static181.aClass216_61, Static669.aClass196_2);
			local52.aClass4_Sub11_Sub1_2.method8876(Static321.anInt5000 + local18);
			local52.aClass4_Sub11_Sub1_2.method8876(local25);
			local52.aClass4_Sub11_Sub1_2.method8822(Static231.aClass102_6.method4311(82) ? 1 : 0);
			local52.aClass4_Sub11_Sub1_2.method8849(local15 + Static445.anInt6949);
			Static410.method5170(local52);
			Static255.method3695(local18, local15);
		}
		if (local21 == 60) {
			if (Static279.anInt4498 > 0 && Static231.aClass102_6.method4311(82) && Static231.aClass102_6.method4311(81)) {
				Static98.method1981(local15 + Static445.anInt6949, local18 + Static321.anInt5000, Static554.aClass3_Sub1_Sub2_Sub2_Sub1_4.aByte141);
			} else {
				local52 = Static112.method2125(local15, local25, local18);
				if (local25 == 1) {
					local52.aClass4_Sub11_Sub1_2.method8822(-1);
					local52.aClass4_Sub11_Sub1_2.method8822(-1);
					local52.aClass4_Sub11_Sub1_2.method8838((int) Static642.aFloat230);
					local52.aClass4_Sub11_Sub1_2.method8822(57);
					local52.aClass4_Sub11_Sub1_2.method8822(Static354.anInt5391);
					local52.aClass4_Sub11_Sub1_2.method8822(Static338.anInt5228);
					local52.aClass4_Sub11_Sub1_2.method8822(89);
					local52.aClass4_Sub11_Sub1_2.method8838(Static554.aClass3_Sub1_Sub2_Sub2_Sub1_4.anInt9925);
					local52.aClass4_Sub11_Sub1_2.method8838(Static554.aClass3_Sub1_Sub2_Sub2_Sub1_4.anInt9917);
					local52.aClass4_Sub11_Sub1_2.method8822(63);
				} else {
					Static400.anInt5823 = arg1;
					Static23.anInt506 = 0;
					Static645.anInt10146 = 1;
					Static81.anInt1716 = arg2;
				}
				Static410.method5170(local52);
				Static254.method3686(true, -4, local18, 0, 1, 0, local15, 1);
			}
		}
		if (local21 == 52) {
			local229 = Static180.aClass3_Sub1_Sub2_Sub2_Sub1Array20[local25];
			if (local229 != null) {
				Static400.anInt5823 = arg1;
				Static645.anInt10146 = 2;
				Static23.anInt506 = 0;
				Static81.anInt1716 = arg2;
				local248 = Static335.method4615(Static231.aClass216_132, Static669.aClass196_2);
				local248.aClass4_Sub11_Sub1_2.method8866(Static231.aClass102_6.method4311(82) ? 1 : 0);
				local248.aClass4_Sub11_Sub1_2.method8891(local25);
				Static410.method5170(local248);
				Static254.method3686(true, -2, local229.anIntArray694[0], 0, local229.method8514(), 0, local229.anIntArray693[0], local229.method8514());
			}
		}
		if (local21 == 23) {
			local229 = Static180.aClass3_Sub1_Sub2_Sub2_Sub1Array20[local25];
			if (local229 != null) {
				Static23.anInt506 = 0;
				Static400.anInt5823 = arg1;
				Static81.anInt1716 = arg2;
				Static645.anInt10146 = 2;
				local248 = Static335.method4615(Static604.aClass216_140, Static669.aClass196_2);
				local248.aClass4_Sub11_Sub1_2.method8838(local25);
				local248.aClass4_Sub11_Sub1_2.method8889(Static231.aClass102_6.method4311(82) ? 1 : 0);
				Static410.method5170(local248);
				Static254.method3686(true, -2, local229.anIntArray694[0], 0, local229.method8514(), 0, local229.anIntArray693[0], local229.method8514());
			}
		}
		if (local21 == 21) {
			local229 = Static180.aClass3_Sub1_Sub2_Sub2_Sub1Array20[local25];
			if (local229 != null) {
				Static400.anInt5823 = arg1;
				Static23.anInt506 = 0;
				Static645.anInt10146 = 2;
				Static81.anInt1716 = arg2;
				local248 = Static335.method4615(Static157.aClass216_58, Static669.aClass196_2);
				local248.aClass4_Sub11_Sub1_2.method8891(local25);
				local248.aClass4_Sub11_Sub1_2.method8822(Static231.aClass102_6.method4311(82) ? 1 : 0);
				Static410.method5170(local248);
				Static254.method3686(true, -2, local229.anIntArray694[0], 0, local229.method8514(), 0, local229.anIntArray693[0], local229.method8514());
			}
		}
		if (local21 == 47) {
			local982 = (Class4_Sub45) Static597.aClass66_41.method1994((long) local25);
			if (local982 != null) {
				local995 = local982.aClass3_Sub1_Sub2_Sub2_Sub2_2;
				Static81.anInt1716 = arg2;
				Static400.anInt5823 = arg1;
				Static645.anInt10146 = 2;
				Static23.anInt506 = 0;
				local1004 = Static335.method4615(Static555.aClass216_135, Static669.aClass196_2);
				local1004.aClass4_Sub11_Sub1_2.method8866(Static231.aClass102_6.method4311(82) ? 1 : 0);
				local1004.aClass4_Sub11_Sub1_2.method8876(local25);
				Static410.method5170(local1004);
				Static254.method3686(true, -2, local995.anIntArray694[0], 0, local995.method8514(), 0, local995.anIntArray693[0], local995.method8514());
			}
		}
		if (local21 == 19) {
			Static81.anInt1716 = arg2;
			Static23.anInt506 = 0;
			Static645.anInt10146 = 2;
			Static400.anInt5823 = arg1;
			local52 = Static335.method4615(Static663.aClass216_154, Static669.aClass196_2);
			local52.aClass4_Sub11_Sub1_2.method8876(Static445.anInt6949 + local15);
			local52.aClass4_Sub11_Sub1_2.method8876((int) (local32 >>> 32) & Integer.MAX_VALUE);
			local52.aClass4_Sub11_Sub1_2.method8822(Static231.aClass102_6.method4311(82) ? 1 : 0);
			local52.aClass4_Sub11_Sub1_2.method8849(Static321.anInt5000 + local18);
			Static410.method5170(local52);
			Static534.method7458(local18, local32, local15);
		}
		if (local21 == 48) {
			local982 = (Class4_Sub45) Static597.aClass66_41.method1994((long) local25);
			if (local982 != null) {
				Static81.anInt1716 = arg2;
				Static23.anInt506 = 0;
				Static400.anInt5823 = arg1;
				Static645.anInt10146 = 2;
				local995 = local982.aClass3_Sub1_Sub2_Sub2_Sub2_2;
				local1004 = Static335.method4615(Static61.aClass216_17, Static669.aClass196_2);
				local1004.aClass4_Sub11_Sub1_2.method8876(Static292.anInt4612);
				local1004.aClass4_Sub11_Sub1_2.method8877(Static231.aClass102_6.method4311(82) ? 1 : 0);
				local1004.aClass4_Sub11_Sub1_2.method8863(Static169.anInt3012);
				local1004.aClass4_Sub11_Sub1_2.method8849(Static270.anInt4357);
				local1004.aClass4_Sub11_Sub1_2.method8849(local25);
				Static410.method5170(local1004);
				Static254.method3686(true, -2, local995.anIntArray694[0], 0, local995.method8514(), 0, local995.anIntArray693[0], local995.method8514());
			}
		}
		if (local21 == 10) {
			local982 = (Class4_Sub45) Static597.aClass66_41.method1994((long) local25);
			if (local982 != null) {
				Static400.anInt5823 = arg1;
				Static81.anInt1716 = arg2;
				local995 = local982.aClass3_Sub1_Sub2_Sub2_Sub2_2;
				Static645.anInt10146 = 2;
				Static23.anInt506 = 0;
				local1004 = Static335.method4615(Static654.aClass216_150, Static669.aClass196_2);
				local1004.aClass4_Sub11_Sub1_2.method8891(local25);
				local1004.aClass4_Sub11_Sub1_2.method8866(Static231.aClass102_6.method4311(82) ? 1 : 0);
				Static410.method5170(local1004);
				Static254.method3686(true, -2, local995.anIntArray694[0], 0, local995.method8514(), 0, local995.anIntArray693[0], local995.method8514());
			}
		}
		if (local21 == 59) {
			local982 = (Class4_Sub45) Static597.aClass66_41.method1994((long) local25);
			if (local982 != null) {
				Static400.anInt5823 = arg1;
				Static81.anInt1716 = arg2;
				Static23.anInt506 = 0;
				Static645.anInt10146 = 2;
				local995 = local982.aClass3_Sub1_Sub2_Sub2_Sub2_2;
				local1004 = Static335.method4615(Static340.aClass216_92, Static669.aClass196_2);
				local1004.aClass4_Sub11_Sub1_2.method8877(Static231.aClass102_6.method4311(82) ? 1 : 0);
				local1004.aClass4_Sub11_Sub1_2.method8838(local25);
				Static410.method5170(local1004);
				Static254.method3686(true, -2, local995.anIntArray694[0], 0, local995.method8514(), 0, local995.anIntArray693[0], local995.method8514());
			}
		}
		if (local21 == 12) {
			local229 = Static180.aClass3_Sub1_Sub2_Sub2_Sub1Array20[local25];
			if (local229 != null) {
				Static81.anInt1716 = arg2;
				Static23.anInt506 = 0;
				Static645.anInt10146 = 2;
				Static400.anInt5823 = arg1;
				local248 = Static335.method4615(Static679.aClass216_159, Static669.aClass196_2);
				local248.aClass4_Sub11_Sub1_2.method8889(Static231.aClass102_6.method4311(82) ? 1 : 0);
				local248.aClass4_Sub11_Sub1_2.method8838(local25);
				Static410.method5170(local248);
				Static254.method3686(true, -2, local229.anIntArray694[0], 0, local229.method8514(), 0, local229.anIntArray693[0], local229.method8514());
			}
		}
		if (local21 == 1012) {
			Static400.anInt5823 = arg1;
			Static645.anInt10146 = 2;
			Static81.anInt1716 = arg2;
			Static23.anInt506 = 0;
			local52 = Static335.method4615(Static28.aClass216_10, Static669.aClass196_2);
			local52.aClass4_Sub11_Sub1_2.method8838(local25);
			Static410.method5170(local52);
		}
		if (local21 == 49 || local21 == 1003) {
			Static331.method4566(local15, local18, arg0.aString97, local25);
		}
		if (local21 == 22) {
			Static81.anInt1716 = arg2;
			Static645.anInt10146 = 2;
			Static400.anInt5823 = arg1;
			Static23.anInt506 = 0;
			local52 = Static335.method4615(Static624.aClass216_144, Static669.aClass196_2);
			local52.aClass4_Sub11_Sub1_2.method8822(Static231.aClass102_6.method4311(82) ? 1 : 0);
			local52.aClass4_Sub11_Sub1_2.method8891(Static445.anInt6949 + local15);
			local52.aClass4_Sub11_Sub1_2.method8876(local25);
			local52.aClass4_Sub11_Sub1_2.method8838(local18 + Static321.anInt5000);
			Static410.method5170(local52);
			Static255.method3695(local18, local15);
		}
		if (local21 == 17 && Static451.aClass199_11 == null) {
			Static657.method8758(local15, local18);
			Static451.aClass199_11 = Static203.method3070(local15, local18);
			Static331.method4565(Static451.aClass199_11);
		}
		if (local21 == 15) {
			Static23.anInt506 = 0;
			Static400.anInt5823 = arg1;
			Static645.anInt10146 = 2;
			Static81.anInt1716 = arg2;
			local52 = Static335.method4615(Static397.aClass216_99, Static669.aClass196_2);
			local52.aClass4_Sub11_Sub1_2.method8838(local18 + Static321.anInt5000);
			local52.aClass4_Sub11_Sub1_2.method8891(local25);
			local52.aClass4_Sub11_Sub1_2.method8889(Static231.aClass102_6.method4311(82) ? 1 : 0);
			local52.aClass4_Sub11_Sub1_2.method8876(local15 + Static445.anInt6949);
			Static410.method5170(local52);
			Static255.method3695(local18, local15);
		}
		@Pc(2144) Class199 local2144;
		if (local21 == 45) {
			local2144 = Static203.method3070(local15, local18);
			if (local2144 != null) {
				Static124.method2204();
				@Pc(2151) Class4_Sub10 local2151 = Static75.method1604(local2144);
				Static200.method3058(local2151.anInt889, local2151.method815(), local2144);
				Static384.aString73 = Static169.method2825(local2144);
				if (Static384.aString73 == null) {
					Static384.aString73 = "Null";
				}
				Static203.aString30 = local2144.aString50 + "<col=ffffff>";
			}
			return;
		}
		if (local21 == 1010) {
			Static81.anInt1716 = arg2;
			Static23.anInt506 = 0;
			Static400.anInt5823 = arg1;
			Static645.anInt10146 = 2;
			@Pc(2198) Class4_Sub45 local2198 = (Class4_Sub45) Static597.aClass66_41.method1994((long) local25);
			if (local2198 != null) {
				@Pc(2203) Class3_Sub1_Sub2_Sub2_Sub2 local2203 = local2198.aClass3_Sub1_Sub2_Sub2_Sub2_2;
				@Pc(2206) Class345 local2206 = local2203.aClass345_1;
				if (local2206.anIntArray624 != null) {
					local2206 = local2206.method7529(Static526.aClass293_1);
				}
				if (local2206 != null) {
					@Pc(2225) Class4_Sub48 local2225 = Static335.method4615(Static287.aClass216_83, Static669.aClass196_2);
					local2225.aClass4_Sub11_Sub1_2.method8838(local2206.anInt8792);
					Static410.method5170(local2225);
				}
			}
		}
		if (local21 == 1007) {
			Static81.anInt1716 = arg2;
			Static23.anInt506 = 0;
			Static400.anInt5823 = arg1;
			Static645.anInt10146 = 2;
			local248 = Static335.method4615(Static8.aClass216_5, Static669.aClass196_2);
			local248.aClass4_Sub11_Sub1_2.method8891(Static321.anInt5000 + local18);
			local248.aClass4_Sub11_Sub1_2.method8849((int) (local32 >>> 32) & Integer.MAX_VALUE);
			local248.aClass4_Sub11_Sub1_2.method8838(Static445.anInt6949 + local15);
			local248.aClass4_Sub11_Sub1_2.method8866(Static231.aClass102_6.method4311(82) ? 1 : 0);
			Static410.method5170(local248);
			Static534.method7458(local18, local32, local15);
		}
		if (local21 == 8) {
			Static400.anInt5823 = arg1;
			Static645.anInt10146 = 1;
			Static81.anInt1716 = arg2;
			Static23.anInt506 = 0;
			local248 = Static335.method4615(Static665.aClass216_155, Static669.aClass196_2);
			local248.aClass4_Sub11_Sub1_2.method8849(local18 + Static321.anInt5000);
			local248.aClass4_Sub11_Sub1_2.method8876(Static292.anInt4612);
			local248.aClass4_Sub11_Sub1_2.method8838(Static445.anInt6949 + local15);
			local248.aClass4_Sub11_Sub1_2.method8838(Static270.anInt4357);
			local248.aClass4_Sub11_Sub1_2.method8845(Static169.anInt3012);
			Static410.method5170(local248);
			Static254.method3686(true, -4, local18, 0, 1, 0, local15, 1);
		}
		@Pc(2369) Class3_Sub1_Sub2_Sub2_Sub1 local2369;
		if (local21 == 46) {
			local2369 = Static180.aClass3_Sub1_Sub2_Sub2_Sub1Array20[local25];
			if (local2369 != null) {
				Static81.anInt1716 = arg2;
				Static400.anInt5823 = arg1;
				Static645.anInt10146 = 2;
				Static23.anInt506 = 0;
				local1004 = Static335.method4615(Static394.aClass216_101, Static669.aClass196_2);
				local1004.aClass4_Sub11_Sub1_2.method8822(Static231.aClass102_6.method4311(82) ? 1 : 0);
				local1004.aClass4_Sub11_Sub1_2.method8849(local25);
				Static410.method5170(local1004);
				Static254.method3686(true, -2, local2369.anIntArray694[0], 0, local2369.method8514(), 0, local2369.anIntArray693[0], local2369.method8514());
			}
		}
		if (local21 == 3) {
			Static23.anInt506 = 0;
			Static81.anInt1716 = arg2;
			Static400.anInt5823 = arg1;
			Static645.anInt10146 = 2;
			local248 = Static335.method4615(Static15.aClass216_23, Static669.aClass196_2);
			local248.aClass4_Sub11_Sub1_2.method8876(Integer.MAX_VALUE & (int) (local32 >>> 32));
			local248.aClass4_Sub11_Sub1_2.method8876(local18 + Static321.anInt5000);
			local248.aClass4_Sub11_Sub1_2.method8838(local15 + Static445.anInt6949);
			local248.aClass4_Sub11_Sub1_2.method8822(Static231.aClass102_6.method4311(82) ? 1 : 0);
			Static410.method5170(local248);
			Static534.method7458(local18, local32, local15);
		}
		if (local21 == 13) {
			local2369 = Static180.aClass3_Sub1_Sub2_Sub2_Sub1Array20[local25];
			if (local2369 != null) {
				Static645.anInt10146 = 2;
				Static81.anInt1716 = arg2;
				Static400.anInt5823 = arg1;
				Static23.anInt506 = 0;
				local1004 = Static335.method4615(Static492.aClass216_124, Static669.aClass196_2);
				local1004.aClass4_Sub11_Sub1_2.method8891(local25);
				local1004.aClass4_Sub11_Sub1_2.method8866(Static231.aClass102_6.method4311(82) ? 1 : 0);
				Static410.method5170(local1004);
				Static254.method3686(true, -2, local2369.anIntArray694[0], 0, local2369.method8514(), 0, local2369.anIntArray693[0], local2369.method8514());
			}
		}
		if (local21 == 5) {
			local2144 = Static203.method3070(local15, local18);
			if (local2144 != null) {
				Static488.method6658(local2144);
			}
		}
		if (Static463.aBoolean582) {
			Static124.method2204();
		}
		if (Static234.aClass199_2 != null && Static530.anInt8211 == 0) {
			Static331.method4565(Static234.aClass199_2);
		}
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(ZB)V")
	public static void method7051(@OriginalArg(0) boolean arg0) {
		if (Static330.aString58.length() == 0) {
			return;
		}
		Static383.method8457("--> " + Static330.aString58);
		Static93.method1898(arg0, false, Static330.aString58);
		Static631.anInt9864 = 0;
		Static330.aString58 = "";
		Static223.anInt3553 = 0;
	}
}
