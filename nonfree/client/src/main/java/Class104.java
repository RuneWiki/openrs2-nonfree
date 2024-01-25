import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hd")
public class Class104 {

	@OriginalMember(owner = "client!hd", name = "z", descriptor = "[[[B")
	public byte[][][] aByteArrayArrayArray14;

	@OriginalMember(owner = "client!hd", name = "e", descriptor = "[I")
	private final int[] anIntArray351 = new int[] { 0, 0, 0, 64, 128, 128, 128, 64, 64, 96, 32, 32, 64 };

	@OriginalMember(owner = "client!hd", name = "r", descriptor = "[I")
	private final int[] anIntArray352 = new int[] { 0, 64, 128, 128, 128, 64, 0, 0, 32, 64, 32, 96, 64 };

	@OriginalMember(owner = "client!hd", name = "A", descriptor = "I")
	protected final int anInt4711;

	@OriginalMember(owner = "client!hd", name = "h", descriptor = "I")
	protected final int anInt4702;

	@OriginalMember(owner = "client!hd", name = "q", descriptor = "Z")
	public final boolean aBoolean425;

	@OriginalMember(owner = "client!hd", name = "s", descriptor = "Lclient!pv;")
	private final Class204 aClass204_6;

	@OriginalMember(owner = "client!hd", name = "F", descriptor = "Lclient!dq;")
	private final Class60 aClass60_4;

	@OriginalMember(owner = "client!hd", name = "C", descriptor = "I")
	public final int anInt4713;

	@OriginalMember(owner = "client!hd", name = "t", descriptor = "[[[B")
	protected byte[][][] aByteArrayArrayArray12;

	@OriginalMember(owner = "client!hd", name = "u", descriptor = "[[[B")
	private final byte[][][] aByteArrayArrayArray13;

	@OriginalMember(owner = "client!hd", name = "k", descriptor = "[[[B")
	private final byte[][][] aByteArrayArrayArray10;

	@OriginalMember(owner = "client!hd", name = "p", descriptor = "[[[B")
	private final byte[][][] aByteArrayArrayArray11;

	@OriginalMember(owner = "client!hd", name = "x", descriptor = "[[[I")
	public final int[][][] anIntArrayArrayArray5;

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "[[[B")
	private final byte[][][] aByteArrayArrayArray9;

	@OriginalMember(owner = "client!hd", name = "<init>", descriptor = "(IIIZLclient!pv;Lclient!dq;)V")
	protected Class104(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) Class204 arg4, @OriginalArg(5) Class60 arg5) {
		this.anInt4711 = arg2;
		this.anInt4702 = arg1;
		this.aBoolean425 = arg3;
		this.aClass204_6 = arg4;
		this.aClass60_4 = arg5;
		this.anInt4713 = arg0;
		this.aByteArrayArrayArray12 = new byte[this.anInt4713][this.anInt4702 + 1][this.anInt4711 + 1];
		this.aByteArrayArrayArray13 = new byte[this.anInt4713][this.anInt4702][this.anInt4711];
		this.aByteArrayArrayArray10 = new byte[this.anInt4713][this.anInt4702][this.anInt4711];
		this.aByteArrayArrayArray11 = new byte[this.anInt4713][this.anInt4702][this.anInt4711];
		this.anIntArrayArrayArray5 = new int[this.anInt4713][this.anInt4702 + 1][this.anInt4711 + 1];
		this.aByteArrayArrayArray9 = new byte[this.anInt4713][this.anInt4702][this.anInt4711];
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(BI[[I)V")
	public final void method3712(@OriginalArg(2) int[][] arg0) {
		@Pc(10) int[][] local10 = this.anIntArrayArrayArray5[0];
		for (@Pc(12) int local12 = 0; local12 < this.anInt4702 + 1; local12++) {
			for (@Pc(16) int local16 = 0; local16 < this.anInt4711 + 1; local16++) {
				local10[local12][local16] += arg0[local12][local16];
			}
		}
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(IIZIIIIILclient!wm;II)V")
	private void method3713(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) Class1_Sub19 arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		if (arg8 == 1) {
			arg9 = 1;
		} else if (arg8 == 2) {
			arg1 = 1;
			arg9 = 1;
		} else if (arg8 == 3) {
			arg1 = 1;
		}
		@Pc(71) int local71;
		if (arg6 < 0 || this.anInt4702 <= arg6 || arg3 < 0 || this.anInt4711 <= arg3) {
			while (true) {
				local71 = arg7.method2915();
				if (local71 == 0) {
					return;
				}
				if (local71 == 1) {
					arg7.method2915();
					return;
				}
				if (local71 <= 49) {
					arg7.method2915();
				}
			}
			return;
		}
		if (!this.aBoolean425 && !arg2) {
			Static278.aByteArrayArrayArray16[arg4][arg6][arg3] = 0;
		}
		while (true) {
			local71 = arg7.method2915();
			if (local71 == 0) {
				if (this.aBoolean425) {
					this.anIntArrayArrayArray5[0][arg6 + arg1][arg9 + arg3] = 0;
					return;
				} else if (arg4 == 0) {
					this.anIntArrayArrayArray5[0][arg1 + arg6][arg3 + arg9] = -Static458.method5896(arg5 + 932731, arg0 + 556238) * 8 << 0;
					return;
				} else {
					this.anIntArrayArrayArray5[arg4][arg1 + arg6][arg9 + arg3] = this.anIntArrayArrayArray5[arg4 - 1][arg1 + arg6][arg9 + arg3] - 240;
					return;
				}
			}
			if (local71 == 1) {
				@Pc(200) int local200 = arg7.method2915();
				if (!this.aBoolean425) {
					if (local200 == 1) {
						local200 = 0;
					}
					if (arg4 != 0) {
						this.anIntArrayArrayArray5[arg4][arg6 + arg1][arg9 + arg3] = this.anIntArrayArrayArray5[arg4 - 1][arg6 + arg1][arg3 + arg9] - (local200 * 8 << 0);
						return;
					}
					this.anIntArrayArrayArray5[0][arg1 + arg6][arg9 + arg3] = -local200 * 8 << 0;
					return;
				}
				this.anIntArrayArrayArray5[0][arg6 + arg1][arg9 + arg3] = local200 * 8 << 0;
				return;
			}
			if (local71 <= 49) {
				if (arg2) {
					arg7.method2915();
				} else {
					this.aByteArrayArrayArray13[arg4][arg6][arg3] = arg7.method2917();
					this.aByteArrayArrayArray11[arg4][arg6][arg3] = (byte) ((local71 - 2) / 4);
					this.aByteArrayArrayArray9[arg4][arg6][arg3] = (byte) (local71 + arg8 - 2 & 0x3);
				}
			} else if (local71 <= 81) {
				if (!this.aBoolean425 && !arg2) {
					Static278.aByteArrayArrayArray16[arg4][arg6][arg3] = (byte) (local71 - 49);
				}
			} else if (!arg2) {
				this.aByteArrayArrayArray10[arg4][arg6][arg3] = (byte) (local71 - 81);
			}
		}
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(Lclient!ya;Lclient!ya;Lclient!za;[[IIILclient!ya;)V")
	private void method3714(@OriginalArg(0) Class139 arg0, @OriginalArg(1) Class139 arg1, @OriginalArg(2) Class117 arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class139 arg5) {
		@Pc(14) byte[][] local14 = this.aByteArrayArrayArray11[arg4];
		@Pc(19) byte[][] local19 = this.aByteArrayArrayArray9[arg4];
		@Pc(24) byte[][] local24 = this.aByteArrayArrayArray10[arg4];
		@Pc(29) byte[][] local29 = this.aByteArrayArrayArray13[arg4];
		for (@Pc(31) int local31 = 0; local31 < this.anInt4702; local31++) {
			@Pc(49) int local49 = local31 >= this.anInt4702 - 1 ? local31 : local31 + 1;
			for (@Pc(51) int local51 = 0; local51 < this.anInt4711; local51++) {
				@Pc(69) int local69 = local51 < this.anInt4711 - 1 ? local51 + 1 : local51;
				if (Static174.anInt2866 == -1 || Static140.method1765(Static174.anInt2866, local31, local51, arg4)) {
					@Pc(83) boolean local83 = false;
					@Pc(85) boolean local85 = false;
					@Pc(88) boolean[] local88 = new boolean[4];
					@Pc(94) int local94 = local14[local31][local51];
					@Pc(100) int local100 = local19[local31][local51];
					@Pc(108) int local108 = local29[local31][local51] & 0xFF;
					@Pc(116) int local116 = local24[local31][local51] & 0xFF;
					@Pc(124) int local124 = local24[local31][local69] & 0xFF;
					@Pc(132) int local132 = local24[local49][local69] & 0xFF;
					@Pc(140) int local140 = local24[local49][local51] & 0xFF;
					if (local108 != 0 || local116 != 0) {
						@Pc(165) Class49 local165 = local108 == 0 ? null : this.aClass204_6.method4347(local108 - 1);
						if (local94 == 0 && local165 == null) {
							local94 = 12;
						}
						@Pc(189) Class6 local189 = local116 == 0 ? null : this.aClass60_4.method970(local116 - 1);
						@Pc(191) Class49 local191 = local165;
						if (local165 != null) {
							if (local165.anInt1001 == -1 && local165.anInt1003 == -1) {
								local191 = local165;
								local165 = null;
							} else if (local189 != null && local94 != 0) {
								local85 = local165.aBoolean122;
							}
						}
						@Pc(305) int local305;
						@Pc(335) int local335;
						@Pc(389) int local389;
						@Pc(402) int local402;
						if ((local94 == 0 || local94 == 12) && local31 > 0 && local51 > 0 && this.anInt4702 > local31 && this.anInt4711 > local51) {
							@Pc(267) int local267 = local116 == local24[local49][local51 - 1] ? 1 : -1;
							@Pc(284) int local284 = local24[local49][local69] == local116 ? 1 : -1;
							local305 = local116 == local24[local31 - 1][local51 - 1] ? 1 : -1;
							if (local24[local31][local51 - 1] == local116) {
								local305++;
								local267++;
							} else {
								local267--;
								local305--;
							}
							local335 = local24[local31 - 1][local69] == local116 ? 1 : -1;
							if (local24[local49][local51] == local116) {
								local284++;
								local267++;
							} else {
								local284--;
								local267--;
							}
							if (local24[local31][local69] == local116) {
								local284++;
								local335++;
							} else {
								local284--;
								local335--;
							}
							if (local24[local31 - 1][local51] == local116) {
								local335++;
								local305++;
							} else {
								local305--;
								local335--;
							}
							local389 = local305 - local284;
							if (local389 < 0) {
								local389 = -local389;
							}
							local402 = local267 - local335;
							if (local402 < 0) {
								local402 = -local402;
							}
							if (local402 == local389) {
								local389 = arg1.ua(local31, local51) - arg1.ua(local49, local69);
								if (local389 < 0) {
									local389 = -local389;
								}
								local402 = arg1.ua(local49, local51) - arg1.ua(local31, local69);
								if (local402 < 0) {
									local402 = -local402;
								}
							}
							local100 = local402 <= local389 ? 0 : 1;
						}
						for (local305 = 0; local305 < 13; local305++) {
							Static50.anIntArray106[local305] = -1;
							Static432.anIntArray491[local305] = 1;
						}
						@Pc(490) boolean[] local490 = local165 != null && local165.aBoolean122 ? Static175.aBooleanArrayArray5[local94] : Static138.aBooleanArrayArray4[local94];
						this.method3715(local100, arg2, local94, local29, local14, local88, this.anInt4711, local19, this.anInt4702, local165, local31, local189, local51);
						@Pc(523) boolean local523 = local165 != null && local165.anInt1001 != local165.anInt1003;
						if (!local523) {
							for (local335 = 0; local335 < 8; local335++) {
								if (Static50.anIntArray106[local335] >= 0 && Static301.anIntArray378[local335] != Static220.anIntArray285[local335]) {
									local523 = true;
									break;
								}
							}
						}
						if (!local490[local100 + 1 & 0x3]) {
							local88[1] = Static129.method1588(local88[1], (Static432.anIntArray491[2] & Static432.anIntArray491[4]) == 0);
						}
						if (!local490[local100 + 3 & 0x3]) {
							local88[3] = Static129.method1588(local88[3], (Static432.anIntArray491[0] & Static432.anIntArray491[6]) == 0);
						}
						if (!local490[local100 & 0x3]) {
							local88[0] = Static129.method1588(local88[0], (Static432.anIntArray491[2] & Static432.anIntArray491[0]) == 0);
						}
						if (!local490[local100 + 2 & 0x3]) {
							local88[2] = Static129.method1588(local88[2], (Static432.anIntArray491[6] & Static432.anIntArray491[4]) == 0);
						}
						if (!local85 && (local94 == 0 || local94 == 12)) {
							if (local88[0] && !local88[1] && !local88[2] && local88[3]) {
								local94 = local94 == 0 ? 13 : 14;
								local88[0] = local88[3] = false;
								local100 = 0;
							} else if (local88[0] && local88[1] && !local88[2] && !local88[3]) {
								local88[0] = local88[1] = false;
								local100 = 3;
								local94 = local94 == 0 ? 13 : 14;
							} else if (!local88[0] && local88[1] && local88[2] && !local88[3]) {
								local100 = 2;
								local94 = local94 == 0 ? 13 : 14;
								local88[1] = local88[2] = false;
							} else if (!local88[0] && !local88[1] && local88[2] && local88[3]) {
								local94 = local94 == 0 ? 13 : 14;
								local100 = 1;
								local88[2] = local88[3] = false;
							}
						}
						@Pc(825) boolean local825 = !local85 && !local88[0] && !local88[2] && !local88[1] && !local88[3];
						@Pc(827) int[] local827 = null;
						@Pc(857) int[] local857;
						@Pc(845) int[] local845;
						@Pc(841) int[] local841;
						if (local825) {
							local402 = local165 == null ? 0 : Static39.anIntArray68[local94];
							local841 = Static110.anIntArrayArray19[local94];
							local845 = Static24.anIntArrayArray9[local94];
							local389 = local189 == null ? 0 : Static172.anIntArray224[local94];
							local857 = Static302.anIntArrayArray42[local94];
						} else if (local85) {
							local857 = Static101.anIntArrayArray17[local94];
							local827 = Static218.anIntArrayArray32[local94];
							local841 = Static52.anIntArrayArray14[local94];
							local845 = Static229.anIntArrayArray33[local94];
							local402 = local165 == null ? 0 : Static224.anIntArray288[local94];
							local389 = local189 == null ? 0 : Static126.anIntArray166[local94];
						} else {
							local402 = local165 == null ? 0 : Static387.anIntArray460[local94];
							local389 = local189 == null ? 0 : Static217.anIntArray123[local94];
							local845 = Static7.anIntArrayArray7[local94];
							local827 = Static255.anIntArrayArray38[local94];
							local857 = Static84.anIntArrayArray15[local94];
							local841 = Static230.anIntArrayArray34[local94];
						}
						@Pc(930) int local930 = local389 + local402;
						if (local930 <= 0) {
							Static74.method3130(arg4, local31, local51);
						} else {
							if (local88[0]) {
								local930++;
							}
							if (local88[2]) {
								local930++;
							}
							if (local88[1]) {
								local930++;
							}
							if (local88[3]) {
								local930++;
							}
							@Pc(963) int local963 = 0;
							@Pc(965) int local965 = 0;
							@Pc(969) int local969 = local930 * 3;
							@Pc(976) int[] local976 = local523 ? new int[local969] : null;
							@Pc(979) int[] local979 = new int[local969];
							@Pc(982) int[] local982 = new int[local969];
							@Pc(985) int[] local985 = new int[local969];
							@Pc(988) int[] local988 = new int[local969];
							@Pc(991) int[] local991 = new int[local969];
							@Pc(998) int[] local998 = arg5 == null ? null : new int[local969];
							@Pc(1007) int[] local1007 = arg5 == null && arg0 == null ? null : new int[local969];
							@Pc(1009) int local1009 = -1;
							@Pc(1011) int local1011 = -1;
							@Pc(1013) int local1013 = 256;
							@Pc(1135) byte local1135;
							@Pc(1065) int local1065;
							@Pc(1067) int local1067;
							@Pc(1300) int local1300;
							@Pc(1306) int local1306;
							@Pc(1315) int local1315;
							@Pc(1320) int local1320;
							@Pc(1335) int local1335;
							@Pc(1325) int local1325;
							@Pc(1333) int local1333;
							@Pc(1390) int local1390;
							@Pc(1397) int local1397;
							if (local165 != null) {
								local1009 = local165.anInt1001;
								local1011 = arg2.method5689() ? local165.anInt1007 : local165.anInt999;
								local1013 = local165.anInt1008;
								local1065 = Static149.method1880(arg2, local165);
								for (local1067 = 0; local1067 < local402; local1067++) {
									if (local88[-local100 & 0x3] && local827[0] == local963) {
										Static407.anIntArray471[0] = local857[local963];
										Static407.anIntArray471[1] = 1;
										Static407.anIntArray471[2] = local841[local963];
										Static407.anIntArray471[3] = 1;
										Static407.anIntArray471[4] = local845[local963];
										Static407.anIntArray471[5] = local841[local963];
										local1135 = 6;
									} else if (local88[2 - local100 & 0x3] && local827[2] == local963) {
										Static407.anIntArray471[0] = local857[local963];
										Static407.anIntArray471[1] = 5;
										Static407.anIntArray471[2] = local841[local963];
										Static407.anIntArray471[3] = 5;
										Static407.anIntArray471[4] = local845[local963];
										Static407.anIntArray471[5] = local841[local963];
										local1135 = 6;
									} else if (local88[1 - local100 & 0x3] && local963 == local827[1]) {
										Static407.anIntArray471[0] = local857[local963];
										Static407.anIntArray471[1] = 3;
										Static407.anIntArray471[2] = local841[local963];
										Static407.anIntArray471[3] = 3;
										Static407.anIntArray471[4] = local845[local963];
										local1135 = 6;
										Static407.anIntArray471[5] = local841[local963];
									} else if (local88[3 - local100 & 0x3] && local827[3] == local963) {
										Static407.anIntArray471[0] = local857[local963];
										Static407.anIntArray471[1] = 7;
										Static407.anIntArray471[2] = local841[local963];
										Static407.anIntArray471[3] = 7;
										Static407.anIntArray471[4] = local845[local963];
										Static407.anIntArray471[5] = local841[local963];
										local1135 = 6;
									} else {
										Static407.anIntArray471[0] = local857[local963];
										Static407.anIntArray471[1] = local845[local963];
										Static407.anIntArray471[2] = local841[local963];
										local1135 = 3;
									}
									local963++;
									for (local1300 = 0; local1300 < local1135; local1300++) {
										local1306 = Static407.anIntArray471[local1300];
										local1315 = local1306 - local100 * 2 & 0x7;
										local1320 = this.anIntArray352[local1306];
										local1325 = this.anIntArray351[local1306];
										if (local100 == 1) {
											local1333 = 128 - local1320;
											local1335 = local1325;
										} else if (local100 == 2) {
											local1333 = 128 - local1325;
											local1335 = 128 - local1320;
										} else if (local100 == 3) {
											local1333 = local1320;
											local1335 = 128 - local1325;
										} else {
											local1335 = local1320;
											local1333 = local1325;
										}
										local979[local965] = local1335;
										local982[local965] = local1333;
										if (local998 != null && Static190.aBooleanArrayArray6[local94][local1306]) {
											local1390 = local1335 + (local31 << 7);
											local1397 = (local51 << 7) + local1333;
											local998[local965] = arg5.ca(local1390, local1397) - arg1.ca(local1390, local1397);
										}
										if (local1007 != null) {
											if (arg5 != null && !Static190.aBooleanArrayArray6[local94][local1306]) {
												local1390 = local1335 + (local31 << 7);
												local1397 = local1333 + (local51 << 7);
												local1007[local965] = arg1.ca(local1390, local1397) - arg5.ca(local1390, local1397);
											} else if (arg0 != null && !Static39.aBooleanArrayArray1[local94][local1306]) {
												local1390 = (local31 << 7) + local1335;
												local1397 = (local51 << 7) + local1333;
												local1007[local965] = arg0.ca(local1390, local1397) - arg1.ca(local1390, local1397);
											}
										}
										if (local1306 < 8 && Static50.anIntArray106[local1315] > local165.anInt998) {
											if (local976 != null) {
												local976[local965] = Static220.anIntArray285[local1315];
											}
											local991[local965] = Static140.anIntArray187[local1315];
											local988[local965] = Static156.anIntArray199[local1315];
											local985[local965] = Static301.anIntArray378[local1315];
										} else {
											if (local976 != null) {
												local976[local965] = local1065;
											}
											local988[local965] = arg2.method5689() ? local165.anInt1007 : local165.anInt999;
											local991[local965] = local165.anInt1008;
											local985[local965] = local1009;
										}
										local965++;
									}
								}
								if (!this.aBoolean425 && arg4 == 0) {
									Static240.method3458(local31, local51, local165.anInt1002, local165.anInt1009 * 8, local165.anInt997);
								}
								if (local94 != 12 && local165.anInt1001 != -1 && local165.aBoolean124) {
									local83 = true;
								}
							} else if (local825) {
								local963 = Static39.anIntArray68[local94];
							} else if (local85) {
								local963 = Static224.anIntArray288[local94];
							} else {
								local963 = Static387.anIntArray460[local94];
							}
							if (local189 != null) {
								if (local132 == 0) {
									local132 = local116;
								}
								if (local140 == 0) {
									local140 = local116;
								}
								if (local124 == 0) {
									local124 = local116;
								}
								@Pc(1608) Class6 local1608 = this.aClass60_4.method970(local116 - 1);
								@Pc(1616) Class6 local1616 = this.aClass60_4.method970(local124 - 1);
								@Pc(1624) Class6 local1624 = this.aClass60_4.method970(local132 - 1);
								@Pc(1632) Class6 local1632 = this.aClass60_4.method970(local140 - 1);
								for (local1315 = 0; local1315 < local389; local1315++) {
									if (local88[-local100 & 0x3] && local963 == local827[0]) {
										Static407.anIntArray471[0] = local857[local963];
										Static407.anIntArray471[1] = 1;
										Static407.anIntArray471[2] = local841[local963];
										Static407.anIntArray471[3] = 1;
										Static407.anIntArray471[4] = local845[local963];
										local1135 = 6;
										Static407.anIntArray471[5] = local841[local963];
									} else if (local88[2 - local100 & 0x3] && local827[2] == local963) {
										Static407.anIntArray471[0] = local857[local963];
										Static407.anIntArray471[1] = 5;
										Static407.anIntArray471[2] = local841[local963];
										Static407.anIntArray471[3] = 5;
										Static407.anIntArray471[4] = local845[local963];
										Static407.anIntArray471[5] = local841[local963];
										local1135 = 6;
									} else if (local88[1 - local100 & 0x3] && local827[1] == local963) {
										Static407.anIntArray471[0] = local857[local963];
										Static407.anIntArray471[1] = 3;
										Static407.anIntArray471[2] = local841[local963];
										Static407.anIntArray471[3] = 3;
										Static407.anIntArray471[4] = local845[local963];
										local1135 = 6;
										Static407.anIntArray471[5] = local841[local963];
									} else if (local88[3 - local100 & 0x3] && local963 == local827[3]) {
										Static407.anIntArray471[0] = local857[local963];
										Static407.anIntArray471[1] = 7;
										Static407.anIntArray471[2] = local841[local963];
										Static407.anIntArray471[3] = 7;
										Static407.anIntArray471[4] = local845[local963];
										Static407.anIntArray471[5] = local841[local963];
										local1135 = 6;
									} else {
										Static407.anIntArray471[0] = local857[local963];
										Static407.anIntArray471[1] = local845[local963];
										local1135 = 3;
										Static407.anIntArray471[2] = local841[local963];
									}
									for (local1320 = 0; local1320 < local1135; local1320++) {
										local1335 = Static407.anIntArray471[local1320];
										local1325 = local1335 - local100 * 2 & 0x7;
										local1333 = this.anIntArray352[local1335];
										local1397 = this.anIntArray351[local1335];
										@Pc(1908) int local1908;
										if (local100 == 1) {
											local1390 = local1397;
											local1908 = 128 - local1333;
										} else if (local100 == 2) {
											local1908 = 128 - local1397;
											local1390 = 128 - local1333;
										} else if (local100 == 3) {
											local1908 = local1333;
											local1390 = 128 - local1397;
										} else {
											local1390 = local1333;
											local1908 = local1397;
										}
										local979[local965] = local1390;
										local982[local965] = local1908;
										@Pc(1961) int local1961;
										@Pc(1967) int local1967;
										if (local998 != null && Static190.aBooleanArrayArray6[local94][local1335]) {
											local1961 = (local31 << 7) + local1390;
											local1967 = (local51 << 7) + local1908;
											local998[local965] = arg5.ca(local1961, local1967) - arg1.ca(local1961, local1967);
										}
										if (local1007 != null) {
											if (arg5 != null && !Static190.aBooleanArrayArray6[local94][local1335]) {
												local1961 = (local31 << 7) + local1390;
												local1967 = (local51 << 7) + local1908;
												local1007[local965] = arg1.ca(local1961, local1967) - arg5.ca(local1961, local1967);
											} else if (arg0 != null && !Static39.aBooleanArrayArray1[local94][local1335]) {
												local1961 = local1390 + (local31 << 7);
												local1967 = local1908 + (local51 << 7);
												local1007[local965] = arg0.ca(local1961, local1967) - arg1.ca(local1961, local1967);
											}
										}
										if (local1335 < 8 && Static50.anIntArray106[local1325] >= 0) {
											if (local976 != null) {
												local976[local965] = Static220.anIntArray285[local1325];
											}
											local991[local965] = Static140.anIntArray187[local1325];
											local988[local965] = Static156.anIntArray199[local1325];
											local985[local965] = Static301.anIntArray378[local1325];
										} else {
											if (local85 && Static190.aBooleanArrayArray6[local94][local1335]) {
												local988[local965] = local1011;
												local991[local965] = local1013;
												local985[local965] = local1009;
											} else if (local1390 == 0 && local1908 == 0) {
												local985[local965] = arg3[local31][local51];
												local988[local965] = local1608.anInt49;
												local991[local965] = local1608.anInt48;
											} else if (local1390 == 0 && local1908 == 128) {
												local985[local965] = arg3[local31][local69];
												local988[local965] = local1616.anInt49;
												local991[local965] = local1616.anInt48;
											} else if (local1390 == 128 && local1908 == 128) {
												local985[local965] = arg3[local49][local69];
												local988[local965] = local1624.anInt49;
												local991[local965] = local1624.anInt48;
											} else if (local1390 == 128 && local1908 == 0) {
												local985[local965] = arg3[local49][local51];
												local988[local965] = local1632.anInt49;
												local991[local965] = local1632.anInt48;
											} else {
												if (local1390 < 64) {
													if (local1908 < 64) {
														local988[local965] = local1608.anInt49;
														local991[local965] = local1608.anInt48;
													} else {
														local988[local965] = local1616.anInt49;
														local991[local965] = local1616.anInt48;
													}
												} else if (local1908 < 64) {
													local988[local965] = local1632.anInt49;
													local991[local965] = local1632.anInt48;
												} else {
													local988[local965] = local1624.anInt49;
													local991[local965] = local1624.anInt48;
												}
												local1961 = Static422.method5395(local1390 << 7 >> 7, arg3[local31][local51], arg3[local49][local51]);
												local1967 = Static422.method5395(local1390 << 7 >> 7, arg3[local31][local69], arg3[local49][local69]);
												local985[local965] = Static422.method5395(local1908 << 7 >> 7, local1961, local1967);
											}
											if (local976 != null) {
												local976[local965] = local985[local965];
											}
										}
										local965++;
									}
									local963++;
								}
								if (local94 != 0 && local189.aBoolean9) {
									local83 = true;
								}
							}
							local1065 = arg1.ua(local31, local51);
							local1067 = arg1.ua(local49, local51);
							local1300 = arg1.ua(local49, local69);
							local1306 = arg1.ua(local31, local69);
							if (arg4 > 0) {
								@Pc(2376) boolean local2376 = true;
								if (local116 == 0 && local94 != 0) {
									local2376 = false;
								}
								if (local108 > 0 && local191 != null && !local191.aBoolean123) {
									local2376 = false;
								}
								if (local2376 && local1065 == local1067 && local1065 == local1300 && local1065 == local1306) {
									this.aByteArrayArrayArray12[arg4][local31][local51] = (byte) (this.aByteArrayArrayArray12[arg4][local31][local51] | 0x4);
								}
							}
							local1315 = 0;
							local1320 = 0;
							local1335 = 0;
							if (this.aBoolean425) {
								local1315 = Static258.method3623(local31, local51);
								local1320 = Static85.method5073(local31, local51);
								local1335 = Static364.method4778(local31, local51);
							}
							arg1.pa(local31, local51, local979, local998, local982, local1007, local985, local976, local988, local991, local1315, local1320, local1335, local83);
							Static74.method3130(arg4, local31, local51);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(ILclient!za;I[[B[[BZ[ZI[[BILclient!d;ILclient!ae;I)V")
	private void method3715(@OriginalArg(0) int arg0, @OriginalArg(1) Class117 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[][] arg3, @OriginalArg(4) byte[][] arg4, @OriginalArg(6) boolean[] arg5, @OriginalArg(7) int arg6, @OriginalArg(8) byte[][] arg7, @OriginalArg(9) int arg8, @OriginalArg(10) Class49 arg9, @OriginalArg(11) int arg10, @OriginalArg(12) Class6 arg11, @OriginalArg(13) int arg12) {
		@Pc(18) boolean[] local18 = arg9 != null && arg9.aBoolean122 ? Static175.aBooleanArrayArray5[arg2] : Static138.aBooleanArrayArray4[arg2];
		@Pc(34) int local34;
		@Pc(47) Class49 local47;
		@Pc(64) byte local64;
		@Pc(80) int local80;
		@Pc(85) int local85;
		if (arg12 > 0) {
			if (arg10 > 0) {
				local34 = arg3[arg10 - 1][arg12 - 1] & 0xFF;
				if (local34 > 0) {
					local47 = this.aClass204_6.method4347(local34 - 1);
					if (local47.anInt1001 != -1 && local47.aBoolean122) {
						local64 = arg4[arg10 - 1][arg12 - 1];
						local80 = arg7[arg10 - 1][arg12 - 1] * 2 + 4 & 0x7;
						local85 = Static149.method1880(arg1, local47);
						if (Static190.aBooleanArrayArray6[local64][local80]) {
							Static301.anIntArray378[0] = local47.anInt1001;
							Static220.anIntArray285[0] = local85;
							Static156.anIntArray199[0] = arg1.method5689() ? local47.anInt1007 : local47.anInt999;
							Static140.anIntArray187[0] = local47.anInt1008;
							Static50.anIntArray106[0] = local47.anInt998;
							Static432.anIntArray491[0] = 256;
						}
					}
				}
			}
			if (arg10 < arg8 - 1) {
				local34 = arg3[arg10 + 1][arg12 - 1] & 0xFF;
				if (local34 > 0) {
					local47 = this.aClass204_6.method4347(local34 - 1);
					if (local47.anInt1001 != -1 && local47.aBoolean122) {
						local64 = arg4[arg10 + 1][arg12 - 1];
						local80 = arg7[arg10 + 1][arg12 - 1] * 2 + 6 & 0x7;
						local85 = Static149.method1880(arg1, local47);
						if (Static190.aBooleanArrayArray6[local64][local80]) {
							Static301.anIntArray378[2] = local47.anInt1001;
							Static220.anIntArray285[2] = local85;
							Static156.anIntArray199[2] = arg1.method5689() ? local47.anInt1007 : local47.anInt999;
							Static140.anIntArray187[2] = local47.anInt1008;
							Static50.anIntArray106[2] = local47.anInt998;
							Static432.anIntArray491[2] = 512;
						}
					}
				}
			}
		}
		if (arg6 - 1 > arg12) {
			if (arg10 > 0) {
				local34 = arg3[arg10 - 1][arg12 + 1] & 0xFF;
				if (local34 > 0) {
					local47 = this.aClass204_6.method4347(local34 - 1);
					if (local47.anInt1001 != -1 && local47.aBoolean122) {
						local64 = arg4[arg10 - 1][arg12 + 1];
						local80 = arg7[arg10 - 1][arg12 + 1] * 2 + 2 & 0x7;
						local85 = Static149.method1880(arg1, local47);
						if (Static190.aBooleanArrayArray6[local64][local80]) {
							Static301.anIntArray378[6] = local47.anInt1001;
							Static220.anIntArray285[6] = local85;
							Static156.anIntArray199[6] = arg1.method5689() ? local47.anInt1007 : local47.anInt999;
							Static140.anIntArray187[6] = local47.anInt1008;
							Static50.anIntArray106[6] = local47.anInt998;
							Static432.anIntArray491[6] = 64;
						}
					}
				}
			}
			if (arg8 - 1 > arg10) {
				local34 = arg3[arg10 + 1][arg12 + 1] & 0xFF;
				if (local34 > 0) {
					local47 = this.aClass204_6.method4347(local34 - 1);
					if (local47.anInt1001 != -1 && local47.aBoolean122) {
						local64 = arg4[arg10 + 1][arg12 + 1];
						local80 = arg7[arg10 + 1][arg12 + 1] * 2 & 0x7;
						local85 = Static149.method1880(arg1, local47);
						if (Static190.aBooleanArrayArray6[local64][local80]) {
							Static301.anIntArray378[4] = local47.anInt1001;
							Static220.anIntArray285[4] = local85;
							Static156.anIntArray199[4] = arg1.method5689() ? local47.anInt1007 : local47.anInt999;
							Static140.anIntArray187[4] = local47.anInt1008;
							Static50.anIntArray106[4] = local47.anInt998;
							Static432.anIntArray491[4] = 128;
						}
					}
				}
			}
		}
		@Pc(550) int local550;
		@Pc(555) int local555;
		@Pc(557) int local557;
		@Pc(519) byte local519;
		if (arg12 > 0) {
			local34 = arg3[arg10][arg12 - 1] & 0xFF;
			if (local34 > 0) {
				local47 = this.aClass204_6.method4347(local34 - 1);
				if (local47.anInt1001 != -1) {
					local64 = arg4[arg10][arg12 - 1];
					local519 = arg7[arg10][arg12 - 1];
					if (local47.aBoolean122) {
						local85 = 2;
						local550 = local519 * 2 + 4;
						local555 = Static149.method1880(arg1, local47);
						for (local557 = 0; local557 < 3; local557++) {
							local550 &= 0x7;
							local85 &= 0x7;
							if (Static190.aBooleanArrayArray6[local64][local550] && Static50.anIntArray106[local85] <= local47.anInt998) {
								Static301.anIntArray378[local85] = local47.anInt1001;
								Static220.anIntArray285[local85] = local555;
								Static156.anIntArray199[local85] = arg1.method5689() ? local47.anInt1007 : local47.anInt999;
								Static140.anIntArray187[local85] = local47.anInt1008;
								if (Static50.anIntArray106[local85] == local47.anInt998) {
									Static432.anIntArray491[local85] |= 0x20;
								} else {
									Static432.anIntArray491[local85] = 32;
								}
								Static50.anIntArray106[local85] = local47.anInt998;
							}
							local85--;
							local550++;
						}
						if (!local18[arg0 & 0x3]) {
							arg5[0] = Static175.aBooleanArrayArray5[local64][local519 + 2 & 0x3];
						}
					} else if (!local18[arg0 & 0x3]) {
						arg5[0] = Static138.aBooleanArrayArray4[local64][local519 + 2 & 0x3];
					}
				}
			}
		}
		if (arg6 - 1 > arg12) {
			local34 = arg3[arg10][arg12 + 1] & 0xFF;
			if (local34 > 0) {
				local47 = this.aClass204_6.method4347(local34 - 1);
				if (local47.anInt1001 != -1) {
					local64 = arg4[arg10][arg12 + 1];
					local519 = arg7[arg10][arg12 + 1];
					if (local47.aBoolean122) {
						local85 = 4;
						local550 = local519 * 2 + 2;
						local555 = Static149.method1880(arg1, local47);
						for (local557 = 0; local557 < 3; local557++) {
							local550 &= 0x7;
							local85 &= 0x7;
							if (Static190.aBooleanArrayArray6[local64][local550] && Static50.anIntArray106[local85] <= local47.anInt998) {
								Static301.anIntArray378[local85] = local47.anInt1001;
								Static220.anIntArray285[local85] = local555;
								Static156.anIntArray199[local85] = arg1.method5689() ? local47.anInt1007 : local47.anInt999;
								Static140.anIntArray187[local85] = local47.anInt1008;
								if (Static50.anIntArray106[local85] == local47.anInt998) {
									Static432.anIntArray491[local85] |= 0x10;
								} else {
									Static432.anIntArray491[local85] = 16;
								}
								Static50.anIntArray106[local85] = local47.anInt998;
							}
							local550--;
							local85++;
						}
						if (!local18[arg0 + 2 & 0x3]) {
							arg5[2] = Static175.aBooleanArrayArray5[local64][--local519 & 0x3];
						}
					} else if (!local18[arg0 + 2 & 0x3]) {
						arg5[2] = Static138.aBooleanArrayArray4[local64][local519 & 0x3];
					}
				}
			}
		}
		if (arg10 > 0) {
			local34 = arg3[arg10 - 1][arg12] & 0xFF;
			if (local34 > 0) {
				local47 = this.aClass204_6.method4347(local34 - 1);
				if (local47.anInt1001 != -1) {
					local64 = arg4[arg10 - 1][arg12];
					local519 = arg7[arg10 - 1][arg12];
					if (local47.aBoolean122) {
						local85 = 6;
						local550 = local519 * 2 + 4;
						local555 = Static149.method1880(arg1, local47);
						for (local557 = 0; local557 < 3; local557++) {
							local550 &= 0x7;
							local85 &= 0x7;
							if (Static190.aBooleanArrayArray6[local64][local550] && local47.anInt998 >= Static50.anIntArray106[local85]) {
								Static301.anIntArray378[local85] = local47.anInt1001;
								Static220.anIntArray285[local85] = local555;
								Static156.anIntArray199[local85] = arg1.method5689() ? local47.anInt1007 : local47.anInt999;
								Static140.anIntArray187[local85] = local47.anInt1008;
								if (local47.anInt998 == Static50.anIntArray106[local85]) {
									Static432.anIntArray491[local85] |= 0x8;
								} else {
									Static432.anIntArray491[local85] = 8;
								}
								Static50.anIntArray106[local85] = local47.anInt998;
							}
							local85++;
							local550--;
						}
						if (!local18[arg0 + 3 & 0x3]) {
							arg5[3] = Static175.aBooleanArrayArray5[local64][local519 + 1 & 0x3];
						}
					} else if (!local18[arg0 + 3 & 0x3]) {
						arg5[3] = Static138.aBooleanArrayArray4[local64][local519 + 1 & 0x3];
					}
				}
			}
		}
		if (arg10 < arg8 - 1) {
			local34 = arg3[arg10 + 1][arg12] & 0xFF;
			if (local34 > 0) {
				local47 = this.aClass204_6.method4347(local34 - 1);
				if (local47.anInt1001 != -1) {
					local64 = arg4[arg10 + 1][arg12];
					local519 = arg7[arg10 + 1][arg12];
					if (local47.aBoolean122) {
						local85 = 4;
						local550 = local519 * 2 + 6;
						local555 = Static149.method1880(arg1, local47);
						for (local557 = 0; local557 < 3; local557++) {
							local85 &= 0x7;
							local550 &= 0x7;
							if (Static190.aBooleanArrayArray6[local64][local550] && local47.anInt998 >= Static50.anIntArray106[local85]) {
								Static301.anIntArray378[local85] = local47.anInt1001;
								Static220.anIntArray285[local85] = local555;
								Static156.anIntArray199[local85] = arg1.method5689() ? local47.anInt1007 : local47.anInt999;
								Static140.anIntArray187[local85] = local47.anInt1008;
								if (Static50.anIntArray106[local85] == local47.anInt998) {
									Static432.anIntArray491[local85] |= 0x4;
								} else {
									Static432.anIntArray491[local85] = 4;
								}
								Static50.anIntArray106[local85] = local47.anInt998;
							}
							local550++;
							local85--;
						}
						if (!local18[arg0 + 1 & 0x3]) {
							arg5[1] = Static175.aBooleanArrayArray5[local64][local519 + 3 & 0x3];
						}
					} else if (!local18[arg0 + 1 & 0x3]) {
						arg5[1] = Static138.aBooleanArrayArray4[local64][local519 + 3 & 0x3];
					}
				}
			}
		}
		if (arg9 == null) {
			return;
		}
		local34 = Static149.method1880(arg1, arg9);
		if (!arg9.aBoolean122) {
			return;
		}
		for (@Pc(1243) int local1243 = 0; local1243 < 8; local1243++) {
			@Pc(1254) int local1254 = local1243 - arg0 * 2 & 0x7;
			if (Static190.aBooleanArrayArray6[arg2][local1243] && arg9.anInt998 >= Static50.anIntArray106[local1254]) {
				Static301.anIntArray378[local1254] = arg9.anInt1001;
				Static220.anIntArray285[local1254] = local34;
				Static156.anIntArray199[local1254] = arg1.method5689() ? arg9.anInt1007 : arg9.anInt999;
				Static140.anIntArray187[local1254] = arg9.anInt1008;
				if (Static50.anIntArray106[local1254] == arg9.anInt998) {
					Static432.anIntArray491[local1254] |= 0x2;
				} else {
					Static432.anIntArray491[local1254] = 2;
				}
				Static50.anIntArray106[local1254] = arg9.anInt998;
			}
		}
		return;
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(Lclient!ya;Lclient!za;BILclient!ya;Lclient!ya;[[I)V")
	private void method3717(@OriginalArg(0) Class139 arg0, @OriginalArg(1) Class117 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class139 arg3, @OriginalArg(5) Class139 arg4, @OriginalArg(6) int[][] arg5) {
		for (@Pc(12) int local12 = 0; local12 < this.anInt4702; local12++) {
			for (@Pc(16) int local16 = 0; local16 < this.anInt4711; local16++) {
				if (Static174.anInt2866 == -1 || Static140.method1765(Static174.anInt2866, local12, local16, arg2)) {
					@Pc(40) byte local40 = this.aByteArrayArrayArray11[arg2][local12][local16];
					@Pc(49) byte local49 = this.aByteArrayArrayArray9[arg2][local12][local16];
					@Pc(60) int local60 = this.aByteArrayArrayArray13[arg2][local12][local16] & 0xFF;
					@Pc(71) int local71 = this.aByteArrayArrayArray10[arg2][local12][local16] & 0xFF;
					@Pc(83) Class49 local83 = local60 == 0 ? null : this.aClass204_6.method4347(local60 - 1);
					@Pc(95) Class6 local95 = local71 == 0 ? null : this.aClass60_4.method970(local71 - 1);
					@Pc(97) int local97 = 0;
					@Pc(99) int local99 = 0;
					if (local40 != 0) {
						local97 = local95 == null ? 0 : Static172.anIntArray224[local40];
						local99 = local83 == null ? 0 : Static39.anIntArray68[local40];
					} else if (local83 != null) {
						local99 = Static39.anIntArray68[local40];
					} else if (local95 != null) {
						local97 = Static39.anIntArray68[local40];
					}
					@Pc(138) int local138 = local99 + local97;
					@Pc(140) int local140 = 0;
					if (local138 != 0) {
						@Pc(145) int[] local145 = new int[local138];
						@Pc(148) int[] local148 = new int[local138];
						@Pc(151) int[] local151 = new int[local138];
						@Pc(154) int[] local154 = new int[local138];
						@Pc(156) boolean local156 = false;
						@Pc(173) int local173;
						@Pc(205) int local205;
						if (local83 == null || local83.anInt1001 == -1 && local83.anInt1003 == -1 && local83.anInt1007 == -1) {
							for (local173 = 0; local173 < local99; local173++) {
								local145[local140] = -1;
								local140++;
							}
						} else {
							local173 = arg1.method5689() ? local83.anInt1007 : local83.anInt999;
							if (Static141.aBoolean538) {
								local173 = -1;
							}
							for (local205 = 0; local205 < local99; local205++) {
								local151[local140] = local173;
								local154[local140] = local83.anInt1008;
								if (local83.anInt1001 == -1) {
									local145[local140] = -1;
								} else {
									local145[local140] = local83.anInt1001;
								}
								if (local83.anInt1003 == -1) {
									local148[local140] = -1;
								} else {
									local156 = true;
									local148[local140] = local83.anInt1003;
								}
								local140++;
							}
							if (!this.aBoolean425 && arg2 == 0) {
								Static240.method3458(local12, local16, local83.anInt1002, local83.anInt1009 * 8, local83.anInt997);
							}
						}
						if (!local156) {
							local148 = null;
						}
						if (local95 == null) {
							for (local173 = 0; local173 < local97; local173++) {
								local145[local140] = -1;
								local140++;
							}
						} else {
							local173 = local95.anInt49;
							if (Static141.aBoolean538) {
								local173 = -1;
							}
							for (local205 = 0; local205 < local97; local205++) {
								local151[local140] = local173;
								local154[local140] = local95.anInt48;
								local145[local140] = arg5[local12][local16];
								if (local148 != null) {
									local148[local140] = -1;
								}
								local140++;
							}
						}
						local173 = this.anIntArray352.length;
						@Pc(341) int[] local341 = new int[local173];
						@Pc(344) int[] local344 = new int[local173];
						@Pc(351) int[] local351 = arg3 == null ? null : new int[local173];
						@Pc(360) int[] local360 = arg3 == null && arg4 == null ? null : new int[local173];
						@Pc(369) int local369;
						@Pc(374) int local374;
						@Pc(454) int local454;
						@Pc(460) int local460;
						for (@Pc(362) int local362 = 0; local362 < local173; local362++) {
							local369 = this.anIntArray352[local362];
							local374 = this.anIntArray351[local362];
							if (local49 == 0) {
								local341[local362] = local369;
								local344[local362] = local374;
							} else if (local49 == 1) {
								local341[local362] = local374;
								local344[local362] = 128 - local369;
							} else if (local49 == 2) {
								local341[local362] = 128 - local369;
								local344[local362] = 128 - local374;
							} else if (local49 == 3) {
								local341[local362] = 128 - local374;
								local344[local362] = local369;
							}
							if (local351 != null && Static190.aBooleanArrayArray6[local40][local362]) {
								local454 = (local12 << 7) + local369;
								local460 = local369 + (local16 << 7);
								local351[local362] = arg3.ca(local454, local460) - arg0.ca(local454, local460);
							}
							if (local360 != null) {
								if (arg3 != null && !Static190.aBooleanArrayArray6[local40][local362]) {
									local454 = (local12 << 7) + local369;
									local460 = local369 + (local16 << 7);
									local360[local362] = arg0.ca(local454, local460) - arg3.ca(local454, local460);
								} else if (arg4 != null && !Static39.aBooleanArrayArray1[local40][local362]) {
									local454 = (local12 << 7) + local369;
									local460 = (local16 << 7) + local369;
									local360[local362] = arg4.ca(local454, local460) - arg0.ca(local454, local460);
								}
							}
						}
						local369 = arg0.ua(local12, local16);
						local374 = arg0.ua(local12 + 1, local16);
						local454 = arg0.ua(local12 + 1, local16 - -1);
						local460 = arg0.ua(local12, local16 + 1);
						if (arg2 > 0) {
							@Pc(583) boolean local583 = true;
							if (local71 == 0 && local40 != 0) {
								local583 = false;
							}
							if (local60 > 0 && local83 != null && !local83.aBoolean123) {
								local583 = false;
							}
							if (local583 && local369 == local374 && local454 == local369 && local460 == local369) {
								this.aByteArrayArrayArray12[arg2][local12][local16] = (byte) (this.aByteArrayArrayArray12[arg2][local12][local16] | 0x4);
							}
						}
						@Pc(640) int local640 = 0;
						@Pc(642) int local642 = 0;
						@Pc(644) int local644 = 0;
						if (this.aBoolean425) {
							local640 = Static258.method3623(local12, local16);
							local642 = Static85.method5073(local12, local16);
							local644 = Static364.method4778(local12, local16);
						}
						arg0.method5369(local12, local16, local341, local351, local344, local360, Static302.anIntArrayArray42[local40], Static24.anIntArrayArray9[local40], Static110.anIntArrayArray19[local40], local145, local148, local151, local154, local640, local642, local644);
						Static74.method3130(arg2, local12, local16);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(ILclient!wm;III[Lclient!mk;I)V")
	public final void method3718(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub19 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class158[] arg5) {
		@Pc(6) int local6;
		@Pc(14) int local14;
		@Pc(18) int local18;
		@Pc(25) int local25;
		if (!this.aBoolean425) {
			for (local6 = 0; local6 < 4; local6++) {
				@Pc(12) Class158 local12 = arg5[local6];
				for (local14 = 0; local14 < 64; local14++) {
					for (local18 = 0; local18 < 64; local18++) {
						local25 = arg0 + local14;
						@Pc(29) int local29 = arg3 + local18;
						if (local25 >= 0 && local25 < this.anInt4702 && local29 >= 0 && local29 < this.anInt4711) {
							local12.method3610(local29, local25);
						}
					}
				}
			}
		}
		local6 = arg2 + arg0;
		@Pc(90) int local90 = arg4 + arg3;
		for (local14 = 0; local14 < this.anInt4713; local14++) {
			for (local18 = 0; local18 < 64; local18++) {
				for (local25 = 0; local25 < 64; local25++) {
					this.method3713(local90 + local25, 0, false, arg3 + local25, local14, local18 + local6, arg0 + local18, arg1, 0, 0);
				}
			}
		}
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(Lclient!za;[Lclient!mk;I[[[I)V")
	public final void method3720(@OriginalArg(0) Class117 arg0, @OriginalArg(1) Class158[] arg1, @OriginalArg(3) int[][][] arg2) {
		@Pc(10) int local10;
		@Pc(14) int local14;
		@Pc(18) int local18;
		if (!this.aBoolean425) {
			for (local10 = 0; local10 < 4; local10++) {
				for (local14 = 0; local14 < this.anInt4702; local14++) {
					for (local18 = 0; local18 < this.anInt4711; local18++) {
						if ((Static278.aByteArrayArrayArray16[local10][local14][local18] & 0x1) != 0) {
							@Pc(35) int local35 = local10;
							if ((Static278.aByteArrayArrayArray16[1][local14][local18] & 0x2) != 0) {
								local35 = local10 - 1;
							}
							if (local35 >= 0) {
								arg1[local35].method3622(local14, local18);
							}
						}
					}
				}
			}
		}
		for (local10 = 0; local10 < this.anInt4713; local10++) {
			local14 = 0;
			local18 = 0;
			if (!this.aBoolean425) {
				if (Static373.aBoolean647) {
					local14 = 2;
				}
				if (Static150.aBoolean424) {
					local18 = 8;
				}
				if (Static438.anInt6910 != 0) {
					local14 |= 0x1;
					if (local10 == 0 | Static386.aBoolean623) {
						local18 |= 0x10;
					}
				}
			}
			if (Static373.aBoolean647) {
				local18 |= 0x7;
			}
			if (!Static151.aBoolean244) {
				local18 |= 0x20;
			}
			@Pc(156) int[][] local156 = arg2 == null || local10 >= arg2.length ? this.anIntArrayArrayArray5[local10] : arg2[local10];
			Static124.method1518(local10, arg0.method5657(this.anInt4702, this.anInt4711, this.anIntArrayArrayArray5[local10], local156, local14, local18));
		}
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(IIZIII)V")
	private void method3722(@OriginalArg(0) int arg0, @OriginalArg(3) int arg1, @OriginalArg(5) int arg2) {
		@Pc(11) int local11;
		for (@Pc(7) int local7 = arg1; local7 < arg1 + 64; local7++) {
			for (local11 = arg2; local11 < arg2 + 64; local11++) {
				if (local11 >= 0 && local11 < this.anInt4702 && local7 >= 0 && this.anInt4711 > local7) {
					this.anIntArrayArrayArray5[arg0][local11][local7] = arg0 <= 0 ? 0 : this.anIntArrayArrayArray5[arg0 - 1][local11][local7] - 240;
				}
			}
		}
		if (arg2 > 0 && this.anInt4702 > arg2) {
			for (local11 = arg1 + 1; local11 < arg1 + 64; local11++) {
				if (local11 >= 0 && this.anInt4711 > local11) {
					this.anIntArrayArrayArray5[arg0][arg2][local11] = this.anIntArrayArrayArray5[arg0][arg2 - 1][local11];
				}
			}
		}
		if (arg1 > 0 && arg1 < this.anInt4711) {
			for (local11 = arg2 + 1; local11 < arg2 + 64; local11++) {
				if (local11 >= 0 && local11 < this.anInt4702) {
					this.anIntArrayArrayArray5[arg0][local11][arg1] = this.anIntArrayArrayArray5[arg0][local11][arg1 - 1];
				}
			}
		}
		if (arg2 < 0 || arg1 < 0 || arg2 >= this.anInt4702 || this.anInt4711 <= arg1) {
			return;
		}
		if (arg0 == 0) {
			if (arg2 > 0 && this.anIntArrayArrayArray5[arg0][arg2 - 1][arg1] != 0) {
				this.anIntArrayArrayArray5[arg0][arg2][arg1] = this.anIntArrayArrayArray5[arg0][arg2 - 1][arg1];
			} else if (arg1 > 0 && this.anIntArrayArrayArray5[arg0][arg2][arg1 - 1] != 0) {
				this.anIntArrayArrayArray5[arg0][arg2][arg1] = this.anIntArrayArrayArray5[arg0][arg2][arg1 - 1];
			} else if (arg2 > 0 && arg1 > 0 && this.anIntArrayArrayArray5[arg0][arg2 - 1][arg1 - 1] != 0) {
				this.anIntArrayArrayArray5[arg0][arg2][arg1] = this.anIntArrayArrayArray5[arg0][arg2 - 1][arg1 - 1];
			}
		} else if (arg2 > 0 && this.anIntArrayArrayArray5[arg0 - 1][arg2 - 1][arg1] != this.anIntArrayArrayArray5[arg0][arg2 - 1][arg1]) {
			this.anIntArrayArrayArray5[arg0][arg2][arg1] = this.anIntArrayArrayArray5[arg0][arg2 - 1][arg1];
		} else if (arg1 > 0 && this.anIntArrayArrayArray5[arg0][arg2][arg1 - 1] != this.anIntArrayArrayArray5[arg0 - 1][arg2][arg1 - 1]) {
			this.anIntArrayArrayArray5[arg0][arg2][arg1] = this.anIntArrayArrayArray5[arg0][arg2][arg1 - 1];
		} else if (arg2 > 0 && arg1 > 0 && this.anIntArrayArrayArray5[arg0][arg2 - 1][arg1 - 1] != this.anIntArrayArrayArray5[arg0 - 1][arg2 - 1][arg1 - 1]) {
			this.anIntArrayArrayArray5[arg0][arg2][arg1] = this.anIntArrayArrayArray5[arg0][arg2 - 1][arg1 - 1];
		}
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(IIIIILclient!wm;I[Lclient!mk;II)V")
	public final void method3723(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class1_Sub19 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class158[] arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(11) int local11 = (arg8 & 0x7) * 8;
		@Pc(17) int local17 = (arg3 & 0x7) * 8;
		@Pc(26) int local26;
		@Pc(56) int local56;
		if (!this.aBoolean425) {
			@Pc(24) Class158 local24 = arg6[arg2];
			for (local26 = 0; local26 < 8; local26++) {
				for (@Pc(30) int local30 = 0; local30 < 8; local30++) {
					@Pc(44) int local44 = arg0 + Static197.method2823(local30 & 0x7, arg7, local26 & 0x7);
					local56 = Static129.method1586(local30 & 0x7, local26 & 0x7, arg7) + arg1;
					if (local44 > 0 && local44 < this.anInt4702 - 1 && local56 > 0 && this.anInt4711 - 1 > local56) {
						local24.method3610(local56, local44);
					}
				}
			}
		}
		@Pc(100) int local100 = (arg8 & 0x1FFFFFF8) << 3;
		local26 = (arg3 & 0xFFFFFFF8) << 3;
		@Pc(112) byte local112 = 0;
		@Pc(114) byte local114 = 0;
		if (arg7 == 1) {
			local114 = 1;
		} else if (arg7 == 2) {
			local114 = 1;
			local112 = 1;
		} else if (arg7 == 3) {
			local112 = 1;
		}
		for (local56 = 0; local56 < this.anInt4713; local56++) {
			for (@Pc(143) int local143 = 0; local143 < 64; local143++) {
				for (@Pc(147) int local147 = 0; local147 < 64; local147++) {
					if (arg5 == local56 && local11 <= local143 && local143 <= local11 + 8 && local147 >= local17 && local17 + 8 >= local147) {
						@Pc(206) int local206;
						@Pc(218) int local218;
						if (local11 + 8 == local143 || local17 + 8 == local147) {
							if (arg7 == 0) {
								local206 = arg0 + local143 - local11;
								local218 = arg1 + local147 - local17;
							} else if (arg7 == 1) {
								local218 = arg1 + local11 + 8 - local143;
								local206 = local147 + arg0 - local17;
							} else if (arg7 == 2) {
								local206 = arg0 + local11 + 8 - local143;
								local218 = arg1 + local17 + 8 - local147;
							} else {
								local218 = local143 + arg1 - local11;
								local206 = arg0 + local17 + 8 - local147;
							}
							this.method3713(local26 + local147, 0, true, local218, arg2, local143 + local100, local206, arg4, 0, 0);
						} else {
							local206 = Static197.method2823(local147 & 0x7, arg7, local143 & 0x7) + arg0;
							local218 = Static129.method1586(local147 & 0x7, local143 & 0x7, arg7) + arg1;
							this.method3713(local26 + local147, local112, false, local218, arg2, local100 + local143, local206, arg4, arg7, local114);
						}
						if (local143 == 63 || local147 == 63) {
							@Pc(345) byte local345 = 1;
							if (local143 == 63 && local147 == 63) {
								local345 = 3;
							}
							for (@Pc(355) int local355 = 0; local355 < local345; local355++) {
								@Pc(359) int local359 = local143;
								@Pc(361) int local361 = local147;
								if (local355 == 0) {
									local361 = local147 == 63 ? 64 : local147;
									local359 = local143 == 63 ? 64 : local143;
								} else if (local355 == 1) {
									local359 = 64;
								} else if (local355 == 2) {
									local361 = 64;
								}
								@Pc(419) int local419;
								@Pc(426) int local426;
								if (arg7 == 0) {
									local419 = arg0 + local359 - local11;
									local426 = arg1 + local361 - local17;
								} else if (arg7 == 1) {
									local419 = local361 + arg0 - local17;
									local426 = local11 + arg1 + 8 - local359;
								} else if (arg7 == 2) {
									local426 = local17 + arg1 + 8 - local361;
									local419 = local11 + arg0 + 8 - local359;
								} else {
									local419 = local17 + arg0 + 8 - local361;
									local426 = arg1 + local359 - local11;
								}
								if (local419 >= 0 && local419 < this.anInt4702 && local426 >= 0 && this.anInt4711 > local426) {
									this.anIntArrayArrayArray5[arg2][local419][local426] = this.anIntArrayArrayArray5[arg2][local206 + local112][local114 + local218];
								}
							}
						}
					} else {
						this.method3713(0, 0, false, -1, 0, 0, -1, arg4, 0, 0);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(Lclient!za;Lclient!ya;ILclient!ya;)V")
	public final void method3724(@OriginalArg(0) Class117 arg0, @OriginalArg(1) Class139 arg1, @OriginalArg(3) Class139 arg2) {
		if (Static439.anIntArray497 == null || Static439.anIntArray497.length != this.anInt4711) {
			Static34.anIntArray65 = new int[this.anInt4711];
			Static231.anIntArray308 = new int[this.anInt4711];
			Static104.anIntArray139 = new int[this.anInt4711];
			Static439.anIntArray497 = new int[this.anInt4711];
			Static328.anIntArray395 = new int[this.anInt4711];
		}
		@Pc(38) int[][] local38 = new int[this.anInt4702][this.anInt4711];
		@Pc(44) int local44;
		for (@Pc(40) int local40 = 0; local40 < this.anInt4713; local40++) {
			for (local44 = 0; local44 < this.anInt4711; local44++) {
				Static439.anIntArray497[local44] = 0;
				Static34.anIntArray65[local44] = 0;
				Static231.anIntArray308[local44] = 0;
				Static104.anIntArray139[local44] = 0;
				Static328.anIntArray395[local44] = 0;
			}
			for (@Pc(77) int local77 = -5; local77 < this.anInt4702; local77++) {
				@Pc(87) int local87;
				@Pc(106) int local106;
				@Pc(172) int local172;
				for (@Pc(81) int local81 = 0; local81 < this.anInt4711; local81++) {
					local87 = local77 + 5;
					@Pc(152) int local152;
					if (local87 < this.anInt4702) {
						local106 = this.aByteArrayArrayArray10[local40][local87][local81] & 0xFF;
						if (local106 > 0) {
							@Pc(116) Class6 local116 = this.aClass60_4.method970(local106 - 1);
							Static439.anIntArray497[local81] += local116.anInt54;
							Static34.anIntArray65[local81] += local116.anInt51;
							Static231.anIntArray308[local81] += local116.anInt47;
							Static104.anIntArray139[local81] += local116.anInt59;
							local152 = Static328.anIntArray395[local81]++;
						}
					}
					local106 = local77 - 5;
					if (local106 >= 0) {
						local172 = this.aByteArrayArrayArray10[local40][local106][local81] & 0xFF;
						if (local172 > 0) {
							@Pc(185) Class6 local185 = this.aClass60_4.method970(local172 - 1);
							Static439.anIntArray497[local81] -= local185.anInt54;
							Static34.anIntArray65[local81] -= local185.anInt51;
							Static231.anIntArray308[local81] -= local185.anInt47;
							Static104.anIntArray139[local81] -= local185.anInt59;
							local152 = Static328.anIntArray395[local81]--;
						}
					}
				}
				if (local77 >= 0) {
					local87 = 0;
					local106 = 0;
					local172 = 0;
					@Pc(243) int local243 = 0;
					@Pc(245) int local245 = 0;
					for (@Pc(247) int local247 = -5; local247 < this.anInt4711; local247++) {
						@Pc(253) int local253 = local247 + 5;
						if (local253 < this.anInt4711) {
							local172 += Static231.anIntArray308[local253];
							local106 += Static34.anIntArray65[local253];
							local87 += Static439.anIntArray497[local253];
							local245 += Static328.anIntArray395[local253];
							local243 += Static104.anIntArray139[local253];
						}
						@Pc(295) int local295 = local247 - 5;
						if (local295 >= 0) {
							local243 -= Static104.anIntArray139[local295];
							local245 -= Static328.anIntArray395[local295];
							local172 -= Static231.anIntArray308[local295];
							local106 -= Static34.anIntArray65[local295];
							local87 -= Static439.anIntArray497[local295];
						}
						if (local247 >= 0 && local243 > 0 && local245 > 0) {
							local38[local77][local247] = Static409.method5239(local87 * 256 / local243, local106 / local245, local172 / local245);
						}
					}
				}
			}
			if (Static215.aBoolean91) {
				this.method3714(local40 == 0 ? arg2 : null, Static452.aClass139Array3[local40], arg0, local38, local40, local40 == 0 ? arg1 : null);
			} else {
				this.method3717(Static452.aClass139Array3[local40], arg0, local40, local40 == 0 ? arg1 : null, local40 == 0 ? arg2 : null, local38);
			}
			this.aByteArrayArrayArray10[local40] = null;
			this.aByteArrayArrayArray13[local40] = null;
			this.aByteArrayArrayArray11[local40] = null;
			this.aByteArrayArrayArray9[local40] = null;
		}
		if (!this.aBoolean425) {
			if (Static438.anInt6910 != 0) {
				Static431.method5460();
			}
			if (Static373.aBoolean647) {
				Static152.method1915();
			}
		}
		for (local44 = 0; local44 < this.anInt4713; local44++) {
			Static452.aClass139Array3[local44].aa();
		}
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(IIIIB)V")
	public final void method3725(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		for (@Pc(7) int local7 = 0; local7 < this.anInt4713; local7++) {
			this.method3722(local7, arg0, arg1);
		}
	}
}
