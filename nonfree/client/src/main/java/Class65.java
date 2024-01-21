import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ud")
public final class Class65 {

	@OriginalMember(owner = "client!ud", name = "e", descriptor = "I")
	private int anInt2630 = 0;

	@OriginalMember(owner = "client!ud", name = "C", descriptor = "[Lclient!ua;")
	private final Class63[] aClass63Array2 = new Class63[5000];

	@OriginalMember(owner = "client!ud", name = "P", descriptor = "I")
	private int anInt2653 = 0;

	@OriginalMember(owner = "client!ud", name = "Q", descriptor = "[[I")
	private final int[][] anIntArrayArray61 = new int[][] { { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 }, { 12, 8, 4, 0, 13, 9, 5, 1, 14, 10, 6, 2, 15, 11, 7, 3 }, { 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 }, { 3, 7, 11, 15, 2, 6, 10, 14, 1, 5, 9, 13, 0, 4, 8, 12 } };

	@OriginalMember(owner = "client!ud", name = "R", descriptor = "[[I")
	private final int[][] anIntArrayArray62 = new int[][] { new int[16], { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 1 }, { 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0 }, { 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1 }, { 1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 1 } };

	@OriginalMember(owner = "client!ud", name = "ab", descriptor = "I")
	private int anInt2659 = 0;

	@OriginalMember(owner = "client!ud", name = "fb", descriptor = "[I")
	private final int[] anIntArray365 = new int[10000];

	@OriginalMember(owner = "client!ud", name = "S", descriptor = "[I")
	private final int[] anIntArray361 = new int[10000];

	@OriginalMember(owner = "client!ud", name = "n", descriptor = "I")
	private final int anInt2638;

	@OriginalMember(owner = "client!ud", name = "I", descriptor = "I")
	private final int anInt2648;

	@OriginalMember(owner = "client!ud", name = "L", descriptor = "I")
	private final int anInt2650;

	@OriginalMember(owner = "client!ud", name = "c", descriptor = "[[[Lclient!ja;")
	private final Class1_Sub8[][][] aClass1_Sub8ArrayArrayArray1;

	@OriginalMember(owner = "client!ud", name = "H", descriptor = "[[[I")
	private final int[][][] anIntArrayArrayArray7;

	@OriginalMember(owner = "client!ud", name = "p", descriptor = "[[[I")
	private final int[][][] anIntArrayArrayArray6;

	@OriginalMember(owner = "client!ud", name = "<init>", descriptor = "(III[[[I)V")
	public Class65(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[][][] arg3) {
		this.anInt2638 = arg0;
		this.anInt2648 = arg1;
		this.anInt2650 = arg2;
		this.aClass1_Sub8ArrayArrayArray1 = new Class1_Sub8[arg0][arg1][arg2];
		this.anIntArrayArrayArray7 = new int[arg0][arg1 + 1][arg2 + 1];
		this.anIntArrayArrayArray6 = arg3;
		this.method1722();
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(III)Z")
	private boolean method1712(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < Static103.anInt2628; local1++) {
			@Pc(6) Class24 local6 = Static103.aClass24Array1[local1];
			@Pc(15) int local15;
			@Pc(27) int local27;
			@Pc(37) int local37;
			@Pc(47) int local47;
			@Pc(57) int local57;
			if (local6.anInt1108 == 1) {
				local15 = local6.anInt1115 - arg0;
				if (local15 > 0) {
					local27 = local6.anInt1090 + (local6.anInt1106 * local15 >> 8);
					local37 = local6.anInt1113 + (local6.anInt1100 * local15 >> 8);
					local47 = local6.anInt1114 + (local6.anInt1098 * local15 >> 8);
					local57 = local6.anInt1091 + (local6.anInt1102 * local15 >> 8);
					if (arg2 >= local27 && arg2 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt1108 == 2) {
				local15 = arg0 - local6.anInt1115;
				if (local15 > 0) {
					local27 = local6.anInt1090 + (local6.anInt1106 * local15 >> 8);
					local37 = local6.anInt1113 + (local6.anInt1100 * local15 >> 8);
					local47 = local6.anInt1114 + (local6.anInt1098 * local15 >> 8);
					local57 = local6.anInt1091 + (local6.anInt1102 * local15 >> 8);
					if (arg2 >= local27 && arg2 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt1108 == 3) {
				local15 = local6.anInt1090 - arg2;
				if (local15 > 0) {
					local27 = local6.anInt1115 + (local6.anInt1123 * local15 >> 8);
					local37 = local6.anInt1120 + (local6.anInt1107 * local15 >> 8);
					local47 = local6.anInt1114 + (local6.anInt1098 * local15 >> 8);
					local57 = local6.anInt1091 + (local6.anInt1102 * local15 >> 8);
					if (arg0 >= local27 && arg0 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt1108 == 4) {
				local15 = arg2 - local6.anInt1090;
				if (local15 > 0) {
					local27 = local6.anInt1115 + (local6.anInt1123 * local15 >> 8);
					local37 = local6.anInt1120 + (local6.anInt1107 * local15 >> 8);
					local47 = local6.anInt1114 + (local6.anInt1098 * local15 >> 8);
					local57 = local6.anInt1091 + (local6.anInt1102 * local15 >> 8);
					if (arg0 >= local27 && arg0 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt1108 == 5) {
				local15 = arg1 - local6.anInt1114;
				if (local15 > 0) {
					local27 = local6.anInt1115 + (local6.anInt1123 * local15 >> 8);
					local37 = local6.anInt1120 + (local6.anInt1107 * local15 >> 8);
					local47 = local6.anInt1090 + (local6.anInt1106 * local15 >> 8);
					local57 = local6.anInt1113 + (local6.anInt1100 * local15 >> 8);
					if (arg0 >= local27 && arg0 <= local37 && arg2 >= local47 && arg2 <= local57) {
						return true;
					}
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(Lclient!ua;)V")
	private void method1713(@OriginalArg(0) Class63 arg0) {
		for (@Pc(2) int local2 = arg0.anInt2577; local2 <= arg0.anInt2592; local2++) {
			for (@Pc(6) int local6 = arg0.anInt2576; local6 <= arg0.anInt2588; local6++) {
				@Pc(17) Class1_Sub8 local17 = this.aClass1_Sub8ArrayArrayArray1[arg0.anInt2583][local2][local6];
				if (local17 != null) {
					@Pc(36) int local36;
					for (@Pc(21) int local21 = 0; local21 < local17.anInt1528; local21++) {
						if (local17.aClass63Array1[local21] == arg0) {
							local17.anInt1528--;
							for (local36 = local21; local36 < local17.anInt1528; local36++) {
								local17.aClass63Array1[local36] = local17.aClass63Array1[local36 + 1];
								local17.anIntArray179[local36] = local17.anIntArray179[local36 + 1];
							}
							local17.aClass63Array1[local17.anInt1528] = null;
							break;
						}
					}
					local17.anInt1533 = 0;
					for (local36 = 0; local36 < local17.anInt1528; local36++) {
						local17.anInt1533 |= local17.anIntArray179[local36];
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ud", name = "b", descriptor = "(III)V")
	public void method1714(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class1_Sub8 local8 = this.aClass1_Sub8ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 != null) {
			local8.aClass8_1 = null;
		}
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(IIIILclient!aa;II)V")
	public void method1715(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class1_Sub1_Sub2 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (arg4 == null) {
			return;
		}
		@Pc(6) Class32 local6 = new Class32();
		local6.aClass1_Sub1_Sub2_7 = arg4;
		local6.anInt1632 = arg1 * 128 + 64;
		local6.anInt1636 = arg2 * 128 + 64;
		local6.anInt1633 = arg3;
		local6.anInt1635 = arg5;
		local6.anInt1631 = arg6;
		if (this.aClass1_Sub8ArrayArrayArray1[arg0][arg1][arg2] == null) {
			this.aClass1_Sub8ArrayArrayArray1[arg0][arg1][arg2] = new Class1_Sub8(arg0, arg1, arg2);
		}
		this.aClass1_Sub8ArrayArrayArray1[arg0][arg1][arg2].aClass32_1 = local6;
	}

	@OriginalMember(owner = "client!ud", name = "c", descriptor = "(III)Lclient!ab;")
	public Class2 method1716(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class1_Sub8 local8 = this.aClass1_Sub8ArrayArrayArray1[arg0][arg1][arg2];
		return local8 == null ? null : local8.aClass2_1;
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(IIII)Z")
	private boolean method1717(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!this.method1719(arg0, arg1, arg2)) {
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
				if (local11 > Static103.anInt2627) {
					if (!this.method1712(local11, local26, local15)) {
						return false;
					}
					if (!this.method1712(local11, local26, local15 + 128)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!this.method1712(local11, local30, local15)) {
						return false;
					}
					if (!this.method1712(local11, local30, local15 + 128)) {
						return false;
					}
				}
				if (!this.method1712(local11, local34, local15)) {
					return false;
				}
				if (!this.method1712(local11, local34, local15 + 128)) {
					return false;
				}
				return true;
			}
			if (arg3 == 2) {
				if (local15 < Static103.anInt2633) {
					if (!this.method1712(local11, local26, local15 + 128)) {
						return false;
					}
					if (!this.method1712(local11 + 128, local26, local15 + 128)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!this.method1712(local11, local30, local15 + 128)) {
						return false;
					}
					if (!this.method1712(local11 + 128, local30, local15 + 128)) {
						return false;
					}
				}
				if (!this.method1712(local11, local34, local15 + 128)) {
					return false;
				}
				if (!this.method1712(local11 + 128, local34, local15 + 128)) {
					return false;
				}
				return true;
			}
			if (arg3 == 4) {
				if (local11 < Static103.anInt2627) {
					if (!this.method1712(local11 + 128, local26, local15)) {
						return false;
					}
					if (!this.method1712(local11 + 128, local26, local15 + 128)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!this.method1712(local11 + 128, local30, local15)) {
						return false;
					}
					if (!this.method1712(local11 + 128, local30, local15 + 128)) {
						return false;
					}
				}
				if (!this.method1712(local11 + 128, local34, local15)) {
					return false;
				}
				if (!this.method1712(local11 + 128, local34, local15 + 128)) {
					return false;
				}
				return true;
			}
			if (arg3 == 8) {
				if (local15 > Static103.anInt2633) {
					if (!this.method1712(local11, local26, local15)) {
						return false;
					}
					if (!this.method1712(local11 + 128, local26, local15)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!this.method1712(local11, local30, local15)) {
						return false;
					}
					if (!this.method1712(local11 + 128, local30, local15)) {
						return false;
					}
				}
				if (!this.method1712(local11, local34, local15)) {
					return false;
				}
				if (!this.method1712(local11 + 128, local34, local15)) {
					return false;
				}
				return true;
			}
		}
		if (!this.method1712(local11 + 64, local38, local15 + 64)) {
			return false;
		} else if (arg3 == 16) {
			return this.method1712(local11, local34, local15 + 128);
		} else if (arg3 == 32) {
			return this.method1712(local11 + 128, local34, local15 + 128);
		} else if (arg3 == 64) {
			return this.method1712(local11 + 128, local34, local15);
		} else if (arg3 == 128) {
			return this.method1712(local11, local34, local15);
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(I)V")
	public void method1718(@OriginalArg(0) int arg0) {
		this.anInt2653 = arg0;
		for (@Pc(4) int local4 = 0; local4 < this.anInt2648; local4++) {
			for (@Pc(7) int local7 = 0; local7 < this.anInt2650; local7++) {
				if (this.aClass1_Sub8ArrayArrayArray1[arg0][local4][local7] == null) {
					this.aClass1_Sub8ArrayArrayArray1[arg0][local4][local7] = new Class1_Sub8(arg0, local4, local7);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ud", name = "d", descriptor = "(III)Z")
	private boolean method1719(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) int local8 = this.anIntArrayArrayArray7[arg0][arg1][arg2];
		if (local8 == -Static103.anInt2634) {
			return false;
		} else if (local8 == Static103.anInt2634) {
			return true;
		} else {
			@Pc(23) int local23 = arg1 << 7;
			@Pc(27) int local27 = arg2 << 7;
			if (this.method1712(local23 + 1, this.anIntArrayArrayArray6[arg0][arg1][arg2], local27 + 1) && this.method1712(local23 + 128 - 1, this.anIntArrayArrayArray6[arg0][arg1 + 1][arg2], local27 + 1) && this.method1712(local23 + 128 - 1, this.anIntArrayArrayArray6[arg0][arg1 + 1][arg2 + 1], local27 + 128 - 1) && this.method1712(local23 + 1, this.anIntArrayArrayArray6[arg0][arg1][arg2 + 1], local27 + 128 - 1)) {
				this.anIntArrayArrayArray7[arg0][arg1][arg2] = Static103.anInt2634;
				return true;
			} else {
				this.anIntArrayArrayArray7[arg0][arg1][arg2] = -Static103.anInt2634;
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(IIIIIILclient!aa;III)Z")
	public boolean method1720(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class1_Sub1_Sub2 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		if (arg6 == null) {
			return true;
		} else {
			@Pc(11) int local11 = arg1 * 128 + arg4 * 64;
			@Pc(19) int local19 = arg2 * 128 + arg5 * 64;
			return this.method1751(arg0, arg1, arg2, arg4, arg5, local11, local19, arg3, arg6, arg7, false, arg8, arg9);
		}
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(II)V")
	public void method1721(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static103.aBoolean125 = true;
		Static103.anInt2640 = arg0;
		Static103.anInt2631 = arg1;
		Static103.anInt2644 = -1;
		Static103.anInt2632 = -1;
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "()V")
	public void method1722() {
		@Pc(4) int local4;
		@Pc(7) int local7;
		for (@Pc(1) int local1 = 0; local1 < this.anInt2638; local1++) {
			for (local4 = 0; local4 < this.anInt2648; local4++) {
				for (local7 = 0; local7 < this.anInt2650; local7++) {
					this.aClass1_Sub8ArrayArrayArray1[local1][local4][local7] = null;
				}
			}
		}
		for (local4 = 0; local4 < Static103.anInt2652; local4++) {
			for (local7 = 0; local7 < Static103.anIntArray356[local4]; local7++) {
				Static103.aClass24ArrayArray1[local4][local7] = null;
			}
			Static103.anIntArray356[local4] = 0;
		}
		for (local7 = 0; local7 < this.anInt2630; local7++) {
			this.aClass63Array2[local7] = null;
		}
		this.anInt2630 = 0;
		for (@Pc(76) int local76 = 0; local76 < Static103.aClass63Array3.length; local76++) {
			Static103.aClass63Array3[local76] = null;
		}
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(IIIIIIIIIIIIIIIIIIII)V")
	public void method1723(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int arg15, @OriginalArg(16) int arg16, @OriginalArg(17) int arg17, @OriginalArg(18) int arg18, @OriginalArg(19) int arg19) {
		@Pc(12) Class27 local12;
		@Pc(14) int local14;
		if (arg3 == 0) {
			local12 = new Class27(arg10, arg11, arg12, arg13, -1, arg18, false);
			for (local14 = arg0; local14 >= 0; local14--) {
				if (this.aClass1_Sub8ArrayArrayArray1[local14][arg1][arg2] == null) {
					this.aClass1_Sub8ArrayArrayArray1[local14][arg1][arg2] = new Class1_Sub8(local14, arg1, arg2);
				}
			}
			this.aClass1_Sub8ArrayArrayArray1[arg0][arg1][arg2].aClass27_1 = local12;
		} else if (arg3 == 1) {
			local12 = new Class27(arg14, arg15, arg16, arg17, arg5, arg19, arg6 == arg7 && arg6 == arg8 && arg6 == arg9);
			for (local14 = arg0; local14 >= 0; local14--) {
				if (this.aClass1_Sub8ArrayArrayArray1[local14][arg1][arg2] == null) {
					this.aClass1_Sub8ArrayArrayArray1[local14][arg1][arg2] = new Class1_Sub8(local14, arg1, arg2);
				}
			}
			this.aClass1_Sub8ArrayArrayArray1[arg0][arg1][arg2].aClass27_1 = local12;
		} else {
			@Pc(140) Class49 local140 = new Class49(arg3, arg4, arg5, arg1, arg2, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17, arg18, arg19);
			for (local14 = arg0; local14 >= 0; local14--) {
				if (this.aClass1_Sub8ArrayArrayArray1[local14][arg1][arg2] == null) {
					this.aClass1_Sub8ArrayArrayArray1[local14][arg1][arg2] = new Class1_Sub8(local14, arg1, arg2);
				}
			}
			this.aClass1_Sub8ArrayArrayArray1[arg0][arg1][arg2].aClass49_1 = local140;
		}
	}

	@OriginalMember(owner = "client!ud", name = "b", descriptor = "(IIII)Z")
	private boolean method1725(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.method1719(arg0, arg1, arg2)) {
			@Pc(11) int local11 = arg1 << 7;
			@Pc(15) int local15 = arg2 << 7;
			return this.method1712(local11 + 1, this.anIntArrayArrayArray6[arg0][arg1][arg2] - arg3, local15 + 1) && this.method1712(local11 + 128 - 1, this.anIntArrayArrayArray6[arg0][arg1 + 1][arg2] - arg3, local15 + 1) && this.method1712(local11 + 128 - 1, this.anIntArrayArrayArray6[arg0][arg1 + 1][arg2 + 1] - arg3, local15 + 128 - 1) && this.method1712(local11 + 1, this.anIntArrayArrayArray6[arg0][arg1][arg2 + 1] - arg3, local15 + 128 - 1);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ud", name = "c", descriptor = "(IIII)V")
	public void method1728(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(8) Class1_Sub8 local8 = this.aClass1_Sub8ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 != null) {
			this.aClass1_Sub8ArrayArrayArray1[arg0][arg1][arg2].anInt1534 = arg3;
		}
	}

	@OriginalMember(owner = "client!ud", name = "e", descriptor = "(III)V")
	public void method1729(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class1_Sub8 local8 = this.aClass1_Sub8ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 == null) {
			return;
		}
		for (@Pc(13) int local13 = 0; local13 < local8.anInt1528; local13++) {
			@Pc(19) Class63 local19 = local8.aClass63Array1[local13];
			if ((local19.anInt2582 >> 29 & 0x3) == 2 && local19.anInt2577 == arg1 && local19.anInt2576 == arg2) {
				this.method1713(local19);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!ud", name = "d", descriptor = "(IIII)I")
	public int method1730(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(8) Class1_Sub8 local8 = this.aClass1_Sub8ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 == null) {
			return -1;
		} else if (local8.aClass2_1 != null && local8.aClass2_1.anInt136 == arg3) {
			return local8.aClass2_1.anInt125 & 0xFF;
		} else if (local8.aClass25_1 != null && local8.aClass25_1.anInt1290 == arg3) {
			return local8.aClass25_1.anInt1303 & 0xFF;
		} else if (local8.aClass32_1 != null && local8.aClass32_1.anInt1635 == arg3) {
			return local8.aClass32_1.anInt1631 & 0xFF;
		} else {
			for (@Pc(56) int local56 = 0; local56 < local8.anInt1528; local56++) {
				if (local8.aClass63Array1[local56].anInt2582 == arg3) {
					return local8.aClass63Array1[local56].anInt2581 & 0xFF;
				}
			}
			return -1;
		}
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(IIIIILclient!aa;IIIIII)Z")
	public boolean method1731(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) Class1_Sub1_Sub2 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		return arg4 == null ? true : this.method1751(arg0, arg7, arg8, arg9 + 1 - arg7, arg10 - arg8 + 1, arg1, arg2, arg3, arg4, arg5, true, arg6, 0);
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(Lclient!qb;IIIII)V")
	private void method1732(@OriginalArg(0) Class1_Sub1_Sub2_Sub6 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(1) boolean local1 = true;
		@Pc(3) int local3 = arg2;
		@Pc(7) int local7 = arg2 + arg4;
		@Pc(11) int local11 = arg3 - 1;
		@Pc(15) int local15 = arg3 + arg5;
		for (@Pc(17) int local17 = arg1; local17 <= arg1 + 1; local17++) {
			if (local17 != this.anInt2638) {
				for (@Pc(24) int local24 = local3; local24 <= local7; local24++) {
					if (local24 >= 0 && local24 < this.anInt2648) {
						for (@Pc(34) int local34 = local11; local34 <= local15; local34++) {
							if (local34 >= 0 && local34 < this.anInt2650 && (!local1 || local24 >= local7 || local34 >= local15 || local34 < arg3 && local24 != arg2)) {
								@Pc(66) Class1_Sub8 local66 = this.aClass1_Sub8ArrayArrayArray1[local17][local24][local34];
								if (local66 != null) {
									@Pc(160) int local160 = (this.anIntArrayArrayArray6[local17][local24][local34] + this.anIntArrayArrayArray6[local17][local24 + 1][local34] + this.anIntArrayArrayArray6[local17][local24][local34 + 1] + this.anIntArrayArrayArray6[local17][local24 + 1][local34 + 1]) / 4 - (this.anIntArrayArrayArray6[arg1][arg2][arg3] + this.anIntArrayArrayArray6[arg1][arg2 + 1][arg3] + this.anIntArrayArrayArray6[arg1][arg2][arg3 + 1] + this.anIntArrayArrayArray6[arg1][arg2 + 1][arg3 + 1]) / 4;
									@Pc(163) Class2 local163 = local66.aClass2_1;
									if (local163 != null) {
										@Pc(173) Class1_Sub1_Sub2_Sub6 local173;
										if (local163.aClass1_Sub1_Sub2_1 instanceof Class1_Sub1_Sub2_Sub6) {
											local173 = (Class1_Sub1_Sub2_Sub6) local163.aClass1_Sub1_Sub2_1;
											if (local173.aClass20Array2 != null) {
												this.method1742(arg0, local173, (local24 - arg2) * 128 + (1 - arg4) * 64, local160, (local34 - arg3) * 128 + (1 - arg5) * 64, local1);
											}
										}
										if (local163.aClass1_Sub1_Sub2_2 instanceof Class1_Sub1_Sub2_Sub6) {
											local173 = (Class1_Sub1_Sub2_Sub6) local163.aClass1_Sub1_Sub2_2;
											if (local173.aClass20Array2 != null) {
												this.method1742(arg0, local173, (local24 - arg2) * 128 + (1 - arg4) * 64, local160, (local34 - arg3) * 128 + (1 - arg5) * 64, local1);
											}
										}
									}
									for (@Pc(245) int local245 = 0; local245 < local66.anInt1528; local245++) {
										@Pc(251) Class63 local251 = local66.aClass63Array1[local245];
										if (local251 != null && local251.aClass1_Sub1_Sub2_8 instanceof Class1_Sub1_Sub2_Sub6) {
											@Pc(261) Class1_Sub1_Sub2_Sub6 local261 = (Class1_Sub1_Sub2_Sub6) local251.aClass1_Sub1_Sub2_8;
											if (local261.aClass20Array2 != null) {
												@Pc(272) int local272 = local251.anInt2592 + 1 - local251.anInt2577;
												@Pc(280) int local280 = local251.anInt2588 + 1 - local251.anInt2576;
												this.method1742(arg0, local261, (local251.anInt2577 - arg2) * 128 + (local272 - arg4) * 64, local160, (local251.anInt2576 - arg3) * 128 + (local280 - arg5) * 64, local1);
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

	@OriginalMember(owner = "client!ud", name = "f", descriptor = "(III)I")
	public int method1733(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class1_Sub8 local8 = this.aClass1_Sub8ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 == null) {
			return 0;
		}
		for (@Pc(14) int local14 = 0; local14 < local8.anInt1528; local14++) {
			@Pc(20) Class63 local20 = local8.aClass63Array1[local14];
			if ((local20.anInt2582 >> 29 & 0x3) == 2 && local20.anInt2577 == arg1 && local20.anInt2576 == arg2) {
				return local20.anInt2582;
			}
		}
		return 0;
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(Lclient!qb;III)V")
	private void method1734(@OriginalArg(0) Class1_Sub1_Sub2_Sub6 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(14) Class1_Sub8 local14;
		@Pc(29) Class1_Sub1_Sub2_Sub6 local29;
		if (arg2 < this.anInt2648) {
			local14 = this.aClass1_Sub8ArrayArrayArray1[arg1][arg2 + 1][arg3];
			if (local14 != null && local14.aClass32_1 != null && local14.aClass32_1.aClass1_Sub1_Sub2_7 instanceof Class1_Sub1_Sub2_Sub6) {
				local29 = (Class1_Sub1_Sub2_Sub6) local14.aClass32_1.aClass1_Sub1_Sub2_7;
				if (local29.aClass20Array2 != null) {
					this.method1742(arg0, local29, 128, 0, 0, true);
				}
			}
		}
		if (arg3 < this.anInt2648) {
			local14 = this.aClass1_Sub8ArrayArrayArray1[arg1][arg2][arg3 + 1];
			if (local14 != null && local14.aClass32_1 != null && local14.aClass32_1.aClass1_Sub1_Sub2_7 instanceof Class1_Sub1_Sub2_Sub6) {
				local29 = (Class1_Sub1_Sub2_Sub6) local14.aClass32_1.aClass1_Sub1_Sub2_7;
				if (local29.aClass20Array2 != null) {
					this.method1742(arg0, local29, 0, 0, 128, true);
				}
			}
		}
		if (arg2 < this.anInt2648 && arg3 < this.anInt2650) {
			local14 = this.aClass1_Sub8ArrayArrayArray1[arg1][arg2 + 1][arg3 + 1];
			if (local14 != null && local14.aClass32_1 != null && local14.aClass32_1.aClass1_Sub1_Sub2_7 instanceof Class1_Sub1_Sub2_Sub6) {
				local29 = (Class1_Sub1_Sub2_Sub6) local14.aClass32_1.aClass1_Sub1_Sub2_7;
				if (local29.aClass20Array2 != null) {
					this.method1742(arg0, local29, 128, 0, 128, true);
				}
			}
		}
		if (arg2 >= this.anInt2648 || arg3 <= 0) {
			return;
		}
		local14 = this.aClass1_Sub8ArrayArrayArray1[arg1][arg2 + 1][arg3 - 1];
		if (local14 != null && local14.aClass32_1 != null && local14.aClass32_1.aClass1_Sub1_Sub2_7 instanceof Class1_Sub1_Sub2_Sub6) {
			local29 = (Class1_Sub1_Sub2_Sub6) local14.aClass32_1.aClass1_Sub1_Sub2_7;
			if (local29.aClass20Array2 != null) {
				this.method1742(arg0, local29, 128, 0, -128, true);
			}
		}
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(Lclient!id;IIIIIII)V")
	private void method1735(@OriginalArg(0) Class27 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(6) int local6;
		@Pc(7) int local7 = local6 = (arg6 << 7) - Static103.anInt2627;
		@Pc(14) int local14;
		@Pc(15) int local15 = local14 = (arg7 << 7) - Static103.anInt2633;
		@Pc(20) int local20;
		@Pc(21) int local21 = local20 = local7 + 128;
		@Pc(26) int local26;
		@Pc(27) int local27 = local26 = local15 + 128;
		@Pc(38) int local38 = this.anIntArrayArrayArray6[arg1][arg6][arg7] - Static103.anInt2639;
		@Pc(51) int local51 = this.anIntArrayArrayArray6[arg1][arg6 + 1][arg7] - Static103.anInt2639;
		@Pc(66) int local66 = this.anIntArrayArrayArray6[arg1][arg6 + 1][arg7 + 1] - Static103.anInt2639;
		@Pc(79) int local79 = this.anIntArrayArrayArray6[arg1][arg6][arg7 + 1] - Static103.anInt2639;
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
		@Pc(279) int local279 = Static93.anInt2474 + (local101 << 9) / local121;
		@Pc(287) int local287 = Static93.anInt2470 + (local123 << 9) / local121;
		@Pc(295) int local295 = Static93.anInt2474 + (local21 << 9) / local169;
		@Pc(303) int local303 = Static93.anInt2470 + (local51 << 9) / local169;
		@Pc(311) int local311 = Static93.anInt2474 + (local197 << 9) / local27;
		@Pc(319) int local319 = Static93.anInt2470 + (local66 << 9) / local27;
		@Pc(327) int local327 = Static93.anInt2474 + (local245 << 9) / local265;
		@Pc(335) int local335 = Static93.anInt2470 + (local89 << 9) / local265;
		Static93.anInt2477 = 0;
		@Pc(472) int local472;
		if ((local311 - local327) * (local303 - local335) - (local319 - local335) * (local295 - local327) > 0) {
			Static93.aBoolean118 = false;
			if (local311 < 0 || local327 < 0 || local295 < 0 || local311 > Static93.anInt2472 || local327 > Static93.anInt2472 || local295 > Static93.anInt2472) {
				Static93.aBoolean118 = true;
			}
			if (Static103.aBoolean125 && this.method1739(Static103.anInt2640, Static103.anInt2631, local319, local335, local303, local311, local327, local295)) {
				Static103.anInt2644 = arg6;
				Static103.anInt2632 = arg7;
			}
			if (arg0.anInt1461 == -1) {
				if (arg0.anInt1459 != 12345678) {
					Static93.method1602(local319, local335, local303, local311, local327, local295, arg0.anInt1459, arg0.anInt1465, arg0.anInt1464);
				}
			} else if (Static103.aBoolean124) {
				local472 = Static93.anInterface2_1.method1331(arg0.anInt1461);
				Static93.method1602(local319, local335, local303, local311, local327, local295, Static103.method1741(local472, arg0.anInt1459), Static103.method1741(local472, arg0.anInt1465), Static103.method1741(local472, arg0.anInt1464));
			} else if (arg0.aBoolean72) {
				Static93.method1599(local319, local335, local303, local311, local327, local295, arg0.anInt1459, arg0.anInt1465, arg0.anInt1464, local101, local21, local245, local123, local51, local89, local121, local169, local265, arg0.anInt1461);
			} else {
				Static93.method1599(local319, local335, local303, local311, local327, local295, arg0.anInt1459, arg0.anInt1465, arg0.anInt1464, local197, local245, local21, local66, local89, local51, local27, local265, local169, arg0.anInt1461);
			}
		}
		if ((local279 - local295) * (local335 - local303) - (local287 - local303) * (local327 - local295) <= 0) {
			return;
		}
		Static93.aBoolean118 = false;
		if (local279 < 0 || local295 < 0 || local327 < 0 || local279 > Static93.anInt2472 || local295 > Static93.anInt2472 || local327 > Static93.anInt2472) {
			Static93.aBoolean118 = true;
		}
		if (Static103.aBoolean125 && this.method1739(Static103.anInt2640, Static103.anInt2631, local287, local303, local335, local279, local295, local327)) {
			Static103.anInt2644 = arg6;
			Static103.anInt2632 = arg7;
		}
		if (arg0.anInt1461 != -1) {
			if (!Static103.aBoolean124) {
				Static93.method1599(local287, local303, local335, local279, local295, local327, arg0.anInt1466, arg0.anInt1464, arg0.anInt1465, local101, local21, local245, local123, local51, local89, local121, local169, local265, arg0.anInt1461);
				return;
			}
			local472 = Static93.anInterface2_1.method1331(arg0.anInt1461);
			Static93.method1602(local287, local303, local335, local279, local295, local327, Static103.method1741(local472, arg0.anInt1466), Static103.method1741(local472, arg0.anInt1464), Static103.method1741(local472, arg0.anInt1465));
		} else if (arg0.anInt1466 != 12345678) {
			Static93.method1602(local287, local303, local335, local279, local295, local327, arg0.anInt1466, arg0.anInt1464, arg0.anInt1465);
			return;
		}
	}

	@OriginalMember(owner = "client!ud", name = "e", descriptor = "(IIII)V")
	public void method1736(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(8) Class1_Sub8 local8 = this.aClass1_Sub8ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 == null) {
			return;
		}
		@Pc(14) Class25 local14 = local8.aClass25_1;
		if (local14 != null) {
			@Pc(23) int local23 = arg1 * 128 + 64;
			@Pc(29) int local29 = arg2 * 128 + 64;
			local14.anInt1288 = local23 + (local14.anInt1288 - local23) * arg3 / 16;
			local14.anInt1295 = local29 + (local14.anInt1295 - local29) * arg3 / 16;
		}
	}

	@OriginalMember(owner = "client!ud", name = "g", descriptor = "(III)V")
	public void method1737() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt2638; local1++) {
			for (@Pc(4) int local4 = 0; local4 < this.anInt2648; local4++) {
				for (@Pc(7) int local7 = 0; local7 < this.anInt2650; local7++) {
					@Pc(17) Class1_Sub8 local17 = this.aClass1_Sub8ArrayArrayArray1[local1][local4][local7];
					if (local17 != null) {
						@Pc(22) Class2 local22 = local17.aClass2_1;
						if (local22 != null && local22.aClass1_Sub1_Sub2_1 instanceof Class1_Sub1_Sub2_Sub6) {
							@Pc(32) Class1_Sub1_Sub2_Sub6 local32 = (Class1_Sub1_Sub2_Sub6) local22.aClass1_Sub1_Sub2_1;
							if (local32.aClass20Array2 != null) {
								this.method1732(local32, local1, local4, local7, 1, 1);
								if (local22.aClass1_Sub1_Sub2_2 instanceof Class1_Sub1_Sub2_Sub6) {
									@Pc(51) Class1_Sub1_Sub2_Sub6 local51 = (Class1_Sub1_Sub2_Sub6) local22.aClass1_Sub1_Sub2_2;
									if (local51.aClass20Array2 != null) {
										this.method1732(local51, local1, local4, local7, 1, 1);
										this.method1742(local32, local51, 0, 0, 0, false);
										local51.method1432();
									}
								}
								local32.method1432();
							}
						}
						@Pc(98) Class1_Sub1_Sub2_Sub6 local98;
						for (@Pc(82) int local82 = 0; local82 < local17.anInt1528; local82++) {
							@Pc(88) Class63 local88 = local17.aClass63Array1[local82];
							if (local88 != null && local88.aClass1_Sub1_Sub2_8 instanceof Class1_Sub1_Sub2_Sub6) {
								local98 = (Class1_Sub1_Sub2_Sub6) local88.aClass1_Sub1_Sub2_8;
								if (local98.aClass20Array2 != null) {
									this.method1732(local98, local1, local4, local7, local88.anInt2592 + 1 - local88.anInt2577, local88.anInt2588 - local88.anInt2576 + 1);
									local98.method1432();
								}
							}
						}
						@Pc(134) Class32 local134 = local17.aClass32_1;
						if (local134 != null && local134.aClass1_Sub1_Sub2_7 instanceof Class1_Sub1_Sub2_Sub6) {
							local98 = (Class1_Sub1_Sub2_Sub6) local134.aClass1_Sub1_Sub2_7;
							if (local98.aClass20Array2 != null) {
								this.method1734(local98, local1, local4, local7);
								local98.method1432();
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ud", name = "h", descriptor = "(III)V")
	public void method1738(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class1_Sub8 local8 = this.aClass1_Sub8ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 != null) {
			local8.aClass32_1 = null;
		}
	}

	@OriginalMember(owner = "client!ud", name = "b", descriptor = "(IIIIIIII)Z")
	private boolean method1739(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
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

	@OriginalMember(owner = "client!ud", name = "i", descriptor = "(III)Lclient!ua;")
	public Class63 method1740(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class1_Sub8 local8 = this.aClass1_Sub8ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 == null) {
			return null;
		}
		for (@Pc(14) int local14 = 0; local14 < local8.anInt1528; local14++) {
			@Pc(20) Class63 local20 = local8.aClass63Array1[local14];
			if ((local20.anInt2582 >> 29 & 0x3) == 2 && local20.anInt2577 == arg1 && local20.anInt2576 == arg2) {
				return local20;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(Lclient!qb;Lclient!qb;IIIZ)V")
	private void method1742(@OriginalArg(0) Class1_Sub1_Sub2_Sub6 arg0, @OriginalArg(1) Class1_Sub1_Sub2_Sub6 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		arg1.method1452();
		this.anInt2659++;
		@Pc(9) int local9 = 0;
		@Pc(12) int[] local12 = arg1.anIntArray290;
		@Pc(15) int local15 = arg1.anInt2299;
		for (@Pc(17) int local17 = 0; local17 < arg0.anInt2299; local17++) {
			@Pc(23) Class20 local23 = arg0.aClass20Array2[local17];
			@Pc(28) Class20 local28 = arg0.aClass20Array1[local17];
			if (local28.anInt876 != 0) {
				@Pc(38) int local38 = arg0.anIntArray279[local17] - arg3;
				if (local38 <= arg1.anInt2300) {
					@Pc(49) int local49 = arg0.anIntArray290[local17] - arg2;
					if (local49 >= arg1.anInt2301 && local49 <= arg1.anInt2303) {
						@Pc(65) int local65 = arg0.anIntArray282[local17] - arg4;
						if (local65 >= arg1.anInt2296 && local65 <= arg1.anInt2302) {
							for (@Pc(76) int local76 = 0; local76 < local15; local76++) {
								@Pc(82) Class20 local82 = arg1.aClass20Array2[local76];
								@Pc(87) Class20 local87 = arg1.aClass20Array1[local76];
								if (local49 == local12[local76] && local65 == arg1.anIntArray282[local76] && local38 == arg1.anIntArray279[local76] && local87.anInt876 != 0) {
									local23.anInt879 += local87.anInt879;
									local23.anInt877 += local87.anInt877;
									local23.anInt875 += local87.anInt875;
									local23.anInt876 += local87.anInt876;
									local82.anInt879 += local28.anInt879;
									local82.anInt877 += local28.anInt877;
									local82.anInt875 += local28.anInt875;
									local82.anInt876 += local28.anInt876;
									local9++;
									this.anIntArray361[local17] = this.anInt2659;
									this.anIntArray365[local76] = this.anInt2659;
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
		for (@Pc(193) int local193 = 0; local193 < arg0.anInt2295; local193++) {
			if (this.anIntArray361[arg0.anIntArray281[local193]] == this.anInt2659 && this.anIntArray361[arg0.anIntArray280[local193]] == this.anInt2659 && this.anIntArray361[arg0.anIntArray277[local193]] == this.anInt2659) {
				arg0.anIntArray285[local193] = -1;
			}
		}
		for (@Pc(236) int local236 = 0; local236 < arg1.anInt2295; local236++) {
			if (this.anIntArray365[arg1.anIntArray281[local236]] == this.anInt2659 && this.anIntArray365[arg1.anIntArray280[local236]] == this.anInt2659 && this.anIntArray365[arg1.anIntArray277[local236]] == this.anInt2659) {
				arg1.anIntArray285[local236] = -1;
			}
		}
	}

	@OriginalMember(owner = "client!ud", name = "j", descriptor = "(III)I")
	public int method1743(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class1_Sub8 local8 = this.aClass1_Sub8ArrayArrayArray1[arg0][arg1][arg2];
		return local8 == null || local8.aClass2_1 == null ? 0 : local8.aClass2_1.anInt136;
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(IIIILclient!aa;Lclient!aa;IIII)V")
	public void method1744(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class1_Sub1_Sub2 arg4, @OriginalArg(5) Class1_Sub1_Sub2 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		if (arg4 == null && arg5 == null) {
			return;
		}
		@Pc(8) Class2 local8 = new Class2();
		local8.anInt136 = arg8;
		local8.anInt125 = arg9;
		local8.anInt137 = arg1 * 128 + 64;
		local8.anInt135 = arg2 * 128 + 64;
		local8.anInt130 = arg3;
		local8.aClass1_Sub1_Sub2_1 = arg4;
		local8.aClass1_Sub1_Sub2_2 = arg5;
		local8.anInt127 = arg6;
		local8.anInt129 = arg7;
		for (@Pc(45) int local45 = arg0; local45 >= 0; local45--) {
			if (this.aClass1_Sub8ArrayArrayArray1[local45][arg1][arg2] == null) {
				this.aClass1_Sub8ArrayArrayArray1[local45][arg1][arg2] = new Class1_Sub8(local45, arg1, arg2);
			}
		}
		this.aClass1_Sub8ArrayArrayArray1[arg0][arg1][arg2].aClass2_1 = local8;
	}

	@OriginalMember(owner = "client!ud", name = "k", descriptor = "(III)V")
	public void method1745(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class1_Sub8 local8 = this.aClass1_Sub8ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 != null) {
			local8.aClass25_1 = null;
		}
	}

	@OriginalMember(owner = "client!ud", name = "c", descriptor = "(II)V")
	public void method1746(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class1_Sub8 local8 = this.aClass1_Sub8ArrayArrayArray1[0][arg0][arg1];
		for (@Pc(10) int local10 = 0; local10 < 3; local10++) {
			@Pc(31) Class1_Sub8 local31 = this.aClass1_Sub8ArrayArrayArray1[local10][arg0][arg1] = this.aClass1_Sub8ArrayArrayArray1[local10 + 1][arg0][arg1];
			if (local31 != null) {
				local31.anInt1530--;
				for (@Pc(41) int local41 = 0; local41 < local31.anInt1528; local41++) {
					@Pc(47) Class63 local47 = local31.aClass63Array1[local41];
					if ((local47.anInt2582 >> 29 & 0x3) == 2 && local47.anInt2577 == arg0 && local47.anInt2576 == arg1) {
						local47.anInt2583--;
					}
				}
			}
		}
		if (this.aClass1_Sub8ArrayArrayArray1[0][arg0][arg1] == null) {
			this.aClass1_Sub8ArrayArrayArray1[0][arg0][arg1] = new Class1_Sub8(0, arg0, arg1);
		}
		this.aClass1_Sub8ArrayArrayArray1[0][arg0][arg1].aClass1_Sub8_1 = local8;
		this.aClass1_Sub8ArrayArrayArray1[3][arg0][arg1] = null;
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(IIIILclient!aa;IIIIII)V")
	public void method1747(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class1_Sub1_Sub2 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		if (arg4 == null) {
			return;
		}
		@Pc(6) Class25 local6 = new Class25();
		local6.anInt1290 = arg9;
		local6.anInt1303 = arg10;
		local6.anInt1288 = arg1 * 128 + arg7 + 64;
		local6.anInt1295 = arg2 * 128 + arg8 + 64;
		local6.anInt1305 = arg3;
		local6.aClass1_Sub1_Sub2_6 = arg4;
		local6.anInt1292 = arg5;
		local6.anInt1294 = arg6;
		for (@Pc(44) int local44 = arg0; local44 >= 0; local44--) {
			if (this.aClass1_Sub8ArrayArrayArray1[local44][arg1][arg2] == null) {
				this.aClass1_Sub8ArrayArrayArray1[local44][arg1][arg2] = new Class1_Sub8(local44, arg1, arg2);
			}
		}
		this.aClass1_Sub8ArrayArrayArray1[arg0][arg1][arg2].aClass25_1 = local6;
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(IIIILclient!aa;ILclient!aa;Lclient!aa;)V")
	public void method1748(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class1_Sub1_Sub2 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class1_Sub1_Sub2 arg6, @OriginalArg(7) Class1_Sub1_Sub2 arg7) {
		@Pc(3) Class8 local3 = new Class8();
		local3.aClass1_Sub1_Sub2_3 = arg4;
		local3.anInt218 = arg1 * 128 + 64;
		local3.anInt216 = arg2 * 128 + 64;
		local3.anInt214 = arg3;
		local3.anInt210 = arg5;
		local3.aClass1_Sub1_Sub2_4 = arg6;
		local3.aClass1_Sub1_Sub2_5 = arg7;
		@Pc(34) int local34 = 0;
		@Pc(43) Class1_Sub8 local43 = this.aClass1_Sub8ArrayArrayArray1[arg0][arg1][arg2];
		if (local43 != null) {
			for (@Pc(47) int local47 = 0; local47 < local43.anInt1528; local47++) {
				if ((local43.aClass63Array1[local47].anInt2581 & 0x100) == 256 && local43.aClass63Array1[local47].aClass1_Sub1_Sub2_8 instanceof Class1_Sub1_Sub2_Sub6) {
					@Pc(71) Class1_Sub1_Sub2_Sub6 local71 = (Class1_Sub1_Sub2_Sub6) local43.aClass63Array1[local47].aClass1_Sub1_Sub2_8;
					local71.method1443();
					if (local71.anInt2285 > local34) {
						local34 = local71.anInt2285;
					}
				}
			}
		}
		local3.anInt209 = local34;
		if (this.aClass1_Sub8ArrayArrayArray1[arg0][arg1][arg2] == null) {
			this.aClass1_Sub8ArrayArrayArray1[arg0][arg1][arg2] = new Class1_Sub8(arg0, arg1, arg2);
		}
		this.aClass1_Sub8ArrayArrayArray1[arg0][arg1][arg2].aClass8_1 = local3;
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "([IIIIII)V")
	public void method1749(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(8) Class1_Sub8 local8 = this.aClass1_Sub8ArrayArrayArray1[arg2][arg3][arg4];
		if (local8 == null) {
			return;
		}
		@Pc(14) Class27 local14 = local8.aClass27_1;
		@Pc(24) int local24;
		if (local14 != null) {
			@Pc(19) int local19 = local14.anInt1469;
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
		@Pc(59) Class49 local59 = local8.aClass49_1;
		if (local59 == null) {
			return;
		}
		local24 = local59.anInt2114;
		@Pc(68) int local68 = local59.anInt2115;
		@Pc(71) int local71 = local59.anInt2112;
		@Pc(74) int local74 = local59.anInt2113;
		@Pc(79) int[] local79 = this.anIntArrayArray62[local24];
		@Pc(84) int[] local84 = this.anIntArrayArray61[local68];
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

	@OriginalMember(owner = "client!ud", name = "l", descriptor = "(III)I")
	public int method1750(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class1_Sub8 local8 = this.aClass1_Sub8ArrayArrayArray1[arg0][arg1][arg2];
		return local8 == null || local8.aClass25_1 == null ? 0 : local8.aClass25_1.anInt1290;
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(IIIIIIIILclient!aa;IZII)Z")
	private boolean method1751(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) Class1_Sub1_Sub2 arg8, @OriginalArg(9) int arg9, @OriginalArg(10) boolean arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12) {
		for (@Pc(1) int local1 = arg1; local1 < arg1 + arg3; local1++) {
			for (@Pc(4) int local4 = arg2; local4 < arg2 + arg4; local4++) {
				if (local1 < 0 || local4 < 0 || local1 >= this.anInt2648 || local4 >= this.anInt2650) {
					return false;
				}
				@Pc(28) Class1_Sub8 local28 = this.aClass1_Sub8ArrayArrayArray1[arg0][local1][local4];
				if (local28 != null && local28.anInt1528 >= 5) {
					return false;
				}
			}
		}
		@Pc(52) Class63 local52 = new Class63();
		local52.anInt2582 = arg11;
		local52.anInt2581 = arg12;
		local52.anInt2583 = arg0;
		local52.anInt2585 = arg5;
		local52.anInt2575 = arg6;
		local52.anInt2586 = arg7;
		local52.aClass1_Sub1_Sub2_8 = arg8;
		local52.anInt2584 = arg9;
		local52.anInt2577 = arg1;
		local52.anInt2576 = arg2;
		local52.anInt2592 = arg1 + arg3 - 1;
		local52.anInt2588 = arg2 + arg4 - 1;
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
					if (this.aClass1_Sub8ArrayArrayArray1[local130][local98][local101] == null) {
						this.aClass1_Sub8ArrayArrayArray1[local130][local98][local101] = new Class1_Sub8(local130, local98, local101);
					}
				}
				@Pc(166) Class1_Sub8 local166 = this.aClass1_Sub8ArrayArrayArray1[arg0][local98][local101];
				local166.aClass63Array1[local166.anInt1528] = local52;
				local166.anIntArray179[local166.anInt1528] = local104;
				local166.anInt1533 |= local104;
				local166.anInt1528++;
			}
		}
		if (arg10) {
			this.aClass63Array2[this.anInt2630++] = local52;
		}
		return true;
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(IIIIII)Z")
	private boolean method1752(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(17) int local17;
		@Pc(21) int local21;
		if (arg1 != arg2 || arg3 != arg4) {
			for (local17 = arg1; local17 <= arg2; local17++) {
				for (local21 = arg3; local21 <= arg4; local21++) {
					if (this.anIntArrayArrayArray7[arg0][local17][local21] == -Static103.anInt2634) {
						return false;
					}
				}
			}
			local21 = (arg1 << 7) + 1;
			@Pc(156) int local156 = (arg3 << 7) + 2;
			@Pc(167) int local167 = this.anIntArrayArrayArray6[arg0][arg1][arg3] - arg5;
			if (!this.method1712(local21, local167, local156)) {
				return false;
			}
			@Pc(181) int local181 = (arg2 << 7) - 1;
			if (!this.method1712(local181, local167, local156)) {
				return false;
			}
			@Pc(195) int local195 = (arg4 << 7) - 1;
			if (!this.method1712(local21, local167, local195)) {
				return false;
			} else if (this.method1712(local181, local167, local195)) {
				return true;
			} else {
				return false;
			}
		} else if (this.method1719(arg0, arg1, arg3)) {
			local17 = arg1 << 7;
			local21 = arg3 << 7;
			return this.method1712(local17 + 1, this.anIntArrayArrayArray6[arg0][arg1][arg3] - arg5, local21 + 1) && this.method1712(local17 + 128 - 1, this.anIntArrayArrayArray6[arg0][arg1 + 1][arg3] - arg5, local21 + 1) && this.method1712(local17 + 128 - 1, this.anIntArrayArrayArray6[arg0][arg1 + 1][arg3 + 1] - arg5, local21 + 128 - 1) && this.method1712(local17 + 1, this.anIntArrayArrayArray6[arg0][arg1][arg3 + 1] - arg5, local21 + 128 - 1);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ud", name = "b", descriptor = "(IIIIII)V")
	public void method1754(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (arg0 < 0) {
			arg0 = 0;
		} else if (arg0 >= this.anInt2648 * 128) {
			arg0 = this.anInt2648 * 128 - 1;
		}
		if (arg2 < 0) {
			arg2 = 0;
		} else if (arg2 >= this.anInt2650 * 128) {
			arg2 = this.anInt2650 * 128 - 1;
		}
		Static103.anInt2634++;
		Static103.anInt2647 = Static81.anIntArray300[arg3];
		Static103.anInt2643 = Static81.anIntArray292[arg3];
		Static103.anInt2641 = Static81.anIntArray300[arg4];
		Static103.anInt2649 = Static81.anIntArray292[arg4];
		Static103.aBooleanArrayArray1 = Static103.aBooleanArrayArrayArrayArray1[(arg3 - 128) / 32][arg4 / 64];
		Static103.anInt2627 = arg0;
		Static103.anInt2639 = arg1;
		Static103.anInt2633 = arg2;
		Static103.anInt2645 = arg0 / 128;
		Static103.anInt2651 = arg2 / 128;
		Static103.anInt2642 = arg5;
		Static103.anInt2635 = Static103.anInt2645 - 25;
		if (Static103.anInt2635 < 0) {
			Static103.anInt2635 = 0;
		}
		Static103.anInt2636 = Static103.anInt2651 - 25;
		if (Static103.anInt2636 < 0) {
			Static103.anInt2636 = 0;
		}
		Static103.anInt2637 = Static103.anInt2645 + 25;
		if (Static103.anInt2637 > this.anInt2648) {
			Static103.anInt2637 = this.anInt2648;
		}
		Static103.anInt2646 = Static103.anInt2651 + 25;
		if (Static103.anInt2646 > this.anInt2650) {
			Static103.anInt2646 = this.anInt2650;
		}
		this.method1756();
		Static103.anInt2629 = 0;
		@Pc(136) int local136;
		@Pc(139) int local139;
		for (@Pc(128) int local128 = this.anInt2653; local128 < this.anInt2638; local128++) {
			@Pc(134) Class1_Sub8[][] local134 = this.aClass1_Sub8ArrayArrayArray1[local128];
			for (local136 = Static103.anInt2635; local136 < Static103.anInt2637; local136++) {
				for (local139 = Static103.anInt2636; local139 < Static103.anInt2646; local139++) {
					@Pc(146) Class1_Sub8 local146 = local134[local136][local139];
					if (local146 != null) {
						if (local146.anInt1534 <= arg5 && (Static103.aBooleanArrayArray1[local136 + 25 - Static103.anInt2645][local139 + 25 - Static103.anInt2651] || this.anIntArrayArrayArray6[local128][local136][local139] - arg1 >= 2000)) {
							local146.aBoolean78 = true;
							local146.aBoolean76 = true;
							if (local146.anInt1528 > 0) {
								local146.aBoolean77 = true;
							} else {
								local146.aBoolean77 = false;
							}
							Static103.anInt2629++;
						} else {
							local146.aBoolean78 = false;
							local146.aBoolean76 = false;
							local146.anInt1525 = 0;
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
		for (@Pc(224) int local224 = this.anInt2653; local224 < this.anInt2638; local224++) {
			@Pc(230) Class1_Sub8[][] local230 = this.aClass1_Sub8ArrayArrayArray1[local224];
			for (local139 = -25; local139 <= 0; local139++) {
				local237 = Static103.anInt2645 + local139;
				local241 = Static103.anInt2645 - local139;
				if (local237 >= Static103.anInt2635 || local241 < Static103.anInt2637) {
					for (local249 = -25; local249 <= 0; local249++) {
						local254 = Static103.anInt2651 + local249;
						local258 = Static103.anInt2651 - local249;
						@Pc(270) Class1_Sub8 local270;
						if (local237 >= Static103.anInt2635) {
							if (local254 >= Static103.anInt2636) {
								local270 = local230[local237][local254];
								if (local270 != null && local270.aBoolean78) {
									this.method1755(local270, true);
								}
							}
							if (local258 < Static103.anInt2646) {
								local270 = local230[local237][local258];
								if (local270 != null && local270.aBoolean78) {
									this.method1755(local270, true);
								}
							}
						}
						if (local241 < Static103.anInt2637) {
							if (local254 >= Static103.anInt2636) {
								local270 = local230[local241][local254];
								if (local270 != null && local270.aBoolean78) {
									this.method1755(local270, true);
								}
							}
							if (local258 < Static103.anInt2646) {
								local270 = local230[local241][local258];
								if (local270 != null && local270.aBoolean78) {
									this.method1755(local270, true);
								}
							}
						}
						if (Static103.anInt2629 == 0) {
							Static103.aBoolean125 = false;
							return;
						}
					}
				}
			}
		}
		for (local136 = this.anInt2653; local136 < this.anInt2638; local136++) {
			@Pc(361) Class1_Sub8[][] local361 = this.aClass1_Sub8ArrayArrayArray1[local136];
			for (local237 = -25; local237 <= 0; local237++) {
				local241 = Static103.anInt2645 + local237;
				local249 = Static103.anInt2645 - local237;
				if (local241 >= Static103.anInt2635 || local249 < Static103.anInt2637) {
					for (local254 = -25; local254 <= 0; local254++) {
						local258 = Static103.anInt2651 + local254;
						@Pc(389) int local389 = Static103.anInt2651 - local254;
						@Pc(401) Class1_Sub8 local401;
						if (local241 >= Static103.anInt2635) {
							if (local258 >= Static103.anInt2636) {
								local401 = local361[local241][local258];
								if (local401 != null && local401.aBoolean78) {
									this.method1755(local401, false);
								}
							}
							if (local389 < Static103.anInt2646) {
								local401 = local361[local241][local389];
								if (local401 != null && local401.aBoolean78) {
									this.method1755(local401, false);
								}
							}
						}
						if (local249 < Static103.anInt2637) {
							if (local258 >= Static103.anInt2636) {
								local401 = local361[local249][local258];
								if (local401 != null && local401.aBoolean78) {
									this.method1755(local401, false);
								}
							}
							if (local389 < Static103.anInt2646) {
								local401 = local361[local249][local389];
								if (local401 != null && local401.aBoolean78) {
									this.method1755(local401, false);
								}
							}
						}
						if (Static103.anInt2629 == 0) {
							Static103.aBoolean125 = false;
							return;
						}
					}
				}
			}
		}
		Static103.aBoolean125 = false;
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(Lclient!ja;Z)V")
	private void method1755(@OriginalArg(0) Class1_Sub8 arg0, @OriginalArg(1) boolean arg1) {
		Static103.aClass45_8.method1295(arg0);
		while (true) {
			@Pc(8) Class1_Sub8 local8;
			@Pc(17) int local17;
			@Pc(20) int local20;
			@Pc(23) int local23;
			@Pc(26) int local26;
			@Pc(31) Class1_Sub8[][] local31;
			@Pc(49) Class1_Sub8 local49;
			@Pc(251) int local251;
			@Pc(578) int local578;
			@Pc(583) int local583;
			@Pc(588) int local588;
			@Pc(591) int local591;
			@Pc(600) int local600;
			@Pc(942) Class2 local942;
			@Pc(1116) int local1116;
			@Pc(1001) int local1001;
			do {
				do {
					do {
						do {
							do {
								do {
									while (true) {
										@Pc(257) Class63 var12;
										@Pc(612) int var19;
										@Pc(335) int var23;
										@Pc(289) boolean var24;
										@Pc(823) Class1_Sub8 var35;
										while (true) {
											do {
												local8 = (Class1_Sub8) Static103.aClass45_8.method1300();
												if (local8 == null) {
													return;
												}
											} while (!local8.aBoolean76);
											local17 = local8.anInt1527;
											local20 = local8.anInt1529;
											local23 = local8.anInt1530;
											local26 = local8.anInt1536;
											local31 = this.aClass1_Sub8ArrayArrayArray1[local23];
											if (!local8.aBoolean78) {
												break;
											}
											if (arg1) {
												if (local23 > 0) {
													local49 = this.aClass1_Sub8ArrayArrayArray1[local23 - 1][local17][local20];
													if (local49 != null && local49.aBoolean76) {
														continue;
													}
												}
												if (local17 <= Static103.anInt2645 && local17 > Static103.anInt2635) {
													local49 = local31[local17 - 1][local20];
													if (local49 != null && local49.aBoolean76 && (local49.aBoolean78 || (local8.anInt1533 & 0x1) == 0)) {
														continue;
													}
												}
												if (local17 >= Static103.anInt2645 && local17 < Static103.anInt2637 - 1) {
													local49 = local31[local17 + 1][local20];
													if (local49 != null && local49.aBoolean76 && (local49.aBoolean78 || (local8.anInt1533 & 0x4) == 0)) {
														continue;
													}
												}
												if (local20 <= Static103.anInt2651 && local20 > Static103.anInt2636) {
													local49 = local31[local17][local20 - 1];
													if (local49 != null && local49.aBoolean76 && (local49.aBoolean78 || (local8.anInt1533 & 0x8) == 0)) {
														continue;
													}
												}
												if (local20 >= Static103.anInt2651 && local20 < Static103.anInt2646 - 1) {
													local49 = local31[local17][local20 + 1];
													if (local49 != null && local49.aBoolean76 && (local49.aBoolean78 || (local8.anInt1533 & 0x2) == 0)) {
														continue;
													}
												}
											} else {
												arg1 = true;
											}
											local8.aBoolean78 = false;
											if (local8.aClass1_Sub8_1 != null) {
												local49 = local8.aClass1_Sub8_1;
												if (local49.aClass27_1 == null) {
													if (local49.aClass49_1 != null && !this.method1719(0, local17, local20)) {
														this.method1760(local49.aClass49_1, Static103.anInt2647, Static103.anInt2643, Static103.anInt2641, Static103.anInt2649, local17, local20);
													}
												} else if (!this.method1719(0, local17, local20)) {
													this.method1735(local49.aClass27_1, 0, Static103.anInt2647, Static103.anInt2643, Static103.anInt2641, Static103.anInt2649, local17, local20);
												}
												@Pc(225) Class2 local225 = local49.aClass2_1;
												if (local225 != null) {
													local225.aClass1_Sub1_Sub2_1.method1418(0, Static103.anInt2647, Static103.anInt2643, Static103.anInt2641, Static103.anInt2649, local225.anInt137 - Static103.anInt2627, local225.anInt130 - Static103.anInt2639, local225.anInt135 - Static103.anInt2633, local225.anInt136);
												}
												for (local251 = 0; local251 < local49.anInt1528; local251++) {
													var12 = local49.aClass63Array1[local251];
													if (var12 != null) {
														var12.aClass1_Sub1_Sub2_8.method1418(var12.anInt2584, Static103.anInt2647, Static103.anInt2643, Static103.anInt2641, Static103.anInt2649, var12.anInt2585 - Static103.anInt2627, var12.anInt2586 - Static103.anInt2639, var12.anInt2575 - Static103.anInt2633, var12.anInt2582);
													}
												}
											}
											var24 = false;
											if (local8.aClass27_1 == null) {
												if (local8.aClass49_1 != null && !this.method1719(local26, local17, local20)) {
													var24 = true;
													this.method1760(local8.aClass49_1, Static103.anInt2647, Static103.anInt2643, Static103.anInt2641, Static103.anInt2649, local17, local20);
												}
											} else if (!this.method1719(local26, local17, local20)) {
												var24 = true;
												this.method1735(local8.aClass27_1, local26, Static103.anInt2647, Static103.anInt2643, Static103.anInt2641, Static103.anInt2649, local17, local20);
											}
											var23 = 0;
											local251 = 0;
											@Pc(340) Class2 local340 = local8.aClass2_1;
											@Pc(343) Class25 local343 = local8.aClass25_1;
											if (local340 != null || local343 != null) {
												if (Static103.anInt2645 == local17) {
													var23++;
												} else if (Static103.anInt2645 < local17) {
													var23 += 2;
												}
												if (Static103.anInt2651 == local20) {
													var23 += 3;
												} else if (Static103.anInt2651 > local20) {
													var23 += 6;
												}
												local251 = Static103.anIntArray367[var23];
												local8.anInt1526 = Static103.anIntArray368[var23];
											}
											if (local340 != null) {
												if ((local340.anInt127 & Static103.anIntArray362[var23]) == 0) {
													local8.anInt1525 = 0;
												} else if (local340.anInt127 == 16) {
													local8.anInt1525 = 3;
													local8.anInt1532 = Static103.anIntArray369[var23];
													local8.anInt1537 = 3 - local8.anInt1532;
												} else if (local340.anInt127 == 32) {
													local8.anInt1525 = 6;
													local8.anInt1532 = Static103.anIntArray363[var23];
													local8.anInt1537 = 6 - local8.anInt1532;
												} else if (local340.anInt127 == 64) {
													local8.anInt1525 = 12;
													local8.anInt1532 = Static103.anIntArray366[var23];
													local8.anInt1537 = 12 - local8.anInt1532;
												} else {
													local8.anInt1525 = 9;
													local8.anInt1532 = Static103.anIntArray364[var23];
													local8.anInt1537 = 9 - local8.anInt1532;
												}
												if ((local340.anInt127 & local251) != 0 && !this.method1717(local26, local17, local20, local340.anInt127)) {
													local340.aClass1_Sub1_Sub2_1.method1418(0, Static103.anInt2647, Static103.anInt2643, Static103.anInt2641, Static103.anInt2649, local340.anInt137 - Static103.anInt2627, local340.anInt130 - Static103.anInt2639, local340.anInt135 - Static103.anInt2633, local340.anInt136);
												}
												if ((local340.anInt129 & local251) != 0 && !this.method1717(local26, local17, local20, local340.anInt129)) {
													local340.aClass1_Sub1_Sub2_2.method1418(0, Static103.anInt2647, Static103.anInt2643, Static103.anInt2641, Static103.anInt2649, local340.anInt137 - Static103.anInt2627, local340.anInt130 - Static103.anInt2639, local340.anInt135 - Static103.anInt2633, local340.anInt136);
												}
											}
											if (local343 != null && !this.method1725(local26, local17, local20, local343.aClass1_Sub1_Sub2_6.anInt2285)) {
												if ((local343.anInt1292 & local251) != 0) {
													local343.aClass1_Sub1_Sub2_6.method1418(local343.anInt1294, Static103.anInt2647, Static103.anInt2643, Static103.anInt2641, Static103.anInt2649, local343.anInt1288 - Static103.anInt2627, local343.anInt1305 - Static103.anInt2639, local343.anInt1295 - Static103.anInt2633, local343.anInt1290);
												} else if ((local343.anInt1292 & 0x300) != 0) {
													local578 = local343.anInt1288 - Static103.anInt2627;
													local583 = local343.anInt1305 - Static103.anInt2639;
													local588 = local343.anInt1295 - Static103.anInt2633;
													local591 = local343.anInt1294;
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
													if ((local343.anInt1292 & 0x100) != 0 && var19 < local600) {
														local629 = local578 + Static103.anIntArray358[local591];
														local635 = local588 + Static103.anIntArray360[local591];
														local343.aClass1_Sub1_Sub2_6.method1418(local591 * 512 + 256, Static103.anInt2647, Static103.anInt2643, Static103.anInt2641, Static103.anInt2649, local629, local583, local635, local343.anInt1290);
													}
													if ((local343.anInt1292 & 0x200) != 0 && var19 > local600) {
														local629 = local578 + Static103.anIntArray357[local591];
														local635 = local588 + Static103.anIntArray359[local591];
														local343.aClass1_Sub1_Sub2_6.method1418(local591 * 512 + 1280 & 0x7FF, Static103.anInt2647, Static103.anInt2643, Static103.anInt2641, Static103.anInt2649, local629, local583, local635, local343.anInt1290);
													}
												}
											}
											if (var24) {
												@Pc(696) Class32 local696 = local8.aClass32_1;
												if (local696 != null) {
													local696.aClass1_Sub1_Sub2_7.method1418(0, Static103.anInt2647, Static103.anInt2643, Static103.anInt2641, Static103.anInt2649, local696.anInt1632 - Static103.anInt2627, local696.anInt1633 - Static103.anInt2639, local696.anInt1636 - Static103.anInt2633, local696.anInt1635);
												}
												@Pc(723) Class8 local723 = local8.aClass8_1;
												if (local723 != null && local723.anInt209 == 0) {
													if (local723.aClass1_Sub1_Sub2_4 != null) {
														local723.aClass1_Sub1_Sub2_4.method1418(0, Static103.anInt2647, Static103.anInt2643, Static103.anInt2641, Static103.anInt2649, local723.anInt218 - Static103.anInt2627, local723.anInt214 - Static103.anInt2639, local723.anInt216 - Static103.anInt2633, local723.anInt210);
													}
													if (local723.aClass1_Sub1_Sub2_5 != null) {
														local723.aClass1_Sub1_Sub2_5.method1418(0, Static103.anInt2647, Static103.anInt2643, Static103.anInt2641, Static103.anInt2649, local723.anInt218 - Static103.anInt2627, local723.anInt214 - Static103.anInt2639, local723.anInt216 - Static103.anInt2633, local723.anInt210);
													}
													if (local723.aClass1_Sub1_Sub2_3 != null) {
														local723.aClass1_Sub1_Sub2_3.method1418(0, Static103.anInt2647, Static103.anInt2643, Static103.anInt2641, Static103.anInt2649, local723.anInt218 - Static103.anInt2627, local723.anInt214 - Static103.anInt2639, local723.anInt216 - Static103.anInt2633, local723.anInt210);
													}
												}
											}
											local578 = local8.anInt1533;
											if (local578 != 0) {
												if (local17 < Static103.anInt2645 && (local578 & 0x4) != 0) {
													var35 = local31[local17 + 1][local20];
													if (var35 != null && var35.aBoolean76) {
														Static103.aClass45_8.method1295(var35);
													}
												}
												if (local20 < Static103.anInt2651 && (local578 & 0x2) != 0) {
													var35 = local31[local17][local20 + 1];
													if (var35 != null && var35.aBoolean76) {
														Static103.aClass45_8.method1295(var35);
													}
												}
												if (local17 > Static103.anInt2645 && (local578 & 0x1) != 0) {
													var35 = local31[local17 - 1][local20];
													if (var35 != null && var35.aBoolean76) {
														Static103.aClass45_8.method1295(var35);
													}
												}
												if (local20 > Static103.anInt2651 && (local578 & 0x8) != 0) {
													var35 = local31[local17][local20 - 1];
													if (var35 != null && var35.aBoolean76) {
														Static103.aClass45_8.method1295(var35);
													}
												}
											}
											break;
										}
										if (local8.anInt1525 != 0) {
											var24 = true;
											for (var23 = 0; var23 < local8.anInt1528; var23++) {
												if (local8.aClass63Array1[var23].anInt2579 != Static103.anInt2634 && (local8.anIntArray179[var23] & local8.anInt1525) == local8.anInt1532) {
													var24 = false;
													break;
												}
											}
											if (var24) {
												local942 = local8.aClass2_1;
												if (!this.method1717(local26, local17, local20, local942.anInt127)) {
													local942.aClass1_Sub1_Sub2_1.method1418(0, Static103.anInt2647, Static103.anInt2643, Static103.anInt2641, Static103.anInt2649, local942.anInt137 - Static103.anInt2627, local942.anInt130 - Static103.anInt2639, local942.anInt135 - Static103.anInt2633, local942.anInt136);
												}
												local8.anInt1525 = 0;
											}
										}
										if (!local8.aBoolean77) {
											break;
										}
										try {
											@Pc(981) int local981 = local8.anInt1528;
											local8.aBoolean77 = false;
											var23 = 0;
											label559: for (local251 = 0; local251 < local981; local251++) {
												var12 = local8.aClass63Array1[local251];
												if (var12.anInt2579 != Static103.anInt2634) {
													for (local1001 = var12.anInt2577; local1001 <= var12.anInt2592; local1001++) {
														for (local578 = var12.anInt2576; local578 <= var12.anInt2588; local578++) {
															var35 = local31[local1001][local578];
															if (var35.aBoolean78) {
																local8.aBoolean77 = true;
																continue label559;
															}
															if (var35.anInt1525 != 0) {
																local588 = 0;
																if (local1001 > var12.anInt2577) {
																	local588++;
																}
																if (local1001 < var12.anInt2592) {
																	local588 += 4;
																}
																if (local578 > var12.anInt2576) {
																	local588 += 8;
																}
																if (local578 < var12.anInt2588) {
																	local588 += 2;
																}
																if ((local588 & var35.anInt1525) == local8.anInt1537) {
																	local8.aBoolean77 = true;
																	continue label559;
																}
															}
														}
													}
													Static103.aClass63Array3[var23++] = var12;
													local578 = Static103.anInt2645 - var12.anInt2577;
													local583 = var12.anInt2592 - Static103.anInt2645;
													if (local583 > local578) {
														local578 = local583;
													}
													local588 = Static103.anInt2651 - var12.anInt2576;
													local591 = var12.anInt2588 - Static103.anInt2651;
													if (local591 > local588) {
														var12.anInt2587 = local578 + local591;
													} else {
														var12.anInt2587 = local578 + local588;
													}
												}
											}
											while (var23 > 0) {
												local1116 = -50;
												local1001 = -1;
												@Pc(1125) Class63 local1125;
												for (local578 = 0; local578 < var23; local578++) {
													local1125 = Static103.aClass63Array3[local578];
													if (local1125.anInt2579 != Static103.anInt2634) {
														if (local1125.anInt2587 > local1116) {
															local1116 = local1125.anInt2587;
															local1001 = local578;
														} else if (local1125.anInt2587 == local1116) {
															local588 = local1125.anInt2585 - Static103.anInt2627;
															local591 = local1125.anInt2575 - Static103.anInt2633;
															local600 = Static103.aClass63Array3[local1001].anInt2585 - Static103.anInt2627;
															var19 = Static103.aClass63Array3[local1001].anInt2575 - Static103.anInt2633;
															if (local588 * local588 + local591 * local591 > local600 * local600 + var19 * var19) {
																local1001 = local578;
															}
														}
													}
												}
												if (local1001 == -1) {
													break;
												}
												local1125 = Static103.aClass63Array3[local1001];
												local1125.anInt2579 = Static103.anInt2634;
												if (!this.method1752(local26, local1125.anInt2577, local1125.anInt2592, local1125.anInt2576, local1125.anInt2588, local1125.aClass1_Sub1_Sub2_8.anInt2285)) {
													local1125.aClass1_Sub1_Sub2_8.method1418(local1125.anInt2584, Static103.anInt2647, Static103.anInt2643, Static103.anInt2641, Static103.anInt2649, local1125.anInt2585 - Static103.anInt2627, local1125.anInt2586 - Static103.anInt2639, local1125.anInt2575 - Static103.anInt2633, local1125.anInt2582);
												}
												for (local588 = local1125.anInt2577; local588 <= local1125.anInt2592; local588++) {
													for (local591 = local1125.anInt2576; local591 <= local1125.anInt2588; local591++) {
														@Pc(1250) Class1_Sub8 local1250 = local31[local588][local591];
														if (local1250.anInt1525 != 0) {
															Static103.aClass45_8.method1295(local1250);
														} else if ((local588 != local17 || local591 != local20) && local1250.aBoolean76) {
															Static103.aClass45_8.method1295(local1250);
														}
													}
												}
											}
											if (!local8.aBoolean77) {
												break;
											}
										} catch (@Pc(1288) Exception local1288) {
											local8.aBoolean77 = false;
											break;
										}
									}
								} while (!local8.aBoolean76);
							} while (local8.anInt1525 != 0);
							if (local17 > Static103.anInt2645 || local17 <= Static103.anInt2635) {
								break;
							}
							local49 = local31[local17 - 1][local20];
						} while (local49 != null && local49.aBoolean76);
						if (local17 < Static103.anInt2645 || local17 >= Static103.anInt2637 - 1) {
							break;
						}
						local49 = local31[local17 + 1][local20];
					} while (local49 != null && local49.aBoolean76);
					if (local20 > Static103.anInt2651 || local20 <= Static103.anInt2636) {
						break;
					}
					local49 = local31[local17][local20 - 1];
				} while (local49 != null && local49.aBoolean76);
				if (local20 < Static103.anInt2651 || local20 >= Static103.anInt2646 - 1) {
					break;
				}
				local49 = local31[local17][local20 + 1];
			} while (local49 != null && local49.aBoolean76);
			local8.aBoolean76 = false;
			Static103.anInt2629--;
			@Pc(1392) Class8 local1392 = local8.aClass8_1;
			if (local1392 != null && local1392.anInt209 != 0) {
				if (local1392.aClass1_Sub1_Sub2_4 != null) {
					local1392.aClass1_Sub1_Sub2_4.method1418(0, Static103.anInt2647, Static103.anInt2643, Static103.anInt2641, Static103.anInt2649, local1392.anInt218 - Static103.anInt2627, local1392.anInt214 - Static103.anInt2639 - local1392.anInt209, local1392.anInt216 - Static103.anInt2633, local1392.anInt210);
				}
				if (local1392.aClass1_Sub1_Sub2_5 != null) {
					local1392.aClass1_Sub1_Sub2_5.method1418(0, Static103.anInt2647, Static103.anInt2643, Static103.anInt2641, Static103.anInt2649, local1392.anInt218 - Static103.anInt2627, local1392.anInt214 - Static103.anInt2639 - local1392.anInt209, local1392.anInt216 - Static103.anInt2633, local1392.anInt210);
				}
				if (local1392.aClass1_Sub1_Sub2_3 != null) {
					local1392.aClass1_Sub1_Sub2_3.method1418(0, Static103.anInt2647, Static103.anInt2643, Static103.anInt2641, Static103.anInt2649, local1392.anInt218 - Static103.anInt2627, local1392.anInt214 - Static103.anInt2639 - local1392.anInt209, local1392.anInt216 - Static103.anInt2633, local1392.anInt210);
				}
			}
			if (local8.anInt1526 != 0) {
				@Pc(1487) Class25 local1487 = local8.aClass25_1;
				if (local1487 != null && !this.method1725(local26, local17, local20, local1487.aClass1_Sub1_Sub2_6.anInt2285)) {
					if ((local1487.anInt1292 & local8.anInt1526) != 0) {
						local1487.aClass1_Sub1_Sub2_6.method1418(local1487.anInt1294, Static103.anInt2647, Static103.anInt2643, Static103.anInt2641, Static103.anInt2649, local1487.anInt1288 - Static103.anInt2627, local1487.anInt1305 - Static103.anInt2639, local1487.anInt1295 - Static103.anInt2633, local1487.anInt1290);
					} else if ((local1487.anInt1292 & 0x300) != 0) {
						local251 = local1487.anInt1288 - Static103.anInt2627;
						local1116 = local1487.anInt1305 - Static103.anInt2639;
						local1001 = local1487.anInt1295 - Static103.anInt2633;
						local578 = local1487.anInt1294;
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
						if ((local1487.anInt1292 & 0x100) != 0 && local588 >= local583) {
							local591 = local251 + Static103.anIntArray358[local578];
							local600 = local1001 + Static103.anIntArray360[local578];
							local1487.aClass1_Sub1_Sub2_6.method1418(local578 * 512 + 256, Static103.anInt2647, Static103.anInt2643, Static103.anInt2641, Static103.anInt2649, local591, local1116, local600, local1487.anInt1290);
						}
						if ((local1487.anInt1292 & 0x200) != 0 && local588 <= local583) {
							local591 = local251 + Static103.anIntArray357[local578];
							local600 = local1001 + Static103.anIntArray359[local578];
							local1487.aClass1_Sub1_Sub2_6.method1418(local578 * 512 + 1280 & 0x7FF, Static103.anInt2647, Static103.anInt2643, Static103.anInt2641, Static103.anInt2649, local591, local1116, local600, local1487.anInt1290);
						}
					}
				}
				local942 = local8.aClass2_1;
				if (local942 != null) {
					if ((local942.anInt129 & local8.anInt1526) != 0 && !this.method1717(local26, local17, local20, local942.anInt129)) {
						local942.aClass1_Sub1_Sub2_2.method1418(0, Static103.anInt2647, Static103.anInt2643, Static103.anInt2641, Static103.anInt2649, local942.anInt137 - Static103.anInt2627, local942.anInt130 - Static103.anInt2639, local942.anInt135 - Static103.anInt2633, local942.anInt136);
					}
					if ((local942.anInt127 & local8.anInt1526) != 0 && !this.method1717(local26, local17, local20, local942.anInt127)) {
						local942.aClass1_Sub1_Sub2_1.method1418(0, Static103.anInt2647, Static103.anInt2643, Static103.anInt2641, Static103.anInt2649, local942.anInt137 - Static103.anInt2627, local942.anInt130 - Static103.anInt2639, local942.anInt135 - Static103.anInt2633, local942.anInt136);
					}
				}
			}
			@Pc(1745) Class1_Sub8 local1745;
			if (local23 < this.anInt2638 - 1) {
				local1745 = this.aClass1_Sub8ArrayArrayArray1[local23 + 1][local17][local20];
				if (local1745 != null && local1745.aBoolean76) {
					Static103.aClass45_8.method1295(local1745);
				}
			}
			if (local17 < Static103.anInt2645) {
				local1745 = local31[local17 + 1][local20];
				if (local1745 != null && local1745.aBoolean76) {
					Static103.aClass45_8.method1295(local1745);
				}
			}
			if (local20 < Static103.anInt2651) {
				local1745 = local31[local17][local20 + 1];
				if (local1745 != null && local1745.aBoolean76) {
					Static103.aClass45_8.method1295(local1745);
				}
			}
			if (local17 > Static103.anInt2645) {
				local1745 = local31[local17 - 1][local20];
				if (local1745 != null && local1745.aBoolean76) {
					Static103.aClass45_8.method1295(local1745);
				}
			}
			if (local20 > Static103.anInt2651) {
				local1745 = local31[local17][local20 - 1];
				if (local1745 != null && local1745.aBoolean76) {
					Static103.aClass45_8.method1295(local1745);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ud", name = "c", descriptor = "()V")
	private void method1756() {
		@Pc(3) int local3 = Static103.anIntArray356[Static103.anInt2642];
		@Pc(7) Class24[] local7 = Static103.aClass24ArrayArray1[Static103.anInt2642];
		Static103.anInt2628 = 0;
		for (@Pc(11) int local11 = 0; local11 < local3; local11++) {
			@Pc(16) Class24 local16 = local7[local11];
			@Pc(27) int local27;
			@Pc(40) int local40;
			@Pc(51) int local51;
			@Pc(79) int local79;
			@Pc(58) boolean local58;
			if (local16.anInt1094 == 1) {
				local27 = local16.anInt1117 + 25 - Static103.anInt2645;
				if (local27 >= 0 && local27 <= 50) {
					local40 = local16.anInt1104 + 25 - Static103.anInt2651;
					if (local40 < 0) {
						local40 = 0;
					}
					local51 = local16.anInt1122 + 25 - Static103.anInt2651;
					if (local51 > 50) {
						local51 = 50;
					}
					local58 = false;
					while (local40 <= local51) {
						if (Static103.aBooleanArrayArray1[local27][local40++]) {
							local58 = true;
							break;
						}
					}
					if (local58) {
						local79 = Static103.anInt2627 - local16.anInt1115;
						if (local79 > 32) {
							local16.anInt1108 = 1;
						} else {
							if (local79 >= -32) {
								continue;
							}
							local16.anInt1108 = 2;
							local79 = -local79;
						}
						local16.anInt1106 = (local16.anInt1090 - Static103.anInt2633 << 8) / local79;
						local16.anInt1100 = (local16.anInt1113 - Static103.anInt2633 << 8) / local79;
						local16.anInt1098 = (local16.anInt1114 - Static103.anInt2639 << 8) / local79;
						local16.anInt1102 = (local16.anInt1091 - Static103.anInt2639 << 8) / local79;
						Static103.aClass24Array1[Static103.anInt2628++] = local16;
					}
				}
			} else if (local16.anInt1094 == 2) {
				local27 = local16.anInt1104 + 25 - Static103.anInt2651;
				if (local27 >= 0 && local27 <= 50) {
					local40 = local16.anInt1117 + 25 - Static103.anInt2645;
					if (local40 < 0) {
						local40 = 0;
					}
					local51 = local16.anInt1099 + 25 - Static103.anInt2645;
					if (local51 > 50) {
						local51 = 50;
					}
					local58 = false;
					while (local40 <= local51) {
						if (Static103.aBooleanArrayArray1[local40++][local27]) {
							local58 = true;
							break;
						}
					}
					if (local58) {
						local79 = Static103.anInt2633 - local16.anInt1090;
						if (local79 > 32) {
							local16.anInt1108 = 3;
						} else {
							if (local79 >= -32) {
								continue;
							}
							local16.anInt1108 = 4;
							local79 = -local79;
						}
						local16.anInt1123 = (local16.anInt1115 - Static103.anInt2627 << 8) / local79;
						local16.anInt1107 = (local16.anInt1120 - Static103.anInt2627 << 8) / local79;
						local16.anInt1098 = (local16.anInt1114 - Static103.anInt2639 << 8) / local79;
						local16.anInt1102 = (local16.anInt1091 - Static103.anInt2639 << 8) / local79;
						Static103.aClass24Array1[Static103.anInt2628++] = local16;
					}
				}
			} else if (local16.anInt1094 == 4) {
				local27 = local16.anInt1114 - Static103.anInt2639;
				if (local27 > 128) {
					local40 = local16.anInt1104 + 25 - Static103.anInt2651;
					if (local40 < 0) {
						local40 = 0;
					}
					local51 = local16.anInt1122 + 25 - Static103.anInt2651;
					if (local51 > 50) {
						local51 = 50;
					}
					if (local40 <= local51) {
						@Pc(319) int local319 = local16.anInt1117 + 25 - Static103.anInt2645;
						if (local319 < 0) {
							local319 = 0;
						}
						local79 = local16.anInt1099 + 25 - Static103.anInt2645;
						if (local79 > 50) {
							local79 = 50;
						}
						@Pc(337) boolean local337 = false;
						label142: for (@Pc(339) int local339 = local319; local339 <= local79; local339++) {
							for (@Pc(342) int local342 = local40; local342 <= local51; local342++) {
								if (Static103.aBooleanArrayArray1[local339][local342]) {
									local337 = true;
									break label142;
								}
							}
						}
						if (local337) {
							local16.anInt1108 = 5;
							local16.anInt1123 = (local16.anInt1115 - Static103.anInt2627 << 8) / local27;
							local16.anInt1107 = (local16.anInt1120 - Static103.anInt2627 << 8) / local27;
							local16.anInt1106 = (local16.anInt1090 - Static103.anInt2633 << 8) / local27;
							local16.anInt1100 = (local16.anInt1113 - Static103.anInt2633 << 8) / local27;
							Static103.aClass24Array1[Static103.anInt2628++] = local16;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ud", name = "d", descriptor = "()V")
	public void method1757() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt2630; local1++) {
			@Pc(7) Class63 local7 = this.aClass63Array2[local1];
			this.method1713(local7);
			this.aClass63Array2[local1] = null;
		}
		this.anInt2630 = 0;
	}

	@OriginalMember(owner = "client!ud", name = "n", descriptor = "(III)Lclient!kb;")
	public Class32 method1758(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class1_Sub8 local8 = this.aClass1_Sub8ArrayArrayArray1[arg0][arg1][arg2];
		return local8 == null || local8.aClass32_1 == null ? null : local8.aClass32_1;
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(IIIIILclient!aa;IIZ)Z")
	public boolean method1759(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class1_Sub1_Sub2 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8) {
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
		return this.method1751(arg0, local7, local11, local15 + 1 - local7, local19 - local11 + 1, arg1, arg2, arg3, arg5, arg6, true, arg7, 0);
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(Lclient!pe;IIIIII)V")
	private void method1760(@OriginalArg(0) Class49 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(3) int local3 = arg0.anIntArray249.length;
		@Pc(13) int local13;
		@Pc(20) int local20;
		@Pc(27) int local27;
		@Pc(37) int local37;
		for (@Pc(5) int local5 = 0; local5 < local3; local5++) {
			local13 = arg0.anIntArray249[local5] - Static103.anInt2627;
			local20 = arg0.anIntArray255[local5] - Static103.anInt2639;
			local27 = arg0.anIntArray245[local5] - Static103.anInt2633;
			local37 = local27 * arg3 + local13 * arg4 >> 16;
			@Pc(47) int local47 = local27 * arg4 - local13 * arg3 >> 16;
			@Pc(59) int local59 = local20 * arg2 - local47 * arg1 >> 16;
			@Pc(69) int local69 = local20 * arg1 + local47 * arg2 >> 16;
			if (local69 < 50) {
				return;
			}
			if (arg0.anIntArray252 != null) {
				Static78.anIntArray253[local5] = local37;
				Static78.anIntArray242[local5] = local59;
				Static78.anIntArray248[local5] = local69;
			}
			Static78.anIntArray243[local5] = Static93.anInt2474 + (local37 << 9) / local69;
			Static78.anIntArray251[local5] = Static93.anInt2470 + (local59 << 9) / local69;
		}
		Static93.anInt2477 = 0;
		local3 = arg0.anIntArray244.length;
		for (local13 = 0; local13 < local3; local13++) {
			local20 = arg0.anIntArray244[local13];
			local27 = arg0.anIntArray250[local13];
			local37 = arg0.anIntArray246[local13];
			@Pc(142) int local142 = Static78.anIntArray243[local20];
			@Pc(146) int local146 = Static78.anIntArray243[local27];
			@Pc(150) int local150 = Static78.anIntArray243[local37];
			@Pc(154) int local154 = Static78.anIntArray251[local20];
			@Pc(158) int local158 = Static78.anIntArray251[local27];
			@Pc(162) int local162 = Static78.anIntArray251[local37];
			if ((local142 - local146) * (local162 - local158) - (local154 - local158) * (local150 - local146) > 0) {
				Static93.aBoolean118 = false;
				if (local142 < 0 || local146 < 0 || local150 < 0 || local142 > Static93.anInt2472 || local146 > Static93.anInt2472 || local150 > Static93.anInt2472) {
					Static93.aBoolean118 = true;
				}
				if (Static103.aBoolean125 && this.method1739(Static103.anInt2640, Static103.anInt2631, local154, local158, local162, local142, local146, local150)) {
					Static103.anInt2644 = arg5;
					Static103.anInt2632 = arg6;
				}
				if (arg0.anIntArray252 == null || arg0.anIntArray252[local13] == -1) {
					if (arg0.anIntArray256[local13] != 12345678) {
						Static93.method1602(local154, local158, local162, local142, local146, local150, arg0.anIntArray256[local13], arg0.anIntArray247[local13], arg0.anIntArray254[local13]);
					}
				} else if (Static103.aBoolean124) {
					@Pc(364) int local364 = Static93.anInterface2_1.method1331(arg0.anIntArray252[local13]);
					Static93.method1602(local154, local158, local162, local142, local146, local150, Static103.method1741(local364, arg0.anIntArray256[local13]), Static103.method1741(local364, arg0.anIntArray247[local13]), Static103.method1741(local364, arg0.anIntArray254[local13]));
				} else if (arg0.aBoolean103) {
					Static93.method1599(local154, local158, local162, local142, local146, local150, arg0.anIntArray256[local13], arg0.anIntArray247[local13], arg0.anIntArray254[local13], Static78.anIntArray253[0], Static78.anIntArray253[1], Static78.anIntArray253[3], Static78.anIntArray242[0], Static78.anIntArray242[1], Static78.anIntArray242[3], Static78.anIntArray248[0], Static78.anIntArray248[1], Static78.anIntArray248[3], arg0.anIntArray252[local13]);
				} else {
					Static93.method1599(local154, local158, local162, local142, local146, local150, arg0.anIntArray256[local13], arg0.anIntArray247[local13], arg0.anIntArray254[local13], Static78.anIntArray253[local20], Static78.anIntArray253[local27], Static78.anIntArray253[local37], Static78.anIntArray242[local20], Static78.anIntArray242[local27], Static78.anIntArray242[local37], Static78.anIntArray248[local20], Static78.anIntArray248[local27], Static78.anIntArray248[local37], arg0.anIntArray252[local13]);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ud", name = "o", descriptor = "(III)Lclient!hc;")
	public Class25 method1761(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class1_Sub8 local8 = this.aClass1_Sub8ArrayArrayArray1[arg0][arg1][arg2];
		return local8 == null ? null : local8.aClass25_1;
	}

	@OriginalMember(owner = "client!ud", name = "p", descriptor = "(III)I")
	public int method1762(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class1_Sub8 local8 = this.aClass1_Sub8ArrayArrayArray1[arg0][arg1][arg2];
		return local8 == null || local8.aClass32_1 == null ? 0 : local8.aClass32_1.anInt1635;
	}

	@OriginalMember(owner = "client!ud", name = "q", descriptor = "(III)V")
	public void method1763(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class1_Sub8 local8 = this.aClass1_Sub8ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 != null) {
			local8.aClass2_1 = null;
		}
	}
}
