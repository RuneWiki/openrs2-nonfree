import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nl")
public final class Class206 {

	@OriginalMember(owner = "client!nl", name = "b", descriptor = "J")
	private long aLong246;

	@OriginalMember(owner = "client!nl", name = "f", descriptor = "[I")
	public int[] anIntArray590;

	@OriginalMember(owner = "client!nl", name = "g", descriptor = "Z")
	public boolean aBoolean430;

	@OriginalMember(owner = "client!nl", name = "h", descriptor = "J")
	private long aLong247;

	@OriginalMember(owner = "client!nl", name = "o", descriptor = "[[I")
	private int[][] anIntArrayArray78;

	@OriginalMember(owner = "client!nl", name = "r", descriptor = "I")
	private int anInt5941;

	@OriginalMember(owner = "client!nl", name = "t", descriptor = "[I")
	private int[] anIntArray591;

	@OriginalMember(owner = "client!nl", name = "l", descriptor = "I")
	public int anInt5936 = -1;

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(B)V")
	private void method5018() {
		@Pc(7) long[] local7 = Class173.aLongArray14;
		this.aLong247 = -1L;
		this.aLong247 = this.aLong247 >>> 8 ^ local7[(int) (((long) (this.anInt5941 >> 8) ^ this.aLong247) & 0xFFL)];
		this.aLong247 = this.aLong247 >>> 8 ^ local7[(int) ((this.aLong247 ^ (long) this.anInt5941) & 0xFFL)];
		for (@Pc(50) int local50 = 0; local50 < 12; local50++) {
			this.aLong247 = local7[(int) ((this.aLong247 ^ (long) (this.anIntArray591[local50] >> 24)) & 0xFFL)] ^ this.aLong247 >>> 8;
			this.aLong247 = local7[(int) ((this.aLong247 ^ (long) (this.anIntArray591[local50] >> 16)) & 0xFFL)] ^ this.aLong247 >>> 8;
			this.aLong247 = local7[(int) (((long) (this.anIntArray591[local50] >> 8) ^ this.aLong247) & 0xFFL)] ^ this.aLong247 >>> 8;
			this.aLong247 = local7[(int) ((this.aLong247 ^ (long) this.anIntArray591[local50]) & 0xFFL)] ^ this.aLong247 >>> 8;
		}
		for (@Pc(154) int local154 = 0; local154 < 5; local154++) {
			this.aLong247 = local7[(int) (((long) this.anIntArray590[local154] ^ this.aLong247) & 0xFFL)] ^ this.aLong247 >>> 8;
		}
		this.aLong247 = local7[(int) (((long) (this.aBoolean430 ? 1 : 0) ^ this.aLong247) & 0xFFL)] ^ this.aLong247 >>> 8;
	}

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(III)V")
	public void method5020(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray590[arg0] = arg1;
		this.method5018();
	}

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(IILclient!au;I)V")
	public void method5021(@OriginalArg(1) int arg0, @OriginalArg(2) Class15 arg1, @OriginalArg(3) int arg2) {
		@Pc(12) int local12 = Static309.anIntArray572[arg0];
		if (this.anIntArray591[local12] != 0 && arg1.method577(arg2) != null) {
			this.anIntArray591[local12] = Integer.MIN_VALUE | arg2;
			this.method5018();
		}
	}

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(ZI)V")
	public void method5023(@OriginalArg(0) boolean arg0) {
		this.aBoolean430 = arg0;
		this.method5018();
	}

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(ILclient!qb;IILclient!qa;ILclient!au;Lclient!tv;Lclient!qp;Lclient!na;Lclient!ok;B)Lclient!r;")
	public Class145 method5024(@OriginalArg(0) int arg0, @OriginalArg(1) Class242 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Class122 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class15 arg5, @OriginalArg(7) Interface16 arg6, @OriginalArg(8) Class250 arg7, @OriginalArg(9) Class199 arg8, @OriginalArg(10) Class218 arg9) {
		if (this.anInt5936 != -1) {
			return arg1.method5833(this.anInt5936).method4866(arg3, arg6, arg2, arg4, arg8, arg0, arg9);
		}
		@Pc(27) int local27 = 2048;
		@Pc(37) boolean local37;
		@Pc(52) int local52;
		@Pc(117) int local117;
		@Pc(58) int local58;
		@Pc(121) int local121;
		if (arg8 != null) {
			@Pc(31) boolean local31 = false;
			@Pc(33) boolean local33 = false;
			@Pc(35) boolean local35 = false;
			local37 = false;
			local27 = 2080;
			local52 = arg8.anIntArray574[arg0];
			local58 = local52 >>> 16;
			@Pc(63) Class1_Sub1_Sub6 local63 = arg9.method5222(local58);
			@Pc(67) int local67 = local52 & 0xFFFF;
			if (local63 != null) {
				local33 = local63.method2962(local67) | false;
				local31 = local63.method2963(local67) | false;
				local37 = local63.method2965(local67) | false;
				local35 = arg8.aBoolean418 | false;
			}
			if ((arg8.aBoolean417 || Static157.aBoolean315) && arg4 != -1 && arg8.anIntArray574.length > arg4) {
				local117 = arg8.anIntArray574[arg4];
				local121 = local117 >>> 16;
				@Pc(135) Class1_Sub1_Sub6 local135 = local121 == local58 ? local63 : arg9.method5222(local121);
				@Pc(139) int local139 = local117 & 0xFFFF;
				if (local135 != null) {
					local33 |= local135.method2962(local139);
					local31 |= local135.method2963(local139);
					local37 |= local135.method2965(local139);
				}
			}
			if (local33) {
				local27 = 2208;
			}
			if (local31) {
				local27 |= 0x100;
			}
			if (local35) {
				local27 |= 0x200;
			}
			if (local37) {
				local27 |= 0x400;
			}
		}
		@Pc(196) Class313 local196 = Static153.aClass313_21;
		@Pc(205) Class145 local205;
		synchronized (Static153.aClass313_21) {
			local205 = (Class145) Static153.aClass313_21.method7406(this.aLong247);
		}
		if (local205 == null || arg3.method7225(local205.ba(), local27) != 0) {
			if (local205 != null) {
				local27 = arg3.method7241(local27, local205.ba());
			}
			local37 = false;
			for (local52 = 0; local52 < 12; local52++) {
				local117 = this.anIntArray591[local52];
				if ((local117 & 0x40000000) == 0) {
					if ((Integer.MIN_VALUE & local117) != 0 && !arg5.method577(local117 & 0x3FFFFFFF).method7518()) {
						local37 = true;
					}
				} else if (!arg7.method5980(local117 & 0x3FFFFFFF).method3445(this.aBoolean430)) {
					local37 = true;
				}
			}
			if (local37) {
				return null;
			}
			@Pc(293) Class97[] local293 = new Class97[12];
			@Pc(295) int local295 = 0;
			for (@Pc(297) int local297 = 0; local297 < 12; local297++) {
				local58 = this.anIntArray591[local297];
				@Pc(322) Class97 local322;
				if ((local58 & 0x40000000) != 0) {
					local322 = arg7.method5980(local58 & 0x3FFFFFFF).method3456(this.aBoolean430);
					if (local322 != null) {
						local293[local295++] = local322;
					}
				} else if ((Integer.MIN_VALUE & local58) != 0) {
					local322 = arg5.method577(local58 & 0x3FFFFFFF).method7522();
					if (local322 != null) {
						local293[local295++] = local322;
					}
				}
			}
			@Pc(364) int local364 = local27 | 0x4000;
			@Pc(370) Class97 local370 = new Class97(local293, local295);
			local205 = arg3.method7280(local370, local364, Static291.anInt5489, 64, 768);
			for (local121 = 0; local121 < 5; local121++) {
				if (this.anIntArray590[local121] < Static293.aShortArrayArray4[local121].length) {
					local205.pa(Static430.aShortArray117[local121], Static293.aShortArrayArray4[local121][this.anIntArray590[local121]]);
				}
				if (Static45.aShortArrayArray1[local121].length > this.anIntArray590[local121]) {
					local205.pa(Static88.aShortArray33[local121], Static45.aShortArrayArray1[local121][this.anIntArray590[local121]]);
				}
			}
			local205.m(local27);
			@Pc(439) Class313 local439 = Static153.aClass313_21;
			synchronized (Static153.aClass313_21) {
				Static153.aClass313_21.method7399(this.aLong247, local205);
			}
		}
		if (arg8 == null) {
			return local205;
		} else {
			local205.method6672((byte) 4, local27, true);
			return arg8.method4877(arg4, arg2, local205, 2048, arg0);
		}
	}

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(Lclient!ok;ILclient!na;IIBIILclient!qa;IILclient!au;)Lclient!r;")
	public Class145 method5025(@OriginalArg(0) Class218 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class199 arg2, @OriginalArg(4) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5, @OriginalArg(8) Class122 arg6, @OriginalArg(9) int arg7, @OriginalArg(10) int arg8, @OriginalArg(11) Class15 arg9) {
		@Pc(7) int local7 = 2048;
		@Pc(98) int local98;
		if (arg2 != null) {
			@Pc(11) boolean local11 = false;
			@Pc(13) boolean local13 = false;
			@Pc(15) boolean local15 = false;
			@Pc(17) boolean local17 = false;
			local7 = 2080;
			@Pc(34) int local34 = arg2.anIntArray574[arg8];
			@Pc(38) int local38 = local34 >>> 16;
			@Pc(43) Class1_Sub1_Sub6 local43 = arg0.method5222(local38);
			@Pc(47) int local47 = local34 & 0xFFFF;
			if (local43 != null) {
				local13 = local43.method2962(local47) | false;
				local11 = local43.method2963(local47) | false;
				local17 = local43.method2965(local47) | false;
				local15 = arg2.aBoolean418 | false;
			}
			if ((arg2.aBoolean417 || Static157.aBoolean315) && arg7 != -1 && arg2.anIntArray574.length > arg7) {
				local98 = arg2.anIntArray574[arg7];
				@Pc(102) int local102 = local98 >>> 16;
				@Pc(106) int local106 = local98 & 0xFFFF;
				@Pc(120) Class1_Sub1_Sub6 local120;
				if (local102 == local38) {
					local120 = local43;
				} else {
					local120 = arg0.method5222(local106 >>> 16);
				}
				if (local120 != null) {
					local13 |= local120.method2962(local106);
					local11 |= local120.method2963(local106);
					local17 |= local120.method2965(local106);
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
		@Pc(183) long local183 = (long) (arg3 << 16) | (long) arg5 << 32 | (long) arg1;
		@Pc(193) Class313 local193 = Static153.aClass313_21;
		@Pc(201) Class145 local201;
		synchronized (Static153.aClass313_21) {
			local201 = (Class145) Static153.aClass313_21.method7406(local183);
		}
		if (local201 == null || arg6.method7225(local201.ba(), local7) != 0) {
			if (local201 != null) {
				local7 = arg6.method7241(local7, local201.ba());
			}
			@Pc(228) Class97[] local228 = new Class97[3];
			local98 = 0;
			if (!arg9.method577(arg1).method7518() || !arg9.method577(arg3).method7518() || !arg9.method577(arg5).method7518()) {
				return null;
			}
			@Pc(260) Class97 local260 = arg9.method577(arg1).method7522();
			if (local260 != null) {
				local98++;
				local228[0] = local260;
			}
			local260 = arg9.method577(arg3).method7522();
			if (local260 != null) {
				local228[local98++] = local260;
			}
			local260 = arg9.method577(arg5).method7522();
			if (local260 != null) {
				local228[local98++] = local260;
			}
			@Pc(299) int local299 = local7 | 0x4000;
			local260 = new Class97(local228, local98);
			local201 = arg6.method7280(local260, local299, Static291.anInt5489, 64, 768);
			for (@Pc(315) int local315 = 0; local315 < 5; local315++) {
				if (this.anIntArray590[local315] < Static293.aShortArrayArray4[local315].length) {
					local201.pa(Static430.aShortArray117[local315], Static293.aShortArrayArray4[local315][this.anIntArray590[local315]]);
				}
				if (Static45.aShortArrayArray1[local315].length > this.anIntArray590[local315]) {
					local201.pa(Static88.aShortArray33[local315], Static45.aShortArrayArray1[local315][this.anIntArray590[local315]]);
				}
			}
			local201.m(local7);
			@Pc(372) Class313 local372 = Static153.aClass313_21;
			synchronized (Static153.aClass313_21) {
				Static153.aClass313_21.method7399(local183, local201);
			}
		}
		if (arg2 == null) {
			return local201;
		} else {
			local201 = local201.method6672((byte) 4, local7, true);
			return arg2.method4877(arg7, arg4, local201, 2048, arg8);
		}
	}

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(Lclient!qa;IILclient!tv;ILclient!au;Lclient!na;Lclient!p;Lclient!na;[Lclient!kj;Lclient!qp;Lclient!ok;IIILclient!qb;IIZ)Lclient!r;")
	public Class145 method5027(@OriginalArg(0) Class122 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Interface16 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class15 arg5, @OriginalArg(6) Class199 arg6, @OriginalArg(7) Class228 arg7, @OriginalArg(8) Class199 arg8, @OriginalArg(9) Class166[] arg9, @OriginalArg(10) Class250 arg10, @OriginalArg(11) Class218 arg11, @OriginalArg(13) int arg12, @OriginalArg(14) int arg13, @OriginalArg(15) Class242 arg14, @OriginalArg(16) int arg15, @OriginalArg(17) int arg16) {
		if (this.anInt5936 != -1) {
			return arg14.method5833(this.anInt5936).method4856(arg9, arg4, arg11, arg3, arg0, arg13, arg6, arg8, arg1, arg16, arg15, arg12, arg7, arg2);
		}
		@Pc(34) int local34 = arg15;
		@Pc(37) long local37 = this.aLong247;
		@Pc(40) int[] local40 = this.anIntArray591;
		if (arg6 != null && (arg6.anInt5745 >= 0 || arg6.anInt5737 >= 0)) {
			local40 = new int[12];
			for (@Pc(56) int local56 = 0; local56 < 12; local56++) {
				local40[local56] = this.anIntArray591[local56];
			}
			if (arg6.anInt5745 >= 0) {
				if (arg6.anInt5745 == 65535) {
					local40[5] = 0;
					local37 ^= 0xFFFFFFFF00000000L;
				} else {
					local40[5] = arg6.anInt5745 | 0x40000000;
					local37 ^= (long) local40[5] << 32;
				}
			}
			if (arg6.anInt5737 >= 0) {
				if (arg6.anInt5737 == 65535) {
					local40[3] = 0;
					local37 ^= 0xFFFFFFFFL;
				} else {
					local40[3] = arg6.anInt5737 | 0x40000000;
					local37 ^= local40[3];
				}
			}
		}
		@Pc(142) boolean local142 = false;
		@Pc(144) boolean local144 = false;
		@Pc(146) boolean local146 = false;
		@Pc(154) boolean local154 = arg6 != null || arg8 != null;
		@Pc(161) int local161 = arg9 == null ? 0 : arg9.length;
		@Pc(195) int local195;
		@Pc(200) int local200;
		for (@Pc(163) int local163 = 0; local163 < local161; local163++) {
			Static134.aClass1_Sub1_Sub6Array3[local163] = null;
			if (arg9[local163] != null) {
				@Pc(181) Class199 local181 = arg11.method5221(arg9[local163].anInt4909);
				if (local181.anIntArray574 != null) {
					Static64.aClass199Array1[local163] = local181;
					local154 = true;
					local195 = arg9[local163].anInt4904;
					local200 = arg9[local163].anInt4905;
					@Pc(205) int local205 = local181.anIntArray574[local195];
					Static134.aClass1_Sub1_Sub6Array3[local163] = arg11.method5222(local205 >>> 16);
					@Pc(218) int local218 = local205 & 0xFFFF;
					Static136.anIntArray256[local163] = local218;
					if (Static134.aClass1_Sub1_Sub6Array3[local163] != null) {
						local144 |= Static134.aClass1_Sub1_Sub6Array3[local163].method2962(local218);
						local142 |= Static134.aClass1_Sub1_Sub6Array3[local163].method2963(local218);
						local146 |= Static134.aClass1_Sub1_Sub6Array3[local163].method2965(local218);
					}
					if ((local181.aBoolean417 || Static157.aBoolean315) && local200 != -1 && local200 < local181.anIntArray574.length) {
						Static293.anIntArray548[local163] = local181.anIntArray575[local195];
						Static222.anIntArray432[local163] = arg9[local163].anInt4903;
						@Pc(286) int local286 = local181.anIntArray574[local200];
						Static524.aClass1_Sub1_Sub6Array7[local163] = arg11.method5222(local286 >>> 16);
						@Pc(299) int local299 = local286 & 0xFFFF;
						Static387.anIntArray680[local163] = local299;
						if (Static524.aClass1_Sub1_Sub6Array7[local163] != null) {
							local144 |= Static524.aClass1_Sub1_Sub6Array7[local163].method2962(local299);
							local142 |= Static524.aClass1_Sub1_Sub6Array7[local163].method2963(local299);
							local146 |= Static524.aClass1_Sub1_Sub6Array7[local163].method2965(local299);
						}
					} else {
						Static293.anIntArray548[local163] = 0;
						Static222.anIntArray432[local163] = 0;
						Static524.aClass1_Sub1_Sub6Array7[local163] = null;
						Static387.anIntArray680[local163] = -1;
					}
				}
			}
		}
		@Pc(358) int local358 = -1;
		local195 = -1;
		local200 = 0;
		@Pc(369) Class1_Sub1_Sub6 local369 = null;
		@Pc(371) Class1_Sub1_Sub6 local371 = null;
		@Pc(373) int local373 = -1;
		@Pc(375) int local375 = -1;
		@Pc(377) int local377 = 0;
		@Pc(379) Class1_Sub1_Sub6 local379 = null;
		@Pc(381) Class1_Sub1_Sub6 local381 = null;
		if (local154) {
			local34 = arg15 | 0x20;
			@Pc(398) int local398;
			@Pc(462) int local462;
			if (arg6 != null) {
				local358 = arg6.anIntArray574[arg13];
				local398 = local358 >>> 16;
				local369 = arg11.method5222(local398);
				local358 &= 0xFFFF;
				if (local369 != null) {
					local144 |= local369.method2962(local358);
					local142 |= local369.method2963(local358);
					local146 |= local369.method2965(local358);
				}
				if ((arg6.aBoolean417 || Static157.aBoolean315) && arg16 != -1 && arg16 < arg6.anIntArray574.length) {
					local195 = arg6.anIntArray574[arg16];
					local200 = arg6.anIntArray575[arg13];
					local462 = local195 >>> 16;
					local371 = local462 == local398 ? local369 : arg11.method5222(local462);
					local195 &= 0xFFFF;
					if (local371 != null) {
						local144 |= local371.method2962(local195);
						local142 |= local371.method2963(local195);
						local146 |= local371.method2965(local195);
					}
				}
			}
			if (arg8 != null) {
				local373 = arg8.anIntArray574[arg4];
				local398 = local373 >>> 16;
				local379 = arg11.method5222(local398);
				local373 &= 0xFFFF;
				if (local379 != null) {
					local144 |= local379.method2962(local373);
					local142 |= local379.method2963(local373);
					local146 |= local379.method2965(local373);
				}
				if ((arg8.aBoolean417 || Static157.aBoolean315) && arg2 != -1 && arg8.anIntArray574.length > arg2) {
					local375 = arg8.anIntArray574[arg2];
					local377 = arg8.anIntArray575[arg4];
					local462 = local375 >>> 16;
					local375 &= 0xFFFF;
					local381 = local462 == local398 ? local379 : arg11.method5222(local462);
					if (local381 != null) {
						local144 |= local381.method2962(local375);
						local142 |= local381.method2963(local375);
						local146 |= local381.method2965(local375);
					}
				}
			}
			if (local144) {
				local34 |= 0x80;
			}
			if (local142) {
				local34 |= 0x100;
			}
			if (local146) {
				local34 |= 0x400;
			}
		}
		@Pc(630) Class313 local630 = Static305.aClass313_35;
		@Pc(638) Class145 local638;
		synchronized (Static305.aClass313_35) {
			local638 = (Class145) Static305.aClass313_35.method7406(local37);
		}
		@Pc(646) Class230 local646 = null;
		if (this.anInt5941 != -1) {
			local646 = arg7.method5341(this.anInt5941);
		}
		@Pc(690) int local690;
		@Pc(696) int local696;
		if (local638 == null || arg0.method7225(local638.ba(), local34) != 0 || local646 != null && local646.anIntArrayArray84 != null && this.anIntArrayArray78 == null) {
			if (local638 != null) {
				local34 = arg0.method7241(local34, local638.ba());
			}
			@Pc(688) boolean local688 = false;
			local690 = 0;
			while (true) {
				if (local690 >= 12) {
					if (local688) {
						if (this.aLong246 != -1L) {
							@Pc(748) Class313 local748 = Static305.aClass313_35;
							synchronized (Static305.aClass313_35) {
								local638 = (Class145) Static305.aClass313_35.method7406(this.aLong246);
							}
						}
						if (local638 == null || arg0.method7225(local638.ba(), local34) != 0 || local646 != null && local646.anIntArrayArray84 != null && this.anIntArrayArray78 == null) {
							return null;
						}
					} else {
						@Pc(784) Class97[] local784 = new Class97[12];
						@Pc(792) int local792;
						for (@Pc(786) int local786 = 0; local786 < 12; local786++) {
							local792 = local40[local786];
							@Pc(807) Class97 local807;
							if ((local792 & 0x40000000) != 0) {
								local807 = arg10.method5980(local792 & 0x3FFFFFFF).method3446(this.aBoolean430);
								if (local807 != null) {
									local784[local786] = local807;
								}
							} else if ((local792 & Integer.MIN_VALUE) != 0) {
								local807 = arg5.method577(local792 & 0x3FFFFFFF).method7524();
								if (local807 != null) {
									local784[local786] = local807;
								}
							}
						}
						@Pc(867) int local867;
						if (local646 != null && local646.anIntArrayArray84 != null) {
							for (local792 = 0; local792 < local646.anIntArrayArray84.length; local792++) {
								if (local646.anIntArrayArray84[local792] != null && local784[local792] != null) {
									local867 = local646.anIntArrayArray84[local792][0];
									@Pc(874) int local874 = local646.anIntArrayArray84[local792][1];
									@Pc(881) int local881 = local646.anIntArrayArray84[local792][2];
									@Pc(890) int local890 = local646.anIntArrayArray84[local792][3] << 3;
									@Pc(899) int local899 = local646.anIntArrayArray84[local792][4] << 3;
									@Pc(908) int local908 = local646.anIntArrayArray84[local792][5] << 3;
									if (this.anIntArrayArray78 == null) {
										this.anIntArrayArray78 = new int[local646.anIntArrayArray84.length][];
									}
									if (this.anIntArrayArray78[local792] == null) {
										@Pc(930) int[] local930 = this.anIntArrayArray78[local792] = new int[15];
										if (local890 == 0 && local899 == 0 && local908 == 0) {
											local930[13] = -local874;
											local930[0] = local930[4] = local930[8] = 32768;
											local930[12] = -local867;
											local930[14] = -local881;
										} else {
											@Pc(978) int local978 = Class310.anIntArray826[local890];
											@Pc(982) int local982 = Class310.anIntArray827[local890];
											@Pc(986) int local986 = Class310.anIntArray826[local899];
											@Pc(990) int local990 = Class310.anIntArray827[local899];
											@Pc(994) int local994 = Class310.anIntArray826[local908];
											@Pc(998) int local998 = Class310.anIntArray827[local908];
											@Pc(1006) int local1006 = local994 * local982 + 8192 >> 14;
											@Pc(1014) int local1014 = local998 * local982 + 8192 >> 14;
											local930[0] = local1014 * local990 + local986 * local994 + 8192 >> 14;
											local930[5] = -local982;
											local930[8] = local978 * local986 + 8192 >> 14;
											local930[4] = local994 * local978 + 8192 >> 14;
											local930[1] = -local998 * local986 + local990 * local1006 + 8192 >> 14;
											local930[7] = -local990 * -local998 + local986 * local1006 + 8192 >> 14;
											local930[2] = local978 * local990 + 8192 >> 14;
											local930[3] = local998 * local978 + 8192 >> 14;
											local930[6] = local994 * -local990 + local1014 * local986 + 8192 >> 14;
											local930[14] = local930[2] * -local867 + local930[5] * -local874 + -local881 * local930[8] + 8192 >> 14;
											local930[13] = -local881 * local930[7] + local930[4] * -local874 + local930[1] * -local867 + 8192 >> 14;
											local930[12] = -local874 * local930[3] + -local867 * local930[0] + local930[6] * -local881 + 8192 >> 14;
										}
										local930[10] = local874;
										local930[9] = local867;
										local930[11] = local881;
									}
									if (local890 != 0 || local899 != 0 || local908 != 0) {
										local784[local792].method2310(local899, local908, local890);
									}
									if (local867 != 0 || local874 != 0 || local881 != 0) {
										local784[local792].method2306(local867, local881, local874);
									}
								}
							}
						}
						@Pc(1262) Class97 local1262 = new Class97(local784, local784.length);
						@Pc(1266) int local1266 = local34 | 0x4000;
						local638 = arg0.method7280(local1262, local1266, Static291.anInt5489, 64, 850);
						for (local867 = 0; local867 < 5; local867++) {
							if (this.anIntArray590[local867] < Static293.aShortArrayArray4[local867].length) {
								local638.pa(Static430.aShortArray117[local867], Static293.aShortArrayArray4[local867][this.anIntArray590[local867]]);
							}
							if (this.anIntArray590[local867] < Static45.aShortArrayArray1[local867].length) {
								local638.pa(Static88.aShortArray33[local867], Static45.aShortArrayArray1[local867][this.anIntArray590[local867]]);
							}
						}
						local638.m(local34);
						@Pc(1335) Class313 local1335 = Static305.aClass313_35;
						synchronized (Static305.aClass313_35) {
							Static305.aClass313_35.method7399(local37, local638);
						}
						this.aLong246 = local37;
					}
					break;
				}
				local696 = local40[local690];
				if ((local696 & 0x40000000) == 0) {
					if ((Integer.MIN_VALUE & local696) != 0 && !arg5.method577(local696 & 0x3FFFFFFF).method7516()) {
						local688 = true;
					}
				} else if (!arg10.method5980(local696 & 0x3FFFFFFF).method3453(this.aBoolean430)) {
					local688 = true;
				}
				local690++;
			}
		}
		@Pc(1357) Class145 local1357 = local638.method6672((byte) 4, local34, true);
		if (!local154) {
			return local1357;
		}
		@Pc(1363) int local1363 = 0;
		local690 = 1;
		while (local1363 < local161) {
			if (Static134.aClass1_Sub1_Sub6Array3[local1363] != null) {
				local1357.method6688(Static136.anIntArray256[local1363], Static387.anIntArray680[local1363], Static134.aClass1_Sub1_Sub6Array3[local1363], Static222.anIntArray432[local1363] - 1, false, local690, this.anIntArrayArray78 == null ? null : this.anIntArrayArray78[local1363], Static293.anIntArray548[local1363], Static524.aClass1_Sub1_Sub6Array7[local1363]);
			}
			local1363++;
			local690 <<= 0x1;
		}
		if (local369 != null && local379 != null) {
			local1357.method6679(local369, local195, arg12 - 1, local375, arg6.aBooleanArray40, arg1 - 1, local373, local371, local377, local200, local358, local379, local381, false);
		} else if (local369 != null) {
			local1357.method6687(local369, local200, arg1 - 1, local371, local195, 0, local358, false);
		} else if (local379 != null) {
			local1357.method6687(local379, local377, arg12 - 1, local381, local375, 0, local373, false);
		}
		for (local696 = 0; local696 < local161; local696++) {
			Static134.aClass1_Sub1_Sub6Array3[local696] = null;
			Static524.aClass1_Sub1_Sub6Array7[local696] = null;
			Static64.aClass199Array1[local696] = null;
		}
		return local1357;
	}

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(Z[IIII[I)V")
	public void method5029(@OriginalArg(0) boolean arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int[] arg4) {
		if (arg2 != this.anInt5941) {
			this.anInt5941 = arg2;
			this.anIntArrayArray78 = null;
		}
		this.anIntArray591 = arg4;
		this.anInt5936 = arg3;
		this.aBoolean430 = arg0;
		this.anIntArray590 = arg1;
		this.method5018();
	}
}
