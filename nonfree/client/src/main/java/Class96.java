import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ff")
public class Class96 {

	@OriginalMember(owner = "client!ff", name = "n", descriptor = "[[[B")
	public byte[][][] aByteArrayArrayArray15;

	@OriginalMember(owner = "client!ff", name = "r", descriptor = "[I")
	private final int[] anIntArray290 = new int[] { 0, 256, 512, 512, 512, 256, 0, 0, 128, 256, 128, 384, 256 };

	@OriginalMember(owner = "client!ff", name = "t", descriptor = "[I")
	private final int[] anIntArray291 = new int[] { 0, 0, 0, 256, 512, 512, 512, 256, 256, 384, 128, 128, 256 };

	@OriginalMember(owner = "client!ff", name = "w", descriptor = "I")
	public final int anInt5123;

	@OriginalMember(owner = "client!ff", name = "C", descriptor = "Lclient!hl;")
	private final Class136 aClass136_2;

	@OriginalMember(owner = "client!ff", name = "x", descriptor = "Lclient!tfa;")
	private final Class321 aClass321_3;

	@OriginalMember(owner = "client!ff", name = "l", descriptor = "Z")
	public final boolean aBoolean353;

	@OriginalMember(owner = "client!ff", name = "D", descriptor = "I")
	protected final int anInt5127;

	@OriginalMember(owner = "client!ff", name = "B", descriptor = "I")
	protected final int anInt5126;

	@OriginalMember(owner = "client!ff", name = "q", descriptor = "[[[B")
	private final byte[][][] aByteArrayArrayArray16;

	@OriginalMember(owner = "client!ff", name = "A", descriptor = "[[[I")
	public final int[][][] anIntArrayArrayArray3;

	@OriginalMember(owner = "client!ff", name = "j", descriptor = "[[[B")
	private final byte[][][] aByteArrayArrayArray14;

	@OriginalMember(owner = "client!ff", name = "f", descriptor = "[[[B")
	private final byte[][][] aByteArrayArrayArray11;

	@OriginalMember(owner = "client!ff", name = "i", descriptor = "[[[B")
	protected byte[][][] aByteArrayArrayArray13;

	@OriginalMember(owner = "client!ff", name = "h", descriptor = "[[[B")
	private final byte[][][] aByteArrayArrayArray12;

	@OriginalMember(owner = "client!ff", name = "<init>", descriptor = "(IIIZLclient!hl;Lclient!tfa;)V")
	protected Class96(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) Class136 arg4, @OriginalArg(5) Class321 arg5) {
		this.anInt5123 = arg0;
		this.aClass136_2 = arg4;
		this.aClass321_3 = arg5;
		this.aBoolean353 = arg3;
		this.anInt5127 = arg1;
		this.anInt5126 = arg2;
		this.aByteArrayArrayArray16 = new byte[this.anInt5123][this.anInt5127][this.anInt5126];
		this.anIntArrayArrayArray3 = new int[this.anInt5123][this.anInt5127 + 1][this.anInt5126 + 1];
		this.aByteArrayArrayArray14 = new byte[this.anInt5123][this.anInt5127][this.anInt5126];
		this.aByteArrayArrayArray11 = new byte[this.anInt5123][this.anInt5127][this.anInt5126];
		this.aByteArrayArrayArray13 = new byte[this.anInt5123][this.anInt5127 + 1][this.anInt5126 + 1];
		this.aByteArrayArrayArray12 = new byte[this.anInt5123][this.anInt5127][this.anInt5126];
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "([[III)V")
	public final void method4560(@OriginalArg(0) int[][] arg0) {
		@Pc(10) int[][] local10 = this.anIntArrayArrayArray3[0];
		for (@Pc(12) int local12 = 0; local12 < this.anInt5127 + 1; local12++) {
			for (@Pc(16) int local16 = 0; local16 < this.anInt5126 + 1; local16++) {
				local10[local12][local16] += arg0[local12][local16];
			}
		}
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(ILclient!s;Lclient!s;Lclient!ha;[[IILclient!s;)V")
	private void method4561(@OriginalArg(1) Class199 arg0, @OriginalArg(2) Class199 arg1, @OriginalArg(3) Class100 arg2, @OriginalArg(4) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class199 arg5) {
		for (@Pc(15) int local15 = 0; local15 < this.anInt5127; local15++) {
			for (@Pc(19) int local19 = 0; local19 < this.anInt5126; local19++) {
				if (Static72.anInt1515 == -1 || Static510.method7565(Static72.anInt1515, local19, arg4, local15)) {
					@Pc(43) byte local43 = this.aByteArrayArrayArray16[arg4][local15][local19];
					@Pc(52) byte local52 = this.aByteArrayArrayArray12[arg4][local15][local19];
					@Pc(63) int local63 = this.aByteArrayArrayArray14[arg4][local15][local19] & 0xFF;
					@Pc(74) int local74 = this.aByteArrayArrayArray11[arg4][local15][local19] & 0xFF;
					@Pc(86) Class283 local86 = local63 == 0 ? null : this.aClass136_2.method3665(local63 - 1);
					@Pc(103) Class76 local103 = local74 == 0 ? null : this.aClass321_3.method7948(local74 - 1);
					if (local43 == 0 && local86 == null) {
						local43 = 12;
					}
					@Pc(114) Class283 local114 = local86;
					if (local86 != null && local86.anInt8353 == -1 && local86.anInt8358 == -1) {
						local114 = local86;
						local86 = null;
					}
					if (local86 != null || local103 != null) {
						@Pc(138) int local138 = Static422.anIntArray469[local43];
						@Pc(142) int local142 = Static54.anIntArray63[local43];
						@Pc(154) int local154 = (local103 == null ? 0 : local138) + (local86 == null ? 0 : local142);
						@Pc(156) int local156 = 0;
						@Pc(158) int local158 = 0;
						@Pc(165) int local165 = local86 == null ? -1 : local86.anInt8363;
						@Pc(172) int local172 = local103 == null ? -1 : local103.anInt2364;
						@Pc(175) int[] local175 = new int[local154];
						@Pc(178) int[] local178 = new int[local154];
						@Pc(181) int[] local181 = new int[local154];
						@Pc(184) int[] local184 = new int[local154];
						@Pc(187) int[] local187 = new int[local154];
						@Pc(190) int[] local190 = new int[local154];
						@Pc(201) int[] local201 = local86 == null || local86.anInt8358 == -1 ? null : new int[local154];
						@Pc(205) int local205;
						if (local86 == null) {
							local158 = local142;
						} else {
							for (local205 = 0; local205 < local142; local205++) {
								local175[local156] = Static585.anIntArrayArray55[local43][local158];
								local178[local156] = Static480.anIntArrayArray40[local43][local158];
								local181[local156] = Static362.anIntArrayArray29[local43][local158];
								local187[local156] = local165;
								local190[local156] = local86.anInt8367;
								local184[local156] = local86.anInt8353;
								if (local201 != null) {
									local201[local156] = local86.anInt8358;
								}
								local158++;
								local156++;
							}
							if (!this.aBoolean353 && arg4 == 0) {
								Static295.method5093(local15, local19, local86.anInt8355, local86.anInt8368 * 8, local86.anInt8370);
							}
						}
						if (local103 != null) {
							for (local205 = 0; local205 < local138; local205++) {
								local175[local156] = Static585.anIntArrayArray55[local43][local158];
								local178[local156] = Static480.anIntArrayArray40[local43][local158];
								local181[local156] = Static362.anIntArrayArray29[local43][local158];
								local187[local156] = local172;
								local190[local156] = local103.anInt2363;
								local184[local156] = arg3[local15][local19];
								if (local201 != null) {
									local201[local156] = local184[local156];
								}
								local158++;
								local156++;
							}
						}
						local205 = this.anIntArray290.length;
						@Pc(348) int[] local348 = new int[local205];
						@Pc(351) int[] local351 = new int[local205];
						@Pc(358) int[] local358 = arg1 == null ? null : new int[local205];
						@Pc(367) int[] local367 = arg1 == null && arg0 == null ? null : new int[local205];
						@Pc(376) int local376;
						@Pc(381) int local381;
						@Pc(469) int local469;
						@Pc(477) int local477;
						for (@Pc(369) int local369 = 0; local369 < local205; local369++) {
							local376 = this.anIntArray290[local369];
							local381 = this.anIntArray291[local369];
							if (local52 == 0) {
								local348[local369] = local376;
								local351[local369] = local381;
							} else if (local52 == 1) {
								local348[local369] = local381;
								local351[local369] = 512 - local376;
							} else if (local52 == 2) {
								local348[local369] = 512 - local376;
								local351[local369] = 512 - local381;
							} else if (local52 == 3) {
								local348[local369] = 512 - local381;
								local351[local369] = local376;
							}
							if (local358 != null && Static644.aBooleanArrayArray8[local43][local369]) {
								local469 = local348[local369] + (local15 << 9);
								local477 = (local19 << 9) + local351[local369];
								local358[local369] = arg1.method8531(local477, local469) - arg5.method8531(local477, local469);
							}
							if (local367 != null) {
								if (arg1 != null && !Static644.aBooleanArrayArray8[local43][local369]) {
									local469 = (local15 << 9) + local348[local369];
									local477 = local351[local369] + (local19 << 9);
									local367[local369] = arg5.method8531(local477, local469) - arg1.method8531(local477, local469);
								} else if (arg0 != null && !Static394.aBooleanArrayArray5[local43][local369]) {
									local469 = local348[local369] + (local15 << 9);
									local477 = local351[local369] + (local19 << 9);
									local367[local369] = arg0.method8531(local477, local469) - arg5.method8531(local477, local469);
								}
							}
						}
						local376 = arg5.method8532(local15, local19);
						local381 = arg5.method8532(local15 + 1, local19);
						local469 = arg5.method8532(local15 + 1, local19 + 1);
						local477 = arg5.method8532(local15, local19 + 1);
						@Pc(616) boolean local616 = Static492.method7384(local15, local19);
						if (local616 && arg4 > 1 || !local616 && arg4 > 0) {
							@Pc(627) boolean local627 = true;
							if (local103 != null && !local103.aBoolean174) {
								local627 = false;
							} else if (local74 == 0 && local43 != 0) {
								local627 = false;
							} else if (local63 > 0 && local114 != null && !local114.aBoolean564) {
								local627 = false;
							}
							if (local627 && local376 == local381 && local469 == local376 && local477 == local376) {
								this.aByteArrayArrayArray13[arg4][local15][local19] = (byte) (this.aByteArrayArrayArray13[arg4][local15][local19] | 0x4);
							}
						}
						@Pc(703) int local703 = 0;
						@Pc(705) int local705 = 0;
						@Pc(707) int local707 = 0;
						if (this.aBoolean353) {
							local703 = Static62.method1114(local15, local19);
							local705 = Static645.method8994(local15, local19);
							local707 = Static42.method804(local15, local19);
						}
						arg5.method8530(local15, local19, local348, local358, local351, local367, local175, local178, local181, local184, local201, local187, local190, local703, local705, local707);
						Static174.method3210(arg4, local15, local19);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(ILclient!rg;II[Lclient!tea;II)V")
	public final void method4564(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub40 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class319[] arg4, @OriginalArg(6) int arg5) {
		@Pc(6) int local6;
		@Pc(14) int local14;
		@Pc(18) int local18;
		@Pc(25) int local25;
		if (!this.aBoolean353) {
			for (local6 = 0; local6 < 4; local6++) {
				@Pc(12) Class319 local12 = arg4[local6];
				for (local14 = 0; local14 < 64; local14++) {
					for (local18 = 0; local18 < 64; local18++) {
						local25 = arg3 + local14;
						@Pc(29) int local29 = local18 + arg0;
						if (local25 >= 0 && this.anInt5127 > local25 && local29 >= 0 && local29 < this.anInt5126) {
							local12.method7940(local25, local29);
						}
					}
				}
			}
		}
		local6 = arg2 + arg3;
		@Pc(84) int local84 = arg5 + arg0;
		for (local14 = 0; local14 < this.anInt5123; local14++) {
			for (local18 = 0; local18 < 64; local18++) {
				for (local25 = 0; local25 < 64; local25++) {
					this.method4572(false, 0, 0, local84 + local25, local25 - -arg0, arg3 + local18, arg1, 0, local18 + local6, local14);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(IIIII)V")
	public final void method4565(@OriginalArg(1) int arg0, @OriginalArg(4) int arg1) {
		for (@Pc(13) int local13 = 0; local13 < this.anInt5123; local13++) {
			this.method4569(local13, arg0, 64, 64, arg1);
		}
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(Lclient!s;Lclient!ha;Lclient!s;I)V")
	public final void method4566(@OriginalArg(0) Class199 arg0, @OriginalArg(1) Class100 arg1, @OriginalArg(2) Class199 arg2) {
		@Pc(11) int[][] local11 = new int[this.anInt5127][this.anInt5126];
		if (Static382.anIntArray430 == null || this.anInt5126 != Static382.anIntArray430.length) {
			Static382.anIntArray430 = new int[this.anInt5126];
			Static121.anIntArray159 = new int[this.anInt5126];
			Static400.anIntArray449 = new int[this.anInt5126];
			Static464.anIntArray515 = new int[this.anInt5126];
			Static228.anIntArray253 = new int[this.anInt5126];
		}
		@Pc(48) int local48;
		for (@Pc(44) int local44 = 0; local44 < this.anInt5123; local44++) {
			for (local48 = 0; local48 < this.anInt5126; local48++) {
				Static382.anIntArray430[local48] = 0;
				Static464.anIntArray515[local48] = 0;
				Static400.anIntArray449[local48] = 0;
				Static121.anIntArray159[local48] = 0;
				Static228.anIntArray253[local48] = 0;
			}
			for (@Pc(77) int local77 = -5; local77 < this.anInt5127; local77++) {
				@Pc(87) int local87;
				@Pc(106) int local106;
				@Pc(177) int local177;
				for (@Pc(81) int local81 = 0; local81 < this.anInt5126; local81++) {
					local87 = local77 + 5;
					@Pc(157) int local157;
					if (this.anInt5127 > local87) {
						local106 = this.aByteArrayArrayArray11[local44][local87][local81] & 0xFF;
						if (local106 > 0) {
							@Pc(121) Class76 local121 = this.aClass321_3.method7948(local106 - 1);
							Static382.anIntArray430[local81] += local121.anInt2358;
							Static464.anIntArray515[local81] += local121.anInt2354;
							Static400.anIntArray449[local81] += local121.anInt2360;
							Static121.anIntArray159[local81] += local121.anInt2362;
							local157 = Static228.anIntArray253[local81]++;
						}
					}
					local106 = local77 - 5;
					if (local106 >= 0) {
						local177 = this.aByteArrayArrayArray11[local44][local106][local81] & 0xFF;
						if (local177 > 0) {
							@Pc(187) Class76 local187 = this.aClass321_3.method7948(local177 - 1);
							Static382.anIntArray430[local81] -= local187.anInt2358;
							Static464.anIntArray515[local81] -= local187.anInt2354;
							Static400.anIntArray449[local81] -= local187.anInt2360;
							Static121.anIntArray159[local81] -= local187.anInt2362;
							local157 = Static228.anIntArray253[local81]--;
						}
					}
				}
				if (local77 >= 0) {
					local87 = 0;
					local106 = 0;
					local177 = 0;
					@Pc(244) int local244 = 0;
					@Pc(246) int local246 = 0;
					for (@Pc(248) int local248 = -5; local248 < this.anInt5126; local248++) {
						@Pc(254) int local254 = local248 + 5;
						if (local254 < this.anInt5126) {
							local246 += Static228.anIntArray253[local254];
							local87 += Static382.anIntArray430[local254];
							local177 += Static400.anIntArray449[local254];
							local106 += Static464.anIntArray515[local254];
							local244 += Static121.anIntArray159[local254];
						}
						@Pc(292) int local292 = local248 - 5;
						if (local292 >= 0) {
							local87 -= Static382.anIntArray430[local292];
							local244 -= Static121.anIntArray159[local292];
							local177 -= Static400.anIntArray449[local292];
							local246 -= Static228.anIntArray253[local292];
							local106 -= Static464.anIntArray515[local292];
						}
						if (local248 >= 0 && local244 > 0 && local246 > 0) {
							local11[local77][local248] = Static98.method1584(local87 * 256 / local244, local177 / local246, local106 / local246);
						}
					}
				}
			}
			if (Static172.aBoolean256) {
				this.method4573(local44 == 0 ? arg0 : null, local11, Static195.aClass199Array1[local44], local44 == 0 ? arg2 : null, arg1, local44);
			} else {
				this.method4561(local44 == 0 ? arg2 : null, local44 == 0 ? arg0 : null, arg1, local11, local44, Static195.aClass199Array1[local44]);
			}
			this.aByteArrayArrayArray11[local44] = null;
			this.aByteArrayArrayArray14[local44] = null;
			this.aByteArrayArrayArray16[local44] = null;
			this.aByteArrayArrayArray12[local44] = null;
		}
		if (!this.aBoolean353) {
			if (Static371.anInt6827 != 0) {
				Static555.method8010();
			}
			if (Static490.aBoolean577) {
				Static426.method6679();
			}
		}
		for (local48 = 0; local48 < this.anInt5123; local48++) {
			Static195.aClass199Array1[local48].YA();
		}
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(B[Lclient!tea;Lclient!rg;IIIIIII)V")
	public final void method4567(@OriginalArg(1) Class319[] arg0, @OriginalArg(2) Class6_Sub40 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(11) int local11 = (arg7 & 0x7) * 8;
		@Pc(20) int local20;
		@Pc(53) int local53;
		if (!this.aBoolean353) {
			@Pc(18) Class319 local18 = arg0[arg2];
			for (local20 = 0; local20 < 8; local20++) {
				for (@Pc(24) int local24 = 0; local24 < 8; local24++) {
					@Pc(40) int local40 = Static83.method1430(arg6, local20 & 0x7, local24 & 0x7) + arg8;
					local53 = arg4 + Static51.method885(local20 & 0x7, local24 & 0x7, arg6);
					if (local40 > 0 && local40 < this.anInt5127 - 1 && local53 > 0 && local53 < this.anInt5126 - 1) {
						local18.method7940(local40, local53);
					}
				}
			}
		}
		@Pc(97) int local97 = (arg5 & 0x7) * 8;
		@Pc(107) int local107 = (arg7 & 0xFFFFFFF8) << 3;
		local20 = (arg5 & 0x1FFFFFF8) << 3;
		@Pc(115) byte local115 = 0;
		@Pc(117) byte local117 = 0;
		if (arg6 == 1) {
			local117 = 1;
		} else if (arg6 == 2) {
			local117 = 1;
			local115 = 1;
		} else if (arg6 == 3) {
			local115 = 1;
		}
		for (local53 = 0; local53 < this.anInt5123; local53++) {
			for (@Pc(148) int local148 = 0; local148 < 64; local148++) {
				for (@Pc(152) int local152 = 0; local152 < 64; local152++) {
					if (arg3 == local53 && local11 <= local148 && local11 + 8 >= local148 && local152 >= local97 && local152 <= local97 + 8) {
						@Pc(215) int local215;
						@Pc(208) int local208;
						if (local11 + 8 == local148 || local152 == local97 + 8) {
							if (arg6 == 0) {
								local208 = arg4 + local152 - local97;
								local215 = local148 + arg8 - local11;
							} else if (arg6 == 1) {
								local208 = arg4 + local11 + 8 - local148;
								local215 = arg8 + local152 - local97;
							} else if (arg6 == 2) {
								local215 = local11 + arg8 + 8 - local148;
								local208 = arg4 + local97 + 8 - local152;
							} else {
								local208 = arg4 + local148 - local11;
								local215 = local97 + arg8 + 8 - local152;
							}
							this.method4572(true, 0, 0, local152 + local20, local208, local215, arg1, 0, local107 + local148, arg2);
						} else {
							local215 = Static83.method1430(arg6, local148 & 0x7, local152 & 0x7) + arg8;
							local208 = arg4 + Static51.method885(local148 & 0x7, local152 & 0x7, arg6);
							this.method4572(false, arg6, local117, local20 + local152, local208, local215, arg1, local115, local148 + local107, arg2);
						}
						if (local148 == 63 || local152 == 63) {
							@Pc(343) byte local343 = 1;
							if (local148 == 63 && local152 == 63) {
								local343 = 3;
							}
							for (@Pc(353) int local353 = 0; local353 < local343; local353++) {
								@Pc(357) int local357 = local148;
								@Pc(359) int local359 = local152;
								if (local353 == 0) {
									local357 = local148 == 63 ? 64 : local148;
									local359 = local152 == 63 ? 64 : local152;
								} else if (local353 == 1) {
									local357 = 64;
								} else if (local353 == 2) {
									local359 = 64;
								}
								@Pc(408) int local408;
								@Pc(415) int local415;
								if (arg6 == 0) {
									local408 = local357 + arg8 - local11;
									local415 = local359 + arg4 - local97;
								} else if (arg6 == 1) {
									local408 = arg8 + local359 - local97;
									local415 = local11 + arg4 + 8 - local357;
								} else if (arg6 == 2) {
									local415 = arg4 + local97 + 8 - local359;
									local408 = arg8 + local11 + 8 - local357;
								} else {
									local408 = local97 + arg8 + 8 - local359;
									local415 = local357 + arg4 - local11;
								}
								if (local408 >= 0 && this.anInt5127 > local408 && local415 >= 0 && local415 < this.anInt5126) {
									this.anIntArrayArrayArray3[arg2][local408][local415] = this.anIntArrayArrayArray3[arg2][local115 + local215][local117 + local208];
								}
							}
						}
					} else {
						this.method4572(false, 0, 0, 0, -1, -1, arg1, 0, 0, 0);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "([[BI[Z[[BLclient!ed;IILclient!ha;ILclient!rca;I[[BII)V")
	private void method4568(@OriginalArg(0) byte[][] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean[] arg2, @OriginalArg(3) byte[][] arg3, @OriginalArg(4) Class76 arg4, @OriginalArg(5) int arg5, @OriginalArg(7) Class100 arg6, @OriginalArg(8) int arg7, @OriginalArg(9) Class283 arg8, @OriginalArg(10) int arg9, @OriginalArg(11) byte[][] arg10, @OriginalArg(12) int arg11, @OriginalArg(13) int arg12) {
		@Pc(18) boolean[] local18 = arg8 != null && arg8.aBoolean565 ? Static83.aBooleanArrayArray1[arg11] : Static100.aBooleanArrayArray7[arg11];
		@Pc(40) int local40;
		@Pc(50) Class283 local50;
		@Pc(68) byte local68;
		@Pc(84) int local84;
		@Pc(89) int local89;
		if (arg5 > 0) {
			if (arg1 > 0) {
				local40 = arg10[arg1 - 1][arg5 - 1] & 0xFF;
				if (local40 > 0) {
					local50 = this.aClass136_2.method3665(local40 - 1);
					if (local50.anInt8353 != -1 && local50.aBoolean565) {
						local68 = arg0[arg1 - 1][arg5 - 1];
						local84 = arg3[arg1 - 1][arg5 - 1] * 2 + 4 & 0x7;
						local89 = Static241.method4061(arg6, local50);
						if (Static644.aBooleanArrayArray8[local68][local84]) {
							Static287.anIntArray535[0] = local50.anInt8353;
							Static352.anIntArray410[0] = local89;
							Static167.anIntArray208[0] = local50.anInt8363;
							Static491.anIntArray528[0] = local50.anInt8367;
							Static443.anIntArray487[0] = local50.anInt8361;
							Static624.anIntArray626[0] = 256;
						}
					}
				}
			}
			if (arg12 - 1 > arg1) {
				local40 = arg10[arg1 + 1][arg5 - 1] & 0xFF;
				if (local40 > 0) {
					local50 = this.aClass136_2.method3665(local40 - 1);
					if (local50.anInt8353 != -1 && local50.aBoolean565) {
						local68 = arg0[arg1 + 1][arg5 - 1];
						local84 = arg3[arg1 + 1][arg5 - 1] * 2 + 6 & 0x7;
						local89 = Static241.method4061(arg6, local50);
						if (Static644.aBooleanArrayArray8[local68][local84]) {
							Static287.anIntArray535[2] = local50.anInt8353;
							Static352.anIntArray410[2] = local89;
							Static167.anIntArray208[2] = local50.anInt8363;
							Static491.anIntArray528[2] = local50.anInt8367;
							Static443.anIntArray487[2] = local50.anInt8361;
							Static624.anIntArray626[2] = 512;
						}
					}
				}
			}
		}
		if (arg5 < arg7 - 1) {
			if (arg1 > 0) {
				local40 = arg10[arg1 - 1][arg5 + 1] & 0xFF;
				if (local40 > 0) {
					local50 = this.aClass136_2.method3665(local40 - 1);
					if (local50.anInt8353 != -1 && local50.aBoolean565) {
						local68 = arg0[arg1 - 1][arg5 + 1];
						local84 = arg3[arg1 - 1][arg5 + 1] * 2 + 2 & 0x7;
						local89 = Static241.method4061(arg6, local50);
						if (Static644.aBooleanArrayArray8[local68][local84]) {
							Static287.anIntArray535[6] = local50.anInt8353;
							Static352.anIntArray410[6] = local89;
							Static167.anIntArray208[6] = local50.anInt8363;
							Static491.anIntArray528[6] = local50.anInt8367;
							Static443.anIntArray487[6] = local50.anInt8361;
							Static624.anIntArray626[6] = 64;
						}
					}
				}
			}
			if (arg1 < arg12 - 1) {
				local40 = arg10[arg1 + 1][arg5 + 1] & 0xFF;
				if (local40 > 0) {
					local50 = this.aClass136_2.method3665(local40 - 1);
					if (local50.anInt8353 != -1 && local50.aBoolean565) {
						local68 = arg0[arg1 + 1][arg5 + 1];
						local84 = --(arg3[arg1 + 1][arg5 + 1] * 2) & 0x7;
						local89 = Static241.method4061(arg6, local50);
						if (Static644.aBooleanArrayArray8[local68][local84]) {
							Static287.anIntArray535[4] = local50.anInt8353;
							Static352.anIntArray410[4] = local89;
							Static167.anIntArray208[4] = local50.anInt8363;
							Static491.anIntArray528[4] = local50.anInt8367;
							Static443.anIntArray487[4] = local50.anInt8361;
							Static624.anIntArray626[4] = 128;
						}
					}
				}
			}
		}
		@Pc(491) int local491;
		@Pc(496) int local496;
		@Pc(498) int local498;
		@Pc(479) byte local479;
		if (arg5 > 0) {
			local40 = arg10[arg1][arg5 - 1] & 0xFF;
			if (local40 > 0) {
				local50 = this.aClass136_2.method3665(local40 - 1);
				if (local50.anInt8353 != -1) {
					local68 = arg0[arg1][arg5 - 1];
					local479 = arg3[arg1][arg5 - 1];
					if (local50.aBoolean565) {
						local89 = 2;
						local491 = local479 * 2 + 4;
						local496 = Static241.method4061(arg6, local50);
						for (local498 = 0; local498 < 3; local498++) {
							local89 &= 0x7;
							local491 &= 0x7;
							if (Static644.aBooleanArrayArray8[local68][local491] && Static443.anIntArray487[local89] <= local50.anInt8361) {
								Static287.anIntArray535[local89] = local50.anInt8353;
								Static352.anIntArray410[local89] = local496;
								Static167.anIntArray208[local89] = local50.anInt8363;
								Static491.anIntArray528[local89] = local50.anInt8367;
								if (Static443.anIntArray487[local89] == local50.anInt8361) {
									Static624.anIntArray626[local89] |= 0x20;
								} else {
									Static624.anIntArray626[local89] = 32;
								}
								Static443.anIntArray487[local89] = local50.anInt8361;
							}
							local491++;
							local89--;
						}
						if (!local18[arg9 & 0x3]) {
							arg2[0] = Static83.aBooleanArrayArray1[local68][local479 + 2 & 0x3];
						}
					} else if (!local18[arg9 & 0x3]) {
						arg2[0] = Static100.aBooleanArrayArray7[local68][local479 + 2 & 0x3];
					}
				}
			}
		}
		if (arg5 < arg7 - 1) {
			local40 = arg10[arg1][arg5 + 1] & 0xFF;
			if (local40 > 0) {
				local50 = this.aClass136_2.method3665(local40 - 1);
				if (local50.anInt8353 != -1) {
					local68 = arg0[arg1][arg5 + 1];
					local479 = arg3[arg1][arg5 + 1];
					if (local50.aBoolean565) {
						local89 = 4;
						local491 = local479 * 2 + 2;
						local496 = Static241.method4061(arg6, local50);
						for (local498 = 0; local498 < 3; local498++) {
							local491 &= 0x7;
							local89 &= 0x7;
							if (Static644.aBooleanArrayArray8[local68][local491] && local50.anInt8361 >= Static443.anIntArray487[local89]) {
								Static287.anIntArray535[local89] = local50.anInt8353;
								Static352.anIntArray410[local89] = local496;
								Static167.anIntArray208[local89] = local50.anInt8363;
								Static491.anIntArray528[local89] = local50.anInt8367;
								if (local50.anInt8361 == Static443.anIntArray487[local89]) {
									Static624.anIntArray626[local89] |= 0x10;
								} else {
									Static624.anIntArray626[local89] = 16;
								}
								Static443.anIntArray487[local89] = local50.anInt8361;
							}
							local89++;
							local491--;
						}
						if (!local18[arg9 + 2 & 0x3]) {
							arg2[2] = Static83.aBooleanArrayArray1[local68][--local479 & 0x3];
						}
					} else if (!local18[arg9 + 2 & 0x3]) {
						arg2[2] = Static100.aBooleanArrayArray7[local68][local479 & 0x3];
					}
				}
			}
		}
		if (arg1 > 0) {
			local40 = arg10[arg1 - 1][arg5] & 0xFF;
			if (local40 > 0) {
				local50 = this.aClass136_2.method3665(local40 - 1);
				if (local50.anInt8353 != -1) {
					local68 = arg0[arg1 - 1][arg5];
					local479 = arg3[arg1 - 1][arg5];
					if (local50.aBoolean565) {
						local89 = 6;
						local491 = local479 * 2 + 4;
						local496 = Static241.method4061(arg6, local50);
						for (local498 = 0; local498 < 3; local498++) {
							local491 &= 0x7;
							local89 &= 0x7;
							if (Static644.aBooleanArrayArray8[local68][local491] && local50.anInt8361 >= Static443.anIntArray487[local89]) {
								Static287.anIntArray535[local89] = local50.anInt8353;
								Static352.anIntArray410[local89] = local496;
								Static167.anIntArray208[local89] = local50.anInt8363;
								Static491.anIntArray528[local89] = local50.anInt8367;
								if (local50.anInt8361 == Static443.anIntArray487[local89]) {
									Static624.anIntArray626[local89] |= 0x8;
								} else {
									Static624.anIntArray626[local89] = 8;
								}
								Static443.anIntArray487[local89] = local50.anInt8361;
							}
							local491--;
							local89++;
						}
						if (!local18[arg9 + 3 & 0x3]) {
							arg2[3] = Static83.aBooleanArrayArray1[local68][local479 + 1 & 0x3];
						}
					} else if (!local18[arg9 + 3 & 0x3]) {
						arg2[3] = Static100.aBooleanArrayArray7[local68][local479 + 1 & 0x3];
					}
				}
			}
		}
		if (arg1 < arg12 - 1) {
			local40 = arg10[arg1 + 1][arg5] & 0xFF;
			if (local40 > 0) {
				local50 = this.aClass136_2.method3665(local40 - 1);
				if (local50.anInt8353 != -1) {
					local68 = arg0[arg1 + 1][arg5];
					local479 = arg3[arg1 + 1][arg5];
					if (local50.aBoolean565) {
						local89 = 4;
						local491 = local479 * 2 + 6;
						local496 = Static241.method4061(arg6, local50);
						for (local498 = 0; local498 < 3; local498++) {
							local491 &= 0x7;
							local89 &= 0x7;
							if (Static644.aBooleanArrayArray8[local68][local491] && local50.anInt8361 >= Static443.anIntArray487[local89]) {
								Static287.anIntArray535[local89] = local50.anInt8353;
								Static352.anIntArray410[local89] = local496;
								Static167.anIntArray208[local89] = local50.anInt8363;
								Static491.anIntArray528[local89] = local50.anInt8367;
								if (Static443.anIntArray487[local89] == local50.anInt8361) {
									Static624.anIntArray626[local89] |= 0x4;
								} else {
									Static624.anIntArray626[local89] = 4;
								}
								Static443.anIntArray487[local89] = local50.anInt8361;
							}
							local491++;
							local89--;
						}
						if (!local18[arg9 + 1 & 0x3]) {
							arg2[1] = Static83.aBooleanArrayArray1[local68][local479 + 3 & 0x3];
						}
					} else if (!local18[arg9 + 1 & 0x3]) {
						arg2[1] = Static100.aBooleanArrayArray7[local68][local479 + 3 & 0x3];
					}
				}
			}
		}
		if (arg8 == null) {
			return;
		}
		local40 = Static241.method4061(arg6, arg8);
		if (!arg8.aBoolean565) {
			return;
		}
		for (@Pc(1200) int local1200 = 0; local1200 < 8; local1200++) {
			@Pc(1211) int local1211 = local1200 - arg9 * 2 & 0x7;
			if (Static644.aBooleanArrayArray8[arg11][local1200] && arg8.anInt8361 >= Static443.anIntArray487[local1211]) {
				Static287.anIntArray535[local1211] = arg8.anInt8353;
				Static352.anIntArray410[local1211] = local40;
				Static167.anIntArray208[local1211] = arg8.anInt8363;
				Static491.anIntArray528[local1211] = arg8.anInt8367;
				if (arg8.anInt8361 == Static443.anIntArray487[local1211]) {
					Static624.anIntArray626[local1211] |= 0x2;
				} else {
					Static624.anIntArray626[local1211] = 2;
				}
				Static443.anIntArray487[local1211] = arg8.anInt8361;
			}
		}
		return;
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(ZIIIII)V")
	public final void method4569(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(17) int local17;
		for (@Pc(13) int local13 = arg4; local13 < arg3 + arg4; local13++) {
			for (local17 = arg1; local17 < arg1 + arg2; local17++) {
				if (local17 >= 0 && this.anInt5127 > local17 && local13 >= 0 && this.anInt5126 > local13) {
					this.anIntArrayArrayArray3[arg0][local17][local13] = arg0 > 0 ? this.anIntArrayArrayArray3[arg0 - 1][local17][local13] - 960 : 0;
				}
			}
		}
		if (arg1 > 0 && this.anInt5127 > arg1) {
			for (local17 = arg4 + 1; local17 < arg4 + arg3; local17++) {
				if (local17 >= 0 && this.anInt5126 > local17) {
					this.anIntArrayArrayArray3[arg0][arg1][local17] = this.anIntArrayArrayArray3[arg0][arg1 - 1][local17];
				}
			}
		}
		if (arg4 > 0 && arg4 < this.anInt5126) {
			for (local17 = arg1 + 1; local17 < arg2 + arg1; local17++) {
				if (local17 >= 0 && local17 < this.anInt5127) {
					this.anIntArrayArrayArray3[arg0][local17][arg4] = this.anIntArrayArrayArray3[arg0][local17][arg4 - 1];
				}
			}
		}
		if (arg1 < 0 || arg4 < 0 || this.anInt5127 <= arg1 || arg4 >= this.anInt5126) {
			return;
		}
		if (arg0 != 0) {
			if (arg1 > 0 && this.anIntArrayArrayArray3[arg0 - 1][arg1 - 1][arg4] != this.anIntArrayArrayArray3[arg0][arg1 - 1][arg4]) {
				this.anIntArrayArrayArray3[arg0][arg1][arg4] = this.anIntArrayArrayArray3[arg0][arg1 - 1][arg4];
				return;
			}
			if (arg4 > 0 && this.anIntArrayArrayArray3[arg0 - 1][arg1][arg4 - 1] != this.anIntArrayArrayArray3[arg0][arg1][arg4 - 1]) {
				this.anIntArrayArrayArray3[arg0][arg1][arg4] = this.anIntArrayArrayArray3[arg0][arg1][arg4 - 1];
				return;
			}
			if (arg1 > 0 && arg4 > 0 && this.anIntArrayArrayArray3[arg0 - 1][arg1 - 1][arg4 - 1] != this.anIntArrayArrayArray3[arg0][arg1 - 1][arg4 - 1]) {
				this.anIntArrayArrayArray3[arg0][arg1][arg4] = this.anIntArrayArrayArray3[arg0][arg1 - 1][arg4 - 1];
				return;
			}
			return;
		}
		if (arg1 > 0 && this.anIntArrayArrayArray3[arg0][arg1 - 1][arg4] != 0) {
			this.anIntArrayArrayArray3[arg0][arg1][arg4] = this.anIntArrayArrayArray3[arg0][arg1 - 1][arg4];
			return;
		}
		if (arg4 > 0 && this.anIntArrayArrayArray3[arg0][arg1][arg4 - 1] != 0) {
			this.anIntArrayArrayArray3[arg0][arg1][arg4] = this.anIntArrayArrayArray3[arg0][arg1][arg4 - 1];
			return;
		}
		if (arg1 > 0 && arg4 > 0 && this.anIntArrayArrayArray3[arg0][arg1 - 1][arg4 - 1] != 0) {
			this.anIntArrayArrayArray3[arg0][arg1][arg4] = this.anIntArrayArrayArray3[arg0][arg1 - 1][arg4 - 1];
			return;
		}
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(I[[[I[Lclient!tea;Lclient!ha;)V")
	public final void method4571(@OriginalArg(1) int[][][] arg0, @OriginalArg(2) Class319[] arg1, @OriginalArg(3) Class100 arg2) {
		@Pc(6) int local6;
		@Pc(10) int local10;
		@Pc(14) int local14;
		if (!this.aBoolean353) {
			for (local6 = 0; local6 < 4; local6++) {
				for (local10 = 0; local10 < this.anInt5127; local10++) {
					for (local14 = 0; local14 < this.anInt5126; local14++) {
						if ((Static197.aByteArrayArrayArray24[local6][local10][local14] & 0x1) != 0) {
							@Pc(31) int local31 = local6;
							if ((Static197.aByteArrayArrayArray24[1][local10][local14] & 0x2) != 0) {
								local31 = local6 - 1;
							}
							if (local31 >= 0) {
								arg1[local31].method7934(local14, local10);
							}
						}
					}
				}
			}
		}
		for (local6 = 0; local6 < this.anInt5123; local6++) {
			local10 = 0;
			local14 = 0;
			if (!this.aBoolean353) {
				if (Static370.aBoolean452) {
					local14 = 8;
				}
				if (Static490.aBoolean577) {
					local10 = 2;
				}
				if (Static371.anInt6827 != 0) {
					local10 |= 0x1;
					if (local6 == 0 | Static435.aBoolean526) {
						local14 |= 0x10;
					}
				}
			}
			if (Static490.aBoolean577) {
				local14 |= 0x7;
			}
			if (!Static576.aBoolean331) {
				local14 |= 0x20;
			}
			@Pc(154) int[][] local154 = arg0 == null || arg0.length <= local6 ? this.anIntArrayArrayArray3[local6] : arg0[local6];
			Static67.method1173(local6, arg2.method8810(this.anInt5127, this.anInt5126, this.anIntArrayArrayArray3[local6], local154, local10, local14));
		}
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(ZIZIIIILclient!rg;III)V")
	private void method4572(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class6_Sub40 arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		if (arg1 == 1) {
			arg2 = 1;
		} else if (arg1 == 2) {
			arg7 = 1;
			arg2 = 1;
		} else if (arg1 == 3) {
			arg7 = 1;
		}
		@Pc(61) int local61;
		if (arg5 < 0 || this.anInt5127 <= arg5 || arg4 < 0 || arg4 >= this.anInt5126) {
			while (true) {
				local61 = arg6.method8604();
				if (local61 == 0) {
					return;
				}
				if (local61 == 1) {
					arg6.method8604();
					return;
				}
				if (local61 <= 49) {
					arg6.method8604();
				}
			}
			return;
		}
		if (!this.aBoolean353 && !arg0) {
			Static197.aByteArrayArrayArray24[arg9][arg5][arg4] = 0;
		}
		while (true) {
			local61 = arg6.method8604();
			if (local61 == 0) {
				if (this.aBoolean353) {
					this.anIntArrayArrayArray3[0][arg7 + arg5][arg2 + arg4] = 0;
					return;
				} else if (arg9 == 0) {
					this.anIntArrayArrayArray3[0][arg5 + arg7][arg2 + arg4] = -Static383.method6174(arg3 + 556238, arg8 + 932731) * 8 << 2;
					return;
				} else {
					this.anIntArrayArrayArray3[arg9][arg5 + arg7][arg2 + arg4] = this.anIntArrayArrayArray3[arg9 - 1][arg7 + arg5][arg2 + arg4] - 960;
					return;
				}
			}
			if (local61 == 1) {
				@Pc(191) int local191 = arg6.method8604();
				if (this.aBoolean353) {
					this.anIntArrayArrayArray3[0][arg5 + arg7][arg2 + arg4] = local191 * 8 << 2;
					return;
				}
				if (local191 == 1) {
					local191 = 0;
				}
				if (arg9 == 0) {
					this.anIntArrayArrayArray3[0][arg7 + arg5][arg4 + arg2] = -local191 * 8 << 2;
					return;
				}
				this.anIntArrayArrayArray3[arg9][arg5 + arg7][arg4 + arg2] = this.anIntArrayArrayArray3[arg9 - 1][arg7 + arg5][arg2 + arg4] - (local191 * 8 << 2);
				return;
			}
			if (local61 <= 49) {
				if (arg0) {
					arg6.method8604();
				} else {
					this.aByteArrayArrayArray14[arg9][arg5][arg4] = arg6.method8602();
					this.aByteArrayArrayArray16[arg9][arg5][arg4] = (byte) ((local61 - 2) / 4);
					this.aByteArrayArrayArray12[arg9][arg5][arg4] = (byte) (local61 + arg1 - 2 & 0x3);
				}
			} else if (local61 <= 81) {
				if (!this.aBoolean353 && !arg0) {
					Static197.aByteArrayArrayArray24[arg9][arg5][arg4] = (byte) (local61 - 49);
				}
			} else if (!arg0) {
				this.aByteArrayArrayArray11[arg9][arg5][arg4] = (byte) (local61 - 81);
			}
		}
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(ILclient!s;[[ILclient!s;Lclient!s;Lclient!ha;I)V")
	private void method4573(@OriginalArg(1) Class199 arg0, @OriginalArg(2) int[][] arg1, @OriginalArg(3) Class199 arg2, @OriginalArg(4) Class199 arg3, @OriginalArg(5) Class100 arg4, @OriginalArg(6) int arg5) {
		@Pc(10) byte[][] local10 = this.aByteArrayArrayArray16[arg5];
		@Pc(15) byte[][] local15 = this.aByteArrayArrayArray12[arg5];
		@Pc(20) byte[][] local20 = this.aByteArrayArrayArray11[arg5];
		@Pc(25) byte[][] local25 = this.aByteArrayArrayArray14[arg5];
		for (@Pc(31) int local31 = 0; local31 < this.anInt5127; local31++) {
			@Pc(49) int local49 = local31 >= this.anInt5127 - 1 ? local31 : local31 + 1;
			for (@Pc(51) int local51 = 0; local51 < this.anInt5126; local51++) {
				@Pc(69) int local69 = this.anInt5126 - 1 <= local51 ? local51 : local51 + 1;
				if (Static72.anInt1515 == -1 || Static510.method7565(Static72.anInt1515, local51, arg5, local31)) {
					@Pc(83) boolean local83 = false;
					@Pc(85) boolean local85 = false;
					@Pc(88) boolean[] local88 = new boolean[4];
					@Pc(94) int local94 = local10[local31][local51];
					@Pc(100) int local100 = local15[local31][local51];
					@Pc(108) int local108 = local25[local31][local51] & 0xFF;
					@Pc(116) int local116 = local20[local31][local51] & 0xFF;
					@Pc(124) int local124 = local20[local31][local69] & 0xFF;
					@Pc(132) int local132 = local20[local49][local69] & 0xFF;
					@Pc(140) int local140 = local20[local49][local51] & 0xFF;
					if (local108 != 0 || local116 != 0) {
						@Pc(162) Class283 local162 = local108 == 0 ? null : this.aClass136_2.method3665(local108 - 1);
						@Pc(179) Class76 local179 = local116 == 0 ? null : this.aClass321_3.method7948(local116 - 1);
						if (local94 == 0 && local162 == null) {
							local94 = 12;
						}
						@Pc(190) Class283 local190 = local162;
						if (local162 != null) {
							if (local162.anInt8353 == -1 && local162.anInt8358 == -1) {
								local190 = local162;
								local162 = null;
							} else if (local179 != null && local94 != 0) {
								local85 = local162.aBoolean565;
							}
						}
						@Pc(309) int local309;
						@Pc(324) int local324;
						@Pc(389) int local389;
						@Pc(399) int local399;
						if ((local94 == 0 || local94 == 12) && local31 > 0 && local51 > 0 && local31 < this.anInt5127 && this.anInt5126 > local51) {
							@Pc(267) int local267 = local116 == local20[local49][local69] ? 1 : -1;
							@Pc(286) int local286 = local116 == local20[local49][local51 - 1] ? 1 : -1;
							local309 = local116 == local20[local31 - 1][local51 - 1] ? 1 : -1;
							local324 = local116 == local20[local31 - 1][local69] ? 1 : -1;
							if (local20[local31][local51 - 1] == local116) {
								local286++;
								local309++;
							} else {
								local309--;
								local286--;
							}
							if (local116 == local20[local49][local51]) {
								local286++;
								local267++;
							} else {
								local286--;
								local267--;
							}
							if (local20[local31][local69] == local116) {
								local324++;
								local267++;
							} else {
								local267--;
								local324--;
							}
							if (local116 == local20[local31 - 1][local51]) {
								local309++;
								local324++;
							} else {
								local309--;
								local324--;
							}
							local389 = local309 - local267;
							if (local389 < 0) {
								local389 = -local389;
							}
							local399 = local286 - local324;
							if (local399 < 0) {
								local399 = -local399;
							}
							if (local389 == local399) {
								local389 = arg2.method8532(local31, local51) - arg2.method8532(local49, local69);
								if (local389 < 0) {
									local389 = -local389;
								}
								local399 = arg2.method8532(local49, local51) - arg2.method8532(local31, local69);
								if (local399 < 0) {
									local399 = -local399;
								}
							}
							local100 = local399 > local389 ? 1 : 0;
						}
						for (local309 = 0; local309 < 13; local309++) {
							Static443.anIntArray487[local309] = -1;
							Static624.anIntArray626[local309] = 1;
						}
						@Pc(485) boolean[] local485 = local162 != null && local162.aBoolean565 ? Static83.aBooleanArrayArray1[local94] : Static100.aBooleanArrayArray7[local94];
						this.method4568(local10, local31, local88, local15, local179, local51, arg4, this.anInt5126, local162, local100, local25, local94, this.anInt5127);
						@Pc(518) boolean local518 = local162 != null && local162.anInt8353 != local162.anInt8358;
						if (!local518) {
							for (local324 = 0; local324 < 8; local324++) {
								if (Static443.anIntArray487[local324] >= 0 && Static352.anIntArray410[local324] != Static287.anIntArray535[local324]) {
									local518 = true;
									break;
								}
							}
						}
						if (!local485[local100 + 1 & 0x3]) {
							local88[1] = Static267.method4763(local88[1], (Static624.anIntArray626[4] & Static624.anIntArray626[2]) == 0);
						}
						if (!local485[local100 + 3 & 0x3]) {
							local88[3] = Static267.method4763(local88[3], (Static624.anIntArray626[6] & Static624.anIntArray626[0]) == 0);
						}
						if (!local485[local100 & 0x3]) {
							local88[0] = Static267.method4763(local88[0], (Static624.anIntArray626[2] & Static624.anIntArray626[0]) == 0);
						}
						if (!local485[local100 + 2 & 0x3]) {
							local88[2] = Static267.method4763(local88[2], (Static624.anIntArray626[4] & Static624.anIntArray626[6]) == 0);
						}
						if (!local85 && (local94 == 0 || local94 == 12)) {
							if (local88[0] && !local88[1] && !local88[2] && local88[3]) {
								local100 = 0;
								local94 = local94 == 0 ? 13 : 14;
								local88[0] = local88[3] = false;
							} else if (local88[0] && local88[1] && !local88[2] && !local88[3]) {
								local88[0] = local88[1] = false;
								local94 = local94 == 0 ? 13 : 14;
								local100 = 3;
							} else if (!local88[0] && local88[1] && local88[2] && !local88[3]) {
								local94 = local94 == 0 ? 13 : 14;
								local88[1] = local88[2] = false;
								local100 = 2;
							} else if (!local88[0] && !local88[1] && local88[2] && local88[3]) {
								local100 = 1;
								local94 = local94 == 0 ? 13 : 14;
								local88[2] = local88[3] = false;
							}
						}
						@Pc(826) boolean local826 = !local85 && !local88[0] && !local88[2] && !local88[1] && !local88[3];
						@Pc(828) int[] local828 = null;
						@Pc(834) int[] local834;
						@Pc(854) int[] local854;
						@Pc(858) int[] local858;
						if (local826) {
							local834 = Static585.anIntArrayArray55[local94];
							local399 = local162 == null ? 0 : Static54.anIntArray63[local94];
							local389 = local179 == null ? 0 : Static422.anIntArray469[local94];
							local854 = Static480.anIntArrayArray40[local94];
							local858 = Static362.anIntArrayArray29[local94];
						} else if (local85) {
							local858 = Static44.anIntArrayArray9[local94];
							local854 = Static49.anIntArrayArray11[local94];
							local828 = Static527.anIntArrayArray47[local94];
							local399 = local162 == null ? 0 : Static298.anIntArray402[local94];
							local834 = Static499.anIntArrayArray44[local94];
							local389 = local179 == null ? 0 : Static430.anIntArray479[local94];
						} else {
							local854 = Static510.anIntArrayArray45[local94];
							local834 = Static429.anIntArrayArray35[local94];
							local828 = Static344.anIntArrayArray27[local94];
							local399 = local162 == null ? 0 : Static134.anIntArray168[local94];
							local389 = local179 == null ? 0 : Static71.anIntArray108[local94];
							local858 = Static206.anIntArrayArray14[local94];
						}
						@Pc(931) int local931 = local389 + local399;
						if (local931 <= 0) {
							Static174.method3210(arg5, local31, local51);
						} else {
							if (local88[0]) {
								local931++;
							}
							if (local88[2]) {
								local931++;
							}
							if (local88[1]) {
								local931++;
							}
							if (local88[3]) {
								local931++;
							}
							@Pc(964) int local964 = 0;
							@Pc(966) int local966 = 0;
							@Pc(970) int local970 = local931 * 3;
							@Pc(977) int[] local977 = local518 ? new int[local970] : null;
							@Pc(980) int[] local980 = new int[local970];
							@Pc(983) int[] local983 = new int[local970];
							@Pc(986) int[] local986 = new int[local970];
							@Pc(989) int[] local989 = new int[local970];
							@Pc(992) int[] local992 = new int[local970];
							@Pc(999) int[] local999 = arg0 == null ? null : new int[local970];
							@Pc(1008) int[] local1008 = arg0 == null && arg3 == null ? null : new int[local970];
							@Pc(1010) int local1010 = -1;
							@Pc(1012) int local1012 = -1;
							@Pc(1014) int local1014 = 256;
							@Pc(1076) byte local1076;
							@Pc(1030) int local1030;
							@Pc(1032) int local1032;
							@Pc(1263) int local1263;
							@Pc(1269) int local1269;
							@Pc(1278) int local1278;
							@Pc(1283) int local1283;
							@Pc(1298) int local1298;
							@Pc(1288) int local1288;
							@Pc(1296) int local1296;
							@Pc(1352) int local1352;
							@Pc(1358) int local1358;
							if (local162 != null) {
								local1014 = local162.anInt8367;
								local1012 = local162.anInt8363;
								local1010 = local162.anInt8353;
								local1030 = Static241.method4061(arg4, local162);
								for (local1032 = 0; local1032 < local399; local1032++) {
									if (local88[-local100 & 0x3] && local828[0] == local964) {
										Static153.anIntArray183[0] = local834[local964];
										Static153.anIntArray183[1] = 1;
										Static153.anIntArray183[2] = local858[local964];
										Static153.anIntArray183[3] = 1;
										Static153.anIntArray183[4] = local854[local964];
										local1076 = 6;
										Static153.anIntArray183[5] = local858[local964];
									} else if (local88[2 - local100 & 0x3] && local828[2] == local964) {
										Static153.anIntArray183[0] = local834[local964];
										Static153.anIntArray183[1] = 5;
										Static153.anIntArray183[2] = local858[local964];
										Static153.anIntArray183[3] = 5;
										Static153.anIntArray183[4] = local854[local964];
										local1076 = 6;
										Static153.anIntArray183[5] = local858[local964];
									} else if (local88[1 - local100 & 0x3] && local828[1] == local964) {
										Static153.anIntArray183[0] = local834[local964];
										Static153.anIntArray183[1] = 3;
										Static153.anIntArray183[2] = local858[local964];
										Static153.anIntArray183[3] = 3;
										Static153.anIntArray183[4] = local854[local964];
										local1076 = 6;
										Static153.anIntArray183[5] = local858[local964];
									} else if (local88[3 - local100 & 0x3] && local828[3] == local964) {
										Static153.anIntArray183[0] = local834[local964];
										Static153.anIntArray183[1] = 7;
										Static153.anIntArray183[2] = local858[local964];
										Static153.anIntArray183[3] = 7;
										Static153.anIntArray183[4] = local854[local964];
										Static153.anIntArray183[5] = local858[local964];
										local1076 = 6;
									} else {
										Static153.anIntArray183[0] = local834[local964];
										Static153.anIntArray183[1] = local854[local964];
										local1076 = 3;
										Static153.anIntArray183[2] = local858[local964];
									}
									local964++;
									for (local1263 = 0; local1263 < local1076; local1263++) {
										local1269 = Static153.anIntArray183[local1263];
										local1278 = local1269 - local100 * 2 & 0x7;
										local1283 = this.anIntArray290[local1269];
										local1288 = this.anIntArray291[local1269];
										if (local100 == 1) {
											local1296 = 512 - local1283;
											local1298 = local1288;
										} else if (local100 == 2) {
											local1298 = 512 - local1283;
											local1296 = 512 - local1288;
										} else if (local100 == 3) {
											local1296 = local1283;
											local1298 = 512 - local1288;
										} else {
											local1298 = local1283;
											local1296 = local1288;
										}
										local980[local966] = local1298;
										local983[local966] = local1296;
										if (local999 != null && Static644.aBooleanArrayArray8[local94][local1269]) {
											local1352 = (local31 << 9) + local1298;
											local1358 = local1296 + (local51 << 9);
											local999[local966] = arg0.method8531(local1358, local1352) - arg2.method8531(local1358, local1352);
										}
										if (local1008 != null) {
											if (arg0 != null && !Static644.aBooleanArrayArray8[local94][local1269]) {
												local1352 = local1298 + (local31 << 9);
												local1358 = (local51 << 9) + local1296;
												local1008[local966] = arg2.method8531(local1358, local1352) - arg0.method8531(local1358, local1352);
											} else if (arg3 != null && !Static394.aBooleanArrayArray5[local94][local1269]) {
												local1352 = local1298 + (local31 << 9);
												local1358 = local1296 + (local51 << 9);
												local1008[local966] = arg3.method8531(local1358, local1352) - arg2.method8531(local1358, local1352);
											}
										}
										if (local1269 < 8 && local162.anInt8361 < Static443.anIntArray487[local1278]) {
											if (local977 != null) {
												local977[local966] = Static352.anIntArray410[local1278];
											}
											local992[local966] = Static491.anIntArray528[local1278];
											local989[local966] = Static167.anIntArray208[local1278];
											local986[local966] = Static287.anIntArray535[local1278];
										} else {
											if (local977 != null) {
												local977[local966] = local1030;
											}
											local989[local966] = local162.anInt8363;
											local992[local966] = local162.anInt8367;
											local986[local966] = local1010;
										}
										local966++;
									}
								}
								if (!this.aBoolean353 && arg5 == 0) {
									Static295.method5093(local31, local51, local162.anInt8355, local162.anInt8368 * 8, local162.anInt8370);
								}
								if (local94 != 12 && local162.anInt8353 != -1 && local162.aBoolean566) {
									local83 = true;
								}
							} else if (local826) {
								local964 = Static54.anIntArray63[local94];
							} else if (local85) {
								local964 = Static298.anIntArray402[local94];
							} else {
								local964 = Static134.anIntArray168[local94];
							}
							if (local179 != null) {
								if (local124 == 0) {
									local124 = local116;
								}
								if (local132 == 0) {
									local132 = local116;
								}
								if (local140 == 0) {
									local140 = local116;
								}
								@Pc(1604) Class76 local1604 = this.aClass321_3.method7948(local116 - 1);
								@Pc(1612) Class76 local1612 = this.aClass321_3.method7948(local124 - 1);
								@Pc(1622) Class76 local1622 = this.aClass321_3.method7948(local132 - 1);
								@Pc(1630) Class76 local1630 = this.aClass321_3.method7948(local140 - 1);
								for (local1278 = 0; local1278 < local389; local1278++) {
									if (local88[-local100 & 0x3] && local964 == local828[0]) {
										Static153.anIntArray183[0] = local834[local964];
										Static153.anIntArray183[1] = 1;
										Static153.anIntArray183[2] = local858[local964];
										Static153.anIntArray183[3] = 1;
										Static153.anIntArray183[4] = local854[local964];
										Static153.anIntArray183[5] = local858[local964];
										local1076 = 6;
									} else if (local88[2 - local100 & 0x3] && local828[2] == local964) {
										Static153.anIntArray183[0] = local834[local964];
										Static153.anIntArray183[1] = 5;
										Static153.anIntArray183[2] = local858[local964];
										Static153.anIntArray183[3] = 5;
										Static153.anIntArray183[4] = local854[local964];
										local1076 = 6;
										Static153.anIntArray183[5] = local858[local964];
									} else if (local88[1 - local100 & 0x3] && local828[1] == local964) {
										Static153.anIntArray183[0] = local834[local964];
										Static153.anIntArray183[1] = 3;
										Static153.anIntArray183[2] = local858[local964];
										Static153.anIntArray183[3] = 3;
										Static153.anIntArray183[4] = local854[local964];
										Static153.anIntArray183[5] = local858[local964];
										local1076 = 6;
									} else if (local88[3 - local100 & 0x3] && local964 == local828[3]) {
										Static153.anIntArray183[0] = local834[local964];
										Static153.anIntArray183[1] = 7;
										Static153.anIntArray183[2] = local858[local964];
										Static153.anIntArray183[3] = 7;
										Static153.anIntArray183[4] = local854[local964];
										local1076 = 6;
										Static153.anIntArray183[5] = local858[local964];
									} else {
										Static153.anIntArray183[0] = local834[local964];
										Static153.anIntArray183[1] = local854[local964];
										local1076 = 3;
										Static153.anIntArray183[2] = local858[local964];
									}
									local964++;
									for (local1283 = 0; local1283 < local1076; local1283++) {
										local1298 = Static153.anIntArray183[local1283];
										local1288 = local1298 - local100 * 2 & 0x7;
										local1296 = this.anIntArray290[local1298];
										local1358 = this.anIntArray291[local1298];
										@Pc(1902) int local1902;
										if (local100 == 1) {
											local1902 = 512 - local1296;
											local1352 = local1358;
										} else if (local100 == 2) {
											local1902 = 512 - local1358;
											local1352 = 512 - local1296;
										} else if (local100 == 3) {
											local1352 = 512 - local1358;
											local1902 = local1296;
										} else {
											local1902 = local1358;
											local1352 = local1296;
										}
										local980[local966] = local1352;
										local983[local966] = local1902;
										@Pc(1955) int local1955;
										@Pc(1961) int local1961;
										if (local999 != null && Static644.aBooleanArrayArray8[local94][local1298]) {
											local1955 = (local31 << 9) + local1352;
											local1961 = (local51 << 9) + local1902;
											local999[local966] = arg0.method8531(local1961, local1955) - arg2.method8531(local1961, local1955);
										}
										if (local1008 != null) {
											if (arg0 != null && !Static644.aBooleanArrayArray8[local94][local1298]) {
												local1955 = (local31 << 9) + local1352;
												local1961 = local1902 + (local51 << 9);
												local1008[local966] = arg2.method8531(local1961, local1955) - arg0.method8531(local1961, local1955);
											} else if (arg3 != null && !Static394.aBooleanArrayArray5[local94][local1298]) {
												local1955 = (local31 << 9) + local1352;
												local1961 = (local51 << 9) + local1902;
												local1008[local966] = arg3.method8531(local1961, local1955) - arg2.method8531(local1961, local1955);
											}
										}
										if (local1298 < 8 && Static443.anIntArray487[local1288] >= 0) {
											if (local977 != null) {
												local977[local966] = Static352.anIntArray410[local1288];
											}
											local992[local966] = Static491.anIntArray528[local1288];
											local989[local966] = Static167.anIntArray208[local1288];
											local986[local966] = Static287.anIntArray535[local1288];
										} else {
											if (local85 && Static644.aBooleanArrayArray8[local94][local1298]) {
												local989[local966] = local1012;
												local992[local966] = local1014;
												local986[local966] = local1010;
											} else if (local1352 == 0 && local1902 == 0) {
												local986[local966] = arg1[local31][local51];
												local989[local966] = local1604.anInt2364;
												local992[local966] = local1604.anInt2363;
											} else if (local1352 == 0 && local1902 == 512) {
												local986[local966] = arg1[local31][local69];
												local989[local966] = local1612.anInt2364;
												local992[local966] = local1612.anInt2363;
											} else if (local1352 == 512 && local1902 == 512) {
												local986[local966] = arg1[local49][local69];
												local989[local966] = local1622.anInt2364;
												local992[local966] = local1622.anInt2363;
											} else if (local1352 == 512 && local1902 == 0) {
												local986[local966] = arg1[local49][local51];
												local989[local966] = local1630.anInt2364;
												local992[local966] = local1630.anInt2363;
											} else {
												if (local1352 < 256) {
													if (local1902 >= 256) {
														local989[local966] = local1612.anInt2364;
														local992[local966] = local1612.anInt2363;
													} else {
														local989[local966] = local1604.anInt2364;
														local992[local966] = local1604.anInt2363;
													}
												} else if (local1902 >= 256) {
													local989[local966] = local1622.anInt2364;
													local992[local966] = local1622.anInt2363;
												} else {
													local989[local966] = local1630.anInt2364;
													local992[local966] = local1630.anInt2363;
												}
												local1955 = Static220.method3755(arg1[local49][local51], local1352 << 7 >> 9, arg1[local31][local51]);
												local1961 = Static220.method3755(arg1[local49][local69], local1352 << 7 >> 9, arg1[local31][local69]);
												local986[local966] = Static220.method3755(local1961, local1902 << 7 >> 9, local1955);
											}
											if (local977 != null) {
												local977[local966] = local986[local966];
											}
										}
										local966++;
									}
								}
								if (local94 != 0 && local179.aBoolean173) {
									local83 = true;
								}
							}
							local1030 = arg2.method8532(local31, local51);
							local1032 = arg2.method8532(local49, local51);
							local1263 = arg2.method8532(local49, local69);
							local1269 = arg2.method8532(local31, local69);
							@Pc(2396) boolean local2396 = Static492.method7384(local31, local51);
							if (local2396 && arg5 > 1 || !local2396 && arg5 > 0) {
								@Pc(2412) boolean local2412 = true;
								if (local179 != null && !local179.aBoolean174) {
									local2412 = false;
								} else if (local116 == 0 && local94 != 0) {
									local2412 = false;
								} else if (local108 > 0 && local190 != null && !local190.aBoolean564) {
									local2412 = false;
								}
								if (local2412 && local1032 == local1030 && local1030 == local1263 && local1269 == local1030) {
									this.aByteArrayArrayArray13[arg5][local31][local51] = (byte) (this.aByteArrayArrayArray13[arg5][local31][local51] | 0x4);
								}
							}
							local1283 = 0;
							local1298 = 0;
							local1288 = 0;
							if (this.aBoolean353) {
								local1283 = Static62.method1114(local31, local51);
								local1298 = Static645.method8994(local31, local51);
								local1288 = Static42.method804(local31, local51);
							}
							arg2.U(local31, local51, local980, local999, local983, local1008, local986, local977, local989, local992, local1283, local1298, local1288, local83);
							Static174.method3210(arg5, local31, local51);
						}
					}
				}
			}
		}
	}
}
