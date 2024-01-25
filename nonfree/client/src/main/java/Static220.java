import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static220 {

	@OriginalMember(owner = "client!oa", name = "b", descriptor = "Lclient!bs;")
	public static Class26 aClass26_6;

	@OriginalMember(owner = "client!oa", name = "d", descriptor = "I")
	public static int anInt4055 = 0;

	@OriginalMember(owner = "client!oa", name = "g", descriptor = "I")
	public static int anInt4057 = 1;

	@OriginalMember(owner = "client!oa", name = "j", descriptor = "I")
	public static int anInt4060 = -1;

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(BLclient!nc;Lclient!nc;[[II[[B[[BIZ[[BLclient!ja;I[[B)V")
	public static void method3907(@OriginalArg(1) Class106 arg0, @OriginalArg(2) Class106 arg1, @OriginalArg(3) int[][] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) byte[][] arg4, @OriginalArg(6) byte[][] arg5, @OriginalArg(7) int arg6, @OriginalArg(8) boolean arg7, @OriginalArg(9) byte[][] arg8, @OriginalArg(10) Class81 arg9, @OriginalArg(11) int arg10, @OriginalArg(12) byte[][] arg11) {
		for (@Pc(7) int local7 = 0; local7 < arg10; local7++) {
			@Pc(20) int local20 = local7 >= arg10 - 1 ? local7 : local7 + 1;
			for (@Pc(22) int local22 = 0; local22 < arg3; local22++) {
				@Pc(39) int local39 = arg3 - 1 <= local22 ? local22 : local22 + 1;
				if (Static16.method287() || Static247.method4078(local7, local22, Static77.anInt1421, arg6)) {
					@Pc(53) boolean local53 = false;
					@Pc(55) boolean local55 = false;
					@Pc(58) boolean[] local58 = new boolean[4];
					@Pc(64) int local64 = arg5[local7][local22];
					@Pc(70) int local70 = arg4[local7][local22];
					@Pc(78) int local78 = arg8[local7][local22] & 0xFF;
					@Pc(86) int local86 = arg11[local7][local22] & 0xFF;
					@Pc(94) int local94 = arg11[local7][local39] & 0xFF;
					@Pc(102) int local102 = arg11[local20][local39] & 0xFF;
					@Pc(110) int local110 = arg11[local20][local22] & 0xFF;
					if (local78 != 0 || local86 != 0) {
						@Pc(133) Class136 local133 = local78 == 0 ? null : Static211.method3756(local78 - 1);
						if (local64 == 0 && local133 == null) {
							local64 = 12;
						}
						@Pc(152) Class181 local152 = local86 == 0 ? null : Static60.method983(local86 - 1);
						@Pc(154) Class136 local154 = local133;
						if (local133 != null) {
							if (local133.anInt3679 == -1 && local133.anInt3673 == -1) {
								local154 = local133;
								local133 = null;
							} else if (local152 != null && local64 != 0) {
								local55 = local133.aBoolean282;
							}
						}
						@Pc(266) int local266;
						@Pc(285) int local285;
						@Pc(354) int local354;
						@Pc(367) int local367;
						if ((local64 == 0 || local64 == 12) && local7 > 0 && local22 > 0 && local7 < arg10 && arg3 > local22) {
							@Pc(230) int local230 = local86 == arg11[local20][local39] ? 1 : -1;
							@Pc(249) int local249 = arg11[local20][local22 - 1] == local86 ? 1 : -1;
							local266 = arg11[local7 - 1][local22 - 1] == local86 ? 1 : -1;
							local285 = local86 == arg11[local7 - 1][local39] ? 1 : -1;
							if (arg11[local7][local22 - 1] == local86) {
								local249++;
								local266++;
							} else {
								local266--;
								local249--;
							}
							if (arg11[local20][local22] == local86) {
								local249++;
								local230++;
							} else {
								local249--;
								local230--;
							}
							if (arg11[local7][local39] == local86) {
								local285++;
								local230++;
							} else {
								local230--;
								local285--;
							}
							if (local86 == arg11[local7 - 1][local22]) {
								local266++;
								local285++;
							} else {
								local285--;
								local266--;
							}
							local354 = local266 - local230;
							if (local354 < 0) {
								local354 = -local354;
							}
							local367 = local249 - local285;
							if (local367 < 0) {
								local367 = -local367;
							}
							if (local367 == local354) {
								local354 = arg1.method5720(local7, local22) - arg1.method5720(local20, local39);
								if (local354 < 0) {
									local354 = -local354;
								}
								local367 = arg1.method5720(local20, local22) - arg1.method5720(local7, local39);
								if (local367 < 0) {
									local367 = -local367;
								}
							}
							local70 = local354 < local367 ? 1 : 0;
						}
						for (local266 = 0; local266 < 13; local266++) {
							Static143.anIntArray350[local266] = -1;
							Static281.anIntArray571[local266] = 1;
						}
						@Pc(447) boolean[] local447 = local133 != null && local133.aBoolean282 ? Static346.aBooleanArrayArray8[local64] : Static289.aBooleanArrayArray7[local64];
						Static99.method5556(arg4, local70, arg9, arg5, arg3, local22, arg10, local7, arg8, local64, local58, local133, local152);
						@Pc(473) boolean local473 = local133 != null && local133.anInt3673 != local133.anInt3679;
						if (!local473) {
							for (local285 = 0; local285 < 8; local285++) {
								if (Static143.anIntArray350[local285] >= 0 && Static17.anIntArray705[local285] != Static319.anIntArray668[local285]) {
									local473 = true;
									break;
								}
							}
						}
						if (!local447[local70 + 1 & 0x3]) {
							local58[1] = Static181.method3454(local58[1], (Static281.anIntArray571[4] & Static281.anIntArray571[2]) == 0);
						}
						if (!local447[local70 + 3 & 0x3]) {
							local58[3] = Static181.method3454(local58[3], (Static281.anIntArray571[6] & Static281.anIntArray571[0]) == 0);
						}
						if (!local447[local70 & 0x3]) {
							local58[0] = Static181.method3454(local58[0], (Static281.anIntArray571[2] & Static281.anIntArray571[0]) == 0);
						}
						if (!local447[local70 + 2 & 0x3]) {
							local58[2] = Static181.method3454(local58[2], (Static281.anIntArray571[6] & Static281.anIntArray571[4]) == 0);
						}
						if (!local55 && (local64 == 0 || local64 == 12)) {
							if (local58[0] && !local58[1] && !local58[2] && local58[3]) {
								local64 = local64 == 0 ? 13 : 14;
								local70 = 0;
								local58[0] = local58[3] = false;
							} else if (local58[0] && local58[1] && !local58[2] && !local58[3]) {
								local58[0] = local58[1] = false;
								local70 = 3;
								local64 = local64 == 0 ? 13 : 14;
							} else if (!local58[0] && local58[1] && local58[2] && !local58[3]) {
								local70 = 2;
								local58[1] = local58[2] = false;
								local64 = local64 == 0 ? 13 : 14;
							} else if (!local58[0] && !local58[1] && local58[2] && local58[3]) {
								local58[2] = local58[3] = false;
								local70 = 1;
								local64 = local64 == 0 ? 13 : 14;
							}
						}
						@Pc(789) boolean local789 = !local55 && !local58[0] && !local58[2] && !local58[1] && !local58[3];
						@Pc(791) int[] local791 = null;
						@Pc(811) int[] local811;
						@Pc(815) int[] local815;
						@Pc(807) int[] local807;
						if (local789) {
							local807 = Static323.anIntArrayArray206[local64];
							local815 = Static81.anIntArrayArray53[local64];
							local811 = Static17.anIntArrayArray217[local64];
							local354 = local152 == null ? 0 : Static194.anIntArray434[local64];
							local367 = local133 == null ? 0 : Static143.anIntArray348[local64];
						} else if (local55) {
							local811 = Static187.anIntArrayArray127[local64];
							local791 = Static340.anIntArrayArray34[local64];
							local367 = local133 == null ? 0 : Static278.anIntArray659[local64];
							local807 = Static131.anIntArrayArray96[local64];
							local815 = Static168.anIntArrayArray39[local64];
							local354 = local152 == null ? 0 : Static342.anIntArray708[local64];
						} else {
							local354 = local152 == null ? 0 : Static211.anIntArray451[local64];
							local807 = Static255.anIntArrayArray162[local64];
							local811 = Static120.anIntArrayArray89[local64];
							local815 = Static143.anIntArrayArray112[local64];
							local791 = Static229.anIntArrayArray223[local64];
							local367 = local133 == null ? 0 : Static16.anIntArray30[local64];
						}
						@Pc(893) int local893 = local354 + local367;
						if (local893 <= 0) {
							Static101.method2079(arg6, local7, local22);
						} else {
							if (local58[0]) {
								local893++;
							}
							if (local58[2]) {
								local893++;
							}
							if (local58[1]) {
								local893++;
							}
							if (local58[3]) {
								local893++;
							}
							@Pc(926) int local926 = 0;
							@Pc(928) int local928 = 0;
							@Pc(932) int local932 = local893 * 3;
							@Pc(939) int[] local939 = arg7 ? new int[local932] : null;
							@Pc(946) int[] local946 = local473 ? new int[local932] : null;
							@Pc(949) int[] local949 = new int[local932];
							@Pc(952) int[] local952 = new int[local932];
							@Pc(955) int[] local955 = new int[local932];
							@Pc(958) int[] local958 = new int[local932];
							@Pc(961) int[] local961 = new int[local932];
							@Pc(963) int local963 = -1;
							@Pc(965) int local965 = -1;
							@Pc(967) int local967 = 256;
							@Pc(1045) byte local1045;
							@Pc(989) int local989;
							@Pc(991) int local991;
							@Pc(1231) int local1231;
							@Pc(1237) int local1237;
							@Pc(1246) int local1246;
							@Pc(1250) int local1250;
							@Pc(1254) int local1254;
							@Pc(1332) int local1332;
							@Pc(1340) int local1340;
							if (local133 != null) {
								local963 = local133.anInt3679;
								local965 = arg9.method2988() ? local133.anInt3688 : local133.anInt3671;
								local967 = local133.anInt3674;
								local989 = Static184.method3479(local133, arg9);
								for (local991 = 0; local991 < local367; local991++) {
									if (local58[-local70 & 0x3] && local926 == local791[0]) {
										Static158.anIntArray633[0] = local811[local926];
										Static158.anIntArray633[1] = 1;
										Static158.anIntArray633[2] = local807[local926];
										Static158.anIntArray633[3] = 1;
										Static158.anIntArray633[4] = local815[local926];
										Static158.anIntArray633[5] = local807[local926];
										local1045 = 6;
									} else if (local58[2 - local70 & 0x3] && local791[2] == local926) {
										Static158.anIntArray633[0] = local811[local926];
										Static158.anIntArray633[1] = 5;
										Static158.anIntArray633[2] = local807[local926];
										Static158.anIntArray633[3] = 5;
										Static158.anIntArray633[4] = local815[local926];
										local1045 = 6;
										Static158.anIntArray633[5] = local807[local926];
									} else if (local58[1 - local70 & 0x3] && local791[1] == local926) {
										Static158.anIntArray633[0] = local811[local926];
										Static158.anIntArray633[1] = 3;
										Static158.anIntArray633[2] = local807[local926];
										Static158.anIntArray633[3] = 3;
										Static158.anIntArray633[4] = local815[local926];
										Static158.anIntArray633[5] = local807[local926];
										local1045 = 6;
									} else if (local58[3 - local70 & 0x3] && local926 == local791[3]) {
										Static158.anIntArray633[0] = local811[local926];
										Static158.anIntArray633[1] = 7;
										Static158.anIntArray633[2] = local807[local926];
										Static158.anIntArray633[3] = 7;
										Static158.anIntArray633[4] = local815[local926];
										local1045 = 6;
										Static158.anIntArray633[5] = local807[local926];
									} else {
										Static158.anIntArray633[0] = local811[local926];
										Static158.anIntArray633[1] = local815[local926];
										Static158.anIntArray633[2] = local807[local926];
										local1045 = 3;
									}
									for (local1231 = 0; local1231 < local1045; local1231++) {
										local1237 = Static158.anIntArray633[local1231];
										local1246 = local1237 - local70 * 2 & 0x7;
										local1250 = Static79.anIntArray159[local1237];
										local1254 = Static135.anIntArray648[local1237];
										if (local70 == 1) {
											local949[local928] = local1254;
											local952[local928] = 128 - local1250;
										} else if (local70 == 2) {
											local949[local928] = 128 - local1250;
											local952[local928] = 128 - local1254;
										} else if (local70 == 3) {
											local949[local928] = 128 - local1254;
											local952[local928] = local1250;
										} else {
											local949[local928] = local1250;
											local952[local928] = local1254;
										}
										if (arg7 && Static66.aBooleanArrayArray4[local64][local1237]) {
											local1332 = local949[local928] + (local7 << 7);
											local1340 = local952[local928] + (local22 << 7);
											local939[local928] = arg0.method5717(local1332, local1340) - arg1.method5717(local1332, local1340);
										}
										if (local1237 < 8 && local133.anInt3675 < Static143.anIntArray350[local1246]) {
											if (local946 != null) {
												local946[local928] = Static319.anIntArray668[local1246];
											}
											local961[local928] = Static215.anIntArray462[local1246];
											local958[local928] = Static229.anIntArray719[local1246];
											local955[local928] = Static17.anIntArray705[local1246];
										} else {
											if (local946 != null) {
												local946[local928] = local989;
											}
											local958[local928] = arg9.method2988() ? local133.anInt3688 : local133.anInt3671;
											local961[local928] = local133.anInt3674;
											local955[local928] = local963;
										}
										local928++;
									}
									local926++;
								}
								if (!arg7 && arg6 == 0) {
									Static113.method2278(local7, local22, local133.anInt3677, local133.anInt3682 * 8);
								}
								if (local64 != 12 && local133.anInt3679 != -1 && local133.aBoolean279) {
									local53 = true;
								}
							} else if (local789) {
								local926 = Static143.anIntArray348[local64];
							} else if (local55) {
								local926 = Static278.anIntArray659[local64];
							} else {
								local926 = Static16.anIntArray30[local64];
							}
							if (local152 != null) {
								if (local102 == 0) {
									local102 = local86;
								}
								if (local94 == 0) {
									local94 = local86;
								}
								if (local110 == 0) {
									local110 = local86;
								}
								@Pc(1515) Class181 local1515 = Static60.method983(local86 - 1);
								@Pc(1521) Class181 local1521 = Static60.method983(local94 - 1);
								@Pc(1527) Class181 local1527 = Static60.method983(local102 - 1);
								@Pc(1533) Class181 local1533 = Static60.method983(local110 - 1);
								for (local1246 = 0; local1246 < local354; local1246++) {
									if (local58[-local70 & 0x3] && local926 == local791[0]) {
										Static158.anIntArray633[0] = local811[local926];
										Static158.anIntArray633[1] = 1;
										Static158.anIntArray633[2] = local807[local926];
										Static158.anIntArray633[3] = 1;
										Static158.anIntArray633[4] = local815[local926];
										Static158.anIntArray633[5] = local807[local926];
										local1045 = 6;
									} else if (local58[2 - local70 & 0x3] && local926 == local791[2]) {
										Static158.anIntArray633[0] = local811[local926];
										Static158.anIntArray633[1] = 5;
										Static158.anIntArray633[2] = local807[local926];
										Static158.anIntArray633[3] = 5;
										Static158.anIntArray633[4] = local815[local926];
										local1045 = 6;
										Static158.anIntArray633[5] = local807[local926];
									} else if (local58[1 - local70 & 0x3] && local926 == local791[1]) {
										Static158.anIntArray633[0] = local811[local926];
										Static158.anIntArray633[1] = 3;
										Static158.anIntArray633[2] = local807[local926];
										Static158.anIntArray633[3] = 3;
										Static158.anIntArray633[4] = local815[local926];
										Static158.anIntArray633[5] = local807[local926];
										local1045 = 6;
									} else if (local58[3 - local70 & 0x3] && local791[3] == local926) {
										Static158.anIntArray633[0] = local811[local926];
										Static158.anIntArray633[1] = 7;
										Static158.anIntArray633[2] = local807[local926];
										Static158.anIntArray633[3] = 7;
										Static158.anIntArray633[4] = local815[local926];
										local1045 = 6;
										Static158.anIntArray633[5] = local807[local926];
									} else {
										Static158.anIntArray633[0] = local811[local926];
										Static158.anIntArray633[1] = local815[local926];
										local1045 = 3;
										Static158.anIntArray633[2] = local807[local926];
									}
									for (local1250 = 0; local1250 < local1045; local1250++) {
										local1254 = Static158.anIntArray633[local1250];
										local1332 = local1254 - local70 * 2 & 0x7;
										local1340 = Static79.anIntArray159[local1254];
										@Pc(1788) int local1788 = Static135.anIntArray648[local1254];
										@Pc(1795) int local1795;
										@Pc(1800) int local1800;
										if (local70 == 1) {
											local1795 = local1788;
											local1800 = 128 - local1340;
										} else if (local70 == 2) {
											local1795 = 128 - local1340;
											local1800 = 128 - local1788;
										} else if (local70 == 3) {
											local1800 = local1340;
											local1795 = 128 - local1788;
										} else {
											local1800 = local1788;
											local1795 = local1340;
										}
										local949[local928] = local1795;
										local952[local928] = local1800;
										@Pc(1857) int local1857;
										@Pc(1863) int local1863;
										if (arg7 && Static66.aBooleanArrayArray4[local64][local1254]) {
											local1857 = local1795 + (local7 << 7);
											local1863 = (local22 << 7) + local1800;
											local939[local928] = arg0.method5717(local1857, local1863) - arg1.method5717(local1857, local1863);
										}
										if (local1254 < 8 && Static143.anIntArray350[local1332] >= 0) {
											if (local946 != null) {
												local946[local928] = Static319.anIntArray668[local1332];
											}
											local961[local928] = Static215.anIntArray462[local1332];
											local958[local928] = Static229.anIntArray719[local1332];
											local955[local928] = Static17.anIntArray705[local1332];
										} else {
											if (local55 && Static66.aBooleanArrayArray4[local64][local1254]) {
												local958[local928] = local965;
												local961[local928] = local967;
												local955[local928] = local963;
											} else if (local1795 == 0 && local1800 == 0) {
												local955[local928] = arg2[local7][local22];
												local958[local928] = local1515.anInt5370;
												local961[local928] = local1515.anInt5380;
											} else if (local1795 == 0 && local1800 == 128) {
												local955[local928] = arg2[local7][local39];
												local958[local928] = local1521.anInt5370;
												local961[local928] = local1521.anInt5380;
											} else if (local1795 == 128 && local1800 == 128) {
												local955[local928] = arg2[local20][local39];
												local958[local928] = local1527.anInt5370;
												local961[local928] = local1527.anInt5380;
											} else if (local1795 == 128 && local1800 == 0) {
												local955[local928] = arg2[local20][local22];
												local958[local928] = local1533.anInt5370;
												local961[local928] = local1533.anInt5380;
											} else {
												if (local1795 < 64) {
													if (local1800 < 64) {
														local958[local928] = local1515.anInt5370;
														local961[local928] = local1515.anInt5380;
													} else {
														local958[local928] = local1521.anInt5370;
														local961[local928] = local1521.anInt5380;
													}
												} else if (local1800 >= 64) {
													local958[local928] = local1527.anInt5370;
													local961[local928] = local1527.anInt5380;
												} else {
													local958[local928] = local1533.anInt5370;
													local961[local928] = local1533.anInt5380;
												}
												local1857 = Static57.method969(arg2[local7][local22], arg2[local20][local22], local1795 << 7 >> 7);
												local1863 = Static57.method969(arg2[local7][local39], arg2[local20][local39], local1795 << 7 >> 7);
												local955[local928] = Static57.method969(local1857, local1863, local1800 << 7 >> 7);
											}
											if (local946 != null) {
												local946[local928] = local955[local928];
											}
										}
										local928++;
									}
									local926++;
								}
								if (local64 != 0 && local152.aBoolean371) {
									local53 = true;
								}
							}
							local989 = arg1.method5720(local7, local22);
							local991 = arg1.method5720(local20, local22);
							local1231 = arg1.method5720(local20, local39);
							local1237 = arg1.method5720(local7, local39);
							if (arg6 > 0) {
								@Pc(2215) boolean local2215 = true;
								if (local86 == 0 && local64 != 0) {
									local2215 = false;
								}
								if (local78 > 0 && local154 != null && !local154.aBoolean280) {
									local2215 = false;
								}
								if (local2215 && local989 == local991 && local1231 == local989 && local989 == local1237) {
									Static238.aByteArrayArrayArray13[arg6][local7][local22] = (byte) (Static238.aByteArrayArrayArray13[arg6][local7][local22] | 0x4);
								}
							}
							local1246 = 0;
							local1250 = 0;
							if (arg7) {
								local1246 = Static23.method355(local7, local22);
								local1250 = Static325.method5423(local7, local22);
							}
							arg1.method5729(local7, local22, local949, local939, local952, local955, local946, local958, local961, local1246, local1250, local53);
							Static101.method2079(arg6, local7, local22);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(J[III)Ljava/lang/String;")
	public static String method3908(@OriginalArg(0) long arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) int arg2) {
		if (Static239.anInterface9_8 != null) {
			@Pc(12) String local12 = Static239.anInterface9_8.method3952(arg1, arg2, arg0);
			if (local12 != null) {
				return local12;
			}
		}
		return Long.toString(arg0);
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lclient!vj;Ljava/awt/Canvas;Lclient!cj;III)Lclient!ja;")
	public static Class81 method3909(@OriginalArg(0) Class206 arg0, @OriginalArg(1) Canvas arg1, @OriginalArg(2) Interface2 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(7) int local7 = -1;
		for (@Pc(20) int local20 = 0; local20 < 8; local20++) {
			if (!Static107.aBooleanArray19[local20]) {
				local7 = local20;
				Static107.aBooleanArray19[local20] = true;
				break;
			}
		}
		if (local7 == -1) {
			throw new IllegalStateException("No free toolkit instances");
		} else if (arg3 == 0) {
			return Static210.method3750(arg1, arg2, local7);
		} else if (arg3 == 1) {
			return Static232.method4110(arg0, arg4, arg2, arg1, local7);
		} else {
			throw new IllegalArgumentException("Unsupported mode");
		}
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(I)V")
	public static void method3911() {
		if (Static275.anInt5181 == -1 || Static12.anInt223 == -1) {
			return;
		}
		@Pc(23) int local23 = ((Static213.anInt3923 - Static325.anInt5997) * Static206.anInt3781 >> 16) + Static325.anInt5997;
		Static206.anInt3781 += local23;
		if (Static206.anInt3781 >= 65535) {
			if (Static174.aBoolean235) {
				Static148.aBoolean218 = false;
			} else {
				Static148.aBoolean218 = true;
			}
			Static206.anInt3781 = 65535;
			Static174.aBoolean235 = true;
		} else {
			Static174.aBoolean235 = false;
			Static148.aBoolean218 = false;
		}
		@Pc(53) float local53 = (float) Static206.anInt3781 / 65535.0F;
		@Pc(56) float[] local56 = new float[3];
		@Pc(60) int local60 = Static68.anInt4185 * 2;
		@Pc(86) int local86;
		@Pc(119) int local119;
		@Pc(127) int local127;
		@Pc(132) int local132;
		@Pc(141) int local141;
		@Pc(159) int local159;
		for (@Pc(62) int local62 = 0; local62 < 3; local62++) {
			@Pc(74) int local74 = Static101.anIntArrayArrayArray3[Static275.anInt5181][local60][local62] * 3;
			local86 = Static101.anIntArrayArrayArray3[Static275.anInt5181][local60 + 1][local62] * 3;
			local119 = (Static101.anIntArrayArrayArray3[Static275.anInt5181][local60 + 2][local62] + Static101.anIntArrayArrayArray3[Static275.anInt5181][local60 + 2][local62] - Static101.anIntArrayArrayArray3[Static275.anInt5181][local60 + 3][local62]) * 3;
			local127 = Static101.anIntArrayArrayArray3[Static275.anInt5181][local60][local62];
			local132 = local86 - local74;
			local141 = local119 + local74 - local86 * 2;
			local159 = local86 + Static101.anIntArrayArrayArray3[Static275.anInt5181][local60 + 2][local62] - local127 - local119;
			local56[local62] = (float) local127 + ((float) local132 + ((float) local141 + (float) local159 * local53) * local53) * local53;
		}
		Static217.anInt4016 = (int) local56[1] * -1;
		Static11.anInt197 = (int) local56[2] - Static300.anInt5672 * 128;
		Static287.anInt5405 = (int) local56[0] - Static44.anInt881 * 128;
		@Pc(215) float[] local215 = new float[3];
		local86 = Static31.anInt577 * 2;
		for (local119 = 0; local119 < 3; local119++) {
			local127 = Static101.anIntArrayArrayArray3[Static12.anInt223][local86][local119] * 3;
			local132 = Static101.anIntArrayArrayArray3[Static12.anInt223][local86 + 1][local119] * 3;
			local141 = (Static101.anIntArrayArrayArray3[Static12.anInt223][local86 + 2][local119] + Static101.anIntArrayArrayArray3[Static12.anInt223][local86 + 2][local119] - Static101.anIntArrayArrayArray3[Static12.anInt223][local86 + 3][local119]) * 3;
			local159 = Static101.anIntArrayArrayArray3[Static12.anInt223][local86][local119];
			@Pc(291) int local291 = local132 - local127;
			@Pc(300) int local300 = local141 + local127 - local132 * 2;
			@Pc(318) int local318 = Static101.anIntArrayArrayArray3[Static12.anInt223][local86 + 2][local119] + local132 - local141 - local159;
			local215[local119] = local53 * ((float) local291 + local53 * (local53 * (float) local318 + (float) local300)) + (float) local159;
		}
		@Pc(352) float local352 = local215[0] - local56[0];
		@Pc(363) float local363 = (local215[1] - local56[1]) * -1.0F;
		@Pc(372) float local372 = local215[2] - local56[2];
		@Pc(382) double local382 = Math.sqrt((double) (local352 * local352 + local372 * local372));
		Static110.anInt2047 = (int) (Math.atan2((double) local363, local382) * 2607.5945876176133D) & 0x3FFF;
		Static79.anInt1450 = (int) (-Math.atan2((double) local352, (double) local372) * 2607.5945876176133D) & 0x3FFF;
		Static53.anInt1017 = (Static206.anInt3781 * (Static101.anIntArrayArrayArray3[Static275.anInt5181][local60 + 2][3] - Static101.anIntArrayArrayArray3[Static275.anInt5181][local60][3]) >> 16) + Static101.anIntArrayArrayArray3[Static275.anInt5181][local60][3];
	}
}
