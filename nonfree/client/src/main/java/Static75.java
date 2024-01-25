import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static75 {

	@OriginalMember(owner = "client!client", name = "hb", descriptor = "[S")
	public static short[] aShortArray16;

	@OriginalMember(owner = "client!client", name = "kb", descriptor = "[Lclient!fs;")
	public static final Class124[] aClass124Array3 = new Class124[14];

	@OriginalMember(owner = "client!client", name = "qb", descriptor = "I")
	public static int anInt1617 = 1;

	@OriginalMember(owner = "client!client", name = "ub", descriptor = "I")
	public static int anInt1621 = -1;

	@OriginalMember(owner = "client!client", name = "a", descriptor = "()V")
	public static void method1602() {
		@Pc(1) int local1 = Static518.anInt10290;
		@Pc(3) int[] local3 = Static489.anIntArray519;
		@Pc(11) int local11 = Static335.aBoolean403 ? local1 : local1 + Static105.anInt2131;
		for (@Pc(13) int local13 = 0; local13 < local11; local13++) {
			@Pc(23) Class3_Sub1_Sub2_Sub2 local23;
			if (local13 < local1) {
				local23 = Static180.aClass3_Sub1_Sub2_Sub2_Sub1Array20[local3[local13]];
			} else {
				local23 = ((Class4_Sub45) Static597.aClass66_41.method1994((long) Static526.anIntArray558[local13 - local1])).aClass3_Sub1_Sub2_Sub2_Sub2_2;
			}
			if (local23.lb >= 0) {
				@Pc(43) int local43 = local23.method8514();
				if ((local43 & 0x1) == 0) {
					if ((local23.anInt9925 & 0x1FF) == 0 && (local23.anInt9917 & 0x1FF) == 0) {
						continue;
					}
				} else if ((local23.anInt9925 & 0x1FF) == 256 && (local23.anInt9917 & 0x1FF) == 256) {
					continue;
				}
				local23.anInt9915 = Static674.method8951(local23.aByte141, local23.anInt9917, local23.anInt9925);
				Static573.method7594(local23, true);
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "()V")
	public static void method1603() {
		@Pc(1) int local1 = Static518.anInt10290;
		@Pc(3) int[] local3 = Static489.anIntArray519;
		@Pc(8) int local8 = Static124.aClass4_Sub20_4.aClass8_Sub17_1.method6583();
		@Pc(23) boolean local23 = local8 == 1 && local1 > 200 || local8 == 0 && local1 > 50;
		@Pc(85) int local85;
		for (@Pc(25) int local25 = 0; local25 < local1; local25++) {
			@Pc(32) Class3_Sub1_Sub2_Sub2_Sub1 local32 = Static180.aClass3_Sub1_Sub2_Sub2_Sub1Array20[local3[local25]];
			if (!local32.method3528()) {
				local32.lb = -1;
			} else if (local32.aBoolean293) {
				local32.lb = -1;
			} else {
				local32.method8508();
				if (local32.aShort124 >= 0 && local32.aShort125 >= 0 && local32.aShort123 < Static224.anInt3557 && local32.aShort122 < Static267.anInt4309) {
					local32.aBoolean295 = local32.aBoolean776 ? local23 : false;
					if (local32 == Static554.aClass3_Sub1_Sub2_Sub2_Sub1_4) {
						local32.lb = Integer.MAX_VALUE;
					} else {
						local85 = 0;
						if (!local32.aBoolean773) {
							local85++;
						}
						if (local32.anInt9998 > Static177.anInt3088) {
							local85 += 2;
						}
						local85 += 5 - local32.method8514() << 2;
						if (local32.aBoolean292 || local32.aBoolean291) {
							local85 += 512;
						} else {
							if (Static458.anInt7334 == 0) {
								local85 += 32;
							} else {
								local85 += 128;
							}
							local85 += 256;
						}
						local32.lb = local85 + 1;
					}
				} else {
					local32.lb = -1;
				}
			}
		}
		for (@Pc(129) int local129 = 0; local129 < Static105.anInt2131; local129++) {
			@Pc(140) Class3_Sub1_Sub2_Sub2_Sub2 local140 = ((Class4_Sub45) Static597.aClass66_41.method1994((long) Static526.anIntArray558[local129])).aClass3_Sub1_Sub2_Sub2_Sub2_2;
			if (local140.method8531() && local140.aClass345_1.method7528(Static526.aClass293_1)) {
				local140.method8508();
				if (local140.aShort124 >= 0 && local140.aShort125 >= 0 && local140.aShort123 < Static224.anInt3557 && local140.aShort122 < Static267.anInt4309) {
					@Pc(177) int local177 = 0;
					if (!local140.aBoolean773) {
						local177++;
					}
					if (local140.anInt9998 > Static177.anInt3088) {
						local177 += 2;
					}
					local177 += 5 - local140.method8514() << 2;
					if (Static458.anInt7334 == 0) {
						if (local140.aClass345_1.aBoolean693) {
							local177 += 64;
						} else {
							local177 += 128;
						}
					} else if (Static458.anInt7334 == 1) {
						if (local140.aClass345_1.aBoolean693) {
							local177 += 32;
						} else {
							local177 += 64;
						}
					}
					if (local140.aClass345_1.aBoolean695) {
						local177 += 1024;
					} else if (!local140.aClass345_1.lb) {
						local177 += 256;
					}
					local140.lb = local177 + 1;
				} else {
					local140.lb = -1;
				}
			} else {
				local140.lb = -1;
			}
		}
		for (local85 = 0; local85 < Static9.aClass82Array41.length; local85++) {
			@Pc(243) Class82 local243 = Static9.aClass82Array41[local85];
			if (local243 != null) {
				if (local243.anInt2225 == 1) {
					@Pc(257) Class4_Sub45 local257 = (Class4_Sub45) Static597.aClass66_41.method1994((long) local243.anInt2224);
					if (local257 != null) {
						@Pc(262) Class3_Sub1_Sub2_Sub2_Sub2 local262 = local257.aClass3_Sub1_Sub2_Sub2_Sub2_2;
						if (local262.lb >= 0) {
							local262.lb += 2048;
						}
					}
				} else if (local243.anInt2225 == 10) {
					@Pc(281) Class3_Sub1_Sub2_Sub2_Sub1 local281 = Static180.aClass3_Sub1_Sub2_Sub2_Sub1Array20[local243.anInt2224];
					if (local281 != null && local281 != Static554.aClass3_Sub1_Sub2_Sub2_Sub1_4 && local281.lb >= 0) {
						local281.lb += 2048;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!kq;)Lclient!bk;")
	public static Class4_Sub10 method1604(@OriginalArg(0) Class199 arg0) {
		@Pc(13) Class4_Sub10 local13 = (Class4_Sub10) Static598.aClass66_42.method1994(((long) arg0.anInt5041 << 32) + (long) arg0.anInt5005);
		return local13 == null ? arg0.aClass4_Sub10_1 : local13;
	}

	@OriginalMember(owner = "client!client", name = "j", descriptor = "(I)V")
	public static void method1605(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = Static518.anInt10290;
		@Pc(3) int[] local3 = Static489.anIntArray519;
		for (@Pc(5) int local5 = 0; local5 < local1 + Static105.anInt2131; local5++) {
			@Pc(15) Class3_Sub1_Sub2_Sub2 local15;
			if (local5 < local1) {
				local15 = Static180.aClass3_Sub1_Sub2_Sub2_Sub1Array20[local3[local5]];
			} else {
				local15 = ((Class4_Sub45) Static597.aClass66_41.method1994((long) Static526.anIntArray558[local5 - local1])).aClass3_Sub1_Sub2_Sub2_Sub2_2;
			}
			if (local15.aByte141 == arg0 && local15.lb >= 0) {
				@Pc(39) int local39 = local15.method8514();
				if ((local39 & 0x1) == 0) {
					if ((local15.anInt9925 & 0x1FF) != 0 || (local15.anInt9917 & 0x1FF) != 0) {
						continue;
					}
				} else if ((local15.anInt9925 & 0x1FF) != 256 || (local15.anInt9917 & 0x1FF) != 256) {
					continue;
				}
				@Pc(75) int local75;
				@Pc(80) int local80;
				@Pc(116) int local116;
				if (local39 == 1) {
					local75 = local15.anInt9925 >> 9;
					local80 = local15.anInt9917 >> 9;
					if (local15.lb > Static430.anIntArrayArray39[local75][local80]) {
						Static430.anIntArrayArray39[local75][local80] = local15.lb;
						Static71.anIntArrayArray6[local75][local80] = 1;
					} else if (local15.lb == Static430.anIntArrayArray39[local75][local80]) {
						local116 = Static71.anIntArrayArray6[local75][local80]++;
					}
				} else {
					local75 = (local39 - 1) * 256 + 60;
					local80 = local15.anInt9925 - local75 >> 9;
					@Pc(142) int local142 = local15.anInt9917 - local75 >> 9;
					@Pc(149) int local149 = local15.anInt9925 + local75 >> 9;
					@Pc(156) int local156 = local15.anInt9917 + local75 >> 9;
					for (@Pc(158) int local158 = local80; local158 <= local149; local158++) {
						for (@Pc(161) int local161 = local142; local161 <= local156; local161++) {
							if (local15.lb > Static430.anIntArrayArray39[local158][local161]) {
								Static430.anIntArrayArray39[local158][local161] = local15.lb;
								Static71.anIntArrayArray6[local158][local161] = 1;
							} else if (local15.lb == Static430.anIntArrayArray39[local158][local161]) {
								local116 = Static71.anIntArrayArray6[local158][local161]++;
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "k", descriptor = "(I)V")
	public static void method1606(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = Static518.anInt10290;
		@Pc(3) int[] local3 = Static489.anIntArray519;
		@Pc(11) int local11 = Static335.aBoolean403 ? local1 : local1 + Static105.anInt2131;
		for (@Pc(13) int local13 = 0; local13 < local11; local13++) {
			@Pc(23) Class3_Sub1_Sub2_Sub2 local23;
			if (local13 < local1) {
				local23 = Static180.aClass3_Sub1_Sub2_Sub2_Sub1Array20[local3[local13]];
			} else {
				local23 = ((Class4_Sub45) Static597.aClass66_41.method1994((long) Static526.anIntArray558[local13 - local1])).aClass3_Sub1_Sub2_Sub2_Sub2_2;
			}
			if (local23.aByte141 == arg0) {
				local23.anInt9991 = 0;
				if (local23.lb < 0) {
					local23.aBoolean773 = false;
				} else {
					@Pc(54) int local54 = local23.method8514();
					if ((local54 & 0x1) == 0) {
						if ((local23.anInt9925 & 0x1FF) != 0 || (local23.anInt9917 & 0x1FF) != 0) {
							local23.aBoolean773 = false;
							continue;
						}
					} else if ((local23.anInt9925 & 0x1FF) != 256 || (local23.anInt9917 & 0x1FF) != 256) {
						local23.aBoolean773 = false;
						continue;
					}
					@Pc(96) int local96;
					@Pc(101) int local101;
					@Pc(126) int local126;
					if (local54 == 1) {
						local96 = local23.anInt9925 >> 9;
						local101 = local23.anInt9917 >> 9;
						if (local23.lb != Static430.anIntArrayArray39[local96][local101]) {
							local23.aBoolean773 = true;
							continue;
						}
						if (Static71.anIntArrayArray6[local96][local101] > 1) {
							local126 = Static71.anIntArrayArray6[local96][local101]--;
							local23.aBoolean773 = true;
							continue;
						}
					} else {
						local96 = (local54 - 1) * 256 + 252;
						local101 = local23.anInt9925 - local96 >> 9;
						@Pc(155) int local155 = local23.anInt9917 - local96 >> 9;
						@Pc(162) int local162 = local23.anInt9925 + local96 >> 9;
						@Pc(169) int local169 = local23.anInt9917 + local96 >> 9;
						if (!Static418.method5745(local155, local101, local162, local169, local23.lb)) {
							for (@Pc(180) int local180 = local101; local180 <= local162; local180++) {
								for (@Pc(183) int local183 = local155; local183 <= local169; local183++) {
									if (local23.lb == Static430.anIntArrayArray39[local180][local183]) {
										local126 = Static71.anIntArrayArray6[local180][local183]--;
									}
								}
							}
							local23.aBoolean773 = true;
							continue;
						}
					}
					local23.aBoolean773 = false;
					local23.anInt9915 = Static674.method8951(local23.aByte141, local23.anInt9917, local23.anInt9925);
					Static573.method7594(local23, true);
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Lclient!kq;)Lclient!kq;")
	public static Class199 method1607(@OriginalArg(0) Class199 arg0) {
		@Pc(4) int local4 = method1604(arg0).method817();
		if (local4 == 0) {
			return null;
		}
		for (@Pc(10) int local10 = 0; local10 < local4; local10++) {
			arg0 = Static569.method7534(arg0.anInt4982);
			if (arg0 == null) {
				return null;
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "()V")
	public static void method1610() {
		for (@Pc(1) int local1 = 0; local1 < Static224.anInt3557; local1++) {
			@Pc(6) int[] local6 = Static430.anIntArrayArray39[local1];
			for (@Pc(8) int local8 = 0; local8 < Static267.anInt4309; local8++) {
				local6[local8] = 0;
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(Lclient!kq;)Z")
	public static boolean method1611(@OriginalArg(0) Class199 arg0) {
		if (Static110.aBoolean147) {
			if (method1604(arg0).anInt890 != 0) {
				return false;
			}
			if (arg0.anInt4966 == 0) {
				return false;
			}
		}
		return arg0.aBoolean373;
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "()V")
	public static void method1613() {
		Static611.anInt9389 = 0;
		for (@Pc(3) int local3 = 0; local3 < Static105.anInt2131; local3++) {
			@Pc(14) Class3_Sub1_Sub2_Sub2_Sub2 local14 = ((Class4_Sub45) Static597.aClass66_41.method1994((long) Static526.anIntArray558[local3])).aClass3_Sub1_Sub2_Sub2_Sub2_2;
			if (local14.aBoolean773 && local14.method8519() != -1) {
				@Pc(32) int local32 = (local14.method8514() - 1) * 256 + 252;
				@Pc(39) int local39 = local14.anInt9925 - local32 >> 9;
				@Pc(46) int local46 = local14.anInt9917 - local32 >> 9;
				@Pc(53) Class3_Sub1_Sub2_Sub2 local53 = Static80.method1710(local14.aByte141, local39, local46);
				if (local53 != null) {
					@Pc(58) int local58 = local53.anInt9961;
					if (local53 instanceof Class3_Sub1_Sub2_Sub2_Sub2) {
						local58 += 2048;
					}
					if (local53.anInt9991 == 0 && local53.method8519() != -1) {
						Static7.anIntArray8[Static611.anInt9389] = local58;
						Static118.anIntArray156[Static611.anInt9389] = local58;
						Static611.anInt9389++;
						local53.anInt9991++;
					}
					Static7.anIntArray8[Static611.anInt9389] = local58;
					Static118.anIntArray156[Static611.anInt9389] = local14.anInt9961 + 2048;
					Static611.anInt9389++;
					local53.anInt9991++;
				}
			}
		}
		Static557.method7402(0, Static611.anInt9389 - 1, Static118.anIntArray156, Static7.anIntArray8);
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "([Lclient!kq;IIIIIIIIIII)V")
	public static void method1615(@OriginalArg(0) Class199[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11) {
		label812: for (@Pc(1) int local1 = 0; local1 < arg0.length; local1++) {
			@Pc(6) Class199 local6 = arg0[local1];
			if (local6 != null && local6.anInt4982 == arg1) {
				@Pc(17) int local17 = local6.anInt4973 + arg6;
				@Pc(22) int local22 = local6.anInt5028 + arg7;
				@Pc(28) int local28;
				@Pc(30) int local30;
				@Pc(32) int local32;
				@Pc(34) int local34;
				@Pc(40) int local40;
				@Pc(45) int local45;
				if (local6.anInt4966 == 2) {
					local28 = arg2;
					local30 = arg3;
					local32 = arg4;
					local34 = arg5;
				} else {
					local40 = local17 + local6.anInt5035;
					local45 = local22 + local6.anInt4994;
					if (local6.anInt4966 == 9) {
						local40++;
						local45++;
					}
					local28 = local17 > arg2 ? local17 : arg2;
					local30 = local22 > arg3 ? local22 : arg3;
					local32 = local40 < arg4 ? local40 : arg4;
					local34 = local45 < arg5 ? local45 : arg5;
				}
				if (local6.anInt4966 == 0 || local6.aBoolean377 || method1604(local6).anInt890 != 0 || local6 == Static389.aClass199_10 || local6.anInt4955 == Static257.anInt4174 || local6.anInt4955 == Static611.anInt9385) {
					if (!method1611(local6)) {
						local40 = 0;
						local45 = 0;
						if (Static423.aBoolean517) {
							local40 = Static383.method8455();
							local45 = Static286.method4120();
						}
						if (local6 == Static507.aClass199_12 && Static253.method3678(Static507.aClass199_12) != null) {
							Static436.aBoolean594 = true;
							Static23.anInt516 = local17;
							Static146.anInt2668 = local22;
						}
						if (local6.aBoolean380 || local28 < local32 && local30 < local34) {
							if (local6.aBoolean387 && arg10 >= local28 && arg11 >= local30 && arg10 < local32 && arg11 < local34) {
								for (@Pc(168) Class4_Sub25 local168 = (Class4_Sub25) Static209.aClass163_20.method3639(); local168 != null; local168 = (Class4_Sub25) Static209.aClass163_20.method3640()) {
									if (local168.aBoolean318) {
										local168.method9000();
										local168.aClass199_6.aBoolean371 = false;
									}
								}
								if (Static9.anInt10387 == 0) {
									Static507.aClass199_12 = null;
									Static389.aClass199_10 = null;
								}
								Static481.anInt7584 = 0;
								Static470.aBoolean585 = false;
								Static363.aBoolean413 = false;
								if (!Static333.aBoolean400) {
									Static217.method3246();
								}
							}
							@Pc(232) boolean local232;
							if (Static373.aClass161_1.method5903() + local40 >= local28 && Static373.aClass161_1.method5898() + local45 >= local30 && Static373.aClass161_1.method5903() + local40 < local32 && Static373.aClass161_1.method5898() + local45 < local34) {
								local232 = true;
							} else {
								local232 = false;
							}
							if (!Static463.aBoolean582 && local232) {
								if (local6.anInt4965 >= 0) {
									Static530.anInt8205 = local6.anInt4965;
								} else if (local6.aBoolean387) {
									Static530.anInt8205 = -1;
								}
							}
							if (!Static333.aBoolean400 && arg10 >= local28 && arg11 >= local30 && arg10 < local32 && arg11 < local34) {
								Static476.method6546(arg10 - local17, local6, arg11 - local22);
							}
							@Pc(276) boolean local276 = false;
							if (Static373.aClass161_1.method5905() && local232) {
								local276 = true;
							}
							@Pc(286) boolean local286 = false;
							@Pc(291) Class4_Sub15 local291 = (Class4_Sub15) Static385.aClass163_35.method3639();
							if (local291 != null && local291.method4791() == 0 && local291.method4789() + local40 >= local28 && local291.method4787() + local45 >= local30 && local291.method4789() + local40 < local32 && local291.method4787() + local45 < local34) {
								local286 = true;
							}
							@Pc(335) int local335;
							@Pc(469) int local469;
							if (local6.aByteArray54 != null && !Static247.method3636()) {
								for (local335 = 0; local335 < local6.aByteArray54.length; local335++) {
									if (Static231.aClass102_6.method4311(local6.aByteArray54[local335])) {
										if (local6.anIntArray384 == null || Static177.anInt3088 >= local6.anIntArray384[local335]) {
											@Pc(367) byte local367 = local6.aByteArray55[local335];
											if (local367 == 0 || ((local367 & 0x8) == 0 || !Static231.aClass102_6.method4311(86) && !Static231.aClass102_6.method4311(82) && !Static231.aClass102_6.method4311(81)) && ((local367 & 0x2) == 0 || Static231.aClass102_6.method4311(86)) && ((local367 & 0x1) == 0 || Static231.aClass102_6.method4311(82)) && ((local367 & 0x4) == 0 || Static231.aClass102_6.method4311(81))) {
												if (local335 < 10) {
													Static331.method4566(-1, local6.anInt5041, "", local335 + 1);
												} else if (local335 == 10) {
													Static124.method2204();
													@Pc(438) Class4_Sub10 local438 = method1604(local6);
													Static200.method3058(local438.anInt889, local438.method815(), local6);
													Static384.aString73 = Static169.method2825(local6);
													if (Static384.aString73 == null) {
														Static384.aString73 = "Null";
													}
													Static203.aString30 = local6.aString50 + "<col=ffffff>";
												}
												local469 = local6.anIntArray381[local335];
												if (local6.anIntArray384 == null) {
													local6.anIntArray384 = new int[local6.aByteArray54.length];
												}
												if (local469 == 0) {
													local6.anIntArray384[local335] = Integer.MAX_VALUE;
												} else {
													local6.anIntArray384[local335] = Static177.anInt3088 + local469;
												}
											}
										}
									} else if (local6.anIntArray384 != null) {
										local6.anIntArray384[local335] = 0;
									}
								}
							}
							if (local286) {
								Static447.method6139(local40 + local291.method4789() - local17, local45 + local291.method4787() - local22, local6);
							}
							if (Static507.aClass199_12 != null && Static507.aClass199_12 != local6 && local232 && method1604(local6).method821()) {
								Static620.aClass199_15 = local6;
							}
							if (local6 == Static389.aClass199_10) {
								Static584.aBoolean331 = true;
								Static205.anInt3341 = local17;
								Static469.anInt7448 = local22;
							}
							if (local6.aBoolean377 || local6.anInt4955 != 0) {
								@Pc(558) Class4_Sub25 local558;
								if (local232 && Static191.anInt3219 != 0 && local6.anObjectArray11 != null) {
									local558 = new Class4_Sub25();
									local558.aBoolean318 = true;
									local558.aClass199_6 = local6;
									local558.anInt4279 = Static191.anInt3219;
									local558.anObjectArray2 = local6.anObjectArray11;
									Static209.aClass163_20.method3646(local558);
								}
								if (Static507.aClass199_12 != null || Static333.aBoolean400 || local6.anInt4955 != Static60.anInt1290 && Static481.anInt7584 > 0) {
									local286 = false;
									local276 = false;
									local232 = false;
								}
								@Pc(708) int local708;
								if (local6.anInt4955 != 0) {
									if (local6.anInt4955 == Static468.anInt7445 || local6.anInt4955 == Static365.anInt5492) {
										Static593.aClass199_16 = local6;
										if (Static596.aClass332_1 != null) {
											Static596.aClass332_1.method7317(Static582.aClass33_13, local6.anInt4994);
										}
										if (local6.anInt4955 == Static468.anInt7445) {
											if (Static333.aBoolean400 || arg10 < local28 || arg11 < local30 || arg10 >= local32 || arg11 >= local34) {
												continue;
											}
											Static129.method2317(arg9, Static582.aClass33_13, arg8);
											@Pc(641) Class3_Sub10 local641 = (Class3_Sub10) Static592.aClass236_8.method4958();
											while (true) {
												if (local641 == null) {
													continue label812;
												}
												if (arg10 >= local641.anInt10529 && arg10 < local641.anInt10532 && arg11 >= local641.anInt10534 && arg11 < local641.anInt10533) {
													Static217.method3246();
													Static513.method6972(local641.aClass3_Sub1_Sub2_Sub2_1);
												}
												local641 = (Class3_Sub10) Static592.aClass236_8.method4950();
											}
										}
									}
									@Pc(747) int local747;
									if (local6.anInt4955 == Static257.anInt4174) {
										if (local6.method4428(Static582.aClass33_13) == null || Static102.anInt10343 != 0 && Static102.anInt10343 != 3 || Static333.aBoolean400 || arg10 < local28 || arg11 < local30 || arg10 >= local32 || arg11 >= local34) {
											continue;
										}
										local335 = arg10 - local17;
										local708 = arg11 - local22;
										local469 = local6.anIntArray383[local708];
										if (local335 < local469 || local335 > local469 + local6.anIntArray387[local708]) {
											continue;
										}
										local335 -= local6.anInt5035 / 2;
										local708 -= local6.anInt4994 / 2;
										if (Static259.anInt4200 == 4) {
											local747 = (int) Static642.aFloat230 & 0x3FFF;
										} else {
											local747 = (int) Static642.aFloat230 + Static354.anInt5391 & 0x3FFF;
										}
										@Pc(759) int local759 = Class4_Sub2_Sub26.anIntArray563[local747];
										@Pc(763) int local763 = Class4_Sub2_Sub26.anIntArray562[local747];
										if (Static259.anInt4200 != 4) {
											local759 = local759 * (Static338.anInt5228 + 256) >> 8;
											local763 = local763 * (Static338.anInt5228 + 256) >> 8;
										}
										@Pc(792) int local792 = local708 * local759 + local335 * local763 >> 14;
										@Pc(802) int local802 = local708 * local763 - local335 * local759 >> 14;
										@Pc(813) int local813;
										@Pc(821) int local821;
										if (Static259.anInt4200 == 4) {
											local813 = (Static443.anInt6913 >> 9) + (local792 >> 2);
											local821 = (Static149.anInt2728 >> 9) - (local802 >> 2);
										} else {
											@Pc(830) int local830 = (Static554.aClass3_Sub1_Sub2_Sub2_Sub1_4.method8514() - 1) * 256;
											local813 = (Static554.aClass3_Sub1_Sub2_Sub2_Sub1_4.anInt9925 - local830 >> 9) + (local792 >> 2);
											local821 = (Static554.aClass3_Sub1_Sub2_Sub2_Sub1_4.anInt9917 - local830 >> 9) - (local802 >> 2);
										}
										if (Static463.aBoolean582 && (Static25.anInt576 & 0x40) != 0) {
											@Pc(863) Class199 local863 = Static203.method3070(Static292.anInt4612, Static169.anInt3012);
											if (local863 == null) {
												Static124.method2204();
											} else {
												Static321.method4431((long) (local6.anInt5005 << 0 | local6.anInt5041), local6.anInt5002, true, " ->", Static111.anInt2192, 1L, false, local821, 8, local813, Static384.aString73, true);
											}
											continue;
										}
										if (Static333.aClass234_5 == Static92.aClass234_1) {
											Static321.method4431(0L, -1, true, "", -1, 1L, false, local821, 4, local813, Static279.aClass179_27.method4066(Static164.anInt2984), true);
										}
										Static321.method4431(0L, -1, true, "", Static520.anInt8066, 1L, false, local821, 60, local813, Static331.aString59, true);
										continue;
									}
									if (local6.anInt4955 == Static60.anInt1290) {
										Static277.aClass199_7 = local6;
										if (local232) {
											Static470.aBoolean585 = true;
										}
										if (local286) {
											local335 = (int) ((double) (local40 + local291.method4789() - local17 - local6.anInt5035 / 2) * 2.0D / (double) Static154.aFloat9);
											local708 = (int) -((double) (local45 + local291.method4787() - local22 - local6.anInt4994 / 2) * 2.0D / (double) Static154.aFloat9);
											local469 = Static253.anInt4127 + local335 + Static154.anInt437;
											local747 = Static379.anInt5638 + local708 + Static154.anInt439;
											@Pc(994) Class4_Sub5_Sub3 local994 = Static481.method6594();
											if (local994 == null) {
												continue;
											}
											@Pc(999) int[] local999 = new int[3];
											local994.method804(local747, local469, local999);
											if (local999 != null) {
												if (Static231.aClass102_6.method4311(82) && Static279.anInt4498 > 0) {
													Static98.method1981(local999[1], local999[2], local999[0]);
													continue;
												}
												Static363.aBoolean413 = true;
												Static56.anInt1266 = local999[0];
												Static567.anInt8751 = local999[1];
												Static273.anInt4430 = local999[2];
											}
											Static481.anInt7584 = 1;
											Static387.aBoolean428 = false;
											Static156.anInt2899 = Static373.aClass161_1.method5903();
											Static624.anInt9782 = Static373.aClass161_1.method5898();
											continue;
										}
										if (local276 && Static481.anInt7584 > 0) {
											if (Static481.anInt7584 == 1 && (Static156.anInt2899 != Static373.aClass161_1.method5903() || Static624.anInt9782 != Static373.aClass161_1.method5898())) {
												Static53.anInt1221 = Static253.anInt4127;
												Static406.anInt5881 = Static379.anInt5638;
												Static481.anInt7584 = 2;
											}
											if (Static481.anInt7584 == 2) {
												Static387.aBoolean428 = true;
												Static89.method1800(Static53.anInt1221 + (int) ((double) (Static156.anInt2899 - Static373.aClass161_1.method5903()) * 2.0D / (double) Static154.aFloat8));
												Static233.method3356(Static406.anInt5881 - (int) ((double) (Static624.anInt9782 - Static373.aClass161_1.method5898()) * 2.0D / (double) Static154.aFloat8));
											}
											continue;
										}
										if (Static481.anInt7584 > 0 && !Static387.aBoolean428) {
											if ((Static18.anInt6908 == 1 || Static327.method4497()) && Static574.anInt8895 > 2) {
												Static159.method2742(Static624.anInt9782, Static156.anInt2899);
											} else if (Static47.method833()) {
												Static159.method2742(Static624.anInt9782, Static156.anInt2899);
											}
										}
										Static481.anInt7584 = 0;
										continue;
									}
									if (local6.anInt4955 == Static265.anInt4285) {
										if (local276) {
											Static340.method4635(local6.anInt4994, local6.anInt5035, local45 + Static373.aClass161_1.method5898() - local22, local40 + Static373.aClass161_1.method5903() - local17);
										}
										continue;
									}
									if (local6.anInt4955 == Static611.anInt9385) {
										Static492.method6685(local22, local17, local6);
										continue;
									}
								}
								if (!local6.aBoolean376 && local286) {
									local6.aBoolean376 = true;
									if (local6.anObjectArray26 != null) {
										local558 = new Class4_Sub25();
										local558.aBoolean318 = true;
										local558.aClass199_6 = local6;
										local558.anInt4282 = local40 + local291.method4789() - local17;
										local558.anInt4279 = local45 + local291.method4787() - local22;
										local558.anObjectArray2 = local6.anObjectArray26;
										Static209.aClass163_20.method3646(local558);
									}
								}
								if (local6.aBoolean376 && local276 && local6.anObjectArray13 != null) {
									local558 = new Class4_Sub25();
									local558.aBoolean318 = true;
									local558.aClass199_6 = local6;
									local558.anInt4282 = local40 + Static373.aClass161_1.method5903() - local17;
									local558.anInt4279 = local45 + Static373.aClass161_1.method5898() - local22;
									local558.anObjectArray2 = local6.anObjectArray13;
									Static209.aClass163_20.method3646(local558);
								}
								if (local6.aBoolean376 && !local276) {
									local6.aBoolean376 = false;
									if (local6.anObjectArray32 != null) {
										local558 = new Class4_Sub25();
										local558.aBoolean318 = true;
										local558.aClass199_6 = local6;
										local558.anInt4282 = local40 + Static373.aClass161_1.method5903() - local17;
										local558.anInt4279 = local45 + Static373.aClass161_1.method5898() - local22;
										local558.anObjectArray2 = local6.anObjectArray32;
										Static152.aClass163_18.method3646(local558);
									}
								}
								if (local276 && local6.anObjectArray14 != null) {
									local558 = new Class4_Sub25();
									local558.aBoolean318 = true;
									local558.aClass199_6 = local6;
									local558.anInt4282 = local40 + Static373.aClass161_1.method5903() - local17;
									local558.anInt4279 = local45 + Static373.aClass161_1.method5898() - local22;
									local558.anObjectArray2 = local6.anObjectArray14;
									Static209.aClass163_20.method3646(local558);
								}
								if (!local6.aBoolean371 && local232) {
									local6.aBoolean371 = true;
									if (local6.anObjectArray15 != null) {
										local558 = new Class4_Sub25();
										local558.aBoolean318 = true;
										local558.aClass199_6 = local6;
										local558.anInt4282 = local40 + Static373.aClass161_1.method5903() - local17;
										local558.anInt4279 = local45 + Static373.aClass161_1.method5898() - local22;
										local558.anObjectArray2 = local6.anObjectArray15;
										Static209.aClass163_20.method3646(local558);
									}
								}
								if (local6.aBoolean371 && local232 && local6.anObjectArray21 != null) {
									local558 = new Class4_Sub25();
									local558.aBoolean318 = true;
									local558.aClass199_6 = local6;
									local558.anInt4282 = local40 + Static373.aClass161_1.method5903() - local17;
									local558.anInt4279 = local45 + Static373.aClass161_1.method5898() - local22;
									local558.anObjectArray2 = local6.anObjectArray21;
									Static209.aClass163_20.method3646(local558);
								}
								if (local6.aBoolean371 && !local232) {
									local6.aBoolean371 = false;
									if (local6.anObjectArray16 != null) {
										local558 = new Class4_Sub25();
										local558.aBoolean318 = true;
										local558.aClass199_6 = local6;
										local558.anInt4282 = local40 + Static373.aClass161_1.method5903() - local17;
										local558.anInt4279 = local45 + Static373.aClass161_1.method5898() - local22;
										local558.anObjectArray2 = local6.anObjectArray16;
										Static152.aClass163_18.method3646(local558);
									}
								}
								if (local6.anObjectArray28 != null) {
									local558 = new Class4_Sub25();
									local558.aClass199_6 = local6;
									local558.anObjectArray2 = local6.anObjectArray28;
									Static363.aClass163_33.method3646(local558);
								}
								@Pc(1570) Class4_Sub25 local1570;
								if (local6.anObjectArray10 != null && Static116.anInt2236 > local6.anInt5040) {
									if (local6.anIntArray389 == null || Static116.anInt2236 - local6.anInt5040 > 32) {
										local558 = new Class4_Sub25();
										local558.aClass199_6 = local6;
										local558.anObjectArray2 = local6.anObjectArray10;
										Static209.aClass163_20.method3646(local558);
									} else {
										label699: for (local335 = local6.anInt5040; local335 < Static116.anInt2236; local335++) {
											local708 = Static157.anIntArray207[local335 & 0x1F];
											for (local469 = 0; local469 < local6.anIntArray389.length; local469++) {
												if (local6.anIntArray389[local469] == local708) {
													local1570 = new Class4_Sub25();
													local1570.aClass199_6 = local6;
													local1570.anObjectArray2 = local6.anObjectArray10;
													Static209.aClass163_20.method3646(local1570);
													break label699;
												}
											}
										}
									}
									local6.anInt5040 = Static116.anInt2236;
								}
								if (local6.anObjectArray4 != null && Static192.anInt3237 > local6.anInt4971) {
									if (local6.anIntArray385 == null || Static192.anInt3237 - local6.anInt4971 > 32) {
										local558 = new Class4_Sub25();
										local558.aClass199_6 = local6;
										local558.anObjectArray2 = local6.anObjectArray4;
										Static209.aClass163_20.method3646(local558);
									} else {
										label675: for (local335 = local6.anInt4971; local335 < Static192.anInt3237; local335++) {
											local708 = Static436.anIntArray513[local335 & 0x1F];
											for (local469 = 0; local469 < local6.anIntArray385.length; local469++) {
												if (local6.anIntArray385[local469] == local708) {
													local1570 = new Class4_Sub25();
													local1570.aClass199_6 = local6;
													local1570.anObjectArray2 = local6.anObjectArray4;
													Static209.aClass163_20.method3646(local1570);
													break label675;
												}
											}
										}
									}
									local6.anInt4971 = Static192.anInt3237;
								}
								if (local6.anObjectArray29 != null && Static538.anInt8331 > local6.anInt4979) {
									if (local6.anIntArray388 == null || Static538.anInt8331 - local6.anInt4979 > 32) {
										local558 = new Class4_Sub25();
										local558.aClass199_6 = local6;
										local558.anObjectArray2 = local6.anObjectArray29;
										Static209.aClass163_20.method3646(local558);
									} else {
										label651: for (local335 = local6.anInt4979; local335 < Static538.anInt8331; local335++) {
											local708 = Static619.anIntArray669[local335 & 0x1F];
											for (local469 = 0; local469 < local6.anIntArray388.length; local469++) {
												if (local6.anIntArray388[local469] == local708) {
													local1570 = new Class4_Sub25();
													local1570.aClass199_6 = local6;
													local1570.anObjectArray2 = local6.anObjectArray29;
													Static209.aClass163_20.method3646(local1570);
													break label651;
												}
											}
										}
									}
									local6.anInt4979 = Static538.anInt8331;
								}
								if (local6.anObjectArray5 != null && Static529.anInt2658 > local6.anInt4992) {
									if (local6.anIntArray386 == null || Static529.anInt2658 - local6.anInt4992 > 32) {
										local558 = new Class4_Sub25();
										local558.aClass199_6 = local6;
										local558.anObjectArray2 = local6.anObjectArray5;
										Static209.aClass163_20.method3646(local558);
									} else {
										label627: for (local335 = local6.anInt4992; local335 < Static529.anInt2658; local335++) {
											local708 = Static356.anIntArray417[local335 & 0x1F];
											for (local469 = 0; local469 < local6.anIntArray386.length; local469++) {
												if (local6.anIntArray386[local469] == local708) {
													local1570 = new Class4_Sub25();
													local1570.aClass199_6 = local6;
													local1570.anObjectArray2 = local6.anObjectArray5;
													Static209.aClass163_20.method3646(local1570);
													break label627;
												}
											}
										}
									}
									local6.anInt4992 = Static529.anInt2658;
								}
								if (local6.anObjectArray17 != null && Static617.anInt9687 > local6.anInt4993) {
									if (local6.anIntArray382 == null || Static617.anInt9687 - local6.anInt4993 > 32) {
										local558 = new Class4_Sub25();
										local558.aClass199_6 = local6;
										local558.anObjectArray2 = local6.anObjectArray17;
										Static209.aClass163_20.method3646(local558);
									} else {
										label603: for (local335 = local6.anInt4993; local335 < Static617.anInt9687; local335++) {
											local708 = Static257.anIntArray303[local335 & 0x1F];
											for (local469 = 0; local469 < local6.anIntArray382.length; local469++) {
												if (local6.anIntArray382[local469] == local708) {
													local1570 = new Class4_Sub25();
													local1570.aClass199_6 = local6;
													local1570.anObjectArray2 = local6.anObjectArray17;
													Static209.aClass163_20.method3646(local1570);
													break label603;
												}
											}
										}
									}
									local6.anInt4993 = Static617.anInt9687;
								}
								if (Static178.anInt3101 > local6.anInt4963 && local6.anObjectArray30 != null) {
									local558 = new Class4_Sub25();
									local558.aClass199_6 = local6;
									local558.anObjectArray2 = local6.anObjectArray30;
									Static209.aClass163_20.method3646(local558);
								}
								if (Static261.anInt4244 > local6.anInt4963 && local6.anObjectArray18 != null) {
									local558 = new Class4_Sub25();
									local558.aClass199_6 = local6;
									local558.anObjectArray2 = local6.anObjectArray18;
									Static209.aClass163_20.method3646(local558);
								}
								if (Static470.anInt7475 > local6.anInt4963 && local6.anObjectArray23 != null) {
									local558 = new Class4_Sub25();
									local558.aClass199_6 = local6;
									local558.anObjectArray2 = local6.anObjectArray23;
									Static209.aClass163_20.method3646(local558);
								}
								if (Static569.anInt8772 > local6.anInt4963 && local6.anObjectArray20 != null) {
									local558 = new Class4_Sub25();
									local558.aClass199_6 = local6;
									local558.anObjectArray2 = local6.anObjectArray20;
									Static209.aClass163_20.method3646(local558);
								}
								if (Static183.anInt3143 > local6.anInt4963 && local6.anObjectArray34 != null) {
									local558 = new Class4_Sub25();
									local558.aClass199_6 = local6;
									local558.anObjectArray2 = local6.anObjectArray34;
									Static209.aClass163_20.method3646(local558);
								}
								if (Static217.anInt3520 > local6.anInt4963 && local6.anObjectArray19 != null) {
									local558 = new Class4_Sub25();
									local558.aClass199_6 = local6;
									local558.anObjectArray2 = local6.anObjectArray19;
									Static209.aClass163_20.method3646(local558);
								}
								if (Static465.anInt7431 > local6.anInt4963 && local6.anObjectArray25 != null) {
									local558 = new Class4_Sub25();
									local558.aClass199_6 = local6;
									local558.anObjectArray2 = local6.anObjectArray25;
									Static209.aClass163_20.method3646(local558);
								}
								local6.anInt4963 = Static317.anInt4914;
								if (local6.anObjectArray31 != null) {
									for (local335 = 0; local335 < Static411.anInt5921; local335++) {
										@Pc(2082) Class4_Sub25 local2082 = new Class4_Sub25();
										local2082.aClass199_6 = local6;
										local2082.anInt4281 = Static76.anInterface26Array1[local335].method7132();
										local2082.anInt4283 = Static76.anInterface26Array1[local335].method7134();
										local2082.anObjectArray2 = local6.anObjectArray31;
										Static209.aClass163_20.method3646(local2082);
									}
								}
								if (Static379.aBoolean423 && local6.anObjectArray12 != null) {
									local558 = new Class4_Sub25();
									local558.aClass199_6 = local6;
									local558.anObjectArray2 = local6.anObjectArray12;
									Static209.aClass163_20.method3646(local558);
								}
							}
							if (local6.anInt4966 == 5 && local6.anInt4998 != -1) {
								local6.method4430(Static153.aClass344_1, Static422.aClass273_1).method7317(Static582.aClass33_13, local6.anInt4994);
							}
							Static261.method3769(local6);
							if (local6.anInt4966 == 0) {
								method1615(arg0, local6.anInt5041, local28, local30, local32, local34, local17 - local6.anInt5031, local22 - local6.anInt4977, arg8, arg9, arg10, arg11);
								if (local6.aClass199Array1 != null) {
									method1615(local6.aClass199Array1, local6.anInt5041, local28, local30, local32, local34, local17 - local6.anInt5031, local22 - local6.anInt4977, arg8, arg9, arg10, arg11);
								}
								@Pc(2208) Class4_Sub28 local2208 = (Class4_Sub28) Static242.aClass66_17.method1994((long) local6.anInt5041);
								if (local2208 != null) {
									if (Static333.aClass234_5 == Static179.aClass234_2 && local2208.anInt4696 == 0 && !Static333.aBoolean400 && local232 && !Static110.aBoolean147) {
										Static217.method3246();
									}
									Static653.method8705(arg8, local22, arg10, local17, local34, local28, arg11, local30, local2208.anInt4697, local32, arg9);
								}
							}
						}
					}
				} else if (local28 < local32 && local30 < local34) {
					Static261.method3769(local6);
				}
			}
		}
	}
}
