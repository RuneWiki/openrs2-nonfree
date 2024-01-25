import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jaa")
public final class Class166 {

	@OriginalMember(owner = "client!jaa", name = "c", descriptor = "[I")
	private int[] anIntArray205;

	@OriginalMember(owner = "client!jaa", name = "e", descriptor = "J")
	private long aLong125;

	@OriginalMember(owner = "client!jaa", name = "m", descriptor = "[I")
	public int[] anIntArray206;

	@OriginalMember(owner = "client!jaa", name = "o", descriptor = "Z")
	public boolean aBoolean313;

	@OriginalMember(owner = "client!jaa", name = "p", descriptor = "J")
	private long aLong126;

	@OriginalMember(owner = "client!jaa", name = "r", descriptor = "I")
	private int anInt4205;

	@OriginalMember(owner = "client!jaa", name = "i", descriptor = "I")
	public int anInt4200 = -1;

	@OriginalMember(owner = "client!jaa", name = "a", descriptor = "(I)V")
	private void method3731() {
		@Pc(7) long[] local7 = Class157.aLongArray9;
		this.aLong125 = -1L;
		this.aLong125 = local7[(int) (((long) (this.anInt4205 >> 8) ^ this.aLong125) & 0xFFL)] ^ this.aLong125 >>> 8;
		this.aLong125 = local7[(int) ((this.aLong125 ^ (long) this.anInt4205) & 0xFFL)] ^ this.aLong125 >>> 8;
		for (@Pc(50) int local50 = 0; local50 < 12; local50++) {
			this.aLong125 = this.aLong125 >>> 8 ^ local7[(int) ((this.aLong125 ^ (long) (this.anIntArray205[local50] >> 24)) & 0xFFL)];
			this.aLong125 = this.aLong125 >>> 8 ^ local7[(int) (((long) (this.anIntArray205[local50] >> 16) ^ this.aLong125) & 0xFFL)];
			this.aLong125 = this.aLong125 >>> 8 ^ local7[(int) (((long) (this.anIntArray205[local50] >> 8) ^ this.aLong125) & 0xFFL)];
			this.aLong125 = local7[(int) ((this.aLong125 ^ (long) this.anIntArray205[local50]) & 0xFFL)] ^ this.aLong125 >>> 8;
		}
		for (@Pc(162) int local162 = 0; local162 < 5; local162++) {
			this.aLong125 = local7[(int) ((this.aLong125 ^ (long) this.anIntArray206[local162]) & 0xFFL)] ^ this.aLong125 >>> 8;
		}
		this.aLong125 = this.aLong125 >>> 8 ^ local7[(int) ((this.aLong125 ^ (long) (this.aBoolean313 ? 1 : 0)) & 0xFFL)];
	}

	@OriginalMember(owner = "client!jaa", name = "a", descriptor = "(Lclient!bfa;Lclient!r;Lclient!ri;Lclient!wt;BIILclient!rg;ILclient!qk;ILclient!cf;)Lclient!da;")
	public Class57 method3732(@OriginalArg(0) Class31 arg0, @OriginalArg(1) Class44 arg1, @OriginalArg(2) Interface21 arg2, @OriginalArg(3) Class365 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class290 arg6, @OriginalArg(9) Class273 arg7, @OriginalArg(10) int arg8, @OriginalArg(11) Class48 arg9) {
		if (this.anInt4200 != -1) {
			return arg0.method478(this.anInt4200).method6838(arg9, arg1, arg8, arg4, arg5, arg2, arg3);
		}
		@Pc(28) int local28 = 2048;
		@Pc(36) boolean local36;
		@Pc(55) int local55;
		@Pc(119) int local119;
		@Pc(59) int local59;
		@Pc(123) int local123;
		if (arg3 != null) {
			@Pc(32) boolean local32 = false;
			@Pc(34) boolean local34 = false;
			local36 = false;
			@Pc(38) boolean local38 = false;
			local28 = 2080;
			local55 = arg3.anIntArray551[arg8];
			local59 = local55 >>> 16;
			@Pc(64) Class4_Sub5_Sub2 local64 = arg9.method1013(local59);
			@Pc(68) int local68 = local55 & 0xFFFF;
			if (local64 != null) {
				local34 = local64.method446(local68) | false;
				local32 = local64.method445(local68) | false;
				local38 = local64.method442(local68) | false;
				local36 = arg3.aBoolean723 | false;
			}
			if ((arg3.aBoolean721 || Static115.aBoolean196) && arg5 != -1 && arg5 < arg3.anIntArray551.length) {
				local119 = arg3.anIntArray551[arg5];
				local123 = local119 >>> 16;
				@Pc(127) int local127 = local119 & 0xFFFF;
				@Pc(137) Class4_Sub5_Sub2 local137 = local59 == local123 ? local64 : arg9.method1013(local123);
				if (local137 != null) {
					local34 |= local137.method446(local127);
					local32 |= local137.method445(local127);
					local38 |= local137.method442(local127);
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
		@Pc(186) Class223 local186 = Static571.aClass223_66;
		@Pc(195) Class57 local195;
		synchronized (Static571.aClass223_66) {
			local195 = (Class57) Static571.aClass223_66.method5388(this.aLong125);
		}
		if (local195 == null || arg1.method5010(local195.PA(), local28) != 0) {
			if (local195 != null) {
				local28 = arg1.method5023(local28, local195.PA());
			}
			local36 = false;
			for (@Pc(223) int local223 = 0; local223 < 12; local223++) {
				local55 = this.anIntArray205[local223];
				if ((local55 & 0x40000000) == 0) {
					if ((Integer.MIN_VALUE & local55) != 0 && !arg6.method6970(local55 & 0x3FFFFFFF).method7524()) {
						local36 = true;
					}
				} else if (!arg7.method6712(local55 & 0x3FFFFFFF).method5898(this.aBoolean313)) {
					local36 = true;
				}
			}
			if (local36) {
				return null;
			}
			@Pc(275) Class191[] local275 = new Class191[12];
			local119 = 0;
			for (@Pc(279) int local279 = 0; local279 < 12; local279++) {
				@Pc(286) int local286 = this.anIntArray205[local279];
				@Pc(301) Class191 local301;
				if ((local286 & 0x40000000) != 0) {
					local301 = arg7.method6712(local286 & 0x3FFFFFFF).method5889(this.aBoolean313);
					if (local301 != null) {
						local275[local119++] = local301;
					}
				} else if ((local286 & Integer.MIN_VALUE) != 0) {
					local301 = arg6.method6970(local286 & 0x3FFFFFFF).method7521();
					if (local301 != null) {
						local275[local119++] = local301;
					}
				}
			}
			@Pc(340) Class191 local340 = new Class191(local275, local119);
			@Pc(344) int local344 = local28 | 0x4000;
			local195 = arg1.method5016(local340, local344, Static523.anInt9350, 64, 768);
			for (local59 = 0; local59 < 5; local59++) {
				for (local123 = 0; local123 < Static174.aShortArrayArrayArray1.length; local123++) {
					if (this.anIntArray206[local59] < Static174.aShortArrayArrayArray1[local123][local59].length) {
						local195.d(Static445.aShortArrayArray8[local123][local59], Static174.aShortArrayArrayArray1[local123][local59][this.anIntArray206[local59]]);
					}
				}
			}
			local195.SA(local28);
			@Pc(410) Class223 local410 = Static571.aClass223_66;
			synchronized (Static571.aClass223_66) {
				Static571.aClass223_66.method5394(local195, this.aLong125);
			}
		}
		if (arg3 == null) {
			return local195;
		} else {
			local195.method7912((byte) 4, local28, true);
			return arg3.method8357(2048, local195, arg4, arg8, arg5);
		}
	}

	@OriginalMember(owner = "client!jaa", name = "a", descriptor = "([III[IIZ)V")
	public void method3733(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4) {
		this.aBoolean313 = arg4;
		if (this.anInt4205 != arg3) {
			this.anInt4205 = arg3;
		}
		this.anIntArray205 = arg2;
		this.anInt4200 = arg1;
		this.anIntArray206 = arg0;
		this.method3731();
	}

	@OriginalMember(owner = "client!jaa", name = "a", descriptor = "(BZ)V")
	public void method3734(@OriginalArg(1) boolean arg0) {
		this.aBoolean313 = arg0;
		this.method3731();
	}

	@OriginalMember(owner = "client!jaa", name = "a", descriptor = "(IILclient!wt;[IIIIZLclient!jr;Lclient!cf;ILclient!wt;ILclient!bfa;ILclient!r;ILclient!qk;Lclient!ri;Lclient!rg;[Lclient!gw;)Lclient!da;")
	public Class57 method3735(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class365 arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) Class178 arg7, @OriginalArg(9) Class48 arg8, @OriginalArg(10) int arg9, @OriginalArg(11) Class365 arg10, @OriginalArg(12) int arg11, @OriginalArg(13) Class31 arg12, @OriginalArg(15) Class44 arg13, @OriginalArg(16) int arg14, @OriginalArg(17) Class273 arg15, @OriginalArg(18) Interface21 arg16, @OriginalArg(19) Class290 arg17, @OriginalArg(20) Class129[] arg18) {
		if (this.anInt4200 != -1) {
			return arg12.method478(this.anInt4200).method6840(arg1, arg4, arg14, arg13, arg10, arg5, arg6, arg0, arg9, arg8, arg7, arg2, arg11, arg18, arg3, arg16);
		}
		@Pc(35) int local35 = arg0;
		@Pc(38) long local38 = this.aLong125;
		@Pc(41) int[] local41 = this.anIntArray205;
		if (arg2 != null && (arg2.anInt10227 >= 0 || arg2.anInt10224 >= 0)) {
			local41 = new int[12];
			for (@Pc(54) int local54 = 0; local54 < 12; local54++) {
				local41[local54] = this.anIntArray205[local54];
			}
			if (arg2.anInt10227 >= 0) {
				if (arg2.anInt10227 == 65535) {
					local38 ^= 0xFFFFFFFF00000000L;
					local41[5] = 0;
				} else {
					local41[5] = arg2.anInt10227 | 0x40000000;
					local38 ^= (long) local41[5] << 32;
				}
			}
			if (arg2.anInt10224 >= 0) {
				if (arg2.anInt10224 == 65535) {
					local38 ^= 0xFFFFFFFFL;
					local41[3] = 0;
				} else {
					local41[3] = arg2.anInt10224 | 0x40000000;
					local38 ^= local41[3];
				}
			}
		}
		@Pc(139) boolean local139 = false;
		@Pc(141) boolean local141 = false;
		@Pc(143) boolean local143 = false;
		@Pc(151) boolean local151 = arg2 != null || arg10 != null;
		@Pc(158) int local158 = arg18 == null ? 0 : arg18.length;
		@Pc(192) int local192;
		@Pc(197) int local197;
		for (@Pc(160) int local160 = 0; local160 < local158; local160++) {
			Static432.aClass4_Sub5_Sub2Array2[local160] = null;
			if (arg18[local160] != null) {
				@Pc(178) Class365 local178 = arg8.method1016(arg18[local160].anInt3570);
				if (local178.anIntArray551 != null) {
					Static271.aClass365Array1[local160] = local178;
					local151 = true;
					local192 = arg18[local160].anInt3566;
					local197 = arg18[local160].anInt3571;
					@Pc(202) int local202 = local178.anIntArray551[local192];
					Static432.aClass4_Sub5_Sub2Array2[local160] = arg8.method1013(local202 >>> 16);
					@Pc(215) int local215 = local202 & 0xFFFF;
					Static110.anIntArray120[local160] = local215;
					if (Static432.aClass4_Sub5_Sub2Array2[local160] != null) {
						local141 |= Static432.aClass4_Sub5_Sub2Array2[local160].method446(local215);
						local139 |= Static432.aClass4_Sub5_Sub2Array2[local160].method445(local215);
						local143 |= Static432.aClass4_Sub5_Sub2Array2[local160].method442(local215);
					}
					if ((local178.aBoolean721 || Static115.aBoolean196) && local197 != -1 && local178.anIntArray551.length > local197) {
						Static554.anIntArray526[local160] = local178.anIntArray552[local192];
						Static570.anIntArray537[local160] = arg18[local160].anInt3572;
						@Pc(300) int local300 = local178.anIntArray551[local197];
						Static113.aClass4_Sub5_Sub2Array1[local160] = arg8.method1013(local300 >>> 16);
						@Pc(313) int local313 = local300 & 0xFFFF;
						Static8.anIntArray9[local160] = local313;
						if (Static113.aClass4_Sub5_Sub2Array1[local160] != null) {
							local141 |= Static113.aClass4_Sub5_Sub2Array1[local160].method446(local313);
							local139 |= Static113.aClass4_Sub5_Sub2Array1[local160].method445(local313);
							local143 |= Static113.aClass4_Sub5_Sub2Array1[local160].method442(local313);
						}
					} else {
						Static554.anIntArray526[local160] = 0;
						Static570.anIntArray537[local160] = 0;
						Static113.aClass4_Sub5_Sub2Array1[local160] = null;
						Static8.anIntArray9[local160] = -1;
					}
				}
			}
		}
		@Pc(354) int local354 = -1;
		local192 = -1;
		local197 = 0;
		@Pc(360) Class4_Sub5_Sub2 local360 = null;
		@Pc(362) Class4_Sub5_Sub2 local362 = null;
		@Pc(364) int local364 = -1;
		@Pc(374) int local374 = -1;
		@Pc(376) int local376 = 0;
		@Pc(378) Class4_Sub5_Sub2 local378 = null;
		@Pc(380) Class4_Sub5_Sub2 local380 = null;
		if (local151) {
			@Pc(393) int local393;
			@Pc(452) int local452;
			if (arg2 != null) {
				local354 = arg2.anIntArray551[arg14];
				local393 = local354 >>> 16;
				local354 &= 0xFFFF;
				local360 = arg8.method1013(local393);
				if (local360 != null) {
					local141 |= local360.method446(local354);
					local139 |= local360.method445(local354);
					local143 |= local360.method442(local354);
				}
				if ((arg2.aBoolean721 || Static115.aBoolean196) && arg1 != -1 && arg2.anIntArray551.length > arg1) {
					local197 = arg2.anIntArray552[arg14];
					local192 = arg2.anIntArray551[arg1];
					local452 = local192 >>> 16;
					local362 = local393 == local452 ? local360 : arg8.method1013(local452);
					local192 &= 0xFFFF;
					if (local362 != null) {
						local141 |= local362.method446(local192);
						local139 |= local362.method445(local192);
						local143 |= local362.method442(local192);
					}
				}
			}
			local35 = arg0 | 0x20;
			if (arg10 != null) {
				local364 = arg10.anIntArray551[arg4];
				local393 = local364 >>> 16;
				local378 = arg8.method1013(local393);
				local364 &= 0xFFFF;
				if (local378 != null) {
					local141 |= local378.method446(local364);
					local139 |= local378.method445(local364);
					local143 |= local378.method442(local364);
				}
				if ((arg10.aBoolean721 || Static115.aBoolean196) && arg11 != -1 && arg10.anIntArray551.length > arg11) {
					local374 = arg10.anIntArray551[arg11];
					local376 = arg10.anIntArray552[arg4];
					local452 = local374 >>> 16;
					local374 &= 0xFFFF;
					local380 = local452 == local393 ? local378 : arg8.method1013(local452);
					if (local380 != null) {
						local141 |= local380.method446(local374);
						local139 |= local380.method445(local374);
						local143 |= local380.method442(local374);
					}
				}
			}
			if (local141) {
				local35 |= 0x80;
			}
			if (local139) {
				local35 |= 0x100;
			}
			if (local143) {
				local35 |= 0x400;
			}
		}
		@Pc(624) Class223 local624 = Static267.aClass223_36;
		@Pc(632) Class57 local632;
		synchronized (Static267.aClass223_36) {
			local632 = (Class57) Static267.aClass223_36.method5388(local38);
		}
		@Pc(640) Class316 local640 = null;
		if (this.anInt4205 != -1) {
			local640 = arg7.method4035(this.anInt4205);
		}
		@Pc(673) boolean local673;
		@Pc(675) int local675;
		@Pc(681) int local681;
		@Pc(731) int local731;
		@Pc(737) int local737;
		@Pc(800) int local800;
		if (local632 == null || arg13.method5010(local632.PA(), local35) != 0) {
			if (local632 != null) {
				local35 = arg13.method5023(local35, local632.PA());
			}
			local673 = false;
			for (local675 = 0; local675 < 12; local675++) {
				local681 = local41[local675];
				if ((local681 & 0x40000000) == 0) {
					if ((Integer.MIN_VALUE & local681) != 0 && !arg17.method6970(local681 & 0x3FFFFFFF).method7522()) {
						local673 = true;
					}
				} else if (!arg15.method6712(local681 & 0x3FFFFFFF).method5885(this.aBoolean313)) {
					local673 = true;
				}
			}
			if (local673) {
				if (this.aLong126 != -1L) {
					@Pc(1013) Class223 local1013 = Static267.aClass223_36;
					synchronized (Static267.aClass223_36) {
						local632 = (Class57) Static267.aClass223_36.method5388(this.aLong126);
					}
				}
				if (local632 == null || arg13.method5010(local632.PA(), local35) != 0) {
					return null;
				}
			} else {
				@Pc(729) Class191[] local729 = new Class191[12];
				for (local731 = 0; local731 < 12; local731++) {
					local737 = local41[local731];
					@Pc(752) Class191 local752;
					if ((local737 & 0x40000000) != 0) {
						local752 = arg15.method6712(local737 & 0x3FFFFFFF).method5902(this.aBoolean313);
						if (local752 != null) {
							local729[local731] = local752;
						}
					} else if ((local737 & Integer.MIN_VALUE) != 0) {
						local752 = arg17.method6970(local737 & 0x3FFFFFFF).method7525();
						if (local752 != null) {
							local729[local731] = local752;
						}
					}
				}
				@Pc(802) int local802;
				if (local640 != null && local640.anIntArrayArray56 != null) {
					for (local737 = 0; local737 < local640.anIntArrayArray56.length; local737++) {
						if (local729[local737] != null) {
							local800 = 0;
							local802 = 0;
							@Pc(804) int local804 = 0;
							@Pc(806) int local806 = 0;
							@Pc(808) int local808 = 0;
							@Pc(810) int local810 = 0;
							if (local640.anIntArrayArray56[local737] != null) {
								local806 = local640.anIntArrayArray56[local737][3] << 3;
								local810 = local640.anIntArrayArray56[local737][5] << 3;
								local802 = local640.anIntArrayArray56[local737][1];
								local800 = local640.anIntArrayArray56[local737][0];
								local808 = local640.anIntArrayArray56[local737][4] << 3;
								local804 = local640.anIntArrayArray56[local737][2];
							}
							if (local806 != 0 || local808 != 0 || local810 != 0) {
								local729[local737].method4762(local806, local810, local808);
							}
							if (local800 != 0 || local802 != 0 || local804 != 0) {
								local729[local737].method4766(local804, local800, local802);
							}
						}
					}
				}
				@Pc(913) int local913 = local35 | 0x4000;
				@Pc(920) Class191 local920 = new Class191(local729, local729.length);
				local632 = arg13.method5016(local920, local913, Static523.anInt9350, 64, 850);
				for (local800 = 0; local800 < 5; local800++) {
					for (local802 = 0; local802 < Static174.aShortArrayArrayArray1.length; local802++) {
						if (Static174.aShortArrayArrayArray1[local802][local800].length > this.anIntArray206[local800]) {
							local632.d(Static445.aShortArrayArray8[local802][local800], Static174.aShortArrayArrayArray1[local802][local800][this.anIntArray206[local800]]);
						}
					}
				}
				local632.SA(local35);
				@Pc(986) Class223 local986 = Static267.aClass223_36;
				synchronized (Static267.aClass223_36) {
					Static267.aClass223_36.method5394(local632, local38);
				}
				this.aLong126 = local38;
			}
		}
		@Pc(1047) Class57 local1047 = local632.method7912((byte) 4, local35, true);
		local673 = false;
		if (arg3 != null) {
			for (local675 = 0; local675 < 12; local675++) {
				if (arg3[local675] != -1) {
					local673 = true;
				}
			}
		}
		if (!local151 && !local673) {
			return local1047;
		}
		@Pc(1074) Class8[] local1074 = null;
		if (local640 != null) {
			local1074 = local640.method7461(arg13);
		}
		if (local673 && local1074 != null) {
			for (local681 = 0; local681 < 12; local681++) {
				if (local1074[local681] != null) {
					local1047.method7909(local1074[local681], 0x1 << local681, true);
				}
			}
		}
		local681 = 0;
		local731 = 1;
		while (local681 < local158) {
			if (Static432.aClass4_Sub5_Sub2Array2[local681] != null) {
				local1047.method7907(Static113.aClass4_Sub5_Sub2Array1[local681], Static110.anIntArray120[local681], Static570.anIntArray537[local681] - 1, Static8.anIntArray9[local681], local731, false, Static432.aClass4_Sub5_Sub2Array2[local681], null, Static554.anIntArray526[local681]);
			}
			local681++;
			local731 <<= 0x1;
		}
		if (local673) {
			for (local737 = 0; local737 < 12; local737++) {
				if (arg3[local737] != -1) {
					local800 = arg3[local737] - arg6;
					local800 &= 0x3FFF;
					@Pc(1178) Class8 local1178 = arg13.method5025();
					local1178.o(local800);
					local1047.method7909(local1178, 0x1 << local737, false);
				}
			}
		}
		if (local673 && local1074 != null) {
			for (local737 = 0; local737 < 12; local737++) {
				if (local1074[local737] != null) {
					local1047.method7909(local1074[local737], 0x1 << local737, false);
				}
			}
		}
		if (local360 != null && local378 != null) {
			local1047.method7928(local362, local380, local378, arg2.aBooleanArray27, local364, local197, local354, arg9 - 1, local360, local374, arg5 - 1, false, local192, local376);
		} else if (local360 != null) {
			local1047.method7925(false, local192, 0, local354, local360, local197, arg5 - 1, local362);
		} else if (local378 != null) {
			local1047.method7925(false, local374, 0, local364, local378, local376, arg9 - 1, local380);
		}
		for (local737 = 0; local737 < local158; local737++) {
			Static432.aClass4_Sub5_Sub2Array2[local737] = null;
			Static113.aClass4_Sub5_Sub2Array1[local737] = null;
			Static271.aClass365Array1[local737] = null;
		}
		return local1047;
	}

	@OriginalMember(owner = "client!jaa", name = "a", descriptor = "(III)V")
	public void method3736(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray206[arg0] = arg1;
		this.method3731();
	}

	@OriginalMember(owner = "client!jaa", name = "a", descriptor = "(Lclient!r;IILclient!cf;ILclient!wt;ILclient!rg;IIII)Lclient!da;")
	public Class57 method3738(@OriginalArg(0) Class44 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class48 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class365 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class290 arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		@Pc(13) int local13 = 2048;
		@Pc(100) int local100;
		@Pc(44) int local44;
		if (arg4 != null) {
			@Pc(17) boolean local17 = false;
			@Pc(19) boolean local19 = false;
			@Pc(21) boolean local21 = false;
			@Pc(23) boolean local23 = false;
			@Pc(34) int local34 = arg4.anIntArray551[arg3];
			local13 = 2080;
			local44 = local34 >>> 16;
			@Pc(49) Class4_Sub5_Sub2 local49 = arg2.method1013(local44);
			@Pc(53) int local53 = local34 & 0xFFFF;
			if (local49 != null) {
				local19 = local49.method446(local53) | false;
				local17 = local49.method445(local53) | false;
				local23 = local49.method442(local53) | false;
				local21 = arg4.aBoolean723 | false;
			}
			if ((arg4.aBoolean721 || Static115.aBoolean196) && arg5 != -1 && arg5 < arg4.anIntArray551.length) {
				local100 = arg4.anIntArray551[arg5];
				@Pc(104) int local104 = local100 >>> 16;
				@Pc(108) int local108 = local100 & 0xFFFF;
				@Pc(118) Class4_Sub5_Sub2 local118;
				if (local44 == local104) {
					local118 = local49;
				} else {
					local118 = arg2.method1013(local108 >>> 16);
				}
				if (local118 != null) {
					local19 |= local118.method446(local108);
					local17 |= local118.method445(local108);
					local23 |= local118.method442(local108);
				}
			}
			if (local19) {
				local13 = 2208;
			}
			if (local17) {
				local13 |= 0x100;
			}
			if (local21) {
				local13 |= 0x200;
			}
			if (local23) {
				local13 |= 0x400;
			}
		}
		@Pc(181) long local181 = (long) arg7 | (long) (arg8 << 16) | (long) arg9 << 32;
		@Pc(183) Class223 local183 = Static571.aClass223_66;
		@Pc(191) Class57 local191;
		synchronized (Static571.aClass223_66) {
			local191 = (Class57) Static571.aClass223_66.method5388(local181);
		}
		if (local191 == null || arg0.method5010(local191.PA(), local13) != 0) {
			if (local191 != null) {
				local13 = arg0.method5023(local13, local191.PA());
			}
			@Pc(218) Class191[] local218 = new Class191[3];
			local100 = 0;
			if (!arg6.method6970(arg7).method7524() || !arg6.method6970(arg8).method7524() || !arg6.method6970(arg9).method7524()) {
				return null;
			}
			@Pc(248) Class191 local248 = arg6.method6970(arg7).method7521();
			if (local248 != null) {
				local100++;
				local218[0] = local248;
			}
			local248 = arg6.method6970(arg8).method7521();
			if (local248 != null) {
				local218[local100++] = local248;
			}
			local248 = arg6.method6970(arg9).method7521();
			if (local248 != null) {
				local218[local100++] = local248;
			}
			@Pc(287) int local287 = local13 | 0x4000;
			local248 = new Class191(local218, local100);
			local191 = arg0.method5016(local248, local287, Static523.anInt9350, 64, 768);
			for (@Pc(303) int local303 = 0; local303 < 5; local303++) {
				for (local44 = 0; local44 < Static174.aShortArrayArrayArray1.length; local44++) {
					if (this.anIntArray206[local303] < Static174.aShortArrayArrayArray1[local44][local303].length) {
						local191.d(Static445.aShortArrayArray8[local44][local303], Static174.aShortArrayArrayArray1[local44][local303][this.anIntArray206[local303]]);
					}
				}
			}
			local191.SA(local13);
			@Pc(351) Class223 local351 = Static571.aClass223_66;
			synchronized (Static571.aClass223_66) {
				Static571.aClass223_66.method5394(local191, local181);
			}
		}
		if (arg4 == null) {
			return local191;
		} else {
			local191 = local191.method7912((byte) 4, local13, true);
			return arg4.method8357(2048, local191, arg1, arg3, arg5);
		}
	}

	@OriginalMember(owner = "client!jaa", name = "a", descriptor = "(Lclient!qk;IZI)V")
	public void method3739(@OriginalArg(0) Class273 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (arg1 == -1) {
			this.anIntArray205[arg2] = 0;
		} else if (arg0.method6712(arg1) != null) {
			this.anIntArray205[arg2] = arg1 | 0x40000000;
			this.method3731();
		}
	}

	@OriginalMember(owner = "client!jaa", name = "a", descriptor = "(IILclient!rg;I)V")
	public void method3740(@OriginalArg(0) int arg0, @OriginalArg(2) Class290 arg1, @OriginalArg(3) int arg2) {
		@Pc(11) int local11 = Static579.anIntArray544[arg0];
		if (arg1.method6970(arg2) != null) {
			this.anIntArray205[local11] = arg2 | Integer.MIN_VALUE;
			this.method3731();
		}
	}
}
