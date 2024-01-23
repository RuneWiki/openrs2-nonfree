import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static199 {

	@OriginalMember(owner = "client!of", name = "f", descriptor = "[I")
	public static int[] anIntArray442;

	@OriginalMember(owner = "client!of", name = "h", descriptor = "I")
	public static int anInt3882;

	@OriginalMember(owner = "client!of", name = "b", descriptor = "I")
	public static int anInt3877 = 0;

	@OriginalMember(owner = "client!of", name = "i", descriptor = "Z")
	public static boolean aBoolean275 = true;

	@OriginalMember(owner = "client!of", name = "k", descriptor = "F")
	public static float aFloat53 = 0.0F;

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(IB)V")
	public static void method3279(@OriginalArg(0) int arg0) {
		Static9.anInt187 = -1;
		Static9.anInt187 = -1;
		if (arg0 == 37) {
			Static228.aFloat18 = 3.0F;
		} else if (arg0 == 50) {
			Static228.aFloat18 = 4.0F;
		} else if (arg0 == 75) {
			Static228.aFloat18 = 6.0F;
		} else if (arg0 == 100) {
			Static228.aFloat18 = 8.0F;
		} else if (arg0 == 200) {
			Static228.aFloat18 = 16.0F;
		}
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "([BI[Lclient!rk;IIIZI)[I")
	public static int[] method3280(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class153[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) boolean arg5, @OriginalArg(7) int arg6) {
		@Pc(9) byte local9;
		if (arg5) {
			local9 = 1;
		} else {
			local9 = 4;
		}
		@Pc(25) int local25;
		@Pc(32) int local32;
		if (!arg5) {
			for (@Pc(18) int local18 = 0; local18 < 4; local18++) {
				for (local25 = 0; local25 < 64; local25++) {
					for (local32 = 0; local32 < 64; local32++) {
						if (arg4 + local25 > 0 && local25 + arg4 < 103 && local32 + arg6 > 0 && local32 + arg6 < 103) {
							arg2[local18].anIntArrayArray69[local25 + arg4][local32 + arg6] &= 0xFFDFFFFF;
						}
					}
				}
			}
		}
		@Pc(98) Class3_Sub26 local98 = new Class3_Sub26(arg0);
		local25 = arg4 + arg1;
		local32 = arg3 + arg6;
		@Pc(122) int local122;
		for (@Pc(108) int local108 = 0; local108 < local9; local108++) {
			for (@Pc(117) int local117 = 0; local117 < 64; local117++) {
				for (local122 = 0; local122 < 64; local122++) {
					Static77.method1205(0, false, local122 + arg6, 0, 0, arg4 + local117, local25 - -local117, local108, arg5, local98, local32 + local122);
				}
			}
		}
		@Pc(161) boolean local161 = false;
		@Pc(163) boolean local163 = false;
		@Pc(189) int local189;
		@Pc(225) int local225;
		@Pc(221) int local221;
		@Pc(223) int local223;
		@Pc(229) int local229;
		while (local98.aByteArray64.length > local98.anInt4615) {
			local122 = local98.method3915();
			if (local122 == 128) {
				Static22.anIntArray33[0] = local98.method3948();
				Static22.anIntArray33[1] = local98.method3930();
				Static22.anIntArray33[2] = local98.method3930();
				Static22.anIntArray33[3] = local98.method3930();
				local161 = true;
				Static22.anIntArray33[4] = local98.method3948();
			} else {
				if (local122 != 129) {
					local98.anInt4615--;
					break;
				}
				for (local189 = 0; local189 < 4; local189++) {
					@Pc(198) byte local198 = local98.method3920();
					if (local198 == 0) {
						local225 = arg4;
						if (arg4 < 0) {
							local225 = 0;
						} else if (arg4 >= 104) {
							local225 = 104;
						}
						local229 = arg6 + 64;
						if (local229 < 0) {
							local229 = 0;
						} else if (local229 >= 104) {
							local229 = 104;
						}
						local223 = arg6;
						if (arg6 < 0) {
							local223 = 0;
						} else if (arg6 >= 104) {
							local223 = 104;
						}
						local221 = arg4 + 64;
						if (local221 < 0) {
							local221 = 0;
						} else if (local221 >= 104) {
							local221 = 104;
						}
						while (local225 < local221) {
							while (local229 > local223) {
								Static48.aByteArrayArrayArray3[local189][local225][local223] = 0;
								local223++;
							}
							local225++;
						}
					} else if (local198 == 1) {
						for (local225 = 0; local225 < 64; local225 += 4) {
							for (local221 = 0; local221 < 64; local221 += 4) {
								@Pc(334) byte local334 = local98.method3920();
								for (local229 = local225 + arg4; local229 < local225 + arg4 + 4; local229++) {
									for (@Pc(349) int local349 = arg6 + local221; local349 < arg6 + local221 + 4; local349++) {
										if (local229 >= 0 && local229 < 104 && local349 >= 0 && local349 < 104) {
											Static48.aByteArrayArrayArray3[local189][local229][local349] = local334;
										}
									}
								}
							}
						}
					} else if (local198 == 2 && local189 > 0) {
						local221 = arg4 + 64;
						local223 = arg6;
						local225 = arg4;
						local229 = arg6 + 64;
						if (arg6 < 0) {
							local223 = 0;
						} else if (arg6 >= 104) {
							local223 = 104;
						}
						if (arg4 < 0) {
							local225 = 0;
						} else if (arg4 >= 104) {
							local225 = 104;
						}
						if (local229 < 0) {
							local229 = 0;
						} else if (local229 >= 104) {
							local229 = 104;
						}
						if (local221 < 0) {
							local221 = 0;
						} else if (local221 >= 104) {
							local221 = 104;
						}
						while (local221 > local225) {
							while (local229 > local223) {
								Static48.aByteArrayArrayArray3[local189][local225][local223] = Static48.aByteArrayArrayArray3[local189 - 1][local225][local223];
								local223++;
							}
							local225++;
						}
					}
				}
				local163 = true;
			}
		}
		@Pc(561) int local561;
		if (Static283.aBoolean393 && !arg5) {
			@Pc(535) Class74 local535 = null;
			label288: while (true) {
				label281: do {
					while (true) {
						while (local98.anInt4615 < local98.aByteArray64.length) {
							local189 = local98.method3915();
							if (local189 == 0) {
								local535 = new Class74(local98);
							} else {
								if (local189 == 1) {
									local561 = local98.method3915();
									continue label281;
								}
								if (local189 != 2) {
									throw new IllegalStateException();
								}
								if (local535 == null) {
									local535 = new Class74();
								}
								local535.method1780(local98);
							}
						}
						if (local535 == null) {
							local535 = new Class74();
						}
						for (local189 = 0; local189 < 8; local189++) {
							for (local561 = 0; local561 < 8; local561++) {
								local225 = local189 + (arg4 >> 3);
								local221 = (arg6 >> 3) + local561;
								if (local225 >= 0 && local225 < 13 && local221 >= 0 && local221 < 13) {
									Static43.aClass74ArrayArray1[local225][local221] = local535;
								}
							}
						}
						break label288;
					}
				} while (local561 <= 0);
				for (local225 = 0; local225 < local561; local225++) {
					@Pc(578) Class90 local578 = new Class90(local98);
					if (local578.anInt2637 == 31) {
						@Pc(593) Class89 local593 = Static307.method4925(local98.method3948());
						local578.method2335(local593.anInt2617, local593.anInt2622, local593.anInt2625, local593.anInt2618);
					}
					local578.anInt2639 += arg6 << 7;
					local578.anInt2630 += arg4 << 7;
					local223 = local578.anInt2630 >> 7;
					local229 = local578.anInt2639 >> 7;
					if (local223 >= 0 && local229 >= 0 && local223 < 104 && local229 < 104) {
						local578.aBoolean195 = (Static41.aByteArrayArrayArray2[1][local223][local229] & 0x2) != 0;
						local578.anInt2632 = Static256.anIntArrayArrayArray14[local578.anInt2638][local223][local229] - local578.anInt2632;
						Static142.method2403(local578);
					}
				}
			}
		}
		if (!local163) {
			for (local122 = 0; local122 < 4; local122++) {
				for (local189 = 0; local189 < 16; local189++) {
					for (local561 = 0; local561 < 16; local561++) {
						local225 = (arg4 >> 2) + local189;
						local221 = (arg6 >> 2) + local561;
						if (local225 >= 0 && local225 < 26 && local221 >= 0 && local221 < 26) {
							Static48.aByteArrayArrayArray3[local122][local225][local221] = 0;
						}
					}
				}
			}
		}
		return local161 ? Static22.anIntArray33 : null;
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(IIIII)Z")
	public static boolean method3281(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(9) int local9 = arg3 * Static279.anInt5606 + arg0 * Static27.anInt485 >> 16;
		@Pc(19) int local19 = arg3 * Static27.anInt485 - arg0 * Static279.anInt5606 >> 16;
		@Pc(29) int local29 = arg1 * Static296.anInt5883 + local19 * Static259.anInt5353 >> 16;
		@Pc(39) int local39 = arg1 * Static259.anInt5353 - local19 * Static296.anInt5883 >> 16;
		if (local29 < 1) {
			local29 = 1;
		}
		@Pc(50) int local50 = (local9 << 9) / local29;
		@Pc(56) int local56 = (local39 << 9) / local29;
		@Pc(66) int local66 = arg2 * Static296.anInt5883 + local19 * Static259.anInt5353 >> 16;
		@Pc(76) int local76 = arg2 * Static259.anInt5353 - local19 * Static296.anInt5883 >> 16;
		if (local66 < 1) {
			local66 = 1;
		}
		@Pc(87) int local87 = (local9 << 9) / local66;
		@Pc(93) int local93 = (local76 << 9) / local66;
		if (local29 < 50 && local66 < 50) {
			return false;
		} else if (local29 > arg4 && local66 > arg4) {
			return false;
		} else if (local50 < Static152.anInt2870 && local87 < Static152.anInt2870) {
			return false;
		} else if (local50 > Static136.anInt2620 && local87 > Static136.anInt2620) {
			return false;
		} else if (local56 < Static183.anInt3645 && local93 < Static183.anInt3645) {
			return false;
		} else {
			return local56 <= Static181.anInt3567 || local93 <= Static181.anInt3567;
		}
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(I)V")
	public static void method3282() {
		for (@Pc(3) int local3 = 0; local3 < 100; local3++) {
			Static292.aBooleanArray129[local3] = true;
		}
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(ILjava/lang/String;)V")
	public static void method3284(@OriginalArg(1) String arg0) {
		Static291.method4774("", "", arg0, 0, 0);
	}

	@OriginalMember(owner = "client!of", name = "c", descriptor = "(I)V")
	public static void method3285() {
		if (Static241.anInt4885 == 0 || Static241.anInt4885 == 5) {
			return;
		}
		try {
			if (++Static2.anInt23 > 2000) {
				if (Static150.aClass139_3 != null) {
					Static150.aClass139_3.method3559();
					Static150.aClass139_3 = null;
				}
				if (Static113.anInt2095 >= 1) {
					Static241.anInt4885 = 0;
					Static98.anInt1803 = -5;
					return;
				}
				if (Static51.anInt995 == Static203.anInt3974) {
					Static51.anInt995 = Static152.anInt2881;
				} else {
					Static51.anInt995 = Static203.anInt3974;
				}
				Static241.anInt4885 = 1;
				Static2.anInt23 = 0;
				Static113.anInt2095++;
			}
			if (Static241.anInt4885 == 1) {
				Static203.aClass178_2 = Static274.aClass176_4.method4521(Static307.aString230, Static51.anInt995);
				Static241.anInt4885 = 2;
			}
			if (Static241.anInt4885 == 2) {
				if (Static203.aClass178_2.anInt5649 == 2) {
					throw new IOException();
				}
				if (Static203.aClass178_2.anInt5649 != 1) {
					return;
				}
				Static150.aClass139_3 = new Class139((Socket) Static203.aClass178_2.anObject6, Static274.aClass176_4);
				Static203.aClass178_2 = null;
				@Pc(113) long local113 = Static299.aLong233 = Static42.method615(Static132.aString93);
				Static215.aClass3_Sub26_Sub1_2.anInt4615 = 0;
				Static215.aClass3_Sub26_Sub1_2.method3907(14);
				@Pc(127) int local127 = (int) (local113 >> 16 & 0x1FL);
				Static215.aClass3_Sub26_Sub1_2.method3907(local127);
				Static150.aClass139_3.method3556(Static215.aClass3_Sub26_Sub1_2.aByteArray64, 2);
				if (Static32.aClass105_1 != null) {
					Static32.aClass105_1.method2774();
				}
				if (Static187.aClass105_2 != null) {
					Static187.aClass105_2.method2774();
				}
				@Pc(159) int local159 = Static150.aClass139_3.method3553();
				if (Static32.aClass105_1 != null) {
					Static32.aClass105_1.method2774();
				}
				if (Static187.aClass105_2 != null) {
					Static187.aClass105_2.method2774();
				}
				if (local159 != 0) {
					Static98.anInt1803 = local159;
					Static241.anInt4885 = 0;
					Static150.aClass139_3.method3559();
					Static150.aClass139_3 = null;
					return;
				}
				Static241.anInt4885 = 3;
			}
			if (Static241.anInt4885 == 3) {
				if (Static150.aClass139_3.method3554() < 8) {
					return;
				}
				Static150.aClass139_3.method3558(8, Static249.aClass3_Sub26_Sub1_3.aByteArray64, 0);
				Static249.aClass3_Sub26_Sub1_3.anInt4615 = 0;
				Static222.aLong183 = Static249.aClass3_Sub26_Sub1_3.method3900();
				Static215.aClass3_Sub26_Sub1_2.anInt4615 = 0;
				@Pc(220) int[] local220 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Static222.aLong183 >> 32), (int) Static222.aLong183 };
				Static215.aClass3_Sub26_Sub1_2.method3907(10);
				Static215.aClass3_Sub26_Sub1_2.method3944(local220[0]);
				Static215.aClass3_Sub26_Sub1_2.method3944(local220[1]);
				Static215.aClass3_Sub26_Sub1_2.method3944(local220[2]);
				Static215.aClass3_Sub26_Sub1_2.method3944(local220[3]);
				Static215.aClass3_Sub26_Sub1_2.method3913(Static42.method615(Static132.aString93));
				Static215.aClass3_Sub26_Sub1_2.method3914(Static44.aString32);
				Static215.aClass3_Sub26_Sub1_2.method3902(Static47.aBigInteger3, Static58.aBigInteger2);
				Static148.aClass3_Sub26_Sub1_1.anInt4615 = 0;
				if (Static10.anInt190 == 40) {
					Static148.aClass3_Sub26_Sub1_1.method3907(18);
				} else {
					Static148.aClass3_Sub26_Sub1_1.method3907(16);
				}
				Static148.aClass3_Sub26_Sub1_1.method3938(Static215.aClass3_Sub26_Sub1_2.anInt4615 + Static147.method2494(Static62.aString50) + 163);
				Static148.aClass3_Sub26_Sub1_1.method3944(554);
				Static148.aClass3_Sub26_Sub1_1.method3907(Static120.anInt2263);
				Static148.aClass3_Sub26_Sub1_1.method3907(Static206.aBoolean289 ? 1 : 0);
				Static148.aClass3_Sub26_Sub1_1.method3907(1);
				Static148.aClass3_Sub26_Sub1_1.method3907(Static254.method4299());
				Static148.aClass3_Sub26_Sub1_1.method3938(Static253.anInt5224);
				Static148.aClass3_Sub26_Sub1_1.method3938(Static123.anInt2333);
				Static148.aClass3_Sub26_Sub1_1.method3907(Static268.anInt5481);
				Static26.method421(Static148.aClass3_Sub26_Sub1_1);
				Static148.aClass3_Sub26_Sub1_1.method3914(Static62.aString50);
				Static148.aClass3_Sub26_Sub1_1.method3944(Static60.anInt723);
				Static148.aClass3_Sub26_Sub1_1.method3944(Static31.method472());
				Static239.aBoolean340 = true;
				Static148.aClass3_Sub26_Sub1_1.method3938(Static263.anInt5410);
				Static148.aClass3_Sub26_Sub1_1.method3944(Static257.aClass155_107.method4139());
				Static148.aClass3_Sub26_Sub1_1.method3944(Static129.aClass155_54.method4139());
				Static148.aClass3_Sub26_Sub1_1.method3944(Static278.aClass155_101.method4139());
				Static148.aClass3_Sub26_Sub1_1.method3944(Static56.aClass155_29.method4139());
				Static148.aClass3_Sub26_Sub1_1.method3944(Static220.aClass155_105.method4139());
				Static148.aClass3_Sub26_Sub1_1.method3944(Static62.aClass155_30.method4139());
				Static148.aClass3_Sub26_Sub1_1.method3944(Static257.aClass155_106.method4139());
				Static148.aClass3_Sub26_Sub1_1.method3944(Static49.aClass155_27.method4139());
				Static148.aClass3_Sub26_Sub1_1.method3944(Static65.aClass155_31.method4139());
				Static148.aClass3_Sub26_Sub1_1.method3944(Static181.aClass155_80.method4139());
				Static148.aClass3_Sub26_Sub1_1.method3944(Static2.aClass155_1.method4139());
				Static148.aClass3_Sub26_Sub1_1.method3944(Static161.aClass155_65.method4139());
				Static148.aClass3_Sub26_Sub1_1.method3944(Static195.aClass155_82.method4139());
				Static148.aClass3_Sub26_Sub1_1.method3944(Static268.aClass155_113.method4139());
				Static148.aClass3_Sub26_Sub1_1.method3944(Static222.aClass155_92.method4139());
				Static148.aClass3_Sub26_Sub1_1.method3944(Static9.aClass155_4.method4139());
				Static148.aClass3_Sub26_Sub1_1.method3944(Static224.aClass155_120.method4139());
				Static148.aClass3_Sub26_Sub1_1.method3944(Static288.aClass155_118.method4139());
				Static148.aClass3_Sub26_Sub1_1.method3944(Static48.aClass155_26.method4139());
				Static148.aClass3_Sub26_Sub1_1.method3944(Static152.aClass155_63.method4139());
				Static148.aClass3_Sub26_Sub1_1.method3944(Static178.aClass155_71.method4139());
				Static148.aClass3_Sub26_Sub1_1.method3944(Static107.aClass155_50.method4139());
				Static148.aClass3_Sub26_Sub1_1.method3944(Static198.aClass155_84.method4139());
				Static148.aClass3_Sub26_Sub1_1.method3944(Static81.aClass155_38.method4139());
				Static148.aClass3_Sub26_Sub1_1.method3944(Static102.aClass155_49.method4139());
				Static148.aClass3_Sub26_Sub1_1.method3944(Static65.aClass155_32.method4139());
				Static148.aClass3_Sub26_Sub1_1.method3944(Static196.aClass155_83.method4139());
				Static148.aClass3_Sub26_Sub1_1.method3944(Static94.aClass155_41.method4139());
				Static148.aClass3_Sub26_Sub1_1.method3944(Static288.aClass155_117.method4139());
				Static148.aClass3_Sub26_Sub1_1.method3945(Static215.aClass3_Sub26_Sub1_2.anInt4615, Static215.aClass3_Sub26_Sub1_2.aByteArray64);
				Static150.aClass139_3.method3556(Static148.aClass3_Sub26_Sub1_1.aByteArray64, Static148.aClass3_Sub26_Sub1_1.anInt4615);
				Static215.aClass3_Sub26_Sub1_2.method3950(local220);
				for (@Pc(593) int local593 = 0; local593 < 4; local593++) {
					local220[local593] += 50;
				}
				Static249.aClass3_Sub26_Sub1_3.method3950(local220);
				Static241.anInt4885 = 4;
			}
			if (Static241.anInt4885 == 4) {
				if (Static150.aClass139_3.method3554() < 1) {
					return;
				}
				@Pc(633) int local633 = Static150.aClass139_3.method3553();
				if (local633 == 21) {
					Static241.anInt4885 = 7;
				} else if (local633 == 29) {
					Static241.anInt4885 = 10;
				} else if (local633 == 1) {
					Static241.anInt4885 = 5;
					Static98.anInt1803 = local633;
					return;
				} else if (local633 == 2) {
					Static241.anInt4885 = 8;
				} else if (local633 == 15) {
					Static241.anInt4885 = 0;
					Static98.anInt1803 = local633;
					return;
				} else if (local633 == 23 && Static113.anInt2095 < 1) {
					Static113.anInt2095++;
					Static2.anInt23 = 0;
					Static241.anInt4885 = 1;
					Static150.aClass139_3.method3559();
					Static150.aClass139_3 = null;
					return;
				} else {
					Static98.anInt1803 = local633;
					Static241.anInt4885 = 0;
					Static150.aClass139_3.method3559();
					Static150.aClass139_3 = null;
					return;
				}
			}
			if (Static241.anInt4885 == 6) {
				Static215.aClass3_Sub26_Sub1_2.anInt4615 = 0;
				Static215.aClass3_Sub26_Sub1_2.method3958(17);
				Static150.aClass139_3.method3556(Static215.aClass3_Sub26_Sub1_2.aByteArray64, Static215.aClass3_Sub26_Sub1_2.anInt4615);
				Static241.anInt4885 = 4;
				return;
			}
			if (Static241.anInt4885 == 7) {
				if (Static150.aClass139_3.method3554() >= 1) {
					Static270.anInt5515 = Static150.aClass139_3.method3553() * 60 + 180;
					Static241.anInt4885 = 0;
					Static98.anInt1803 = 21;
					Static150.aClass139_3.method3559();
					Static150.aClass139_3 = null;
					return;
				}
				return;
			}
			if (Static241.anInt4885 == 10) {
				if (Static150.aClass139_3.method3554() < 1) {
					return;
				}
				Static267.anInt5436 = Static150.aClass139_3.method3553();
				Static241.anInt4885 = 0;
				Static98.anInt1803 = 29;
				Static150.aClass139_3.method3559();
				Static150.aClass139_3 = null;
				return;
			}
			if (Static241.anInt4885 == 8) {
				if (Static150.aClass139_3.method3554() < 14) {
					return;
				}
				Static150.aClass139_3.method3558(14, Static249.aClass3_Sub26_Sub1_3.aByteArray64, 0);
				Static249.aClass3_Sub26_Sub1_3.anInt4615 = 0;
				Static296.anInt5879 = Static249.aClass3_Sub26_Sub1_3.method3915();
				Static104.anInt1933 = Static249.aClass3_Sub26_Sub1_3.method3915();
				Static264.aBoolean376 = Static249.aClass3_Sub26_Sub1_3.method3915() == 1;
				Static78.aBoolean128 = Static249.aClass3_Sub26_Sub1_3.method3915() == 1;
				Static57.aBoolean84 = Static249.aClass3_Sub26_Sub1_3.method3915() == 1;
				Static191.aBoolean264 = Static249.aClass3_Sub26_Sub1_3.method3915() == 1;
				Static57.aBoolean83 = Static249.aClass3_Sub26_Sub1_3.method3915() == 1;
				Static273.anInt5556 = Static249.aClass3_Sub26_Sub1_3.method3948();
				Static179.aBoolean238 = Static249.aClass3_Sub26_Sub1_3.method3915() == 1;
				Static94.aBoolean140 = Static249.aClass3_Sub26_Sub1_3.method3915() == 1;
				Static147.method2496(Static94.aBoolean140);
				Static309.method4969(Static94.aBoolean140);
				Static3.method46(Static94.aBoolean140);
				if (!Static206.aBoolean289) {
					if (Static264.aBoolean376 && !Static57.aBoolean84 || Static179.aBoolean238) {
						try {
							Static325.method4166(Static274.aClass176_4.anApplet1, "zap");
						} catch (@Pc(918) Throwable local918) {
						}
					} else {
						try {
							Static325.method4166(Static274.aClass176_4.anApplet1, "unzap");
						} catch (@Pc(928) Throwable local928) {
						}
					}
				}
				try {
					Static325.method4166(Static274.aClass176_4.anApplet1, "loggedin");
				} catch (@Pc(936) Throwable local936) {
				}
				Static255.anInt5252 = Static249.aClass3_Sub26_Sub1_3.method3955();
				Static287.anInt5742 = Static249.aClass3_Sub26_Sub1_3.method3948();
				Static241.anInt4885 = 9;
			}
			if (Static241.anInt4885 == 9) {
				if (Static150.aClass139_3.method3554() >= Static287.anInt5742) {
					Static249.aClass3_Sub26_Sub1_3.anInt4615 = 0;
					Static150.aClass139_3.method3558(Static287.anInt5742, Static249.aClass3_Sub26_Sub1_3.aByteArray64, 0);
					Static98.anInt1803 = 2;
					Static241.anInt4885 = 0;
					Static114.method5023();
					Static3.anInt70 = -1;
					Static94.method1390(false);
					Static255.anInt5252 = -1;
					return;
				}
				return;
			}
		} catch (@Pc(982) IOException local982) {
			if (Static150.aClass139_3 != null) {
				Static150.aClass139_3.method3559();
				Static150.aClass139_3 = null;
			}
			if (Static113.anInt2095 < 1) {
				Static2.anInt23 = 0;
				if (Static51.anInt995 == Static203.anInt3974) {
					Static51.anInt995 = Static152.anInt2881;
				} else {
					Static51.anInt995 = Static203.anInt3974;
				}
				Static241.anInt4885 = 1;
				Static113.anInt2095++;
			} else {
				Static241.anInt4885 = 0;
				Static98.anInt1803 = -4;
			}
		}
	}
}
