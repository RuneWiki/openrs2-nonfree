import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ph")
public final class Class246 {

	@OriginalMember(owner = "client!ph", name = "c", descriptor = "Z")
	public boolean aBoolean487;

	@OriginalMember(owner = "client!ph", name = "e", descriptor = "I")
	private int anInt6909;

	@OriginalMember(owner = "client!ph", name = "f", descriptor = "[[I")
	private int[][] anIntArrayArray70;

	@OriginalMember(owner = "client!ph", name = "j", descriptor = "J")
	private long aLong179;

	@OriginalMember(owner = "client!ph", name = "l", descriptor = "J")
	private long aLong180;

	@OriginalMember(owner = "client!ph", name = "o", descriptor = "[I")
	public int[] anIntArray563;

	@OriginalMember(owner = "client!ph", name = "t", descriptor = "[I")
	private int[] anIntArray564;

	@OriginalMember(owner = "client!ph", name = "k", descriptor = "I")
	public int anInt6913 = -1;

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(IIILclient!wl;)V")
	public void method5773(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class344 arg2) {
		@Pc(15) int local15 = Static111.anIntArray273[arg1];
		if (this.anIntArray564[local15] != 0 && arg2.method7788(arg0) != null) {
			this.anIntArray564[local15] = arg0 | Integer.MIN_VALUE;
			this.method5775();
		}
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(B)V")
	private void method5775() {
		this.aLong179 = -1L;
		@Pc(10) long[] local10 = Class319.aLongArray15;
		this.aLong179 = this.aLong179 >>> 8 ^ local10[(int) ((this.aLong179 ^ (long) (this.anInt6909 >> 8)) & 0xFFL)];
		this.aLong179 = local10[(int) ((this.aLong179 ^ (long) this.anInt6909) & 0xFFL)] ^ this.aLong179 >>> 8;
		for (@Pc(50) int local50 = 0; local50 < 12; local50++) {
			this.aLong179 = this.aLong179 >>> 8 ^ local10[(int) (((long) (this.anIntArray564[local50] >> 24) ^ this.aLong179) & 0xFFL)];
			this.aLong179 = this.aLong179 >>> 8 ^ local10[(int) ((this.aLong179 ^ (long) (this.anIntArray564[local50] >> 16)) & 0xFFL)];
			this.aLong179 = this.aLong179 >>> 8 ^ local10[(int) ((this.aLong179 ^ (long) (this.anIntArray564[local50] >> 8)) & 0xFFL)];
			this.aLong179 = local10[(int) ((this.aLong179 ^ (long) this.anIntArray564[local50]) & 0xFFL)] ^ this.aLong179 >>> 8;
		}
		for (@Pc(146) int local146 = 0; local146 < 5; local146++) {
			this.aLong179 = this.aLong179 >>> 8 ^ local10[(int) (((long) this.anIntArray563[local146] ^ this.aLong179) & 0xFFL)];
		}
		this.aLong179 = this.aLong179 >>> 8 ^ local10[(int) ((this.aLong179 ^ (long) (this.aBoolean487 ? 1 : 0)) & 0xFFL)];
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(BII)V")
	public void method5776(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray563[arg0] = arg1;
		this.method5775();
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(IIIILclient!fq;Lclient!oa;Lclient!wm;ILclient!mo;Lclient!dd;Lclient!wl;Lclient!qb;)Lclient!ba;")
	public Class22 method5777(@OriginalArg(0) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) Class108 arg2, @OriginalArg(5) Class121 arg3, @OriginalArg(6) Class345 arg4, @OriginalArg(7) int arg5, @OriginalArg(8) Class202 arg6, @OriginalArg(9) Interface5 arg7, @OriginalArg(10) Class344 arg8, @OriginalArg(11) Class256 arg9) {
		if (this.anInt6913 != -1) {
			return arg6.method4897(this.anInt6913).method5946(arg7, arg1, arg4, arg2, arg3, arg0, arg5);
		}
		@Pc(29) int local29 = 2048;
		@Pc(37) boolean local37;
		@Pc(50) int local50;
		@Pc(119) int local119;
		@Pc(60) int local60;
		if (arg2 != null) {
			@Pc(33) boolean local33 = false;
			@Pc(35) boolean local35 = false;
			local37 = false;
			@Pc(39) boolean local39 = false;
			local50 = arg2.anIntArray312[arg5];
			local29 = 2080;
			local60 = local50 >>> 16;
			@Pc(65) Class6_Sub1_Sub7 local65 = arg4.method7796(local60);
			@Pc(69) int local69 = local50 & 0xFFFF;
			if (local65 != null) {
				local35 = local65.method2235(local69) | false;
				local33 = local65.method2234(local69) | false;
				local39 = local65.method2239(local69) | false;
				local37 = arg2.aBoolean178 | false;
			}
			if ((arg2.aBoolean177 || Static318.aBoolean368) && arg1 != -1 && arg1 < arg2.anIntArray312.length) {
				local119 = arg2.anIntArray312[arg1];
				@Pc(123) int local123 = local119 >>> 16;
				@Pc(133) Class6_Sub1_Sub7 local133 = local123 == local60 ? local65 : arg4.method7796(local123);
				@Pc(137) int local137 = local119 & 0xFFFF;
				if (local133 != null) {
					local35 |= local133.method2235(local137);
					local33 |= local133.method2234(local137);
					local39 |= local133.method2239(local137);
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
		@Pc(186) Class332 local186 = Static234.aClass332_102;
		@Pc(195) Class22 local195;
		synchronized (Static234.aClass332_102) {
			local195 = (Class22) Static234.aClass332_102.method7502(this.aLong179);
		}
		if (local195 == null || arg3.method7150(local195.h(), local29) != 0) {
			if (local195 != null) {
				local29 = arg3.method7099(local29, local195.h());
			}
			local37 = false;
			for (@Pc(233) int local233 = 0; local233 < 12; local233++) {
				local50 = this.anIntArray564[local233];
				if ((local50 & 0x40000000) == 0) {
					if ((local50 & Integer.MIN_VALUE) != 0 && !arg8.method7788(local50 & 0x3FFFFFFF).method4990()) {
						local37 = true;
					}
				} else if (!arg9.method5924(local50 & 0x3FFFFFFF).method2205(this.aBoolean487)) {
					local37 = true;
				}
			}
			if (local37) {
				return null;
			}
			@Pc(292) Class274[] local292 = new Class274[12];
			local119 = 0;
			for (@Pc(296) int local296 = 0; local296 < 12; local296++) {
				@Pc(303) int local303 = this.anIntArray564[local296];
				@Pc(326) Class274 local326;
				if ((local303 & 0x40000000) != 0) {
					local326 = arg9.method5924(local303 & 0x3FFFFFFF).method2212(this.aBoolean487);
					if (local326 != null) {
						local292[local119++] = local326;
					}
				} else if ((local303 & Integer.MIN_VALUE) != 0) {
					local326 = arg8.method7788(local303 & 0x3FFFFFFF).method4986();
					if (local326 != null) {
						local292[local119++] = local326;
					}
				}
			}
			@Pc(365) Class274 local365 = new Class274(local292, local119);
			@Pc(369) int local369 = local29 | 0x4000;
			local195 = arg3.method7088(local365, local369, Static44.anInt719, 64, 768);
			for (local60 = 0; local60 < 5; local60++) {
				if (this.anIntArray563[local60] < Static33.aShortArrayArray2[local60].length) {
					local195.UA(Static62.aShortArray14[local60], Static33.aShortArrayArray2[local60][this.anIntArray563[local60]]);
				}
				if (this.anIntArray563[local60] < Static192.aShortArrayArray6[local60].length) {
					local195.UA(Static188.aShortArray61[local60], Static192.aShortArrayArray6[local60][this.anIntArray563[local60]]);
				}
			}
			local195.ia(local29);
			@Pc(438) Class332 local438 = Static234.aClass332_102;
			synchronized (Static234.aClass332_102) {
				Static234.aClass332_102.method7498(this.aLong179, local195);
			}
		}
		if (arg2 == null) {
			return local195;
		} else {
			local195.method4699((byte) 4, local29, true);
			return arg2.method2188(local195, arg1, arg0, 2048, arg5);
		}
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(III[IZ[I)V")
	public void method5778(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int[] arg4) {
		if (arg0 != this.anInt6909) {
			this.anInt6909 = arg0;
			this.anIntArrayArray70 = null;
		}
		this.anInt6913 = arg1;
		this.aBoolean487 = arg3;
		this.anIntArray563 = arg4;
		this.anIntArray564 = arg2;
		this.method5775();
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(Lclient!fq;ILclient!wl;IIIIIILclient!wm;Lclient!oa;I)Lclient!ba;")
	public Class22 method5779(@OriginalArg(0) Class108 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class344 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(9) Class345 arg7, @OriginalArg(10) Class121 arg8, @OriginalArg(11) int arg9) {
		@Pc(32) int local32 = 2048;
		@Pc(120) int local120;
		if (arg0 != null) {
			@Pc(36) boolean local36 = false;
			@Pc(38) boolean local38 = false;
			@Pc(40) boolean local40 = false;
			@Pc(42) boolean local42 = false;
			local32 = 2080;
			@Pc(57) int local57 = arg0.anIntArray312[arg9];
			@Pc(63) int local63 = local57 >>> 16;
			@Pc(67) int local67 = local57 & 0xFFFF;
			@Pc(74) Class6_Sub1_Sub7 local74 = arg7.method7796(local63);
			if (local74 != null) {
				local38 = local74.method2235(local67) | false;
				local36 = local74.method2234(local67) | false;
				local42 = local74.method2239(local67) | false;
				local40 = arg0.aBoolean178 | false;
			}
			if ((arg0.aBoolean177 || Static318.aBoolean368) && arg3 != -1 && arg0.anIntArray312.length > arg3) {
				local120 = arg0.anIntArray312[arg3];
				@Pc(124) int local124 = local120 >>> 16;
				@Pc(128) int local128 = local120 & 0xFFFF;
				@Pc(142) Class6_Sub1_Sub7 local142;
				if (local63 == local124) {
					local142 = local74;
				} else {
					local142 = arg7.method7796(local128 >>> 16);
				}
				if (local142 != null) {
					local38 |= local142.method2235(local128);
					local36 |= local142.method2234(local128);
					local42 |= local142.method2239(local128);
				}
			}
			if (local38) {
				local32 = 2208;
			}
			if (local36) {
				local32 |= 0x100;
			}
			if (local40) {
				local32 |= 0x200;
			}
			if (local42) {
				local32 |= 0x400;
			}
		}
		@Pc(207) long local207 = (long) (arg6 << 16) | (long) arg4 << 32 | (long) arg5;
		@Pc(209) Class332 local209 = Static234.aClass332_102;
		@Pc(219) Class22 local219;
		synchronized (Static234.aClass332_102) {
			local219 = (Class22) Static234.aClass332_102.method7502(local207);
		}
		if (local219 == null || arg8.method7150(local219.h(), local32) != 0) {
			if (local219 != null) {
				local32 = arg8.method7099(local32, local219.h());
			}
			@Pc(249) Class274[] local249 = new Class274[3];
			local120 = 0;
			if (!arg2.method7788(arg5).method4990() || !arg2.method7788(arg6).method4990() || !arg2.method7788(arg4).method4990()) {
				return null;
			}
			@Pc(285) Class274 local285 = arg2.method7788(arg5).method4986();
			if (local285 != null) {
				local120++;
				local249[0] = local285;
			}
			local285 = arg2.method7788(arg6).method4986();
			if (local285 != null) {
				local249[local120++] = local285;
			}
			local285 = arg2.method7788(arg4).method4986();
			if (local285 != null) {
				local249[local120++] = local285;
			}
			@Pc(326) int local326 = local32 | 0x4000;
			local285 = new Class274(local249, local120);
			local219 = arg8.method7088(local285, local326, Static44.anInt719, 64, 768);
			for (@Pc(342) int local342 = 0; local342 < 5; local342++) {
				if (Static33.aShortArrayArray2[local342].length > this.anIntArray563[local342]) {
					local219.UA(Static62.aShortArray14[local342], Static33.aShortArrayArray2[local342][this.anIntArray563[local342]]);
				}
				if (this.anIntArray563[local342] < Static192.aShortArrayArray6[local342].length) {
					local219.UA(Static188.aShortArray61[local342], Static192.aShortArrayArray6[local342][this.anIntArray563[local342]]);
				}
			}
			local219.ia(local32);
			@Pc(397) Class332 local397 = Static234.aClass332_102;
			synchronized (Static234.aClass332_102) {
				Static234.aClass332_102.method7498(local207, local219);
			}
		}
		if (arg0 == null) {
			return local219;
		} else {
			local219 = local219.method4699((byte) 4, local32, true);
			return arg0.method2188(local219, arg3, arg1, 2048, arg9);
		}
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(BZ)V")
	public void method5780(@OriginalArg(1) boolean arg0) {
		this.aBoolean487 = arg0;
		this.method5775();
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(Lclient!dd;ILclient!wm;IBILclient!fq;[Lclient!uu;Lclient!mo;Lclient!wl;Lclient!oa;Lclient!fq;IIILclient!lq;Lclient!qb;ZI)Lclient!ba;")
	public Class22 method5781(@OriginalArg(0) Interface5 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class345 arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class108 arg5, @OriginalArg(7) Class325[] arg6, @OriginalArg(8) Class202 arg7, @OriginalArg(9) Class344 arg8, @OriginalArg(10) Class121 arg9, @OriginalArg(11) Class108 arg10, @OriginalArg(12) int arg11, @OriginalArg(13) int arg12, @OriginalArg(14) int arg13, @OriginalArg(15) Class189 arg14, @OriginalArg(16) Class256 arg15, @OriginalArg(18) int arg16) {
		if (this.anInt6913 != -1) {
			return arg7.method4897(this.anInt6913).method5936(arg13, arg6, arg16, arg4, arg14, arg10, arg2, arg0, arg1, arg5, arg11, arg12, arg9, arg3);
		}
		@Pc(33) int local33 = arg12;
		@Pc(36) long local36 = this.aLong179;
		@Pc(39) int[] local39 = this.anIntArray564;
		if (arg10 != null && (arg10.anInt2595 >= 0 || arg10.anInt2587 >= 0)) {
			local39 = new int[12];
			for (@Pc(58) int local58 = 0; local58 < 12; local58++) {
				local39[local58] = this.anIntArray564[local58];
			}
			if (arg10.anInt2595 >= 0) {
				if (arg10.anInt2595 == 65535) {
					local36 ^= 0xFFFFFFFF00000000L;
					local39[5] = 0;
				} else {
					local39[5] = arg10.anInt2595 | 0x40000000;
					local36 ^= (long) local39[5] << 32;
				}
			}
			if (arg10.anInt2587 >= 0) {
				if (arg10.anInt2587 == 65535) {
					local39[3] = 0;
					local36 ^= 0xFFFFFFFFL;
				} else {
					local39[3] = arg10.anInt2587 | 0x40000000;
					local36 ^= local39[3];
				}
			}
		}
		@Pc(149) boolean local149 = false;
		@Pc(151) boolean local151 = false;
		@Pc(153) boolean local153 = false;
		@Pc(161) boolean local161 = arg10 != null || arg5 != null;
		@Pc(168) int local168 = arg6 == null ? 0 : arg6.length;
		@Pc(207) int local207;
		@Pc(212) int local212;
		for (@Pc(170) int local170 = 0; local170 < local168; local170++) {
			Static302.aClass6_Sub1_Sub7Array1[local170] = null;
			if (arg6[local170] != null) {
				@Pc(188) Class108 local188 = arg2.method7798(arg6[local170].anInt9008);
				if (local188.anIntArray312 != null) {
					local161 = true;
					Static550.aClass108Array2[local170] = local188;
					@Pc(202) int local202 = arg6[local170].anInt9006;
					local207 = arg6[local170].anInt9005;
					local212 = local188.anIntArray312[local202];
					Static302.aClass6_Sub1_Sub7Array1[local170] = arg2.method7796(local212 >>> 16);
					@Pc(225) int local225 = local212 & 0xFFFF;
					Static154.anIntArray320[local170] = local225;
					if (Static302.aClass6_Sub1_Sub7Array1[local170] != null) {
						local151 |= Static302.aClass6_Sub1_Sub7Array1[local170].method2235(local225);
						local149 |= Static302.aClass6_Sub1_Sub7Array1[local170].method2234(local225);
						local153 |= Static302.aClass6_Sub1_Sub7Array1[local170].method2239(local225);
					}
					if ((local188.aBoolean177 || Static318.aBoolean368) && local207 != -1 && local207 < local188.anIntArray312.length) {
						Static256.anIntArray436[local170] = local188.anIntArray313[local202];
						Static542.anIntArray691[local170] = arg6[local170].anInt9002;
						@Pc(297) int local297 = local188.anIntArray312[local207];
						Static420.aClass6_Sub1_Sub7Array2[local170] = arg2.method7796(local297 >>> 16);
						@Pc(310) int local310 = local297 & 0xFFFF;
						Static433.anIntArray594[local170] = local310;
						if (Static420.aClass6_Sub1_Sub7Array2[local170] != null) {
							local151 |= Static420.aClass6_Sub1_Sub7Array2[local170].method2235(local310);
							local149 |= Static420.aClass6_Sub1_Sub7Array2[local170].method2234(local310);
							local153 |= Static420.aClass6_Sub1_Sub7Array2[local170].method2239(local310);
						}
					} else {
						Static256.anIntArray436[local170] = 0;
						Static542.anIntArray691[local170] = 0;
						Static420.aClass6_Sub1_Sub7Array2[local170] = null;
						Static433.anIntArray594[local170] = -1;
					}
				}
			}
		}
		@Pc(381) int local381 = -1;
		local207 = -1;
		local212 = 0;
		@Pc(387) Class6_Sub1_Sub7 local387 = null;
		@Pc(389) Class6_Sub1_Sub7 local389 = null;
		@Pc(391) int local391 = -1;
		@Pc(393) int local393 = -1;
		@Pc(395) int local395 = 0;
		@Pc(397) Class6_Sub1_Sub7 local397 = null;
		@Pc(399) Class6_Sub1_Sub7 local399 = null;
		if (local161) {
			@Pc(412) int local412;
			@Pc(471) int local471;
			if (arg10 != null) {
				local381 = arg10.anIntArray312[arg16];
				local412 = local381 >>> 16;
				local387 = arg2.method7796(local412);
				local381 &= 0xFFFF;
				if (local387 != null) {
					local151 |= local387.method2235(local381);
					local149 |= local387.method2234(local381);
					local153 |= local387.method2239(local381);
				}
				if ((arg10.aBoolean177 || Static318.aBoolean368) && arg4 != -1 && arg4 < arg10.anIntArray312.length) {
					local212 = arg10.anIntArray313[arg16];
					local207 = arg10.anIntArray312[arg4];
					local471 = local207 >>> 16;
					local389 = local412 == local471 ? local387 : arg2.method7796(local471);
					local207 &= 0xFFFF;
					if (local389 != null) {
						local151 |= local389.method2235(local207);
						local149 |= local389.method2234(local207);
						local153 |= local389.method2239(local207);
					}
				}
			}
			local33 = arg12 | 0x20;
			if (arg5 != null) {
				local391 = arg5.anIntArray312[arg11];
				local412 = local391 >>> 16;
				local391 &= 0xFFFF;
				local397 = arg2.method7796(local412);
				if (local397 != null) {
					local151 |= local397.method2235(local391);
					local149 |= local397.method2234(local391);
					local153 |= local397.method2239(local391);
				}
				if ((arg5.aBoolean177 || Static318.aBoolean368) && arg3 != -1 && arg3 < arg5.anIntArray312.length) {
					local395 = arg5.anIntArray313[arg11];
					local393 = arg5.anIntArray312[arg3];
					local471 = local393 >>> 16;
					local399 = local412 == local471 ? local397 : arg2.method7796(local471);
					local393 &= 0xFFFF;
					if (local399 != null) {
						local151 |= local399.method2235(local393);
						local149 |= local399.method2234(local393);
						local153 |= local399.method2239(local393);
					}
				}
			}
			if (local151) {
				local33 |= 0x80;
			}
			if (local149) {
				local33 |= 0x100;
			}
			if (local153) {
				local33 |= 0x400;
			}
		}
		@Pc(648) Class332 local648 = Static23.aClass332_14;
		@Pc(656) Class22 local656;
		synchronized (Static23.aClass332_14) {
			local656 = (Class22) Static23.aClass332_14.method7502(local36);
		}
		@Pc(664) Class120 local664 = null;
		if (this.anInt6909 != -1) {
			local664 = arg14.method4109(this.anInt6909);
		}
		@Pc(705) int local705;
		@Pc(711) int local711;
		if (local656 == null || arg9.method7150(local656.h(), local33) != 0 || local664 != null && local664.anIntArrayArray38 != null && this.anIntArrayArray70 == null) {
			if (local656 != null) {
				local33 = arg9.method7099(local33, local656.h());
			}
			@Pc(703) boolean local703 = false;
			local705 = 0;
			while (true) {
				if (local705 >= 12) {
					if (local703) {
						if (this.aLong180 != -1L) {
							@Pc(766) Class332 local766 = Static23.aClass332_14;
							synchronized (Static23.aClass332_14) {
								local656 = (Class22) Static23.aClass332_14.method7502(this.aLong180);
							}
						}
						if (local656 == null || arg9.method7150(local656.h(), local33) != 0 || local664 != null && local664.anIntArrayArray38 != null && this.anIntArrayArray70 == null) {
							return null;
						}
					} else {
						@Pc(802) Class274[] local802 = new Class274[12];
						@Pc(810) int local810;
						for (@Pc(804) int local804 = 0; local804 < 12; local804++) {
							local810 = local39[local804];
							@Pc(827) Class274 local827;
							if ((local810 & 0x40000000) != 0) {
								local827 = arg15.method5924(local810 & 0x3FFFFFFF).method2195(this.aBoolean487);
								if (local827 != null) {
									local802[local804] = local827;
								}
							} else if ((Integer.MIN_VALUE & local810) != 0) {
								local827 = arg8.method7788(local810 & 0x3FFFFFFF).method4989();
								if (local827 != null) {
									local802[local804] = local827;
								}
							}
						}
						@Pc(883) int local883;
						if (local664 != null && local664.anIntArrayArray38 != null) {
							for (local810 = 0; local810 < local664.anIntArrayArray38.length; local810++) {
								if (local664.anIntArrayArray38[local810] != null && local802[local810] != null) {
									local883 = local664.anIntArrayArray38[local810][0];
									@Pc(890) int local890 = local664.anIntArrayArray38[local810][1];
									@Pc(897) int local897 = local664.anIntArrayArray38[local810][2];
									@Pc(906) int local906 = local664.anIntArrayArray38[local810][3] << 3;
									@Pc(915) int local915 = local664.anIntArrayArray38[local810][4] << 3;
									@Pc(924) int local924 = local664.anIntArrayArray38[local810][5] << 3;
									if (this.anIntArrayArray70 == null) {
										this.anIntArrayArray70 = new int[local664.anIntArrayArray38.length][];
									}
									if (this.anIntArrayArray70[local810] == null) {
										@Pc(946) int[] local946 = this.anIntArrayArray70[local810] = new int[15];
										if (local906 == 0 && local915 == 0 && local924 == 0) {
											local946[12] = -local883;
											local946[0] = local946[4] = local946[8] = 32768;
											local946[13] = -local890;
											local946[14] = -local897;
										} else {
											@Pc(956) int local956 = Class138.anIntArray393[local906];
											@Pc(960) int local960 = Class138.anIntArray392[local906];
											@Pc(964) int local964 = Class138.anIntArray393[local915];
											@Pc(968) int local968 = Class138.anIntArray392[local915];
											@Pc(972) int local972 = Class138.anIntArray393[local924];
											@Pc(976) int local976 = Class138.anIntArray392[local924];
											@Pc(984) int local984 = local960 * local972 + 8192 >> 14;
											@Pc(992) int local992 = local976 * local960 + 8192 >> 14;
											local946[2] = local968 * local956 + 8192 >> 14;
											local946[4] = local956 * local972 + 8192 >> 14;
											local946[0] = local964 * local972 + local968 * local992 + 8192 >> 14;
											local946[5] = -local960;
											local946[7] = local984 * local964 + -local976 * -local968 + 8192 >> 14;
											local946[8] = local964 * local956 + 8192 >> 14;
											local946[1] = -local976 * local964 + local984 * local968 + 8192 >> 14;
											local946[6] = local972 * -local968 + local992 * local964 + 8192 >> 14;
											local946[3] = local976 * local956 + 8192 >> 14;
											local946[13] = local946[4] * -local890 + -local883 * local946[1] + local946[7] * -local897 + 8192 >> 14;
											local946[14] = -local890 * local946[5] + -local883 * local946[2] + -local897 * local946[8] + 8192 >> 14;
											local946[12] = -local897 * local946[6] + local946[3] * -local890 + -local883 * local946[0] + 8192 >> 14;
										}
										local946[11] = local897;
										local946[9] = local883;
										local946[10] = local890;
									}
									if (local906 != 0 || local915 != 0 || local924 != 0) {
										local802[local810].method6327(local924, local915, local906);
									}
									if (local883 != 0 || local890 != 0 || local897 != 0) {
										local802[local810].method6329(local890, local883, local897);
									}
								}
							}
						}
						@Pc(1275) int local1275 = local33 | 0x4000;
						@Pc(1282) Class274 local1282 = new Class274(local802, local802.length);
						local656 = arg9.method7088(local1282, local1275, Static44.anInt719, 64, 850);
						for (local883 = 0; local883 < 5; local883++) {
							if (Static33.aShortArrayArray2[local883].length > this.anIntArray563[local883]) {
								local656.UA(Static62.aShortArray14[local883], Static33.aShortArrayArray2[local883][this.anIntArray563[local883]]);
							}
							if (this.anIntArray563[local883] < Static192.aShortArrayArray6[local883].length) {
								local656.UA(Static188.aShortArray61[local883], Static192.aShortArrayArray6[local883][this.anIntArray563[local883]]);
							}
						}
						local656.ia(local33);
						@Pc(1351) Class332 local1351 = Static23.aClass332_14;
						synchronized (Static23.aClass332_14) {
							Static23.aClass332_14.method7498(local36, local656);
						}
						this.aLong180 = local36;
					}
					break;
				}
				local711 = local39[local705];
				if ((local711 & 0x40000000) == 0) {
					if ((local711 & Integer.MIN_VALUE) != 0 && !arg8.method7788(local711 & 0x3FFFFFFF).method4987()) {
						local703 = true;
					}
				} else if (!arg15.method5924(local711 & 0x3FFFFFFF).method2204(this.aBoolean487)) {
					local703 = true;
				}
				local705++;
			}
		}
		@Pc(1373) Class22 local1373 = local656.method4699((byte) 4, local33, true);
		if (!local161) {
			return local1373;
		}
		@Pc(1379) int local1379 = 0;
		local705 = 1;
		while (local1379 < local168) {
			if (Static302.aClass6_Sub1_Sub7Array1[local1379] != null) {
				local1373.method4691(Static433.anIntArray594[local1379], Static154.anIntArray320[local1379], this.anIntArrayArray70 == null ? null : this.anIntArrayArray70[local1379], Static420.aClass6_Sub1_Sub7Array2[local1379], false, Static542.anIntArray691[local1379] - 1, Static256.anIntArray436[local1379], local705, Static302.aClass6_Sub1_Sub7Array1[local1379]);
			}
			local705 <<= 0x1;
			local1379++;
		}
		if (local387 != null && local397 != null) {
			local1373.method4697(local397, arg1 - 1, arg10.aBooleanArray18, local381, local399, local393, local387, local391, local207, local212, local395, arg13 - 1, local389, false);
		} else if (local387 != null) {
			local1373.method4700(0, local207, local212, arg13 - 1, local387, local389, false, local381);
		} else if (local397 != null) {
			local1373.method4700(0, local393, local395, arg1 - 1, local397, local399, false, local391);
		}
		for (local711 = 0; local711 < local168; local711++) {
			Static302.aClass6_Sub1_Sub7Array1[local711] = null;
			Static420.aClass6_Sub1_Sub7Array2[local711] = null;
			Static550.aClass108Array2[local711] = null;
		}
		return local1373;
	}
}
