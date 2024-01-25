import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ns")
public class Class231 {

	@OriginalMember(owner = "client!ns", name = "F", descriptor = "[[[B")
	public byte[][][] aByteArrayArrayArray18;

	@OriginalMember(owner = "client!ns", name = "e", descriptor = "[I")
	private final int[] anIntArray528 = new int[] { 0, 256, 512, 512, 512, 256, 0, 0, 128, 256, 128, 384, 256 };

	@OriginalMember(owner = "client!ns", name = "h", descriptor = "[I")
	private final int[] anIntArray529 = new int[] { 0, 0, 0, 256, 512, 512, 512, 256, 256, 384, 128, 128, 256 };

	@OriginalMember(owner = "client!ns", name = "z", descriptor = "I")
	public final int anInt8038;

	@OriginalMember(owner = "client!ns", name = "m", descriptor = "I")
	protected final int anInt8031;

	@OriginalMember(owner = "client!ns", name = "w", descriptor = "Z")
	public final boolean aBoolean576;

	@OriginalMember(owner = "client!ns", name = "A", descriptor = "I")
	protected final int anInt8039;

	@OriginalMember(owner = "client!ns", name = "r", descriptor = "Lclient!cq;")
	private final Class56 aClass56_5;

	@OriginalMember(owner = "client!ns", name = "f", descriptor = "Lclient!lp;")
	private final Class206 aClass206_5;

	@OriginalMember(owner = "client!ns", name = "C", descriptor = "[[[B")
	private final byte[][][] aByteArrayArrayArray17;

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "[[[B")
	private final byte[][][] aByteArrayArrayArray13;

	@OriginalMember(owner = "client!ns", name = "b", descriptor = "[[[B")
	private final byte[][][] aByteArrayArrayArray14;

	@OriginalMember(owner = "client!ns", name = "x", descriptor = "[[[B")
	protected byte[][][] aByteArrayArrayArray16;

	@OriginalMember(owner = "client!ns", name = "v", descriptor = "[[[I")
	public final int[][][] anIntArrayArrayArray17;

	@OriginalMember(owner = "client!ns", name = "j", descriptor = "[[[B")
	private final byte[][][] aByteArrayArrayArray15;

	@OriginalMember(owner = "client!ns", name = "<init>", descriptor = "(IIIZLclient!lp;Lclient!cq;)V")
	protected Class231(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) Class206 arg4, @OriginalArg(5) Class56 arg5) {
		this.anInt8038 = arg0;
		this.anInt8031 = arg1;
		this.aBoolean576 = arg3;
		this.anInt8039 = arg2;
		this.aClass56_5 = arg5;
		this.aClass206_5 = arg4;
		this.aByteArrayArrayArray17 = new byte[this.anInt8038][this.anInt8031][this.anInt8039];
		this.aByteArrayArrayArray13 = new byte[this.anInt8038][this.anInt8031][this.anInt8039];
		this.aByteArrayArrayArray14 = new byte[this.anInt8038][this.anInt8031][this.anInt8039];
		this.aByteArrayArrayArray16 = new byte[this.anInt8038][this.anInt8031 + 1][this.anInt8039 + 1];
		this.anIntArrayArrayArray17 = new int[this.anInt8038][this.anInt8031 + 1][this.anInt8039 + 1];
		this.aByteArrayArrayArray15 = new byte[this.anInt8038][this.anInt8031][this.anInt8039];
	}

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(ZIIIIIBILclient!io;II)V")
	private void method6679(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) Class1_Sub20 arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		if (arg1 == 1) {
			arg9 = 1;
		} else if (arg1 == 2) {
			arg4 = 1;
			arg9 = 1;
		} else if (arg1 == 3) {
			arg4 = 1;
		}
		@Pc(59) int local59;
		if (arg8 < 0 || this.anInt8031 <= arg8 || arg5 < 0 || arg5 >= this.anInt8039) {
			while (true) {
				local59 = arg7.method4393();
				if (local59 == 0) {
					return;
				}
				if (local59 == 1) {
					arg7.method4393();
					return;
				}
				if (local59 <= 49) {
					arg7.method4393();
				}
			}
			return;
		}
		if (!this.aBoolean576 && !arg0) {
			Static511.aByteArrayArrayArray19[arg6][arg8][arg5] = 0;
		}
		while (true) {
			local59 = arg7.method4393();
			if (local59 == 0) {
				if (this.aBoolean576) {
					this.anIntArrayArrayArray17[0][arg8 + arg4][arg5 + arg9] = 0;
					return;
				} else if (arg6 == 0) {
					this.anIntArrayArrayArray17[0][arg4 + arg8][arg9 + arg5] = -Static357.method5221(arg2 + 556238, arg3 + 932731) * 8 << 2;
					return;
				} else {
					this.anIntArrayArrayArray17[arg6][arg4 + arg8][arg9 + arg5] = this.anIntArrayArrayArray17[arg6 - 1][arg8 + arg4][arg9 + arg5] - 960;
					return;
				}
			}
			if (local59 == 1) {
				@Pc(191) int local191 = arg7.method4393();
				if (this.aBoolean576) {
					this.anIntArrayArrayArray17[0][arg8 + arg4][arg9 + arg5] = local191 * 8 << 2;
					return;
				}
				if (local191 == 1) {
					local191 = 0;
				}
				if (arg6 != 0) {
					this.anIntArrayArrayArray17[arg6][arg4 + arg8][arg5 + arg9] = this.anIntArrayArrayArray17[arg6 - 1][arg4 + arg8][arg5 + arg9] - (local191 * 8 << 2);
					return;
				}
				this.anIntArrayArrayArray17[0][arg4 + arg8][arg9 + arg5] = -local191 * 8 << 2;
				return;
			}
			if (local59 <= 49) {
				if (arg0) {
					arg7.method4393();
				} else {
					this.aByteArrayArrayArray15[arg6][arg8][arg5] = arg7.method4432();
					this.aByteArrayArrayArray17[arg6][arg8][arg5] = (byte) ((local59 - 2) / 4);
					this.aByteArrayArrayArray14[arg6][arg8][arg5] = (byte) (local59 + arg1 - 2 & 0x3);
				}
			} else if (local59 <= 81) {
				if (!this.aBoolean576 && !arg0) {
					Static511.aByteArrayArrayArray19[arg6][arg8][arg5] = (byte) (local59 - 49);
				}
			} else if (!arg0) {
				this.aByteArrayArrayArray13[arg6][arg8][arg5] = (byte) (local59 - 81);
			}
		}
	}

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(ILclient!i;I[[ILclient!i;Lclient!r;Lclient!i;)V")
	private void method6680(@OriginalArg(0) int arg0, @OriginalArg(1) Class17 arg1, @OriginalArg(3) int[][] arg2, @OriginalArg(4) Class17 arg3, @OriginalArg(5) Class12 arg4, @OriginalArg(6) Class17 arg5) {
		@Pc(10) byte[][] local10 = this.aByteArrayArrayArray17[arg0];
		@Pc(15) byte[][] local15 = this.aByteArrayArrayArray14[arg0];
		@Pc(20) byte[][] local20 = this.aByteArrayArrayArray13[arg0];
		@Pc(25) byte[][] local25 = this.aByteArrayArrayArray15[arg0];
		for (@Pc(31) int local31 = 0; local31 < this.anInt8031; local31++) {
			@Pc(45) int local45 = this.anInt8031 - 1 > local31 ? local31 + 1 : local31;
			for (@Pc(47) int local47 = 0; local47 < this.anInt8039; local47++) {
				@Pc(65) int local65 = local47 >= this.anInt8039 - 1 ? local47 : local47 + 1;
				if (Static595.anInt9666 == -1 || Static484.method6767(Static595.anInt9666, local47, arg0, local31)) {
					@Pc(80) boolean local80 = false;
					@Pc(82) boolean local82 = false;
					@Pc(85) boolean[] local85 = new boolean[4];
					@Pc(91) int local91 = local10[local31][local47];
					@Pc(97) int local97 = local15[local31][local47];
					@Pc(105) int local105 = local25[local31][local47] & 0xFF;
					@Pc(113) int local113 = local20[local31][local47] & 0xFF;
					@Pc(121) int local121 = local20[local31][local65] & 0xFF;
					@Pc(129) int local129 = local20[local45][local65] & 0xFF;
					@Pc(137) int local137 = local20[local45][local47] & 0xFF;
					if (local105 != 0 || local113 != 0) {
						@Pc(156) Class303 local156 = local105 == 0 ? null : this.aClass206_5.method4718(local105 - 1);
						if (local91 == 0 && local156 == null) {
							local91 = 12;
						}
						@Pc(177) Class166 local177 = local113 == 0 ? null : this.aClass56_5.method1618(local113 - 1);
						@Pc(179) Class303 local179 = local156;
						if (local156 != null) {
							if (local156.anInt8298 == -1 && local156.anInt8303 == -1) {
								local179 = local156;
								local156 = null;
							} else if (local177 != null && local91 != 0) {
								local82 = local156.aBoolean601;
							}
						}
						@Pc(286) int local286;
						@Pc(301) int local301;
						@Pc(366) int local366;
						@Pc(375) int local375;
						if ((local91 == 0 || local91 == 12) && local31 > 0 && local47 > 0 && local31 < this.anInt8031 && this.anInt8039 > local47) {
							@Pc(248) int local248 = local20[local45][local65] == local113 ? 1 : -1;
							@Pc(265) int local265 = local20[local45][local47 - 1] == local113 ? 1 : -1;
							local286 = local20[local31 - 1][local47 - 1] == local113 ? 1 : -1;
							local301 = local20[local31 - 1][local65] == local113 ? 1 : -1;
							if (local20[local31][local47 - 1] == local113) {
								local265++;
								local286++;
							} else {
								local286--;
								local265--;
							}
							if (local20[local45][local47] == local113) {
								local265++;
								local248++;
							} else {
								local248--;
								local265--;
							}
							if (local113 == local20[local31][local65]) {
								local301++;
								local248++;
							} else {
								local248--;
								local301--;
							}
							if (local20[local31 - 1][local47] == local113) {
								local301++;
								local286++;
							} else {
								local301--;
								local286--;
							}
							local366 = local286 - local248;
							if (local366 < 0) {
								local366 = -local366;
							}
							local375 = local265 - local301;
							if (local375 < 0) {
								local375 = -local375;
							}
							if (local366 == local375) {
								local366 = arg5.method6642(local31, local47) - arg5.method6642(local45, local65);
								if (local366 < 0) {
									local366 = -local366;
								}
								local375 = arg5.method6642(local45, local47) - arg5.method6642(local31, local65);
								if (local375 < 0) {
									local375 = -local375;
								}
							}
							local97 = local375 > local366 ? 1 : 0;
						}
						for (local286 = 0; local286 < 13; local286++) {
							Static324.anIntArray370[local286] = -1;
							Static250.anIntArray287[local286] = 1;
						}
						@Pc(459) boolean[] local459 = local156 != null && local156.aBoolean601 ? Static207.aBooleanArrayArray10[local91] : Static542.aBooleanArrayArray11[local91];
						this.method6683(local10, this.anInt8031, this.anInt8039, local31, local97, arg4, local47, local85, local156, local177, local15, local91, local25);
						@Pc(488) boolean local488 = local156 != null && local156.anInt8298 != local156.anInt8303;
						if (!local488) {
							for (local301 = 0; local301 < 8; local301++) {
								if (Static324.anIntArray370[local301] >= 0 && Static176.anIntArray186[local301] != Static52.anIntArray64[local301]) {
									local488 = true;
									break;
								}
							}
						}
						if (!local459[local97 + 1 & 0x3]) {
							local85[1] = Static156.method2422(local85[1], (Static250.anIntArray287[4] & Static250.anIntArray287[2]) == 0);
						}
						if (!local459[local97 + 3 & 0x3]) {
							local85[3] = Static156.method2422(local85[3], (Static250.anIntArray287[0] & Static250.anIntArray287[6]) == 0);
						}
						if (!local459[local97 & 0x3]) {
							local85[0] = Static156.method2422(local85[0], (Static250.anIntArray287[2] & Static250.anIntArray287[0]) == 0);
						}
						if (!local459[local97 + 2 & 0x3]) {
							local85[2] = Static156.method2422(local85[2], (Static250.anIntArray287[6] & Static250.anIntArray287[4]) == 0);
						}
						if (!local82 && (local91 == 0 || local91 == 12)) {
							if (local85[0] && !local85[1] && !local85[2] && local85[3]) {
								local85[0] = local85[3] = false;
								local91 = local91 == 0 ? 13 : 14;
								local97 = 0;
							} else if (local85[0] && local85[1] && !local85[2] && !local85[3]) {
								local97 = 3;
								local91 = local91 == 0 ? 13 : 14;
								local85[0] = local85[1] = false;
							} else if (!local85[0] && local85[1] && local85[2] && !local85[3]) {
								local97 = 2;
								local85[1] = local85[2] = false;
								local91 = local91 == 0 ? 13 : 14;
							} else if (!local85[0] && !local85[1] && local85[2] && local85[3]) {
								local91 = local91 == 0 ? 13 : 14;
								local97 = 1;
								local85[2] = local85[3] = false;
							}
						}
						@Pc(796) boolean local796 = !local82 && !local85[0] && !local85[2] && !local85[1] && !local85[3];
						@Pc(798) int[] local798 = null;
						@Pc(816) int[] local816;
						@Pc(828) int[] local828;
						@Pc(804) int[] local804;
						if (local796) {
							local804 = Static341.anIntArrayArray41[local91];
							local375 = local156 == null ? 0 : Static283.anIntArray315[local91];
							local816 = Static105.anIntArrayArray13[local91];
							local366 = local177 == null ? 0 : Static122.anIntArray149[local91];
							local828 = Static101.anIntArrayArray11[local91];
						} else if (local82) {
							local366 = local177 == null ? 0 : Static541.anIntArray628[local91];
							local828 = Static50.anIntArrayArray7[local91];
							local798 = Static360.anIntArrayArray44[local91];
							local375 = local156 == null ? 0 : Static322.anIntArray408[local91];
							local804 = Static68.anIntArrayArray8[local91];
							local816 = Static430.anIntArrayArray49[local91];
						} else {
							local798 = Static268.anIntArrayArray32[local91];
							local828 = Static586.anIntArrayArray63[local91];
							local366 = local177 == null ? 0 : Static343.anIntArray411[local91];
							local804 = Static424.anIntArrayArray48[local91];
							local375 = local156 == null ? 0 : Static187.anIntArray431[local91];
							local816 = Static356.anIntArrayArray47[local91];
						}
						@Pc(901) int local901 = local366 + local375;
						if (local901 <= 0) {
							Static331.method4978(arg0, local31, local47);
						} else {
							if (local85[0]) {
								local901++;
							}
							if (local85[2]) {
								local901++;
							}
							if (local85[1]) {
								local901++;
							}
							if (local85[3]) {
								local901++;
							}
							@Pc(934) int local934 = 0;
							@Pc(936) int local936 = 0;
							@Pc(940) int local940 = local901 * 3;
							@Pc(947) int[] local947 = local488 ? new int[local940] : null;
							@Pc(950) int[] local950 = new int[local940];
							@Pc(953) int[] local953 = new int[local940];
							@Pc(956) int[] local956 = new int[local940];
							@Pc(959) int[] local959 = new int[local940];
							@Pc(962) int[] local962 = new int[local940];
							@Pc(969) int[] local969 = arg3 == null ? null : new int[local940];
							@Pc(978) int[] local978 = arg3 == null && arg1 == null ? null : new int[local940];
							@Pc(980) int local980 = -1;
							@Pc(982) int local982 = -1;
							@Pc(984) int local984 = 256;
							@Pc(1052) byte local1052;
							@Pc(1000) int local1000;
							@Pc(1002) int local1002;
							@Pc(1226) int local1226;
							@Pc(1232) int local1232;
							@Pc(1241) int local1241;
							@Pc(1246) int local1246;
							@Pc(1264) int local1264;
							@Pc(1251) int local1251;
							@Pc(1266) int local1266;
							@Pc(1319) int local1319;
							@Pc(1325) int local1325;
							if (local156 != null) {
								local982 = local156.anInt8309;
								local980 = local156.anInt8298;
								local984 = local156.anInt8308;
								local1000 = Static359.method5228(local156, arg4);
								for (local1002 = 0; local1002 < local375; local1002++) {
									if (local85[-local97 & 0x3] && local798[0] == local934) {
										Static187.anIntArray435[0] = local816[local934];
										Static187.anIntArray435[1] = 1;
										Static187.anIntArray435[2] = local804[local934];
										Static187.anIntArray435[3] = 1;
										Static187.anIntArray435[4] = local828[local934];
										Static187.anIntArray435[5] = local804[local934];
										local1052 = 6;
									} else if (local85[2 - local97 & 0x3] && local934 == local798[2]) {
										Static187.anIntArray435[0] = local816[local934];
										Static187.anIntArray435[1] = 5;
										Static187.anIntArray435[2] = local804[local934];
										Static187.anIntArray435[3] = 5;
										Static187.anIntArray435[4] = local828[local934];
										Static187.anIntArray435[5] = local804[local934];
										local1052 = 6;
									} else if (local85[1 - local97 & 0x3] && local798[1] == local934) {
										Static187.anIntArray435[0] = local816[local934];
										Static187.anIntArray435[1] = 3;
										Static187.anIntArray435[2] = local804[local934];
										Static187.anIntArray435[3] = 3;
										Static187.anIntArray435[4] = local828[local934];
										Static187.anIntArray435[5] = local804[local934];
										local1052 = 6;
									} else if (local85[3 - local97 & 0x3] && local934 == local798[3]) {
										Static187.anIntArray435[0] = local816[local934];
										Static187.anIntArray435[1] = 7;
										Static187.anIntArray435[2] = local804[local934];
										Static187.anIntArray435[3] = 7;
										Static187.anIntArray435[4] = local828[local934];
										Static187.anIntArray435[5] = local804[local934];
										local1052 = 6;
									} else {
										Static187.anIntArray435[0] = local816[local934];
										Static187.anIntArray435[1] = local828[local934];
										Static187.anIntArray435[2] = local804[local934];
										local1052 = 3;
									}
									local934++;
									for (local1226 = 0; local1226 < local1052; local1226++) {
										local1232 = Static187.anIntArray435[local1226];
										local1241 = local1232 - local97 * 2 & 0x7;
										local1246 = this.anIntArray528[local1232];
										local1251 = this.anIntArray529[local1232];
										if (local97 == 1) {
											local1266 = 512 - local1246;
											local1264 = local1251;
										} else if (local97 == 2) {
											local1266 = 512 - local1251;
											local1264 = 512 - local1246;
										} else if (local97 == 3) {
											local1264 = 512 - local1251;
											local1266 = local1246;
										} else {
											local1264 = local1246;
											local1266 = local1251;
										}
										local950[local936] = local1264;
										local953[local936] = local1266;
										if (local969 != null && Static253.aBooleanArrayArray8[local91][local1232]) {
											local1319 = (local31 << 9) + local1264;
											local1325 = local1266 + (local47 << 9);
											local969[local936] = arg3.method6637(local1319, local1325) - arg5.method6637(local1319, local1325);
										}
										if (local978 != null) {
											if (arg3 != null && !Static253.aBooleanArrayArray8[local91][local1232]) {
												local1319 = (local31 << 9) + local1264;
												local1325 = local1266 + (local47 << 9);
												local978[local936] = arg5.method6637(local1319, local1325) - arg3.method6637(local1319, local1325);
											} else if (arg1 != null && !Static543.aBooleanArrayArray12[local91][local1232]) {
												local1319 = (local31 << 9) + local1264;
												local1325 = local1266 + (local47 << 9);
												local978[local936] = arg1.method6637(local1319, local1325) - arg5.method6637(local1319, local1325);
											}
										}
										if (local1232 < 8 && local156.anInt8313 < Static324.anIntArray370[local1241]) {
											if (local947 != null) {
												local947[local936] = Static176.anIntArray186[local1241];
											}
											local962[local936] = Static176.anIntArray184[local1241];
											local959[local936] = Static213.anIntArray243[local1241];
											local956[local936] = Static52.anIntArray64[local1241];
										} else {
											if (local947 != null) {
												local947[local936] = local1000;
											}
											local959[local936] = local156.anInt8309;
											local962[local936] = local156.anInt8308;
											local956[local936] = local980;
										}
										local936++;
									}
								}
								if (!this.aBoolean576 && arg0 == 0) {
									Static382.method5523(local31, local47, local156.anInt8311, local156.anInt8305 * 8, local156.anInt8302);
								}
								if (local91 != 12 && local156.anInt8298 != -1 && local156.aBoolean600) {
									local80 = true;
								}
							} else if (local796) {
								local934 = Static283.anIntArray315[local91];
							} else if (local82) {
								local934 = Static322.anIntArray408[local91];
							} else {
								local934 = Static187.anIntArray431[local91];
							}
							if (local177 != null) {
								if (local129 == 0) {
									local129 = local113;
								}
								if (local121 == 0) {
									local121 = local113;
								}
								if (local137 == 0) {
									local137 = local113;
								}
								@Pc(1565) Class166 local1565 = this.aClass56_5.method1618(local113 - 1);
								@Pc(1573) Class166 local1573 = this.aClass56_5.method1618(local121 - 1);
								@Pc(1581) Class166 local1581 = this.aClass56_5.method1618(local129 - 1);
								@Pc(1589) Class166 local1589 = this.aClass56_5.method1618(local137 - 1);
								for (local1241 = 0; local1241 < local366; local1241++) {
									if (local85[-local97 & 0x3] && local934 == local798[0]) {
										Static187.anIntArray435[0] = local816[local934];
										Static187.anIntArray435[1] = 1;
										Static187.anIntArray435[2] = local804[local934];
										Static187.anIntArray435[3] = 1;
										Static187.anIntArray435[4] = local828[local934];
										local1052 = 6;
										Static187.anIntArray435[5] = local804[local934];
									} else if (local85[2 - local97 & 0x3] && local934 == local798[2]) {
										Static187.anIntArray435[0] = local816[local934];
										Static187.anIntArray435[1] = 5;
										Static187.anIntArray435[2] = local804[local934];
										Static187.anIntArray435[3] = 5;
										Static187.anIntArray435[4] = local828[local934];
										Static187.anIntArray435[5] = local804[local934];
										local1052 = 6;
									} else if (local85[1 - local97 & 0x3] && local934 == local798[1]) {
										Static187.anIntArray435[0] = local816[local934];
										Static187.anIntArray435[1] = 3;
										Static187.anIntArray435[2] = local804[local934];
										Static187.anIntArray435[3] = 3;
										Static187.anIntArray435[4] = local828[local934];
										Static187.anIntArray435[5] = local804[local934];
										local1052 = 6;
									} else if (local85[3 - local97 & 0x3] && local934 == local798[3]) {
										Static187.anIntArray435[0] = local816[local934];
										Static187.anIntArray435[1] = 7;
										Static187.anIntArray435[2] = local804[local934];
										Static187.anIntArray435[3] = 7;
										Static187.anIntArray435[4] = local828[local934];
										local1052 = 6;
										Static187.anIntArray435[5] = local804[local934];
									} else {
										Static187.anIntArray435[0] = local816[local934];
										Static187.anIntArray435[1] = local828[local934];
										local1052 = 3;
										Static187.anIntArray435[2] = local804[local934];
									}
									local934++;
									for (local1246 = 0; local1246 < local1052; local1246++) {
										local1264 = Static187.anIntArray435[local1246];
										local1251 = local1264 - local97 * 2 & 0x7;
										local1266 = this.anIntArray528[local1264];
										local1325 = this.anIntArray529[local1264];
										@Pc(1869) int local1869;
										if (local97 == 1) {
											local1869 = 512 - local1266;
											local1319 = local1325;
										} else if (local97 == 2) {
											local1869 = 512 - local1325;
											local1319 = 512 - local1266;
										} else if (local97 == 3) {
											local1319 = 512 - local1325;
											local1869 = local1266;
										} else {
											local1319 = local1266;
											local1869 = local1325;
										}
										local950[local936] = local1319;
										local953[local936] = local1869;
										@Pc(1922) int local1922;
										@Pc(1929) int local1929;
										if (local969 != null && Static253.aBooleanArrayArray8[local91][local1264]) {
											local1922 = local1319 + (local31 << 9);
											local1929 = (local47 << 9) + local1869;
											local969[local936] = arg3.method6637(local1922, local1929) - arg5.method6637(local1922, local1929);
										}
										if (local978 != null) {
											if (arg3 != null && !Static253.aBooleanArrayArray8[local91][local1264]) {
												local1922 = (local31 << 9) + local1319;
												local1929 = (local47 << 9) + local1869;
												local978[local936] = arg5.method6637(local1922, local1929) - arg3.method6637(local1922, local1929);
											} else if (arg1 != null && !Static543.aBooleanArrayArray12[local91][local1264]) {
												local1922 = local1319 + (local31 << 9);
												local1929 = local1869 + (local47 << 9);
												local978[local936] = arg1.method6637(local1922, local1929) - arg5.method6637(local1922, local1929);
											}
										}
										if (local1264 < 8 && Static324.anIntArray370[local1251] >= 0) {
											if (local947 != null) {
												local947[local936] = Static176.anIntArray186[local1251];
											}
											local962[local936] = Static176.anIntArray184[local1251];
											local959[local936] = Static213.anIntArray243[local1251];
											local956[local936] = Static52.anIntArray64[local1251];
										} else {
											if (local82 && Static253.aBooleanArrayArray8[local91][local1264]) {
												local959[local936] = local982;
												local962[local936] = local984;
												local956[local936] = local980;
											} else if (local1319 == 0 && local1869 == 0) {
												local956[local936] = arg2[local31][local47];
												local959[local936] = local1565.anInt4605;
												local962[local936] = local1565.anInt4606;
											} else if (local1319 == 0 && local1869 == 512) {
												local956[local936] = arg2[local31][local65];
												local959[local936] = local1573.anInt4605;
												local962[local936] = local1573.anInt4606;
											} else if (local1319 == 512 && local1869 == 512) {
												local956[local936] = arg2[local45][local65];
												local959[local936] = local1581.anInt4605;
												local962[local936] = local1581.anInt4606;
											} else if (local1319 == 512 && local1869 == 0) {
												local956[local936] = arg2[local45][local47];
												local959[local936] = local1589.anInt4605;
												local962[local936] = local1589.anInt4606;
											} else {
												if (local1319 < 256) {
													if (local1869 >= 256) {
														local959[local936] = local1573.anInt4605;
														local962[local936] = local1573.anInt4606;
													} else {
														local959[local936] = local1565.anInt4605;
														local962[local936] = local1565.anInt4606;
													}
												} else if (local1869 < 256) {
													local959[local936] = local1589.anInt4605;
													local962[local936] = local1589.anInt4606;
												} else {
													local959[local936] = local1581.anInt4605;
													local962[local936] = local1581.anInt4606;
												}
												local1922 = Static312.method4783(arg2[local31][local47], local1319 << 7 >> 9, arg2[local45][local47]);
												local1929 = Static312.method4783(arg2[local31][local65], local1319 << 7 >> 9, arg2[local45][local65]);
												local956[local936] = Static312.method4783(local1922, local1869 << 7 >> 9, local1929);
											}
											if (local947 != null) {
												local947[local936] = local956[local936];
											}
										}
										local936++;
									}
								}
								if (local91 != 0 && local177.aBoolean358) {
									local80 = true;
								}
							}
							local1000 = arg5.method6642(local31, local47);
							local1002 = arg5.method6642(local45, local47);
							local1226 = arg5.method6642(local45, local65);
							local1232 = arg5.method6642(local31, local65);
							if (arg0 > 0) {
								@Pc(2351) boolean local2351 = true;
								if (local177 != null && !local177.aBoolean357) {
									local2351 = false;
								} else if (local113 == 0 && local91 != 0) {
									local2351 = false;
								} else if (local105 > 0 && local179 != null && !local179.aBoolean602) {
									local2351 = false;
								}
								if (local2351 && local1002 == local1000 && local1000 == local1226 && local1232 == local1000) {
									this.aByteArrayArrayArray16[arg0][local31][local47] = (byte) (this.aByteArrayArrayArray16[arg0][local31][local47] | 0x4);
								}
							}
							local1241 = 0;
							local1246 = 0;
							local1264 = 0;
							if (this.aBoolean576) {
								local1241 = Static390.method5576(local31, local47);
								local1246 = Static144.method2347(local31, local47);
								local1264 = Static579.method7773(local31, local47);
							}
							arg5.O(local31, local47, local950, local969, local953, local978, local956, local947, local959, local962, local1241, local1246, local1264, local80);
							Static331.method4978(arg0, local31, local47);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(ILclient!io;IIII[Lclient!ev;)V")
	public final void method6681(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub20 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class94[] arg5) {
		@Pc(10) int local10;
		@Pc(22) int local22;
		@Pc(29) int local29;
		@Pc(33) int local33;
		if (!this.aBoolean576) {
			for (local10 = 0; local10 < 4; local10++) {
				@Pc(16) Class94 local16 = arg5[local10];
				for (@Pc(18) int local18 = 0; local18 < 64; local18++) {
					for (local22 = 0; local22 < 64; local22++) {
						local29 = arg3 + local18;
						local33 = local22 + arg2;
						if (local29 >= 0 && local29 < this.anInt8031 && local33 >= 0 && local33 < this.anInt8039) {
							local16.method2221(local33, local29);
						}
					}
				}
			}
		}
		local10 = arg3 + arg4;
		@Pc(85) int local85 = arg2 + arg0;
		for (local22 = 0; local22 < this.anInt8038; local22++) {
			for (local29 = 0; local29 < 64; local29++) {
				for (local33 = 0; local33 < 64; local33++) {
					this.method6679(false, 0, local85 + local33, local10 - -local29, 0, local33 + arg2, local22, arg1, local29 + arg3, 0);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "([[BIIIILclient!r;I[ZLclient!sv;Lclient!je;Z[[BI[[B)V")
	private void method6683(@OriginalArg(0) byte[][] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class12 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean[] arg7, @OriginalArg(8) Class303 arg8, @OriginalArg(9) Class166 arg9, @OriginalArg(11) byte[][] arg10, @OriginalArg(12) int arg11, @OriginalArg(13) byte[][] arg12) {
		@Pc(18) boolean[] local18 = arg8 != null && arg8.aBoolean601 ? Static207.aBooleanArrayArray10[arg11] : Static542.aBooleanArrayArray11[arg11];
		@Pc(37) int local37;
		@Pc(47) Class303 local47;
		@Pc(64) byte local64;
		@Pc(80) int local80;
		@Pc(85) int local85;
		if (arg6 > 0) {
			if (arg3 > 0) {
				local37 = arg12[arg3 - 1][arg6 - 1] & 0xFF;
				if (local37 > 0) {
					local47 = this.aClass206_5.method4718(local37 - 1);
					if (local47.anInt8298 != -1 && local47.aBoolean601) {
						local64 = arg0[arg3 - 1][arg6 - 1];
						local80 = arg10[arg3 - 1][arg6 - 1] * 2 + 4 & 0x7;
						local85 = Static359.method5228(local47, arg5);
						if (Static253.aBooleanArrayArray8[local64][local80]) {
							Static52.anIntArray64[0] = local47.anInt8298;
							Static176.anIntArray186[0] = local85;
							Static213.anIntArray243[0] = local47.anInt8309;
							Static176.anIntArray184[0] = local47.anInt8308;
							Static324.anIntArray370[0] = local47.anInt8313;
							Static250.anIntArray287[0] = 256;
						}
					}
				}
			}
			if (arg3 < arg1 - 1) {
				local37 = arg12[arg3 + 1][arg6 - 1] & 0xFF;
				if (local37 > 0) {
					local47 = this.aClass206_5.method4718(local37 - 1);
					if (local47.anInt8298 != -1 && local47.aBoolean601) {
						local64 = arg0[arg3 + 1][arg6 - 1];
						local80 = arg10[arg3 + 1][arg6 - 1] * 2 + 6 & 0x7;
						local85 = Static359.method5228(local47, arg5);
						if (Static253.aBooleanArrayArray8[local64][local80]) {
							Static52.anIntArray64[2] = local47.anInt8298;
							Static176.anIntArray186[2] = local85;
							Static213.anIntArray243[2] = local47.anInt8309;
							Static176.anIntArray184[2] = local47.anInt8308;
							Static324.anIntArray370[2] = local47.anInt8313;
							Static250.anIntArray287[2] = 512;
						}
					}
				}
			}
		}
		if (arg6 < arg2 - 1) {
			if (arg3 > 0) {
				local37 = arg12[arg3 - 1][arg6 + 1] & 0xFF;
				if (local37 > 0) {
					local47 = this.aClass206_5.method4718(local37 - 1);
					if (local47.anInt8298 != -1 && local47.aBoolean601) {
						local64 = arg0[arg3 - 1][arg6 + 1];
						local80 = arg10[arg3 - 1][arg6 + 1] * 2 + 2 & 0x7;
						local85 = Static359.method5228(local47, arg5);
						if (Static253.aBooleanArrayArray8[local64][local80]) {
							Static52.anIntArray64[6] = local47.anInt8298;
							Static176.anIntArray186[6] = local85;
							Static213.anIntArray243[6] = local47.anInt8309;
							Static176.anIntArray184[6] = local47.anInt8308;
							Static324.anIntArray370[6] = local47.anInt8313;
							Static250.anIntArray287[6] = 64;
						}
					}
				}
			}
			if (arg3 < arg1 - 1) {
				local37 = arg12[arg3 + 1][arg6 + 1] & 0xFF;
				if (local37 > 0) {
					local47 = this.aClass206_5.method4718(local37 - 1);
					if (local47.anInt8298 != -1 && local47.aBoolean601) {
						local64 = arg0[arg3 + 1][arg6 + 1];
						local80 = arg10[arg3 + 1][arg6 + 1] * 2 & 0x7;
						local85 = Static359.method5228(local47, arg5);
						if (Static253.aBooleanArrayArray8[local64][local80]) {
							Static52.anIntArray64[4] = local47.anInt8298;
							Static176.anIntArray186[4] = local85;
							Static213.anIntArray243[4] = local47.anInt8309;
							Static176.anIntArray184[4] = local47.anInt8308;
							Static324.anIntArray370[4] = local47.anInt8313;
							Static250.anIntArray287[4] = 128;
						}
					}
				}
			}
		}
		@Pc(516) int local516;
		@Pc(521) int local521;
		@Pc(523) int local523;
		@Pc(485) byte local485;
		if (arg6 > 0) {
			local37 = arg12[arg3][arg6 - 1] & 0xFF;
			if (local37 > 0) {
				local47 = this.aClass206_5.method4718(local37 - 1);
				if (local47.anInt8298 != -1) {
					local64 = arg0[arg3][arg6 - 1];
					local485 = arg10[arg3][arg6 - 1];
					if (local47.aBoolean601) {
						local85 = 2;
						local516 = local485 * 2 + 4;
						local521 = Static359.method5228(local47, arg5);
						for (local523 = 0; local523 < 3; local523++) {
							local85 &= 0x7;
							local516 &= 0x7;
							if (Static253.aBooleanArrayArray8[local64][local516] && local47.anInt8313 >= Static324.anIntArray370[local85]) {
								Static52.anIntArray64[local85] = local47.anInt8298;
								Static176.anIntArray186[local85] = local521;
								Static213.anIntArray243[local85] = local47.anInt8309;
								Static176.anIntArray184[local85] = local47.anInt8308;
								if (Static324.anIntArray370[local85] == local47.anInt8313) {
									Static250.anIntArray287[local85] |= 0x20;
								} else {
									Static250.anIntArray287[local85] = 32;
								}
								Static324.anIntArray370[local85] = local47.anInt8313;
							}
							local85--;
							local516++;
						}
						if (!local18[arg4 & 0x3]) {
							arg7[0] = Static207.aBooleanArrayArray10[local64][local485 + 2 & 0x3];
						}
					} else if (!local18[arg4 & 0x3]) {
						arg7[0] = Static542.aBooleanArrayArray11[local64][local485 + 2 & 0x3];
					}
				}
			}
		}
		if (arg2 - 1 > arg6) {
			local37 = arg12[arg3][arg6 + 1] & 0xFF;
			if (local37 > 0) {
				local47 = this.aClass206_5.method4718(local37 - 1);
				if (local47.anInt8298 != -1) {
					local64 = arg0[arg3][arg6 + 1];
					local485 = arg10[arg3][arg6 + 1];
					if (local47.aBoolean601) {
						local85 = 4;
						local516 = local485 * 2 + 2;
						local521 = Static359.method5228(local47, arg5);
						for (local523 = 0; local523 < 3; local523++) {
							local516 &= 0x7;
							local85 &= 0x7;
							if (Static253.aBooleanArrayArray8[local64][local516] && local47.anInt8313 >= Static324.anIntArray370[local85]) {
								Static52.anIntArray64[local85] = local47.anInt8298;
								Static176.anIntArray186[local85] = local521;
								Static213.anIntArray243[local85] = local47.anInt8309;
								Static176.anIntArray184[local85] = local47.anInt8308;
								if (Static324.anIntArray370[local85] == local47.anInt8313) {
									Static250.anIntArray287[local85] |= 0x10;
								} else {
									Static250.anIntArray287[local85] = 16;
								}
								Static324.anIntArray370[local85] = local47.anInt8313;
							}
							local516--;
							local85++;
						}
						if (!local18[arg4 + 2 & 0x3]) {
							arg7[2] = Static207.aBooleanArrayArray10[local64][local485 & 0x3];
						}
					} else if (!local18[arg4 + 2 & 0x3]) {
						arg7[2] = Static542.aBooleanArrayArray11[local64][local485 & 0x3];
					}
				}
			}
		}
		if (arg3 > 0) {
			local37 = arg12[arg3 - 1][arg6] & 0xFF;
			if (local37 > 0) {
				local47 = this.aClass206_5.method4718(local37 - 1);
				if (local47.anInt8298 != -1) {
					local64 = arg0[arg3 - 1][arg6];
					local485 = arg10[arg3 - 1][arg6];
					if (local47.aBoolean601) {
						local85 = 6;
						local516 = local485 * 2 + 4;
						local521 = Static359.method5228(local47, arg5);
						for (local523 = 0; local523 < 3; local523++) {
							local516 &= 0x7;
							local85 &= 0x7;
							if (Static253.aBooleanArrayArray8[local64][local516] && Static324.anIntArray370[local85] <= local47.anInt8313) {
								Static52.anIntArray64[local85] = local47.anInt8298;
								Static176.anIntArray186[local85] = local521;
								Static213.anIntArray243[local85] = local47.anInt8309;
								Static176.anIntArray184[local85] = local47.anInt8308;
								if (local47.anInt8313 == Static324.anIntArray370[local85]) {
									Static250.anIntArray287[local85] |= 0x8;
								} else {
									Static250.anIntArray287[local85] = 8;
								}
								Static324.anIntArray370[local85] = local47.anInt8313;
							}
							local516--;
							local85++;
						}
						if (!local18[arg4 + 3 & 0x3]) {
							arg7[3] = Static207.aBooleanArrayArray10[local64][local485 + 1 & 0x3];
						}
					} else if (!local18[arg4 + 3 & 0x3]) {
						arg7[3] = Static542.aBooleanArrayArray11[local64][local485 + 1 & 0x3];
					}
				}
			}
		}
		if (arg3 < arg1 - 1) {
			local37 = arg12[arg3 + 1][arg6] & 0xFF;
			if (local37 > 0) {
				local47 = this.aClass206_5.method4718(local37 - 1);
				if (local47.anInt8298 != -1) {
					local64 = arg0[arg3 + 1][arg6];
					local485 = arg10[arg3 + 1][arg6];
					if (local47.aBoolean601) {
						local85 = 4;
						local516 = local485 * 2 + 6;
						local521 = Static359.method5228(local47, arg5);
						for (local523 = 0; local523 < 3; local523++) {
							local516 &= 0x7;
							local85 &= 0x7;
							if (Static253.aBooleanArrayArray8[local64][local516] && Static324.anIntArray370[local85] <= local47.anInt8313) {
								Static52.anIntArray64[local85] = local47.anInt8298;
								Static176.anIntArray186[local85] = local521;
								Static213.anIntArray243[local85] = local47.anInt8309;
								Static176.anIntArray184[local85] = local47.anInt8308;
								if (local47.anInt8313 == Static324.anIntArray370[local85]) {
									Static250.anIntArray287[local85] |= 0x4;
								} else {
									Static250.anIntArray287[local85] = 4;
								}
								Static324.anIntArray370[local85] = local47.anInt8313;
							}
							local85--;
							local516++;
						}
						if (!local18[arg4 + 1 & 0x3]) {
							arg7[1] = Static207.aBooleanArrayArray10[local64][local485 + 3 & 0x3];
						}
					} else if (!local18[arg4 + 1 & 0x3]) {
						arg7[1] = Static542.aBooleanArrayArray11[local64][local485 + 3 & 0x3];
					}
				}
			}
		}
		if (arg8 == null) {
			return;
		}
		local37 = Static359.method5228(arg8, arg5);
		if (!arg8.aBoolean601) {
			return;
		}
		for (@Pc(1186) int local1186 = 0; local1186 < 8; local1186++) {
			@Pc(1197) int local1197 = local1186 - arg4 * 2 & 0x7;
			if (Static253.aBooleanArrayArray8[arg11][local1186] && arg8.anInt8313 >= Static324.anIntArray370[local1197]) {
				Static52.anIntArray64[local1197] = arg8.anInt8298;
				Static176.anIntArray186[local1197] = local37;
				Static213.anIntArray243[local1197] = arg8.anInt8309;
				Static176.anIntArray184[local1197] = arg8.anInt8308;
				if (arg8.anInt8313 == Static324.anIntArray370[local1197]) {
					Static250.anIntArray287[local1197] |= 0x2;
				} else {
					Static250.anIntArray287[local1197] = 2;
				}
				Static324.anIntArray370[local1197] = arg8.anInt8313;
			}
		}
		return;
	}

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(ILclient!r;Lclient!i;Lclient!i;)V")
	public final void method6684(@OriginalArg(1) Class12 arg0, @OriginalArg(2) Class17 arg1, @OriginalArg(3) Class17 arg2) {
		@Pc(11) int[][] local11 = new int[this.anInt8031][this.anInt8039];
		if (Static214.anIntArray246 == null || Static214.anIntArray246.length != this.anInt8039) {
			Static249.anIntArray286 = new int[this.anInt8039];
			Static70.anIntArray94 = new int[this.anInt8039];
			Static396.anIntArray467 = new int[this.anInt8039];
			Static66.anIntArray84 = new int[this.anInt8039];
			Static214.anIntArray246 = new int[this.anInt8039];
		}
		@Pc(56) int local56;
		for (@Pc(52) int local52 = 0; local52 < this.anInt8038; local52++) {
			for (local56 = 0; local56 < this.anInt8039; local56++) {
				Static214.anIntArray246[local56] = 0;
				Static396.anIntArray467[local56] = 0;
				Static70.anIntArray94[local56] = 0;
				Static249.anIntArray286[local56] = 0;
				Static66.anIntArray84[local56] = 0;
			}
			for (@Pc(85) int local85 = -5; local85 < this.anInt8031; local85++) {
				@Pc(95) int local95;
				@Pc(114) int local114;
				@Pc(180) int local180;
				for (@Pc(89) int local89 = 0; local89 < this.anInt8039; local89++) {
					local95 = local85 + 5;
					@Pc(160) int local160;
					if (local95 < this.anInt8031) {
						local114 = this.aByteArrayArrayArray13[local52][local95][local89] & 0xFF;
						if (local114 > 0) {
							@Pc(124) Class166 local124 = this.aClass56_5.method1618(local114 - 1);
							Static214.anIntArray246[local89] += local124.anInt4602;
							Static396.anIntArray467[local89] += local124.anInt4598;
							Static70.anIntArray94[local89] += local124.anInt4608;
							Static249.anIntArray286[local89] += local124.anInt4600;
							local160 = Static66.anIntArray84[local89]++;
						}
					}
					local114 = local85 - 5;
					if (local114 >= 0) {
						local180 = this.aByteArrayArrayArray13[local52][local114][local89] & 0xFF;
						if (local180 > 0) {
							@Pc(190) Class166 local190 = this.aClass56_5.method1618(local180 - 1);
							Static214.anIntArray246[local89] -= local190.anInt4602;
							Static396.anIntArray467[local89] -= local190.anInt4598;
							Static70.anIntArray94[local89] -= local190.anInt4608;
							Static249.anIntArray286[local89] -= local190.anInt4600;
							local160 = Static66.anIntArray84[local89]--;
						}
					}
				}
				if (local85 >= 0) {
					local95 = 0;
					local114 = 0;
					local180 = 0;
					@Pc(251) int local251 = 0;
					@Pc(253) int local253 = 0;
					for (@Pc(255) int local255 = -5; local255 < this.anInt8039; local255++) {
						@Pc(261) int local261 = local255 + 5;
						if (this.anInt8039 > local261) {
							local180 += Static70.anIntArray94[local261];
							local251 += Static249.anIntArray286[local261];
							local253 += Static66.anIntArray84[local261];
							local95 += Static214.anIntArray246[local261];
							local114 += Static396.anIntArray467[local261];
						}
						@Pc(303) int local303 = local255 - 5;
						if (local303 >= 0) {
							local95 -= Static214.anIntArray246[local303];
							local180 -= Static70.anIntArray94[local303];
							local253 -= Static66.anIntArray84[local303];
							local251 -= Static249.anIntArray286[local303];
							local114 -= Static396.anIntArray467[local303];
						}
						if (local255 >= 0 && local251 > 0 && local253 > 0) {
							local11[local85][local255] = Static204.method3498(local180 / local253, local114 / local253, local95 * 256 / local251);
						}
					}
				}
			}
			if (Static288.aBoolean403) {
				this.method6680(local52, local52 == 0 ? arg1 : null, local11, local52 == 0 ? arg2 : null, arg0, Static20.aClass17Array1[local52]);
			} else {
				this.method6690(local11, local52 == 0 ? arg1 : null, Static20.aClass17Array1[local52], local52, arg0, local52 == 0 ? arg2 : null);
			}
			this.aByteArrayArrayArray13[local52] = null;
			this.aByteArrayArrayArray15[local52] = null;
			this.aByteArrayArrayArray17[local52] = null;
			this.aByteArrayArrayArray14[local52] = null;
		}
		if (!this.aBoolean576) {
			if (Static208.anInt8804 != 0) {
				Static185.method3241();
			}
			if (Static452.aBoolean562) {
				Static283.method4364();
			}
		}
		for (local56 = 0; local56 < this.anInt8038; local56++) {
			Static20.aClass17Array1[local56].BA();
		}
	}

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(Lclient!io;I[Lclient!ev;IIIIIBI)V")
	public final void method6686(@OriginalArg(0) Class1_Sub20 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class94[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(9) int arg8) {
		@Pc(30) int local30 = (arg4 & 0x7) * 8;
		@Pc(39) int local39;
		@Pc(69) int local69;
		if (!this.aBoolean576) {
			@Pc(37) Class94 local37 = arg2[arg7];
			for (local39 = 0; local39 < 8; local39++) {
				for (@Pc(43) int local43 = 0; local43 < 8; local43++) {
					@Pc(57) int local57 = Static254.method4031(local39 & 0x7, arg8, local43 & 0x7) + arg1;
					local69 = arg5 + Static117.method2021(local43 & 0x7, local39 & 0x7, arg8);
					if (local57 > 0 && local57 < this.anInt8031 - 1 && local69 > 0 && local69 < this.anInt8039 - 1) {
						local37.method2221(local69, local57);
					}
				}
			}
		}
		@Pc(119) int local119 = (arg6 & 0x7) * 8;
		@Pc(125) int local125 = (arg4 & 0xFFFFFFF8) << 3;
		local39 = (arg6 & 0x1FFFFFF8) << 3;
		@Pc(133) byte local133 = 0;
		@Pc(135) byte local135 = 0;
		if (arg8 == 1) {
			local135 = 1;
		} else if (arg8 == 2) {
			local135 = 1;
			local133 = 1;
		} else if (arg8 == 3) {
			local133 = 1;
		}
		for (local69 = 0; local69 < this.anInt8038; local69++) {
			for (@Pc(166) int local166 = 0; local166 < 64; local166++) {
				for (@Pc(170) int local170 = 0; local170 < 64; local170++) {
					if (local69 == arg3 && local166 >= local30 && local30 + 8 >= local166 && local119 <= local170 && local119 + 8 >= local170) {
						@Pc(253) int local253;
						@Pc(245) int local245;
						if (local166 == local30 + 8 || local119 + 8 == local170) {
							if (arg8 == 0) {
								local245 = arg5 + local170 - local119;
								local253 = local166 + arg1 - local30;
							} else if (arg8 == 1) {
								local253 = local170 + arg1 - local119;
								local245 = local30 + arg5 + 8 - local166;
							} else if (arg8 == 2) {
								local253 = arg1 + local30 + 8 - local166;
								local245 = arg5 + local119 + 8 - local170;
							} else {
								local245 = arg5 + local166 - local30;
								local253 = local119 + arg1 + 8 - local170;
							}
							this.method6679(true, 0, local39 + local170, local125 + local166, 0, local245, arg7, arg0, local253, 0);
						} else {
							local253 = Static254.method4031(local166 & 0x7, arg8, local170 & 0x7) + arg1;
							local245 = arg5 + Static117.method2021(local170 & 0x7, local166 & 0x7, arg8);
							this.method6679(false, arg8, local170 + local39, local125 - -local166, local133, local245, arg7, arg0, local253, local135);
						}
						if (local166 == 63 || local170 == 63) {
							@Pc(386) byte local386 = 1;
							if (local166 == 63 && local170 == 63) {
								local386 = 3;
							}
							for (@Pc(398) int local398 = 0; local398 < local386; local398++) {
								@Pc(402) int local402 = local166;
								@Pc(404) int local404 = local170;
								if (local398 == 0) {
									local402 = local166 == 63 ? 64 : local166;
									local404 = local170 == 63 ? 64 : local170;
								} else if (local398 == 1) {
									local402 = 64;
								} else if (local398 == 2) {
									local404 = 64;
								}
								@Pc(454) int local454;
								@Pc(448) int local448;
								if (arg8 == 0) {
									local448 = local404 + arg5 - local119;
									local454 = local402 + arg1 - local30;
								} else if (arg8 == 1) {
									local454 = local404 + arg1 - local119;
									local448 = local30 + arg5 + 8 - local402;
								} else if (arg8 == 2) {
									local448 = local119 + arg5 + 8 - local404;
									local454 = local30 + arg1 + 8 - local402;
								} else {
									local448 = arg5 + local402 - local30;
									local454 = arg1 + local119 + 8 - local404;
								}
								if (local454 >= 0 && local454 < this.anInt8031 && local448 >= 0 && local448 < this.anInt8039) {
									this.anIntArrayArrayArray17[arg7][local454][local448] = this.anIntArrayArrayArray17[arg7][local133 + local253][local135 + local245];
								}
							}
						}
					} else {
						this.method6679(false, 0, 0, 0, 0, -1, 0, arg0, -1, 0);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "([[[ILclient!r;[Lclient!ev;B)V")
	public final void method6687(@OriginalArg(0) int[][][] arg0, @OriginalArg(1) Class12 arg1, @OriginalArg(2) Class94[] arg2) {
		@Pc(6) int local6;
		@Pc(10) int local10;
		@Pc(14) int local14;
		if (!this.aBoolean576) {
			for (local6 = 0; local6 < 4; local6++) {
				for (local10 = 0; local10 < this.anInt8031; local10++) {
					for (local14 = 0; local14 < this.anInt8039; local14++) {
						if ((Static511.aByteArrayArrayArray19[local6][local10][local14] & 0x1) != 0) {
							@Pc(31) int local31 = local6;
							if ((Static511.aByteArrayArrayArray19[1][local10][local14] & 0x2) != 0) {
								local31 = local6 - 1;
							}
							if (local31 >= 0) {
								arg2[local31].method2220(local14, local10);
							}
						}
					}
				}
			}
		}
		for (local6 = 0; local6 < this.anInt8038; local6++) {
			local10 = 0;
			local14 = 0;
			if (!this.aBoolean576) {
				if (Static452.aBoolean562) {
					local10 = 2;
				}
				if (Static346.aBoolean439) {
					local14 = 8;
				}
				if (Static208.anInt8804 != 0) {
					if (Static229.aBoolean645 | local6 == 0) {
						local14 |= 0x10;
					}
					local10 |= 0x1;
				}
			}
			if (Static452.aBoolean562) {
				local14 |= 0x7;
			}
			if (!Static392.aBoolean492) {
				local14 |= 0x20;
			}
			@Pc(158) int[][] local158 = arg0 == null || arg0.length <= local6 ? this.anIntArrayArrayArray17[local6] : arg0[local6];
			Static141.method2306(local6, arg1.method6452(this.anInt8031, this.anInt8039, this.anIntArrayArrayArray17[local6], local158, local10, local14));
		}
	}

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(IIIIIB)V")
	private void method6688(@OriginalArg(0) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2) {
		@Pc(7) int local7;
		for (@Pc(3) int local3 = arg0; local3 < arg0 + 64; local3++) {
			for (local7 = arg2; local7 < arg2 + 64; local7++) {
				if (local7 >= 0 && local7 < this.anInt8031 && local3 >= 0 && local3 < this.anInt8039) {
					this.anIntArrayArrayArray17[arg1][local7][local3] = arg1 <= 0 ? 0 : this.anIntArrayArrayArray17[arg1 - 1][local7][local3] - 960;
				}
			}
		}
		if (arg2 > 0 && arg2 < this.anInt8031) {
			for (local7 = arg0 + 1; local7 < arg0 + 64; local7++) {
				if (local7 >= 0 && this.anInt8039 > local7) {
					this.anIntArrayArrayArray17[arg1][arg2][local7] = this.anIntArrayArrayArray17[arg1][arg2 - 1][local7];
				}
			}
		}
		if (arg0 > 0 && this.anInt8039 > arg0) {
			for (local7 = arg2 + 1; local7 < arg2 + 64; local7++) {
				if (local7 >= 0 && this.anInt8031 > local7) {
					this.anIntArrayArrayArray17[arg1][local7][arg0] = this.anIntArrayArrayArray17[arg1][local7][arg0 - 1];
				}
			}
		}
		if (arg2 < 0 || arg0 < 0 || arg2 >= this.anInt8031 || arg0 >= this.anInt8039) {
			return;
		}
		if (arg1 != 0) {
			if (arg2 > 0 && this.anIntArrayArrayArray17[arg1 - 1][arg2 - 1][arg0] != this.anIntArrayArrayArray17[arg1][arg2 - 1][arg0]) {
				this.anIntArrayArrayArray17[arg1][arg2][arg0] = this.anIntArrayArrayArray17[arg1][arg2 - 1][arg0];
				return;
			}
			if (arg0 > 0 && this.anIntArrayArrayArray17[arg1 - 1][arg2][arg0 - 1] != this.anIntArrayArrayArray17[arg1][arg2][arg0 - 1]) {
				this.anIntArrayArrayArray17[arg1][arg2][arg0] = this.anIntArrayArrayArray17[arg1][arg2][arg0 - 1];
				return;
			}
			if (arg2 > 0 && arg0 > 0 && this.anIntArrayArrayArray17[arg1 - 1][arg2 - 1][arg0 - 1] != this.anIntArrayArrayArray17[arg1][arg2 - 1][arg0 - 1]) {
				this.anIntArrayArrayArray17[arg1][arg2][arg0] = this.anIntArrayArrayArray17[arg1][arg2 - 1][arg0 - 1];
				return;
			}
			return;
		}
		if (arg2 > 0 && this.anIntArrayArrayArray17[arg1][arg2 - 1][arg0] != 0) {
			this.anIntArrayArrayArray17[arg1][arg2][arg0] = this.anIntArrayArrayArray17[arg1][arg2 - 1][arg0];
			return;
		}
		if (arg0 > 0 && this.anIntArrayArrayArray17[arg1][arg2][arg0 - 1] != 0) {
			this.anIntArrayArrayArray17[arg1][arg2][arg0] = this.anIntArrayArrayArray17[arg1][arg2][arg0 - 1];
			return;
		}
		if (arg2 > 0 && arg0 > 0 && this.anIntArrayArrayArray17[arg1][arg2 - 1][arg0 - 1] != 0) {
			this.anIntArrayArrayArray17[arg1][arg2][arg0] = this.anIntArrayArrayArray17[arg1][arg2 - 1][arg0 - 1];
			return;
		}
	}

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "([[ILclient!i;ILclient!i;ILclient!r;Lclient!i;)V")
	private void method6690(@OriginalArg(0) int[][] arg0, @OriginalArg(1) Class17 arg1, @OriginalArg(3) Class17 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class12 arg4, @OriginalArg(6) Class17 arg5) {
		for (@Pc(3) int local3 = 0; local3 < this.anInt8031; local3++) {
			for (@Pc(7) int local7 = 0; local7 < this.anInt8039; local7++) {
				if (Static595.anInt9666 == -1 || Static484.method6767(Static595.anInt9666, local7, arg3, local3)) {
					@Pc(31) byte local31 = this.aByteArrayArrayArray17[arg3][local3][local7];
					@Pc(40) byte local40 = this.aByteArrayArrayArray14[arg3][local3][local7];
					@Pc(51) int local51 = this.aByteArrayArrayArray15[arg3][local3][local7] & 0xFF;
					@Pc(62) int local62 = this.aByteArrayArrayArray13[arg3][local3][local7] & 0xFF;
					@Pc(74) Class303 local74 = local51 == 0 ? null : this.aClass206_5.method4718(local51 - 1);
					@Pc(91) Class166 local91 = local62 == 0 ? null : this.aClass56_5.method1618(local62 - 1);
					@Pc(93) int local93 = 0;
					@Pc(95) int local95 = 0;
					if (local31 != 0) {
						local95 = local74 == null ? 0 : Static283.anIntArray315[local31];
						local93 = local91 == null ? 0 : Static122.anIntArray149[local31];
					} else if (local74 != null) {
						local95 = Static283.anIntArray315[local31];
					} else if (local91 != null) {
						local93 = Static283.anIntArray315[local31];
					}
					@Pc(134) int local134 = local95 + local93;
					@Pc(136) int local136 = 0;
					if (local134 != 0) {
						@Pc(147) int local147;
						if (Static265.aBoolean380) {
							local147 = local74 == null ? -1 : local74.anInt8309;
						} else {
							local147 = -1;
						}
						@Pc(154) int[] local154 = new int[local134];
						@Pc(157) int[] local157 = new int[local134];
						@Pc(160) int[] local160 = new int[local134];
						@Pc(163) int[] local163 = new int[local134];
						@Pc(165) boolean local165 = false;
						@Pc(181) int local181;
						if (local74 == null || local74.anInt8298 == -1 && local74.anInt8303 == -1 && local147 == -1) {
							for (local181 = 0; local181 < local95; local181++) {
								local154[local136] = -1;
								local136++;
							}
						} else {
							for (local181 = 0; local181 < local95; local181++) {
								local160[local136] = local147;
								local163[local136] = local74.anInt8308;
								if (local74.anInt8298 == -1) {
									local154[local136] = -1;
								} else {
									local154[local136] = local74.anInt8298;
								}
								if (local74.anInt8303 == -1) {
									local157[local136] = -1;
								} else {
									local157[local136] = local74.anInt8303;
									local165 = true;
								}
								local136++;
							}
							if (!this.aBoolean576 && arg3 == 0) {
								Static382.method5523(local3, local7, local74.anInt8311, local74.anInt8305 * 8, local74.anInt8302);
							}
						}
						if (!local165) {
							local157 = null;
						}
						if (local91 == null) {
							for (local181 = 0; local181 < local93; local181++) {
								local154[local136] = -1;
								local136++;
							}
						} else {
							local181 = local91.anInt4605;
							if (Static265.aBoolean380) {
								local181 = -1;
							}
							for (@Pc(298) int local298 = 0; local298 < local93; local298++) {
								local160[local136] = local181;
								local163[local136] = local91.anInt4606;
								local154[local136] = arg0[local3][local7];
								if (local157 != null) {
									local157[local136] = -1;
								}
								local136++;
							}
						}
						local181 = this.anIntArray528.length;
						@Pc(335) int[] local335 = new int[local181];
						@Pc(338) int[] local338 = new int[local181];
						@Pc(345) int[] local345 = arg5 == null ? null : new int[local181];
						@Pc(354) int[] local354 = arg5 == null && arg1 == null ? null : new int[local181];
						@Pc(363) int local363;
						@Pc(368) int local368;
						@Pc(450) int local450;
						@Pc(456) int local456;
						for (@Pc(356) int local356 = 0; local356 < local181; local356++) {
							local363 = this.anIntArray528[local356];
							local368 = this.anIntArray529[local356];
							if (local40 == 0) {
								local335[local356] = local363;
								local338[local356] = local368;
							} else if (local40 == 1) {
								local335[local356] = local368;
								local338[local356] = 512 - local363;
							} else if (local40 == 2) {
								local335[local356] = 512 - local363;
								local338[local356] = 512 - local368;
							} else if (local40 == 3) {
								local335[local356] = 512 - local368;
								local338[local356] = local363;
							}
							if (local345 != null && Static253.aBooleanArrayArray8[local31][local356]) {
								local450 = local363 + (local3 << 9);
								local456 = local363 + (local7 << 9);
								local345[local356] = arg5.method6637(local450, local456) - arg2.method6637(local450, local456);
							}
							if (local354 != null) {
								if (arg5 != null && !Static253.aBooleanArrayArray8[local31][local356]) {
									local450 = local363 + (local3 << 9);
									local456 = local363 + (local7 << 9);
									local354[local356] = arg2.method6637(local450, local456) - arg5.method6637(local450, local456);
								} else if (arg1 != null && !Static543.aBooleanArrayArray12[local31][local356]) {
									local450 = (local3 << 9) + local363;
									local456 = (local7 << 9) + local363;
									local354[local356] = arg1.method6637(local450, local456) - arg2.method6637(local450, local456);
								}
							}
						}
						local363 = arg2.method6642(local3, local7);
						local368 = arg2.method6642(local3 + 1, local7);
						local450 = arg2.method6642(local3 + 1, local7 + 1);
						local456 = arg2.method6642(local3, local7 + 1);
						if (arg3 > 0) {
							@Pc(592) boolean local592 = true;
							if (local91 != null && !local91.aBoolean357) {
								local592 = false;
							} else if (local62 == 0 && local31 != 0) {
								local592 = false;
							} else if (local51 > 0 && local74 != null && !local74.aBoolean602) {
								local592 = false;
							}
							if (local592 && local363 == local368 && local450 == local363 && local363 == local456) {
								this.aByteArrayArrayArray16[arg3][local3][local7] = (byte) (this.aByteArrayArrayArray16[arg3][local3][local7] | 0x4);
							}
						}
						@Pc(661) int local661 = 0;
						@Pc(663) int local663 = 0;
						@Pc(665) int local665 = 0;
						if (this.aBoolean576) {
							local661 = Static390.method5576(local3, local7);
							local663 = Static144.method2347(local3, local7);
							local665 = Static579.method7773(local3, local7);
						}
						arg2.method6639(local3, local7, local335, local345, local338, local354, Static105.anIntArrayArray13[local31], Static101.anIntArrayArray11[local31], Static341.anIntArrayArray41[local31], local154, local157, local160, local163, local661, local663, local665);
						Static331.method4978(arg3, local3, local7);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(II[[I)V")
	public final void method6691(@OriginalArg(2) int[][] arg0) {
		@Pc(10) int[][] local10 = this.anIntArrayArrayArray17[0];
		for (@Pc(12) int local12 = 0; local12 < this.anInt8031 + 1; local12++) {
			for (@Pc(16) int local16 = 0; local16 < this.anInt8039 + 1; local16++) {
				local10[local12][local16] += arg0[local12][local16];
			}
		}
	}

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(IBIII)V")
	public final void method6692(@OriginalArg(0) int arg0, @OriginalArg(4) int arg1) {
		for (@Pc(7) int local7 = 0; local7 < this.anInt8038; local7++) {
			this.method6688(arg1, local7, arg0);
		}
	}
}
