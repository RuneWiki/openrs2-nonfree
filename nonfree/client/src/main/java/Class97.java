import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kk")
public final class Class97 {

	@OriginalMember(owner = "client!kk", name = "b", descriptor = "I")
	private int anInt3397;

	@OriginalMember(owner = "client!kk", name = "c", descriptor = "J")
	private long aLong111;

	@OriginalMember(owner = "client!kk", name = "e", descriptor = "I")
	public int anInt3399;

	@OriginalMember(owner = "client!kk", name = "l", descriptor = "Z")
	public boolean aBoolean234;

	@OriginalMember(owner = "client!kk", name = "m", descriptor = "[I")
	public int[] anIntArray343;

	@OriginalMember(owner = "client!kk", name = "r", descriptor = "J")
	private long aLong112;

	@OriginalMember(owner = "client!kk", name = "w", descriptor = "[[I")
	private int[][] anIntArrayArray20;

	@OriginalMember(owner = "client!kk", name = "x", descriptor = "[I")
	private int[] anIntArray345;

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(I)V")
	private void method2802() {
		@Pc(4) long local4 = this.aLong112;
		this.aLong112 = -1L;
		@Pc(22) long[] local22 = Class31_Sub1.aLongArray2;
		this.aLong112 = this.aLong112 >>> 8 ^ local22[(int) (((long) (this.anInt3397 >> 8) ^ this.aLong112) & 0xFFL)];
		this.aLong112 = this.aLong112 >>> 8 ^ local22[(int) ((this.aLong112 ^ (long) this.anInt3397) & 0xFFL)];
		@Pc(66) int local66;
		for (local66 = 0; local66 < 12; local66++) {
			this.aLong112 = this.aLong112 >>> 8 ^ local22[(int) ((this.aLong112 ^ (long) (this.anIntArray345[local66] >> 24)) & 0xFFL)];
			this.aLong112 = local22[(int) ((this.aLong112 ^ (long) (this.anIntArray345[local66] >> 16)) & 0xFFL)] ^ this.aLong112 >>> 8;
			this.aLong112 = local22[(int) (((long) (this.anIntArray345[local66] >> 8) ^ this.aLong112) & 0xFFL)] ^ this.aLong112 >>> 8;
			this.aLong112 = this.aLong112 >>> 8 ^ local22[(int) (((long) this.anIntArray345[local66] ^ this.aLong112) & 0xFFL)];
		}
		for (local66 = 0; local66 < 5; local66++) {
			this.aLong112 = this.aLong112 >>> 8 ^ local22[(int) (((long) this.anIntArray343[local66] ^ this.aLong112) & 0xFFL)];
		}
		this.aLong112 = this.aLong112 >>> 8 ^ local22[(int) ((this.aLong112 ^ (long) (this.aBoolean234 ? 1 : 0)) & 0xFFL)];
		if (local4 != 0L && local4 != this.aLong112) {
			Static175.aClass157_33.method4035(local4);
		}
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "([I[IIIZI)V")
	public void method2803(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4) {
		if (this.anInt3397 != arg2) {
			this.anIntArrayArray20 = null;
			this.anInt3397 = arg2;
		}
		if (arg0 == null) {
			arg0 = new int[12];
			for (@Pc(32) int local32 = 0; local32 < 8; local32++) {
				for (@Pc(39) int local39 = 0; local39 < Static26.anInt4559; local39++) {
					@Pc(46) Class27 local46 = Static79.method1467(local39);
					if (local46 != null && !local46.aBoolean60 && local46.anInt949 == (arg3 ? Static44.anIntArray93[local32] : Static303.anIntArray574[local32])) {
						arg0[Static252.anIntArray483[local32]] = Integer.MIN_VALUE | local39;
						break;
					}
				}
			}
		}
		this.aBoolean234 = arg3;
		this.anIntArray343 = arg1;
		this.anIntArray345 = arg0;
		this.anInt3399 = arg4;
		this.method2802();
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(IBI)V")
	public void method2806(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) int local13 = Static252.anIntArray483[arg1];
		if (0 != this.anIntArray345[local13] && Static79.method1467(arg0) != null) {
			this.anIntArray345[local13] = Integer.MIN_VALUE | arg0;
			this.method2802();
		}
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(IIIIIBILclient!mi;)Lclient!hb;")
	public Class15_Sub5 method2809(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class112 arg6) {
		@Pc(18) long local18 = (long) (arg1 << 16) | (long) arg3 << 32 | (long) arg4;
		@Pc(24) Class15_Sub5 local24 = (Class15_Sub5) Static215.aClass157_36.method4031(local18);
		if (local24 == null) {
			@Pc(46) Class15_Sub7[] local46 = new Class15_Sub7[3];
			@Pc(48) int local48 = 0;
			if (!Static79.method1467(arg4).method713() || !Static79.method1467(arg1).method713() || !Static79.method1467(arg3).method713()) {
				return null;
			}
			@Pc(72) Class15_Sub7 local72 = Static79.method1467(arg4).method706();
			if (local72 != null) {
				local48++;
				local46[0] = local72;
			}
			local72 = Static79.method1467(arg1).method706();
			if (local72 != null) {
				local46[local48++] = local72;
			}
			local72 = Static79.method1467(arg3).method706();
			if (local72 != null) {
				local46[local48++] = local72;
			}
			local72 = new Class15_Sub7(local46, local48);
			for (@Pc(117) int local117 = 0; local117 < 5; local117++) {
				if (this.anIntArray343[local117] < Static249.aShortArrayArray8[local117].length) {
					local72.method4212(Static102.aShortArray16[local117], Static249.aShortArrayArray8[local117][this.anIntArray343[local117]]);
				}
				if (Static74.aShortArrayArray2[local117].length > this.anIntArray343[local117]) {
					local72.method4212(Static293.aShortArray86[local117], Static74.aShortArrayArray2[local117][this.anIntArray343[local117]]);
				}
			}
			local24 = local72.method4225(64, 768, -50, -10, -50);
			Static215.aClass157_36.method4026(local18, local24);
		}
		if (arg6 != null) {
			local24 = arg6.method3161(arg5, local24, arg2, arg0);
		}
		return local24;
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(IZ)V")
	public void method2810(@OriginalArg(1) boolean arg0) {
		this.aBoolean234 = arg0;
		this.method2802();
	}

	@OriginalMember(owner = "client!kk", name = "b", descriptor = "(I)I")
	public int method2811() {
		return this.anInt3399 == -1 ? this.anIntArray345[1] + (this.anIntArray345[11] << 5) + (this.anIntArray345[8] << 10) + (this.anIntArray345[0] << 15) + (this.anIntArray343[0] << 25) + (this.anIntArray343[4] << 20) : Static60.method1158(this.anInt3399).anInt5861 + 305419896;
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(III)V")
	public void method2812(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray343[arg0] = arg1;
		this.method2802();
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(IZIB[Lclient!gi;Lclient!mi;Lclient!mi;ZIIII)Lclient!hb;")
	public Class15_Sub5 method2813(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Class62[] arg3, @OriginalArg(5) Class112 arg4, @OriginalArg(6) Class112 arg5, @OriginalArg(7) boolean arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		if (this.anInt3399 != -1) {
			return Static60.method1158(this.anInt3399).method4617(arg4, arg5, arg7, arg10, arg0, arg3, arg2, arg9, arg8);
		}
		@Pc(29) long local29 = this.aLong112;
		@Pc(32) int[] local32 = this.anIntArray345;
		if (arg5 != null && (arg5.anInt3853 >= 0 || arg5.anInt3860 >= 0)) {
			local32 = new int[12];
			for (@Pc(53) int local53 = 0; local53 < 12; local53++) {
				local32[local53] = this.anIntArray345[local53];
			}
			if (arg5.anInt3853 >= 0) {
				if (arg5.anInt3853 == 65535) {
					local29 ^= 0xFFFFFFFF00000000L;
					local32[5] = 0;
				} else {
					local32[5] = arg5.anInt3853 | 0x40000000;
					local29 ^= (long) local32[5] << 32;
				}
			}
			if (arg5.anInt3860 >= 0) {
				if (arg5.anInt3860 == 65535) {
					local32[3] = 0;
					local29 ^= 0xFFFFFFFFL;
				} else {
					local32[3] = arg5.anInt3860 | 0x40000000;
					local29 ^= local32[3];
				}
			}
		}
		@Pc(140) Class15_Sub5 local140 = (Class15_Sub5) Static175.aClass157_33.method4031(local29);
		@Pc(145) boolean local145;
		@Pc(326) int local326;
		@Pc(340) int local340;
		@Pc(347) int local347;
		@Pc(333) int local333;
		@Pc(354) int local354;
		@Pc(433) int local433;
		@Pc(457) int local457;
		@Pc(439) int local439;
		@Pc(445) int local445;
		@Pc(465) int local465;
		@Pc(361) int local361;
		if (local140 == null) {
			local145 = false;
			@Pc(154) int local154;
			for (@Pc(147) int local147 = 0; local147 < 12; local147++) {
				local154 = local32[local147];
				if ((local154 & 0x40000000) == 0) {
					if ((Integer.MIN_VALUE & local154) != 0 && !Static79.method1467(local154 & 0x3FFFFFFF).method704()) {
						local145 = true;
					}
				} else if (!Static87.method1546(local154 & 0x3FFFFFFF).method1649(this.aBoolean234)) {
					local145 = true;
				}
			}
			if (local145) {
				if (this.aLong111 != -1L) {
					local140 = (Class15_Sub5) Static175.aClass157_33.method4031(this.aLong111);
				}
				if (local140 == null) {
					return null;
				}
			}
			if (local140 == null) {
				@Pc(217) Class15_Sub7[] local217 = new Class15_Sub7[12];
				@Pc(226) int local226;
				for (local154 = 0; local154 < 12; local154++) {
					local226 = local32[local154];
					@Pc(243) Class15_Sub7 local243;
					if ((local226 & 0x40000000) != 0) {
						local243 = Static87.method1546(local226 & 0x3FFFFFFF).method1645(this.aBoolean234);
						if (local243 != null) {
							local217[local154] = local243;
						}
					} else if ((local226 & Integer.MIN_VALUE) != 0) {
						local243 = Static79.method1467(local226 & 0x3FFFFFFF).method711();
						if (local243 != null) {
							local217[local154] = local243;
						}
					}
				}
				@Pc(281) Class123 local281 = null;
				if (this.anInt3397 != -1) {
					local281 = Static126.method3256(this.anInt3397);
				}
				if (local281 != null && local281.anIntArrayArray28 != null) {
					for (local226 = 0; local226 < local281.anIntArrayArray28.length; local226++) {
						if (local281.anIntArrayArray28[local226] != null && local217[local226] != null) {
							local326 = local281.anIntArrayArray28[local226][1];
							local333 = local281.anIntArrayArray28[local226][4];
							local340 = local281.anIntArrayArray28[local226][2];
							local347 = local281.anIntArrayArray28[local226][3];
							local354 = local281.anIntArrayArray28[local226][5];
							local361 = local281.anIntArrayArray28[local226][0];
							if (this.anIntArrayArray20 == null) {
								this.anIntArrayArray20 = new int[local281.anIntArrayArray28.length][];
							}
							if (this.anIntArrayArray20[local226] == null) {
								@Pc(383) int[] local383 = this.anIntArrayArray20[local226] = new int[15];
								if (local347 == 0 && local333 == 0 && local354 == 0) {
									local383[0] = local383[4] = local383[8] = 32768;
									local383[13] = -local326;
									local383[12] = -local361;
									local383[14] = -local340;
								} else {
									@Pc(427) int local427 = Class1.anIntArray3[local333] >> 1;
									local433 = Class1.anIntArray3[local347] >> 1;
									local439 = Class1.anIntArray3[local354] >> 1;
									local445 = Class1.anIntArray4[local354] >> 1;
									@Pc(451) int local451 = Class1.anIntArray4[local333] >> 1;
									local457 = Class1.anIntArray4[local347] >> 1;
									local465 = local439 * local457 + 16384 >> 15;
									local383[5] = -local457;
									local383[3] = local433 * local445 + 16384 >> 15;
									@Pc(488) int local488 = local457 * local445 + 16384 >> 15;
									local383[2] = local451 * local433 + 16384 >> 15;
									local383[1] = local465 * local451 + local427 * -local445 + 16384 >> 15;
									local383[7] = local427 * local465 + -local445 * -local451 + 16384 >> 15;
									local383[4] = local433 * local439 + 16384 >> 15;
									local383[0] = local427 * local439 + local488 * local451 + 16384 >> 15;
									local383[6] = local439 * -local451 + local427 * local488 + 16384 >> 15;
									local383[8] = local427 * local433 + 16384 >> 15;
									local383[13] = -local326 * local383[4] + -local361 * local383[1] + -local340 * local383[7] + 16384 >> 15;
									local383[12] = -local340 * local383[6] + -local326 * local383[3] + local383[0] * -local361 + 16384 >> 15;
									local383[14] = -local361 * local383[2] + local383[5] * -local326 + -local340 * local383[8] + 16384 >> 15;
								}
								local383[11] = local340;
								local383[10] = local326;
								local383[9] = local361;
							}
							if (local347 != 0 || local333 != 0 || local354 != 0) {
								local217[local226].method4200(local347, local333, local354);
							}
							if (local361 != 0 || local326 != 0 || local340 != 0) {
								local217[local226].method4206(local361, local326, local340);
							}
						}
					}
				}
				@Pc(727) Class15_Sub7 local727 = new Class15_Sub7(local217, local217.length);
				for (local361 = 0; local361 < 5; local361++) {
					if (this.anIntArray343[local361] < Static249.aShortArrayArray8[local361].length) {
						local727.method4212(Static102.aShortArray16[local361], Static249.aShortArrayArray8[local361][this.anIntArray343[local361]]);
					}
					if (Static74.aShortArrayArray2[local361].length > this.anIntArray343[local361]) {
						local727.method4212(Static293.aShortArray86[local361], Static74.aShortArrayArray2[local361][this.anIntArray343[local361]]);
					}
				}
				local140 = local727.method4225(64, 850, -30, -50, -30);
				if (Static116.aBoolean184) {
					((Class15_Sub5_Sub2) local140).method2377(false, false, true, false, false, true);
				}
				if (arg6) {
					Static175.aClass157_33.method4026(local29, local140);
					this.aLong111 = local29;
				}
			}
		}
		@Pc(819) boolean local819 = false;
		local145 = false;
		@Pc(823) boolean local823 = false;
		local361 = arg3 == null ? 0 : arg3.length;
		@Pc(832) boolean local832 = false;
		@Pc(975) int local975;
		for (local326 = 0; local326 < local361; local326++) {
			if (arg3[local326] != null) {
				@Pc(849) Class112 local849 = Static208.method3496(arg3[local326].anInt2286);
				if (local849.anIntArray378 != null) {
					local145 = true;
					Static299.aClass112Array7[local326] = local849;
					local347 = arg3[local326].anInt2282;
					local354 = local849.anIntArray378[local347];
					local333 = arg3[local326].anInt2285;
					Static14.aClass2_Sub8_Sub6Array1[local326] = Static152.method2798(local354 >>> 16);
					local354 &= 0xFFFF;
					Static307.anIntArray577[local326] = local354;
					if (Static14.aClass2_Sub8_Sub6Array1[local326] != null) {
						local832 |= Static14.aClass2_Sub8_Sub6Array1[local326].method1163(local354);
						local819 |= Static14.aClass2_Sub8_Sub6Array1[local326].method1160(local354);
						local823 |= local849.aBoolean260;
					}
					if ((local849.aBoolean259 || Static104.aBoolean160) && local333 != -1 && local333 < local849.anIntArray378.length) {
						Static134.anIntArray305[local326] = local849.anIntArray377[local347];
						Static215.anIntArray441[local326] = arg3[local326].anInt2287;
						local975 = local849.anIntArray378[local333];
						Static293.aClass2_Sub8_Sub6Array5[local326] = Static152.method2798(local975 >>> 16);
						@Pc(987) int local987 = local975 & 0xFFFF;
						Static236.anIntArray469[local326] = local987;
						if (Static293.aClass2_Sub8_Sub6Array5[local326] != null) {
							local832 |= Static293.aClass2_Sub8_Sub6Array5[local326].method1163(local987);
							local819 |= Static293.aClass2_Sub8_Sub6Array5[local326].method1160(local987);
						}
					} else {
						Static134.anIntArray305[local326] = 0;
						Static215.anIntArray441[local326] = 0;
						Static293.aClass2_Sub8_Sub6Array5[local326] = null;
						Static236.anIntArray469[local326] = -1;
					}
				}
			}
		}
		if (local145 || arg5 != null || arg4 != null) {
			local326 = -1;
			local340 = -1;
			local347 = 0;
			@Pc(1043) Class2_Sub8_Sub6 local1043 = null;
			@Pc(1045) Class2_Sub8_Sub6 local1045 = null;
			if (arg5 != null) {
				local326 = arg5.anIntArray378[arg10];
				local975 = local326 >>> 16;
				local326 &= 0xFFFF;
				local1043 = Static152.method2798(local975);
				if (local1043 != null) {
					local832 |= local1043.method1163(local326);
					local819 |= local1043.method1160(local326);
					local823 |= arg5.aBoolean260;
				}
				if ((arg5.aBoolean259 || Static104.aBoolean160) && arg9 != -1 && arg5.anIntArray378.length > arg9) {
					local340 = arg5.anIntArray378[arg9];
					local347 = arg5.anIntArray377[arg10];
					local433 = local340 >>> 16;
					local340 &= 0xFFFF;
					if (local433 == local975) {
						local1045 = local1043;
					} else {
						local1045 = Static152.method2798(local340 >>> 16);
					}
					if (local1045 != null) {
						local832 |= local1045.method1163(local340);
						local819 |= local1045.method1160(local340);
					}
				}
			}
			local975 = -1;
			local433 = -1;
			local457 = 0;
			@Pc(1166) Class2_Sub8_Sub6 local1166 = null;
			@Pc(1168) Class2_Sub8_Sub6 local1168 = null;
			if (arg4 != null) {
				local975 = arg4.anIntArray378[arg7];
				local439 = local975 >>> 16;
				local1166 = Static152.method2798(local439);
				local975 &= 0xFFFF;
				if (local1166 != null) {
					local832 |= local1166.method1163(local975);
					local819 |= local1166.method1160(local975);
					local823 |= arg4.aBoolean260;
				}
				if ((arg4.aBoolean259 || Static104.aBoolean160) && arg2 != -1 && arg2 < arg4.anIntArray378.length) {
					local457 = arg4.anIntArray377[arg7];
					local433 = arg4.anIntArray378[arg2];
					local445 = local433 >>> 16;
					local433 &= 0xFFFF;
					if (local439 == local445) {
						local1168 = local1166;
					} else {
						local1168 = Static152.method2798(local433 >>> 16);
					}
					if (local1168 != null) {
						local832 |= local1168.method1163(local433);
						local819 |= local1168.method1160(local433);
					}
				}
			}
			@Pc(1292) Class15_Sub5 local1292 = local140.method2352(!local819, !local832, !local823);
			local445 = 0;
			local465 = 1;
			while (local445 < local361) {
				if (Static14.aClass2_Sub8_Sub6Array1[local445] != null) {
					local1292.method2345(Static14.aClass2_Sub8_Sub6Array1[local445], Static307.anIntArray577[local445], Static293.aClass2_Sub8_Sub6Array5[local445], Static236.anIntArray469[local445], Static215.anIntArray441[local445] - 1, Static134.anIntArray305[local445], local465, Static299.aClass112Array7[local445].aBoolean260, this.anIntArrayArray20[local445]);
				}
				local465 <<= 0x1;
				local445++;
			}
			if (local1043 != null && local1166 != null) {
				local1292.method2342(local1043, local326, local1045, local340, arg0 - 1, local347, local1166, local975, local1168, local433, arg8 - 1, local457, arg5.aBooleanArray14, arg5.aBoolean260 | arg4.aBoolean260);
			} else if (local1043 != null) {
				local1292.method2339(local1043, local326, local1045, local340, arg0 - 1, local347, arg5.aBoolean260);
			} else if (local1166 != null) {
				local1292.method2339(local1166, local975, local1168, local433, arg8 - 1, local457, arg4.aBoolean260);
			}
			for (local445 = 0; local445 < local361; local445++) {
				Static14.aClass2_Sub8_Sub6Array1[local445] = null;
				Static293.aClass2_Sub8_Sub6Array5[local445] = null;
				Static299.aClass112Array7[local445] = null;
			}
			return local1292;
		} else if (arg1) {
			return local140.method2352(false, false, false);
		} else {
			return local140;
		}
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(IIBLclient!mi;I)Lclient!hb;")
	public Class15_Sub5 method2815(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class112 arg2, @OriginalArg(4) int arg3) {
		if (this.anInt3399 != -1) {
			return Static60.method1158(this.anInt3399).method4612(arg2, arg0, arg1, arg3);
		}
		@Pc(36) Class15_Sub5 local36 = (Class15_Sub5) Static215.aClass157_36.method4031(this.aLong112);
		if (local36 == null) {
			@Pc(40) boolean local40 = false;
			@Pc(52) int local52;
			for (@Pc(42) int local42 = 0; local42 < 12; local42++) {
				local52 = this.anIntArray345[local42];
				if ((local52 & 0x40000000) == 0) {
					if ((local52 & Integer.MIN_VALUE) != 0 && !Static79.method1467(local52 & 0x3FFFFFFF).method713()) {
						local40 = true;
					}
				} else if (!Static87.method1546(local52 & 0x3FFFFFFF).method1638(this.aBoolean234)) {
					local40 = true;
				}
			}
			if (local40) {
				return null;
			}
			@Pc(101) Class15_Sub7[] local101 = new Class15_Sub7[12];
			local52 = 0;
			@Pc(115) int local115;
			for (@Pc(105) int local105 = 0; local105 < 12; local105++) {
				local115 = this.anIntArray345[local105];
				@Pc(140) Class15_Sub7 local140;
				if ((local115 & 0x40000000) != 0) {
					local140 = Static87.method1546(local115 & 0x3FFFFFFF).method1648(this.aBoolean234);
					if (local140 != null) {
						local101[local52++] = local140;
					}
				} else if ((local115 & Integer.MIN_VALUE) != 0) {
					local140 = Static79.method1467(local115 & 0x3FFFFFFF).method706();
					if (local140 != null) {
						local101[local52++] = local140;
					}
				}
			}
			@Pc(176) Class15_Sub7 local176 = new Class15_Sub7(local101, local52);
			for (local115 = 0; local115 < 5; local115++) {
				if (this.anIntArray343[local115] < Static249.aShortArrayArray8[local115].length) {
					local176.method4212(Static102.aShortArray16[local115], Static249.aShortArrayArray8[local115][this.anIntArray343[local115]]);
				}
				if (this.anIntArray343[local115] < Static74.aShortArrayArray2[local115].length) {
					local176.method4212(Static293.aShortArray86[local115], Static74.aShortArrayArray2[local115][this.anIntArray343[local115]]);
				}
			}
			local36 = local176.method4225(64, 768, -50, -10, -50);
			Static215.aClass157_36.method4026(this.aLong112, local36);
		}
		if (arg2 != null) {
			local36 = arg2.method3161(arg0, local36, arg3, arg1);
		}
		return local36;
	}
}
