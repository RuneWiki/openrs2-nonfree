import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static195 {

	@OriginalMember(owner = "client!mf", name = "M", descriptor = "Lclient!pm;")
	public static final Class159 aClass159_216 = new Class159("Loaded interfaces", "Benutzeroberfläche geladen.", "Interfaces chargées", "Interfaces carregadas");

	@OriginalMember(owner = "client!mf", name = "W", descriptor = "Z")
	public static volatile boolean aBoolean315 = true;

	@OriginalMember(owner = "client!mf", name = "ab", descriptor = "I")
	public static int anInt4097 = 100;

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(Lclient!hl;I)V")
	public static void method3689(@OriginalArg(0) Class8_Sub1_Sub2 arg0) {
		arg0.aBoolean374 = false;
		@Pc(18) Class14 local18;
		if (arg0.anInt4937 != -1) {
			local18 = Static225.method4042(arg0.anInt4937);
			if (local18 == null || local18.anIntArray12 == null) {
				arg0.anInt4937 = -1;
				arg0.aBoolean371 = false;
			} else {
				label297: {
					arg0.anInt4913++;
					if (local18.anIntArray12.length > arg0.anInt4921 && arg0.anInt4913 > local18.anIntArray11[arg0.anInt4921]) {
						arg0.anInt4921++;
						arg0.anInt4913 = 1;
						arg0.anInt4920++;
						Static167.method3265(arg0.anInt6701, arg0.anInt6702, arg0.anInt4921, arg0 == Static158.aClass8_Sub1_Sub2_Sub1_1, local18);
					}
					if (arg0.anInt4921 >= local18.anIntArray12.length) {
						arg0.anInt4921 = 0;
						arg0.anInt4913 = 0;
						if (arg0.aBoolean371) {
							arg0.anInt4937 = arg0.method4347().method1178();
							if (arg0.anInt4937 == -1) {
								arg0.aBoolean371 = false;
								break label297;
							}
							local18 = Static225.method4042(arg0.anInt4937);
						}
						Static167.method3265(arg0.anInt6701, arg0.anInt6702, arg0.anInt4921, arg0 == Static158.aClass8_Sub1_Sub2_Sub1_1, local18);
					}
					arg0.anInt4920 = arg0.anInt4921 + 1;
					if (local18.anIntArray12.length <= arg0.anInt4920) {
						arg0.anInt4920 = 0;
					}
				}
			}
		}
		@Pc(183) Class14 local183;
		if (arg0.anInt4972 != -1 && Static199.anInt4137 >= arg0.anInt4919) {
			@Pc(172) Class5 local172 = Static116.method2427(arg0.anInt4972);
			@Pc(175) int local175 = local172.anInt101;
			if (local175 == -1) {
				arg0.anInt4972 = -1;
			} else {
				label299: {
					local183 = Static225.method4042(local175);
					if (local172.aBoolean11) {
						if (local183.anInt361 == 3) {
							if (arg0.anInt4981 > 0 && Static199.anInt4137 >= arg0.anInt4958 && arg0.anInt4922 < Static199.anInt4137) {
								arg0.anInt4972 = -1;
								break label299;
							}
						} else if (local183.anInt361 == 1 && arg0.anInt4981 > 0 && Static199.anInt4137 >= arg0.anInt4958 && arg0.anInt4922 < Static199.anInt4137) {
							arg0.anInt4919 = Static199.anInt4137 + 1;
							break label299;
						}
					}
					if (local183 == null || local183.anIntArray12 == null) {
						arg0.anInt4972 = -1;
					} else {
						if (arg0.anInt4971 < 0) {
							arg0.anInt4971 = 0;
							Static167.method3265(arg0.anInt6701, arg0.anInt6702, 0, arg0 == Static158.aClass8_Sub1_Sub2_Sub1_1, local183);
						}
						arg0.anInt4949++;
						if (arg0.anInt4971 < local183.anIntArray12.length && local183.anIntArray11[arg0.anInt4971] < arg0.anInt4949) {
							arg0.anInt4949 = 1;
							arg0.anInt4971++;
							Static167.method3265(arg0.anInt6701, arg0.anInt6702, arg0.anInt4971, arg0 == Static158.aClass8_Sub1_Sub2_Sub1_1, local183);
						}
						if (local183.anIntArray12.length <= arg0.anInt4971) {
							if (local172.aBoolean11) {
								arg0.anInt4944++;
								arg0.anInt4971 -= local183.anInt348;
								if (arg0.anInt4944 >= local183.anInt357) {
									arg0.anInt4972 = -1;
								} else if (arg0.anInt4971 >= 0 && arg0.anInt4971 < local183.anIntArray12.length) {
									Static167.method3265(arg0.anInt6701, arg0.anInt6702, arg0.anInt4971, Static158.aClass8_Sub1_Sub2_Sub1_1 == arg0, local183);
								} else {
									arg0.anInt4972 = -1;
								}
							} else {
								arg0.anInt4972 = -1;
							}
						}
						arg0.anInt4980 = arg0.anInt4971 + 1;
						if (local183.anIntArray12.length <= arg0.anInt4980) {
							if (local172.aBoolean11) {
								arg0.anInt4980 -= local183.anInt348;
								if (local183.anInt357 <= arg0.anInt4944 + 1) {
									arg0.anInt4980 = -1;
								} else if (arg0.anInt4980 < 0 || arg0.anInt4980 >= local183.anIntArray12.length) {
									arg0.anInt4980 = -1;
								}
							} else {
								arg0.anInt4980 = -1;
							}
						}
					}
				}
			}
		}
		if (arg0.anInt4954 != -1 && arg0.anInt4935 <= 1) {
			local18 = Static225.method4042(arg0.anInt4954);
			if (local18.anInt361 == 3) {
				if (arg0.anInt4981 > 0 && arg0.anInt4958 <= Static199.anInt4137 && Static199.anInt4137 > arg0.anInt4922) {
					arg0.anInt4954 = -1;
				}
			} else if (local18.anInt361 == 1 && arg0.anInt4981 > 0 && arg0.anInt4958 <= Static199.anInt4137 && Static199.anInt4137 > arg0.anInt4922) {
				arg0.anInt4935 = 2;
			}
		}
		if (arg0.anInt4954 != -1 && arg0.anInt4935 == 0) {
			local18 = Static225.method4042(arg0.anInt4954);
			if (local18 == null || local18.anIntArray12 == null) {
				arg0.anInt4954 = -1;
			} else {
				arg0.anInt4945++;
				if (arg0.anInt4961 < local18.anIntArray12.length && arg0.anInt4945 > local18.anIntArray11[arg0.anInt4961]) {
					arg0.anInt4945 = 1;
					arg0.anInt4961++;
					Static167.method3265(arg0.anInt6701, arg0.anInt6702, arg0.anInt4961, arg0 == Static158.aClass8_Sub1_Sub2_Sub1_1, local18);
				}
				if (arg0.anInt4961 >= local18.anIntArray12.length) {
					arg0.anInt4959++;
					arg0.anInt4961 -= local18.anInt348;
					if (local18.anInt357 <= arg0.anInt4959) {
						arg0.anInt4954 = -1;
					} else if (arg0.anInt4961 >= 0 && local18.anIntArray12.length > arg0.anInt4961) {
						Static167.method3265(arg0.anInt6701, arg0.anInt6702, arg0.anInt4961, arg0 == Static158.aClass8_Sub1_Sub2_Sub1_1, local18);
					} else {
						arg0.anInt4954 = -1;
					}
				}
				arg0.anInt4969 = arg0.anInt4961 + 1;
				if (local18.anIntArray12.length <= arg0.anInt4969) {
					arg0.anInt4969 -= local18.anInt348;
					if (arg0.anInt4959 + 1 >= local18.anInt357) {
						arg0.anInt4969 = -1;
					} else if (arg0.anInt4969 < 0 || arg0.anInt4969 >= local18.anIntArray12.length) {
						arg0.anInt4969 = -1;
					}
				}
				arg0.aBoolean374 = local18.aBoolean32;
			}
		}
		if (arg0.anInt4935 > 0) {
			arg0.anInt4935--;
		}
		for (@Pc(710) int local710 = 0; local710 < arg0.aClass202Array3.length; local710++) {
			@Pc(717) Class202 local717 = arg0.aClass202Array3[local710];
			if (local717 != null) {
				if (local717.anInt6229 > 0) {
					local717.anInt6229--;
				} else {
					local183 = Static225.method4042(local717.anInt6226);
					if (local183 == null || local183.anIntArray12 == null) {
						arg0.aClass202Array3[local710] = null;
					} else {
						local717.anInt6227++;
						if (local183.anIntArray12.length > local717.anInt6233 && local183.anIntArray11[local717.anInt6233] < local717.anInt6227) {
							local717.anInt6227 = 1;
							local717.anInt6233++;
							Static167.method3265(arg0.anInt6701, arg0.anInt6702, local717.anInt6233, Static158.aClass8_Sub1_Sub2_Sub1_1 == arg0, local183);
						}
						if (local183.anIntArray12.length <= local717.anInt6233) {
							local717.anInt6233 -= local183.anInt348;
							local717.anInt6230++;
							if (local717.anInt6230 >= local183.anInt357) {
								arg0.aClass202Array3[local710] = null;
							} else if (local717.anInt6233 >= 0 && local717.anInt6233 < local183.anIntArray12.length) {
								Static167.method3265(arg0.anInt6701, arg0.anInt6702, local717.anInt6233, Static158.aClass8_Sub1_Sub2_Sub1_1 == arg0, local183);
							} else {
								arg0.aClass202Array3[local710] = null;
							}
						}
						local717.anInt6228 = local717.anInt6233 + 1;
						if (local717.anInt6228 >= local183.anIntArray12.length) {
							local717.anInt6228 -= local183.anInt348;
							if (local717.anInt6230 + 1 >= local183.anInt357) {
								local717.anInt6228 = -1;
							} else if (local717.anInt6228 < 0 || local183.anIntArray12.length <= local717.anInt6228) {
								local717.anInt6228 = -1;
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(IIII)V")
	public static void method3692(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(8) Class4_Sub4_Sub18 local8 = Static302.method4961(arg1, 9);
		local8.method4908();
		local8.anInt5703 = arg2;
		local8.anInt5705 = arg0;
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "([II[III)V")
	public static void method3693(@OriginalArg(0) int[] arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg3 <= arg2) {
			return;
		}
		@Pc(19) int local19 = (arg2 + arg3) / 2;
		@Pc(21) int local21 = arg2;
		@Pc(25) int local25 = arg0[local19];
		arg0[local19] = arg0[arg3];
		arg0[arg3] = local25;
		@Pc(39) int local39 = arg1[local19];
		arg1[local19] = arg1[arg3];
		arg1[arg3] = local39;
		for (@Pc(51) int local51 = arg2; local51 < arg3; local51++) {
			if (local25 + (local51 & 0x1) > arg0[local51]) {
				@Pc(71) int local71 = arg0[local51];
				arg0[local51] = arg0[local21];
				arg0[local21] = local71;
				@Pc(85) int local85 = arg1[local51];
				arg1[local51] = arg1[local21];
				arg1[local21++] = local85;
			}
		}
		arg0[arg3] = arg0[local21];
		arg0[local21] = local25;
		arg1[arg3] = arg1[local21];
		arg1[local21] = local39;
		method3693(arg0, arg1, arg2, local21 - 1);
		method3693(arg0, arg1, local21 + 1, arg3);
	}

	@OriginalMember(owner = "client!mf", name = "c", descriptor = "(I)V")
	public static void method3694() {
		Static278.aClass198_246.method5209();
	}

	@OriginalMember(owner = "client!mf", name = "e", descriptor = "(I)V")
	public static void method3696() {
		Static349.method5536(Static103.aClass21_5);
		Static205.anInt4303++;
		if (Static284.aBoolean419 && Static211.aBoolean343) {
			@Pc(26) int local26 = Static258.aClass127_1.method3588();
			@Pc(30) int local30 = Static258.aClass127_1.method3595();
			local30 -= Static173.anInt3682;
			local26 -= Static70.anInt1828;
			@Pc(46) int local46;
			@Pc(51) int local51;
			if (Static205.anInt4303 > Static103.aClass21_5.anInt785) {
				local46 = local26 - Static190.anInt3975;
				local51 = local30 - Static169.anInt3600;
				if (Static103.aClass21_5.anInt782 < local46 || local46 < -Static103.aClass21_5.anInt782 || Static103.aClass21_5.anInt782 < local51 || -Static103.aClass21_5.anInt782 > local51) {
					Static176.aBoolean141 = true;
				}
			}
			if (local26 < Static320.anInt6196) {
				local26 = Static320.anInt6196;
			}
			if (local30 < Static241.anInt4874) {
				local30 = Static241.anInt4874;
			}
			if (Static320.anInt6196 + Static182.aClass21_11.anInt740 < local26 - -Static103.aClass21_5.anInt740) {
				local26 = Static320.anInt6196 + Static182.aClass21_11.anInt740 - Static103.aClass21_5.anInt740;
			}
			if (Static182.aClass21_11.anInt758 + Static241.anInt4874 < local30 - -Static103.aClass21_5.anInt758) {
				local30 = Static241.anInt4874 + Static182.aClass21_11.anInt758 - Static103.aClass21_5.anInt758;
			}
			local46 = local26 + Static182.aClass21_11.anInt790 - Static320.anInt6196;
			local51 = Static182.aClass21_11.anInt736 + local30 - Static241.anInt4874;
			if (Static103.aClass21_5.anObjectArray20 != null && Static176.aBoolean141) {
				@Pc(173) Class4_Sub34 local173 = new Class4_Sub34();
				local173.anInt4867 = local46;
				local173.anInt4876 = local51;
				local173.aClass21_12 = Static103.aClass21_5;
				local173.anObjectArray34 = Static103.aClass21_5.anObjectArray20;
				Static164.method3189(local173);
			}
			if (!Static258.aClass127_1.method3592()) {
				if (Static176.aBoolean141) {
					if (Static103.aClass21_5.anObjectArray19 != null) {
						@Pc(245) Class4_Sub34 local245 = new Class4_Sub34();
						local245.aClass21_13 = Static181.aClass21_9;
						local245.aClass21_12 = Static103.aClass21_5;
						local245.anInt4867 = local46;
						local245.anObjectArray34 = Static103.aClass21_5.anObjectArray19;
						local245.anInt4876 = local51;
						Static164.method3189(local245);
					}
					if (Static181.aClass21_9 != null && Static44.method883(Static103.aClass21_5) != null) {
						Static332.method5380(Static181.aClass21_9, Static103.aClass21_5);
					}
				} else if ((Static321.anInt4799 == 1 || Static121.method4351()) && Static105.anInt2645 > 2) {
					Static265.method4580(Static70.anInt1828 + Static190.anInt3975, Static169.anInt3600 + Static173.anInt3682, 2);
				} else if (Static222.method4008()) {
					Static265.method4580(Static190.anInt3975 + Static70.anInt1828, Static169.anInt3600 + Static173.anInt3682, 0);
				}
				Static103.aClass21_5 = null;
			}
		} else if (Static205.anInt4303 > 1) {
			Static103.aClass21_5 = null;
		}
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(ZLjava/awt/Component;)Lclient!io;")
	public static Class92 method3697(@OriginalArg(1) Component arg0) {
		return new Class92_Sub1(arg0);
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(IIZII)V")
	public static void method3698(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3) {
		Static155.aLong97 = 0L;
		@Pc(8) int local8 = Static35.method713();
		if (arg1 == 3 || local8 == 3) {
			arg2 = true;
		}
		if (!Static274.aClass47_9.method2670()) {
			arg2 = true;
		}
		Static151.method2875(arg0, arg1, arg3, arg2, local8);
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(IIIIIII)V")
	public static void method3699(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(4) int arg2, @OriginalArg(6) int arg3) {
		Static33.anInt819 = 0;
		@Pc(175) int local175;
		@Pc(218) int local218;
		@Pc(383) int local383;
		@Pc(500) int local500;
		@Pc(271) int local271;
		@Pc(618) int local618;
		@Pc(439) int local439;
		for (@Pc(13) int local13 = -1; local13 < Static145.anInt3273 + Static289.anInt5643; local13++) {
			@Pc(17) Class141 local17 = null;
			@Pc(21) Class8_Sub1_Sub2 local21;
			if (local13 < 0) {
				local21 = Static158.aClass8_Sub1_Sub2_Sub1_1;
			} else if (Static289.anInt5643 > local13) {
				local21 = Static327.aClass8_Sub1_Sub2_Sub1Array1[Static333.anIntArray494[local13]];
			} else {
				local21 = Static169.aClass8_Sub1_Sub2_Sub2Array1[Static354.anIntArray510[local13 - Static289.anInt5643]];
				local17 = ((Class8_Sub1_Sub2_Sub2) local21).aClass141_1;
				if (local17.anIntArray380 != null) {
					local17 = local17.method3908();
					if (local17 == null) {
						continue;
					}
				}
			}
			if (local21.anInt4930 >= 0) {
				Static315.method5197(local21.method4344(), arg0 >> 1, arg2 >> 1, local21);
				if (Static185.anIntArray328[0] >= 0) {
					if (local21.aString55 != null && (local13 >= Static289.anInt5643 || Static127.anInt3000 == 0 || Static127.anInt3000 == 3 || Static127.anInt3000 == 1 && Static257.method4482(((Class8_Sub1_Sub2_Sub1) local21).aString24)) && Static212.anInt2921 > Static33.anInt819) {
						Static212.anIntArray257[Static33.anInt819] = Static348.aClass16_8.method327(local21.aString55) / 2;
						Static212.anIntArray256[Static33.anInt819] = Static185.anIntArray328[0];
						Static212.anIntArray258[Static33.anInt819] = Static185.anIntArray328[1];
						Static212.anIntArray253[Static33.anInt819] = local21.anInt4933;
						Static212.anIntArray259[Static33.anInt819] = local21.anInt4956;
						Static212.anIntArray254[Static33.anInt819] = local21.anInt4931;
						Static212.aStringArray36[Static33.anInt819] = local21.aString55;
						Static33.anInt819++;
					}
					@Pc(162) Class58 local162 = Static186.aClass58Array74[0];
					local175 = arg1 + Static185.anIntArray328[1] - Math.max(Static348.aClass16_8.anInt382, local162.method4274());
					@Pc(186) Class58 local186;
					@Pc(283) int local283;
					if (!local21.aBoolean373 && Static199.anInt4137 < local21.anInt4973) {
						local186 = Static186.aClass58Array74[1];
						if (local21 instanceof Class8_Sub1_Sub2_Sub2) {
							@Pc(192) Class8_Sub1_Sub2_Sub2 local192 = (Class8_Sub1_Sub2_Sub2) local21;
							@Pc(201) Class58[] local201 = (Class58[]) Static248.aClass198_182.method5210((long) local192.aClass141_1.anInt4386);
							if (local201 == null) {
								@Pc(210) Class110[] local210 = Static362.method3088(Static316.aClass193_99, local192.aClass141_1.anInt4386);
								if (local210 != null) {
									local201 = new Class58[local210.length];
									for (local218 = 0; local218 < local210.length; local218++) {
										local201[local218] = Static274.aClass47_9.method2677(local210[local218]);
									}
									Static248.aClass198_182.method5201(local201, (long) local192.aClass141_1.anInt4386);
								}
							}
							if (local201 != null && local201.length == 2) {
								local162 = local201[0];
								local186 = local201[1];
							}
						}
						local271 = arg3 + Static185.anIntArray328[0] - (local162.method4279() >> 1);
						local162.method4269(local271, local175);
						local283 = local162.method4279() * local21.anInt4960 / 255;
						Static274.aClass47_9.method2681(local271, local175, local271 + local283, local175 + local162.method4274());
						local186.method4269(local271, local175);
						Static274.aClass47_9.method2709(arg3, arg1, arg2 + arg3, arg0 + arg1);
					}
					local175 -= 2;
					if (!local21.aBoolean373) {
						if (Static199.anInt4137 < local21.anInt4970) {
							local186 = Static106.aClass58Array43[local21.aBoolean370 ? 2 : 0];
							@Pc(334) Class58 local334 = Static106.aClass58Array43[local21.aBoolean370 ? 3 : 1];
							if (local21 instanceof Class8_Sub1_Sub2_Sub2) {
								local283 = local17.anInt4367;
								if (local283 == -1) {
									local283 = local21.method4347().anInt1459;
								}
							} else {
								local283 = local21.method4347().anInt1459;
							}
							if (local283 != -1) {
								@Pc(368) Class58[] local368 = (Class58[]) Static172.aClass198_133.method5210((long) local283);
								if (local368 == null) {
									@Pc(375) Class110[] local375 = Static362.method3088(Static316.aClass193_99, local283);
									if (local375 != null) {
										local368 = new Class58[local375.length];
										for (local383 = 0; local383 < local375.length; local383++) {
											local368[local383] = Static274.aClass47_9.method2677(local375[local383]);
										}
										Static172.aClass198_133.method5201(local368, (long) local283);
									}
								}
								if (local368 != null && local368.length == 4) {
									local334 = local368[local21.aBoolean370 ? 3 : 1];
									local186 = local368[local21.aBoolean370 ? 2 : 0];
								}
							}
							local439 = local21.anInt4970 - Static199.anInt4137;
							if (local439 <= local21.anInt4965) {
								local218 = local186.method4279();
							} else {
								local439 -= local21.anInt4965;
								local383 = local21.anInt4977 == 0 ? 0 : (local21.lb - local439) / local21.anInt4977 * local21.anInt4977;
								local218 = local186.method4279() * local383 / local21.lb;
							}
							local383 = local186.method4274();
							local175 -= local383;
							local500 = Static185.anIntArray328[0] + arg3 - (local186.method4279() >> 1);
							local186.method4269(local500, local175);
							Static274.aClass47_9.method2681(local500, local175, local218 + local500, local383 + local175);
							local334.method4269(local500, local175);
							Static274.aClass47_9.method2709(arg3, arg1, arg3 + arg2, arg1 + arg0);
							local175 -= 2;
						}
						if (local13 < Static289.anInt5643) {
							@Pc(573) Class8_Sub1_Sub2_Sub1 local573 = (Class8_Sub1_Sub2_Sub1) local21;
							if (local573.anInt2377 != -1) {
								local175 -= 25;
								Static233.aClass58Array92[local573.anInt2377].method4269(Static185.anIntArray328[0] + arg3 - 12, local175);
								local175 -= 2;
							}
							if (local573.anInt2355 != -1) {
								local175 -= 25;
								Static138.aClass58Array54[local573.anInt2355].method4269(Static185.anIntArray328[0] + arg3 - 12, local175);
								local175 -= 2;
							}
						} else if (local17.anInt4370 >= 0 && local17.anInt4370 < Static138.aClass58Array54.length) {
							local175 -= 25;
							local186 = Static138.aClass58Array54[local17.anInt4370];
							local186.method4269(Static185.anIntArray328[0] + arg3 - (local186.method4279() >> 1), local175);
							local175 -= 2;
						}
					}
					@Pc(620) Class187[] local620;
					@Pc(628) Class187 local628;
					@Pc(654) Class58 local654;
					if (!(local21 instanceof Class8_Sub1_Sub2_Sub1)) {
						local618 = 0;
						local620 = Static116.aClass187Array1;
						for (local283 = 0; local283 < local620.length; local283++) {
							local628 = local620[local283];
							if (local628 != null && local628.anInt5730 == 1 && local628.anInt5734 == Static354.anIntArray510[local13 - Static289.anInt5643]) {
								local654 = Static348.aClass58Array134[local628.anInt5733];
								if (local654.method4274() > local618) {
									local618 = local654.method4274();
								}
								if (Static199.anInt4137 % 20 < 10) {
									local654.method4269(Static185.anIntArray328[0] + arg3 - 12, -local654.method4274() + local175);
								}
							}
						}
						if (local618 > 0) {
						}
					} else if (local13 >= 0) {
						local618 = 0;
						local620 = Static116.aClass187Array1;
						for (local283 = 0; local283 < local620.length; local283++) {
							local628 = local620[local283];
							if (local628 != null && local628.anInt5730 == 10 && Static333.anIntArray494[local13] == local628.anInt5734) {
								local654 = Static348.aClass58Array134[local628.anInt5733];
								if (local618 < local654.method4274()) {
									local618 = local654.method4274();
								}
								local654.method4269(arg3 + Static185.anIntArray328[0] - 12, local175 - local654.method4274());
							}
						}
						if (local618 > 0) {
						}
					}
					for (local618 = 0; local618 < 4; local618++) {
						if (Static199.anInt4137 < local21.anIntArray413[local618]) {
							local271 = local21.method4344() / 2;
							Static315.method5197(local271, arg0 >> 1, arg2 >> 1, local21);
							if (Static185.anIntArray328[0] > -1) {
								if (local618 == 1) {
									Static185.anIntArray328[1] -= 20;
								}
								if (local618 == 2) {
									Static185.anIntArray328[1] -= 10;
									Static185.anIntArray328[0] -= 15;
								}
								if (local618 == 3) {
									Static185.anIntArray328[0] += 15;
									Static185.anIntArray328[1] -= 10;
								}
								Static354.aClass58Array137[local21.anIntArray414[local618]].method4269(Static185.anIntArray328[0] + arg3 - 12, arg1 - -Static185.anIntArray328[1] - 12);
								Static63.aClass51_1.method4233(-1, arg1 + Static185.anIntArray328[1] + 3, Integer.toString(local21.anIntArray412[local618]), 0, arg3 + Static185.anIntArray328[0] - 1);
							}
						}
					}
				}
			}
		}
		@Pc(930) int local930;
		for (@Pc(924) int local924 = 0; local924 < Static81.anInt2141; local924++) {
			local930 = Static136.anIntArray272[local924];
			@Pc(939) Class8_Sub1_Sub2 local939;
			if (local930 < 2048) {
				local939 = Static327.aClass8_Sub1_Sub2_Sub1Array1[local930];
			} else {
				local939 = Static169.aClass8_Sub1_Sub2_Sub2Array1[local930 - 2048];
			}
			local175 = Static297.anIntArray459[local924];
			@Pc(960) Class8_Sub1_Sub2 local960;
			if (local175 < 2048) {
				local960 = Static327.aClass8_Sub1_Sub2_Sub1Array1[local175];
			} else {
				local960 = Static169.aClass8_Sub1_Sub2_Sub2Array1[local175 - 2048];
			}
			Static99.method2242(local960, arg2, arg1, arg3, local939, --local939.anInt4927, arg0);
		}
		local930 = Static348.aClass16_8.anInt382 + Static348.aClass16_8.anInt383 + 2;
		for (@Pc(1003) int local1003 = 0; local1003 < Static33.anInt819; local1003++) {
			local175 = Static212.anIntArray256[local1003];
			local618 = Static212.anIntArray258[local1003];
			local271 = Static212.anIntArray257[local1003];
			@Pc(1019) boolean local1019 = true;
			while (local1019) {
				local1019 = false;
				for (local439 = 0; local439 < local1003; local439++) {
					if (Static212.anIntArray258[local439] - local930 < local618 + 2 && Static212.anIntArray258[local439] + 2 > -local930 + local618 && local175 - local271 < Static212.anIntArray256[local439] + Static212.anIntArray257[local439] && local271 + local175 > Static212.anIntArray256[local439] + -Static212.anIntArray257[local439] && Static212.anIntArray258[local439] - local930 < local618) {
						local1019 = true;
						local618 = Static212.anIntArray258[local439] - local930;
					}
				}
			}
			Static212.anIntArray258[local1003] = local618;
			@Pc(1113) String local1113 = Static212.aStringArray36[local1003];
			if (Static191.anInt4020 == 0) {
				local218 = 16776960;
				if (Static212.anIntArray253[local1003] < 6) {
					local218 = Static240.anIntArray406[Static212.anIntArray253[local1003]];
				}
				if (Static212.anIntArray253[local1003] == 6) {
					local218 = Static357.anInt6820 % 20 >= 10 ? 16776960 : 16711680;
				}
				if (Static212.anIntArray253[local1003] == 7) {
					local218 = Static357.anInt6820 % 20 < 10 ? 255 : 65535;
				}
				if (Static212.anIntArray253[local1003] == 8) {
					local218 = Static357.anInt6820 % 20 >= 10 ? 8454016 : 45056;
				}
				if (Static212.anIntArray253[local1003] == 9) {
					local383 = 150 - Static212.anIntArray254[local1003];
					if (local383 < 50) {
						local218 = local383 * 1280 + 16711680;
					} else if (local383 < 100) {
						local218 = 16776960 - (local383 - 50) * 327680;
					} else if (local383 < 150) {
						local218 = (local383 - 100) * 5 + 65280;
					}
				}
				if (Static212.anIntArray253[local1003] == 10) {
					local383 = 150 - Static212.anIntArray254[local1003];
					if (local383 < 50) {
						local218 = local383 * 5 + 16711680;
					} else if (local383 < 100) {
						local218 = 16711935 - (local383 - 50) * 327680;
					} else if (local383 < 150) {
						local218 = (local383 - 100) * 327680 + 500 + 255 - local383 * 5;
					}
				}
				if (Static212.anIntArray253[local1003] == 11) {
					local383 = 150 - Static212.anIntArray254[local1003];
					if (local383 < 50) {
						local218 = 16777215 - local383 * 327685;
					} else if (local383 < 100) {
						local218 = (local383 - 50) * 327685 + 65280;
					} else if (local383 < 150) {
						local218 = 49545215 - local383 * 327680;
					}
				}
				local383 = local218 | 0xFF000000;
				if (Static212.anIntArray259[local1003] == 0) {
					Static282.aClass51_4.method4233(local383, local618 + arg1, local1113, -16777216, arg3 + local175);
				}
				if (Static212.anIntArray259[local1003] == 1) {
					Static282.aClass51_4.method4245(local383, arg3 + local175, local1113, Static357.anInt6820, local618 + arg1);
				}
				if (Static212.anIntArray259[local1003] == 2) {
					Static282.aClass51_4.method4242(local1113, local175 + arg3, local383, Static357.anInt6820, arg1 + local618);
				}
				if (Static212.anIntArray259[local1003] == 3) {
					Static282.aClass51_4.method4239(local1113, 150 - Static212.anIntArray254[local1003], local618 + arg1, Static357.anInt6820, local383, arg3 + local175);
				}
				if (Static212.anIntArray259[local1003] == 4) {
					local500 = (150 - Static212.anIntArray254[local1003]) * (Static348.aClass16_8.method327(local1113) + 100) / 150;
					Static274.aClass47_9.method2681(local175 + arg3 - 50, arg1, local175 + arg3 + 50, arg0 + arg1);
					Static282.aClass51_4.method4237(local383, -16777216, arg3 + local175 + 50 - local500, local1113, arg1 + local618);
					Static274.aClass47_9.method2709(arg3, arg1, arg2 + arg3, arg0 + arg1);
				}
				if (Static212.anIntArray259[local1003] == 5) {
					local500 = 150 - Static212.anIntArray254[local1003];
					@Pc(1506) int local1506 = 0;
					if (local500 < 25) {
						local1506 = local500 - 25;
					} else if (local500 > 125) {
						local1506 = local500 - 125;
					}
					@Pc(1529) int local1529 = Static348.aClass16_8.anInt382 + Static348.aClass16_8.anInt383;
					Static274.aClass47_9.method2681(arg3, local618 + arg1 - local1529 - 1, arg3 - -arg2, local618 + arg1 + 5);
					Static282.aClass51_4.method4233(local383, arg1 + local618 + local1506, local1113, -16777216, arg3 + local175);
					Static274.aClass47_9.method2709(arg3, arg1, arg2 + arg3, arg1 + arg0);
				}
			} else {
				Static282.aClass51_4.method4233(-256, local618 + arg1, local1113, -16777216, arg3 + local175);
			}
		}
	}
}
