import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ria")
public class Class81 {

	@OriginalMember(owner = "client!ria", name = "d", descriptor = "[[[B")
	public byte[][][] aByteArrayArrayArray9;

	@OriginalMember(owner = "client!ria", name = "o", descriptor = "[I")
	private final int[] anIntArray99 = new int[] { 0, 256, 512, 512, 512, 256, 0, 0, 128, 256, 128, 384, 256 };

	@OriginalMember(owner = "client!ria", name = "q", descriptor = "[I")
	private final int[] anIntArray100 = new int[] { 0, 0, 0, 256, 512, 512, 512, 256, 256, 384, 128, 128, 256 };

	@OriginalMember(owner = "client!ria", name = "n", descriptor = "Z")
	public final boolean aBoolean164;

	@OriginalMember(owner = "client!ria", name = "s", descriptor = "I")
	public final int anInt2418;

	@OriginalMember(owner = "client!ria", name = "j", descriptor = "I")
	protected final int anInt2414;

	@OriginalMember(owner = "client!ria", name = "u", descriptor = "Lclient!sv;")
	private final Class315 aClass315_3;

	@OriginalMember(owner = "client!ria", name = "x", descriptor = "Lclient!nt;")
	private final Class238 aClass238_3;

	@OriginalMember(owner = "client!ria", name = "a", descriptor = "I")
	protected final int anInt2408;

	@OriginalMember(owner = "client!ria", name = "v", descriptor = "[[[B")
	private final byte[][][] aByteArrayArrayArray14;

	@OriginalMember(owner = "client!ria", name = "g", descriptor = "[[[B")
	private final byte[][][] aByteArrayArrayArray11;

	@OriginalMember(owner = "client!ria", name = "m", descriptor = "[[[I")
	public final int[][][] anIntArrayArrayArray8;

	@OriginalMember(owner = "client!ria", name = "t", descriptor = "[[[B")
	private final byte[][][] aByteArrayArrayArray13;

	@OriginalMember(owner = "client!ria", name = "k", descriptor = "[[[B")
	private final byte[][][] aByteArrayArrayArray12;

	@OriginalMember(owner = "client!ria", name = "f", descriptor = "[[[B")
	protected byte[][][] aByteArrayArrayArray10;

	@OriginalMember(owner = "client!ria", name = "<init>", descriptor = "(IIIZLclient!sv;Lclient!nt;)V")
	protected Class81(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) Class315 arg4, @OriginalArg(5) Class238 arg5) {
		this.aBoolean164 = arg3;
		this.anInt2418 = arg0;
		this.anInt2414 = arg1;
		this.aClass315_3 = arg4;
		this.aClass238_3 = arg5;
		this.anInt2408 = arg2;
		this.aByteArrayArrayArray14 = new byte[this.anInt2418][this.anInt2414][this.anInt2408];
		this.aByteArrayArrayArray11 = new byte[this.anInt2418][this.anInt2414][this.anInt2408];
		this.anIntArrayArrayArray8 = new int[this.anInt2418][this.anInt2414 + 1][this.anInt2408 + 1];
		this.aByteArrayArrayArray13 = new byte[this.anInt2418][this.anInt2414][this.anInt2408];
		this.aByteArrayArrayArray12 = new byte[this.anInt2418][this.anInt2414][this.anInt2408];
		this.aByteArrayArrayArray10 = new byte[this.anInt2418][this.anInt2414 + 1][this.anInt2408 + 1];
	}

	@OriginalMember(owner = "client!ria", name = "a", descriptor = "(Lclient!s;Lclient!ha;ILclient!s;)V")
	public final void method2274(@OriginalArg(0) Class51 arg0, @OriginalArg(1) Class5 arg1, @OriginalArg(3) Class51 arg2) {
		if (Static177.anIntArray178 == null || this.anInt2408 != Static177.anIntArray178.length) {
			Static364.anIntArray475 = new int[this.anInt2408];
			Static177.anIntArray178 = new int[this.anInt2408];
			Static76.anIntArray60 = new int[this.anInt2408];
			Static607.anIntArray658 = new int[this.anInt2408];
			Static342.anIntArray397 = new int[this.anInt2408];
		}
		@Pc(38) int[][] local38 = new int[this.anInt2414][this.anInt2408];
		@Pc(44) int local44;
		for (@Pc(40) int local40 = 0; local40 < this.anInt2418; local40++) {
			for (local44 = 0; local44 < this.anInt2408; local44++) {
				Static177.anIntArray178[local44] = 0;
				Static364.anIntArray475[local44] = 0;
				Static342.anIntArray397[local44] = 0;
				Static76.anIntArray60[local44] = 0;
				Static607.anIntArray658[local44] = 0;
			}
			for (@Pc(77) int local77 = -5; local77 < this.anInt2414; local77++) {
				@Pc(87) int local87;
				@Pc(106) int local106;
				@Pc(178) int local178;
				for (@Pc(81) int local81 = 0; local81 < this.anInt2408; local81++) {
					local87 = local77 + 5;
					@Pc(155) int local155;
					if (local87 < this.anInt2414) {
						local106 = this.aByteArrayArrayArray12[local40][local87][local81] & 0xFF;
						if (local106 > 0) {
							@Pc(119) Class162 local119 = this.aClass238_3.method6221(local106 - 1);
							Static177.anIntArray178[local81] += local119.anInt4620;
							Static364.anIntArray475[local81] += local119.anInt4619;
							Static342.anIntArray397[local81] += local119.anInt4617;
							Static76.anIntArray60[local81] += local119.anInt4613;
							local155 = Static607.anIntArray658[local81]++;
						}
					}
					local106 = local77 - 5;
					if (local106 >= 0) {
						local178 = this.aByteArrayArrayArray12[local40][local106][local81] & 0xFF;
						if (local178 > 0) {
							@Pc(188) Class162 local188 = this.aClass238_3.method6221(local178 - 1);
							Static177.anIntArray178[local81] -= local188.anInt4620;
							Static364.anIntArray475[local81] -= local188.anInt4619;
							Static342.anIntArray397[local81] -= local188.anInt4617;
							Static76.anIntArray60[local81] -= local188.anInt4613;
							local155 = Static607.anIntArray658[local81]--;
						}
					}
				}
				if (local77 >= 0) {
					local87 = 0;
					local106 = 0;
					local178 = 0;
					@Pc(242) int local242 = 0;
					@Pc(244) int local244 = 0;
					for (@Pc(246) int local246 = -5; local246 < this.anInt2408; local246++) {
						@Pc(252) int local252 = local246 + 5;
						if (local252 < this.anInt2408) {
							local87 += Static177.anIntArray178[local252];
							local244 += Static607.anIntArray658[local252];
							local106 += Static364.anIntArray475[local252];
							local242 += Static76.anIntArray60[local252];
							local178 += Static342.anIntArray397[local252];
						}
						@Pc(294) int local294 = local246 - 5;
						if (local294 >= 0) {
							local244 -= Static607.anIntArray658[local294];
							local87 -= Static177.anIntArray178[local294];
							local106 -= Static364.anIntArray475[local294];
							local242 -= Static76.anIntArray60[local294];
							local178 -= Static342.anIntArray397[local294];
						}
						if (local246 >= 0 && local242 > 0 && local244 > 0) {
							local38[local77][local246] = Static490.method7294(local87 * 256 / local242, local178 / local244, local106 / local244);
						}
					}
				}
			}
			if (Static542.aBoolean663) {
				this.method2286(arg1, local38, local40, local40 == 0 ? arg2 : null, Static364.aClass51Array3[local40], local40 == 0 ? arg0 : null);
			} else {
				this.method2275(Static364.aClass51Array3[local40], local40 == 0 ? arg2 : null, local38, arg1, local40, local40 == 0 ? arg0 : null);
			}
			this.aByteArrayArrayArray12[local40] = null;
			this.aByteArrayArrayArray14[local40] = null;
			this.aByteArrayArrayArray11[local40] = null;
			this.aByteArrayArrayArray13[local40] = null;
		}
		if (!this.aBoolean164) {
			if (Static337.anInt6317 != 0) {
				Static105.method2168();
			}
			if (Static241.aBoolean301) {
				Static502.method7415();
			}
		}
		for (local44 = 0; local44 < this.anInt2418; local44++) {
			Static364.aClass51Array3[local44].YA();
		}
	}

	@OriginalMember(owner = "client!ria", name = "a", descriptor = "(Lclient!s;Lclient!s;I[[ILclient!ha;ILclient!s;)V")
	private void method2275(@OriginalArg(0) Class51 arg0, @OriginalArg(1) Class51 arg1, @OriginalArg(3) int[][] arg2, @OriginalArg(4) Class5 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class51 arg5) {
		for (@Pc(11) int local11 = 0; local11 < this.anInt2414; local11++) {
			for (@Pc(15) int local15 = 0; local15 < this.anInt2408; local15++) {
				if (Static576.anInt9497 == -1 || Static24.method994(Static576.anInt9497, arg4, local15, local11)) {
					@Pc(38) byte local38 = this.aByteArrayArrayArray11[arg4][local11][local15];
					@Pc(47) byte local47 = this.aByteArrayArrayArray13[arg4][local11][local15];
					@Pc(58) int local58 = this.aByteArrayArrayArray14[arg4][local11][local15] & 0xFF;
					@Pc(69) int local69 = this.aByteArrayArrayArray12[arg4][local11][local15] & 0xFF;
					@Pc(84) Class132 local84 = local58 == 0 ? null : this.aClass315_3.method7805(local58 - 1);
					@Pc(99) Class162 local99 = local69 == 0 ? null : this.aClass238_3.method6221(local69 - 1);
					if (local38 == 0 && local84 == null) {
						local38 = 12;
					}
					@Pc(110) int local110 = 0;
					@Pc(112) int local112 = 0;
					if (local38 != 0) {
						local110 = local99 == null ? 0 : Static560.anIntArray595[local38];
						local112 = local84 == null ? 0 : Static286.anIntArray274[local38];
					} else if (local84 != null) {
						local112 = Static286.anIntArray274[local38];
					} else if (local99 != null) {
						local110 = Static286.anIntArray274[local38];
					}
					@Pc(154) int local154 = local112 + local110;
					@Pc(156) int local156 = 0;
					if (local154 != 0) {
						@Pc(165) int local165 = local84 == null ? -1 : local84.anInt3925;
						@Pc(172) int local172 = local99 == null ? -1 : local99.anInt4621;
						@Pc(175) int[] local175 = new int[local154];
						@Pc(178) int[] local178 = new int[local154];
						@Pc(181) int[] local181 = new int[local154];
						@Pc(184) int[] local184 = new int[local154];
						@Pc(186) boolean local186 = false;
						@Pc(188) boolean local188 = false;
						@Pc(205) int local205;
						if (local84 == null || local84.anInt3936 == -1 && local84.anInt3926 == -1 && local165 == -1) {
							for (local205 = 0; local205 < local112; local205++) {
								local175[local156] = -1;
								local156++;
							}
							local188 = true;
						} else {
							for (local205 = 0; local205 < local112; local205++) {
								local181[local156] = local165;
								local184[local156] = local84.anInt3928;
								if (local84.anInt3936 == -1) {
									local175[local156] = -1;
								} else {
									local175[local156] = local84.anInt3936;
								}
								if (local84.anInt3926 == -1) {
									local178[local156] = -1;
								} else {
									local178[local156] = local84.anInt3926;
									local186 = true;
								}
								local156++;
							}
							if (!this.aBoolean164 && arg4 == 0) {
								Static499.method7388(local11, local15, local84.anInt3927, local84.anInt3935 * 8, local84.anInt3931);
							}
						}
						if (!local186) {
							local178 = null;
						}
						if (local99 == null) {
							if (local188) {
								continue;
							}
							for (local205 = 0; local205 < local110; local205++) {
								local175[local156] = -1;
								local156++;
							}
						} else {
							for (local205 = 0; local205 < local110; local205++) {
								local181[local156] = local172;
								local184[local156] = local99.anInt4615;
								local175[local156] = arg2[local11][local15];
								if (local178 != null) {
									local178[local156] = -1;
								}
								local156++;
							}
						}
						local205 = this.anIntArray99.length;
						@Pc(356) int[] local356 = new int[local205];
						@Pc(359) int[] local359 = new int[local205];
						@Pc(366) int[] local366 = arg1 == null ? null : new int[local205];
						@Pc(375) int[] local375 = arg1 == null && arg5 == null ? null : new int[local205];
						@Pc(384) int local384;
						@Pc(389) int local389;
						@Pc(473) int local473;
						@Pc(481) int local481;
						for (@Pc(377) int local377 = 0; local377 < local205; local377++) {
							local384 = this.anIntArray99[local377];
							local389 = this.anIntArray100[local377];
							if (local47 == 0) {
								local356[local377] = local384;
								local359[local377] = local389;
							} else if (local47 == 1) {
								local356[local377] = local389;
								local359[local377] = 512 - local384;
							} else if (local47 == 2) {
								local356[local377] = 512 - local384;
								local359[local377] = 512 - local389;
							} else if (local47 == 3) {
								local356[local377] = 512 - local389;
								local359[local377] = local384;
							}
							if (local366 != null && Static346.aBooleanArrayArray4[local38][local377]) {
								local473 = local356[local377] + (local11 << 9);
								local481 = local359[local377] + (local15 << 9);
								local366[local377] = arg1.method7839(local473, local481) - arg0.method7839(local473, local481);
							}
							if (local375 != null) {
								if (arg1 != null && !Static346.aBooleanArrayArray4[local38][local377]) {
									local473 = (local11 << 9) + local356[local377];
									local481 = (local15 << 9) + local359[local377];
									local375[local377] = arg0.method7839(local473, local481) - arg1.method7839(local473, local481);
								} else if (arg5 != null && !Static339.aBooleanArrayArray2[local38][local377]) {
									local473 = local356[local377] + (local11 << 9);
									local481 = (local15 << 9) + local359[local377];
									local375[local377] = arg5.method7839(local473, local481) - arg0.method7839(local473, local481);
								}
							}
						}
						local384 = arg0.method7835(local11, local15);
						local389 = arg0.method7835(local11 + 1, local15);
						local473 = arg0.method7835(local11 + 1, local15 + 1);
						local481 = arg0.method7835(local11, local15 + 1);
						@Pc(622) boolean local622 = Static486.method7232(local15, local11);
						if (local622 && arg4 > 1 || !local622 && arg4 > 0) {
							@Pc(638) boolean local638 = true;
							if (local99 != null && !local99.aBoolean311) {
								local638 = false;
							} else if (local69 == 0 && local38 != 0) {
								local638 = false;
							} else if (local58 > 0 && local84 != null && !local84.aBoolean265) {
								local638 = false;
							}
							if (local638 && local384 == local389 && local473 == local384 && local481 == local384) {
								this.aByteArrayArrayArray10[arg4][local11][local15] = (byte) (this.aByteArrayArrayArray10[arg4][local11][local15] | 0x4);
							}
						}
						@Pc(714) int local714 = 0;
						@Pc(716) int local716 = 0;
						@Pc(718) int local718 = 0;
						if (this.aBoolean164) {
							local714 = Static568.method8121(local11, local15);
							local716 = Static191.method3261(local11, local15);
							local718 = Static511.method7625(local11, local15);
						}
						arg0.method7836(local11, local15, local356, local366, local359, local375, Static208.anIntArrayArray55[local38], Static579.anIntArrayArray61[local38], Static128.anIntArrayArray16[local38], local175, local178, local181, local184, local714, local716, local718);
						Static2.method23(arg4, local11, local15);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ria", name = "a", descriptor = "(IILclient!sl;III[Lclient!fe;)V")
	public final void method2276(@OriginalArg(1) int arg0, @OriginalArg(2) Class3_Sub3 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class105[] arg5) {
		@Pc(10) int local10;
		@Pc(18) int local18;
		@Pc(22) int local22;
		@Pc(29) int local29;
		if (!this.aBoolean164) {
			for (local10 = 0; local10 < 4; local10++) {
				@Pc(16) Class105 local16 = arg5[local10];
				for (local18 = 0; local18 < 64; local18++) {
					for (local22 = 0; local22 < 64; local22++) {
						local29 = arg4 + local18;
						@Pc(33) int local33 = local22 + arg2;
						if (local29 >= 0 && local29 < this.anInt2414 && local33 >= 0 && local33 < this.anInt2408) {
							local16.method2729(local33, local29);
						}
					}
				}
			}
		}
		local10 = arg3 + arg4;
		@Pc(93) int local93 = arg2 + arg0;
		for (local18 = 0; local18 < this.anInt2418; local18++) {
			for (local22 = 0; local22 < 64; local22++) {
				for (local29 = 0; local29 < 64; local29++) {
					this.method2279(0, local29 + arg2, arg1, 0, 0, local22 + arg4, local29 + local93, false, local10 + local22, local18);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ria", name = "a", descriptor = "([[III)V")
	public final void method2277(@OriginalArg(0) int[][] arg0) {
		@Pc(16) int[][] local16 = this.anIntArrayArrayArray8[0];
		for (@Pc(18) int local18 = 0; local18 < this.anInt2414 + 1; local18++) {
			for (@Pc(22) int local22 = 0; local22 < this.anInt2408 + 1; local22++) {
				local16[local18][local22] += arg0[local18][local22];
			}
		}
	}

	@OriginalMember(owner = "client!ria", name = "a", descriptor = "(IILclient!sl;IIIIZBII)V")
	private void method2279(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class3_Sub3 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		if (arg0 == 1) {
			arg4 = 1;
		} else if (arg0 == 2) {
			arg4 = 1;
			arg3 = 1;
		} else if (arg0 == 3) {
			arg3 = 1;
		}
		@Pc(53) int local53;
		if (arg5 < 0 || this.anInt2414 <= arg5 || arg1 < 0 || this.anInt2408 <= arg1) {
			while (true) {
				local53 = arg2.method4225();
				if (local53 == 0) {
					return;
				}
				if (local53 == 1) {
					arg2.method4225();
					return;
				}
				if (local53 <= 49) {
					arg2.method4225();
				}
			}
			return;
		}
		if (!this.aBoolean164 && !arg7) {
			Static513.aByteArrayArrayArray18[arg9][arg5][arg1] = 0;
		}
		while (true) {
			local53 = arg2.method4225();
			if (local53 == 0) {
				if (this.aBoolean164) {
					this.anIntArrayArrayArray8[0][arg3 + arg5][arg4 + arg1] = 0;
					return;
				} else if (arg9 == 0) {
					this.anIntArrayArrayArray8[0][arg3 + arg5][arg4 + arg1] = -Static611.method8470(arg6 + 556238, arg8 + 932731) * 8 << 2;
					return;
				} else {
					this.anIntArrayArrayArray8[arg9][arg5 + arg3][arg4 + arg1] = this.anIntArrayArrayArray8[arg9 - 1][arg3 + arg5][arg4 + arg1] - 960;
					return;
				}
			}
			if (local53 == 1) {
				@Pc(184) int local184 = arg2.method4225();
				if (!this.aBoolean164) {
					if (local184 == 1) {
						local184 = 0;
					}
					if (arg9 == 0) {
						this.anIntArrayArrayArray8[0][arg5 + arg3][arg4 + arg1] = -local184 * 8 << 2;
						return;
					}
					this.anIntArrayArrayArray8[arg9][arg3 + arg5][arg1 + arg4] = this.anIntArrayArrayArray8[arg9 - 1][arg5 + arg3][arg4 + arg1] - (local184 * 8 << 2);
					return;
				}
				this.anIntArrayArrayArray8[0][arg5 + arg3][arg1 + arg4] = local184 * 8 << 2;
				return;
			}
			if (local53 <= 49) {
				if (arg7) {
					arg2.method4225();
				} else {
					this.aByteArrayArrayArray14[arg9][arg5][arg1] = arg2.method4254();
					this.aByteArrayArrayArray11[arg9][arg5][arg1] = (byte) ((local53 - 2) / 4);
					this.aByteArrayArrayArray13[arg9][arg5][arg1] = (byte) (local53 + arg0 - 2 & 0x3);
				}
			} else if (local53 <= 81) {
				if (!this.aBoolean164 && !arg7) {
					Static513.aByteArrayArrayArray18[arg9][arg5][arg1] = (byte) (local53 - 49);
				}
			} else if (!arg7) {
				this.aByteArrayArrayArray12[arg9][arg5][arg1] = (byte) (local53 - 81);
			}
		}
	}

	@OriginalMember(owner = "client!ria", name = "a", descriptor = "(IIIII)V")
	public final void method2280(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1) {
		for (@Pc(3) int local3 = 0; local3 < this.anInt2418; local3++) {
			this.method2287(arg1, local3, 64, arg0, 64);
		}
	}

	@OriginalMember(owner = "client!ria", name = "a", descriptor = "(IIIIIIILclient!sl;I[Lclient!fe;)V")
	public final void method2281(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class3_Sub3 arg6, @OriginalArg(8) int arg7, @OriginalArg(9) Class105[] arg8) {
		@Pc(11) int local11 = (arg1 & 0x7) * 8;
		@Pc(29) int local29 = (arg4 & 0x7) * 8;
		@Pc(38) int local38;
		@Pc(69) int local69;
		if (!this.aBoolean164) {
			@Pc(36) Class105 local36 = arg8[arg5];
			for (local38 = 0; local38 < 8; local38++) {
				for (@Pc(42) int local42 = 0; local42 < 8; local42++) {
					@Pc(56) int local56 = Static601.method8391(local38 & 0x7, local42 & 0x7, arg2) + arg3;
					local69 = arg0 + Static23.method989(local42 & 0x7, local38 & 0x7, arg2);
					if (local56 > 0 && this.anInt2414 - 1 > local56 && local69 > 0 && local69 < this.anInt2408 - 1) {
						local36.method2729(local69, local56);
					}
				}
			}
		}
		@Pc(115) int local115 = (arg1 & 0x1FFFFFF8) << 3;
		local38 = (arg4 & 0xFFFFFFF8) << 3;
		@Pc(123) byte local123 = 0;
		@Pc(125) byte local125 = 0;
		if (arg2 == 1) {
			local125 = 1;
		} else if (arg2 == 2) {
			local125 = 1;
			local123 = 1;
		} else if (arg2 == 3) {
			local123 = 1;
		}
		for (local69 = 0; local69 < this.anInt2418; local69++) {
			for (@Pc(152) int local152 = 0; local152 < 64; local152++) {
				for (@Pc(156) int local156 = 0; local156 < 64; local156++) {
					if (local69 == arg7 && local152 >= local11 && local152 <= local11 + 8 && local29 <= local156 && local156 <= local29 + 8) {
						@Pc(238) int local238;
						@Pc(231) int local231;
						if (local11 + 8 == local152 || local29 + 8 == local156) {
							if (arg2 == 0) {
								local231 = local156 + arg0 - local29;
								local238 = arg3 + local152 - local11;
							} else if (arg2 == 1) {
								local231 = local11 + arg0 + 8 - local152;
								local238 = local156 + arg3 - local29;
							} else if (arg2 == 2) {
								local231 = local29 + arg0 + 8 - local156;
								local238 = local11 + arg3 + 8 - local152;
							} else {
								local238 = local29 + arg3 + 8 - local156;
								local231 = local152 + arg0 - local11;
							}
							this.method2279(0, local231, arg6, 0, 0, local238, local156 + local38, true, local115 + local152, arg5);
						} else {
							local238 = arg3 + Static601.method8391(local152 & 0x7, local156 & 0x7, arg2);
							local231 = arg0 + Static23.method989(local156 & 0x7, local152 & 0x7, arg2);
							this.method2279(arg2, local231, arg6, local123, local125, local238, local156 + local38, false, local115 + local152, arg5);
						}
						if (local152 == 63 || local156 == 63) {
							@Pc(372) byte local372 = 1;
							if (local152 == 63 && local156 == 63) {
								local372 = 3;
							}
							for (@Pc(382) int local382 = 0; local382 < local372; local382++) {
								@Pc(386) int local386 = local152;
								@Pc(388) int local388 = local156;
								if (local382 == 0) {
									local386 = local152 == 63 ? 64 : local152;
									local388 = local156 == 63 ? 64 : local156;
								} else if (local382 == 1) {
									local386 = 64;
								} else if (local382 == 2) {
									local388 = 64;
								}
								@Pc(445) int local445;
								@Pc(455) int local455;
								if (arg2 == 0) {
									local455 = arg0 + local388 - local29;
									local445 = local386 + arg3 - local11;
								} else if (arg2 == 1) {
									local455 = arg0 + local11 + 8 - local386;
									local445 = local388 + arg3 - local29;
								} else if (arg2 == 2) {
									local445 = local11 + arg3 + 8 - local386;
									local455 = arg0 + local29 + 8 - local388;
								} else {
									local445 = local29 + arg3 + 8 - local388;
									local455 = local386 + arg0 - local11;
								}
								if (local445 >= 0 && this.anInt2414 > local445 && local455 >= 0 && local455 < this.anInt2408) {
									this.anIntArrayArrayArray8[arg5][local445][local455] = this.anIntArrayArrayArray8[arg5][local238 + local123][local231 + local125];
								}
							}
						}
					} else {
						this.method2279(0, -1, arg6, 0, 0, -1, 0, false, 0, 0);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ria", name = "a", descriptor = "([Z[[BLclient!hb;II[[BBIILclient!ha;Lclient!iu;II[[B)V")
	private void method2283(@OriginalArg(0) boolean[] arg0, @OriginalArg(1) byte[][] arg1, @OriginalArg(2) Class132 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte[][] arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) Class5 arg8, @OriginalArg(10) Class162 arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11, @OriginalArg(13) byte[][] arg12) {
		@Pc(22) boolean[] local22 = arg2 != null && arg2.aBoolean263 ? Static340.aBooleanArrayArray3[arg4] : Static436.aBooleanArrayArray6[arg4];
		@Pc(41) int local41;
		@Pc(51) Class132 local51;
		@Pc(69) byte local69;
		@Pc(85) int local85;
		@Pc(90) int local90;
		if (arg10 > 0) {
			if (arg3 > 0) {
				local41 = arg12[arg3 - 1][arg10 - 1] & 0xFF;
				if (local41 > 0) {
					local51 = this.aClass315_3.method7805(local41 - 1);
					if (local51.anInt3936 != -1 && local51.aBoolean263) {
						local69 = arg5[arg3 - 1][arg10 - 1];
						local85 = arg1[arg3 - 1][arg10 - 1] * 2 + 4 & 0x7;
						local90 = Static214.method3615(arg8, local51);
						if (Static346.aBooleanArrayArray4[local69][local85]) {
							Static594.anIntArray634[0] = local51.anInt3936;
							Static509.anIntArray542[0] = local90;
							Static133.anIntArray131[0] = local51.anInt3925;
							Static335.anIntArray391[0] = local51.anInt3928;
							Static577.anIntArray606[0] = local51.anInt3937;
							Static280.anIntArray272[0] = 256;
						}
					}
				}
			}
			if (arg3 < arg6 - 1) {
				local41 = arg12[arg3 + 1][arg10 - 1] & 0xFF;
				if (local41 > 0) {
					local51 = this.aClass315_3.method7805(local41 - 1);
					if (local51.anInt3936 != -1 && local51.aBoolean263) {
						local69 = arg5[arg3 + 1][arg10 - 1];
						local85 = arg1[arg3 + 1][arg10 - 1] * 2 + 6 & 0x7;
						local90 = Static214.method3615(arg8, local51);
						if (Static346.aBooleanArrayArray4[local69][local85]) {
							Static594.anIntArray634[2] = local51.anInt3936;
							Static509.anIntArray542[2] = local90;
							Static133.anIntArray131[2] = local51.anInt3925;
							Static335.anIntArray391[2] = local51.anInt3928;
							Static577.anIntArray606[2] = local51.anInt3937;
							Static280.anIntArray272[2] = 512;
						}
					}
				}
			}
		}
		if (arg10 < arg11 - 1) {
			if (arg3 > 0) {
				local41 = arg12[arg3 - 1][arg10 + 1] & 0xFF;
				if (local41 > 0) {
					local51 = this.aClass315_3.method7805(local41 - 1);
					if (local51.anInt3936 != -1 && local51.aBoolean263) {
						local69 = arg5[arg3 - 1][arg10 + 1];
						local85 = arg1[arg3 - 1][arg10 + 1] * 2 + 2 & 0x7;
						local90 = Static214.method3615(arg8, local51);
						if (Static346.aBooleanArrayArray4[local69][local85]) {
							Static594.anIntArray634[6] = local51.anInt3936;
							Static509.anIntArray542[6] = local90;
							Static133.anIntArray131[6] = local51.anInt3925;
							Static335.anIntArray391[6] = local51.anInt3928;
							Static577.anIntArray606[6] = local51.anInt3937;
							Static280.anIntArray272[6] = 64;
						}
					}
				}
			}
			if (arg6 - 1 > arg3) {
				local41 = arg12[arg3 + 1][arg10 + 1] & 0xFF;
				if (local41 > 0) {
					local51 = this.aClass315_3.method7805(local41 - 1);
					if (local51.anInt3936 != -1 && local51.aBoolean263) {
						local69 = arg5[arg3 + 1][arg10 + 1];
						local85 = arg1[arg3 + 1][arg10 + 1] * 2 & 0x7;
						local90 = Static214.method3615(arg8, local51);
						if (Static346.aBooleanArrayArray4[local69][local85]) {
							Static594.anIntArray634[4] = local51.anInt3936;
							Static509.anIntArray542[4] = local90;
							Static133.anIntArray131[4] = local51.anInt3925;
							Static335.anIntArray391[4] = local51.anInt3928;
							Static577.anIntArray606[4] = local51.anInt3937;
							Static280.anIntArray272[4] = 128;
						}
					}
				}
			}
		}
		@Pc(520) int local520;
		@Pc(525) int local525;
		@Pc(527) int local527;
		@Pc(488) byte local488;
		if (arg10 > 0) {
			local41 = arg12[arg3][arg10 - 1] & 0xFF;
			if (local41 > 0) {
				local51 = this.aClass315_3.method7805(local41 - 1);
				if (local51.anInt3936 != -1) {
					local69 = arg5[arg3][arg10 - 1];
					local488 = arg1[arg3][arg10 - 1];
					if (local51.aBoolean263) {
						local90 = 2;
						local520 = local488 * 2 + 4;
						local525 = Static214.method3615(arg8, local51);
						for (local527 = 0; local527 < 3; local527++) {
							local90 &= 0x7;
							local520 &= 0x7;
							if (Static346.aBooleanArrayArray4[local69][local520] && local51.anInt3937 >= Static577.anIntArray606[local90]) {
								Static594.anIntArray634[local90] = local51.anInt3936;
								Static509.anIntArray542[local90] = local525;
								Static133.anIntArray131[local90] = local51.anInt3925;
								Static335.anIntArray391[local90] = local51.anInt3928;
								if (Static577.anIntArray606[local90] == local51.anInt3937) {
									Static280.anIntArray272[local90] |= 0x20;
								} else {
									Static280.anIntArray272[local90] = 32;
								}
								Static577.anIntArray606[local90] = local51.anInt3937;
							}
							local90--;
							local520++;
						}
						if (!local22[arg7 & 0x3]) {
							arg0[0] = Static340.aBooleanArrayArray3[local69][local488 + 2 & 0x3];
						}
					} else if (!local22[arg7 & 0x3]) {
						arg0[0] = Static436.aBooleanArrayArray6[local69][local488 + 2 & 0x3];
					}
				}
			}
		}
		if (arg11 - 1 > arg10) {
			local41 = arg12[arg3][arg10 + 1] & 0xFF;
			if (local41 > 0) {
				local51 = this.aClass315_3.method7805(local41 - 1);
				if (local51.anInt3936 != -1) {
					local69 = arg5[arg3][arg10 + 1];
					local488 = arg1[arg3][arg10 + 1];
					if (local51.aBoolean263) {
						local90 = 4;
						local520 = local488 * 2 + 2;
						local525 = Static214.method3615(arg8, local51);
						for (local527 = 0; local527 < 3; local527++) {
							local90 &= 0x7;
							local520 &= 0x7;
							if (Static346.aBooleanArrayArray4[local69][local520] && local51.anInt3937 >= Static577.anIntArray606[local90]) {
								Static594.anIntArray634[local90] = local51.anInt3936;
								Static509.anIntArray542[local90] = local525;
								Static133.anIntArray131[local90] = local51.anInt3925;
								Static335.anIntArray391[local90] = local51.anInt3928;
								if (local51.anInt3937 == Static577.anIntArray606[local90]) {
									Static280.anIntArray272[local90] |= 0x10;
								} else {
									Static280.anIntArray272[local90] = 16;
								}
								Static577.anIntArray606[local90] = local51.anInt3937;
							}
							local90++;
							local520--;
						}
						if (!local22[arg7 + 2 & 0x3]) {
							arg0[2] = Static340.aBooleanArrayArray3[local69][local488 & 0x3];
						}
					} else if (!local22[arg7 + 2 & 0x3]) {
						arg0[2] = Static436.aBooleanArrayArray6[local69][--local488 & 0x3];
					}
				}
			}
		}
		if (arg3 > 0) {
			local41 = arg12[arg3 - 1][arg10] & 0xFF;
			if (local41 > 0) {
				local51 = this.aClass315_3.method7805(local41 - 1);
				if (local51.anInt3936 != -1) {
					local69 = arg5[arg3 - 1][arg10];
					local488 = arg1[arg3 - 1][arg10];
					if (local51.aBoolean263) {
						local90 = 6;
						local520 = local488 * 2 + 4;
						local525 = Static214.method3615(arg8, local51);
						for (local527 = 0; local527 < 3; local527++) {
							local520 &= 0x7;
							local90 &= 0x7;
							if (Static346.aBooleanArrayArray4[local69][local520] && Static577.anIntArray606[local90] <= local51.anInt3937) {
								Static594.anIntArray634[local90] = local51.anInt3936;
								Static509.anIntArray542[local90] = local525;
								Static133.anIntArray131[local90] = local51.anInt3925;
								Static335.anIntArray391[local90] = local51.anInt3928;
								if (Static577.anIntArray606[local90] == local51.anInt3937) {
									Static280.anIntArray272[local90] |= 0x8;
								} else {
									Static280.anIntArray272[local90] = 8;
								}
								Static577.anIntArray606[local90] = local51.anInt3937;
							}
							local520--;
							local90++;
						}
						if (!local22[arg7 + 3 & 0x3]) {
							arg0[3] = Static340.aBooleanArrayArray3[local69][local488 + 1 & 0x3];
						}
					} else if (!local22[arg7 + 3 & 0x3]) {
						arg0[3] = Static436.aBooleanArrayArray6[local69][local488 + 1 & 0x3];
					}
				}
			}
		}
		if (arg6 - 1 > arg3) {
			local41 = arg12[arg3 + 1][arg10] & 0xFF;
			if (local41 > 0) {
				local51 = this.aClass315_3.method7805(local41 - 1);
				if (local51.anInt3936 != -1) {
					local69 = arg5[arg3 + 1][arg10];
					local488 = arg1[arg3 + 1][arg10];
					if (local51.aBoolean263) {
						local90 = 4;
						local520 = local488 * 2 + 6;
						local525 = Static214.method3615(arg8, local51);
						for (local527 = 0; local527 < 3; local527++) {
							local90 &= 0x7;
							local520 &= 0x7;
							if (Static346.aBooleanArrayArray4[local69][local520] && Static577.anIntArray606[local90] <= local51.anInt3937) {
								Static594.anIntArray634[local90] = local51.anInt3936;
								Static509.anIntArray542[local90] = local525;
								Static133.anIntArray131[local90] = local51.anInt3925;
								Static335.anIntArray391[local90] = local51.anInt3928;
								if (local51.anInt3937 == Static577.anIntArray606[local90]) {
									Static280.anIntArray272[local90] |= 0x4;
								} else {
									Static280.anIntArray272[local90] = 4;
								}
								Static577.anIntArray606[local90] = local51.anInt3937;
							}
							local90--;
							local520++;
						}
						if (!local22[arg7 + 1 & 0x3]) {
							arg0[1] = Static340.aBooleanArrayArray3[local69][local488 + 3 & 0x3];
						}
					} else if (!local22[arg7 + 1 & 0x3]) {
						arg0[1] = Static436.aBooleanArrayArray6[local69][local488 + 3 & 0x3];
					}
				}
			}
		}
		if (arg2 == null) {
			return;
		}
		local41 = Static214.method3615(arg8, arg2);
		if (!arg2.aBoolean263) {
			return;
		}
		for (@Pc(1180) int local1180 = 0; local1180 < 8; local1180++) {
			@Pc(1191) int local1191 = local1180 - arg7 * 2 & 0x7;
			if (Static346.aBooleanArrayArray4[arg4][local1180] && arg2.anInt3937 >= Static577.anIntArray606[local1191]) {
				Static594.anIntArray634[local1191] = arg2.anInt3936;
				Static509.anIntArray542[local1191] = local41;
				Static133.anIntArray131[local1191] = arg2.anInt3925;
				Static335.anIntArray391[local1191] = arg2.anInt3928;
				if (arg2.anInt3937 == Static577.anIntArray606[local1191]) {
					Static280.anIntArray272[local1191] |= 0x2;
				} else {
					Static280.anIntArray272[local1191] = 2;
				}
				Static577.anIntArray606[local1191] = arg2.anInt3937;
			}
		}
		return;
	}

	@OriginalMember(owner = "client!ria", name = "a", descriptor = "(ILclient!ha;[Lclient!fe;[[[I)V")
	public final void method2285(@OriginalArg(1) Class5 arg0, @OriginalArg(2) Class105[] arg1, @OriginalArg(3) int[][][] arg2) {
		@Pc(10) int local10;
		@Pc(14) int local14;
		@Pc(18) int local18;
		if (!this.aBoolean164) {
			for (local10 = 0; local10 < 4; local10++) {
				for (local14 = 0; local14 < this.anInt2414; local14++) {
					for (local18 = 0; local18 < this.anInt2408; local18++) {
						if ((Static513.aByteArrayArrayArray18[local10][local14][local18] & 0x1) != 0) {
							@Pc(32) int local32 = local10;
							if ((Static513.aByteArrayArrayArray18[1][local14][local18] & 0x2) != 0) {
								local32 = local10 - 1;
							}
							if (local32 >= 0) {
								arg1[local32].method2738(local14, local18);
							}
						}
					}
				}
			}
		}
		for (local10 = 0; local10 < this.anInt2418; local10++) {
			local14 = 0;
			local18 = 0;
			if (!this.aBoolean164) {
				if (Static241.aBoolean301) {
					local14 = 2;
				}
				if (Static200.aBoolean264) {
					local18 = 8;
				}
				if (Static337.anInt6317 != 0) {
					local14 |= 0x1;
					if (Static72.aBoolean106 | local10 == 0) {
						local18 |= 0x10;
					}
				}
			}
			if (Static241.aBoolean301) {
				local18 |= 0x7;
			}
			if (!Static291.aBoolean339) {
				local18 |= 0x20;
			}
			@Pc(142) int[][] local142 = arg2 == null || local10 >= arg2.length ? this.anIntArrayArrayArray8[local10] : arg2[local10];
			Static276.method4487(local10, arg0.method7505(this.anInt2414, this.anInt2408, this.anIntArrayArrayArray8[local10], local142, local14, local18));
		}
	}

	@OriginalMember(owner = "client!ria", name = "a", descriptor = "(Lclient!ha;[[IIILclient!s;Lclient!s;Lclient!s;)V")
	private void method2286(@OriginalArg(0) Class5 arg0, @OriginalArg(1) int[][] arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Class51 arg3, @OriginalArg(5) Class51 arg4, @OriginalArg(6) Class51 arg5) {
		@Pc(22) byte[][] local22 = this.aByteArrayArrayArray11[arg2];
		@Pc(27) byte[][] local27 = this.aByteArrayArrayArray13[arg2];
		@Pc(32) byte[][] local32 = this.aByteArrayArrayArray12[arg2];
		@Pc(37) byte[][] local37 = this.aByteArrayArrayArray14[arg2];
		for (@Pc(39) int local39 = 0; local39 < this.anInt2414; local39++) {
			@Pc(53) int local53 = this.anInt2414 - 1 > local39 ? local39 + 1 : local39;
			for (@Pc(55) int local55 = 0; local55 < this.anInt2408; local55++) {
				@Pc(69) int local69 = local55 >= this.anInt2408 - 1 ? local55 : local55 + 1;
				if (Static576.anInt9497 == -1 || Static24.method994(Static576.anInt9497, arg2, local55, local39)) {
					@Pc(84) boolean local84 = false;
					@Pc(86) boolean local86 = false;
					@Pc(89) boolean[] local89 = new boolean[4];
					@Pc(95) int local95 = local22[local39][local55];
					@Pc(101) int local101 = local27[local39][local55];
					@Pc(109) int local109 = local37[local39][local55] & 0xFF;
					@Pc(117) int local117 = local32[local39][local55] & 0xFF;
					@Pc(125) int local125 = local32[local39][local69] & 0xFF;
					@Pc(133) int local133 = local32[local53][local69] & 0xFF;
					@Pc(141) int local141 = local32[local53][local55] & 0xFF;
					if (local109 != 0 || local117 != 0) {
						@Pc(163) Class132 local163 = local109 == 0 ? null : this.aClass315_3.method7805(local109 - 1);
						@Pc(175) Class162 local175 = local117 == 0 ? null : this.aClass238_3.method6221(local117 - 1);
						if (local95 == 0 && local163 == null) {
							local95 = 12;
						}
						@Pc(183) Class132 local183 = local163;
						if (local163 != null) {
							if (local163.anInt3936 == -1 && local163.anInt3926 == -1) {
								local183 = local163;
								local163 = null;
							} else if (local175 != null && local95 != 0) {
								local86 = local163.aBoolean263;
							}
						}
						@Pc(256) int local256;
						@Pc(326) int local326;
						@Pc(372) int local372;
						@Pc(382) int local382;
						if ((local95 == 0 || local95 == 12) && local39 > 0 && local55 > 0 && this.anInt2414 > local39 && this.anInt2408 > local55) {
							local256 = local32[local39 - 1][local55 - 1] == local117 ? 1 : -1;
							@Pc(275) int local275 = local117 == local32[local53][local55 - 1] ? 1 : -1;
							@Pc(292) int local292 = local117 == local32[local53][local69] ? 1 : -1;
							if (local32[local39][local55 - 1] == local117) {
								local256++;
								local275++;
							} else {
								local275--;
								local256--;
							}
							local326 = local32[local39 - 1][local69] == local117 ? 1 : -1;
							if (local32[local53][local55] == local117) {
								local292++;
								local275++;
							} else {
								local275--;
								local292--;
							}
							if (local32[local39][local69] == local117) {
								local326++;
								local292++;
							} else {
								local292--;
								local326--;
							}
							if (local117 == local32[local39 - 1][local55]) {
								local256++;
								local326++;
							} else {
								local256--;
								local326--;
							}
							local372 = local256 - local292;
							if (local372 < 0) {
								local372 = -local372;
							}
							local382 = local275 - local326;
							if (local382 < 0) {
								local382 = -local382;
							}
							if (local382 == local372) {
								local372 = arg4.method7835(local39, local55) - arg4.method7835(local53, local69);
								local382 = arg4.method7835(local53, local55) - arg4.method7835(local39, local69);
								if (local372 < 0) {
									local372 = -local372;
								}
								if (local382 < 0) {
									local382 = -local382;
								}
							}
							local101 = local382 <= local372 ? 0 : 1;
						}
						for (local256 = 0; local256 < 13; local256++) {
							Static577.anIntArray606[local256] = -1;
							Static280.anIntArray272[local256] = 1;
						}
						@Pc(472) boolean[] local472 = local163 != null && local163.aBoolean263 ? Static340.aBooleanArrayArray3[local95] : Static436.aBooleanArrayArray6[local95];
						this.method2283(local89, local27, local163, local39, local95, local22, this.anInt2414, local101, arg0, local175, local55, this.anInt2408, local37);
						@Pc(501) boolean local501 = local163 != null && local163.anInt3926 != local163.anInt3936;
						if (!local501) {
							for (local326 = 0; local326 < 8; local326++) {
								if (Static577.anIntArray606[local326] >= 0 && Static509.anIntArray542[local326] != Static594.anIntArray634[local326]) {
									local501 = true;
									break;
								}
							}
						}
						if (!local472[local101 + 1 & 0x3]) {
							local89[1] = Static191.method3256(local89[1], (Static280.anIntArray272[2] & Static280.anIntArray272[4]) == 0);
						}
						if (!local472[local101 + 3 & 0x3]) {
							local89[3] = Static191.method3256(local89[3], (Static280.anIntArray272[0] & Static280.anIntArray272[6]) == 0);
						}
						if (!local472[local101 & 0x3]) {
							local89[0] = Static191.method3256(local89[0], (Static280.anIntArray272[0] & Static280.anIntArray272[2]) == 0);
						}
						if (!local472[local101 + 2 & 0x3]) {
							local89[2] = Static191.method3256(local89[2], (Static280.anIntArray272[6] & Static280.anIntArray272[4]) == 0);
						}
						if (!local86 && (local95 == 0 || local95 == 12)) {
							if (local89[0] && !local89[1] && !local89[2] && local89[3]) {
								local89[0] = local89[3] = false;
								local95 = local95 == 0 ? 13 : 14;
								local101 = 0;
							} else if (local89[0] && local89[1] && !local89[2] && !local89[3]) {
								local89[0] = local89[1] = false;
								local95 = local95 == 0 ? 13 : 14;
								local101 = 3;
							} else if (!local89[0] && local89[1] && local89[2] && !local89[3]) {
								local101 = 2;
								local95 = local95 == 0 ? 13 : 14;
								local89[1] = local89[2] = false;
							} else if (!local89[0] && !local89[1] && local89[2] && local89[3]) {
								local95 = local95 == 0 ? 13 : 14;
								local89[2] = local89[3] = false;
								local101 = 1;
							}
						}
						@Pc(811) boolean local811 = !local86 && !local89[0] && !local89[2] && !local89[1] && !local89[3];
						@Pc(813) int[] local813 = null;
						@Pc(827) int[] local827;
						@Pc(823) int[] local823;
						@Pc(819) int[] local819;
						if (local811) {
							local819 = Static128.anIntArrayArray16[local95];
							local823 = Static579.anIntArrayArray61[local95];
							local827 = Static208.anIntArrayArray55[local95];
							local372 = local175 == null ? 0 : Static560.anIntArray595[local95];
							local382 = local163 == null ? 0 : Static286.anIntArray274[local95];
						} else if (local86) {
							local827 = Static57.anIntArrayArray7[local95];
							local372 = local175 == null ? 0 : Static586.anIntArray620[local95];
							local813 = Static193.anIntArrayArray28[local95];
							local823 = Static144.anIntArrayArray18[local95];
							local382 = local163 == null ? 0 : Static544.anIntArray581[local95];
							local819 = Static18.anIntArrayArray2[local95];
						} else {
							local827 = Static59.anIntArrayArray8[local95];
							local372 = local175 == null ? 0 : Static592.anIntArray630[local95];
							local382 = local163 == null ? 0 : Static249.anIntArray242[local95];
							local819 = Static178.anIntArrayArray64[local95];
							local823 = Static570.anIntArrayArray60[local95];
							local813 = Static167.anIntArrayArray26[local95];
						}
						@Pc(916) int local916 = local372 + local382;
						if (local916 <= 0) {
							Static2.method23(arg2, local39, local55);
						} else {
							if (local89[0]) {
								local916++;
							}
							if (local89[2]) {
								local916++;
							}
							if (local89[1]) {
								local916++;
							}
							if (local89[3]) {
								local916++;
							}
							@Pc(949) int local949 = 0;
							@Pc(951) int local951 = 0;
							@Pc(955) int local955 = local916 * 3;
							@Pc(962) int[] local962 = local501 ? new int[local955] : null;
							@Pc(965) int[] local965 = new int[local955];
							@Pc(968) int[] local968 = new int[local955];
							@Pc(971) int[] local971 = new int[local955];
							@Pc(974) int[] local974 = new int[local955];
							@Pc(977) int[] local977 = new int[local955];
							@Pc(984) int[] local984 = arg3 == null ? null : new int[local955];
							@Pc(993) int[] local993 = arg3 == null && arg5 == null ? null : new int[local955];
							@Pc(995) int local995 = -1;
							@Pc(997) int local997 = -1;
							@Pc(999) int local999 = 256;
							@Pc(1061) byte local1061;
							@Pc(1015) int local1015;
							@Pc(1017) int local1017;
							@Pc(1244) int local1244;
							@Pc(1250) int local1250;
							@Pc(1259) int local1259;
							@Pc(1264) int local1264;
							@Pc(1284) int local1284;
							@Pc(1269) int local1269;
							@Pc(1282) int local1282;
							@Pc(1336) int local1336;
							@Pc(1342) int local1342;
							if (local163 != null) {
								local997 = local163.anInt3925;
								local999 = local163.anInt3928;
								local995 = local163.anInt3936;
								local1015 = Static214.method3615(arg0, local163);
								for (local1017 = 0; local1017 < local382; local1017++) {
									if (local89[-local101 & 0x3] && local813[0] == local949) {
										Static464.anIntArray507[0] = local827[local949];
										Static464.anIntArray507[1] = 1;
										Static464.anIntArray507[2] = local819[local949];
										Static464.anIntArray507[3] = 1;
										Static464.anIntArray507[4] = local823[local949];
										local1061 = 6;
										Static464.anIntArray507[5] = local819[local949];
									} else if (local89[2 - local101 & 0x3] && local949 == local813[2]) {
										Static464.anIntArray507[0] = local827[local949];
										Static464.anIntArray507[1] = 5;
										Static464.anIntArray507[2] = local819[local949];
										Static464.anIntArray507[3] = 5;
										Static464.anIntArray507[4] = local823[local949];
										Static464.anIntArray507[5] = local819[local949];
										local1061 = 6;
									} else if (local89[1 - local101 & 0x3] && local813[1] == local949) {
										Static464.anIntArray507[0] = local827[local949];
										Static464.anIntArray507[1] = 3;
										Static464.anIntArray507[2] = local819[local949];
										Static464.anIntArray507[3] = 3;
										Static464.anIntArray507[4] = local823[local949];
										Static464.anIntArray507[5] = local819[local949];
										local1061 = 6;
									} else if (local89[3 - local101 & 0x3] && local949 == local813[3]) {
										Static464.anIntArray507[0] = local827[local949];
										Static464.anIntArray507[1] = 7;
										Static464.anIntArray507[2] = local819[local949];
										Static464.anIntArray507[3] = 7;
										Static464.anIntArray507[4] = local823[local949];
										Static464.anIntArray507[5] = local819[local949];
										local1061 = 6;
									} else {
										Static464.anIntArray507[0] = local827[local949];
										Static464.anIntArray507[1] = local823[local949];
										local1061 = 3;
										Static464.anIntArray507[2] = local819[local949];
									}
									for (local1244 = 0; local1244 < local1061; local1244++) {
										local1250 = Static464.anIntArray507[local1244];
										local1259 = local1250 - local101 * 2 & 0x7;
										local1264 = this.anIntArray99[local1250];
										local1269 = this.anIntArray100[local1250];
										if (local101 == 1) {
											local1282 = 512 - local1264;
											local1284 = local1269;
										} else if (local101 == 2) {
											local1282 = 512 - local1269;
											local1284 = 512 - local1264;
										} else if (local101 == 3) {
											local1282 = local1264;
											local1284 = 512 - local1269;
										} else {
											local1282 = local1269;
											local1284 = local1264;
										}
										local965[local951] = local1284;
										local968[local951] = local1282;
										if (local984 != null && Static346.aBooleanArrayArray4[local95][local1250]) {
											local1336 = local1284 + (local39 << 9);
											local1342 = local1282 + (local55 << 9);
											local984[local951] = arg3.method7839(local1336, local1342) - arg4.method7839(local1336, local1342);
										}
										if (local993 != null) {
											if (arg3 != null && !Static346.aBooleanArrayArray4[local95][local1250]) {
												local1336 = (local39 << 9) + local1284;
												local1342 = local1282 + (local55 << 9);
												local993[local951] = arg4.method7839(local1336, local1342) - arg3.method7839(local1336, local1342);
											} else if (arg5 != null && !Static339.aBooleanArrayArray2[local95][local1250]) {
												local1336 = (local39 << 9) + local1284;
												local1342 = local1282 + (local55 << 9);
												local993[local951] = arg5.method7839(local1336, local1342) - arg4.method7839(local1336, local1342);
											}
										}
										if (local1250 < 8 && Static577.anIntArray606[local1259] > local163.anInt3937) {
											if (local962 != null) {
												local962[local951] = Static509.anIntArray542[local1259];
											}
											local977[local951] = Static335.anIntArray391[local1259];
											local974[local951] = Static133.anIntArray131[local1259];
											local971[local951] = Static594.anIntArray634[local1259];
										} else {
											if (local962 != null) {
												local962[local951] = local1015;
											}
											local974[local951] = local163.anInt3925;
											local977[local951] = local163.anInt3928;
											local971[local951] = local995;
										}
										local951++;
									}
									local949++;
								}
								if (!this.aBoolean164 && arg2 == 0) {
									Static499.method7388(local39, local55, local163.anInt3927, local163.anInt3935 * 8, local163.anInt3931);
								}
								if (local95 != 12 && local163.anInt3936 != -1 && local163.aBoolean266) {
									local84 = true;
								}
							} else if (local811) {
								local949 = Static286.anIntArray274[local95];
							} else if (local86) {
								local949 = Static544.anIntArray581[local95];
							} else {
								local949 = Static249.anIntArray242[local95];
							}
							if (local175 != null) {
								if (local125 == 0) {
									local125 = local117;
								}
								if (local141 == 0) {
									local141 = local117;
								}
								if (local133 == 0) {
									local133 = local117;
								}
								@Pc(1585) Class162 local1585 = this.aClass238_3.method6221(local117 - 1);
								@Pc(1593) Class162 local1593 = this.aClass238_3.method6221(local125 - 1);
								@Pc(1601) Class162 local1601 = this.aClass238_3.method6221(local133 - 1);
								@Pc(1609) Class162 local1609 = this.aClass238_3.method6221(local141 - 1);
								for (local1259 = 0; local1259 < local372; local1259++) {
									if (local89[-local101 & 0x3] && local949 == local813[0]) {
										Static464.anIntArray507[0] = local827[local949];
										Static464.anIntArray507[1] = 1;
										Static464.anIntArray507[2] = local819[local949];
										Static464.anIntArray507[3] = 1;
										Static464.anIntArray507[4] = local823[local949];
										Static464.anIntArray507[5] = local819[local949];
										local1061 = 6;
									} else if (local89[2 - local101 & 0x3] && local949 == local813[2]) {
										Static464.anIntArray507[0] = local827[local949];
										Static464.anIntArray507[1] = 5;
										Static464.anIntArray507[2] = local819[local949];
										Static464.anIntArray507[3] = 5;
										Static464.anIntArray507[4] = local823[local949];
										Static464.anIntArray507[5] = local819[local949];
										local1061 = 6;
									} else if (local89[1 - local101 & 0x3] && local949 == local813[1]) {
										Static464.anIntArray507[0] = local827[local949];
										Static464.anIntArray507[1] = 3;
										Static464.anIntArray507[2] = local819[local949];
										Static464.anIntArray507[3] = 3;
										Static464.anIntArray507[4] = local823[local949];
										Static464.anIntArray507[5] = local819[local949];
										local1061 = 6;
									} else if (local89[3 - local101 & 0x3] && local813[3] == local949) {
										Static464.anIntArray507[0] = local827[local949];
										Static464.anIntArray507[1] = 7;
										Static464.anIntArray507[2] = local819[local949];
										Static464.anIntArray507[3] = 7;
										Static464.anIntArray507[4] = local823[local949];
										local1061 = 6;
										Static464.anIntArray507[5] = local819[local949];
									} else {
										Static464.anIntArray507[0] = local827[local949];
										Static464.anIntArray507[1] = local823[local949];
										local1061 = 3;
										Static464.anIntArray507[2] = local819[local949];
									}
									local949++;
									for (local1264 = 0; local1264 < local1061; local1264++) {
										local1284 = Static464.anIntArray507[local1264];
										local1269 = local1284 - local101 * 2 & 0x7;
										local1282 = this.anIntArray99[local1284];
										local1342 = this.anIntArray100[local1284];
										@Pc(1884) int local1884;
										if (local101 == 1) {
											local1336 = local1342;
											local1884 = 512 - local1282;
										} else if (local101 == 2) {
											local1336 = 512 - local1282;
											local1884 = 512 - local1342;
										} else if (local101 == 3) {
											local1336 = 512 - local1342;
											local1884 = local1282;
										} else {
											local1336 = local1282;
											local1884 = local1342;
										}
										local965[local951] = local1336;
										local968[local951] = local1884;
										@Pc(1941) int local1941;
										@Pc(1947) int local1947;
										if (local984 != null && Static346.aBooleanArrayArray4[local95][local1284]) {
											local1941 = (local39 << 9) + local1336;
											local1947 = (local55 << 9) + local1884;
											local984[local951] = arg3.method7839(local1941, local1947) - arg4.method7839(local1941, local1947);
										}
										if (local993 != null) {
											if (arg3 != null && !Static346.aBooleanArrayArray4[local95][local1284]) {
												local1941 = local1336 + (local39 << 9);
												local1947 = (local55 << 9) + local1884;
												local993[local951] = arg4.method7839(local1941, local1947) - arg3.method7839(local1941, local1947);
											} else if (arg5 != null && !Static339.aBooleanArrayArray2[local95][local1284]) {
												local1941 = (local39 << 9) + local1336;
												local1947 = local1884 + (local55 << 9);
												local993[local951] = arg5.method7839(local1941, local1947) - arg4.method7839(local1941, local1947);
											}
										}
										if (local1284 < 8 && Static577.anIntArray606[local1269] >= 0) {
											if (local962 != null) {
												local962[local951] = Static509.anIntArray542[local1269];
											}
											local977[local951] = Static335.anIntArray391[local1269];
											local974[local951] = Static133.anIntArray131[local1269];
											local971[local951] = Static594.anIntArray634[local1269];
										} else {
											if (local86 && Static346.aBooleanArrayArray4[local95][local1284]) {
												local974[local951] = local997;
												local977[local951] = local999;
												local971[local951] = local995;
											} else if (local1336 == 0 && local1884 == 0) {
												local971[local951] = arg1[local39][local55];
												local974[local951] = local1585.anInt4621;
												local977[local951] = local1585.anInt4615;
											} else if (local1336 == 0 && local1884 == 512) {
												local971[local951] = arg1[local39][local69];
												local974[local951] = local1593.anInt4621;
												local977[local951] = local1593.anInt4615;
											} else if (local1336 == 512 && local1884 == 512) {
												local971[local951] = arg1[local53][local69];
												local974[local951] = local1601.anInt4621;
												local977[local951] = local1601.anInt4615;
											} else if (local1336 == 512 && local1884 == 0) {
												local971[local951] = arg1[local53][local55];
												local974[local951] = local1609.anInt4621;
												local977[local951] = local1609.anInt4615;
											} else {
												if (local1336 >= 256) {
													if (local1884 >= 256) {
														local974[local951] = local1601.anInt4621;
														local977[local951] = local1601.anInt4615;
													} else {
														local974[local951] = local1609.anInt4621;
														local977[local951] = local1609.anInt4615;
													}
												} else if (local1884 >= 256) {
													local974[local951] = local1593.anInt4621;
													local977[local951] = local1593.anInt4615;
												} else {
													local974[local951] = local1585.anInt4621;
													local977[local951] = local1585.anInt4615;
												}
												local1941 = Static591.method8304(arg1[local53][local55], local1336 << 7 >> 9, arg1[local39][local55]);
												local1947 = Static591.method8304(arg1[local53][local69], local1336 << 7 >> 9, arg1[local39][local69]);
												local971[local951] = Static591.method8304(local1947, local1884 << 7 >> 9, local1941);
											}
											if (local962 != null) {
												local962[local951] = local971[local951];
											}
										}
										local951++;
									}
								}
								if (local95 != 0 && local175.aBoolean312) {
									local84 = true;
								}
							}
							local1015 = arg4.method7835(local39, local55);
							local1017 = arg4.method7835(local53, local55);
							local1244 = arg4.method7835(local53, local69);
							local1250 = arg4.method7835(local39, local69);
							@Pc(2374) boolean local2374 = Static486.method7232(local55, local39);
							if (local2374 && arg2 > 1 || !local2374 && arg2 > 0) {
								@Pc(2390) boolean local2390 = true;
								if (local175 != null && !local175.aBoolean311) {
									local2390 = false;
								} else if (local117 == 0 && local95 != 0) {
									local2390 = false;
								} else if (local109 > 0 && local183 != null && !local183.aBoolean265) {
									local2390 = false;
								}
								if (local2390 && local1017 == local1015 && local1244 == local1015 && local1015 == local1250) {
									this.aByteArrayArrayArray10[arg2][local39][local55] = (byte) (this.aByteArrayArrayArray10[arg2][local39][local55] | 0x4);
								}
							}
							local1264 = 0;
							local1284 = 0;
							local1269 = 0;
							if (this.aBoolean164) {
								local1264 = Static568.method8121(local39, local55);
								local1284 = Static191.method3261(local39, local55);
								local1269 = Static511.method7625(local39, local55);
							}
							arg4.U(local39, local55, local965, local984, local968, local993, local971, local962, local974, local977, local1264, local1284, local1269, local84);
							Static2.method23(arg2, local39, local55);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ria", name = "a", descriptor = "(IIIIII)V")
	public final void method2287(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(7) int local7;
		for (@Pc(3) int local3 = arg0; local3 < arg0 + arg4; local3++) {
			for (local7 = arg3; local7 < arg3 + arg2; local7++) {
				if (local7 >= 0 && this.anInt2414 > local7 && local3 >= 0 && local3 < this.anInt2408) {
					this.anIntArrayArrayArray8[arg1][local7][local3] = arg1 > 0 ? this.anIntArrayArrayArray8[arg1 - 1][local7][local3] - 960 : 0;
				}
			}
		}
		if (arg3 > 0 && this.anInt2414 > arg3) {
			for (local7 = arg0 + 1; local7 < arg0 + arg4; local7++) {
				if (local7 >= 0 && local7 < this.anInt2408) {
					this.anIntArrayArrayArray8[arg1][arg3][local7] = this.anIntArrayArrayArray8[arg1][arg3 - 1][local7];
				}
			}
		}
		if (arg0 > 0 && this.anInt2408 > arg0) {
			for (local7 = arg3 + 1; local7 < arg2 + arg3; local7++) {
				if (local7 >= 0 && local7 < this.anInt2414) {
					this.anIntArrayArrayArray8[arg1][local7][arg0] = this.anIntArrayArrayArray8[arg1][local7][arg0 - 1];
				}
			}
		}
		if (arg3 < 0 || arg0 < 0 || this.anInt2414 <= arg3 || arg0 >= this.anInt2408) {
			return;
		}
		if (arg1 != 0) {
			if (arg3 > 0 && this.anIntArrayArrayArray8[arg1][arg3 - 1][arg0] != this.anIntArrayArrayArray8[arg1 - 1][arg3 - 1][arg0]) {
				this.anIntArrayArrayArray8[arg1][arg3][arg0] = this.anIntArrayArrayArray8[arg1][arg3 - 1][arg0];
				return;
			}
			if (arg0 > 0 && this.anIntArrayArrayArray8[arg1][arg3][arg0 - 1] != this.anIntArrayArrayArray8[arg1 - 1][arg3][arg0 - 1]) {
				this.anIntArrayArrayArray8[arg1][arg3][arg0] = this.anIntArrayArrayArray8[arg1][arg3][arg0 - 1];
				return;
			}
			if (arg3 > 0 && arg0 > 0 && this.anIntArrayArrayArray8[arg1][arg3 - 1][arg0 - 1] != this.anIntArrayArrayArray8[arg1 - 1][arg3 - 1][arg0 - 1]) {
				this.anIntArrayArrayArray8[arg1][arg3][arg0] = this.anIntArrayArrayArray8[arg1][arg3 - 1][arg0 - 1];
				return;
			}
			return;
		}
		if (arg3 > 0 && this.anIntArrayArrayArray8[arg1][arg3 - 1][arg0] != 0) {
			this.anIntArrayArrayArray8[arg1][arg3][arg0] = this.anIntArrayArrayArray8[arg1][arg3 - 1][arg0];
			return;
		}
		if (arg0 > 0 && this.anIntArrayArrayArray8[arg1][arg3][arg0 - 1] != 0) {
			this.anIntArrayArrayArray8[arg1][arg3][arg0] = this.anIntArrayArrayArray8[arg1][arg3][arg0 - 1];
			return;
		}
		if (arg3 > 0 && arg0 > 0 && this.anIntArrayArrayArray8[arg1][arg3 - 1][arg0 - 1] != 0) {
			this.anIntArrayArrayArray8[arg1][arg3][arg0] = this.anIntArrayArrayArray8[arg1][arg3 - 1][arg0 - 1];
			return;
		}
	}
}
