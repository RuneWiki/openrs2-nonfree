import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static178 {

	@OriginalMember(owner = "client!w", name = "f", descriptor = "[I")
	public static int[] anIntArray364;

	@OriginalMember(owner = "client!w", name = "g", descriptor = "[I")
	public static int[] anIntArray365;

	@OriginalMember(owner = "client!w", name = "a", descriptor = "Lclient!lf;")
	public static Class49 aClass49_1720 = Static32.method683(" )2> <col=00ffff>");

	@OriginalMember(owner = "client!w", name = "c", descriptor = "I")
	public static int anInt3900 = 0;

	@OriginalMember(owner = "client!w", name = "e", descriptor = "[Lclient!u;")
	public static Class2_Sub2_Sub3_Sub7_Sub2[] aClass2_Sub2_Sub3_Sub7_Sub2Array1 = new Class2_Sub2_Sub3_Sub7_Sub2[2048];

	@OriginalMember(owner = "client!w", name = "l", descriptor = "I")
	public static int anInt3906 = 0;

	@OriginalMember(owner = "client!w", name = "m", descriptor = "I")
	public static int anInt3907 = 0;

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(IIIIILclient!lb;II)V")
	public static void method2904(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) Class48 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (Static159.aBoolean148 && (Static81.aByteArrayArrayArray2[0][arg5][arg6] & 0x2) == 0) {
			if ((Static81.aByteArrayArrayArray2[arg0][arg5][arg6] & 0x10) != 0) {
				return;
			}
			if (Static143.method2366(arg6, arg0, arg5) != Static147.anInt3141) {
				return;
			}
		}
		if (arg0 < Static77.anInt1626) {
			Static77.anInt1626 = arg0;
		}
		@Pc(45) Class2_Sub2_Sub9 local45 = Static124.method2146(arg1);
		@Pc(61) int local61;
		@Pc(58) int local58;
		if (arg2 == 1 || arg2 == 3) {
			local58 = local45.anInt1482;
			local61 = local45.anInt1480;
		} else {
			local61 = local45.anInt1482;
			local58 = local45.anInt1480;
		}
		@Pc(95) int local95;
		@Pc(89) int local89;
		if (local61 + arg5 <= 104) {
			local89 = (local61 + 1 >> 1) + arg5;
			local95 = (local61 >> 1) + arg5;
		} else {
			local89 = arg5 + 1;
			local95 = arg5;
		}
		@Pc(112) int local112;
		@Pc(116) int local116;
		if (arg6 + local58 > 104) {
			local112 = arg6;
			local116 = arg6 + 1;
		} else {
			local112 = arg6 + (local58 >> 1);
			local116 = arg6 + (local58 + 1 >> 1);
		}
		@Pc(137) int[][] local137 = Static162.anIntArrayArrayArray7[arg0];
		@Pc(145) int local145 = (arg5 << 7) + (local61 << 6);
		@Pc(153) int local153 = (local58 << 6) + (arg6 << 7);
		@Pc(179) int local179 = local137[local89][local116] + local137[local95][local116] + local137[local89][local112] + local137[local95][local112] >> 2;
		@Pc(196) long local196 = (long) (arg5 | 0x40000000 | arg6 << 7 | arg3 << 14 | arg2 << 20);
		if (local45.anInt1501 == 0) {
			local196 |= Long.MIN_VALUE;
		}
		if (local45.anInt1483 == 1) {
			local196 |= 0x400000L;
		}
		local196 |= (long) arg1 << 32;
		if (local45.method1202()) {
			Static135.method2264(arg2, arg6, local45, arg0, arg5);
		}
		@Pc(276) Class2_Sub2_Sub3 local276;
		if (arg3 != 22) {
			@Pc(373) int local373;
			if (arg3 == 10 || arg3 == 11) {
				if (local45.anInt1512 == -1 && local45.anIntArray177 == null) {
					local276 = local45.method1194(local153, local145, 10, arg2, local179, local137);
				} else {
					local276 = new Class2_Sub2_Sub3_Sub1(arg1, 10, arg2, arg0, arg5, arg6, local45.anInt1512, true, null);
				}
				if (local276 != null && Static182.method3025(arg0, arg5, arg6, local179, local61, local58, local276, arg3 == 11 ? 256 : 0, local196) && local45.aBoolean65) {
					local373 = 15;
					if (local276 instanceof Class2_Sub2_Sub3_Sub4) {
						local373 = ((Class2_Sub2_Sub3_Sub4) local276).method1049() / 4;
						if (local373 > 30) {
							local373 = 30;
						}
					}
					for (@Pc(389) int local389 = 0; local389 <= local61; local389++) {
						for (@Pc(393) int local393 = 0; local393 <= local58; local393++) {
							if (local373 > Static180.aByteArrayArrayArray9[arg0][arg5 + local389][local393 + arg6]) {
								Static180.aByteArrayArrayArray9[arg0][arg5 + local389][arg6 + local393] = (byte) local373;
							}
						}
					}
				}
				if (local45.anInt1490 != 0 && arg4 != null) {
					arg4.method1590(arg5, local61, local45.aBoolean66, arg6, local58);
				}
			} else if (arg3 >= 12) {
				if (local45.anInt1512 == -1 && local45.anIntArray177 == null) {
					local276 = local45.method1194(local153, local145, arg3, arg2, local179, local137);
				} else {
					local276 = new Class2_Sub2_Sub3_Sub1(arg1, arg3, arg2, arg0, arg5, arg6, local45.anInt1512, true, null);
				}
				Static182.method3025(arg0, arg5, arg6, local179, 1, 1, local276, 0, local196);
				if (arg3 >= 12 && arg3 <= 17 && arg3 != 13 && arg0 > 0) {
					Static165.anIntArrayArrayArray6[arg0][arg5][arg6] |= 0x924;
				}
				if (local45.anInt1490 != 0 && arg4 != null) {
					arg4.method1590(arg5, local61, local45.aBoolean66, arg6, local58);
				}
			} else if (arg3 == 0) {
				if (local45.anInt1512 == -1 && local45.anIntArray177 == null) {
					local276 = local45.method1194(local153, local145, 0, arg2, local179, local137);
				} else {
					local276 = new Class2_Sub2_Sub3_Sub1(arg1, 0, arg2, arg0, arg5, arg6, local45.anInt1512, true, null);
				}
				Static112.method1900(arg0, arg5, arg6, local179, local276, null, Static20.anIntArray40[arg2], 0, local196);
				if (arg2 == 0) {
					if (local45.aBoolean65) {
						Static180.aByteArrayArrayArray9[arg0][arg5][arg6] = 50;
						Static180.aByteArrayArrayArray9[arg0][arg5][arg6 + 1] = 50;
					}
					if (local45.aBoolean64) {
						Static165.anIntArrayArrayArray6[arg0][arg5][arg6] |= 0x249;
					}
				} else if (arg2 == 1) {
					if (local45.aBoolean65) {
						Static180.aByteArrayArrayArray9[arg0][arg5][arg6 + 1] = 50;
						Static180.aByteArrayArrayArray9[arg0][arg5 + 1][arg6 + 1] = 50;
					}
					if (local45.aBoolean64) {
						Static165.anIntArrayArrayArray6[arg0][arg5][arg6 + 1] |= 0x492;
					}
				} else if (arg2 == 2) {
					if (local45.aBoolean65) {
						Static180.aByteArrayArrayArray9[arg0][arg5 + 1][arg6] = 50;
						Static180.aByteArrayArrayArray9[arg0][arg5 + 1][arg6 + 1] = 50;
					}
					if (local45.aBoolean64) {
						Static165.anIntArrayArrayArray6[arg0][arg5 + 1][arg6] |= 0x249;
					}
				} else if (arg2 == 3) {
					if (local45.aBoolean65) {
						Static180.aByteArrayArrayArray9[arg0][arg5][arg6] = 50;
						Static180.aByteArrayArrayArray9[arg0][arg5 + 1][arg6] = 50;
					}
					if (local45.aBoolean64) {
						Static165.anIntArrayArrayArray6[arg0][arg5][arg6] |= 0x492;
					}
				}
				if (local45.anInt1490 != 0 && arg4 != null) {
					arg4.method1594(arg5, local45.aBoolean66, arg2, arg3, arg6);
				}
				if (local45.anInt1489 != 16) {
					Static164.method2768(arg0, arg5, arg6, local45.anInt1489);
				}
			} else if (arg3 == 1) {
				if (local45.anInt1512 == -1 && local45.anIntArray177 == null) {
					local276 = local45.method1194(local153, local145, 1, arg2, local179, local137);
				} else {
					local276 = new Class2_Sub2_Sub3_Sub1(arg1, 1, arg2, arg0, arg5, arg6, local45.anInt1512, true, null);
				}
				Static112.method1900(arg0, arg5, arg6, local179, local276, null, Static23.anIntArray43[arg2], 0, local196);
				if (local45.aBoolean65) {
					if (arg2 == 0) {
						Static180.aByteArrayArrayArray9[arg0][arg5][arg6 + 1] = 50;
					} else if (arg2 == 1) {
						Static180.aByteArrayArrayArray9[arg0][arg5 + 1][arg6 + 1] = 50;
					} else if (arg2 == 2) {
						Static180.aByteArrayArrayArray9[arg0][arg5 + 1][arg6] = 50;
					} else if (arg2 == 3) {
						Static180.aByteArrayArrayArray9[arg0][arg5][arg6] = 50;
					}
				}
				if (local45.anInt1490 != 0 && arg4 != null) {
					arg4.method1594(arg5, local45.aBoolean66, arg2, arg3, arg6);
				}
			} else {
				@Pc(963) int local963;
				if (arg3 == 2) {
					local963 = arg2 + 1 & 0x3;
					@Pc(994) Class2_Sub2_Sub3 local994;
					@Pc(982) Class2_Sub2_Sub3 local982;
					if (local45.anInt1512 == -1 && local45.anIntArray177 == null) {
						local982 = local45.method1194(local153, local145, 2, arg2 + 4, local179, local137);
						local994 = local45.method1194(local153, local145, 2, local963, local179, local137);
					} else {
						local982 = new Class2_Sub2_Sub3_Sub1(arg1, 2, arg2 + 4, arg0, arg5, arg6, local45.anInt1512, true, null);
						local994 = new Class2_Sub2_Sub3_Sub1(arg1, 2, local963, arg0, arg5, arg6, local45.anInt1512, true, null);
					}
					Static112.method1900(arg0, arg5, arg6, local179, local982, local994, Static20.anIntArray40[arg2], Static20.anIntArray40[local963], local196);
					if (local45.aBoolean64) {
						if (arg2 == 0) {
							Static165.anIntArrayArrayArray6[arg0][arg5][arg6] |= 0x249;
							Static165.anIntArrayArrayArray6[arg0][arg5][arg6 + 1] |= 0x492;
						} else if (arg2 == 1) {
							Static165.anIntArrayArrayArray6[arg0][arg5][arg6 + 1] |= 0x492;
							Static165.anIntArrayArrayArray6[arg0][arg5 + 1][arg6] |= 0x249;
						} else if (arg2 == 2) {
							Static165.anIntArrayArrayArray6[arg0][arg5 + 1][arg6] |= 0x249;
							Static165.anIntArrayArrayArray6[arg0][arg5][arg6] |= 0x492;
						} else if (arg2 == 3) {
							Static165.anIntArrayArrayArray6[arg0][arg5][arg6] |= 0x492;
							Static165.anIntArrayArrayArray6[arg0][arg5][arg6] |= 0x249;
						}
					}
					if (local45.anInt1490 != 0 && arg4 != null) {
						arg4.method1594(arg5, local45.aBoolean66, arg2, arg3, arg6);
					}
					if (local45.anInt1489 != 16) {
						Static164.method2768(arg0, arg5, arg6, local45.anInt1489);
					}
				} else if (arg3 == 3) {
					if (local45.anInt1512 == -1 && local45.anIntArray177 == null) {
						local276 = local45.method1194(local153, local145, 3, arg2, local179, local137);
					} else {
						local276 = new Class2_Sub2_Sub3_Sub1(arg1, 3, arg2, arg0, arg5, arg6, local45.anInt1512, true, null);
					}
					Static112.method1900(arg0, arg5, arg6, local179, local276, null, Static23.anIntArray43[arg2], 0, local196);
					if (local45.aBoolean65) {
						if (arg2 == 0) {
							Static180.aByteArrayArrayArray9[arg0][arg5][arg6 + 1] = 50;
						} else if (arg2 == 1) {
							Static180.aByteArrayArrayArray9[arg0][arg5 + 1][arg6 + 1] = 50;
						} else if (arg2 == 2) {
							Static180.aByteArrayArrayArray9[arg0][arg5 + 1][arg6] = 50;
						} else if (arg2 == 3) {
							Static180.aByteArrayArrayArray9[arg0][arg5][arg6] = 50;
						}
					}
					if (local45.anInt1490 != 0 && arg4 != null) {
						arg4.method1594(arg5, local45.aBoolean66, arg2, arg3, arg6);
					}
				} else if (arg3 == 9) {
					if (local45.anInt1512 == -1 && local45.anIntArray177 == null) {
						local276 = local45.method1194(local153, local145, arg3, arg2, local179, local137);
					} else {
						local276 = new Class2_Sub2_Sub3_Sub1(arg1, arg3, arg2, arg0, arg5, arg6, local45.anInt1512, true, null);
					}
					Static182.method3025(arg0, arg5, arg6, local179, 1, 1, local276, 0, local196);
					if (local45.anInt1490 != 0 && arg4 != null) {
						arg4.method1590(arg5, local61, local45.aBoolean66, arg6, local58);
					}
					if (local45.anInt1489 != 16) {
						Static164.method2768(arg0, arg5, arg6, local45.anInt1489);
					}
				} else if (arg3 == 4) {
					if (local45.anInt1512 == -1 && local45.anIntArray177 == null) {
						local276 = local45.method1194(local153, local145, 4, arg2, local179, local137);
					} else {
						local276 = new Class2_Sub2_Sub3_Sub1(arg1, 4, arg2, arg0, arg5, arg6, local45.anInt1512, true, null);
					}
					Static33.method690(arg0, arg5, arg6, local179, local276, null, Static20.anIntArray40[arg2], 0, 0, 0, local196);
				} else {
					@Pc(1503) long local1503;
					@Pc(1538) Class2_Sub2_Sub3 local1538;
					if (arg3 == 5) {
						local1503 = Static17.method2057(arg0, arg5, arg6);
						local963 = 16;
						if (local1503 != 0L) {
							local963 = Static124.method2146((int) (local1503 >>> 32) & Integer.MAX_VALUE).anInt1489;
						}
						if (local45.anInt1512 == -1 && local45.anIntArray177 == null) {
							local1538 = local45.method1194(local153, local145, 4, arg2, local179, local137);
						} else {
							local1538 = new Class2_Sub2_Sub3_Sub1(arg1, 4, arg2, arg0, arg5, arg6, local45.anInt1512, true, null);
						}
						Static33.method690(arg0, arg5, arg6, local179, local1538, null, Static20.anIntArray40[arg2], 0, Static86.anIntArray315[arg2] * local963, Static179.anIntArray366[arg2] * local963, local196);
					} else if (arg3 == 6) {
						local963 = 8;
						local1503 = Static17.method2057(arg0, arg5, arg6);
						if (local1503 != 0L) {
							local963 = Static124.method2146(Integer.MAX_VALUE & (int) (local1503 >>> 32)).anInt1489 / 2;
						}
						if (local45.anInt1512 == -1 && local45.anIntArray177 == null) {
							local1538 = local45.method1194(local153, local145, 4, arg2 + 4, local179, local137);
						} else {
							local1538 = new Class2_Sub2_Sub3_Sub1(arg1, 4, arg2 + 4, arg0, arg5, arg6, local45.anInt1512, true, null);
						}
						Static33.method690(arg0, arg5, arg6, local179, local1538, null, 256, arg2, Static38.anIntArray85[arg2] * local963, local963 * Static91.anIntArray198[arg2], local196);
					} else if (arg3 == 7) {
						local373 = arg2 + 2 & 0x3;
						if (local45.anInt1512 == -1 && local45.anIntArray177 == null) {
							local276 = local45.method1194(local153, local145, 4, local373 + 4, local179, local137);
						} else {
							local276 = new Class2_Sub2_Sub3_Sub1(arg1, 4, local373 + 4, arg0, arg5, arg6, local45.anInt1512, true, null);
						}
						Static33.method690(arg0, arg5, arg6, local179, local276, null, 256, local373, 0, 0, local196);
					} else if (arg3 == 8) {
						local1503 = Static17.method2057(arg0, arg5, arg6);
						local963 = 8;
						if (local1503 != 0L) {
							local963 = Static124.method2146(Integer.MAX_VALUE & (int) (local1503 >>> 32)).anInt1489 / 2;
						}
						@Pc(1762) int local1762 = arg2 + 2 & 0x3;
						@Pc(1801) Class2_Sub2_Sub3 local1801;
						if (local45.anInt1512 == -1 && local45.anIntArray177 == null) {
							local1538 = local45.method1194(local153, local145, 4, arg2 + 4, local179, local137);
							local1801 = local45.method1194(local153, local145, 4, local1762 + 4, local179, local137);
						} else {
							local1538 = new Class2_Sub2_Sub3_Sub1(arg1, 4, arg2 + 4, arg0, arg5, arg6, local45.anInt1512, true, null);
							local1801 = new Class2_Sub2_Sub3_Sub1(arg1, 4, local1762 + 4, arg0, arg5, arg6, local45.anInt1512, true, null);
						}
						Static33.method690(arg0, arg5, arg6, local179, local1538, local1801, 256, arg2, Static38.anIntArray85[arg2] * local963, Static91.anIntArray198[arg2] * local963, local196);
					}
				}
			}
		} else if (!Static159.aBoolean148 || local45.anInt1501 != 0 || local45.anInt1490 == 1 || local45.aBoolean62) {
			if (local45.anInt1512 == -1 && local45.anIntArray177 == null) {
				local276 = local45.method1194(local153, local145, 22, arg2, local179, local137);
			} else {
				local276 = new Class2_Sub2_Sub3_Sub1(arg1, 22, arg2, arg0, arg5, arg6, local45.anInt1512, true, null);
			}
			Static149.method2454(arg0, arg5, arg6, local179, local276, local196);
			if (local45.anInt1490 == 1 && arg4 != null) {
				arg4.method1595(arg6, arg5);
			}
		}
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(B)V")
	public static void method2905() {
		anIntArray365 = null;
		anIntArray364 = null;
		aClass49_1720 = null;
		aClass2_Sub2_Sub3_Sub7_Sub2Array1 = null;
	}

	@OriginalMember(owner = "client!w", name = "b", descriptor = "(B)V")
	public static void method2906() {
		for (@Pc(10) Class2_Sub16 local10 = (Class2_Sub16) Static132.aClass81_10.method2682(); local10 != null; local10 = (Class2_Sub16) Static132.aClass81_10.method2686()) {
			if (local10.aClass2_Sub2_Sub9_1 != null) {
				local10.method1425();
			}
		}
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(ILclient!vg;II)V")
	public static void method2907(@OriginalArg(1) Class85 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg0.anInt3880 == 1) {
			Static11.method162(arg0.anInt3849, 0, arg0.aClass49_1708, (short) 34, 0L, Static154.aClass49_1489);
		}
		if (arg0.anInt3880 == 2 && !Static108.aBoolean93) {
			@Pc(41) Class49 local41 = Static7.method108(arg0);
			if (local41 != null) {
				Static11.method162(arg0.anInt3849, -1, local41, (short) 28, 0L, Static33.method692(new Class49[] { Static36.aClass49_479, arg0.aClass49_1715 }));
			}
		}
		if (arg0.anInt3880 == 3) {
			Static11.method162(arg0.anInt3849, 0, Static156.aClass49_1523, (short) 16, 0L, Static154.aClass49_1489);
		}
		if (arg0.anInt3880 == 4) {
			Static11.method162(arg0.anInt3849, 0, arg0.aClass49_1708, (short) 21, 0L, Static154.aClass49_1489);
		}
		if (arg0.anInt3880 == 5) {
			Static11.method162(arg0.anInt3849, 0, arg0.aClass49_1708, (short) 10, 0L, Static154.aClass49_1489);
		}
		if (arg0.anInt3880 == 6 && Static141.aClass85_12 == null) {
			Static11.method162(arg0.anInt3849, -1, arg0.aClass49_1708, (short) 36, 0L, Static154.aClass49_1489);
		}
		@Pc(155) int local155;
		@Pc(149) int local149;
		if (arg0.anInt3855 == 2) {
			local149 = 0;
			for (@Pc(151) int local151 = 0; local151 < arg0.anInt3867; local151++) {
				for (local155 = 0; local155 < arg0.anInt3858; local155++) {
					@Pc(165) int local165 = (arg0.anInt3829 + 32) * local155;
					@Pc(172) int local172 = local151 * (arg0.anInt3892 + 32);
					if (local149 < 20) {
						local165 += arg0.anIntArray352[local149];
						local172 += arg0.anIntArray356[local149];
					}
					if (local165 <= arg2 && arg1 >= local172 && arg2 < local165 + 32 && local172 + 32 > arg1) {
						Static6.aClass85_1 = arg0;
						Static141.anInt3004 = local149;
						if (arg0.anIntArray358[local149] > 0) {
							@Pc(231) Class2_Sub2_Sub10 local231 = Static113.method1913(arg0.anIntArray358[local149] - 1);
							if (Static124.anInt2746 == 1 && Static17.method2055(Static111.method1895(arg0))) {
								if (Static87.anInt2931 != arg0.anInt3849 || local149 != Static43.anInt1036) {
									Static11.method162(arg0.anInt3849, local149, Static64.aClass49_696, (short) 4, (long) local231.anInt1590, Static33.method692(new Class49[] { Static180.aClass49_1728, Static79.aClass49_1752, local231.aClass49_834 }));
								}
							} else if (!Static108.aBoolean93 || !Static17.method2055(Static111.method1895(arg0))) {
								@Pc(255) Class49[] local255 = local231.aClass49Array12;
								if (Static9.aBoolean10) {
									local255 = Static91.method1579(local255);
								}
								@Pc(269) int local269;
								@Pc(282) byte local282;
								if (Static17.method2055(Static111.method1895(arg0))) {
									for (local269 = 4; local269 >= 3; local269--) {
										if (local255 != null && local255[local269] != null) {
											if (local269 == 3) {
												local282 = 20;
											} else {
												local282 = 3;
											}
											Static11.method162(arg0.anInt3849, local149, local255[local269], local282, (long) local231.anInt1590, Static33.method692(new Class49[] { Static73.aClass49_797, local231.aClass49_834 }));
										} else if (local269 == 4) {
											Static11.method162(arg0.anInt3849, local149, Static71.aClass49_778, (short) 3, (long) local231.anInt1590, Static33.method692(new Class49[] { Static73.aClass49_797, local231.aClass49_834 }));
										}
									}
								}
								if (Static156.method2644(Static111.method1895(arg0))) {
									Static11.method162(arg0.anInt3849, local149, Static64.aClass49_696, (short) 17, (long) local231.anInt1590, Static33.method692(new Class49[] { Static73.aClass49_797, local231.aClass49_834 }));
								}
								if (Static17.method2055(Static111.method1895(arg0)) && local255 != null) {
									for (local269 = 2; local269 >= 0; local269--) {
										if (local255[local269] != null) {
											local282 = 0;
											if (local269 == 0) {
												local282 = 15;
											}
											if (local269 == 1) {
												local282 = 29;
											}
											if (local269 == 2) {
												local282 = 7;
											}
											Static11.method162(arg0.anInt3849, local149, local255[local269], local282, (long) local231.anInt1590, Static33.method692(new Class49[] { Static73.aClass49_797, local231.aClass49_834 }));
										}
									}
								}
								local255 = arg0.aClass49Array23;
								if (Static9.aBoolean10) {
									local255 = Static91.method1579(local255);
								}
								if (local255 != null) {
									for (local269 = 4; local269 >= 0; local269--) {
										if (local255[local269] != null) {
											local282 = 0;
											if (local269 == 0) {
												local282 = 39;
											}
											if (local269 == 1) {
												local282 = 45;
											}
											if (local269 == 2) {
												local282 = 24;
											}
											if (local269 == 3) {
												local282 = 41;
											}
											if (local269 == 4) {
												local282 = 42;
											}
											Static11.method162(arg0.anInt3849, local149, local255[local269], local282, (long) local231.anInt1590, Static33.method692(new Class49[] { Static73.aClass49_797, local231.aClass49_834 }));
										}
									}
								}
								Static11.method162(arg0.anInt3849, local149, Static51.aClass49_589, (short) 1005, (long) local231.anInt1590, Static33.method692(new Class49[] { Static73.aClass49_797, local231.aClass49_834 }));
							} else if ((Static138.anInt2937 & 0x10) == 16) {
								Static11.method162(arg0.anInt3849, local149, Static103.aClass49_1026, (short) 46, (long) local231.anInt1590, Static33.method692(new Class49[] { Static150.aClass49_1450, Static79.aClass49_1752, local231.aClass49_834 }));
							}
						}
					}
					local149++;
				}
			}
		}
		if (!arg0.aBoolean171) {
			return;
		}
		if (Static108.aBoolean93) {
			if (Static38.method765(Static111.method1895(arg0)) && (Static138.anInt2937 & 0x20) == 32) {
				Static11.method162(arg0.anInt3849, arg0.anInt3866, Static103.aClass49_1026, (short) 44, 0L, Static33.method692(new Class49[] { Static150.aClass49_1450, Static102.aClass49_1024, arg0.aClass49_1709 }));
				return;
			}
			return;
		}
		@Pc(714) Class49 local714;
		for (local149 = 9; local149 >= 5; local149--) {
			local714 = Static23.method426(arg0, local149);
			if (local714 != null) {
				Static11.method162(arg0.anInt3849, arg0.anInt3866, local714, (short) 1002, (long) (local149 + 1), arg0.aClass49_1709);
			}
		}
		local714 = Static7.method108(arg0);
		if (local714 != null) {
			Static11.method162(arg0.anInt3849, arg0.anInt3866, local714, (short) 28, 0L, arg0.aClass49_1709);
		}
		for (local155 = 4; local155 >= 0; local155--) {
			@Pc(768) Class49 local768 = Static23.method426(arg0, local155);
			if (local768 != null) {
				Static11.method162(arg0.anInt3849, arg0.anInt3866, local768, (short) 14, (long) (local155 + 1), arg0.aClass49_1709);
			}
		}
		if (Static37.method763(Static111.method1895(arg0))) {
			Static11.method162(arg0.anInt3849, arg0.anInt3866, Static104.aClass49_1036, (short) 36, 0L, Static154.aClass49_1489);
			return;
		}
	}
}
