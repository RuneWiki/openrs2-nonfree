import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wb")
public final class Class259 {

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "Z")
	public boolean aBoolean483;

	@OriginalMember(owner = "client!wb", name = "b", descriptor = "I")
	private int anInt7700;

	@OriginalMember(owner = "client!wb", name = "f", descriptor = "[[I")
	private int[][] anIntArrayArray55;

	@OriginalMember(owner = "client!wb", name = "g", descriptor = "J")
	private long aLong220;

	@OriginalMember(owner = "client!wb", name = "k", descriptor = "J")
	private long aLong221;

	@OriginalMember(owner = "client!wb", name = "o", descriptor = "[I")
	private int[] anIntArray529;

	@OriginalMember(owner = "client!wb", name = "s", descriptor = "[I")
	public int[] anIntArray530;

	@OriginalMember(owner = "client!wb", name = "p", descriptor = "I")
	public int anInt7708 = -1;

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(Z)V")
	private void method6305() {
		@Pc(25) long[] local25 = Class6_Sub1.aLongArray10;
		this.aLong221 = -1L;
		this.aLong221 = local25[(int) (((long) (this.anInt7700 >> 8) ^ this.aLong221) & 0xFFL)] ^ this.aLong221 >>> 8;
		this.aLong221 = this.aLong221 >>> 8 ^ local25[(int) (((long) this.anInt7700 ^ this.aLong221) & 0xFFL)];
		for (@Pc(68) int local68 = 0; local68 < 12; local68++) {
			this.aLong221 = this.aLong221 >>> 8 ^ local25[(int) ((this.aLong221 ^ (long) (this.anIntArray529[local68] >> 24)) & 0xFFL)];
			this.aLong221 = local25[(int) ((this.aLong221 ^ (long) (this.anIntArray529[local68] >> 16)) & 0xFFL)] ^ this.aLong221 >>> 8;
			this.aLong221 = this.aLong221 >>> 8 ^ local25[(int) ((this.aLong221 ^ (long) (this.anIntArray529[local68] >> 8)) & 0xFFL)];
			this.aLong221 = local25[(int) ((this.aLong221 ^ (long) this.anIntArray529[local68]) & 0xFFL)] ^ this.aLong221 >>> 8;
		}
		for (@Pc(164) int local164 = 0; local164 < 5; local164++) {
			this.aLong221 = local25[(int) ((this.aLong221 ^ (long) this.anIntArray530[local164]) & 0xFFL)] ^ this.aLong221 >>> 8;
		}
		this.aLong221 = this.aLong221 >>> 8 ^ local25[(int) ((this.aLong221 ^ (long) (this.aBoolean483 ? 1 : 0)) & 0xFFL)];
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(ILclient!eq;Lclient!jl;ILclient!no;ILclient!wk;Lclient!tf;Lclient!b;ILclient!rs;I)Lclient!va;")
	public Class224 method6306(@OriginalArg(0) int arg0, @OriginalArg(1) Class66 arg1, @OriginalArg(2) Class131 arg2, @OriginalArg(4) Interface6 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class263 arg5, @OriginalArg(7) Class231 arg6, @OriginalArg(8) Class18 arg7, @OriginalArg(9) int arg8, @OriginalArg(10) Class217 arg9) {
		if (this.anInt7708 != -1) {
			return arg5.method6416(this.anInt7708).method1383(arg3, arg8, arg9, arg1, arg4, arg0, arg2);
		}
		@Pc(27) int local27 = 2048;
		@Pc(35) boolean local35;
		@Pc(48) int local48;
		@Pc(113) int local113;
		@Pc(58) int local58;
		if (arg2 != null) {
			@Pc(31) boolean local31 = false;
			@Pc(33) boolean local33 = false;
			local35 = false;
			@Pc(37) boolean local37 = false;
			local48 = arg2.anIntArray235[arg8];
			local27 = 2080;
			local58 = local48 >>> 16;
			@Pc(63) Class6_Sub2_Sub8 local63 = arg9.method5235(local58);
			@Pc(67) int local67 = local48 & 0xFFFF;
			if (local63 != null) {
				local33 = local63.method3332(local67) | false;
				local31 = local63.method3330(local67) | false;
				local37 = local63.method3329(local67) | false;
				local35 = arg2.aBoolean243 | false;
			}
			if ((arg2.aBoolean244 || Static421.aBoolean474) && arg0 != -1 && arg2.anIntArray235.length > arg0) {
				local113 = arg2.anIntArray235[arg0];
				@Pc(117) int local117 = local113 >>> 16;
				@Pc(121) int local121 = local113 & 0xFFFF;
				@Pc(131) Class6_Sub2_Sub8 local131 = local117 == local58 ? local63 : arg9.method5235(local117);
				if (local131 != null) {
					local33 |= local131.method3332(local121);
					local31 |= local131.method3330(local121);
					local37 |= local131.method3329(local121);
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
		@Pc(180) Class44 local180 = Static415.aClass44_53;
		@Pc(189) Class224 local189;
		synchronized (Static415.aClass44_53) {
			local189 = (Class224) Static415.aClass44_53.method1353(this.aLong221);
		}
		if (local189 == null || arg1.method5053(local189.method5811(), local27) != 0) {
			if (local189 != null) {
				local27 = arg1.method5062(local27, local189.method5811());
			}
			local35 = false;
			for (@Pc(217) int local217 = 0; local217 < 12; local217++) {
				local48 = this.anIntArray529[local217];
				if ((local48 & 0x40000000) == 0) {
					if ((local48 & Integer.MIN_VALUE) != 0 && !arg7.method499(local48 & 0x3FFFFFFF).method4365()) {
						local35 = true;
					}
				} else if (!arg6.method5648(local48 & 0x3FFFFFFF).method73(this.aBoolean483)) {
					local35 = true;
				}
			}
			if (local35) {
				return null;
			}
			@Pc(279) Class78[] local279 = new Class78[12];
			local113 = 0;
			for (@Pc(283) int local283 = 0; local283 < 12; local283++) {
				@Pc(290) int local290 = this.anIntArray529[local283];
				@Pc(312) Class78 local312;
				if ((local290 & 0x40000000) != 0) {
					local312 = arg6.method5648(local290 & 0x3FFFFFFF).method59(this.aBoolean483);
					if (local312 != null) {
						local279[local113++] = local312;
					}
				} else if ((local290 & Integer.MIN_VALUE) != 0) {
					local312 = arg7.method499(local290 & 0x3FFFFFFF).method4376();
					if (local312 != null) {
						local279[local113++] = local312;
					}
				}
			}
			@Pc(347) int local347 = local27 | 0x4000;
			@Pc(353) Class78 local353 = new Class78(local279, local113);
			local189 = arg1.method4971(local353, local347, Static392.anInt5057, 64, 768);
			for (local58 = 0; local58 < 5; local58++) {
				if (Static368.aShortArrayArray9[local58].length > this.anIntArray530[local58]) {
					local189.method5824(Static28.aShortArray9[local58], Static368.aShortArrayArray9[local58][this.anIntArray530[local58]]);
				}
				if (this.anIntArray530[local58] < Static350.aShortArrayArray10[local58].length) {
					local189.method5824(Static274.aShortArray66[local58], Static350.aShortArrayArray10[local58][this.anIntArray530[local58]]);
				}
			}
			local189.method5809(local27);
			@Pc(422) Class44 local422 = Static415.aClass44_53;
			synchronized (Static415.aClass44_53) {
				Static415.aClass44_53.method1349(local189, this.aLong221);
			}
		}
		if (arg2 == null) {
			return local189;
		} else {
			local189.method5808((byte) 4, local27, true);
			return arg2.method3043(local189, arg0, arg4, 2048, arg8);
		}
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(Lclient!eq;Lclient!b;Lclient!rs;IIIILclient!jl;IIIZ)Lclient!va;")
	public Class224 method6307(@OriginalArg(0) Class66 arg0, @OriginalArg(1) Class18 arg1, @OriginalArg(2) Class217 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class131 arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		@Pc(7) int local7 = 2048;
		@Pc(97) int local97;
		if (arg6 != null) {
			@Pc(11) boolean local11 = false;
			@Pc(13) boolean local13 = false;
			@Pc(15) boolean local15 = false;
			@Pc(17) boolean local17 = false;
			local7 = 2080;
			@Pc(34) int local34 = arg6.anIntArray235[arg3];
			@Pc(38) int local38 = local34 >>> 16;
			@Pc(42) int local42 = local34 & 0xFFFF;
			@Pc(47) Class6_Sub2_Sub8 local47 = arg2.method5235(local38);
			if (local47 != null) {
				local13 = local47.method3332(local42) | false;
				local11 = local47.method3330(local42) | false;
				local17 = local47.method3329(local42) | false;
				local15 = arg6.aBoolean243 | false;
			}
			if ((arg6.aBoolean244 || Static421.aBoolean474) && arg8 != -1 && arg6.anIntArray235.length > arg8) {
				local97 = arg6.anIntArray235[arg8];
				@Pc(101) int local101 = local97 >>> 16;
				@Pc(105) int local105 = local97 & 0xFFFF;
				@Pc(115) Class6_Sub2_Sub8 local115;
				if (local38 == local101) {
					local115 = local47;
				} else {
					local115 = arg2.method5235(local105 >>> 16);
				}
				if (local115 != null) {
					local13 |= local115.method3332(local105);
					local11 |= local115.method3330(local105);
					local17 |= local115.method3329(local105);
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
		@Pc(178) long local178 = (long) arg4 << 32 | (long) (arg9 << 16) | (long) arg5;
		@Pc(180) Class44 local180 = Static415.aClass44_53;
		@Pc(188) Class224 local188;
		synchronized (Static415.aClass44_53) {
			local188 = (Class224) Static415.aClass44_53.method1353(local178);
		}
		if (local188 == null || arg0.method5053(local188.method5811(), local7) != 0) {
			if (local188 != null) {
				local7 = arg0.method5062(local7, local188.method5811());
			}
			@Pc(215) Class78[] local215 = new Class78[3];
			local97 = 0;
			if (!arg1.method499(arg5).method4365() || !arg1.method499(arg9).method4365() || !arg1.method499(arg4).method4365()) {
				return null;
			}
			@Pc(245) Class78 local245 = arg1.method499(arg5).method4376();
			if (local245 != null) {
				local97++;
				local215[0] = local245;
			}
			local245 = arg1.method499(arg9).method4376();
			if (local245 != null) {
				local215[local97++] = local245;
			}
			local245 = arg1.method499(arg4).method4376();
			if (local245 != null) {
				local215[local97++] = local245;
			}
			@Pc(284) int local284 = local7 | 0x4000;
			local245 = new Class78(local215, local97);
			local188 = arg0.method4971(local245, local284, Static392.anInt5057, 64, 768);
			for (@Pc(300) int local300 = 0; local300 < 5; local300++) {
				if (this.anIntArray530[local300] < Static368.aShortArrayArray9[local300].length) {
					local188.method5824(Static28.aShortArray9[local300], Static368.aShortArrayArray9[local300][this.anIntArray530[local300]]);
				}
				if (this.anIntArray530[local300] < Static350.aShortArrayArray10[local300].length) {
					local188.method5824(Static274.aShortArray66[local300], Static350.aShortArrayArray10[local300][this.anIntArray530[local300]]);
				}
			}
			local188.method5809(local7);
			@Pc(355) Class44 local355 = Static415.aClass44_53;
			synchronized (Static415.aClass44_53) {
				Static415.aClass44_53.method1349(local188, local178);
			}
		}
		if (arg6 == null) {
			return local188;
		} else {
			local188 = local188.method5808((byte) 4, local7, true);
			return arg6.method3043(local188, arg8, arg7, 2048, arg3);
		}
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(ZI)V")
	public void method6309(@OriginalArg(0) boolean arg0) {
		this.aBoolean483 = arg0;
		this.method6305();
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "([IIZ[III)V")
	public void method6311(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4) {
		if (arg4 != this.anInt7700) {
			this.anInt7700 = arg4;
			this.anIntArrayArray55 = null;
		}
		this.anIntArray530 = arg0;
		this.aBoolean483 = arg2;
		this.anIntArray529 = arg3;
		this.anInt7708 = arg1;
		this.method6305();
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(IILclient!tf;ILclient!eq;Lclient!wk;Lclient!rs;I[Lclient!tn;ILclient!b;ILclient!jl;Lclient!jl;Lclient!no;Lclient!bm;IZI)Lclient!va;")
	public Class224 method6312(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class231 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class66 arg4, @OriginalArg(5) Class263 arg5, @OriginalArg(6) Class217 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) Class235[] arg8, @OriginalArg(9) int arg9, @OriginalArg(10) Class18 arg10, @OriginalArg(11) int arg11, @OriginalArg(12) Class131 arg12, @OriginalArg(13) Class131 arg13, @OriginalArg(14) Interface6 arg14, @OriginalArg(15) Class27 arg15, @OriginalArg(18) int arg16) {
		if (this.anInt7708 != -1) {
			return arg5.method6416(this.anInt7708).method1382(arg12, arg6, arg14, arg11, arg0, arg4, arg9, arg16, arg8, arg7, arg13, arg15, arg3, arg1);
		}
		@Pc(35) int local35 = arg11;
		@Pc(38) long local38 = this.aLong221;
		@Pc(41) int[] local41 = this.anIntArray529;
		if (arg12 != null && (arg12.anInt3703 >= 0 || arg12.anInt3709 >= 0)) {
			local41 = new int[12];
			for (@Pc(60) int local60 = 0; local60 < 12; local60++) {
				local41[local60] = this.anIntArray529[local60];
			}
			if (arg12.anInt3703 >= 0) {
				if (arg12.anInt3703 == 65535) {
					local41[5] = 0;
					local38 ^= 0xFFFFFFFF00000000L;
				} else {
					local41[5] = arg12.anInt3703 | 0x40000000;
					local38 ^= (long) local41[5] << 32;
				}
			}
			if (arg12.anInt3709 >= 0) {
				if (arg12.anInt3709 == 65535) {
					local38 ^= 0xFFFFFFFFL;
					local41[3] = 0;
				} else {
					local41[3] = arg12.anInt3709 | 0x40000000;
					local38 ^= local41[3];
				}
			}
		}
		@Pc(147) boolean local147 = false;
		@Pc(149) boolean local149 = false;
		@Pc(151) boolean local151 = false;
		@Pc(159) boolean local159 = arg12 != null || arg13 != null;
		@Pc(166) int local166 = arg8 == null ? 0 : arg8.length;
		@Pc(200) int local200;
		@Pc(205) int local205;
		for (@Pc(168) int local168 = 0; local168 < local166; local168++) {
			Static313.aClass6_Sub2_Sub8Array10[local168] = null;
			if (arg8[local168] != null) {
				@Pc(186) Class131 local186 = arg6.method5234(arg8[local168].anInt6860);
				if (local186.anIntArray235 != null) {
					Static191.aClass131Array2[local168] = local186;
					local159 = true;
					local200 = arg8[local168].anInt6861;
					local205 = arg8[local168].anInt6858;
					@Pc(210) int local210 = local186.anIntArray235[local200];
					Static313.aClass6_Sub2_Sub8Array10[local168] = arg6.method5235(local210 >>> 16);
					@Pc(223) int local223 = local210 & 0xFFFF;
					Static274.anIntArray328[local168] = local223;
					if (Static313.aClass6_Sub2_Sub8Array10[local168] != null) {
						local149 |= Static313.aClass6_Sub2_Sub8Array10[local168].method3332(local223);
						local147 |= Static313.aClass6_Sub2_Sub8Array10[local168].method3330(local223);
						local151 |= Static313.aClass6_Sub2_Sub8Array10[local168].method3329(local223);
					}
					if ((local186.aBoolean244 || Static421.aBoolean474) && local205 != -1 && local186.anIntArray235.length > local205) {
						Static111.anIntArray140[local168] = local186.anIntArray233[local200];
						Static186.anIntArray229[local168] = arg8[local168].anInt6864;
						@Pc(292) int local292 = local186.anIntArray235[local205];
						Static23.aClass6_Sub2_Sub8Array3[local168] = arg6.method5235(local292 >>> 16);
						@Pc(305) int local305 = local292 & 0xFFFF;
						Static203.anIntArray274[local168] = local305;
						if (Static23.aClass6_Sub2_Sub8Array3[local168] != null) {
							local149 |= Static23.aClass6_Sub2_Sub8Array3[local168].method3332(local305);
							local147 |= Static23.aClass6_Sub2_Sub8Array3[local168].method3330(local305);
							local151 |= Static23.aClass6_Sub2_Sub8Array3[local168].method3329(local305);
						}
					} else {
						Static111.anIntArray140[local168] = 0;
						Static186.anIntArray229[local168] = 0;
						Static23.aClass6_Sub2_Sub8Array3[local168] = null;
						Static203.anIntArray274[local168] = -1;
					}
				}
			}
		}
		@Pc(364) int local364 = -1;
		local200 = -1;
		local205 = 0;
		@Pc(370) Class6_Sub2_Sub8 local370 = null;
		@Pc(372) Class6_Sub2_Sub8 local372 = null;
		@Pc(374) int local374 = -1;
		@Pc(376) int local376 = -1;
		@Pc(378) int local378 = 0;
		@Pc(380) Class6_Sub2_Sub8 local380 = null;
		@Pc(382) Class6_Sub2_Sub8 local382 = null;
		if (local159) {
			local35 = arg11 | 0x20;
			@Pc(399) int local399;
			@Pc(465) int local465;
			if (arg12 != null) {
				local364 = arg12.anIntArray235[arg16];
				local399 = local364 >>> 16;
				local364 &= 0xFFFF;
				local370 = arg6.method5235(local399);
				if (local370 != null) {
					local149 |= local370.method3332(local364);
					local147 |= local370.method3330(local364);
					local151 |= local370.method3329(local364);
				}
				if ((arg12.aBoolean244 || Static421.aBoolean474) && arg0 != -1 && arg0 < arg12.anIntArray235.length) {
					local200 = arg12.anIntArray235[arg0];
					local205 = arg12.anIntArray233[arg16];
					local465 = local200 >>> 16;
					local200 &= 0xFFFF;
					local372 = local465 == local399 ? local370 : arg6.method5235(local465);
					if (local372 != null) {
						local149 |= local372.method3332(local200);
						local147 |= local372.method3330(local200);
						local151 |= local372.method3329(local200);
					}
				}
			}
			if (arg13 != null) {
				local374 = arg13.anIntArray235[arg9];
				local399 = local374 >>> 16;
				local380 = arg6.method5235(local399);
				local374 &= 0xFFFF;
				if (local380 != null) {
					local149 |= local380.method3332(local374);
					local147 |= local380.method3330(local374);
					local151 |= local380.method3329(local374);
				}
				if ((arg13.aBoolean244 || Static421.aBoolean474) && arg7 != -1 && arg7 < arg13.anIntArray235.length) {
					local378 = arg13.anIntArray233[arg9];
					local376 = arg13.anIntArray235[arg7];
					local465 = local376 >>> 16;
					local376 &= 0xFFFF;
					local382 = local399 == local465 ? local380 : arg6.method5235(local465);
					if (local382 != null) {
						local149 |= local382.method3332(local376);
						local147 |= local382.method3330(local376);
						local151 |= local382.method3329(local376);
					}
				}
			}
			if (local149) {
				local35 |= 0x80;
			}
			if (local147) {
				local35 |= 0x100;
			}
			if (local151) {
				local35 |= 0x400;
			}
		}
		@Pc(639) Class44 local639 = Static79.aClass44_6;
		@Pc(647) Class224 local647;
		synchronized (Static79.aClass44_6) {
			local647 = (Class224) Static79.aClass44_6.method1353(local38);
		}
		@Pc(655) Class246 local655 = null;
		if (this.anInt7700 != -1) {
			local655 = arg15.method757(this.anInt7700);
		}
		@Pc(695) int local695;
		@Pc(701) int local701;
		if (local647 == null || arg4.method5053(local647.method5811(), local35) != 0 || local655 != null && local655.anIntArrayArray51 != null && this.anIntArrayArray55 == null) {
			if (local647 != null) {
				local35 = arg4.method5062(local35, local647.method5811());
			}
			@Pc(693) boolean local693 = false;
			local695 = 0;
			while (true) {
				if (local695 >= 12) {
					if (local693) {
						if (this.aLong220 != -1L) {
							@Pc(1327) Class44 local1327 = Static79.aClass44_6;
							synchronized (Static79.aClass44_6) {
								local647 = (Class224) Static79.aClass44_6.method1353(this.aLong220);
							}
						}
						if (local647 == null || arg4.method5053(local647.method5811(), local35) != 0 || local655 != null && local655.anIntArrayArray51 != null && this.anIntArrayArray55 == null) {
							return null;
						}
					} else {
						@Pc(752) Class78[] local752 = new Class78[12];
						@Pc(760) int local760;
						for (@Pc(754) int local754 = 0; local754 < 12; local754++) {
							local760 = local41[local754];
							@Pc(775) Class78 local775;
							if ((local760 & 0x40000000) != 0) {
								local775 = arg2.method5648(local760 & 0x3FFFFFFF).method56(this.aBoolean483);
								if (local775 != null) {
									local752[local754] = local775;
								}
							} else if ((local760 & Integer.MIN_VALUE) != 0) {
								local775 = arg10.method499(local760 & 0x3FFFFFFF).method4366();
								if (local775 != null) {
									local752[local754] = local775;
								}
							}
						}
						@Pc(835) int local835;
						if (local655 != null && local655.anIntArrayArray51 != null) {
							for (local760 = 0; local760 < local655.anIntArrayArray51.length; local760++) {
								if (local655.anIntArrayArray51[local760] != null && local752[local760] != null) {
									local835 = local655.anIntArrayArray51[local760][0];
									@Pc(842) int local842 = local655.anIntArrayArray51[local760][1];
									@Pc(849) int local849 = local655.anIntArrayArray51[local760][2];
									@Pc(858) int local858 = local655.anIntArrayArray51[local760][3] << 3;
									@Pc(867) int local867 = local655.anIntArrayArray51[local760][4] << 3;
									@Pc(876) int local876 = local655.anIntArrayArray51[local760][5] << 3;
									if (this.anIntArrayArray55 == null) {
										this.anIntArrayArray55 = new int[local655.anIntArrayArray51.length][];
									}
									if (this.anIntArrayArray55[local760] == null) {
										@Pc(898) int[] local898 = this.anIntArrayArray55[local760] = new int[15];
										if (local858 == 0 && local867 == 0 && local876 == 0) {
											local898[13] = -local842;
											local898[0] = local898[4] = local898[8] = 32768;
											local898[14] = -local849;
											local898[12] = -local835;
										} else {
											@Pc(911) int local911 = Class145.anIntArray280[local858];
											@Pc(915) int local915 = Class145.anIntArray279[local858];
											@Pc(919) int local919 = Class145.anIntArray280[local867];
											@Pc(923) int local923 = Class145.anIntArray279[local867];
											@Pc(927) int local927 = Class145.anIntArray280[local876];
											@Pc(931) int local931 = Class145.anIntArray279[local876];
											@Pc(939) int local939 = local915 * local927 + 16384 >> 15;
											@Pc(947) int local947 = local915 * local931 + 16384 >> 15;
											local898[8] = local919 * local911 + 16384 >> 15;
											local898[7] = local919 * local939 + -local931 * -local923 + 16384 >> 15;
											local898[4] = local911 * local927 + 16384 >> 15;
											local898[1] = local923 * local939 + -local931 * local919 + 16384 >> 15;
											local898[0] = local947 * local923 + local919 * local927 + 16384 >> 15;
											local898[2] = local923 * local911 + 16384 >> 15;
											local898[5] = -local915;
											local898[6] = local947 * local919 + -local923 * local927 + 16384 >> 15;
											local898[3] = local931 * local911 + 16384 >> 15;
											local898[14] = local898[8] * -local849 + -local835 * local898[2] + local898[5] * -local842 + 16384 >> 15;
											local898[12] = -local849 * local898[6] + -local842 * local898[3] + -local835 * local898[0] + 16384 >> 15;
											local898[13] = -local842 * local898[4] + -local835 * local898[1] + -local849 * local898[7] + 16384 >> 15;
										}
										local898[10] = local842;
										local898[9] = local835;
										local898[11] = local849;
									}
									if (local858 != 0 || local867 != 0 || local876 != 0) {
										local752[local760].method1977(local876, local867, local858);
									}
									if (local835 != 0 || local842 != 0 || local849 != 0) {
										local752[local760].method1978(local849, local842, local835);
									}
								}
							}
						}
						@Pc(1231) Class78 local1231 = new Class78(local752, local752.length);
						@Pc(1235) int local1235 = local35 | 0x4000;
						local647 = arg4.method4971(local1231, local1235, Static392.anInt5057, 64, 850);
						for (local835 = 0; local835 < 5; local835++) {
							if (Static368.aShortArrayArray9[local835].length > this.anIntArray530[local835]) {
								local647.method5824(Static28.aShortArray9[local835], Static368.aShortArrayArray9[local835][this.anIntArray530[local835]]);
							}
							if (this.anIntArray530[local835] < Static350.aShortArrayArray10[local835].length) {
								local647.method5824(Static274.aShortArray66[local835], Static350.aShortArrayArray10[local835][this.anIntArray530[local835]]);
							}
						}
						local647.method5809(local35);
						@Pc(1302) Class44 local1302 = Static79.aClass44_6;
						synchronized (Static79.aClass44_6) {
							Static79.aClass44_6.method1349(local647, local38);
						}
						this.aLong220 = local38;
					}
					break;
				}
				local701 = local41[local695];
				if ((local701 & 0x40000000) == 0) {
					if ((Integer.MIN_VALUE & local701) != 0 && !arg10.method499(local701 & 0x3FFFFFFF).method4375()) {
						local693 = true;
					}
				} else if (!arg2.method5648(local701 & 0x3FFFFFFF).method76(this.aBoolean483)) {
					local693 = true;
				}
				local695++;
			}
		}
		@Pc(1369) Class224 local1369 = local647.method5808((byte) 4, local35, true);
		if (!local159) {
			return local1369;
		}
		@Pc(1375) int local1375 = 0;
		local695 = 1;
		while (local1375 < local166) {
			if (Static313.aClass6_Sub2_Sub8Array10[local1375] != null) {
				local1369.method5816(Static23.aClass6_Sub2_Sub8Array3[local1375], this.anIntArrayArray55 == null ? null : this.anIntArrayArray55[local1375], Static203.anIntArray274[local1375], Static186.anIntArray229[local1375] - 1, Static274.anIntArray328[local1375], false, Static111.anIntArray140[local1375], local695, Static313.aClass6_Sub2_Sub8Array10[local1375]);
			}
			local1375++;
			local695 <<= 0x1;
		}
		if (local370 != null && local380 != null) {
			local1369.method5802(local382, local372, arg12.aBooleanArray9, local200, local205, local370, false, local376, local378, arg1 - 1, local380, local374, arg3 - 1, local364);
		} else if (local370 != null) {
			local1369.method5793(0, false, local370, local364, local200, local372, arg3 - 1, local205);
		} else if (local380 != null) {
			local1369.method5793(0, false, local380, local374, local376, local382, arg1 - 1, local378);
		}
		for (local701 = 0; local701 < local166; local701++) {
			Static313.aClass6_Sub2_Sub8Array10[local701] = null;
			Static23.aClass6_Sub2_Sub8Array3[local701] = null;
			Static191.aClass131Array2[local701] = null;
		}
		return local1369;
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(IZILclient!b;)V")
	public void method6313(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class18 arg2) {
		@Pc(7) int local7 = Static62.anIntArray100[arg1];
		if (this.anIntArray529[local7] != 0 && arg2.method499(arg0) != null) {
			this.anIntArray529[local7] = arg0 | Integer.MIN_VALUE;
			this.method6305();
		}
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(III)V")
	public void method6314(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray530[arg0] = arg1;
		this.method6305();
	}
}
