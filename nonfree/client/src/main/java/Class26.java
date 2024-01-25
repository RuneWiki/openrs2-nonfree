import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!b")
public class Class26 {

	@OriginalMember(owner = "client!b", name = "s", descriptor = "[[[B")
	public byte[][][] aByteArrayArrayArray15;

	@OriginalMember(owner = "client!b", name = "m", descriptor = "[I")
	private final int[] anIntArray561 = new int[] { 0, 256, 512, 512, 512, 256, 0, 0, 128, 256, 128, 384, 256 };

	@OriginalMember(owner = "client!b", name = "C", descriptor = "[I")
	private final int[] anIntArray563 = new int[] { 0, 0, 0, 256, 512, 512, 512, 256, 256, 384, 128, 128, 256 };

	@OriginalMember(owner = "client!b", name = "q", descriptor = "Z")
	public final boolean aBoolean662;

	@OriginalMember(owner = "client!b", name = "e", descriptor = "Lclient!mh;")
	private final Class208 aClass208_4;

	@OriginalMember(owner = "client!b", name = "g", descriptor = "I")
	protected final int anInt8538;

	@OriginalMember(owner = "client!b", name = "c", descriptor = "I")
	public final int anInt8536;

	@OriginalMember(owner = "client!b", name = "l", descriptor = "I")
	protected final int anInt8542;

	@OriginalMember(owner = "client!b", name = "p", descriptor = "Lclient!fh;")
	private final Class98 aClass98_5;

	@OriginalMember(owner = "client!b", name = "k", descriptor = "[[[B")
	protected byte[][][] aByteArrayArrayArray13;

	@OriginalMember(owner = "client!b", name = "E", descriptor = "[[[B")
	private final byte[][][] aByteArrayArrayArray17;

	@OriginalMember(owner = "client!b", name = "d", descriptor = "[[[B")
	private final byte[][][] aByteArrayArrayArray12;

	@OriginalMember(owner = "client!b", name = "b", descriptor = "[[[I")
	public final int[][][] anIntArrayArrayArray19;

	@OriginalMember(owner = "client!b", name = "o", descriptor = "[[[B")
	private final byte[][][] aByteArrayArrayArray14;

	@OriginalMember(owner = "client!b", name = "u", descriptor = "[[[B")
	private final byte[][][] aByteArrayArrayArray16;

	@OriginalMember(owner = "client!b", name = "<init>", descriptor = "(IIIZLclient!fh;Lclient!mh;)V")
	protected Class26(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) Class98 arg4, @OriginalArg(5) Class208 arg5) {
		this.aBoolean662 = arg3;
		this.aClass208_4 = arg5;
		this.anInt8538 = arg2;
		this.anInt8536 = arg0;
		this.anInt8542 = arg1;
		this.aClass98_5 = arg4;
		this.aByteArrayArrayArray13 = new byte[this.anInt8536][this.anInt8542 + 1][this.anInt8538 + 1];
		this.aByteArrayArrayArray17 = new byte[this.anInt8536][this.anInt8542][this.anInt8538];
		this.aByteArrayArrayArray12 = new byte[this.anInt8536][this.anInt8542][this.anInt8538];
		this.anIntArrayArrayArray19 = new int[this.anInt8536][this.anInt8542 + 1][this.anInt8538 + 1];
		this.aByteArrayArrayArray14 = new byte[this.anInt8536][this.anInt8542][this.anInt8538];
		this.aByteArrayArrayArray16 = new byte[this.anInt8536][this.anInt8542][this.anInt8538];
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(Lclient!np;[Lclient!jw;IIIIIIII)V")
	public final void method7104(@OriginalArg(0) Class3_Sub11 arg0, @OriginalArg(1) Class169[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(11) int local11 = (arg5 & 0x7) * 8;
		@Pc(17) int local17 = (arg3 & 0x7) * 8;
		@Pc(26) int local26;
		@Pc(58) int local58;
		if (!this.aBoolean662) {
			@Pc(24) Class169 local24 = arg1[arg4];
			for (local26 = 0; local26 < 8; local26++) {
				for (@Pc(30) int local30 = 0; local30 < 8; local30++) {
					@Pc(44) int local44 = Static273.method4142(local26 & 0x7, local30 & 0x7, arg8) + arg2;
					local58 = arg6 + Static376.method5513(arg8, local26 & 0x7, local30 & 0x7);
					if (local44 > 0 && this.anInt8542 - 1 > local44 && local58 > 0 && local58 < this.anInt8538 - 1) {
						local24.method4032(local58, local44);
					}
				}
			}
		}
		@Pc(109) int local109 = (arg5 & 0x1FFFFFF8) << 3;
		local26 = (arg3 & 0x1FFFFFF8) << 3;
		@Pc(122) byte local122 = 0;
		@Pc(124) byte local124 = 0;
		if (arg8 == 1) {
			local124 = 1;
		} else if (arg8 == 2) {
			local122 = 1;
			local124 = 1;
		} else if (arg8 == 3) {
			local122 = 1;
		}
		for (local58 = 0; local58 < this.anInt8536; local58++) {
			for (@Pc(155) int local155 = 0; local155 < 64; local155++) {
				for (@Pc(159) int local159 = 0; local159 < 64; local159++) {
					if (arg7 == local58 && local11 <= local155 && local11 + 8 >= local155 && local17 <= local159 && local159 <= local17 + 8) {
						@Pc(220) int local220;
						@Pc(232) int local232;
						if (local155 == local11 + 8 || local159 == local17 + 8) {
							if (arg8 == 0) {
								local220 = arg2 + local155 - local11;
								local232 = local159 + arg6 - local17;
							} else if (arg8 == 1) {
								local220 = local159 + arg2 - local17;
								local232 = arg6 + local11 + 8 - local155;
							} else if (arg8 == 2) {
								local232 = local17 + arg6 + 8 - local159;
								local220 = local11 + arg2 + 8 - local155;
							} else {
								local232 = local155 + arg6 - local11;
								local220 = local17 + arg2 + 8 - local159;
							}
							this.method7114(0, local220, local155 + local109, 0, true, arg4, local232, arg0, 0, local159 + local26);
						} else {
							local220 = Static273.method4142(local155 & 0x7, local159 & 0x7, arg8) + arg2;
							local232 = Static376.method5513(arg8, local155 & 0x7, local159 & 0x7) + arg6;
							this.method7114(local124, local220, local155 + local109, arg8, false, arg4, local232, arg0, local122, local159 + local26);
						}
						if (local155 == 63 || local159 == 63) {
							@Pc(360) byte local360 = 1;
							if (local155 == 63 && local159 == 63) {
								local360 = 3;
							}
							for (@Pc(370) int local370 = 0; local370 < local360; local370++) {
								@Pc(374) int local374 = local155;
								@Pc(376) int local376 = local159;
								if (local370 == 0) {
									local374 = local155 == 63 ? 64 : local155;
									local376 = local159 == 63 ? 64 : local159;
								} else if (local370 == 1) {
									local374 = 64;
								} else if (local370 == 2) {
									local376 = 64;
								}
								@Pc(441) int local441;
								@Pc(433) int local433;
								if (arg8 == 0) {
									local433 = local376 + arg6 - local17;
									local441 = local374 + arg2 - local11;
								} else if (arg8 == 1) {
									local433 = arg6 + local11 + 8 - local374;
									local441 = arg2 + local376 - local17;
								} else if (arg8 == 2) {
									local433 = local17 + arg6 + 8 - local376;
									local441 = arg2 + local11 + 8 - local374;
								} else {
									local441 = arg2 + local17 + 8 - local376;
									local433 = local374 + arg6 - local11;
								}
								if (local441 >= 0 && local441 < this.anInt8542 && local433 >= 0 && local433 < this.anInt8538) {
									this.anIntArrayArrayArray19[arg4][local441][local433] = this.anIntArrayArrayArray19[arg4][local122 + local220][local124 + local232];
								}
							}
						}
					} else {
						this.method7114(0, -1, 0, 0, false, 0, -1, arg0, 0, 0);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(IB[[I)V")
	public final void method7105(@OriginalArg(2) int[][] arg0) {
		@Pc(10) int[][] local10 = this.anIntArrayArrayArray19[0];
		for (@Pc(12) int local12 = 0; local12 < this.anInt8542 + 1; local12++) {
			for (@Pc(16) int local16 = 0; local16 < this.anInt8538 + 1; local16++) {
				local10[local12][local16] += arg0[local12][local16];
			}
		}
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(Lclient!i;Lclient!i;IBLclient!i;[[ILclient!r;)V")
	private void method7106(@OriginalArg(0) Class34 arg0, @OriginalArg(1) Class34 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Class34 arg3, @OriginalArg(5) int[][] arg4, @OriginalArg(6) Class45 arg5) {
		for (@Pc(11) int local11 = 0; local11 < this.anInt8542; local11++) {
			for (@Pc(15) int local15 = 0; local15 < this.anInt8538; local15++) {
				if (Static504.anInt8197 == -1 || Static161.method2957(local11, arg2, Static504.anInt8197, local15)) {
					@Pc(39) byte local39 = this.aByteArrayArrayArray16[arg2][local11][local15];
					@Pc(48) byte local48 = this.aByteArrayArrayArray17[arg2][local11][local15];
					@Pc(59) int local59 = this.aByteArrayArrayArray12[arg2][local11][local15] & 0xFF;
					@Pc(70) int local70 = this.aByteArrayArrayArray14[arg2][local11][local15] & 0xFF;
					@Pc(85) Class246 local85 = local59 == 0 ? null : this.aClass98_5.method2824(local59 - 1);
					@Pc(100) Class247 local100 = local70 == 0 ? null : this.aClass208_4.method4725(local70 - 1);
					@Pc(102) int local102 = 0;
					@Pc(104) int local104 = 0;
					if (local39 != 0) {
						local104 = local85 == null ? 0 : Static472.anIntArray499[local39];
						local102 = local100 == null ? 0 : Static348.anIntArray333[local39];
					} else if (local85 != null) {
						local104 = Static472.anIntArray499[local39];
					} else if (local100 != null) {
						local102 = Static472.anIntArray499[local39];
					}
					@Pc(143) int local143 = local104 + local102;
					@Pc(145) int local145 = 0;
					if (local143 != 0) {
						@Pc(159) int local159;
						if (Static85.aBoolean159) {
							local159 = local85 == null ? -1 : local85.anInt6863;
						} else {
							local159 = -1;
						}
						@Pc(166) int[] local166 = new int[local143];
						@Pc(169) int[] local169 = new int[local143];
						@Pc(172) int[] local172 = new int[local143];
						@Pc(175) int[] local175 = new int[local143];
						@Pc(177) boolean local177 = false;
						@Pc(194) int local194;
						if (local85 == null || local85.anInt6869 == -1 && local85.anInt6865 == -1 && local159 == -1) {
							for (local194 = 0; local194 < local104; local194++) {
								local166[local145] = -1;
								local145++;
							}
						} else {
							for (local194 = 0; local194 < local104; local194++) {
								local172[local145] = local159;
								local175[local145] = local85.anInt6870;
								if (local85.anInt6869 == -1) {
									local166[local145] = -1;
								} else {
									local166[local145] = local85.anInt6869;
								}
								if (local85.anInt6865 == -1) {
									local169[local145] = -1;
								} else {
									local169[local145] = local85.anInt6865;
									local177 = true;
								}
								local145++;
							}
							if (!this.aBoolean662 && arg2 == 0) {
								Static324.method4691(local11, local15, local85.anInt6862, local85.anInt6868 * 8, local85.anInt6859);
							}
						}
						if (!local177) {
							local169 = null;
						}
						if (local100 == null) {
							for (local194 = 0; local194 < local102; local194++) {
								local166[local145] = -1;
								local145++;
							}
						} else {
							local194 = local100.anInt6883;
							if (Static85.aBoolean159) {
								local194 = -1;
							}
							for (@Pc(310) int local310 = 0; local310 < local102; local310++) {
								local172[local145] = local194;
								local175[local145] = local100.anInt6888;
								local166[local145] = arg4[local11][local15];
								if (local169 != null) {
									local169[local145] = -1;
								}
								local145++;
							}
						}
						local194 = this.anIntArray561.length;
						@Pc(351) int[] local351 = new int[local194];
						@Pc(354) int[] local354 = new int[local194];
						@Pc(361) int[] local361 = arg3 == null ? null : new int[local194];
						@Pc(370) int[] local370 = arg3 == null && arg0 == null ? null : new int[local194];
						@Pc(379) int local379;
						@Pc(384) int local384;
						@Pc(470) int local470;
						@Pc(476) int local476;
						for (@Pc(372) int local372 = 0; local372 < local194; local372++) {
							local379 = this.anIntArray561[local372];
							local384 = this.anIntArray563[local372];
							if (local48 == 0) {
								local351[local372] = local379;
								local354[local372] = local384;
							} else if (local48 == 1) {
								local351[local372] = local384;
								local354[local372] = 512 - local379;
							} else if (local48 == 2) {
								local351[local372] = 512 - local379;
								local354[local372] = 512 - local384;
							} else if (local48 == 3) {
								local351[local372] = 512 - local384;
								local354[local372] = local379;
							}
							if (local361 != null && Static10.aBooleanArrayArray1[local39][local372]) {
								local470 = (local11 << 9) + local379;
								local476 = local379 + (local15 << 9);
								local361[local372] = arg3.method6530(local470, local476) - arg1.method6530(local470, local476);
							}
							if (local370 != null) {
								if (arg3 != null && !Static10.aBooleanArrayArray1[local39][local372]) {
									local470 = local379 + (local11 << 9);
									local476 = (local15 << 9) + local379;
									local370[local372] = arg1.method6530(local470, local476) - arg3.method6530(local470, local476);
								} else if (arg0 != null && !Static530.aBooleanArrayArray5[local39][local372]) {
									local470 = local379 + (local11 << 9);
									local476 = local379 + (local15 << 9);
									local370[local372] = arg0.method6530(local470, local476) - arg1.method6530(local470, local476);
								}
							}
						}
						local379 = arg1.method6525(local15, local11);
						local384 = arg1.method6525(local15, local11 + 1);
						local470 = arg1.method6525(local15 + 1, local11 + 1);
						local476 = arg1.method6525(local15 + 1, local11);
						@Pc(607) boolean local607 = Static511.method6886(local15, local11);
						if (local607 && arg2 > 1 || !local607 && arg2 > 0) {
							@Pc(621) boolean local621 = true;
							if (local100 != null && !local100.aBoolean515) {
								local621 = false;
							} else if (local70 == 0 && local39 != 0) {
								local621 = false;
							} else if (local59 > 0 && local85 != null && !local85.aBoolean510) {
								local621 = false;
							}
							if (local621 && local379 == local384 && local379 == local470 && local476 == local379) {
								this.aByteArrayArrayArray13[arg2][local11][local15] = (byte) (this.aByteArrayArrayArray13[arg2][local11][local15] | 0x4);
							}
						}
						@Pc(685) int local685 = 0;
						@Pc(687) int local687 = 0;
						@Pc(689) int local689 = 0;
						if (this.aBoolean662) {
							local685 = Static66.method1438(local11, local15);
							local687 = Static142.method2762(local11, local15);
							local689 = Static202.method3339(local11, local15);
						}
						arg1.method6531(local11, local15, local351, local361, local354, local370, Static51.anIntArrayArray27[local39], Static126.anIntArrayArray53[local39], Static328.anIntArrayArray124[local39], local166, local169, local172, local175, local685, local687, local689);
						Static407.method5867(arg2, local11, local15);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(IIILclient!np;I[Lclient!jw;I)V")
	public final void method7107(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class3_Sub11 arg3, @OriginalArg(5) Class169[] arg4, @OriginalArg(6) int arg5) {
		@Pc(10) int local10;
		@Pc(18) int local18;
		@Pc(22) int local22;
		@Pc(28) int local28;
		if (!this.aBoolean662) {
			for (local10 = 0; local10 < 4; local10++) {
				@Pc(16) Class169 local16 = arg4[local10];
				for (local18 = 0; local18 < 64; local18++) {
					for (local22 = 0; local22 < 64; local22++) {
						local28 = local18 + arg0;
						@Pc(32) int local32 = local22 + arg5;
						if (local28 >= 0 && this.anInt8542 > local28 && local32 >= 0 && this.anInt8538 > local32) {
							local16.method4032(local32, local28);
						}
					}
				}
			}
		}
		local10 = arg1 + arg0;
		@Pc(93) int local93 = arg2 + arg5;
		for (local18 = 0; local18 < this.anInt8536; local18++) {
			for (local22 = 0; local22 < 64; local22++) {
				for (local28 = 0; local28 < 64; local28++) {
					this.method7114(0, arg0 + local22, local22 + local10, 0, false, local18, local28 + arg5, arg3, 0, local93 + local28);
				}
			}
		}
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(IZIIII)V")
	private void method7108(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7;
		for (@Pc(3) int local3 = arg2; local3 < arg2 + 64; local3++) {
			for (local7 = arg1; local7 < arg1 + 64; local7++) {
				if (local7 >= 0 && this.anInt8542 > local7 && local3 >= 0 && local3 < this.anInt8538) {
					this.anIntArrayArrayArray19[arg0][local7][local3] = arg0 > 0 ? this.anIntArrayArrayArray19[arg0 - 1][local7][local3] - 960 : 0;
				}
			}
		}
		if (arg1 > 0 && arg1 < this.anInt8542) {
			for (local7 = arg2 + 1; local7 < arg2 + 64; local7++) {
				if (local7 >= 0 && local7 < this.anInt8538) {
					this.anIntArrayArrayArray19[arg0][arg1][local7] = this.anIntArrayArrayArray19[arg0][arg1 - 1][local7];
				}
			}
		}
		if (arg2 > 0 && arg2 < this.anInt8538) {
			for (local7 = arg1 + 1; local7 < arg1 + 64; local7++) {
				if (local7 >= 0 && this.anInt8542 > local7) {
					this.anIntArrayArrayArray19[arg0][local7][arg2] = this.anIntArrayArrayArray19[arg0][local7][arg2 - 1];
				}
			}
		}
		if (arg1 < 0 || arg2 < 0 || this.anInt8542 <= arg1 || this.anInt8538 <= arg2) {
			return;
		}
		if (arg0 == 0) {
			if (arg1 > 0 && this.anIntArrayArrayArray19[arg0][arg1 - 1][arg2] != 0) {
				this.anIntArrayArrayArray19[arg0][arg1][arg2] = this.anIntArrayArrayArray19[arg0][arg1 - 1][arg2];
				return;
			}
			if (arg2 > 0 && this.anIntArrayArrayArray19[arg0][arg1][arg2 - 1] != 0) {
				this.anIntArrayArrayArray19[arg0][arg1][arg2] = this.anIntArrayArrayArray19[arg0][arg1][arg2 - 1];
				return;
			}
			if (arg1 > 0 && arg2 > 0 && this.anIntArrayArrayArray19[arg0][arg1 - 1][arg2 - 1] != 0) {
				this.anIntArrayArrayArray19[arg0][arg1][arg2] = this.anIntArrayArrayArray19[arg0][arg1 - 1][arg2 - 1];
				return;
			}
			return;
		}
		if (arg1 > 0 && this.anIntArrayArrayArray19[arg0][arg1 - 1][arg2] != this.anIntArrayArrayArray19[arg0 - 1][arg1 - 1][arg2]) {
			this.anIntArrayArrayArray19[arg0][arg1][arg2] = this.anIntArrayArrayArray19[arg0][arg1 - 1][arg2];
			return;
		}
		if (arg2 > 0 && this.anIntArrayArrayArray19[arg0 - 1][arg1][arg2 - 1] != this.anIntArrayArrayArray19[arg0][arg1][arg2 - 1]) {
			this.anIntArrayArrayArray19[arg0][arg1][arg2] = this.anIntArrayArrayArray19[arg0][arg1][arg2 - 1];
			return;
		}
		if (arg1 > 0 && arg2 > 0 && this.anIntArrayArrayArray19[arg0][arg1 - 1][arg2 - 1] != this.anIntArrayArrayArray19[arg0 - 1][arg1 - 1][arg2 - 1]) {
			this.anIntArrayArrayArray19[arg0][arg1][arg2] = this.anIntArrayArrayArray19[arg0][arg1 - 1][arg2 - 1];
			return;
		}
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(ILclient!r;IIBI[[B[ZII[[B[[BLclient!ot;Lclient!ov;)V")
	private void method7109(@OriginalArg(0) int arg0, @OriginalArg(1) Class45 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) byte[][] arg5, @OriginalArg(7) boolean[] arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) byte[][] arg9, @OriginalArg(11) byte[][] arg10, @OriginalArg(12) Class246 arg11, @OriginalArg(13) Class247 arg12) {
		@Pc(18) boolean[] local18 = arg11 != null && arg11.aBoolean509 ? Static464.aBooleanArrayArray4[arg8] : Static532.aBooleanArrayArray6[arg8];
		@Pc(41) int local41;
		@Pc(54) Class246 local54;
		@Pc(71) byte local71;
		@Pc(88) int local88;
		@Pc(95) int local95;
		if (arg4 > 0) {
			if (arg3 > 0) {
				local41 = arg5[arg3 - 1][arg4 - 1] & 0xFF;
				if (local41 > 0) {
					local54 = this.aClass98_5.method2824(local41 - 1);
					if (local54.anInt6869 != -1 && local54.aBoolean509) {
						local71 = arg10[arg3 - 1][arg4 - 1];
						local88 = arg9[arg3 - 1][arg4 - 1] * 2 + 4 & 0x7;
						local95 = Static39.method653(local54, arg1);
						if (Static10.aBooleanArrayArray1[local71][local88]) {
							Static325.anIntArray310[0] = local54.anInt6869;
							Static435.anIntArray449[0] = local95;
							Static422.anIntArray569[0] = local54.anInt6863;
							Static536.anIntArray566[0] = local54.anInt6870;
							Static453.anIntArray476[0] = local54.anInt6873;
							Static286.anIntArray269[0] = 256;
						}
					}
				}
			}
			if (arg7 - 1 > arg3) {
				local41 = arg5[arg3 + 1][arg4 - 1] & 0xFF;
				if (local41 > 0) {
					local54 = this.aClass98_5.method2824(local41 - 1);
					if (local54.anInt6869 != -1 && local54.aBoolean509) {
						local71 = arg10[arg3 + 1][arg4 - 1];
						local88 = arg9[arg3 + 1][arg4 - 1] * 2 + 6 & 0x7;
						local95 = Static39.method653(local54, arg1);
						if (Static10.aBooleanArrayArray1[local71][local88]) {
							Static325.anIntArray310[2] = local54.anInt6869;
							Static435.anIntArray449[2] = local95;
							Static422.anIntArray569[2] = local54.anInt6863;
							Static536.anIntArray566[2] = local54.anInt6870;
							Static453.anIntArray476[2] = local54.anInt6873;
							Static286.anIntArray269[2] = 512;
						}
					}
				}
			}
		}
		if (arg2 - 1 > arg4) {
			if (arg3 > 0) {
				local41 = arg5[arg3 - 1][arg4 + 1] & 0xFF;
				if (local41 > 0) {
					local54 = this.aClass98_5.method2824(local41 - 1);
					if (local54.anInt6869 != -1 && local54.aBoolean509) {
						local71 = arg10[arg3 - 1][arg4 + 1];
						local88 = arg9[arg3 - 1][arg4 + 1] * 2 + 2 & 0x7;
						local95 = Static39.method653(local54, arg1);
						if (Static10.aBooleanArrayArray1[local71][local88]) {
							Static325.anIntArray310[6] = local54.anInt6869;
							Static435.anIntArray449[6] = local95;
							Static422.anIntArray569[6] = local54.anInt6863;
							Static536.anIntArray566[6] = local54.anInt6870;
							Static453.anIntArray476[6] = local54.anInt6873;
							Static286.anIntArray269[6] = 64;
						}
					}
				}
			}
			if (arg3 < arg7 - 1) {
				local41 = arg5[arg3 + 1][arg4 + 1] & 0xFF;
				if (local41 > 0) {
					local54 = this.aClass98_5.method2824(local41 - 1);
					if (local54.anInt6869 != -1 && local54.aBoolean509) {
						local71 = arg10[arg3 + 1][arg4 + 1];
						local88 = arg9[arg3 + 1][arg4 + 1] * 2 & 0x7;
						local95 = Static39.method653(local54, arg1);
						if (Static10.aBooleanArrayArray1[local71][local88]) {
							Static325.anIntArray310[4] = local54.anInt6869;
							Static435.anIntArray449[4] = local95;
							Static422.anIntArray569[4] = local54.anInt6863;
							Static536.anIntArray566[4] = local54.anInt6870;
							Static453.anIntArray476[4] = local54.anInt6873;
							Static286.anIntArray269[4] = 128;
						}
					}
				}
			}
		}
		@Pc(519) int local519;
		@Pc(524) int local524;
		@Pc(526) int local526;
		@Pc(488) byte local488;
		if (arg4 > 0) {
			local41 = arg5[arg3][arg4 - 1] & 0xFF;
			if (local41 > 0) {
				local54 = this.aClass98_5.method2824(local41 - 1);
				if (local54.anInt6869 != -1) {
					local71 = arg10[arg3][arg4 - 1];
					local488 = arg9[arg3][arg4 - 1];
					if (local54.aBoolean509) {
						local95 = 2;
						local519 = local488 * 2 + 4;
						local524 = Static39.method653(local54, arg1);
						for (local526 = 0; local526 < 3; local526++) {
							local95 &= 0x7;
							local519 &= 0x7;
							if (Static10.aBooleanArrayArray1[local71][local519] && local54.anInt6873 >= Static453.anIntArray476[local95]) {
								Static325.anIntArray310[local95] = local54.anInt6869;
								Static435.anIntArray449[local95] = local524;
								Static422.anIntArray569[local95] = local54.anInt6863;
								Static536.anIntArray566[local95] = local54.anInt6870;
								if (local54.anInt6873 == Static453.anIntArray476[local95]) {
									Static286.anIntArray269[local95] |= 0x20;
								} else {
									Static286.anIntArray269[local95] = 32;
								}
								Static453.anIntArray476[local95] = local54.anInt6873;
							}
							local95--;
							local519++;
						}
						if (!local18[arg0 & 0x3]) {
							arg6[0] = Static464.aBooleanArrayArray4[local71][local488 + 2 & 0x3];
						}
					} else if (!local18[arg0 & 0x3]) {
						arg6[0] = Static532.aBooleanArrayArray6[local71][local488 + 2 & 0x3];
					}
				}
			}
		}
		if (arg2 - 1 > arg4) {
			local41 = arg5[arg3][arg4 + 1] & 0xFF;
			if (local41 > 0) {
				local54 = this.aClass98_5.method2824(local41 - 1);
				if (local54.anInt6869 != -1) {
					local71 = arg10[arg3][arg4 + 1];
					local488 = arg9[arg3][arg4 + 1];
					if (local54.aBoolean509) {
						local95 = 4;
						local519 = local488 * 2 + 2;
						local524 = Static39.method653(local54, arg1);
						for (local526 = 0; local526 < 3; local526++) {
							local95 &= 0x7;
							local519 &= 0x7;
							if (Static10.aBooleanArrayArray1[local71][local519] && Static453.anIntArray476[local95] <= local54.anInt6873) {
								Static325.anIntArray310[local95] = local54.anInt6869;
								Static435.anIntArray449[local95] = local524;
								Static422.anIntArray569[local95] = local54.anInt6863;
								Static536.anIntArray566[local95] = local54.anInt6870;
								if (local54.anInt6873 == Static453.anIntArray476[local95]) {
									Static286.anIntArray269[local95] |= 0x10;
								} else {
									Static286.anIntArray269[local95] = 16;
								}
								Static453.anIntArray476[local95] = local54.anInt6873;
							}
							local519--;
							local95++;
						}
						if (!local18[arg0 + 2 & 0x3]) {
							arg6[2] = Static464.aBooleanArrayArray4[local71][local488 & 0x3];
						}
					} else if (!local18[arg0 + 2 & 0x3]) {
						arg6[2] = Static532.aBooleanArrayArray6[local71][local488 & 0x3];
					}
				}
			}
		}
		if (arg3 > 0) {
			local41 = arg5[arg3 - 1][arg4] & 0xFF;
			if (local41 > 0) {
				local54 = this.aClass98_5.method2824(local41 - 1);
				if (local54.anInt6869 != -1) {
					local71 = arg10[arg3 - 1][arg4];
					local488 = arg9[arg3 - 1][arg4];
					if (local54.aBoolean509) {
						local95 = 6;
						local519 = local488 * 2 + 4;
						local524 = Static39.method653(local54, arg1);
						for (local526 = 0; local526 < 3; local526++) {
							local519 &= 0x7;
							local95 &= 0x7;
							if (Static10.aBooleanArrayArray1[local71][local519] && local54.anInt6873 >= Static453.anIntArray476[local95]) {
								Static325.anIntArray310[local95] = local54.anInt6869;
								Static435.anIntArray449[local95] = local524;
								Static422.anIntArray569[local95] = local54.anInt6863;
								Static536.anIntArray566[local95] = local54.anInt6870;
								if (local54.anInt6873 == Static453.anIntArray476[local95]) {
									Static286.anIntArray269[local95] |= 0x8;
								} else {
									Static286.anIntArray269[local95] = 8;
								}
								Static453.anIntArray476[local95] = local54.anInt6873;
							}
							local519--;
							local95++;
						}
						if (!local18[arg0 + 3 & 0x3]) {
							arg6[3] = Static464.aBooleanArrayArray4[local71][local488 + 1 & 0x3];
						}
					} else if (!local18[arg0 + 3 & 0x3]) {
						arg6[3] = Static532.aBooleanArrayArray6[local71][local488 + 1 & 0x3];
					}
				}
			}
		}
		if (arg3 < arg7 - 1) {
			local41 = arg5[arg3 + 1][arg4] & 0xFF;
			if (local41 > 0) {
				local54 = this.aClass98_5.method2824(local41 - 1);
				if (local54.anInt6869 != -1) {
					local71 = arg10[arg3 + 1][arg4];
					local488 = arg9[arg3 + 1][arg4];
					if (local54.aBoolean509) {
						local95 = 4;
						local519 = local488 * 2 + 6;
						local524 = Static39.method653(local54, arg1);
						for (local526 = 0; local526 < 3; local526++) {
							local519 &= 0x7;
							local95 &= 0x7;
							if (Static10.aBooleanArrayArray1[local71][local519] && local54.anInt6873 >= Static453.anIntArray476[local95]) {
								Static325.anIntArray310[local95] = local54.anInt6869;
								Static435.anIntArray449[local95] = local524;
								Static422.anIntArray569[local95] = local54.anInt6863;
								Static536.anIntArray566[local95] = local54.anInt6870;
								if (local54.anInt6873 == Static453.anIntArray476[local95]) {
									Static286.anIntArray269[local95] |= 0x4;
								} else {
									Static286.anIntArray269[local95] = 4;
								}
								Static453.anIntArray476[local95] = local54.anInt6873;
							}
							local519++;
							local95--;
						}
						if (!local18[arg0 + 1 & 0x3]) {
							arg6[1] = Static464.aBooleanArrayArray4[local71][local488 + 3 & 0x3];
						}
					} else if (!local18[arg0 + 1 & 0x3]) {
						arg6[1] = Static532.aBooleanArrayArray6[local71][local488 + 3 & 0x3];
					}
				}
			}
		}
		if (arg11 == null) {
			return;
		}
		local41 = Static39.method653(arg11, arg1);
		if (!arg11.aBoolean509) {
			return;
		}
		for (@Pc(1191) int local1191 = 0; local1191 < 8; local1191++) {
			@Pc(1202) int local1202 = local1191 - arg0 * 2 & 0x7;
			if (Static10.aBooleanArrayArray1[arg8][local1191] && arg11.anInt6873 >= Static453.anIntArray476[local1202]) {
				Static325.anIntArray310[local1202] = arg11.anInt6869;
				Static435.anIntArray449[local1202] = local41;
				Static422.anIntArray569[local1202] = arg11.anInt6863;
				Static536.anIntArray566[local1202] = arg11.anInt6870;
				if (arg11.anInt6873 == Static453.anIntArray476[local1202]) {
					Static286.anIntArray269[local1202] |= 0x2;
				} else {
					Static286.anIntArray269[local1202] = 2;
				}
				Static453.anIntArray476[local1202] = arg11.anInt6873;
			}
		}
		return;
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(IIBII)V")
	public final void method7111(@OriginalArg(1) int arg0, @OriginalArg(4) int arg1) {
		for (@Pc(11) int local11 = 0; local11 < this.anInt8536; local11++) {
			this.method7108(local11, arg1, arg0);
		}
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(Lclient!r;ILclient!i;Lclient!i;)V")
	public final void method7112(@OriginalArg(0) Class45 arg0, @OriginalArg(2) Class34 arg1, @OriginalArg(3) Class34 arg2) {
		@Pc(11) int[][] local11 = new int[this.anInt8542][this.anInt8538];
		if (Static535.anIntArray564 == null || this.anInt8538 != Static535.anIntArray564.length) {
			Static579.anIntArray606 = new int[this.anInt8538];
			Static579.anIntArray605 = new int[this.anInt8538];
			Static168.anIntArray173 = new int[this.anInt8538];
			Static63.anIntArray65 = new int[this.anInt8538];
			Static535.anIntArray564 = new int[this.anInt8538];
		}
		@Pc(53) int local53;
		for (@Pc(49) int local49 = 0; local49 < this.anInt8536; local49++) {
			for (local53 = 0; local53 < this.anInt8538; local53++) {
				Static535.anIntArray564[local53] = 0;
				Static579.anIntArray606[local53] = 0;
				Static168.anIntArray173[local53] = 0;
				Static63.anIntArray65[local53] = 0;
				Static579.anIntArray605[local53] = 0;
			}
			for (@Pc(86) int local86 = -5; local86 < this.anInt8542; local86++) {
				@Pc(96) int local96;
				@Pc(115) int local115;
				@Pc(187) int local187;
				for (@Pc(90) int local90 = 0; local90 < this.anInt8538; local90++) {
					local96 = local86 + 5;
					@Pc(164) int local164;
					if (local96 < this.anInt8542) {
						local115 = this.aByteArrayArrayArray14[local49][local96][local90] & 0xFF;
						if (local115 > 0) {
							@Pc(128) Class247 local128 = this.aClass208_4.method4725(local115 - 1);
							Static535.anIntArray564[local90] += local128.anInt6885;
							Static579.anIntArray606[local90] += local128.anInt6890;
							Static168.anIntArray173[local90] += local128.anInt6887;
							Static63.anIntArray65[local90] += local128.anInt6884;
							local164 = Static579.anIntArray605[local90]++;
						}
					}
					local115 = local86 - 5;
					if (local115 >= 0) {
						local187 = this.aByteArrayArrayArray14[local49][local115][local90] & 0xFF;
						if (local187 > 0) {
							@Pc(200) Class247 local200 = this.aClass208_4.method4725(local187 - 1);
							Static535.anIntArray564[local90] -= local200.anInt6885;
							Static579.anIntArray606[local90] -= local200.anInt6890;
							Static168.anIntArray173[local90] -= local200.anInt6887;
							Static63.anIntArray65[local90] -= local200.anInt6884;
							local164 = Static579.anIntArray605[local90]--;
						}
					}
				}
				if (local86 >= 0) {
					local96 = 0;
					local115 = 0;
					local187 = 0;
					@Pc(261) int local261 = 0;
					@Pc(263) int local263 = 0;
					for (@Pc(265) int local265 = -5; local265 < this.anInt8538; local265++) {
						@Pc(271) int local271 = local265 + 5;
						if (local271 < this.anInt8538) {
							local261 += Static63.anIntArray65[local271];
							local96 += Static535.anIntArray564[local271];
							local263 += Static579.anIntArray605[local271];
							local187 += Static168.anIntArray173[local271];
							local115 += Static579.anIntArray606[local271];
						}
						@Pc(313) int local313 = local265 - 5;
						if (local313 >= 0) {
							local96 -= Static535.anIntArray564[local313];
							local187 -= Static168.anIntArray173[local313];
							local115 -= Static579.anIntArray606[local313];
							local263 -= Static579.anIntArray605[local313];
							local261 -= Static63.anIntArray65[local313];
						}
						if (local265 >= 0 && local261 > 0 && local263 > 0) {
							local11[local86][local265] = Static73.method1568(local115 / local263, local96 * 256 / local261, local187 / local263);
						}
					}
				}
			}
			if (Static40.aBoolean75) {
				this.method7115(local11, local49 == 0 ? arg1 : null, arg0, local49 == 0 ? arg2 : null, Static68.aClass34Array1[local49], local49);
			} else {
				this.method7106(local49 == 0 ? arg1 : null, Static68.aClass34Array1[local49], local49, local49 == 0 ? arg2 : null, local11, arg0);
			}
			this.aByteArrayArrayArray14[local49] = null;
			this.aByteArrayArrayArray12[local49] = null;
			this.aByteArrayArrayArray16[local49] = null;
			this.aByteArrayArrayArray17[local49] = null;
		}
		if (!this.aBoolean662) {
			if (Static459.anInt7699 != 0) {
				Static366.method5364();
			}
			if (Static15.aBoolean29) {
				Static254.method3916();
			}
		}
		for (local53 = 0; local53 < this.anInt8536; local53++) {
			Static68.aClass34Array1[local53].BA();
		}
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(IIIIZIILclient!np;IBI)V")
	private void method7114(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) Class3_Sub11 arg7, @OriginalArg(8) int arg8, @OriginalArg(10) int arg9) {
		if (arg3 == 1) {
			arg0 = 1;
		} else if (arg3 == 2) {
			arg0 = 1;
			arg8 = 1;
		} else if (arg3 == 3) {
			arg8 = 1;
		}
		@Pc(59) int local59;
		if (arg1 < 0 || arg1 >= this.anInt8542 || arg6 < 0 || this.anInt8538 <= arg6) {
			while (true) {
				local59 = arg7.method5175();
				if (local59 == 0) {
					return;
				}
				if (local59 == 1) {
					arg7.method5175();
					return;
				}
				if (local59 <= 49) {
					arg7.method5175();
				}
			}
			return;
		}
		if (!this.aBoolean662 && !arg4) {
			Static503.aByteArrayArrayArray11[arg5][arg1][arg6] = 0;
		}
		while (true) {
			local59 = arg7.method5175();
			if (local59 == 0) {
				if (this.aBoolean662) {
					this.anIntArrayArrayArray19[0][arg1 + arg8][arg6 + arg0] = 0;
					return;
				} else if (arg5 == 0) {
					this.anIntArrayArrayArray19[0][arg8 + arg1][arg6 + arg0] = -Static72.method1560(arg9 + 556238, 932731 - -arg2) * 8 << 2;
					return;
				} else {
					this.anIntArrayArrayArray19[arg5][arg1 + arg8][arg0 + arg6] = this.anIntArrayArrayArray19[arg5 - 1][arg1 + arg8][arg6 + arg0] - 960;
					return;
				}
			}
			if (local59 == 1) {
				@Pc(198) int local198 = arg7.method5175();
				if (this.aBoolean662) {
					this.anIntArrayArrayArray19[0][arg8 + arg1][arg6 + arg0] = local198 * 8 << 2;
					return;
				}
				if (local198 == 1) {
					local198 = 0;
				}
				if (arg5 != 0) {
					this.anIntArrayArrayArray19[arg5][arg1 + arg8][arg6 + arg0] = this.anIntArrayArrayArray19[arg5 - 1][arg1 + arg8][arg0 + arg6] - (local198 * 8 << 2);
					return;
				}
				this.anIntArrayArrayArray19[0][arg8 + arg1][arg6 + arg0] = -local198 * 8 << 2;
				return;
			}
			if (local59 <= 49) {
				if (arg4) {
					arg7.method5175();
				} else {
					this.aByteArrayArrayArray12[arg5][arg1][arg6] = arg7.method5212();
					this.aByteArrayArrayArray16[arg5][arg1][arg6] = (byte) ((local59 - 2) / 4);
					this.aByteArrayArrayArray17[arg5][arg1][arg6] = (byte) (local59 + arg3 - 2 & 0x3);
				}
			} else if (local59 <= 81) {
				if (!this.aBoolean662 && !arg4) {
					Static503.aByteArrayArrayArray11[arg5][arg1][arg6] = (byte) (local59 - 49);
				}
			} else if (!arg4) {
				this.aByteArrayArrayArray14[arg5][arg1][arg6] = (byte) (local59 - 81);
			}
		}
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "([[ILclient!i;Lclient!r;ILclient!i;Lclient!i;I)V")
	private void method7115(@OriginalArg(0) int[][] arg0, @OriginalArg(1) Class34 arg1, @OriginalArg(2) Class45 arg2, @OriginalArg(4) Class34 arg3, @OriginalArg(5) Class34 arg4, @OriginalArg(6) int arg5) {
		@Pc(10) byte[][] local10 = this.aByteArrayArrayArray16[arg5];
		@Pc(15) byte[][] local15 = this.aByteArrayArrayArray17[arg5];
		@Pc(20) byte[][] local20 = this.aByteArrayArrayArray14[arg5];
		@Pc(25) byte[][] local25 = this.aByteArrayArrayArray12[arg5];
		for (@Pc(27) int local27 = 0; local27 < this.anInt8542; local27++) {
			@Pc(45) int local45 = this.anInt8542 - 1 > local27 ? local27 + 1 : local27;
			for (@Pc(47) int local47 = 0; local47 < this.anInt8538; local47++) {
				@Pc(65) int local65 = this.anInt8538 - 1 > local47 ? local47 + 1 : local47;
				if (Static504.anInt8197 == -1 || Static161.method2957(local27, arg5, Static504.anInt8197, local47)) {
					@Pc(79) boolean local79 = false;
					@Pc(81) boolean local81 = false;
					@Pc(84) boolean[] local84 = new boolean[4];
					@Pc(90) int local90 = local10[local27][local47];
					@Pc(96) int local96 = local15[local27][local47];
					@Pc(104) int local104 = local25[local27][local47] & 0xFF;
					@Pc(112) int local112 = local20[local27][local47] & 0xFF;
					@Pc(120) int local120 = local20[local27][local65] & 0xFF;
					@Pc(128) int local128 = local20[local45][local65] & 0xFF;
					@Pc(136) int local136 = local20[local45][local47] & 0xFF;
					if (local104 != 0 || local112 != 0) {
						@Pc(155) Class246 local155 = local104 == 0 ? null : this.aClass98_5.method2824(local104 - 1);
						@Pc(170) Class247 local170 = local112 == 0 ? null : this.aClass208_4.method4725(local112 - 1);
						if (local90 == 0 && local155 == null) {
							local90 = 12;
						}
						@Pc(178) Class246 local178 = local155;
						if (local155 != null) {
							if (local155.anInt6869 == -1 && local155.anInt6865 == -1) {
								local178 = local155;
								local155 = null;
							} else if (local170 != null && local90 != 0) {
								local81 = local155.aBoolean509;
							}
						}
						@Pc(262) int local262;
						@Pc(317) int local317;
						@Pc(386) int local386;
						@Pc(398) int local398;
						if ((local90 == 0 || local90 == 12) && local27 > 0 && local47 > 0 && local27 < this.anInt8542 && this.anInt8538 > local47) {
							local262 = local112 == local20[local27 - 1][local47 - 1] ? 1 : -1;
							@Pc(279) int local279 = local112 == local20[local45][local65] ? 1 : -1;
							@Pc(298) int local298 = local20[local45][local47 - 1] == local112 ? 1 : -1;
							local317 = local20[local27 - 1][local65] == local112 ? 1 : -1;
							if (local112 == local20[local27][local47 - 1]) {
								local298++;
								local262++;
							} else {
								local298--;
								local262--;
							}
							if (local20[local45][local47] == local112) {
								local279++;
								local298++;
							} else {
								local298--;
								local279--;
							}
							if (local20[local27][local65] == local112) {
								local317++;
								local279++;
							} else {
								local317--;
								local279--;
							}
							if (local20[local27 - 1][local47] == local112) {
								local262++;
								local317++;
							} else {
								local317--;
								local262--;
							}
							local386 = local262 - local279;
							if (local386 < 0) {
								local386 = -local386;
							}
							local398 = local298 - local317;
							if (local398 < 0) {
								local398 = -local398;
							}
							if (local386 == local398) {
								local386 = arg4.method6525(local47, local27) - arg4.method6525(local65, local45);
								if (local386 < 0) {
									local386 = -local386;
								}
								local398 = arg4.method6525(local47, local45) - arg4.method6525(local65, local27);
								if (local398 < 0) {
									local398 = -local398;
								}
							}
							local96 = local386 < local398 ? 1 : 0;
						}
						for (local262 = 0; local262 < 13; local262++) {
							Static453.anIntArray476[local262] = -1;
							Static286.anIntArray269[local262] = 1;
						}
						@Pc(498) boolean[] local498 = local155 != null && local155.aBoolean509 ? Static464.aBooleanArrayArray4[local90] : Static532.aBooleanArrayArray6[local90];
						this.method7109(local96, arg2, this.anInt8538, local27, local47, local25, local84, this.anInt8542, local90, local15, local10, local155, local170);
						@Pc(527) boolean local527 = local155 != null && local155.anInt6869 != local155.anInt6865;
						if (!local527) {
							for (local317 = 0; local317 < 8; local317++) {
								if (Static453.anIntArray476[local317] >= 0 && Static325.anIntArray310[local317] != Static435.anIntArray449[local317]) {
									local527 = true;
									break;
								}
							}
						}
						if (!local498[local96 + 1 & 0x3]) {
							local84[1] = Static507.method6861(local84[1], (Static286.anIntArray269[2] & Static286.anIntArray269[4]) == 0);
						}
						if (!local498[local96 + 3 & 0x3]) {
							local84[3] = Static507.method6861(local84[3], (Static286.anIntArray269[0] & Static286.anIntArray269[6]) == 0);
						}
						if (!local498[local96 & 0x3]) {
							local84[0] = Static507.method6861(local84[0], (Static286.anIntArray269[0] & Static286.anIntArray269[2]) == 0);
						}
						if (!local498[local96 + 2 & 0x3]) {
							local84[2] = Static507.method6861(local84[2], (Static286.anIntArray269[6] & Static286.anIntArray269[4]) == 0);
						}
						if (!local81 && (local90 == 0 || local90 == 12)) {
							if (local84[0] && !local84[1] && !local84[2] && local84[3]) {
								local96 = 0;
								local90 = local90 == 0 ? 13 : 14;
								local84[0] = local84[3] = false;
							} else if (local84[0] && local84[1] && !local84[2] && !local84[3]) {
								local84[0] = local84[1] = false;
								local90 = local90 == 0 ? 13 : 14;
								local96 = 3;
							} else if (!local84[0] && local84[1] && local84[2] && !local84[3]) {
								local96 = 2;
								local90 = local90 == 0 ? 13 : 14;
								local84[1] = local84[2] = false;
							} else if (!local84[0] && !local84[1] && local84[2] && local84[3]) {
								local90 = local90 == 0 ? 13 : 14;
								local84[2] = local84[3] = false;
								local96 = 1;
							}
						}
						@Pc(837) boolean local837 = !local81 && !local84[0] && !local84[2] && !local84[1] && !local84[3];
						@Pc(839) int[] local839 = null;
						@Pc(863) int[] local863;
						@Pc(859) int[] local859;
						@Pc(875) int[] local875;
						if (local837) {
							local398 = local155 == null ? 0 : Static472.anIntArray499[local90];
							local859 = Static126.anIntArrayArray53[local90];
							local863 = Static51.anIntArrayArray27[local90];
							local386 = local170 == null ? 0 : Static348.anIntArray333[local90];
							local875 = Static328.anIntArrayArray124[local90];
						} else if (local81) {
							local859 = Static115.anIntArrayArray149[local90];
							local386 = local170 == null ? 0 : Static426.anIntArray446[local90];
							local863 = Static124.anIntArrayArray194[local90];
							local398 = local155 == null ? 0 : Static247.anIntArray231[local90];
							local875 = Static18.anIntArrayArray7[local90];
							local839 = Static5.anIntArrayArray4[local90];
						} else {
							local398 = local155 == null ? 0 : Static414.anIntArray442[local90];
							local839 = Static302.anIntArrayArray116[local90];
							local859 = Static220.anIntArrayArray88[local90];
							local863 = Static344.anIntArrayArray132[local90];
							local386 = local170 == null ? 0 : Static484.anIntArray503[local90];
							local875 = Static365.anIntArrayArray140[local90];
						}
						@Pc(942) int local942 = local398 + local386;
						if (local942 <= 0) {
							Static407.method5867(arg5, local27, local47);
						} else {
							if (local84[0]) {
								local942++;
							}
							if (local84[2]) {
								local942++;
							}
							if (local84[1]) {
								local942++;
							}
							if (local84[3]) {
								local942++;
							}
							@Pc(972) int local972 = 0;
							@Pc(974) int local974 = 0;
							@Pc(978) int local978 = local942 * 3;
							@Pc(985) int[] local985 = local527 ? new int[local978] : null;
							@Pc(988) int[] local988 = new int[local978];
							@Pc(991) int[] local991 = new int[local978];
							@Pc(994) int[] local994 = new int[local978];
							@Pc(997) int[] local997 = new int[local978];
							@Pc(1000) int[] local1000 = new int[local978];
							@Pc(1007) int[] local1007 = arg3 == null ? null : new int[local978];
							@Pc(1016) int[] local1016 = arg3 == null && arg1 == null ? null : new int[local978];
							@Pc(1018) int local1018 = -1;
							@Pc(1020) int local1020 = -1;
							@Pc(1022) int local1022 = 256;
							@Pc(1088) byte local1088;
							@Pc(1038) int local1038;
							@Pc(1040) int local1040;
							@Pc(1272) int local1272;
							@Pc(1278) int local1278;
							@Pc(1287) int local1287;
							@Pc(1292) int local1292;
							@Pc(1309) int local1309;
							@Pc(1297) int local1297;
							@Pc(1307) int local1307;
							@Pc(1365) int local1365;
							@Pc(1371) int local1371;
							if (local155 != null) {
								local1022 = local155.anInt6870;
								local1020 = local155.anInt6863;
								local1018 = local155.anInt6869;
								local1038 = Static39.method653(local155, arg2);
								for (local1040 = 0; local1040 < local398; local1040++) {
									if (local84[-local96 & 0x3] && local839[0] == local972) {
										Static182.anIntArray185[0] = local863[local972];
										Static182.anIntArray185[1] = 1;
										Static182.anIntArray185[2] = local875[local972];
										Static182.anIntArray185[3] = 1;
										Static182.anIntArray185[4] = local859[local972];
										local1088 = 6;
										Static182.anIntArray185[5] = local875[local972];
									} else if (local84[2 - local96 & 0x3] && local972 == local839[2]) {
										Static182.anIntArray185[0] = local863[local972];
										Static182.anIntArray185[1] = 5;
										Static182.anIntArray185[2] = local875[local972];
										Static182.anIntArray185[3] = 5;
										Static182.anIntArray185[4] = local859[local972];
										local1088 = 6;
										Static182.anIntArray185[5] = local875[local972];
									} else if (local84[1 - local96 & 0x3] && local839[1] == local972) {
										Static182.anIntArray185[0] = local863[local972];
										Static182.anIntArray185[1] = 3;
										Static182.anIntArray185[2] = local875[local972];
										Static182.anIntArray185[3] = 3;
										Static182.anIntArray185[4] = local859[local972];
										local1088 = 6;
										Static182.anIntArray185[5] = local875[local972];
									} else if (local84[3 - local96 & 0x3] && local972 == local839[3]) {
										Static182.anIntArray185[0] = local863[local972];
										Static182.anIntArray185[1] = 7;
										Static182.anIntArray185[2] = local875[local972];
										Static182.anIntArray185[3] = 7;
										Static182.anIntArray185[4] = local859[local972];
										Static182.anIntArray185[5] = local875[local972];
										local1088 = 6;
									} else {
										Static182.anIntArray185[0] = local863[local972];
										Static182.anIntArray185[1] = local859[local972];
										local1088 = 3;
										Static182.anIntArray185[2] = local875[local972];
									}
									local972++;
									for (local1272 = 0; local1272 < local1088; local1272++) {
										local1278 = Static182.anIntArray185[local1272];
										local1287 = local1278 - local96 * 2 & 0x7;
										local1292 = this.anIntArray561[local1278];
										local1297 = this.anIntArray563[local1278];
										if (local96 == 1) {
											local1307 = 512 - local1292;
											local1309 = local1297;
										} else if (local96 == 2) {
											local1307 = 512 - local1297;
											local1309 = 512 - local1292;
										} else if (local96 == 3) {
											local1307 = local1292;
											local1309 = 512 - local1297;
										} else {
											local1309 = local1292;
											local1307 = local1297;
										}
										local988[local974] = local1309;
										local991[local974] = local1307;
										if (local1007 != null && Static10.aBooleanArrayArray1[local90][local1278]) {
											local1365 = local1309 + (local27 << 9);
											local1371 = local1307 + (local47 << 9);
											local1007[local974] = arg3.method6530(local1365, local1371) - arg4.method6530(local1365, local1371);
										}
										if (local1016 != null) {
											if (arg3 != null && !Static10.aBooleanArrayArray1[local90][local1278]) {
												local1365 = local1309 + (local27 << 9);
												local1371 = (local47 << 9) + local1307;
												local1016[local974] = arg4.method6530(local1365, local1371) - arg3.method6530(local1365, local1371);
											} else if (arg1 != null && !Static530.aBooleanArrayArray5[local90][local1278]) {
												local1365 = local1309 + (local27 << 9);
												local1371 = local1307 + (local47 << 9);
												local1016[local974] = arg1.method6530(local1365, local1371) - arg4.method6530(local1365, local1371);
											}
										}
										if (local1278 < 8 && Static453.anIntArray476[local1287] > local155.anInt6873) {
											if (local985 != null) {
												local985[local974] = Static435.anIntArray449[local1287];
											}
											local1000[local974] = Static536.anIntArray566[local1287];
											local997[local974] = Static422.anIntArray569[local1287];
											local994[local974] = Static325.anIntArray310[local1287];
										} else {
											if (local985 != null) {
												local985[local974] = local1038;
											}
											local997[local974] = local155.anInt6863;
											local1000[local974] = local155.anInt6870;
											local994[local974] = local1018;
										}
										local974++;
									}
								}
								if (!this.aBoolean662 && arg5 == 0) {
									Static324.method4691(local27, local47, local155.anInt6862, local155.anInt6868 * 8, local155.anInt6859);
								}
								if (local90 != 12 && local155.anInt6869 != -1 && local155.aBoolean511) {
									local79 = true;
								}
							} else if (local837) {
								local972 = Static472.anIntArray499[local90];
							} else if (local81) {
								local972 = Static247.anIntArray231[local90];
							} else {
								local972 = Static414.anIntArray442[local90];
							}
							if (local170 != null) {
								if (local136 == 0) {
									local136 = local112;
								}
								if (local128 == 0) {
									local128 = local112;
								}
								if (local120 == 0) {
									local120 = local112;
								}
								@Pc(1619) Class247 local1619 = this.aClass208_4.method4725(local112 - 1);
								@Pc(1627) Class247 local1627 = this.aClass208_4.method4725(local120 - 1);
								@Pc(1635) Class247 local1635 = this.aClass208_4.method4725(local128 - 1);
								@Pc(1643) Class247 local1643 = this.aClass208_4.method4725(local136 - 1);
								for (local1287 = 0; local1287 < local386; local1287++) {
									if (local84[-local96 & 0x3] && local972 == local839[0]) {
										Static182.anIntArray185[0] = local863[local972];
										Static182.anIntArray185[1] = 1;
										Static182.anIntArray185[2] = local875[local972];
										Static182.anIntArray185[3] = 1;
										Static182.anIntArray185[4] = local859[local972];
										Static182.anIntArray185[5] = local875[local972];
										local1088 = 6;
									} else if (local84[2 - local96 & 0x3] && local972 == local839[2]) {
										Static182.anIntArray185[0] = local863[local972];
										Static182.anIntArray185[1] = 5;
										Static182.anIntArray185[2] = local875[local972];
										Static182.anIntArray185[3] = 5;
										Static182.anIntArray185[4] = local859[local972];
										local1088 = 6;
										Static182.anIntArray185[5] = local875[local972];
									} else if (local84[1 - local96 & 0x3] && local972 == local839[1]) {
										Static182.anIntArray185[0] = local863[local972];
										Static182.anIntArray185[1] = 3;
										Static182.anIntArray185[2] = local875[local972];
										Static182.anIntArray185[3] = 3;
										Static182.anIntArray185[4] = local859[local972];
										local1088 = 6;
										Static182.anIntArray185[5] = local875[local972];
									} else if (local84[3 - local96 & 0x3] && local839[3] == local972) {
										Static182.anIntArray185[0] = local863[local972];
										Static182.anIntArray185[1] = 7;
										Static182.anIntArray185[2] = local875[local972];
										Static182.anIntArray185[3] = 7;
										Static182.anIntArray185[4] = local859[local972];
										local1088 = 6;
										Static182.anIntArray185[5] = local875[local972];
									} else {
										Static182.anIntArray185[0] = local863[local972];
										Static182.anIntArray185[1] = local859[local972];
										local1088 = 3;
										Static182.anIntArray185[2] = local875[local972];
									}
									local972++;
									for (local1292 = 0; local1292 < local1088; local1292++) {
										local1309 = Static182.anIntArray185[local1292];
										local1297 = local1309 - local96 * 2 & 0x7;
										local1307 = this.anIntArray561[local1309];
										local1371 = this.anIntArray563[local1309];
										@Pc(1915) int local1915;
										if (local96 == 1) {
											local1365 = local1371;
											local1915 = 512 - local1307;
										} else if (local96 == 2) {
											local1365 = 512 - local1307;
											local1915 = 512 - local1371;
										} else if (local96 == 3) {
											local1915 = local1307;
											local1365 = 512 - local1371;
										} else {
											local1915 = local1371;
											local1365 = local1307;
										}
										local988[local974] = local1365;
										local991[local974] = local1915;
										@Pc(1971) int local1971;
										@Pc(1977) int local1977;
										if (local1007 != null && Static10.aBooleanArrayArray1[local90][local1309]) {
											local1971 = local1365 + (local27 << 9);
											local1977 = local1915 + (local47 << 9);
											local1007[local974] = arg3.method6530(local1971, local1977) - arg4.method6530(local1971, local1977);
										}
										if (local1016 != null) {
											if (arg3 != null && !Static10.aBooleanArrayArray1[local90][local1309]) {
												local1971 = (local27 << 9) + local1365;
												local1977 = local1915 + (local47 << 9);
												local1016[local974] = arg4.method6530(local1971, local1977) - arg3.method6530(local1971, local1977);
											} else if (arg1 != null && !Static530.aBooleanArrayArray5[local90][local1309]) {
												local1971 = local1365 + (local27 << 9);
												local1977 = (local47 << 9) + local1915;
												local1016[local974] = arg1.method6530(local1971, local1977) - arg4.method6530(local1971, local1977);
											}
										}
										if (local1309 < 8 && Static453.anIntArray476[local1297] >= 0) {
											if (local985 != null) {
												local985[local974] = Static435.anIntArray449[local1297];
											}
											local1000[local974] = Static536.anIntArray566[local1297];
											local997[local974] = Static422.anIntArray569[local1297];
											local994[local974] = Static325.anIntArray310[local1297];
										} else {
											if (local81 && Static10.aBooleanArrayArray1[local90][local1309]) {
												local997[local974] = local1020;
												local1000[local974] = local1022;
												local994[local974] = local1018;
											} else if (local1365 == 0 && local1915 == 0) {
												local994[local974] = arg0[local27][local47];
												local997[local974] = local1619.anInt6883;
												local1000[local974] = local1619.anInt6888;
											} else if (local1365 == 0 && local1915 == 512) {
												local994[local974] = arg0[local27][local65];
												local997[local974] = local1627.anInt6883;
												local1000[local974] = local1627.anInt6888;
											} else if (local1365 == 512 && local1915 == 512) {
												local994[local974] = arg0[local45][local65];
												local997[local974] = local1635.anInt6883;
												local1000[local974] = local1635.anInt6888;
											} else if (local1365 == 512 && local1915 == 0) {
												local994[local974] = arg0[local45][local47];
												local997[local974] = local1643.anInt6883;
												local1000[local974] = local1643.anInt6888;
											} else {
												if (local1365 < 256) {
													if (local1915 < 256) {
														local997[local974] = local1619.anInt6883;
														local1000[local974] = local1619.anInt6888;
													} else {
														local997[local974] = local1627.anInt6883;
														local1000[local974] = local1627.anInt6888;
													}
												} else if (local1915 < 256) {
													local997[local974] = local1643.anInt6883;
													local1000[local974] = local1643.anInt6888;
												} else {
													local997[local974] = local1635.anInt6883;
													local1000[local974] = local1635.anInt6888;
												}
												local1971 = Static475.method6539(arg0[local45][local47], local1365 << 7 >> 9, arg0[local27][local47]);
												local1977 = Static475.method6539(arg0[local45][local65], local1365 << 7 >> 9, arg0[local27][local65]);
												local994[local974] = Static475.method6539(local1977, local1915 << 7 >> 9, local1971);
											}
											if (local985 != null) {
												local985[local974] = local994[local974];
											}
										}
										local974++;
									}
								}
								if (local90 != 0 && local170.aBoolean514) {
									local79 = true;
								}
							}
							local1038 = arg4.method6525(local47, local27);
							local1040 = arg4.method6525(local47, local45);
							local1272 = arg4.method6525(local65, local45);
							local1278 = arg4.method6525(local65, local27);
							@Pc(2417) boolean local2417 = Static511.method6886(local47, local27);
							if (local2417 && arg5 > 1 || !local2417 && arg5 > 0) {
								@Pc(2433) boolean local2433 = true;
								if (local170 != null && !local170.aBoolean515) {
									local2433 = false;
								} else if (local112 == 0 && local90 != 0) {
									local2433 = false;
								} else if (local104 > 0 && local178 != null && !local178.aBoolean510) {
									local2433 = false;
								}
								if (local2433 && local1038 == local1040 && local1038 == local1272 && local1278 == local1038) {
									this.aByteArrayArrayArray13[arg5][local27][local47] = (byte) (this.aByteArrayArrayArray13[arg5][local27][local47] | 0x4);
								}
							}
							local1292 = 0;
							local1309 = 0;
							local1297 = 0;
							if (this.aBoolean662) {
								local1292 = Static66.method1438(local27, local47);
								local1309 = Static142.method2762(local27, local47);
								local1297 = Static202.method3339(local27, local47);
							}
							arg4.O(local27, local47, local988, local1007, local991, local1016, local994, local985, local997, local1000, local1292, local1309, local1297, local79);
							Static407.method5867(arg5, local27, local47);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(I[Lclient!jw;Lclient!r;[[[I)V")
	public final void method7116(@OriginalArg(1) Class169[] arg0, @OriginalArg(2) Class45 arg1, @OriginalArg(3) int[][][] arg2) {
		@Pc(6) int local6;
		@Pc(14) int local14;
		@Pc(28) int local28;
		if (!this.aBoolean662) {
			for (local6 = 0; local6 < 4; local6++) {
				for (@Pc(10) int local10 = 0; local10 < this.anInt8542; local10++) {
					for (local14 = 0; local14 < this.anInt8538; local14++) {
						if ((Static503.aByteArrayArrayArray11[local6][local10][local14] & 0x1) != 0) {
							local28 = local6;
							if ((Static503.aByteArrayArrayArray11[1][local10][local14] & 0x2) != 0) {
								local28 = local6 - 1;
							}
							if (local28 >= 0) {
								arg0[local28].method4037(local10, local14);
							}
						}
					}
				}
			}
		}
		for (local6 = 0; local6 < this.anInt8536; local6++) {
			local14 = 0;
			local28 = 0;
			if (!this.aBoolean662) {
				if (Static469.aBoolean316) {
					local28 = 8;
				}
				if (Static15.aBoolean29) {
					local14 = 2;
				}
				if (Static459.anInt7699 != 0) {
					local14 |= 0x1;
					if (Static394.aBoolean516 | local6 == 0) {
						local28 |= 0x10;
					}
				}
			}
			if (Static15.aBoolean29) {
				local28 |= 0x7;
			}
			if (!Static317.aBoolean399) {
				local28 |= 0x20;
			}
			@Pc(148) int[][] local148 = arg2 == null || arg2.length <= local6 ? this.anIntArrayArrayArray19[local6] : arg2[local6];
			Static389.method380(local6, arg1.method7371(this.anInt8542, this.anInt8538, this.anIntArrayArrayArray19[local6], local148, local14, local28));
		}
	}
}
