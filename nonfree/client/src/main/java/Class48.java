import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!le")
public final class Class48 {

	@OriginalMember(owner = "client!le", name = "n", descriptor = "[Lclient!qa;")
	private final Class66[] aClass66Array1 = new Class66[5000];

	@OriginalMember(owner = "client!le", name = "h", descriptor = "I")
	private int anInt1605 = 0;

	@OriginalMember(owner = "client!le", name = "C", descriptor = "I")
	private int anInt1619 = 0;

	@OriginalMember(owner = "client!le", name = "bb", descriptor = "[[I")
	private final int[][] anIntArrayArray42 = new int[][] { new int[16], { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 1 }, { 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0 }, { 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1 }, { 1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 1 } };

	@OriginalMember(owner = "client!le", name = "db", descriptor = "[[I")
	private final int[][] anIntArrayArray43 = new int[][] { { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 }, { 12, 8, 4, 0, 13, 9, 5, 1, 14, 10, 6, 2, 15, 11, 7, 3 }, { 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 }, { 3, 7, 11, 15, 2, 6, 10, 14, 1, 5, 9, 13, 0, 4, 8, 12 } };

	@OriginalMember(owner = "client!le", name = "z", descriptor = "I")
	private final int anInt1617;

	@OriginalMember(owner = "client!le", name = "L", descriptor = "I")
	private final int anInt1626;

	@OriginalMember(owner = "client!le", name = "B", descriptor = "I")
	private final int anInt1618;

	@OriginalMember(owner = "client!le", name = "w", descriptor = "[[[Lclient!vc;")
	private final Class4_Sub22[][][] aClass4_Sub22ArrayArrayArray1;

	@OriginalMember(owner = "client!le", name = "b", descriptor = "[[[I")
	private final int[][][] anIntArrayArrayArray4;

	@OriginalMember(owner = "client!le", name = "M", descriptor = "[[[I")
	private final int[][][] anIntArrayArrayArray5;

	@OriginalMember(owner = "client!le", name = "<init>", descriptor = "(III[[[I)V")
	public Class48(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[][][] arg3) {
		this.anInt1617 = arg0;
		this.anInt1626 = arg1;
		this.anInt1618 = arg2;
		this.aClass4_Sub22ArrayArrayArray1 = new Class4_Sub22[arg0][arg1][arg2];
		this.anIntArrayArrayArray4 = new int[arg0][arg1 + 1][arg2 + 1];
		this.anIntArrayArrayArray5 = arg3;
		this.method1040();
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(III)V")
	public void method1000(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class4_Sub22 local8 = this.aClass4_Sub22ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 != null) {
			local8.aClass17_1 = null;
		}
	}

	@OriginalMember(owner = "client!le", name = "b", descriptor = "(III)I")
	public int method1001(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class4_Sub22 local8 = this.aClass4_Sub22ArrayArrayArray1[arg0][arg1][arg2];
		return local8 == null || local8.aClass17_1 == null ? 0 : local8.aClass17_1.anInt846;
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(IIIIILclient!h;IIIIII)Z")
	public boolean method1002(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) Class4_Sub3_Sub1 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		return arg4 == null ? true : this.method1010(arg0, arg7, arg8, arg9 + 1 - arg7, arg10 - arg8 + 1, arg1, arg2, arg3, arg4, arg5, true, arg6, 0);
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(II)V")
	public void method1003(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class4_Sub22 local8 = this.aClass4_Sub22ArrayArrayArray1[0][arg0][arg1];
		for (@Pc(10) int local10 = 0; local10 < 3; local10++) {
			@Pc(31) Class4_Sub22 local31 = this.aClass4_Sub22ArrayArrayArray1[local10][arg0][arg1] = this.aClass4_Sub22ArrayArrayArray1[local10 + 1][arg0][arg1];
			if (local31 != null) {
				local31.anInt2811--;
				for (@Pc(41) int local41 = 0; local41 < local31.anInt2810; local41++) {
					@Pc(47) Class66 local47 = local31.aClass66Array3[local41];
					if ((local47.anInt2142 >> 29 & 0x3) == 2 && local47.anInt2133 == arg0 && local47.anInt2136 == arg1) {
						local47.anInt2129--;
					}
				}
			}
		}
		if (this.aClass4_Sub22ArrayArrayArray1[0][arg0][arg1] == null) {
			this.aClass4_Sub22ArrayArrayArray1[0][arg0][arg1] = new Class4_Sub22(0, arg0, arg1);
		}
		this.aClass4_Sub22ArrayArrayArray1[0][arg0][arg1].aClass4_Sub22_1 = local8;
		this.aClass4_Sub22ArrayArrayArray1[3][arg0][arg1] = null;
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(IIII)Z")
	private boolean method1004(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.method1026(arg0, arg1, arg2)) {
			@Pc(11) int local11 = arg1 << 7;
			@Pc(15) int local15 = arg2 << 7;
			return this.method1027(local11 + 1, this.anIntArrayArrayArray5[arg0][arg1][arg2] - arg3, local15 + 1) && this.method1027(local11 + 128 - 1, this.anIntArrayArrayArray5[arg0][arg1 + 1][arg2] - arg3, local15 + 1) && this.method1027(local11 + 128 - 1, this.anIntArrayArrayArray5[arg0][arg1 + 1][arg2 + 1] - arg3, local15 + 128 - 1) && this.method1027(local11 + 1, this.anIntArrayArrayArray5[arg0][arg1][arg2 + 1] - arg3, local15 + 128 - 1);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(IIIIIILclient!h;III)Z")
	public boolean method1006(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class4_Sub3_Sub1 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		if (arg6 == null) {
			return true;
		} else {
			@Pc(11) int local11 = arg1 * 128 + arg4 * 64;
			@Pc(19) int local19 = arg2 * 128 + arg5 * 64;
			return this.method1010(arg0, arg1, arg2, arg4, arg5, local11, local19, arg3, arg6, arg7, false, arg8, arg9);
		}
	}

	@OriginalMember(owner = "client!le", name = "c", descriptor = "(III)Lclient!df;")
	public Class17 method1007(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class4_Sub22 local8 = this.aClass4_Sub22ArrayArrayArray1[arg0][arg1][arg2];
		return local8 == null ? null : local8.aClass17_1;
	}

	@OriginalMember(owner = "client!le", name = "e", descriptor = "(III)Lclient!a;")
	public Class1 method1009(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class4_Sub22 local8 = this.aClass4_Sub22ArrayArrayArray1[arg0][arg1][arg2];
		return local8 == null ? null : local8.aClass1_1;
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(IIIIIIIILclient!h;IZII)Z")
	private boolean method1010(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) Class4_Sub3_Sub1 arg8, @OriginalArg(9) int arg9, @OriginalArg(10) boolean arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12) {
		for (@Pc(1) int local1 = arg1; local1 < arg1 + arg3; local1++) {
			for (@Pc(4) int local4 = arg2; local4 < arg2 + arg4; local4++) {
				if (local1 < 0 || local4 < 0 || local1 >= this.anInt1626 || local4 >= this.anInt1618) {
					return false;
				}
				@Pc(28) Class4_Sub22 local28 = this.aClass4_Sub22ArrayArrayArray1[arg0][local1][local4];
				if (local28 != null && local28.anInt2810 >= 5) {
					return false;
				}
			}
		}
		@Pc(52) Class66 local52 = new Class66();
		local52.anInt2142 = arg11;
		local52.anInt2131 = arg12;
		local52.anInt2129 = arg0;
		local52.anInt2127 = arg5;
		local52.anInt2141 = arg6;
		local52.anInt2132 = arg7;
		local52.aClass4_Sub3_Sub1_6 = arg8;
		local52.anInt2138 = arg9;
		local52.anInt2133 = arg1;
		local52.anInt2136 = arg2;
		local52.anInt2134 = arg1 + arg3 - 1;
		local52.anInt2140 = arg2 + arg4 - 1;
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
					if (this.aClass4_Sub22ArrayArrayArray1[local130][local98][local101] == null) {
						this.aClass4_Sub22ArrayArrayArray1[local130][local98][local101] = new Class4_Sub22(local130, local98, local101);
					}
				}
				@Pc(166) Class4_Sub22 local166 = this.aClass4_Sub22ArrayArrayArray1[arg0][local98][local101];
				local166.aClass66Array3[local166.anInt2810] = local52;
				local166.anIntArray340[local166.anInt2810] = local104;
				local166.anInt2817 |= local104;
				local166.anInt2810++;
			}
		}
		if (arg10) {
			this.aClass66Array1[this.anInt1605++] = local52;
		}
		return true;
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(IIIILclient!h;II)V")
	public void method1011(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class4_Sub3_Sub1 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (arg4 == null) {
			return;
		}
		@Pc(6) Class27 local6 = new Class27();
		local6.aClass4_Sub3_Sub1_5 = arg4;
		local6.anInt1076 = arg1 * 128 + 64;
		local6.anInt1081 = arg2 * 128 + 64;
		local6.anInt1082 = arg3;
		local6.anInt1078 = arg5;
		local6.anInt1075 = arg6;
		if (this.aClass4_Sub22ArrayArrayArray1[arg0][arg1][arg2] == null) {
			this.aClass4_Sub22ArrayArrayArray1[arg0][arg1][arg2] = new Class4_Sub22(arg0, arg1, arg2);
		}
		this.aClass4_Sub22ArrayArrayArray1[arg0][arg1][arg2].aClass27_1 = local6;
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(IIIILclient!h;Lclient!h;IIII)V")
	public void method1012(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class4_Sub3_Sub1 arg4, @OriginalArg(5) Class4_Sub3_Sub1 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		if (arg4 == null && arg5 == null) {
			return;
		}
		@Pc(8) Class1 local8 = new Class1();
		local8.anInt12 = arg8;
		local8.anInt3 = arg9;
		local8.anInt10 = arg1 * 128 + 64;
		local8.anInt2 = arg2 * 128 + 64;
		local8.anInt4 = arg3;
		local8.aClass4_Sub3_Sub1_2 = arg4;
		local8.aClass4_Sub3_Sub1_1 = arg5;
		local8.anInt1 = arg6;
		local8.anInt8 = arg7;
		for (@Pc(45) int local45 = arg0; local45 >= 0; local45--) {
			if (this.aClass4_Sub22ArrayArrayArray1[local45][arg1][arg2] == null) {
				this.aClass4_Sub22ArrayArrayArray1[local45][arg1][arg2] = new Class4_Sub22(local45, arg1, arg2);
			}
		}
		this.aClass4_Sub22ArrayArrayArray1[arg0][arg1][arg2].aClass1_1 = local8;
	}

	@OriginalMember(owner = "client!le", name = "b", descriptor = "(IIII)I")
	public int method1013(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(8) Class4_Sub22 local8 = this.aClass4_Sub22ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 == null) {
			return -1;
		} else if (local8.aClass1_1 != null && local8.aClass1_1.anInt12 == arg3) {
			return local8.aClass1_1.anInt3 & 0xFF;
		} else if (local8.aClass17_1 != null && local8.aClass17_1.anInt846 == arg3) {
			return local8.aClass17_1.anInt836 & 0xFF;
		} else if (local8.aClass27_1 != null && local8.aClass27_1.anInt1078 == arg3) {
			return local8.aClass27_1.anInt1075 & 0xFF;
		} else {
			for (@Pc(56) int local56 = 0; local56 < local8.anInt2810; local56++) {
				if (local8.aClass66Array3[local56].anInt2142 == arg3) {
					return local8.aClass66Array3[local56].anInt2131 & 0xFF;
				}
			}
			return -1;
		}
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(Lclient!pf;III)V")
	private void method1014(@OriginalArg(0) Class4_Sub3_Sub1_Sub5 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(14) Class4_Sub22 local14;
		@Pc(29) Class4_Sub3_Sub1_Sub5 local29;
		if (arg2 < this.anInt1626) {
			local14 = this.aClass4_Sub22ArrayArrayArray1[arg1][arg2 + 1][arg3];
			if (local14 != null && local14.aClass27_1 != null && local14.aClass27_1.aClass4_Sub3_Sub1_5 instanceof Class4_Sub3_Sub1_Sub5) {
				local29 = (Class4_Sub3_Sub1_Sub5) local14.aClass27_1.aClass4_Sub3_Sub1_5;
				Static89.method1435(arg0, local29, 128, 0, 0, true);
			}
		}
		if (arg3 < this.anInt1626) {
			local14 = this.aClass4_Sub22ArrayArrayArray1[arg1][arg2][arg3 + 1];
			if (local14 != null && local14.aClass27_1 != null && local14.aClass27_1.aClass4_Sub3_Sub1_5 instanceof Class4_Sub3_Sub1_Sub5) {
				local29 = (Class4_Sub3_Sub1_Sub5) local14.aClass27_1.aClass4_Sub3_Sub1_5;
				Static89.method1435(arg0, local29, 0, 0, 128, true);
			}
		}
		if (arg2 < this.anInt1626 && arg3 < this.anInt1618) {
			local14 = this.aClass4_Sub22ArrayArrayArray1[arg1][arg2 + 1][arg3 + 1];
			if (local14 != null && local14.aClass27_1 != null && local14.aClass27_1.aClass4_Sub3_Sub1_5 instanceof Class4_Sub3_Sub1_Sub5) {
				local29 = (Class4_Sub3_Sub1_Sub5) local14.aClass27_1.aClass4_Sub3_Sub1_5;
				Static89.method1435(arg0, local29, 128, 0, 128, true);
			}
		}
		if (arg2 >= this.anInt1626 || arg3 <= 0) {
			return;
		}
		local14 = this.aClass4_Sub22ArrayArrayArray1[arg1][arg2 + 1][arg3 - 1];
		if (local14 != null && local14.aClass27_1 != null && local14.aClass27_1.aClass4_Sub3_Sub1_5 instanceof Class4_Sub3_Sub1_Sub5) {
			local29 = (Class4_Sub3_Sub1_Sub5) local14.aClass27_1.aClass4_Sub3_Sub1_5;
			Static89.method1435(arg0, local29, 128, 0, -128, true);
		}
	}

	@OriginalMember(owner = "client!le", name = "f", descriptor = "(III)I")
	public int method1015(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class4_Sub22 local8 = this.aClass4_Sub22ArrayArrayArray1[arg0][arg1][arg2];
		return local8 == null || local8.aClass1_1 == null ? 0 : local8.aClass1_1.anInt12;
	}

	@OriginalMember(owner = "client!le", name = "g", descriptor = "(III)V")
	public void method1016(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		Static64.aBoolean56 = true;
		Static64.anInt1614 = arg0;
		Static64.anInt1613 = arg1;
		Static64.anInt1602 = arg2;
		Static64.anInt1625 = -1;
		Static64.anInt1610 = -1;
	}

	@OriginalMember(owner = "client!le", name = "c", descriptor = "(IIII)Z")
	private boolean method1017(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!this.method1026(arg0, arg1, arg2)) {
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
				if (local11 > Static64.anInt1611) {
					if (!this.method1027(local11, local26, local15)) {
						return false;
					}
					if (!this.method1027(local11, local26, local15 + 128)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!this.method1027(local11, local30, local15)) {
						return false;
					}
					if (!this.method1027(local11, local30, local15 + 128)) {
						return false;
					}
				}
				if (!this.method1027(local11, local34, local15)) {
					return false;
				}
				if (!this.method1027(local11, local34, local15 + 128)) {
					return false;
				}
				return true;
			}
			if (arg3 == 2) {
				if (local15 < Static64.anInt1600) {
					if (!this.method1027(local11, local26, local15 + 128)) {
						return false;
					}
					if (!this.method1027(local11 + 128, local26, local15 + 128)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!this.method1027(local11, local30, local15 + 128)) {
						return false;
					}
					if (!this.method1027(local11 + 128, local30, local15 + 128)) {
						return false;
					}
				}
				if (!this.method1027(local11, local34, local15 + 128)) {
					return false;
				}
				if (!this.method1027(local11 + 128, local34, local15 + 128)) {
					return false;
				}
				return true;
			}
			if (arg3 == 4) {
				if (local11 < Static64.anInt1611) {
					if (!this.method1027(local11 + 128, local26, local15)) {
						return false;
					}
					if (!this.method1027(local11 + 128, local26, local15 + 128)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!this.method1027(local11 + 128, local30, local15)) {
						return false;
					}
					if (!this.method1027(local11 + 128, local30, local15 + 128)) {
						return false;
					}
				}
				if (!this.method1027(local11 + 128, local34, local15)) {
					return false;
				}
				if (!this.method1027(local11 + 128, local34, local15 + 128)) {
					return false;
				}
				return true;
			}
			if (arg3 == 8) {
				if (local15 > Static64.anInt1600) {
					if (!this.method1027(local11, local26, local15)) {
						return false;
					}
					if (!this.method1027(local11 + 128, local26, local15)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!this.method1027(local11, local30, local15)) {
						return false;
					}
					if (!this.method1027(local11 + 128, local30, local15)) {
						return false;
					}
				}
				if (!this.method1027(local11, local34, local15)) {
					return false;
				}
				if (!this.method1027(local11 + 128, local34, local15)) {
					return false;
				}
				return true;
			}
		}
		if (!this.method1027(local11 + 64, local38, local15 + 64)) {
			return false;
		} else if (arg3 == 16) {
			return this.method1027(local11, local34, local15 + 128);
		} else if (arg3 == 32) {
			return this.method1027(local11 + 128, local34, local15 + 128);
		} else if (arg3 == 64) {
			return this.method1027(local11 + 128, local34, local15);
		} else if (arg3 == 128) {
			return this.method1027(local11, local34, local15);
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!le", name = "h", descriptor = "(III)Lclient!gd;")
	public Class27 method1018(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class4_Sub22 local8 = this.aClass4_Sub22ArrayArrayArray1[arg0][arg1][arg2];
		return local8 == null || local8.aClass27_1 == null ? null : local8.aClass27_1;
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(Lclient!vc;Z)V")
	private void method1020(@OriginalArg(0) Class4_Sub22 arg0, @OriginalArg(1) boolean arg1) {
		Static64.aClass45_11.method988(arg0);
		while (true) {
			@Pc(8) Class4_Sub22 local8;
			@Pc(17) int local17;
			@Pc(20) int local20;
			@Pc(23) int local23;
			@Pc(26) int local26;
			@Pc(31) Class4_Sub22[][] local31;
			@Pc(49) Class4_Sub22 local49;
			@Pc(251) int local251;
			@Pc(592) int local592;
			@Pc(597) int local597;
			@Pc(602) int local602;
			@Pc(919) Class1 local919;
			@Pc(1093) int local1093;
			@Pc(978) int local978;
			do {
				do {
					do {
						do {
							do {
								do {
									while (true) {
										@Pc(257) Class66 var12;
										@Pc(605) int var17;
										@Pc(614) int var18;
										@Pc(626) int var19;
										@Pc(345) int var21;
										@Pc(289) boolean var22;
										@Pc(800) Class4_Sub22 var33;
										while (true) {
											do {
												local8 = (Class4_Sub22) Static64.aClass45_11.method995();
												if (local8 == null) {
													return;
												}
											} while (!local8.aBoolean118);
											local17 = local8.anInt2808;
											local20 = local8.anInt2813;
											local23 = local8.anInt2811;
											local26 = local8.anInt2816;
											local31 = this.aClass4_Sub22ArrayArrayArray1[local23];
											if (!local8.aBoolean119) {
												break;
											}
											if (arg1) {
												if (local23 > 0) {
													local49 = this.aClass4_Sub22ArrayArrayArray1[local23 - 1][local17][local20];
													if (local49 != null && local49.aBoolean118) {
														continue;
													}
												}
												if (local17 <= Static64.anInt1608 && local17 > Static64.anInt1599) {
													local49 = local31[local17 - 1][local20];
													if (local49 != null && local49.aBoolean118 && (local49.aBoolean119 || (local8.anInt2817 & 0x1) == 0)) {
														continue;
													}
												}
												if (local17 >= Static64.anInt1608 && local17 < Static64.anInt1623 - 1) {
													local49 = local31[local17 + 1][local20];
													if (local49 != null && local49.aBoolean118 && (local49.aBoolean119 || (local8.anInt2817 & 0x4) == 0)) {
														continue;
													}
												}
												if (local20 <= Static64.anInt1620 && local20 > Static64.anInt1612) {
													local49 = local31[local17][local20 - 1];
													if (local49 != null && local49.aBoolean118 && (local49.aBoolean119 || (local8.anInt2817 & 0x8) == 0)) {
														continue;
													}
												}
												if (local20 >= Static64.anInt1620 && local20 < Static64.anInt1621 - 1) {
													local49 = local31[local17][local20 + 1];
													if (local49 != null && local49.aBoolean118 && (local49.aBoolean119 || (local8.anInt2817 & 0x2) == 0)) {
														continue;
													}
												}
											} else {
												arg1 = true;
											}
											local8.aBoolean119 = false;
											if (local8.aClass4_Sub22_1 != null) {
												local49 = local8.aClass4_Sub22_1;
												if (local49.aClass71_1 == null) {
													if (local49.aClass41_1 != null && !this.method1026(0, local17, local20)) {
														this.method1025(local49.aClass41_1, Static64.anInt1607, Static64.anInt1624, Static64.anInt1606, Static64.anInt1603, local17, local20);
													}
												} else if (!this.method1026(0, local17, local20)) {
													this.method1043(local49.aClass71_1, 0, Static64.anInt1607, Static64.anInt1624, Static64.anInt1606, Static64.anInt1603, local17, local20);
												}
												@Pc(225) Class1 local225 = local49.aClass1_1;
												if (local225 != null) {
													local225.aClass4_Sub3_Sub1_2.method1485(0, Static64.anInt1607, Static64.anInt1624, Static64.anInt1606, Static64.anInt1603, local225.anInt10 - Static64.anInt1611, local225.anInt4 - Static64.anInt1615, local225.anInt2 - Static64.anInt1600, local225.anInt12);
												}
												for (local251 = 0; local251 < local49.anInt2810; local251++) {
													var12 = local49.aClass66Array3[local251];
													if (var12 != null) {
														var12.aClass4_Sub3_Sub1_6.method1485(var12.anInt2138, Static64.anInt1607, Static64.anInt1624, Static64.anInt1606, Static64.anInt1603, var12.anInt2127 - Static64.anInt1611, var12.anInt2132 - Static64.anInt1615, var12.anInt2141 - Static64.anInt1600, var12.anInt2142);
													}
												}
											}
											var22 = false;
											if (local8.aClass71_1 == null) {
												if (local8.aClass41_1 != null && !this.method1026(local26, local17, local20)) {
													var22 = true;
													this.method1025(local8.aClass41_1, Static64.anInt1607, Static64.anInt1624, Static64.anInt1606, Static64.anInt1603, local17, local20);
												}
											} else if (!this.method1026(local26, local17, local20)) {
												var22 = true;
												if (local8.aClass71_1.anInt2483 != 12345678 || Static64.aBoolean56 && local23 <= Static64.anInt1614) {
													this.method1043(local8.aClass71_1, local26, Static64.anInt1607, Static64.anInt1624, Static64.anInt1606, Static64.anInt1603, local17, local20);
												}
											}
											var21 = 0;
											local251 = 0;
											@Pc(350) Class1 local350 = local8.aClass1_1;
											@Pc(353) Class17 local353 = local8.aClass17_1;
											if (local350 != null || local353 != null) {
												if (Static64.anInt1608 == local17) {
													var21++;
												} else if (Static64.anInt1608 < local17) {
													var21 += 2;
												}
												if (Static64.anInt1620 == local20) {
													var21 += 3;
												} else if (Static64.anInt1620 > local20) {
													var21 += 6;
												}
												local251 = Static64.anIntArray181[var21];
												local8.anInt2814 = Static64.anIntArray182[var21];
											}
											if (local350 != null) {
												if ((local350.anInt1 & Static64.anIntArray186[var21]) == 0) {
													local8.anInt2812 = 0;
												} else if (local350.anInt1 == 16) {
													local8.anInt2812 = 3;
													local8.anInt2806 = Static64.anIntArray184[var21];
													local8.anInt2809 = 3 - local8.anInt2806;
												} else if (local350.anInt1 == 32) {
													local8.anInt2812 = 6;
													local8.anInt2806 = Static64.anIntArray183[var21];
													local8.anInt2809 = 6 - local8.anInt2806;
												} else if (local350.anInt1 == 64) {
													local8.anInt2812 = 12;
													local8.anInt2806 = Static64.anIntArray185[var21];
													local8.anInt2809 = 12 - local8.anInt2806;
												} else {
													local8.anInt2812 = 9;
													local8.anInt2806 = Static64.anIntArray187[var21];
													local8.anInt2809 = 9 - local8.anInt2806;
												}
												if ((local350.anInt1 & local251) != 0 && !this.method1017(local26, local17, local20, local350.anInt1)) {
													local350.aClass4_Sub3_Sub1_2.method1485(0, Static64.anInt1607, Static64.anInt1624, Static64.anInt1606, Static64.anInt1603, local350.anInt10 - Static64.anInt1611, local350.anInt4 - Static64.anInt1615, local350.anInt2 - Static64.anInt1600, local350.anInt12);
												}
												if ((local350.anInt8 & local251) != 0 && !this.method1017(local26, local17, local20, local350.anInt8)) {
													local350.aClass4_Sub3_Sub1_1.method1485(0, Static64.anInt1607, Static64.anInt1624, Static64.anInt1606, Static64.anInt1603, local350.anInt10 - Static64.anInt1611, local350.anInt4 - Static64.anInt1615, local350.anInt2 - Static64.anInt1600, local350.anInt12);
												}
											}
											if (local353 != null && !this.method1004(local26, local17, local20, local353.aClass4_Sub3_Sub1_4.anInt2166)) {
												if ((local353.anInt845 & local251) != 0) {
													local353.aClass4_Sub3_Sub1_4.method1485(0, Static64.anInt1607, Static64.anInt1624, Static64.anInt1606, Static64.anInt1603, local353.anInt842 + local353.anInt844 - Static64.anInt1611, local353.anInt838 - Static64.anInt1615, local353.anInt843 + local353.anInt837 - Static64.anInt1600, local353.anInt846);
												} else if (local353.anInt845 == 256) {
													local592 = local353.anInt842 - Static64.anInt1611;
													local597 = local353.anInt838 - Static64.anInt1615;
													local602 = local353.anInt843 - Static64.anInt1600;
													var17 = local353.anInt840;
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
														local353.aClass4_Sub3_Sub1_4.method1485(0, Static64.anInt1607, Static64.anInt1624, Static64.anInt1606, Static64.anInt1603, local592 + local353.anInt844, local597, local602 + local353.anInt837, local353.anInt846);
													} else if (local353.aClass4_Sub3_Sub1_3 != null) {
														local353.aClass4_Sub3_Sub1_3.method1485(0, Static64.anInt1607, Static64.anInt1624, Static64.anInt1606, Static64.anInt1603, local592, local597, local602, local353.anInt846);
													}
												}
											}
											if (var22) {
												@Pc(673) Class27 local673 = local8.aClass27_1;
												if (local673 != null) {
													local673.aClass4_Sub3_Sub1_5.method1485(0, Static64.anInt1607, Static64.anInt1624, Static64.anInt1606, Static64.anInt1603, local673.anInt1076 - Static64.anInt1611, local673.anInt1082 - Static64.anInt1615, local673.anInt1081 - Static64.anInt1600, local673.anInt1078);
												}
												@Pc(700) Class76 local700 = local8.aClass76_1;
												if (local700 != null && local700.anInt2750 == 0) {
													if (local700.aClass4_Sub3_Sub1_8 != null) {
														local700.aClass4_Sub3_Sub1_8.method1485(0, Static64.anInt1607, Static64.anInt1624, Static64.anInt1606, Static64.anInt1603, local700.anInt2744 - Static64.anInt1611, local700.anInt2746 - Static64.anInt1615, local700.anInt2747 - Static64.anInt1600, local700.anInt2751);
													}
													if (local700.aClass4_Sub3_Sub1_7 != null) {
														local700.aClass4_Sub3_Sub1_7.method1485(0, Static64.anInt1607, Static64.anInt1624, Static64.anInt1606, Static64.anInt1603, local700.anInt2744 - Static64.anInt1611, local700.anInt2746 - Static64.anInt1615, local700.anInt2747 - Static64.anInt1600, local700.anInt2751);
													}
													if (local700.aClass4_Sub3_Sub1_9 != null) {
														local700.aClass4_Sub3_Sub1_9.method1485(0, Static64.anInt1607, Static64.anInt1624, Static64.anInt1606, Static64.anInt1603, local700.anInt2744 - Static64.anInt1611, local700.anInt2746 - Static64.anInt1615, local700.anInt2747 - Static64.anInt1600, local700.anInt2751);
													}
												}
											}
											local592 = local8.anInt2817;
											if (local592 != 0) {
												if (local17 < Static64.anInt1608 && (local592 & 0x4) != 0) {
													var33 = local31[local17 + 1][local20];
													if (var33 != null && var33.aBoolean118) {
														Static64.aClass45_11.method988(var33);
													}
												}
												if (local20 < Static64.anInt1620 && (local592 & 0x2) != 0) {
													var33 = local31[local17][local20 + 1];
													if (var33 != null && var33.aBoolean118) {
														Static64.aClass45_11.method988(var33);
													}
												}
												if (local17 > Static64.anInt1608 && (local592 & 0x1) != 0) {
													var33 = local31[local17 - 1][local20];
													if (var33 != null && var33.aBoolean118) {
														Static64.aClass45_11.method988(var33);
													}
												}
												if (local20 > Static64.anInt1620 && (local592 & 0x8) != 0) {
													var33 = local31[local17][local20 - 1];
													if (var33 != null && var33.aBoolean118) {
														Static64.aClass45_11.method988(var33);
													}
												}
											}
											break;
										}
										if (local8.anInt2812 != 0) {
											var22 = true;
											for (var21 = 0; var21 < local8.anInt2810; var21++) {
												if (local8.aClass66Array3[var21].anInt2137 != Static64.anInt1601 && (local8.anIntArray340[var21] & local8.anInt2812) == local8.anInt2806) {
													var22 = false;
													break;
												}
											}
											if (var22) {
												local919 = local8.aClass1_1;
												if (!this.method1017(local26, local17, local20, local919.anInt1)) {
													local919.aClass4_Sub3_Sub1_2.method1485(0, Static64.anInt1607, Static64.anInt1624, Static64.anInt1606, Static64.anInt1603, local919.anInt10 - Static64.anInt1611, local919.anInt4 - Static64.anInt1615, local919.anInt2 - Static64.anInt1600, local919.anInt12);
												}
												local8.anInt2812 = 0;
											}
										}
										if (!local8.aBoolean120) {
											break;
										}
										try {
											@Pc(958) int local958 = local8.anInt2810;
											local8.aBoolean120 = false;
											var21 = 0;
											label558: for (local251 = 0; local251 < local958; local251++) {
												var12 = local8.aClass66Array3[local251];
												if (var12.anInt2137 != Static64.anInt1601) {
													for (local978 = var12.anInt2133; local978 <= var12.anInt2134; local978++) {
														for (local592 = var12.anInt2136; local592 <= var12.anInt2140; local592++) {
															var33 = local31[local978][local592];
															if (var33.aBoolean119) {
																local8.aBoolean120 = true;
																continue label558;
															}
															if (var33.anInt2812 != 0) {
																local602 = 0;
																if (local978 > var12.anInt2133) {
																	local602++;
																}
																if (local978 < var12.anInt2134) {
																	local602 += 4;
																}
																if (local592 > var12.anInt2136) {
																	local602 += 8;
																}
																if (local592 < var12.anInt2140) {
																	local602 += 2;
																}
																if ((local602 & var33.anInt2812) == local8.anInt2809) {
																	local8.aBoolean120 = true;
																	continue label558;
																}
															}
														}
													}
													Static64.aClass66Array2[var21++] = var12;
													local592 = Static64.anInt1608 - var12.anInt2133;
													local597 = var12.anInt2134 - Static64.anInt1608;
													if (local597 > local592) {
														local592 = local597;
													}
													local602 = Static64.anInt1620 - var12.anInt2136;
													var17 = var12.anInt2140 - Static64.anInt1620;
													if (var17 > local602) {
														var12.anInt2143 = local592 + var17;
													} else {
														var12.anInt2143 = local592 + local602;
													}
												}
											}
											while (var21 > 0) {
												local1093 = -50;
												local978 = -1;
												@Pc(1102) Class66 local1102;
												for (local592 = 0; local592 < var21; local592++) {
													local1102 = Static64.aClass66Array2[local592];
													if (local1102.anInt2137 != Static64.anInt1601) {
														if (local1102.anInt2143 > local1093) {
															local1093 = local1102.anInt2143;
															local978 = local592;
														} else if (local1102.anInt2143 == local1093) {
															local602 = local1102.anInt2127 - Static64.anInt1611;
															var17 = local1102.anInt2141 - Static64.anInt1600;
															var18 = Static64.aClass66Array2[local978].anInt2127 - Static64.anInt1611;
															var19 = Static64.aClass66Array2[local978].anInt2141 - Static64.anInt1600;
															if (local602 * local602 + var17 * var17 > var18 * var18 + var19 * var19) {
																local978 = local592;
															}
														}
													}
												}
												if (local978 == -1) {
													break;
												}
												local1102 = Static64.aClass66Array2[local978];
												local1102.anInt2137 = Static64.anInt1601;
												if (!this.method1049(local26, local1102.anInt2133, local1102.anInt2134, local1102.anInt2136, local1102.anInt2140, local1102.aClass4_Sub3_Sub1_6.anInt2166)) {
													local1102.aClass4_Sub3_Sub1_6.method1485(local1102.anInt2138, Static64.anInt1607, Static64.anInt1624, Static64.anInt1606, Static64.anInt1603, local1102.anInt2127 - Static64.anInt1611, local1102.anInt2132 - Static64.anInt1615, local1102.anInt2141 - Static64.anInt1600, local1102.anInt2142);
												}
												for (local602 = local1102.anInt2133; local602 <= local1102.anInt2134; local602++) {
													for (var17 = local1102.anInt2136; var17 <= local1102.anInt2140; var17++) {
														@Pc(1227) Class4_Sub22 local1227 = local31[local602][var17];
														if (local1227.anInt2812 != 0) {
															Static64.aClass45_11.method988(local1227);
														} else if ((local602 != local17 || var17 != local20) && local1227.aBoolean118) {
															Static64.aClass45_11.method988(local1227);
														}
													}
												}
											}
											if (!local8.aBoolean120) {
												break;
											}
										} catch (@Pc(1265) Exception local1265) {
											local8.aBoolean120 = false;
											break;
										}
									}
								} while (!local8.aBoolean118);
							} while (local8.anInt2812 != 0);
							if (local17 > Static64.anInt1608 || local17 <= Static64.anInt1599) {
								break;
							}
							local49 = local31[local17 - 1][local20];
						} while (local49 != null && local49.aBoolean118);
						if (local17 < Static64.anInt1608 || local17 >= Static64.anInt1623 - 1) {
							break;
						}
						local49 = local31[local17 + 1][local20];
					} while (local49 != null && local49.aBoolean118);
					if (local20 > Static64.anInt1620 || local20 <= Static64.anInt1612) {
						break;
					}
					local49 = local31[local17][local20 - 1];
				} while (local49 != null && local49.aBoolean118);
				if (local20 < Static64.anInt1620 || local20 >= Static64.anInt1621 - 1) {
					break;
				}
				local49 = local31[local17][local20 + 1];
			} while (local49 != null && local49.aBoolean118);
			local8.aBoolean118 = false;
			Static64.anInt1622--;
			@Pc(1369) Class76 local1369 = local8.aClass76_1;
			if (local1369 != null && local1369.anInt2750 != 0) {
				if (local1369.aClass4_Sub3_Sub1_8 != null) {
					local1369.aClass4_Sub3_Sub1_8.method1485(0, Static64.anInt1607, Static64.anInt1624, Static64.anInt1606, Static64.anInt1603, local1369.anInt2744 - Static64.anInt1611, local1369.anInt2746 - Static64.anInt1615 - local1369.anInt2750, local1369.anInt2747 - Static64.anInt1600, local1369.anInt2751);
				}
				if (local1369.aClass4_Sub3_Sub1_7 != null) {
					local1369.aClass4_Sub3_Sub1_7.method1485(0, Static64.anInt1607, Static64.anInt1624, Static64.anInt1606, Static64.anInt1603, local1369.anInt2744 - Static64.anInt1611, local1369.anInt2746 - Static64.anInt1615 - local1369.anInt2750, local1369.anInt2747 - Static64.anInt1600, local1369.anInt2751);
				}
				if (local1369.aClass4_Sub3_Sub1_9 != null) {
					local1369.aClass4_Sub3_Sub1_9.method1485(0, Static64.anInt1607, Static64.anInt1624, Static64.anInt1606, Static64.anInt1603, local1369.anInt2744 - Static64.anInt1611, local1369.anInt2746 - Static64.anInt1615 - local1369.anInt2750, local1369.anInt2747 - Static64.anInt1600, local1369.anInt2751);
				}
			}
			if (local8.anInt2814 != 0) {
				@Pc(1464) Class17 local1464 = local8.aClass17_1;
				if (local1464 != null && !this.method1004(local26, local17, local20, local1464.aClass4_Sub3_Sub1_4.anInt2166)) {
					if ((local1464.anInt845 & local8.anInt2814) != 0) {
						local1464.aClass4_Sub3_Sub1_4.method1485(0, Static64.anInt1607, Static64.anInt1624, Static64.anInt1606, Static64.anInt1603, local1464.anInt842 + local1464.anInt844 - Static64.anInt1611, local1464.anInt838 - Static64.anInt1615, local1464.anInt843 + local1464.anInt837 - Static64.anInt1600, local1464.anInt846);
					} else if (local1464.anInt845 == 256) {
						local251 = local1464.anInt842 - Static64.anInt1611;
						local1093 = local1464.anInt838 - Static64.anInt1615;
						local978 = local1464.anInt843 - Static64.anInt1600;
						local592 = local1464.anInt840;
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
							local1464.aClass4_Sub3_Sub1_4.method1485(0, Static64.anInt1607, Static64.anInt1624, Static64.anInt1606, Static64.anInt1603, local251 + local1464.anInt844, local1093, local978 + local1464.anInt837, local1464.anInt846);
						} else if (local1464.aClass4_Sub3_Sub1_3 != null) {
							local1464.aClass4_Sub3_Sub1_3.method1485(0, Static64.anInt1607, Static64.anInt1624, Static64.anInt1606, Static64.anInt1603, local251, local1093, local978, local1464.anInt846);
						}
					}
				}
				local919 = local8.aClass1_1;
				if (local919 != null) {
					if ((local919.anInt8 & local8.anInt2814) != 0 && !this.method1017(local26, local17, local20, local919.anInt8)) {
						local919.aClass4_Sub3_Sub1_1.method1485(0, Static64.anInt1607, Static64.anInt1624, Static64.anInt1606, Static64.anInt1603, local919.anInt10 - Static64.anInt1611, local919.anInt4 - Static64.anInt1615, local919.anInt2 - Static64.anInt1600, local919.anInt12);
					}
					if ((local919.anInt1 & local8.anInt2814) != 0 && !this.method1017(local26, local17, local20, local919.anInt1)) {
						local919.aClass4_Sub3_Sub1_2.method1485(0, Static64.anInt1607, Static64.anInt1624, Static64.anInt1606, Static64.anInt1603, local919.anInt10 - Static64.anInt1611, local919.anInt4 - Static64.anInt1615, local919.anInt2 - Static64.anInt1600, local919.anInt12);
					}
				}
			}
			@Pc(1689) Class4_Sub22 local1689;
			if (local23 < this.anInt1617 - 1) {
				local1689 = this.aClass4_Sub22ArrayArrayArray1[local23 + 1][local17][local20];
				if (local1689 != null && local1689.aBoolean118) {
					Static64.aClass45_11.method988(local1689);
				}
			}
			if (local17 < Static64.anInt1608) {
				local1689 = local31[local17 + 1][local20];
				if (local1689 != null && local1689.aBoolean118) {
					Static64.aClass45_11.method988(local1689);
				}
			}
			if (local20 < Static64.anInt1620) {
				local1689 = local31[local17][local20 + 1];
				if (local1689 != null && local1689.aBoolean118) {
					Static64.aClass45_11.method988(local1689);
				}
			}
			if (local17 > Static64.anInt1608) {
				local1689 = local31[local17 - 1][local20];
				if (local1689 != null && local1689.aBoolean118) {
					Static64.aClass45_11.method988(local1689);
				}
			}
			if (local20 > Static64.anInt1620) {
				local1689 = local31[local17][local20 - 1];
				if (local1689 != null && local1689.aBoolean118) {
					Static64.aClass45_11.method988(local1689);
				}
			}
		}
	}

	@OriginalMember(owner = "client!le", name = "i", descriptor = "(III)V")
	public void method1021() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt1617; local1++) {
			for (@Pc(4) int local4 = 0; local4 < this.anInt1626; local4++) {
				for (@Pc(7) int local7 = 0; local7 < this.anInt1618; local7++) {
					@Pc(17) Class4_Sub22 local17 = this.aClass4_Sub22ArrayArrayArray1[local1][local4][local7];
					if (local17 != null) {
						@Pc(22) Class1 local22 = local17.aClass1_1;
						if (local22 != null && local22.aClass4_Sub3_Sub1_2 instanceof Class4_Sub3_Sub1_Sub5) {
							@Pc(32) Class4_Sub3_Sub1_Sub5 local32 = (Class4_Sub3_Sub1_Sub5) local22.aClass4_Sub3_Sub1_2;
							this.method1028(local32, local1, local4, local7, 1, 1);
							if (local22.aClass4_Sub3_Sub1_1 instanceof Class4_Sub3_Sub1_Sub5) {
								@Pc(48) Class4_Sub3_Sub1_Sub5 local48 = (Class4_Sub3_Sub1_Sub5) local22.aClass4_Sub3_Sub1_1;
								this.method1028(local48, local1, local4, local7, 1, 1);
								Static89.method1435(local32, local48, 0, 0, 0, false);
								local22.aClass4_Sub3_Sub1_1 = local48.method1444(local48.aShort1, local48.aShort2, -50, -10, -50);
							}
							local22.aClass4_Sub3_Sub1_2 = local32.method1444(local32.aShort1, local32.aShort2, -50, -10, -50);
						}
						@Pc(103) Class4_Sub3_Sub1_Sub5 local103;
						for (@Pc(87) int local87 = 0; local87 < local17.anInt2810; local87++) {
							@Pc(93) Class66 local93 = local17.aClass66Array3[local87];
							if (local93 != null && local93.aClass4_Sub3_Sub1_6 instanceof Class4_Sub3_Sub1_Sub5) {
								local103 = (Class4_Sub3_Sub1_Sub5) local93.aClass4_Sub3_Sub1_6;
								this.method1028(local103, local1, local4, local7, local93.anInt2134 + 1 - local93.anInt2133, local93.anInt2140 - local93.anInt2136 + 1);
								local93.aClass4_Sub3_Sub1_6 = local103.method1444(local103.aShort1, local103.aShort2, -50, -10, -50);
							}
						}
						@Pc(142) Class27 local142 = local17.aClass27_1;
						if (local142 != null && local142.aClass4_Sub3_Sub1_5 instanceof Class4_Sub3_Sub1_Sub5) {
							local103 = (Class4_Sub3_Sub1_Sub5) local142.aClass4_Sub3_Sub1_5;
							this.method1014(local103, local1, local4, local7);
							local142.aClass4_Sub3_Sub1_5 = local103.method1444(local103.aShort1, local103.aShort2, -50, -10, -50);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!le", name = "d", descriptor = "(IIII)V")
	public void method1022(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(8) Class4_Sub22 local8 = this.aClass4_Sub22ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 == null) {
			return;
		}
		@Pc(14) Class17 local14 = local8.aClass17_1;
		if (local14 != null) {
			local14.anInt844 = local14.anInt844 * arg3 / 16;
			local14.anInt837 = local14.anInt837 * arg3 / 16;
		}
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "()V")
	public void method1023() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt1605; local1++) {
			@Pc(7) Class66 local7 = this.aClass66Array1[local1];
			this.method1050(local7);
			this.aClass66Array1[local1] = null;
		}
		this.anInt1605 = 0;
	}

	@OriginalMember(owner = "client!le", name = "j", descriptor = "(III)I")
	public int method1024(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class4_Sub22 local8 = this.aClass4_Sub22ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 == null) {
			return 0;
		}
		for (@Pc(14) int local14 = 0; local14 < local8.anInt2810; local14++) {
			@Pc(20) Class66 local20 = local8.aClass66Array3[local14];
			if ((local20.anInt2142 >> 29 & 0x3) == 2 && local20.anInt2133 == arg1 && local20.anInt2136 == arg2) {
				return local20.anInt2142;
			}
		}
		return 0;
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(Lclient!kb;IIIIII)V")
	private void method1025(@OriginalArg(0) Class41 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(3) int local3 = arg0.anIntArray162.length;
		@Pc(13) int local13;
		@Pc(20) int local20;
		@Pc(27) int local27;
		@Pc(37) int local37;
		for (@Pc(5) int local5 = 0; local5 < local3; local5++) {
			local13 = arg0.anIntArray162[local5] - Static64.anInt1611;
			local20 = arg0.anIntArray171[local5] - Static64.anInt1615;
			local27 = arg0.anIntArray160[local5] - Static64.anInt1600;
			local37 = local27 * arg3 + local13 * arg4 >> 16;
			@Pc(47) int local47 = local27 * arg4 - local13 * arg3 >> 16;
			@Pc(59) int local59 = local20 * arg2 - local47 * arg1 >> 16;
			@Pc(69) int local69 = local20 * arg1 + local47 * arg2 >> 16;
			if (local69 < 50) {
				return;
			}
			if (arg0.anIntArray170 != null) {
				Static58.anIntArray161[local5] = local37;
				Static58.anIntArray157[local5] = local59;
				Static58.anIntArray163[local5] = local69;
			}
			Static58.anIntArray164[local5] = Static100.anInt2358 + (local37 << 9) / local69;
			Static58.anIntArray165[local5] = Static100.anInt2351 + (local59 << 9) / local69;
		}
		Static100.anInt2356 = 0;
		local3 = arg0.anIntArray168.length;
		for (local13 = 0; local13 < local3; local13++) {
			local20 = arg0.anIntArray168[local13];
			local27 = arg0.anIntArray158[local13];
			local37 = arg0.anIntArray167[local13];
			@Pc(142) int local142 = Static58.anIntArray164[local20];
			@Pc(146) int local146 = Static58.anIntArray164[local27];
			@Pc(150) int local150 = Static58.anIntArray164[local37];
			@Pc(154) int local154 = Static58.anIntArray165[local20];
			@Pc(158) int local158 = Static58.anIntArray165[local27];
			@Pc(162) int local162 = Static58.anIntArray165[local37];
			if ((local142 - local146) * (local162 - local158) - (local154 - local158) * (local150 - local146) > 0) {
				Static100.aBoolean87 = false;
				if (local142 < 0 || local146 < 0 || local150 < 0 || local142 > Static100.anInt2353 || local146 > Static100.anInt2353 || local150 > Static100.anInt2353) {
					Static100.aBoolean87 = true;
				}
				if (Static64.aBoolean56 && this.method1044(Static64.anInt1613, Static64.anInt1602, local154, local158, local162, local142, local146, local150)) {
					Static64.anInt1625 = arg5;
					Static64.anInt1610 = arg6;
				}
				if (arg0.anIntArray170 == null || arg0.anIntArray170[local13] == -1) {
					if (arg0.anIntArray169[local13] != 12345678) {
						Static100.method1673(local154, local158, local162, local142, local146, local150, arg0.anIntArray169[local13], arg0.anIntArray166[local13], arg0.anIntArray159[local13]);
					}
				} else if (Static64.aBoolean55) {
					@Pc(364) int local364 = Static100.anInterface3_1.method1563(arg0.anIntArray170[local13]);
					Static100.method1673(local154, local158, local162, local142, local146, local150, Static64.method1019(local364, arg0.anIntArray169[local13]), Static64.method1019(local364, arg0.anIntArray166[local13]), Static64.method1019(local364, arg0.anIntArray159[local13]));
				} else if (arg0.aBoolean52) {
					Static100.method1672(local154, local158, local162, local142, local146, local150, arg0.anIntArray169[local13], arg0.anIntArray166[local13], arg0.anIntArray159[local13], Static58.anIntArray161[0], Static58.anIntArray161[1], Static58.anIntArray161[3], Static58.anIntArray157[0], Static58.anIntArray157[1], Static58.anIntArray157[3], Static58.anIntArray163[0], Static58.anIntArray163[1], Static58.anIntArray163[3], arg0.anIntArray170[local13]);
				} else {
					Static100.method1672(local154, local158, local162, local142, local146, local150, arg0.anIntArray169[local13], arg0.anIntArray166[local13], arg0.anIntArray159[local13], Static58.anIntArray161[local20], Static58.anIntArray161[local27], Static58.anIntArray161[local37], Static58.anIntArray157[local20], Static58.anIntArray157[local27], Static58.anIntArray157[local37], Static58.anIntArray163[local20], Static58.anIntArray163[local27], Static58.anIntArray163[local37], arg0.anIntArray170[local13]);
				}
			}
		}
	}

	@OriginalMember(owner = "client!le", name = "k", descriptor = "(III)Z")
	private boolean method1026(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) int local8 = this.anIntArrayArrayArray4[arg0][arg1][arg2];
		if (local8 == -Static64.anInt1601) {
			return false;
		} else if (local8 == Static64.anInt1601) {
			return true;
		} else {
			@Pc(23) int local23 = arg1 << 7;
			@Pc(27) int local27 = arg2 << 7;
			if (this.method1027(local23 + 1, this.anIntArrayArrayArray5[arg0][arg1][arg2], local27 + 1) && this.method1027(local23 + 128 - 1, this.anIntArrayArrayArray5[arg0][arg1 + 1][arg2], local27 + 1) && this.method1027(local23 + 128 - 1, this.anIntArrayArrayArray5[arg0][arg1 + 1][arg2 + 1], local27 + 128 - 1) && this.method1027(local23 + 1, this.anIntArrayArrayArray5[arg0][arg1][arg2 + 1], local27 + 128 - 1)) {
				this.anIntArrayArrayArray4[arg0][arg1][arg2] = Static64.anInt1601;
				return true;
			} else {
				this.anIntArrayArrayArray4[arg0][arg1][arg2] = -Static64.anInt1601;
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!le", name = "l", descriptor = "(III)Z")
	private boolean method1027(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < Static64.anInt1604; local1++) {
			@Pc(6) Class20 local6 = Static64.aClass20Array1[local1];
			@Pc(15) int local15;
			@Pc(27) int local27;
			@Pc(37) int local37;
			@Pc(47) int local47;
			@Pc(57) int local57;
			if (local6.anInt888 == 1) {
				local15 = local6.anInt895 - arg0;
				if (local15 > 0) {
					local27 = local6.anInt884 + (local6.anInt890 * local15 >> 8);
					local37 = local6.anInt887 + (local6.anInt878 * local15 >> 8);
					local47 = local6.anInt886 + (local6.anInt879 * local15 >> 8);
					local57 = local6.anInt891 + (local6.anInt889 * local15 >> 8);
					if (arg2 >= local27 && arg2 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt888 == 2) {
				local15 = arg0 - local6.anInt895;
				if (local15 > 0) {
					local27 = local6.anInt884 + (local6.anInt890 * local15 >> 8);
					local37 = local6.anInt887 + (local6.anInt878 * local15 >> 8);
					local47 = local6.anInt886 + (local6.anInt879 * local15 >> 8);
					local57 = local6.anInt891 + (local6.anInt889 * local15 >> 8);
					if (arg2 >= local27 && arg2 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt888 == 3) {
				local15 = local6.anInt884 - arg2;
				if (local15 > 0) {
					local27 = local6.anInt895 + (local6.anInt900 * local15 >> 8);
					local37 = local6.anInt875 + (local6.anInt901 * local15 >> 8);
					local47 = local6.anInt886 + (local6.anInt879 * local15 >> 8);
					local57 = local6.anInt891 + (local6.anInt889 * local15 >> 8);
					if (arg0 >= local27 && arg0 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt888 == 4) {
				local15 = arg2 - local6.anInt884;
				if (local15 > 0) {
					local27 = local6.anInt895 + (local6.anInt900 * local15 >> 8);
					local37 = local6.anInt875 + (local6.anInt901 * local15 >> 8);
					local47 = local6.anInt886 + (local6.anInt879 * local15 >> 8);
					local57 = local6.anInt891 + (local6.anInt889 * local15 >> 8);
					if (arg0 >= local27 && arg0 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt888 == 5) {
				local15 = arg1 - local6.anInt886;
				if (local15 > 0) {
					local27 = local6.anInt895 + (local6.anInt900 * local15 >> 8);
					local37 = local6.anInt875 + (local6.anInt901 * local15 >> 8);
					local47 = local6.anInt884 + (local6.anInt890 * local15 >> 8);
					local57 = local6.anInt887 + (local6.anInt878 * local15 >> 8);
					if (arg0 >= local27 && arg0 <= local37 && arg2 >= local47 && arg2 <= local57) {
						return true;
					}
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(Lclient!pf;IIIII)V")
	private void method1028(@OriginalArg(0) Class4_Sub3_Sub1_Sub5 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(1) boolean local1 = true;
		@Pc(3) int local3 = arg2;
		@Pc(7) int local7 = arg2 + arg4;
		@Pc(11) int local11 = arg3 - 1;
		@Pc(15) int local15 = arg3 + arg5;
		for (@Pc(17) int local17 = arg1; local17 <= arg1 + 1; local17++) {
			if (local17 != this.anInt1617) {
				for (@Pc(24) int local24 = local3; local24 <= local7; local24++) {
					if (local24 >= 0 && local24 < this.anInt1626) {
						for (@Pc(34) int local34 = local11; local34 <= local15; local34++) {
							if (local34 >= 0 && local34 < this.anInt1618 && (!local1 || local24 >= local7 || local34 >= local15 || local34 < arg3 && local24 != arg2)) {
								@Pc(66) Class4_Sub22 local66 = this.aClass4_Sub22ArrayArrayArray1[local17][local24][local34];
								if (local66 != null) {
									@Pc(160) int local160 = (this.anIntArrayArrayArray5[local17][local24][local34] + this.anIntArrayArrayArray5[local17][local24 + 1][local34] + this.anIntArrayArrayArray5[local17][local24][local34 + 1] + this.anIntArrayArrayArray5[local17][local24 + 1][local34 + 1]) / 4 - (this.anIntArrayArrayArray5[arg1][arg2][arg3] + this.anIntArrayArrayArray5[arg1][arg2 + 1][arg3] + this.anIntArrayArrayArray5[arg1][arg2][arg3 + 1] + this.anIntArrayArrayArray5[arg1][arg2 + 1][arg3 + 1]) / 4;
									@Pc(163) Class1 local163 = local66.aClass1_1;
									if (local163 != null) {
										@Pc(173) Class4_Sub3_Sub1_Sub5 local173;
										if (local163.aClass4_Sub3_Sub1_2 instanceof Class4_Sub3_Sub1_Sub5) {
											local173 = (Class4_Sub3_Sub1_Sub5) local163.aClass4_Sub3_Sub1_2;
											Static89.method1435(arg0, local173, (local24 - arg2) * 128 + (1 - arg4) * 64, local160, (local34 - arg3) * 128 + (1 - arg5) * 64, local1);
										}
										if (local163.aClass4_Sub3_Sub1_1 instanceof Class4_Sub3_Sub1_Sub5) {
											local173 = (Class4_Sub3_Sub1_Sub5) local163.aClass4_Sub3_Sub1_1;
											Static89.method1435(arg0, local173, (local24 - arg2) * 128 + (1 - arg4) * 64, local160, (local34 - arg3) * 128 + (1 - arg5) * 64, local1);
										}
									}
									for (@Pc(237) int local237 = 0; local237 < local66.anInt2810; local237++) {
										@Pc(243) Class66 local243 = local66.aClass66Array3[local237];
										if (local243 != null && local243.aClass4_Sub3_Sub1_6 instanceof Class4_Sub3_Sub1_Sub5) {
											@Pc(253) Class4_Sub3_Sub1_Sub5 local253 = (Class4_Sub3_Sub1_Sub5) local243.aClass4_Sub3_Sub1_6;
											@Pc(261) int local261 = local243.anInt2134 + 1 - local243.anInt2133;
											@Pc(269) int local269 = local243.anInt2140 + 1 - local243.anInt2136;
											Static89.method1435(arg0, local253, (local243.anInt2133 - arg2) * 128 + (local261 - arg4) * 64, local160, (local243.anInt2136 - arg3) * 128 + (local269 - arg5) * 64, local1);
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

	@OriginalMember(owner = "client!le", name = "e", descriptor = "(IIII)V")
	public void method1029(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(8) Class4_Sub22 local8 = this.aClass4_Sub22ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 != null) {
			this.aClass4_Sub22ArrayArrayArray1[arg0][arg1][arg2].anInt2815 = arg3;
		}
	}

	@OriginalMember(owner = "client!le", name = "m", descriptor = "(III)I")
	public int method1031(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class4_Sub22 local8 = this.aClass4_Sub22ArrayArrayArray1[arg0][arg1][arg2];
		return local8 == null || local8.aClass27_1 == null ? 0 : local8.aClass27_1.anInt1078;
	}

	@OriginalMember(owner = "client!le", name = "b", descriptor = "()V")
	private void method1032() {
		@Pc(3) int local3 = Static64.anIntArray180[Static64.anInt1616];
		@Pc(7) Class20[] local7 = Static64.aClass20ArrayArray1[Static64.anInt1616];
		Static64.anInt1604 = 0;
		for (@Pc(11) int local11 = 0; local11 < local3; local11++) {
			@Pc(16) Class20 local16 = local7[local11];
			@Pc(27) int local27;
			@Pc(40) int local40;
			@Pc(51) int local51;
			@Pc(79) int local79;
			@Pc(58) boolean local58;
			if (local16.anInt896 == 1) {
				local27 = local16.anInt899 + 25 - Static64.anInt1608;
				if (local27 >= 0 && local27 <= 50) {
					local40 = local16.anInt892 + 25 - Static64.anInt1620;
					if (local40 < 0) {
						local40 = 0;
					}
					local51 = local16.anInt885 + 25 - Static64.anInt1620;
					if (local51 > 50) {
						local51 = 50;
					}
					local58 = false;
					while (local40 <= local51) {
						if (Static64.aBooleanArrayArray1[local27][local40++]) {
							local58 = true;
							break;
						}
					}
					if (local58) {
						local79 = Static64.anInt1611 - local16.anInt895;
						if (local79 > 32) {
							local16.anInt888 = 1;
						} else {
							if (local79 >= -32) {
								continue;
							}
							local16.anInt888 = 2;
							local79 = -local79;
						}
						local16.anInt890 = (local16.anInt884 - Static64.anInt1600 << 8) / local79;
						local16.anInt878 = (local16.anInt887 - Static64.anInt1600 << 8) / local79;
						local16.anInt879 = (local16.anInt886 - Static64.anInt1615 << 8) / local79;
						local16.anInt889 = (local16.anInt891 - Static64.anInt1615 << 8) / local79;
						Static64.aClass20Array1[Static64.anInt1604++] = local16;
					}
				}
			} else if (local16.anInt896 == 2) {
				local27 = local16.anInt892 + 25 - Static64.anInt1620;
				if (local27 >= 0 && local27 <= 50) {
					local40 = local16.anInt899 + 25 - Static64.anInt1608;
					if (local40 < 0) {
						local40 = 0;
					}
					local51 = local16.anInt882 + 25 - Static64.anInt1608;
					if (local51 > 50) {
						local51 = 50;
					}
					local58 = false;
					while (local40 <= local51) {
						if (Static64.aBooleanArrayArray1[local40++][local27]) {
							local58 = true;
							break;
						}
					}
					if (local58) {
						local79 = Static64.anInt1600 - local16.anInt884;
						if (local79 > 32) {
							local16.anInt888 = 3;
						} else {
							if (local79 >= -32) {
								continue;
							}
							local16.anInt888 = 4;
							local79 = -local79;
						}
						local16.anInt900 = (local16.anInt895 - Static64.anInt1611 << 8) / local79;
						local16.anInt901 = (local16.anInt875 - Static64.anInt1611 << 8) / local79;
						local16.anInt879 = (local16.anInt886 - Static64.anInt1615 << 8) / local79;
						local16.anInt889 = (local16.anInt891 - Static64.anInt1615 << 8) / local79;
						Static64.aClass20Array1[Static64.anInt1604++] = local16;
					}
				}
			} else if (local16.anInt896 == 4) {
				local27 = local16.anInt886 - Static64.anInt1615;
				if (local27 > 128) {
					local40 = local16.anInt892 + 25 - Static64.anInt1620;
					if (local40 < 0) {
						local40 = 0;
					}
					local51 = local16.anInt885 + 25 - Static64.anInt1620;
					if (local51 > 50) {
						local51 = 50;
					}
					if (local40 <= local51) {
						@Pc(319) int local319 = local16.anInt899 + 25 - Static64.anInt1608;
						if (local319 < 0) {
							local319 = 0;
						}
						local79 = local16.anInt882 + 25 - Static64.anInt1608;
						if (local79 > 50) {
							local79 = 50;
						}
						@Pc(337) boolean local337 = false;
						label142: for (@Pc(339) int local339 = local319; local339 <= local79; local339++) {
							for (@Pc(342) int local342 = local40; local342 <= local51; local342++) {
								if (Static64.aBooleanArrayArray1[local339][local342]) {
									local337 = true;
									break label142;
								}
							}
						}
						if (local337) {
							local16.anInt888 = 5;
							local16.anInt900 = (local16.anInt895 - Static64.anInt1611 << 8) / local27;
							local16.anInt901 = (local16.anInt875 - Static64.anInt1611 << 8) / local27;
							local16.anInt890 = (local16.anInt884 - Static64.anInt1600 << 8) / local27;
							local16.anInt878 = (local16.anInt887 - Static64.anInt1600 << 8) / local27;
							Static64.aClass20Array1[Static64.anInt1604++] = local16;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!le", name = "n", descriptor = "(III)Lclient!qa;")
	public Class66 method1033(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class4_Sub22 local8 = this.aClass4_Sub22ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 == null) {
			return null;
		}
		for (@Pc(14) int local14 = 0; local14 < local8.anInt2810; local14++) {
			@Pc(20) Class66 local20 = local8.aClass66Array3[local14];
			if ((local20.anInt2142 >> 29 & 0x3) == 2 && local20.anInt2133 == arg1 && local20.anInt2136 == arg2) {
				return local20;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!le", name = "o", descriptor = "(III)V")
	public void method1034(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class4_Sub22 local8 = this.aClass4_Sub22ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 != null) {
			local8.aClass76_1 = null;
		}
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(IIIILclient!h;Lclient!h;IIIIII)V")
	public void method1035(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class4_Sub3_Sub1 arg4, @OriginalArg(5) Class4_Sub3_Sub1 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11) {
		if (arg4 == null) {
			return;
		}
		@Pc(6) Class17 local6 = new Class17();
		local6.anInt846 = arg10;
		local6.anInt836 = arg11;
		local6.anInt842 = arg1 * 128 + 64;
		local6.anInt843 = arg2 * 128 + 64;
		local6.anInt838 = arg3;
		local6.aClass4_Sub3_Sub1_4 = arg4;
		local6.aClass4_Sub3_Sub1_3 = arg5;
		local6.anInt845 = arg6;
		local6.anInt840 = arg7;
		local6.anInt844 = arg8;
		local6.anInt837 = arg9;
		for (@Pc(49) int local49 = arg0; local49 >= 0; local49--) {
			if (this.aClass4_Sub22ArrayArrayArray1[local49][arg1][arg2] == null) {
				this.aClass4_Sub22ArrayArrayArray1[local49][arg1][arg2] = new Class4_Sub22(local49, arg1, arg2);
			}
		}
		this.aClass4_Sub22ArrayArrayArray1[arg0][arg1][arg2].aClass17_1 = local6;
	}

	@OriginalMember(owner = "client!le", name = "p", descriptor = "(III)V")
	public void method1037(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class4_Sub22 local8 = this.aClass4_Sub22ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 != null) {
			local8.aClass1_1 = null;
		}
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(IIIIII)V")
	public void method1038(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (arg0 < 0) {
			arg0 = 0;
		} else if (arg0 >= this.anInt1626 * 128) {
			arg0 = this.anInt1626 * 128 - 1;
		}
		if (arg2 < 0) {
			arg2 = 0;
		} else if (arg2 >= this.anInt1618 * 128) {
			arg2 = this.anInt1618 * 128 - 1;
		}
		Static64.anInt1601++;
		Static64.anInt1607 = Class4_Sub3_Sub6_Sub4.anIntArray301[arg3];
		Static64.anInt1624 = Class4_Sub3_Sub6_Sub4.anIntArray304[arg3];
		Static64.anInt1606 = Class4_Sub3_Sub6_Sub4.anIntArray301[arg4];
		Static64.anInt1603 = Class4_Sub3_Sub6_Sub4.anIntArray304[arg4];
		Static64.aBooleanArrayArray1 = Static64.aBooleanArrayArrayArrayArray1[(arg3 - 128) / 32][arg4 / 64];
		Static64.anInt1611 = arg0;
		Static64.anInt1615 = arg1;
		Static64.anInt1600 = arg2;
		Static64.anInt1608 = arg0 / 128;
		Static64.anInt1620 = arg2 / 128;
		Static64.anInt1616 = arg5;
		Static64.anInt1599 = Static64.anInt1608 - 25;
		if (Static64.anInt1599 < 0) {
			Static64.anInt1599 = 0;
		}
		Static64.anInt1612 = Static64.anInt1620 - 25;
		if (Static64.anInt1612 < 0) {
			Static64.anInt1612 = 0;
		}
		Static64.anInt1623 = Static64.anInt1608 + 25;
		if (Static64.anInt1623 > this.anInt1626) {
			Static64.anInt1623 = this.anInt1626;
		}
		Static64.anInt1621 = Static64.anInt1620 + 25;
		if (Static64.anInt1621 > this.anInt1618) {
			Static64.anInt1621 = this.anInt1618;
		}
		this.method1032();
		Static64.anInt1622 = 0;
		@Pc(136) int local136;
		@Pc(139) int local139;
		for (@Pc(128) int local128 = this.anInt1619; local128 < this.anInt1617; local128++) {
			@Pc(134) Class4_Sub22[][] local134 = this.aClass4_Sub22ArrayArrayArray1[local128];
			for (local136 = Static64.anInt1599; local136 < Static64.anInt1623; local136++) {
				for (local139 = Static64.anInt1612; local139 < Static64.anInt1621; local139++) {
					@Pc(146) Class4_Sub22 local146 = local134[local136][local139];
					if (local146 != null) {
						if (local146.anInt2815 <= arg5 && (Static64.aBooleanArrayArray1[local136 + 25 - Static64.anInt1608][local139 + 25 - Static64.anInt1620] || this.anIntArrayArrayArray5[local128][local136][local139] - arg1 >= 2000)) {
							local146.aBoolean119 = true;
							local146.aBoolean118 = true;
							if (local146.anInt2810 > 0) {
								local146.aBoolean120 = true;
							} else {
								local146.aBoolean120 = false;
							}
							Static64.anInt1622++;
						} else {
							local146.aBoolean119 = false;
							local146.aBoolean118 = false;
							local146.anInt2812 = 0;
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
		for (@Pc(224) int local224 = this.anInt1619; local224 < this.anInt1617; local224++) {
			@Pc(230) Class4_Sub22[][] local230 = this.aClass4_Sub22ArrayArrayArray1[local224];
			for (local139 = -25; local139 <= 0; local139++) {
				local237 = Static64.anInt1608 + local139;
				local241 = Static64.anInt1608 - local139;
				if (local237 >= Static64.anInt1599 || local241 < Static64.anInt1623) {
					for (local249 = -25; local249 <= 0; local249++) {
						local254 = Static64.anInt1620 + local249;
						local258 = Static64.anInt1620 - local249;
						@Pc(270) Class4_Sub22 local270;
						if (local237 >= Static64.anInt1599) {
							if (local254 >= Static64.anInt1612) {
								local270 = local230[local237][local254];
								if (local270 != null && local270.aBoolean119) {
									this.method1020(local270, true);
								}
							}
							if (local258 < Static64.anInt1621) {
								local270 = local230[local237][local258];
								if (local270 != null && local270.aBoolean119) {
									this.method1020(local270, true);
								}
							}
						}
						if (local241 < Static64.anInt1623) {
							if (local254 >= Static64.anInt1612) {
								local270 = local230[local241][local254];
								if (local270 != null && local270.aBoolean119) {
									this.method1020(local270, true);
								}
							}
							if (local258 < Static64.anInt1621) {
								local270 = local230[local241][local258];
								if (local270 != null && local270.aBoolean119) {
									this.method1020(local270, true);
								}
							}
						}
						if (Static64.anInt1622 == 0) {
							Static64.aBoolean56 = false;
							return;
						}
					}
				}
			}
		}
		for (local136 = this.anInt1619; local136 < this.anInt1617; local136++) {
			@Pc(361) Class4_Sub22[][] local361 = this.aClass4_Sub22ArrayArrayArray1[local136];
			for (local237 = -25; local237 <= 0; local237++) {
				local241 = Static64.anInt1608 + local237;
				local249 = Static64.anInt1608 - local237;
				if (local241 >= Static64.anInt1599 || local249 < Static64.anInt1623) {
					for (local254 = -25; local254 <= 0; local254++) {
						local258 = Static64.anInt1620 + local254;
						@Pc(389) int local389 = Static64.anInt1620 - local254;
						@Pc(401) Class4_Sub22 local401;
						if (local241 >= Static64.anInt1599) {
							if (local258 >= Static64.anInt1612) {
								local401 = local361[local241][local258];
								if (local401 != null && local401.aBoolean119) {
									this.method1020(local401, false);
								}
							}
							if (local389 < Static64.anInt1621) {
								local401 = local361[local241][local389];
								if (local401 != null && local401.aBoolean119) {
									this.method1020(local401, false);
								}
							}
						}
						if (local249 < Static64.anInt1623) {
							if (local258 >= Static64.anInt1612) {
								local401 = local361[local249][local258];
								if (local401 != null && local401.aBoolean119) {
									this.method1020(local401, false);
								}
							}
							if (local389 < Static64.anInt1621) {
								local401 = local361[local249][local389];
								if (local401 != null && local401.aBoolean119) {
									this.method1020(local401, false);
								}
							}
						}
						if (Static64.anInt1622 == 0) {
							Static64.aBoolean56 = false;
							return;
						}
					}
				}
			}
		}
		Static64.aBoolean56 = false;
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(I)V")
	public void method1039(@OriginalArg(0) int arg0) {
		this.anInt1619 = arg0;
		for (@Pc(4) int local4 = 0; local4 < this.anInt1626; local4++) {
			for (@Pc(7) int local7 = 0; local7 < this.anInt1618; local7++) {
				if (this.aClass4_Sub22ArrayArrayArray1[arg0][local4][local7] == null) {
					this.aClass4_Sub22ArrayArrayArray1[arg0][local4][local7] = new Class4_Sub22(arg0, local4, local7);
				}
			}
		}
	}

	@OriginalMember(owner = "client!le", name = "d", descriptor = "()V")
	public void method1040() {
		@Pc(4) int local4;
		@Pc(7) int local7;
		for (@Pc(1) int local1 = 0; local1 < this.anInt1617; local1++) {
			for (local4 = 0; local4 < this.anInt1626; local4++) {
				for (local7 = 0; local7 < this.anInt1618; local7++) {
					this.aClass4_Sub22ArrayArrayArray1[local1][local4][local7] = null;
				}
			}
		}
		for (local4 = 0; local4 < Static64.anInt1609; local4++) {
			for (local7 = 0; local7 < Static64.anIntArray180[local4]; local7++) {
				Static64.aClass20ArrayArray1[local4][local7] = null;
			}
			Static64.anIntArray180[local4] = 0;
		}
		for (local7 = 0; local7 < this.anInt1605; local7++) {
			this.aClass66Array1[local7] = null;
		}
		this.anInt1605 = 0;
		for (@Pc(76) int local76 = 0; local76 < Static64.aClass66Array2.length; local76++) {
			Static64.aClass66Array2[local76] = null;
		}
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(IIIILclient!h;ILclient!h;Lclient!h;)V")
	public void method1041(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class4_Sub3_Sub1 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class4_Sub3_Sub1 arg6, @OriginalArg(7) Class4_Sub3_Sub1 arg7) {
		@Pc(3) Class76 local3 = new Class76();
		local3.aClass4_Sub3_Sub1_9 = arg4;
		local3.anInt2744 = arg1 * 128 + 64;
		local3.anInt2747 = arg2 * 128 + 64;
		local3.anInt2746 = arg3;
		local3.anInt2751 = arg5;
		local3.aClass4_Sub3_Sub1_8 = arg6;
		local3.aClass4_Sub3_Sub1_7 = arg7;
		@Pc(34) int local34 = 0;
		@Pc(43) Class4_Sub22 local43 = this.aClass4_Sub22ArrayArrayArray1[arg0][arg1][arg2];
		if (local43 != null) {
			for (@Pc(47) int local47 = 0; local47 < local43.anInt2810; local47++) {
				if ((local43.aClass66Array3[local47].anInt2131 & 0x100) == 256 && local43.aClass66Array3[local47].aClass4_Sub3_Sub1_6 instanceof Class4_Sub3_Sub1_Sub7) {
					@Pc(71) Class4_Sub3_Sub1_Sub7 local71 = (Class4_Sub3_Sub1_Sub7) local43.aClass66Array3[local47].aClass4_Sub3_Sub1_6;
					local71.method1493();
					if (local71.anInt2166 > local34) {
						local34 = local71.anInt2166;
					}
				}
			}
		}
		local3.anInt2750 = local34;
		if (this.aClass4_Sub22ArrayArrayArray1[arg0][arg1][arg2] == null) {
			this.aClass4_Sub22ArrayArrayArray1[arg0][arg1][arg2] = new Class4_Sub22(arg0, arg1, arg2);
		}
		this.aClass4_Sub22ArrayArrayArray1[arg0][arg1][arg2].aClass76_1 = local3;
	}

	@OriginalMember(owner = "client!le", name = "q", descriptor = "(III)V")
	public void method1042(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class4_Sub22 local8 = this.aClass4_Sub22ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 == null) {
			return;
		}
		for (@Pc(13) int local13 = 0; local13 < local8.anInt2810; local13++) {
			@Pc(19) Class66 local19 = local8.aClass66Array3[local13];
			if ((local19.anInt2142 >> 29 & 0x3) == 2 && local19.anInt2133 == arg1 && local19.anInt2136 == arg2) {
				this.method1050(local19);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(Lclient!sd;IIIIIII)V")
	private void method1043(@OriginalArg(0) Class71 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(6) int local6;
		@Pc(7) int local7 = local6 = (arg6 << 7) - Static64.anInt1611;
		@Pc(14) int local14;
		@Pc(15) int local15 = local14 = (arg7 << 7) - Static64.anInt1600;
		@Pc(20) int local20;
		@Pc(21) int local21 = local20 = local7 + 128;
		@Pc(26) int local26;
		@Pc(27) int local27 = local26 = local15 + 128;
		@Pc(38) int local38 = this.anIntArrayArrayArray5[arg1][arg6][arg7] - Static64.anInt1615;
		@Pc(51) int local51 = this.anIntArrayArrayArray5[arg1][arg6 + 1][arg7] - Static64.anInt1615;
		@Pc(66) int local66 = this.anIntArrayArrayArray5[arg1][arg6 + 1][arg7 + 1] - Static64.anInt1615;
		@Pc(79) int local79 = this.anIntArrayArrayArray5[arg1][arg6][arg7 + 1] - Static64.anInt1615;
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
		@Pc(279) int local279 = Static100.anInt2358 + (local101 << 9) / local121;
		@Pc(287) int local287 = Static100.anInt2351 + (local123 << 9) / local121;
		@Pc(295) int local295 = Static100.anInt2358 + (local21 << 9) / local169;
		@Pc(303) int local303 = Static100.anInt2351 + (local51 << 9) / local169;
		@Pc(311) int local311 = Static100.anInt2358 + (local197 << 9) / local27;
		@Pc(319) int local319 = Static100.anInt2351 + (local66 << 9) / local27;
		@Pc(327) int local327 = Static100.anInt2358 + (local245 << 9) / local265;
		@Pc(335) int local335 = Static100.anInt2351 + (local89 << 9) / local265;
		Static100.anInt2356 = 0;
		@Pc(472) int local472;
		if ((local311 - local327) * (local303 - local335) - (local319 - local335) * (local295 - local327) > 0) {
			Static100.aBoolean87 = false;
			if (local311 < 0 || local327 < 0 || local295 < 0 || local311 > Static100.anInt2353 || local327 > Static100.anInt2353 || local295 > Static100.anInt2353) {
				Static100.aBoolean87 = true;
			}
			if (Static64.aBoolean56 && this.method1044(Static64.anInt1613, Static64.anInt1602, local319, local335, local303, local311, local327, local295)) {
				Static64.anInt1625 = arg6;
				Static64.anInt1610 = arg7;
			}
			if (arg0.anInt2482 == -1) {
				if (arg0.anInt2483 != 12345678) {
					Static100.method1673(local319, local335, local303, local311, local327, local295, arg0.anInt2483, arg0.anInt2476, arg0.anInt2484);
				}
			} else if (Static64.aBoolean55) {
				local472 = Static100.anInterface3_1.method1563(arg0.anInt2482);
				Static100.method1673(local319, local335, local303, local311, local327, local295, Static64.method1019(local472, arg0.anInt2483), Static64.method1019(local472, arg0.anInt2476), Static64.method1019(local472, arg0.anInt2484));
			} else if (arg0.aBoolean105) {
				Static100.method1672(local319, local335, local303, local311, local327, local295, arg0.anInt2483, arg0.anInt2476, arg0.anInt2484, local101, local21, local245, local123, local51, local89, local121, local169, local265, arg0.anInt2482);
			} else {
				Static100.method1672(local319, local335, local303, local311, local327, local295, arg0.anInt2483, arg0.anInt2476, arg0.anInt2484, local197, local245, local21, local66, local89, local51, local27, local265, local169, arg0.anInt2482);
			}
		}
		if ((local279 - local295) * (local335 - local303) - (local287 - local303) * (local327 - local295) <= 0) {
			return;
		}
		Static100.aBoolean87 = false;
		if (local279 < 0 || local295 < 0 || local327 < 0 || local279 > Static100.anInt2353 || local295 > Static100.anInt2353 || local327 > Static100.anInt2353) {
			Static100.aBoolean87 = true;
		}
		if (Static64.aBoolean56 && this.method1044(Static64.anInt1613, Static64.anInt1602, local287, local303, local335, local279, local295, local327)) {
			Static64.anInt1625 = arg6;
			Static64.anInt1610 = arg7;
		}
		if (arg0.anInt2482 != -1) {
			if (!Static64.aBoolean55) {
				Static100.method1672(local287, local303, local335, local279, local295, local327, arg0.anInt2474, arg0.anInt2484, arg0.anInt2476, local101, local21, local245, local123, local51, local89, local121, local169, local265, arg0.anInt2482);
				return;
			}
			local472 = Static100.anInterface3_1.method1563(arg0.anInt2482);
			Static100.method1673(local287, local303, local335, local279, local295, local327, Static64.method1019(local472, arg0.anInt2474), Static64.method1019(local472, arg0.anInt2484), Static64.method1019(local472, arg0.anInt2476));
		} else if (arg0.anInt2474 != 12345678) {
			Static100.method1673(local287, local303, local335, local279, local295, local327, arg0.anInt2474, arg0.anInt2484, arg0.anInt2476);
			return;
		}
	}

	@OriginalMember(owner = "client!le", name = "b", descriptor = "(IIIIIIII)Z")
	private boolean method1044(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
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

	@OriginalMember(owner = "client!le", name = "a", descriptor = "([IIIIII)V")
	public void method1045(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(8) Class4_Sub22 local8 = this.aClass4_Sub22ArrayArrayArray1[arg2][arg3][arg4];
		if (local8 == null) {
			return;
		}
		@Pc(14) Class71 local14 = local8.aClass71_1;
		@Pc(24) int local24;
		if (local14 != null) {
			@Pc(19) int local19 = local14.anInt2477;
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
		@Pc(59) Class41 local59 = local8.aClass41_1;
		if (local59 == null) {
			return;
		}
		local24 = local59.anInt1551;
		@Pc(68) int local68 = local59.anInt1548;
		@Pc(71) int local71 = local59.anInt1550;
		@Pc(74) int local74 = local59.anInt1549;
		@Pc(79) int[] local79 = this.anIntArrayArray42[local24];
		@Pc(84) int[] local84 = this.anIntArrayArray43[local68];
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

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(IIIIILclient!h;IIZ)Z")
	public boolean method1046(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class4_Sub3_Sub1 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8) {
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
		return this.method1010(arg0, local7, local11, local15 + 1 - local7, local19 - local11 + 1, arg1, arg2, arg3, arg5, arg6, true, arg7, 0);
	}

	@OriginalMember(owner = "client!le", name = "r", descriptor = "(III)V")
	public void method1047(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class4_Sub22 local8 = this.aClass4_Sub22ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 != null) {
			local8.aClass27_1 = null;
		}
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(IIIIIIIIIIIIIIIIIIII)V")
	public void method1048(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int arg15, @OriginalArg(16) int arg16, @OriginalArg(17) int arg17, @OriginalArg(18) int arg18, @OriginalArg(19) int arg19) {
		@Pc(12) Class71 local12;
		@Pc(14) int local14;
		if (arg3 == 0) {
			local12 = new Class71(arg10, arg11, arg12, arg13, -1, arg18, false);
			for (local14 = arg0; local14 >= 0; local14--) {
				if (this.aClass4_Sub22ArrayArrayArray1[local14][arg1][arg2] == null) {
					this.aClass4_Sub22ArrayArrayArray1[local14][arg1][arg2] = new Class4_Sub22(local14, arg1, arg2);
				}
			}
			this.aClass4_Sub22ArrayArrayArray1[arg0][arg1][arg2].aClass71_1 = local12;
		} else if (arg3 == 1) {
			local12 = new Class71(arg14, arg15, arg16, arg17, arg5, arg19, arg6 == arg7 && arg6 == arg8 && arg6 == arg9);
			for (local14 = arg0; local14 >= 0; local14--) {
				if (this.aClass4_Sub22ArrayArrayArray1[local14][arg1][arg2] == null) {
					this.aClass4_Sub22ArrayArrayArray1[local14][arg1][arg2] = new Class4_Sub22(local14, arg1, arg2);
				}
			}
			this.aClass4_Sub22ArrayArrayArray1[arg0][arg1][arg2].aClass71_1 = local12;
		} else {
			@Pc(140) Class41 local140 = new Class41(arg3, arg4, arg5, arg1, arg2, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17, arg18, arg19);
			for (local14 = arg0; local14 >= 0; local14--) {
				if (this.aClass4_Sub22ArrayArrayArray1[local14][arg1][arg2] == null) {
					this.aClass4_Sub22ArrayArrayArray1[local14][arg1][arg2] = new Class4_Sub22(local14, arg1, arg2);
				}
			}
			this.aClass4_Sub22ArrayArrayArray1[arg0][arg1][arg2].aClass41_1 = local140;
		}
	}

	@OriginalMember(owner = "client!le", name = "b", descriptor = "(IIIIII)Z")
	private boolean method1049(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(17) int local17;
		@Pc(21) int local21;
		if (arg1 != arg2 || arg3 != arg4) {
			for (local17 = arg1; local17 <= arg2; local17++) {
				for (local21 = arg3; local21 <= arg4; local21++) {
					if (this.anIntArrayArrayArray4[arg0][local17][local21] == -Static64.anInt1601) {
						return false;
					}
				}
			}
			local21 = (arg1 << 7) + 1;
			@Pc(156) int local156 = (arg3 << 7) + 2;
			@Pc(167) int local167 = this.anIntArrayArrayArray5[arg0][arg1][arg3] - arg5;
			if (!this.method1027(local21, local167, local156)) {
				return false;
			}
			@Pc(181) int local181 = (arg2 << 7) - 1;
			if (!this.method1027(local181, local167, local156)) {
				return false;
			}
			@Pc(195) int local195 = (arg4 << 7) - 1;
			if (!this.method1027(local21, local167, local195)) {
				return false;
			} else if (this.method1027(local181, local167, local195)) {
				return true;
			} else {
				return false;
			}
		} else if (this.method1026(arg0, arg1, arg3)) {
			local17 = arg1 << 7;
			local21 = arg3 << 7;
			return this.method1027(local17 + 1, this.anIntArrayArrayArray5[arg0][arg1][arg3] - arg5, local21 + 1) && this.method1027(local17 + 128 - 1, this.anIntArrayArrayArray5[arg0][arg1 + 1][arg3] - arg5, local21 + 1) && this.method1027(local17 + 128 - 1, this.anIntArrayArrayArray5[arg0][arg1 + 1][arg3 + 1] - arg5, local21 + 128 - 1) && this.method1027(local17 + 1, this.anIntArrayArrayArray5[arg0][arg1][arg3 + 1] - arg5, local21 + 128 - 1);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(Lclient!qa;)V")
	private void method1050(@OriginalArg(0) Class66 arg0) {
		for (@Pc(2) int local2 = arg0.anInt2133; local2 <= arg0.anInt2134; local2++) {
			for (@Pc(6) int local6 = arg0.anInt2136; local6 <= arg0.anInt2140; local6++) {
				@Pc(17) Class4_Sub22 local17 = this.aClass4_Sub22ArrayArrayArray1[arg0.anInt2129][local2][local6];
				if (local17 != null) {
					@Pc(36) int local36;
					for (@Pc(21) int local21 = 0; local21 < local17.anInt2810; local21++) {
						if (local17.aClass66Array3[local21] == arg0) {
							local17.anInt2810--;
							for (local36 = local21; local36 < local17.anInt2810; local36++) {
								local17.aClass66Array3[local36] = local17.aClass66Array3[local36 + 1];
								local17.anIntArray340[local36] = local17.anIntArray340[local36 + 1];
							}
							local17.aClass66Array3[local17.anInt2810] = null;
							break;
						}
					}
					local17.anInt2817 = 0;
					for (local36 = 0; local36 < local17.anInt2810; local36++) {
						local17.anInt2817 |= local17.anIntArray340[local36];
					}
				}
			}
		}
	}
}
