import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eb")
public final class Class60 {

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "Z")
	public boolean aBoolean109;

	@OriginalMember(owner = "client!eb", name = "c", descriptor = "J")
	private long aLong51;

	@OriginalMember(owner = "client!eb", name = "e", descriptor = "[I")
	public int[] anIntArray122;

	@OriginalMember(owner = "client!eb", name = "h", descriptor = "[[I")
	private int[][] anIntArrayArray19;

	@OriginalMember(owner = "client!eb", name = "p", descriptor = "I")
	private int anInt1639;

	@OriginalMember(owner = "client!eb", name = "r", descriptor = "J")
	private long aLong52;

	@OriginalMember(owner = "client!eb", name = "s", descriptor = "[I")
	private int[] anIntArray123;

	@OriginalMember(owner = "client!eb", name = "n", descriptor = "I")
	public int anInt1637 = -1;

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(ILclient!gq;IILclient!ya;ZLclient!eg;Lclient!id;Lclient!vg;ILclient!in;Lclient!hp;)Lclient!t;")
	public Class116 method1325(@OriginalArg(0) int arg0, @OriginalArg(1) Class101 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class135 arg4, @OriginalArg(6) Class64 arg5, @OriginalArg(7) Class119 arg6, @OriginalArg(8) Interface12 arg7, @OriginalArg(10) Class125 arg8, @OriginalArg(11) Class115 arg9) {
		if (this.anInt1637 != -1) {
			return arg9.method2201(this.anInt1637).method1543(arg8, arg3, arg4, arg0, arg6, arg7, arg2);
		}
		@Pc(28) int local28 = 2048;
		@Pc(36) boolean local36;
		@Pc(49) int local49;
		@Pc(114) int local114;
		@Pc(59) int local59;
		if (arg6 != null) {
			@Pc(32) boolean local32 = false;
			@Pc(34) boolean local34 = false;
			local36 = false;
			@Pc(38) boolean local38 = false;
			local49 = arg6.anIntArray244[arg0];
			local28 = 2080;
			local59 = local49 >>> 16;
			@Pc(63) int local63 = local49 & 0xFFFF;
			@Pc(68) Class4_Sub2_Sub6 local68 = arg8.method2383(local59);
			if (local68 != null) {
				local34 = local68.method783(local63) | false;
				local32 = local68.method781(local63) | false;
				local38 = local68.method780(local63) | false;
				local36 = arg6.aBoolean222 | false;
			}
			if ((arg6.aBoolean223 || Static272.aBoolean335) && arg3 != -1 && arg3 < arg6.anIntArray244.length) {
				local114 = arg6.anIntArray244[arg3];
				@Pc(118) int local118 = local114 >>> 16;
				@Pc(132) Class4_Sub2_Sub6 local132 = local59 == local118 ? local68 : arg8.method2383(local118);
				@Pc(136) int local136 = local114 & 0xFFFF;
				if (local132 != null) {
					local34 |= local132.method783(local136);
					local32 |= local132.method781(local136);
					local38 |= local132.method780(local136);
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
		@Pc(185) Class137 local185 = Static264.aClass137_46;
		@Pc(194) Class116 local194;
		synchronized (Static264.aClass137_46) {
			local194 = (Class116) Static264.aClass137_46.method2744(this.aLong51);
		}
		if (local194 == null || arg4.method5356(local194.P(), local28) != 0) {
			if (local194 != null) {
				local28 = arg4.method5399(local28, local194.P());
			}
			local36 = false;
			for (@Pc(222) int local222 = 0; local222 < 12; local222++) {
				local49 = this.anIntArray123[local222];
				if ((local49 & 0x40000000) == 0) {
					if ((Integer.MIN_VALUE & local49) != 0 && !arg1.method1965(local49 & 0x3FFFFFFF).method473()) {
						local36 = true;
					}
				} else if (!arg5.method1372(local49 & 0x3FFFFFFF).method1601(this.aBoolean109)) {
					local36 = true;
				}
			}
			if (local36) {
				return null;
			}
			@Pc(276) Class166[] local276 = new Class166[12];
			local114 = 0;
			for (@Pc(280) int local280 = 0; local280 < 12; local280++) {
				@Pc(287) int local287 = this.anIntArray123[local280];
				@Pc(310) Class166 local310;
				if ((local287 & 0x40000000) != 0) {
					local310 = arg5.method1372(local287 & 0x3FFFFFFF).method1602(this.aBoolean109);
					if (local310 != null) {
						local276[local114++] = local310;
					}
				} else if ((Integer.MIN_VALUE & local287) != 0) {
					local310 = arg1.method1965(local287 & 0x3FFFFFFF).method470();
					if (local310 != null) {
						local276[local114++] = local310;
					}
				}
			}
			@Pc(345) int local345 = local28 | 0x4000;
			@Pc(351) Class166 local351 = new Class166(local276, local114);
			local194 = arg4.method5391(local351, local345, Static440.anInt7328, 64, 768);
			for (local59 = 0; local59 < 5; local59++) {
				if (this.anIntArray122[local59] < Static180.aShortArrayArray3[local59].length) {
					local194.BA(Static276.aShortArray84[local59], Static180.aShortArrayArray3[local59][this.anIntArray122[local59]]);
				}
				if (this.anIntArray122[local59] < Static155.aShortArrayArray2[local59].length) {
					local194.BA(Static34.aShortArray30[local59], Static155.aShortArrayArray2[local59][this.anIntArray122[local59]]);
				}
			}
			local194.UA(local28);
			@Pc(426) Class137 local426 = Static264.aClass137_46;
			synchronized (Static264.aClass137_46) {
				Static264.aClass137_46.method2732(this.aLong51, local194);
			}
		}
		if (arg6 == null) {
			return local194;
		} else {
			local194.method3123((byte) 4, local28, true);
			return arg6.method2288(arg3, local194, arg2, arg0, 2048);
		}
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(III[Lclient!ce;Lclient!id;ILclient!ya;ZILclient!id;ILclient!vg;Lclient!hp;ILclient!a;Lclient!in;Lclient!eg;ZLclient!gq;)Lclient!t;")
	public Class116 method1326(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class39[] arg3, @OriginalArg(4) Class119 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class135 arg6, @OriginalArg(8) int arg7, @OriginalArg(9) Class119 arg8, @OriginalArg(10) int arg9, @OriginalArg(11) Interface12 arg10, @OriginalArg(12) Class115 arg11, @OriginalArg(13) int arg12, @OriginalArg(14) Class1 arg13, @OriginalArg(15) Class125 arg14, @OriginalArg(16) Class64 arg15, @OriginalArg(18) Class101 arg16) {
		if (this.anInt1637 != -1) {
			return arg11.method2201(this.anInt1637).method1548(arg4, arg2, arg6, arg9, arg7, arg14, arg12, arg13, arg1, arg3, arg0, arg5, arg8, arg10);
		}
		@Pc(33) int local33 = arg2;
		@Pc(36) long local36 = this.aLong51;
		@Pc(39) int[] local39 = this.anIntArray123;
		if (arg8 != null && (arg8.anInt3005 >= 0 || arg8.anInt2996 >= 0)) {
			local39 = new int[12];
			for (@Pc(55) int local55 = 0; local55 < 12; local55++) {
				local39[local55] = this.anIntArray123[local55];
			}
			if (arg8.anInt3005 >= 0) {
				if (arg8.anInt3005 == 65535) {
					local39[5] = 0;
					local36 ^= 0xFFFFFFFF00000000L;
				} else {
					local39[5] = arg8.anInt3005 | 0x40000000;
					local36 ^= (long) local39[5] << 32;
				}
			}
			if (arg8.anInt2996 >= 0) {
				if (arg8.anInt2996 == 65535) {
					local39[3] = 0;
					local36 ^= 0xFFFFFFFFL;
				} else {
					local39[3] = arg8.anInt2996 | 0x40000000;
					local36 ^= local39[3];
				}
			}
		}
		@Pc(136) boolean local136 = false;
		@Pc(138) boolean local138 = false;
		@Pc(140) boolean local140 = false;
		@Pc(148) boolean local148 = arg8 != null || arg4 != null;
		@Pc(155) int local155 = arg3 == null ? 0 : arg3.length;
		@Pc(189) int local189;
		@Pc(194) int local194;
		for (@Pc(157) int local157 = 0; local157 < local155; local157++) {
			Static81.aClass4_Sub2_Sub6Array1[local157] = null;
			if (arg3[local157] != null) {
				@Pc(175) Class119 local175 = arg14.method2389(arg3[local157].anInt732);
				if (local175.anIntArray244 != null) {
					local148 = true;
					Static99.aClass119Array1[local157] = local175;
					local189 = arg3[local157].anInt734;
					local194 = arg3[local157].anInt738;
					@Pc(199) int local199 = local175.anIntArray244[local189];
					Static81.aClass4_Sub2_Sub6Array1[local157] = arg14.method2383(local199 >>> 16);
					@Pc(212) int local212 = local199 & 0xFFFF;
					Static252.anIntArray347[local157] = local212;
					if (Static81.aClass4_Sub2_Sub6Array1[local157] != null) {
						local138 |= Static81.aClass4_Sub2_Sub6Array1[local157].method783(local212);
						local136 |= Static81.aClass4_Sub2_Sub6Array1[local157].method781(local212);
						local140 |= Static81.aClass4_Sub2_Sub6Array1[local157].method780(local212);
					}
					if ((local175.aBoolean223 || Static272.aBoolean335) && local194 != -1 && local194 < local175.anIntArray244.length) {
						Static113.anIntArray168[local157] = local175.anIntArray242[local189];
						Static360.anIntArray470[local157] = arg3[local157].anInt736;
						@Pc(280) int local280 = local175.anIntArray244[local194];
						Static315.aClass4_Sub2_Sub6Array3[local157] = arg14.method2383(local280 >>> 16);
						@Pc(293) int local293 = local280 & 0xFFFF;
						Static333.anIntArray432[local157] = local293;
						if (Static315.aClass4_Sub2_Sub6Array3[local157] != null) {
							local138 |= Static315.aClass4_Sub2_Sub6Array3[local157].method783(local293);
							local136 |= Static315.aClass4_Sub2_Sub6Array3[local157].method781(local293);
							local140 |= Static315.aClass4_Sub2_Sub6Array3[local157].method780(local293);
						}
					} else {
						Static113.anIntArray168[local157] = 0;
						Static360.anIntArray470[local157] = 0;
						Static315.aClass4_Sub2_Sub6Array3[local157] = null;
						Static333.anIntArray432[local157] = -1;
					}
				}
			}
		}
		@Pc(352) int local352 = -1;
		local189 = -1;
		local194 = 0;
		@Pc(358) Class4_Sub2_Sub6 local358 = null;
		@Pc(360) Class4_Sub2_Sub6 local360 = null;
		@Pc(362) int local362 = -1;
		@Pc(364) int local364 = -1;
		@Pc(366) int local366 = 0;
		@Pc(368) Class4_Sub2_Sub6 local368 = null;
		@Pc(370) Class4_Sub2_Sub6 local370 = null;
		if (local148) {
			local33 = arg2 | 0x20;
			@Pc(387) int local387;
			@Pc(450) int local450;
			if (arg8 != null) {
				local352 = arg8.anIntArray244[arg1];
				local387 = local352 >>> 16;
				local358 = arg14.method2383(local387);
				local352 &= 0xFFFF;
				if (local358 != null) {
					local138 |= local358.method783(local352);
					local136 |= local358.method781(local352);
					local140 |= local358.method780(local352);
				}
				if ((arg8.aBoolean223 || Static272.aBoolean335) && arg5 != -1 && arg5 < arg8.anIntArray244.length) {
					local189 = arg8.anIntArray244[arg5];
					local194 = arg8.anIntArray242[arg1];
					local450 = local189 >>> 16;
					local360 = local450 == local387 ? local358 : arg14.method2383(local450);
					local189 &= 0xFFFF;
					if (local360 != null) {
						local138 |= local360.method783(local189);
						local136 |= local360.method781(local189);
						local140 |= local360.method780(local189);
					}
				}
			}
			if (arg4 != null) {
				local362 = arg4.anIntArray244[arg9];
				local387 = local362 >>> 16;
				local368 = arg14.method2383(local387);
				local362 &= 0xFFFF;
				if (local368 != null) {
					local138 |= local368.method783(local362);
					local136 |= local368.method781(local362);
					local140 |= local368.method780(local362);
				}
				if ((arg4.aBoolean223 || Static272.aBoolean335) && arg0 != -1 && arg0 < arg4.anIntArray244.length) {
					local364 = arg4.anIntArray244[arg0];
					local366 = arg4.anIntArray242[arg9];
					local450 = local364 >>> 16;
					local370 = local387 == local450 ? local368 : arg14.method2383(local450);
					local364 &= 0xFFFF;
					if (local370 != null) {
						local138 |= local370.method783(local364);
						local136 |= local370.method781(local364);
						local140 |= local370.method780(local364);
					}
				}
			}
			if (local138) {
				local33 |= 0x80;
			}
			if (local136) {
				local33 |= 0x100;
			}
			if (local140) {
				local33 |= 0x400;
			}
		}
		@Pc(622) Class137 local622 = Static144.aClass137_23;
		@Pc(630) Class116 local630;
		synchronized (Static144.aClass137_23) {
			local630 = (Class116) Static144.aClass137_23.method2744(local36);
		}
		@Pc(638) Class42 local638 = null;
		if (this.anInt1639 != -1) {
			local638 = arg13.method1(this.anInt1639);
		}
		@Pc(681) int local681;
		@Pc(687) int local687;
		if (local630 == null || arg6.method5356(local630.P(), local33) != 0 || local638 != null && local638.anIntArrayArray14 != null && this.anIntArrayArray19 == null) {
			if (local630 != null) {
				local33 = arg6.method5399(local33, local630.P());
			}
			@Pc(679) boolean local679 = false;
			local681 = 0;
			while (true) {
				if (local681 >= 12) {
					if (local679) {
						if (this.aLong52 != -1L) {
							@Pc(739) Class137 local739 = Static144.aClass137_23;
							synchronized (Static144.aClass137_23) {
								local630 = (Class116) Static144.aClass137_23.method2744(this.aLong52);
							}
						}
						if (local630 == null || arg6.method5356(local630.P(), local33) != 0 || local638 != null && local638.anIntArrayArray14 != null && this.anIntArrayArray19 == null) {
							return null;
						}
					} else {
						@Pc(775) Class166[] local775 = new Class166[12];
						@Pc(783) int local783;
						for (@Pc(777) int local777 = 0; local777 < 12; local777++) {
							local783 = local39[local777];
							@Pc(803) Class166 local803;
							if ((local783 & 0x40000000) != 0) {
								local803 = arg15.method1372(local783 & 0x3FFFFFFF).method1608(this.aBoolean109);
								if (local803 != null) {
									local775[local777] = local803;
								}
							} else if ((local783 & Integer.MIN_VALUE) != 0) {
								local803 = arg16.method1965(local783 & 0x3FFFFFFF).method466();
								if (local803 != null) {
									local775[local777] = local803;
								}
							}
						}
						@Pc(859) int local859;
						if (local638 != null && local638.anIntArrayArray14 != null) {
							for (local783 = 0; local783 < local638.anIntArrayArray14.length; local783++) {
								if (local638.anIntArrayArray14[local783] != null && local775[local783] != null) {
									local859 = local638.anIntArrayArray14[local783][0];
									@Pc(866) int local866 = local638.anIntArrayArray14[local783][1];
									@Pc(873) int local873 = local638.anIntArrayArray14[local783][2];
									@Pc(882) int local882 = local638.anIntArrayArray14[local783][3] << 3;
									@Pc(891) int local891 = local638.anIntArrayArray14[local783][4] << 3;
									@Pc(900) int local900 = local638.anIntArrayArray14[local783][5] << 3;
									if (this.anIntArrayArray19 == null) {
										this.anIntArrayArray19 = new int[local638.anIntArrayArray14.length][];
									}
									if (this.anIntArrayArray19[local783] == null) {
										@Pc(922) int[] local922 = this.anIntArrayArray19[local783] = new int[15];
										if (local882 == 0 && local891 == 0 && local900 == 0) {
											local922[14] = -local873;
											local922[0] = local922[4] = local922[8] = 32768;
											local922[12] = -local859;
											local922[13] = -local866;
										} else {
											@Pc(967) int local967 = Class100.anIntArray208[local882];
											@Pc(971) int local971 = Class100.anIntArray206[local882];
											@Pc(975) int local975 = Class100.anIntArray208[local891];
											@Pc(979) int local979 = Class100.anIntArray206[local891];
											@Pc(983) int local983 = Class100.anIntArray208[local900];
											@Pc(987) int local987 = Class100.anIntArray206[local900];
											@Pc(995) int local995 = local971 * local983 + 16384 >> 15;
											@Pc(1003) int local1003 = local971 * local987 + 16384 >> 15;
											local922[6] = local1003 * local975 + local983 * -local979 + 16384 >> 15;
											local922[8] = local975 * local967 + 16384 >> 15;
											local922[0] = local1003 * local979 + local983 * local975 + 16384 >> 15;
											local922[4] = local983 * local967 + 16384 >> 15;
											local922[2] = local967 * local979 + 16384 >> 15;
											local922[3] = local967 * local987 + 16384 >> 15;
											local922[1] = local979 * local995 + local975 * -local987 + 16384 >> 15;
											local922[7] = -local979 * -local987 + local995 * local975 + 16384 >> 15;
											local922[5] = -local971;
											local922[14] = local922[8] * -local873 + -local866 * local922[5] + local922[2] * -local859 + 16384 >> 15;
											local922[12] = -local859 * local922[0] + -local866 * local922[3] + local922[6] * -local873 + 16384 >> 15;
											local922[13] = local922[7] * -local873 + local922[4] * -local866 + -local859 * local922[1] + 16384 >> 15;
										}
										local922[9] = local859;
										local922[10] = local866;
										local922[11] = local873;
									}
									if (local882 != 0 || local891 != 0 || local900 != 0) {
										local775[local783].method3197(local891, local882, local900);
									}
									if (local859 != 0 || local866 != 0 || local873 != 0) {
										local775[local783].method3204(local873, local859, local866);
									}
								}
							}
						}
						@Pc(1254) Class166 local1254 = new Class166(local775, local775.length);
						@Pc(1258) int local1258 = local33 | 0x4000;
						local630 = arg6.method5391(local1254, local1258, Static440.anInt7328, 64, 850);
						for (local859 = 0; local859 < 5; local859++) {
							if (this.anIntArray122[local859] < Static180.aShortArrayArray3[local859].length) {
								local630.BA(Static276.aShortArray84[local859], Static180.aShortArrayArray3[local859][this.anIntArray122[local859]]);
							}
							if (this.anIntArray122[local859] < Static155.aShortArrayArray2[local859].length) {
								local630.BA(Static34.aShortArray30[local859], Static155.aShortArrayArray2[local859][this.anIntArray122[local859]]);
							}
						}
						local630.UA(local33);
						@Pc(1331) Class137 local1331 = Static144.aClass137_23;
						synchronized (Static144.aClass137_23) {
							Static144.aClass137_23.method2732(local36, local630);
						}
						this.aLong52 = local36;
					}
					break;
				}
				local687 = local39[local681];
				if ((local687 & 0x40000000) == 0) {
					if ((Integer.MIN_VALUE & local687) != 0 && !arg16.method1965(local687 & 0x3FFFFFFF).method469()) {
						local679 = true;
					}
				} else if (!arg15.method1372(local687 & 0x3FFFFFFF).method1610(this.aBoolean109)) {
					local679 = true;
				}
				local681++;
			}
		}
		@Pc(1353) Class116 local1353 = local630.method3123((byte) 4, local33, true);
		if (!local148) {
			return local1353;
		}
		@Pc(1359) int local1359 = 0;
		local681 = 1;
		while (local155 > local1359) {
			if (Static81.aClass4_Sub2_Sub6Array1[local1359] != null) {
				local1353.method3113(this.anIntArrayArray19 == null ? null : this.anIntArrayArray19[local1359], Static252.anIntArray347[local1359], false, Static315.aClass4_Sub2_Sub6Array3[local1359], Static113.anIntArray168[local1359], local681, Static360.anIntArray470[local1359] - 1, Static81.aClass4_Sub2_Sub6Array1[local1359], Static333.anIntArray432[local1359]);
			}
			local681 <<= 0x1;
			local1359++;
		}
		if (local358 != null && local368 != null) {
			local1353.method3122(arg8.aBooleanArray16, local189, local366, false, local194, arg7 - 1, local364, local352, local370, local362, local368, arg12 - 1, local360, local358);
		} else if (local358 != null) {
			local1353.method3109(false, local358, arg12 - 1, local360, local189, 0, local352, local194);
		} else if (local368 != null) {
			local1353.method3109(false, local368, arg7 - 1, local370, local364, 0, local362, local366);
		}
		for (local687 = 0; local687 < local155; local687++) {
			Static81.aClass4_Sub2_Sub6Array1[local687] = null;
			Static315.aClass4_Sub2_Sub6Array3[local687] = null;
			Static99.aClass119Array1[local687] = null;
		}
		return local1353;
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(IZ)V")
	public void method1327(@OriginalArg(1) boolean arg0) {
		this.aBoolean109 = arg0;
		this.method1334();
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(ILclient!gq;IILclient!id;ILclient!ya;IIILclient!in;I)Lclient!t;")
	public Class116 method1329(@OriginalArg(0) int arg0, @OriginalArg(1) Class101 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class119 arg4, @OriginalArg(6) Class135 arg5, @OriginalArg(7) int arg6, @OriginalArg(9) int arg7, @OriginalArg(10) Class125 arg8, @OriginalArg(11) int arg9) {
		@Pc(7) int local7 = 2048;
		@Pc(106) int local106;
		if (arg4 != null) {
			@Pc(16) boolean local16 = false;
			@Pc(18) boolean local18 = false;
			@Pc(20) boolean local20 = false;
			@Pc(22) boolean local22 = false;
			local7 = 2080;
			@Pc(37) int local37 = arg4.anIntArray244[arg9];
			@Pc(43) int local43 = local37 >>> 16;
			@Pc(47) int local47 = local37 & 0xFFFF;
			@Pc(54) Class4_Sub2_Sub6 local54 = arg8.method2383(local43);
			if (local54 != null) {
				local18 = local54.method783(local47) | false;
				local16 = local54.method781(local47) | false;
				local22 = local54.method780(local47) | false;
				local20 = arg4.aBoolean222 | false;
			}
			if ((arg4.aBoolean223 || Static272.aBoolean335) && arg2 != -1 && arg2 < arg4.anIntArray244.length) {
				local106 = arg4.anIntArray244[arg2];
				@Pc(110) int local110 = local106 >>> 16;
				@Pc(114) int local114 = local106 & 0xFFFF;
				@Pc(119) Class4_Sub2_Sub6 local119;
				if (local43 == local110) {
					local119 = local54;
				} else {
					local119 = arg8.method2383(local114 >>> 16);
				}
				if (local119 != null) {
					local18 |= local119.method783(local114);
					local16 |= local119.method781(local114);
					local22 |= local119.method780(local114);
				}
			}
			if (local18) {
				local7 = 2208;
			}
			if (local16) {
				local7 |= 0x100;
			}
			if (local20) {
				local7 |= 0x200;
			}
			if (local22) {
				local7 |= 0x400;
			}
		}
		@Pc(189) long local189 = (long) arg3 | (long) arg6 << 32 | (long) (arg0 << 16);
		@Pc(191) Class137 local191 = Static264.aClass137_46;
		@Pc(199) Class116 local199;
		synchronized (Static264.aClass137_46) {
			local199 = (Class116) Static264.aClass137_46.method2744(local189);
		}
		if (local199 == null || arg5.method5356(local199.P(), local7) != 0) {
			if (local199 != null) {
				local7 = arg5.method5399(local7, local199.P());
			}
			@Pc(229) Class166[] local229 = new Class166[3];
			local106 = 0;
			if (!arg1.method1965(arg3).method473() || !arg1.method1965(arg0).method473() || !arg1.method1965(arg6).method473()) {
				return null;
			}
			@Pc(259) Class166 local259 = arg1.method1965(arg3).method470();
			if (local259 != null) {
				local106++;
				local229[0] = local259;
			}
			local259 = arg1.method1965(arg0).method470();
			if (local259 != null) {
				local229[local106++] = local259;
			}
			local259 = arg1.method1965(arg6).method470();
			if (local259 != null) {
				local229[local106++] = local259;
			}
			@Pc(298) int local298 = local7 | 0x4000;
			local259 = new Class166(local229, local106);
			local199 = arg5.method5391(local259, local298, Static440.anInt7328, 64, 768);
			for (@Pc(314) int local314 = 0; local314 < 5; local314++) {
				if (this.anIntArray122[local314] < Static180.aShortArrayArray3[local314].length) {
					local199.BA(Static276.aShortArray84[local314], Static180.aShortArrayArray3[local314][this.anIntArray122[local314]]);
				}
				if (Static155.aShortArrayArray2[local314].length > this.anIntArray122[local314]) {
					local199.BA(Static34.aShortArray30[local314], Static155.aShortArrayArray2[local314][this.anIntArray122[local314]]);
				}
			}
			local199.UA(local7);
			@Pc(369) Class137 local369 = Static264.aClass137_46;
			synchronized (Static264.aClass137_46) {
				Static264.aClass137_46.method2732(local189, local199);
			}
		}
		if (arg4 == null) {
			return local199;
		} else {
			local199 = local199.method3123((byte) 4, local7, true);
			return arg4.method2288(arg2, local199, arg7, arg9, 2048);
		}
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(III)V")
	public void method1331(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anIntArray122[arg0] = arg1;
		this.method1334();
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(IBIZ[I[I)V")
	public void method1332(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int[] arg3, @OriginalArg(5) int[] arg4) {
		this.anInt1637 = arg0;
		this.aBoolean109 = arg2;
		this.anIntArray123 = arg4;
		this.anIntArray122 = arg3;
		if (this.anInt1639 != arg1) {
			this.anIntArrayArray19 = null;
			this.anInt1639 = arg1;
		}
		this.method1334();
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(IILclient!gq;B)V")
	public void method1333(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class101 arg2) {
		@Pc(7) int local7 = Static310.anIntArray407[arg1];
		if (this.anIntArray123[local7] != 0 && arg2.method1965(arg0) != null) {
			this.anIntArray123[local7] = Integer.MIN_VALUE | arg0;
			this.method1334();
		}
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(B)V")
	private void method1334() {
		this.aLong51 = -1L;
		@Pc(14) long[] local14 = Class8_Sub2_Sub3.aLongArray7;
		this.aLong51 = this.aLong51 >>> 8 ^ local14[(int) ((this.aLong51 ^ (long) (this.anInt1639 >> 8)) & 0xFFL)];
		this.aLong51 = local14[(int) (((long) this.anInt1639 ^ this.aLong51) & 0xFFL)] ^ this.aLong51 >>> 8;
		for (@Pc(54) int local54 = 0; local54 < 12; local54++) {
			this.aLong51 = local14[(int) (((long) (this.anIntArray123[local54] >> 24) ^ this.aLong51) & 0xFFL)] ^ this.aLong51 >>> 8;
			this.aLong51 = local14[(int) (((long) (this.anIntArray123[local54] >> 16) ^ this.aLong51) & 0xFFL)] ^ this.aLong51 >>> 8;
			this.aLong51 = this.aLong51 >>> 8 ^ local14[(int) (((long) (this.anIntArray123[local54] >> 8) ^ this.aLong51) & 0xFFL)];
			this.aLong51 = local14[(int) ((this.aLong51 ^ (long) this.anIntArray123[local54]) & 0xFFL)] ^ this.aLong51 >>> 8;
		}
		for (@Pc(148) int local148 = 0; local148 < 5; local148++) {
			this.aLong51 = local14[(int) ((this.aLong51 ^ (long) this.anIntArray122[local148]) & 0xFFL)] ^ this.aLong51 >>> 8;
		}
		this.aLong51 = this.aLong51 >>> 8 ^ local14[(int) ((this.aLong51 ^ (long) (this.aBoolean109 ? 1 : 0)) & 0xFFL)];
	}
}
