import java.awt.Canvas;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static318 {

	@OriginalMember(owner = "client!pu", name = "a", descriptor = "Lclient!go;")
	public static final Class97 aClass97_11 = new Class97(1, 2, 2, 0);

	@OriginalMember(owner = "client!pu", name = "a", descriptor = "(Lclient!qa;Z)V")
	public static void method4105(@OriginalArg(0) Class128 arg0) {
		if (Static166.aClass254_17.method5431() == 0) {
			return;
		}
		@Pc(24) Class1_Sub33 local24;
		if (Static410.anInt6680 == 0) {
			for (local24 = (Class1_Sub33) Static166.aClass254_17.method5437(); local24 != null; local24 = (Class1_Sub33) Static166.aClass254_17.method5433()) {
				Static227.aClass65_2.method1337(local24.anInt5245, local24.aBoolean423 ? Static239.aClass20_Sub3_Sub3_Sub1_1.aClass45_1 : null, local24.anInt5244, local24.anInt5251, local24.anInt5243, local24.anInt5248, Static439.aClass16_4, false, false, arg0, arg0);
				local24.method5617();
			}
			Static183.method4174();
			return;
		}
		if (Static124.aClass128_14 == null) {
			@Pc(72) Canvas local72 = new Canvas();
			local72.setSize(36, 32);
			Static124.aClass128_14 = Static321.method3583(local72, 0, Static190.anInterface8_5, Static41.aClass124_2, 0);
			Static292.aClass16_3 = Static124.aClass128_14.method3575(Static41.method653(Static166.aClass113_59, Static421.anInt6819), Static458.method1923(Static169.aClass113_55, Static421.anInt6819));
		}
		for (local24 = (Class1_Sub33) Static166.aClass254_17.method5437(); local24 != null; local24 = (Class1_Sub33) Static166.aClass254_17.method5433()) {
			Static227.aClass65_2.method1337(local24.anInt5245, local24.aBoolean423 ? Static239.aClass20_Sub3_Sub3_Sub1_1.aClass45_1 : null, local24.anInt5244, local24.anInt5251, local24.anInt5243, local24.anInt5248, Static292.aClass16_3, false, false, Static124.aClass128_14, arg0);
			local24.method5617();
		}
	}

	@OriginalMember(owner = "client!pu", name = "a", descriptor = "(Z)Z")
	public static boolean method4106() throws IOException {
		if (Static48.aClass3_2 == null) {
			return false;
		}
		@Pc(13) int local13 = Static48.aClass3_2.method61();
		if (local13 == 0) {
			return false;
		}
		@Pc(70) int local70;
		if (Static175.aClass214_107 == null) {
			if (Static215.aBoolean275) {
				Static48.aClass3_2.method59(Static154.aClass1_Sub11_Sub1_3.aByteArray64, 0, 1);
				local13--;
				Static215.aBoolean275 = false;
				Static409.anInt6637++;
			}
			Static154.aClass1_Sub11_Sub1_3.anInt5766 = 0;
			if (Static154.aClass1_Sub11_Sub1_3.method3351()) {
				if (local13 == 0) {
					return false;
				}
				Static48.aClass3_2.method59(Static154.aClass1_Sub11_Sub1_3.aByteArray64, 1, 1);
				local13--;
				Static409.anInt6637++;
			}
			Static215.aBoolean275 = true;
			@Pc(66) Class214[] local66 = Static52.method811();
			local70 = Static154.aClass1_Sub11_Sub1_3.method3350();
			if (local70 < 0 || local66.length <= local70) {
				throw new IOException("invo:" + local70 + " ip:" + Static154.aClass1_Sub11_Sub1_3.anInt5766);
			}
			Static175.aClass214_107 = local66[local70];
			Static329.anInt5393 = Static175.aClass214_107.anInt5673;
		}
		if (Static329.anInt5393 == -1) {
			if (local13 <= 0) {
				return false;
			}
			Static48.aClass3_2.method59(Static154.aClass1_Sub11_Sub1_3.aByteArray64, 0, 1);
			Static329.anInt5393 = Static154.aClass1_Sub11_Sub1_3.aByteArray64[0] & 0xFF;
			Static409.anInt6637++;
			local13--;
		}
		if (Static329.anInt5393 == -2) {
			if (local13 <= 1) {
				return false;
			}
			Static48.aClass3_2.method59(Static154.aClass1_Sub11_Sub1_3.aByteArray64, 0, 2);
			Static154.aClass1_Sub11_Sub1_3.anInt5766 = 0;
			Static329.anInt5393 = Static154.aClass1_Sub11_Sub1_3.method4485();
			local13 -= 2;
			Static409.anInt6637 += 2;
		}
		if (Static329.anInt5393 > local13) {
			return false;
		}
		Static154.aClass1_Sub11_Sub1_3.anInt5766 = 0;
		Static48.aClass3_2.method59(Static154.aClass1_Sub11_Sub1_3.aByteArray64, 0, Static329.anInt5393);
		Static65.anInt1145 = 0;
		Static409.anInt6637 += Static329.anInt5393;
		Static379.aClass214_229 = Static418.aClass214_243;
		Static418.aClass214_243 = Static439.aClass214_250;
		Static439.aClass214_250 = Static175.aClass214_107;
		@Pc(199) int local199;
		@Pc(211) int local211;
		@Pc(207) int local207;
		if (Static175.aClass214_107 == Static273.aClass214_164) {
			local199 = Static154.aClass1_Sub11_Sub1_3.method4500();
			local70 = Static154.aClass1_Sub11_Sub1_3.method4482();
			local207 = Static154.aClass1_Sub11_Sub1_3.method4487();
			local211 = Static154.aClass1_Sub11_Sub1_3.method4470();
			if (Static431.method5423(local199)) {
				Static55.method854(local207, local70, local211);
			}
			Static175.aClass214_107 = null;
			return true;
		} else if (Static175.aClass214_107 == Static159.aClass214_100) {
			Static50.anInt823 = Static154.aClass1_Sub11_Sub1_3.method4463();
			Static175.aClass214_107 = null;
			Static376.anInt6288 = Static443.anInt6230;
			return true;
		} else {
			@Pc(264) int local264;
			@Pc(276) int local276;
			@Pc(280) int local280;
			@Pc(268) int local268;
			@Pc(272) int local272;
			if (Static175.aClass214_107 == Static159.aClass214_99) {
				local199 = Static154.aClass1_Sub11_Sub1_3.method4487();
				local70 = local199 >> 28 & 0x3;
				local207 = local199 >> 14 & 0x3FFF;
				local211 = local199 & 0x3FFF;
				local264 = Static154.aClass1_Sub11_Sub1_3.method4463();
				local268 = local264 >> 2;
				local272 = local264 & 0x3;
				local276 = Static8.anIntArray488[local268];
				local280 = Static154.aClass1_Sub11_Sub1_3.method4500();
				local211 -= Static278.anInt4392;
				if (local280 == 65535) {
					local280 = -1;
				}
				local207 -= Static101.anInt6646;
				Static359.method4654(local276, local268, local211, local207, local280, local70, local272);
				Static175.aClass214_107 = null;
				return true;
			} else if (Static44.aClass214_32 == Static175.aClass214_107) {
				Static189.method2490(Static192.aClass224_13);
				Static175.aClass214_107 = null;
				return true;
			} else if (Static271.aClass214_163 == Static175.aClass214_107) {
				Static300.anInt5023 = Static154.aClass1_Sub11_Sub1_3.method4485() * 30;
				Static376.anInt6288 = Static443.anInt6230;
				Static175.aClass214_107 = null;
				return true;
			} else if (Static175.aClass214_107 == Static178.aClass214_112) {
				Static382.anInt6355 = Static154.aClass1_Sub11_Sub1_3.method4463();
				Static74.anInt1414 = Static154.aClass1_Sub11_Sub1_3.method4477() << 3;
				Static403.anInt6530 = Static154.aClass1_Sub11_Sub1_3.method4473() << 3;
				for (@Pc(355) Class1_Sub19 local355 = (Class1_Sub19) Static194.aClass257_13.method5506(); local355 != null; local355 = (Class1_Sub19) Static194.aClass257_13.method5501()) {
					local70 = (int) (local355.aLong226 & 0x3FFFL);
					local207 = (int) (local355.aLong226 >> 14 & 0x3FFFL);
					local211 = (int) (local355.aLong226 >> 28 & 0x3L);
					if (Static382.anInt6355 == local211 && local70 >= Static403.anInt6530 && Static403.anInt6530 + 8 > local70 && local207 >= Static74.anInt1414 && Static74.anInt1414 + 8 > local207) {
						local355.method5617();
						Static324.method4162(Static382.anInt6355, local70, local207);
					}
				}
				for (@Pc(422) Class1_Sub30 local422 = (Class1_Sub30) Static204.aClass254_22.method5437(); local422 != null; local422 = (Class1_Sub30) Static204.aClass254_22.method5433()) {
					if (Static403.anInt6530 <= local422.anInt4697 && local422.anInt4697 < Static403.anInt6530 + 8 && Static74.anInt1414 <= local422.anInt4691 && Static74.anInt1414 + 8 > local422.anInt4691 && local422.anInt4704 == Static382.anInt6355) {
						local422.anInt4693 = 0;
					}
				}
				Static175.aClass214_107 = null;
				return true;
			} else if (Static146.aClass214_221 == Static175.aClass214_107) {
				local199 = Static154.aClass1_Sub11_Sub1_3.method4485();
				local70 = Static154.aClass1_Sub11_Sub1_3.method4498();
				local207 = Static154.aClass1_Sub11_Sub1_3.method4500();
				local211 = Static154.aClass1_Sub11_Sub1_3.method4497();
				if (Static431.method5423(local211)) {
					Static164.method2246(local199 + (local207 << 16), local70);
				}
				Static175.aClass214_107 = null;
				return true;
			} else if (Static175.aClass214_107 == Static259.aClass214_158) {
				Static307.anInt5117 = Static154.aClass1_Sub11_Sub1_3.method4459();
				Static224.anInt3659 = Static154.aClass1_Sub11_Sub1_3.method4463();
				Static175.aClass214_107 = null;
				return true;
			} else if (Static380.aClass214_230 == Static175.aClass214_107) {
				Static27.method873(false);
				Static175.aClass214_107 = null;
				return true;
			} else if (Static175.aClass214_107 == Static264.aClass214_161) {
				local199 = Static154.aClass1_Sub11_Sub1_3.method4485();
				if (Static431.method5423(local199)) {
					Static428.method5377();
				}
				Static175.aClass214_107 = null;
				return true;
			} else if (Static175.aClass214_107 == Static116.aClass214_195) {
				local199 = Static154.aClass1_Sub11_Sub1_3.method4463();
				local70 = local199 >> 5;
				local207 = local199 & 0x1F;
				if (local207 == 0) {
					Static162.aClass209Array1[local70] = null;
					Static175.aClass214_107 = null;
					return true;
				}
				@Pc(583) Class209 local583 = new Class209();
				local583.anInt5510 = local207;
				local583.anInt5509 = Static154.aClass1_Sub11_Sub1_3.method4463();
				if (local583.anInt5509 >= 0 && Static454.aClass49Array146.length > local583.anInt5509) {
					if (local583.anInt5510 == 1 || local583.anInt5510 == 10) {
						local583.anInt5517 = Static154.aClass1_Sub11_Sub1_3.method4485();
						Static154.aClass1_Sub11_Sub1_3.anInt5766 += 6;
					} else if (local583.anInt5510 >= 2 && local583.anInt5510 <= 6) {
						if (local583.anInt5510 == 2) {
							local583.anInt5502 = 64;
							local583.anInt5507 = 64;
						}
						if (local583.anInt5510 == 3) {
							local583.anInt5507 = 64;
							local583.anInt5502 = 0;
						}
						if (local583.anInt5510 == 4) {
							local583.anInt5502 = 128;
							local583.anInt5507 = 64;
						}
						if (local583.anInt5510 == 5) {
							local583.anInt5507 = 0;
							local583.anInt5502 = 64;
						}
						if (local583.anInt5510 == 6) {
							local583.anInt5502 = 64;
							local583.anInt5507 = 128;
						}
						local583.anInt5510 = 2;
						local583.anInt5506 = Static154.aClass1_Sub11_Sub1_3.method4463();
						local583.anInt5502 += Static154.aClass1_Sub11_Sub1_3.method4485() - Static101.anInt6646 << 7;
						local583.anInt5507 += Static154.aClass1_Sub11_Sub1_3.method4485() - Static278.anInt4392 << 7;
						local583.anInt5503 = Static154.aClass1_Sub11_Sub1_3.method4463();
						local583.anInt5505 = Static154.aClass1_Sub11_Sub1_3.method4485();
					}
					local583.anInt5515 = Static154.aClass1_Sub11_Sub1_3.method4485();
					if (local583.anInt5515 == 65535) {
						local583.anInt5515 = -1;
					}
					Static162.aClass209Array1[local70] = local583;
				}
				Static175.aClass214_107 = null;
				return true;
			} else if (Static60.aClass214_45 == Static175.aClass214_107) {
				local199 = Static154.aClass1_Sub11_Sub1_3.method4498();
				local70 = Static154.aClass1_Sub11_Sub1_3.method4465();
				local207 = Static154.aClass1_Sub11_Sub1_3.method4486();
				if (Static431.method5423(local207)) {
					Static432.method5427(local199, local70);
				}
				Static175.aClass214_107 = null;
				return true;
			} else if (Static344.aClass214_204 == Static175.aClass214_107) {
				Static360.anInt5990 = Static154.aClass1_Sub11_Sub1_3.method4463();
				for (local199 = 0; local199 < Static360.anInt5990; local199++) {
					Static76.aStringArray10[local199] = Static154.aClass1_Sub11_Sub1_3.method4484();
					Static43.aStringArray44[local199] = Static154.aClass1_Sub11_Sub1_3.method4484();
					if (Static43.aStringArray44[local199].equals("")) {
						Static43.aStringArray44[local199] = Static76.aStringArray10[local199];
					}
					Static11.aStringArray1[local199] = Static154.aClass1_Sub11_Sub1_3.method4484();
					Static272.aStringArray37[local199] = Static154.aClass1_Sub11_Sub1_3.method4484();
					if (Static272.aStringArray37[local199].equals("")) {
						Static272.aStringArray37[local199] = Static11.aStringArray1[local199];
					}
					Static304.aBooleanArray23[local199] = false;
				}
				Static136.anInt2311 = Static443.anInt6230;
				Static175.aClass214_107 = null;
				return true;
			} else if (Static175.aClass214_107 == Static355.aClass214_213) {
				Static189.method2490(Static54.aClass224_8);
				Static175.aClass214_107 = null;
				return true;
			} else {
				@Pc(901) String local901;
				@Pc(893) boolean local893;
				@Pc(897) String local897;
				@Pc(913) boolean local913;
				@Pc(1183) String local1183;
				@Pc(1219) boolean local1219;
				@Pc(1147) String local1147;
				@Pc(911) String local911;
				if (Static138.aClass214_133 == Static175.aClass214_107) {
					while (Static329.anInt5393 > Static154.aClass1_Sub11_Sub1_3.anInt5766) {
						local893 = Static154.aClass1_Sub11_Sub1_3.method4463() == 1;
						local897 = Static154.aClass1_Sub11_Sub1_3.method4484();
						local901 = Static154.aClass1_Sub11_Sub1_3.method4484();
						local211 = Static154.aClass1_Sub11_Sub1_3.method4485();
						local264 = Static154.aClass1_Sub11_Sub1_3.method4463();
						local911 = "";
						local913 = false;
						if (local211 > 0) {
							local911 = Static154.aClass1_Sub11_Sub1_3.method4484();
							local913 = Static154.aClass1_Sub11_Sub1_3.method4463() == 1;
						}
						for (local276 = 0; local276 < Static145.anInt2445; local276++) {
							if (local893) {
								if (local901.equals(Static108.aStringArray17[local276])) {
									Static108.aStringArray17[local276] = local897;
									Static244.aStringArray29[local276] = local901;
									local897 = null;
									break;
								}
							} else if (local897.equals(Static108.aStringArray17[local276])) {
								if (Static163.anIntArray137[local276] != local211) {
									Static163.anIntArray137[local276] = local211;
									if (local211 > 0) {
										Static174.method2341(5, "", 0, "", local897 + Static212.aClass151_111.method3122(Static188.anInt3028));
									}
									if (local211 == 0) {
										Static174.method2341(5, "", 0, "", local897 + Static71.aClass151_44.method3122(Static188.anInt3028));
									}
								}
								Static244.aStringArray29[local276] = local901;
								Static226.aStringArray47[local276] = local911;
								Static154.anIntArray343[local276] = local264;
								Static82.aBooleanArray10[local276] = local913;
								local897 = null;
								break;
							}
						}
						if (local897 != null && Static145.anInt2445 < 200) {
							Static108.aStringArray17[Static145.anInt2445] = local897;
							Static244.aStringArray29[Static145.anInt2445] = local901;
							Static163.anIntArray137[Static145.anInt2445] = local211;
							Static226.aStringArray47[Static145.anInt2445] = local911;
							Static154.anIntArray343[Static145.anInt2445] = local264;
							Static82.aBooleanArray10[Static145.anInt2445] = local913;
							Static145.anInt2445++;
						}
					}
					Static89.anInt1571 = 2;
					Static136.anInt2311 = Static443.anInt6230;
					local70 = Static145.anInt2445;
					while (local70 > 0) {
						local70--;
						local893 = true;
						for (local207 = 0; local207 < local70; local207++) {
							if (Static62.anInt1112 != Static163.anIntArray137[local207] && Static163.anIntArray137[local207 + 1] == Static62.anInt1112 || Static163.anIntArray137[local207] == 0 && Static163.anIntArray137[local207 + 1] != 0) {
								local211 = Static163.anIntArray137[local207];
								Static163.anIntArray137[local207] = Static163.anIntArray137[local207 + 1];
								Static163.anIntArray137[local207 + 1] = local211;
								local1147 = Static226.aStringArray47[local207];
								Static226.aStringArray47[local207] = Static226.aStringArray47[local207 + 1];
								Static226.aStringArray47[local207 + 1] = local1147;
								local911 = Static108.aStringArray17[local207];
								Static108.aStringArray17[local207] = Static108.aStringArray17[local207 + 1];
								Static108.aStringArray17[local207 + 1] = local911;
								local1183 = Static244.aStringArray29[local207];
								Static244.aStringArray29[local207] = Static244.aStringArray29[local207 + 1];
								Static244.aStringArray29[local207 + 1] = local1183;
								local276 = Static154.anIntArray343[local207];
								Static154.anIntArray343[local207] = Static154.anIntArray343[local207 + 1];
								Static154.anIntArray343[local207 + 1] = local276;
								local1219 = Static82.aBooleanArray10[local207];
								Static82.aBooleanArray10[local207] = Static82.aBooleanArray10[local207 + 1];
								local893 = false;
								Static82.aBooleanArray10[local207 + 1] = local1219;
							}
						}
						if (local893) {
							break;
						}
					}
					Static175.aClass214_107 = null;
					return true;
				} else if (Static175.aClass214_107 == Static61.aClass214_46) {
					Static364.aClass259_1.method5521();
					Static53.anInt975 += 32;
					Static175.aClass214_107 = null;
					return true;
				} else if (Static40.aClass214_176 == Static175.aClass214_107) {
					local199 = Static154.aClass1_Sub11_Sub1_3.method4497();
					local70 = Static154.aClass1_Sub11_Sub1_3.method4497();
					@Pc(1282) byte local1282 = Static154.aClass1_Sub11_Sub1_3.method4473();
					if (Static431.method5423(local199)) {
						Static405.method5035(local70, local1282);
					}
					Static175.aClass214_107 = null;
					return true;
				} else if (Static380.aClass214_231 == Static175.aClass214_107) {
					Static249.aString40 = Static329.anInt5393 <= 2 ? Static205.aClass151_109.method3122(Static188.anInt3028) : Static154.aClass1_Sub11_Sub1_3.method4484();
					Static281.anInt4403 = Static329.anInt5393 > 0 ? Static154.aClass1_Sub11_Sub1_3.method4485() : -1;
					Static175.aClass214_107 = null;
					if (Static281.anInt4403 == 65535) {
						Static281.anInt4403 = -1;
					}
					return true;
				} else if (Static175.aClass214_107 == Static159.aClass214_101) {
					local199 = Static154.aClass1_Sub11_Sub1_3.method4458();
					local70 = Static154.aClass1_Sub11_Sub1_3.method4500();
					if (Static431.method5423(local70)) {
						Static40.method3797(-1, local199, 3, -1);
					}
					Static175.aClass214_107 = null;
					return true;
				} else if (Static175.aClass214_107 == Static171.aClass214_108) {
					local199 = Static154.aClass1_Sub11_Sub1_3.method4485();
					if (local199 == 65535) {
						local199 = -1;
					}
					local70 = Static154.aClass1_Sub11_Sub1_3.method4463();
					local207 = Static154.aClass1_Sub11_Sub1_3.method4485();
					local211 = Static154.aClass1_Sub11_Sub1_3.method4463();
					Static263.method3375(local211, local199, local70, local207);
					Static175.aClass214_107 = null;
					return true;
				} else if (Static304.aClass214_183 == Static175.aClass214_107) {
					Static189.method2490(Static85.aClass224_17);
					Static175.aClass214_107 = null;
					return true;
				} else {
					@Pc(1432) Class1_Sub26 local1432;
					if (Static175.aClass214_107 == Static326.aClass214_192) {
						local199 = Static154.aClass1_Sub11_Sub1_3.method4467();
						local70 = Static154.aClass1_Sub11_Sub1_3.method4459();
						local207 = Static154.aClass1_Sub11_Sub1_3.method4497();
						local211 = Static154.aClass1_Sub11_Sub1_3.method4500();
						if (Static431.method5423(local207)) {
							local1432 = (Class1_Sub26) Static304.aClass257_21.method5503((long) local199);
							if (local1432 != null) {
								Static454.method5610(false, local211 != local1432.anInt3847, local1432);
							}
							Static54.method834(local211, false, local199, local70);
						}
						Static175.aClass214_107 = null;
						return true;
					} else if (Static175.aClass214_107 == Static350.aClass214_209) {
						Static189.method2490(Static427.aClass224_26);
						Static175.aClass214_107 = null;
						return true;
					} else {
						@Pc(1473) String local1473;
						if (Static334.aClass214_198 == Static175.aClass214_107) {
							local1473 = Static154.aClass1_Sub11_Sub1_3.method4484();
							local897 = Static25.method476(Static124.method1717(Static154.aClass1_Sub11_Sub1_3));
							Static174.method2341(6, local1473, 0, local1473, local897);
							Static175.aClass214_107 = null;
							return true;
						}
						@Pc(1516) String local1516;
						if (Static175.aClass214_107 == Static140.aClass214_88) {
							local199 = Static154.aClass1_Sub11_Sub1_3.method4463();
							@Pc(1508) boolean local1508 = (local199 & 0x1) == 1;
							local901 = Static154.aClass1_Sub11_Sub1_3.method4484();
							local1516 = Static154.aClass1_Sub11_Sub1_3.method4484();
							if (local1516.equals("")) {
								local1516 = local901;
							}
							local1147 = Static154.aClass1_Sub11_Sub1_3.method4484();
							local911 = Static154.aClass1_Sub11_Sub1_3.method4484();
							if (local911.equals("")) {
								local911 = local1147;
							}
							if (local1508) {
								for (local272 = 0; local272 < Static360.anInt5990; local272++) {
									if (Static43.aStringArray44[local272].equals(local911)) {
										Static76.aStringArray10[local272] = local901;
										Static43.aStringArray44[local272] = local1516;
										Static11.aStringArray1[local272] = local1147;
										Static272.aStringArray37[local272] = local911;
										break;
									}
								}
							} else {
								Static76.aStringArray10[Static360.anInt5990] = local901;
								Static43.aStringArray44[Static360.anInt5990] = local1516;
								Static11.aStringArray1[Static360.anInt5990] = local1147;
								Static272.aStringArray37[Static360.anInt5990] = local911;
								Static304.aBooleanArray23[Static360.anInt5990] = (local199 & 0x2) == 2;
								Static360.anInt5990++;
							}
							Static136.anInt2311 = Static443.anInt6230;
							Static175.aClass214_107 = null;
							return true;
						} else if (Static175.aClass214_107 == Static359.aClass214_214) {
							local199 = Static154.aClass1_Sub11_Sub1_3.method4497();
							local70 = Static154.aClass1_Sub11_Sub1_3.method4458();
							local207 = Static154.aClass1_Sub11_Sub1_3.method4485();
							if (Static431.method5423(local199)) {
								Static405.method5035(local207, local70);
							}
							Static175.aClass214_107 = null;
							return true;
						} else if (Static172.aClass214_110 == Static175.aClass214_107) {
							local199 = Static154.aClass1_Sub11_Sub1_3.method4487();
							local70 = Static154.aClass1_Sub11_Sub1_3.method4497();
							local207 = Static154.aClass1_Sub11_Sub1_3.method4458();
							if (Static431.method5423(local70)) {
								@Pc(1668) Class1_Sub26 local1668 = (Class1_Sub26) Static304.aClass257_21.method5503((long) local199);
								local1432 = (Class1_Sub26) Static304.aClass257_21.method5503((long) local207);
								if (local1432 != null) {
									Static454.method5610(false, local1668 == null || local1668.anInt3847 != local1432.anInt3847, local1432);
								}
								if (local1668 != null) {
									local1668.method5617();
									Static304.aClass257_21.method5504(local1668, (long) local207);
								}
								@Pc(1710) Class250 local1710 = Static96.method1379(local199);
								if (local1710 != null) {
									Static94.method1357(local1710);
								}
								local1710 = Static96.method1379(local207);
								if (local1710 != null) {
									Static94.method1357(local1710);
									Static325.method4180(local1710, true);
								}
								if (Static169.anInt2522 != -1) {
									Static15.method241(1, Static169.anInt2522);
								}
							}
							Static175.aClass214_107 = null;
							return true;
						} else if (Static79.aClass214_58 == Static175.aClass214_107) {
							local199 = Static154.aClass1_Sub11_Sub1_3.method4469();
							local70 = Static154.aClass1_Sub11_Sub1_3.method4487();
							local207 = Static154.aClass1_Sub11_Sub1_3.method4463();
							local1516 = "";
							local1147 = local1516;
							if ((local207 & 0x1) != 0) {
								local1516 = Static154.aClass1_Sub11_Sub1_3.method4484();
								if ((local207 & 0x2) == 0) {
									local1147 = local1516;
								} else {
									local1147 = Static154.aClass1_Sub11_Sub1_3.method4484();
								}
							}
							local911 = Static154.aClass1_Sub11_Sub1_3.method4484();
							if (local199 == 99) {
								Static382.method4881(local911);
							} else if (local1147.equals("") || !Static281.method3533(local1147)) {
								Static174.method2341(local199, local1147, local70, local1516, local911);
							} else {
								Static175.aClass214_107 = null;
								return true;
							}
							Static175.aClass214_107 = null;
							return true;
						} else if (Static175.aClass214_107 == Static127.aClass214_85) {
							local893 = Static154.aClass1_Sub11_Sub1_3.method4463() == 1;
							local897 = Static154.aClass1_Sub11_Sub1_3.method4484();
							local901 = local897;
							if (local893) {
								local901 = Static154.aClass1_Sub11_Sub1_3.method4484();
							}
							local211 = Static154.aClass1_Sub11_Sub1_3.method4463();
							@Pc(1856) boolean local1856 = false;
							if (local211 <= 1) {
								if (Static146.aBoolean509 && !Static136.aBoolean171 || Static158.aBoolean210) {
									local1856 = true;
								} else if (local211 <= 1 && Static281.method3533(local901)) {
									local1856 = true;
								}
							}
							if (!local1856 && Static445.anInt7377 == 0) {
								local911 = Static25.method476(Static124.method1717(Static154.aClass1_Sub11_Sub1_3));
								if (local211 == 2) {
									Static28.method501(local911, 24, null, "<img=1>" + local901, "<img=1>" + local897, -1, 0);
								} else if (local211 == 1) {
									Static28.method501(local911, 24, null, "<img=0>" + local901, "<img=0>" + local897, -1, 0);
								} else {
									Static28.method501(local911, 24, null, local901, local897, -1, 0);
								}
							}
							Static175.aClass214_107 = null;
							return true;
						} else if (Static175.aClass214_107 == Static152.aClass214_96) {
							Static136.anInt2311 = Static443.anInt6230;
							Static89.anInt1571 = 1;
							Static175.aClass214_107 = null;
							return true;
						} else if (Static175.aClass214_107 == Static373.aClass214_239) {
							local199 = Static154.aClass1_Sub11_Sub1_3.method4463();
							local70 = Static154.aClass1_Sub11_Sub1_3.method4498();
							local207 = Static154.aClass1_Sub11_Sub1_3.method4504();
							Static202.anIntArray179[local207] = local70;
							Static311.anIntArray310[local207] = local199;
							Static366.anIntArray376[local207] = 1;
							local211 = Static220.anIntArray192[local207] - 1;
							for (local264 = 0; local264 < local211; local264++) {
								if (local70 >= Class132.anIntArray178[local264]) {
									Static366.anIntArray376[local207] = local264 + 2;
								}
							}
							Static385.anIntArray395[Static137.anInt2321++ & 0x1F] = local207;
							Static175.aClass214_107 = null;
							return true;
						} else {
							@Pc(2066) boolean local2066;
							if (Static175.aClass214_107 == Static164.aClass214_105) {
								local199 = Static154.aClass1_Sub11_Sub1_3.method4485();
								local70 = Static154.aClass1_Sub11_Sub1_3.method4504();
								local2066 = (local70 & 0x1) == 1;
								Static448.method5120(local199, local2066);
								Static125.anIntArray102[Static445.anInt7376++ & 0x1F] = local199;
								Static175.aClass214_107 = null;
								return true;
							} else if (Static175.aClass214_107 == Static342.aClass214_203) {
								local199 = Static154.aClass1_Sub11_Sub1_3.method4497();
								local70 = Static154.aClass1_Sub11_Sub1_3.method4498();
								Static364.aClass259_1.method5523(local199, local70);
								Static175.aClass214_107 = null;
								return true;
							} else {
								@Pc(2325) int local2325;
								@Pc(2138) boolean local2138;
								@Pc(2191) int local2191;
								@Pc(2197) int local2197;
								@Pc(2199) int local2199;
								if (Static175.aClass214_107 == Static370.aClass214_226) {
									local199 = Static154.aClass1_Sub11_Sub1_3.method4487();
									local70 = Static154.aClass1_Sub11_Sub1_3.method4485();
									local207 = Static154.aClass1_Sub11_Sub1_3.method4486();
									local211 = Static154.aClass1_Sub11_Sub1_3.method4463();
									local264 = Static154.aClass1_Sub11_Sub1_3.method4485();
									local2138 = (local211 & 0x80) != 0;
									if (local199 >> 30 == 0) {
										@Pc(2308) Class14 local2308;
										@Pc(2351) Class14 local2351;
										@Pc(2322) Class171 local2322;
										@Pc(2367) Class171 local2367;
										@Pc(2373) Class171 local2373;
										if (local199 >> 29 != 0) {
											local272 = local199 & 0xFFFF;
											@Pc(2574) Class20_Sub3_Sub3_Sub2 local2574 = Static98.aClass20_Sub3_Sub3_Sub2Array1[local272];
											if (local2574 != null) {
												if (local264 == 65535) {
													local264 = -1;
												}
												local1219 = true;
												local2191 = local2138 ? local2574.anInt6019 : local2574.anInt6014;
												if (local264 != -1 && local2191 != -1) {
													if (local264 == local2191) {
														local2308 = Static44.aClass190_2.method4005(local264);
														if (local2308.aBoolean27 && local2308.anInt325 != -1) {
															local2322 = Static152.aClass213_1.method4410(local2308.anInt325);
															local2325 = local2322.anInt4256;
															if (local2325 == 0 || local2325 == 2) {
																local1219 = false;
															} else if (local2325 == 1) {
																local1219 = true;
															}
														}
													} else {
														local2308 = Static44.aClass190_2.method4005(local264);
														local2351 = Static44.aClass190_2.method4005(local2191);
														if (local2308.anInt325 != -1 && local2351.anInt325 != -1) {
															local2367 = Static152.aClass213_1.method4410(local2308.anInt325);
															local2373 = Static152.aClass213_1.method4410(local2351.anInt325);
															if (local2367.anInt4262 < local2373.anInt4262) {
																local1219 = false;
															}
														}
													}
												}
												if (local1219) {
													if (local2138) {
														local2574.anInt6073 = 1;
														local2574.anInt6071 = 0;
														local2574.anInt6042 = local207 + Static368.anInt6250;
														local2574.anInt6066 = local211 & 0x7;
														local2574.anInt6035 = 0;
														local2574.anInt6019 = local264;
														local2574.anInt6011 = local70;
														if (local2574.anInt6042 > Static368.anInt6250) {
															local2574.anInt6071 = -1;
														}
														if (local2574.anInt6019 != -1 && Static368.anInt6250 == local2574.anInt6042) {
															local2197 = Static44.aClass190_2.method4005(local2574.anInt6019).anInt325;
															if (local2197 != -1) {
																local2322 = Static152.aClass213_1.method4410(local2197);
																if (local2322 != null && local2322.anIntArray235 != null) {
																	Static7.method4909(local2574.anInt6616, local2574.anInt6613, local2574.aByte89, false, local2322, 0);
																}
															}
														}
													} else {
														local2574.anInt6041 = 0;
														local2574.anInt6030 = 1;
														local2574.anInt6028 = local211 & 0x7;
														local2574.anInt6014 = local264;
														local2574.anInt6069 = 0;
														local2574.anInt6050 = local70;
														local2574.anInt6015 = Static368.anInt6250 + local207;
														if (local2574.anInt6015 > Static368.anInt6250) {
															local2574.anInt6041 = -1;
														}
														if (local2574.anInt6014 != -1 && local2574.anInt6015 == Static368.anInt6250) {
															local2197 = Static44.aClass190_2.method4005(local2574.anInt6014).anInt325;
															if (local2197 != -1) {
																local2322 = Static152.aClass213_1.method4410(local2197);
																if (local2322 != null && local2322.anIntArray235 != null) {
																	Static7.method4909(local2574.anInt6616, local2574.anInt6613, local2574.aByte89, false, local2322, 0);
																}
															}
														}
													}
												}
											}
										} else if (local199 >> 28 != 0) {
											local272 = local199 & 0xFFFF;
											@Pc(2266) Class20_Sub3_Sub3_Sub1 local2266;
											if (Static348.anInt5668 == local272) {
												local2266 = Static239.aClass20_Sub3_Sub3_Sub1_1;
											} else {
												local2266 = Static73.aClass20_Sub3_Sub3_Sub1Array1[local272];
											}
											if (local2266 != null) {
												if (local264 == 65535) {
													local264 = -1;
												}
												local1219 = true;
												local2191 = local2138 ? local2266.anInt6019 : local2266.anInt6014;
												if (local264 != -1 && local2191 != -1) {
													if (local264 == local2191) {
														local2308 = Static44.aClass190_2.method4005(local264);
														if (local2308.aBoolean27 && local2308.anInt325 != -1) {
															local2322 = Static152.aClass213_1.method4410(local2308.anInt325);
															local2325 = local2322.anInt4256;
															if (local2325 == 0 || local2325 == 2) {
																local1219 = false;
															} else if (local2325 == 1) {
																local1219 = true;
															}
														}
													} else {
														local2308 = Static44.aClass190_2.method4005(local264);
														local2351 = Static44.aClass190_2.method4005(local2191);
														if (local2308.anInt325 != -1 && local2351.anInt325 != -1) {
															local2367 = Static152.aClass213_1.method4410(local2308.anInt325);
															local2373 = Static152.aClass213_1.method4410(local2351.anInt325);
															if (local2373.anInt4262 > local2367.anInt4262) {
																local1219 = false;
															}
														}
													}
												}
												if (local1219) {
													if (local2138) {
														local2266.anInt6011 = local70;
														local2266.anInt6066 = local211 & 0x7;
														local2266.anInt6035 = 0;
														local2266.anInt6042 = Static368.anInt6250 + local207;
														local2266.anInt6073 = 1;
														local2266.anInt6071 = 0;
														local2266.anInt6019 = local264;
														if (local2266.anInt6019 == 65535) {
															local2266.anInt6019 = -1;
														}
														if (local2266.anInt6042 > Static368.anInt6250) {
															local2266.anInt6071 = -1;
														}
														if (local2266.anInt6019 != -1 && Static368.anInt6250 == local2266.anInt6042) {
															local2197 = Static44.aClass190_2.method4005(local2266.anInt6019).anInt325;
															if (local2197 != -1) {
																local2322 = Static152.aClass213_1.method4410(local2197);
																if (local2322 != null && local2322.anIntArray235 != null) {
																	Static7.method4909(local2266.anInt6616, local2266.anInt6613, local2266.aByte89, local2266 == Static239.aClass20_Sub3_Sub3_Sub1_1, local2322, 0);
																}
															}
														}
													} else {
														local2266.anInt6028 = local211 & 0x7;
														local2266.anInt6030 = 1;
														local2266.anInt6041 = 0;
														local2266.anInt6015 = local207 + Static368.anInt6250;
														local2266.anInt6014 = local264;
														local2266.anInt6069 = 0;
														local2266.anInt6050 = local70;
														if (local2266.anInt6014 == 65535) {
															local2266.anInt6014 = -1;
														}
														if (local2266.anInt6015 > Static368.anInt6250) {
															local2266.anInt6041 = -1;
														}
														if (local2266.anInt6014 != -1 && local2266.anInt6015 == Static368.anInt6250) {
															local2197 = Static44.aClass190_2.method4005(local2266.anInt6014).anInt325;
															if (local2197 != -1) {
																local2322 = Static152.aClass213_1.method4410(local2197);
																if (local2322 != null && local2322.anIntArray235 != null) {
																	Static7.method4909(local2266.anInt6616, local2266.anInt6613, local2266.aByte89, local2266 == Static239.aClass20_Sub3_Sub3_Sub1_1, local2322, 0);
																}
															}
														}
													}
												}
											}
										}
									} else {
										local272 = local199 >> 28 & 0x3;
										local276 = (local199 >> 14 & 0x3FFF) - Static101.anInt6646;
										local280 = (local199 & 0x3FFF) - Static278.anInt4392;
										if (local276 >= 0 && local280 >= 0 && Static425.anInt6922 > local276 && Static251.anInt4072 > local280) {
											local2191 = local276 * 128 + 64;
											local2197 = local280 * 128 + 64;
											local2199 = local272;
											if (local272 < 3 && Static346.method4403(local280, local276)) {
												local2199 = local272 + 1;
											}
											@Pc(2234) Class20_Sub3_Sub4 local2234 = new Class20_Sub3_Sub4(local264, 0, Static368.anInt6250, local272, local2199, local2191, Static183.method4175(local2197, local2191, local272) - local70, local2197, local276, local276, local280, local280, local211);
											Static245.aClass254_23.method5430(new Class1_Sub3_Sub9(local2234));
										}
									}
									Static175.aClass214_107 = null;
									return true;
								} else if (Static175.aClass214_107 == Static322.aClass214_253) {
									local199 = Static154.aClass1_Sub11_Sub1_3.method4485();
									local70 = Static154.aClass1_Sub11_Sub1_3.method4487();
									if (Static431.method5423(local199)) {
										@Pc(2872) Class1_Sub26 local2872 = (Class1_Sub26) Static304.aClass257_21.method5503((long) local70);
										if (local2872 != null) {
											Static454.method5610(false, true, local2872);
										}
										if (Static394.aClass250_13 != null) {
											Static94.method1357(Static394.aClass250_13);
											Static394.aClass250_13 = null;
										}
									}
									Static175.aClass214_107 = null;
									return true;
								} else if (Static175.aClass214_107 == Static203.aClass214_128) {
									Static189.method2490(Static7.aClass224_23);
									Static175.aClass214_107 = null;
									return true;
								} else if (Static388.aClass214_38 == Static175.aClass214_107) {
									Static221.method2943(Static329.anInt5393, Static154.aClass1_Sub11_Sub1_3);
									Static175.aClass214_107 = null;
									return true;
								} else if (Static443.aClass214_225 == Static175.aClass214_107) {
									Static154.aClass1_Sub11_Sub1_3.anInt5766 += 28;
									if (Static154.aClass1_Sub11_Sub1_3.method4505()) {
										Static340.method4325(Static154.aClass1_Sub11_Sub1_3, Static154.aClass1_Sub11_Sub1_3.anInt5766 - 28);
									}
									Static175.aClass214_107 = null;
									return true;
								} else if (Static23.aClass214_18 == Static175.aClass214_107) {
									local199 = Static154.aClass1_Sub11_Sub1_3.method4500();
									local70 = Static154.aClass1_Sub11_Sub1_3.method4486();
									local207 = Static154.aClass1_Sub11_Sub1_3.method4486();
									if (Static431.method5423(local207)) {
										Static440.method5528(local70, local199);
									}
									Static175.aClass214_107 = null;
									return true;
								} else if (Static354.aClass214_212 == Static175.aClass214_107) {
									Static189.method2490(Static396.aClass224_25);
									Static175.aClass214_107 = null;
									return true;
								} else {
									@Pc(3005) long local3005;
									@Pc(3010) long local3010;
									@Pc(3015) long local3015;
									if (Static175.aClass214_107 == Static129.aClass214_86) {
										local893 = Static154.aClass1_Sub11_Sub1_3.method4463() == 1;
										local897 = Static154.aClass1_Sub11_Sub1_3.method4484();
										local901 = local897;
										if (local893) {
											local901 = Static154.aClass1_Sub11_Sub1_3.method4484();
										}
										local3005 = Static154.aClass1_Sub11_Sub1_3.method4460();
										local3010 = Static154.aClass1_Sub11_Sub1_3.method4485();
										local3015 = Static154.aClass1_Sub11_Sub1_3.method4493();
										local2191 = Static154.aClass1_Sub11_Sub1_3.method4463();
										@Pc(3025) long local3025 = local3015 + (local3010 << 32);
										@Pc(3027) boolean local3027 = false;
										@Pc(3029) int local3029 = 0;
										while (true) {
											if (local3029 >= 100) {
												if (local2191 <= 1) {
													if (Static146.aBoolean509 && !Static136.aBoolean171 || Static158.aBoolean210) {
														local3027 = true;
													} else if (Static281.method3533(local901)) {
														local3027 = true;
													}
												}
												break;
											}
											if (local3025 == Static340.aLongArray6[local3029]) {
												local3027 = true;
												break;
											}
											local3029++;
										}
										if (!local3027 && Static445.anInt7377 == 0) {
											Static340.aLongArray6[Static276.anInt4366] = local3025;
											Static276.anInt4366 = (Static276.anInt4366 + 1) % 100;
											@Pc(3088) String local3088 = Static25.method476(Static124.method1717(Static154.aClass1_Sub11_Sub1_3));
											if (local2191 == 2 || local2191 == 3) {
												Static28.method501(local3088, 9, Static201.method2761(local3005), "<img=1>" + local901, "<img=1>" + local897, -1, 0);
											} else if (local2191 == 1) {
												Static28.method501(local3088, 9, Static201.method2761(local3005), "<img=0>" + local901, "<img=0>" + local897, -1, 0);
											} else {
												Static28.method501(local3088, 9, Static201.method2761(local3005), local901, local897, -1, 0);
											}
										}
										Static175.aClass214_107 = null;
										return true;
									}
									@Pc(3281) Class76 local3281;
									if (Static175.aClass214_107 == Static183.aClass214_191) {
										local1473 = Static154.aClass1_Sub11_Sub1_3.method4484();
										local2066 = Static154.aClass1_Sub11_Sub1_3.method4463() == 1;
										if (local2066) {
											local897 = Static154.aClass1_Sub11_Sub1_3.method4484();
										} else {
											local897 = local1473;
										}
										local211 = Static154.aClass1_Sub11_Sub1_3.method4485();
										@Pc(3198) byte local3198 = Static154.aClass1_Sub11_Sub1_3.method4452();
										local2138 = false;
										if (local3198 == -128) {
											local2138 = true;
										}
										if (local2138) {
											if (Static73.anInt1389 == 0) {
												Static175.aClass214_107 = null;
												return true;
											}
											for (local272 = 0; Static73.anInt1389 > local272 && (!Static401.aClass76Array2[local272].aString16.equals(local897) || Static401.aClass76Array2[local272].anInt1926 != local211); local272++) {
											}
											if (Static73.anInt1389 > local272) {
												while (local272 < Static73.anInt1389 - 1) {
													Static401.aClass76Array2[local272] = Static401.aClass76Array2[local272 + 1];
													local272++;
												}
												Static73.anInt1389--;
												Static401.aClass76Array2[Static73.anInt1389] = null;
											}
										} else {
											local1183 = Static154.aClass1_Sub11_Sub1_3.method4484();
											local3281 = new Class76();
											local3281.aString16 = local897;
											local3281.aString19 = local1473;
											local3281.aString18 = Static330.method4213(local3281.aString16);
											local3281.anInt1926 = local211;
											local3281.aByte15 = local3198;
											local3281.aString17 = local1183;
											for (local280 = Static73.anInt1389 - 1; local280 >= 0; local280--) {
												local2191 = Static401.aClass76Array2[local280].aString18.compareTo(local3281.aString18);
												if (local2191 == 0) {
													Static401.aClass76Array2[local280].anInt1926 = local211;
													Static401.aClass76Array2[local280].aByte15 = local3198;
													Static401.aClass76Array2[local280].aString17 = local1183;
													if (local897.equals(Static239.aClass20_Sub3_Sub3_Sub1_1.aString48)) {
														Static433.aByte103 = local3198;
													}
													Static175.aClass214_107 = null;
													Static422.anInt6844 = Static443.anInt6230;
													return true;
												}
												if (local2191 < 0) {
													break;
												}
											}
											if (Static73.anInt1389 >= Static401.aClass76Array2.length) {
												Static175.aClass214_107 = null;
												return true;
											}
											for (local2191 = Static73.anInt1389 - 1; local2191 > local280; local2191--) {
												Static401.aClass76Array2[local2191 + 1] = Static401.aClass76Array2[local2191];
											}
											if (Static73.anInt1389 == 0) {
												Static401.aClass76Array2 = new Class76[100];
											}
											Static401.aClass76Array2[local280 + 1] = local3281;
											Static73.anInt1389++;
											if (local897.equals(Static239.aClass20_Sub3_Sub3_Sub1_1.aString48)) {
												Static433.aByte103 = local3198;
											}
										}
										Static422.anInt6844 = Static443.anInt6230;
										Static175.aClass214_107 = null;
										return true;
									} else if (Static175.aClass214_107 == Static101.aClass214_240) {
										Static163.anInt2687 = Static154.aClass1_Sub11_Sub1_3.method4482();
										Static175.aClass214_107 = null;
										Static376.anInt6288 = Static443.anInt6230;
										return true;
									} else if (Static175.aClass214_107 == Static2.aClass214_121) {
										local199 = Static154.aClass1_Sub11_Sub1_3.method4487();
										Static446.aClass215_10 = Static41.aClass124_2.method2505(local199);
										Static175.aClass214_107 = null;
										return true;
									} else if (Static161.aClass214_73 == Static175.aClass214_107) {
										Static189.method2490(Static439.aClass224_28);
										Static175.aClass214_107 = null;
										return true;
									} else if (Static175.aClass214_107 == Static27.aClass214_42) {
										local199 = Static154.aClass1_Sub11_Sub1_3.method4485();
										local70 = Static154.aClass1_Sub11_Sub1_3.method4463();
										local2066 = (local70 & 0x1) == 1;
										Static108.method1517(local2066, local199);
										local211 = Static154.aClass1_Sub11_Sub1_3.method4485();
										for (local264 = 0; local264 < local211; local264++) {
											local268 = Static154.aClass1_Sub11_Sub1_3.method4486();
											local272 = Static154.aClass1_Sub11_Sub1_3.method4463();
											if (local272 == 255) {
												local272 = Static154.aClass1_Sub11_Sub1_3.method4498();
											}
											Static54.method833(local2066, local272, local264, local268 - 1, local199);
										}
										Static125.anIntArray102[Static445.anInt7376++ & 0x1F] = local199;
										Static175.aClass214_107 = null;
										return true;
									} else if (Static63.aClass214_47 == Static175.aClass214_107) {
										Static27.method873(true);
										Static175.aClass214_107 = null;
										return true;
									} else if (Static175.aClass214_107 == Static49.aClass214_33) {
										local199 = Static154.aClass1_Sub11_Sub1_3.method4465();
										local70 = Static154.aClass1_Sub11_Sub1_3.method4497();
										if (Static431.method5423(local70)) {
											Static259.anInt4172 = local199;
										}
										Static175.aClass214_107 = null;
										return true;
									} else if (Static175.aClass214_107 == Static249.aClass214_156) {
										local199 = Static154.aClass1_Sub11_Sub1_3.method4487();
										local70 = Static154.aClass1_Sub11_Sub1_3.method4500();
										local207 = Static154.aClass1_Sub11_Sub1_3.method4485();
										if (Static431.method5423(local207)) {
											method4108(local70, local199);
										}
										Static175.aClass214_107 = null;
										return true;
									} else if (Static175.aClass214_107 == Static74.aClass214_54) {
										local199 = Static154.aClass1_Sub11_Sub1_3.method4486();
										local70 = Static154.aClass1_Sub11_Sub1_3.method4497();
										local207 = Static154.aClass1_Sub11_Sub1_3.method4467();
										if (Static431.method5423(local70)) {
											Static259.method3342(local207, local199);
										}
										Static175.aClass214_107 = null;
										return true;
									} else if (Static322.aClass214_252 == Static175.aClass214_107) {
										if (Static70.aFrame1 != null) {
											Static421.method5241(-1, false, Static336.aClass106_Sub1_1.anInt5679, -1);
										}
										@Pc(3626) byte[] local3626 = new byte[Static329.anInt5393];
										Static154.aClass1_Sub11_Sub1_3.method3346(Static329.anInt5393, local3626);
										local897 = Static257.method5311(Static329.anInt5393, 0, local3626);
										Static141.method1861(local897, Static410.anInt6680 == 1, Static41.aClass124_2, true);
										Static175.aClass214_107 = null;
										return true;
									} else if (Static175.aClass214_107 == Static148.aClass214_95) {
										local199 = Static154.aClass1_Sub11_Sub1_3.method4486();
										local70 = Static154.aClass1_Sub11_Sub1_3.method4467();
										local207 = Static154.aClass1_Sub11_Sub1_3.method4500();
										local211 = Static154.aClass1_Sub11_Sub1_3.method4485();
										local264 = Static154.aClass1_Sub11_Sub1_3.method4485();
										if (Static431.method5423(local207)) {
											Static40.method3797(local264 << 16 | local199, local70, 7, local211);
										}
										Static175.aClass214_107 = null;
										return true;
									} else if (Static175.aClass214_107 == Static362.aClass214_218) {
										local199 = Static154.aClass1_Sub11_Sub1_3.method4500();
										local70 = Static154.aClass1_Sub11_Sub1_3.method4467();
										Static364.aClass259_1.method5527(local70, local199);
										Static175.aClass214_107 = null;
										return true;
									} else if (Static175.aClass214_107 == Static148.aClass214_94) {
										for (local199 = 0; local199 < Static73.aClass20_Sub3_Sub3_Sub1Array1.length; local199++) {
											if (Static73.aClass20_Sub3_Sub3_Sub1Array1[local199] != null) {
												Static73.aClass20_Sub3_Sub3_Sub1Array1[local199].anInt6051 = -1;
											}
										}
										for (local70 = 0; local70 < Static98.aClass20_Sub3_Sub3_Sub2Array1.length; local70++) {
											if (Static98.aClass20_Sub3_Sub3_Sub2Array1[local70] != null) {
												Static98.aClass20_Sub3_Sub3_Sub2Array1[local70].anInt6051 = -1;
											}
										}
										Static175.aClass214_107 = null;
										return true;
									} else if (Static175.aClass214_107 == Static359.aClass214_215) {
										Static252.method2868();
										Static175.aClass214_107 = null;
										return false;
									} else if (Static195.aClass214_124 == Static175.aClass214_107) {
										local199 = Static154.aClass1_Sub11_Sub1_3.method4485();
										if (local199 == 65535) {
											local199 = -1;
										}
										local70 = Static154.aClass1_Sub11_Sub1_3.method4497();
										local207 = Static154.aClass1_Sub11_Sub1_3.method4487();
										if (Static431.method5423(local70)) {
											Static40.method3797(local199, local207, 1, -1);
										}
										Static175.aClass214_107 = null;
										return true;
									} else {
										@Pc(3859) long local3859;
										@Pc(3878) Class1_Sub15 local3878;
										@Pc(3869) Class1_Sub15 local3869;
										if (Static289.aClass214_175 == Static175.aClass214_107) {
											local199 = Static154.aClass1_Sub11_Sub1_3.method4458();
											local70 = Static154.aClass1_Sub11_Sub1_3.method4500();
											local207 = Static154.aClass1_Sub11_Sub1_3.method4500();
											if (local207 == 65535) {
												local207 = -1;
											}
											local211 = Static154.aClass1_Sub11_Sub1_3.method4500();
											if (local211 == 65535) {
												local211 = -1;
											}
											local264 = Static154.aClass1_Sub11_Sub1_3.method4458();
											if (Static431.method5423(local70)) {
												for (local268 = local207; local268 <= local211; local268++) {
													local3859 = (long) local268 + ((long) local199 << 32);
													local3869 = (Class1_Sub15) Static291.aClass257_18.method5503(local3859);
													if (local3869 != null) {
														local3878 = new Class1_Sub15(local264, local3869.anInt2174);
														local3869.method5617();
													} else if (local268 == -1) {
														local3878 = new Class1_Sub15(local264, Static96.method1379(local199).aClass1_Sub15_2.anInt2174);
													} else {
														local3878 = new Class1_Sub15(local264, -1);
													}
													Static291.aClass257_18.method5504(local3878, local3859);
												}
											}
											Static175.aClass214_107 = null;
											return true;
										} else if (Static175.aClass214_107 == Static188.aClass214_118) {
											local199 = Static154.aClass1_Sub11_Sub1_3.method4467();
											local70 = Static154.aClass1_Sub11_Sub1_3.method4486();
											local207 = Static154.aClass1_Sub11_Sub1_3.method4500();
											if (local207 == 65535) {
												local207 = -1;
											}
											if (Static431.method5423(local70)) {
												Static373.method5094(local199, local207);
											}
											Static175.aClass214_107 = null;
											return true;
										} else if (Static175.aClass214_107 == Static345.aClass214_207) {
											Static391.method4947();
											Static175.aClass214_107 = null;
											return false;
										} else if (Static164.aClass214_104 == Static175.aClass214_107) {
											local199 = Static154.aClass1_Sub11_Sub1_3.method4485();
											local70 = Static154.aClass1_Sub11_Sub1_3.method4485();
											local207 = Static154.aClass1_Sub11_Sub1_3.method4485();
											local211 = Static154.aClass1_Sub11_Sub1_3.method4485();
											if (Static431.method5423(local199) && Static369.aClass250ArrayArray5[local70] != null) {
												for (local264 = local207; local264 < local211; local264++) {
													local268 = Static154.aClass1_Sub11_Sub1_3.method4493();
													if (Static369.aClass250ArrayArray5[local70].length > local264 && Static369.aClass250ArrayArray5[local70][local264] != null) {
														Static369.aClass250ArrayArray5[local70][local264].anInt7010 = local268;
													}
												}
											}
											Static175.aClass214_107 = null;
											return true;
										} else if (Static175.aClass214_107 == Static416.aClass214_242) {
											local199 = Static154.aClass1_Sub11_Sub1_3.method4485();
											local70 = Static154.aClass1_Sub11_Sub1_3.method4463();
											local2066 = (local70 & 0x1) == 1;
											while (Static329.anInt5393 > Static154.aClass1_Sub11_Sub1_3.anInt5766) {
												local211 = Static154.aClass1_Sub11_Sub1_3.method4469();
												local264 = Static154.aClass1_Sub11_Sub1_3.method4485();
												local268 = 0;
												if (local264 != 0) {
													local268 = Static154.aClass1_Sub11_Sub1_3.method4463();
													if (local268 == 255) {
														local268 = Static154.aClass1_Sub11_Sub1_3.method4487();
													}
												}
												Static54.method833(local2066, local268, local211, local264 - 1, local199);
											}
											Static125.anIntArray102[Static445.anInt7376++ & 0x1F] = local199;
											Static175.aClass214_107 = null;
											return true;
										} else if (Static90.aClass214_63 == Static175.aClass214_107) {
											Static189.method2490(Static342.aClass224_22);
											Static175.aClass214_107 = null;
											return true;
										} else if (Static175.aClass214_107 == Static11.aClass214_11) {
											local199 = Static154.aClass1_Sub11_Sub1_3.method4497();
											local70 = Static154.aClass1_Sub11_Sub1_3.method4463();
											local207 = Static154.aClass1_Sub11_Sub1_3.method4497();
											if (Static431.method5423(local199)) {
												if (local70 == 2) {
													Static151.method2143();
												}
												Static169.anInt2522 = local207;
												Static278.method3521(local207);
												Static28.method503(false);
												Static267.method3403(Static169.anInt2522);
												for (local211 = 0; local211 < 100; local211++) {
													Static145.aBooleanArray15[local211] = true;
												}
											}
											Static175.aClass214_107 = null;
											return true;
										} else if (Static175.aClass214_107 == Static411.aClass214_241) {
											local893 = Static154.aClass1_Sub11_Sub1_3.method4463() == 1;
											local897 = Static154.aClass1_Sub11_Sub1_3.method4484();
											local901 = local897;
											if (local893) {
												local901 = Static154.aClass1_Sub11_Sub1_3.method4484();
											}
											local211 = Static154.aClass1_Sub11_Sub1_3.method4463();
											local264 = Static154.aClass1_Sub11_Sub1_3.method4485();
											local2138 = false;
											if (local211 <= 1 && Static281.method3533(local901)) {
												local2138 = true;
											}
											if (!local2138 && Static445.anInt7377 == 0) {
												local1183 = Static109.aClass229_1.method4848(local264).method5205(Static154.aClass1_Sub11_Sub1_3);
												if (local211 == 2) {
													Static28.method501(local1183, 25, null, "<img=1>" + local901, "<img=1>" + local897, local264, 0);
												} else if (local211 == 1) {
													Static28.method501(local1183, 25, null, "<img=0>" + local901, "<img=0>" + local897, local264, 0);
												} else {
													Static28.method501(local1183, 25, null, local901, local897, local264, 0);
												}
											}
											Static175.aClass214_107 = null;
											return true;
										} else if (Static175.aClass214_107 == Static77.aClass214_57) {
											Static189.method2490(Static273.aClass224_16);
											Static175.aClass214_107 = null;
											return true;
										} else if (Static72.aClass214_49 == Static175.aClass214_107) {
											local199 = Static154.aClass1_Sub11_Sub1_3.method4487();
											local70 = Static154.aClass1_Sub11_Sub1_3.method4486();
											local207 = Static154.aClass1_Sub11_Sub1_3.method4498();
											local211 = Static154.aClass1_Sub11_Sub1_3.method4486();
											if (local211 == 65535) {
												local211 = -1;
											}
											if (Static431.method5423(local70)) {
												Static43.method4055(local207, local211, local199);
												@Pc(4348) Class74 local4348 = Static227.aClass65_2.method1327(local211);
												Static309.method4032(local4348.anInt1870, local4348.anInt1863, local4348.anInt1860, local199);
												Static237.method3119(local4348.anInt1876, local199, local4348.anInt1856, local4348.anInt1841);
											}
											Static175.aClass214_107 = null;
											return true;
										} else if (Static175.aClass214_107 == Static298.aClass214_180) {
											Static400.method4917();
											Static175.aClass214_107 = null;
											return false;
										} else if (Static175.aClass214_107 == Static291.aClass214_177) {
											Static433.method5432(Static329.anInt5393, Static154.aClass1_Sub11_Sub1_3, Static41.aClass124_2);
											Static175.aClass214_107 = null;
											return true;
										} else if (Static175.aClass214_107 == Static217.aClass214_131) {
											Static258.method3273();
											Static175.aClass214_107 = null;
											return true;
										} else if (Static261.aClass214_159 == Static175.aClass214_107) {
											local199 = Static154.aClass1_Sub11_Sub1_3.method4465();
											local70 = Static154.aClass1_Sub11_Sub1_3.method4463();
											local901 = Static154.aClass1_Sub11_Sub1_3.method4484();
											local211 = Static154.aClass1_Sub11_Sub1_3.method4497();
											if (local211 == 65535) {
												local211 = -1;
											}
											if (local199 >= 1 && local199 <= 8) {
												if (local901.equalsIgnoreCase("null")) {
													local901 = null;
												}
												Static348.aStringArray45[local199 - 1] = local901;
												Static448.anIntArray444[local199 - 1] = local211;
												Static245.aBooleanArray18[local199 - 1] = local70 == 0;
											}
											Static175.aClass214_107 = null;
											return true;
										} else if (Static58.aClass214_44 == Static175.aClass214_107) {
											Static345.anInt5644 = Static154.aClass1_Sub11_Sub1_3.method4463();
											Static175.aClass214_107 = null;
											return true;
										} else if (Static175.aClass214_107 == Static301.aClass214_181) {
											local199 = Static154.aClass1_Sub11_Sub1_3.method4497();
											@Pc(4488) byte local4488 = Static154.aClass1_Sub11_Sub1_3.method4473();
											Static364.aClass259_1.method5523(local199, local4488);
											Static175.aClass214_107 = null;
											return true;
										} else if (Static175.aClass214_107 == Static326.aClass214_193) {
											local199 = Static154.aClass1_Sub11_Sub1_3.method4485();
											if (local199 == 65535) {
												local199 = -1;
											}
											local70 = Static154.aClass1_Sub11_Sub1_3.method4463();
											local207 = Static154.aClass1_Sub11_Sub1_3.method4485();
											local211 = Static154.aClass1_Sub11_Sub1_3.method4463();
											Static237.method3121(local70, local199, local207, local211);
											Static175.aClass214_107 = null;
											return true;
										} else if (Static175.aClass214_107 == Static37.aClass214_30) {
											Static422.anInt6844 = Static443.anInt6230;
											if (Static329.anInt5393 == 0) {
												Static73.anInt1389 = 0;
												Static175.aClass214_107 = null;
												Static401.aClass76Array2 = null;
												Static4.aString1 = null;
												Static234.aString38 = null;
												return true;
											}
											Static4.aString1 = Static154.aClass1_Sub11_Sub1_3.method4484();
											local893 = Static154.aClass1_Sub11_Sub1_3.method4463() == 1;
											if (local893) {
												Static154.aClass1_Sub11_Sub1_3.method4484();
											}
											@Pc(4579) long local4579 = Static154.aClass1_Sub11_Sub1_3.method4460();
											Static234.aString38 = Static338.method4298(local4579);
											Static370.aByte83 = Static154.aClass1_Sub11_Sub1_3.method4452();
											local211 = Static154.aClass1_Sub11_Sub1_3.method4463();
											if (local211 == 255) {
												Static175.aClass214_107 = null;
												return true;
											}
											Static73.anInt1389 = local211;
											@Pc(4603) Class76[] local4603 = new Class76[100];
											for (local268 = 0; local268 < Static73.anInt1389; local268++) {
												local4603[local268] = new Class76();
												local4603[local268].aString19 = Static154.aClass1_Sub11_Sub1_3.method4484();
												local893 = Static154.aClass1_Sub11_Sub1_3.method4463() == 1;
												if (local893) {
													local4603[local268].aString16 = Static154.aClass1_Sub11_Sub1_3.method4484();
												} else {
													local4603[local268].aString16 = local4603[local268].aString19;
												}
												local4603[local268].aString18 = Static330.method4213(local4603[local268].aString16);
												local4603[local268].anInt1926 = Static154.aClass1_Sub11_Sub1_3.method4485();
												local4603[local268].aByte15 = Static154.aClass1_Sub11_Sub1_3.method4452();
												local4603[local268].aString17 = Static154.aClass1_Sub11_Sub1_3.method4484();
												if (local4603[local268].aString16.equals(Static239.aClass20_Sub3_Sub3_Sub1_1.aString48)) {
													Static433.aByte103 = local4603[local268].aByte15;
												}
											}
											local280 = Static73.anInt1389;
											while (local280 > 0) {
												local913 = true;
												local280--;
												for (local2191 = 0; local2191 < local280; local2191++) {
													if (local4603[local2191].aString18.compareTo(local4603[local2191 + 1].aString18) > 0) {
														local3281 = local4603[local2191];
														local4603[local2191] = local4603[local2191 + 1];
														local4603[local2191 + 1] = local3281;
														local913 = false;
													}
												}
												if (local913) {
													break;
												}
											}
											Static175.aClass214_107 = null;
											Static401.aClass76Array2 = local4603;
											return true;
										} else if (Static385.aClass214_232 == Static175.aClass214_107) {
											Static189.method2490(Static272.aClass224_15);
											Static175.aClass214_107 = null;
											return true;
										} else if (Static175.aClass214_107 == Static71.aClass214_48) {
											local199 = Static154.aClass1_Sub11_Sub1_3.method4459();
											local70 = Static154.aClass1_Sub11_Sub1_3.method4500();
											local207 = Static154.aClass1_Sub11_Sub1_3.method4500();
											@Pc(4795) Class20_Sub3_Sub3_Sub2 local4795 = Static98.aClass20_Sub3_Sub3_Sub2Array1[local207];
											if (local4795 != null) {
												Static149.method5575(local199, local4795, local70);
											}
											Static175.aClass214_107 = null;
											return true;
										} else if (Static175.aClass214_107 == Static126.aClass214_84) {
											local199 = Static154.aClass1_Sub11_Sub1_3.method4485();
											local70 = Static154.aClass1_Sub11_Sub1_3.method4463();
											local207 = Static154.aClass1_Sub11_Sub1_3.method4463();
											local211 = Static154.aClass1_Sub11_Sub1_3.method4463();
											local264 = Static154.aClass1_Sub11_Sub1_3.method4463();
											local268 = Static154.aClass1_Sub11_Sub1_3.method4485();
											if (Static431.method5423(local199)) {
												Static35.aBooleanArray6[local70] = true;
												Static2.anIntArray168[local70] = local207;
												Static140.anIntArray113[local70] = local211;
												Static387.anIntArray397[local70] = local264;
												Static65.anIntArray55[local70] = local268;
											}
											Static175.aClass214_107 = null;
											return true;
										} else if (Static324.aClass214_190 == Static175.aClass214_107) {
											local199 = Static154.aClass1_Sub11_Sub1_3.method4486();
											local70 = Static154.aClass1_Sub11_Sub1_3.method4467();
											local207 = Static154.aClass1_Sub11_Sub1_3.method4486();
											if (Static431.method5423(local207)) {
												Static440.method5531(local199, local70);
											}
											Static175.aClass214_107 = null;
											return true;
										} else if (Static175.aClass214_107 == Static453.aClass214_251) {
											local199 = Static154.aClass1_Sub11_Sub1_3.method4486();
											if (local199 == 65535) {
												local199 = -1;
											}
											local70 = Static154.aClass1_Sub11_Sub1_3.method4504();
											local207 = Static154.aClass1_Sub11_Sub1_3.method4463();
											Static27.method880(local199, local70, local207);
											Static175.aClass214_107 = null;
											return true;
										} else if (Static104.aClass214_249 == Static175.aClass214_107) {
											local199 = Static154.aClass1_Sub11_Sub1_3.method4444();
											local70 = Static154.aClass1_Sub11_Sub1_3.method4486();
											if (local70 == 65535) {
												local70 = -1;
											}
											local207 = Static154.aClass1_Sub11_Sub1_3.method4459();
											Static59.method948(local207, local70, local199);
											Static175.aClass214_107 = null;
											return true;
										} else if (Static175.aClass214_107 == Static235.aClass214_144) {
											local199 = Static154.aClass1_Sub11_Sub1_3.method4463();
											if (Static154.aClass1_Sub11_Sub1_3.method4463() == 0) {
												Static290.aClass237Array1[local199] = new Class237();
											} else {
												Static154.aClass1_Sub11_Sub1_3.anInt5766--;
												Static290.aClass237Array1[local199] = new Class237(Static154.aClass1_Sub11_Sub1_3);
											}
											Static175.aClass214_107 = null;
											Static367.anInt6218 = Static443.anInt6230;
											return true;
										} else if (Static175.aClass214_107 == Static286.aClass214_170) {
											local1473 = Static154.aClass1_Sub11_Sub1_3.method4484();
											local70 = Static154.aClass1_Sub11_Sub1_3.method4485();
											local901 = Static109.aClass229_1.method4848(local70).method5205(Static154.aClass1_Sub11_Sub1_3);
											Static28.method501(local901, 19, null, local1473, local1473, local70, 0);
											Static175.aClass214_107 = null;
											return true;
										} else if (Static175.aClass214_107 == Static266.aClass214_126) {
											local199 = Static154.aClass1_Sub11_Sub1_3.method4485();
											local70 = Static154.aClass1_Sub11_Sub1_3.method4486();
											local901 = Static154.aClass1_Sub11_Sub1_3.method4484();
											if (Static431.method5423(local70)) {
												Static353.method4550(local901, local199);
											}
											Static175.aClass214_107 = null;
											return true;
										} else if (Static175.aClass214_107 == Static217.aClass214_132) {
											if (Static169.anInt2522 != -1) {
												Static15.method241(0, Static169.anInt2522);
											}
											Static175.aClass214_107 = null;
											return true;
										} else if (Static175.aClass214_107 == Static237.aClass214_147) {
											Static355.method4564(Static154.aClass1_Sub11_Sub1_3.method4484());
											Static175.aClass214_107 = null;
											return true;
										} else if (Static2.aClass214_122 == Static175.aClass214_107) {
											local199 = Static154.aClass1_Sub11_Sub1_3.method4486();
											local70 = Static154.aClass1_Sub11_Sub1_3.method4487();
											if (Static431.method5423(local199)) {
												Static40.method3797(Static348.anInt5668, local70, 5, 0);
											}
											Static175.aClass214_107 = null;
											return true;
										} else if (Static262.aClass214_160 == Static175.aClass214_107) {
											local199 = Static154.aClass1_Sub11_Sub1_3.method4485();
											local70 = Static154.aClass1_Sub11_Sub1_3.method4463();
											local207 = Static154.aClass1_Sub11_Sub1_3.method4463();
											local211 = Static154.aClass1_Sub11_Sub1_3.method4485() << 0;
											local264 = Static154.aClass1_Sub11_Sub1_3.method4463();
											local268 = Static154.aClass1_Sub11_Sub1_3.method4463();
											if (Static431.method5423(local199)) {
												Static413.method5157(local207, local211, local264, local268, local70);
											}
											Static175.aClass214_107 = null;
											return true;
										} else if (Static175.aClass214_107 == Static377.aClass214_227) {
											local199 = Static154.aClass1_Sub11_Sub1_3.method4485();
											if (Static431.method5423(local199)) {
												Static47.method711();
											}
											Static175.aClass214_107 = null;
											return true;
										} else if (Static175.aClass214_107 == Static304.aClass214_184) {
											local199 = Static154.aClass1_Sub11_Sub1_3.method4497();
											local70 = Static154.aClass1_Sub11_Sub1_3.method4486();
											if (local70 == 65535) {
												local70 = -1;
											}
											local207 = Static154.aClass1_Sub11_Sub1_3.method4467();
											local211 = Static154.aClass1_Sub11_Sub1_3.method4485();
											if (local211 == 65535) {
												local211 = -1;
											}
											local264 = Static154.aClass1_Sub11_Sub1_3.method4497();
											if (Static431.method5423(local264)) {
												for (local268 = local70; local268 <= local211; local268++) {
													local3859 = (long) local268 + ((long) local207 << 32);
													local3869 = (Class1_Sub15) Static291.aClass257_18.method5503(local3859);
													if (local3869 != null) {
														local3878 = new Class1_Sub15(local3869.anInt2172, local199);
														local3869.method5617();
													} else if (local268 == -1) {
														local3878 = new Class1_Sub15(Static96.method1379(local207).aClass1_Sub15_2.anInt2172, local199);
													} else {
														local3878 = new Class1_Sub15(0, local199);
													}
													Static291.aClass257_18.method5504(local3878, local3859);
												}
											}
											Static175.aClass214_107 = null;
											return true;
										} else if (Static324.aClass214_189 == Static175.aClass214_107) {
											Static189.method2490(Static65.aClass224_9);
											Static175.aClass214_107 = null;
											return true;
										} else if (Static175.aClass214_107 == Static51.aClass214_36) {
											local199 = Static154.aClass1_Sub11_Sub1_3.method4458();
											local70 = Static154.aClass1_Sub11_Sub1_3.method4486();
											local207 = Static154.aClass1_Sub11_Sub1_3.method4467();
											local211 = Static154.aClass1_Sub11_Sub1_3.method4486();
											if (Static431.method5423(local70)) {
												Static40.method3797(local211, local199, 5, local207);
											}
											Static175.aClass214_107 = null;
											return true;
										} else if (Static27.aClass214_41 == Static175.aClass214_107) {
											Static189.method2490(Static279.aClass224_27);
											Static175.aClass214_107 = null;
											return true;
										} else if (Static175.aClass214_107 == Static33.aClass214_27) {
											local199 = Static154.aClass1_Sub11_Sub1_3.method4459();
											local70 = Static154.aClass1_Sub11_Sub1_3.method4459();
											if (local199 == 255) {
												local199 = -1;
												local70 = -1;
											}
											Static58.method886(local70, local199);
											Static175.aClass214_107 = null;
											return true;
										} else if (Static221.aClass214_134 == Static175.aClass214_107) {
											local893 = Static154.aClass1_Sub11_Sub1_3.method4463() == 1;
											local897 = Static154.aClass1_Sub11_Sub1_3.method4484();
											local901 = local897;
											if (local893) {
												local901 = Static154.aClass1_Sub11_Sub1_3.method4484();
											}
											local3005 = Static154.aClass1_Sub11_Sub1_3.method4460();
											local3010 = Static154.aClass1_Sub11_Sub1_3.method4485();
											local3015 = Static154.aClass1_Sub11_Sub1_3.method4493();
											local2191 = Static154.aClass1_Sub11_Sub1_3.method4463();
											local2197 = Static154.aClass1_Sub11_Sub1_3.method4485();
											@Pc(5401) long local5401 = local3015 + (local3010 << 32);
											@Pc(5403) boolean local5403 = false;
											@Pc(5405) int local5405 = 0;
											while (true) {
												if (local5405 >= 100) {
													if (local2191 <= 1 && Static281.method3533(local901)) {
														local5403 = true;
													}
													break;
												}
												if (Static340.aLongArray6[local5405] == local5401) {
													local5403 = true;
													break;
												}
												local5405++;
											}
											if (!local5403 && Static445.anInt7377 == 0) {
												Static340.aLongArray6[Static276.anInt4366] = local5401;
												Static276.anInt4366 = (Static276.anInt4366 + 1) % 100;
												@Pc(5452) String local5452 = Static109.aClass229_1.method4848(local2197).method5205(Static154.aClass1_Sub11_Sub1_3);
												if (local2191 == 2) {
													Static28.method501(local5452, 20, Static201.method2761(local3005), "<img=1>" + local901, "<img=1>" + local897, local2197, 0);
												} else if (local2191 == 1) {
													Static28.method501(local5452, 20, Static201.method2761(local3005), "<img=0>" + local901, "<img=0>" + local897, local2197, 0);
												} else {
													Static28.method501(local5452, 20, Static201.method2761(local3005), local901, local897, local2197, 0);
												}
											}
											Static175.aClass214_107 = null;
											return true;
										} else if (Static175.aClass214_107 == Static249.aClass214_157) {
											Static189.method2490(Static393.aClass224_24);
											Static175.aClass214_107 = null;
											return true;
										} else if (Static252.aClass214_130 == Static175.aClass214_107) {
											local893 = Static154.aClass1_Sub11_Sub1_3.method4463() == 1;
											local897 = Static154.aClass1_Sub11_Sub1_3.method4484();
											local901 = local897;
											if (local893) {
												local901 = Static154.aClass1_Sub11_Sub1_3.method4484();
											}
											local3005 = Static154.aClass1_Sub11_Sub1_3.method4485();
											local3010 = Static154.aClass1_Sub11_Sub1_3.method4493();
											local276 = Static154.aClass1_Sub11_Sub1_3.method4463();
											@Pc(5582) long local5582 = (local3005 << 32) + local3010;
											@Pc(5584) boolean local5584 = false;
											local2199 = 0;
											while (true) {
												if (local2199 >= 100) {
													if (local276 <= 1) {
														if (Static146.aBoolean509 && !Static136.aBoolean171 || Static158.aBoolean210) {
															local5584 = true;
														} else if (Static281.method3533(local901)) {
															local5584 = true;
														}
													}
													break;
												}
												if (local5582 == Static340.aLongArray6[local2199]) {
													local5584 = true;
													break;
												}
												local2199++;
											}
											if (!local5584 && Static445.anInt7377 == 0) {
												Static340.aLongArray6[Static276.anInt4366] = local5582;
												Static276.anInt4366 = (Static276.anInt4366 + 1) % 100;
												@Pc(5643) String local5643 = Static25.method476(Static124.method1717(Static154.aClass1_Sub11_Sub1_3));
												if (local276 == 2) {
													Static28.method501(local5643, 7, null, "<img=1>" + local901, "<img=1>" + local897, -1, 0);
												} else if (local276 == 1) {
													Static28.method501(local5643, 7, null, "<img=0>" + local901, "<img=0>" + local897, -1, 0);
												} else {
													Static28.method501(local5643, 3, null, local901, local897, -1, 0);
												}
											}
											Static175.aClass214_107 = null;
											return true;
										} else if (Static175.aClass214_107 == Static349.aClass214_208) {
											local199 = Static154.aClass1_Sub11_Sub1_3.method4485();
											local70 = Static154.aClass1_Sub11_Sub1_3.method4463();
											local207 = Static154.aClass1_Sub11_Sub1_3.method4463();
											local211 = Static154.aClass1_Sub11_Sub1_3.method4485() << 0;
											local264 = Static154.aClass1_Sub11_Sub1_3.method4463();
											local268 = Static154.aClass1_Sub11_Sub1_3.method4463();
											if (Static431.method5423(local199)) {
												Static107.method1511(local211, true, local70, local268, local264, local207);
											}
											Static175.aClass214_107 = null;
											return true;
										} else if (Static175.aClass214_107 == Static421.aClass214_244) {
											local199 = Static154.aClass1_Sub11_Sub1_3.method4497();
											local70 = Static154.aClass1_Sub11_Sub1_3.method4504();
											Static364.aClass259_1.method5527(local70, local199);
											Static175.aClass214_107 = null;
											return true;
										} else if (Static269.aClass214_162 == Static175.aClass214_107) {
											local1473 = Static154.aClass1_Sub11_Sub1_3.method4484();
											local70 = Static154.aClass1_Sub11_Sub1_3.method4497();
											local207 = Static154.aClass1_Sub11_Sub1_3.method4497();
											if (Static431.method5423(local207)) {
												Static353.method4550(local1473, local70);
											}
											Static175.aClass214_107 = null;
											return true;
										} else if (Static175.aClass214_107 == Static405.aClass214_237) {
											Static182.aClass58_3 = Static132.method1786(Static154.aClass1_Sub11_Sub1_3.method4463());
											Static175.aClass214_107 = null;
											return true;
										} else if (Static175.aClass214_107 == Static238.aClass214_148) {
											local199 = Static154.aClass1_Sub11_Sub1_3.method4500();
											local70 = Static154.aClass1_Sub11_Sub1_3.method4486();
											if (local70 == 65535) {
												local70 = -1;
											}
											local207 = Static154.aClass1_Sub11_Sub1_3.method4458();
											if (Static431.method5423(local199)) {
												Static40.method3797(local70, local207, 2, -1);
											}
											Static175.aClass214_107 = null;
											return true;
										} else if (Static379.aClass214_228 == Static175.aClass214_107) {
											local199 = Static154.aClass1_Sub11_Sub1_3.method4485();
											local897 = Static154.aClass1_Sub11_Sub1_3.method4484();
											@Pc(5866) Object[] local5866 = new Object[local897.length() + 1];
											for (local211 = local897.length() - 1; local211 >= 0; local211--) {
												if (local897.charAt(local211) == 's') {
													local5866[local211 + 1] = Static154.aClass1_Sub11_Sub1_3.method4484();
												} else {
													local5866[local211 + 1] = Integer.valueOf(Static154.aClass1_Sub11_Sub1_3.method4487());
												}
											}
											local5866[0] = Integer.valueOf(Static154.aClass1_Sub11_Sub1_3.method4487());
											if (Static431.method5423(local199)) {
												@Pc(5922) Class1_Sub31 local5922 = new Class1_Sub31();
												local5922.anObjectArray5 = local5866;
												Static267.method3402(local5922);
											}
											Static175.aClass214_107 = null;
											return true;
										} else if (Static145.aClass214_93 == Static175.aClass214_107) {
											local199 = Static154.aClass1_Sub11_Sub1_3.method4467();
											local70 = Static154.aClass1_Sub11_Sub1_3.method4497();
											local901 = Static154.aClass1_Sub11_Sub1_3.method4484();
											if (Static431.method5423(local70)) {
												Static445.method5568(local199, local901);
											}
											Static175.aClass214_107 = null;
											return true;
										} else if (Static175.aClass214_107 == Static351.aClass214_210) {
											local199 = Static154.aClass1_Sub11_Sub1_3.method4485();
											local70 = Static154.aClass1_Sub11_Sub1_3.method4487();
											local207 = Static154.aClass1_Sub11_Sub1_3.method4486();
											local211 = Static154.aClass1_Sub11_Sub1_3.method4500();
											local264 = Static154.aClass1_Sub11_Sub1_3.method4500();
											if (Static431.method5423(local264)) {
												Static309.method4032(local207, local211, local199, local70);
											}
											Static175.aClass214_107 = null;
											return true;
										} else if (Static175.aClass214_107 == Static283.aClass214_167) {
											Static189.method2490(Static329.aClass224_20);
											Static175.aClass214_107 = null;
											return true;
										} else if (Static172.aClass214_109 == Static175.aClass214_107) {
											Static382.anInt6355 = Static154.aClass1_Sub11_Sub1_3.method4459();
											Static403.anInt6530 = Static154.aClass1_Sub11_Sub1_3.method4452() << 3;
											Static74.anInt1414 = Static154.aClass1_Sub11_Sub1_3.method4475() << 3;
											Static175.aClass214_107 = null;
											return true;
										} else if (Static175.aClass214_107 == Static27.aClass214_43) {
											Static189.method2490(Static111.aClass224_21);
											Static175.aClass214_107 = null;
											return true;
										} else if (Static415.aClass214_62 == Static175.aClass214_107) {
											Static403.anInt6530 = Static154.aClass1_Sub11_Sub1_3.method4473() << 3;
											Static382.anInt6355 = Static154.aClass1_Sub11_Sub1_3.method4504();
											Static74.anInt1414 = Static154.aClass1_Sub11_Sub1_3.method4477() << 3;
											while (Static154.aClass1_Sub11_Sub1_3.anInt5766 < Static329.anInt5393) {
												@Pc(6071) Class224 local6071 = Static423.method5262()[Static154.aClass1_Sub11_Sub1_3.method4463()];
												Static189.method2490(local6071);
											}
											Static175.aClass214_107 = null;
											return true;
										} else if (Static175.aClass214_107 == Static244.aClass214_151) {
											local199 = Static154.aClass1_Sub11_Sub1_3.method4500();
											local70 = Static154.aClass1_Sub11_Sub1_3.method4499();
											local207 = Static154.aClass1_Sub11_Sub1_3.method4458();
											if (Static431.method5423(local199)) {
												Static391.method4950(local207, local70);
											}
											Static175.aClass214_107 = null;
											return true;
										} else if (Static328.aClass214_194 == Static175.aClass214_107) {
											local893 = Static154.aClass1_Sub11_Sub1_3.method4463() == 1;
											local897 = Static154.aClass1_Sub11_Sub1_3.method4484();
											local901 = local897;
											if (local893) {
												local901 = Static154.aClass1_Sub11_Sub1_3.method4484();
											}
											local3005 = Static154.aClass1_Sub11_Sub1_3.method4485();
											local3010 = Static154.aClass1_Sub11_Sub1_3.method4493();
											local276 = Static154.aClass1_Sub11_Sub1_3.method4463();
											local280 = Static154.aClass1_Sub11_Sub1_3.method4485();
											@Pc(6158) long local6158 = (local3005 << 32) + local3010;
											@Pc(6160) boolean local6160 = false;
											local2325 = 0;
											while (true) {
												if (local2325 >= 100) {
													if (local276 <= 1 && Static281.method3533(local901)) {
														local6160 = true;
													}
													break;
												}
												if (local6158 == Static340.aLongArray6[local2325]) {
													local6160 = true;
													break;
												}
												local2325++;
											}
											if (!local6160 && Static445.anInt7377 == 0) {
												Static340.aLongArray6[Static276.anInt4366] = local6158;
												Static276.anInt4366 = (Static276.anInt4366 + 1) % 100;
												@Pc(6212) String local6212 = Static109.aClass229_1.method4848(local280).method5205(Static154.aClass1_Sub11_Sub1_3);
												if (local276 == 2) {
													Static28.method501(local6212, 18, null, "<img=1>" + local901, "<img=1>" + local897, local280, 0);
												} else if (local276 == 1) {
													Static28.method501(local6212, 18, null, "<img=0>" + local901, "<img=0>" + local897, local280, 0);
												} else {
													Static28.method501(local6212, 18, null, local901, local897, local280, 0);
												}
											}
											Static175.aClass214_107 = null;
											return true;
										} else {
											Static211.method2815(null, "T1 - " + (Static175.aClass214_107 == null ? -1 : Static175.aClass214_107.method4416()) + "," + (Static418.aClass214_243 == null ? -1 : Static418.aClass214_243.method4416()) + "," + (Static379.aClass214_229 == null ? -1 : Static379.aClass214_229.method4416()) + " - " + Static329.anInt5393);
											Static252.method2868();
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

	@OriginalMember(owner = "client!pu", name = "a", descriptor = "(III)V")
	private static void method4108(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class1_Sub3_Sub13 local8 = Static397.method4998(14, arg1);
		local8.method3459();
		local8.anInt4301 = arg0;
	}
}
