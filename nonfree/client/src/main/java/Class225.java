import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pf")
public final class Class225 {

	@OriginalMember(owner = "client!pf", name = "b", descriptor = "J")
	private long aLong180;

	@OriginalMember(owner = "client!pf", name = "c", descriptor = "[[I")
	private int[][] anIntArrayArray90;

	@OriginalMember(owner = "client!pf", name = "e", descriptor = "[I")
	private int[] anIntArray646;

	@OriginalMember(owner = "client!pf", name = "h", descriptor = "J")
	private long aLong181;

	@OriginalMember(owner = "client!pf", name = "i", descriptor = "I")
	private int anInt6649;

	@OriginalMember(owner = "client!pf", name = "n", descriptor = "Z")
	public boolean aBoolean493;

	@OriginalMember(owner = "client!pf", name = "p", descriptor = "[I")
	public int[] anIntArray647;

	@OriginalMember(owner = "client!pf", name = "j", descriptor = "I")
	public int anInt6650 = -1;

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(IILclient!jh;Lclient!fba;ILclient!qa;ILclient!lk;Lclient!lq;Lclient!wg;Lclient!waa;B)Lclient!r;")
	public Class97 method5967(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class152 arg2, @OriginalArg(3) Class95 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class4 arg5, @OriginalArg(7) Class176 arg6, @OriginalArg(8) Class179 arg7, @OriginalArg(9) Class316 arg8, @OriginalArg(10) Interface19 arg9) {
		if (this.anInt6650 != -1) {
			return arg3.method2362(this.anInt6650).method7379(arg5, arg4, arg0, arg6, arg1, arg9, arg2);
		}
		@Pc(27) int local27 = 2048;
		@Pc(35) boolean local35;
		@Pc(50) int local50;
		@Pc(120) int local120;
		@Pc(58) int local58;
		if (arg6 != null) {
			@Pc(31) boolean local31 = false;
			@Pc(33) boolean local33 = false;
			local35 = false;
			@Pc(37) boolean local37 = false;
			local50 = arg6.anIntArray432[arg1];
			local27 = 2080;
			local58 = local50 >>> 16;
			@Pc(62) int local62 = local50 & 0xFFFF;
			@Pc(67) Class1_Sub2_Sub17 local67 = arg2.method4041(local58);
			if (local67 != null) {
				local33 = local67.method6818(local62) | false;
				local31 = local67.method6820(local62) | false;
				local37 = local67.method6816(local62) | false;
				local35 = arg6.aBoolean394 | false;
			}
			if ((arg6.aBoolean395 || Static294.aBoolean419) && arg4 != -1 && arg6.anIntArray432.length > arg4) {
				local120 = arg6.anIntArray432[arg4];
				@Pc(124) int local124 = local120 >>> 16;
				@Pc(128) int local128 = local120 & 0xFFFF;
				@Pc(138) Class1_Sub2_Sub17 local138 = local58 == local124 ? local67 : arg2.method4041(local124);
				if (local138 != null) {
					local33 |= local138.method6818(local128);
					local31 |= local138.method6820(local128);
					local37 |= local138.method6816(local128);
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
		@Pc(187) Class277 local187 = Static301.aClass277_42;
		@Pc(196) Class97 local196;
		synchronized (Static301.aClass277_42) {
			local196 = (Class97) Static301.aClass277_42.method7014(this.aLong180);
		}
		if (local196 == null || arg5.method7167(local196.ba(), local27) != 0) {
			if (local196 != null) {
				local27 = arg5.method7184(local27, local196.ba());
			}
			local35 = false;
			for (@Pc(224) int local224 = 0; local224 < 12; local224++) {
				local50 = this.anIntArray646[local224];
				if ((local50 & 0x40000000) == 0) {
					if ((Integer.MIN_VALUE & local50) != 0 && !arg7.method4890(local50 & 0x3FFFFFFF).method6389()) {
						local35 = true;
					}
				} else if (!arg8.method8107(local50 & 0x3FFFFFFF).method4980(this.aBoolean493)) {
					local35 = true;
				}
			}
			if (local35) {
				return null;
			}
			@Pc(281) Class81[] local281 = new Class81[12];
			local120 = 0;
			for (@Pc(285) int local285 = 0; local285 < 12; local285++) {
				@Pc(292) int local292 = this.anIntArray646[local285];
				@Pc(307) Class81 local307;
				if ((local292 & 0x40000000) != 0) {
					local307 = arg8.method8107(local292 & 0x3FFFFFFF).method4985(this.aBoolean493);
					if (local307 != null) {
						local281[local120++] = local307;
					}
				} else if ((Integer.MIN_VALUE & local292) != 0) {
					local307 = arg7.method4890(local292 & 0x3FFFFFFF).method6393();
					if (local307 != null) {
						local281[local120++] = local307;
					}
				}
			}
			@Pc(351) Class81 local351 = new Class81(local281, local120);
			@Pc(355) int local355 = local27 | 0x4000;
			local196 = arg5.method7192(local351, local355, Static167.anInt3394, 64, 768);
			for (local58 = 0; local58 < 5; local58++) {
				if (Static407.aShortArrayArray8[local58].length > this.anIntArray647[local58]) {
					local196.pa(Static283.aShortArray94[local58], Static407.aShortArrayArray8[local58][this.anIntArray647[local58]]);
				}
				if (this.anIntArray647[local58] < Static488.aShortArrayArray7[local58].length) {
					local196.pa(Static429.aShortArray115[local58], Static488.aShortArrayArray7[local58][this.anIntArray647[local58]]);
				}
			}
			local196.m(local27);
			@Pc(420) Class277 local420 = Static301.aClass277_42;
			synchronized (Static301.aClass277_42) {
				Static301.aClass277_42.method7016(local196, this.aLong180);
			}
		}
		if (arg6 == null) {
			return local196;
		} else {
			local196.method6770((byte) 4, local27, true);
			return arg6.method4870(arg4, local196, 2048, arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(ILclient!lq;II)V")
	public void method5968(@OriginalArg(0) int arg0, @OriginalArg(1) Class179 arg1, @OriginalArg(2) int arg2) {
		@Pc(7) int local7 = Static318.anIntArray475[arg0];
		if (this.anIntArray646[local7] != 0 && arg1.method4890(arg2) != null) {
			this.anIntArray646[local7] = arg2 | Integer.MIN_VALUE;
			this.method5972();
		}
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(Z[III[II)V")
	public void method5970(@OriginalArg(0) boolean arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int[] arg3, @OriginalArg(5) int arg4) {
		this.anIntArray646 = arg3;
		this.anIntArray647 = arg1;
		this.aBoolean493 = arg0;
		if (this.anInt6649 != arg2) {
			this.anInt6649 = arg2;
			this.anIntArrayArray90 = null;
		}
		this.anInt6650 = arg4;
		this.method5972();
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(ZI)V")
	public void method5971(@OriginalArg(0) boolean arg0) {
		this.aBoolean493 = arg0;
		this.method5972();
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(I)V")
	private void method5972() {
		this.aLong180 = -1L;
		@Pc(10) long[] local10 = Class97_Sub3.aLongArray15;
		this.aLong180 = local10[(int) ((this.aLong180 ^ (long) (this.anInt6649 >> 8)) & 0xFFL)] ^ this.aLong180 >>> 8;
		this.aLong180 = local10[(int) (((long) this.anInt6649 ^ this.aLong180) & 0xFFL)] ^ this.aLong180 >>> 8;
		for (@Pc(50) int local50 = 0; local50 < 12; local50++) {
			this.aLong180 = local10[(int) (((long) (this.anIntArray646[local50] >> 24) ^ this.aLong180) & 0xFFL)] ^ this.aLong180 >>> 8;
			this.aLong180 = local10[(int) ((this.aLong180 ^ (long) (this.anIntArray646[local50] >> 16)) & 0xFFL)] ^ this.aLong180 >>> 8;
			this.aLong180 = this.aLong180 >>> 8 ^ local10[(int) ((this.aLong180 ^ (long) (this.anIntArray646[local50] >> 8)) & 0xFFL)];
			this.aLong180 = local10[(int) ((this.aLong180 ^ (long) this.anIntArray646[local50]) & 0xFFL)] ^ this.aLong180 >>> 8;
		}
		for (@Pc(144) int local144 = 0; local144 < 5; local144++) {
			this.aLong180 = this.aLong180 >>> 8 ^ local10[(int) ((this.aLong180 ^ (long) this.anIntArray647[local144]) & 0xFFL)];
		}
		this.aLong180 = local10[(int) ((long) 255 & (this.aLong180 ^ (long) (this.aBoolean493 ? 1 : 0)))] ^ this.aLong180 >>> 8;
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(IIIIILclient!qa;IIBLclient!lk;Lclient!lq;Lclient!jh;)Lclient!r;")
	public Class97 method5973(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class4 arg5, @OriginalArg(7) int arg6, @OriginalArg(9) Class176 arg7, @OriginalArg(10) Class179 arg8, @OriginalArg(11) Class152 arg9) {
		@Pc(7) int local7 = 2048;
		@Pc(97) int local97;
		if (arg7 != null) {
			@Pc(11) boolean local11 = false;
			@Pc(13) boolean local13 = false;
			@Pc(15) boolean local15 = false;
			@Pc(17) boolean local17 = false;
			local7 = 2080;
			@Pc(34) int local34 = arg7.anIntArray432[arg2];
			@Pc(38) int local38 = local34 >>> 16;
			@Pc(43) Class1_Sub2_Sub17 local43 = arg9.method4041(local38);
			@Pc(47) int local47 = local34 & 0xFFFF;
			if (local43 != null) {
				local13 = local43.method6818(local47) | false;
				local11 = local43.method6820(local47) | false;
				local17 = local43.method6816(local47) | false;
				local15 = arg7.aBoolean394 | false;
			}
			if ((arg7.aBoolean395 || Static294.aBoolean419) && arg4 != -1 && arg7.anIntArray432.length > arg4) {
				local97 = arg7.anIntArray432[arg4];
				@Pc(101) int local101 = local97 >>> 16;
				@Pc(105) int local105 = local97 & 0xFFFF;
				@Pc(119) Class1_Sub2_Sub17 local119;
				if (local38 == local101) {
					local119 = local43;
				} else {
					local119 = arg9.method4041(local105 >>> 16);
				}
				if (local119 != null) {
					local13 |= local119.method6818(local105);
					local11 |= local119.method6820(local105);
					local17 |= local119.method6816(local105);
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
		@Pc(182) long local182 = (long) (arg6 << 16) | (long) arg1 << 32 | (long) arg3;
		@Pc(184) Class277 local184 = Static301.aClass277_42;
		@Pc(192) Class97 local192;
		synchronized (Static301.aClass277_42) {
			local192 = (Class97) Static301.aClass277_42.method7014(local182);
		}
		if (local192 == null || arg5.method7167(local192.ba(), local7) != 0) {
			if (local192 != null) {
				local7 = arg5.method7184(local7, local192.ba());
			}
			@Pc(219) Class81[] local219 = new Class81[3];
			local97 = 0;
			if (!arg8.method4890(arg3).method6389() || !arg8.method4890(arg6).method6389() || !arg8.method4890(arg1).method6389()) {
				return null;
			}
			@Pc(251) Class81 local251 = arg8.method4890(arg3).method6393();
			if (local251 != null) {
				local97++;
				local219[0] = local251;
			}
			local251 = arg8.method4890(arg6).method6393();
			if (local251 != null) {
				local219[local97++] = local251;
			}
			local251 = arg8.method4890(arg1).method6393();
			if (local251 != null) {
				local219[local97++] = local251;
			}
			local251 = new Class81(local219, local97);
			@Pc(296) int local296 = local7 | 0x4000;
			local192 = arg5.method7192(local251, local296, Static167.anInt3394, 64, 768);
			for (@Pc(306) int local306 = 0; local306 < 5; local306++) {
				if (this.anIntArray647[local306] < Static407.aShortArrayArray8[local306].length) {
					local192.pa(Static283.aShortArray94[local306], Static407.aShortArrayArray8[local306][this.anIntArray647[local306]]);
				}
				if (Static488.aShortArrayArray7[local306].length > this.anIntArray647[local306]) {
					local192.pa(Static429.aShortArray115[local306], Static488.aShortArrayArray7[local306][this.anIntArray647[local306]]);
				}
			}
			local192.m(local7);
			@Pc(361) Class277 local361 = Static301.aClass277_42;
			synchronized (Static301.aClass277_42) {
				Static301.aClass277_42.method7016(local192, local182);
			}
		}
		if (arg7 == null) {
			return local192;
		} else {
			local192 = local192.method6770((byte) 4, local7, true);
			return arg7.method4870(arg4, local192, 2048, arg0, arg2);
		}
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(III)V")
	public void method5974(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray647[arg0] = arg1;
		this.method5972();
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(ILclient!fba;IBLclient!jh;ILclient!lk;Lclient!kn;ILclient!wg;Lclient!qa;Lclient!lq;ZILclient!waa;IILclient!lk;[Lclient!tw;)Lclient!r;")
	public Class97 method5976(@OriginalArg(0) int arg0, @OriginalArg(1) Class95 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Class152 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class176 arg5, @OriginalArg(7) Class167 arg6, @OriginalArg(8) int arg7, @OriginalArg(9) Class316 arg8, @OriginalArg(10) Class4 arg9, @OriginalArg(11) Class179 arg10, @OriginalArg(13) int arg11, @OriginalArg(14) Interface19 arg12, @OriginalArg(15) int arg13, @OriginalArg(16) int arg14, @OriginalArg(17) Class176 arg15, @OriginalArg(18) Class286[] arg16) {
		if (this.anInt6650 != -1) {
			return arg1.method2362(this.anInt6650).method7372(arg2, arg4, arg0, arg3, arg11, arg15, arg9, arg7, arg12, arg16, arg14, arg5, arg6, arg13);
		}
		@Pc(33) int local33 = arg11;
		@Pc(36) long local36 = this.aLong180;
		@Pc(39) int[] local39 = this.anIntArray646;
		if (arg15 != null && (arg15.anInt5279 >= 0 || arg15.anInt5284 >= 0)) {
			local39 = new int[12];
			for (@Pc(55) int local55 = 0; local55 < 12; local55++) {
				local39[local55] = this.anIntArray646[local55];
			}
			if (arg15.anInt5279 >= 0) {
				if (arg15.anInt5279 == 65535) {
					local36 ^= 0xFFFFFFFF00000000L;
					local39[5] = 0;
				} else {
					local39[5] = arg15.anInt5279 | 0x40000000;
					local36 ^= (long) local39[5] << 32;
				}
			}
			if (arg15.anInt5284 >= 0) {
				if (arg15.anInt5284 == 65535) {
					local39[3] = 0;
					local36 ^= 0xFFFFFFFFL;
				} else {
					local39[3] = arg15.anInt5284 | 0x40000000;
					local36 ^= local39[3];
				}
			}
		}
		@Pc(139) boolean local139 = false;
		@Pc(141) boolean local141 = false;
		@Pc(143) boolean local143 = false;
		@Pc(151) boolean local151 = arg15 != null || arg5 != null;
		@Pc(158) int local158 = arg16 == null ? 0 : arg16.length;
		@Pc(194) int local194;
		@Pc(199) int local199;
		for (@Pc(160) int local160 = 0; local160 < local158; local160++) {
			Static434.aClass1_Sub2_Sub17Array4[local160] = null;
			if (arg16[local160] != null) {
				@Pc(180) Class176 local180 = arg3.method4045(arg16[local160].anInt8551);
				if (local180.anIntArray432 != null) {
					Static15.aClass176Array1[local160] = local180;
					local151 = true;
					local194 = arg16[local160].anInt8555;
					local199 = arg16[local160].anInt8556;
					@Pc(204) int local204 = local180.anIntArray432[local194];
					Static434.aClass1_Sub2_Sub17Array4[local160] = arg3.method4041(local204 >>> 16);
					@Pc(217) int local217 = local204 & 0xFFFF;
					Static302.anIntArray836[local160] = local217;
					if (Static434.aClass1_Sub2_Sub17Array4[local160] != null) {
						local141 |= Static434.aClass1_Sub2_Sub17Array4[local160].method6818(local217);
						local139 |= Static434.aClass1_Sub2_Sub17Array4[local160].method6820(local217);
						local143 |= Static434.aClass1_Sub2_Sub17Array4[local160].method6816(local217);
					}
					if ((local180.aBoolean395 || Static294.aBoolean419) && local199 != -1 && local199 < local180.anIntArray432.length) {
						Static206.anIntArray325[local160] = local180.anIntArray433[local194];
						Static414.anIntArray700[local160] = arg16[local160].anInt8554;
						@Pc(306) int local306 = local180.anIntArray432[local199];
						Static193.aClass1_Sub2_Sub17Array2[local160] = arg3.method4041(local306 >>> 16);
						@Pc(319) int local319 = local306 & 0xFFFF;
						Static387.anIntArray662[local160] = local319;
						if (Static193.aClass1_Sub2_Sub17Array2[local160] != null) {
							local141 |= Static193.aClass1_Sub2_Sub17Array2[local160].method6818(local319);
							local139 |= Static193.aClass1_Sub2_Sub17Array2[local160].method6820(local319);
							local143 |= Static193.aClass1_Sub2_Sub17Array2[local160].method6816(local319);
						}
					} else {
						Static206.anIntArray325[local160] = 0;
						Static414.anIntArray700[local160] = 0;
						Static193.aClass1_Sub2_Sub17Array2[local160] = null;
						Static387.anIntArray662[local160] = -1;
					}
				}
			}
		}
		@Pc(369) int local369 = -1;
		local194 = -1;
		local199 = 0;
		@Pc(375) Class1_Sub2_Sub17 local375 = null;
		@Pc(377) Class1_Sub2_Sub17 local377 = null;
		@Pc(379) int local379 = -1;
		@Pc(381) int local381 = -1;
		@Pc(383) int local383 = 0;
		@Pc(385) Class1_Sub2_Sub17 local385 = null;
		@Pc(387) Class1_Sub2_Sub17 local387 = null;
		if (local151) {
			@Pc(400) int local400;
			@Pc(463) int local463;
			if (arg15 != null) {
				local369 = arg15.anIntArray432[arg2];
				local400 = local369 >>> 16;
				local369 &= 0xFFFF;
				local375 = arg3.method4041(local400);
				if (local375 != null) {
					local141 |= local375.method6818(local369);
					local139 |= local375.method6820(local369);
					local143 |= local375.method6816(local369);
				}
				if ((arg15.aBoolean395 || Static294.aBoolean419) && arg13 != -1 && arg15.anIntArray432.length > arg13) {
					local194 = arg15.anIntArray432[arg13];
					local199 = arg15.anIntArray433[arg2];
					local463 = local194 >>> 16;
					local377 = local400 == local463 ? local375 : arg3.method4041(local463);
					local194 &= 0xFFFF;
					if (local377 != null) {
						local141 |= local377.method6818(local194);
						local139 |= local377.method6820(local194);
						local143 |= local377.method6816(local194);
					}
				}
			}
			local33 = arg11 | 0x20;
			if (arg5 != null) {
				local379 = arg5.anIntArray432[arg7];
				local400 = local379 >>> 16;
				local385 = arg3.method4041(local400);
				local379 &= 0xFFFF;
				if (local385 != null) {
					local141 |= local385.method6818(local379);
					local139 |= local385.method6820(local379);
					local143 |= local385.method6816(local379);
				}
				if ((arg5.aBoolean395 || Static294.aBoolean419) && arg4 != -1 && arg5.anIntArray432.length > arg4) {
					local381 = arg5.anIntArray432[arg4];
					local383 = arg5.anIntArray433[arg7];
					local463 = local381 >>> 16;
					local387 = local400 == local463 ? local385 : arg3.method4041(local463);
					local381 &= 0xFFFF;
					if (local387 != null) {
						local141 |= local387.method6818(local381);
						local139 |= local387.method6820(local381);
						local143 |= local387.method6816(local381);
					}
				}
			}
			if (local141) {
				local33 |= 0x80;
			}
			if (local139) {
				local33 |= 0x100;
			}
			if (local143) {
				local33 |= 0x400;
			}
		}
		@Pc(641) Class277 local641 = Static346.aClass277_50;
		@Pc(649) Class97 local649;
		synchronized (Static346.aClass277_50) {
			local649 = (Class97) Static346.aClass277_50.method7014(local36);
		}
		@Pc(657) Class299 local657 = null;
		if (this.anInt6649 != -1) {
			local657 = arg6.method4607(this.anInt6649);
		}
		@Pc(700) int local700;
		@Pc(706) int local706;
		if (local649 == null || arg9.method7167(local649.ba(), local33) != 0 || local657 != null && local657.anIntArrayArray116 != null && this.anIntArrayArray90 == null) {
			if (local649 != null) {
				local33 = arg9.method7184(local33, local649.ba());
			}
			@Pc(698) boolean local698 = false;
			local700 = 0;
			while (true) {
				if (local700 >= 12) {
					if (local698) {
						if (this.aLong181 != -1L) {
							@Pc(759) Class277 local759 = Static346.aClass277_50;
							synchronized (Static346.aClass277_50) {
								local649 = (Class97) Static346.aClass277_50.method7014(this.aLong181);
							}
						}
						if (local649 == null || arg9.method7167(local649.ba(), local33) != 0 || local657 != null && local657.anIntArrayArray116 != null && this.anIntArrayArray90 == null) {
							return null;
						}
					} else {
						@Pc(795) Class81[] local795 = new Class81[12];
						@Pc(803) int local803;
						for (@Pc(797) int local797 = 0; local797 < 12; local797++) {
							local803 = local39[local797];
							@Pc(823) Class81 local823;
							if ((local803 & 0x40000000) != 0) {
								local823 = arg8.method8107(local803 & 0x3FFFFFFF).method4986(this.aBoolean493);
								if (local823 != null) {
									local795[local797] = local823;
								}
							} else if ((Integer.MIN_VALUE & local803) != 0) {
								local823 = arg10.method4890(local803 & 0x3FFFFFFF).method6387();
								if (local823 != null) {
									local795[local797] = local823;
								}
							}
						}
						@Pc(884) int local884;
						if (local657 != null && local657.anIntArrayArray116 != null) {
							for (local803 = 0; local803 < local657.anIntArrayArray116.length; local803++) {
								if (local657.anIntArrayArray116[local803] != null && local795[local803] != null) {
									local884 = local657.anIntArrayArray116[local803][0];
									@Pc(891) int local891 = local657.anIntArrayArray116[local803][1];
									@Pc(898) int local898 = local657.anIntArrayArray116[local803][2];
									@Pc(907) int local907 = local657.anIntArrayArray116[local803][3] << 3;
									@Pc(916) int local916 = local657.anIntArrayArray116[local803][4] << 3;
									@Pc(925) int local925 = local657.anIntArrayArray116[local803][5] << 3;
									if (this.anIntArrayArray90 == null) {
										this.anIntArrayArray90 = new int[local657.anIntArrayArray116.length][];
									}
									if (this.anIntArrayArray90[local803] == null) {
										@Pc(947) int[] local947 = this.anIntArrayArray90[local803] = new int[15];
										if (local907 == 0 && local916 == 0 && local925 == 0) {
											local947[12] = -local884;
											local947[13] = -local891;
											local947[0] = local947[4] = local947[8] = 32768;
											local947[14] = -local898;
										} else {
											@Pc(992) int local992 = Class200_Sub1.anIntArray576[local907];
											@Pc(996) int local996 = Class200_Sub1.lb[local907];
											@Pc(1000) int local1000 = Class200_Sub1.anIntArray576[local916];
											@Pc(1004) int local1004 = Class200_Sub1.lb[local916];
											@Pc(1008) int local1008 = Class200_Sub1.anIntArray576[local925];
											@Pc(1012) int local1012 = Class200_Sub1.lb[local925];
											@Pc(1020) int local1020 = local996 * local1008 + 16384 >> 15;
											@Pc(1028) int local1028 = local1012 * local996 + 16384 >> 15;
											local947[2] = local1004 * local992 + 16384 >> 15;
											local947[6] = local1008 * -local1004 + local1028 * local1000 + 16384 >> 15;
											local947[5] = -local996;
											local947[3] = local992 * local1012 + 16384 >> 15;
											local947[1] = -local1012 * local1000 + local1020 * local1004 + 16384 >> 15;
											local947[7] = -local1004 * -local1012 + local1020 * local1000 + 16384 >> 15;
											local947[4] = local1008 * local992 + 16384 >> 15;
											local947[8] = local1000 * local992 + 16384 >> 15;
											local947[0] = local1028 * local1004 + local1000 * local1008 + 16384 >> 15;
											local947[13] = -local891 * local947[4] + local947[1] * -local884 + -local898 * local947[7] + 16384 >> 15;
											local947[14] = local947[5] * -local891 + local947[2] * -local884 + -local898 * local947[8] + 16384 >> 15;
											local947[12] = -local898 * local947[6] + -local884 * local947[0] + local947[3] * -local891 + 16384 >> 15;
										}
										local947[9] = local884;
										local947[11] = local898;
										local947[10] = local891;
									}
									if (local907 != 0 || local916 != 0 || local925 != 0) {
										local795[local803].method2168(local916, local925, local907);
									}
									if (local884 != 0 || local891 != 0 || local898 != 0) {
										local795[local803].method2158(local898, local884, local891);
									}
								}
							}
						}
						@Pc(1281) Class81 local1281 = new Class81(local795, local795.length);
						@Pc(1285) int local1285 = local33 | 0x4000;
						local649 = arg9.method7192(local1281, local1285, Static167.anInt3394, 64, 850);
						for (local884 = 0; local884 < 5; local884++) {
							if (Static407.aShortArrayArray8[local884].length > this.anIntArray647[local884]) {
								local649.pa(Static283.aShortArray94[local884], Static407.aShortArrayArray8[local884][this.anIntArray647[local884]]);
							}
							if (this.anIntArray647[local884] < Static488.aShortArrayArray7[local884].length) {
								local649.pa(Static429.aShortArray115[local884], Static488.aShortArrayArray7[local884][this.anIntArray647[local884]]);
							}
						}
						local649.m(local33);
						@Pc(1358) Class277 local1358 = Static346.aClass277_50;
						synchronized (Static346.aClass277_50) {
							Static346.aClass277_50.method7016(local649, local36);
						}
						this.aLong181 = local36;
					}
					break;
				}
				local706 = local39[local700];
				if ((local706 & 0x40000000) == 0) {
					if ((local706 & Integer.MIN_VALUE) != 0 && !arg10.method4890(local706 & 0x3FFFFFFF).method6390()) {
						local698 = true;
					}
				} else if (!arg8.method8107(local706 & 0x3FFFFFFF).method4983(this.aBoolean493)) {
					local698 = true;
				}
				local700++;
			}
		}
		@Pc(1380) Class97 local1380 = local649.method6770((byte) 4, local33, true);
		if (!local151) {
			return local1380;
		}
		@Pc(1386) int local1386 = 0;
		local700 = 1;
		while (local158 > local1386) {
			if (Static434.aClass1_Sub2_Sub17Array4[local1386] != null) {
				local1380.method6768(Static206.anIntArray325[local1386], local700, Static302.anIntArray836[local1386], Static434.aClass1_Sub2_Sub17Array4[local1386], Static193.aClass1_Sub2_Sub17Array2[local1386], false, Static387.anIntArray662[local1386], Static414.anIntArray700[local1386] - 1, this.anIntArrayArray90 == null ? null : this.anIntArrayArray90[local1386]);
			}
			local1386++;
			local700 <<= 0x1;
		}
		if (local375 != null && local385 != null) {
			local1380.method6775(local377, arg14 - 1, arg0 - 1, local199, local369, local194, local381, arg15.aBooleanArray20, false, local379, local387, local385, local375, local383);
		} else if (local375 != null) {
			local1380.method6772(local377, local369, 0, false, local194, local375, arg14 - 1, local199);
		} else if (local385 != null) {
			local1380.method6772(local387, local379, 0, false, local381, local385, arg0 - 1, local383);
		}
		for (local706 = 0; local706 < local158; local706++) {
			Static434.aClass1_Sub2_Sub17Array4[local706] = null;
			Static193.aClass1_Sub2_Sub17Array2[local706] = null;
			Static15.aClass176Array1[local706] = null;
		}
		return local1380;
	}
}
