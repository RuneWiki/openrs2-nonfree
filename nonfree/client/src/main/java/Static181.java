import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static181 {

	@OriginalMember(owner = "client!ta", name = "jb", descriptor = "Lclient!ke;")
	public static Class52 aClass52_36;

	@OriginalMember(owner = "client!ta", name = "mb", descriptor = "Z")
	public static boolean aBoolean166;

	@OriginalMember(owner = "client!ta", name = "ob", descriptor = "Lclient!fg;")
	public static Class33 aClass33_4;

	@OriginalMember(owner = "client!ta", name = "hb", descriptor = "Lclient!vc;")
	public static final Class94 aClass94_10 = new Class94(50);

	@OriginalMember(owner = "client!ta", name = "lb", descriptor = "I")
	public static int anInt3672 = -1;

	@OriginalMember(owner = "client!ta", name = "nb", descriptor = "Lclient!oc;")
	public static final Class70 aClass70_1772 = Static193.method3027("-5berpr-Ufen Sie Ihr Mitteilungsfach)3");

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(ZIIIIIIII)V")
	public static void method2817(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(5) int local5 = arg1 - arg2;
		@Pc(18) int local18 = (arg3 - arg7 << 16) / local5;
		if (Static65.anInt1364 > arg1) {
			local5++;
		}
		@Pc(31) int local31 = arg0 - arg5;
		@Pc(40) int local40 = (arg4 - arg6 << 16) / local31;
		if (arg0 < Static50.anInt1046) {
			local31++;
		}
		@Pc(66) int local66;
		@Pc(60) int local60;
		@Pc(70) int local70;
		@Pc(78) int local78;
		@Pc(112) int local112;
		@Pc(120) int local120;
		for (@Pc(50) int local50 = 0; local50 < local5; local50++) {
			local60 = local18 * (local50 + 1) >> 16;
			local66 = local50 * local18 >> 16;
			local70 = local60 - local66;
			if (local70 > 0) {
				local78 = arg2 + local50 >> 6;
				local60 += arg7;
				local66 += arg7;
				@Pc(90) int[][] local90 = Static123.anIntArrayArrayArray9[local78];
				@Pc(94) byte[][] local94 = Static198.aByteArrayArrayArray17[local78];
				@Pc(98) byte[][] local98 = Static114.aByteArrayArrayArray10[local78];
				@Pc(102) byte[][] local102 = Static98.aByteArrayArrayArray8[local78];
				@Pc(106) byte[][] local106 = Static4.aByteArrayArrayArray1[local78];
				@Pc(110) byte[][] local110 = Static36.aByteArrayArrayArray4[local78];
				for (local112 = 0; local112 < local31; local112++) {
					local120 = local112 * local40 >> 16;
					@Pc(128) int local128 = (local112 + 1) * local40 >> 16;
					@Pc(132) int local132 = local128 - local120;
					if (local132 > 0) {
						local120 += arg6;
						local128 += arg6;
						@Pc(148) int local148 = arg5 + local112 >> 6;
						@Pc(155) int local155 = local112 + arg5 & 0x3F;
						@Pc(162) int local162 = local50 + arg2 & 0x3F;
						@Pc(168) int local168 = (local155 << 6) + local162;
						@Pc(202) int local202;
						@Pc(178) int local178;
						@Pc(184) int local184;
						if (local90[local148] == null) {
							local178 = local50 + arg2 & 0x4;
							local184 = arg5 + local112 & 0x4;
							if ((local178 >= 2 || local184 <= 2) && (local178 <= 2 || local184 >= 2)) {
								local202 = Static102.anIntArray116[Static139.anInt4129 + 1];
							} else {
								local202 = 4936552;
							}
						} else {
							local202 = local90[local148][local168];
						}
						local178 = local94[local148] == null ? 0 : Static102.anIntArray116[local94[local148][local168] & 0xFF];
						local184 = local102[local148] == null ? 0 : Static102.anIntArray116[local102[local148][local168] & 0xFF];
						@Pc(288) int local288;
						if (local178 == 0 && local184 == 0) {
							Static104.method3079(local66, local120, local70, local132, local202);
						} else {
							@Pc(279) byte local279;
							if (local178 != 0) {
								local279 = local106[local148] == null ? 0 : local106[local148][local168];
								if (local178 == -1) {
									local178 = 1;
								}
								local288 = local279 & 0xFC;
								if (local288 == 0 || local70 <= 1 || local132 <= 1) {
									Static104.method3079(local66, local120, local70, local132, local178);
								} else {
									Static10.method248(local178, local132, local66, local70, local202, local120, local279 & 0x3, true, local288 >> 2, Static104.anIntArray347);
								}
							}
							if (local184 != 0) {
								if (local184 == -1) {
									local184 = local202;
								}
								local279 = local98[local148][local168];
								local288 = local279 & 0xFC;
								if (local288 == 0 || local70 <= 1 || local132 <= 1) {
									Static104.method3079(local66, local120, local70, local132, local184);
								}
								Static10.method248(local184, local132, local66, local70, 0, local120, local279 & 0x3, local178 == 0, local288 >> 2, Static104.anIntArray347);
							}
						}
						if (local110[local148] != null) {
							@Pc(401) int local401 = local110[local148][local168] & 0xFF;
							if (local401 != 0) {
								if (local70 == 1) {
									local288 = local66;
								} else {
									local288 = local60 - 1;
								}
								@Pc(421) int local421;
								if (local132 == 1) {
									local421 = local120;
								} else {
									local421 = local128 - 1;
								}
								@Pc(429) int local429 = 13421772;
								if (local401 >= 5 && local401 <= 8 || local401 >= 13 && local401 <= 16 || local401 >= 21 && local401 <= 24 || local401 == 27 || local401 == 28) {
									local429 = 13369344;
									local401 -= 4;
								}
								if (local401 == 1) {
									Static104.method3094(local66, local120, local132, local429);
								} else if (local401 == 2) {
									Static104.method3098(local66, local120, local70, local429);
								} else if (local401 == 3) {
									Static104.method3094(local288, local120, local132, local429);
								} else if (local401 == 4) {
									Static104.method3098(local66, local421, local70, local429);
								} else if (local401 == 9) {
									Static104.method3094(local66, local120, local132, 16777215);
									Static104.method3098(local66, local120, local70, local429);
								} else if (local401 == 10) {
									Static104.method3094(local288, local120, local132, 16777215);
									Static104.method3098(local66, local120, local70, local429);
								} else if (local401 == 11) {
									Static104.method3094(local288, local120, local132, 16777215);
									Static104.method3098(local66, local421, local70, local429);
								} else if (local401 == 12) {
									Static104.method3094(local66, local120, local132, 16777215);
									Static104.method3098(local66, local421, local70, local429);
								} else if (local401 == 17) {
									Static104.method3098(local66, local120, 1, local429);
								} else if (local401 == 18) {
									Static104.method3098(local288, local120, 1, local429);
								} else if (local401 == 19) {
									Static104.method3098(local288, local421, 1, local429);
								} else if (local401 == 20) {
									Static104.method3098(local66, local421, 1, local429);
								} else {
									@Pc(583) int local583;
									if (local401 == 25) {
										for (local583 = 0; local583 < local132; local583++) {
											Static104.method3098(local66 + local583, -local583 + local421, 1, local429);
										}
									} else if (local401 == 26) {
										for (local583 = 0; local583 < local132; local583++) {
											Static104.method3098(local66 + local583, local583 + local120, 1, local429);
										}
									}
								}
							}
						}
					}
				}
			}
		}
		for (local66 = 0; local66 < local5; local66++) {
			local60 = local66 * local18 >> 16;
			local70 = local18 * (local66 + 1) >> 16;
			local78 = local70 - local60;
			if (local78 > 0) {
				@Pc(737) byte[][] local737 = Static43.aByteArrayArrayArray5[local66 + arg2 >> 6];
				local60 += arg7;
				for (@Pc(743) int local743 = 0; local743 < local31; local743++) {
					@Pc(751) int local751 = local743 * local40 >> 16;
					@Pc(759) int local759 = local40 * (local743 + 1) >> 16;
					@Pc(764) int local764 = local759 - local751;
					if (local764 > 0) {
						local751 += arg6;
						@Pc(780) int local780 = arg5 + local743 >> 6;
						local112 = (local66 + arg2 & 0x3F) + ((local743 + arg5 & 0x3F) << 6);
						if (local737[local780] != null) {
							local120 = local737[local780][local112] & 0xFF;
							if (local120 != 0) {
								if (local120 == 47 || local120 == 53) {
									Static186.aClass3_Sub3_Sub2_Sub2Array10[local120 - 1].method2330(local60, local751, local78 * 2 + 1, local764 * 2 + 1);
								} else {
									Static186.aClass3_Sub3_Sub2_Sub2Array10[local120 - 1].method2330(local60 - local78 / 2, -(local764 / 2) + local751, local78 * 2, local764 * 2);
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(Lclient!ke;B)V")
	public static void method2818(@OriginalArg(0) Class52 arg0) {
		Static75.aClass52_16 = arg0;
		Static33.anInt722 = Static75.aClass52_16.method1575(16);
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(Lclient!ma;IIIIII)V")
	public static void method2819(@OriginalArg(0) Class60 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(3) int local3 = arg0.anIntArray158.length;
		@Pc(13) int local13;
		@Pc(20) int local20;
		@Pc(27) int local27;
		@Pc(37) int local37;
		for (@Pc(5) int local5 = 0; local5 < local3; local5++) {
			local13 = arg0.anIntArray158[local5] - Static116.anInt3348;
			local20 = arg0.anIntArray153[local5] - Static198.anInt4037;
			local27 = arg0.anIntArray160[local5] - Static146.anInt3006;
			local37 = local27 * arg3 + local13 * arg4 >> 16;
			@Pc(47) int local47 = local27 * arg4 - local13 * arg3 >> 16;
			@Pc(59) int local59 = local20 * arg2 - local47 * arg1 >> 16;
			@Pc(69) int local69 = local20 * arg1 + local47 * arg2 >> 16;
			if (local69 < 50) {
				return;
			}
			if (arg0.anIntArray152 != null) {
				Static125.anIntArray148[local5] = local37;
				Static125.anIntArray149[local5] = local59;
				Static125.anIntArray154[local5] = local69;
			}
			Static125.anIntArray156[local5] = Static177.anInt3609 + (local37 << 9) / local69;
			Static125.anIntArray157[local5] = Static177.anInt3610 + (local59 << 9) / local69;
		}
		Static177.anInt3611 = 0;
		local3 = arg0.anIntArray161.length;
		for (local13 = 0; local13 < local3; local13++) {
			local20 = arg0.anIntArray161[local13];
			local27 = arg0.anIntArray162[local13];
			local37 = arg0.anIntArray150[local13];
			@Pc(142) int local142 = Static125.anIntArray156[local20];
			@Pc(146) int local146 = Static125.anIntArray156[local27];
			@Pc(150) int local150 = Static125.anIntArray156[local37];
			@Pc(154) int local154 = Static125.anIntArray157[local20];
			@Pc(158) int local158 = Static125.anIntArray157[local27];
			@Pc(162) int local162 = Static125.anIntArray157[local37];
			if ((local142 - local146) * (local162 - local158) - (local154 - local158) * (local150 - local146) > 0) {
				if (Static1.aBoolean96 && Static30.method547(Static81.anInt1614 + Static177.anInt3609, Static58.anInt1272 + Static177.anInt3610, local154, local158, local162, local142, local146, local150)) {
					Static193.anInt3928 = arg5;
					Static182.anInt3733 = arg6;
				}
				Static177.aBoolean160 = false;
				if (local142 < 0 || local146 < 0 || local150 < 0 || local142 > Static177.anInt3612 || local146 > Static177.anInt3612 || local150 > Static177.anInt3612) {
					Static177.aBoolean160 = true;
				}
				if (arg0.anIntArray152 == null || arg0.anIntArray152[local13] == -1) {
					if (arg0.anIntArray155[local13] != 12345678) {
						Static177.method2785(local154, local158, local162, local142, local146, local150, arg0.anIntArray155[local13], arg0.anIntArray159[local13], arg0.anIntArray151[local13]);
					}
				} else if (Static91.aBoolean97) {
					@Pc(367) int local367 = Static177.anInterface1_7.method561(arg0.anIntArray152[local13]);
					Static177.method2785(local154, local158, local162, local142, local146, local150, Static62.method945(local367, arg0.anIntArray155[local13]), Static62.method945(local367, arg0.anIntArray159[local13]), Static62.method945(local367, arg0.anIntArray151[local13]));
				} else if (arg0.aBoolean125) {
					Static177.method2779(local154, local158, local162, local142, local146, local150, arg0.anIntArray155[local13], arg0.anIntArray159[local13], arg0.anIntArray151[local13], Static125.anIntArray148[0], Static125.anIntArray148[1], Static125.anIntArray148[3], Static125.anIntArray149[0], Static125.anIntArray149[1], Static125.anIntArray149[3], Static125.anIntArray154[0], Static125.anIntArray154[1], Static125.anIntArray154[3], arg0.anIntArray152[local13]);
				} else {
					Static177.method2779(local154, local158, local162, local142, local146, local150, arg0.anIntArray155[local13], arg0.anIntArray159[local13], arg0.anIntArray151[local13], Static125.anIntArray148[local20], Static125.anIntArray148[local27], Static125.anIntArray148[local37], Static125.anIntArray149[local20], Static125.anIntArray149[local27], Static125.anIntArray149[local37], Static125.anIntArray154[local20], Static125.anIntArray154[local27], Static125.anIntArray154[local37], arg0.anIntArray152[local13]);
				}
			}
		}
	}
}
