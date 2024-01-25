import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oo")
public final class Class249 {

	@OriginalMember(owner = "client!oo", name = "c", descriptor = "[I")
	private int[] anIntArray493;

	@OriginalMember(owner = "client!oo", name = "e", descriptor = "J")
	private long aLong187;

	@OriginalMember(owner = "client!oo", name = "f", descriptor = "[I")
	public int[] anIntArray494;

	@OriginalMember(owner = "client!oo", name = "k", descriptor = "Z")
	public boolean aBoolean550;

	@OriginalMember(owner = "client!oo", name = "m", descriptor = "J")
	private long aLong188;

	@OriginalMember(owner = "client!oo", name = "n", descriptor = "I")
	private int anInt7687;

	@OriginalMember(owner = "client!oo", name = "d", descriptor = "I")
	public int anInt7681 = -1;

	@OriginalMember(owner = "client!oo", name = "a", descriptor = "(Lclient!dd;Lclient!hg;[Lclient!qca;ZLclient!ub;ILclient!hg;IZI[IILclient!oha;ILclient!ha;Lclient!vda;Lclient!lfa;IIILclient!uga;)Lclient!ka;")
	public Class166 method6585(@OriginalArg(0) Interface6 arg0, @OriginalArg(1) Class130 arg1, @OriginalArg(2) Class274[] arg2, @OriginalArg(4) Class336 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class130 arg5, @OriginalArg(7) int arg6, @OriginalArg(9) int arg7, @OriginalArg(10) int[] arg8, @OriginalArg(11) int arg9, @OriginalArg(12) Class245 arg10, @OriginalArg(13) int arg11, @OriginalArg(14) Class20 arg12, @OriginalArg(15) Class355 arg13, @OriginalArg(16) Class193 arg14, @OriginalArg(17) int arg15, @OriginalArg(18) int arg16, @OriginalArg(19) int arg17, @OriginalArg(20) Class340 arg18) {
		if (this.anInt7681 != -1) {
			return arg13.method8744(this.anInt7681).method733(arg4, arg2, arg14, arg1, arg17, arg18, arg16, arg5, arg0, arg12, arg7, arg8, arg6, arg15, arg9, arg11);
		}
		@Pc(39) int local39 = arg9;
		@Pc(42) long local42 = this.aLong188;
		@Pc(45) int[] local45 = this.anIntArray493;
		if (arg5 != null && (arg5.anInt4706 >= 0 || arg5.anInt4710 >= 0)) {
			local45 = new int[12];
			for (@Pc(64) int local64 = 0; local64 < 12; local64++) {
				local45[local64] = this.anIntArray493[local64];
			}
			if (arg5.anInt4706 >= 0) {
				if (arg5.anInt4706 == 65535) {
					local45[5] = 0;
					local42 ^= 0xFFFFFFFF00000000L;
				} else {
					local45[5] = arg5.anInt4706 | 0x40000000;
					local42 ^= (long) local45[5] << 32;
				}
			}
			if (arg5.anInt4710 >= 0) {
				if (arg5.anInt4710 == 65535) {
					local45[3] = 0;
					local42 ^= 0xFFFFFFFFL;
				} else {
					local45[3] = arg5.anInt4710 | 0x40000000;
					local42 ^= local45[3];
				}
			}
		}
		@Pc(148) boolean local148 = false;
		@Pc(150) boolean local150 = false;
		@Pc(152) boolean local152 = false;
		@Pc(160) boolean local160 = arg5 != null || arg1 != null;
		@Pc(167) int local167 = arg2 == null ? 0 : arg2.length;
		@Pc(201) int local201;
		@Pc(206) int local206;
		for (@Pc(169) int local169 = 0; local169 < local167; local169++) {
			Static337.aClass2_Sub6_Sub9Array3[local169] = null;
			if (arg2[local169] != null) {
				@Pc(187) Class130 local187 = arg14.method5573(arg2[local169].anInt8352);
				if (local187.anIntArray237 != null) {
					local160 = true;
					Static28.aClass130Array1[local169] = local187;
					local201 = arg2[local169].anInt8349;
					local206 = arg2[local169].anInt8353;
					@Pc(211) int local211 = local187.anIntArray237[local201];
					Static337.aClass2_Sub6_Sub9Array3[local169] = arg14.method5577(local211 >>> 16);
					@Pc(224) int local224 = local211 & 0xFFFF;
					Static453.anIntArray551[local169] = local224;
					if (Static337.aClass2_Sub6_Sub9Array3[local169] != null) {
						local150 |= Static337.aClass2_Sub6_Sub9Array3[local169].method3992(local224);
						local148 |= Static337.aClass2_Sub6_Sub9Array3[local169].method3991(local224);
						local152 |= Static337.aClass2_Sub6_Sub9Array3[local169].method3987(local224);
					}
					if ((local187.aBoolean346 || Static225.aBoolean373) && local206 != -1 && local187.anIntArray237.length > local206) {
						Static343.anIntArray431[local169] = local187.anIntArray242[local201];
						Static202.anIntArray233[local169] = arg2[local169].anInt8354;
						@Pc(291) int local291 = local187.anIntArray237[local206];
						Static619.aClass2_Sub6_Sub9Array4[local169] = arg14.method5577(local291 >>> 16);
						@Pc(304) int local304 = local291 & 0xFFFF;
						Static515.anIntArray613[local169] = local304;
						if (Static619.aClass2_Sub6_Sub9Array4[local169] != null) {
							local150 |= Static619.aClass2_Sub6_Sub9Array4[local169].method3992(local304);
							local148 |= Static619.aClass2_Sub6_Sub9Array4[local169].method3991(local304);
							local152 |= Static619.aClass2_Sub6_Sub9Array4[local169].method3987(local304);
						}
					} else {
						Static343.anIntArray431[local169] = 0;
						Static202.anIntArray233[local169] = 0;
						Static619.aClass2_Sub6_Sub9Array4[local169] = null;
						Static515.anIntArray613[local169] = -1;
					}
				}
			}
		}
		@Pc(363) int local363 = -1;
		local201 = -1;
		local206 = 0;
		@Pc(369) Class2_Sub6_Sub9 local369 = null;
		@Pc(371) Class2_Sub6_Sub9 local371 = null;
		@Pc(373) int local373 = -1;
		@Pc(375) int local375 = -1;
		@Pc(377) int local377 = 0;
		@Pc(379) Class2_Sub6_Sub9 local379 = null;
		@Pc(381) Class2_Sub6_Sub9 local381 = null;
		if (local160) {
			@Pc(394) int local394;
			@Pc(458) int local458;
			if (arg5 != null) {
				local363 = arg5.anIntArray237[arg16];
				local394 = local363 >>> 16;
				local369 = arg14.method5577(local394);
				local363 &= 0xFFFF;
				if (local369 != null) {
					local150 |= local369.method3992(local363);
					local148 |= local369.method3991(local363);
					local152 |= local369.method3987(local363);
				}
				if ((arg5.aBoolean346 || Static225.aBoolean373) && arg6 != -1 && arg5.anIntArray237.length > arg6) {
					local201 = arg5.anIntArray237[arg6];
					local206 = arg5.anIntArray242[arg16];
					local458 = local201 >>> 16;
					local371 = local458 == local394 ? local369 : arg14.method5577(local458);
					local201 &= 0xFFFF;
					if (local371 != null) {
						local150 |= local371.method3992(local201);
						local148 |= local371.method3991(local201);
						local152 |= local371.method3987(local201);
					}
				}
			}
			local39 = arg9 | 0x20;
			if (arg1 != null) {
				local373 = arg1.anIntArray237[arg15];
				local394 = local373 >>> 16;
				local373 &= 0xFFFF;
				local379 = arg14.method5577(local394);
				if (local379 != null) {
					local150 |= local379.method3992(local373);
					local148 |= local379.method3991(local373);
					local152 |= local379.method3987(local373);
				}
				if ((arg1.aBoolean346 || Static225.aBoolean373) && arg7 != -1 && arg1.anIntArray237.length > arg7) {
					local375 = arg1.anIntArray237[arg7];
					local377 = arg1.anIntArray242[arg15];
					local458 = local375 >>> 16;
					local375 &= 0xFFFF;
					local381 = local394 == local458 ? local379 : arg14.method5577(local458);
					if (local381 != null) {
						local150 |= local381.method3992(local375);
						local148 |= local381.method3991(local375);
						local152 |= local381.method3987(local375);
					}
				}
			}
			if (local150) {
				local39 |= 0x80;
			}
			if (local148) {
				local39 |= 0x100;
			}
			if (local152) {
				local39 |= 0x400;
			}
		}
		@Pc(639) Class169 local639 = Static20.aClass169_4;
		@Pc(647) Class166 local647;
		synchronized (Static20.aClass169_4) {
			local647 = (Class166) Static20.aClass169_4.method5002(local42);
		}
		@Pc(655) Class311 local655 = null;
		if (this.anInt7687 != -1) {
			local655 = arg18.method8512(this.anInt7687);
		}
		@Pc(686) boolean local686;
		@Pc(688) int local688;
		@Pc(694) int local694;
		@Pc(739) int local739;
		@Pc(745) int local745;
		@Pc(818) int local818;
		if (local647 == null || arg12.method7270(local647.ua(), local39) != 0) {
			if (local647 != null) {
				local39 = arg12.method7282(local39, local647.ua());
			}
			local686 = false;
			for (local688 = 0; local688 < 12; local688++) {
				local694 = local45[local688];
				if ((local694 & 0x40000000) == 0) {
					if ((Integer.MIN_VALUE & local694) != 0 && !arg10.method6498(local694 & 0x3FFFFFFF).method4415()) {
						local686 = true;
					}
				} else if (!arg3.method8424(local694 & 0x3FFFFFFF).method7711(this.aBoolean550)) {
					local686 = true;
				}
			}
			if (local686) {
				if (this.aLong187 != -1L) {
					@Pc(1042) Class169 local1042 = Static20.aClass169_4;
					synchronized (Static20.aClass169_4) {
						local647 = (Class166) Static20.aClass169_4.method5002(this.aLong187);
					}
				}
				if (local647 == null || arg12.method7270(local647.ua(), local39) != 0) {
					return null;
				}
			} else {
				@Pc(737) Class32[] local737 = new Class32[12];
				for (local739 = 0; local739 < 12; local739++) {
					local745 = local45[local739];
					@Pc(768) Class32 local768;
					if ((local745 & 0x40000000) != 0) {
						local768 = arg3.method8424(local745 & 0x3FFFFFFF).method7704(this.aBoolean550);
						if (local768 != null) {
							local737[local739] = local768;
						}
					} else if ((Integer.MIN_VALUE & local745) != 0) {
						local768 = arg10.method6498(local745 & 0x3FFFFFFF).method4408();
						if (local768 != null) {
							local737[local739] = local768;
						}
					}
				}
				@Pc(820) int local820;
				if (local655 != null && local655.anIntArrayArray52 != null) {
					for (local745 = 0; local745 < local655.anIntArrayArray52.length; local745++) {
						if (local737[local745] != null) {
							local818 = 0;
							local820 = 0;
							@Pc(822) int local822 = 0;
							@Pc(824) int local824 = 0;
							@Pc(826) int local826 = 0;
							@Pc(828) int local828 = 0;
							if (local655.anIntArrayArray52[local745] != null) {
								local826 = local655.anIntArrayArray52[local745][4] << 3;
								local820 = local655.anIntArrayArray52[local745][1];
								local828 = local655.anIntArrayArray52[local745][5] << 3;
								local818 = local655.anIntArrayArray52[local745][0];
								local824 = local655.anIntArrayArray52[local745][3] << 3;
								local822 = local655.anIntArrayArray52[local745][2];
							}
							if (local824 != 0 || local826 != 0 || local828 != 0) {
								local737[local745].method1607(local826, local828, local824);
							}
							if (local818 != 0 || local820 != 0 || local822 != 0) {
								local737[local745].method1599(local822, local818, local820);
							}
						}
					}
				}
				@Pc(941) Class32 local941 = new Class32(local737, local737.length);
				@Pc(945) int local945 = local39 | 0x4000;
				local647 = arg12.method7228(local941, local945, Static50.anInt1857, 64, 850);
				for (local818 = 0; local818 < 5; local818++) {
					for (local820 = 0; local820 < Static411.aShortArrayArrayArray6.length; local820++) {
						if (this.anIntArray494[local818] < Static411.aShortArrayArrayArray6[local820][local818].length) {
							local647.ia(Static384.aShortArrayArray22[local820][local818], Static411.aShortArrayArrayArray6[local820][local818][this.anIntArray494[local818]]);
						}
					}
				}
				local647.s(local39);
				@Pc(1015) Class169 local1015 = Static20.aClass169_4;
				synchronized (Static20.aClass169_4) {
					Static20.aClass169_4.method5001(local647, local42);
				}
				this.aLong187 = local42;
			}
		}
		@Pc(1073) Class166 local1073 = local647.method6684((byte) 4, local39, true);
		local686 = false;
		if (arg8 != null) {
			for (local688 = 0; local688 < 12; local688++) {
				if (arg8[local688] != -1) {
					local686 = true;
				}
			}
		}
		if (!local160 && !local686) {
			return local1073;
		}
		@Pc(1102) Class30[] local1102 = null;
		if (local655 != null) {
			local1102 = local655.method7835(arg12);
		}
		if (local686 && local1102 != null) {
			for (local694 = 0; local694 < 12; local694++) {
				if (local1102[local694] != null) {
					local1073.method6680(local1102[local694], 0x1 << local694, true);
				}
			}
		}
		local694 = 0;
		local739 = 1;
		while (local694 < local167) {
			if (Static337.aClass2_Sub6_Sub9Array3[local694] != null) {
				local1073.method6673(Static202.anIntArray233[local694] - 1, null, local739, Static453.anIntArray551[local694], Static515.anIntArray613[local694], Static619.aClass2_Sub6_Sub9Array4[local694], Static337.aClass2_Sub6_Sub9Array3[local694], false, Static343.anIntArray431[local694]);
			}
			local739 <<= 0x1;
			local694++;
		}
		if (local686) {
			for (local745 = 0; local745 < 12; local745++) {
				if (arg8[local745] != -1) {
					local818 = arg8[local745] - arg4;
					local818 &= 0x3FFF;
					@Pc(1209) Class30 local1209 = arg12.method7257();
					local1209.method4650(local818);
					local1073.method6680(local1209, 0x1 << local745, false);
				}
			}
		}
		if (local686 && local1102 != null) {
			for (local745 = 0; local745 < 12; local745++) {
				if (local1102[local745] != null) {
					local1073.method6680(local1102[local745], 0x1 << local745, false);
				}
			}
		}
		if (local369 != null && local379 != null) {
			local1073.method6695(local371, local206, local377, local379, local363, local373, arg11 - 1, local369, false, local201, local381, arg17 - 1, arg5.aBooleanArray11, local375);
		} else if (local369 != null) {
			local1073.method6687(local363, local206, local371, 0, local369, false, local201, arg11 - 1);
		} else if (local379 != null) {
			local1073.method6687(local373, local377, local381, 0, local379, false, local375, arg17 - 1);
		}
		for (local745 = 0; local745 < local167; local745++) {
			Static337.aClass2_Sub6_Sub9Array3[local745] = null;
			Static619.aClass2_Sub6_Sub9Array4[local745] = null;
			Static28.aClass130Array1[local745] = null;
		}
		return local1073;
	}

	@OriginalMember(owner = "client!oo", name = "a", descriptor = "(BIILclient!ub;)V")
	public void method6586(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class336 arg2) {
		if (arg1 == -1) {
			this.anIntArray493[arg0] = 0;
		} else if (arg2.method8424(arg1) != null) {
			this.anIntArray493[arg0] = arg1 | 0x40000000;
			this.method6593();
		}
	}

	@OriginalMember(owner = "client!oo", name = "a", descriptor = "(III[IZ[I)V")
	public void method6587(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int[] arg4) {
		if (this.anInt7687 != arg1) {
			this.anInt7687 = arg1;
		}
		this.anIntArray493 = arg2;
		this.anIntArray494 = arg4;
		this.anInt7681 = arg0;
		this.aBoolean550 = arg3;
		this.method6593();
	}

	@OriginalMember(owner = "client!oo", name = "a", descriptor = "(BZ)V")
	public void method6588(@OriginalArg(1) boolean arg0) {
		this.aBoolean550 = arg0;
		this.method6593();
	}

	@OriginalMember(owner = "client!oo", name = "a", descriptor = "(Lclient!ub;ILclient!lfa;Lclient!oha;Lclient!dd;Lclient!vda;IIILclient!hg;ILclient!ha;)Lclient!ka;")
	public Class166 method6589(@OriginalArg(0) Class336 arg0, @OriginalArg(2) Class193 arg1, @OriginalArg(3) Class245 arg2, @OriginalArg(4) Interface6 arg3, @OriginalArg(5) Class355 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(9) Class130 arg7, @OriginalArg(10) int arg8, @OriginalArg(11) Class20 arg9) {
		if (this.anInt7681 != -1) {
			return arg4.method8744(this.anInt7681).method736(arg3, arg9, arg8, arg6, arg7, arg1, arg5);
		}
		@Pc(28) int local28 = 2048;
		@Pc(36) boolean local36;
		@Pc(55) int local55;
		@Pc(114) int local114;
		@Pc(59) int local59;
		@Pc(118) int local118;
		if (arg7 != null) {
			@Pc(32) boolean local32 = false;
			@Pc(34) boolean local34 = false;
			local36 = false;
			@Pc(38) boolean local38 = false;
			local28 = 2080;
			local55 = arg7.anIntArray237[arg5];
			local59 = local55 >>> 16;
			@Pc(63) int local63 = local55 & 0xFFFF;
			@Pc(68) Class2_Sub6_Sub9 local68 = arg1.method5577(local59);
			if (local68 != null) {
				local34 = local68.method3992(local63) | false;
				local32 = local68.method3991(local63) | false;
				local38 = local68.method3987(local63) | false;
				local36 = arg7.aBoolean347 | false;
			}
			if ((arg7.aBoolean346 || Static225.aBoolean373) && arg6 != -1 && arg6 < arg7.anIntArray237.length) {
				local114 = arg7.anIntArray237[arg6];
				local118 = local114 >>> 16;
				@Pc(134) Class2_Sub6_Sub9 local134 = local59 == local118 ? local68 : arg1.method5577(local118);
				@Pc(138) int local138 = local114 & 0xFFFF;
				if (local134 != null) {
					local34 |= local134.method3992(local138);
					local32 |= local134.method3991(local138);
					local38 |= local134.method3987(local138);
				}
			}
			if (local34) {
				local28 = 2208;
			}
			if (local32) {
				local28 |= 0x100;
			}
			if (local36) {
				local28 |= 0x200;
			}
			if (local38) {
				local28 |= 0x400;
			}
		}
		@Pc(193) Class169 local193 = Static378.aClass169_18;
		@Pc(204) Class166 local204;
		synchronized (Static378.aClass169_18) {
			local204 = (Class166) Static378.aClass169_18.method5002(this.aLong188);
		}
		if (local204 == null || arg9.method7270(local204.ua(), local28) != 0) {
			if (local204 != null) {
				local28 = arg9.method7282(local28, local204.ua());
			}
			local36 = false;
			for (@Pc(235) int local235 = 0; local235 < 12; local235++) {
				local55 = this.anIntArray493[local235];
				if ((local55 & 0x40000000) == 0) {
					if ((Integer.MIN_VALUE & local55) != 0 && !arg2.method6498(local55 & 0x3FFFFFFF).method4409()) {
						local36 = true;
					}
				} else if (!arg0.method8424(local55 & 0x3FFFFFFF).method7701(this.aBoolean550)) {
					local36 = true;
				}
			}
			if (local36) {
				return null;
			}
			@Pc(295) Class32[] local295 = new Class32[12];
			local114 = 0;
			for (@Pc(299) int local299 = 0; local299 < 12; local299++) {
				@Pc(306) int local306 = this.anIntArray493[local299];
				@Pc(326) Class32 local326;
				if ((local306 & 0x40000000) != 0) {
					local326 = arg0.method8424(local306 & 0x3FFFFFFF).method7700(this.aBoolean550);
					if (local326 != null) {
						local295[local114++] = local326;
					}
				} else if ((local306 & Integer.MIN_VALUE) != 0) {
					local326 = arg2.method6498(local306 & 0x3FFFFFFF).method4410();
					if (local326 != null) {
						local295[local114++] = local326;
					}
				}
			}
			@Pc(363) int local363 = local28 | 0x4000;
			@Pc(369) Class32 local369 = new Class32(local295, local114);
			local204 = arg9.method7228(local369, local363, Static50.anInt1857, 64, 768);
			for (local59 = 0; local59 < 5; local59++) {
				for (local118 = 0; local118 < Static411.aShortArrayArrayArray6.length; local118++) {
					if (Static411.aShortArrayArrayArray6[local118][local59].length > this.anIntArray494[local59]) {
						local204.ia(Static384.aShortArrayArray22[local118][local59], Static411.aShortArrayArrayArray6[local118][local59][this.anIntArray494[local59]]);
					}
				}
			}
			local204.s(local28);
			@Pc(433) Class169 local433 = Static378.aClass169_18;
			synchronized (Static378.aClass169_18) {
				Static378.aClass169_18.method5001(local204, this.aLong188);
			}
		}
		if (arg7 == null) {
			return local204;
		} else {
			local204.method6684((byte) 4, local28, true);
			return arg7.method4099(local204, arg6, arg8, 2048, arg5);
		}
	}

	@OriginalMember(owner = "client!oo", name = "a", descriptor = "(III)V")
	public void method6590(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray494[arg0] = arg1;
		this.method6593();
	}

	@OriginalMember(owner = "client!oo", name = "a", descriptor = "(IIIILclient!lfa;Lclient!oha;IIILclient!ha;ILclient!hg;)Lclient!ka;")
	public Class166 method6591(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class193 arg3, @OriginalArg(5) Class245 arg4, @OriginalArg(7) int arg5, @OriginalArg(8) int arg6, @OriginalArg(9) Class20 arg7, @OriginalArg(10) int arg8, @OriginalArg(11) Class130 arg9) {
		@Pc(7) int local7 = 2048;
		@Pc(95) int local95;
		@Pc(38) int local38;
		if (arg9 != null) {
			@Pc(11) boolean local11 = false;
			@Pc(13) boolean local13 = false;
			@Pc(15) boolean local15 = false;
			@Pc(17) boolean local17 = false;
			local7 = 2080;
			@Pc(34) int local34 = arg9.anIntArray237[arg8];
			local38 = local34 >>> 16;
			@Pc(43) Class2_Sub6_Sub9 local43 = arg3.method5577(local38);
			@Pc(47) int local47 = local34 & 0xFFFF;
			if (local43 != null) {
				local13 = local43.method3992(local47) | false;
				local11 = local43.method3991(local47) | false;
				local17 = local43.method3987(local47) | false;
				local15 = arg9.aBoolean347 | false;
			}
			if ((arg9.aBoolean346 || Static225.aBoolean373) && arg0 != -1 && arg0 < arg9.anIntArray237.length) {
				local95 = arg9.anIntArray237[arg0];
				@Pc(99) int local99 = local95 >>> 16;
				@Pc(103) int local103 = local95 & 0xFFFF;
				@Pc(117) Class2_Sub6_Sub9 local117;
				if (local99 == local38) {
					local117 = local43;
				} else {
					local117 = arg3.method5577(local103 >>> 16);
				}
				if (local117 != null) {
					local13 |= local117.method3992(local103);
					local11 |= local117.method3991(local103);
					local17 |= local117.method3987(local103);
				}
			}
			if (local13) {
				local7 = 2208;
			}
			if (local11) {
				local7 |= 0x100;
			}
			if (local15) {
				local7 |= 0x200;
			}
			if (local17) {
				local7 |= 0x400;
			}
		}
		@Pc(180) long local180 = (long) arg5 | (long) (arg2 << 16) | (long) arg1 << 32;
		@Pc(182) Class169 local182 = Static378.aClass169_18;
		@Pc(192) Class166 local192;
		synchronized (Static378.aClass169_18) {
			local192 = (Class166) Static378.aClass169_18.method5002(local180);
		}
		if (local192 == null || arg7.method7270(local192.ua(), local7) != 0) {
			if (local192 != null) {
				local7 = arg7.method7282(local7, local192.ua());
			}
			@Pc(219) Class32[] local219 = new Class32[3];
			local95 = 0;
			if (!arg4.method6498(arg5).method4409() || !arg4.method6498(arg2).method4409() || !arg4.method6498(arg1).method4409()) {
				return null;
			}
			@Pc(251) Class32 local251 = arg4.method6498(arg5).method4410();
			if (local251 != null) {
				local95++;
				local219[0] = local251;
			}
			local251 = arg4.method6498(arg2).method4410();
			if (local251 != null) {
				local219[local95++] = local251;
			}
			local251 = arg4.method6498(arg1).method4410();
			if (local251 != null) {
				local219[local95++] = local251;
			}
			local251 = new Class32(local219, local95);
			@Pc(296) int local296 = local7 | 0x4000;
			local192 = arg7.method7228(local251, local296, Static50.anInt1857, 64, 768);
			for (@Pc(306) int local306 = 0; local306 < 5; local306++) {
				for (local38 = 0; local38 < Static411.aShortArrayArrayArray6.length; local38++) {
					if (Static411.aShortArrayArrayArray6[local38][local306].length > this.anIntArray494[local306]) {
						local192.ia(Static384.aShortArrayArray22[local38][local306], Static411.aShortArrayArrayArray6[local38][local306][this.anIntArray494[local306]]);
					}
				}
			}
			local192.s(local7);
			@Pc(364) Class169 local364 = Static378.aClass169_18;
			synchronized (Static378.aClass169_18) {
				Static378.aClass169_18.method5001(local192, local180);
			}
		}
		if (arg9 == null) {
			return local192;
		} else {
			local192 = local192.method6684((byte) 4, local7, true);
			return arg9.method4099(local192, arg0, arg6, 2048, arg8);
		}
	}

	@OriginalMember(owner = "client!oo", name = "a", descriptor = "(Lclient!oha;III)V")
	public void method6592(@OriginalArg(0) Class245 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = Static601.anIntArray682[arg2];
		if (arg0.method6498(arg1) != null) {
			this.anIntArray493[local7] = arg1 | Integer.MIN_VALUE;
			this.method6593();
		}
	}

	@OriginalMember(owner = "client!oo", name = "a", descriptor = "(I)V")
	private void method6593() {
		this.aLong188 = -1L;
		@Pc(10) long[] local10 = Class2_Sub3_Sub28.aLongArray17;
		this.aLong188 = local10[(int) (((long) (this.anInt7687 >> 8) ^ this.aLong188) & 0xFFL)] ^ this.aLong188 >>> 8;
		this.aLong188 = this.aLong188 >>> 8 ^ local10[(int) (((long) this.anInt7687 ^ this.aLong188) & 0xFFL)];
		for (@Pc(56) int local56 = 0; local56 < 12; local56++) {
			this.aLong188 = this.aLong188 >>> 8 ^ local10[(int) (((long) (this.anIntArray493[local56] >> 24) ^ this.aLong188) & 0xFFL)];
			this.aLong188 = local10[(int) (((long) (this.anIntArray493[local56] >> 16) ^ this.aLong188) & 0xFFL)] ^ this.aLong188 >>> 8;
			this.aLong188 = this.aLong188 >>> 8 ^ local10[(int) ((this.aLong188 ^ (long) (this.anIntArray493[local56] >> 8)) & 0xFFL)];
			this.aLong188 = local10[(int) ((this.aLong188 ^ (long) this.anIntArray493[local56]) & 0xFFL)] ^ this.aLong188 >>> 8;
		}
		for (@Pc(150) int local150 = 0; local150 < 5; local150++) {
			this.aLong188 = local10[(int) ((this.aLong188 ^ (long) this.anIntArray494[local150]) & 0xFFL)] ^ this.aLong188 >>> 8;
		}
		this.aLong188 = this.aLong188 >>> 8 ^ local10[(int) ((this.aLong188 ^ (long) (this.aBoolean550 ? 1 : 0)) & 0xFFL)];
	}
}
