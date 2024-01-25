import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static570 {

	@OriginalMember(owner = "client!uga", name = "b", descriptor = "Lclient!bf;")
	public static final Class31 aClass31_4 = new Class31();

	@OriginalMember(owner = "client!uga", name = "a", descriptor = "(Ljava/lang/String;BCLjava/lang/String;)Ljava/lang/String;")
	public static String method8510(@OriginalArg(0) String arg0, @OriginalArg(3) String arg1) {
		@Pc(8) int local8 = arg0.length();
		@Pc(11) int local11 = arg1.length();
		@Pc(13) int local13 = local8;
		@Pc(17) int local17 = local11 - 1;
		if (local17 != 0) {
			@Pc(24) int local24 = 0;
			while (true) {
				local24 = arg0.indexOf(13, local24);
				if (local24 < 0) {
					break;
				}
				local24++;
				local13 += local17;
			}
		}
		@Pc(43) StringBuffer local43 = new StringBuffer(local13);
		@Pc(45) int local45 = 0;
		while (true) {
			@Pc(55) int local55 = arg0.indexOf(13, local45);
			if (local55 < 0) {
				local43.append(arg0.substring(local45));
				return local43.toString();
			}
			local43.append(arg0.substring(local45, local55));
			local43.append(arg1);
			local45 = local55 + 1;
		}
	}

	@OriginalMember(owner = "client!uga", name = "a", descriptor = "(IILjava/lang/String;)V")
	public static void method8511(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1) {
		@Pc(14) Class2_Sub52 local14 = Static130.method3019(Static365.aClass94_74, Static361.aClass183_1);
		local14.aClass2_Sub11_Sub2_7.method8374(Static296.method5291(arg1) + 1);
		local14.aClass2_Sub11_Sub2_7.method8366(arg0);
		local14.aClass2_Sub11_Sub2_7.method8329(arg1);
		Static96.method2563(local14);
	}

	@OriginalMember(owner = "client!uga", name = "c", descriptor = "(I)V")
	public static void method8516() {
		if (!Static65.aBoolean754) {
			Static374.aBoolean539 = Static103.anInt2857 != -1 && Static298.anInt6262 >= Static103.anInt2857 || Static423.anInt7984 < Static298.anInt6262 * 16 + (Static292.aBoolean464 ? 26 : 22);
		}
		Static424.aClass341_46.method8525();
		Static155.aClass341_36.method8525();
		@Pc(54) int local54;
		for (@Pc(49) Class2_Sub6_Sub3 local49 = (Class2_Sub6_Sub3) Static216.aClass341_39.method8524(); local49 != null; local49 = (Class2_Sub6_Sub3) Static216.aClass341_39.method8519()) {
			local54 = local49.anInt2631;
			if (local54 < 1000) {
				local49.method9253();
				if (local54 == 15 || local54 == 2 || local54 == 30 || local54 == 49 || local54 == 51 || local54 == 50 || local54 == 6) {
					Static155.aClass341_36.method8528(local49);
				} else {
					Static424.aClass341_46.method8528(local49);
				}
			}
		}
		Static424.aClass341_46.method8517(Static216.aClass341_39);
		Static155.aClass341_36.method8517(Static216.aClass341_39);
		if (Static298.anInt6262 > 1) {
			if (Static362.aBoolean525 && Static449.aClass90_1.method8781(81) && Static298.anInt6262 > 2) {
				Static74.aClass2_Sub6_Sub3_1 = (Class2_Sub6_Sub3) Static216.aClass341_39.aClass2_271.aClass2_300.aClass2_300;
			} else {
				Static74.aClass2_Sub6_Sub3_1 = (Class2_Sub6_Sub3) Static216.aClass341_39.aClass2_271.aClass2_300;
			}
			Static280.aClass2_Sub6_Sub3_3 = (Class2_Sub6_Sub3) Static216.aClass341_39.aClass2_271.aClass2_300;
		} else {
			Static74.aClass2_Sub6_Sub3_1 = null;
			Static280.aClass2_Sub6_Sub3_3 = null;
		}
		local54 = -1;
		@Pc(158) Class2_Sub9 local158 = (Class2_Sub9) Static253.aClass341_64.method8524();
		if (local158 != null) {
			local54 = local158.method7081();
		}
		if (!Static65.aBoolean754) {
			if (local54 == 0 && (Static578.anInt8192 == 1 && Static298.anInt6262 > 2 || Static578.method7000())) {
				local54 = 2;
			}
			if (local54 == 2 && Static298.anInt6262 > 0 && local158 != null) {
				if (Static612.aClass24_17 == null && Static606.anInt10699 == 0) {
					Static638.method9208(local158.method7079(), local158.method7082());
				} else {
					Static600.anInt10555 = 2;
				}
			}
			if (local54 == 0) {
				if (Static74.aClass2_Sub6_Sub3_1 != null) {
					Static252.method4680();
				} else if (Static475.aBoolean695) {
					Static117.method2902();
				}
			}
			if (Static612.aClass24_17 != null || Static606.anInt10699 != 0) {
				return;
			}
			Static388.aClass2_Sub6_Sub3_4 = null;
			Static600.anInt10555 = 0;
			return;
		}
		@Pc(173) int local173;
		@Pc(177) int local177;
		@Pc(256) int local256;
		@Pc(258) int local258;
		if (local54 == -1) {
			local173 = Static628.aClass9_1.method803();
			local177 = Static628.aClass9_1.method800();
			@Pc(179) boolean local179 = false;
			if (Static532.aClass2_Sub6_Sub21_1 != null) {
				if (Static202.anInt4656 - 10 <= local173 && local173 <= Static202.anInt4656 + Static40.anInt1336 + 10 && Static169.anInt731 - 10 <= local177 && local177 <= Static440.anInt8157 + Static169.anInt731 + 10) {
					local179 = true;
				} else {
					Static266.method4907();
				}
			}
			if (!local179) {
				if (Static274.anInt5852 - 10 > local173 || local173 > Static274.anInt5852 + Static278.anInt5905 + 10 || local177 < Static332.anInt6717 - 10 || Static332.anInt6717 + Static589.anInt10431 + 10 < local177) {
					Static101.method2660();
				} else if (Static374.aBoolean539) {
					local256 = -1;
					local258 = -1;
					@Pc(272) int local272;
					for (@Pc(260) int local260 = 0; local260 < Static193.anInt4507; local260++) {
						if (Static292.aBoolean464) {
							local272 = local260 * 16 + Static332.anInt6717 + 33;
							if (local272 - 13 < local177 && local272 + 4 > local177) {
								local258 = local272 - 13;
								local256 = local260;
								break;
							}
						} else {
							local272 = local260 * 16 + Static332.anInt6717 + 31;
							if (local177 > local272 - 13 && local177 < local272 + 3) {
								local258 = local272 - 13;
								local256 = local260;
								break;
							}
						}
					}
					if (local256 != -1) {
						local272 = 0;
						@Pc(343) Class251 local343 = new Class251(Static522.aClass211_7);
						for (@Pc(348) Class2_Sub6_Sub21 local348 = (Class2_Sub6_Sub21) local343.method6623(); local348 != null; local348 = (Class2_Sub6_Sub21) local343.method6626()) {
							if (local272 == local256) {
								if (local348.anInt10705 > 1) {
									Static342.method5877(local348, local177, local258);
								}
								break;
							}
							local272++;
						}
					}
				}
			}
		}
		if (local54 != 0) {
			return;
		}
		local173 = local158.method7079();
		local177 = local158.method7082();
		@Pc(414) int local414;
		@Pc(487) Class251 local487;
		@Pc(492) Class2_Sub6_Sub3 local492;
		if (Static532.aClass2_Sub6_Sub21_1 != null && local173 >= Static202.anInt4656 && Static40.anInt1336 + Static202.anInt4656 >= local173 && local177 >= Static169.anInt731 && Static169.anInt731 + Static440.anInt8157 >= local177) {
			local414 = -1;
			for (local256 = 0; local256 < Static532.aClass2_Sub6_Sub21_1.anInt10705; local256++) {
				if (Static292.aBoolean464) {
					local258 = Static169.anInt731 + local256 * 16 + 33;
					if (local177 > local258 - 13 && local258 + 4 > local177) {
						local414 = local256;
					}
				} else {
					local258 = local256 * 16 + Static169.anInt731 + 31;
					if (local258 - 13 < local177 && local258 + 3 > local177) {
						local414 = local256;
					}
				}
			}
			if (local414 != -1) {
				local258 = 0;
				local487 = new Class251(Static532.aClass2_Sub6_Sub21_1.aClass211_12);
				for (local492 = (Class2_Sub6_Sub3) local487.method6623(); local492 != null; local492 = (Class2_Sub6_Sub3) local487.method6626()) {
					if (local414 == local258) {
						Static88.method2465(local492, local177, local173);
						break;
					}
					local258++;
				}
			}
			Static101.method2660();
			return;
		}
		if (local173 < Static274.anInt5852 || local173 > Static274.anInt5852 + Static278.anInt5905 || local177 < Static332.anInt6717 || local177 > Static332.anInt6717 + Static589.anInt10431) {
			return;
		}
		if (Static374.aBoolean539) {
			local414 = -1;
			for (local256 = 0; local256 < Static193.anInt4507; local256++) {
				if (Static292.aBoolean464) {
					local258 = Static332.anInt6717 + local256 * 16 + 33;
					if (local258 - 13 < local177 && local177 < local258 + 4) {
						local414 = local256;
						break;
					}
				} else {
					local258 = Static332.anInt6717 + local256 * 16 + 31;
					if (local258 - 13 < local177 && local258 + 3 > local177) {
						local414 = local256;
						break;
					}
				}
			}
			if (local414 != -1) {
				local258 = 0;
				local487 = new Class251(Static522.aClass211_7);
				for (@Pc(632) Class2_Sub6_Sub21 local632 = (Class2_Sub6_Sub21) local487.method6623(); local632 != null; local632 = (Class2_Sub6_Sub21) local487.method6626()) {
					if (local414 == local258) {
						Static88.method2465((Class2_Sub6_Sub3) local632.aClass211_12.aClass2_Sub6_48.aClass2_Sub6_66, local177, local173);
						Static101.method2660();
						return;
					}
					local258++;
				}
				return;
			}
		} else {
			local414 = -1;
			for (local256 = 0; local256 < Static298.anInt6262; local256++) {
				if (Static292.aBoolean464) {
					local258 = Static332.anInt6717 + (Static298.anInt6262 - (1 - -local256)) * 16 + 33;
					if (local177 > local258 - 13 && local177 < local258 + 4) {
						local414 = local256;
					}
				} else {
					local258 = Static332.anInt6717 + (Static298.anInt6262 - local256 - 1) * 16 + 31;
					if (local177 > local258 - 13 && local258 + 3 > local177) {
						local414 = local256;
					}
				}
			}
			if (local414 != -1) {
				local258 = 0;
				@Pc(756) Class56 local756 = new Class56(Static216.aClass341_39);
				for (local492 = (Class2_Sub6_Sub3) local756.method2108(); local492 != null; local492 = (Class2_Sub6_Sub3) local756.method2110()) {
					if (local414 == local258) {
						Static88.method2465(local492, local177, local173);
						break;
					}
					local258++;
				}
			}
			Static101.method2660();
		}
		return;
	}
}
