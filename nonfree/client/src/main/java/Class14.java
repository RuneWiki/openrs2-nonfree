import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!at")
public class Class14 {

	@OriginalMember(owner = "client!at", name = "C", descriptor = "[[[B")
	public byte[][][] aByteArrayArrayArray14;

	@OriginalMember(owner = "client!at", name = "p", descriptor = "[I")
	private final int[] anIntArray305 = new int[] { 0, 64, 128, 128, 128, 64, 0, 0, 32, 64, 32, 96, 64 };

	@OriginalMember(owner = "client!at", name = "o", descriptor = "[I")
	private final int[] anIntArray304 = new int[] { 0, 0, 0, 64, 128, 128, 128, 64, 64, 96, 32, 32, 64 };

	@OriginalMember(owner = "client!at", name = "D", descriptor = "I")
	protected final int anInt3470;

	@OriginalMember(owner = "client!at", name = "e", descriptor = "Lclient!cq;")
	private final Class42 aClass42_4;

	@OriginalMember(owner = "client!at", name = "m", descriptor = "I")
	protected final int anInt3460;

	@OriginalMember(owner = "client!at", name = "x", descriptor = "I")
	public final int anInt3467;

	@OriginalMember(owner = "client!at", name = "l", descriptor = "Lclient!r;")
	private final Class205 aClass205_4;

	@OriginalMember(owner = "client!at", name = "v", descriptor = "Z")
	public final boolean aBoolean210;

	@OriginalMember(owner = "client!at", name = "H", descriptor = "[[[B")
	protected byte[][][] aByteArrayArrayArray16;

	@OriginalMember(owner = "client!at", name = "G", descriptor = "[[[B")
	private final byte[][][] aByteArrayArrayArray15;

	@OriginalMember(owner = "client!at", name = "i", descriptor = "[[[B")
	private final byte[][][] aByteArrayArrayArray11;

	@OriginalMember(owner = "client!at", name = "k", descriptor = "[[[I")
	public final int[][][] anIntArrayArrayArray4;

	@OriginalMember(owner = "client!at", name = "u", descriptor = "[[[B")
	private final byte[][][] aByteArrayArrayArray12;

	@OriginalMember(owner = "client!at", name = "y", descriptor = "[[[B")
	private final byte[][][] aByteArrayArrayArray13;

	@OriginalMember(owner = "client!at", name = "<init>", descriptor = "(IIIZLclient!cq;Lclient!r;)V")
	protected Class14(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) Class42 arg4, @OriginalArg(5) Class205 arg5) {
		this.anInt3470 = arg1;
		this.aClass42_4 = arg4;
		this.anInt3460 = arg2;
		this.anInt3467 = arg0;
		this.aClass205_4 = arg5;
		this.aBoolean210 = arg3;
		this.aByteArrayArrayArray16 = new byte[this.anInt3467][this.anInt3470 + 1][this.anInt3460 + 1];
		this.aByteArrayArrayArray15 = new byte[this.anInt3467][this.anInt3470][this.anInt3460];
		this.aByteArrayArrayArray11 = new byte[this.anInt3467][this.anInt3470][this.anInt3460];
		this.anIntArrayArrayArray4 = new int[this.anInt3467][this.anInt3470 + 1][this.anInt3460 + 1];
		this.aByteArrayArrayArray12 = new byte[this.anInt3467][this.anInt3470][this.anInt3460];
		this.aByteArrayArrayArray13 = new byte[this.anInt3467][this.anInt3470][this.anInt3460];
	}

	@OriginalMember(owner = "client!at", name = "a", descriptor = "(I[[II)V")
	public final void method2989(@OriginalArg(1) int[][] arg0) {
		@Pc(16) int[][] local16 = this.anIntArrayArrayArray4[0];
		for (@Pc(18) int local18 = 0; local18 < this.anInt3470 + 1; local18++) {
			for (@Pc(22) int local22 = 0; local22 < this.anInt3460 + 1; local22++) {
				local16[local18][local22] += arg0[local18][local22];
			}
		}
	}

	@OriginalMember(owner = "client!at", name = "a", descriptor = "(I[Lclient!pd;ILclient!hp;IIBIII)V")
	public final void method2993(@OriginalArg(0) int arg0, @OriginalArg(1) Class188[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class1_Sub5 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(11) int local11 = (arg5 & 0x7) * 8;
		@Pc(24) int local24;
		if (!this.aBoolean210) {
			@Pc(18) Class188 local18 = arg1[arg8];
			for (@Pc(20) int local20 = 0; local20 < 8; local20++) {
				for (local24 = 0; local24 < 8; local24++) {
					@Pc(38) int local38 = arg4 + Static272.method4011(local20 & 0x7, arg7, local24 & 0x7);
					@Pc(51) int local51 = arg6 + Static298.method5255(local20 & 0x7, arg7, local24 & 0x7);
					if (local38 > 0 && this.anInt3470 - 1 > local38 && local51 > 0 && this.anInt3460 - 1 > local51) {
						local18.method4317(local38, local51);
					}
				}
			}
		}
		@Pc(97) int local97 = (arg2 & 0x7) * 8;
		@Pc(103) int local103 = (arg5 & 0x1FFFFFF8) << 3;
		local24 = (arg2 & 0xFFFFFFF8) << 3;
		@Pc(119) byte local119 = 0;
		@Pc(121) byte local121 = 0;
		if (arg7 == 1) {
			local121 = 1;
		} else if (arg7 == 2) {
			local121 = 1;
			local119 = 1;
		} else if (arg7 == 3) {
			local119 = 1;
		}
		for (@Pc(146) int local146 = 0; local146 < this.anInt3467; local146++) {
			for (@Pc(150) int local150 = 0; local150 < 64; local150++) {
				for (@Pc(154) int local154 = 0; local154 < 64; local154++) {
					if (arg0 == local146 && local11 <= local150 && local150 <= local11 + 8 && local154 >= local97 && local97 + 8 >= local154) {
						@Pc(205) int local205;
						@Pc(217) int local217;
						if (local11 + 8 == local150 || local154 == local97 + 8) {
							if (arg7 == 0) {
								local205 = local150 + arg4 - local11;
								local217 = local154 + arg6 - local97;
							} else if (arg7 == 1) {
								local217 = arg6 + local11 + 8 - local150;
								local205 = arg4 + local154 - local97;
							} else if (arg7 == 2) {
								local217 = arg6 + local97 + 8 - local154;
								local205 = arg4 + local11 + 8 - local150;
							} else {
								local205 = arg4 + local97 + 8 - local154;
								local217 = local150 + arg6 - local11;
							}
							this.method2996(local103 + local150, local154 + local24, arg8, 0, arg3, 0, local217, true, 0, local205);
						} else {
							local205 = Static272.method4011(local150 & 0x7, arg7, local154 & 0x7) + arg4;
							local217 = Static298.method5255(local150 & 0x7, arg7, local154 & 0x7) + arg6;
							this.method2996(local103 + local150, local154 + local24, arg8, arg7, arg3, local119, local217, false, local121, local205);
							if (local150 == 63 || local154 == 63) {
								@Pc(251) int local251 = local150 == 63 ? 64 : local150;
								@Pc(258) int local258 = local154 == 63 ? 64 : local154;
								@Pc(269) int local269;
								@Pc(275) int local275;
								if (arg7 == 0) {
									local269 = arg4 + local251 - local11;
									local275 = local258 + arg6 - local97;
								} else if (arg7 == 1) {
									local269 = local258 + arg4 - local97;
									local275 = arg6 + local11 + 8 - local251;
								} else if (arg7 == 2) {
									local275 = arg6 + local97 + 8 - local258;
									local269 = local11 + arg4 + 8 - local251;
								} else {
									local275 = arg6 + local251 - local11;
									local269 = local97 + arg4 + 8 - local258;
								}
								if (local269 >= 0 && this.anInt3470 > local269 && local275 >= 0 && this.anInt3460 > local275) {
									this.anIntArrayArrayArray4[arg8][local269][local275] = this.anIntArrayArrayArray4[arg8][local205 + local119][local121 + local217];
								}
							}
						}
					} else {
						this.method2996(0, 0, 0, 0, arg3, 0, -1, false, 0, -1);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!at", name = "a", descriptor = "(Lclient!ta;ILclient!ya;Lclient!ta;Lclient!ta;I[[I)V")
	private void method2994(@OriginalArg(0) Class149 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class39 arg2, @OriginalArg(3) Class149 arg3, @OriginalArg(4) Class149 arg4, @OriginalArg(6) int[][] arg5) {
		for (@Pc(3) int local3 = 0; local3 < this.anInt3470; local3++) {
			for (@Pc(7) int local7 = 0; local7 < this.anInt3460; local7++) {
				if (Static129.anInt3958 == -1 || Static412.method5522(local3, arg1, Static129.anInt3958, local7)) {
					@Pc(30) byte local30 = this.aByteArrayArrayArray11[arg1][local3][local7];
					@Pc(39) byte local39 = this.aByteArrayArrayArray13[arg1][local3][local7];
					@Pc(50) int local50 = this.aByteArrayArrayArray12[arg1][local3][local7] & 0xFF;
					@Pc(61) int local61 = this.aByteArrayArrayArray15[arg1][local3][local7] & 0xFF;
					@Pc(73) Class226 local73 = local50 == 0 ? null : this.aClass42_4.method1292(local50 - 1);
					@Pc(88) Class220 local88 = local61 == 0 ? null : this.aClass205_4.method4757(local61 - 1);
					@Pc(90) int local90 = 0;
					@Pc(92) int local92 = 0;
					if (local30 != 0) {
						local92 = local73 == null ? 0 : Static314.anIntArray497[local30];
						local90 = local88 == null ? 0 : Static273.anIntArray421[local30];
					} else if (local73 != null) {
						local92 = Static314.anIntArray497[local30];
					} else if (local88 != null) {
						local90 = Static314.anIntArray497[local30];
					}
					@Pc(130) int local130 = local90 + local92;
					@Pc(132) int local132 = 0;
					if (local130 != 0) {
						@Pc(140) int[] local140 = new int[local130];
						@Pc(143) int[] local143 = new int[local130];
						@Pc(146) int[] local146 = new int[local130];
						@Pc(149) int[] local149 = new int[local130];
						@Pc(151) boolean local151 = false;
						@Pc(175) int local175;
						@Pc(181) int local181;
						if (local73 == null || local73.anInt6125 == -1 && local73.anInt6134 == -1 && local73.anInt6119 == -1) {
							for (local175 = 0; local175 < local92; local175++) {
								local140[local132] = -1;
								local132++;
							}
						} else {
							local175 = arg2.method4551() ? local73.anInt6119 : local73.anInt6126;
							if (Static137.aBoolean165) {
								local175 = -1;
							}
							for (local181 = 0; local181 < local92; local181++) {
								local146[local132] = local175;
								local149[local132] = local73.anInt6127;
								if (local73.anInt6125 == -1) {
									local140[local132] = -1;
								} else {
									local140[local132] = local73.anInt6125;
								}
								if (local73.anInt6134 == -1) {
									local143[local132] = -1;
								} else {
									local151 = true;
									local143[local132] = local73.anInt6134;
								}
								local132++;
							}
							if (!this.aBoolean210 && arg1 == 0) {
								Static54.method916(local3, local7, local73.anInt6131, local73.anInt6128 * 8, local73.anInt6123);
							}
						}
						if (!local151) {
							local143 = null;
						}
						if (local88 == null) {
							for (local175 = 0; local175 < local90; local175++) {
								local140[local132] = -1;
								local132++;
							}
						} else {
							local175 = local88.anInt5967;
							if (Static137.aBoolean165) {
								local175 = -1;
							}
							for (local181 = 0; local181 < local90; local181++) {
								local146[local132] = local175;
								local149[local132] = local88.anInt5966;
								local140[local132] = arg5[local3][local7];
								if (local143 != null) {
									local143[local132] = -1;
								}
								local132++;
							}
						}
						local175 = this.anIntArray305.length;
						@Pc(343) int[] local343 = new int[local175];
						@Pc(346) int[] local346 = new int[local175];
						@Pc(353) int[] local353 = arg4 == null ? null : new int[local175];
						@Pc(362) int[] local362 = arg4 == null && arg3 == null ? null : new int[local175];
						@Pc(371) int local371;
						@Pc(376) int local376;
						@Pc(454) int local454;
						@Pc(460) int local460;
						for (@Pc(364) int local364 = 0; local364 < local175; local364++) {
							local371 = this.anIntArray305[local364];
							local376 = this.anIntArray304[local364];
							if (local39 == 0) {
								local343[local364] = local371;
								local346[local364] = local376;
							} else if (local39 == 1) {
								local343[local364] = local376;
								local346[local364] = 128 - local371;
							} else if (local39 == 2) {
								local343[local364] = 128 - local371;
								local346[local364] = 128 - local376;
							} else if (local39 == 3) {
								local343[local364] = 128 - local376;
								local346[local364] = local371;
							}
							if (local353 != null && Static162.aBooleanArrayArray3[local30][local364]) {
								local454 = local371 + (local3 << 7);
								local460 = local371 + (local7 << 7);
								local353[local364] = arg4.a(local454, local460) - arg0.a(local454, local460);
							}
							if (local362 != null) {
								if (arg4 != null && !Static162.aBooleanArrayArray3[local30][local364]) {
									local454 = local371 + (local3 << 7);
									local460 = local371 + (local7 << 7);
									local362[local364] = arg0.a(local454, local460) - arg4.a(local454, local460);
								} else if (arg3 != null && !Static302.aBooleanArrayArray5[local30][local364]) {
									local454 = local371 + (local3 << 7);
									local460 = local371 + (local7 << 7);
									local362[local364] = arg3.a(local454, local460) - arg0.a(local454, local460);
								}
							}
						}
						local371 = arg0.l(local3, local7);
						local376 = arg0.l(local3 + 1, local7);
						local454 = arg0.l(local3 + 1, local7 + 1);
						local460 = arg0.l(local3, local7 + 1);
						if (arg1 > 0) {
							@Pc(577) boolean local577 = true;
							if (local61 == 0 && local30 != 0) {
								local577 = false;
							}
							if (local50 > 0 && local73 != null && !local73.aBoolean428) {
								local577 = false;
							}
							if (local577 && local376 == local371 && local371 == local454 && local460 == local371) {
								this.aByteArrayArrayArray16[arg1][local3][local7] = (byte) (this.aByteArrayArrayArray16[arg1][local3][local7] | 0x4);
							}
						}
						@Pc(635) int local635 = 0;
						@Pc(637) int local637 = 0;
						@Pc(639) int local639 = 0;
						if (this.aBoolean210) {
							local635 = Static447.method5872(local3, local7);
							local637 = Static90.method1647(local3, local7);
							local639 = Static347.method4849(local3, local7);
						}
						arg0.method3565(local3, local7, local343, local353, local346, local362, Static178.anIntArrayArray39[local30], Static140.anIntArrayArray25[local30], Static61.anIntArrayArray11[local30], local140, local143, local146, local149, local635, local637, local639);
						Static262.method3881(arg1, local3, local7);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!at", name = "a", descriptor = "(ZLclient!ta;Lclient!ya;Lclient!ta;)V")
	public final void method2995(@OriginalArg(1) Class149 arg0, @OriginalArg(2) Class39 arg1, @OriginalArg(3) Class149 arg2) {
		if (Static304.anIntArray454 == null || this.anInt3460 != Static304.anIntArray454.length) {
			Static304.anIntArray454 = new int[this.anInt3460];
			Static21.anIntArray43 = new int[this.anInt3460];
			Static129.anIntArray331 = new int[this.anInt3460];
			Static275.anIntArray426 = new int[this.anInt3460];
			Static266.anIntArray629 = new int[this.anInt3460];
		}
		@Pc(42) int[][] local42 = new int[this.anInt3470][this.anInt3460];
		@Pc(48) int local48;
		for (@Pc(44) int local44 = 0; local44 < this.anInt3467; local44++) {
			for (local48 = 0; local48 < this.anInt3460; local48++) {
				Static304.anIntArray454[local48] = 0;
				Static129.anIntArray331[local48] = 0;
				Static275.anIntArray426[local48] = 0;
				Static266.anIntArray629[local48] = 0;
				Static21.anIntArray43[local48] = 0;
			}
			for (@Pc(81) int local81 = -5; local81 < this.anInt3470; local81++) {
				@Pc(91) int local91;
				@Pc(106) int local106;
				@Pc(175) int local175;
				for (@Pc(85) int local85 = 0; local85 < this.anInt3460; local85++) {
					local91 = local81 + 5;
					@Pc(152) int local152;
					if (this.anInt3470 > local91) {
						local106 = this.aByteArrayArrayArray15[local44][local91][local85] & 0xFF;
						if (local106 > 0) {
							@Pc(116) Class220 local116 = this.aClass205_4.method4757(local106 - 1);
							Static304.anIntArray454[local85] += local116.anInt5964;
							Static129.anIntArray331[local85] += local116.anInt5963;
							Static275.anIntArray426[local85] += local116.anInt5969;
							Static266.anIntArray629[local85] += local116.anInt5968;
							local152 = Static21.anIntArray43[local85]++;
						}
					}
					local106 = local81 - 5;
					if (local106 >= 0) {
						local175 = this.aByteArrayArrayArray15[local44][local106][local85] & 0xFF;
						if (local175 > 0) {
							@Pc(185) Class220 local185 = this.aClass205_4.method4757(local175 - 1);
							Static304.anIntArray454[local85] -= local185.anInt5964;
							Static129.anIntArray331[local85] -= local185.anInt5963;
							Static275.anIntArray426[local85] -= local185.anInt5969;
							Static266.anIntArray629[local85] -= local185.anInt5968;
							local152 = Static21.anIntArray43[local85]--;
						}
					}
				}
				if (local81 >= 0) {
					local91 = 0;
					local106 = 0;
					local175 = 0;
					@Pc(246) int local246 = 0;
					@Pc(248) int local248 = 0;
					for (@Pc(250) int local250 = -5; local250 < this.anInt3460; local250++) {
						@Pc(256) int local256 = local250 + 5;
						if (local256 < this.anInt3460) {
							local91 += Static304.anIntArray454[local256];
							local175 += Static275.anIntArray426[local256];
							local248 += Static21.anIntArray43[local256];
							local246 += Static266.anIntArray629[local256];
							local106 += Static129.anIntArray331[local256];
						}
						@Pc(298) int local298 = local250 - 5;
						if (local298 >= 0) {
							local106 -= Static129.anIntArray331[local298];
							local91 -= Static304.anIntArray454[local298];
							local175 -= Static275.anIntArray426[local298];
							local246 -= Static266.anIntArray629[local298];
							local248 -= Static21.anIntArray43[local298];
						}
						if (local250 >= 0 && local246 > 0 && local248 > 0) {
							local42[local81][local250] = Static431.method5727(local106 / local248, local91 * 256 / local246, local175 / local248);
						}
					}
				}
			}
			if (Static363.aBoolean203) {
				this.method3001(local42, arg1, local44 == 0 ? arg0 : null, Static105.aClass149Array1[local44], local44 == 0 ? arg2 : null, local44);
			} else {
				this.method2994(Static105.aClass149Array1[local44], local44, arg1, local44 == 0 ? arg2 : null, local44 == 0 ? arg0 : null, local42);
			}
			this.aByteArrayArrayArray15[local44] = null;
			this.aByteArrayArrayArray12[local44] = null;
			this.aByteArrayArrayArray11[local44] = null;
			this.aByteArrayArrayArray13[local44] = null;
		}
		if (!this.aBoolean210) {
			if (Static202.anInt3867 != 0) {
				Static358.method4921();
			}
			if (Static106.aBoolean491) {
				Static128.method2245();
			}
		}
		for (local48 = 0; local48 < this.anInt3467; local48++) {
			Static105.aClass149Array1[local48].ca();
		}
	}

	@OriginalMember(owner = "client!at", name = "a", descriptor = "(IIIILclient!hp;IIIZII)V")
	private void method2996(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class1_Sub5 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) boolean arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		if (arg3 == 1) {
			arg8 = 1;
		} else if (arg3 == 2) {
			arg5 = 1;
			arg8 = 1;
		} else if (arg3 == 3) {
			arg5 = 1;
		}
		@Pc(55) int local55;
		if (arg9 < 0 || arg9 >= this.anInt3470 || arg6 < 0 || this.anInt3460 <= arg6) {
			while (true) {
				local55 = arg4.method5366();
				if (local55 == 0) {
					return;
				}
				if (local55 == 1) {
					arg4.method5366();
					return;
				}
				if (local55 <= 49) {
					arg4.method5366();
				}
			}
			return;
		}
		if (!this.aBoolean210 && !arg7) {
			Static2.aByteArrayArrayArray1[arg2][arg9][arg6] = 0;
		}
		while (true) {
			local55 = arg4.method5366();
			if (local55 == 0) {
				if (this.aBoolean210) {
					this.anIntArrayArrayArray4[0][arg9 + arg5][arg8 + arg6] = 0;
					return;
				} else if (arg2 == 0) {
					this.anIntArrayArrayArray4[0][arg5 + arg9][arg8 + arg6] = -Static265.method3924(arg1 + 556238, arg0 + 932731) * 8 << 0;
					return;
				} else {
					this.anIntArrayArrayArray4[arg2][arg5 + arg9][arg6 + arg8] = this.anIntArrayArrayArray4[arg2 - 1][arg9 + arg5][arg8 + arg6] - 240;
					return;
				}
			}
			if (local55 == 1) {
				@Pc(182) int local182 = arg4.method5366();
				if (!this.aBoolean210) {
					if (local182 == 1) {
						local182 = 0;
					}
					if (arg2 == 0) {
						this.anIntArrayArrayArray4[0][arg5 + arg9][arg8 + arg6] = -local182 * 8 << 0;
						return;
					}
					this.anIntArrayArrayArray4[arg2][arg9 + arg5][arg8 + arg6] = this.anIntArrayArrayArray4[arg2 - 1][arg9 + arg5][arg6 + arg8] - (local182 * 8 << 0);
					return;
				}
				this.anIntArrayArrayArray4[0][arg5 + arg9][arg6 + arg8] = local182 * 8 << 0;
				return;
			}
			if (local55 <= 49) {
				if (arg7) {
					arg4.method5366();
				} else {
					this.aByteArrayArrayArray12[arg2][arg9][arg6] = arg4.method5416();
					this.aByteArrayArrayArray11[arg2][arg9][arg6] = (byte) ((local55 - 2) / 4);
					this.aByteArrayArrayArray13[arg2][arg9][arg6] = (byte) (arg3 + local55 - 2 & 0x3);
				}
			} else if (local55 <= 81) {
				if (!this.aBoolean210 && !arg7) {
					Static2.aByteArrayArrayArray1[arg2][arg9][arg6] = (byte) (local55 - 49);
				}
			} else if (!arg7) {
				this.aByteArrayArrayArray15[arg2][arg9][arg6] = (byte) (local55 - 81);
			}
		}
	}

	@OriginalMember(owner = "client!at", name = "a", descriptor = "(II[Lclient!pd;BIILclient!hp;)V")
	public final void method2997(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class188[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class1_Sub5 arg5) {
		@Pc(10) int local10;
		@Pc(18) int local18;
		@Pc(22) int local22;
		@Pc(28) int local28;
		if (!this.aBoolean210) {
			for (local10 = 0; local10 < 4; local10++) {
				@Pc(16) Class188 local16 = arg2[local10];
				for (local18 = 0; local18 < 64; local18++) {
					for (local22 = 0; local22 < 64; local22++) {
						local28 = local18 + arg1;
						@Pc(32) int local32 = local22 + arg3;
						if (local28 >= 0 && this.anInt3470 > local28 && local32 >= 0 && local32 < this.anInt3460) {
							local16.method4317(local28, local32);
						}
					}
				}
			}
		}
		local10 = arg4 + arg1;
		@Pc(85) int local85 = arg0 + arg3;
		for (local18 = 0; local18 < this.anInt3467; local18++) {
			for (local22 = 0; local22 < 64; local22++) {
				for (local28 = 0; local28 < 64; local28++) {
					this.method2996(local22 + local10, local28 + local85, local18, 0, arg5, 0, local28 + arg3, false, 0, arg1 + local22);
				}
			}
		}
	}

	@OriginalMember(owner = "client!at", name = "a", descriptor = "(B[Lclient!pd;Lclient!ya;[[[I)V")
	public final void method2998(@OriginalArg(1) Class188[] arg0, @OriginalArg(2) Class39 arg1, @OriginalArg(3) int[][][] arg2) {
		@Pc(6) int local6;
		@Pc(10) int local10;
		@Pc(14) int local14;
		if (!this.aBoolean210) {
			for (local6 = 0; local6 < 4; local6++) {
				for (local10 = 0; local10 < this.anInt3470; local10++) {
					for (local14 = 0; local14 < this.anInt3460; local14++) {
						if ((Static2.aByteArrayArrayArray1[local6][local10][local14] & 0x1) != 0) {
							@Pc(28) int local28 = local6;
							if ((Static2.aByteArrayArrayArray1[1][local10][local14] & 0x2) != 0) {
								local28 = local6 - 1;
							}
							if (local28 >= 0) {
								arg0[local28].method4310(local10, local14);
							}
						}
					}
				}
			}
		}
		for (local6 = 0; local6 < this.anInt3467; local6++) {
			local10 = 0;
			local14 = 0;
			if (!this.aBoolean210) {
				if (Static291.aBoolean351) {
					local14 = 8;
				}
				if (Static106.aBoolean491) {
					local10 = 2;
				}
				if (Static202.anInt3867 != 0) {
					if (Static8.aBoolean11 | local6 == 0) {
						local14 |= 0x10;
					}
					local10 |= 0x1;
				}
			}
			if (Static106.aBoolean491) {
				local14 |= 0x7;
			}
			if (!Static132.aBoolean160) {
				local14 |= 0x20;
			}
			@Pc(150) int[][] local150 = arg2 == null || arg2.length <= local6 ? this.anIntArrayArrayArray4[local6] : arg2[local6];
			Static45.method4611(local6, arg1.method4561(this.anInt3470, this.anInt3460, this.anIntArrayArrayArray4[local6], local150, local10, local14));
		}
	}

	@OriginalMember(owner = "client!at", name = "a", descriptor = "(IBIII)V")
	public final void method2999(@OriginalArg(0) int arg0, @OriginalArg(4) int arg1) {
		for (@Pc(3) int local3 = 0; local3 < this.anInt3467; local3++) {
			this.method3002(64, 64, arg1, arg0, local3);
		}
	}

	@OriginalMember(owner = "client!at", name = "a", descriptor = "([[ILclient!ya;Lclient!ta;ILclient!ta;Lclient!ta;I)V")
	private void method3001(@OriginalArg(0) int[][] arg0, @OriginalArg(1) Class39 arg1, @OriginalArg(2) Class149 arg2, @OriginalArg(4) Class149 arg3, @OriginalArg(5) Class149 arg4, @OriginalArg(6) int arg5) {
		@Pc(10) byte[][] local10 = this.aByteArrayArrayArray11[arg5];
		@Pc(15) byte[][] local15 = this.aByteArrayArrayArray13[arg5];
		@Pc(20) byte[][] local20 = this.aByteArrayArrayArray15[arg5];
		@Pc(29) byte[][] local29 = this.aByteArrayArrayArray12[arg5];
		for (@Pc(31) int local31 = 0; local31 < this.anInt3470; local31++) {
			@Pc(45) int local45 = local31 >= this.anInt3470 - 1 ? local31 : local31 + 1;
			for (@Pc(47) int local47 = 0; local47 < this.anInt3460; local47++) {
				@Pc(61) int local61 = local47 >= this.anInt3460 - 1 ? local47 : local47 + 1;
				if (Static129.anInt3958 == -1 || Static412.method5522(local31, arg5, Static129.anInt3958, local47)) {
					@Pc(75) boolean local75 = false;
					@Pc(77) boolean local77 = false;
					@Pc(80) boolean[] local80 = new boolean[4];
					@Pc(86) int local86 = local10[local31][local47];
					@Pc(92) int local92 = local15[local31][local47];
					@Pc(100) int local100 = local29[local31][local47] & 0xFF;
					@Pc(108) int local108 = local20[local31][local47] & 0xFF;
					@Pc(116) int local116 = local20[local31][local61] & 0xFF;
					@Pc(124) int local124 = local20[local45][local61] & 0xFF;
					@Pc(132) int local132 = local20[local45][local47] & 0xFF;
					if (local100 != 0 || local108 != 0) {
						@Pc(157) Class226 local157 = local100 == 0 ? null : this.aClass42_4.method1292(local100 - 1);
						if (local86 == 0 && local157 == null) {
							local86 = 12;
						}
						@Pc(181) Class220 local181 = local108 == 0 ? null : this.aClass205_4.method4757(local108 - 1);
						@Pc(183) Class226 local183 = local157;
						if (local157 != null) {
							if (local157.anInt6125 == -1 && local157.anInt6134 == -1) {
								local183 = local157;
								local157 = null;
							} else if (local181 != null && local86 != 0) {
								local77 = local157.aBoolean427;
							}
						}
						@Pc(258) int local258;
						@Pc(315) int local315;
						@Pc(384) int local384;
						@Pc(394) int local394;
						if ((local86 == 0 || local86 == 12) && local31 > 0 && local47 > 0 && local31 < this.anInt3470 && this.anInt3460 > local47) {
							local258 = local20[local31 - 1][local47 - 1] == local108 ? 1 : -1;
							@Pc(275) int local275 = local108 == local20[local45][local61] ? 1 : -1;
							@Pc(296) int local296 = local20[local45][local47 - 1] == local108 ? 1 : -1;
							local315 = local108 == local20[local31 - 1][local61] ? 1 : -1;
							if (local108 == local20[local31][local47 - 1]) {
								local296++;
								local258++;
							} else {
								local258--;
								local296--;
							}
							if (local20[local45][local47] == local108) {
								local296++;
								local275++;
							} else {
								local275--;
								local296--;
							}
							if (local20[local31][local61] == local108) {
								local315++;
								local275++;
							} else {
								local315--;
								local275--;
							}
							if (local20[local31 - 1][local47] == local108) {
								local258++;
								local315++;
							} else {
								local315--;
								local258--;
							}
							local384 = local258 - local275;
							if (local384 < 0) {
								local384 = -local384;
							}
							local394 = local296 - local315;
							if (local394 < 0) {
								local394 = -local394;
							}
							if (local384 == local394) {
								local384 = arg3.l(local31, local47) - arg3.l(local45, local61);
								local394 = arg3.l(local45, local47) - arg3.l(local31, local61);
								if (local384 < 0) {
									local384 = -local384;
								}
								if (local394 < 0) {
									local394 = -local394;
								}
							}
							local92 = local394 > local384 ? 1 : 0;
						}
						for (local258 = 0; local258 < 13; local258++) {
							Static191.anIntArray302[local258] = -1;
							Static229.anIntArray343[local258] = 1;
						}
						@Pc(482) boolean[] local482 = local157 != null && local157.aBoolean427 ? Static387.aBooleanArrayArray7[local86] : Static370.aBooleanArrayArray6[local86];
						this.method3003(local86, local10, local15, local29, local157, local31, local92, arg1, local80, local181, local47, this.anInt3470, this.anInt3460);
						@Pc(515) boolean local515 = local157 != null && local157.anInt6125 != local157.anInt6134;
						if (!local515) {
							for (local315 = 0; local315 < 8; local315++) {
								if (Static191.anIntArray302[local315] >= 0 && Static85.anIntArray149[local315] != Static301.anIntArray449[local315]) {
									local515 = true;
									break;
								}
							}
						}
						if (!local482[local92 + 1 & 0x3]) {
							local80[1] = Static416.method5558(local80[1], (Static229.anIntArray343[2] & Static229.anIntArray343[4]) == 0);
						}
						if (!local482[local92 + 3 & 0x3]) {
							local80[3] = Static416.method5558(local80[3], (Static229.anIntArray343[0] & Static229.anIntArray343[6]) == 0);
						}
						if (!local482[local92 & 0x3]) {
							local80[0] = Static416.method5558(local80[0], (Static229.anIntArray343[0] & Static229.anIntArray343[2]) == 0);
						}
						if (!local482[local92 + 2 & 0x3]) {
							local80[2] = Static416.method5558(local80[2], (Static229.anIntArray343[6] & Static229.anIntArray343[4]) == 0);
						}
						if (!local77 && (local86 == 0 || local86 == 12)) {
							if (local80[0] && !local80[1] && !local80[2] && local80[3]) {
								local80[0] = local80[3] = false;
								local86 = local86 == 0 ? 13 : 14;
								local92 = 0;
							} else if (local80[0] && local80[1] && !local80[2] && !local80[3]) {
								local80[0] = local80[1] = false;
								local92 = 3;
								local86 = local86 == 0 ? 13 : 14;
							} else if (!local80[0] && local80[1] && local80[2] && !local80[3]) {
								local80[1] = local80[2] = false;
								local92 = 2;
								local86 = local86 == 0 ? 13 : 14;
							} else if (!local80[0] && !local80[1] && local80[2] && local80[3]) {
								local80[2] = local80[3] = false;
								local92 = 1;
								local86 = local86 == 0 ? 13 : 14;
							}
						}
						@Pc(828) boolean local828 = !local77 && !local80[0] && !local80[2] && !local80[1] && !local80[3];
						@Pc(830) int[] local830 = null;
						@Pc(862) int[] local862;
						@Pc(846) int[] local846;
						@Pc(858) int[] local858;
						if (local828) {
							local394 = local157 == null ? 0 : Static314.anIntArray497[local86];
							local858 = Static61.anIntArrayArray11[local86];
							local384 = local181 == null ? 0 : Static273.anIntArray421[local86];
							local862 = Static178.anIntArrayArray39[local86];
							local846 = Static140.anIntArrayArray25[local86];
						} else if (local77) {
							local858 = Static301.anIntArrayArray50[local86];
							local862 = Static169.anIntArrayArray38[local86];
							local394 = local157 == null ? 0 : Static206.anIntArray325[local86];
							local830 = Static72.anIntArrayArray15[local86];
							local384 = local181 == null ? 0 : Static89.anIntArray157[local86];
							local846 = Static85.anIntArrayArray22[local86];
						} else {
							local394 = local157 == null ? 0 : Static378.anIntArray355[local86];
							local846 = Static370.anIntArrayArray58[local86];
							local384 = local181 == null ? 0 : Static442.anIntArray642[local86];
							local858 = Static5.anIntArrayArray1[local86];
							local862 = Static90.anIntArrayArray24[local86];
							local830 = Static12.anIntArrayArray2[local86];
						}
						@Pc(932) int local932 = local384 + local394;
						if (local932 <= 0) {
							Static262.method3881(arg5, local31, local47);
						} else {
							if (local80[0]) {
								local932++;
							}
							if (local80[2]) {
								local932++;
							}
							if (local80[1]) {
								local932++;
							}
							if (local80[3]) {
								local932++;
							}
							@Pc(965) int local965 = 0;
							@Pc(967) int local967 = 0;
							@Pc(971) int local971 = local932 * 3;
							@Pc(978) int[] local978 = local515 ? new int[local971] : null;
							@Pc(981) int[] local981 = new int[local971];
							@Pc(984) int[] local984 = new int[local971];
							@Pc(987) int[] local987 = new int[local971];
							@Pc(990) int[] local990 = new int[local971];
							@Pc(993) int[] local993 = new int[local971];
							@Pc(1000) int[] local1000 = arg2 == null ? null : new int[local971];
							@Pc(1009) int[] local1009 = arg2 == null && arg4 == null ? null : new int[local971];
							@Pc(1011) int local1011 = -1;
							@Pc(1013) int local1013 = -1;
							@Pc(1015) int local1015 = 256;
							@Pc(1083) byte local1083;
							@Pc(1037) int local1037;
							@Pc(1039) int local1039;
							@Pc(1274) int local1274;
							@Pc(1280) int local1280;
							@Pc(1288) int local1288;
							@Pc(1293) int local1293;
							@Pc(1311) int local1311;
							@Pc(1298) int local1298;
							@Pc(1313) int local1313;
							@Pc(1362) int local1362;
							@Pc(1368) int local1368;
							if (local157 != null) {
								local1011 = local157.anInt6125;
								local1013 = arg1.method4551() ? local157.anInt6119 : local157.anInt6126;
								local1015 = local157.anInt6127;
								local1037 = Static159.method2575(local157, arg1);
								for (local1039 = 0; local1039 < local394; local1039++) {
									if (local80[-local92 & 0x3] && local830[0] == local965) {
										Static254.anIntArray389[0] = local862[local965];
										Static254.anIntArray389[1] = 1;
										Static254.anIntArray389[2] = local858[local965];
										Static254.anIntArray389[3] = 1;
										Static254.anIntArray389[4] = local846[local965];
										local1083 = 6;
										Static254.anIntArray389[5] = local858[local965];
									} else if (local80[2 - local92 & 0x3] && local830[2] == local965) {
										Static254.anIntArray389[0] = local862[local965];
										Static254.anIntArray389[1] = 5;
										Static254.anIntArray389[2] = local858[local965];
										Static254.anIntArray389[3] = 5;
										Static254.anIntArray389[4] = local846[local965];
										Static254.anIntArray389[5] = local858[local965];
										local1083 = 6;
									} else if (local80[1 - local92 & 0x3] && local965 == local830[1]) {
										Static254.anIntArray389[0] = local862[local965];
										Static254.anIntArray389[1] = 3;
										Static254.anIntArray389[2] = local858[local965];
										Static254.anIntArray389[3] = 3;
										Static254.anIntArray389[4] = local846[local965];
										local1083 = 6;
										Static254.anIntArray389[5] = local858[local965];
									} else if (local80[3 - local92 & 0x3] && local965 == local830[3]) {
										Static254.anIntArray389[0] = local862[local965];
										Static254.anIntArray389[1] = 7;
										Static254.anIntArray389[2] = local858[local965];
										Static254.anIntArray389[3] = 7;
										Static254.anIntArray389[4] = local846[local965];
										local1083 = 6;
										Static254.anIntArray389[5] = local858[local965];
									} else {
										Static254.anIntArray389[0] = local862[local965];
										Static254.anIntArray389[1] = local846[local965];
										Static254.anIntArray389[2] = local858[local965];
										local1083 = 3;
									}
									local965++;
									for (local1274 = 0; local1274 < local1083; local1274++) {
										local1280 = Static254.anIntArray389[local1274];
										local1288 = local1280 - local92 * 2 & 0x7;
										local1293 = this.anIntArray305[local1280];
										local1298 = this.anIntArray304[local1280];
										if (local92 == 1) {
											local1313 = 128 - local1293;
											local1311 = local1298;
										} else if (local92 == 2) {
											local1313 = 128 - local1298;
											local1311 = 128 - local1293;
										} else if (local92 == 3) {
											local1311 = 128 - local1298;
											local1313 = local1293;
										} else {
											local1311 = local1293;
											local1313 = local1298;
										}
										local981[local967] = local1311;
										local984[local967] = local1313;
										if (local1000 != null && Static162.aBooleanArrayArray3[local86][local1280]) {
											local1362 = local1311 + (local31 << 7);
											local1368 = local1313 + (local47 << 7);
											local1000[local967] = arg2.a(local1362, local1368) - arg3.a(local1362, local1368);
										}
										if (local1009 != null) {
											if (arg2 != null && !Static162.aBooleanArrayArray3[local86][local1280]) {
												local1362 = local1311 + (local31 << 7);
												local1368 = (local47 << 7) + local1313;
												local1009[local967] = arg3.a(local1362, local1368) - arg2.a(local1362, local1368);
											} else if (arg4 != null && !Static302.aBooleanArrayArray5[local86][local1280]) {
												local1362 = local1311 + (local31 << 7);
												local1368 = (local47 << 7) + local1313;
												local1009[local967] = arg4.a(local1362, local1368) - arg3.a(local1362, local1368);
											}
										}
										if (local1280 < 8 && Static191.anIntArray302[local1288] > local157.anInt6129) {
											if (local978 != null) {
												local978[local967] = Static301.anIntArray449[local1288];
											}
											local993[local967] = Static384.anIntArray568[local1288];
											local990[local967] = Static153.anIntArray263[local1288];
											local987[local967] = Static85.anIntArray149[local1288];
										} else {
											if (local978 != null) {
												local978[local967] = local1037;
											}
											local990[local967] = arg1.method4551() ? local157.anInt6119 : local157.anInt6126;
											local993[local967] = local157.anInt6127;
											local987[local967] = local1011;
										}
										local967++;
									}
								}
								if (!this.aBoolean210 && arg5 == 0) {
									Static54.method916(local31, local47, local157.anInt6131, local157.anInt6128 * 8, local157.anInt6123);
								}
								if (local86 != 12 && local157.anInt6125 != -1 && local157.aBoolean429) {
									local75 = true;
								}
							} else if (local828) {
								local965 = Static314.anIntArray497[local86];
							} else if (local77) {
								local965 = Static206.anIntArray325[local86];
							} else {
								local965 = Static378.anIntArray355[local86];
							}
							if (local181 != null) {
								if (local124 == 0) {
									local124 = local108;
								}
								if (local132 == 0) {
									local132 = local108;
								}
								if (local116 == 0) {
									local116 = local108;
								}
								@Pc(1619) Class220 local1619 = this.aClass205_4.method4757(local108 - 1);
								@Pc(1627) Class220 local1627 = this.aClass205_4.method4757(local116 - 1);
								@Pc(1635) Class220 local1635 = this.aClass205_4.method4757(local124 - 1);
								@Pc(1643) Class220 local1643 = this.aClass205_4.method4757(local132 - 1);
								for (local1288 = 0; local1288 < local384; local1288++) {
									if (local80[-local92 & 0x3] && local965 == local830[0]) {
										Static254.anIntArray389[0] = local862[local965];
										Static254.anIntArray389[1] = 1;
										Static254.anIntArray389[2] = local858[local965];
										Static254.anIntArray389[3] = 1;
										Static254.anIntArray389[4] = local846[local965];
										local1083 = 6;
										Static254.anIntArray389[5] = local858[local965];
									} else if (local80[2 - local92 & 0x3] && local830[2] == local965) {
										Static254.anIntArray389[0] = local862[local965];
										Static254.anIntArray389[1] = 5;
										Static254.anIntArray389[2] = local858[local965];
										Static254.anIntArray389[3] = 5;
										Static254.anIntArray389[4] = local846[local965];
										local1083 = 6;
										Static254.anIntArray389[5] = local858[local965];
									} else if (local80[1 - local92 & 0x3] && local830[1] == local965) {
										Static254.anIntArray389[0] = local862[local965];
										Static254.anIntArray389[1] = 3;
										Static254.anIntArray389[2] = local858[local965];
										Static254.anIntArray389[3] = 3;
										Static254.anIntArray389[4] = local846[local965];
										Static254.anIntArray389[5] = local858[local965];
										local1083 = 6;
									} else if (local80[3 - local92 & 0x3] && local965 == local830[3]) {
										Static254.anIntArray389[0] = local862[local965];
										Static254.anIntArray389[1] = 7;
										Static254.anIntArray389[2] = local858[local965];
										Static254.anIntArray389[3] = 7;
										Static254.anIntArray389[4] = local846[local965];
										local1083 = 6;
										Static254.anIntArray389[5] = local858[local965];
									} else {
										Static254.anIntArray389[0] = local862[local965];
										Static254.anIntArray389[1] = local846[local965];
										local1083 = 3;
										Static254.anIntArray389[2] = local858[local965];
									}
									local965++;
									for (local1293 = 0; local1293 < local1083; local1293++) {
										local1311 = Static254.anIntArray389[local1293];
										local1298 = local1311 - local92 * 2 & 0x7;
										local1313 = this.anIntArray305[local1311];
										local1368 = this.anIntArray304[local1311];
										@Pc(1910) int local1910;
										if (local92 == 1) {
											local1362 = local1368;
											local1910 = 128 - local1313;
										} else if (local92 == 2) {
											local1910 = 128 - local1368;
											local1362 = 128 - local1313;
										} else if (local92 == 3) {
											local1910 = local1313;
											local1362 = 128 - local1368;
										} else {
											local1362 = local1313;
											local1910 = local1368;
										}
										local981[local967] = local1362;
										local984[local967] = local1910;
										@Pc(1967) int local1967;
										@Pc(1974) int local1974;
										if (local1000 != null && Static162.aBooleanArrayArray3[local86][local1311]) {
											local1967 = (local31 << 7) + local1362;
											local1974 = (local47 << 7) + local1910;
											local1000[local967] = arg2.a(local1967, local1974) - arg3.a(local1967, local1974);
										}
										if (local1009 != null) {
											if (arg2 != null && !Static162.aBooleanArrayArray3[local86][local1311]) {
												local1967 = local1362 + (local31 << 7);
												local1974 = (local47 << 7) + local1910;
												local1009[local967] = arg3.a(local1967, local1974) - arg2.a(local1967, local1974);
											} else if (arg4 != null && !Static302.aBooleanArrayArray5[local86][local1311]) {
												local1967 = (local31 << 7) + local1362;
												local1974 = (local47 << 7) + local1910;
												local1009[local967] = arg4.a(local1967, local1974) - arg3.a(local1967, local1974);
											}
										}
										if (local1311 < 8 && Static191.anIntArray302[local1298] >= 0) {
											if (local978 != null) {
												local978[local967] = Static301.anIntArray449[local1298];
											}
											local993[local967] = Static384.anIntArray568[local1298];
											local990[local967] = Static153.anIntArray263[local1298];
											local987[local967] = Static85.anIntArray149[local1298];
										} else {
											if (local77 && Static162.aBooleanArrayArray3[local86][local1311]) {
												local990[local967] = local1013;
												local993[local967] = local1015;
												local987[local967] = local1011;
											} else if (local1362 == 0 && local1910 == 0) {
												local987[local967] = arg0[local31][local47];
												local990[local967] = local1619.anInt5967;
												local993[local967] = local1619.anInt5966;
											} else if (local1362 == 0 && local1910 == 128) {
												local987[local967] = arg0[local31][local61];
												local990[local967] = local1627.anInt5967;
												local993[local967] = local1627.anInt5966;
											} else if (local1362 == 128 && local1910 == 128) {
												local987[local967] = arg0[local45][local61];
												local990[local967] = local1635.anInt5967;
												local993[local967] = local1635.anInt5966;
											} else if (local1362 == 128 && local1910 == 0) {
												local987[local967] = arg0[local45][local47];
												local990[local967] = local1643.anInt5967;
												local993[local967] = local1643.anInt5966;
											} else {
												if (local1362 >= 64) {
													if (local1910 >= 64) {
														local990[local967] = local1635.anInt5967;
														local993[local967] = local1635.anInt5966;
													} else {
														local990[local967] = local1643.anInt5967;
														local993[local967] = local1643.anInt5966;
													}
												} else if (local1910 < 64) {
													local990[local967] = local1619.anInt5967;
													local993[local967] = local1619.anInt5966;
												} else {
													local990[local967] = local1627.anInt5967;
													local993[local967] = local1627.anInt5966;
												}
												local1967 = Static391.method5234(local1362 << 7 >> 7, arg0[local45][local47], arg0[local31][local47]);
												local1974 = Static391.method5234(local1362 << 7 >> 7, arg0[local45][local61], arg0[local31][local61]);
												local987[local967] = Static391.method5234(local1910 << 7 >> 7, local1974, local1967);
											}
											if (local978 != null) {
												local978[local967] = local987[local967];
											}
										}
										local967++;
									}
								}
								if (local86 != 0 && local181.aBoolean416) {
									local75 = true;
								}
							}
							local1037 = arg3.l(local31, local47);
							local1039 = arg3.l(local45, local47);
							local1274 = arg3.l(local45, local61);
							local1280 = arg3.l(local31, local61);
							if (arg5 > 0) {
								@Pc(2397) boolean local2397 = true;
								if (local108 == 0 && local86 != 0) {
									local2397 = false;
								}
								if (local100 > 0 && local183 != null && !local183.aBoolean428) {
									local2397 = false;
								}
								if (local2397 && local1039 == local1037 && local1274 == local1037 && local1280 == local1037) {
									this.aByteArrayArrayArray16[arg5][local31][local47] = (byte) (this.aByteArrayArrayArray16[arg5][local31][local47] | 0x4);
								}
							}
							local1288 = 0;
							local1293 = 0;
							local1311 = 0;
							if (this.aBoolean210) {
								local1288 = Static447.method5872(local31, local47);
								local1293 = Static90.method1647(local31, local47);
								local1311 = Static347.method4849(local31, local47);
							}
							arg3.B(local31, local47, local981, local1000, local984, local1009, local987, local978, local990, local993, local1288, local1293, local1311, local75);
							Static262.method3881(arg5, local31, local47);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!at", name = "a", descriptor = "(IIIIII)V")
	public final void method3002(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		@Pc(7) int local7;
		for (@Pc(3) int local3 = arg3; local3 < arg3 + arg1; local3++) {
			for (local7 = arg2; local7 < arg0 + arg2; local7++) {
				if (local7 >= 0 && this.anInt3470 > local7 && local3 >= 0 && local3 < this.anInt3460) {
					this.anIntArrayArrayArray4[arg4][local7][local3] = arg4 <= 0 ? 0 : this.anIntArrayArrayArray4[arg4 - 1][local7][local3] - 240;
				}
			}
		}
		if (arg2 > 0 && this.anInt3470 > arg2) {
			for (local7 = arg3 + 1; local7 < arg3 + arg1; local7++) {
				if (local7 >= 0 && this.anInt3460 > local7) {
					this.anIntArrayArrayArray4[arg4][arg2][local7] = this.anIntArrayArrayArray4[arg4][arg2 - 1][local7];
				}
			}
		}
		if (arg3 > 0 && arg3 < this.anInt3460) {
			for (local7 = arg2 + 1; local7 < arg0 + arg2; local7++) {
				if (local7 >= 0 && local7 < this.anInt3470) {
					this.anIntArrayArrayArray4[arg4][local7][arg3] = this.anIntArrayArrayArray4[arg4][local7][arg3 - 1];
				}
			}
		}
		if (arg2 < 0 || arg3 < 0 || arg2 >= this.anInt3470 || arg3 >= this.anInt3460) {
			return;
		}
		if (arg4 == 0) {
			if (arg2 > 0 && this.anIntArrayArrayArray4[arg4][arg2 - 1][arg3] != 0) {
				this.anIntArrayArrayArray4[arg4][arg2][arg3] = this.anIntArrayArrayArray4[arg4][arg2 - 1][arg3];
				return;
			}
			if (arg3 > 0 && this.anIntArrayArrayArray4[arg4][arg2][arg3 - 1] != 0) {
				this.anIntArrayArrayArray4[arg4][arg2][arg3] = this.anIntArrayArrayArray4[arg4][arg2][arg3 - 1];
				return;
			}
			if (arg2 > 0 && arg3 > 0 && this.anIntArrayArrayArray4[arg4][arg2 - 1][arg3 - 1] != 0) {
				this.anIntArrayArrayArray4[arg4][arg2][arg3] = this.anIntArrayArrayArray4[arg4][arg2 - 1][arg3 - 1];
				return;
			}
			return;
		}
		if (arg2 > 0 && this.anIntArrayArrayArray4[arg4 - 1][arg2 - 1][arg3] != this.anIntArrayArrayArray4[arg4][arg2 - 1][arg3]) {
			this.anIntArrayArrayArray4[arg4][arg2][arg3] = this.anIntArrayArrayArray4[arg4][arg2 - 1][arg3];
			return;
		}
		if (arg3 > 0 && this.anIntArrayArrayArray4[arg4 - 1][arg2][arg3 - 1] != this.anIntArrayArrayArray4[arg4][arg2][arg3 - 1]) {
			this.anIntArrayArrayArray4[arg4][arg2][arg3] = this.anIntArrayArrayArray4[arg4][arg2][arg3 - 1];
			return;
		}
		if (arg2 > 0 && arg3 > 0 && this.anIntArrayArrayArray4[arg4][arg2 - 1][arg3 - 1] != this.anIntArrayArrayArray4[arg4 - 1][arg2 - 1][arg3 - 1]) {
			this.anIntArrayArrayArray4[arg4][arg2][arg3] = this.anIntArrayArrayArray4[arg4][arg2 - 1][arg3 - 1];
			return;
		}
	}

	@OriginalMember(owner = "client!at", name = "a", descriptor = "(I[[B[[B[[BLclient!st;IILclient!ya;I[ZLclient!sd;III)V")
	private void method3003(@OriginalArg(0) int arg0, @OriginalArg(1) byte[][] arg1, @OriginalArg(2) byte[][] arg2, @OriginalArg(3) byte[][] arg3, @OriginalArg(4) Class226 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) Class39 arg7, @OriginalArg(9) boolean[] arg8, @OriginalArg(10) Class220 arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11, @OriginalArg(13) int arg12) {
		@Pc(18) boolean[] local18 = arg4 != null && arg4.aBoolean427 ? Static387.aBooleanArrayArray7[arg0] : Static370.aBooleanArrayArray6[arg0];
		@Pc(37) int local37;
		@Pc(50) Class226 local50;
		@Pc(68) byte local68;
		@Pc(84) int local84;
		@Pc(89) int local89;
		if (arg10 > 0) {
			if (arg5 > 0) {
				local37 = arg3[arg5 - 1][arg10 - 1] & 0xFF;
				if (local37 > 0) {
					local50 = this.aClass42_4.method1292(local37 - 1);
					if (local50.anInt6125 != -1 && local50.aBoolean427) {
						local68 = arg1[arg5 - 1][arg10 - 1];
						local84 = arg2[arg5 - 1][arg10 - 1] * 2 + 4 & 0x7;
						local89 = Static159.method2575(local50, arg7);
						if (Static162.aBooleanArrayArray3[local68][local84]) {
							Static85.anIntArray149[0] = local50.anInt6125;
							Static301.anIntArray449[0] = local89;
							Static153.anIntArray263[0] = arg7.method4551() ? local50.anInt6119 : local50.anInt6126;
							Static384.anIntArray568[0] = local50.anInt6127;
							Static191.anIntArray302[0] = local50.anInt6129;
							Static229.anIntArray343[0] = 256;
						}
					}
				}
			}
			if (arg11 - 1 > arg5) {
				local37 = arg3[arg5 + 1][arg10 - 1] & 0xFF;
				if (local37 > 0) {
					local50 = this.aClass42_4.method1292(local37 - 1);
					if (local50.anInt6125 != -1 && local50.aBoolean427) {
						local68 = arg1[arg5 + 1][arg10 - 1];
						local84 = arg2[arg5 + 1][arg10 - 1] * 2 + 6 & 0x7;
						local89 = Static159.method2575(local50, arg7);
						if (Static162.aBooleanArrayArray3[local68][local84]) {
							Static85.anIntArray149[2] = local50.anInt6125;
							Static301.anIntArray449[2] = local89;
							Static153.anIntArray263[2] = arg7.method4551() ? local50.anInt6119 : local50.anInt6126;
							Static384.anIntArray568[2] = local50.anInt6127;
							Static191.anIntArray302[2] = local50.anInt6129;
							Static229.anIntArray343[2] = 512;
						}
					}
				}
			}
		}
		if (arg10 < arg12 - 1) {
			if (arg5 > 0) {
				local37 = arg3[arg5 - 1][arg10 + 1] & 0xFF;
				if (local37 > 0) {
					local50 = this.aClass42_4.method1292(local37 - 1);
					if (local50.anInt6125 != -1 && local50.aBoolean427) {
						local68 = arg1[arg5 - 1][arg10 + 1];
						local84 = arg2[arg5 - 1][arg10 + 1] * 2 + 2 & 0x7;
						local89 = Static159.method2575(local50, arg7);
						if (Static162.aBooleanArrayArray3[local68][local84]) {
							Static85.anIntArray149[6] = local50.anInt6125;
							Static301.anIntArray449[6] = local89;
							Static153.anIntArray263[6] = arg7.method4551() ? local50.anInt6119 : local50.anInt6126;
							Static384.anIntArray568[6] = local50.anInt6127;
							Static191.anIntArray302[6] = local50.anInt6129;
							Static229.anIntArray343[6] = 64;
						}
					}
				}
			}
			if (arg11 - 1 > arg5) {
				local37 = arg3[arg5 + 1][arg10 + 1] & 0xFF;
				if (local37 > 0) {
					local50 = this.aClass42_4.method1292(local37 - 1);
					if (local50.anInt6125 != -1 && local50.aBoolean427) {
						local68 = arg1[arg5 + 1][arg10 + 1];
						local84 = arg2[arg5 + 1][arg10 + 1] * 2 & 0x7;
						local89 = Static159.method2575(local50, arg7);
						if (Static162.aBooleanArrayArray3[local68][local84]) {
							Static85.anIntArray149[4] = local50.anInt6125;
							Static301.anIntArray449[4] = local89;
							Static153.anIntArray263[4] = arg7.method4551() ? local50.anInt6119 : local50.anInt6126;
							Static384.anIntArray568[4] = local50.anInt6127;
							Static191.anIntArray302[4] = local50.anInt6129;
							Static229.anIntArray343[4] = 128;
						}
					}
				}
			}
		}
		@Pc(511) int local511;
		@Pc(518) int local518;
		@Pc(520) int local520;
		@Pc(500) byte local500;
		if (arg10 > 0) {
			local37 = arg3[arg5][arg10 - 1] & 0xFF;
			if (local37 > 0) {
				local50 = this.aClass42_4.method1292(local37 - 1);
				if (local50.anInt6125 != -1) {
					local68 = arg1[arg5][arg10 - 1];
					local500 = arg2[arg5][arg10 - 1];
					if (local50.aBoolean427) {
						local89 = 2;
						local511 = local500 * 2 + 4;
						local518 = Static159.method2575(local50, arg7);
						for (local520 = 0; local520 < 3; local520++) {
							local89 &= 0x7;
							local511 &= 0x7;
							if (Static162.aBooleanArrayArray3[local68][local511] && Static191.anIntArray302[local89] <= local50.anInt6129) {
								Static85.anIntArray149[local89] = local50.anInt6125;
								Static301.anIntArray449[local89] = local518;
								Static153.anIntArray263[local89] = arg7.method4551() ? local50.anInt6119 : local50.anInt6126;
								Static384.anIntArray568[local89] = local50.anInt6127;
								if (Static191.anIntArray302[local89] == local50.anInt6129) {
									Static229.anIntArray343[local89] |= 0x20;
								} else {
									Static229.anIntArray343[local89] = 32;
								}
								Static191.anIntArray302[local89] = local50.anInt6129;
							}
							local511++;
							local89--;
						}
						if (!local18[--arg6 & 0x3]) {
							arg8[0] = Static387.aBooleanArrayArray7[local68][local500 + 2 & 0x3];
						}
					} else if (!local18[--arg6 & 0x3]) {
						arg8[0] = Static370.aBooleanArrayArray6[local68][local500 + 2 & 0x3];
					}
				}
			}
		}
		if (arg12 - 1 > arg10) {
			local37 = arg3[arg5][arg10 + 1] & 0xFF;
			if (local37 > 0) {
				local50 = this.aClass42_4.method1292(local37 - 1);
				if (local50.anInt6125 != -1) {
					local68 = arg1[arg5][arg10 + 1];
					local500 = arg2[arg5][arg10 + 1];
					if (local50.aBoolean427) {
						local89 = 4;
						local511 = local500 * 2 + 2;
						local518 = Static159.method2575(local50, arg7);
						for (local520 = 0; local520 < 3; local520++) {
							local89 &= 0x7;
							local511 &= 0x7;
							if (Static162.aBooleanArrayArray3[local68][local511] && local50.anInt6129 >= Static191.anIntArray302[local89]) {
								Static85.anIntArray149[local89] = local50.anInt6125;
								Static301.anIntArray449[local89] = local518;
								Static153.anIntArray263[local89] = arg7.method4551() ? local50.anInt6119 : local50.anInt6126;
								Static384.anIntArray568[local89] = local50.anInt6127;
								if (local50.anInt6129 == Static191.anIntArray302[local89]) {
									Static229.anIntArray343[local89] |= 0x10;
								} else {
									Static229.anIntArray343[local89] = 16;
								}
								Static191.anIntArray302[local89] = local50.anInt6129;
							}
							local89++;
							local511--;
						}
						if (!local18[arg6 + 2 & 0x3]) {
							arg8[2] = Static387.aBooleanArrayArray7[local68][local500 & 0x3];
						}
					} else if (!local18[arg6 + 2 & 0x3]) {
						arg8[2] = Static370.aBooleanArrayArray6[local68][local500 & 0x3];
					}
				}
			}
		}
		if (arg5 > 0) {
			local37 = arg3[arg5 - 1][arg10] & 0xFF;
			if (local37 > 0) {
				local50 = this.aClass42_4.method1292(local37 - 1);
				if (local50.anInt6125 != -1) {
					local68 = arg1[arg5 - 1][arg10];
					local500 = arg2[arg5 - 1][arg10];
					if (local50.aBoolean427) {
						local89 = 6;
						local511 = local500 * 2 + 4;
						local518 = Static159.method2575(local50, arg7);
						for (local520 = 0; local520 < 3; local520++) {
							local511 &= 0x7;
							local89 &= 0x7;
							if (Static162.aBooleanArrayArray3[local68][local511] && local50.anInt6129 >= Static191.anIntArray302[local89]) {
								Static85.anIntArray149[local89] = local50.anInt6125;
								Static301.anIntArray449[local89] = local518;
								Static153.anIntArray263[local89] = arg7.method4551() ? local50.anInt6119 : local50.anInt6126;
								Static384.anIntArray568[local89] = local50.anInt6127;
								if (Static191.anIntArray302[local89] == local50.anInt6129) {
									Static229.anIntArray343[local89] |= 0x8;
								} else {
									Static229.anIntArray343[local89] = 8;
								}
								Static191.anIntArray302[local89] = local50.anInt6129;
							}
							local511--;
							local89++;
						}
						if (!local18[arg6 + 3 & 0x3]) {
							arg8[3] = Static387.aBooleanArrayArray7[local68][local500 + 1 & 0x3];
						}
					} else if (!local18[arg6 + 3 & 0x3]) {
						arg8[3] = Static370.aBooleanArrayArray6[local68][local500 + 1 & 0x3];
					}
				}
			}
		}
		if (arg5 < arg11 - 1) {
			local37 = arg3[arg5 + 1][arg10] & 0xFF;
			if (local37 > 0) {
				local50 = this.aClass42_4.method1292(local37 - 1);
				if (local50.anInt6125 != -1) {
					local68 = arg1[arg5 + 1][arg10];
					local500 = arg2[arg5 + 1][arg10];
					if (local50.aBoolean427) {
						local89 = 4;
						local511 = local500 * 2 + 6;
						local518 = Static159.method2575(local50, arg7);
						for (local520 = 0; local520 < 3; local520++) {
							local89 &= 0x7;
							local511 &= 0x7;
							if (Static162.aBooleanArrayArray3[local68][local511] && Static191.anIntArray302[local89] <= local50.anInt6129) {
								Static85.anIntArray149[local89] = local50.anInt6125;
								Static301.anIntArray449[local89] = local518;
								Static153.anIntArray263[local89] = arg7.method4551() ? local50.anInt6119 : local50.anInt6126;
								Static384.anIntArray568[local89] = local50.anInt6127;
								if (local50.anInt6129 == Static191.anIntArray302[local89]) {
									Static229.anIntArray343[local89] |= 0x4;
								} else {
									Static229.anIntArray343[local89] = 4;
								}
								Static191.anIntArray302[local89] = local50.anInt6129;
							}
							local89--;
							local511++;
						}
						if (!local18[arg6 + 1 & 0x3]) {
							arg8[1] = Static387.aBooleanArrayArray7[local68][local500 + 3 & 0x3];
						}
					} else if (!local18[arg6 + 1 & 0x3]) {
						arg8[1] = Static370.aBooleanArrayArray6[local68][local500 + 3 & 0x3];
					}
				}
			}
		}
		if (arg4 == null) {
			return;
		}
		local37 = Static159.method2575(arg4, arg7);
		if (!arg4.aBoolean427) {
			return;
		}
		for (@Pc(1225) int local1225 = 0; local1225 < 8; local1225++) {
			@Pc(1236) int local1236 = local1225 - arg6 * 2 & 0x7;
			if (Static162.aBooleanArrayArray3[arg0][local1225] && Static191.anIntArray302[local1236] <= arg4.anInt6129) {
				Static85.anIntArray149[local1236] = arg4.anInt6125;
				Static301.anIntArray449[local1236] = local37;
				Static153.anIntArray263[local1236] = arg7.method4551() ? arg4.anInt6119 : arg4.anInt6126;
				Static384.anIntArray568[local1236] = arg4.anInt6127;
				if (arg4.anInt6129 == Static191.anIntArray302[local1236]) {
					Static229.anIntArray343[local1236] |= 0x2;
				} else {
					Static229.anIntArray343[local1236] = 2;
				}
				Static191.anIntArray302[local1236] = arg4.anInt6129;
			}
		}
		return;
	}
}
