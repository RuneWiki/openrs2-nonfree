import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static107 {

	@OriginalMember(owner = "client!gn", name = "D", descriptor = "I")
	public static int anInt1502;

	@OriginalMember(owner = "client!gn", name = "G", descriptor = "[I")
	public static int[] anIntArray224;

	@OriginalMember(owner = "client!gn", name = "B", descriptor = "Lclient!bi;")
	public static Class26 aClass26_12 = null;

	@OriginalMember(owner = "client!gn", name = "E", descriptor = "I")
	public static int anInt1503 = 0;

	@OriginalMember(owner = "client!gn", name = "H", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray13 = new String[200];

	@OriginalMember(owner = "client!gn", name = "e", descriptor = "(B)I")
	public static int method1188() {
		return 6;
	}

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(Lclient!sa;Lclient!pe;[[II[[BB[[BIZ[[B[[BLclient!sa;I)V")
	public static void method1192(@OriginalArg(0) Class8 arg0, @OriginalArg(1) Class89 arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte[][] arg4, @OriginalArg(6) byte[][] arg5, @OriginalArg(7) int arg6, @OriginalArg(8) boolean arg7, @OriginalArg(9) byte[][] arg8, @OriginalArg(10) byte[][] arg9, @OriginalArg(11) Class8 arg10, @OriginalArg(12) int arg11) {
		for (@Pc(1) int local1 = 0; local1 < arg11; local1++) {
			@Pc(17) int local17 = arg11 - 1 > local1 ? local1 + 1 : local1;
			for (@Pc(19) int local19 = 0; local19 < arg3; local19++) {
				@Pc(35) int local35 = local19 < arg3 - 1 ? local19 + 1 : local19;
				if (Static105.method5089() || Static215.method3801(local1, local19, arg6, Static75.anInt1865)) {
					@Pc(48) boolean local48 = false;
					@Pc(50) boolean local50 = false;
					@Pc(53) boolean[] local53 = new boolean[4];
					@Pc(59) int local59 = arg5[local1][local19];
					@Pc(65) int local65 = arg4[local1][local19];
					@Pc(73) int local73 = arg8[local1][local19] & 0xFF;
					@Pc(81) int local81 = arg9[local1][local19] & 0xFF;
					@Pc(89) int local89 = arg9[local1][local35] & 0xFF;
					@Pc(97) int local97 = arg9[local17][local35] & 0xFF;
					@Pc(105) int local105 = arg9[local17][local19] & 0xFF;
					if (local73 != 0 || local81 != 0) {
						@Pc(122) Class213 local122 = local73 == 0 ? null : Static146.method2935(local73 - 1);
						if (local59 == 0 && local122 == null) {
							local59 = 12;
						}
						@Pc(143) Class78 local143 = local81 == 0 ? null : Static244.method4224(local81 - 1);
						@Pc(145) Class213 local145 = local122;
						if (local122 != null) {
							if (local122.anInt6543 == -1 && local122.anInt6554 == -1) {
								local145 = local122;
								local122 = null;
							} else if (local143 != null && local59 != 0) {
								local50 = local122.aBoolean477;
							}
						}
						@Pc(250) int local250;
						@Pc(279) int local279;
						@Pc(326) int local326;
						@Pc(336) int local336;
						if ((local59 == 0 || local59 == 12) && local1 > 0 && local19 > 0 && local1 < arg11 && local19 < arg3) {
							@Pc(214) int local214 = local81 == arg9[local17][local19 - 1] ? 1 : -1;
							@Pc(231) int local231 = local81 == arg9[local17][local35] ? 1 : -1;
							local250 = local81 == arg9[local1 - 1][local19 - 1] ? 1 : -1;
							if (arg9[local1][local19 - 1] == local81) {
								local250++;
								local214++;
							} else {
								local250--;
								local214--;
							}
							local279 = arg9[local1 - 1][local35] == local81 ? 1 : -1;
							if (arg9[local17][local19] == local81) {
								local231++;
								local214++;
							} else {
								local214--;
								local231--;
							}
							if (local81 == arg9[local1][local35]) {
								local279++;
								local231++;
							} else {
								local279--;
								local231--;
							}
							if (local81 == arg9[local1 - 1][local19]) {
								local250++;
								local279++;
							} else {
								local279--;
								local250--;
							}
							local326 = local250 - local231;
							if (local326 < 0) {
								local326 = -local326;
							}
							local336 = local214 - local279;
							if (local336 < 0) {
								local336 = -local336;
							}
							if (local336 == local326) {
								local326 = arg0.method4173(local1, local19) - arg0.method4173(local17, local35);
								if (local326 < 0) {
									local326 = -local326;
								}
								local336 = arg0.method4173(local17, local19) - arg0.method4173(local1, local35);
								if (local336 < 0) {
									local336 = -local336;
								}
							}
							local65 = local336 > local326 ? 1 : 0;
						}
						for (local250 = 0; local250 < 13; local250++) {
							Static87.anIntArray719[local250] = -1;
							Static342.anIntArray827[local250] = 1;
						}
						@Pc(413) boolean[] local413 = local122 != null && local122.aBoolean477 ? Static292.aBooleanArrayArray3[local59] : Static344.aBooleanArrayArray5[local59];
						Static302.method5508(arg11, arg5, local122, local1, local59, arg8, arg3, local65, arg1, local53, local19, arg4, local143);
						@Pc(443) boolean local443 = local122 != null && local122.anInt6543 != local122.anInt6554;
						if (!local443) {
							for (local279 = 0; local279 < 8; local279++) {
								if (Static87.anIntArray719[local279] >= 0 && Static192.anIntArray524[local279] != Static294.anIntArray813[local279]) {
									local443 = true;
									break;
								}
							}
						}
						if (!local413[local65 + 1 & 0x3]) {
							local53[1] = Static159.method3027(local53[1], (Static342.anIntArray827[4] & Static342.anIntArray827[2]) == 0);
						}
						if (!local413[local65 + 3 & 0x3]) {
							local53[3] = Static159.method3027(local53[3], (Static342.anIntArray827[0] & Static342.anIntArray827[6]) == 0);
						}
						if (!local413[--local65 & 0x3]) {
							local53[0] = Static159.method3027(local53[0], (Static342.anIntArray827[0] & Static342.anIntArray827[2]) == 0);
						}
						if (!local413[local65 + 2 & 0x3]) {
							local53[2] = Static159.method3027(local53[2], (Static342.anIntArray827[6] & Static342.anIntArray827[4]) == 0);
						}
						if (!local50 && (local59 == 0 || local59 == 12)) {
							if (local53[0] && !local53[1] && !local53[2] && local53[3]) {
								local53[0] = local53[3] = false;
								local59 = local59 == 0 ? 13 : 14;
								local65 = 0;
							} else if (local53[0] && local53[1] && !local53[2] && !local53[3]) {
								local65 = 3;
								local53[0] = local53[1] = false;
								local59 = local59 == 0 ? 13 : 14;
							} else if (!local53[0] && local53[1] && local53[2] && !local53[3]) {
								local53[1] = local53[2] = false;
								local59 = local59 == 0 ? 13 : 14;
								local65 = 2;
							} else if (!local53[0] && !local53[1] && local53[2] && local53[3]) {
								local65 = 1;
								local53[2] = local53[3] = false;
								local59 = local59 == 0 ? 13 : 14;
							}
						}
						@Pc(757) boolean local757 = !local50 && !local53[0] && !local53[2] && !local53[1] && !local53[3];
						@Pc(759) int[] local759 = null;
						@Pc(771) int[] local771;
						@Pc(787) int[] local787;
						@Pc(767) int[] local767;
						if (local757) {
							local326 = local143 == null ? 0 : Static326.anIntArray787[local59];
							local767 = Static257.anIntArrayArray43[local59];
							local787 = Static200.anIntArrayArray30[local59];
							local336 = local122 == null ? 0 : Static211.anIntArray578[local59];
							local771 = Static210.anIntArrayArray33[local59];
						} else if (local50) {
							local767 = Static220.anIntArrayArray35[local59];
							local771 = Static203.anIntArrayArray31[local59];
							local759 = Static82.anIntArrayArray17[local59];
							local326 = local143 == null ? 0 : Static279.anIntArray847[local59];
							local787 = Static307.anIntArrayArray54[local59];
							local336 = local122 == null ? 0 : Static234.anIntArray624[local59];
						} else {
							local787 = Static254.anIntArrayArray42[local59];
							local759 = Static276.anIntArrayArray51[local59];
							local771 = Static290.anIntArrayArray52[local59];
							local326 = local143 == null ? 0 : Static119.anIntArray358[local59];
							local336 = local122 == null ? 0 : Static278.anIntArray705[local59];
							local767 = Static305.anIntArrayArray53[local59];
						}
						@Pc(861) int local861 = local336 + local326;
						if (local861 <= 0) {
							Static248.method4274(arg6, local1, local19);
						} else {
							if (local53[0]) {
								local861++;
							}
							if (local53[2]) {
								local861++;
							}
							if (local53[1]) {
								local861++;
							}
							if (local53[3]) {
								local861++;
							}
							@Pc(893) int local893 = 0;
							@Pc(895) int local895 = 0;
							@Pc(899) int local899 = local861 * 3;
							@Pc(906) int[] local906 = arg7 ? new int[local899] : null;
							@Pc(913) int[] local913 = local443 ? new int[local899] : null;
							@Pc(916) int[] local916 = new int[local899];
							@Pc(919) int[] local919 = new int[local899];
							@Pc(922) int[] local922 = new int[local899];
							@Pc(925) int[] local925 = new int[local899];
							@Pc(928) int[] local928 = new int[local899];
							@Pc(930) int local930 = -1;
							@Pc(932) int local932 = -1;
							@Pc(934) int local934 = 256;
							@Pc(1032) byte local1032;
							@Pc(981) int local981;
							@Pc(983) int local983;
							@Pc(1201) int local1201;
							@Pc(1206) int local1206;
							@Pc(1215) int local1215;
							@Pc(1219) int local1219;
							@Pc(1223) int local1223;
							@Pc(1300) int local1300;
							@Pc(1308) int local1308;
							if (local122 != null) {
								local930 = local122.anInt6543;
								local932 = arg1.method5393() ? local122.anInt6539 : local122.anInt6542;
								local934 = local122.anInt6547;
								local981 = Static201.method3718(local122, arg1);
								for (local983 = 0; local983 < local336; local983++) {
									if (local53[-local65 & 0x3] && local893 == local759[0]) {
										Static171.anIntArray477[0] = local771[local893];
										Static171.anIntArray477[1] = 1;
										Static171.anIntArray477[2] = local767[local893];
										Static171.anIntArray477[3] = 1;
										Static171.anIntArray477[4] = local787[local893];
										Static171.anIntArray477[5] = local767[local893];
										local1032 = 6;
									} else if (local53[2 - local65 & 0x3] && local759[2] == local893) {
										Static171.anIntArray477[0] = local771[local893];
										Static171.anIntArray477[1] = 5;
										Static171.anIntArray477[2] = local767[local893];
										Static171.anIntArray477[3] = 5;
										Static171.anIntArray477[4] = local787[local893];
										local1032 = 6;
										Static171.anIntArray477[5] = local767[local893];
									} else if (local53[1 - local65 & 0x3] && local759[1] == local893) {
										Static171.anIntArray477[0] = local771[local893];
										Static171.anIntArray477[1] = 3;
										Static171.anIntArray477[2] = local767[local893];
										Static171.anIntArray477[3] = 3;
										Static171.anIntArray477[4] = local787[local893];
										local1032 = 6;
										Static171.anIntArray477[5] = local767[local893];
									} else if (local53[3 - local65 & 0x3] && local759[3] == local893) {
										Static171.anIntArray477[0] = local771[local893];
										Static171.anIntArray477[1] = 7;
										Static171.anIntArray477[2] = local767[local893];
										Static171.anIntArray477[3] = 7;
										Static171.anIntArray477[4] = local787[local893];
										Static171.anIntArray477[5] = local767[local893];
										local1032 = 6;
									} else {
										Static171.anIntArray477[0] = local771[local893];
										Static171.anIntArray477[1] = local787[local893];
										Static171.anIntArray477[2] = local767[local893];
										local1032 = 3;
									}
									for (local1201 = 0; local1201 < local1032; local1201++) {
										local1206 = Static171.anIntArray477[local1201];
										local1215 = local1206 - local65 * 2 & 0x7;
										local1219 = Static222.anIntArray602[local1206];
										local1223 = Static283.anIntArray708[local1206];
										if (local65 == 1) {
											local916[local895] = local1223;
											local919[local895] = 128 - local1219;
										} else if (local65 == 2) {
											local916[local895] = 128 - local1219;
											local919[local895] = 128 - local1223;
										} else if (local65 == 3) {
											local916[local895] = 128 - local1223;
											local919[local895] = local1219;
										} else {
											local916[local895] = local1219;
											local919[local895] = local1223;
										}
										if (arg7 && Static298.aBooleanArrayArray4[local59][local1206]) {
											local1300 = (local1 << 7) + local916[local895];
											local1308 = local919[local895] + (local19 << 7);
											local906[local895] = arg10.method4169(local1300, local1308) - arg0.method4169(local1300, local1308);
										}
										if (local1206 < 8 && Static87.anIntArray719[local1215] > local122.anInt6551) {
											if (local913 != null) {
												local913[local895] = Static294.anIntArray813[local1215];
											}
											local928[local895] = Static350.anIntArray838[local1215];
											local925[local895] = Static57.anIntArray219[local1215];
											local922[local895] = Static192.anIntArray524[local1215];
										} else {
											if (local913 != null) {
												local913[local895] = local981;
											}
											local925[local895] = arg1.method5393() ? local122.anInt6539 : local122.anInt6542;
											local928[local895] = local122.anInt6547;
											local922[local895] = local930;
										}
										local895++;
									}
									local893++;
								}
								if (!arg7 && arg6 == 0) {
									Static321.method5185(local1, local19, local122.anInt6553, local122.anInt6546 * 8);
								}
								if (local59 != 12 && local122.anInt6543 != -1 && local122.aBoolean475) {
									local48 = true;
								}
							} else if (local757) {
								local893 = Static211.anIntArray578[local59];
							} else if (local50) {
								local893 = Static234.anIntArray624[local59];
							} else {
								local893 = Static278.anIntArray705[local59];
							}
							if (local143 != null) {
								if (local97 == 0) {
									local97 = local81;
								}
								if (local89 == 0) {
									local89 = local81;
								}
								if (local105 == 0) {
									local105 = local81;
								}
								@Pc(1455) Class78 local1455 = Static244.method4224(local81 - 1);
								@Pc(1461) Class78 local1461 = Static244.method4224(local89 - 1);
								@Pc(1467) Class78 local1467 = Static244.method4224(local97 - 1);
								@Pc(1473) Class78 local1473 = Static244.method4224(local105 - 1);
								for (local1215 = 0; local1215 < local326; local1215++) {
									if (local53[-local65 & 0x3] && local893 == local759[0]) {
										Static171.anIntArray477[0] = local771[local893];
										Static171.anIntArray477[1] = 1;
										Static171.anIntArray477[2] = local767[local893];
										Static171.anIntArray477[3] = 1;
										Static171.anIntArray477[4] = local787[local893];
										Static171.anIntArray477[5] = local767[local893];
										local1032 = 6;
									} else if (local53[2 - local65 & 0x3] && local893 == local759[2]) {
										Static171.anIntArray477[0] = local771[local893];
										Static171.anIntArray477[1] = 5;
										Static171.anIntArray477[2] = local767[local893];
										Static171.anIntArray477[3] = 5;
										Static171.anIntArray477[4] = local787[local893];
										local1032 = 6;
										Static171.anIntArray477[5] = local767[local893];
									} else if (local53[1 - local65 & 0x3] && local893 == local759[1]) {
										Static171.anIntArray477[0] = local771[local893];
										Static171.anIntArray477[1] = 3;
										Static171.anIntArray477[2] = local767[local893];
										Static171.anIntArray477[3] = 3;
										Static171.anIntArray477[4] = local787[local893];
										Static171.anIntArray477[5] = local767[local893];
										local1032 = 6;
									} else if (local53[3 - local65 & 0x3] && local893 == local759[3]) {
										Static171.anIntArray477[0] = local771[local893];
										Static171.anIntArray477[1] = 7;
										Static171.anIntArray477[2] = local767[local893];
										Static171.anIntArray477[3] = 7;
										Static171.anIntArray477[4] = local787[local893];
										Static171.anIntArray477[5] = local767[local893];
										local1032 = 6;
									} else {
										Static171.anIntArray477[0] = local771[local893];
										Static171.anIntArray477[1] = local787[local893];
										Static171.anIntArray477[2] = local767[local893];
										local1032 = 3;
									}
									for (local1219 = 0; local1219 < local1032; local1219++) {
										local1223 = Static171.anIntArray477[local1219];
										local1300 = local1223 - local65 * 2 & 0x7;
										local1308 = Static222.anIntArray602[local1223];
										@Pc(1720) int local1720 = Static283.anIntArray708[local1223];
										@Pc(1733) int local1733;
										@Pc(1738) int local1738;
										if (local65 == 1) {
											local1733 = local1720;
											local1738 = 128 - local1308;
										} else if (local65 == 2) {
											local1733 = 128 - local1308;
											local1738 = 128 - local1720;
										} else if (local65 == 3) {
											local1733 = 128 - local1720;
											local1738 = local1308;
										} else {
											local1733 = local1308;
											local1738 = local1720;
										}
										local916[local895] = local1733;
										local919[local895] = local1738;
										@Pc(1784) int local1784;
										@Pc(1791) int local1791;
										if (arg7 && Static298.aBooleanArrayArray4[local59][local1223]) {
											local1784 = local1733 + (local1 << 7);
											local1791 = (local19 << 7) + local1738;
											local906[local895] = arg10.method4169(local1784, local1791) - arg0.method4169(local1784, local1791);
										}
										if (local1223 < 8 && Static87.anIntArray719[local1300] >= 0) {
											if (local913 != null) {
												local913[local895] = Static294.anIntArray813[local1300];
											}
											local928[local895] = Static350.anIntArray838[local1300];
											local925[local895] = Static57.anIntArray219[local1300];
											local922[local895] = Static192.anIntArray524[local1300];
										} else {
											if (local50 && Static298.aBooleanArrayArray4[local59][local1223]) {
												local925[local895] = local932;
												local928[local895] = local934;
												local922[local895] = local930;
											} else if (local1733 == 0 && local1738 == 0) {
												local922[local895] = arg2[local1][local19];
												local925[local895] = local1455.anInt2328;
												local928[local895] = local1455.anInt2322;
											} else if (local1733 == 0 && local1738 == 128) {
												local922[local895] = arg2[local1][local35];
												local925[local895] = local1461.anInt2328;
												local928[local895] = local1461.anInt2322;
											} else if (local1733 == 128 && local1738 == 128) {
												local922[local895] = arg2[local17][local35];
												local925[local895] = local1467.anInt2328;
												local928[local895] = local1467.anInt2322;
											} else if (local1733 == 128 && local1738 == 0) {
												local922[local895] = arg2[local17][local19];
												local925[local895] = local1473.anInt2328;
												local928[local895] = local1473.anInt2322;
											} else {
												if (local1733 >= 64) {
													if (local1738 >= 64) {
														local925[local895] = local1467.anInt2328;
														local928[local895] = local1467.anInt2322;
													} else {
														local925[local895] = local1473.anInt2328;
														local928[local895] = local1473.anInt2322;
													}
												} else if (local1738 < 64) {
													local925[local895] = local1455.anInt2328;
													local928[local895] = local1455.anInt2322;
												} else {
													local925[local895] = local1461.anInt2328;
													local928[local895] = local1461.anInt2322;
												}
												local1784 = Static14.method204(local1733 << 7 >> 7, arg2[local1][local19], arg2[local17][local19]);
												local1791 = Static14.method204(local1733 << 7 >> 7, arg2[local1][local35], arg2[local17][local35]);
												local922[local895] = Static14.method204(local1738 << 7 >> 7, local1784, local1791);
											}
											if (local913 != null) {
												local913[local895] = local922[local895];
											}
										}
										local895++;
									}
									local893++;
								}
								if (local59 != 0 && local143.aBoolean157) {
									local48 = true;
								}
							}
							local981 = arg0.method4173(local1, local19);
							local983 = arg0.method4173(local17, local19);
							local1201 = arg0.method4173(local17, local35);
							local1206 = arg0.method4173(local1, local35);
							if (arg6 > 0) {
								@Pc(2129) boolean local2129 = true;
								if (local81 == 0 && local59 != 0) {
									local2129 = false;
								}
								if (local73 > 0 && local145 != null && !local145.aBoolean476) {
									local2129 = false;
								}
								if (local2129 && local981 == local983 && local981 == local1201 && local1206 == local981) {
									Static220.aByteArrayArrayArray9[arg6][local1][local19] = (byte) (Static220.aByteArrayArrayArray9[arg6][local1][local19] | 0x4);
								}
							}
							local1215 = 0;
							local1219 = 0;
							if (arg7) {
								local1215 = Static5.method62(local1, local19);
								local1219 = Static283.method4696(local1, local19);
							}
							arg0.method4161(local1, local19, local916, local906, local919, local922, local913, local925, local928, local1215, local1219, local48);
							Static248.method4274(arg6, local1, local19);
						}
					}
				}
			}
		}
	}
}
