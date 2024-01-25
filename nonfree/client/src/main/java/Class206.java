import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qo")
public final class Class206 {

	@OriginalMember(owner = "client!qo", name = "b", descriptor = "J")
	private long aLong172;

	@OriginalMember(owner = "client!qo", name = "e", descriptor = "J")
	private long aLong173;

	@OriginalMember(owner = "client!qo", name = "f", descriptor = "I")
	private int anInt5700;

	@OriginalMember(owner = "client!qo", name = "j", descriptor = "[I")
	private int[] anIntArray377;

	@OriginalMember(owner = "client!qo", name = "k", descriptor = "[[I")
	private int[][] anIntArrayArray40;

	@OriginalMember(owner = "client!qo", name = "p", descriptor = "Z")
	public boolean aBoolean489;

	@OriginalMember(owner = "client!qo", name = "s", descriptor = "[I")
	public int[] anIntArray378;

	@OriginalMember(owner = "client!qo", name = "r", descriptor = "I")
	public int anInt5707 = -1;

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(I)V")
	private void method4452() {
		@Pc(5) long[] local5 = Class104.aLongArray4;
		this.aLong173 = -1L;
		this.aLong173 = local5[(int) (((long) (this.anInt5700 >> 8) ^ this.aLong173) & 0xFFL)] ^ this.aLong173 >>> 8;
		this.aLong173 = local5[(int) (((long) this.anInt5700 ^ this.aLong173) & 0xFFL)] ^ this.aLong173 >>> 8;
		for (@Pc(48) int local48 = 0; local48 < 12; local48++) {
			this.aLong173 = local5[(int) (((long) (this.anIntArray377[local48] >> 24) ^ this.aLong173) & 0xFFL)] ^ this.aLong173 >>> 8;
			this.aLong173 = local5[(int) (((long) (this.anIntArray377[local48] >> 16) ^ this.aLong173) & 0xFFL)] ^ this.aLong173 >>> 8;
			this.aLong173 = this.aLong173 >>> 8 ^ local5[(int) ((this.aLong173 ^ (long) (this.anIntArray377[local48] >> 8)) & 0xFFL)];
			this.aLong173 = local5[(int) ((this.aLong173 ^ (long) this.anIntArray377[local48]) & 0xFFL)] ^ this.aLong173 >>> 8;
		}
		for (@Pc(148) int local148 = 0; local148 < 5; local148++) {
			this.aLong173 = local5[(int) (((long) this.anIntArray378[local148] ^ this.aLong173) & 0xFFL)] ^ this.aLong173 >>> 8;
		}
		this.aLong173 = this.aLong173 >>> 8 ^ local5[(int) ((this.aLong173 ^ (long) (this.aBoolean489 ? 1 : 0)) & 0xFFL)];
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(ILclient!qa;ILclient!nt;IIBIILclient!er;ILclient!kf;)Lclient!c;")
	public Class9 method4453(@OriginalArg(0) int arg0, @OriginalArg(1) Class172 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class170 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(9) Class69 arg7, @OriginalArg(10) int arg8, @OriginalArg(11) Class128 arg9) {
		@Pc(10) int local10 = 2048;
		@Pc(97) int local97;
		if (arg9 != null) {
			@Pc(14) boolean local14 = false;
			@Pc(16) boolean local16 = false;
			@Pc(18) boolean local18 = false;
			@Pc(20) boolean local20 = false;
			local10 = 2080;
			@Pc(37) int local37 = arg9.anIntArray252[arg2];
			@Pc(41) int local41 = local37 >>> 16;
			@Pc(45) int local45 = local37 & 0xFFFF;
			@Pc(50) Class3_Sub4_Sub16 local50 = arg3.method3928(local41);
			if (local50 != null) {
				local16 = local50.method5870(local45) | false;
				local14 = local50.method5872(local45) | false;
				local20 = local50.method5868(local45) | false;
				local18 = arg9.aBoolean343 | false;
			}
			if ((arg9.aBoolean342 || Static262.aBoolean439) && arg6 != -1 && arg6 < arg9.anIntArray252.length) {
				local97 = arg9.anIntArray252[arg6];
				@Pc(101) int local101 = local97 >>> 16;
				@Pc(105) int local105 = local97 & 0xFFFF;
				@Pc(115) Class3_Sub4_Sub16 local115;
				if (local101 == local41) {
					local115 = local50;
				} else {
					local115 = arg3.method3928(local105 >>> 16);
				}
				if (local115 != null) {
					local16 |= local115.method5870(local105);
					local14 |= local115.method5872(local105);
					local20 |= local115.method5868(local105);
				}
			}
			if (local16) {
				local10 = 2208;
			}
			if (local14) {
				local10 |= 0x100;
			}
			if (local18) {
				local10 |= 0x200;
			}
			if (local20) {
				local10 |= 0x400;
			}
		}
		@Pc(178) long local178 = (long) arg8 | (long) arg0 << 32 | (long) (arg5 << 16);
		@Pc(180) Class126 local180 = Static179.aClass126_46;
		@Pc(188) Class9 local188;
		synchronized (Static179.aClass126_46) {
			local188 = (Class9) Static179.aClass126_46.method3141(local178);
		}
		if (local188 == null || arg1.method5501(local188.n(), local10) != 0) {
			if (local188 != null) {
				local10 = arg1.method5492(local10, local188.n());
			}
			@Pc(215) Class161[] local215 = new Class161[3];
			local97 = 0;
			if (!arg7.method1706(arg8).method4471() || !arg7.method1706(arg5).method4471() || !arg7.method1706(arg0).method4471()) {
				return null;
			}
			@Pc(245) Class161 local245 = arg7.method1706(arg8).method4465();
			if (local245 != null) {
				local97++;
				local215[0] = local245;
			}
			local245 = arg7.method1706(arg5).method4465();
			if (local245 != null) {
				local215[local97++] = local245;
			}
			local245 = arg7.method1706(arg0).method4465();
			if (local245 != null) {
				local215[local97++] = local245;
			}
			local245 = new Class161(local215, local97);
			@Pc(290) int local290 = local10 | 0x4000;
			local188 = arg1.method5537(local245, local290, Static182.anInt3626, 64, 768);
			for (@Pc(300) int local300 = 0; local300 < 5; local300++) {
				if (this.anIntArray378[local300] < Static109.aShortArrayArray1[local300].length) {
					local188.N(Static293.aShortArray92[local300], Static109.aShortArrayArray1[local300][this.anIntArray378[local300]]);
				}
				if (this.anIntArray378[local300] < Static251.aShortArrayArray3[local300].length) {
					local188.N(Static331.aShortArray158[local300], Static251.aShortArrayArray3[local300][this.anIntArray378[local300]]);
				}
			}
			local188.u(local10);
			@Pc(360) Class126 local360 = Static179.aClass126_46;
			synchronized (Static179.aClass126_46) {
				Static179.aClass126_46.method3132(local178, local188);
			}
		}
		if (arg9 == null) {
			return local188;
		} else {
			local188 = local188.method5699((byte) 4, local10, true);
			return arg9.method3188(2048, arg2, arg4, local188, arg6);
		}
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(ZII[II[I)V")
	public void method4454(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int[] arg4) {
		this.anIntArray378 = arg2;
		this.anInt5707 = arg3;
		this.aBoolean489 = arg0;
		this.anIntArray377 = arg4;
		if (this.anInt5700 != arg1) {
			this.anInt5700 = arg1;
			this.anIntArrayArray40 = null;
		}
		this.method4452();
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(IILclient!tj;IILclient!ao;Lclient!kf;Lclient!gv;ILclient!er;Lclient!nt;Lclient!qa;)Lclient!c;")
	public Class9 method4458(@OriginalArg(1) int arg0, @OriginalArg(2) Interface9 arg1, @OriginalArg(4) int arg2, @OriginalArg(5) Class12 arg3, @OriginalArg(6) Class128 arg4, @OriginalArg(7) Class96 arg5, @OriginalArg(8) int arg6, @OriginalArg(9) Class69 arg7, @OriginalArg(10) Class170 arg8, @OriginalArg(11) Class172 arg9) {
		if (this.anInt5707 != -1) {
			return arg5.method2199(this.anInt5707).method1242(arg6, arg8, arg9, arg4, arg2, arg0, arg1);
		}
		@Pc(32) int local32 = 2048;
		@Pc(40) boolean local40;
		@Pc(55) int local55;
		@Pc(124) int local124;
		@Pc(63) int local63;
		if (arg4 != null) {
			@Pc(36) boolean local36 = false;
			@Pc(38) boolean local38 = false;
			local40 = false;
			@Pc(42) boolean local42 = false;
			local55 = arg4.anIntArray252[arg0];
			local32 = 2080;
			local63 = local55 >>> 16;
			@Pc(67) int local67 = local55 & 0xFFFF;
			@Pc(72) Class3_Sub4_Sub16 local72 = arg8.method3928(local63);
			if (local72 != null) {
				local38 = local72.method5870(local67) | false;
				local36 = local72.method5872(local67) | false;
				local42 = local72.method5868(local67) | false;
				local40 = arg4.aBoolean343 | false;
			}
			if ((arg4.aBoolean342 || Static262.aBoolean439) && arg2 != -1 && arg2 < arg4.anIntArray252.length) {
				local124 = arg4.anIntArray252[arg2];
				@Pc(128) int local128 = local124 >>> 16;
				@Pc(132) int local132 = local124 & 0xFFFF;
				@Pc(146) Class3_Sub4_Sub16 local146 = local128 == local63 ? local72 : arg8.method3928(local128);
				if (local146 != null) {
					local38 |= local146.method5870(local132);
					local36 |= local146.method5872(local132);
					local42 |= local146.method5868(local132);
				}
			}
			if (local38) {
				local32 = 2208;
			}
			if (local36) {
				local32 |= 0x100;
			}
			if (local40) {
				local32 |= 0x200;
			}
			if (local42) {
				local32 |= 0x400;
			}
		}
		@Pc(195) Class126 local195 = Static179.aClass126_46;
		@Pc(204) Class9 local204;
		synchronized (Static179.aClass126_46) {
			local204 = (Class9) Static179.aClass126_46.method3141(this.aLong173);
		}
		if (local204 == null || arg9.method5501(local204.n(), local32) != 0) {
			if (local204 != null) {
				local32 = arg9.method5492(local32, local204.n());
			}
			local40 = false;
			for (@Pc(232) int local232 = 0; local232 < 12; local232++) {
				local55 = this.anIntArray377[local232];
				if ((local55 & 0x40000000) == 0) {
					if ((local55 & Integer.MIN_VALUE) != 0 && !arg7.method1706(local55 & 0x3FFFFFFF).method4471()) {
						local40 = true;
					}
				} else if (!arg3.method327(local55 & 0x3FFFFFFF).method1953(this.aBoolean489)) {
					local40 = true;
				}
			}
			if (local40) {
				return null;
			}
			@Pc(289) Class161[] local289 = new Class161[12];
			local124 = 0;
			for (@Pc(293) int local293 = 0; local293 < 12; local293++) {
				@Pc(299) int local299 = this.anIntArray377[local293];
				@Pc(316) Class161 local316;
				if ((local299 & 0x40000000) != 0) {
					local316 = arg3.method327(local299 & 0x3FFFFFFF).method1949(this.aBoolean489);
					if (local316 != null) {
						local289[local124++] = local316;
					}
				} else if ((local299 & Integer.MIN_VALUE) != 0) {
					local316 = arg7.method1706(local299 & 0x3FFFFFFF).method4465();
					if (local316 != null) {
						local289[local124++] = local316;
					}
				}
			}
			@Pc(352) Class161 local352 = new Class161(local289, local124);
			@Pc(356) int local356 = local32 | 0x4000;
			local204 = arg9.method5537(local352, local356, Static182.anInt3626, 64, 768);
			for (local63 = 0; local63 < 5; local63++) {
				if (Static109.aShortArrayArray1[local63].length > this.anIntArray378[local63]) {
					local204.N(Static293.aShortArray92[local63], Static109.aShortArrayArray1[local63][this.anIntArray378[local63]]);
				}
				if (Static251.aShortArrayArray3[local63].length > this.anIntArray378[local63]) {
					local204.N(Static331.aShortArray158[local63], Static251.aShortArrayArray3[local63][this.anIntArray378[local63]]);
				}
			}
			local204.u(local32);
			@Pc(424) Class126 local424 = Static179.aClass126_46;
			synchronized (Static179.aClass126_46) {
				Static179.aClass126_46.method3132(this.aLong173, local204);
			}
		}
		if (arg4 == null) {
			return local204;
		} else {
			local204.method5699((byte) 4, local32, true);
			return arg4.method3188(2048, arg0, arg6, local204, arg2);
		}
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(Lclient!ao;IIZLclient!tj;ZLclient!kf;[Lclient!aw;ILclient!er;ILclient!fc;Lclient!qa;Lclient!nt;ILclient!kf;IILclient!gv;)Lclient!c;")
	public Class9 method4459(@OriginalArg(0) Class12 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Interface9 arg3, @OriginalArg(6) Class128 arg4, @OriginalArg(7) Class17[] arg5, @OriginalArg(8) int arg6, @OriginalArg(9) Class69 arg7, @OriginalArg(10) int arg8, @OriginalArg(11) Class73 arg9, @OriginalArg(12) Class172 arg10, @OriginalArg(13) Class170 arg11, @OriginalArg(14) int arg12, @OriginalArg(15) Class128 arg13, @OriginalArg(16) int arg14, @OriginalArg(17) int arg15, @OriginalArg(18) Class96 arg16) {
		if (this.anInt5707 != -1) {
			return arg16.method2199(this.anInt5707).method1249(arg9, arg5, arg3, arg10, arg15, arg2, arg4, arg12, arg11, arg1, arg13, arg6, arg14, arg8);
		}
		@Pc(31) int local31 = arg12;
		@Pc(34) long local34 = this.aLong173;
		@Pc(37) int[] local37 = this.anIntArray377;
		if (arg4 != null && (arg4.anInt3971 >= 0 || arg4.anInt3981 >= 0)) {
			local37 = new int[12];
			for (@Pc(53) int local53 = 0; local53 < 12; local53++) {
				local37[local53] = this.anIntArray377[local53];
			}
			if (arg4.anInt3971 >= 0) {
				if (arg4.anInt3971 == 65535) {
					local34 ^= 0xFFFFFFFF00000000L;
					local37[5] = 0;
				} else {
					local37[5] = arg4.anInt3971 | 0x40000000;
					local34 ^= (long) local37[5] << 32;
				}
			}
			if (arg4.anInt3981 >= 0) {
				if (arg4.anInt3981 == 65535) {
					local37[3] = 0;
					local34 ^= 0xFFFFFFFFL;
				} else {
					local37[3] = arg4.anInt3981 | 0x40000000;
					local34 ^= local37[3];
				}
			}
		}
		@Pc(129) boolean local129 = false;
		@Pc(131) boolean local131 = false;
		@Pc(133) boolean local133 = false;
		@Pc(141) boolean local141 = arg4 != null || arg13 != null;
		@Pc(148) int local148 = arg5 == null ? 0 : arg5.length;
		@Pc(181) int local181;
		@Pc(186) int local186;
		for (@Pc(150) int local150 = 0; local150 < local148; local150++) {
			Static292.aClass3_Sub4_Sub16Array4[local150] = null;
			if (arg5[local150] != null) {
				@Pc(167) Class128 local167 = arg11.method3936(arg5[local150].anInt770);
				if (local167.anIntArray252 != null) {
					local141 = true;
					Static105.aClass128Array2[local150] = local167;
					local181 = arg5[local150].anInt768;
					local186 = arg5[local150].anInt769;
					@Pc(191) int local191 = local167.anIntArray252[local181];
					Static292.aClass3_Sub4_Sub16Array4[local150] = arg11.method3928(local191 >>> 16);
					@Pc(204) int local204 = local191 & 0xFFFF;
					Static207.anIntArray262[local150] = local204;
					if (Static292.aClass3_Sub4_Sub16Array4[local150] != null) {
						local131 |= Static292.aClass3_Sub4_Sub16Array4[local150].method5870(local204);
						local129 |= Static292.aClass3_Sub4_Sub16Array4[local150].method5872(local204);
						local133 |= Static292.aClass3_Sub4_Sub16Array4[local150].method5868(local204);
					}
					if ((local167.aBoolean342 || Static262.aBoolean439) && local186 != -1 && local167.anIntArray252.length > local186) {
						Static157.anIntArray203[local150] = local167.anIntArray254[local181];
						Static27.anIntArray138[local150] = arg5[local150].anInt771;
						@Pc(289) int local289 = local167.anIntArray252[local186];
						Static72.aClass3_Sub4_Sub16Array2[local150] = arg11.method3928(local289 >>> 16);
						@Pc(302) int local302 = local289 & 0xFFFF;
						Static136.anIntArray175[local150] = local302;
						if (Static72.aClass3_Sub4_Sub16Array2[local150] != null) {
							local131 |= Static72.aClass3_Sub4_Sub16Array2[local150].method5870(local302);
							local129 |= Static72.aClass3_Sub4_Sub16Array2[local150].method5872(local302);
							local133 |= Static72.aClass3_Sub4_Sub16Array2[local150].method5868(local302);
						}
					} else {
						Static157.anIntArray203[local150] = 0;
						Static27.anIntArray138[local150] = 0;
						Static72.aClass3_Sub4_Sub16Array2[local150] = null;
						Static136.anIntArray175[local150] = -1;
					}
				}
			}
		}
		@Pc(343) int local343 = -1;
		local181 = -1;
		local186 = 0;
		@Pc(349) Class3_Sub4_Sub16 local349 = null;
		@Pc(351) Class3_Sub4_Sub16 local351 = null;
		@Pc(353) int local353 = -1;
		@Pc(355) int local355 = -1;
		@Pc(357) int local357 = 0;
		@Pc(359) Class3_Sub4_Sub16 local359 = null;
		@Pc(361) Class3_Sub4_Sub16 local361 = null;
		if (local141) {
			local31 = arg12 | 0x20;
			@Pc(378) int local378;
			@Pc(437) int local437;
			if (arg4 != null) {
				local343 = arg4.anIntArray252[arg2];
				local378 = local343 >>> 16;
				local349 = arg11.method3928(local378);
				local343 &= 0xFFFF;
				if (local349 != null) {
					local131 |= local349.method5870(local343);
					local129 |= local349.method5872(local343);
					local133 |= local349.method5868(local343);
				}
				if ((arg4.aBoolean342 || Static262.aBoolean439) && arg8 != -1 && arg4.anIntArray252.length > arg8) {
					local186 = arg4.anIntArray254[arg2];
					local181 = arg4.anIntArray252[arg8];
					local437 = local181 >>> 16;
					local351 = local378 == local437 ? local349 : arg11.method3928(local437);
					local181 &= 0xFFFF;
					if (local351 != null) {
						local131 |= local351.method5870(local181);
						local129 |= local351.method5872(local181);
						local133 |= local351.method5868(local181);
					}
				}
			}
			if (arg13 != null) {
				local353 = arg13.anIntArray252[arg15];
				local378 = local353 >>> 16;
				local359 = arg11.method3928(local378);
				local353 &= 0xFFFF;
				if (local359 != null) {
					local131 |= local359.method5870(local353);
					local129 |= local359.method5872(local353);
					local133 |= local359.method5868(local353);
				}
				if ((arg13.aBoolean342 || Static262.aBoolean439) && arg1 != -1 && arg13.anIntArray252.length > arg1) {
					local357 = arg13.anIntArray254[arg15];
					local355 = arg13.anIntArray252[arg1];
					local437 = local355 >>> 16;
					local355 &= 0xFFFF;
					local361 = local378 == local437 ? local359 : arg11.method3928(local437);
					if (local361 != null) {
						local131 |= local361.method5870(local355);
						local129 |= local361.method5872(local355);
						local133 |= local361.method5868(local355);
					}
				}
			}
			if (local131) {
				local31 |= 0x80;
			}
			if (local129) {
				local31 |= 0x100;
			}
			if (local133) {
				local31 |= 0x400;
			}
		}
		@Pc(609) Class126 local609 = Static219.aClass126_25;
		@Pc(617) Class9 local617;
		synchronized (Static219.aClass126_25) {
			local617 = (Class9) Static219.aClass126_25.method3141(local34);
		}
		@Pc(625) Class1 local625 = null;
		if (this.anInt5700 != -1) {
			local625 = arg9.method1823(this.anInt5700);
		}
		@Pc(666) int local666;
		@Pc(671) int local671;
		if (local617 == null || arg10.method5501(local617.n(), local31) != 0 || local625 != null && local625.anIntArrayArray1 != null && this.anIntArrayArray40 == null) {
			if (local617 != null) {
				local31 = arg10.method5492(local31, local617.n());
			}
			@Pc(664) boolean local664 = false;
			local666 = 0;
			while (true) {
				if (local666 >= 12) {
					if (local664) {
						if (this.aLong172 != -1L) {
							@Pc(1300) Class126 local1300 = Static219.aClass126_25;
							synchronized (Static219.aClass126_25) {
								local617 = (Class9) Static219.aClass126_25.method3141(this.aLong172);
							}
						}
						if (local617 == null || arg10.method5501(local617.n(), local31) != 0 || local625 != null && local625.anIntArrayArray1 != null && this.anIntArrayArray40 == null) {
							return null;
						}
					} else {
						@Pc(715) Class161[] local715 = new Class161[12];
						@Pc(722) int local722;
						for (@Pc(717) int local717 = 0; local717 < 12; local717++) {
							local722 = local37[local717];
							@Pc(745) Class161 local745;
							if ((local722 & 0x40000000) != 0) {
								local745 = arg0.method327(local722 & 0x3FFFFFFF).method1936(this.aBoolean489);
								if (local745 != null) {
									local715[local717] = local745;
								}
							} else if ((local722 & Integer.MIN_VALUE) != 0) {
								local745 = arg7.method1706(local722 & 0x3FFFFFFF).method4469();
								if (local745 != null) {
									local715[local717] = local745;
								}
							}
						}
						@Pc(798) int local798;
						if (local625 != null && local625.anIntArrayArray1 != null) {
							for (local722 = 0; local722 < local625.anIntArrayArray1.length; local722++) {
								if (local625.anIntArrayArray1[local722] != null && local715[local722] != null) {
									local798 = local625.anIntArrayArray1[local722][0];
									@Pc(805) int local805 = local625.anIntArrayArray1[local722][1];
									@Pc(812) int local812 = local625.anIntArrayArray1[local722][2];
									@Pc(821) int local821 = local625.anIntArrayArray1[local722][3] << 3;
									@Pc(830) int local830 = local625.anIntArrayArray1[local722][4] << 3;
									@Pc(839) int local839 = local625.anIntArrayArray1[local722][5] << 3;
									if (this.anIntArrayArray40 == null) {
										this.anIntArrayArray40 = new int[local625.anIntArrayArray1.length][];
									}
									if (this.anIntArrayArray40[local722] == null) {
										@Pc(861) int[] local861 = this.anIntArrayArray40[local722] = new int[15];
										if (local821 == 0 && local830 == 0 && local839 == 0) {
											local861[12] = -local798;
											local861[0] = local861[4] = local861[8] = 32768;
											local861[13] = -local805;
											local861[14] = -local812;
										} else {
											@Pc(874) int local874 = Class3_Sub2_Sub17.anIntArray290[local821];
											@Pc(878) int local878 = Class3_Sub2_Sub17.anIntArray289[local821];
											@Pc(882) int local882 = Class3_Sub2_Sub17.anIntArray290[local830];
											@Pc(886) int local886 = Class3_Sub2_Sub17.anIntArray289[local830];
											@Pc(890) int local890 = Class3_Sub2_Sub17.anIntArray290[local839];
											@Pc(894) int local894 = Class3_Sub2_Sub17.anIntArray289[local839];
											@Pc(902) int local902 = local878 * local890 + 16384 >> 15;
											@Pc(910) int local910 = local894 * local878 + 16384 >> 15;
											local861[0] = local886 * local910 + local890 * local882 + 16384 >> 15;
											local861[8] = local882 * local874 + 16384 >> 15;
											local861[7] = local902 * local882 + -local886 * -local894 + 16384 >> 15;
											local861[1] = local886 * local902 + -local894 * local882 + 16384 >> 15;
											local861[5] = -local878;
											local861[2] = local886 * local874 + 16384 >> 15;
											local861[3] = local874 * local894 + 16384 >> 15;
											local861[6] = -local886 * local890 + local910 * local882 + 16384 >> 15;
											local861[4] = local874 * local890 + 16384 >> 15;
											local861[12] = -local812 * local861[6] + -local798 * local861[0] + -local805 * local861[3] + 16384 >> 15;
											local861[14] = -local812 * local861[8] + local861[5] * -local805 + -local798 * local861[2] + 16384 >> 15;
											local861[13] = -local798 * local861[1] + local861[4] * -local805 + local861[7] * -local812 + 16384 >> 15;
										}
										local861[9] = local798;
										local861[10] = local805;
										local861[11] = local812;
									}
									if (local821 != 0 || local830 != 0 || local839 != 0) {
										local715[local722].method3820(local821, local830, local839);
									}
									if (local798 != 0 || local805 != 0 || local812 != 0) {
										local715[local722].method3829(local798, local812, local805);
									}
								}
							}
						}
						@Pc(1198) Class161 local1198 = new Class161(local715, local715.length);
						@Pc(1202) int local1202 = local31 | 0x4000;
						local617 = arg10.method5537(local1198, local1202, Static182.anInt3626, 64, 850);
						for (local798 = 0; local798 < 5; local798++) {
							if (Static109.aShortArrayArray1[local798].length > this.anIntArray378[local798]) {
								local617.N(Static293.aShortArray92[local798], Static109.aShortArrayArray1[local798][this.anIntArray378[local798]]);
							}
							if (this.anIntArray378[local798] < Static251.aShortArrayArray3[local798].length) {
								local617.N(Static331.aShortArray158[local798], Static251.aShortArrayArray3[local798][this.anIntArray378[local798]]);
							}
						}
						local617.u(local31);
						@Pc(1274) Class126 local1274 = Static219.aClass126_25;
						synchronized (Static219.aClass126_25) {
							Static219.aClass126_25.method3132(local34, local617);
						}
						this.aLong172 = local34;
					}
					break;
				}
				local671 = local37[local666];
				if ((local671 & 0x40000000) == 0) {
					if ((local671 & Integer.MIN_VALUE) != 0 && !arg7.method1706(local671 & 0x3FFFFFFF).method4472()) {
						local664 = true;
					}
				} else if (!arg0.method327(local671 & 0x3FFFFFFF).method1943(this.aBoolean489)) {
					local664 = true;
				}
				local666++;
			}
		}
		@Pc(1342) Class9 local1342 = local617.method5699((byte) 4, local31, true);
		if (!local141) {
			return local1342;
		}
		@Pc(1348) int local1348 = 0;
		local666 = 1;
		while (local1348 < local148) {
			if (Static292.aClass3_Sub4_Sub16Array4[local1348] != null) {
				local1342.method5684(Static72.aClass3_Sub4_Sub16Array2[local1348], local666, false, Static207.anIntArray262[local1348], Static292.aClass3_Sub4_Sub16Array4[local1348], Static157.anIntArray203[local1348], this.anIntArrayArray40 == null ? null : this.anIntArrayArray40[local1348], Static136.anIntArray175[local1348], Static27.anIntArray138[local1348] - 1);
			}
			local1348++;
			local666 <<= 0x1;
		}
		if (local349 != null && local359 != null) {
			local1342.method5697(local351, local357, local355, false, local181, local359, arg4.aBooleanArray14, local361, local353, local343, arg6 - 1, arg14 + -1, local186, local349);
		} else if (local349 != null) {
			local1342.method5691(local349, false, local351, local186, local343, arg6 - 1, 0, local181);
		} else if (local359 != null) {
			local1342.method5691(local359, false, local361, local357, local353, arg14 - 1, 0, local355);
		}
		for (local671 = 0; local671 < local148; local671++) {
			Static292.aClass3_Sub4_Sub16Array4[local671] = null;
			Static72.aClass3_Sub4_Sub16Array2[local671] = null;
			Static105.aClass128Array2[local671] = null;
		}
		return local1342;
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(IZ)V")
	public void method4460(@OriginalArg(1) boolean arg0) {
		this.aBoolean489 = arg0;
		this.method4452();
	}

	@OriginalMember(owner = "client!qo", name = "b", descriptor = "(III)V")
	public void method4461(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anIntArray378[arg1] = arg0;
		this.method4452();
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(ILclient!er;II)V")
	public void method4462(@OriginalArg(0) int arg0, @OriginalArg(1) Class69 arg1, @OriginalArg(2) int arg2) {
		@Pc(32) int local32 = Static206.anIntArray257[arg2];
		if (this.anIntArray377[local32] != 0 && arg1.method1706(arg0) != null) {
			this.anIntArray377[local32] = arg0 | Integer.MIN_VALUE;
			this.method4452();
		}
	}
}
