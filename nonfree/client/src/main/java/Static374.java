import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static374 {

	@OriginalMember(owner = "client!oea", name = "K", descriptor = "[Lclient!hea;")
	public static final Class4_Sub6_Sub8[] aClass4_Sub6_Sub8Array3 = new Class4_Sub6_Sub8[14];

	@OriginalMember(owner = "client!oea", name = "M", descriptor = "Lclient!vh;")
	public static final Class344 aClass344_61 = new Class344(27, 3);

	@OriginalMember(owner = "client!oea", name = "a", descriptor = "(Lclient!qj;Z)V")
	public static void method5811(@OriginalArg(0) Class277 arg0) {
		@Pc(12) int local12;
		@Pc(20) int local20;
		@Pc(26) int local26;
		@Pc(30) int local30;
		@Pc(39) int local39;
		@Pc(45) int local45;
		@Pc(49) int local49;
		@Pc(57) int local57;
		@Pc(61) int local61;
		@Pc(78) int local78;
		@Pc(53) int local53;
		if (Static79.aClass277_2 == arg0) {
			local12 = Static549.aClass4_Sub13_Sub2_2.method7004();
			local20 = Static409.anInt7962 + (local12 >> 4 & 0x7);
			local26 = (local12 & 0x7) + Static515.anInt4123;
			local30 = Static549.aClass4_Sub13_Sub2_2.method7054();
			if (local30 == 65535) {
				local30 = -1;
			}
			local39 = Static549.aClass4_Sub13_Sub2_2.method7004();
			local45 = local39 >> 4 & 0xF;
			local49 = local39 & 0x7;
			local53 = Static549.aClass4_Sub13_Sub2_2.method7004();
			local57 = Static549.aClass4_Sub13_Sub2_2.method7004();
			local61 = Static549.aClass4_Sub13_Sub2_2.method7054();
			if (local20 >= 0 && local26 >= 0 && local20 < Static338.anInt6508 && local26 < Static390.anInt7654) {
				local78 = local45 + 1;
				if (local20 - local78 <= Static167.aClass21_Sub1_Sub1_Sub1_Sub2_2.anIntArray206[0] && local78 + local20 >= Static167.aClass21_Sub1_Sub1_Sub1_Sub2_2.anIntArray206[0] && local26 - local78 <= Static167.aClass21_Sub1_Sub1_Sub1_Sub2_2.anIntArray207[0] && local26 + local78 >= Static167.aClass21_Sub1_Sub1_Sub1_Sub2_2.anIntArray207[0]) {
					Static277.method4467(local45 + (local26 << 8) + (Static364.anInt7024 << 24) + (local20 << 16), local49, local30, local53, local57, local61);
				}
			}
		} else if (arg0 == Static493.aClass277_15) {
			local12 = Static549.aClass4_Sub13_Sub2_2.method7010();
			local20 = Static549.aClass4_Sub13_Sub2_2.method7004();
			local26 = Static515.anInt4123 + (local20 & 0x7);
			local30 = Static157.anInt3323 + local26;
			local39 = Static409.anInt7962 + (local20 >> 4 & 0x7);
			local45 = local39 + Static242.anInt10133;
			@Pc(187) Class4_Sub32 local187 = (Class4_Sub32) Static17.aClass221_1.method5075((long) (local45 | local30 << 14 | Static364.anInt7024 << 28));
			if (local187 != null) {
				for (@Pc(195) Class4_Sub23 local195 = (Class4_Sub23) local187.aClass22_44.method895(); local195 != null; local195 = (Class4_Sub23) local187.aClass22_44.method889()) {
					if ((local12 & 0x7FFF) == local195.anInt3993) {
						local195.method8193();
						break;
					}
				}
				if (local187.aClass22_44.method893()) {
					local187.method8193();
				}
				if (local39 >= 0 && local26 >= 0 && Static338.anInt6508 > local39 && local26 < Static390.anInt7654) {
					Static358.method5396(local26, Static364.anInt7024, local39);
				}
			}
		} else if (Static472.aClass277_14 == arg0) {
			local12 = Static549.aClass4_Sub13_Sub2_2.method7004();
			local20 = Static409.anInt7962 + (local12 >> 4 & 0x7);
			local26 = (local12 & 0x7) + Static515.anInt4123;
			local30 = Static549.aClass4_Sub13_Sub2_2.method7054();
			if (local30 == 65535) {
				local30 = -1;
			}
			local39 = Static549.aClass4_Sub13_Sub2_2.method7004();
			local45 = local39 >> 4 & 0xF;
			local49 = local39 & 0x7;
			local53 = Static549.aClass4_Sub13_Sub2_2.method7004();
			local57 = Static549.aClass4_Sub13_Sub2_2.method7004();
			local61 = Static549.aClass4_Sub13_Sub2_2.method7054();
			if (local20 >= 0 && local26 >= 0 && local20 < Static338.anInt6508 && Static390.anInt7654 > local26) {
				local78 = local45 + 1;
				if (Static167.aClass21_Sub1_Sub1_Sub1_Sub2_2.anIntArray206[0] >= local20 - local78 && local20 + local78 >= Static167.aClass21_Sub1_Sub1_Sub1_Sub2_2.anIntArray206[0] && local26 - local78 <= Static167.aClass21_Sub1_Sub1_Sub1_Sub2_2.anIntArray207[0] && Static167.aClass21_Sub1_Sub1_Sub1_Sub2_2.anIntArray207[0] <= local78 + local26) {
					Static153.method2612(local61, local45 + (local20 << 16) + (Static364.anInt7024 << 24) + (local26 << 8), local53, local49, local30, local57);
				}
			}
		} else {
			@Pc(467) int local467;
			@Pc(471) int local471;
			@Pc(482) int local482;
			@Pc(582) Class21_Sub1_Sub1_Sub5 local582;
			if (arg0 == Static232.aClass277_9) {
				local12 = Static549.aClass4_Sub13_Sub2_2.method7004();
				@Pc(413) boolean local413 = (local12 & 0x80) != 0;
				local26 = (local12 >> 3 & 0x7) + Static409.anInt7962;
				local30 = (local12 & 0x7) + Static515.anInt4123;
				local39 = Static549.aClass4_Sub13_Sub2_2.method7011() + local26;
				local45 = Static549.aClass4_Sub13_Sub2_2.method7011() + local30;
				local49 = Static549.aClass4_Sub13_Sub2_2.method7043();
				local53 = Static549.aClass4_Sub13_Sub2_2.method7054();
				local57 = Static549.aClass4_Sub13_Sub2_2.method7004() * 4;
				local61 = Static549.aClass4_Sub13_Sub2_2.method7004() * 4;
				local78 = Static549.aClass4_Sub13_Sub2_2.method7054();
				local467 = Static549.aClass4_Sub13_Sub2_2.method7054();
				local471 = Static549.aClass4_Sub13_Sub2_2.method7004();
				if (local471 == 255) {
					local471 = -1;
				}
				local482 = Static549.aClass4_Sub13_Sub2_2.method7054();
				if (local26 >= 0 && local30 >= 0 && Static338.anInt6508 > local26 && Static390.anInt7654 > local30 && local39 >= 0 && local45 >= 0 && Static338.anInt6508 > local39 && Static390.anInt7654 > local45 && local53 != 65535) {
					local45 = local45 * 512 + 256;
					local57 <<= 0x2;
					local26 = local26 * 512 + 256;
					local61 <<= 0x2;
					local30 = local30 * 512 + 256;
					local482 <<= 0x2;
					local39 = local39 * 512 + 256;
					local582 = new Class21_Sub1_Sub1_Sub5(local53, Static364.anInt7024, Static364.anInt7024, local26, local30, local57, Static306.anInt6122 + local78, Static306.anInt6122 + local467, local471, local482, local49, local61, local413);
					local582.method7571(Static306.anInt6122 + local78, local45, local39, Static461.method6782(local45, Static364.anInt7024, local39) - local61);
					Static446.aClass22_56.method894(new Class4_Sub6_Sub13(local582));
				}
			} else if (Static157.aClass277_5 == arg0) {
				local12 = Static549.aClass4_Sub13_Sub2_2.method7009();
				local20 = Static409.anInt7962 + (local12 >> 4 & 0x7);
				local26 = Static515.anInt4123 + (local12 & 0x7);
				local30 = Static549.aClass4_Sub13_Sub2_2.method7004();
				local39 = local30 >> 2;
				local45 = local30 & 0x3;
				local49 = Static518.anIntArray544[local39];
				local53 = Static549.aClass4_Sub13_Sub2_2.method7035();
				if (local53 == 65535) {
					local53 = -1;
				}
				Static276.method4456(local26, local45, local53, local49, local39, local20, Static364.anInt7024);
			} else if (arg0 == Static31.aClass277_1) {
				local12 = Static549.aClass4_Sub13_Sub2_2.method7004();
				local20 = Static409.anInt7962 + (local12 >> 4 & 0x7);
				local26 = Static515.anInt4123 + (local12 & 0x7);
				local30 = Static549.aClass4_Sub13_Sub2_2.method7054();
				local39 = Static549.aClass4_Sub13_Sub2_2.method7004();
				local45 = Static549.aClass4_Sub13_Sub2_2.method7054();
				local49 = Static549.aClass4_Sub13_Sub2_2.method7004();
				if (local20 >= 0 && local26 >= 0 && Static338.anInt6508 > local20 && Static390.anInt7654 > local26) {
					local53 = local20 * 512 + 256;
					local57 = local26 * 512 + 256;
					local61 = Static364.anInt7024;
					if (local61 < 3 && Static193.method3175(local26, local20)) {
						local61++;
					}
					@Pc(786) Class21_Sub1_Sub1_Sub2 local786 = new Class21_Sub1_Sub1_Sub2(local30, local45, Static306.anInt6122, Static364.anInt7024, local61, local53, Static461.method6782(local57, Static364.anInt7024, local53) - local39, local57, local20, local20, local26, local26, local49);
					Static247.aClass22_27.method894(new Class4_Sub6_Sub9(local786));
				}
			} else if (arg0 == Static525.aClass277_17) {
				local12 = Static549.aClass4_Sub13_Sub2_2.method7010();
				local20 = Static549.aClass4_Sub13_Sub2_2.method6995();
				local26 = Static549.aClass4_Sub13_Sub2_2.method6987();
				local30 = Static515.anInt4123 + (local26 & 0x7);
				local39 = local30 + Static157.anInt3323;
				local45 = Static409.anInt7962 + (local26 >> 4 & 0x7);
				local49 = Static242.anInt10133 + local45;
				local53 = Static549.aClass4_Sub13_Sub2_2.method7010();
				if (Static1.anInt5011 != local12) {
					@Pc(863) boolean local863 = local45 >= 0 && local30 >= 0 && Static338.anInt6508 > local45 && local30 < Static390.anInt7654;
					if (local863 || Static65.method1455(Static343.anInt6623)) {
						Static390.method6009(new Class4_Sub23(local20, local53), local49, local39, Static364.anInt7024);
						if (local863) {
							Static358.method5396(local30, Static364.anInt7024, local45);
						}
					}
				}
			} else if (Static168.aClass277_6 == arg0) {
				local12 = Static549.aClass4_Sub13_Sub2_2.method7004();
				local20 = Static515.anInt4123 + (local12 & 0x7);
				local26 = Static157.anInt3323 + local20;
				local30 = (local12 >> 4 & 0x7) + Static409.anInt7962;
				local39 = local30 + Static242.anInt10133;
				local45 = Static549.aClass4_Sub13_Sub2_2.method7054();
				local49 = Static549.aClass4_Sub13_Sub2_2.method7054();
				local53 = Static549.aClass4_Sub13_Sub2_2.method7054();
				if (Static17.aClass221_1 != null) {
					@Pc(946) Class4_Sub32 local946 = (Class4_Sub32) Static17.aClass221_1.method5075((long) (local26 << 14 | Static364.anInt7024 << 28 | local39));
					if (local946 != null) {
						for (@Pc(954) Class4_Sub23 local954 = (Class4_Sub23) local946.aClass22_44.method895(); local954 != null; local954 = (Class4_Sub23) local946.aClass22_44.method889()) {
							if (local954.anInt3993 == (local45 & 0x7FFF) && local49 == local954.anInt3992) {
								local954.method8193();
								local954.anInt3992 = local53;
								Static390.method6009(local954, local39, local26, Static364.anInt7024);
								break;
							}
						}
						if (local30 >= 0 && local20 >= 0 && local30 < Static338.anInt6508 && local20 < Static390.anInt7654) {
							Static358.method5396(local20, Static364.anInt7024, local30);
						}
					}
				}
			} else if (arg0 == Static516.aClass277_16) {
				local12 = Static549.aClass4_Sub13_Sub2_2.method7010();
				local20 = Static549.aClass4_Sub13_Sub2_2.method7009();
				local26 = local20 >> 2;
				local30 = local20 & 0x3;
				local39 = Static518.anIntArray544[local26];
				local45 = Static549.aClass4_Sub13_Sub2_2.method7009();
				local49 = (local45 >> 4 & 0x7) + Static409.anInt7962;
				local53 = Static515.anInt4123 + (local45 & 0x7);
				if (Static65.method1455(Static343.anInt6623) || local49 >= 0 && local53 >= 0 && Static338.anInt6508 > local49 && local53 < Static390.anInt7654) {
					Static469.method6821(local12, local39, Static364.anInt7024, local30, local49, local53, local26);
				}
			} else if (arg0 == Static400.aClass277_12) {
				local12 = Static549.aClass4_Sub13_Sub2_2.method7054();
				local20 = Static549.aClass4_Sub13_Sub2_2.method7004();
				Static103.aClass298_1.method6822(local12).method5281(local20);
			} else if (arg0 == Static276.aClass277_10) {
				local12 = Static549.aClass4_Sub13_Sub2_2.method7004();
				local20 = Static409.anInt7962 * 2 + (local12 >> 4 & 0xF);
				local26 = (local12 & 0xF) + Static515.anInt4123 * 2;
				local30 = Static549.aClass4_Sub13_Sub2_2.method7004();
				@Pc(1153) boolean local1153 = (local30 & 0x1) != 0;
				local45 = local30 >> 1;
				local49 = Static549.aClass4_Sub13_Sub2_2.method7011() + local20;
				local53 = local26 + Static549.aClass4_Sub13_Sub2_2.method7011();
				local57 = Static549.aClass4_Sub13_Sub2_2.method7043();
				local61 = Static549.aClass4_Sub13_Sub2_2.method7043();
				local78 = Static549.aClass4_Sub13_Sub2_2.method7054();
				@Pc(1186) byte local1186 = Static549.aClass4_Sub13_Sub2_2.method7011();
				local471 = Static549.aClass4_Sub13_Sub2_2.method7004() * 4;
				local482 = Static549.aClass4_Sub13_Sub2_2.method7054();
				@Pc(1200) int local1200 = Static549.aClass4_Sub13_Sub2_2.method7054();
				@Pc(1204) int local1204 = Static549.aClass4_Sub13_Sub2_2.method7004();
				if (local1204 == 255) {
					local1204 = -1;
				}
				@Pc(1215) int local1215 = Static549.aClass4_Sub13_Sub2_2.method7054();
				if (local20 >= 0 && local26 >= 0 && Static338.anInt6508 * 2 > local20 && Static338.anInt6508 * 2 > local26 && local49 >= 0 && local53 >= 0 && Static390.anInt7654 * 2 > local49 && local53 < Static390.anInt7654 * 2 && local78 != 65535) {
					local471 <<= 0x2;
					local20 = local20 * 256;
					local467 = local1186 << 2;
					local49 *= 256;
					local53 = local53 * 256;
					local1215 <<= 0x2;
					local26 *= 256;
					if (local57 != 0) {
						@Pc(1294) Class21_Sub1_Sub1_Sub1 local1294 = null;
						@Pc(1301) int local1301;
						if (local57 < 0) {
							local1301 = -local57 - 1;
							if (Static1.anInt5011 == local1301) {
								local1294 = Static167.aClass21_Sub1_Sub1_Sub1_Sub2_2;
							} else {
								local1294 = Static453.aClass21_Sub1_Sub1_Sub1_Sub2Array1[local1301];
							}
						} else {
							local1301 = local57 - 1;
							@Pc(1323) Class4_Sub29 local1323 = (Class4_Sub29) Static144.aClass221_6.method5075((long) local1301);
							if (local1323 != null) {
								local1294 = local1323.aClass21_Sub1_Sub1_Sub1_Sub1_1;
							}
						}
						if (local1294 != null) {
							@Pc(1334) Class252 local1334 = local1294.method3322();
							if (local1334.anIntArrayArray38 != null && local1334.anIntArrayArray38[local45] != null) {
								@Pc(1349) int local1349 = local1334.anIntArrayArray38[local45][0];
								@Pc(1356) int local1356 = local1334.anIntArrayArray38[local45][2];
								@Pc(1361) int local1361 = local1294.aClass133_7.method2990();
								@Pc(1365) int local1365 = Class262.anIntArray420[local1361];
								@Pc(1369) int local1369 = Class262.anIntArray421[local1361];
								@Pc(1379) int local1379 = local1349 * local1369 + local1365 * local1356 >> 14;
								@Pc(1390) int local1390 = local1356 * local1369 - local1349 * local1365 >> 14;
								local20 += local1379;
								local26 += local1390;
								local467 -= local1334.anIntArrayArray38[local45][1];
							}
						}
					}
					@Pc(1432) Class21_Sub1_Sub1_Sub5 local1432 = new Class21_Sub1_Sub1_Sub5(local78, Static364.anInt7024, Static364.anInt7024, local20, local26, local467, local482 + Static306.anInt6122, local1200 - -Static306.anInt6122, local1204, local1215, local61, local471, local1153);
					local1432.method7571(Static306.anInt6122 + local482, local53, local49, Static461.method6782(local53, Static364.anInt7024, local49) - local471);
					Static446.aClass22_56.method894(new Class4_Sub6_Sub13(local1432));
				}
			} else if (Static375.aClass277_11 == arg0) {
				Static549.aClass4_Sub13_Sub2_2.method7004();
				local12 = Static549.aClass4_Sub13_Sub2_2.method7004();
				local20 = Static409.anInt7962 + (local12 >> 4 & 0x7);
				local26 = (local12 & 0x7) + Static515.anInt4123;
				local30 = Static549.aClass4_Sub13_Sub2_2.method7054();
				local39 = Static549.aClass4_Sub13_Sub2_2.method7004();
				local45 = Static549.aClass4_Sub13_Sub2_2.method7013();
				@Pc(1497) String local1497 = Static549.aClass4_Sub13_Sub2_2.method7016();
				Static262.method4138(local45, local39, local26, Static364.anInt7024, local1497, local30, local20);
			} else if (arg0 == Static208.aClass277_8) {
				local12 = Static549.aClass4_Sub13_Sub2_2.method6987();
				local20 = local12 >> 2;
				local26 = local12 & 0x3;
				local30 = Static518.anIntArray544[local20];
				local39 = Static549.aClass4_Sub13_Sub2_2.method7004();
				local45 = Static409.anInt7962 + (local39 >> 4 & 0x7);
				local49 = (local39 & 0x7) + Static515.anInt4123;
				if (Static65.method1455(Static343.anInt6623) || local45 >= 0 && local49 >= 0 && local45 < Static338.anInt6508 && local49 < Static390.anInt7654) {
					Static469.method6821(-1, local30, Static364.anInt7024, local26, local45, local49, local20);
				}
			} else if (arg0 == Static424.aClass277_13) {
				local12 = Static549.aClass4_Sub13_Sub2_2.method7035();
				local20 = Static549.aClass4_Sub13_Sub2_2.method7035();
				local26 = Static549.aClass4_Sub13_Sub2_2.method7004();
				local30 = Static515.anInt4123 + (local26 & 0x7);
				local39 = local30 + Static157.anInt3323;
				local45 = Static409.anInt7962 + (local26 >> 4 & 0x7);
				local49 = Static242.anInt10133 + local45;
				@Pc(1638) boolean local1638 = local45 >= 0 && local30 >= 0 && local45 < Static338.anInt6508 && Static390.anInt7654 > local30;
				if (local1638 || Static65.method1455(Static343.anInt6623)) {
					Static390.method6009(new Class4_Sub23(local12, local20), local49, local39, Static364.anInt7024);
					if (local1638) {
						Static358.method5396(local30, Static364.anInt7024, local45);
					}
				}
			} else if (Static515.aClass277_7 == arg0) {
				local12 = Static549.aClass4_Sub13_Sub2_2.method7004();
				local20 = Static409.anInt7962 * 2 + (local12 >> 4 & 0xF);
				local26 = (local12 & 0xF) + Static515.anInt4123 * 2;
				@Pc(1698) boolean local1698 = Static549.aClass4_Sub13_Sub2_2.method7004() != 0;
				local39 = Static549.aClass4_Sub13_Sub2_2.method7011() + local20;
				local45 = Static549.aClass4_Sub13_Sub2_2.method7011() + local26;
				local49 = Static549.aClass4_Sub13_Sub2_2.method7043();
				local53 = Static549.aClass4_Sub13_Sub2_2.method7054();
				local57 = Static549.aClass4_Sub13_Sub2_2.method7004() * 4;
				local61 = Static549.aClass4_Sub13_Sub2_2.method7004() * 4;
				local78 = Static549.aClass4_Sub13_Sub2_2.method7054();
				local467 = Static549.aClass4_Sub13_Sub2_2.method7054();
				local471 = Static549.aClass4_Sub13_Sub2_2.method7004();
				if (local471 == 255) {
					local471 = -1;
				}
				local482 = Static549.aClass4_Sub13_Sub2_2.method7054();
				if (local20 >= 0 && local26 >= 0 && Static338.anInt6508 * 2 > local20 && Static338.anInt6508 * 2 > local26 && local39 >= 0 && local45 >= 0 && Static390.anInt7654 * 2 > local39 && local45 < Static390.anInt7654 * 2 && local53 != 65535) {
					local20 *= 256;
					local482 <<= 0x2;
					local45 = local45 * 256;
					local57 <<= 0x2;
					local61 <<= 0x2;
					local39 = local39 * 256;
					local26 = local26 * 256;
					local582 = new Class21_Sub1_Sub1_Sub5(local53, Static364.anInt7024, Static364.anInt7024, local20, local26, local57, local78 + Static306.anInt6122, local467 - -Static306.anInt6122, local471, local482, local49, local61, local1698);
					local582.method7571(local78 + Static306.anInt6122, local45, local39, Static461.method6782(local45, Static364.anInt7024, local39) - local61);
					Static446.aClass22_56.method894(new Class4_Sub6_Sub13(local582));
				}
			} else {
				Static109.method2014("T3 - " + arg0, null);
				Static254.method4043(false);
			}
		}
	}

	@OriginalMember(owner = "client!oea", name = "a", descriptor = "(IZIIIII)V")
	public static void method5813(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		Static414.anInt7982 = arg5;
		Static360.anInt6967 = arg3;
		Static80.anInt2172 = arg2;
		Static297.anInt6022 = arg4;
		Static346.anInt6650 = arg0;
		if (arg1 && Static297.anInt6022 >= 100) {
			Static534.anInt9775 = Static80.anInt2172 * 512 + 256;
			Static114.anInt2613 = Static414.anInt7982 * 512 + 256;
			Static139.anInt3067 = Static461.method6782(Static114.anInt2613, Static352.anInt6764, Static534.anInt9775) - Static346.anInt6650;
		}
		Static300.anInt6053 = 2;
		Static453.anInt8613 = -1;
		Static587.anInt10508 = -1;
	}

	@OriginalMember(owner = "client!oea", name = "e", descriptor = "(I)V")
	public static void method5814() {
		if (Static1.anIntArray273 != null && Static365.anIntArray392 != null) {
			return;
		}
		Static1.anIntArray273 = new int[256];
		Static365.anIntArray392 = new int[256];
		for (@Pc(21) int local21 = 0; local21 < 256; local21++) {
			@Pc(30) double local30 = (double) local21 / 255.0D * 6.283185307179586D;
			Static1.anIntArray273[local21] = (int) (Math.sin(local30) * 4096.0D);
			Static365.anIntArray392[local21] = (int) (Math.cos(local30) * 4096.0D);
		}
	}

	@OriginalMember(owner = "client!oea", name = "f", descriptor = "(I)Z")
	public static boolean method5815() {
		if (Static314.aBoolean433) {
			try {
				if ((Boolean) Static597.method1279(Static589.anApplet2, "showingVideoAd")) {
					return false;
				}
				return true;
			} catch (@Pc(22) Throwable local22) {
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!oea", name = "a", descriptor = "(JIII)V")
	public static void method5816(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(10) int local10 = (int) arg0 >> 14 & 0x1F;
		@Pc(17) int local17 = (int) arg0 >> 20 & 0x3;
		@Pc(24) int local24 = (int) (arg0 >>> 32) & Integer.MAX_VALUE;
		if (local10 != 10 && local10 != 11 && local10 != 22) {
			Static225.method3649(arg2, local17, 0, 0, true, local10, 0, arg1);
			return;
		}
		@Pc(61) Class233 local61 = Static103.aClass298_1.method6822(local24);
		@Pc(72) int local72;
		@Pc(75) int local75;
		if (local17 == 0 || local17 == 2) {
			local72 = local61.anInt6718;
			local75 = local61.anInt6665;
		} else {
			local72 = local61.anInt6665;
			local75 = local61.anInt6718;
		}
		@Pc(86) int local86 = local61.anInt6721;
		if (local17 != 0) {
			local86 = (local86 << local17 & 0xF) + (local86 >> 4 - local17);
		}
		Static225.method3649(arg2, 0, local72, local75, true, 0, local86, arg1);
	}
}
