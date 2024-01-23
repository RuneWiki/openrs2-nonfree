import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!am")
public final class Class11 {

	@OriginalMember(owner = "client!am", name = "c", descriptor = "[I")
	private int[] anIntArray16;

	@OriginalMember(owner = "client!am", name = "d", descriptor = "J")
	private long aLong11;

	@OriginalMember(owner = "client!am", name = "f", descriptor = "J")
	private long aLong12;

	@OriginalMember(owner = "client!am", name = "h", descriptor = "I")
	public int anInt364;

	@OriginalMember(owner = "client!am", name = "k", descriptor = "I")
	private int anInt367;

	@OriginalMember(owner = "client!am", name = "l", descriptor = "Z")
	public boolean aBoolean26;

	@OriginalMember(owner = "client!am", name = "q", descriptor = "[[I")
	private int[][] anIntArrayArray1;

	@OriginalMember(owner = "client!am", name = "r", descriptor = "[I")
	public int[] anIntArray17;

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(BZ)V")
	public void method262(@OriginalArg(1) boolean arg0) {
		this.aBoolean26 = arg0;
		this.method268();
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(III)V")
	public void method263(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anIntArray17[arg0] = arg1;
		this.method268();
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(B)I")
	public int method264() {
		return this.anInt364 == -1 ? (this.anIntArray16[8] << 10) + (this.anIntArray16[0] << 15) + (this.anIntArray17[0] << 25) + (this.anIntArray17[4] << 20) + (this.anIntArray16[11] << 5) + this.anIntArray16[1] : Static253.method3795(this.anInt364).anInt5632 + 305419896;
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(IILclient!hn;I[Lclient!il;ZIIILclient!hn;I)Lclient!ie;")
	public Class36_Sub2 method265(@OriginalArg(1) int arg0, @OriginalArg(2) Class76 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class83[] arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5, @OriginalArg(8) int arg6, @OriginalArg(9) Class76 arg7, @OriginalArg(10) int arg8) {
		if (this.anInt364 != -1) {
			return Static253.method3795(this.anInt364).method4249(arg6, arg0, arg4, arg1, arg7, arg5, arg2, arg3, arg8);
		}
		@Pc(30) long local30 = this.aLong12;
		@Pc(33) int[] local33 = this.anIntArray16;
		if (arg7 != null && (arg7.anInt2212 >= 0 || arg7.anInt2222 >= 0)) {
			local33 = new int[12];
			for (@Pc(50) int local50 = 0; local50 < 12; local50++) {
				local33[local50] = this.anIntArray16[local50];
			}
			if (arg7.anInt2212 >= 0) {
				if (arg7.anInt2212 == 65535) {
					local33[5] = 0;
					local30 ^= 0xFFFFFFFF00000000L;
				} else {
					local33[5] = arg7.anInt2212 | 0x40000000;
					local30 ^= (long) local33[5] << 32;
				}
			}
			if (arg7.anInt2222 >= 0) {
				if (arg7.anInt2222 == 65535) {
					local30 ^= 0xFFFFFFFFL;
					local33[3] = 0;
				} else {
					local33[3] = arg7.anInt2222 | 0x40000000;
					local30 ^= local33[3];
				}
			}
		}
		@Pc(143) Class36_Sub2 local143 = (Class36_Sub2) Static87.aClass61_15.method1384(local30);
		@Pc(147) boolean local147;
		@Pc(337) int local337;
		@Pc(330) int local330;
		@Pc(351) int local351;
		@Pc(358) int local358;
		@Pc(344) int local344;
		@Pc(424) int local424;
		@Pc(430) int local430;
		@Pc(436) int local436;
		@Pc(442) int local442;
		@Pc(450) int local450;
		@Pc(323) int local323;
		if (local143 == null) {
			local147 = false;
			@Pc(158) int local158;
			for (@Pc(149) int local149 = 0; local149 < 12; local149++) {
				local158 = local33[local149];
				if ((local158 & 0x40000000) == 0) {
					if ((local158 & Integer.MIN_VALUE) != 0 && !Static203.method3160(local158 & 0x3FFFFFFF).method1281()) {
						local147 = true;
					}
				} else if (!Static140.method2222(local158 & 0x3FFFFFFF).method91(this.aBoolean26)) {
					local147 = true;
				}
			}
			if (local147) {
				if (this.aLong11 != -1L) {
					local143 = (Class36_Sub2) Static87.aClass61_15.method1384(this.aLong11);
				}
				if (local143 == null) {
					return null;
				}
			}
			if (local143 == null) {
				@Pc(225) Class36_Sub7[] local225 = new Class36_Sub7[12];
				@Pc(234) int local234;
				for (local158 = 0; local158 < 12; local158++) {
					local234 = local33[local158];
					@Pc(255) Class36_Sub7 local255;
					if ((local234 & 0x40000000) != 0) {
						local255 = Static140.method2222(local234 & 0x3FFFFFFF).method93(this.aBoolean26);
						if (local255 != null) {
							local225[local158] = local255;
						}
					} else if ((local234 & Integer.MIN_VALUE) != 0) {
						local255 = Static203.method3160(local234 & 0x3FFFFFFF).method1286();
						if (local255 != null) {
							local225[local158] = local255;
						}
					}
				}
				@Pc(284) Class12 local284 = null;
				if (this.anInt367 != -1) {
					local284 = Static242.method3648(this.anInt367);
				}
				if (local284 != null && local284.anIntArrayArray2 != null) {
					for (local234 = 0; local234 < local284.anIntArrayArray2.length; local234++) {
						if (local284.anIntArrayArray2[local234] != null && local225[local234] != null) {
							local323 = local284.anIntArrayArray2[local234][0];
							local330 = local284.anIntArrayArray2[local234][2];
							local337 = local284.anIntArrayArray2[local234][1];
							local344 = local284.anIntArrayArray2[local234][5];
							local351 = local284.anIntArrayArray2[local234][3];
							local358 = local284.anIntArrayArray2[local234][4];
							if (this.anIntArrayArray1 == null) {
								this.anIntArrayArray1 = new int[local284.anIntArrayArray2.length][];
							}
							if (this.anIntArrayArray1[local234] == null) {
								@Pc(380) int[] local380 = this.anIntArrayArray1[local234] = new int[15];
								if (local351 == 0 && local358 == 0 && local344 == 0) {
									local380[0] = local380[4] = local380[8] = 32768;
									local380[13] = -local337;
									local380[12] = -local323;
									local380[14] = -local330;
								} else {
									local424 = Class68.anIntArray139[local351] >> 1;
									local430 = Class68.anIntArray137[local351] >> 1;
									local436 = Class68.anIntArray139[local344] >> 1;
									local442 = Class68.anIntArray137[local344] >> 1;
									local450 = local430 * local436 + 16384 >> 15;
									@Pc(456) int local456 = Class68.anIntArray137[local358] >> 1;
									@Pc(464) int local464 = local430 * local442 + 16384 >> 15;
									@Pc(470) int local470 = Class68.anIntArray139[local358] >> 1;
									local380[0] = local436 * local470 + local464 * local456 + 16384 >> 15;
									local380[2] = local424 * local456 + 16384 >> 15;
									local380[1] = -local442 * local470 + local456 * local450 + 16384 >> 15;
									local380[6] = -local456 * local436 + local470 * local464 + 16384 >> 15;
									local380[4] = local436 * local424 + 16384 >> 15;
									local380[5] = -local430;
									local380[7] = -local442 * -local456 + local450 * local470 + 16384 >> 15;
									local380[13] = local380[1] * -local323 + -local337 * local380[4] + local380[7] * -local330 + 16384 >> 15;
									local380[8] = local470 * local424 + 16384 >> 15;
									local380[14] = -local330 * local380[8] + local380[2] * -local323 + -local337 * local380[5] + 16384 >> 15;
									local380[3] = local424 * local442 + 16384 >> 15;
									local380[12] = -local323 * local380[0] + -local337 * local380[3] + -local330 * local380[6] + 16384 >> 15;
								}
								local380[11] = local330;
								local380[10] = local337;
								local380[9] = local323;
							}
							if (local351 != 0 || local358 != 0 || local344 != 0) {
								local225[local234].method4204(local351, local358, local344);
							}
							if (local323 != 0 || local337 != 0 || local330 != 0) {
								local225[local234].method4197(local323, local337, local330);
							}
						}
					}
				}
				@Pc(718) Class36_Sub7 local718 = new Class36_Sub7(local225, local225.length);
				for (local323 = 0; local323 < 5; local323++) {
					if (Static152.aShortArrayArray5[local323].length > this.anIntArray17[local323]) {
						local718.method4200(Static92.aShortArray17[local323], Static152.aShortArrayArray5[local323][this.anIntArray17[local323]]);
					}
					if (Static145.aShortArrayArray4[local323].length > this.anIntArray17[local323]) {
						local718.method4200(Static21.aShortArray5[local323], Static145.aShortArrayArray4[local323][this.anIntArray17[local323]]);
					}
				}
				local143 = local718.method4193(64, 850, -30, -50, -30);
				if (Static116.aBoolean188) {
					((Class36_Sub2_Sub1) local143).method3251(false, false, true, false, false, true);
				}
				Static87.aClass61_15.method1377(local30, local143);
				this.aLong11 = local30;
			}
		}
		local147 = false;
		@Pc(808) boolean local808 = false;
		@Pc(810) boolean local810 = false;
		@Pc(812) boolean local812 = false;
		local323 = arg3 == null ? 0 : arg3.length;
		@Pc(870) int local870;
		for (local337 = 0; local337 < local323; local337++) {
			if (arg3[local337] != null) {
				@Pc(846) Class76 local846 = Static115.method1855(arg3[local337].anInt2347);
				if (local846.anIntArray159 != null) {
					local147 = true;
					Static77.aClass76Array1[local337] = local846;
					local344 = arg3[local337].anInt2343;
					local358 = arg3[local337].anInt2341;
					local870 = local846.anIntArray159[local358];
					Static147.aClass8_Sub1_Sub22Array1[local337] = Static15.method289(local870 >>> 16);
					@Pc(882) int local882 = local870 & 0xFFFF;
					Static40.anIntArray61[local337] = local882;
					if (Static147.aClass8_Sub1_Sub22Array1[local337] != null) {
						local810 |= Static147.aClass8_Sub1_Sub22Array1[local337].method4285(local882);
						local808 |= Static147.aClass8_Sub1_Sub22Array1[local337].method4281(local882);
						local812 |= local846.aBoolean172;
					}
					if ((local846.aBoolean174 || Static48.aBoolean74) && local344 != -1 && local344 < local846.anIntArray159.length) {
						Static79.anIntArray117[local337] = local846.anIntArray158[local358];
						Static197.anIntArray296[local337] = arg3[local337].anInt2340;
						local424 = local846.anIntArray159[local344];
						Static156.aClass8_Sub1_Sub22Array2[local337] = Static15.method289(local424 >>> 16);
						local424 &= 0xFFFF;
						Static17.anIntArray19[local337] = local424;
						if (Static156.aClass8_Sub1_Sub22Array2[local337] != null) {
							local810 |= Static156.aClass8_Sub1_Sub22Array2[local337].method4285(local424);
							local808 |= Static156.aClass8_Sub1_Sub22Array2[local337].method4281(local424);
						}
					} else {
						Static79.anIntArray117[local337] = 0;
						Static197.anIntArray296[local337] = 0;
						Static156.aClass8_Sub1_Sub22Array2[local337] = null;
						Static17.anIntArray19[local337] = -1;
					}
				}
			}
		}
		if (!local147 && arg7 == null && arg1 == null) {
			return local143;
		}
		local337 = -1;
		local351 = 0;
		local330 = -1;
		@Pc(1028) Class8_Sub1_Sub22 local1028 = null;
		@Pc(1030) Class8_Sub1_Sub22 local1030 = null;
		if (arg7 != null) {
			local337 = arg7.anIntArray159[arg0];
			local870 = local337 >>> 16;
			local337 &= 0xFFFF;
			local1028 = Static15.method289(local870);
			if (local1028 != null) {
				local810 |= local1028.method4285(local337);
				local808 |= local1028.method4281(local337);
				local812 |= arg7.aBoolean172;
			}
			if ((arg7.aBoolean174 || Static48.aBoolean74) && arg6 != -1 && arg6 < arg7.anIntArray159.length) {
				local330 = arg7.anIntArray159[arg6];
				local351 = arg7.anIntArray158[arg0];
				local424 = local330 >>> 16;
				local330 &= 0xFFFF;
				if (local424 == local870) {
					local1030 = local1028;
				} else {
					local1030 = Static15.method289(local330 >>> 16);
				}
				if (local1030 != null) {
					local810 |= local1030.method4285(local330);
					local808 |= local1030.method4281(local330);
				}
			}
		}
		local870 = -1;
		local430 = 0;
		@Pc(1148) Class8_Sub1_Sub22 local1148 = null;
		@Pc(1150) Class8_Sub1_Sub22 local1150 = null;
		local424 = -1;
		if (arg1 != null) {
			local870 = arg1.anIntArray159[arg2];
			local436 = local870 >>> 16;
			local870 &= 0xFFFF;
			local1148 = Static15.method289(local436);
			if (local1148 != null) {
				local810 |= local1148.method4285(local870);
				local808 |= local1148.method4281(local870);
				local812 |= arg1.aBoolean172;
			}
			if ((arg1.aBoolean174 || Static48.aBoolean74) && arg5 != -1 && arg1.anIntArray159.length > arg5) {
				local424 = arg1.anIntArray159[arg5];
				local430 = arg1.anIntArray158[arg2];
				local442 = local424 >>> 16;
				local424 &= 0xFFFF;
				if (local436 == local442) {
					local1150 = local1148;
				} else {
					local1150 = Static15.method289(local424 >>> 16);
				}
				if (local1150 != null) {
					local810 |= local1150.method4285(local424);
					local808 |= local1150.method4281(local424);
				}
			}
		}
		@Pc(1273) Class36_Sub2 local1273 = local143.method3936(!local808, !local810, !local812);
		local442 = 0;
		local450 = 1;
		while (local323 > local442) {
			if (Static147.aClass8_Sub1_Sub22Array1[local442] != null) {
				local1273.method3963(Static147.aClass8_Sub1_Sub22Array1[local442], Static40.anIntArray61[local442], Static156.aClass8_Sub1_Sub22Array2[local442], Static17.anIntArray19[local442], Static197.anIntArray296[local442] - 1, Static79.anIntArray117[local442], local450, Static77.aClass76Array1[local442].aBoolean172, this.anIntArrayArray1[local442]);
			}
			local450 <<= 0x1;
			local442++;
		}
		if (local1028 != null && local1148 != null) {
			local1273.method3943(local1028, local337, local1030, local330, arg4 - 1, local351, local1148, local870, local1150, local424, arg8 - 1, local430, arg7.aBooleanArray6, arg1.aBoolean172 | arg7.aBoolean172);
		} else if (local1028 != null) {
			local1273.method3944(local1028, local337, local1030, local330, arg4 - 1, local351, arg7.aBoolean172);
		} else if (local1148 != null) {
			local1273.method3944(local1148, local870, local1150, local424, arg8 - 1, local430, arg1.aBoolean172);
		}
		for (local442 = 0; local442 < local323; local442++) {
			Static147.aClass8_Sub1_Sub22Array1[local442] = null;
			Static156.aClass8_Sub1_Sub22Array2[local442] = null;
			Static77.aClass76Array1[local442] = null;
		}
		return local1273;
	}

	@OriginalMember(owner = "client!am", name = "b", descriptor = "(III)V")
	public void method266(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(3) int local3 = Static125.anIntArray197[arg1];
		if (0 != this.anIntArray16[local3] && Static203.method3160(arg0) != null) {
			this.anIntArray16[local3] = Integer.MIN_VALUE | arg0;
			this.method268();
		}
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(IIIILclient!hn;III)Lclient!ie;")
	public Class36_Sub2 method267(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class76 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(24) long local24 = (long) arg6 << 32 | (long) (arg4 << 16) | (long) arg1;
		@Pc(30) Class36_Sub2 local30 = (Class36_Sub2) Static219.aClass61_40.method1384(local24);
		if (local30 == null) {
			@Pc(34) int local34 = 0;
			@Pc(37) Class36_Sub7[] local37 = new Class36_Sub7[3];
			if (!Static203.method3160(arg1).method1287() || !Static203.method3160(arg4).method1287() || !Static203.method3160(arg6).method1287()) {
				return null;
			}
			@Pc(67) Class36_Sub7 local67 = Static203.method3160(arg1).method1288();
			if (local67 != null) {
				local34++;
				local37[0] = local67;
			}
			local67 = Static203.method3160(arg4).method1288();
			if (local67 != null) {
				local37[local34++] = local67;
			}
			local67 = Static203.method3160(arg6).method1288();
			if (local67 != null) {
				local37[local34++] = local67;
			}
			local67 = new Class36_Sub7(local37, local34);
			for (@Pc(111) int local111 = 0; local111 < 5; local111++) {
				if (this.anIntArray17[local111] < Static152.aShortArrayArray5[local111].length) {
					local67.method4200(Static92.aShortArray17[local111], Static152.aShortArrayArray5[local111][this.anIntArray17[local111]]);
				}
				if (Static145.aShortArrayArray4[local111].length > this.anIntArray17[local111]) {
					local67.method4200(Static21.aShortArray5[local111], Static145.aShortArrayArray4[local111][this.anIntArray17[local111]]);
				}
			}
			local30 = local67.method4193(64, 768, -50, -10, -50);
			Static219.aClass61_40.method1377(local24, local30);
		}
		if (arg3 != null) {
			local30 = arg3.method1718(arg5, local30, arg2, arg0);
		}
		return local30;
	}

	@OriginalMember(owner = "client!am", name = "b", descriptor = "(B)V")
	private void method268() {
		@Pc(4) long local4 = this.aLong12;
		this.aLong12 = -1L;
		@Pc(13) long[] local13 = Class36_Sub1.aLongArray3;
		this.aLong12 = this.aLong12 >>> 8 ^ local13[(int) ((this.aLong12 ^ (long) (this.anInt367 >> 8)) & 0xFFL)];
		this.aLong12 = this.aLong12 >>> 8 ^ local13[(int) ((this.aLong12 ^ (long) this.anInt367) & 0xFFL)];
		@Pc(53) int local53;
		for (local53 = 0; local53 < 12; local53++) {
			this.aLong12 = this.aLong12 >>> 8 ^ local13[(int) (((long) (this.anIntArray16[local53] >> 24) ^ this.aLong12) & 0xFFL)];
			this.aLong12 = local13[(int) (((long) (this.anIntArray16[local53] >> 16) ^ this.aLong12) & 0xFFL)] ^ this.aLong12 >>> 8;
			this.aLong12 = this.aLong12 >>> 8 ^ local13[(int) (((long) (this.anIntArray16[local53] >> 8) ^ this.aLong12) & 0xFFL)];
			this.aLong12 = local13[(int) ((this.aLong12 ^ (long) this.anIntArray16[local53]) & 0xFFL)] ^ this.aLong12 >>> 8;
		}
		for (local53 = 0; local53 < 5; local53++) {
			this.aLong12 = this.aLong12 >>> 8 ^ local13[(int) (((long) this.anIntArray17[local53] ^ this.aLong12) & 0xFFL)];
		}
		this.aLong12 = local13[(int) ((this.aLong12 ^ (long) (this.aBoolean26 ? 1 : 0)) & 0xFFL)] ^ this.aLong12 >>> 8;
		if (local4 != 0L && local4 != this.aLong12) {
			Static87.aClass61_15.method1382(local4);
		}
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(I[IIZZ[I)V")
	public void method269(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int[] arg4) {
		if (arg2 != this.anInt367) {
			this.anIntArrayArray1 = null;
			this.anInt367 = arg2;
		}
		if (arg4 == null) {
			arg4 = new int[12];
			for (@Pc(30) int local30 = 0; local30 < 8; local30++) {
				for (@Pc(37) int local37 = 0; local37 < Static13.anInt357; local37++) {
					@Pc(44) Class55 local44 = Static203.method3160(local37);
					if (local44 != null && !local44.aBoolean122 && local44.anInt1724 == (arg3 ? Static193.anIntArray287[local30] : Static33.anIntArray51[local30])) {
						arg4[Static125.anIntArray197[local30]] = local37 | Integer.MIN_VALUE;
						break;
					}
				}
			}
		}
		this.aBoolean26 = arg3;
		this.anInt364 = arg0;
		this.anIntArray17 = arg1;
		this.anIntArray16 = arg4;
		this.method268();
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(Lclient!hn;IBII)Lclient!ie;")
	public Class36_Sub2 method270(@OriginalArg(0) Class76 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (this.anInt364 != -1) {
			return Static253.method3795(this.anInt364).method4244(arg3, arg2, arg1, arg0);
		}
		@Pc(33) Class36_Sub2 local33 = (Class36_Sub2) Static219.aClass61_40.method1384(this.aLong12);
		if (local33 == null) {
			@Pc(39) boolean local39 = false;
			@Pc(49) int local49;
			for (@Pc(41) int local41 = 0; local41 < 12; local41++) {
				local49 = this.anIntArray16[local41];
				if ((local49 & 0x40000000) == 0) {
					if ((local49 & Integer.MIN_VALUE) != 0 && !Static203.method3160(local49 & 0x3FFFFFFF).method1287()) {
						local39 = true;
					}
				} else if (!Static140.method2222(local49 & 0x3FFFFFFF).method101(this.aBoolean26)) {
					local39 = true;
				}
			}
			if (local39) {
				return null;
			}
			@Pc(98) Class36_Sub7[] local98 = new Class36_Sub7[12];
			local49 = 0;
			@Pc(112) int local112;
			for (@Pc(102) int local102 = 0; local102 < 12; local102++) {
				local112 = this.anIntArray16[local102];
				@Pc(131) Class36_Sub7 local131;
				if ((local112 & 0x40000000) != 0) {
					local131 = Static140.method2222(local112 & 0x3FFFFFFF).method85(this.aBoolean26);
					if (local131 != null) {
						local98[local49++] = local131;
					}
				} else if ((local112 & Integer.MIN_VALUE) != 0) {
					local131 = Static203.method3160(local112 & 0x3FFFFFFF).method1288();
					if (local131 != null) {
						local98[local49++] = local131;
					}
				}
			}
			@Pc(176) Class36_Sub7 local176 = new Class36_Sub7(local98, local49);
			for (local112 = 0; local112 < 5; local112++) {
				if (Static152.aShortArrayArray5[local112].length > this.anIntArray17[local112]) {
					local176.method4200(Static92.aShortArray17[local112], Static152.aShortArrayArray5[local112][this.anIntArray17[local112]]);
				}
				if (Static145.aShortArrayArray4[local112].length > this.anIntArray17[local112]) {
					local176.method4200(Static21.aShortArray5[local112], Static145.aShortArrayArray4[local112][this.anIntArray17[local112]]);
				}
			}
			local33 = local176.method4193(64, 768, -50, -10, -50);
			Static219.aClass61_40.method1377(this.aLong12, local33);
		}
		if (arg0 != null) {
			local33 = arg0.method1718(arg1, local33, arg3, arg2);
		}
		return local33;
	}
}
