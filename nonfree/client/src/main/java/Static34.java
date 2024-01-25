import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static34 {

	@OriginalMember(owner = "client!c", name = "b", descriptor = "I")
	public static int anInt615;

	@OriginalMember(owner = "client!c", name = "o", descriptor = "F")
	public static float aFloat13;

	@OriginalMember(owner = "client!c", name = "t", descriptor = "Lclient!dp;")
	public static Class53 aClass53_26;

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(BLclient!ec;)Lclient!nj;")
	public static Class43_Sub3 method512(@OriginalArg(1) Class6_Sub10 arg0) {
		return new Class43_Sub3(arg0.method4022(), arg0.method4022(), arg0.method4022(), arg0.method4022(), arg0.method3996(), arg0.method3972());
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "([[BI[[BLclient!nc;[[BZ[[BIILclient!nc;I[[ILclient!ja;)V")
	public static void method527(@OriginalArg(0) byte[][] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[][] arg2, @OriginalArg(3) Class106 arg3, @OriginalArg(4) byte[][] arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) byte[][] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) Class106 arg9, @OriginalArg(11) int[][] arg10, @OriginalArg(12) Class81 arg11) {
		for (@Pc(24) int local24 = 0; local24 < arg7; local24++) {
			for (@Pc(28) int local28 = 0; local28 < arg8; local28++) {
				if (Static16.method287() || Static247.method4078(local24, local28, Static77.anInt1421, arg1)) {
					@Pc(48) byte local48 = arg0[local24][local28];
					@Pc(54) byte local54 = arg6[local24][local28];
					@Pc(62) int local62 = arg4[local24][local28] & 0xFF;
					@Pc(70) int local70 = arg2[local24][local28] & 0xFF;
					@Pc(83) Class136 local83 = local62 == 0 ? null : Static211.method3756(local62 - 1);
					@Pc(93) Class181 local93 = local70 == 0 ? null : Static60.method983(local70 - 1);
					@Pc(95) int local95 = 0;
					@Pc(97) int local97 = 0;
					if (local48 != 0) {
						local95 = local93 == null ? 0 : Static194.anIntArray434[local48];
						local97 = local83 == null ? 0 : Static143.anIntArray348[local48];
					} else if (local83 != null) {
						local97 = Static143.anIntArray348[local48];
					} else if (local93 != null) {
						local95 = Static143.anIntArray348[local48];
					}
					@Pc(138) int local138 = local95 + local97;
					@Pc(140) int local140 = 0;
					if (local138 != 0) {
						@Pc(145) int[] local145 = new int[local138];
						@Pc(148) int[] local148 = new int[local138];
						@Pc(151) int[] local151 = new int[local138];
						@Pc(154) int[] local154 = new int[local138];
						@Pc(156) boolean local156 = false;
						@Pc(174) int local174;
						@Pc(202) int local202;
						if (local83 == null || local83.anInt3679 == -1 && local83.anInt3673 == -1 && local83.anInt3688 == -1) {
							for (local174 = 0; local174 < local97; local174++) {
								local145[local140] = -1;
								local140++;
							}
						} else {
							local174 = arg11.method2988() ? local83.anInt3688 : local83.anInt3671;
							if (!Static119.aBoolean190) {
								local174 = -1;
							}
							for (local202 = 0; local202 < local97; local202++) {
								local151[local140] = local174;
								local154[local140] = local83.anInt3674;
								if (local83.anInt3679 == -1) {
									local145[local140] = -1;
								} else {
									local145[local140] = local83.anInt3679;
								}
								if (local83.anInt3673 == -1) {
									local148[local140] = -1;
								} else {
									local148[local140] = local83.anInt3673;
									local156 = true;
								}
								local140++;
							}
							if (!arg5 && arg1 == 0) {
								Static113.method2278(local24, local28, local83.anInt3677, local83.anInt3682 * 8);
							}
						}
						if (!local156) {
							local148 = null;
						}
						if (local93 == null) {
							for (local174 = 0; local174 < local95; local174++) {
								local145[local140] = -1;
								local140++;
							}
						} else {
							local174 = local93.anInt5370;
							if (!Static119.aBoolean190) {
								local174 = -1;
							}
							for (local202 = 0; local202 < local95; local202++) {
								local151[local140] = local174;
								local154[local140] = local93.anInt5380;
								local145[local140] = arg10[local24][local28];
								if (local148 != null) {
									local148[local140] = -1;
								}
								local140++;
							}
						}
						local174 = Static79.anIntArray159.length;
						@Pc(346) int[] local346 = arg5 ? new int[local174] : null;
						@Pc(349) int[] local349 = new int[local174];
						@Pc(352) int[] local352 = new int[local174];
						@Pc(360) int local360;
						@Pc(364) int local364;
						@Pc(449) int local449;
						@Pc(457) int local457;
						for (@Pc(354) int local354 = 0; local354 < local174; local354++) {
							local360 = Static79.anIntArray159[local354];
							local364 = Static135.anIntArray648[local354];
							if (local54 == 0) {
								local349[local354] = local360;
								local352[local354] = local364;
							} else if (local54 == 1) {
								local349[local354] = local364;
								local352[local354] = 128 - local360;
							} else if (local54 == 2) {
								local349[local354] = 128 - local360;
								local352[local354] = 128 - local364;
							} else if (local54 == 3) {
								local349[local354] = 128 - local364;
								local352[local354] = local360;
							}
							if (arg5 && Static66.aBooleanArrayArray4[local48][local354]) {
								local449 = local349[local354] + (local24 << 7);
								local457 = local352[local354] + (local28 << 7);
								local346[local354] = arg9.method5717(local449, local457) - arg3.method5717(local449, local457);
							}
						}
						local360 = arg3.method5720(local24, local28);
						local364 = arg3.method5720(local24 + 1, local28);
						local449 = arg3.method5720(local24 + 1, local28 + 1);
						local457 = arg3.method5720(local24, local28 + 1);
						if (arg1 > 0) {
							@Pc(509) boolean local509 = true;
							if (local70 == 0 && local48 != 0) {
								local509 = false;
							}
							if (local62 > 0 && local83 != null && !local83.aBoolean280) {
								local509 = false;
							}
							if (local509 && local360 == local364 && local360 == local449 && local360 == local457) {
								Static238.aByteArrayArrayArray13[arg1][local24][local28] = (byte) (Static238.aByteArrayArrayArray13[arg1][local24][local28] | 0x4);
							}
						}
						@Pc(565) int local565 = 0;
						@Pc(567) int local567 = 0;
						if (arg5) {
							local565 = Static23.method355(local24, local28);
							local567 = Static325.method5423(local24, local28);
						}
						arg3.method5712(local24, local28, local349, local346, local352, Static17.anIntArrayArray217[local48], Static81.anIntArrayArray53[local48], Static323.anIntArrayArray206[local48], local145, local148, local151, local154, local565, local567);
						Static101.method2079(arg1, local24, local28);
					}
				}
			}
		}
	}
}
