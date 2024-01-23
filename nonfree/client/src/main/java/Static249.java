import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static249 {

	@OriginalMember(owner = "client!sd", name = "Hc", descriptor = "[[B")
	public static byte[][] aByteArrayArray111;

	@OriginalMember(owner = "client!sd", name = "Tc", descriptor = "[[I")
	public static int[][] anIntArrayArray70;

	@OriginalMember(owner = "client!sd", name = "Bc", descriptor = "Lclient!l;")
	public static Class98 aClass98_40 = new Class98(64);

	@OriginalMember(owner = "client!sd", name = "Nc", descriptor = "Lclient!rc;")
	public static Class3_Sub26_Sub1 aClass3_Sub26_Sub1_3 = new Class3_Sub26_Sub1(5000);

	@OriginalMember(owner = "client!sd", name = "Sc", descriptor = "Ljava/lang/String;")
	public static String aString177 = "glow3:";

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(Lclient!rg;B)Lclient!rg;")
	public static Class151 method4206(@OriginalArg(0) Class151 arg0) {
		if (arg0.anInt4727 != -1) {
			return Static243.method4115(arg0.anInt4727);
		}
		@Pc(26) int local26 = arg0.anInt4800 >>> 16;
		@Pc(31) Class25 local31 = new Class25(Static205.aClass30_23);
		for (@Pc(36) Class3_Sub3 local36 = (Class3_Sub3) local31.method538(); local36 != null; local36 = (Class3_Sub3) local31.method536()) {
			if (local26 == local36.anInt183) {
				return Static243.method4115((int) local36.aLong243);
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(IIIIII)V")
	public static void method4207(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(11) int local11 = Static167.method2786(arg4, Static111.anInt2039, Static245.anInt6027);
		@Pc(23) int local23 = Static167.method2786(arg1, Static111.anInt2039, Static245.anInt6027);
		@Pc(31) int local31 = Static167.method2786(arg3, Static204.anInt4020, Static175.anInt3267);
		@Pc(37) int local37 = Static167.method2786(arg2, Static204.anInt4020, Static175.anInt3267);
		for (@Pc(39) int local39 = local11; local39 <= local23; local39++) {
			Static235.method3988(arg0, Static129.anIntArrayArray40[local39], local37, local31);
		}
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(JI)Ljava/lang/String;")
	public static String method4208(@OriginalArg(0) long arg0) {
		if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
			return null;
		} else if (arg0 % 37L == 0L) {
			return null;
		} else {
			@Pc(28) int local28 = 0;
			@Pc(30) long local30 = arg0;
			while (local30 != 0L) {
				local30 /= 37L;
				local28++;
			}
			@Pc(46) StringBuffer local46 = new StringBuffer(local28);
			while (arg0 != 0L) {
				@Pc(54) long local54 = arg0;
				arg0 /= 37L;
				@Pc(68) char local68 = Static86.aCharArray11[(int) (local54 - arg0 * 37L)];
				if (local68 == '_') {
					local68 = ' ';
					@Pc(78) int local78 = local46.length() - 1;
					local46.setCharAt(local78, Character.toUpperCase(local46.charAt(local78)));
				}
				local46.append(local68);
			}
			local46.reverse();
			local46.setCharAt(0, Character.toUpperCase(local46.charAt(0)));
			return local46.toString();
		}
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "([[F[[F[Lclient!jn;[[FI[[I[[BI[[B[[BI[[B)V")
	public static void method4210(@OriginalArg(0) float[][] arg0, @OriginalArg(1) float[][] arg1, @OriginalArg(2) Class90[] arg2, @OriginalArg(3) float[][] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[][] arg5, @OriginalArg(6) byte[][] arg6, @OriginalArg(8) byte[][] arg7, @OriginalArg(9) byte[][] arg8, @OriginalArg(10) int arg9, @OriginalArg(11) byte[][] arg10) {
		for (@Pc(7) int local7 = 0; local7 < arg9; local7++) {
			@Pc(18) Class90 local18 = arg2[local7];
			if (local18.anInt2638 == arg4) {
				@Pc(28) int local28 = 0;
				@Pc(32) Class142 local32 = new Class142();
				@Pc(40) int local40 = (local18.anInt2630 >> 7) - local18.anInt2633;
				@Pc(49) int local49 = (local18.anInt2639 >> 7) - local18.anInt2633;
				if (local49 < 0) {
					local28 = -local49;
					local49 = 0;
				}
				@Pc(68) int local68 = local18.anInt2633 + (local18.anInt2639 >> 7);
				if (local68 > 103) {
					local68 = 103;
				}
				@Pc(75) int local75;
				@Pc(87) short local87;
				@Pc(93) int local93;
				@Pc(101) int local101;
				@Pc(114) int local114;
				@Pc(133) int local133;
				@Pc(375) boolean local375;
				@Pc(348) int local348;
				for (local75 = local49; local75 <= local68; local75++) {
					local87 = local18.aShortArray69[local28];
					local93 = (local87 >> 8) + local40;
					local101 = (local87 & 0xFF) + local93 - 1;
					if (local101 > 103) {
						local101 = 103;
					}
					if (local93 < 0) {
						local93 = 0;
					}
					for (local114 = local93; local114 <= local101; local114++) {
						@Pc(125) int local125 = arg8[local114][local75] & 0xFF;
						local133 = arg7[local114][local75] & 0xFF;
						@Pc(135) boolean local135 = false;
						@Pc(153) Class183 local153;
						@Pc(176) int[] local176;
						@Pc(246) int[] local246;
						if (local125 == 0) {
							if (local133 == 0) {
								continue;
							}
							local153 = Static278.method4188(local133 - 1);
							if (local153.anInt5777 == -1) {
								continue;
							}
							if (arg10[local114][local75] != 0) {
								local176 = Static29.anIntArrayArray5[arg10[local114][local75]];
								local32.anInt4300 += ((local176.length >> 1) - 2) * 3;
								local32.anInt4299 += local176.length >> 1;
								continue;
							}
						} else if (local133 != 0) {
							local153 = Static278.method4188(local133 - 1);
							@Pc(226) byte local226;
							if (local153.anInt5777 == -1) {
								local226 = arg10[local114][local75];
								if (local226 != 0) {
									local246 = Static282.anIntArrayArray75[local226];
									local32.anInt4300 += (local246.length >> 1) * 3 - 6;
									local32.anInt4299 += local246.length >> 1;
								}
								continue;
							}
							local226 = arg10[local114][local75];
							if (local226 != 0) {
								local135 = true;
							}
						}
						@Pc(275) Class85 local275 = Static108.method1768(arg4, local114, local75);
						if (local275 != null) {
							@Pc(287) int local287 = (int) (local275.aLong107 >> 14) & 0x3F;
							if (local287 == 9) {
								local246 = null;
								@Pc(300) int local300 = (int) (local275.aLong107 >> 20) & 0x3;
								@Pc(317) boolean local317;
								@Pc(335) short local335;
								@Pc(341) int local341;
								if ((local300 & 0x1) == 0) {
									local317 = local93 <= local114 - 1;
									if (!local317 && local75 + 1 <= local68) {
										local335 = local18.aShortArray69[local28 + 1];
										local341 = (local335 >> 8) + local40;
										local348 = local341 + (local335 & 0xFF);
										local317 = local114 > local341 && local348 > local114;
									}
									local375 = local114 + 1 <= local101;
									if (!local375 && local75 - 1 >= local49) {
										local335 = local18.aShortArray69[local28 - 1];
										local341 = (local335 >> 8) + local40;
										local348 = (local335 & 0xFF) + local341;
										local375 = local114 > local341 && local114 < local348;
									}
									if (local317 && local375) {
										local246 = Static29.anIntArrayArray5[0];
									} else if (local317) {
										local246 = Static29.anIntArrayArray5[1];
									} else if (local375) {
										local246 = Static29.anIntArrayArray5[1];
									}
								} else {
									local317 = local114 - 1 >= local93;
									local375 = local101 >= local114 + 1;
									if (!local317 && local75 - 1 >= local49) {
										local335 = local18.aShortArray69[local28 - 1];
										local341 = (local335 >> 8) + local40;
										local348 = (local335 & 0xFF) + local341;
										local317 = local114 > local341 && local114 < local348;
									}
									if (!local375 && local75 + 1 <= local68) {
										local335 = local18.aShortArray69[local28 + 1];
										local341 = (local335 >> 8) + local40;
										local348 = (local335 & 0xFF) + local341;
										local375 = local114 > local341 && local348 > local114;
									}
									if (local317 && local375) {
										local246 = Static29.anIntArrayArray5[0];
									} else if (local317) {
										local246 = Static29.anIntArrayArray5[1];
									} else if (local375) {
										local246 = Static29.anIntArrayArray5[1];
									}
								}
								if (local246 != null) {
									local32.anInt4300 += ((local246.length >> 1) - 2) * 3;
									local32.anInt4299 += local246.length >> 1;
								}
								continue;
							}
						}
						if (local135) {
							local176 = Static29.anIntArrayArray5[arg10[local114][local75]];
							local246 = Static282.anIntArrayArray75[arg10[local114][local75]];
							local32.anInt4300 += (local176.length >> 1) * 3 - 6;
							local32.anInt4300 += ((local246.length >> 1) - 2) * 3;
							local32.anInt4299 += local176.length >> 1;
							local32.anInt4299 += local246.length >> 1;
						} else {
							local176 = Static29.anIntArrayArray5[0];
							local32.anInt4300 += (local176.length >> 1) * 3 - 6;
							local32.anInt4299 += local176.length >> 1;
						}
					}
					local28++;
				}
				local32.method3607();
				local28 = 0;
				if ((local18.anInt2639 >> 7) - local18.anInt2633 < 0) {
					local28 = local18.anInt2633 - (local18.anInt2639 >> 7);
				}
				for (local75 = local49; local75 <= local68; local75++) {
					local87 = local18.aShortArray69[local28];
					local93 = (local87 >> 8) + local40;
					local101 = (local87 & 0xFF) + local93 - 1;
					if (local101 > 103) {
						local101 = 103;
					}
					if (local93 < 0) {
						local93 = 0;
					}
					for (local114 = local93; local114 <= local101; local114++) {
						local133 = arg8[local114][local75] & 0xFF;
						@Pc(797) int local797 = arg7[local114][local75] & 0xFF;
						@Pc(799) boolean local799 = false;
						@Pc(805) byte local805 = arg6[local114][local75];
						@Pc(821) Class183 local821;
						if (local133 == 0) {
							if (local797 == 0) {
								continue;
							}
							local821 = Static278.method4188(local797 - 1);
							if (local821.anInt5777 == -1) {
								continue;
							}
							if (arg10[local114][local75] != 0) {
								Static304.method4912(local18, local32, arg3, Static29.anIntArrayArray5[arg10[local114][local75]], arg5, arg1, arg6[local114][local75], local75, local114, arg0);
								continue;
							}
						} else if (local797 != 0) {
							local821 = Static278.method4188(local797 - 1);
							if (local821.anInt5777 == -1) {
								Static304.method4912(local18, local32, arg3, Static282.anIntArrayArray75[arg10[local114][local75]], arg5, arg1, arg6[local114][local75], local75, local114, arg0);
								continue;
							}
							@Pc(831) byte local831 = arg10[local114][local75];
							if (local831 != 0) {
								local799 = true;
							}
						}
						@Pc(916) Class85 local916 = Static108.method1768(arg4, local114, local75);
						if (local916 != null) {
							@Pc(926) int local926 = (int) (local916.aLong107 >> 14) & 0x3F;
							if (local926 == 9) {
								@Pc(933) int[] local933 = null;
								@Pc(941) int local941 = (int) (local916.aLong107 >> 20) & 0x3;
								@Pc(998) int local998;
								@Pc(970) boolean local970;
								@Pc(985) short local985;
								if ((local941 & 0x1) == 0) {
									local375 = local114 - 1 >= local93;
									if (!local375 && local68 >= local75 + 1) {
										local985 = local18.aShortArray69[local28 + 1];
										local348 = (local985 >> 8) + local40;
										local998 = (local985 & 0xFF) + local348;
										local375 = local114 > local348 && local114 < local998;
									}
									local970 = local101 >= local114 + 1;
									if (!local970 && local75 - 1 >= local49) {
										local985 = local18.aShortArray69[local28 - 1];
										local348 = (local985 >> 8) + local40;
										local998 = (local985 & 0xFF) + local348;
										local970 = local348 < local114 && local114 < local998;
									}
									if (local375 && local970) {
										local933 = Static29.anIntArrayArray5[0];
									} else if (local375) {
										local933 = Static29.anIntArrayArray5[1];
										local805 = 1;
									} else if (local970) {
										local933 = Static29.anIntArrayArray5[1];
										local805 = 3;
									}
								} else {
									local375 = local114 - 1 >= local93;
									local970 = local101 >= local114 + 1;
									if (!local375 && local49 <= local75 - 1) {
										local985 = local18.aShortArray69[local28 - 1];
										local348 = local40 + (local985 >> 8);
										local998 = (local985 & 0xFF) + local348;
										local375 = local114 > local348 && local114 < local998;
									}
									if (!local970 && local68 >= local75 + 1) {
										local985 = local18.aShortArray69[local28 + 1];
										local348 = local40 + (local985 >> 8);
										local998 = local348 + (local985 & 0xFF);
										local970 = local114 > local348 && local114 < local998;
									}
									if (local375 && local970) {
										local933 = Static29.anIntArrayArray5[0];
									} else if (local375) {
										local805 = 0;
										local933 = Static29.anIntArrayArray5[1];
									} else if (local970) {
										local933 = Static29.anIntArrayArray5[1];
										local805 = 2;
									}
								}
								if (local933 != null) {
									Static304.method4912(local18, local32, arg3, local933, arg5, arg1, local805, local75, local114, arg0);
								}
								continue;
							}
						}
						if (local799) {
							Static304.method4912(local18, local32, arg3, Static282.anIntArrayArray75[arg10[local114][local75]], arg5, arg1, arg6[local114][local75], local75, local114, arg0);
							Static304.method4912(local18, local32, arg3, Static29.anIntArrayArray5[arg10[local114][local75]], arg5, arg1, arg6[local114][local75], local75, local114, arg0);
						} else {
							Static304.method4912(local18, local32, arg3, Static29.anIntArrayArray5[0], arg5, arg1, local805, local75, local114, arg0);
						}
					}
					local28++;
				}
				if (local32.anInt4301 > 0 && local32.anInt4298 > 0) {
					local32.method3608();
					local18.aClass142_1 = local32;
				}
			}
		}
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lclient!bn;")
	public static RuntimeException_Sub1 method4211(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		@Pc(12) RuntimeException_Sub1 local12;
		if (arg0 instanceof RuntimeException_Sub1) {
			local12 = (RuntimeException_Sub1) arg0;
			local12.aString16 = local12.aString16 + ' ' + arg1;
		} else {
			local12 = new RuntimeException_Sub1(arg0, arg1);
		}
		return local12;
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(BI)Lclient!ce;")
	public static Class3_Sub4_Sub3 method4213(@OriginalArg(1) int arg0) {
		@Pc(10) Class3_Sub4_Sub3 local10 = (Class3_Sub4_Sub3) Static235.aClass33_12.method828((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(21) byte[] local21 = Static219.aClass155_90.method4121(26, arg0);
		local10 = new Class3_Sub4_Sub3();
		if (local21 != null) {
			local10.method530(new Class3_Sub26(local21));
		}
		Static235.aClass33_12.method827(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!sd", name = "c", descriptor = "(B)V")
	public static void method4214() {
		@Pc(7) int local7 = Static173.anInt3249;
		@Pc(9) int local9 = Static175.anInt3271;
		@Pc(11) int local11 = Static300.anInt5922;
		@Pc(17) int local17 = Static205.anInt4054 - 3;
		if (Static244.aClass3_Sub4_Sub12_6 == null || Static286.aClass3_Sub4_Sub12_9 == null) {
			if (Static65.aClass155_31.method4133(Static17.anInt328) && Static65.aClass155_31.method4133(Static145.anInt2773)) {
				Static244.aClass3_Sub4_Sub12_6 = Static181.method3044(Static17.anInt328, Static65.aClass155_31);
				Static286.aClass3_Sub4_Sub12_9 = Static181.method3044(Static145.anInt2773, Static65.aClass155_31);
				if (Static283.aBoolean393) {
					if (Static244.aClass3_Sub4_Sub12_6 instanceof Class3_Sub4_Sub12_Sub2_Sub1) {
						Static244.aClass3_Sub4_Sub12_6 = new Class3_Sub4_Sub12_Sub1_Sub1((Class3_Sub4_Sub12_Sub2) Static244.aClass3_Sub4_Sub12_6);
					} else {
						Static244.aClass3_Sub4_Sub12_6 = new Class3_Sub4_Sub12_Sub1((Class3_Sub4_Sub12_Sub2) Static244.aClass3_Sub4_Sub12_6);
					}
					if (Static286.aClass3_Sub4_Sub12_9 instanceof Class3_Sub4_Sub12_Sub2_Sub1) {
						Static286.aClass3_Sub4_Sub12_9 = new Class3_Sub4_Sub12_Sub1_Sub1((Class3_Sub4_Sub12_Sub2) Static286.aClass3_Sub4_Sub12_9);
					} else {
						Static286.aClass3_Sub4_Sub12_9 = new Class3_Sub4_Sub12_Sub1((Class3_Sub4_Sub12_Sub2) Static286.aClass3_Sub4_Sub12_9);
					}
				}
			} else if (Static283.aBoolean393) {
				Static234.method3974(local7, local11, local9, 20, Static141.anInt2720, 256 - Static214.anInt4182);
			} else {
				Static143.method2452(local7, local11, local9, 20, Static141.anInt2720, 256 - Static214.anInt4182);
			}
		}
		@Pc(124) int local124;
		if (Static244.aClass3_Sub4_Sub12_6 != null && Static286.aClass3_Sub4_Sub12_9 != null) {
			@Pc(122) int local122 = (local9 - Static286.aClass3_Sub4_Sub12_9.anInt5728 * 2) / Static244.aClass3_Sub4_Sub12_6.anInt5728;
			for (local124 = 0; local124 < local122; local124++) {
				Static244.aClass3_Sub4_Sub12_6.method4697(local7 + Static286.aClass3_Sub4_Sub12_9.anInt5728 + local124 * Static244.aClass3_Sub4_Sub12_6.anInt5728, local11);
			}
			Static286.aClass3_Sub4_Sub12_9.method4697(local7, local11);
			Static286.aClass3_Sub4_Sub12_9.method4702(local9 + local7 - Static286.aClass3_Sub4_Sub12_9.anInt5728, local11);
		}
		Static224.aClass3_Sub4_Sub2_14.method3685(Static267.aString196, local7 + 3, local11 + 14, Static197.anInt5232, -1);
		if (Static283.aBoolean393) {
			Static234.method3974(local7, local11 + 20, local9, local17 - 20, Static141.anInt2720, 256 - Static214.anInt4182);
		} else {
			Static143.method2452(local7, local11 + 20, local9, local17 - 20, Static141.anInt2720, 256 - Static214.anInt4182);
		}
		local124 = Static167.anInt3153;
		@Pc(212) int local212 = Static153.anInt2892;
		@Pc(214) int local214;
		@Pc(236) int local236;
		for (local214 = 0; local214 < Static152.anInt2876; local214++) {
			local236 = (Static152.anInt2876 - local214 - 1) * 15 + local11 + 13 + 20;
			if (local124 > local7 && local9 + local7 > local124 && local236 - 13 < local212 && local212 < local236 + 3) {
				if (Static283.aBoolean393) {
					Static234.method3974(local7, local236 - 12, local9, 15, Static222.anInt4337, 256 - Static235.anInt4701);
				} else {
					Static143.method2452(local7, local236 - 12, local9, 15, Static222.anInt4337, 256 - Static235.anInt4701);
				}
			}
		}
		if ((Static240.aClass3_Sub4_Sub12_4 == null || Static243.aClass3_Sub4_Sub12_5 == null || Static276.aClass3_Sub4_Sub12_10 == null) && Static65.aClass155_31.method4133(Static260.anInt5354) && Static65.aClass155_31.method4133(Static146.anInt5858) && Static65.aClass155_31.method4133(Static111.anInt2061)) {
			Static240.aClass3_Sub4_Sub12_4 = Static181.method3044(Static260.anInt5354, Static65.aClass155_31);
			Static243.aClass3_Sub4_Sub12_5 = Static181.method3044(Static146.anInt5858, Static65.aClass155_31);
			Static276.aClass3_Sub4_Sub12_10 = Static181.method3044(Static111.anInt2061, Static65.aClass155_31);
			if (Static283.aBoolean393) {
				if (Static240.aClass3_Sub4_Sub12_4 instanceof Class3_Sub4_Sub12_Sub2_Sub1) {
					Static240.aClass3_Sub4_Sub12_4 = new Class3_Sub4_Sub12_Sub1_Sub1((Class3_Sub4_Sub12_Sub2) Static240.aClass3_Sub4_Sub12_4);
				} else {
					Static240.aClass3_Sub4_Sub12_4 = new Class3_Sub4_Sub12_Sub1((Class3_Sub4_Sub12_Sub2) Static240.aClass3_Sub4_Sub12_4);
				}
				if (Static243.aClass3_Sub4_Sub12_5 instanceof Class3_Sub4_Sub12_Sub2_Sub1) {
					Static243.aClass3_Sub4_Sub12_5 = new Class3_Sub4_Sub12_Sub1_Sub1((Class3_Sub4_Sub12_Sub2) Static243.aClass3_Sub4_Sub12_5);
				} else {
					Static243.aClass3_Sub4_Sub12_5 = new Class3_Sub4_Sub12_Sub1((Class3_Sub4_Sub12_Sub2) Static243.aClass3_Sub4_Sub12_5);
				}
				if (Static276.aClass3_Sub4_Sub12_10 instanceof Class3_Sub4_Sub12_Sub2_Sub1) {
					Static276.aClass3_Sub4_Sub12_10 = new Class3_Sub4_Sub12_Sub1_Sub1((Class3_Sub4_Sub12_Sub2) Static276.aClass3_Sub4_Sub12_10);
				} else {
					Static276.aClass3_Sub4_Sub12_10 = new Class3_Sub4_Sub12_Sub1((Class3_Sub4_Sub12_Sub2) Static276.aClass3_Sub4_Sub12_10);
				}
			}
		}
		@Pc(451) int local451;
		if (Static240.aClass3_Sub4_Sub12_4 != null && Static243.aClass3_Sub4_Sub12_5 != null && Static276.aClass3_Sub4_Sub12_10 != null) {
			local214 = (local9 - Static276.aClass3_Sub4_Sub12_10.anInt5728 * 2) / Static240.aClass3_Sub4_Sub12_4.anInt5728;
			for (local236 = 0; local236 < local214; local236++) {
				Static240.aClass3_Sub4_Sub12_4.method4697(Static276.aClass3_Sub4_Sub12_10.anInt5728 + local7 + local236 * Static240.aClass3_Sub4_Sub12_4.anInt5728, -Static240.aClass3_Sub4_Sub12_4.anInt5729 + local11 + local17);
			}
			local236 = (local17 - Static276.aClass3_Sub4_Sub12_10.anInt5729 - 20) / Static243.aClass3_Sub4_Sub12_5.anInt5729;
			for (local451 = 0; local451 < local236; local451++) {
				Static243.aClass3_Sub4_Sub12_5.method4697(local7, Static243.aClass3_Sub4_Sub12_5.anInt5729 * local451 + local11 + 20);
				Static243.aClass3_Sub4_Sub12_5.method4702(local9 + local7 - Static243.aClass3_Sub4_Sub12_5.anInt5728, Static243.aClass3_Sub4_Sub12_5.anInt5729 * local451 + 20 + local11);
			}
			Static276.aClass3_Sub4_Sub12_10.method4697(local7, local11 + local17 - Static276.aClass3_Sub4_Sub12_10.anInt5729);
			Static276.aClass3_Sub4_Sub12_10.method4702(local7 + local9 - Static276.aClass3_Sub4_Sub12_10.anInt5728, local11 + local17 + -Static276.aClass3_Sub4_Sub12_10.anInt5729);
		}
		for (local214 = 0; local214 < Static152.anInt2876; local214++) {
			local236 = local11 + (-local214 + -1 + Static152.anInt2876) * 15 + 13 + 20;
			local451 = Static197.anInt5232;
			if (local7 < local124 && local124 < local9 + local7 && local236 - 13 < local212 && local236 + 3 > local212) {
				local451 = Static168.anInt3170;
			}
			Static224.aClass3_Sub4_Sub2_14.method3685(Static153.method2577(local214), local7 + 3, local236, local451, 0);
		}
		Static210.method3473(Static175.anInt3271, Static173.anInt3249, Static300.anInt5922, Static205.anInt4054);
	}
}
