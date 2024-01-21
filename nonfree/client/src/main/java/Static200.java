import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static200 {

	@OriginalMember(owner = "client!vb", name = "B", descriptor = "I")
	public static int anInt3968;

	@OriginalMember(owner = "client!vb", name = "C", descriptor = "J")
	public static long aLong137 = 0L;

	@OriginalMember(owner = "client!vb", name = "G", descriptor = "I")
	public static int anInt3971 = 0;

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(II)I")
	public static int method3027(@OriginalArg(1) int arg0) {
		return arg0 >> 11 & 0x3F;
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(ILclient!ae;I)I")
	public static int method3028(@OriginalArg(1) Class5 arg0, @OriginalArg(2) int arg1) {
		if (arg0.anIntArrayArray1 == null || arg0.anIntArrayArray1.length <= arg1) {
			return -2;
		}
		try {
			@Pc(25) int local25 = 0;
			@Pc(30) int[] local30 = arg0.anIntArrayArray1[arg1];
			@Pc(32) int local32 = 0;
			@Pc(34) byte local34 = 0;
			while (true) {
				@Pc(36) int local36 = 0;
				@Pc(41) int local41 = local30[local32++];
				@Pc(43) byte local43 = 0;
				if (local41 == 0) {
					return local25;
				}
				if (local41 == 1) {
					local36 = Static60.anIntArray208[local30[local32++]];
				}
				if (local41 == 2) {
					local36 = Static156.anIntArray404[local30[local32++]];
				}
				if (local41 == 3) {
					local36 = Static118.anIntArray268[local30[local32++]];
				}
				if (local41 == 15) {
					local43 = 1;
				}
				if (local41 == 16) {
					local43 = 2;
				}
				if (local41 == 17) {
					local43 = 3;
				}
				@Pc(106) int local106;
				@Pc(117) Class5 local117;
				@Pc(122) int local122;
				@Pc(135) int local135;
				if (local41 == 4) {
					local106 = local30[local32++] << 16;
					@Pc(113) int local113 = local106 + local30[local32++];
					local117 = Static74.method1401(local113);
					local122 = local30[local32++];
					if (local122 != -1 && (!Static113.method1987(local122).aBoolean25 || Static116.aBoolean127)) {
						for (local135 = 0; local135 < local117.anIntArray9.length; local135++) {
							if (local122 + 1 == local117.anIntArray9[local135]) {
								local36 += local117.anIntArray5[local135];
							}
						}
					}
				}
				if (local41 == 5) {
					local36 = Static14.anIntArray235[local30[local32++]];
				}
				if (local41 == 6) {
					local36 = Class2_Sub19.anIntArray265[Static156.anIntArray404[local30[local32++]] - 1];
				}
				if (local41 == 7) {
					local36 = Static14.anIntArray235[local30[local32++]] * 100 / 46875;
				}
				if (local41 == 8) {
					local36 = Static54.aClass24_Sub4_Sub1_1.anInt2299;
				}
				if (local41 == 9) {
					for (local106 = 0; local106 < 25; local106++) {
						if (Static155.aBooleanArray20[local106]) {
							local36 += Static156.anIntArray404[local106];
						}
					}
				}
				if (local41 == 10) {
					local106 = local30[local32++] << 16;
					local106 += local30[local32++];
					local117 = Static74.method1401(local106);
					local122 = local30[local32++];
					if (local122 != -1 && (!Static113.method1987(local122).aBoolean25 || Static116.aBoolean127)) {
						for (local135 = 0; local135 < local117.anIntArray9.length; local135++) {
							if (local122 + 1 == local117.anIntArray9[local135]) {
								local36 = 999999999;
								break;
							}
						}
					}
				}
				if (local41 == 11) {
					local36 = Static114.anInt2624;
				}
				if (local41 == 12) {
					local36 = Static33.anInt872;
				}
				if (local41 == 13) {
					local106 = Static14.anIntArray235[local30[local32++]];
					@Pc(329) int local329 = local30[local32++];
					local36 = (0x1 << local329 & local106) == 0 ? 0 : 1;
				}
				if (local41 == 14) {
					local106 = local30[local32++];
					local36 = Static199.method3012(local106);
				}
				if (local41 == 18) {
					local36 = Static2.anInt57 + (Static54.aClass24_Sub4_Sub1_1.anInt3316 >> 7);
				}
				if (local41 == 19) {
					local36 = (Static54.aClass24_Sub4_Sub1_1.anInt3349 >> 7) + Static123.anInt2755;
				}
				if (local41 == 20) {
					local36 = local30[local32++];
				}
				if (local43 == 0) {
					if (local34 == 0) {
						local25 += local36;
					}
					if (local34 == 1) {
						local25 -= local36;
					}
					if (local34 == 2 && local36 != 0) {
						local25 /= local36;
					}
					if (local34 == 3) {
						local25 *= local36;
					}
					local34 = 0;
				} else {
					local34 = local43;
				}
			}
		} catch (@Pc(434) Exception local434) {
			return -1;
		}
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(ZIIIILclient!ki;)V")
	public static void method3029(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class2_Sub2_Sub16 arg4) {
		if (Static194.anInt3846 >= 50 || (arg4.anIntArray231 == null || arg2 >= arg4.anIntArray231.length)) {
			return;
		}
		@Pc(23) int local23 = arg4.anIntArray231[arg2];
		if (local23 == 0) {
			return;
		}
		@Pc(35) int local35 = local23 >> 4 & 0x7;
		@Pc(39) int local39 = local23 >> 8;
		@Pc(43) int local43 = local23 & 0xF;
		if (local43 == 0) {
			if (arg0) {
				Static105.method1825(local39, local35, 0);
			}
		} else if (Static89.anInt4291 != 0) {
			Static129.anIntArray283[Static194.anInt3846] = local39;
			Static140.anIntArray293[Static194.anInt3846] = local35;
			Static79.anIntArray170[Static194.anInt3846] = 0;
			@Pc(80) int local80 = (arg3 - 64) / 128;
			Static86.aClass90Array1[Static194.anInt3846] = null;
			@Pc(90) int local90 = (arg1 - 64) / 128;
			Static201.anIntArray392[Static194.anInt3846] = (local80 << 16) + (local90 << 8) + local43;
			Static194.anInt3846++;
		}
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "([BI)Lclient!od;")
	public static Class2_Sub2_Sub5 method3030(@OriginalArg(0) byte[] arg0) {
		if (arg0 == null) {
			return null;
		} else {
			@Pc(22) Class2_Sub2_Sub5_Sub1_Sub1 local22 = new Class2_Sub2_Sub5_Sub1_Sub1(arg0, Static28.anIntArray61, Static124.anIntArray251, Static163.anIntArray314, Static131.anIntArray284, Static151.aByteArrayArray14);
			Static17.method372();
			return local22;
		}
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(ILclient!ae;)Z")
	public static boolean method3031(@OriginalArg(1) Class5 arg0) {
		if (arg0.anInt180 == 205) {
			Static111.anInt2577 = 250;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "([BB)[B")
	public static byte[] method3032(@OriginalArg(0) byte[] arg0) {
		@Pc(13) int local13 = arg0.length;
		@Pc(16) byte[] local16 = new byte[local13];
		Static222.method2224(arg0, 0, local16, 0, local13);
		return local16;
	}
}
