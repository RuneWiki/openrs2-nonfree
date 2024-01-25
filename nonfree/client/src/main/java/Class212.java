import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!n")
public final class Class212 {

	@OriginalMember(owner = "client!n", name = "a", descriptor = "[I")
	private int[] anIntArray443;

	@OriginalMember(owner = "client!n", name = "g", descriptor = "J")
	private long aLong156;

	@OriginalMember(owner = "client!n", name = "k", descriptor = "I")
	private int anInt6264;

	@OriginalMember(owner = "client!n", name = "l", descriptor = "Z")
	public boolean aBoolean444;

	@OriginalMember(owner = "client!n", name = "r", descriptor = "[I")
	public int[] anIntArray444;

	@OriginalMember(owner = "client!n", name = "t", descriptor = "J")
	private long aLong157;

	@OriginalMember(owner = "client!n", name = "w", descriptor = "[[I")
	private int[][] anIntArrayArray50;

	@OriginalMember(owner = "client!n", name = "p", descriptor = "I")
	public int anInt6268 = -1;

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(Lclient!oa;Lclient!ur;IIILclient!ct;Lclient!pb;Lclient!ct;ILclient!pe;II[Lclient!id;Lclient!oba;IBLclient!ai;ZLclient!qh;)Lclient!ba;")
	public Class24 method5073(@OriginalArg(0) Class90 arg0, @OriginalArg(1) Class324 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class63 arg5, @OriginalArg(6) Class242 arg6, @OriginalArg(7) Class63 arg7, @OriginalArg(8) int arg8, @OriginalArg(9) Class244 arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) Class140[] arg12, @OriginalArg(13) Class226 arg13, @OriginalArg(14) int arg14, @OriginalArg(16) Class12 arg15, @OriginalArg(18) Interface17 arg16) {
		if (this.anInt6268 != -1) {
			return arg13.method5369(this.anInt6268).method1939(arg1, arg7, arg8, arg0, arg5, arg12, arg11, arg4, arg10, arg3, arg2, arg16, arg15, arg14);
		}
		@Pc(36) int local36 = arg10;
		@Pc(39) long local39 = this.aLong156;
		@Pc(42) int[] local42 = this.anIntArray443;
		if (arg7 != null && (arg7.anInt1385 >= 0 || arg7.anInt1388 >= 0)) {
			local42 = new int[12];
			for (@Pc(58) int local58 = 0; local58 < 12; local58++) {
				local42[local58] = this.anIntArray443[local58];
			}
			if (arg7.anInt1385 >= 0) {
				if (arg7.anInt1385 == 65535) {
					local39 ^= 0xFFFFFFFF00000000L;
					local42[5] = 0;
				} else {
					local42[5] = arg7.anInt1385 | 0x40000000;
					local39 ^= (long) local42[5] << 32;
				}
			}
			if (arg7.anInt1388 >= 0) {
				if (arg7.anInt1388 == 65535) {
					local39 ^= 0xFFFFFFFFL;
					local42[3] = 0;
				} else {
					local42[3] = arg7.anInt1388 | 0x40000000;
					local39 ^= local42[3];
				}
			}
		}
		@Pc(143) boolean local143 = false;
		@Pc(145) boolean local145 = false;
		@Pc(147) boolean local147 = false;
		@Pc(155) boolean local155 = arg7 != null || arg5 != null;
		@Pc(162) int local162 = arg12 == null ? 0 : arg12.length;
		@Pc(196) int local196;
		@Pc(201) int local201;
		for (@Pc(164) int local164 = 0; local164 < local162; local164++) {
			Static138.aClass6_Sub5_Sub15Array8[local164] = null;
			if (arg12[local164] != null) {
				@Pc(182) Class63 local182 = arg1.method7265(arg12[local164].anInt4049);
				if (local182.anIntArray127 != null) {
					local155 = true;
					Static430.aClass63Array2[local164] = local182;
					local196 = arg12[local164].anInt4048;
					local201 = arg12[local164].anInt4040;
					@Pc(206) int local206 = local182.anIntArray127[local196];
					Static138.aClass6_Sub5_Sub15Array8[local164] = arg1.method7259(local206 >>> 16);
					@Pc(219) int local219 = local206 & 0xFFFF;
					Static263.anIntArray389[local164] = local219;
					if (Static138.aClass6_Sub5_Sub15Array8[local164] != null) {
						local145 |= Static138.aClass6_Sub5_Sub15Array8[local164].method6376(local219);
						local143 |= Static138.aClass6_Sub5_Sub15Array8[local164].method6375(local219);
						local147 |= Static138.aClass6_Sub5_Sub15Array8[local164].method6377(local219);
					}
					if ((local182.aBoolean103 || Static38.aBoolean50) && local201 != -1 && local182.anIntArray127.length > local201) {
						Static359.anIntArray697[local164] = local182.anIntArray128[local196];
						Static205.anIntArray340[local164] = arg12[local164].anInt4045;
						@Pc(304) int local304 = local182.anIntArray127[local201];
						Static29.aClass6_Sub5_Sub15Array14[local164] = arg1.method7259(local304 >>> 16);
						@Pc(317) int local317 = local304 & 0xFFFF;
						Static276.anIntArray398[local164] = local317;
						if (Static29.aClass6_Sub5_Sub15Array14[local164] != null) {
							local145 |= Static29.aClass6_Sub5_Sub15Array14[local164].method6376(local317);
							local143 |= Static29.aClass6_Sub5_Sub15Array14[local164].method6375(local317);
							local147 |= Static29.aClass6_Sub5_Sub15Array14[local164].method6377(local317);
						}
					} else {
						Static359.anIntArray697[local164] = 0;
						Static205.anIntArray340[local164] = 0;
						Static29.aClass6_Sub5_Sub15Array14[local164] = null;
						Static276.anIntArray398[local164] = -1;
					}
				}
			}
		}
		@Pc(362) int local362 = -1;
		local196 = -1;
		local201 = 0;
		@Pc(368) Class6_Sub5_Sub15 local368 = null;
		@Pc(370) Class6_Sub5_Sub15 local370 = null;
		@Pc(372) int local372 = -1;
		@Pc(374) int local374 = -1;
		@Pc(376) int local376 = 0;
		@Pc(378) Class6_Sub5_Sub15 local378 = null;
		@Pc(380) Class6_Sub5_Sub15 local380 = null;
		if (local155) {
			@Pc(393) int local393;
			@Pc(455) int local455;
			if (arg7 != null) {
				local362 = arg7.anIntArray127[arg2];
				local393 = local362 >>> 16;
				local368 = arg1.method7259(local393);
				local362 &= 0xFFFF;
				if (local368 != null) {
					local145 |= local368.method6376(local362);
					local143 |= local368.method6375(local362);
					local147 |= local368.method6377(local362);
				}
				if ((arg7.aBoolean103 || Static38.aBoolean50) && arg8 != -1 && arg7.anIntArray127.length > arg8) {
					local201 = arg7.anIntArray128[arg2];
					local196 = arg7.anIntArray127[arg8];
					local455 = local196 >>> 16;
					local196 &= 0xFFFF;
					local370 = local393 == local455 ? local368 : arg1.method7259(local455);
					if (local370 != null) {
						local145 |= local370.method6376(local196);
						local143 |= local370.method6375(local196);
						local147 |= local370.method6377(local196);
					}
				}
			}
			local36 = arg10 | 0x20;
			if (arg5 != null) {
				local372 = arg5.anIntArray127[arg3];
				local393 = local372 >>> 16;
				local378 = arg1.method7259(local393);
				local372 &= 0xFFFF;
				if (local378 != null) {
					local145 |= local378.method6376(local372);
					local143 |= local378.method6375(local372);
					local147 |= local378.method6377(local372);
				}
				if ((arg5.aBoolean103 || Static38.aBoolean50) && arg11 != -1 && arg5.anIntArray127.length > arg11) {
					local376 = arg5.anIntArray128[arg3];
					local374 = arg5.anIntArray127[arg11];
					local455 = local374 >>> 16;
					local374 &= 0xFFFF;
					local380 = local455 == local393 ? local378 : arg1.method7259(local455);
					if (local380 != null) {
						local145 |= local380.method6376(local374);
						local143 |= local380.method6375(local374);
						local147 |= local380.method6377(local374);
					}
				}
			}
			if (local145) {
				local36 |= 0x80;
			}
			if (local143) {
				local36 |= 0x100;
			}
			if (local147) {
				local36 |= 0x400;
			}
		}
		@Pc(633) Class330 local633 = Static180.aClass330_22;
		@Pc(641) Class24 local641;
		synchronized (Static180.aClass330_22) {
			local641 = (Class24) Static180.aClass330_22.method7677(local39);
		}
		@Pc(649) Class154 local649 = null;
		if (this.anInt6264 != -1) {
			local649 = arg15.method198(this.anInt6264);
		}
		@Pc(689) int local689;
		@Pc(695) int local695;
		if (local641 == null || arg0.method7505(local641.h(), local36) != 0 || local649 != null && local649.anIntArrayArray41 != null && this.anIntArrayArray50 == null) {
			if (local641 != null) {
				local36 = arg0.method7461(local36, local641.h());
			}
			@Pc(687) boolean local687 = false;
			local689 = 0;
			while (true) {
				if (local689 >= 12) {
					if (local687) {
						if (this.aLong157 != -1L) {
							@Pc(747) Class330 local747 = Static180.aClass330_22;
							synchronized (Static180.aClass330_22) {
								local641 = (Class24) Static180.aClass330_22.method7677(this.aLong157);
							}
						}
						if (local641 == null || arg0.method7505(local641.h(), local36) != 0 || local649 != null && local649.anIntArrayArray41 != null && this.anIntArrayArray50 == null) {
							return null;
						}
					} else {
						@Pc(786) Class134[] local786 = new Class134[12];
						@Pc(794) int local794;
						for (@Pc(788) int local788 = 0; local788 < 12; local788++) {
							local794 = local42[local788];
							@Pc(811) Class134 local811;
							if ((local794 & 0x40000000) != 0) {
								local811 = arg9.method5726(local794 & 0x3FFFFFFF).method5473(this.aBoolean444);
								if (local811 != null) {
									local786[local788] = local811;
								}
							} else if ((Integer.MIN_VALUE & local794) != 0) {
								local811 = arg6.method5667(local794 & 0x3FFFFFFF).method1918();
								if (local811 != null) {
									local786[local788] = local811;
								}
							}
						}
						@Pc(869) int local869;
						if (local649 != null && local649.anIntArrayArray41 != null) {
							for (local794 = 0; local794 < local649.anIntArrayArray41.length; local794++) {
								if (local649.anIntArrayArray41[local794] != null && local786[local794] != null) {
									local869 = local649.anIntArrayArray41[local794][0];
									@Pc(876) int local876 = local649.anIntArrayArray41[local794][1];
									@Pc(883) int local883 = local649.anIntArrayArray41[local794][2];
									@Pc(892) int local892 = local649.anIntArrayArray41[local794][3] << 3;
									@Pc(901) int local901 = local649.anIntArrayArray41[local794][4] << 3;
									@Pc(910) int local910 = local649.anIntArrayArray41[local794][5] << 3;
									if (this.anIntArrayArray50 == null) {
										this.anIntArrayArray50 = new int[local649.anIntArrayArray41.length][];
									}
									if (this.anIntArrayArray50[local794] == null) {
										@Pc(932) int[] local932 = this.anIntArrayArray50[local794] = new int[15];
										if (local892 == 0 && local901 == 0 && local910 == 0) {
											local932[13] = -local876;
											local932[12] = -local869;
											local932[14] = -local883;
											local932[0] = local932[4] = local932[8] = 32768;
										} else {
											@Pc(980) int local980 = Class22.anIntArray19[local892];
											@Pc(984) int local984 = Class22.anIntArray20[local892];
											@Pc(988) int local988 = Class22.anIntArray19[local901];
											@Pc(992) int local992 = Class22.anIntArray20[local901];
											@Pc(996) int local996 = Class22.anIntArray19[local910];
											@Pc(1000) int local1000 = Class22.anIntArray20[local910];
											@Pc(1008) int local1008 = local984 * local996 + 8192 >> 14;
											@Pc(1016) int local1016 = local1000 * local984 + 8192 >> 14;
											local932[6] = local988 * local1016 + -local992 * local996 + 8192 >> 14;
											local932[4] = local980 * local996 + 8192 >> 14;
											local932[0] = local992 * local1016 + local996 * local988 + 8192 >> 14;
											local932[8] = local980 * local988 + 8192 >> 14;
											local932[7] = local1008 * local988 + -local1000 * -local992 + 8192 >> 14;
											local932[5] = -local984;
											local932[3] = local980 * local1000 + 8192 >> 14;
											local932[1] = local988 * -local1000 + local1008 * local992 + 8192 >> 14;
											local932[2] = local992 * local980 + 8192 >> 14;
											local932[12] = local932[0] * -local869 + -local876 * local932[3] + local932[6] * -local883 + 8192 >> 14;
											local932[13] = local932[7] * -local883 + local932[1] * -local869 + -local876 * local932[4] + 8192 >> 14;
											local932[14] = -local869 * local932[2] + local932[5] * -local876 + local932[8] * -local883 + 8192 >> 14;
										}
										local932[10] = local876;
										local932[9] = local869;
										local932[11] = local883;
									}
									if (local892 != 0 || local901 != 0 || local910 != 0) {
										local786[local794].method3348(local901, local910, local892);
									}
									if (local869 != 0 || local876 != 0 || local883 != 0) {
										local786[local794].method3347(local876, local883, local869);
									}
								}
							}
						}
						@Pc(1276) Class134 local1276 = new Class134(local786, local786.length);
						@Pc(1280) int local1280 = local36 | 0x4000;
						local641 = arg0.method7464(local1276, local1280, Static237.anInt4307, 64, 850);
						for (local869 = 0; local869 < 5; local869++) {
							if (Static252.aShortArrayArray18[local869].length > this.anIntArray444[local869]) {
								local641.UA(Static297.aShortArray82[local869], Static252.aShortArrayArray18[local869][this.anIntArray444[local869]]);
							}
							if (Static8.aShortArrayArray1[local869].length > this.anIntArray444[local869]) {
								local641.UA(Static184.aShortArray48[local869], Static8.aShortArrayArray1[local869][this.anIntArray444[local869]]);
							}
						}
						local641.ia(local36);
						@Pc(1353) Class330 local1353 = Static180.aClass330_22;
						synchronized (Static180.aClass330_22) {
							Static180.aClass330_22.method7676(local641, local39);
						}
						this.aLong157 = local39;
					}
					break;
				}
				local695 = local42[local689];
				if ((local695 & 0x40000000) == 0) {
					if ((local695 & Integer.MIN_VALUE) != 0 && !arg6.method5667(local695 & 0x3FFFFFFF).method1913()) {
						local687 = true;
					}
				} else if (!arg9.method5726(local695 & 0x3FFFFFFF).method5482(this.aBoolean444)) {
					local687 = true;
				}
				local689++;
			}
		}
		@Pc(1375) Class24 local1375 = local641.method7398((byte) 4, local36, true);
		if (!local155) {
			return local1375;
		}
		@Pc(1381) int local1381 = 0;
		local689 = 1;
		while (local162 > local1381) {
			if (Static138.aClass6_Sub5_Sub15Array8[local1381] != null) {
				local1375.method7385(Static263.anIntArray389[local1381], Static29.aClass6_Sub5_Sub15Array14[local1381], Static276.anIntArray398[local1381], Static205.anIntArray340[local1381] - 1, false, local689, Static359.anIntArray697[local1381], Static138.aClass6_Sub5_Sub15Array8[local1381], this.anIntArrayArray50 == null ? null : this.anIntArrayArray50[local1381]);
			}
			local1381++;
			local689 <<= 0x1;
		}
		if (local368 != null && local378 != null) {
			local1375.method7387(local370, local372, local362, arg4 - 1, local378, local196, arg7.aBooleanArray6, local376, false, local368, local380, local374, local201, arg14 - 1);
		} else if (local368 != null) {
			local1375.method7395(arg4 - 1, local362, false, local196, 0, local370, local201, local368);
		} else if (local378 != null) {
			local1375.method7395(arg14 - 1, local372, false, local374, 0, local380, local376, local378);
		}
		for (local695 = 0; local695 < local162; local695++) {
			Static138.aClass6_Sub5_Sub15Array8[local695] = null;
			Static29.aClass6_Sub5_Sub15Array14[local695] = null;
			Static430.aClass63Array2[local695] = null;
		}
		return local1375;
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(I)V")
	private void method5074() {
		@Pc(7) long[] local7 = Class5.aLongArray1;
		this.aLong156 = -1L;
		this.aLong156 = this.aLong156 >>> 8 ^ local7[(int) (((long) (this.anInt6264 >> 8) ^ this.aLong156) & 0xFFL)];
		this.aLong156 = this.aLong156 >>> 8 ^ local7[(int) (((long) this.anInt6264 ^ this.aLong156) & 0xFFL)];
		for (@Pc(57) int local57 = 0; local57 < 12; local57++) {
			this.aLong156 = local7[(int) ((this.aLong156 ^ (long) (this.anIntArray443[local57] >> 24)) & 0xFFL)] ^ this.aLong156 >>> 8;
			this.aLong156 = local7[(int) ((this.aLong156 ^ (long) (this.anIntArray443[local57] >> 16)) & 0xFFL)] ^ this.aLong156 >>> 8;
			this.aLong156 = this.aLong156 >>> 8 ^ local7[(int) ((this.aLong156 ^ (long) (this.anIntArray443[local57] >> 8)) & 0xFFL)];
			this.aLong156 = this.aLong156 >>> 8 ^ local7[(int) ((this.aLong156 ^ (long) this.anIntArray443[local57]) & 0xFFL)];
		}
		for (@Pc(151) int local151 = 0; local151 < 5; local151++) {
			this.aLong156 = this.aLong156 >>> 8 ^ local7[(int) ((this.aLong156 ^ (long) this.anIntArray444[local151]) & 0xFFL)];
		}
		this.aLong156 = local7[(int) (((long) (this.aBoolean444 ? 1 : 0) ^ this.aLong156) & 0xFFL)] ^ this.aLong156 >>> 8;
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(BZ)V")
	public void method5075(@OriginalArg(1) boolean arg0) {
		this.aBoolean444 = arg0;
		this.method5074();
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(IILclient!ct;Lclient!pb;ILclient!oa;BLclient!ur;IIII)Lclient!ba;")
	public Class24 method5076(@OriginalArg(1) int arg0, @OriginalArg(2) Class63 arg1, @OriginalArg(3) Class242 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class90 arg4, @OriginalArg(7) Class324 arg5, @OriginalArg(8) int arg6, @OriginalArg(9) int arg7, @OriginalArg(10) int arg8, @OriginalArg(11) int arg9) {
		@Pc(7) int local7 = 2048;
		@Pc(101) int local101;
		if (arg1 != null) {
			@Pc(19) boolean local19 = false;
			@Pc(21) boolean local21 = false;
			@Pc(23) boolean local23 = false;
			@Pc(25) boolean local25 = false;
			@Pc(36) int local36 = arg1.anIntArray127[arg3];
			local7 = 2080;
			@Pc(46) int local46 = local36 >>> 16;
			@Pc(50) int local50 = local36 & 0xFFFF;
			@Pc(55) Class6_Sub5_Sub15 local55 = arg5.method7259(local46);
			if (local55 != null) {
				local21 = local55.method6376(local50) | false;
				local19 = local55.method6375(local50) | false;
				local25 = local55.method6377(local50) | false;
				local23 = arg1.aBoolean104 | false;
			}
			if ((arg1.aBoolean103 || Static38.aBoolean50) && arg9 != -1 && arg1.anIntArray127.length > arg9) {
				local101 = arg1.anIntArray127[arg9];
				@Pc(105) int local105 = local101 >>> 16;
				@Pc(109) int local109 = local101 & 0xFFFF;
				@Pc(118) Class6_Sub5_Sub15 local118;
				if (local105 == local46) {
					local118 = local55;
				} else {
					local118 = arg5.method7259(local109 >>> 16);
				}
				if (local118 != null) {
					local21 |= local118.method6376(local109);
					local19 |= local118.method6375(local109);
					local25 |= local118.method6377(local109);
				}
			}
			if (local21) {
				local7 = 2208;
			}
			if (local19) {
				local7 |= 0x100;
			}
			if (local23) {
				local7 |= 0x200;
			}
			if (local25) {
				local7 |= 0x400;
			}
		}
		@Pc(186) long local186 = (long) arg8 << 32 | (long) (arg6 << 16) | (long) arg0;
		@Pc(188) Class330 local188 = Static395.aClass330_46;
		@Pc(196) Class24 local196;
		synchronized (Static395.aClass330_46) {
			local196 = (Class24) Static395.aClass330_46.method7677(local186);
		}
		if (local196 == null || arg4.method7505(local196.h(), local7) != 0) {
			if (local196 != null) {
				local7 = arg4.method7461(local7, local196.h());
			}
			@Pc(223) Class134[] local223 = new Class134[3];
			local101 = 0;
			if (!arg2.method5667(arg0).method1916() || !arg2.method5667(arg6).method1916() || !arg2.method5667(arg8).method1916()) {
				return null;
			}
			@Pc(255) Class134 local255 = arg2.method5667(arg0).method1920();
			if (local255 != null) {
				local101++;
				local223[0] = local255;
			}
			local255 = arg2.method5667(arg6).method1920();
			if (local255 != null) {
				local223[local101++] = local255;
			}
			local255 = arg2.method5667(arg8).method1920();
			if (local255 != null) {
				local223[local101++] = local255;
			}
			local255 = new Class134(local223, local101);
			@Pc(300) int local300 = local7 | 0x4000;
			local196 = arg4.method7464(local255, local300, Static237.anInt4307, 64, 768);
			for (@Pc(310) int local310 = 0; local310 < 5; local310++) {
				if (Static252.aShortArrayArray18[local310].length > this.anIntArray444[local310]) {
					local196.UA(Static297.aShortArray82[local310], Static252.aShortArrayArray18[local310][this.anIntArray444[local310]]);
				}
				if (this.anIntArray444[local310] < Static8.aShortArrayArray1[local310].length) {
					local196.UA(Static184.aShortArray48[local310], Static8.aShortArrayArray1[local310][this.anIntArray444[local310]]);
				}
			}
			local196.ia(local7);
			@Pc(367) Class330 local367 = Static395.aClass330_46;
			synchronized (Static395.aClass330_46) {
				Static395.aClass330_46.method7676(local196, local186);
			}
		}
		if (arg1 == null) {
			return local196;
		} else {
			local196 = local196.method7398((byte) 4, local7, true);
			return arg1.method1148(2048, arg7, local196, arg9, arg3);
		}
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(IZI)V")
	public void method5077(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray444[arg1] = arg0;
		this.method5074();
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(BIILclient!pb;)V")
	public void method5079(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class242 arg2) {
		@Pc(7) int local7 = Static86.anIntArray728[arg0];
		if (this.anIntArray443[local7] != 0 && arg2.method5667(arg1) != null) {
			this.anIntArray443[local7] = arg1 | Integer.MIN_VALUE;
			this.method5074();
		}
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(Lclient!qh;IILclient!oa;Lclient!ur;IILclient!pe;ILclient!oba;Lclient!ct;Lclient!pb;)Lclient!ba;")
	public Class24 method5081(@OriginalArg(0) Interface17 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class90 arg3, @OriginalArg(4) Class324 arg4, @OriginalArg(5) int arg5, @OriginalArg(7) Class244 arg6, @OriginalArg(9) Class226 arg7, @OriginalArg(10) Class63 arg8, @OriginalArg(11) Class242 arg9) {
		if (this.anInt6268 != -1) {
			return arg7.method5369(this.anInt6268).method1947(arg4, arg8, arg2, arg3, arg5, arg1, arg0);
		}
		@Pc(33) int local33 = 2048;
		@Pc(41) boolean local41;
		@Pc(54) int local54;
		@Pc(122) int local122;
		@Pc(64) int local64;
		if (arg8 != null) {
			@Pc(37) boolean local37 = false;
			@Pc(39) boolean local39 = false;
			local41 = false;
			@Pc(43) boolean local43 = false;
			local54 = arg8.anIntArray127[arg1];
			local33 = 2080;
			local64 = local54 >>> 16;
			@Pc(68) int local68 = local54 & 0xFFFF;
			@Pc(73) Class6_Sub5_Sub15 local73 = arg4.method7259(local64);
			if (local73 != null) {
				local39 = local73.method6376(local68) | false;
				local37 = local73.method6375(local68) | false;
				local43 = local73.method6377(local68) | false;
				local41 = arg8.aBoolean104 | false;
			}
			if ((arg8.aBoolean103 || Static38.aBoolean50) && arg5 != -1 && arg8.anIntArray127.length > arg5) {
				local122 = arg8.anIntArray127[arg5];
				@Pc(126) int local126 = local122 >>> 16;
				@Pc(138) Class6_Sub5_Sub15 local138 = local64 == local126 ? local73 : arg4.method7259(local126);
				@Pc(142) int local142 = local122 & 0xFFFF;
				if (local138 != null) {
					local39 |= local138.method6376(local142);
					local37 |= local138.method6375(local142);
					local43 |= local138.method6377(local142);
				}
			}
			if (local39) {
				local33 = 2208;
			}
			if (local37) {
				local33 |= 0x100;
			}
			if (local41) {
				local33 |= 0x200;
			}
			if (local43) {
				local33 |= 0x400;
			}
		}
		@Pc(191) Class330 local191 = Static395.aClass330_46;
		@Pc(200) Class24 local200;
		synchronized (Static395.aClass330_46) {
			local200 = (Class24) Static395.aClass330_46.method7677(this.aLong156);
		}
		if (local200 == null || arg3.method7505(local200.h(), local33) != 0) {
			if (local200 != null) {
				local33 = arg3.method7461(local33, local200.h());
			}
			local41 = false;
			for (@Pc(228) int local228 = 0; local228 < 12; local228++) {
				local54 = this.anIntArray443[local228];
				if ((local54 & 0x40000000) == 0) {
					if ((Integer.MIN_VALUE & local54) != 0 && !arg9.method5667(local54 & 0x3FFFFFFF).method1916()) {
						local41 = true;
					}
				} else if (!arg6.method5726(local54 & 0x3FFFFFFF).method5481(this.aBoolean444)) {
					local41 = true;
				}
			}
			if (local41) {
				return null;
			}
			@Pc(286) Class134[] local286 = new Class134[12];
			local122 = 0;
			for (@Pc(290) int local290 = 0; local290 < 12; local290++) {
				@Pc(297) int local297 = this.anIntArray443[local290];
				@Pc(315) Class134 local315;
				if ((local297 & 0x40000000) != 0) {
					local315 = arg6.method5726(local297 & 0x3FFFFFFF).method5487(this.aBoolean444);
					if (local315 != null) {
						local286[local122++] = local315;
					}
				} else if ((local297 & Integer.MIN_VALUE) != 0) {
					local315 = arg9.method5667(local297 & 0x3FFFFFFF).method1920();
					if (local315 != null) {
						local286[local122++] = local315;
					}
				}
			}
			@Pc(352) int local352 = local33 | 0x4000;
			@Pc(358) Class134 local358 = new Class134(local286, local122);
			local200 = arg3.method7464(local358, local352, Static237.anInt4307, 64, 768);
			for (local64 = 0; local64 < 5; local64++) {
				if (this.anIntArray444[local64] < Static252.aShortArrayArray18[local64].length) {
					local200.UA(Static297.aShortArray82[local64], Static252.aShortArrayArray18[local64][this.anIntArray444[local64]]);
				}
				if (this.anIntArray444[local64] < Static8.aShortArrayArray1[local64].length) {
					local200.UA(Static184.aShortArray48[local64], Static8.aShortArrayArray1[local64][this.anIntArray444[local64]]);
				}
			}
			local200.ia(local33);
			@Pc(425) Class330 local425 = Static395.aClass330_46;
			synchronized (Static395.aClass330_46) {
				Static395.aClass330_46.method7676(local200, this.aLong156);
			}
		}
		if (arg8 == null) {
			return local200;
		} else {
			local200.method7398((byte) 4, local33, true);
			return arg8.method1148(2048, arg2, local200, arg5, arg1);
		}
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(I[I[IZII)V")
	public void method5082(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4) {
		this.anIntArray443 = arg1;
		this.anInt6268 = arg4;
		if (arg0 != this.anInt6264) {
			this.anIntArrayArray50 = null;
			this.anInt6264 = arg0;
		}
		this.aBoolean444 = arg3;
		this.anIntArray444 = arg2;
		this.method5074();
	}
}
