import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ie")
public class Class115 {

	@OriginalMember(owner = "client!ie", name = "y", descriptor = "[[[B")
	public byte[][][] aByteArrayArrayArray15;

	@OriginalMember(owner = "client!ie", name = "e", descriptor = "[I")
	private final int[] anIntArray498 = new int[] { 0, 64, 128, 128, 128, 64, 0, 0, 32, 64, 32, 96, 64 };

	@OriginalMember(owner = "client!ie", name = "u", descriptor = "[I")
	private final int[] anIntArray499 = new int[] { 0, 0, 0, 64, 128, 128, 128, 64, 64, 96, 32, 32, 64 };

	@OriginalMember(owner = "client!ie", name = "t", descriptor = "I")
	protected final int anInt7273;

	@OriginalMember(owner = "client!ie", name = "d", descriptor = "Lclient!vo;")
	private final Class253 aClass253_5;

	@OriginalMember(owner = "client!ie", name = "D", descriptor = "I")
	public final int anInt7278;

	@OriginalMember(owner = "client!ie", name = "i", descriptor = "Z")
	public final boolean aBoolean462;

	@OriginalMember(owner = "client!ie", name = "z", descriptor = "Lclient!kb;")
	private final Class140 aClass140_5;

	@OriginalMember(owner = "client!ie", name = "q", descriptor = "I")
	protected final int anInt7272;

	@OriginalMember(owner = "client!ie", name = "j", descriptor = "[[[B")
	private final byte[][][] aByteArrayArrayArray12;

	@OriginalMember(owner = "client!ie", name = "n", descriptor = "[[[I")
	public final int[][][] anIntArrayArrayArray14;

	@OriginalMember(owner = "client!ie", name = "r", descriptor = "[[[B")
	protected byte[][][] aByteArrayArrayArray13;

	@OriginalMember(owner = "client!ie", name = "B", descriptor = "[[[B")
	private final byte[][][] aByteArrayArrayArray16;

	@OriginalMember(owner = "client!ie", name = "s", descriptor = "[[[B")
	private final byte[][][] aByteArrayArrayArray14;

	@OriginalMember(owner = "client!ie", name = "E", descriptor = "[[[B")
	private final byte[][][] aByteArrayArrayArray17;

	@OriginalMember(owner = "client!ie", name = "<init>", descriptor = "(IIIZLclient!vo;Lclient!kb;)V")
	protected Class115(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) Class253 arg4, @OriginalArg(5) Class140 arg5) {
		this.anInt7273 = arg2;
		this.aClass253_5 = arg4;
		this.anInt7278 = arg0;
		this.aBoolean462 = arg3;
		this.aClass140_5 = arg5;
		this.anInt7272 = arg1;
		this.aByteArrayArrayArray12 = new byte[this.anInt7278][this.anInt7272][this.anInt7273];
		this.anIntArrayArrayArray14 = new int[this.anInt7278][this.anInt7272 + 1][this.anInt7273 + 1];
		this.aByteArrayArrayArray13 = new byte[this.anInt7278][this.anInt7272 + 1][this.anInt7273 + 1];
		this.aByteArrayArrayArray16 = new byte[this.anInt7278][this.anInt7272][this.anInt7273];
		this.aByteArrayArrayArray14 = new byte[this.anInt7278][this.anInt7272][this.anInt7273];
		this.aByteArrayArrayArray17 = new byte[this.anInt7278][this.anInt7272][this.anInt7273];
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(IZIIILclient!ae;IIIII)V")
	private void method5982(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class6_Sub1 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(10) int arg9) {
		if (arg7 == 1) {
			arg2 = 1;
		} else if (arg7 == 2) {
			arg2 = 1;
			arg9 = 1;
		} else if (arg7 == 3) {
			arg9 = 1;
		}
		@Pc(67) int local67;
		if (arg4 < 0 || this.anInt7272 <= arg4 || arg3 < 0 || arg3 >= this.anInt7273) {
			while (true) {
				local67 = arg5.method6433();
				if (local67 == 0) {
					break;
				}
				if (local67 == 1) {
					arg5.method6433();
					break;
				}
				if (local67 <= 49) {
					arg5.method6433();
				}
			}
			return;
		}
		if (!this.aBoolean462 && !arg1) {
			Static203.aByteArrayArrayArray11[arg6][arg4][arg3] = 0;
		}
		while (true) {
			local67 = arg5.method6433();
			if (local67 == 0) {
				if (this.aBoolean462) {
					this.anIntArrayArrayArray14[0][arg4 + arg9][arg2 + arg3] = 0;
				} else if (arg6 == 0) {
					this.anIntArrayArrayArray14[0][arg9 + arg4][arg2 + arg3] = -Static150.method2600(arg0 + 556238, 932731 - -arg8) * 8 << 0;
				} else {
					this.anIntArrayArrayArray14[arg6][arg4 + arg9][arg3 + arg2] = this.anIntArrayArrayArray14[arg6 - 1][arg4 + arg9][arg3 + arg2] - 240;
				}
				break;
			}
			if (local67 == 1) {
				@Pc(163) int local163 = arg5.method6433();
				if (this.aBoolean462) {
					this.anIntArrayArrayArray14[0][arg4 + arg9][arg3 + arg2] = local163 * 8 << 0;
				} else {
					if (local163 == 1) {
						local163 = 0;
					}
					if (arg6 == 0) {
						this.anIntArrayArrayArray14[0][arg9 + arg4][arg2 + arg3] = -local163 * 8 << 0;
					} else {
						this.anIntArrayArrayArray14[arg6][arg4 + arg9][arg3 + arg2] = this.anIntArrayArrayArray14[arg6 - 1][arg4 + arg9][arg2 + arg3] - (local163 * 8 << 0);
					}
				}
				break;
			}
			if (local67 <= 49) {
				if (arg1) {
					arg5.method6433();
				} else {
					this.aByteArrayArrayArray12[arg6][arg4][arg3] = arg5.method6438();
					this.aByteArrayArrayArray14[arg6][arg4][arg3] = (byte) ((local67 - 2) / 4);
					this.aByteArrayArrayArray17[arg6][arg4][arg3] = (byte) (arg7 + local67 - 2 & 0x3);
				}
			} else if (local67 <= 81) {
				if (!this.aBoolean462 && !arg1) {
					Static203.aByteArrayArrayArray11[arg6][arg4][arg3] = (byte) (local67 - 49);
				}
			} else if (!arg1) {
				this.aByteArrayArrayArray16[arg6][arg4][arg3] = (byte) (local67 - 81);
			}
		}
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(Lclient!og;Lclient!og;Lclient!og;ILclient!eq;I[[I)V")
	private void method5984(@OriginalArg(0) Class86 arg0, @OriginalArg(1) Class86 arg1, @OriginalArg(2) Class86 arg2, @OriginalArg(4) Class66 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int[][] arg5) {
		@Pc(16) byte[][] local16 = this.aByteArrayArrayArray14[arg4];
		@Pc(21) byte[][] local21 = this.aByteArrayArrayArray17[arg4];
		@Pc(26) byte[][] local26 = this.aByteArrayArrayArray16[arg4];
		@Pc(31) byte[][] local31 = this.aByteArrayArrayArray12[arg4];
		for (@Pc(33) int local33 = 0; local33 < this.anInt7272; local33++) {
			@Pc(51) int local51 = local33 >= this.anInt7272 - 1 ? local33 : local33 + 1;
			for (@Pc(53) int local53 = 0; local53 < this.anInt7273; local53++) {
				@Pc(67) int local67 = local53 < this.anInt7273 - 1 ? local53 + 1 : local53;
				if (Static327.anInt5636 == -1 || Static426.method6223(Static327.anInt5636, local33, arg4, local53)) {
					@Pc(82) boolean local82 = false;
					@Pc(84) boolean local84 = false;
					@Pc(87) boolean[] local87 = new boolean[4];
					@Pc(93) int local93 = local16[local33][local53];
					@Pc(99) int local99 = local21[local33][local53];
					@Pc(107) int local107 = local31[local33][local53] & 0xFF;
					@Pc(115) int local115 = local26[local33][local53] & 0xFF;
					@Pc(123) int local123 = local26[local33][local67] & 0xFF;
					@Pc(131) int local131 = local26[local51][local67] & 0xFF;
					@Pc(139) int local139 = local26[local51][local53] & 0xFF;
					if (local107 != 0 || local115 != 0) {
						@Pc(161) Class254 local161 = local107 == 0 ? null : this.aClass253_5.method6228(local107 - 1);
						@Pc(176) Class95 local176 = local115 == 0 ? null : this.aClass140_5.method3145(local115 - 1);
						if (local93 == 0 && local161 == null) {
							local93 = 12;
						}
						@Pc(184) Class254 local184 = local161;
						if (local161 != null) {
							if (local161.anInt7607 == -1 && local161.anInt7619 == -1) {
								local184 = local161;
								local161 = null;
							} else if (local176 != null && local93 != 0) {
								local84 = local161.aBoolean479;
							}
						}
						@Pc(265) int local265;
						@Pc(331) int local331;
						@Pc(381) int local381;
						@Pc(390) int local390;
						if ((local93 == 0 || local93 == 12) && local33 > 0 && local53 > 0 && this.anInt7272 > local33 && this.anInt7273 > local53) {
							local265 = local26[local33 - 1][local53 - 1] == local115 ? 1 : -1;
							@Pc(284) int local284 = local26[local51][local53 - 1] == local115 ? 1 : -1;
							@Pc(297) int local297 = local115 == local26[local51][local67] ? 1 : -1;
							if (local26[local33][local53 - 1] == local115) {
								local265++;
								local284++;
							} else {
								local284--;
								local265--;
							}
							local331 = local115 == local26[local33 - 1][local67] ? 1 : -1;
							if (local115 == local26[local51][local53]) {
								local297++;
								local284++;
							} else {
								local284--;
								local297--;
							}
							if (local115 == local26[local33][local67]) {
								local331++;
								local297++;
							} else {
								local297--;
								local331--;
							}
							if (local115 == local26[local33 - 1][local53]) {
								local331++;
								local265++;
							} else {
								local331--;
								local265--;
							}
							local381 = local265 - local297;
							if (local381 < 0) {
								local381 = -local381;
							}
							local390 = local284 - local331;
							if (local390 < 0) {
								local390 = -local390;
							}
							if (local390 == local381) {
								local381 = arg0.method6594(local33, local53) - arg0.method6594(local51, local67);
								local390 = arg0.method6594(local51, local53) - arg0.method6594(local33, local67);
								if (local381 < 0) {
									local381 = -local381;
								}
								if (local390 < 0) {
									local390 = -local390;
								}
							}
							local99 = local390 <= local381 ? 0 : 1;
						}
						for (local265 = 0; local265 < 13; local265++) {
							Static229.anIntArray300[local265] = -1;
							Static282.anIntArray337[local265] = 1;
						}
						@Pc(479) boolean[] local479 = local161 != null && local161.aBoolean479 ? Static213.aBooleanArrayArray10[local93] : Static189.aBooleanArrayArray6[local93];
						this.method5991(local161, local176, local31, this.anInt7273, local53, arg3, local99, local33, this.anInt7272, local93, local21, local16, local87);
						@Pc(512) boolean local512 = local161 != null && local161.anInt7607 != local161.anInt7619;
						if (!local512) {
							for (local331 = 0; local331 < 8; local331++) {
								if (Static229.anIntArray300[local331] >= 0 && Static386.anIntArray472[local331] != Static408.anIntArray503[local331]) {
									local512 = true;
									break;
								}
							}
						}
						if (!local479[local99 + 1 & 0x3]) {
							local87[1] = Static240.method3697(local87[1], (Static282.anIntArray337[4] & Static282.anIntArray337[2]) == 0);
						}
						if (!local479[local99 + 3 & 0x3]) {
							local87[3] = Static240.method3697(local87[3], (Static282.anIntArray337[6] & Static282.anIntArray337[0]) == 0);
						}
						if (!local479[local99 & 0x3]) {
							local87[0] = Static240.method3697(local87[0], (Static282.anIntArray337[0] & Static282.anIntArray337[2]) == 0);
						}
						if (!local479[local99 + 2 & 0x3]) {
							local87[2] = Static240.method3697(local87[2], (Static282.anIntArray337[6] & Static282.anIntArray337[4]) == 0);
						}
						if (!local84 && (local93 == 0 || local93 == 12)) {
							if (local87[0] && !local87[1] && !local87[2] && local87[3]) {
								local87[0] = local87[3] = false;
								local93 = local93 == 0 ? 13 : 14;
								local99 = 0;
							} else if (local87[0] && local87[1] && !local87[2] && !local87[3]) {
								local93 = local93 == 0 ? 13 : 14;
								local87[0] = local87[1] = false;
								local99 = 3;
							} else if (!local87[0] && local87[1] && local87[2] && !local87[3]) {
								local99 = 2;
								local93 = local93 == 0 ? 13 : 14;
								local87[1] = local87[2] = false;
							} else if (!local87[0] && !local87[1] && local87[2] && local87[3]) {
								local99 = 1;
								local93 = local93 == 0 ? 13 : 14;
								local87[2] = local87[3] = false;
							}
						}
						@Pc(814) boolean local814 = !local84 && !local87[0] && !local87[2] && !local87[1] && !local87[3];
						@Pc(816) int[] local816 = null;
						@Pc(840) int[] local840;
						@Pc(824) int[] local824;
						@Pc(844) int[] local844;
						if (local814) {
							local390 = local161 == null ? 0 : Static286.anIntArray341[local93];
							local381 = local176 == null ? 0 : Static292.anIntArray350[local93];
							local824 = Static295.anIntArrayArray30[local93];
							local844 = Static246.anIntArrayArray26[local93];
							local840 = Static328.anIntArrayArray35[local93];
						} else if (local84) {
							local824 = Static156.anIntArrayArray18[local93];
							local816 = Static192.anIntArrayArray20[local93];
							local390 = local161 == null ? 0 : Static282.anIntArray338[local93];
							local840 = Static446.anIntArrayArray63[local93];
							local844 = Static133.anIntArrayArray47[local93];
							local381 = local176 == null ? 0 : Static266.anIntArray109[local93];
						} else {
							local840 = Static357.anIntArrayArray38[local93];
							local824 = Static258.anIntArrayArray27[local93];
							local381 = local176 == null ? 0 : Static413.anIntArray510[local93];
							local816 = Static321.anIntArrayArray32[local93];
							local844 = Static68.anIntArrayArray52[local93];
							local390 = local161 == null ? 0 : Static241.anIntArray544[local93];
						}
						@Pc(919) int local919 = local390 + local381;
						if (local919 <= 0) {
							Static300.method4424(arg4, local33, local53);
						} else {
							if (local87[0]) {
								local919++;
							}
							if (local87[2]) {
								local919++;
							}
							if (local87[1]) {
								local919++;
							}
							if (local87[3]) {
								local919++;
							}
							@Pc(949) int local949 = 0;
							@Pc(951) int local951 = 0;
							@Pc(955) int local955 = local919 * 3;
							@Pc(962) int[] local962 = local512 ? new int[local955] : null;
							@Pc(965) int[] local965 = new int[local955];
							@Pc(968) int[] local968 = new int[local955];
							@Pc(971) int[] local971 = new int[local955];
							@Pc(974) int[] local974 = new int[local955];
							@Pc(977) int[] local977 = new int[local955];
							@Pc(984) int[] local984 = arg1 == null ? null : new int[local955];
							@Pc(993) int[] local993 = arg1 == null && arg2 == null ? null : new int[local955];
							@Pc(995) int local995 = -1;
							@Pc(997) int local997 = -1;
							@Pc(999) int local999 = 256;
							@Pc(1081) byte local1081;
							@Pc(1021) int local1021;
							@Pc(1023) int local1023;
							@Pc(1250) int local1250;
							@Pc(1256) int local1256;
							@Pc(1265) int local1265;
							@Pc(1270) int local1270;
							@Pc(1280) int local1280;
							@Pc(1275) int local1275;
							@Pc(1285) int local1285;
							@Pc(1345) int local1345;
							@Pc(1351) int local1351;
							if (local161 != null) {
								local995 = local161.anInt7607;
								local997 = arg3.method5065() ? local161.anInt7611 : local161.anInt7620;
								local999 = local161.anInt7613;
								local1021 = Static320.method4620(local161, arg3);
								for (local1023 = 0; local1023 < local390; local1023++) {
									if (local87[-local99 & 0x3] && local816[0] == local949) {
										Static104.anIntArray134[0] = local840[local949];
										Static104.anIntArray134[1] = 1;
										Static104.anIntArray134[2] = local844[local949];
										Static104.anIntArray134[3] = 1;
										Static104.anIntArray134[4] = local824[local949];
										local1081 = 6;
										Static104.anIntArray134[5] = local844[local949];
									} else if (local87[2 - local99 & 0x3] && local949 == local816[2]) {
										Static104.anIntArray134[0] = local840[local949];
										Static104.anIntArray134[1] = 5;
										Static104.anIntArray134[2] = local844[local949];
										Static104.anIntArray134[3] = 5;
										Static104.anIntArray134[4] = local824[local949];
										local1081 = 6;
										Static104.anIntArray134[5] = local844[local949];
									} else if (local87[1 - local99 & 0x3] && local816[1] == local949) {
										Static104.anIntArray134[0] = local840[local949];
										Static104.anIntArray134[1] = 3;
										Static104.anIntArray134[2] = local844[local949];
										Static104.anIntArray134[3] = 3;
										Static104.anIntArray134[4] = local824[local949];
										local1081 = 6;
										Static104.anIntArray134[5] = local844[local949];
									} else if (local87[3 - local99 & 0x3] && local949 == local816[3]) {
										Static104.anIntArray134[0] = local840[local949];
										Static104.anIntArray134[1] = 7;
										Static104.anIntArray134[2] = local844[local949];
										Static104.anIntArray134[3] = 7;
										Static104.anIntArray134[4] = local824[local949];
										local1081 = 6;
										Static104.anIntArray134[5] = local844[local949];
									} else {
										Static104.anIntArray134[0] = local840[local949];
										Static104.anIntArray134[1] = local824[local949];
										Static104.anIntArray134[2] = local844[local949];
										local1081 = 3;
									}
									local949++;
									for (local1250 = 0; local1250 < local1081; local1250++) {
										local1256 = Static104.anIntArray134[local1250];
										local1265 = local1256 - local99 * 2 & 0x7;
										local1270 = this.anIntArray498[local1256];
										local1275 = this.anIntArray499[local1256];
										if (local99 == 1) {
											local1280 = local1275;
											local1285 = 128 - local1270;
										} else if (local99 == 2) {
											local1285 = 128 - local1275;
											local1280 = 128 - local1270;
										} else if (local99 == 3) {
											local1285 = local1270;
											local1280 = 128 - local1275;
										} else {
											local1280 = local1270;
											local1285 = local1275;
										}
										local965[local951] = local1280;
										local968[local951] = local1285;
										if (local984 != null && Static314.aBooleanArrayArray9[local93][local1256]) {
											local1345 = (local33 << 7) + local1280;
											local1351 = local1285 + (local53 << 7);
											local984[local951] = arg1.method6590(local1345, local1351) - arg0.method6590(local1345, local1351);
										}
										if (local993 != null) {
											if (arg1 != null && !Static314.aBooleanArrayArray9[local93][local1256]) {
												local1345 = local1280 + (local33 << 7);
												local1351 = local1285 + (local53 << 7);
												local993[local951] = arg0.method6590(local1345, local1351) - arg1.method6590(local1345, local1351);
											} else if (arg2 != null && !Static48.aBooleanArrayArray3[local93][local1256]) {
												local1345 = local1280 + (local33 << 7);
												local1351 = local1285 + (local53 << 7);
												local993[local951] = arg2.method6590(local1345, local1351) - arg0.method6590(local1345, local1351);
											}
										}
										if (local1256 < 8 && local161.anInt7615 < Static229.anIntArray300[local1265]) {
											if (local962 != null) {
												local962[local951] = Static408.anIntArray503[local1265];
											}
											local977[local951] = Static35.anIntArray64[local1265];
											local974[local951] = Static18.anIntArray21[local1265];
											local971[local951] = Static386.anIntArray472[local1265];
										} else {
											if (local962 != null) {
												local962[local951] = local1021;
											}
											local974[local951] = arg3.method5065() ? local161.anInt7611 : local161.anInt7620;
											local977[local951] = local161.anInt7613;
											local971[local951] = local995;
										}
										local951++;
									}
								}
								if (!this.aBoolean462 && arg4 == 0) {
									Static339.method4927(local33, local53, local161.anInt7617, local161.anInt7614 * 8, local161.anInt7609);
								}
								if (local93 != 12 && local161.anInt7607 != -1 && local161.aBoolean478) {
									local82 = true;
								}
							} else if (local814) {
								local949 = Static286.anIntArray341[local93];
							} else if (local84) {
								local949 = Static282.anIntArray338[local93];
							} else {
								local949 = Static241.anIntArray544[local93];
							}
							if (local176 != null) {
								if (local131 == 0) {
									local131 = local115;
								}
								if (local123 == 0) {
									local123 = local115;
								}
								if (local139 == 0) {
									local139 = local115;
								}
								@Pc(1599) Class95 local1599 = this.aClass140_5.method3145(local115 - 1);
								@Pc(1607) Class95 local1607 = this.aClass140_5.method3145(local123 - 1);
								@Pc(1615) Class95 local1615 = this.aClass140_5.method3145(local131 - 1);
								@Pc(1623) Class95 local1623 = this.aClass140_5.method3145(local139 - 1);
								for (local1265 = 0; local1265 < local381; local1265++) {
									if (local87[-local99 & 0x3] && local816[0] == local949) {
										Static104.anIntArray134[0] = local840[local949];
										Static104.anIntArray134[1] = 1;
										Static104.anIntArray134[2] = local844[local949];
										Static104.anIntArray134[3] = 1;
										Static104.anIntArray134[4] = local824[local949];
										Static104.anIntArray134[5] = local844[local949];
										local1081 = 6;
									} else if (local87[2 - local99 & 0x3] && local816[2] == local949) {
										Static104.anIntArray134[0] = local840[local949];
										Static104.anIntArray134[1] = 5;
										Static104.anIntArray134[2] = local844[local949];
										Static104.anIntArray134[3] = 5;
										Static104.anIntArray134[4] = local824[local949];
										local1081 = 6;
										Static104.anIntArray134[5] = local844[local949];
									} else if (local87[1 - local99 & 0x3] && local949 == local816[1]) {
										Static104.anIntArray134[0] = local840[local949];
										Static104.anIntArray134[1] = 3;
										Static104.anIntArray134[2] = local844[local949];
										Static104.anIntArray134[3] = 3;
										Static104.anIntArray134[4] = local824[local949];
										Static104.anIntArray134[5] = local844[local949];
										local1081 = 6;
									} else if (local87[3 - local99 & 0x3] && local816[3] == local949) {
										Static104.anIntArray134[0] = local840[local949];
										Static104.anIntArray134[1] = 7;
										Static104.anIntArray134[2] = local844[local949];
										Static104.anIntArray134[3] = 7;
										Static104.anIntArray134[4] = local824[local949];
										Static104.anIntArray134[5] = local844[local949];
										local1081 = 6;
									} else {
										Static104.anIntArray134[0] = local840[local949];
										Static104.anIntArray134[1] = local824[local949];
										Static104.anIntArray134[2] = local844[local949];
										local1081 = 3;
									}
									local949++;
									for (local1270 = 0; local1270 < local1081; local1270++) {
										local1280 = Static104.anIntArray134[local1270];
										local1275 = local1280 - local99 * 2 & 0x7;
										local1285 = this.anIntArray498[local1280];
										local1351 = this.anIntArray499[local1280];
										@Pc(1896) int local1896;
										if (local99 == 1) {
											local1345 = local1351;
											local1896 = 128 - local1285;
										} else if (local99 == 2) {
											local1896 = 128 - local1351;
											local1345 = 128 - local1285;
										} else if (local99 == 3) {
											local1345 = 128 - local1351;
											local1896 = local1285;
										} else {
											local1345 = local1285;
											local1896 = local1351;
										}
										local965[local951] = local1345;
										local968[local951] = local1896;
										@Pc(1946) int local1946;
										@Pc(1952) int local1952;
										if (local984 != null && Static314.aBooleanArrayArray9[local93][local1280]) {
											local1946 = (local33 << 7) + local1345;
											local1952 = (local53 << 7) + local1896;
											local984[local951] = arg1.method6590(local1946, local1952) - arg0.method6590(local1946, local1952);
										}
										if (local993 != null) {
											if (arg1 != null && !Static314.aBooleanArrayArray9[local93][local1280]) {
												local1946 = local1345 + (local33 << 7);
												local1952 = local1896 + (local53 << 7);
												local993[local951] = arg0.method6590(local1946, local1952) - arg1.method6590(local1946, local1952);
											} else if (arg2 != null && !Static48.aBooleanArrayArray3[local93][local1280]) {
												local1946 = (local33 << 7) + local1345;
												local1952 = local1896 + (local53 << 7);
												local993[local951] = arg2.method6590(local1946, local1952) - arg0.method6590(local1946, local1952);
											}
										}
										if (local1280 < 8 && Static229.anIntArray300[local1275] >= 0) {
											if (local962 != null) {
												local962[local951] = Static408.anIntArray503[local1275];
											}
											local977[local951] = Static35.anIntArray64[local1275];
											local974[local951] = Static18.anIntArray21[local1275];
											local971[local951] = Static386.anIntArray472[local1275];
										} else {
											if (local84 && Static314.aBooleanArrayArray9[local93][local1280]) {
												local974[local951] = local997;
												local977[local951] = local999;
												local971[local951] = local995;
											} else if (local1345 == 0 && local1896 == 0) {
												local971[local951] = arg5[local33][local53];
												local974[local951] = local1599.anInt2892;
												local977[local951] = local1599.anInt2899;
											} else if (local1345 == 0 && local1896 == 128) {
												local971[local951] = arg5[local33][local67];
												local974[local951] = local1607.anInt2892;
												local977[local951] = local1607.anInt2899;
											} else if (local1345 == 128 && local1896 == 128) {
												local971[local951] = arg5[local51][local67];
												local974[local951] = local1615.anInt2892;
												local977[local951] = local1615.anInt2899;
											} else if (local1345 == 128 && local1896 == 0) {
												local971[local951] = arg5[local51][local53];
												local974[local951] = local1623.anInt2892;
												local977[local951] = local1623.anInt2899;
											} else {
												if (local1345 < 64) {
													if (local1896 >= 64) {
														local974[local951] = local1607.anInt2892;
														local977[local951] = local1607.anInt2899;
													} else {
														local974[local951] = local1599.anInt2892;
														local977[local951] = local1599.anInt2899;
													}
												} else if (local1896 >= 64) {
													local974[local951] = local1615.anInt2892;
													local977[local951] = local1615.anInt2899;
												} else {
													local974[local951] = local1623.anInt2892;
													local977[local951] = local1623.anInt2899;
												}
												local1946 = Static442.method6400(arg5[local33][local53], arg5[local51][local53], local1345 << 7 >> 7);
												local1952 = Static442.method6400(arg5[local33][local67], arg5[local51][local67], local1345 << 7 >> 7);
												local971[local951] = Static442.method6400(local1946, local1952, local1896 << 7 >> 7);
											}
											if (local962 != null) {
												local962[local951] = local971[local951];
											}
										}
										local951++;
									}
								}
								if (local93 != 0 && local176.aBoolean185) {
									local82 = true;
								}
							}
							local1021 = arg0.method6594(local33, local53);
							local1023 = arg0.method6594(local51, local53);
							local1250 = arg0.method6594(local51, local67);
							local1256 = arg0.method6594(local33, local67);
							if (arg4 > 0) {
								@Pc(2376) boolean local2376 = true;
								if (local115 == 0 && local93 != 0) {
									local2376 = false;
								}
								if (local107 > 0 && local184 != null && !local184.aBoolean480) {
									local2376 = false;
								}
								if (local2376 && local1023 == local1021 && local1021 == local1250 && local1021 == local1256) {
									this.aByteArrayArrayArray13[arg4][local33][local53] = (byte) (this.aByteArrayArrayArray13[arg4][local33][local53] | 0x4);
								}
							}
							local1265 = 0;
							local1270 = 0;
							local1280 = 0;
							if (this.aBoolean462) {
								local1265 = Static136.method2410(local33, local53);
								local1270 = Static410.method6046(local33, local53);
								local1280 = Static265.method4074(local33, local53);
							}
							arg0.method6592(local33, local53, local965, local984, local968, local993, local971, local962, local974, local977, local1265, local1270, local1280, local82);
							Static300.method4424(arg4, local33, local53);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "([[[I[Lclient!qo;ILclient!eq;)V")
	public final void method5987(@OriginalArg(0) int[][][] arg0, @OriginalArg(1) Class210[] arg1, @OriginalArg(3) Class66 arg2) {
		@Pc(6) int local6;
		@Pc(10) int local10;
		@Pc(14) int local14;
		if (!this.aBoolean462) {
			for (local6 = 0; local6 < 4; local6++) {
				for (local10 = 0; local10 < this.anInt7272; local10++) {
					for (local14 = 0; local14 < this.anInt7273; local14++) {
						if ((Static203.aByteArrayArrayArray11[local6][local10][local14] & 0x1) != 0) {
							@Pc(28) int local28 = local6;
							if ((Static203.aByteArrayArrayArray11[1][local10][local14] & 0x2) != 0) {
								local28 = local6 - 1;
							}
							if (local28 >= 0) {
								arg1[local28].method4707(local14, local10);
							}
						}
					}
				}
			}
		}
		for (local6 = 0; local6 < this.anInt7278; local6++) {
			local10 = 0;
			local14 = 0;
			if (!this.aBoolean462) {
				if (Static152.aBoolean198) {
					local14 = 8;
				}
				if (Static168.aBoolean222) {
					local10 = 2;
				}
				if (Static221.anInt4009 != 0) {
					if (Static439.aBoolean17 | local6 == 0) {
						local14 |= 0x10;
					}
					local10 |= 0x1;
				}
			}
			if (Static168.aBoolean222) {
				local14 |= 0x7;
			}
			@Pc(136) int[][] local136 = arg0 == null || local6 >= arg0.length ? this.anIntArrayArrayArray14[local6] : arg0[local6];
			Static285.method5697(local6, arg2.method4987(this.anInt7272, this.anInt7273, this.anIntArrayArrayArray14[local6], local136, local10, local14));
		}
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(BLclient!ae;IIII[Lclient!qo;)V")
	public final void method5988(@OriginalArg(1) Class6_Sub1 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class210[] arg5) {
		@Pc(6) int local6;
		@Pc(14) int local14;
		@Pc(18) int local18;
		@Pc(24) int local24;
		if (!this.aBoolean462) {
			for (local6 = 0; local6 < 4; local6++) {
				@Pc(12) Class210 local12 = arg5[local6];
				for (local14 = 0; local14 < 64; local14++) {
					for (local18 = 0; local18 < 64; local18++) {
						local24 = local14 + arg1;
						@Pc(28) int local28 = arg2 + local18;
						if (local24 >= 0 && local24 < this.anInt7272 && local28 >= 0 && local28 < this.anInt7273) {
							local12.method4708(local24, local28);
						}
					}
				}
			}
		}
		local6 = arg1 + arg3;
		@Pc(84) int local84 = arg2 + arg4;
		for (local14 = 0; local14 < this.anInt7278; local14++) {
			for (local18 = 0; local18 < 64; local18++) {
				for (local24 = 0; local24 < 64; local24++) {
					this.method5982(local24 + local84, false, 0, local24 + arg2, arg1 + local18, arg0, local14, 0, local6 + local18, 0);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(IIIIII)V")
	public final void method5989(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(7) int local7;
		for (@Pc(3) int local3 = arg0; local3 < arg1 + arg0; local3++) {
			for (local7 = arg2; local7 < arg2 + arg4; local7++) {
				if (local7 >= 0 && this.anInt7272 > local7 && local3 >= 0 && this.anInt7273 > local3) {
					this.anIntArrayArrayArray14[arg3][local7][local3] = arg3 <= 0 ? 0 : this.anIntArrayArrayArray14[arg3 - 1][local7][local3] - 240;
				}
			}
		}
		if (arg2 > 0 && arg2 < this.anInt7272) {
			for (local7 = arg0 + 1; local7 < arg1 + arg0; local7++) {
				if (local7 >= 0 && local7 < this.anInt7273) {
					this.anIntArrayArrayArray14[arg3][arg2][local7] = this.anIntArrayArrayArray14[arg3][arg2 - 1][local7];
				}
			}
		}
		if (arg0 > 0 && arg0 < this.anInt7273) {
			for (local7 = arg2 + 1; local7 < arg2 + arg4; local7++) {
				if (local7 >= 0 && this.anInt7272 > local7) {
					this.anIntArrayArrayArray14[arg3][local7][arg0] = this.anIntArrayArrayArray14[arg3][local7][arg0 - 1];
				}
			}
		}
		if (arg2 < 0 || arg0 < 0 || arg2 >= this.anInt7272 || arg0 >= this.anInt7273) {
			return;
		}
		if (arg3 == 0) {
			if (arg2 > 0 && this.anIntArrayArrayArray14[arg3][arg2 - 1][arg0] != 0) {
				this.anIntArrayArrayArray14[arg3][arg2][arg0] = this.anIntArrayArrayArray14[arg3][arg2 - 1][arg0];
			} else if (arg0 > 0 && this.anIntArrayArrayArray14[arg3][arg2][arg0 - 1] != 0) {
				this.anIntArrayArrayArray14[arg3][arg2][arg0] = this.anIntArrayArrayArray14[arg3][arg2][arg0 - 1];
			} else if (arg2 > 0 && arg0 > 0 && this.anIntArrayArrayArray14[arg3][arg2 - 1][arg0 - 1] != 0) {
				this.anIntArrayArrayArray14[arg3][arg2][arg0] = this.anIntArrayArrayArray14[arg3][arg2 - 1][arg0 - 1];
			}
		} else if (arg2 > 0 && this.anIntArrayArrayArray14[arg3][arg2 - 1][arg0] != this.anIntArrayArrayArray14[arg3 - 1][arg2 - 1][arg0]) {
			this.anIntArrayArrayArray14[arg3][arg2][arg0] = this.anIntArrayArrayArray14[arg3][arg2 - 1][arg0];
		} else if (arg0 > 0 && this.anIntArrayArrayArray14[arg3 - 1][arg2][arg0 - 1] != this.anIntArrayArrayArray14[arg3][arg2][arg0 - 1]) {
			this.anIntArrayArrayArray14[arg3][arg2][arg0] = this.anIntArrayArrayArray14[arg3][arg2][arg0 - 1];
		} else if (arg2 > 0 && arg0 > 0 && this.anIntArrayArrayArray14[arg3][arg2 - 1][arg0 - 1] != this.anIntArrayArrayArray14[arg3 - 1][arg2 - 1][arg0 - 1]) {
			this.anIntArrayArrayArray14[arg3][arg2][arg0] = this.anIntArrayArrayArray14[arg3][arg2 - 1][arg0 - 1];
		}
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(IIIIII[Lclient!qo;Lclient!ae;II)V")
	public final void method5990(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class210[] arg6, @OriginalArg(7) Class6_Sub1 arg7, @OriginalArg(9) int arg8) {
		@Pc(11) int local11 = (arg4 & 0x7) * 8;
		@Pc(20) int local20;
		@Pc(52) int local52;
		if (!this.aBoolean462) {
			@Pc(18) Class210 local18 = arg6[arg3];
			for (local20 = 0; local20 < 8; local20++) {
				for (@Pc(24) int local24 = 0; local24 < 8; local24++) {
					@Pc(39) int local39 = arg8 + Static447.method6095(local20 & 0x7, arg2, local24 & 0x7);
					local52 = arg0 + Static196.method3070(arg2, local20 & 0x7, local24 & 0x7);
					if (local39 > 0 && local39 < this.anInt7272 - 1 && local52 > 0 && this.anInt7273 - 1 > local52) {
						local18.method4708(local39, local52);
					}
				}
			}
		}
		@Pc(102) int local102 = (arg5 & 0x7) * 8;
		@Pc(108) int local108 = (arg4 & 0x1FFFFFF8) << 3;
		local20 = (arg5 & 0xFFFFFFF8) << 3;
		@Pc(116) byte local116 = 0;
		@Pc(118) byte local118 = 0;
		if (arg2 == 1) {
			local118 = 1;
		} else if (arg2 == 2) {
			local116 = 1;
			local118 = 1;
		} else if (arg2 == 3) {
			local116 = 1;
		}
		for (local52 = 0; local52 < this.anInt7278; local52++) {
			for (@Pc(158) int local158 = 0; local158 < 64; local158++) {
				for (@Pc(162) int local162 = 0; local162 < 64; local162++) {
					if (local52 == arg1 && local11 <= local158 && local158 <= local11 + 8 && local162 >= local102 && local102 + 8 >= local162) {
						@Pc(235) int local235;
						@Pc(228) int local228;
						if (local158 == local11 + 8 || local102 + 8 == local162) {
							if (arg2 == 0) {
								local228 = local162 + arg0 - local102;
								local235 = local158 + arg8 - local11;
							} else if (arg2 == 1) {
								local228 = local11 + arg0 + 8 - local158;
								local235 = arg8 + local162 - local102;
							} else if (arg2 == 2) {
								local228 = arg0 + local102 + 8 - local162;
								local235 = arg8 + local11 + 8 - local158;
							} else {
								local228 = arg0 + local158 - local11;
								local235 = local102 + arg8 + 8 - local162;
							}
							this.method5982(local20 + local162, true, 0, local228, local235, arg7, arg3, 0, local108 + local158, 0);
						} else {
							local235 = arg8 + Static447.method6095(local158 & 0x7, arg2, local162 & 0x7);
							local228 = arg0 + Static196.method3070(arg2, local158 & 0x7, local162 & 0x7);
							this.method5982(local20 + local162, false, local118, local228, local235, arg7, arg3, arg2, local108 + local158, local116);
							if (local158 == 63 || local162 == 63) {
								@Pc(382) int local382 = local158 == 63 ? 64 : local158;
								@Pc(389) int local389 = local162 == 63 ? 64 : local162;
								@Pc(407) int local407;
								@Pc(400) int local400;
								if (arg2 == 0) {
									local400 = local389 + arg0 - local102;
									local407 = arg8 + local382 - local11;
								} else if (arg2 == 1) {
									local407 = local389 + arg8 - local102;
									local400 = local11 + arg0 + 8 - local382;
								} else if (arg2 == 2) {
									local407 = arg8 + local11 + 8 - local382;
									local400 = local102 + arg0 + 8 - local389;
								} else {
									local400 = local382 + arg0 - local11;
									local407 = arg8 + local102 + 8 - local389;
								}
								if (local407 >= 0 && local407 < this.anInt7272 && local400 >= 0 && this.anInt7273 > local400) {
									this.anIntArrayArrayArray14[arg3][local407][local400] = this.anIntArrayArrayArray14[arg3][local116 + local235][local228 + local118];
								}
							}
						}
					} else {
						this.method5982(0, false, 0, -1, -1, arg7, 0, 0, 0, 0);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(Lclient!vp;Lclient!gr;[[BIILclient!eq;IIII[[B[[B[ZI)V")
	private void method5991(@OriginalArg(0) Class254 arg0, @OriginalArg(1) Class95 arg1, @OriginalArg(2) byte[][] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class66 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) byte[][] arg10, @OriginalArg(11) byte[][] arg11, @OriginalArg(12) boolean[] arg12) {
		@Pc(55) int local55;
		if (arg0 != null && arg1 != null || arg1 != null && arg9 == 12 || arg0 != null && arg9 == 0) {
			@Pc(36) boolean[] local36 = arg0 != null && arg0.aBoolean479 ? Static213.aBooleanArrayArray10[arg9] : Static189.aBooleanArrayArray6[arg9];
			@Pc(70) Class254 local70;
			@Pc(87) byte local87;
			@Pc(103) int local103;
			@Pc(108) int local108;
			if (arg4 > 0) {
				if (arg7 > 0) {
					local55 = arg2[arg7 - 1][arg4 - 1] & 0xFF;
					if (local55 > 0) {
						local70 = this.aClass253_5.method6228(local55 - 1);
						if (local70.anInt7607 != -1 && local70.aBoolean479) {
							local87 = arg11[arg7 - 1][arg4 - 1];
							local103 = arg10[arg7 - 1][arg4 - 1] * 2 + 4 & 0x7;
							local108 = Static320.method4620(local70, arg5);
							if (Static314.aBooleanArrayArray9[local87][local103]) {
								Static386.anIntArray472[0] = local70.anInt7607;
								Static408.anIntArray503[0] = local108;
								Static18.anIntArray21[0] = arg5.method5065() ? local70.anInt7611 : local70.anInt7620;
								Static35.anIntArray64[0] = local70.anInt7613;
								Static229.anIntArray300[0] = local70.anInt7615;
								Static282.anIntArray337[0] = 256;
							}
						}
					}
				}
				if (arg8 - 1 > arg7) {
					local55 = arg2[arg7 + 1][arg4 - 1] & 0xFF;
					if (local55 > 0) {
						local70 = this.aClass253_5.method6228(local55 - 1);
						if (local70.anInt7607 != -1 && local70.aBoolean479) {
							local87 = arg11[arg7 + 1][arg4 - 1];
							local103 = arg10[arg7 + 1][arg4 - 1] * 2 + 6 & 0x7;
							local108 = Static320.method4620(local70, arg5);
							if (Static314.aBooleanArrayArray9[local87][local103]) {
								Static386.anIntArray472[2] = local70.anInt7607;
								Static408.anIntArray503[2] = local108;
								Static18.anIntArray21[2] = arg5.method5065() ? local70.anInt7611 : local70.anInt7620;
								Static35.anIntArray64[2] = local70.anInt7613;
								Static229.anIntArray300[2] = local70.anInt7615;
								Static282.anIntArray337[2] = 512;
							}
						}
					}
				}
			}
			if (arg4 < arg3 - 1) {
				if (arg7 > 0) {
					local55 = arg2[arg7 - 1][arg4 + 1] & 0xFF;
					if (local55 > 0) {
						local70 = this.aClass253_5.method6228(local55 - 1);
						if (local70.anInt7607 != -1 && local70.aBoolean479) {
							local87 = arg11[arg7 - 1][arg4 + 1];
							local103 = arg10[arg7 - 1][arg4 + 1] * 2 + 2 & 0x7;
							local108 = Static320.method4620(local70, arg5);
							if (Static314.aBooleanArrayArray9[local87][local103]) {
								Static386.anIntArray472[6] = local70.anInt7607;
								Static408.anIntArray503[6] = local108;
								Static18.anIntArray21[6] = arg5.method5065() ? local70.anInt7611 : local70.anInt7620;
								Static35.anIntArray64[6] = local70.anInt7613;
								Static229.anIntArray300[6] = local70.anInt7615;
								Static282.anIntArray337[6] = 64;
							}
						}
					}
				}
				if (arg7 < arg8 - 1) {
					local55 = arg2[arg7 + 1][arg4 + 1] & 0xFF;
					if (local55 > 0) {
						local70 = this.aClass253_5.method6228(local55 - 1);
						if (local70.anInt7607 != -1 && local70.aBoolean479) {
							local87 = arg11[arg7 + 1][arg4 + 1];
							local103 = arg10[arg7 + 1][arg4 + 1] * 2 & 0x7;
							local108 = Static320.method4620(local70, arg5);
							if (Static314.aBooleanArrayArray9[local87][local103]) {
								Static386.anIntArray472[4] = local70.anInt7607;
								Static408.anIntArray503[4] = local108;
								Static18.anIntArray21[4] = arg5.method5065() ? local70.anInt7611 : local70.anInt7620;
								Static35.anIntArray64[4] = local70.anInt7613;
								Static229.anIntArray300[4] = local70.anInt7615;
								Static282.anIntArray337[4] = 128;
							}
						}
					}
				}
			}
			@Pc(551) int local551;
			@Pc(556) int local556;
			@Pc(558) int local558;
			@Pc(520) byte local520;
			if (arg4 > 0) {
				local55 = arg2[arg7][arg4 - 1] & 0xFF;
				if (local55 > 0) {
					local70 = this.aClass253_5.method6228(local55 - 1);
					if (local70.anInt7607 != -1) {
						local87 = arg11[arg7][arg4 - 1];
						local520 = arg10[arg7][arg4 - 1];
						if (local70.aBoolean479) {
							local108 = 2;
							local551 = local520 * 2 + 4;
							local556 = Static320.method4620(local70, arg5);
							for (local558 = 0; local558 < 3; local558++) {
								local551 &= 0x7;
								local108 &= 0x7;
								if (Static314.aBooleanArrayArray9[local87][local551] && local70.anInt7615 >= Static229.anIntArray300[local108]) {
									Static386.anIntArray472[local108] = local70.anInt7607;
									Static408.anIntArray503[local108] = local556;
									Static18.anIntArray21[local108] = arg5.method5065() ? local70.anInt7611 : local70.anInt7620;
									Static35.anIntArray64[local108] = local70.anInt7613;
									if (Static229.anIntArray300[local108] == local70.anInt7615) {
										Static282.anIntArray337[local108] |= 0x20;
									} else {
										Static282.anIntArray337[local108] = 32;
									}
									Static229.anIntArray300[local108] = local70.anInt7615;
								}
								local551++;
								local108--;
							}
							if (!local36[arg6 & 0x3]) {
								arg12[0] = Static213.aBooleanArrayArray10[local87][local520 + 2 & 0x3];
							}
						} else if (!local36[arg6 & 0x3]) {
							arg12[0] = Static189.aBooleanArrayArray6[local87][local520 + 2 & 0x3];
						}
					}
				}
			}
			if (arg3 - 1 > arg4) {
				local55 = arg2[arg7][arg4 + 1] & 0xFF;
				if (local55 > 0) {
					local70 = this.aClass253_5.method6228(local55 - 1);
					if (local70.anInt7607 != -1) {
						local87 = arg11[arg7][arg4 + 1];
						local520 = arg10[arg7][arg4 + 1];
						if (local70.aBoolean479) {
							local108 = 4;
							local551 = local520 * 2 + 2;
							local556 = Static320.method4620(local70, arg5);
							for (local558 = 0; local558 < 3; local558++) {
								local551 &= 0x7;
								local108 &= 0x7;
								if (Static314.aBooleanArrayArray9[local87][local551] && local70.anInt7615 >= Static229.anIntArray300[local108]) {
									Static386.anIntArray472[local108] = local70.anInt7607;
									Static408.anIntArray503[local108] = local556;
									Static18.anIntArray21[local108] = arg5.method5065() ? local70.anInt7611 : local70.anInt7620;
									Static35.anIntArray64[local108] = local70.anInt7613;
									if (Static229.anIntArray300[local108] == local70.anInt7615) {
										Static282.anIntArray337[local108] |= 0x10;
									} else {
										Static282.anIntArray337[local108] = 16;
									}
									Static229.anIntArray300[local108] = local70.anInt7615;
								}
								local551--;
								local108++;
							}
							if (!local36[arg6 + 2 & 0x3]) {
								arg12[2] = Static213.aBooleanArrayArray10[local87][--local520 & 0x3];
							}
						} else if (!local36[arg6 + 2 & 0x3]) {
							arg12[2] = Static189.aBooleanArrayArray6[local87][--local520 & 0x3];
						}
					}
				}
			}
			if (arg7 > 0) {
				local55 = arg2[arg7 - 1][arg4] & 0xFF;
				if (local55 > 0) {
					local70 = this.aClass253_5.method6228(local55 - 1);
					if (local70.anInt7607 != -1) {
						local87 = arg11[arg7 - 1][arg4];
						local520 = arg10[arg7 - 1][arg4];
						if (local70.aBoolean479) {
							local108 = 6;
							local551 = local520 * 2 + 4;
							local556 = Static320.method4620(local70, arg5);
							for (local558 = 0; local558 < 3; local558++) {
								local551 &= 0x7;
								local108 &= 0x7;
								if (Static314.aBooleanArrayArray9[local87][local551] && local70.anInt7615 >= Static229.anIntArray300[local108]) {
									Static386.anIntArray472[local108] = local70.anInt7607;
									Static408.anIntArray503[local108] = local556;
									Static18.anIntArray21[local108] = arg5.method5065() ? local70.anInt7611 : local70.anInt7620;
									Static35.anIntArray64[local108] = local70.anInt7613;
									if (local70.anInt7615 == Static229.anIntArray300[local108]) {
										Static282.anIntArray337[local108] |= 0x8;
									} else {
										Static282.anIntArray337[local108] = 8;
									}
									Static229.anIntArray300[local108] = local70.anInt7615;
								}
								local551--;
								local108++;
							}
							if (!local36[arg6 + 3 & 0x3]) {
								arg12[3] = Static213.aBooleanArrayArray10[local87][local520 + 1 & 0x3];
							}
						} else if (!local36[arg6 + 3 & 0x3]) {
							arg12[3] = Static189.aBooleanArrayArray6[local87][local520 + 1 & 0x3];
						}
					}
				}
			}
			if (arg8 - 1 > arg7) {
				local55 = arg2[arg7 + 1][arg4] & 0xFF;
				if (local55 > 0) {
					local70 = this.aClass253_5.method6228(local55 - 1);
					if (local70.anInt7607 != -1) {
						local87 = arg11[arg7 + 1][arg4];
						local520 = arg10[arg7 + 1][arg4];
						if (local70.aBoolean479) {
							local108 = 4;
							local551 = local520 * 2 + 6;
							local556 = Static320.method4620(local70, arg5);
							for (local558 = 0; local558 < 3; local558++) {
								local551 &= 0x7;
								local108 &= 0x7;
								if (Static314.aBooleanArrayArray9[local87][local551] && Static229.anIntArray300[local108] <= local70.anInt7615) {
									Static386.anIntArray472[local108] = local70.anInt7607;
									Static408.anIntArray503[local108] = local556;
									Static18.anIntArray21[local108] = arg5.method5065() ? local70.anInt7611 : local70.anInt7620;
									Static35.anIntArray64[local108] = local70.anInt7613;
									if (local70.anInt7615 == Static229.anIntArray300[local108]) {
										Static282.anIntArray337[local108] |= 0x4;
									} else {
										Static282.anIntArray337[local108] = 4;
									}
									Static229.anIntArray300[local108] = local70.anInt7615;
								}
								local108--;
								local551++;
							}
							if (!local36[arg6 + 1 & 0x3]) {
								arg12[1] = Static213.aBooleanArrayArray10[local87][local520 + 3 & 0x3];
							}
						} else if (!local36[arg6 + 1 & 0x3]) {
							arg12[1] = Static189.aBooleanArrayArray6[local87][local520 + 3 & 0x3];
						}
					}
				}
			}
		}
		if (arg0 == null) {
			return;
		}
		@Pc(1240) int local1240 = Static320.method4620(arg0, arg5);
		if (!arg0.aBoolean479) {
			return;
		}
		for (local55 = 0; local55 < 8; local55++) {
			@Pc(1256) int local1256 = local55 - arg6 * 2 & 0x7;
			if (Static314.aBooleanArrayArray9[arg9][local55] && arg0.anInt7615 >= Static229.anIntArray300[local1256]) {
				Static386.anIntArray472[local1256] = arg0.anInt7607;
				Static408.anIntArray503[local1256] = local1240;
				Static18.anIntArray21[local1256] = arg5.method5065() ? arg0.anInt7611 : arg0.anInt7620;
				Static35.anIntArray64[local1256] = arg0.anInt7613;
				if (arg0.anInt7615 == Static229.anIntArray300[local1256]) {
					Static282.anIntArray337[local1256] |= 0x2;
				} else {
					Static282.anIntArray337[local1256] = 2;
				}
				Static229.anIntArray300[local1256] = arg0.anInt7615;
			}
		}
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(IIIII)V")
	public final void method5992(@OriginalArg(2) int arg0, @OriginalArg(4) int arg1) {
		for (@Pc(13) int local13 = 0; local13 < this.anInt7278; local13++) {
			this.method5989(arg1, 64, arg0, local13, 64);
		}
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "([[ILclient!og;Lclient!og;Lclient!og;IBLclient!eq;)V")
	private void method5993(@OriginalArg(0) int[][] arg0, @OriginalArg(1) Class86 arg1, @OriginalArg(2) Class86 arg2, @OriginalArg(3) Class86 arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class66 arg5) {
		for (@Pc(3) int local3 = 0; local3 < this.anInt7272; local3++) {
			for (@Pc(7) int local7 = 0; local7 < this.anInt7273; local7++) {
				if (Static327.anInt5636 == -1 || Static426.method6223(Static327.anInt5636, local3, arg4, local7)) {
					@Pc(31) byte local31 = this.aByteArrayArrayArray14[arg4][local3][local7];
					@Pc(40) byte local40 = this.aByteArrayArrayArray17[arg4][local3][local7];
					@Pc(51) int local51 = this.aByteArrayArrayArray12[arg4][local3][local7] & 0xFF;
					@Pc(62) int local62 = this.aByteArrayArrayArray16[arg4][local3][local7] & 0xFF;
					@Pc(74) Class254 local74 = local51 == 0 ? null : this.aClass253_5.method6228(local51 - 1);
					@Pc(86) Class95 local86 = local62 == 0 ? null : this.aClass140_5.method3145(local62 - 1);
					@Pc(88) int local88 = 0;
					@Pc(90) int local90 = 0;
					if (local31 != 0) {
						local88 = local86 == null ? 0 : Static292.anIntArray350[local31];
						local90 = local74 == null ? 0 : Static286.anIntArray341[local31];
					} else if (local74 != null) {
						local90 = Static286.anIntArray341[local31];
					} else if (local86 != null) {
						local88 = Static286.anIntArray341[local31];
					}
					@Pc(131) int local131 = local90 + local88;
					@Pc(133) int local133 = 0;
					if (local131 != 0) {
						@Pc(138) int[] local138 = new int[local131];
						@Pc(141) int[] local141 = new int[local131];
						@Pc(144) int[] local144 = new int[local131];
						@Pc(147) int[] local147 = new int[local131];
						@Pc(149) boolean local149 = false;
						@Pc(166) int local166;
						@Pc(194) int local194;
						if (local74 == null || local74.anInt7607 == -1 && local74.anInt7619 == -1 && local74.anInt7611 == -1) {
							for (local166 = 0; local166 < local90; local166++) {
								local138[local133] = -1;
								local133++;
							}
						} else {
							local166 = arg5.method5065() ? local74.anInt7611 : local74.anInt7620;
							if (Static415.aBoolean470) {
								local166 = -1;
							}
							for (local194 = 0; local194 < local90; local194++) {
								local144[local133] = local166;
								local147[local133] = local74.anInt7613;
								if (local74.anInt7607 == -1) {
									local138[local133] = -1;
								} else {
									local138[local133] = local74.anInt7607;
								}
								if (local74.anInt7619 == -1) {
									local141[local133] = -1;
								} else {
									local141[local133] = local74.anInt7619;
									local149 = true;
								}
								local133++;
							}
							if (!this.aBoolean462 && arg4 == 0) {
								Static339.method4927(local3, local7, local74.anInt7617, local74.anInt7614 * 8, local74.anInt7609);
							}
						}
						if (!local149) {
							local141 = null;
						}
						if (local86 == null) {
							for (local166 = 0; local166 < local88; local166++) {
								local138[local133] = -1;
								local133++;
							}
						} else {
							local166 = local86.anInt2892;
							if (Static415.aBoolean470) {
								local166 = -1;
							}
							for (local194 = 0; local194 < local88; local194++) {
								local144[local133] = local166;
								local147[local133] = local86.anInt2899;
								local138[local133] = arg0[local3][local7];
								if (local141 != null) {
									local141[local133] = -1;
								}
								local133++;
							}
						}
						local166 = this.anIntArray498.length;
						@Pc(334) int[] local334 = new int[local166];
						@Pc(337) int[] local337 = new int[local166];
						@Pc(344) int[] local344 = arg1 == null ? null : new int[local166];
						@Pc(353) int[] local353 = arg1 == null && arg2 == null ? null : new int[local166];
						@Pc(362) int local362;
						@Pc(367) int local367;
						@Pc(447) int local447;
						@Pc(453) int local453;
						for (@Pc(355) int local355 = 0; local355 < local166; local355++) {
							local362 = this.anIntArray498[local355];
							local367 = this.anIntArray499[local355];
							if (local40 == 0) {
								local334[local355] = local362;
								local337[local355] = local367;
							} else if (local40 == 1) {
								local334[local355] = local367;
								local337[local355] = 128 - local362;
							} else if (local40 == 2) {
								local334[local355] = 128 - local362;
								local337[local355] = 128 - local367;
							} else if (local40 == 3) {
								local334[local355] = 128 - local367;
								local337[local355] = local362;
							}
							if (local344 != null && Static314.aBooleanArrayArray9[local31][local355]) {
								local447 = (local3 << 7) + local362;
								local453 = (local7 << 7) + local362;
								local344[local355] = arg1.method6590(local447, local453) - arg3.method6590(local447, local453);
							}
							if (local353 != null) {
								if (arg1 != null && !Static314.aBooleanArrayArray9[local31][local355]) {
									local447 = local362 + (local3 << 7);
									local453 = local362 + (local7 << 7);
									local353[local355] = arg3.method6590(local447, local453) - arg1.method6590(local447, local453);
								} else if (arg2 != null && !Static48.aBooleanArrayArray3[local31][local355]) {
									local447 = (local3 << 7) + local362;
									local453 = (local7 << 7) + local362;
									local353[local355] = arg2.method6590(local447, local453) - arg3.method6590(local447, local453);
								}
							}
						}
						local362 = arg3.method6594(local3, local7);
						local367 = arg3.method6594(local3 + 1, local7);
						local447 = arg3.method6594(local3 + 1, local7 + 1);
						local453 = arg3.method6594(local3, local7 + 1);
						if (arg4 > 0) {
							@Pc(574) boolean local574 = true;
							if (local62 == 0 && local31 != 0) {
								local574 = false;
							}
							if (local51 > 0 && local74 != null && !local74.aBoolean480) {
								local574 = false;
							}
							if (local574 && local367 == local362 && local447 == local362 && local453 == local362) {
								this.aByteArrayArrayArray13[arg4][local3][local7] = (byte) (this.aByteArrayArrayArray13[arg4][local3][local7] | 0x4);
							}
						}
						@Pc(628) int local628 = 0;
						@Pc(630) int local630 = 0;
						@Pc(632) int local632 = 0;
						if (this.aBoolean462) {
							local628 = Static136.method2410(local3, local7);
							local630 = Static410.method6046(local3, local7);
							local632 = Static265.method4074(local3, local7);
						}
						arg3.method6596(local3, local7, local334, local344, local337, local353, Static328.anIntArrayArray35[local31], Static295.anIntArrayArray30[local31], Static246.anIntArrayArray26[local31], local138, local141, local144, local147, local628, local630, local632);
						Static300.method4424(arg4, local3, local7);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "([[IBI)V")
	public final void method5994(@OriginalArg(0) int[][] arg0) {
		@Pc(10) int[][] local10 = this.anIntArrayArrayArray14[0];
		for (@Pc(28) int local28 = 0; local28 < this.anInt7272 + 1; local28++) {
			for (@Pc(32) int local32 = 0; local32 < this.anInt7273 + 1; local32++) {
				local10[local28][local32] += arg0[local28][local32];
			}
		}
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(ILclient!eq;Lclient!og;Lclient!og;)V")
	public final void method5995(@OriginalArg(1) Class66 arg0, @OriginalArg(2) Class86 arg1, @OriginalArg(3) Class86 arg2) {
		@Pc(11) int[][] local11 = new int[this.anInt7272][this.anInt7273];
		if (Static25.anIntArray34 == null || Static25.anIntArray34.length != this.anInt7273) {
			Static348.anIntArray403 = new int[this.anInt7273];
			Static327.anIntArray385 = new int[this.anInt7273];
			Static339.anIntArray400 = new int[this.anInt7273];
			Static25.anIntArray34 = new int[this.anInt7273];
			Static175.anIntArray222 = new int[this.anInt7273];
		}
		@Pc(48) int local48;
		for (@Pc(44) int local44 = 0; local44 < this.anInt7278; local44++) {
			for (local48 = 0; local48 < this.anInt7273; local48++) {
				Static25.anIntArray34[local48] = 0;
				Static348.anIntArray403[local48] = 0;
				Static327.anIntArray385[local48] = 0;
				Static339.anIntArray400[local48] = 0;
				Static175.anIntArray222[local48] = 0;
			}
			for (@Pc(77) int local77 = -5; local77 < this.anInt7272; local77++) {
				@Pc(87) int local87;
				@Pc(106) int local106;
				@Pc(172) int local172;
				for (@Pc(81) int local81 = 0; local81 < this.anInt7273; local81++) {
					local87 = local77 + 5;
					@Pc(152) int local152;
					if (local87 < this.anInt7272) {
						local106 = this.aByteArrayArrayArray16[local44][local87][local81] & 0xFF;
						if (local106 > 0) {
							@Pc(116) Class95 local116 = this.aClass140_5.method3145(local106 - 1);
							Static25.anIntArray34[local81] += local116.anInt2891;
							Static348.anIntArray403[local81] += local116.anInt2895;
							Static327.anIntArray385[local81] += local116.anInt2898;
							Static339.anIntArray400[local81] += local116.anInt2897;
							local152 = Static175.anIntArray222[local81]++;
						}
					}
					local106 = local77 - 5;
					if (local106 >= 0) {
						local172 = this.aByteArrayArrayArray16[local44][local106][local81] & 0xFF;
						if (local172 > 0) {
							@Pc(182) Class95 local182 = this.aClass140_5.method3145(local172 - 1);
							Static25.anIntArray34[local81] -= local182.anInt2891;
							Static348.anIntArray403[local81] -= local182.anInt2895;
							Static327.anIntArray385[local81] -= local182.anInt2898;
							Static339.anIntArray400[local81] -= local182.anInt2897;
							local152 = Static175.anIntArray222[local81]--;
						}
					}
				}
				if (local77 >= 0) {
					local87 = 0;
					local106 = 0;
					local172 = 0;
					@Pc(240) int local240 = 0;
					@Pc(242) int local242 = 0;
					for (@Pc(244) int local244 = -5; local244 < this.anInt7273; local244++) {
						@Pc(250) int local250 = local244 + 5;
						if (this.anInt7273 > local250) {
							local172 += Static327.anIntArray385[local250];
							local242 += Static175.anIntArray222[local250];
							local106 += Static348.anIntArray403[local250];
							local87 += Static25.anIntArray34[local250];
							local240 += Static339.anIntArray400[local250];
						}
						@Pc(288) int local288 = local244 - 5;
						if (local288 >= 0) {
							local172 -= Static327.anIntArray385[local288];
							local87 -= Static25.anIntArray34[local288];
							local242 -= Static175.anIntArray222[local288];
							local106 -= Static348.anIntArray403[local288];
							local240 -= Static339.anIntArray400[local288];
						}
						if (local244 >= 0 && local240 > 0 && local242 > 0) {
							local11[local77][local244] = Static441.method6378(local106 / local242, local172 / local242, local87 * 256 / local240);
						}
					}
				}
			}
			if (Static103.aBoolean152) {
				this.method5984(Static55.aClass86Array1[local44], local44 == 0 ? arg1 : null, local44 == 0 ? arg2 : null, arg0, local44, local11);
			} else {
				this.method5993(local11, local44 == 0 ? arg1 : null, local44 == 0 ? arg2 : null, Static55.aClass86Array1[local44], local44, arg0);
			}
			this.aByteArrayArrayArray16[local44] = null;
			this.aByteArrayArrayArray12[local44] = null;
			this.aByteArrayArrayArray14[local44] = null;
			this.aByteArrayArrayArray17[local44] = null;
		}
		if (!this.aBoolean462) {
			if (Static221.anInt4009 != 0) {
				Static447.method6093();
			}
			if (Static168.aBoolean222) {
				Static409.method6043();
			}
		}
		for (local48 = 0; local48 < this.anInt7278; local48++) {
			Static55.aClass86Array1[local48].method6582();
		}
	}
}
