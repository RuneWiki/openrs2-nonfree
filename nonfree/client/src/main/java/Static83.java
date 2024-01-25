import java.awt.Color;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static83 {

	@OriginalMember(owner = "client!client", name = "jb", descriptor = "D")
	public static double aDouble29;

	@OriginalMember(owner = "client!client", name = "Bb", descriptor = "Lclient!ha;")
	public static Class132 aClass132_3;

	@OriginalMember(owner = "client!client", name = "Eb", descriptor = "I")
	public static int anInt1652;

	@OriginalMember(owner = "client!client", name = "zb", descriptor = "[Lclient!sn;")
	public static final Class324[] aClass324Array1 = new Class324[4];

	@OriginalMember(owner = "client!client", name = "Cb", descriptor = "[I")
	public static final int[] anIntArray90 = new int[2];

	@OriginalMember(owner = "client!client", name = "Db", descriptor = "[Ljava/awt/Color;")
	public static final Color[] aColorArray1 = new Color[] { new Color(9179409), new Color(16777215), new Color(16726277), new Color(16726277) };

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(I)V")
	public static void method1447(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = Static475.anInt8165;
		@Pc(3) int[] local3 = Static75.anIntArray82;
		for (@Pc(5) int local5 = 0; local5 < local1 + Static133.anInt2316; local5++) {
			@Pc(15) Class2_Sub1_Sub1_Sub3 local15;
			if (local5 < local1) {
				local15 = Static20.aClass2_Sub1_Sub1_Sub3_Sub1Array1[local3[local5]];
			} else {
				local15 = ((Class6_Sub44) Static349.aClass209_32.method5038((long) Static74.anIntArray80[local5 - local1])).aClass2_Sub1_Sub1_Sub3_Sub2_2;
			}
			if (local15.aByte140 == arg0 && local15.anInt5113 >= 0) {
				@Pc(39) int local39 = local15.method4326();
				if ((local39 & 0x1) == 0) {
					if ((local15.anInt10006 & 0x1FF) != 0 || (local15.anInt10001 & 0x1FF) != 0) {
						continue;
					}
				} else if ((local15.anInt10006 & 0x1FF) != 256 || (local15.anInt10001 & 0x1FF) != 256) {
					continue;
				}
				@Pc(75) int local75;
				@Pc(80) int local80;
				@Pc(116) int local116;
				if (local39 == 1) {
					local75 = local15.anInt10006 >> 9;
					local80 = local15.anInt10001 >> 9;
					if (local15.anInt5113 > Static52.anIntArrayArray4[local75][local80]) {
						Static52.anIntArrayArray4[local75][local80] = local15.anInt5113;
						Static121.anIntArrayArray11[local75][local80] = 1;
					} else if (local15.anInt5113 == Static52.anIntArrayArray4[local75][local80]) {
						local116 = Static121.anIntArrayArray11[local75][local80]++;
					}
				} else {
					local75 = (local39 - 1) * 256 + 60;
					local80 = local15.anInt10006 - local75 >> 9;
					@Pc(142) int local142 = local15.anInt10001 - local75 >> 9;
					@Pc(149) int local149 = local15.anInt10006 + local75 >> 9;
					@Pc(156) int local156 = local15.anInt10001 + local75 >> 9;
					for (@Pc(158) int local158 = local80; local158 <= local149; local158++) {
						for (@Pc(161) int local161 = local142; local161 <= local156; local161++) {
							if (local15.anInt5113 > Static52.anIntArrayArray4[local158][local161]) {
								Static52.anIntArrayArray4[local158][local161] = local15.anInt5113;
								Static121.anIntArrayArray11[local158][local161] = 1;
							} else if (local15.anInt5113 == Static52.anIntArrayArray4[local158][local161]) {
								local116 = Static121.anIntArrayArray11[local158][local161]++;
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "()V")
	public static void method1448() {
		@Pc(1) int local1 = Static475.anInt8165;
		@Pc(3) int[] local3 = Static75.anIntArray82;
		@Pc(11) int local11 = Static462.aBoolean552 ? local1 : local1 + Static133.anInt2316;
		for (@Pc(13) int local13 = 0; local13 < local11; local13++) {
			@Pc(23) Class2_Sub1_Sub1_Sub3 local23;
			if (local13 < local1) {
				local23 = Static20.aClass2_Sub1_Sub1_Sub3_Sub1Array1[local3[local13]];
			} else {
				local23 = ((Class6_Sub44) Static349.aClass209_32.method5038((long) Static74.anIntArray80[local13 - local1])).aClass2_Sub1_Sub1_Sub3_Sub2_2;
			}
			if (local23.anInt5113 >= 0) {
				@Pc(43) int local43 = local23.method4326();
				if ((local43 & 0x1) == 0) {
					if ((local23.anInt10006 & 0x1FF) == 0 && (local23.anInt10001 & 0x1FF) == 0) {
						continue;
					}
				} else if ((local23.anInt10006 & 0x1FF) == 256 && (local23.anInt10001 & 0x1FF) == 256) {
					continue;
				}
				local23.anInt10004 = Static284.method4118(local23.anInt10006, local23.aByte140, local23.anInt10001);
				Static23.method582(local23, true);
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "()V")
	public static void method1449() {
		Static478.anInt8214 = 0;
		for (@Pc(3) int local3 = 0; local3 < Static133.anInt2316; local3++) {
			@Pc(14) Class2_Sub1_Sub1_Sub3_Sub2 local14 = ((Class6_Sub44) Static349.aClass209_32.method5038((long) Static74.anIntArray80[local3])).aClass2_Sub1_Sub1_Sub3_Sub2_2;
			if (local14.aBoolean329 && local14.method4330() != -1) {
				@Pc(32) int local32 = (local14.method4326() - 1) * 256 + 252;
				@Pc(39) int local39 = local14.anInt10006 - local32 >> 9;
				@Pc(46) int local46 = local14.anInt10001 - local32 >> 9;
				@Pc(53) Class2_Sub1_Sub1_Sub3 local53 = Static57.method1081(local46, local39, local14.aByte140);
				if (local53 != null) {
					@Pc(58) int local58 = local53.anInt5103;
					if (local53 instanceof Class2_Sub1_Sub1_Sub3_Sub2) {
						local58 += 2048;
					}
					if (local53.anInt5064 == 0 && local53.method4330() != -1) {
						Static428.anIntArray459[Static478.anInt8214] = local58;
						Static524.anIntArray626[Static478.anInt8214] = local58;
						Static478.anInt8214++;
						local53.anInt5064++;
					}
					Static428.anIntArray459[Static478.anInt8214] = local58;
					Static524.anIntArray626[Static478.anInt8214] = local14.anInt5103 + 2048;
					Static478.anInt8214++;
					local53.anInt5064++;
				}
			}
		}
		Static114.method1814(Static478.anInt8214 - 1, 0, Static524.anIntArray626, Static428.anIntArray459);
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!sha;)Lclient!np;")
	public static Class6_Sub42 method1453(@OriginalArg(0) Class321 arg0) {
		@Pc(13) Class6_Sub42 local13 = (Class6_Sub42) Static345.aClass209_31.method5038(((long) arg0.anInt9040 << 32) + (long) arg0.anInt9061);
		return local13 == null ? arg0.aClass6_Sub42_2 : local13;
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;B)I")
	public static int method1454(@OriginalArg(0) String arg0) {
		return arg0.length() + 2;
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "()V")
	public static void method1455() {
		for (@Pc(1) int local1 = 0; local1 < Static491.anInt9856; local1++) {
			@Pc(6) int[] local6 = Static52.anIntArrayArray4[local1];
			for (@Pc(8) int local8 = 0; local8 < Static393.anInt6574; local8++) {
				local6[local8] = 0;
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(II)V")
	public static void method1457(@OriginalArg(1) int arg0) {
		@Pc(9) Class6_Sub4_Sub18 local9 = Static565.method7924((long) arg0, 9);
		local9.method7979();
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Lclient!sha;)Lclient!sha;")
	public static Class321 method1458(@OriginalArg(0) Class321 arg0) {
		@Pc(4) int local4 = method1453(arg0).method5793();
		if (local4 == 0) {
			return null;
		}
		for (@Pc(10) int local10 = 0; local10 < local4; local10++) {
			arg0 = Static286.method4134(arg0.anInt9033);
			if (arg0 == null) {
				return null;
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "([Lclient!sha;IIIIIIIIIII)V")
	public static void method1459(@OriginalArg(0) Class321[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11) {
		label812: for (@Pc(1) int local1 = 0; local1 < arg0.length; local1++) {
			@Pc(6) Class321 local6 = arg0[local1];
			if (local6 != null && local6.anInt9033 == arg1) {
				@Pc(17) int local17 = local6.anInt9016 + arg6;
				@Pc(22) int local22 = local6.anInt9072 + arg7;
				@Pc(28) int local28;
				@Pc(30) int local30;
				@Pc(32) int local32;
				@Pc(34) int local34;
				@Pc(40) int local40;
				@Pc(45) int local45;
				if (local6.anInt9105 == 2) {
					local28 = arg2;
					local30 = arg3;
					local32 = arg4;
					local34 = arg5;
				} else {
					local40 = local17 + local6.anInt9103;
					local45 = local22 + local6.anInt9077;
					if (local6.anInt9105 == 9) {
						local40++;
						local45++;
					}
					local28 = local17 > arg2 ? local17 : arg2;
					local30 = local22 > arg3 ? local22 : arg3;
					local32 = local40 < arg4 ? local40 : arg4;
					local34 = local45 < arg5 ? local45 : arg5;
				}
				if (local6.anInt9105 == 0 || local6.aBoolean655 || method1453(local6).anInt6747 != 0 || local6 == Static398.aClass321_30 || local6.anInt9098 == Static212.anInt3631 || local6.anInt9098 == Static254.anInt4371) {
					if (!method1460(local6)) {
						local40 = 0;
						local45 = 0;
						if (Static594.aBoolean693) {
							local40 = Static234.method3562();
							local45 = Static314.method4504();
						}
						if (local6 == Static489.aClass321_39 && Static165.method2361(Static489.aClass321_39) != null) {
							Static200.aBoolean206 = true;
							Static217.anInt3688 = local17;
							Static310.anInt5237 = local22;
						}
						if (local6.aBoolean659 || local28 < local32 && local30 < local34) {
							if (local6.aBoolean652 && arg10 >= local28 && arg11 >= local30 && arg10 < local32 && arg11 < local34) {
								for (@Pc(168) Class6_Sub49 local168 = (Class6_Sub49) Static296.aClass362_22.method8538(); local168 != null; local168 = (Class6_Sub49) Static296.aClass362_22.method8530()) {
									if (local168.aBoolean673) {
										local168.method9174();
										local168.aClass321_44.aBoolean657 = false;
									}
								}
								if (Static272.anInt4703 == 0) {
									Static489.aClass321_39 = null;
									Static398.aClass321_30 = null;
								}
								Static423.anInt7313 = 0;
								Static154.aBoolean161 = false;
								Static506.aBoolean586 = false;
								if (!Static277.aBoolean303) {
									Static93.method6335();
								}
							}
							@Pc(232) boolean local232;
							if (Static193.aClass128_1.method5191() + local40 >= local28 && Static193.aClass128_1.method5188() + local45 >= local30 && Static193.aClass128_1.method5191() + local40 < local32 && Static193.aClass128_1.method5188() + local45 < local34) {
								local232 = true;
							} else {
								local232 = false;
							}
							if (!Static291.aBoolean314 && local232) {
								if (local6.anInt9019 >= 0) {
									Static357.anInt6124 = local6.anInt9019;
								} else if (local6.aBoolean652) {
									Static357.anInt6124 = -1;
								}
							}
							if (!Static277.aBoolean303 && arg10 >= local28 && arg11 >= local30 && arg10 < local32 && arg11 < local34) {
								Static132.method2021(arg10 - local17, local6, arg11 - local22);
							}
							@Pc(276) boolean local276 = false;
							if (Static193.aClass128_1.method5189() && local232) {
								local276 = true;
							}
							@Pc(286) boolean local286 = false;
							@Pc(291) Class6_Sub27 local291 = (Class6_Sub27) Static60.aClass362_8.method8538();
							if (local291 != null && local291.method8186() == 0 && local291.method8184() + local40 >= local28 && local291.method8188() + local45 >= local30 && local291.method8184() + local40 < local32 && local291.method8188() + local45 < local34) {
								local286 = true;
							}
							@Pc(335) int local335;
							@Pc(469) int local469;
							if (local6.aByteArray97 != null && !Static578.method8044()) {
								for (local335 = 0; local335 < local6.aByteArray97.length; local335++) {
									if (Static170.aClass4_1.method1024(local6.aByteArray97[local335])) {
										if (local6.anIntArray616 == null || Static90.anInt1698 >= local6.anIntArray616[local335]) {
											@Pc(367) byte local367 = local6.aByteArray96[local335];
											if (local367 == 0 || ((local367 & 0x8) == 0 || !Static170.aClass4_1.method1024(86) && !Static170.aClass4_1.method1024(82) && !Static170.aClass4_1.method1024(81)) && ((local367 & 0x2) == 0 || Static170.aClass4_1.method1024(86)) && ((local367 & 0x1) == 0 || Static170.aClass4_1.method1024(82)) && ((local367 & 0x4) == 0 || Static170.aClass4_1.method1024(81))) {
												if (local335 < 10) {
													Static488.method7083(-1, local6.anInt9040, "", local335 + 1);
												} else if (local335 == 10) {
													Static221.method3209();
													@Pc(438) Class6_Sub42 local438 = method1453(local6);
													Static31.method715(local6, local438.anInt6749, local438.method5790());
													Static355.aString75 = Static674.method8277(local6);
													if (Static355.aString75 == null) {
														Static355.aString75 = "Null";
													}
													Static172.aString32 = local6.aString123 + "<col=ffffff>";
												}
												local469 = local6.anIntArray612[local335];
												if (local6.anIntArray616 == null) {
													local6.anIntArray616 = new int[local6.aByteArray97.length];
												}
												if (local469 == 0) {
													local6.anIntArray616[local335] = Integer.MAX_VALUE;
												} else {
													local6.anIntArray616[local335] = Static90.anInt1698 + local469;
												}
											}
										}
									} else if (local6.anIntArray616 != null) {
										local6.anIntArray616[local335] = 0;
									}
								}
							}
							if (local286) {
								Static202.method3045(local6, local45 + local291.method8188() - local22, local40 + local291.method8184() - local17);
							}
							if (Static489.aClass321_39 != null && Static489.aClass321_39 != local6 && local232 && method1453(local6).method5784()) {
								Static435.aClass321_34 = local6;
							}
							if (local6 == Static398.aClass321_30) {
								Static418.aBoolean484 = true;
								Static171.anInt2876 = local17;
								Static292.anInt4923 = local22;
							}
							if (local6.aBoolean655 || local6.anInt9098 != 0) {
								@Pc(558) Class6_Sub49 local558;
								if (local232 && Static551.anInt8500 != 0 && local6.anObjectArray10 != null) {
									local558 = new Class6_Sub49();
									local558.aBoolean673 = true;
									local558.aClass321_44 = local6;
									local558.anInt9235 = Static551.anInt8500;
									local558.anObjectArray35 = local6.anObjectArray10;
									Static296.aClass362_22.method8536(local558);
								}
								if (Static489.aClass321_39 != null || Static277.aBoolean303 || local6.anInt9098 != Static11.anInt372 && Static423.anInt7313 > 0) {
									local286 = false;
									local276 = false;
									local232 = false;
								}
								@Pc(708) int local708;
								if (local6.anInt9098 != 0) {
									if (local6.anInt9098 == Static353.anInt6022 || local6.anInt9098 == Static138.anInt2396) {
										Static14.aClass321_4 = local6;
										if (Static312.aClass93_2 != null) {
											Static312.aClass93_2.method2057(Static546.aClass132_13, local6.anInt9077);
										}
										if (local6.anInt9098 == Static353.anInt6022) {
											if (Static277.aBoolean303 || arg10 < local28 || arg11 < local30 || arg10 >= local32 || arg11 >= local34) {
												continue;
											}
											Static42.method909(Static546.aClass132_13, arg9, arg8);
											@Pc(641) Class2_Sub2 local641 = (Class2_Sub2) Static304.aClass43_9.method1087();
											while (true) {
												if (local641 == null) {
													continue label812;
												}
												if (arg10 >= local641.anInt988 && arg10 < local641.anInt989 && arg11 >= local641.anInt987 && arg11 < local641.anInt990) {
													Static93.method6335();
													Static665.method9025(local641.aClass2_Sub1_Sub1_Sub3_1);
												}
												local641 = (Class2_Sub2) Static304.aClass43_9.method1088();
											}
										}
									}
									@Pc(747) int local747;
									if (local6.anInt9098 == Static212.anInt3631) {
										if (local6.method7689(Static546.aClass132_13) == null || Static426.anInt7557 != 0 && Static426.anInt7557 != 3 || Static277.aBoolean303 || arg10 < local28 || arg11 < local30 || arg10 >= local32 || arg11 >= local34) {
											continue;
										}
										local335 = arg10 - local17;
										local708 = arg11 - local22;
										local469 = local6.anIntArray615[local708];
										if (local335 < local469 || local335 > local469 + local6.anIntArray608[local708]) {
											continue;
										}
										local335 -= local6.anInt9103 / 2;
										local708 -= local6.anInt9077 / 2;
										if (Static407.anInt6820 == 4) {
											local747 = (int) Static228.aFloat26 & 0x3FFF;
										} else {
											local747 = (int) Static228.aFloat26 + Static553.anInt9285 & 0x3FFF;
										}
										@Pc(759) int local759 = Class6_Sub1_Sub3.anIntArray56[local747];
										@Pc(763) int local763 = Class6_Sub1_Sub3.anIntArray58[local747];
										if (Static407.anInt6820 != 4) {
											local759 = local759 * (Static605.anInt9842 + 256) >> 8;
											local763 = local763 * (Static605.anInt9842 + 256) >> 8;
										}
										@Pc(792) int local792 = local708 * local759 + local335 * local763 >> 14;
										@Pc(802) int local802 = local708 * local763 - local335 * local759 >> 14;
										@Pc(813) int local813;
										@Pc(821) int local821;
										if (Static407.anInt6820 == 4) {
											local813 = (Static555.anInt9303 >> 9) + (local792 >> 2);
											local821 = (Static502.anInt8454 >> 9) - (local802 >> 2);
										} else {
											@Pc(830) int local830 = (Static344.aClass2_Sub1_Sub1_Sub3_Sub1_2.method4326() - 1) * 256;
											local813 = (Static344.aClass2_Sub1_Sub1_Sub3_Sub1_2.anInt10006 - local830 >> 9) + (local792 >> 2);
											local821 = (Static344.aClass2_Sub1_Sub1_Sub3_Sub1_2.anInt10001 - local830 >> 9) - (local802 >> 2);
										}
										if (Static291.aBoolean314 && (Static255.anInt5389 & 0x40) != 0) {
											@Pc(863) Class321 local863 = Static640.method8748(Static663.anInt9822, Static672.anInt10372);
											if (local863 == null) {
												Static221.method3209();
											} else {
												Static200.method2916((long) (local6.anInt9061 << 0 | local6.anInt9040), Static355.aString75, local821, false, 1L, " ->", 15, Static478.anInt8213, local6.anInt9048, true, local813, true);
											}
											continue;
										}
										if (Static457.aClass176_6 == Static427.aClass176_5) {
											Static200.method2916(0L, Static52.aClass41_27.method1007(Static616.anInt10077), local821, false, 1L, "", 59, -1, -1, true, local813, true);
										}
										Static200.method2916(0L, Static239.aString48, local821, false, 1L, "", 45, Static206.anInt3564, -1, true, local813, true);
										continue;
									}
									if (local6.anInt9098 == Static11.anInt372) {
										Static562.aClass321_46 = local6;
										if (local232) {
											Static154.aBoolean161 = true;
										}
										if (local286) {
											local335 = (int) ((double) (local40 + local291.method8184() - local17 - local6.anInt9103 / 2) * 2.0D / (double) Static528.aFloat39);
											local708 = (int) -((double) (local45 + local291.method8188() - local22 - local6.anInt9077 / 2) * 2.0D / (double) Static528.aFloat39);
											local469 = Static417.anInt7258 + local335 + Static528.anInt5361;
											local747 = Static490.anInt8337 + local708 + Static528.anInt5366;
											@Pc(994) Class6_Sub4_Sub20 local994 = Static608.method8329();
											if (local994 == null) {
												continue;
											}
											@Pc(999) int[] local999 = new int[3];
											local994.method9030(local999, local747, local469);
											if (local999 != null) {
												if (Static170.aClass4_1.method1024(82) && Static26.anInt609 > 0) {
													Static48.method964(local999[1], local999[2], local999[0]);
													continue;
												}
												Static506.aBoolean586 = true;
												Static440.anInt7466 = local999[0];
												Static278.anInt9804 = local999[1];
												Static313.anInt5334 = local999[2];
											}
											Static423.anInt7313 = 1;
											Static591.aBoolean691 = false;
											Static663.anInt9823 = Static193.aClass128_1.method5191();
											Static464.anInt8031 = Static193.aClass128_1.method5188();
											continue;
										}
										if (local276 && Static423.anInt7313 > 0) {
											if (Static423.anInt7313 == 1 && (Static663.anInt9823 != Static193.aClass128_1.method5191() || Static464.anInt8031 != Static193.aClass128_1.method5188())) {
												Static276.anInt4779 = Static417.anInt7258;
												Static218.anInt3721 = Static490.anInt8337;
												Static423.anInt7313 = 2;
											}
											if (Static423.anInt7313 == 2) {
												Static591.aBoolean691 = true;
												Static84.method1469(Static276.anInt4779 + (int) ((double) (Static663.anInt9823 - Static193.aClass128_1.method5191()) * 2.0D / (double) Static528.aFloat40));
												Static586.method8117(Static218.anInt3721 - (int) ((double) (Static464.anInt8031 - Static193.aClass128_1.method5188()) * 2.0D / (double) Static528.aFloat40));
											}
											continue;
										}
										if (Static423.anInt7313 > 0 && !Static591.aBoolean691) {
											if ((Static261.anInt4524 == 1 || Static100.method1647()) && Static183.anInt3155 > 2) {
												Static624.method8608(Static464.anInt8031, Static663.anInt9823);
											} else if (Static390.method5563()) {
												Static624.method8608(Static464.anInt8031, Static663.anInt9823);
											}
										}
										Static423.anInt7313 = 0;
										continue;
									}
									if (local6.anInt9098 == Static144.anInt2472) {
										if (local276) {
											Static54.method1058(local6.anInt9077, local45 + Static193.aClass128_1.method5188() - local22, local6.anInt9103, local40 + Static193.aClass128_1.method5191() - local17);
										}
										continue;
									}
									if (local6.anInt9098 == Static254.anInt4371) {
										Static526.method7373(local22, local17, local6);
										continue;
									}
								}
								if (!local6.lb && local286) {
									local6.lb = true;
									if (local6.anObjectArray26 != null) {
										local558 = new Class6_Sub49();
										local558.aBoolean673 = true;
										local558.aClass321_44 = local6;
										local558.anInt9242 = local40 + local291.method8184() - local17;
										local558.anInt9235 = local45 + local291.method8188() - local22;
										local558.anObjectArray35 = local6.anObjectArray26;
										Static296.aClass362_22.method8536(local558);
									}
								}
								if (local6.lb && local276 && local6.anObjectArray5 != null) {
									local558 = new Class6_Sub49();
									local558.aBoolean673 = true;
									local558.aClass321_44 = local6;
									local558.anInt9242 = local40 + Static193.aClass128_1.method5191() - local17;
									local558.anInt9235 = local45 + Static193.aClass128_1.method5188() - local22;
									local558.anObjectArray35 = local6.anObjectArray5;
									Static296.aClass362_22.method8536(local558);
								}
								if (local6.lb && !local276) {
									local6.lb = false;
									if (local6.anObjectArray19 != null) {
										local558 = new Class6_Sub49();
										local558.aBoolean673 = true;
										local558.aClass321_44 = local6;
										local558.anInt9242 = local40 + Static193.aClass128_1.method5191() - local17;
										local558.anInt9235 = local45 + Static193.aClass128_1.method5188() - local22;
										local558.anObjectArray35 = local6.anObjectArray19;
										Static459.aClass362_44.method8536(local558);
									}
								}
								if (local276 && local6.anObjectArray15 != null) {
									local558 = new Class6_Sub49();
									local558.aBoolean673 = true;
									local558.aClass321_44 = local6;
									local558.anInt9242 = local40 + Static193.aClass128_1.method5191() - local17;
									local558.anInt9235 = local45 + Static193.aClass128_1.method5188() - local22;
									local558.anObjectArray35 = local6.anObjectArray15;
									Static296.aClass362_22.method8536(local558);
								}
								if (!local6.aBoolean657 && local232) {
									local6.aBoolean657 = true;
									if (local6.anObjectArray14 != null) {
										local558 = new Class6_Sub49();
										local558.aBoolean673 = true;
										local558.aClass321_44 = local6;
										local558.anInt9242 = local40 + Static193.aClass128_1.method5191() - local17;
										local558.anInt9235 = local45 + Static193.aClass128_1.method5188() - local22;
										local558.anObjectArray35 = local6.anObjectArray14;
										Static296.aClass362_22.method8536(local558);
									}
								}
								if (local6.aBoolean657 && local232 && local6.anObjectArray7 != null) {
									local558 = new Class6_Sub49();
									local558.aBoolean673 = true;
									local558.aClass321_44 = local6;
									local558.anInt9242 = local40 + Static193.aClass128_1.method5191() - local17;
									local558.anInt9235 = local45 + Static193.aClass128_1.method5188() - local22;
									local558.anObjectArray35 = local6.anObjectArray7;
									Static296.aClass362_22.method8536(local558);
								}
								if (local6.aBoolean657 && !local232) {
									local6.aBoolean657 = false;
									if (local6.anObjectArray30 != null) {
										local558 = new Class6_Sub49();
										local558.aBoolean673 = true;
										local558.aClass321_44 = local6;
										local558.anInt9242 = local40 + Static193.aClass128_1.method5191() - local17;
										local558.anInt9235 = local45 + Static193.aClass128_1.method5188() - local22;
										local558.anObjectArray35 = local6.anObjectArray30;
										Static459.aClass362_44.method8536(local558);
									}
								}
								if (local6.anObjectArray21 != null) {
									local558 = new Class6_Sub49();
									local558.aClass321_44 = local6;
									local558.anObjectArray35 = local6.anObjectArray21;
									Static486.aClass362_56.method8536(local558);
								}
								@Pc(1570) Class6_Sub49 local1570;
								if (local6.anObjectArray8 != null && Static166.anInt2810 > local6.anInt9044) {
									if (local6.anIntArray607 == null || Static166.anInt2810 - local6.anInt9044 > 32) {
										local558 = new Class6_Sub49();
										local558.aClass321_44 = local6;
										local558.anObjectArray35 = local6.anObjectArray8;
										Static296.aClass362_22.method8536(local558);
									} else {
										label699: for (local335 = local6.anInt9044; local335 < Static166.anInt2810; local335++) {
											local708 = Static24.anIntArray33[local335 & 0x1F];
											for (local469 = 0; local469 < local6.anIntArray607.length; local469++) {
												if (local6.anIntArray607[local469] == local708) {
													local1570 = new Class6_Sub49();
													local1570.aClass321_44 = local6;
													local1570.anObjectArray35 = local6.anObjectArray8;
													Static296.aClass362_22.method8536(local1570);
													break label699;
												}
											}
										}
									}
									local6.anInt9044 = Static166.anInt2810;
								}
								if (local6.anObjectArray4 != null && Static408.anInt6832 > local6.anInt9030) {
									if (local6.anIntArray613 == null || Static408.anInt6832 - local6.anInt9030 > 32) {
										local558 = new Class6_Sub49();
										local558.aClass321_44 = local6;
										local558.anObjectArray35 = local6.anObjectArray4;
										Static296.aClass362_22.method8536(local558);
									} else {
										label675: for (local335 = local6.anInt9030; local335 < Static408.anInt6832; local335++) {
											local708 = Static182.anIntArray178[local335 & 0x1F];
											for (local469 = 0; local469 < local6.anIntArray613.length; local469++) {
												if (local6.anIntArray613[local469] == local708) {
													local1570 = new Class6_Sub49();
													local1570.aClass321_44 = local6;
													local1570.anObjectArray35 = local6.anObjectArray4;
													Static296.aClass362_22.method8536(local1570);
													break label675;
												}
											}
										}
									}
									local6.anInt9030 = Static408.anInt6832;
								}
								if (local6.anObjectArray23 != null && Static651.anInt10485 > local6.anInt9036) {
									if (local6.anIntArray610 == null || Static651.anInt10485 - local6.anInt9036 > 32) {
										local558 = new Class6_Sub49();
										local558.aClass321_44 = local6;
										local558.anObjectArray35 = local6.anObjectArray23;
										Static296.aClass362_22.method8536(local558);
									} else {
										label651: for (local335 = local6.anInt9036; local335 < Static651.anInt10485; local335++) {
											local708 = Static299.anIntArray288[local335 & 0x1F];
											for (local469 = 0; local469 < local6.anIntArray610.length; local469++) {
												if (local6.anIntArray610[local469] == local708) {
													local1570 = new Class6_Sub49();
													local1570.aClass321_44 = local6;
													local1570.anObjectArray35 = local6.anObjectArray23;
													Static296.aClass362_22.method8536(local1570);
													break label651;
												}
											}
										}
									}
									local6.anInt9036 = Static651.anInt10485;
								}
								if (local6.anObjectArray9 != null && Static453.anInt1620 > local6.anInt9013) {
									if (local6.anIntArray609 == null || Static453.anInt1620 - local6.anInt9013 > 32) {
										local558 = new Class6_Sub49();
										local558.aClass321_44 = local6;
										local558.anObjectArray35 = local6.anObjectArray9;
										Static296.aClass362_22.method8536(local558);
									} else {
										label627: for (local335 = local6.anInt9013; local335 < Static453.anInt1620; local335++) {
											local708 = Static293.anIntArray282[local335 & 0x1F];
											for (local469 = 0; local469 < local6.anIntArray609.length; local469++) {
												if (local6.anIntArray609[local469] == local708) {
													local1570 = new Class6_Sub49();
													local1570.aClass321_44 = local6;
													local1570.anObjectArray35 = local6.anObjectArray9;
													Static296.aClass362_22.method8536(local1570);
													break label627;
												}
											}
										}
									}
									local6.anInt9013 = Static453.anInt1620;
								}
								if (local6.anObjectArray3 != null && Static42.anInt937 > local6.anInt9070) {
									if (local6.anIntArray611 == null || Static42.anInt937 - local6.anInt9070 > 32) {
										local558 = new Class6_Sub49();
										local558.aClass321_44 = local6;
										local558.anObjectArray35 = local6.anObjectArray3;
										Static296.aClass362_22.method8536(local558);
									} else {
										label603: for (local335 = local6.anInt9070; local335 < Static42.anInt937; local335++) {
											local708 = Static303.anIntArray303[local335 & 0x1F];
											for (local469 = 0; local469 < local6.anIntArray611.length; local469++) {
												if (local6.anIntArray611[local469] == local708) {
													local1570 = new Class6_Sub49();
													local1570.aClass321_44 = local6;
													local1570.anObjectArray35 = local6.anObjectArray3;
													Static296.aClass362_22.method8536(local1570);
													break label603;
												}
											}
										}
									}
									local6.anInt9070 = Static42.anInt937;
								}
								if (Static500.anInt8447 > local6.anInt9093 && local6.anObjectArray33 != null) {
									local558 = new Class6_Sub49();
									local558.aClass321_44 = local6;
									local558.anObjectArray35 = local6.anObjectArray33;
									Static296.aClass362_22.method8536(local558);
								}
								if (Static206.anInt3566 > local6.anInt9093 && local6.anObjectArray11 != null) {
									local558 = new Class6_Sub49();
									local558.aClass321_44 = local6;
									local558.anObjectArray35 = local6.anObjectArray11;
									Static296.aClass362_22.method8536(local558);
								}
								if (Static595.anInt9704 > local6.anInt9093 && local6.anObjectArray6 != null) {
									local558 = new Class6_Sub49();
									local558.aClass321_44 = local6;
									local558.anObjectArray35 = local6.anObjectArray6;
									Static296.aClass362_22.method8536(local558);
								}
								if (Static617.anInt10079 > local6.anInt9093 && local6.anObjectArray18 != null) {
									local558 = new Class6_Sub49();
									local558.aClass321_44 = local6;
									local558.anObjectArray35 = local6.anObjectArray18;
									Static296.aClass362_22.method8536(local558);
								}
								if (Static467.anInt8075 > local6.anInt9093 && local6.anObjectArray29 != null) {
									local558 = new Class6_Sub49();
									local558.aClass321_44 = local6;
									local558.anObjectArray35 = local6.anObjectArray29;
									Static296.aClass362_22.method8536(local558);
								}
								if (Static23.anInt568 > local6.anInt9093 && local6.anObjectArray16 != null) {
									local558 = new Class6_Sub49();
									local558.aClass321_44 = local6;
									local558.anObjectArray35 = local6.anObjectArray16;
									Static296.aClass362_22.method8536(local558);
								}
								if (Static61.anInt1166 > local6.anInt9093 && local6.anObjectArray31 != null) {
									local558 = new Class6_Sub49();
									local558.aClass321_44 = local6;
									local558.anObjectArray35 = local6.anObjectArray31;
									Static296.aClass362_22.method8536(local558);
								}
								local6.anInt9093 = Static94.anInt1719;
								if (local6.anObjectArray32 != null) {
									for (local335 = 0; local335 < Static473.anInt8160; local335++) {
										@Pc(2082) Class6_Sub49 local2082 = new Class6_Sub49();
										local2082.aClass321_44 = local6;
										local2082.anInt9239 = Static649.anInterface20Array2[local335].method1560();
										local2082.anInt9240 = Static649.anInterface20Array2[local335].method1557();
										local2082.anObjectArray35 = local6.anObjectArray32;
										Static296.aClass362_22.method8536(local2082);
									}
								}
								if (Static54.aBoolean56 && local6.anObjectArray20 != null) {
									local558 = new Class6_Sub49();
									local558.aClass321_44 = local6;
									local558.anObjectArray35 = local6.anObjectArray20;
									Static296.aClass362_22.method8536(local558);
								}
							}
							if (local6.anInt9105 == 5 && local6.anInt9071 != -1) {
								local6.method7675(Static399.aClass194_1, Static186.aClass147_1).method2057(Static546.aClass132_13, local6.anInt9077);
							}
							Static519.method7338(local6);
							if (local6.anInt9105 == 0) {
								method1459(arg0, local6.anInt9040, local28, local30, local32, local34, local17 - local6.anInt9102, local22 - local6.anInt9067, arg8, arg9, arg10, arg11);
								if (local6.aClass321Array1 != null) {
									method1459(local6.aClass321Array1, local6.anInt9040, local28, local30, local32, local34, local17 - local6.anInt9102, local22 - local6.anInt9067, arg8, arg9, arg10, arg11);
								}
								@Pc(2208) Class6_Sub51 local2208 = (Class6_Sub51) Static262.aClass209_35.method5038((long) local6.anInt9040);
								if (local2208 != null) {
									if (Static457.aClass176_6 == Static615.aClass176_7 && local2208.anInt9358 == 0 && !Static277.aBoolean303 && local232 && !Static383.aBoolean423) {
										Static93.method6335();
									}
									Static318.method4576(local17, local28, arg9, local32, local30, local34, arg10, arg8, local22, arg11, local2208.anInt9360);
								}
							}
						}
					}
				} else if (local28 < local32 && local30 < local34) {
					Static519.method7338(local6);
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(Lclient!sha;)Z")
	public static boolean method1460(@OriginalArg(0) Class321 arg0) {
		if (Static383.aBoolean423) {
			if (method1453(arg0).anInt6747 != 0) {
				return false;
			}
			if (arg0.anInt9105 == 0) {
				return false;
			}
		}
		return arg0.aBoolean656;
	}

	@OriginalMember(owner = "client!client", name = "i", descriptor = "(I)V")
	public static void method1461(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = Static475.anInt8165;
		@Pc(3) int[] local3 = Static75.anIntArray82;
		@Pc(11) int local11 = Static462.aBoolean552 ? local1 : local1 + Static133.anInt2316;
		for (@Pc(13) int local13 = 0; local13 < local11; local13++) {
			@Pc(23) Class2_Sub1_Sub1_Sub3 local23;
			if (local13 < local1) {
				local23 = Static20.aClass2_Sub1_Sub1_Sub3_Sub1Array1[local3[local13]];
			} else {
				local23 = ((Class6_Sub44) Static349.aClass209_32.method5038((long) Static74.anIntArray80[local13 - local1])).aClass2_Sub1_Sub1_Sub3_Sub2_2;
			}
			if (local23.aByte140 == arg0) {
				local23.anInt5064 = 0;
				if (local23.anInt5113 < 0) {
					local23.aBoolean329 = false;
				} else {
					@Pc(54) int local54 = local23.method4326();
					if ((local54 & 0x1) == 0) {
						if ((local23.anInt10006 & 0x1FF) != 0 || (local23.anInt10001 & 0x1FF) != 0) {
							local23.aBoolean329 = false;
							continue;
						}
					} else if ((local23.anInt10006 & 0x1FF) != 256 || (local23.anInt10001 & 0x1FF) != 256) {
						local23.aBoolean329 = false;
						continue;
					}
					@Pc(96) int local96;
					@Pc(101) int local101;
					@Pc(126) int local126;
					if (local54 == 1) {
						local96 = local23.anInt10006 >> 9;
						local101 = local23.anInt10001 >> 9;
						if (local23.anInt5113 != Static52.anIntArrayArray4[local96][local101]) {
							local23.aBoolean329 = true;
							continue;
						}
						if (Static121.anIntArrayArray11[local96][local101] > 1) {
							local126 = Static121.anIntArrayArray11[local96][local101]--;
							local23.aBoolean329 = true;
							continue;
						}
					} else {
						local96 = (local54 - 1) * 256 + 252;
						local101 = local23.anInt10006 - local96 >> 9;
						@Pc(155) int local155 = local23.anInt10001 - local96 >> 9;
						@Pc(162) int local162 = local23.anInt10006 + local96 >> 9;
						@Pc(169) int local169 = local23.anInt10001 + local96 >> 9;
						if (!Static635.method8718(local23.anInt5113, local162, local101, local169, local155)) {
							for (@Pc(180) int local180 = local101; local180 <= local162; local180++) {
								for (@Pc(183) int local183 = local155; local183 <= local169; local183++) {
									if (local23.anInt5113 == Static52.anIntArrayArray4[local180][local183]) {
										local126 = Static121.anIntArrayArray11[local180][local183]--;
									}
								}
							}
							local23.aBoolean329 = true;
							continue;
						}
					}
					local23.aBoolean329 = false;
					local23.anInt10004 = Static284.method4118(local23.anInt10006, local23.aByte140, local23.anInt10001);
					Static23.method582(local23, true);
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "(Z)V")
	public static void method1463() {
		@Pc(3) Class43[] local3 = Class6_Sub9.aClass43Array1;
		synchronized (Class6_Sub9.aClass43Array1) {
			for (@Pc(7) int local7 = 0; local7 < Class6_Sub9.aClass43Array1.length; local7++) {
				Class6_Sub9.aClass43Array1[local7] = new Class43();
				Static506.anIntArray557[local7] = 0;
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "()V")
	public static void method1465() {
		@Pc(1) int local1 = Static475.anInt8165;
		@Pc(3) int[] local3 = Static75.anIntArray82;
		@Pc(8) int local8 = Static96.aClass6_Sub22_7.aClass29_Sub3_1.method1481();
		@Pc(23) boolean local23 = local8 == 1 && local1 > 200 || local8 == 0 && local1 > 50;
		@Pc(85) int local85;
		for (@Pc(25) int local25 = 0; local25 < local1; local25++) {
			@Pc(32) Class2_Sub1_Sub1_Sub3_Sub1 local32 = Static20.aClass2_Sub1_Sub1_Sub3_Sub1Array1[local3[local25]];
			if (!local32.method3520()) {
				local32.anInt5113 = -1;
			} else if (local32.aBoolean257) {
				local32.anInt5113 = -1;
			} else {
				local32.method8465();
				if (local32.aShort118 >= 0 && local32.aShort121 >= 0 && local32.aShort119 < Static491.anInt9856 && local32.aShort120 < Static393.anInt6574) {
					local32.aBoolean259 = local32.aBoolean331 ? local23 : false;
					if (local32 == Static344.aClass2_Sub1_Sub1_Sub3_Sub1_2) {
						local32.anInt5113 = Integer.MAX_VALUE;
					} else {
						local85 = 0;
						if (!local32.aBoolean329) {
							local85++;
						}
						if (local32.anInt5057 > Static90.anInt1698) {
							local85 += 2;
						}
						local85 += 5 - local32.method4326() << 2;
						if (local32.aBoolean260 || local32.aBoolean258) {
							local85 += 512;
						} else {
							if (Static70.anInt1340 == 0) {
								local85 += 32;
							} else {
								local85 += 128;
							}
							local85 += 256;
						}
						local32.anInt5113 = local85 + 1;
					}
				} else {
					local32.anInt5113 = -1;
				}
			}
		}
		for (@Pc(129) int local129 = 0; local129 < Static133.anInt2316; local129++) {
			@Pc(140) Class2_Sub1_Sub1_Sub3_Sub2 local140 = ((Class6_Sub44) Static349.aClass209_32.method5038((long) Static74.anIntArray80[local129])).aClass2_Sub1_Sub1_Sub3_Sub2_2;
			if (local140.method4338() && local140.aClass91_1.method2043(Static659.aClass363_3)) {
				local140.method8465();
				if (local140.aShort118 >= 0 && local140.aShort121 >= 0 && local140.aShort119 < Static491.anInt9856 && local140.aShort120 < Static393.anInt6574) {
					@Pc(177) int local177 = 0;
					if (!local140.aBoolean329) {
						local177++;
					}
					if (local140.anInt5057 > Static90.anInt1698) {
						local177 += 2;
					}
					local177 += 5 - local140.method4326() << 2;
					if (Static70.anInt1340 == 0) {
						if (local140.aClass91_1.aBoolean147) {
							local177 += 64;
						} else {
							local177 += 128;
						}
					} else if (Static70.anInt1340 == 1) {
						if (local140.aClass91_1.aBoolean147) {
							local177 += 32;
						} else {
							local177 += 64;
						}
					}
					if (local140.aClass91_1.aBoolean145) {
						local177 += 1024;
					} else if (!local140.aClass91_1.aBoolean146) {
						local177 += 256;
					}
					local140.anInt5113 = local177 + 1;
				} else {
					local140.anInt5113 = -1;
				}
			} else {
				local140.anInt5113 = -1;
			}
		}
		for (local85 = 0; local85 < Static539.aClass167Array1.length; local85++) {
			@Pc(243) Class167 local243 = Static539.aClass167Array1[local85];
			if (local243 != null) {
				if (local243.anInt4342 == 1) {
					@Pc(257) Class6_Sub44 local257 = (Class6_Sub44) Static349.aClass209_32.method5038((long) local243.anInt4346);
					if (local257 != null) {
						@Pc(262) Class2_Sub1_Sub1_Sub3_Sub2 local262 = local257.aClass2_Sub1_Sub1_Sub3_Sub2_2;
						if (local262.anInt5113 >= 0) {
							local262.anInt5113 += 2048;
						}
					}
				} else if (local243.anInt4342 == 10) {
					@Pc(281) Class2_Sub1_Sub1_Sub3_Sub1 local281 = Static20.aClass2_Sub1_Sub1_Sub3_Sub1Array1[local243.anInt4346];
					if (local281 != null && local281 != Static344.aClass2_Sub1_Sub1_Sub3_Sub1_2 && local281.anInt5113 >= 0) {
						local281.anInt5113 += 2048;
					}
				}
			}
		}
	}
}
