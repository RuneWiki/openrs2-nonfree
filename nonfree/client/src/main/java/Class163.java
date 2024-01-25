import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!in")
public final class Class163 {

	@OriginalMember(owner = "client!in", name = "b", descriptor = "J")
	private long aLong133;

	@OriginalMember(owner = "client!in", name = "d", descriptor = "Z")
	public boolean aBoolean393;

	@OriginalMember(owner = "client!in", name = "e", descriptor = "J")
	private long aLong134;

	@OriginalMember(owner = "client!in", name = "f", descriptor = "[I")
	public int[] anIntArray329;

	@OriginalMember(owner = "client!in", name = "j", descriptor = "I")
	private int anInt4835;

	@OriginalMember(owner = "client!in", name = "r", descriptor = "[I")
	private int[] anIntArray330;

	@OriginalMember(owner = "client!in", name = "h", descriptor = "I")
	public int anInt4833 = -1;

	@OriginalMember(owner = "client!in", name = "a", descriptor = "(IZ)V")
	public void method4018(@OriginalArg(1) boolean arg0) {
		this.aBoolean393 = arg0;
		this.method4021();
	}

	@OriginalMember(owner = "client!in", name = "a", descriptor = "(Lclient!cp;IBLclient!ha;Lclient!hn;ILclient!un;ILclient!pv;ILclient!sd;Lclient!dk;)Lclient!ka;")
	public Class25 method4019(@OriginalArg(0) Interface5 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class87 arg2, @OriginalArg(4) Class149 arg3, @OriginalArg(6) Class344 arg4, @OriginalArg(7) int arg5, @OriginalArg(8) Class267 arg6, @OriginalArg(9) int arg7, @OriginalArg(10) Class303 arg8, @OriginalArg(11) Class76 arg9) {
		if (this.anInt4833 != -1) {
			return arg9.method1676(this.anInt4833).method5784(arg7, arg0, arg5, arg2, arg1, arg3, arg8);
		}
		@Pc(34) int local34 = 2048;
		@Pc(42) boolean local42;
		@Pc(57) int local57;
		@Pc(124) int local124;
		@Pc(65) int local65;
		@Pc(128) int local128;
		if (arg3 != null) {
			@Pc(38) boolean local38 = false;
			@Pc(40) boolean local40 = false;
			local42 = false;
			@Pc(44) boolean local44 = false;
			local57 = arg3.anIntArray308[arg7];
			local34 = 2080;
			local65 = local57 >>> 16;
			@Pc(70) Class2_Sub5_Sub5 local70 = arg8.method7206(local65);
			@Pc(74) int local74 = local57 & 0xFFFF;
			if (local70 != null) {
				local40 = local70.method1835(local74) | false;
				local38 = local70.method1838(local74) | false;
				local44 = local70.method1837(local74) | false;
				local42 = arg3.aBoolean375 | false;
			}
			if ((arg3.aBoolean379 || Static424.aBoolean577) && arg5 != -1 && arg5 < arg3.anIntArray308.length) {
				local124 = arg3.anIntArray308[arg5];
				local128 = local124 >>> 16;
				@Pc(132) int local132 = local124 & 0xFFFF;
				@Pc(142) Class2_Sub5_Sub5 local142 = local128 == local65 ? local70 : arg8.method7206(local128);
				if (local142 != null) {
					local40 |= local142.method1835(local132);
					local38 |= local142.method1838(local132);
					local44 |= local142.method1837(local132);
				}
			}
			if (local40) {
				local34 = 2208;
			}
			if (local38) {
				local34 |= 0x100;
			}
			if (local42) {
				local34 |= 0x200;
			}
			if (local44) {
				local34 |= 0x400;
			}
		}
		@Pc(191) Class233 local191 = Static58.aClass233_5;
		@Pc(200) Class25 local200;
		synchronized (Static58.aClass233_5) {
			local200 = (Class25) Static58.aClass233_5.method5669(this.aLong133);
		}
		if (local200 == null || arg2.method7950(local200.ua(), local34) != 0) {
			if (local200 != null) {
				local34 = arg2.method7952(local34, local200.ua());
			}
			local42 = false;
			for (@Pc(228) int local228 = 0; local228 < 12; local228++) {
				local57 = this.anIntArray330[local228];
				if ((local57 & 0x40000000) == 0) {
					if ((Integer.MIN_VALUE & local57) != 0 && !arg4.method8016(local57 & 0x3FFFFFFF).method7661()) {
						local42 = true;
					}
				} else if (!arg6.method6597(local57 & 0x3FFFFFFF).method6276(this.aBoolean393)) {
					local42 = true;
				}
			}
			if (local42) {
				return null;
			}
			@Pc(283) Class379[] local283 = new Class379[12];
			local124 = 0;
			for (@Pc(287) int local287 = 0; local287 < 12; local287++) {
				@Pc(293) int local293 = this.anIntArray330[local287];
				@Pc(313) Class379 local313;
				if ((local293 & 0x40000000) != 0) {
					local313 = arg6.method6597(local293 & 0x3FFFFFFF).method6283(this.aBoolean393);
					if (local313 != null) {
						local283[local124++] = local313;
					}
				} else if ((local293 & Integer.MIN_VALUE) != 0) {
					local313 = arg4.method8016(local293 & 0x3FFFFFFF).method7663();
					if (local313 != null) {
						local283[local124++] = local313;
					}
				}
			}
			@Pc(347) int local347 = local34 | 0x4000;
			@Pc(353) Class379 local353 = new Class379(local283, local124);
			local200 = arg2.method7975(local353, local347, Static599.anInt9851, 64, 768);
			for (local65 = 0; local65 < 5; local65++) {
				for (local128 = 0; local128 < Static200.aShortArrayArrayArray5.length; local128++) {
					if (this.anIntArray329[local65] < Static200.aShortArrayArrayArray5[local128][local65].length) {
						local200.ia(Static256.aShortArrayArray15[local128][local65], Static200.aShortArrayArrayArray5[local128][local65][this.anIntArray329[local65]]);
					}
				}
			}
			local200.s(local34);
			@Pc(413) Class233 local413 = Static58.aClass233_5;
			synchronized (Static58.aClass233_5) {
				Static58.aClass233_5.method5662(local200, this.aLong133);
			}
		}
		if (arg3 == null) {
			return local200;
		} else {
			local200.method7732((byte) 4, local34, true);
			return arg3.method3735(arg5, 2048, local200, arg1, arg7);
		}
	}

	@OriginalMember(owner = "client!in", name = "a", descriptor = "(IBLclient!sd;ILclient!ha;IIILclient!un;Lclient!hn;II)Lclient!ka;")
	public Class25 method4020(@OriginalArg(0) int arg0, @OriginalArg(2) Class303 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class87 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) Class344 arg7, @OriginalArg(9) Class149 arg8, @OriginalArg(11) int arg9) {
		@Pc(5) int local5 = 2048;
		@Pc(96) int local96;
		@Pc(36) int local36;
		if (arg8 != null) {
			@Pc(9) boolean local9 = false;
			@Pc(11) boolean local11 = false;
			@Pc(13) boolean local13 = false;
			@Pc(15) boolean local15 = false;
			local5 = 2080;
			@Pc(32) int local32 = arg8.anIntArray308[arg2];
			local36 = local32 >>> 16;
			@Pc(43) Class2_Sub5_Sub5 local43 = arg1.method7206(local36);
			@Pc(47) int local47 = local32 & 0xFFFF;
			if (local43 != null) {
				local11 = local43.method1835(local47) | false;
				local9 = local43.method1838(local47) | false;
				local15 = local43.method1837(local47) | false;
				local13 = arg8.aBoolean375 | false;
			}
			if ((arg8.aBoolean379 || Static424.aBoolean577) && arg6 != -1 && arg6 < arg8.anIntArray308.length) {
				local96 = arg8.anIntArray308[arg6];
				@Pc(100) int local100 = local96 >>> 16;
				@Pc(104) int local104 = local96 & 0xFFFF;
				@Pc(114) Class2_Sub5_Sub5 local114;
				if (local100 == local36) {
					local114 = local43;
				} else {
					local114 = arg1.method7206(local104 >>> 16);
				}
				if (local114 != null) {
					local11 |= local114.method1835(local104);
					local9 |= local114.method1838(local104);
					local15 |= local114.method1837(local104);
				}
			}
			if (local11) {
				local5 = 2208;
			}
			if (local9) {
				local5 |= 0x100;
			}
			if (local13) {
				local5 |= 0x200;
			}
			if (local15) {
				local5 |= 0x400;
			}
		}
		@Pc(182) long local182 = (long) arg9 | (long) (arg5 << 16) | (long) arg0 << 32;
		@Pc(184) Class233 local184 = Static58.aClass233_5;
		@Pc(192) Class25 local192;
		synchronized (Static58.aClass233_5) {
			local192 = (Class25) Static58.aClass233_5.method5669(local182);
		}
		if (local192 == null || arg3.method7950(local192.ua(), local5) != 0) {
			if (local192 != null) {
				local5 = arg3.method7952(local5, local192.ua());
			}
			@Pc(222) Class379[] local222 = new Class379[3];
			local96 = 0;
			if (!arg7.method8016(arg9).method7661() || !arg7.method8016(arg5).method7661() || !arg7.method8016(arg0).method7661()) {
				return null;
			}
			@Pc(252) Class379 local252 = arg7.method8016(arg9).method7663();
			if (local252 != null) {
				local96++;
				local222[0] = local252;
			}
			local252 = arg7.method8016(arg5).method7663();
			if (local252 != null) {
				local222[local96++] = local252;
			}
			local252 = arg7.method8016(arg0).method7663();
			if (local252 != null) {
				local222[local96++] = local252;
			}
			local252 = new Class379(local222, local96);
			@Pc(297) int local297 = local5 | 0x4000;
			local192 = arg3.method7975(local252, local297, Static599.anInt9851, 64, 768);
			for (@Pc(307) int local307 = 0; local307 < 5; local307++) {
				for (local36 = 0; local36 < Static200.aShortArrayArrayArray5.length; local36++) {
					if (Static200.aShortArrayArrayArray5[local36][local307].length > this.anIntArray329[local307]) {
						local192.ia(Static256.aShortArrayArray15[local36][local307], Static200.aShortArrayArrayArray5[local36][local307][this.anIntArray329[local307]]);
					}
				}
			}
			local192.s(local5);
			@Pc(359) Class233 local359 = Static58.aClass233_5;
			synchronized (Static58.aClass233_5) {
				Static58.aClass233_5.method5662(local192, local182);
			}
		}
		if (arg8 == null) {
			return local192;
		} else {
			local192 = local192.method7732((byte) 4, local5, true);
			return arg8.method3735(arg6, 2048, local192, arg4, arg2);
		}
	}

	@OriginalMember(owner = "client!in", name = "a", descriptor = "(I)V")
	private void method4021() {
		this.aLong133 = -1L;
		@Pc(8) long[] local8 = Class365.aLongArray18;
		this.aLong133 = this.aLong133 >>> 8 ^ local8[(int) (((long) (this.anInt4835 >> 8) ^ this.aLong133) & 0xFFL)];
		this.aLong133 = this.aLong133 >>> 8 ^ local8[(int) (((long) this.anInt4835 ^ this.aLong133) & 0xFFL)];
		for (@Pc(48) int local48 = 0; local48 < 12; local48++) {
			this.aLong133 = this.aLong133 >>> 8 ^ local8[(int) ((this.aLong133 ^ (long) (this.anIntArray330[local48] >> 24)) & 0xFFL)];
			this.aLong133 = local8[(int) ((this.aLong133 ^ (long) (this.anIntArray330[local48] >> 16)) & 0xFFL)] ^ this.aLong133 >>> 8;
			this.aLong133 = this.aLong133 >>> 8 ^ local8[(int) ((this.aLong133 ^ (long) (this.anIntArray330[local48] >> 8)) & 0xFFL)];
			this.aLong133 = local8[(int) ((this.aLong133 ^ (long) this.anIntArray330[local48]) & 0xFFL)] ^ this.aLong133 >>> 8;
		}
		for (@Pc(145) int local145 = 0; local145 < 5; local145++) {
			this.aLong133 = local8[(int) (((long) this.anIntArray329[local145] ^ this.aLong133) & 0xFFL)] ^ this.aLong133 >>> 8;
		}
		this.aLong133 = local8[(int) (((long) (this.aBoolean393 ? 1 : 0) ^ this.aLong133) & 0xFFL)] ^ this.aLong133 >>> 8;
	}

	@OriginalMember(owner = "client!in", name = "a", descriptor = "(BIILclient!pv;)V")
	public void method4022(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class267 arg2) {
		if (arg1 == -1) {
			this.anIntArray330[arg0] = 0;
		} else if (arg2.method6597(arg1) != null) {
			this.anIntArray330[arg0] = arg1 | 0x40000000;
			this.method4021();
		}
	}

	@OriginalMember(owner = "client!in", name = "a", descriptor = "(IIB)V")
	public void method4023(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anIntArray329[arg1] = arg0;
		this.method4021();
	}

	@OriginalMember(owner = "client!in", name = "a", descriptor = "(ILclient!un;II)V")
	public void method4024(@OriginalArg(0) int arg0, @OriginalArg(1) Class344 arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = Static317.anIntArray389[arg0];
		if (arg1.method8016(arg2) != null) {
			this.anIntArray330[local7] = Integer.MIN_VALUE | arg2;
			this.method4021();
		}
	}

	@OriginalMember(owner = "client!in", name = "a", descriptor = "(ZIB[I[II)V")
	public void method4026(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int[] arg3, @OriginalArg(5) int arg4) {
		if (this.anInt4835 != arg4) {
			this.anInt4835 = arg4;
		}
		this.anInt4833 = arg1;
		this.aBoolean393 = arg0;
		this.anIntArray330 = arg2;
		this.anIntArray329 = arg3;
		this.method4021();
	}

	@OriginalMember(owner = "client!in", name = "a", descriptor = "(III[Lclient!lfa;IILclient!hn;ILclient!cp;[ILclient!dk;Lclient!sd;ILclient!gw;ZILclient!un;Lclient!ha;ILclient!hn;Lclient!pv;)Lclient!ka;")
	public Class25 method4027(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class203[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class149 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) Interface5 arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) Class76 arg10, @OriginalArg(11) Class303 arg11, @OriginalArg(12) int arg12, @OriginalArg(13) Class140 arg13, @OriginalArg(15) int arg14, @OriginalArg(16) Class344 arg15, @OriginalArg(17) Class87 arg16, @OriginalArg(19) Class149 arg17, @OriginalArg(20) Class267 arg18) {
		if (this.anInt4833 != -1) {
			return arg10.method1676(this.anInt4833).method5785(arg16, arg2, arg12, arg6, arg9, arg13, arg7, arg1, arg0, arg4, arg5, arg11, arg8, arg17, arg3, arg14);
		}
		@Pc(34) int local34 = arg14;
		@Pc(37) long local37 = this.aLong133;
		@Pc(40) int[] local40 = this.anIntArray330;
		if (arg17 != null && (arg17.anInt4508 >= 0 || arg17.anInt4504 >= 0)) {
			local40 = new int[12];
			for (@Pc(59) int local59 = 0; local59 < 12; local59++) {
				local40[local59] = this.anIntArray330[local59];
			}
			if (arg17.anInt4508 >= 0) {
				if (arg17.anInt4508 == 65535) {
					local37 ^= 0xFFFFFFFF00000000L;
					local40[5] = 0;
				} else {
					local40[5] = arg17.anInt4508 | 0x40000000;
					local37 ^= (long) local40[5] << 32;
				}
			}
			if (arg17.anInt4504 >= 0) {
				if (arg17.anInt4504 == 65535) {
					local37 ^= 0xFFFFFFFFL;
					local40[3] = 0;
				} else {
					local40[3] = arg17.anInt4504 | 0x40000000;
					local37 ^= local40[3];
				}
			}
		}
		@Pc(142) boolean local142 = false;
		@Pc(144) boolean local144 = false;
		@Pc(146) boolean local146 = false;
		@Pc(154) boolean local154 = arg17 != null || arg6 != null;
		@Pc(161) int local161 = arg3 == null ? 0 : arg3.length;
		@Pc(194) int local194;
		@Pc(199) int local199;
		for (@Pc(163) int local163 = 0; local163 < local161; local163++) {
			Static514.aClass2_Sub5_Sub5Array9[local163] = null;
			if (arg3[local163] != null) {
				@Pc(180) Class149 local180 = arg11.method7201(arg3[local163].anInt5798);
				if (local180.anIntArray308 != null) {
					Static461.aClass149Array1[local163] = local180;
					local154 = true;
					local194 = arg3[local163].anInt5801;
					local199 = arg3[local163].anInt5805;
					@Pc(204) int local204 = local180.anIntArray308[local194];
					Static514.aClass2_Sub5_Sub5Array9[local163] = arg11.method7206(local204 >>> 16);
					@Pc(217) int local217 = local204 & 0xFFFF;
					Static25.anIntArray57[local163] = local217;
					if (Static514.aClass2_Sub5_Sub5Array9[local163] != null) {
						local144 |= Static514.aClass2_Sub5_Sub5Array9[local163].method1835(local217);
						local142 |= Static514.aClass2_Sub5_Sub5Array9[local163].method1838(local217);
						local146 |= Static514.aClass2_Sub5_Sub5Array9[local163].method1837(local217);
					}
					if ((local180.aBoolean379 || Static424.aBoolean577) && local199 != -1 && local180.anIntArray308.length > local199) {
						Static249.anIntArray337[local163] = local180.anIntArray306[local194];
						Static360.anIntArray428[local163] = arg3[local163].anInt5796;
						@Pc(306) int local306 = local180.anIntArray308[local199];
						Static454.aClass2_Sub5_Sub5Array7[local163] = arg11.method7206(local306 >>> 16);
						@Pc(319) int local319 = local306 & 0xFFFF;
						Static55.anIntArray124[local163] = local319;
						if (Static454.aClass2_Sub5_Sub5Array7[local163] != null) {
							local144 |= Static454.aClass2_Sub5_Sub5Array7[local163].method1835(local319);
							local142 |= Static454.aClass2_Sub5_Sub5Array7[local163].method1838(local319);
							local146 |= Static454.aClass2_Sub5_Sub5Array7[local163].method1837(local319);
						}
					} else {
						Static249.anIntArray337[local163] = 0;
						Static360.anIntArray428[local163] = 0;
						Static454.aClass2_Sub5_Sub5Array7[local163] = null;
						Static55.anIntArray124[local163] = -1;
					}
				}
			}
		}
		@Pc(360) int local360 = -1;
		local194 = -1;
		local199 = 0;
		@Pc(366) Class2_Sub5_Sub5 local366 = null;
		@Pc(368) Class2_Sub5_Sub5 local368 = null;
		@Pc(370) int local370 = -1;
		@Pc(372) int local372 = -1;
		@Pc(374) int local374 = 0;
		@Pc(376) Class2_Sub5_Sub5 local376 = null;
		@Pc(378) Class2_Sub5_Sub5 local378 = null;
		if (local154) {
			local34 = arg14 | 0x20;
			@Pc(395) int local395;
			@Pc(458) int local458;
			if (arg17 != null) {
				local360 = arg17.anIntArray308[arg2];
				local395 = local360 >>> 16;
				local360 &= 0xFFFF;
				local366 = arg11.method7206(local395);
				if (local366 != null) {
					local144 |= local366.method1835(local360);
					local142 |= local366.method1838(local360);
					local146 |= local366.method1837(local360);
				}
				if ((arg17.aBoolean379 || Static424.aBoolean577) && arg7 != -1 && arg17.anIntArray308.length > arg7) {
					local199 = arg17.anIntArray306[arg2];
					local194 = arg17.anIntArray308[arg7];
					local458 = local194 >>> 16;
					local194 &= 0xFFFF;
					local368 = local395 == local458 ? local366 : arg11.method7206(local458);
					if (local368 != null) {
						local144 |= local368.method1835(local194);
						local142 |= local368.method1838(local194);
						local146 |= local368.method1837(local194);
					}
				}
			}
			if (arg6 != null) {
				local370 = arg6.anIntArray308[arg5];
				local395 = local370 >>> 16;
				local376 = arg11.method7206(local395);
				local370 &= 0xFFFF;
				if (local376 != null) {
					local144 |= local376.method1835(local370);
					local142 |= local376.method1838(local370);
					local146 |= local376.method1837(local370);
				}
				if ((arg6.aBoolean379 || Static424.aBoolean577) && arg12 != -1 && arg12 < arg6.anIntArray308.length) {
					local374 = arg6.anIntArray306[arg5];
					local372 = arg6.anIntArray308[arg12];
					local458 = local372 >>> 16;
					local372 &= 0xFFFF;
					local378 = local458 == local395 ? local376 : arg11.method7206(local458);
					if (local378 != null) {
						local144 |= local378.method1835(local372);
						local142 |= local378.method1838(local372);
						local146 |= local378.method1837(local372);
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
		@Pc(626) Class233 local626 = Static42.aClass233_2;
		@Pc(634) Class25 local634;
		synchronized (Static42.aClass233_2) {
			local634 = (Class25) Static42.aClass233_2.method5669(local37);
		}
		@Pc(642) Class165 local642 = null;
		if (this.anInt4835 != -1) {
			local642 = arg13.method3446(this.anInt4835);
		}
		@Pc(672) boolean local672;
		@Pc(674) int local674;
		@Pc(679) int local679;
		@Pc(731) int local731;
		@Pc(736) int local736;
		@Pc(803) int local803;
		if (local634 == null || arg16.method7950(local634.ua(), local34) != 0) {
			if (local634 != null) {
				local34 = arg16.method7952(local34, local634.ua());
			}
			local672 = false;
			for (local674 = 0; local674 < 12; local674++) {
				local679 = local40[local674];
				if ((local679 & 0x40000000) == 0) {
					if ((local679 & Integer.MIN_VALUE) != 0 && !arg15.method8016(local679 & 0x3FFFFFFF).method7662()) {
						local672 = true;
					}
				} else if (!arg18.method6597(local679 & 0x3FFFFFFF).method6282(this.aBoolean393)) {
					local672 = true;
				}
			}
			if (local672) {
				if (this.aLong134 != -1L) {
					@Pc(1016) Class233 local1016 = Static42.aClass233_2;
					synchronized (Static42.aClass233_2) {
						local634 = (Class25) Static42.aClass233_2.method5669(this.aLong134);
					}
				}
				if (local634 == null || arg16.method7950(local634.ua(), local34) != 0) {
					return null;
				}
			} else {
				@Pc(729) Class379[] local729 = new Class379[12];
				for (local731 = 0; local731 < 12; local731++) {
					local736 = local40[local731];
					@Pc(759) Class379 local759;
					if ((local736 & 0x40000000) != 0) {
						local759 = arg18.method6597(local736 & 0x3FFFFFFF).method6275(this.aBoolean393);
						if (local759 != null) {
							local729[local731] = local759;
						}
					} else if ((local736 & Integer.MIN_VALUE) != 0) {
						local759 = arg15.method8016(local736 & 0x3FFFFFFF).method7666();
						if (local759 != null) {
							local729[local731] = local759;
						}
					}
				}
				@Pc(805) int local805;
				if (local642 != null && local642.anIntArrayArray39 != null) {
					for (local736 = 0; local736 < local642.anIntArrayArray39.length; local736++) {
						if (local729[local736] != null) {
							local803 = 0;
							local805 = 0;
							@Pc(807) int local807 = 0;
							@Pc(809) int local809 = 0;
							@Pc(811) int local811 = 0;
							@Pc(813) int local813 = 0;
							if (local642.anIntArrayArray39[local736] != null) {
								local803 = local642.anIntArrayArray39[local736][0];
								local809 = local642.anIntArrayArray39[local736][3] << 3;
								local805 = local642.anIntArrayArray39[local736][1];
								local807 = local642.anIntArrayArray39[local736][2];
								local811 = local642.anIntArrayArray39[local736][4] << 3;
								local813 = local642.anIntArrayArray39[local736][5] << 3;
							}
							if (local809 != 0 || local811 != 0 || local813 != 0) {
								local729[local736].method8585(local813, local809, local811);
							}
							if (local803 != 0 || local805 != 0 || local807 != 0) {
								local729[local736].method8584(local807, local805, local803);
							}
						}
					}
				}
				@Pc(917) int local917 = local34 | 0x4000;
				@Pc(924) Class379 local924 = new Class379(local729, local729.length);
				local634 = arg16.method7975(local924, local917, Static599.anInt9851, 64, 850);
				for (local803 = 0; local803 < 5; local803++) {
					for (local805 = 0; local805 < Static200.aShortArrayArrayArray5.length; local805++) {
						if (this.anIntArray329[local803] < Static200.aShortArrayArrayArray5[local805][local803].length) {
							local634.ia(Static256.aShortArrayArray15[local805][local803], Static200.aShortArrayArrayArray5[local805][local803][this.anIntArray329[local803]]);
						}
					}
				}
				local634.s(local34);
				@Pc(990) Class233 local990 = Static42.aClass233_2;
				synchronized (Static42.aClass233_2) {
					Static42.aClass233_2.method5662(local634, local37);
				}
				this.aLong134 = local37;
			}
		}
		@Pc(1047) Class25 local1047 = local634.method7732((byte) 4, local34, true);
		local672 = false;
		if (arg9 != null) {
			for (local674 = 0; local674 < 12; local674++) {
				if (arg9[local674] != -1) {
					local672 = true;
				}
			}
		}
		if (!local154 && !local672) {
			return local1047;
		}
		@Pc(1076) Class6[] local1076 = null;
		if (local642 != null) {
			local1076 = local642.method4052(arg16);
		}
		if (local672 && local1076 != null) {
			for (local679 = 0; local679 < 12; local679++) {
				if (local1076[local679] != null) {
					local1047.method7734(local1076[local679], 0x1 << local679, true);
				}
			}
		}
		local679 = 0;
		local731 = 1;
		while (local161 > local679) {
			if (Static514.aClass2_Sub5_Sub5Array9[local679] != null) {
				local1047.method7719(Static55.anIntArray124[local679], false, Static514.aClass2_Sub5_Sub5Array9[local679], local731, Static360.anIntArray428[local679] - 1, null, Static454.aClass2_Sub5_Sub5Array7[local679], Static249.anIntArray337[local679], Static25.anIntArray57[local679]);
			}
			local731 <<= 0x1;
			local679++;
		}
		if (local672) {
			for (local736 = 0; local736 < 12; local736++) {
				if (arg9[local736] != -1) {
					local803 = arg9[local736] - arg1;
					local803 &= 0x3FFF;
					@Pc(1189) Class6 local1189 = arg16.method7910();
					local1189.method6692(local803);
					local1047.method7734(local1189, 0x1 << local736, false);
				}
			}
		}
		if (local672 && local1076 != null) {
			for (local736 = 0; local736 < 12; local736++) {
				if (local1076[local736] != null) {
					local1047.method7734(local1076[local736], 0x1 << local736, false);
				}
			}
		}
		if (local366 != null && local376 != null) {
			local1047.method7716(local194, local378, false, local199, local360, arg17.aBooleanArray30, local376, arg0 - 1, local374, arg4 - 1, local366, local368, local372, local370);
		} else if (local366 != null) {
			local1047.method7715(false, local366, local360, 0, local194, arg0 - 1, local368, local199);
		} else if (local376 != null) {
			local1047.method7715(false, local376, local370, 0, local372, arg4 - 1, local378, local374);
		}
		for (local736 = 0; local736 < local161; local736++) {
			Static514.aClass2_Sub5_Sub5Array9[local736] = null;
			Static454.aClass2_Sub5_Sub5Array7[local736] = null;
			Static461.aClass149Array1[local736] = null;
		}
		return local1047;
	}
}
