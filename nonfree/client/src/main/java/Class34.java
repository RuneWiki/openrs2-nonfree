import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kb")
public final class Class34 {

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "I")
	private int anInt1521 = 0;

	@OriginalMember(owner = "client!kb", name = "i", descriptor = "[Lclient!ne;")
	private final Class44[] aClass44Array1 = new Class44[5000];

	@OriginalMember(owner = "client!kb", name = "p", descriptor = "I")
	private int anInt1529 = 0;

	@OriginalMember(owner = "client!kb", name = "Q", descriptor = "I")
	private int anInt1548 = 0;

	@OriginalMember(owner = "client!kb", name = "O", descriptor = "[I")
	private final int[] anIntArray146 = new int[10000];

	@OriginalMember(owner = "client!kb", name = "S", descriptor = "[[I")
	private final int[][] anIntArrayArray9 = new int[][] { new int[16], { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 1 }, { 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0 }, { 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1 }, { 1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 1 } };

	@OriginalMember(owner = "client!kb", name = "bb", descriptor = "[[I")
	private final int[][] anIntArrayArray10 = new int[][] { { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 }, { 12, 8, 4, 0, 13, 9, 5, 1, 14, 10, 6, 2, 15, 11, 7, 3 }, { 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 }, { 3, 7, 11, 15, 2, 6, 10, 14, 1, 5, 9, 13, 0, 4, 8, 12 } };

	@OriginalMember(owner = "client!kb", name = "fb", descriptor = "[I")
	private final int[] anIntArray152 = new int[10000];

	@OriginalMember(owner = "client!kb", name = "I", descriptor = "I")
	private final int anInt1542;

	@OriginalMember(owner = "client!kb", name = "u", descriptor = "I")
	private final int anInt1531;

	@OriginalMember(owner = "client!kb", name = "G", descriptor = "I")
	private final int anInt1540;

	@OriginalMember(owner = "client!kb", name = "v", descriptor = "[[[Lclient!ob;")
	private final Class6_Sub11[][][] aClass6_Sub11ArrayArrayArray1;

	@OriginalMember(owner = "client!kb", name = "z", descriptor = "[[[I")
	private final int[][][] anIntArrayArrayArray6;

	@OriginalMember(owner = "client!kb", name = "n", descriptor = "[[[I")
	private final int[][][] anIntArrayArrayArray5;

	@OriginalMember(owner = "client!kb", name = "<init>", descriptor = "(III[[[I)V")
	public Class34(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[][][] arg3) {
		this.anInt1542 = arg0;
		this.anInt1531 = arg1;
		this.anInt1540 = arg2;
		this.aClass6_Sub11ArrayArrayArray1 = new Class6_Sub11[arg0][arg1][arg2];
		this.anIntArrayArrayArray6 = new int[arg0][arg1 + 1][arg2 + 1];
		this.anIntArrayArrayArray5 = arg3;
		this.method1064();
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(II)V")
	public void method1020(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static48.aBoolean70 = true;
		Static48.anInt1532 = arg0;
		Static48.anInt1528 = arg1;
		Static48.anInt1533 = -1;
		Static48.anInt1538 = -1;
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(III)V")
	public void method1021(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class6_Sub11 local8 = this.aClass6_Sub11ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 == null) {
			return;
		}
		for (@Pc(13) int local13 = 0; local13 < local8.anInt2022; local13++) {
			@Pc(19) Class44 local19 = local8.aClass44Array3[local13];
			if ((local19.anInt1929 >> 29 & 0x3) == 2 && local19.anInt1936 == arg1 && local19.anInt1955 == arg2) {
				this.method1056(local19);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(IIII)I")
	public int method1022(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(8) Class6_Sub11 local8 = this.aClass6_Sub11ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 == null) {
			return -1;
		} else if (local8.aClass41_1 != null && local8.aClass41_1.anInt1871 == arg3) {
			return local8.aClass41_1.anInt1877 & 0xFF;
		} else if (local8.aClass54_1 != null && local8.aClass54_1.anInt2335 == arg3) {
			return local8.aClass54_1.anInt2327 & 0xFF;
		} else if (local8.aClass23_1 != null && local8.aClass23_1.anInt1144 == arg3) {
			return local8.aClass23_1.anInt1142 & 0xFF;
		} else {
			for (@Pc(56) int local56 = 0; local56 < local8.anInt2022; local56++) {
				if (local8.aClass44Array3[local56].anInt1929 == arg3) {
					return local8.aClass44Array3[local56].anInt1946 & 0xFF;
				}
			}
			return -1;
		}
	}

	@OriginalMember(owner = "client!kb", name = "b", descriptor = "(IIII)Z")
	private boolean method1023(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!this.method1035(arg0, arg1, arg2)) {
			return false;
		}
		@Pc(11) int local11 = arg1 << 7;
		@Pc(15) int local15 = arg2 << 7;
		@Pc(26) int local26 = this.anIntArrayArrayArray5[arg0][arg1][arg2] - 1;
		@Pc(30) int local30 = local26 - 120;
		@Pc(34) int local34 = local26 - 230;
		@Pc(38) int local38 = local26 - 238;
		if (arg3 < 16) {
			if (arg3 == 1) {
				if (local11 > Static48.anInt1525) {
					if (!this.method1062(local11, local26, local15)) {
						return false;
					}
					if (!this.method1062(local11, local26, local15 + 128)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!this.method1062(local11, local30, local15)) {
						return false;
					}
					if (!this.method1062(local11, local30, local15 + 128)) {
						return false;
					}
				}
				if (!this.method1062(local11, local34, local15)) {
					return false;
				}
				if (!this.method1062(local11, local34, local15 + 128)) {
					return false;
				}
				return true;
			}
			if (arg3 == 2) {
				if (local15 < Static48.anInt1539) {
					if (!this.method1062(local11, local26, local15 + 128)) {
						return false;
					}
					if (!this.method1062(local11 + 128, local26, local15 + 128)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!this.method1062(local11, local30, local15 + 128)) {
						return false;
					}
					if (!this.method1062(local11 + 128, local30, local15 + 128)) {
						return false;
					}
				}
				if (!this.method1062(local11, local34, local15 + 128)) {
					return false;
				}
				if (!this.method1062(local11 + 128, local34, local15 + 128)) {
					return false;
				}
				return true;
			}
			if (arg3 == 4) {
				if (local11 < Static48.anInt1525) {
					if (!this.method1062(local11 + 128, local26, local15)) {
						return false;
					}
					if (!this.method1062(local11 + 128, local26, local15 + 128)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!this.method1062(local11 + 128, local30, local15)) {
						return false;
					}
					if (!this.method1062(local11 + 128, local30, local15 + 128)) {
						return false;
					}
				}
				if (!this.method1062(local11 + 128, local34, local15)) {
					return false;
				}
				if (!this.method1062(local11 + 128, local34, local15 + 128)) {
					return false;
				}
				return true;
			}
			if (arg3 == 8) {
				if (local15 > Static48.anInt1539) {
					if (!this.method1062(local11, local26, local15)) {
						return false;
					}
					if (!this.method1062(local11 + 128, local26, local15)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!this.method1062(local11, local30, local15)) {
						return false;
					}
					if (!this.method1062(local11 + 128, local30, local15)) {
						return false;
					}
				}
				if (!this.method1062(local11, local34, local15)) {
					return false;
				}
				if (!this.method1062(local11 + 128, local34, local15)) {
					return false;
				}
				return true;
			}
		}
		if (!this.method1062(local11 + 64, local38, local15 + 64)) {
			return false;
		} else if (arg3 == 16) {
			return this.method1062(local11, local34, local15 + 128);
		} else if (arg3 == 32) {
			return this.method1062(local11 + 128, local34, local15 + 128);
		} else if (arg3 == 64) {
			return this.method1062(local11 + 128, local34, local15);
		} else if (arg3 == 128) {
			return this.method1062(local11, local34, local15);
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(IIIILclient!k;ILclient!k;Lclient!k;)V")
	public void method1024(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class6_Sub2_Sub3 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class6_Sub2_Sub3 arg6, @OriginalArg(7) Class6_Sub2_Sub3 arg7) {
		@Pc(3) Class13 local3 = new Class13();
		local3.aClass6_Sub2_Sub3_3 = arg4;
		local3.anInt933 = arg1 * 128 + 64;
		local3.anInt942 = arg2 * 128 + 64;
		local3.anInt935 = arg3;
		local3.anInt941 = arg5;
		local3.aClass6_Sub2_Sub3_1 = arg6;
		local3.aClass6_Sub2_Sub3_2 = arg7;
		@Pc(34) int local34 = 0;
		@Pc(43) Class6_Sub11 local43 = this.aClass6_Sub11ArrayArrayArray1[arg0][arg1][arg2];
		if (local43 != null) {
			for (@Pc(47) int local47 = 0; local47 < local43.anInt2022; local47++) {
				if ((local43.aClass44Array3[local47].anInt1946 & 0x100) == 256 && local43.aClass44Array3[local47].aClass6_Sub2_Sub3_7 instanceof Class6_Sub2_Sub3_Sub3) {
					@Pc(71) Class6_Sub2_Sub3_Sub3 local71 = (Class6_Sub2_Sub3_Sub3) local43.aClass44Array3[local47].aClass6_Sub2_Sub3_7;
					local71.method970();
					if (local71.anInt3206 > local34) {
						local34 = local71.anInt3206;
					}
				}
			}
		}
		local3.anInt934 = local34;
		if (this.aClass6_Sub11ArrayArrayArray1[arg0][arg1][arg2] == null) {
			this.aClass6_Sub11ArrayArrayArray1[arg0][arg1][arg2] = new Class6_Sub11(arg0, arg1, arg2);
		}
		this.aClass6_Sub11ArrayArrayArray1[arg0][arg1][arg2].aClass13_1 = local3;
	}

	@OriginalMember(owner = "client!kb", name = "c", descriptor = "(III)I")
	public int method1027(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class6_Sub11 local8 = this.aClass6_Sub11ArrayArrayArray1[arg0][arg1][arg2];
		return local8 == null || local8.aClass41_1 == null ? 0 : local8.aClass41_1.anInt1871;
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(IIIIILclient!k;IIIIII)Z")
	public boolean method1028(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) Class6_Sub2_Sub3 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		return arg4 == null ? true : this.method1034(arg0, arg7, arg8, arg9 + 1 - arg7, arg10 - arg8 + 1, arg1, arg2, arg3, arg4, arg5, true, arg6, 0);
	}

	@OriginalMember(owner = "client!kb", name = "d", descriptor = "(III)V")
	public void method1029(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class6_Sub11 local8 = this.aClass6_Sub11ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 != null) {
			local8.aClass54_1 = null;
		}
	}

	@OriginalMember(owner = "client!kb", name = "c", descriptor = "(IIII)V")
	public void method1030(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(8) Class6_Sub11 local8 = this.aClass6_Sub11ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 == null) {
			return;
		}
		@Pc(14) Class54 local14 = local8.aClass54_1;
		if (local14 != null) {
			@Pc(23) int local23 = arg1 * 128 + 64;
			@Pc(29) int local29 = arg2 * 128 + 64;
			local14.anInt2326 = local23 + (local14.anInt2326 - local23) * arg3 / 16;
			local14.anInt2339 = local29 + (local14.anInt2339 - local29) * arg3 / 16;
		}
	}

	@OriginalMember(owner = "client!kb", name = "e", descriptor = "(III)I")
	public int method1031(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class6_Sub11 local8 = this.aClass6_Sub11ArrayArrayArray1[arg0][arg1][arg2];
		return local8 == null || local8.aClass23_1 == null ? 0 : local8.aClass23_1.anInt1144;
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(IIIILclient!k;IIIIII)V")
	public void method1032(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class6_Sub2_Sub3 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		if (arg4 == null) {
			return;
		}
		@Pc(6) Class54 local6 = new Class54();
		local6.anInt2335 = arg9;
		local6.anInt2327 = arg10;
		local6.anInt2326 = arg1 * 128 + arg7 + 64;
		local6.anInt2339 = arg2 * 128 + arg8 + 64;
		local6.anInt2330 = arg3;
		local6.aClass6_Sub2_Sub3_8 = arg4;
		local6.anInt2338 = arg5;
		local6.anInt2328 = arg6;
		for (@Pc(44) int local44 = arg0; local44 >= 0; local44--) {
			if (this.aClass6_Sub11ArrayArrayArray1[local44][arg1][arg2] == null) {
				this.aClass6_Sub11ArrayArrayArray1[local44][arg1][arg2] = new Class6_Sub11(local44, arg1, arg2);
			}
		}
		this.aClass6_Sub11ArrayArrayArray1[arg0][arg1][arg2].aClass54_1 = local6;
	}

	@OriginalMember(owner = "client!kb", name = "f", descriptor = "(III)Lclient!r;")
	public Class54 method1033(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class6_Sub11 local8 = this.aClass6_Sub11ArrayArrayArray1[arg0][arg1][arg2];
		return local8 == null ? null : local8.aClass54_1;
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(IIIIIIIILclient!k;IZII)Z")
	private boolean method1034(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) Class6_Sub2_Sub3 arg8, @OriginalArg(9) int arg9, @OriginalArg(10) boolean arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12) {
		for (@Pc(1) int local1 = arg1; local1 < arg1 + arg3; local1++) {
			for (@Pc(4) int local4 = arg2; local4 < arg2 + arg4; local4++) {
				if (local1 < 0 || local4 < 0 || local1 >= this.anInt1531 || local4 >= this.anInt1540) {
					return false;
				}
				@Pc(28) Class6_Sub11 local28 = this.aClass6_Sub11ArrayArrayArray1[arg0][local1][local4];
				if (local28 != null && local28.anInt2022 >= 5) {
					return false;
				}
			}
		}
		@Pc(52) Class44 local52 = new Class44();
		local52.anInt1929 = arg11;
		local52.anInt1946 = arg12;
		local52.anInt1944 = arg0;
		local52.anInt1950 = arg5;
		local52.anInt1937 = arg6;
		local52.anInt1940 = arg7;
		local52.aClass6_Sub2_Sub3_7 = arg8;
		local52.anInt1953 = arg9;
		local52.anInt1936 = arg1;
		local52.anInt1955 = arg2;
		local52.anInt1947 = arg1 + arg3 - 1;
		local52.anInt1934 = arg2 + arg4 - 1;
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
					if (this.aClass6_Sub11ArrayArrayArray1[local130][local98][local101] == null) {
						this.aClass6_Sub11ArrayArrayArray1[local130][local98][local101] = new Class6_Sub11(local130, local98, local101);
					}
				}
				@Pc(166) Class6_Sub11 local166 = this.aClass6_Sub11ArrayArrayArray1[arg0][local98][local101];
				local166.aClass44Array3[local166.anInt2022] = local52;
				local166.anIntArray189[local166.anInt2022] = local104;
				local166.anInt2025 |= local104;
				local166.anInt2022++;
			}
		}
		if (arg10) {
			this.aClass44Array1[this.anInt1521++] = local52;
		}
		return true;
	}

	@OriginalMember(owner = "client!kb", name = "g", descriptor = "(III)Z")
	private boolean method1035(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) int local8 = this.anIntArrayArrayArray6[arg0][arg1][arg2];
		if (local8 == -Static48.anInt1523) {
			return false;
		} else if (local8 == Static48.anInt1523) {
			return true;
		} else {
			@Pc(23) int local23 = arg1 << 7;
			@Pc(27) int local27 = arg2 << 7;
			if (this.method1062(local23 + 1, this.anIntArrayArrayArray5[arg0][arg1][arg2], local27 + 1) && this.method1062(local23 + 128 - 1, this.anIntArrayArrayArray5[arg0][arg1 + 1][arg2], local27 + 1) && this.method1062(local23 + 128 - 1, this.anIntArrayArrayArray5[arg0][arg1 + 1][arg2 + 1], local27 + 128 - 1) && this.method1062(local23 + 1, this.anIntArrayArrayArray5[arg0][arg1][arg2 + 1], local27 + 128 - 1)) {
				this.anIntArrayArrayArray6[arg0][arg1][arg2] = Static48.anInt1523;
				return true;
			} else {
				this.anIntArrayArrayArray6[arg0][arg1][arg2] = -Static48.anInt1523;
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(IIIIILclient!k;IIZ)Z")
	public boolean method1037(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class6_Sub2_Sub3 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8) {
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
		return this.method1034(arg0, local7, local11, local15 + 1 - local7, local19 - local11 + 1, arg1, arg2, arg3, arg5, arg6, true, arg7, 0);
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(IIIIIIIIIIIIIIIIIIII)V")
	public void method1039(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int arg15, @OriginalArg(16) int arg16, @OriginalArg(17) int arg17, @OriginalArg(18) int arg18, @OriginalArg(19) int arg19) {
		@Pc(12) Class31 local12;
		@Pc(14) int local14;
		if (arg3 == 0) {
			local12 = new Class31(arg10, arg11, arg12, arg13, -1, arg18, false);
			for (local14 = arg0; local14 >= 0; local14--) {
				if (this.aClass6_Sub11ArrayArrayArray1[local14][arg1][arg2] == null) {
					this.aClass6_Sub11ArrayArrayArray1[local14][arg1][arg2] = new Class6_Sub11(local14, arg1, arg2);
				}
			}
			this.aClass6_Sub11ArrayArrayArray1[arg0][arg1][arg2].aClass31_1 = local12;
		} else if (arg3 == 1) {
			local12 = new Class31(arg14, arg15, arg16, arg17, arg5, arg19, arg6 == arg7 && arg6 == arg8 && arg6 == arg9);
			for (local14 = arg0; local14 >= 0; local14--) {
				if (this.aClass6_Sub11ArrayArrayArray1[local14][arg1][arg2] == null) {
					this.aClass6_Sub11ArrayArrayArray1[local14][arg1][arg2] = new Class6_Sub11(local14, arg1, arg2);
				}
			}
			this.aClass6_Sub11ArrayArrayArray1[arg0][arg1][arg2].aClass31_1 = local12;
		} else {
			@Pc(140) Class48 local140 = new Class48(arg3, arg4, arg5, arg1, arg2, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17, arg18, arg19);
			for (local14 = arg0; local14 >= 0; local14--) {
				if (this.aClass6_Sub11ArrayArrayArray1[local14][arg1][arg2] == null) {
					this.aClass6_Sub11ArrayArrayArray1[local14][arg1][arg2] = new Class6_Sub11(local14, arg1, arg2);
				}
			}
			this.aClass6_Sub11ArrayArrayArray1[arg0][arg1][arg2].aClass48_1 = local140;
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "()V")
	public void method1040() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt1521; local1++) {
			@Pc(7) Class44 local7 = this.aClass44Array1[local1];
			this.method1056(local7);
			this.aClass44Array1[local1] = null;
		}
		this.anInt1521 = 0;
	}

	@OriginalMember(owner = "client!kb", name = "h", descriptor = "(III)Lclient!ne;")
	public Class44 method1041(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class6_Sub11 local8 = this.aClass6_Sub11ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 == null) {
			return null;
		}
		for (@Pc(14) int local14 = 0; local14 < local8.anInt2022; local14++) {
			@Pc(20) Class44 local20 = local8.aClass44Array3[local14];
			if ((local20.anInt1929 >> 29 & 0x3) == 2 && local20.anInt1936 == arg1 && local20.anInt1955 == arg2) {
				return local20;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(IIIIII)Z")
	private boolean method1042(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(17) int local17;
		@Pc(21) int local21;
		if (arg1 != arg2 || arg3 != arg4) {
			for (local17 = arg1; local17 <= arg2; local17++) {
				for (local21 = arg3; local21 <= arg4; local21++) {
					if (this.anIntArrayArrayArray6[arg0][local17][local21] == -Static48.anInt1523) {
						return false;
					}
				}
			}
			local21 = (arg1 << 7) + 1;
			@Pc(156) int local156 = (arg3 << 7) + 2;
			@Pc(167) int local167 = this.anIntArrayArrayArray5[arg0][arg1][arg3] - arg5;
			if (!this.method1062(local21, local167, local156)) {
				return false;
			}
			@Pc(181) int local181 = (arg2 << 7) - 1;
			if (!this.method1062(local181, local167, local156)) {
				return false;
			}
			@Pc(195) int local195 = (arg4 << 7) - 1;
			if (!this.method1062(local21, local167, local195)) {
				return false;
			} else if (this.method1062(local181, local167, local195)) {
				return true;
			} else {
				return false;
			}
		} else if (this.method1035(arg0, arg1, arg3)) {
			local17 = arg1 << 7;
			local21 = arg3 << 7;
			return this.method1062(local17 + 1, this.anIntArrayArrayArray5[arg0][arg1][arg3] - arg5, local21 + 1) && this.method1062(local17 + 128 - 1, this.anIntArrayArrayArray5[arg0][arg1 + 1][arg3] - arg5, local21 + 1) && this.method1062(local17 + 128 - 1, this.anIntArrayArrayArray5[arg0][arg1 + 1][arg3 + 1] - arg5, local21 + 128 - 1) && this.method1062(local17 + 1, this.anIntArrayArrayArray5[arg0][arg1][arg3 + 1] - arg5, local21 + 128 - 1);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!kb", name = "b", descriptor = "(IIIIIIII)Z")
	private boolean method1043(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
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

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(Lclient!ja;IIIIIII)V")
	private void method1044(@OriginalArg(0) Class31 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(6) int local6;
		@Pc(7) int local7 = local6 = (arg6 << 7) - Static48.anInt1525;
		@Pc(14) int local14;
		@Pc(15) int local15 = local14 = (arg7 << 7) - Static48.anInt1539;
		@Pc(20) int local20;
		@Pc(21) int local21 = local20 = local7 + 128;
		@Pc(26) int local26;
		@Pc(27) int local27 = local26 = local15 + 128;
		@Pc(38) int local38 = this.anIntArrayArrayArray5[arg1][arg6][arg7] - Static48.anInt1530;
		@Pc(51) int local51 = this.anIntArrayArrayArray5[arg1][arg6 + 1][arg7] - Static48.anInt1530;
		@Pc(66) int local66 = this.anIntArrayArrayArray5[arg1][arg6 + 1][arg7 + 1] - Static48.anInt1530;
		@Pc(79) int local79 = this.anIntArrayArrayArray5[arg1][arg6][arg7 + 1] - Static48.anInt1530;
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
		@Pc(279) int local279 = Static30.anInt1193 + (local101 << 9) / local121;
		@Pc(287) int local287 = Static30.anInt1196 + (local123 << 9) / local121;
		@Pc(295) int local295 = Static30.anInt1193 + (local21 << 9) / local169;
		@Pc(303) int local303 = Static30.anInt1196 + (local51 << 9) / local169;
		@Pc(311) int local311 = Static30.anInt1193 + (local197 << 9) / local27;
		@Pc(319) int local319 = Static30.anInt1196 + (local66 << 9) / local27;
		@Pc(327) int local327 = Static30.anInt1193 + (local245 << 9) / local265;
		@Pc(335) int local335 = Static30.anInt1196 + (local89 << 9) / local265;
		Static30.anInt1191 = 0;
		@Pc(472) int local472;
		if ((local311 - local327) * (local303 - local335) - (local319 - local335) * (local295 - local327) > 0) {
			Static30.aBoolean51 = false;
			if (local311 < 0 || local327 < 0 || local295 < 0 || local311 > Static30.anInt1189 || local327 > Static30.anInt1189 || local295 > Static30.anInt1189) {
				Static30.aBoolean51 = true;
			}
			if (Static48.aBoolean70 && this.method1043(Static48.anInt1532, Static48.anInt1528, local319, local335, local303, local311, local327, local295)) {
				Static48.anInt1533 = arg6;
				Static48.anInt1538 = arg7;
			}
			if (arg0.anInt1397 == -1) {
				if (arg0.anInt1395 != 12345678) {
					Static30.method794(local319, local335, local303, local311, local327, local295, arg0.anInt1395, arg0.anInt1390, arg0.anInt1400);
				}
			} else if (Static48.aBoolean71) {
				local472 = Static30.anInterface4_1.method667(arg0.anInt1397);
				Static30.method794(local319, local335, local303, local311, local327, local295, Static48.method1036(local472, arg0.anInt1395), Static48.method1036(local472, arg0.anInt1390), Static48.method1036(local472, arg0.anInt1400));
			} else if (arg0.aBoolean64) {
				Static30.method781(local319, local335, local303, local311, local327, local295, arg0.anInt1395, arg0.anInt1390, arg0.anInt1400, local101, local21, local245, local123, local51, local89, local121, local169, local265, arg0.anInt1397);
			} else {
				Static30.method781(local319, local335, local303, local311, local327, local295, arg0.anInt1395, arg0.anInt1390, arg0.anInt1400, local197, local245, local21, local66, local89, local51, local27, local265, local169, arg0.anInt1397);
			}
		}
		if ((local279 - local295) * (local335 - local303) - (local287 - local303) * (local327 - local295) <= 0) {
			return;
		}
		Static30.aBoolean51 = false;
		if (local279 < 0 || local295 < 0 || local327 < 0 || local279 > Static30.anInt1189 || local295 > Static30.anInt1189 || local327 > Static30.anInt1189) {
			Static30.aBoolean51 = true;
		}
		if (Static48.aBoolean70 && this.method1043(Static48.anInt1532, Static48.anInt1528, local287, local303, local335, local279, local295, local327)) {
			Static48.anInt1533 = arg6;
			Static48.anInt1538 = arg7;
		}
		if (arg0.anInt1397 != -1) {
			if (!Static48.aBoolean71) {
				Static30.method781(local287, local303, local335, local279, local295, local327, arg0.anInt1392, arg0.anInt1400, arg0.anInt1390, local101, local21, local245, local123, local51, local89, local121, local169, local265, arg0.anInt1397);
				return;
			}
			local472 = Static30.anInterface4_1.method667(arg0.anInt1397);
			Static30.method794(local287, local303, local335, local279, local295, local327, Static48.method1036(local472, arg0.anInt1392), Static48.method1036(local472, arg0.anInt1400), Static48.method1036(local472, arg0.anInt1390));
		} else if (arg0.anInt1392 != 12345678) {
			Static30.method794(local287, local303, local335, local279, local295, local327, arg0.anInt1392, arg0.anInt1400, arg0.anInt1390);
			return;
		}
	}

	@OriginalMember(owner = "client!kb", name = "i", descriptor = "(III)Lclient!g;")
	public Class23 method1045(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class6_Sub11 local8 = this.aClass6_Sub11ArrayArrayArray1[arg0][arg1][arg2];
		return local8 == null || local8.aClass23_1 == null ? null : local8.aClass23_1;
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(IIIILclient!k;II)V")
	public void method1046(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class6_Sub2_Sub3 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (arg4 == null) {
			return;
		}
		@Pc(6) Class23 local6 = new Class23();
		local6.aClass6_Sub2_Sub3_4 = arg4;
		local6.anInt1148 = arg1 * 128 + 64;
		local6.anInt1145 = arg2 * 128 + 64;
		local6.anInt1149 = arg3;
		local6.anInt1144 = arg5;
		local6.anInt1142 = arg6;
		if (this.aClass6_Sub11ArrayArrayArray1[arg0][arg1][arg2] == null) {
			this.aClass6_Sub11ArrayArrayArray1[arg0][arg1][arg2] = new Class6_Sub11(arg0, arg1, arg2);
		}
		this.aClass6_Sub11ArrayArrayArray1[arg0][arg1][arg2].aClass23_1 = local6;
	}

	@OriginalMember(owner = "client!kb", name = "d", descriptor = "(IIII)V")
	public void method1047(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(8) Class6_Sub11 local8 = this.aClass6_Sub11ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 != null) {
			this.aClass6_Sub11ArrayArrayArray1[arg0][arg1][arg2].anInt2014 = arg3;
		}
	}

	@OriginalMember(owner = "client!kb", name = "j", descriptor = "(III)Lclient!n;")
	public Class41 method1048(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class6_Sub11 local8 = this.aClass6_Sub11ArrayArrayArray1[arg0][arg1][arg2];
		return local8 == null ? null : local8.aClass41_1;
	}

	@OriginalMember(owner = "client!kb", name = "b", descriptor = "()V")
	private void method1049() {
		@Pc(3) int local3 = Static48.anIntArray143[Static48.anInt1537];
		@Pc(7) Class45[] local7 = Static48.aClass45ArrayArray1[Static48.anInt1537];
		Static48.anInt1535 = 0;
		for (@Pc(11) int local11 = 0; local11 < local3; local11++) {
			@Pc(16) Class45 local16 = local7[local11];
			@Pc(27) int local27;
			@Pc(40) int local40;
			@Pc(51) int local51;
			@Pc(79) int local79;
			@Pc(58) boolean local58;
			if (local16.anInt1983 == 1) {
				local27 = local16.anInt1982 + 25 - Static48.anInt1546;
				if (local27 >= 0 && local27 <= 50) {
					local40 = local16.anInt1992 + 25 - Static48.anInt1534;
					if (local40 < 0) {
						local40 = 0;
					}
					local51 = local16.anInt1978 + 25 - Static48.anInt1534;
					if (local51 > 50) {
						local51 = 50;
					}
					local58 = false;
					while (local40 <= local51) {
						if (Static48.aBooleanArrayArray1[local27][local40++]) {
							local58 = true;
							break;
						}
					}
					if (local58) {
						local79 = Static48.anInt1525 - local16.anInt1984;
						if (local79 > 32) {
							local16.anInt1979 = 1;
						} else {
							if (local79 >= -32) {
								continue;
							}
							local16.anInt1979 = 2;
							local79 = -local79;
						}
						local16.anInt1981 = (local16.anInt1996 - Static48.anInt1539 << 8) / local79;
						local16.anInt1993 = (local16.anInt1976 - Static48.anInt1539 << 8) / local79;
						local16.anInt1994 = (local16.anInt1989 - Static48.anInt1530 << 8) / local79;
						local16.anInt1991 = (local16.anInt1985 - Static48.anInt1530 << 8) / local79;
						Static48.aClass45Array1[Static48.anInt1535++] = local16;
					}
				}
			} else if (local16.anInt1983 == 2) {
				local27 = local16.anInt1992 + 25 - Static48.anInt1534;
				if (local27 >= 0 && local27 <= 50) {
					local40 = local16.anInt1982 + 25 - Static48.anInt1546;
					if (local40 < 0) {
						local40 = 0;
					}
					local51 = local16.anInt1999 + 25 - Static48.anInt1546;
					if (local51 > 50) {
						local51 = 50;
					}
					local58 = false;
					while (local40 <= local51) {
						if (Static48.aBooleanArrayArray1[local40++][local27]) {
							local58 = true;
							break;
						}
					}
					if (local58) {
						local79 = Static48.anInt1539 - local16.anInt1996;
						if (local79 > 32) {
							local16.anInt1979 = 3;
						} else {
							if (local79 >= -32) {
								continue;
							}
							local16.anInt1979 = 4;
							local79 = -local79;
						}
						local16.anInt1987 = (local16.anInt1984 - Static48.anInt1525 << 8) / local79;
						local16.anInt1995 = (local16.anInt1990 - Static48.anInt1525 << 8) / local79;
						local16.anInt1994 = (local16.anInt1989 - Static48.anInt1530 << 8) / local79;
						local16.anInt1991 = (local16.anInt1985 - Static48.anInt1530 << 8) / local79;
						Static48.aClass45Array1[Static48.anInt1535++] = local16;
					}
				}
			} else if (local16.anInt1983 == 4) {
				local27 = local16.anInt1989 - Static48.anInt1530;
				if (local27 > 128) {
					local40 = local16.anInt1992 + 25 - Static48.anInt1534;
					if (local40 < 0) {
						local40 = 0;
					}
					local51 = local16.anInt1978 + 25 - Static48.anInt1534;
					if (local51 > 50) {
						local51 = 50;
					}
					if (local40 <= local51) {
						@Pc(319) int local319 = local16.anInt1982 + 25 - Static48.anInt1546;
						if (local319 < 0) {
							local319 = 0;
						}
						local79 = local16.anInt1999 + 25 - Static48.anInt1546;
						if (local79 > 50) {
							local79 = 50;
						}
						@Pc(337) boolean local337 = false;
						label142: for (@Pc(339) int local339 = local319; local339 <= local79; local339++) {
							for (@Pc(342) int local342 = local40; local342 <= local51; local342++) {
								if (Static48.aBooleanArrayArray1[local339][local342]) {
									local337 = true;
									break label142;
								}
							}
						}
						if (local337) {
							local16.anInt1979 = 5;
							local16.anInt1987 = (local16.anInt1984 - Static48.anInt1525 << 8) / local27;
							local16.anInt1995 = (local16.anInt1990 - Static48.anInt1525 << 8) / local27;
							local16.anInt1981 = (local16.anInt1996 - Static48.anInt1539 << 8) / local27;
							local16.anInt1993 = (local16.anInt1976 - Static48.anInt1539 << 8) / local27;
							Static48.aClass45Array1[Static48.anInt1535++] = local16;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!kb", name = "k", descriptor = "(III)V")
	public void method1050(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class6_Sub11 local8 = this.aClass6_Sub11ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 != null) {
			local8.aClass13_1 = null;
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(IIIIIILclient!k;III)Z")
	public boolean method1051(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class6_Sub2_Sub3 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		if (arg6 == null) {
			return true;
		} else {
			@Pc(11) int local11 = arg1 * 128 + arg4 * 64;
			@Pc(19) int local19 = arg2 * 128 + arg5 * 64;
			return this.method1034(arg0, arg1, arg2, arg4, arg5, local11, local19, arg3, arg6, arg7, false, arg8, arg9);
		}
	}

	@OriginalMember(owner = "client!kb", name = "l", descriptor = "(III)I")
	public int method1052(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class6_Sub11 local8 = this.aClass6_Sub11ArrayArrayArray1[arg0][arg1][arg2];
		return local8 == null || local8.aClass54_1 == null ? 0 : local8.aClass54_1.anInt2335;
	}

	@OriginalMember(owner = "client!kb", name = "b", descriptor = "(IIIIII)V")
	public void method1053(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (arg0 < 0) {
			arg0 = 0;
		} else if (arg0 >= this.anInt1531 * 128) {
			arg0 = this.anInt1531 * 128 - 1;
		}
		if (arg2 < 0) {
			arg2 = 0;
		} else if (arg2 >= this.anInt1540 * 128) {
			arg2 = this.anInt1540 * 128 - 1;
		}
		Static48.anInt1523++;
		Static48.anInt1522 = Static42.anIntArray117[arg3];
		Static48.anInt1527 = Static42.anIntArray124[arg3];
		Static48.anInt1545 = Static42.anIntArray117[arg4];
		Static48.anInt1547 = Static42.anIntArray124[arg4];
		Static48.aBooleanArrayArray1 = Static48.aBooleanArrayArrayArrayArray1[(arg3 - 128) / 32][arg4 / 64];
		Static48.anInt1525 = arg0;
		Static48.anInt1530 = arg1;
		Static48.anInt1539 = arg2;
		Static48.anInt1546 = arg0 / 128;
		Static48.anInt1534 = arg2 / 128;
		Static48.anInt1537 = arg5;
		Static48.anInt1541 = Static48.anInt1546 - 25;
		if (Static48.anInt1541 < 0) {
			Static48.anInt1541 = 0;
		}
		Static48.anInt1536 = Static48.anInt1534 - 25;
		if (Static48.anInt1536 < 0) {
			Static48.anInt1536 = 0;
		}
		Static48.anInt1524 = Static48.anInt1546 + 25;
		if (Static48.anInt1524 > this.anInt1531) {
			Static48.anInt1524 = this.anInt1531;
		}
		Static48.anInt1543 = Static48.anInt1534 + 25;
		if (Static48.anInt1543 > this.anInt1540) {
			Static48.anInt1543 = this.anInt1540;
		}
		this.method1049();
		Static48.anInt1526 = 0;
		@Pc(136) int local136;
		@Pc(139) int local139;
		for (@Pc(128) int local128 = this.anInt1529; local128 < this.anInt1542; local128++) {
			@Pc(134) Class6_Sub11[][] local134 = this.aClass6_Sub11ArrayArrayArray1[local128];
			for (local136 = Static48.anInt1541; local136 < Static48.anInt1524; local136++) {
				for (local139 = Static48.anInt1536; local139 < Static48.anInt1543; local139++) {
					@Pc(146) Class6_Sub11 local146 = local134[local136][local139];
					if (local146 != null) {
						if (local146.anInt2014 <= arg5 && (Static48.aBooleanArrayArray1[local136 + 25 - Static48.anInt1546][local139 + 25 - Static48.anInt1534] || this.anIntArrayArrayArray5[local128][local136][local139] - arg1 >= 2000)) {
							local146.aBoolean93 = true;
							local146.aBoolean94 = true;
							if (local146.anInt2022 > 0) {
								local146.aBoolean91 = true;
							} else {
								local146.aBoolean91 = false;
							}
							Static48.anInt1526++;
						} else {
							local146.aBoolean93 = false;
							local146.aBoolean94 = false;
							local146.anInt2027 = 0;
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
		for (@Pc(224) int local224 = this.anInt1529; local224 < this.anInt1542; local224++) {
			@Pc(230) Class6_Sub11[][] local230 = this.aClass6_Sub11ArrayArrayArray1[local224];
			for (local139 = -25; local139 <= 0; local139++) {
				local237 = Static48.anInt1546 + local139;
				local241 = Static48.anInt1546 - local139;
				if (local237 >= Static48.anInt1541 || local241 < Static48.anInt1524) {
					for (local249 = -25; local249 <= 0; local249++) {
						local254 = Static48.anInt1534 + local249;
						local258 = Static48.anInt1534 - local249;
						@Pc(270) Class6_Sub11 local270;
						if (local237 >= Static48.anInt1541) {
							if (local254 >= Static48.anInt1536) {
								local270 = local230[local237][local254];
								if (local270 != null && local270.aBoolean93) {
									this.method1065(local270, true);
								}
							}
							if (local258 < Static48.anInt1543) {
								local270 = local230[local237][local258];
								if (local270 != null && local270.aBoolean93) {
									this.method1065(local270, true);
								}
							}
						}
						if (local241 < Static48.anInt1524) {
							if (local254 >= Static48.anInt1536) {
								local270 = local230[local241][local254];
								if (local270 != null && local270.aBoolean93) {
									this.method1065(local270, true);
								}
							}
							if (local258 < Static48.anInt1543) {
								local270 = local230[local241][local258];
								if (local270 != null && local270.aBoolean93) {
									this.method1065(local270, true);
								}
							}
						}
						if (Static48.anInt1526 == 0) {
							Static48.aBoolean70 = false;
							return;
						}
					}
				}
			}
		}
		for (local136 = this.anInt1529; local136 < this.anInt1542; local136++) {
			@Pc(361) Class6_Sub11[][] local361 = this.aClass6_Sub11ArrayArrayArray1[local136];
			for (local237 = -25; local237 <= 0; local237++) {
				local241 = Static48.anInt1546 + local237;
				local249 = Static48.anInt1546 - local237;
				if (local241 >= Static48.anInt1541 || local249 < Static48.anInt1524) {
					for (local254 = -25; local254 <= 0; local254++) {
						local258 = Static48.anInt1534 + local254;
						@Pc(389) int local389 = Static48.anInt1534 - local254;
						@Pc(401) Class6_Sub11 local401;
						if (local241 >= Static48.anInt1541) {
							if (local258 >= Static48.anInt1536) {
								local401 = local361[local241][local258];
								if (local401 != null && local401.aBoolean93) {
									this.method1065(local401, false);
								}
							}
							if (local389 < Static48.anInt1543) {
								local401 = local361[local241][local389];
								if (local401 != null && local401.aBoolean93) {
									this.method1065(local401, false);
								}
							}
						}
						if (local249 < Static48.anInt1524) {
							if (local258 >= Static48.anInt1536) {
								local401 = local361[local249][local258];
								if (local401 != null && local401.aBoolean93) {
									this.method1065(local401, false);
								}
							}
							if (local389 < Static48.anInt1543) {
								local401 = local361[local249][local389];
								if (local401 != null && local401.aBoolean93) {
									this.method1065(local401, false);
								}
							}
						}
						if (Static48.anInt1526 == 0) {
							Static48.aBoolean70 = false;
							return;
						}
					}
				}
			}
		}
		Static48.aBoolean70 = false;
	}

	@OriginalMember(owner = "client!kb", name = "e", descriptor = "(IIII)Z")
	private boolean method1054(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.method1035(arg0, arg1, arg2)) {
			@Pc(11) int local11 = arg1 << 7;
			@Pc(15) int local15 = arg2 << 7;
			return this.method1062(local11 + 1, this.anIntArrayArrayArray5[arg0][arg1][arg2] - arg3, local15 + 1) && this.method1062(local11 + 128 - 1, this.anIntArrayArrayArray5[arg0][arg1 + 1][arg2] - arg3, local15 + 1) && this.method1062(local11 + 128 - 1, this.anIntArrayArrayArray5[arg0][arg1 + 1][arg2 + 1] - arg3, local15 + 128 - 1) && this.method1062(local11 + 1, this.anIntArrayArrayArray5[arg0][arg1][arg2 + 1] - arg3, local15 + 128 - 1);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!kb", name = "m", descriptor = "(III)V")
	public void method1055() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt1542; local1++) {
			for (@Pc(4) int local4 = 0; local4 < this.anInt1531; local4++) {
				for (@Pc(7) int local7 = 0; local7 < this.anInt1540; local7++) {
					@Pc(17) Class6_Sub11 local17 = this.aClass6_Sub11ArrayArrayArray1[local1][local4][local7];
					if (local17 != null) {
						@Pc(22) Class41 local22 = local17.aClass41_1;
						if (local22 != null && local22.aClass6_Sub2_Sub3_5 instanceof Class6_Sub2_Sub3_Sub3) {
							@Pc(32) Class6_Sub2_Sub3_Sub3 local32 = (Class6_Sub2_Sub3_Sub3) local22.aClass6_Sub2_Sub3_5;
							if (local32.aClass47Array2 != null) {
								this.method1069(local32, local1, local4, local7, 1, 1);
								if (local22.aClass6_Sub2_Sub3_6 instanceof Class6_Sub2_Sub3_Sub3) {
									@Pc(51) Class6_Sub2_Sub3_Sub3 local51 = (Class6_Sub2_Sub3_Sub3) local22.aClass6_Sub2_Sub3_6;
									if (local51.aClass47Array2 != null) {
										this.method1069(local51, local1, local4, local7, 1, 1);
										this.method1071(local32, local51, 0, 0, 0, false);
										local51.method979();
									}
								}
								local32.method979();
							}
						}
						@Pc(98) Class6_Sub2_Sub3_Sub3 local98;
						for (@Pc(82) int local82 = 0; local82 < local17.anInt2022; local82++) {
							@Pc(88) Class44 local88 = local17.aClass44Array3[local82];
							if (local88 != null && local88.aClass6_Sub2_Sub3_7 instanceof Class6_Sub2_Sub3_Sub3) {
								local98 = (Class6_Sub2_Sub3_Sub3) local88.aClass6_Sub2_Sub3_7;
								if (local98.aClass47Array2 != null) {
									this.method1069(local98, local1, local4, local7, local88.anInt1947 + 1 - local88.anInt1936, local88.anInt1934 - local88.anInt1955 + 1);
									local98.method979();
								}
							}
						}
						@Pc(134) Class23 local134 = local17.aClass23_1;
						if (local134 != null && local134.aClass6_Sub2_Sub3_4 instanceof Class6_Sub2_Sub3_Sub3) {
							local98 = (Class6_Sub2_Sub3_Sub3) local134.aClass6_Sub2_Sub3_4;
							if (local98.aClass47Array2 != null) {
								this.method1067(local98, local1, local4, local7);
								local98.method979();
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(Lclient!ne;)V")
	private void method1056(@OriginalArg(0) Class44 arg0) {
		for (@Pc(2) int local2 = arg0.anInt1936; local2 <= arg0.anInt1947; local2++) {
			for (@Pc(6) int local6 = arg0.anInt1955; local6 <= arg0.anInt1934; local6++) {
				@Pc(17) Class6_Sub11 local17 = this.aClass6_Sub11ArrayArrayArray1[arg0.anInt1944][local2][local6];
				if (local17 != null) {
					@Pc(36) int local36;
					for (@Pc(21) int local21 = 0; local21 < local17.anInt2022; local21++) {
						if (local17.aClass44Array3[local21] == arg0) {
							local17.anInt2022--;
							for (local36 = local21; local36 < local17.anInt2022; local36++) {
								local17.aClass44Array3[local36] = local17.aClass44Array3[local36 + 1];
								local17.anIntArray189[local36] = local17.anIntArray189[local36 + 1];
							}
							local17.aClass44Array3[local17.anInt2022] = null;
							break;
						}
					}
					local17.anInt2025 = 0;
					for (local36 = 0; local36 < local17.anInt2022; local36++) {
						local17.anInt2025 |= local17.anIntArray189[local36];
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!kb", name = "c", descriptor = "(II)V")
	public void method1058(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class6_Sub11 local8 = this.aClass6_Sub11ArrayArrayArray1[0][arg0][arg1];
		for (@Pc(10) int local10 = 0; local10 < 3; local10++) {
			@Pc(31) Class6_Sub11 local31 = this.aClass6_Sub11ArrayArrayArray1[local10][arg0][arg1] = this.aClass6_Sub11ArrayArrayArray1[local10 + 1][arg0][arg1];
			if (local31 != null) {
				local31.anInt2020--;
				for (@Pc(41) int local41 = 0; local41 < local31.anInt2022; local41++) {
					@Pc(47) Class44 local47 = local31.aClass44Array3[local41];
					if ((local47.anInt1929 >> 29 & 0x3) == 2 && local47.anInt1936 == arg0 && local47.anInt1955 == arg1) {
						local47.anInt1944--;
					}
				}
			}
		}
		if (this.aClass6_Sub11ArrayArrayArray1[0][arg0][arg1] == null) {
			this.aClass6_Sub11ArrayArrayArray1[0][arg0][arg1] = new Class6_Sub11(0, arg0, arg1);
		}
		this.aClass6_Sub11ArrayArrayArray1[0][arg0][arg1].aClass6_Sub11_1 = local8;
		this.aClass6_Sub11ArrayArrayArray1[3][arg0][arg1] = null;
	}

	@OriginalMember(owner = "client!kb", name = "n", descriptor = "(III)V")
	public void method1059(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class6_Sub11 local8 = this.aClass6_Sub11ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 != null) {
			local8.aClass41_1 = null;
		}
	}

	@OriginalMember(owner = "client!kb", name = "o", descriptor = "(III)I")
	public int method1060(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class6_Sub11 local8 = this.aClass6_Sub11ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 == null) {
			return 0;
		}
		for (@Pc(14) int local14 = 0; local14 < local8.anInt2022; local14++) {
			@Pc(20) Class44 local20 = local8.aClass44Array3[local14];
			if ((local20.anInt1929 >> 29 & 0x3) == 2 && local20.anInt1936 == arg1 && local20.anInt1955 == arg2) {
				return local20.anInt1929;
			}
		}
		return 0;
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "([IIIIII)V")
	public void method1061(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(8) Class6_Sub11 local8 = this.aClass6_Sub11ArrayArrayArray1[arg2][arg3][arg4];
		if (local8 == null) {
			return;
		}
		@Pc(14) Class31 local14 = local8.aClass31_1;
		@Pc(24) int local24;
		if (local14 != null) {
			@Pc(19) int local19 = local14.anInt1396;
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
		local24 = local59.anInt2127;
		@Pc(68) int local68 = local59.anInt2126;
		@Pc(71) int local71 = local59.anInt2125;
		@Pc(74) int local74 = local59.anInt2124;
		@Pc(79) int[] local79 = this.anIntArrayArray9[local24];
		@Pc(84) int[] local84 = this.anIntArrayArray10[local68];
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

	@OriginalMember(owner = "client!kb", name = "p", descriptor = "(III)Z")
	private boolean method1062(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < Static48.anInt1535; local1++) {
			@Pc(6) Class45 local6 = Static48.aClass45Array1[local1];
			@Pc(15) int local15;
			@Pc(27) int local27;
			@Pc(37) int local37;
			@Pc(47) int local47;
			@Pc(57) int local57;
			if (local6.anInt1979 == 1) {
				local15 = local6.anInt1984 - arg0;
				if (local15 > 0) {
					local27 = local6.anInt1996 + (local6.anInt1981 * local15 >> 8);
					local37 = local6.anInt1976 + (local6.anInt1993 * local15 >> 8);
					local47 = local6.anInt1989 + (local6.anInt1994 * local15 >> 8);
					local57 = local6.anInt1985 + (local6.anInt1991 * local15 >> 8);
					if (arg2 >= local27 && arg2 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt1979 == 2) {
				local15 = arg0 - local6.anInt1984;
				if (local15 > 0) {
					local27 = local6.anInt1996 + (local6.anInt1981 * local15 >> 8);
					local37 = local6.anInt1976 + (local6.anInt1993 * local15 >> 8);
					local47 = local6.anInt1989 + (local6.anInt1994 * local15 >> 8);
					local57 = local6.anInt1985 + (local6.anInt1991 * local15 >> 8);
					if (arg2 >= local27 && arg2 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt1979 == 3) {
				local15 = local6.anInt1996 - arg2;
				if (local15 > 0) {
					local27 = local6.anInt1984 + (local6.anInt1987 * local15 >> 8);
					local37 = local6.anInt1990 + (local6.anInt1995 * local15 >> 8);
					local47 = local6.anInt1989 + (local6.anInt1994 * local15 >> 8);
					local57 = local6.anInt1985 + (local6.anInt1991 * local15 >> 8);
					if (arg0 >= local27 && arg0 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt1979 == 4) {
				local15 = arg2 - local6.anInt1996;
				if (local15 > 0) {
					local27 = local6.anInt1984 + (local6.anInt1987 * local15 >> 8);
					local37 = local6.anInt1990 + (local6.anInt1995 * local15 >> 8);
					local47 = local6.anInt1989 + (local6.anInt1994 * local15 >> 8);
					local57 = local6.anInt1985 + (local6.anInt1991 * local15 >> 8);
					if (arg0 >= local27 && arg0 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt1979 == 5) {
				local15 = arg1 - local6.anInt1989;
				if (local15 > 0) {
					local27 = local6.anInt1984 + (local6.anInt1987 * local15 >> 8);
					local37 = local6.anInt1990 + (local6.anInt1995 * local15 >> 8);
					local47 = local6.anInt1996 + (local6.anInt1981 * local15 >> 8);
					local57 = local6.anInt1976 + (local6.anInt1993 * local15 >> 8);
					if (arg0 >= local27 && arg0 <= local37 && arg2 >= local47 && arg2 <= local57) {
						return true;
					}
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(Lclient!pa;IIIIII)V")
	private void method1063(@OriginalArg(0) Class48 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(3) int local3 = arg0.anIntArray197.length;
		@Pc(13) int local13;
		@Pc(20) int local20;
		@Pc(27) int local27;
		@Pc(37) int local37;
		for (@Pc(5) int local5 = 0; local5 < local3; local5++) {
			local13 = arg0.anIntArray197[local5] - Static48.anInt1525;
			local20 = arg0.anIntArray207[local5] - Static48.anInt1530;
			local27 = arg0.anIntArray206[local5] - Static48.anInt1539;
			local37 = local27 * arg3 + local13 * arg4 >> 16;
			@Pc(47) int local47 = local27 * arg4 - local13 * arg3 >> 16;
			@Pc(59) int local59 = local20 * arg2 - local47 * arg1 >> 16;
			@Pc(69) int local69 = local20 * arg1 + local47 * arg2 >> 16;
			if (local69 < 50) {
				return;
			}
			if (arg0.anIntArray202 != null) {
				Static73.anIntArray196[local5] = local37;
				Static73.anIntArray199[local5] = local59;
				Static73.anIntArray203[local5] = local69;
			}
			Static73.anIntArray204[local5] = Static30.anInt1193 + (local37 << 9) / local69;
			Static73.anIntArray200[local5] = Static30.anInt1196 + (local59 << 9) / local69;
		}
		Static30.anInt1191 = 0;
		local3 = arg0.anIntArray201.length;
		for (local13 = 0; local13 < local3; local13++) {
			local20 = arg0.anIntArray201[local13];
			local27 = arg0.anIntArray198[local13];
			local37 = arg0.anIntArray210[local13];
			@Pc(142) int local142 = Static73.anIntArray204[local20];
			@Pc(146) int local146 = Static73.anIntArray204[local27];
			@Pc(150) int local150 = Static73.anIntArray204[local37];
			@Pc(154) int local154 = Static73.anIntArray200[local20];
			@Pc(158) int local158 = Static73.anIntArray200[local27];
			@Pc(162) int local162 = Static73.anIntArray200[local37];
			if ((local142 - local146) * (local162 - local158) - (local154 - local158) * (local150 - local146) > 0) {
				Static30.aBoolean51 = false;
				if (local142 < 0 || local146 < 0 || local150 < 0 || local142 > Static30.anInt1189 || local146 > Static30.anInt1189 || local150 > Static30.anInt1189) {
					Static30.aBoolean51 = true;
				}
				if (Static48.aBoolean70 && this.method1043(Static48.anInt1532, Static48.anInt1528, local154, local158, local162, local142, local146, local150)) {
					Static48.anInt1533 = arg5;
					Static48.anInt1538 = arg6;
				}
				if (arg0.anIntArray202 == null || arg0.anIntArray202[local13] == -1) {
					if (arg0.anIntArray209[local13] != 12345678) {
						Static30.method794(local154, local158, local162, local142, local146, local150, arg0.anIntArray209[local13], arg0.anIntArray205[local13], arg0.anIntArray208[local13]);
					}
				} else if (Static48.aBoolean71) {
					@Pc(364) int local364 = Static30.anInterface4_1.method667(arg0.anIntArray202[local13]);
					Static30.method794(local154, local158, local162, local142, local146, local150, Static48.method1036(local364, arg0.anIntArray209[local13]), Static48.method1036(local364, arg0.anIntArray205[local13]), Static48.method1036(local364, arg0.anIntArray208[local13]));
				} else if (arg0.aBoolean100) {
					Static30.method781(local154, local158, local162, local142, local146, local150, arg0.anIntArray209[local13], arg0.anIntArray205[local13], arg0.anIntArray208[local13], Static73.anIntArray196[0], Static73.anIntArray196[1], Static73.anIntArray196[3], Static73.anIntArray199[0], Static73.anIntArray199[1], Static73.anIntArray199[3], Static73.anIntArray203[0], Static73.anIntArray203[1], Static73.anIntArray203[3], arg0.anIntArray202[local13]);
				} else {
					Static30.method781(local154, local158, local162, local142, local146, local150, arg0.anIntArray209[local13], arg0.anIntArray205[local13], arg0.anIntArray208[local13], Static73.anIntArray196[local20], Static73.anIntArray196[local27], Static73.anIntArray196[local37], Static73.anIntArray199[local20], Static73.anIntArray199[local27], Static73.anIntArray199[local37], Static73.anIntArray203[local20], Static73.anIntArray203[local27], Static73.anIntArray203[local37], arg0.anIntArray202[local13]);
				}
			}
		}
	}

	@OriginalMember(owner = "client!kb", name = "d", descriptor = "()V")
	public void method1064() {
		@Pc(4) int local4;
		@Pc(7) int local7;
		for (@Pc(1) int local1 = 0; local1 < this.anInt1542; local1++) {
			for (local4 = 0; local4 < this.anInt1531; local4++) {
				for (local7 = 0; local7 < this.anInt1540; local7++) {
					this.aClass6_Sub11ArrayArrayArray1[local1][local4][local7] = null;
				}
			}
		}
		for (local4 = 0; local4 < Static48.anInt1544; local4++) {
			for (local7 = 0; local7 < Static48.anIntArray143[local4]; local7++) {
				Static48.aClass45ArrayArray1[local4][local7] = null;
			}
			Static48.anIntArray143[local4] = 0;
		}
		for (local7 = 0; local7 < this.anInt1521; local7++) {
			this.aClass44Array1[local7] = null;
		}
		this.anInt1521 = 0;
		for (@Pc(76) int local76 = 0; local76 < Static48.aClass44Array2.length; local76++) {
			Static48.aClass44Array2[local76] = null;
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(Lclient!ob;Z)V")
	private void method1065(@OriginalArg(0) Class6_Sub11 arg0, @OriginalArg(1) boolean arg1) {
		Static48.aClass3_4.method23(arg0);
		while (true) {
			@Pc(8) Class6_Sub11 local8;
			@Pc(17) int local17;
			@Pc(20) int local20;
			@Pc(23) int local23;
			@Pc(26) int local26;
			@Pc(31) Class6_Sub11[][] local31;
			@Pc(49) Class6_Sub11 local49;
			@Pc(251) int local251;
			@Pc(578) int local578;
			@Pc(583) int local583;
			@Pc(588) int local588;
			@Pc(591) int local591;
			@Pc(600) int local600;
			@Pc(942) Class41 local942;
			@Pc(1116) int local1116;
			@Pc(1001) int local1001;
			do {
				do {
					do {
						do {
							do {
								do {
									while (true) {
										@Pc(257) Class44 var12;
										@Pc(612) int var19;
										@Pc(335) int var23;
										@Pc(289) boolean var24;
										@Pc(823) Class6_Sub11 var35;
										while (true) {
											do {
												local8 = (Class6_Sub11) Static48.aClass3_4.method34();
												if (local8 == null) {
													return;
												}
											} while (!local8.aBoolean94);
											local17 = local8.anInt2028;
											local20 = local8.anInt2021;
											local23 = local8.anInt2020;
											local26 = local8.anInt2026;
											local31 = this.aClass6_Sub11ArrayArrayArray1[local23];
											if (!local8.aBoolean93) {
												break;
											}
											if (arg1) {
												if (local23 > 0) {
													local49 = this.aClass6_Sub11ArrayArrayArray1[local23 - 1][local17][local20];
													if (local49 != null && local49.aBoolean94) {
														continue;
													}
												}
												if (local17 <= Static48.anInt1546 && local17 > Static48.anInt1541) {
													local49 = local31[local17 - 1][local20];
													if (local49 != null && local49.aBoolean94 && (local49.aBoolean93 || (local8.anInt2025 & 0x1) == 0)) {
														continue;
													}
												}
												if (local17 >= Static48.anInt1546 && local17 < Static48.anInt1524 - 1) {
													local49 = local31[local17 + 1][local20];
													if (local49 != null && local49.aBoolean94 && (local49.aBoolean93 || (local8.anInt2025 & 0x4) == 0)) {
														continue;
													}
												}
												if (local20 <= Static48.anInt1534 && local20 > Static48.anInt1536) {
													local49 = local31[local17][local20 - 1];
													if (local49 != null && local49.aBoolean94 && (local49.aBoolean93 || (local8.anInt2025 & 0x8) == 0)) {
														continue;
													}
												}
												if (local20 >= Static48.anInt1534 && local20 < Static48.anInt1543 - 1) {
													local49 = local31[local17][local20 + 1];
													if (local49 != null && local49.aBoolean94 && (local49.aBoolean93 || (local8.anInt2025 & 0x2) == 0)) {
														continue;
													}
												}
											} else {
												arg1 = true;
											}
											local8.aBoolean93 = false;
											if (local8.aClass6_Sub11_1 != null) {
												local49 = local8.aClass6_Sub11_1;
												if (local49.aClass31_1 == null) {
													if (local49.aClass48_1 != null && !this.method1035(0, local17, local20)) {
														this.method1063(local49.aClass48_1, Static48.anInt1522, Static48.anInt1527, Static48.anInt1545, Static48.anInt1547, local17, local20);
													}
												} else if (!this.method1035(0, local17, local20)) {
													this.method1044(local49.aClass31_1, 0, Static48.anInt1522, Static48.anInt1527, Static48.anInt1545, Static48.anInt1547, local17, local20);
												}
												@Pc(225) Class41 local225 = local49.aClass41_1;
												if (local225 != null) {
													local225.aClass6_Sub2_Sub3_5.method2065(0, Static48.anInt1522, Static48.anInt1527, Static48.anInt1545, Static48.anInt1547, local225.anInt1880 - Static48.anInt1525, local225.anInt1882 - Static48.anInt1530, local225.anInt1878 - Static48.anInt1539, local225.anInt1871);
												}
												for (local251 = 0; local251 < local49.anInt2022; local251++) {
													var12 = local49.aClass44Array3[local251];
													if (var12 != null) {
														var12.aClass6_Sub2_Sub3_7.method2065(var12.anInt1953, Static48.anInt1522, Static48.anInt1527, Static48.anInt1545, Static48.anInt1547, var12.anInt1950 - Static48.anInt1525, var12.anInt1940 - Static48.anInt1530, var12.anInt1937 - Static48.anInt1539, var12.anInt1929);
													}
												}
											}
											var24 = false;
											if (local8.aClass31_1 == null) {
												if (local8.aClass48_1 != null && !this.method1035(local26, local17, local20)) {
													var24 = true;
													this.method1063(local8.aClass48_1, Static48.anInt1522, Static48.anInt1527, Static48.anInt1545, Static48.anInt1547, local17, local20);
												}
											} else if (!this.method1035(local26, local17, local20)) {
												var24 = true;
												this.method1044(local8.aClass31_1, local26, Static48.anInt1522, Static48.anInt1527, Static48.anInt1545, Static48.anInt1547, local17, local20);
											}
											var23 = 0;
											local251 = 0;
											@Pc(340) Class41 local340 = local8.aClass41_1;
											@Pc(343) Class54 local343 = local8.aClass54_1;
											if (local340 != null || local343 != null) {
												if (Static48.anInt1546 == local17) {
													var23++;
												} else if (Static48.anInt1546 < local17) {
													var23 += 2;
												}
												if (Static48.anInt1534 == local20) {
													var23 += 3;
												} else if (Static48.anInt1534 > local20) {
													var23 += 6;
												}
												local251 = Static48.anIntArray151[var23];
												local8.anInt2024 = Static48.anIntArray147[var23];
											}
											if (local340 != null) {
												if ((local340.anInt1881 & Static48.anIntArray154[var23]) == 0) {
													local8.anInt2027 = 0;
												} else if (local340.anInt1881 == 16) {
													local8.anInt2027 = 3;
													local8.anInt2019 = Static48.anIntArray153[var23];
													local8.anInt2029 = 3 - local8.anInt2019;
												} else if (local340.anInt1881 == 32) {
													local8.anInt2027 = 6;
													local8.anInt2019 = Static48.anIntArray150[var23];
													local8.anInt2029 = 6 - local8.anInt2019;
												} else if (local340.anInt1881 == 64) {
													local8.anInt2027 = 12;
													local8.anInt2019 = Static48.anIntArray148[var23];
													local8.anInt2029 = 12 - local8.anInt2019;
												} else {
													local8.anInt2027 = 9;
													local8.anInt2019 = Static48.anIntArray149[var23];
													local8.anInt2029 = 9 - local8.anInt2019;
												}
												if ((local340.anInt1881 & local251) != 0 && !this.method1023(local26, local17, local20, local340.anInt1881)) {
													local340.aClass6_Sub2_Sub3_5.method2065(0, Static48.anInt1522, Static48.anInt1527, Static48.anInt1545, Static48.anInt1547, local340.anInt1880 - Static48.anInt1525, local340.anInt1882 - Static48.anInt1530, local340.anInt1878 - Static48.anInt1539, local340.anInt1871);
												}
												if ((local340.anInt1874 & local251) != 0 && !this.method1023(local26, local17, local20, local340.anInt1874)) {
													local340.aClass6_Sub2_Sub3_6.method2065(0, Static48.anInt1522, Static48.anInt1527, Static48.anInt1545, Static48.anInt1547, local340.anInt1880 - Static48.anInt1525, local340.anInt1882 - Static48.anInt1530, local340.anInt1878 - Static48.anInt1539, local340.anInt1871);
												}
											}
											if (local343 != null && !this.method1054(local26, local17, local20, local343.aClass6_Sub2_Sub3_8.anInt3206)) {
												if ((local343.anInt2338 & local251) != 0) {
													local343.aClass6_Sub2_Sub3_8.method2065(local343.anInt2328, Static48.anInt1522, Static48.anInt1527, Static48.anInt1545, Static48.anInt1547, local343.anInt2326 - Static48.anInt1525, local343.anInt2330 - Static48.anInt1530, local343.anInt2339 - Static48.anInt1539, local343.anInt2335);
												} else if ((local343.anInt2338 & 0x300) != 0) {
													local578 = local343.anInt2326 - Static48.anInt1525;
													local583 = local343.anInt2330 - Static48.anInt1530;
													local588 = local343.anInt2339 - Static48.anInt1539;
													local591 = local343.anInt2328;
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
													if ((local343.anInt2338 & 0x100) != 0 && var19 < local600) {
														local629 = local578 + Static48.anIntArray144[local591];
														local635 = local588 + Static48.anIntArray145[local591];
														local343.aClass6_Sub2_Sub3_8.method2065(local591 * 512 + 256, Static48.anInt1522, Static48.anInt1527, Static48.anInt1545, Static48.anInt1547, local629, local583, local635, local343.anInt2335);
													}
													if ((local343.anInt2338 & 0x200) != 0 && var19 > local600) {
														local629 = local578 + Static48.anIntArray142[local591];
														local635 = local588 + Static48.anIntArray141[local591];
														local343.aClass6_Sub2_Sub3_8.method2065(local591 * 512 + 1280 & 0x7FF, Static48.anInt1522, Static48.anInt1527, Static48.anInt1545, Static48.anInt1547, local629, local583, local635, local343.anInt2335);
													}
												}
											}
											if (var24) {
												@Pc(696) Class23 local696 = local8.aClass23_1;
												if (local696 != null) {
													local696.aClass6_Sub2_Sub3_4.method2065(0, Static48.anInt1522, Static48.anInt1527, Static48.anInt1545, Static48.anInt1547, local696.anInt1148 - Static48.anInt1525, local696.anInt1149 - Static48.anInt1530, local696.anInt1145 - Static48.anInt1539, local696.anInt1144);
												}
												@Pc(723) Class13 local723 = local8.aClass13_1;
												if (local723 != null && local723.anInt934 == 0) {
													if (local723.aClass6_Sub2_Sub3_1 != null) {
														local723.aClass6_Sub2_Sub3_1.method2065(0, Static48.anInt1522, Static48.anInt1527, Static48.anInt1545, Static48.anInt1547, local723.anInt933 - Static48.anInt1525, local723.anInt935 - Static48.anInt1530, local723.anInt942 - Static48.anInt1539, local723.anInt941);
													}
													if (local723.aClass6_Sub2_Sub3_2 != null) {
														local723.aClass6_Sub2_Sub3_2.method2065(0, Static48.anInt1522, Static48.anInt1527, Static48.anInt1545, Static48.anInt1547, local723.anInt933 - Static48.anInt1525, local723.anInt935 - Static48.anInt1530, local723.anInt942 - Static48.anInt1539, local723.anInt941);
													}
													if (local723.aClass6_Sub2_Sub3_3 != null) {
														local723.aClass6_Sub2_Sub3_3.method2065(0, Static48.anInt1522, Static48.anInt1527, Static48.anInt1545, Static48.anInt1547, local723.anInt933 - Static48.anInt1525, local723.anInt935 - Static48.anInt1530, local723.anInt942 - Static48.anInt1539, local723.anInt941);
													}
												}
											}
											local578 = local8.anInt2025;
											if (local578 != 0) {
												if (local17 < Static48.anInt1546 && (local578 & 0x4) != 0) {
													var35 = local31[local17 + 1][local20];
													if (var35 != null && var35.aBoolean94) {
														Static48.aClass3_4.method23(var35);
													}
												}
												if (local20 < Static48.anInt1534 && (local578 & 0x2) != 0) {
													var35 = local31[local17][local20 + 1];
													if (var35 != null && var35.aBoolean94) {
														Static48.aClass3_4.method23(var35);
													}
												}
												if (local17 > Static48.anInt1546 && (local578 & 0x1) != 0) {
													var35 = local31[local17 - 1][local20];
													if (var35 != null && var35.aBoolean94) {
														Static48.aClass3_4.method23(var35);
													}
												}
												if (local20 > Static48.anInt1534 && (local578 & 0x8) != 0) {
													var35 = local31[local17][local20 - 1];
													if (var35 != null && var35.aBoolean94) {
														Static48.aClass3_4.method23(var35);
													}
												}
											}
											break;
										}
										if (local8.anInt2027 != 0) {
											var24 = true;
											for (var23 = 0; var23 < local8.anInt2022; var23++) {
												if (local8.aClass44Array3[var23].anInt1928 != Static48.anInt1523 && (local8.anIntArray189[var23] & local8.anInt2027) == local8.anInt2019) {
													var24 = false;
													break;
												}
											}
											if (var24) {
												local942 = local8.aClass41_1;
												if (!this.method1023(local26, local17, local20, local942.anInt1881)) {
													local942.aClass6_Sub2_Sub3_5.method2065(0, Static48.anInt1522, Static48.anInt1527, Static48.anInt1545, Static48.anInt1547, local942.anInt1880 - Static48.anInt1525, local942.anInt1882 - Static48.anInt1530, local942.anInt1878 - Static48.anInt1539, local942.anInt1871);
												}
												local8.anInt2027 = 0;
											}
										}
										if (!local8.aBoolean91) {
											break;
										}
										try {
											@Pc(981) int local981 = local8.anInt2022;
											local8.aBoolean91 = false;
											var23 = 0;
											label559: for (local251 = 0; local251 < local981; local251++) {
												var12 = local8.aClass44Array3[local251];
												if (var12.anInt1928 != Static48.anInt1523) {
													for (local1001 = var12.anInt1936; local1001 <= var12.anInt1947; local1001++) {
														for (local578 = var12.anInt1955; local578 <= var12.anInt1934; local578++) {
															var35 = local31[local1001][local578];
															if (var35.aBoolean93) {
																local8.aBoolean91 = true;
																continue label559;
															}
															if (var35.anInt2027 != 0) {
																local588 = 0;
																if (local1001 > var12.anInt1936) {
																	local588++;
																}
																if (local1001 < var12.anInt1947) {
																	local588 += 4;
																}
																if (local578 > var12.anInt1955) {
																	local588 += 8;
																}
																if (local578 < var12.anInt1934) {
																	local588 += 2;
																}
																if ((local588 & var35.anInt2027) == local8.anInt2029) {
																	local8.aBoolean91 = true;
																	continue label559;
																}
															}
														}
													}
													Static48.aClass44Array2[var23++] = var12;
													local578 = Static48.anInt1546 - var12.anInt1936;
													local583 = var12.anInt1947 - Static48.anInt1546;
													if (local583 > local578) {
														local578 = local583;
													}
													local588 = Static48.anInt1534 - var12.anInt1955;
													local591 = var12.anInt1934 - Static48.anInt1534;
													if (local591 > local588) {
														var12.anInt1954 = local578 + local591;
													} else {
														var12.anInt1954 = local578 + local588;
													}
												}
											}
											while (var23 > 0) {
												local1116 = -50;
												local1001 = -1;
												@Pc(1125) Class44 local1125;
												for (local578 = 0; local578 < var23; local578++) {
													local1125 = Static48.aClass44Array2[local578];
													if (local1125.anInt1928 != Static48.anInt1523) {
														if (local1125.anInt1954 > local1116) {
															local1116 = local1125.anInt1954;
															local1001 = local578;
														} else if (local1125.anInt1954 == local1116) {
															local588 = local1125.anInt1950 - Static48.anInt1525;
															local591 = local1125.anInt1937 - Static48.anInt1539;
															local600 = Static48.aClass44Array2[local1001].anInt1950 - Static48.anInt1525;
															var19 = Static48.aClass44Array2[local1001].anInt1937 - Static48.anInt1539;
															if (local588 * local588 + local591 * local591 > local600 * local600 + var19 * var19) {
																local1001 = local578;
															}
														}
													}
												}
												if (local1001 == -1) {
													break;
												}
												local1125 = Static48.aClass44Array2[local1001];
												local1125.anInt1928 = Static48.anInt1523;
												if (!this.method1042(local26, local1125.anInt1936, local1125.anInt1947, local1125.anInt1955, local1125.anInt1934, local1125.aClass6_Sub2_Sub3_7.anInt3206)) {
													local1125.aClass6_Sub2_Sub3_7.method2065(local1125.anInt1953, Static48.anInt1522, Static48.anInt1527, Static48.anInt1545, Static48.anInt1547, local1125.anInt1950 - Static48.anInt1525, local1125.anInt1940 - Static48.anInt1530, local1125.anInt1937 - Static48.anInt1539, local1125.anInt1929);
												}
												for (local588 = local1125.anInt1936; local588 <= local1125.anInt1947; local588++) {
													for (local591 = local1125.anInt1955; local591 <= local1125.anInt1934; local591++) {
														@Pc(1250) Class6_Sub11 local1250 = local31[local588][local591];
														if (local1250.anInt2027 != 0) {
															Static48.aClass3_4.method23(local1250);
														} else if ((local588 != local17 || local591 != local20) && local1250.aBoolean94) {
															Static48.aClass3_4.method23(local1250);
														}
													}
												}
											}
											if (!local8.aBoolean91) {
												break;
											}
										} catch (@Pc(1288) Exception local1288) {
											local8.aBoolean91 = false;
											break;
										}
									}
								} while (!local8.aBoolean94);
							} while (local8.anInt2027 != 0);
							if (local17 > Static48.anInt1546 || local17 <= Static48.anInt1541) {
								break;
							}
							local49 = local31[local17 - 1][local20];
						} while (local49 != null && local49.aBoolean94);
						if (local17 < Static48.anInt1546 || local17 >= Static48.anInt1524 - 1) {
							break;
						}
						local49 = local31[local17 + 1][local20];
					} while (local49 != null && local49.aBoolean94);
					if (local20 > Static48.anInt1534 || local20 <= Static48.anInt1536) {
						break;
					}
					local49 = local31[local17][local20 - 1];
				} while (local49 != null && local49.aBoolean94);
				if (local20 < Static48.anInt1534 || local20 >= Static48.anInt1543 - 1) {
					break;
				}
				local49 = local31[local17][local20 + 1];
			} while (local49 != null && local49.aBoolean94);
			local8.aBoolean94 = false;
			Static48.anInt1526--;
			@Pc(1392) Class13 local1392 = local8.aClass13_1;
			if (local1392 != null && local1392.anInt934 != 0) {
				if (local1392.aClass6_Sub2_Sub3_1 != null) {
					local1392.aClass6_Sub2_Sub3_1.method2065(0, Static48.anInt1522, Static48.anInt1527, Static48.anInt1545, Static48.anInt1547, local1392.anInt933 - Static48.anInt1525, local1392.anInt935 - Static48.anInt1530 - local1392.anInt934, local1392.anInt942 - Static48.anInt1539, local1392.anInt941);
				}
				if (local1392.aClass6_Sub2_Sub3_2 != null) {
					local1392.aClass6_Sub2_Sub3_2.method2065(0, Static48.anInt1522, Static48.anInt1527, Static48.anInt1545, Static48.anInt1547, local1392.anInt933 - Static48.anInt1525, local1392.anInt935 - Static48.anInt1530 - local1392.anInt934, local1392.anInt942 - Static48.anInt1539, local1392.anInt941);
				}
				if (local1392.aClass6_Sub2_Sub3_3 != null) {
					local1392.aClass6_Sub2_Sub3_3.method2065(0, Static48.anInt1522, Static48.anInt1527, Static48.anInt1545, Static48.anInt1547, local1392.anInt933 - Static48.anInt1525, local1392.anInt935 - Static48.anInt1530 - local1392.anInt934, local1392.anInt942 - Static48.anInt1539, local1392.anInt941);
				}
			}
			if (local8.anInt2024 != 0) {
				@Pc(1487) Class54 local1487 = local8.aClass54_1;
				if (local1487 != null && !this.method1054(local26, local17, local20, local1487.aClass6_Sub2_Sub3_8.anInt3206)) {
					if ((local1487.anInt2338 & local8.anInt2024) != 0) {
						local1487.aClass6_Sub2_Sub3_8.method2065(local1487.anInt2328, Static48.anInt1522, Static48.anInt1527, Static48.anInt1545, Static48.anInt1547, local1487.anInt2326 - Static48.anInt1525, local1487.anInt2330 - Static48.anInt1530, local1487.anInt2339 - Static48.anInt1539, local1487.anInt2335);
					} else if ((local1487.anInt2338 & 0x300) != 0) {
						local251 = local1487.anInt2326 - Static48.anInt1525;
						local1116 = local1487.anInt2330 - Static48.anInt1530;
						local1001 = local1487.anInt2339 - Static48.anInt1539;
						local578 = local1487.anInt2328;
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
						if ((local1487.anInt2338 & 0x100) != 0 && local588 >= local583) {
							local591 = local251 + Static48.anIntArray144[local578];
							local600 = local1001 + Static48.anIntArray145[local578];
							local1487.aClass6_Sub2_Sub3_8.method2065(local578 * 512 + 256, Static48.anInt1522, Static48.anInt1527, Static48.anInt1545, Static48.anInt1547, local591, local1116, local600, local1487.anInt2335);
						}
						if ((local1487.anInt2338 & 0x200) != 0 && local588 <= local583) {
							local591 = local251 + Static48.anIntArray142[local578];
							local600 = local1001 + Static48.anIntArray141[local578];
							local1487.aClass6_Sub2_Sub3_8.method2065(local578 * 512 + 1280 & 0x7FF, Static48.anInt1522, Static48.anInt1527, Static48.anInt1545, Static48.anInt1547, local591, local1116, local600, local1487.anInt2335);
						}
					}
				}
				local942 = local8.aClass41_1;
				if (local942 != null) {
					if ((local942.anInt1874 & local8.anInt2024) != 0 && !this.method1023(local26, local17, local20, local942.anInt1874)) {
						local942.aClass6_Sub2_Sub3_6.method2065(0, Static48.anInt1522, Static48.anInt1527, Static48.anInt1545, Static48.anInt1547, local942.anInt1880 - Static48.anInt1525, local942.anInt1882 - Static48.anInt1530, local942.anInt1878 - Static48.anInt1539, local942.anInt1871);
					}
					if ((local942.anInt1881 & local8.anInt2024) != 0 && !this.method1023(local26, local17, local20, local942.anInt1881)) {
						local942.aClass6_Sub2_Sub3_5.method2065(0, Static48.anInt1522, Static48.anInt1527, Static48.anInt1545, Static48.anInt1547, local942.anInt1880 - Static48.anInt1525, local942.anInt1882 - Static48.anInt1530, local942.anInt1878 - Static48.anInt1539, local942.anInt1871);
					}
				}
			}
			@Pc(1745) Class6_Sub11 local1745;
			if (local23 < this.anInt1542 - 1) {
				local1745 = this.aClass6_Sub11ArrayArrayArray1[local23 + 1][local17][local20];
				if (local1745 != null && local1745.aBoolean94) {
					Static48.aClass3_4.method23(local1745);
				}
			}
			if (local17 < Static48.anInt1546) {
				local1745 = local31[local17 + 1][local20];
				if (local1745 != null && local1745.aBoolean94) {
					Static48.aClass3_4.method23(local1745);
				}
			}
			if (local20 < Static48.anInt1534) {
				local1745 = local31[local17][local20 + 1];
				if (local1745 != null && local1745.aBoolean94) {
					Static48.aClass3_4.method23(local1745);
				}
			}
			if (local17 > Static48.anInt1546) {
				local1745 = local31[local17 - 1][local20];
				if (local1745 != null && local1745.aBoolean94) {
					Static48.aClass3_4.method23(local1745);
				}
			}
			if (local20 > Static48.anInt1534) {
				local1745 = local31[local17][local20 - 1];
				if (local1745 != null && local1745.aBoolean94) {
					Static48.aClass3_4.method23(local1745);
				}
			}
		}
	}

	@OriginalMember(owner = "client!kb", name = "q", descriptor = "(III)V")
	public void method1066(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class6_Sub11 local8 = this.aClass6_Sub11ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 != null) {
			local8.aClass23_1 = null;
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(Lclient!jb;III)V")
	private void method1067(@OriginalArg(0) Class6_Sub2_Sub3_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(14) Class6_Sub11 local14;
		@Pc(29) Class6_Sub2_Sub3_Sub3 local29;
		if (arg2 < this.anInt1531) {
			local14 = this.aClass6_Sub11ArrayArrayArray1[arg1][arg2 + 1][arg3];
			if (local14 != null && local14.aClass23_1 != null && local14.aClass23_1.aClass6_Sub2_Sub3_4 instanceof Class6_Sub2_Sub3_Sub3) {
				local29 = (Class6_Sub2_Sub3_Sub3) local14.aClass23_1.aClass6_Sub2_Sub3_4;
				if (local29.aClass47Array2 != null) {
					this.method1071(arg0, local29, 128, 0, 0, true);
				}
			}
		}
		if (arg3 < this.anInt1531) {
			local14 = this.aClass6_Sub11ArrayArrayArray1[arg1][arg2][arg3 + 1];
			if (local14 != null && local14.aClass23_1 != null && local14.aClass23_1.aClass6_Sub2_Sub3_4 instanceof Class6_Sub2_Sub3_Sub3) {
				local29 = (Class6_Sub2_Sub3_Sub3) local14.aClass23_1.aClass6_Sub2_Sub3_4;
				if (local29.aClass47Array2 != null) {
					this.method1071(arg0, local29, 0, 0, 128, true);
				}
			}
		}
		if (arg2 < this.anInt1531 && arg3 < this.anInt1540) {
			local14 = this.aClass6_Sub11ArrayArrayArray1[arg1][arg2 + 1][arg3 + 1];
			if (local14 != null && local14.aClass23_1 != null && local14.aClass23_1.aClass6_Sub2_Sub3_4 instanceof Class6_Sub2_Sub3_Sub3) {
				local29 = (Class6_Sub2_Sub3_Sub3) local14.aClass23_1.aClass6_Sub2_Sub3_4;
				if (local29.aClass47Array2 != null) {
					this.method1071(arg0, local29, 128, 0, 128, true);
				}
			}
		}
		if (arg2 >= this.anInt1531 || arg3 <= 0) {
			return;
		}
		local14 = this.aClass6_Sub11ArrayArrayArray1[arg1][arg2 + 1][arg3 - 1];
		if (local14 != null && local14.aClass23_1 != null && local14.aClass23_1.aClass6_Sub2_Sub3_4 instanceof Class6_Sub2_Sub3_Sub3) {
			local29 = (Class6_Sub2_Sub3_Sub3) local14.aClass23_1.aClass6_Sub2_Sub3_4;
			if (local29.aClass47Array2 != null) {
				this.method1071(arg0, local29, 128, 0, -128, true);
			}
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(I)V")
	public void method1068(@OriginalArg(0) int arg0) {
		this.anInt1529 = arg0;
		for (@Pc(4) int local4 = 0; local4 < this.anInt1531; local4++) {
			for (@Pc(7) int local7 = 0; local7 < this.anInt1540; local7++) {
				if (this.aClass6_Sub11ArrayArrayArray1[arg0][local4][local7] == null) {
					this.aClass6_Sub11ArrayArrayArray1[arg0][local4][local7] = new Class6_Sub11(arg0, local4, local7);
				}
			}
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(Lclient!jb;IIIII)V")
	private void method1069(@OriginalArg(0) Class6_Sub2_Sub3_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(1) boolean local1 = true;
		@Pc(3) int local3 = arg2;
		@Pc(7) int local7 = arg2 + arg4;
		@Pc(11) int local11 = arg3 - 1;
		@Pc(15) int local15 = arg3 + arg5;
		for (@Pc(17) int local17 = arg1; local17 <= arg1 + 1; local17++) {
			if (local17 != this.anInt1542) {
				for (@Pc(24) int local24 = local3; local24 <= local7; local24++) {
					if (local24 >= 0 && local24 < this.anInt1531) {
						for (@Pc(34) int local34 = local11; local34 <= local15; local34++) {
							if (local34 >= 0 && local34 < this.anInt1540 && (!local1 || local24 >= local7 || local34 >= local15 || local34 < arg3 && local24 != arg2)) {
								@Pc(66) Class6_Sub11 local66 = this.aClass6_Sub11ArrayArrayArray1[local17][local24][local34];
								if (local66 != null) {
									@Pc(160) int local160 = (this.anIntArrayArrayArray5[local17][local24][local34] + this.anIntArrayArrayArray5[local17][local24 + 1][local34] + this.anIntArrayArrayArray5[local17][local24][local34 + 1] + this.anIntArrayArrayArray5[local17][local24 + 1][local34 + 1]) / 4 - (this.anIntArrayArrayArray5[arg1][arg2][arg3] + this.anIntArrayArrayArray5[arg1][arg2 + 1][arg3] + this.anIntArrayArrayArray5[arg1][arg2][arg3 + 1] + this.anIntArrayArrayArray5[arg1][arg2 + 1][arg3 + 1]) / 4;
									@Pc(163) Class41 local163 = local66.aClass41_1;
									if (local163 != null) {
										@Pc(173) Class6_Sub2_Sub3_Sub3 local173;
										if (local163.aClass6_Sub2_Sub3_5 instanceof Class6_Sub2_Sub3_Sub3) {
											local173 = (Class6_Sub2_Sub3_Sub3) local163.aClass6_Sub2_Sub3_5;
											if (local173.aClass47Array2 != null) {
												this.method1071(arg0, local173, (local24 - arg2) * 128 + (1 - arg4) * 64, local160, (local34 - arg3) * 128 + (1 - arg5) * 64, local1);
											}
										}
										if (local163.aClass6_Sub2_Sub3_6 instanceof Class6_Sub2_Sub3_Sub3) {
											local173 = (Class6_Sub2_Sub3_Sub3) local163.aClass6_Sub2_Sub3_6;
											if (local173.aClass47Array2 != null) {
												this.method1071(arg0, local173, (local24 - arg2) * 128 + (1 - arg4) * 64, local160, (local34 - arg3) * 128 + (1 - arg5) * 64, local1);
											}
										}
									}
									for (@Pc(245) int local245 = 0; local245 < local66.anInt2022; local245++) {
										@Pc(251) Class44 local251 = local66.aClass44Array3[local245];
										if (local251 != null && local251.aClass6_Sub2_Sub3_7 instanceof Class6_Sub2_Sub3_Sub3) {
											@Pc(261) Class6_Sub2_Sub3_Sub3 local261 = (Class6_Sub2_Sub3_Sub3) local251.aClass6_Sub2_Sub3_7;
											if (local261.aClass47Array2 != null) {
												@Pc(272) int local272 = local251.anInt1947 + 1 - local251.anInt1936;
												@Pc(280) int local280 = local251.anInt1934 + 1 - local251.anInt1955;
												this.method1071(arg0, local261, (local251.anInt1936 - arg2) * 128 + (local272 - arg4) * 64, local160, (local251.anInt1955 - arg3) * 128 + (local280 - arg5) * 64, local1);
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

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(IIIILclient!k;Lclient!k;IIII)V")
	public void method1070(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class6_Sub2_Sub3 arg4, @OriginalArg(5) Class6_Sub2_Sub3 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		if (arg4 == null && arg5 == null) {
			return;
		}
		@Pc(8) Class41 local8 = new Class41();
		local8.anInt1871 = arg8;
		local8.anInt1877 = arg9;
		local8.anInt1880 = arg1 * 128 + 64;
		local8.anInt1878 = arg2 * 128 + 64;
		local8.anInt1882 = arg3;
		local8.aClass6_Sub2_Sub3_5 = arg4;
		local8.aClass6_Sub2_Sub3_6 = arg5;
		local8.anInt1881 = arg6;
		local8.anInt1874 = arg7;
		for (@Pc(45) int local45 = arg0; local45 >= 0; local45--) {
			if (this.aClass6_Sub11ArrayArrayArray1[local45][arg1][arg2] == null) {
				this.aClass6_Sub11ArrayArrayArray1[local45][arg1][arg2] = new Class6_Sub11(local45, arg1, arg2);
			}
		}
		this.aClass6_Sub11ArrayArrayArray1[arg0][arg1][arg2].aClass41_1 = local8;
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(Lclient!jb;Lclient!jb;IIIZ)V")
	private void method1071(@OriginalArg(0) Class6_Sub2_Sub3_Sub3 arg0, @OriginalArg(1) Class6_Sub2_Sub3_Sub3 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		arg1.method953();
		this.anInt1548++;
		@Pc(9) int local9 = 0;
		@Pc(12) int[] local12 = arg1.anIntArray114;
		@Pc(15) int local15 = arg1.anInt1446;
		for (@Pc(17) int local17 = 0; local17 < arg0.anInt1446; local17++) {
			@Pc(23) Class47 local23 = arg0.aClass47Array2[local17];
			@Pc(28) Class47 local28 = arg0.aClass47Array1[local17];
			if (local28.anInt2114 != 0) {
				@Pc(38) int local38 = arg0.anIntArray112[local17] - arg3;
				if (local38 <= arg1.anInt1447) {
					@Pc(49) int local49 = arg0.anIntArray114[local17] - arg2;
					if (local49 >= arg1.anInt1442 && local49 <= arg1.anInt1441) {
						@Pc(65) int local65 = arg0.anIntArray110[local17] - arg4;
						if (local65 >= arg1.anInt1450 && local65 <= arg1.anInt1449) {
							for (@Pc(76) int local76 = 0; local76 < local15; local76++) {
								@Pc(82) Class47 local82 = arg1.aClass47Array2[local76];
								@Pc(87) Class47 local87 = arg1.aClass47Array1[local76];
								if (local49 == local12[local76] && local65 == arg1.anIntArray110[local76] && local38 == arg1.anIntArray112[local76] && local87.anInt2114 != 0) {
									local23.anInt2113 += local87.anInt2113;
									local23.anInt2123 += local87.anInt2123;
									local23.anInt2115 += local87.anInt2115;
									local23.anInt2114 += local87.anInt2114;
									local82.anInt2113 += local28.anInt2113;
									local82.anInt2123 += local28.anInt2123;
									local82.anInt2115 += local28.anInt2115;
									local82.anInt2114 += local28.anInt2114;
									local9++;
									this.anIntArray146[local17] = this.anInt1548;
									this.anIntArray152[local76] = this.anInt1548;
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
		for (@Pc(193) int local193 = 0; local193 < arg0.anInt1443; local193++) {
			if (this.anIntArray146[arg0.anIntArray101[local193]] == this.anInt1548 && this.anIntArray146[arg0.anIntArray105[local193]] == this.anInt1548 && this.anIntArray146[arg0.anIntArray102[local193]] == this.anInt1548) {
				arg0.anIntArray100[local193] = -1;
			}
		}
		for (@Pc(236) int local236 = 0; local236 < arg1.anInt1443; local236++) {
			if (this.anIntArray152[arg1.anIntArray101[local236]] == this.anInt1548 && this.anIntArray152[arg1.anIntArray105[local236]] == this.anInt1548 && this.anIntArray152[arg1.anIntArray102[local236]] == this.anInt1548) {
				arg1.anIntArray100[local236] = -1;
			}
		}
	}
}
