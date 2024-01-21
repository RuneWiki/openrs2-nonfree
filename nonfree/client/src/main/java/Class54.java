import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rc")
public final class Class54 {

	@OriginalMember(owner = "client!rc", name = "k", descriptor = "I")
	private int anInt2281 = 0;

	@OriginalMember(owner = "client!rc", name = "D", descriptor = "I")
	private int anInt2295 = 0;

	@OriginalMember(owner = "client!rc", name = "O", descriptor = "[Lclient!kd;")
	private final Class34[] aClass34Array3 = new Class34[5000];

	@OriginalMember(owner = "client!rc", name = "Q", descriptor = "[[I")
	private final int[][] anIntArrayArray21 = new int[][] { new int[16], { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 1 }, { 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0 }, { 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1 }, { 1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 1 } };

	@OriginalMember(owner = "client!rc", name = "S", descriptor = "I")
	private int anInt2301 = 0;

	@OriginalMember(owner = "client!rc", name = "R", descriptor = "[[I")
	private final int[][] anIntArrayArray22 = new int[][] { { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 }, { 12, 8, 4, 0, 13, 9, 5, 1, 14, 10, 6, 2, 15, 11, 7, 3 }, { 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 }, { 3, 7, 11, 15, 2, 6, 10, 14, 1, 5, 9, 13, 0, 4, 8, 12 } };

	@OriginalMember(owner = "client!rc", name = "eb", descriptor = "[I")
	private final int[] anIntArray300 = new int[10000];

	@OriginalMember(owner = "client!rc", name = "gb", descriptor = "[I")
	private final int[] anIntArray301 = new int[10000];

	@OriginalMember(owner = "client!rc", name = "q", descriptor = "I")
	private final int anInt2286;

	@OriginalMember(owner = "client!rc", name = "F", descriptor = "I")
	private final int anInt2296;

	@OriginalMember(owner = "client!rc", name = "s", descriptor = "I")
	private final int anInt2287;

	@OriginalMember(owner = "client!rc", name = "r", descriptor = "[[[Lclient!kb;")
	private final Class10_Sub8[][][] aClass10_Sub8ArrayArrayArray1;

	@OriginalMember(owner = "client!rc", name = "G", descriptor = "[[[I")
	private final int[][][] anIntArrayArrayArray7;

	@OriginalMember(owner = "client!rc", name = "E", descriptor = "[[[I")
	private final int[][][] anIntArrayArrayArray6;

	@OriginalMember(owner = "client!rc", name = "<init>", descriptor = "(III[[[I)V")
	public Class54(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[][][] arg3) {
		this.anInt2286 = arg0;
		this.anInt2296 = arg1;
		this.anInt2287 = arg2;
		this.aClass10_Sub8ArrayArrayArray1 = new Class10_Sub8[arg0][arg1][arg2];
		this.anIntArrayArrayArray7 = new int[arg0][arg1 + 1][arg2 + 1];
		this.anIntArrayArrayArray6 = arg3;
		this.method1379();
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(IIII)V")
	public void method1341(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(8) Class10_Sub8 local8 = this.aClass10_Sub8ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 != null) {
			this.aClass10_Sub8ArrayArrayArray1[arg0][arg1][arg2].anInt1434 = arg3;
		}
	}

	@OriginalMember(owner = "client!rc", name = "b", descriptor = "(IIII)Z")
	private boolean method1343(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!this.method1345(arg0, arg1, arg2)) {
			return false;
		}
		@Pc(11) int local11 = arg1 << 7;
		@Pc(15) int local15 = arg2 << 7;
		@Pc(26) int local26 = this.anIntArrayArrayArray6[arg0][arg1][arg2] - 1;
		@Pc(30) int local30 = local26 - 120;
		@Pc(34) int local34 = local26 - 230;
		@Pc(38) int local38 = local26 - 238;
		if (arg3 < 16) {
			if (arg3 == 1) {
				if (local11 > Static85.anInt2275) {
					if (!this.method1387(local11, local26, local15)) {
						return false;
					}
					if (!this.method1387(local11, local26, local15 + 128)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!this.method1387(local11, local30, local15)) {
						return false;
					}
					if (!this.method1387(local11, local30, local15 + 128)) {
						return false;
					}
				}
				if (!this.method1387(local11, local34, local15)) {
					return false;
				}
				if (!this.method1387(local11, local34, local15 + 128)) {
					return false;
				}
				return true;
			}
			if (arg3 == 2) {
				if (local15 < Static85.anInt2276) {
					if (!this.method1387(local11, local26, local15 + 128)) {
						return false;
					}
					if (!this.method1387(local11 + 128, local26, local15 + 128)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!this.method1387(local11, local30, local15 + 128)) {
						return false;
					}
					if (!this.method1387(local11 + 128, local30, local15 + 128)) {
						return false;
					}
				}
				if (!this.method1387(local11, local34, local15 + 128)) {
					return false;
				}
				if (!this.method1387(local11 + 128, local34, local15 + 128)) {
					return false;
				}
				return true;
			}
			if (arg3 == 4) {
				if (local11 < Static85.anInt2275) {
					if (!this.method1387(local11 + 128, local26, local15)) {
						return false;
					}
					if (!this.method1387(local11 + 128, local26, local15 + 128)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!this.method1387(local11 + 128, local30, local15)) {
						return false;
					}
					if (!this.method1387(local11 + 128, local30, local15 + 128)) {
						return false;
					}
				}
				if (!this.method1387(local11 + 128, local34, local15)) {
					return false;
				}
				if (!this.method1387(local11 + 128, local34, local15 + 128)) {
					return false;
				}
				return true;
			}
			if (arg3 == 8) {
				if (local15 > Static85.anInt2276) {
					if (!this.method1387(local11, local26, local15)) {
						return false;
					}
					if (!this.method1387(local11 + 128, local26, local15)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!this.method1387(local11, local30, local15)) {
						return false;
					}
					if (!this.method1387(local11 + 128, local30, local15)) {
						return false;
					}
				}
				if (!this.method1387(local11, local34, local15)) {
					return false;
				}
				if (!this.method1387(local11 + 128, local34, local15)) {
					return false;
				}
				return true;
			}
		}
		if (!this.method1387(local11 + 64, local38, local15 + 64)) {
			return false;
		} else if (arg3 == 16) {
			return this.method1387(local11, local34, local15 + 128);
		} else if (arg3 == 32) {
			return this.method1387(local11 + 128, local34, local15 + 128);
		} else if (arg3 == 64) {
			return this.method1387(local11 + 128, local34, local15);
		} else if (arg3 == 128) {
			return this.method1387(local11, local34, local15);
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "([IIIIII)V")
	public void method1344(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(8) Class10_Sub8 local8 = this.aClass10_Sub8ArrayArrayArray1[arg2][arg3][arg4];
		if (local8 == null) {
			return;
		}
		@Pc(14) Class31 local14 = local8.aClass31_1;
		@Pc(24) int local24;
		if (local14 != null) {
			@Pc(19) int local19 = local14.anInt1403;
			if (local19 != 0) {
				for (local24 = 0; local24 < 4; local24++) {
					arg0[arg1] = local19;
					arg0[arg1 + 1] = local19;
					arg0[arg1 + 2] = local19;
					arg0[arg1 + 3] = local19;
					arg1 += 512;
				}
			}
			return;
		}
		@Pc(59) Class48 local59 = local8.aClass48_1;
		if (local59 == null) {
			return;
		}
		local24 = local59.anInt1846;
		@Pc(68) int local68 = local59.anInt1844;
		@Pc(71) int local71 = local59.anInt1845;
		@Pc(74) int local74 = local59.anInt1843;
		@Pc(79) int[] local79 = this.anIntArrayArray21[local24];
		@Pc(84) int[] local84 = this.anIntArrayArray22[local68];
		@Pc(86) int local86 = 0;
		@Pc(90) int local90;
		if (local71 != 0) {
			for (local90 = 0; local90 < 4; local90++) {
				arg0[arg1] = local79[local84[local86++]] == 0 ? local71 : local74;
				arg0[arg1 + 1] = local79[local84[local86++]] == 0 ? local71 : local74;
				arg0[arg1 + 2] = local79[local84[local86++]] == 0 ? local71 : local74;
				arg0[arg1 + 3] = local79[local84[local86++]] == 0 ? local71 : local74;
				arg1 += 512;
			}
			return;
		}
		for (local90 = 0; local90 < 4; local90++) {
			if (local79[local84[local86++]] != 0) {
				arg0[arg1] = local74;
			}
			if (local79[local84[local86++]] != 0) {
				arg0[arg1 + 1] = local74;
			}
			if (local79[local84[local86++]] != 0) {
				arg0[arg1 + 2] = local74;
			}
			if (local79[local84[local86++]] != 0) {
				arg0[arg1 + 3] = local74;
			}
			arg1 += 512;
		}
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(III)Z")
	private boolean method1345(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) int local8 = this.anIntArrayArrayArray7[arg0][arg1][arg2];
		if (local8 == -Static85.anInt2283) {
			return false;
		} else if (local8 == Static85.anInt2283) {
			return true;
		} else {
			@Pc(23) int local23 = arg1 << 7;
			@Pc(27) int local27 = arg2 << 7;
			if (this.method1387(local23 + 1, this.anIntArrayArrayArray6[arg0][arg1][arg2], local27 + 1) && this.method1387(local23 + 128 - 1, this.anIntArrayArrayArray6[arg0][arg1 + 1][arg2], local27 + 1) && this.method1387(local23 + 128 - 1, this.anIntArrayArrayArray6[arg0][arg1 + 1][arg2 + 1], local27 + 128 - 1) && this.method1387(local23 + 1, this.anIntArrayArrayArray6[arg0][arg1][arg2 + 1], local27 + 128 - 1)) {
				this.anIntArrayArrayArray7[arg0][arg1][arg2] = Static85.anInt2283;
				return true;
			} else {
				this.anIntArrayArrayArray7[arg0][arg1][arg2] = -Static85.anInt2283;
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!rc", name = "b", descriptor = "(III)I")
	public int method1346(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class10_Sub8 local8 = this.aClass10_Sub8ArrayArrayArray1[arg0][arg1][arg2];
		return local8 == null || local8.aClass4_1 == null ? 0 : local8.aClass4_1.anInt20;
	}

	@OriginalMember(owner = "client!rc", name = "c", descriptor = "(IIII)Z")
	private boolean method1347(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.method1345(arg0, arg1, arg2)) {
			@Pc(11) int local11 = arg1 << 7;
			@Pc(15) int local15 = arg2 << 7;
			return this.method1387(local11 + 1, this.anIntArrayArrayArray6[arg0][arg1][arg2] - arg3, local15 + 1) && this.method1387(local11 + 128 - 1, this.anIntArrayArrayArray6[arg0][arg1 + 1][arg2] - arg3, local15 + 1) && this.method1387(local11 + 128 - 1, this.anIntArrayArrayArray6[arg0][arg1 + 1][arg2 + 1] - arg3, local15 + 128 - 1) && this.method1387(local11 + 1, this.anIntArrayArrayArray6[arg0][arg1][arg2 + 1] - arg3, local15 + 128 - 1);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(Lclient!rb;IIIII)V")
	private void method1348(@OriginalArg(0) Class10_Sub1_Sub5_Sub4 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(1) boolean local1 = true;
		@Pc(3) int local3 = arg2;
		@Pc(7) int local7 = arg2 + arg4;
		@Pc(11) int local11 = arg3 - 1;
		@Pc(15) int local15 = arg3 + arg5;
		for (@Pc(17) int local17 = arg1; local17 <= arg1 + 1; local17++) {
			if (local17 != this.anInt2286) {
				for (@Pc(24) int local24 = local3; local24 <= local7; local24++) {
					if (local24 >= 0 && local24 < this.anInt2296) {
						for (@Pc(34) int local34 = local11; local34 <= local15; local34++) {
							if (local34 >= 0 && local34 < this.anInt2287 && (!local1 || local24 >= local7 || local34 >= local15 || local34 < arg3 && local24 != arg2)) {
								@Pc(66) Class10_Sub8 local66 = this.aClass10_Sub8ArrayArrayArray1[local17][local24][local34];
								if (local66 != null) {
									@Pc(160) int local160 = (this.anIntArrayArrayArray6[local17][local24][local34] + this.anIntArrayArrayArray6[local17][local24 + 1][local34] + this.anIntArrayArrayArray6[local17][local24][local34 + 1] + this.anIntArrayArrayArray6[local17][local24 + 1][local34 + 1]) / 4 - (this.anIntArrayArrayArray6[arg1][arg2][arg3] + this.anIntArrayArrayArray6[arg1][arg2 + 1][arg3] + this.anIntArrayArrayArray6[arg1][arg2][arg3 + 1] + this.anIntArrayArrayArray6[arg1][arg2 + 1][arg3 + 1]) / 4;
									@Pc(163) Class57 local163 = local66.aClass57_1;
									if (local163 != null) {
										@Pc(173) Class10_Sub1_Sub5_Sub4 local173;
										if (local163.aClass10_Sub1_Sub5_7 instanceof Class10_Sub1_Sub5_Sub4) {
											local173 = (Class10_Sub1_Sub5_Sub4) local163.aClass10_Sub1_Sub5_7;
											if (local173.aClass37Array2 != null) {
												this.method1362(arg0, local173, (local24 - arg2) * 128 + (1 - arg4) * 64, local160, (local34 - arg3) * 128 + (1 - arg5) * 64, local1);
											}
										}
										if (local163.aClass10_Sub1_Sub5_8 instanceof Class10_Sub1_Sub5_Sub4) {
											local173 = (Class10_Sub1_Sub5_Sub4) local163.aClass10_Sub1_Sub5_8;
											if (local173.aClass37Array2 != null) {
												this.method1362(arg0, local173, (local24 - arg2) * 128 + (1 - arg4) * 64, local160, (local34 - arg3) * 128 + (1 - arg5) * 64, local1);
											}
										}
									}
									for (@Pc(245) int local245 = 0; local245 < local66.anInt1435; local245++) {
										@Pc(251) Class34 local251 = local66.aClass34Array1[local245];
										if (local251 != null && local251.aClass10_Sub1_Sub5_5 instanceof Class10_Sub1_Sub5_Sub4) {
											@Pc(261) Class10_Sub1_Sub5_Sub4 local261 = (Class10_Sub1_Sub5_Sub4) local251.aClass10_Sub1_Sub5_5;
											if (local261.aClass37Array2 != null) {
												@Pc(272) int local272 = local251.anInt1472 + 1 - local251.anInt1462;
												@Pc(280) int local280 = local251.anInt1469 + 1 - local251.anInt1461;
												this.method1362(arg0, local261, (local251.anInt1462 - arg2) * 128 + (local272 - arg4) * 64, local160, (local251.anInt1461 - arg3) * 128 + (local280 - arg5) * 64, local1);
											}
										}
									}
								}
							}
						}
					}
				}
				local3--;
				local1 = false;
			}
		}
	}

	@OriginalMember(owner = "client!rc", name = "c", descriptor = "(III)Lclient!ob;")
	public Class46 method1349(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class10_Sub8 local8 = this.aClass10_Sub8ArrayArrayArray1[arg0][arg1][arg2];
		return local8 == null || local8.aClass46_1 == null ? null : local8.aClass46_1;
	}

	@OriginalMember(owner = "client!rc", name = "e", descriptor = "(III)V")
	public void method1353(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class10_Sub8 local8 = this.aClass10_Sub8ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 != null) {
			local8.aClass4_1 = null;
		}
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(IIIIILclient!oa;IIZ)Z")
	public boolean method1354(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class10_Sub1_Sub5 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8) {
		if (arg5 == null) {
			return true;
		}
		@Pc(7) int local7 = arg1 - arg4;
		@Pc(11) int local11 = arg2 - arg4;
		@Pc(15) int local15 = arg1 + arg4;
		@Pc(19) int local19 = arg2 + arg4;
		if (arg8) {
			if (arg6 > 640 && arg6 < 1408) {
				local19 += 128;
			}
			if (arg6 > 1152 && arg6 < 1920) {
				local15 += 128;
			}
			if (arg6 > 1664 || arg6 < 384) {
				local11 -= 128;
			}
			if (arg6 > 128 && arg6 < 896) {
				local7 -= 128;
			}
		}
		local7 /= 128;
		local11 /= 128;
		local15 /= 128;
		local19 /= 128;
		return this.method1374(arg0, local7, local11, local15 + 1 - local7, local19 - local11 + 1, arg1, arg2, arg3, arg5, arg6, true, arg7, 0);
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(IIIIII)V")
	public void method1355(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (arg0 < 0) {
			arg0 = 0;
		} else if (arg0 >= this.anInt2296 * 128) {
			arg0 = this.anInt2296 * 128 - 1;
		}
		if (arg2 < 0) {
			arg2 = 0;
		} else if (arg2 >= this.anInt2287 * 128) {
			arg2 = this.anInt2287 * 128 - 1;
		}
		Static85.anInt2283++;
		Static85.anInt2289 = Static84.anIntArray280[arg3];
		Static85.anInt2280 = Static84.anIntArray281[arg3];
		Static85.anInt2274 = Static84.anIntArray280[arg4];
		Static85.anInt2285 = Static84.anIntArray281[arg4];
		Static85.aBooleanArrayArray1 = Static85.aBooleanArrayArrayArrayArray1[(arg3 - 128) / 32][arg4 / 64];
		Static85.anInt2275 = arg0;
		Static85.anInt2298 = arg1;
		Static85.anInt2276 = arg2;
		Static85.anInt2291 = arg0 / 128;
		Static85.anInt2300 = arg2 / 128;
		Static85.anInt2294 = arg5;
		Static85.anInt2292 = Static85.anInt2291 - 25;
		if (Static85.anInt2292 < 0) {
			Static85.anInt2292 = 0;
		}
		Static85.anInt2299 = Static85.anInt2300 - 25;
		if (Static85.anInt2299 < 0) {
			Static85.anInt2299 = 0;
		}
		Static85.anInt2279 = Static85.anInt2291 + 25;
		if (Static85.anInt2279 > this.anInt2296) {
			Static85.anInt2279 = this.anInt2296;
		}
		Static85.anInt2288 = Static85.anInt2300 + 25;
		if (Static85.anInt2288 > this.anInt2287) {
			Static85.anInt2288 = this.anInt2287;
		}
		this.method1372();
		Static85.anInt2297 = 0;
		@Pc(136) int local136;
		@Pc(139) int local139;
		for (@Pc(128) int local128 = this.anInt2295; local128 < this.anInt2286; local128++) {
			@Pc(134) Class10_Sub8[][] local134 = this.aClass10_Sub8ArrayArrayArray1[local128];
			for (local136 = Static85.anInt2292; local136 < Static85.anInt2279; local136++) {
				for (local139 = Static85.anInt2299; local139 < Static85.anInt2288; local139++) {
					@Pc(146) Class10_Sub8 local146 = local134[local136][local139];
					if (local146 != null) {
						if (local146.anInt1434 <= arg5 && (Static85.aBooleanArrayArray1[local136 + 25 - Static85.anInt2291][local139 + 25 - Static85.anInt2300] || this.anIntArrayArrayArray6[local128][local136][local139] - arg1 >= 2000)) {
							local146.aBoolean68 = true;
							local146.aBoolean70 = true;
							if (local146.anInt1435 > 0) {
								local146.aBoolean69 = true;
							} else {
								local146.aBoolean69 = false;
							}
							Static85.anInt2297++;
						} else {
							local146.aBoolean68 = false;
							local146.aBoolean70 = false;
							local146.anInt1446 = 0;
						}
					}
				}
			}
		}
		@Pc(241) int local241;
		@Pc(249) int local249;
		@Pc(254) int local254;
		@Pc(258) int local258;
		@Pc(237) int local237;
		for (@Pc(224) int local224 = this.anInt2295; local224 < this.anInt2286; local224++) {
			@Pc(230) Class10_Sub8[][] local230 = this.aClass10_Sub8ArrayArrayArray1[local224];
			for (local139 = -25; local139 <= 0; local139++) {
				local237 = Static85.anInt2291 + local139;
				local241 = Static85.anInt2291 - local139;
				if (local237 >= Static85.anInt2292 || local241 < Static85.anInt2279) {
					for (local249 = -25; local249 <= 0; local249++) {
						local254 = Static85.anInt2300 + local249;
						local258 = Static85.anInt2300 - local249;
						@Pc(270) Class10_Sub8 local270;
						if (local237 >= Static85.anInt2292) {
							if (local254 >= Static85.anInt2299) {
								local270 = local230[local237][local254];
								if (local270 != null && local270.aBoolean68) {
									this.method1359(local270, true);
								}
							}
							if (local258 < Static85.anInt2288) {
								local270 = local230[local237][local258];
								if (local270 != null && local270.aBoolean68) {
									this.method1359(local270, true);
								}
							}
						}
						if (local241 < Static85.anInt2279) {
							if (local254 >= Static85.anInt2299) {
								local270 = local230[local241][local254];
								if (local270 != null && local270.aBoolean68) {
									this.method1359(local270, true);
								}
							}
							if (local258 < Static85.anInt2288) {
								local270 = local230[local241][local258];
								if (local270 != null && local270.aBoolean68) {
									this.method1359(local270, true);
								}
							}
						}
						if (Static85.anInt2297 == 0) {
							Static85.aBoolean101 = false;
							return;
						}
					}
				}
			}
		}
		for (local136 = this.anInt2295; local136 < this.anInt2286; local136++) {
			@Pc(361) Class10_Sub8[][] local361 = this.aClass10_Sub8ArrayArrayArray1[local136];
			for (local237 = -25; local237 <= 0; local237++) {
				local241 = Static85.anInt2291 + local237;
				local249 = Static85.anInt2291 - local237;
				if (local241 >= Static85.anInt2292 || local249 < Static85.anInt2279) {
					for (local254 = -25; local254 <= 0; local254++) {
						local258 = Static85.anInt2300 + local254;
						@Pc(389) int local389 = Static85.anInt2300 - local254;
						@Pc(401) Class10_Sub8 local401;
						if (local241 >= Static85.anInt2292) {
							if (local258 >= Static85.anInt2299) {
								local401 = local361[local241][local258];
								if (local401 != null && local401.aBoolean68) {
									this.method1359(local401, false);
								}
							}
							if (local389 < Static85.anInt2288) {
								local401 = local361[local241][local389];
								if (local401 != null && local401.aBoolean68) {
									this.method1359(local401, false);
								}
							}
						}
						if (local249 < Static85.anInt2279) {
							if (local258 >= Static85.anInt2299) {
								local401 = local361[local249][local258];
								if (local401 != null && local401.aBoolean68) {
									this.method1359(local401, false);
								}
							}
							if (local389 < Static85.anInt2288) {
								local401 = local361[local249][local389];
								if (local401 != null && local401.aBoolean68) {
									this.method1359(local401, false);
								}
							}
						}
						if (Static85.anInt2297 == 0) {
							Static85.aBoolean101 = false;
							return;
						}
					}
				}
			}
		}
		Static85.aBoolean101 = false;
	}

	@OriginalMember(owner = "client!rc", name = "f", descriptor = "(III)Lclient!sb;")
	public Class57 method1357(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class10_Sub8 local8 = this.aClass10_Sub8ArrayArrayArray1[arg0][arg1][arg2];
		return local8 == null ? null : local8.aClass57_1;
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(IIIIIILclient!oa;III)Z")
	public boolean method1358(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class10_Sub1_Sub5 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		if (arg6 == null) {
			return true;
		} else {
			@Pc(11) int local11 = arg1 * 128 + arg4 * 64;
			@Pc(19) int local19 = arg2 * 128 + arg5 * 64;
			return this.method1374(arg0, arg1, arg2, arg4, arg5, local11, local19, arg3, arg6, arg7, false, arg8, arg9);
		}
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(Lclient!kb;Z)V")
	private void method1359(@OriginalArg(0) Class10_Sub8 arg0, @OriginalArg(1) boolean arg1) {
		Static85.aClass9_8.method79(arg0);
		while (true) {
			@Pc(8) Class10_Sub8 local8;
			@Pc(17) int local17;
			@Pc(20) int local20;
			@Pc(23) int local23;
			@Pc(26) int local26;
			@Pc(31) Class10_Sub8[][] local31;
			@Pc(49) Class10_Sub8 local49;
			@Pc(251) int local251;
			@Pc(578) int local578;
			@Pc(583) int local583;
			@Pc(588) int local588;
			@Pc(591) int local591;
			@Pc(600) int local600;
			@Pc(942) Class57 local942;
			@Pc(1116) int local1116;
			@Pc(1001) int local1001;
			do {
				do {
					do {
						do {
							do {
								do {
									while (true) {
										@Pc(257) Class34 var12;
										@Pc(612) int var19;
										@Pc(335) int var23;
										@Pc(289) boolean var24;
										@Pc(823) Class10_Sub8 var35;
										while (true) {
											do {
												local8 = (Class10_Sub8) Static85.aClass9_8.method83();
												if (local8 == null) {
													return;
												}
											} while (!local8.aBoolean70);
											local17 = local8.anInt1443;
											local20 = local8.anInt1440;
											local23 = local8.anInt1433;
											local26 = local8.anInt1438;
											local31 = this.aClass10_Sub8ArrayArrayArray1[local23];
											if (!local8.aBoolean68) {
												break;
											}
											if (arg1) {
												if (local23 > 0) {
													local49 = this.aClass10_Sub8ArrayArrayArray1[local23 - 1][local17][local20];
													if (local49 != null && local49.aBoolean70) {
														continue;
													}
												}
												if (local17 <= Static85.anInt2291 && local17 > Static85.anInt2292) {
													local49 = local31[local17 - 1][local20];
													if (local49 != null && local49.aBoolean70 && (local49.aBoolean68 || (local8.anInt1445 & 0x1) == 0)) {
														continue;
													}
												}
												if (local17 >= Static85.anInt2291 && local17 < Static85.anInt2279 - 1) {
													local49 = local31[local17 + 1][local20];
													if (local49 != null && local49.aBoolean70 && (local49.aBoolean68 || (local8.anInt1445 & 0x4) == 0)) {
														continue;
													}
												}
												if (local20 <= Static85.anInt2300 && local20 > Static85.anInt2299) {
													local49 = local31[local17][local20 - 1];
													if (local49 != null && local49.aBoolean70 && (local49.aBoolean68 || (local8.anInt1445 & 0x8) == 0)) {
														continue;
													}
												}
												if (local20 >= Static85.anInt2300 && local20 < Static85.anInt2288 - 1) {
													local49 = local31[local17][local20 + 1];
													if (local49 != null && local49.aBoolean70 && (local49.aBoolean68 || (local8.anInt1445 & 0x2) == 0)) {
														continue;
													}
												}
											} else {
												arg1 = true;
											}
											local8.aBoolean68 = false;
											if (local8.aClass10_Sub8_1 != null) {
												local49 = local8.aClass10_Sub8_1;
												if (local49.aClass31_1 == null) {
													if (local49.aClass48_1 != null && !this.method1345(0, local17, local20)) {
														this.method1378(local49.aClass48_1, Static85.anInt2289, Static85.anInt2280, Static85.anInt2274, Static85.anInt2285, local17, local20);
													}
												} else if (!this.method1345(0, local17, local20)) {
													this.method1375(local49.aClass31_1, 0, Static85.anInt2289, Static85.anInt2280, Static85.anInt2274, Static85.anInt2285, local17, local20);
												}
												@Pc(225) Class57 local225 = local49.aClass57_1;
												if (local225 != null) {
													local225.aClass10_Sub1_Sub5_7.method1664(0, Static85.anInt2289, Static85.anInt2280, Static85.anInt2274, Static85.anInt2285, local225.anInt2314 - Static85.anInt2275, local225.anInt2324 - Static85.anInt2298, local225.anInt2313 - Static85.anInt2276, local225.anInt2316);
												}
												for (local251 = 0; local251 < local49.anInt1435; local251++) {
													var12 = local49.aClass34Array1[local251];
													if (var12 != null) {
														var12.aClass10_Sub1_Sub5_5.method1664(var12.anInt1459, Static85.anInt2289, Static85.anInt2280, Static85.anInt2274, Static85.anInt2285, var12.anInt1456 - Static85.anInt2275, var12.anInt1457 - Static85.anInt2298, var12.anInt1468 - Static85.anInt2276, var12.anInt1464);
													}
												}
											}
											var24 = false;
											if (local8.aClass31_1 == null) {
												if (local8.aClass48_1 != null && !this.method1345(local26, local17, local20)) {
													var24 = true;
													this.method1378(local8.aClass48_1, Static85.anInt2289, Static85.anInt2280, Static85.anInt2274, Static85.anInt2285, local17, local20);
												}
											} else if (!this.method1345(local26, local17, local20)) {
												var24 = true;
												this.method1375(local8.aClass31_1, local26, Static85.anInt2289, Static85.anInt2280, Static85.anInt2274, Static85.anInt2285, local17, local20);
											}
											var23 = 0;
											local251 = 0;
											@Pc(340) Class57 local340 = local8.aClass57_1;
											@Pc(343) Class4 local343 = local8.aClass4_1;
											if (local340 != null || local343 != null) {
												if (Static85.anInt2291 == local17) {
													var23++;
												} else if (Static85.anInt2291 < local17) {
													var23 += 2;
												}
												if (Static85.anInt2300 == local20) {
													var23 += 3;
												} else if (Static85.anInt2300 > local20) {
													var23 += 6;
												}
												local251 = Static85.anIntArray298[var23];
												local8.anInt1439 = Static85.anIntArray302[var23];
											}
											if (local340 != null) {
												if ((local340.anInt2319 & Static85.anIntArray296[var23]) == 0) {
													local8.anInt1446 = 0;
												} else if (local340.anInt2319 == 16) {
													local8.anInt1446 = 3;
													local8.anInt1442 = Static85.anIntArray297[var23];
													local8.anInt1437 = 3 - local8.anInt1442;
												} else if (local340.anInt2319 == 32) {
													local8.anInt1446 = 6;
													local8.anInt1442 = Static85.anIntArray295[var23];
													local8.anInt1437 = 6 - local8.anInt1442;
												} else if (local340.anInt2319 == 64) {
													local8.anInt1446 = 12;
													local8.anInt1442 = Static85.anIntArray299[var23];
													local8.anInt1437 = 12 - local8.anInt1442;
												} else {
													local8.anInt1446 = 9;
													local8.anInt1442 = Static85.anIntArray303[var23];
													local8.anInt1437 = 9 - local8.anInt1442;
												}
												if ((local340.anInt2319 & local251) != 0 && !this.method1343(local26, local17, local20, local340.anInt2319)) {
													local340.aClass10_Sub1_Sub5_7.method1664(0, Static85.anInt2289, Static85.anInt2280, Static85.anInt2274, Static85.anInt2285, local340.anInt2314 - Static85.anInt2275, local340.anInt2324 - Static85.anInt2298, local340.anInt2313 - Static85.anInt2276, local340.anInt2316);
												}
												if ((local340.anInt2322 & local251) != 0 && !this.method1343(local26, local17, local20, local340.anInt2322)) {
													local340.aClass10_Sub1_Sub5_8.method1664(0, Static85.anInt2289, Static85.anInt2280, Static85.anInt2274, Static85.anInt2285, local340.anInt2314 - Static85.anInt2275, local340.anInt2324 - Static85.anInt2298, local340.anInt2313 - Static85.anInt2276, local340.anInt2316);
												}
											}
											if (local343 != null && !this.method1347(local26, local17, local20, local343.aClass10_Sub1_Sub5_1.anInt2674)) {
												if ((local343.anInt23 & local251) != 0) {
													local343.aClass10_Sub1_Sub5_1.method1664(local343.anInt17, Static85.anInt2289, Static85.anInt2280, Static85.anInt2274, Static85.anInt2285, local343.anInt30 - Static85.anInt2275, local343.anInt21 - Static85.anInt2298, local343.anInt22 - Static85.anInt2276, local343.anInt20);
												} else if ((local343.anInt23 & 0x300) != 0) {
													local578 = local343.anInt30 - Static85.anInt2275;
													local583 = local343.anInt21 - Static85.anInt2298;
													local588 = local343.anInt22 - Static85.anInt2276;
													local591 = local343.anInt17;
													if (local591 == 1 || local591 == 2) {
														local600 = -local578;
													} else {
														local600 = local578;
													}
													if (local591 == 2 || local591 == 3) {
														var19 = -local588;
													} else {
														var19 = local588;
													}
													@Pc(629) int local629;
													@Pc(635) int local635;
													if ((local343.anInt23 & 0x100) != 0 && var19 < local600) {
														local629 = local578 + Static85.anIntArray291[local591];
														local635 = local588 + Static85.anIntArray292[local591];
														local343.aClass10_Sub1_Sub5_1.method1664(local591 * 512 + 256, Static85.anInt2289, Static85.anInt2280, Static85.anInt2274, Static85.anInt2285, local629, local583, local635, local343.anInt20);
													}
													if ((local343.anInt23 & 0x200) != 0 && var19 > local600) {
														local629 = local578 + Static85.anIntArray290[local591];
														local635 = local588 + Static85.anIntArray294[local591];
														local343.aClass10_Sub1_Sub5_1.method1664(local591 * 512 + 1280 & 0x7FF, Static85.anInt2289, Static85.anInt2280, Static85.anInt2274, Static85.anInt2285, local629, local583, local635, local343.anInt20);
													}
												}
											}
											if (var24) {
												@Pc(696) Class46 local696 = local8.aClass46_1;
												if (local696 != null) {
													local696.aClass10_Sub1_Sub5_6.method1664(0, Static85.anInt2289, Static85.anInt2280, Static85.anInt2274, Static85.anInt2285, local696.anInt1830 - Static85.anInt2275, local696.anInt1822 - Static85.anInt2298, local696.anInt1823 - Static85.anInt2276, local696.anInt1829);
												}
												@Pc(723) Class24 local723 = local8.aClass24_1;
												if (local723 != null && local723.anInt931 == 0) {
													if (local723.aClass10_Sub1_Sub5_4 != null) {
														local723.aClass10_Sub1_Sub5_4.method1664(0, Static85.anInt2289, Static85.anInt2280, Static85.anInt2274, Static85.anInt2285, local723.anInt925 - Static85.anInt2275, local723.anInt929 - Static85.anInt2298, local723.anInt928 - Static85.anInt2276, local723.anInt924);
													}
													if (local723.aClass10_Sub1_Sub5_3 != null) {
														local723.aClass10_Sub1_Sub5_3.method1664(0, Static85.anInt2289, Static85.anInt2280, Static85.anInt2274, Static85.anInt2285, local723.anInt925 - Static85.anInt2275, local723.anInt929 - Static85.anInt2298, local723.anInt928 - Static85.anInt2276, local723.anInt924);
													}
													if (local723.aClass10_Sub1_Sub5_2 != null) {
														local723.aClass10_Sub1_Sub5_2.method1664(0, Static85.anInt2289, Static85.anInt2280, Static85.anInt2274, Static85.anInt2285, local723.anInt925 - Static85.anInt2275, local723.anInt929 - Static85.anInt2298, local723.anInt928 - Static85.anInt2276, local723.anInt924);
													}
												}
											}
											local578 = local8.anInt1445;
											if (local578 != 0) {
												if (local17 < Static85.anInt2291 && (local578 & 0x4) != 0) {
													var35 = local31[local17 + 1][local20];
													if (var35 != null && var35.aBoolean70) {
														Static85.aClass9_8.method79(var35);
													}
												}
												if (local20 < Static85.anInt2300 && (local578 & 0x2) != 0) {
													var35 = local31[local17][local20 + 1];
													if (var35 != null && var35.aBoolean70) {
														Static85.aClass9_8.method79(var35);
													}
												}
												if (local17 > Static85.anInt2291 && (local578 & 0x1) != 0) {
													var35 = local31[local17 - 1][local20];
													if (var35 != null && var35.aBoolean70) {
														Static85.aClass9_8.method79(var35);
													}
												}
												if (local20 > Static85.anInt2300 && (local578 & 0x8) != 0) {
													var35 = local31[local17][local20 - 1];
													if (var35 != null && var35.aBoolean70) {
														Static85.aClass9_8.method79(var35);
													}
												}
											}
											break;
										}
										if (local8.anInt1446 != 0) {
											var24 = true;
											for (var23 = 0; var23 < local8.anInt1435; var23++) {
												if (local8.aClass34Array1[var23].anInt1470 != Static85.anInt2283 && (local8.anIntArray156[var23] & local8.anInt1446) == local8.anInt1442) {
													var24 = false;
													break;
												}
											}
											if (var24) {
												local942 = local8.aClass57_1;
												if (!this.method1343(local26, local17, local20, local942.anInt2319)) {
													local942.aClass10_Sub1_Sub5_7.method1664(0, Static85.anInt2289, Static85.anInt2280, Static85.anInt2274, Static85.anInt2285, local942.anInt2314 - Static85.anInt2275, local942.anInt2324 - Static85.anInt2298, local942.anInt2313 - Static85.anInt2276, local942.anInt2316);
												}
												local8.anInt1446 = 0;
											}
										}
										if (!local8.aBoolean69) {
											break;
										}
										try {
											@Pc(981) int local981 = local8.anInt1435;
											local8.aBoolean69 = false;
											var23 = 0;
											label559: for (local251 = 0; local251 < local981; local251++) {
												var12 = local8.aClass34Array1[local251];
												if (var12.anInt1470 != Static85.anInt2283) {
													for (local1001 = var12.anInt1462; local1001 <= var12.anInt1472; local1001++) {
														for (local578 = var12.anInt1461; local578 <= var12.anInt1469; local578++) {
															var35 = local31[local1001][local578];
															if (var35.aBoolean68) {
																local8.aBoolean69 = true;
																continue label559;
															}
															if (var35.anInt1446 != 0) {
																local588 = 0;
																if (local1001 > var12.anInt1462) {
																	local588++;
																}
																if (local1001 < var12.anInt1472) {
																	local588 += 4;
																}
																if (local578 > var12.anInt1461) {
																	local588 += 8;
																}
																if (local578 < var12.anInt1469) {
																	local588 += 2;
																}
																if ((local588 & var35.anInt1446) == local8.anInt1437) {
																	local8.aBoolean69 = true;
																	continue label559;
																}
															}
														}
													}
													Static85.aClass34Array2[var23++] = var12;
													local578 = Static85.anInt2291 - var12.anInt1462;
													local583 = var12.anInt1472 - Static85.anInt2291;
													if (local583 > local578) {
														local578 = local583;
													}
													local588 = Static85.anInt2300 - var12.anInt1461;
													local591 = var12.anInt1469 - Static85.anInt2300;
													if (local591 > local588) {
														var12.anInt1467 = local578 + local591;
													} else {
														var12.anInt1467 = local578 + local588;
													}
												}
											}
											while (var23 > 0) {
												local1116 = -50;
												local1001 = -1;
												@Pc(1125) Class34 local1125;
												for (local578 = 0; local578 < var23; local578++) {
													local1125 = Static85.aClass34Array2[local578];
													if (local1125.anInt1470 != Static85.anInt2283) {
														if (local1125.anInt1467 > local1116) {
															local1116 = local1125.anInt1467;
															local1001 = local578;
														} else if (local1125.anInt1467 == local1116) {
															local588 = local1125.anInt1456 - Static85.anInt2275;
															local591 = local1125.anInt1468 - Static85.anInt2276;
															local600 = Static85.aClass34Array2[local1001].anInt1456 - Static85.anInt2275;
															var19 = Static85.aClass34Array2[local1001].anInt1468 - Static85.anInt2276;
															if (local588 * local588 + local591 * local591 > local600 * local600 + var19 * var19) {
																local1001 = local578;
															}
														}
													}
												}
												if (local1001 == -1) {
													break;
												}
												local1125 = Static85.aClass34Array2[local1001];
												local1125.anInt1470 = Static85.anInt2283;
												if (!this.method1391(local26, local1125.anInt1462, local1125.anInt1472, local1125.anInt1461, local1125.anInt1469, local1125.aClass10_Sub1_Sub5_5.anInt2674)) {
													local1125.aClass10_Sub1_Sub5_5.method1664(local1125.anInt1459, Static85.anInt2289, Static85.anInt2280, Static85.anInt2274, Static85.anInt2285, local1125.anInt1456 - Static85.anInt2275, local1125.anInt1457 - Static85.anInt2298, local1125.anInt1468 - Static85.anInt2276, local1125.anInt1464);
												}
												for (local588 = local1125.anInt1462; local588 <= local1125.anInt1472; local588++) {
													for (local591 = local1125.anInt1461; local591 <= local1125.anInt1469; local591++) {
														@Pc(1250) Class10_Sub8 local1250 = local31[local588][local591];
														if (local1250.anInt1446 != 0) {
															Static85.aClass9_8.method79(local1250);
														} else if ((local588 != local17 || local591 != local20) && local1250.aBoolean70) {
															Static85.aClass9_8.method79(local1250);
														}
													}
												}
											}
											if (!local8.aBoolean69) {
												break;
											}
										} catch (@Pc(1288) Exception local1288) {
											local8.aBoolean69 = false;
											break;
										}
									}
								} while (!local8.aBoolean70);
							} while (local8.anInt1446 != 0);
							if (local17 > Static85.anInt2291 || local17 <= Static85.anInt2292) {
								break;
							}
							local49 = local31[local17 - 1][local20];
						} while (local49 != null && local49.aBoolean70);
						if (local17 < Static85.anInt2291 || local17 >= Static85.anInt2279 - 1) {
							break;
						}
						local49 = local31[local17 + 1][local20];
					} while (local49 != null && local49.aBoolean70);
					if (local20 > Static85.anInt2300 || local20 <= Static85.anInt2299) {
						break;
					}
					local49 = local31[local17][local20 - 1];
				} while (local49 != null && local49.aBoolean70);
				if (local20 < Static85.anInt2300 || local20 >= Static85.anInt2288 - 1) {
					break;
				}
				local49 = local31[local17][local20 + 1];
			} while (local49 != null && local49.aBoolean70);
			local8.aBoolean70 = false;
			Static85.anInt2297--;
			@Pc(1392) Class24 local1392 = local8.aClass24_1;
			if (local1392 != null && local1392.anInt931 != 0) {
				if (local1392.aClass10_Sub1_Sub5_4 != null) {
					local1392.aClass10_Sub1_Sub5_4.method1664(0, Static85.anInt2289, Static85.anInt2280, Static85.anInt2274, Static85.anInt2285, local1392.anInt925 - Static85.anInt2275, local1392.anInt929 - Static85.anInt2298 - local1392.anInt931, local1392.anInt928 - Static85.anInt2276, local1392.anInt924);
				}
				if (local1392.aClass10_Sub1_Sub5_3 != null) {
					local1392.aClass10_Sub1_Sub5_3.method1664(0, Static85.anInt2289, Static85.anInt2280, Static85.anInt2274, Static85.anInt2285, local1392.anInt925 - Static85.anInt2275, local1392.anInt929 - Static85.anInt2298 - local1392.anInt931, local1392.anInt928 - Static85.anInt2276, local1392.anInt924);
				}
				if (local1392.aClass10_Sub1_Sub5_2 != null) {
					local1392.aClass10_Sub1_Sub5_2.method1664(0, Static85.anInt2289, Static85.anInt2280, Static85.anInt2274, Static85.anInt2285, local1392.anInt925 - Static85.anInt2275, local1392.anInt929 - Static85.anInt2298 - local1392.anInt931, local1392.anInt928 - Static85.anInt2276, local1392.anInt924);
				}
			}
			if (local8.anInt1439 != 0) {
				@Pc(1487) Class4 local1487 = local8.aClass4_1;
				if (local1487 != null && !this.method1347(local26, local17, local20, local1487.aClass10_Sub1_Sub5_1.anInt2674)) {
					if ((local1487.anInt23 & local8.anInt1439) != 0) {
						local1487.aClass10_Sub1_Sub5_1.method1664(local1487.anInt17, Static85.anInt2289, Static85.anInt2280, Static85.anInt2274, Static85.anInt2285, local1487.anInt30 - Static85.anInt2275, local1487.anInt21 - Static85.anInt2298, local1487.anInt22 - Static85.anInt2276, local1487.anInt20);
					} else if ((local1487.anInt23 & 0x300) != 0) {
						local251 = local1487.anInt30 - Static85.anInt2275;
						local1116 = local1487.anInt21 - Static85.anInt2298;
						local1001 = local1487.anInt22 - Static85.anInt2276;
						local578 = local1487.anInt17;
						if (local578 == 1 || local578 == 2) {
							local583 = -local251;
						} else {
							local583 = local251;
						}
						if (local578 == 2 || local578 == 3) {
							local588 = -local1001;
						} else {
							local588 = local1001;
						}
						if ((local1487.anInt23 & 0x100) != 0 && local588 >= local583) {
							local591 = local251 + Static85.anIntArray291[local578];
							local600 = local1001 + Static85.anIntArray292[local578];
							local1487.aClass10_Sub1_Sub5_1.method1664(local578 * 512 + 256, Static85.anInt2289, Static85.anInt2280, Static85.anInt2274, Static85.anInt2285, local591, local1116, local600, local1487.anInt20);
						}
						if ((local1487.anInt23 & 0x200) != 0 && local588 <= local583) {
							local591 = local251 + Static85.anIntArray290[local578];
							local600 = local1001 + Static85.anIntArray294[local578];
							local1487.aClass10_Sub1_Sub5_1.method1664(local578 * 512 + 1280 & 0x7FF, Static85.anInt2289, Static85.anInt2280, Static85.anInt2274, Static85.anInt2285, local591, local1116, local600, local1487.anInt20);
						}
					}
				}
				local942 = local8.aClass57_1;
				if (local942 != null) {
					if ((local942.anInt2322 & local8.anInt1439) != 0 && !this.method1343(local26, local17, local20, local942.anInt2322)) {
						local942.aClass10_Sub1_Sub5_8.method1664(0, Static85.anInt2289, Static85.anInt2280, Static85.anInt2274, Static85.anInt2285, local942.anInt2314 - Static85.anInt2275, local942.anInt2324 - Static85.anInt2298, local942.anInt2313 - Static85.anInt2276, local942.anInt2316);
					}
					if ((local942.anInt2319 & local8.anInt1439) != 0 && !this.method1343(local26, local17, local20, local942.anInt2319)) {
						local942.aClass10_Sub1_Sub5_7.method1664(0, Static85.anInt2289, Static85.anInt2280, Static85.anInt2274, Static85.anInt2285, local942.anInt2314 - Static85.anInt2275, local942.anInt2324 - Static85.anInt2298, local942.anInt2313 - Static85.anInt2276, local942.anInt2316);
					}
				}
			}
			@Pc(1745) Class10_Sub8 local1745;
			if (local23 < this.anInt2286 - 1) {
				local1745 = this.aClass10_Sub8ArrayArrayArray1[local23 + 1][local17][local20];
				if (local1745 != null && local1745.aBoolean70) {
					Static85.aClass9_8.method79(local1745);
				}
			}
			if (local17 < Static85.anInt2291) {
				local1745 = local31[local17 + 1][local20];
				if (local1745 != null && local1745.aBoolean70) {
					Static85.aClass9_8.method79(local1745);
				}
			}
			if (local20 < Static85.anInt2300) {
				local1745 = local31[local17][local20 + 1];
				if (local1745 != null && local1745.aBoolean70) {
					Static85.aClass9_8.method79(local1745);
				}
			}
			if (local17 > Static85.anInt2291) {
				local1745 = local31[local17 - 1][local20];
				if (local1745 != null && local1745.aBoolean70) {
					Static85.aClass9_8.method79(local1745);
				}
			}
			if (local20 > Static85.anInt2300) {
				local1745 = local31[local17][local20 - 1];
				if (local1745 != null && local1745.aBoolean70) {
					Static85.aClass9_8.method79(local1745);
				}
			}
		}
	}

	@OriginalMember(owner = "client!rc", name = "g", descriptor = "(III)Lclient!ac;")
	public Class4 method1360(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class10_Sub8 local8 = this.aClass10_Sub8ArrayArrayArray1[arg0][arg1][arg2];
		return local8 == null ? null : local8.aClass4_1;
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(IIIILclient!oa;ILclient!oa;Lclient!oa;)V")
	public void method1361(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class10_Sub1_Sub5 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class10_Sub1_Sub5 arg6, @OriginalArg(7) Class10_Sub1_Sub5 arg7) {
		@Pc(3) Class24 local3 = new Class24();
		local3.aClass10_Sub1_Sub5_2 = arg4;
		local3.anInt925 = arg1 * 128 + 64;
		local3.anInt928 = arg2 * 128 + 64;
		local3.anInt929 = arg3;
		local3.anInt924 = arg5;
		local3.aClass10_Sub1_Sub5_4 = arg6;
		local3.aClass10_Sub1_Sub5_3 = arg7;
		@Pc(34) int local34 = 0;
		@Pc(43) Class10_Sub8 local43 = this.aClass10_Sub8ArrayArrayArray1[arg0][arg1][arg2];
		if (local43 != null) {
			for (@Pc(47) int local47 = 0; local47 < local43.anInt1435; local47++) {
				if ((local43.aClass34Array1[local47].anInt1465 & 0x100) == 256 && local43.aClass34Array1[local47].aClass10_Sub1_Sub5_5 instanceof Class10_Sub1_Sub5_Sub4) {
					@Pc(71) Class10_Sub1_Sub5_Sub4 local71 = (Class10_Sub1_Sub5_Sub4) local43.aClass34Array1[local47].aClass10_Sub1_Sub5_5;
					local71.method1338();
					if (local71.anInt2674 > local34) {
						local34 = local71.anInt2674;
					}
				}
			}
		}
		local3.anInt931 = local34;
		if (this.aClass10_Sub8ArrayArrayArray1[arg0][arg1][arg2] == null) {
			this.aClass10_Sub8ArrayArrayArray1[arg0][arg1][arg2] = new Class10_Sub8(arg0, arg1, arg2);
		}
		this.aClass10_Sub8ArrayArrayArray1[arg0][arg1][arg2].aClass24_1 = local3;
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(Lclient!rb;Lclient!rb;IIIZ)V")
	private void method1362(@OriginalArg(0) Class10_Sub1_Sub5_Sub4 arg0, @OriginalArg(1) Class10_Sub1_Sub5_Sub4 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		arg1.method1325();
		this.anInt2301++;
		@Pc(9) int local9 = 0;
		@Pc(12) int[] local12 = arg1.anIntArray256;
		@Pc(15) int local15 = arg1.anInt2261;
		for (@Pc(17) int local17 = 0; local17 < arg0.anInt2261; local17++) {
			@Pc(23) Class37 local23 = arg0.aClass37Array2[local17];
			@Pc(28) Class37 local28 = arg0.aClass37Array1[local17];
			if (local28.anInt1510 != 0) {
				@Pc(38) int local38 = arg0.anIntArray265[local17] - arg3;
				if (local38 <= arg1.anInt2267) {
					@Pc(49) int local49 = arg0.anIntArray256[local17] - arg2;
					if (local49 >= arg1.anInt2266 && local49 <= arg1.anInt2262) {
						@Pc(65) int local65 = arg0.anIntArray259[local17] - arg4;
						if (local65 >= arg1.anInt2265 && local65 <= arg1.anInt2257) {
							for (@Pc(76) int local76 = 0; local76 < local15; local76++) {
								@Pc(82) Class37 local82 = arg1.aClass37Array2[local76];
								@Pc(87) Class37 local87 = arg1.aClass37Array1[local76];
								if (local49 == local12[local76] && local65 == arg1.anIntArray259[local76] && local38 == arg1.anIntArray265[local76] && local87.anInt1510 != 0) {
									local23.anInt1504 += local87.anInt1504;
									local23.anInt1507 += local87.anInt1507;
									local23.anInt1513 += local87.anInt1513;
									local23.anInt1510 += local87.anInt1510;
									local82.anInt1504 += local28.anInt1504;
									local82.anInt1507 += local28.anInt1507;
									local82.anInt1513 += local28.anInt1513;
									local82.anInt1510 += local28.anInt1510;
									local9++;
									this.anIntArray300[local17] = this.anInt2301;
									this.anIntArray301[local76] = this.anInt2301;
								}
							}
						}
					}
				}
			}
		}
		if (local9 < 3 || !arg5) {
			return;
		}
		for (@Pc(193) int local193 = 0; local193 < arg0.anInt2260; local193++) {
			if (this.anIntArray300[arg0.anIntArray251[local193]] == this.anInt2301 && this.anIntArray300[arg0.anIntArray258[local193]] == this.anInt2301 && this.anIntArray300[arg0.anIntArray257[local193]] == this.anInt2301) {
				arg0.anIntArray266[local193] = -1;
			}
		}
		for (@Pc(236) int local236 = 0; local236 < arg1.anInt2260; local236++) {
			if (this.anIntArray301[arg1.anIntArray251[local236]] == this.anInt2301 && this.anIntArray301[arg1.anIntArray258[local236]] == this.anInt2301 && this.anIntArray301[arg1.anIntArray257[local236]] == this.anInt2301) {
				arg1.anIntArray266[local236] = -1;
			}
		}
	}

	@OriginalMember(owner = "client!rc", name = "h", descriptor = "(III)I")
	public int method1363(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class10_Sub8 local8 = this.aClass10_Sub8ArrayArrayArray1[arg0][arg1][arg2];
		return local8 == null || local8.aClass57_1 == null ? 0 : local8.aClass57_1.anInt2316;
	}

	@OriginalMember(owner = "client!rc", name = "i", descriptor = "(III)V")
	public void method1364(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class10_Sub8 local8 = this.aClass10_Sub8ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 != null) {
			local8.aClass57_1 = null;
		}
	}

	@OriginalMember(owner = "client!rc", name = "d", descriptor = "(IIII)I")
	public int method1365(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(8) Class10_Sub8 local8 = this.aClass10_Sub8ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 == null) {
			return -1;
		} else if (local8.aClass57_1 != null && local8.aClass57_1.anInt2316 == arg3) {
			return local8.aClass57_1.anInt2321 & 0xFF;
		} else if (local8.aClass4_1 != null && local8.aClass4_1.anInt20 == arg3) {
			return local8.aClass4_1.anInt28 & 0xFF;
		} else if (local8.aClass46_1 != null && local8.aClass46_1.anInt1829 == arg3) {
			return local8.aClass46_1.anInt1827 & 0xFF;
		} else {
			for (@Pc(56) int local56 = 0; local56 < local8.anInt1435; local56++) {
				if (local8.aClass34Array1[local56].anInt1464 == arg3) {
					return local8.aClass34Array1[local56].anInt1465 & 0xFF;
				}
			}
			return -1;
		}
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(IIIIILclient!oa;IIIIII)Z")
	public boolean method1366(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) Class10_Sub1_Sub5 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		return arg4 == null ? true : this.method1374(arg0, arg7, arg8, arg9 + 1 - arg7, arg10 - arg8 + 1, arg1, arg2, arg3, arg4, arg5, true, arg6, 0);
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(IIIILclient!oa;Lclient!oa;IIII)V")
	public void method1367(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class10_Sub1_Sub5 arg4, @OriginalArg(5) Class10_Sub1_Sub5 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		if (arg4 == null && arg5 == null) {
			return;
		}
		@Pc(8) Class57 local8 = new Class57();
		local8.anInt2316 = arg8;
		local8.anInt2321 = arg9;
		local8.anInt2314 = arg1 * 128 + 64;
		local8.anInt2313 = arg2 * 128 + 64;
		local8.anInt2324 = arg3;
		local8.aClass10_Sub1_Sub5_7 = arg4;
		local8.aClass10_Sub1_Sub5_8 = arg5;
		local8.anInt2319 = arg6;
		local8.anInt2322 = arg7;
		for (@Pc(45) int local45 = arg0; local45 >= 0; local45--) {
			if (this.aClass10_Sub8ArrayArrayArray1[local45][arg1][arg2] == null) {
				this.aClass10_Sub8ArrayArrayArray1[local45][arg1][arg2] = new Class10_Sub8(local45, arg1, arg2);
			}
		}
		this.aClass10_Sub8ArrayArrayArray1[arg0][arg1][arg2].aClass57_1 = local8;
	}

	@OriginalMember(owner = "client!rc", name = "j", descriptor = "(III)V")
	public void method1368(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class10_Sub8 local8 = this.aClass10_Sub8ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 != null) {
			local8.aClass46_1 = null;
		}
	}

	@OriginalMember(owner = "client!rc", name = "b", descriptor = "()V")
	public void method1369() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt2281; local1++) {
			@Pc(7) Class34 local7 = this.aClass34Array3[local1];
			this.method1376(local7);
			this.aClass34Array3[local1] = null;
		}
		this.anInt2281 = 0;
	}

	@OriginalMember(owner = "client!rc", name = "b", descriptor = "(II)V")
	public void method1370(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class10_Sub8 local8 = this.aClass10_Sub8ArrayArrayArray1[0][arg0][arg1];
		for (@Pc(10) int local10 = 0; local10 < 3; local10++) {
			@Pc(31) Class10_Sub8 local31 = this.aClass10_Sub8ArrayArrayArray1[local10][arg0][arg1] = this.aClass10_Sub8ArrayArrayArray1[local10 + 1][arg0][arg1];
			if (local31 != null) {
				local31.anInt1433--;
				for (@Pc(41) int local41 = 0; local41 < local31.anInt1435; local41++) {
					@Pc(47) Class34 local47 = local31.aClass34Array1[local41];
					if ((local47.anInt1464 >> 29 & 0x3) == 2 && local47.anInt1462 == arg0 && local47.anInt1461 == arg1) {
						local47.anInt1460--;
					}
				}
			}
		}
		if (this.aClass10_Sub8ArrayArrayArray1[0][arg0][arg1] == null) {
			this.aClass10_Sub8ArrayArrayArray1[0][arg0][arg1] = new Class10_Sub8(0, arg0, arg1);
		}
		this.aClass10_Sub8ArrayArrayArray1[0][arg0][arg1].aClass10_Sub8_1 = local8;
		this.aClass10_Sub8ArrayArrayArray1[3][arg0][arg1] = null;
	}

	@OriginalMember(owner = "client!rc", name = "k", descriptor = "(III)V")
	public void method1371(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class10_Sub8 local8 = this.aClass10_Sub8ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 == null) {
			return;
		}
		for (@Pc(13) int local13 = 0; local13 < local8.anInt1435; local13++) {
			@Pc(19) Class34 local19 = local8.aClass34Array1[local13];
			if ((local19.anInt1464 >> 29 & 0x3) == 2 && local19.anInt1462 == arg1 && local19.anInt1461 == arg2) {
				this.method1376(local19);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!rc", name = "c", descriptor = "()V")
	private void method1372() {
		@Pc(3) int local3 = Static85.anIntArray293[Static85.anInt2294];
		@Pc(7) Class49[] local7 = Static85.aClass49ArrayArray1[Static85.anInt2294];
		Static85.anInt2282 = 0;
		for (@Pc(11) int local11 = 0; local11 < local3; local11++) {
			@Pc(16) Class49 local16 = local7[local11];
			@Pc(27) int local27;
			@Pc(40) int local40;
			@Pc(51) int local51;
			@Pc(79) int local79;
			@Pc(58) boolean local58;
			if (local16.anInt2042 == 1) {
				local27 = local16.anInt2036 + 25 - Static85.anInt2291;
				if (local27 >= 0 && local27 <= 50) {
					local40 = local16.anInt2024 + 25 - Static85.anInt2300;
					if (local40 < 0) {
						local40 = 0;
					}
					local51 = local16.anInt2023 + 25 - Static85.anInt2300;
					if (local51 > 50) {
						local51 = 50;
					}
					local58 = false;
					while (local40 <= local51) {
						if (Static85.aBooleanArrayArray1[local27][local40++]) {
							local58 = true;
							break;
						}
					}
					if (local58) {
						local79 = Static85.anInt2275 - local16.anInt2043;
						if (local79 > 32) {
							local16.anInt2031 = 1;
						} else {
							if (local79 >= -32) {
								continue;
							}
							local16.anInt2031 = 2;
							local79 = -local79;
						}
						local16.anInt2021 = (local16.anInt2019 - Static85.anInt2276 << 8) / local79;
						local16.anInt2040 = (local16.anInt2022 - Static85.anInt2276 << 8) / local79;
						local16.anInt2033 = (local16.anInt2039 - Static85.anInt2298 << 8) / local79;
						local16.anInt2041 = (local16.anInt2027 - Static85.anInt2298 << 8) / local79;
						Static85.aClass49Array1[Static85.anInt2282++] = local16;
					}
				}
			} else if (local16.anInt2042 == 2) {
				local27 = local16.anInt2024 + 25 - Static85.anInt2300;
				if (local27 >= 0 && local27 <= 50) {
					local40 = local16.anInt2036 + 25 - Static85.anInt2291;
					if (local40 < 0) {
						local40 = 0;
					}
					local51 = local16.anInt2032 + 25 - Static85.anInt2291;
					if (local51 > 50) {
						local51 = 50;
					}
					local58 = false;
					while (local40 <= local51) {
						if (Static85.aBooleanArrayArray1[local40++][local27]) {
							local58 = true;
							break;
						}
					}
					if (local58) {
						local79 = Static85.anInt2276 - local16.anInt2019;
						if (local79 > 32) {
							local16.anInt2031 = 3;
						} else {
							if (local79 >= -32) {
								continue;
							}
							local16.anInt2031 = 4;
							local79 = -local79;
						}
						local16.anInt2038 = (local16.anInt2043 - Static85.anInt2275 << 8) / local79;
						local16.anInt2029 = (local16.anInt2020 - Static85.anInt2275 << 8) / local79;
						local16.anInt2033 = (local16.anInt2039 - Static85.anInt2298 << 8) / local79;
						local16.anInt2041 = (local16.anInt2027 - Static85.anInt2298 << 8) / local79;
						Static85.aClass49Array1[Static85.anInt2282++] = local16;
					}
				}
			} else if (local16.anInt2042 == 4) {
				local27 = local16.anInt2039 - Static85.anInt2298;
				if (local27 > 128) {
					local40 = local16.anInt2024 + 25 - Static85.anInt2300;
					if (local40 < 0) {
						local40 = 0;
					}
					local51 = local16.anInt2023 + 25 - Static85.anInt2300;
					if (local51 > 50) {
						local51 = 50;
					}
					if (local40 <= local51) {
						@Pc(319) int local319 = local16.anInt2036 + 25 - Static85.anInt2291;
						if (local319 < 0) {
							local319 = 0;
						}
						local79 = local16.anInt2032 + 25 - Static85.anInt2291;
						if (local79 > 50) {
							local79 = 50;
						}
						@Pc(337) boolean local337 = false;
						label142: for (@Pc(339) int local339 = local319; local339 <= local79; local339++) {
							for (@Pc(342) int local342 = local40; local342 <= local51; local342++) {
								if (Static85.aBooleanArrayArray1[local339][local342]) {
									local337 = true;
									break label142;
								}
							}
						}
						if (local337) {
							local16.anInt2031 = 5;
							local16.anInt2038 = (local16.anInt2043 - Static85.anInt2275 << 8) / local27;
							local16.anInt2029 = (local16.anInt2020 - Static85.anInt2275 << 8) / local27;
							local16.anInt2021 = (local16.anInt2019 - Static85.anInt2276 << 8) / local27;
							local16.anInt2040 = (local16.anInt2022 - Static85.anInt2276 << 8) / local27;
							Static85.aClass49Array1[Static85.anInt2282++] = local16;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(IIIILclient!oa;II)V")
	public void method1373(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class10_Sub1_Sub5 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (arg4 == null) {
			return;
		}
		@Pc(6) Class46 local6 = new Class46();
		local6.aClass10_Sub1_Sub5_6 = arg4;
		local6.anInt1830 = arg1 * 128 + 64;
		local6.anInt1823 = arg2 * 128 + 64;
		local6.anInt1822 = arg3;
		local6.anInt1829 = arg5;
		local6.anInt1827 = arg6;
		if (this.aClass10_Sub8ArrayArrayArray1[arg0][arg1][arg2] == null) {
			this.aClass10_Sub8ArrayArrayArray1[arg0][arg1][arg2] = new Class10_Sub8(arg0, arg1, arg2);
		}
		this.aClass10_Sub8ArrayArrayArray1[arg0][arg1][arg2].aClass46_1 = local6;
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(IIIIIIIILclient!oa;IZII)Z")
	private boolean method1374(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) Class10_Sub1_Sub5 arg8, @OriginalArg(9) int arg9, @OriginalArg(10) boolean arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12) {
		for (@Pc(1) int local1 = arg1; local1 < arg1 + arg3; local1++) {
			for (@Pc(4) int local4 = arg2; local4 < arg2 + arg4; local4++) {
				if (local1 < 0 || local4 < 0 || local1 >= this.anInt2296 || local4 >= this.anInt2287) {
					return false;
				}
				@Pc(28) Class10_Sub8 local28 = this.aClass10_Sub8ArrayArrayArray1[arg0][local1][local4];
				if (local28 != null && local28.anInt1435 >= 5) {
					return false;
				}
			}
		}
		@Pc(52) Class34 local52 = new Class34();
		local52.anInt1464 = arg11;
		local52.anInt1465 = arg12;
		local52.anInt1460 = arg0;
		local52.anInt1456 = arg5;
		local52.anInt1468 = arg6;
		local52.anInt1457 = arg7;
		local52.aClass10_Sub1_Sub5_5 = arg8;
		local52.anInt1459 = arg9;
		local52.anInt1462 = arg1;
		local52.anInt1461 = arg2;
		local52.anInt1472 = arg1 + arg3 - 1;
		local52.anInt1469 = arg2 + arg4 - 1;
		for (@Pc(98) int local98 = arg1; local98 < arg1 + arg3; local98++) {
			for (@Pc(101) int local101 = arg2; local101 < arg2 + arg4; local101++) {
				@Pc(104) int local104 = 0;
				if (local98 > arg1) {
					local104++;
				}
				if (local98 < arg1 + arg3 - 1) {
					local104 += 4;
				}
				if (local101 > arg2) {
					local104 += 8;
				}
				if (local101 < arg2 + arg4 - 1) {
					local104 += 2;
				}
				for (@Pc(130) int local130 = arg0; local130 >= 0; local130--) {
					if (this.aClass10_Sub8ArrayArrayArray1[local130][local98][local101] == null) {
						this.aClass10_Sub8ArrayArrayArray1[local130][local98][local101] = new Class10_Sub8(local130, local98, local101);
					}
				}
				@Pc(166) Class10_Sub8 local166 = this.aClass10_Sub8ArrayArrayArray1[arg0][local98][local101];
				local166.aClass34Array1[local166.anInt1435] = local52;
				local166.anIntArray156[local166.anInt1435] = local104;
				local166.anInt1445 |= local104;
				local166.anInt1435++;
			}
		}
		if (arg10) {
			this.aClass34Array3[this.anInt2281++] = local52;
		}
		return true;
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(Lclient!k;IIIIIII)V")
	private void method1375(@OriginalArg(0) Class31 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(6) int local6;
		@Pc(7) int local7 = local6 = (arg6 << 7) - Static85.anInt2275;
		@Pc(14) int local14;
		@Pc(15) int local15 = local14 = (arg7 << 7) - Static85.anInt2276;
		@Pc(20) int local20;
		@Pc(21) int local21 = local20 = local7 + 128;
		@Pc(26) int local26;
		@Pc(27) int local27 = local26 = local15 + 128;
		@Pc(38) int local38 = this.anIntArrayArrayArray6[arg1][arg6][arg7] - Static85.anInt2298;
		@Pc(51) int local51 = this.anIntArrayArrayArray6[arg1][arg6 + 1][arg7] - Static85.anInt2298;
		@Pc(66) int local66 = this.anIntArrayArrayArray6[arg1][arg6 + 1][arg7 + 1] - Static85.anInt2298;
		@Pc(79) int local79 = this.anIntArrayArrayArray6[arg1][arg6][arg7 + 1] - Static85.anInt2298;
		@Pc(89) int local89 = local15 * arg4 + local7 * arg5 >> 16;
		@Pc(99) int local99 = local15 * arg5 - local7 * arg4 >> 16;
		@Pc(101) int local101 = local89;
		@Pc(111) int local111 = local38 * arg3 - local99 * arg2 >> 16;
		@Pc(121) int local121 = local38 * arg2 + local99 * arg3 >> 16;
		@Pc(123) int local123 = local111;
		if (local121 < 50) {
			return;
		}
		local89 = local14 * arg4 + local21 * arg5 >> 16;
		@Pc(147) int local147 = local14 * arg5 - local21 * arg4 >> 16;
		local21 = local89;
		local89 = local51 * arg3 - local147 * arg2 >> 16;
		@Pc(169) int local169 = local51 * arg2 + local147 * arg3 >> 16;
		local51 = local89;
		if (local169 < 50) {
			return;
		}
		local89 = local27 * arg4 + local20 * arg5 >> 16;
		local27 = local27 * arg5 - local20 * arg4 >> 16;
		@Pc(197) int local197 = local89;
		local89 = local66 * arg3 - local27 * arg2 >> 16;
		local27 = local66 * arg2 + local27 * arg3 >> 16;
		local66 = local89;
		if (local27 < 50) {
			return;
		}
		local89 = local26 * arg4 + local6 * arg5 >> 16;
		@Pc(243) int local243 = local26 * arg5 - local6 * arg4 >> 16;
		@Pc(245) int local245 = local89;
		local89 = local79 * arg3 - local243 * arg2 >> 16;
		@Pc(265) int local265 = local79 * arg2 + local243 * arg3 >> 16;
		if (local265 < 50) {
			return;
		}
		@Pc(279) int local279 = Static68.anInt1810 + (local101 << 9) / local121;
		@Pc(287) int local287 = Static68.anInt1808 + (local123 << 9) / local121;
		@Pc(295) int local295 = Static68.anInt1810 + (local21 << 9) / local169;
		@Pc(303) int local303 = Static68.anInt1808 + (local51 << 9) / local169;
		@Pc(311) int local311 = Static68.anInt1810 + (local197 << 9) / local27;
		@Pc(319) int local319 = Static68.anInt1808 + (local66 << 9) / local27;
		@Pc(327) int local327 = Static68.anInt1810 + (local245 << 9) / local265;
		@Pc(335) int local335 = Static68.anInt1808 + (local89 << 9) / local265;
		Static68.anInt1806 = 0;
		@Pc(472) int local472;
		if ((local311 - local327) * (local303 - local335) - (local319 - local335) * (local295 - local327) > 0) {
			Static68.aBoolean83 = false;
			if (local311 < 0 || local327 < 0 || local295 < 0 || local311 > Static68.anInt1807 || local327 > Static68.anInt1807 || local295 > Static68.anInt1807) {
				Static68.aBoolean83 = true;
			}
			if (Static85.aBoolean101 && this.method1381(Static85.anInt2293, Static85.anInt2278, local319, local335, local303, local311, local327, local295)) {
				Static85.anInt2284 = arg6;
				Static85.anInt2290 = arg7;
			}
			if (arg0.anInt1392 == -1) {
				if (arg0.anInt1395 != 12345678) {
					Static68.method1000(local319, local335, local303, local311, local327, local295, arg0.anInt1395, arg0.anInt1396, arg0.anInt1402);
				}
			} else if (Static85.aBoolean100) {
				local472 = Static68.anInterface3_1.method59(arg0.anInt1392);
				Static68.method1000(local319, local335, local303, local311, local327, local295, Static85.method1352(local472, arg0.anInt1395), Static85.method1352(local472, arg0.anInt1396), Static85.method1352(local472, arg0.anInt1402));
			} else if (arg0.aBoolean66) {
				Static68.method999(local319, local335, local303, local311, local327, local295, arg0.anInt1395, arg0.anInt1396, arg0.anInt1402, local101, local21, local245, local123, local51, local89, local121, local169, local265, arg0.anInt1392);
			} else {
				Static68.method999(local319, local335, local303, local311, local327, local295, arg0.anInt1395, arg0.anInt1396, arg0.anInt1402, local197, local245, local21, local66, local89, local51, local27, local265, local169, arg0.anInt1392);
			}
		}
		if ((local279 - local295) * (local335 - local303) - (local287 - local303) * (local327 - local295) <= 0) {
			return;
		}
		Static68.aBoolean83 = false;
		if (local279 < 0 || local295 < 0 || local327 < 0 || local279 > Static68.anInt1807 || local295 > Static68.anInt1807 || local327 > Static68.anInt1807) {
			Static68.aBoolean83 = true;
		}
		if (Static85.aBoolean101 && this.method1381(Static85.anInt2293, Static85.anInt2278, local287, local303, local335, local279, local295, local327)) {
			Static85.anInt2284 = arg6;
			Static85.anInt2290 = arg7;
		}
		if (arg0.anInt1392 != -1) {
			if (!Static85.aBoolean100) {
				Static68.method999(local287, local303, local335, local279, local295, local327, arg0.anInt1401, arg0.anInt1402, arg0.anInt1396, local101, local21, local245, local123, local51, local89, local121, local169, local265, arg0.anInt1392);
				return;
			}
			local472 = Static68.anInterface3_1.method59(arg0.anInt1392);
			Static68.method1000(local287, local303, local335, local279, local295, local327, Static85.method1352(local472, arg0.anInt1401), Static85.method1352(local472, arg0.anInt1402), Static85.method1352(local472, arg0.anInt1396));
		} else if (arg0.anInt1401 != 12345678) {
			Static68.method1000(local287, local303, local335, local279, local295, local327, arg0.anInt1401, arg0.anInt1402, arg0.anInt1396);
			return;
		}
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(Lclient!kd;)V")
	private void method1376(@OriginalArg(0) Class34 arg0) {
		for (@Pc(2) int local2 = arg0.anInt1462; local2 <= arg0.anInt1472; local2++) {
			for (@Pc(6) int local6 = arg0.anInt1461; local6 <= arg0.anInt1469; local6++) {
				@Pc(17) Class10_Sub8 local17 = this.aClass10_Sub8ArrayArrayArray1[arg0.anInt1460][local2][local6];
				if (local17 != null) {
					@Pc(36) int local36;
					for (@Pc(21) int local21 = 0; local21 < local17.anInt1435; local21++) {
						if (local17.aClass34Array1[local21] == arg0) {
							local17.anInt1435--;
							for (local36 = local21; local36 < local17.anInt1435; local36++) {
								local17.aClass34Array1[local36] = local17.aClass34Array1[local36 + 1];
								local17.anIntArray156[local36] = local17.anIntArray156[local36 + 1];
							}
							local17.aClass34Array1[local17.anInt1435] = null;
							break;
						}
					}
					local17.anInt1445 = 0;
					for (local36 = 0; local36 < local17.anInt1435; local36++) {
						local17.anInt1445 |= local17.anIntArray156[local36];
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!rc", name = "l", descriptor = "(III)V")
	public void method1377() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt2286; local1++) {
			for (@Pc(4) int local4 = 0; local4 < this.anInt2296; local4++) {
				for (@Pc(7) int local7 = 0; local7 < this.anInt2287; local7++) {
					@Pc(17) Class10_Sub8 local17 = this.aClass10_Sub8ArrayArrayArray1[local1][local4][local7];
					if (local17 != null) {
						@Pc(22) Class57 local22 = local17.aClass57_1;
						if (local22 != null && local22.aClass10_Sub1_Sub5_7 instanceof Class10_Sub1_Sub5_Sub4) {
							@Pc(32) Class10_Sub1_Sub5_Sub4 local32 = (Class10_Sub1_Sub5_Sub4) local22.aClass10_Sub1_Sub5_7;
							if (local32.aClass37Array2 != null) {
								this.method1348(local32, local1, local4, local7, 1, 1);
								if (local22.aClass10_Sub1_Sub5_8 instanceof Class10_Sub1_Sub5_Sub4) {
									@Pc(51) Class10_Sub1_Sub5_Sub4 local51 = (Class10_Sub1_Sub5_Sub4) local22.aClass10_Sub1_Sub5_8;
									if (local51.aClass37Array2 != null) {
										this.method1348(local51, local1, local4, local7, 1, 1);
										this.method1362(local32, local51, 0, 0, 0, false);
										local51.method1326();
									}
								}
								local32.method1326();
							}
						}
						@Pc(98) Class10_Sub1_Sub5_Sub4 local98;
						for (@Pc(82) int local82 = 0; local82 < local17.anInt1435; local82++) {
							@Pc(88) Class34 local88 = local17.aClass34Array1[local82];
							if (local88 != null && local88.aClass10_Sub1_Sub5_5 instanceof Class10_Sub1_Sub5_Sub4) {
								local98 = (Class10_Sub1_Sub5_Sub4) local88.aClass10_Sub1_Sub5_5;
								if (local98.aClass37Array2 != null) {
									this.method1348(local98, local1, local4, local7, local88.anInt1472 + 1 - local88.anInt1462, local88.anInt1469 - local88.anInt1461 + 1);
									local98.method1326();
								}
							}
						}
						@Pc(134) Class46 local134 = local17.aClass46_1;
						if (local134 != null && local134.aClass10_Sub1_Sub5_6 instanceof Class10_Sub1_Sub5_Sub4) {
							local98 = (Class10_Sub1_Sub5_Sub4) local134.aClass10_Sub1_Sub5_6;
							if (local98.aClass37Array2 != null) {
								this.method1386(local98, local1, local4, local7);
								local98.method1326();
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(Lclient!oe;IIIIII)V")
	private void method1378(@OriginalArg(0) Class48 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(3) int local3 = arg0.anIntArray213.length;
		@Pc(13) int local13;
		@Pc(20) int local20;
		@Pc(27) int local27;
		@Pc(37) int local37;
		for (@Pc(5) int local5 = 0; local5 < local3; local5++) {
			local13 = arg0.anIntArray213[local5] - Static85.anInt2275;
			local20 = arg0.anIntArray221[local5] - Static85.anInt2298;
			local27 = arg0.anIntArray217[local5] - Static85.anInt2276;
			local37 = local27 * arg3 + local13 * arg4 >> 16;
			@Pc(47) int local47 = local27 * arg4 - local13 * arg3 >> 16;
			@Pc(59) int local59 = local20 * arg2 - local47 * arg1 >> 16;
			@Pc(69) int local69 = local20 * arg1 + local47 * arg2 >> 16;
			if (local69 < 50) {
				return;
			}
			if (arg0.anIntArray226 != null) {
				Static73.anIntArray225[local5] = local37;
				Static73.anIntArray220[local5] = local59;
				Static73.anIntArray214[local5] = local69;
			}
			Static73.anIntArray216[local5] = Static68.anInt1810 + (local37 << 9) / local69;
			Static73.anIntArray224[local5] = Static68.anInt1808 + (local59 << 9) / local69;
		}
		Static68.anInt1806 = 0;
		local3 = arg0.anIntArray215.length;
		for (local13 = 0; local13 < local3; local13++) {
			local20 = arg0.anIntArray215[local13];
			local27 = arg0.anIntArray218[local13];
			local37 = arg0.anIntArray219[local13];
			@Pc(142) int local142 = Static73.anIntArray216[local20];
			@Pc(146) int local146 = Static73.anIntArray216[local27];
			@Pc(150) int local150 = Static73.anIntArray216[local37];
			@Pc(154) int local154 = Static73.anIntArray224[local20];
			@Pc(158) int local158 = Static73.anIntArray224[local27];
			@Pc(162) int local162 = Static73.anIntArray224[local37];
			if ((local142 - local146) * (local162 - local158) - (local154 - local158) * (local150 - local146) > 0) {
				Static68.aBoolean83 = false;
				if (local142 < 0 || local146 < 0 || local150 < 0 || local142 > Static68.anInt1807 || local146 > Static68.anInt1807 || local150 > Static68.anInt1807) {
					Static68.aBoolean83 = true;
				}
				if (Static85.aBoolean101 && this.method1381(Static85.anInt2293, Static85.anInt2278, local154, local158, local162, local142, local146, local150)) {
					Static85.anInt2284 = arg5;
					Static85.anInt2290 = arg6;
				}
				if (arg0.anIntArray226 == null || arg0.anIntArray226[local13] == -1) {
					if (arg0.anIntArray223[local13] != 12345678) {
						Static68.method1000(local154, local158, local162, local142, local146, local150, arg0.anIntArray223[local13], arg0.anIntArray222[local13], arg0.anIntArray212[local13]);
					}
				} else if (Static85.aBoolean100) {
					@Pc(364) int local364 = Static68.anInterface3_1.method59(arg0.anIntArray226[local13]);
					Static68.method1000(local154, local158, local162, local142, local146, local150, Static85.method1352(local364, arg0.anIntArray223[local13]), Static85.method1352(local364, arg0.anIntArray222[local13]), Static85.method1352(local364, arg0.anIntArray212[local13]));
				} else if (arg0.aBoolean90) {
					Static68.method999(local154, local158, local162, local142, local146, local150, arg0.anIntArray223[local13], arg0.anIntArray222[local13], arg0.anIntArray212[local13], Static73.anIntArray225[0], Static73.anIntArray225[1], Static73.anIntArray225[3], Static73.anIntArray220[0], Static73.anIntArray220[1], Static73.anIntArray220[3], Static73.anIntArray214[0], Static73.anIntArray214[1], Static73.anIntArray214[3], arg0.anIntArray226[local13]);
				} else {
					Static68.method999(local154, local158, local162, local142, local146, local150, arg0.anIntArray223[local13], arg0.anIntArray222[local13], arg0.anIntArray212[local13], Static73.anIntArray225[local20], Static73.anIntArray225[local27], Static73.anIntArray225[local37], Static73.anIntArray220[local20], Static73.anIntArray220[local27], Static73.anIntArray220[local37], Static73.anIntArray214[local20], Static73.anIntArray214[local27], Static73.anIntArray214[local37], arg0.anIntArray226[local13]);
				}
			}
		}
	}

	@OriginalMember(owner = "client!rc", name = "d", descriptor = "()V")
	public void method1379() {
		@Pc(4) int local4;
		@Pc(7) int local7;
		for (@Pc(1) int local1 = 0; local1 < this.anInt2286; local1++) {
			for (local4 = 0; local4 < this.anInt2296; local4++) {
				for (local7 = 0; local7 < this.anInt2287; local7++) {
					this.aClass10_Sub8ArrayArrayArray1[local1][local4][local7] = null;
				}
			}
		}
		for (local4 = 0; local4 < Static85.anInt2277; local4++) {
			for (local7 = 0; local7 < Static85.anIntArray293[local4]; local7++) {
				Static85.aClass49ArrayArray1[local4][local7] = null;
			}
			Static85.anIntArray293[local4] = 0;
		}
		for (local7 = 0; local7 < this.anInt2281; local7++) {
			this.aClass34Array3[local7] = null;
		}
		this.anInt2281 = 0;
		for (@Pc(76) int local76 = 0; local76 < Static85.aClass34Array2.length; local76++) {
			Static85.aClass34Array2[local76] = null;
		}
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(IIIIIIIIIIIIIIIIIIII)V")
	public void method1380(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int arg15, @OriginalArg(16) int arg16, @OriginalArg(17) int arg17, @OriginalArg(18) int arg18, @OriginalArg(19) int arg19) {
		@Pc(12) Class31 local12;
		@Pc(14) int local14;
		if (arg3 == 0) {
			local12 = new Class31(arg10, arg11, arg12, arg13, -1, arg18, false);
			for (local14 = arg0; local14 >= 0; local14--) {
				if (this.aClass10_Sub8ArrayArrayArray1[local14][arg1][arg2] == null) {
					this.aClass10_Sub8ArrayArrayArray1[local14][arg1][arg2] = new Class10_Sub8(local14, arg1, arg2);
				}
			}
			this.aClass10_Sub8ArrayArrayArray1[arg0][arg1][arg2].aClass31_1 = local12;
		} else if (arg3 == 1) {
			local12 = new Class31(arg14, arg15, arg16, arg17, arg5, arg19, arg6 == arg7 && arg6 == arg8 && arg6 == arg9);
			for (local14 = arg0; local14 >= 0; local14--) {
				if (this.aClass10_Sub8ArrayArrayArray1[local14][arg1][arg2] == null) {
					this.aClass10_Sub8ArrayArrayArray1[local14][arg1][arg2] = new Class10_Sub8(local14, arg1, arg2);
				}
			}
			this.aClass10_Sub8ArrayArrayArray1[arg0][arg1][arg2].aClass31_1 = local12;
		} else {
			@Pc(140) Class48 local140 = new Class48(arg3, arg4, arg5, arg1, arg2, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17, arg18, arg19);
			for (local14 = arg0; local14 >= 0; local14--) {
				if (this.aClass10_Sub8ArrayArrayArray1[local14][arg1][arg2] == null) {
					this.aClass10_Sub8ArrayArrayArray1[local14][arg1][arg2] = new Class10_Sub8(local14, arg1, arg2);
				}
			}
			this.aClass10_Sub8ArrayArrayArray1[arg0][arg1][arg2].aClass48_1 = local140;
		}
	}

	@OriginalMember(owner = "client!rc", name = "b", descriptor = "(IIIIIIII)Z")
	private boolean method1381(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (arg1 < arg2 && arg1 < arg3 && arg1 < arg4) {
			return false;
		} else if (arg1 > arg2 && arg1 > arg3 && arg1 > arg4) {
			return false;
		} else if (arg0 < arg5 && arg0 < arg6 && arg0 < arg7) {
			return false;
		} else if (arg0 > arg5 && arg0 > arg6 && arg0 > arg7) {
			return false;
		} else {
			@Pc(59) int local59 = (arg1 - arg2) * (arg6 - arg5) - (arg0 - arg5) * (arg3 - arg2);
			@Pc(75) int local75 = (arg1 - arg4) * (arg5 - arg7) - (arg0 - arg7) * (arg2 - arg4);
			@Pc(91) int local91 = (arg1 - arg3) * (arg7 - arg6) - (arg0 - arg6) * (arg4 - arg3);
			return local59 * local91 > 0 && local91 * local75 > 0;
		}
	}

	@OriginalMember(owner = "client!rc", name = "e", descriptor = "(IIII)V")
	public void method1382(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(8) Class10_Sub8 local8 = this.aClass10_Sub8ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 == null) {
			return;
		}
		@Pc(14) Class4 local14 = local8.aClass4_1;
		if (local14 != null) {
			@Pc(23) int local23 = arg1 * 128 + 64;
			@Pc(29) int local29 = arg2 * 128 + 64;
			local14.anInt30 = local23 + (local14.anInt30 - local23) * arg3 / 16;
			local14.anInt22 = local29 + (local14.anInt22 - local29) * arg3 / 16;
		}
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(IIIILclient!oa;IIIIII)V")
	public void method1383(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class10_Sub1_Sub5 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		if (arg4 == null) {
			return;
		}
		@Pc(6) Class4 local6 = new Class4();
		local6.anInt20 = arg9;
		local6.anInt28 = arg10;
		local6.anInt30 = arg1 * 128 + arg7 + 64;
		local6.anInt22 = arg2 * 128 + arg8 + 64;
		local6.anInt21 = arg3;
		local6.aClass10_Sub1_Sub5_1 = arg4;
		local6.anInt23 = arg5;
		local6.anInt17 = arg6;
		for (@Pc(44) int local44 = arg0; local44 >= 0; local44--) {
			if (this.aClass10_Sub8ArrayArrayArray1[local44][arg1][arg2] == null) {
				this.aClass10_Sub8ArrayArrayArray1[local44][arg1][arg2] = new Class10_Sub8(local44, arg1, arg2);
			}
		}
		this.aClass10_Sub8ArrayArrayArray1[arg0][arg1][arg2].aClass4_1 = local6;
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(I)V")
	public void method1384(@OriginalArg(0) int arg0) {
		this.anInt2295 = arg0;
		for (@Pc(4) int local4 = 0; local4 < this.anInt2296; local4++) {
			for (@Pc(7) int local7 = 0; local7 < this.anInt2287; local7++) {
				if (this.aClass10_Sub8ArrayArrayArray1[arg0][local4][local7] == null) {
					this.aClass10_Sub8ArrayArrayArray1[arg0][local4][local7] = new Class10_Sub8(arg0, local4, local7);
				}
			}
		}
	}

	@OriginalMember(owner = "client!rc", name = "m", descriptor = "(III)I")
	public int method1385(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class10_Sub8 local8 = this.aClass10_Sub8ArrayArrayArray1[arg0][arg1][arg2];
		return local8 == null || local8.aClass46_1 == null ? 0 : local8.aClass46_1.anInt1829;
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(Lclient!rb;III)V")
	private void method1386(@OriginalArg(0) Class10_Sub1_Sub5_Sub4 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(14) Class10_Sub8 local14;
		@Pc(29) Class10_Sub1_Sub5_Sub4 local29;
		if (arg2 < this.anInt2296) {
			local14 = this.aClass10_Sub8ArrayArrayArray1[arg1][arg2 + 1][arg3];
			if (local14 != null && local14.aClass46_1 != null && local14.aClass46_1.aClass10_Sub1_Sub5_6 instanceof Class10_Sub1_Sub5_Sub4) {
				local29 = (Class10_Sub1_Sub5_Sub4) local14.aClass46_1.aClass10_Sub1_Sub5_6;
				if (local29.aClass37Array2 != null) {
					this.method1362(arg0, local29, 128, 0, 0, true);
				}
			}
		}
		if (arg3 < this.anInt2296) {
			local14 = this.aClass10_Sub8ArrayArrayArray1[arg1][arg2][arg3 + 1];
			if (local14 != null && local14.aClass46_1 != null && local14.aClass46_1.aClass10_Sub1_Sub5_6 instanceof Class10_Sub1_Sub5_Sub4) {
				local29 = (Class10_Sub1_Sub5_Sub4) local14.aClass46_1.aClass10_Sub1_Sub5_6;
				if (local29.aClass37Array2 != null) {
					this.method1362(arg0, local29, 0, 0, 128, true);
				}
			}
		}
		if (arg2 < this.anInt2296 && arg3 < this.anInt2287) {
			local14 = this.aClass10_Sub8ArrayArrayArray1[arg1][arg2 + 1][arg3 + 1];
			if (local14 != null && local14.aClass46_1 != null && local14.aClass46_1.aClass10_Sub1_Sub5_6 instanceof Class10_Sub1_Sub5_Sub4) {
				local29 = (Class10_Sub1_Sub5_Sub4) local14.aClass46_1.aClass10_Sub1_Sub5_6;
				if (local29.aClass37Array2 != null) {
					this.method1362(arg0, local29, 128, 0, 128, true);
				}
			}
		}
		if (arg2 >= this.anInt2296 || arg3 <= 0) {
			return;
		}
		local14 = this.aClass10_Sub8ArrayArrayArray1[arg1][arg2 + 1][arg3 - 1];
		if (local14 != null && local14.aClass46_1 != null && local14.aClass46_1.aClass10_Sub1_Sub5_6 instanceof Class10_Sub1_Sub5_Sub4) {
			local29 = (Class10_Sub1_Sub5_Sub4) local14.aClass46_1.aClass10_Sub1_Sub5_6;
			if (local29.aClass37Array2 != null) {
				this.method1362(arg0, local29, 128, 0, -128, true);
			}
		}
	}

	@OriginalMember(owner = "client!rc", name = "n", descriptor = "(III)Z")
	private boolean method1387(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < Static85.anInt2282; local1++) {
			@Pc(6) Class49 local6 = Static85.aClass49Array1[local1];
			@Pc(15) int local15;
			@Pc(27) int local27;
			@Pc(37) int local37;
			@Pc(47) int local47;
			@Pc(57) int local57;
			if (local6.anInt2031 == 1) {
				local15 = local6.anInt2043 - arg0;
				if (local15 > 0) {
					local27 = local6.anInt2019 + (local6.anInt2021 * local15 >> 8);
					local37 = local6.anInt2022 + (local6.anInt2040 * local15 >> 8);
					local47 = local6.anInt2039 + (local6.anInt2033 * local15 >> 8);
					local57 = local6.anInt2027 + (local6.anInt2041 * local15 >> 8);
					if (arg2 >= local27 && arg2 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt2031 == 2) {
				local15 = arg0 - local6.anInt2043;
				if (local15 > 0) {
					local27 = local6.anInt2019 + (local6.anInt2021 * local15 >> 8);
					local37 = local6.anInt2022 + (local6.anInt2040 * local15 >> 8);
					local47 = local6.anInt2039 + (local6.anInt2033 * local15 >> 8);
					local57 = local6.anInt2027 + (local6.anInt2041 * local15 >> 8);
					if (arg2 >= local27 && arg2 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt2031 == 3) {
				local15 = local6.anInt2019 - arg2;
				if (local15 > 0) {
					local27 = local6.anInt2043 + (local6.anInt2038 * local15 >> 8);
					local37 = local6.anInt2020 + (local6.anInt2029 * local15 >> 8);
					local47 = local6.anInt2039 + (local6.anInt2033 * local15 >> 8);
					local57 = local6.anInt2027 + (local6.anInt2041 * local15 >> 8);
					if (arg0 >= local27 && arg0 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt2031 == 4) {
				local15 = arg2 - local6.anInt2019;
				if (local15 > 0) {
					local27 = local6.anInt2043 + (local6.anInt2038 * local15 >> 8);
					local37 = local6.anInt2020 + (local6.anInt2029 * local15 >> 8);
					local47 = local6.anInt2039 + (local6.anInt2033 * local15 >> 8);
					local57 = local6.anInt2027 + (local6.anInt2041 * local15 >> 8);
					if (arg0 >= local27 && arg0 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt2031 == 5) {
				local15 = arg1 - local6.anInt2039;
				if (local15 > 0) {
					local27 = local6.anInt2043 + (local6.anInt2038 * local15 >> 8);
					local37 = local6.anInt2020 + (local6.anInt2029 * local15 >> 8);
					local47 = local6.anInt2019 + (local6.anInt2021 * local15 >> 8);
					local57 = local6.anInt2022 + (local6.anInt2040 * local15 >> 8);
					if (arg0 >= local27 && arg0 <= local37 && arg2 >= local47 && arg2 <= local57) {
						return true;
					}
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!rc", name = "c", descriptor = "(II)V")
	public void method1388(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static85.aBoolean101 = true;
		Static85.anInt2293 = arg0;
		Static85.anInt2278 = arg1;
		Static85.anInt2284 = -1;
		Static85.anInt2290 = -1;
	}

	@OriginalMember(owner = "client!rc", name = "o", descriptor = "(III)V")
	public void method1389(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class10_Sub8 local8 = this.aClass10_Sub8ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 != null) {
			local8.aClass24_1 = null;
		}
	}

	@OriginalMember(owner = "client!rc", name = "p", descriptor = "(III)Lclient!kd;")
	public Class34 method1390(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class10_Sub8 local8 = this.aClass10_Sub8ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 == null) {
			return null;
		}
		for (@Pc(14) int local14 = 0; local14 < local8.anInt1435; local14++) {
			@Pc(20) Class34 local20 = local8.aClass34Array1[local14];
			if ((local20.anInt1464 >> 29 & 0x3) == 2 && local20.anInt1462 == arg1 && local20.anInt1461 == arg2) {
				return local20;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!rc", name = "b", descriptor = "(IIIIII)Z")
	private boolean method1391(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(17) int local17;
		@Pc(21) int local21;
		if (arg1 != arg2 || arg3 != arg4) {
			for (local17 = arg1; local17 <= arg2; local17++) {
				for (local21 = arg3; local21 <= arg4; local21++) {
					if (this.anIntArrayArrayArray7[arg0][local17][local21] == -Static85.anInt2283) {
						return false;
					}
				}
			}
			local21 = (arg1 << 7) + 1;
			@Pc(156) int local156 = (arg3 << 7) + 2;
			@Pc(167) int local167 = this.anIntArrayArrayArray6[arg0][arg1][arg3] - arg5;
			if (!this.method1387(local21, local167, local156)) {
				return false;
			}
			@Pc(181) int local181 = (arg2 << 7) - 1;
			if (!this.method1387(local181, local167, local156)) {
				return false;
			}
			@Pc(195) int local195 = (arg4 << 7) - 1;
			if (!this.method1387(local21, local167, local195)) {
				return false;
			} else if (this.method1387(local181, local167, local195)) {
				return true;
			} else {
				return false;
			}
		} else if (this.method1345(arg0, arg1, arg3)) {
			local17 = arg1 << 7;
			local21 = arg3 << 7;
			return this.method1387(local17 + 1, this.anIntArrayArrayArray6[arg0][arg1][arg3] - arg5, local21 + 1) && this.method1387(local17 + 128 - 1, this.anIntArrayArrayArray6[arg0][arg1 + 1][arg3] - arg5, local21 + 1) && this.method1387(local17 + 128 - 1, this.anIntArrayArrayArray6[arg0][arg1 + 1][arg3 + 1] - arg5, local21 + 128 - 1) && this.method1387(local17 + 1, this.anIntArrayArrayArray6[arg0][arg1][arg3 + 1] - arg5, local21 + 128 - 1);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!rc", name = "q", descriptor = "(III)I")
	public int method1392(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class10_Sub8 local8 = this.aClass10_Sub8ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 == null) {
			return 0;
		}
		for (@Pc(14) int local14 = 0; local14 < local8.anInt1435; local14++) {
			@Pc(20) Class34 local20 = local8.aClass34Array1[local14];
			if ((local20.anInt1464 >> 29 & 0x3) == 2 && local20.anInt1462 == arg1 && local20.anInt1461 == arg2) {
				return local20.anInt1464;
			}
		}
		return 0;
	}
}
