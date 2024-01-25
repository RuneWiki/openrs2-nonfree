import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jh")
public final class Class127 {

	@OriginalMember(owner = "client!jh", name = "o", descriptor = "[Lclient!qi;")
	public static final Class188[] aClass188Array1 = new Class188[5];

	@OriginalMember(owner = "client!jh", name = "b", descriptor = "Z")
	public boolean aBoolean207;

	@OriginalMember(owner = "client!jh", name = "f", descriptor = "[I")
	private int[] anIntArray287;

	@OriginalMember(owner = "client!jh", name = "i", descriptor = "J")
	private long aLong104;

	@OriginalMember(owner = "client!jh", name = "k", descriptor = "[I")
	public int[] anIntArray289;

	@OriginalMember(owner = "client!jh", name = "q", descriptor = "J")
	private long aLong105;

	@OriginalMember(owner = "client!jh", name = "s", descriptor = "[[I")
	private int[][] anIntArrayArray97;

	@OriginalMember(owner = "client!jh", name = "v", descriptor = "I")
	private int anInt3507;

	@OriginalMember(owner = "client!jh", name = "p", descriptor = "I")
	public int anInt3503 = -1;

	static {
		for (@Pc(25) int local25 = 0; local25 < aClass188Array1.length; local25++) {
			aClass188Array1[local25] = new Class188();
		}
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(BI[I[IZI)V")
	public void method2936(@OriginalArg(1) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4) {
		this.aBoolean207 = arg3;
		this.anIntArray289 = arg1;
		this.anIntArray287 = arg2;
		this.anInt3503 = arg4;
		if (this.anInt3507 != arg0) {
			this.anInt3507 = arg0;
			this.anIntArrayArray97 = null;
		}
		this.method2947();
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(Lclient!bk;Lclient!qp;IBILclient!qf;Lclient!vd;Lclient!kk;ILclient!tu;ILclient!qa;)Lclient!c;")
	public Class37 method2937(@OriginalArg(0) Class28 arg0, @OriginalArg(1) Class191 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class187 arg4, @OriginalArg(6) Interface12 arg5, @OriginalArg(7) Class139 arg6, @OriginalArg(9) Class233 arg7, @OriginalArg(10) int arg8, @OriginalArg(11) Class109 arg9) {
		if (this.anInt3503 != -1) {
			return arg4.method4504(this.anInt3503).method1452(arg8, arg9, arg0, arg1, arg3, arg2, arg5);
		}
		@Pc(28) int local28 = 2048;
		@Pc(38) boolean local38;
		@Pc(55) int local55;
		@Pc(114) int local114;
		@Pc(59) int local59;
		@Pc(118) int local118;
		if (arg1 != null) {
			@Pc(32) boolean local32 = false;
			@Pc(34) boolean local34 = false;
			@Pc(36) boolean local36 = false;
			local38 = false;
			local28 = 2080;
			local55 = arg1.anIntArray452[arg3];
			local59 = local55 >>> 16;
			@Pc(63) int local63 = local55 & 0xFFFF;
			@Pc(68) Class1_Sub2_Sub6 local68 = arg0.method571(local59);
			if (local68 != null) {
				local34 = local68.method1120(local63) | false;
				local32 = local68.method1121(local63) | false;
				local38 = local68.method1125(local63) | false;
				local36 = arg1.aBoolean375 | false;
			}
			if ((arg1.aBoolean374 || Static294.aBoolean385) && arg8 != -1 && arg1.anIntArray452.length > arg8) {
				local114 = arg1.anIntArray452[arg8];
				local118 = local114 >>> 16;
				@Pc(122) int local122 = local114 & 0xFFFF;
				@Pc(132) Class1_Sub2_Sub6 local132 = local59 == local118 ? local68 : arg0.method571(local118);
				if (local132 != null) {
					local34 |= local132.method1120(local122);
					local32 |= local132.method1121(local122);
					local38 |= local132.method1125(local122);
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
		@Pc(181) Class83 local181 = Static193.aClass83_8;
		@Pc(190) Class37 local190;
		synchronized (Static193.aClass83_8) {
			local190 = (Class37) Static193.aClass83_8.method1658(this.aLong105);
		}
		if (local190 == null || arg9.method4710(local190.n(), local28) != 0) {
			if (local190 != null) {
				local28 = arg9.method4699(local28, local190.n());
			}
			local38 = false;
			for (local55 = 0; local55 < 12; local55++) {
				local114 = this.anIntArray287[local55];
				if ((local114 & 0x40000000) == 0) {
					if ((local114 & Integer.MIN_VALUE) != 0 && !arg7.method5374(local114 & 0x3FFFFFFF).method4443()) {
						local38 = true;
					}
				} else if (!arg6.method3228(local114 & 0x3FFFFFFF).method6031(this.aBoolean207)) {
					local38 = true;
				}
			}
			if (local38) {
				return null;
			}
			@Pc(281) Class264[] local281 = new Class264[12];
			@Pc(283) int local283 = 0;
			for (@Pc(285) int local285 = 0; local285 < 12; local285++) {
				local59 = this.anIntArray287[local285];
				@Pc(315) Class264 local315;
				if ((local59 & 0x40000000) != 0) {
					local315 = arg6.method3228(local59 & 0x3FFFFFFF).method6026(this.aBoolean207);
					if (local315 != null) {
						local281[local283++] = local315;
					}
				} else if ((local59 & Integer.MIN_VALUE) != 0) {
					local315 = arg7.method5374(local59 & 0x3FFFFFFF).method4441();
					if (local315 != null) {
						local281[local283++] = local315;
					}
				}
			}
			@Pc(352) int local352 = local28 | 0x4000;
			@Pc(358) Class264 local358 = new Class264(local281, local283);
			local190 = arg9.method4697(local358, local352, Static217.anInt3934, 64, 768);
			for (local118 = 0; local118 < 5; local118++) {
				if (Static133.aShortArrayArray2[local118].length > this.anIntArray289[local118]) {
					local190.N(Static32.aShortArray5[local118], Static133.aShortArrayArray2[local118][this.anIntArray289[local118]]);
				}
				if (Static317.aShortArrayArray4[local118].length > this.anIntArray289[local118]) {
					local190.N(Static284.aShortArray59[local118], Static317.aShortArrayArray4[local118][this.anIntArray289[local118]]);
				}
			}
			local190.u(local28);
			@Pc(429) Class83 local429 = Static193.aClass83_8;
			synchronized (Static193.aClass83_8) {
				Static193.aClass83_8.method1675(this.aLong105, local190);
			}
		}
		if (arg1 == null) {
			return local190;
		} else {
			local190.method4221((byte) 4, local28, true);
			return arg1.method4614(arg8, 2048, arg2, arg3, local190);
		}
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(IIIILclient!tu;Lclient!qs;IILclient!qa;IIZLclient!qf;Lclient!kk;Lclient!vd;[Lclient!kh;Lclient!qp;Lclient!bk;Lclient!qp;)Lclient!c;")
	public Class37 method2938(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Class233 arg3, @OriginalArg(5) Class193 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) Class109 arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(12) Class187 arg10, @OriginalArg(13) Class139 arg11, @OriginalArg(14) Interface12 arg12, @OriginalArg(15) Class137[] arg13, @OriginalArg(16) Class191 arg14, @OriginalArg(17) Class28 arg15, @OriginalArg(18) Class191 arg16) {
		if (this.anInt3503 != -1) {
			return arg10.method4504(this.anInt3503).method1462(arg7, arg12, arg8, arg5, arg1, arg16, arg9, arg15, arg14, arg2, arg4, arg13, arg6, arg0);
		}
		@Pc(33) int local33 = arg9;
		@Pc(36) long local36 = this.aLong105;
		@Pc(39) int[] local39 = this.anIntArray287;
		if (arg14 != null && (arg14.anInt5745 >= 0 || arg14.anInt5741 >= 0)) {
			local39 = new int[12];
			for (@Pc(55) int local55 = 0; local55 < 12; local55++) {
				local39[local55] = this.anIntArray287[local55];
			}
			if (arg14.anInt5745 >= 0) {
				if (arg14.anInt5745 == 65535) {
					local36 ^= 0xFFFFFFFF00000000L;
					local39[5] = 0;
				} else {
					local39[5] = arg14.anInt5745 | 0x40000000;
					local36 ^= (long) local39[5] << 32;
				}
			}
			if (arg14.anInt5741 >= 0) {
				if (arg14.anInt5741 == 65535) {
					local36 ^= 0xFFFFFFFFL;
					local39[3] = 0;
				} else {
					local39[3] = arg14.anInt5741 | 0x40000000;
					local36 ^= local39[3];
				}
			}
		}
		@Pc(148) boolean local148 = false;
		@Pc(150) boolean local150 = false;
		@Pc(152) boolean local152 = false;
		@Pc(160) boolean local160 = arg14 != null || arg16 != null;
		@Pc(167) int local167 = arg13 == null ? 0 : arg13.length;
		@Pc(201) int local201;
		@Pc(206) int local206;
		for (@Pc(169) int local169 = 0; local169 < local167; local169++) {
			Static130.aClass1_Sub2_Sub6Array4[local169] = null;
			if (arg13[local169] != null) {
				@Pc(187) Class191 local187 = arg15.method567(arg13[local169].anInt3849);
				if (local187.anIntArray452 != null) {
					Static437.aClass191Array2[local169] = local187;
					local160 = true;
					local201 = arg13[local169].anInt3854;
					local206 = arg13[local169].anInt3856;
					@Pc(211) int local211 = local187.anIntArray452[local201];
					Static130.aClass1_Sub2_Sub6Array4[local169] = arg15.method571(local211 >>> 16);
					@Pc(224) int local224 = local211 & 0xFFFF;
					Static414.anIntArray627[local169] = local224;
					if (Static130.aClass1_Sub2_Sub6Array4[local169] != null) {
						local150 |= Static130.aClass1_Sub2_Sub6Array4[local169].method1120(local224);
						local148 |= Static130.aClass1_Sub2_Sub6Array4[local169].method1121(local224);
						local152 |= Static130.aClass1_Sub2_Sub6Array4[local169].method1125(local224);
					}
					if ((local187.aBoolean374 || Static294.aBoolean385) && local206 != -1 && local187.anIntArray452.length > local206) {
						Static63.anIntArray86[local169] = local187.anIntArray454[local201];
						Static66.anIntArray90[local169] = arg13[local169].anInt3858;
						@Pc(310) int local310 = local187.anIntArray452[local206];
						Static118.aClass1_Sub2_Sub6Array6[local169] = arg15.method571(local310 >>> 16);
						@Pc(323) int local323 = local310 & 0xFFFF;
						Static357.anIntArray486[local169] = local323;
						if (Static118.aClass1_Sub2_Sub6Array6[local169] != null) {
							local150 |= Static118.aClass1_Sub2_Sub6Array6[local169].method1120(local323);
							local148 |= Static118.aClass1_Sub2_Sub6Array6[local169].method1121(local323);
							local152 |= Static118.aClass1_Sub2_Sub6Array6[local169].method1125(local323);
						}
					} else {
						Static63.anIntArray86[local169] = 0;
						Static66.anIntArray90[local169] = 0;
						Static118.aClass1_Sub2_Sub6Array6[local169] = null;
						Static357.anIntArray486[local169] = -1;
					}
				}
			}
		}
		@Pc(364) int local364 = -1;
		local201 = -1;
		local206 = 0;
		@Pc(370) Class1_Sub2_Sub6 local370 = null;
		@Pc(372) Class1_Sub2_Sub6 local372 = null;
		@Pc(374) int local374 = -1;
		@Pc(376) int local376 = -1;
		@Pc(378) int local378 = 0;
		@Pc(380) Class1_Sub2_Sub6 local380 = null;
		@Pc(382) Class1_Sub2_Sub6 local382 = null;
		if (local160) {
			local33 = arg9 | 0x20;
			@Pc(399) int local399;
			@Pc(463) int local463;
			if (arg14 != null) {
				local364 = arg14.anIntArray452[arg1];
				local399 = local364 >>> 16;
				local364 &= 0xFFFF;
				local370 = arg15.method571(local399);
				if (local370 != null) {
					local150 |= local370.method1120(local364);
					local148 |= local370.method1121(local364);
					local152 |= local370.method1125(local364);
				}
				if ((arg14.aBoolean374 || Static294.aBoolean385) && arg2 != -1 && arg2 < arg14.anIntArray452.length) {
					local206 = arg14.anIntArray454[arg1];
					local201 = arg14.anIntArray452[arg2];
					local463 = local201 >>> 16;
					local201 &= 0xFFFF;
					local372 = local463 == local399 ? local370 : arg15.method571(local463);
					if (local372 != null) {
						local150 |= local372.method1120(local201);
						local148 |= local372.method1121(local201);
						local152 |= local372.method1125(local201);
					}
				}
			}
			if (arg16 != null) {
				local374 = arg16.anIntArray452[arg6];
				local399 = local374 >>> 16;
				local380 = arg15.method571(local399);
				local374 &= 0xFFFF;
				if (local380 != null) {
					local150 |= local380.method1120(local374);
					local148 |= local380.method1121(local374);
					local152 |= local380.method1125(local374);
				}
				if ((arg16.aBoolean374 || Static294.aBoolean385) && arg5 != -1 && arg16.anIntArray452.length > arg5) {
					local376 = arg16.anIntArray452[arg5];
					local378 = arg16.anIntArray454[arg6];
					local463 = local376 >>> 16;
					local376 &= 0xFFFF;
					local382 = local399 == local463 ? local380 : arg15.method571(local463);
					if (local382 != null) {
						local150 |= local382.method1120(local376);
						local148 |= local382.method1121(local376);
						local152 |= local382.method1125(local376);
					}
				}
			}
			if (local150) {
				local33 |= 0x80;
			}
			if (local148) {
				local33 |= 0x100;
			}
			if (local152) {
				local33 |= 0x400;
			}
		}
		@Pc(631) Class83 local631 = Static92.aClass83_14;
		@Pc(639) Class37 local639;
		synchronized (Static92.aClass83_14) {
			local639 = (Class37) Static92.aClass83_14.method1658(local36);
		}
		@Pc(647) Class164 local647 = null;
		if (this.anInt3507 != -1) {
			local647 = arg4.method4647(this.anInt3507);
		}
		@Pc(690) int local690;
		@Pc(696) int local696;
		if (local639 == null || arg7.method4710(local639.n(), local33) != 0 || local647 != null && local647.anIntArrayArray130 != null && this.anIntArrayArray97 == null) {
			if (local639 != null) {
				local33 = arg7.method4699(local33, local639.n());
			}
			@Pc(688) boolean local688 = false;
			local690 = 0;
			while (true) {
				if (local690 >= 12) {
					if (local688) {
						if (this.aLong104 != -1L) {
							@Pc(749) Class83 local749 = Static92.aClass83_14;
							synchronized (Static92.aClass83_14) {
								local639 = (Class37) Static92.aClass83_14.method1658(this.aLong104);
							}
						}
						if (local639 == null || arg7.method4710(local639.n(), local33) != 0 || local647 != null && local647.anIntArrayArray130 != null && this.anIntArrayArray97 == null) {
							return null;
						}
					} else {
						@Pc(785) Class264[] local785 = new Class264[12];
						@Pc(793) int local793;
						for (@Pc(787) int local787 = 0; local787 < 12; local787++) {
							local793 = local39[local787];
							@Pc(813) Class264 local813;
							if ((local793 & 0x40000000) != 0) {
								local813 = arg11.method3228(local793 & 0x3FFFFFFF).method6027(this.aBoolean207);
								if (local813 != null) {
									local785[local787] = local813;
								}
							} else if ((local793 & Integer.MIN_VALUE) != 0) {
								local813 = arg3.method5374(local793 & 0x3FFFFFFF).method4439();
								if (local813 != null) {
									local785[local787] = local813;
								}
							}
						}
						@Pc(871) int local871;
						if (local647 != null && local647.anIntArrayArray130 != null) {
							for (local793 = 0; local793 < local647.anIntArrayArray130.length; local793++) {
								if (local647.anIntArrayArray130[local793] != null && local785[local793] != null) {
									local871 = local647.anIntArrayArray130[local793][0];
									@Pc(878) int local878 = local647.anIntArrayArray130[local793][1];
									@Pc(885) int local885 = local647.anIntArrayArray130[local793][2];
									@Pc(894) int local894 = local647.anIntArrayArray130[local793][3] << 3;
									@Pc(903) int local903 = local647.anIntArrayArray130[local793][4] << 3;
									@Pc(912) int local912 = local647.anIntArrayArray130[local793][5] << 3;
									if (this.anIntArrayArray97 == null) {
										this.anIntArrayArray97 = new int[local647.anIntArrayArray130.length][];
									}
									if (this.anIntArrayArray97[local793] == null) {
										@Pc(934) int[] local934 = this.anIntArrayArray97[local793] = new int[15];
										if (local894 == 0 && local903 == 0 && local912 == 0) {
											local934[14] = -local885;
											local934[12] = -local871;
											local934[13] = -local878;
											local934[0] = local934[4] = local934[8] = 32768;
										} else {
											@Pc(979) int local979 = Class4.anIntArray6[local894];
											@Pc(983) int local983 = Class4.anIntArray7[local894];
											@Pc(987) int local987 = Class4.anIntArray6[local903];
											@Pc(991) int local991 = Class4.anIntArray7[local903];
											@Pc(995) int local995 = Class4.anIntArray6[local912];
											@Pc(999) int local999 = Class4.anIntArray7[local912];
											@Pc(1007) int local1007 = local983 * local995 + 16384 >> 15;
											@Pc(1015) int local1015 = local983 * local999 + 16384 >> 15;
											local934[6] = -local991 * local995 + local1015 * local987 + 16384 >> 15;
											local934[4] = local995 * local979 + 16384 >> 15;
											local934[7] = local987 * local1007 + -local991 * -local999 + 16384 >> 15;
											local934[5] = -local983;
											local934[8] = local979 * local987 + 16384 >> 15;
											local934[3] = local999 * local979 + 16384 >> 15;
											local934[0] = local991 * local1015 + local995 * local987 + 16384 >> 15;
											local934[2] = local979 * local991 + 16384 >> 15;
											local934[1] = local987 * -local999 + local991 * local1007 + 16384 >> 15;
											local934[12] = local934[0] * -local871 + local934[3] * -local878 + local934[6] * -local885 + 16384 >> 15;
											local934[13] = -local871 * local934[1] + -local878 * local934[4] + local934[7] * -local885 + 16384 >> 15;
											local934[14] = -local878 * local934[5] + -local871 * local934[2] + -local885 * local934[8] + 16384 >> 15;
										}
										local934[11] = local885;
										local934[9] = local871;
										local934[10] = local878;
									}
									if (local894 != 0 || local903 != 0 || local912 != 0) {
										local785[local793].method5916(local894, local912, local903);
									}
									if (local871 != 0 || local878 != 0 || local885 != 0) {
										local785[local793].method5905(local878, local871, local885);
									}
								}
							}
						}
						@Pc(1264) int local1264 = local33 | 0x4000;
						@Pc(1271) Class264 local1271 = new Class264(local785, local785.length);
						local639 = arg7.method4697(local1271, local1264, Static217.anInt3934, 64, 850);
						for (local871 = 0; local871 < 5; local871++) {
							if (Static133.aShortArrayArray2[local871].length > this.anIntArray289[local871]) {
								local639.N(Static32.aShortArray5[local871], Static133.aShortArrayArray2[local871][this.anIntArray289[local871]]);
							}
							if (Static317.aShortArrayArray4[local871].length > this.anIntArray289[local871]) {
								local639.N(Static284.aShortArray59[local871], Static317.aShortArrayArray4[local871][this.anIntArray289[local871]]);
							}
						}
						local639.u(local33);
						@Pc(1344) Class83 local1344 = Static92.aClass83_14;
						synchronized (Static92.aClass83_14) {
							Static92.aClass83_14.method1675(local36, local639);
						}
						this.aLong104 = local36;
					}
					break;
				}
				local696 = local39[local690];
				if ((local696 & 0x40000000) == 0) {
					if ((Integer.MIN_VALUE & local696) != 0 && !arg3.method5374(local696 & 0x3FFFFFFF).method4440()) {
						local688 = true;
					}
				} else if (!arg11.method3228(local696 & 0x3FFFFFFF).method6033(this.aBoolean207)) {
					local688 = true;
				}
				local690++;
			}
		}
		@Pc(1366) Class37 local1366 = local639.method4221((byte) 4, local33, true);
		if (!local160) {
			return local1366;
		}
		@Pc(1372) int local1372 = 0;
		local690 = 1;
		while (local167 > local1372) {
			if (Static130.aClass1_Sub2_Sub6Array4[local1372] != null) {
				local1366.method4227(this.anIntArrayArray97 == null ? null : this.anIntArrayArray97[local1372], Static357.anIntArray486[local1372], Static414.anIntArray627[local1372], Static130.aClass1_Sub2_Sub6Array4[local1372], Static66.anIntArray90[local1372] - 1, Static118.aClass1_Sub2_Sub6Array6[local1372], false, Static63.anIntArray86[local1372], local690);
			}
			local690 <<= 0x1;
			local1372++;
		}
		if (local370 != null && local380 != null) {
			local1366.method4239(local376, false, local378, local380, local374, local206, arg8 - 1, local372, local382, local364, arg14.aBooleanArray19, local370, arg0 - 1, local201);
		} else if (local370 != null) {
			local1366.method4224(arg8 - 1, local364, 0, local372, false, local370, local201, local206);
		} else if (local380 != null) {
			local1366.method4224(arg0 - 1, local374, 0, local382, false, local380, local376, local378);
		}
		for (local696 = 0; local696 < local167; local696++) {
			Static130.aClass1_Sub2_Sub6Array4[local696] = null;
			Static118.aClass1_Sub2_Sub6Array6[local696] = null;
			Static437.aClass191Array2[local696] = null;
		}
		return local1366;
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(Lclient!tu;Lclient!bk;IIIIILclient!qp;IILclient!qa;I)Lclient!c;")
	public Class37 method2940(@OriginalArg(0) Class233 arg0, @OriginalArg(1) Class28 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class191 arg6, @OriginalArg(9) int arg7, @OriginalArg(10) Class109 arg8, @OriginalArg(11) int arg9) {
		@Pc(7) int local7 = 2048;
		@Pc(100) int local100;
		if (arg6 != null) {
			@Pc(11) boolean local11 = false;
			@Pc(13) boolean local13 = false;
			@Pc(15) boolean local15 = false;
			@Pc(17) boolean local17 = false;
			@Pc(28) int local28 = arg6.anIntArray452[arg3];
			local7 = 2080;
			@Pc(38) int local38 = local28 >>> 16;
			@Pc(42) int local42 = local28 & 0xFFFF;
			@Pc(47) Class1_Sub2_Sub6 local47 = arg1.method571(local38);
			if (local47 != null) {
				local13 = local47.method1120(local42) | false;
				local11 = local47.method1121(local42) | false;
				local17 = local47.method1125(local42) | false;
				local15 = arg6.aBoolean375 | false;
			}
			if ((arg6.aBoolean374 || Static294.aBoolean385) && arg5 != -1 && arg5 < arg6.anIntArray452.length) {
				local100 = arg6.anIntArray452[arg5];
				@Pc(104) int local104 = local100 >>> 16;
				@Pc(108) int local108 = local100 & 0xFFFF;
				@Pc(113) Class1_Sub2_Sub6 local113;
				if (local104 == local38) {
					local113 = local47;
				} else {
					local113 = arg1.method571(local108 >>> 16);
				}
				if (local113 != null) {
					local13 |= local113.method1120(local108);
					local11 |= local113.method1121(local108);
					local17 |= local113.method1125(local108);
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
		@Pc(181) long local181 = (long) arg7 | (long) arg4 << 32 | (long) (arg2 << 16);
		@Pc(183) Class83 local183 = Static193.aClass83_8;
		@Pc(191) Class37 local191;
		synchronized (Static193.aClass83_8) {
			local191 = (Class37) Static193.aClass83_8.method1658(local181);
		}
		if (local191 == null || arg8.method4710(local191.n(), local7) != 0) {
			if (local191 != null) {
				local7 = arg8.method4699(local7, local191.n());
			}
			@Pc(222) Class264[] local222 = new Class264[3];
			local100 = 0;
			if (!arg0.method5374(arg7).method4443() || !arg0.method5374(arg2).method4443() || !arg0.method5374(arg4).method4443()) {
				return null;
			}
			@Pc(258) Class264 local258 = arg0.method5374(arg7).method4441();
			if (local258 != null) {
				local100++;
				local222[0] = local258;
			}
			local258 = arg0.method5374(arg2).method4441();
			if (local258 != null) {
				local222[local100++] = local258;
			}
			local258 = arg0.method5374(arg4).method4441();
			if (local258 != null) {
				local222[local100++] = local258;
			}
			@Pc(297) int local297 = local7 | 0x4000;
			local258 = new Class264(local222, local100);
			local191 = arg8.method4697(local258, local297, Static217.anInt3934, 64, 768);
			for (@Pc(313) int local313 = 0; local313 < 5; local313++) {
				if (Static133.aShortArrayArray2[local313].length > this.anIntArray289[local313]) {
					local191.N(Static32.aShortArray5[local313], Static133.aShortArrayArray2[local313][this.anIntArray289[local313]]);
				}
				if (this.anIntArray289[local313] < Static317.aShortArrayArray4[local313].length) {
					local191.N(Static284.aShortArray59[local313], Static317.aShortArrayArray4[local313][this.anIntArray289[local313]]);
				}
			}
			local191.u(local7);
			@Pc(378) Class83 local378 = Static193.aClass83_8;
			synchronized (Static193.aClass83_8) {
				Static193.aClass83_8.method1675(local181, local191);
			}
		}
		if (arg6 == null) {
			return local191;
		} else {
			local191 = local191.method4221((byte) 4, local7, true);
			return arg6.method4614(arg5, 2048, arg9, arg3, local191);
		}
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(BLclient!tu;II)V")
	public void method2941(@OriginalArg(1) Class233 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(11) int local11 = Static239.anIntArray345[arg1];
		if (this.anIntArray287[local11] != 0 && arg0.method5374(arg2) != null) {
			this.anIntArray287[local11] = Integer.MIN_VALUE | arg2;
			this.method2947();
		}
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(ZI)V")
	public void method2944(@OriginalArg(0) boolean arg0) {
		this.aBoolean207 = arg0;
		this.method2947();
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(III)V")
	public void method2945(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anIntArray289[arg1] = arg0;
		this.method2947();
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(B)V")
	private void method2947() {
		this.aLong105 = -1L;
		@Pc(14) long[] local14 = Class57_Sub2.aLongArray8;
		this.aLong105 = local14[(int) ((this.aLong105 ^ (long) (this.anInt3507 >> 8)) & 0xFFL)] ^ this.aLong105 >>> 8;
		this.aLong105 = this.aLong105 >>> 8 ^ local14[(int) ((this.aLong105 ^ (long) this.anInt3507) & 0xFFL)];
		for (@Pc(54) int local54 = 0; local54 < 12; local54++) {
			this.aLong105 = this.aLong105 >>> 8 ^ local14[(int) (((long) (this.anIntArray287[local54] >> 24) ^ this.aLong105) & 0xFFL)];
			this.aLong105 = local14[(int) (((long) (this.anIntArray287[local54] >> 16) ^ this.aLong105) & 0xFFL)] ^ this.aLong105 >>> 8;
			this.aLong105 = this.aLong105 >>> 8 ^ local14[(int) (((long) (this.anIntArray287[local54] >> 8) ^ this.aLong105) & 0xFFL)];
			this.aLong105 = this.aLong105 >>> 8 ^ local14[(int) (((long) this.anIntArray287[local54] ^ this.aLong105) & 0xFFL)];
		}
		for (@Pc(148) int local148 = 0; local148 < 5; local148++) {
			this.aLong105 = this.aLong105 >>> 8 ^ local14[(int) ((this.aLong105 ^ (long) this.anIntArray289[local148]) & 0xFFL)];
		}
		this.aLong105 = this.aLong105 >>> 8 ^ local14[(int) (((long) (this.aBoolean207 ? 1 : 0) ^ this.aLong105) & 0xFFL)];
	}
}
