import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sq")
public final class Class325 {

	@OriginalMember(owner = "client!sq", name = "f", descriptor = "J")
	private long aLong249;

	@OriginalMember(owner = "client!sq", name = "g", descriptor = "[I")
	private int[] anIntArray692;

	@OriginalMember(owner = "client!sq", name = "i", descriptor = "[I")
	public int[] anIntArray693;

	@OriginalMember(owner = "client!sq", name = "l", descriptor = "[Lclient!fn;")
	private Class110[] aClass110Array1;

	@OriginalMember(owner = "client!sq", name = "p", descriptor = "I")
	private int anInt9421;

	@OriginalMember(owner = "client!sq", name = "r", descriptor = "J")
	private long aLong250;

	@OriginalMember(owner = "client!sq", name = "t", descriptor = "Z")
	public boolean aBoolean661;

	@OriginalMember(owner = "client!sq", name = "u", descriptor = "I")
	public int anInt9424 = -1;

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(III)V")
	public void method7780(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray693[arg0] = arg1;
		this.method7781();
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(I)V")
	private void method7781() {
		this.aLong249 = -1L;
		@Pc(14) long[] local14 = Class70.aLongArray1;
		this.aLong249 = this.aLong249 >>> 8 ^ local14[(int) (((long) (this.anInt9421 >> 8) ^ this.aLong249) & 0xFFL)];
		this.aLong249 = local14[(int) ((this.aLong249 ^ (long) this.anInt9421) & 0xFFL)] ^ this.aLong249 >>> 8;
		for (@Pc(54) int local54 = 0; local54 < this.anIntArray692.length; local54++) {
			this.aLong249 = this.aLong249 >>> 8 ^ local14[(int) ((this.aLong249 ^ (long) (this.anIntArray692[local54] >> 24)) & 0xFFL)];
			this.aLong249 = local14[(int) (((long) (this.anIntArray692[local54] >> 16) ^ this.aLong249) & 0xFFL)] ^ this.aLong249 >>> 8;
			this.aLong249 = this.aLong249 >>> 8 ^ local14[(int) ((this.aLong249 ^ (long) (this.anIntArray692[local54] >> 8)) & 0xFFL)];
			this.aLong249 = this.aLong249 >>> 8 ^ local14[(int) (((long) this.anIntArray692[local54] ^ this.aLong249) & 0xFFL)];
		}
		@Pc(153) int local153;
		if (this.aClass110Array1 != null) {
			for (local153 = 0; local153 < this.aClass110Array1.length; local153++) {
				if (this.aClass110Array1[local153] != null) {
					@Pc(169) int[] local169;
					@Pc(175) int[] local175;
					if (this.aBoolean661) {
						local169 = this.aClass110Array1[local153].anIntArray271;
						local175 = this.aClass110Array1[local153].anIntArray273;
					} else {
						local169 = this.aClass110Array1[local153].anIntArray269;
						local175 = this.aClass110Array1[local153].anIntArray270;
					}
					@Pc(193) int local193;
					if (local169 != null) {
						for (local193 = 0; local193 < local169.length; local193++) {
							this.aLong249 = this.aLong249 >>> 8 ^ local14[(int) ((this.aLong249 ^ (long) (local169[local193] >> 8)) & 0xFFL)];
							this.aLong249 = local14[(int) ((this.aLong249 ^ (long) local169[local193]) & 0xFFL)] ^ this.aLong249 >>> 8;
						}
					}
					if (local175 != null) {
						for (local193 = 0; local193 < local175.length; local193++) {
							this.aLong249 = this.aLong249 >>> 8 ^ local14[(int) ((this.aLong249 ^ (long) (local175[local193] >> 8)) & 0xFFL)];
							this.aLong249 = local14[(int) (((long) local175[local193] ^ this.aLong249) & 0xFFL)] ^ this.aLong249 >>> 8;
						}
					}
					if (this.aClass110Array1[local153].aShortArray54 != null) {
						for (local193 = 0; local193 < this.aClass110Array1[local153].aShortArray54.length; local193++) {
							this.aLong249 = this.aLong249 >>> 8 ^ local14[(int) ((this.aLong249 ^ (long) (this.aClass110Array1[local153].aShortArray54[local193] >> 8)) & 0xFFL)];
							this.aLong249 = this.aLong249 >>> 8 ^ local14[(int) (((long) this.aClass110Array1[local153].aShortArray54[local193] ^ this.aLong249) & 0xFFL)];
						}
					}
					if (this.aClass110Array1[local153].aShortArray55 != null) {
						for (local193 = 0; local193 < this.aClass110Array1[local153].aShortArray55.length; local193++) {
							this.aLong249 = this.aLong249 >>> 8 ^ local14[(int) (((long) (this.aClass110Array1[local153].aShortArray55[local193] >> 8) ^ this.aLong249) & 0xFFL)];
							this.aLong249 = local14[(int) ((this.aLong249 ^ (long) this.aClass110Array1[local153].aShortArray55[local193]) & 0xFFL)] ^ this.aLong249 >>> 8;
						}
					}
				}
			}
		}
		for (local153 = 0; local153 < 5; local153++) {
			this.aLong249 = this.aLong249 >>> 8 ^ local14[(int) ((this.aLong249 ^ (long) this.anIntArray693[local153]) & 0xFFL)];
		}
		this.aLong249 = this.aLong249 >>> 8 ^ local14[(int) ((this.aLong249 ^ (long) (this.aBoolean661 ? 1 : 0)) & 0xFFL)];
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(ILclient!kf;Lclient!pf;I[Lclient!uga;ILclient!ha;Lclient!bk;Lclient!jv;ILclient!pf;ZIILclient!ob;Lclient!ib;I[ILclient!nj;II)Lclient!ka;")
	public Class80 method7783(@OriginalArg(0) int arg0, @OriginalArg(1) Class197 arg1, @OriginalArg(2) Class275 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class351[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class137 arg6, @OriginalArg(7) Class37 arg7, @OriginalArg(8) Class191 arg8, @OriginalArg(9) int arg9, @OriginalArg(10) Class275 arg10, @OriginalArg(12) int arg11, @OriginalArg(13) int arg12, @OriginalArg(14) Interface20 arg13, @OriginalArg(15) Class154 arg14, @OriginalArg(17) int[] arg15, @OriginalArg(18) Class247 arg16, @OriginalArg(19) int arg17, @OriginalArg(20) int arg18) {
		if (this.anInt9424 != -1) {
			return arg7.method974(this.anInt9424).method7136((Class183) null, arg9, arg1, arg10, arg15, arg8, arg2, arg11, arg12, arg0, arg13, arg18, arg17, arg5, arg6, arg4, arg3);
		}
		@Pc(38) int local38 = arg11;
		@Pc(41) long local41 = this.aLong249;
		@Pc(44) int[] local44 = this.anIntArray692;
		@Pc(46) boolean local46 = false;
		@Pc(48) boolean local48 = false;
		if (arg10 != null && (arg10.anInt7926 >= 0 || arg10.anInt7924 >= 0)) {
			local44 = new int[this.anIntArray692.length];
			for (@Pc(69) int local69 = 0; local69 < local44.length; local69++) {
				local44[local69] = this.anIntArray692[local69];
			}
			if (arg10.anInt7926 >= 0) {
				if (arg10.anInt7926 == 65535) {
					local44[5] = 0;
					local46 = true;
					local41 ^= 0xFFFFFFFF00000000L;
				} else {
					local44[5] = arg10.anInt7926 | 0x40000000;
					local41 ^= (long) local44[5] << 32;
				}
			}
			if (arg10.anInt7924 >= 0) {
				local48 = true;
				if (arg10.anInt7924 == 65535) {
					local44[3] = 0;
					local41 ^= 0xFFFFFFFFL;
				} else {
					local44[3] = arg10.anInt7924 | 0x40000000;
					local41 ^= (long) local44[3];
				}
			}
		}
		@Pc(156) boolean local156 = false;
		@Pc(158) boolean local158 = false;
		@Pc(160) boolean local160 = false;
		@Pc(168) boolean local168 = arg10 != null || arg2 != null;
		@Pc(175) int local175 = arg4 == null ? 0 : arg4.length;
		@Pc(209) int local209;
		@Pc(214) int local214;
		for (@Pc(177) int local177 = 0; local177 < local175; local177++) {
			Static202.aClass14_Sub3_Sub1Array2[local177] = null;
			if (arg4[local177] != null) {
				@Pc(195) Class275 local195 = arg8.method4322(arg4[local177].anInt10181);
				if (local195.anIntArray598 != null) {
					local168 = true;
					Static297.aClass275Array2[local177] = local195;
					local209 = arg4[local177].anInt10180;
					local214 = arg4[local177].anInt10182;
					@Pc(219) int local219 = local195.anIntArray598[local209];
					Static202.aClass14_Sub3_Sub1Array2[local177] = arg8.method4319(local219 >>> 16);
					@Pc(232) int local232 = local219 & 0xFFFF;
					Static401.anIntArray536[local177] = local232;
					if (Static202.aClass14_Sub3_Sub1Array2[local177] != null) {
						local158 |= Static202.aClass14_Sub3_Sub1Array2[local177].method216(local232);
						local156 |= Static202.aClass14_Sub3_Sub1Array2[local177].method217(local232);
						local160 |= Static202.aClass14_Sub3_Sub1Array2[local177].method213(local232);
					}
					if ((local195.aBoolean543 || Static394.aBoolean505) && local214 != -1 && local195.anIntArray598.length > local214) {
						Static126.anIntArray211[local177] = local195.anIntArray599[local209];
						Static387.anIntArray517[local177] = arg4[local177].anInt10178;
						@Pc(302) int local302 = local195.anIntArray598[local214];
						Static110.aClass14_Sub3_Sub1Array1[local177] = arg8.method4319(local302 >>> 16);
						@Pc(315) int local315 = local302 & 0xFFFF;
						Static471.anIntArray623[local177] = local315;
						if (Static110.aClass14_Sub3_Sub1Array1[local177] != null) {
							local158 |= Static110.aClass14_Sub3_Sub1Array1[local177].method216(local315);
							local156 |= Static110.aClass14_Sub3_Sub1Array1[local177].method217(local315);
							local160 |= Static110.aClass14_Sub3_Sub1Array1[local177].method213(local315);
						}
					} else {
						Static126.anIntArray211[local177] = 0;
						Static387.anIntArray517[local177] = 0;
						Static110.aClass14_Sub3_Sub1Array1[local177] = null;
						Static471.anIntArray623[local177] = -1;
					}
				}
			}
		}
		@Pc(380) int local380 = -1;
		local209 = -1;
		local214 = 0;
		@Pc(386) Class14_Sub3_Sub1 local386 = null;
		@Pc(388) Class14_Sub3_Sub1 local388 = null;
		@Pc(390) int local390 = -1;
		@Pc(392) int local392 = -1;
		@Pc(394) int local394 = 0;
		@Pc(396) Class14_Sub3_Sub1 local396 = null;
		@Pc(398) Class14_Sub3_Sub1 local398 = null;
		if (local168) {
			@Pc(411) int local411;
			@Pc(474) int local474;
			if (arg10 != null) {
				local380 = arg10.anIntArray598[arg5];
				local411 = local380 >>> 16;
				local380 &= 0xFFFF;
				local386 = arg8.method4319(local411);
				if (local386 != null) {
					local158 |= local386.method216(local380);
					local156 |= local386.method217(local380);
					local160 |= local386.method213(local380);
				}
				if ((arg10.aBoolean543 || Static394.aBoolean505) && arg0 != -1 && arg10.anIntArray598.length > arg0) {
					local209 = arg10.anIntArray598[arg0];
					local214 = arg10.anIntArray599[arg5];
					local474 = local209 >>> 16;
					local388 = local411 == local474 ? local386 : arg8.method4319(local474);
					local209 &= 0xFFFF;
					if (local388 != null) {
						local158 |= local388.method216(local209);
						local156 |= local388.method217(local209);
						local160 |= local388.method213(local209);
					}
				}
			}
			local38 = arg11 | 0x20;
			if (arg2 != null) {
				local390 = arg2.anIntArray598[arg12];
				local411 = local390 >>> 16;
				local390 &= 0xFFFF;
				local396 = arg8.method4319(local411);
				if (local396 != null) {
					local158 |= local396.method216(local390);
					local156 |= local396.method217(local390);
					local160 |= local396.method213(local390);
				}
				if ((arg2.aBoolean543 || Static394.aBoolean505) && arg9 != -1 && arg2.anIntArray598.length > arg9) {
					local392 = arg2.anIntArray598[arg9];
					local394 = arg2.anIntArray599[arg12];
					local474 = local392 >>> 16;
					local398 = local411 == local474 ? local396 : arg8.method4319(local474);
					local392 &= 0xFFFF;
					if (local398 != null) {
						local158 |= local398.method216(local392);
						local156 |= local398.method217(local392);
						local160 |= local398.method213(local392);
					}
				}
			}
			if (local158) {
				local38 |= 0x80;
			}
			if (local156) {
				local38 |= 0x100;
			}
			if (local160) {
				local38 |= 0x400;
			}
		}
		@Pc(652) Class264 local652 = Static324.aClass264_38;
		@Pc(660) Class80 local660;
		synchronized (Static324.aClass264_38) {
			local660 = (Class80) Static324.aClass264_38.method6367(local41);
		}
		@Pc(668) Class132 local668 = null;
		if (this.anInt9421 != -1) {
			local668 = arg1.method4401(this.anInt9421);
		}
		@Pc(699) boolean local699;
		@Pc(701) int local701;
		@Pc(707) int local707;
		@Pc(799) int local799;
		@Pc(805) int local805;
		@Pc(908) int local908;
		if (local660 == null || arg6.method7922(local660.ua(), local38) != 0) {
			if (local660 != null) {
				local38 = arg6.method7943(local38, local660.ua());
			}
			local699 = false;
			local701 = 0;
			while (true) {
				if (local44.length <= local701) {
					if (local699) {
						if (this.aLong250 != -1L) {
							@Pc(1113) Class264 local1113 = Static324.aClass264_38;
							synchronized (Static324.aClass264_38) {
								local660 = (Class80) Static324.aClass264_38.method6367(this.aLong250);
							}
						}
						if (local660 == null || arg6.method7922(local660.ua(), local38) != 0) {
							return null;
						}
					} else {
						@Pc(797) Class67[] local797 = new Class67[local44.length];
						for (local799 = 0; local799 < local44.length; local799++) {
							local805 = local44[local799];
							@Pc(807) Class110 local807 = null;
							@Pc(823) boolean local823 = local799 == 5 && local46 || local799 == 3 && local48;
							@Pc(843) Class67 local843;
							if ((local805 & 0x40000000) != 0) {
								if (!local823 && this.aClass110Array1 != null && this.aClass110Array1[local799] != null) {
									local807 = this.aClass110Array1[local799];
								}
								local843 = arg16.method5962(local805 & 0x3FFFFFFF).method812(this.aBoolean661, local807);
								if (local843 != null) {
									local797[local799] = local843;
								}
							} else if ((local805 & Integer.MIN_VALUE) != 0) {
								local843 = arg14.method3557(local805 & 0x3FFFFFFF).method4041();
								if (local843 != null) {
									local797[local799] = local843;
								}
							}
						}
						@Pc(910) int local910;
						if (local668 != null && local668.anIntArrayArray22 != null) {
							for (local805 = 0; local805 < local668.anIntArrayArray22.length; local805++) {
								if (local797[local805] != null) {
									local908 = 0;
									local910 = 0;
									@Pc(912) int local912 = 0;
									@Pc(914) int local914 = 0;
									@Pc(916) int local916 = 0;
									@Pc(918) int local918 = 0;
									if (local668.anIntArrayArray22[local805] != null) {
										local910 = local668.anIntArrayArray22[local805][1];
										local908 = local668.anIntArrayArray22[local805][0];
										local914 = local668.anIntArrayArray22[local805][3] << 3;
										local916 = local668.anIntArrayArray22[local805][4] << 3;
										local918 = local668.anIntArrayArray22[local805][5] << 3;
										local912 = local668.anIntArrayArray22[local805][2];
									}
									if (local914 != 0 || local916 != 0 || local918 != 0) {
										local797[local805].method1722(local916, local918, local914);
									}
									if (local908 != 0 || local910 != 0 || local912 != 0) {
										local797[local805].method1725(local912, local910, local908);
									}
								}
							}
						}
						@Pc(1015) int local1015 = local38 | 0x4000;
						@Pc(1022) Class67 local1022 = new Class67(local797, local797.length);
						local660 = arg6.method7901(local1022, local1015, Static114.anInt2294, 64, 850);
						for (local908 = 0; local908 < 5; local908++) {
							for (local910 = 0; local910 < Static509.aShortArrayArrayArray4.length; local910++) {
								if (this.anIntArray693[local908] < Static509.aShortArrayArrayArray4[local910][local908].length) {
									local660.ia(Static582.aShortArrayArray18[local910][local908], Static509.aShortArrayArrayArray4[local910][local908][this.anIntArray693[local908]]);
								}
							}
						}
						local660.s(local38);
						@Pc(1088) Class264 local1088 = Static324.aClass264_38;
						synchronized (Static324.aClass264_38) {
							Static324.aClass264_38.method6364(local41, local660);
						}
						this.aLong250 = local41;
					}
					break;
				}
				local707 = local44[local701];
				@Pc(709) Class110 local709 = null;
				@Pc(727) boolean local727 = local701 == 5 && local46 || local701 == 3 && local48;
				if ((local707 & 0x40000000) != 0) {
					if (!local727 && this.aClass110Array1 != null && this.aClass110Array1[local701] != null) {
						local709 = this.aClass110Array1[local701];
					}
					if (!arg16.method5962(local707 & 0x3FFFFFFF).method817(this.aBoolean661, local709)) {
						local699 = true;
					}
				} else if ((Integer.MIN_VALUE & local707) != 0 && !arg14.method3557(local707 & 0x3FFFFFFF).method4047()) {
					local699 = true;
				}
				local701++;
			}
		}
		@Pc(1144) Class80 local1144 = local660.method6378((byte) 4, local38, true);
		local699 = false;
		if (arg15 != null) {
			for (local701 = 0; local701 < arg15.length; local701++) {
				if (arg15[local701] != -1) {
					local699 = true;
				}
			}
		}
		if (!local168 && !local699) {
			return local1144;
		}
		@Pc(1176) Class26[] local1176 = null;
		if (local668 != null) {
			local1176 = local668.method3026(arg6);
		}
		if (local699 && local1176 != null) {
			for (local707 = 0; local707 < arg15.length; local707++) {
				if (local1176[local707] != null) {
					local1144.method6382(local1176[local707], 0x1 << local707, true);
				}
			}
		}
		local707 = 0;
		local799 = 1;
		while (local707 < local175) {
			if (Static202.aClass14_Sub3_Sub1Array2[local707] != null) {
				local1144.method6388(Static202.aClass14_Sub3_Sub1Array2[local707], false, Static110.aClass14_Sub3_Sub1Array1[local707], (int[]) null, local799, Static387.anIntArray517[local707] - 1, Static401.anIntArray536[local707], Static471.anIntArray623[local707], Static126.anIntArray211[local707]);
			}
			local799 <<= 0x1;
			local707++;
		}
		if (local699) {
			for (local805 = 0; local805 < arg15.length; local805++) {
				if (arg15[local805] != -1) {
					local908 = arg15[local805] - arg3;
					local908 &= 0x3FFF;
					@Pc(1290) Class26 local1290 = arg6.method7918();
					local1290.method6444(local908);
					local1144.method6382(local1290, 0x1 << local805, false);
				}
			}
		}
		if (local699 && local1176 != null) {
			for (local805 = 0; local805 < arg15.length; local805++) {
				if (local1176[local805] != null) {
					local1144.method6382(local1176[local805], 0x1 << local805, false);
				}
			}
		}
		if (local386 != null && local396 != null) {
			local1144.method6374(false, local396, local209, local388, local380, local392, arg17 - 1, local394, arg18 - 1, local386, arg10.aBooleanArray19, local398, local214, local390);
		} else if (local386 != null) {
			local1144.method6387(local388, local380, arg18 - 1, local209, local214, false, local386, 0);
		} else if (local396 != null) {
			local1144.method6387(local398, local390, arg17 - 1, local392, local394, false, local396, 0);
		}
		for (local805 = 0; local805 < local175; local805++) {
			Static202.aClass14_Sub3_Sub1Array2[local805] = null;
			Static110.aClass14_Sub3_Sub1Array1[local805] = null;
			Static297.aClass275Array2[local805] = null;
		}
		return local1144;
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(IILclient!ib;IILclient!jv;Lclient!pf;Lclient!ha;IIII)Lclient!ka;")
	public Class80 method7784(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class154 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class191 arg4, @OriginalArg(6) Class275 arg5, @OriginalArg(7) Class137 arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		@Pc(7) int local7 = 2048;
		@Pc(99) int local99;
		@Pc(38) int local38;
		if (arg5 != null) {
			@Pc(11) boolean local11 = false;
			@Pc(13) boolean local13 = false;
			@Pc(15) boolean local15 = false;
			@Pc(17) boolean local17 = false;
			@Pc(28) int local28 = arg5.anIntArray598[arg7];
			local7 = 2080;
			local38 = local28 >>> 16;
			@Pc(43) Class14_Sub3_Sub1 local43 = arg4.method4319(local38);
			@Pc(47) int local47 = local28 & 0xFFFF;
			if (local43 != null) {
				local13 = local43.method216(local47) | false;
				local11 = local43.method217(local47) | false;
				local17 = local43.method213(local47) | false;
				local15 = arg5.aBoolean544 | false;
			}
			if ((arg5.aBoolean543 || Static394.aBoolean505) && arg0 != -1 && arg5.anIntArray598.length > arg0) {
				local99 = arg5.anIntArray598[arg0];
				@Pc(103) int local103 = local99 >>> 16;
				@Pc(107) int local107 = local99 & 0xFFFF;
				@Pc(112) Class14_Sub3_Sub1 local112;
				if (local38 == local103) {
					local112 = local43;
				} else {
					local112 = arg4.method4319(local107 >>> 16);
				}
				if (local112 != null) {
					local13 |= local112.method216(local107);
					local11 |= local112.method217(local107);
					local17 |= local112.method213(local107);
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
		@Pc(180) long local180 = (long) (arg9 << 16) | (long) arg8 << 32 | (long) arg1;
		@Pc(182) Class264 local182 = Static263.aClass264_31;
		@Pc(190) Class80 local190;
		synchronized (Static263.aClass264_31) {
			local190 = (Class80) Static263.aClass264_31.method6367(local180);
		}
		if (local190 == null || arg6.method7922(local190.ua(), local7) != 0) {
			if (local190 != null) {
				local7 = arg6.method7943(local7, local190.ua());
			}
			@Pc(225) Class67[] local225 = new Class67[3];
			local99 = 0;
			if (!arg2.method3557(arg1).method4038() || !arg2.method3557(arg9).method4038() || !arg2.method3557(arg8).method4038()) {
				return null;
			}
			@Pc(259) Class67 local259 = arg2.method3557(arg1).method4045();
			if (local259 != null) {
				local99++;
				local225[0] = local259;
			}
			local259 = arg2.method3557(arg9).method4045();
			if (local259 != null) {
				local225[local99++] = local259;
			}
			local259 = arg2.method3557(arg8).method4045();
			if (local259 != null) {
				local225[local99++] = local259;
			}
			@Pc(300) int local300 = local7 | 0x4000;
			local259 = new Class67(local225, local99);
			local190 = arg6.method7901(local259, local300, Static114.anInt2294, 64, 768);
			for (@Pc(316) int local316 = 0; local316 < 5; local316++) {
				for (local38 = 0; local38 < Static509.aShortArrayArrayArray4.length; local38++) {
					if (this.anIntArray693[local316] < Static509.aShortArrayArrayArray4[local38][local316].length) {
						local190.ia(Static582.aShortArrayArray18[local38][local316], Static509.aShortArrayArrayArray4[local38][local316][this.anIntArray693[local316]]);
					}
				}
			}
			local190.s(local7);
			@Pc(368) Class264 local368 = Static263.aClass264_31;
			synchronized (Static263.aClass264_31) {
				Static263.aClass264_31.method6364(local180, local190);
			}
		}
		if (arg5 == null) {
			return local190;
		} else {
			local190 = local190.method6378((byte) 4, local7, true);
			return arg5.method6543(local190, 2048, arg3, arg7, arg0);
		}
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(ILclient!nj;II)V")
	public void method7785(@OriginalArg(0) int arg0, @OriginalArg(1) Class247 arg1, @OriginalArg(3) int arg2) {
		if (arg2 == -1) {
			this.anIntArray692[arg0] = 0;
		} else if (arg1.method5962(arg2) != null) {
			this.anIntArray692[arg0] = arg2 | 0x40000000;
			this.method7781();
		}
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(I[Lclient!fn;IIZ[I[I)V")
	public void method7787(@OriginalArg(0) int arg0, @OriginalArg(1) Class110[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int[] arg4, @OriginalArg(6) int[] arg5) {
		if (this.anInt9421 != arg0) {
			this.anInt9421 = arg0;
		}
		this.aBoolean661 = arg3;
		this.anIntArray692 = arg4;
		this.aClass110Array1 = arg1;
		this.anIntArray693 = arg5;
		this.anInt9424 = arg2;
		this.method7781();
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(Lclient!ib;III)V")
	public void method7788(@OriginalArg(0) Class154 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(15) int local15 = Static464.anIntArray618[arg1];
		if (arg0.method3557(arg2) != null) {
			this.anIntArray692[local15] = Integer.MIN_VALUE | arg2;
			this.method7781();
		}
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(ILclient!jv;Lclient!bk;Lclient!nj;Lclient!ob;Lclient!ha;IIBLclient!ib;ILclient!pf;)Lclient!ka;")
	public Class80 method7789(@OriginalArg(0) int arg0, @OriginalArg(1) Class191 arg1, @OriginalArg(2) Class37 arg2, @OriginalArg(3) Class247 arg3, @OriginalArg(4) Interface20 arg4, @OriginalArg(5) Class137 arg5, @OriginalArg(7) int arg6, @OriginalArg(9) Class154 arg7, @OriginalArg(10) int arg8, @OriginalArg(11) Class275 arg9) {
		if (this.anInt9424 != -1) {
			return arg2.method974(this.anInt9424).method7125(arg6, arg8, arg9, (Class183) null, arg5, arg1, arg0, arg4);
		}
		@Pc(28) int local28 = 2048;
		@Pc(36) boolean local36;
		@Pc(55) int local55;
		@Pc(115) int local115;
		@Pc(59) int local59;
		@Pc(119) int local119;
		if (arg9 != null) {
			@Pc(32) boolean local32 = false;
			@Pc(34) boolean local34 = false;
			local36 = false;
			@Pc(38) boolean local38 = false;
			local28 = 2080;
			local55 = arg9.anIntArray598[arg8];
			local59 = local55 >>> 16;
			@Pc(63) int local63 = local55 & 0xFFFF;
			@Pc(68) Class14_Sub3_Sub1 local68 = arg1.method4319(local59);
			if (local68 != null) {
				local34 = local68.method216(local63) | false;
				local32 = local68.method217(local63) | false;
				local38 = local68.method213(local63) | false;
				local36 = arg9.aBoolean544 | false;
			}
			if ((arg9.aBoolean543 || Static394.aBoolean505) && arg0 != -1 && arg0 < arg9.anIntArray598.length) {
				local115 = arg9.anIntArray598[arg0];
				local119 = local115 >>> 16;
				@Pc(133) Class14_Sub3_Sub1 local133 = local59 == local119 ? local68 : arg1.method4319(local119);
				@Pc(137) int local137 = local115 & 0xFFFF;
				if (local133 != null) {
					local34 |= local133.method216(local137);
					local32 |= local133.method217(local137);
					local38 |= local133.method213(local137);
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
		@Pc(186) Class264 local186 = Static263.aClass264_31;
		@Pc(203) Class80 local203;
		synchronized (Static263.aClass264_31) {
			local203 = (Class80) Static263.aClass264_31.method6367(this.aLong249);
		}
		if (local203 == null || arg5.method7922(local203.ua(), local28) != 0) {
			if (local203 != null) {
				local28 = arg5.method7943(local28, local203.ua());
			}
			local36 = false;
			for (@Pc(234) int local234 = 0; local234 < this.anIntArray692.length; local234++) {
				local55 = this.anIntArray692[local234];
				@Pc(243) Class110 local243 = null;
				if ((local55 & 0x40000000) != 0) {
					if (this.aClass110Array1 != null && this.aClass110Array1[local234] != null) {
						local243 = this.aClass110Array1[local234];
					}
					if (!arg3.method5962(local55 & 0x3FFFFFFF).method806(this.aBoolean661, local243)) {
						local36 = true;
					}
				} else if ((local55 & Integer.MIN_VALUE) != 0 && !arg7.method3557(local55 & 0x3FFFFFFF).method4038()) {
					local36 = true;
				}
			}
			if (local36) {
				return null;
			}
			@Pc(310) Class67[] local310 = new Class67[this.anIntArray692.length];
			local115 = 0;
			for (@Pc(314) int local314 = 0; local314 < this.anIntArray692.length; local314++) {
				@Pc(321) int local321 = this.anIntArray692[local314];
				@Pc(323) Class110 local323 = null;
				@Pc(352) Class67 local352;
				if ((local321 & 0x40000000) != 0) {
					if (this.aClass110Array1 != null && this.aClass110Array1[local314] != null) {
						local323 = this.aClass110Array1[local314];
					}
					local352 = arg3.method5962(local321 & 0x3FFFFFFF).method814(this.aBoolean661, local323);
					if (local352 != null) {
						local310[local115++] = local352;
					}
				} else if ((Integer.MIN_VALUE & local321) != 0) {
					local352 = arg7.method3557(local321 & 0x3FFFFFFF).method4045();
					if (local352 != null) {
						local310[local115++] = local352;
					}
				}
			}
			@Pc(390) int local390 = local28 | 0x4000;
			@Pc(396) Class67 local396 = new Class67(local310, local115);
			local203 = arg5.method7901(local396, local390, Static114.anInt2294, 64, 768);
			for (local59 = 0; local59 < 5; local59++) {
				for (local119 = 0; local119 < Static509.aShortArrayArrayArray4.length; local119++) {
					if (Static509.aShortArrayArrayArray4[local119][local59].length > this.anIntArray693[local59]) {
						local203.ia(Static582.aShortArrayArray18[local119][local59], Static509.aShortArrayArrayArray4[local119][local59][this.anIntArray693[local59]]);
					}
				}
			}
			local203.s(local28);
			@Pc(458) Class264 local458 = Static263.aClass264_31;
			synchronized (Static263.aClass264_31) {
				Static263.aClass264_31.method6364(this.aLong249, local203);
			}
		}
		if (arg9 == null) {
			return local203;
		} else {
			local203.method6378((byte) 4, local28, true);
			return arg9.method6543(local203, 2048, arg6, arg8, arg0);
		}
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(IZ)V")
	public void method7790(@OriginalArg(1) boolean arg0) {
		this.aBoolean661 = arg0;
		this.method7781();
	}
}
