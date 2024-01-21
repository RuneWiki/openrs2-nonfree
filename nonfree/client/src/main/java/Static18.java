import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static18 {

	@OriginalMember(owner = "client!da", name = "m", descriptor = "Z")
	public static boolean aBoolean25;

	@OriginalMember(owner = "client!da", name = "s", descriptor = "[Lclient!ad;")
	public static Class4[] aClass4Array1;

	@OriginalMember(owner = "client!da", name = "u", descriptor = "Lclient!sf;")
	public static Class5 aClass5_18;

	@OriginalMember(owner = "client!da", name = "c", descriptor = "[I")
	public static int[] anIntArray82 = new int[5];

	@OriginalMember(owner = "client!da", name = "k", descriptor = "Lclient!sc;")
	public static Class66 aClass66_346 = Static106.method1849("headicons_prayer");

	@OriginalMember(owner = "client!da", name = "v", descriptor = "Lclient!sc;")
	public static Class66 aClass66_347 = Static106.method1849("<col=ffffff>");

	@OriginalMember(owner = "client!da", name = "y", descriptor = "Lclient!sc;")
	public static Class66 aClass66_348 = Static106.method1849("da dieser Computer gegen unsere ");

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(I)V")
	public static void method460() {
		aClass66_348 = null;
		aClass5_18 = null;
		anIntArray82 = null;
		aClass4Array1 = null;
		aClass66_346 = null;
		aClass66_347 = null;
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IIIIIILclient!be;ILclient!da;I)V")
	public static void method465(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class9 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) Class13 arg7, @OriginalArg(9) int arg8) {
		@Pc(9) Class1_Sub1_Sub9 local9 = Static122.method1995(arg3);
		@Pc(20) int local20;
		@Pc(23) int local23;
		if (arg4 == 1 || arg4 == 3) {
			local20 = local9.anInt2083;
			local23 = local9.anInt2065;
		} else {
			local20 = local9.anInt2065;
			local23 = local9.anInt2083;
		}
		@Pc(53) int local53;
		@Pc(47) int local47;
		if (arg2 + local20 <= 104) {
			local47 = (local20 + 1 >> 1) + arg2;
			local53 = (local20 >> 1) + arg2;
		} else {
			local47 = arg2 + 1;
			local53 = arg2;
		}
		@Pc(80) int local80;
		@Pc(74) int local74;
		if (local23 + arg6 <= 104) {
			local74 = (local23 + 1 >> 1) + arg6;
			local80 = (local23 >> 1) + arg6;
		} else {
			local74 = arg6 + 1;
			local80 = arg6;
		}
		@Pc(92) int[][] local92 = Static44.anIntArrayArrayArray3[arg1];
		@Pc(119) int local119 = local92[local53][local80] + local92[local47][local80] + local92[local53][local74] + local92[local47][local74] >> 2;
		@Pc(128) int local128 = (arg6 << 7) + (local23 << 6);
		@Pc(136) int local136 = (arg2 << 7) + (local20 << 6);
		@Pc(143) int local143 = (arg4 << 6) + arg8;
		if (local9.anInt2054 == 1) {
			local143 += 256;
		}
		@Pc(161) int local161 = arg2 + (arg6 << 7) + (arg3 << 14) + 1073741824;
		if (local9.anInt2089 == 0) {
			local161 += Integer.MIN_VALUE;
		}
		@Pc(188) Class1_Sub1_Sub1 local188;
		if (arg8 == 22) {
			if (local9.anInt2075 == -1 && local9.anIntArray338 == null) {
				local188 = local9.method1445(local119, local92, local128, local136, 22, arg4);
			} else {
				local188 = new Class1_Sub1_Sub1_Sub4(arg3, 22, arg4, arg1, arg2, arg6, local9.anInt2075, true, null);
			}
			arg5.method335(arg0, arg2, arg6, local119, local188, local161, local143);
			if (local9.anInt2084 == 1) {
				arg7.method474(arg6, arg2);
			}
		} else if (arg8 == 10 || arg8 == 11) {
			if (local9.anInt2075 == -1 && local9.anIntArray338 == null) {
				local188 = local9.method1445(local119, local92, local128, local136, 10, arg4);
			} else {
				local188 = new Class1_Sub1_Sub1_Sub4(arg3, 10, arg4, arg1, arg2, arg6, local9.anInt2075, true, null);
			}
			if (local188 != null) {
				arg5.method320(arg0, arg2, arg6, local119, local20, local23, local188, arg8 == 11 ? 256 : 0, local161, local143);
			}
			if (local9.anInt2084 != 0) {
				arg7.method476(local23, arg2, local20, arg6, local9.aBoolean85);
			}
		} else if (arg8 >= 12) {
			if (local9.anInt2075 == -1 && local9.anIntArray338 == null) {
				local188 = local9.method1445(local119, local92, local128, local136, arg8, arg4);
			} else {
				local188 = new Class1_Sub1_Sub1_Sub4(arg3, arg8, arg4, arg1, arg2, arg6, local9.anInt2075, true, null);
			}
			arg5.method320(arg0, arg2, arg6, local119, 1, 1, local188, 0, local161, local143);
			if (local9.anInt2084 != 0) {
				arg7.method476(local23, arg2, local20, arg6, local9.aBoolean85);
			}
		} else if (arg8 == 0) {
			if (local9.anInt2075 == -1 && local9.anIntArray338 == null) {
				local188 = local9.method1445(local119, local92, local128, local136, 0, arg4);
			} else {
				local188 = new Class1_Sub1_Sub1_Sub4(arg3, 0, arg4, arg1, arg2, arg6, local9.anInt2075, true, null);
			}
			arg5.method321(arg0, arg2, arg6, local119, local188, null, Static71.anIntArray319[arg4], 0, local161, local143);
			if (local9.anInt2084 != 0) {
				arg7.method471(arg2, arg6, arg4, arg8, local9.aBoolean85);
			}
		} else if (arg8 == 1) {
			if (local9.anInt2075 == -1 && local9.anIntArray338 == null) {
				local188 = local9.method1445(local119, local92, local128, local136, 1, arg4);
			} else {
				local188 = new Class1_Sub1_Sub1_Sub4(arg3, 1, arg4, arg1, arg2, arg6, local9.anInt2075, true, null);
			}
			arg5.method321(arg0, arg2, arg6, local119, local188, null, Static94.anIntArray406[arg4], 0, local161, local143);
			if (local9.anInt2084 != 0) {
				arg7.method471(arg2, arg6, arg4, arg8, local9.aBoolean85);
			}
		} else {
			@Pc(522) Class1_Sub1_Sub1 local522;
			if (arg8 == 2) {
				@Pc(501) int local501 = arg4 + 1 & 0x3;
				@Pc(532) Class1_Sub1_Sub1 local532;
				if (local9.anInt2075 == -1 && local9.anIntArray338 == null) {
					local522 = local9.method1445(local119, local92, local128, local136, 2, arg4 + 4);
					local532 = local9.method1445(local119, local92, local128, local136, 2, local501);
				} else {
					local522 = new Class1_Sub1_Sub1_Sub4(arg3, 2, arg4 + 4, arg1, arg2, arg6, local9.anInt2075, true, null);
					local532 = new Class1_Sub1_Sub1_Sub4(arg3, 2, local501, arg1, arg2, arg6, local9.anInt2075, true, null);
				}
				arg5.method321(arg0, arg2, arg6, local119, local522, local532, Static71.anIntArray319[arg4], Static71.anIntArray319[local501], local161, local143);
				if (local9.anInt2084 != 0) {
					arg7.method471(arg2, arg6, arg4, arg8, local9.aBoolean85);
				}
			} else if (arg8 == 3) {
				if (local9.anInt2075 == -1 && local9.anIntArray338 == null) {
					local522 = local9.method1445(local119, local92, local128, local136, 3, arg4);
				} else {
					local522 = new Class1_Sub1_Sub1_Sub4(arg3, 3, arg4, arg1, arg2, arg6, local9.anInt2075, true, null);
				}
				arg5.method321(arg0, arg2, arg6, local119, local522, null, Static94.anIntArray406[arg4], 0, local161, local143);
				if (local9.anInt2084 != 0) {
					arg7.method471(arg2, arg6, arg4, arg8, local9.aBoolean85);
				}
			} else if (arg8 == 9) {
				if (local9.anInt2075 == -1 && local9.anIntArray338 == null) {
					local522 = local9.method1445(local119, local92, local128, local136, arg8, arg4);
				} else {
					local522 = new Class1_Sub1_Sub1_Sub4(arg3, arg8, arg4, arg1, arg2, arg6, local9.anInt2075, true, null);
				}
				arg5.method320(arg0, arg2, arg6, local119, 1, 1, local522, 0, local161, local143);
				if (local9.anInt2084 != 0) {
					arg7.method476(local23, arg2, local20, arg6, local9.aBoolean85);
				}
			} else if (arg8 == 4) {
				if (local9.anInt2075 == -1 && local9.anIntArray338 == null) {
					local522 = local9.method1445(local119, local92, local128, local136, 4, arg4);
				} else {
					local522 = new Class1_Sub1_Sub1_Sub4(arg3, 4, arg4, arg1, arg2, arg6, local9.anInt2075, true, null);
				}
				arg5.method342(arg0, arg2, arg6, local119, local522, null, Static71.anIntArray319[arg4], 0, 0, 0, local161, local143);
			} else {
				@Pc(795) int local795;
				@Pc(801) int local801;
				@Pc(834) Class1_Sub1_Sub1 local834;
				if (arg8 == 5) {
					local795 = 16;
					local801 = arg5.method337(arg0, arg2, arg6);
					if (local801 != 0) {
						local795 = Static122.method1995(local801 >> 14 & 0x7FFF).anInt2088;
					}
					if (local9.anInt2075 == -1 && local9.anIntArray338 == null) {
						local834 = local9.method1445(local119, local92, local128, local136, 4, arg4);
					} else {
						local834 = new Class1_Sub1_Sub1_Sub4(arg3, 4, arg4, arg1, arg2, arg6, local9.anInt2075, true, null);
					}
					arg5.method342(arg0, arg2, arg6, local119, local834, null, Static71.anIntArray319[arg4], 0, local795 * Static87.anIntArray387[arg4], Static102.anIntArray427[arg4] * local795, local161, local143);
				} else if (arg8 == 6) {
					local795 = 8;
					local801 = arg5.method337(arg0, arg2, arg6);
					if (local801 != 0) {
						local795 = Static122.method1995(local801 >> 14 & 0x7FFF).anInt2088 / 2;
					}
					if (local9.anInt2075 == -1 && local9.anIntArray338 == null) {
						local834 = local9.method1445(local119, local92, local128, local136, 4, arg4 + 4);
					} else {
						local834 = new Class1_Sub1_Sub1_Sub4(arg3, 4, arg4 + 4, arg1, arg2, arg6, local9.anInt2075, true, null);
					}
					arg5.method342(arg0, arg2, arg6, local119, local834, null, 256, arg4, Static84.anIntArray372[arg4] * local795, Static48.anIntArray227[arg4] * local795, local161, local143);
				} else if (arg8 == 7) {
					local801 = arg4 + 2 & 0x3;
					if (local9.anInt2075 == -1 && local9.anIntArray338 == null) {
						local522 = local9.method1445(local119, local92, local128, local136, 4, local801 + 4);
					} else {
						local522 = new Class1_Sub1_Sub1_Sub4(arg3, 4, local801 + 4, arg1, arg2, arg6, local9.anInt2075, true, null);
					}
					arg5.method342(arg0, arg2, arg6, local119, local522, null, 256, local801, 0, 0, local161, local143);
				} else if (arg8 == 8) {
					local795 = 8;
					local801 = arg5.method337(arg0, arg2, arg6);
					if (local801 != 0) {
						local795 = Static122.method1995(local801 >> 14 & 0x7FFF).anInt2088 / 2;
					}
					@Pc(1050) int local1050 = arg4 + 2 & 0x3;
					@Pc(1090) Class1_Sub1_Sub1 local1090;
					if (local9.anInt2075 == -1 && local9.anIntArray338 == null) {
						local834 = local9.method1445(local119, local92, local128, local136, 4, arg4 + 4);
						local1090 = local9.method1445(local119, local92, local128, local136, 4, local1050 + 4);
					} else {
						local834 = new Class1_Sub1_Sub1_Sub4(arg3, 4, arg4 + 4, arg1, arg2, arg6, local9.anInt2075, true, null);
						local1090 = new Class1_Sub1_Sub1_Sub4(arg3, 4, local1050 + 4, arg1, arg2, arg6, local9.anInt2075, true, null);
					}
					arg5.method342(arg0, arg2, arg6, local119, local834, local1090, 256, arg4, Static84.anIntArray372[arg4] * local795, Static48.anIntArray227[arg4] * local795, local161, local143);
				}
			}
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(II)V")
	public static void method468(@OriginalArg(1) int arg0) {
		if (arg0 == Static11.anInt398) {
			return;
		}
		if (Static11.anInt398 == 0) {
			Static119.method1963();
		}
		if (arg0 == 20 || arg0 == 40) {
			Static16.anInt487 = 0;
			Static133.anInt2941 = 0;
			Static126.anInt2880 = 0;
		}
		if (arg0 != 20 && arg0 != 40 && Static85.aClass34_5 != null) {
			Static85.aClass34_5.method1104();
			Static85.aClass34_5 = null;
		}
		if (Static11.anInt398 == 25) {
			Static122.anInt2829 = 1;
			Static39.anInt985 = 0;
			Static20.anInt621 = 1;
			Static70.anInt708 = 0;
			Static17.anInt563 = 0;
		}
		if (arg0 == 5 || arg0 == 10 || arg0 == 20) {
			Static85.method1540(Static9.aClass5_Sub1_6, Static104.aCanvas1, Static112.aClass5_Sub1_26);
		} else {
			Static81.method1499();
		}
		Static11.anInt398 = arg0;
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(B)Z")
	public static boolean method469() {
		@Pc(5) Class56 local5 = Static117.aClass56_1;
		synchronized (Static117.aClass56_1) {
			if (Static123.anInt2836 == Static98.anInt2484) {
				return false;
			} else {
				Static2.anInt85 = Static75.anIntArray342[Static123.anInt2836];
				Static23.anInt666 = Static109.anIntArray446[Static123.anInt2836];
				Static123.anInt2836 = Static123.anInt2836 + 1 & 0x7F;
				return true;
			}
		}
	}

	@OriginalMember(owner = "client!da", name = "b", descriptor = "(B)V")
	public static void method472() {
		Static63.anInt1927 = 0;
		@Pc(18) int local18 = Static48.anInt1496 + (Static126.aClass1_Sub1_Sub1_Sub5_Sub2_1.anInt1261 >> 7);
		@Pc(25) int local25 = Static52.anInt1603 + (Static126.aClass1_Sub1_Sub1_Sub5_Sub2_1.anInt1271 >> 7);
		if (local18 >= 3053 && local18 <= 3156 && local25 >= 3056 && local25 <= 3136) {
			Static63.anInt1927 = 1;
		}
		if (local18 >= 3072 && local18 <= 3118 && local25 >= 9492 && local25 <= 9535) {
			Static63.anInt1927 = 1;
		}
		if (Static63.anInt1927 == 1 && local18 >= 3139 && local18 <= 3199 && local25 >= 3008 && local25 <= 3062) {
			Static63.anInt1927 = 0;
		}
	}
}
