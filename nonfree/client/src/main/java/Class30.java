import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bca")
public final class Class30 {

	@OriginalMember(owner = "client!bca", name = "a", descriptor = "Z")
	public boolean aBoolean61;

	@OriginalMember(owner = "client!bca", name = "c", descriptor = "J")
	private long aLong21;

	@OriginalMember(owner = "client!bca", name = "i", descriptor = "[I")
	private int[] anIntArray68;

	@OriginalMember(owner = "client!bca", name = "q", descriptor = "[Lclient!ae;")
	private Class7[] aClass7Array1;

	@OriginalMember(owner = "client!bca", name = "s", descriptor = "J")
	private long aLong22;

	@OriginalMember(owner = "client!bca", name = "t", descriptor = "I")
	private int anInt821;

	@OriginalMember(owner = "client!bca", name = "w", descriptor = "[I")
	public int[] anIntArray69;

	@OriginalMember(owner = "client!bca", name = "l", descriptor = "I")
	public int anInt817 = -1;

	@OriginalMember(owner = "client!bca", name = "a", descriptor = "(Lclient!vk;BII)V")
	public void method904(@OriginalArg(0) Class370 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg2 == -1) {
			this.anIntArray68[arg1] = 0;
		} else if (arg0.method8900(arg2) == null) {
			return;
		} else {
			this.anIntArray68[arg1] = arg2 | 0x40000000;
			this.method907();
		}
	}

	@OriginalMember(owner = "client!bca", name = "a", descriptor = "(Lclient!wh;IIIIIBLclient!uaa;IILclient!vq;Lclient!ha;)Lclient!ka;")
	public Class95 method905(@OriginalArg(0) Class386 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(7) Class343 arg5, @OriginalArg(8) int arg6, @OriginalArg(9) int arg7, @OriginalArg(10) Class372 arg8, @OriginalArg(11) Class13 arg9) {
		@Pc(13) int local13 = 2048;
		@Pc(103) int local103;
		@Pc(44) int local44;
		if (arg8 != null) {
			@Pc(17) boolean local17 = false;
			@Pc(19) boolean local19 = false;
			@Pc(21) boolean local21 = false;
			@Pc(23) boolean local23 = false;
			@Pc(36) int local36 = arg8.anIntArray901[arg6];
			local13 = 2080;
			local44 = local36 >>> 16;
			@Pc(48) int local48 = local36 & 0xFFFF;
			@Pc(53) Class3_Sub11_Sub1 local53 = arg5.method8352(local44);
			if (local53 != null) {
				local19 = local53.method1177(local48) | false;
				local17 = local53.method1178(local48) | false;
				local23 = local53.method1176(local48) | false;
				local21 = arg8.aBoolean775 | false;
			}
			if ((arg8.aBoolean774 || Static100.aBoolean144) && arg4 != -1 && arg4 < arg8.anIntArray901.length) {
				local103 = arg8.anIntArray901[arg4];
				@Pc(107) int local107 = local103 >>> 16;
				@Pc(111) int local111 = local103 & 0xFFFF;
				@Pc(116) Class3_Sub11_Sub1 local116;
				if (local44 == local107) {
					local116 = local53;
				} else {
					local116 = arg5.method8352(local111 >>> 16);
				}
				if (local116 != null) {
					local19 |= local116.method1177(local111);
					local17 |= local116.method1178(local111);
					local23 |= local116.method1176(local111);
				}
			}
			if (local19) {
				local13 = 2208;
			}
			if (local17) {
				local13 |= 0x100;
			}
			if (local21) {
				local13 |= 0x200;
			}
			if (local23) {
				local13 |= 0x400;
			}
		}
		@Pc(184) long local184 = (long) arg7 | (long) (arg3 << 16) | (long) arg2 << 32;
		@Pc(186) Class165 local186 = Static291.aClass165_34;
		@Pc(194) Class95 local194;
		synchronized (Static291.aClass165_34) {
			local194 = (Class95) Static291.aClass165_34.method4389(local184);
		}
		if (local194 == null || arg9.method8495(local194.ua(), local13) != 0) {
			if (local194 != null) {
				local13 = arg9.method8478(local13, local194.ua());
			}
			@Pc(221) Class117[] local221 = new Class117[3];
			local103 = 0;
			if (!arg0.method9142(arg7).method3457() || !arg0.method9142(arg3).method3457() || !arg0.method9142(arg2).method3457()) {
				return null;
			}
			@Pc(253) Class117 local253 = arg0.method9142(arg7).method3456();
			if (local253 != null) {
				local103++;
				local221[0] = local253;
			}
			local253 = arg0.method9142(arg3).method3456();
			if (local253 != null) {
				local221[local103++] = local253;
			}
			local253 = arg0.method9142(arg2).method3456();
			if (local253 != null) {
				local221[local103++] = local253;
			}
			@Pc(292) int local292 = local13 | 0x4000;
			local253 = new Class117(local221, local103);
			local194 = arg9.method8489(local253, local292, Static610.anInt9839, 64, 768);
			for (@Pc(308) int local308 = 0; local308 < 5; local308++) {
				for (local44 = 0; local44 < Static58.aShortArrayArrayArray1.length; local44++) {
					if (this.anIntArray69[local308] < Static58.aShortArrayArrayArray1[local44][local308].length) {
						local194.ia(Static64.aShortArrayArray2[local44][local308], Static58.aShortArrayArrayArray1[local44][local308][this.anIntArray69[local308]]);
					}
				}
			}
			local194.s(local13);
			@Pc(362) Class165 local362 = Static291.aClass165_34;
			synchronized (Static291.aClass165_34) {
				Static291.aClass165_34.method4392(local194, local184);
			}
		}
		if (arg8 == null) {
			return local194;
		} else {
			local194 = local194.method5664((byte) 4, local13, true);
			return arg8.method8978(arg1, local194, arg4, 2048, arg6);
		}
	}

	@OriginalMember(owner = "client!bca", name = "a", descriptor = "(ZIIB[I[I[Lclient!ae;)V")
	public void method906(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int[] arg3, @OriginalArg(5) int[] arg4, @OriginalArg(6) Class7[] arg5) {
		this.anInt817 = arg1;
		this.aBoolean61 = arg0;
		this.anIntArray68 = arg3;
		if (arg2 != this.anInt821) {
			this.anInt821 = arg2;
		}
		this.anIntArray69 = arg4;
		this.aClass7Array1 = arg5;
		this.method907();
	}

	@OriginalMember(owner = "client!bca", name = "a", descriptor = "(B)V")
	private void method907() {
		this.aLong22 = -1L;
		@Pc(10) long[] local10 = Class2.aLongArray28;
		this.aLong22 = this.aLong22 >>> 8 ^ local10[(int) ((this.aLong22 ^ (long) (this.anInt821 >> 8)) & 0xFFL)];
		this.aLong22 = local10[(int) (((long) this.anInt821 ^ this.aLong22) & 0xFFL)] ^ this.aLong22 >>> 8;
		for (@Pc(68) int local68 = 0; local68 < this.anIntArray68.length; local68++) {
			this.aLong22 = local10[(int) (((long) (this.anIntArray68[local68] >> 24) ^ this.aLong22) & 0xFFL)] ^ this.aLong22 >>> 8;
			this.aLong22 = this.aLong22 >>> 8 ^ local10[(int) ((this.aLong22 ^ (long) (this.anIntArray68[local68] >> 16)) & 0xFFL)];
			this.aLong22 = local10[(int) ((this.aLong22 ^ (long) (this.anIntArray68[local68] >> 8)) & 0xFFL)] ^ this.aLong22 >>> 8;
			this.aLong22 = local10[(int) (((long) this.anIntArray68[local68] ^ this.aLong22) & 0xFFL)] ^ this.aLong22 >>> 8;
		}
		@Pc(171) int local171;
		if (this.aClass7Array1 != null) {
			for (local171 = 0; local171 < this.aClass7Array1.length; local171++) {
				if (this.aClass7Array1[local171] != null) {
					@Pc(193) int[] local193;
					@Pc(187) int[] local187;
					if (this.aBoolean61) {
						local187 = this.aClass7Array1[local171].anIntArray15;
						local193 = this.aClass7Array1[local171].anIntArray16;
					} else {
						local187 = this.aClass7Array1[local171].anIntArray13;
						local193 = this.aClass7Array1[local171].anIntArray14;
					}
					@Pc(211) int local211;
					if (local193 != null) {
						for (local211 = 0; local211 < local193.length; local211++) {
							this.aLong22 = this.aLong22 >>> 8 ^ local10[(int) (((long) (local193[local211] >> 8) ^ this.aLong22) & 0xFFL)];
							this.aLong22 = local10[(int) ((this.aLong22 ^ (long) local193[local211]) & 0xFFL)] ^ this.aLong22 >>> 8;
						}
					}
					if (local187 != null) {
						for (local211 = 0; local211 < local187.length; local211++) {
							this.aLong22 = local10[(int) ((this.aLong22 ^ (long) (local187[local211] >> 8)) & 0xFFL)] ^ this.aLong22 >>> 8;
							this.aLong22 = local10[(int) ((this.aLong22 ^ (long) local187[local211]) & 0xFFL)] ^ this.aLong22 >>> 8;
						}
					}
					if (this.aClass7Array1[local171].aShortArray1 != null) {
						for (local211 = 0; local211 < this.aClass7Array1[local171].aShortArray1.length; local211++) {
							this.aLong22 = local10[(int) (((long) (this.aClass7Array1[local171].aShortArray1[local211] >> 8) ^ this.aLong22) & 0xFFL)] ^ this.aLong22 >>> 8;
							this.aLong22 = this.aLong22 >>> 8 ^ local10[(int) ((this.aLong22 ^ (long) this.aClass7Array1[local171].aShortArray1[local211]) & 0xFFL)];
						}
					}
					if (this.aClass7Array1[local171].aShortArray2 != null) {
						for (local211 = 0; local211 < this.aClass7Array1[local171].aShortArray2.length; local211++) {
							this.aLong22 = this.aLong22 >>> 8 ^ local10[(int) (((long) (this.aClass7Array1[local171].aShortArray2[local211] >> 8) ^ this.aLong22) & 0xFFL)];
							this.aLong22 = this.aLong22 >>> 8 ^ local10[(int) ((this.aLong22 ^ (long) this.aClass7Array1[local171].aShortArray2[local211]) & 0xFFL)];
						}
					}
				}
			}
		}
		for (local171 = 0; local171 < 5; local171++) {
			this.aLong22 = local10[(int) (((long) this.anIntArray69[local171] ^ this.aLong22) & 0xFFL)] ^ this.aLong22 >>> 8;
		}
		this.aLong22 = local10[(int) ((this.aLong22 ^ (long) (this.aBoolean61 ? 1 : 0)) & 0xFFL)] ^ this.aLong22 >>> 8;
	}

	@OriginalMember(owner = "client!bca", name = "a", descriptor = "(Lclient!vq;Lclient!bha;ILclient!wh;Lclient!ha;ILclient!ii;ZIILclient!uaa;Lclient!vk;)Lclient!ka;")
	public Class95 method908(@OriginalArg(0) Class372 arg0, @OriginalArg(1) Class36 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class386 arg3, @OriginalArg(4) Class13 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Interface16 arg6, @OriginalArg(9) int arg7, @OriginalArg(10) Class343 arg8, @OriginalArg(11) Class370 arg9) {
		if (this.anInt817 != -1) {
			return arg1.method1057(this.anInt817).method7260(arg2, arg5, arg6, arg4, (Class11) null, arg8, arg7, arg0);
		}
		@Pc(29) int local29 = 2048;
		@Pc(37) boolean local37;
		@Pc(50) int local50;
		@Pc(119) int local119;
		@Pc(60) int local60;
		@Pc(123) int local123;
		if (arg0 != null) {
			@Pc(33) boolean local33 = false;
			@Pc(35) boolean local35 = false;
			local37 = false;
			@Pc(39) boolean local39 = false;
			local50 = arg0.anIntArray901[arg7];
			local29 = 2080;
			local60 = local50 >>> 16;
			@Pc(64) int local64 = local50 & 0xFFFF;
			@Pc(69) Class3_Sub11_Sub1 local69 = arg8.method8352(local60);
			if (local69 != null) {
				local35 = local69.method1177(local64) | false;
				local33 = local69.method1178(local64) | false;
				local39 = local69.method1176(local64) | false;
				local37 = arg0.aBoolean775 | false;
			}
			if ((arg0.aBoolean774 || Static100.aBoolean144) && arg5 != -1 && arg0.anIntArray901.length > arg5) {
				local119 = arg0.anIntArray901[arg5];
				local123 = local119 >>> 16;
				@Pc(127) int local127 = local119 & 0xFFFF;
				@Pc(137) Class3_Sub11_Sub1 local137 = local60 == local123 ? local69 : arg8.method8352(local123);
				if (local137 != null) {
					local35 |= local137.method1177(local127);
					local33 |= local137.method1178(local127);
					local39 |= local137.method1176(local127);
				}
			}
			if (local35) {
				local29 = 2208;
			}
			if (local33) {
				local29 |= 0x100;
			}
			if (local37) {
				local29 |= 0x200;
			}
			if (local39) {
				local29 |= 0x400;
			}
		}
		@Pc(186) Class165 local186 = Static291.aClass165_34;
		@Pc(195) Class95 local195;
		synchronized (Static291.aClass165_34) {
			local195 = (Class95) Static291.aClass165_34.method4389(this.aLong22);
		}
		if (local195 == null || arg4.method8495(local195.ua(), local29) != 0) {
			if (local195 != null) {
				local29 = arg4.method8478(local29, local195.ua());
			}
			local37 = false;
			for (@Pc(223) int local223 = 0; local223 < this.anIntArray68.length; local223++) {
				local50 = this.anIntArray68[local223];
				@Pc(232) Class7 local232 = null;
				if ((local50 & 0x40000000) != 0) {
					if (this.aClass7Array1 != null && this.aClass7Array1[local223] != null) {
						local232 = this.aClass7Array1[local223];
					}
					if (!arg9.method8900(local50 & 0x3FFFFFFF).method9008(this.aBoolean61, local232)) {
						local37 = true;
					}
				} else if ((Integer.MIN_VALUE & local50) != 0 && !arg3.method9142(local50 & 0x3FFFFFFF).method3457()) {
					local37 = true;
				}
			}
			if (local37) {
				return null;
			}
			@Pc(304) Class117[] local304 = new Class117[this.anIntArray68.length];
			local119 = 0;
			for (@Pc(308) int local308 = 0; local308 < this.anIntArray68.length; local308++) {
				@Pc(315) int local315 = this.anIntArray68[local308];
				@Pc(317) Class7 local317 = null;
				@Pc(353) Class117 local353;
				if ((local315 & 0x40000000) != 0) {
					if (this.aClass7Array1 != null && this.aClass7Array1[local308] != null) {
						local317 = this.aClass7Array1[local308];
					}
					local353 = arg9.method8900(local315 & 0x3FFFFFFF).method9002(this.aBoolean61, local317);
					if (local353 != null) {
						local304[local119++] = local353;
					}
				} else if ((Integer.MIN_VALUE & local315) != 0) {
					local353 = arg3.method9142(local315 & 0x3FFFFFFF).method3456();
					if (local353 != null) {
						local304[local119++] = local353;
					}
				}
			}
			@Pc(394) int local394 = local29 | 0x4000;
			@Pc(400) Class117 local400 = new Class117(local304, local119);
			local195 = arg4.method8489(local400, local394, Static610.anInt9839, 64, 768);
			for (local60 = 0; local60 < 5; local60++) {
				for (local123 = 0; local123 < Static58.aShortArrayArrayArray1.length; local123++) {
					if (Static58.aShortArrayArrayArray1[local123][local60].length > this.anIntArray69[local60]) {
						local195.ia(Static64.aShortArrayArray2[local123][local60], Static58.aShortArrayArrayArray1[local123][local60][this.anIntArray69[local60]]);
					}
				}
			}
			local195.s(local29);
			@Pc(458) Class165 local458 = Static291.aClass165_34;
			synchronized (Static291.aClass165_34) {
				Static291.aClass165_34.method4392(local195, this.aLong22);
			}
		}
		if (arg0 == null) {
			return local195;
		} else {
			local195.method5664((byte) 4, local29, true);
			return arg0.method8978(arg2, local195, arg5, 2048, arg7);
		}
	}

	@OriginalMember(owner = "client!bca", name = "a", descriptor = "(ILclient!wh;ZI)V")
	public void method909(@OriginalArg(0) int arg0, @OriginalArg(1) Class386 arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = Static458.anIntArray645[arg2];
		if (arg1.method9142(arg0) != null) {
			this.anIntArray68[local7] = arg0 | Integer.MIN_VALUE;
			this.method907();
		}
	}

	@OriginalMember(owner = "client!bca", name = "a", descriptor = "(IBI)V")
	public void method910(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray69[arg0] = arg1;
		this.method907();
	}

	@OriginalMember(owner = "client!bca", name = "a", descriptor = "(ZB)V")
	public void method912(@OriginalArg(0) boolean arg0) {
		this.aBoolean61 = arg0;
		this.method907();
	}

	@OriginalMember(owner = "client!bca", name = "a", descriptor = "(Lclient!uaa;Lclient!cd;Lclient!ii;ILclient!wh;Lclient!bha;Lclient!vk;IIIB[Lclient!fo;ILclient!vq;ILclient!vq;Lclient!ha;IZI[I)Lclient!ka;")
	public Class95 method913(@OriginalArg(0) Class343 arg0, @OriginalArg(1) Class52 arg1, @OriginalArg(2) Interface16 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class386 arg4, @OriginalArg(5) Class36 arg5, @OriginalArg(6) Class370 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(11) Class107[] arg10, @OriginalArg(12) int arg11, @OriginalArg(13) Class372 arg12, @OriginalArg(14) int arg13, @OriginalArg(15) Class372 arg14, @OriginalArg(16) Class13 arg15, @OriginalArg(17) int arg16, @OriginalArg(19) int arg17, @OriginalArg(20) int[] arg18) {
		if (this.anInt817 != -1) {
			return arg5.method1057(this.anInt817).method7266(arg12, arg2, arg3, arg15, arg10, arg0, arg9, arg18, arg1, arg7, arg16, (Class11) null, arg13, arg14, arg11, arg8, arg17);
		}
		@Pc(36) int local36 = arg11;
		@Pc(39) long local39 = this.aLong22;
		@Pc(42) int[] local42 = this.anIntArray68;
		@Pc(44) boolean local44 = false;
		@Pc(46) boolean local46 = false;
		if (arg12 != null && (arg12.anInt10255 >= 0 || arg12.anInt10248 >= 0)) {
			local42 = new int[this.anIntArray68.length];
			for (@Pc(64) int local64 = 0; local64 < local42.length; local64++) {
				local42[local64] = this.anIntArray68[local64];
			}
			if (arg12.anInt10255 >= 0) {
				if (arg12.anInt10255 == 65535) {
					local44 = true;
					local39 ^= 0xFFFFFFFF00000000L;
					local42[5] = 0;
				} else {
					local42[5] = arg12.anInt10255 | 0x40000000;
					local39 ^= (long) local42[5] << 32;
				}
			}
			if (arg12.anInt10248 >= 0) {
				if (arg12.anInt10248 == 65535) {
					local42[3] = 0;
					local39 ^= 0xFFFFFFFFL;
				} else {
					local42[3] = arg12.anInt10248 | 0x40000000;
					local39 ^= (long) local42[3];
				}
				local46 = true;
			}
		}
		@Pc(150) boolean local150 = false;
		@Pc(152) boolean local152 = false;
		@Pc(154) boolean local154 = false;
		@Pc(162) boolean local162 = arg12 != null || arg14 != null;
		@Pc(169) int local169 = arg10 == null ? 0 : arg10.length;
		@Pc(203) int local203;
		@Pc(208) int local208;
		for (@Pc(171) int local171 = 0; local171 < local169; local171++) {
			Static280.aClass3_Sub11_Sub1Array3[local171] = null;
			if (arg10[local171] != null) {
				@Pc(189) Class372 local189 = arg0.method8356(arg10[local171].anInt3426);
				if (local189.anIntArray901 != null) {
					Static363.aClass372Array1[local171] = local189;
					local162 = true;
					local203 = arg10[local171].anInt3418;
					local208 = arg10[local171].anInt3421;
					@Pc(213) int local213 = local189.anIntArray901[local203];
					Static280.aClass3_Sub11_Sub1Array3[local171] = arg0.method8352(local213 >>> 16);
					@Pc(226) int local226 = local213 & 0xFFFF;
					Static262.anIntArray424[local171] = local226;
					if (Static280.aClass3_Sub11_Sub1Array3[local171] != null) {
						local152 |= Static280.aClass3_Sub11_Sub1Array3[local171].method1177(local226);
						local150 |= Static280.aClass3_Sub11_Sub1Array3[local171].method1178(local226);
						local154 |= Static280.aClass3_Sub11_Sub1Array3[local171].method1176(local226);
					}
					if ((local189.aBoolean774 || Static100.aBoolean144) && local208 != -1 && local208 < local189.anIntArray901.length) {
						Static562.anIntArray781[local171] = local189.anIntArray900[local203];
						Static42.anIntArray81[local171] = arg10[local171].anInt3424;
						@Pc(297) int local297 = local189.anIntArray901[local208];
						Static153.aClass3_Sub11_Sub1Array1[local171] = arg0.method8352(local297 >>> 16);
						@Pc(310) int local310 = local297 & 0xFFFF;
						Static215.anIntArray359[local171] = local310;
						if (Static153.aClass3_Sub11_Sub1Array1[local171] != null) {
							local152 |= Static153.aClass3_Sub11_Sub1Array1[local171].method1177(local310);
							local150 |= Static153.aClass3_Sub11_Sub1Array1[local171].method1178(local310);
							local154 |= Static153.aClass3_Sub11_Sub1Array1[local171].method1176(local310);
						}
					} else {
						Static562.anIntArray781[local171] = 0;
						Static42.anIntArray81[local171] = 0;
						Static153.aClass3_Sub11_Sub1Array1[local171] = null;
						Static215.anIntArray359[local171] = -1;
					}
				}
			}
		}
		@Pc(373) int local373 = -1;
		local203 = -1;
		local208 = 0;
		@Pc(379) Class3_Sub11_Sub1 local379 = null;
		@Pc(381) Class3_Sub11_Sub1 local381 = null;
		@Pc(388) int local388 = -1;
		@Pc(390) int local390 = -1;
		@Pc(392) int local392 = 0;
		@Pc(394) Class3_Sub11_Sub1 local394 = null;
		@Pc(396) Class3_Sub11_Sub1 local396 = null;
		if (local162) {
			@Pc(409) int local409;
			@Pc(472) int local472;
			if (arg12 != null) {
				local373 = arg12.anIntArray901[arg3];
				local409 = local373 >>> 16;
				local373 &= 0xFFFF;
				local379 = arg0.method8352(local409);
				if (local379 != null) {
					local152 |= local379.method1177(local373);
					local150 |= local379.method1178(local373);
					local154 |= local379.method1176(local373);
				}
				if ((arg12.aBoolean774 || Static100.aBoolean144) && arg7 != -1 && arg7 < arg12.anIntArray901.length) {
					local203 = arg12.anIntArray901[arg7];
					local208 = arg12.anIntArray900[arg3];
					local472 = local203 >>> 16;
					local381 = local472 == local409 ? local379 : arg0.method8352(local472);
					local203 &= 0xFFFF;
					if (local381 != null) {
						local152 |= local381.method1177(local203);
						local150 |= local381.method1178(local203);
						local154 |= local381.method1176(local203);
					}
				}
			}
			local36 = arg11 | 0x20;
			if (arg14 != null) {
				local388 = arg14.anIntArray901[arg9];
				local409 = local388 >>> 16;
				local394 = arg0.method8352(local409);
				local388 &= 0xFFFF;
				if (local394 != null) {
					local152 |= local394.method1177(local388);
					local150 |= local394.method1178(local388);
					local154 |= local394.method1176(local388);
				}
				if ((arg14.aBoolean774 || Static100.aBoolean144) && arg8 != -1 && arg8 < arg14.anIntArray901.length) {
					local392 = arg14.anIntArray900[arg9];
					local390 = arg14.anIntArray901[arg8];
					local472 = local390 >>> 16;
					local396 = local409 == local472 ? local394 : arg0.method8352(local472);
					local390 &= 0xFFFF;
					if (local396 != null) {
						local152 |= local396.method1177(local390);
						local150 |= local396.method1178(local390);
						local154 |= local396.method1176(local390);
					}
				}
			}
			if (local152) {
				local36 |= 0x80;
			}
			if (local150) {
				local36 |= 0x100;
			}
			if (local154) {
				local36 |= 0x400;
			}
		}
		@Pc(652) Class165 local652 = Static643.aClass165_77;
		@Pc(660) Class95 local660;
		synchronized (Static643.aClass165_77) {
			local660 = (Class95) Static643.aClass165_77.method4389(local39);
		}
		@Pc(668) Class359 local668 = null;
		if (this.anInt821 != -1) {
			local668 = arg1.method1313(this.anInt821);
		}
		@Pc(701) boolean local701;
		@Pc(703) int local703;
		@Pc(709) int local709;
		@Pc(791) int local791;
		@Pc(797) int local797;
		@Pc(898) int local898;
		if (local660 == null || arg15.method8495(local660.ua(), local36) != 0) {
			if (local660 != null) {
				local36 = arg15.method8478(local36, local660.ua());
			}
			local701 = false;
			local703 = 0;
			while (true) {
				if (local703 >= local42.length) {
					if (local701) {
						if (this.aLong21 != -1L) {
							@Pc(1108) Class165 local1108 = Static643.aClass165_77;
							synchronized (Static643.aClass165_77) {
								local660 = (Class95) Static643.aClass165_77.method4389(this.aLong21);
							}
						}
						if (local660 == null || arg15.method8495(local660.ua(), local36) != 0) {
							return null;
						}
					} else {
						@Pc(789) Class117[] local789 = new Class117[local42.length];
						for (local791 = 0; local791 < local42.length; local791++) {
							local797 = local42[local791];
							@Pc(799) Class7 local799 = null;
							@Pc(817) boolean local817 = local791 == 5 && local44 || local791 == 3 && local46;
							@Pc(837) Class117 local837;
							if ((local797 & 0x40000000) != 0) {
								if (!local817 && this.aClass7Array1 != null && this.aClass7Array1[local791] != null) {
									local799 = this.aClass7Array1[local791];
								}
								local837 = arg6.method8900(local797 & 0x3FFFFFFF).method8992(local799, this.aBoolean61);
								if (local837 != null) {
									local789[local791] = local837;
								}
							} else if ((Integer.MIN_VALUE & local797) != 0) {
								local837 = arg4.method9142(local797 & 0x3FFFFFFF).method3458();
								if (local837 != null) {
									local789[local791] = local837;
								}
							}
						}
						@Pc(900) int local900;
						if (local668 != null && local668.anIntArrayArray62 != null) {
							for (local797 = 0; local797 < local668.anIntArrayArray62.length; local797++) {
								if (local789[local797] != null) {
									local898 = 0;
									local900 = 0;
									@Pc(902) int local902 = 0;
									@Pc(904) int local904 = 0;
									@Pc(906) int local906 = 0;
									@Pc(908) int local908 = 0;
									if (local668.anIntArrayArray62[local797] != null) {
										local898 = local668.anIntArrayArray62[local797][0];
										local904 = local668.anIntArrayArray62[local797][3] << 3;
										local902 = local668.anIntArrayArray62[local797][2];
										local900 = local668.anIntArrayArray62[local797][1];
										local908 = local668.anIntArrayArray62[local797][5] << 3;
										local906 = local668.anIntArrayArray62[local797][4] << 3;
									}
									if (local904 != 0 || local906 != 0 || local908 != 0) {
										local789[local797].method3483(local906, local904, local908);
									}
									if (local898 != 0 || local900 != 0 || local902 != 0) {
										local789[local797].method3497(local902, local898, local900);
									}
								}
							}
						}
						@Pc(1011) Class117 local1011 = new Class117(local789, local789.length);
						@Pc(1015) int local1015 = local36 | 0x4000;
						local660 = arg15.method8489(local1011, local1015, Static610.anInt9839, 64, 850);
						for (local898 = 0; local898 < 5; local898++) {
							for (local900 = 0; local900 < Static58.aShortArrayArrayArray1.length; local900++) {
								if (Static58.aShortArrayArrayArray1[local900][local898].length > this.anIntArray69[local898]) {
									local660.ia(Static64.aShortArrayArray2[local900][local898], Static58.aShortArrayArrayArray1[local900][local898][this.anIntArray69[local898]]);
								}
							}
						}
						local660.s(local36);
						@Pc(1081) Class165 local1081 = Static643.aClass165_77;
						synchronized (Static643.aClass165_77) {
							Static643.aClass165_77.method4392(local660, local39);
						}
						this.aLong21 = local39;
					}
					break;
				}
				local709 = local42[local703];
				@Pc(711) Class7 local711 = null;
				@Pc(725) boolean local725 = local703 == 5 && local44 || local703 == 3 && local46;
				if ((local709 & 0x40000000) != 0) {
					if (!local725 && this.aClass7Array1 != null && this.aClass7Array1[local703] != null) {
						local711 = this.aClass7Array1[local703];
					}
					if (!arg6.method8900(local709 & 0x3FFFFFFF).method9006(this.aBoolean61, local711)) {
						local701 = true;
					}
				} else if ((local709 & Integer.MIN_VALUE) != 0 && !arg4.method9142(local709 & 0x3FFFFFFF).method3452()) {
					local701 = true;
				}
				local703++;
			}
		}
		@Pc(1142) Class95 local1142 = local660.method5664((byte) 4, local36, true);
		local701 = false;
		if (arg18 != null) {
			for (local703 = 0; local703 < arg18.length; local703++) {
				if (arg18[local703] != -1) {
					local701 = true;
				}
			}
		}
		if (!local162 && !local701) {
			return local1142;
		}
		@Pc(1171) Class239[] local1171 = null;
		if (local668 != null) {
			local1171 = local668.method8764(arg15);
		}
		if (local701 && local1171 != null) {
			for (local709 = 0; local709 < arg18.length; local709++) {
				if (local1171[local709] != null) {
					local1142.method5656(local1171[local709], 0x1 << local709, true);
				}
			}
		}
		local709 = 0;
		local791 = 1;
		while (local169 > local709) {
			if (Static280.aClass3_Sub11_Sub1Array3[local709] != null) {
				local1142.method5657(false, Static42.anIntArray81[local709] - 1, local791, (int[]) null, Static562.anIntArray781[local709], Static153.aClass3_Sub11_Sub1Array1[local709], Static262.anIntArray424[local709], Static215.anIntArray359[local709], Static280.aClass3_Sub11_Sub1Array3[local709]);
			}
			local709++;
			local791 <<= 0x1;
		}
		if (local701) {
			for (local797 = 0; local797 < arg18.length; local797++) {
				if (arg18[local797] != -1) {
					local898 = arg18[local797] - arg13;
					local898 &= 0x3FFF;
					@Pc(1281) Class239 local1281 = arg15.method8461();
					local1281.method9233(local898);
					local1142.method5656(local1281, 0x1 << local797, false);
				}
			}
		}
		if (local701 && local1171 != null) {
			for (local797 = 0; local797 < arg18.length; local797++) {
				if (local1171[local797] != null) {
					local1142.method5656(local1171[local797], 0x1 << local797, false);
				}
			}
		}
		if (local379 != null && local394 != null) {
			local1142.method5671(local379, local396, arg12.aBooleanArray54, local373, local208, local394, local388, local390, local381, local203, false, arg17 - 1, arg16 + -1, local392);
		} else if (local379 != null) {
			local1142.method5670(0, local373, arg17 - 1, false, local379, local203, local208, local381);
		} else if (local394 != null) {
			local1142.method5670(0, local388, arg16 - 1, false, local394, local390, local392, local396);
		}
		for (local797 = 0; local797 < local169; local797++) {
			Static280.aClass3_Sub11_Sub1Array3[local797] = null;
			Static153.aClass3_Sub11_Sub1Array1[local797] = null;
			Static363.aClass372Array1[local797] = null;
		}
		return local1142;
	}
}
