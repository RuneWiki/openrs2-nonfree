import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static591 {

	@OriginalMember(owner = "client!ud", name = "B", descriptor = "I")
	public static int anInt9708;

	@OriginalMember(owner = "client!ud", name = "H", descriptor = "Lclient!cl;")
	public static Class66 aClass66_2;

	@OriginalMember(owner = "client!ud", name = "E", descriptor = "Lclient!kka;")
	public static final Class198 aClass198_6 = new Class198();

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(IIB)Z")
	public static boolean method8112(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x800) != 0;
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(IIIIIII)V")
	public static void method8113(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3) {
		@Pc(7) int local7 = Static105.anInt2258;
		Static383.anInt6817 = 0;
		@Pc(11) int[] local11 = Static321.anIntArray339;
		@Pc(185) int local185;
		@Pc(214) int local214;
		@Pc(263) int local263;
		@Pc(337) int local337;
		@Pc(340) int local340;
		@Pc(1146) int local1146;
		@Pc(1191) int local1191;
		@Pc(1193) int local1193;
		@Pc(439) int local439;
		@Pc(1047) int local1047;
		@Pc(543) int local543;
		for (@Pc(13) int local13 = 0; local13 < local7 + Static36.anInt607; local13++) {
			@Pc(19) Class134 local19 = null;
			@Pc(28) Class28_Sub1_Sub4_Sub2 local28;
			if (local7 > local13) {
				local28 = Static351.aClass28_Sub1_Sub4_Sub2_Sub2Array2[local11[local13]];
			} else {
				local28 = ((Class5_Sub25) Static56.aClass300_8.method7188((long) Static588.anIntArray533[local13 - local7])).aClass28_Sub1_Sub4_Sub2_Sub1_1;
				local19 = ((Class28_Sub1_Sub4_Sub2_Sub1) local28).aClass134_1;
				if (local19.anIntArray191 != null) {
					local19 = local19.method3276(Static161.aClass237_3);
					if (local19 == null) {
						continue;
					}
				}
			}
			if (local28.anInt5470 >= 0 && (Static349.anInt6360 == local28.anInt5474 || local28.aByte145 == Static382.aClass28_Sub1_Sub4_Sub2_Sub2_1.aByte145)) {
				Static589.method8093(arg2 >> 1, local28.method4584(), local28, arg0 >> 1);
				if (Static665.anIntArray475[0] >= 0) {
					if (local28.aString43 != null && (local13 >= local7 || Static99.anInt2173 == 0 || Static99.anInt2173 == 3 || Static99.anInt2173 == 1 && Static476.method6820(((Class28_Sub1_Sub4_Sub2_Sub2) local28).aString45)) && Static383.anInt6817 < Static457.anInt7759) {
						Static457.anIntArray438[Static383.anInt6817] = Static299.aClass247_11.method5759(local28.aString43) / 2;
						Static457.anIntArray435[Static383.anInt6817] = Static665.anIntArray475[0];
						Static457.anIntArray436[Static383.anInt6817] = Static665.anIntArray475[1];
						Static457.anIntArray437[Static383.anInt6817] = local28.anInt5505;
						Static457.anIntArray439[Static383.anInt6817] = local28.anInt5489;
						Static457.anIntArray440[Static383.anInt6817] = local28.anInt5454;
						Static457.aStringArray45[Static383.anInt6817] = local28.aString43;
						Static383.anInt6817++;
					}
					local185 = arg3 + Static665.anIntArray475[1];
					@Pc(248) Class50[] local248;
					@Pc(255) Class369[] local255;
					@Pc(309) Class50 local309;
					if (local28.aBoolean468 || local28.anInt5464 <= Static26.anInt350) {
						local185 -= Math.max(Static299.aClass247_11.anInt6974, Static63.aClass50Array3[0].method5992());
					} else {
						@Pc(196) byte local196 = 1;
						if (local13 < local7) {
							@Pc(209) Class28_Sub1_Sub4_Sub2_Sub2 local209 = Static351.aClass28_Sub1_Sub4_Sub2_Sub2Array2[local11[local13]];
							local214 = local28.method4580().anInt4899;
							if (local209.aBoolean475) {
								local196 = 2;
							}
						} else {
							local214 = local19.anInt3846;
							if (local214 == -1) {
								local214 = local28.method4580().anInt4899;
							}
						}
						@Pc(237) Class50[] local237 = Static63.aClass50Array3;
						if (local214 != -1) {
							local248 = (Class50[]) Static80.aClass340_4.method7999((long) local214);
							if (local248 == null) {
								local255 = Static689.method8535(Static257.aClass390_60, local214);
								if (local255 != null) {
									local248 = new Class50[local255.length];
									for (local263 = 0; local263 < local255.length; local263++) {
										local248[local263] = Static208.aClass65_7.method6898(local255[local263], true);
									}
									Static80.aClass340_4.method7986((long) local214, local248);
								}
							}
							if (local248 != null && local248.length >= 2) {
								local237 = local248;
							}
						}
						if (local196 >= local237.length) {
							local196 = 1;
						}
						@Pc(305) Class50 local305 = local237[0];
						local309 = local237[local196];
						local185 -= Math.max(Static299.aClass247_11.anInt6974, local305.method5992());
						local263 = Static665.anIntArray475[0] + arg1 - (local305.method6002() >> 1);
						local337 = local305.method6002() * local28.anInt5465 / 255;
						local340 = local305.method5992();
						if (local28.anInt5465 > 0 && local337 < 2) {
							local337 = 2;
						}
						local305.method5996(local263, local185);
						Static208.aClass65_7.T(local263, local185, local263 + local337, local340 + local185);
						local309.method5996(local263, local185);
						Static208.aClass65_7.KA(arg1, arg3, arg0 + arg1, arg2 + arg3);
						Static520.method7366(local263, local185 + local340, local185, local305.method6003() + local263);
					}
					local185 -= 2;
					if (!local28.aBoolean468) {
						@Pc(422) Class50 local422;
						@Pc(431) Class50 local431;
						if (local28.anInt5483 > Static26.anInt350) {
							local422 = Static644.aClass50Array14[local28.aBoolean469 ? 2 : 0];
							local431 = Static644.aClass50Array14[local28.aBoolean469 ? 3 : 1];
							if (local28 instanceof Class28_Sub1_Sub4_Sub2_Sub1) {
								local439 = local19.anInt3832;
								if (local439 == -1) {
									local439 = local28.method4580().anInt4901;
								}
							} else {
								local439 = local28.method4580().anInt4901;
							}
							if (local439 != -1) {
								local248 = (Class50[]) Static334.aClass340_38.method7999((long) local439);
								if (local248 == null) {
									local255 = Static689.method8535(Static257.aClass390_60, local439);
									if (local255 != null) {
										local248 = new Class50[local255.length];
										for (local263 = 0; local263 < local255.length; local263++) {
											local248[local263] = Static208.aClass65_7.method6898(local255[local263], true);
										}
										Static334.aClass340_38.method7986((long) local439, local248);
									}
								}
								if (local248 != null && local248.length == 4) {
									local422 = local248[local28.aBoolean469 ? 2 : 0];
									local431 = local248[local28.aBoolean469 ? 3 : 1];
								}
							}
							@Pc(536) int local536 = local28.anInt5483 - Static26.anInt350;
							if (local28.anInt5488 >= local536) {
								local543 = local422.method6002();
							} else {
								local536 -= local28.anInt5488;
								local263 = local28.anInt5520 == 0 ? 0 : (local28.anInt5484 - local536) / local28.anInt5520 * local28.anInt5520;
								local543 = local422.method6002() * local263 / local28.anInt5484;
							}
							local263 = local422.method5992();
							local185 -= local263;
							local337 = Static665.anIntArray475[0] + arg1 - (local422.method6002() >> 1);
							local422.method5996(local337, local185);
							Static208.aClass65_7.T(local337, local185, local337 + local543, local185 + local263);
							local431.method5996(local337, local185);
							Static208.aClass65_7.KA(arg1, arg3, arg1 + arg0, arg2 + arg3);
							Static520.method7366(local337, local263 + local185, local185, local422.method6003() + local337);
							local185 -= 2;
						}
						if (local13 < local7) {
							@Pc(648) Class28_Sub1_Sub4_Sub2_Sub2 local648 = (Class28_Sub1_Sub4_Sub2_Sub2) local28;
							if (local648.anInt5562 != -1) {
								local185 -= 25;
								local431 = Static400.aClass50Array16[local648.anInt5562];
								local431.method5996(arg1 + Static665.anIntArray475[0] - 12, local185);
								Static520.method7366(Static665.anIntArray475[0] + arg1 - 12, local431.method6010() + local185, local185, arg1 + Static665.anIntArray475[0] + local431.method6003() - 12);
								local185 -= 2;
							}
							if (local648.anInt5548 != -1) {
								local185 -= 25;
								local431 = Static322.aClass50Array6[local648.anInt5548];
								local431.method5996(Static665.anIntArray475[0] + arg1 - 12, local185);
								Static520.method7366(Static665.anIntArray475[0] + arg1 - 12, local431.method6010() + local185, local185, arg1 + Static665.anIntArray475[0] + local431.method6003() - 12);
								local185 -= 2;
							}
						} else if (local19.anInt3854 >= 0 && Static322.aClass50Array6.length > local19.anInt3854) {
							local185 -= 25;
							local422 = Static322.aClass50Array6[local19.anInt3854];
							local422.method5996(arg1 + Static665.anIntArray475[0] - (local422.method6002() >> 1), local185);
							Static520.method7366(arg1 + Static665.anIntArray475[0] - (local422.method6002() >> 1), local185 + local422.method6010(), local185, arg1 + Static665.anIntArray475[0] - (local422.method6002() >> 1) + local422.method6003());
							local185 -= 2;
						}
					}
					@Pc(821) Class371[] local821;
					@Pc(829) Class371 local829;
					if (!(local28 instanceof Class28_Sub1_Sub4_Sub2_Sub2)) {
						local214 = 0;
						local821 = Static564.aClass371Array6;
						for (local439 = 0; local439 < local821.length; local439++) {
							local829 = local821[local439];
							if (local829 != null && local829.anInt10324 == 1 && Static588.anIntArray533[local13 - local7] == local829.anInt10325) {
								local309 = Static375.aClass50Array10[local829.anInt10318];
								if (local309.method5992() > local214) {
									local214 = local309.method5992();
								}
								if (Static26.anInt350 % 20 < 10) {
									local309.method5996(arg1 + Static665.anIntArray475[0] - 12, -local309.method5992() + local185);
									Static520.method7366(arg1 + Static665.anIntArray475[0] - 12, -local309.method5992() + (local185 - -local309.method6010()), local185 - local309.method5992(), Static665.anIntArray475[0] + -12 + arg1 - -local309.method6003());
								}
							}
						}
						if (local214 > 0) {
						}
					} else if (local13 >= 0) {
						local214 = 0;
						local821 = Static564.aClass371Array6;
						for (local439 = 0; local439 < local821.length; local439++) {
							local829 = local821[local439];
							if (local829 != null && local829.anInt10324 == 10 && local11[local13] == local829.anInt10325) {
								local309 = Static375.aClass50Array10[local829.anInt10318];
								if (local214 < local309.method5992()) {
									local214 = local309.method5992();
								}
								local309.method5996(Static665.anIntArray475[0] + arg1 - 12, -local309.method5992() + local185);
								Static520.method7366(arg1 + Static665.anIntArray475[0] - 12, local185 + -local309.method5992() + local309.method6010(), local185 - local309.method5992(), Static665.anIntArray475[0] + arg1 + (-12 - -local309.method6003()));
							}
						}
						if (local214 > 0) {
						}
					}
					for (local214 = 0; local214 < Static430.anInt58; local214++) {
						local1047 = local28.anIntArray300[local214];
						local439 = local28.anIntArray301[local214];
						@Pc(1054) Class102 local1054 = null;
						local543 = 0;
						if (local439 >= 0) {
							if (local1047 <= Static26.anInt350) {
								continue;
							}
							local1054 = Static463.aClass70_2.method1847(local28.anIntArray301[local214]);
							local543 = local1054.anInt2760;
						} else if (local1047 < 0) {
							continue;
						}
						local263 = local28.anIntArray302[local214];
						@Pc(1093) Class102 local1093 = null;
						if (local263 >= 0) {
							local1093 = Static463.aClass70_2.method1847(local263);
						}
						if (Static26.anInt350 >= local1047 - local543) {
							local340 = local28.anIntArray299[local214];
							if (local340 >= 0) {
								local28.anInt5464 = Static26.anInt350 + 300;
								local28.anInt5465 = local340;
								local28.anIntArray299[local214] = -1;
							}
							if (local1054 == null) {
								local28.anIntArray300[local214] = -1;
							} else {
								local1146 = local28.method4584() / 2;
								Static589.method8093(arg2 >> 1, local1146, local28, arg0 >> 1);
								if (Static665.anIntArray475[0] > -1) {
									Static665.anIntArray475[0] += Static152.anIntArray133[local214];
									Static665.anIntArray475[1] += Static511.anIntArray480[local214];
									local1191 = 0;
									local1193 = 0;
									@Pc(1195) int local1195 = 0;
									@Pc(1197) int local1197 = 0;
									@Pc(1199) int local1199 = 0;
									@Pc(1201) int local1201 = 0;
									@Pc(1203) int local1203 = 0;
									@Pc(1205) int local1205 = 0;
									@Pc(1207) Class50 local1207 = null;
									@Pc(1209) Class50 local1209 = null;
									@Pc(1211) Class50 local1211 = null;
									@Pc(1213) Class50 local1213 = null;
									@Pc(1215) int local1215 = 0;
									@Pc(1217) int local1217 = 0;
									@Pc(1219) int local1219 = 0;
									@Pc(1221) int local1221 = 0;
									@Pc(1223) int local1223 = 0;
									@Pc(1225) int local1225 = 0;
									@Pc(1227) int local1227 = 0;
									@Pc(1229) int local1229 = 0;
									@Pc(1231) int local1231 = 0;
									@Pc(1236) Class50 local1236 = local1054.method2490(Static208.aClass65_7);
									@Pc(1244) int local1244;
									if (local1236 != null) {
										local1191 = local1236.method6002();
										local1244 = local1236.method5992();
										local1236.method5999(Static417.anIntArray420);
										if (local1244 > 0) {
											local1231 = local1244;
										}
										local1199 = Static417.anIntArray420[0];
									}
									@Pc(1265) Class50 local1265 = local1054.method2488(Static208.aClass65_7);
									if (local1265 != null) {
										local1193 = local1265.method6002();
										local1244 = local1265.method5992();
										local1265.method5999(Static417.anIntArray420);
										if (local1244 > local1231) {
											local1231 = local1244;
										}
										local1201 = Static417.anIntArray420[0];
									}
									@Pc(1290) Class50 local1290 = local1054.method2483(Static208.aClass65_7);
									if (local1290 != null) {
										local1195 = local1290.method6002();
										local1244 = local1290.method5992();
										if (local1231 < local1244) {
											local1231 = local1244;
										}
										local1290.method5999(Static417.anIntArray420);
										local1203 = Static417.anIntArray420[0];
									}
									@Pc(1317) Class50 local1317 = local1054.method2489(Static208.aClass65_7);
									if (local1317 != null) {
										local1197 = local1317.method6002();
										local1244 = local1317.method5992();
										local1317.method5999(Static417.anIntArray420);
										if (local1231 < local1244) {
											local1231 = local1244;
										}
										local1205 = Static417.anIntArray420[0];
									}
									if (local1093 != null) {
										local1207 = local1093.method2490(Static208.aClass65_7);
										if (local1207 != null) {
											local1215 = local1207.method6002();
											local1244 = local1207.method5992();
											local1207.method5999(Static417.anIntArray420);
											if (local1231 < local1244) {
												local1231 = local1244;
											}
											local1223 = Static417.anIntArray420[0];
										}
										local1209 = local1093.method2488(Static208.aClass65_7);
										if (local1209 != null) {
											local1217 = local1209.method6002();
											local1244 = local1209.method5992();
											local1209.method5999(Static417.anIntArray420);
											if (local1244 > local1231) {
												local1231 = local1244;
											}
											local1225 = Static417.anIntArray420[0];
										}
										local1211 = local1093.method2483(Static208.aClass65_7);
										if (local1211 != null) {
											local1219 = local1211.method6002();
											local1244 = local1211.method5992();
											local1211.method5999(Static417.anIntArray420);
											if (local1231 < local1244) {
												local1231 = local1244;
											}
											local1227 = Static417.anIntArray420[0];
										}
										local1213 = local1093.method2489(Static208.aClass65_7);
										if (local1213 != null) {
											local1221 = local1213.method6002();
											local1244 = local1213.method5992();
											if (local1244 > local1231) {
												local1231 = local1244;
											}
											local1213.method5999(Static417.anIntArray420);
											local1229 = Static417.anIntArray420[0];
										}
									}
									@Pc(1451) Class73 local1451 = Static431.aClass73_10;
									@Pc(1453) Class73 local1453 = Static431.aClass73_10;
									@Pc(1455) Class247 local1455 = Static258.aClass247_9;
									local1244 = local1054.anInt2762;
									@Pc(1460) Class247 local1460 = Static258.aClass247_9;
									@Pc(1473) Class73 local1473;
									@Pc(1478) Class247 local1478;
									if (local1244 >= 0) {
										local1473 = Static503.method7181(local1244, true, Static208.aClass65_7);
										local1478 = Static483.method6868(local1244, Static208.aClass65_7);
										if (local1473 != null && local1478 != null) {
											local1455 = local1478;
											local1451 = local1473;
										}
									}
									if (local1093 != null) {
										local1244 = local1093.anInt2762;
										if (local1244 >= 0) {
											local1473 = Static503.method7181(local1244, true, Static208.aClass65_7);
											local1478 = Static483.method6868(local1244, Static208.aClass65_7);
											if (local1473 != null && local1478 != null) {
												local1453 = local1473;
												local1460 = local1478;
											}
										}
									}
									@Pc(1519) String local1519 = null;
									@Pc(1523) int local1523 = 0;
									@Pc(1531) String local1531 = local1054.method2487(local28.anIntArray304[local214]);
									@Pc(1536) int local1536 = local1455.method5759(local1531);
									if (local1093 != null) {
										local1519 = local1093.method2487(local28.anIntArray303[local214]);
										local1523 = local1460.method5759(local1519);
									}
									@Pc(1553) int local1553 = 0;
									@Pc(1555) int local1555 = 0;
									if (local1193 > 0) {
										local1553 = local1536 / local1193 + 1;
									}
									if (local1093 != null && local1217 > 0) {
										local1555 = local1523 / local1217 + 1;
									}
									@Pc(1578) int local1578 = 0;
									if (local1191 > 0) {
										local1578 = local1191;
									}
									local1578 += 2;
									@Pc(1589) int local1589 = local1578;
									if (local1195 > 0) {
										local1578 += local1195;
									}
									@Pc(1600) int local1600 = local1578;
									@Pc(1602) int local1602 = local1578;
									@Pc(1617) int local1617;
									if (local1193 <= 0) {
										local1578 += local1536;
									} else {
										local1617 = local1193 * local1553;
										local1602 = local1578 + (local1617 - local1536) / 2;
										local1578 += local1617;
									}
									local1617 = local1578;
									if (local1197 > 0) {
										local1578 += local1197;
									}
									@Pc(1640) int local1640 = 0;
									@Pc(1642) int local1642 = 0;
									@Pc(1644) int local1644 = 0;
									@Pc(1646) int local1646 = 0;
									@Pc(1648) int local1648 = 0;
									@Pc(1678) int local1678;
									if (local1093 != null) {
										local1578 += 2;
										local1640 = local1578;
										if (local1215 > 0) {
											local1578 += local1215;
										}
										local1578 += 2;
										local1642 = local1578;
										if (local1219 > 0) {
											local1578 += local1219;
										}
										local1648 = local1578;
										local1644 = local1578;
										if (local1217 > 0) {
											local1678 = local1555 * local1217;
											local1648 = local1578 + (local1678 - local1523) / 2;
											local1578 += local1678;
										} else {
											local1578 += local1523;
										}
										local1646 = local1578;
										if (local1221 > 0) {
											local1578 += local1221;
										}
									}
									local1678 = local28.anIntArray300[local214] - Static26.anInt350;
									@Pc(1726) int local1726 = local1054.anInt2774 - local1054.anInt2774 * local1678 / local1054.anInt2760;
									@Pc(1738) int local1738 = local1054.anInt2780 * local1678 / local1054.anInt2760 - local1054.anInt2780;
									@Pc(1751) int local1751 = local1726 + Static665.anIntArray475[0] + arg1 - (local1578 >> 1);
									@Pc(1762) int local1762 = local1738 + arg3 + Static665.anIntArray475[1] - 12;
									@Pc(1764) int local1764 = local1762;
									@Pc(1769) int local1769 = local1762 + local1231;
									@Pc(1777) int local1777 = local1762 + local1054.anInt2761 + 15;
									@Pc(1783) int local1783 = local1777 - local1455.anInt6974;
									if (local1783 < local1762) {
										local1764 = local1783;
									}
									@Pc(1797) int local1797 = local1777 + local1455.anInt6966;
									if (local1797 > local1769) {
										local1769 = local1797;
									}
									@Pc(1804) int local1804 = 0;
									@Pc(1819) int local1819;
									@Pc(1829) int local1829;
									if (local1093 != null) {
										local1804 = local1762 + local1093.anInt2761 + 15;
										local1819 = local1804 - local1460.anInt6974;
										if (local1819 < local1764) {
											local1764 = local1819;
										}
										local1829 = local1460.anInt6966 + local1804;
										if (local1829 > local1769) {
											local1769 = local1829;
										}
									}
									local1819 = 255;
									if (local1054.anInt2767 >= 0) {
										local1819 = (local1678 << 8) / (local1054.anInt2760 - local1054.anInt2767);
									}
									if (local1819 >= 0 && local1819 < 255) {
										local1829 = local1819 << 24;
										@Pc(2024) int local2024 = local1829 | 0xFFFFFF;
										if (local1236 != null) {
											local1236.method5987(local1751 - local1199, local1762, 0, local2024, 1);
										}
										if (local1290 != null) {
											local1290.method5987(local1751 + local1589 - local1203, local1762, 0, local2024, 1);
										}
										@Pc(2055) int local2055;
										if (local1265 != null) {
											for (local2055 = 0; local2055 < local1553; local2055++) {
												local1265.method5987(local2055 * local1193 + local1751 + local1600 - local1201, local1762, 0, local2024, 1);
											}
										}
										if (local1317 != null) {
											local1317.method5987(local1751 + local1617 - local1205, local1762, 0, local2024, 1);
										}
										local1451.method5773(local1777, local1829 | local1054.anInt2770, local1531, local1751 + local1602, 0);
										if (local1093 != null) {
											if (local1207 != null) {
												local1207.method5987(local1640 + local1751 - local1223, local1762, 0, local2024, 1);
											}
											if (local1211 != null) {
												local1211.method5987(local1751 + local1642 - local1227, local1762, 0, local2024, 1);
											}
											if (local1209 != null) {
												for (local2055 = 0; local2055 < local1555; local2055++) {
													local1209.method5987(local1644 + local1751 + local2055 * local1217 - local1225, local1762, 0, local2024, 1);
												}
											}
											if (local1213 != null) {
												local1213.method5987(local1646 + local1751 - local1229, local1762, 0, local2024, 1);
											}
											local1453.method5773(local1804, local1093.anInt2770 | local1829, local1519, local1648 + local1751, 0);
										}
									} else {
										if (local1236 != null) {
											local1236.method5996(local1751 - local1199, local1762);
										}
										if (local1290 != null) {
											local1290.method5996(local1589 + local1751 - local1203, local1762);
										}
										if (local1265 != null) {
											for (local1829 = 0; local1829 < local1553; local1829++) {
												local1265.method5996(local1751 + local1600 + local1193 * local1829 - local1201, local1762);
											}
										}
										if (local1317 != null) {
											local1317.method5996(local1617 + local1751 - local1205, local1762);
										}
										local1451.method5773(local1777, local1054.anInt2770 | 0xFF000000, local1531, local1602 + local1751, 0);
										if (local1093 != null) {
											if (local1207 != null) {
												local1207.method5996(local1751 + local1640 - local1223, local1762);
											}
											if (local1211 != null) {
												local1211.method5996(local1751 + local1642 - local1227, local1762);
											}
											if (local1209 != null) {
												for (local1829 = 0; local1829 < local1555; local1829++) {
													local1209.method5996(local1644 + local1751 + local1217 * local1829 - local1225, local1762);
												}
											}
											if (local1213 != null) {
												local1213.method5996(local1751 + local1646 - local1229, local1762);
											}
											local1453.method5773(local1804, local1093.anInt2770 | 0xFF000000, local1519, local1648 + local1751, 0);
										}
									}
									Static520.method7366(local1751, local1769 + 1, local1764, local1751 + local1578);
								}
							}
						}
					}
				}
			}
		}
		@Pc(2230) int local2230;
		for (@Pc(2224) int local2224 = 0; local2224 < Static213.anInt9562; local2224++) {
			local2230 = Static208.anIntArray197[local2224];
			@Pc(2239) Class28_Sub1_Sub4_Sub2 local2239;
			if (local2230 < 2048) {
				local2239 = Static351.aClass28_Sub1_Sub4_Sub2_Sub2Array2[local2230];
			} else {
				local2239 = ((Class5_Sub25) Static56.aClass300_8.method7188((long) (local2230 - 2048))).aClass28_Sub1_Sub4_Sub2_Sub1_1;
			}
			local214 = Static454.anIntArray433[local2224];
			@Pc(2264) Class28_Sub1_Sub4_Sub2 local2264;
			if (local214 < 2048) {
				local2264 = Static351.aClass28_Sub1_Sub4_Sub2_Sub2Array2[local214];
			} else {
				local2264 = ((Class5_Sub25) Static56.aClass300_8.method7188((long) (local214 - 2048))).aClass28_Sub1_Sub4_Sub2_Sub1_1;
			}
			Static88.method1842(arg0, --local2239.anInt5508, local2264, arg1, local2239, arg2, arg3);
		}
		local2230 = Static299.aClass247_11.anInt6974 + Static299.aClass247_11.anInt6966 + 2;
		for (local185 = 0; local185 < Static383.anInt6817; local185++) {
			local214 = Static457.anIntArray435[local185];
			local1047 = Static457.anIntArray436[local185];
			local439 = Static457.anIntArray438[local185];
			@Pc(2324) boolean local2324 = true;
			while (local2324) {
				local2324 = false;
				for (local543 = 0; local543 < local185; local543++) {
					if (Static457.anIntArray436[local543] - local2230 < local1047 - -2 && local1047 - local2230 < Static457.anIntArray436[local543] + 2 && local214 - local439 < Static457.anIntArray435[local543] + Static457.anIntArray438[local543] && local439 + local214 > Static457.anIntArray435[local543] + -Static457.anIntArray438[local543] && local1047 > Static457.anIntArray436[local543] - local2230) {
						local1047 = Static457.anIntArray436[local543] - local2230;
						local2324 = true;
					}
				}
			}
			Static457.anIntArray436[local185] = local1047;
			@Pc(2419) String local2419 = Static457.aStringArray45[local185];
			local263 = Static299.aClass247_11.method5759(local2419);
			local337 = local214 + arg1;
			local340 = local1047 + arg3 - Static299.aClass247_11.anInt6974;
			local1146 = local263 + local337;
			@Pc(2447) int local2447 = Static299.aClass247_11.anInt6966 + local1047 + arg3;
			if (Static62.anInt952 == 0) {
				@Pc(2481) int local2481 = 16776960;
				if (Static457.anIntArray437[local185] < 6) {
					local2481 = Static603.anIntArray547[Static457.anIntArray437[local185]];
				}
				if (Static457.anIntArray437[local185] == 6) {
					local2481 = Static349.anInt6360 % 20 >= 10 ? 16776960 : 16711680;
				}
				if (Static457.anIntArray437[local185] == 7) {
					local2481 = Static349.anInt6360 % 20 < 10 ? 255 : 65535;
				}
				if (Static457.anIntArray437[local185] == 8) {
					local2481 = Static349.anInt6360 % 20 >= 10 ? 8454016 : 45056;
				}
				@Pc(2556) int local2556;
				if (Static457.anIntArray437[local185] == 9) {
					local2556 = 150 - Static457.anIntArray440[local185];
					if (local2556 < 50) {
						local2481 = local2556 * 1280 + 16711680;
					} else if (local2556 < 100) {
						local2481 = 16776960 - (local2556 - 50) * 327680;
					} else if (local2556 < 150) {
						local2481 = local2556 * 5 + 64780;
					}
				}
				if (Static457.anIntArray437[local185] == 10) {
					local2556 = 150 - Static457.anIntArray440[local185];
					if (local2556 < 50) {
						local2481 = local2556 * 5 + 16711680;
					} else if (local2556 < 100) {
						local2481 = 16711935 - (local2556 - 50) * 327680;
					} else if (local2556 < 150) {
						local2481 = (local2556 - 100) * 327680 + 255 + 500 - local2556 * 5;
					}
				}
				if (Static457.anIntArray437[local185] == 11) {
					local2556 = 150 - Static457.anIntArray440[local185];
					if (local2556 < 50) {
						local2481 = 16777215 - local2556 * 327685;
					} else if (local2556 < 100) {
						local2481 = local2556 * 327685 + 65280 - 16384250;
					} else if (local2556 < 150) {
						local2481 = 32768000 + 16777215 - local2556 * 327680;
					}
				}
				local2556 = local2481 | 0xFF000000;
				if (Static457.anIntArray439[local185] == 0) {
					Static231.aClass73_8.method5781(local2419, local1047 + arg3, local214 + arg1, -16777216, local2556);
					local337 -= local263 >> 1;
					local1146 -= local263 >> 1;
				}
				if (Static457.anIntArray439[local185] == 1) {
					local337 -= local263 >> 1;
					local1146 -= local263 >> 1;
					local340 -= 5;
					local2447 += 5;
					Static231.aClass73_8.method5779(local2556, Static349.anInt6360, local1047 + arg3, local214 + arg1, local2419);
				}
				if (Static457.anIntArray439[local185] == 2) {
					Static231.aClass73_8.method5789(Static349.anInt6360, local214 + arg1, local2419, local1047 + arg3, local2556);
					local2447 += 5;
					local337 -= (local263 >> 1) + 5;
					local1146 -= (local263 >> 1) - 5;
					local340 -= 5;
				}
				if (Static457.anIntArray439[local185] == 3) {
					Static231.aClass73_8.method5785(local1047 + arg3, arg1 + local214, local2419, 150 - Static457.anIntArray440[local185], Static349.anInt6360, local2556);
					local337 -= local263 >> 1;
					local2447 += 7;
					local340 -= 7;
					local1146 -= local263 >> 1;
				}
				@Pc(2874) int local2874;
				if (Static457.anIntArray439[local185] == 4) {
					local2874 = (150 - Static457.anIntArray440[local185]) * (Static299.aClass247_11.method5759(local2419) - -100) / 150;
					Static208.aClass65_7.T(arg1 + local214 - 50, arg3, local214 + arg1 + 50, arg2 + arg3);
					local1146 += 50 - local2874;
					Static231.aClass73_8.method5773(arg3 + local1047, local2556, local2419, local214 + arg1 + 50 - local2874, -16777216);
					local337 += 50 - local2874;
					Static208.aClass65_7.KA(arg1, arg3, arg0 + arg1, arg3 + arg2);
				}
				if (Static457.anIntArray439[local185] == 5) {
					local2874 = 150 - Static457.anIntArray440[local185];
					local1191 = 0;
					if (local2874 < 25) {
						local1191 = local2874 - 25;
					} else if (local2874 > 125) {
						local1191 = local2874 - 125;
					}
					local1193 = Static299.aClass247_11.anInt6966 + Static299.aClass247_11.anInt6974;
					Static208.aClass65_7.T(arg1, arg3 + local1047 - local1193 - 1, arg1 + arg0, local1047 + arg3 + 5);
					local340 += local1191;
					local1146 -= local263 >> 1;
					local337 -= local263 >> 1;
					Static231.aClass73_8.method5781(local2419, local1047 + arg3 + local1191, local214 + arg1, -16777216, local2556);
					local2447 += local1191;
					Static208.aClass65_7.KA(arg1, arg3, arg1 + arg0, arg3 - -arg2);
				}
			} else {
				local1146 -= local263 >> 1;
				local337 -= local263 >> 1;
				Static231.aClass73_8.method5781(local2419, local1047 + arg3, arg1 - -local214, -16777216, -256);
			}
			Static520.method7366(local337, local2447 + 1, local340, local1146 + 1);
		}
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(Lclient!tia;II)Z")
	public static boolean method8114(@OriginalArg(0) Class5_Sub41_Sub2 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) int local8 = arg0.method7871(2);
		@Pc(28) int local28;
		@Pc(33) int local33;
		@Pc(100) int local100;
		@Pc(104) int local104;
		@Pc(110) int local110;
		if (local8 == 0) {
			if (arg0.method7871(1) != 0) {
				method8114(arg0, arg1);
			}
			local28 = arg0.method7871(6);
			local33 = arg0.method7871(6);
			@Pc(43) boolean local43 = arg0.method7871(1) == 1;
			if (local43) {
				Static675.anIntArray611[Static311.anInt5915++] = arg1;
			}
			if (Static351.aClass28_Sub1_Sub4_Sub2_Sub2Array2[arg1] != null) {
				throw new RuntimeException("hr:lr");
			}
			@Pc(66) Class33 local66 = Static95.aClass33Array8[arg1];
			@Pc(74) Class28_Sub1_Sub4_Sub2_Sub2 local74 = Static351.aClass28_Sub1_Sub4_Sub2_Sub2Array2[arg1] = new Class28_Sub1_Sub4_Sub2_Sub2();
			local74.anInt5512 = arg1;
			if (Static271.aClass5_Sub41Array2[arg1] != null) {
				local74.method4605(Static271.aClass5_Sub41Array2[arg1]);
			}
			local74.method4590(local66.anInt616, true);
			local74.anInt5500 = local66.anInt618;
			local100 = local66.anInt620;
			local104 = local100 >> 28;
			local110 = local100 >> 14 & 0xFF;
			@Pc(114) int local114 = local100 & 0xFF;
			@Pc(124) int local124 = (local110 << 6) + local28 - Static153.anInt3147;
			@Pc(132) int local132 = (local114 << 6) + (local33 - Static201.anInt3839);
			local74.aBoolean476 = local66.aBoolean42;
			local74.aBoolean475 = local66.aBoolean44;
			local74.aByteArray44[0] = Static598.aByteArray100[arg1];
			local74.aByte145 = local74.aByte144 = (byte) local104;
			if (Static599.method8200(local132, local124)) {
				local74.aByte144++;
			}
			local74.method4609(local132, local124);
			local74.aBoolean474 = false;
			Static95.aClass33Array8[arg1] = null;
			return true;
		} else if (local8 == 1) {
			local28 = arg0.method7871(2);
			local33 = Static95.aClass33Array8[arg1].anInt620;
			Static95.aClass33Array8[arg1].anInt620 = (local33 & 0xFFFFFFF) + ((local28 + (local33 >> 28) & 0x3) << 28);
			return false;
		} else {
			@Pc(230) int local230;
			@Pc(235) int local235;
			@Pc(244) int local244;
			if (local8 != 2) {
				local28 = arg0.method7871(18);
				local33 = local28 >> 16;
				local230 = local28 >> 8 & 0xFF;
				local235 = local28 & 0xFF;
				local244 = Static95.aClass33Array8[arg1].anInt620;
				local100 = (local244 >> 28) + local33 & 0x3;
				local104 = local230 + (local244 >> 14) & 0xFF;
				local110 = local244 + local235 & 0xFF;
				Static95.aClass33Array8[arg1].anInt620 = local110 + (local104 << 14) + (local100 << 28);
				return false;
			}
			local28 = arg0.method7871(5);
			local33 = local28 >> 3;
			local230 = local28 & 0x7;
			local235 = Static95.aClass33Array8[arg1].anInt620;
			local244 = (local235 >> 28) + local33 & 0x3;
			local100 = local235 >> 14 & 0xFF;
			local104 = local235 & 0xFF;
			if (local230 == 0) {
				local100--;
				local104--;
			}
			if (local230 == 1) {
				local104--;
			}
			if (local230 == 2) {
				local104--;
				local100++;
			}
			if (local230 == 3) {
				local100--;
			}
			if (local230 == 4) {
				local100++;
			}
			if (local230 == 5) {
				local104++;
				local100--;
			}
			if (local230 == 6) {
				local104++;
			}
			if (local230 == 7) {
				local104++;
				local100++;
			}
			Static95.aClass33Array8[arg1].anInt620 = (local244 << 28) + (local100 << 14) + local104;
			return false;
		}
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(IB)Z")
	public static boolean method8116(@OriginalArg(0) int arg0) {
		if (arg0 == 15 || arg0 == 46 || arg0 == 23 || arg0 == 13 || arg0 == 1002) {
			return true;
		} else {
			return arg0 == 53 || arg0 == 1009;
		}
	}
}
