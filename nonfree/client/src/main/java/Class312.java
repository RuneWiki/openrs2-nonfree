import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vv")
public final class Class312 {

	@OriginalMember(owner = "client!vv", name = "a", descriptor = "[I")
	public int[] anIntArray766;

	@OriginalMember(owner = "client!vv", name = "f", descriptor = "J")
	private long aLong273;

	@OriginalMember(owner = "client!vv", name = "h", descriptor = "I")
	private int anInt9135;

	@OriginalMember(owner = "client!vv", name = "i", descriptor = "[[I")
	private int[][] anIntArrayArray88;

	@OriginalMember(owner = "client!vv", name = "j", descriptor = "Z")
	public boolean aBoolean672;

	@OriginalMember(owner = "client!vv", name = "l", descriptor = "J")
	private long aLong274;

	@OriginalMember(owner = "client!vv", name = "s", descriptor = "[I")
	private int[] anIntArray767;

	@OriginalMember(owner = "client!vv", name = "e", descriptor = "I")
	public int anInt9133 = -1;

	@OriginalMember(owner = "client!vv", name = "a", descriptor = "(Lclient!qi;IIIBILclient!oa;ILclient!ed;Lclient!hi;II)Lclient!ba;")
	public Class2 method7531(@OriginalArg(0) Class247 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class5 arg5, @OriginalArg(8) Class69 arg6, @OriginalArg(9) Class122 arg7, @OriginalArg(10) int arg8, @OriginalArg(11) int arg9) {
		@Pc(7) int local7 = 2048;
		@Pc(94) int local94;
		if (arg7 != null) {
			@Pc(11) boolean local11 = false;
			@Pc(13) boolean local13 = false;
			@Pc(15) boolean local15 = false;
			@Pc(17) boolean local17 = false;
			local7 = 2080;
			@Pc(34) int local34 = arg7.anIntArray396[arg1];
			@Pc(38) int local38 = local34 >>> 16;
			@Pc(43) Class3_Sub10_Sub6 local43 = arg0.method6032(local38);
			@Pc(47) int local47 = local34 & 0xFFFF;
			if (local43 != null) {
				local13 = local43.method2659(local47) | false;
				local11 = local43.method2658(local47) | false;
				local17 = local43.method2660(local47) | false;
				local15 = arg7.aBoolean299 | false;
			}
			if ((arg7.aBoolean296 || Static497.aBoolean651) && arg3 != -1 && arg3 < arg7.anIntArray396.length) {
				local94 = arg7.anIntArray396[arg3];
				@Pc(98) int local98 = local94 >>> 16;
				@Pc(102) int local102 = local94 & 0xFFFF;
				@Pc(112) Class3_Sub10_Sub6 local112;
				if (local38 == local98) {
					local112 = local43;
				} else {
					local112 = arg0.method6032(local102 >>> 16);
				}
				if (local112 != null) {
					local13 |= local112.method2659(local102);
					local11 |= local112.method2658(local102);
					local17 |= local112.method2660(local102);
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
		@Pc(175) long local175 = (long) arg9 << 32 | (long) (arg8 << 16) | (long) arg4;
		@Pc(177) Class125 local177 = Static388.aClass125_57;
		@Pc(185) Class2 local185;
		synchronized (Static388.aClass125_57) {
			local185 = (Class2) Static388.aClass125_57.method3512(local175);
		}
		if (local185 == null || arg5.method7435(local185.h(), local7) != 0) {
			if (local185 != null) {
				local7 = arg5.method7418(local7, local185.h());
			}
			@Pc(212) Class222[] local212 = new Class222[3];
			local94 = 0;
			if (!arg6.method2061(arg4).method4047() || !arg6.method2061(arg8).method4047() || !arg6.method2061(arg9).method4047()) {
				return null;
			}
			@Pc(242) Class222 local242 = arg6.method2061(arg4).method4046();
			if (local242 != null) {
				local94++;
				local212[0] = local242;
			}
			local242 = arg6.method2061(arg8).method4046();
			if (local242 != null) {
				local212[local94++] = local242;
			}
			local242 = arg6.method2061(arg9).method4046();
			if (local242 != null) {
				local212[local94++] = local242;
			}
			local242 = new Class222(local212, local94);
			@Pc(287) int local287 = local7 | 0x4000;
			local185 = arg5.method7443(local242, local287, Static430.anInt9213, 64, 768);
			for (@Pc(297) int local297 = 0; local297 < 5; local297++) {
				if (Static522.aShortArrayArray10[local297].length > this.anIntArray766[local297]) {
					local185.UA(Static73.aShortArray199[local297], Static522.aShortArrayArray10[local297][this.anIntArray766[local297]]);
				}
				if (Static518.aShortArrayArray2[local297].length > this.anIntArray766[local297]) {
					local185.UA(Static96.aShortArray49[local297], Static518.aShortArrayArray2[local297][this.anIntArray766[local297]]);
				}
			}
			local185.ia(local7);
			@Pc(358) Class125 local358 = Static388.aClass125_57;
			synchronized (Static388.aClass125_57) {
				Static388.aClass125_57.method3519(local175, local185);
			}
		}
		if (arg7 == null) {
			return local185;
		} else {
			local185 = local185.method5775((byte) 4, local7, true);
			return arg7.method3442(arg2, local185, arg1, arg3, 2048);
		}
	}

	@OriginalMember(owner = "client!vv", name = "a", descriptor = "(IZ)V")
	public void method7532(@OriginalArg(1) boolean arg0) {
		this.aBoolean672 = arg0;
		this.method7536();
	}

	@OriginalMember(owner = "client!vv", name = "a", descriptor = "(Lclient!hi;Lclient!qi;ILclient!js;Lclient!oa;IILclient!sp;IILclient!ft;Lclient!ed;)Lclient!ba;")
	public Class2 method7534(@OriginalArg(0) Class122 arg0, @OriginalArg(1) Class247 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class154 arg3, @OriginalArg(4) Class5 arg4, @OriginalArg(5) int arg5, @OriginalArg(7) Interface17 arg6, @OriginalArg(8) int arg7, @OriginalArg(10) Class96 arg8, @OriginalArg(11) Class69 arg9) {
		if (this.anInt9133 != -1) {
			return arg3.method4157(this.anInt9133).method5886(arg2, arg4, arg0, arg6, arg7, arg1, arg5);
		}
		@Pc(28) int local28 = 2048;
		@Pc(36) boolean local36;
		@Pc(49) int local49;
		@Pc(119) int local119;
		@Pc(59) int local59;
		if (arg0 != null) {
			@Pc(32) boolean local32 = false;
			@Pc(34) boolean local34 = false;
			local36 = false;
			@Pc(38) boolean local38 = false;
			local49 = arg0.anIntArray396[arg7];
			local28 = 2080;
			local59 = local49 >>> 16;
			@Pc(63) int local63 = local49 & 0xFFFF;
			@Pc(68) Class3_Sub10_Sub6 local68 = arg1.method6032(local59);
			if (local68 != null) {
				local34 = local68.method2659(local63) | false;
				local32 = local68.method2658(local63) | false;
				local38 = local68.method2660(local63) | false;
				local36 = arg0.aBoolean299 | false;
			}
			if ((arg0.aBoolean296 || Static497.aBoolean651) && arg5 != -1 && arg0.anIntArray396.length > arg5) {
				local119 = arg0.anIntArray396[arg5];
				@Pc(123) int local123 = local119 >>> 16;
				@Pc(127) int local127 = local119 & 0xFFFF;
				@Pc(137) Class3_Sub10_Sub6 local137 = local59 == local123 ? local68 : arg1.method6032(local123);
				if (local137 != null) {
					local34 |= local137.method2659(local127);
					local32 |= local137.method2658(local127);
					local38 |= local137.method2660(local127);
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
		@Pc(186) Class125 local186 = Static388.aClass125_57;
		@Pc(195) Class2 local195;
		synchronized (Static388.aClass125_57) {
			local195 = (Class2) Static388.aClass125_57.method3512(this.aLong274);
		}
		if (local195 == null || arg4.method7435(local195.h(), local28) != 0) {
			if (local195 != null) {
				local28 = arg4.method7418(local28, local195.h());
			}
			local36 = false;
			for (@Pc(241) int local241 = 0; local241 < 12; local241++) {
				local49 = this.anIntArray767[local241];
				if ((local49 & 0x40000000) == 0) {
					if ((local49 & Integer.MIN_VALUE) != 0 && !arg9.method2061(local49 & 0x3FFFFFFF).method4047()) {
						local36 = true;
					}
				} else if (!arg8.method2508(local49 & 0x3FFFFFFF).method828(this.aBoolean672)) {
					local36 = true;
				}
			}
			if (local36) {
				return null;
			}
			@Pc(293) Class222[] local293 = new Class222[12];
			local119 = 0;
			for (@Pc(297) int local297 = 0; local297 < 12; local297++) {
				@Pc(304) int local304 = this.anIntArray767[local297];
				@Pc(319) Class222 local319;
				if ((local304 & 0x40000000) != 0) {
					local319 = arg8.method2508(local304 & 0x3FFFFFFF).method821(this.aBoolean672);
					if (local319 != null) {
						local293[local119++] = local319;
					}
				} else if ((Integer.MIN_VALUE & local304) != 0) {
					local319 = arg9.method2061(local304 & 0x3FFFFFFF).method4046();
					if (local319 != null) {
						local293[local119++] = local319;
					}
				}
			}
			@Pc(361) Class222 local361 = new Class222(local293, local119);
			@Pc(365) int local365 = local28 | 0x4000;
			local195 = arg4.method7443(local361, local365, Static430.anInt9213, 64, 768);
			for (local59 = 0; local59 < 5; local59++) {
				if (Static522.aShortArrayArray10[local59].length > this.anIntArray766[local59]) {
					local195.UA(Static73.aShortArray199[local59], Static522.aShortArrayArray10[local59][this.anIntArray766[local59]]);
				}
				if (Static518.aShortArrayArray2[local59].length > this.anIntArray766[local59]) {
					local195.UA(Static96.aShortArray49[local59], Static518.aShortArrayArray2[local59][this.anIntArray766[local59]]);
				}
			}
			local195.ia(local28);
			@Pc(438) Class125 local438 = Static388.aClass125_57;
			synchronized (Static388.aClass125_57) {
				Static388.aClass125_57.method3519(this.aLong274, local195);
			}
		}
		if (arg0 == null) {
			return local195;
		} else {
			local195.method5775((byte) 4, local28, true);
			return arg0.method3442(arg2, local195, arg7, arg5, 2048);
		}
	}

	@OriginalMember(owner = "client!vv", name = "a", descriptor = "(Lclient!ft;Lclient!hi;Lclient!hi;[Lclient!jo;Lclient!ie;Lclient!js;IIILclient!oa;Lclient!qi;Lclient!sp;IIILclient!ed;IIZ)Lclient!ba;")
	public Class2 method7535(@OriginalArg(0) Class96 arg0, @OriginalArg(1) Class122 arg1, @OriginalArg(2) Class122 arg2, @OriginalArg(3) Class152[] arg3, @OriginalArg(4) Class132 arg4, @OriginalArg(5) Class154 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) Class5 arg8, @OriginalArg(10) Class247 arg9, @OriginalArg(11) Interface17 arg10, @OriginalArg(12) int arg11, @OriginalArg(13) int arg12, @OriginalArg(14) int arg13, @OriginalArg(15) Class69 arg14, @OriginalArg(16) int arg15, @OriginalArg(17) int arg16) {
		if (this.anInt9133 != -1) {
			return arg5.method4157(this.anInt9133).method5890(arg11, arg16, arg2, arg3, arg4, arg10, arg13, arg1, arg7, arg8, arg12, arg6, arg9, arg15);
		}
		@Pc(33) int local33 = arg7;
		@Pc(36) long local36 = this.aLong274;
		@Pc(39) int[] local39 = this.anIntArray767;
		if (arg2 != null && (arg2.anInt4151 >= 0 || arg2.anInt4154 >= 0)) {
			local39 = new int[12];
			for (@Pc(52) int local52 = 0; local52 < 12; local52++) {
				local39[local52] = this.anIntArray767[local52];
			}
			if (arg2.anInt4151 >= 0) {
				if (arg2.anInt4151 == 65535) {
					local36 ^= 0xFFFFFFFF00000000L;
					local39[5] = 0;
				} else {
					local39[5] = arg2.anInt4151 | 0x40000000;
					local36 ^= (long) local39[5] << 32;
				}
			}
			if (arg2.anInt4154 >= 0) {
				if (arg2.anInt4154 == 65535) {
					local36 ^= 0xFFFFFFFFL;
					local39[3] = 0;
				} else {
					local39[3] = arg2.anInt4154 | 0x40000000;
					local36 ^= local39[3];
				}
			}
		}
		@Pc(139) boolean local139 = false;
		@Pc(141) boolean local141 = false;
		@Pc(143) boolean local143 = false;
		@Pc(151) boolean local151 = arg2 != null || arg1 != null;
		@Pc(158) int local158 = arg3 == null ? 0 : arg3.length;
		@Pc(192) int local192;
		@Pc(197) int local197;
		for (@Pc(160) int local160 = 0; local160 < local158; local160++) {
			Static442.aClass3_Sub10_Sub6Array6[local160] = null;
			if (arg3[local160] != null) {
				@Pc(178) Class122 local178 = arg9.method6029(arg3[local160].anInt4899);
				if (local178.anIntArray396 != null) {
					Static264.aClass122Array2[local160] = local178;
					local151 = true;
					local192 = arg3[local160].anInt4900;
					local197 = arg3[local160].anInt4897;
					@Pc(202) int local202 = local178.anIntArray396[local192];
					Static442.aClass3_Sub10_Sub6Array6[local160] = arg9.method6032(local202 >>> 16);
					@Pc(217) int local217 = local202 & 0xFFFF;
					Static211.anIntArray420[local160] = local217;
					if (Static442.aClass3_Sub10_Sub6Array6[local160] != null) {
						local141 |= Static442.aClass3_Sub10_Sub6Array6[local160].method2659(local217);
						local139 |= Static442.aClass3_Sub10_Sub6Array6[local160].method2658(local217);
						local143 |= Static442.aClass3_Sub10_Sub6Array6[local160].method2660(local217);
					}
					if ((local178.aBoolean296 || Static497.aBoolean651) && local197 != -1 && local178.anIntArray396.length > local197) {
						Static310.anIntArray537[local160] = local178.anIntArray394[local192];
						Static307.anIntArray435[local160] = arg3[local160].anInt4901;
						@Pc(306) int local306 = local178.anIntArray396[local197];
						Static103.aClass3_Sub10_Sub6Array3[local160] = arg9.method6032(local306 >>> 16);
						@Pc(321) int local321 = local306 & 0xFFFF;
						Static121.anIntArray260[local160] = local321;
						if (Static103.aClass3_Sub10_Sub6Array3[local160] != null) {
							local141 |= Static103.aClass3_Sub10_Sub6Array3[local160].method2659(local321);
							local139 |= Static103.aClass3_Sub10_Sub6Array3[local160].method2658(local321);
							local143 |= Static103.aClass3_Sub10_Sub6Array3[local160].method2660(local321);
						}
					} else {
						Static310.anIntArray537[local160] = 0;
						Static307.anIntArray435[local160] = 0;
						Static103.aClass3_Sub10_Sub6Array3[local160] = null;
						Static121.anIntArray260[local160] = -1;
					}
				}
			}
		}
		@Pc(366) int local366 = -1;
		local192 = -1;
		local197 = 0;
		@Pc(372) Class3_Sub10_Sub6 local372 = null;
		@Pc(374) Class3_Sub10_Sub6 local374 = null;
		@Pc(376) int local376 = -1;
		@Pc(378) int local378 = -1;
		@Pc(380) int local380 = 0;
		@Pc(382) Class3_Sub10_Sub6 local382 = null;
		@Pc(384) Class3_Sub10_Sub6 local384 = null;
		if (local151) {
			local33 = arg7 | 0x20;
			@Pc(401) int local401;
			@Pc(460) int local460;
			if (arg2 != null) {
				local366 = arg2.anIntArray396[arg12];
				local401 = local366 >>> 16;
				local366 &= 0xFFFF;
				local372 = arg9.method6032(local401);
				if (local372 != null) {
					local141 |= local372.method2659(local366);
					local139 |= local372.method2658(local366);
					local143 |= local372.method2660(local366);
				}
				if ((arg2.aBoolean296 || Static497.aBoolean651) && arg13 != -1 && arg2.anIntArray396.length > arg13) {
					local192 = arg2.anIntArray396[arg13];
					local197 = arg2.anIntArray394[arg12];
					local460 = local192 >>> 16;
					local192 &= 0xFFFF;
					local374 = local460 == local401 ? local372 : arg9.method6032(local460);
					if (local374 != null) {
						local141 |= local374.method2659(local192);
						local139 |= local374.method2658(local192);
						local143 |= local374.method2660(local192);
					}
				}
			}
			if (arg1 != null) {
				local376 = arg1.anIntArray396[arg6];
				local401 = local376 >>> 16;
				local382 = arg9.method6032(local401);
				local376 &= 0xFFFF;
				if (local382 != null) {
					local141 |= local382.method2659(local376);
					local139 |= local382.method2658(local376);
					local143 |= local382.method2660(local376);
				}
				if ((arg1.aBoolean296 || Static497.aBoolean651) && arg11 != -1 && arg1.anIntArray396.length > arg11) {
					local378 = arg1.anIntArray396[arg11];
					local380 = arg1.anIntArray394[arg6];
					local460 = local378 >>> 16;
					local384 = local460 == local401 ? local382 : arg9.method6032(local460);
					local378 &= 0xFFFF;
					if (local384 != null) {
						local141 |= local384.method2659(local378);
						local139 |= local384.method2658(local378);
						local143 |= local384.method2660(local378);
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
		@Pc(631) Class125 local631 = Static145.aClass125_24;
		@Pc(639) Class2 local639;
		synchronized (Static145.aClass125_24) {
			local639 = (Class2) Static145.aClass125_24.method3512(local36);
		}
		@Pc(647) Class73 local647 = null;
		if (this.anInt9135 != -1) {
			local647 = arg4.method3756(this.anInt9135);
		}
		@Pc(687) int local687;
		@Pc(693) int local693;
		if (local639 == null || arg8.method7435(local639.h(), local33) != 0 || local647 != null && local647.anIntArrayArray29 != null && this.anIntArrayArray88 == null) {
			if (local639 != null) {
				local33 = arg8.method7418(local33, local639.h());
			}
			@Pc(685) boolean local685 = false;
			local687 = 0;
			while (true) {
				if (local687 >= 12) {
					if (local685) {
						if (this.aLong273 != -1L) {
							@Pc(744) Class125 local744 = Static145.aClass125_24;
							synchronized (Static145.aClass125_24) {
								local639 = (Class2) Static145.aClass125_24.method3512(this.aLong273);
							}
						}
						if (local639 == null || arg8.method7435(local639.h(), local33) != 0 || local647 != null && local647.anIntArrayArray29 != null && this.anIntArrayArray88 == null) {
							return null;
						}
					} else {
						@Pc(783) Class222[] local783 = new Class222[12];
						@Pc(791) int local791;
						for (@Pc(785) int local785 = 0; local785 < 12; local785++) {
							local791 = local39[local785];
							@Pc(811) Class222 local811;
							if ((local791 & 0x40000000) != 0) {
								local811 = arg0.method2508(local791 & 0x3FFFFFFF).method831(this.aBoolean672);
								if (local811 != null) {
									local783[local785] = local811;
								}
							} else if ((local791 & Integer.MIN_VALUE) != 0) {
								local811 = arg14.method2061(local791 & 0x3FFFFFFF).method4048();
								if (local811 != null) {
									local783[local785] = local811;
								}
							}
						}
						@Pc(874) int local874;
						if (local647 != null && local647.anIntArrayArray29 != null) {
							for (local791 = 0; local791 < local647.anIntArrayArray29.length; local791++) {
								if (local647.anIntArrayArray29[local791] != null && local783[local791] != null) {
									local874 = local647.anIntArrayArray29[local791][0];
									@Pc(881) int local881 = local647.anIntArrayArray29[local791][1];
									@Pc(888) int local888 = local647.anIntArrayArray29[local791][2];
									@Pc(897) int local897 = local647.anIntArrayArray29[local791][3] << 3;
									@Pc(906) int local906 = local647.anIntArrayArray29[local791][4] << 3;
									@Pc(915) int local915 = local647.anIntArrayArray29[local791][5] << 3;
									if (this.anIntArrayArray88 == null) {
										this.anIntArrayArray88 = new int[local647.anIntArrayArray29.length][];
									}
									if (this.anIntArrayArray88[local791] == null) {
										@Pc(937) int[] local937 = this.anIntArrayArray88[local791] = new int[15];
										if (local897 == 0 && local906 == 0 && local915 == 0) {
											local937[14] = -local888;
											local937[12] = -local874;
											local937[13] = -local881;
											local937[0] = local937[4] = local937[8] = 32768;
										} else {
											@Pc(982) int local982 = Class5.anIntArray760[local897];
											@Pc(986) int local986 = Class5.anIntArray761[local897];
											@Pc(990) int local990 = Class5.anIntArray760[local906];
											@Pc(994) int local994 = Class5.anIntArray761[local906];
											@Pc(998) int local998 = Class5.anIntArray760[local915];
											@Pc(1002) int local1002 = Class5.anIntArray761[local915];
											@Pc(1010) int local1010 = local986 * local998 + 8192 >> 14;
											@Pc(1018) int local1018 = local986 * local1002 + 8192 >> 14;
											local937[3] = local1002 * local982 + 8192 >> 14;
											local937[6] = -local994 * local998 + local990 * local1018 + 8192 >> 14;
											local937[8] = local982 * local990 + 8192 >> 14;
											local937[4] = local982 * local998 + 8192 >> 14;
											local937[7] = local990 * local1010 + -local1002 * -local994 + 8192 >> 14;
											local937[5] = -local986;
											local937[1] = local1010 * local994 + local990 * -local1002 + 8192 >> 14;
											local937[2] = local994 * local982 + 8192 >> 14;
											local937[0] = local990 * local998 + local994 * local1018 + 8192 >> 14;
											local937[12] = local937[0] * -local874 + local937[3] * -local881 + -local888 * local937[6] + 8192 >> 14;
											local937[13] = local937[1] * -local874 + -local881 * local937[4] + local937[7] * -local888 + 8192 >> 14;
											local937[14] = -local888 * local937[8] + -local874 * local937[2] + -local881 * local937[5] + 8192 >> 14;
										}
										local937[9] = local874;
										local937[11] = local888;
										local937[10] = local881;
									}
									if (local897 != 0 || local906 != 0 || local915 != 0) {
										local783[local791].method5600(local915, local897, local906);
									}
									if (local874 != 0 || local881 != 0 || local888 != 0) {
										local783[local791].method5604(local874, local888, local881);
									}
								}
							}
						}
						@Pc(1264) int local1264 = local33 | 0x4000;
						@Pc(1271) Class222 local1271 = new Class222(local783, local783.length);
						local639 = arg8.method7443(local1271, local1264, Static430.anInt9213, 64, 850);
						for (local874 = 0; local874 < 5; local874++) {
							if (Static522.aShortArrayArray10[local874].length > this.anIntArray766[local874]) {
								local639.UA(Static73.aShortArray199[local874], Static522.aShortArrayArray10[local874][this.anIntArray766[local874]]);
							}
							if (Static518.aShortArrayArray2[local874].length > this.anIntArray766[local874]) {
								local639.UA(Static96.aShortArray49[local874], Static518.aShortArrayArray2[local874][this.anIntArray766[local874]]);
							}
						}
						local639.ia(local33);
						@Pc(1342) Class125 local1342 = Static145.aClass125_24;
						synchronized (Static145.aClass125_24) {
							Static145.aClass125_24.method3519(local36, local639);
						}
						this.aLong273 = local36;
					}
					break;
				}
				local693 = local39[local687];
				if ((local693 & 0x40000000) == 0) {
					if ((local693 & Integer.MIN_VALUE) != 0 && !arg14.method2061(local693 & 0x3FFFFFFF).method4045()) {
						local685 = true;
					}
				} else if (!arg0.method2508(local693 & 0x3FFFFFFF).method812(this.aBoolean672)) {
					local685 = true;
				}
				local687++;
			}
		}
		@Pc(1364) Class2 local1364 = local639.method5775((byte) 4, local33, true);
		if (!local151) {
			return local1364;
		}
		@Pc(1370) int local1370 = 0;
		local687 = 1;
		while (local158 > local1370) {
			if (Static442.aClass3_Sub10_Sub6Array6[local1370] != null) {
				local1364.method5776(Static103.aClass3_Sub10_Sub6Array3[local1370], Static310.anIntArray537[local1370], false, Static442.aClass3_Sub10_Sub6Array6[local1370], Static211.anIntArray420[local1370], local687, this.anIntArrayArray88 == null ? null : this.anIntArrayArray88[local1370], Static121.anIntArray260[local1370], Static307.anIntArray435[local1370] - 1);
			}
			local687 <<= 0x1;
			local1370++;
		}
		if (local372 != null && local382 != null) {
			local1364.method5784(local374, local366, arg16 - 1, local378, local382, local197, arg15 - 1, local376, arg2.aBooleanArray20, local384, local192, local380, local372, false);
		} else if (local372 != null) {
			local1364.method5769(local366, false, 0, local372, arg16 - 1, local192, local197, local374);
		} else if (local382 != null) {
			local1364.method5769(local376, false, 0, local382, arg15 - 1, local378, local380, local384);
		}
		for (local693 = 0; local693 < local158; local693++) {
			Static442.aClass3_Sub10_Sub6Array6[local693] = null;
			Static103.aClass3_Sub10_Sub6Array3[local693] = null;
			Static264.aClass122Array2[local693] = null;
		}
		return local1364;
	}

	@OriginalMember(owner = "client!vv", name = "a", descriptor = "(B)V")
	private void method7536() {
		@Pc(7) long[] local7 = Class6_Sub1.aLongArray28;
		this.aLong274 = -1L;
		this.aLong274 = this.aLong274 >>> 8 ^ local7[(int) (((long) (this.anInt9135 >> 8) ^ this.aLong274) & 0xFFL)];
		this.aLong274 = this.aLong274 >>> 8 ^ local7[(int) ((this.aLong274 ^ (long) this.anInt9135) & 0xFFL)];
		for (@Pc(58) int local58 = 0; local58 < 12; local58++) {
			this.aLong274 = local7[(int) (((long) (this.anIntArray767[local58] >> 24) ^ this.aLong274) & 0xFFL)] ^ this.aLong274 >>> 8;
			this.aLong274 = this.aLong274 >>> 8 ^ local7[(int) ((this.aLong274 ^ (long) (this.anIntArray767[local58] >> 16)) & 0xFFL)];
			this.aLong274 = this.aLong274 >>> 8 ^ local7[(int) ((this.aLong274 ^ (long) (this.anIntArray767[local58] >> 8)) & 0xFFL)];
			this.aLong274 = local7[(int) (((long) this.anIntArray767[local58] ^ this.aLong274) & 0xFFL)] ^ this.aLong274 >>> 8;
		}
		for (@Pc(152) int local152 = 0; local152 < 5; local152++) {
			this.aLong274 = local7[(int) ((this.aLong274 ^ (long) this.anIntArray766[local152]) & 0xFFL)] ^ this.aLong274 >>> 8;
		}
		this.aLong274 = local7[(int) (((long) (this.aBoolean672 ? 1 : 0) ^ this.aLong274) & 0xFFL)] ^ this.aLong274 >>> 8;
	}

	@OriginalMember(owner = "client!vv", name = "a", descriptor = "(IZI)V")
	public void method7537(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray766[arg0] = arg1;
		this.method7536();
	}

	@OriginalMember(owner = "client!vv", name = "a", descriptor = "(III[IZ[I)V")
	public void method7538(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int[] arg4) {
		if (arg1 != this.anInt9135) {
			this.anIntArrayArray88 = null;
			this.anInt9135 = arg1;
		}
		this.anInt9133 = arg0;
		this.anIntArray767 = arg4;
		this.anIntArray766 = arg2;
		this.aBoolean672 = arg3;
		this.method7536();
	}

	@OriginalMember(owner = "client!vv", name = "a", descriptor = "(IIILclient!ed;)V")
	public void method7539(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class69 arg2) {
		@Pc(7) int local7 = Static188.anIntArray400[arg1];
		if (this.anIntArray767[local7] != 0 && arg2.method2061(arg0) != null) {
			this.anIntArray767[local7] = Integer.MIN_VALUE | arg0;
			this.method7536();
		}
	}
}
