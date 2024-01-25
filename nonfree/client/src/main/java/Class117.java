import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!iu")
public class Class117 {

	@OriginalMember(owner = "client!iu", name = "c", descriptor = "[[[B")
	public byte[][][] aByteArrayArrayArray11;

	@OriginalMember(owner = "client!iu", name = "n", descriptor = "Z")
	public final boolean aBoolean215;

	@OriginalMember(owner = "client!iu", name = "l", descriptor = "Lclient!kl;")
	private final Class134 aClass134_6;

	@OriginalMember(owner = "client!iu", name = "j", descriptor = "Lclient!sc;")
	private final Class210 aClass210_5;

	@OriginalMember(owner = "client!iu", name = "A", descriptor = "I")
	protected final int anInt2839;

	@OriginalMember(owner = "client!iu", name = "a", descriptor = "I")
	protected final int anInt2825;

	@OriginalMember(owner = "client!iu", name = "t", descriptor = "I")
	public final int anInt2835;

	@OriginalMember(owner = "client!iu", name = "r", descriptor = "[[[B")
	private final byte[][][] aByteArrayArrayArray13;

	@OriginalMember(owner = "client!iu", name = "z", descriptor = "[[[B")
	protected byte[][][] aByteArrayArrayArray16;

	@OriginalMember(owner = "client!iu", name = "u", descriptor = "[[[B")
	private final byte[][][] aByteArrayArrayArray14;

	@OriginalMember(owner = "client!iu", name = "o", descriptor = "[[[I")
	public final int[][][] anIntArrayArrayArray13;

	@OriginalMember(owner = "client!iu", name = "m", descriptor = "[[[B")
	private final byte[][][] aByteArrayArrayArray12;

	@OriginalMember(owner = "client!iu", name = "y", descriptor = "[[[B")
	private final byte[][][] aByteArrayArrayArray15;

	@OriginalMember(owner = "client!iu", name = "<init>", descriptor = "(IIIZLclient!kl;Lclient!sc;)V")
	protected Class117(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) Class134 arg4, @OriginalArg(5) Class210 arg5) {
		this.aBoolean215 = arg3;
		this.aClass134_6 = arg4;
		this.aClass210_5 = arg5;
		this.anInt2839 = arg2;
		this.anInt2825 = arg1;
		this.anInt2835 = arg0;
		this.aByteArrayArrayArray13 = new byte[this.anInt2835][this.anInt2825][this.anInt2839];
		this.aByteArrayArrayArray16 = new byte[this.anInt2835][this.anInt2825 + 1][this.anInt2839 + 1];
		this.aByteArrayArrayArray14 = new byte[this.anInt2835][this.anInt2825][this.anInt2839];
		this.anIntArrayArrayArray13 = new int[this.anInt2835][this.anInt2825 + 1][this.anInt2839 + 1];
		this.aByteArrayArrayArray12 = new byte[this.anInt2835][this.anInt2825][this.anInt2839];
		this.aByteArrayArrayArray15 = new byte[this.anInt2835][this.anInt2825][this.anInt2839];
	}

	@OriginalMember(owner = "client!iu", name = "a", descriptor = "(Lclient!pl;[[IBLclient!np;Lclient!pl;Lclient!pl;I)V")
	private void method2426(@OriginalArg(0) Class7 arg0, @OriginalArg(1) int[][] arg1, @OriginalArg(3) Class155 arg2, @OriginalArg(4) Class7 arg3, @OriginalArg(5) Class7 arg4, @OriginalArg(6) int arg5) {
		for (@Pc(8) int local8 = 0; local8 < this.anInt2825; local8++) {
			for (@Pc(12) int local12 = 0; local12 < this.anInt2839; local12++) {
				if (Static46.anInt956 == -1 || Static11.method5237(Static46.anInt956, local12, arg5, local8)) {
					@Pc(36) byte local36 = this.aByteArrayArrayArray14[arg5][local8][local12];
					@Pc(45) byte local45 = this.aByteArrayArrayArray15[arg5][local8][local12];
					@Pc(56) int local56 = this.aByteArrayArrayArray12[arg5][local8][local12] & 0xFF;
					@Pc(67) int local67 = this.aByteArrayArrayArray13[arg5][local8][local12] & 0xFF;
					@Pc(79) Class100 local79 = local56 == 0 ? null : this.aClass134_6.method2930(local56 - 1);
					@Pc(91) Class147 local91 = local67 == 0 ? null : this.aClass210_5.method4766(local67 - 1);
					@Pc(93) int local93 = 0;
					@Pc(95) int local95 = 0;
					if (local36 != 0) {
						local95 = local79 == null ? 0 : Static140.anIntArray281[local36];
						local93 = local91 == null ? 0 : Static303.anIntArray583[local36];
					} else if (local79 != null) {
						local95 = Static140.anIntArray281[local36];
					} else if (local91 != null) {
						local93 = Static140.anIntArray281[local36];
					}
					@Pc(133) int local133 = local93 + local95;
					@Pc(135) int local135 = 0;
					if (local133 != 0) {
						@Pc(140) int[] local140 = new int[local133];
						@Pc(143) int[] local143 = new int[local133];
						@Pc(146) int[] local146 = new int[local133];
						@Pc(149) int[] local149 = new int[local133];
						@Pc(151) boolean local151 = false;
						@Pc(170) int local170;
						@Pc(202) int local202;
						if (local79 == null || local79.anInt2431 == -1 && local79.anInt2429 == -1 && local79.anInt2437 == -1) {
							for (local170 = 0; local170 < local95; local170++) {
								local140[local135] = -1;
								local135++;
							}
						} else {
							local170 = arg2.method4882() ? local79.anInt2437 : local79.anInt2439;
							if (Static79.aBoolean130) {
								local170 = -1;
							}
							for (local202 = 0; local202 < local95; local202++) {
								local146[local135] = local170;
								local149[local135] = local79.anInt2426;
								if (local79.anInt2431 == -1) {
									local140[local135] = -1;
								} else {
									local140[local135] = local79.anInt2431;
								}
								if (local79.anInt2429 == -1) {
									local143[local135] = -1;
								} else {
									local143[local135] = local79.anInt2429;
									local151 = true;
								}
								local135++;
							}
							if (!this.aBoolean215 && arg5 == 0) {
								Static325.method5009(local8, local12, local79.anInt2432, local79.anInt2428 * 8, local79.anInt2436);
							}
						}
						if (!local151) {
							local143 = null;
						}
						if (local91 == null) {
							for (local170 = 0; local170 < local93; local170++) {
								local140[local135] = -1;
								local135++;
							}
						} else {
							local170 = local91.anInt3617;
							if (Static79.aBoolean130) {
								local170 = -1;
							}
							for (local202 = 0; local202 < local93; local202++) {
								local146[local135] = local170;
								local149[local135] = local91.anInt3613;
								local140[local135] = arg1[local8][local12];
								if (local143 != null) {
									local143[local135] = -1;
								}
								local135++;
							}
						}
						local170 = Static236.anIntArray447.length;
						@Pc(344) int[] local344 = new int[local170];
						@Pc(347) int[] local347 = new int[local170];
						@Pc(354) int[] local354 = arg0 == null ? null : new int[local170];
						@Pc(363) int[] local363 = arg0 == null && arg4 == null ? null : new int[local170];
						@Pc(371) int local371;
						@Pc(375) int local375;
						@Pc(460) int local460;
						@Pc(466) int local466;
						for (@Pc(365) int local365 = 0; local365 < local170; local365++) {
							local371 = Static236.anIntArray447[local365];
							local375 = Static278.anIntArray536[local365];
							if (local45 == 0) {
								local344[local365] = local371;
								local347[local365] = local375;
							} else if (local45 == 1) {
								local344[local365] = local375;
								local347[local365] = 128 - local371;
							} else if (local45 == 2) {
								local344[local365] = 128 - local371;
								local347[local365] = 128 - local375;
							} else if (local45 == 3) {
								local344[local365] = 128 - local375;
								local347[local365] = local371;
							}
							if (local354 != null && Static158.aBooleanArrayArray2[local36][local365]) {
								local460 = local371 + (local8 << 7);
								local466 = (local12 << 7) + local371;
								local354[local365] = arg0.method5638(local460, local466) - arg3.method5638(local460, local466);
							}
							if (local363 != null) {
								if (arg0 != null && !Static158.aBooleanArrayArray2[local36][local365]) {
									local460 = local371 + (local8 << 7);
									local466 = local371 + (local12 << 7);
									local363[local365] = arg3.method5638(local460, local466) - arg0.method5638(local460, local466);
								} else if (arg4 != null && !Static280.aBooleanArrayArray5[local36][local365]) {
									local460 = (local8 << 7) + local371;
									local466 = (local12 << 7) + local371;
									local363[local365] = arg4.method5638(local460, local466) - arg3.method5638(local460, local466);
								}
							}
						}
						local371 = arg3.method5648(local8, local12);
						local375 = arg3.method5648(local8 + 1, local12);
						local460 = arg3.method5648(local8 + 1, local12 + 1);
						local466 = arg3.method5648(local8, local12 + 1);
						if (arg5 > 0) {
							@Pc(592) boolean local592 = true;
							if (local67 == 0 && local36 != 0) {
								local592 = false;
							}
							if (local56 > 0 && local79 != null && !local79.aBoolean185) {
								local592 = false;
							}
							if (local592 && local371 == local375 && local460 == local371 && local371 == local466) {
								this.aByteArrayArrayArray16[arg5][local8][local12] = (byte) (this.aByteArrayArrayArray16[arg5][local8][local12] | 0x4);
							}
						}
						@Pc(647) int local647 = 0;
						@Pc(649) int local649 = 0;
						@Pc(651) int local651 = 0;
						if (this.aBoolean215) {
							local647 = Static329.method5021(local8, local12);
							local649 = Static368.method5522(local8, local12);
							local651 = Static328.method5019(local8, local12);
						}
						arg3.method5640(local8, local12, local344, local354, local347, local363, Static61.anIntArrayArray12[local36], Static162.anIntArrayArray28[local36], Static312.anIntArrayArray49[local36], local140, local143, local146, local149, local647, local649, local651);
						Static172.method3206(arg5, local8, local12);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!iu", name = "a", descriptor = "(Lclient!np;Lclient!pl;Lclient!pl;I)V")
	public final void method2427(@OriginalArg(0) Class155 arg0, @OriginalArg(1) Class7 arg1, @OriginalArg(2) Class7 arg2) {
		if (Static56.anIntArray102 == null || Static56.anIntArray102.length != this.anInt2839) {
			Static69.anIntArray133 = new int[this.anInt2839];
			Static98.anIntArray199 = new int[this.anInt2839];
			Static199.anIntArray388 = new int[this.anInt2839];
			Static56.anIntArray102 = new int[this.anInt2839];
			Static392.anIntArray705 = new int[this.anInt2839];
		}
		@Pc(42) int[][] local42 = new int[this.anInt2825][this.anInt2839];
		@Pc(54) int local54;
		for (@Pc(50) int local50 = 0; local50 < this.anInt2835; local50++) {
			for (local54 = 0; local54 < this.anInt2839; local54++) {
				Static56.anIntArray102[local54] = 0;
				Static69.anIntArray133[local54] = 0;
				Static199.anIntArray388[local54] = 0;
				Static98.anIntArray199[local54] = 0;
				Static392.anIntArray705[local54] = 0;
			}
			for (@Pc(83) int local83 = -5; local83 < this.anInt2825; local83++) {
				@Pc(93) int local93;
				@Pc(108) int local108;
				@Pc(174) int local174;
				for (@Pc(87) int local87 = 0; local87 < this.anInt2839; local87++) {
					local93 = local83 + 5;
					@Pc(154) int local154;
					if (local93 < this.anInt2825) {
						local108 = this.aByteArrayArrayArray13[local50][local93][local87] & 0xFF;
						if (local108 > 0) {
							@Pc(118) Class147 local118 = this.aClass210_5.method4766(local108 - 1);
							Static56.anIntArray102[local87] += local118.anInt3622;
							Static69.anIntArray133[local87] += local118.anInt3619;
							Static199.anIntArray388[local87] += local118.anInt3628;
							Static98.anIntArray199[local87] += local118.anInt3626;
							local154 = Static392.anIntArray705[local87]++;
						}
					}
					local108 = local83 - 5;
					if (local108 >= 0) {
						local174 = this.aByteArrayArrayArray13[local50][local108][local87] & 0xFF;
						if (local174 > 0) {
							@Pc(187) Class147 local187 = this.aClass210_5.method4766(local174 - 1);
							Static56.anIntArray102[local87] -= local187.anInt3622;
							Static69.anIntArray133[local87] -= local187.anInt3619;
							Static199.anIntArray388[local87] -= local187.anInt3628;
							Static98.anIntArray199[local87] -= local187.anInt3626;
							local154 = Static392.anIntArray705[local87]--;
						}
					}
				}
				if (local83 >= 0) {
					local93 = 0;
					local108 = 0;
					local174 = 0;
					@Pc(248) int local248 = 0;
					@Pc(250) int local250 = 0;
					for (@Pc(252) int local252 = -5; local252 < this.anInt2839; local252++) {
						@Pc(258) int local258 = local252 + 5;
						if (this.anInt2839 > local258) {
							local93 += Static56.anIntArray102[local258];
							local108 += Static69.anIntArray133[local258];
							local250 += Static392.anIntArray705[local258];
							local248 += Static98.anIntArray199[local258];
							local174 += Static199.anIntArray388[local258];
						}
						@Pc(296) int local296 = local252 - 5;
						if (local296 >= 0) {
							local248 -= Static98.anIntArray199[local296];
							local108 -= Static69.anIntArray133[local296];
							local250 -= Static392.anIntArray705[local296];
							local174 -= Static199.anIntArray388[local296];
							local93 -= Static56.anIntArray102[local296];
						}
						if (local252 >= 0 && local248 > 0 && local250 > 0) {
							local42[local83][local252] = Static291.method4530(local174 / local250, local93 * 256 / local248, local108 / local250);
						}
					}
				}
			}
			if (Static41.aBoolean41) {
				this.method2436(local50 == 0 ? arg1 : null, arg0, local50 == 0 ? arg2 : null, Static337.aClass7Array3[local50], local50, local42);
			} else {
				this.method2426(local50 == 0 ? arg2 : null, local42, arg0, Static337.aClass7Array3[local50], local50 == 0 ? arg1 : null, local50);
			}
			this.aByteArrayArrayArray13[local50] = null;
			this.aByteArrayArrayArray12[local50] = null;
			this.aByteArrayArrayArray14[local50] = null;
			this.aByteArrayArrayArray15[local50] = null;
		}
		if (!this.aBoolean215) {
			if (Static262.anInt1204 != 0) {
				Static85.method1416();
			}
			if (Static290.aBoolean399) {
				Static6.method93();
			}
		}
		for (local54 = 0; local54 < this.anInt2835; local54++) {
			Static337.aClass7Array3[local54].method5644();
		}
	}

	@OriginalMember(owner = "client!iu", name = "a", descriptor = "(IIIIIIZIZLclient!rp;I)V")
	private void method2428(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) int arg7, @OriginalArg(9) Class3_Sub5 arg8, @OriginalArg(10) int arg9) {
		if (arg3 == 1) {
			arg5 = 1;
		} else if (arg3 == 2) {
			arg5 = 1;
			arg9 = 1;
		} else if (arg3 == 3) {
			arg9 = 1;
		}
		@Pc(65) int local65;
		if (arg7 < 0 || this.anInt2825 <= arg7 || arg2 < 0 || this.anInt2839 <= arg2) {
			while (true) {
				local65 = arg8.method2739();
				if (local65 == 0) {
					return;
				}
				if (local65 == 1) {
					arg8.method2739();
					return;
				}
				if (local65 <= 49) {
					arg8.method2739();
				}
			}
			return;
		}
		if (!this.aBoolean215 && !arg6) {
			Static13.aByteArrayArrayArray17[arg4][arg7][arg2] = 0;
		}
		while (true) {
			local65 = arg8.method2739();
			if (local65 == 0) {
				if (this.aBoolean215) {
					this.anIntArrayArrayArray13[0][arg9 + arg7][arg5 + arg2] = 0;
					return;
				} else if (arg4 == 0) {
					this.anIntArrayArrayArray13[0][arg9 + arg7][arg2 + arg5] = -Static45.method707(arg1 + 556238, arg0 + 932731) * 8;
					return;
				} else {
					this.anIntArrayArrayArray13[arg4][arg7 + arg9][arg5 + arg2] = this.anIntArrayArrayArray13[arg4 - 1][arg7 + arg9][arg2 + arg5] - 240;
					return;
				}
			}
			if (local65 == 1) {
				@Pc(153) int local153 = arg8.method2739();
				if (!this.aBoolean215) {
					if (local153 == 1) {
						local153 = 0;
					}
					if (arg4 == 0) {
						this.anIntArrayArrayArray13[0][arg9 + arg7][arg5 + arg2] = -local153 * 8;
						return;
					}
					this.anIntArrayArrayArray13[arg4][arg7 + arg9][arg5 + arg2] = this.anIntArrayArrayArray13[arg4 - 1][arg7 + arg9][arg5 + arg2] - local153 * 8;
					return;
				}
				this.anIntArrayArrayArray13[0][arg7 + arg9][arg5 + arg2] = local153 * 8;
				return;
			}
			if (local65 <= 49) {
				if (arg6) {
					arg8.method2739();
				} else {
					this.aByteArrayArrayArray12[arg4][arg7][arg2] = arg8.method2753();
					this.aByteArrayArrayArray14[arg4][arg7][arg2] = (byte) ((local65 - 2) / 4);
					this.aByteArrayArrayArray15[arg4][arg7][arg2] = (byte) (local65 + arg3 - 2 & 0x3);
				}
			} else if (local65 <= 81) {
				if (!this.aBoolean215 && !arg6) {
					Static13.aByteArrayArrayArray17[arg4][arg7][arg2] = (byte) (local65 - 49);
				}
			} else if (!arg6) {
				this.aByteArrayArrayArray13[arg4][arg7][arg2] = (byte) (local65 - 81);
			}
		}
	}

	@OriginalMember(owner = "client!iu", name = "a", descriptor = "(IIIIII)V")
	public final void method2429(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		@Pc(11) int local11;
		for (@Pc(7) int local7 = arg1; local7 < arg2 + arg1; local7++) {
			for (local11 = arg3; local11 < arg0 + arg3; local11++) {
				if (local11 >= 0 && this.anInt2825 > local11 && local7 >= 0 && this.anInt2839 > local7) {
					this.anIntArrayArrayArray13[arg4][local11][local7] = arg4 <= 0 ? 0 : this.anIntArrayArrayArray13[arg4 - 1][local11][local7] - 240;
				}
			}
		}
		if (arg3 > 0 && arg3 < this.anInt2825) {
			for (local11 = arg1 + 1; local11 < arg1 + arg2; local11++) {
				if (local11 >= 0 && this.anInt2839 > local11) {
					this.anIntArrayArrayArray13[arg4][arg3][local11] = this.anIntArrayArrayArray13[arg4][arg3 - 1][local11];
				}
			}
		}
		if (arg1 > 0 && this.anInt2839 > arg1) {
			for (local11 = arg3 + 1; local11 < arg3 + arg0; local11++) {
				if (local11 >= 0 && this.anInt2825 > local11) {
					this.anIntArrayArrayArray13[arg4][local11][arg1] = this.anIntArrayArrayArray13[arg4][local11][arg1 - 1];
				}
			}
		}
		if (arg3 < 0 || arg1 < 0 || this.anInt2825 <= arg3 || this.anInt2839 <= arg1) {
			return;
		}
		if (arg4 != 0) {
			if (arg3 > 0 && this.anIntArrayArrayArray13[arg4][arg3 - 1][arg1] != this.anIntArrayArrayArray13[arg4 - 1][arg3 - 1][arg1]) {
				this.anIntArrayArrayArray13[arg4][arg3][arg1] = this.anIntArrayArrayArray13[arg4][arg3 - 1][arg1];
				return;
			}
			if (arg1 > 0 && this.anIntArrayArrayArray13[arg4][arg3][arg1 - 1] != this.anIntArrayArrayArray13[arg4 - 1][arg3][arg1 - 1]) {
				this.anIntArrayArrayArray13[arg4][arg3][arg1] = this.anIntArrayArrayArray13[arg4][arg3][arg1 - 1];
				return;
			}
			if (arg3 > 0 && arg1 > 0 && this.anIntArrayArrayArray13[arg4][arg3 - 1][arg1 - 1] != this.anIntArrayArrayArray13[arg4 - 1][arg3 - 1][arg1 - 1]) {
				this.anIntArrayArrayArray13[arg4][arg3][arg1] = this.anIntArrayArrayArray13[arg4][arg3 - 1][arg1 - 1];
				return;
			}
			return;
		}
		if (arg3 > 0 && this.anIntArrayArrayArray13[arg4][arg3 - 1][arg1] != 0) {
			this.anIntArrayArrayArray13[arg4][arg3][arg1] = this.anIntArrayArrayArray13[arg4][arg3 - 1][arg1];
			return;
		}
		if (arg1 > 0 && this.anIntArrayArrayArray13[arg4][arg3][arg1 - 1] != 0) {
			this.anIntArrayArrayArray13[arg4][arg3][arg1] = this.anIntArrayArrayArray13[arg4][arg3][arg1 - 1];
			return;
		}
		if (arg3 > 0 && arg1 > 0 && this.anIntArrayArrayArray13[arg4][arg3 - 1][arg1 - 1] != 0) {
			this.anIntArrayArrayArray13[arg4][arg3][arg1] = this.anIntArrayArrayArray13[arg4][arg3 - 1][arg1 - 1];
			return;
		}
	}

	@OriginalMember(owner = "client!iu", name = "a", descriptor = "([ZB[[BLclient!hc;ILclient!lk;IIILclient!np;[[B[[BII)V")
	private void method2430(@OriginalArg(0) boolean[] arg0, @OriginalArg(2) byte[][] arg1, @OriginalArg(3) Class100 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class147 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) Class155 arg8, @OriginalArg(10) byte[][] arg9, @OriginalArg(11) byte[][] arg10, @OriginalArg(12) int arg11, @OriginalArg(13) int arg12) {
		@Pc(45) int local45;
		if (arg2 != null && arg4 != null || arg4 != null && arg5 == 12 || arg2 != null && arg5 == 0) {
			@Pc(29) boolean[] local29 = arg2 != null && arg2.aBoolean186 ? Static135.aBooleanArrayArray1[arg5] : Static294.aBooleanArrayArray6[arg5];
			@Pc(55) Class100 local55;
			@Pc(72) byte local72;
			@Pc(88) int local88;
			@Pc(93) int local93;
			if (arg12 > 0) {
				if (arg11 > 0) {
					local45 = arg9[arg11 - 1][arg12 - 1] & 0xFF;
					if (local45 > 0) {
						local55 = this.aClass134_6.method2930(local45 - 1);
						if (local55.anInt2431 != -1 && local55.aBoolean186) {
							local72 = arg1[arg11 - 1][arg12 - 1];
							local88 = arg10[arg11 - 1][arg12 - 1] * 2 + 4 & 0x7;
							local93 = Static292.method4838(local55, arg8);
							if (Static158.aBooleanArrayArray2[local72][local88]) {
								Static242.anIntArray484[0] = local55.anInt2431;
								Static304.anIntArray359[0] = local93;
								Static97.anIntArray194[0] = arg8.method4882() ? local55.anInt2437 : local55.anInt2439;
								Static308.anIntArray589[0] = local55.anInt2426;
								Static262.anIntArray108[0] = local55.anInt2427;
								Static240.anIntArray598[0] = 256;
							}
						}
					}
				}
				if (arg7 - 1 > arg11) {
					local45 = arg9[arg11 + 1][arg12 - 1] & 0xFF;
					if (local45 > 0) {
						local55 = this.aClass134_6.method2930(local45 - 1);
						if (local55.anInt2431 != -1 && local55.aBoolean186) {
							local72 = arg1[arg11 + 1][arg12 - 1];
							local88 = arg10[arg11 + 1][arg12 - 1] * 2 + 6 & 0x7;
							local93 = Static292.method4838(local55, arg8);
							if (Static158.aBooleanArrayArray2[local72][local88]) {
								Static242.anIntArray484[2] = local55.anInt2431;
								Static304.anIntArray359[2] = local93;
								Static97.anIntArray194[2] = arg8.method4882() ? local55.anInt2437 : local55.anInt2439;
								Static308.anIntArray589[2] = local55.anInt2426;
								Static262.anIntArray108[2] = local55.anInt2427;
								Static240.anIntArray598[2] = 512;
							}
						}
					}
				}
			}
			if (arg3 - 1 > arg12) {
				if (arg11 > 0) {
					local45 = arg9[arg11 - 1][arg12 + 1] & 0xFF;
					if (local45 > 0) {
						local55 = this.aClass134_6.method2930(local45 - 1);
						if (local55.anInt2431 != -1 && local55.aBoolean186) {
							local72 = arg1[arg11 - 1][arg12 + 1];
							local88 = arg10[arg11 - 1][arg12 + 1] * 2 + 2 & 0x7;
							local93 = Static292.method4838(local55, arg8);
							if (Static158.aBooleanArrayArray2[local72][local88]) {
								Static242.anIntArray484[6] = local55.anInt2431;
								Static304.anIntArray359[6] = local93;
								Static97.anIntArray194[6] = arg8.method4882() ? local55.anInt2437 : local55.anInt2439;
								Static308.anIntArray589[6] = local55.anInt2426;
								Static262.anIntArray108[6] = local55.anInt2427;
								Static240.anIntArray598[6] = 64;
							}
						}
					}
				}
				if (arg11 < arg7 - 1) {
					local45 = arg9[arg11 + 1][arg12 + 1] & 0xFF;
					if (local45 > 0) {
						local55 = this.aClass134_6.method2930(local45 - 1);
						if (local55.anInt2431 != -1 && local55.aBoolean186) {
							local72 = arg1[arg11 + 1][arg12 + 1];
							local88 = arg10[arg11 + 1][arg12 + 1] * 2 & 0x7;
							local93 = Static292.method4838(local55, arg8);
							if (Static158.aBooleanArrayArray2[local72][local88]) {
								Static242.anIntArray484[4] = local55.anInt2431;
								Static304.anIntArray359[4] = local93;
								Static97.anIntArray194[4] = arg8.method4882() ? local55.anInt2437 : local55.anInt2439;
								Static308.anIntArray589[4] = local55.anInt2426;
								Static262.anIntArray108[4] = local55.anInt2427;
								Static240.anIntArray598[4] = 128;
							}
						}
					}
				}
			}
			@Pc(538) int local538;
			@Pc(543) int local543;
			@Pc(545) int local545;
			@Pc(505) byte local505;
			if (arg12 > 0) {
				local45 = arg9[arg11][arg12 - 1] & 0xFF;
				if (local45 > 0) {
					local55 = this.aClass134_6.method2930(local45 - 1);
					if (local55.anInt2431 != -1) {
						local72 = arg1[arg11][arg12 - 1];
						local505 = arg10[arg11][arg12 - 1];
						if (local55.aBoolean186) {
							local93 = 2;
							local538 = local505 * 2 + 4;
							local543 = Static292.method4838(local55, arg8);
							for (local545 = 0; local545 < 3; local545++) {
								local538 &= 0x7;
								local93 &= 0x7;
								if (Static158.aBooleanArrayArray2[local72][local538] && Static262.anIntArray108[local93] <= local55.anInt2427) {
									Static242.anIntArray484[local93] = local55.anInt2431;
									Static304.anIntArray359[local93] = local543;
									Static97.anIntArray194[local93] = arg8.method4882() ? local55.anInt2437 : local55.anInt2439;
									Static308.anIntArray589[local93] = local55.anInt2426;
									if (Static262.anIntArray108[local93] == local55.anInt2427) {
										Static240.anIntArray598[local93] |= 0x20;
									} else {
										Static240.anIntArray598[local93] = 32;
									}
									Static262.anIntArray108[local93] = local55.anInt2427;
								}
								local538++;
								local93--;
							}
							if (!local29[arg6 & 0x3]) {
								arg0[0] = Static135.aBooleanArrayArray1[local72][local505 + 2 & 0x3];
							}
						} else if (!local29[--arg6 & 0x3]) {
							arg0[0] = Static294.aBooleanArrayArray6[local72][local505 + 2 & 0x3];
						}
					}
				}
			}
			if (arg3 - 1 > arg12) {
				local45 = arg9[arg11][arg12 + 1] & 0xFF;
				if (local45 > 0) {
					local55 = this.aClass134_6.method2930(local45 - 1);
					if (local55.anInt2431 != -1) {
						local72 = arg1[arg11][arg12 + 1];
						local505 = arg10[arg11][arg12 + 1];
						if (local55.aBoolean186) {
							local93 = 4;
							local538 = local505 * 2 + 2;
							local543 = Static292.method4838(local55, arg8);
							for (local545 = 0; local545 < 3; local545++) {
								local93 &= 0x7;
								local538 &= 0x7;
								if (Static158.aBooleanArrayArray2[local72][local538] && local55.anInt2427 >= Static262.anIntArray108[local93]) {
									Static242.anIntArray484[local93] = local55.anInt2431;
									Static304.anIntArray359[local93] = local543;
									Static97.anIntArray194[local93] = arg8.method4882() ? local55.anInt2437 : local55.anInt2439;
									Static308.anIntArray589[local93] = local55.anInt2426;
									if (Static262.anIntArray108[local93] == local55.anInt2427) {
										Static240.anIntArray598[local93] |= 0x10;
									} else {
										Static240.anIntArray598[local93] = 16;
									}
									Static262.anIntArray108[local93] = local55.anInt2427;
								}
								local93++;
								local538--;
							}
							if (!local29[arg6 + 2 & 0x3]) {
								arg0[2] = Static135.aBooleanArrayArray1[local72][local505 & 0x3];
							}
						} else if (!local29[arg6 + 2 & 0x3]) {
							arg0[2] = Static294.aBooleanArrayArray6[local72][local505 & 0x3];
						}
					}
				}
			}
			if (arg11 > 0) {
				local45 = arg9[arg11 - 1][arg12] & 0xFF;
				if (local45 > 0) {
					local55 = this.aClass134_6.method2930(local45 - 1);
					if (local55.anInt2431 != -1) {
						local72 = arg1[arg11 - 1][arg12];
						local505 = arg10[arg11 - 1][arg12];
						if (local55.aBoolean186) {
							local93 = 6;
							local538 = local505 * 2 + 4;
							local543 = Static292.method4838(local55, arg8);
							for (local545 = 0; local545 < 3; local545++) {
								local93 &= 0x7;
								local538 &= 0x7;
								if (Static158.aBooleanArrayArray2[local72][local538] && local55.anInt2427 >= Static262.anIntArray108[local93]) {
									Static242.anIntArray484[local93] = local55.anInt2431;
									Static304.anIntArray359[local93] = local543;
									Static97.anIntArray194[local93] = arg8.method4882() ? local55.anInt2437 : local55.anInt2439;
									Static308.anIntArray589[local93] = local55.anInt2426;
									if (local55.anInt2427 == Static262.anIntArray108[local93]) {
										Static240.anIntArray598[local93] |= 0x8;
									} else {
										Static240.anIntArray598[local93] = 8;
									}
									Static262.anIntArray108[local93] = local55.anInt2427;
								}
								local538--;
								local93++;
							}
							if (!local29[arg6 + 3 & 0x3]) {
								arg0[3] = Static135.aBooleanArrayArray1[local72][local505 + 1 & 0x3];
							}
						} else if (!local29[arg6 + 3 & 0x3]) {
							arg0[3] = Static294.aBooleanArrayArray6[local72][local505 + 1 & 0x3];
						}
					}
				}
			}
			if (arg7 - 1 > arg11) {
				local45 = arg9[arg11 + 1][arg12] & 0xFF;
				if (local45 > 0) {
					local55 = this.aClass134_6.method2930(local45 - 1);
					if (local55.anInt2431 != -1) {
						local72 = arg1[arg11 + 1][arg12];
						local505 = arg10[arg11 + 1][arg12];
						if (local55.aBoolean186) {
							local93 = 4;
							local538 = local505 * 2 + 6;
							local543 = Static292.method4838(local55, arg8);
							for (local545 = 0; local545 < 3; local545++) {
								local538 &= 0x7;
								local93 &= 0x7;
								if (Static158.aBooleanArrayArray2[local72][local538] && local55.anInt2427 >= Static262.anIntArray108[local93]) {
									Static242.anIntArray484[local93] = local55.anInt2431;
									Static304.anIntArray359[local93] = local543;
									Static97.anIntArray194[local93] = arg8.method4882() ? local55.anInt2437 : local55.anInt2439;
									Static308.anIntArray589[local93] = local55.anInt2426;
									if (Static262.anIntArray108[local93] == local55.anInt2427) {
										Static240.anIntArray598[local93] |= 0x4;
									} else {
										Static240.anIntArray598[local93] = 4;
									}
									Static262.anIntArray108[local93] = local55.anInt2427;
								}
								local93--;
								local538++;
							}
							if (!local29[arg6 + 1 & 0x3]) {
								arg0[1] = Static135.aBooleanArrayArray1[local72][local505 + 3 & 0x3];
							}
						} else if (!local29[arg6 + 1 & 0x3]) {
							arg0[1] = Static294.aBooleanArrayArray6[local72][local505 + 3 & 0x3];
						}
					}
				}
			}
		}
		if (arg2 == null) {
			return;
		}
		@Pc(1238) int local1238 = Static292.method4838(arg2, arg8);
		if (!arg2.aBoolean186) {
			return;
		}
		for (local45 = 0; local45 < 8; local45++) {
			@Pc(1253) int local1253 = local45 - arg6 * 2 & 0x7;
			if (Static158.aBooleanArrayArray2[arg5][local45] && Static262.anIntArray108[local1253] <= arg2.anInt2427) {
				Static242.anIntArray484[local1253] = arg2.anInt2431;
				Static304.anIntArray359[local1253] = local1238;
				Static97.anIntArray194[local1253] = arg8.method4882() ? arg2.anInt2437 : arg2.anInt2439;
				Static308.anIntArray589[local1253] = arg2.anInt2426;
				if (arg2.anInt2427 == Static262.anIntArray108[local1253]) {
					Static240.anIntArray598[local1253] |= 0x2;
				} else {
					Static240.anIntArray598[local1253] = 2;
				}
				Static262.anIntArray108[local1253] = arg2.anInt2427;
			}
		}
		return;
	}

	@OriginalMember(owner = "client!iu", name = "a", descriptor = "(Lclient!np;[Lclient!ee;[[[II)V")
	public final void method2431(@OriginalArg(0) Class155 arg0, @OriginalArg(1) Class67[] arg1, @OriginalArg(2) int[][][] arg2) {
		@Pc(6) int local6;
		@Pc(10) int local10;
		@Pc(14) int local14;
		if (!this.aBoolean215) {
			for (local6 = 0; local6 < 4; local6++) {
				for (local10 = 0; local10 < this.anInt2825; local10++) {
					for (local14 = 0; local14 < this.anInt2839; local14++) {
						if ((Static13.aByteArrayArrayArray17[local6][local10][local14] & 0x1) != 0) {
							@Pc(28) int local28 = local6;
							if ((Static13.aByteArrayArrayArray17[1][local10][local14] & 0x2) != 0) {
								local28 = local6 - 1;
							}
							if (local28 >= 0) {
								arg1[local28].method1322(local14, local10);
							}
						}
					}
				}
			}
		}
		for (local6 = 0; local6 < this.anInt2835; local6++) {
			local10 = 0;
			local14 = 0;
			if (!this.aBoolean215) {
				if (Static290.aBoolean399) {
					local10 = 2;
				}
				if (Static330.aBoolean433) {
					local14 = 8;
				}
				if (Static262.anInt1204 != 0) {
					if (Static73.aBoolean126 | local6 == 0) {
						local14 |= 0x10;
					}
					local10 |= 0x1;
				}
			}
			if (Static290.aBoolean399) {
				local14 |= 0x7;
			}
			@Pc(141) int[][] local141 = arg2 == null || local6 >= arg2.length ? this.anIntArrayArrayArray13[local6] : arg2[local6];
			Static144.method2283(local6, arg0.method4872(this.anInt2825, this.anInt2839, this.anIntArrayArrayArray13[local6], local141, local10, local14));
		}
	}

	@OriginalMember(owner = "client!iu", name = "a", descriptor = "([Lclient!ee;IBIILclient!rp;I)V")
	public final void method2432(@OriginalArg(0) Class67[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class3_Sub5 arg4, @OriginalArg(6) int arg5) {
		@Pc(10) int local10;
		@Pc(18) int local18;
		@Pc(22) int local22;
		@Pc(28) int local28;
		if (!this.aBoolean215) {
			for (local10 = 0; local10 < 4; local10++) {
				@Pc(16) Class67 local16 = arg0[local10];
				for (local18 = 0; local18 < 64; local18++) {
					for (local22 = 0; local22 < 64; local22++) {
						local28 = arg3 + local18;
						@Pc(32) int local32 = local22 + arg5;
						if (local28 >= 0 && this.anInt2825 > local28 && local32 >= 0 && this.anInt2839 > local32) {
							local16.method1333(local28, local32);
						}
					}
				}
			}
		}
		local10 = arg2 + arg3;
		@Pc(72) int local72 = arg1 + arg5;
		for (local18 = 0; local18 < this.anInt2835; local18++) {
			for (local22 = 0; local22 < 64; local22++) {
				for (local28 = 0; local28 < 64; local28++) {
					this.method2428(local10 + local22, local72 - -local28, arg5 + local28, 0, local18, 0, false, arg3 + local22, arg4, 0);
				}
			}
		}
	}

	@OriginalMember(owner = "client!iu", name = "a", descriptor = "([Lclient!ee;IBIILclient!rp;IIII)V")
	public final void method2433(@OriginalArg(0) Class67[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class3_Sub5 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(11) int local11 = (arg1 & 0x7) * 8;
		@Pc(20) int local20;
		@Pc(50) int local50;
		if (!this.aBoolean215) {
			@Pc(18) Class67 local18 = arg0[arg6];
			for (local20 = 0; local20 < 8; local20++) {
				for (@Pc(24) int local24 = 0; local24 < 8; local24++) {
					@Pc(38) int local38 = Static165.method2519(local20 & 0x7, local24 & 0x7, arg7) + arg8;
					local50 = Static256.method4151(local20 & 0x7, arg7, local24 & 0x7) + arg3;
					if (local38 > 0 && local38 < this.anInt2825 - 1 && local50 > 0 && local50 < this.anInt2839 - 1) {
						local18.method1333(local38, local50);
					}
				}
			}
		}
		@Pc(96) int local96 = (arg5 & 0x7) * 8;
		@Pc(102) int local102 = (arg1 & 0xFFFFFFF8) << 3;
		local20 = (arg5 & 0xFFFFFFF8) << 3;
		@Pc(116) byte local116 = 0;
		@Pc(118) byte local118 = 0;
		if (arg7 == 1) {
			local118 = 1;
		} else if (arg7 == 2) {
			local116 = 1;
			local118 = 1;
		} else if (arg7 == 3) {
			local116 = 1;
		}
		for (local50 = 0; local50 < this.anInt2835; local50++) {
			for (@Pc(145) int local145 = 0; local145 < 64; local145++) {
				for (@Pc(149) int local149 = 0; local149 < 64; local149++) {
					if (arg2 == local50 && local145 >= local11 && local11 + 8 >= local145 && local96 <= local149 && local149 <= local96 + 8) {
						@Pc(216) int local216;
						@Pc(209) int local209;
						if (local145 == local11 + 8 || local96 + 8 == local149) {
							if (arg7 == 0) {
								local209 = arg3 + local149 - local96;
								local216 = arg8 + local145 - local11;
							} else if (arg7 == 1) {
								local216 = local149 + arg8 - local96;
								local209 = arg3 + local11 + 8 - local145;
							} else if (arg7 == 2) {
								local216 = local11 + arg8 + 8 - local145;
								local209 = arg3 + local96 + 8 - local149;
							} else {
								local209 = local145 + arg3 - local11;
								local216 = arg8 + local96 + 8 - local149;
							}
							this.method2428(local102 + local145, local149 + local20, local209, 0, arg6, 0, true, local216, arg4, 0);
						} else {
							local216 = Static165.method2519(local145 & 0x7, local149 & 0x7, arg7) + arg8;
							local209 = Static256.method4151(local145 & 0x7, arg7, local149 & 0x7) + arg3;
							this.method2428(local102 + local145, local149 + local20, local209, arg7, arg6, local118, false, local216, arg4, local116);
							if (local145 == 63 || local149 == 63) {
								@Pc(351) int local351 = local145 == 63 ? 64 : local145;
								@Pc(360) int local360 = local149 == 63 ? 64 : local149;
								@Pc(385) int local385;
								@Pc(378) int local378;
								if (arg7 == 0) {
									local378 = local360 + arg3 - local96;
									local385 = local351 + arg8 - local11;
								} else if (arg7 == 1) {
									local378 = local11 + arg3 + 8 - local351;
									local385 = local360 + arg8 - local96;
								} else if (arg7 == 2) {
									local385 = arg8 + local11 + 8 - local351;
									local378 = local96 + arg3 + 8 - local360;
								} else {
									local385 = local96 + arg8 + 8 - local360;
									local378 = local351 + arg3 - local11;
								}
								if (local385 >= 0 && local385 < this.anInt2825 && local378 >= 0 && this.anInt2839 > local378) {
									this.anIntArrayArrayArray13[arg6][local385][local378] = this.anIntArrayArrayArray13[arg6][local116 + local216][local118 + local209];
								}
							}
						}
					} else {
						this.method2428(0, 0, -1, 0, 0, 0, false, -1, arg4, 0);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!iu", name = "a", descriptor = "(IIIII)V")
	public final void method2434(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		for (@Pc(7) int local7 = 0; local7 < this.anInt2835; local7++) {
			this.method2429(64, arg0, 64, arg1, local7);
		}
	}

	@OriginalMember(owner = "client!iu", name = "a", descriptor = "(II[[I)V")
	public final void method2435(@OriginalArg(2) int[][] arg0) {
		@Pc(10) int[][] local10 = this.anIntArrayArrayArray13[0];
		for (@Pc(12) int local12 = 0; local12 < this.anInt2825 + 1; local12++) {
			for (@Pc(16) int local16 = 0; local16 < this.anInt2839 + 1; local16++) {
				local10[local12][local16] += arg0[local12][local16];
			}
		}
	}

	@OriginalMember(owner = "client!iu", name = "a", descriptor = "(Lclient!pl;Lclient!np;Lclient!pl;Lclient!pl;I[[IB)V")
	private void method2436(@OriginalArg(0) Class7 arg0, @OriginalArg(1) Class155 arg1, @OriginalArg(2) Class7 arg2, @OriginalArg(3) Class7 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[][] arg5) {
		@Pc(10) byte[][] local10 = this.aByteArrayArrayArray14[arg4];
		@Pc(15) byte[][] local15 = this.aByteArrayArrayArray15[arg4];
		@Pc(20) byte[][] local20 = this.aByteArrayArrayArray13[arg4];
		@Pc(25) byte[][] local25 = this.aByteArrayArrayArray12[arg4];
		for (@Pc(27) int local27 = 0; local27 < this.anInt2825; local27++) {
			@Pc(43) int local43 = this.anInt2825 - 1 > local27 ? local27 + 1 : local27;
			for (@Pc(45) int local45 = 0; local45 < this.anInt2839; local45++) {
				@Pc(59) int local59 = local45 >= this.anInt2839 - 1 ? local45 : local45 + 1;
				if (Static46.anInt956 == -1 || Static11.method5237(Static46.anInt956, local45, arg4, local27)) {
					@Pc(74) boolean local74 = false;
					@Pc(76) boolean local76 = false;
					@Pc(79) boolean[] local79 = new boolean[4];
					@Pc(85) int local85 = local10[local27][local45];
					@Pc(91) int local91 = local15[local27][local45];
					@Pc(99) int local99 = local25[local27][local45] & 0xFF;
					@Pc(107) int local107 = local20[local27][local45] & 0xFF;
					@Pc(115) int local115 = local20[local27][local59] & 0xFF;
					@Pc(123) int local123 = local20[local43][local59] & 0xFF;
					@Pc(131) int local131 = local20[local43][local45] & 0xFF;
					if (local99 != 0 || local107 != 0) {
						@Pc(153) Class100 local153 = local99 == 0 ? null : this.aClass134_6.method2930(local99 - 1);
						@Pc(168) Class147 local168 = local107 == 0 ? null : this.aClass210_5.method4766(local107 - 1);
						if (local85 == 0 && local153 == null) {
							local85 = 12;
						}
						@Pc(176) Class100 local176 = local153;
						if (local153 != null) {
							if (local153.anInt2431 == -1 && local153.anInt2429 == -1) {
								local176 = local153;
								local153 = null;
							} else if (local168 != null && local85 != 0) {
								local76 = local153.aBoolean186;
							}
						}
						@Pc(292) int local292;
						@Pc(313) int local313;
						@Pc(382) int local382;
						@Pc(394) int local394;
						if ((local85 == 0 || local85 == 12) && local27 > 0 && local45 > 0 && this.anInt2825 > local27 && local45 < this.anInt2839) {
							@Pc(258) int local258 = local20[local43][local45 - 1] == local107 ? 1 : -1;
							@Pc(271) int local271 = local20[local43][local59] == local107 ? 1 : -1;
							local292 = local20[local27 - 1][local45 - 1] == local107 ? 1 : -1;
							local313 = local107 == local20[local27 - 1][local59] ? 1 : -1;
							if (local107 == local20[local27][local45 - 1]) {
								local258++;
								local292++;
							} else {
								local292--;
								local258--;
							}
							if (local107 == local20[local43][local45]) {
								local258++;
								local271++;
							} else {
								local258--;
								local271--;
							}
							if (local20[local27][local59] == local107) {
								local313++;
								local271++;
							} else {
								local313--;
								local271--;
							}
							if (local107 == local20[local27 - 1][local45]) {
								local313++;
								local292++;
							} else {
								local292--;
								local313--;
							}
							local382 = local292 - local271;
							if (local382 < 0) {
								local382 = -local382;
							}
							local394 = local258 - local313;
							if (local394 < 0) {
								local394 = -local394;
							}
							if (local394 == local382) {
								local382 = arg3.method5648(local27, local45) - arg3.method5648(local43, local59);
								if (local382 < 0) {
									local382 = -local382;
								}
								local394 = arg3.method5648(local43, local45) - arg3.method5648(local27, local59);
								if (local394 < 0) {
									local394 = -local394;
								}
							}
							local91 = local382 < local394 ? 1 : 0;
						}
						for (local292 = 0; local292 < 13; local292++) {
							Static262.anIntArray108[local292] = -1;
							Static240.anIntArray598[local292] = 1;
						}
						@Pc(469) boolean[] local469 = local153 != null && local153.aBoolean186 ? Static135.aBooleanArrayArray1[local85] : Static294.aBooleanArrayArray6[local85];
						this.method2430(local79, local10, local153, this.anInt2839, local168, local85, local91, this.anInt2825, arg1, local25, local15, local27, local45);
						@Pc(498) boolean local498 = local153 != null && local153.anInt2431 != local153.anInt2429;
						if (!local498) {
							for (local313 = 0; local313 < 8; local313++) {
								if (Static262.anIntArray108[local313] >= 0 && Static242.anIntArray484[local313] != Static304.anIntArray359[local313]) {
									local498 = true;
									break;
								}
							}
						}
						if (!local469[local91 + 1 & 0x3]) {
							local79[1] = Static97.method1629(local79[1], (Static240.anIntArray598[4] & Static240.anIntArray598[2]) == 0);
						}
						if (!local469[local91 + 3 & 0x3]) {
							local79[3] = Static97.method1629(local79[3], (Static240.anIntArray598[0] & Static240.anIntArray598[6]) == 0);
						}
						if (!local469[local91 & 0x3]) {
							local79[0] = Static97.method1629(local79[0], (Static240.anIntArray598[2] & Static240.anIntArray598[0]) == 0);
						}
						if (!local469[local91 + 2 & 0x3]) {
							local79[2] = Static97.method1629(local79[2], (Static240.anIntArray598[4] & Static240.anIntArray598[6]) == 0);
						}
						if (!local76 && (local85 == 0 || local85 == 12)) {
							if (local79[0] && !local79[1] && !local79[2] && local79[3]) {
								local91 = 0;
								local85 = local85 == 0 ? 13 : 14;
								local79[0] = local79[3] = false;
							} else if (local79[0] && local79[1] && !local79[2] && !local79[3]) {
								local79[0] = local79[1] = false;
								local91 = 3;
								local85 = local85 == 0 ? 13 : 14;
							} else if (!local79[0] && local79[1] && local79[2] && !local79[3]) {
								local79[1] = local79[2] = false;
								local91 = 2;
								local85 = local85 == 0 ? 13 : 14;
							} else if (!local79[0] && !local79[1] && local79[2] && local79[3]) {
								local91 = 1;
								local79[2] = local79[3] = false;
								local85 = local85 == 0 ? 13 : 14;
							}
						}
						@Pc(805) boolean local805 = !local76 && !local79[0] && !local79[2] && !local79[1] && !local79[3];
						@Pc(807) int[] local807 = null;
						@Pc(815) int[] local815;
						@Pc(839) int[] local839;
						@Pc(843) int[] local843;
						if (local805) {
							local843 = Static312.anIntArrayArray49[local85];
							local394 = local153 == null ? 0 : Static140.anIntArray281[local85];
							local839 = Static162.anIntArrayArray28[local85];
							local815 = Static61.anIntArrayArray12[local85];
							local382 = local168 == null ? 0 : Static303.anIntArray583[local85];
						} else if (local76) {
							local843 = Static291.anIntArrayArray45[local85];
							local394 = local153 == null ? 0 : Static105.anIntArray206[local85];
							local382 = local168 == null ? 0 : Static28.anIntArray40[local85];
							local839 = Static369.anIntArrayArray54[local85];
							local815 = Static393.anIntArrayArray62[local85];
							local807 = Static150.anIntArrayArray42[local85];
						} else {
							local815 = Static204.anIntArrayArray44[local85];
							local394 = local153 == null ? 0 : Static115.anIntArray218[local85];
							local382 = local168 == null ? 0 : Static214.anIntArray413[local85];
							local807 = Static392.anIntArrayArray61[local85];
							local839 = Static161.anIntArrayArray27[local85];
							local843 = Static358.anIntArrayArray51[local85];
						}
						@Pc(909) int local909 = local382 + local394;
						if (local909 <= 0) {
							Static172.method3206(arg4, local27, local45);
						} else {
							if (local79[0]) {
								local909++;
							}
							if (local79[2]) {
								local909++;
							}
							if (local79[1]) {
								local909++;
							}
							if (local79[3]) {
								local909++;
							}
							@Pc(942) int local942 = 0;
							@Pc(944) int local944 = 0;
							@Pc(948) int local948 = local909 * 3;
							@Pc(955) int[] local955 = local498 ? new int[local948] : null;
							@Pc(958) int[] local958 = new int[local948];
							@Pc(961) int[] local961 = new int[local948];
							@Pc(964) int[] local964 = new int[local948];
							@Pc(967) int[] local967 = new int[local948];
							@Pc(970) int[] local970 = new int[local948];
							@Pc(977) int[] local977 = arg2 == null ? null : new int[local948];
							@Pc(986) int[] local986 = arg2 == null && arg0 == null ? null : new int[local948];
							@Pc(988) int local988 = -1;
							@Pc(990) int local990 = -1;
							@Pc(992) int local992 = 256;
							@Pc(1106) byte local1106;
							@Pc(1014) int local1014;
							@Pc(1016) int local1016;
							@Pc(1256) int local1256;
							@Pc(1262) int local1262;
							@Pc(1271) int local1271;
							@Pc(1275) int local1275;
							@Pc(1286) int local1286;
							@Pc(1279) int local1279;
							@Pc(1291) int local1291;
							@Pc(1349) int local1349;
							@Pc(1355) int local1355;
							if (local153 != null) {
								local988 = local153.anInt2431;
								local990 = arg1.method4882() ? local153.anInt2437 : local153.anInt2439;
								local992 = local153.anInt2426;
								local1014 = Static292.method4838(local153, arg1);
								for (local1016 = 0; local1016 < local394; local1016++) {
									if (local79[-local91 & 0x3] && local807[0] == local942) {
										Static140.anIntArray283[0] = local815[local942];
										Static140.anIntArray283[1] = 1;
										Static140.anIntArray283[2] = local843[local942];
										Static140.anIntArray283[3] = 1;
										Static140.anIntArray283[4] = local839[local942];
										Static140.anIntArray283[5] = local843[local942];
										local1106 = 6;
									} else if (local79[2 - local91 & 0x3] && local807[2] == local942) {
										Static140.anIntArray283[0] = local815[local942];
										Static140.anIntArray283[1] = 5;
										Static140.anIntArray283[2] = local843[local942];
										Static140.anIntArray283[3] = 5;
										Static140.anIntArray283[4] = local839[local942];
										Static140.anIntArray283[5] = local843[local942];
										local1106 = 6;
									} else if (local79[1 - local91 & 0x3] && local807[1] == local942) {
										Static140.anIntArray283[0] = local815[local942];
										Static140.anIntArray283[1] = 3;
										Static140.anIntArray283[2] = local843[local942];
										Static140.anIntArray283[3] = 3;
										Static140.anIntArray283[4] = local839[local942];
										Static140.anIntArray283[5] = local843[local942];
										local1106 = 6;
									} else if (local79[3 - local91 & 0x3] && local942 == local807[3]) {
										Static140.anIntArray283[0] = local815[local942];
										Static140.anIntArray283[1] = 7;
										Static140.anIntArray283[2] = local843[local942];
										Static140.anIntArray283[3] = 7;
										Static140.anIntArray283[4] = local839[local942];
										Static140.anIntArray283[5] = local843[local942];
										local1106 = 6;
									} else {
										Static140.anIntArray283[0] = local815[local942];
										Static140.anIntArray283[1] = local839[local942];
										local1106 = 3;
										Static140.anIntArray283[2] = local843[local942];
									}
									local942++;
									for (local1256 = 0; local1256 < local1106; local1256++) {
										local1262 = Static140.anIntArray283[local1256];
										local1271 = local1262 - local91 * 2 & 0x7;
										local1275 = Static236.anIntArray447[local1262];
										local1279 = Static278.anIntArray536[local1262];
										if (local91 == 1) {
											local1286 = local1279;
											local1291 = 128 - local1275;
										} else if (local91 == 2) {
											local1291 = 128 - local1279;
											local1286 = 128 - local1275;
										} else if (local91 == 3) {
											local1286 = 128 - local1279;
											local1291 = local1275;
										} else {
											local1291 = local1279;
											local1286 = local1275;
										}
										local958[local944] = local1286;
										local961[local944] = local1291;
										if (local977 != null && Static158.aBooleanArrayArray2[local85][local1262]) {
											local1349 = local1286 + (local27 << 7);
											local1355 = local1291 + (local45 << 7);
											local977[local944] = arg2.method5638(local1349, local1355) - arg3.method5638(local1349, local1355);
										}
										if (local986 != null) {
											if (arg2 != null && !Static158.aBooleanArrayArray2[local85][local1262]) {
												local1349 = local1286 + (local27 << 7);
												local1355 = local1291 + (local45 << 7);
												local986[local944] = arg3.method5638(local1349, local1355) - arg2.method5638(local1349, local1355);
											} else if (arg0 != null && !Static280.aBooleanArrayArray5[local85][local1262]) {
												local1349 = (local27 << 7) + local1286;
												local1355 = (local45 << 7) + local1291;
												local986[local944] = arg0.method5638(local1349, local1355) - arg3.method5638(local1349, local1355);
											}
										}
										if (local1262 < 8 && Static262.anIntArray108[local1271] > local153.anInt2427) {
											if (local955 != null) {
												local955[local944] = Static304.anIntArray359[local1271];
											}
											local970[local944] = Static308.anIntArray589[local1271];
											local967[local944] = Static97.anIntArray194[local1271];
											local964[local944] = Static242.anIntArray484[local1271];
										} else {
											if (local955 != null) {
												local955[local944] = local1014;
											}
											local967[local944] = arg1.method4882() ? local153.anInt2437 : local153.anInt2439;
											local970[local944] = local153.anInt2426;
											local964[local944] = local988;
										}
										local944++;
									}
								}
								if (!this.aBoolean215 && arg4 == 0) {
									Static325.method5009(local27, local45, local153.anInt2432, local153.anInt2428 * 8, local153.anInt2436);
								}
								if (local85 != 12 && local153.anInt2431 != -1 && local153.aBoolean184) {
									local74 = true;
								}
							} else if (local805) {
								local942 = Static140.anIntArray281[local85];
							} else if (local76) {
								local942 = Static105.anIntArray206[local85];
							} else {
								local942 = Static115.anIntArray218[local85];
							}
							if (local168 != null) {
								if (local123 == 0) {
									local123 = local107;
								}
								if (local131 == 0) {
									local131 = local107;
								}
								if (local115 == 0) {
									local115 = local107;
								}
								@Pc(1602) Class147 local1602 = this.aClass210_5.method4766(local107 - 1);
								@Pc(1610) Class147 local1610 = this.aClass210_5.method4766(local115 - 1);
								@Pc(1618) Class147 local1618 = this.aClass210_5.method4766(local123 - 1);
								@Pc(1626) Class147 local1626 = this.aClass210_5.method4766(local131 - 1);
								for (local1271 = 0; local1271 < local382; local1271++) {
									if (local79[-local91 & 0x3] && local942 == local807[0]) {
										Static140.anIntArray283[0] = local815[local942];
										Static140.anIntArray283[1] = 1;
										Static140.anIntArray283[2] = local843[local942];
										Static140.anIntArray283[3] = 1;
										Static140.anIntArray283[4] = local839[local942];
										Static140.anIntArray283[5] = local843[local942];
										local1106 = 6;
									} else if (local79[2 - local91 & 0x3] && local942 == local807[2]) {
										Static140.anIntArray283[0] = local815[local942];
										Static140.anIntArray283[1] = 5;
										Static140.anIntArray283[2] = local843[local942];
										Static140.anIntArray283[3] = 5;
										Static140.anIntArray283[4] = local839[local942];
										local1106 = 6;
										Static140.anIntArray283[5] = local843[local942];
									} else if (local79[1 - local91 & 0x3] && local807[1] == local942) {
										Static140.anIntArray283[0] = local815[local942];
										Static140.anIntArray283[1] = 3;
										Static140.anIntArray283[2] = local843[local942];
										Static140.anIntArray283[3] = 3;
										Static140.anIntArray283[4] = local839[local942];
										Static140.anIntArray283[5] = local843[local942];
										local1106 = 6;
									} else if (local79[3 - local91 & 0x3] && local807[3] == local942) {
										Static140.anIntArray283[0] = local815[local942];
										Static140.anIntArray283[1] = 7;
										Static140.anIntArray283[2] = local843[local942];
										Static140.anIntArray283[3] = 7;
										Static140.anIntArray283[4] = local839[local942];
										Static140.anIntArray283[5] = local843[local942];
										local1106 = 6;
									} else {
										Static140.anIntArray283[0] = local815[local942];
										Static140.anIntArray283[1] = local839[local942];
										local1106 = 3;
										Static140.anIntArray283[2] = local843[local942];
									}
									local942++;
									for (local1275 = 0; local1275 < local1106; local1275++) {
										local1286 = Static140.anIntArray283[local1275];
										local1279 = local1286 - local91 * 2 & 0x7;
										local1291 = Static236.anIntArray447[local1286];
										local1355 = Static278.anIntArray536[local1286];
										@Pc(1893) int local1893;
										if (local91 == 1) {
											local1893 = 128 - local1291;
											local1349 = local1355;
										} else if (local91 == 2) {
											local1893 = 128 - local1355;
											local1349 = 128 - local1291;
										} else if (local91 == 3) {
											local1893 = local1291;
											local1349 = 128 - local1355;
										} else {
											local1349 = local1291;
											local1893 = local1355;
										}
										local958[local944] = local1349;
										local961[local944] = local1893;
										@Pc(1951) int local1951;
										@Pc(1957) int local1957;
										if (local977 != null && Static158.aBooleanArrayArray2[local85][local1286]) {
											local1951 = local1349 + (local27 << 7);
											local1957 = (local45 << 7) + local1893;
											local977[local944] = arg2.method5638(local1951, local1957) - arg3.method5638(local1951, local1957);
										}
										if (local986 != null) {
											if (arg2 != null && !Static158.aBooleanArrayArray2[local85][local1286]) {
												local1951 = local1349 + (local27 << 7);
												local1957 = local1893 + (local45 << 7);
												local986[local944] = arg3.method5638(local1951, local1957) - arg2.method5638(local1951, local1957);
											} else if (arg0 != null && !Static280.aBooleanArrayArray5[local85][local1286]) {
												local1951 = (local27 << 7) + local1349;
												local1957 = local1893 + (local45 << 7);
												local986[local944] = arg0.method5638(local1951, local1957) - arg3.method5638(local1951, local1957);
											}
										}
										if (local1286 < 8 && Static262.anIntArray108[local1279] >= 0) {
											if (local955 != null) {
												local955[local944] = Static304.anIntArray359[local1279];
											}
											local970[local944] = Static308.anIntArray589[local1279];
											local967[local944] = Static97.anIntArray194[local1279];
											local964[local944] = Static242.anIntArray484[local1279];
										} else {
											if (local76 && Static158.aBooleanArrayArray2[local85][local1286]) {
												local967[local944] = local990;
												local970[local944] = local992;
												local964[local944] = local988;
											} else if (local1349 == 0 && local1893 == 0) {
												local964[local944] = arg5[local27][local45];
												local967[local944] = local1602.anInt3617;
												local970[local944] = local1602.anInt3613;
											} else if (local1349 == 0 && local1893 == 128) {
												local964[local944] = arg5[local27][local59];
												local967[local944] = local1610.anInt3617;
												local970[local944] = local1610.anInt3613;
											} else if (local1349 == 128 && local1893 == 128) {
												local964[local944] = arg5[local43][local59];
												local967[local944] = local1618.anInt3617;
												local970[local944] = local1618.anInt3613;
											} else if (local1349 == 128 && local1893 == 0) {
												local964[local944] = arg5[local43][local45];
												local967[local944] = local1626.anInt3617;
												local970[local944] = local1626.anInt3613;
											} else {
												if (local1349 < 64) {
													if (local1893 < 64) {
														local967[local944] = local1602.anInt3617;
														local970[local944] = local1602.anInt3613;
													} else {
														local967[local944] = local1610.anInt3617;
														local970[local944] = local1610.anInt3613;
													}
												} else if (local1893 < 64) {
													local967[local944] = local1626.anInt3617;
													local970[local944] = local1626.anInt3613;
												} else {
													local967[local944] = local1618.anInt3617;
													local970[local944] = local1618.anInt3613;
												}
												local1951 = Static191.method3043(local1349 << 7 >> 7, arg5[local27][local45], arg5[local43][local45]);
												local1957 = Static191.method3043(local1349 << 7 >> 7, arg5[local27][local59], arg5[local43][local59]);
												local964[local944] = Static191.method3043(local1893 << 7 >> 7, local1951, local1957);
											}
											if (local955 != null) {
												local955[local944] = local964[local944];
											}
										}
										local944++;
									}
								}
								if (local85 != 0 && local168.aBoolean262) {
									local74 = true;
								}
							}
							local1014 = arg3.method5648(local27, local45);
							local1016 = arg3.method5648(local43, local45);
							local1256 = arg3.method5648(local43, local59);
							local1262 = arg3.method5648(local27, local59);
							if (arg4 > 0) {
								@Pc(2374) boolean local2374 = true;
								if (local107 == 0 && local85 != 0) {
									local2374 = false;
								}
								if (local99 > 0 && local176 != null && !local176.aBoolean185) {
									local2374 = false;
								}
								if (local2374 && local1014 == local1016 && local1014 == local1256 && local1262 == local1014) {
									this.aByteArrayArrayArray16[arg4][local27][local45] = (byte) (this.aByteArrayArrayArray16[arg4][local27][local45] | 0x4);
								}
							}
							local1271 = 0;
							local1275 = 0;
							local1286 = 0;
							if (this.aBoolean215) {
								local1271 = Static329.method5021(local27, local45);
								local1275 = Static368.method5522(local27, local45);
								local1286 = Static328.method5019(local27, local45);
							}
							arg3.method5649(local27, local45, local958, local977, local961, local986, local964, local955, local967, local970, local1271, local1275, local1286, local74);
							Static172.method3206(arg4, local27, local45);
						}
					}
				}
			}
		}
	}
}
