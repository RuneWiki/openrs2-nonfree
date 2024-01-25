import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tq")
public final class Class200 {

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "[I")
	private int[] anIntArray468;

	@OriginalMember(owner = "client!tq", name = "d", descriptor = "J")
	private long aLong200;

	@OriginalMember(owner = "client!tq", name = "f", descriptor = "J")
	private long aLong201;

	@OriginalMember(owner = "client!tq", name = "g", descriptor = "Z")
	public boolean aBoolean450;

	@OriginalMember(owner = "client!tq", name = "o", descriptor = "[[I")
	private int[][] anIntArrayArray68;

	@OriginalMember(owner = "client!tq", name = "q", descriptor = "[I")
	public int[] anIntArray469;

	@OriginalMember(owner = "client!tq", name = "s", descriptor = "I")
	private int anInt6036;

	@OriginalMember(owner = "client!tq", name = "b", descriptor = "I")
	public int anInt6027 = -1;

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(ZLclient!tp;Lclient!tp;IILclient!fp;II[Lclient!pn;ILclient!wj;III)Lclient!bi;")
	public Class3 method5419(@OriginalArg(1) Class199 arg0, @OriginalArg(2) Class199 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class63 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) Class163[] arg7, @OriginalArg(9) int arg8, @OriginalArg(10) Class220 arg9, @OriginalArg(12) int arg10, @OriginalArg(13) int arg11) {
		if (this.anInt6027 != -1) {
			return Static139.method2817(this.anInt6027).method5543(arg0, arg6, arg7, arg10, arg4, arg8, arg3, arg1, arg11, arg5, arg2);
		}
		@Pc(29) int local29 = arg10;
		@Pc(32) long local32 = this.aLong200;
		@Pc(35) int[] local35 = this.anIntArray468;
		if (arg1 != null && (arg1.anInt6012 >= 0 || arg1.anInt6008 >= 0)) {
			local35 = new int[12];
			for (@Pc(48) int local48 = 0; local48 < 12; local48++) {
				local35[local48] = this.anIntArray468[local48];
			}
			if (arg1.anInt6012 >= 0) {
				if (arg1.anInt6012 == 65535) {
					local35[5] = 0;
					local32 ^= 0xFFFFFFFF00000000L;
				} else {
					local35[5] = arg1.anInt6012 | 0x40000000;
					local32 ^= (long) local35[5] << 32;
				}
			}
			if (arg1.anInt6008 >= 0) {
				if (arg1.anInt6008 == 65535) {
					local35[3] = 0;
					local32 ^= 0xFFFFFFFFL;
				} else {
					local35[3] = arg1.anInt6008 | 0x40000000;
					local32 ^= local35[3];
				}
			}
		}
		@Pc(136) boolean local136 = false;
		@Pc(138) boolean local138 = false;
		@Pc(146) boolean local146 = arg1 != null || arg0 != null;
		@Pc(153) int local153 = arg7 == null ? 0 : arg7.length;
		@Pc(186) int local186;
		@Pc(191) int local191;
		for (@Pc(155) int local155 = 0; local155 < local153; local155++) {
			Static353.aClass1_Sub4_Sub20Array3[local155] = null;
			if (arg7[local155] != null) {
				@Pc(172) Class199 local172 = Static161.method3066(arg7[local155].anInt5050);
				if (local172.anIntArray467 != null) {
					Static69.aClass199Array1[local155] = local172;
					local146 = true;
					local186 = arg7[local155].anInt5055;
					local191 = arg7[local155].anInt5052;
					@Pc(196) int local196 = local172.anIntArray467[local186];
					Static353.aClass1_Sub4_Sub20Array3[local155] = Static156.method2960(local196 >>> 16);
					@Pc(208) int local208 = local196 & 0xFFFF;
					Static249.anIntArray4[local155] = local208;
					if (Static353.aClass1_Sub4_Sub20Array3[local155] != null) {
						local138 |= Static353.aClass1_Sub4_Sub20Array3[local155].method4029(local208);
						local136 |= Static353.aClass1_Sub4_Sub20Array3[local155].method4032(local208);
					}
					if ((local172.aBoolean446 || Static21.aBoolean29) && local191 != -1 && local191 < local172.anIntArray467.length) {
						Static30.anIntArray48[local155] = local172.anIntArray466[local186];
						Static156.anIntArray238[local155] = arg7[local155].anInt5053;
						@Pc(287) int local287 = local172.anIntArray467[local191];
						Static360.aClass1_Sub4_Sub20Array6[local155] = Static156.method2960(local287 >>> 16);
						@Pc(299) int local299 = local287 & 0xFFFF;
						Static282.anIntArray421[local155] = local299;
						if (Static360.aClass1_Sub4_Sub20Array6[local155] != null) {
							local138 |= Static360.aClass1_Sub4_Sub20Array6[local155].method4029(local299);
							local136 |= Static360.aClass1_Sub4_Sub20Array6[local155].method4032(local299);
						}
					} else {
						Static30.anIntArray48[local155] = 0;
						Static156.anIntArray238[local155] = 0;
						Static360.aClass1_Sub4_Sub20Array6[local155] = null;
						Static282.anIntArray421[local155] = -1;
					}
				}
			}
		}
		@Pc(337) int local337 = -1;
		local186 = -1;
		local191 = 0;
		@Pc(343) Class1_Sub4_Sub20 local343 = null;
		@Pc(345) Class1_Sub4_Sub20 local345 = null;
		@Pc(347) int local347 = -1;
		@Pc(349) int local349 = -1;
		@Pc(351) int local351 = 0;
		@Pc(353) Class1_Sub4_Sub20 local353 = null;
		@Pc(355) Class1_Sub4_Sub20 local355 = null;
		if (local146) {
			@Pc(373) int local373;
			@Pc(425) int local425;
			if (arg1 != null) {
				local337 = arg1.anIntArray467[arg6];
				local373 = local337 >>> 16;
				local337 &= 0xFFFF;
				local343 = Static156.method2960(local373);
				if (local343 != null) {
					local138 |= local343.method4029(local337);
					local136 |= local343.method4032(local337);
				}
				if ((arg1.aBoolean446 || Static21.aBoolean29) && arg2 != -1 && arg2 < arg1.anIntArray467.length) {
					local191 = arg1.anIntArray466[arg6];
					local186 = arg1.anIntArray467[arg2];
					local425 = local186 >>> 16;
					local186 &= 0xFFFF;
					local345 = local425 == local373 ? local343 : Static156.method2960(local425);
					if (local345 != null) {
						local138 |= local345.method4029(local186);
						local136 |= local345.method4032(local186);
					}
				}
			}
			local29 = arg10 | 0x20;
			if (arg0 != null) {
				local347 = arg0.anIntArray467[arg11];
				local373 = local347 >>> 16;
				local347 &= 0xFFFF;
				local353 = Static156.method2960(local373);
				if (local353 != null) {
					local138 |= local353.method4029(local347);
					local136 |= local353.method4032(local347);
				}
				if ((arg0.aBoolean446 || Static21.aBoolean29) && arg5 != -1 && arg5 < arg0.anIntArray467.length) {
					local351 = arg0.anIntArray466[arg11];
					local349 = arg0.anIntArray467[arg5];
					local425 = local349 >>> 16;
					local355 = local425 == local373 ? local353 : Static156.method2960(local425);
					local349 &= 0xFFFF;
					if (local355 != null) {
						local138 |= local355.method4029(local349);
						local136 |= local355.method4032(local349);
					}
				}
			}
			if (local138) {
				local29 |= 0x80;
			}
			if (local136) {
				local29 |= 0x100;
			}
		}
		@Pc(579) Class21 local579 = Static362.aClass21_179;
		@Pc(587) Class3 local587;
		synchronized (Static362.aClass21_179) {
			local587 = (Class3) Static362.aClass21_179.method854(local32);
		}
		@Pc(595) Class67 local595 = null;
		if (this.anInt6036 != -1) {
			local595 = Static217.method4010(this.anInt6036);
		}
		@Pc(637) int local637;
		@Pc(643) int local643;
		if (local587 == null || arg4.method4574(local587.method1256(), local29) != 0 || local595 != null && local595.anIntArrayArray18 != null && this.anIntArrayArray68 == null) {
			if (local587 != null) {
				local29 = arg4.method4628(local29, local587.method1256());
			}
			@Pc(635) boolean local635 = false;
			local637 = 0;
			while (true) {
				if (local637 >= 12) {
					if (local635) {
						if (this.aLong201 != -1L) {
							@Pc(696) Class21 local696 = Static362.aClass21_179;
							synchronized (Static362.aClass21_179) {
								local587 = (Class3) Static362.aClass21_179.method854(this.aLong201);
							}
						}
						if (local587 == null || arg4.method4574(local587.method1256(), local29) != 0 || local595 != null && local595.anIntArrayArray18 != null && this.anIntArrayArray68 == null) {
							return null;
						}
					} else {
						@Pc(732) Class41[] local732 = new Class41[12];
						@Pc(740) int local740;
						for (@Pc(734) int local734 = 0; local734 < 12; local734++) {
							local740 = local35[local734];
							@Pc(756) Class41 local756;
							if ((local740 & 0x40000000) != 0) {
								local756 = arg9.method5972(local740 & 0x3FFFFFFF).method900(this.aBoolean450);
								if (local756 != null) {
									local732[local734] = local756;
								}
							} else if ((local740 & Integer.MIN_VALUE) != 0) {
								local756 = Static152.method2917(local740 & 0x3FFFFFFF).method5993();
								if (local756 != null) {
									local732[local734] = local756;
								}
							}
						}
						@Pc(812) int local812;
						if (local595 != null && local595.anIntArrayArray18 != null) {
							for (local740 = 0; local740 < local595.anIntArrayArray18.length; local740++) {
								if (local595.anIntArrayArray18[local740] != null && local732[local740] != null) {
									local812 = local595.anIntArrayArray18[local740][0];
									@Pc(819) int local819 = local595.anIntArrayArray18[local740][1];
									@Pc(826) int local826 = local595.anIntArrayArray18[local740][2];
									@Pc(835) int local835 = local595.anIntArrayArray18[local740][3] << 3;
									@Pc(844) int local844 = local595.anIntArrayArray18[local740][4] << 3;
									@Pc(853) int local853 = local595.anIntArrayArray18[local740][5] << 3;
									if (this.anIntArrayArray68 == null) {
										this.anIntArrayArray68 = new int[local595.anIntArrayArray18.length][];
									}
									if (this.anIntArrayArray68[local740] == null) {
										@Pc(875) int[] local875 = this.anIntArrayArray68[local740] = new int[15];
										if (local835 == 0 && local844 == 0 && local853 == 0) {
											local875[14] = -local826;
											local875[12] = -local812;
											local875[0] = local875[4] = local875[8] = 32768;
											local875[13] = -local819;
										} else {
											@Pc(917) int local917 = Class208.anIntArray478[local835];
											@Pc(921) int local921 = Class208.anIntArray479[local835];
											@Pc(925) int local925 = Class208.anIntArray478[local844];
											@Pc(929) int local929 = Class208.anIntArray479[local844];
											@Pc(933) int local933 = Class208.anIntArray478[local853];
											@Pc(937) int local937 = Class208.anIntArray479[local853];
											@Pc(945) int local945 = local933 * local921 + 16384 >> 15;
											@Pc(953) int local953 = local921 * local937 + 16384 >> 15;
											local875[0] = local925 * local933 + local929 * local953 + 16384 >> 15;
											local875[4] = local933 * local917 + 16384 >> 15;
											local875[2] = local917 * local929 + 16384 >> 15;
											local875[3] = local917 * local937 + 16384 >> 15;
											local875[5] = -local921;
											local875[6] = local925 * local953 + -local929 * local933 + 16384 >> 15;
											local875[1] = local925 * -local937 + local945 * local929 + 16384 >> 15;
											local875[7] = -local929 * -local937 + local945 * local925 + 16384 >> 15;
											local875[8] = local925 * local917 + 16384 >> 15;
											local875[12] = -local826 * local875[6] + -local819 * local875[3] + local875[0] * -local812 + 16384 >> 15;
											local875[14] = local875[2] * -local812 + -local819 * local875[5] + local875[8] * -local826 + 16384 >> 15;
											local875[13] = local875[4] * -local819 + local875[1] * -local812 + local875[7] * -local826 + 16384 >> 15;
										}
										local875[10] = local819;
										local875[11] = local826;
										local875[9] = local812;
									}
									if (local835 != 0 || local844 != 0 || local853 != 0) {
										local732[local740].method1516(local853, local844, local835);
									}
									if (local812 != 0 || local819 != 0 || local826 != 0) {
										local732[local740].method1513(local826, local819, local812);
									}
								}
							}
						}
						@Pc(1202) int local1202 = local29 | 0x2000;
						@Pc(1209) Class41 local1209 = new Class41(local732, local732.length);
						local587 = arg4.method4652(local1209, local1202, Static211.anInt4227, 64, 850);
						for (local812 = 0; local812 < 5; local812++) {
							if (Static217.aShortArrayArray6[local812].length > this.anIntArray469[local812]) {
								local587.method1260(Static123.aShortArray59[local812], Static217.aShortArrayArray6[local812][this.anIntArray469[local812]]);
							}
							if (Static220.aShortArrayArray7[local812].length > this.anIntArray469[local812]) {
								local587.method1260(Static140.aShortArray63[local812], Static220.aShortArrayArray7[local812][this.anIntArray469[local812]]);
							}
						}
						local587.method1270(local29);
						@Pc(1280) Class21 local1280 = Static362.aClass21_179;
						synchronized (Static362.aClass21_179) {
							Static362.aClass21_179.method843(local587, local32);
						}
						this.aLong201 = local32;
					}
					break;
				}
				local643 = local35[local637];
				if ((local643 & 0x40000000) == 0) {
					if ((Integer.MIN_VALUE & local643) != 0 && !Static152.method2917(local643 & 0x3FFFFFFF).method5992()) {
						local635 = true;
					}
				} else if (!arg9.method5972(local643 & 0x3FFFFFFF).method887(this.aBoolean450)) {
					local635 = true;
				}
				local637++;
			}
		}
		@Pc(1302) Class3 local1302 = local587.method1261((byte) 4, local29, true);
		if (!local146) {
			return local1302;
		}
		@Pc(1308) int local1308 = 0;
		local637 = 1;
		while (local153 > local1308) {
			if (Static353.aClass1_Sub4_Sub20Array3[local1308] != null) {
				local1302.method1247(local637, Static156.anIntArray238[local1308] - 1, Static282.anIntArray421[local1308], Static249.anIntArray4[local1308], Static30.anIntArray48[local1308], Static353.aClass1_Sub4_Sub20Array3[local1308], false, Static360.aClass1_Sub4_Sub20Array6[local1308], this.anIntArrayArray68 == null ? null : this.anIntArrayArray68[local1308]);
			}
			local637 <<= 0x1;
			local1308++;
		}
		if (local343 != null && local353 != null) {
			local1302.method1278(false, local349, local186, arg8 - 1, local345, arg1.aBooleanArray29, local355, local353, local343, local351, local347, arg3 - 1, local337, local191);
		} else if (local343 != null) {
			local1302.method1279(local337, local343, local186, arg3 - 1, false, 0, local191, local345);
		} else if (local353 != null) {
			local1302.method1279(local347, local353, local349, arg8 - 1, false, 0, local351, local355);
		}
		for (local643 = 0; local643 < local153; local643++) {
			Static353.aClass1_Sub4_Sub20Array3[local643] = null;
			Static360.aClass1_Sub4_Sub20Array6[local643] = null;
			Static69.aClass199Array1[local643] = null;
		}
		return local1302;
	}

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(BZ)V")
	public void method5420(@OriginalArg(1) boolean arg0) {
		this.aBoolean450 = arg0;
		this.method5421();
	}

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(I)V")
	private void method5421() {
		@Pc(7) long[] local7 = Class64.aLongArray5;
		this.aLong200 = -1L;
		this.aLong200 = local7[(int) (((long) (this.anInt6036 >> 8) ^ this.aLong200) & 0xFFL)] ^ this.aLong200 >>> 8;
		this.aLong200 = this.aLong200 >>> 8 ^ local7[(int) ((this.aLong200 ^ (long) this.anInt6036) & 0xFFL)];
		for (@Pc(59) int local59 = 0; local59 < 12; local59++) {
			this.aLong200 = this.aLong200 >>> 8 ^ local7[(int) ((this.aLong200 ^ (long) (this.anIntArray468[local59] >> 24)) & 0xFFL)];
			this.aLong200 = this.aLong200 >>> 8 ^ local7[(int) ((this.aLong200 ^ (long) (this.anIntArray468[local59] >> 16)) & 0xFFL)];
			this.aLong200 = local7[(int) (((long) (this.anIntArray468[local59] >> 8) ^ this.aLong200) & 0xFFL)] ^ this.aLong200 >>> 8;
			this.aLong200 = this.aLong200 >>> 8 ^ local7[(int) ((this.aLong200 ^ (long) this.anIntArray468[local59]) & 0xFFL)];
		}
		for (@Pc(153) int local153 = 0; local153 < 5; local153++) {
			this.aLong200 = this.aLong200 >>> 8 ^ local7[(int) (((long) this.anIntArray469[local153] ^ this.aLong200) & 0xFFL)];
		}
		this.aLong200 = local7[(int) (((long) (this.aBoolean450 ? 1 : 0) ^ this.aLong200) & 0xFFL)] ^ this.aLong200 >>> 8;
	}

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(ILclient!wj;IILclient!tp;IILclient!fp;)Lclient!bi;")
	public Class3 method5422(@OriginalArg(0) int arg0, @OriginalArg(1) Class220 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Class199 arg3, @OriginalArg(6) int arg4, @OriginalArg(7) Class63 arg5) {
		if (this.anInt6027 != -1) {
			return Static139.method2817(this.anInt6027).method5544(arg3, arg5, arg2, arg4, arg0);
		}
		@Pc(24) int local24 = 1024;
		@Pc(32) boolean local32;
		@Pc(49) int local49;
		@Pc(105) int local105;
		@Pc(53) int local53;
		@Pc(109) int local109;
		if (arg3 != null) {
			@Pc(28) boolean local28 = false;
			@Pc(30) boolean local30 = false;
			local32 = false;
			local24 = 1056;
			local49 = arg3.anIntArray467[arg0];
			local53 = local49 >>> 16;
			@Pc(57) int local57 = local49 & 0xFFFF;
			@Pc(61) Class1_Sub4_Sub20 local61 = Static156.method2960(local53);
			if (local61 != null) {
				local30 = local61.method4029(local57) | false;
				local28 = local61.method4032(local57) | false;
				local32 = arg3.aBoolean448 | false;
			}
			if ((arg3.aBoolean446 || Static21.aBoolean29) && arg2 != -1 && arg2 < arg3.anIntArray467.length) {
				local105 = arg3.anIntArray467[arg2];
				local109 = local105 >>> 16;
				@Pc(122) Class1_Sub4_Sub20 local122 = local53 == local109 ? local61 : Static156.method2960(local109);
				@Pc(126) int local126 = local105 & 0xFFFF;
				if (local122 != null) {
					local30 |= local122.method4029(local126);
					local28 |= local122.method4032(local126);
				}
			}
			if (local30) {
				local24 = 1184;
			}
			if (local28) {
				local24 |= 0x100;
			}
			if (local32) {
				local24 |= 0x200;
			}
		}
		@Pc(162) Class21 local162 = Static266.aClass21_141;
		@Pc(171) Class3 local171;
		synchronized (Static266.aClass21_141) {
			local171 = (Class3) Static266.aClass21_141.method854(this.aLong200);
		}
		if (local171 == null || arg5.method4574(local171.method1256(), local24) != 0) {
			if (local171 != null) {
				local24 = arg5.method4628(local24, local171.method1256());
			}
			local32 = false;
			for (local49 = 0; local49 < 12; local49++) {
				local105 = this.anIntArray468[local49];
				if ((local105 & 0x40000000) == 0) {
					if ((Integer.MIN_VALUE & local105) != 0 && !Static152.method2917(local105 & 0x3FFFFFFF).method5991()) {
						local32 = true;
					}
				} else if (!arg1.method5972(local105 & 0x3FFFFFFF).method885(this.aBoolean450)) {
					local32 = true;
				}
			}
			if (local32) {
				return null;
			}
			@Pc(259) Class41[] local259 = new Class41[12];
			@Pc(261) int local261 = 0;
			for (@Pc(263) int local263 = 0; local263 < 12; local263++) {
				local53 = this.anIntArray468[local263];
				@Pc(292) Class41 local292;
				if ((local53 & 0x40000000) != 0) {
					local292 = arg1.method5972(local53 & 0x3FFFFFFF).method895(this.aBoolean450);
					if (local292 != null) {
						local259[local261++] = local292;
					}
				} else if ((local53 & Integer.MIN_VALUE) != 0) {
					local292 = Static152.method2917(local53 & 0x3FFFFFFF).method5986();
					if (local292 != null) {
						local259[local261++] = local292;
					}
				}
			}
			@Pc(329) int local329 = local24 | 0x2000;
			@Pc(335) Class41 local335 = new Class41(local259, local261);
			local171 = arg5.method4652(local335, local329, Static211.anInt4227, 64, 768);
			for (local109 = 0; local109 < 5; local109++) {
				if (Static217.aShortArrayArray6[local109].length > this.anIntArray469[local109]) {
					local171.method1260(Static123.aShortArray59[local109], Static217.aShortArrayArray6[local109][this.anIntArray469[local109]]);
				}
				if (Static220.aShortArrayArray7[local109].length > this.anIntArray469[local109]) {
					local171.method1260(Static140.aShortArray63[local109], Static220.aShortArrayArray7[local109][this.anIntArray469[local109]]);
				}
			}
			local171.method1270(local24);
			@Pc(404) Class21 local404 = Static266.aClass21_141;
			synchronized (Static266.aClass21_141) {
				Static266.aClass21_141.method843(local171, this.aLong200);
			}
		}
		if (arg3 == null) {
			return local171;
		} else {
			local171.method1261((byte) 4, local24, true);
			return arg3.method5407(arg4, arg2, local171, arg0, 1024);
		}
	}

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(ZII[I[II)V")
	public void method5423(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int[] arg3, @OriginalArg(5) int arg4) {
		this.aBoolean450 = arg0;
		if (this.anInt6036 != arg4) {
			this.anInt6036 = arg4;
			this.anIntArrayArray68 = null;
		}
		this.anIntArray469 = arg3;
		this.anIntArray468 = arg2;
		this.anInt6027 = arg1;
		this.method5421();
	}

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(ILclient!fp;IIIILclient!tp;III)Lclient!bi;")
	public Class3 method5424(@OriginalArg(1) Class63 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) Class199 arg4, @OriginalArg(7) int arg5, @OriginalArg(8) int arg6, @OriginalArg(9) int arg7) {
		@Pc(7) int local7 = 1024;
		@Pc(32) int local32;
		@Pc(36) int local36;
		if (arg4 != null) {
			@Pc(11) boolean local11 = false;
			@Pc(13) boolean local13 = false;
			@Pc(15) boolean local15 = false;
			local7 = 1056;
			local32 = arg4.anIntArray467[arg1];
			local36 = local32 >>> 16;
			@Pc(40) int local40 = local32 & 0xFFFF;
			@Pc(44) Class1_Sub4_Sub20 local44 = Static156.method2960(local36);
			if (local44 != null) {
				local13 = local44.method4029(local40) | false;
				local11 = local44.method4032(local40) | false;
				local15 = arg4.aBoolean448 | false;
			}
			if ((arg4.aBoolean446 || Static21.aBoolean29) && arg6 != -1 && arg6 < arg4.anIntArray467.length) {
				@Pc(83) int local83 = arg4.anIntArray467[arg6];
				@Pc(87) int local87 = local83 >>> 16;
				@Pc(91) int local91 = local83 & 0xFFFF;
				@Pc(96) Class1_Sub4_Sub20 local96;
				if (local36 == local87) {
					local96 = local44;
				} else {
					local96 = Static156.method2960(local91 >>> 16);
				}
				if (local96 != null) {
					local13 |= local96.method4029(local91);
					local11 |= local96.method4032(local91);
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
		@Pc(150) long local150 = (long) arg2 | (long) arg5 << 32 | (long) (arg7 << 16);
		@Pc(152) Class21 local152 = Static266.aClass21_141;
		@Pc(160) Class3 local160;
		synchronized (Static266.aClass21_141) {
			local160 = (Class3) Static266.aClass21_141.method854(local150);
		}
		if (local160 == null || arg0.method4574(local160.method1256(), local7) != 0) {
			if (local160 != null) {
				local7 = arg0.method4628(local7, local160.method1256());
			}
			@Pc(187) Class41[] local187 = new Class41[3];
			@Pc(189) int local189 = 0;
			if (!Static152.method2917(arg2).method5991() || !Static152.method2917(arg7).method5991() || !Static152.method2917(arg5).method5991()) {
				return null;
			}
			@Pc(215) Class41 local215 = Static152.method2917(arg2).method5986();
			if (local215 != null) {
				local189++;
				local187[0] = local215;
			}
			local215 = Static152.method2917(arg7).method5986();
			if (local215 != null) {
				local187[local189++] = local215;
			}
			local215 = Static152.method2917(arg5).method5986();
			if (local215 != null) {
				local187[local189++] = local215;
			}
			local215 = new Class41(local187, local189);
			local32 = local7 | 0x2000;
			local160 = arg0.method4652(local215, local32, Static211.anInt4227, 64, 768);
			for (local36 = 0; local36 < 5; local36++) {
				if (this.anIntArray469[local36] < Static217.aShortArrayArray6[local36].length) {
					local160.method1260(Static123.aShortArray59[local36], Static217.aShortArrayArray6[local36][this.anIntArray469[local36]]);
				}
				if (Static220.aShortArrayArray7[local36].length > this.anIntArray469[local36]) {
					local160.method1260(Static140.aShortArray63[local36], Static220.aShortArrayArray7[local36][this.anIntArray469[local36]]);
				}
			}
			local160.method1270(local7);
			@Pc(331) Class21 local331 = Static266.aClass21_141;
			synchronized (Static266.aClass21_141) {
				Static266.aClass21_141.method843(local160, local150);
			}
		}
		if (arg4 == null) {
			return local160;
		} else {
			local160 = local160.method1261((byte) 4, local7, true);
			return arg4.method5407(arg3, arg6, local160, arg1, 1024);
		}
	}

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(IIB)V")
	public void method5427(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = Static139.anIntArray226[arg1];
		if (this.anIntArray468[local12] != 0 && Static152.method2917(arg0) != null) {
			this.anIntArray468[local12] = arg0 | Integer.MIN_VALUE;
			this.method5421();
		}
	}

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(III)V")
	public void method5428(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anIntArray469[arg1] = arg0;
		this.method5421();
	}
}
