import java.io.IOException;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static130 {

	@OriginalMember(owner = "client!gf", name = "Sb", descriptor = "Lclient!pi;")
	public static final Class184 aClass184_218 = new Class184(93, -1);

	@OriginalMember(owner = "client!gf", name = "sc", descriptor = "I")
	public static int anInt6132 = -1;

	@OriginalMember(owner = "client!gf", name = "c", descriptor = "(B)Lclient!ta;")
	public static Class159 method4832() {
		try {
			return new Class159_Sub2();
		} catch (@Pc(8) Throwable local8) {
			try {
				return (Class159) Class.forName("Class159_Sub1").getDeclaredConstructor().newInstance();
			} catch (@Pc(19) Throwable local19) {
				return new Class159_Sub3();
			}
		}
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(ILclient!hs;ILjava/lang/String;)Lclient!qd;")
	public static Class190 method4841(@OriginalArg(0) int arg0, @OriginalArg(1) Class103 arg1, @OriginalArg(3) String arg2) {
		if (arg0 == 0) {
			return arg1.method2817(arg2);
		}
		@Pc(41) Class190 local41;
		if (arg0 == 1) {
			try {
				Static462.method4868(new Object[] { (new URL(arg1.anApplet1.getCodeBase(), arg2)).toString() }, arg1.anApplet1, "openjs");
				local41 = new Class190();
				local41.anInt5799 = 1;
				return local41;
			} catch (@Pc(47) Throwable local47) {
				local41 = new Class190();
				local41.anInt5799 = 2;
				return local41;
			}
		} else if (arg0 == 2) {
			try {
				arg1.anApplet1.getAppletContext().showDocument(new URL(arg1.anApplet1.getCodeBase(), arg2), "_blank");
				local41 = new Class190();
				local41.anInt5799 = 1;
				return local41;
			} catch (@Pc(87) Exception local87) {
				local41 = new Class190();
				local41.anInt5799 = 2;
				return local41;
			}
		} else if (arg0 == 3) {
			try {
				Static462.method4867(arg1.anApplet1, "loggedout");
			} catch (@Pc(109) Throwable local109) {
			}
			try {
				arg1.anApplet1.getAppletContext().showDocument(new URL(arg1.anApplet1.getCodeBase(), arg2), "_top");
				local41 = new Class190();
				local41.anInt5799 = 1;
				return local41;
			} catch (@Pc(131) Exception local131) {
				local41 = new Class190();
				local41.anInt5799 = 2;
				return local41;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(Z)Z")
	public static boolean method4847() throws IOException {
		if (Static122.aClass27_1 == null) {
			return false;
		}
		@Pc(11) int local11 = Static122.aClass27_1.method894();
		if (local11 == 0) {
			return false;
		}
		@Pc(68) int local68;
		if (Static62.aClass184_57 == null) {
			if (Static82.aBoolean138) {
				local11--;
				Static122.aClass27_1.method896(Static110.aClass3_Sub2_Sub2_1.aByteArray95, 1, 0);
				Static82.aBoolean138 = false;
				Static197.anInt4307++;
			}
			Static110.aClass3_Sub2_Sub2_1.anInt7620 = 0;
			if (Static110.aClass3_Sub2_Sub2_1.method6064()) {
				if (local11 == 0) {
					return false;
				}
				Static122.aClass27_1.method896(Static110.aClass3_Sub2_Sub2_1.aByteArray95, 1, 1);
				local11--;
				Static197.anInt4307++;
			}
			Static82.aBoolean138 = true;
			@Pc(64) Class184[] local64 = Static187.method3123();
			local68 = Static110.aClass3_Sub2_Sub2_1.method6061();
			if (local68 < 0 || local64.length <= local68) {
				throw new IOException("invo:" + local68 + " ip:" + Static110.aClass3_Sub2_Sub2_1.anInt7620);
			}
			Static62.aClass184_57 = local64[local68];
			Static113.anInt6862 = Static62.aClass184_57.anInt5598;
		}
		if (Static113.anInt6862 == -1) {
			if (local11 <= 0) {
				return false;
			}
			Static122.aClass27_1.method896(Static110.aClass3_Sub2_Sub2_1.aByteArray95, 1, 0);
			Static197.anInt4307++;
			Static113.anInt6862 = Static110.aClass3_Sub2_Sub2_1.aByteArray95[0] & 0xFF;
			local11--;
		}
		if (Static113.anInt6862 == -2) {
			if (local11 <= 1) {
				return false;
			}
			Static122.aClass27_1.method896(Static110.aClass3_Sub2_Sub2_1.aByteArray95, 2, 0);
			Static110.aClass3_Sub2_Sub2_1.anInt7620 = 0;
			local11 -= 2;
			Static113.anInt6862 = Static110.aClass3_Sub2_Sub2_1.method6004();
			Static197.anInt4307 += 2;
		}
		if (Static113.anInt6862 > local11) {
			return false;
		}
		Static110.aClass3_Sub2_Sub2_1.anInt7620 = 0;
		Static122.aClass27_1.method896(Static110.aClass3_Sub2_Sub2_1.aByteArray95, Static113.anInt6862, 0);
		Static19.anInt597 = 0;
		Static286.aClass184_217 = Static62.aClass184_58;
		Static197.anInt4307 += Static113.anInt6862;
		Static62.aClass184_58 = Static119.aClass184_92;
		Static119.aClass184_92 = Static62.aClass184_57;
		@Pc(204) int local204;
		@Pc(221) int local221;
		@Pc(217) int local217;
		if (Static62.aClass184_57 == Static147.aClass184_104) {
			local204 = Static110.aClass3_Sub2_Sub2_1.method6004();
			if (local204 == 65535) {
				local204 = -1;
			}
			local68 = Static110.aClass3_Sub2_Sub2_1.method6053();
			local217 = Static110.aClass3_Sub2_Sub2_1.method6004();
			local221 = Static110.aClass3_Sub2_Sub2_1.method6053();
			Static222.method3517(local204, local221, local68, local217);
			Static62.aClass184_57 = null;
			return true;
		} else if (Static159.aClass184_113 == Static62.aClass184_57) {
			Static228.method5989(true);
			Static62.aClass184_57 = null;
			return true;
		} else if (Static62.aClass184_57 == Static246.aClass184_87) {
			Static358.anInt5917 = Static110.aClass3_Sub2_Sub2_1.method6013();
			Static282.anInt5193 = Static110.aClass3_Sub2_Sub2_1.method6053();
			Static62.aClass184_57 = null;
			return true;
		} else {
			@Pc(263) String local263;
			@Pc(269) String local269;
			if (Static62.aClass184_57 == Static151.aClass184_107) {
				local263 = Static110.aClass3_Sub2_Sub2_1.method6027();
				local269 = Static80.method1411(Static248.method3803(Static110.aClass3_Sub2_Sub2_1));
				Static304.method4490(local263, local263, 0, 6, local269);
				Static62.aClass184_57 = null;
				return true;
			} else if (Static62.aClass184_57 == Static291.aClass184_191) {
				Static381.method2281(Static166.aClass87_13);
				Static62.aClass184_57 = null;
				return true;
			} else if (Static62.aClass184_57 == Static325.aClass184_207) {
				local204 = Static110.aClass3_Sub2_Sub2_1.method6010();
				local68 = Static110.aClass3_Sub2_Sub2_1.method6004();
				local217 = Static110.aClass3_Sub2_Sub2_1.method6010();
				local221 = Static110.aClass3_Sub2_Sub2_1.method6006();
				if (Static271.method4648(local68)) {
					Static289.method4237(local217, local204, 5, local221);
				}
				Static62.aClass184_57 = null;
				return true;
			} else if (Static62.aClass184_57 == Static19.aClass184_21) {
				Static381.method2281(Static442.aClass87_21);
				Static62.aClass184_57 = null;
				return true;
			} else if (Static300.aClass184_195 == Static62.aClass184_57) {
				local204 = Static110.aClass3_Sub2_Sub2_1.method6006();
				local68 = Static110.aClass3_Sub2_Sub2_1.method5992();
				local217 = Static110.aClass3_Sub2_Sub2_1.method6046();
				local221 = Static110.aClass3_Sub2_Sub2_1.method6025();
				if (Static271.method4648(local204)) {
					Static116.method5251(local221, local68, local217);
				}
				Static62.aClass184_57 = null;
				return true;
			} else {
				@Pc(393) int local393;
				if (Static244.aClass184_168 == Static62.aClass184_57) {
					local204 = Static110.aClass3_Sub2_Sub2_1.method6003();
					local68 = Static110.aClass3_Sub2_Sub2_1.method6041();
					local217 = Static110.aClass3_Sub2_Sub2_1.method6006();
					local221 = Static110.aClass3_Sub2_Sub2_1.method6010();
					local393 = Static110.aClass3_Sub2_Sub2_1.method6006();
					if (Static271.method4648(local393)) {
						Static428.method5677(local204, local68, local217, local221);
					}
					Static62.aClass184_57 = null;
					return true;
				} else if (Static62.aClass184_57 == Static83.aClass184_66) {
					Static381.method2281(Static183.aClass87_16);
					Static62.aClass184_57 = null;
					return true;
				} else if (Static62.aClass184_57 == Static177.aClass184_126) {
					if (Static337.anInt6221 != -1) {
						Static289.method4240(Static337.anInt6221, 0);
					}
					Static62.aClass184_57 = null;
					return true;
				} else {
					@Pc(470) int local470;
					@Pc(485) Class3_Sub26 local485;
					@Pc(479) long local479;
					@Pc(494) Class3_Sub26 local494;
					if (Static78.aClass184_65 == Static62.aClass184_57) {
						local204 = Static110.aClass3_Sub2_Sub2_1.method6010();
						local68 = Static110.aClass3_Sub2_Sub2_1.method6004();
						local217 = Static110.aClass3_Sub2_Sub2_1.method6041();
						local221 = Static110.aClass3_Sub2_Sub2_1.method6041();
						if (local221 == 65535) {
							local221 = -1;
						}
						local393 = Static110.aClass3_Sub2_Sub2_1.method6003();
						if (local393 == 65535) {
							local393 = -1;
						}
						if (Static271.method4648(local68)) {
							for (local470 = local393; local470 <= local221; local470++) {
								local479 = (long) local470 + ((long) local204 << 32);
								local485 = (Class3_Sub26) Static101.aClass127_10.method3246(local479);
								if (local485 != null) {
									local494 = new Class3_Sub26(local485.anInt4282, local217);
									local485.method5987();
								} else if (local470 == -1) {
									local494 = new Class3_Sub26(Static321.method4661(local204).aClass3_Sub26_1.anInt4282, local217);
								} else {
									local494 = new Class3_Sub26(0, local217);
								}
								Static101.aClass127_10.method3257(local479, local494);
							}
						}
						Static62.aClass184_57 = null;
						return true;
					} else if (Static93.aClass184_76 == Static62.aClass184_57) {
						Static381.method2281(Static169.aClass87_14);
						Static62.aClass184_57 = null;
						return true;
					} else if (Static62.aClass184_57 == Static76.aClass184_62) {
						Static286.method4827();
						Static62.aClass184_57 = null;
						return true;
					} else if (Static62.aClass184_57 == Static96.aClass184_79) {
						local204 = Static110.aClass3_Sub2_Sub2_1.method6003();
						local68 = Static110.aClass3_Sub2_Sub2_1.method6044();
						local217 = Static110.aClass3_Sub2_Sub2_1.method6025();
						if (Static271.method4648(local204)) {
							Static435.method5759(local217, local68);
						}
						Static62.aClass184_57 = null;
						return true;
					} else {
						@Pc(611) Class3_Sub40 local611;
						if (Static125.aClass184_37 == Static62.aClass184_57) {
							local204 = Static110.aClass3_Sub2_Sub2_1.method6041();
							local68 = Static110.aClass3_Sub2_Sub2_1.method6004();
							local217 = Static110.aClass3_Sub2_Sub2_1.method6044();
							local221 = Static110.aClass3_Sub2_Sub2_1.method6025();
							if (Static271.method4648(local204)) {
								local611 = (Class3_Sub40) Static30.aClass127_3.method3246((long) local221);
								if (local611 != null) {
									Static316.method4612(false, local611.anInt6668 != local68, local611);
								}
								Static298.method4386(false, local68, local217, local221);
							}
							Static62.aClass184_57 = null;
							return true;
						} else if (Static62.aClass184_57 == Static231.aClass184_156) {
							local204 = Static110.aClass3_Sub2_Sub2_1.method6003();
							local68 = Static110.aClass3_Sub2_Sub2_1.method6044();
							local217 = Static110.aClass3_Sub2_Sub2_1.method6041();
							if (Static271.method4648(local217)) {
								if (local68 == 2) {
									Static393.method5310();
								}
								Static337.anInt6221 = local204;
								Static348.method5827(local204);
								Static300.method4442(false);
								Static272.method4043(Static337.anInt6221);
								for (local221 = 0; local221 < 100; local221++) {
									Static308.aBooleanArray18[local221] = true;
								}
							}
							Static62.aClass184_57 = null;
							return true;
						} else {
							@Pc(707) String local707;
							if (Static215.aClass184_146 == Static62.aClass184_57) {
								local263 = Static110.aClass3_Sub2_Sub2_1.method6027();
								local68 = Static110.aClass3_Sub2_Sub2_1.method6004();
								local707 = Static32.aClass259_1.method5865(local68).method4657(Static110.aClass3_Sub2_Sub2_1);
								Static157.method2729(local707, local263, null, 19, 0, local68, local263);
								Static62.aClass184_57 = null;
								return true;
							} else if (Static62.aClass184_57 == Static264.aClass184_179) {
								local204 = Static110.aClass3_Sub2_Sub2_1.method6003();
								local68 = Static110.aClass3_Sub2_Sub2_1.method6006();
								local707 = Static110.aClass3_Sub2_Sub2_1.method6027();
								if (Static271.method4648(local68)) {
									Static230.method3589(local204, local707);
								}
								Static62.aClass184_57 = null;
								return true;
							} else if (Static104.aClass184_82 == Static62.aClass184_57) {
								Static381.method2281(Static283.aClass87_17);
								Static62.aClass184_57 = null;
								return true;
							} else {
								@Pc(938) int local938;
								@Pc(791) boolean local791;
								@Pc(958) Class26 local958;
								@Pc(935) boolean local935;
								@Pc(932) int local932;
								if (Static62.aClass184_57 == Static260.aClass184_257) {
									Static101.anInt2261 = Static296.anInt5417;
									if (Static113.anInt6862 == 0) {
										Static62.aClass184_57 = null;
										Static154.anInt3337 = 0;
										Static127.aString24 = null;
										Static65.aClass26Array2 = null;
										Static289.aString53 = null;
										return true;
									}
									Static127.aString24 = Static110.aClass3_Sub2_Sub2_1.method6027();
									local791 = Static110.aClass3_Sub2_Sub2_1.method6053() == 1;
									if (local791) {
										Static110.aClass3_Sub2_Sub2_1.method6027();
									}
									@Pc(805) long local805 = Static110.aClass3_Sub2_Sub2_1.method6047();
									Static289.aString53 = Static319.method4638(local805);
									Static320.aByte74 = Static110.aClass3_Sub2_Sub2_1.method6011();
									local221 = Static110.aClass3_Sub2_Sub2_1.method6053();
									if (local221 == 255) {
										Static62.aClass184_57 = null;
										return true;
									}
									Static154.anInt3337 = local221;
									@Pc(831) Class26[] local831 = new Class26[100];
									for (local470 = 0; local470 < Static154.anInt3337; local470++) {
										local831[local470] = new Class26();
										local831[local470].aString5 = Static110.aClass3_Sub2_Sub2_1.method6027();
										local791 = Static110.aClass3_Sub2_Sub2_1.method6053() == 1;
										if (local791) {
											local831[local470].aString7 = Static110.aClass3_Sub2_Sub2_1.method6027();
										} else {
											local831[local470].aString7 = local831[local470].aString5;
										}
										local831[local470].aString6 = Static274.method4071(local831[local470].aString7);
										local831[local470].anInt1022 = Static110.aClass3_Sub2_Sub2_1.method6004();
										local831[local470].aByte11 = Static110.aClass3_Sub2_Sub2_1.method6011();
										local831[local470].aString8 = Static110.aClass3_Sub2_Sub2_1.method6027();
										if (local831[local470].aString7.equals(Static113.aClass1_Sub3_Sub3_Sub1_4.aString47)) {
											Static125.aByte10 = local831[local470].aByte11;
										}
									}
									local932 = Static154.anInt3337;
									while (local932 > 0) {
										local935 = true;
										local932--;
										for (local938 = 0; local938 < local932; local938++) {
											if (local831[local938].aString6.compareTo(local831[local938 + 1].aString6) > 0) {
												local958 = local831[local938];
												local831[local938] = local831[local938 + 1];
												local935 = false;
												local831[local938 + 1] = local958;
											}
										}
										if (local935) {
											break;
										}
									}
									Static65.aClass26Array2 = local831;
									Static62.aClass184_57 = null;
									return true;
								} else if (Static62.aClass184_57 == Static155.aClass184_110) {
									local204 = Static110.aClass3_Sub2_Sub2_1.method6006();
									local68 = Static110.aClass3_Sub2_Sub2_1.method6041();
									local217 = Static110.aClass3_Sub2_Sub2_1.method6014();
									if (Static271.method4648(local68)) {
										Static301.method4448(local204, local217);
									}
									Static62.aClass184_57 = null;
									return true;
								} else if (Static62.aClass184_57 == Static361.aClass184_237) {
									local204 = Static110.aClass3_Sub2_Sub2_1.method6025();
									local68 = Static110.aClass3_Sub2_Sub2_1.method6003();
									if (local68 == 65535) {
										local68 = -1;
									}
									local217 = Static110.aClass3_Sub2_Sub2_1.method6006();
									if (Static271.method4648(local217)) {
										Static289.method4237(-1, local204, 1, local68);
									}
									Static62.aClass184_57 = null;
									return true;
								} else if (Static62.aClass184_57 == Static184.aClass184_130) {
									Static381.method2281(Static406.aClass87_20);
									Static62.aClass184_57 = null;
									return true;
								} else if (Static356.aClass184_229 == Static62.aClass184_57) {
									local204 = Static110.aClass3_Sub2_Sub2_1.method6004();
									if (local204 == 65535) {
										local204 = -1;
									}
									local68 = Static110.aClass3_Sub2_Sub2_1.method6053();
									local217 = Static110.aClass3_Sub2_Sub2_1.method6004();
									local221 = Static110.aClass3_Sub2_Sub2_1.method6053();
									Static171.method2968(local204, local217, local221, local68);
									Static62.aClass184_57 = null;
									return true;
								} else if (Static62.aClass184_57 == Static78.aClass184_64) {
									local204 = Static110.aClass3_Sub2_Sub2_1.method6025();
									local68 = Static110.aClass3_Sub2_Sub2_1.method6003();
									local217 = Static110.aClass3_Sub2_Sub2_1.method6004();
									if (Static271.method4648(local217)) {
										Static418.method5597(local204, local68);
									}
									Static62.aClass184_57 = null;
									return true;
								} else if (Static62.aClass184_57 == Static366.aClass184_239) {
									local204 = Static110.aClass3_Sub2_Sub2_1.method6004();
									local68 = Static110.aClass3_Sub2_Sub2_1.method6041();
									if (local68 == 65535) {
										local68 = -1;
									}
									local217 = Static110.aClass3_Sub2_Sub2_1.method6051();
									local221 = Static110.aClass3_Sub2_Sub2_1.method6051();
									if (Static271.method4648(local204)) {
										Static32.method783(local68, local217, local221);
										@Pc(1161) Class191 local1161 = Static89.aClass157_1.method3832(local68);
										Static428.method5677(local1161.anInt5823, local1161.anInt5821, local1161.lb, local221);
										Static217.method3473(local1161.anInt5816, local1161.anInt5834, local221, local1161.anInt5802);
									}
									Static62.aClass184_57 = null;
									return true;
								} else {
									@Pc(1218) long local1218;
									@Pc(1223) long local1223;
									@Pc(1227) int local1227;
									@Pc(1241) int local1241;
									if (Static62.aClass184_57 == Static302.aClass184_196) {
										local791 = Static110.aClass3_Sub2_Sub2_1.method6053() == 1;
										local269 = Static110.aClass3_Sub2_Sub2_1.method6027();
										local707 = local269;
										if (local791) {
											local707 = Static110.aClass3_Sub2_Sub2_1.method6027();
										}
										local1218 = Static110.aClass3_Sub2_Sub2_1.method6004();
										local1223 = Static110.aClass3_Sub2_Sub2_1.method6020();
										local1227 = Static110.aClass3_Sub2_Sub2_1.method6053();
										local932 = Static110.aClass3_Sub2_Sub2_1.method6004();
										@Pc(1237) long local1237 = local1223 + (local1218 << 32);
										@Pc(1239) boolean local1239 = false;
										local1241 = 0;
										while (true) {
											if (local1241 >= 100) {
												if (local1227 <= 1 && Static55.method1113(local707)) {
													local1239 = true;
												}
												break;
											}
											if (local1237 == Static120.aLongArray2[local1241]) {
												local1239 = true;
												break;
											}
											local1241++;
										}
										if (!local1239 && Static343.anInt6238 == 0) {
											Static120.aLongArray2[Static5.anInt99] = local1237;
											Static5.anInt99 = (Static5.anInt99 + 1) % 100;
											@Pc(1293) String local1293 = Static32.aClass259_1.method5865(local932).method4657(Static110.aClass3_Sub2_Sub2_1);
											if (local1227 == 2) {
												Static157.method2729(local1293, "<img=1>" + local269, null, 18, 0, local932, "<img=1>" + local707);
											} else if (local1227 == 1) {
												Static157.method2729(local1293, "<img=0>" + local269, null, 18, 0, local932, "<img=0>" + local707);
											} else {
												Static157.method2729(local1293, local269, null, 18, 0, local932, local707);
											}
										}
										Static62.aClass184_57 = null;
										return true;
									} else if (Static62.aClass184_57 == Static238.aClass184_162) {
										local204 = Static110.aClass3_Sub2_Sub2_1.method6004();
										local68 = Static110.aClass3_Sub2_Sub2_1.method6053();
										local217 = Static110.aClass3_Sub2_Sub2_1.method6053();
										local221 = Static110.aClass3_Sub2_Sub2_1.method6004() << 0;
										local393 = Static110.aClass3_Sub2_Sub2_1.method6053();
										local470 = Static110.aClass3_Sub2_Sub2_1.method6053();
										if (Static271.method4648(local204)) {
											Static437.method5857(local221, local470, local393, local217, local68);
										}
										Static62.aClass184_57 = null;
										return true;
									} else if (Static62.aClass184_57 == Static240.aClass184_163) {
										local204 = Static110.aClass3_Sub2_Sub2_1.method5992();
										local68 = Static110.aClass3_Sub2_Sub2_1.method6006();
										local217 = Static110.aClass3_Sub2_Sub2_1.method6025();
										if (Static271.method4648(local68)) {
											Static7.method162(local204, local217);
										}
										Static62.aClass184_57 = null;
										return true;
									} else if (Static62.aClass184_57 == Static61.aClass184_55) {
										local204 = Static110.aClass3_Sub2_Sub2_1.method6014();
										local68 = Static110.aClass3_Sub2_Sub2_1.method6006();
										local217 = Static110.aClass3_Sub2_Sub2_1.method6006();
										local221 = Static110.aClass3_Sub2_Sub2_1.method6003();
										local393 = Static110.aClass3_Sub2_Sub2_1.method6004();
										if (Static271.method4648(local221)) {
											Static289.method4237(local217, local204, 7, local68 | local393 << 16);
										}
										Static62.aClass184_57 = null;
										return true;
									} else if (Static62.aClass184_57 == Static254.aClass184_172) {
										local204 = Static110.aClass3_Sub2_Sub2_1.method6025();
										local68 = Static110.aClass3_Sub2_Sub2_1.method6003();
										local217 = Static110.aClass3_Sub2_Sub2_1.method6004();
										if (Static271.method4648(local217)) {
											Static377.method5211(local204, local68);
										}
										Static62.aClass184_57 = null;
										return true;
									} else if (Static307.aClass184_198 == Static62.aClass184_57) {
										local204 = Static110.aClass3_Sub2_Sub2_1.method6006();
										local68 = Static110.aClass3_Sub2_Sub2_1.method5997();
										Static369.aClass11_1.method460(local68, local204);
										Static62.aClass184_57 = null;
										return true;
									} else if (Static62.aClass184_57 == Static241.aClass184_165) {
										local204 = Static110.aClass3_Sub2_Sub2_1.method6014();
										Static64.aClass190_2 = Static295.aClass103_5.method2816(local204);
										Static62.aClass184_57 = null;
										return true;
									} else if (Static62.aClass184_57 == Static87.aClass184_127) {
										local204 = Static110.aClass3_Sub2_Sub2_1.method6051();
										local68 = Static110.aClass3_Sub2_Sub2_1.method6006();
										if (Static271.method4648(local68)) {
											Static289.method4237(-1, local204, 3, -1);
										}
										Static62.aClass184_57 = null;
										return true;
									} else if (Static422.aClass184_267 == Static62.aClass184_57) {
										Static331.method4556(Static110.aClass3_Sub2_Sub2_1, Static113.anInt6862);
										Static62.aClass184_57 = null;
										return true;
									} else if (Static148.aClass184_105 == Static62.aClass184_57) {
										Static308.method4522(Static110.aClass3_Sub2_Sub2_1.method6027());
										Static62.aClass184_57 = null;
										return true;
									} else if (Static62.aClass184_57 == Static229.aClass184_154) {
										local204 = Static110.aClass3_Sub2_Sub2_1.method6014();
										local68 = Static110.aClass3_Sub2_Sub2_1.method6004();
										Static369.aClass11_1.method469(local204, local68);
										Static62.aClass184_57 = null;
										return true;
									} else if (Static326.aClass184_209 == Static62.aClass184_57) {
										Static369.aClass11_1.method459();
										Static62.aClass184_57 = null;
										Static118.anInt2603 += 32;
										return true;
									} else {
										@Pc(1659) String local1659;
										@Pc(1634) String local1634;
										@Pc(1636) String local1636;
										if (Static62.aClass184_57 == Static400.aClass184_254) {
											local204 = Static110.aClass3_Sub2_Sub2_1.method6040();
											local68 = Static110.aClass3_Sub2_Sub2_1.method6014();
											local217 = Static110.aClass3_Sub2_Sub2_1.method6053();
											local1634 = "";
											local1636 = local1634;
											if ((local217 & 0x1) != 0) {
												local1634 = Static110.aClass3_Sub2_Sub2_1.method6027();
												if ((local217 & 0x2) == 0) {
													local1636 = local1634;
												} else {
													local1636 = Static110.aClass3_Sub2_Sub2_1.method6027();
												}
											}
											local1659 = Static110.aClass3_Sub2_Sub2_1.method6027();
											if (local204 == 99) {
												Static438.method5862(local1659);
											} else if (local1636.equals("") || !Static55.method1113(local1636)) {
												Static304.method4490(local1634, local1636, local68, local204, local1659);
											} else {
												Static62.aClass184_57 = null;
												return true;
											}
											Static62.aClass184_57 = null;
											return true;
										} else if (Static62.aClass184_57 == Static262.aClass184_178) {
											local204 = Static110.aClass3_Sub2_Sub2_1.method6003();
											if (local204 == 65535) {
												local204 = -1;
											}
											local68 = Static110.aClass3_Sub2_Sub2_1.method6051();
											local217 = Static110.aClass3_Sub2_Sub2_1.method6041();
											if (Static271.method4648(local217)) {
												Static165.method2896(local68, local204);
											}
											Static62.aClass184_57 = null;
											return true;
										} else {
											@Pc(1736) byte local1736;
											if (Static62.aClass184_57 == Static207.aClass184_144) {
												local204 = Static110.aClass3_Sub2_Sub2_1.method6003();
												local1736 = Static110.aClass3_Sub2_Sub2_1.method6048();
												local217 = Static110.aClass3_Sub2_Sub2_1.method6041();
												if (Static271.method4648(local217)) {
													Static301.method4448(local204, local1736);
												}
												Static62.aClass184_57 = null;
												return true;
											} else if (Static38.aClass184_38 == Static62.aClass184_57) {
												local204 = Static110.aClass3_Sub2_Sub2_1.method6041();
												local68 = Static110.aClass3_Sub2_Sub2_1.method6010();
												local707 = Static110.aClass3_Sub2_Sub2_1.method6027();
												if (Static271.method4648(local204)) {
													Static433.method5745(local68, local707);
												}
												Static62.aClass184_57 = null;
												return true;
											} else if (Static62.aClass184_57 == Static198.aClass184_133) {
												local204 = Static110.aClass3_Sub2_Sub2_1.method6004();
												if (local204 == 65535) {
													local204 = -1;
												}
												local68 = Static110.aClass3_Sub2_Sub2_1.method5997();
												local217 = Static110.aClass3_Sub2_Sub2_1.method5997();
												local1634 = Static110.aClass3_Sub2_Sub2_1.method6027();
												if (local68 >= 1 && local68 <= 8) {
													if (local1634.equalsIgnoreCase("null")) {
														local1634 = null;
													}
													Static88.aStringArray42[local68 - 1] = local1634;
													Static192.anIntArray295[local68 - 1] = local204;
													Static324.aBooleanArray2[local68 - 1] = local217 == 0;
												}
												Static62.aClass184_57 = null;
												return true;
											} else if (Static424.aClass184_81 == Static62.aClass184_57) {
												Static340.anInt6291 = Static110.aClass3_Sub2_Sub2_1.method6039();
												Static62.aClass184_57 = null;
												Static1.anInt48 = Static296.anInt5417;
												return true;
											} else if (Static192.aClass184_132 == Static62.aClass184_57) {
												Static255.anInt4768 = Static296.anInt5417;
												Static147.anInt3266 = 1;
												Static62.aClass184_57 = null;
												return true;
											} else if (Static454.aClass184_278 == Static62.aClass184_57) {
												Static149.aString31 = Static113.anInt6862 <= 2 ? Static259.aClass175_162.method4201(Static216.anInt4257) : Static110.aClass3_Sub2_Sub2_1.method6027();
												Static30.anInt826 = Static113.anInt6862 <= 0 ? -1 : Static110.aClass3_Sub2_Sub2_1.method6004();
												Static62.aClass184_57 = null;
												if (Static30.anInt826 == 65535) {
													Static30.anInt826 = -1;
												}
												return true;
											} else if (Static105.aClass184_84 == Static62.aClass184_57) {
												local204 = Static110.aClass3_Sub2_Sub2_1.method6041();
												if (local204 == 65535) {
													local204 = -1;
												}
												local68 = Static110.aClass3_Sub2_Sub2_1.method6041();
												local217 = Static110.aClass3_Sub2_Sub2_1.method6051();
												local221 = Static110.aClass3_Sub2_Sub2_1.method6010();
												local393 = Static110.aClass3_Sub2_Sub2_1.method6006();
												if (local393 == 65535) {
													local393 = -1;
												}
												if (Static271.method4648(local68)) {
													for (local470 = local204; local470 <= local393; local470++) {
														local479 = ((long) local221 << 32) + ((long) local470);
														local485 = (Class3_Sub26) Static101.aClass127_10.method3246(local479);
														if (local485 != null) {
															local494 = new Class3_Sub26(local217, local485.anInt4280);
															local485.method5987();
														} else if (local470 == -1) {
															local494 = new Class3_Sub26(local217, Static321.method4661(local221).aClass3_Sub26_1.anInt4280);
														} else {
															local494 = new Class3_Sub26(local217, -1);
														}
														Static101.aClass127_10.method3257(local479, local494);
													}
												}
												Static62.aClass184_57 = null;
												return true;
											} else if (Static62.aClass184_57 == Static102.aClass184_23) {
												local204 = Static110.aClass3_Sub2_Sub2_1.method6041();
												local1736 = Static110.aClass3_Sub2_Sub2_1.method6050();
												Static369.aClass11_1.method469(local1736, local204);
												Static62.aClass184_57 = null;
												return true;
											} else if (Static216.aClass184_148 == Static62.aClass184_57) {
												Static110.aClass3_Sub2_Sub2_1.anInt7620 += 28;
												if (Static110.aClass3_Sub2_Sub2_1.method6017()) {
													Static197.method3513(Static110.aClass3_Sub2_Sub2_1, Static110.aClass3_Sub2_Sub2_1.anInt7620 - 28);
												}
												Static62.aClass184_57 = null;
												return true;
											} else {
												@Pc(2108) long local2108;
												@Pc(2116) int local2116;
												if (Static62.aClass184_57 == Static77.aClass184_63) {
													local791 = Static110.aClass3_Sub2_Sub2_1.method6053() == 1;
													local269 = Static110.aClass3_Sub2_Sub2_1.method6027();
													local707 = local269;
													if (local791) {
														local707 = Static110.aClass3_Sub2_Sub2_1.method6027();
													}
													local1218 = Static110.aClass3_Sub2_Sub2_1.method6047();
													local1223 = Static110.aClass3_Sub2_Sub2_1.method6004();
													local2108 = Static110.aClass3_Sub2_Sub2_1.method6020();
													local938 = Static110.aClass3_Sub2_Sub2_1.method6053();
													local2116 = Static110.aClass3_Sub2_Sub2_1.method6004();
													@Pc(2122) long local2122 = local2108 + (local1223 << 32);
													@Pc(2124) boolean local2124 = false;
													@Pc(2126) int local2126 = 0;
													while (true) {
														if (local2126 >= 100) {
															if (local938 <= 1 && Static55.method1113(local707)) {
																local2124 = true;
															}
															break;
														}
														if (Static120.aLongArray2[local2126] == local2122) {
															local2124 = true;
															break;
														}
														local2126++;
													}
													if (!local2124 && Static343.anInt6238 == 0) {
														Static120.aLongArray2[Static5.anInt99] = local2122;
														Static5.anInt99 = (Static5.anInt99 + 1) % 100;
														@Pc(2178) String local2178 = Static32.aClass259_1.method5865(local2116).method4657(Static110.aClass3_Sub2_Sub2_1);
														if (local938 == 2) {
															Static157.method2729(local2178, "<img=1>" + local269, Static414.method5553(local1218), 20, 0, local2116, "<img=1>" + local707);
														} else if (local938 == 1) {
															Static157.method2729(local2178, "<img=0>" + local269, Static414.method5553(local1218), 20, 0, local2116, "<img=0>" + local707);
														} else {
															Static157.method2729(local2178, local269, Static414.method5553(local1218), 20, 0, local2116, local707);
														}
													}
													Static62.aClass184_57 = null;
													return true;
												}
												@Pc(2955) int local2955;
												@Pc(2285) boolean local2285;
												@Pc(2304) int local2304;
												@Pc(2327) boolean local2327;
												if (Static9.aClass184_11 == Static62.aClass184_57) {
													local204 = Static110.aClass3_Sub2_Sub2_1.method6003();
													local68 = Static110.aClass3_Sub2_Sub2_1.method6003();
													local217 = Static110.aClass3_Sub2_Sub2_1.method6004();
													local221 = Static110.aClass3_Sub2_Sub2_1.method6053();
													local393 = Static110.aClass3_Sub2_Sub2_1.method6025();
													local2285 = (local221 & 0x80) != 0;
													if (local393 >> 30 == 0) {
														@Pc(2351) Class186 local2351;
														@Pc(2408) Class96 local2408;
														@Pc(2356) Class186 local2356;
														@Pc(2375) Class96 local2375;
														@Pc(2381) Class96 local2381;
														if (local393 >> 29 != 0) {
															local2304 = local393 & 0xFFFF;
															@Pc(2626) Class1_Sub3_Sub3_Sub2 local2626 = Static451.aClass1_Sub3_Sub3_Sub2Array1[local2304];
															if (local2626 != null) {
																if (local204 == 65535) {
																	local204 = -1;
																}
																local2327 = true;
																local938 = local2285 ? local2626.anInt6079 : local2626.anInt6104;
																if (local204 != -1 && local938 != -1) {
																	if (local938 == local204) {
																		local2351 = Static102.aClass91_2.method2560(local204);
																		if (local2351.aBoolean406 && local2351.anInt5611 != -1) {
																			local2408 = Static196.aClass30_2.method942(local2351.anInt5611);
																			local1241 = local2408.anInt3320;
																			if (local1241 == 0 || local1241 == 2) {
																				local2327 = false;
																			} else if (local1241 == 1) {
																				local2327 = true;
																			}
																		}
																	} else {
																		local2351 = Static102.aClass91_2.method2560(local204);
																		local2356 = Static102.aClass91_2.method2560(local938);
																		if (local2351.anInt5611 != -1 && local2356.anInt5611 != -1) {
																			local2375 = Static196.aClass30_2.method942(local2351.anInt5611);
																			local2381 = Static196.aClass30_2.method942(local2356.anInt5611);
																			if (local2375.anInt3323 < local2381.anInt3323) {
																				local2327 = false;
																			}
																		}
																	}
																}
																if (local2327) {
																	if (local2285) {
																		local2626.anInt6079 = local204;
																		local2626.anInt6098 = local68 + Static290.anInt5325;
																		local2626.anInt6088 = 1;
																		local2626.anInt6130 = local221 & 0x7;
																		local2626.anInt6106 = 0;
																		local2626.anInt6131 = 0;
																		local2626.anInt6113 = local217;
																		if (Static290.anInt5325 < local2626.anInt6098) {
																			local2626.anInt6106 = -1;
																		}
																		if (local2626.anInt6079 != -1 && local2626.anInt6098 == Static290.anInt5325) {
																			local2116 = Static102.aClass91_2.method2560(local2626.anInt6079).anInt5611;
																			if (local2116 != -1) {
																				local2408 = Static196.aClass30_2.method942(local2116);
																				if (local2408 != null && local2408.anIntArray253 != null) {
																					Static86.method1483(local2626.anInt6053, 0, local2626.aByte77, local2626.anInt6055, local2408, false);
																				}
																			}
																		}
																	} else {
																		local2626.anInt6062 = local68 + Static290.anInt5325;
																		local2626.anInt6091 = local221 & 0x7;
																		local2626.anInt6074 = 0;
																		local2626.anInt6104 = local204;
																		local2626.anInt6095 = 1;
																		local2626.anInt6070 = 0;
																		local2626.anInt6063 = local217;
																		if (Static290.anInt5325 < local2626.anInt6062) {
																			local2626.anInt6074 = -1;
																		}
																		if (local2626.anInt6104 != -1 && Static290.anInt5325 == local2626.anInt6062) {
																			local2116 = Static102.aClass91_2.method2560(local2626.anInt6104).anInt5611;
																			if (local2116 != -1) {
																				local2408 = Static196.aClass30_2.method942(local2116);
																				if (local2408 != null && local2408.anIntArray253 != null) {
																					Static86.method1483(local2626.anInt6053, 0, local2626.aByte77, local2626.anInt6055, local2408, false);
																				}
																			}
																		}
																	}
																}
															}
														} else if (local393 >> 28 != 0) {
															local2304 = local393 & 0xFFFF;
															@Pc(2313) Class1_Sub3_Sub3_Sub1 local2313;
															if (local2304 == Static177.anInt3617) {
																local2313 = Static113.aClass1_Sub3_Sub3_Sub1_4;
															} else {
																local2313 = Static308.aClass1_Sub3_Sub3_Sub1Array1[local2304];
															}
															if (local2313 != null) {
																if (local204 == 65535) {
																	local204 = -1;
																}
																local2327 = true;
																local938 = local2285 ? local2313.anInt6079 : local2313.anInt6104;
																if (local204 != -1 && local938 != -1) {
																	if (local938 == local204) {
																		local2351 = Static102.aClass91_2.method2560(local204);
																		if (local2351.aBoolean406 && local2351.anInt5611 != -1) {
																			local2408 = Static196.aClass30_2.method942(local2351.anInt5611);
																			local1241 = local2408.anInt3320;
																			if (local1241 == 0 || local1241 == 2) {
																				local2327 = false;
																			} else if (local1241 == 1) {
																				local2327 = true;
																			}
																		}
																	} else {
																		local2351 = Static102.aClass91_2.method2560(local204);
																		local2356 = Static102.aClass91_2.method2560(local938);
																		if (local2351.anInt5611 != -1 && local2356.anInt5611 != -1) {
																			local2375 = Static196.aClass30_2.method942(local2351.anInt5611);
																			local2381 = Static196.aClass30_2.method942(local2356.anInt5611);
																			if (local2375.anInt3323 < local2381.anInt3323) {
																				local2327 = false;
																			}
																		}
																	}
																}
																if (local2327) {
																	if (local2285) {
																		local2313.anInt6088 = 1;
																		local2313.anInt6079 = local204;
																		local2313.anInt6098 = Static290.anInt5325 + local68;
																		local2313.anInt6113 = local217;
																		local2313.anInt6131 = 0;
																		local2313.anInt6106 = 0;
																		local2313.anInt6130 = local221 & 0x7;
																		if (local2313.anInt6079 == 65535) {
																			local2313.anInt6079 = -1;
																		}
																		if (Static290.anInt5325 < local2313.anInt6098) {
																			local2313.anInt6106 = -1;
																		}
																		if (local2313.anInt6079 != -1 && local2313.anInt6098 == Static290.anInt5325) {
																			local2116 = Static102.aClass91_2.method2560(local2313.anInt6079).anInt5611;
																			if (local2116 != -1) {
																				local2408 = Static196.aClass30_2.method942(local2116);
																				if (local2408 != null && local2408.anIntArray253 != null) {
																					Static86.method1483(local2313.anInt6053, 0, local2313.aByte77, local2313.anInt6055, local2408, Static113.aClass1_Sub3_Sub3_Sub1_4 == local2313);
																				}
																			}
																		}
																	} else {
																		local2313.anInt6063 = local217;
																		local2313.anInt6091 = local221 & 0x7;
																		local2313.anInt6074 = 0;
																		local2313.anInt6095 = 1;
																		local2313.anInt6104 = local204;
																		local2313.anInt6070 = 0;
																		local2313.anInt6062 = local68 + Static290.anInt5325;
																		if (local2313.anInt6104 == 65535) {
																			local2313.anInt6104 = -1;
																		}
																		if (local2313.anInt6062 > Static290.anInt5325) {
																			local2313.anInt6074 = -1;
																		}
																		if (local2313.anInt6104 != -1 && local2313.anInt6062 == Static290.anInt5325) {
																			local2116 = Static102.aClass91_2.method2560(local2313.anInt6104).anInt5611;
																			if (local2116 != -1) {
																				local2408 = Static196.aClass30_2.method942(local2116);
																				if (local2408 != null && local2408.anIntArray253 != null) {
																					Static86.method1483(local2313.anInt6053, 0, local2313.aByte77, local2313.anInt6055, local2408, local2313 == Static113.aClass1_Sub3_Sub3_Sub1_4);
																				}
																			}
																		}
																	}
																}
															}
														}
													} else {
														local2304 = local393 >> 28 & 0x3;
														local1227 = (local393 >> 14 & 0x3FFF) - Static108.anInt3458;
														local932 = (local393 & 0x3FFF) - Static339.anInt6223;
														if (local1227 >= 0 && local932 >= 0 && Static399.anInt6923 > local1227 && local932 < Static127.anInt2696) {
															local938 = local1227 * 128 + 64;
															local2116 = local932 * 128 + 64;
															local2955 = local2304;
															if (local2304 < 3 && Static202.method3303(local932, local1227)) {
																local2955 = local2304 + 1;
															}
															@Pc(2990) Class1_Sub3_Sub4 local2990 = new Class1_Sub3_Sub4(local204, 0, Static290.anInt5325, local2304, local2955, local938, Static124.method2209(local2304, local938, local2116) - local217, local2116, local1227, local1227, local932, local932, local221);
															Static324.aClass229_4.method5321(new Class3_Sub3_Sub14(local2990));
														}
													}
													Static62.aClass184_57 = null;
													return true;
												} else if (Static62.aClass184_57 == Static182.aClass184_129) {
													Static381.method2281(Static120.aClass87_10);
													Static62.aClass184_57 = null;
													return true;
												} else if (Static62.aClass184_57 == Static323.aClass184_206) {
													Static103.anInt2292 = Static110.aClass3_Sub2_Sub2_1.method6053();
													Static62.aClass184_57 = null;
													return true;
												} else if (Static455.aClass184_208 == Static62.aClass184_57) {
													local204 = Static110.aClass3_Sub2_Sub2_1.method6004();
													if (Static271.method4648(local204)) {
														Static347.method4974();
													}
													Static62.aClass184_57 = null;
													return true;
												} else if (Static205.aClass184_142 == Static62.aClass184_57) {
													local204 = Static110.aClass3_Sub2_Sub2_1.method6006();
													local68 = Static110.aClass3_Sub2_Sub2_1.method6025();
													if (Static271.method4648(local204)) {
														Static289.method4237(0, local68, 5, Static177.anInt3617);
													}
													Static62.aClass184_57 = null;
													return true;
												} else if (Static242.aClass184_167 == Static62.aClass184_57) {
													local204 = Static110.aClass3_Sub2_Sub2_1.method6053();
													local68 = local204 >> 2;
													local217 = local204 & 0x3;
													local221 = Static188.anIntArray293[local68];
													local393 = Static110.aClass3_Sub2_Sub2_1.method6010();
													local470 = local393 >> 28 & 0x3;
													local2304 = local393 >> 14 & 0x3FFF;
													local1227 = local393 & 0x3FFF;
													local932 = Static110.aClass3_Sub2_Sub2_1.method6003();
													local1227 -= Static339.anInt6223;
													local2304 -= Static108.anInt3458;
													if (local932 == 65535) {
														local932 = -1;
													}
													Static189.method3155(local221, local68, local1227, local217, local932, local2304, local470);
													Static62.aClass184_57 = null;
													return true;
												} else if (Static385.aClass184_247 == Static62.aClass184_57) {
													local204 = Static110.aClass3_Sub2_Sub2_1.method6004();
													local68 = Static110.aClass3_Sub2_Sub2_1.method6004();
													local217 = Static110.aClass3_Sub2_Sub2_1.method6004();
													local221 = Static110.aClass3_Sub2_Sub2_1.method6004();
													if (Static271.method4648(local204) && Static300.aClass68ArrayArray3[local68] != null) {
														for (local393 = local217; local393 < local221; local393++) {
															local470 = Static110.aClass3_Sub2_Sub2_1.method6020();
															if (local393 < Static300.aClass68ArrayArray3[local68].length && Static300.aClass68ArrayArray3[local68][local393] != null) {
																Static300.aClass68ArrayArray3[local68][local393].anInt2194 = local470;
															}
														}
													}
													Static62.aClass184_57 = null;
													return true;
												} else if (Static240.aClass184_164 == Static62.aClass184_57) {
													local204 = Static110.aClass3_Sub2_Sub2_1.method6025();
													local68 = Static110.aClass3_Sub2_Sub2_1.method6004();
													local217 = Static110.aClass3_Sub2_Sub2_1.method6010();
													if (Static271.method4648(local68)) {
														@Pc(3228) Class3_Sub40 local3228 = (Class3_Sub40) Static30.aClass127_3.method3246((long) local204);
														local611 = (Class3_Sub40) Static30.aClass127_3.method3246((long) local217);
														if (local611 != null) {
															Static316.method4612(false, local3228 == null || local3228.anInt6668 != local611.anInt6668, local611);
														}
														if (local3228 != null) {
															local3228.method5987();
															Static30.aClass127_3.method3257((long) local217, local3228);
														}
														@Pc(3266) Class68 local3266 = Static321.method4661(local204);
														if (local3266 != null) {
															Static442.method5899(local3266);
														}
														local3266 = Static321.method4661(local217);
														if (local3266 != null) {
															Static442.method5899(local3266);
															Static446.method5923(true, local3266);
														}
														if (Static337.anInt6221 != -1) {
															Static289.method4240(Static337.anInt6221, 1);
														}
													}
													Static62.aClass184_57 = null;
													return true;
												} else if (Static62.aClass184_57 == Static409.aClass184_259) {
													local204 = Static110.aClass3_Sub2_Sub2_1.method6053();
													@Pc(3311) boolean local3311 = (local204 & 0x1) == 1;
													local707 = Static110.aClass3_Sub2_Sub2_1.method6027();
													local1634 = Static110.aClass3_Sub2_Sub2_1.method6027();
													if (local1634.equals("")) {
														local1634 = local707;
													}
													local1636 = Static110.aClass3_Sub2_Sub2_1.method6027();
													local1659 = Static110.aClass3_Sub2_Sub2_1.method6027();
													if (local1659.equals("")) {
														local1659 = local1636;
													}
													if (local3311) {
														for (local2304 = 0; local2304 < Static363.anInt6512; local2304++) {
															if (Static422.aStringArray169[local2304].equals(local1659)) {
																Static169.aStringArray76[local2304] = local707;
																Static422.aStringArray169[local2304] = local1634;
																Static352.aStringArray127[local2304] = local1636;
																Static411.aStringArray164[local2304] = local1659;
																break;
															}
														}
													} else {
														Static169.aStringArray76[Static363.anInt6512] = local707;
														Static422.aStringArray169[Static363.anInt6512] = local1634;
														Static352.aStringArray127[Static363.anInt6512] = local1636;
														Static411.aStringArray164[Static363.anInt6512] = local1659;
														Static400.aBooleanArray22[Static363.anInt6512] = (local204 & 0x2) == 2;
														Static363.anInt6512++;
													}
													Static62.aClass184_57 = null;
													Static255.anInt4768 = Static296.anInt5417;
													return true;
												} else if (Static62.aClass184_57 == Static312.aClass184_201) {
													local204 = Static110.aClass3_Sub2_Sub2_1.method6014();
													local68 = Static110.aClass3_Sub2_Sub2_1.method6006();
													if (local68 == 65535) {
														local68 = -1;
													}
													local217 = Static110.aClass3_Sub2_Sub2_1.method6003();
													if (Static271.method4648(local217)) {
														Static289.method4237(-1, local204, 2, local68);
													}
													Static62.aClass184_57 = null;
													return true;
												} else if (Static62.aClass184_57 == Static154.aClass184_109) {
													local204 = Static110.aClass3_Sub2_Sub2_1.method6004();
													if (Static271.method4648(local204)) {
														Static344.method4923();
													}
													Static62.aClass184_57 = null;
													return true;
												} else {
													@Pc(3770) String local3770;
													if (Static62.aClass184_57 == Static139.aClass184_102) {
														while (Static113.anInt6862 > Static110.aClass3_Sub2_Sub2_1.anInt7620) {
															local791 = Static110.aClass3_Sub2_Sub2_1.method6053() == 1;
															local269 = Static110.aClass3_Sub2_Sub2_1.method6027();
															local707 = Static110.aClass3_Sub2_Sub2_1.method6027();
															local221 = Static110.aClass3_Sub2_Sub2_1.method6004();
															local393 = Static110.aClass3_Sub2_Sub2_1.method6053();
															local1659 = "";
															local935 = false;
															if (local221 > 0) {
																local1659 = Static110.aClass3_Sub2_Sub2_1.method6027();
																local935 = Static110.aClass3_Sub2_Sub2_1.method6053() == 1;
															}
															for (local1227 = 0; local1227 < Static317.anInt5757; local1227++) {
																if (local791) {
																	if (local707.equals(Static170.aStringArray78[local1227])) {
																		Static170.aStringArray78[local1227] = local269;
																		Static436.aStringArray172[local1227] = local707;
																		local269 = null;
																		break;
																	}
																} else if (local269.equals(Static170.aStringArray78[local1227])) {
																	if (local221 != Static195.anIntArray296[local1227]) {
																		Static195.anIntArray296[local1227] = local221;
																		if (local221 > 0) {
																			Static304.method4490("", "", 0, 5, local269 + Static195.aClass175_126.method4201(Static216.anInt4257));
																		}
																		if (local221 == 0) {
																			Static304.method4490("", "", 0, 5, local269 + Static235.aClass175_149.method4201(Static216.anInt4257));
																		}
																	}
																	Static436.aStringArray172[local1227] = local707;
																	Static279.aStringArray173[local1227] = local1659;
																	Static445.anIntArray576[local1227] = local393;
																	local269 = null;
																	Static430.aBooleanArray25[local1227] = local935;
																	break;
																}
															}
															if (local269 != null && Static317.anInt5757 < 200) {
																Static170.aStringArray78[Static317.anInt5757] = local269;
																Static436.aStringArray172[Static317.anInt5757] = local707;
																Static195.anIntArray296[Static317.anInt5757] = local221;
																Static279.aStringArray173[Static317.anInt5757] = local1659;
																Static445.anIntArray576[Static317.anInt5757] = local393;
																Static430.aBooleanArray25[Static317.anInt5757] = local935;
																Static317.anInt5757++;
															}
														}
														Static255.anInt4768 = Static296.anInt5417;
														Static147.anInt3266 = 2;
														local68 = Static317.anInt5757;
														while (local68 > 0) {
															local791 = true;
															local68--;
															for (local217 = 0; local217 < local68; local217++) {
																if (Static195.anIntArray296[local217] != Static379.anInt2076 && Static379.anInt2076 == Static195.anIntArray296[local217 + 1] || Static195.anIntArray296[local217] == 0 && Static195.anIntArray296[local217 + 1] != 0) {
																	local221 = Static195.anIntArray296[local217];
																	Static195.anIntArray296[local217] = Static195.anIntArray296[local217 + 1];
																	Static195.anIntArray296[local217 + 1] = local221;
																	local1636 = Static279.aStringArray173[local217];
																	Static279.aStringArray173[local217] = Static279.aStringArray173[local217 + 1];
																	Static279.aStringArray173[local217 + 1] = local1636;
																	local1659 = Static170.aStringArray78[local217];
																	Static170.aStringArray78[local217] = Static170.aStringArray78[local217 + 1];
																	Static170.aStringArray78[local217 + 1] = local1659;
																	local3770 = Static436.aStringArray172[local217];
																	Static436.aStringArray172[local217] = Static436.aStringArray172[local217 + 1];
																	Static436.aStringArray172[local217 + 1] = local3770;
																	local1227 = Static445.anIntArray576[local217];
																	Static445.anIntArray576[local217] = Static445.anIntArray576[local217 + 1];
																	Static445.anIntArray576[local217 + 1] = local1227;
																	local2327 = Static430.aBooleanArray25[local217];
																	Static430.aBooleanArray25[local217] = Static430.aBooleanArray25[local217 + 1];
																	local791 = false;
																	Static430.aBooleanArray25[local217 + 1] = local2327;
																}
															}
															if (local791) {
																break;
															}
														}
														Static62.aClass184_57 = null;
														return true;
													} else if (Static62.aClass184_57 == Static372.aClass184_60) {
														Static381.method2281(Static87.aClass87_15);
														Static62.aClass184_57 = null;
														return true;
													} else if (Static401.aClass184_256 == Static62.aClass184_57) {
														local204 = Static110.aClass3_Sub2_Sub2_1.method6051();
														local68 = Static110.aClass3_Sub2_Sub2_1.method6004();
														local217 = Static110.aClass3_Sub2_Sub2_1.method6041();
														local221 = Static110.aClass3_Sub2_Sub2_1.method6041();
														if (Static271.method4648(local217)) {
															Static356.method5050(local204, (local68 << 16) + local221);
														}
														Static62.aClass184_57 = null;
														return true;
													} else if (Static62.aClass184_57 == Static288.aClass184_188) {
														local204 = Static110.aClass3_Sub2_Sub2_1.method6053();
														if (Static110.aClass3_Sub2_Sub2_1.method6053() == 0) {
															Static131.aClass205Array1[local204] = new Class205();
														} else {
															Static110.aClass3_Sub2_Sub2_1.anInt7620--;
															Static131.aClass205Array1[local204] = new Class205(Static110.aClass3_Sub2_Sub2_1);
														}
														Static62.aClass184_57 = null;
														Static363.anInt6517 = Static296.anInt5417;
														return true;
													} else if (Static361.aClass184_236 == Static62.aClass184_57) {
														local204 = Static110.aClass3_Sub2_Sub2_1.method6006();
														local68 = Static110.aClass3_Sub2_Sub2_1.method6013();
														if (Static271.method4648(local204)) {
															Static37.anInt1026 = local68;
														}
														Static62.aClass184_57 = null;
														return true;
													} else {
														@Pc(3964) boolean local3964;
														if (Static155.aClass184_111 == Static62.aClass184_57) {
															local204 = Static110.aClass3_Sub2_Sub2_1.method6003();
															local68 = Static110.aClass3_Sub2_Sub2_1.method6044();
															local3964 = (local68 & 0x1) == 1;
															Static338.method1137(local3964, local204);
															Static427.anIntArray514[Static374.anInt6599++ & 0x1F] = local204;
															Static62.aClass184_57 = null;
															return true;
														} else if (Static259.aClass184_175 == Static62.aClass184_57) {
															local204 = Static110.aClass3_Sub2_Sub2_1.method6053();
															local68 = Static110.aClass3_Sub2_Sub2_1.method5997();
															if (local68 == 255) {
																local68 = -1;
																local204 = -1;
															}
															Static349.method5841(local204, local68);
															Static62.aClass184_57 = null;
															return true;
														} else if (Static62.aClass184_57 == Static326.aClass184_210) {
															Static176.anInt3611 = Static110.aClass3_Sub2_Sub2_1.method6004() * 30;
															Static1.anInt48 = Static296.anInt5417;
															Static62.aClass184_57 = null;
															return true;
														} else if (Static259.aClass184_176 == Static62.aClass184_57) {
															local204 = Static110.aClass3_Sub2_Sub2_1.method6004();
															local68 = Static110.aClass3_Sub2_Sub2_1.method6053();
															local217 = Static110.aClass3_Sub2_Sub2_1.method6053();
															local221 = Static110.aClass3_Sub2_Sub2_1.method6004() << 0;
															local393 = Static110.aClass3_Sub2_Sub2_1.method6053();
															local470 = Static110.aClass3_Sub2_Sub2_1.method6053();
															if (Static271.method4648(local204)) {
																Static62.method1213(local393, local217, true, local68, local470, local221);
															}
															Static62.aClass184_57 = null;
															return true;
														} else if (Static354.aClass184_226 == Static62.aClass184_57) {
															local263 = Static110.aClass3_Sub2_Sub2_1.method6027();
															local3964 = Static110.aClass3_Sub2_Sub2_1.method6053() == 1;
															if (local3964) {
																local269 = Static110.aClass3_Sub2_Sub2_1.method6027();
															} else {
																local269 = local263;
															}
															local221 = Static110.aClass3_Sub2_Sub2_1.method6004();
															@Pc(4103) byte local4103 = Static110.aClass3_Sub2_Sub2_1.method6011();
															local2285 = false;
															if (local4103 == -128) {
																local2285 = true;
															}
															if (local2285) {
																if (Static154.anInt3337 == 0) {
																	Static62.aClass184_57 = null;
																	return true;
																}
																for (local2304 = 0; local2304 < Static154.anInt3337 && (!Static65.aClass26Array2[local2304].aString7.equals(local269) || Static65.aClass26Array2[local2304].anInt1022 != local221); local2304++) {
																}
																if (local2304 < Static154.anInt3337) {
																	while (local2304 < Static154.anInt3337 - 1) {
																		Static65.aClass26Array2[local2304] = Static65.aClass26Array2[local2304 + 1];
																		local2304++;
																	}
																	Static154.anInt3337--;
																	Static65.aClass26Array2[Static154.anInt3337] = null;
																}
															} else {
																local3770 = Static110.aClass3_Sub2_Sub2_1.method6027();
																local958 = new Class26();
																local958.aString5 = local263;
																local958.aString7 = local269;
																local958.aString6 = Static274.method4071(local958.aString7);
																local958.aString8 = local3770;
																local958.aByte11 = local4103;
																local958.anInt1022 = local221;
																for (local932 = Static154.anInt3337 - 1; local932 >= 0; local932--) {
																	local938 = Static65.aClass26Array2[local932].aString6.compareTo(local958.aString6);
																	if (local938 == 0) {
																		Static65.aClass26Array2[local932].anInt1022 = local221;
																		Static65.aClass26Array2[local932].aByte11 = local4103;
																		Static65.aClass26Array2[local932].aString8 = local3770;
																		if (local269.equals(Static113.aClass1_Sub3_Sub3_Sub1_4.aString47)) {
																			Static125.aByte10 = local4103;
																		}
																		Static101.anInt2261 = Static296.anInt5417;
																		Static62.aClass184_57 = null;
																		return true;
																	}
																	if (local938 < 0) {
																		break;
																	}
																}
																if (Static65.aClass26Array2.length <= Static154.anInt3337) {
																	Static62.aClass184_57 = null;
																	return true;
																}
																for (local938 = Static154.anInt3337 - 1; local938 > local932; local938--) {
																	Static65.aClass26Array2[local938 + 1] = Static65.aClass26Array2[local938];
																}
																if (Static154.anInt3337 == 0) {
																	Static65.aClass26Array2 = new Class26[100];
																}
																Static65.aClass26Array2[local932 + 1] = local958;
																Static154.anInt3337++;
																if (local269.equals(Static113.aClass1_Sub3_Sub3_Sub1_4.aString47)) {
																	Static125.aByte10 = local4103;
																}
															}
															Static101.anInt2261 = Static296.anInt5417;
															Static62.aClass184_57 = null;
															return true;
														} else if (Static1.aClass184_1 == Static62.aClass184_57) {
															Static286.anInt6054 = Static110.aClass3_Sub2_Sub2_1.method6053();
															Static393.anInt6761 = Static110.aClass3_Sub2_Sub2_1.method6050() << 3;
															Static426.anInt7294 = Static110.aClass3_Sub2_Sub2_1.method6050() << 3;
															while (Static110.aClass3_Sub2_Sub2_1.anInt7620 < Static113.anInt6862) {
																@Pc(4347) Class87 local4347 = Static315.method4604()[Static110.aClass3_Sub2_Sub2_1.method6053()];
																Static381.method2281(local4347);
															}
															Static62.aClass184_57 = null;
															return true;
														} else if (Static62.aClass184_57 == Static167.aClass184_234) {
															Static347.method4976(Static110.aClass3_Sub2_Sub2_1, Static113.anInt6862, Static295.aClass103_5);
															Static62.aClass184_57 = null;
															return true;
														} else if (Static128.aClass184_97 == Static62.aClass184_57) {
															local204 = Static110.aClass3_Sub2_Sub2_1.method6004();
															local68 = Static110.aClass3_Sub2_Sub2_1.method6053();
															local217 = Static110.aClass3_Sub2_Sub2_1.method6053();
															local221 = Static110.aClass3_Sub2_Sub2_1.method6053();
															local393 = Static110.aClass3_Sub2_Sub2_1.method6053();
															local470 = Static110.aClass3_Sub2_Sub2_1.method6004();
															if (Static271.method4648(local204)) {
																Static310.aBooleanArray23[local68] = true;
																Static21.anIntArray47[local68] = local217;
																Static35.anIntArray427[local68] = local221;
																Static40.anIntArray586[local68] = local393;
																Static355.anIntArray460[local68] = local470;
															}
															Static62.aClass184_57 = null;
															return true;
														} else if (Static330.aClass184_214 == Static62.aClass184_57) {
															local204 = Static110.aClass3_Sub2_Sub2_1.method6010();
															local68 = Static110.aClass3_Sub2_Sub2_1.method6044();
															local217 = Static110.aClass3_Sub2_Sub2_1.method5997();
															Static216.anIntArray322[local68] = local204;
															Static54.anIntArray81[local68] = local217;
															Static231.anIntArray341[local68] = 1;
															local221 = Static171.anIntArray274[local68] - 1;
															for (local393 = 0; local393 < local221; local393++) {
																if (local204 >= Class3_Sub20.anIntArray222[local393]) {
																	Static231.anIntArray341[local68] = local393 + 2;
																}
															}
															Static94.anIntArray174[Static436.anInt7406++ & 0x1F] = local68;
															Static62.aClass184_57 = null;
															return true;
														} else if (Static412.aClass184_262 == Static62.aClass184_57) {
															Static153.aClass215_55 = Static91.method1566(Static110.aClass3_Sub2_Sub2_1.method6053());
															Static62.aClass184_57 = null;
															return true;
														} else if (Static62.aClass184_57 == Static41.aClass184_41) {
															local204 = Static110.aClass3_Sub2_Sub2_1.method6003();
															local68 = Static110.aClass3_Sub2_Sub2_1.method6006();
															local217 = Static110.aClass3_Sub2_Sub2_1.method6053();
															@Pc(4534) Class1_Sub3_Sub3_Sub2 local4534 = Static451.aClass1_Sub3_Sub3_Sub2Array1[local68];
															if (local4534 != null) {
																Static319.method4637(local204, local4534, local217);
															}
															Static62.aClass184_57 = null;
															return true;
														} else if (Static218.aClass184_150 == Static62.aClass184_57) {
															Static228.method5989(false);
															Static62.aClass184_57 = null;
															return true;
														} else if (Static371.aClass184_241 == Static62.aClass184_57) {
															Static381.method2281(Static146.aClass87_12);
															Static62.aClass184_57 = null;
															return true;
														} else if (Static62.aClass184_57 == Static418.aClass184_264) {
															local204 = Static110.aClass3_Sub2_Sub2_1.method6004();
															local68 = Static110.aClass3_Sub2_Sub2_1.method6053();
															local3964 = (local68 & 0x1) == 1;
															Static402.method5436(local204, local3964);
															local221 = Static110.aClass3_Sub2_Sub2_1.method6004();
															for (local393 = 0; local393 < local221; local393++) {
																local470 = Static110.aClass3_Sub2_Sub2_1.method6013();
																if (local470 == 255) {
																	local470 = Static110.aClass3_Sub2_Sub2_1.method6010();
																}
																local2304 = Static110.aClass3_Sub2_Sub2_1.method6041();
																Static277.method3654(local2304 - 1, local3964, local470, local393, local204);
															}
															Static427.anIntArray514[Static374.anInt6599++ & 0x1F] = local204;
															Static62.aClass184_57 = null;
															return true;
														} else if (Static62.aClass184_57 == Static57.aClass184_51) {
															Static381.method2281(Static299.aClass87_18);
															Static62.aClass184_57 = null;
															return true;
														} else if (Static62.aClass184_57 == Static235.aClass184_159) {
															Static393.anInt6761 = Static110.aClass3_Sub2_Sub2_1.method6050() << 3;
															Static286.anInt6054 = Static110.aClass3_Sub2_Sub2_1.method6053();
															Static426.anInt7294 = Static110.aClass3_Sub2_Sub2_1.method6050() << 3;
															for (@Pc(4672) Class3_Sub44 local4672 = (Class3_Sub44) Static157.aClass127_15.method3248(); local4672 != null; local4672 = (Class3_Sub44) Static157.aClass127_15.method3252()) {
																local68 = (int) (local4672.aLong227 & 0x3FFFL);
																local217 = (int) (local4672.aLong227 >> 14 & 0x3FFFL);
																local221 = (int) (local4672.aLong227 >> 28 & 0x3L);
																if (local221 == Static286.anInt6054 && local68 >= Static393.anInt6761 && Static393.anInt6761 + 8 > local68 && Static426.anInt7294 <= local217 && Static426.anInt7294 + 8 > local217) {
																	local4672.method5987();
																	Static213.method3438(local217, local68, Static286.anInt6054);
																}
															}
															for (@Pc(4742) Class3_Sub15 local4742 = (Class3_Sub15) Static342.aClass229_39.method5328(); local4742 != null; local4742 = (Class3_Sub15) Static342.aClass229_39.method5325()) {
																if (local4742.anInt2022 >= Static393.anInt6761 && Static393.anInt6761 + 8 > local4742.anInt2022 && local4742.anInt2014 >= Static426.anInt7294 && local4742.anInt2014 < Static426.anInt7294 + 8 && local4742.anInt2020 == Static286.anInt6054) {
																	local4742.anInt2021 = 0;
																}
															}
															Static62.aClass184_57 = null;
															return true;
														} else if (Static62.aClass184_57 == Static344.aClass184_221) {
															Static393.anInt6761 = Static110.aClass3_Sub2_Sub2_1.method6011() << 3;
															Static426.anInt7294 = Static110.aClass3_Sub2_Sub2_1.method6049() << 3;
															Static286.anInt6054 = Static110.aClass3_Sub2_Sub2_1.method6053();
															Static62.aClass184_57 = null;
															return true;
														} else if (Static62.aClass184_57 == Static377.aClass184_243) {
															local204 = Static110.aClass3_Sub2_Sub2_1.method6044();
															local68 = Static110.aClass3_Sub2_Sub2_1.method6006();
															if (local68 == 65535) {
																local68 = -1;
															}
															local217 = Static110.aClass3_Sub2_Sub2_1.method6053();
															Static27.method721(local68, local204, local217);
															Static62.aClass184_57 = null;
															return true;
														} else if (Static346.aClass184_223 == Static62.aClass184_57) {
															local204 = Static110.aClass3_Sub2_Sub2_1.method6003();
															if (local204 == 65535) {
																local204 = -1;
															}
															local68 = Static110.aClass3_Sub2_Sub2_1.method6044();
															local217 = Static110.aClass3_Sub2_Sub2_1.method6023();
															Static287.method4202(local217, local68, local204);
															Static62.aClass184_57 = null;
															return true;
														} else if (Static202.aClass184_138 == Static62.aClass184_57) {
															local791 = Static110.aClass3_Sub2_Sub2_1.method6053() == 1;
															local269 = Static110.aClass3_Sub2_Sub2_1.method6027();
															local707 = local269;
															if (local791) {
																local707 = Static110.aClass3_Sub2_Sub2_1.method6027();
															}
															local1218 = Static110.aClass3_Sub2_Sub2_1.method6047();
															local1223 = Static110.aClass3_Sub2_Sub2_1.method6004();
															local2108 = Static110.aClass3_Sub2_Sub2_1.method6020();
															local938 = Static110.aClass3_Sub2_Sub2_1.method6053();
															@Pc(4924) long local4924 = local2108 + (local1223 << 32);
															@Pc(4926) boolean local4926 = false;
															@Pc(4928) int local4928 = 0;
															while (true) {
																if (local4928 >= 100) {
																	if (local938 <= 1) {
																		if (Static269.aBoolean373 && !Static268.aBoolean372 || Static413.aBoolean307) {
																			local4926 = true;
																		} else if (Static55.method1113(local707)) {
																			local4926 = true;
																		}
																	}
																	break;
																}
																if (local4924 == Static120.aLongArray2[local4928]) {
																	local4926 = true;
																	break;
																}
																local4928++;
															}
															if (!local4926 && Static343.anInt6238 == 0) {
																Static120.aLongArray2[Static5.anInt99] = local4924;
																Static5.anInt99 = (Static5.anInt99 + 1) % 100;
																@Pc(4986) String local4986 = Static80.method1411(Static248.method3803(Static110.aClass3_Sub2_Sub2_1));
																if (local938 == 2 || local938 == 3) {
																	Static157.method2729(local4986, "<img=1>" + local269, Static414.method5553(local1218), 9, 0, -1, "<img=1>" + local707);
																} else if (local938 == 1) {
																	Static157.method2729(local4986, "<img=0>" + local269, Static414.method5553(local1218), 9, 0, -1, "<img=0>" + local707);
																} else {
																	Static157.method2729(local4986, local269, Static414.method5553(local1218), 9, 0, -1, local707);
																}
															}
															Static62.aClass184_57 = null;
															return true;
														} else if (Static62.aClass184_57 == Static382.aClass184_246) {
															local204 = Static110.aClass3_Sub2_Sub2_1.method6004();
															local68 = Static110.aClass3_Sub2_Sub2_1.method6053();
															local3964 = (local68 & 0x1) == 1;
															while (Static113.anInt6862 > Static110.aClass3_Sub2_Sub2_1.anInt7620) {
																local221 = Static110.aClass3_Sub2_Sub2_1.method6040();
																local393 = Static110.aClass3_Sub2_Sub2_1.method6004();
																local470 = 0;
																if (local393 != 0) {
																	local470 = Static110.aClass3_Sub2_Sub2_1.method6053();
																	if (local470 == 255) {
																		local470 = Static110.aClass3_Sub2_Sub2_1.method6014();
																	}
																}
																Static277.method3654(local393 - 1, local3964, local470, local221, local204);
															}
															Static427.anIntArray514[Static374.anInt6599++ & 0x1F] = local204;
															Static62.aClass184_57 = null;
															return true;
														} else if (Static62.aClass184_57 == Static59.aClass184_53) {
															Static381.method2281(Static331.aClass87_19);
															Static62.aClass184_57 = null;
															return true;
														} else if (Static175.aClass184_160 == Static62.aClass184_57) {
															local204 = Static110.aClass3_Sub2_Sub2_1.method6004();
															local68 = Static110.aClass3_Sub2_Sub2_1.method6014();
															if (Static271.method4648(local204)) {
																@Pc(5166) Class3_Sub40 local5166 = (Class3_Sub40) Static30.aClass127_3.method3246((long) local68);
																if (local5166 != null) {
																	Static316.method4612(false, true, local5166);
																}
																if (Static426.aClass68_13 != null) {
																	Static442.method5899(Static426.aClass68_13);
																	Static426.aClass68_13 = null;
																}
															}
															Static62.aClass184_57 = null;
															return true;
														} else if (Static62.aClass184_57 == Static167.aClass184_235) {
															Static381.method2281(Static82.aClass87_9);
															Static62.aClass184_57 = null;
															return true;
														} else if (Static385.aClass184_248 == Static62.aClass184_57) {
															local204 = Static110.aClass3_Sub2_Sub2_1.method6053();
															local68 = local204 >> 5;
															local217 = local204 & 0x1F;
															if (local217 == 0) {
																Static370.aClass125Array1[local68] = null;
																Static62.aClass184_57 = null;
																return true;
															}
															@Pc(5226) Class125 local5226 = new Class125();
															local5226.anInt3865 = local217;
															local5226.anInt3870 = Static110.aClass3_Sub2_Sub2_1.method6053();
															if (local5226.anInt3870 >= 0 && local5226.anInt3870 < Static106.aClass22Array7.length) {
																if (local5226.anInt3865 == 1 || local5226.anInt3865 == 10) {
																	local5226.anInt3862 = Static110.aClass3_Sub2_Sub2_1.method6004();
																	Static110.aClass3_Sub2_Sub2_1.anInt7620 += 6;
																} else if (local5226.anInt3865 >= 2 && local5226.anInt3865 <= 6) {
																	if (local5226.anInt3865 == 2) {
																		local5226.anInt3866 = 64;
																		local5226.anInt3864 = 64;
																	}
																	if (local5226.anInt3865 == 3) {
																		local5226.anInt3864 = 64;
																		local5226.anInt3866 = 0;
																	}
																	if (local5226.anInt3865 == 4) {
																		local5226.anInt3864 = 64;
																		local5226.anInt3866 = 128;
																	}
																	if (local5226.anInt3865 == 5) {
																		local5226.anInt3864 = 0;
																		local5226.anInt3866 = 64;
																	}
																	if (local5226.anInt3865 == 6) {
																		local5226.anInt3864 = 128;
																		local5226.anInt3866 = 64;
																	}
																	local5226.anInt3865 = 2;
																	local5226.anInt3871 = Static110.aClass3_Sub2_Sub2_1.method6053();
																	local5226.anInt3866 += Static110.aClass3_Sub2_Sub2_1.method6004() - Static108.anInt3458 << 7;
																	local5226.anInt3864 += Static110.aClass3_Sub2_Sub2_1.method6004() - Static339.anInt6223 << 7;
																	local5226.anInt3861 = Static110.aClass3_Sub2_Sub2_1.method6053();
																	local5226.anInt3863 = Static110.aClass3_Sub2_Sub2_1.method6004();
																}
																local5226.anInt3868 = Static110.aClass3_Sub2_Sub2_1.method6004();
																if (local5226.anInt3868 == 65535) {
																	local5226.anInt3868 = -1;
																}
																Static370.aClass125Array1[local68] = local5226;
															}
															Static62.aClass184_57 = null;
															return true;
														} else if (Static62.aClass184_57 == Static156.aClass184_112) {
															for (local204 = 0; local204 < Static308.aClass1_Sub3_Sub3_Sub1Array1.length; local204++) {
																if (Static308.aClass1_Sub3_Sub3_Sub1Array1[local204] != null) {
																	Static308.aClass1_Sub3_Sub3_Sub1Array1[local204].anInt6092 = -1;
																}
															}
															for (local68 = 0; local68 < Static451.aClass1_Sub3_Sub3_Sub2Array1.length; local68++) {
																if (Static451.aClass1_Sub3_Sub3_Sub2Array1[local68] != null) {
																	Static451.aClass1_Sub3_Sub3_Sub2Array1[local68].anInt6092 = -1;
																}
															}
															Static62.aClass184_57 = null;
															return true;
														} else if (Static62.aClass184_57 == Static390.aClass184_249) {
															local204 = Static110.aClass3_Sub2_Sub2_1.method6010();
															local68 = Static110.aClass3_Sub2_Sub2_1.method6006();
															Static369.aClass11_1.method460(local204, local68);
															Static62.aClass184_57 = null;
															return true;
														} else if (aClass184_218 == Static62.aClass184_57) {
															local791 = Static110.aClass3_Sub2_Sub2_1.method6053() == 1;
															local269 = Static110.aClass3_Sub2_Sub2_1.method6027();
															local707 = local269;
															if (local791) {
																local707 = Static110.aClass3_Sub2_Sub2_1.method6027();
															}
															local221 = Static110.aClass3_Sub2_Sub2_1.method6053();
															@Pc(5491) boolean local5491 = false;
															if (local221 <= 1) {
																if (Static269.aBoolean373 && !Static268.aBoolean372 || Static413.aBoolean307) {
																	local5491 = true;
																} else if (local221 <= 1 && Static55.method1113(local707)) {
																	local5491 = true;
																}
															}
															if (!local5491 && Static343.anInt6238 == 0) {
																local1659 = Static80.method1411(Static248.method3803(Static110.aClass3_Sub2_Sub2_1));
																if (local221 == 2) {
																	Static157.method2729(local1659, "<img=1>" + local269, null, 24, 0, -1, "<img=1>" + local707);
																} else if (local221 == 1) {
																	Static157.method2729(local1659, "<img=0>" + local269, null, 24, 0, -1, "<img=0>" + local707);
																} else {
																	Static157.method2729(local1659, local269, null, 24, 0, -1, local707);
																}
															}
															Static62.aClass184_57 = null;
															return true;
														} else if (Static228.aClass184_277 == Static62.aClass184_57) {
															Static378.method5234();
															Static62.aClass184_57 = null;
															return false;
														} else if (Static126.aClass184_119 == Static62.aClass184_57) {
															local791 = Static110.aClass3_Sub2_Sub2_1.method6053() == 1;
															local269 = Static110.aClass3_Sub2_Sub2_1.method6027();
															local707 = local269;
															if (local791) {
																local707 = Static110.aClass3_Sub2_Sub2_1.method6027();
															}
															local221 = Static110.aClass3_Sub2_Sub2_1.method6053();
															local393 = Static110.aClass3_Sub2_Sub2_1.method6004();
															local2285 = false;
															if (local221 <= 1 && Static55.method1113(local707)) {
																local2285 = true;
															}
															if (!local2285 && Static343.anInt6238 == 0) {
																local3770 = Static32.aClass259_1.method5865(local393).method4657(Static110.aClass3_Sub2_Sub2_1);
																if (local221 == 2) {
																	Static157.method2729(local3770, "<img=1>" + local269, null, 25, 0, local393, "<img=1>" + local707);
																} else if (local221 == 1) {
																	Static157.method2729(local3770, "<img=0>" + local269, null, 25, 0, local393, "<img=0>" + local707);
																} else {
																	Static157.method2729(local3770, local269, null, 25, 0, local393, local707);
																}
															}
															Static62.aClass184_57 = null;
															return true;
														} else if (Static62.aClass184_57 == Static39.aClass184_40) {
															local791 = Static110.aClass3_Sub2_Sub2_1.method6053() == 1;
															local269 = Static110.aClass3_Sub2_Sub2_1.method6027();
															local707 = local269;
															if (local791) {
																local707 = Static110.aClass3_Sub2_Sub2_1.method6027();
															}
															local1218 = Static110.aClass3_Sub2_Sub2_1.method6004();
															local1223 = Static110.aClass3_Sub2_Sub2_1.method6020();
															local1227 = Static110.aClass3_Sub2_Sub2_1.method6053();
															@Pc(5777) long local5777 = (local1218 << 32) + local1223;
															@Pc(5779) boolean local5779 = false;
															local2955 = 0;
															while (true) {
																if (local2955 >= 100) {
																	if (local1227 <= 1) {
																		if (Static269.aBoolean373 && !Static268.aBoolean372 || Static413.aBoolean307) {
																			local5779 = true;
																		} else if (Static55.method1113(local707)) {
																			local5779 = true;
																		}
																	}
																	break;
																}
																if (local5777 == Static120.aLongArray2[local2955]) {
																	local5779 = true;
																	break;
																}
																local2955++;
															}
															if (!local5779 && Static343.anInt6238 == 0) {
																Static120.aLongArray2[Static5.anInt99] = local5777;
																Static5.anInt99 = (Static5.anInt99 + 1) % 100;
																@Pc(5841) String local5841 = Static80.method1411(Static248.method3803(Static110.aClass3_Sub2_Sub2_1));
																if (local1227 == 2) {
																	Static157.method2729(local5841, "<img=1>" + local269, null, 7, 0, -1, "<img=1>" + local707);
																} else if (local1227 == 1) {
																	Static157.method2729(local5841, "<img=0>" + local269, null, 7, 0, -1, "<img=0>" + local707);
																} else {
																	Static157.method2729(local5841, local269, null, 3, 0, -1, local707);
																}
															}
															Static62.aClass184_57 = null;
															return true;
														} else if (Static62.aClass184_57 == Static172.aClass184_124) {
															Static111.method5935();
															Static62.aClass184_57 = null;
															return false;
														} else if (Static62.aClass184_57 == Static421.aClass184_158) {
															Static213.anInt4181 = Static110.aClass3_Sub2_Sub2_1.method6053();
															Static62.aClass184_57 = null;
															Static1.anInt48 = Static296.anInt5417;
															return true;
														} else if (Static62.aClass184_57 == Static425.aClass184_269) {
															Static381.method2281(Static43.aClass87_3);
															Static62.aClass184_57 = null;
															return true;
														} else if (Static62.aClass184_57 == Static298.aClass184_194) {
															local204 = Static110.aClass3_Sub2_Sub2_1.method6004();
															local269 = Static110.aClass3_Sub2_Sub2_1.method6027();
															@Pc(5957) Object[] local5957 = new Object[local269.length() + 1];
															for (local221 = local269.length() - 1; local221 >= 0; local221--) {
																if (local269.charAt(local221) == 's') {
																	local5957[local221 + 1] = Static110.aClass3_Sub2_Sub2_1.method6027();
																} else {
																	local5957[local221 + 1] = Integer.valueOf(Static110.aClass3_Sub2_Sub2_1.method6014());
																}
															}
															local5957[0] = Integer.valueOf(Static110.aClass3_Sub2_Sub2_1.method6014());
															if (Static271.method4648(local204)) {
																@Pc(6008) Class3_Sub20 local6008 = new Class3_Sub20();
																local6008.anObjectArray35 = local5957;
																Static272.method4044(local6008);
															}
															Static62.aClass184_57 = null;
															return true;
														} else if (Static62.aClass184_57 == Static278.aClass184_252) {
															local204 = Static110.aClass3_Sub2_Sub2_1.method6041();
															local68 = Static110.aClass3_Sub2_Sub2_1.method6004();
															local217 = Static110.aClass3_Sub2_Sub2_1.method6051();
															if (Static271.method4648(local204)) {
																Static360.method5110(local68, local217);
															}
															Static62.aClass184_57 = null;
															return true;
														} else if (Static429.aClass184_271 == Static62.aClass184_57) {
															Static363.anInt6512 = Static110.aClass3_Sub2_Sub2_1.method6053();
															for (local204 = 0; local204 < Static363.anInt6512; local204++) {
																Static169.aStringArray76[local204] = Static110.aClass3_Sub2_Sub2_1.method6027();
																Static422.aStringArray169[local204] = Static110.aClass3_Sub2_Sub2_1.method6027();
																if (Static422.aStringArray169[local204].equals("")) {
																	Static422.aStringArray169[local204] = Static169.aStringArray76[local204];
																}
																Static352.aStringArray127[local204] = Static110.aClass3_Sub2_Sub2_1.method6027();
																Static411.aStringArray164[local204] = Static110.aClass3_Sub2_Sub2_1.method6027();
																if (Static411.aStringArray164[local204].equals("")) {
																	Static411.aStringArray164[local204] = Static352.aStringArray127[local204];
																}
																Static400.aBooleanArray22[local204] = false;
															}
															Static62.aClass184_57 = null;
															Static255.anInt4768 = Static296.anInt5417;
															return true;
														} else if (Static430.aClass184_272 == Static62.aClass184_57) {
															local204 = Static110.aClass3_Sub2_Sub2_1.method6003();
															local68 = Static110.aClass3_Sub2_Sub2_1.method6003();
															local217 = Static110.aClass3_Sub2_Sub2_1.method6004();
															if (Static271.method4648(local68)) {
																Static134.method2322(local204, local217);
															}
															Static62.aClass184_57 = null;
															return true;
														} else if (Static62.aClass184_57 == Static423.aClass184_268) {
															local263 = Static110.aClass3_Sub2_Sub2_1.method6027();
															local68 = Static110.aClass3_Sub2_Sub2_1.method6041();
															local217 = Static110.aClass3_Sub2_Sub2_1.method6041();
															if (Static271.method4648(local68)) {
																Static230.method3589(local217, local263);
															}
															Static62.aClass184_57 = null;
															return true;
														} else if (Static127.aClass184_95 == Static62.aClass184_57) {
															if (Static342.aFrame2 != null) {
																Static383.method5254(-1, Static123.aClass21_Sub1_1.anInt878, false, -1);
															}
															@Pc(6186) byte[] local6186 = new byte[Static113.anInt6862];
															Static110.aClass3_Sub2_Sub2_1.method6063(Static113.anInt6862, local6186);
															local269 = Static172.method2969(Static113.anInt6862, 0, local6186);
															Static81.method1418(Static347.anInt6318 == 1, true, Static295.aClass103_5, local269);
															Static62.aClass184_57 = null;
															return true;
														} else if (Static62.aClass184_57 == Static392.aClass184_250) {
															Static381.method2281(Static447.aClass87_22);
															Static62.aClass184_57 = null;
															return true;
														} else if (Static62.aClass184_57 == Static328.aClass184_213) {
															Static381.method2281(Static146.aClass87_11);
															Static62.aClass184_57 = null;
															return true;
														} else if (Static322.aClass184_205 == Static62.aClass184_57) {
															Static17.method518();
															Static62.aClass184_57 = null;
															return false;
														} else {
															Static379.method1671(null, "T1 - " + (Static62.aClass184_57 == null ? -1 : Static62.aClass184_57.method4515()) + "," + (Static62.aClass184_58 == null ? -1 : Static62.aClass184_58.method4515()) + "," + (Static286.aClass184_217 == null ? -1 : Static286.aClass184_217.method4515()) + " - " + Static113.anInt6862);
															Static378.method5234();
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
					}
				}
			}
		}
	}
}
