import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!st")
public class Class15 {

	@OriginalMember(owner = "client!st", name = "l", descriptor = "[[[B")
	public byte[][][] aByteArrayArrayArray11;

	@OriginalMember(owner = "client!st", name = "m", descriptor = "[I")
	private final int[] anIntArray25 = new int[] { 0, 0, 0, 256, 512, 512, 512, 256, 256, 384, 128, 128, 256 };

	@OriginalMember(owner = "client!st", name = "w", descriptor = "[I")
	private final int[] anIntArray26 = new int[] { 0, 256, 512, 512, 512, 256, 0, 0, 128, 256, 128, 384, 256 };

	@OriginalMember(owner = "client!st", name = "z", descriptor = "Z")
	public final boolean aBoolean31;

	@OriginalMember(owner = "client!st", name = "u", descriptor = "Lclient!jb;")
	private final Class163 aClass163_4;

	@OriginalMember(owner = "client!st", name = "s", descriptor = "I")
	protected final int anInt342;

	@OriginalMember(owner = "client!st", name = "b", descriptor = "I")
	protected final int anInt332;

	@OriginalMember(owner = "client!st", name = "E", descriptor = "I")
	public final int anInt347;

	@OriginalMember(owner = "client!st", name = "q", descriptor = "Lclient!lh;")
	private final Class210 aClass210_4;

	@OriginalMember(owner = "client!st", name = "y", descriptor = "[[[B")
	private final byte[][][] aByteArrayArrayArray13;

	@OriginalMember(owner = "client!st", name = "d", descriptor = "[[[B")
	protected byte[][][] aByteArrayArrayArray9;

	@OriginalMember(owner = "client!st", name = "n", descriptor = "[[[I")
	public final int[][][] anIntArrayArrayArray2;

	@OriginalMember(owner = "client!st", name = "p", descriptor = "[[[B")
	private final byte[][][] aByteArrayArrayArray12;

	@OriginalMember(owner = "client!st", name = "k", descriptor = "[[[B")
	private final byte[][][] aByteArrayArrayArray10;

	@OriginalMember(owner = "client!st", name = "B", descriptor = "[[[B")
	private final byte[][][] aByteArrayArrayArray14;

	@OriginalMember(owner = "client!st", name = "<init>", descriptor = "(IIIZLclient!jb;Lclient!lh;)V")
	protected Class15(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) Class163 arg4, @OriginalArg(5) Class210 arg5) {
		this.aBoolean31 = arg3;
		this.aClass163_4 = arg4;
		this.anInt342 = arg1;
		this.anInt332 = arg2;
		this.anInt347 = arg0;
		this.aClass210_4 = arg5;
		this.aByteArrayArrayArray13 = new byte[this.anInt347][this.anInt342][this.anInt332];
		this.aByteArrayArrayArray9 = new byte[this.anInt347][this.anInt342 + 1][this.anInt332 + 1];
		this.anIntArrayArrayArray2 = new int[this.anInt347][this.anInt342 + 1][this.anInt332 + 1];
		this.aByteArrayArrayArray12 = new byte[this.anInt347][this.anInt342][this.anInt332];
		this.aByteArrayArrayArray10 = new byte[this.anInt347][this.anInt342][this.anInt332];
		this.aByteArrayArrayArray14 = new byte[this.anInt347][this.anInt342][this.anInt332];
	}

	@OriginalMember(owner = "client!st", name = "a", descriptor = "(IIILclient!ee;[Lclient!kb;II)V")
	public final void method380(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class5_Sub12 arg3, @OriginalArg(4) Class182[] arg4, @OriginalArg(6) int arg5) {
		@Pc(10) int local10;
		@Pc(18) int local18;
		@Pc(22) int local22;
		@Pc(28) int local28;
		if (!this.aBoolean31) {
			for (local10 = 0; local10 < 4; local10++) {
				@Pc(16) Class182 local16 = arg4[local10];
				for (local18 = 0; local18 < 64; local18++) {
					for (local22 = 0; local22 < 64; local22++) {
						local28 = local18 + arg1;
						@Pc(32) int local32 = local22 + arg5;
						if (local28 >= 0 && local28 < this.anInt342 && local32 >= 0 && local32 < this.anInt332) {
							local16.method4159(local28, local32);
						}
					}
				}
			}
		}
		local10 = arg2 + arg1;
		@Pc(90) int local90 = arg0 + arg5;
		for (local18 = 0; local18 < this.anInt347; local18++) {
			for (local22 = 0; local22 < 64; local22++) {
				for (local28 = 0; local28 < 64; local28++) {
					this.method392(0, 0, arg1 + local22, local22 + local10, arg3, local90 + local28, local18, local28 + arg5, 0, false);
				}
			}
		}
	}

	@OriginalMember(owner = "client!st", name = "a", descriptor = "(I[[[ILclient!ha;[Lclient!kb;)V")
	public final void method381(@OriginalArg(1) int[][][] arg0, @OriginalArg(2) Class126 arg1, @OriginalArg(3) Class182[] arg2) {
		@Pc(14) int local14;
		@Pc(18) int local18;
		@Pc(22) int local22;
		if (!this.aBoolean31) {
			for (local14 = 0; local14 < 4; local14++) {
				for (local18 = 0; local18 < this.anInt342; local18++) {
					for (local22 = 0; local22 < this.anInt332; local22++) {
						if ((Static480.aByteArrayArrayArray19[local14][local18][local22] & 0x1) != 0) {
							@Pc(36) int local36 = local14;
							if ((Static480.aByteArrayArrayArray19[1][local18][local22] & 0x2) != 0) {
								local36 = local14 - 1;
							}
							if (local36 >= 0) {
								arg2[local36].method4165(local18, local22);
							}
						}
					}
				}
			}
		}
		for (local14 = 0; local14 < this.anInt347; local14++) {
			local18 = 0;
			local22 = 0;
			if (!this.aBoolean31) {
				if (Static505.aBoolean502) {
					local22 = 8;
				}
				if (Static132.aBoolean176) {
					local18 = 2;
				}
				if (Static514.anInt8604 != 0) {
					if (Static595.aBoolean786 | local14 == 0) {
						local22 |= 0x10;
					}
					local18 |= 0x1;
				}
			}
			if (Static132.aBoolean176) {
				local22 |= 0x7;
			}
			if (!Static322.aBoolean469) {
				local22 |= 0x20;
			}
			@Pc(144) int[][] local144 = arg0 == null || local14 >= arg0.length ? this.anIntArrayArrayArray2[local14] : arg0[local14];
			Static408.method6249(local14, arg1.method7019(this.anInt342, this.anInt332, this.anIntArrayArrayArray2[local14], local144, local18, local22));
		}
	}

	@OriginalMember(owner = "client!st", name = "a", descriptor = "(IIIIII)V")
	public final void method383(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(11) int local11;
		for (@Pc(7) int local7 = arg4; local7 < arg4 + arg1; local7++) {
			for (local11 = arg3; local11 < arg3 + arg0; local11++) {
				if (local11 >= 0 && this.anInt342 > local11 && local7 >= 0 && local7 < this.anInt332) {
					this.anIntArrayArrayArray2[arg2][local11][local7] = arg2 <= 0 ? 0 : this.anIntArrayArrayArray2[arg2 - 1][local11][local7] - 960;
				}
			}
		}
		if (arg3 > 0 && arg3 < this.anInt342) {
			for (local11 = arg4 + 1; local11 < arg4 + arg1; local11++) {
				if (local11 >= 0 && local11 < this.anInt332) {
					this.anIntArrayArrayArray2[arg2][arg3][local11] = this.anIntArrayArrayArray2[arg2][arg3 - 1][local11];
				}
			}
		}
		if (arg4 > 0 && arg4 < this.anInt332) {
			for (local11 = arg3 + 1; local11 < arg0 + arg3; local11++) {
				if (local11 >= 0 && this.anInt342 > local11) {
					this.anIntArrayArrayArray2[arg2][local11][arg4] = this.anIntArrayArrayArray2[arg2][local11][arg4 - 1];
				}
			}
		}
		if (arg3 < 0 || arg4 < 0 || arg3 >= this.anInt342 || this.anInt332 <= arg4) {
			return;
		}
		if (arg2 != 0) {
			if (arg3 > 0 && this.anIntArrayArrayArray2[arg2 - 1][arg3 - 1][arg4] != this.anIntArrayArrayArray2[arg2][arg3 - 1][arg4]) {
				this.anIntArrayArrayArray2[arg2][arg3][arg4] = this.anIntArrayArrayArray2[arg2][arg3 - 1][arg4];
				return;
			}
			if (arg4 > 0 && this.anIntArrayArrayArray2[arg2 - 1][arg3][arg4 - 1] != this.anIntArrayArrayArray2[arg2][arg3][arg4 - 1]) {
				this.anIntArrayArrayArray2[arg2][arg3][arg4] = this.anIntArrayArrayArray2[arg2][arg3][arg4 - 1];
				return;
			}
			if (arg3 > 0 && arg4 > 0 && this.anIntArrayArrayArray2[arg2 - 1][arg3 - 1][arg4 - 1] != this.anIntArrayArrayArray2[arg2][arg3 - 1][arg4 - 1]) {
				this.anIntArrayArrayArray2[arg2][arg3][arg4] = this.anIntArrayArrayArray2[arg2][arg3 - 1][arg4 - 1];
				return;
			}
			return;
		}
		if (arg3 > 0 && this.anIntArrayArrayArray2[arg2][arg3 - 1][arg4] != 0) {
			this.anIntArrayArrayArray2[arg2][arg3][arg4] = this.anIntArrayArrayArray2[arg2][arg3 - 1][arg4];
			return;
		}
		if (arg4 > 0 && this.anIntArrayArrayArray2[arg2][arg3][arg4 - 1] != 0) {
			this.anIntArrayArrayArray2[arg2][arg3][arg4] = this.anIntArrayArrayArray2[arg2][arg3][arg4 - 1];
			return;
		}
		if (arg3 > 0 && arg4 > 0 && this.anIntArrayArrayArray2[arg2][arg3 - 1][arg4 - 1] != 0) {
			this.anIntArrayArrayArray2[arg2][arg3][arg4] = this.anIntArrayArrayArray2[arg2][arg3 - 1][arg4 - 1];
			return;
		}
	}

	@OriginalMember(owner = "client!st", name = "a", descriptor = "(IIBII[Lclient!kb;Lclient!ee;III)V")
	public final void method385(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class182[] arg4, @OriginalArg(6) Class5_Sub12 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(11) int local11 = (arg0 & 0x7) * 8;
		@Pc(17) int local17 = (arg7 & 0x7) * 8;
		@Pc(26) int local26;
		@Pc(59) int local59;
		if (!this.aBoolean31) {
			@Pc(24) Class182 local24 = arg4[arg6];
			for (local26 = 0; local26 < 8; local26++) {
				for (@Pc(30) int local30 = 0; local30 < 8; local30++) {
					@Pc(46) int local46 = Static104.method1521(arg2, local30 & 0x7, local26 & 0x7) + arg8;
					local59 = arg1 + Static333.method5157(local30 & 0x7, arg2, local26 & 0x7);
					if (local46 > 0 && this.anInt342 - 1 > local46 && local59 > 0 && this.anInt332 - 1 > local59) {
						local24.method4159(local46, local59);
					}
				}
			}
		}
		@Pc(106) int local106 = (arg0 & 0x1FFFFFF8) << 3;
		local26 = (arg7 & 0x1FFFFFF8) << 3;
		@Pc(114) byte local114 = 0;
		@Pc(116) byte local116 = 0;
		if (arg2 == 1) {
			local116 = 1;
		} else if (arg2 == 2) {
			local116 = 1;
			local114 = 1;
		} else if (arg2 == 3) {
			local114 = 1;
		}
		for (local59 = 0; local59 < this.anInt347; local59++) {
			for (@Pc(149) int local149 = 0; local149 < 64; local149++) {
				for (@Pc(153) int local153 = 0; local153 < 64; local153++) {
					if (local59 == arg3 && local11 <= local149 && local11 + 8 >= local149 && local153 >= local17 && local153 <= local17 + 8) {
						@Pc(224) int local224;
						@Pc(236) int local236;
						if (local11 + 8 == local149 || local17 + 8 == local153) {
							if (arg2 == 0) {
								local236 = local153 + arg1 - local17;
								local224 = local149 + arg8 - local11;
							} else if (arg2 == 1) {
								local224 = arg8 + local153 - local17;
								local236 = local11 + arg1 + 8 - local149;
							} else if (arg2 == 2) {
								local236 = local17 + arg1 + 8 - local153;
								local224 = arg8 + local11 + 8 - local149;
							} else {
								local236 = local149 + arg1 - local11;
								local224 = local17 + arg8 + 8 - local153;
							}
							this.method392(0, 0, local224, local149 + local106, arg5, local153 + local26, arg6, local236, 0, true);
						} else {
							local224 = arg8 + Static104.method1521(arg2, local153 & 0x7, local149 & 0x7);
							local236 = Static333.method5157(local153 & 0x7, arg2, local149 & 0x7) + arg1;
							this.method392(arg2, local116, local224, local149 + local106, arg5, local153 + local26, arg6, local236, local114, false);
						}
						if (local149 == 63 || local153 == 63) {
							@Pc(362) byte local362 = 1;
							if (local149 == 63 && local153 == 63) {
								local362 = 3;
							}
							for (@Pc(376) int local376 = 0; local376 < local362; local376++) {
								@Pc(380) int local380 = local149;
								@Pc(382) int local382 = local153;
								if (local376 == 0) {
									local382 = local153 == 63 ? 64 : local153;
									local380 = local149 == 63 ? 64 : local149;
								} else if (local376 == 1) {
									local380 = 64;
								} else if (local376 == 2) {
									local382 = 64;
								}
								@Pc(435) int local435;
								@Pc(443) int local443;
								if (arg2 == 0) {
									local443 = arg1 + local382 - local17;
									local435 = local380 + arg8 - local11;
								} else if (arg2 == 1) {
									local435 = arg8 + local382 - local17;
									local443 = arg1 + local11 + 8 - local380;
								} else if (arg2 == 2) {
									local443 = arg1 + local17 + 8 - local382;
									local435 = arg8 + local11 + 8 - local380;
								} else {
									local435 = local17 + arg8 + 8 - local382;
									local443 = local380 + arg1 - local11;
								}
								if (local435 >= 0 && local435 < this.anInt342 && local443 >= 0 && this.anInt332 > local443) {
									this.anIntArrayArrayArray2[arg6][local435][local443] = this.anIntArrayArrayArray2[arg6][local224 + local114][local116 + local236];
								}
							}
						}
					} else {
						this.method392(0, 0, -1, 0, arg5, 0, 0, -1, 0, false);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!st", name = "a", descriptor = "(ILclient!s;Lclient!s;ILclient!ha;[[ILclient!s;)V")
	private void method387(@OriginalArg(1) Class40 arg0, @OriginalArg(2) Class40 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class126 arg3, @OriginalArg(5) int[][] arg4, @OriginalArg(6) Class40 arg5) {
		@Pc(10) byte[][] local10 = this.aByteArrayArrayArray10[arg2];
		@Pc(15) byte[][] local15 = this.aByteArrayArrayArray13[arg2];
		@Pc(25) byte[][] local25 = this.aByteArrayArrayArray14[arg2];
		@Pc(30) byte[][] local30 = this.aByteArrayArrayArray12[arg2];
		for (@Pc(32) int local32 = 0; local32 < this.anInt342; local32++) {
			@Pc(46) int local46 = this.anInt342 - 1 > local32 ? local32 + 1 : local32;
			for (@Pc(48) int local48 = 0; local48 < this.anInt332; local48++) {
				@Pc(62) int local62 = this.anInt332 - 1 <= local48 ? local48 : local48 + 1;
				if (Static74.anInt1254 == -1 || Static179.method2902(local32, Static74.anInt1254, local48, arg2)) {
					@Pc(77) boolean local77 = false;
					@Pc(79) boolean local79 = false;
					@Pc(82) boolean[] local82 = new boolean[4];
					@Pc(88) int local88 = local10[local32][local48];
					@Pc(94) int local94 = local15[local32][local48];
					@Pc(102) int local102 = local30[local32][local48] & 0xFF;
					@Pc(110) int local110 = local25[local32][local48] & 0xFF;
					@Pc(118) int local118 = local25[local32][local62] & 0xFF;
					@Pc(126) int local126 = local25[local46][local62] & 0xFF;
					@Pc(134) int local134 = local25[local46][local48] & 0xFF;
					if (local102 != 0 || local110 != 0) {
						@Pc(155) Class164 local155 = local102 == 0 ? null : this.aClass163_4.method3884(local102 - 1);
						if (local88 == 0 && local155 == null) {
							local88 = 12;
						}
						@Pc(176) Class149 local176 = local110 == 0 ? null : this.aClass210_4.method4995(local110 - 1);
						@Pc(178) Class164 local178 = local155;
						if (local155 != null) {
							if (local155.anInt4242 == -1 && local155.anInt4236 == -1) {
								local178 = local155;
								local155 = null;
							} else if (local176 != null && local88 != 0) {
								local79 = local155.aBoolean345;
							}
						}
						@Pc(271) int local271;
						@Pc(307) int local307;
						@Pc(372) int local372;
						@Pc(382) int local382;
						if ((local88 == 0 || local88 == 12) && local32 > 0 && local48 > 0 && this.anInt342 > local32 && local48 < this.anInt332) {
							@Pc(250) int local250 = local110 == local25[local46][local62] ? 1 : -1;
							local271 = local25[local32 - 1][local48 - 1] == local110 ? 1 : -1;
							@Pc(290) int local290 = local25[local46][local48 - 1] == local110 ? 1 : -1;
							local307 = local25[local32 - 1][local62] == local110 ? 1 : -1;
							if (local25[local32][local48 - 1] == local110) {
								local290++;
								local271++;
							} else {
								local271--;
								local290--;
							}
							if (local25[local46][local48] == local110) {
								local250++;
								local290++;
							} else {
								local250--;
								local290--;
							}
							if (local110 == local25[local32][local62]) {
								local307++;
								local250++;
							} else {
								local250--;
								local307--;
							}
							if (local25[local32 - 1][local48] == local110) {
								local271++;
								local307++;
							} else {
								local271--;
								local307--;
							}
							local372 = local271 - local250;
							if (local372 < 0) {
								local372 = -local372;
							}
							local382 = local290 - local307;
							if (local382 < 0) {
								local382 = -local382;
							}
							if (local382 == local372) {
								local372 = arg5.method8442(local32, local48) - arg5.method8442(local46, local62);
								if (local372 < 0) {
									local372 = -local372;
								}
								local382 = arg5.method8442(local46, local48) - arg5.method8442(local32, local62);
								if (local382 < 0) {
									local382 = -local382;
								}
							}
							local94 = local382 > local372 ? 1 : 0;
						}
						for (local271 = 0; local271 < 13; local271++) {
							Static219.anIntArray307[local271] = -1;
							Static94.anIntArray823[local271] = 1;
						}
						@Pc(471) boolean[] local471 = local155 != null && local155.aBoolean345 ? Static47.aBooleanArrayArray2[local88] : Static11.aBooleanArrayArray1[local88];
						this.method394(local48, local82, local10, local32, local176, local155, local30, this.anInt332, local15, arg3, local88, this.anInt342, local94);
						@Pc(506) boolean local506 = local155 != null && local155.anInt4242 != local155.anInt4236;
						if (!local506) {
							for (local307 = 0; local307 < 8; local307++) {
								if (Static219.anIntArray307[local307] >= 0 && Static358.anIntArray645[local307] != Static70.anIntArray712[local307]) {
									local506 = true;
									break;
								}
							}
						}
						if (!local471[local94 + 1 & 0x3]) {
							local82[1] = Static474.method6919(local82[1], (Static94.anIntArray823[2] & Static94.anIntArray823[4]) == 0);
						}
						if (!local471[local94 + 3 & 0x3]) {
							local82[3] = Static474.method6919(local82[3], (Static94.anIntArray823[0] & Static94.anIntArray823[6]) == 0);
						}
						if (!local471[local94 & 0x3]) {
							local82[0] = Static474.method6919(local82[0], (Static94.anIntArray823[2] & Static94.anIntArray823[0]) == 0);
						}
						if (!local471[local94 + 2 & 0x3]) {
							local82[2] = Static474.method6919(local82[2], (Static94.anIntArray823[6] & Static94.anIntArray823[4]) == 0);
						}
						if (!local79 && (local88 == 0 || local88 == 12)) {
							if (local82[0] && !local82[1] && !local82[2] && local82[3]) {
								local94 = 0;
								local82[0] = local82[3] = false;
								local88 = local88 == 0 ? 13 : 14;
							} else if (local82[0] && local82[1] && !local82[2] && !local82[3]) {
								local82[0] = local82[1] = false;
								local94 = 3;
								local88 = local88 == 0 ? 13 : 14;
							} else if (!local82[0] && local82[1] && local82[2] && !local82[3]) {
								local94 = 2;
								local82[1] = local82[2] = false;
								local88 = local88 == 0 ? 13 : 14;
							} else if (!local82[0] && !local82[1] && local82[2] && local82[3]) {
								local94 = 1;
								local82[2] = local82[3] = false;
								local88 = local88 == 0 ? 13 : 14;
							}
						}
						@Pc(806) boolean local806 = !local79 && !local82[0] && !local82[2] && !local82[1] && !local82[3];
						@Pc(808) int[] local808 = null;
						@Pc(836) int[] local836;
						@Pc(844) int[] local844;
						@Pc(816) int[] local816;
						if (local806) {
							local836 = Static39.anIntArrayArray2[local88];
							local382 = local155 == null ? 0 : Static586.anIntArray773[local88];
							local844 = Static75.anIntArrayArray7[local88];
							local816 = Static65.anIntArrayArray6[local88];
							local372 = local176 == null ? 0 : Static241.anIntArray343[local88];
						} else if (local79) {
							local816 = Static543.anIntArrayArray65[local88];
							local372 = local176 == null ? 0 : Static231.anIntArray336[local88];
							local382 = local155 == null ? 0 : Static553.anIntArray705[local88];
							local836 = Static343.anIntArrayArray30[local88];
							local808 = Static204.anIntArrayArray17[local88];
							local844 = Static530.anIntArrayArray51[local88];
						} else {
							local836 = Static221.anIntArrayArray18[local88];
							local844 = Static365.anIntArrayArray32[local88];
							local382 = local155 == null ? 0 : Static386.anIntArray529[local88];
							local808 = Static39.anIntArrayArray1[local88];
							local816 = Static464.anIntArrayArray45[local88];
							local372 = local176 == null ? 0 : Class14_Sub1_Sub1_Sub5.lb[local88];
						}
						@Pc(910) int local910 = local382 + local372;
						if (local910 <= 0) {
							Static590.method8295(arg2, local32, local48);
						} else {
							if (local82[0]) {
								local910++;
							}
							if (local82[2]) {
								local910++;
							}
							if (local82[1]) {
								local910++;
							}
							if (local82[3]) {
								local910++;
							}
							@Pc(943) int local943 = 0;
							@Pc(945) int local945 = 0;
							@Pc(949) int local949 = local910 * 3;
							@Pc(956) int[] local956 = local506 ? new int[local949] : null;
							@Pc(959) int[] local959 = new int[local949];
							@Pc(962) int[] local962 = new int[local949];
							@Pc(965) int[] local965 = new int[local949];
							@Pc(968) int[] local968 = new int[local949];
							@Pc(971) int[] local971 = new int[local949];
							@Pc(978) int[] local978 = arg0 == null ? null : new int[local949];
							@Pc(987) int[] local987 = arg0 == null && arg1 == null ? null : new int[local949];
							@Pc(989) int local989 = -1;
							@Pc(991) int local991 = -1;
							@Pc(993) int local993 = 256;
							@Pc(1097) byte local1097;
							@Pc(1009) int local1009;
							@Pc(1011) int local1011;
							@Pc(1248) int local1248;
							@Pc(1254) int local1254;
							@Pc(1263) int local1263;
							@Pc(1268) int local1268;
							@Pc(1285) int local1285;
							@Pc(1273) int local1273;
							@Pc(1283) int local1283;
							@Pc(1344) int local1344;
							@Pc(1351) int local1351;
							if (local155 != null) {
								local991 = local155.anInt4238;
								local993 = local155.anInt4239;
								local989 = local155.anInt4242;
								local1009 = Static213.method3234(local155, arg3);
								for (local1011 = 0; local1011 < local382; local1011++) {
									if (local82[-local94 & 0x3] && local808[0] == local943) {
										Static28.anIntArray44[0] = local836[local943];
										Static28.anIntArray44[1] = 1;
										Static28.anIntArray44[2] = local816[local943];
										Static28.anIntArray44[3] = 1;
										Static28.anIntArray44[4] = local844[local943];
										local1097 = 6;
										Static28.anIntArray44[5] = local816[local943];
									} else if (local82[2 - local94 & 0x3] && local808[2] == local943) {
										Static28.anIntArray44[0] = local836[local943];
										Static28.anIntArray44[1] = 5;
										Static28.anIntArray44[2] = local816[local943];
										Static28.anIntArray44[3] = 5;
										Static28.anIntArray44[4] = local844[local943];
										Static28.anIntArray44[5] = local816[local943];
										local1097 = 6;
									} else if (local82[1 - local94 & 0x3] && local808[1] == local943) {
										Static28.anIntArray44[0] = local836[local943];
										Static28.anIntArray44[1] = 3;
										Static28.anIntArray44[2] = local816[local943];
										Static28.anIntArray44[3] = 3;
										Static28.anIntArray44[4] = local844[local943];
										Static28.anIntArray44[5] = local816[local943];
										local1097 = 6;
									} else if (local82[3 - local94 & 0x3] && local808[3] == local943) {
										Static28.anIntArray44[0] = local836[local943];
										Static28.anIntArray44[1] = 7;
										Static28.anIntArray44[2] = local816[local943];
										Static28.anIntArray44[3] = 7;
										Static28.anIntArray44[4] = local844[local943];
										local1097 = 6;
										Static28.anIntArray44[5] = local816[local943];
									} else {
										Static28.anIntArray44[0] = local836[local943];
										Static28.anIntArray44[1] = local844[local943];
										local1097 = 3;
										Static28.anIntArray44[2] = local816[local943];
									}
									local943++;
									for (local1248 = 0; local1248 < local1097; local1248++) {
										local1254 = Static28.anIntArray44[local1248];
										local1263 = local1254 - local94 * 2 & 0x7;
										local1268 = this.anIntArray26[local1254];
										local1273 = this.anIntArray25[local1254];
										if (local94 == 1) {
											local1283 = 512 - local1268;
											local1285 = local1273;
										} else if (local94 == 2) {
											local1285 = 512 - local1268;
											local1283 = 512 - local1273;
										} else if (local94 == 3) {
											local1283 = local1268;
											local1285 = 512 - local1273;
										} else {
											local1283 = local1273;
											local1285 = local1268;
										}
										local959[local945] = local1285;
										local962[local945] = local1283;
										if (local978 != null && Static451.aBooleanArrayArray9[local88][local1254]) {
											local1344 = (local32 << 9) + local1285;
											local1351 = (local48 << 9) + local1283;
											local978[local945] = arg0.method8447(local1344, local1351) - arg5.method8447(local1344, local1351);
										}
										if (local987 != null) {
											if (arg0 != null && !Static451.aBooleanArrayArray9[local88][local1254]) {
												local1344 = local1285 + (local32 << 9);
												local1351 = (local48 << 9) + local1283;
												local987[local945] = arg5.method8447(local1344, local1351) - arg0.method8447(local1344, local1351);
											} else if (arg1 != null && !Static563.aBooleanArrayArray16[local88][local1254]) {
												local1344 = (local32 << 9) + local1285;
												local1351 = local1283 + (local48 << 9);
												local987[local945] = arg1.method8447(local1344, local1351) - arg5.method8447(local1344, local1351);
											}
										}
										if (local1254 < 8 && local155.anInt4234 < Static219.anIntArray307[local1263]) {
											if (local956 != null) {
												local956[local945] = Static70.anIntArray712[local1263];
											}
											local971[local945] = Static293.anIntArray379[local1263];
											local968[local945] = Static254.anIntArray354[local1263];
											local965[local945] = Static358.anIntArray645[local1263];
										} else {
											if (local956 != null) {
												local956[local945] = local1009;
											}
											local968[local945] = local155.anInt4238;
											local971[local945] = local155.anInt4239;
											local965[local945] = local989;
										}
										local945++;
									}
								}
								if (!this.aBoolean31 && arg2 == 0) {
									Static467.method6871(local32, local48, local155.anInt4237, local155.anInt4230 * 8, local155.anInt4235);
								}
								if (local88 != 12 && local155.anInt4242 != -1 && local155.aBoolean344) {
									local77 = true;
								}
							} else if (local806) {
								local943 = Static586.anIntArray773[local88];
							} else if (local79) {
								local943 = Static553.anIntArray705[local88];
							} else {
								local943 = Static386.anIntArray529[local88];
							}
							if (local176 != null) {
								if (local126 == 0) {
									local126 = local110;
								}
								if (local134 == 0) {
									local134 = local110;
								}
								if (local118 == 0) {
									local118 = local110;
								}
								@Pc(1606) Class149 local1606 = this.aClass210_4.method4995(local110 - 1);
								@Pc(1614) Class149 local1614 = this.aClass210_4.method4995(local118 - 1);
								@Pc(1622) Class149 local1622 = this.aClass210_4.method4995(local126 - 1);
								@Pc(1630) Class149 local1630 = this.aClass210_4.method4995(local134 - 1);
								for (local1263 = 0; local1263 < local372; local1263++) {
									if (local82[-local94 & 0x3] && local808[0] == local943) {
										Static28.anIntArray44[0] = local836[local943];
										Static28.anIntArray44[1] = 1;
										Static28.anIntArray44[2] = local816[local943];
										Static28.anIntArray44[3] = 1;
										Static28.anIntArray44[4] = local844[local943];
										Static28.anIntArray44[5] = local816[local943];
										local1097 = 6;
									} else if (local82[2 - local94 & 0x3] && local808[2] == local943) {
										Static28.anIntArray44[0] = local836[local943];
										Static28.anIntArray44[1] = 5;
										Static28.anIntArray44[2] = local816[local943];
										Static28.anIntArray44[3] = 5;
										Static28.anIntArray44[4] = local844[local943];
										local1097 = 6;
										Static28.anIntArray44[5] = local816[local943];
									} else if (local82[1 - local94 & 0x3] && local943 == local808[1]) {
										Static28.anIntArray44[0] = local836[local943];
										Static28.anIntArray44[1] = 3;
										Static28.anIntArray44[2] = local816[local943];
										Static28.anIntArray44[3] = 3;
										Static28.anIntArray44[4] = local844[local943];
										local1097 = 6;
										Static28.anIntArray44[5] = local816[local943];
									} else if (local82[3 - local94 & 0x3] && local808[3] == local943) {
										Static28.anIntArray44[0] = local836[local943];
										Static28.anIntArray44[1] = 7;
										Static28.anIntArray44[2] = local816[local943];
										Static28.anIntArray44[3] = 7;
										Static28.anIntArray44[4] = local844[local943];
										local1097 = 6;
										Static28.anIntArray44[5] = local816[local943];
									} else {
										Static28.anIntArray44[0] = local836[local943];
										Static28.anIntArray44[1] = local844[local943];
										Static28.anIntArray44[2] = local816[local943];
										local1097 = 3;
									}
									local943++;
									for (local1268 = 0; local1268 < local1097; local1268++) {
										local1285 = Static28.anIntArray44[local1268];
										local1273 = local1285 - local94 * 2 & 0x7;
										local1283 = this.anIntArray26[local1285];
										local1351 = this.anIntArray25[local1285];
										@Pc(1909) int local1909;
										if (local94 == 1) {
											local1909 = 512 - local1283;
											local1344 = local1351;
										} else if (local94 == 2) {
											local1344 = 512 - local1283;
											local1909 = 512 - local1351;
										} else if (local94 == 3) {
											local1344 = 512 - local1351;
											local1909 = local1283;
										} else {
											local1909 = local1351;
											local1344 = local1283;
										}
										local959[local945] = local1344;
										local962[local945] = local1909;
										@Pc(1959) int local1959;
										@Pc(1965) int local1965;
										if (local978 != null && Static451.aBooleanArrayArray9[local88][local1285]) {
											local1959 = (local32 << 9) + local1344;
											local1965 = local1909 + (local48 << 9);
											local978[local945] = arg0.method8447(local1959, local1965) - arg5.method8447(local1959, local1965);
										}
										if (local987 != null) {
											if (arg0 != null && !Static451.aBooleanArrayArray9[local88][local1285]) {
												local1959 = (local32 << 9) + local1344;
												local1965 = local1909 + (local48 << 9);
												local987[local945] = arg5.method8447(local1959, local1965) - arg0.method8447(local1959, local1965);
											} else if (arg1 != null && !Static563.aBooleanArrayArray16[local88][local1285]) {
												local1959 = (local32 << 9) + local1344;
												local1965 = local1909 + (local48 << 9);
												local987[local945] = arg1.method8447(local1959, local1965) - arg5.method8447(local1959, local1965);
											}
										}
										if (local1285 < 8 && Static219.anIntArray307[local1273] >= 0) {
											if (local956 != null) {
												local956[local945] = Static70.anIntArray712[local1273];
											}
											local971[local945] = Static293.anIntArray379[local1273];
											local968[local945] = Static254.anIntArray354[local1273];
											local965[local945] = Static358.anIntArray645[local1273];
										} else {
											if (local79 && Static451.aBooleanArrayArray9[local88][local1285]) {
												local968[local945] = local991;
												local971[local945] = local993;
												local965[local945] = local989;
											} else if (local1344 == 0 && local1909 == 0) {
												local965[local945] = arg4[local32][local48];
												local968[local945] = local1606.anInt3884;
												local971[local945] = local1606.anInt3895;
											} else if (local1344 == 0 && local1909 == 512) {
												local965[local945] = arg4[local32][local62];
												local968[local945] = local1614.anInt3884;
												local971[local945] = local1614.anInt3895;
											} else if (local1344 == 512 && local1909 == 512) {
												local965[local945] = arg4[local46][local62];
												local968[local945] = local1622.anInt3884;
												local971[local945] = local1622.anInt3895;
											} else if (local1344 == 512 && local1909 == 0) {
												local965[local945] = arg4[local46][local48];
												local968[local945] = local1630.anInt3884;
												local971[local945] = local1630.anInt3895;
											} else {
												if (local1344 >= 256) {
													if (local1909 < 256) {
														local968[local945] = local1630.anInt3884;
														local971[local945] = local1630.anInt3895;
													} else {
														local968[local945] = local1622.anInt3884;
														local971[local945] = local1622.anInt3895;
													}
												} else if (local1909 >= 256) {
													local968[local945] = local1614.anInt3884;
													local971[local945] = local1614.anInt3895;
												} else {
													local968[local945] = local1606.anInt3884;
													local971[local945] = local1606.anInt3895;
												}
												local1959 = Static30.method611(arg4[local32][local48], local1344 << 7 >> 9, arg4[local46][local48]);
												local1965 = Static30.method611(arg4[local32][local62], local1344 << 7 >> 9, arg4[local46][local62]);
												local965[local945] = Static30.method611(local1959, local1909 << 7 >> 9, local1965);
											}
											if (local956 != null) {
												local956[local945] = local965[local945];
											}
										}
										local945++;
									}
								}
								if (local88 != 0 && local176.aBoolean315) {
									local77 = true;
								}
							}
							local1009 = arg5.method8442(local32, local48);
							local1011 = arg5.method8442(local46, local48);
							local1248 = arg5.method8442(local46, local62);
							local1254 = arg5.method8442(local32, local62);
							@Pc(2396) boolean local2396 = Static353.method5596(local32, local48);
							if (local2396 && arg2 > 1 || !local2396 && arg2 > 0) {
								@Pc(2409) boolean local2409 = true;
								if (local176 != null && !local176.aBoolean314) {
									local2409 = false;
								} else if (local110 == 0 && local88 != 0) {
									local2409 = false;
								} else if (local102 > 0 && local178 != null && !local178.aBoolean342) {
									local2409 = false;
								}
								if (local2409 && local1009 == local1011 && local1009 == local1248 && local1254 == local1009) {
									this.aByteArrayArrayArray9[arg2][local32][local48] = (byte) (this.aByteArrayArrayArray9[arg2][local32][local48] | 0x4);
								}
							}
							local1268 = 0;
							local1285 = 0;
							local1273 = 0;
							if (this.aBoolean31) {
								local1268 = Static649.method8909(local32, local48);
								local1285 = Static40.method722(local32, local48);
								local1273 = Static585.method8205(local32, local48);
							}
							arg5.U(local32, local48, local959, local978, local962, local987, local965, local956, local968, local971, local1268, local1285, local1273, local77);
							Static590.method8295(arg2, local32, local48);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!st", name = "a", descriptor = "(BIIII)V")
	public final void method388(@OriginalArg(1) int arg0, @OriginalArg(3) int arg1) {
		for (@Pc(3) int local3 = 0; local3 < this.anInt347; local3++) {
			this.method383(64, 64, local3, arg1, arg0);
		}
	}

	@OriginalMember(owner = "client!st", name = "a", descriptor = "([[IIB)V")
	public final void method390(@OriginalArg(0) int[][] arg0) {
		@Pc(16) int[][] local16 = this.anIntArrayArrayArray2[0];
		for (@Pc(18) int local18 = 0; local18 < this.anInt342 + 1; local18++) {
			for (@Pc(22) int local22 = 0; local22 < this.anInt332 + 1; local22++) {
				local16[local18][local22] += arg0[local18][local22];
			}
		}
	}

	@OriginalMember(owner = "client!st", name = "a", descriptor = "(Lclient!s;BLclient!ha;Lclient!s;)V")
	public final void method391(@OriginalArg(0) Class40 arg0, @OriginalArg(2) Class126 arg1, @OriginalArg(3) Class40 arg2) {
		@Pc(11) int[][] local11 = new int[this.anInt342][this.anInt332];
		if (Static366.anIntArray505 == null || this.anInt332 != Static366.anIntArray505.length) {
			Static366.anIntArray505 = new int[this.anInt332];
			Static279.anIntArray374 = new int[this.anInt332];
			Static222.anIntArray315 = new int[this.anInt332];
			Static26.anIntArray38 = new int[this.anInt332];
			Static560.anIntArray710 = new int[this.anInt332];
		}
		@Pc(44) int local44;
		for (@Pc(40) int local40 = 0; local40 < this.anInt347; local40++) {
			for (local44 = 0; local44 < this.anInt332; local44++) {
				Static366.anIntArray505[local44] = 0;
				Static222.anIntArray315[local44] = 0;
				Static279.anIntArray374[local44] = 0;
				Static560.anIntArray710[local44] = 0;
				Static26.anIntArray38[local44] = 0;
			}
			for (@Pc(77) int local77 = -5; local77 < this.anInt342; local77++) {
				@Pc(87) int local87;
				@Pc(106) int local106;
				@Pc(172) int local172;
				for (@Pc(81) int local81 = 0; local81 < this.anInt332; local81++) {
					local87 = local77 + 5;
					@Pc(152) int local152;
					if (local87 < this.anInt342) {
						local106 = this.aByteArrayArrayArray14[local40][local87][local81] & 0xFF;
						if (local106 > 0) {
							@Pc(116) Class149 local116 = this.aClass210_4.method4995(local106 - 1);
							Static366.anIntArray505[local81] += local116.anInt3889;
							Static222.anIntArray315[local81] += local116.anInt3886;
							Static279.anIntArray374[local81] += local116.anInt3897;
							Static560.anIntArray710[local81] += local116.anInt3893;
							local152 = Static26.anIntArray38[local81]++;
						}
					}
					local106 = local77 - 5;
					if (local106 >= 0) {
						local172 = this.aByteArrayArrayArray14[local40][local106][local81] & 0xFF;
						if (local172 > 0) {
							@Pc(182) Class149 local182 = this.aClass210_4.method4995(local172 - 1);
							Static366.anIntArray505[local81] -= local182.anInt3889;
							Static222.anIntArray315[local81] -= local182.anInt3886;
							Static279.anIntArray374[local81] -= local182.anInt3897;
							Static560.anIntArray710[local81] -= local182.anInt3893;
							local152 = Static26.anIntArray38[local81]--;
						}
					}
				}
				if (local77 >= 0) {
					local87 = 0;
					local106 = 0;
					local172 = 0;
					@Pc(239) int local239 = 0;
					@Pc(241) int local241 = 0;
					for (@Pc(243) int local243 = -5; local243 < this.anInt332; local243++) {
						@Pc(249) int local249 = local243 + 5;
						if (local249 < this.anInt332) {
							local106 += Static222.anIntArray315[local249];
							local87 += Static366.anIntArray505[local249];
							local241 += Static26.anIntArray38[local249];
							local239 += Static560.anIntArray710[local249];
							local172 += Static279.anIntArray374[local249];
						}
						@Pc(287) int local287 = local243 - 5;
						if (local287 >= 0) {
							local241 -= Static26.anIntArray38[local287];
							local87 -= Static366.anIntArray505[local287];
							local172 -= Static279.anIntArray374[local287];
							local106 -= Static222.anIntArray315[local287];
							local239 -= Static560.anIntArray710[local287];
						}
						if (local243 >= 0 && local239 > 0 && local241 > 0) {
							local11[local77][local243] = Static86.method1349(local172 / local241, local87 * 256 / local239, local106 / local241);
						}
					}
				}
			}
			if (Static584.aBoolean769) {
				this.method387(local40 == 0 ? arg0 : null, local40 == 0 ? arg2 : null, local40, arg1, local11, Static299.aClass40Array1[local40]);
			} else {
				this.method393(local40 == 0 ? arg0 : null, arg1, local40 == 0 ? arg2 : null, local11, Static299.aClass40Array1[local40], local40);
			}
			this.aByteArrayArrayArray14[local40] = null;
			this.aByteArrayArrayArray12[local40] = null;
			this.aByteArrayArrayArray10[local40] = null;
			this.aByteArrayArrayArray13[local40] = null;
		}
		if (!this.aBoolean31) {
			if (Static514.anInt8604 != 0) {
				Static401.method7259();
			}
			if (Static132.aBoolean176) {
				Static463.method6866();
			}
		}
		for (local44 = 0; local44 < this.anInt347; local44++) {
			Static299.aClass40Array1[local44].YA();
		}
	}

	@OriginalMember(owner = "client!st", name = "a", descriptor = "(IIIILclient!ee;IIIZIZ)V")
	private void method392(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class5_Sub12 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) boolean arg9) {
		if (arg0 == 1) {
			arg1 = 1;
		} else if (arg0 == 2) {
			arg8 = 1;
			arg1 = 1;
		} else if (arg0 == 3) {
			arg8 = 1;
		}
		@Pc(51) int local51;
		if (arg2 < 0 || this.anInt342 <= arg2 || arg7 < 0 || this.anInt332 <= arg7) {
			while (true) {
				local51 = arg4.method8645();
				if (local51 == 0) {
					break;
				}
				if (local51 == 1) {
					arg4.method8645();
					break;
				}
				if (local51 <= 49) {
					arg4.method8645();
				}
			}
			return;
		}
		if (!this.aBoolean31 && !arg9) {
			Static480.aByteArrayArrayArray19[arg6][arg2][arg7] = 0;
		}
		while (true) {
			local51 = arg4.method8645();
			if (local51 == 0) {
				if (this.aBoolean31) {
					this.anIntArrayArrayArray2[0][arg2 + arg8][arg7 + arg1] = 0;
				} else if (arg6 == 0) {
					this.anIntArrayArrayArray2[0][arg8 + arg2][arg1 + arg7] = -Static109.method1601(arg5 + 556238, arg3 + 932731) * 8 << 2;
				} else {
					this.anIntArrayArrayArray2[arg6][arg2 + arg8][arg7 + arg1] = this.anIntArrayArrayArray2[arg6 - 1][arg2 + arg8][arg7 + arg1] - 960;
				}
				break;
			}
			if (local51 == 1) {
				@Pc(189) int local189 = arg4.method8645();
				if (this.aBoolean31) {
					this.anIntArrayArrayArray2[0][arg8 + arg2][arg7 + arg1] = local189 * 8 << 2;
				} else {
					if (local189 == 1) {
						local189 = 0;
					}
					if (arg6 == 0) {
						this.anIntArrayArrayArray2[0][arg2 + arg8][arg1 + arg7] = -local189 * 8 << 2;
					} else {
						this.anIntArrayArrayArray2[arg6][arg8 + arg2][arg1 + arg7] = this.anIntArrayArrayArray2[arg6 - 1][arg2 + arg8][arg1 + arg7] - (local189 * 8 << 2);
					}
				}
				break;
			}
			if (local51 <= 49) {
				if (arg9) {
					arg4.method8645();
				} else {
					this.aByteArrayArrayArray12[arg6][arg2][arg7] = arg4.method8635();
					this.aByteArrayArrayArray10[arg6][arg2][arg7] = (byte) ((local51 - 2) / 4);
					this.aByteArrayArrayArray13[arg6][arg2][arg7] = (byte) (local51 + arg0 - 2 & 0x3);
				}
			} else if (local51 <= 81) {
				if (!this.aBoolean31 && !arg9) {
					Static480.aByteArrayArrayArray19[arg6][arg2][arg7] = (byte) (local51 - 49);
				}
			} else if (!arg9) {
				this.aByteArrayArrayArray14[arg6][arg2][arg7] = (byte) (local51 - 81);
			}
		}
	}

	@OriginalMember(owner = "client!st", name = "a", descriptor = "(Lclient!s;Lclient!ha;Lclient!s;[[IILclient!s;I)V")
	private void method393(@OriginalArg(0) Class40 arg0, @OriginalArg(1) Class126 arg1, @OriginalArg(2) Class40 arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) Class40 arg4, @OriginalArg(6) int arg5) {
		for (@Pc(3) int local3 = 0; local3 < this.anInt342; local3++) {
			for (@Pc(13) int local13 = 0; local13 < this.anInt332; local13++) {
				if (Static74.anInt1254 == -1 || Static179.method2902(local3, Static74.anInt1254, local13, arg5)) {
					@Pc(36) byte local36 = this.aByteArrayArrayArray10[arg5][local3][local13];
					@Pc(45) byte local45 = this.aByteArrayArrayArray13[arg5][local3][local13];
					@Pc(56) int local56 = this.aByteArrayArrayArray12[arg5][local3][local13] & 0xFF;
					@Pc(67) int local67 = this.aByteArrayArrayArray14[arg5][local3][local13] & 0xFF;
					@Pc(82) Class164 local82 = local56 == 0 ? null : this.aClass163_4.method3884(local56 - 1);
					@Pc(94) Class149 local94 = local67 == 0 ? null : this.aClass210_4.method4995(local67 - 1);
					if (local36 == 0 && local82 == null) {
						local36 = 12;
					}
					@Pc(105) Class164 local105 = local82;
					if (local82 != null && local82.anInt4242 == -1 && local82.anInt4236 == -1) {
						local105 = local82;
						local82 = null;
					}
					if (local82 != null || local94 != null) {
						@Pc(129) int local129 = Static241.anIntArray343[local36];
						@Pc(133) int local133 = Static586.anIntArray773[local36];
						@Pc(145) int local145 = (local94 == null ? 0 : local129) + (local82 == null ? 0 : local133);
						@Pc(147) int local147 = 0;
						@Pc(149) int local149 = 0;
						@Pc(156) int local156 = local82 == null ? -1 : local82.anInt4238;
						@Pc(163) int local163 = local94 == null ? -1 : local94.anInt3884;
						@Pc(166) int[] local166 = new int[local145];
						@Pc(169) int[] local169 = new int[local145];
						@Pc(172) int[] local172 = new int[local145];
						@Pc(175) int[] local175 = new int[local145];
						@Pc(178) int[] local178 = new int[local145];
						@Pc(181) int[] local181 = new int[local145];
						@Pc(193) int[] local193 = local82 == null || local82.anInt4236 == -1 ? null : new int[local145];
						@Pc(203) int local203;
						if (local82 == null) {
							local149 = local133;
						} else {
							for (local203 = 0; local203 < local133; local203++) {
								local166[local147] = Static39.anIntArrayArray2[local36][local149];
								local169[local147] = Static75.anIntArrayArray7[local36][local149];
								local172[local147] = Static65.anIntArrayArray6[local36][local149];
								local178[local147] = local156;
								local181[local147] = local82.anInt4239;
								local175[local147] = local82.anInt4242;
								if (local193 != null) {
									local193[local147] = local82.anInt4236;
								}
								local149++;
								local147++;
							}
							if (!this.aBoolean31 && arg5 == 0) {
								Static467.method6871(local3, local13, local82.anInt4237, local82.anInt4230 * 8, local82.anInt4235);
							}
						}
						if (local94 != null) {
							for (local203 = 0; local203 < local129; local203++) {
								local166[local147] = Static39.anIntArrayArray2[local36][local149];
								local169[local147] = Static75.anIntArrayArray7[local36][local149];
								local172[local147] = Static65.anIntArrayArray6[local36][local149];
								local178[local147] = local163;
								local181[local147] = local94.anInt3895;
								local175[local147] = arg3[local3][local13];
								if (local193 != null) {
									local193[local147] = local175[local147];
								}
								local149++;
								local147++;
							}
						}
						local203 = this.anIntArray26.length;
						@Pc(344) int[] local344 = new int[local203];
						@Pc(347) int[] local347 = new int[local203];
						@Pc(354) int[] local354 = arg0 == null ? null : new int[local203];
						@Pc(363) int[] local363 = arg0 == null && arg2 == null ? null : new int[local203];
						@Pc(372) int local372;
						@Pc(377) int local377;
						@Pc(461) int local461;
						@Pc(469) int local469;
						for (@Pc(365) int local365 = 0; local365 < local203; local365++) {
							local372 = this.anIntArray26[local365];
							local377 = this.anIntArray25[local365];
							if (local45 == 0) {
								local344[local365] = local372;
								local347[local365] = local377;
							} else if (local45 == 1) {
								local344[local365] = local377;
								local347[local365] = 512 - local372;
							} else if (local45 == 2) {
								local344[local365] = 512 - local372;
								local347[local365] = 512 - local377;
							} else if (local45 == 3) {
								local344[local365] = 512 - local377;
								local347[local365] = local372;
							}
							if (local354 != null && Static451.aBooleanArrayArray9[local36][local365]) {
								local461 = (local3 << 9) + local344[local365];
								local469 = (local13 << 9) + local347[local365];
								local354[local365] = arg0.method8447(local461, local469) - arg4.method8447(local461, local469);
							}
							if (local363 != null) {
								if (arg0 != null && !Static451.aBooleanArrayArray9[local36][local365]) {
									local461 = (local3 << 9) + local344[local365];
									local469 = (local13 << 9) + local347[local365];
									local363[local365] = arg4.method8447(local461, local469) - arg0.method8447(local461, local469);
								} else if (arg2 != null && !Static563.aBooleanArrayArray16[local36][local365]) {
									local461 = local344[local365] + (local3 << 9);
									local469 = (local13 << 9) + local347[local365];
									local363[local365] = arg2.method8447(local461, local469) - arg4.method8447(local461, local469);
								}
							}
						}
						local372 = arg4.method8442(local3, local13);
						local377 = arg4.method8442(local3 + 1, local13);
						local461 = arg4.method8442(local3 + 1, local13 + 1);
						local469 = arg4.method8442(local3, local13 + 1);
						@Pc(611) boolean local611 = Static353.method5596(local3, local13);
						if (local611 && arg5 > 1 || !local611 && arg5 > 0) {
							@Pc(625) boolean local625 = true;
							if (local94 != null && !local94.aBoolean314) {
								local625 = false;
							} else if (local67 == 0 && local36 != 0) {
								local625 = false;
							} else if (local56 > 0 && local105 != null && !local105.aBoolean342) {
								local625 = false;
							}
							if (local625 && local377 == local372 && local372 == local461 && local469 == local372) {
								this.aByteArrayArrayArray9[arg5][local3][local13] = (byte) (this.aByteArrayArrayArray9[arg5][local3][local13] | 0x4);
							}
						}
						@Pc(691) int local691 = 0;
						@Pc(693) int local693 = 0;
						@Pc(695) int local695 = 0;
						if (this.aBoolean31) {
							local691 = Static649.method8909(local3, local13);
							local693 = Static40.method722(local3, local13);
							local695 = Static585.method8205(local3, local13);
						}
						arg4.method8437(local3, local13, local344, local354, local347, local363, local166, local169, local172, local175, local193, local178, local181, local691, local693, local695);
						Static590.method8295(arg5, local3, local13);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!st", name = "a", descriptor = "(I[Z[[BILclient!ib;Lclient!jba;[[BI[[BLclient!ha;IIII)V")
	private void method394(@OriginalArg(0) int arg0, @OriginalArg(1) boolean[] arg1, @OriginalArg(2) byte[][] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class149 arg4, @OriginalArg(5) Class164 arg5, @OriginalArg(6) byte[][] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) byte[][] arg8, @OriginalArg(9) Class126 arg9, @OriginalArg(10) int arg10, @OriginalArg(12) int arg11, @OriginalArg(13) int arg12) {
		@Pc(18) boolean[] local18 = arg5 != null && arg5.aBoolean345 ? Static47.aBooleanArrayArray2[arg10] : Static11.aBooleanArrayArray1[arg10];
		@Pc(40) int local40;
		@Pc(53) Class164 local53;
		@Pc(70) byte local70;
		@Pc(86) int local86;
		@Pc(91) int local91;
		if (arg0 > 0) {
			if (arg3 > 0) {
				local40 = arg6[arg3 - 1][arg0 - 1] & 0xFF;
				if (local40 > 0) {
					local53 = this.aClass163_4.method3884(local40 - 1);
					if (local53.anInt4242 != -1 && local53.aBoolean345) {
						local70 = arg2[arg3 - 1][arg0 - 1];
						local86 = arg8[arg3 - 1][arg0 - 1] * 2 + 4 & 0x7;
						local91 = Static213.method3234(local53, arg9);
						if (Static451.aBooleanArrayArray9[local70][local86]) {
							Static358.anIntArray645[0] = local53.anInt4242;
							Static70.anIntArray712[0] = local91;
							Static254.anIntArray354[0] = local53.anInt4238;
							Static293.anIntArray379[0] = local53.anInt4239;
							Static219.anIntArray307[0] = local53.anInt4234;
							Static94.anIntArray823[0] = 256;
						}
					}
				}
			}
			if (arg11 - 1 > arg3) {
				local40 = arg6[arg3 + 1][arg0 - 1] & 0xFF;
				if (local40 > 0) {
					local53 = this.aClass163_4.method3884(local40 - 1);
					if (local53.anInt4242 != -1 && local53.aBoolean345) {
						local70 = arg2[arg3 + 1][arg0 - 1];
						local86 = arg8[arg3 + 1][arg0 - 1] * 2 + 6 & 0x7;
						local91 = Static213.method3234(local53, arg9);
						if (Static451.aBooleanArrayArray9[local70][local86]) {
							Static358.anIntArray645[2] = local53.anInt4242;
							Static70.anIntArray712[2] = local91;
							Static254.anIntArray354[2] = local53.anInt4238;
							Static293.anIntArray379[2] = local53.anInt4239;
							Static219.anIntArray307[2] = local53.anInt4234;
							Static94.anIntArray823[2] = 512;
						}
					}
				}
			}
		}
		if (arg0 < arg7 - 1) {
			if (arg3 > 0) {
				local40 = arg6[arg3 - 1][arg0 + 1] & 0xFF;
				if (local40 > 0) {
					local53 = this.aClass163_4.method3884(local40 - 1);
					if (local53.anInt4242 != -1 && local53.aBoolean345) {
						local70 = arg2[arg3 - 1][arg0 + 1];
						local86 = arg8[arg3 - 1][arg0 + 1] * 2 + 2 & 0x7;
						local91 = Static213.method3234(local53, arg9);
						if (Static451.aBooleanArrayArray9[local70][local86]) {
							Static358.anIntArray645[6] = local53.anInt4242;
							Static70.anIntArray712[6] = local91;
							Static254.anIntArray354[6] = local53.anInt4238;
							Static293.anIntArray379[6] = local53.anInt4239;
							Static219.anIntArray307[6] = local53.anInt4234;
							Static94.anIntArray823[6] = 64;
						}
					}
				}
			}
			if (arg11 - 1 > arg3) {
				local40 = arg6[arg3 + 1][arg0 + 1] & 0xFF;
				if (local40 > 0) {
					local53 = this.aClass163_4.method3884(local40 - 1);
					if (local53.anInt4242 != -1 && local53.aBoolean345) {
						local70 = arg2[arg3 + 1][arg0 + 1];
						local86 = arg8[arg3 + 1][arg0 + 1] * 2 & 0x7;
						local91 = Static213.method3234(local53, arg9);
						if (Static451.aBooleanArrayArray9[local70][local86]) {
							Static358.anIntArray645[4] = local53.anInt4242;
							Static70.anIntArray712[4] = local91;
							Static254.anIntArray354[4] = local53.anInt4238;
							Static293.anIntArray379[4] = local53.anInt4239;
							Static219.anIntArray307[4] = local53.anInt4234;
							Static94.anIntArray823[4] = 128;
						}
					}
				}
			}
		}
		@Pc(498) int local498;
		@Pc(503) int local503;
		@Pc(505) int local505;
		@Pc(486) byte local486;
		if (arg0 > 0) {
			local40 = arg6[arg3][arg0 - 1] & 0xFF;
			if (local40 > 0) {
				local53 = this.aClass163_4.method3884(local40 - 1);
				if (local53.anInt4242 != -1) {
					local70 = arg2[arg3][arg0 - 1];
					local486 = arg8[arg3][arg0 - 1];
					if (local53.aBoolean345) {
						local91 = 2;
						local498 = local486 * 2 + 4;
						local503 = Static213.method3234(local53, arg9);
						for (local505 = 0; local505 < 3; local505++) {
							local91 &= 0x7;
							local498 &= 0x7;
							if (Static451.aBooleanArrayArray9[local70][local498] && Static219.anIntArray307[local91] <= local53.anInt4234) {
								Static358.anIntArray645[local91] = local53.anInt4242;
								Static70.anIntArray712[local91] = local503;
								Static254.anIntArray354[local91] = local53.anInt4238;
								Static293.anIntArray379[local91] = local53.anInt4239;
								if (Static219.anIntArray307[local91] == local53.anInt4234) {
									Static94.anIntArray823[local91] |= 0x20;
								} else {
									Static94.anIntArray823[local91] = 32;
								}
								Static219.anIntArray307[local91] = local53.anInt4234;
							}
							local91--;
							local498++;
						}
						if (!local18[arg12 & 0x3]) {
							arg1[0] = Static47.aBooleanArrayArray2[local70][local486 + 2 & 0x3];
						}
					} else if (!local18[arg12 & 0x3]) {
						arg1[0] = Static11.aBooleanArrayArray1[local70][local486 + 2 & 0x3];
					}
				}
			}
		}
		if (arg7 - 1 > arg0) {
			local40 = arg6[arg3][arg0 + 1] & 0xFF;
			if (local40 > 0) {
				local53 = this.aClass163_4.method3884(local40 - 1);
				if (local53.anInt4242 != -1) {
					local70 = arg2[arg3][arg0 + 1];
					local486 = arg8[arg3][arg0 + 1];
					if (local53.aBoolean345) {
						local91 = 4;
						local498 = local486 * 2 + 2;
						local503 = Static213.method3234(local53, arg9);
						for (local505 = 0; local505 < 3; local505++) {
							local498 &= 0x7;
							local91 &= 0x7;
							if (Static451.aBooleanArrayArray9[local70][local498] && Static219.anIntArray307[local91] <= local53.anInt4234) {
								Static358.anIntArray645[local91] = local53.anInt4242;
								Static70.anIntArray712[local91] = local503;
								Static254.anIntArray354[local91] = local53.anInt4238;
								Static293.anIntArray379[local91] = local53.anInt4239;
								if (local53.anInt4234 == Static219.anIntArray307[local91]) {
									Static94.anIntArray823[local91] |= 0x10;
								} else {
									Static94.anIntArray823[local91] = 16;
								}
								Static219.anIntArray307[local91] = local53.anInt4234;
							}
							local498--;
							local91++;
						}
						if (!local18[arg12 + 2 & 0x3]) {
							arg1[2] = Static47.aBooleanArrayArray2[local70][local486 & 0x3];
						}
					} else if (!local18[arg12 + 2 & 0x3]) {
						arg1[2] = Static11.aBooleanArrayArray1[local70][local486 & 0x3];
					}
				}
			}
		}
		if (arg3 > 0) {
			local40 = arg6[arg3 - 1][arg0] & 0xFF;
			if (local40 > 0) {
				local53 = this.aClass163_4.method3884(local40 - 1);
				if (local53.anInt4242 != -1) {
					local70 = arg2[arg3 - 1][arg0];
					local486 = arg8[arg3 - 1][arg0];
					if (local53.aBoolean345) {
						local91 = 6;
						local498 = local486 * 2 + 4;
						local503 = Static213.method3234(local53, arg9);
						for (local505 = 0; local505 < 3; local505++) {
							local498 &= 0x7;
							local91 &= 0x7;
							if (Static451.aBooleanArrayArray9[local70][local498] && Static219.anIntArray307[local91] <= local53.anInt4234) {
								Static358.anIntArray645[local91] = local53.anInt4242;
								Static70.anIntArray712[local91] = local503;
								Static254.anIntArray354[local91] = local53.anInt4238;
								Static293.anIntArray379[local91] = local53.anInt4239;
								if (Static219.anIntArray307[local91] == local53.anInt4234) {
									Static94.anIntArray823[local91] |= 0x8;
								} else {
									Static94.anIntArray823[local91] = 8;
								}
								Static219.anIntArray307[local91] = local53.anInt4234;
							}
							local498--;
							local91++;
						}
						if (!local18[arg12 + 3 & 0x3]) {
							arg1[3] = Static47.aBooleanArrayArray2[local70][local486 + 1 & 0x3];
						}
					} else if (!local18[arg12 + 3 & 0x3]) {
						arg1[3] = Static11.aBooleanArrayArray1[local70][local486 + 1 & 0x3];
					}
				}
			}
		}
		if (arg11 - 1 > arg3) {
			local40 = arg6[arg3 + 1][arg0] & 0xFF;
			if (local40 > 0) {
				local53 = this.aClass163_4.method3884(local40 - 1);
				if (local53.anInt4242 != -1) {
					local70 = arg2[arg3 + 1][arg0];
					local486 = arg8[arg3 + 1][arg0];
					if (local53.aBoolean345) {
						local91 = 4;
						local498 = local486 * 2 + 6;
						local503 = Static213.method3234(local53, arg9);
						for (local505 = 0; local505 < 3; local505++) {
							local91 &= 0x7;
							local498 &= 0x7;
							if (Static451.aBooleanArrayArray9[local70][local498] && Static219.anIntArray307[local91] <= local53.anInt4234) {
								Static358.anIntArray645[local91] = local53.anInt4242;
								Static70.anIntArray712[local91] = local503;
								Static254.anIntArray354[local91] = local53.anInt4238;
								Static293.anIntArray379[local91] = local53.anInt4239;
								if (local53.anInt4234 == Static219.anIntArray307[local91]) {
									Static94.anIntArray823[local91] |= 0x4;
								} else {
									Static94.anIntArray823[local91] = 4;
								}
								Static219.anIntArray307[local91] = local53.anInt4234;
							}
							local498++;
							local91--;
						}
						if (!local18[arg12 + 1 & 0x3]) {
							arg1[1] = Static47.aBooleanArrayArray2[local70][local486 + 3 & 0x3];
						}
					} else if (!local18[arg12 + 1 & 0x3]) {
						arg1[1] = Static11.aBooleanArrayArray1[local70][local486 + 3 & 0x3];
					}
				}
			}
		}
		if (arg5 == null) {
			return;
		}
		local40 = Static213.method3234(arg5, arg9);
		if (!arg5.aBoolean345) {
			return;
		}
		for (@Pc(1206) int local1206 = 0; local1206 < 8; local1206++) {
			@Pc(1217) int local1217 = local1206 - arg12 * 2 & 0x7;
			if (Static451.aBooleanArrayArray9[arg10][local1206] && Static219.anIntArray307[local1217] <= arg5.anInt4234) {
				Static358.anIntArray645[local1217] = arg5.anInt4242;
				Static70.anIntArray712[local1217] = local40;
				Static254.anIntArray354[local1217] = arg5.anInt4238;
				Static293.anIntArray379[local1217] = arg5.anInt4239;
				if (Static219.anIntArray307[local1217] == arg5.anInt4234) {
					Static94.anIntArray823[local1217] |= 0x2;
				} else {
					Static94.anIntArray823[local1217] = 2;
				}
				Static219.anIntArray307[local1217] = arg5.anInt4234;
			}
		}
		return;
	}
}
