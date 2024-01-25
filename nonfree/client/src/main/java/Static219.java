import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static219 {

	@OriginalMember(owner = "client!nq", name = "H", descriptor = "Lclient!va;")
	public static final Class199 aClass199_22 = new Class199(16);

	@OriginalMember(owner = "client!nq", name = "J", descriptor = "[I")
	public static final int[] anIntArray333 = new int[1000];

	@OriginalMember(owner = "client!nq", name = "b", descriptor = "(Z)V")
	public static void method3896() {
		if (Static268.aString54.toLowerCase().indexOf("microsoft") != -1) {
			Static88.anIntArray197[189] = 26;
			Static88.anIntArray197[187] = 27;
			Static88.anIntArray197[192] = 58;
			Static88.anIntArray197[190] = 72;
			Static88.anIntArray197[221] = 43;
			Static88.anIntArray197[219] = 42;
			Static88.anIntArray197[191] = 73;
			Static88.anIntArray197[186] = 57;
			Static88.anIntArray197[223] = 28;
			Static88.anIntArray197[188] = 71;
			Static88.anIntArray197[220] = 74;
			Static88.anIntArray197[222] = 59;
			return;
		}
		Static88.anIntArray197[45] = 26;
		Static88.anIntArray197[44] = 71;
		Static88.anIntArray197[61] = 27;
		Static88.anIntArray197[93] = 43;
		if (Static268.aMethod1 == null) {
			Static88.anIntArray197[192] = 58;
			Static88.anIntArray197[222] = 59;
		} else {
			Static88.anIntArray197[520] = 59;
			Static88.anIntArray197[222] = 58;
			Static88.anIntArray197[192] = 28;
		}
		Static88.anIntArray197[91] = 42;
		Static88.anIntArray197[92] = 74;
		Static88.anIntArray197[47] = 73;
		Static88.anIntArray197[59] = 57;
		Static88.anIntArray197[46] = 72;
	}

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "([[BLclient!ae;[[BLclient!gh;Lclient!gh;Z[[IIBII[[B[[B)V")
	public static void method3897(@OriginalArg(0) byte[][] arg0, @OriginalArg(1) Class4 arg1, @OriginalArg(2) byte[][] arg2, @OriginalArg(3) Class73 arg3, @OriginalArg(4) Class73 arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int[][] arg6, @OriginalArg(7) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) byte[][] arg10, @OriginalArg(12) byte[][] arg11) {
		for (@Pc(8) int local8 = 0; local8 < arg9; local8++) {
			@Pc(21) int local21 = local8 >= arg9 - 1 ? local8 : local8 + 1;
			for (@Pc(23) int local23 = 0; local23 < arg7; local23++) {
				@Pc(36) int local36 = local23 < arg7 - 1 ? local23 + 1 : local23;
				if (Static257.method4680() || Static85.method1908(arg8, local23, Static69.anInt1511, local8)) {
					@Pc(50) boolean local50 = false;
					@Pc(52) boolean local52 = false;
					@Pc(55) boolean[] local55 = new boolean[4];
					@Pc(61) int local61 = arg11[local8][local23];
					@Pc(67) int local67 = arg2[local8][local23];
					@Pc(75) int local75 = arg10[local8][local23] & 0xFF;
					@Pc(83) int local83 = arg0[local8][local23] & 0xFF;
					@Pc(91) int local91 = arg0[local8][local36] & 0xFF;
					@Pc(99) int local99 = arg0[local21][local36] & 0xFF;
					@Pc(107) int local107 = arg0[local21][local23] & 0xFF;
					if (local75 != 0 || local83 != 0) {
						@Pc(127) Class150 local127 = local75 == 0 ? null : Static19.method676(local75 - 1);
						@Pc(137) Class39 local137 = local83 == 0 ? null : Static247.method4480(local83 - 1);
						if (local61 == 0 && local127 == null) {
							local61 = 12;
						}
						@Pc(145) Class150 local145 = local127;
						if (local127 != null) {
							if (local127.anInt4535 == -1 && local127.anInt4538 == -1) {
								local145 = local127;
								local127 = null;
							} else if (local137 != null && local61 != 0) {
								local52 = local127.aBoolean415;
							}
						}
						@Pc(239) int local239;
						@Pc(275) int local275;
						@Pc(336) int local336;
						@Pc(346) int local346;
						if ((local61 == 0 || local61 == 12) && local8 > 0 && local23 > 0 && arg9 > local8 && arg7 > local23) {
							@Pc(218) int local218 = local83 == arg0[local21][local36] ? 1 : -1;
							local239 = arg0[local8 - 1][local23 - 1] == local83 ? 1 : -1;
							@Pc(260) int local260 = local83 == arg0[local21][local23 - 1] ? 1 : -1;
							local275 = arg0[local8 - 1][local36] == local83 ? 1 : -1;
							if (local83 == arg0[local8][local23 - 1]) {
								local260++;
								local239++;
							} else {
								local260--;
								local239--;
							}
							if (local83 == arg0[local21][local23]) {
								local218++;
								local260++;
							} else {
								local218--;
								local260--;
							}
							if (arg0[local8][local36] == local83) {
								local275++;
								local218++;
							} else {
								local218--;
								local275--;
							}
							if (arg0[local8 - 1][local23] == local83) {
								local239++;
								local275++;
							} else {
								local239--;
								local275--;
							}
							local336 = local239 - local218;
							if (local336 < 0) {
								local336 = -local336;
							}
							local346 = local260 - local275;
							if (local346 < 0) {
								local346 = -local346;
							}
							if (local336 == local346) {
								local336 = arg4.method4931(local8, local23) - arg4.method4931(local21, local36);
								if (local336 < 0) {
									local336 = -local336;
								}
								local346 = arg4.method4931(local21, local23) - arg4.method4931(local8, local36);
								if (local346 < 0) {
									local346 = -local346;
								}
							}
							local67 = local346 > local336 ? 1 : 0;
						}
						for (local239 = 0; local239 < 13; local239++) {
							Static179.anIntArray293[local239] = -1;
							Static31.anIntArray38[local239] = 1;
						}
						@Pc(426) boolean[] local426 = local127 != null && local127.aBoolean415 ? Static203.aBooleanArrayArray15[local61] : Static129.aBooleanArrayArray9[local61];
						Static227.method3972(arg7, local61, arg9, local23, arg2, local137, arg10, local8, local127, local67, arg11, arg1, local55);
						@Pc(456) boolean local456 = local127 != null && local127.anInt4538 != local127.anInt4535;
						if (!local456) {
							for (local275 = 0; local275 < 8; local275++) {
								if (Static179.anIntArray293[local275] >= 0 && Static180.anIntArray294[local275] != Static157.anIntArray267[local275]) {
									local456 = true;
									break;
								}
							}
						}
						if (!local426[local67 + 1 & 0x3]) {
							local55[1] = Static351.method4765(local55[1], (Static31.anIntArray38[2] & Static31.anIntArray38[4]) == 0);
						}
						if (!local426[local67 + 3 & 0x3]) {
							local55[3] = Static351.method4765(local55[3], (Static31.anIntArray38[0] & Static31.anIntArray38[6]) == 0);
						}
						if (!local426[local67 & 0x3]) {
							local55[0] = Static351.method4765(local55[0], (Static31.anIntArray38[2] & Static31.anIntArray38[0]) == 0);
						}
						if (!local426[local67 + 2 & 0x3]) {
							local55[2] = Static351.method4765(local55[2], (Static31.anIntArray38[4] & Static31.anIntArray38[6]) == 0);
						}
						if (!local52 && (local61 == 0 || local61 == 12)) {
							if (local55[0] && !local55[1] && !local55[2] && local55[3]) {
								local61 = local61 == 0 ? 13 : 14;
								local67 = 0;
								local55[0] = local55[3] = false;
							} else if (local55[0] && local55[1] && !local55[2] && !local55[3]) {
								local61 = local61 == 0 ? 13 : 14;
								local55[0] = local55[1] = false;
								local67 = 3;
							} else if (!local55[0] && local55[1] && local55[2] && !local55[3]) {
								local61 = local61 == 0 ? 13 : 14;
								local55[1] = local55[2] = false;
								local67 = 2;
							} else if (!local55[0] && !local55[1] && local55[2] && local55[3]) {
								local61 = local61 == 0 ? 13 : 14;
								local67 = 1;
								local55[2] = local55[3] = false;
							}
						}
						@Pc(773) boolean local773 = !local52 && !local55[0] && !local55[2] && !local55[1] && !local55[3];
						@Pc(775) int[] local775 = null;
						@Pc(791) int[] local791;
						@Pc(811) int[] local811;
						@Pc(807) int[] local807;
						if (local773) {
							local791 = Static98.anIntArrayArray66[local61];
							local807 = Static120.anIntArrayArray79[local61];
							local336 = local137 == null ? 0 : Static194.anIntArray303[local61];
							local346 = local127 == null ? 0 : Static113.anIntArray228[local61];
							local811 = Static34.anIntArrayArray22[local61];
						} else if (local52) {
							local807 = Static350.anIntArrayArray186[local61];
							local791 = Static159.anIntArrayArray97[local61];
							local336 = local137 == null ? 0 : Static2.anIntArray2[local61];
							local346 = local127 == null ? 0 : Static315.anIntArray468[local61];
							local811 = Static151.anIntArrayArray95[local61];
							local775 = Static341.anIntArrayArray188[local61];
						} else {
							local346 = local127 == null ? 0 : Static129.anIntArray236[local61];
							local791 = Static226.anIntArrayArray99[local61];
							local775 = Static253.anIntArrayArray190[local61];
							local336 = local137 == null ? 0 : Static301.anIntArray382[local61];
							local807 = Static92.anIntArrayArray17[local61];
							local811 = Static26.anIntArrayArray18[local61];
						}
						@Pc(877) int local877 = local336 + local346;
						if (local877 <= 0) {
							Static65.method1493(arg8, local8, local23);
						} else {
							if (local55[0]) {
								local877++;
							}
							if (local55[2]) {
								local877++;
							}
							if (local55[1]) {
								local877++;
							}
							if (local55[3]) {
								local877++;
							}
							@Pc(907) int local907 = 0;
							@Pc(909) int local909 = 0;
							@Pc(913) int local913 = local877 * 3;
							@Pc(920) int[] local920 = arg5 ? new int[local913] : null;
							@Pc(927) int[] local927 = local456 ? new int[local913] : null;
							@Pc(930) int[] local930 = new int[local913];
							@Pc(933) int[] local933 = new int[local913];
							@Pc(936) int[] local936 = new int[local913];
							@Pc(939) int[] local939 = new int[local913];
							@Pc(942) int[] local942 = new int[local913];
							@Pc(944) int local944 = -1;
							@Pc(946) int local946 = -1;
							@Pc(948) int local948 = 256;
							@Pc(1016) byte local1016;
							@Pc(970) int local970;
							@Pc(972) int local972;
							@Pc(1204) int local1204;
							@Pc(1210) int local1210;
							@Pc(1219) int local1219;
							@Pc(1223) int local1223;
							@Pc(1227) int local1227;
							@Pc(1306) int local1306;
							@Pc(1314) int local1314;
							if (local127 != null) {
								local944 = local127.anInt4535;
								local946 = arg1.method4297() ? local127.anInt4545 : local127.anInt4534;
								local948 = local127.anInt4536;
								local970 = Static77.method1765(arg1, local127);
								for (local972 = 0; local972 < local346; local972++) {
									if (local55[-local67 & 0x3] && local775[0] == local907) {
										Static283.anIntArray417[0] = local791[local907];
										Static283.anIntArray417[1] = 1;
										Static283.anIntArray417[2] = local807[local907];
										Static283.anIntArray417[3] = 1;
										Static283.anIntArray417[4] = local811[local907];
										local1016 = 6;
										Static283.anIntArray417[5] = local807[local907];
									} else if (local55[2 - local67 & 0x3] && local775[2] == local907) {
										Static283.anIntArray417[0] = local791[local907];
										Static283.anIntArray417[1] = 5;
										Static283.anIntArray417[2] = local807[local907];
										Static283.anIntArray417[3] = 5;
										Static283.anIntArray417[4] = local811[local907];
										Static283.anIntArray417[5] = local807[local907];
										local1016 = 6;
									} else if (local55[1 - local67 & 0x3] && local775[1] == local907) {
										Static283.anIntArray417[0] = local791[local907];
										Static283.anIntArray417[1] = 3;
										Static283.anIntArray417[2] = local807[local907];
										Static283.anIntArray417[3] = 3;
										Static283.anIntArray417[4] = local811[local907];
										Static283.anIntArray417[5] = local807[local907];
										local1016 = 6;
									} else if (local55[3 - local67 & 0x3] && local775[3] == local907) {
										Static283.anIntArray417[0] = local791[local907];
										Static283.anIntArray417[1] = 7;
										Static283.anIntArray417[2] = local807[local907];
										Static283.anIntArray417[3] = 7;
										Static283.anIntArray417[4] = local811[local907];
										local1016 = 6;
										Static283.anIntArray417[5] = local807[local907];
									} else {
										Static283.anIntArray417[0] = local791[local907];
										Static283.anIntArray417[1] = local811[local907];
										local1016 = 3;
										Static283.anIntArray417[2] = local807[local907];
									}
									for (local1204 = 0; local1204 < local1016; local1204++) {
										local1210 = Static283.anIntArray417[local1204];
										local1219 = local1210 - local67 * 2 & 0x7;
										local1223 = Static60.anIntArray102[local1210];
										local1227 = Static319.anIntArray473[local1210];
										if (local67 == 1) {
											local930[local909] = local1227;
											local933[local909] = 128 - local1223;
										} else if (local67 == 2) {
											local930[local909] = 128 - local1223;
											local933[local909] = 128 - local1227;
										} else if (local67 == 3) {
											local930[local909] = 128 - local1227;
											local933[local909] = local1223;
										} else {
											local930[local909] = local1223;
											local933[local909] = local1227;
										}
										if (arg5 && Static60.aBooleanArrayArray1[local61][local1210]) {
											local1306 = (local8 << 7) + local930[local909];
											local1314 = (local23 << 7) + local933[local909];
											local920[local909] = arg3.method4932(local1306, local1314) - arg4.method4932(local1306, local1314);
										}
										if (local1210 < 8 && Static179.anIntArray293[local1219] > local127.anInt4543) {
											if (local927 != null) {
												local927[local909] = Static157.anIntArray267[local1219];
											}
											local942[local909] = Static39.anIntArray77[local1219];
											local939[local909] = Static208.anIntArray323[local1219];
											local936[local909] = Static180.anIntArray294[local1219];
										} else {
											if (local927 != null) {
												local927[local909] = local970;
											}
											local939[local909] = arg1.method4297() ? local127.anInt4545 : local127.anInt4534;
											local942[local909] = local127.anInt4536;
											local936[local909] = local944;
										}
										local909++;
									}
									local907++;
								}
								if (!arg5 && arg8 == 0) {
									Static305.method5357(local8, local23, local127.anInt4531, local127.anInt4533 * 8);
								}
								if (local61 != 12 && local127.anInt4535 != -1 && local127.aBoolean416) {
									local50 = true;
								}
							} else if (local773) {
								local907 = Static113.anIntArray228[local61];
							} else if (local52) {
								local907 = Static315.anIntArray468[local61];
							} else {
								local907 = Static129.anIntArray236[local61];
							}
							if (local137 != null) {
								if (local91 == 0) {
									local91 = local83;
								}
								if (local99 == 0) {
									local99 = local83;
								}
								if (local107 == 0) {
									local107 = local83;
								}
								@Pc(1487) Class39 local1487 = Static247.method4480(local83 - 1);
								@Pc(1493) Class39 local1493 = Static247.method4480(local91 - 1);
								@Pc(1499) Class39 local1499 = Static247.method4480(local99 - 1);
								@Pc(1505) Class39 local1505 = Static247.method4480(local107 - 1);
								for (local1219 = 0; local1219 < local336; local1219++) {
									if (local55[-local67 & 0x3] && local775[0] == local907) {
										Static283.anIntArray417[0] = local791[local907];
										Static283.anIntArray417[1] = 1;
										Static283.anIntArray417[2] = local807[local907];
										Static283.anIntArray417[3] = 1;
										Static283.anIntArray417[4] = local811[local907];
										local1016 = 6;
										Static283.anIntArray417[5] = local807[local907];
									} else if (local55[2 - local67 & 0x3] && local907 == local775[2]) {
										Static283.anIntArray417[0] = local791[local907];
										Static283.anIntArray417[1] = 5;
										Static283.anIntArray417[2] = local807[local907];
										Static283.anIntArray417[3] = 5;
										Static283.anIntArray417[4] = local811[local907];
										Static283.anIntArray417[5] = local807[local907];
										local1016 = 6;
									} else if (local55[1 - local67 & 0x3] && local907 == local775[1]) {
										Static283.anIntArray417[0] = local791[local907];
										Static283.anIntArray417[1] = 3;
										Static283.anIntArray417[2] = local807[local907];
										Static283.anIntArray417[3] = 3;
										Static283.anIntArray417[4] = local811[local907];
										Static283.anIntArray417[5] = local807[local907];
										local1016 = 6;
									} else if (local55[3 - local67 & 0x3] && local907 == local775[3]) {
										Static283.anIntArray417[0] = local791[local907];
										Static283.anIntArray417[1] = 7;
										Static283.anIntArray417[2] = local807[local907];
										Static283.anIntArray417[3] = 7;
										Static283.anIntArray417[4] = local811[local907];
										local1016 = 6;
										Static283.anIntArray417[5] = local807[local907];
									} else {
										Static283.anIntArray417[0] = local791[local907];
										Static283.anIntArray417[1] = local811[local907];
										Static283.anIntArray417[2] = local807[local907];
										local1016 = 3;
									}
									for (local1223 = 0; local1223 < local1016; local1223++) {
										local1227 = Static283.anIntArray417[local1223];
										local1306 = local1227 - local67 * 2 & 0x7;
										local1314 = Static60.anIntArray102[local1227];
										@Pc(1761) int local1761 = Static319.anIntArray473[local1227];
										@Pc(1773) int local1773;
										@Pc(1771) int local1771;
										if (local67 == 1) {
											local1771 = 128 - local1314;
											local1773 = local1761;
										} else if (local67 == 2) {
											local1771 = 128 - local1761;
											local1773 = 128 - local1314;
										} else if (local67 == 3) {
											local1773 = 128 - local1761;
											local1771 = local1314;
										} else {
											local1771 = local1761;
											local1773 = local1314;
										}
										local930[local909] = local1773;
										local933[local909] = local1771;
										@Pc(1831) int local1831;
										@Pc(1838) int local1838;
										if (arg5 && Static60.aBooleanArrayArray1[local61][local1227]) {
											local1831 = (local8 << 7) + local1773;
											local1838 = (local23 << 7) + local1771;
											local920[local909] = arg3.method4932(local1831, local1838) - arg4.method4932(local1831, local1838);
										}
										if (local1227 < 8 && Static179.anIntArray293[local1306] >= 0) {
											if (local927 != null) {
												local927[local909] = Static157.anIntArray267[local1306];
											}
											local942[local909] = Static39.anIntArray77[local1306];
											local939[local909] = Static208.anIntArray323[local1306];
											local936[local909] = Static180.anIntArray294[local1306];
										} else {
											if (local52 && Static60.aBooleanArrayArray1[local61][local1227]) {
												local939[local909] = local946;
												local942[local909] = local948;
												local936[local909] = local944;
											} else if (local1773 == 0 && local1771 == 0) {
												local936[local909] = arg6[local8][local23];
												local939[local909] = local1487.anInt1113;
												local942[local909] = local1487.anInt1106;
											} else if (local1773 == 0 && local1771 == 128) {
												local936[local909] = arg6[local8][local36];
												local939[local909] = local1493.anInt1113;
												local942[local909] = local1493.anInt1106;
											} else if (local1773 == 128 && local1771 == 128) {
												local936[local909] = arg6[local21][local36];
												local939[local909] = local1499.anInt1113;
												local942[local909] = local1499.anInt1106;
											} else if (local1773 == 128 && local1771 == 0) {
												local936[local909] = arg6[local21][local23];
												local939[local909] = local1505.anInt1113;
												local942[local909] = local1505.anInt1106;
											} else {
												if (local1773 < 64) {
													if (local1771 < 64) {
														local939[local909] = local1487.anInt1113;
														local942[local909] = local1487.anInt1106;
													} else {
														local939[local909] = local1493.anInt1113;
														local942[local909] = local1493.anInt1106;
													}
												} else if (local1771 >= 64) {
													local939[local909] = local1499.anInt1113;
													local942[local909] = local1499.anInt1106;
												} else {
													local939[local909] = local1505.anInt1113;
													local942[local909] = local1505.anInt1106;
												}
												local1831 = Static185.method3336(local1773 << 7 >> 7, arg6[local8][local23], arg6[local21][local23]);
												local1838 = Static185.method3336(local1773 << 7 >> 7, arg6[local8][local36], arg6[local21][local36]);
												local936[local909] = Static185.method3336(local1771 << 7 >> 7, local1831, local1838);
											}
											if (local927 != null) {
												local927[local909] = local936[local909];
											}
										}
										local909++;
									}
									local907++;
								}
								if (local61 != 0 && local137.aBoolean101) {
									local50 = true;
								}
							}
							local970 = arg4.method4931(local8, local23);
							local972 = arg4.method4931(local21, local23);
							local1204 = arg4.method4931(local21, local36);
							local1210 = arg4.method4931(local8, local36);
							if (arg8 > 0) {
								@Pc(2180) boolean local2180 = true;
								if (local83 == 0 && local61 != 0) {
									local2180 = false;
								}
								if (local75 > 0 && local145 != null && !local145.aBoolean414) {
									local2180 = false;
								}
								if (local2180 && local972 == local970 && local1204 == local970 && local1210 == local970) {
									Static272.aByteArrayArrayArray9[arg8][local8][local23] = (byte) (Static272.aByteArrayArrayArray9[arg8][local8][local23] | 0x4);
								}
							}
							local1219 = 0;
							local1223 = 0;
							if (arg5) {
								local1219 = Static296.method5233(local8, local23);
								local1223 = Static284.method5096(local8, local23);
							}
							arg4.method4934(local8, local23, local930, local920, local933, local936, local927, local939, local942, local1219, local1223, local50);
							Static65.method1493(arg8, local8, local23);
						}
					}
				}
			}
		}
	}
}
