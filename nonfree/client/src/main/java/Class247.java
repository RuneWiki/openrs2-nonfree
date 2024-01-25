import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wh")
public final class Class247 {

	@OriginalMember(owner = "client!wh", name = "c", descriptor = "[I")
	public int[] anIntArray803;

	@OriginalMember(owner = "client!wh", name = "e", descriptor = "J")
	private long aLong205;

	@OriginalMember(owner = "client!wh", name = "j", descriptor = "[[I")
	private int[][] anIntArrayArray58;

	@OriginalMember(owner = "client!wh", name = "m", descriptor = "J")
	private long aLong206;

	@OriginalMember(owner = "client!wh", name = "o", descriptor = "I")
	private int anInt6650;

	@OriginalMember(owner = "client!wh", name = "p", descriptor = "[I")
	private int[] anIntArray804;

	@OriginalMember(owner = "client!wh", name = "q", descriptor = "Z")
	public boolean aBoolean494;

	@OriginalMember(owner = "client!wh", name = "w", descriptor = "I")
	public int anInt6655 = -1;

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(I)V")
	private void method5687() {
		this.aLong205 = -1L;
		@Pc(14) long[] local14 = Class64_Sub1.aLongArray4;
		this.aLong205 = this.aLong205 >>> 8 ^ local14[(int) ((this.aLong205 ^ (long) (this.anInt6650 >> 8)) & 0xFFL)];
		this.aLong205 = this.aLong205 >>> 8 ^ local14[(int) (((long) this.anInt6650 ^ this.aLong205) & 0xFFL)];
		for (@Pc(54) int local54 = 0; local54 < 12; local54++) {
			this.aLong205 = this.aLong205 >>> 8 ^ local14[(int) ((this.aLong205 ^ (long) (this.anIntArray804[local54] >> 24)) & 0xFFL)];
			this.aLong205 = local14[(int) ((this.aLong205 ^ (long) (this.anIntArray804[local54] >> 16)) & 0xFFL)] ^ this.aLong205 >>> 8;
			this.aLong205 = local14[(int) (((long) (this.anIntArray804[local54] >> 8) ^ this.aLong205) & 0xFFL)] ^ this.aLong205 >>> 8;
			this.aLong205 = this.aLong205 >>> 8 ^ local14[(int) (((long) this.anIntArray804[local54] ^ this.aLong205) & 0xFFL)];
		}
		for (@Pc(150) int local150 = 0; local150 < 5; local150++) {
			this.aLong205 = this.aLong205 >>> 8 ^ local14[(int) ((this.aLong205 ^ (long) this.anIntArray803[local150]) & 0xFFL)];
		}
		this.aLong205 = this.aLong205 >>> 8 ^ local14[(int) (((long) (this.aBoolean494 ? 1 : 0) ^ this.aLong205) & 0xFFL)];
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(BILclient!cr;I)V")
	public void method5688(@OriginalArg(1) int arg0, @OriginalArg(2) Class40 arg1, @OriginalArg(3) int arg2) {
		@Pc(13) int local13 = Static296.anIntArray649[arg0];
		if (this.anIntArray804[local13] != 0 && arg1.method914(arg2) != null) {
			this.anIntArray804[local13] = arg2 | Integer.MIN_VALUE;
			this.method5687();
		}
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(ILclient!fh;ILclient!wr;ILclient!p;ILclient!qg;Lclient!cr;Lclient!km;ILclient!ml;)Lclient!ab;")
	public Class3 method5689(@OriginalArg(0) int arg0, @OriginalArg(1) Interface2 arg1, @OriginalArg(3) Class250 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class175 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class189 arg6, @OriginalArg(8) Class40 arg7, @OriginalArg(9) Class82 arg8, @OriginalArg(11) Class151 arg9) {
		if (this.anInt6655 != -1) {
			return arg9.method3705(this.anInt6655).method5579(arg6, arg3, arg0, arg1, arg4, arg5, arg8);
		}
		@Pc(28) int local28 = 1024;
		@Pc(54) boolean local54;
		@Pc(71) int local71;
		@Pc(123) int local123;
		@Pc(75) int local75;
		@Pc(127) int local127;
		if (arg6 != null) {
			@Pc(50) boolean local50 = false;
			@Pc(52) boolean local52 = false;
			local54 = false;
			local28 = 1056;
			local71 = arg6.anIntArray639[arg3];
			local75 = local71 >>> 16;
			@Pc(80) Class2_Sub1_Sub1 local80 = arg4.method4106(local75);
			@Pc(84) int local84 = local71 & 0xFFFF;
			if (local80 != null) {
				local52 = local80.method34(local84) | false;
				local50 = local80.method31(local84) | false;
				local54 = arg6.aBoolean385 | false;
			}
			if ((arg6.aBoolean384 || Static151.aBoolean203) && arg5 != -1 && arg5 < arg6.anIntArray639.length) {
				local123 = arg6.anIntArray639[arg5];
				local127 = local123 >>> 16;
				@Pc(141) Class2_Sub1_Sub1 local141 = local75 == local127 ? local80 : arg4.method4106(local127);
				@Pc(145) int local145 = local123 & 0xFFFF;
				if (local141 != null) {
					local52 |= local141.method34(local145);
					local50 |= local141.method31(local145);
				}
			}
			if (local52) {
				local28 = 1184;
			}
			if (local50) {
				local28 |= 0x100;
			}
			if (local54) {
				local28 |= 0x200;
			}
		}
		@Pc(181) Class154 local181 = Static350.aClass154_53;
		@Pc(190) Class3 local190;
		synchronized (Static350.aClass154_53) {
			local190 = (Class3) Static350.aClass154_53.method3751(this.aLong205);
		}
		if (local190 == null || arg8.method4499(local190.method3474(), local28) != 0) {
			if (local190 != null) {
				local28 = arg8.method4483(local28, local190.method3474());
			}
			local54 = false;
			for (local71 = 0; local71 < 12; local71++) {
				local123 = this.anIntArray804[local71];
				if ((local123 & 0x40000000) == 0) {
					if ((Integer.MIN_VALUE & local123) != 0 && !arg7.method914(local123 & 0x3FFFFFFF).method742()) {
						local54 = true;
					}
				} else if (!arg2.method5735(local123 & 0x3FFFFFFF).method2630(this.aBoolean494)) {
					local54 = true;
				}
			}
			if (local54) {
				return null;
			}
			@Pc(279) Class91[] local279 = new Class91[12];
			@Pc(281) int local281 = 0;
			for (@Pc(283) int local283 = 0; local283 < 12; local283++) {
				local75 = this.anIntArray804[local283];
				@Pc(307) Class91 local307;
				if ((local75 & 0x40000000) != 0) {
					local307 = arg2.method5735(local75 & 0x3FFFFFFF).method2632(this.aBoolean494);
					if (local307 != null) {
						local279[local281++] = local307;
					}
				} else if ((local75 & Integer.MIN_VALUE) != 0) {
					local307 = arg7.method914(local75 & 0x3FFFFFFF).method743();
					if (local307 != null) {
						local279[local281++] = local307;
					}
				}
			}
			@Pc(344) int local344 = local28 | 0x2000;
			@Pc(350) Class91 local350 = new Class91(local279, local281);
			local190 = arg8.method4466(local350, local344, Static17.anInt416, 64, 768);
			for (local127 = 0; local127 < 5; local127++) {
				if (Static250.aShortArrayArray34[local127].length > this.anIntArray803[local127]) {
					local190.method3440(Static4.aShortArray1[local127], Static250.aShortArrayArray34[local127][this.anIntArray803[local127]]);
				}
				if (this.anIntArray803[local127] < Static40.aShortArrayArray48[local127].length) {
					local190.method3440(Static298.aShortArray94[local127], Static40.aShortArrayArray48[local127][this.anIntArray803[local127]]);
				}
			}
			local190.method3473(local28);
			@Pc(421) Class154 local421 = Static350.aClass154_53;
			synchronized (Static350.aClass154_53) {
				Static350.aClass154_53.method3745(this.aLong205, local190);
			}
		}
		if (arg6 == null) {
			return local190;
		} else {
			local190.method3481((byte) 4, local28, true);
			return arg6.method4436(arg3, arg0, arg5, local190, 1024);
		}
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(ZII[I[IZ)V")
	public void method5691(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int[] arg3, @OriginalArg(5) boolean arg4) {
		if (this.anInt6650 != arg1) {
			this.anIntArrayArray58 = null;
			this.anInt6650 = arg1;
		}
		this.anIntArray804 = arg2;
		this.anIntArray803 = arg3;
		this.aBoolean494 = arg4;
		this.anInt6655 = arg0;
		this.method5687();
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(IIILclient!p;IILclient!qg;Lclient!cr;IIILclient!km;)Lclient!ab;")
	public Class3 method5692(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class175 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class189 arg5, @OriginalArg(7) Class40 arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(11) Class82 arg9) {
		@Pc(7) int local7 = 1024;
		@Pc(28) int local28;
		@Pc(36) int local36;
		if (arg5 != null) {
			@Pc(11) boolean local11 = false;
			@Pc(13) boolean local13 = false;
			@Pc(15) boolean local15 = false;
			local28 = arg5.anIntArray639[arg8];
			local7 = 1056;
			local36 = local28 >>> 16;
			@Pc(40) int local40 = local28 & 0xFFFF;
			@Pc(45) Class2_Sub1_Sub1 local45 = arg2.method4106(local36);
			if (local45 != null) {
				local13 = local45.method34(local40) | false;
				local11 = local45.method31(local40) | false;
				local15 = arg5.aBoolean385 | false;
			}
			if ((arg5.aBoolean384 || Static151.aBoolean203) && arg0 != -1 && arg5.anIntArray639.length > arg0) {
				@Pc(88) int local88 = arg5.anIntArray639[arg0];
				@Pc(92) int local92 = local88 >>> 16;
				@Pc(96) int local96 = local88 & 0xFFFF;
				@Pc(105) Class2_Sub1_Sub1 local105;
				if (local36 == local92) {
					local105 = local45;
				} else {
					local105 = arg2.method4106(local96 >>> 16);
				}
				if (local105 != null) {
					local13 |= local105.method34(local96);
					local11 |= local105.method31(local96);
				}
			}
			if (local13) {
				local7 = 1184;
			}
			if (local11) {
				local7 |= 0x100;
			}
			if (local15) {
				local7 |= 0x200;
			}
		}
		@Pc(160) long local160 = (long) arg7 | (long) arg4 << 32 | (long) (arg3 << 16);
		@Pc(171) Class154 local171 = Static350.aClass154_53;
		@Pc(179) Class3 local179;
		synchronized (Static350.aClass154_53) {
			local179 = (Class3) Static350.aClass154_53.method3751(local160);
		}
		if (local179 == null || arg9.method4499(local179.method3474(), local7) != 0) {
			if (local179 != null) {
				local7 = arg9.method4483(local7, local179.method3474());
			}
			@Pc(209) Class91[] local209 = new Class91[3];
			@Pc(211) int local211 = 0;
			if (!arg6.method914(arg7).method742() || !arg6.method914(arg3).method742() || !arg6.method914(arg4).method742()) {
				return null;
			}
			@Pc(241) Class91 local241 = arg6.method914(arg7).method743();
			if (local241 != null) {
				local211++;
				local209[0] = local241;
			}
			local241 = arg6.method914(arg3).method743();
			if (local241 != null) {
				local209[local211++] = local241;
			}
			local241 = arg6.method914(arg4).method743();
			if (local241 != null) {
				local209[local211++] = local241;
			}
			local241 = new Class91(local209, local211);
			local28 = local7 | 0x2000;
			local179 = arg9.method4466(local241, local28, Static17.anInt416, 64, 768);
			for (local36 = 0; local36 < 5; local36++) {
				if (Static250.aShortArrayArray34[local36].length > this.anIntArray803[local36]) {
					local179.method3440(Static4.aShortArray1[local36], Static250.aShortArrayArray34[local36][this.anIntArray803[local36]]);
				}
				if (Static40.aShortArrayArray48[local36].length > this.anIntArray803[local36]) {
					local179.method3440(Static298.aShortArray94[local36], Static40.aShortArrayArray48[local36][this.anIntArray803[local36]]);
				}
			}
			local179.method3473(local7);
			@Pc(357) Class154 local357 = Static350.aClass154_53;
			synchronized (Static350.aClass154_53) {
				Static350.aClass154_53.method3745(local160, local179);
			}
		}
		if (arg5 == null) {
			return local179;
		} else {
			local179 = local179.method3481((byte) 4, local7, true);
			return arg5.method4436(arg8, arg1, arg0, local179, 1024);
		}
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(III)V")
	public void method5693(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray803[arg1] = arg0;
		this.method5687();
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(ZB)V")
	public void method5694(@OriginalArg(0) boolean arg0) {
		this.aBoolean494 = arg0;
		this.method5687();
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(IILclient!cr;Lclient!ml;Lclient!wr;Lclient!p;II[Lclient!hb;Lclient!qg;ILclient!qg;ILclient!fh;Lclient!dg;ILclient!km;IZ)Lclient!ab;")
	public Class3 method5695(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class40 arg2, @OriginalArg(3) Class151 arg3, @OriginalArg(4) Class250 arg4, @OriginalArg(5) Class175 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) Class95[] arg8, @OriginalArg(9) Class189 arg9, @OriginalArg(10) int arg10, @OriginalArg(11) Class189 arg11, @OriginalArg(13) Interface2 arg12, @OriginalArg(14) Class47 arg13, @OriginalArg(15) int arg14, @OriginalArg(16) Class82 arg15, @OriginalArg(17) int arg16) {
		if (this.anInt6655 != -1) {
			return arg3.method3705(this.anInt6655).method5574(arg1, arg0, arg16, arg14, arg8, arg12, arg5, arg6, arg13, arg7, arg11, arg10, arg15, arg9);
		}
		@Pc(34) int local34 = arg1;
		@Pc(37) long local37 = this.aLong205;
		@Pc(40) int[] local40 = this.anIntArray804;
		if (arg9 != null && (arg9.anInt5169 >= 0 || arg9.anInt5155 >= 0)) {
			local40 = new int[12];
			for (@Pc(56) int local56 = 0; local56 < 12; local56++) {
				local40[local56] = this.anIntArray804[local56];
			}
			if (arg9.anInt5169 >= 0) {
				if (arg9.anInt5169 == 65535) {
					local40[5] = 0;
					local37 ^= 0xFFFFFFFF00000000L;
				} else {
					local40[5] = arg9.anInt5169 | 0x40000000;
					local37 ^= (long) local40[5] << 32;
				}
			}
			if (arg9.anInt5155 >= 0) {
				if (arg9.anInt5155 == 65535) {
					local40[3] = 0;
					local37 ^= 0xFFFFFFFFL;
				} else {
					local40[3] = arg9.anInt5155 | 0x40000000;
					local37 ^= local40[3];
				}
			}
		}
		@Pc(137) boolean local137 = false;
		@Pc(139) boolean local139 = false;
		@Pc(147) boolean local147 = arg9 != null || arg11 != null;
		@Pc(154) int local154 = arg8 == null ? 0 : arg8.length;
		@Pc(188) int local188;
		@Pc(193) int local193;
		for (@Pc(156) int local156 = 0; local156 < local154; local156++) {
			Static386.aClass2_Sub1_Sub1Array4[local156] = null;
			if (arg8[local156] != null) {
				@Pc(174) Class189 local174 = arg5.method4107(arg8[local156].anInt2400);
				if (local174.anIntArray639 != null) {
					local147 = true;
					Static76.aClass189Array1[local156] = local174;
					local188 = arg8[local156].anInt2397;
					local193 = arg8[local156].anInt2398;
					@Pc(198) int local198 = local174.anIntArray639[local188];
					Static386.aClass2_Sub1_Sub1Array4[local156] = arg5.method4106(local198 >>> 16);
					@Pc(213) int local213 = local198 & 0xFFFF;
					Static166.anIntArray332[local156] = local213;
					if (Static386.aClass2_Sub1_Sub1Array4[local156] != null) {
						local139 |= Static386.aClass2_Sub1_Sub1Array4[local156].method34(local213);
						local137 |= Static386.aClass2_Sub1_Sub1Array4[local156].method31(local213);
					}
					if ((local174.aBoolean384 || Static151.aBoolean203) && local193 != -1 && local174.anIntArray639.length > local193) {
						Static54.anIntArray147[local156] = local174.anIntArray640[local188];
						Static295.anIntArray646[local156] = arg8[local156].anInt2399;
						@Pc(290) int local290 = local174.anIntArray639[local193];
						Static151.aClass2_Sub1_Sub1Array7[local156] = arg5.method4106(local290 >>> 16);
						@Pc(303) int local303 = local290 & 0xFFFF;
						Static250.anIntArray558[local156] = local303;
						if (Static151.aClass2_Sub1_Sub1Array7[local156] != null) {
							local139 |= Static151.aClass2_Sub1_Sub1Array7[local156].method34(local303);
							local137 |= Static151.aClass2_Sub1_Sub1Array7[local156].method31(local303);
						}
					} else {
						Static54.anIntArray147[local156] = 0;
						Static295.anIntArray646[local156] = 0;
						Static151.aClass2_Sub1_Sub1Array7[local156] = null;
						Static250.anIntArray558[local156] = -1;
					}
				}
			}
		}
		@Pc(339) int local339 = -1;
		local188 = -1;
		local193 = 0;
		@Pc(351) Class2_Sub1_Sub1 local351 = null;
		@Pc(353) Class2_Sub1_Sub1 local353 = null;
		@Pc(355) int local355 = -1;
		@Pc(357) int local357 = -1;
		@Pc(359) int local359 = 0;
		@Pc(361) Class2_Sub1_Sub1 local361 = null;
		@Pc(363) Class2_Sub1_Sub1 local363 = null;
		if (local147) {
			local34 = arg1 | 0x20;
			@Pc(380) int local380;
			@Pc(433) int local433;
			if (arg9 != null) {
				local339 = arg9.anIntArray639[arg14];
				local380 = local339 >>> 16;
				local351 = arg5.method4106(local380);
				local339 &= 0xFFFF;
				if (local351 != null) {
					local139 |= local351.method34(local339);
					local137 |= local351.method31(local339);
				}
				if ((arg9.aBoolean384 || Static151.aBoolean203) && arg6 != -1 && arg9.anIntArray639.length > arg6) {
					local188 = arg9.anIntArray639[arg6];
					local193 = arg9.anIntArray640[arg14];
					local433 = local188 >>> 16;
					local353 = local433 == local380 ? local351 : arg5.method4106(local433);
					local188 &= 0xFFFF;
					if (local353 != null) {
						local139 |= local353.method34(local188);
						local137 |= local353.method31(local188);
					}
				}
			}
			if (arg11 != null) {
				local355 = arg11.anIntArray639[arg0];
				local380 = local355 >>> 16;
				local355 &= 0xFFFF;
				local361 = arg5.method4106(local380);
				if (local361 != null) {
					local139 |= local361.method34(local355);
					local137 |= local361.method31(local355);
				}
				if ((arg11.aBoolean384 || Static151.aBoolean203) && arg10 != -1 && arg10 < arg11.anIntArray639.length) {
					local357 = arg11.anIntArray639[arg10];
					local359 = arg11.anIntArray640[arg0];
					local433 = local357 >>> 16;
					local357 &= 0xFFFF;
					local363 = local433 == local380 ? local361 : arg5.method4106(local433);
					if (local363 != null) {
						local139 |= local363.method34(local357);
						local137 |= local363.method31(local357);
					}
				}
			}
			if (local139) {
				local34 |= 0x80;
			}
			if (local137) {
				local34 |= 0x100;
			}
		}
		@Pc(583) Class154 local583 = Static329.aClass154_48;
		@Pc(591) Class3 local591;
		synchronized (Static329.aClass154_48) {
			local591 = (Class3) Static329.aClass154_48.method3751(local37);
		}
		@Pc(599) Class170 local599 = null;
		if (this.anInt6650 != -1) {
			local599 = arg13.method1075(this.anInt6650);
		}
		@Pc(640) int local640;
		@Pc(646) int local646;
		if (local591 == null || arg15.method4499(local591.method3474(), local34) != 0 || local599 != null && local599.anIntArrayArray36 != null && this.anIntArrayArray58 == null) {
			if (local591 != null) {
				local34 = arg15.method4483(local34, local591.method3474());
			}
			@Pc(638) boolean local638 = false;
			local640 = 0;
			while (true) {
				if (local640 >= 12) {
					if (local638) {
						if (this.aLong206 != -1L) {
							@Pc(695) Class154 local695 = Static329.aClass154_48;
							synchronized (Static329.aClass154_48) {
								local591 = (Class3) Static329.aClass154_48.method3751(this.aLong206);
							}
						}
						if (local591 == null || arg15.method4499(local591.method3474(), local34) != 0 || local599 != null && local599.anIntArrayArray36 != null && this.anIntArrayArray58 == null) {
							return null;
						}
					} else {
						@Pc(731) Class91[] local731 = new Class91[12];
						@Pc(739) int local739;
						for (@Pc(733) int local733 = 0; local733 < 12; local733++) {
							local739 = local40[local733];
							@Pc(756) Class91 local756;
							if ((local739 & 0x40000000) != 0) {
								local756 = arg4.method5735(local739 & 0x3FFFFFFF).method2643(this.aBoolean494);
								if (local756 != null) {
									local731[local733] = local756;
								}
							} else if ((local739 & Integer.MIN_VALUE) != 0) {
								local756 = arg2.method914(local739 & 0x3FFFFFFF).method748();
								if (local756 != null) {
									local731[local733] = local756;
								}
							}
						}
						@Pc(818) int local818;
						if (local599 != null && local599.anIntArrayArray36 != null) {
							for (local739 = 0; local739 < local599.anIntArrayArray36.length; local739++) {
								if (local599.anIntArrayArray36[local739] != null && local731[local739] != null) {
									local818 = local599.anIntArrayArray36[local739][0];
									@Pc(825) int local825 = local599.anIntArrayArray36[local739][1];
									@Pc(832) int local832 = local599.anIntArrayArray36[local739][2];
									@Pc(841) int local841 = local599.anIntArrayArray36[local739][3] << 3;
									@Pc(850) int local850 = local599.anIntArrayArray36[local739][4] << 3;
									@Pc(859) int local859 = local599.anIntArrayArray36[local739][5] << 3;
									if (this.anIntArrayArray58 == null) {
										this.anIntArrayArray58 = new int[local599.anIntArrayArray36.length][];
									}
									if (this.anIntArrayArray58[local739] == null) {
										@Pc(881) int[] local881 = this.anIntArrayArray58[local739] = new int[15];
										if (local841 == 0 && local850 == 0 && local859 == 0) {
											local881[0] = local881[4] = local881[8] = 32768;
											local881[12] = -local818;
											local881[13] = -local825;
											local881[14] = -local832;
										} else {
											@Pc(923) int local923 = Class104.anIntArray706[local841];
											@Pc(927) int local927 = Class104.anIntArray705[local841];
											@Pc(931) int local931 = Class104.anIntArray706[local850];
											@Pc(935) int local935 = Class104.anIntArray705[local850];
											@Pc(939) int local939 = Class104.anIntArray706[local859];
											@Pc(943) int local943 = Class104.anIntArray705[local859];
											@Pc(951) int local951 = local927 * local939 + 16384 >> 15;
											@Pc(959) int local959 = local943 * local927 + 16384 >> 15;
											local881[6] = local931 * local959 + local939 * -local935 + 16384 >> 15;
											local881[4] = local923 * local939 + 16384 >> 15;
											local881[8] = local931 * local923 + 16384 >> 15;
											local881[5] = -local927;
											local881[0] = local959 * local935 + local931 * local939 + 16384 >> 15;
											local881[2] = local935 * local923 + 16384 >> 15;
											local881[3] = local923 * local943 + 16384 >> 15;
											local881[1] = local935 * local951 + -local943 * local931 + 16384 >> 15;
											local881[7] = local951 * local931 + -local943 * -local935 + 16384 >> 15;
											local881[12] = local881[6] * -local832 + local881[0] * -local818 + -local825 * local881[3] + 16384 >> 15;
											local881[13] = -local818 * local881[1] + -local825 * local881[4] + -local832 * local881[7] + 16384 >> 15;
											local881[14] = -local832 * local881[8] + local881[5] * -local825 + local881[2] * -local818 + 16384 >> 15;
										}
										local881[10] = local825;
										local881[9] = local818;
										local881[11] = local832;
									}
									if (local841 != 0 || local850 != 0 || local859 != 0) {
										local731[local739].method2203(local850, local841, local859);
									}
									if (local818 != 0 || local825 != 0 || local832 != 0) {
										local731[local739].method2209(local818, local832, local825);
									}
								}
							}
						}
						@Pc(1210) Class91 local1210 = new Class91(local731, local731.length);
						@Pc(1214) int local1214 = local34 | 0x2000;
						local591 = arg15.method4466(local1210, local1214, Static17.anInt416, 64, 850);
						for (local818 = 0; local818 < 5; local818++) {
							if (this.anIntArray803[local818] < Static250.aShortArrayArray34[local818].length) {
								local591.method3440(Static4.aShortArray1[local818], Static250.aShortArrayArray34[local818][this.anIntArray803[local818]]);
							}
							if (Static40.aShortArrayArray48[local818].length > this.anIntArray803[local818]) {
								local591.method3440(Static298.aShortArray94[local818], Static40.aShortArrayArray48[local818][this.anIntArray803[local818]]);
							}
						}
						local591.method3473(local34);
						@Pc(1283) Class154 local1283 = Static329.aClass154_48;
						synchronized (Static329.aClass154_48) {
							Static329.aClass154_48.method3745(local37, local591);
						}
						this.aLong206 = local37;
					}
					break;
				}
				local646 = local40[local640];
				if ((local646 & 0x40000000) == 0) {
					if ((local646 & Integer.MIN_VALUE) != 0 && !arg2.method914(local646 & 0x3FFFFFFF).method744()) {
						local638 = true;
					}
				} else if (!arg4.method5735(local646 & 0x3FFFFFFF).method2633(this.aBoolean494)) {
					local638 = true;
				}
				local640++;
			}
		}
		@Pc(1307) Class3 local1307 = local591.method3481((byte) 4, local34, true);
		if (!local147) {
			return local1307;
		}
		@Pc(1313) int local1313 = 0;
		local640 = 1;
		while (local1313 < local154) {
			if (Static386.aClass2_Sub1_Sub1Array4[local1313] != null) {
				local1307.method3477(Static386.aClass2_Sub1_Sub1Array4[local1313], Static250.anIntArray558[local1313], local640, Static151.aClass2_Sub1_Sub1Array7[local1313], Static295.anIntArray646[local1313] - 1, this.anIntArrayArray58 == null ? null : this.anIntArrayArray58[local1313], Static54.anIntArray147[local1313], Static166.anIntArray332[local1313], false);
			}
			local1313++;
			local640 <<= 0x1;
		}
		if (local351 != null && local361 != null) {
			local1307.method3469(arg9.aBooleanArray118, local361, arg16 - 1, arg7 - 1, local359, local357, local351, local193, local363, local339, local188, local353, false, local355);
		} else if (local351 != null) {
			local1307.method3455(local351, local339, local188, false, local193, local353, arg16 - 1, 0);
		} else if (local361 != null) {
			local1307.method3455(local361, local355, local357, false, local359, local363, arg7 - 1, 0);
		}
		for (local646 = 0; local646 < local154; local646++) {
			Static386.aClass2_Sub1_Sub1Array4[local646] = null;
			Static151.aClass2_Sub1_Sub1Array7[local646] = null;
			Static76.aClass189Array1[local646] = null;
		}
		return local1307;
	}
}
