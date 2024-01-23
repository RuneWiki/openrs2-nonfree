import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!og")
public final class Class126 {

	@OriginalMember(owner = "client!og", name = "a", descriptor = "J")
	private long aLong211;

	@OriginalMember(owner = "client!og", name = "d", descriptor = "J")
	private long aLong212;

	@OriginalMember(owner = "client!og", name = "i", descriptor = "[I")
	public int[] anIntArray323;

	@OriginalMember(owner = "client!og", name = "k", descriptor = "I")
	public int anInt3962;

	@OriginalMember(owner = "client!og", name = "l", descriptor = "Z")
	public boolean aBoolean335;

	@OriginalMember(owner = "client!og", name = "m", descriptor = "I")
	private int anInt3963;

	@OriginalMember(owner = "client!og", name = "n", descriptor = "[[I")
	private int[][] anIntArrayArray36;

	@OriginalMember(owner = "client!og", name = "u", descriptor = "[I")
	private int[] anIntArray324;

	@OriginalMember(owner = "client!og", name = "a", descriptor = "([IZI[IBI)V")
	public void method3188(@OriginalArg(0) int[] arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(5) int arg4) {
		if (this.anInt3963 != arg4) {
			this.anInt3963 = arg4;
			this.anIntArrayArray36 = null;
		}
		if (arg0 == null) {
			arg0 = new int[12];
			for (@Pc(29) int local29 = 0; local29 < 8; local29++) {
				for (@Pc(34) int local34 = 0; local34 < Static122.anInt2601; local34++) {
					@Pc(45) Class179 local45 = Static20.method1067(local34);
					if (local45 != null && !local45.aBoolean476 && (arg1 ? Static44.anIntArray67[local29] : Static208.anIntArray356[local29]) == local45.anInt5892) {
						arg0[Static7.anIntArray9[local29]] = local34 | Integer.MIN_VALUE;
						break;
					}
				}
			}
		}
		this.anInt3962 = arg2;
		this.anIntArray323 = arg3;
		this.aBoolean335 = arg1;
		this.anIntArray324 = arg0;
		this.method3195();
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(ILclient!bd;Lclient!bd;I[Lclient!jh;IIIIIZ)Lclient!r;")
	public Class36_Sub2 method3189(@OriginalArg(0) int arg0, @OriginalArg(1) Class15 arg1, @OriginalArg(2) Class15 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class86[] arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (this.anInt3962 != -1) {
			return Static112.method2081(this.anInt3962).method713(arg2, arg5, arg1, arg8, arg7, arg3, arg6, arg4, arg0);
		}
		@Pc(32) long local32 = this.aLong211;
		@Pc(35) int[] local35 = this.anIntArray324;
		if (arg1 != null && (arg1.anInt416 >= 0 || arg1.anInt433 >= 0)) {
			local35 = new int[12];
			for (@Pc(52) int local52 = 0; local52 < 12; local52++) {
				local35[local52] = this.anIntArray324[local52];
			}
			if (arg1.anInt416 >= 0) {
				if (arg1.anInt416 == 65535) {
					local35[5] = 0;
					local32 ^= 0xFFFFFFFF00000000L;
				} else {
					local35[5] = arg1.anInt416 | 0x40000000;
					local32 ^= (long) local35[5] << 32;
				}
			}
			if (arg1.anInt433 >= 0) {
				if (arg1.anInt433 == 65535) {
					local32 ^= 0xFFFFFFFFL;
					local35[3] = 0;
				} else {
					local35[3] = arg1.anInt433 | 0x40000000;
					local32 ^= local35[3];
				}
			}
		}
		@Pc(136) Class36_Sub2 local136 = (Class36_Sub2) Static70.aClass46_7.method1074(local32);
		@Pc(140) boolean local140;
		@Pc(353) int local353;
		@Pc(325) int local325;
		@Pc(332) int local332;
		@Pc(346) int local346;
		@Pc(339) int local339;
		@Pc(418) int local418;
		@Pc(424) int local424;
		@Pc(442) int local442;
		@Pc(448) int local448;
		@Pc(466) int local466;
		@Pc(318) int local318;
		if (local136 == null) {
			local140 = false;
			@Pc(149) int local149;
			for (@Pc(142) int local142 = 0; local142 < 12; local142++) {
				local149 = local35[local142];
				if ((local149 & 0x40000000) == 0) {
					if ((Integer.MIN_VALUE & local149) != 0 && !Static20.method1067(local149 & 0x3FFFFFFF).method4729()) {
						local140 = true;
					}
				} else if (!Static152.method2616(local149 & 0x3FFFFFFF).method3925(this.aBoolean335)) {
					local140 = true;
				}
			}
			if (local140) {
				if (this.aLong212 != -1L) {
					local136 = (Class36_Sub2) Static70.aClass46_7.method1074(this.aLong212);
				}
				if (local136 == null) {
					return null;
				}
			}
			if (local136 == null) {
				@Pc(212) Class36_Sub6[] local212 = new Class36_Sub6[12];
				@Pc(221) int local221;
				for (local149 = 0; local149 < 12; local149++) {
					local221 = local35[local149];
					@Pc(240) Class36_Sub6 local240;
					if ((local221 & 0x40000000) != 0) {
						local240 = Static152.method2616(local221 & 0x3FFFFFFF).method3924(this.aBoolean335);
						if (local240 != null) {
							local212[local149] = local240;
						}
					} else if ((Integer.MIN_VALUE & local221) != 0) {
						local240 = Static20.method1067(local221 & 0x3FFFFFFF).method4721();
						if (local240 != null) {
							local212[local149] = local240;
						}
					}
				}
				@Pc(272) Class70 local272 = null;
				if (this.anInt3963 != -1) {
					local272 = Static216.method3653(this.anInt3963);
				}
				if (local272 != null && local272.anIntArrayArray20 != null) {
					for (local221 = 0; local221 < local272.anIntArrayArray20.length; local221++) {
						if (local272.anIntArrayArray20[local221] != null && local212[local221] != null) {
							local318 = local272.anIntArrayArray20[local221][0];
							local325 = local272.anIntArrayArray20[local221][2];
							local332 = local272.anIntArrayArray20[local221][3];
							local339 = local272.anIntArrayArray20[local221][5];
							local346 = local272.anIntArrayArray20[local221][4];
							local353 = local272.anIntArrayArray20[local221][1];
							if (this.anIntArrayArray36 == null) {
								this.anIntArrayArray36 = new int[local272.anIntArrayArray20.length][];
							}
							if (this.anIntArrayArray36[local221] == null) {
								@Pc(376) int[] local376 = this.anIntArrayArray36[local221] = new int[15];
								if (local332 == 0 && local346 == 0 && local339 == 0) {
									local376[13] = -local353;
									local376[0] = local376[4] = local376[8] = 32768;
									local376[14] = -local325;
									local376[12] = -local318;
								} else {
									local418 = Class66.anIntArray153[local332] >> 1;
									local424 = Class66.anIntArray148[local332] >> 1;
									@Pc(430) int local430 = Class66.anIntArray153[local346] >> 1;
									@Pc(436) int local436 = Class66.anIntArray148[local346] >> 1;
									local442 = Class66.anIntArray153[local339] >> 1;
									local448 = Class66.anIntArray148[local339] >> 1;
									local376[2] = local436 * local418 + 16384 >> 15;
									local466 = local424 * local442 + 16384 >> 15;
									local376[7] = local466 * local430 + -local448 * -local436 + 16384 >> 15;
									local376[5] = -local424;
									local376[4] = local442 * local418 + 16384 >> 15;
									@Pc(505) int local505 = local448 * local424 + 16384 >> 15;
									local376[8] = local418 * local430 + 16384 >> 15;
									local376[0] = local505 * local436 + local442 * local430 + 16384 >> 15;
									local376[1] = local466 * local436 + -local448 * local430 + 16384 >> 15;
									local376[6] = local442 * -local436 + local430 * local505 + 16384 >> 15;
									local376[13] = -local318 * local376[1] + local376[4] * -local353 + local376[7] * -local325 + 16384 >> 15;
									local376[3] = local448 * local418 + 16384 >> 15;
									local376[12] = local376[3] * -local353 + local376[0] * -local318 + local376[6] * -local325 + 16384 >> 15;
									local376[14] = -local318 * local376[2] + -local353 * local376[5] + -local325 * local376[8] + 16384 >> 15;
								}
								local376[11] = local325;
								local376[9] = local318;
								local376[10] = local353;
							}
							if (local332 != 0 || local346 != 0 || local339 != 0) {
								local212[local221].method4063(local332, local346, local339);
							}
							if (local318 != 0 || local353 != 0 || local325 != 0) {
								local212[local221].method4055(local318, local353, local325);
							}
						}
					}
				}
				@Pc(712) Class36_Sub6 local712 = new Class36_Sub6(local212, local212.length);
				for (local318 = 0; local318 < 5; local318++) {
					if (Static233.aShortArrayArray5[local318].length > this.anIntArray323[local318]) {
						local712.method4060(Static28.aShortArray5[local318], Static233.aShortArrayArray5[local318][this.anIntArray323[local318]]);
					}
					if (this.anIntArray323[local318] < Static215.aShortArrayArray4[local318].length) {
						local712.method4060(Static32.aShortArray6[local318], Static215.aShortArrayArray4[local318][this.anIntArray323[local318]]);
					}
				}
				local136 = local712.method4049(64, 850, -30, -50, -30);
				if (Static60.aBoolean106) {
					((Class36_Sub2_Sub1) local136).method947(false, false, true, false, false, true);
				}
				Static70.aClass46_7.method1071(local136, local32);
				this.aLong212 = local32;
			}
		}
		local140 = false;
		@Pc(806) boolean local806 = false;
		@Pc(808) boolean local808 = false;
		local318 = arg4 == null ? 0 : arg4.length;
		@Pc(818) boolean local818 = false;
		@Pc(954) int local954;
		for (local353 = 0; local353 < local318; local353++) {
			if (arg4[local353] != null) {
				@Pc(836) Class15 local836 = Static35.method706(arg4[local353].anInt2565);
				if (local836.anIntArray26 != null) {
					local140 = true;
					Static274.aClass15Array3[local353] = local836;
					local346 = arg4[local353].anInt2575;
					local332 = arg4[local353].anInt2579;
					local339 = local836.anIntArray26[local332];
					Static150.aClass2_Sub3_Sub13Array4[local353] = Static67.method4883(local339 >>> 16);
					local339 &= 0xFFFF;
					Static270.anIntArray493[local353] = local339;
					if (Static150.aClass2_Sub3_Sub13Array4[local353] != null) {
						local806 |= Static150.aClass2_Sub3_Sub13Array4[local353].method2467(local339);
						local818 |= Static150.aClass2_Sub3_Sub13Array4[local353].method2470(local339);
						local808 |= local836.aBoolean32;
					}
					if ((local836.aBoolean31 || Static176.aBoolean324) && local346 != -1 && local836.anIntArray26.length > local346) {
						Static133.anIntArray203[local353] = local836.anIntArray28[local332];
						Static183.anIntArray310[local353] = arg4[local353].anInt2568;
						local954 = local836.anIntArray26[local346];
						Static68.aClass2_Sub3_Sub13Array3[local353] = Static67.method4883(local954 >>> 16);
						@Pc(966) int local966 = local954 & 0xFFFF;
						Static191.anIntArray45[local353] = local966;
						if (Static68.aClass2_Sub3_Sub13Array3[local353] != null) {
							local806 |= Static68.aClass2_Sub3_Sub13Array3[local353].method2467(local966);
							local818 |= Static68.aClass2_Sub3_Sub13Array3[local353].method2470(local966);
						}
					} else {
						Static133.anIntArray203[local353] = 0;
						Static183.anIntArray310[local353] = 0;
						Static68.aClass2_Sub3_Sub13Array3[local353] = null;
						Static191.anIntArray45[local353] = -1;
					}
				}
			}
		}
		if (!local140 && arg1 == null && arg2 == null) {
			return local136;
		}
		local353 = -1;
		local325 = -1;
		local332 = 0;
		@Pc(1013) Class2_Sub3_Sub13 local1013 = null;
		@Pc(1015) Class2_Sub3_Sub13 local1015 = null;
		if (arg1 != null) {
			local353 = arg1.anIntArray26[arg3];
			local954 = local353 >>> 16;
			local353 &= 0xFFFF;
			local1013 = Static67.method4883(local954);
			if (local1013 != null) {
				local806 |= local1013.method2467(local353);
				local818 |= local1013.method2470(local353);
				local808 |= arg1.aBoolean32;
			}
			if ((arg1.aBoolean31 || Static176.aBoolean324) && arg8 != -1 && arg1.anIntArray26.length > arg8) {
				local325 = arg1.anIntArray26[arg8];
				local418 = local325 >>> 16;
				local325 &= 0xFFFF;
				local332 = arg1.anIntArray28[arg3];
				if (local954 == local418) {
					local1015 = local1013;
				} else {
					local1015 = Static67.method4883(local325 >>> 16);
				}
				if (local1015 != null) {
					local806 |= local1015.method2467(local325);
					local818 |= local1015.method2470(local325);
				}
			}
		}
		local418 = -1;
		local954 = -1;
		local424 = 0;
		@Pc(1131) Class2_Sub3_Sub13 local1131 = null;
		@Pc(1133) Class2_Sub3_Sub13 local1133 = null;
		if (arg2 != null) {
			local954 = arg2.anIntArray26[arg7];
			local442 = local954 >>> 16;
			local1133 = Static67.method4883(local442);
			local954 &= 0xFFFF;
			if (local1133 != null) {
				local806 |= local1133.method2467(local954);
				local818 |= local1133.method2470(local954);
				local808 |= arg2.aBoolean32;
			}
			if ((arg2.aBoolean31 || Static176.aBoolean324) && arg0 != -1 && arg2.anIntArray26.length > arg0) {
				local418 = arg2.anIntArray26[arg0];
				local448 = local418 >>> 16;
				local424 = arg2.anIntArray28[arg7];
				local418 &= 0xFFFF;
				if (local442 == local448) {
					local1131 = local1133;
				} else {
					local1131 = Static67.method4883(local418 >>> 16);
				}
				if (local1131 != null) {
					local806 |= local1131.method2467(local418);
					local818 |= local1131.method2470(local418);
				}
			}
		}
		@Pc(1259) Class36_Sub2 local1259 = local136.method3851(!local818, !local806, !local808);
		local448 = 0;
		local466 = 1;
		while (local318 > local448) {
			if (Static150.aClass2_Sub3_Sub13Array4[local448] != null) {
				local1259.method3836(Static150.aClass2_Sub3_Sub13Array4[local448], Static270.anIntArray493[local448], Static68.aClass2_Sub3_Sub13Array3[local448], Static191.anIntArray45[local448], Static183.anIntArray310[local448] - 1, Static133.anIntArray203[local448], local466, Static274.aClass15Array3[local448].aBoolean32, this.anIntArrayArray36[local448]);
			}
			local448++;
			local466 <<= 0x1;
		}
		if (local1013 != null && local1133 != null) {
			local1259.method3828(local1013, local353, local1015, local325, arg6 - 1, local332, local1133, local954, local1131, local418, arg5 - 1, local424, arg1.aBooleanArray3, arg1.aBoolean32 | arg2.aBoolean32);
		} else if (local1013 != null) {
			local1259.method3849(local1013, local353, local1015, local325, arg6 - 1, local332, arg1.aBoolean32);
		} else if (local1133 != null) {
			local1259.method3849(local1133, local954, local1131, local418, arg5 - 1, local424, arg2.aBoolean32);
		}
		for (local448 = 0; local448 < local318; local448++) {
			Static150.aClass2_Sub3_Sub13Array4[local448] = null;
			Static68.aClass2_Sub3_Sub13Array3[local448] = null;
			Static274.aClass15Array3[local448] = null;
		}
		return local1259;
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(IZ)V")
	public void method3192(@OriginalArg(1) boolean arg0) {
		this.aBoolean335 = arg0;
		this.method3195();
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(III)V")
	public void method3193(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(19) int local19 = Static7.anIntArray9[arg0];
		if (0 != this.anIntArray324[local19] && Static20.method1067(arg1) != null) {
			this.anIntArray324[local19] = Integer.MIN_VALUE | arg1;
			this.method3195();
		}
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(B)V")
	private void method3195() {
		@Pc(8) long local8 = this.aLong211;
		@Pc(10) long[] local10 = Class33.aLongArray3;
		this.aLong211 = -1L;
		this.aLong211 = this.aLong211 >>> 8 ^ local10[(int) ((this.aLong211 ^ (long) (this.anInt3963 >> 8)) & 0xFFL)];
		this.aLong211 = this.aLong211 >>> 8 ^ local10[(int) (((long) this.anInt3963 ^ this.aLong211) & 0xFFL)];
		@Pc(64) int local64;
		for (local64 = 0; local64 < 12; local64++) {
			this.aLong211 = this.aLong211 >>> 8 ^ local10[(int) ((this.aLong211 ^ (long) (this.anIntArray324[local64] >> 24)) & 0xFFL)];
			this.aLong211 = local10[(int) ((this.aLong211 ^ (long) (this.anIntArray324[local64] >> 16)) & 0xFFL)] ^ this.aLong211 >>> 8;
			this.aLong211 = this.aLong211 >>> 8 ^ local10[(int) ((this.aLong211 ^ (long) (this.anIntArray324[local64] >> 8)) & 0xFFL)];
			this.aLong211 = local10[(int) (((long) this.anIntArray324[local64] ^ this.aLong211) & 0xFFL)] ^ this.aLong211 >>> 8;
		}
		for (local64 = 0; local64 < 5; local64++) {
			this.aLong211 = local10[(int) ((this.aLong211 ^ (long) this.anIntArray323[local64]) & 0xFFL)] ^ this.aLong211 >>> 8;
		}
		this.aLong211 = local10[(int) (((long) (this.aBoolean335 ? 1 : 0) ^ this.aLong211) & 0xFFL)] ^ this.aLong211 >>> 8;
		if (local8 != 0L && local8 != this.aLong211) {
			Static70.aClass46_7.method1076(local8);
		}
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(BILclient!bd;IIIII)Lclient!r;")
	public Class36_Sub2 method3196(@OriginalArg(1) int arg0, @OriginalArg(2) Class15 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(14) long local14 = (long) arg0 | (long) (arg5 << 16) | (long) arg2 << 32;
		@Pc(24) Class36_Sub2 local24 = (Class36_Sub2) Static116.aClass46_18.method1074(local14);
		if (local24 == null) {
			@Pc(30) Class36_Sub6[] local30 = new Class36_Sub6[3];
			@Pc(32) int local32 = 0;
			if (!Static20.method1067(arg0).method4730() || !Static20.method1067(arg5).method4730() || !Static20.method1067(arg2).method4730()) {
				return null;
			}
			@Pc(56) Class36_Sub6 local56 = Static20.method1067(arg0).method4720();
			if (local56 != null) {
				local32++;
				local30[0] = local56;
			}
			local56 = Static20.method1067(arg5).method4720();
			if (local56 != null) {
				local30[local32++] = local56;
			}
			local56 = Static20.method1067(arg2).method4720();
			if (local56 != null) {
				local30[local32++] = local56;
			}
			local56 = new Class36_Sub6(local30, local32);
			for (@Pc(105) int local105 = 0; local105 < 5; local105++) {
				if (this.anIntArray323[local105] < Static233.aShortArrayArray5[local105].length) {
					local56.method4060(Static28.aShortArray5[local105], Static233.aShortArrayArray5[local105][this.anIntArray323[local105]]);
				}
				if (Static215.aShortArrayArray4[local105].length > this.anIntArray323[local105]) {
					local56.method4060(Static32.aShortArray6[local105], Static215.aShortArrayArray4[local105][this.anIntArray323[local105]]);
				}
			}
			local24 = local56.method4049(64, 768, -50, -10, -50);
			Static116.aClass46_18.method1071(local24, local14);
		}
		if (arg1 != null) {
			local24 = arg1.method365(arg6, local24, arg4, arg3);
		}
		return local24;
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(Z)I")
	public int method3197() {
		return this.anInt3962 == -1 ? (this.anIntArray324[8] << 10) + (this.anIntArray324[0] << 15) + (this.anIntArray323[4] << 20) + (this.anIntArray323[0] << 25) + (this.anIntArray324[11] << 5) + this.anIntArray324[1] : 305419896 - -Static112.method2081(this.anInt3962).anInt868;
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(IZI)V")
	public void method3198(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray323[arg1] = arg0;
		this.method3195();
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(Lclient!bd;ZIII)Lclient!r;")
	public Class36_Sub2 method3200(@OriginalArg(0) Class15 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (this.anInt3962 != -1) {
			return Static112.method2081(this.anInt3962).method715(arg1, arg2, arg3, arg0);
		}
		@Pc(33) Class36_Sub2 local33 = (Class36_Sub2) Static116.aClass46_18.method1074(this.aLong211);
		if (local33 == null) {
			@Pc(37) boolean local37 = false;
			@Pc(49) int local49;
			for (@Pc(39) int local39 = 0; local39 < 12; local39++) {
				local49 = this.anIntArray324[local39];
				if ((local49 & 0x40000000) == 0) {
					if ((Integer.MIN_VALUE & local49) != 0 && !Static20.method1067(local49 & 0x3FFFFFFF).method4730()) {
						local37 = true;
					}
				} else if (!Static152.method2616(local49 & 0x3FFFFFFF).method3922(this.aBoolean335)) {
					local37 = true;
				}
			}
			if (local37) {
				return null;
			}
			local49 = 0;
			@Pc(95) Class36_Sub6[] local95 = new Class36_Sub6[12];
			@Pc(107) int local107;
			for (@Pc(97) int local97 = 0; local97 < 12; local97++) {
				local107 = this.anIntArray324[local97];
				@Pc(124) Class36_Sub6 local124;
				if ((local107 & 0x40000000) != 0) {
					local124 = Static152.method2616(local107 & 0x3FFFFFFF).method3920(this.aBoolean335);
					if (local124 != null) {
						local95[local49++] = local124;
					}
				} else if ((Integer.MIN_VALUE & local107) != 0) {
					local124 = Static20.method1067(local107 & 0x3FFFFFFF).method4720();
					if (local124 != null) {
						local95[local49++] = local124;
					}
				}
			}
			@Pc(168) Class36_Sub6 local168 = new Class36_Sub6(local95, local49);
			for (local107 = 0; local107 < 5; local107++) {
				if (this.anIntArray323[local107] < Static233.aShortArrayArray5[local107].length) {
					local168.method4060(Static28.aShortArray5[local107], Static233.aShortArrayArray5[local107][this.anIntArray323[local107]]);
				}
				if (Static215.aShortArrayArray4[local107].length > this.anIntArray323[local107]) {
					local168.method4060(Static32.aShortArray6[local107], Static215.aShortArrayArray4[local107][this.anIntArray323[local107]]);
				}
			}
			local33 = local168.method4049(64, 768, -50, -10, -50);
			Static116.aClass46_18.method1071(local33, this.aLong211);
		}
		if (arg0 != null) {
			local33 = arg0.method365(arg1, local33, arg3, arg2);
		}
		return local33;
	}
}
