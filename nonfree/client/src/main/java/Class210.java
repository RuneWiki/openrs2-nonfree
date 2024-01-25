import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qp")
public final class Class210 {

	@OriginalMember(owner = "client!qp", name = "b", descriptor = "Z")
	public boolean aBoolean394;

	@OriginalMember(owner = "client!qp", name = "e", descriptor = "[[I")
	private int[][] anIntArrayArray47;

	@OriginalMember(owner = "client!qp", name = "g", descriptor = "J")
	private long aLong177;

	@OriginalMember(owner = "client!qp", name = "k", descriptor = "[I")
	private int[] anIntArray578;

	@OriginalMember(owner = "client!qp", name = "n", descriptor = "[I")
	public int[] anIntArray579;

	@OriginalMember(owner = "client!qp", name = "o", descriptor = "I")
	private int anInt6155;

	@OriginalMember(owner = "client!qp", name = "s", descriptor = "J")
	private long aLong178;

	@OriginalMember(owner = "client!qp", name = "p", descriptor = "I")
	public int anInt6156 = -1;

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "(IZIIIILclient!kg;Lclient!za;Lclient!tl;ILclient!sq;I)Lclient!e;")
	public Class17 method4723(@OriginalArg(0) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) Class143 arg4, @OriginalArg(7) Class106 arg5, @OriginalArg(8) Class239 arg6, @OriginalArg(9) int arg7, @OriginalArg(10) Class235 arg8, @OriginalArg(11) int arg9) {
		@Pc(7) int local7 = 2048;
		@Pc(97) int local97;
		if (arg8 != null) {
			@Pc(11) boolean local11 = false;
			@Pc(13) boolean local13 = false;
			@Pc(15) boolean local15 = false;
			@Pc(17) boolean local17 = false;
			local7 = 2080;
			@Pc(34) int local34 = arg8.anIntArray633[arg3];
			@Pc(38) int local38 = local34 >>> 16;
			@Pc(43) Class1_Sub1_Sub8 local43 = arg6.method5423(local38);
			@Pc(47) int local47 = local34 & 0xFFFF;
			if (local43 != null) {
				local13 = local43.method1440(local47) | false;
				local11 = local43.method1446(local47) | false;
				local17 = local43.method1448(local47) | false;
				local15 = arg8.aBoolean432 | false;
			}
			if ((arg8.aBoolean431 || Static261.aBoolean314) && arg2 != -1 && arg2 < arg8.anIntArray633.length) {
				local97 = arg8.anIntArray633[arg2];
				@Pc(101) int local101 = local97 >>> 16;
				@Pc(105) int local105 = local97 & 0xFFFF;
				@Pc(115) Class1_Sub1_Sub8 local115;
				if (local38 == local101) {
					local115 = local43;
				} else {
					local115 = arg6.method5423(local105 >>> 16);
				}
				if (local115 != null) {
					local13 |= local115.method1440(local105);
					local11 |= local115.method1446(local105);
					local17 |= local115.method1448(local105);
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
		@Pc(178) long local178 = (long) (arg9 << 16) | (long) arg0 << 32 | (long) arg1;
		@Pc(180) Class91 local180 = Static117.aClass91_39;
		@Pc(194) Class17 local194;
		synchronized (Static117.aClass91_39) {
			local194 = (Class17) Static117.aClass91_39.method1988(local178);
		}
		if (local194 == null || arg5.method5913(local194.RA(), local7) != 0) {
			if (local194 != null) {
				local7 = arg5.method5954(local7, local194.RA());
			}
			@Pc(224) Class147[] local224 = new Class147[3];
			local97 = 0;
			if (!arg4.method3319(arg1).method1492() || !arg4.method3319(arg9).method1492() || !arg4.method3319(arg0).method1492()) {
				return null;
			}
			@Pc(254) Class147 local254 = arg4.method3319(arg1).method1494();
			if (local254 != null) {
				local97++;
				local224[0] = local254;
			}
			local254 = arg4.method3319(arg9).method1494();
			if (local254 != null) {
				local224[local97++] = local254;
			}
			local254 = arg4.method3319(arg0).method1494();
			if (local254 != null) {
				local224[local97++] = local254;
			}
			@Pc(293) int local293 = local7 | 0x4000;
			local254 = new Class147(local224, local97);
			local194 = arg5.method5922(local254, local293, Static341.anInt6237, 64, 768);
			for (@Pc(309) int local309 = 0; local309 < 5; local309++) {
				if (Static182.aShortArrayArray2[local309].length > this.anIntArray579[local309]) {
					local194.q(Static365.aShortArray126[local309], Static182.aShortArrayArray2[local309][this.anIntArray579[local309]]);
				}
				if (Static431.aShortArrayArray8[local309].length > this.anIntArray579[local309]) {
					local194.q(Static344.aShortArray114[local309], Static431.aShortArrayArray8[local309][this.anIntArray579[local309]]);
				}
			}
			local194.D(local7);
			@Pc(366) Class91 local366 = Static117.aClass91_39;
			synchronized (Static117.aClass91_39) {
				Static117.aClass91_39.method1990(local194, local178);
			}
		}
		if (arg8 == null) {
			return local194;
		} else {
			local194 = local194.method6202((byte) 4, local7, true);
			return arg8.method5215(arg2, arg7, local194, arg3, 2048);
		}
	}

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "(Lclient!ck;Lclient!im;IIILclient!dj;ILclient!sq;[Lclient!sl;ZIILclient!sq;Lclient!kg;Lclient!za;Lclient!tl;IILclient!vk;)Lclient!e;")
	public Class17 method4724(@OriginalArg(0) Class44 arg0, @OriginalArg(1) Interface4 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class57 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) Class235 arg7, @OriginalArg(8) Class232[] arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) Class235 arg11, @OriginalArg(13) Class143 arg12, @OriginalArg(14) Class106 arg13, @OriginalArg(15) Class239 arg14, @OriginalArg(17) int arg15, @OriginalArg(18) Class258 arg16) {
		if (this.anInt6156 != -1) {
			return arg0.method999(this.anInt6156).method132(arg1, arg3, arg11, arg13, arg9, arg10, arg2, arg8, arg7, arg4, arg6, arg16, arg15, arg14);
		}
		@Pc(33) int local33 = arg10;
		@Pc(36) long local36 = this.aLong178;
		@Pc(39) int[] local39 = this.anIntArray578;
		if (arg11 != null && (arg11.anInt6853 >= 0 || arg11.anInt6858 >= 0)) {
			local39 = new int[12];
			for (@Pc(58) int local58 = 0; local58 < 12; local58++) {
				local39[local58] = this.anIntArray578[local58];
			}
			if (arg11.anInt6853 >= 0) {
				if (arg11.anInt6853 == 65535) {
					local36 ^= 0xFFFFFFFF00000000L;
					local39[5] = 0;
				} else {
					local39[5] = arg11.anInt6853 | 0x40000000;
					local36 ^= (long) local39[5] << 32;
				}
			}
			if (arg11.anInt6858 >= 0) {
				if (arg11.anInt6858 == 65535) {
					local39[3] = 0;
					local36 ^= 0xFFFFFFFFL;
				} else {
					local39[3] = arg11.anInt6858 | 0x40000000;
					local36 ^= local39[3];
				}
			}
		}
		@Pc(141) boolean local141 = false;
		@Pc(143) boolean local143 = false;
		@Pc(145) boolean local145 = false;
		@Pc(153) boolean local153 = arg11 != null || arg7 != null;
		@Pc(160) int local160 = arg8 == null ? 0 : arg8.length;
		@Pc(195) int local195;
		@Pc(200) int local200;
		for (@Pc(162) int local162 = 0; local162 < local160; local162++) {
			Static132.aClass1_Sub1_Sub8Array5[local162] = null;
			if (arg8[local162] != null) {
				@Pc(181) Class235 local181 = arg14.method5420(arg8[local162].anInt6764);
				if (local181.anIntArray633 != null) {
					local153 = true;
					Static402.aClass235Array2[local162] = local181;
					local195 = arg8[local162].anInt6767;
					local200 = arg8[local162].anInt6770;
					@Pc(205) int local205 = local181.anIntArray633[local195];
					Static132.aClass1_Sub1_Sub8Array5[local162] = arg14.method5423(local205 >>> 16);
					@Pc(218) int local218 = local205 & 0xFFFF;
					Static297.anIntArray522[local162] = local218;
					if (Static132.aClass1_Sub1_Sub8Array5[local162] != null) {
						local143 |= Static132.aClass1_Sub1_Sub8Array5[local162].method1440(local218);
						local141 |= Static132.aClass1_Sub1_Sub8Array5[local162].method1446(local218);
						local145 |= Static132.aClass1_Sub1_Sub8Array5[local162].method1448(local218);
					}
					if ((local181.aBoolean431 || Static261.aBoolean314) && local200 != -1 && local181.anIntArray633.length > local200) {
						Static81.anIntArray217[local162] = local181.anIntArray632[local195];
						Static115.anIntArray280[local162] = arg8[local162].anInt6765;
						@Pc(291) int local291 = local181.anIntArray633[local200];
						Static175.aClass1_Sub1_Sub8Array6[local162] = arg14.method5423(local291 >>> 16);
						@Pc(304) int local304 = local291 & 0xFFFF;
						Static209.anIntArray407[local162] = local304;
						if (Static175.aClass1_Sub1_Sub8Array6[local162] != null) {
							local143 |= Static175.aClass1_Sub1_Sub8Array6[local162].method1440(local304);
							local141 |= Static175.aClass1_Sub1_Sub8Array6[local162].method1446(local304);
							local145 |= Static175.aClass1_Sub1_Sub8Array6[local162].method1448(local304);
						}
					} else {
						Static81.anIntArray217[local162] = 0;
						Static115.anIntArray280[local162] = 0;
						Static175.aClass1_Sub1_Sub8Array6[local162] = null;
						Static209.anIntArray407[local162] = -1;
					}
				}
			}
		}
		@Pc(366) int local366 = -1;
		local195 = -1;
		local200 = 0;
		@Pc(372) Class1_Sub1_Sub8 local372 = null;
		@Pc(374) Class1_Sub1_Sub8 local374 = null;
		@Pc(376) int local376 = -1;
		@Pc(378) int local378 = -1;
		@Pc(380) int local380 = 0;
		@Pc(382) Class1_Sub1_Sub8 local382 = null;
		@Pc(384) Class1_Sub1_Sub8 local384 = null;
		if (local153) {
			@Pc(397) int local397;
			@Pc(461) int local461;
			if (arg11 != null) {
				local366 = arg11.anIntArray633[arg4];
				local397 = local366 >>> 16;
				local366 &= 0xFFFF;
				local372 = arg14.method5423(local397);
				if (local372 != null) {
					local143 |= local372.method1440(local366);
					local141 |= local372.method1446(local366);
					local145 |= local372.method1448(local366);
				}
				if ((arg11.aBoolean431 || Static261.aBoolean314) && arg9 != -1 && arg9 < arg11.anIntArray633.length) {
					local195 = arg11.anIntArray633[arg9];
					local200 = arg11.anIntArray632[arg4];
					local461 = local195 >>> 16;
					local374 = local461 == local397 ? local372 : arg14.method5423(local461);
					local195 &= 0xFFFF;
					if (local374 != null) {
						local143 |= local374.method1440(local195);
						local141 |= local374.method1446(local195);
						local145 |= local374.method1448(local195);
					}
				}
			}
			local33 = arg10 | 0x20;
			if (arg7 != null) {
				local376 = arg7.anIntArray633[arg3];
				local397 = local376 >>> 16;
				local382 = arg14.method5423(local397);
				local376 &= 0xFFFF;
				if (local382 != null) {
					local143 |= local382.method1440(local376);
					local141 |= local382.method1446(local376);
					local145 |= local382.method1448(local376);
				}
				if ((arg7.aBoolean431 || Static261.aBoolean314) && arg2 != -1 && arg2 < arg7.anIntArray633.length) {
					local378 = arg7.anIntArray633[arg2];
					local380 = arg7.anIntArray632[arg3];
					local461 = local378 >>> 16;
					local378 &= 0xFFFF;
					local384 = local397 == local461 ? local382 : arg14.method5423(local461);
					if (local384 != null) {
						local143 |= local384.method1440(local378);
						local141 |= local384.method1446(local378);
						local145 |= local384.method1448(local378);
					}
				}
			}
			if (local143) {
				local33 |= 0x80;
			}
			if (local141) {
				local33 |= 0x100;
			}
			if (local145) {
				local33 |= 0x400;
			}
		}
		@Pc(638) Class91 local638 = Static406.aClass91_61;
		@Pc(646) Class17 local646;
		synchronized (Static406.aClass91_61) {
			local646 = (Class17) Static406.aClass91_61.method1988(local36);
		}
		@Pc(654) Class212 local654 = null;
		if (this.anInt6155 != -1) {
			local654 = arg16.method5771(this.anInt6155);
		}
		@Pc(698) int local698;
		@Pc(703) int local703;
		if (local646 == null || arg13.method5913(local646.RA(), local33) != 0 || local654 != null && local654.anIntArrayArray49 != null && this.anIntArrayArray47 == null) {
			if (local646 != null) {
				local33 = arg13.method5954(local33, local646.RA());
			}
			@Pc(696) boolean local696 = false;
			local698 = 0;
			while (true) {
				if (local698 >= 12) {
					if (local696) {
						if (this.aLong177 != -1L) {
							@Pc(758) Class91 local758 = Static406.aClass91_61;
							synchronized (Static406.aClass91_61) {
								local646 = (Class17) Static406.aClass91_61.method1988(this.aLong177);
							}
						}
						if (local646 == null || arg13.method5913(local646.RA(), local33) != 0 || local654 != null && local654.anIntArrayArray49 != null && this.anIntArrayArray47 == null) {
							return null;
						}
					} else {
						@Pc(794) Class147[] local794 = new Class147[12];
						@Pc(801) int local801;
						for (@Pc(796) int local796 = 0; local796 < 12; local796++) {
							local801 = local39[local796];
							@Pc(821) Class147 local821;
							if ((local801 & 0x40000000) != 0) {
								local821 = arg5.method1414(local801 & 0x3FFFFFFF).method3731(this.aBoolean394);
								if (local821 != null) {
									local794[local796] = local821;
								}
							} else if ((local801 & Integer.MIN_VALUE) != 0) {
								local821 = arg12.method3319(local801 & 0x3FFFFFFF).method1500();
								if (local821 != null) {
									local794[local796] = local821;
								}
							}
						}
						@Pc(874) int local874;
						if (local654 != null && local654.anIntArrayArray49 != null) {
							for (local801 = 0; local801 < local654.anIntArrayArray49.length; local801++) {
								if (local654.anIntArrayArray49[local801] != null && local794[local801] != null) {
									local874 = local654.anIntArrayArray49[local801][0];
									@Pc(881) int local881 = local654.anIntArrayArray49[local801][1];
									@Pc(888) int local888 = local654.anIntArrayArray49[local801][2];
									@Pc(897) int local897 = local654.anIntArrayArray49[local801][3] << 3;
									@Pc(906) int local906 = local654.anIntArrayArray49[local801][4] << 3;
									@Pc(915) int local915 = local654.anIntArrayArray49[local801][5] << 3;
									if (this.anIntArrayArray47 == null) {
										this.anIntArrayArray47 = new int[local654.anIntArrayArray49.length][];
									}
									if (this.anIntArrayArray47[local801] == null) {
										@Pc(937) int[] local937 = this.anIntArrayArray47[local801] = new int[15];
										if (local897 == 0 && local906 == 0 && local915 == 0) {
											local937[0] = local937[4] = local937[8] = 32768;
											local937[14] = -local888;
											local937[12] = -local874;
											local937[13] = -local881;
										} else {
											@Pc(984) int local984 = Class90_Sub1.anIntArray303[local897];
											@Pc(988) int local988 = Class90_Sub1.anIntArray304[local897];
											@Pc(992) int local992 = Class90_Sub1.anIntArray303[local906];
											@Pc(996) int local996 = Class90_Sub1.anIntArray304[local906];
											@Pc(1000) int local1000 = Class90_Sub1.anIntArray303[local915];
											@Pc(1004) int local1004 = Class90_Sub1.anIntArray304[local915];
											@Pc(1012) int local1012 = local988 * local1000 + 16384 >> 15;
											@Pc(1020) int local1020 = local988 * local1004 + 16384 >> 15;
											local937[8] = local992 * local984 + 16384 >> 15;
											local937[1] = local992 * -local1004 + local996 * local1012 + 16384 >> 15;
											local937[7] = local1012 * local992 + -local1004 * -local996 + 16384 >> 15;
											local937[5] = -local988;
											local937[4] = local1000 * local984 + 16384 >> 15;
											local937[2] = local996 * local984 + 16384 >> 15;
											local937[0] = local1020 * local996 + local1000 * local992 + 16384 >> 15;
											local937[6] = local1000 * -local996 + local992 * local1020 + 16384 >> 15;
											local937[3] = local984 * local1004 + 16384 >> 15;
											local937[13] = local937[7] * -local888 + -local881 * local937[4] + local937[1] * -local874 + 16384 >> 15;
											local937[14] = local937[8] * -local888 + local937[2] * -local874 + -local881 * local937[5] + 16384 >> 15;
											local937[12] = -local881 * local937[3] + local937[0] * -local874 + -local888 * local937[6] + 16384 >> 15;
										}
										local937[9] = local874;
										local937[11] = local888;
										local937[10] = local881;
									}
									if (local897 != 0 || local906 != 0 || local915 != 0) {
										local794[local801].method3377(local906, local897, local915);
									}
									if (local874 != 0 || local881 != 0 || local888 != 0) {
										local794[local801].method3368(local888, local874, local881);
									}
								}
							}
						}
						@Pc(1266) int local1266 = local33 | 0x4000;
						@Pc(1273) Class147 local1273 = new Class147(local794, local794.length);
						local646 = arg13.method5922(local1273, local1266, Static341.anInt6237, 64, 850);
						for (local874 = 0; local874 < 5; local874++) {
							if (Static182.aShortArrayArray2[local874].length > this.anIntArray579[local874]) {
								local646.q(Static365.aShortArray126[local874], Static182.aShortArrayArray2[local874][this.anIntArray579[local874]]);
							}
							if (this.anIntArray579[local874] < Static431.aShortArrayArray8[local874].length) {
								local646.q(Static344.aShortArray114[local874], Static431.aShortArrayArray8[local874][this.anIntArray579[local874]]);
							}
						}
						local646.D(local33);
						@Pc(1343) Class91 local1343 = Static406.aClass91_61;
						synchronized (Static406.aClass91_61) {
							Static406.aClass91_61.method1990(local646, local36);
						}
						this.aLong177 = local36;
					}
					break;
				}
				local703 = local39[local698];
				if ((local703 & 0x40000000) == 0) {
					if ((local703 & Integer.MIN_VALUE) != 0 && !arg12.method3319(local703 & 0x3FFFFFFF).method1498()) {
						local696 = true;
					}
				} else if (!arg5.method1414(local703 & 0x3FFFFFFF).method3730(this.aBoolean394)) {
					local696 = true;
				}
				local698++;
			}
		}
		@Pc(1365) Class17 local1365 = local646.method6202((byte) 4, local33, true);
		if (!local153) {
			return local1365;
		}
		@Pc(1371) int local1371 = 0;
		local698 = 1;
		while (local160 > local1371) {
			if (Static132.aClass1_Sub1_Sub8Array5[local1371] != null) {
				local1365.method6192(Static81.anIntArray217[local1371], Static297.anIntArray522[local1371], this.anIntArrayArray47 == null ? null : this.anIntArrayArray47[local1371], Static175.aClass1_Sub1_Sub8Array6[local1371], false, Static132.aClass1_Sub1_Sub8Array5[local1371], Static115.anIntArray280[local1371] - 1, local698, Static209.anIntArray407[local1371]);
			}
			local698 <<= 0x1;
			local1371++;
		}
		if (local372 != null && local382 != null) {
			local1365.method6191(local376, arg6 - 1, local378, arg11.aBooleanArray22, local195, local380, local366, local384, local374, local200, false, arg15 - 1, local372, local382);
		} else if (local372 != null) {
			local1365.method6194(local372, local200, local366, local195, false, local374, 0, arg6 - 1);
		} else if (local382 != null) {
			local1365.method6194(local382, local380, local376, local378, false, local384, 0, arg15 - 1);
		}
		for (local703 = 0; local703 < local160; local703++) {
			Static132.aClass1_Sub1_Sub8Array5[local703] = null;
			Static175.aClass1_Sub1_Sub8Array6[local703] = null;
			Static402.aClass235Array2[local703] = null;
		}
		return local1365;
	}

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "(Z)V")
	private void method4725() {
		this.aLong178 = -1L;
		@Pc(8) long[] local8 = Class163.aLongArray6;
		this.aLong178 = this.aLong178 >>> 8 ^ local8[(int) ((this.aLong178 ^ (long) (this.anInt6155 >> 8)) & 0xFFL)];
		this.aLong178 = this.aLong178 >>> 8 ^ local8[(int) (((long) this.anInt6155 ^ this.aLong178) & 0xFFL)];
		for (@Pc(54) int local54 = 0; local54 < 12; local54++) {
			this.aLong178 = this.aLong178 >>> 8 ^ local8[(int) ((this.aLong178 ^ (long) (this.anIntArray578[local54] >> 24)) & 0xFFL)];
			this.aLong178 = local8[(int) (((long) (this.anIntArray578[local54] >> 16) ^ this.aLong178) & 0xFFL)] ^ this.aLong178 >>> 8;
			this.aLong178 = this.aLong178 >>> 8 ^ local8[(int) (((long) (this.anIntArray578[local54] >> 8) ^ this.aLong178) & 0xFFL)];
			this.aLong178 = local8[(int) ((this.aLong178 ^ (long) this.anIntArray578[local54]) & 0xFFL)] ^ this.aLong178 >>> 8;
		}
		for (@Pc(147) int local147 = 0; local147 < 5; local147++) {
			this.aLong178 = this.aLong178 >>> 8 ^ local8[(int) ((this.aLong178 ^ (long) this.anIntArray579[local147]) & 0xFFL)];
		}
		this.aLong178 = local8[(int) (((long) (this.aBoolean394 ? 1 : 0) ^ this.aLong178) & 0xFFL)] ^ this.aLong178 >>> 8;
	}

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "(Lclient!za;IILclient!tl;Lclient!kg;Lclient!sq;ILclient!im;IILclient!dj;Lclient!ck;)Lclient!e;")
	public Class17 method4726(@OriginalArg(0) Class106 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class239 arg3, @OriginalArg(4) Class143 arg4, @OriginalArg(5) Class235 arg5, @OriginalArg(7) Interface4 arg6, @OriginalArg(8) int arg7, @OriginalArg(10) Class57 arg8, @OriginalArg(11) Class44 arg9) {
		if (this.anInt6156 != -1) {
			return arg9.method999(this.anInt6156).method133(arg7, arg3, arg1, arg6, arg2, arg0, arg5);
		}
		@Pc(28) int local28 = 2048;
		@Pc(36) boolean local36;
		@Pc(51) int local51;
		@Pc(115) int local115;
		@Pc(59) int local59;
		if (arg5 != null) {
			@Pc(32) boolean local32 = false;
			@Pc(34) boolean local34 = false;
			local36 = false;
			@Pc(38) boolean local38 = false;
			local51 = arg5.anIntArray633[arg1];
			local28 = 2080;
			local59 = local51 >>> 16;
			@Pc(64) Class1_Sub1_Sub8 local64 = arg3.method5423(local59);
			@Pc(68) int local68 = local51 & 0xFFFF;
			if (local64 != null) {
				local34 = local64.method1440(local68) | false;
				local32 = local64.method1446(local68) | false;
				local38 = local64.method1448(local68) | false;
				local36 = arg5.aBoolean432 | false;
			}
			if ((arg5.aBoolean431 || Static261.aBoolean314) && arg7 != -1 && arg5.anIntArray633.length > arg7) {
				local115 = arg5.anIntArray633[arg7];
				@Pc(119) int local119 = local115 >>> 16;
				@Pc(129) Class1_Sub1_Sub8 local129 = local119 == local59 ? local64 : arg3.method5423(local119);
				@Pc(133) int local133 = local115 & 0xFFFF;
				if (local129 != null) {
					local34 |= local129.method1440(local133);
					local32 |= local129.method1446(local133);
					local38 |= local129.method1448(local133);
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
		@Pc(182) Class91 local182 = Static117.aClass91_39;
		@Pc(191) Class17 local191;
		synchronized (Static117.aClass91_39) {
			local191 = (Class17) Static117.aClass91_39.method1988(this.aLong178);
		}
		if (local191 == null || arg0.method5913(local191.RA(), local28) != 0) {
			if (local191 != null) {
				local28 = arg0.method5954(local28, local191.RA());
			}
			local36 = false;
			for (@Pc(219) int local219 = 0; local219 < 12; local219++) {
				local51 = this.anIntArray578[local219];
				if ((local51 & 0x40000000) == 0) {
					if ((local51 & Integer.MIN_VALUE) != 0 && !arg4.method3319(local51 & 0x3FFFFFFF).method1492()) {
						local36 = true;
					}
				} else if (!arg8.method1414(local51 & 0x3FFFFFFF).method3719(this.aBoolean394)) {
					local36 = true;
				}
			}
			if (local36) {
				return null;
			}
			@Pc(271) Class147[] local271 = new Class147[12];
			local115 = 0;
			for (@Pc(275) int local275 = 0; local275 < 12; local275++) {
				@Pc(282) int local282 = this.anIntArray578[local275];
				@Pc(297) Class147 local297;
				if ((local282 & 0x40000000) != 0) {
					local297 = arg8.method1414(local282 & 0x3FFFFFFF).method3735(this.aBoolean394);
					if (local297 != null) {
						local271[local115++] = local297;
					}
				} else if ((local282 & Integer.MIN_VALUE) != 0) {
					local297 = arg4.method3319(local282 & 0x3FFFFFFF).method1494();
					if (local297 != null) {
						local271[local115++] = local297;
					}
				}
			}
			@Pc(339) int local339 = local28 | 0x4000;
			@Pc(345) Class147 local345 = new Class147(local271, local115);
			local191 = arg0.method5922(local345, local339, Static341.anInt6237, 64, 768);
			for (local59 = 0; local59 < 5; local59++) {
				if (Static182.aShortArrayArray2[local59].length > this.anIntArray579[local59]) {
					local191.q(Static365.aShortArray126[local59], Static182.aShortArrayArray2[local59][this.anIntArray579[local59]]);
				}
				if (this.anIntArray579[local59] < Static431.aShortArrayArray8[local59].length) {
					local191.q(Static344.aShortArray114[local59], Static431.aShortArrayArray8[local59][this.anIntArray579[local59]]);
				}
			}
			local191.D(local28);
			@Pc(418) Class91 local418 = Static117.aClass91_39;
			synchronized (Static117.aClass91_39) {
				Static117.aClass91_39.method1990(local191, this.aLong178);
			}
		}
		if (arg5 == null) {
			return local191;
		} else {
			local191.method6202((byte) 4, local28, true);
			return arg5.method5215(arg7, arg2, local191, arg1, 2048);
		}
	}

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "(ZBII[I[I)V")
	public void method4728(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int[] arg3, @OriginalArg(5) int[] arg4) {
		this.anIntArray579 = arg3;
		if (arg1 != this.anInt6155) {
			this.anInt6155 = arg1;
			this.anIntArrayArray47 = null;
		}
		this.anIntArray578 = arg4;
		this.aBoolean394 = arg0;
		this.anInt6156 = arg2;
		this.method4725();
	}

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "(ILclient!kg;II)V")
	public void method4731(@OriginalArg(0) int arg0, @OriginalArg(1) Class143 arg1, @OriginalArg(2) int arg2) {
		@Pc(7) int local7 = Static369.anIntArray623[arg2];
		if (this.anIntArray578[local7] != 0 && arg1.method3319(arg0) != null) {
			this.anIntArray578[local7] = Integer.MIN_VALUE | arg0;
			this.method4725();
		}
	}

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "(ZI)V")
	public void method4732(@OriginalArg(0) boolean arg0) {
		this.aBoolean394 = arg0;
		this.method4725();
	}

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "(III)V")
	public void method4733(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anIntArray579[arg1] = arg0;
		this.method4725();
	}
}
