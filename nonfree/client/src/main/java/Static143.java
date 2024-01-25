import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static143 {

	@OriginalMember(owner = "client!jn", name = "G", descriptor = "I")
	public static int anInt2978;

	@OriginalMember(owner = "client!jn", name = "i", descriptor = "F")
	public static float aFloat21 = 0.0F;

	@OriginalMember(owner = "client!jn", name = "m", descriptor = "Lclient!k;")
	public static Interface6 anInterface6_1 = null;

	@OriginalMember(owner = "client!jn", name = "s", descriptor = "Ljava/lang/String;")
	public static String aString105 = "Continue";

	@OriginalMember(owner = "client!jn", name = "B", descriptor = "Ljava/lang/String;")
	public static String aString106 = " is already on your friend list.";

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(Lclient!ck;[[BZ[[BLclient!ii;[[BI[[ILclient!ck;[[BIBI)V")
	public static void method2556(@OriginalArg(0) Class12 arg0, @OriginalArg(1) byte[][] arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) byte[][] arg3, @OriginalArg(4) Class105 arg4, @OriginalArg(5) byte[][] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[][] arg7, @OriginalArg(8) Class12 arg8, @OriginalArg(9) byte[][] arg9, @OriginalArg(10) int arg10, @OriginalArg(12) int arg11) {
		for (@Pc(3) int local3 = 0; local3 < arg11; local3++) {
			for (@Pc(7) int local7 = 0; local7 < arg6; local7++) {
				if (Static25.method408() || Static217.method739(arg10, local7, local3, Static98.anInt1912)) {
					@Pc(27) byte local27 = arg9[local3][local7];
					@Pc(33) byte local33 = arg1[local3][local7];
					@Pc(41) int local41 = arg5[local3][local7] & 0xFF;
					@Pc(49) int local49 = arg3[local3][local7] & 0xFF;
					@Pc(62) Class175 local62 = local41 == 0 ? null : Static338.method5610(local41 - 1);
					@Pc(72) Class107 local72 = local49 == 0 ? null : Static1.method14(local49 - 1);
					@Pc(74) int local74 = 0;
					@Pc(76) int local76 = 0;
					if (local27 != 0) {
						local76 = local62 == null ? 0 : Static330.anIntArray649[local27];
						local74 = local72 == null ? 0 : Static22.anIntArray22[local27];
					} else if (local62 != null) {
						local76 = Static330.anIntArray649[local27];
					} else if (local72 != null) {
						local74 = Static330.anIntArray649[local27];
					}
					@Pc(117) int local117 = local76 + local74;
					@Pc(119) int local119 = 0;
					if (local117 != 0) {
						@Pc(127) int[] local127 = new int[local117];
						@Pc(130) int[] local130 = new int[local117];
						@Pc(133) int[] local133 = new int[local117];
						@Pc(136) int[] local136 = new int[local117];
						@Pc(138) boolean local138 = false;
						@Pc(157) int local157;
						@Pc(185) int local185;
						if (local62 == null || local62.anInt5263 == -1 && local62.anInt5273 == -1 && local62.anInt5275 == -1) {
							for (local157 = 0; local157 < local76; local157++) {
								local127[local119] = -1;
								local119++;
							}
						} else {
							local157 = arg4.method4259() ? local62.anInt5275 : local62.anInt5265;
							if (!Static329.aBoolean533) {
								local157 = -1;
							}
							for (local185 = 0; local185 < local76; local185++) {
								local133[local119] = local157;
								local136[local119] = local62.anInt5268;
								if (local62.anInt5263 == -1) {
									local127[local119] = -1;
								} else {
									local127[local119] = local62.anInt5263;
								}
								if (local62.anInt5273 == -1) {
									local130[local119] = -1;
								} else {
									local130[local119] = local62.anInt5273;
									local138 = true;
								}
								local119++;
							}
							if (!arg2 && arg10 == 0) {
								Static77.method1306(local3, local7, local62.anInt5274, local62.anInt5270 * 8);
							}
						}
						if (!local138) {
							local130 = null;
						}
						if (local72 == null) {
							for (local157 = 0; local157 < local74; local157++) {
								local127[local119] = -1;
								local119++;
							}
						} else {
							local157 = local72.anInt2603;
							if (!Static329.aBoolean533) {
								local157 = -1;
							}
							for (local185 = 0; local185 < local74; local185++) {
								local133[local119] = local157;
								local136[local119] = local72.anInt2594;
								local127[local119] = arg7[local3][local7];
								if (local130 != null) {
									local130[local119] = -1;
								}
								local119++;
							}
						}
						local157 = Static25.anIntArray24.length;
						@Pc(325) int[] local325 = arg2 ? new int[local157] : null;
						@Pc(328) int[] local328 = new int[local157];
						@Pc(331) int[] local331 = new int[local157];
						@Pc(339) int local339;
						@Pc(343) int local343;
						@Pc(426) int local426;
						@Pc(434) int local434;
						for (@Pc(333) int local333 = 0; local333 < local157; local333++) {
							local339 = Static25.anIntArray24[local333];
							local343 = Static330.anIntArray650[local333];
							if (local33 == 0) {
								local328[local333] = local339;
								local331[local333] = local343;
							} else if (local33 == 1) {
								local328[local333] = local343;
								local331[local333] = 128 - local339;
							} else if (local33 == 2) {
								local328[local333] = 128 - local339;
								local331[local333] = 128 - local343;
							} else if (local33 == 3) {
								local328[local333] = 128 - local343;
								local331[local333] = local339;
							}
							if (arg2 && Static123.aBooleanArrayArray7[local27][local333]) {
								local426 = local328[local333] + (local3 << 7);
								local434 = local331[local333] + (local7 << 7);
								local325[local333] = arg0.method2698(local426, local434) - arg8.method2698(local426, local434);
							}
						}
						local339 = arg8.method2704(local3, local7);
						local343 = arg8.method2704(local3 + 1, local7);
						local426 = arg8.method2704(local3 + 1, local7 + 1);
						local434 = arg8.method2704(local3, local7 + 1);
						if (arg10 > 0) {
							@Pc(485) boolean local485 = true;
							if (local49 == 0 && local27 != 0) {
								local485 = false;
							}
							if (local41 > 0 && local62 != null && !local62.aBoolean436) {
								local485 = false;
							}
							if (local485 && local343 == local339 && local339 == local426 && local339 == local434) {
								Static268.aByteArrayArrayArray10[arg10][local3][local7] = (byte) (Static268.aByteArrayArrayArray10[arg10][local3][local7] | 0x4);
							}
						}
						@Pc(544) int local544 = 0;
						@Pc(546) int local546 = 0;
						if (arg2) {
							local544 = Static2.method30(local3, local7);
							local546 = Static209.method3766(local3, local7);
						}
						arg8.method2699(local3, local7, local328, local325, local331, Static293.anIntArrayArray46[local27], Static120.anIntArrayArray23[local27], Static69.anIntArrayArray10[local27], local127, local130, local133, local136, local544, local546);
						Static313.method5368(arg10, local3, local7);
					}
				}
			}
		}
	}
}
