import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static55 {

	@OriginalMember(owner = "client!jd", name = "B", descriptor = "Lclient!ga;")
	public static Class20_Sub1 aClass20_Sub1_29;

	@OriginalMember(owner = "client!jd", name = "mb", descriptor = "J")
	public static long aLong36;

	@OriginalMember(owner = "client!jd", name = "x", descriptor = "Lclient!ec;")
	private static Class22 aClass22_281 = Static60.method1113("Loading config )2 ");

	@OriginalMember(owner = "client!jd", name = "L", descriptor = "Lclient!ec;")
	public static Class22 aClass22_282 = Static60.method1113("blinken1:");

	@OriginalMember(owner = "client!jd", name = "V", descriptor = "Lclient!ec;")
	public static Class22 aClass22_283 = aClass22_281;

	@OriginalMember(owner = "client!jd", name = "W", descriptor = "[S")
	public static short[] aShortArray4 = new short[] { 960, 957, -21568, -21571, 22464 };

	@OriginalMember(owner = "client!jd", name = "nb", descriptor = "I")
	public static int anInt1100 = 0;

	@OriginalMember(owner = "client!jd", name = "wb", descriptor = "I")
	public static int anInt1109 = 0;

	@OriginalMember(owner = "client!jd", name = "Cb", descriptor = "I")
	public static int anInt1115 = 0;

	@OriginalMember(owner = "client!jd", name = "Gb", descriptor = "I")
	public static int anInt1118 = 0;

	@OriginalMember(owner = "client!jd", name = "d", descriptor = "(I)V")
	public static void method695() {
		aClass22_283 = null;
		aClass22_281 = null;
		aClass22_282 = null;
		aClass20_Sub1_29 = null;
		aShortArray4 = null;
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(IILclient!vd;IIILclient!qf;III)V")
	public static void method724(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class77 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class60 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(9) Class4_Sub1_Sub5 local9 = Static5.method45(arg0);
		@Pc(23) int local23;
		@Pc(20) int local20;
		if (arg8 == 1 || arg8 == 3) {
			local20 = local9.anInt1256;
			local23 = local9.anInt1267;
		} else {
			local23 = local9.anInt1256;
			local20 = local9.anInt1267;
		}
		@Pc(55) int local55;
		@Pc(49) int local49;
		if (arg5 + local23 <= 104) {
			local49 = (local23 + 1 >> 1) + arg5;
			local55 = (local23 >> 1) + arg5;
		} else {
			local49 = arg5 + 1;
			local55 = arg5;
		}
		@Pc(74) int local74;
		@Pc(72) int local72;
		if (local20 + arg3 > 104) {
			local72 = arg3 + 1;
			local74 = arg3;
		} else {
			local74 = arg3 + (local20 >> 1);
			local72 = (local20 + 1 >> 1) + arg3;
		}
		@Pc(94) int[][] local94 = Static57.anIntArrayArrayArray4[arg4];
		@Pc(121) int local121 = local94[local49][local72] + local94[local49][local74] + local94[local55][local74] + local94[local55][local72] >> 2;
		@Pc(129) int local129 = (local20 << 6) + (arg3 << 7);
		@Pc(137) int local137 = (local23 << 6) + (arg5 << 7);
		@Pc(149) int local149 = (arg0 << 14) + (arg3 << 7) + arg5 + 1073741824;
		if (local9.anInt1242 == 0) {
			local149 += Integer.MIN_VALUE;
		}
		@Pc(165) int local165 = (arg8 << 6) + arg1;
		if (local9.anInt1280 == 1) {
			local165 += 256;
		}
		@Pc(192) Class4_Sub1_Sub3 local192;
		if (arg1 == 22) {
			if (local9.anInt1259 == -1 && local9.anIntArray137 == null) {
				local192 = local9.method875(local137, 22, local129, local94, arg8, local121);
			} else {
				local192 = new Class4_Sub1_Sub3_Sub5(arg0, 22, arg8, arg4, arg5, arg3, local9.anInt1259, true, null);
			}
			arg2.method1942(arg7, arg5, arg3, local121, local192, local149, local165);
			if (local9.anInt1268 == 1) {
				arg6.method1666(arg5, arg3);
			}
		} else if (arg1 == 10 || arg1 == 11) {
			if (local9.anInt1259 == -1 && local9.anIntArray137 == null) {
				local192 = local9.method875(local137, 10, local129, local94, arg8, local121);
			} else {
				local192 = new Class4_Sub1_Sub3_Sub5(arg0, 10, arg8, arg4, arg5, arg3, local9.anInt1259, true, null);
			}
			if (local192 != null) {
				arg2.method1955(arg7, arg5, arg3, local121, local23, local20, local192, arg1 == 11 ? 256 : 0, local149, local165);
			}
			if (local9.anInt1268 != 0) {
				arg6.method1649(local20, local9.aBoolean119, arg5, arg3, local23);
			}
		} else if (arg1 >= 12) {
			if (local9.anInt1259 == -1 && local9.anIntArray137 == null) {
				local192 = local9.method875(local137, arg1, local129, local94, arg8, local121);
			} else {
				local192 = new Class4_Sub1_Sub3_Sub5(arg0, arg1, arg8, arg4, arg5, arg3, local9.anInt1259, true, null);
			}
			arg2.method1955(arg7, arg5, arg3, local121, 1, 1, local192, 0, local149, local165);
			if (local9.anInt1268 != 0) {
				arg6.method1649(local20, local9.aBoolean119, arg5, arg3, local23);
			}
		} else if (arg1 == 0) {
			if (local9.anInt1259 == -1 && local9.anIntArray137 == null) {
				local192 = local9.method875(local137, 0, local129, local94, arg8, local121);
			} else {
				local192 = new Class4_Sub1_Sub3_Sub5(arg0, 0, arg8, arg4, arg5, arg3, local9.anInt1259, true, null);
			}
			arg2.method1921(arg7, arg5, arg3, local121, local192, null, Static115.anIntArray309[arg8], 0, local149, local165);
			if (local9.anInt1268 != 0) {
				arg6.method1655(local9.aBoolean119, arg1, arg5, arg3, arg8);
			}
		} else if (arg1 == 1) {
			if (local9.anInt1259 == -1 && local9.anIntArray137 == null) {
				local192 = local9.method875(local137, 1, local129, local94, arg8, local121);
			} else {
				local192 = new Class4_Sub1_Sub3_Sub5(arg0, 1, arg8, arg4, arg5, arg3, local9.anInt1259, true, null);
			}
			arg2.method1921(arg7, arg5, arg3, local121, local192, null, Static101.anIntArray291[arg8], 0, local149, local165);
			if (local9.anInt1268 != 0) {
				arg6.method1655(local9.aBoolean119, arg1, arg5, arg3, arg8);
			}
		} else {
			@Pc(550) Class4_Sub1_Sub3 local550;
			@Pc(520) int local520;
			if (arg1 == 2) {
				local520 = arg8 + 1 & 0x3;
				@Pc(540) Class4_Sub1_Sub3 local540;
				if (local9.anInt1259 == -1 && local9.anIntArray137 == null) {
					local540 = local9.method875(local137, 2, local129, local94, arg8 + 4, local121);
					local550 = local9.method875(local137, 2, local129, local94, local520, local121);
				} else {
					local540 = new Class4_Sub1_Sub3_Sub5(arg0, 2, arg8 + 4, arg4, arg5, arg3, local9.anInt1259, true, null);
					local550 = new Class4_Sub1_Sub3_Sub5(arg0, 2, local520, arg4, arg5, arg3, local9.anInt1259, true, null);
				}
				arg2.method1921(arg7, arg5, arg3, local121, local540, local550, Static115.anIntArray309[arg8], Static115.anIntArray309[local520], local149, local165);
				if (local9.anInt1268 != 0) {
					arg6.method1655(local9.aBoolean119, arg1, arg5, arg3, arg8);
				}
			} else if (arg1 == 3) {
				if (local9.anInt1259 == -1 && local9.anIntArray137 == null) {
					local192 = local9.method875(local137, 3, local129, local94, arg8, local121);
				} else {
					local192 = new Class4_Sub1_Sub3_Sub5(arg0, 3, arg8, arg4, arg5, arg3, local9.anInt1259, true, null);
				}
				arg2.method1921(arg7, arg5, arg3, local121, local192, null, Static101.anIntArray291[arg8], 0, local149, local165);
				if (local9.anInt1268 != 0) {
					arg6.method1655(local9.aBoolean119, arg1, arg5, arg3, arg8);
				}
			} else if (arg1 == 9) {
				if (local9.anInt1259 == -1 && local9.anIntArray137 == null) {
					local192 = local9.method875(local137, arg1, local129, local94, arg8, local121);
				} else {
					local192 = new Class4_Sub1_Sub3_Sub5(arg0, arg1, arg8, arg4, arg5, arg3, local9.anInt1259, true, null);
				}
				arg2.method1955(arg7, arg5, arg3, local121, 1, 1, local192, 0, local149, local165);
				if (local9.anInt1268 != 0) {
					arg6.method1649(local20, local9.aBoolean119, arg5, arg3, local23);
				}
			} else if (arg1 == 4) {
				if (local9.anInt1259 == -1 && local9.anIntArray137 == null) {
					local192 = local9.method875(local137, 4, local129, local94, arg8, local121);
				} else {
					local192 = new Class4_Sub1_Sub3_Sub5(arg0, 4, arg8, arg4, arg5, arg3, local9.anInt1259, true, null);
				}
				arg2.method1962(arg7, arg5, arg3, local121, local192, null, Static115.anIntArray309[arg8], 0, 0, 0, local149, local165);
			} else {
				@Pc(814) int local814;
				if (arg1 == 5) {
					local814 = arg2.method1957(arg7, arg5, arg3);
					local520 = 16;
					if (local814 != 0) {
						local520 = Static5.method45(local814 >> 14 & 0x7FFF).anInt1275;
					}
					if (local9.anInt1259 == -1 && local9.anIntArray137 == null) {
						local550 = local9.method875(local137, 4, local129, local94, arg8, local121);
					} else {
						local550 = new Class4_Sub1_Sub3_Sub5(arg0, 4, arg8, arg4, arg5, arg3, local9.anInt1259, true, null);
					}
					arg2.method1962(arg7, arg5, arg3, local121, local550, null, Static115.anIntArray309[arg8], 0, local520 * Static107.anIntArray298[arg8], local520 * Static69.anIntArray190[arg8], local149, local165);
				} else if (arg1 == 6) {
					local520 = 8;
					local814 = arg2.method1957(arg7, arg5, arg3);
					if (local814 != 0) {
						local520 = Static5.method45(local814 >> 14 & 0x7FFF).anInt1275 / 2;
					}
					if (local9.anInt1259 == -1 && local9.anIntArray137 == null) {
						local550 = local9.method875(local137, 4, local129, local94, arg8 + 4, local121);
					} else {
						local550 = new Class4_Sub1_Sub3_Sub5(arg0, 4, arg8 + 4, arg4, arg5, arg3, local9.anInt1259, true, null);
					}
					arg2.method1962(arg7, arg5, arg3, local121, local550, null, 256, arg8, Static120.anIntArray315[arg8] * local520, local520 * Static35.anIntArray95[arg8], local149, local165);
				} else if (arg1 == 7) {
					local814 = arg8 + 2 & 0x3;
					if (local9.anInt1259 == -1 && local9.anIntArray137 == null) {
						local192 = local9.method875(local137, 4, local129, local94, local814 + 4, local121);
					} else {
						local192 = new Class4_Sub1_Sub3_Sub5(arg0, 4, local814 + 4, arg4, arg5, arg3, local9.anInt1259, true, null);
					}
					arg2.method1962(arg7, arg5, arg3, local121, local192, null, 256, local814, 0, 0, local149, local165);
				} else if (arg1 == 8) {
					local520 = 8;
					local814 = arg2.method1957(arg7, arg5, arg3);
					if (local814 != 0) {
						local520 = Static5.method45(local814 >> 14 & 0x7FFF).anInt1275 / 2;
					}
					@Pc(1070) int local1070 = arg8 + 2 & 0x3;
					@Pc(1101) Class4_Sub1_Sub3 local1101;
					if (local9.anInt1259 == -1 && local9.anIntArray137 == null) {
						local550 = local9.method875(local137, 4, local129, local94, arg8 + 4, local121);
						local1101 = local9.method875(local137, 4, local129, local94, local1070 + 4, local121);
					} else {
						local550 = new Class4_Sub1_Sub3_Sub5(arg0, 4, arg8 + 4, arg4, arg5, arg3, local9.anInt1259, true, null);
						local1101 = new Class4_Sub1_Sub3_Sub5(arg0, 4, local1070 + 4, arg4, arg5, arg3, local9.anInt1259, true, null);
					}
					arg2.method1962(arg7, arg5, arg3, local121, local550, local1101, 256, arg8, local520 * Static120.anIntArray315[arg8], local520 * Static35.anIntArray95[arg8], local149, local165);
				}
			}
		}
	}

	@OriginalMember(owner = "client!jd", name = "d", descriptor = "(II)V")
	public static void method729(@OriginalArg(0) int arg0) {
		if (arg0 == -3) {
			Static95.method1192(Static90.aClass22_689, Static111.aClass22_829, Static96.aClass22_719);
		} else if (arg0 == -2) {
			Static95.method1192(Static111.aClass22_832, Static111.aClass22_820, Static67.aClass22_500);
		} else if (arg0 == -1) {
			Static95.method1192(Static53.aClass22_378, Static111.aClass22_831, Static96.aClass22_724);
		} else if (arg0 == 3) {
			Static95.method1192(Static111.aClass22_841, Static111.aClass22_844, Static26.aClass22_262);
		} else if (arg0 == 4) {
			Static95.method1192(Static4.aClass22_19, Static111.aClass22_851, Static15.aClass22_121);
		} else if (arg0 == 5) {
			Static95.method1192(Static126.aClass22_932, Static111.aClass22_816, Static111.aClass22_847);
		} else if (arg0 == 6) {
			Static95.method1192(Static50.aClass22_351, Static111.aClass22_857, Static31.aClass22_209);
		} else if (arg0 == 7) {
			Static95.method1192(Static111.aClass22_823, Static111.aClass22_858, Static4.aClass22_22);
		} else if (arg0 == 8) {
			Static95.method1192(Static122.aClass22_341, Static111.aClass22_850, Static44.aClass22_299);
		} else if (arg0 == 9) {
			Static95.method1192(Static45.aClass22_310, Static111.aClass22_834, Static104.aClass22_779);
		} else if (arg0 == 10) {
			Static95.method1192(Static122.aClass22_339, Static111.aClass22_854, Static111.aClass22_838);
		} else if (arg0 == 11) {
			Static95.method1192(Static25.aClass22_173, Static111.aClass22_855, Static67.aClass22_506);
		} else if (arg0 == 12) {
			Static95.method1192(Static33.aClass22_228, Static111.aClass22_836, Static68.aClass22_145);
		} else if (arg0 == 13) {
			Static95.method1192(Static131.aClass22_957, Static111.aClass22_818, Static96.aClass22_723);
		} else if (arg0 == 14) {
			Static95.method1192(Static64.aClass22_489, Static111.aClass22_861, Static24.aClass22_165);
		} else if (arg0 == 16) {
			Static95.method1192(Static54.aClass22_390, Static111.aClass22_830, Static1.aClass22_5);
		} else if (arg0 == 17) {
			Static95.method1192(Static79.aClass22_623, Static111.aClass22_860, Static131.aClass22_958);
		} else if (arg0 == 18) {
			Static95.method1192(Static71.aClass22_522, Static111.aClass22_842, Static53.aClass22_375);
		} else if (arg0 == 19) {
			Static95.method1192(Static56.aClass22_395, Static4.aClass22_21, Static117.aClass22_893);
		} else if (arg0 == 20) {
			Static95.method1192(Static124.aClass22_923, Static111.aClass22_845, Static96.aClass22_720);
		} else if (arg0 == 22) {
			Static95.method1192(Static61.aClass22_477, Static111.aClass22_856, Static79.aClass22_621);
		} else if (arg0 == 23) {
			Static95.method1192(Static56.aClass22_396, Static111.aClass22_849, Static24.aClass22_164);
		} else if (arg0 == 24) {
			Static95.method1192(Static73.aClass22_543, Static111.aClass22_825, Static85.aClass22_639);
		} else if (arg0 == 25) {
			Static95.method1192(Static76.aClass22_563, Static111.aClass22_819, Static96.aClass22_721);
		} else if (arg0 == 26) {
			Static95.method1192(Static46.aClass22_320, Static111.aClass22_835, Static108.aClass22_808);
		} else if (arg0 == 27) {
			Static95.method1192(Static111.aClass22_817, Static111.aClass22_824, Static72.aClass22_532);
		} else {
			Static95.method1192(Static90.aClass22_696, Static111.aClass22_822, Static96.aClass22_722);
		}
		Static46.method888(10);
	}
}
