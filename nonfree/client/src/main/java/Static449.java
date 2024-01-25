import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static449 {

	@OriginalMember(owner = "client!oca", name = "b", descriptor = "(I)V")
	public static void method6664() {
		@Pc(1) Class338 local1 = Static595.aClass338_57;
		synchronized (Static595.aClass338_57) {
			Static595.aClass338_57.method8047();
		}
	}

	@OriginalMember(owner = "client!oca", name = "a", descriptor = "(Lclient!rba;I)Lclient!vk;")
	public static Class14 method6665(@OriginalArg(0) Class3_Sub28 arg0) {
		@Pc(7) int local7 = arg0.method5272();
		@Pc(20) Class304 local20 = Static24.method9444()[arg0.method5322(-112)];
		@Pc(27) Class216 local27 = Static133.method2912()[arg0.method5322(-94)];
		@Pc(31) int local31 = arg0.method5281();
		@Pc(35) int local35 = arg0.method5281();
		return new Class14(local7, local20, local27, local31, local35);
	}

	@OriginalMember(owner = "client!oca", name = "a", descriptor = "(Lclient!wg;I)Z")
	public static boolean method6667(@OriginalArg(0) Class400 arg0) throws IOException {
		@Pc(8) Class255 local8 = arg0.aClass255_2;
		@Pc(11) Class3_Sub28_Sub2 local11 = arg0.aClass3_Sub28_Sub2_2;
		if (local8 == null) {
			return false;
		}
		@Pc(102) int local102;
		if (arg0.aClass186_196 == null) {
			if (arg0.aBoolean796) {
				if (!local8.method6264(1)) {
					return false;
				}
				local8.method6260(1, arg0.aClass3_Sub28_Sub2_2.aByteArray50, 0);
				arg0.aBoolean796 = false;
				arg0.anInt11056++;
				arg0.anInt11055 = 0;
			}
			local11.anInt6241 = 0;
			if (local11.method5339()) {
				if (!local8.method6264(1)) {
					return false;
				}
				local8.method6260(1, arg0.aClass3_Sub28_Sub2_2.aByteArray50, 1);
				arg0.anInt11056++;
				arg0.anInt11055 = 0;
			}
			arg0.aBoolean796 = true;
			@Pc(98) Class186[] local98 = Static710.method9253();
			local102 = local11.method5347();
			if (local102 < 0 || local98.length <= local102) {
				throw new IOException("invo:" + local102 + " ip:" + local11.anInt6241);
			}
			arg0.aClass186_196 = local98[local102];
			arg0.anInt11061 = arg0.aClass186_196.anInt5472;
		}
		if (arg0.anInt11061 == -1) {
			if (!local8.method6264(1)) {
				return false;
			}
			local8.method6260(1, local11.aByteArray50, 0);
			arg0.anInt11056++;
			arg0.anInt11055 = 0;
			arg0.anInt11061 = local11.aByteArray50[0] & 0xFF;
		}
		if (arg0.anInt11061 == -2) {
			if (!local8.method6264(2)) {
				return false;
			}
			local8.method6260(2, local11.aByteArray50, 0);
			local11.anInt6241 = 0;
			arg0.anInt11061 = local11.method5272();
			arg0.anInt11056 += 2;
			arg0.anInt11055 = 0;
		}
		if (arg0.anInt11061 > 0) {
			if (!local8.method6264(arg0.anInt11061)) {
				return false;
			}
			local11.anInt6241 = 0;
			local8.method6260(arg0.anInt11061, local11.aByteArray50, 0);
			arg0.anInt11056 += arg0.anInt11061;
			arg0.anInt11055 = 0;
		}
		arg0.aClass186_195 = arg0.aClass186_194;
		arg0.aClass186_194 = arg0.aClass186_197;
		arg0.aClass186_197 = arg0.aClass186_196;
		@Pc(292) int local292;
		@Pc(284) int local284;
		@Pc(294) String local294;
		@Pc(296) String local296;
		@Pc(322) String local322;
		if (Static197.aClass186_62 == arg0.aClass186_196) {
			local284 = local11.method5331();
			local102 = local11.method5312();
			local292 = local11.method5322(-32);
			local294 = "";
			local296 = local294;
			if ((local292 & 0x1) != 0) {
				local294 = local11.method5295();
				if ((local292 & 0x2) == 0) {
					local296 = local294;
				} else {
					local296 = local11.method5295();
				}
			}
			local322 = local11.method5295();
			if (local284 == 99) {
				Static269.method4123(local322);
			} else if (local284 == 98) {
				Static379.method5699(local322);
			} else if (local296.equals("") || !Static517.method7376(local296)) {
				Static170.method2681(local294, local284, local102, local322, local294, local296);
			} else {
				arg0.aClass186_196 = null;
				return true;
			}
			arg0.aClass186_196 = null;
			return true;
		} else if (arg0.aClass186_196 == Static105.aClass186_29) {
			local284 = local11.method5312();
			Static183.aClass201_5 = Static310.aClass47_4.method949(local284);
			arg0.aClass186_196 = null;
			return true;
		} else if (arg0.aClass186_196 == Static252.aClass186_84) {
			local284 = local11.method5312();
			local102 = local11.method5323();
			local292 = local11.method5272();
			Static527.method7469();
			if (local292 == 65535) {
				local292 = -1;
			}
			Static167.method2671(local284, local102, local292);
			@Pc(429) Class91 local429 = Static243.aClass406_2.method9394(local292);
			Static682.method9021(local429.anInt2687, local429.anInt2688, local429.anInt2685, local102);
			Static480.method7027(local429.anInt2726, local429.anInt2708, local429.anInt2704, local102);
			arg0.aClass186_196 = null;
			return true;
		} else if (arg0.aClass186_196 == Static426.aClass186_134) {
			Static527.method7469();
			Static478.method6997();
			arg0.aClass186_196 = null;
			return true;
		} else {
			@Pc(491) int local491;
			if (Static127.aClass186_39 == arg0.aClass186_196) {
				local284 = local11.method5305();
				local102 = local11.method5323();
				local292 = local11.method5272();
				local491 = local11.method5305();
				Static527.method7469();
				Static219.method3499(7, local491 << 16 | local284, local102, local292);
				arg0.aClass186_196 = null;
				return true;
			} else if (Static40.aClass186_12 == arg0.aClass186_196) {
				local284 = local11.method5312();
				Static527.method7469();
				if (local284 == -1) {
					Static573.anInt9429 = -1;
					Static283.anInt5140 = -1;
				} else {
					local102 = local284 >> 14 & 0x3FFF;
					local292 = local284 & 0x3FFF;
					local102 -= Static714.anInt11156;
					local292 -= Static339.anInt5859;
					if (local102 < 0) {
						local102 = 0;
					} else if (Static362.anInt8653 <= local102) {
						local102 = Static362.anInt8653;
					}
					if (local292 < 0) {
						local292 = 0;
					} else if (local292 >= Static206.anInt11291) {
						local292 = Static206.anInt11291;
					}
					Static283.anInt5140 = (local102 << 9) + 256;
					Static573.anInt9429 = (local292 << 9) + 256;
				}
				arg0.aClass186_196 = null;
				return true;
			} else if (arg0.aClass186_196 == Static419.aClass186_132) {
				Static593.method8151(Static247.aClass206_8);
				arg0.aClass186_196 = null;
				return true;
			} else if (arg0.aClass186_196 == Static54.aClass186_170) {
				Static299.anInt6884 = local11.method5322(-105);
				for (local284 = 0; local284 < Static299.anInt6884; local284++) {
					Static383.aStringArray25[local284] = local11.method5295();
					Static59.aStringArray3[local284] = local11.method5295();
					if (Static59.aStringArray3[local284].equals("")) {
						Static59.aStringArray3[local284] = Static383.aStringArray25[local284];
					}
					Static301.aStringArray17[local284] = local11.method5295();
					Static715.aStringArray30[local284] = local11.method5295();
					if (Static715.aStringArray30[local284].equals("")) {
						Static715.aStringArray30[local284] = Static301.aStringArray17[local284];
					}
					Static572.aBooleanArray25[local284] = false;
				}
				Static455.anInt8019 = Static210.anInt3647;
				arg0.aClass186_196 = null;
				return true;
			} else {
				@Pc(733) int local733;
				@Pc(744) int local744;
				@Pc(756) int local756;
				@Pc(750) int local750;
				@Pc(760) int local760;
				if (arg0.aClass186_196 == Static158.aClass186_49) {
					local284 = local11.method5322(-23);
					local102 = local284 >> 2;
					local292 = local284 & 0x3;
					local491 = Static501.anIntArray467[local102];
					local733 = local11.method5272();
					if (local733 == 65535) {
						local733 = -1;
					}
					local744 = local11.method5323();
					local750 = local744 >> 28 & 0x3;
					local756 = local744 >> 14 & 0x3FFF;
					local760 = local744 & 0x3FFF;
					local756 -= Static714.anInt11156;
					local760 -= Static339.anInt5859;
					Static266.method4100(local760, local491, local756, local750, local292, local102, local733);
					arg0.aClass186_196 = null;
					return true;
				} else if (arg0.aClass186_196 == Static486.aClass186_146) {
					Static455.anInt8019 = Static210.anInt3647;
					arg0.aClass186_196 = null;
					Static502.anInt8591 = 1;
					return true;
				} else if (Static212.aClass186_68 == arg0.aClass186_196) {
					if (Static633.anInt3426 != -1) {
						Static49.method650(0, Static633.anInt3426);
					}
					arg0.aClass186_196 = null;
					return true;
				} else if (Static6.aClass186_4 == arg0.aClass186_196) {
					Static664.anInt10583 = local11.method5330() << 3;
					Static214.anInt4161 = local11.method5308();
					Static179.anInt3229 = local11.method5299() << 3;
					arg0.aClass186_196 = null;
					return true;
				} else if (arg0.aClass186_196 == Static709.aClass186_200) {
					local284 = local11.method5305();
					Static527.method7469();
					Static672.method8913(local284);
					arg0.aClass186_196 = null;
					return true;
				} else if (Static476.aClass186_143 == arg0.aClass186_196) {
					local284 = local11.method5303();
					local102 = local11.method5321();
					Static527.method7469();
					Static659.method8815(local102, local284);
					arg0.aClass186_196 = null;
					return true;
				} else {
					@Pc(955) String local955;
					@Pc(909) String local909;
					@Pc(927) boolean local927;
					@Pc(911) String local911;
					@Pc(905) boolean local905;
					if (Static618.aClass186_111 == arg0.aClass186_196) {
						local905 = local11.method5322(-7) == 1;
						local909 = local11.method5295();
						local911 = local909;
						if (local905) {
							local911 = local11.method5295();
						}
						local491 = local11.method5322(-40);
						local733 = local11.method5272();
						local927 = false;
						if (local491 <= 1 && Static517.method7376(local911)) {
							local927 = true;
						}
						if (!local927 && Static384.anInt6866 == 0) {
							local955 = Static558.aClass233_2.method5417(local733).method2543(local11);
							if (local491 == 2) {
								Static366.method5247(local733, 0, "<img=1>" + local911, "<img=1>" + local909, local955, 25, local909, (String) null);
							} else if (local491 == 1) {
								Static366.method5247(local733, 0, "<img=0>" + local911, "<img=0>" + local909, local955, 25, local909, (String) null);
							} else {
								Static366.method5247(local733, 0, local911, local909, local955, 25, local909, (String) null);
							}
						}
						arg0.aClass186_196 = null;
						return true;
					} else if (Static141.aClass186_42 == arg0.aClass186_196) {
						local284 = local11.method5312();
						local102 = local11.method5301();
						if (local102 == 65535) {
							local102 = -1;
						}
						Static527.method7469();
						Static219.method3499(2, local102, local284, -1);
						arg0.aClass186_196 = null;
						return true;
					} else if (Static269.aClass186_93 == arg0.aClass186_196) {
						Static593.method8151(Static220.aClass206_7);
						arg0.aClass186_196 = null;
						return true;
					} else {
						@Pc(1130) boolean local1130;
						if (Static532.aClass186_154 == arg0.aClass186_196) {
							local905 = local11.method5322(-38) == 1;
							local909 = local11.method5295();
							local911 = local909;
							if (local905) {
								local911 = local11.method5295();
							}
							local491 = local11.method5322(-86);
							local1130 = false;
							if (local491 <= 1) {
								if (Static125.aBoolean199 && !Static697.aBoolean790 || Static553.aBoolean677) {
									local1130 = true;
								} else if (local491 <= 1 && Static517.method7376(local911)) {
									local1130 = true;
								}
							}
							if (!local1130 && Static384.anInt6866 == 0) {
								local322 = Static71.method907(Static20.method334(local11));
								if (local491 == 2) {
									Static366.method5247(-1, 0, "<img=1>" + local911, "<img=1>" + local909, local322, 24, local909, (String) null);
								} else if (local491 == 1) {
									Static366.method5247(-1, 0, "<img=0>" + local911, "<img=0>" + local909, local322, 24, local909, (String) null);
								} else {
									Static366.method5247(-1, 0, local911, local909, local322, 24, local909, (String) null);
								}
							}
							arg0.aClass186_196 = null;
							return true;
						}
						@Pc(1301) Class3_Sub52 local1301;
						if (arg0.aClass186_196 == Static174.aClass186_185) {
							local284 = local11.method5321();
							local102 = local11.method5312();
							Static527.method7469();
							@Pc(1294) Class3_Sub52 local1294 = (Class3_Sub52) Static170.aClass136_19.method3503((long) local102);
							local1301 = (Class3_Sub52) Static170.aClass136_19.method3503((long) local284);
							if (local1301 != null) {
								Static65.method813(local1294 == null || local1294.anInt10202 != local1301.anInt10202, false, local1301);
							}
							if (local1294 != null) {
								local1294.method9446();
								Static170.aClass136_19.method3508((long) local284, local1294);
							}
							@Pc(1339) Class20 local1339 = Static118.method2045(local102);
							if (local1339 != null) {
								Static391.method5905(local1339);
							}
							local1339 = Static118.method2045(local284);
							if (local1339 != null) {
								Static391.method5905(local1339);
								Static97.method1292(true, local1339);
							}
							if (Static633.anInt3426 != -1) {
								Static49.method650(1, Static633.anInt3426);
							}
							arg0.aClass186_196 = null;
							return true;
						} else if (arg0.aClass186_196 == Static176.aClass186_56) {
							local284 = local11.method5314();
							local102 = local11.method5301();
							local292 = local11.method5293();
							Static527.method7469();
							local1301 = (Class3_Sub52) Static170.aClass136_19.method3503((long) local284);
							if (local1301 != null) {
								Static65.method813(local102 != local1301.anInt10202, false, local1301);
							}
							Static596.method8207(false, local284, local102, local292);
							arg0.aClass186_196 = null;
							return true;
						} else if (Static101.aClass186_26 == arg0.aClass186_196) {
							Static577.aClass362_1.method8661();
							Static644.anInt10388 += 32;
							arg0.aClass186_196 = null;
							return true;
						} else if (arg0.aClass186_196 == Static397.aClass186_125) {
							local284 = local11.method5272();
							if (local284 == 65535) {
								local284 = -1;
							}
							local102 = local11.method5322(-54);
							local292 = local11.method5272();
							local491 = local11.method5322(-99);
							local733 = local11.method5272();
							Static700.method9158(local102, local284, local292, local733, local491);
							arg0.aClass186_196 = null;
							return true;
						} else if (Static557.aClass186_158 == arg0.aClass186_196) {
							Static593.method8151(Static605.aClass206_16);
							arg0.aClass186_196 = null;
							return true;
						} else if (Static111.aClass186_33 == arg0.aClass186_196) {
							Static593.method8151(Static686.aClass206_14);
							arg0.aClass186_196 = null;
							return true;
						} else if (Static151.aClass186_48 == arg0.aClass186_196) {
							local284 = local11.method5322(-39);
							local102 = local11.method5323();
							local292 = local11.method5322(-46);
							Static373.anIntArray355[local292] = local102;
							Static296.anIntArray193[local292] = local284;
							Static427.anIntArray417[local292] = 1;
							local491 = Static165.anIntArray149[local292] - 1;
							for (local733 = 0; local733 < local491; local733++) {
								if (local102 >= Class21.anIntArray176[local733]) {
									Static427.anIntArray417[local292] = local733 + 2;
								}
							}
							Static465.anIntArray441[Static149.anInt2805++ & 0x1F] = local292;
							arg0.aClass186_196 = null;
							return true;
						} else if (Static464.aClass186_142 == arg0.aClass186_196) {
							Static593.method8151(Static636.aClass206_17);
							arg0.aClass186_196 = null;
							return true;
						} else {
							@Pc(1658) long local1658;
							@Pc(1681) Class3_Sub29 local1681;
							@Pc(1664) Class3_Sub29 local1664;
							if (arg0.aClass186_196 == Static10.aClass186_5) {
								local284 = local11.method5303();
								if (local284 == 65535) {
									local284 = -1;
								}
								local102 = local11.method5312();
								local292 = local11.method5303();
								local491 = local11.method5272();
								Static527.method7469();
								if (local491 == 65535) {
									local491 = -1;
								}
								for (local733 = local284; local733 <= local491; local733++) {
									local1658 = ((long) local102 << 32) + ((long) local733);
									local1664 = (Class3_Sub29) Static356.aClass136_28.method3503(local1658);
									if (local1664 != null) {
										local1681 = new Class3_Sub29(local1664.anInt5450, local292);
										local1664.method9446();
									} else if (local733 == -1) {
										local1681 = new Class3_Sub29(Static118.method2045(local102).aClass3_Sub29_1.anInt5450, local292);
									} else {
										local1681 = new Class3_Sub29(0, local292);
									}
									Static356.aClass136_28.method3508(local1658, local1681);
								}
								arg0.aClass186_196 = null;
								return true;
							} else if (arg0.aClass186_196 == Static635.aClass186_182) {
								for (local284 = 0; local284 < Static681.aClass19_Sub1_Sub3_Sub2_Sub2Array1.length; local284++) {
									if (Static681.aClass19_Sub1_Sub3_Sub2_Sub2Array1[local284] != null) {
										Static681.aClass19_Sub1_Sub3_Sub2_Sub2Array1[local284].anIntArray425 = null;
										Static681.aClass19_Sub1_Sub3_Sub2_Sub2Array1[local284].aClass100_9.method8962(-1);
									}
								}
								for (local102 = 0; local102 < Static32.anInt518; local102++) {
									Static95.aClass3_Sub13Array1[local102].aClass19_Sub1_Sub3_Sub2_Sub1_2.anIntArray425 = null;
									Static95.aClass3_Sub13Array1[local102].aClass19_Sub1_Sub3_Sub2_Sub1_2.aClass100_9.method8962(-1);
								}
								arg0.aClass186_196 = null;
								return true;
							} else {
								@Pc(1805) String local1805;
								if (Static694.aClass186_191 == arg0.aClass186_196) {
									local1805 = local11.method5295();
									local102 = local11.method5312();
									Static527.method7469();
									Static676.method8941(local1805, local102);
									arg0.aClass186_196 = null;
									return true;
								} else if (arg0.aClass186_196 == Static441.aClass186_136) {
									Static79.method1031();
									arg0.aClass186_196 = null;
									return false;
								} else {
									@Pc(1859) boolean local1859;
									if (arg0.aClass186_196 == Static651.aClass186_184) {
										local284 = local11.method5272();
										local102 = local11.method5322(-111);
										local1859 = (local102 & 0x1) == 1;
										Static471.method8862(local1859, local284);
										local491 = local11.method5272();
										for (local733 = 0; local733 < local491; local733++) {
											local744 = local11.method5322(-90);
											if (local744 == 255) {
												local744 = local11.method5314();
											}
											local750 = local11.method5303();
											Static65.method815(local1859, local733, local744, local284, local750 - 1);
										}
										Static162.anIntArray146[Static267.anInt4865++ & 0x1F] = local284;
										arg0.aClass186_196 = null;
										return true;
									} else if (Static224.aClass186_70 == arg0.aClass186_196) {
										local284 = local11.method5272();
										local102 = local11.method5301();
										local292 = local11.method5314();
										Static527.method7469();
										Static12.method154(local292, (local102 << 16) + local284);
										arg0.aClass186_196 = null;
										return true;
									} else if (Static607.aClass186_176 == arg0.aClass186_196) {
										Static189.anInt3335 = local11.method5294();
										Static125.aBoolean199 = local11.method5322(-83) == 1;
										arg0.aClass186_196 = null;
										return true;
									} else if (Static554.aClass186_157 == arg0.aClass186_196) {
										Static373.anInt6383 = Static210.anInt3647;
										local905 = local11.method5322(-26) == 1;
										if (arg0.anInt11061 != 1) {
											if (local905) {
												Static319.aClass237_7 = new Class237(local11);
											} else {
												Static474.aClass237_4 = new Class237(local11);
											}
											arg0.aClass186_196 = null;
											return true;
										}
										arg0.aClass186_196 = null;
										if (local905) {
											Static319.aClass237_7 = null;
										} else {
											Static474.aClass237_4 = null;
										}
										return true;
									} else if (Static525.aClass186_152 == arg0.aClass186_196) {
										Static527.method7469();
										Static165.method2651();
										arg0.aClass186_196 = null;
										return true;
									} else if (arg0.aClass186_196 == Static296.aClass186_67) {
										local905 = local11.method5322(-26) == 1;
										Static527.method7469();
										arg0.aClass186_196 = null;
										Static168.aBoolean770 = local905;
										return true;
									} else if (arg0.aClass186_196 == Static662.aClass186_171) {
										local284 = local11.method5312();
										local102 = local11.method5303();
										Static577.aClass362_1.method8668(local102, local284);
										arg0.aClass186_196 = null;
										return true;
									} else if (Static143.aClass186_43 == arg0.aClass186_196) {
										local284 = local11.method5293();
										local102 = local11.method5293();
										local292 = local11.method5322(-38);
										local491 = local11.method5322(-78);
										local733 = local11.method5301() << 2;
										Static527.method7469();
										Static536.method7528(local733, local491, local102, true, local284, local292);
										arg0.aClass186_196 = null;
										return true;
									} else if (arg0.aClass186_196 == Static241.aClass186_79) {
										Static663.aClass291_4 = Static145.method2396(local11.method5322(-77));
										arg0.aClass186_196 = null;
										return true;
									} else if (Static487.aClass186_147 == arg0.aClass186_196) {
										local284 = local11.method5323();
										local102 = local11.method5303();
										local292 = local11.method5305();
										local491 = local11.method5272();
										Static527.method7469();
										Static682.method9021(local102, local292, local491, local284);
										arg0.aClass186_196 = null;
										return true;
									} else {
										@Pc(2232) byte[] local2232;
										if (arg0.aClass186_196 == Static49.aClass186_15) {
											if (Static691.aFrame2 != null) {
												Static354.method5127(-1, -1, false, Static713.aClass3_Sub55_31.aClass15_Sub23_1.method7900());
											}
											local2232 = new byte[arg0.anInt11061];
											local11.method5337(local2232, arg0.anInt11061);
											local909 = Static358.method5137(local2232, arg0.anInt11061, 0);
											Static400.method6006(true, local909, Static310.aClass47_4, Static713.aClass3_Sub55_31.aClass15_Sub4_1.method1071() == 1);
											arg0.aClass186_196 = null;
											return true;
										} else if (Static714.aClass186_199 == arg0.aClass186_196) {
											local284 = local11.method5321();
											local102 = local11.method5301();
											Static527.method7469();
											Static27.method394(local284, local102);
											arg0.aClass186_196 = null;
											return true;
										} else {
											@Pc(2314) boolean local2314;
											if (Static392.aClass186_123 == arg0.aClass186_196) {
												local284 = local11.method5322(-56);
												local2314 = (local284 & 0x1) == 1;
												local911 = local11.method5295();
												local294 = local11.method5295();
												if (local294.equals("")) {
													local294 = local911;
												}
												local296 = local11.method5295();
												local322 = local11.method5295();
												if (local322.equals("")) {
													local322 = local296;
												}
												if (local2314) {
													for (local750 = 0; local750 < Static299.anInt6884; local750++) {
														if (Static59.aStringArray3[local750].equals(local322)) {
															Static383.aStringArray25[local750] = local911;
															Static59.aStringArray3[local750] = local294;
															Static301.aStringArray17[local750] = local296;
															Static715.aStringArray30[local750] = local322;
															break;
														}
													}
												} else {
													Static383.aStringArray25[Static299.anInt6884] = local911;
													Static59.aStringArray3[Static299.anInt6884] = local294;
													Static301.aStringArray17[Static299.anInt6884] = local296;
													Static715.aStringArray30[Static299.anInt6884] = local322;
													Static572.aBooleanArray25[Static299.anInt6884] = (local284 & 0x2) == 2;
													Static299.anInt6884++;
												}
												Static455.anInt8019 = Static210.anInt3647;
												arg0.aClass186_196 = null;
												return true;
											} else if (arg0.aClass186_196 == Static102.aClass186_27) {
												local284 = local11.method5305();
												local102 = local11.method5323();
												Static527.method7469();
												Static184.method2809(local102, local284);
												arg0.aClass186_196 = null;
												return true;
											} else if (Static109.aClass186_32 == arg0.aClass186_196) {
												local284 = local11.method5324();
												local102 = local11.method5312();
												Static527.method7469();
												Static704.method9195(local102, local284);
												arg0.aClass186_196 = null;
												return true;
											} else if (arg0.aClass186_196 == Static77.aClass186_21) {
												local284 = local11.method5322(-65);
												local102 = local11.method5334();
												if (local284 == 255) {
													local284 = -1;
													local102 = -1;
												}
												Static311.method4687(local102, local284);
												arg0.aClass186_196 = null;
												return true;
											} else {
												@Pc(2712) int local2712;
												@Pc(2730) Class101 local2730;
												@Pc(2567) long local2567;
												if (Static244.aClass186_80 == arg0.aClass186_196) {
													Static708.anInt11073 = Static210.anInt3647;
													if (arg0.anInt11061 == 0) {
														Static657.aString127 = null;
														Static372.aString96 = null;
														Static303.aClass101Array1 = null;
														Static621.anInt10020 = 0;
														arg0.aClass186_196 = null;
														return true;
													}
													Static372.aString96 = local11.method5295();
													local905 = local11.method5322(-76) == 1;
													if (local905) {
														local11.method5295();
													}
													local2567 = local11.method5287();
													Static657.aString127 = Static479.method7005(local2567);
													Static152.aByte44 = local11.method5288();
													local491 = local11.method5322(-56);
													if (local491 == 255) {
														arg0.aClass186_196 = null;
														return true;
													}
													Static621.anInt10020 = local491;
													@Pc(2595) Class101[] local2595 = new Class101[100];
													for (local744 = 0; local744 < Static621.anInt10020; local744++) {
														local2595[local744] = new Class101();
														local2595[local744].aString53 = local11.method5295();
														local905 = local11.method5322(-10) == 1;
														if (local905) {
															local2595[local744].aString55 = local11.method5295();
														} else {
															local2595[local744].aString55 = local2595[local744].aString53;
														}
														local2595[local744].aString54 = Static282.method4264(local2595[local744].aString55);
														local2595[local744].anInt2926 = local11.method5272();
														local2595[local744].aByte45 = local11.method5288();
														local2595[local744].aString52 = local11.method5295();
														if (local2595[local744].aString55.equals(Static251.aClass19_Sub1_Sub3_Sub2_Sub2_2.aString109)) {
															Static438.aByte112 = local2595[local744].aByte45;
														}
													}
													local760 = Static621.anInt10020;
													while (local760 > 0) {
														@Pc(2709) boolean local2709 = true;
														local760--;
														for (local2712 = 0; local2712 < local760; local2712++) {
															if (local2595[local2712].aString54.compareTo(local2595[local2712 + 1].aString54) > 0) {
																local2730 = local2595[local2712];
																local2595[local2712] = local2595[local2712 + 1];
																local2595[local2712 + 1] = local2730;
																local2709 = false;
															}
														}
														if (local2709) {
															break;
														}
													}
													Static303.aClass101Array1 = local2595;
													arg0.aClass186_196 = null;
													return true;
												} else if (Static605.aClass186_174 == arg0.aClass186_196) {
													Static593.method8151(Static407.aClass206_13);
													arg0.aClass186_196 = null;
													return true;
												} else if (Static530.aClass186_153 == arg0.aClass186_196) {
													local284 = local11.method5312();
													local102 = local11.method5323();
													local292 = local11.method5301();
													Static527.method7469();
													Static219.method3499(5, local292, local102, local284);
													arg0.aClass186_196 = null;
													return true;
												} else {
													@Pc(2883) int local2883;
													@Pc(2851) long local2851;
													@Pc(2864) long local2864;
													@Pc(2866) boolean local2866;
													@Pc(2967) String local2967;
													@Pc(2974) int local2974;
													@Pc(2846) long local2846;
													if (Static200.aClass186_63 == arg0.aClass186_196) {
														local905 = local11.method5322(-42) == 1;
														local909 = local11.method5295();
														local2846 = (long) local11.method5272();
														local2851 = (long) local11.method5307();
														local750 = local11.method5322(-41);
														local2864 = (local2846 << 32) + local2851;
														local2866 = false;
														@Pc(2875) Class3_Sub56 local2875 = local905 ? Static410.aClass3_Sub56_3 : Static267.aClass3_Sub56_2;
														if (local2875 == null) {
															local2866 = true;
														} else {
															label2261: {
																for (local2883 = 0; local2883 < 100; local2883++) {
																	if (local2864 == Static678.aLongArray26[local2883]) {
																		local2866 = true;
																		break label2261;
																	}
																}
																if (local750 <= 1) {
																	if (Static125.aBoolean199 && !Static697.aBoolean790 || Static553.aBoolean677) {
																		local2866 = true;
																	} else if (Static517.method7376(local909)) {
																		local2866 = true;
																	}
																}
															}
														}
														if (!local2866 && Static384.anInt6866 == 0) {
															Static678.aLongArray26[Static603.anInt9829] = local2864;
															Static603.anInt9829 = (Static603.anInt9829 + 1) % 100;
															local2967 = Static71.method907(Static20.method334(local11));
															local2974 = local905 ? 41 : 44;
															if (local750 == 2 || local750 == 3) {
																Static366.method5247(-1, 0, "<img=1>" + local909, "<img=1>" + local909, local2967, local2974, local909, local2875.aString134);
															} else if (local750 == 1) {
																Static366.method5247(-1, 0, "<img=0>" + local909, "<img=0>" + local909, local2967, local2974, local909, local2875.aString134);
															} else {
																Static366.method5247(-1, 0, local909, local909, local2967, local2974, local909, local2875.aString134);
															}
														}
														arg0.aClass186_196 = null;
														return true;
													}
													@Pc(3326) boolean local3326;
													@Pc(3515) boolean local3515;
													@Pc(3223) int local3223;
													@Pc(3154) int local3154;
													@Pc(3221) int local3221;
													if (Static701.aClass186_193 == arg0.aClass186_196) {
														local284 = local11.method5301();
														local102 = local11.method5334();
														local292 = local11.method5305();
														if (local292 == 65535) {
															local292 = -1;
														}
														local491 = local11.method5272();
														local733 = local11.method5322(-9);
														local744 = local11.method5323();
														local750 = local733 & 0x7;
														local756 = local733 >> 3 & 0xF;
														if (local756 == 15) {
															local756 = -1;
														}
														@Pc(3135) boolean local3135 = (local733 >> 7 & 0x1) == 1;
														if (local744 >> 30 == 0) {
															@Pc(3417) Class26 local3417;
															@Pc(3423) Class26 local3423;
															@Pc(3399) Class310 local3399;
															@Pc(3367) int local3367;
															if (local744 >> 29 != 0) {
																local2712 = local744 & 0xFFFF;
																@Pc(3498) Class3_Sub13 local3498 = (Class3_Sub13) Static612.aClass136_44.method3503((long) local2712);
																if (local3498 != null) {
																	@Pc(3503) Class19_Sub1_Sub3_Sub2_Sub1 local3503 = local3498.aClass19_Sub1_Sub3_Sub2_Sub1_2;
																	@Pc(3508) Class385 local3508 = local3503.aClass385Array3[local102];
																	if (local292 == 65535) {
																		local292 = -1;
																	}
																	local3515 = true;
																	local3223 = local3508.anInt10760;
																	if (local292 != -1 && local3223 != -1) {
																		if (local292 == local3223) {
																			local3399 = Static660.aClass307_2.method7493(local292);
																			if (local3399.aBoolean661 && local3399.anInt8987 != -1) {
																				local3417 = Static59.aClass177_1.method4259(local3399.anInt8987);
																				@Pc(3601) int local3601 = local3417.anInt767;
																				if (local3601 == 0 || local3601 == 2) {
																					local3515 = false;
																				} else if (local3601 == 1) {
																					local3515 = true;
																				}
																			}
																		} else {
																			local3399 = Static660.aClass307_2.method7493(local292);
																			@Pc(3546) Class310 local3546 = Static660.aClass307_2.method7493(local3223);
																			if (local3399.anInt8987 != -1 && local3546.anInt8987 != -1) {
																				local3423 = Static59.aClass177_1.method4259(local3399.anInt8987);
																				@Pc(3568) Class26 local3568 = Static59.aClass177_1.method4259(local3546.anInt8987);
																				if (local3568.anInt768 > local3423.anInt768) {
																					local3515 = false;
																				}
																			}
																		}
																	}
																	if (local3515) {
																		local3508.anInt10758 = local284;
																		local3508.anInt10759 = local756;
																		local3508.anInt10760 = local292;
																		if (local292 == -1) {
																			local3508.aClass100_11.method8962(-1);
																		} else {
																			local3399 = Static660.aClass307_2.method7493(local292);
																			local3367 = local3399.aBoolean661 ? 0 : 2;
																			if (local3135) {
																				local3367 = 1;
																			}
																			local3508.aClass100_11.method8973(local3367, local491, local3399.anInt8987, false);
																		}
																	}
																}
															} else if (local744 >> 28 != 0) {
																local2712 = local744 & 0xFFFF;
																@Pc(3308) Class19_Sub1_Sub3_Sub2_Sub2 local3308;
																if (Static584.anInt9539 == local2712) {
																	local3308 = Static251.aClass19_Sub1_Sub3_Sub2_Sub2_2;
																} else {
																	local3308 = Static681.aClass19_Sub1_Sub3_Sub2_Sub2Array1[local2712];
																}
																if (local3308 != null) {
																	@Pc(3319) Class385 local3319 = local3308.aClass385Array3[local102];
																	if (local292 == 65535) {
																		local292 = -1;
																	}
																	local3326 = true;
																	local3221 = local3319.anInt10760;
																	@Pc(3348) Class310 local3348;
																	if (local292 != -1 && local3221 != -1) {
																		if (local3221 == local292) {
																			local3348 = Static660.aClass307_2.method7493(local292);
																			if (local3348.aBoolean661 && local3348.anInt8987 != -1) {
																				@Pc(3364) Class26 local3364 = Static59.aClass177_1.method4259(local3348.anInt8987);
																				local3367 = local3364.anInt767;
																				if (local3367 == 0 || local3367 == 2) {
																					local3326 = false;
																				} else if (local3367 == 1) {
																					local3326 = true;
																				}
																			}
																		} else {
																			local3348 = Static660.aClass307_2.method7493(local292);
																			local3399 = Static660.aClass307_2.method7493(local3221);
																			if (local3348.anInt8987 != -1 && local3399.anInt8987 != -1) {
																				local3417 = Static59.aClass177_1.method4259(local3348.anInt8987);
																				local3423 = Static59.aClass177_1.method4259(local3399.anInt8987);
																				if (local3423.anInt768 > local3417.anInt768) {
																					local3326 = false;
																				}
																			}
																		}
																	}
																	if (local3326) {
																		local3319.anInt10759 = local756;
																		local3319.anInt10758 = local284;
																		local3319.anInt10757 = local750;
																		local3319.anInt10760 = local292;
																		if (local292 == -1) {
																			local3319.aClass100_11.method8962(-1);
																		} else {
																			local3348 = Static660.aClass307_2.method7493(local292);
																			@Pc(3463) int local3463 = local3348.aBoolean661 ? 0 : 2;
																			if (local3135) {
																				local3463 = 1;
																			}
																			local3319.aClass100_11.method8973(local3463, local491, local3348.anInt8987, false);
																		}
																	}
																}
															}
														} else {
															local2712 = local744 >> 28 & 0x3;
															local3154 = (local744 >> 14 & 0x3FFF) - Static714.anInt11156;
															local2883 = (local744 & 0x3FFF) - Static339.anInt5859;
															if (local3154 >= 0 && local2883 >= 0 && Static362.anInt8653 > local3154 && local2883 < Static206.anInt11291) {
																if (local292 == -1) {
																	@Pc(3196) Class3_Sub4_Sub9 local3196 = (Class3_Sub4_Sub9) Static59.aClass136_6.method3503((long) (local2883 | local3154 << 16));
																	if (local3196 != null) {
																		local3196.aClass19_Sub1_Sub3_Sub4_1.method6650();
																		local3196.method9446();
																	}
																} else {
																	local2974 = local3154 * 512 + 256;
																	local3221 = local2883 * 512 + 256;
																	local3223 = local2712;
																	if (local2712 < 3 && Static135.method2226(local3154, local2883)) {
																		local3223 = local2712 + 1;
																	}
																	@Pc(3263) Class19_Sub1_Sub3_Sub4 local3263 = new Class19_Sub1_Sub3_Sub4(local292, local491, local2712, local3223, local2974, Static505.method7237(local2712, local3221, local2974) - local284, local3221, local3154, local3154, local2883, local2883, local750, local3135);
																	Static59.aClass136_6.method3508((long) (local3154 << 16 | local2883), new Class3_Sub4_Sub9(local3263));
																}
															}
														}
														arg0.aClass186_196 = null;
														return true;
													} else if (arg0.aClass186_196 == Static333.aClass186_103) {
														local1805 = local11.method5295();
														local102 = local11.method5272();
														local911 = Static558.aClass233_2.method5417(local102).method2543(local11);
														Static366.method5247(local102, 0, local1805, local1805, local911, 19, local1805, (String) null);
														arg0.aClass186_196 = null;
														return true;
													} else {
														@Pc(3731) byte local3731;
														if (Static149.aClass186_47 == arg0.aClass186_196) {
															local284 = local11.method5272();
															local3731 = local11.method5288();
															if (Static398.anObjectArray37 == null) {
																Static398.anObjectArray37 = new Object[Static101.aClass125_1.anInt3485];
															}
															Static398.anObjectArray37[local284] = Integer.valueOf(local3731);
															Static298.anIntArray220[Static436.anInt7615++ & 0x1F] = local284;
															arg0.aClass186_196 = null;
															return true;
														} else if (Static659.aClass186_186 == arg0.aClass186_196) {
															Static593.method8151(Static69.aClass206_1);
															arg0.aClass186_196 = null;
															return true;
														} else if (Static672.aClass186_188 == arg0.aClass186_196) {
															local284 = local11.method5272();
															local102 = local11.method5322(-67);
															local1859 = (local102 & 0x1) == 1;
															while (arg0.anInt11061 > local11.anInt6241) {
																local491 = local11.method5331();
																local733 = local11.method5272();
																local744 = 0;
																if (local733 != 0) {
																	local744 = local11.method5322(-19);
																	if (local744 == 255) {
																		local744 = local11.method5312();
																	}
																}
																Static65.method815(local1859, local491, local744, local284, local733 - 1);
															}
															Static162.anIntArray146[Static267.anInt4865++ & 0x1F] = local284;
															arg0.aClass186_196 = null;
															return true;
														} else if (arg0.aClass186_196 == Static595.aClass186_169) {
															Static593.method8151(Static189.aClass206_6);
															arg0.aClass186_196 = null;
															return true;
														} else if (arg0.aClass186_196 == Static517.aClass186_150) {
															local284 = local11.method5323();
															local102 = local11.method5272();
															Static577.aClass362_1.method8662(local102, local284);
															arg0.aClass186_196 = null;
															return true;
														} else if (arg0.aClass186_196 == Static650.aClass186_183) {
															Static475.aString111 = arg0.anInt11061 > 2 ? local11.method5295() : Static476.aClass279_26.method6992(Static141.anInt2658);
															Static701.anInt10980 = arg0.anInt11061 > 0 ? local11.method5272() : -1;
															if (Static701.anInt10980 == 65535) {
																Static701.anInt10980 = -1;
															}
															arg0.aClass186_196 = null;
															return true;
														} else {
															@Pc(3999) boolean local3999;
															@Pc(3997) long local3997;
															@Pc(4083) String local4083;
															if (Static64.aClass186_18 == arg0.aClass186_196) {
																local905 = local11.method5322(-102) == 1;
																local909 = local11.method5295();
																local2846 = (long) local11.method5272();
																local2851 = (long) local11.method5307();
																local750 = local11.method5322(-45);
																local756 = local11.method5272();
																local3997 = (local2846 << 32) + local2851;
																local3999 = false;
																@Pc(4008) Class3_Sub56 local4008 = local905 ? Static410.aClass3_Sub56_3 : Static267.aClass3_Sub56_2;
																if (local4008 == null) {
																	local3999 = true;
																} else {
																	label2276: {
																		for (local2974 = 0; local2974 < 100; local2974++) {
																			if (local3997 == Static678.aLongArray26[local2974]) {
																				local3999 = true;
																				break label2276;
																			}
																		}
																		if (local750 <= 1 && Static517.method7376(local909)) {
																			local3999 = true;
																		}
																	}
																}
																if (!local3999 && Static384.anInt6866 == 0) {
																	Static678.aLongArray26[Static603.anInt9829] = local3997;
																	Static603.anInt9829 = (Static603.anInt9829 + 1) % 100;
																	local4083 = Static558.aClass233_2.method5417(local756).method2543(local11);
																	local3221 = local905 ? 42 : 45;
																	if (local750 == 2 || local750 == 3) {
																		Static366.method5247(local756, 0, "<img=1>" + local909, "<img=1>" + local909, local4083, local3221, local909, local4008.aString134);
																	} else if (local750 == 1) {
																		Static366.method5247(local756, 0, "<img=0>" + local909, "<img=0>" + local909, local4083, local3221, local909, local4008.aString134);
																	} else {
																		Static366.method5247(local756, 0, local909, local909, local4083, local3221, local909, local4008.aString134);
																	}
																}
																arg0.aClass186_196 = null;
																return true;
															} else if (arg0.aClass186_196 == Static147.aClass186_45) {
																local284 = local11.method5322(-85);
																local102 = local11.method5272();
																local292 = local11.method5308();
																local491 = local11.method5293();
																local733 = local11.method5334();
																Static527.method7469();
																Static197.aBooleanArray10[local733] = true;
																Static395.anIntArray384[local733] = local491;
																Static175.anIntArray593[local733] = local292;
																Static664.anIntArray594[local733] = local284;
																Static272.anIntArray280[local733] = local102;
																arg0.aClass186_196 = null;
																return true;
															} else if (Static564.aClass186_160 == arg0.aClass186_196) {
																Static424.anInt7467 = local11.method5293();
																Static130.anInt2440 = local11.method5322(-92);
																arg0.aClass186_196 = null;
																return true;
															} else if (Static4.aClass186_3 == arg0.aClass186_196) {
																local1805 = local11.method5295();
																local909 = Static71.method907(Static20.method334(local11));
																Static170.method2681(local1805, 6, 0, local909, local1805, local1805);
																arg0.aClass186_196 = null;
																return true;
															} else if (arg0.aClass186_196 == Static316.aClass186_115) {
																Static262.anInt4819 = Static210.anInt3647;
																local905 = local11.method5322(-63) == 1;
																@Pc(4313) Class223 local4313 = new Class223(local11);
																@Pc(4317) Class3_Sub56 local4317;
																if (local905) {
																	local4317 = Static410.aClass3_Sub56_3;
																} else {
																	local4317 = Static267.aClass3_Sub56_2;
																}
																local4313.method5124(local4317);
																arg0.aClass186_196 = null;
																return true;
															} else if (Static306.aClass186_98 == arg0.aClass186_196) {
																Static392.aByte109 = local11.method5318();
																arg0.aClass186_196 = null;
																if (Static392.aByte109 == 0 || Static392.aByte109 == 1) {
																	Static645.aBoolean754 = true;
																}
																return true;
															} else if (arg0.aClass186_196 == Static267.aClass186_89) {
																local284 = local11.method5272();
																local909 = local11.method5295();
																if (Static398.anObjectArray37 == null) {
																	Static398.anObjectArray37 = new Object[Static101.aClass125_1.anInt3485];
																}
																Static398.anObjectArray37[local284] = local909;
																Static298.anIntArray220[Static436.anInt7615++ & 0x1F] = local284;
																arg0.aClass186_196 = null;
																return true;
															} else if (Static471.aClass186_187 == arg0.aClass186_196) {
																Static262.anInt4819 = Static210.anInt3647;
																local905 = local11.method5322(-97) == 1;
																if (arg0.anInt11061 != 1) {
																	if (local905) {
																		Static410.aClass3_Sub56_3 = new Class3_Sub56(local11);
																	} else {
																		Static267.aClass3_Sub56_2 = new Class3_Sub56(local11);
																	}
																	arg0.aClass186_196 = null;
																	return true;
																}
																arg0.aClass186_196 = null;
																if (local905) {
																	Static410.aClass3_Sub56_3 = null;
																} else {
																	Static267.aClass3_Sub56_2 = null;
																}
																return true;
															} else if (arg0.aClass186_196 == Static268.aClass186_90) {
																local905 = local11.method5322(-50) == 1;
																@Pc(4489) byte[] local4489 = new byte[arg0.anInt11061 - 1];
																local11.method5271(local4489, arg0.anInt11061 - 1, 0);
																Static273.method4191(local905, local4489);
																arg0.aClass186_196 = null;
																return true;
															} else if (Static576.aClass186_166 == arg0.aClass186_196) {
																local284 = local11.method5322(-85);
																if (local11.method5322(-96) == 0) {
																	Static626.aClass232Array1[local284] = new Class232();
																} else {
																	local11.anInt6241--;
																	Static626.aClass232Array1[local284] = new Class232(local11);
																}
																arg0.aClass186_196 = null;
																Static161.anInt2958 = Static210.anInt3647;
																return true;
															} else if (arg0.aClass186_196 == Static283.aClass186_96) {
																Static593.method8151(Static563.aClass206_15);
																arg0.aClass186_196 = null;
																return true;
															} else if (Static78.aClass186_23 == arg0.aClass186_196) {
																Static593.method8151(Static140.aClass206_4);
																arg0.aClass186_196 = null;
																return true;
															} else if (Static726.aClass186_201 == arg0.aClass186_196) {
																Static547.method7759();
																arg0.aClass186_196 = null;
																return true;
															} else if (arg0.aClass186_196 == Static604.aClass186_172) {
																local284 = local11.method5272();
																local2567 = local11.method5287();
																if (Static398.anObjectArray37 == null) {
																	Static398.anObjectArray37 = new Object[Static101.aClass125_1.anInt3485];
																}
																Static398.anObjectArray37[local284] = Long.valueOf(local2567);
																Static298.anIntArray220[Static436.anInt7615++ & 0x1F] = local284;
																arg0.aClass186_196 = null;
																return true;
															} else if (Static365.aClass186_113 == arg0.aClass186_196) {
																Static597.method8211(local11.method5295());
																arg0.aClass186_196 = null;
																return true;
															} else if (Static690.aClass186_119 == arg0.aClass186_196) {
																while (arg0.anInt11061 > local11.anInt6241) {
																	local905 = local11.method5322(-29) == 1;
																	local909 = local11.method5295();
																	local911 = local11.method5295();
																	local491 = local11.method5272();
																	local733 = local11.method5322(-100);
																	local927 = local11.method5322(-67) == 1;
																	local955 = "";
																	@Pc(4704) boolean local4704 = false;
																	if (local491 > 0) {
																		local955 = local11.method5295();
																		local4704 = local11.method5322(-7) == 1;
																	}
																	for (local760 = 0; local760 < Static22.anInt373; local760++) {
																		if (local905) {
																			if (local911.equals(Static432.aStringArray29[local760])) {
																				Static432.aStringArray29[local760] = local909;
																				local909 = null;
																				Static604.aStringArray38[local760] = local911;
																				break;
																			}
																		} else if (local909.equals(Static432.aStringArray29[local760])) {
																			if (local491 != Static161.anIntArray145[local760]) {
																				local2866 = true;
																				for (@Pc(4750) Class19_Sub4_Sub2 local4750 = (Class19_Sub4_Sub2) Static451.aClass66_7.method1381(); local4750 != null; local4750 = (Class19_Sub4_Sub2) Static451.aClass66_7.method1380()) {
																					if (local4750.aString114.equals(local909)) {
																						if (local491 != 0 && local4750.aShort117 == 0) {
																							local4750.method9359();
																							local2866 = false;
																						} else if (local491 == 0 && local4750.aShort117 != 0) {
																							local4750.method9359();
																							local2866 = false;
																						}
																					}
																				}
																				if (local2866) {
																					Static451.aClass66_7.method1375(new Class19_Sub4_Sub2(local909, local491));
																				}
																				Static161.anIntArray145[local760] = local491;
																			}
																			Static604.aStringArray38[local760] = local911;
																			Static359.aStringArray24[local760] = local955;
																			Static381.anIntArray371[local760] = local733;
																			Static679.aBooleanArray30[local760] = local4704;
																			Static600.aBooleanArray28[local760] = local927;
																			local909 = null;
																			break;
																		}
																	}
																	if (local909 != null && Static22.anInt373 < 200) {
																		Static432.aStringArray29[Static22.anInt373] = local909;
																		Static604.aStringArray38[Static22.anInt373] = local911;
																		Static161.anIntArray145[Static22.anInt373] = local491;
																		Static359.aStringArray24[Static22.anInt373] = local955;
																		Static381.anIntArray371[Static22.anInt373] = local733;
																		Static679.aBooleanArray30[Static22.anInt373] = local4704;
																		Static600.aBooleanArray28[Static22.anInt373] = local927;
																		Static22.anInt373++;
																	}
																}
																Static502.anInt8591 = 2;
																Static455.anInt8019 = Static210.anInt3647;
																local102 = Static22.anInt373;
																while (local102 > 0) {
																	local102--;
																	local905 = true;
																	for (local292 = 0; local292 < local102; local292++) {
																		@Pc(4943) boolean local4943 = false;
																		if (Static161.anIntArray145[local292] != Static272.aClass314_7.anInt9072 && Static161.anIntArray145[local292 + 1] == Static272.aClass314_7.anInt9072) {
																			local4943 = true;
																		}
																		if (!local4943 && Static161.anIntArray145[local292] == 0 && Static161.anIntArray145[local292 + 1] != 0) {
																			local4943 = true;
																		}
																		if (!local4943 && !Static600.aBooleanArray28[local292] && Static600.aBooleanArray28[local292 + 1]) {
																			local4943 = true;
																		}
																		if (local4943) {
																			local733 = Static161.anIntArray145[local292];
																			Static161.anIntArray145[local292] = Static161.anIntArray145[local292 + 1];
																			Static161.anIntArray145[local292 + 1] = local733;
																			local322 = Static359.aStringArray24[local292];
																			Static359.aStringArray24[local292] = Static359.aStringArray24[local292 + 1];
																			Static359.aStringArray24[local292 + 1] = local322;
																			local955 = Static432.aStringArray29[local292];
																			Static432.aStringArray29[local292] = Static432.aStringArray29[local292 + 1];
																			Static432.aStringArray29[local292 + 1] = local955;
																			@Pc(5063) String local5063 = Static604.aStringArray38[local292];
																			Static604.aStringArray38[local292] = Static604.aStringArray38[local292 + 1];
																			Static604.aStringArray38[local292 + 1] = local5063;
																			local760 = Static381.anIntArray371[local292];
																			Static381.anIntArray371[local292] = Static381.anIntArray371[local292 + 1];
																			Static381.anIntArray371[local292 + 1] = local760;
																			local2866 = Static679.aBooleanArray30[local292];
																			Static679.aBooleanArray30[local292] = Static679.aBooleanArray30[local292 + 1];
																			Static679.aBooleanArray30[local292 + 1] = local2866;
																			local3999 = Static600.aBooleanArray28[local292];
																			Static600.aBooleanArray28[local292] = Static600.aBooleanArray28[local292 + 1];
																			local905 = false;
																			Static600.aBooleanArray28[local292 + 1] = local3999;
																		}
																	}
																	if (local905) {
																		break;
																	}
																}
																arg0.aClass186_196 = null;
																return true;
															} else if (Static450.aClass186_138 == arg0.aClass186_196) {
																local905 = local11.method5334() == 1;
																local102 = local11.method5323();
																if (Static542.aBoolean669 != local905 || Static59.anInt926 != local102) {
																	Static542.aBoolean669 = local905;
																	Static59.anInt926 = local102;
																	Static185.method2825(Static193.aClass258_5, -1, -1);
																}
																arg0.aClass186_196 = null;
																return true;
															} else if (Static629.aClass186_180 == arg0.aClass186_196) {
																local284 = local11.method5305();
																if (local284 == 65535) {
																	local284 = -1;
																}
																local102 = local11.method5321();
																local292 = local11.method5323();
																local491 = local11.method5305();
																if (local491 == 65535) {
																	local491 = -1;
																}
																Static527.method7469();
																for (local733 = local491; local733 <= local284; local733++) {
																	local1658 = ((long) local292 << 32) + (long) local733;
																	local1664 = (Class3_Sub29) Static356.aClass136_28.method3503(local1658);
																	if (local1664 != null) {
																		local1681 = new Class3_Sub29(local102, local1664.anInt5441);
																		local1664.method9446();
																	} else if (local733 == -1) {
																		local1681 = new Class3_Sub29(local102, Static118.method2045(local292).aClass3_Sub29_1.anInt5441);
																	} else {
																		local1681 = new Class3_Sub29(local102, -1);
																	}
																	Static356.aClass136_28.method3508(local1658, local1681);
																}
																arg0.aClass186_196 = null;
																return true;
															} else if (Static629.aClass186_179 == arg0.aClass186_196) {
																local284 = local11.method5272();
																Static527.method7469();
																Static411.method5564(local284);
																arg0.aClass186_196 = null;
																return true;
															} else {
																@Pc(5384) long local5384;
																if (Static442.aClass186_178 == arg0.aClass186_196) {
																	local905 = local11.method5322(-84) == 1;
																	local909 = local11.method5295();
																	local911 = local909;
																	if (local905) {
																		local911 = local11.method5295();
																	}
																	local5384 = (long) local11.method5272();
																	local1658 = (long) local11.method5307();
																	local756 = local11.method5322(-11);
																	local760 = local11.method5272();
																	@Pc(5405) long local5405 = (local5384 << 32) + local1658;
																	@Pc(5407) boolean local5407 = false;
																	local2974 = 0;
																	while (true) {
																		if (local2974 >= 100) {
																			if (local756 <= 1 && Static517.method7376(local911)) {
																				local5407 = true;
																			}
																			break;
																		}
																		if (Static678.aLongArray26[local2974] == local5405) {
																			local5407 = true;
																			break;
																		}
																		local2974++;
																	}
																	if (!local5407 && Static384.anInt6866 == 0) {
																		Static678.aLongArray26[Static603.anInt9829] = local5405;
																		Static603.anInt9829 = (Static603.anInt9829 + 1) % 100;
																		local4083 = Static558.aClass233_2.method5417(local760).method2543(local11);
																		if (local756 == 2) {
																			Static366.method5247(local760, 0, "<img=1>" + local911, "<img=1>" + local909, local4083, 18, local909, (String) null);
																		} else if (local756 == 1) {
																			Static366.method5247(local760, 0, "<img=0>" + local911, "<img=0>" + local909, local4083, 18, local909, (String) null);
																		} else {
																			Static366.method5247(local760, 0, local911, local909, local4083, 18, local909, (String) null);
																		}
																	}
																	arg0.aClass186_196 = null;
																	return true;
																} else if (arg0.aClass186_196 == Static4.aClass186_2) {
																	local1805 = local11.method5295();
																	@Pc(5575) Object[] local5575 = new Object[local1805.length() + 1];
																	for (local292 = local1805.length() - 1; local292 >= 0; local292--) {
																		if (local1805.charAt(local292) == 's') {
																			local5575[local292 + 1] = local11.method5295();
																		} else {
																			local5575[local292 + 1] = Integer.valueOf(local11.method5312());
																		}
																	}
																	local5575[0] = Integer.valueOf(local11.method5312());
																	Static527.method7469();
																	@Pc(5637) Class3_Sub7 local5637 = new Class3_Sub7();
																	local5637.anObjectArray1 = local5575;
																	Static185.method2811(local5637);
																	arg0.aClass186_196 = null;
																	return true;
																} else if (arg0.aClass186_196 == Static170.aClass186_53) {
																	local284 = local11.method5272();
																	local909 = local11.method5295();
																	local1859 = local11.method5322(-114) == 1;
																	Static703.aBoolean793 = local1859;
																	Static362.aClass314_8 = Static272.aClass314_7;
																	Static611.method7556(local909, local284);
																	Static638.method8657(15);
																	arg0.aClass186_196 = null;
																	return false;
																} else if (Static373.aClass186_117 == arg0.aClass186_196) {
																	local284 = local11.method5293();
																	local102 = local11.method5272();
																	@Pc(5707) int[] local5707 = new int[4];
																	for (local491 = 0; local491 < 4; local491++) {
																		local5707[local491] = local11.method5272();
																	}
																	@Pc(5730) Class3_Sub13 local5730 = (Class3_Sub13) Static612.aClass136_44.method3503((long) local102);
																	if (local5730 != null) {
																		Static192.method2903(local5730.aClass19_Sub1_Sub3_Sub2_Sub1_2, true, local284, local5707);
																	}
																	arg0.aClass186_196 = null;
																	return true;
																} else if (Static181.aClass186_57 == arg0.aClass186_196) {
																	Static664.anInt10583 = local11.method5299() << 3;
																	Static179.anInt3229 = local11.method5330() << 3;
																	Static214.anInt4161 = local11.method5334();
																	while (arg0.anInt11061 > local11.anInt6241) {
																		@Pc(5783) Class206 local5783 = Static590.method8097()[local11.method5322(-15)];
																		Static593.method8151(local5783);
																	}
																	arg0.aClass186_196 = null;
																	return true;
																} else if (arg0.aClass186_196 == Static245.aClass186_122) {
																	local284 = local11.method5321();
																	local102 = local11.method5272();
																	Static527.method7469();
																	Static694.method9099(local102, local284);
																	arg0.aClass186_196 = null;
																	return true;
																} else if (Static268.aClass186_91 == arg0.aClass186_196) {
																	local284 = local11.method5301();
																	if (local284 == 65535) {
																		local284 = -1;
																	}
																	local102 = local11.method5308();
																	local292 = local11.method5334();
																	Static478.method7000(local292, local102, local284);
																	arg0.aClass186_196 = null;
																	return true;
																} else if (arg0.aClass186_196 == Static273.aClass186_94) {
																	local284 = local11.method5303();
																	if (local284 == 65535) {
																		local284 = -1;
																	}
																	local102 = local11.method5322(-24);
																	local292 = local11.method5307();
																	Static434.method5151(local284, local292, local102);
																	arg0.aClass186_196 = null;
																	return true;
																} else if (Static264.aClass186_78 == arg0.aClass186_196) {
																	local284 = local11.method5322(-71);
																	local3731 = local11.method5318();
																	Static527.method7469();
																	Static418.method6196(local284, local3731);
																	arg0.aClass186_196 = null;
																	return true;
																} else if (Static345.aClass186_108 == arg0.aClass186_196) {
																	Static593.method8151(Static372.aClass206_12);
																	arg0.aClass186_196 = null;
																	return true;
																} else if (Static248.aClass186_82 == arg0.aClass186_196) {
																	Static373.anInt6383 = Static210.anInt3647;
																	local905 = local11.method5322(-63) == 1;
																	@Pc(5956) Class341 local5956 = new Class341(local11);
																	@Pc(5960) Class237 local5960;
																	if (local905) {
																		local5960 = Static319.aClass237_7;
																	} else {
																		local5960 = Static474.aClass237_4;
																	}
																	local5956.method8094(local5960);
																	arg0.aClass186_196 = null;
																	return true;
																} else if (Static204.aClass186_65 == arg0.aClass186_196) {
																	local11.anInt6241 += 28;
																	if (local11.method5296()) {
																		Static516.method8186(local11, local11.anInt6241 - 28);
																	}
																	arg0.aClass186_196 = null;
																	return true;
																} else if (arg0.aClass186_196 == Static415.aClass186_130) {
																	local284 = local11.method5321();
																	if (Static543.anInt9107 != local284) {
																		Static543.anInt9107 = local284;
																		Static185.method2825(Static92.aClass258_3, -1, -1);
																	}
																	arg0.aClass186_196 = null;
																	return true;
																} else if (Static220.aClass186_69 == arg0.aClass186_196) {
																	Static412.anInt7313 = local11.method5322(-68);
																	arg0.aClass186_196 = null;
																	return true;
																} else if (Static571.aClass186_165 == arg0.aClass186_196) {
																	local905 = local11.method5322(-67) == 1;
																	local909 = local11.method5295();
																	local911 = local909;
																	if (local905) {
																		local911 = local11.method5295();
																	}
																	local5384 = local11.method5287();
																	local1658 = (long) local11.method5272();
																	local2864 = (long) local11.method5307();
																	local2712 = local11.method5322(-97);
																	@Pc(6105) long local6105 = local2864 + (local1658 << 32);
																	local3326 = false;
																	local3221 = 0;
																	while (true) {
																		if (local3221 >= 100) {
																			if (local2712 <= 1) {
																				if (Static125.aBoolean199 && !Static697.aBoolean790 || Static553.aBoolean677) {
																					local3326 = true;
																				} else if (Static517.method7376(local911)) {
																					local3326 = true;
																				}
																			}
																			break;
																		}
																		if (Static678.aLongArray26[local3221] == local6105) {
																			local3326 = true;
																			break;
																		}
																		local3221++;
																	}
																	if (!local3326 && Static384.anInt6866 == 0) {
																		Static678.aLongArray26[Static603.anInt9829] = local6105;
																		Static603.anInt9829 = (Static603.anInt9829 + 1) % 100;
																		@Pc(6191) String local6191 = Static71.method907(Static20.method334(local11));
																		if (local2712 == 2 || local2712 == 3) {
																			Static366.method5247(-1, 0, "<img=1>" + local911, "<img=1>" + local909, local6191, 9, local909, Static59.method732(local5384));
																		} else if (local2712 == 1) {
																			Static366.method5247(-1, 0, "<img=0>" + local911, "<img=0>" + local909, local6191, 9, local909, Static59.method732(local5384));
																		} else {
																			Static366.method5247(-1, 0, local911, local909, local6191, 9, local909, Static59.method732(local5384));
																		}
																	}
																	arg0.aClass186_196 = null;
																	return true;
																} else if (arg0.aClass186_196 == Static366.aClass186_114) {
																	local284 = local11.method5301();
																	local102 = local11.method5301();
																	local292 = local11.method5308();
																	local491 = local11.method5321();
																	Static527.method7469();
																	Static94.method1281(local102, local292, local491, local284);
																	arg0.aClass186_196 = null;
																	return true;
																} else if (Static343.aClass186_107 == arg0.aClass186_196) {
																	local284 = local11.method5305();
																	if (local284 == 65535) {
																		local284 = -1;
																	}
																	local102 = local11.method5312();
																	Static527.method7469();
																	Static580.method8003(local102, local284);
																	arg0.aClass186_196 = null;
																	return true;
																} else if (arg0.aClass186_196 == Static87.aClass186_24) {
																	local284 = local11.method5272();
																	local102 = local11.method5308();
																	Static527.method7469();
																	if (local102 == 2) {
																		Static435.method6372((byte) 70);
																	}
																	Static633.anInt3426 = local284;
																	Static504.method7229(local284);
																	Static401.method6009(false);
																	Static185.method2812(Static633.anInt3426);
																	for (local292 = 0; local292 < 100; local292++) {
																		Static195.aBooleanArray17[local292] = true;
																	}
																	arg0.aClass186_196 = null;
																	return true;
																} else if (arg0.aClass186_196 == Static591.aClass186_168) {
																	local284 = local11.method5308();
																	local102 = local11.method5303() << 2;
																	local292 = local11.method5293();
																	local491 = local11.method5293();
																	local733 = local11.method5293();
																	Static527.method7469();
																	Static267.method4106(local102, local491, local284, local292, local733);
																	arg0.aClass186_196 = null;
																	return true;
																} else if (arg0.aClass186_196 == Static412.aClass186_129) {
																	if (Static549.method7771(Static178.anInt3225)) {
																		Static49.anInt834 = (int) ((float) local11.method5272() * 2.5F);
																	} else {
																		Static49.anInt834 = local11.method5272() * 30;
																	}
																	Static372.anInt6365 = Static210.anInt3647;
																	arg0.aClass186_196 = null;
																	return true;
																} else if (Static97.aClass186_25 == arg0.aClass186_196) {
																	local905 = local11.method5322(-119) == 1;
																	local909 = local11.method5295();
																	local911 = local909;
																	if (local905) {
																		local911 = local11.method5295();
																	}
																	local5384 = local11.method5287();
																	local1658 = (long) local11.method5272();
																	local2864 = (long) local11.method5307();
																	local2712 = local11.method5322(-116);
																	local3154 = local11.method5272();
																	@Pc(6553) long local6553 = (local1658 << 32) + local2864;
																	local3515 = false;
																	local3223 = 0;
																	while (true) {
																		if (local3223 >= 100) {
																			if (local2712 <= 1 && Static517.method7376(local911)) {
																				local3515 = true;
																			}
																			break;
																		}
																		if (local6553 == Static678.aLongArray26[local3223]) {
																			local3515 = true;
																			break;
																		}
																		local3223++;
																	}
																	if (!local3515 && Static384.anInt6866 == 0) {
																		Static678.aLongArray26[Static603.anInt9829] = local6553;
																		Static603.anInt9829 = (Static603.anInt9829 + 1) % 100;
																		@Pc(6625) String local6625 = Static558.aClass233_2.method5417(local3154).method2543(local11);
																		if (local2712 == 2) {
																			Static366.method5247(local3154, 0, "<img=1>" + local911, "<img=1>" + local909, local6625, 20, local909, Static59.method732(local5384));
																		} else if (local2712 == 1) {
																			Static366.method5247(local3154, 0, "<img=0>" + local911, "<img=0>" + local909, local6625, 20, local909, Static59.method732(local5384));
																		} else {
																			Static366.method5247(local3154, 0, local911, local909, local6625, 20, local909, Static59.method732(local5384));
																		}
																	}
																	arg0.aClass186_196 = null;
																	return true;
																} else if (arg0.aClass186_196 == Static102.aClass186_28) {
																	local284 = local11.method5321();
																	Static527.method7469();
																	Static219.method3499(3, -1, local284, -1);
																	arg0.aClass186_196 = null;
																	return true;
																} else if (Static395.aClass186_124 == arg0.aClass186_196) {
																	Static280.method4255();
																	arg0.aClass186_196 = null;
																	return false;
																} else if (Static335.aClass186_104 == arg0.aClass186_196) {
																	local284 = local11.method5305();
																	local102 = local11.method5321();
																	Static527.method7469();
																	Static109.method1953(local284, local102);
																	arg0.aClass186_196 = null;
																	return true;
																} else if (Static2.aClass186_192 == arg0.aClass186_196) {
																	Static593.method8151(Static333.aClass206_10);
																	arg0.aClass186_196 = null;
																	return true;
																} else if (Static439.aClass186_135 == arg0.aClass186_196) {
																	local905 = local11.method5322(-17) == 1;
																	local909 = local11.method5295();
																	local911 = local909;
																	if (local905) {
																		local911 = local11.method5295();
																	}
																	local5384 = (long) local11.method5272();
																	local1658 = (long) local11.method5307();
																	local756 = local11.method5322(-29);
																	local3997 = (local5384 << 32) + local1658;
																	local3999 = false;
																	local2883 = 0;
																	while (true) {
																		if (local2883 >= 100) {
																			if (local756 <= 1) {
																				if (Static125.aBoolean199 && !Static697.aBoolean790 || Static553.aBoolean677) {
																					local3999 = true;
																				} else if (Static517.method7376(local911)) {
																					local3999 = true;
																				}
																			}
																			break;
																		}
																		if (Static678.aLongArray26[local2883] == local3997) {
																			local3999 = true;
																			break;
																		}
																		local2883++;
																	}
																	if (!local3999 && Static384.anInt6866 == 0) {
																		Static678.aLongArray26[Static603.anInt9829] = local3997;
																		Static603.anInt9829 = (Static603.anInt9829 + 1) % 100;
																		local2967 = Static71.method907(Static20.method334(local11));
																		if (local756 == 2) {
																			Static366.method5247(-1, 0, "<img=1>" + local911, "<img=1>" + local909, local2967, 7, local909, (String) null);
																		} else if (local756 == 1) {
																			Static366.method5247(-1, 0, "<img=0>" + local911, "<img=0>" + local909, local2967, 7, local909, (String) null);
																		} else {
																			Static366.method5247(-1, 0, local911, local909, local2967, 3, local909, (String) null);
																		}
																	}
																	arg0.aClass186_196 = null;
																	return true;
																} else if (arg0.aClass186_196 == Static360.aClass186_112) {
																	local284 = local11.method5323();
																	Static527.method7469();
																	Static219.method3499(5, Static584.anInt9539, local284, 0);
																	arg0.aClass186_196 = null;
																	return true;
																} else if (arg0.aClass186_196 == Static149.aClass186_46) {
																	local284 = local11.method5314();
																	local2314 = local11.method5293() == 1;
																	Static527.method7469();
																	Static10.method139(local2314, local284);
																	arg0.aClass186_196 = null;
																	return true;
																} else if (Static118.aClass186_38 == arg0.aClass186_196) {
																	Static593.method8151(Static354.aClass206_11);
																	arg0.aClass186_196 = null;
																	return true;
																} else if (arg0.aClass186_196 == Static337.aClass186_105) {
																	Static593.method8151(Static152.aClass206_5);
																	arg0.aClass186_196 = null;
																	return true;
																} else if (Static604.aClass186_173 == arg0.aClass186_196) {
																	Static483.method7049(Static284.aBoolean447);
																	arg0.aClass186_196 = null;
																	return false;
																} else if (Static237.aClass186_198 == arg0.aClass186_196) {
																	local284 = local11.method5303();
																	local102 = local11.method5322(-26);
																	Static577.aClass362_1.method8668(local284, local102);
																	arg0.aClass186_196 = null;
																	return true;
																} else if (arg0.aClass186_196 == Static183.aClass186_58) {
																	local1805 = local11.method5295();
																	local1859 = local11.method5322(-48) == 1;
																	if (local1859) {
																		local909 = local11.method5295();
																	} else {
																		local909 = local1805;
																	}
																	local491 = local11.method5272();
																	@Pc(7178) byte local7178 = local11.method5288();
																	local927 = false;
																	if (local7178 == -128) {
																		local927 = true;
																	}
																	if (local927) {
																		if (Static621.anInt10020 == 0) {
																			arg0.aClass186_196 = null;
																			return true;
																		}
																		for (local750 = 0; Static621.anInt10020 > local750 && (!Static303.aClass101Array1[local750].aString55.equals(local909) || Static303.aClass101Array1[local750].anInt2926 != local491); local750++) {
																		}
																		if (Static621.anInt10020 > local750) {
																			while (local750 < Static621.anInt10020 - 1) {
																				Static303.aClass101Array1[local750] = Static303.aClass101Array1[local750 + 1];
																				local750++;
																			}
																			Static621.anInt10020--;
																			Static303.aClass101Array1[Static621.anInt10020] = null;
																		}
																	} else {
																		local955 = local11.method5295();
																		local2730 = new Class101();
																		local2730.aString55 = local909;
																		local2730.aString53 = local1805;
																		local2730.aString54 = Static282.method4264(local2730.aString55);
																		local2730.anInt2926 = local491;
																		local2730.aString52 = local955;
																		local2730.aByte45 = local7178;
																		for (local760 = Static621.anInt10020 - 1; local760 >= 0; local760--) {
																			local2712 = Static303.aClass101Array1[local760].aString54.compareTo(local2730.aString54);
																			if (local2712 == 0) {
																				Static303.aClass101Array1[local760].anInt2926 = local491;
																				Static303.aClass101Array1[local760].aByte45 = local7178;
																				Static303.aClass101Array1[local760].aString52 = local955;
																				if (local909.equals(Static251.aClass19_Sub1_Sub3_Sub2_Sub2_2.aString109)) {
																					Static438.aByte112 = local7178;
																				}
																				arg0.aClass186_196 = null;
																				Static708.anInt11073 = Static210.anInt3647;
																				return true;
																			}
																			if (local2712 < 0) {
																				break;
																			}
																		}
																		if (Static303.aClass101Array1.length <= Static621.anInt10020) {
																			arg0.aClass186_196 = null;
																			return true;
																		}
																		for (local2712 = Static621.anInt10020 - 1; local2712 > local760; local2712--) {
																			Static303.aClass101Array1[local2712 + 1] = Static303.aClass101Array1[local2712];
																		}
																		if (Static621.anInt10020 == 0) {
																			Static303.aClass101Array1 = new Class101[100];
																		}
																		Static303.aClass101Array1[local760 + 1] = local2730;
																		Static621.anInt10020++;
																		if (local909.equals(Static251.aClass19_Sub1_Sub3_Sub2_Sub2_2.aString109)) {
																			Static438.aByte112 = local7178;
																		}
																	}
																	arg0.aClass186_196 = null;
																	Static708.anInt11073 = Static210.anInt3647;
																	return true;
																} else if (arg0.aClass186_196 == Static425.aClass186_133) {
																	Static483.method7049(false);
																	arg0.aClass186_196 = null;
																	return false;
																} else if (arg0.aClass186_196 == Static16.aClass186_7) {
																	Static619.anInt11274 = local11.method5322(-34);
																	Static372.anInt6365 = Static210.anInt3647;
																	arg0.aClass186_196 = null;
																	return true;
																} else if (arg0.aClass186_196 == Static688.aClass186_9) {
																	local284 = local11.method5334();
																	local102 = local11.method5272();
																	if (local102 == 65535) {
																		local102 = -1;
																	}
																	local292 = local11.method5322(-68);
																	local294 = local11.method5295();
																	if (local292 >= 1 && local292 <= 8) {
																		if (local294.equalsIgnoreCase("null")) {
																			local294 = null;
																		}
																		Static426.aStringArray28[local292 - 1] = local294;
																		Static169.anIntArray154[local292 - 1] = local102;
																		Static96.aBooleanArray2[local292 - 1] = local284 == 0;
																	}
																	arg0.aClass186_196 = null;
																	return true;
																} else if (arg0.aClass186_196 == Static260.aClass186_88) {
																	arg0.aClass186_196 = null;
																	Static398.anObjectArray37 = new Object[Static101.aClass125_1.anInt3485];
																	return true;
																} else if (Static12.aClass186_6 == arg0.aClass186_196) {
																	local284 = local11.method5272();
																	if (local284 == 65535) {
																		local284 = -1;
																	}
																	local102 = local11.method5322(-124);
																	local292 = local11.method5272();
																	local491 = local11.method5322(-41);
																	local733 = local11.method5272();
																	Static146.method2412(local733, local491, local292, false, local102, local284);
																	arg0.aClass186_196 = null;
																	return true;
																} else if (Static411.aClass186_120 == arg0.aClass186_196) {
																	if (Static691.aFrame2 != null) {
																		Static354.method5127(-1, -1, false, Static713.aClass3_Sub55_31.aClass15_Sub23_1.method7900());
																	}
																	local2232 = new byte[arg0.anInt11061];
																	local11.method5337(local2232, arg0.anInt11061);
																	local909 = Static358.method5137(local2232, arg0.anInt11061, 0);
																	local911 = "opensn";
																	if (!Static215.aBoolean348 || Static97.method1297(Static310.aClass47_4, local911, 1, local909).anInt5729 == 2) {
																		Static177.method5465(local909, Static310.aClass47_4, Static713.aClass3_Sub55_31.aClass15_Sub4_1.method1071() == 1, true, local911);
																	}
																	arg0.aClass186_196 = null;
																	return true;
																} else if (arg0.aClass186_196 == Static115.aClass186_37) {
																	local284 = local11.method5272();
																	@Pc(7714) Class19_Sub1_Sub3_Sub2_Sub2 local7714;
																	if (Static584.anInt9539 == local284) {
																		local7714 = Static251.aClass19_Sub1_Sub3_Sub2_Sub2_2;
																	} else {
																		local7714 = Static681.aClass19_Sub1_Sub3_Sub2_Sub2Array1[local284];
																	}
																	if (local7714 == null) {
																		arg0.aClass186_196 = null;
																		return true;
																	}
																	local292 = local11.method5272();
																	local491 = local11.method5322(-57);
																	local1130 = (local292 & 0x8000) != 0;
																	if (local7714.aString109 != null && local7714.aClass236_1 != null) {
																		local927 = false;
																		if (local491 <= 1) {
																			if (!local1130 && (Static125.aBoolean199 && !Static697.aBoolean790 || Static553.aBoolean677)) {
																				local927 = true;
																			} else if (Static517.method7376(local7714.aString109)) {
																				local927 = true;
																			}
																		}
																		if (!local927 && Static384.anInt6866 == 0) {
																			local756 = -1;
																			if (local1130) {
																				local292 &= 0x7FFF;
																				@Pc(7821) Class260 local7821 = Static121.method2070(local11);
																				local756 = local7821.anInt7607;
																				local955 = local7821.aClass3_Sub4_Sub6_1.method2543(local11);
																			} else {
																				local955 = Static71.method907(Static20.method334(local11));
																			}
																			local7714.method6610(local292 & 0xFF, local955.trim(), local292 >> 8);
																			if (local491 == 1 || local491 == 2) {
																				local760 = local1130 ? 17 : 1;
																			} else {
																				local760 = local1130 ? 17 : 2;
																			}
																			if (local491 == 2) {
																				Static366.method5247(local756, 0, "<img=1>" + local7714.method6618(), "<img=1>" + local7714.method6622(), local955, local760, local7714.aString108, (String) null);
																			} else if (local491 == 1) {
																				Static366.method5247(local756, 0, "<img=0>" + local7714.method6618(), "<img=0>" + local7714.method6622(), local955, local760, local7714.aString108, (String) null);
																			} else {
																				Static366.method5247(local756, 0, local7714.method6618(), local7714.method6622(), local955, local760, local7714.aString108, (String) null);
																			}
																		}
																	}
																	arg0.aClass186_196 = null;
																	return true;
																} else if (arg0.aClass186_196 == Static564.aClass186_159) {
																	arg0.aClass186_196 = null;
																	return false;
																} else if (arg0.aClass186_196 == Static565.aClass186_162) {
																	local284 = local11.method5272();
																	if (local284 == 65535) {
																		local284 = -1;
																	}
																	local102 = local11.method5322(-91);
																	local292 = local11.method5272();
																	local491 = local11.method5322(-56);
																	Static146.method2412(256, local491, local292, true, local102, local284);
																	arg0.aClass186_196 = null;
																	return true;
																} else if (Static35.aClass186_11 == arg0.aClass186_196) {
																	local284 = local11.method5312();
																	local102 = local11.method5312();
																	@Pc(8051) Class3_Sub48 local8051 = Static89.method1200(Static232.aClass286_40, arg0.aClass399_2);
																	local8051.aClass3_Sub28_Sub2_1.method5311(local284);
																	local8051.aClass3_Sub28_Sub2_1.method5311(local102);
																	arg0.method9223(local8051);
																	arg0.aClass186_196 = null;
																	return true;
																} else if (arg0.aClass186_196 == Static25.aClass186_10) {
																	local284 = local11.method5272();
																	local102 = local11.method5312();
																	if (Static398.anObjectArray37 == null) {
																		Static398.anObjectArray37 = new Object[Static101.aClass125_1.anInt3485];
																	}
																	Static398.anObjectArray37[local284] = Integer.valueOf(local102);
																	Static298.anIntArray220[Static436.anInt7615++ & 0x1F] = local284;
																	arg0.aClass186_196 = null;
																	return true;
																} else if (arg0.aClass186_196 == Static193.aClass186_61) {
																	local284 = local11.method5323();
																	local102 = local11.method5301();
																	Static527.method7469();
																	if (local102 == 65535) {
																		local102 = -1;
																	}
																	Static219.method3499(1, local102, local284, -1);
																	arg0.aClass186_196 = null;
																	return true;
																} else if (arg0.aClass186_196 == Static398.aClass186_126) {
																	local284 = local11.method5272();
																	Static587.anInt9587 = local284;
																	Static675.anInt10693 = -1;
																	Static334.anInt5845 = 1;
																	Static406.aClass221_116.method5068(Static587.anInt9587);
																	local102 = local11.method5272();
																	Static316.anIntArrayArray36 = new int[local102][4];
																	for (local292 = 0; local292 < local102; local292++) {
																		for (local491 = 0; local491 < 4; local491++) {
																			Static316.anIntArrayArray36[local292][local491] = local11.method5312();
																		}
																	}
																	local491 = local11.method5322(-44);
																	Static247.aClass3_Sub28_8 = new Class3_Sub28(local491);
																	Static247.aClass3_Sub28_8.method5274(local491, local11.aByteArray50, local11.anInt6241);
																	local11.anInt6241 += local491;
																	arg0.aClass186_196 = null;
																	return false;
																} else if (Static77.aClass186_22 == arg0.aClass186_196) {
																	local284 = local11.method5293();
																	local102 = local11.method5272();
																	local1859 = (local284 & 0x1) == 1;
																	Static618.method5117(local102, local1859);
																	Static162.anIntArray146[Static267.anInt4865++ & 0x1F] = local102;
																	arg0.aClass186_196 = null;
																	return true;
																} else if (Static590.aClass186_167 == arg0.aClass186_196) {
																	Static97.method1289(Static310.aClass47_4, arg0.anInt11061, local11);
																	arg0.aClass186_196 = null;
																	return true;
																} else if (Static264.aClass186_77 == arg0.aClass186_196) {
																	@Pc(8307) byte local8307 = local11.method5318();
																	local102 = local11.method5305();
																	Static527.method7469();
																	Static659.method8815(local8307, local102);
																	arg0.aClass186_196 = null;
																	return true;
																} else if (arg0.aClass186_196 == Static675.aClass186_189) {
																	local284 = local11.method5322(-39);
																	local102 = local11.method5312();
																	Static527.method7469();
																	Static37.method557(local102, local284);
																	arg0.aClass186_196 = null;
																	return true;
																} else if (Static256.aClass186_181 == arg0.aClass186_196) {
																	local284 = local11.method5272();
																	local102 = local11.method5272();
																	local292 = local11.method5272();
																	Static527.method7469();
																	if (Static403.aClass20ArrayArray2[local284] != null) {
																		for (local491 = local102; local491 < local292; local491++) {
																			local733 = local11.method5307();
																			if (Static403.aClass20ArrayArray2[local284].length > local491 && Static403.aClass20ArrayArray2[local284][local491] != null) {
																				Static403.aClass20ArrayArray2[local284][local491].anInt590 = local733;
																			}
																		}
																	}
																	arg0.aClass186_196 = null;
																	return true;
																} else if (Static408.aClass186_127 == arg0.aClass186_196) {
																	Static204.method3025();
																	arg0.aClass186_196 = null;
																	return true;
																} else if (Static203.aClass186_64 == arg0.aClass186_196) {
																	Static398.anObjectArray37 = null;
																	arg0.aClass186_196 = null;
																	return true;
																} else if (Static571.aClass186_164 == arg0.aClass186_196) {
																	Static593.method8151(Static710.aClass206_18);
																	arg0.aClass186_196 = null;
																	return true;
																} else if (arg0.aClass186_196 == Static382.aClass186_121) {
																	local284 = local11.method5322(-24);
																	local102 = local284 >> 5;
																	local292 = local284 & 0x1F;
																	if (local292 == 0) {
																		Static672.aClass387Array1[local102] = null;
																		arg0.aClass186_196 = null;
																		return true;
																	}
																	@Pc(8485) Class387 local8485 = new Class387();
																	local8485.anInt10809 = local292;
																	local8485.anInt10810 = local11.method5322(-47);
																	if (local8485.anInt10810 >= 0 && local8485.anInt10810 < Static430.aClass9Array26.length) {
																		if (local8485.anInt10809 == 1 || local8485.anInt10809 == 10) {
																			local8485.anInt10811 = local11.method5272();
																			local8485.anInt10812 = local11.method5272();
																			local11.anInt6241 += 4;
																		} else if (local8485.anInt10809 >= 2 && local8485.anInt10809 <= 6) {
																			if (local8485.anInt10809 == 2) {
																				local8485.anInt10805 = 256;
																				local8485.anInt10808 = 256;
																			}
																			if (local8485.anInt10809 == 3) {
																				local8485.anInt10805 = 0;
																				local8485.anInt10808 = 256;
																			}
																			if (local8485.anInt10809 == 4) {
																				local8485.anInt10808 = 256;
																				local8485.anInt10805 = 512;
																			}
																			if (local8485.anInt10809 == 5) {
																				local8485.anInt10808 = 0;
																				local8485.anInt10805 = 256;
																			}
																			if (local8485.anInt10809 == 6) {
																				local8485.anInt10805 = 256;
																				local8485.anInt10808 = 512;
																			}
																			local8485.anInt10809 = 2;
																			local8485.anInt10815 = local11.method5322(-17);
																			local8485.anInt10805 += local11.method5272() - Static714.anInt11156 << 9;
																			local8485.anInt10808 += local11.method5272() - Static339.anInt5859 << 9;
																			local8485.anInt10813 = local11.method5322(-89) << 2;
																			local8485.anInt10807 = local11.method5272();
																		}
																		local8485.anInt10806 = local11.method5272();
																		if (local8485.anInt10806 == 65535) {
																			local8485.anInt10806 = -1;
																		}
																		Static672.aClass387Array1[local102] = local8485;
																	}
																	arg0.aClass186_196 = null;
																	return true;
																} else if (Static478.aClass186_144 == arg0.aClass186_196) {
																	local284 = local11.method5305();
																	local3731 = local11.method5318();
																	Static577.aClass362_1.method8662(local284, local3731);
																	arg0.aClass186_196 = null;
																	return true;
																} else if (arg0.aClass186_196 == Static548.aClass186_155) {
																	local284 = local11.method5303();
																	local909 = local11.method5295();
																	Static527.method7469();
																	Static256.method8576(local284, local909);
																	arg0.aClass186_196 = null;
																	return true;
																} else if (Static172.aClass186_54 == arg0.aClass186_196) {
																	local1805 = local11.method5295();
																	local102 = local11.method5305();
																	Static527.method7469();
																	Static256.method8576(local102, local1805);
																	arg0.aClass186_196 = null;
																	return true;
																} else if (arg0.aClass186_196 == Static480.aClass186_145) {
																	local284 = local11.method5293();
																	Static527.method7469();
																	Static303.anInt5471 = local284;
																	arg0.aClass186_196 = null;
																	return true;
																} else if (arg0.aClass186_196 == Static52.aClass186_16) {
																	local284 = local11.method5305();
																	local102 = local11.method5308();
																	Static527.method7469();
																	Static712.method9280(true, local102, local284);
																	arg0.aClass186_196 = null;
																	return true;
																} else if (arg0.aClass186_196 == Static681.aClass186_190) {
																	Static612.anInt9909 = local11.method5281();
																	arg0.aClass186_196 = null;
																	Static372.anInt6365 = Static210.anInt3647;
																	return true;
																} else if (arg0.aClass186_196 == Static373.aClass186_118) {
																	Static179.anInt3229 = local11.method5288() << 3;
																	Static214.anInt4161 = local11.method5334();
																	Static664.anInt10583 = local11.method5299() << 3;
																	for (@Pc(8860) Class3_Sub20 local8860 = (Class3_Sub20) Static46.aClass136_5.method3509(); local8860 != null; local8860 = (Class3_Sub20) Static46.aClass136_5.method3506()) {
																		local102 = (int) (local8860.aLong382 >> 28 & 0x3L);
																		local292 = (int) (local8860.aLong382 & 0x3FFFL);
																		local491 = local292 - Static714.anInt11156;
																		local733 = (int) (local8860.aLong382 >> 14 & 0x3FFFL);
																		local744 = local733 - Static339.anInt5859;
																		if (Static214.anInt4161 == local102 && local491 >= Static664.anInt10583 && Static664.anInt10583 + 8 > local491 && Static179.anInt3229 <= local744 && local744 < Static179.anInt3229 + 8) {
																			local8860.method9446();
																			if (local491 >= 0 && local744 >= 0 && local491 < Static362.anInt8653 && Static206.anInt11291 > local744) {
																				Static535.method7523(local744, Static214.anInt4161, local491);
																			}
																		}
																	}
																	@Pc(8972) Class3_Sub53 local8972;
																	for (local8972 = (Class3_Sub53) Static423.aClass357_43.method8391(); local8972 != null; local8972 = (Class3_Sub53) Static423.aClass357_43.method8392()) {
																		if (local8972.anInt10319 >= Static664.anInt10583 && Static664.anInt10583 + 8 > local8972.anInt10319 && Static179.anInt3229 <= local8972.anInt10317 && Static179.anInt3229 + 8 > local8972.anInt10317 && local8972.anInt10313 == Static214.anInt4161) {
																			local8972.aBoolean745 = true;
																		}
																	}
																	for (local8972 = (Class3_Sub53) Static3.aClass357_1.method8391(); local8972 != null; local8972 = (Class3_Sub53) Static3.aClass357_1.method8392()) {
																		if (Static664.anInt10583 <= local8972.anInt10319 && Static664.anInt10583 + 8 > local8972.anInt10319 && local8972.anInt10317 >= Static179.anInt3229 && local8972.anInt10317 < Static179.anInt3229 + 8 && Static214.anInt4161 == local8972.anInt10313) {
																			local8972.aBoolean745 = true;
																		}
																	}
																	arg0.aClass186_196 = null;
																	return true;
																} else if (Static552.aClass186_156 == arg0.aClass186_196) {
																	Static564.method7849(local11, arg0.anInt11061);
																	arg0.aClass186_196 = null;
																	return true;
																} else if (Static386.aClass186_86 == arg0.aClass186_196) {
																	local284 = local11.method5281();
																	local102 = local11.method5281();
																	local292 = local11.method5314();
																	Static527.method7469();
																	Static595.method8198(local292, local284, local102);
																	arg0.aClass186_196 = null;
																	return true;
																} else if (Static273.aClass186_95 == arg0.aClass186_196) {
																	local284 = local11.method5321();
																	Static527.method7469();
																	@Pc(9166) Class3_Sub52 local9166 = (Class3_Sub52) Static170.aClass136_19.method3503((long) local284);
																	if (local9166 != null) {
																		Static65.method813(true, false, local9166);
																	}
																	if (Static70.aClass20_4 != null) {
																		Static391.method5905(Static70.aClass20_4);
																		Static70.aClass20_4 = null;
																	}
																	arg0.aClass186_196 = null;
																	return true;
																} else if (arg0.aClass186_196 == Static231.aClass186_75) {
																	local284 = local11.method5323();
																	local102 = local11.method5272();
																	local292 = local11.method5305();
																	local491 = local11.method5293();
																	Static527.method7469();
																	Static459.method2096(local491, local102, local284, local292);
																	arg0.aClass186_196 = null;
																	return true;
																} else if (arg0.aClass186_196 == Static147.aClass186_44) {
																	Static327.aBoolean469 = local11.method5322(-57) == 1;
																	arg0.aClass186_196 = null;
																	return true;
																} else if (Static341.aClass186_106 == arg0.aClass186_196) {
																	local284 = local11.method5305();
																	local102 = local11.method5272();
																	Static527.method7469();
																	Static188.method2869(local284, local102);
																	arg0.aClass186_196 = null;
																	return true;
																} else {
																	Static64.method799("T1 - " + (arg0.aClass186_196 == null ? -1 : arg0.aClass186_196.method4640()) + "," + (arg0.aClass186_194 == null ? -1 : arg0.aClass186_194.method4640()) + "," + (arg0.aClass186_195 == null ? -1 : arg0.aClass186_195.method4640()) + " - " + arg0.anInt11061, (Throwable) null);
																	Static483.method7049(false);
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
	}
}
