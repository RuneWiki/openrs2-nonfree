import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static453 {

	@OriginalMember(owner = "client!pk", name = "n", descriptor = "[[Z")
	public static boolean[][] aBooleanArrayArray4;

	@OriginalMember(owner = "client!pk", name = "j", descriptor = "[I")
	public static final int[] anIntArray432 = new int[] { -1, 8192, 0, -1, 12288, 10240, 14336, -1, 4096, 6144, 2048 };

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(BII)Z")
	public static boolean method6520(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return Static312.method4927(arg0, arg1) | (arg1 & 0x70000) != 0 || Static112.method2102(arg1, arg0);
	}

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(Z)V")
	public static void method6522() {
		Static632.method8528(false);
		Static318.anInt5993 = 0;
		@Pc(12) boolean local12 = true;
		for (@Pc(14) int local14 = 0; local14 < Static457.aByteArrayArray25.length; local14++) {
			if (Static267.anIntArray285[local14] != -1 && Static457.aByteArrayArray25[local14] == null) {
				Static457.aByteArrayArray25[local14] = Static260.aClass390_61.method8914(Static267.anIntArray285[local14], 0);
				if (Static457.aByteArrayArray25[local14] == null) {
					local12 = false;
					Static318.anInt5993++;
				}
			}
			if (Static592.anIntArray537[local14] != -1 && Static220.aByteArrayArray13[local14] == null) {
				Static220.aByteArrayArray13[local14] = Static260.aClass390_61.method8927(Static278.anIntArrayArray25[local14], Static592.anIntArray537[local14], 0);
				if (Static220.aByteArrayArray13[local14] == null) {
					local12 = false;
					Static318.anInt5993++;
				}
			}
			if (Static490.anIntArray460[local14] != -1 && Static72.aByteArrayArray3[local14] == null) {
				Static72.aByteArrayArray3[local14] = Static260.aClass390_61.method8914(Static490.anIntArray460[local14], 0);
				if (Static72.aByteArrayArray3[local14] == null) {
					local12 = false;
					Static318.anInt5993++;
				}
			}
			if (Static51.anIntArray37[local14] != -1 && Static367.aByteArrayArray20[local14] == null) {
				Static367.aByteArrayArray20[local14] = Static260.aClass390_61.method8914(Static51.anIntArray37[local14], 0);
				if (Static367.aByteArrayArray20[local14] == null) {
					local12 = false;
					Static318.anInt5993++;
				}
			}
			if (Static200.anIntArray188 != null && Static62.aByteArrayArray2[local14] == null && Static200.anIntArray188[local14] != -1) {
				Static62.aByteArrayArray2[local14] = Static260.aClass390_61.method8927(Static278.anIntArrayArray25[local14], Static200.anIntArray188[local14], 0);
				if (Static62.aByteArrayArray2[local14] == null) {
					Static318.anInt5993++;
					local12 = false;
				}
			}
		}
		if (Static404.aClass116_3 == null) {
			if (Static301.aClass5_Sub3_Sub16_3 == null || !Static543.aClass390_106.method8935(Static301.aClass5_Sub3_Sub16_3.aString80 + "_staticelements")) {
				Static404.aClass116_3 = new Class116(0);
			} else if (Static543.aClass390_106.method8916(Static301.aClass5_Sub3_Sub16_3.aString80 + "_staticelements")) {
				Static404.aClass116_3 = Static53.method706(Static543.aClass390_106, Static530.aBoolean743, Static301.aClass5_Sub3_Sub16_3.aString80 + "_staticelements");
			} else {
				local12 = false;
				Static318.anInt5993++;
			}
		}
		if (!local12) {
			Static310.anInt5911 = 1;
			return;
		}
		local12 = true;
		Static408.anInt7217 = 0;
		@Pc(269) int local269;
		@Pc(280) int local280;
		for (@Pc(250) int local250 = 0; local250 < Static457.aByteArrayArray25.length; local250++) {
			@Pc(256) byte[] local256 = Static220.aByteArrayArray13[local250];
			if (local256 != null) {
				local269 = (Static611.anIntArray552[local250] >> 8) * 64 - Static153.anInt3147;
				local280 = (Static611.anIntArray552[local250] & 0xFF) * 64 - Static201.anInt3839;
				if (Static31.anInt483 != 0) {
					local269 = 10;
					local280 = 10;
				}
				local12 &= Static102.method1993(local280, local256, Static201.anInt3834, Static626.anInt10238, local269);
			}
			local256 = Static367.aByteArrayArray20[local250];
			if (local256 != null) {
				local269 = (Static611.anIntArray552[local250] >> 8) * 64 - Static153.anInt3147;
				local280 = (Static611.anIntArray552[local250] & 0xFF) * 64 - Static201.anInt3839;
				if (Static31.anInt483 != 0) {
					local269 = 10;
					local280 = 10;
				}
				local12 &= Static102.method1993(local280, local256, Static201.anInt3834, Static626.anInt10238, local269);
			}
		}
		if (!local12) {
			Static310.anInt5911 = 2;
			return;
		}
		if (Static310.anInt5911 != 0) {
			Static270.method4168(Static64.aClass52_12.method907(Static544.anInt8937) + "<br>(100%)", Static208.aClass65_7, Static604.aClass73_15, true, Static247.aClass247_16);
		}
		Static250.method3863();
		Static341.method5193();
		Static253.method3893();
		@Pc(384) boolean local384 = false;
		if (Static208.aClass65_7.method6889() && Static172.aClass5_Sub50_14.aClass12_Sub29_1.method8477() == 2) {
			for (local269 = 0; local269 < Static457.aByteArrayArray25.length; local269++) {
				if (Static367.aByteArrayArray20[local269] != null || Static72.aByteArrayArray3[local269] != null) {
					local384 = true;
					break;
				}
			}
		}
		if (Static172.aClass5_Sub50_14.aClass12_Sub20_1.method5947() == 1) {
			local269 = Static489.anIntArray456[Static489.anInt8199];
		} else {
			local269 = Static649.anIntArray594[Static489.anInt8199];
		}
		if (Static208.aClass65_7.method6930()) {
			local269++;
		}
		Static149.method2713(Static208.aClass65_7, Static396.anInt7026, Static201.anInt3834, Static626.anInt10238, local269, local384, Static208.aClass65_7.method6892() > 0);
		Static12.method190(Static109.anInt2332);
		if (Static109.anInt2332 == 0) {
			Static661.method8824((Class73) null);
		} else {
			Static661.method8824(Static431.aClass73_10);
		}
		for (local280 = 0; local280 < 4; local280++) {
			Static275.aClass106Array1[local280].method2663();
		}
		Static342.method5204();
		Static554.method7691(false);
		Static160.method2806();
		Static424.aClass20_1 = null;
		Static507.aBoolean728 = false;
		Static250.method3863();
		System.gc();
		Static632.method8528(true);
		Static118.method2225();
		Static247.anInt9314 = Static172.aClass5_Sub50_14.aClass12_Sub25_1.method6990();
		Static600.aBoolean837 = Static631.anInt10279 >= 96;
		Static302.aBoolean504 = Static172.aClass5_Sub50_14.aClass12_Sub29_1.method8477() == 2;
		Static409.aBoolean627 = Static172.aClass5_Sub50_14.aClass12_Sub4_1.method930() == 1;
		Static55.anInt837 = Static172.aClass5_Sub50_14.aClass12_Sub8_2.method2213() == 1 ? -1 : Static419.anInt7416;
		Static584.aBoolean805 = Static172.aClass5_Sub50_14.aClass12_Sub2_1.method349() == 1;
		Static675.aBoolean920 = Static172.aClass5_Sub50_14.aClass12_Sub21_1.method6299() == 1;
		Static373.aClass104_Sub1_2 = new Class104_Sub1(4, Static201.anInt3834, Static626.anInt10238, false);
		if (Static31.anInt483 == 0) {
			Static171.method2965(Static457.aByteArrayArray25, Static373.aClass104_Sub1_2);
		} else {
			Static656.method8800(Static373.aClass104_Sub1_2, Static457.aByteArrayArray25);
		}
		Static451.method6509(Static626.anInt10238 >> 4, Static201.anInt3834 >> 4);
		Static40.method583();
		if (local384) {
			Static13.method7332(true);
			Static255.aClass104_Sub1_1 = new Class104_Sub1(1, Static201.anInt3834, Static626.anInt10238, true);
			if (Static31.anInt483 == 0) {
				Static171.method2965(Static72.aByteArrayArray3, Static255.aClass104_Sub1_1);
				Static632.method8528(true);
			} else {
				Static656.method8800(Static255.aClass104_Sub1_1, Static72.aByteArrayArray3);
				Static632.method8528(true);
			}
			Static255.aClass104_Sub1_1.method2580(Static373.aClass104_Sub1_2.anIntArrayArrayArray15[0]);
			Static255.aClass104_Sub1_1.method2583((Class106[]) null, Static208.aClass65_7, (int[][][]) null);
			Static13.method7332(false);
		}
		Static373.aClass104_Sub1_2.method2583(Static275.aClass106Array1, Static208.aClass65_7, local384 ? Static255.aClass104_Sub1_1.anIntArrayArrayArray15 : null);
		if (Static31.anInt483 == 0) {
			Static632.method8528(true);
			Static513.method7300(Static373.aClass104_Sub1_2, Static220.aByteArrayArray13);
			if (Static62.aByteArrayArray2 != null) {
				Static478.method6827();
			}
		} else {
			Static632.method8528(true);
			Static168.method2939(Static373.aClass104_Sub1_2, Static220.aByteArrayArray13);
		}
		Static341.method5193();
		if (Static631.anInt10279 < 96) {
			Static486.method6993();
		}
		Static632.method8528(true);
		Static373.aClass104_Sub1_2.method2590(Static208.aClass65_7, local384 ? Static111.aClass109Array3[0] : null, (Class109) null);
		Static373.aClass104_Sub1_2.method2604(Static208.aClass65_7, false);
		Static632.method8528(true);
		if (local384) {
			Static13.method7332(true);
			Static632.method8528(true);
			if (Static31.anInt483 == 0) {
				Static513.method7300(Static255.aClass104_Sub1_1, Static367.aByteArrayArray20);
			} else {
				Static168.method2939(Static255.aClass104_Sub1_1, Static367.aByteArrayArray20);
			}
			Static341.method5193();
			Static632.method8528(true);
			Static255.aClass104_Sub1_1.method2590(Static208.aClass65_7, (Class109) null, Static605.aClass109Array5[0]);
			Static255.aClass104_Sub1_1.method2604(Static208.aClass65_7, true);
			Static632.method8528(true);
			Static13.method7332(false);
		}
		Static198.method7145();
		@Pc(760) int local760 = Static373.aClass104_Sub1_2.anInt2919;
		if (local760 > Static481.anInt8082) {
			local760 = Static481.anInt8082;
		}
		if (local760 < Static481.anInt8082 - 1) {
			local760 = Static481.anInt8082 - 1;
		}
		if (Static172.aClass5_Sub50_14.aClass12_Sub8_2.method2213() == 0) {
			Static610.method8302(local760);
		} else {
			Static610.method8302(0);
		}
		@Pc(798) int local798;
		@Pc(802) int local802;
		for (@Pc(794) int local794 = 0; local794 < 4; local794++) {
			for (local798 = 0; local798 < Static201.anInt3834; local798++) {
				for (local802 = 0; local802 < Static626.anInt10238; local802++) {
					Static351.method4744(local794, local798, local802);
				}
			}
		}
		Static634.method8552();
		Static250.method3863();
		Static15.method211();
		Static341.method5193();
		Static221.method8980();
		@Pc(853) Class5_Sub21 local853;
		if (Static147.aFrame1 != null && Static12.aClass244_1 != null && Static173.anInt3397 == 11) {
			local853 = Static64.method905(Static263.aClass49_1, Static640.aClass305_101);
			local853.aClass5_Sub41_Sub2_1.method7803(1057001181);
			Static495.method7092(local853);
		}
		if (Static31.anInt483 == 0) {
			local798 = (Static427.anInt7491 - (Static201.anInt3834 >> 4)) / 8;
			local802 = ((Static201.anInt3834 >> 4) + Static427.anInt7491) / 8;
			@Pc(889) int local889 = (Static436.anInt7546 - (Static626.anInt10238 >> 4)) / 8;
			@Pc(897) int local897 = ((Static626.anInt10238 >> 4) + Static436.anInt7546) / 8;
			for (@Pc(901) int local901 = local798 - 1; local901 <= local802 + 1; local901++) {
				for (@Pc(907) int local907 = local889 - 1; local907 <= local897 + 1; local907++) {
					if (local901 < local798 || local901 > local802 || local907 < local889 || local907 > local897) {
						Static260.aClass390_61.method8929("m" + local901 + "_" + local907);
						Static260.aClass390_61.method8929("l" + local901 + "_" + local907);
					}
				}
			}
		}
		if (Static173.anInt3397 == 4) {
			Static271.method4671(3);
		} else if (Static173.anInt3397 == 8) {
			Static271.method4671(7);
		} else {
			Static271.method4671(10);
			if (Static12.aClass244_1 != null) {
				local853 = Static64.method905(Static263.aClass49_1, Static442.aClass305_69);
				Static495.method7092(local853);
			}
		}
		Static63.method889();
		Static250.method3863();
		Static495.method7089();
		Static375.aBoolean591 = true;
		if (Static288.aBoolean486) {
			Static574.method7927("Took: " + (Static547.method7619() - Static504.aLong238) + "ms");
			Static288.aBoolean486 = false;
		}
	}
}
