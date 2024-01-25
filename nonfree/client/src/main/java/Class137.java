import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gn")
public class Class137 {

	@OriginalMember(owner = "client!gn", name = "E", descriptor = "[[[B")
	public byte[][][] aByteArrayArrayArray18;

	@OriginalMember(owner = "client!gn", name = "o", descriptor = "[I")
	private final int[] anIntArray442 = new int[] { 0, 0, 0, 256, 512, 512, 512, 256, 256, 384, 128, 128, 256 };

	@OriginalMember(owner = "client!gn", name = "C", descriptor = "[I")
	private final int[] anIntArray439 = new int[] { 0, 256, 512, 512, 512, 256, 0, 0, 128, 256, 128, 384, 256 };

	@OriginalMember(owner = "client!gn", name = "u", descriptor = "Lclient!hg;")
	private final Class152 aClass152_5;

	@OriginalMember(owner = "client!gn", name = "q", descriptor = "I")
	public final int anInt7399;

	@OriginalMember(owner = "client!gn", name = "m", descriptor = "Z")
	public final boolean aBoolean505;

	@OriginalMember(owner = "client!gn", name = "g", descriptor = "I")
	protected final int anInt7403;

	@OriginalMember(owner = "client!gn", name = "s", descriptor = "Lclient!gv;")
	private final Class141 aClass141_6;

	@OriginalMember(owner = "client!gn", name = "d", descriptor = "I")
	protected final int anInt7404;

	@OriginalMember(owner = "client!gn", name = "p", descriptor = "[[[B")
	protected byte[][][] aByteArrayArrayArray20;

	@OriginalMember(owner = "client!gn", name = "v", descriptor = "[[[I")
	public final int[][][] anIntArrayArrayArray16;

	@OriginalMember(owner = "client!gn", name = "i", descriptor = "[[[B")
	private final byte[][][] aByteArrayArrayArray16;

	@OriginalMember(owner = "client!gn", name = "j", descriptor = "[[[B")
	private final byte[][][] aByteArrayArrayArray17;

	@OriginalMember(owner = "client!gn", name = "A", descriptor = "[[[B")
	private final byte[][][] aByteArrayArrayArray19;

	@OriginalMember(owner = "client!gn", name = "b", descriptor = "[[[B")
	private final byte[][][] aByteArrayArrayArray15;

	@OriginalMember(owner = "client!gn", name = "<init>", descriptor = "(IIIZLclient!gv;Lclient!hg;)V")
	protected Class137(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) Class141 arg4, @OriginalArg(5) Class152 arg5) {
		this.aClass152_5 = arg5;
		this.anInt7399 = arg0;
		this.aBoolean505 = arg3;
		this.anInt7403 = arg1;
		this.aClass141_6 = arg4;
		this.anInt7404 = arg2;
		this.aByteArrayArrayArray20 = new byte[this.anInt7399][this.anInt7403 + 1][this.anInt7404 + 1];
		this.anIntArrayArrayArray16 = new int[this.anInt7399][this.anInt7403 + 1][this.anInt7404 + 1];
		this.aByteArrayArrayArray16 = new byte[this.anInt7399][this.anInt7403][this.anInt7404];
		this.aByteArrayArrayArray17 = new byte[this.anInt7399][this.anInt7403][this.anInt7404];
		this.aByteArrayArrayArray19 = new byte[this.anInt7399][this.anInt7403][this.anInt7404];
		this.aByteArrayArrayArray15 = new byte[this.anInt7399][this.anInt7403][this.anInt7404];
	}

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(IIIIIILclient!wq;IIZI)V")
	private void method6448(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class5_Sub36 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) boolean arg8, @OriginalArg(10) int arg9) {
		if (arg3 == 1) {
			arg7 = 1;
		} else if (arg3 == 2) {
			arg2 = 1;
			arg7 = 1;
		} else if (arg3 == 3) {
			arg2 = 1;
		}
		@Pc(57) int local57;
		if (arg0 < 0 || arg0 >= this.anInt7403 || arg6 < 0 || this.anInt7404 <= arg6) {
			while (true) {
				local57 = arg5.method7291();
				if (local57 == 0) {
					break;
				}
				if (local57 == 1) {
					arg5.method7291();
					break;
				}
				if (local57 <= 49) {
					arg5.method7291();
				}
			}
			return;
		}
		if (!this.aBoolean505 && !arg8) {
			Static172.aByteArrayArrayArray23[arg4][arg0][arg6] = 0;
		}
		while (true) {
			local57 = arg5.method7291();
			if (local57 == 0) {
				if (this.aBoolean505) {
					this.anIntArrayArrayArray16[0][arg0 + arg2][arg7 + arg6] = 0;
				} else if (arg4 == 0) {
					this.anIntArrayArrayArray16[0][arg0 + arg2][arg6 + arg7] = -Static124.method1850(arg1 + 932731, arg9 + 556238) * 8 << 2;
				} else {
					this.anIntArrayArrayArray16[arg4][arg2 + arg0][arg6 + arg7] = this.anIntArrayArrayArray16[arg4 - 1][arg2 + arg0][arg7 + arg6] - 960;
				}
				break;
			}
			if (local57 == 1) {
				@Pc(221) int local221 = arg5.method7291();
				if (this.aBoolean505) {
					this.anIntArrayArrayArray16[0][arg2 + arg0][arg7 + arg6] = local221 * 8 << 2;
				} else {
					if (local221 == 1) {
						local221 = 0;
					}
					if (arg4 == 0) {
						this.anIntArrayArrayArray16[0][arg2 + arg0][arg7 + arg6] = -local221 * 8 << 2;
					} else {
						this.anIntArrayArrayArray16[arg4][arg2 + arg0][arg7 + arg6] = this.anIntArrayArrayArray16[arg4 - 1][arg2 + arg0][arg7 + arg6] - (local221 * 8 << 2);
					}
				}
				break;
			}
			if (local57 <= 49) {
				if (arg8) {
					arg5.method7291();
				} else {
					this.aByteArrayArrayArray15[arg4][arg0][arg6] = arg5.method7318();
					this.aByteArrayArrayArray16[arg4][arg0][arg6] = (byte) ((local57 - 2) / 4);
					this.aByteArrayArrayArray17[arg4][arg0][arg6] = (byte) (arg3 + local57 - 2 & 0x3);
				}
			} else if (local57 <= 81) {
				if (!this.aBoolean505 && !arg8) {
					Static172.aByteArrayArrayArray23[arg4][arg0][arg6] = (byte) (local57 - 49);
				}
			} else if (!arg8) {
				this.aByteArrayArrayArray19[arg4][arg0][arg6] = (byte) (local57 - 81);
			}
		}
	}

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "([Lclient!ii;ILclient!wq;BIII)V")
	public final void method6450(@OriginalArg(0) Class169[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class5_Sub36 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(10) int local10;
		@Pc(18) int local18;
		@Pc(22) int local22;
		@Pc(28) int local28;
		if (!this.aBoolean505) {
			for (local10 = 0; local10 < 4; local10++) {
				@Pc(16) Class169 local16 = arg0[local10];
				for (local18 = 0; local18 < 64; local18++) {
					for (local22 = 0; local22 < 64; local22++) {
						local28 = local18 + arg5;
						@Pc(32) int local32 = arg1 + local22;
						if (local28 >= 0 && this.anInt7403 > local28 && local32 >= 0 && local32 < this.anInt7404) {
							local16.method3879(local32, local28);
						}
					}
				}
			}
		}
		local10 = arg5 + arg4;
		@Pc(92) int local92 = arg1 + arg3;
		for (local18 = 0; local18 < this.anInt7399; local18++) {
			for (local22 = 0; local22 < 64; local22++) {
				for (local28 = 0; local28 < 64; local28++) {
					this.method6448(arg5 + local22, local22 + local10, 0, 0, local18, arg2, arg1 + local28, 0, false, local28 + local92);
				}
			}
		}
	}

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "([Lclient!ii;Lclient!ha;Z[[[I)V")
	public final void method6452(@OriginalArg(0) Class169[] arg0, @OriginalArg(1) Class100 arg1, @OriginalArg(3) int[][][] arg2) {
		@Pc(6) int local6;
		@Pc(10) int local10;
		@Pc(14) int local14;
		if (!this.aBoolean505) {
			for (local6 = 0; local6 < 4; local6++) {
				for (local10 = 0; local10 < this.anInt7403; local10++) {
					for (local14 = 0; local14 < this.anInt7404; local14++) {
						if ((Static172.aByteArrayArrayArray23[local6][local10][local14] & 0x1) != 0) {
							@Pc(30) int local30 = local6;
							if ((Static172.aByteArrayArrayArray23[1][local10][local14] & 0x2) != 0) {
								local30 = local6 - 1;
							}
							if (local30 >= 0) {
								arg0[local30].method3874(local14, local10);
							}
						}
					}
				}
			}
		}
		for (local6 = 0; local6 < this.anInt7399; local6++) {
			local10 = 0;
			local14 = 0;
			if (!this.aBoolean505) {
				if (Static3.aBoolean1) {
					local10 = 2;
				}
				if (Static130.aBoolean147) {
					local14 = 8;
				}
				if (Static560.anInt8808 != 0) {
					if (local6 == 0 | Static450.aBoolean498) {
						local14 |= 0x10;
					}
					local10 |= 0x1;
				}
			}
			if (Static3.aBoolean1) {
				local14 |= 0x7;
			}
			if (!Static399.aBoolean444) {
				local14 |= 0x20;
			}
			@Pc(181) int[][] local181 = arg2 == null || local6 >= arg2.length ? this.anIntArrayArrayArray16[local6] : arg2[local6];
			Static334.method8476(local6, arg1.method8587(this.anInt7403, this.anInt7404, this.anIntArrayArrayArray16[local6], local181, local10, local14));
		}
	}

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(IIIIBI)V")
	public final void method6453(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		@Pc(17) int local17;
		for (@Pc(3) int local3 = arg1; local3 < arg1 + arg4; local3++) {
			for (local17 = arg0; local17 < arg3 + arg0; local17++) {
				if (local17 >= 0 && local17 < this.anInt7403 && local3 >= 0 && local3 < this.anInt7404) {
					this.anIntArrayArrayArray16[arg2][local17][local3] = arg2 <= 0 ? 0 : this.anIntArrayArrayArray16[arg2 - 1][local17][local3] - 960;
				}
			}
		}
		if (arg0 > 0 && arg0 < this.anInt7403) {
			for (local17 = arg1 + 1; local17 < arg4 + arg1; local17++) {
				if (local17 >= 0 && local17 < this.anInt7404) {
					this.anIntArrayArrayArray16[arg2][arg0][local17] = this.anIntArrayArrayArray16[arg2][arg0 - 1][local17];
				}
			}
		}
		if (arg1 > 0 && arg1 < this.anInt7404) {
			for (local17 = arg0 + 1; local17 < arg0 + arg3; local17++) {
				if (local17 >= 0 && this.anInt7403 > local17) {
					this.anIntArrayArrayArray16[arg2][local17][arg1] = this.anIntArrayArrayArray16[arg2][local17][arg1 - 1];
				}
			}
		}
		if (arg0 < 0 || arg1 < 0 || arg0 >= this.anInt7403 || this.anInt7404 <= arg1) {
			return;
		}
		if (arg2 != 0) {
			if (arg0 > 0 && this.anIntArrayArrayArray16[arg2 - 1][arg0 - 1][arg1] != this.anIntArrayArrayArray16[arg2][arg0 - 1][arg1]) {
				this.anIntArrayArrayArray16[arg2][arg0][arg1] = this.anIntArrayArrayArray16[arg2][arg0 - 1][arg1];
				return;
			}
			if (arg1 > 0 && this.anIntArrayArrayArray16[arg2][arg0][arg1 - 1] != this.anIntArrayArrayArray16[arg2 - 1][arg0][arg1 - 1]) {
				this.anIntArrayArrayArray16[arg2][arg0][arg1] = this.anIntArrayArrayArray16[arg2][arg0][arg1 - 1];
				return;
			}
			if (arg0 > 0 && arg1 > 0 && this.anIntArrayArrayArray16[arg2][arg0 - 1][arg1 - 1] != this.anIntArrayArrayArray16[arg2 - 1][arg0 - 1][arg1 - 1]) {
				this.anIntArrayArrayArray16[arg2][arg0][arg1] = this.anIntArrayArrayArray16[arg2][arg0 - 1][arg1 - 1];
				return;
			}
			return;
		}
		if (arg0 > 0 && this.anIntArrayArrayArray16[arg2][arg0 - 1][arg1] != 0) {
			this.anIntArrayArrayArray16[arg2][arg0][arg1] = this.anIntArrayArrayArray16[arg2][arg0 - 1][arg1];
			return;
		}
		if (arg1 > 0 && this.anIntArrayArrayArray16[arg2][arg0][arg1 - 1] != 0) {
			this.anIntArrayArrayArray16[arg2][arg0][arg1] = this.anIntArrayArrayArray16[arg2][arg0][arg1 - 1];
			return;
		}
		if (arg0 > 0 && arg1 > 0 && this.anIntArrayArrayArray16[arg2][arg0 - 1][arg1 - 1] != 0) {
			this.anIntArrayArrayArray16[arg2][arg0][arg1] = this.anIntArrayArrayArray16[arg2][arg0 - 1][arg1 - 1];
			return;
		}
	}

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(Lclient!s;Lclient!s;Lclient!s;Lclient!ha;I[[IB)V")
	private void method6454(@OriginalArg(0) Class84 arg0, @OriginalArg(1) Class84 arg1, @OriginalArg(2) Class84 arg2, @OriginalArg(3) Class100 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[][] arg5) {
		@Pc(10) byte[][] local10 = this.aByteArrayArrayArray16[arg4];
		@Pc(15) byte[][] local15 = this.aByteArrayArrayArray17[arg4];
		@Pc(20) byte[][] local20 = this.aByteArrayArrayArray19[arg4];
		@Pc(25) byte[][] local25 = this.aByteArrayArrayArray15[arg4];
		for (@Pc(32) int local32 = 0; local32 < this.anInt7403; local32++) {
			@Pc(49) int local49 = this.anInt7403 - 1 <= local32 ? local32 : local32 + 1;
			for (@Pc(51) int local51 = 0; local51 < this.anInt7404; local51++) {
				@Pc(72) int local72 = local51 < this.anInt7404 - 1 ? local51 + 1 : local51;
				if (Static460.anInt7446 == -1 || Static62.method1063(arg4, Static460.anInt7446, local51, local32)) {
					@Pc(90) boolean local90 = false;
					@Pc(92) boolean local92 = false;
					@Pc(95) boolean[] local95 = new boolean[4];
					@Pc(101) int local101 = local10[local32][local51];
					@Pc(107) int local107 = local15[local32][local51];
					@Pc(115) int local115 = local25[local32][local51] & 0xFF;
					@Pc(123) int local123 = local20[local32][local51] & 0xFF;
					@Pc(131) int local131 = local20[local32][local72] & 0xFF;
					@Pc(139) int local139 = local20[local49][local72] & 0xFF;
					@Pc(147) int local147 = local20[local49][local51] & 0xFF;
					if (local115 != 0 || local123 != 0) {
						@Pc(174) Class181 local174 = local115 == 0 ? null : this.aClass141_6.method3314(local115 - 1);
						if (local101 == 0 && local174 == null) {
							local101 = 12;
						}
						@Pc(195) Class367 local195 = local123 == 0 ? null : this.aClass152_5.method3422(local123 - 1);
						@Pc(197) Class181 local197 = local174;
						if (local174 != null) {
							if (local174.anInt4663 == -1 && local174.anInt4677 == -1) {
								local197 = local174;
								local174 = null;
							} else if (local195 != null && local101 != 0) {
								local92 = local174.aBoolean310;
							}
						}
						@Pc(301) int local301;
						@Pc(357) int local357;
						@Pc(442) int local442;
						@Pc(452) int local452;
						if ((local101 == 0 || local101 == 12) && local32 > 0 && local51 > 0 && this.anInt7403 > local32 && local51 < this.anInt7404) {
							local301 = local20[local32 - 1][local51 - 1] == local123 ? 1 : -1;
							@Pc(315) int local315 = local123 == local20[local49][local72] ? 1 : -1;
							@Pc(337) int local337 = local123 == local20[local49][local51 - 1] ? 1 : -1;
							local357 = local123 == local20[local32 - 1][local72] ? 1 : -1;
							if (local20[local32][local51 - 1] == local123) {
								local337++;
								local301++;
							} else {
								local301--;
								local337--;
							}
							if (local123 == local20[local49][local51]) {
								local337++;
								local315++;
							} else {
								local337--;
								local315--;
							}
							if (local123 == local20[local32][local72]) {
								local315++;
								local357++;
							} else {
								local357--;
								local315--;
							}
							if (local20[local32 - 1][local51] == local123) {
								local357++;
								local301++;
							} else {
								local301--;
								local357--;
							}
							local442 = local301 - local315;
							if (local442 < 0) {
								local442 = -local442;
							}
							local452 = local337 - local357;
							if (local452 < 0) {
								local452 = -local452;
							}
							if (local452 == local442) {
								local442 = arg0.method7620(local51, local32) - arg0.method7620(local72, local49);
								if (local442 < 0) {
									local442 = -local442;
								}
								local452 = arg0.method7620(local51, local49) - arg0.method7620(local72, local32);
								if (local452 < 0) {
									local452 = -local452;
								}
							}
							local107 = local452 <= local442 ? 0 : 1;
						}
						for (local301 = 0; local301 < 13; local301++) {
							Static46.anIntArray55[local301] = -1;
							Static382.anIntArray369[local301] = 1;
						}
						@Pc(556) boolean[] local556 = local174 != null && local174.aBoolean310 ? Static678.aBooleanArrayArray9[local101] : Static243.aBooleanArrayArray6[local101];
						this.method6461(local25, local95, this.anInt7403, local195, local51, this.anInt7404, arg3, local174, local101, local107, local10, local32, local15);
						@Pc(592) boolean local592 = local174 != null && local174.anInt4663 != local174.anInt4677;
						if (!local592) {
							for (local357 = 0; local357 < 8; local357++) {
								if (Static46.anIntArray55[local357] >= 0 && Static208.anIntArray183[local357] != Static348.anIntArray333[local357]) {
									local592 = true;
									break;
								}
							}
						}
						if (!local556[local107 + 1 & 0x3]) {
							local95[1] = Static67.method1112(local95[1], (Static382.anIntArray369[4] & Static382.anIntArray369[2]) == 0);
						}
						if (!local556[local107 + 3 & 0x3]) {
							local95[3] = Static67.method1112(local95[3], (Static382.anIntArray369[0] & Static382.anIntArray369[6]) == 0);
						}
						if (!local556[local107 & 0x3]) {
							local95[0] = Static67.method1112(local95[0], (Static382.anIntArray369[0] & Static382.anIntArray369[2]) == 0);
						}
						if (!local556[local107 + 2 & 0x3]) {
							local95[2] = Static67.method1112(local95[2], (Static382.anIntArray369[4] & Static382.anIntArray369[6]) == 0);
						}
						if (!local92 && (local101 == 0 || local101 == 12)) {
							if (local95[0] && !local95[1] && !local95[2] && local95[3]) {
								local107 = 0;
								local101 = local101 == 0 ? 13 : 14;
								local95[0] = local95[3] = false;
							} else if (local95[0] && local95[1] && !local95[2] && !local95[3]) {
								local107 = 3;
								local95[0] = local95[1] = false;
								local101 = local101 == 0 ? 13 : 14;
							} else if (!local95[0] && local95[1] && local95[2] && !local95[3]) {
								local101 = local101 == 0 ? 13 : 14;
								local107 = 2;
								local95[1] = local95[2] = false;
							} else if (!local95[0] && !local95[1] && local95[2] && local95[3]) {
								local107 = 1;
								local101 = local101 == 0 ? 13 : 14;
								local95[2] = local95[3] = false;
							}
						}
						@Pc(956) boolean local956 = !local92 && !local95[0] && !local95[2] && !local95[1] && !local95[3];
						@Pc(958) int[] local958 = null;
						@Pc(989) int[] local989;
						@Pc(968) int[] local968;
						@Pc(972) int[] local972;
						if (local956) {
							local442 = local195 == null ? 0 : Static520.anIntArray475[local101];
							local968 = Static42.anIntArrayArray5[local101];
							local989 = Static633.anIntArrayArray63[local101];
							local452 = local174 == null ? 0 : Static485.anIntArray606[local101];
							local972 = Static252.anIntArrayArray36[local101];
						} else if (local92) {
							local968 = Static319.anIntArrayArray39[local101];
							local972 = Static456.anIntArrayArray48[local101];
							local958 = Static108.anIntArrayArray13[local101];
							local442 = local195 == null ? 0 : Static604.anIntArray543[local101];
							local989 = Static393.anIntArrayArray44[local101];
							local452 = local174 == null ? 0 : Static311.anIntArray317[local101];
						} else {
							local968 = Static399.anIntArrayArray45[local101];
							local989 = Static117.anIntArrayArray15[local101];
							local958 = Static149.anIntArrayArray21[local101];
							local442 = local195 == null ? 0 : Static514.anIntArray471[local101];
							local452 = local174 == null ? 0 : Static453.anIntArray437[local101];
							local972 = Static88.anIntArrayArray10[local101];
						}
						@Pc(1069) int local1069 = local452 + local442;
						if (local1069 <= 0) {
							Static241.method3845(arg4, local32, local51);
						} else {
							if (local95[0]) {
								local1069++;
							}
							if (local95[2]) {
								local1069++;
							}
							if (local95[1]) {
								local1069++;
							}
							if (local95[3]) {
								local1069++;
							}
							@Pc(1114) int local1114 = 0;
							@Pc(1116) int local1116 = 0;
							@Pc(1120) int local1120 = local1069 * 3;
							@Pc(1128) int[] local1128 = local592 ? new int[local1120] : null;
							@Pc(1131) int[] local1131 = new int[local1120];
							@Pc(1134) int[] local1134 = new int[local1120];
							@Pc(1137) int[] local1137 = new int[local1120];
							@Pc(1140) int[] local1140 = new int[local1120];
							@Pc(1143) int[] local1143 = new int[local1120];
							@Pc(1151) int[] local1151 = arg1 == null ? null : new int[local1120];
							@Pc(1163) int[] local1163 = arg1 == null && arg2 == null ? null : new int[local1120];
							@Pc(1165) int local1165 = -1;
							@Pc(1167) int local1167 = -1;
							@Pc(1169) int local1169 = 256;
							@Pc(1225) boolean local1225;
							@Pc(1217) int local1217;
							@Pc(1219) int local1219;
							@Pc(1468) int local1468;
							@Pc(1474) int local1474;
							@Pc(1482) int local1482;
							@Pc(1487) int local1487;
							@Pc(1510) int local1510;
							@Pc(1492) int local1492;
							@Pc(1505) int local1505;
							@Pc(1565) int local1565;
							@Pc(1571) int local1571;
							@Pc(1267) byte local1267;
							if (local174 != null) {
								local1167 = local174.anInt4676;
								local1169 = local174.anInt4679;
								local1165 = local174.anInt4663;
								local1217 = Static183.method3165(arg3, local174);
								for (local1219 = 0; local1219 < local452; local1219++) {
									local1225 = false;
									if (local95[-local107 & 0x3] && local1114 == local958[0]) {
										Static602.anIntArray540[0] = local989[local1114];
										Static602.anIntArray540[1] = 1;
										Static602.anIntArray540[2] = local972[local1114];
										Static602.anIntArray540[3] = 1;
										Static602.anIntArray540[4] = local968[local1114];
										local1267 = 6;
										Static602.anIntArray540[5] = local972[local1114];
									} else if (local95[2 - local107 & 0x3] && local958[2] == local1114) {
										Static602.anIntArray540[0] = local989[local1114];
										Static602.anIntArray540[1] = 5;
										Static602.anIntArray540[2] = local972[local1114];
										Static602.anIntArray540[3] = 5;
										Static602.anIntArray540[4] = local968[local1114];
										Static602.anIntArray540[5] = local972[local1114];
										local1267 = 6;
									} else if (local95[1 - local107 & 0x3] && local1114 == local958[1]) {
										Static602.anIntArray540[0] = local989[local1114];
										Static602.anIntArray540[1] = 3;
										Static602.anIntArray540[2] = local972[local1114];
										Static602.anIntArray540[3] = 3;
										Static602.anIntArray540[4] = local968[local1114];
										Static602.anIntArray540[5] = local972[local1114];
										local1267 = 6;
									} else if (local95[3 - local107 & 0x3] && local958[3] == local1114) {
										Static602.anIntArray540[0] = local989[local1114];
										Static602.anIntArray540[1] = 7;
										Static602.anIntArray540[2] = local972[local1114];
										Static602.anIntArray540[3] = 7;
										Static602.anIntArray540[4] = local968[local1114];
										local1267 = 6;
										Static602.anIntArray540[5] = local972[local1114];
									} else {
										Static602.anIntArray540[0] = local989[local1114];
										Static602.anIntArray540[1] = local968[local1114];
										Static602.anIntArray540[2] = local972[local1114];
										local1267 = 3;
									}
									local1114++;
									for (local1468 = 0; local1468 < local1267; local1468++) {
										local1474 = Static602.anIntArray540[local1468];
										local1482 = local1474 - local107 * 2 & 0x7;
										local1487 = this.anIntArray439[local1474];
										local1492 = this.anIntArray442[local1474];
										if (local107 == 1) {
											local1510 = local1492;
											local1505 = 512 - local1487;
										} else if (local107 == 2) {
											local1505 = 512 - local1492;
											local1510 = 512 - local1487;
										} else if (local107 == 3) {
											local1505 = local1487;
											local1510 = 512 - local1492;
										} else {
											local1505 = local1492;
											local1510 = local1487;
										}
										local1131[local1116] = local1510;
										local1134[local1116] = local1505;
										if (local1151 != null && Static326.aBooleanArrayArray4[local101][local1474]) {
											local1565 = (local32 << 9) + local1510;
											local1571 = local1505 + (local51 << 9);
											local1151[local1116] = arg1.method7625(local1565, local1571) - arg0.method7625(local1565, local1571);
										}
										if (local1163 != null) {
											if (arg1 != null && !Static326.aBooleanArrayArray4[local101][local1474]) {
												local1565 = local1510 + (local32 << 9);
												local1571 = (local51 << 9) + local1505;
												local1163[local1116] = arg0.method7625(local1565, local1571) - arg1.method7625(local1565, local1571);
											} else if (arg2 != null && !Static94.aBooleanArrayArray1[local101][local1474]) {
												local1565 = local1510 + (local32 << 9);
												local1571 = local1505 + (local51 << 9);
												local1163[local1116] = arg2.method7625(local1565, local1571) - arg0.method7625(local1565, local1571);
											}
										}
										if (local1474 < 8 && Static46.anIntArray55[local1482] > local174.anInt4665) {
											if (local1128 != null) {
												local1128[local1116] = Static348.anIntArray333[local1482];
											}
											local1143[local1116] = Static93.anIntArray87[local1482];
											local1140[local1116] = Static311.anIntArray318[local1482];
											local1137[local1116] = Static208.anIntArray183[local1482];
										} else {
											if (local1128 != null) {
												local1128[local1116] = local1217;
											}
											local1140[local1116] = local174.anInt4676;
											local1143[local1116] = local174.anInt4679;
											local1137[local1116] = local1165;
										}
										local1116++;
									}
								}
								if (!this.aBoolean505 && arg4 == 0) {
									Static57.method1022(local32, local51, local174.anInt4678, local174.anInt4668 * 8, local174.anInt4673);
								}
								if (local101 != 12 && local174.anInt4663 != -1 && local174.aBoolean311) {
									local90 = true;
								}
							} else if (local956) {
								local1114 = Static485.anIntArray606[local101];
							} else if (local92) {
								local1114 = Static311.anIntArray317[local101];
							} else {
								local1114 = Static453.anIntArray437[local101];
							}
							if (local195 != null) {
								if (local147 == 0) {
									local147 = local123;
								}
								if (local131 == 0) {
									local131 = local123;
								}
								if (local139 == 0) {
									local139 = local123;
								}
								@Pc(1820) Class367 local1820 = this.aClass152_5.method3422(local123 - 1);
								@Pc(1828) Class367 local1828 = this.aClass152_5.method3422(local131 - 1);
								@Pc(1836) Class367 local1836 = this.aClass152_5.method3422(local139 - 1);
								@Pc(1844) Class367 local1844 = this.aClass152_5.method3422(local147 - 1);
								for (local1482 = 0; local1482 < local442; local1482++) {
									local1225 = false;
									if (local95[-local107 & 0x3] && local958[0] == local1114) {
										Static602.anIntArray540[0] = local989[local1114];
										Static602.anIntArray540[1] = 1;
										Static602.anIntArray540[2] = local972[local1114];
										Static602.anIntArray540[3] = 1;
										Static602.anIntArray540[4] = local968[local1114];
										Static602.anIntArray540[5] = local972[local1114];
										local1267 = 6;
									} else if (local95[2 - local107 & 0x3] && local958[2] == local1114) {
										Static602.anIntArray540[0] = local989[local1114];
										Static602.anIntArray540[1] = 5;
										Static602.anIntArray540[2] = local972[local1114];
										Static602.anIntArray540[3] = 5;
										Static602.anIntArray540[4] = local968[local1114];
										Static602.anIntArray540[5] = local972[local1114];
										local1267 = 6;
									} else if (local95[1 - local107 & 0x3] && local1114 == local958[1]) {
										Static602.anIntArray540[0] = local989[local1114];
										Static602.anIntArray540[1] = 3;
										Static602.anIntArray540[2] = local972[local1114];
										Static602.anIntArray540[3] = 3;
										Static602.anIntArray540[4] = local968[local1114];
										local1267 = 6;
										Static602.anIntArray540[5] = local972[local1114];
									} else if (local95[3 - local107 & 0x3] && local958[3] == local1114) {
										Static602.anIntArray540[0] = local989[local1114];
										Static602.anIntArray540[1] = 7;
										Static602.anIntArray540[2] = local972[local1114];
										Static602.anIntArray540[3] = 7;
										Static602.anIntArray540[4] = local968[local1114];
										Static602.anIntArray540[5] = local972[local1114];
										local1267 = 6;
									} else {
										Static602.anIntArray540[0] = local989[local1114];
										Static602.anIntArray540[1] = local968[local1114];
										local1267 = 3;
										Static602.anIntArray540[2] = local972[local1114];
									}
									local1114++;
									for (local1487 = 0; local1487 < local1267; local1487++) {
										local1510 = Static602.anIntArray540[local1487];
										local1492 = local1510 - local107 * 2 & 0x7;
										local1505 = this.anIntArray439[local1510];
										local1571 = this.anIntArray442[local1510];
										@Pc(2126) int local2126;
										if (local107 == 1) {
											local2126 = 512 - local1505;
											local1565 = local1571;
										} else if (local107 == 2) {
											local1565 = 512 - local1505;
											local2126 = 512 - local1571;
										} else if (local107 == 3) {
											local1565 = 512 - local1571;
											local2126 = local1505;
										} else {
											local2126 = local1571;
											local1565 = local1505;
										}
										local1131[local1116] = local1565;
										local1134[local1116] = local2126;
										@Pc(2191) int local2191;
										@Pc(2198) int local2198;
										if (local1151 != null && Static326.aBooleanArrayArray4[local101][local1510]) {
											local2191 = local1565 + (local32 << 9);
											local2198 = (local51 << 9) + local2126;
											local1151[local1116] = arg1.method7625(local2191, local2198) - arg0.method7625(local2191, local2198);
										}
										if (local1163 != null) {
											if (arg1 != null && !Static326.aBooleanArrayArray4[local101][local1510]) {
												local2191 = local1565 + (local32 << 9);
												local2198 = local2126 + (local51 << 9);
												local1163[local1116] = arg0.method7625(local2191, local2198) - arg1.method7625(local2191, local2198);
											} else if (arg2 != null && !Static94.aBooleanArrayArray1[local101][local1510]) {
												local2191 = (local32 << 9) + local1565;
												local2198 = (local51 << 9) + local2126;
												local1163[local1116] = arg2.method7625(local2191, local2198) - arg0.method7625(local2191, local2198);
											}
										}
										if (local1510 < 8 && Static46.anIntArray55[local1492] >= 0) {
											if (local1128 != null) {
												local1128[local1116] = Static348.anIntArray333[local1492];
											}
											local1143[local1116] = Static93.anIntArray87[local1492];
											local1140[local1116] = Static311.anIntArray318[local1492];
											local1137[local1116] = Static208.anIntArray183[local1492];
										} else {
											if (local92 && Static326.aBooleanArrayArray4[local101][local1510]) {
												local1140[local1116] = local1167;
												local1143[local1116] = local1169;
												local1137[local1116] = local1165;
											} else if (local1565 == 0 && local2126 == 0) {
												local1137[local1116] = arg5[local32][local51];
												local1140[local1116] = local1820.anInt9840;
												local1143[local1116] = local1820.anInt9841;
											} else if (local1565 == 0 && local2126 == 512) {
												local1137[local1116] = arg5[local32][local72];
												local1140[local1116] = local1828.anInt9840;
												local1143[local1116] = local1828.anInt9841;
											} else if (local1565 == 512 && local2126 == 512) {
												local1137[local1116] = arg5[local49][local72];
												local1140[local1116] = local1836.anInt9840;
												local1143[local1116] = local1836.anInt9841;
											} else if (local1565 == 512 && local2126 == 0) {
												local1137[local1116] = arg5[local49][local51];
												local1140[local1116] = local1844.anInt9840;
												local1143[local1116] = local1844.anInt9841;
											} else {
												if (local1565 < 256) {
													if (local2126 >= 256) {
														local1140[local1116] = local1828.anInt9840;
														local1143[local1116] = local1828.anInt9841;
													} else {
														local1140[local1116] = local1820.anInt9840;
														local1143[local1116] = local1820.anInt9841;
													}
												} else if (local2126 < 256) {
													local1140[local1116] = local1844.anInt9840;
													local1143[local1116] = local1844.anInt9841;
												} else {
													local1140[local1116] = local1836.anInt9840;
													local1143[local1116] = local1836.anInt9841;
												}
												local2191 = Static662.method9085(arg5[local32][local51], arg5[local49][local51], local1565 << 7 >> 9);
												local2198 = Static662.method9085(arg5[local32][local72], arg5[local49][local72], local1565 << 7 >> 9);
												local1137[local1116] = Static662.method9085(local2191, local2198, local2126 << 7 >> 9);
											}
											if (local1128 != null) {
												local1128[local1116] = local1137[local1116];
											}
										}
										local1116++;
									}
								}
								if (local101 != 0 && local195.aBoolean692) {
									local90 = true;
								}
							}
							local1217 = arg0.method7620(local51, local32);
							local1219 = arg0.method7620(local51, local49);
							local1468 = arg0.method7620(local72, local49);
							local1474 = arg0.method7620(local72, local32);
							@Pc(2691) boolean local2691 = Static389.method1741(local51, local32);
							if (local2691 && arg4 > 1 || !local2691 && arg4 > 0) {
								@Pc(2708) boolean local2708 = true;
								if (local195 != null && !local195.aBoolean691) {
									local2708 = false;
								} else if (local123 == 0 && local101 != 0) {
									local2708 = false;
								} else if (local115 > 0 && local197 != null && !local197.aBoolean309) {
									local2708 = false;
								}
								if (local2708 && local1217 == local1219 && local1468 == local1217 && local1217 == local1474) {
									this.aByteArrayArrayArray20[arg4][local32][local51] = (byte) (this.aByteArrayArrayArray20[arg4][local32][local51] | 0x4);
								}
							}
							local1487 = 0;
							local1510 = 0;
							local1492 = 0;
							if (this.aBoolean505) {
								local1487 = Static368.method5493(local32, local51);
								local1510 = Static317.method4844(local32, local51);
								local1492 = Static97.method1522(local32, local51);
							}
							arg0.U(local32, local51, local1131, local1151, local1134, local1163, local1137, local1128, local1140, local1143, local1487, local1510, local1492, local90);
							Static241.method3845(arg4, local32, local51);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(Lclient!s;Lclient!s;Lclient!ha;I)V")
	public final void method6455(@OriginalArg(0) Class84 arg0, @OriginalArg(1) Class84 arg1, @OriginalArg(2) Class100 arg2, @OriginalArg(3) int arg3) {
		@Pc(11) int[][] local11 = new int[this.anInt7403][this.anInt7404];
		if (Static556.anIntArray498 == null || Static556.anIntArray498.length != this.anInt7404) {
			Static556.anIntArray498 = new int[this.anInt7404];
			Static619.anIntArray553 = new int[this.anInt7404];
			Static642.anIntArray595 = new int[this.anInt7404];
			Static373.anIntArray363 = new int[this.anInt7404];
			Static615.anIntArray550 = new int[this.anInt7404];
		}
		@Pc(54) int local54;
		for (@Pc(48) int local48 = arg3; local48 < this.anInt7399; local48++) {
			for (local54 = 0; local54 < this.anInt7404; local54++) {
				Static556.anIntArray498[local54] = 0;
				Static373.anIntArray363[local54] = 0;
				Static619.anIntArray553[local54] = 0;
				Static642.anIntArray595[local54] = 0;
				Static615.anIntArray550[local54] = 0;
			}
			for (@Pc(89) int local89 = -5; local89 < this.anInt7403; local89++) {
				@Pc(105) int local105;
				@Pc(120) int local120;
				@Pc(192) int local192;
				for (@Pc(97) int local97 = 0; local97 < this.anInt7404; local97++) {
					local105 = local89 + 5;
					@Pc(169) int local169;
					if (local105 < this.anInt7403) {
						local120 = this.aByteArrayArrayArray19[local48][local105][local97] & 0xFF;
						if (local120 > 0) {
							@Pc(133) Class367 local133 = this.aClass152_5.method3422(local120 - 1);
							Static556.anIntArray498[local97] += local133.anInt9843;
							Static373.anIntArray363[local97] += local133.anInt9838;
							Static619.anIntArray553[local97] += local133.anInt9845;
							Static642.anIntArray595[local97] += local133.anInt9835;
							local169 = Static615.anIntArray550[local97]++;
						}
					}
					local120 = local89 - 5;
					if (local120 >= 0) {
						local192 = this.aByteArrayArrayArray19[local48][local120][local97] & 0xFF;
						if (local192 > 0) {
							@Pc(205) Class367 local205 = this.aClass152_5.method3422(local192 - 1);
							Static556.anIntArray498[local97] -= local205.anInt9843;
							Static373.anIntArray363[local97] -= local205.anInt9838;
							Static619.anIntArray553[local97] -= local205.anInt9845;
							Static642.anIntArray595[local97] -= local205.anInt9835;
							local169 = Static615.anIntArray550[local97]--;
						}
					}
				}
				if (local89 >= 0) {
					local105 = 0;
					local120 = 0;
					local192 = 0;
					@Pc(267) int local267 = 0;
					@Pc(269) int local269 = 0;
					for (@Pc(271) int local271 = -5; local271 < this.anInt7404; local271++) {
						@Pc(277) int local277 = local271 + 5;
						if (this.anInt7404 > local277) {
							local192 += Static619.anIntArray553[local277];
							local269 += Static615.anIntArray550[local277];
							local267 += Static642.anIntArray595[local277];
							local105 += Static556.anIntArray498[local277];
							local120 += Static373.anIntArray363[local277];
						}
						@Pc(315) int local315 = local271 - 5;
						if (local315 >= 0) {
							local105 -= Static556.anIntArray498[local315];
							local192 -= Static619.anIntArray553[local315];
							local267 -= Static642.anIntArray595[local315];
							local269 -= Static615.anIntArray550[local315];
							local120 -= Static373.anIntArray363[local315];
						}
						if (local271 >= 0 && local267 > 0 && local269 > 0) {
							local11[local89][local271] = Static91.method5830(local105 * 256 / local267, local120 / local269, local192 / local269);
						}
					}
				}
			}
			if (Static428.aBoolean476) {
				this.method6454(Static177.aClass84Array2[local48], local48 == 0 ? arg0 : null, local48 == 0 ? arg1 : null, arg2, local48, local11);
			} else {
				this.method6458(local48, arg2, local48 == 0 ? arg0 : null, local48 == 0 ? arg1 : null, Static177.aClass84Array2[local48], local11);
			}
			this.aByteArrayArrayArray19[local48] = null;
			this.aByteArrayArrayArray15[local48] = null;
			this.aByteArrayArrayArray16[local48] = null;
			this.aByteArrayArrayArray17[local48] = null;
		}
		if (!this.aBoolean505) {
			if (Static560.anInt8808 != 0) {
				Static661.method9082();
			}
			if (Static3.aBoolean1) {
				Static243.method3846();
			}
		}
		for (local54 = 0; local54 < this.anInt7399; local54++) {
			Static177.aClass84Array2[local54].YA();
		}
	}

	@OriginalMember(owner = "client!gn", name = "b", descriptor = "(IIIII)V")
	public final void method6456(@OriginalArg(1) int arg0, @OriginalArg(3) int arg1) {
		for (@Pc(7) int local7 = 0; local7 < this.anInt7399; local7++) {
			this.method6453(arg0, arg1, local7, 64, 64);
		}
	}

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(ILclient!ha;ILclient!s;Lclient!s;Lclient!s;[[I)V")
	private void method6458(@OriginalArg(0) int arg0, @OriginalArg(1) Class100 arg1, @OriginalArg(3) Class84 arg2, @OriginalArg(4) Class84 arg3, @OriginalArg(5) Class84 arg4, @OriginalArg(6) int[][] arg5) {
		for (@Pc(15) int local15 = 0; local15 < this.anInt7403; local15++) {
			for (@Pc(19) int local19 = 0; local19 < this.anInt7404; local19++) {
				if (Static460.anInt7446 == -1 || Static62.method1063(arg0, Static460.anInt7446, local19, local15)) {
					@Pc(49) byte local49 = this.aByteArrayArrayArray16[arg0][local15][local19];
					@Pc(58) byte local58 = this.aByteArrayArrayArray17[arg0][local15][local19];
					@Pc(69) int local69 = this.aByteArrayArrayArray15[arg0][local15][local19] & 0xFF;
					@Pc(80) int local80 = this.aByteArrayArrayArray19[arg0][local15][local19] & 0xFF;
					@Pc(96) Class181 local96 = local69 == 0 ? null : this.aClass141_6.method3314(local69 - 1);
					if (local49 == 0 && local96 == null) {
						local49 = 12;
					}
					@Pc(123) Class367 local123 = local80 == 0 ? null : this.aClass152_5.method3422(local80 - 1);
					@Pc(125) Class181 local125 = local96;
					if (local96 != null && local96.anInt4663 == -1 && local96.anInt4677 == -1) {
						local125 = local96;
						local96 = null;
					}
					if (local96 != null || local123 != null) {
						@Pc(154) int local154 = Static520.anIntArray475[local49];
						@Pc(158) int local158 = Static485.anIntArray606[local49];
						@Pc(172) int local172 = (local123 == null ? 0 : local154) + (local96 == null ? 0 : local158);
						@Pc(174) int local174 = 0;
						@Pc(176) int local176 = 0;
						@Pc(184) int local184 = local96 == null ? -1 : local96.anInt4676;
						@Pc(192) int local192 = local123 == null ? -1 : local123.anInt9840;
						@Pc(195) int[] local195 = new int[local172];
						@Pc(198) int[] local198 = new int[local172];
						@Pc(201) int[] local201 = new int[local172];
						@Pc(204) int[] local204 = new int[local172];
						@Pc(207) int[] local207 = new int[local172];
						@Pc(210) int[] local210 = new int[local172];
						@Pc(225) int[] local225 = local96 == null || local96.anInt4677 == -1 ? null : new int[local172];
						@Pc(235) int local235;
						if (local96 == null) {
							local176 = local158;
						} else {
							for (local235 = 0; local235 < local158; local235++) {
								local195[local174] = Static633.anIntArrayArray63[local49][local176];
								local198[local174] = Static42.anIntArrayArray5[local49][local176];
								local201[local174] = Static252.anIntArrayArray36[local49][local176];
								local207[local174] = local184;
								local210[local174] = local96.anInt4679;
								local204[local174] = local96.anInt4663;
								if (local225 != null) {
									local225[local174] = local96.anInt4677;
								}
								local174++;
								local176++;
							}
							if (!this.aBoolean505 && arg0 == 0) {
								Static57.method1022(local15, local19, local96.anInt4678, local96.anInt4668 * 8, local96.anInt4673);
							}
						}
						if (local123 != null) {
							for (local235 = 0; local235 < local154; local235++) {
								local195[local174] = Static633.anIntArrayArray63[local49][local176];
								local198[local174] = Static42.anIntArrayArray5[local49][local176];
								local201[local174] = Static252.anIntArrayArray36[local49][local176];
								local207[local174] = local192;
								local210[local174] = local123.anInt9841;
								local204[local174] = arg5[local15][local19];
								if (local225 != null) {
									local225[local174] = local204[local174];
								}
								local176++;
								local174++;
							}
						}
						local235 = this.anIntArray439.length;
						@Pc(395) int[] local395 = new int[local235];
						@Pc(398) int[] local398 = new int[local235];
						@Pc(410) int[] local410 = arg2 == null ? null : new int[local235];
						@Pc(422) int[] local422 = arg2 == null && arg3 == null ? null : new int[local235];
						@Pc(431) int local431;
						@Pc(436) int local436;
						@Pc(528) int local528;
						@Pc(537) int local537;
						for (@Pc(424) int local424 = 0; local424 < local235; local424++) {
							local431 = this.anIntArray439[local424];
							local436 = this.anIntArray442[local424];
							if (local58 == 0) {
								local395[local424] = local431;
								local398[local424] = local436;
							} else if (local58 == 1) {
								local395[local424] = local436;
								local398[local424] = 512 - local431;
							} else if (local58 == 2) {
								local395[local424] = 512 - local431;
								local398[local424] = 512 - local436;
							} else if (local58 == 3) {
								local395[local424] = 512 - local436;
								local398[local424] = local431;
							}
							if (local410 != null && Static326.aBooleanArrayArray4[local49][local424]) {
								local528 = local395[local424] + (local15 << 9);
								local537 = (local19 << 9) + local398[local424];
								local410[local424] = arg2.method7625(local528, local537) - arg4.method7625(local528, local537);
							}
							if (local422 != null) {
								if (arg2 != null && !Static326.aBooleanArrayArray4[local49][local424]) {
									local528 = (local15 << 9) + local395[local424];
									local537 = local398[local424] + (local19 << 9);
									local422[local424] = arg4.method7625(local528, local537) - arg2.method7625(local528, local537);
								} else if (arg3 != null && !Static94.aBooleanArrayArray1[local49][local424]) {
									local528 = local395[local424] + (local15 << 9);
									local537 = local398[local424] + (local19 << 9);
									local422[local424] = arg3.method7625(local528, local537) - arg4.method7625(local528, local537);
								}
							}
						}
						local431 = arg4.method7620(local19, local15);
						local436 = arg4.method7620(local19, local15 + 1);
						local528 = arg4.method7620(local19 + 1, local15 + 1);
						local537 = arg4.method7620(local19 + 1, local15);
						@Pc(687) boolean local687 = Static389.method1741(local19, local15);
						if (local687 && arg0 > 1 || !local687 && arg0 > 0) {
							@Pc(708) boolean local708 = true;
							if (local123 != null && !local123.aBoolean691) {
								local708 = false;
							} else if (local80 == 0 && local49 != 0) {
								local708 = false;
							} else if (local69 > 0 && local125 != null && !local125.aBoolean309) {
								local708 = false;
							}
							if (local708 && local431 == local436 && local528 == local431 && local431 == local537) {
								this.aByteArrayArrayArray20[arg0][local15][local19] = (byte) (this.aByteArrayArrayArray20[arg0][local15][local19] | 0x4);
							}
						}
						@Pc(792) int local792 = 0;
						@Pc(794) int local794 = 0;
						@Pc(796) int local796 = 0;
						if (this.aBoolean505) {
							local792 = Static368.method5493(local15, local19);
							local794 = Static317.method4844(local15, local19);
							local796 = Static97.method1522(local15, local19);
						}
						arg4.method7617(local15, local19, local395, local410, local398, local422, local195, local198, local201, local204, local225, local207, local210, local792, local794, local796);
						Static241.method3845(arg0, local15, local19);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(IIILclient!wq;IIIZI[Lclient!ii;)V")
	public final void method6459(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class5_Sub36 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) Class169[] arg8) {
		@Pc(11) int local11 = (arg6 & 0x7) * 8;
		@Pc(20) int local20;
		@Pc(51) int local51;
		if (!this.aBoolean505) {
			@Pc(18) Class169 local18 = arg8[arg7];
			for (local20 = 0; local20 < 8; local20++) {
				for (@Pc(24) int local24 = 0; local24 < 8; local24++) {
					@Pc(38) int local38 = arg4 + Static83.method1334(local20 & 0x7, arg1, local24 & 0x7);
					local51 = arg0 + Static128.method1922(arg1, local20 & 0x7, local24 & 0x7);
					if (local38 > 0 && local38 < this.anInt7403 - 1 && local51 > 0 && local51 < this.anInt7404 - 1) {
						local18.method3879(local51, local38);
					}
				}
			}
		}
		@Pc(98) int local98 = (arg2 & 0x7) * 8;
		@Pc(104) int local104 = (arg6 & 0xFFFFFFF8) << 3;
		local20 = (arg2 & 0x1FFFFFF8) << 3;
		@Pc(112) byte local112 = 0;
		@Pc(114) byte local114 = 0;
		if (arg1 == 1) {
			local114 = 1;
		} else if (arg1 == 2) {
			local114 = 1;
			local112 = 1;
		} else if (arg1 == 3) {
			local112 = 1;
		}
		for (local51 = 0; local51 < this.anInt7399; local51++) {
			for (@Pc(149) int local149 = 0; local149 < 64; local149++) {
				for (@Pc(153) int local153 = 0; local153 < 64; local153++) {
					if (arg5 == local51 && local11 <= local149 && local149 <= local11 + 8 && local153 >= local98 && local153 <= local98 + 8) {
						@Pc(237) int local237;
						@Pc(230) int local230;
						if (local149 == local11 + 8 || local153 == local98 + 8) {
							if (arg1 == 0) {
								local230 = local153 + arg0 - local98;
								local237 = arg4 + local149 - local11;
							} else if (arg1 == 1) {
								local237 = arg4 + local153 - local98;
								local230 = arg0 + local11 + 8 - local149;
							} else if (arg1 == 2) {
								local237 = local11 + arg4 + 8 - local149;
								local230 = arg0 + local98 + 8 - local153;
							} else {
								local230 = arg0 + local149 - local11;
								local237 = arg4 + local98 + 8 - local153;
							}
							this.method6448(local237, local104 + local149, 0, 0, arg7, arg3, local230, 0, true, local20 + local153);
						} else {
							local237 = Static83.method1334(local149 & 0x7, arg1, local153 & 0x7) + arg4;
							local230 = arg0 + Static128.method1922(arg1, local149 & 0x7, local153 & 0x7);
							this.method6448(local237, local149 + local104, local112, arg1, arg7, arg3, local230, local114, false, local153 + local20);
						}
						if (local149 == 63 || local153 == 63) {
							@Pc(380) byte local380 = 1;
							if (local149 == 63 && local153 == 63) {
								local380 = 3;
							}
							for (@Pc(392) int local392 = 0; local392 < local380; local392++) {
								@Pc(396) int local396 = local149;
								@Pc(398) int local398 = local153;
								if (local392 == 0) {
									local398 = local153 == 63 ? 64 : local153;
									local396 = local149 == 63 ? 64 : local149;
								} else if (local392 == 1) {
									local396 = 64;
								} else if (local392 == 2) {
									local398 = 64;
								}
								@Pc(454) int local454;
								@Pc(461) int local461;
								if (arg1 == 0) {
									local454 = arg4 + local396 - local11;
									local461 = local398 + arg0 - local98;
								} else if (arg1 == 1) {
									local454 = local398 + arg4 - local98;
									local461 = arg0 + local11 + 8 - local396;
								} else if (arg1 == 2) {
									local461 = arg0 + local98 + 8 - local398;
									local454 = arg4 + local11 + 8 - local396;
								} else {
									local461 = local396 + arg0 - local11;
									local454 = arg4 + local98 + 8 - local398;
								}
								if (local454 >= 0 && local454 < this.anInt7403 && local461 >= 0 && local461 < this.anInt7404) {
									this.anIntArrayArrayArray16[arg7][local454][local461] = this.anIntArrayArrayArray16[arg7][local112 + local237][local230 + local114];
								}
							}
						}
					} else {
						this.method6448(-1, 0, 0, 0, 0, arg3, -1, 0, false, 0);
					}
				}
			}
		}
		if (false) {
			this.method6455((Class84) null, (Class84) null, (Class100) null, 81);
		}
	}

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(I[[IB)V")
	public final void method6460(@OriginalArg(1) int[][] arg0) {
		@Pc(10) int[][] local10 = this.anIntArrayArrayArray16[0];
		for (@Pc(12) int local12 = 0; local12 < this.anInt7403 + 1; local12++) {
			for (@Pc(19) int local19 = 0; local19 < this.anInt7404 + 1; local19++) {
				local10[local12][local19] += arg0[local12][local19];
			}
		}
	}

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(I[[B[ZILclient!un;IILclient!ha;Lclient!jc;II[[BI[[B)V")
	private void method6461(@OriginalArg(1) byte[][] arg0, @OriginalArg(2) boolean[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class367 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class100 arg6, @OriginalArg(8) Class181 arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) byte[][] arg10, @OriginalArg(12) int arg11, @OriginalArg(13) byte[][] arg12) {
		@Pc(21) boolean[] local21 = arg7 != null && arg7.aBoolean310 ? Static678.aBooleanArrayArray9[arg8] : Static243.aBooleanArrayArray6[arg8];
		@Pc(56) int local56;
		@Pc(69) Class181 local69;
		@Pc(88) byte local88;
		@Pc(105) int local105;
		@Pc(110) int local110;
		if (arg4 > 0) {
			if (arg11 > 0) {
				local56 = arg0[arg11 - 1][arg4 - 1] & 0xFF;
				if (local56 > 0) {
					local69 = this.aClass141_6.method3314(local56 - 1);
					if (local69.anInt4663 != -1 && local69.aBoolean310) {
						local88 = arg10[arg11 - 1][arg4 - 1];
						local105 = arg12[arg11 - 1][arg4 - 1] * 2 + 4 & 0x7;
						local110 = Static183.method3165(arg6, local69);
						if (Static326.aBooleanArrayArray4[local88][local105]) {
							Static208.anIntArray183[0] = local69.anInt4663;
							Static348.anIntArray333[0] = local110;
							Static311.anIntArray318[0] = local69.anInt4676;
							Static93.anIntArray87[0] = local69.anInt4679;
							Static46.anIntArray55[0] = local69.anInt4665;
							Static382.anIntArray369[0] = 256;
						}
					}
				}
			}
			if (arg11 < arg2 - 1) {
				local56 = arg0[arg11 + 1][arg4 - 1] & 0xFF;
				if (local56 > 0) {
					local69 = this.aClass141_6.method3314(local56 - 1);
					if (local69.anInt4663 != -1 && local69.aBoolean310) {
						local88 = arg10[arg11 + 1][arg4 - 1];
						local105 = arg12[arg11 + 1][arg4 - 1] * 2 + 6 & 0x7;
						local110 = Static183.method3165(arg6, local69);
						if (Static326.aBooleanArrayArray4[local88][local105]) {
							Static208.anIntArray183[2] = local69.anInt4663;
							Static348.anIntArray333[2] = local110;
							Static311.anIntArray318[2] = local69.anInt4676;
							Static93.anIntArray87[2] = local69.anInt4679;
							Static46.anIntArray55[2] = local69.anInt4665;
							Static382.anIntArray369[2] = 512;
						}
					}
				}
			}
		}
		if (arg5 - 1 > arg4) {
			if (arg11 > 0) {
				local56 = arg0[arg11 - 1][arg4 + 1] & 0xFF;
				if (local56 > 0) {
					local69 = this.aClass141_6.method3314(local56 - 1);
					if (local69.anInt4663 != -1 && local69.aBoolean310) {
						local88 = arg10[arg11 - 1][arg4 + 1];
						local105 = arg12[arg11 - 1][arg4 + 1] * 2 + 2 & 0x7;
						local110 = Static183.method3165(arg6, local69);
						if (Static326.aBooleanArrayArray4[local88][local105]) {
							Static208.anIntArray183[6] = local69.anInt4663;
							Static348.anIntArray333[6] = local110;
							Static311.anIntArray318[6] = local69.anInt4676;
							Static93.anIntArray87[6] = local69.anInt4679;
							Static46.anIntArray55[6] = local69.anInt4665;
							Static382.anIntArray369[6] = 64;
						}
					}
				}
			}
			if (arg11 < arg2 - 1) {
				local56 = arg0[arg11 + 1][arg4 + 1] & 0xFF;
				if (local56 > 0) {
					local69 = this.aClass141_6.method3314(local56 - 1);
					if (local69.anInt4663 != -1 && local69.aBoolean310) {
						local88 = arg10[arg11 + 1][arg4 + 1];
						local105 = arg12[arg11 + 1][arg4 + 1] * 2 & 0x7;
						local110 = Static183.method3165(arg6, local69);
						if (Static326.aBooleanArrayArray4[local88][local105]) {
							Static208.anIntArray183[4] = local69.anInt4663;
							Static348.anIntArray333[4] = local110;
							Static311.anIntArray318[4] = local69.anInt4676;
							Static93.anIntArray87[4] = local69.anInt4679;
							Static46.anIntArray55[4] = local69.anInt4665;
							Static382.anIntArray369[4] = 128;
						}
					}
				}
			}
		}
		@Pc(525) int local525;
		@Pc(530) int local530;
		@Pc(532) int local532;
		@Pc(514) byte local514;
		if (arg4 > 0) {
			local56 = arg0[arg11][arg4 - 1] & 0xFF;
			if (local56 > 0) {
				local69 = this.aClass141_6.method3314(local56 - 1);
				if (local69.anInt4663 != -1) {
					local88 = arg10[arg11][arg4 - 1];
					local514 = arg12[arg11][arg4 - 1];
					if (local69.aBoolean310) {
						local110 = 2;
						local525 = local514 * 2 + 4;
						local530 = Static183.method3165(arg6, local69);
						for (local532 = 0; local532 < 3; local532++) {
							local110 &= 0x7;
							local525 &= 0x7;
							if (Static326.aBooleanArrayArray4[local88][local525] && local69.anInt4665 >= Static46.anIntArray55[local110]) {
								Static208.anIntArray183[local110] = local69.anInt4663;
								Static348.anIntArray333[local110] = local530;
								Static311.anIntArray318[local110] = local69.anInt4676;
								Static93.anIntArray87[local110] = local69.anInt4679;
								if (Static46.anIntArray55[local110] == local69.anInt4665) {
									Static382.anIntArray369[local110] |= 0x20;
								} else {
									Static382.anIntArray369[local110] = 32;
								}
								Static46.anIntArray55[local110] = local69.anInt4665;
							}
							local525++;
							local110--;
						}
						if (!local21[arg9 & 0x3]) {
							arg1[0] = Static678.aBooleanArrayArray9[local88][local514 + 2 & 0x3];
						}
					} else if (!local21[arg9 & 0x3]) {
						arg1[0] = Static243.aBooleanArrayArray6[local88][local514 + 2 & 0x3];
					}
				}
			}
		}
		if (arg4 < arg5 - 1) {
			local56 = arg0[arg11][arg4 + 1] & 0xFF;
			if (local56 > 0) {
				local69 = this.aClass141_6.method3314(local56 - 1);
				if (local69.anInt4663 != -1) {
					local88 = arg10[arg11][arg4 + 1];
					local514 = arg12[arg11][arg4 + 1];
					if (local69.aBoolean310) {
						local110 = 4;
						local525 = local514 * 2 + 2;
						local530 = Static183.method3165(arg6, local69);
						for (local532 = 0; local532 < 3; local532++) {
							local110 &= 0x7;
							local525 &= 0x7;
							if (Static326.aBooleanArrayArray4[local88][local525] && local69.anInt4665 >= Static46.anIntArray55[local110]) {
								Static208.anIntArray183[local110] = local69.anInt4663;
								Static348.anIntArray333[local110] = local530;
								Static311.anIntArray318[local110] = local69.anInt4676;
								Static93.anIntArray87[local110] = local69.anInt4679;
								if (local69.anInt4665 == Static46.anIntArray55[local110]) {
									Static382.anIntArray369[local110] |= 0x10;
								} else {
									Static382.anIntArray369[local110] = 16;
								}
								Static46.anIntArray55[local110] = local69.anInt4665;
							}
							local110++;
							local525--;
						}
						if (!local21[arg9 + 2 & 0x3]) {
							arg1[2] = Static678.aBooleanArrayArray9[local88][local514 & 0x3];
						}
					} else if (!local21[arg9 + 2 & 0x3]) {
						arg1[2] = Static243.aBooleanArrayArray6[local88][local514 & 0x3];
					}
				}
			}
		}
		if (arg11 > 0) {
			local56 = arg0[arg11 - 1][arg4] & 0xFF;
			if (local56 > 0) {
				local69 = this.aClass141_6.method3314(local56 - 1);
				if (local69.anInt4663 != -1) {
					local88 = arg10[arg11 - 1][arg4];
					local514 = arg12[arg11 - 1][arg4];
					if (local69.aBoolean310) {
						local110 = 6;
						local525 = local514 * 2 + 4;
						local530 = Static183.method3165(arg6, local69);
						for (local532 = 0; local532 < 3; local532++) {
							local110 &= 0x7;
							local525 &= 0x7;
							if (Static326.aBooleanArrayArray4[local88][local525] && local69.anInt4665 >= Static46.anIntArray55[local110]) {
								Static208.anIntArray183[local110] = local69.anInt4663;
								Static348.anIntArray333[local110] = local530;
								Static311.anIntArray318[local110] = local69.anInt4676;
								Static93.anIntArray87[local110] = local69.anInt4679;
								if (Static46.anIntArray55[local110] == local69.anInt4665) {
									Static382.anIntArray369[local110] |= 0x8;
								} else {
									Static382.anIntArray369[local110] = 8;
								}
								Static46.anIntArray55[local110] = local69.anInt4665;
							}
							local525--;
							local110++;
						}
						if (!local21[arg9 + 3 & 0x3]) {
							arg1[3] = Static678.aBooleanArrayArray9[local88][local514 + 1 & 0x3];
						}
					} else if (!local21[arg9 + 3 & 0x3]) {
						arg1[3] = Static243.aBooleanArrayArray6[local88][local514 + 1 & 0x3];
					}
				}
			}
		}
		if (arg11 < arg2 - 1) {
			local56 = arg0[arg11 + 1][arg4] & 0xFF;
			if (local56 > 0) {
				local69 = this.aClass141_6.method3314(local56 - 1);
				if (local69.anInt4663 != -1) {
					local88 = arg10[arg11 + 1][arg4];
					local514 = arg12[arg11 + 1][arg4];
					if (local69.aBoolean310) {
						local110 = 4;
						local525 = local514 * 2 + 6;
						local530 = Static183.method3165(arg6, local69);
						for (local532 = 0; local532 < 3; local532++) {
							local110 &= 0x7;
							local525 &= 0x7;
							if (Static326.aBooleanArrayArray4[local88][local525] && Static46.anIntArray55[local110] <= local69.anInt4665) {
								Static208.anIntArray183[local110] = local69.anInt4663;
								Static348.anIntArray333[local110] = local530;
								Static311.anIntArray318[local110] = local69.anInt4676;
								Static93.anIntArray87[local110] = local69.anInt4679;
								if (local69.anInt4665 == Static46.anIntArray55[local110]) {
									Static382.anIntArray369[local110] |= 0x4;
								} else {
									Static382.anIntArray369[local110] = 4;
								}
								Static46.anIntArray55[local110] = local69.anInt4665;
							}
							local525++;
							local110--;
						}
						if (!local21[arg9 + 1 & 0x3]) {
							arg1[1] = Static678.aBooleanArrayArray9[local88][local514 + 3 & 0x3];
						}
					} else if (!local21[arg9 + 1 & 0x3]) {
						arg1[1] = Static243.aBooleanArrayArray6[local88][local514 + 3 & 0x3];
					}
				}
			}
		}
		if (arg7 == null) {
			return;
		}
		local56 = Static183.method3165(arg6, arg7);
		if (!arg7.aBoolean310) {
			return;
		}
		for (@Pc(1284) int local1284 = 0; local1284 < 8; local1284++) {
			@Pc(1295) int local1295 = local1284 - arg9 * 2 & 0x7;
			if (Static326.aBooleanArrayArray4[arg8][local1284] && arg7.anInt4665 >= Static46.anIntArray55[local1295]) {
				Static208.anIntArray183[local1295] = arg7.anInt4663;
				Static348.anIntArray333[local1295] = local56;
				Static311.anIntArray318[local1295] = arg7.anInt4676;
				Static93.anIntArray87[local1295] = arg7.anInt4679;
				if (arg7.anInt4665 == Static46.anIntArray55[local1295]) {
					Static382.anIntArray369[local1295] |= 0x2;
				} else {
					Static382.anIntArray369[local1295] = 2;
				}
				Static46.anIntArray55[local1295] = arg7.anInt4665;
			}
		}
		return;
	}
}
