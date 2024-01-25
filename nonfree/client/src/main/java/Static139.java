import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static139 {

	@OriginalMember(owner = "client!ej", name = "b", descriptor = "Lclient!uq;")
	public static Class362 aClass362_84;

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "[J")
	private static final long[] aLongArray14 = new long[100];

	@OriginalMember(owner = "client!ej", name = "d", descriptor = "[Lclient!oea;")
	public static final Interface18[] anInterface18Array3 = new Interface18[75];

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(I)Z")
	public static boolean method5490() throws IOException {
		if (Static12.aClass26_1 == null) {
			return false;
		}
		@Pc(73) int local73;
		if (Static307.aClass171_79 == null) {
			if (Static133.aBoolean196) {
				if (!Static12.aClass26_1.method741(1)) {
					return false;
				}
				Static12.aClass26_1.method743(1, Static459.aClass3_Sub4_Sub1_1.aByteArray90, 0);
				Static492.anInt840++;
				Static493.anInt7808 = 0;
				Static133.aBoolean196 = false;
			}
			Static459.aClass3_Sub4_Sub1_1.anInt9739 = 0;
			if (Static459.aClass3_Sub4_Sub1_1.method337()) {
				if (!Static12.aClass26_1.method741(1)) {
					return false;
				}
				Static12.aClass26_1.method743(1, Static459.aClass3_Sub4_Sub1_1.aByteArray90, 1);
				Static493.anInt7808 = 0;
				Static492.anInt840++;
			}
			Static133.aBoolean196 = true;
			@Pc(69) Class171[] local69 = Static344.method5007();
			local73 = Static459.aClass3_Sub4_Sub1_1.method331();
			if (local73 < 0 || local69.length <= local73) {
				throw new IOException("invo:" + local73 + " ip:" + Static459.aClass3_Sub4_Sub1_1.anInt9739);
			}
			Static307.aClass171_79 = local69[local73];
			Static147.anInt2709 = Static307.aClass171_79.anInt4655;
		}
		if (Static147.anInt2709 == -1) {
			if (!Static12.aClass26_1.method741(1)) {
				return false;
			}
			Static12.aClass26_1.method743(1, Static459.aClass3_Sub4_Sub1_1.aByteArray90, 0);
			Static147.anInt2709 = Static459.aClass3_Sub4_Sub1_1.aByteArray90[0] & 0xFF;
			Static493.anInt7808 = 0;
			Static492.anInt840++;
		}
		if (Static147.anInt2709 == -2) {
			if (!Static12.aClass26_1.method741(2)) {
				return false;
			}
			Static12.aClass26_1.method743(2, Static459.aClass3_Sub4_Sub1_1.aByteArray90, 0);
			Static459.aClass3_Sub4_Sub1_1.anInt9739 = 0;
			Static147.anInt2709 = Static459.aClass3_Sub4_Sub1_1.method7951();
			Static492.anInt840 += 2;
			Static493.anInt7808 = 0;
		}
		if (Static147.anInt2709 > 0) {
			if (!Static12.aClass26_1.method741(Static147.anInt2709)) {
				return false;
			}
			Static459.aClass3_Sub4_Sub1_1.anInt9739 = 0;
			Static12.aClass26_1.method743(Static147.anInt2709, Static459.aClass3_Sub4_Sub1_1.aByteArray90, 0);
			Static492.anInt840 += Static147.anInt2709;
			Static493.anInt7808 = 0;
		}
		Static78.aClass171_15 = Static268.aClass171_64;
		Static268.aClass171_64 = Static103.aClass171_19;
		Static103.aClass171_19 = Static307.aClass171_79;
		@Pc(224) int local224;
		@Pc(216) int local216;
		@Pc(234) Class3_Sub25 local234;
		if (Static356.aClass171_96 == Static307.aClass171_79) {
			local216 = Static459.aClass3_Sub4_Sub1_1.method7947();
			local73 = Static459.aClass3_Sub4_Sub1_1.method7934();
			local224 = Static459.aClass3_Sub4_Sub1_1.method7959();
			Static176.method2776();
			local234 = (Class3_Sub25) Static513.aClass333_33.method7489((long) local216);
			if (local234 != null) {
				Static186.method2905(local234, local224 != local234.anInt3959, false);
			}
			Static569.method7479(local224, local73, local216, false);
			Static307.aClass171_79 = null;
			return true;
		}
		@Pc(275) String local275;
		@Pc(304) String local304;
		@Pc(277) String local277;
		if (Static591.aClass171_144 == Static307.aClass171_79) {
			local216 = Static459.aClass3_Sub4_Sub1_1.method7896();
			local73 = Static459.aClass3_Sub4_Sub1_1.method7895();
			local224 = Static459.aClass3_Sub4_Sub1_1.method7954();
			local275 = "";
			local277 = local275;
			if ((local224 & 0x1) != 0) {
				local275 = Static459.aClass3_Sub4_Sub1_1.method7922();
				if ((local224 & 0x2) == 0) {
					local277 = local275;
				} else {
					local277 = Static459.aClass3_Sub4_Sub1_1.method7922();
				}
			}
			local304 = Static459.aClass3_Sub4_Sub1_1.method7922();
			if (local216 == 99) {
				Static85.method1345(local304);
			} else if (local277.equals("") || !Static86.method1379(local277)) {
				Static390.method5455(local73, local304, local275, local216, local275, local277);
			} else {
				Static307.aClass171_79 = null;
				return true;
			}
			Static307.aClass171_79 = null;
			return true;
		}
		@Pc(364) int local364;
		@Pc(376) int local376;
		@Pc(386) long local386;
		@Pc(392) Class3_Sub40 local392;
		if (Static372.aClass171_98 == Static307.aClass171_79) {
			local216 = Static459.aClass3_Sub4_Sub1_1.method7921();
			local73 = Static459.aClass3_Sub4_Sub1_1.method7951();
			local224 = Static459.aClass3_Sub4_Sub1_1.method7926();
			if (local224 == 65535) {
				local224 = -1;
			}
			local364 = Static459.aClass3_Sub4_Sub1_1.method7959();
			if (local364 == 65535) {
				local364 = -1;
			}
			Static176.method2776();
			for (local376 = local224; local376 <= local364; local376++) {
				local386 = ((long) local216 << 32) + (long) local376;
				local392 = (Class3_Sub40) Static26.aClass333_3.method7489(local386);
				@Pc(401) Class3_Sub40 local401;
				if (local392 != null) {
					local401 = new Class3_Sub40(local392.anInt7824, local73);
					local392.method9034();
				} else if (local376 == -1) {
					local401 = new Class3_Sub40(Static223.method3278(local216).aClass3_Sub40_3.anInt7824, local73);
				} else {
					local401 = new Class3_Sub40(0, local73);
				}
				Static26.aClass333_3.method7488(local386, local401);
			}
			Static307.aClass171_79 = null;
			return true;
		}
		@Pc(526) int local526;
		@Pc(584) int local584;
		@Pc(534) String local534;
		@Pc(493) boolean local493;
		if (Static307.aClass171_79 == Static445.aClass171_117) {
			local216 = Static459.aClass3_Sub4_Sub1_1.method7951();
			@Pc(459) Class34_Sub1_Sub1_Sub2_Sub1 local459;
			if (Static291.anInt4955 == local216) {
				local459 = Static204.aClass34_Sub1_Sub1_Sub2_Sub1_1;
			} else {
				local459 = Static506.aClass34_Sub1_Sub1_Sub2_Sub1Array1[local216];
			}
			if (local459 == null) {
				Static307.aClass171_79 = null;
				return true;
			}
			local224 = Static459.aClass3_Sub4_Sub1_1.method7951();
			local364 = Static459.aClass3_Sub4_Sub1_1.method7954();
			@Pc(485) boolean local485 = (local224 & 0x8000) != 0;
			if (local459.aString25 != null && local459.aClass376_1 != null) {
				local493 = false;
				if (local364 <= 1) {
					if (!local485 && (Static511.aBoolean563 && !Static14.aBoolean14 || Static656.aBoolean736)) {
						local493 = true;
					} else if (Static86.method1379(local459.aString25)) {
						local493 = true;
					}
				}
				if (!local493 && Static260.anInt4566 == 0) {
					local526 = -1;
					if (local485) {
						local224 &= 0x7FFF;
						@Pc(544) Class313 local544 = Static278.method4062(Static459.aClass3_Sub4_Sub1_1);
						local526 = local544.anInt8328;
						local534 = local544.aClass3_Sub5_Sub16_1.method6746(Static459.aClass3_Sub4_Sub1_1);
					} else {
						local534 = Static495.method6507(Static588.method7791(Static459.aClass3_Sub4_Sub1_1));
					}
					local459.aString108 = local534.trim();
					local459.anInt9661 = 150;
					local459.anInt9663 = local224 & 0xFF;
					local459.anInt9654 = local224 >> 8;
					if (local364 == 1 || local364 == 2) {
						local584 = local485 ? 17 : 1;
					} else {
						local584 = local485 ? 17 : 2;
					}
					if (local364 == 2) {
						Static556.method7325(local526, local534, 0, (String) null, local584, "<img=1>" + local459.method1482(), "<img=1>" + local459.method1485(), local459.aString24);
					} else if (local364 == 1) {
						Static556.method7325(local526, local534, 0, (String) null, local584, "<img=0>" + local459.method1482(), "<img=0>" + local459.method1485(), local459.aString24);
					} else {
						Static556.method7325(local526, local534, 0, (String) null, local584, local459.method1482(), local459.method1485(), local459.aString24);
					}
				}
			}
			Static307.aClass171_79 = null;
			return true;
		} else if (Static57.aClass171_12 == Static307.aClass171_79) {
			local216 = Static459.aClass3_Sub4_Sub1_1.method7929();
			if (local216 != Static75.anInt1476) {
				Static75.anInt1476 = local216;
				Static250.method3776(Static495.aClass343_11, -1, -1);
			}
			Static307.aClass171_79 = null;
			return true;
		} else {
			@Pc(725) String local725;
			@Pc(721) boolean local721;
			@Pc(788) int local788;
			if (Static493.aClass171_124 == Static307.aClass171_79) {
				local216 = Static459.aClass3_Sub4_Sub1_1.method7954();
				local721 = (local216 & 0x1) == 1;
				local725 = Static459.aClass3_Sub4_Sub1_1.method7922();
				local275 = Static459.aClass3_Sub4_Sub1_1.method7922();
				if (local275.equals("")) {
					local275 = local725;
				}
				local277 = Static459.aClass3_Sub4_Sub1_1.method7922();
				local304 = Static459.aClass3_Sub4_Sub1_1.method7922();
				if (local304.equals("")) {
					local304 = local277;
				}
				if (local721) {
					for (local788 = 0; local788 < Static31.anInt753; local788++) {
						if (Static459.aStringArray54[local788].equals(local304)) {
							Static137.aStringArray22[local788] = local725;
							Static459.aStringArray54[local788] = local275;
							Static632.aStringArray64[local788] = local277;
							Static133.aStringArray21[local788] = local304;
							break;
						}
					}
				} else {
					Static137.aStringArray22[Static31.anInt753] = local725;
					Static459.aStringArray54[Static31.anInt753] = local275;
					Static632.aStringArray64[Static31.anInt753] = local277;
					Static133.aStringArray21[Static31.anInt753] = local304;
					Static18.aBooleanArray1[Static31.anInt753] = (local216 & 0x2) == 2;
					Static31.anInt753++;
				}
				Static321.anInt10318 = Static156.anInt2887;
				Static307.aClass171_79 = null;
				return true;
			} else if (Static254.aClass171_60 == Static307.aClass171_79) {
				local216 = Static459.aClass3_Sub4_Sub1_1.method7934();
				local73 = Static459.aClass3_Sub4_Sub1_1.method7899();
				local224 = Static459.aClass3_Sub4_Sub1_1.method7954();
				local364 = Static459.aClass3_Sub4_Sub1_1.method7914();
				local376 = Static459.aClass3_Sub4_Sub1_1.method7926();
				Static176.method2776();
				Static185.aBooleanArray13[local73] = true;
				Static488.anIntArray419[local73] = local364;
				Static122.anIntArray131[local73] = local216;
				Static69.anIntArray518[local73] = local224;
				Static522.anIntArray441[local73] = local376;
				Static307.aClass171_79 = null;
				return true;
			} else if (Static307.aClass171_79 == Static247.aClass171_57) {
				local216 = Static459.aClass3_Sub4_Sub1_1.method7951();
				local73 = Static459.aClass3_Sub4_Sub1_1.method7951();
				local224 = Static459.aClass3_Sub4_Sub1_1.method7951();
				Static176.method2776();
				if (Static270.aClass265ArrayArray2[local216] != null) {
					for (local364 = local73; local364 < local224; local364++) {
						local376 = Static459.aClass3_Sub4_Sub1_1.method7945();
						if (Static270.aClass265ArrayArray2[local216].length > local364 && Static270.aClass265ArrayArray2[local216][local364] != null) {
							Static270.aClass265ArrayArray2[local216][local364].anInt6966 = local376;
						}
					}
				}
				Static307.aClass171_79 = null;
				return true;
			} else {
				@Pc(962) int local962;
				@Pc(1002) int local1002;
				@Pc(1128) boolean local1128;
				@Pc(1037) int local1037;
				@Pc(1497) int local1497;
				@Pc(1212) int local1212;
				@Pc(995) int local995;
				@Pc(1035) int local1035;
				@Pc(1029) int local1029;
				@Pc(1343) boolean local1343;
				if (Static307.aClass171_79 == Static568.aClass171_138) {
					local216 = Static459.aClass3_Sub4_Sub1_1.method7951();
					local73 = Static459.aClass3_Sub4_Sub1_1.method7895();
					local224 = Static459.aClass3_Sub4_Sub1_1.method7934();
					local364 = Static459.aClass3_Sub4_Sub1_1.method7959();
					local376 = Static459.aClass3_Sub4_Sub1_1.method7959();
					local962 = Static459.aClass3_Sub4_Sub1_1.method7954();
					local788 = local224 & 0x7;
					local526 = local224 >> 3 & 0xF;
					if (local526 == 15) {
						local526 = -1;
					}
					if (local73 >> 30 == 0) {
						@Pc(1177) Class239 local1177;
						@Pc(1171) Class239 local1171;
						@Pc(1155) Class106 local1155;
						if (local73 >> 29 != 0) {
							local584 = local73 & 0xFFFF;
							@Pc(1326) Class3_Sub52 local1326 = (Class3_Sub52) Static105.aClass333_11.method7489((long) local584);
							if (local1326 != null) {
								@Pc(1331) Class34_Sub1_Sub1_Sub2_Sub2 local1331 = local1326.aClass34_Sub1_Sub1_Sub2_Sub2_2;
								if (local216 == 65535) {
									local216 = -1;
								}
								@Pc(1341) Class190 local1341 = local1331.aClass190Array3[local962];
								local1343 = true;
								local1037 = local1341.anInt5051;
								if (local216 != -1 && local1037 != -1) {
									if (local216 == local1037) {
										local1155 = Static366.aClass182_2.method4107(local216);
										if (local1155.aBoolean203 && local1155.anInt2680 != -1) {
											local1171 = Static13.aClass213_1.method5008(local1155.anInt2680);
											@Pc(1422) int local1422 = local1171.anInt6416;
											if (local1422 == 0 || local1422 == 2) {
												local1343 = false;
											} else if (local1422 == 1) {
												local1343 = true;
											}
										}
									} else {
										local1155 = Static366.aClass182_2.method4107(local216);
										@Pc(1369) Class106 local1369 = Static366.aClass182_2.method4107(local1037);
										if (local1155.anInt2680 != -1 && local1369.anInt2680 != -1) {
											local1177 = Static13.aClass213_1.method5008(local1155.anInt2680);
											@Pc(1391) Class239 local1391 = Static13.aClass213_1.method5008(local1369.anInt2680);
											if (local1177.anInt6404 < local1391.anInt6404) {
												local1343 = false;
											}
										}
									}
								}
								if (local1343) {
									local1341.anInt5047 = 0;
									local1341.anInt5052 = local788;
									local1341.anInt5057 = 1;
									local1341.anInt5051 = local216;
									local1341.anInt5056 = local526;
									local1341.anInt5054 = Static122.anInt2190 + local376;
									local1341.anInt5053 = 0;
									local1341.anInt5048 = local364;
									if (local1341.anInt5054 > Static122.anInt2190) {
										local1341.anInt5047 = -1;
									}
									if (local1341.anInt5051 == 65535) {
										local1341.anInt5051 = -1;
									}
									if (local1341.anInt5051 != -1 && local1341.anInt5054 == Static122.anInt2190) {
										local1497 = Static366.aClass182_2.method4107(local1341.anInt5051).anInt2680;
										if (local1497 != -1) {
											local1171 = Static13.aClass213_1.method5008(local1497);
											if (local1171 != null && local1171.anIntArray339 != null && !local1331.aBoolean674) {
												Static305.method4420(local1331, local1171, 0);
											}
										}
									}
								}
							}
						} else if (local73 >> 28 != 0) {
							local584 = local73 & 0xFFFF;
							@Pc(1106) Class34_Sub1_Sub1_Sub2_Sub1 local1106;
							if (local584 == Static291.anInt4955) {
								local1106 = Static204.aClass34_Sub1_Sub1_Sub2_Sub1_1;
							} else {
								local1106 = Static506.aClass34_Sub1_Sub1_Sub2_Sub1Array1[local584];
							}
							if (local1106 != null) {
								if (local216 == 65535) {
									local216 = -1;
								}
								@Pc(1126) Class190 local1126 = local1106.aClass190Array3[local962];
								local1128 = true;
								local1035 = local1126.anInt5051;
								@Pc(1209) Class239 local1209;
								if (local216 != -1 && local1035 != -1) {
									@Pc(1150) Class106 local1150;
									if (local1035 == local216) {
										local1150 = Static366.aClass182_2.method4107(local216);
										if (local1150.aBoolean203 && local1150.anInt2680 != -1) {
											local1209 = Static13.aClass213_1.method5008(local1150.anInt2680);
											local1212 = local1209.anInt6416;
											if (local1212 == 0 || local1212 == 2) {
												local1128 = false;
											} else if (local1212 == 1) {
												local1128 = true;
											}
										}
									} else {
										local1150 = Static366.aClass182_2.method4107(local216);
										local1155 = Static366.aClass182_2.method4107(local1035);
										if (local1150.anInt2680 != -1 && local1155.anInt2680 != -1) {
											local1171 = Static13.aClass213_1.method5008(local1150.anInt2680);
											local1177 = Static13.aClass213_1.method5008(local1155.anInt2680);
											if (local1171.anInt6404 < local1177.anInt6404) {
												local1128 = false;
											}
										}
									}
								}
								if (local1128) {
									local1126.anInt5047 = 0;
									local1126.anInt5048 = local364;
									local1126.anInt5051 = local216;
									local1126.anInt5053 = 0;
									local1126.anInt5057 = 1;
									local1126.anInt5056 = local526;
									local1126.anInt5054 = local376 + Static122.anInt2190;
									local1126.anInt5052 = local788;
									if (local1126.anInt5051 == 65535) {
										local1126.anInt5051 = -1;
									}
									if (local1126.anInt5054 > Static122.anInt2190) {
										local1126.anInt5047 = -1;
									}
									if (local1126.anInt5051 != -1 && Static122.anInt2190 == local1126.anInt5054) {
										local1037 = Static366.aClass182_2.method4107(local1126.anInt5051).anInt2680;
										if (local1037 != -1) {
											local1209 = Static13.aClass213_1.method5008(local1037);
											if (local1209 != null && local1209.anIntArray339 != null && !local1106.aBoolean674) {
												Static305.method4420(local1106, local1209, 0);
											}
										}
									}
								}
							}
						}
					} else {
						local584 = local73 >> 28 & 0x3;
						local995 = (local73 >> 14 & 0x3FFF) - Static534.anInt8358;
						local1002 = (local73 & 0x3FFF) - Static402.anInt6661;
						if (local995 >= 0 && local1002 >= 0 && Static98.anInt361 > local995 && Static438.anInt7120 > local1002) {
							local1029 = local995 * 512 + 256;
							local1035 = local1002 * 512 + 256;
							local1037 = local584;
							if (local584 < 3 && Static209.method3118(local995, local1002)) {
								local1037 = local584 + 1;
							}
							@Pc(1070) Class34_Sub1_Sub1_Sub5 local1070 = new Class34_Sub1_Sub1_Sub5(local216, local376, Static122.anInt2190, local584, local1037, local1029, Static662.method8831(local1035, local1029, local584) - local364, local1035, local995, local995, local1002, local1002, local788);
							Static204.aClass302_20.method6613(new Class3_Sub5_Sub21(local1070));
						}
					}
					Static307.aClass171_79 = null;
					return true;
				} else if (Static319.aClass171_82 == Static307.aClass171_79) {
					Static131.method2234(Static459.aClass3_Sub4_Sub1_1.method7922());
					Static307.aClass171_79 = null;
					return true;
				} else if (Static576.aClass171_141 == Static307.aClass171_79) {
					if (Static187.anInt3418 != -1) {
						Static628.method8496(Static187.anInt3418, 0);
					}
					Static307.aClass171_79 = null;
					return true;
				} else if (Static307.aClass171_79 == Static302.aClass171_74) {
					@Pc(1557) String local1557 = Static459.aClass3_Sub4_Sub1_1.method7922();
					local73 = Static459.aClass3_Sub4_Sub1_1.method7947();
					Static176.method2776();
					Static371.method5292(local73, local1557);
					Static307.aClass171_79 = null;
					return true;
				} else if (Static307.aClass171_79 == Static331.aClass171_88) {
					local216 = Static459.aClass3_Sub4_Sub1_1.method7895();
					local73 = Static459.aClass3_Sub4_Sub1_1.method7935();
					Static176.method2776();
					Static447.method6066(local216, local73);
					Static307.aClass171_79 = null;
					return true;
				} else if (Static307.aClass171_79 == Static424.aClass171_108) {
					Static554.method7316(Static527.aClass177_28);
					Static307.aClass171_79 = null;
					return true;
				} else if (Static523.aClass171_130 == Static307.aClass171_79) {
					Static673.method8966();
					Static307.aClass171_79 = null;
					return false;
				} else if (Static619.aClass171_150 == Static307.aClass171_79) {
					Static155.anInt2872 = Static459.aClass3_Sub4_Sub1_1.method7918();
					Static70.anInt1402 = Static156.anInt2887;
					Static307.aClass171_79 = null;
					return true;
				} else {
					@Pc(1645) byte local1645;
					if (Static307.aClass171_79 == Static11.aClass171_2) {
						local73 = Static459.aClass3_Sub4_Sub1_1.method7935();
						local1645 = Static459.aClass3_Sub4_Sub1_1.method7910();
						Static210.aClass262_1.method5781(local1645, local73);
						Static307.aClass171_79 = null;
						return true;
					}
					@Pc(1700) long local1700;
					if (Static307.aClass171_79 == Static303.aClass171_76) {
						local73 = Static459.aClass3_Sub4_Sub1_1.method7935();
						if (local73 == 65535) {
							local73 = -1;
						}
						local224 = Static459.aClass3_Sub4_Sub1_1.method7951();
						if (local224 == 65535) {
							local224 = -1;
						}
						local364 = Static459.aClass3_Sub4_Sub1_1.method7947();
						local376 = Static459.aClass3_Sub4_Sub1_1.method7895();
						Static176.method2776();
						for (local962 = local224; local962 <= local73; local962++) {
							local1700 = (long) local962 + ((long) local376 << 32);
							@Pc(1706) Class3_Sub40 local1706 = (Class3_Sub40) Static26.aClass333_3.method7489(local1700);
							if (local1706 != null) {
								local392 = new Class3_Sub40(local364, local1706.anInt7828);
								local1706.method9034();
							} else if (local962 == -1) {
								local392 = new Class3_Sub40(local364, Static223.method3278(local376).aClass3_Sub40_3.anInt7828);
							} else {
								local392 = new Class3_Sub40(local364, -1);
							}
							Static26.aClass333_3.method7488(local1700, local392);
						}
						Static307.aClass171_79 = null;
						return true;
					}
					@Pc(1762) String local1762;
					if (Static453.aClass171_119 == Static307.aClass171_79) {
						local1762 = Static459.aClass3_Sub4_Sub1_1.method7922();
						local224 = Static459.aClass3_Sub4_Sub1_1.method7959();
						Static176.method2776();
						Static178.method2798(local224, local1762);
						Static307.aClass171_79 = null;
						return true;
					}
					@Pc(1797) boolean local1797;
					if (Static109.aClass171_23 == Static307.aClass171_79) {
						local73 = Static459.aClass3_Sub4_Sub1_1.method7935();
						local224 = Static459.aClass3_Sub4_Sub1_1.method7899();
						local1797 = (local224 & 0x1) == 1;
						Static578.method7642(local1797, local73);
						Static143.anIntArray147[Static387.anInt6465++ & 0x1F] = local73;
						Static307.aClass171_79 = null;
						return true;
					} else if (Static340.aClass171_92 == Static307.aClass171_79) {
						Static92.anInt1868 = Static459.aClass3_Sub4_Sub1_1.method7960() << 3;
						Static451.anInt7257 = Static459.aClass3_Sub4_Sub1_1.method7934();
						Static667.anInt10816 = Static459.aClass3_Sub4_Sub1_1.method7906() << 3;
						Static307.aClass171_79 = null;
						return true;
					} else if (Static307.aClass171_79 == Static244.aClass171_56) {
						local73 = Static459.aClass3_Sub4_Sub1_1.method7895();
						local224 = Static459.aClass3_Sub4_Sub1_1.method7951();
						local364 = Static459.aClass3_Sub4_Sub1_1.method7954();
						local376 = Static459.aClass3_Sub4_Sub1_1.method7959();
						Static176.method2776();
						Static613.method8313(local73, local364, local376, local224);
						Static307.aClass171_79 = null;
						return true;
					} else {
						@Pc(1899) long local1899;
						@Pc(1975) String local1975;
						if (Static124.aClass171_27 == Static307.aClass171_79) {
							local721 = Static459.aClass3_Sub4_Sub1_1.method7954() == 1;
							local725 = Static459.aClass3_Sub4_Sub1_1.method7922();
							local275 = local725;
							if (local721) {
								local275 = Static459.aClass3_Sub4_Sub1_1.method7922();
							}
							local1899 = (long) Static459.aClass3_Sub4_Sub1_1.method7951();
							local1700 = (long) Static459.aClass3_Sub4_Sub1_1.method7945();
							local584 = Static459.aClass3_Sub4_Sub1_1.method7954();
							local995 = Static459.aClass3_Sub4_Sub1_1.method7951();
							@Pc(1918) long local1918 = local1700 + (local1899 << 32);
							local1343 = false;
							local1037 = 0;
							while (true) {
								if (local1037 >= 100) {
									if (local584 <= 1 && Static86.method1379(local275)) {
										local1343 = true;
									}
									break;
								}
								if (aLongArray14[local1037] == local1918) {
									local1343 = true;
									break;
								}
								local1037++;
							}
							if (!local1343 && Static260.anInt4566 == 0) {
								aLongArray14[Static204.anInt3591] = local1918;
								Static204.anInt3591 = (Static204.anInt3591 + 1) % 100;
								local1975 = Static116.aClass284_1.method6224(local995).method6746(Static459.aClass3_Sub4_Sub1_1);
								if (local584 == 2) {
									Static556.method7325(local995, local1975, 0, (String) null, 18, "<img=1>" + local725, "<img=1>" + local275, local725);
								} else if (local584 == 1) {
									Static556.method7325(local995, local1975, 0, (String) null, 18, "<img=0>" + local725, "<img=0>" + local275, local725);
								} else {
									Static556.method7325(local995, local1975, 0, (String) null, 18, local725, local275, local725);
								}
							}
							Static307.aClass171_79 = null;
							return true;
						} else if (Static234.aClass171_49 == Static307.aClass171_79) {
							local721 = Static459.aClass3_Sub4_Sub1_1.method7954() == 1;
							local725 = Static459.aClass3_Sub4_Sub1_1.method7922();
							local275 = local725;
							if (local721) {
								local275 = Static459.aClass3_Sub4_Sub1_1.method7922();
							}
							local376 = Static459.aClass3_Sub4_Sub1_1.method7954();
							local493 = false;
							if (local376 <= 1) {
								if (Static511.aBoolean563 && !Static14.aBoolean14 || Static656.aBoolean736) {
									local493 = true;
								} else if (local376 <= 1 && Static86.method1379(local275)) {
									local493 = true;
								}
							}
							if (!local493 && Static260.anInt4566 == 0) {
								local534 = Static495.method6507(Static588.method7791(Static459.aClass3_Sub4_Sub1_1));
								if (local376 == 2) {
									Static556.method7325(-1, local534, 0, (String) null, 24, "<img=1>" + local725, "<img=1>" + local275, local725);
								} else if (local376 == 1) {
									Static556.method7325(-1, local534, 0, (String) null, 24, "<img=0>" + local725, "<img=0>" + local275, local725);
								} else {
									Static556.method7325(-1, local534, 0, (String) null, 24, local725, local275, local725);
								}
							}
							Static307.aClass171_79 = null;
							return true;
						} else if (Static465.aClass171_120 == Static307.aClass171_79) {
							Static554.method7316(Static34.aClass177_4);
							Static307.aClass171_79 = null;
							return true;
						} else if (Static294.aClass171_159 == Static307.aClass171_79) {
							local73 = Static459.aClass3_Sub4_Sub1_1.method7895();
							local224 = Static459.aClass3_Sub4_Sub1_1.method7935();
							if (local224 == 65535) {
								local224 = -1;
							}
							local364 = Static459.aClass3_Sub4_Sub1_1.method7921();
							Static176.method2776();
							Static76.method1302(local224, local73, local364);
							@Pc(2227) Class15 local2227 = Static117.aClass197_2.method4518(local224);
							Static546.method7000(local73, local2227.anInt464, local2227.anInt432, local2227.anInt469);
							Static332.method4728(local2227.anInt448, local73, local2227.anInt477, local2227.anInt480);
							Static307.aClass171_79 = null;
							return true;
						} else if (Static307.aClass171_79 == Static468.aClass171_121) {
							Static31.anInt753 = Static459.aClass3_Sub4_Sub1_1.method7954();
							for (local73 = 0; local73 < Static31.anInt753; local73++) {
								Static137.aStringArray22[local73] = Static459.aClass3_Sub4_Sub1_1.method7922();
								Static459.aStringArray54[local73] = Static459.aClass3_Sub4_Sub1_1.method7922();
								if (Static459.aStringArray54[local73].equals("")) {
									Static459.aStringArray54[local73] = Static137.aStringArray22[local73];
								}
								Static632.aStringArray64[local73] = Static459.aClass3_Sub4_Sub1_1.method7922();
								Static133.aStringArray21[local73] = Static459.aClass3_Sub4_Sub1_1.method7922();
								if (Static133.aStringArray21[local73].equals("")) {
									Static133.aStringArray21[local73] = Static632.aStringArray64[local73];
								}
								Static18.aBooleanArray1[local73] = false;
							}
							Static307.aClass171_79 = null;
							Static321.anInt10318 = Static156.anInt2887;
							return true;
						} else if (Static337.aClass171_152 == Static307.aClass171_79) {
							local73 = Static459.aClass3_Sub4_Sub1_1.method7935();
							Static176.method2776();
							Static344.method5009(local73);
							Static307.aClass171_79 = null;
							return true;
						} else if (Static228.aClass171_45 == Static307.aClass171_79) {
							Static215.anInt3719 = Static156.anInt2887;
							local721 = Static459.aClass3_Sub4_Sub1_1.method7954() == 1;
							@Pc(2362) Class80 local2362 = new Class80(Static459.aClass3_Sub4_Sub1_1);
							@Pc(2366) Class342 local2366;
							if (local721) {
								local2366 = Static465.aClass342_3;
							} else {
								local2366 = Static234.aClass342_1;
							}
							local2362.method1717(local2366);
							Static307.aClass171_79 = null;
							return true;
						} else if (Static307.aClass171_79 == Static225.aClass171_44) {
							Static243.method3676(Static147.anInt2709, Static459.aClass3_Sub4_Sub1_1);
							Static307.aClass171_79 = null;
							return true;
						} else if (Static307.aClass171_79 == Static210.aClass171_42) {
							local73 = Static459.aClass3_Sub4_Sub1_1.method7944();
							local224 = Static459.aClass3_Sub4_Sub1_1.method7895();
							Static176.method2776();
							Static474.method6313(local73, local224);
							Static307.aClass171_79 = null;
							return true;
						} else {
							@Pc(2615) Class24 local2615;
							@Pc(2591) boolean local2591;
							if (Static67.aClass171_14 == Static307.aClass171_79) {
								Static384.anInt6406 = Static156.anInt2887;
								if (Static147.anInt2709 == 0) {
									Static307.aClass171_79 = null;
									Static603.aClass24Array1 = null;
									Static20.aString7 = null;
									Static63.anInt1316 = 0;
									Static648.aString113 = null;
									return true;
								}
								Static648.aString113 = Static459.aClass3_Sub4_Sub1_1.method7922();
								local721 = Static459.aClass3_Sub4_Sub1_1.method7954() == 1;
								if (local721) {
									Static459.aClass3_Sub4_Sub1_1.method7922();
								}
								@Pc(2458) long local2458 = Static459.aClass3_Sub4_Sub1_1.method7946();
								Static20.aString7 = Static611.method8283(local2458);
								Static316.aByte74 = Static459.aClass3_Sub4_Sub1_1.method7960();
								local376 = Static459.aClass3_Sub4_Sub1_1.method7954();
								if (local376 == 255) {
									Static307.aClass171_79 = null;
									return true;
								}
								Static63.anInt1316 = local376;
								@Pc(2484) Class24[] local2484 = new Class24[100];
								for (local788 = 0; local788 < Static63.anInt1316; local788++) {
									local2484[local788] = new Class24();
									local2484[local788].aString9 = Static459.aClass3_Sub4_Sub1_1.method7922();
									local721 = Static459.aClass3_Sub4_Sub1_1.method7954() == 1;
									if (local721) {
										local2484[local788].aString10 = Static459.aClass3_Sub4_Sub1_1.method7922();
									} else {
										local2484[local788].aString10 = local2484[local788].aString9;
									}
									local2484[local788].aString11 = Static130.method8168(local2484[local788].aString10);
									local2484[local788].anInt821 = Static459.aClass3_Sub4_Sub1_1.method7951();
									local2484[local788].aByte5 = Static459.aClass3_Sub4_Sub1_1.method7960();
									local2484[local788].aString8 = Static459.aClass3_Sub4_Sub1_1.method7922();
									if (local2484[local788].aString10.equals(Static204.aClass34_Sub1_Sub1_Sub2_Sub1_1.aString25)) {
										Static327.aByte78 = local2484[local788].aByte5;
									}
								}
								local995 = Static63.anInt1316;
								while (local995 > 0) {
									local2591 = true;
									local995--;
									for (local1002 = 0; local1002 < local995; local1002++) {
										if (local2484[local1002].aString11.compareTo(local2484[local1002 + 1].aString11) > 0) {
											local2615 = local2484[local1002];
											local2484[local1002] = local2484[local1002 + 1];
											local2591 = false;
											local2484[local1002 + 1] = local2615;
										}
									}
									if (local2591) {
										break;
									}
								}
								Static603.aClass24Array1 = local2484;
								Static307.aClass171_79 = null;
								return true;
							}
							@Pc(2683) boolean local2683;
							@Pc(2706) String local2706;
							if (Static307.aClass171_79 == Static337.aClass171_153) {
								local721 = Static459.aClass3_Sub4_Sub1_1.method7954() == 1;
								local725 = Static459.aClass3_Sub4_Sub1_1.method7922();
								local275 = local725;
								if (local721) {
									local275 = Static459.aClass3_Sub4_Sub1_1.method7922();
								}
								local376 = Static459.aClass3_Sub4_Sub1_1.method7954();
								local962 = Static459.aClass3_Sub4_Sub1_1.method7951();
								local2683 = false;
								if (local376 <= 1 && Static86.method1379(local275)) {
									local2683 = true;
								}
								if (!local2683 && Static260.anInt4566 == 0) {
									local2706 = Static116.aClass284_1.method6224(local962).method6746(Static459.aClass3_Sub4_Sub1_1);
									if (local376 == 2) {
										Static556.method7325(local962, local2706, 0, (String) null, 25, "<img=1>" + local725, "<img=1>" + local275, local725);
									} else if (local376 == 1) {
										Static556.method7325(local962, local2706, 0, (String) null, 25, "<img=0>" + local725, "<img=0>" + local275, local725);
									} else {
										Static556.method7325(local962, local2706, 0, (String) null, 25, local725, local275, local725);
									}
								}
								Static307.aClass171_79 = null;
								return true;
							} else if (Static307.aClass171_79 == Static667.aClass171_161) {
								Static258.aBoolean304 = Static459.aClass3_Sub4_Sub1_1.method7934() == 1;
								Static307.aClass171_79 = null;
								return true;
							} else if (Static307.aClass171_79 == Static627.aClass171_154) {
								Static203.method3049();
								Static307.aClass171_79 = null;
								return true;
							} else if (Static185.aClass171_36 == Static307.aClass171_79) {
								local73 = Static459.aClass3_Sub4_Sub1_1.method7926();
								local224 = Static459.aClass3_Sub4_Sub1_1.method7929();
								Static176.method2776();
								Static143.method2339(local224, local73);
								Static307.aClass171_79 = null;
								return true;
							} else if (Static214.aClass171_146 == Static307.aClass171_79) {
								@Pc(2916) boolean local2916;
								while (Static459.aClass3_Sub4_Sub1_1.anInt9739 < Static147.anInt2709) {
									local721 = Static459.aClass3_Sub4_Sub1_1.method7954() == 1;
									local725 = Static459.aClass3_Sub4_Sub1_1.method7922();
									local275 = Static459.aClass3_Sub4_Sub1_1.method7922();
									local376 = Static459.aClass3_Sub4_Sub1_1.method7951();
									local962 = Static459.aClass3_Sub4_Sub1_1.method7954();
									local534 = "";
									local2591 = false;
									if (local376 > 0) {
										local534 = Static459.aClass3_Sub4_Sub1_1.method7922();
										local2591 = Static459.aClass3_Sub4_Sub1_1.method7954() == 1;
									}
									for (local584 = 0; local584 < Static345.anInt5912; local584++) {
										if (local721) {
											if (local275.equals(Static651.aStringArray66[local584])) {
												Static651.aStringArray66[local584] = local725;
												local725 = null;
												Static87.aStringArray15[local584] = local275;
												break;
											}
										} else if (local725.equals(Static651.aStringArray66[local584])) {
											if (Static639.anIntArray557[local584] != local376) {
												local2916 = true;
												for (@Pc(2921) Class34_Sub3_Sub1 local2921 = (Class34_Sub3_Sub1) Static315.aClass317_4.method6891(); local2921 != null; local2921 = (Class34_Sub3_Sub1) Static315.aClass317_4.method6894()) {
													if (local2921.aString43.equals(local725)) {
														if (local376 != 0 && local2921.aShort33 == 0) {
															local2921.method8764();
															local2916 = false;
														} else if (local376 == 0 && local2921.aShort33 != 0) {
															local2916 = false;
															local2921.method8764();
														}
													}
												}
												if (local2916) {
													Static315.aClass317_4.method6890(new Class34_Sub3_Sub1(local725, local376));
												}
												Static639.anIntArray557[local584] = local376;
											}
											Static87.aStringArray15[local584] = local275;
											Static109.aStringArray17[local584] = local534;
											Static413.anIntArray351[local584] = local962;
											Static83.aBooleanArray6[local584] = local2591;
											local725 = null;
											break;
										}
									}
									if (local725 != null && Static345.anInt5912 < 200) {
										Static651.aStringArray66[Static345.anInt5912] = local725;
										Static87.aStringArray15[Static345.anInt5912] = local275;
										Static639.anIntArray557[Static345.anInt5912] = local376;
										Static109.aStringArray17[Static345.anInt5912] = local534;
										Static413.anIntArray351[Static345.anInt5912] = local962;
										Static83.aBooleanArray6[Static345.anInt5912] = local2591;
										Static345.anInt5912++;
									}
								}
								Static321.anInt10318 = Static156.anInt2887;
								Static390.anInt6507 = 2;
								local224 = Static345.anInt5912;
								while (local224 > 0) {
									local224--;
									local721 = true;
									for (local364 = 0; local364 < local224; local364++) {
										if (Static639.anIntArray557[local364] != Static98.aClass275_2.anInt7235 && Static98.aClass275_2.anInt7235 == Static639.anIntArray557[local364 + 1] || Static639.anIntArray557[local364] == 0 && Static639.anIntArray557[local364 + 1] != 0) {
											local376 = Static639.anIntArray557[local364];
											Static639.anIntArray557[local364] = Static639.anIntArray557[local364 + 1];
											Static639.anIntArray557[local364 + 1] = local376;
											local304 = Static109.aStringArray17[local364];
											Static109.aStringArray17[local364] = Static109.aStringArray17[local364 + 1];
											Static109.aStringArray17[local364 + 1] = local304;
											local534 = Static651.aStringArray66[local364];
											Static651.aStringArray66[local364] = Static651.aStringArray66[local364 + 1];
											Static651.aStringArray66[local364 + 1] = local534;
											local2706 = Static87.aStringArray15[local364];
											Static87.aStringArray15[local364] = Static87.aStringArray15[local364 + 1];
											Static87.aStringArray15[local364 + 1] = local2706;
											local584 = Static413.anIntArray351[local364];
											Static413.anIntArray351[local364] = Static413.anIntArray351[local364 + 1];
											Static413.anIntArray351[local364 + 1] = local584;
											local2916 = Static83.aBooleanArray6[local364];
											Static83.aBooleanArray6[local364] = Static83.aBooleanArray6[local364 + 1];
											Static83.aBooleanArray6[local364 + 1] = local2916;
											local721 = false;
										}
									}
									if (local721) {
										break;
									}
								}
								Static307.aClass171_79 = null;
								return true;
							} else if (Static589.aClass171_143 == Static307.aClass171_79) {
								local73 = Static459.aClass3_Sub4_Sub1_1.method7959() << 2;
								local224 = Static459.aClass3_Sub4_Sub1_1.method7914();
								local364 = Static459.aClass3_Sub4_Sub1_1.method7914();
								local376 = Static459.aClass3_Sub4_Sub1_1.method7899();
								local962 = Static459.aClass3_Sub4_Sub1_1.method7954();
								Static176.method2776();
								Static225.method3319(local224, local73, local364, true, local962, local376);
								Static307.aClass171_79 = null;
								return true;
							} else if (Static307.aClass171_79 == Static358.aClass171_97) {
								local73 = Static459.aClass3_Sub4_Sub1_1.method7934();
								local224 = Static459.aClass3_Sub4_Sub1_1.method7954();
								if (local224 == 255) {
									local73 = -1;
									local224 = -1;
								}
								Static523.method6799(local224, local73);
								Static307.aClass171_79 = null;
								return true;
							} else if (Static280.aClass171_69 == Static307.aClass171_79) {
								Static554.method7316(Static622.aClass177_31);
								Static307.aClass171_79 = null;
								return true;
							} else {
								@Pc(3318) long local3318;
								@Pc(3334) long local3334;
								@Pc(3418) String local3418;
								if (Static328.aClass171_86 == Static307.aClass171_79) {
									local721 = Static459.aClass3_Sub4_Sub1_1.method7954() == 1;
									local725 = Static459.aClass3_Sub4_Sub1_1.method7922();
									local3318 = (long) Static459.aClass3_Sub4_Sub1_1.method7951();
									local386 = (long) Static459.aClass3_Sub4_Sub1_1.method7945();
									local526 = Static459.aClass3_Sub4_Sub1_1.method7954();
									local3334 = (local3318 << 32) + local386;
									@Pc(3336) boolean local3336 = false;
									@Pc(3344) Class3_Sub26 local3344 = local721 ? Static121.aClass3_Sub26_1 : Static213.aClass3_Sub26_2;
									if (local3344 == null) {
										local3336 = true;
									} else {
										label2136: {
											for (local1035 = 0; local1035 < 100; local1035++) {
												if (local3334 == aLongArray14[local1035]) {
													local3336 = true;
													break label2136;
												}
											}
											if (local526 <= 1) {
												if (Static511.aBoolean563 && !Static14.aBoolean14 || Static656.aBoolean736) {
													local3336 = true;
												} else if (Static86.method1379(local725)) {
													local3336 = true;
												}
											}
										}
									}
									if (!local3336 && Static260.anInt4566 == 0) {
										aLongArray14[Static204.anInt3591] = local3334;
										Static204.anInt3591 = (Static204.anInt3591 + 1) % 100;
										local3418 = Static495.method6507(Static588.method7791(Static459.aClass3_Sub4_Sub1_1));
										local1037 = local721 ? 41 : 44;
										if (local526 == 2 || local526 == 3) {
											Static556.method7325(-1, local3418, 0, local3344.aString53, local1037, "<img=1>" + local725, "<img=1>" + local725, local725);
										} else if (local526 == 1) {
											Static556.method7325(-1, local3418, 0, local3344.aString53, local1037, "<img=0>" + local725, "<img=0>" + local725, local725);
										} else {
											Static556.method7325(-1, local3418, 0, local3344.aString53, local1037, local725, local725, local725);
										}
									}
									Static307.aClass171_79 = null;
									return true;
								} else if (Static261.aClass171_62 == Static307.aClass171_79) {
									Static210.aClass262_1.method5785();
									Static307.aClass171_79 = null;
									Static473.anInt7527 += 32;
									return true;
								} else if (Static307.aClass171_79 == Static666.aClass171_160) {
									Static307.aClass171_79 = null;
									return false;
								} else if (Static272.aClass171_65 == Static307.aClass171_79) {
									local73 = Static459.aClass3_Sub4_Sub1_1.method7926();
									local224 = Static459.aClass3_Sub4_Sub1_1.method7951();
									Static176.method2776();
									Static276.method4052(local73, local224);
									Static307.aClass171_79 = null;
									return true;
								} else if (Static631.aClass171_156 == Static307.aClass171_79) {
									Static43.method785();
									Static307.aClass171_79 = null;
									return true;
								} else if (Static307.aClass171_79 == Static256.aClass171_61) {
									Static554.method7316(Static48.aClass177_7);
									Static307.aClass171_79 = null;
									return true;
								} else if (Static598.aClass171_145 == Static307.aClass171_79) {
									local1762 = Static459.aClass3_Sub4_Sub1_1.method7922();
									@Pc(3574) Object[] local3574 = new Object[local1762.length() + 1];
									for (local364 = local1762.length() - 1; local364 >= 0; local364--) {
										if (local1762.charAt(local364) == 's') {
											local3574[local364 + 1] = Static459.aClass3_Sub4_Sub1_1.method7922();
										} else {
											local3574[local364 + 1] = Integer.valueOf(Static459.aClass3_Sub4_Sub1_1.method7895());
										}
									}
									local3574[0] = Integer.valueOf(Static459.aClass3_Sub4_Sub1_1.method7895());
									Static176.method2776();
									@Pc(3631) Class3_Sub53 local3631 = new Class3_Sub53();
									local3631.anObjectArray35 = local3574;
									Static250.method3767(local3631);
									Static307.aClass171_79 = null;
									return true;
								} else if (Static307.aClass171_79 == Static241.aClass171_53) {
									Static554.method7316(Static403.aClass177_32);
									Static307.aClass171_79 = null;
									return true;
								} else if (Static307.aClass171_79 == Static54.aClass171_11) {
									Static232.anInt4116 = Static156.anInt2887;
									local721 = Static459.aClass3_Sub4_Sub1_1.method7954() == 1;
									@Pc(3669) Class186 local3669 = new Class186(Static459.aClass3_Sub4_Sub1_1);
									@Pc(3673) Class3_Sub26 local3673;
									if (local721) {
										local3673 = Static121.aClass3_Sub26_1;
									} else {
										local3673 = Static213.aClass3_Sub26_2;
									}
									local3669.method4155(local3673);
									Static307.aClass171_79 = null;
									return true;
								} else if (Static211.aClass171_43 == Static307.aClass171_79) {
									local73 = Static459.aClass3_Sub4_Sub1_1.method7947();
									Static176.method2776();
									Static309.method4447(Static291.anInt4955, local73, 5, 0);
									Static307.aClass171_79 = null;
									return true;
								} else if (Static351.aClass171_94 == Static307.aClass171_79) {
									local73 = Static459.aClass3_Sub4_Sub1_1.method7895();
									local224 = Static459.aClass3_Sub4_Sub1_1.method7895();
									Static176.method2776();
									local234 = (Class3_Sub25) Static513.aClass333_33.method7489((long) local224);
									@Pc(3733) Class3_Sub25 local3733 = (Class3_Sub25) Static513.aClass333_33.method7489((long) local73);
									if (local3733 != null) {
										Static186.method2905(local3733, local234 == null || local234.anInt3959 != local3733.anInt3959, false);
									}
									if (local234 != null) {
										local234.method9034();
										Static513.aClass333_33.method7488((long) local73, local234);
									}
									@Pc(3768) Class265 local3768 = Static223.method3278(local224);
									if (local3768 != null) {
										Static218.method3194(local3768);
									}
									local3768 = Static223.method3278(local73);
									if (local3768 != null) {
										Static218.method3194(local3768);
										Static463.method6195(true, local3768);
									}
									if (Static187.anInt3418 != -1) {
										Static628.method8496(Static187.anInt3418, 1);
									}
									Static307.aClass171_79 = null;
									return true;
								} else if (Static610.aClass171_148 == Static307.aClass171_79) {
									Static554.method7316(Static426.aClass177_21);
									Static307.aClass171_79 = null;
									return true;
								} else if (Static307.aClass171_79 == Static377.aClass171_126) {
									local1762 = Static459.aClass3_Sub4_Sub1_1.method7922();
									local224 = Static459.aClass3_Sub4_Sub1_1.method7926();
									if (local224 == 65535) {
										local224 = -1;
									}
									local364 = Static459.aClass3_Sub4_Sub1_1.method7899();
									local376 = Static459.aClass3_Sub4_Sub1_1.method7899();
									if (local364 >= 1 && local364 <= 8) {
										if (local1762.equalsIgnoreCase("null")) {
											local1762 = null;
										}
										Static437.aStringArray51[local364 - 1] = local1762;
										Static573.anIntArray486[local364 - 1] = local224;
										Static231.aBooleanArray17[local364 - 1] = local376 == 0;
									}
									Static307.aClass171_79 = null;
									return true;
								} else if (Static307.aClass171_79 == Static190.aClass171_38) {
									local73 = Static459.aClass3_Sub4_Sub1_1.method7951();
									local725 = Static459.aClass3_Sub4_Sub1_1.method7922();
									Static176.method2776();
									Static178.method2798(local73, local725);
									Static307.aClass171_79 = null;
									return true;
								} else if (Static312.aClass171_78 == Static307.aClass171_79) {
									local73 = Static459.aClass3_Sub4_Sub1_1.method7951();
									local224 = Static459.aClass3_Sub4_Sub1_1.method7954();
									local1797 = (local224 & 0x1) == 1;
									Static622.method8400(local1797, local73);
									local376 = Static459.aClass3_Sub4_Sub1_1.method7951();
									for (local962 = 0; local962 < local376; local962++) {
										local788 = Static459.aClass3_Sub4_Sub1_1.method7899();
										if (local788 == 255) {
											local788 = Static459.aClass3_Sub4_Sub1_1.method7947();
										}
										local526 = Static459.aClass3_Sub4_Sub1_1.method7935();
										Static52.method1016(local1797, local788, local526 - 1, local73, local962);
									}
									Static143.anIntArray147[Static387.anInt6465++ & 0x1F] = local73;
									Static307.aClass171_79 = null;
									return true;
								} else if (Static61.aClass171_13 == Static307.aClass171_79) {
									local73 = Static459.aClass3_Sub4_Sub1_1.method7921();
									local224 = Static459.aClass3_Sub4_Sub1_1.method7951();
									Static176.method2776();
									if (local224 == 65535) {
										local224 = -1;
									}
									Static309.method4447(local224, local73, 2, -1);
									Static307.aClass171_79 = null;
									return true;
								} else if (Static307.aClass171_79 == Static388.aClass171_102) {
									Static316.method4541(false);
									Static307.aClass171_79 = null;
									return false;
								} else if (Static261.aClass171_63 == Static307.aClass171_79) {
									Static554.method7316(Static102.aClass177_30);
									Static307.aClass171_79 = null;
									return true;
								} else if (Static33.aClass171_134 == Static307.aClass171_79) {
									Static344.aString76 = Static147.anInt2709 > 2 ? Static459.aClass3_Sub4_Sub1_1.method7922() : Static114.aClass84_26.method1729(Static654.anInt10668);
									Static69.anInt9578 = Static147.anInt2709 <= 0 ? -1 : Static459.aClass3_Sub4_Sub1_1.method7951();
									Static307.aClass171_79 = null;
									if (Static69.anInt9578 == 65535) {
										Static69.anInt9578 = -1;
									}
									return true;
								} else if (Static307.aClass171_79 == Static105.aClass171_20) {
									local73 = Static459.aClass3_Sub4_Sub1_1.method7929();
									local224 = Static459.aClass3_Sub4_Sub1_1.method7895();
									local364 = Static459.aClass3_Sub4_Sub1_1.method7959();
									Static176.method2776();
									Static309.method4447(local364, local73, 5, local224);
									Static307.aClass171_79 = null;
									return true;
								} else if (Static322.aClass171_84 == Static307.aClass171_79) {
									local1762 = Static459.aClass3_Sub4_Sub1_1.method7922();
									local725 = Static495.method6507(Static588.method7791(Static459.aClass3_Sub4_Sub1_1));
									Static390.method5455(0, local725, local1762, 6, local1762, local1762);
									Static307.aClass171_79 = null;
									return true;
								} else if (Static10.aClass171_1 == Static307.aClass171_79) {
									Static156.anInt2892 = Static459.aClass3_Sub4_Sub1_1.method7954();
									Static307.aClass171_79 = null;
									Static70.anInt1402 = Static156.anInt2887;
									return true;
								} else if (Static187.aClass171_37 == Static307.aClass171_79) {
									if (Static592.method7807(Static221.anInt3831)) {
										Static226.anInt3963 = (int) ((float) Static459.aClass3_Sub4_Sub1_1.method7951() * 2.5F);
									} else {
										Static226.anInt3963 = Static459.aClass3_Sub4_Sub1_1.method7951() * 30;
									}
									Static307.aClass171_79 = null;
									Static70.anInt1402 = Static156.anInt2887;
									return true;
								} else if (Static498.aClass171_163 == Static307.aClass171_79) {
									local73 = Static459.aClass3_Sub4_Sub1_1.method7926();
									if (local73 == 65535) {
										local73 = -1;
									}
									local224 = Static459.aClass3_Sub4_Sub1_1.method7899();
									local364 = local224 >> 2;
									local376 = local224 & 0x3;
									local962 = Class14_Sub26.anIntArray517[local364];
									local788 = Static459.aClass3_Sub4_Sub1_1.method7895();
									local526 = local788 >> 28 & 0x3;
									local584 = local788 >> 14 & 0x3FFF;
									local584 -= Static534.anInt8358;
									local995 = local788 & 0x3FFF;
									local995 -= Static402.anInt6661;
									Static25.method586(local364, local376, local584, local526, local995, local962, local73);
									Static307.aClass171_79 = null;
									return true;
								} else if (Static349.aClass171_93 == Static307.aClass171_79) {
									Static316.method4541(Static437.aBoolean506);
									Static307.aClass171_79 = null;
									return false;
								} else if (Static609.aClass171_147 == Static307.aClass171_79) {
									local73 = Static459.aClass3_Sub4_Sub1_1.method7959();
									local224 = Static459.aClass3_Sub4_Sub1_1.method7954();
									Static176.method2776();
									if (local224 == 2) {
										Static232.method3503();
									}
									Static187.anInt3418 = local73;
									Static277.method4055(local73);
									Static630.method8507(false);
									Static250.method3769(Static187.anInt3418);
									for (local364 = 0; local364 < 100; local364++) {
										Static89.aBooleanArray7[local364] = true;
									}
									Static307.aClass171_79 = null;
									return true;
								} else if (Static307.aClass171_79 == Static204.aClass171_39) {
									local73 = Static459.aClass3_Sub4_Sub1_1.method7947();
									local224 = Static459.aClass3_Sub4_Sub1_1.method7935();
									Static210.aClass262_1.method5781(local73, local224);
									Static307.aClass171_79 = null;
									return true;
								} else if (Static307.aClass171_79 == Static530.aClass171_131) {
									Static176.method2776();
									Static523.method6797();
									Static307.aClass171_79 = null;
									return true;
								} else if (Static568.aClass171_137 == Static307.aClass171_79) {
									local73 = Static459.aClass3_Sub4_Sub1_1.method7951();
									if (local73 == 65535) {
										local73 = -1;
									}
									local224 = Static459.aClass3_Sub4_Sub1_1.method7954();
									local364 = Static459.aClass3_Sub4_Sub1_1.method7951();
									local376 = Static459.aClass3_Sub4_Sub1_1.method7954();
									local962 = Static459.aClass3_Sub4_Sub1_1.method7951();
									Static248.method4092(local73, local364, local376, local962, local224);
									Static307.aClass171_79 = null;
									return true;
								} else if (Static307.aClass171_79 == Static389.aClass171_103) {
									local73 = Static459.aClass3_Sub4_Sub1_1.method7954();
									if (Static459.aClass3_Sub4_Sub1_1.method7954() == 0) {
										Static439.aClass199Array1[local73] = new Class199();
									} else {
										Static459.aClass3_Sub4_Sub1_1.anInt9739--;
										Static439.aClass199Array1[local73] = new Class199(Static459.aClass3_Sub4_Sub1_1);
									}
									Static627.anInt10390 = Static156.anInt2887;
									Static307.aClass171_79 = null;
									return true;
								} else if (Static307.aClass171_79 == Static425.aClass171_109) {
									local73 = Static459.aClass3_Sub4_Sub1_1.method7947();
									local224 = Static459.aClass3_Sub4_Sub1_1.method7935();
									if (local224 == 65535) {
										local224 = -1;
									}
									Static176.method2776();
									Static309.method4447(local224, local73, 1, -1);
									Static307.aClass171_79 = null;
									return true;
								} else {
									@Pc(4469) long local4469;
									if (Static281.aClass171_70 == Static307.aClass171_79) {
										local721 = Static459.aClass3_Sub4_Sub1_1.method7954() == 1;
										local725 = Static459.aClass3_Sub4_Sub1_1.method7922();
										local275 = local725;
										if (local721) {
											local275 = Static459.aClass3_Sub4_Sub1_1.method7922();
										}
										local1899 = (long) Static459.aClass3_Sub4_Sub1_1.method7951();
										local1700 = (long) Static459.aClass3_Sub4_Sub1_1.method7945();
										local584 = Static459.aClass3_Sub4_Sub1_1.method7954();
										local4469 = local1700 + (local1899 << 32);
										local1128 = false;
										local1035 = 0;
										while (true) {
											if (local1035 >= 100) {
												if (local584 <= 1) {
													if (Static511.aBoolean563 && !Static14.aBoolean14 || Static656.aBoolean736) {
														local1128 = true;
													} else if (Static86.method1379(local275)) {
														local1128 = true;
													}
												}
												break;
											}
											if (aLongArray14[local1035] == local4469) {
												local1128 = true;
												break;
											}
											local1035++;
										}
										if (!local1128 && Static260.anInt4566 == 0) {
											aLongArray14[Static204.anInt3591] = local4469;
											Static204.anInt3591 = (Static204.anInt3591 + 1) % 100;
											local3418 = Static495.method6507(Static588.method7791(Static459.aClass3_Sub4_Sub1_1));
											if (local584 == 2) {
												Static556.method7325(-1, local3418, 0, (String) null, 7, "<img=1>" + local725, "<img=1>" + local275, local725);
											} else if (local584 == 1) {
												Static556.method7325(-1, local3418, 0, (String) null, 7, "<img=0>" + local725, "<img=0>" + local275, local725);
											} else {
												Static556.method7325(-1, local3418, 0, (String) null, 3, local725, local275, local725);
											}
										}
										Static307.aClass171_79 = null;
										return true;
									} else if (Static307.aClass171_79 == Static328.aClass171_85) {
										Static554.method7316(Static149.aClass177_12);
										Static307.aClass171_79 = null;
										return true;
									} else if (Static445.aClass171_118 == Static307.aClass171_79) {
										Static223.anInt3850 = Static459.aClass3_Sub4_Sub1_1.method7914();
										Static209.anInt3642 = Static459.aClass3_Sub4_Sub1_1.method7899();
										Static307.aClass171_79 = null;
										return true;
									} else if (Static112.aClass171_24 == Static307.aClass171_79) {
										local73 = Static459.aClass3_Sub4_Sub1_1.method7947();
										Static176.method2776();
										if (local73 == -1) {
											Static351.anInt6038 = -1;
											Static468.anInt7425 = -1;
										} else {
											local224 = local73 >> 14 & 0x3FFF;
											local364 = local73 & 0x3FFF;
											local224 -= Static534.anInt8358;
											if (local224 < 0) {
												local224 = 0;
											} else if (Static98.anInt361 <= local224) {
												local224 = Static98.anInt361;
											}
											local364 -= Static402.anInt6661;
											Static351.anInt6038 = (local224 << 9) + 256;
											if (local364 < 0) {
												local364 = 0;
											} else if (Static438.anInt7120 <= local364) {
												local364 = Static438.anInt7120;
											}
											Static468.anInt7425 = (local364 << 9) + 256;
										}
										Static307.aClass171_79 = null;
										return true;
									} else if (Static307.aClass171_79 == Static242.aClass171_115) {
										local73 = Static459.aClass3_Sub4_Sub1_1.method7895();
										Static633.aClass338_15 = Static566.aClass92_6.method1876(local73);
										Static307.aClass171_79 = null;
										return true;
									} else if (Static354.aClass171_95 == Static307.aClass171_79) {
										local73 = Static459.aClass3_Sub4_Sub1_1.method7951();
										local224 = Static459.aClass3_Sub4_Sub1_1.method7954();
										local1797 = (local224 & 0x1) == 1;
										while (Static147.anInt2709 > Static459.aClass3_Sub4_Sub1_1.anInt9739) {
											local376 = Static459.aClass3_Sub4_Sub1_1.method7896();
											local962 = Static459.aClass3_Sub4_Sub1_1.method7951();
											local788 = 0;
											if (local962 != 0) {
												local788 = Static459.aClass3_Sub4_Sub1_1.method7954();
												if (local788 == 255) {
													local788 = Static459.aClass3_Sub4_Sub1_1.method7895();
												}
											}
											Static52.method1016(local1797, local788, local962 - 1, local73, local376);
										}
										Static143.anIntArray147[Static387.anInt6465++ & 0x1F] = local73;
										Static307.aClass171_79 = null;
										return true;
									} else if (Static307.aClass171_79 == Static627.aClass171_155) {
										local73 = Static459.aClass3_Sub4_Sub1_1.method7935();
										local224 = Static459.aClass3_Sub4_Sub1_1.method7914();
										Static210.aClass262_1.method5780(local224, local73);
										Static307.aClass171_79 = null;
										return true;
									} else if (Static229.aClass171_48 == Static307.aClass171_79) {
										Static554.method7316(Static462.aClass177_24);
										Static307.aClass171_79 = null;
										return true;
									} else if (Static307.aClass171_79 == Static25.aClass171_5) {
										Static144.method2348(Static459.aClass3_Sub4_Sub1_1, Static566.aClass92_6, Static147.anInt2709);
										Static307.aClass171_79 = null;
										return true;
									} else if (Static307.aClass171_79 == Static676.aClass171_162) {
										local73 = Static459.aClass3_Sub4_Sub1_1.method7951();
										if (local73 == 65535) {
											local73 = -1;
										}
										local224 = Static459.aClass3_Sub4_Sub1_1.method7954();
										local364 = Static459.aClass3_Sub4_Sub1_1.method7951();
										local376 = Static459.aClass3_Sub4_Sub1_1.method7954();
										Static224.method3294(256, local224, local73, local376, true, local364);
										Static307.aClass171_79 = null;
										return true;
									} else if (Static307.aClass171_79 == Static440.aClass171_116) {
										Static176.method2776();
										Static304.method4414();
										Static307.aClass171_79 = null;
										return true;
									} else if (Static426.aClass171_111 == Static307.aClass171_79) {
										local73 = Static459.aClass3_Sub4_Sub1_1.method7954();
										Static176.method2776();
										Static307.aClass171_79 = null;
										Static375.anInt7471 = local73;
										return true;
									} else if (Static307.aClass171_79 == Static489.aClass171_123) {
										local73 = Static459.aClass3_Sub4_Sub1_1.method7935();
										if (local73 == 65535) {
											local73 = -1;
										}
										local224 = Static459.aClass3_Sub4_Sub1_1.method7895();
										Static176.method2776();
										Static231.method4622(local224, local73);
										Static307.aClass171_79 = null;
										return true;
									} else if (Static273.aClass171_66 == Static307.aClass171_79) {
										Static554.method7316(Static122.aClass177_11);
										Static307.aClass171_79 = null;
										return true;
									} else if (Static307.aClass171_79 == Static302.aClass171_75) {
										local1762 = Static459.aClass3_Sub4_Sub1_1.method7922();
										local1797 = Static459.aClass3_Sub4_Sub1_1.method7954() == 1;
										if (local1797) {
											local725 = Static459.aClass3_Sub4_Sub1_1.method7922();
										} else {
											local725 = local1762;
										}
										local376 = Static459.aClass3_Sub4_Sub1_1.method7951();
										@Pc(4978) byte local4978 = Static459.aClass3_Sub4_Sub1_1.method7960();
										local2683 = false;
										if (local4978 == -128) {
											local2683 = true;
										}
										if (local2683) {
											if (Static63.anInt1316 == 0) {
												Static307.aClass171_79 = null;
												return true;
											}
											for (local526 = 0; Static63.anInt1316 > local526 && (!Static603.aClass24Array1[local526].aString10.equals(local725) || Static603.aClass24Array1[local526].anInt821 != local376); local526++) {
											}
											if (Static63.anInt1316 > local526) {
												while (Static63.anInt1316 - 1 > local526) {
													Static603.aClass24Array1[local526] = Static603.aClass24Array1[local526 + 1];
													local526++;
												}
												Static63.anInt1316--;
												Static603.aClass24Array1[Static63.anInt1316] = null;
											}
										} else {
											local2706 = Static459.aClass3_Sub4_Sub1_1.method7922();
											local2615 = new Class24();
											local2615.aString9 = local1762;
											local2615.aString10 = local725;
											local2615.aString11 = Static130.method8168(local2615.aString10);
											local2615.aByte5 = local4978;
											local2615.anInt821 = local376;
											local2615.aString8 = local2706;
											for (local995 = Static63.anInt1316 - 1; local995 >= 0; local995--) {
												local1002 = Static603.aClass24Array1[local995].aString11.compareTo(local2615.aString11);
												if (local1002 == 0) {
													Static603.aClass24Array1[local995].anInt821 = local376;
													Static603.aClass24Array1[local995].aByte5 = local4978;
													Static603.aClass24Array1[local995].aString8 = local2706;
													if (local725.equals(Static204.aClass34_Sub1_Sub1_Sub2_Sub1_1.aString25)) {
														Static327.aByte78 = local4978;
													}
													Static307.aClass171_79 = null;
													Static384.anInt6406 = Static156.anInt2887;
													return true;
												}
												if (local1002 < 0) {
													break;
												}
											}
											if (Static63.anInt1316 >= Static603.aClass24Array1.length) {
												Static307.aClass171_79 = null;
												return true;
											}
											for (local1002 = Static63.anInt1316 - 1; local1002 > local995; local1002--) {
												Static603.aClass24Array1[local1002 + 1] = Static603.aClass24Array1[local1002];
											}
											if (Static63.anInt1316 == 0) {
												Static603.aClass24Array1 = new Class24[100];
											}
											Static603.aClass24Array1[local995 + 1] = local2615;
											Static63.anInt1316++;
											if (local725.equals(Static204.aClass34_Sub1_Sub1_Sub2_Sub1_1.aString25)) {
												Static327.aByte78 = local4978;
											}
										}
										Static384.anInt6406 = Static156.anInt2887;
										Static307.aClass171_79 = null;
										return true;
									} else if (Static430.aClass171_113 == Static307.aClass171_79) {
										Static451.anInt7257 = Static459.aClass3_Sub4_Sub1_1.method7934();
										Static92.anInt1868 = Static459.aClass3_Sub4_Sub1_1.method7960() << 3;
										Static667.anInt10816 = Static459.aClass3_Sub4_Sub1_1.method7960() << 3;
										while (Static147.anInt2709 > Static459.aClass3_Sub4_Sub1_1.anInt9739) {
											@Pc(5233) Class177 local5233 = Static113.method1727()[Static459.aClass3_Sub4_Sub1_1.method7954()];
											Static554.method7316(local5233);
										}
										Static307.aClass171_79 = null;
										return true;
									} else if (Static307.aClass171_79 == Static414.aClass171_104) {
										Static335.aClass70_3 = Static407.method5606(Static459.aClass3_Sub4_Sub1_1.method7954());
										Static307.aClass171_79 = null;
										return true;
									} else if (Static382.aClass171_101 == Static307.aClass171_79) {
										Static455.anInt7321 = Static459.aClass3_Sub4_Sub1_1.method7912();
										Static511.aBoolean563 = Static459.aClass3_Sub4_Sub1_1.method7954() == 1;
										Static307.aClass171_79 = null;
										return true;
									} else if (Static307.aClass171_79 == Static319.aClass171_81) {
										local73 = Static459.aClass3_Sub4_Sub1_1.method7959();
										local224 = Static459.aClass3_Sub4_Sub1_1.method7921();
										Static176.method2776();
										Static195.method3009(local73, local224);
										Static307.aClass171_79 = null;
										return true;
									} else if (Static307.aClass171_79 == Static562.aClass171_136) {
										Static554.method7316(Static479.aClass177_29);
										Static307.aClass171_79 = null;
										return true;
									} else if (Static651.aClass171_158 == Static307.aClass171_79) {
										Static585.anInt9524 = Static459.aClass3_Sub4_Sub1_1.method7954();
										Static307.aClass171_79 = null;
										return true;
									} else if (Static100.aClass171_17 == Static307.aClass171_79) {
										Static554.method7316(Static511.aClass177_26);
										Static307.aClass171_79 = null;
										return true;
									} else if (Static307.aClass171_79 == Static241.aClass171_52) {
										local721 = Static459.aClass3_Sub4_Sub1_1.method7934() == 1;
										Static176.method2776();
										Static224.aBoolean266 = local721;
										Static307.aClass171_79 = null;
										return true;
									} else if (Static128.aClass171_29 == Static307.aClass171_79) {
										local73 = Static459.aClass3_Sub4_Sub1_1.method7947();
										local224 = Static459.aClass3_Sub4_Sub1_1.method7935();
										local364 = Static459.aClass3_Sub4_Sub1_1.method7899();
										local376 = Static459.aClass3_Sub4_Sub1_1.method7935();
										Static176.method2776();
										Static323.method4615(local224, local364, local376, local73);
										Static307.aClass171_79 = null;
										return true;
									} else if (Static307.aClass171_79 == Static426.aClass171_112) {
										Static451.anInt7257 = Static459.aClass3_Sub4_Sub1_1.method7914();
										Static667.anInt10816 = Static459.aClass3_Sub4_Sub1_1.method7910() << 3;
										Static92.anInt1868 = Static459.aClass3_Sub4_Sub1_1.method7906() << 3;
										for (@Pc(5407) Class3_Sub20 local5407 = (Class3_Sub20) Static462.aClass333_29.method7490(); local5407 != null; local5407 = (Class3_Sub20) Static462.aClass333_29.method7487()) {
											local224 = (int) (local5407.aLong313 >> 28 & 0x3L);
											local364 = (int) (local5407.aLong313 & 0x3FFFL);
											local376 = local364 - Static534.anInt8358;
											local962 = (int) (local5407.aLong313 >> 14 & 0x3FFFL);
											local788 = local962 - Static402.anInt6661;
											if (local224 == Static451.anInt7257 && Static92.anInt1868 <= local376 && Static92.anInt1868 + 8 > local376 && Static667.anInt10816 <= local788 && local788 < Static667.anInt10816 + 8) {
												local5407.method9034();
												if (local376 >= 0 && local788 >= 0 && Static98.anInt361 > local376 && Static438.anInt7120 > local788) {
													Static593.method7810(Static451.anInt7257, local788, local376);
												}
											}
										}
										@Pc(5505) Class3_Sub33 local5505;
										for (local5505 = (Class3_Sub33) Static346.aClass302_39.method6603(); local5505 != null; local5505 = (Class3_Sub33) Static346.aClass302_39.method6605()) {
											if (local5505.anInt5169 >= Static92.anInt1868 && local5505.anInt5169 < Static92.anInt1868 + 8 && local5505.anInt5170 >= Static667.anInt10816 && Static667.anInt10816 + 8 > local5505.anInt5170 && Static451.anInt7257 == local5505.anInt5157) {
												local5505.aBoolean341 = true;
											}
										}
										for (local5505 = (Class3_Sub33) Static153.aClass302_15.method6603(); local5505 != null; local5505 = (Class3_Sub33) Static153.aClass302_15.method6605()) {
											if (local5505.anInt5169 >= Static92.anInt1868 && Static92.anInt1868 + 8 > local5505.anInt5169 && Static667.anInt10816 <= local5505.anInt5170 && Static667.anInt10816 + 8 > local5505.anInt5170 && local5505.anInt5157 == Static451.anInt7257) {
												local5505.aBoolean341 = true;
											}
										}
										Static307.aClass171_79 = null;
										return true;
									} else if (Static472.aClass171_122 == Static307.aClass171_79) {
										local73 = Static459.aClass3_Sub4_Sub1_1.method7934();
										local224 = Static459.aClass3_Sub4_Sub1_1.method7935();
										Static176.method2776();
										Static402.method5589(local224, local73, true);
										Static307.aClass171_79 = null;
										return true;
									} else if (Static307.aClass171_79 == Static96.aClass171_16) {
										local73 = Static459.aClass3_Sub4_Sub1_1.method7929();
										local224 = Static459.aClass3_Sub4_Sub1_1.method7899();
										Static176.method2776();
										Static125.method1867(local224, local73);
										Static307.aClass171_79 = null;
										return true;
									} else if (Static307.aClass171_79 == Static206.aClass171_40) {
										@Pc(5662) byte local5662 = Static459.aClass3_Sub4_Sub1_1.method7910();
										local224 = Static459.aClass3_Sub4_Sub1_1.method7934();
										Static176.method2776();
										Static436.method5969(local224, local5662);
										Static307.aClass171_79 = null;
										return true;
									} else if (Static149.aClass171_33 == Static307.aClass171_79) {
										local73 = Static459.aClass3_Sub4_Sub1_1.method7929();
										local224 = Static459.aClass3_Sub4_Sub1_1.method7935();
										Static176.method2776();
										Static266.method3927(local224, local73);
										Static307.aClass171_79 = null;
										return true;
									} else if (Static307.aClass171_79 == Static613.aClass171_149) {
										Static554.method7316(Static524.aClass177_27);
										Static307.aClass171_79 = null;
										return true;
									} else if (Static622.aClass171_151 == Static307.aClass171_79) {
										Static321.anInt10318 = Static156.anInt2887;
										Static307.aClass171_79 = null;
										Static390.anInt6507 = 1;
										return true;
									} else if (Static285.aClass171_71 == Static307.aClass171_79) {
										local73 = Static459.aClass3_Sub4_Sub1_1.method7895();
										Static176.method2776();
										@Pc(5737) Class3_Sub25 local5737 = (Class3_Sub25) Static513.aClass333_33.method7489((long) local73);
										if (local5737 != null) {
											Static186.method2905(local5737, true, false);
										}
										if (Static84.aClass265_4 != null) {
											Static218.method3194(Static84.aClass265_4);
											Static84.aClass265_4 = null;
										}
										Static307.aClass171_79 = null;
										return true;
									} else if (Static209.aClass171_41 == Static307.aClass171_79) {
										Static389.aByte90 = Static459.aClass3_Sub4_Sub1_1.method7960();
										if (Static389.aByte90 == 0 || Static389.aByte90 == 1) {
											Static15.aBoolean15 = true;
										}
										Static307.aClass171_79 = null;
										return true;
									} else if (Static307.aClass171_79 == Static27.aClass171_6) {
										local721 = Static459.aClass3_Sub4_Sub1_1.method7954() == 1;
										local725 = Static459.aClass3_Sub4_Sub1_1.method7922();
										local275 = local725;
										if (local721) {
											local275 = Static459.aClass3_Sub4_Sub1_1.method7922();
										}
										local1899 = Static459.aClass3_Sub4_Sub1_1.method7946();
										local1700 = (long) Static459.aClass3_Sub4_Sub1_1.method7951();
										local3334 = (long) Static459.aClass3_Sub4_Sub1_1.method7945();
										local1002 = Static459.aClass3_Sub4_Sub1_1.method7954();
										@Pc(5825) long local5825 = (local1700 << 32) + local3334;
										@Pc(5827) boolean local5827 = false;
										local1497 = 0;
										while (true) {
											if (local1497 >= 100) {
												if (local1002 <= 1) {
													if (Static511.aBoolean563 && !Static14.aBoolean14 || Static656.aBoolean736) {
														local5827 = true;
													} else if (Static86.method1379(local275)) {
														local5827 = true;
													}
												}
												break;
											}
											if (aLongArray14[local1497] == local5825) {
												local5827 = true;
												break;
											}
											local1497++;
										}
										if (!local5827 && Static260.anInt4566 == 0) {
											aLongArray14[Static204.anInt3591] = local5825;
											Static204.anInt3591 = (Static204.anInt3591 + 1) % 100;
											@Pc(5895) String local5895 = Static495.method6507(Static588.method7791(Static459.aClass3_Sub4_Sub1_1));
											if (local1002 == 2 || local1002 == 3) {
												Static556.method7325(-1, local5895, 0, Static364.method5248(local1899), 9, "<img=1>" + local725, "<img=1>" + local275, local725);
											} else if (local1002 == 1) {
												Static556.method7325(-1, local5895, 0, Static364.method5248(local1899), 9, "<img=0>" + local725, "<img=0>" + local275, local725);
											} else {
												Static556.method7325(-1, local5895, 0, Static364.method5248(local1899), 9, local725, local275, local725);
											}
										}
										Static307.aClass171_79 = null;
										return true;
									} else if (Static571.aClass171_139 == Static307.aClass171_79) {
										local73 = Static459.aClass3_Sub4_Sub1_1.method7954();
										local224 = Static459.aClass3_Sub4_Sub1_1.method7954();
										local364 = Static459.aClass3_Sub4_Sub1_1.method7947();
										Static211.anIntArray204[local224] = local364;
										Static244.anIntArray256[local224] = local73;
										Static375.anIntArray405[local224] = 1;
										local376 = Static104.anIntArray116[local224] - 1;
										for (local962 = 0; local962 < local376; local962++) {
											if (Class3_Sub16.anIntArray151[local962] <= local364) {
												Static375.anIntArray405[local224] = local962 + 2;
											}
										}
										Static333.anIntArray310[Static416.anInt6762++ & 0x1F] = local224;
										Static307.aClass171_79 = null;
										return true;
									} else if (Static307.aClass171_79 == Static149.aClass171_32) {
										local73 = Static459.aClass3_Sub4_Sub1_1.method7959();
										local224 = Static459.aClass3_Sub4_Sub1_1.method7914();
										@Pc(6058) int[] local6058 = new int[4];
										for (local376 = 0; local376 < 4; local376++) {
											local6058[local376] = Static459.aClass3_Sub4_Sub1_1.method7935();
										}
										@Pc(6079) Class3_Sub52 local6079 = (Class3_Sub52) Static105.aClass333_11.method7489((long) local73);
										if (local6079 != null) {
											Static9.method173(local6079.aClass34_Sub1_Sub1_Sub2_Sub2_2, local6058, local224);
										}
										Static307.aClass171_79 = null;
										return true;
									} else if (Static108.aClass171_22 == Static307.aClass171_79) {
										local73 = Static459.aClass3_Sub4_Sub1_1.method7921();
										local224 = Static459.aClass3_Sub4_Sub1_1.method7926();
										Static176.method2776();
										Static62.method1134(local224, local73);
										Static307.aClass171_79 = null;
										return true;
									} else if (Static571.aClass171_140 == Static307.aClass171_79) {
										local73 = Static459.aClass3_Sub4_Sub1_1.method7929();
										Static176.method2776();
										Static309.method4447(-1, local73, 3, -1);
										Static307.aClass171_79 = null;
										return true;
									} else if (Static307.aClass171_79 == Static295.aClass171_73) {
										local73 = Static459.aClass3_Sub4_Sub1_1.method7959();
										local1645 = Static459.aClass3_Sub4_Sub1_1.method7906();
										Static176.method2776();
										Static447.method6066(local1645, local73);
										Static307.aClass171_79 = null;
										return true;
									} else if (Static307.aClass171_79 == Static316.aClass171_80) {
										local721 = Static459.aClass3_Sub4_Sub1_1.method7954() == 1;
										local725 = Static459.aClass3_Sub4_Sub1_1.method7922();
										local275 = local725;
										if (local721) {
											local275 = Static459.aClass3_Sub4_Sub1_1.method7922();
										}
										local1899 = Static459.aClass3_Sub4_Sub1_1.method7946();
										local1700 = (long) Static459.aClass3_Sub4_Sub1_1.method7951();
										local3334 = (long) Static459.aClass3_Sub4_Sub1_1.method7945();
										local1002 = Static459.aClass3_Sub4_Sub1_1.method7954();
										local1029 = Static459.aClass3_Sub4_Sub1_1.method7951();
										@Pc(6207) long local6207 = local3334 + (local1700 << 32);
										@Pc(6209) boolean local6209 = false;
										local1212 = 0;
										while (true) {
											if (local1212 >= 100) {
												if (local1002 <= 1 && Static86.method1379(local275)) {
													local6209 = true;
												}
												break;
											}
											if (aLongArray14[local1212] == local6207) {
												local6209 = true;
												break;
											}
											local1212++;
										}
										if (!local6209 && Static260.anInt4566 == 0) {
											aLongArray14[Static204.anInt3591] = local6207;
											Static204.anInt3591 = (Static204.anInt3591 + 1) % 100;
											@Pc(6267) String local6267 = Static116.aClass284_1.method6224(local1029).method6746(Static459.aClass3_Sub4_Sub1_1);
											if (local1002 == 2) {
												Static556.method7325(local1029, local6267, 0, Static364.method5248(local1899), 20, "<img=1>" + local725, "<img=1>" + local275, local725);
											} else if (local1002 == 1) {
												Static556.method7325(local1029, local6267, 0, Static364.method5248(local1899), 20, "<img=0>" + local725, "<img=0>" + local275, local725);
											} else {
												Static556.method7325(local1029, local6267, 0, Static364.method5248(local1899), 20, local725, local275, local725);
											}
										}
										Static307.aClass171_79 = null;
										return true;
									} else if (Static307.aClass171_79 == Static329.aClass171_87) {
										local721 = Static459.aClass3_Sub4_Sub1_1.method7954() == 1;
										local725 = Static459.aClass3_Sub4_Sub1_1.method7922();
										local3318 = (long) Static459.aClass3_Sub4_Sub1_1.method7951();
										local386 = (long) Static459.aClass3_Sub4_Sub1_1.method7945();
										local526 = Static459.aClass3_Sub4_Sub1_1.method7954();
										local584 = Static459.aClass3_Sub4_Sub1_1.method7951();
										local4469 = (local3318 << 32) + local386;
										local1128 = false;
										@Pc(6393) Class3_Sub26 local6393 = local721 ? Static121.aClass3_Sub26_1 : Static213.aClass3_Sub26_2;
										if (local6393 == null) {
											local1128 = true;
										} else {
											label2170: {
												for (local1037 = 0; local1037 < 100; local1037++) {
													if (local4469 == aLongArray14[local1037]) {
														local1128 = true;
														break label2170;
													}
												}
												if (local526 <= 1 && Static86.method1379(local725)) {
													local1128 = true;
												}
											}
										}
										if (!local1128 && Static260.anInt4566 == 0) {
											aLongArray14[Static204.anInt3591] = local4469;
											Static204.anInt3591 = (Static204.anInt3591 + 1) % 100;
											local1975 = Static116.aClass284_1.method6224(local584).method6746(Static459.aClass3_Sub4_Sub1_1);
											local1497 = local721 ? 42 : 45;
											if (local526 == 2 || local526 == 3) {
												Static556.method7325(local584, local1975, 0, local6393.aString53, local1497, "<img=1>" + local725, "<img=1>" + local725, local725);
											} else if (local526 == 1) {
												Static556.method7325(local584, local1975, 0, local6393.aString53, local1497, "<img=0>" + local725, "<img=0>" + local725, local725);
											} else {
												Static556.method7325(local584, local1975, 0, local6393.aString53, local1497, local725, local725, local725);
											}
										}
										Static307.aClass171_79 = null;
										return true;
									} else if (Static381.aClass171_100 == Static307.aClass171_79) {
										Static459.aClass3_Sub4_Sub1_1.anInt9739 += 28;
										if (Static459.aClass3_Sub4_Sub1_1.method7952()) {
											Static433.method7310(Static459.aClass3_Sub4_Sub1_1, Static459.aClass3_Sub4_Sub1_1.anInt9739 - 28);
										}
										Static307.aClass171_79 = null;
										return true;
									} else if (Static307.aClass171_79 == Static494.aClass171_125) {
										local73 = Static459.aClass3_Sub4_Sub1_1.method7929();
										local224 = Static459.aClass3_Sub4_Sub1_1.method7951();
										local364 = Static459.aClass3_Sub4_Sub1_1.method7926();
										local376 = Static459.aClass3_Sub4_Sub1_1.method7951();
										Static176.method2776();
										Static309.method4447(local376 << 16 | local364, local73, 7, local224);
										Static307.aClass171_79 = null;
										return true;
									} else if (Static320.aClass171_83 == Static307.aClass171_79) {
										local73 = Static459.aClass3_Sub4_Sub1_1.method7954();
										local224 = local73 >> 5;
										local364 = local73 & 0x1F;
										if (local364 == 0) {
											Static171.aClass252Array1[local224] = null;
											Static307.aClass171_79 = null;
											return true;
										}
										@Pc(6630) Class252 local6630 = new Class252();
										local6630.anInt6681 = local364;
										local6630.anInt6684 = Static459.aClass3_Sub4_Sub1_1.method7954();
										if (local6630.anInt6684 >= 0 && Static14.aClass6Array1.length > local6630.anInt6684) {
											if (local6630.anInt6681 == 1 || local6630.anInt6681 == 10) {
												local6630.anInt6678 = Static459.aClass3_Sub4_Sub1_1.method7951();
												Static459.aClass3_Sub4_Sub1_1.anInt9739 += 6;
											} else if (local6630.anInt6681 >= 2 && local6630.anInt6681 <= 6) {
												if (local6630.anInt6681 == 2) {
													local6630.anInt6674 = 256;
													local6630.anInt6676 = 256;
												}
												if (local6630.anInt6681 == 3) {
													local6630.anInt6676 = 256;
													local6630.anInt6674 = 0;
												}
												if (local6630.anInt6681 == 4) {
													local6630.anInt6674 = 512;
													local6630.anInt6676 = 256;
												}
												if (local6630.anInt6681 == 5) {
													local6630.anInt6676 = 0;
													local6630.anInt6674 = 256;
												}
												if (local6630.anInt6681 == 6) {
													local6630.anInt6674 = 256;
													local6630.anInt6676 = 512;
												}
												local6630.anInt6681 = 2;
												local6630.anInt6679 = Static459.aClass3_Sub4_Sub1_1.method7954();
												local6630.anInt6674 += Static459.aClass3_Sub4_Sub1_1.method7951() - Static534.anInt8358 << 9;
												local6630.anInt6676 += Static459.aClass3_Sub4_Sub1_1.method7951() - Static402.anInt6661 << 9;
												local6630.anInt6685 = Static459.aClass3_Sub4_Sub1_1.method7954() << 2;
												local6630.anInt6677 = Static459.aClass3_Sub4_Sub1_1.method7951();
											}
											local6630.anInt6680 = Static459.aClass3_Sub4_Sub1_1.method7951();
											if (local6630.anInt6680 == 65535) {
												local6630.anInt6680 = -1;
											}
											Static171.aClass252Array1[local224] = local6630;
										}
										Static307.aClass171_79 = null;
										return true;
									} else if (Static251.aClass171_58 == Static307.aClass171_79) {
										Static215.anInt3719 = Static156.anInt2887;
										local721 = Static459.aClass3_Sub4_Sub1_1.method7954() == 1;
										if (Static147.anInt2709 != 1) {
											if (local721) {
												Static465.aClass342_3 = new Class342(Static459.aClass3_Sub4_Sub1_1);
											} else {
												Static234.aClass342_1 = new Class342(Static459.aClass3_Sub4_Sub1_1);
											}
											Static307.aClass171_79 = null;
											return true;
										}
										if (local721) {
											Static465.aClass342_3 = null;
										} else {
											Static234.aClass342_1 = null;
										}
										Static307.aClass171_79 = null;
										return true;
									} else if (Static307.aClass171_79 == Static41.aClass171_10) {
										local73 = Static459.aClass3_Sub4_Sub1_1.method7926();
										Static176.method2776();
										Static663.method8843(local73);
										Static307.aClass171_79 = null;
										return true;
									} else if (Static307.aClass171_79 == Static505.aClass171_128) {
										local73 = Static459.aClass3_Sub4_Sub1_1.method7959();
										local224 = Static459.aClass3_Sub4_Sub1_1.method7959();
										local364 = Static459.aClass3_Sub4_Sub1_1.method7921();
										local376 = Static459.aClass3_Sub4_Sub1_1.method7926();
										Static176.method2776();
										Static546.method7000(local364, local376, local224, local73);
										Static307.aClass171_79 = null;
										return true;
									} else if (Static307.aClass171_79 == Static32.aClass171_9) {
										local73 = Static459.aClass3_Sub4_Sub1_1.method7954();
										local224 = Static459.aClass3_Sub4_Sub1_1.method7934();
										local364 = Static459.aClass3_Sub4_Sub1_1.method7959() << 2;
										local376 = Static459.aClass3_Sub4_Sub1_1.method7954();
										local962 = Static459.aClass3_Sub4_Sub1_1.method7934();
										Static176.method2776();
										Static651.method8744(local73, local364, local376, local962, local224);
										Static307.aClass171_79 = null;
										return true;
									} else if (Static278.aClass171_68 == Static307.aClass171_79) {
										local1762 = Static459.aClass3_Sub4_Sub1_1.method7922();
										local224 = Static459.aClass3_Sub4_Sub1_1.method7951();
										local275 = Static116.aClass284_1.method6224(local224).method6746(Static459.aClass3_Sub4_Sub1_1);
										Static556.method7325(local224, local275, 0, (String) null, 19, local1762, local1762, local1762);
										Static307.aClass171_79 = null;
										return true;
									} else if (Static108.aClass171_21 == Static307.aClass171_79) {
										for (local73 = 0; local73 < Static506.aClass34_Sub1_Sub1_Sub2_Sub1Array1.length; local73++) {
											if (Static506.aClass34_Sub1_Sub1_Sub2_Sub1Array1[local73] != null) {
												Static506.aClass34_Sub1_Sub1_Sub2_Sub1Array1[local73].anIntArray527 = null;
												Static506.aClass34_Sub1_Sub1_Sub2_Sub1Array1[local73].anInt9664 = -1;
											}
										}
										for (local224 = 0; local224 < Static331.anInt5501; local224++) {
											Static129.aClass3_Sub52Array3[local224].aClass34_Sub1_Sub1_Sub2_Sub2_2.anIntArray527 = null;
											Static129.aClass3_Sub52Array3[local224].aClass34_Sub1_Sub1_Sub2_Sub2_2.anInt9664 = -1;
										}
										Static307.aClass171_79 = null;
										return true;
									} else if (Static641.aClass171_157 == Static307.aClass171_79) {
										local721 = Static459.aClass3_Sub4_Sub1_1.method7954() == 1;
										@Pc(7042) byte[] local7042 = new byte[Static147.anInt2709 - 1];
										Static459.aClass3_Sub4_Sub1_1.method7958(0, local7042, Static147.anInt2709 - 1);
										Static551.method7075(local721, local7042);
										Static307.aClass171_79 = null;
										return true;
									} else if (Static122.aClass171_26 == Static307.aClass171_79) {
										local73 = Static459.aClass3_Sub4_Sub1_1.method7951();
										local224 = Static459.aClass3_Sub4_Sub1_1.method7921();
										local364 = Static459.aClass3_Sub4_Sub1_1.method7935();
										Static176.method2776();
										Static356.method5147(local224, local73 + (local364 << 16));
										Static307.aClass171_79 = null;
										return true;
									} else if (Static307.aClass171_79 == Static414.aClass171_105) {
										local73 = Static459.aClass3_Sub4_Sub1_1.method7921();
										local224 = Static459.aClass3_Sub4_Sub1_1.method7951();
										Static210.aClass262_1.method5780(local73, local224);
										Static307.aClass171_79 = null;
										return true;
									} else if (Static274.aClass171_67 == Static307.aClass171_79) {
										local73 = Static459.aClass3_Sub4_Sub1_1.method7934();
										local224 = Static459.aClass3_Sub4_Sub1_1.method7954();
										local364 = Static459.aClass3_Sub4_Sub1_1.method7935();
										if (local364 == 65535) {
											local364 = -1;
										}
										Static353.method5114(local224, local73, local364);
										Static307.aClass171_79 = null;
										return true;
									} else if (Static421.aClass171_107 == Static307.aClass171_79) {
										local73 = Static459.aClass3_Sub4_Sub1_1.method7951();
										if (local73 == 65535) {
											local73 = -1;
										}
										local224 = Static459.aClass3_Sub4_Sub1_1.method7945();
										local364 = Static459.aClass3_Sub4_Sub1_1.method7914();
										Static511.method6668(local364, local73, local224);
										Static307.aClass171_79 = null;
										return true;
									} else if (Static577.aClass171_142 == Static307.aClass171_79) {
										Static554.method7316(Static447.aClass177_22);
										Static307.aClass171_79 = null;
										return true;
									} else if (Static241.aClass171_54 == Static307.aClass171_79) {
										Static232.anInt4116 = Static156.anInt2887;
										local721 = Static459.aClass3_Sub4_Sub1_1.method7954() == 1;
										if (Static147.anInt2709 != 1) {
											if (local721) {
												Static121.aClass3_Sub26_1 = new Class3_Sub26(Static459.aClass3_Sub4_Sub1_1);
											} else {
												Static213.aClass3_Sub26_2 = new Class3_Sub26(Static459.aClass3_Sub4_Sub1_1);
											}
											Static307.aClass171_79 = null;
											return true;
										}
										Static307.aClass171_79 = null;
										if (local721) {
											Static121.aClass3_Sub26_1 = null;
										} else {
											Static213.aClass3_Sub26_2 = null;
										}
										return true;
									} else if (Static101.aClass171_18 == Static307.aClass171_79) {
										local73 = Static459.aClass3_Sub4_Sub1_1.method7894();
										local224 = Static459.aClass3_Sub4_Sub1_1.method7929();
										local364 = Static459.aClass3_Sub4_Sub1_1.method7918();
										Static176.method2776();
										Static424.method5841(local364, local224, local73);
										Static307.aClass171_79 = null;
										return true;
									} else if (Static169.aClass171_34 == Static307.aClass171_79) {
										Static22.method529();
										Static307.aClass171_79 = null;
										return false;
									} else if (Static516.aClass171_129 == Static307.aClass171_79) {
										local73 = Static459.aClass3_Sub4_Sub1_1.method7951();
										if (local73 == 65535) {
											local73 = -1;
										}
										local224 = Static459.aClass3_Sub4_Sub1_1.method7954();
										local364 = Static459.aClass3_Sub4_Sub1_1.method7951();
										local376 = Static459.aClass3_Sub4_Sub1_1.method7954();
										local962 = Static459.aClass3_Sub4_Sub1_1.method7951();
										Static224.method3294(local962, local224, local73, local376, false, local364);
										Static307.aClass171_79 = null;
										return true;
									} else if (Static307.aClass171_79 == Static237.aClass171_50) {
										if (Static438.aFrame1 != null) {
											Static551.method7076(false, Static336.aClass3_Sub41_18.aClass14_Sub13_2.method4048(), -1, -1);
										}
										@Pc(7318) byte[] local7318 = new byte[Static147.anInt2709];
										Static459.aClass3_Sub4_Sub1_1.method330(Static147.anInt2709, local7318);
										local725 = Static216.method3190(local7318, Static147.anInt2709, 0);
										Static473.method6299(Static566.aClass92_6, local725, true, Static336.aClass3_Sub41_18.aClass14_Sub7_2.method2899() == 1);
										Static307.aClass171_79 = null;
										return true;
									} else if (Static170.aClass171_35 == Static307.aClass171_79) {
										Static554.method7316(Static395.aClass177_18);
										Static307.aClass171_79 = null;
										return true;
									} else {
										Static456.method6140("T1 - " + (Static307.aClass171_79 == null ? -1 : Static307.aClass171_79.method3996()) + "," + (Static268.aClass171_64 == null ? -1 : Static268.aClass171_64.method3996()) + "," + (Static78.aClass171_15 == null ? -1 : Static78.aClass171_15.method3996()) + " - " + Static147.anInt2709, (Throwable) null);
										Static316.method4541(false);
										return true;
									}
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(IZLjava/lang/String;I)V")
	public static void method5492(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) String arg2) {
		Static226.method3390();
		if (arg0 == 0) {
			Static119.aClass95_4 = Static599.method6438(Static545.aClass362_122, Static336.aClass3_Sub41_18.aClass14_Sub10_2.method3046() * 2, Static559.anInterface2_11, 0, Static330.aCanvas5);
			if (arg2 != null) {
				Static119.aClass95_4.GA(0);
				@Pc(36) Class91 local36 = Static362.method5238(Static583.aClass362_138, Static642.anInt10556);
				@Pc(45) Class67 local45 = Static119.aClass95_4.method8032(local36, Static688.method8597(Static142.aClass362_32, Static642.anInt10556));
				Static242.method5991();
				Static651.method8742(true, arg2, Static119.aClass95_4, local36, local45);
			}
		} else {
			@Pc(58) Class95 local58 = null;
			@Pc(88) Class67 local88;
			if (arg2 != null) {
				local58 = Static599.method6438(Static545.aClass362_122, 0, Static559.anInterface2_11, 0, Static330.aCanvas5);
				local58.GA(0);
				@Pc(79) Class91 local79 = Static362.method5238(Static583.aClass362_138, Static642.anInt10556);
				local88 = local58.method8032(local79, Static688.method8597(Static142.aClass362_32, Static642.anInt10556));
				Static242.method5991();
				Static651.method8742(true, arg2, local58, local79, local88);
			}
			boolean var14 = false;
			label216: {
				try {
					var14 = true;
					Static119.aClass95_4 = Static599.method6438(Static545.aClass362_122, Static336.aClass3_Sub41_18.aClass14_Sub10_2.method3046() * 2, Static559.anInterface2_11, arg0, Static330.aCanvas5);
					if (arg2 != null) {
						local58.GA(0);
						@Pc(123) Class91 local123 = Static362.method5238(Static583.aClass362_138, Static642.anInt10556);
						@Pc(132) Class67 local132 = local58.method8032(local123, Static688.method8597(Static142.aClass362_32, Static642.anInt10556));
						Static242.method5991();
						Static651.method8742(true, arg2, local58, local123, local132);
					}
					if (Static119.aClass95_4.method8059()) {
						@Pc(148) boolean local148 = true;
						try {
							local148 = Static395.aClass3_Sub28_1.anInt4590 > 256;
						} catch (@Pc(160) Throwable local160) {
						}
						@Pc(166) Class3_Sub51 local166;
						if (local148) {
							local166 = Static119.aClass95_4.method8015(146800640);
						} else {
							local166 = Static119.aClass95_4.method8015(104857600);
						}
						Static119.aClass95_4.method8031(local166);
						var14 = false;
					} else {
						var14 = false;
					}
					break label216;
				} catch (@Pc(177) Throwable local177) {
					@Pc(182) int local182 = Static336.aClass3_Sub41_18.aClass14_Sub7_2.method2899();
					if (local182 == 2) {
						Static45.aBoolean57 = true;
					}
					Static336.aClass3_Sub41_18.method6705(0, Static336.aClass3_Sub41_18.aClass14_Sub7_2);
					method5492(local182, arg1, arg2);
					@Pc(201) Object local201 = null;
					var14 = false;
				} finally {
					if (var14) {
						local88 = null;
						if (local58 != null) {
							try {
								local58.method8007();
							} catch (@Pc(358) Throwable local358) {
							}
						}
					}
				}
				if (local58 != null) {
					try {
						local58.method8007();
					} catch (@Pc(338) Throwable local338) {
					}
				}
				return;
			}
			local88 = null;
			if (local58 != null) {
				try {
					local58.method8007();
				} catch (@Pc(348) Throwable local348) {
				}
			}
		}
		Static336.aClass3_Sub41_18.aClass14_Sub7_2.method2898(!arg1);
		Static336.aClass3_Sub41_18.method6705(arg0, Static336.aClass3_Sub41_18.aClass14_Sub7_2);
		Static160.method2585();
		Static119.aClass95_4.method7991();
		Static119.aClass95_4.X(32);
		Static360.aClass17_3 = Static119.aClass95_4.method8063();
		Static586.aClass17_9 = Static119.aClass95_4.method8063();
		Static397.method7855();
		Static119.aClass95_4.method8009(Static336.aClass3_Sub41_18.aClass14_Sub28_1.method8458() == 1);
		if (Static119.aClass95_4.method8003()) {
			Static645.method8679(Static336.aClass3_Sub41_18.aClass14_Sub24_1.method6457() == 1);
		}
		Static59.method1096(Static438.anInt7120 >> 3, Static119.aClass95_4, Static98.anInt361 >> 3);
		Static451.method6102();
		Static88.aBoolean149 = true;
		Static74.aBoolean102 = false;
		Static367.aClass304Array166 = null;
		Static587.method7789();
	}

	@OriginalMember(owner = "client!ej", name = "b", descriptor = "(B)V")
	public static void method5493() {
		Static491.aClass95_11.xa(((float) Static336.aClass3_Sub41_18.aClass14_Sub14_1.method4344() * 0.1F + 0.7F) * 1.1523438F);
		Static491.aClass95_11.ZA(Static358.anInt6108, 0.69921875F, 1.2F, -200.0F, -240.0F, -200.0F);
		Static491.aClass95_11.L(Static627.anInt10389, -1, 0);
		Static491.aClass95_11.method7989(Static43.aClass57_1);
	}
}
