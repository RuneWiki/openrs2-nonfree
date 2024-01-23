import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static35 {

	@OriginalMember(owner = "client!client", name = "bb", descriptor = "I")
	public static int anInt740;

	@OriginalMember(owner = "client!client", name = "ob", descriptor = "Lclient!vf;")
	public static Class1_Sub1_Sub8 aClass1_Sub1_Sub8_3;

	@OriginalMember(owner = "client!client", name = "Y", descriptor = "I")
	public static int anInt737 = -1;

	@OriginalMember(owner = "client!client", name = "fb", descriptor = "I")
	public static int anInt744 = -1;

	@OriginalMember(owner = "client!client", name = "mb", descriptor = "Lclient!oj;")
	public static Class84 aClass84_15 = new Class84(32);

	@OriginalMember(owner = "client!client", name = "pb", descriptor = "[Lclient!rg;")
	public static Class100[] aClass100Array1 = new Class100[6];

	@OriginalMember(owner = "client!client", name = "qb", descriptor = "Lclient!hh;")
	public static Class50 aClass50_278 = Static186.method3527("");

	@OriginalMember(owner = "client!client", name = "rb", descriptor = "Z")
	public static boolean aBoolean27 = true;

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!qh;)Lclient!qh;")
	public static Class93 method550(@OriginalArg(0) Class93 arg0) {
		@Pc(4) int local4 = Static121.method1938(method552(arg0));
		if (local4 == 0) {
			return null;
		}
		for (@Pc(10) int local10 = 0; local10 < local4; local10++) {
			arg0 = Static164.method2725(arg0.anInt3660);
			if (arg0 == null) {
				return null;
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!client", name = "h", descriptor = "(I)V")
	public static void method551() {
		Static199.aClass84_32.method2585();
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Lclient!qh;)I")
	public static int method552(@OriginalArg(0) Class93 arg0) {
		@Pc(13) Class1_Sub5 local13 = (Class1_Sub5) Static144.aClass90_14.method2819(((long) arg0.anInt3603 << 32) + (long) arg0.anInt3614);
		return local13 == null ? arg0.anInt3662 : local13.anInt409;
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "([Lclient!qh;IIIIIII)V")
	public static void method557(@OriginalArg(0) Class93[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		for (@Pc(1) int local1 = 0; local1 < arg0.length; local1++) {
			@Pc(6) Class93 local6 = arg0[local1];
			if (local6 != null && local6.anInt3660 == arg1 && (!local6.aBoolean156 || local6.anInt3656 == 0 || local6.aBoolean155 || method552(local6) != 0 || local6 == Static53.aClass93_34 || local6.anInt3618 == 1338) && (!local6.aBoolean156 || !method561(local6))) {
				@Pc(42) int local42 = local6.anInt3631 + arg6;
				@Pc(47) int local47 = local6.anInt3619 + arg7;
				@Pc(53) int local53;
				@Pc(55) int local55;
				@Pc(57) int local57;
				@Pc(59) int local59;
				if (local6.anInt3656 == 2) {
					local53 = arg2;
					local55 = arg3;
					local57 = arg4;
					local59 = arg5;
				} else {
					@Pc(65) int local65 = local42 + local6.anInt3600;
					@Pc(70) int local70 = local47 + local6.anInt3620;
					if (local6.anInt3656 == 9) {
						local65++;
						local70++;
					}
					local53 = local42 > arg2 ? local42 : arg2;
					local55 = local47 > arg3 ? local47 : arg3;
					local57 = local65 < arg4 ? local65 : arg4;
					local59 = local70 < arg5 ? local70 : arg5;
				}
				if (local6 == Static54.aClass93_35) {
					Static7.aBoolean6 = true;
					Static70.anInt1325 = local42;
					Static179.anInt3724 = local47;
				}
				if (!local6.aBoolean156 || local53 < local57 && local55 < local59) {
					if (local6.anInt3656 == 0) {
						if (!local6.aBoolean156 && method561(local6) && Static147.aClass93_91 != local6) {
							continue;
						}
						if (local6.aBoolean152 && Static117.anInt2301 >= local53 && Static110.anInt2205 >= local55 && Static117.anInt2301 < local57 && Static110.anInt2205 < local59) {
							for (@Pc(155) Class1_Sub29 local155 = (Class1_Sub29) Static209.aClass75_21.method2239(); local155 != null; local155 = (Class1_Sub29) Static209.aClass75_21.method2238()) {
								if (local155.aBoolean211) {
									local155.method3525();
								}
							}
							if (Static150.anInt3122 == 0) {
								Static54.aClass93_35 = null;
								Static53.aClass93_34 = null;
							}
							Static121.aBoolean103 = false;
						}
					}
					if (local6.aBoolean156) {
						@Pc(194) boolean local194;
						if (Static117.anInt2301 >= local53 && Static110.anInt2205 >= local55 && Static117.anInt2301 < local57 && Static110.anInt2205 < local59) {
							local194 = true;
						} else {
							local194 = false;
						}
						@Pc(199) boolean local199 = false;
						if (Static64.anInt1281 == 1 && local194) {
							local199 = true;
						}
						@Pc(208) boolean local208 = false;
						if (Static2.anInt59 == 1 && Static70.anInt1323 >= local53 && Static163.anInt3374 >= local55 && Static70.anInt1323 < local57 && Static163.anInt3374 < local59) {
							local208 = true;
						}
						@Pc(232) int local232;
						@Pc(235) int local235;
						@Pc(243) int local243;
						if (Static40.anInt879 > 0 && local6.aByteArray51 != null) {
							for (local232 = 0; local232 < local6.aByteArray51.length; local232++) {
								for (local235 = 0; local235 < Static40.anInt879; local235++) {
									local243 = local6.aByteArray51[local232] & 0xFF;
									if (local243 == Static122.anIntArray270[local235]) {
										Static4.method71(-1, local232 + 1, local6.anInt3603, Static7.aClass50_69);
									}
								}
							}
						}
						if (local208) {
							Static141.method3018(Static163.anInt3374 - local47, Static70.anInt1323 - local42, local6);
						}
						if (Static54.aClass93_35 != null && Static54.aClass93_35 != local6 && local194 && Static16.method233(method552(local6))) {
							Static93.aClass93_58 = local6;
						}
						if (local6 == Static53.aClass93_34) {
							Static10.aBoolean9 = true;
							Static33.anInt627 = local42;
							Static165.anInt2676 = local47;
						}
						if (local6.aBoolean155 || local6.anInt3618 != 0) {
							@Pc(318) Class1_Sub29 local318;
							if (local194 && Static87.anInt1831 != 0 && local6.anObjectArray3 != null) {
								local318 = new Class1_Sub29();
								local318.aBoolean211 = true;
								local318.aClass93_119 = local6;
								local318.anInt4357 = Static87.anInt1831;
								local318.anObjectArray33 = local6.anObjectArray3;
								Static209.aClass75_21.method2240(local318);
							}
							if (Static54.aClass93_35 != null || Static9.aClass93_9 != null || Static40.aBoolean44 || local6.anInt3618 != 1400 && Static121.aBoolean103) {
								local208 = false;
								local199 = false;
								local194 = false;
							}
							if (local6.anInt3618 != 0) {
								if (local6.anInt3618 == 1337) {
									Static186.aClass93_126 = local6;
									Static66.method999(local6);
									continue;
								}
								if (local6.anInt3618 == 1338) {
									if (local208) {
										Static7.method127(Static163.anInt3374 - local47, local6, Static70.anInt1323 - local42);
									}
									continue;
								}
								if (local6.anInt3618 == 1400) {
									Static124.aClass93_73 = local6;
									if (local208) {
										if (Static188.aBooleanArray21[82] && Static122.anInt2447 > 0) {
											local232 = (int) ((double) (Static70.anInt1323 - local42 - local6.anInt3600 / 2) * 2.0D / (double) Static198.aFloat6);
											local235 = (int) ((double) (Static163.anInt3374 - local47 - local6.anInt3620 / 2) * 2.0D / (double) Static198.aFloat6);
											local243 = Static4.anInt87 + local232;
											@Pc(436) int local436 = Static177.anInt3717 + local235;
											@Pc(440) int local440 = local243 + Static121.anInt2393;
											@Pc(448) int local448 = Static12.anInt239 + Static195.anInt3969 - local436 - 1;
											Static16.method231(local448, 0, local440);
											Static95.method1498();
											continue;
										}
										Static121.aBoolean103 = true;
										Static27.anInt540 = Static117.anInt2301;
										Static155.anInt3202 = Static110.anInt2205;
										Static68.anInt1305 = Static4.anInt87;
										Static143.anInt2906 = Static177.anInt3717;
										continue;
									}
									if (local199 && Static121.aBoolean103) {
										Static43.method681(Static68.anInt1305 + (int) ((double) (Static27.anInt540 - Static117.anInt2301) * 2.0D / (double) Static64.aFloat1));
										Static141.method3015(Static143.anInt2906 + (int) ((double) (Static155.anInt3202 - Static110.anInt2205) * 2.0D / (double) Static64.aFloat1));
										continue;
									}
									Static121.aBoolean103 = false;
									continue;
								}
								if (local6.anInt3618 == 1401) {
									if (local199) {
										Static86.method1292(Static110.anInt2205 - local47, Static117.anInt2301 - local42, local6.anInt3620, local6.anInt3600);
									}
									continue;
								}
								if (local6.anInt3618 == 1402) {
									Static66.method999(local6);
									continue;
								}
								if (local6.anInt3618 == 1404) {
									Static66.method999(local6);
									continue;
								}
							}
							if (!local6.aBoolean153 && local208) {
								local6.aBoolean153 = true;
								if (local6.anObjectArray8 != null) {
									local318 = new Class1_Sub29();
									local318.aBoolean211 = true;
									local318.aClass93_119 = local6;
									local318.anInt4353 = Static70.anInt1323 - local42;
									local318.anInt4357 = Static163.anInt3374 - local47;
									local318.anObjectArray33 = local6.anObjectArray8;
									Static209.aClass75_21.method2240(local318);
								}
							}
							if (local6.aBoolean153 && local199 && local6.anObjectArray16 != null) {
								local318 = new Class1_Sub29();
								local318.aBoolean211 = true;
								local318.aClass93_119 = local6;
								local318.anInt4353 = Static117.anInt2301 - local42;
								local318.anInt4357 = Static110.anInt2205 - local47;
								local318.anObjectArray33 = local6.anObjectArray16;
								Static209.aClass75_21.method2240(local318);
							}
							if (local6.aBoolean153 && !local199) {
								local6.aBoolean153 = false;
								if (local6.anObjectArray2 != null) {
									local318 = new Class1_Sub29();
									local318.aBoolean211 = true;
									local318.aClass93_119 = local6;
									local318.anInt4353 = Static117.anInt2301 - local42;
									local318.anInt4357 = Static110.anInt2205 - local47;
									local318.anObjectArray33 = local6.anObjectArray2;
									Static191.aClass75_19.method2240(local318);
								}
							}
							if (local199 && local6.anObjectArray6 != null) {
								local318 = new Class1_Sub29();
								local318.aBoolean211 = true;
								local318.aClass93_119 = local6;
								local318.anInt4353 = Static117.anInt2301 - local42;
								local318.anInt4357 = Static110.anInt2205 - local47;
								local318.anObjectArray33 = local6.anObjectArray6;
								Static209.aClass75_21.method2240(local318);
							}
							if (!local6.aBoolean160 && local194) {
								local6.aBoolean160 = true;
								if (local6.anObjectArray7 != null) {
									local318 = new Class1_Sub29();
									local318.aBoolean211 = true;
									local318.aClass93_119 = local6;
									local318.anInt4353 = Static117.anInt2301 - local42;
									local318.anInt4357 = Static110.anInt2205 - local47;
									local318.anObjectArray33 = local6.anObjectArray7;
									Static209.aClass75_21.method2240(local318);
								}
							}
							if (local6.aBoolean160 && local194 && local6.anObjectArray21 != null) {
								local318 = new Class1_Sub29();
								local318.aBoolean211 = true;
								local318.aClass93_119 = local6;
								local318.anInt4353 = Static117.anInt2301 - local42;
								local318.anInt4357 = Static110.anInt2205 - local47;
								local318.anObjectArray33 = local6.anObjectArray21;
								Static209.aClass75_21.method2240(local318);
							}
							if (local6.aBoolean160 && !local194) {
								local6.aBoolean160 = false;
								if (local6.anObjectArray31 != null) {
									local318 = new Class1_Sub29();
									local318.aBoolean211 = true;
									local318.aClass93_119 = local6;
									local318.anInt4353 = Static117.anInt2301 - local42;
									local318.anInt4357 = Static110.anInt2205 - local47;
									local318.anObjectArray33 = local6.anObjectArray31;
									Static191.aClass75_19.method2240(local318);
								}
							}
							if (local6.anObjectArray29 != null) {
								local318 = new Class1_Sub29();
								local318.aClass93_119 = local6;
								local318.anObjectArray33 = local6.anObjectArray29;
								Static23.aClass75_3.method2240(local318);
							}
							@Pc(872) Class1_Sub29 local872;
							if (local6.anObjectArray4 != null && Static183.anInt3798 > local6.anInt3613) {
								if (local6.anIntArray391 == null || Static183.anInt3798 - local6.anInt3613 > 32) {
									local318 = new Class1_Sub29();
									local318.aClass93_119 = local6;
									local318.anObjectArray33 = local6.anObjectArray4;
									Static209.aClass75_21.method2240(local318);
								} else {
									label531: for (local232 = local6.anInt3613; local232 < Static183.anInt3798; local232++) {
										local235 = Static3.anIntArray14[local232 & 0x1F];
										for (local243 = 0; local243 < local6.anIntArray391.length; local243++) {
											if (local6.anIntArray391[local243] == local235) {
												local872 = new Class1_Sub29();
												local872.aClass93_119 = local6;
												local872.anObjectArray33 = local6.anObjectArray4;
												Static209.aClass75_21.method2240(local872);
												break label531;
											}
										}
									}
								}
								local6.anInt3613 = Static183.anInt3798;
							}
							if (local6.anObjectArray17 != null && Static232.anInt4448 > local6.anInt3634) {
								if (local6.anIntArray393 == null || Static232.anInt4448 - local6.anInt3634 > 32) {
									local318 = new Class1_Sub29();
									local318.aClass93_119 = local6;
									local318.anObjectArray33 = local6.anObjectArray17;
									Static209.aClass75_21.method2240(local318);
								} else {
									label507: for (local232 = local6.anInt3634; local232 < Static232.anInt4448; local232++) {
										local235 = Static152.anIntArray328[local232 & 0x1F];
										for (local243 = 0; local243 < local6.anIntArray393.length; local243++) {
											if (local6.anIntArray393[local243] == local235) {
												local872 = new Class1_Sub29();
												local872.aClass93_119 = local6;
												local872.anObjectArray33 = local6.anObjectArray17;
												Static209.aClass75_21.method2240(local872);
												break label507;
											}
										}
									}
								}
								local6.anInt3634 = Static232.anInt4448;
							}
							if (local6.anObjectArray22 != null && Static176.anInt3680 > local6.anInt3635) {
								if (local6.anIntArray387 == null || Static176.anInt3680 - local6.anInt3635 > 32) {
									local318 = new Class1_Sub29();
									local318.aClass93_119 = local6;
									local318.anObjectArray33 = local6.anObjectArray22;
									Static209.aClass75_21.method2240(local318);
								} else {
									label483: for (local232 = local6.anInt3635; local232 < Static176.anInt3680; local232++) {
										local235 = Static204.anIntArray466[local232 & 0x1F];
										for (local243 = 0; local243 < local6.anIntArray387.length; local243++) {
											if (local6.anIntArray387[local243] == local235) {
												local872 = new Class1_Sub29();
												local872.aClass93_119 = local6;
												local872.anObjectArray33 = local6.anObjectArray22;
												Static209.aClass75_21.method2240(local872);
												break label483;
											}
										}
									}
								}
								local6.anInt3635 = Static176.anInt3680;
							}
							if (local6.anObjectArray25 != null && Static46.anInt950 > local6.anInt3637) {
								if (local6.anIntArray390 == null || Static46.anInt950 - local6.anInt3637 > 32) {
									local318 = new Class1_Sub29();
									local318.aClass93_119 = local6;
									local318.anObjectArray33 = local6.anObjectArray25;
									Static209.aClass75_21.method2240(local318);
								} else {
									label459: for (local232 = local6.anInt3637; local232 < Static46.anInt950; local232++) {
										local235 = Static188.anIntArray439[local232 & 0x1F];
										for (local243 = 0; local243 < local6.anIntArray390.length; local243++) {
											if (local6.anIntArray390[local243] == local235) {
												local872 = new Class1_Sub29();
												local872.aClass93_119 = local6;
												local872.anObjectArray33 = local6.anObjectArray25;
												Static209.aClass75_21.method2240(local872);
												break label459;
											}
										}
									}
								}
								local6.anInt3637 = Static46.anInt950;
							}
							if (local6.anObjectArray23 != null && Static109.anInt2169 > local6.anInt3663) {
								if (local6.anIntArray400 == null || Static109.anInt2169 - local6.anInt3663 > 32) {
									local318 = new Class1_Sub29();
									local318.aClass93_119 = local6;
									local318.anObjectArray33 = local6.anObjectArray23;
									Static209.aClass75_21.method2240(local318);
								} else {
									label435: for (local232 = local6.anInt3663; local232 < Static109.anInt2169; local232++) {
										local235 = Static227.anIntArray504[local232 & 0x1F];
										for (local243 = 0; local243 < local6.anIntArray400.length; local243++) {
											if (local6.anIntArray400[local243] == local235) {
												local872 = new Class1_Sub29();
												local872.aClass93_119 = local6;
												local872.anObjectArray33 = local6.anObjectArray23;
												Static209.aClass75_21.method2240(local872);
												break label435;
											}
										}
									}
								}
								local6.anInt3663 = Static109.anInt2169;
							}
							if (Static38.anInt832 > local6.anInt3633 && local6.anObjectArray20 != null) {
								local318 = new Class1_Sub29();
								local318.aClass93_119 = local6;
								local318.anObjectArray33 = local6.anObjectArray20;
								Static209.aClass75_21.method2240(local318);
							}
							if (Static205.anInt4112 > local6.anInt3633 && local6.anObjectArray30 != null) {
								local318 = new Class1_Sub29();
								local318.aClass93_119 = local6;
								local318.anObjectArray33 = local6.anObjectArray30;
								Static209.aClass75_21.method2240(local318);
							}
							if (Static185.anInt3847 > local6.anInt3633 && local6.anObjectArray24 != null) {
								local318 = new Class1_Sub29();
								local318.aClass93_119 = local6;
								local318.anObjectArray33 = local6.anObjectArray24;
								Static209.aClass75_21.method2240(local318);
							}
							if (Static91.anInt4082 > local6.anInt3633 && local6.anObjectArray28 != null) {
								local318 = new Class1_Sub29();
								local318.aClass93_119 = local6;
								local318.anObjectArray33 = local6.anObjectArray28;
								Static209.aClass75_21.method2240(local318);
							}
							if (Static155.anInt3200 > local6.anInt3633 && local6.anObjectArray18 != null) {
								local318 = new Class1_Sub29();
								local318.aClass93_119 = local6;
								local318.anObjectArray33 = local6.anObjectArray18;
								Static209.aClass75_21.method2240(local318);
							}
							local6.anInt3633 = Static31.anInt594;
							if (local6.anObjectArray26 != null) {
								for (local232 = 0; local232 < Static40.anInt879; local232++) {
									@Pc(1340) Class1_Sub29 local1340 = new Class1_Sub29();
									local1340.aClass93_119 = local6;
									local1340.anInt4356 = Static122.anIntArray270[local232];
									local1340.anInt4355 = Static186.anIntArray518[local232];
									local1340.anObjectArray33 = local6.anObjectArray26;
									Static209.aClass75_21.method2240(local1340);
								}
							}
							if (Static135.aBoolean118 && local6.anObjectArray13 != null) {
								local318 = new Class1_Sub29();
								local318.aClass93_119 = local6;
								local318.anObjectArray33 = local6.anObjectArray13;
								Static209.aClass75_21.method2240(local318);
							}
						}
					}
					if (!local6.aBoolean156 && Static54.aClass93_35 == null && Static9.aClass93_9 == null && !Static40.aBoolean44) {
						if ((local6.anInt3589 >= 0 || local6.anInt3646 != 0) && Static117.anInt2301 >= local53 && Static110.anInt2205 >= local55 && Static117.anInt2301 < local57 && Static110.anInt2205 < local59) {
							if (local6.anInt3589 >= 0) {
								Static147.aClass93_91 = arg0[local6.anInt3589];
							} else {
								Static147.aClass93_91 = local6;
							}
						}
						if (local6.anInt3656 == 8 && Static117.anInt2301 >= local53 && Static110.anInt2205 >= local55 && Static117.anInt2301 < local57 && Static110.anInt2205 < local59) {
							Static146.aClass93_90 = local6;
						}
						if (local6.anInt3587 > local6.anInt3620) {
							Static137.method2287(Static110.anInt2205, local6.anInt3587, local47, local42 + local6.anInt3600, local6.anInt3620, local6, Static117.anInt2301);
						}
					}
					if (local6.anInt3656 == 0) {
						method557(arg0, local6.anInt3603, local53, local55, local57, local59, local42 - local6.anInt3653, local47 - local6.anInt3608);
						if (local6.aClass93Array1 != null) {
							method557(local6.aClass93Array1, local6.anInt3603, local53, local55, local57, local59, local42 - local6.anInt3653, local47 - local6.anInt3608);
						}
						@Pc(1507) Class1_Sub13 local1507 = (Class1_Sub13) Static157.aClass90_19.method2819((long) local6.anInt3603);
						if (local1507 != null) {
							Static221.method3400(local59, local47, local42, local57, local55, local1507.anInt1588, local53);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILclient!pa;Lclient!pa;)V")
	public static void method559(@OriginalArg(1) Class86 arg0, @OriginalArg(2) Class86 arg1) {
		Static159.aClass86_79 = arg0;
		Static142.aClass86_50 = arg1;
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!pg;I)V")
	public static void method560(@OriginalArg(0) Class1_Sub17 arg0) {
		while (arg0.anInt2656 < arg0.aByteArray40.length) {
			@Pc(5) int local5 = 0;
			@Pc(7) boolean local7 = false;
			@Pc(9) int local9 = 0;
			if (arg0.method2142() == 1) {
				local7 = true;
				local5 = arg0.method2142();
				local9 = arg0.method2142();
			}
			@Pc(28) int local28 = arg0.method2142();
			@Pc(32) int local32 = arg0.method2142();
			@Pc(39) int local39 = local28 * 64 - Static121.anInt2393;
			@Pc(49) int local49 = Static195.anInt3969 + Static12.anInt239 - local32 * 64 - 1;
			@Pc(76) int local76;
			@Pc(82) int local82;
			if (local39 >= 0 && local49 - 63 >= 0 && Static164.anInt3383 > local39 + 63 && local49 < Static12.anInt239) {
				local82 = local49 >> 6;
				local76 = local39 >> 6;
				for (@Pc(146) int local146 = 0; local146 < 64; local146++) {
					for (@Pc(150) int local150 = 0; local150 < 64; local150++) {
						if (!local7 || local5 * 8 <= local146 && local146 < local5 * 8 + 8 && local9 * 8 <= local150 && local9 * 8 + 8 > local150) {
							@Pc(192) int local192 = arg0.method2142();
							if (local192 != 0) {
								@Pc(205) int local205;
								if ((local192 & 0x1) == 1) {
									local205 = arg0.method2142();
									if (Static183.aByteArrayArrayArray11[local76][local82] == null) {
										Static183.aByteArrayArrayArray11[local76][local82] = new byte[4096];
									}
									Static183.aByteArrayArrayArray11[local76][local82][(63 - local150 << 6) + local146] = (byte) local205;
								}
								if ((local192 & 0x2) == 2) {
									local205 = arg0.method2178();
									if (Static173.aShortArrayArrayArray1[local76][local82] == null) {
										Static173.aShortArrayArrayArray1[local76][local82] = new short[4096];
									}
									Static173.aShortArrayArrayArray1[local76][local82][local146 + (63 - local150 << 6)] = (short) local205;
								}
								if ((local192 & 0x4) == 4) {
									local205 = ((arg0.method2142() & 0xFF) << 16) + ((arg0.method2142() & 0xFF) << 8) + (arg0.method2142() & 0xFF);
									if (Static109.anIntArrayArrayArray9[local76][local82] == null) {
										Static109.anIntArrayArrayArray9[local76][local82] = new int[4096];
									}
									local205--;
									@Pc(317) Class18 local317 = Static148.method2487(local205);
									if (local317.anIntArray66 != null) {
										local317 = local317.method599();
										if (local317 == null || local317.anInt815 == -1) {
											continue;
										}
									}
									Static109.anIntArrayArrayArray9[local76][local82][local146 + (63 - local150 << 6)] = local317.anInt790 + 1;
									@Pc(353) Class1_Sub2 local353 = new Class1_Sub2();
									local353.anInt50 = local39;
									local353.anInt54 = local49;
									local353.anInt60 = local317.anInt815;
									Static223.aClass75_22.method2240(local353);
								}
							}
						}
					}
				}
			} else {
				for (local76 = 0; (local7 ? 64 : 4096) > local76; local76++) {
					local82 = arg0.method2142();
					if (local82 != 0) {
						if ((local82 & 0x1) == 1) {
							arg0.anInt2656++;
						}
						if ((local82 & 0x2) == 2) {
							arg0.anInt2656 += 2;
						}
						if ((local82 & 0x4) == 4) {
							arg0.anInt2656 += 3;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(Lclient!qh;)Z")
	public static boolean method561(@OriginalArg(0) Class93 arg0) {
		if (Static131.aBoolean115) {
			if (method552(arg0) != 0) {
				return false;
			}
			if (arg0.anInt3656 == 0) {
				return false;
			}
		}
		return arg0.aBoolean165;
	}
}
