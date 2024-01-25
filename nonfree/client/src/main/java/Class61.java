import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eq")
public final class Class61 {

	@OriginalMember(owner = "client!eq", name = "b", descriptor = "J")
	private long aLong61;

	@OriginalMember(owner = "client!eq", name = "f", descriptor = "[I")
	private int[] anIntArray99;

	@OriginalMember(owner = "client!eq", name = "g", descriptor = "[[I")
	private int[][] anIntArrayArray11;

	@OriginalMember(owner = "client!eq", name = "i", descriptor = "I")
	private int anInt1845;

	@OriginalMember(owner = "client!eq", name = "l", descriptor = "J")
	private long aLong62;

	@OriginalMember(owner = "client!eq", name = "o", descriptor = "Z")
	public boolean aBoolean124;

	@OriginalMember(owner = "client!eq", name = "t", descriptor = "[I")
	public int[] anIntArray101;

	@OriginalMember(owner = "client!eq", name = "u", descriptor = "I")
	public int anInt1853 = -1;

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(III)V")
	public void method1709(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray101[arg0] = arg1;
		this.method1713();
	}

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(BIIIILclient!en;Lclient!bb;)Lclient!mj;")
	public Class101 method1712(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) Class59 arg3, @OriginalArg(6) Class17 arg4) {
		if (this.anInt1853 != -1) {
			return Static2.method5(this.anInt1853).method5774(arg4, arg0, arg2, arg1, arg3);
		}
		@Pc(32) int local32 = 1024;
		@Pc(40) boolean local40;
		@Pc(57) int local57;
		@Pc(108) int local108;
		@Pc(61) int local61;
		@Pc(112) int local112;
		if (arg4 != null) {
			@Pc(36) boolean local36 = false;
			@Pc(38) boolean local38 = false;
			local40 = false;
			local32 = 1056;
			local57 = arg4.anIntArray24[arg0];
			local61 = local57 >>> 16;
			@Pc(65) int local65 = local57 & 0xFFFF;
			@Pc(69) Class5_Sub9_Sub11 local69 = Static12.method396(local61);
			if (local69 != null) {
				local38 = local69.method2616(local65) | false;
				local36 = local69.method2610(local65) | false;
				local40 = arg4.aBoolean35 | false;
			}
			if ((arg4.aBoolean34 || Static353.aBoolean489) && arg2 != -1 && arg2 < arg4.anIntArray24.length) {
				local108 = arg4.anIntArray24[arg2];
				local112 = local108 >>> 16;
				@Pc(116) int local116 = local108 & 0xFFFF;
				@Pc(129) Class5_Sub9_Sub11 local129;
				if (local112 == local61) {
					local129 = local69;
				} else {
					local129 = Static12.method396(local116 >>> 16);
				}
				if (local129 != null) {
					local38 |= local129.method2616(local116);
					local36 |= local129.method2610(local116);
				}
			}
			if (local38) {
				local32 = 1184;
			}
			if (local36) {
				local32 |= 0x100;
			}
			if (local40) {
				local32 |= 0x200;
			}
		}
		@Pc(168) Class66 local168 = Static162.aClass66_58;
		@Pc(177) Class101 local177;
		synchronized (Static162.aClass66_58) {
			local177 = (Class101) Static162.aClass66_58.method1939(this.aLong62);
		}
		if (local177 == null || arg3.method4792(local177.method5171(), local32) != 0) {
			if (local177 != null) {
				local32 = arg3.method4843(local32, local177.method5171());
			}
			local40 = false;
			for (local57 = 0; local57 < 12; local57++) {
				local108 = this.anIntArray99[local57];
				if ((local108 & 0x40000000) == 0) {
					if ((local108 & Integer.MIN_VALUE) != 0 && !Static173.method3934(local108 & 0x3FFFFFFF).method864()) {
						local40 = true;
					}
				} else if (!Static88.method1382(local108 & 0x3FFFFFFF).method4414(this.aBoolean124)) {
					local40 = true;
				}
			}
			if (local40) {
				return null;
			}
			@Pc(265) Class150[] local265 = new Class150[12];
			@Pc(267) int local267 = 0;
			for (@Pc(269) int local269 = 0; local269 < 12; local269++) {
				local61 = this.anIntArray99[local269];
				@Pc(292) Class150 local292;
				if ((local61 & 0x40000000) != 0) {
					local292 = Static88.method1382(local61 & 0x3FFFFFFF).method4424(this.aBoolean124);
					if (local292 != null) {
						local265[local267++] = local292;
					}
				} else if ((local61 & Integer.MIN_VALUE) != 0) {
					local292 = Static173.method3934(local61 & 0x3FFFFFFF).method866();
					if (local292 != null) {
						local265[local267++] = local292;
					}
				}
			}
			@Pc(328) Class150 local328 = new Class150(local265, local267);
			@Pc(332) int local332 = local32 | 0x2000;
			local177 = arg3.method4804(local328, local332, Static233.anInt4553, 64, 768);
			for (local112 = 0; local112 < 5; local112++) {
				if (this.anIntArray101[local112] < Static165.aShortArrayArray9[local112].length) {
					local177.method5159(Static202.aShortArray47[local112], Static165.aShortArrayArray9[local112][this.anIntArray101[local112]]);
				}
				if (Static336.aShortArrayArray13[local112].length > this.anIntArray101[local112]) {
					local177.method5159(Static306.aShortArray99[local112], Static336.aShortArrayArray13[local112][this.anIntArray101[local112]]);
				}
			}
			local177.method5145(local32);
			@Pc(401) Class66 local401 = Static162.aClass66_58;
			synchronized (Static162.aClass66_58) {
				Static162.aClass66_58.method1936(this.aLong62, local177);
			}
		}
		if (arg4 == null) {
			return local177;
		} else {
			local177.method5184((byte) 1, local32, true);
			return arg4.method528(1024, arg1, local177, arg0, arg2);
		}
	}

	@OriginalMember(owner = "client!eq", name = "b", descriptor = "(I)V")
	private void method1713() {
		@Pc(7) long[] local7 = Class42.aLongArray1;
		this.aLong62 = -1L;
		this.aLong62 = this.aLong62 >>> 8 ^ local7[(int) (((long) (this.anInt1845 >> 8) ^ this.aLong62) & 0xFFL)];
		this.aLong62 = local7[(int) ((this.aLong62 ^ (long) this.anInt1845) & 0xFFL)] ^ this.aLong62 >>> 8;
		for (@Pc(55) int local55 = 0; local55 < 12; local55++) {
			this.aLong62 = local7[(int) (((long) (this.anIntArray99[local55] >> 24) ^ this.aLong62) & 0xFFL)] ^ this.aLong62 >>> 8;
			this.aLong62 = this.aLong62 >>> 8 ^ local7[(int) (((long) (this.anIntArray99[local55] >> 16) ^ this.aLong62) & 0xFFL)];
			this.aLong62 = local7[(int) (((long) (this.anIntArray99[local55] >> 8) ^ this.aLong62) & 0xFFL)] ^ this.aLong62 >>> 8;
			this.aLong62 = this.aLong62 >>> 8 ^ local7[(int) ((this.aLong62 ^ (long) this.anIntArray99[local55]) & 0xFFL)];
		}
		for (@Pc(149) int local149 = 0; local149 < 5; local149++) {
			this.aLong62 = this.aLong62 >>> 8 ^ local7[(int) ((this.aLong62 ^ (long) this.anIntArray101[local149]) & 0xFFL)];
		}
		this.aLong62 = this.aLong62 >>> 8 ^ local7[(int) ((this.aLong62 ^ (long) (this.aBoolean124 ? 1 : 0)) & 0xFFL)];
	}

	@OriginalMember(owner = "client!eq", name = "b", descriptor = "(III)V")
	public void method1714(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = Static272.anIntArray396[arg0];
		if (this.anIntArray99[local7] != 0 && Static173.method3934(arg1) != null) {
			this.anIntArray99[local7] = Integer.MIN_VALUE | arg1;
			this.method1713();
		}
	}

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(Lclient!bb;II[Lclient!ok;IIIILclient!bb;IZBLclient!en;)Lclient!mj;")
	public Class101 method1715(@OriginalArg(0) Class17 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class146[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) Class17 arg8, @OriginalArg(9) int arg9, @OriginalArg(12) Class59 arg10) {
		if (this.anInt1853 != -1) {
			return Static2.method5(this.anInt1853).method5769(arg2, arg3, arg5, arg6, arg4, arg9, arg7, arg10, arg0, arg1, arg8);
		}
		@Pc(30) int local30 = arg5;
		@Pc(38) long local38 = this.aLong62;
		@Pc(41) int[] local41 = this.anIntArray99;
		if (arg0 != null && (arg0.anInt510 >= 0 || arg0.anInt514 >= 0)) {
			local41 = new int[12];
			for (@Pc(57) int local57 = 0; local57 < 12; local57++) {
				local41[local57] = this.anIntArray99[local57];
			}
			if (arg0.anInt510 >= 0) {
				if (arg0.anInt510 == 65535) {
					local41[5] = 0;
					local38 ^= 0xFFFFFFFF00000000L;
				} else {
					local41[5] = arg0.anInt510 | 0x40000000;
					local38 ^= (long) local41[5] << 32;
				}
			}
			if (arg0.anInt514 >= 0) {
				if (arg0.anInt514 == 65535) {
					local41[3] = 0;
					local38 ^= 0xFFFFFFFFL;
				} else {
					local41[3] = arg0.anInt514 | 0x40000000;
					local38 ^= local41[3];
				}
			}
		}
		@Pc(141) boolean local141 = false;
		@Pc(143) boolean local143 = false;
		@Pc(151) boolean local151 = arg0 != null || arg8 != null;
		@Pc(158) int local158 = arg3 == null ? 0 : arg3.length;
		@Pc(191) int local191;
		@Pc(196) int local196;
		for (@Pc(160) int local160 = 0; local160 < local158; local160++) {
			Static199.aClass5_Sub9_Sub11Array5[local160] = null;
			if (arg3[local160] != null) {
				@Pc(177) Class17 local177 = Static261.method4492(arg3[local160].anInt4452);
				if (local177.anIntArray24 != null) {
					Static312.aClass17Array1[local160] = local177;
					local151 = true;
					local191 = arg3[local160].anInt4448;
					local196 = arg3[local160].anInt4454;
					@Pc(201) int local201 = local177.anIntArray24[local191];
					Static199.aClass5_Sub9_Sub11Array5[local160] = Static12.method396(local201 >>> 16);
					@Pc(213) int local213 = local201 & 0xFFFF;
					Static83.anIntArray116[local160] = local213;
					if (Static199.aClass5_Sub9_Sub11Array5[local160] != null) {
						local143 |= Static199.aClass5_Sub9_Sub11Array5[local160].method2616(local213);
						local141 |= Static199.aClass5_Sub9_Sub11Array5[local160].method2610(local213);
					}
					if ((local177.aBoolean34 || Static353.aBoolean489) && local196 != -1 && local196 < local177.anIntArray24.length) {
						Static120.anIntArray154[local160] = local177.anIntArray26[local191];
						Static330.anIntArray120[local160] = arg3[local160].anInt4456;
						@Pc(289) int local289 = local177.anIntArray24[local196];
						Static176.aClass5_Sub9_Sub11Array2[local160] = Static12.method396(local289 >>> 16);
						@Pc(301) int local301 = local289 & 0xFFFF;
						Static314.anIntArray512[local160] = local301;
						if (Static176.aClass5_Sub9_Sub11Array2[local160] != null) {
							local143 |= Static176.aClass5_Sub9_Sub11Array2[local160].method2616(local301);
							local141 |= Static176.aClass5_Sub9_Sub11Array2[local160].method2610(local301);
						}
					} else {
						Static120.anIntArray154[local160] = 0;
						Static330.anIntArray120[local160] = 0;
						Static176.aClass5_Sub9_Sub11Array2[local160] = null;
						Static314.anIntArray512[local160] = -1;
					}
				}
			}
		}
		@Pc(333) int local333 = -1;
		local191 = -1;
		local196 = 0;
		@Pc(339) Class5_Sub9_Sub11 local339 = null;
		@Pc(341) Class5_Sub9_Sub11 local341 = null;
		@Pc(343) int local343 = -1;
		@Pc(345) int local345 = -1;
		@Pc(347) int local347 = 0;
		@Pc(349) Class5_Sub9_Sub11 local349 = null;
		@Pc(351) Class5_Sub9_Sub11 local351 = null;
		if (local151) {
			local30 = arg5 | 0x20;
			@Pc(368) int local368;
			@Pc(424) int local424;
			if (arg0 != null) {
				local333 = arg0.anIntArray24[arg7];
				local368 = local333 >>> 16;
				local339 = Static12.method396(local368);
				local333 &= 0xFFFF;
				if (local339 != null) {
					local143 |= local339.method2616(local333);
					local141 |= local339.method2610(local333);
				}
				if ((arg0.aBoolean34 || Static353.aBoolean489) && arg1 != -1 && arg0.anIntArray24.length > arg1) {
					local191 = arg0.anIntArray24[arg1];
					local196 = arg0.anIntArray26[arg7];
					local424 = local191 >>> 16;
					local191 &= 0xFFFF;
					if (local424 == local368) {
						local341 = local339;
					} else {
						local341 = Static12.method396(local191 >>> 16);
					}
					if (local341 != null) {
						local143 |= local341.method2616(local191);
						local141 |= local341.method2610(local191);
					}
				}
			}
			if (arg8 != null) {
				local343 = arg8.anIntArray24[arg6];
				local368 = local343 >>> 16;
				local343 &= 0xFFFF;
				local349 = Static12.method396(local368);
				if (local349 != null) {
					local143 |= local349.method2616(local343);
					local141 |= local349.method2610(local343);
				}
				if ((arg8.aBoolean34 || Static353.aBoolean489) && arg4 != -1 && arg4 < arg8.anIntArray24.length) {
					local347 = arg8.anIntArray26[arg6];
					local345 = arg8.anIntArray24[arg4];
					local424 = local345 >>> 16;
					local345 &= 0xFFFF;
					if (local424 == local368) {
						local351 = local349;
					} else {
						local351 = Static12.method396(local345 >>> 16);
					}
					if (local351 != null) {
						local143 |= local351.method2616(local345);
						local141 |= local351.method2610(local345);
					}
				}
			}
			if (local143) {
				local30 |= 0x80;
			}
			if (local141) {
				local30 |= 0x100;
			}
		}
		@Pc(572) Class66 local572 = Static177.aClass66_38;
		@Pc(580) Class101 local580;
		synchronized (Static177.aClass66_38) {
			local580 = (Class101) Static177.aClass66_38.method1939(local38);
		}
		@Pc(588) Class33 local588 = null;
		if (this.anInt1845 != -1) {
			local588 = Static104.method2066(this.anInt1845);
		}
		@Pc(631) int local631;
		@Pc(637) int local637;
		if (local580 == null || arg10.method4792(local580.method5171(), local30) != 0 || local588 != null && local588.anIntArrayArray5 != null && this.anIntArrayArray11 == null) {
			if (local580 != null) {
				local30 = arg10.method4843(local30, local580.method5171());
			}
			@Pc(629) boolean local629 = false;
			local631 = 0;
			while (true) {
				if (local631 >= 12) {
					if (local629) {
						if (this.aLong61 != -1L) {
							@Pc(1270) Class66 local1270 = Static177.aClass66_38;
							synchronized (Static177.aClass66_38) {
								local580 = (Class101) Static177.aClass66_38.method1939(this.aLong61);
							}
						}
						if (local580 == null || arg10.method4792(local580.method5171(), local30) != 0 || local588 != null && local588.anIntArrayArray5 != null && this.anIntArrayArray11 == null) {
							return null;
						}
					} else {
						@Pc(681) Class150[] local681 = new Class150[12];
						@Pc(689) int local689;
						for (@Pc(683) int local683 = 0; local683 < 12; local683++) {
							local689 = local41[local683];
							@Pc(706) Class150 local706;
							if ((local689 & 0x40000000) != 0) {
								local706 = Static88.method1382(local689 & 0x3FFFFFFF).method4429(this.aBoolean124);
								if (local706 != null) {
									local681[local683] = local706;
								}
							} else if ((Integer.MIN_VALUE & local689) != 0) {
								local706 = Static173.method3934(local689 & 0x3FFFFFFF).method872();
								if (local706 != null) {
									local681[local683] = local706;
								}
							}
						}
						@Pc(766) int local766;
						if (local588 != null && local588.anIntArrayArray5 != null) {
							for (local689 = 0; local689 < local588.anIntArrayArray5.length; local689++) {
								if (local588.anIntArrayArray5[local689] != null && local681[local689] != null) {
									local766 = local588.anIntArrayArray5[local689][0];
									@Pc(773) int local773 = local588.anIntArrayArray5[local689][1];
									@Pc(780) int local780 = local588.anIntArrayArray5[local689][2];
									@Pc(789) int local789 = local588.anIntArrayArray5[local689][3] << 3;
									@Pc(798) int local798 = local588.anIntArrayArray5[local689][4] << 3;
									@Pc(807) int local807 = local588.anIntArrayArray5[local689][5] << 3;
									if (this.anIntArrayArray11 == null) {
										this.anIntArrayArray11 = new int[local588.anIntArrayArray5.length][];
									}
									if (this.anIntArrayArray11[local689] == null) {
										@Pc(829) int[] local829 = this.anIntArrayArray11[local689] = new int[15];
										if (local789 == 0 && local798 == 0 && local807 == 0) {
											local829[14] = -local780;
											local829[13] = -local773;
											local829[12] = -local766;
											local829[0] = local829[4] = local829[8] = 32768;
										} else {
											@Pc(874) int local874 = Class5_Sub9_Sub12.anIntArray170[local789];
											@Pc(878) int local878 = Class5_Sub9_Sub12.anIntArray169[local789];
											@Pc(882) int local882 = Class5_Sub9_Sub12.anIntArray170[local798];
											@Pc(886) int local886 = Class5_Sub9_Sub12.anIntArray169[local798];
											@Pc(890) int local890 = Class5_Sub9_Sub12.anIntArray170[local807];
											@Pc(894) int local894 = Class5_Sub9_Sub12.anIntArray169[local807];
											@Pc(902) int local902 = local890 * local878 + 16384 >> 15;
											@Pc(910) int local910 = local894 * local878 + 16384 >> 15;
											local829[4] = local874 * local890 + 16384 >> 15;
											local829[2] = local886 * local874 + 16384 >> 15;
											local829[8] = local874 * local882 + 16384 >> 15;
											local829[0] = local890 * local882 + local886 * local910 + 16384 >> 15;
											local829[5] = -local878;
											local829[7] = -local894 * -local886 + local902 * local882 + 16384 >> 15;
											local829[3] = local894 * local874 + 16384 >> 15;
											local829[6] = local890 * -local886 + local910 * local882 + 16384 >> 15;
											local829[1] = local882 * -local894 + local886 * local902 + 16384 >> 15;
											local829[12] = -local773 * local829[3] + local829[0] * -local766 + -local780 * local829[6] + 16384 >> 15;
											local829[13] = local829[4] * -local773 + local829[1] * -local766 + -local780 * local829[7] + 16384 >> 15;
											local829[14] = -local766 * local829[2] + -local773 * local829[5] + -local780 * local829[8] + 16384 >> 15;
										}
										local829[11] = local780;
										local829[9] = local766;
										local829[10] = local773;
									}
									if (local789 != 0 || local798 != 0 || local807 != 0) {
										local681[local689].method3969(local798, local789, local807);
									}
									if (local766 != 0 || local773 != 0 || local780 != 0) {
										local681[local689].method3973(local766, local773, local780);
									}
								}
							}
						}
						@Pc(1164) Class150 local1164 = new Class150(local681, local681.length);
						@Pc(1168) int local1168 = local30 | 0x2000;
						local580 = arg10.method4804(local1164, local1168, Static233.anInt4553, 64, 850);
						for (local766 = 0; local766 < 5; local766++) {
							if (this.anIntArray101[local766] < Static165.aShortArrayArray9[local766].length) {
								local580.method5159(Static202.aShortArray47[local766], Static165.aShortArrayArray9[local766][this.anIntArray101[local766]]);
							}
							if (this.anIntArray101[local766] < Static336.aShortArrayArray13[local766].length) {
								local580.method5159(Static306.aShortArray99[local766], Static336.aShortArrayArray13[local766][this.anIntArray101[local766]]);
							}
						}
						local580.method5145(local30);
						@Pc(1245) Class66 local1245 = Static177.aClass66_38;
						synchronized (Static177.aClass66_38) {
							Static177.aClass66_38.method1936(local38, local580);
						}
						this.aLong61 = local38;
					}
					break;
				}
				local637 = local41[local631];
				if ((local637 & 0x40000000) == 0) {
					if ((Integer.MIN_VALUE & local637) != 0 && !Static173.method3934(local637 & 0x3FFFFFFF).method865()) {
						local629 = true;
					}
				} else if (!Static88.method1382(local637 & 0x3FFFFFFF).method4416(this.aBoolean124)) {
					local629 = true;
				}
				local631++;
			}
		}
		@Pc(1309) Class101 local1309 = local580.method5184((byte) 1, local30, true);
		if (!local151) {
			return local1309;
		}
		@Pc(1315) int local1315 = 0;
		local631 = 1;
		while (local1315 < local158) {
			if (Static199.aClass5_Sub9_Sub11Array5[local1315] != null) {
				local1309.method5155(local631, Static199.aClass5_Sub9_Sub11Array5[local1315], Static314.anIntArray512[local1315], Static120.anIntArray154[local1315], false, Static330.anIntArray120[local1315] - 1, this.anIntArrayArray11 == null ? null : this.anIntArrayArray11[local1315], Static83.anIntArray116[local1315], Static176.aClass5_Sub9_Sub11Array2[local1315]);
			}
			local631 <<= 0x1;
			local1315++;
		}
		if (local339 != null && local349 != null) {
			local1309.method5157(local343, local347, local191, local349, arg9 - 1, local339, local341, local333, arg2 - 1, false, arg0.aBooleanArray1, local196, local345, local351);
		} else if (local339 != null) {
			local1309.method5146(local196, local191, local333, false, local339, arg2 - 1, 0, local341);
		} else if (local349 != null) {
			local1309.method5146(local347, local345, local343, false, local349, arg9 - 1, 0, local351);
		}
		for (local637 = 0; local637 < local158; local637++) {
			Static199.aClass5_Sub9_Sub11Array5[local637] = null;
			Static176.aClass5_Sub9_Sub11Array2[local637] = null;
			Static312.aClass17Array1[local637] = null;
		}
		return local1309;
	}

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(ZB)V")
	public void method1716(@OriginalArg(0) boolean arg0) {
		this.aBoolean124 = arg0;
		this.method1713();
	}

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(Z[II[III)V")
	public void method1717(@OriginalArg(0) boolean arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4) {
		if (this.anInt1845 != arg4) {
			this.anIntArrayArray11 = null;
			this.anInt1845 = arg4;
		}
		if (arg1 == null) {
			arg1 = new int[12];
			for (@Pc(26) int local26 = 0; local26 < 8; local26++) {
				for (@Pc(30) int local30 = 0; local30 < Static19.anInt545; local30++) {
					@Pc(36) Class31 local36 = Static173.method3934(local30);
					if (local36 != null && !local36.aBoolean66 && (arg0 ? Static188.anIntArray276[local26] : Static12.anIntArray13[local26]) == local36.anInt935) {
						arg1[Static272.anIntArray396[local26]] = Integer.MIN_VALUE | local30;
						break;
					}
				}
			}
		}
		this.anIntArray99 = arg1;
		this.anIntArray101 = arg3;
		this.anInt1853 = arg2;
		this.aBoolean124 = arg0;
		this.method1713();
	}

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(IILclient!bb;IIIIILclient!en;I)Lclient!mj;")
	public Class101 method1718(@OriginalArg(0) int arg0, @OriginalArg(2) Class17 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) Class59 arg7) {
		@Pc(13) int local13 = 1024;
		@Pc(32) int local32;
		@Pc(42) int local42;
		if (arg1 != null) {
			@Pc(17) boolean local17 = false;
			@Pc(19) boolean local19 = false;
			@Pc(21) boolean local21 = false;
			local32 = arg1.anIntArray24[arg6];
			local13 = 1056;
			local42 = local32 >>> 16;
			@Pc(46) int local46 = local32 & 0xFFFF;
			@Pc(50) Class5_Sub9_Sub11 local50 = Static12.method396(local42);
			if (local50 != null) {
				local19 = local50.method2616(local46) | false;
				local17 = local50.method2610(local46) | false;
				local21 = arg1.aBoolean35 | false;
			}
			if ((arg1.aBoolean34 || Static353.aBoolean489) && arg4 != -1 && arg4 < arg1.anIntArray24.length) {
				@Pc(94) int local94 = arg1.anIntArray24[arg4];
				@Pc(98) int local98 = local94 >>> 16;
				@Pc(102) int local102 = local94 & 0xFFFF;
				@Pc(107) Class5_Sub9_Sub11 local107;
				if (local98 == local42) {
					local107 = local50;
				} else {
					local107 = Static12.method396(local102 >>> 16);
				}
				if (local107 != null) {
					local19 |= local107.method2616(local102);
					local17 |= local107.method2610(local102);
				}
			}
			if (local19) {
				local13 = 1184;
			}
			if (local17) {
				local13 |= 0x100;
			}
			if (local21) {
				local13 |= 0x200;
			}
		}
		@Pc(161) long local161 = (long) arg2 << 32 | (long) (arg3 << 16) | (long) arg5;
		@Pc(163) Class66 local163 = Static162.aClass66_58;
		@Pc(171) Class101 local171;
		synchronized (Static162.aClass66_58) {
			local171 = (Class101) Static162.aClass66_58.method1939(local161);
		}
		if (local171 == null || arg7.method4792(local171.method5171(), local13) != 0) {
			if (local171 != null) {
				local13 = arg7.method4843(local13, local171.method5171());
			}
			@Pc(198) Class150[] local198 = new Class150[3];
			@Pc(200) int local200 = 0;
			if (!Static173.method3934(arg5).method864() || !Static173.method3934(arg3).method864() || !Static173.method3934(arg2).method864()) {
				return null;
			}
			@Pc(224) Class150 local224 = Static173.method3934(arg5).method866();
			if (local224 != null) {
				local200++;
				local198[0] = local224;
			}
			local224 = Static173.method3934(arg3).method866();
			if (local224 != null) {
				local198[local200++] = local224;
			}
			local224 = Static173.method3934(arg2).method866();
			if (local224 != null) {
				local198[local200++] = local224;
			}
			local32 = local13 | 0x2000;
			local224 = new Class150(local198, local200);
			local171 = arg7.method4804(local224, local32, Static233.anInt4553, 64, 768);
			for (local42 = 0; local42 < 5; local42++) {
				if (Static165.aShortArrayArray9[local42].length > this.anIntArray101[local42]) {
					local171.method5159(Static202.aShortArray47[local42], Static165.aShortArrayArray9[local42][this.anIntArray101[local42]]);
				}
				if (Static336.aShortArrayArray13[local42].length > this.anIntArray101[local42]) {
					local171.method5159(Static306.aShortArray99[local42], Static336.aShortArrayArray13[local42][this.anIntArray101[local42]]);
				}
			}
			local171.method5145(local13);
			@Pc(332) Class66 local332 = Static162.aClass66_58;
			synchronized (Static162.aClass66_58) {
				Static162.aClass66_58.method1936(local161, local171);
			}
		}
		if (arg1 == null) {
			return local171;
		} else {
			local171 = local171.method5184((byte) 1, local13, true);
			return arg1.method528(1024, arg0, local171, arg6, arg4);
		}
	}
}
