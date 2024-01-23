import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ra")
public final class Class143 {

	@OriginalMember(owner = "client!ra", name = "b", descriptor = "J")
	private long aLong161;

	@OriginalMember(owner = "client!ra", name = "k", descriptor = "[[I")
	private int[][] anIntArrayArray37;

	@OriginalMember(owner = "client!ra", name = "l", descriptor = "I")
	private int anInt4433;

	@OriginalMember(owner = "client!ra", name = "m", descriptor = "[I")
	public int[] anIntArray396;

	@OriginalMember(owner = "client!ra", name = "o", descriptor = "Z")
	public boolean aBoolean295;

	@OriginalMember(owner = "client!ra", name = "s", descriptor = "J")
	private long aLong162;

	@OriginalMember(owner = "client!ra", name = "t", descriptor = "[I")
	private int[] anIntArray397;

	@OriginalMember(owner = "client!ra", name = "w", descriptor = "I")
	public int anInt4440;

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(III)V")
	public void method3562(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) int local3 = Static185.anIntArray306[arg0];
		if (0 != this.anIntArray397[local3] && Static245.method3746(arg1) != null) {
			this.anIntArray397[local3] = arg1 | Integer.MIN_VALUE;
			this.method3573();
		}
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(BI[IZ[II)V")
	public void method3563(@OriginalArg(1) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int[] arg3, @OriginalArg(5) int arg4) {
		if (this.anInt4433 != arg0) {
			this.anInt4433 = arg0;
			this.anIntArrayArray37 = null;
		}
		if (arg3 == null) {
			arg3 = new int[12];
			for (@Pc(29) int local29 = 0; local29 < 8; local29++) {
				for (@Pc(34) int local34 = 0; local34 < Static264.anInt4974; local34++) {
					@Pc(41) Class57 local41 = Static245.method3746(local34);
					if (local41 != null && !local41.aBoolean152 && (arg2 ? Static110.anIntArray228[local29] : Static169.anIntArray296[local29]) == local41.anInt2067) {
						arg3[Static185.anIntArray306[local29]] = Integer.MIN_VALUE | local34;
						break;
					}
				}
			}
		}
		this.anIntArray397 = arg3;
		this.anIntArray396 = arg1;
		this.aBoolean295 = arg2;
		this.anInt4440 = arg4;
		this.method3573();
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(BZ)V")
	public void method3564(@OriginalArg(1) boolean arg0) {
		this.aBoolean295 = arg0;
		this.method3573();
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(IIB)V")
	public void method3565(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anIntArray396[arg1] = arg0;
		this.method3573();
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(IIIIIIILclient!qm;)Lclient!uc;")
	public Class12_Sub2 method3568(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class141 arg6) {
		@Pc(18) long local18 = (long) arg3 | (long) (arg2 << 16) | (long) arg0 << 32;
		@Pc(24) Class12_Sub2 local24 = (Class12_Sub2) Static46.aClass33_8.method841(local18);
		if (local24 == null) {
			@Pc(49) int local49 = 0;
			@Pc(52) Class12_Sub7[] local52 = new Class12_Sub7[3];
			if (!Static245.method3746(arg3).method1570() || !Static245.method3746(arg2).method1570() || !Static245.method3746(arg0).method1570()) {
				return null;
			}
			@Pc(78) Class12_Sub7 local78 = Static245.method3746(arg3).method1565();
			if (local78 != null) {
				local49++;
				local52[0] = local78;
			}
			local78 = Static245.method3746(arg2).method1565();
			if (local78 != null) {
				local52[local49++] = local78;
			}
			local78 = Static245.method3746(arg0).method1565();
			if (local78 != null) {
				local52[local49++] = local78;
			}
			local78 = new Class12_Sub7(local52, local49);
			for (@Pc(121) int local121 = 0; local121 < 5; local121++) {
				if (this.anIntArray396[local121] < Static118.aShortArrayArray1[local121].length) {
					local78.method3327(Static28.aShortArray3[local121], Static118.aShortArrayArray1[local121][this.anIntArray396[local121]]);
				}
				if (Static274.aShortArrayArray5[local121].length > this.anIntArray396[local121]) {
					local78.method3327(Static184.aShortArray39[local121], Static274.aShortArrayArray5[local121][this.anIntArray396[local121]]);
				}
			}
			local24 = local78.method3325(64, 768, -50, -10, -50);
			Static46.aClass33_8.method845(local24, local18);
		}
		if (arg6 != null) {
			local24 = arg6.method3521(local24, arg5, arg4, arg1);
		}
		return local24;
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(Lclient!qm;IIII)Lclient!uc;")
	public Class12_Sub2 method3569(@OriginalArg(0) Class141 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (this.anInt4440 != -1) {
			return Static262.method3970(this.anInt4440).method4130(arg1, arg2, arg0, arg3);
		}
		@Pc(30) Class12_Sub2 local30 = (Class12_Sub2) Static46.aClass33_8.method841(this.aLong162);
		if (local30 == null) {
			@Pc(36) boolean local36 = false;
			@Pc(48) int local48;
			for (@Pc(38) int local38 = 0; local38 < 12; local38++) {
				local48 = this.anIntArray397[local38];
				if ((local48 & 0x40000000) == 0) {
					if ((Integer.MIN_VALUE & local48) != 0 && !Static245.method3746(local48 & 0x3FFFFFFF).method1570()) {
						local36 = true;
					}
				} else if (!Static277.method4117(local48 & 0x3FFFFFFF).method3895(this.aBoolean295)) {
					local36 = true;
				}
			}
			if (local36) {
				return null;
			}
			local48 = 0;
			@Pc(93) Class12_Sub7[] local93 = new Class12_Sub7[12];
			@Pc(103) int local103;
			for (@Pc(95) int local95 = 0; local95 < 12; local95++) {
				local103 = this.anIntArray397[local95];
				@Pc(120) Class12_Sub7 local120;
				if ((local103 & 0x40000000) != 0) {
					local120 = Static277.method4117(local103 & 0x3FFFFFFF).method3890(this.aBoolean295);
					if (local120 != null) {
						local93[local48++] = local120;
					}
				} else if ((Integer.MIN_VALUE & local103) != 0) {
					local120 = Static245.method3746(local103 & 0x3FFFFFFF).method1565();
					if (local120 != null) {
						local93[local48++] = local120;
					}
				}
			}
			@Pc(158) Class12_Sub7 local158 = new Class12_Sub7(local93, local48);
			for (local103 = 0; local103 < 5; local103++) {
				if (Static118.aShortArrayArray1[local103].length > this.anIntArray396[local103]) {
					local158.method3327(Static28.aShortArray3[local103], Static118.aShortArrayArray1[local103][this.anIntArray396[local103]]);
				}
				if (this.anIntArray396[local103] < Static274.aShortArrayArray5[local103].length) {
					local158.method3327(Static184.aShortArray39[local103], Static274.aShortArrayArray5[local103][this.anIntArray396[local103]]);
				}
			}
			local30 = local158.method3325(64, 768, -50, -10, -50);
			Static46.aClass33_8.method845(local30, this.aLong162);
		}
		if (arg0 != null) {
			local30 = arg0.method3521(local30, arg3, arg1, arg2);
		}
		return local30;
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(Lclient!qm;[Lclient!cm;IIIIILclient!qm;ZII)Lclient!uc;")
	public Class12_Sub2 method3570(@OriginalArg(0) Class141 arg0, @OriginalArg(1) Class28[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class141 arg6, @OriginalArg(9) int arg7, @OriginalArg(10) int arg8) {
		if (this.anInt4440 != -1) {
			return Static262.method3970(this.anInt4440).method4127(arg7, arg0, arg8, arg1, arg3, arg5, arg6, arg4, arg2);
		}
		@Pc(33) long local33 = this.aLong162;
		@Pc(36) int[] local36 = this.anIntArray397;
		if (arg6 != null && (arg6.anInt4352 >= 0 || arg6.anInt4351 >= 0)) {
			local36 = new int[12];
			for (@Pc(51) int local51 = 0; local51 < 12; local51++) {
				local36[local51] = this.anIntArray397[local51];
			}
			if (arg6.anInt4352 >= 0) {
				if (arg6.anInt4352 == 65535) {
					local33 ^= 0xFFFFFFFF00000000L;
					local36[5] = 0;
				} else {
					local36[5] = arg6.anInt4352 | 0x40000000;
					local33 ^= (long) local36[5] << 32;
				}
			}
			if (arg6.anInt4351 >= 0) {
				if (arg6.anInt4351 == 65535) {
					local33 ^= 0xFFFFFFFFL;
					local36[3] = 0;
				} else {
					local36[3] = arg6.anInt4351 | 0x40000000;
					local33 ^= local36[3];
				}
			}
		}
		@Pc(142) Class12_Sub2 local142 = (Class12_Sub2) Static222.aClass33_33.method841(local33);
		@Pc(147) boolean local147;
		@Pc(347) int local347;
		@Pc(340) int local340;
		@Pc(361) int local361;
		@Pc(354) int local354;
		@Pc(368) int local368;
		@Pc(440) int local440;
		@Pc(446) int local446;
		@Pc(458) int local458;
		@Pc(470) int local470;
		@Pc(478) int local478;
		@Pc(333) int local333;
		if (local142 == null) {
			local147 = false;
			@Pc(156) int local156;
			for (@Pc(149) int local149 = 0; local149 < 12; local149++) {
				local156 = local36[local149];
				if ((local156 & 0x40000000) == 0) {
					if ((Integer.MIN_VALUE & local156) != 0 && !Static245.method3746(local156 & 0x3FFFFFFF).method1564()) {
						local147 = true;
					}
				} else if (!Static277.method4117(local156 & 0x3FFFFFFF).method3902(this.aBoolean295)) {
					local147 = true;
				}
			}
			if (local147) {
				if (this.aLong161 != -1L) {
					local142 = (Class12_Sub2) Static222.aClass33_33.method841(this.aLong161);
				}
				if (local142 == null) {
					return null;
				}
			}
			if (local142 == null) {
				@Pc(225) Class12_Sub7[] local225 = new Class12_Sub7[12];
				@Pc(236) int local236;
				for (local156 = 0; local156 < 12; local156++) {
					local236 = local36[local156];
					@Pc(251) Class12_Sub7 local251;
					if ((local236 & 0x40000000) != 0) {
						local251 = Static277.method4117(local236 & 0x3FFFFFFF).method3900(this.aBoolean295);
						if (local251 != null) {
							local225[local156] = local251;
						}
					} else if ((local236 & Integer.MIN_VALUE) != 0) {
						local251 = Static245.method3746(local236 & 0x3FFFFFFF).method1566();
						if (local251 != null) {
							local225[local156] = local251;
						}
					}
				}
				@Pc(286) Class72 local286 = null;
				if (this.anInt4433 != -1) {
					local286 = Static26.method408(this.anInt4433);
				}
				if (local286 != null && local286.anIntArrayArray22 != null) {
					for (local236 = 0; local236 < local286.anIntArrayArray22.length; local236++) {
						if (local286.anIntArrayArray22[local236] != null && local225[local236] != null) {
							local333 = local286.anIntArrayArray22[local236][0];
							local340 = local286.anIntArrayArray22[local236][2];
							local347 = local286.anIntArrayArray22[local236][1];
							local354 = local286.anIntArrayArray22[local236][4];
							local361 = local286.anIntArrayArray22[local236][3];
							local368 = local286.anIntArrayArray22[local236][5];
							if (this.anIntArrayArray37 == null) {
								this.anIntArrayArray37 = new int[local286.anIntArrayArray22.length][];
							}
							if (this.anIntArrayArray37[local236] == null) {
								@Pc(392) int[] local392 = this.anIntArrayArray37[local236] = new int[15];
								if (local361 == 0 && local354 == 0 && local368 == 0) {
									local392[12] = -local333;
									local392[14] = -local340;
									local392[13] = -local347;
									local392[0] = local392[4] = local392[8] = 32768;
								} else {
									local440 = Class131.anIntArray353[local361] >> 1;
									local446 = Class131.anIntArray355[local361] >> 1;
									@Pc(452) int local452 = Class131.anIntArray353[local354] >> 1;
									local458 = Class131.anIntArray353[local368] >> 1;
									@Pc(464) int local464 = Class131.anIntArray355[local354] >> 1;
									local470 = Class131.anIntArray355[local368] >> 1;
									local478 = local458 * local446 + 16384 >> 15;
									local392[8] = local452 * local440 + 16384 >> 15;
									@Pc(496) int local496 = local446 * local470 + 16384 >> 15;
									local392[2] = local440 * local464 + 16384 >> 15;
									local392[7] = local452 * local478 + -local470 * -local464 + 16384 >> 15;
									local392[3] = local470 * local440 + 16384 >> 15;
									local392[5] = -local446;
									local392[0] = local496 * local464 + local452 * local458 + 16384 >> 15;
									local392[4] = local440 * local458 + 16384 >> 15;
									local392[6] = local452 * local496 + local458 * -local464 + 16384 >> 15;
									local392[1] = local452 * -local470 + local464 * local478 + 16384 >> 15;
									local392[14] = -local340 * local392[8] + local392[5] * -local347 + -local333 * local392[2] + 16384 >> 15;
									local392[12] = -local340 * local392[6] + -local347 * local392[3] + local392[0] * -local333 + 16384 >> 15;
									local392[13] = local392[1] * -local333 + local392[4] * -local347 + -local340 * local392[7] + 16384 >> 15;
								}
								local392[10] = local347;
								local392[11] = local340;
								local392[9] = local333;
							}
							if (local361 != 0 || local354 != 0 || local368 != 0) {
								local225[local236].method3331(local361, local354, local368);
							}
							if (local333 != 0 || local347 != 0 || local340 != 0) {
								local225[local236].method3330(local333, local347, local340);
							}
						}
					}
				}
				@Pc(736) Class12_Sub7 local736 = new Class12_Sub7(local225, local225.length);
				for (local333 = 0; local333 < 5; local333++) {
					if (Static118.aShortArrayArray1[local333].length > this.anIntArray396[local333]) {
						local736.method3327(Static28.aShortArray3[local333], Static118.aShortArrayArray1[local333][this.anIntArray396[local333]]);
					}
					if (this.anIntArray396[local333] < Static274.aShortArrayArray5[local333].length) {
						local736.method3327(Static184.aShortArray39[local333], Static274.aShortArrayArray5[local333][this.anIntArray396[local333]]);
					}
				}
				local142 = local736.method3325(64, 850, -30, -50, -30);
				if (Static178.aBoolean216) {
					((Class12_Sub2_Sub2) local142).method3197(false, false, true, false, false, true);
				}
				Static222.aClass33_33.method845(local142, local33);
				this.aLong161 = local33;
			}
		}
		local147 = false;
		@Pc(834) boolean local834 = false;
		@Pc(836) boolean local836 = false;
		local333 = arg1 == null ? 0 : arg1.length;
		@Pc(845) boolean local845 = false;
		@Pc(965) int local965;
		for (local347 = 0; local347 < local333; local347++) {
			if (arg1[local347] != null) {
				@Pc(862) Class141 local862 = Static296.method1376(arg1[local347].anInt860);
				if (local862.anIntArray390 != null) {
					local147 = true;
					Static18.aClass141Array1[local347] = local862;
					local361 = arg1[local347].anInt858;
					local368 = local862.anIntArray390[local361];
					local354 = arg1[local347].anInt857;
					Static57.aClass4_Sub2_Sub19Array1[local347] = Static57.method928(local368 >>> 16);
					local368 &= 0xFFFF;
					Static269.anIntArray449[local347] = local368;
					if (Static57.aClass4_Sub2_Sub19Array1[local347] != null) {
						local836 |= Static57.aClass4_Sub2_Sub19Array1[local347].method3714(local368);
						local834 |= Static57.aClass4_Sub2_Sub19Array1[local347].method3716(local368);
						local845 |= local862.aBoolean292;
					}
					if ((local862.aBoolean290 || Static112.aBoolean164) && local354 != -1 && local862.anIntArray390.length > local354) {
						Static70.anIntArray375[local347] = local862.anIntArray392[local361];
						Static62.anIntArray134[local347] = arg1[local347].anInt855;
						local965 = local862.anIntArray390[local354];
						Static187.aClass4_Sub2_Sub19Array3[local347] = Static57.method928(local965 >>> 16);
						@Pc(979) int local979 = local965 & 0xFFFF;
						Static224.anIntArray398[local347] = local979;
						if (Static187.aClass4_Sub2_Sub19Array3[local347] != null) {
							local836 |= Static187.aClass4_Sub2_Sub19Array3[local347].method3714(local979);
							local834 |= Static187.aClass4_Sub2_Sub19Array3[local347].method3716(local979);
						}
					} else {
						Static70.anIntArray375[local347] = 0;
						Static62.anIntArray134[local347] = 0;
						Static187.aClass4_Sub2_Sub19Array3[local347] = null;
						Static224.anIntArray398[local347] = -1;
					}
				}
			}
		}
		if (!local147 && arg6 == null && arg0 == null) {
			return local142;
		}
		local361 = 0;
		@Pc(1042) Class4_Sub2_Sub19 local1042 = null;
		local340 = -1;
		@Pc(1046) Class4_Sub2_Sub19 local1046 = null;
		local347 = -1;
		if (arg6 != null) {
			local347 = arg6.anIntArray390[arg3];
			local965 = local347 >>> 16;
			local1042 = Static57.method928(local965);
			local347 &= 0xFFFF;
			if (local1042 != null) {
				local836 |= local1042.method3714(local347);
				local834 |= local1042.method3716(local347);
				local845 |= arg6.aBoolean292;
			}
			if ((arg6.aBoolean290 || Static112.aBoolean164) && arg7 != -1 && arg6.anIntArray390.length > arg7) {
				local340 = arg6.anIntArray390[arg7];
				local361 = arg6.anIntArray392[arg3];
				local440 = local340 >>> 16;
				local340 &= 0xFFFF;
				if (local440 == local965) {
					local1046 = local1042;
				} else {
					local1046 = Static57.method928(local340 >>> 16);
				}
				if (local1046 != null) {
					local836 |= local1046.method3714(local340);
					local834 |= local1046.method3716(local340);
				}
			}
		}
		local965 = -1;
		local440 = -1;
		@Pc(1163) Class4_Sub2_Sub19 local1163 = null;
		local446 = 0;
		@Pc(1180) Class4_Sub2_Sub19 local1180 = null;
		if (arg0 != null) {
			local965 = arg0.anIntArray390[arg5];
			local458 = local965 >>> 16;
			local1163 = Static57.method928(local458);
			local965 &= 0xFFFF;
			if (local1163 != null) {
				local836 |= local1163.method3714(local965);
				local834 |= local1163.method3716(local965);
				local845 |= arg0.aBoolean292;
			}
			if ((arg0.aBoolean290 || Static112.aBoolean164) && arg4 != -1 && arg0.anIntArray390.length > arg4) {
				local440 = arg0.anIntArray390[arg4];
				local446 = arg0.anIntArray392[arg5];
				local470 = local440 >>> 16;
				local440 &= 0xFFFF;
				if (local470 == local458) {
					local1180 = local1163;
				} else {
					local1180 = Static57.method928(local440 >>> 16);
				}
				if (local1180 != null) {
					local836 |= local1180.method3714(local440);
					local834 |= local1180.method3716(local440);
				}
			}
		}
		@Pc(1309) Class12_Sub2 local1309 = local142.method3154(!local834, !local836, !local845);
		local470 = 0;
		local478 = 1;
		while (local333 > local470) {
			if (Static57.aClass4_Sub2_Sub19Array1[local470] != null) {
				local1309.method3150(Static57.aClass4_Sub2_Sub19Array1[local470], Static269.anIntArray449[local470], Static187.aClass4_Sub2_Sub19Array3[local470], Static224.anIntArray398[local470], Static62.anIntArray134[local470] - 1, Static70.anIntArray375[local470], local478, Static18.aClass141Array1[local470].aBoolean292, this.anIntArrayArray37[local470]);
			}
			local478 <<= 0x1;
			local470++;
		}
		if (local1042 != null && local1163 != null) {
			local1309.method3152(local1042, local347, local1046, local340, arg2 - 1, local361, local1163, local965, local1180, local440, arg8 - 1, local446, arg6.aBooleanArray19, arg6.aBoolean292 | arg0.aBoolean292);
		} else if (local1042 != null) {
			local1309.method3166(local1042, local347, local1046, local340, arg2 - 1, local361, arg6.aBoolean292);
		} else if (local1163 != null) {
			local1309.method3166(local1163, local965, local1180, local440, arg8 - 1, local446, arg0.aBoolean292);
		}
		for (local470 = 0; local470 < local333; local470++) {
			Static57.aClass4_Sub2_Sub19Array1[local470] = null;
			Static187.aClass4_Sub2_Sub19Array3[local470] = null;
			Static18.aClass141Array1[local470] = null;
		}
		return local1309;
	}

	@OriginalMember(owner = "client!ra", name = "b", descriptor = "(I)I")
	public int method3571() {
		return this.anInt4440 == -1 ? this.anIntArray397[1] + (this.anIntArray397[11] << 5) + (this.anIntArray396[0] << 25) + (this.anIntArray396[4] << 20) + (this.anIntArray397[0] << 15) + (this.anIntArray397[8] << 10) : Static262.method3970(this.anInt4440).anInt5224 + 305419896;
	}

	@OriginalMember(owner = "client!ra", name = "c", descriptor = "(I)V")
	private void method3573() {
		@Pc(4) long local4 = this.aLong162;
		this.aLong162 = -1L;
		@Pc(13) long[] local13 = Class3.aLongArray8;
		this.aLong162 = local13[(int) ((long) 255 & ((long) (this.anInt4433 >> 8) ^ this.aLong162))] ^ this.aLong162 >>> 8;
		this.aLong162 = this.aLong162 >>> 8 ^ local13[(int) ((this.aLong162 ^ (long) this.anInt4433) & 0xFFL)];
		@Pc(54) int local54;
		for (local54 = 0; local54 < 12; local54++) {
			this.aLong162 = this.aLong162 >>> 8 ^ local13[(int) (((long) (this.anIntArray397[local54] >> 24) ^ this.aLong162) & 0xFFL)];
			this.aLong162 = local13[(int) ((this.aLong162 ^ (long) (this.anIntArray397[local54] >> 16)) & 0xFFL)] ^ this.aLong162 >>> 8;
			this.aLong162 = this.aLong162 >>> 8 ^ local13[(int) ((this.aLong162 ^ (long) (this.anIntArray397[local54] >> 8)) & 0xFFL)];
			this.aLong162 = local13[(int) ((this.aLong162 ^ (long) this.anIntArray397[local54]) & 0xFFL)] ^ this.aLong162 >>> 8;
		}
		for (local54 = 0; local54 < 5; local54++) {
			this.aLong162 = local13[(int) ((this.aLong162 ^ (long) this.anIntArray396[local54]) & 0xFFL)] ^ this.aLong162 >>> 8;
		}
		this.aLong162 = this.aLong162 >>> 8 ^ local13[(int) (((long) (this.aBoolean295 ? 1 : 0) ^ this.aLong162) & 0xFFL)];
		if (local4 != 0L && this.aLong162 != local4) {
			Static222.aClass33_33.method844(local4);
		}
	}
}
