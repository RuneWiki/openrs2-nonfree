import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nk")
public final class Class248 {

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "Z")
	public boolean aBoolean447;

	@OriginalMember(owner = "client!nk", name = "e", descriptor = "[I")
	public int[] anIntArray344;

	@OriginalMember(owner = "client!nk", name = "i", descriptor = "J")
	private long aLong153;

	@OriginalMember(owner = "client!nk", name = "l", descriptor = "J")
	private long aLong154;

	@OriginalMember(owner = "client!nk", name = "q", descriptor = "[I")
	private int[] anIntArray346;

	@OriginalMember(owner = "client!nk", name = "s", descriptor = "I")
	private int anInt6247;

	@OriginalMember(owner = "client!nk", name = "v", descriptor = "I")
	public int anInt6248 = -1;

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(BZ)V")
	public void method5527(@OriginalArg(1) boolean arg0) {
		this.aBoolean447 = arg0;
		this.method5533();
	}

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(III)V")
	public void method5529(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anIntArray344[arg1] = arg0;
		this.method5533();
	}

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(IILclient!pp;I)V")
	public void method5530(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class275 arg2) {
		if (arg1 == -1) {
			this.anIntArray346[arg0] = 0;
		} else if (arg2.method6641(arg1) != null) {
			this.anIntArray346[arg0] = arg1 | 0x40000000;
			this.method5533();
		}
	}

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(Lclient!ns;IIZ)V")
	public void method5531(@OriginalArg(0) Class252 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) int local7 = Static580.anIntArray552[arg2];
		if (arg0.method5617(arg1) != null) {
			this.anIntArray346[local7] = arg1 | Integer.MIN_VALUE;
			this.method5533();
		}
	}

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(IBLclient!rca;ILclient!vga;ILclient!ha;Lclient!ns;ILclient!ek;Lclient!pp;Lclient!ko;)Lclient!ka;")
	public Class187 method5532(@OriginalArg(2) Class298 arg0, @OriginalArg(3) int arg1, @OriginalArg(4) Class362 arg2, @OriginalArg(5) int arg3, @OriginalArg(6) Class133 arg4, @OriginalArg(7) Class252 arg5, @OriginalArg(8) int arg6, @OriginalArg(9) Class92 arg7, @OriginalArg(10) Class275 arg8, @OriginalArg(11) Interface12 arg9) {
		if (this.anInt6248 != -1) {
			return arg7.method1914(this.anInt6248).method4993(arg1, arg2, arg9, arg4, arg0, arg3, arg6);
		}
		@Pc(28) int local28 = 2048;
		@Pc(36) boolean local36;
		@Pc(49) int local49;
		@Pc(122) int local122;
		@Pc(59) int local59;
		@Pc(126) int local126;
		if (arg2 != null) {
			@Pc(32) boolean local32 = false;
			@Pc(34) boolean local34 = false;
			local36 = false;
			@Pc(38) boolean local38 = false;
			local49 = arg2.anIntArray571[arg6];
			local28 = 2080;
			local59 = local49 >>> 16;
			@Pc(63) int local63 = local49 & 0xFFFF;
			@Pc(68) Class5_Sub5_Sub12 local68 = arg0.method7026(local59);
			if (local68 != null) {
				local34 = local68.method4852(local63) | false;
				local32 = local68.method4850(local63) | false;
				local38 = local68.method4848(local63) | false;
				local36 = arg2.aBoolean719 | false;
			}
			if ((arg2.aBoolean718 || Static23.aBoolean14) && arg3 != -1 && arg2.anIntArray571.length > arg3) {
				local122 = arg2.anIntArray571[arg3];
				local126 = local122 >>> 16;
				@Pc(130) int local130 = local122 & 0xFFFF;
				@Pc(140) Class5_Sub5_Sub12 local140 = local126 == local59 ? local68 : arg0.method7026(local126);
				if (local140 != null) {
					local34 |= local140.method4852(local130);
					local32 |= local140.method4850(local130);
					local38 |= local140.method4848(local130);
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
		@Pc(189) Class87 local189 = Static163.aClass87_242;
		@Pc(204) Class187 local204;
		synchronized (Static163.aClass87_242) {
			local204 = (Class187) Static163.aClass87_242.method1805(this.aLong154);
		}
		if (local204 == null || arg4.method7296(local204.ua(), local28) != 0) {
			if (local204 != null) {
				local28 = arg4.method7292(local28, local204.ua());
			}
			local36 = false;
			for (@Pc(232) int local232 = 0; local232 < 12; local232++) {
				local49 = this.anIntArray346[local232];
				if ((local49 & 0x40000000) == 0) {
					if ((Integer.MIN_VALUE & local49) != 0 && !arg5.method5617(local49 & 0x3FFFFFFF).method2786()) {
						local36 = true;
					}
				} else if (!arg8.method6641(local49 & 0x3FFFFFFF).method5850(this.aBoolean447)) {
					local36 = true;
				}
			}
			if (local36) {
				return null;
			}
			@Pc(291) Class26[] local291 = new Class26[12];
			local122 = 0;
			for (@Pc(295) int local295 = 0; local295 < 12; local295++) {
				@Pc(302) int local302 = this.anIntArray346[local295];
				@Pc(325) Class26 local325;
				if ((local302 & 0x40000000) != 0) {
					local325 = arg8.method6641(local302 & 0x3FFFFFFF).method5857(this.aBoolean447);
					if (local325 != null) {
						local291[local122++] = local325;
					}
				} else if ((local302 & Integer.MIN_VALUE) != 0) {
					local325 = arg5.method5617(local302 & 0x3FFFFFFF).method2787();
					if (local325 != null) {
						local291[local122++] = local325;
					}
				}
			}
			@Pc(364) int local364 = local28 | 0x4000;
			@Pc(370) Class26 local370 = new Class26(local291, local122);
			local204 = arg4.method7256(local370, local364, Static555.anInt9375, 64, 768);
			for (local59 = 0; local59 < 5; local59++) {
				for (local126 = 0; local126 < Static597.aShortArrayArrayArray9.length; local126++) {
					if (Static597.aShortArrayArrayArray9[local126][local59].length > this.anIntArray344[local59]) {
						local204.ia(Static340.aShortArrayArray24[local126][local59], Static597.aShortArrayArrayArray9[local126][local59][this.anIntArray344[local59]]);
					}
				}
			}
			local204.s(local28);
			@Pc(432) Class87 local432 = Static163.aClass87_242;
			synchronized (Static163.aClass87_242) {
				Static163.aClass87_242.method1792(this.aLong154, local204);
			}
		}
		if (arg2 == null) {
			return local204;
		} else {
			local204.method8656((byte) 4, local28, true);
			return arg2.method8556(2048, local204, arg6, arg1, arg3);
		}
	}

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(B)V")
	private void method5533() {
		this.aLong154 = -1L;
		@Pc(10) long[] local10 = Class5_Sub40.aLongArray12;
		this.aLong154 = this.aLong154 >>> 8 ^ local10[(int) ((this.aLong154 ^ (long) (this.anInt6247 >> 8)) & 0xFFL)];
		this.aLong154 = this.aLong154 >>> 8 ^ local10[(int) (((long) this.anInt6247 ^ this.aLong154) & 0xFFL)];
		for (@Pc(50) int local50 = 0; local50 < 12; local50++) {
			this.aLong154 = local10[(int) (((long) (this.anIntArray346[local50] >> 24) ^ this.aLong154) & 0xFFL)] ^ this.aLong154 >>> 8;
			this.aLong154 = this.aLong154 >>> 8 ^ local10[(int) ((this.aLong154 ^ (long) (this.anIntArray346[local50] >> 16)) & 0xFFL)];
			this.aLong154 = this.aLong154 >>> 8 ^ local10[(int) (((long) (this.anIntArray346[local50] >> 8) ^ this.aLong154) & 0xFFL)];
			this.aLong154 = local10[(int) (((long) this.anIntArray346[local50] ^ this.aLong154) & 0xFFL)] ^ this.aLong154 >>> 8;
		}
		for (@Pc(150) int local150 = 0; local150 < 5; local150++) {
			this.aLong154 = this.aLong154 >>> 8 ^ local10[(int) (((long) this.anIntArray344[local150] ^ this.aLong154) & 0xFFL)];
		}
		this.aLong154 = local10[(int) ((this.aLong154 ^ (long) (this.aBoolean447 ? 1 : 0)) & 0xFFL)] ^ this.aLong154 >>> 8;
	}

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(I[II[IIZ)V")
	public void method5535(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(5) boolean arg4) {
		this.anInt6248 = arg2;
		this.aBoolean447 = arg4;
		this.anIntArray344 = arg1;
		if (this.anInt6247 != arg0) {
			this.anInt6247 = arg0;
		}
		this.anIntArray346 = arg3;
		this.method5533();
	}

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(IZLclient!ns;ILclient!ha;IIILclient!vga;IILclient!rca;)Lclient!ka;")
	public Class187 method5537(@OriginalArg(0) int arg0, @OriginalArg(2) Class252 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class133 arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5, @OriginalArg(8) Class362 arg6, @OriginalArg(9) int arg7, @OriginalArg(10) int arg8, @OriginalArg(11) Class298 arg9) {
		@Pc(7) int local7 = 2048;
		@Pc(97) int local97;
		@Pc(38) int local38;
		if (arg6 != null) {
			@Pc(11) boolean local11 = false;
			@Pc(13) boolean local13 = false;
			@Pc(15) boolean local15 = false;
			@Pc(17) boolean local17 = false;
			local7 = 2080;
			@Pc(34) int local34 = arg6.anIntArray571[arg2];
			local38 = local34 >>> 16;
			@Pc(43) Class5_Sub5_Sub12 local43 = arg9.method7026(local38);
			@Pc(47) int local47 = local34 & 0xFFFF;
			if (local43 != null) {
				local13 = local43.method4852(local47) | false;
				local11 = local43.method4850(local47) | false;
				local17 = local43.method4848(local47) | false;
				local15 = arg6.aBoolean719 | false;
			}
			if ((arg6.aBoolean718 || Static23.aBoolean14) && arg8 != -1 && arg8 < arg6.anIntArray571.length) {
				local97 = arg6.anIntArray571[arg8];
				@Pc(101) int local101 = local97 >>> 16;
				@Pc(105) int local105 = local97 & 0xFFFF;
				@Pc(119) Class5_Sub5_Sub12 local119;
				if (local38 == local101) {
					local119 = local43;
				} else {
					local119 = arg9.method7026(local105 >>> 16);
				}
				if (local119 != null) {
					local13 |= local119.method4852(local105);
					local11 |= local119.method4850(local105);
					local17 |= local119.method4848(local105);
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
		@Pc(182) long local182 = (long) (arg4 << 16) | (long) arg7 << 32 | (long) arg0;
		@Pc(184) Class87 local184 = Static163.aClass87_242;
		@Pc(192) Class187 local192;
		synchronized (Static163.aClass87_242) {
			local192 = (Class187) Static163.aClass87_242.method1805(local182);
		}
		if (local192 == null || arg3.method7296(local192.ua(), local7) != 0) {
			if (local192 != null) {
				local7 = arg3.method7292(local7, local192.ua());
			}
			@Pc(222) Class26[] local222 = new Class26[3];
			local97 = 0;
			if (!arg1.method5617(arg0).method2786() || !arg1.method5617(arg4).method2786() || !arg1.method5617(arg7).method2786()) {
				return null;
			}
			@Pc(252) Class26 local252 = arg1.method5617(arg0).method2787();
			if (local252 != null) {
				local97++;
				local222[0] = local252;
			}
			local252 = arg1.method5617(arg4).method2787();
			if (local252 != null) {
				local222[local97++] = local252;
			}
			local252 = arg1.method5617(arg7).method2787();
			if (local252 != null) {
				local222[local97++] = local252;
			}
			local252 = new Class26(local222, local97);
			@Pc(297) int local297 = local7 | 0x4000;
			local192 = arg3.method7256(local252, local297, Static555.anInt9375, 64, 768);
			for (@Pc(307) int local307 = 0; local307 < 5; local307++) {
				for (local38 = 0; local38 < Static597.aShortArrayArrayArray9.length; local38++) {
					if (this.anIntArray344[local307] < Static597.aShortArrayArrayArray9[local38][local307].length) {
						local192.ia(Static340.aShortArrayArray24[local38][local307], Static597.aShortArrayArrayArray9[local38][local307][this.anIntArray344[local307]]);
					}
				}
			}
			local192.s(local7);
			@Pc(359) Class87 local359 = Static163.aClass87_242;
			synchronized (Static163.aClass87_242) {
				Static163.aClass87_242.method1792(local182, local192);
			}
		}
		if (arg6 == null) {
			return local192;
		} else {
			local192 = local192.method8656((byte) 4, local7, true);
			return arg6.method8556(2048, local192, arg2, arg5, arg8);
		}
	}

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(Lclient!vga;Lclient!ha;Lclient!ns;ILclient!ko;IILclient!ek;I[Lclient!mca;ILclient!rca;Lclient!pp;ZI[IILclient!vga;IILclient!mu;)Lclient!ka;")
	public Class187 method5538(@OriginalArg(0) Class362 arg0, @OriginalArg(1) Class133 arg1, @OriginalArg(2) Class252 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Interface12 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) Class92 arg7, @OriginalArg(8) int arg8, @OriginalArg(9) Class228[] arg9, @OriginalArg(10) int arg10, @OriginalArg(11) Class298 arg11, @OriginalArg(12) Class275 arg12, @OriginalArg(14) int arg13, @OriginalArg(15) int[] arg14, @OriginalArg(17) Class362 arg15, @OriginalArg(18) int arg16, @OriginalArg(19) int arg17, @OriginalArg(20) Class238 arg18) {
		if (this.anInt6248 != -1) {
			return arg7.method1914(this.anInt6248).method4992(arg4, arg18, arg14, arg3, arg5, arg16, arg17, arg15, arg11, arg0, arg6, arg8, arg9, arg13, arg1, arg10);
		}
		@Pc(36) int local36 = arg5;
		@Pc(39) long local39 = this.aLong154;
		@Pc(42) int[] local42 = this.anIntArray346;
		if (arg15 != null && (arg15.anInt10007 >= 0 || arg15.anInt10009 >= 0)) {
			local42 = new int[12];
			for (@Pc(55) int local55 = 0; local55 < 12; local55++) {
				local42[local55] = this.anIntArray346[local55];
			}
			if (arg15.anInt10007 >= 0) {
				if (arg15.anInt10007 == 65535) {
					local39 ^= 0xFFFFFFFF00000000L;
					local42[5] = 0;
				} else {
					local42[5] = arg15.anInt10007 | 0x40000000;
					local39 ^= (long) local42[5] << 32;
				}
			}
			if (arg15.anInt10009 >= 0) {
				if (arg15.anInt10009 == 65535) {
					local42[3] = 0;
					local39 ^= 0xFFFFFFFFL;
				} else {
					local42[3] = arg15.anInt10009 | 0x40000000;
					local39 ^= local42[3];
				}
			}
		}
		@Pc(142) boolean local142 = false;
		@Pc(144) boolean local144 = false;
		@Pc(146) boolean local146 = false;
		@Pc(154) boolean local154 = arg15 != null || arg0 != null;
		@Pc(161) int local161 = arg9 == null ? 0 : arg9.length;
		@Pc(195) int local195;
		@Pc(200) int local200;
		for (@Pc(163) int local163 = 0; local163 < local161; local163++) {
			Static588.aClass5_Sub5_Sub12Array4[local163] = null;
			if (arg9[local163] != null) {
				@Pc(181) Class362 local181 = arg11.method7034(arg9[local163].anInt5659);
				if (local181.anIntArray571 != null) {
					local154 = true;
					Static212.aClass362Array1[local163] = local181;
					local195 = arg9[local163].anInt5664;
					local200 = arg9[local163].anInt5663;
					@Pc(205) int local205 = local181.anIntArray571[local195];
					Static588.aClass5_Sub5_Sub12Array4[local163] = arg11.method7026(local205 >>> 16);
					@Pc(218) int local218 = local205 & 0xFFFF;
					Static533.anIntArray501[local163] = local218;
					if (Static588.aClass5_Sub5_Sub12Array4[local163] != null) {
						local144 |= Static588.aClass5_Sub5_Sub12Array4[local163].method4852(local218);
						local142 |= Static588.aClass5_Sub5_Sub12Array4[local163].method4850(local218);
						local146 |= Static588.aClass5_Sub5_Sub12Array4[local163].method4848(local218);
					}
					if ((local181.aBoolean718 || Static23.aBoolean14) && local200 != -1 && local200 < local181.anIntArray571.length) {
						Static260.anIntArray234[local163] = local181.anIntArray573[local195];
						Static452.anIntArray413[local163] = arg9[local163].anInt5665;
						@Pc(289) int local289 = local181.anIntArray571[local200];
						Static541.aClass5_Sub5_Sub12Array3[local163] = arg11.method7026(local289 >>> 16);
						@Pc(302) int local302 = local289 & 0xFFFF;
						Static66.anIntArray98[local163] = local302;
						if (Static541.aClass5_Sub5_Sub12Array3[local163] != null) {
							local144 |= Static541.aClass5_Sub5_Sub12Array3[local163].method4852(local302);
							local142 |= Static541.aClass5_Sub5_Sub12Array3[local163].method4850(local302);
							local146 |= Static541.aClass5_Sub5_Sub12Array3[local163].method4848(local302);
						}
					} else {
						Static260.anIntArray234[local163] = 0;
						Static452.anIntArray413[local163] = 0;
						Static541.aClass5_Sub5_Sub12Array3[local163] = null;
						Static66.anIntArray98[local163] = -1;
					}
				}
			}
		}
		@Pc(365) int local365 = -1;
		local195 = -1;
		local200 = 0;
		@Pc(371) Class5_Sub5_Sub12 local371 = null;
		@Pc(373) Class5_Sub5_Sub12 local373 = null;
		@Pc(375) int local375 = -1;
		@Pc(377) int local377 = -1;
		@Pc(379) int local379 = 0;
		@Pc(381) Class5_Sub5_Sub12 local381 = null;
		@Pc(383) Class5_Sub5_Sub12 local383 = null;
		if (local154) {
			local36 = arg5 | 0x20;
			@Pc(400) int local400;
			@Pc(463) int local463;
			if (arg15 != null) {
				local365 = arg15.anIntArray571[arg17];
				local400 = local365 >>> 16;
				local365 &= 0xFFFF;
				local371 = arg11.method7026(local400);
				if (local371 != null) {
					local144 |= local371.method4852(local365);
					local142 |= local371.method4850(local365);
					local146 |= local371.method4848(local365);
				}
				if ((arg15.aBoolean718 || Static23.aBoolean14) && arg8 != -1 && arg15.anIntArray571.length > arg8) {
					local200 = arg15.anIntArray573[arg17];
					local195 = arg15.anIntArray571[arg8];
					local463 = local195 >>> 16;
					local373 = local463 == local400 ? local371 : arg11.method7026(local463);
					local195 &= 0xFFFF;
					if (local373 != null) {
						local144 |= local373.method4852(local195);
						local142 |= local373.method4850(local195);
						local146 |= local373.method4848(local195);
					}
				}
			}
			if (arg0 != null) {
				local375 = arg0.anIntArray571[arg13];
				local400 = local375 >>> 16;
				local381 = arg11.method7026(local400);
				local375 &= 0xFFFF;
				if (local381 != null) {
					local144 |= local381.method4852(local375);
					local142 |= local381.method4850(local375);
					local146 |= local381.method4848(local375);
				}
				if ((arg0.aBoolean718 || Static23.aBoolean14) && arg6 != -1 && arg0.anIntArray571.length > arg6) {
					local379 = arg0.anIntArray573[arg13];
					local377 = arg0.anIntArray571[arg6];
					local463 = local377 >>> 16;
					local377 &= 0xFFFF;
					local383 = local463 == local400 ? local381 : arg11.method7026(local463);
					if (local383 != null) {
						local144 |= local383.method4852(local377);
						local142 |= local383.method4850(local377);
						local146 |= local383.method4848(local377);
					}
				}
			}
			if (local144) {
				local36 |= 0x80;
			}
			if (local142) {
				local36 |= 0x100;
			}
			if (local146) {
				local36 |= 0x400;
			}
		}
		@Pc(627) Class87 local627 = Static213.aClass87_107;
		@Pc(635) Class187 local635;
		synchronized (Static213.aClass87_107) {
			local635 = (Class187) Static213.aClass87_107.method1805(local39);
		}
		@Pc(648) Class269 local648 = null;
		if (this.anInt6247 != -1) {
			local648 = arg18.method5279(this.anInt6247);
		}
		@Pc(681) boolean local681;
		@Pc(683) int local683;
		@Pc(689) int local689;
		@Pc(772) int local772;
		@Pc(778) int local778;
		@Pc(842) int local842;
		if (local635 == null || arg1.method7296(local635.ua(), local36) != 0) {
			if (local635 != null) {
				local36 = arg1.method7292(local36, local635.ua());
			}
			local681 = false;
			local683 = 0;
			while (true) {
				if (local683 >= 12) {
					if (local681) {
						if (this.aLong153 != -1L) {
							@Pc(739) Class87 local739 = Static213.aClass87_107;
							synchronized (Static213.aClass87_107) {
								local635 = (Class187) Static213.aClass87_107.method1805(this.aLong153);
							}
						}
						if (local635 == null || arg1.method7296(local635.ua(), local36) != 0) {
							return null;
						}
					} else {
						@Pc(770) Class26[] local770 = new Class26[12];
						for (local772 = 0; local772 < 12; local772++) {
							local778 = local42[local772];
							@Pc(798) Class26 local798;
							if ((local778 & 0x40000000) != 0) {
								local798 = arg12.method6641(local778 & 0x3FFFFFFF).method5851(this.aBoolean447);
								if (local798 != null) {
									local770[local772] = local798;
								}
							} else if ((local778 & Integer.MIN_VALUE) != 0) {
								local798 = arg2.method5617(local778 & 0x3FFFFFFF).method2789();
								if (local798 != null) {
									local770[local772] = local798;
								}
							}
						}
						@Pc(844) int local844;
						if (local648 != null && local648.anIntArrayArray50 != null) {
							for (local778 = 0; local778 < local648.anIntArrayArray50.length; local778++) {
								if (local770[local778] != null) {
									local842 = 0;
									local844 = 0;
									@Pc(846) int local846 = 0;
									@Pc(848) int local848 = 0;
									@Pc(850) int local850 = 0;
									@Pc(852) int local852 = 0;
									if (local648.anIntArrayArray50[local778] != null) {
										local848 = local648.anIntArrayArray50[local778][3] << 3;
										local842 = local648.anIntArrayArray50[local778][0];
										local846 = local648.anIntArrayArray50[local778][2];
										local852 = local648.anIntArrayArray50[local778][5] << 3;
										local850 = local648.anIntArrayArray50[local778][4] << 3;
										local844 = local648.anIntArrayArray50[local778][1];
									}
									if (local848 != 0 || local850 != 0 || local852 != 0) {
										local770[local778].method333(local852, local850, local848);
									}
									if (local842 != 0 || local844 != 0 || local846 != 0) {
										local770[local778].method336(local842, local844, local846);
									}
								}
							}
						}
						@Pc(956) Class26 local956 = new Class26(local770, local770.length);
						@Pc(960) int local960 = local36 | 0x4000;
						local635 = arg1.method7256(local956, local960, Static555.anInt9375, 64, 850);
						for (local842 = 0; local842 < 5; local842++) {
							for (local844 = 0; local844 < Static597.aShortArrayArrayArray9.length; local844++) {
								if (Static597.aShortArrayArrayArray9[local844][local842].length > this.anIntArray344[local842]) {
									local635.ia(Static340.aShortArrayArray24[local844][local842], Static597.aShortArrayArrayArray9[local844][local842][this.anIntArray344[local842]]);
								}
							}
						}
						local635.s(local36);
						@Pc(1026) Class87 local1026 = Static213.aClass87_107;
						synchronized (Static213.aClass87_107) {
							Static213.aClass87_107.method1792(local39, local635);
						}
						this.aLong153 = local39;
					}
					break;
				}
				local689 = local42[local683];
				if ((local689 & 0x40000000) == 0) {
					if ((local689 & Integer.MIN_VALUE) != 0 && !arg2.method5617(local689 & 0x3FFFFFFF).method2783()) {
						local681 = true;
					}
				} else if (!arg12.method6641(local689 & 0x3FFFFFFF).method5846(this.aBoolean447)) {
					local681 = true;
				}
				local683++;
			}
		}
		@Pc(1048) Class187 local1048 = local635.method8656((byte) 4, local36, true);
		local681 = false;
		if (arg14 != null) {
			for (local683 = 0; local683 < 12; local683++) {
				if (arg14[local683] != -1) {
					local681 = true;
				}
			}
		}
		if (!local154 && !local681) {
			return local1048;
		}
		@Pc(1075) Class113[] local1075 = null;
		if (local648 != null) {
			local1075 = local648.method6403(arg1);
		}
		if (local681 && local1075 != null) {
			for (local689 = 0; local689 < 12; local689++) {
				if (local1075[local689] != null) {
					local1048.method8659(local1075[local689], 0x1 << local689, true);
				}
			}
		}
		local689 = 0;
		local772 = 1;
		while (local161 > local689) {
			if (Static588.aClass5_Sub5_Sub12Array4[local689] != null) {
				local1048.method8644(false, Static452.anIntArray413[local689] - 1, Static66.anIntArray98[local689], local772, Static588.aClass5_Sub5_Sub12Array4[local689], Static533.anIntArray501[local689], Static260.anIntArray234[local689], null, Static541.aClass5_Sub5_Sub12Array3[local689]);
			}
			local772 <<= 0x1;
			local689++;
		}
		if (local681) {
			for (local778 = 0; local778 < 12; local778++) {
				if (arg14[local778] != -1) {
					local842 = arg14[local778] - arg3;
					local842 &= 0x3FFF;
					@Pc(1177) Class113 local1177 = arg1.method7275();
					local1177.method8459(local842);
					local1048.method8659(local1177, 0x1 << local778, false);
				}
			}
		}
		if (local681 && local1075 != null) {
			for (local778 = 0; local778 < 12; local778++) {
				if (local1075[local778] != null) {
					local1048.method8659(local1075[local778], 0x1 << local778, false);
				}
			}
		}
		if (local371 != null && local381 != null) {
			local1048.method8648(local373, false, local365, arg15.aBooleanArray28, local377, local381, local379, local383, local195, local200, arg16 - 1, local371, local375, arg10 - 1);
		} else if (local371 != null) {
			local1048.method8639(local195, local365, local371, false, local373, 0, arg16 - 1, local200);
		} else if (local381 != null) {
			local1048.method8639(local377, local375, local381, false, local383, 0, arg10 - 1, local379);
		}
		for (local778 = 0; local778 < local161; local778++) {
			Static588.aClass5_Sub5_Sub12Array4[local778] = null;
			Static541.aClass5_Sub5_Sub12Array3[local778] = null;
			Static212.aClass362Array1[local778] = null;
		}
		return local1048;
	}
}
