import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static302 {

	@OriginalMember(owner = "client!lga", name = "b", descriptor = "Lclient!cq;")
	public static final Class56 aClass56_101 = new Class56(95, -1);

	@OriginalMember(owner = "client!lga", name = "d", descriptor = "I")
	public static int anInt5115 = 0;

	@OriginalMember(owner = "client!lga", name = "e", descriptor = "Lclient!sb;")
	public static final Class303 aClass303_60 = new Class303(80, 5);

	@OriginalMember(owner = "client!lga", name = "f", descriptor = "[[I")
	public static final int[][] anIntArrayArray116 = new int[][] { { 0, 1, 2, 3 }, { 1, 2, 3, 0 }, { 1, 2, -1, 0 }, { 2, 0, -1, 1 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 1, 3, -1 }, { -1, 0, 2, -1 }, { 3, 5, 2, 0 }, { 0, 2, 5, 3 }, { 0, 2, 3, 5 }, { 0, 1, 2, 3 } };

	@OriginalMember(owner = "client!lga", name = "g", descriptor = "Lclient!nb;")
	public static final Class3_Sub36 aClass3_Sub36_1 = new Class3_Sub36(0, -1);

	@OriginalMember(owner = "client!lga", name = "a", descriptor = "(Lclient!rn;III)V")
	public static void method4444(@OriginalArg(0) Class3_Sub43 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 == null || arg0 == Static133.aClass112_20.aClass3_111) {
			return;
		}
		@Pc(15) int local15 = arg0.anInt7752;
		@Pc(18) int local18 = arg0.anInt7750;
		@Pc(21) int local21 = arg0.anInt7753;
		@Pc(25) int local25 = (int) arg0.aLong221;
		if (local21 >= 2000) {
			local21 -= 2000;
		}
		@Pc(34) long local34 = arg0.aLong221;
		@Pc(46) Class3_Sub34 local46;
		@Pc(55) Class41_Sub2_Sub1_Sub4_Sub1 local55;
		@Pc(68) Class3_Sub42 local68;
		if (local21 == 48) {
			local46 = (Class3_Sub34) Static213.aClass354_37.method7689((long) local25);
			if (local46 != null) {
				local55 = local46.aClass41_Sub2_Sub1_Sub4_Sub1_2;
				Static416.anInt7068 = 2;
				Static235.anInt4157 = 0;
				Static158.anInt3267 = arg2;
				Static541.anInt8167 = arg1;
				local68 = Static591.method7910(Static9.aClass199_3, Static143.aClass303_36);
				local68.aClass3_Sub11_Sub1_1.method5167(local25);
				local68.aClass3_Sub11_Sub1_1.method5177(Static140.aClass195_1.method4499(82) ? 1 : 0);
				Static511.method6885(local68);
				Static492.method6667(0, 0, -2, local55.method7858(), local55.method7858(), local55.anIntArray629[0], true, local55.anIntArray628[0]);
			}
		}
		@Pc(131) Class3_Sub42 local131;
		if (local21 == 1003) {
			Static416.anInt7068 = 2;
			Static158.anInt3267 = arg2;
			Static235.anInt4157 = 0;
			Static541.anInt8167 = arg1;
			local131 = Static591.method7910(Static9.aClass199_3, Static179.aClass303_41);
			local131.aClass3_Sub11_Sub1_1.method5200(local25);
			Static511.method6885(local131);
		}
		if (local21 == 15) {
			if (Static500.anInt8114 > 0 && Static140.aClass195_1.method4499(82) && Static140.aClass195_1.method4499(81)) {
				Static335.method4780(local15 + Static335.anInt5608, local18 + Static246.anInt4344, Static480.aClass41_Sub2_Sub1_Sub4_Sub2_2.aByte117);
			} else {
				Static235.anInt4157 = 0;
				Static416.anInt7068 = 1;
				Static541.anInt8167 = arg1;
				Static158.anInt3267 = arg2;
				local131 = Static591.method7910(Static9.aClass199_3, Static216.aClass303_43);
				local131.aClass3_Sub11_Sub1_1.method5200(local18 + Static246.anInt4344);
				local131.aClass3_Sub11_Sub1_1.method5201(Static335.anInt5608 + local15);
				Static511.method6885(local131);
			}
		}
		if (local21 == 1011) {
			Static158.anInt3267 = arg2;
			Static416.anInt7068 = 2;
			Static541.anInt8167 = arg1;
			Static235.anInt4157 = 0;
			local131 = Static591.method7910(Static9.aClass199_3, Static117.aClass303_33);
			local131.aClass3_Sub11_Sub1_1.method5200(local25);
			Static511.method6885(local131);
		}
		if (local21 == 19) {
			if (Static500.anInt8114 > 0 && Static140.aClass195_1.method4499(82) && Static140.aClass195_1.method4499(81)) {
				Static335.method4780(local15 + Static335.anInt5608, Static246.anInt4344 + local18, Static480.aClass41_Sub2_Sub1_Sub4_Sub2_2.aByte117);
			} else {
				local131 = Static95.method1756(local15, local25, local18);
				if (local25 == 1) {
					local131.aClass3_Sub11_Sub1_1.method5213(-1);
					local131.aClass3_Sub11_Sub1_1.method5213(-1);
					local131.aClass3_Sub11_Sub1_1.method5200((int) Static43.aFloat20);
					local131.aClass3_Sub11_Sub1_1.method5213(57);
					local131.aClass3_Sub11_Sub1_1.method5213(Static244.anInt4328);
					local131.aClass3_Sub11_Sub1_1.method5213(Static41.anInt765);
					local131.aClass3_Sub11_Sub1_1.method5213(89);
					local131.aClass3_Sub11_Sub1_1.method5200(Static480.aClass41_Sub2_Sub1_Sub4_Sub2_2.anInt9444);
					local131.aClass3_Sub11_Sub1_1.method5200(Static480.aClass41_Sub2_Sub1_Sub4_Sub2_2.anInt9442);
					local131.aClass3_Sub11_Sub1_1.method5213(63);
				} else {
					Static235.anInt4157 = 0;
					Static158.anInt3267 = arg2;
					Static416.anInt7068 = 1;
					Static541.anInt8167 = arg1;
				}
				Static511.method6885(local131);
				Static492.method6667(0, 0, -4, 1, 1, local15, true, local18);
			}
		}
		if (local21 == 2) {
			Static541.anInt8167 = arg1;
			Static158.anInt3267 = arg2;
			Static235.anInt4157 = 0;
			Static416.anInt7068 = 2;
			local131 = Static591.method7910(Static9.aClass199_3, Static107.aClass303_31);
			local131.aClass3_Sub11_Sub1_1.method5167(Static246.anInt4344 + local18);
			local131.aClass3_Sub11_Sub1_1.method5200(Static335.anInt5608 + local15);
			local131.aClass3_Sub11_Sub1_1.method5213(Static140.aClass195_1.method4499(82) ? 1 : 0);
			local131.aClass3_Sub11_Sub1_1.method5167((int) (local34 >>> 32) & Integer.MAX_VALUE);
			Static511.method6885(local131);
			Static141.method2726(local15, local18, local34);
		}
		@Pc(446) Class3_Sub42 local446;
		@Pc(427) Class41_Sub2_Sub1_Sub4_Sub2 local427;
		if (local21 == 23) {
			local427 = Static220.aClass41_Sub2_Sub1_Sub4_Sub2Array1[local25];
			if (local427 != null) {
				Static158.anInt3267 = arg2;
				Static235.anInt4157 = 0;
				Static416.anInt7068 = 2;
				Static541.anInt8167 = arg1;
				local446 = Static591.method7910(Static9.aClass199_3, Static315.aClass303_61);
				local446.aClass3_Sub11_Sub1_1.method5176(local25);
				local446.aClass3_Sub11_Sub1_1.method5200(Static28.anInt515);
				local446.aClass3_Sub11_Sub1_1.method5177(Static140.aClass195_1.method4499(82) ? 1 : 0);
				local446.aClass3_Sub11_Sub1_1.method5200(Static196.anInt9125);
				local446.aClass3_Sub11_Sub1_1.method5223(Static377.anInt6474);
				Static511.method6885(local446);
				Static492.method6667(0, 0, -2, local427.method7858(), local427.method7858(), local427.anIntArray629[0], true, local427.anIntArray628[0]);
			}
		}
		if (local21 == 17) {
			Static416.anInt7068 = 2;
			Static541.anInt8167 = arg1;
			Static158.anInt3267 = arg2;
			Static235.anInt4157 = 0;
			local131 = Static591.method7910(Static9.aClass199_3, Static45.aClass303_13);
			local131.aClass3_Sub11_Sub1_1.method5167(Static246.anInt4344 + local18);
			local131.aClass3_Sub11_Sub1_1.method5176(Integer.MAX_VALUE & (int) (local34 >>> 32));
			local131.aClass3_Sub11_Sub1_1.method5201(Static335.anInt5608 + local15);
			local131.aClass3_Sub11_Sub1_1.method5188(Static140.aClass195_1.method4499(82) ? 1 : 0);
			Static511.method6885(local131);
			Static141.method2726(local15, local18, local34);
		}
		if (local21 == 5) {
			local427 = Static220.aClass41_Sub2_Sub1_Sub4_Sub2Array1[local25];
			if (local427 != null) {
				Static235.anInt4157 = 0;
				Static541.anInt8167 = arg1;
				Static158.anInt3267 = arg2;
				Static416.anInt7068 = 2;
				local446 = Static591.method7910(Static9.aClass199_3, Static435.aClass303_77);
				local446.aClass3_Sub11_Sub1_1.method5177(Static140.aClass195_1.method4499(82) ? 1 : 0);
				local446.aClass3_Sub11_Sub1_1.method5201(local25);
				Static511.method6885(local446);
				Static492.method6667(0, 0, -2, local427.method7858(), local427.method7858(), local427.anIntArray629[0], true, local427.anIntArray628[0]);
			}
		}
		if (local21 == 60) {
			Static235.anInt4157 = 0;
			Static541.anInt8167 = arg1;
			Static416.anInt7068 = 2;
			Static158.anInt3267 = arg2;
			local131 = Static591.method7910(Static9.aClass199_3, Static514.aClass303_92);
			local131.aClass3_Sub11_Sub1_1.method5177(Static140.aClass195_1.method4499(82) ? 1 : 0);
			local131.aClass3_Sub11_Sub1_1.method5176(Static246.anInt4344 + local18);
			local131.aClass3_Sub11_Sub1_1.method5167(local25);
			local131.aClass3_Sub11_Sub1_1.method5176(Static335.anInt5608 + local15);
			Static511.method6885(local131);
			Static75.method1575(local15, local18);
		}
		@Pc(705) Class361 local705;
		if (local21 == 3) {
			local705 = Static556.method7352(local18, local15);
			if (local705 != null) {
				Static413.method5922(local705);
			}
		}
		if (local21 == 21) {
			local427 = Static220.aClass41_Sub2_Sub1_Sub4_Sub2Array1[local25];
			if (local427 != null) {
				Static416.anInt7068 = 2;
				Static541.anInt8167 = arg1;
				Static158.anInt3267 = arg2;
				Static235.anInt4157 = 0;
				local446 = Static591.method7910(Static9.aClass199_3, Static71.aClass303_21);
				local446.aClass3_Sub11_Sub1_1.method5200(local25);
				local446.aClass3_Sub11_Sub1_1.method5188(Static140.aClass195_1.method4499(82) ? 1 : 0);
				Static511.method6885(local446);
				Static492.method6667(0, 0, -2, local427.method7858(), local427.method7858(), local427.anIntArray629[0], true, local427.anIntArray628[0]);
			}
		}
		if (local21 == 12) {
			Static158.anInt3267 = arg2;
			Static416.anInt7068 = 2;
			Static541.anInt8167 = arg1;
			Static235.anInt4157 = 0;
			local131 = Static591.method7910(Static9.aClass199_3, Static364.aClass303_12);
			local131.aClass3_Sub11_Sub1_1.method5200(local15 + Static335.anInt5608);
			local131.aClass3_Sub11_Sub1_1.method5201((int) (local34 >>> 32) & Integer.MAX_VALUE);
			local131.aClass3_Sub11_Sub1_1.method5177(Static140.aClass195_1.method4499(82) ? 1 : 0);
			local131.aClass3_Sub11_Sub1_1.method5167(Static246.anInt4344 + local18);
			Static511.method6885(local131);
			Static141.method2726(local15, local18, local34);
		}
		if (local21 == 51) {
			local427 = Static220.aClass41_Sub2_Sub1_Sub4_Sub2Array1[local25];
			if (local427 != null) {
				Static416.anInt7068 = 2;
				Static541.anInt8167 = arg1;
				Static235.anInt4157 = 0;
				Static158.anInt3267 = arg2;
				local446 = Static591.method7910(Static9.aClass199_3, Static526.aClass303_94);
				local446.aClass3_Sub11_Sub1_1.method5201(local25);
				local446.aClass3_Sub11_Sub1_1.method5170(Static140.aClass195_1.method4499(82) ? 1 : 0);
				Static511.method6885(local446);
				Static492.method6667(0, 0, -2, local427.method7858(), local427.method7858(), local427.anIntArray629[0], true, local427.anIntArray628[0]);
			}
		}
		if (local21 == 11) {
			Static158.anInt3267 = arg2;
			Static541.anInt8167 = arg1;
			Static416.anInt7068 = 1;
			Static235.anInt4157 = 0;
			local131 = Static591.method7910(Static9.aClass199_3, Static521.aClass303_93);
			local131.aClass3_Sub11_Sub1_1.method5201(local18 + Static246.anInt4344);
			local131.aClass3_Sub11_Sub1_1.method5176(Static196.anInt9125);
			local131.aClass3_Sub11_Sub1_1.method5200(Static335.anInt5608 + local15);
			local131.aClass3_Sub11_Sub1_1.method5224(Static377.anInt6474);
			local131.aClass3_Sub11_Sub1_1.method5176(Static28.anInt515);
			Static511.method6885(local131);
			Static492.method6667(0, 0, -4, 1, 1, local15, true, local18);
		}
		if (local21 == 25) {
			Static416.anInt7068 = 2;
			Static235.anInt4157 = 0;
			Static158.anInt3267 = arg2;
			Static541.anInt8167 = arg1;
			local131 = Static591.method7910(Static9.aClass199_3, Static315.aClass303_61);
			local131.aClass3_Sub11_Sub1_1.method5176(Static480.aClass41_Sub2_Sub1_Sub4_Sub2_2.anInt9472);
			local131.aClass3_Sub11_Sub1_1.method5200(Static28.anInt515);
			local131.aClass3_Sub11_Sub1_1.method5177(Static140.aClass195_1.method4499(82) ? 1 : 0);
			local131.aClass3_Sub11_Sub1_1.method5200(Static196.anInt9125);
			local131.aClass3_Sub11_Sub1_1.method5223(Static377.anInt6474);
			Static511.method6885(local131);
		}
		if (local21 == 18) {
			local46 = (Class3_Sub34) Static213.aClass354_37.method7689((long) local25);
			if (local46 != null) {
				Static416.anInt7068 = 2;
				local55 = local46.aClass41_Sub2_Sub1_Sub4_Sub1_2;
				Static541.anInt8167 = arg1;
				Static235.anInt4157 = 0;
				Static158.anInt3267 = arg2;
				local68 = Static591.method7910(Static9.aClass199_3, Static154.aClass303_39);
				local68.aClass3_Sub11_Sub1_1.method5201(local25);
				local68.aClass3_Sub11_Sub1_1.method5188(Static140.aClass195_1.method4499(82) ? 1 : 0);
				Static511.method6885(local68);
				Static492.method6667(0, 0, -2, local55.method7858(), local55.method7858(), local55.anIntArray629[0], true, local55.anIntArray628[0]);
			}
		}
		if (local21 == 50) {
			Static541.anInt8167 = arg1;
			Static158.anInt3267 = arg2;
			Static235.anInt4157 = 0;
			Static416.anInt7068 = 2;
			local131 = Static591.method7910(Static9.aClass199_3, Static416.aClass303_75);
			local131.aClass3_Sub11_Sub1_1.method5224(Static377.anInt6474);
			local131.aClass3_Sub11_Sub1_1.method5201(Static196.anInt9125);
			local131.aClass3_Sub11_Sub1_1.method5167(Static28.anInt515);
			local131.aClass3_Sub11_Sub1_1.method5200(local25);
			local131.aClass3_Sub11_Sub1_1.method5188(Static140.aClass195_1.method4499(82) ? 1 : 0);
			local131.aClass3_Sub11_Sub1_1.method5176(Static246.anInt4344 + local18);
			local131.aClass3_Sub11_Sub1_1.method5167(local15 + Static335.anInt5608);
			Static511.method6885(local131);
			Static75.method1575(local15, local18);
		}
		if (local21 == 59 && Static19.aClass361_1 == null) {
			Static55.method920(local15, local18);
			Static19.aClass361_1 = Static556.method7352(local18, local15);
			Static186.method3170(Static19.aClass361_1);
		}
		if (local21 == 1004) {
			Static158.anInt3267 = arg2;
			Static416.anInt7068 = 2;
			Static235.anInt4157 = 0;
			Static541.anInt8167 = arg1;
			local131 = Static591.method7910(Static9.aClass199_3, Static257.aClass303_48);
			local131.aClass3_Sub11_Sub1_1.method5176(Static246.anInt4344 + local18);
			local131.aClass3_Sub11_Sub1_1.method5200(Static335.anInt5608 + local15);
			local131.aClass3_Sub11_Sub1_1.method5188(Static140.aClass195_1.method4499(82) ? 1 : 0);
			local131.aClass3_Sub11_Sub1_1.method5200((int) (local34 >>> 32) & Integer.MAX_VALUE);
			Static511.method6885(local131);
			Static141.method2726(local15, local18, local34);
		}
		if (local21 == 46) {
			Static235.anInt4157 = 0;
			Static541.anInt8167 = arg1;
			Static158.anInt3267 = arg2;
			Static416.anInt7068 = 2;
			local131 = Static591.method7910(Static9.aClass199_3, Static239.aClass303_46);
			local131.aClass3_Sub11_Sub1_1.method5167(local25);
			local131.aClass3_Sub11_Sub1_1.method5188(Static140.aClass195_1.method4499(82) ? 1 : 0);
			local131.aClass3_Sub11_Sub1_1.method5200(local18 + Static246.anInt4344);
			local131.aClass3_Sub11_Sub1_1.method5201(local15 + Static335.anInt5608);
			Static511.method6885(local131);
			Static75.method1575(local15, local18);
		}
		if (local21 == 45) {
			Static235.anInt4157 = 0;
			Static541.anInt8167 = arg1;
			Static158.anInt3267 = arg2;
			Static416.anInt7068 = 2;
			local131 = Static591.method7910(Static9.aClass199_3, Static467.aClass303_84);
			local131.aClass3_Sub11_Sub1_1.method5200(local25);
			local131.aClass3_Sub11_Sub1_1.method5200(Static335.anInt5608 + local15);
			local131.aClass3_Sub11_Sub1_1.method5213(Static140.aClass195_1.method4499(82) ? 1 : 0);
			local131.aClass3_Sub11_Sub1_1.method5176(Static246.anInt4344 + local18);
			Static511.method6885(local131);
			Static75.method1575(local15, local18);
		}
		if (local21 == 1006) {
			Static235.anInt4157 = 0;
			Static541.anInt8167 = arg1;
			Static416.anInt7068 = 2;
			Static158.anInt3267 = arg2;
			local46 = (Class3_Sub34) Static213.aClass354_37.method7689((long) local25);
			if (local46 != null) {
				local55 = local46.aClass41_Sub2_Sub1_Sub4_Sub1_2;
				@Pc(1432) Class264 local1432 = local55.aClass264_1;
				if (local1432.anIntArray443 != null) {
					local1432 = local1432.method5994(Static491.aClass318_1);
				}
				if (local1432 != null) {
					@Pc(1451) Class3_Sub42 local1451 = Static591.method7910(Static9.aClass199_3, Static81.aClass303_22);
					local1451.aClass3_Sub11_Sub1_1.method5200(local1432.anInt7148);
					Static511.method6885(local1451);
				}
			}
		}
		if (local21 == 16) {
			local46 = (Class3_Sub34) Static213.aClass354_37.method7689((long) local25);
			if (local46 != null) {
				Static541.anInt8167 = arg1;
				local55 = local46.aClass41_Sub2_Sub1_Sub4_Sub1_2;
				Static416.anInt7068 = 2;
				Static235.anInt4157 = 0;
				Static158.anInt3267 = arg2;
				local68 = Static591.method7910(Static9.aClass199_3, Static249.aClass303_47);
				local68.aClass3_Sub11_Sub1_1.method5215(Static377.anInt6474);
				local68.aClass3_Sub11_Sub1_1.method5167(local25);
				local68.aClass3_Sub11_Sub1_1.method5176(Static28.anInt515);
				local68.aClass3_Sub11_Sub1_1.method5201(Static196.anInt9125);
				local68.aClass3_Sub11_Sub1_1.method5188(Static140.aClass195_1.method4499(82) ? 1 : 0);
				Static511.method6885(local68);
				Static492.method6667(0, 0, -2, local55.method7858(), local55.method7858(), local55.anIntArray629[0], true, local55.anIntArray628[0]);
			}
		}
		if (local21 == 4) {
			local427 = Static220.aClass41_Sub2_Sub1_Sub4_Sub2Array1[local25];
			if (local427 != null) {
				Static416.anInt7068 = 2;
				Static235.anInt4157 = 0;
				Static541.anInt8167 = arg1;
				Static158.anInt3267 = arg2;
				local446 = Static591.method7910(Static9.aClass199_3, Static229.aClass303_44);
				local446.aClass3_Sub11_Sub1_1.method5177(Static140.aClass195_1.method4499(82) ? 1 : 0);
				local446.aClass3_Sub11_Sub1_1.method5167(local25);
				Static511.method6885(local446);
				Static492.method6667(0, 0, -2, local427.method7858(), local427.method7858(), local427.anIntArray629[0], true, local427.anIntArray628[0]);
			}
		}
		if (local21 == 13) {
			local46 = (Class3_Sub34) Static213.aClass354_37.method7689((long) local25);
			if (local46 != null) {
				Static541.anInt8167 = arg1;
				Static416.anInt7068 = 2;
				Static235.anInt4157 = 0;
				Static158.anInt3267 = arg2;
				local55 = local46.aClass41_Sub2_Sub1_Sub4_Sub1_2;
				local68 = Static591.method7910(Static9.aClass199_3, Static331.aClass303_63);
				local68.aClass3_Sub11_Sub1_1.method5176(local25);
				local68.aClass3_Sub11_Sub1_1.method5170(Static140.aClass195_1.method4499(82) ? 1 : 0);
				Static511.method6885(local68);
				Static492.method6667(0, 0, -2, local55.method7858(), local55.method7858(), local55.anIntArray629[0], true, local55.anIntArray628[0]);
			}
		}
		if (local21 == 58) {
			local427 = Static220.aClass41_Sub2_Sub1_Sub4_Sub2Array1[local25];
			if (local427 != null) {
				Static416.anInt7068 = 2;
				Static235.anInt4157 = 0;
				Static541.anInt8167 = arg1;
				Static158.anInt3267 = arg2;
				local446 = Static591.method7910(Static9.aClass199_3, Static129.aClass303_34);
				local446.aClass3_Sub11_Sub1_1.method5177(Static140.aClass195_1.method4499(82) ? 1 : 0);
				local446.aClass3_Sub11_Sub1_1.method5200(local25);
				Static511.method6885(local446);
				Static492.method6667(0, 0, -2, local427.method7858(), local427.method7858(), local427.anIntArray629[0], true, local427.anIntArray628[0]);
			}
		}
		if (local21 == 44) {
			local427 = Static220.aClass41_Sub2_Sub1_Sub4_Sub2Array1[local25];
			if (local427 != null) {
				Static158.anInt3267 = arg2;
				Static541.anInt8167 = arg1;
				Static235.anInt4157 = 0;
				Static416.anInt7068 = 2;
				local446 = Static591.method7910(Static9.aClass199_3, Static586.aClass303_28);
				local446.aClass3_Sub11_Sub1_1.method5170(Static140.aClass195_1.method4499(82) ? 1 : 0);
				local446.aClass3_Sub11_Sub1_1.method5200(local25);
				Static511.method6885(local446);
				Static492.method6667(0, 0, -2, local427.method7858(), local427.method7858(), local427.anIntArray629[0], true, local427.anIntArray628[0]);
			}
		}
		if (local21 == 6) {
			local46 = (Class3_Sub34) Static213.aClass354_37.method7689((long) local25);
			if (local46 != null) {
				Static158.anInt3267 = arg2;
				Static235.anInt4157 = 0;
				Static541.anInt8167 = arg1;
				local55 = local46.aClass41_Sub2_Sub1_Sub4_Sub1_2;
				Static416.anInt7068 = 2;
				local68 = Static591.method7910(Static9.aClass199_3, Static155.aClass303_40);
				local68.aClass3_Sub11_Sub1_1.method5170(Static140.aClass195_1.method4499(82) ? 1 : 0);
				local68.aClass3_Sub11_Sub1_1.method5201(local25);
				Static511.method6885(local68);
				Static492.method6667(0, 0, -2, local55.method7858(), local55.method7858(), local55.anIntArray629[0], true, local55.anIntArray628[0]);
			}
		}
		if (local21 == 49) {
			local427 = Static220.aClass41_Sub2_Sub1_Sub4_Sub2Array1[local25];
			if (local427 != null) {
				Static235.anInt4157 = 0;
				Static416.anInt7068 = 2;
				Static541.anInt8167 = arg1;
				Static158.anInt3267 = arg2;
				local446 = Static591.method7910(Static9.aClass199_3, Static293.aClass303_51);
				local446.aClass3_Sub11_Sub1_1.method5170(Static140.aClass195_1.method4499(82) ? 1 : 0);
				local446.aClass3_Sub11_Sub1_1.method5200(local25);
				Static511.method6885(local446);
				Static492.method6667(0, 0, -2, local427.method7858(), local427.method7858(), local427.anIntArray629[0], true, local427.anIntArray628[0]);
			}
		}
		if (local21 == 1008 || local21 == 1001 || local21 == 1012 || local21 == 1010 || local21 == 1002) {
			Static124.method7263(local21, local25, local15);
		}
		if (local21 == 30) {
			local427 = Static220.aClass41_Sub2_Sub1_Sub4_Sub2Array1[local25];
			if (local427 != null) {
				Static235.anInt4157 = 0;
				Static416.anInt7068 = 2;
				Static541.anInt8167 = arg1;
				Static158.anInt3267 = arg2;
				local446 = Static591.method7910(Static9.aClass199_3, Static63.aClass303_19);
				local446.aClass3_Sub11_Sub1_1.method5213(Static140.aClass195_1.method4499(82) ? 1 : 0);
				local446.aClass3_Sub11_Sub1_1.method5167(local25);
				Static511.method6885(local446);
				Static492.method6667(0, 0, -2, local427.method7858(), local427.method7858(), local427.anIntArray629[0], true, local427.anIntArray628[0]);
			}
		}
		if (local21 == 22) {
			Static416.anInt7068 = 2;
			Static158.anInt3267 = arg2;
			Static235.anInt4157 = 0;
			Static541.anInt8167 = arg1;
			local131 = Static591.method7910(Static9.aClass199_3, Static5.aClass303_6);
			local131.aClass3_Sub11_Sub1_1.method5213(Static140.aClass195_1.method4499(82) ? 1 : 0);
			local131.aClass3_Sub11_Sub1_1.method5167(Static196.anInt9125);
			local131.aClass3_Sub11_Sub1_1.method5171(Static377.anInt6474);
			local131.aClass3_Sub11_Sub1_1.method5201(Static28.anInt515);
			local131.aClass3_Sub11_Sub1_1.method5200(Static246.anInt4344 + local18);
			local131.aClass3_Sub11_Sub1_1.method5200(Static335.anInt5608 + local15);
			local131.aClass3_Sub11_Sub1_1.method5176(Integer.MAX_VALUE & (int) (local34 >>> 32));
			Static511.method6885(local131);
			Static141.method2726(local15, local18, local34);
		}
		if (local21 == 10 || local21 == 1007) {
			Static470.method6498(local18, local25, arg0.aString74, local15);
		}
		if (local21 == 57) {
			Static416.anInt7068 = 2;
			Static541.anInt8167 = arg1;
			Static235.anInt4157 = 0;
			Static158.anInt3267 = arg2;
			local131 = Static591.method7910(Static9.aClass199_3, Static572.aClass303_100);
			local131.aClass3_Sub11_Sub1_1.method5188(Static140.aClass195_1.method4499(82) ? 1 : 0);
			local131.aClass3_Sub11_Sub1_1.method5200(local18 + Static246.anInt4344);
			local131.aClass3_Sub11_Sub1_1.method5176(Static335.anInt5608 + local15);
			local131.aClass3_Sub11_Sub1_1.method5167((int) (local34 >>> 32) & Integer.MAX_VALUE);
			Static511.method6885(local131);
			Static141.method2726(local15, local18, local34);
		}
		if (local21 == 47) {
			Static541.anInt8167 = arg1;
			Static235.anInt4157 = 0;
			Static158.anInt3267 = arg2;
			Static416.anInt7068 = 2;
			local131 = Static591.method7910(Static9.aClass199_3, Static487.aClass303_97);
			local131.aClass3_Sub11_Sub1_1.method5177(Static140.aClass195_1.method4499(82) ? 1 : 0);
			local131.aClass3_Sub11_Sub1_1.method5176(local25);
			local131.aClass3_Sub11_Sub1_1.method5167(local18 + Static246.anInt4344);
			local131.aClass3_Sub11_Sub1_1.method5201(local15 + Static335.anInt5608);
			Static511.method6885(local131);
			Static75.method1575(local15, local18);
		}
		if (local21 == 20) {
			local46 = (Class3_Sub34) Static213.aClass354_37.method7689((long) local25);
			if (local46 != null) {
				Static158.anInt3267 = arg2;
				Static235.anInt4157 = 0;
				Static416.anInt7068 = 2;
				Static541.anInt8167 = arg1;
				local55 = local46.aClass41_Sub2_Sub1_Sub4_Sub1_2;
				local68 = Static591.method7910(Static9.aClass199_3, Static498.aClass303_91);
				local68.aClass3_Sub11_Sub1_1.method5177(Static140.aClass195_1.method4499(82) ? 1 : 0);
				local68.aClass3_Sub11_Sub1_1.method5167(local25);
				Static511.method6885(local68);
				Static492.method6667(0, 0, -2, local55.method7858(), local55.method7858(), local55.anIntArray629[0], true, local55.anIntArray628[0]);
			}
		}
		if (local21 == 9) {
			Static158.anInt3267 = arg2;
			Static416.anInt7068 = 2;
			Static541.anInt8167 = arg1;
			Static235.anInt4157 = 0;
			local131 = Static591.method7910(Static9.aClass199_3, Static270.aClass303_54);
			local131.aClass3_Sub11_Sub1_1.method5213(Static140.aClass195_1.method4499(82) ? 1 : 0);
			local131.aClass3_Sub11_Sub1_1.method5201(Static246.anInt4344 + local18);
			local131.aClass3_Sub11_Sub1_1.method5201(local25);
			local131.aClass3_Sub11_Sub1_1.method5176(local15 + Static335.anInt5608);
			Static511.method6885(local131);
			Static75.method1575(local15, local18);
		}
		if (local21 != 8) {
			if (Static369.aBoolean463) {
				Static296.method4392();
			}
			if (Static535.aClass361_16 != null && Static79.anInt6453 == 0) {
				Static186.method3170(Static535.aClass361_16);
			}
			return;
		}
		local705 = Static556.method7352(local18, local15);
		if (local705 == null) {
			return;
		}
		Static296.method4392();
		@Pc(2450) Class3_Sub36 local2450 = Static71.method1520(local705);
		Static463.method6426(local705, local2450.method5121(), local2450.anInt6062);
		Static16.aString4 = Static10.method154(local705);
		if (Static16.aString4 == null) {
			Static16.aString4 = "Null";
		}
		Static585.aString93 = local705.aString99 + "<col=ffffff>";
	}

	@OriginalMember(owner = "client!lga", name = "b", descriptor = "(I)V")
	public static void method4445() {
		Static571.anInt9281 = 0;
		Static133.aClass112_20.method3092();
		Static133.aClass112_20.method3079(Static569.aClass3_Sub43_2);
		Static571.anInt9281++;
	}

	@OriginalMember(owner = "client!lga", name = "a", descriptor = "(III)Z")
	public static boolean method4446(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return false;
	}
}
