import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cn")
public final class Class33 {

	@OriginalMember(owner = "client!cn", name = "c", descriptor = "[I")
	public static final int[] anIntArray53 = new int[256];

	@OriginalMember(owner = "client!cn", name = "b", descriptor = "J")
	private long aLong31;

	@OriginalMember(owner = "client!cn", name = "e", descriptor = "Z")
	public boolean aBoolean93;

	@OriginalMember(owner = "client!cn", name = "h", descriptor = "[[I")
	private int[][] anIntArrayArray27;

	@OriginalMember(owner = "client!cn", name = "m", descriptor = "[I")
	private int[] anIntArray55;

	@OriginalMember(owner = "client!cn", name = "o", descriptor = "J")
	private long aLong32;

	@OriginalMember(owner = "client!cn", name = "q", descriptor = "[I")
	public int[] anIntArray56;

	@OriginalMember(owner = "client!cn", name = "r", descriptor = "I")
	private int anInt1244;

	@OriginalMember(owner = "client!cn", name = "n", descriptor = "I")
	public int anInt1242 = -1;

	static {
		for (@Pc(58) int local58 = 0; local58 < 256; local58++) {
			@Pc(61) int local61 = local58;
			for (@Pc(63) int local63 = 0; local63 < 8; local63++) {
				if ((local61 & 0x1) == 1) {
					local61 = local61 >>> 1 ^ 0xEDB88320;
				} else {
					local61 >>>= 0x1;
				}
			}
			anIntArray53[local58] = local61;
		}
	}

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(Z)V")
	private void method921() {
		@Pc(13) long[] local13 = Class4_Sub4_Sub6.aLongArray3;
		this.aLong31 = -1L;
		this.aLong31 = local13[(int) (((long) (this.anInt1244 >> 8) ^ this.aLong31) & 0xFFL)] ^ this.aLong31 >>> 8;
		this.aLong31 = local13[(int) ((this.aLong31 ^ (long) this.anInt1244) & 0xFFL)] ^ this.aLong31 >>> 8;
		for (@Pc(56) int local56 = 0; local56 < 12; local56++) {
			this.aLong31 = this.aLong31 >>> 8 ^ local13[(int) ((this.aLong31 ^ (long) (this.anIntArray55[local56] >> 24)) & 0xFFL)];
			this.aLong31 = this.aLong31 >>> 8 ^ local13[(int) ((this.aLong31 ^ (long) (this.anIntArray55[local56] >> 16)) & 0xFFL)];
			this.aLong31 = local13[(int) (((long) (this.anIntArray55[local56] >> 8) ^ this.aLong31) & 0xFFL)] ^ this.aLong31 >>> 8;
			this.aLong31 = this.aLong31 >>> 8 ^ local13[(int) (((long) this.anIntArray55[local56] ^ this.aLong31) & 0xFFL)];
		}
		for (@Pc(150) int local150 = 0; local150 < 5; local150++) {
			this.aLong31 = local13[(int) ((this.aLong31 ^ (long) this.anIntArray56[local150]) & 0xFFL)] ^ this.aLong31 >>> 8;
		}
		this.aLong31 = this.aLong31 >>> 8 ^ local13[(int) (((long) (this.aBoolean93 ? 1 : 0) ^ this.aLong31) & 0xFFL)];
	}

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(IIILclient!vq;IIILclient!b;II)Lclient!ni;")
	public Class38 method922(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class47 arg2, @OriginalArg(4) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) Class14 arg5, @OriginalArg(8) int arg6, @OriginalArg(9) int arg7) {
		@Pc(12) int local12 = 1024;
		@Pc(37) int local37;
		@Pc(41) int local41;
		if (arg5 != null) {
			@Pc(16) boolean local16 = false;
			@Pc(18) boolean local18 = false;
			@Pc(20) boolean local20 = false;
			local12 = 1056;
			local37 = arg5.anIntArray12[arg6];
			local41 = local37 >>> 16;
			@Pc(45) int local45 = local37 & 0xFFFF;
			@Pc(49) Class4_Sub4_Sub15 local49 = Static287.method3916(local41);
			if (local49 != null) {
				local18 = local49.method4670(local45) | false;
				local16 = local49.method4673(local45) | false;
				local20 = arg5.aBoolean29 | false;
			}
			if ((arg5.aBoolean30 || Static246.aBoolean378) && arg0 != -1 && arg5.anIntArray12.length > arg0) {
				@Pc(89) int local89 = arg5.anIntArray12[arg0];
				@Pc(93) int local93 = local89 >>> 16;
				@Pc(97) int local97 = local89 & 0xFFFF;
				@Pc(102) Class4_Sub4_Sub15 local102;
				if (local93 == local41) {
					local102 = local49;
				} else {
					local102 = Static287.method3916(local97 >>> 16);
				}
				if (local102 != null) {
					local18 |= local102.method4670(local97);
					local16 |= local102.method4673(local97);
				}
			}
			if (local18) {
				local12 = 1184;
			}
			if (local16) {
				local12 |= 0x100;
			}
			if (local20) {
				local12 |= 0x200;
			}
		}
		@Pc(156) long local156 = (long) arg3 | (long) arg7 << 32 | (long) (arg4 << 16);
		@Pc(158) Class198 local158 = Static28.aClass198_241;
		@Pc(166) Class38 local166;
		synchronized (Static28.aClass198_241) {
			local166 = (Class38) Static28.aClass198_241.method5210(local156);
		}
		if (local166 == null || arg2.method2695(local166.method1898(), local12) != 0) {
			if (local166 != null) {
				local12 = arg2.method2742(local12, local166.method1898());
			}
			@Pc(196) Class165[] local196 = new Class165[3];
			@Pc(198) int local198 = 0;
			if (!Static72.method1717(arg3).method3728() || !Static72.method1717(arg4).method3728() || !Static72.method1717(arg7).method3728()) {
				return null;
			}
			@Pc(226) Class165 local226 = Static72.method1717(arg3).method3732();
			if (local226 != null) {
				local198++;
				local196[0] = local226;
			}
			local226 = Static72.method1717(arg4).method3732();
			if (local226 != null) {
				local196[local198++] = local226;
			}
			local226 = Static72.method1717(arg7).method3732();
			if (local226 != null) {
				local196[local198++] = local226;
			}
			local37 = local12 | 0x2000;
			local226 = new Class165(local196, local198);
			local166 = arg2.method2717(local226, local37, Static3.anInt109, 64, 768);
			for (local41 = 0; local41 < 5; local41++) {
				if (Static106.aShortArrayArray5[local41].length > this.anIntArray56[local41]) {
					local166.method1886(Static155.aShortArray46[local41], Static106.aShortArrayArray5[local41][this.anIntArray56[local41]]);
				}
				if (this.anIntArray56[local41] < Static62.aShortArrayArray1[local41].length) {
					local166.method1886(Static139.aShortArray45[local41], Static62.aShortArrayArray1[local41][this.anIntArray56[local41]]);
				}
			}
			local166.method1890(local12);
			@Pc(338) Class198 local338 = Static28.aClass198_241;
			synchronized (Static28.aClass198_241) {
				Static28.aClass198_241.method5201(local166, local156);
			}
		}
		if (arg5 == null) {
			return local166;
		} else {
			local166 = local166.method1915((byte) 1, local12, true);
			return arg5.method310(local166, arg0, arg6, 1024, arg1);
		}
	}

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(I[Lclient!uk;Lclient!vq;IIILclient!b;IIIIZLclient!b;)Lclient!ni;")
	public Class38 method923(@OriginalArg(0) int arg0, @OriginalArg(1) Class202[] arg1, @OriginalArg(2) Class47 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class14 arg6, @OriginalArg(7) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(12) Class14 arg10) {
		if (this.anInt1242 != -1) {
			return Static36.method744(this.anInt1242).method3901(arg4, arg3, arg9, arg7, arg5, arg8, arg2, arg1, arg0, arg6, arg10);
		}
		@Pc(29) int local29 = arg5;
		@Pc(32) long local32 = this.aLong31;
		@Pc(35) int[] local35 = this.anIntArray55;
		if (arg6 != null && (arg6.anInt356 >= 0 || arg6.anInt350 >= 0)) {
			local35 = new int[12];
			for (@Pc(51) int local51 = 0; local51 < 12; local51++) {
				local35[local51] = this.anIntArray55[local51];
			}
			if (arg6.anInt356 >= 0) {
				if (arg6.anInt356 == 65535) {
					local35[5] = 0;
					local32 ^= 0xFFFFFFFF00000000L;
				} else {
					local35[5] = arg6.anInt356 | 0x40000000;
					local32 ^= (long) local35[5] << 32;
				}
			}
			if (arg6.anInt350 >= 0) {
				if (arg6.anInt350 == 65535) {
					local35[3] = 0;
					local32 ^= 0xFFFFFFFFL;
				} else {
					local35[3] = arg6.anInt350 | 0x40000000;
					local32 ^= local35[3];
				}
			}
		}
		@Pc(135) boolean local135 = false;
		@Pc(137) boolean local137 = false;
		@Pc(145) boolean local145 = arg6 != null || arg10 != null;
		@Pc(152) int local152 = arg1 == null ? 0 : arg1.length;
		@Pc(193) int local193;
		@Pc(198) int local198;
		for (@Pc(162) int local162 = 0; local162 < local152; local162++) {
			Static222.aClass4_Sub4_Sub15Array4[local162] = null;
			if (arg1[local162] != null) {
				@Pc(179) Class14 local179 = Static225.method4042(arg1[local162].anInt6226);
				if (local179.anIntArray12 != null) {
					local145 = true;
					Static227.aClass14Array4[local162] = local179;
					local193 = arg1[local162].anInt6233;
					local198 = arg1[local162].anInt6228;
					@Pc(203) int local203 = local179.anIntArray12[local193];
					Static222.aClass4_Sub4_Sub15Array4[local162] = Static287.method3916(local203 >>> 16);
					@Pc(215) int local215 = local203 & 0xFFFF;
					Static146.anIntArray252[local162] = local215;
					if (Static222.aClass4_Sub4_Sub15Array4[local162] != null) {
						local137 |= Static222.aClass4_Sub4_Sub15Array4[local162].method4670(local215);
						local135 |= Static222.aClass4_Sub4_Sub15Array4[local162].method4673(local215);
					}
					if ((local179.aBoolean30 || Static246.aBoolean378) && local198 != -1 && local198 < local179.anIntArray12.length) {
						Static105.anIntArray232[local162] = local179.anIntArray11[local193];
						Static275.anIntArray446[local162] = arg1[local162].anInt6227;
						@Pc(278) int local278 = local179.anIntArray12[local198];
						Static85.aClass4_Sub4_Sub15Array3[local162] = Static287.method3916(local278 >>> 16);
						@Pc(290) int local290 = local278 & 0xFFFF;
						Static93.anIntArray213[local162] = local290;
						if (Static85.aClass4_Sub4_Sub15Array3[local162] != null) {
							local137 |= Static85.aClass4_Sub4_Sub15Array3[local162].method4670(local290);
							local135 |= Static85.aClass4_Sub4_Sub15Array3[local162].method4673(local290);
						}
					} else {
						Static105.anIntArray232[local162] = 0;
						Static275.anIntArray446[local162] = 0;
						Static85.aClass4_Sub4_Sub15Array3[local162] = null;
						Static93.anIntArray213[local162] = -1;
					}
				}
			}
		}
		@Pc(344) int local344 = -1;
		local193 = -1;
		local198 = 0;
		@Pc(350) Class4_Sub4_Sub15 local350 = null;
		@Pc(352) Class4_Sub4_Sub15 local352 = null;
		@Pc(354) int local354 = -1;
		@Pc(356) int local356 = -1;
		@Pc(358) int local358 = 0;
		@Pc(360) Class4_Sub4_Sub15 local360 = null;
		@Pc(362) Class4_Sub4_Sub15 local362 = null;
		if (local145) {
			@Pc(375) int local375;
			@Pc(427) int local427;
			if (arg6 != null) {
				local344 = arg6.anIntArray12[arg3];
				local375 = local344 >>> 16;
				local344 &= 0xFFFF;
				local350 = Static287.method3916(local375);
				if (local350 != null) {
					local137 |= local350.method4670(local344);
					local135 |= local350.method4673(local344);
				}
				if ((arg6.aBoolean30 || Static246.aBoolean378) && arg9 != -1 && arg6.anIntArray12.length > arg9) {
					local198 = arg6.anIntArray11[arg3];
					local193 = arg6.anIntArray12[arg9];
					local427 = local193 >>> 16;
					local352 = local375 == local427 ? local350 : Static287.method3916(local427);
					local193 &= 0xFFFF;
					if (local352 != null) {
						local137 |= local352.method4670(local193);
						local135 |= local352.method4673(local193);
					}
				}
			}
			local29 = arg5 | 0x20;
			if (arg10 != null) {
				local354 = arg10.anIntArray12[arg4];
				local375 = local354 >>> 16;
				local354 &= 0xFFFF;
				local360 = Static287.method3916(local375);
				if (local360 != null) {
					local137 |= local360.method4670(local354);
					local135 |= local360.method4673(local354);
				}
				if ((arg10.aBoolean30 || Static246.aBoolean378) && arg7 != -1 && arg7 < arg10.anIntArray12.length) {
					local358 = arg10.anIntArray11[arg4];
					local356 = arg10.anIntArray12[arg7];
					local427 = local356 >>> 16;
					local356 &= 0xFFFF;
					local362 = local375 == local427 ? local360 : Static287.method3916(local427);
					if (local362 != null) {
						local137 |= local362.method4670(local356);
						local135 |= local362.method4673(local356);
					}
				}
			}
			if (local137) {
				local29 |= 0x80;
			}
			if (local135) {
				local29 |= 0x100;
			}
		}
		@Pc(570) Class198 local570 = Static88.aClass198_76;
		@Pc(578) Class38 local578;
		synchronized (Static88.aClass198_76) {
			local578 = (Class38) Static88.aClass198_76.method5210(local32);
		}
		@Pc(586) Class40 local586 = null;
		if (this.anInt1244 != -1) {
			local586 = Static343.method5478(this.anInt1244);
		}
		@Pc(628) int local628;
		@Pc(634) int local634;
		if (local578 == null || arg2.method2695(local578.method1898(), local29) != 0 || local586 != null && local586.anIntArrayArray33 != null && this.anIntArrayArray27 == null) {
			if (local578 != null) {
				local29 = arg2.method2742(local29, local578.method1898());
			}
			@Pc(626) boolean local626 = false;
			local628 = 0;
			while (true) {
				if (local628 >= 12) {
					if (local626) {
						if (this.aLong32 != -1L) {
							@Pc(1254) Class198 local1254 = Static88.aClass198_76;
							synchronized (Static88.aClass198_76) {
								local578 = (Class38) Static88.aClass198_76.method5210(this.aLong32);
							}
						}
						if (local578 == null || arg2.method2695(local578.method1898(), local29) != 0 || local586 != null && local586.anIntArrayArray33 != null && this.anIntArrayArray27 == null) {
							return null;
						}
					} else {
						@Pc(680) Class165[] local680 = new Class165[12];
						@Pc(688) int local688;
						for (@Pc(682) int local682 = 0; local682 < 12; local682++) {
							local688 = local35[local682];
							@Pc(707) Class165 local707;
							if ((local688 & 0x40000000) != 0) {
								local707 = Static177.method3465(local688 & 0x3FFFFFFF).method5465(this.aBoolean93);
								if (local707 != null) {
									local680[local682] = local707;
								}
							} else if ((Integer.MIN_VALUE & local688) != 0) {
								local707 = Static72.method1717(local688 & 0x3FFFFFFF).method3726();
								if (local707 != null) {
									local680[local682] = local707;
								}
							}
						}
						@Pc(764) int local764;
						if (local586 != null && local586.anIntArrayArray33 != null) {
							for (local688 = 0; local688 < local586.anIntArrayArray33.length; local688++) {
								if (local586.anIntArrayArray33[local688] != null && local680[local688] != null) {
									local764 = local586.anIntArrayArray33[local688][0];
									@Pc(771) int local771 = local586.anIntArrayArray33[local688][1];
									@Pc(778) int local778 = local586.anIntArrayArray33[local688][2];
									@Pc(787) int local787 = local586.anIntArrayArray33[local688][3] << 3;
									@Pc(796) int local796 = local586.anIntArrayArray33[local688][4] << 3;
									@Pc(805) int local805 = local586.anIntArrayArray33[local688][5] << 3;
									if (this.anIntArrayArray27 == null) {
										this.anIntArrayArray27 = new int[local586.anIntArrayArray33.length][];
									}
									if (this.anIntArrayArray27[local688] == null) {
										@Pc(827) int[] local827 = this.anIntArrayArray27[local688] = new int[15];
										if (local787 == 0 && local796 == 0 && local805 == 0) {
											local827[14] = -local778;
											local827[0] = local827[4] = local827[8] = 32768;
											local827[12] = -local764;
											local827[13] = -local771;
										} else {
											@Pc(866) int local866 = Class118_Sub1.anIntArray317[local787];
											@Pc(870) int local870 = Class118_Sub1.anIntArray314[local787];
											@Pc(874) int local874 = Class118_Sub1.anIntArray317[local796];
											@Pc(878) int local878 = Class118_Sub1.anIntArray314[local796];
											@Pc(882) int local882 = Class118_Sub1.anIntArray317[local805];
											@Pc(886) int local886 = Class118_Sub1.anIntArray314[local805];
											@Pc(894) int local894 = local870 * local882 + 16384 >> 15;
											@Pc(902) int local902 = local870 * local886 + 16384 >> 15;
											local827[8] = local866 * local874 + 16384 >> 15;
											local827[2] = local878 * local866 + 16384 >> 15;
											local827[1] = local874 * -local886 + local878 * local894 + 16384 >> 15;
											local827[6] = local882 * -local878 + local902 * local874 + 16384 >> 15;
											local827[5] = -local870;
											local827[7] = -local886 * -local878 + local874 * local894 + 16384 >> 15;
											local827[4] = local866 * local882 + 16384 >> 15;
											local827[0] = local874 * local882 + local878 * local902 + 16384 >> 15;
											local827[3] = local866 * local886 + 16384 >> 15;
											local827[12] = local827[0] * -local764 + local827[3] * -local771 + -local778 * local827[6] + 16384 >> 15;
											local827[14] = local827[8] * -local778 + -local771 * local827[5] + -local764 * local827[2] + 16384 >> 15;
											local827[13] = -local778 * local827[7] + local827[1] * -local764 + local827[4] * -local771 + 16384 >> 15;
										}
										local827[11] = local778;
										local827[9] = local764;
										local827[10] = local771;
									}
									if (local787 != 0 || local796 != 0 || local805 != 0) {
										local680[local688].method4483(local787, local805, local796);
									}
									if (local764 != 0 || local771 != 0 || local778 != 0) {
										local680[local688].method4479(local771, local778, local764);
									}
								}
							}
						}
						@Pc(1147) int local1147 = local29 | 0x2000;
						@Pc(1154) Class165 local1154 = new Class165(local680, local680.length);
						local578 = arg2.method2717(local1154, local1147, Static3.anInt109, 64, 850);
						for (local764 = 0; local764 < 5; local764++) {
							if (Static106.aShortArrayArray5[local764].length > this.anIntArray56[local764]) {
								local578.method1886(Static155.aShortArray46[local764], Static106.aShortArrayArray5[local764][this.anIntArray56[local764]]);
							}
							if (this.anIntArray56[local764] < Static62.aShortArrayArray1[local764].length) {
								local578.method1886(Static139.aShortArray45[local764], Static62.aShortArrayArray1[local764][this.anIntArray56[local764]]);
							}
						}
						local578.method1890(local29);
						@Pc(1229) Class198 local1229 = Static88.aClass198_76;
						synchronized (Static88.aClass198_76) {
							Static88.aClass198_76.method5201(local578, local32);
						}
						this.aLong32 = local32;
					}
					break;
				}
				local634 = local35[local628];
				if ((local634 & 0x40000000) == 0) {
					if ((Integer.MIN_VALUE & local634) != 0 && !Static72.method1717(local634 & 0x3FFFFFFF).method3734()) {
						local626 = true;
					}
				} else if (!Static177.method3465(local634 & 0x3FFFFFFF).method5452(this.aBoolean93)) {
					local626 = true;
				}
				local628++;
			}
		}
		@Pc(1296) Class38 local1296 = local578.method1915((byte) 1, local29, true);
		if (!local145) {
			return local1296;
		}
		@Pc(1302) int local1302 = 0;
		local628 = 1;
		while (local152 > local1302) {
			if (Static222.aClass4_Sub4_Sub15Array4[local1302] != null) {
				local1296.method1903(false, Static85.aClass4_Sub4_Sub15Array3[local1302], Static146.anIntArray252[local1302], Static222.aClass4_Sub4_Sub15Array4[local1302], Static93.anIntArray213[local1302], Static275.anIntArray446[local1302] - 1, this.anIntArrayArray27 == null ? null : this.anIntArrayArray27[local1302], local628, Static105.anIntArray232[local1302]);
			}
			local1302++;
			local628 <<= 0x1;
		}
		if (local350 != null && local360 != null) {
			local1296.method1889(local354, local358, local344, local350, local352, arg6.aBooleanArray1, local362, local356, local360, local193, local198, arg8 - 1, arg0 - 1, false);
		} else if (local350 != null) {
			local1296.method1887(0, local193, local350, local352, local198, arg0 - 1, false, local344);
		} else if (local360 != null) {
			local1296.method1887(0, local356, local360, local362, local358, arg8 - 1, false, local354);
		}
		for (local634 = 0; local634 < local152; local634++) {
			Static222.aClass4_Sub4_Sub15Array4[local634] = null;
			Static85.aClass4_Sub4_Sub15Array3[local634] = null;
			Static227.aClass14Array4[local634] = null;
		}
		return local1296;
	}

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(ZII)V")
	public void method924(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(23) int local23 = Static254.anIntArray239[arg1];
		if (this.anIntArray55[local23] != 0 && Static72.method1717(arg0) != null) {
			this.anIntArray55[local23] = Integer.MIN_VALUE | arg0;
			this.method921();
		}
	}

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(ILclient!b;IIBILclient!vq;)Lclient!ni;")
	public Class38 method926(@OriginalArg(0) int arg0, @OriginalArg(1) Class14 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(6) Class47 arg4) {
		if (this.anInt1242 != -1) {
			return Static36.method744(this.anInt1242).method3907(arg3, arg0, arg2, arg1, arg4);
		}
		@Pc(29) int local29 = 1024;
		@Pc(37) boolean local37;
		@Pc(54) int local54;
		@Pc(106) int local106;
		@Pc(58) int local58;
		@Pc(110) int local110;
		if (arg1 != null) {
			@Pc(33) boolean local33 = false;
			@Pc(35) boolean local35 = false;
			local37 = false;
			local29 = 1056;
			local54 = arg1.anIntArray12[arg2];
			local58 = local54 >>> 16;
			@Pc(62) int local62 = local54 & 0xFFFF;
			@Pc(66) Class4_Sub4_Sub15 local66 = Static287.method3916(local58);
			if (local66 != null) {
				local35 = local66.method4670(local62) | false;
				local33 = local66.method4673(local62) | false;
				local37 = arg1.aBoolean29 | false;
			}
			if ((arg1.aBoolean30 || Static246.aBoolean378) && arg3 != -1 && arg3 < arg1.anIntArray12.length) {
				local106 = arg1.anIntArray12[arg3];
				local110 = local106 >>> 16;
				@Pc(123) Class4_Sub4_Sub15 local123 = local110 == local58 ? local66 : Static287.method3916(local110);
				@Pc(127) int local127 = local106 & 0xFFFF;
				if (local123 != null) {
					local35 |= local123.method4670(local127);
					local33 |= local123.method4673(local127);
				}
			}
			if (local35) {
				local29 = 1184;
			}
			if (local33) {
				local29 |= 0x100;
			}
			if (local37) {
				local29 |= 0x200;
			}
		}
		@Pc(163) Class198 local163 = Static28.aClass198_241;
		@Pc(172) Class38 local172;
		synchronized (Static28.aClass198_241) {
			local172 = (Class38) Static28.aClass198_241.method5210(this.aLong31);
		}
		if (local172 == null || arg4.method2695(local172.method1898(), local29) != 0) {
			if (local172 != null) {
				local29 = arg4.method2742(local29, local172.method1898());
			}
			local37 = false;
			for (local54 = 0; local54 < 12; local54++) {
				local106 = this.anIntArray55[local54];
				if ((local106 & 0x40000000) == 0) {
					if ((Integer.MIN_VALUE & local106) != 0 && !Static72.method1717(local106 & 0x3FFFFFFF).method3728()) {
						local37 = true;
					}
				} else if (!Static177.method3465(local106 & 0x3FFFFFFF).method5457(this.aBoolean93)) {
					local37 = true;
				}
			}
			if (local37) {
				return null;
			}
			@Pc(253) Class165[] local253 = new Class165[12];
			@Pc(255) int local255 = 0;
			for (@Pc(257) int local257 = 0; local257 < 12; local257++) {
				local58 = this.anIntArray55[local257];
				@Pc(280) Class165 local280;
				if ((local58 & 0x40000000) != 0) {
					local280 = Static177.method3465(local58 & 0x3FFFFFFF).method5454(this.aBoolean93);
					if (local280 != null) {
						local253[local255++] = local280;
					}
				} else if ((Integer.MIN_VALUE & local58) != 0) {
					local280 = Static72.method1717(local58 & 0x3FFFFFFF).method3732();
					if (local280 != null) {
						local253[local255++] = local280;
					}
				}
			}
			@Pc(316) int local316 = local29 | 0x2000;
			@Pc(322) Class165 local322 = new Class165(local253, local255);
			local172 = arg4.method2717(local322, local316, Static3.anInt109, 64, 768);
			for (local110 = 0; local110 < 5; local110++) {
				if (this.anIntArray56[local110] < Static106.aShortArrayArray5[local110].length) {
					local172.method1886(Static155.aShortArray46[local110], Static106.aShortArrayArray5[local110][this.anIntArray56[local110]]);
				}
				if (this.anIntArray56[local110] < Static62.aShortArrayArray1[local110].length) {
					local172.method1886(Static139.aShortArray45[local110], Static62.aShortArrayArray1[local110][this.anIntArray56[local110]]);
				}
			}
			local172.method1890(local29);
			@Pc(387) Class198 local387 = Static28.aClass198_241;
			synchronized (Static28.aClass198_241) {
				Static28.aClass198_241.method5201(local172, this.aLong31);
			}
		}
		if (arg1 == null) {
			return local172;
		} else {
			local172.method1915((byte) 1, local29, true);
			return arg1.method310(local172, arg3, arg2, 1024, arg0);
		}
	}

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(ZI[III[I)V")
	public void method927(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int[] arg4) {
		if (arg1 != this.anInt1244) {
			this.anInt1244 = arg1;
			this.anIntArrayArray27 = null;
		}
		if (arg4 == null) {
			arg4 = new int[12];
			for (@Pc(31) int local31 = 0; local31 < 8; local31++) {
				for (@Pc(35) int local35 = 0; local35 < Static307.anInt5951; local35++) {
					@Pc(41) Class132 local41 = Static72.method1717(local35);
					if (local41 != null && !local41.aBoolean316 && (arg0 ? Static42.anIntArray52[local31] : Static278.anIntArray507[local31]) == local41.anInt4126) {
						arg4[Static254.anIntArray239[local31]] = local35 | Integer.MIN_VALUE;
						break;
					}
				}
			}
		}
		this.anIntArray56 = arg2;
		this.anIntArray55 = arg4;
		this.anInt1242 = arg3;
		this.aBoolean93 = arg0;
		this.method921();
	}

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(ZZ)V")
	public void method928(@OriginalArg(1) boolean arg0) {
		this.aBoolean93 = arg0;
		this.method921();
	}

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(IBI)V")
	public void method930(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray56[arg0] = arg1;
		this.method921();
	}
}
