import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wa")
public final class Class81 {

	@OriginalMember(owner = "client!wa", name = "l", descriptor = "I")
	private int anInt3259 = 0;

	@OriginalMember(owner = "client!wa", name = "g", descriptor = "[Lclient!te;")
	private final Class70[] aClass70Array3 = new Class70[5000];

	@OriginalMember(owner = "client!wa", name = "L", descriptor = "I")
	private int anInt3280 = 0;

	@OriginalMember(owner = "client!wa", name = "M", descriptor = "[[I")
	private final int[][] anIntArrayArray24 = new int[][] { { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 }, { 12, 8, 4, 0, 13, 9, 5, 1, 14, 10, 6, 2, 15, 11, 7, 3 }, { 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 }, { 3, 7, 11, 15, 2, 6, 10, 14, 1, 5, 9, 13, 0, 4, 8, 12 } };

	@OriginalMember(owner = "client!wa", name = "O", descriptor = "[[I")
	private final int[][] anIntArrayArray25 = new int[][] { new int[16], { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 1 }, { 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0 }, { 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1 }, { 1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 1 } };

	@OriginalMember(owner = "client!wa", name = "G", descriptor = "I")
	private final int anInt3277;

	@OriginalMember(owner = "client!wa", name = "e", descriptor = "I")
	private final int anInt3255;

	@OriginalMember(owner = "client!wa", name = "v", descriptor = "I")
	private final int anInt3267;

	@OriginalMember(owner = "client!wa", name = "A", descriptor = "[[[Lclient!qa;")
	private final Class5_Sub20[][][] aClass5_Sub20ArrayArrayArray1;

	@OriginalMember(owner = "client!wa", name = "j", descriptor = "[[[I")
	private final int[][][] anIntArrayArrayArray7;

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "[[[I")
	private final int[][][] anIntArrayArrayArray6;

	@OriginalMember(owner = "client!wa", name = "<init>", descriptor = "(III[[[I)V")
	public Class81(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[][][] arg3) {
		this.anInt3277 = arg0;
		this.anInt3255 = arg1;
		this.anInt3267 = arg2;
		this.aClass5_Sub20ArrayArrayArray1 = new Class5_Sub20[arg0][arg1][arg2];
		this.anIntArrayArrayArray7 = new int[arg0][arg1 + 1][arg2 + 1];
		this.anIntArrayArrayArray6 = arg3;
		this.method2096();
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(III)Lclient!pd;")
	public Class57 method2069(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class5_Sub20 local8 = this.aClass5_Sub20ArrayArrayArray1[arg0][arg1][arg2];
		return local8 == null ? null : local8.aClass57_1;
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(IIII)I")
	public int method2071(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(8) Class5_Sub20 local8 = this.aClass5_Sub20ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 == null) {
			return -1;
		} else if (local8.aClass57_1 != null && local8.aClass57_1.anInt2444 == arg3) {
			return local8.aClass57_1.anInt2447 & 0xFF;
		} else if (local8.aClass48_1 != null && local8.aClass48_1.anInt1744 == arg3) {
			return local8.aClass48_1.anInt1743 & 0xFF;
		} else if (local8.aClass39_1 != null && local8.aClass39_1.anInt1417 == arg3) {
			return local8.aClass39_1.anInt1416 & 0xFF;
		} else {
			for (@Pc(56) int local56 = 0; local56 < local8.anInt2554; local56++) {
				if (local8.aClass70Array1[local56].anInt3007 == arg3) {
					return local8.aClass70Array1[local56].anInt2996 & 0xFF;
				}
			}
			return -1;
		}
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(IIIIIIIIIIIIIIIIIIII)V")
	public void method2072(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int arg15, @OriginalArg(16) int arg16, @OriginalArg(17) int arg17, @OriginalArg(18) int arg18, @OriginalArg(19) int arg19) {
		@Pc(12) Class27 local12;
		@Pc(14) int local14;
		if (arg3 == 0) {
			local12 = new Class27(arg10, arg11, arg12, arg13, -1, arg18, false);
			for (local14 = arg0; local14 >= 0; local14--) {
				if (this.aClass5_Sub20ArrayArrayArray1[local14][arg1][arg2] == null) {
					this.aClass5_Sub20ArrayArrayArray1[local14][arg1][arg2] = new Class5_Sub20(local14, arg1, arg2);
				}
			}
			this.aClass5_Sub20ArrayArrayArray1[arg0][arg1][arg2].aClass27_1 = local12;
		} else if (arg3 == 1) {
			local12 = new Class27(arg14, arg15, arg16, arg17, arg5, arg19, arg6 == arg7 && arg6 == arg8 && arg6 == arg9);
			for (local14 = arg0; local14 >= 0; local14--) {
				if (this.aClass5_Sub20ArrayArrayArray1[local14][arg1][arg2] == null) {
					this.aClass5_Sub20ArrayArrayArray1[local14][arg1][arg2] = new Class5_Sub20(local14, arg1, arg2);
				}
			}
			this.aClass5_Sub20ArrayArrayArray1[arg0][arg1][arg2].aClass27_1 = local12;
		} else {
			@Pc(140) Class7 local140 = new Class7(arg3, arg4, arg5, arg1, arg2, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17, arg18, arg19);
			for (local14 = arg0; local14 >= 0; local14--) {
				if (this.aClass5_Sub20ArrayArrayArray1[local14][arg1][arg2] == null) {
					this.aClass5_Sub20ArrayArrayArray1[local14][arg1][arg2] = new Class5_Sub20(local14, arg1, arg2);
				}
			}
			this.aClass5_Sub20ArrayArrayArray1[arg0][arg1][arg2].aClass7_1 = local140;
		}
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(Lclient!cb;IIIII)V")
	private void method2073(@OriginalArg(0) Class5_Sub2_Sub2_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(1) boolean local1 = true;
		@Pc(3) int local3 = arg2;
		@Pc(7) int local7 = arg2 + arg4;
		@Pc(11) int local11 = arg3 - 1;
		@Pc(15) int local15 = arg3 + arg5;
		for (@Pc(17) int local17 = arg1; local17 <= arg1 + 1; local17++) {
			if (local17 != this.anInt3277) {
				for (@Pc(24) int local24 = local3; local24 <= local7; local24++) {
					if (local24 >= 0 && local24 < this.anInt3255) {
						for (@Pc(34) int local34 = local11; local34 <= local15; local34++) {
							if (local34 >= 0 && local34 < this.anInt3267 && (!local1 || local24 >= local7 || local34 >= local15 || local34 < arg3 && local24 != arg2)) {
								@Pc(66) Class5_Sub20 local66 = this.aClass5_Sub20ArrayArrayArray1[local17][local24][local34];
								if (local66 != null) {
									@Pc(160) int local160 = (this.anIntArrayArrayArray6[local17][local24][local34] + this.anIntArrayArrayArray6[local17][local24 + 1][local34] + this.anIntArrayArrayArray6[local17][local24][local34 + 1] + this.anIntArrayArrayArray6[local17][local24 + 1][local34 + 1]) / 4 - (this.anIntArrayArrayArray6[arg1][arg2][arg3] + this.anIntArrayArrayArray6[arg1][arg2 + 1][arg3] + this.anIntArrayArrayArray6[arg1][arg2][arg3 + 1] + this.anIntArrayArrayArray6[arg1][arg2 + 1][arg3 + 1]) / 4;
									@Pc(163) Class57 local163 = local66.aClass57_1;
									if (local163 != null) {
										@Pc(173) Class5_Sub2_Sub2_Sub1 local173;
										if (local163.aClass5_Sub2_Sub2_5 instanceof Class5_Sub2_Sub2_Sub1) {
											local173 = (Class5_Sub2_Sub2_Sub1) local163.aClass5_Sub2_Sub2_5;
											Static15.method331(arg0, local173, (local24 - arg2) * 128 + (1 - arg4) * 64, local160, (local34 - arg3) * 128 + (1 - arg5) * 64, local1);
										}
										if (local163.aClass5_Sub2_Sub2_4 instanceof Class5_Sub2_Sub2_Sub1) {
											local173 = (Class5_Sub2_Sub2_Sub1) local163.aClass5_Sub2_Sub2_4;
											Static15.method331(arg0, local173, (local24 - arg2) * 128 + (1 - arg4) * 64, local160, (local34 - arg3) * 128 + (1 - arg5) * 64, local1);
										}
									}
									for (@Pc(237) int local237 = 0; local237 < local66.anInt2554; local237++) {
										@Pc(243) Class70 local243 = local66.aClass70Array1[local237];
										if (local243 != null && local243.aClass5_Sub2_Sub2_9 instanceof Class5_Sub2_Sub2_Sub1) {
											@Pc(253) Class5_Sub2_Sub2_Sub1 local253 = (Class5_Sub2_Sub2_Sub1) local243.aClass5_Sub2_Sub2_9;
											@Pc(261) int local261 = local243.anInt3000 + 1 - local243.anInt3005;
											@Pc(269) int local269 = local243.anInt3002 + 1 - local243.anInt2992;
											Static15.method331(arg0, local253, (local243.anInt3005 - arg2) * 128 + (local261 - arg4) * 64, local160, (local243.anInt2992 - arg3) * 128 + (local269 - arg5) * 64, local1);
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

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(IIIIIIIILclient!mf;IZII)Z")
	private boolean method2074(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) Class5_Sub2_Sub2 arg8, @OriginalArg(9) int arg9, @OriginalArg(10) boolean arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12) {
		for (@Pc(1) int local1 = arg1; local1 < arg1 + arg3; local1++) {
			for (@Pc(4) int local4 = arg2; local4 < arg2 + arg4; local4++) {
				if (local1 < 0 || local4 < 0 || local1 >= this.anInt3255 || local4 >= this.anInt3267) {
					return false;
				}
				@Pc(28) Class5_Sub20 local28 = this.aClass5_Sub20ArrayArrayArray1[arg0][local1][local4];
				if (local28 != null && local28.anInt2554 >= 5) {
					return false;
				}
			}
		}
		@Pc(52) Class70 local52 = new Class70();
		local52.anInt3007 = arg11;
		local52.anInt2996 = arg12;
		local52.anInt2999 = arg0;
		local52.anInt3003 = arg5;
		local52.anInt3009 = arg6;
		local52.anInt2990 = arg7;
		local52.aClass5_Sub2_Sub2_9 = arg8;
		local52.anInt3006 = arg9;
		local52.anInt3005 = arg1;
		local52.anInt2992 = arg2;
		local52.anInt3000 = arg1 + arg3 - 1;
		local52.anInt3002 = arg2 + arg4 - 1;
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
					if (this.aClass5_Sub20ArrayArrayArray1[local130][local98][local101] == null) {
						this.aClass5_Sub20ArrayArrayArray1[local130][local98][local101] = new Class5_Sub20(local130, local98, local101);
					}
				}
				@Pc(166) Class5_Sub20 local166 = this.aClass5_Sub20ArrayArrayArray1[arg0][local98][local101];
				local166.aClass70Array1[local166.anInt2554] = local52;
				local166.anIntArray323[local166.anInt2554] = local104;
				local166.anInt2548 |= local104;
				local166.anInt2554++;
			}
		}
		if (arg10) {
			this.aClass70Array3[this.anInt3280++] = local52;
		}
		return true;
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(IIIILclient!mf;ILclient!mf;Lclient!mf;)V")
	public void method2075(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class5_Sub2_Sub2 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class5_Sub2_Sub2 arg6, @OriginalArg(7) Class5_Sub2_Sub2 arg7) {
		@Pc(3) Class64 local3 = new Class64();
		local3.aClass5_Sub2_Sub2_7 = arg4;
		local3.anInt2718 = arg1 * 128 + 64;
		local3.anInt2712 = arg2 * 128 + 64;
		local3.anInt2713 = arg3;
		local3.anInt2717 = arg5;
		local3.aClass5_Sub2_Sub2_8 = arg6;
		local3.aClass5_Sub2_Sub2_6 = arg7;
		@Pc(34) int local34 = 0;
		@Pc(43) Class5_Sub20 local43 = this.aClass5_Sub20ArrayArrayArray1[arg0][arg1][arg2];
		if (local43 != null) {
			for (@Pc(47) int local47 = 0; local47 < local43.anInt2554; local47++) {
				if ((local43.aClass70Array1[local47].anInt2996 & 0x100) == 256 && local43.aClass70Array1[local47].aClass5_Sub2_Sub2_9 instanceof Class5_Sub2_Sub2_Sub6) {
					@Pc(71) Class5_Sub2_Sub2_Sub6 local71 = (Class5_Sub2_Sub2_Sub6) local43.aClass70Array1[local47].aClass5_Sub2_Sub2_9;
					local71.method2141();
					if (local71.anInt3358 > local34) {
						local34 = local71.anInt3358;
					}
				}
			}
		}
		local3.anInt2722 = local34;
		if (this.aClass5_Sub20ArrayArrayArray1[arg0][arg1][arg2] == null) {
			this.aClass5_Sub20ArrayArrayArray1[arg0][arg1][arg2] = new Class5_Sub20(arg0, arg1, arg2);
		}
		this.aClass5_Sub20ArrayArrayArray1[arg0][arg1][arg2].aClass64_1 = local3;
	}

	@OriginalMember(owner = "client!wa", name = "b", descriptor = "(III)V")
	public void method2076(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class5_Sub20 local8 = this.aClass5_Sub20ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 == null) {
			return;
		}
		for (@Pc(13) int local13 = 0; local13 < local8.anInt2554; local13++) {
			@Pc(19) Class70 local19 = local8.aClass70Array1[local13];
			if ((local19.anInt3007 >> 29 & 0x3) == 2 && local19.anInt3005 == arg1 && local19.anInt2992 == arg2) {
				this.method2097(local19);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!wa", name = "c", descriptor = "(III)V")
	public void method2078(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		Static130.aBoolean119 = true;
		Static130.anInt3275 = arg0;
		Static130.anInt3266 = arg1;
		Static130.anInt3270 = arg2;
		Static130.anInt3256 = -1;
		Static130.anInt3276 = -1;
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(IIIILclient!mf;II)V")
	public void method2079(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class5_Sub2_Sub2 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (arg4 == null) {
			return;
		}
		@Pc(6) Class39 local6 = new Class39();
		local6.aClass5_Sub2_Sub2_1 = arg4;
		local6.anInt1412 = arg1 * 128 + 64;
		local6.anInt1418 = arg2 * 128 + 64;
		local6.anInt1414 = arg3;
		local6.anInt1417 = arg5;
		local6.anInt1416 = arg6;
		if (this.aClass5_Sub20ArrayArrayArray1[arg0][arg1][arg2] == null) {
			this.aClass5_Sub20ArrayArrayArray1[arg0][arg1][arg2] = new Class5_Sub20(arg0, arg1, arg2);
		}
		this.aClass5_Sub20ArrayArrayArray1[arg0][arg1][arg2].aClass39_1 = local6;
	}

	@OriginalMember(owner = "client!wa", name = "d", descriptor = "(III)I")
	public int method2080(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class5_Sub20 local8 = this.aClass5_Sub20ArrayArrayArray1[arg0][arg1][arg2];
		return local8 == null || local8.aClass39_1 == null ? 0 : local8.aClass39_1.anInt1417;
	}

	@OriginalMember(owner = "client!wa", name = "e", descriptor = "(III)Z")
	private boolean method2081(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < Static130.anInt3274; local1++) {
			@Pc(6) Class60 local6 = Static130.aClass60Array1[local1];
			@Pc(15) int local15;
			@Pc(27) int local27;
			@Pc(37) int local37;
			@Pc(47) int local47;
			@Pc(57) int local57;
			if (local6.anInt2602 == 1) {
				local15 = local6.anInt2596 - arg0;
				if (local15 > 0) {
					local27 = local6.anInt2593 + (local6.anInt2592 * local15 >> 8);
					local37 = local6.anInt2587 + (local6.anInt2598 * local15 >> 8);
					local47 = local6.anInt2595 + (local6.anInt2583 * local15 >> 8);
					local57 = local6.anInt2580 + (local6.anInt2597 * local15 >> 8);
					if (arg2 >= local27 && arg2 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt2602 == 2) {
				local15 = arg0 - local6.anInt2596;
				if (local15 > 0) {
					local27 = local6.anInt2593 + (local6.anInt2592 * local15 >> 8);
					local37 = local6.anInt2587 + (local6.anInt2598 * local15 >> 8);
					local47 = local6.anInt2595 + (local6.anInt2583 * local15 >> 8);
					local57 = local6.anInt2580 + (local6.anInt2597 * local15 >> 8);
					if (arg2 >= local27 && arg2 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt2602 == 3) {
				local15 = local6.anInt2593 - arg2;
				if (local15 > 0) {
					local27 = local6.anInt2596 + (local6.anInt2589 * local15 >> 8);
					local37 = local6.anInt2603 + (local6.anInt2600 * local15 >> 8);
					local47 = local6.anInt2595 + (local6.anInt2583 * local15 >> 8);
					local57 = local6.anInt2580 + (local6.anInt2597 * local15 >> 8);
					if (arg0 >= local27 && arg0 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt2602 == 4) {
				local15 = arg2 - local6.anInt2593;
				if (local15 > 0) {
					local27 = local6.anInt2596 + (local6.anInt2589 * local15 >> 8);
					local37 = local6.anInt2603 + (local6.anInt2600 * local15 >> 8);
					local47 = local6.anInt2595 + (local6.anInt2583 * local15 >> 8);
					local57 = local6.anInt2580 + (local6.anInt2597 * local15 >> 8);
					if (arg0 >= local27 && arg0 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt2602 == 5) {
				local15 = arg1 - local6.anInt2595;
				if (local15 > 0) {
					local27 = local6.anInt2596 + (local6.anInt2589 * local15 >> 8);
					local37 = local6.anInt2603 + (local6.anInt2600 * local15 >> 8);
					local47 = local6.anInt2593 + (local6.anInt2592 * local15 >> 8);
					local57 = local6.anInt2587 + (local6.anInt2598 * local15 >> 8);
					if (arg0 >= local27 && arg0 <= local37 && arg2 >= local47 && arg2 <= local57) {
						return true;
					}
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(IIIIILclient!mf;IIIIII)Z")
	public boolean method2082(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) Class5_Sub2_Sub2 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		return arg4 == null ? true : this.method2074(arg0, arg7, arg8, arg9 + 1 - arg7, arg10 - arg8 + 1, arg1, arg2, arg3, arg4, arg5, true, arg6, 0);
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(Lclient!qa;Z)V")
	private void method2083(@OriginalArg(0) Class5_Sub20 arg0, @OriginalArg(1) boolean arg1) {
		Static130.aClass58_72.method1663(arg0);
		while (true) {
			@Pc(8) Class5_Sub20 local8;
			@Pc(17) int local17;
			@Pc(20) int local20;
			@Pc(23) int local23;
			@Pc(26) int local26;
			@Pc(31) Class5_Sub20[][] local31;
			@Pc(49) Class5_Sub20 local49;
			@Pc(251) int local251;
			@Pc(592) int local592;
			@Pc(597) int local597;
			@Pc(602) int local602;
			@Pc(919) Class57 local919;
			@Pc(1093) int local1093;
			@Pc(978) int local978;
			do {
				do {
					do {
						do {
							do {
								do {
									while (true) {
										@Pc(257) Class70 var12;
										@Pc(605) int var17;
										@Pc(614) int var18;
										@Pc(626) int var19;
										@Pc(345) int var21;
										@Pc(289) boolean var22;
										@Pc(800) Class5_Sub20 var33;
										while (true) {
											do {
												local8 = (Class5_Sub20) Static130.aClass58_72.method1670();
												if (local8 == null) {
													return;
												}
											} while (!local8.aBoolean92);
											local17 = local8.anInt2552;
											local20 = local8.anInt2556;
											local23 = local8.anInt2550;
											local26 = local8.anInt2558;
											local31 = this.aClass5_Sub20ArrayArrayArray1[local23];
											if (!local8.aBoolean94) {
												break;
											}
											if (arg1) {
												if (local23 > 0) {
													local49 = this.aClass5_Sub20ArrayArrayArray1[local23 - 1][local17][local20];
													if (local49 != null && local49.aBoolean92) {
														continue;
													}
												}
												if (local17 <= Static130.anInt3278 && local17 > Static130.anInt3269) {
													local49 = local31[local17 - 1][local20];
													if (local49 != null && local49.aBoolean92 && (local49.aBoolean94 || (local8.anInt2548 & 0x1) == 0)) {
														continue;
													}
												}
												if (local17 >= Static130.anInt3278 && local17 < Static130.anInt3257 - 1) {
													local49 = local31[local17 + 1][local20];
													if (local49 != null && local49.aBoolean92 && (local49.aBoolean94 || (local8.anInt2548 & 0x4) == 0)) {
														continue;
													}
												}
												if (local20 <= Static130.anInt3273 && local20 > Static130.anInt3265) {
													local49 = local31[local17][local20 - 1];
													if (local49 != null && local49.aBoolean92 && (local49.aBoolean94 || (local8.anInt2548 & 0x8) == 0)) {
														continue;
													}
												}
												if (local20 >= Static130.anInt3273 && local20 < Static130.anInt3258 - 1) {
													local49 = local31[local17][local20 + 1];
													if (local49 != null && local49.aBoolean92 && (local49.aBoolean94 || (local8.anInt2548 & 0x2) == 0)) {
														continue;
													}
												}
											} else {
												arg1 = true;
											}
											local8.aBoolean94 = false;
											if (local8.aClass5_Sub20_1 != null) {
												local49 = local8.aClass5_Sub20_1;
												if (local49.aClass27_1 == null) {
													if (local49.aClass7_1 != null && !this.method2111(0, local17, local20)) {
														this.method2105(local49.aClass7_1, Static130.anInt3264, Static130.anInt3279, Static130.anInt3281, Static130.anInt3260, local17, local20);
													}
												} else if (!this.method2111(0, local17, local20)) {
													this.method2100(local49.aClass27_1, 0, Static130.anInt3264, Static130.anInt3279, Static130.anInt3281, Static130.anInt3260, local17, local20);
												}
												@Pc(225) Class57 local225 = local49.aClass57_1;
												if (local225 != null) {
													local225.aClass5_Sub2_Sub2_5.method2179(0, Static130.anInt3264, Static130.anInt3279, Static130.anInt3281, Static130.anInt3260, local225.anInt2453 - Static130.anInt3262, local225.anInt2439 - Static130.anInt3261, local225.anInt2440 - Static130.anInt3263, local225.anInt2444);
												}
												for (local251 = 0; local251 < local49.anInt2554; local251++) {
													var12 = local49.aClass70Array1[local251];
													if (var12 != null) {
														var12.aClass5_Sub2_Sub2_9.method2179(var12.anInt3006, Static130.anInt3264, Static130.anInt3279, Static130.anInt3281, Static130.anInt3260, var12.anInt3003 - Static130.anInt3262, var12.anInt2990 - Static130.anInt3261, var12.anInt3009 - Static130.anInt3263, var12.anInt3007);
													}
												}
											}
											var22 = false;
											if (local8.aClass27_1 == null) {
												if (local8.aClass7_1 != null && !this.method2111(local26, local17, local20)) {
													var22 = true;
													this.method2105(local8.aClass7_1, Static130.anInt3264, Static130.anInt3279, Static130.anInt3281, Static130.anInt3260, local17, local20);
												}
											} else if (!this.method2111(local26, local17, local20)) {
												var22 = true;
												if (local8.aClass27_1.anInt1064 != 12345678 || Static130.aBoolean119 && local23 <= Static130.anInt3275) {
													this.method2100(local8.aClass27_1, local26, Static130.anInt3264, Static130.anInt3279, Static130.anInt3281, Static130.anInt3260, local17, local20);
												}
											}
											var21 = 0;
											local251 = 0;
											@Pc(350) Class57 local350 = local8.aClass57_1;
											@Pc(353) Class48 local353 = local8.aClass48_1;
											if (local350 != null || local353 != null) {
												if (Static130.anInt3278 == local17) {
													var21++;
												} else if (Static130.anInt3278 < local17) {
													var21 += 2;
												}
												if (Static130.anInt3273 == local20) {
													var21 += 3;
												} else if (Static130.anInt3273 > local20) {
													var21 += 6;
												}
												local251 = Static130.anIntArray400[var21];
												local8.anInt2557 = Static130.anIntArray403[var21];
											}
											if (local350 != null) {
												if ((local350.anInt2448 & Static130.anIntArray404[var21]) == 0) {
													local8.anInt2551 = 0;
												} else if (local350.anInt2448 == 16) {
													local8.anInt2551 = 3;
													local8.anInt2549 = Static130.anIntArray402[var21];
													local8.anInt2546 = 3 - local8.anInt2549;
												} else if (local350.anInt2448 == 32) {
													local8.anInt2551 = 6;
													local8.anInt2549 = Static130.anIntArray399[var21];
													local8.anInt2546 = 6 - local8.anInt2549;
												} else if (local350.anInt2448 == 64) {
													local8.anInt2551 = 12;
													local8.anInt2549 = Static130.anIntArray401[var21];
													local8.anInt2546 = 12 - local8.anInt2549;
												} else {
													local8.anInt2551 = 9;
													local8.anInt2549 = Static130.anIntArray398[var21];
													local8.anInt2546 = 9 - local8.anInt2549;
												}
												if ((local350.anInt2448 & local251) != 0 && !this.method2090(local26, local17, local20, local350.anInt2448)) {
													local350.aClass5_Sub2_Sub2_5.method2179(0, Static130.anInt3264, Static130.anInt3279, Static130.anInt3281, Static130.anInt3260, local350.anInt2453 - Static130.anInt3262, local350.anInt2439 - Static130.anInt3261, local350.anInt2440 - Static130.anInt3263, local350.anInt2444);
												}
												if ((local350.anInt2452 & local251) != 0 && !this.method2090(local26, local17, local20, local350.anInt2452)) {
													local350.aClass5_Sub2_Sub2_4.method2179(0, Static130.anInt3264, Static130.anInt3279, Static130.anInt3281, Static130.anInt3260, local350.anInt2453 - Static130.anInt3262, local350.anInt2439 - Static130.anInt3261, local350.anInt2440 - Static130.anInt3263, local350.anInt2444);
												}
											}
											if (local353 != null && !this.method2102(local26, local17, local20, local353.aClass5_Sub2_Sub2_2.anInt3358)) {
												if ((local353.anInt1748 & local251) != 0) {
													local353.aClass5_Sub2_Sub2_2.method2179(0, Static130.anInt3264, Static130.anInt3279, Static130.anInt3281, Static130.anInt3260, local353.anInt1746 + local353.anInt1749 - Static130.anInt3262, local353.anInt1736 - Static130.anInt3261, local353.anInt1742 + local353.anInt1739 - Static130.anInt3263, local353.anInt1744);
												} else if (local353.anInt1748 == 256) {
													local592 = local353.anInt1746 - Static130.anInt3262;
													local597 = local353.anInt1736 - Static130.anInt3261;
													local602 = local353.anInt1742 - Static130.anInt3263;
													var17 = local353.anInt1741;
													if (var17 == 1 || var17 == 2) {
														var18 = -local592;
													} else {
														var18 = local592;
													}
													if (var17 == 2 || var17 == 3) {
														var19 = -local602;
													} else {
														var19 = local602;
													}
													if (var19 < var18) {
														local353.aClass5_Sub2_Sub2_2.method2179(0, Static130.anInt3264, Static130.anInt3279, Static130.anInt3281, Static130.anInt3260, local592 + local353.anInt1749, local597, local602 + local353.anInt1739, local353.anInt1744);
													} else if (local353.aClass5_Sub2_Sub2_3 != null) {
														local353.aClass5_Sub2_Sub2_3.method2179(0, Static130.anInt3264, Static130.anInt3279, Static130.anInt3281, Static130.anInt3260, local592, local597, local602, local353.anInt1744);
													}
												}
											}
											if (var22) {
												@Pc(673) Class39 local673 = local8.aClass39_1;
												if (local673 != null) {
													local673.aClass5_Sub2_Sub2_1.method2179(0, Static130.anInt3264, Static130.anInt3279, Static130.anInt3281, Static130.anInt3260, local673.anInt1412 - Static130.anInt3262, local673.anInt1414 - Static130.anInt3261, local673.anInt1418 - Static130.anInt3263, local673.anInt1417);
												}
												@Pc(700) Class64 local700 = local8.aClass64_1;
												if (local700 != null && local700.anInt2722 == 0) {
													if (local700.aClass5_Sub2_Sub2_8 != null) {
														local700.aClass5_Sub2_Sub2_8.method2179(0, Static130.anInt3264, Static130.anInt3279, Static130.anInt3281, Static130.anInt3260, local700.anInt2718 - Static130.anInt3262, local700.anInt2713 - Static130.anInt3261, local700.anInt2712 - Static130.anInt3263, local700.anInt2717);
													}
													if (local700.aClass5_Sub2_Sub2_6 != null) {
														local700.aClass5_Sub2_Sub2_6.method2179(0, Static130.anInt3264, Static130.anInt3279, Static130.anInt3281, Static130.anInt3260, local700.anInt2718 - Static130.anInt3262, local700.anInt2713 - Static130.anInt3261, local700.anInt2712 - Static130.anInt3263, local700.anInt2717);
													}
													if (local700.aClass5_Sub2_Sub2_7 != null) {
														local700.aClass5_Sub2_Sub2_7.method2179(0, Static130.anInt3264, Static130.anInt3279, Static130.anInt3281, Static130.anInt3260, local700.anInt2718 - Static130.anInt3262, local700.anInt2713 - Static130.anInt3261, local700.anInt2712 - Static130.anInt3263, local700.anInt2717);
													}
												}
											}
											local592 = local8.anInt2548;
											if (local592 != 0) {
												if (local17 < Static130.anInt3278 && (local592 & 0x4) != 0) {
													var33 = local31[local17 + 1][local20];
													if (var33 != null && var33.aBoolean92) {
														Static130.aClass58_72.method1663(var33);
													}
												}
												if (local20 < Static130.anInt3273 && (local592 & 0x2) != 0) {
													var33 = local31[local17][local20 + 1];
													if (var33 != null && var33.aBoolean92) {
														Static130.aClass58_72.method1663(var33);
													}
												}
												if (local17 > Static130.anInt3278 && (local592 & 0x1) != 0) {
													var33 = local31[local17 - 1][local20];
													if (var33 != null && var33.aBoolean92) {
														Static130.aClass58_72.method1663(var33);
													}
												}
												if (local20 > Static130.anInt3273 && (local592 & 0x8) != 0) {
													var33 = local31[local17][local20 - 1];
													if (var33 != null && var33.aBoolean92) {
														Static130.aClass58_72.method1663(var33);
													}
												}
											}
											break;
										}
										if (local8.anInt2551 != 0) {
											var22 = true;
											for (var21 = 0; var21 < local8.anInt2554; var21++) {
												if (local8.aClass70Array1[var21].anInt2991 != Static130.anInt3254 && (local8.anIntArray323[var21] & local8.anInt2551) == local8.anInt2549) {
													var22 = false;
													break;
												}
											}
											if (var22) {
												local919 = local8.aClass57_1;
												if (!this.method2090(local26, local17, local20, local919.anInt2448)) {
													local919.aClass5_Sub2_Sub2_5.method2179(0, Static130.anInt3264, Static130.anInt3279, Static130.anInt3281, Static130.anInt3260, local919.anInt2453 - Static130.anInt3262, local919.anInt2439 - Static130.anInt3261, local919.anInt2440 - Static130.anInt3263, local919.anInt2444);
												}
												local8.anInt2551 = 0;
											}
										}
										if (!local8.aBoolean93) {
											break;
										}
										try {
											@Pc(958) int local958 = local8.anInt2554;
											local8.aBoolean93 = false;
											var21 = 0;
											label558: for (local251 = 0; local251 < local958; local251++) {
												var12 = local8.aClass70Array1[local251];
												if (var12.anInt2991 != Static130.anInt3254) {
													for (local978 = var12.anInt3005; local978 <= var12.anInt3000; local978++) {
														for (local592 = var12.anInt2992; local592 <= var12.anInt3002; local592++) {
															var33 = local31[local978][local592];
															if (var33.aBoolean94) {
																local8.aBoolean93 = true;
																continue label558;
															}
															if (var33.anInt2551 != 0) {
																local602 = 0;
																if (local978 > var12.anInt3005) {
																	local602++;
																}
																if (local978 < var12.anInt3000) {
																	local602 += 4;
																}
																if (local592 > var12.anInt2992) {
																	local602 += 8;
																}
																if (local592 < var12.anInt3002) {
																	local602 += 2;
																}
																if ((local602 & var33.anInt2551) == local8.anInt2546) {
																	local8.aBoolean93 = true;
																	continue label558;
																}
															}
														}
													}
													Static130.aClass70Array2[var21++] = var12;
													local592 = Static130.anInt3278 - var12.anInt3005;
													local597 = var12.anInt3000 - Static130.anInt3278;
													if (local597 > local592) {
														local592 = local597;
													}
													local602 = Static130.anInt3273 - var12.anInt2992;
													var17 = var12.anInt3002 - Static130.anInt3273;
													if (var17 > local602) {
														var12.anInt2994 = local592 + var17;
													} else {
														var12.anInt2994 = local592 + local602;
													}
												}
											}
											while (var21 > 0) {
												local1093 = -50;
												local978 = -1;
												@Pc(1102) Class70 local1102;
												for (local592 = 0; local592 < var21; local592++) {
													local1102 = Static130.aClass70Array2[local592];
													if (local1102.anInt2991 != Static130.anInt3254) {
														if (local1102.anInt2994 > local1093) {
															local1093 = local1102.anInt2994;
															local978 = local592;
														} else if (local1102.anInt2994 == local1093) {
															local602 = local1102.anInt3003 - Static130.anInt3262;
															var17 = local1102.anInt3009 - Static130.anInt3263;
															var18 = Static130.aClass70Array2[local978].anInt3003 - Static130.anInt3262;
															var19 = Static130.aClass70Array2[local978].anInt3009 - Static130.anInt3263;
															if (local602 * local602 + var17 * var17 > var18 * var18 + var19 * var19) {
																local978 = local592;
															}
														}
													}
												}
												if (local978 == -1) {
													break;
												}
												local1102 = Static130.aClass70Array2[local978];
												local1102.anInt2991 = Static130.anInt3254;
												if (!this.method2109(local26, local1102.anInt3005, local1102.anInt3000, local1102.anInt2992, local1102.anInt3002, local1102.aClass5_Sub2_Sub2_9.anInt3358)) {
													local1102.aClass5_Sub2_Sub2_9.method2179(local1102.anInt3006, Static130.anInt3264, Static130.anInt3279, Static130.anInt3281, Static130.anInt3260, local1102.anInt3003 - Static130.anInt3262, local1102.anInt2990 - Static130.anInt3261, local1102.anInt3009 - Static130.anInt3263, local1102.anInt3007);
												}
												for (local602 = local1102.anInt3005; local602 <= local1102.anInt3000; local602++) {
													for (var17 = local1102.anInt2992; var17 <= local1102.anInt3002; var17++) {
														@Pc(1227) Class5_Sub20 local1227 = local31[local602][var17];
														if (local1227.anInt2551 != 0) {
															Static130.aClass58_72.method1663(local1227);
														} else if ((local602 != local17 || var17 != local20) && local1227.aBoolean92) {
															Static130.aClass58_72.method1663(local1227);
														}
													}
												}
											}
											if (!local8.aBoolean93) {
												break;
											}
										} catch (@Pc(1265) Exception local1265) {
											local8.aBoolean93 = false;
											break;
										}
									}
								} while (!local8.aBoolean92);
							} while (local8.anInt2551 != 0);
							if (local17 > Static130.anInt3278 || local17 <= Static130.anInt3269) {
								break;
							}
							local49 = local31[local17 - 1][local20];
						} while (local49 != null && local49.aBoolean92);
						if (local17 < Static130.anInt3278 || local17 >= Static130.anInt3257 - 1) {
							break;
						}
						local49 = local31[local17 + 1][local20];
					} while (local49 != null && local49.aBoolean92);
					if (local20 > Static130.anInt3273 || local20 <= Static130.anInt3265) {
						break;
					}
					local49 = local31[local17][local20 - 1];
				} while (local49 != null && local49.aBoolean92);
				if (local20 < Static130.anInt3273 || local20 >= Static130.anInt3258 - 1) {
					break;
				}
				local49 = local31[local17][local20 + 1];
			} while (local49 != null && local49.aBoolean92);
			local8.aBoolean92 = false;
			Static130.anInt3271--;
			@Pc(1369) Class64 local1369 = local8.aClass64_1;
			if (local1369 != null && local1369.anInt2722 != 0) {
				if (local1369.aClass5_Sub2_Sub2_8 != null) {
					local1369.aClass5_Sub2_Sub2_8.method2179(0, Static130.anInt3264, Static130.anInt3279, Static130.anInt3281, Static130.anInt3260, local1369.anInt2718 - Static130.anInt3262, local1369.anInt2713 - Static130.anInt3261 - local1369.anInt2722, local1369.anInt2712 - Static130.anInt3263, local1369.anInt2717);
				}
				if (local1369.aClass5_Sub2_Sub2_6 != null) {
					local1369.aClass5_Sub2_Sub2_6.method2179(0, Static130.anInt3264, Static130.anInt3279, Static130.anInt3281, Static130.anInt3260, local1369.anInt2718 - Static130.anInt3262, local1369.anInt2713 - Static130.anInt3261 - local1369.anInt2722, local1369.anInt2712 - Static130.anInt3263, local1369.anInt2717);
				}
				if (local1369.aClass5_Sub2_Sub2_7 != null) {
					local1369.aClass5_Sub2_Sub2_7.method2179(0, Static130.anInt3264, Static130.anInt3279, Static130.anInt3281, Static130.anInt3260, local1369.anInt2718 - Static130.anInt3262, local1369.anInt2713 - Static130.anInt3261 - local1369.anInt2722, local1369.anInt2712 - Static130.anInt3263, local1369.anInt2717);
				}
			}
			if (local8.anInt2557 != 0) {
				@Pc(1464) Class48 local1464 = local8.aClass48_1;
				if (local1464 != null && !this.method2102(local26, local17, local20, local1464.aClass5_Sub2_Sub2_2.anInt3358)) {
					if ((local1464.anInt1748 & local8.anInt2557) != 0) {
						local1464.aClass5_Sub2_Sub2_2.method2179(0, Static130.anInt3264, Static130.anInt3279, Static130.anInt3281, Static130.anInt3260, local1464.anInt1746 + local1464.anInt1749 - Static130.anInt3262, local1464.anInt1736 - Static130.anInt3261, local1464.anInt1742 + local1464.anInt1739 - Static130.anInt3263, local1464.anInt1744);
					} else if (local1464.anInt1748 == 256) {
						local251 = local1464.anInt1746 - Static130.anInt3262;
						local1093 = local1464.anInt1736 - Static130.anInt3261;
						local978 = local1464.anInt1742 - Static130.anInt3263;
						local592 = local1464.anInt1741;
						if (local592 == 1 || local592 == 2) {
							local597 = -local251;
						} else {
							local597 = local251;
						}
						if (local592 == 2 || local592 == 3) {
							local602 = -local978;
						} else {
							local602 = local978;
						}
						if (local602 >= local597) {
							local1464.aClass5_Sub2_Sub2_2.method2179(0, Static130.anInt3264, Static130.anInt3279, Static130.anInt3281, Static130.anInt3260, local251 + local1464.anInt1749, local1093, local978 + local1464.anInt1739, local1464.anInt1744);
						} else if (local1464.aClass5_Sub2_Sub2_3 != null) {
							local1464.aClass5_Sub2_Sub2_3.method2179(0, Static130.anInt3264, Static130.anInt3279, Static130.anInt3281, Static130.anInt3260, local251, local1093, local978, local1464.anInt1744);
						}
					}
				}
				local919 = local8.aClass57_1;
				if (local919 != null) {
					if ((local919.anInt2452 & local8.anInt2557) != 0 && !this.method2090(local26, local17, local20, local919.anInt2452)) {
						local919.aClass5_Sub2_Sub2_4.method2179(0, Static130.anInt3264, Static130.anInt3279, Static130.anInt3281, Static130.anInt3260, local919.anInt2453 - Static130.anInt3262, local919.anInt2439 - Static130.anInt3261, local919.anInt2440 - Static130.anInt3263, local919.anInt2444);
					}
					if ((local919.anInt2448 & local8.anInt2557) != 0 && !this.method2090(local26, local17, local20, local919.anInt2448)) {
						local919.aClass5_Sub2_Sub2_5.method2179(0, Static130.anInt3264, Static130.anInt3279, Static130.anInt3281, Static130.anInt3260, local919.anInt2453 - Static130.anInt3262, local919.anInt2439 - Static130.anInt3261, local919.anInt2440 - Static130.anInt3263, local919.anInt2444);
					}
				}
			}
			@Pc(1689) Class5_Sub20 local1689;
			if (local23 < this.anInt3277 - 1) {
				local1689 = this.aClass5_Sub20ArrayArrayArray1[local23 + 1][local17][local20];
				if (local1689 != null && local1689.aBoolean92) {
					Static130.aClass58_72.method1663(local1689);
				}
			}
			if (local17 < Static130.anInt3278) {
				local1689 = local31[local17 + 1][local20];
				if (local1689 != null && local1689.aBoolean92) {
					Static130.aClass58_72.method1663(local1689);
				}
			}
			if (local20 < Static130.anInt3273) {
				local1689 = local31[local17][local20 + 1];
				if (local1689 != null && local1689.aBoolean92) {
					Static130.aClass58_72.method1663(local1689);
				}
			}
			if (local17 > Static130.anInt3278) {
				local1689 = local31[local17 - 1][local20];
				if (local1689 != null && local1689.aBoolean92) {
					Static130.aClass58_72.method1663(local1689);
				}
			}
			if (local20 > Static130.anInt3273) {
				local1689 = local31[local17][local20 - 1];
				if (local1689 != null && local1689.aBoolean92) {
					Static130.aClass58_72.method1663(local1689);
				}
			}
		}
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "()V")
	private void method2084() {
		@Pc(3) int local3 = Static130.anIntArray397[Static130.anInt3272];
		@Pc(7) Class60[] local7 = Static130.aClass60ArrayArray1[Static130.anInt3272];
		Static130.anInt3274 = 0;
		for (@Pc(11) int local11 = 0; local11 < local3; local11++) {
			@Pc(16) Class60 local16 = local7[local11];
			@Pc(27) int local27;
			@Pc(40) int local40;
			@Pc(51) int local51;
			@Pc(79) int local79;
			@Pc(58) boolean local58;
			if (local16.anInt2581 == 1) {
				local27 = local16.anInt2591 + 25 - Static130.anInt3278;
				if (local27 >= 0 && local27 <= 50) {
					local40 = local16.anInt2590 + 25 - Static130.anInt3273;
					if (local40 < 0) {
						local40 = 0;
					}
					local51 = local16.anInt2594 + 25 - Static130.anInt3273;
					if (local51 > 50) {
						local51 = 50;
					}
					local58 = false;
					while (local40 <= local51) {
						if (Static130.aBooleanArrayArray1[local27][local40++]) {
							local58 = true;
							break;
						}
					}
					if (local58) {
						local79 = Static130.anInt3262 - local16.anInt2596;
						if (local79 > 32) {
							local16.anInt2602 = 1;
						} else {
							if (local79 >= -32) {
								continue;
							}
							local16.anInt2602 = 2;
							local79 = -local79;
						}
						local16.anInt2592 = (local16.anInt2593 - Static130.anInt3263 << 8) / local79;
						local16.anInt2598 = (local16.anInt2587 - Static130.anInt3263 << 8) / local79;
						local16.anInt2583 = (local16.anInt2595 - Static130.anInt3261 << 8) / local79;
						local16.anInt2597 = (local16.anInt2580 - Static130.anInt3261 << 8) / local79;
						Static130.aClass60Array1[Static130.anInt3274++] = local16;
					}
				}
			} else if (local16.anInt2581 == 2) {
				local27 = local16.anInt2590 + 25 - Static130.anInt3273;
				if (local27 >= 0 && local27 <= 50) {
					local40 = local16.anInt2591 + 25 - Static130.anInt3278;
					if (local40 < 0) {
						local40 = 0;
					}
					local51 = local16.anInt2588 + 25 - Static130.anInt3278;
					if (local51 > 50) {
						local51 = 50;
					}
					local58 = false;
					while (local40 <= local51) {
						if (Static130.aBooleanArrayArray1[local40++][local27]) {
							local58 = true;
							break;
						}
					}
					if (local58) {
						local79 = Static130.anInt3263 - local16.anInt2593;
						if (local79 > 32) {
							local16.anInt2602 = 3;
						} else {
							if (local79 >= -32) {
								continue;
							}
							local16.anInt2602 = 4;
							local79 = -local79;
						}
						local16.anInt2589 = (local16.anInt2596 - Static130.anInt3262 << 8) / local79;
						local16.anInt2600 = (local16.anInt2603 - Static130.anInt3262 << 8) / local79;
						local16.anInt2583 = (local16.anInt2595 - Static130.anInt3261 << 8) / local79;
						local16.anInt2597 = (local16.anInt2580 - Static130.anInt3261 << 8) / local79;
						Static130.aClass60Array1[Static130.anInt3274++] = local16;
					}
				}
			} else if (local16.anInt2581 == 4) {
				local27 = local16.anInt2595 - Static130.anInt3261;
				if (local27 > 128) {
					local40 = local16.anInt2590 + 25 - Static130.anInt3273;
					if (local40 < 0) {
						local40 = 0;
					}
					local51 = local16.anInt2594 + 25 - Static130.anInt3273;
					if (local51 > 50) {
						local51 = 50;
					}
					if (local40 <= local51) {
						@Pc(319) int local319 = local16.anInt2591 + 25 - Static130.anInt3278;
						if (local319 < 0) {
							local319 = 0;
						}
						local79 = local16.anInt2588 + 25 - Static130.anInt3278;
						if (local79 > 50) {
							local79 = 50;
						}
						@Pc(337) boolean local337 = false;
						label142: for (@Pc(339) int local339 = local319; local339 <= local79; local339++) {
							for (@Pc(342) int local342 = local40; local342 <= local51; local342++) {
								if (Static130.aBooleanArrayArray1[local339][local342]) {
									local337 = true;
									break label142;
								}
							}
						}
						if (local337) {
							local16.anInt2602 = 5;
							local16.anInt2589 = (local16.anInt2596 - Static130.anInt3262 << 8) / local27;
							local16.anInt2600 = (local16.anInt2603 - Static130.anInt3262 << 8) / local27;
							local16.anInt2592 = (local16.anInt2593 - Static130.anInt3263 << 8) / local27;
							local16.anInt2598 = (local16.anInt2587 - Static130.anInt3263 << 8) / local27;
							Static130.aClass60Array1[Static130.anInt3274++] = local16;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!wa", name = "b", descriptor = "(II)V")
	public void method2085(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class5_Sub20 local8 = this.aClass5_Sub20ArrayArrayArray1[0][arg0][arg1];
		for (@Pc(10) int local10 = 0; local10 < 3; local10++) {
			@Pc(31) Class5_Sub20 local31 = this.aClass5_Sub20ArrayArrayArray1[local10][arg0][arg1] = this.aClass5_Sub20ArrayArrayArray1[local10 + 1][arg0][arg1];
			if (local31 != null) {
				local31.anInt2550--;
				for (@Pc(41) int local41 = 0; local41 < local31.anInt2554; local41++) {
					@Pc(47) Class70 local47 = local31.aClass70Array1[local41];
					if ((local47.anInt3007 >> 29 & 0x3) == 2 && local47.anInt3005 == arg0 && local47.anInt2992 == arg1) {
						local47.anInt2999--;
					}
				}
			}
		}
		if (this.aClass5_Sub20ArrayArrayArray1[0][arg0][arg1] == null) {
			this.aClass5_Sub20ArrayArrayArray1[0][arg0][arg1] = new Class5_Sub20(0, arg0, arg1);
		}
		this.aClass5_Sub20ArrayArrayArray1[0][arg0][arg1].aClass5_Sub20_1 = local8;
		this.aClass5_Sub20ArrayArrayArray1[3][arg0][arg1] = null;
	}

	@OriginalMember(owner = "client!wa", name = "f", descriptor = "(III)Lclient!te;")
	public Class70 method2086(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class5_Sub20 local8 = this.aClass5_Sub20ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 == null) {
			return null;
		}
		for (@Pc(14) int local14 = 0; local14 < local8.anInt2554; local14++) {
			@Pc(20) Class70 local20 = local8.aClass70Array1[local14];
			if ((local20.anInt3007 >> 29 & 0x3) == 2 && local20.anInt3005 == arg1 && local20.anInt2992 == arg2) {
				return local20;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!wa", name = "g", descriptor = "(III)V")
	public void method2087() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt3277; local1++) {
			for (@Pc(4) int local4 = 0; local4 < this.anInt3255; local4++) {
				for (@Pc(7) int local7 = 0; local7 < this.anInt3267; local7++) {
					@Pc(17) Class5_Sub20 local17 = this.aClass5_Sub20ArrayArrayArray1[local1][local4][local7];
					if (local17 != null) {
						@Pc(22) Class57 local22 = local17.aClass57_1;
						if (local22 != null && local22.aClass5_Sub2_Sub2_5 instanceof Class5_Sub2_Sub2_Sub1) {
							@Pc(32) Class5_Sub2_Sub2_Sub1 local32 = (Class5_Sub2_Sub2_Sub1) local22.aClass5_Sub2_Sub2_5;
							this.method2073(local32, local1, local4, local7, 1, 1);
							if (local22.aClass5_Sub2_Sub2_4 instanceof Class5_Sub2_Sub2_Sub1) {
								@Pc(48) Class5_Sub2_Sub2_Sub1 local48 = (Class5_Sub2_Sub2_Sub1) local22.aClass5_Sub2_Sub2_4;
								this.method2073(local48, local1, local4, local7, 1, 1);
								Static15.method331(local32, local48, 0, 0, 0, false);
								local22.aClass5_Sub2_Sub2_4 = local48.method342(local48.aShort1, local48.aShort2, -50, -10, -50);
							}
							local22.aClass5_Sub2_Sub2_5 = local32.method342(local32.aShort1, local32.aShort2, -50, -10, -50);
						}
						@Pc(103) Class5_Sub2_Sub2_Sub1 local103;
						for (@Pc(87) int local87 = 0; local87 < local17.anInt2554; local87++) {
							@Pc(93) Class70 local93 = local17.aClass70Array1[local87];
							if (local93 != null && local93.aClass5_Sub2_Sub2_9 instanceof Class5_Sub2_Sub2_Sub1) {
								local103 = (Class5_Sub2_Sub2_Sub1) local93.aClass5_Sub2_Sub2_9;
								this.method2073(local103, local1, local4, local7, local93.anInt3000 + 1 - local93.anInt3005, local93.anInt3002 - local93.anInt2992 + 1);
								local93.aClass5_Sub2_Sub2_9 = local103.method342(local103.aShort1, local103.aShort2, -50, -10, -50);
							}
						}
						@Pc(142) Class39 local142 = local17.aClass39_1;
						if (local142 != null && local142.aClass5_Sub2_Sub2_1 instanceof Class5_Sub2_Sub2_Sub1) {
							local103 = (Class5_Sub2_Sub2_Sub1) local142.aClass5_Sub2_Sub2_1;
							this.method2089(local103, local1, local4, local7);
							local142.aClass5_Sub2_Sub2_1 = local103.method342(local103.aShort1, local103.aShort2, -50, -10, -50);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!wa", name = "b", descriptor = "(IIII)V")
	public void method2088(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(8) Class5_Sub20 local8 = this.aClass5_Sub20ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 != null) {
			this.aClass5_Sub20ArrayArrayArray1[arg0][arg1][arg2].anInt2555 = arg3;
		}
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(Lclient!cb;III)V")
	private void method2089(@OriginalArg(0) Class5_Sub2_Sub2_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(14) Class5_Sub20 local14;
		@Pc(29) Class5_Sub2_Sub2_Sub1 local29;
		if (arg2 < this.anInt3255) {
			local14 = this.aClass5_Sub20ArrayArrayArray1[arg1][arg2 + 1][arg3];
			if (local14 != null && local14.aClass39_1 != null && local14.aClass39_1.aClass5_Sub2_Sub2_1 instanceof Class5_Sub2_Sub2_Sub1) {
				local29 = (Class5_Sub2_Sub2_Sub1) local14.aClass39_1.aClass5_Sub2_Sub2_1;
				Static15.method331(arg0, local29, 128, 0, 0, true);
			}
		}
		if (arg3 < this.anInt3255) {
			local14 = this.aClass5_Sub20ArrayArrayArray1[arg1][arg2][arg3 + 1];
			if (local14 != null && local14.aClass39_1 != null && local14.aClass39_1.aClass5_Sub2_Sub2_1 instanceof Class5_Sub2_Sub2_Sub1) {
				local29 = (Class5_Sub2_Sub2_Sub1) local14.aClass39_1.aClass5_Sub2_Sub2_1;
				Static15.method331(arg0, local29, 0, 0, 128, true);
			}
		}
		if (arg2 < this.anInt3255 && arg3 < this.anInt3267) {
			local14 = this.aClass5_Sub20ArrayArrayArray1[arg1][arg2 + 1][arg3 + 1];
			if (local14 != null && local14.aClass39_1 != null && local14.aClass39_1.aClass5_Sub2_Sub2_1 instanceof Class5_Sub2_Sub2_Sub1) {
				local29 = (Class5_Sub2_Sub2_Sub1) local14.aClass39_1.aClass5_Sub2_Sub2_1;
				Static15.method331(arg0, local29, 128, 0, 128, true);
			}
		}
		if (arg2 >= this.anInt3255 || arg3 <= 0) {
			return;
		}
		local14 = this.aClass5_Sub20ArrayArrayArray1[arg1][arg2 + 1][arg3 - 1];
		if (local14 != null && local14.aClass39_1 != null && local14.aClass39_1.aClass5_Sub2_Sub2_1 instanceof Class5_Sub2_Sub2_Sub1) {
			local29 = (Class5_Sub2_Sub2_Sub1) local14.aClass39_1.aClass5_Sub2_Sub2_1;
			Static15.method331(arg0, local29, 128, 0, -128, true);
		}
	}

	@OriginalMember(owner = "client!wa", name = "c", descriptor = "(IIII)Z")
	private boolean method2090(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!this.method2111(arg0, arg1, arg2)) {
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
				if (local11 > Static130.anInt3262) {
					if (!this.method2081(local11, local26, local15)) {
						return false;
					}
					if (!this.method2081(local11, local26, local15 + 128)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!this.method2081(local11, local30, local15)) {
						return false;
					}
					if (!this.method2081(local11, local30, local15 + 128)) {
						return false;
					}
				}
				if (!this.method2081(local11, local34, local15)) {
					return false;
				}
				if (!this.method2081(local11, local34, local15 + 128)) {
					return false;
				}
				return true;
			}
			if (arg3 == 2) {
				if (local15 < Static130.anInt3263) {
					if (!this.method2081(local11, local26, local15 + 128)) {
						return false;
					}
					if (!this.method2081(local11 + 128, local26, local15 + 128)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!this.method2081(local11, local30, local15 + 128)) {
						return false;
					}
					if (!this.method2081(local11 + 128, local30, local15 + 128)) {
						return false;
					}
				}
				if (!this.method2081(local11, local34, local15 + 128)) {
					return false;
				}
				if (!this.method2081(local11 + 128, local34, local15 + 128)) {
					return false;
				}
				return true;
			}
			if (arg3 == 4) {
				if (local11 < Static130.anInt3262) {
					if (!this.method2081(local11 + 128, local26, local15)) {
						return false;
					}
					if (!this.method2081(local11 + 128, local26, local15 + 128)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!this.method2081(local11 + 128, local30, local15)) {
						return false;
					}
					if (!this.method2081(local11 + 128, local30, local15 + 128)) {
						return false;
					}
				}
				if (!this.method2081(local11 + 128, local34, local15)) {
					return false;
				}
				if (!this.method2081(local11 + 128, local34, local15 + 128)) {
					return false;
				}
				return true;
			}
			if (arg3 == 8) {
				if (local15 > Static130.anInt3263) {
					if (!this.method2081(local11, local26, local15)) {
						return false;
					}
					if (!this.method2081(local11 + 128, local26, local15)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!this.method2081(local11, local30, local15)) {
						return false;
					}
					if (!this.method2081(local11 + 128, local30, local15)) {
						return false;
					}
				}
				if (!this.method2081(local11, local34, local15)) {
					return false;
				}
				if (!this.method2081(local11 + 128, local34, local15)) {
					return false;
				}
				return true;
			}
		}
		if (!this.method2081(local11 + 64, local38, local15 + 64)) {
			return false;
		} else if (arg3 == 16) {
			return this.method2081(local11, local34, local15 + 128);
		} else if (arg3 == 32) {
			return this.method2081(local11 + 128, local34, local15 + 128);
		} else if (arg3 == 64) {
			return this.method2081(local11 + 128, local34, local15);
		} else if (arg3 == 128) {
			return this.method2081(local11, local34, local15);
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!wa", name = "h", descriptor = "(III)Lclient!ld;")
	public Class48 method2091(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class5_Sub20 local8 = this.aClass5_Sub20ArrayArrayArray1[arg0][arg1][arg2];
		return local8 == null ? null : local8.aClass48_1;
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(IIIIII)V")
	public void method2092(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (arg0 < 0) {
			arg0 = 0;
		} else if (arg0 >= this.anInt3255 * 128) {
			arg0 = this.anInt3255 * 128 - 1;
		}
		if (arg2 < 0) {
			arg2 = 0;
		} else if (arg2 >= this.anInt3267 * 128) {
			arg2 = this.anInt3267 * 128 - 1;
		}
		Static130.anInt3254++;
		Static130.anInt3264 = Class5_Sub2_Sub1_Sub2.anIntArray198[arg3];
		Static130.anInt3279 = Class5_Sub2_Sub1_Sub2.anIntArray197[arg3];
		Static130.anInt3281 = Class5_Sub2_Sub1_Sub2.anIntArray198[arg4];
		Static130.anInt3260 = Class5_Sub2_Sub1_Sub2.anIntArray197[arg4];
		Static130.aBooleanArrayArray1 = Static130.aBooleanArrayArrayArrayArray1[(arg3 - 128) / 32][arg4 / 64];
		Static130.anInt3262 = arg0;
		Static130.anInt3261 = arg1;
		Static130.anInt3263 = arg2;
		Static130.anInt3278 = arg0 / 128;
		Static130.anInt3273 = arg2 / 128;
		Static130.anInt3272 = arg5;
		Static130.anInt3269 = Static130.anInt3278 - 25;
		if (Static130.anInt3269 < 0) {
			Static130.anInt3269 = 0;
		}
		Static130.anInt3265 = Static130.anInt3273 - 25;
		if (Static130.anInt3265 < 0) {
			Static130.anInt3265 = 0;
		}
		Static130.anInt3257 = Static130.anInt3278 + 25;
		if (Static130.anInt3257 > this.anInt3255) {
			Static130.anInt3257 = this.anInt3255;
		}
		Static130.anInt3258 = Static130.anInt3273 + 25;
		if (Static130.anInt3258 > this.anInt3267) {
			Static130.anInt3258 = this.anInt3267;
		}
		this.method2084();
		Static130.anInt3271 = 0;
		@Pc(136) int local136;
		@Pc(139) int local139;
		for (@Pc(128) int local128 = this.anInt3259; local128 < this.anInt3277; local128++) {
			@Pc(134) Class5_Sub20[][] local134 = this.aClass5_Sub20ArrayArrayArray1[local128];
			for (local136 = Static130.anInt3269; local136 < Static130.anInt3257; local136++) {
				for (local139 = Static130.anInt3265; local139 < Static130.anInt3258; local139++) {
					@Pc(146) Class5_Sub20 local146 = local134[local136][local139];
					if (local146 != null) {
						if (local146.anInt2555 <= arg5 && (Static130.aBooleanArrayArray1[local136 + 25 - Static130.anInt3278][local139 + 25 - Static130.anInt3273] || this.anIntArrayArrayArray6[local128][local136][local139] - arg1 >= 2000)) {
							local146.aBoolean94 = true;
							local146.aBoolean92 = true;
							if (local146.anInt2554 > 0) {
								local146.aBoolean93 = true;
							} else {
								local146.aBoolean93 = false;
							}
							Static130.anInt3271++;
						} else {
							local146.aBoolean94 = false;
							local146.aBoolean92 = false;
							local146.anInt2551 = 0;
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
		for (@Pc(224) int local224 = this.anInt3259; local224 < this.anInt3277; local224++) {
			@Pc(230) Class5_Sub20[][] local230 = this.aClass5_Sub20ArrayArrayArray1[local224];
			for (local139 = -25; local139 <= 0; local139++) {
				local237 = Static130.anInt3278 + local139;
				local241 = Static130.anInt3278 - local139;
				if (local237 >= Static130.anInt3269 || local241 < Static130.anInt3257) {
					for (local249 = -25; local249 <= 0; local249++) {
						local254 = Static130.anInt3273 + local249;
						local258 = Static130.anInt3273 - local249;
						@Pc(270) Class5_Sub20 local270;
						if (local237 >= Static130.anInt3269) {
							if (local254 >= Static130.anInt3265) {
								local270 = local230[local237][local254];
								if (local270 != null && local270.aBoolean94) {
									this.method2083(local270, true);
								}
							}
							if (local258 < Static130.anInt3258) {
								local270 = local230[local237][local258];
								if (local270 != null && local270.aBoolean94) {
									this.method2083(local270, true);
								}
							}
						}
						if (local241 < Static130.anInt3257) {
							if (local254 >= Static130.anInt3265) {
								local270 = local230[local241][local254];
								if (local270 != null && local270.aBoolean94) {
									this.method2083(local270, true);
								}
							}
							if (local258 < Static130.anInt3258) {
								local270 = local230[local241][local258];
								if (local270 != null && local270.aBoolean94) {
									this.method2083(local270, true);
								}
							}
						}
						if (Static130.anInt3271 == 0) {
							Static130.aBoolean119 = false;
							return;
						}
					}
				}
			}
		}
		for (local136 = this.anInt3259; local136 < this.anInt3277; local136++) {
			@Pc(361) Class5_Sub20[][] local361 = this.aClass5_Sub20ArrayArrayArray1[local136];
			for (local237 = -25; local237 <= 0; local237++) {
				local241 = Static130.anInt3278 + local237;
				local249 = Static130.anInt3278 - local237;
				if (local241 >= Static130.anInt3269 || local249 < Static130.anInt3257) {
					for (local254 = -25; local254 <= 0; local254++) {
						local258 = Static130.anInt3273 + local254;
						@Pc(389) int local389 = Static130.anInt3273 - local254;
						@Pc(401) Class5_Sub20 local401;
						if (local241 >= Static130.anInt3269) {
							if (local258 >= Static130.anInt3265) {
								local401 = local361[local241][local258];
								if (local401 != null && local401.aBoolean94) {
									this.method2083(local401, false);
								}
							}
							if (local389 < Static130.anInt3258) {
								local401 = local361[local241][local389];
								if (local401 != null && local401.aBoolean94) {
									this.method2083(local401, false);
								}
							}
						}
						if (local249 < Static130.anInt3257) {
							if (local258 >= Static130.anInt3265) {
								local401 = local361[local249][local258];
								if (local401 != null && local401.aBoolean94) {
									this.method2083(local401, false);
								}
							}
							if (local389 < Static130.anInt3258) {
								local401 = local361[local249][local389];
								if (local401 != null && local401.aBoolean94) {
									this.method2083(local401, false);
								}
							}
						}
						if (Static130.anInt3271 == 0) {
							Static130.aBoolean119 = false;
							return;
						}
					}
				}
			}
		}
		Static130.aBoolean119 = false;
	}

	@OriginalMember(owner = "client!wa", name = "i", descriptor = "(III)I")
	public int method2093(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class5_Sub20 local8 = this.aClass5_Sub20ArrayArrayArray1[arg0][arg1][arg2];
		return local8 == null || local8.aClass57_1 == null ? 0 : local8.aClass57_1.anInt2444;
	}

	@OriginalMember(owner = "client!wa", name = "c", descriptor = "()V")
	public void method2096() {
		@Pc(4) int local4;
		@Pc(7) int local7;
		for (@Pc(1) int local1 = 0; local1 < this.anInt3277; local1++) {
			for (local4 = 0; local4 < this.anInt3255; local4++) {
				for (local7 = 0; local7 < this.anInt3267; local7++) {
					this.aClass5_Sub20ArrayArrayArray1[local1][local4][local7] = null;
				}
			}
		}
		for (local4 = 0; local4 < Static130.anInt3268; local4++) {
			for (local7 = 0; local7 < Static130.anIntArray397[local4]; local7++) {
				Static130.aClass60ArrayArray1[local4][local7] = null;
			}
			Static130.anIntArray397[local4] = 0;
		}
		for (local7 = 0; local7 < this.anInt3280; local7++) {
			this.aClass70Array3[local7] = null;
		}
		this.anInt3280 = 0;
		for (@Pc(76) int local76 = 0; local76 < Static130.aClass70Array2.length; local76++) {
			Static130.aClass70Array2[local76] = null;
		}
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(Lclient!te;)V")
	private void method2097(@OriginalArg(0) Class70 arg0) {
		for (@Pc(2) int local2 = arg0.anInt3005; local2 <= arg0.anInt3000; local2++) {
			for (@Pc(6) int local6 = arg0.anInt2992; local6 <= arg0.anInt3002; local6++) {
				@Pc(17) Class5_Sub20 local17 = this.aClass5_Sub20ArrayArrayArray1[arg0.anInt2999][local2][local6];
				if (local17 != null) {
					@Pc(36) int local36;
					for (@Pc(21) int local21 = 0; local21 < local17.anInt2554; local21++) {
						if (local17.aClass70Array1[local21] == arg0) {
							local17.anInt2554--;
							for (local36 = local21; local36 < local17.anInt2554; local36++) {
								local17.aClass70Array1[local36] = local17.aClass70Array1[local36 + 1];
								local17.anIntArray323[local36] = local17.anIntArray323[local36 + 1];
							}
							local17.aClass70Array1[local17.anInt2554] = null;
							break;
						}
					}
					local17.anInt2548 = 0;
					for (local36 = 0; local36 < local17.anInt2554; local36++) {
						local17.anInt2548 |= local17.anIntArray323[local36];
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "([IIIIII)V")
	public void method2098(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(8) Class5_Sub20 local8 = this.aClass5_Sub20ArrayArrayArray1[arg2][arg3][arg4];
		if (local8 == null) {
			return;
		}
		@Pc(14) Class27 local14 = local8.aClass27_1;
		@Pc(24) int local24;
		if (local14 != null) {
			@Pc(19) int local19 = local14.anInt1066;
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
		@Pc(59) Class7 local59 = local8.aClass7_1;
		if (local59 == null) {
			return;
		}
		local24 = local59.anInt84;
		@Pc(68) int local68 = local59.anInt85;
		@Pc(71) int local71 = local59.anInt86;
		@Pc(74) int local74 = local59.anInt87;
		@Pc(79) int[] local79 = this.anIntArrayArray25[local24];
		@Pc(84) int[] local84 = this.anIntArrayArray24[local68];
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

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(IIIIIILclient!mf;III)Z")
	public boolean method2099(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class5_Sub2_Sub2 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		if (arg6 == null) {
			return true;
		} else {
			@Pc(11) int local11 = arg1 * 128 + arg4 * 64;
			@Pc(19) int local19 = arg2 * 128 + arg5 * 64;
			return this.method2074(arg0, arg1, arg2, arg4, arg5, local11, local19, arg3, arg6, arg7, false, arg8, arg9);
		}
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(Lclient!g;IIIIIII)V")
	private void method2100(@OriginalArg(0) Class27 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(6) int local6;
		@Pc(7) int local7 = local6 = (arg6 << 7) - Static130.anInt3262;
		@Pc(14) int local14;
		@Pc(15) int local15 = local14 = (arg7 << 7) - Static130.anInt3263;
		@Pc(20) int local20;
		@Pc(21) int local21 = local20 = local7 + 128;
		@Pc(26) int local26;
		@Pc(27) int local27 = local26 = local15 + 128;
		@Pc(38) int local38 = this.anIntArrayArrayArray6[arg1][arg6][arg7] - Static130.anInt3261;
		@Pc(51) int local51 = this.anIntArrayArrayArray6[arg1][arg6 + 1][arg7] - Static130.anInt3261;
		@Pc(66) int local66 = this.anIntArrayArrayArray6[arg1][arg6 + 1][arg7 + 1] - Static130.anInt3261;
		@Pc(79) int local79 = this.anIntArrayArrayArray6[arg1][arg6][arg7 + 1] - Static130.anInt3261;
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
		@Pc(279) int local279 = Static51.anInt1302 + (local101 << 9) / local121;
		@Pc(287) int local287 = Static51.anInt1301 + (local123 << 9) / local121;
		@Pc(295) int local295 = Static51.anInt1302 + (local21 << 9) / local169;
		@Pc(303) int local303 = Static51.anInt1301 + (local51 << 9) / local169;
		@Pc(311) int local311 = Static51.anInt1302 + (local197 << 9) / local27;
		@Pc(319) int local319 = Static51.anInt1301 + (local66 << 9) / local27;
		@Pc(327) int local327 = Static51.anInt1302 + (local245 << 9) / local265;
		@Pc(335) int local335 = Static51.anInt1301 + (local89 << 9) / local265;
		Static51.anInt1305 = 0;
		@Pc(472) int local472;
		if ((local311 - local327) * (local303 - local335) - (local319 - local335) * (local295 - local327) > 0) {
			Static51.aBoolean41 = false;
			if (local311 < 0 || local327 < 0 || local295 < 0 || local311 > Static51.anInt1304 || local327 > Static51.anInt1304 || local295 > Static51.anInt1304) {
				Static51.aBoolean41 = true;
			}
			if (Static130.aBoolean119 && this.method2119(Static130.anInt3266, Static130.anInt3270, local319, local335, local303, local311, local327, local295)) {
				Static130.anInt3256 = arg6;
				Static130.anInt3276 = arg7;
			}
			if (arg0.anInt1060 == -1) {
				if (arg0.anInt1064 != 12345678) {
					Static51.method942(local319, local335, local303, local311, local327, local295, arg0.anInt1064, arg0.anInt1063, arg0.anInt1058);
				}
			} else if (Static130.aBoolean118) {
				local472 = Static51.anInterface1_1.method1153(arg0.anInt1060);
				Static51.method942(local319, local335, local303, local311, local327, local295, Static130.method2070(local472, arg0.anInt1064), Static130.method2070(local472, arg0.anInt1063), Static130.method2070(local472, arg0.anInt1058));
			} else if (arg0.aBoolean32) {
				Static51.method930(local319, local335, local303, local311, local327, local295, arg0.anInt1064, arg0.anInt1063, arg0.anInt1058, local101, local21, local245, local123, local51, local89, local121, local169, local265, arg0.anInt1060);
			} else {
				Static51.method930(local319, local335, local303, local311, local327, local295, arg0.anInt1064, arg0.anInt1063, arg0.anInt1058, local197, local245, local21, local66, local89, local51, local27, local265, local169, arg0.anInt1060);
			}
		}
		if ((local279 - local295) * (local335 - local303) - (local287 - local303) * (local327 - local295) <= 0) {
			return;
		}
		Static51.aBoolean41 = false;
		if (local279 < 0 || local295 < 0 || local327 < 0 || local279 > Static51.anInt1304 || local295 > Static51.anInt1304 || local327 > Static51.anInt1304) {
			Static51.aBoolean41 = true;
		}
		if (Static130.aBoolean119 && this.method2119(Static130.anInt3266, Static130.anInt3270, local287, local303, local335, local279, local295, local327)) {
			Static130.anInt3256 = arg6;
			Static130.anInt3276 = arg7;
		}
		if (arg0.anInt1060 != -1) {
			if (!Static130.aBoolean118) {
				Static51.method930(local287, local303, local335, local279, local295, local327, arg0.anInt1067, arg0.anInt1058, arg0.anInt1063, local101, local21, local245, local123, local51, local89, local121, local169, local265, arg0.anInt1060);
				return;
			}
			local472 = Static51.anInterface1_1.method1153(arg0.anInt1060);
			Static51.method942(local287, local303, local335, local279, local295, local327, Static130.method2070(local472, arg0.anInt1067), Static130.method2070(local472, arg0.anInt1058), Static130.method2070(local472, arg0.anInt1063));
		} else if (arg0.anInt1067 != 12345678) {
			Static51.method942(local287, local303, local335, local279, local295, local327, arg0.anInt1067, arg0.anInt1058, arg0.anInt1063);
			return;
		}
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(IIIILclient!mf;Lclient!mf;IIII)V")
	public void method2101(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class5_Sub2_Sub2 arg4, @OriginalArg(5) Class5_Sub2_Sub2 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		if (arg4 == null && arg5 == null) {
			return;
		}
		@Pc(8) Class57 local8 = new Class57();
		local8.anInt2444 = arg8;
		local8.anInt2447 = arg9;
		local8.anInt2453 = arg1 * 128 + 64;
		local8.anInt2440 = arg2 * 128 + 64;
		local8.anInt2439 = arg3;
		local8.aClass5_Sub2_Sub2_5 = arg4;
		local8.aClass5_Sub2_Sub2_4 = arg5;
		local8.anInt2448 = arg6;
		local8.anInt2452 = arg7;
		for (@Pc(45) int local45 = arg0; local45 >= 0; local45--) {
			if (this.aClass5_Sub20ArrayArrayArray1[local45][arg1][arg2] == null) {
				this.aClass5_Sub20ArrayArrayArray1[local45][arg1][arg2] = new Class5_Sub20(local45, arg1, arg2);
			}
		}
		this.aClass5_Sub20ArrayArrayArray1[arg0][arg1][arg2].aClass57_1 = local8;
	}

	@OriginalMember(owner = "client!wa", name = "d", descriptor = "(IIII)Z")
	private boolean method2102(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.method2111(arg0, arg1, arg2)) {
			@Pc(11) int local11 = arg1 << 7;
			@Pc(15) int local15 = arg2 << 7;
			return this.method2081(local11 + 1, this.anIntArrayArrayArray6[arg0][arg1][arg2] - arg3, local15 + 1) && this.method2081(local11 + 128 - 1, this.anIntArrayArrayArray6[arg0][arg1 + 1][arg2] - arg3, local15 + 1) && this.method2081(local11 + 128 - 1, this.anIntArrayArrayArray6[arg0][arg1 + 1][arg2 + 1] - arg3, local15 + 128 - 1) && this.method2081(local11 + 1, this.anIntArrayArrayArray6[arg0][arg1][arg2 + 1] - arg3, local15 + 128 - 1);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(IIIILclient!mf;Lclient!mf;IIIIII)V")
	public void method2103(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class5_Sub2_Sub2 arg4, @OriginalArg(5) Class5_Sub2_Sub2 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11) {
		if (arg4 == null) {
			return;
		}
		@Pc(6) Class48 local6 = new Class48();
		local6.anInt1744 = arg10;
		local6.anInt1743 = arg11;
		local6.anInt1746 = arg1 * 128 + 64;
		local6.anInt1742 = arg2 * 128 + 64;
		local6.anInt1736 = arg3;
		local6.aClass5_Sub2_Sub2_2 = arg4;
		local6.aClass5_Sub2_Sub2_3 = arg5;
		local6.anInt1748 = arg6;
		local6.anInt1741 = arg7;
		local6.anInt1749 = arg8;
		local6.anInt1739 = arg9;
		for (@Pc(49) int local49 = arg0; local49 >= 0; local49--) {
			if (this.aClass5_Sub20ArrayArrayArray1[local49][arg1][arg2] == null) {
				this.aClass5_Sub20ArrayArrayArray1[local49][arg1][arg2] = new Class5_Sub20(local49, arg1, arg2);
			}
		}
		this.aClass5_Sub20ArrayArrayArray1[arg0][arg1][arg2].aClass48_1 = local6;
	}

	@OriginalMember(owner = "client!wa", name = "j", descriptor = "(III)V")
	public void method2104(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class5_Sub20 local8 = this.aClass5_Sub20ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 != null) {
			local8.aClass48_1 = null;
		}
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(Lclient!af;IIIIII)V")
	private void method2105(@OriginalArg(0) Class7 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(3) int local3 = arg0.anIntArray29.length;
		@Pc(13) int local13;
		@Pc(20) int local20;
		@Pc(27) int local27;
		@Pc(37) int local37;
		for (@Pc(5) int local5 = 0; local5 < local3; local5++) {
			local13 = arg0.anIntArray29[local5] - Static130.anInt3262;
			local20 = arg0.anIntArray26[local5] - Static130.anInt3261;
			local27 = arg0.anIntArray35[local5] - Static130.anInt3263;
			local37 = local27 * arg3 + local13 * arg4 >> 16;
			@Pc(47) int local47 = local27 * arg4 - local13 * arg3 >> 16;
			@Pc(59) int local59 = local20 * arg2 - local47 * arg1 >> 16;
			@Pc(69) int local69 = local20 * arg1 + local47 * arg2 >> 16;
			if (local69 < 50) {
				return;
			}
			if (arg0.anIntArray34 != null) {
				Static6.anIntArray33[local5] = local37;
				Static6.anIntArray31[local5] = local59;
				Static6.anIntArray28[local5] = local69;
			}
			Static6.anIntArray23[local5] = Static51.anInt1302 + (local37 << 9) / local69;
			Static6.anIntArray24[local5] = Static51.anInt1301 + (local59 << 9) / local69;
		}
		Static51.anInt1305 = 0;
		local3 = arg0.anIntArray22.length;
		for (local13 = 0; local13 < local3; local13++) {
			local20 = arg0.anIntArray22[local13];
			local27 = arg0.anIntArray27[local13];
			local37 = arg0.anIntArray25[local13];
			@Pc(142) int local142 = Static6.anIntArray23[local20];
			@Pc(146) int local146 = Static6.anIntArray23[local27];
			@Pc(150) int local150 = Static6.anIntArray23[local37];
			@Pc(154) int local154 = Static6.anIntArray24[local20];
			@Pc(158) int local158 = Static6.anIntArray24[local27];
			@Pc(162) int local162 = Static6.anIntArray24[local37];
			if ((local142 - local146) * (local162 - local158) - (local154 - local158) * (local150 - local146) > 0) {
				Static51.aBoolean41 = false;
				if (local142 < 0 || local146 < 0 || local150 < 0 || local142 > Static51.anInt1304 || local146 > Static51.anInt1304 || local150 > Static51.anInt1304) {
					Static51.aBoolean41 = true;
				}
				if (Static130.aBoolean119 && this.method2119(Static130.anInt3266, Static130.anInt3270, local154, local158, local162, local142, local146, local150)) {
					Static130.anInt3256 = arg5;
					Static130.anInt3276 = arg6;
				}
				if (arg0.anIntArray34 == null || arg0.anIntArray34[local13] == -1) {
					if (arg0.anIntArray30[local13] != 12345678) {
						Static51.method942(local154, local158, local162, local142, local146, local150, arg0.anIntArray30[local13], arg0.anIntArray21[local13], arg0.anIntArray32[local13]);
					}
				} else if (Static130.aBoolean118) {
					@Pc(364) int local364 = Static51.anInterface1_1.method1153(arg0.anIntArray34[local13]);
					Static51.method942(local154, local158, local162, local142, local146, local150, Static130.method2070(local364, arg0.anIntArray30[local13]), Static130.method2070(local364, arg0.anIntArray21[local13]), Static130.method2070(local364, arg0.anIntArray32[local13]));
				} else if (arg0.aBoolean6) {
					Static51.method930(local154, local158, local162, local142, local146, local150, arg0.anIntArray30[local13], arg0.anIntArray21[local13], arg0.anIntArray32[local13], Static6.anIntArray33[0], Static6.anIntArray33[1], Static6.anIntArray33[3], Static6.anIntArray31[0], Static6.anIntArray31[1], Static6.anIntArray31[3], Static6.anIntArray28[0], Static6.anIntArray28[1], Static6.anIntArray28[3], arg0.anIntArray34[local13]);
				} else {
					Static51.method930(local154, local158, local162, local142, local146, local150, arg0.anIntArray30[local13], arg0.anIntArray21[local13], arg0.anIntArray32[local13], Static6.anIntArray33[local20], Static6.anIntArray33[local27], Static6.anIntArray33[local37], Static6.anIntArray31[local20], Static6.anIntArray31[local27], Static6.anIntArray31[local37], Static6.anIntArray28[local20], Static6.anIntArray28[local27], Static6.anIntArray28[local37], arg0.anIntArray34[local13]);
				}
			}
		}
	}

	@OriginalMember(owner = "client!wa", name = "l", descriptor = "(III)V")
	public void method2107(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class5_Sub20 local8 = this.aClass5_Sub20ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 != null) {
			local8.aClass64_1 = null;
		}
	}

	@OriginalMember(owner = "client!wa", name = "m", descriptor = "(III)Lclient!jb;")
	public Class39 method2108(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class5_Sub20 local8 = this.aClass5_Sub20ArrayArrayArray1[arg0][arg1][arg2];
		return local8 == null || local8.aClass39_1 == null ? null : local8.aClass39_1;
	}

	@OriginalMember(owner = "client!wa", name = "b", descriptor = "(IIIIII)Z")
	private boolean method2109(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(17) int local17;
		@Pc(21) int local21;
		if (arg1 != arg2 || arg3 != arg4) {
			for (local17 = arg1; local17 <= arg2; local17++) {
				for (local21 = arg3; local21 <= arg4; local21++) {
					if (this.anIntArrayArrayArray7[arg0][local17][local21] == -Static130.anInt3254) {
						return false;
					}
				}
			}
			local21 = (arg1 << 7) + 1;
			@Pc(156) int local156 = (arg3 << 7) + 2;
			@Pc(167) int local167 = this.anIntArrayArrayArray6[arg0][arg1][arg3] - arg5;
			if (!this.method2081(local21, local167, local156)) {
				return false;
			}
			@Pc(181) int local181 = (arg2 << 7) - 1;
			if (!this.method2081(local181, local167, local156)) {
				return false;
			}
			@Pc(195) int local195 = (arg4 << 7) - 1;
			if (!this.method2081(local21, local167, local195)) {
				return false;
			} else if (this.method2081(local181, local167, local195)) {
				return true;
			} else {
				return false;
			}
		} else if (this.method2111(arg0, arg1, arg3)) {
			local17 = arg1 << 7;
			local21 = arg3 << 7;
			return this.method2081(local17 + 1, this.anIntArrayArrayArray6[arg0][arg1][arg3] - arg5, local21 + 1) && this.method2081(local17 + 128 - 1, this.anIntArrayArrayArray6[arg0][arg1 + 1][arg3] - arg5, local21 + 1) && this.method2081(local17 + 128 - 1, this.anIntArrayArrayArray6[arg0][arg1 + 1][arg3 + 1] - arg5, local21 + 128 - 1) && this.method2081(local17 + 1, this.anIntArrayArrayArray6[arg0][arg1][arg3 + 1] - arg5, local21 + 128 - 1);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!wa", name = "n", descriptor = "(III)I")
	public int method2110(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class5_Sub20 local8 = this.aClass5_Sub20ArrayArrayArray1[arg0][arg1][arg2];
		return local8 == null || local8.aClass48_1 == null ? 0 : local8.aClass48_1.anInt1744;
	}

	@OriginalMember(owner = "client!wa", name = "o", descriptor = "(III)Z")
	private boolean method2111(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) int local8 = this.anIntArrayArrayArray7[arg0][arg1][arg2];
		if (local8 == -Static130.anInt3254) {
			return false;
		} else if (local8 == Static130.anInt3254) {
			return true;
		} else {
			@Pc(23) int local23 = arg1 << 7;
			@Pc(27) int local27 = arg2 << 7;
			if (this.method2081(local23 + 1, this.anIntArrayArrayArray6[arg0][arg1][arg2], local27 + 1) && this.method2081(local23 + 128 - 1, this.anIntArrayArrayArray6[arg0][arg1 + 1][arg2], local27 + 1) && this.method2081(local23 + 128 - 1, this.anIntArrayArrayArray6[arg0][arg1 + 1][arg2 + 1], local27 + 128 - 1) && this.method2081(local23 + 1, this.anIntArrayArrayArray6[arg0][arg1][arg2 + 1], local27 + 128 - 1)) {
				this.anIntArrayArrayArray7[arg0][arg1][arg2] = Static130.anInt3254;
				return true;
			} else {
				this.anIntArrayArrayArray7[arg0][arg1][arg2] = -Static130.anInt3254;
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!wa", name = "p", descriptor = "(III)V")
	public void method2112(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class5_Sub20 local8 = this.aClass5_Sub20ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 != null) {
			local8.aClass39_1 = null;
		}
	}

	@OriginalMember(owner = "client!wa", name = "q", descriptor = "(III)V")
	public void method2113(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class5_Sub20 local8 = this.aClass5_Sub20ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 != null) {
			local8.aClass57_1 = null;
		}
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(I)V")
	public void method2114(@OriginalArg(0) int arg0) {
		this.anInt3259 = arg0;
		for (@Pc(4) int local4 = 0; local4 < this.anInt3255; local4++) {
			for (@Pc(7) int local7 = 0; local7 < this.anInt3267; local7++) {
				if (this.aClass5_Sub20ArrayArrayArray1[arg0][local4][local7] == null) {
					this.aClass5_Sub20ArrayArrayArray1[arg0][local4][local7] = new Class5_Sub20(arg0, local4, local7);
				}
			}
		}
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(IIIIILclient!mf;IIZ)Z")
	public boolean method2115(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class5_Sub2_Sub2 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8) {
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
		return this.method2074(arg0, local7, local11, local15 + 1 - local7, local19 - local11 + 1, arg1, arg2, arg3, arg5, arg6, true, arg7, 0);
	}

	@OriginalMember(owner = "client!wa", name = "d", descriptor = "()V")
	public void method2116() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt3280; local1++) {
			@Pc(7) Class70 local7 = this.aClass70Array3[local1];
			this.method2097(local7);
			this.aClass70Array3[local1] = null;
		}
		this.anInt3280 = 0;
	}

	@OriginalMember(owner = "client!wa", name = "e", descriptor = "(IIII)V")
	public void method2117(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(8) Class5_Sub20 local8 = this.aClass5_Sub20ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 == null) {
			return;
		}
		@Pc(14) Class48 local14 = local8.aClass48_1;
		if (local14 != null) {
			local14.anInt1749 = local14.anInt1749 * arg3 / 16;
			local14.anInt1739 = local14.anInt1739 * arg3 / 16;
		}
	}

	@OriginalMember(owner = "client!wa", name = "r", descriptor = "(III)I")
	public int method2118(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class5_Sub20 local8 = this.aClass5_Sub20ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 == null) {
			return 0;
		}
		for (@Pc(14) int local14 = 0; local14 < local8.anInt2554; local14++) {
			@Pc(20) Class70 local20 = local8.aClass70Array1[local14];
			if ((local20.anInt3007 >> 29 & 0x3) == 2 && local20.anInt3005 == arg1 && local20.anInt2992 == arg2) {
				return local20.anInt3007;
			}
		}
		return 0;
	}

	@OriginalMember(owner = "client!wa", name = "b", descriptor = "(IIIIIIII)Z")
	private boolean method2119(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
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
}
