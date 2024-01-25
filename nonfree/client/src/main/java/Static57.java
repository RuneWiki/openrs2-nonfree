import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static57 {

	@OriginalMember(owner = "client!dj", name = "o", descriptor = "F")
	public static float aFloat20;

	@OriginalMember(owner = "client!dj", name = "B", descriptor = "I")
	public static int anInt1387;

	@OriginalMember(owner = "client!dj", name = "i", descriptor = "Ljava/lang/String;")
	public static String aString81 = "K";

	@OriginalMember(owner = "client!dj", name = "j", descriptor = "[I")
	public static final int[] anIntArray65 = new int[128];

	@OriginalMember(owner = "client!dj", name = "r", descriptor = "[I")
	public static final int[] anIntArray66 = new int[13];

	@OriginalMember(owner = "client!dj", name = "x", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray6 = null;

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(IIIIILclient!jf;II)V")
	public static void method1218(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class96 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (Static195.aBoolean271) {
			Static311.anInt6463 = 32;
		} else {
			Static311.anInt6463 = 0;
		}
		Static195.aBoolean271 = false;
		@Pc(140) int local140;
		if (Static160.anInt3228 != 0) {
			if (arg1 <= arg6 && arg1 + 16 > arg6 && arg5 >= arg0 && arg5 < arg0 + 16) {
				arg4.anInt2904 -= 4;
				Static336.method4719(arg4);
			} else if (arg1 <= arg6 && arg1 + 16 > arg6 && arg2 + arg0 - 16 <= arg5 && arg2 + arg0 > arg5) {
				arg4.anInt2904 += 4;
				Static336.method4719(arg4);
			} else if (arg1 - Static311.anInt6463 <= arg6 && arg6 < Static311.anInt6463 + arg1 + 16 && arg5 >= arg0 + 16 && arg5 < arg0 + arg2 - 16) {
				local140 = arg2 * (arg2 - 32) / arg3;
				if (local140 < 8) {
					local140 = 8;
				}
				@Pc(157) int local157 = arg5 - arg0 - local140 / 2 - 16;
				@Pc(164) int local164 = arg2 - local140 - 32;
				arg4.anInt2904 = local157 * (arg3 - arg2) / local164;
				Static336.method4719(arg4);
				Static195.aBoolean271 = true;
			}
		}
		if (Static175.anInt3555 == 0) {
			return;
		}
		local140 = arg4.anInt2943;
		if (arg1 - local140 <= arg6 && arg0 <= arg5 && arg6 < arg1 + 16 && arg5 <= arg0 + arg2) {
			arg4.anInt2904 += Static175.anInt3555 * 45;
			Static336.method4719(arg4);
			return;
		}
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(II)V")
	public static void method1219(@OriginalArg(1) int arg0) {
		if (arg0 == 0) {
			return;
		}
		if (arg0 == 1) {
			Static66.method1395();
		} else if (arg0 == 2) {
			Static44.method3567();
		} else if (arg0 == 3) {
			Static253.method4433();
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(I[[[BIILclient!en;IIIIBIII)V")
	public static void method1220(@OriginalArg(0) int arg0, @OriginalArg(1) byte[][][] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class59 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11) {
		if (arg2 == 0 || arg3 == 0) {
			return;
		}
		if (arg2 == 9) {
			arg2 = 1;
			arg8 = arg8 + 1 & 0x3;
		}
		if (arg2 == 10) {
			arg2 = 1;
			arg8 = arg8 + 3 & 0x3;
		}
		if (arg2 == 11) {
			arg2 = 8;
			arg8 = arg8 + 3 & 0x3;
		}
		arg4.method4882(arg6, arg10, arg7, arg11, arg0, arg9, arg1[arg2 - 1][arg8], arg3, arg5);
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(IILclient!en;Lclient!ac;[[B[[B[[BZLclient!ac;I[[BI[[I)V")
	public static void method1221(@OriginalArg(0) int arg0, @OriginalArg(2) Class59 arg1, @OriginalArg(3) Class3 arg2, @OriginalArg(4) byte[][] arg3, @OriginalArg(5) byte[][] arg4, @OriginalArg(6) byte[][] arg5, @OriginalArg(7) boolean arg6, @OriginalArg(8) Class3 arg7, @OriginalArg(9) int arg8, @OriginalArg(10) byte[][] arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int[][] arg11) {
		for (@Pc(3) int local3 = 0; local3 < arg0; local3++) {
			for (@Pc(12) int local12 = 0; local12 < arg10; local12++) {
				if (Static26.method628() || Static289.method4920(local3, Static9.anInt297, arg8, local12)) {
					@Pc(32) byte local32 = arg3[local3][local12];
					@Pc(38) byte local38 = arg5[local3][local12];
					@Pc(46) int local46 = arg4[local3][local12] & 0xFF;
					@Pc(54) int local54 = arg9[local3][local12] & 0xFF;
					@Pc(64) Class135 local64 = local46 == 0 ? null : Static301.method5317(local46 - 1);
					@Pc(77) Class71 local77 = local54 == 0 ? null : Static248.method4359(local54 - 1);
					@Pc(79) int local79 = 0;
					@Pc(81) int local81 = 0;
					if (local32 != 0) {
						local79 = local77 == null ? 0 : Static294.anIntArray426[local32];
						local81 = local64 == null ? 0 : Static307.anIntArray487[local32];
					} else if (local64 != null) {
						local81 = Static307.anIntArray487[local32];
					} else if (local77 != null) {
						local79 = Static307.anIntArray487[local32];
					}
					@Pc(123) int local123 = local81 + local79;
					@Pc(125) int local125 = 0;
					if (local123 != 0) {
						@Pc(133) int[] local133 = new int[local123];
						@Pc(136) int[] local136 = new int[local123];
						@Pc(139) int[] local139 = new int[local123];
						@Pc(142) int[] local142 = new int[local123];
						@Pc(144) boolean local144 = false;
						@Pc(168) int local168;
						@Pc(174) int local174;
						if (local64 == null || local64.anInt3954 == -1 && local64.anInt3941 == -1 && local64.anInt3944 == -1) {
							for (local168 = 0; local168 < local81; local168++) {
								local133[local125] = -1;
								local125++;
							}
						} else {
							local168 = arg1.method4862() ? local64.anInt3944 : local64.anInt3951;
							if (!Static67.aBoolean110) {
								local168 = -1;
							}
							for (local174 = 0; local174 < local81; local174++) {
								local139[local125] = local168;
								local142[local125] = local64.anInt3942;
								if (local64.anInt3954 == -1) {
									local133[local125] = -1;
								} else {
									local133[local125] = local64.anInt3954;
								}
								if (local64.anInt3941 == -1) {
									local136[local125] = -1;
								} else {
									local136[local125] = local64.anInt3941;
									local144 = true;
								}
								local125++;
							}
							if (!arg6 && arg8 == 0) {
								Static156.method2910(local3, local12, local64.anInt3949, local64.anInt3948 * 8);
							}
						}
						if (!local144) {
							local136 = null;
						}
						if (local77 == null) {
							for (local168 = 0; local168 < local79; local168++) {
								local133[local125] = -1;
								local125++;
							}
						} else {
							local168 = local77.anInt2214;
							if (!Static67.aBoolean110) {
								local168 = -1;
							}
							for (local174 = 0; local174 < local79; local174++) {
								local139[local125] = local168;
								local142[local125] = local77.anInt2216;
								local133[local125] = arg11[local3][local12];
								if (local136 != null) {
									local136[local125] = -1;
								}
								local125++;
							}
						}
						local168 = Static323.anIntArray526.length;
						@Pc(328) int[] local328 = arg6 ? new int[local168] : null;
						@Pc(331) int[] local331 = new int[local168];
						@Pc(334) int[] local334 = new int[local168];
						@Pc(342) int local342;
						@Pc(346) int local346;
						@Pc(433) int local433;
						@Pc(441) int local441;
						for (@Pc(336) int local336 = 0; local336 < local168; local336++) {
							local342 = Static323.anIntArray526[local336];
							local346 = Static230.anIntArray324[local336];
							if (local38 == 0) {
								local331[local336] = local342;
								local334[local336] = local346;
							} else if (local38 == 1) {
								local331[local336] = local346;
								local334[local336] = 128 - local342;
							} else if (local38 == 2) {
								local331[local336] = 128 - local342;
								local334[local336] = 128 - local346;
							} else if (local38 == 3) {
								local331[local336] = 128 - local346;
								local334[local336] = local342;
							}
							if (arg6 && Static129.aBooleanArrayArray20[local32][local336]) {
								local433 = (local3 << 7) + local331[local336];
								local441 = local334[local336] + (local12 << 7);
								local328[local336] = arg2.method5639(local433, local441) - arg7.method5639(local433, local441);
							}
						}
						local342 = arg7.method5638(local3, local12);
						local346 = arg7.method5638(local3 + 1, local12);
						local433 = arg7.method5638(local3 + 1, local12 + 1);
						local441 = arg7.method5638(local3, local12 + 1);
						if (arg8 > 0) {
							@Pc(493) boolean local493 = true;
							if (local54 == 0 && local32 != 0) {
								local493 = false;
							}
							if (local46 > 0 && local64 != null && !local64.aBoolean281) {
								local493 = false;
							}
							if (local493 && local346 == local342 && local433 == local342 && local342 == local441) {
								Static296.aByteArrayArrayArray26[arg8][local3][local12] = (byte) (Static296.aByteArrayArrayArray26[arg8][local3][local12] | 0x4);
							}
						}
						@Pc(548) int local548 = 0;
						@Pc(550) int local550 = 0;
						if (arg6) {
							local548 = Static261.method4487(local3, local12);
							local550 = Static241.method4106(local3, local12);
						}
						arg7.method5632(local3, local12, local331, local328, local334, Static270.anIntArrayArray41[local32], Static238.anIntArrayArray38[local32], Static334.anIntArrayArray57[local32], local133, local136, local139, local142, local548, local550);
						Static168.method3164(arg8, local3, local12);
					}
				}
			}
		}
	}
}
