import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dea")
public final class Class67 {

	@OriginalMember(owner = "client!dea", name = "c", descriptor = "[I")
	private int[] anIntArray155;

	@OriginalMember(owner = "client!dea", name = "i", descriptor = "[I")
	public int[] anIntArray158;

	@OriginalMember(owner = "client!dea", name = "l", descriptor = "I")
	private int anInt2173;

	@OriginalMember(owner = "client!dea", name = "m", descriptor = "[[I")
	private int[][] anIntArrayArray12;

	@OriginalMember(owner = "client!dea", name = "s", descriptor = "J")
	private long aLong46;

	@OriginalMember(owner = "client!dea", name = "z", descriptor = "J")
	private long aLong47;

	@OriginalMember(owner = "client!dea", name = "B", descriptor = "Z")
	public boolean aBoolean199;

	@OriginalMember(owner = "client!dea", name = "n", descriptor = "I")
	public int anInt2174 = -1;

	@OriginalMember(owner = "client!dea", name = "a", descriptor = "(B)V")
	private void method1965() {
		@Pc(7) long[] local7 = Class108_Sub1.aLongArray2;
		this.aLong46 = -1L;
		this.aLong46 = this.aLong46 >>> 8 ^ local7[(int) ((this.aLong46 ^ (long) (this.anInt2173 >> 8)) & 0xFFL)];
		this.aLong46 = this.aLong46 >>> 8 ^ local7[(int) (((long) this.anInt2173 ^ this.aLong46) & 0xFFL)];
		for (@Pc(50) int local50 = 0; local50 < 12; local50++) {
			this.aLong46 = local7[(int) ((this.aLong46 ^ (long) (this.anIntArray155[local50] >> 24)) & 0xFFL)] ^ this.aLong46 >>> 8;
			this.aLong46 = this.aLong46 >>> 8 ^ local7[(int) (((long) (this.anIntArray155[local50] >> 16) ^ this.aLong46) & 0xFFL)];
			this.aLong46 = local7[(int) (((long) (this.anIntArray155[local50] >> 8) ^ this.aLong46) & 0xFFL)] ^ this.aLong46 >>> 8;
			this.aLong46 = local7[(int) (((long) this.anIntArray155[local50] ^ this.aLong46) & 0xFFL)] ^ this.aLong46 >>> 8;
		}
		for (@Pc(154) int local154 = 0; local154 < 5; local154++) {
			this.aLong46 = local7[(int) (((long) this.anIntArray158[local154] ^ this.aLong46) & 0xFFL)] ^ this.aLong46 >>> 8;
		}
		this.aLong46 = this.aLong46 >>> 8 ^ local7[(int) (((long) (this.aBoolean199 ? 1 : 0) ^ this.aLong46) & 0xFFL)];
	}

	@OriginalMember(owner = "client!dea", name = "a", descriptor = "(BILclient!sg;I)V")
	public void method1966(@OriginalArg(1) int arg0, @OriginalArg(2) Class285 arg1, @OriginalArg(3) int arg2) {
		@Pc(12) int local12 = Static168.anIntArray257[arg0];
		if (this.anIntArray155[local12] != 0 && arg1.method7162(arg2) != null) {
			this.anIntArray155[local12] = arg2 | Integer.MIN_VALUE;
			this.method1965();
		}
	}

	@OriginalMember(owner = "client!dea", name = "a", descriptor = "(IIILclient!ir;ILclient!am;Lclient!sg;BIILclient!oa;I)Lclient!ba;")
	public Class23 method1967(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class156 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class16 arg4, @OriginalArg(6) Class285 arg5, @OriginalArg(8) int arg6, @OriginalArg(9) int arg7, @OriginalArg(10) Class9 arg8, @OriginalArg(11) int arg9) {
		@Pc(7) int local7 = 2048;
		@Pc(101) int local101;
		if (arg4 != null) {
			@Pc(19) boolean local19 = false;
			@Pc(21) boolean local21 = false;
			@Pc(23) boolean local23 = false;
			@Pc(25) boolean local25 = false;
			local7 = 2080;
			@Pc(42) int local42 = arg4.anIntArray47[arg1];
			@Pc(46) int local46 = local42 >>> 16;
			@Pc(51) Class6_Sub4_Sub15 local51 = arg2.method4108(local46);
			@Pc(55) int local55 = local42 & 0xFFFF;
			if (local51 != null) {
				local21 = local51.method6848(local55) | false;
				local19 = local51.method6851(local55) | false;
				local25 = local51.method6847(local55) | false;
				local23 = arg4.aBoolean41 | false;
			}
			if ((arg4.aBoolean39 || Static305.aBoolean438) && arg6 != -1 && arg4.anIntArray47.length > arg6) {
				local101 = arg4.anIntArray47[arg6];
				@Pc(105) int local105 = local101 >>> 16;
				@Pc(109) int local109 = local101 & 0xFFFF;
				@Pc(123) Class6_Sub4_Sub15 local123;
				if (local46 == local105) {
					local123 = local51;
				} else {
					local123 = arg2.method4108(local109 >>> 16);
				}
				if (local123 != null) {
					local21 |= local123.method6848(local109);
					local19 |= local123.method6851(local109);
					local25 |= local123.method6847(local109);
				}
			}
			if (local21) {
				local7 = 2208;
			}
			if (local19) {
				local7 |= 0x100;
			}
			if (local23) {
				local7 |= 0x200;
			}
			if (local25) {
				local7 |= 0x400;
			}
		}
		@Pc(186) long local186 = (long) (arg9 << 16) | (long) arg3 << 32 | (long) arg7;
		@Pc(188) Class245 local188 = Static180.aClass245_33;
		@Pc(196) Class23 local196;
		synchronized (Static180.aClass245_33) {
			local196 = (Class23) Static180.aClass245_33.method6082(local186);
		}
		if (local196 == null || arg8.method5468(local196.h(), local7) != 0) {
			if (local196 != null) {
				local7 = arg8.method5416(local7, local196.h());
			}
			@Pc(223) Class260[] local223 = new Class260[3];
			local101 = 0;
			if (!arg5.method7162(arg7).method7373() || !arg5.method7162(arg9).method7373() || !arg5.method7162(arg3).method7373()) {
				return null;
			}
			@Pc(255) Class260 local255 = arg5.method7162(arg7).method7371();
			if (local255 != null) {
				local101++;
				local223[0] = local255;
			}
			local255 = arg5.method7162(arg9).method7371();
			if (local255 != null) {
				local223[local101++] = local255;
			}
			local255 = arg5.method7162(arg3).method7371();
			if (local255 != null) {
				local223[local101++] = local255;
			}
			local255 = new Class260(local223, local101);
			@Pc(300) int local300 = local7 | 0x4000;
			local196 = arg8.method5404(local255, local300, Static558.anInt9501, 64, 768);
			for (@Pc(310) int local310 = 0; local310 < 5; local310++) {
				if (Static548.aShortArrayArray10[local310].length > this.anIntArray158[local310]) {
					local196.UA(Static223.aShortArray58[local310], Static548.aShortArrayArray10[local310][this.anIntArray158[local310]]);
				}
				if (this.anIntArray158[local310] < Static340.aShortArrayArray6[local310].length) {
					local196.UA(Static20.aShortArray65[local310], Static340.aShortArrayArray6[local310][this.anIntArray158[local310]]);
				}
			}
			local196.ia(local7);
			@Pc(369) Class245 local369 = Static180.aClass245_33;
			synchronized (Static180.aClass245_33) {
				Static180.aClass245_33.method6075(local196, local186);
			}
		}
		if (arg4 == null) {
			return local196;
		} else {
			local196 = local196.method7068((byte) 4, local7, true);
			return arg4.method644(arg6, arg1, local196, 2048, arg0);
		}
	}

	@OriginalMember(owner = "client!dea", name = "a", descriptor = "(BZ)V")
	public void method1968(@OriginalArg(1) boolean arg0) {
		this.aBoolean199 = arg0;
		this.method1965();
	}

	@OriginalMember(owner = "client!dea", name = "a", descriptor = "(IILclient!ir;Lclient!am;Lclient!oba;ILclient!ln;Lclient!wda;ILclient!oa;Lclient!sg;B)Lclient!ba;")
	public Class23 method1972(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class156 arg2, @OriginalArg(3) Class16 arg3, @OriginalArg(4) Interface15 arg4, @OriginalArg(6) Class203 arg5, @OriginalArg(7) Class343 arg6, @OriginalArg(8) int arg7, @OriginalArg(9) Class9 arg8, @OriginalArg(10) Class285 arg9) {
		if (this.anInt2174 != -1) {
			return arg6.method7994(this.anInt2174).method5331(arg7, arg0, arg8, arg4, arg2, arg3, arg1);
		}
		@Pc(36) int local36 = 2048;
		@Pc(44) boolean local44;
		@Pc(57) int local57;
		@Pc(127) int local127;
		@Pc(67) int local67;
		if (arg3 != null) {
			@Pc(40) boolean local40 = false;
			@Pc(42) boolean local42 = false;
			local44 = false;
			@Pc(46) boolean local46 = false;
			local57 = arg3.anIntArray47[arg1];
			local36 = 2080;
			local67 = local57 >>> 16;
			@Pc(72) Class6_Sub4_Sub15 local72 = arg2.method4108(local67);
			@Pc(76) int local76 = local57 & 0xFFFF;
			if (local72 != null) {
				local42 = local72.method6848(local76) | false;
				local40 = local72.method6851(local76) | false;
				local46 = local72.method6847(local76) | false;
				local44 = arg3.aBoolean41 | false;
			}
			if ((arg3.aBoolean39 || Static305.aBoolean438) && arg7 != -1 && arg3.anIntArray47.length > arg7) {
				local127 = arg3.anIntArray47[arg7];
				@Pc(131) int local131 = local127 >>> 16;
				@Pc(135) int local135 = local127 & 0xFFFF;
				@Pc(149) Class6_Sub4_Sub15 local149 = local67 == local131 ? local72 : arg2.method4108(local131);
				if (local149 != null) {
					local42 |= local149.method6848(local135);
					local40 |= local149.method6851(local135);
					local46 |= local149.method6847(local135);
				}
			}
			if (local42) {
				local36 = 2208;
			}
			if (local40) {
				local36 |= 0x100;
			}
			if (local44) {
				local36 |= 0x200;
			}
			if (local46) {
				local36 |= 0x400;
			}
		}
		@Pc(198) Class245 local198 = Static180.aClass245_33;
		@Pc(207) Class23 local207;
		synchronized (Static180.aClass245_33) {
			local207 = (Class23) Static180.aClass245_33.method6082(this.aLong46);
		}
		if (local207 == null || arg8.method5468(local207.h(), local36) != 0) {
			if (local207 != null) {
				local36 = arg8.method5416(local36, local207.h());
			}
			local44 = false;
			for (@Pc(238) int local238 = 0; local238 < 12; local238++) {
				local57 = this.anIntArray155[local238];
				if ((local57 & 0x40000000) == 0) {
					if ((local57 & Integer.MIN_VALUE) != 0 && !arg9.method7162(local57 & 0x3FFFFFFF).method7373()) {
						local44 = true;
					}
				} else if (!arg5.method4899(local57 & 0x3FFFFFFF).method3854(this.aBoolean199)) {
					local44 = true;
				}
			}
			if (local44) {
				return null;
			}
			@Pc(298) Class260[] local298 = new Class260[12];
			local127 = 0;
			for (@Pc(302) int local302 = 0; local302 < 12; local302++) {
				@Pc(309) int local309 = this.anIntArray155[local302];
				@Pc(324) Class260 local324;
				if ((local309 & 0x40000000) != 0) {
					local324 = arg5.method4899(local309 & 0x3FFFFFFF).method3856(this.aBoolean199);
					if (local324 != null) {
						local298[local127++] = local324;
					}
				} else if ((Integer.MIN_VALUE & local309) != 0) {
					local324 = arg9.method7162(local309 & 0x3FFFFFFF).method7371();
					if (local324 != null) {
						local298[local127++] = local324;
					}
				}
			}
			@Pc(364) int local364 = local36 | 0x4000;
			@Pc(370) Class260 local370 = new Class260(local298, local127);
			local207 = arg8.method5404(local370, local364, Static558.anInt9501, 64, 768);
			for (local67 = 0; local67 < 5; local67++) {
				if (this.anIntArray158[local67] < Static548.aShortArrayArray10[local67].length) {
					local207.UA(Static223.aShortArray58[local67], Static548.aShortArrayArray10[local67][this.anIntArray158[local67]]);
				}
				if (Static340.aShortArrayArray6[local67].length > this.anIntArray158[local67]) {
					local207.UA(Static20.aShortArray65[local67], Static340.aShortArrayArray6[local67][this.anIntArray158[local67]]);
				}
			}
			local207.ia(local36);
			@Pc(441) Class245 local441 = Static180.aClass245_33;
			synchronized (Static180.aClass245_33) {
				Static180.aClass245_33.method6075(local207, this.aLong46);
			}
		}
		if (arg3 == null) {
			return local207;
		} else {
			local207.method7068((byte) 4, local36, true);
			return arg3.method644(arg7, arg1, local207, 2048, arg0);
		}
	}

	@OriginalMember(owner = "client!dea", name = "b", descriptor = "(III)V")
	public void method1974(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray158[arg0] = arg1;
		this.method1965();
	}

	@OriginalMember(owner = "client!dea", name = "a", descriptor = "([IIZIZ[I)V")
	public void method1975(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int[] arg4) {
		this.anInt2174 = arg2;
		this.anIntArray158 = arg0;
		this.anIntArray155 = arg4;
		this.aBoolean199 = arg3;
		if (arg1 != this.anInt2173) {
			this.anIntArrayArray12 = null;
			this.anInt2173 = arg1;
		}
		this.method1965();
	}

	@OriginalMember(owner = "client!dea", name = "a", descriptor = "(ZILclient!wda;ILclient!oba;IILclient!ir;ILclient!pl;[Lclient!vb;Lclient!am;Lclient!oa;ILclient!am;IILclient!sg;Lclient!ln;)Lclient!ba;")
	public Class23 method1977(@OriginalArg(1) int arg0, @OriginalArg(2) Class343 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Interface15 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class156 arg6, @OriginalArg(9) Class250 arg7, @OriginalArg(10) Class324[] arg8, @OriginalArg(11) Class16 arg9, @OriginalArg(12) Class9 arg10, @OriginalArg(13) int arg11, @OriginalArg(14) Class16 arg12, @OriginalArg(15) int arg13, @OriginalArg(16) int arg14, @OriginalArg(17) Class285 arg15, @OriginalArg(18) Class203 arg16) {
		if (this.anInt2174 != -1) {
			return arg1.method7994(this.anInt2174).method5324(arg2, arg0, arg4, arg11, arg7, arg14, arg10, arg3, arg9, arg13, arg12, arg5, arg6, arg8);
		}
		@Pc(33) int local33 = arg5;
		@Pc(36) long local36 = this.aLong46;
		@Pc(39) int[] local39 = this.anIntArray155;
		if (arg9 != null && (arg9.anInt585 >= 0 || arg9.anInt575 >= 0)) {
			local39 = new int[12];
			for (@Pc(58) int local58 = 0; local58 < 12; local58++) {
				local39[local58] = this.anIntArray155[local58];
			}
			if (arg9.anInt585 >= 0) {
				if (arg9.anInt585 == 65535) {
					local39[5] = 0;
					local36 ^= 0xFFFFFFFF00000000L;
				} else {
					local39[5] = arg9.anInt585 | 0x40000000;
					local36 ^= (long) local39[5] << 32;
				}
			}
			if (arg9.anInt575 >= 0) {
				if (arg9.anInt575 == 65535) {
					local39[3] = 0;
					local36 ^= 0xFFFFFFFFL;
				} else {
					local39[3] = arg9.anInt575 | 0x40000000;
					local36 ^= local39[3];
				}
			}
		}
		@Pc(144) boolean local144 = false;
		@Pc(146) boolean local146 = false;
		@Pc(148) boolean local148 = false;
		@Pc(156) boolean local156 = arg9 != null || arg12 != null;
		@Pc(163) int local163 = arg8 == null ? 0 : arg8.length;
		@Pc(197) int local197;
		@Pc(202) int local202;
		for (@Pc(165) int local165 = 0; local165 < local163; local165++) {
			Static322.aClass6_Sub4_Sub15Array7[local165] = null;
			if (arg8[local165] != null) {
				@Pc(183) Class16 local183 = arg6.method4101(arg8[local165].anInt9238);
				if (local183.anIntArray47 != null) {
					Static554.aClass16Array2[local165] = local183;
					local156 = true;
					local197 = arg8[local165].anInt9242;
					local202 = arg8[local165].anInt9239;
					@Pc(207) int local207 = local183.anIntArray47[local197];
					Static322.aClass6_Sub4_Sub15Array7[local165] = arg6.method4108(local207 >>> 16);
					@Pc(220) int local220 = local207 & 0xFFFF;
					Static534.anIntArray806[local165] = local220;
					if (Static322.aClass6_Sub4_Sub15Array7[local165] != null) {
						local146 |= Static322.aClass6_Sub4_Sub15Array7[local165].method6848(local220);
						local144 |= Static322.aClass6_Sub4_Sub15Array7[local165].method6851(local220);
						local148 |= Static322.aClass6_Sub4_Sub15Array7[local165].method6847(local220);
					}
					if ((local183.aBoolean39 || Static305.aBoolean438) && local202 != -1 && local183.anIntArray47.length > local202) {
						Static226.anIntArray304[local165] = local183.anIntArray46[local197];
						Static108.anIntArray187[local165] = arg8[local165].anInt9237;
						@Pc(307) int local307 = local183.anIntArray47[local202];
						Static403.aClass6_Sub4_Sub15Array9[local165] = arg6.method4108(local307 >>> 16);
						@Pc(320) int local320 = local307 & 0xFFFF;
						Static576.anIntArray840[local165] = local320;
						if (Static403.aClass6_Sub4_Sub15Array9[local165] != null) {
							local146 |= Static403.aClass6_Sub4_Sub15Array9[local165].method6848(local320);
							local144 |= Static403.aClass6_Sub4_Sub15Array9[local165].method6851(local320);
							local148 |= Static403.aClass6_Sub4_Sub15Array9[local165].method6847(local320);
						}
					} else {
						Static226.anIntArray304[local165] = 0;
						Static108.anIntArray187[local165] = 0;
						Static403.aClass6_Sub4_Sub15Array9[local165] = null;
						Static576.anIntArray840[local165] = -1;
					}
				}
			}
		}
		@Pc(363) int local363 = -1;
		local197 = -1;
		local202 = 0;
		@Pc(369) Class6_Sub4_Sub15 local369 = null;
		@Pc(371) Class6_Sub4_Sub15 local371 = null;
		@Pc(373) int local373 = -1;
		@Pc(375) int local375 = -1;
		@Pc(377) int local377 = 0;
		@Pc(379) Class6_Sub4_Sub15 local379 = null;
		@Pc(381) Class6_Sub4_Sub15 local381 = null;
		if (local156) {
			local33 = arg5 | 0x20;
			@Pc(398) int local398;
			@Pc(464) int local464;
			if (arg9 != null) {
				local363 = arg9.anIntArray47[arg4];
				local398 = local363 >>> 16;
				local369 = arg6.method4108(local398);
				local363 &= 0xFFFF;
				if (local369 != null) {
					local146 |= local369.method6848(local363);
					local144 |= local369.method6851(local363);
					local148 |= local369.method6847(local363);
				}
				if ((arg9.aBoolean39 || Static305.aBoolean438) && arg11 != -1 && arg9.anIntArray47.length > arg11) {
					local202 = arg9.anIntArray46[arg4];
					local197 = arg9.anIntArray47[arg11];
					local464 = local197 >>> 16;
					local197 &= 0xFFFF;
					local371 = local398 == local464 ? local369 : arg6.method4108(local464);
					if (local371 != null) {
						local146 |= local371.method6848(local197);
						local144 |= local371.method6851(local197);
						local148 |= local371.method6847(local197);
					}
				}
			}
			if (arg12 != null) {
				local373 = arg12.anIntArray47[arg0];
				local398 = local373 >>> 16;
				local379 = arg6.method4108(local398);
				local373 &= 0xFFFF;
				if (local379 != null) {
					local146 |= local379.method6848(local373);
					local144 |= local379.method6851(local373);
					local148 |= local379.method6847(local373);
				}
				if ((arg12.aBoolean39 || Static305.aBoolean438) && arg13 != -1 && arg12.anIntArray47.length > arg13) {
					local377 = arg12.anIntArray46[arg0];
					local375 = arg12.anIntArray47[arg13];
					local464 = local375 >>> 16;
					local375 &= 0xFFFF;
					local381 = local464 == local398 ? local379 : arg6.method4108(local464);
					if (local381 != null) {
						local146 |= local381.method6848(local375);
						local144 |= local381.method6851(local375);
						local148 |= local381.method6847(local375);
					}
				}
			}
			if (local146) {
				local33 |= 0x80;
			}
			if (local144) {
				local33 |= 0x100;
			}
			if (local148) {
				local33 |= 0x400;
			}
		}
		@Pc(640) Class245 local640 = Static428.aClass245_59;
		@Pc(648) Class23 local648;
		synchronized (Static428.aClass245_59) {
			local648 = (Class23) Static428.aClass245_59.method6082(local36);
		}
		@Pc(656) Class169 local656 = null;
		if (this.anInt2173 != -1) {
			local656 = arg7.method6264(this.anInt2173);
		}
		@Pc(697) int local697;
		@Pc(703) int local703;
		if (local648 == null || arg10.method5468(local648.h(), local33) != 0 || local656 != null && local656.anIntArrayArray35 != null && this.anIntArrayArray12 == null) {
			if (local648 != null) {
				local33 = arg10.method5416(local33, local648.h());
			}
			@Pc(695) boolean local695 = false;
			local697 = 0;
			while (true) {
				if (local697 >= 12) {
					if (local695) {
						if (this.aLong47 != -1L) {
							@Pc(755) Class245 local755 = Static428.aClass245_59;
							synchronized (Static428.aClass245_59) {
								local648 = (Class23) Static428.aClass245_59.method6082(this.aLong47);
							}
						}
						if (local648 == null || arg10.method5468(local648.h(), local33) != 0 || local656 != null && local656.anIntArrayArray35 != null && this.anIntArrayArray12 == null) {
							return null;
						}
					} else {
						@Pc(791) Class260[] local791 = new Class260[12];
						@Pc(799) int local799;
						for (@Pc(793) int local793 = 0; local793 < 12; local793++) {
							local799 = local39[local793];
							@Pc(819) Class260 local819;
							if ((local799 & 0x40000000) != 0) {
								local819 = arg16.method4899(local799 & 0x3FFFFFFF).method3841(this.aBoolean199);
								if (local819 != null) {
									local791[local793] = local819;
								}
							} else if ((local799 & Integer.MIN_VALUE) != 0) {
								local819 = arg15.method7162(local799 & 0x3FFFFFFF).method7375();
								if (local819 != null) {
									local791[local793] = local819;
								}
							}
						}
						@Pc(875) int local875;
						if (local656 != null && local656.anIntArrayArray35 != null) {
							for (local799 = 0; local799 < local656.anIntArrayArray35.length; local799++) {
								if (local656.anIntArrayArray35[local799] != null && local791[local799] != null) {
									local875 = local656.anIntArrayArray35[local799][0];
									@Pc(882) int local882 = local656.anIntArrayArray35[local799][1];
									@Pc(889) int local889 = local656.anIntArrayArray35[local799][2];
									@Pc(898) int local898 = local656.anIntArrayArray35[local799][3] << 3;
									@Pc(907) int local907 = local656.anIntArrayArray35[local799][4] << 3;
									@Pc(916) int local916 = local656.anIntArrayArray35[local799][5] << 3;
									if (this.anIntArrayArray12 == null) {
										this.anIntArrayArray12 = new int[local656.anIntArrayArray35.length][];
									}
									if (this.anIntArrayArray12[local799] == null) {
										@Pc(938) int[] local938 = this.anIntArrayArray12[local799] = new int[15];
										if (local898 == 0 && local907 == 0 && local916 == 0) {
											local938[13] = -local882;
											local938[0] = local938[4] = local938[8] = 32768;
											local938[14] = -local889;
											local938[12] = -local875;
										} else {
											@Pc(983) int local983 = Class179.anIntArray757[local898];
											@Pc(987) int local987 = Class179.anIntArray756[local898];
											@Pc(991) int local991 = Class179.anIntArray757[local907];
											@Pc(995) int local995 = Class179.anIntArray756[local907];
											@Pc(999) int local999 = Class179.anIntArray757[local916];
											@Pc(1003) int local1003 = Class179.anIntArray756[local916];
											@Pc(1011) int local1011 = local987 * local999 + 8192 >> 14;
											@Pc(1019) int local1019 = local987 * local1003 + 8192 >> 14;
											local938[3] = local983 * local1003 + 8192 >> 14;
											local938[7] = local1011 * local991 + -local995 * -local1003 + 8192 >> 14;
											local938[0] = local1019 * local995 + local991 * local999 + 8192 >> 14;
											local938[5] = -local987;
											local938[1] = local1011 * local995 + -local1003 * local991 + 8192 >> 14;
											local938[2] = local995 * local983 + 8192 >> 14;
											local938[8] = local983 * local991 + 8192 >> 14;
											local938[6] = -local995 * local999 + local991 * local1019 + 8192 >> 14;
											local938[4] = local983 * local999 + 8192 >> 14;
											local938[12] = local938[3] * -local882 + local938[0] * -local875 + -local889 * local938[6] + 8192 >> 14;
											local938[14] = -local875 * local938[2] + local938[5] * -local882 + -local889 * local938[8] + 8192 >> 14;
											local938[13] = -local875 * local938[1] + local938[4] * -local882 + -local889 * local938[7] + 8192 >> 14;
										}
										local938[10] = local882;
										local938[9] = local875;
										local938[11] = local889;
									}
									if (local898 != 0 || local907 != 0 || local916 != 0) {
										local791[local799].method6430(local898, local916, local907);
									}
									if (local875 != 0 || local882 != 0 || local889 != 0) {
										local791[local799].method6426(local882, local875, local889);
									}
								}
							}
						}
						@Pc(1267) int local1267 = local33 | 0x4000;
						@Pc(1274) Class260 local1274 = new Class260(local791, local791.length);
						local648 = arg10.method5404(local1274, local1267, Static558.anInt9501, 64, 850);
						for (local875 = 0; local875 < 5; local875++) {
							if (this.anIntArray158[local875] < Static548.aShortArrayArray10[local875].length) {
								local648.UA(Static223.aShortArray58[local875], Static548.aShortArrayArray10[local875][this.anIntArray158[local875]]);
							}
							if (Static340.aShortArrayArray6[local875].length > this.anIntArray158[local875]) {
								local648.UA(Static20.aShortArray65[local875], Static340.aShortArrayArray6[local875][this.anIntArray158[local875]]);
							}
						}
						local648.ia(local33);
						@Pc(1341) Class245 local1341 = Static428.aClass245_59;
						synchronized (Static428.aClass245_59) {
							Static428.aClass245_59.method6075(local648, local36);
						}
						this.aLong47 = local36;
					}
					break;
				}
				local703 = local39[local697];
				if ((local703 & 0x40000000) == 0) {
					if ((Integer.MIN_VALUE & local703) != 0 && !arg15.method7162(local703 & 0x3FFFFFFF).method7372()) {
						local695 = true;
					}
				} else if (!arg16.method4899(local703 & 0x3FFFFFFF).method3853(this.aBoolean199)) {
					local695 = true;
				}
				local697++;
			}
		}
		@Pc(1363) Class23 local1363 = local648.method7068((byte) 4, local33, true);
		if (!local156) {
			return local1363;
		}
		@Pc(1369) int local1369 = 0;
		local697 = 1;
		while (local163 > local1369) {
			if (Static322.aClass6_Sub4_Sub15Array7[local1369] != null) {
				local1363.method7067(this.anIntArrayArray12 == null ? null : this.anIntArrayArray12[local1369], Static108.anIntArray187[local1369] - 1, Static534.anIntArray806[local1369], local697, Static322.aClass6_Sub4_Sub15Array7[local1369], Static403.aClass6_Sub4_Sub15Array9[local1369], Static576.anIntArray840[local1369], Static226.anIntArray304[local1369], false);
			}
			local1369++;
			local697 <<= 0x1;
		}
		if (local369 != null && local379 != null) {
			local1363.method7076(arg14 - 1, local363, local202, arg2 - 1, arg9.aBooleanArray3, local369, local379, local371, local373, local381, local377, false, local375, local197);
		} else if (local369 != null) {
			local1363.method7065(local369, local371, false, local202, arg2 - 1, local197, local363, 0);
		} else if (local379 != null) {
			local1363.method7065(local379, local381, false, local377, arg14 - 1, local375, local373, 0);
		}
		for (local703 = 0; local703 < local163; local703++) {
			Static322.aClass6_Sub4_Sub15Array7[local703] = null;
			Static403.aClass6_Sub4_Sub15Array9[local703] = null;
			Static554.aClass16Array2[local703] = null;
		}
		return local1363;
	}
}
