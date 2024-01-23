import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oj")
public final class Class131 {

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "[[I")
	private int[][] anIntArrayArray59;

	@OriginalMember(owner = "client!oj", name = "d", descriptor = "[I")
	private int[] anIntArray445;

	@OriginalMember(owner = "client!oj", name = "g", descriptor = "J")
	private long aLong168;

	@OriginalMember(owner = "client!oj", name = "n", descriptor = "I")
	private int anInt3977;

	@OriginalMember(owner = "client!oj", name = "p", descriptor = "[I")
	public int[] anIntArray446;

	@OriginalMember(owner = "client!oj", name = "r", descriptor = "J")
	private long aLong169;

	@OriginalMember(owner = "client!oj", name = "t", descriptor = "I")
	public int anInt3981;

	@OriginalMember(owner = "client!oj", name = "x", descriptor = "Z")
	public boolean aBoolean282;

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(IBIIILclient!bg;II)Lclient!hm;")
	public Class10_Sub4 method3349(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class15 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(26) long local26 = (long) arg2 << 32 | (long) (arg1 << 16) | (long) arg5;
		@Pc(32) Class10_Sub4 local32 = (Class10_Sub4) Static21.aClass98_4.method2570(local26);
		if (local32 == null) {
			@Pc(39) Class10_Sub3[] local39 = new Class10_Sub3[3];
			@Pc(41) int local41 = 0;
			if (!Static157.method2611(arg5).method2324() || !Static157.method2611(arg1).method2324() || !Static157.method2611(arg2).method2324()) {
				return null;
			}
			@Pc(65) Class10_Sub3 local65 = Static157.method2611(arg5).method2321();
			if (local65 != null) {
				local41++;
				local39[0] = local65;
			}
			local65 = Static157.method2611(arg1).method2321();
			if (local65 != null) {
				local39[local41++] = local65;
			}
			local65 = Static157.method2611(arg2).method2321();
			if (local65 != null) {
				local39[local41++] = local65;
			}
			local65 = new Class10_Sub3(local39, local41);
			for (@Pc(109) int local109 = 0; local109 < 5; local109++) {
				if (Static263.aShortArrayArray8[local109].length > this.anIntArray446[local109]) {
					local65.method728(Static137.aShortArray68[local109], Static263.aShortArrayArray8[local109][this.anIntArray446[local109]]);
				}
				if (Static73.aShortArrayArray5[local109].length > this.anIntArray446[local109]) {
					local65.method728(Static296.aShortArray93[local109], Static73.aShortArrayArray5[local109][this.anIntArray446[local109]]);
				}
			}
			local32 = local65.method717(64, 768, -50, -10, -50);
			Static21.aClass98_4.method2568(local32, local26);
		}
		if (arg4 != null) {
			local32 = arg4.method356(arg3, arg6, arg0, local32);
		}
		return local32;
	}

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(BII)V")
	public void method3350(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray446[arg0] = arg1;
		this.method3355();
	}

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(Lclient!bg;ZLclient!bg;Z[Lclient!qe;IIIIIII)Lclient!hm;")
	public Class10_Sub4 method3351(@OriginalArg(0) Class15 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) Class15 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) Class145[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		if (this.anInt3981 != -1) {
			return Static218.method3602(this.anInt3981).method3197(arg0, arg8, arg4, arg10, arg5, arg2, arg6, arg7, arg9);
		}
		@Pc(28) long local28 = this.aLong169;
		@Pc(31) int[] local31 = this.anIntArray445;
		if (arg2 != null && (arg2.anInt409 >= 0 || arg2.anInt416 >= 0)) {
			local31 = new int[12];
			for (@Pc(51) int local51 = 0; local51 < 12; local51++) {
				local31[local51] = this.anIntArray445[local51];
			}
			if (arg2.anInt409 >= 0) {
				if (arg2.anInt409 == 65535) {
					local31[5] = 0;
					local28 ^= 0xFFFFFFFF00000000L;
				} else {
					local31[5] = arg2.anInt409 | 0x40000000;
					local28 ^= (long) local31[5] << 32;
				}
			}
			if (arg2.anInt416 >= 0) {
				if (arg2.anInt416 == 65535) {
					local31[3] = 0;
					local28 ^= 0xFFFFFFFFL;
				} else {
					local31[3] = arg2.anInt416 | 0x40000000;
					local28 ^= local31[3];
				}
			}
		}
		@Pc(140) Class10_Sub4 local140 = (Class10_Sub4) Static177.aClass98_28.method2570(local28);
		@Pc(146) boolean local146;
		@Pc(341) int local341;
		@Pc(348) int local348;
		@Pc(355) int local355;
		@Pc(369) int local369;
		@Pc(362) int local362;
		@Pc(411) int local411;
		@Pc(423) int local423;
		@Pc(429) int local429;
		@Pc(435) int local435;
		@Pc(484) int local484;
		@Pc(334) int local334;
		if (local140 == null) {
			local146 = false;
			@Pc(157) int local157;
			for (@Pc(148) int local148 = 0; local148 < 12; local148++) {
				local157 = local31[local148];
				if ((local157 & 0x40000000) == 0) {
					if ((local157 & Integer.MIN_VALUE) != 0 && !Static157.method2611(local157 & 0x3FFFFFFF).method2326()) {
						local146 = true;
					}
				} else if (!Static133.method2309(local157 & 0x3FFFFFFF).method455(this.aBoolean282)) {
					local146 = true;
				}
			}
			if (local146) {
				if (this.aLong168 != -1L) {
					local140 = (Class10_Sub4) Static177.aClass98_28.method2570(this.aLong168);
				}
				if (local140 == null) {
					return null;
				}
			}
			if (local140 == null) {
				@Pc(227) Class10_Sub3[] local227 = new Class10_Sub3[12];
				@Pc(236) int local236;
				for (local157 = 0; local157 < 12; local157++) {
					local236 = local31[local157];
					@Pc(255) Class10_Sub3 local255;
					if ((local236 & 0x40000000) != 0) {
						local255 = Static133.method2309(local236 & 0x3FFFFFFF).method445(this.aBoolean282);
						if (local255 != null) {
							local227[local157] = local255;
						}
					} else if ((local236 & Integer.MIN_VALUE) != 0) {
						local255 = Static157.method2611(local236 & 0x3FFFFFFF).method2325();
						if (local255 != null) {
							local227[local157] = local255;
						}
					}
				}
				@Pc(286) Class31 local286 = null;
				if (this.anInt3977 != -1) {
					local286 = Static315.method5006(this.anInt3977);
				}
				if (local286 != null && local286.anIntArrayArray10 != null) {
					for (local236 = 0; local236 < local286.anIntArrayArray10.length; local236++) {
						if (local286.anIntArrayArray10[local236] != null && local227[local236] != null) {
							local334 = local286.anIntArrayArray10[local236][0];
							local341 = local286.anIntArrayArray10[local236][1];
							local348 = local286.anIntArrayArray10[local236][2];
							local355 = local286.anIntArrayArray10[local236][3];
							local362 = local286.anIntArrayArray10[local236][5];
							local369 = local286.anIntArrayArray10[local236][4];
							if (this.anIntArrayArray59 == null) {
								this.anIntArrayArray59 = new int[local286.anIntArrayArray10.length][];
							}
							if (this.anIntArrayArray59[local236] == null) {
								@Pc(393) int[] local393 = this.anIntArrayArray59[local236] = new int[15];
								if (local355 == 0 && local369 == 0 && local362 == 0) {
									local393[12] = -local334;
									local393[13] = -local341;
									local393[0] = local393[4] = local393[8] = 32768;
									local393[14] = -local348;
								} else {
									local411 = Class11.anIntArray27[local355] >> 1;
									@Pc(417) int local417 = Class11.anIntArray26[local369] >> 1;
									local423 = Class11.anIntArray26[local355] >> 1;
									local429 = Class11.anIntArray27[local362] >> 1;
									local435 = Class11.anIntArray26[local362] >> 1;
									@Pc(441) int local441 = Class11.anIntArray27[local369] >> 1;
									local393[8] = local411 * local441 + 16384 >> 15;
									local393[5] = -local423;
									local393[4] = local429 * local411 + 16384 >> 15;
									local393[3] = local435 * local411 + 16384 >> 15;
									local484 = local429 * local423 + 16384 >> 15;
									local393[2] = local411 * local417 + 16384 >> 15;
									local393[7] = local484 * local441 + -local417 * -local435 + 16384 >> 15;
									local393[1] = local417 * local484 + local441 * -local435 + 16384 >> 15;
									@Pc(533) int local533 = local435 * local423 + 16384 >> 15;
									local393[0] = local429 * local441 + local533 * local417 + 16384 >> 15;
									local393[14] = local393[2] * -local334 + -local341 * local393[5] + -local348 * local393[8] + 16384 >> 15;
									local393[6] = local429 * -local417 + local441 * local533 + 16384 >> 15;
									local393[13] = local393[4] * -local341 + -local334 * local393[1] + local393[7] * -local348 + 16384 >> 15;
									local393[12] = local393[0] * -local334 + local393[3] * -local341 + -local348 * local393[6] + 16384 >> 15;
								}
								local393[11] = local348;
								local393[10] = local341;
								local393[9] = local334;
							}
							if (local355 != 0 || local369 != 0 || local362 != 0) {
								local227[local236].method711(local355, local369, local362);
							}
							if (local334 != 0 || local341 != 0 || local348 != 0) {
								local227[local236].method703(local334, local341, local348);
							}
						}
					}
				}
				@Pc(735) Class10_Sub3 local735 = new Class10_Sub3(local227, local227.length);
				for (local334 = 0; local334 < 5; local334++) {
					if (this.anIntArray446[local334] < Static263.aShortArrayArray8[local334].length) {
						local735.method728(Static137.aShortArray68[local334], Static263.aShortArrayArray8[local334][this.anIntArray446[local334]]);
					}
					if (this.anIntArray446[local334] < Static73.aShortArrayArray5[local334].length) {
						local735.method728(Static296.aShortArray93[local334], Static73.aShortArrayArray5[local334][this.anIntArray446[local334]]);
					}
				}
				local140 = local735.method717(64, 850, -30, -50, -30);
				if (Static283.aBoolean393) {
					((Class10_Sub4_Sub1) local140).method1535(false, false, true, false, false, true);
				}
				if (arg3) {
					Static177.aClass98_28.method2568(local140, local28);
					this.aLong168 = local28;
				}
			}
		}
		local146 = false;
		@Pc(829) boolean local829 = false;
		@Pc(831) boolean local831 = false;
		@Pc(833) boolean local833 = false;
		local334 = arg4 == null ? 0 : arg4.length;
		@Pc(982) int local982;
		for (local341 = 0; local341 < local334; local341++) {
			if (arg4[local341] != null) {
				@Pc(864) Class15 local864 = Static253.method4288(arg4[local341].anInt4347);
				if (local864.anIntArray35 != null) {
					Static194.aClass15Array1[local341] = local864;
					local146 = true;
					local355 = arg4[local341].anInt4341;
					local369 = arg4[local341].anInt4345;
					local362 = local864.anIntArray35[local355];
					Static308.aClass3_Sub4_Sub11Array4[local341] = Static288.method4748(local362 >>> 16);
					local362 &= 0xFFFF;
					Static174.anIntArray397[local341] = local362;
					if (Static308.aClass3_Sub4_Sub11Array4[local341] != null) {
						local829 |= Static308.aClass3_Sub4_Sub11Array4[local341].method1715(local362);
						local833 |= Static308.aClass3_Sub4_Sub11Array4[local341].method1716(local362);
						local831 |= local864.aBoolean40;
					}
					if ((local864.aBoolean39 || Static146.aBoolean417) && local369 != -1 && local864.anIntArray35.length > local369) {
						Static280.anIntArray467[local341] = local864.anIntArray36[local355];
						Static107.anIntArray200[local341] = arg4[local341].anInt4350;
						local982 = local864.anIntArray35[local369];
						Static75.aClass3_Sub4_Sub11Array1[local341] = Static288.method4748(local982 >>> 16);
						@Pc(994) int local994 = local982 & 0xFFFF;
						Static95.anIntArray169[local341] = local994;
						if (Static75.aClass3_Sub4_Sub11Array1[local341] != null) {
							local829 |= Static75.aClass3_Sub4_Sub11Array1[local341].method1715(local994);
							local833 |= Static75.aClass3_Sub4_Sub11Array1[local341].method1716(local994);
						}
					} else {
						Static280.anIntArray467[local341] = 0;
						Static107.anIntArray200[local341] = 0;
						Static75.aClass3_Sub4_Sub11Array1[local341] = null;
						Static95.anIntArray169[local341] = -1;
					}
				}
			}
		}
		if (local146 || arg2 != null || arg0 != null) {
			local341 = -1;
			local348 = -1;
			local355 = 0;
			@Pc(1049) Class3_Sub4_Sub11 local1049 = null;
			@Pc(1051) Class3_Sub4_Sub11 local1051 = null;
			if (arg2 != null) {
				local341 = arg2.anIntArray35[arg9];
				local982 = local341 >>> 16;
				local1049 = Static288.method4748(local982);
				local341 &= 0xFFFF;
				if (local1049 != null) {
					local829 |= local1049.method1715(local341);
					local833 |= local1049.method1716(local341);
					local831 |= arg2.aBoolean40;
				}
				if ((arg2.aBoolean39 || Static146.aBoolean417) && arg5 != -1 && arg2.anIntArray35.length > arg5) {
					local355 = arg2.anIntArray36[arg9];
					local348 = arg2.anIntArray35[arg5];
					local411 = local348 >>> 16;
					local348 &= 0xFFFF;
					if (local411 == local982) {
						local1051 = local1049;
					} else {
						local1051 = Static288.method4748(local348 >>> 16);
					}
					if (local1051 != null) {
						local829 |= local1051.method1715(local348);
						local833 |= local1051.method1716(local348);
					}
				}
			}
			local411 = -1;
			local423 = 0;
			local982 = -1;
			@Pc(1160) Class3_Sub4_Sub11 local1160 = null;
			@Pc(1162) Class3_Sub4_Sub11 local1162 = null;
			if (arg0 != null) {
				local982 = arg0.anIntArray35[arg10];
				local429 = local982 >>> 16;
				local1160 = Static288.method4748(local429);
				local982 &= 0xFFFF;
				if (local1160 != null) {
					local829 |= local1160.method1715(local982);
					local833 |= local1160.method1716(local982);
					local831 |= arg0.aBoolean40;
				}
				if ((arg0.aBoolean39 || Static146.aBoolean417) && arg6 != -1 && arg0.anIntArray35.length > arg6) {
					local411 = arg0.anIntArray35[arg6];
					local423 = arg0.anIntArray36[arg10];
					local435 = local411 >>> 16;
					local411 &= 0xFFFF;
					if (local435 == local429) {
						local1162 = local1160;
					} else {
						local1162 = Static288.method4748(local411 >>> 16);
					}
					if (local1162 != null) {
						local829 |= local1162.method1715(local411);
						local833 |= local1162.method1716(local411);
					}
				}
			}
			@Pc(1289) Class10_Sub4 local1289 = local140.method1965(!local833, !local829, !local831);
			local435 = 0;
			local484 = 1;
			while (local334 > local435) {
				if (Static308.aClass3_Sub4_Sub11Array4[local435] != null) {
					local1289.method1963(Static308.aClass3_Sub4_Sub11Array4[local435], Static174.anIntArray397[local435], Static75.aClass3_Sub4_Sub11Array1[local435], Static95.anIntArray169[local435], Static107.anIntArray200[local435] - 1, Static280.anIntArray467[local435], local484, Static194.aClass15Array1[local435].aBoolean40, this.anIntArrayArray59[local435]);
				}
				local484 <<= 0x1;
				local435++;
			}
			if (local1049 != null && local1160 != null) {
				local1289.method1949(local1049, local341, local1051, local348, arg8 - 1, local355, local1160, local982, local1162, local411, arg7 - 1, local423, arg2.aBooleanArray11, arg2.aBoolean40 | arg0.aBoolean40);
			} else if (local1049 != null) {
				local1289.method1945(local1049, local341, local1051, local348, arg8 - 1, local355, arg2.aBoolean40);
			} else if (local1160 != null) {
				local1289.method1945(local1160, local982, local1162, local411, arg7 - 1, local423, arg0.aBoolean40);
			}
			for (local435 = 0; local435 < local334; local435++) {
				Static308.aClass3_Sub4_Sub11Array4[local435] = null;
				Static75.aClass3_Sub4_Sub11Array1[local435] = null;
				Static194.aClass15Array1[local435] = null;
			}
			return local1289;
		} else if (arg1) {
			return local140.method1965(false, false, false);
		} else {
			return local140;
		}
	}

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(Lclient!bg;IIII)Lclient!hm;")
	public Class10_Sub4 method3352(@OriginalArg(0) Class15 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (this.anInt3981 != -1) {
			return Static218.method3602(this.anInt3981).method3196(arg1, arg0, arg3, arg2);
		}
		@Pc(30) Class10_Sub4 local30 = (Class10_Sub4) Static21.aClass98_4.method2570(this.aLong169);
		if (local30 == null) {
			@Pc(35) boolean local35 = false;
			@Pc(45) int local45;
			for (@Pc(37) int local37 = 0; local37 < 12; local37++) {
				local45 = this.anIntArray445[local37];
				if ((local45 & 0x40000000) == 0) {
					if ((Integer.MIN_VALUE & local45) != 0 && !Static157.method2611(local45 & 0x3FFFFFFF).method2324()) {
						local35 = true;
					}
				} else if (!Static133.method2309(local45 & 0x3FFFFFFF).method457(this.aBoolean282)) {
					local35 = true;
				}
			}
			if (local35) {
				return null;
			}
			@Pc(88) Class10_Sub3[] local88 = new Class10_Sub3[12];
			local45 = 0;
			@Pc(102) int local102;
			for (@Pc(92) int local92 = 0; local92 < 12; local92++) {
				local102 = this.anIntArray445[local92];
				@Pc(123) Class10_Sub3 local123;
				if ((local102 & 0x40000000) != 0) {
					local123 = Static133.method2309(local102 & 0x3FFFFFFF).method443(this.aBoolean282);
					if (local123 != null) {
						local88[local45++] = local123;
					}
				} else if ((local102 & Integer.MIN_VALUE) != 0) {
					local123 = Static157.method2611(local102 & 0x3FFFFFFF).method2321();
					if (local123 != null) {
						local88[local45++] = local123;
					}
				}
			}
			@Pc(159) Class10_Sub3 local159 = new Class10_Sub3(local88, local45);
			for (local102 = 0; local102 < 5; local102++) {
				if (this.anIntArray446[local102] < Static263.aShortArrayArray8[local102].length) {
					local159.method728(Static137.aShortArray68[local102], Static263.aShortArrayArray8[local102][this.anIntArray446[local102]]);
				}
				if (Static73.aShortArrayArray5[local102].length > this.anIntArray446[local102]) {
					local159.method728(Static296.aShortArray93[local102], Static73.aShortArrayArray5[local102][this.anIntArray446[local102]]);
				}
			}
			local30 = local159.method717(64, 768, -50, -10, -50);
			Static21.aClass98_4.method2568(local30, this.aLong169);
		}
		if (arg0 != null) {
			local30 = arg0.method356(arg2, arg3, arg1, local30);
		}
		return local30;
	}

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(ZI)V")
	public void method3353(@OriginalArg(0) boolean arg0) {
		this.aBoolean282 = arg0;
		this.method3355();
	}

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(I)I")
	public int method3354() {
		return this.anInt3981 == -1 ? this.anIntArray445[1] + (this.anIntArray445[11] << 5) + (this.anIntArray446[0] << 25) + (this.anIntArray446[4] << 20) + (this.anIntArray445[0] << 15) + (this.anIntArray445[8] << 10) : 305419896 - -Static218.method3602(this.anInt3981).anInt3767;
	}

	@OriginalMember(owner = "client!oj", name = "b", descriptor = "(I)V")
	private void method3355() {
		@Pc(8) long local8 = this.aLong169;
		this.aLong169 = -1L;
		@Pc(13) long[] local13 = Class3_Sub4_Sub1_Sub1.aLongArray6;
		this.aLong169 = this.aLong169 >>> 8 ^ local13[(int) ((this.aLong169 ^ (long) (this.anInt3977 >> 8)) & 0xFFL)];
		this.aLong169 = this.aLong169 >>> 8 ^ local13[(int) (((long) this.anInt3977 ^ this.aLong169) & 0xFFL)];
		@Pc(57) int local57;
		for (local57 = 0; local57 < 12; local57++) {
			this.aLong169 = this.aLong169 >>> 8 ^ local13[(int) (((long) (this.anIntArray445[local57] >> 24) ^ this.aLong169) & 0xFFL)];
			this.aLong169 = this.aLong169 >>> 8 ^ local13[(int) (((long) (this.anIntArray445[local57] >> 16) ^ this.aLong169) & 0xFFL)];
			this.aLong169 = local13[(int) ((this.aLong169 ^ (long) (this.anIntArray445[local57] >> 8)) & 0xFFL)] ^ this.aLong169 >>> 8;
			this.aLong169 = local13[(int) (((long) this.anIntArray445[local57] ^ this.aLong169) & 0xFFL)] ^ this.aLong169 >>> 8;
		}
		for (local57 = 0; local57 < 5; local57++) {
			this.aLong169 = local13[(int) (((long) this.anIntArray446[local57] ^ this.aLong169) & 0xFFL)] ^ this.aLong169 >>> 8;
		}
		this.aLong169 = this.aLong169 >>> 8 ^ local13[(int) (((long) (this.aBoolean282 ? 1 : 0) ^ this.aLong169) & 0xFFL)];
		if (local8 != 0L && this.aLong169 != local8) {
			Static177.aClass98_28.method2569(local8);
		}
	}

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(IIB)V")
	public void method3356(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) int local3 = Static209.anIntArray623[arg1];
		if (0 != this.anIntArray445[local3] && Static157.method2611(arg0) != null) {
			this.anIntArray445[local3] = Integer.MIN_VALUE | arg0;
			this.method3355();
		}
	}

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(I[I[IZIB)V")
	public void method3358(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4) {
		if (arg0 != this.anInt3977) {
			this.anIntArrayArray59 = null;
			this.anInt3977 = arg0;
		}
		if (arg2 == null) {
			arg2 = new int[12];
			for (@Pc(24) int local24 = 0; local24 < 8; local24++) {
				for (@Pc(29) int local29 = 0; local29 < Static82.anInt1543; local29++) {
					@Pc(40) Class88 local40 = Static157.method2611(local29);
					if (local40 != null && !local40.aBoolean194 && local40.anInt2614 == (arg3 ? Static26.anIntArray45[local24] : Static147.anIntArray325[local24])) {
						arg2[Static209.anIntArray623[local24]] = Integer.MIN_VALUE | local29;
						break;
					}
				}
			}
		}
		this.aBoolean282 = arg3;
		this.anIntArray445 = arg2;
		this.anInt3981 = arg4;
		this.anIntArray446 = arg1;
		this.method3355();
	}
}
