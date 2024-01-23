import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sk")
public final class Class149 {

	@OriginalMember(owner = "client!sk", name = "b", descriptor = "[I")
	private int[] anIntArray588;

	@OriginalMember(owner = "client!sk", name = "c", descriptor = "I")
	private int anInt5027;

	@OriginalMember(owner = "client!sk", name = "i", descriptor = "Z")
	public boolean aBoolean390;

	@OriginalMember(owner = "client!sk", name = "n", descriptor = "J")
	private long aLong157;

	@OriginalMember(owner = "client!sk", name = "q", descriptor = "J")
	private long aLong158;

	@OriginalMember(owner = "client!sk", name = "r", descriptor = "I")
	public int anInt5039;

	@OriginalMember(owner = "client!sk", name = "s", descriptor = "[[I")
	private int[][] anIntArrayArray41;

	@OriginalMember(owner = "client!sk", name = "u", descriptor = "[I")
	public int[] anIntArray589;

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(B)V")
	private void method3860() {
		@Pc(8) long local8 = this.aLong157;
		this.aLong157 = -1L;
		@Pc(13) long[] local13 = Class144.aLongArray11;
		this.aLong157 = local13[(int) ((this.aLong157 ^ (long) (this.anInt5027 >> 8)) & 0xFFL)] ^ this.aLong157 >>> 8;
		this.aLong157 = local13[(int) ((this.aLong157 ^ (long) this.anInt5027) & 0xFFL)] ^ this.aLong157 >>> 8;
		@Pc(59) int local59;
		for (local59 = 0; local59 < 12; local59++) {
			this.aLong157 = this.aLong157 >>> 8 ^ local13[(int) (((long) (this.anIntArray588[local59] >> 24) ^ this.aLong157) & 0xFFL)];
			this.aLong157 = this.aLong157 >>> 8 ^ local13[(int) (((long) (this.anIntArray588[local59] >> 16) ^ this.aLong157) & 0xFFL)];
			this.aLong157 = local13[(int) (((long) (this.anIntArray588[local59] >> 8) ^ this.aLong157) & 0xFFL)] ^ this.aLong157 >>> 8;
			this.aLong157 = this.aLong157 >>> 8 ^ local13[(int) ((this.aLong157 ^ (long) this.anIntArray588[local59]) & 0xFFL)];
		}
		for (local59 = 0; local59 < 5; local59++) {
			this.aLong157 = this.aLong157 >>> 8 ^ local13[(int) ((this.aLong157 ^ (long) this.anIntArray589[local59]) & 0xFFL)];
		}
		this.aLong157 = local13[(int) (((long) (this.aBoolean390 ? 1 : 0) ^ this.aLong157) & 0xFFL)] ^ this.aLong157 >>> 8;
		if (local8 != 0L && this.aLong157 != local8) {
			Static110.aClass31_18.method854(local8);
		}
	}

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(ZI)V")
	public void method3861(@OriginalArg(0) boolean arg0) {
		this.aBoolean390 = arg0;
		this.method3860();
	}

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(III)V")
	public void method3863(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anIntArray589[arg1] = arg0;
		this.method3860();
	}

	@OriginalMember(owner = "client!sk", name = "b", descriptor = "(B)I")
	public int method3864() {
		return this.anInt5039 == -1 ? (this.anIntArray588[11] << 5) + (this.anIntArray589[4] << 20) + (this.anIntArray589[0] << 25) + (this.anIntArray588[0] << 15) + (this.anIntArray588[8] << 10) + this.anIntArray588[1] : 305419896 - -Static24.method424(this.anInt5039).anInt659;
	}

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(Lclient!pi;Z[Lclient!tn;IIIILclient!pi;IIB)Lclient!ei;")
	public Class6_Sub2 method3865(@OriginalArg(0) Class133 arg0, @OriginalArg(2) Class160[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class133 arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (this.anInt5039 != -1) {
			return Static24.method424(this.anInt5039).method495(arg1, arg8, arg5, arg6, arg4, arg7, arg3, arg2, arg0);
		}
		@Pc(31) long local31 = this.aLong157;
		@Pc(34) int[] local34 = this.anIntArray588;
		if (arg0 != null && (arg0.anInt4024 >= 0 || arg0.anInt4016 >= 0)) {
			local34 = new int[12];
			for (@Pc(54) int local54 = 0; local54 < 12; local54++) {
				local34[local54] = this.anIntArray588[local54];
			}
			if (arg0.anInt4024 >= 0) {
				if (arg0.anInt4024 == 65535) {
					local34[5] = 0;
					local31 ^= 0xFFFFFFFF00000000L;
				} else {
					local34[5] = arg0.anInt4024 | 0x40000000;
					local31 ^= (long) local34[5] << 32;
				}
			}
			if (arg0.anInt4016 >= 0) {
				if (arg0.anInt4016 == 65535) {
					local34[3] = 0;
					local31 ^= 0xFFFFFFFFL;
				} else {
					local34[3] = arg0.anInt4016 | 0x40000000;
					local31 ^= local34[3];
				}
			}
		}
		@Pc(147) Class6_Sub2 local147 = (Class6_Sub2) Static110.aClass31_18.method852(local31);
		@Pc(153) boolean local153;
		@Pc(325) int local325;
		@Pc(339) int local339;
		@Pc(353) int local353;
		@Pc(346) int local346;
		@Pc(360) int local360;
		@Pc(404) int local404;
		@Pc(410) int local410;
		@Pc(434) int local434;
		@Pc(428) int local428;
		@Pc(477) int local477;
		@Pc(332) int local332;
		if (local147 == null) {
			local153 = false;
			@Pc(162) int local162;
			for (@Pc(155) int local155 = 0; local155 < 12; local155++) {
				local162 = local34[local155];
				if ((local162 & 0x40000000) == 0) {
					if ((Integer.MIN_VALUE & local162) != 0 && !Static153.method2366(local162 & 0x3FFFFFFF).method4194()) {
						local153 = true;
					}
				} else if (!Static183.method4458(local162 & 0x3FFFFFFF).method2676(this.aBoolean390)) {
					local153 = true;
				}
			}
			if (local153) {
				if (this.aLong158 != -1L) {
					local147 = (Class6_Sub2) Static110.aClass31_18.method852(this.aLong158);
				}
				if (local147 == null) {
					return null;
				}
			}
			if (local147 == null) {
				@Pc(226) Class6_Sub3[] local226 = new Class6_Sub3[12];
				@Pc(235) int local235;
				for (local162 = 0; local162 < 12; local162++) {
					local235 = local34[local162];
					@Pc(252) Class6_Sub3 local252;
					if ((local235 & 0x40000000) != 0) {
						local252 = Static183.method4458(local235 & 0x3FFFFFFF).method2675(this.aBoolean390);
						if (local252 != null) {
							local226[local162] = local252;
						}
					} else if ((local235 & Integer.MIN_VALUE) != 0) {
						local252 = Static153.method2366(local235 & 0x3FFFFFFF).method4190();
						if (local252 != null) {
							local226[local162] = local252;
						}
					}
				}
				@Pc(285) Class79 local285 = null;
				if (this.anInt5027 != -1) {
					local285 = Static73.method1191(this.anInt5027);
				}
				if (local285 != null && local285.anIntArrayArray19 != null) {
					for (local235 = 0; local235 < local285.anIntArrayArray19.length; local235++) {
						if (local285.anIntArrayArray19[local235] != null && local226[local235] != null) {
							local325 = local285.anIntArrayArray19[local235][1];
							local332 = local285.anIntArrayArray19[local235][0];
							local339 = local285.anIntArrayArray19[local235][2];
							local346 = local285.anIntArrayArray19[local235][4];
							local353 = local285.anIntArrayArray19[local235][3];
							local360 = local285.anIntArrayArray19[local235][5];
							if (this.anIntArrayArray41 == null) {
								this.anIntArrayArray41 = new int[local285.anIntArrayArray19.length][];
							}
							if (this.anIntArrayArray41[local235] == null) {
								@Pc(385) int[] local385 = this.anIntArrayArray41[local235] = new int[15];
								if (local353 == 0 && local346 == 0 && local360 == 0) {
									local385[13] = -local325;
									local385[14] = -local339;
									local385[0] = local385[4] = local385[8] = 32768;
									local385[12] = -local332;
								} else {
									local404 = Class135.anIntArray474[local353] >> 1;
									local410 = Class135.anIntArray472[local353] >> 1;
									@Pc(416) int local416 = Class135.anIntArray472[local346] >> 1;
									@Pc(422) int local422 = Class135.anIntArray474[local346] >> 1;
									local428 = Class135.anIntArray472[local360] >> 1;
									local434 = Class135.anIntArray474[local360] >> 1;
									local385[5] = -local410;
									local385[4] = local434 * local404 + 16384 >> 15;
									local385[8] = local404 * local422 + 16384 >> 15;
									local385[3] = local428 * local404 + 16384 >> 15;
									local477 = local410 * local434 + 16384 >> 15;
									@Pc(485) int local485 = local410 * local428 + 16384 >> 15;
									local385[2] = local404 * local416 + 16384 >> 15;
									local385[14] = -local339 * local385[8] + local385[2] * -local332 + -local325 * local385[5] + 16384 >> 15;
									local385[0] = local416 * local485 + local434 * local422 + 16384 >> 15;
									local385[7] = -local428 * -local416 + local422 * local477 + 16384 >> 15;
									local385[6] = local422 * local485 + local434 * -local416 + 16384 >> 15;
									local385[12] = -local332 * local385[0] + local385[3] * -local325 + -local339 * local385[6] + 16384 >> 15;
									local385[1] = local477 * local416 + -local428 * local422 + 16384 >> 15;
									local385[13] = local385[1] * -local332 + -local325 * local385[4] + -local339 * local385[7] + 16384 >> 15;
								}
								local385[11] = local339;
								local385[9] = local332;
								local385[10] = local325;
							}
							if (local353 != 0 || local346 != 0 || local360 != 0) {
								local226[local235].method1432(local353, local346, local360);
							}
							if (local332 != 0 || local325 != 0 || local339 != 0) {
								local226[local235].method1427(local332, local325, local339);
							}
						}
					}
				}
				@Pc(728) Class6_Sub3 local728 = new Class6_Sub3(local226, local226.length);
				for (local332 = 0; local332 < 5; local332++) {
					if (Static138.aShortArrayArray9[local332].length > this.anIntArray589[local332]) {
						local728.method1424(Static9.aShortArray1[local332], Static138.aShortArrayArray9[local332][this.anIntArray589[local332]]);
					}
					if (Static133.aShortArrayArray8[local332].length > this.anIntArray589[local332]) {
						local728.method1424(Static202.aShortArray84[local332], Static133.aShortArrayArray8[local332][this.anIntArray589[local332]]);
					}
				}
				local147 = local728.method1425(64, 850, -30, -50, -30);
				if (Static240.aBoolean369) {
					((Class6_Sub2_Sub2) local147).method2099(false, false, true, false, false, true);
				}
				Static110.aClass31_18.method851(local147, local31);
				this.aLong158 = local31;
			}
		}
		local153 = false;
		@Pc(819) boolean local819 = false;
		@Pc(821) boolean local821 = false;
		@Pc(823) boolean local823 = false;
		local332 = arg1 == null ? 0 : arg1.length;
		@Pc(975) int local975;
		for (local325 = 0; local325 < local332; local325++) {
			if (arg1[local325] != null) {
				@Pc(850) Class133 local850 = Static262.method4031(arg1[local325].anInt5254);
				if (local850.anIntArray461 != null) {
					local153 = true;
					Static204.aClass133Array1[local325] = local850;
					local346 = arg1[local325].anInt5253;
					local353 = arg1[local325].anInt5257;
					local360 = local850.anIntArray461[local353];
					Static257.aClass1_Sub2_Sub4Array2[local325] = Static261.method4028(local360 >>> 16);
					local360 &= 0xFFFF;
					Static287.anIntArray665[local325] = local360;
					if (Static257.aClass1_Sub2_Sub4Array2[local325] != null) {
						local821 |= Static257.aClass1_Sub2_Sub4Array2[local325].method461(local360);
						local819 |= Static257.aClass1_Sub2_Sub4Array2[local325].method457(local360);
						local823 |= local850.aBoolean303;
					}
					if ((local850.aBoolean300 || Static24.aBoolean44) && local346 != -1 && local346 < local850.anIntArray461.length) {
						Static273.anIntArray632[local325] = local850.anIntArray460[local353];
						Static146.anIntArray337[local325] = arg1[local325].anInt5250;
						local975 = local850.anIntArray461[local346];
						Static274.aClass1_Sub2_Sub4Array4[local325] = Static261.method4028(local975 >>> 16);
						@Pc(987) int local987 = local975 & 0xFFFF;
						Static166.anIntArray371[local325] = local987;
						if (Static274.aClass1_Sub2_Sub4Array4[local325] != null) {
							local821 |= Static274.aClass1_Sub2_Sub4Array4[local325].method461(local987);
							local819 |= Static274.aClass1_Sub2_Sub4Array4[local325].method457(local987);
						}
					} else {
						Static273.anIntArray632[local325] = 0;
						Static146.anIntArray337[local325] = 0;
						Static274.aClass1_Sub2_Sub4Array4[local325] = null;
						Static166.anIntArray371[local325] = -1;
					}
				}
			}
		}
		if (!local153 && arg0 == null && arg6 == null) {
			return local147;
		}
		local339 = -1;
		local325 = -1;
		@Pc(1030) Class1_Sub2_Sub4 local1030 = null;
		local353 = 0;
		@Pc(1040) Class1_Sub2_Sub4 local1040 = null;
		if (arg0 != null) {
			local325 = arg0.anIntArray461[arg3];
			local975 = local325 >>> 16;
			local1030 = Static261.method4028(local975);
			local325 &= 0xFFFF;
			if (local1030 != null) {
				local821 |= local1030.method461(local325);
				local819 |= local1030.method457(local325);
				local823 |= arg0.aBoolean303;
			}
			if ((arg0.aBoolean300 || Static24.aBoolean44) && arg4 != -1 && arg0.anIntArray461.length > arg4) {
				local353 = arg0.anIntArray460[arg3];
				local339 = arg0.anIntArray461[arg4];
				local404 = local339 >>> 16;
				local339 &= 0xFFFF;
				if (local404 == local975) {
					local1040 = local1030;
				} else {
					local1040 = Static261.method4028(local339 >>> 16);
				}
				if (local1040 != null) {
					local821 |= local1040.method461(local339);
					local819 |= local1040.method457(local339);
				}
			}
		}
		local975 = -1;
		local404 = -1;
		local410 = 0;
		@Pc(1160) Class1_Sub2_Sub4 local1160 = null;
		@Pc(1162) Class1_Sub2_Sub4 local1162 = null;
		if (arg6 != null) {
			local975 = arg6.anIntArray461[arg5];
			local434 = local975 >>> 16;
			local975 &= 0xFFFF;
			local1160 = Static261.method4028(local434);
			if (local1160 != null) {
				local821 |= local1160.method461(local975);
				local819 |= local1160.method457(local975);
				local823 |= arg6.aBoolean303;
			}
			if ((arg6.aBoolean300 || Static24.aBoolean44) && arg2 != -1 && arg2 < arg6.anIntArray461.length) {
				local404 = arg6.anIntArray461[arg2];
				local410 = arg6.anIntArray460[arg5];
				local428 = local404 >>> 16;
				local404 &= 0xFFFF;
				if (local428 == local434) {
					local1162 = local1160;
				} else {
					local1162 = Static261.method4028(local404 >>> 16);
				}
				if (local1162 != null) {
					local821 |= local1162.method461(local404);
					local819 |= local1162.method457(local404);
				}
			}
		}
		@Pc(1293) Class6_Sub2 local1293 = local147.method2068(!local819, !local821, !local823);
		local428 = 0;
		local477 = 1;
		while (local428 < local332) {
			if (Static257.aClass1_Sub2_Sub4Array2[local428] != null) {
				local1293.method2086(Static257.aClass1_Sub2_Sub4Array2[local428], Static287.anIntArray665[local428], Static274.aClass1_Sub2_Sub4Array4[local428], Static166.anIntArray371[local428], Static146.anIntArray337[local428] - 1, Static273.anIntArray632[local428], local477, Static204.aClass133Array1[local428].aBoolean303, this.anIntArrayArray41[local428]);
			}
			local477 <<= 0x1;
			local428++;
		}
		if (local1030 != null && local1160 != null) {
			local1293.method2075(local1030, local325, local1040, local339, arg7 - 1, local353, local1160, local975, local1162, local404, arg8 - 1, local410, arg0.aBooleanArray19, arg0.aBoolean303 | arg6.aBoolean303);
		} else if (local1030 != null) {
			local1293.method2087(local1030, local325, local1040, local339, arg7 - 1, local353, arg0.aBoolean303);
		} else if (local1160 != null) {
			local1293.method2087(local1160, local975, local1162, local404, arg8 - 1, local410, arg6.aBoolean303);
		}
		for (local428 = 0; local428 < local332; local428++) {
			Static257.aClass1_Sub2_Sub4Array2[local428] = null;
			Static274.aClass1_Sub2_Sub4Array4[local428] = null;
			Static204.aClass133Array1[local428] = null;
		}
		return local1293;
	}

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(IIILclient!pi;I)Lclient!ei;")
	public Class6_Sub2 method3868(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class133 arg3) {
		if (this.anInt5039 != -1) {
			return Static24.method424(this.anInt5039).method499(arg3, arg2, arg0, arg1);
		}
		@Pc(47) Class6_Sub2 local47 = (Class6_Sub2) Static12.aClass31_2.method852(this.aLong157);
		if (local47 == null) {
			@Pc(53) boolean local53 = false;
			@Pc(65) int local65;
			for (@Pc(55) int local55 = 0; local55 < 12; local55++) {
				local65 = this.anIntArray588[local55];
				if ((local65 & 0x40000000) == 0) {
					if ((Integer.MIN_VALUE & local65) != 0 && !Static153.method2366(local65 & 0x3FFFFFFF).method4186()) {
						local53 = true;
					}
				} else if (!Static183.method4458(local65 & 0x3FFFFFFF).method2670(this.aBoolean390)) {
					local53 = true;
				}
			}
			if (local53) {
				return null;
			}
			@Pc(117) Class6_Sub3[] local117 = new Class6_Sub3[12];
			local65 = 0;
			@Pc(129) int local129;
			for (@Pc(121) int local121 = 0; local121 < 12; local121++) {
				local129 = this.anIntArray588[local121];
				@Pc(146) Class6_Sub3 local146;
				if ((local129 & 0x40000000) != 0) {
					local146 = Static183.method4458(local129 & 0x3FFFFFFF).method2677(this.aBoolean390);
					if (local146 != null) {
						local117[local65++] = local146;
					}
				} else if ((local129 & Integer.MIN_VALUE) != 0) {
					local146 = Static153.method2366(local129 & 0x3FFFFFFF).method4189();
					if (local146 != null) {
						local117[local65++] = local146;
					}
				}
			}
			@Pc(186) Class6_Sub3 local186 = new Class6_Sub3(local117, local65);
			for (local129 = 0; local129 < 5; local129++) {
				if (Static138.aShortArrayArray9[local129].length > this.anIntArray589[local129]) {
					local186.method1424(Static9.aShortArray1[local129], Static138.aShortArrayArray9[local129][this.anIntArray589[local129]]);
				}
				if (Static133.aShortArrayArray8[local129].length > this.anIntArray589[local129]) {
					local186.method1424(Static202.aShortArray84[local129], Static133.aShortArrayArray8[local129][this.anIntArray589[local129]]);
				}
			}
			local47 = local186.method1425(64, 768, -50, -10, -50);
			Static12.aClass31_2.method851(local47, this.aLong157);
		}
		if (arg3 != null) {
			local47 = arg3.method3164(arg0, local47, arg1, arg2);
		}
		return local47;
	}

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(IZIIILclient!pi;II)Lclient!ei;")
	public Class6_Sub2 method3869(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class133 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(18) long local18 = (long) (arg0 << 16) | (long) arg6 << 32 | (long) arg2;
		@Pc(24) Class6_Sub2 local24 = (Class6_Sub2) Static12.aClass31_2.method852(local18);
		if (local24 == null) {
			@Pc(30) Class6_Sub3[] local30 = new Class6_Sub3[3];
			@Pc(32) int local32 = 0;
			if (!Static153.method2366(arg2).method4186() || !Static153.method2366(arg0).method4186() || !Static153.method2366(arg6).method4186()) {
				return null;
			}
			@Pc(58) Class6_Sub3 local58 = Static153.method2366(arg2).method4189();
			if (local58 != null) {
				local32++;
				local30[0] = local58;
			}
			local58 = Static153.method2366(arg0).method4189();
			if (local58 != null) {
				local30[local32++] = local58;
			}
			local58 = Static153.method2366(arg6).method4189();
			if (local58 != null) {
				local30[local32++] = local58;
			}
			local58 = new Class6_Sub3(local30, local32);
			for (@Pc(104) int local104 = 0; local104 < 5; local104++) {
				if (this.anIntArray589[local104] < Static138.aShortArrayArray9[local104].length) {
					local58.method1424(Static9.aShortArray1[local104], Static138.aShortArrayArray9[local104][this.anIntArray589[local104]]);
				}
				if (this.anIntArray589[local104] < Static133.aShortArrayArray8[local104].length) {
					local58.method1424(Static202.aShortArray84[local104], Static133.aShortArrayArray8[local104][this.anIntArray589[local104]]);
				}
			}
			local24 = local58.method1425(64, 768, -50, -10, -50);
			Static12.aClass31_2.method851(local24, local18);
		}
		if (arg4 != null) {
			local24 = arg4.method3164(arg3, local24, arg5, arg1);
		}
		return local24;
	}

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "([IIZ[III)V")
	public void method3870(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int[] arg3, @OriginalArg(5) int arg4) {
		if (arg1 != this.anInt5027) {
			this.anIntArrayArray41 = null;
			this.anInt5027 = arg1;
		}
		if (arg3 == null) {
			arg3 = new int[12];
			for (@Pc(25) int local25 = 0; local25 < 8; local25++) {
				for (@Pc(30) int local30 = 0; local30 < Static292.anInt5800; local30++) {
					@Pc(37) Class166 local37 = Static153.method2366(local30);
					if (local37 != null && !local37.aBoolean418 && (arg2 ? Static92.anIntArray232[local25] : Static283.anIntArray660[local25]) == local37.anInt5469) {
						arg3[Static168.anIntArray375[local25]] = Integer.MIN_VALUE | local30;
						break;
					}
				}
			}
		}
		this.anIntArray588 = arg3;
		this.anIntArray589 = arg0;
		this.aBoolean390 = arg2;
		this.anInt5039 = arg4;
		this.method3860();
	}

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(IBI)V")
	public void method3871(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = Static168.anIntArray375[arg1];
		if (0 != this.anIntArray588[local7] && Static153.method2366(arg0) != null) {
			this.anIntArray588[local7] = arg0 | Integer.MIN_VALUE;
			this.method3860();
		}
	}
}
