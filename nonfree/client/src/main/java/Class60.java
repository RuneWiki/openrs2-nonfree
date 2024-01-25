import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ed")
public final class Class60 {

	@OriginalMember(owner = "client!ed", name = "c", descriptor = "Z")
	public boolean aBoolean116;

	@OriginalMember(owner = "client!ed", name = "f", descriptor = "I")
	private int anInt1898;

	@OriginalMember(owner = "client!ed", name = "g", descriptor = "J")
	private long aLong58;

	@OriginalMember(owner = "client!ed", name = "h", descriptor = "[[I")
	private int[][] anIntArrayArray23;

	@OriginalMember(owner = "client!ed", name = "p", descriptor = "J")
	private long aLong59;

	@OriginalMember(owner = "client!ed", name = "r", descriptor = "[I")
	private int[] anIntArray158;

	@OriginalMember(owner = "client!ed", name = "s", descriptor = "[I")
	public int[] anIntArray159;

	@OriginalMember(owner = "client!ed", name = "j", descriptor = "I")
	public int anInt1900 = -1;

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(BII)V")
	public void method1642(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray159[arg0] = arg1;
		this.method1643();
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(I)V")
	private void method1643() {
		this.aLong58 = -1L;
		@Pc(8) long[] local8 = Class1_Sub4_Sub12.aLongArray3;
		this.aLong58 = local8[(int) ((this.aLong58 ^ (long) (this.anInt1898 >> 8)) & 0xFFL)] ^ this.aLong58 >>> 8;
		this.aLong58 = this.aLong58 >>> 8 ^ local8[(int) ((this.aLong58 ^ (long) this.anInt1898) & 0xFFL)];
		for (@Pc(56) int local56 = 0; local56 < 12; local56++) {
			this.aLong58 = local8[(int) (((long) (this.anIntArray158[local56] >> 24) ^ this.aLong58) & 0xFFL)] ^ this.aLong58 >>> 8;
			this.aLong58 = this.aLong58 >>> 8 ^ local8[(int) ((this.aLong58 ^ (long) (this.anIntArray158[local56] >> 16)) & 0xFFL)];
			this.aLong58 = local8[(int) ((this.aLong58 ^ (long) (this.anIntArray158[local56] >> 8)) & 0xFFL)] ^ this.aLong58 >>> 8;
			this.aLong58 = local8[(int) (((long) this.anIntArray158[local56] ^ this.aLong58) & 0xFFL)] ^ this.aLong58 >>> 8;
		}
		for (@Pc(149) int local149 = 0; local149 < 5; local149++) {
			this.aLong58 = local8[(int) ((this.aLong58 ^ (long) this.anIntArray159[local149]) & 0xFFL)] ^ this.aLong58 >>> 8;
		}
		this.aLong58 = local8[(int) (((long) (this.aBoolean116 ? 1 : 0) ^ this.aLong58) & 0xFFL)] ^ this.aLong58 >>> 8;
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "([IIZ[IZI)V")
	public void method1644(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4) {
		this.anIntArray158 = arg0;
		if (this.anInt1898 != arg1) {
			this.anIntArrayArray23 = null;
			this.anInt1898 = arg1;
		}
		this.aBoolean116 = arg3;
		this.anIntArray159 = arg2;
		this.anInt1900 = arg4;
		this.method1643();
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(ZB)V")
	public void method1645(@OriginalArg(0) boolean arg0) {
		this.aBoolean116 = arg0;
		this.method1643();
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(BIIILclient!ya;Lclient!ov;Lclient!mg;ILclient!bd;Lclient!sm;Lclient!it;Lclient!jq;)Lclient!t;")
	public Class105 method1646(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(4) Class39 arg2, @OriginalArg(5) Interface8 arg3, @OriginalArg(6) Class158 arg4, @OriginalArg(7) int arg5, @OriginalArg(8) Class19 arg6, @OriginalArg(9) Class223 arg7, @OriginalArg(10) Class116 arg8, @OriginalArg(11) Class127 arg9) {
		if (this.anInt1900 != -1) {
			return arg8.method2822(this.anInt1900).method1514(arg1, arg3, arg7, arg2, arg5, arg9, arg0);
		}
		@Pc(35) int local35 = 2048;
		@Pc(43) boolean local43;
		@Pc(60) int local60;
		@Pc(122) int local122;
		@Pc(66) int local66;
		if (arg7 != null) {
			@Pc(39) boolean local39 = false;
			@Pc(41) boolean local41 = false;
			local43 = false;
			@Pc(45) boolean local45 = false;
			local35 = 2080;
			local60 = arg7.anIntArray557[arg0];
			local66 = local60 >>> 16;
			@Pc(71) Class1_Sub2_Sub9 local71 = arg9.method2976(local66);
			@Pc(75) int local75 = local60 & 0xFFFF;
			if (local71 != null) {
				local41 = local71.method2799(local75) | false;
				local39 = local71.method2800(local75) | false;
				local45 = local71.method2798(local75) | false;
				local43 = arg7.aBoolean424 | false;
			}
			if ((arg7.aBoolean422 || Static21.aBoolean16) && arg5 != -1 && arg7.anIntArray557.length > arg5) {
				local122 = arg7.anIntArray557[arg5];
				@Pc(126) int local126 = local122 >>> 16;
				@Pc(130) int local130 = local122 & 0xFFFF;
				@Pc(140) Class1_Sub2_Sub9 local140 = local66 == local126 ? local71 : arg9.method2976(local126);
				if (local140 != null) {
					local41 |= local140.method2799(local130);
					local39 |= local140.method2800(local130);
					local45 |= local140.method2798(local130);
				}
			}
			if (local41) {
				local35 = 2208;
			}
			if (local39) {
				local35 |= 0x100;
			}
			if (local43) {
				local35 |= 0x200;
			}
			if (local45) {
				local35 |= 0x400;
			}
		}
		@Pc(189) Class134 local189 = Static321.aClass134_43;
		@Pc(198) Class105 local198;
		synchronized (Static321.aClass134_43) {
			local198 = (Class105) Static321.aClass134_43.method3266(this.aLong58);
		}
		if (local198 == null || arg2.method4528(local198.P(), local35) != 0) {
			if (local198 != null) {
				local35 = arg2.method4530(local35, local198.P());
			}
			local43 = false;
			for (@Pc(229) int local229 = 0; local229 < 12; local229++) {
				local60 = this.anIntArray158[local229];
				if ((local60 & 0x40000000) == 0) {
					if ((local60 & Integer.MIN_VALUE) != 0 && !arg4.method3687(local60 & 0x3FFFFFFF).method3870()) {
						local43 = true;
					}
				} else if (!arg6.method560(local60 & 0x3FFFFFFF).method3487(this.aBoolean116)) {
					local43 = true;
				}
			}
			if (local43) {
				return null;
			}
			@Pc(284) Class236[] local284 = new Class236[12];
			local122 = 0;
			for (@Pc(288) int local288 = 0; local288 < 12; local288++) {
				@Pc(295) int local295 = this.anIntArray158[local288];
				@Pc(312) Class236 local312;
				if ((local295 & 0x40000000) != 0) {
					local312 = arg6.method560(local295 & 0x3FFFFFFF).method3484(this.aBoolean116);
					if (local312 != null) {
						local284[local122++] = local312;
					}
				} else if ((Integer.MIN_VALUE & local295) != 0) {
					local312 = arg4.method3687(local295 & 0x3FFFFFFF).method3872();
					if (local312 != null) {
						local284[local122++] = local312;
					}
				}
			}
			@Pc(347) int local347 = local35 | 0x4000;
			@Pc(353) Class236 local353 = new Class236(local284, local122);
			local198 = arg2.method4540(local353, local347, Static86.anInt1856, 64, 768);
			for (local66 = 0; local66 < 5; local66++) {
				if (Static191.aShortArrayArray5[local66].length > this.anIntArray159[local66]) {
					local198.BA(Static401.aShortArray111[local66], Static191.aShortArrayArray5[local66][this.anIntArray159[local66]]);
				}
				if (this.anIntArray159[local66] < Static444.aShortArrayArray8[local66].length) {
					local198.BA(Static295.aShortArray84[local66], Static444.aShortArrayArray8[local66][this.anIntArray159[local66]]);
				}
			}
			local198.UA(local35);
			@Pc(428) Class134 local428 = Static321.aClass134_43;
			synchronized (Static321.aClass134_43) {
				Static321.aClass134_43.method3263(this.aLong58, local198);
			}
		}
		if (arg7 == null) {
			return local198;
		} else {
			local198.method3548((byte) 4, local35, true);
			return arg7.method5048(arg1, 2048, arg5, arg0, local198);
		}
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(Lclient!jq;Lclient!sm;BLclient!it;IIILclient!ya;Lclient!fh;[Lclient!sq;ILclient!bd;ILclient!sm;Lclient!ov;IILclient!mg;Z)Lclient!t;")
	public Class105 method1648(@OriginalArg(0) Class127 arg0, @OriginalArg(1) Class223 arg1, @OriginalArg(3) Class116 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class39 arg6, @OriginalArg(8) Class75 arg7, @OriginalArg(9) Class225[] arg8, @OriginalArg(10) int arg9, @OriginalArg(11) Class19 arg10, @OriginalArg(12) int arg11, @OriginalArg(13) Class223 arg12, @OriginalArg(14) Interface8 arg13, @OriginalArg(15) int arg14, @OriginalArg(16) int arg15, @OriginalArg(17) Class158 arg16) {
		if (this.anInt1900 != -1) {
			return arg2.method2822(this.anInt1900).method1512(arg4, arg8, arg12, arg14, arg9, arg15, arg0, arg6, arg5, arg1, arg11, arg3, arg13, arg7);
		}
		@Pc(32) int local32 = arg14;
		@Pc(35) long local35 = this.aLong58;
		@Pc(38) int[] local38 = this.anIntArray158;
		if (arg1 != null && (arg1.anInt6041 >= 0 || arg1.anInt6049 >= 0)) {
			local38 = new int[12];
			for (@Pc(51) int local51 = 0; local51 < 12; local51++) {
				local38[local51] = this.anIntArray158[local51];
			}
			if (arg1.anInt6041 >= 0) {
				if (arg1.anInt6041 == 65535) {
					local35 ^= 0xFFFFFFFF00000000L;
					local38[5] = 0;
				} else {
					local38[5] = arg1.anInt6041 | 0x40000000;
					local35 ^= (long) local38[5] << 32;
				}
			}
			if (arg1.anInt6049 >= 0) {
				if (arg1.anInt6049 == 65535) {
					local38[3] = 0;
					local35 ^= 0xFFFFFFFFL;
				} else {
					local38[3] = arg1.anInt6049 | 0x40000000;
					local35 ^= local38[3];
				}
			}
		}
		@Pc(134) boolean local134 = false;
		@Pc(136) boolean local136 = false;
		@Pc(138) boolean local138 = false;
		@Pc(146) boolean local146 = arg1 != null || arg12 != null;
		@Pc(153) int local153 = arg8 == null ? 0 : arg8.length;
		@Pc(186) int local186;
		@Pc(191) int local191;
		for (@Pc(155) int local155 = 0; local155 < local153; local155++) {
			Static362.aClass1_Sub2_Sub9Array3[local155] = null;
			if (arg8[local155] != null) {
				@Pc(172) Class223 local172 = arg0.method2975(arg8[local155].anInt6081);
				if (local172.anIntArray557 != null) {
					local146 = true;
					Static286.aClass223Array2[local155] = local172;
					local186 = arg8[local155].anInt6088;
					local191 = arg8[local155].anInt6082;
					@Pc(196) int local196 = local172.anIntArray557[local186];
					Static362.aClass1_Sub2_Sub9Array3[local155] = arg0.method2976(local196 >>> 16);
					@Pc(209) int local209 = local196 & 0xFFFF;
					Static365.anIntArray554[local155] = local209;
					if (Static362.aClass1_Sub2_Sub9Array3[local155] != null) {
						local136 |= Static362.aClass1_Sub2_Sub9Array3[local155].method2799(local209);
						local134 |= Static362.aClass1_Sub2_Sub9Array3[local155].method2800(local209);
						local138 |= Static362.aClass1_Sub2_Sub9Array3[local155].method2798(local209);
					}
					if ((local172.aBoolean422 || Static21.aBoolean16) && local191 != -1 && local191 < local172.anIntArray557.length) {
						Static253.anIntArray387[local155] = local172.anIntArray559[local186];
						Static253.anIntArray386[local155] = arg8[local155].anInt6087;
						@Pc(276) int local276 = local172.anIntArray557[local191];
						Static128.aClass1_Sub2_Sub9Array1[local155] = arg0.method2976(local276 >>> 16);
						@Pc(289) int local289 = local276 & 0xFFFF;
						Static5.anIntArray14[local155] = local289;
						if (Static128.aClass1_Sub2_Sub9Array1[local155] != null) {
							local136 |= Static128.aClass1_Sub2_Sub9Array1[local155].method2799(local289);
							local134 |= Static128.aClass1_Sub2_Sub9Array1[local155].method2800(local289);
							local138 |= Static128.aClass1_Sub2_Sub9Array1[local155].method2798(local289);
						}
					} else {
						Static253.anIntArray387[local155] = 0;
						Static253.anIntArray386[local155] = 0;
						Static128.aClass1_Sub2_Sub9Array1[local155] = null;
						Static5.anIntArray14[local155] = -1;
					}
				}
			}
		}
		@Pc(347) int local347 = -1;
		local186 = -1;
		local191 = 0;
		@Pc(353) Class1_Sub2_Sub9 local353 = null;
		@Pc(355) Class1_Sub2_Sub9 local355 = null;
		@Pc(357) int local357 = -1;
		@Pc(359) int local359 = -1;
		@Pc(361) int local361 = 0;
		@Pc(363) Class1_Sub2_Sub9 local363 = null;
		@Pc(365) Class1_Sub2_Sub9 local365 = null;
		if (local146) {
			local32 = arg14 | 0x20;
			@Pc(382) int local382;
			@Pc(442) int local442;
			if (arg1 != null) {
				local347 = arg1.anIntArray557[arg4];
				local382 = local347 >>> 16;
				local347 &= 0xFFFF;
				local353 = arg0.method2976(local382);
				if (local353 != null) {
					local136 |= local353.method2799(local347);
					local134 |= local353.method2800(local347);
					local138 |= local353.method2798(local347);
				}
				if ((arg1.aBoolean422 || Static21.aBoolean16) && arg5 != -1 && arg1.anIntArray557.length > arg5) {
					local191 = arg1.anIntArray559[arg4];
					local186 = arg1.anIntArray557[arg5];
					local442 = local186 >>> 16;
					local355 = local442 == local382 ? local353 : arg0.method2976(local442);
					local186 &= 0xFFFF;
					if (local355 != null) {
						local136 |= local355.method2799(local186);
						local134 |= local355.method2800(local186);
						local138 |= local355.method2798(local186);
					}
				}
			}
			if (arg12 != null) {
				local357 = arg12.anIntArray557[arg9];
				local382 = local357 >>> 16;
				local357 &= 0xFFFF;
				local363 = arg0.method2976(local382);
				if (local363 != null) {
					local136 |= local363.method2799(local357);
					local134 |= local363.method2800(local357);
					local138 |= local363.method2798(local357);
				}
				if ((arg12.aBoolean422 || Static21.aBoolean16) && arg11 != -1 && arg11 < arg12.anIntArray557.length) {
					local361 = arg12.anIntArray559[arg9];
					local359 = arg12.anIntArray557[arg11];
					local442 = local359 >>> 16;
					local359 &= 0xFFFF;
					local365 = local382 == local442 ? local363 : arg0.method2976(local442);
					if (local365 != null) {
						local136 |= local365.method2799(local359);
						local134 |= local365.method2800(local359);
						local138 |= local365.method2798(local359);
					}
				}
			}
			if (local136) {
				local32 |= 0x80;
			}
			if (local134) {
				local32 |= 0x100;
			}
			if (local138) {
				local32 |= 0x400;
			}
		}
		@Pc(607) Class134 local607 = Static384.aClass134_49;
		@Pc(615) Class105 local615;
		synchronized (Static384.aClass134_49) {
			local615 = (Class105) Static384.aClass134_49.method3266(local35);
		}
		@Pc(623) Class21 local623 = null;
		if (this.anInt1898 != -1) {
			local623 = arg7.method1988(this.anInt1898);
		}
		@Pc(669) int local669;
		@Pc(716) int local716;
		if (local615 == null || arg6.method4528(local615.P(), local32) != 0 || local623 != null && local623.anIntArrayArray5 != null && this.anIntArrayArray23 == null) {
			if (local615 != null) {
				local32 = arg6.method4530(local32, local615.P());
			}
			@Pc(662) boolean local662 = false;
			@Pc(664) int local664 = 0;
			while (true) {
				if (local664 >= 12) {
					if (local662) {
						if (this.aLong59 != -1L) {
							@Pc(1286) Class134 local1286 = Static384.aClass134_49;
							synchronized (Static384.aClass134_49) {
								local615 = (Class105) Static384.aClass134_49.method3266(this.aLong59);
							}
						}
						if (local615 == null || arg6.method4528(local615.P(), local32) != 0 || local623 != null && local623.anIntArrayArray5 != null && this.anIntArrayArray23 == null) {
							return null;
						}
					} else {
						@Pc(714) Class236[] local714 = new Class236[12];
						@Pc(721) int local721;
						for (local716 = 0; local716 < 12; local716++) {
							local721 = local38[local716];
							@Pc(741) Class236 local741;
							if ((local721 & 0x40000000) != 0) {
								local741 = arg10.method560(local721 & 0x3FFFFFFF).method3486(this.aBoolean116);
								if (local741 != null) {
									local714[local716] = local741;
								}
							} else if ((Integer.MIN_VALUE & local721) != 0) {
								local741 = arg16.method3687(local721 & 0x3FFFFFFF).method3868();
								if (local741 != null) {
									local714[local716] = local741;
								}
							}
						}
						@Pc(796) int local796;
						if (local623 != null && local623.anIntArrayArray5 != null) {
							for (local721 = 0; local721 < local623.anIntArrayArray5.length; local721++) {
								if (local623.anIntArrayArray5[local721] != null && local714[local721] != null) {
									local796 = local623.anIntArrayArray5[local721][0];
									@Pc(803) int local803 = local623.anIntArrayArray5[local721][1];
									@Pc(810) int local810 = local623.anIntArrayArray5[local721][2];
									@Pc(819) int local819 = local623.anIntArrayArray5[local721][3] << 3;
									@Pc(828) int local828 = local623.anIntArrayArray5[local721][4] << 3;
									@Pc(837) int local837 = local623.anIntArrayArray5[local721][5] << 3;
									if (this.anIntArrayArray23 == null) {
										this.anIntArrayArray23 = new int[local623.anIntArrayArray5.length][];
									}
									if (this.anIntArrayArray23[local721] == null) {
										@Pc(859) int[] local859 = this.anIntArrayArray23[local721] = new int[15];
										if (local819 == 0 && local828 == 0 && local837 == 0) {
											local859[13] = -local803;
											local859[14] = -local810;
											local859[12] = -local796;
											local859[0] = local859[4] = local859[8] = 32768;
										} else {
											@Pc(869) int local869 = Class183.anIntArray434[local819];
											@Pc(873) int local873 = Class183.anIntArray433[local819];
											@Pc(877) int local877 = Class183.anIntArray434[local828];
											@Pc(881) int local881 = Class183.anIntArray433[local828];
											@Pc(885) int local885 = Class183.anIntArray434[local837];
											@Pc(889) int local889 = Class183.anIntArray433[local837];
											@Pc(897) int local897 = local885 * local873 + 16384 >> 15;
											@Pc(905) int local905 = local873 * local889 + 16384 >> 15;
											local859[3] = local889 * local869 + 16384 >> 15;
											local859[1] = -local889 * local877 + local897 * local881 + 16384 >> 15;
											local859[5] = -local873;
											local859[8] = local877 * local869 + 16384 >> 15;
											local859[4] = local885 * local869 + 16384 >> 15;
											local859[6] = local877 * local905 + local885 * -local881 + 16384 >> 15;
											local859[0] = local877 * local885 + local905 * local881 + 16384 >> 15;
											local859[7] = local877 * local897 + -local881 * -local889 + 16384 >> 15;
											local859[2] = local869 * local881 + 16384 >> 15;
											local859[12] = local859[6] * -local810 + local859[0] * -local796 + local859[3] * -local803 + 16384 >> 15;
											local859[14] = -local810 * local859[8] + local859[2] * -local796 + local859[5] * -local803 + 16384 >> 15;
											local859[13] = local859[1] * -local796 + local859[4] * -local803 + local859[7] * -local810 + 16384 >> 15;
										}
										local859[10] = local803;
										local859[11] = local810;
										local859[9] = local796;
									}
									if (local819 != 0 || local828 != 0 || local837 != 0) {
										local714[local721].method5239(local819, local828, local837);
									}
									if (local796 != 0 || local803 != 0 || local810 != 0) {
										local714[local721].method5249(local796, local810, local803);
									}
								}
							}
						}
						@Pc(1186) Class236 local1186 = new Class236(local714, local714.length);
						@Pc(1190) int local1190 = local32 | 0x4000;
						local615 = arg6.method4540(local1186, local1190, Static86.anInt1856, 64, 850);
						for (local796 = 0; local796 < 5; local796++) {
							if (Static191.aShortArrayArray5[local796].length > this.anIntArray159[local796]) {
								local615.BA(Static401.aShortArray111[local796], Static191.aShortArrayArray5[local796][this.anIntArray159[local796]]);
							}
							if (this.anIntArray159[local796] < Static444.aShortArrayArray8[local796].length) {
								local615.BA(Static295.aShortArray84[local796], Static444.aShortArrayArray8[local796][this.anIntArray159[local796]]);
							}
						}
						local615.UA(local32);
						@Pc(1262) Class134 local1262 = Static384.aClass134_49;
						synchronized (Static384.aClass134_49) {
							Static384.aClass134_49.method3263(local35, local615);
						}
						this.aLong59 = local35;
					}
					break;
				}
				local669 = local38[local664];
				if ((local669 & 0x40000000) == 0) {
					if ((local669 & Integer.MIN_VALUE) != 0 && !arg16.method3687(local669 & 0x3FFFFFFF).method3869()) {
						local662 = true;
					}
				} else if (!arg10.method560(local669 & 0x3FFFFFFF).method3489(this.aBoolean116)) {
					local662 = true;
				}
				local664++;
			}
		}
		@Pc(1328) Class105 local1328 = local615.method3548((byte) 4, local32, true);
		if (!local146) {
			return local1328;
		}
		@Pc(1342) int local1342 = 0;
		local669 = 1;
		while (local153 > local1342) {
			if (Static362.aClass1_Sub2_Sub9Array3[local1342] != null) {
				local1328.method3547(Static5.anIntArray14[local1342], Static253.anIntArray386[local1342] - 1, Static253.anIntArray387[local1342], Static128.aClass1_Sub2_Sub9Array1[local1342], this.anIntArrayArray23 == null ? null : this.anIntArrayArray23[local1342], local669, Static362.aClass1_Sub2_Sub9Array3[local1342], Static365.anIntArray554[local1342], false);
			}
			local1342++;
			local669 <<= 0x1;
		}
		if (local353 != null && local363 != null) {
			local1328.method3541(local186, local359, local357, arg15 - 1, local361, local365, local363, arg1.aBooleanArray43, arg3 - 1, local353, local355, local347, local191, false);
		} else if (local353 != null) {
			local1328.method3539(local355, arg15 - 1, 0, local191, false, local347, local186, local353);
		} else if (local363 != null) {
			local1328.method3539(local365, arg3 - 1, 0, local361, false, local357, local359, local363);
		}
		for (local716 = 0; local716 < local153; local716++) {
			Static362.aClass1_Sub2_Sub9Array3[local716] = null;
			Static128.aClass1_Sub2_Sub9Array1[local716] = null;
			Static286.aClass223Array2[local716] = null;
		}
		return local1328;
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(IIILclient!mg;)V")
	public void method1649(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class158 arg2) {
		@Pc(7) int local7 = Static304.anIntArray455[arg1];
		if (this.anIntArray158[local7] != 0 && arg2.method3687(arg0) != null) {
			this.anIntArray158[local7] = arg0 | Integer.MIN_VALUE;
			this.method1643();
		}
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(BLclient!sm;ILclient!jq;ILclient!ya;IIIILclient!mg;I)Lclient!t;")
	public Class105 method1650(@OriginalArg(1) Class223 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class127 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class39 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(9) int arg7, @OriginalArg(10) Class158 arg8, @OriginalArg(11) int arg9) {
		@Pc(7) int local7 = 2048;
		@Pc(97) int local97;
		if (arg0 != null) {
			@Pc(11) boolean local11 = false;
			@Pc(13) boolean local13 = false;
			@Pc(15) boolean local15 = false;
			@Pc(17) boolean local17 = false;
			local7 = 2080;
			@Pc(32) int local32 = arg0.anIntArray557[arg9];
			@Pc(38) int local38 = local32 >>> 16;
			@Pc(42) int local42 = local32 & 0xFFFF;
			@Pc(47) Class1_Sub2_Sub9 local47 = arg2.method2976(local38);
			if (local47 != null) {
				local13 = local47.method2799(local42) | false;
				local11 = local47.method2800(local42) | false;
				local17 = local47.method2798(local42) | false;
				local15 = arg0.aBoolean424 | false;
			}
			if ((arg0.aBoolean422 || Static21.aBoolean16) && arg5 != -1 && arg0.anIntArray557.length > arg5) {
				local97 = arg0.anIntArray557[arg5];
				@Pc(101) int local101 = local97 >>> 16;
				@Pc(105) int local105 = local97 & 0xFFFF;
				@Pc(119) Class1_Sub2_Sub9 local119;
				if (local101 == local38) {
					local119 = local47;
				} else {
					local119 = arg2.method2976(local105 >>> 16);
				}
				if (local119 != null) {
					local13 |= local119.method2799(local105);
					local11 |= local119.method2800(local105);
					local17 |= local119.method2798(local105);
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
		@Pc(182) long local182 = (long) (arg6 << 16) | (long) arg3 << 32 | (long) arg7;
		@Pc(184) Class134 local184 = Static321.aClass134_43;
		@Pc(192) Class105 local192;
		synchronized (Static321.aClass134_43) {
			local192 = (Class105) Static321.aClass134_43.method3266(local182);
		}
		if (local192 == null || arg4.method4528(local192.P(), local7) != 0) {
			if (local192 != null) {
				local7 = arg4.method4530(local7, local192.P());
			}
			@Pc(219) Class236[] local219 = new Class236[3];
			local97 = 0;
			if (!arg8.method3687(arg7).method3870() || !arg8.method3687(arg6).method3870() || !arg8.method3687(arg3).method3870()) {
				return null;
			}
			@Pc(251) Class236 local251 = arg8.method3687(arg7).method3872();
			if (local251 != null) {
				local97++;
				local219[0] = local251;
			}
			local251 = arg8.method3687(arg6).method3872();
			if (local251 != null) {
				local219[local97++] = local251;
			}
			local251 = arg8.method3687(arg3).method3872();
			if (local251 != null) {
				local219[local97++] = local251;
			}
			local251 = new Class236(local219, local97);
			@Pc(296) int local296 = local7 | 0x4000;
			local192 = arg4.method4540(local251, local296, Static86.anInt1856, 64, 768);
			for (@Pc(306) int local306 = 0; local306 < 5; local306++) {
				if (this.anIntArray159[local306] < Static191.aShortArrayArray5[local306].length) {
					local192.BA(Static401.aShortArray111[local306], Static191.aShortArrayArray5[local306][this.anIntArray159[local306]]);
				}
				if (Static444.aShortArrayArray8[local306].length > this.anIntArray159[local306]) {
					local192.BA(Static295.aShortArray84[local306], Static444.aShortArrayArray8[local306][this.anIntArray159[local306]]);
				}
			}
			local192.UA(local7);
			@Pc(369) Class134 local369 = Static321.aClass134_43;
			synchronized (Static321.aClass134_43) {
				Static321.aClass134_43.method3263(local182, local192);
			}
		}
		if (arg0 == null) {
			return local192;
		} else {
			local192 = local192.method3548((byte) 4, local7, true);
			return arg0.method5048(arg1, 2048, arg5, arg9, local192);
		}
	}
}
