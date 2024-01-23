import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static195 {

	@OriginalMember(owner = "client!sj", name = "R", descriptor = "I")
	public static int anInt3966;

	@OriginalMember(owner = "client!sj", name = "U", descriptor = "I")
	public static int anInt3969;

	@OriginalMember(owner = "client!sj", name = "X", descriptor = "I")
	public static int anInt3972 = 0;

	@OriginalMember(owner = "client!sj", name = "Z", descriptor = "I")
	public static int anInt3974 = 0;

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "([S[Lclient!hh;I)V")
	public static void method3166(@OriginalArg(0) short[] arg0, @OriginalArg(1) Class50[] arg1) {
		Static3.method50(arg0, arg1.length - 1, arg1, 0);
	}

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(JI)V")
	public static void method3167(@OriginalArg(0) long arg0) {
		if (arg0 == 0L) {
			return;
		}
		for (@Pc(16) int local16 = 0; local16 < Static201.anInt4066; local16++) {
			if (Static118.aLongArray5[local16] == arg0) {
				Static201.anInt4066--;
				for (@Pc(34) int local34 = local16; local34 < Static201.anInt4066; local34++) {
					Static118.aLongArray5[local34] = Static118.aLongArray5[local34 + 1];
					Static209.aClass50Array79[local34] = Static209.aClass50Array79[local34 + 1];
				}
				Static205.anInt4112 = Static31.anInt594;
				Static32.aClass1_Sub17_Sub1_1.method2182(56);
				Static32.aClass1_Sub17_Sub1_1.method2171(arg0);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(ZZIILclient!cg;IIZIII)V")
	public static void method3168(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) Class16 arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) boolean arg5, @OriginalArg(8) int arg6, @OriginalArg(9) int arg7, @OriginalArg(10) int arg8) {
		if (arg5 && !Static79.method2552() && (Static159.aByteArrayArrayArray13[0][arg4][arg3] & 0x2) == 0) {
			if ((Static159.aByteArrayArrayArray13[arg6][arg4][arg3] & 0x10) != 0) {
				return;
			}
			if (Static57.method841(arg6, arg4, arg3) != Static185.anInt3848) {
				return;
			}
		}
		if (Static57.anInt1121 > arg6) {
			Static57.anInt1121 = arg6;
		}
		@Pc(51) Class18 local51 = Static148.method2487(arg1);
		@Pc(62) int local62;
		@Pc(65) int local65;
		if (arg0 == 1 || arg0 == 3) {
			local62 = local51.anInt822;
			local65 = local51.anInt811;
		} else {
			local65 = local51.anInt822;
			local62 = local51.anInt811;
		}
		@Pc(93) int local93;
		@Pc(87) int local87;
		if (arg3 + local65 <= 104) {
			local87 = arg3 + (local65 + 1 >> 1);
			local93 = (local65 >> 1) + arg3;
		} else {
			local87 = arg3 + 1;
			local93 = arg3;
		}
		@Pc(121) int local121;
		@Pc(114) int local114;
		if (local62 + arg4 <= 104) {
			local114 = (local62 + 1 >> 1) + arg4;
			local121 = arg4 + (local62 >> 1);
		} else {
			local121 = arg4;
			local114 = arg4 + 1;
		}
		@Pc(133) int[][] local133 = Static119.anIntArrayArrayArray10[arg7];
		@Pc(159) int local159 = local133[local121][local87] + local133[local114][local93] + local133[local121][local93] + local133[local114][local87] >> 2;
		@Pc(168) int local168 = (arg4 << 7) + (local62 << 6);
		@Pc(176) int local176 = (local65 << 6) + (arg3 << 7);
		@Pc(184) int[][] local184 = null;
		if (arg7 < 3) {
			local184 = Static119.anIntArrayArrayArray10[arg7 + 1];
		}
		@Pc(217) long local217 = (long) (arg0 << 20 | arg3 << 7 | arg4 | arg8 << 14 | 0x40000000);
		if (local51.anInt824 == 0) {
			local217 |= Long.MIN_VALUE;
		}
		if (local51.anInt801 == 1) {
			local217 |= 0x400000L;
		}
		if (local51.aBoolean40) {
			local217 |= 0x80000000L;
		}
		local217 |= (long) arg1 << 32;
		if (local51.method606()) {
			Static95.method1496(arg6, local51, arg3, null, arg0, null, arg4);
		}
		@Pc(272) boolean local272 = local51.aBoolean31 & true;
		@Pc(312) Class20 local312;
		@Pc(328) Class113 local328;
		if (arg8 == 22) {
			if (Static24.aBoolean14 || local51.anInt824 != 0 || local51.anInt807 == 1 || local51.aBoolean36) {
				if (local51.anInt821 == -1 && local51.anIntArray66 == null) {
					local328 = local51.method605(local176, arg5, local133, null, local168, local159, local184, local272, 22, arg0);
					local312 = local328.aClass20_6;
				} else {
					local312 = new Class20_Sub1(arg1, 22, arg0, arg7, arg4, arg3, local51.anInt821, local51.aBoolean41, null);
				}
				Static114.method1843(arg6, arg4, arg3, local159, local312, local217, local51.aBoolean39);
				if (local51.anInt807 == 1 && arg2 != null) {
					arg2.method425(arg4, arg3);
				}
			}
		} else if (arg8 == 10 || arg8 == 11) {
			if (local51.anInt821 == -1 && local51.anIntArray66 == null) {
				local328 = local51.method605(local176, arg5, local133, null, local168, local159, local184, local272, 10, arg8 == 11 ? arg0 + 4 : arg0);
				local312 = local328.aClass20_6;
			} else {
				local312 = new Class20_Sub1(arg1, 10, arg8 == 11 ? arg0 + 4 : arg0, arg7, arg4, arg3, local51.anInt821, local51.aBoolean41, null);
			}
			if (local312 != null) {
				@Pc(431) boolean local431 = Static153.method2555(arg6, arg4, arg3, local159, local62, local65, local312, local217);
				if (local51.aBoolean37 && local431 && arg5) {
					@Pc(440) int local440 = 15;
					if (local312 instanceof Class20_Sub5) {
						local440 = ((Class20_Sub5) local312).method1701() / 4;
						if (local440 > 30) {
							local440 = 30;
						}
					}
					for (@Pc(456) int local456 = 0; local456 <= local62; local456++) {
						for (@Pc(460) int local460 = 0; local460 <= local65; local460++) {
							if (Static24.aByteArrayArrayArray2[arg6][local456 + arg4][local460 + arg3] < local440) {
								Static24.aByteArrayArrayArray2[arg6][local456 + arg4][arg3 + local460] = (byte) local440;
							}
						}
					}
				}
			}
			if (local51.anInt807 != 0 && arg2 != null) {
				arg2.method441(local51.aBoolean42, arg3, local62, arg4, local65);
			}
		} else if (arg8 >= 12) {
			if (local51.anInt821 == -1 && local51.anIntArray66 == null) {
				local328 = local51.method605(local176, arg5, local133, null, local168, local159, local184, local272, arg8, arg0);
				local312 = local328.aClass20_6;
			} else {
				local312 = new Class20_Sub1(arg1, arg8, arg0, arg7, arg4, arg3, local51.anInt821, local51.aBoolean41, null);
			}
			Static153.method2555(arg6, arg4, arg3, local159, 1, 1, local312, local217);
			if (arg5 && arg8 >= 12 && arg8 <= 17 && arg8 != 13 && arg6 > 0) {
				Static185.anIntArrayArrayArray12[arg6][arg4][arg3] |= 0x4;
			}
			if (local51.anInt807 != 0 && arg2 != null) {
				arg2.method441(local51.aBoolean42, arg3, local62, arg4, local65);
			}
		} else if (arg8 == 0) {
			if (local51.anInt821 == -1 && local51.anIntArray66 == null) {
				local328 = local51.method605(local176, arg5, local133, null, local168, local159, local184, local272, 0, arg0);
				local312 = local328.aClass20_6;
			} else {
				local312 = new Class20_Sub1(arg1, 0, arg0, arg7, arg4, arg3, local51.anInt821, local51.aBoolean41, null);
			}
			Static91.method3222(arg6, arg4, arg3, local159, local312, null, Static223.anIntArray500[arg0], 0, local217);
			if (arg5) {
				if (arg0 == 0) {
					if (local51.aBoolean37) {
						Static24.aByteArrayArrayArray2[arg6][arg4][arg3] = 50;
						Static24.aByteArrayArrayArray2[arg6][arg4][arg3 + 1] = 50;
					}
					if (local51.aBoolean35) {
						Static185.anIntArrayArrayArray12[arg6][arg4][arg3] |= 0x1;
					}
				} else if (arg0 == 1) {
					if (local51.aBoolean37) {
						Static24.aByteArrayArrayArray2[arg6][arg4][arg3 + 1] = 50;
						Static24.aByteArrayArrayArray2[arg6][arg4 + 1][arg3 + 1] = 50;
					}
					if (local51.aBoolean35) {
						Static185.anIntArrayArrayArray12[arg6][arg4][arg3 + 1] |= 0x2;
					}
				} else if (arg0 == 2) {
					if (local51.aBoolean37) {
						Static24.aByteArrayArrayArray2[arg6][arg4 + 1][arg3] = 50;
						Static24.aByteArrayArrayArray2[arg6][arg4 + 1][arg3 + 1] = 50;
					}
					if (local51.aBoolean35) {
						Static185.anIntArrayArrayArray12[arg6][arg4 + 1][arg3] |= 0x1;
					}
				} else if (arg0 == 3) {
					if (local51.aBoolean37) {
						Static24.aByteArrayArrayArray2[arg6][arg4][arg3] = 50;
						Static24.aByteArrayArrayArray2[arg6][arg4 + 1][arg3] = 50;
					}
					if (local51.aBoolean35) {
						Static185.anIntArrayArrayArray12[arg6][arg4][arg3] |= 0x2;
					}
				}
			}
			if (local51.anInt807 != 0 && arg2 != null) {
				arg2.method434(local51.aBoolean42, arg8, arg4, arg0, arg3);
			}
			if (local51.anInt794 != 16) {
				Static147.method2482(arg6, arg4, arg3, local51.anInt794);
			}
		} else if (arg8 == 1) {
			if (local51.anInt821 == -1 && local51.anIntArray66 == null) {
				local328 = local51.method605(local176, arg5, local133, null, local168, local159, local184, local272, 1, arg0);
				local312 = local328.aClass20_6;
			} else {
				local312 = new Class20_Sub1(arg1, 1, arg0, arg7, arg4, arg3, local51.anInt821, local51.aBoolean41, null);
			}
			Static91.method3222(arg6, arg4, arg3, local159, local312, null, Static53.anIntArray90[arg0], 0, local217);
			if (local51.aBoolean37 && arg5) {
				if (arg0 == 0) {
					Static24.aByteArrayArrayArray2[arg6][arg4][arg3 + 1] = 50;
				} else if (arg0 == 1) {
					Static24.aByteArrayArrayArray2[arg6][arg4 + 1][arg3 + 1] = 50;
				} else if (arg0 == 2) {
					Static24.aByteArrayArrayArray2[arg6][arg4 + 1][arg3] = 50;
				} else if (arg0 == 3) {
					Static24.aByteArrayArrayArray2[arg6][arg4][arg3] = 50;
				}
			}
			if (local51.anInt807 != 0 && arg2 != null) {
				arg2.method434(local51.aBoolean42, arg8, arg4, arg0, arg3);
			}
		} else {
			@Pc(1059) int local1059;
			if (arg8 == 2) {
				local1059 = arg0 + 1 & 0x3;
				@Pc(1103) Class20 local1103;
				@Pc(1086) Class20 local1086;
				if (local51.anInt821 == -1 && local51.anIntArray66 == null) {
					@Pc(1083) Class113 local1083 = local51.method605(local176, arg5, local133, null, local168, local159, local184, local272, 2, arg0 + 4);
					local1086 = local1083.aClass20_6;
					@Pc(1100) Class113 local1100 = local51.method605(local176, arg5, local133, null, local168, local159, local184, local272, 2, local1059);
					local1103 = local1100.aClass20_6;
				} else {
					local1086 = new Class20_Sub1(arg1, 2, arg0 + 4, arg7, arg4, arg3, local51.anInt821, local51.aBoolean41, null);
					local1103 = new Class20_Sub1(arg1, 2, local1059, arg7, arg4, arg3, local51.anInt821, local51.aBoolean41, null);
				}
				Static91.method3222(arg6, arg4, arg3, local159, local1086, local1103, Static223.anIntArray500[arg0], Static223.anIntArray500[local1059], local217);
				if (local51.aBoolean35 && arg5) {
					if (arg0 == 0) {
						Static185.anIntArrayArrayArray12[arg6][arg4][arg3] |= 0x1;
						Static185.anIntArrayArrayArray12[arg6][arg4][arg3 + 1] |= 0x2;
					} else if (arg0 == 1) {
						Static185.anIntArrayArrayArray12[arg6][arg4][arg3 + 1] |= 0x2;
						Static185.anIntArrayArrayArray12[arg6][arg4 + 1][arg3] |= 0x1;
					} else if (arg0 == 2) {
						Static185.anIntArrayArrayArray12[arg6][arg4 + 1][arg3] |= 0x1;
						Static185.anIntArrayArrayArray12[arg6][arg4][arg3] |= 0x2;
					} else if (arg0 == 3) {
						Static185.anIntArrayArrayArray12[arg6][arg4][arg3] |= 0x2;
						Static185.anIntArrayArrayArray12[arg6][arg4][arg3] |= 0x1;
					}
				}
				if (local51.anInt807 != 0 && arg2 != null) {
					arg2.method434(local51.aBoolean42, arg8, arg4, arg0, arg3);
				}
				if (local51.anInt794 != 16) {
					Static147.method2482(arg6, arg4, arg3, local51.anInt794);
				}
			} else if (arg8 == 3) {
				if (local51.anInt821 == -1 && local51.anIntArray66 == null) {
					local328 = local51.method605(local176, arg5, local133, null, local168, local159, local184, local272, 3, arg0);
					local312 = local328.aClass20_6;
				} else {
					local312 = new Class20_Sub1(arg1, 3, arg0, arg7, arg4, arg3, local51.anInt821, local51.aBoolean41, null);
				}
				Static91.method3222(arg6, arg4, arg3, local159, local312, null, Static53.anIntArray90[arg0], 0, local217);
				if (local51.aBoolean37 && arg5) {
					if (arg0 == 0) {
						Static24.aByteArrayArrayArray2[arg6][arg4][arg3 + 1] = 50;
					} else if (arg0 == 1) {
						Static24.aByteArrayArrayArray2[arg6][arg4 + 1][arg3 + 1] = 50;
					} else if (arg0 == 2) {
						Static24.aByteArrayArrayArray2[arg6][arg4 + 1][arg3] = 50;
					} else if (arg0 == 3) {
						Static24.aByteArrayArrayArray2[arg6][arg4][arg3] = 50;
					}
				}
				if (local51.anInt807 != 0 && arg2 != null) {
					arg2.method434(local51.aBoolean42, arg8, arg4, arg0, arg3);
				}
			} else if (arg8 == 9) {
				if (local51.anInt821 == -1 && local51.anIntArray66 == null) {
					local328 = local51.method605(local176, arg5, local133, null, local168, local159, local184, local272, arg8, arg0);
					local312 = local328.aClass20_6;
				} else {
					local312 = new Class20_Sub1(arg1, arg8, arg0, arg7, arg4, arg3, local51.anInt821, local51.aBoolean41, null);
				}
				Static153.method2555(arg6, arg4, arg3, local159, 1, 1, local312, local217);
				if (local51.anInt807 != 0 && arg2 != null) {
					arg2.method441(local51.aBoolean42, arg3, local62, arg4, local65);
				}
				if (local51.anInt794 != 16) {
					Static147.method2482(arg6, arg4, arg3, local51.anInt794);
				}
			} else if (arg8 == 4) {
				if (local51.anInt821 == -1 && local51.anIntArray66 == null) {
					local328 = local51.method605(local176, arg5, local133, null, local168, local159, local184, local272, 4, arg0);
					local312 = local328.aClass20_6;
				} else {
					local312 = new Class20_Sub1(arg1, 4, arg0, arg7, arg4, arg3, local51.anInt821, local51.aBoolean41, null);
				}
				Static101.method1574(arg6, arg4, arg3, local159, local312, null, Static223.anIntArray500[arg0], 0, 0, 0, local217);
			} else {
				@Pc(1649) long local1649;
				@Pc(1688) Class20 local1688;
				@Pc(1704) Class113 local1704;
				if (arg8 == 5) {
					local1059 = 16;
					local1649 = Static14.method199(arg6, arg4, arg3);
					if (local1649 != 0L) {
						local1059 = Static148.method2487((int) (local1649 >>> 32) & Integer.MAX_VALUE).anInt794;
					}
					if (local51.anInt821 == -1 && local51.anIntArray66 == null) {
						local1704 = local51.method605(local176, arg5, local133, null, local168, local159, local184, local272, 4, arg0);
						local1688 = local1704.aClass20_6;
					} else {
						local1688 = new Class20_Sub1(arg1, 4, arg0, arg7, arg4, arg3, local51.anInt821, local51.aBoolean41, null);
					}
					Static101.method1574(arg6, arg4, arg3, local159, local1688, null, Static223.anIntArray500[arg0], 0, local1059 * Static114.anIntArray255[arg0], local1059 * Static146.anIntArray316[arg0], local217);
				} else if (arg8 == 6) {
					local1059 = 8;
					local1649 = Static14.method199(arg6, arg4, arg3);
					if (local1649 != 0L) {
						local1059 = Static148.method2487((int) (local1649 >>> 32) & Integer.MAX_VALUE).anInt794 / 2;
					}
					if (local51.anInt821 == -1 && local51.anIntArray66 == null) {
						local1704 = local51.method605(local176, arg5, local133, null, local168, local159, local184, local272, 4, arg0 + 4);
						local1688 = local1704.aClass20_6;
					} else {
						local1688 = new Class20_Sub1(arg1, 4, arg0 + 4, arg7, arg4, arg3, local51.anInt821, local51.aBoolean41, null);
					}
					Static101.method1574(arg6, arg4, arg3, local159, local1688, null, 256, arg0, Static28.anIntArray56[arg0] * local1059, local1059 * Static138.anIntArray297[arg0], local217);
				} else if (arg8 == 7) {
					@Pc(1836) int local1836 = arg0 + 2 & 0x3;
					if (local51.anInt821 == -1 && local51.anIntArray66 == null) {
						@Pc(1859) Class113 local1859 = local51.method605(local176, arg5, local133, null, local168, local159, local184, local272, 4, local1836 + 4);
						local312 = local1859.aClass20_6;
					} else {
						local312 = new Class20_Sub1(arg1, 4, local1836 + 4, arg7, arg4, arg3, local51.anInt821, local51.aBoolean41, null);
					}
					Static101.method1574(arg6, arg4, arg3, local159, local312, null, 256, local1836, 0, 0, local217);
				} else if (arg8 == 8) {
					local1649 = Static14.method199(arg6, arg4, arg3);
					local1059 = 8;
					if (local1649 != 0L) {
						local1059 = Static148.method2487((int) (local1649 >>> 32) & Integer.MAX_VALUE).anInt794 / 2;
					}
					@Pc(1928) int local1928 = arg0 + 2 & 0x3;
					@Pc(1970) Class20 local1970;
					if (local51.anInt821 == -1 && local51.anIntArray66 == null) {
						@Pc(1988) Class113 local1988 = local51.method605(local176, arg5, local133, null, local168, local159, local184, local272, 4, arg0 + 4);
						local1688 = local1988.aClass20_6;
						@Pc(2007) Class113 local2007 = local51.method605(local176, arg5, local133, null, local168, local159, local184, local272, 4, local1928 + 4);
						local1970 = local2007.aClass20_6;
					} else {
						local1688 = new Class20_Sub1(arg1, 4, arg0 + 4, arg7, arg4, arg3, local51.anInt821, local51.aBoolean41, null);
						local1970 = new Class20_Sub1(arg1, 4, local1928 + 4, arg7, arg4, arg3, local51.anInt821, local51.aBoolean41, null);
					}
					Static101.method1574(arg6, arg4, arg3, local159, local1688, local1970, 256, arg0, local1059 * Static28.anIntArray56[arg0], local1059 * Static138.anIntArray297[arg0], local217);
				}
			}
		}
	}

	@OriginalMember(owner = "client!sj", name = "g", descriptor = "(I)V")
	public static void method3169() {
		if (!Static234.aBoolean218) {
			return;
		}
		@Pc(18) Class93 local18 = Static186.method3524(Static169.anInt3444, Static138.anInt2812);
		if (local18 != null && local18.anObjectArray10 != null) {
			@Pc(27) Class1_Sub29 local27 = new Class1_Sub29();
			local27.aClass93_119 = local18;
			local27.anObjectArray33 = local18.anObjectArray10;
			Static144.method2381(local27);
		}
		Static234.aBoolean218 = false;
		Static66.method999(local18);
	}
}
