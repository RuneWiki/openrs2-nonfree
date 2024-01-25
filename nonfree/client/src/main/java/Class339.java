import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uea")
public final class Class339 {

	@OriginalMember(owner = "client!uea", name = "b", descriptor = "J")
	private long aLong247;

	@OriginalMember(owner = "client!uea", name = "g", descriptor = "I")
	private int anInt9381;

	@OriginalMember(owner = "client!uea", name = "q", descriptor = "Z")
	public boolean aBoolean765;

	@OriginalMember(owner = "client!uea", name = "t", descriptor = "[I")
	private int[] anIntArray745;

	@OriginalMember(owner = "client!uea", name = "u", descriptor = "[I")
	public int[] anIntArray746;

	@OriginalMember(owner = "client!uea", name = "w", descriptor = "J")
	private long aLong248;

	@OriginalMember(owner = "client!uea", name = "o", descriptor = "I")
	public int anInt9388 = -1;

	@OriginalMember(owner = "client!uea", name = "a", descriptor = "(Lclient!ki;IIIIIILclient!la;Lclient!vga;Lclient!ha;II)Lclient!ka;")
	public Class180 method8041(@OriginalArg(0) Class190 arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) Class200 arg5, @OriginalArg(8) Class359 arg6, @OriginalArg(9) Class126 arg7, @OriginalArg(10) int arg8, @OriginalArg(11) int arg9) {
		@Pc(7) int local7 = 2048;
		@Pc(94) int local94;
		@Pc(38) int local38;
		if (arg5 != null) {
			@Pc(11) boolean local11 = false;
			@Pc(13) boolean local13 = false;
			@Pc(15) boolean local15 = false;
			@Pc(17) boolean local17 = false;
			@Pc(28) int local28 = arg5.anIntArray389[arg1];
			local7 = 2080;
			local38 = local28 >>> 16;
			@Pc(42) int local42 = local28 & 0xFFFF;
			@Pc(47) Class5_Sub4_Sub2 local47 = arg6.method8413(local38);
			if (local47 != null) {
				local13 = local47.method652(local42) | false;
				local11 = local47.method657(local42) | false;
				local17 = local47.method654(local42) | false;
				local15 = arg5.aBoolean402 | false;
			}
			if ((arg5.aBoolean401 || Static35.aBoolean59) && arg2 != -1 && arg5.anIntArray389.length > arg2) {
				local94 = arg5.anIntArray389[arg2];
				@Pc(98) int local98 = local94 >>> 16;
				@Pc(102) int local102 = local94 & 0xFFFF;
				@Pc(112) Class5_Sub4_Sub2 local112;
				if (local98 == local38) {
					local112 = local47;
				} else {
					local112 = arg6.method8413(local102 >>> 16);
				}
				if (local112 != null) {
					local13 |= local112.method652(local102);
					local11 |= local112.method657(local102);
					local17 |= local112.method654(local102);
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
		@Pc(175) long local175 = (long) arg4 | (long) arg9 << 32 | (long) (arg8 << 16);
		@Pc(177) Class293 local177 = Static214.aClass293_26;
		@Pc(185) Class180 local185;
		synchronized (Static214.aClass293_26) {
			local185 = (Class180) Static214.aClass293_26.method6921(local175);
		}
		if (local185 == null || arg7.method6985(local185.ua(), local7) != 0) {
			if (local185 != null) {
				local7 = arg7.method6989(local7, local185.ua());
			}
			@Pc(215) Class349[] local215 = new Class349[3];
			local94 = 0;
			if (!arg0.method4302(arg4).method6823() || !arg0.method4302(arg8).method6823() || !arg0.method4302(arg9).method6823()) {
				return null;
			}
			@Pc(247) Class349 local247 = arg0.method4302(arg4).method6819();
			if (local247 != null) {
				local94++;
				local215[0] = local247;
			}
			local247 = arg0.method4302(arg8).method6819();
			if (local247 != null) {
				local215[local94++] = local247;
			}
			local247 = arg0.method4302(arg9).method6819();
			if (local247 != null) {
				local215[local94++] = local247;
			}
			@Pc(286) int local286 = local7 | 0x4000;
			local247 = new Class349(local215, local94);
			local185 = arg7.method6982(local247, local286, Static70.anInt9228, 64, 768);
			for (@Pc(302) int local302 = 0; local302 < 5; local302++) {
				for (local38 = 0; local38 < Static550.aShortArrayArrayArray3.length; local38++) {
					if (this.anIntArray746[local302] < Static550.aShortArrayArrayArray3[local38][local302].length) {
						local185.ia(Static347.aShortArrayArray20[local38][local302], Static550.aShortArrayArrayArray3[local38][local302][this.anIntArray746[local302]]);
					}
				}
			}
			local185.s(local7);
			@Pc(350) Class293 local350 = Static214.aClass293_26;
			synchronized (Static214.aClass293_26) {
				Static214.aClass293_26.method6925(local175, local185);
			}
		}
		if (arg5 == null) {
			return local185;
		} else {
			local185 = local185.method7945((byte) 4, local7, true);
			return arg5.method4462(2048, arg3, arg1, local185, arg2);
		}
	}

	@OriginalMember(owner = "client!uea", name = "a", descriptor = "(B)V")
	private void method8042() {
		this.aLong247 = -1L;
		@Pc(10) long[] local10 = Class335.aLongArray16;
		this.aLong247 = this.aLong247 >>> 8 ^ local10[(int) ((this.aLong247 ^ (long) (this.anInt9381 >> 8)) & 0xFFL)];
		this.aLong247 = local10[(int) (((long) this.anInt9381 ^ this.aLong247) & 0xFFL)] ^ this.aLong247 >>> 8;
		for (@Pc(50) int local50 = 0; local50 < 12; local50++) {
			this.aLong247 = this.aLong247 >>> 8 ^ local10[(int) (((long) (this.anIntArray745[local50] >> 24) ^ this.aLong247) & 0xFFL)];
			this.aLong247 = this.aLong247 >>> 8 ^ local10[(int) ((this.aLong247 ^ (long) (this.anIntArray745[local50] >> 16)) & 0xFFL)];
			this.aLong247 = local10[(int) (((long) (this.anIntArray745[local50] >> 8) ^ this.aLong247) & 0xFFL)] ^ this.aLong247 >>> 8;
			this.aLong247 = this.aLong247 >>> 8 ^ local10[(int) ((this.aLong247 ^ (long) this.anIntArray745[local50]) & 0xFFL)];
		}
		for (@Pc(146) int local146 = 0; local146 < 5; local146++) {
			this.aLong247 = local10[(int) (((long) this.anIntArray746[local146] ^ this.aLong247) & 0xFFL)] ^ this.aLong247 >>> 8;
		}
		this.aLong247 = local10[(int) (((long) (this.aBoolean765 ? 1 : 0) ^ this.aLong247) & 0xFFL)] ^ this.aLong247 >>> 8;
	}

	@OriginalMember(owner = "client!uea", name = "a", descriptor = "(ILclient!la;Lclient!vga;Lclient!ki;IBILclient!ha;Lclient!bj;Lclient!uq;Lclient!hf;I)Lclient!ka;")
	public Class180 method8043(@OriginalArg(0) int arg0, @OriginalArg(1) Class200 arg1, @OriginalArg(2) Class359 arg2, @OriginalArg(3) Class190 arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class126 arg6, @OriginalArg(8) Interface4 arg7, @OriginalArg(9) Class348 arg8, @OriginalArg(10) Class138 arg9) {
		if (this.anInt9388 != -1) {
			return arg9.method3202(this.anInt9388).method6484(arg6, arg7, (Class141) null, arg2, arg5, arg0, arg1, arg4);
		}
		@Pc(29) int local29 = 2048;
		@Pc(39) boolean local39;
		@Pc(56) int local56;
		@Pc(119) int local119;
		@Pc(60) int local60;
		@Pc(123) int local123;
		if (arg1 != null) {
			@Pc(33) boolean local33 = false;
			@Pc(35) boolean local35 = false;
			@Pc(37) boolean local37 = false;
			local39 = false;
			local29 = 2080;
			local56 = arg1.anIntArray389[arg0];
			local60 = local56 >>> 16;
			@Pc(64) int local64 = local56 & 0xFFFF;
			@Pc(69) Class5_Sub4_Sub2 local69 = arg2.method8413(local60);
			if (local69 != null) {
				local35 = local69.method652(local64) | false;
				local33 = local69.method657(local64) | false;
				local39 = local69.method654(local64) | false;
				local37 = arg1.aBoolean402 | false;
			}
			if ((arg1.aBoolean401 || Static35.aBoolean59) && arg5 != -1 && arg5 < arg1.anIntArray389.length) {
				local119 = arg1.anIntArray389[arg5];
				local123 = local119 >>> 16;
				@Pc(127) int local127 = local119 & 0xFFFF;
				@Pc(141) Class5_Sub4_Sub2 local141 = local123 == local60 ? local69 : arg2.method8413(local123);
				if (local141 != null) {
					local35 |= local141.method652(local127);
					local33 |= local141.method657(local127);
					local39 |= local141.method654(local127);
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
		@Pc(197) Class293 local197 = Static214.aClass293_26;
		@Pc(206) Class180 local206;
		synchronized (Static214.aClass293_26) {
			local206 = (Class180) Static214.aClass293_26.method6921(this.aLong247);
		}
		if (local206 == null || arg6.method6985(local206.ua(), local29) != 0) {
			if (local206 != null) {
				local29 = arg6.method6989(local29, local206.ua());
			}
			local39 = false;
			for (local56 = 0; local56 < 12; local56++) {
				local119 = this.anIntArray745[local56];
				if ((local119 & 0x40000000) == 0) {
					if ((local119 & Integer.MIN_VALUE) != 0 && !arg3.method4302(local119 & 0x3FFFFFFF).method6823()) {
						local39 = true;
					}
				} else if (!arg8.method8197(local119 & 0x3FFFFFFF).method7759(this.aBoolean765)) {
					local39 = true;
				}
			}
			if (local39) {
				return null;
			}
			@Pc(297) Class349[] local297 = new Class349[12];
			@Pc(299) int local299 = 0;
			for (@Pc(301) int local301 = 0; local301 < 12; local301++) {
				local60 = this.anIntArray745[local301];
				@Pc(328) Class349 local328;
				if ((local60 & 0x40000000) != 0) {
					local328 = arg8.method8197(local60 & 0x3FFFFFFF).method7756(this.aBoolean765);
					if (local328 != null) {
						local297[local299++] = local328;
					}
				} else if ((Integer.MIN_VALUE & local60) != 0) {
					local328 = arg3.method4302(local60 & 0x3FFFFFFF).method6819();
					if (local328 != null) {
						local297[local299++] = local328;
					}
				}
			}
			@Pc(365) Class349 local365 = new Class349(local297, local299);
			@Pc(369) int local369 = local29 | 0x4000;
			local206 = arg6.method6982(local365, local369, Static70.anInt9228, 64, 768);
			for (local123 = 0; local123 < 5; local123++) {
				for (@Pc(383) int local383 = 0; local383 < Static550.aShortArrayArrayArray3.length; local383++) {
					if (this.anIntArray746[local123] < Static550.aShortArrayArrayArray3[local383][local123].length) {
						local206.ia(Static347.aShortArrayArray20[local383][local123], Static550.aShortArrayArrayArray3[local383][local123][this.anIntArray746[local123]]);
					}
				}
			}
			local206.s(local29);
			@Pc(427) Class293 local427 = Static214.aClass293_26;
			synchronized (Static214.aClass293_26) {
				Static214.aClass293_26.method6925(this.aLong247, local206);
			}
		}
		if (arg1 == null) {
			return local206;
		} else {
			local206.method7945((byte) 4, local29, true);
			return arg1.method4462(2048, arg4, arg0, local206, arg5);
		}
	}

	@OriginalMember(owner = "client!uea", name = "a", descriptor = "(IIILclient!uq;)V")
	public void method8045(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class348 arg2) {
		if (arg0 == -1) {
			this.anIntArray745[arg1] = 0;
		} else if (arg2.method8197(arg0) == null) {
			return;
		} else {
			this.anIntArray745[arg1] = arg0 | 0x40000000;
			this.method8042();
		}
	}

	@OriginalMember(owner = "client!uea", name = "a", descriptor = "(Lclient!vga;IZLclient!uq;ILclient!ha;I[ILclient!bj;I[Lclient!rca;Lclient!la;Lclient!hf;IIIILclient!ki;Lclient!id;ILclient!la;)Lclient!ka;")
	public Class180 method8048(@OriginalArg(0) Class359 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class348 arg2, @OriginalArg(5) Class126 arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int[] arg5, @OriginalArg(8) Interface4 arg6, @OriginalArg(9) int arg7, @OriginalArg(10) Class299[] arg8, @OriginalArg(11) Class200 arg9, @OriginalArg(12) Class138 arg10, @OriginalArg(13) int arg11, @OriginalArg(14) int arg12, @OriginalArg(15) int arg13, @OriginalArg(16) int arg14, @OriginalArg(17) Class190 arg15, @OriginalArg(18) Class151 arg16, @OriginalArg(19) int arg17, @OriginalArg(20) Class200 arg18) {
		if (this.anInt9388 != -1) {
			return arg10.method3202(this.anInt9388).method6477(arg5, arg18, (Class141) null, arg7, arg16, arg9, arg11, arg4, arg13, arg6, arg12, arg17, arg3, arg1, arg14, arg8, arg0);
		}
		@Pc(37) int local37 = arg7;
		@Pc(40) long local40 = this.aLong247;
		@Pc(43) int[] local43 = this.anIntArray745;
		if (arg18 != null && (arg18.anInt4889 >= 0 || arg18.anInt4879 >= 0)) {
			local43 = new int[12];
			for (@Pc(62) int local62 = 0; local62 < 12; local62++) {
				local43[local62] = this.anIntArray745[local62];
			}
			if (arg18.anInt4889 >= 0) {
				if (arg18.anInt4889 == 65535) {
					local43[5] = 0;
					local40 ^= 0xFFFFFFFF00000000L;
				} else {
					local43[5] = arg18.anInt4889 | 0x40000000;
					local40 ^= (long) local43[5] << 32;
				}
			}
			if (arg18.anInt4879 >= 0) {
				if (arg18.anInt4879 == 65535) {
					local43[3] = 0;
					local40 ^= 0xFFFFFFFFL;
				} else {
					local43[3] = arg18.anInt4879 | 0x40000000;
					local40 ^= (long) local43[3];
				}
			}
		}
		@Pc(145) boolean local145 = false;
		@Pc(147) boolean local147 = false;
		@Pc(149) boolean local149 = false;
		@Pc(157) boolean local157 = arg18 != null || arg9 != null;
		@Pc(164) int local164 = arg8 == null ? 0 : arg8.length;
		@Pc(198) int local198;
		@Pc(203) int local203;
		for (@Pc(166) int local166 = 0; local166 < local164; local166++) {
			Static447.aClass5_Sub4_Sub2Array2[local166] = null;
			if (arg8[local166] != null) {
				@Pc(184) Class200 local184 = arg0.method8415(arg8[local166].anInt8050);
				if (local184.anIntArray389 != null) {
					Static414.aClass200Array1[local166] = local184;
					local157 = true;
					local198 = arg8[local166].anInt8045;
					local203 = arg8[local166].anInt8049;
					@Pc(208) int local208 = local184.anIntArray389[local198];
					Static447.aClass5_Sub4_Sub2Array2[local166] = arg0.method8413(local208 >>> 16);
					@Pc(221) int local221 = local208 & 0xFFFF;
					Static1.anIntArray504[local166] = local221;
					if (Static447.aClass5_Sub4_Sub2Array2[local166] != null) {
						local147 |= Static447.aClass5_Sub4_Sub2Array2[local166].method652(local221);
						local145 |= Static447.aClass5_Sub4_Sub2Array2[local166].method657(local221);
						local149 |= Static447.aClass5_Sub4_Sub2Array2[local166].method654(local221);
					}
					if ((local184.aBoolean401 || Static35.aBoolean59) && local203 != -1 && local184.anIntArray389.length > local203) {
						Static100.anIntArray135[local166] = local184.anIntArray388[local198];
						Static471.anIntArray636[local166] = arg8[local166].anInt8044;
						@Pc(289) int local289 = local184.anIntArray389[local203];
						Static496.aClass5_Sub4_Sub2Array4[local166] = arg0.method8413(local289 >>> 16);
						@Pc(302) int local302 = local289 & 0xFFFF;
						Static235.anIntArray338[local166] = local302;
						if (Static496.aClass5_Sub4_Sub2Array4[local166] != null) {
							local147 |= Static496.aClass5_Sub4_Sub2Array4[local166].method652(local302);
							local145 |= Static496.aClass5_Sub4_Sub2Array4[local166].method657(local302);
							local149 |= Static496.aClass5_Sub4_Sub2Array4[local166].method654(local302);
						}
					} else {
						Static100.anIntArray135[local166] = 0;
						Static471.anIntArray636[local166] = 0;
						Static496.aClass5_Sub4_Sub2Array4[local166] = null;
						Static235.anIntArray338[local166] = -1;
					}
				}
			}
		}
		@Pc(361) int local361 = -1;
		local198 = -1;
		local203 = 0;
		@Pc(367) Class5_Sub4_Sub2 local367 = null;
		@Pc(369) Class5_Sub4_Sub2 local369 = null;
		@Pc(371) int local371 = -1;
		@Pc(373) int local373 = -1;
		@Pc(375) int local375 = 0;
		@Pc(377) Class5_Sub4_Sub2 local377 = null;
		@Pc(379) Class5_Sub4_Sub2 local379 = null;
		if (local157) {
			local37 = arg7 | 0x20;
			@Pc(396) int local396;
			@Pc(459) int local459;
			if (arg18 != null) {
				local361 = arg18.anIntArray389[arg11];
				local396 = local361 >>> 16;
				local361 &= 0xFFFF;
				local367 = arg0.method8413(local396);
				if (local367 != null) {
					local147 |= local367.method652(local361);
					local145 |= local367.method657(local361);
					local149 |= local367.method654(local361);
				}
				if ((arg18.aBoolean401 || Static35.aBoolean59) && arg4 != -1 && arg4 < arg18.anIntArray389.length) {
					local203 = arg18.anIntArray388[arg11];
					local198 = arg18.anIntArray389[arg4];
					local459 = local198 >>> 16;
					local198 &= 0xFFFF;
					local369 = local396 == local459 ? local367 : arg0.method8413(local459);
					if (local369 != null) {
						local147 |= local369.method652(local198);
						local145 |= local369.method657(local198);
						local149 |= local369.method654(local198);
					}
				}
			}
			if (arg9 != null) {
				local371 = arg9.anIntArray389[arg12];
				local396 = local371 >>> 16;
				local371 &= 0xFFFF;
				local377 = arg0.method8413(local396);
				if (local377 != null) {
					local147 |= local377.method652(local371);
					local145 |= local377.method657(local371);
					local149 |= local377.method654(local371);
				}
				if ((arg9.aBoolean401 || Static35.aBoolean59) && arg17 != -1 && arg9.anIntArray389.length > arg17) {
					local375 = arg9.anIntArray388[arg12];
					local373 = arg9.anIntArray389[arg17];
					local459 = local373 >>> 16;
					local373 &= 0xFFFF;
					local379 = local396 == local459 ? local377 : arg0.method8413(local459);
					if (local379 != null) {
						local147 |= local379.method652(local373);
						local145 |= local379.method657(local373);
						local149 |= local379.method654(local373);
					}
				}
			}
			if (local147) {
				local37 |= 0x80;
			}
			if (local145) {
				local37 |= 0x100;
			}
			if (local149) {
				local37 |= 0x400;
			}
		}
		@Pc(624) Class293 local624 = Static15.aClass293_5;
		@Pc(632) Class180 local632;
		synchronized (Static15.aClass293_5) {
			local632 = (Class180) Static15.aClass293_5.method6921(local40);
		}
		@Pc(640) Class295 local640 = null;
		if (this.anInt9381 != -1) {
			local640 = arg16.method3578(this.anInt9381);
		}
		@Pc(670) boolean local670;
		@Pc(672) int local672;
		@Pc(678) int local678;
		@Pc(723) int local723;
		@Pc(729) int local729;
		@Pc(793) int local793;
		if (local632 == null || arg3.method6985(local632.ua(), local37) != 0) {
			if (local632 != null) {
				local37 = arg3.method6989(local37, local632.ua());
			}
			local670 = false;
			for (local672 = 0; local672 < 12; local672++) {
				local678 = local43[local672];
				if ((local678 & 0x40000000) == 0) {
					if ((Integer.MIN_VALUE & local678) != 0 && !arg15.method4302(local678 & 0x3FFFFFFF).method6818()) {
						local670 = true;
					}
				} else if (!arg2.method8197(local678 & 0x3FFFFFFF).method7747(this.aBoolean765)) {
					local670 = true;
				}
			}
			if (local670) {
				if (this.aLong248 != -1L) {
					@Pc(995) Class293 local995 = Static15.aClass293_5;
					synchronized (Static15.aClass293_5) {
						local632 = (Class180) Static15.aClass293_5.method6921(this.aLong248);
					}
				}
				if (local632 == null || arg3.method6985(local632.ua(), local37) != 0) {
					return null;
				}
			} else {
				@Pc(721) Class349[] local721 = new Class349[12];
				for (local723 = 0; local723 < 12; local723++) {
					local729 = local43[local723];
					@Pc(744) Class349 local744;
					if ((local729 & 0x40000000) != 0) {
						local744 = arg2.method8197(local729 & 0x3FFFFFFF).method7749(this.aBoolean765);
						if (local744 != null) {
							local721[local723] = local744;
						}
					} else if ((local729 & Integer.MIN_VALUE) != 0) {
						local744 = arg15.method4302(local729 & 0x3FFFFFFF).method6822();
						if (local744 != null) {
							local721[local723] = local744;
						}
					}
				}
				@Pc(795) int local795;
				if (local640 != null && local640.anIntArrayArray48 != null) {
					for (local729 = 0; local729 < local640.anIntArrayArray48.length; local729++) {
						if (local721[local729] != null) {
							local793 = 0;
							local795 = 0;
							@Pc(797) int local797 = 0;
							@Pc(799) int local799 = 0;
							@Pc(801) int local801 = 0;
							@Pc(803) int local803 = 0;
							if (local640.anIntArrayArray48[local729] != null) {
								local801 = local640.anIntArrayArray48[local729][4] << 3;
								local795 = local640.anIntArrayArray48[local729][1];
								local799 = local640.anIntArrayArray48[local729][3] << 3;
								local803 = local640.anIntArrayArray48[local729][5] << 3;
								local793 = local640.anIntArrayArray48[local729][0];
								local797 = local640.anIntArrayArray48[local729][2];
							}
							if (local799 != 0 || local801 != 0 || local803 != 0) {
								local721[local729].method8220(local803, local801, local799);
							}
							if (local793 != 0 || local795 != 0 || local797 != 0) {
								local721[local729].method8211(local793, local795, local797);
							}
						}
					}
				}
				@Pc(897) int local897 = local37 | 0x4000;
				@Pc(904) Class349 local904 = new Class349(local721, local721.length);
				local632 = arg3.method6982(local904, local897, Static70.anInt9228, 64, 850);
				for (local793 = 0; local793 < 5; local793++) {
					for (local795 = 0; local795 < Static550.aShortArrayArrayArray3.length; local795++) {
						if (Static550.aShortArrayArrayArray3[local795][local793].length > this.anIntArray746[local793]) {
							local632.ia(Static347.aShortArrayArray20[local795][local793], Static550.aShortArrayArrayArray3[local795][local793][this.anIntArray746[local793]]);
						}
					}
				}
				local632.s(local37);
				@Pc(968) Class293 local968 = Static15.aClass293_5;
				synchronized (Static15.aClass293_5) {
					Static15.aClass293_5.method6925(local40, local632);
				}
				this.aLong248 = local40;
			}
		}
		@Pc(1029) Class180 local1029 = local632.method7945((byte) 4, local37, true);
		local670 = false;
		if (arg5 != null) {
			for (local672 = 0; local672 < 12; local672++) {
				if (arg5[local672] != -1) {
					local670 = true;
				}
			}
		}
		if (!local157 && !local670) {
			return local1029;
		}
		@Pc(1058) Class117[] local1058 = null;
		if (local640 != null) {
			local1058 = local640.method6939(arg3);
		}
		if (local670 && local1058 != null) {
			for (local678 = 0; local678 < 12; local678++) {
				if (local1058[local678] != null) {
					local1029.method7952(local1058[local678], 0x1 << local678, true);
				}
			}
		}
		local678 = 0;
		local723 = 1;
		while (local678 < local164) {
			if (Static447.aClass5_Sub4_Sub2Array2[local678] != null) {
				local1029.method7933(Static471.anIntArray636[local678] - 1, Static100.anIntArray135[local678], Static235.anIntArray338[local678], false, Static1.anIntArray504[local678], local723, (int[]) null, Static496.aClass5_Sub4_Sub2Array4[local678], Static447.aClass5_Sub4_Sub2Array2[local678]);
			}
			local678++;
			local723 <<= 0x1;
		}
		if (local670) {
			for (local729 = 0; local729 < 12; local729++) {
				if (arg5[local729] != -1) {
					local793 = arg5[local729] - arg14;
					local793 &= 0x3FFF;
					@Pc(1166) Class117 local1166 = arg3.method6998();
					local1166.method7242(local793);
					local1029.method7952(local1166, 0x1 << local729, false);
				}
			}
		}
		if (local670 && local1058 != null) {
			for (local729 = 0; local729 < 12; local729++) {
				if (local1058[local729] != null) {
					local1029.method7952(local1058[local729], 0x1 << local729, false);
				}
			}
		}
		if (local367 != null && local377 != null) {
			local1029.method7927(local379, local377, local361, local375, local198, arg13 - 1, local373, false, local369, local371, arg18.aBooleanArray34, local367, arg1 - 1, local203);
		} else if (local367 != null) {
			local1029.method7930(local367, false, local198, local203, local361, 0, arg13 - 1, local369);
		} else if (local377 != null) {
			local1029.method7930(local377, false, local373, local375, local371, 0, arg1 - 1, local379);
		}
		for (local729 = 0; local729 < local164; local729++) {
			Static447.aClass5_Sub4_Sub2Array2[local729] = null;
			Static496.aClass5_Sub4_Sub2Array4[local729] = null;
			Static414.aClass200Array1[local729] = null;
		}
		return local1029;
	}

	@OriginalMember(owner = "client!uea", name = "a", descriptor = "(Z[IIII[I)V")
	public void method8050(@OriginalArg(0) boolean arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int[] arg4) {
		if (this.anInt9381 != arg3) {
			this.anInt9381 = arg3;
		}
		this.anIntArray746 = arg4;
		this.anIntArray745 = arg1;
		this.anInt9388 = arg2;
		this.aBoolean765 = arg0;
		this.method8042();
	}

	@OriginalMember(owner = "client!uea", name = "a", descriptor = "(III)V")
	public void method8051(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray746[arg0] = arg1;
		this.method8042();
	}

	@OriginalMember(owner = "client!uea", name = "a", descriptor = "(IZ)V")
	public void method8053(@OriginalArg(1) boolean arg0) {
		this.aBoolean765 = arg0;
		this.method8042();
	}

	@OriginalMember(owner = "client!uea", name = "a", descriptor = "(ILclient!ki;II)V")
	public void method8054(@OriginalArg(0) int arg0, @OriginalArg(1) Class190 arg1, @OriginalArg(2) int arg2) {
		@Pc(7) int local7 = Static52.anIntArray65[arg2];
		if (arg1.method4302(arg0) != null) {
			this.anIntArray745[local7] = arg0 | Integer.MIN_VALUE;
			this.method8042();
		}
	}
}
