import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!be")
public final class Class9 {

	@OriginalMember(owner = "client!be", name = "d", descriptor = "I")
	private int anInt355 = 0;

	@OriginalMember(owner = "client!be", name = "D", descriptor = "[Lclient!ub;")
	private final Class73[] aClass73Array2 = new Class73[5000];

	@OriginalMember(owner = "client!be", name = "E", descriptor = "I")
	private int anInt374 = 0;

	@OriginalMember(owner = "client!be", name = "O", descriptor = "[[I")
	private final int[][] anIntArrayArray8 = new int[][] { new int[16], { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 1 }, { 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0 }, { 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1 }, { 1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 1 } };

	@OriginalMember(owner = "client!be", name = "N", descriptor = "[[I")
	private final int[][] anIntArrayArray7 = new int[][] { { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 }, { 12, 8, 4, 0, 13, 9, 5, 1, 14, 10, 6, 2, 15, 11, 7, 3 }, { 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 }, { 3, 7, 11, 15, 2, 6, 10, 14, 1, 5, 9, 13, 0, 4, 8, 12 } };

	@OriginalMember(owner = "client!be", name = "z", descriptor = "I")
	private final int anInt373;

	@OriginalMember(owner = "client!be", name = "n", descriptor = "I")
	private final int anInt363;

	@OriginalMember(owner = "client!be", name = "a", descriptor = "I")
	private final int anInt352;

	@OriginalMember(owner = "client!be", name = "J", descriptor = "[[[Lclient!ra;")
	private final Class1_Sub20[][][] aClass1_Sub20ArrayArrayArray1;

	@OriginalMember(owner = "client!be", name = "g", descriptor = "[[[I")
	private final int[][][] anIntArrayArrayArray1;

	@OriginalMember(owner = "client!be", name = "F", descriptor = "[[[I")
	private final int[][][] anIntArrayArrayArray2;

	@OriginalMember(owner = "client!be", name = "<init>", descriptor = "(III[[[I)V")
	public Class9(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[][][] arg3) {
		this.anInt373 = arg0;
		this.anInt363 = arg1;
		this.anInt352 = arg2;
		this.aClass1_Sub20ArrayArrayArray1 = new Class1_Sub20[arg0][arg1][arg2];
		this.anIntArrayArrayArray1 = new int[arg0][arg1 + 1][arg2 + 1];
		this.anIntArrayArrayArray2 = arg3;
		this.method318();
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(IIII)Z")
	private boolean method304(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.method314(arg0, arg1, arg2)) {
			@Pc(11) int local11 = arg1 << 7;
			@Pc(15) int local15 = arg2 << 7;
			return this.method353(local11 + 1, this.anIntArrayArrayArray2[arg0][arg1][arg2] - arg3, local15 + 1) && this.method353(local11 + 128 - 1, this.anIntArrayArrayArray2[arg0][arg1 + 1][arg2] - arg3, local15 + 1) && this.method353(local11 + 128 - 1, this.anIntArrayArrayArray2[arg0][arg1 + 1][arg2 + 1] - arg3, local15 + 128 - 1) && this.method353(local11 + 1, this.anIntArrayArrayArray2[arg0][arg1][arg2 + 1] - arg3, local15 + 128 - 1);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(III)I")
	public int method306(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class1_Sub20 local8 = this.aClass1_Sub20ArrayArrayArray1[arg0][arg1][arg2];
		return local8 == null || local8.aClass41_1 == null ? 0 : local8.aClass41_1.anInt1862;
	}

	@OriginalMember(owner = "client!be", name = "b", descriptor = "(IIII)Z")
	private boolean method307(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!this.method314(arg0, arg1, arg2)) {
			return false;
		}
		@Pc(11) int local11 = arg1 << 7;
		@Pc(15) int local15 = arg2 << 7;
		@Pc(26) int local26 = this.anIntArrayArrayArray2[arg0][arg1][arg2] - 1;
		@Pc(30) int local30 = local26 - 120;
		@Pc(34) int local34 = local26 - 230;
		@Pc(38) int local38 = local26 - 238;
		if (arg3 < 16) {
			if (arg3 == 1) {
				if (local11 > Static10.anInt379) {
					if (!this.method353(local11, local26, local15)) {
						return false;
					}
					if (!this.method353(local11, local26, local15 + 128)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!this.method353(local11, local30, local15)) {
						return false;
					}
					if (!this.method353(local11, local30, local15 + 128)) {
						return false;
					}
				}
				if (!this.method353(local11, local34, local15)) {
					return false;
				}
				if (!this.method353(local11, local34, local15 + 128)) {
					return false;
				}
				return true;
			}
			if (arg3 == 2) {
				if (local15 < Static10.anInt367) {
					if (!this.method353(local11, local26, local15 + 128)) {
						return false;
					}
					if (!this.method353(local11 + 128, local26, local15 + 128)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!this.method353(local11, local30, local15 + 128)) {
						return false;
					}
					if (!this.method353(local11 + 128, local30, local15 + 128)) {
						return false;
					}
				}
				if (!this.method353(local11, local34, local15 + 128)) {
					return false;
				}
				if (!this.method353(local11 + 128, local34, local15 + 128)) {
					return false;
				}
				return true;
			}
			if (arg3 == 4) {
				if (local11 < Static10.anInt379) {
					if (!this.method353(local11 + 128, local26, local15)) {
						return false;
					}
					if (!this.method353(local11 + 128, local26, local15 + 128)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!this.method353(local11 + 128, local30, local15)) {
						return false;
					}
					if (!this.method353(local11 + 128, local30, local15 + 128)) {
						return false;
					}
				}
				if (!this.method353(local11 + 128, local34, local15)) {
					return false;
				}
				if (!this.method353(local11 + 128, local34, local15 + 128)) {
					return false;
				}
				return true;
			}
			if (arg3 == 8) {
				if (local15 > Static10.anInt367) {
					if (!this.method353(local11, local26, local15)) {
						return false;
					}
					if (!this.method353(local11 + 128, local26, local15)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!this.method353(local11, local30, local15)) {
						return false;
					}
					if (!this.method353(local11 + 128, local30, local15)) {
						return false;
					}
				}
				if (!this.method353(local11, local34, local15)) {
					return false;
				}
				if (!this.method353(local11 + 128, local34, local15)) {
					return false;
				}
				return true;
			}
		}
		if (!this.method353(local11 + 64, local38, local15 + 64)) {
			return false;
		} else if (arg3 == 16) {
			return this.method353(local11, local34, local15 + 128);
		} else if (arg3 == 32) {
			return this.method353(local11 + 128, local34, local15 + 128);
		} else if (arg3 == 64) {
			return this.method353(local11 + 128, local34, local15);
		} else if (arg3 == 128) {
			return this.method353(local11, local34, local15);
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(IIIILclient!wc;ILclient!wc;Lclient!wc;)V")
	public void method308(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class1_Sub1_Sub1 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class1_Sub1_Sub1 arg6, @OriginalArg(7) Class1_Sub1_Sub1 arg7) {
		@Pc(3) Class15 local3 = new Class15();
		local3.aClass1_Sub1_Sub1_2 = arg4;
		local3.anInt615 = arg1 * 128 + 64;
		local3.anInt611 = arg2 * 128 + 64;
		local3.anInt617 = arg3;
		local3.anInt613 = arg5;
		local3.aClass1_Sub1_Sub1_3 = arg6;
		local3.aClass1_Sub1_Sub1_1 = arg7;
		@Pc(34) int local34 = 0;
		@Pc(43) Class1_Sub20 local43 = this.aClass1_Sub20ArrayArrayArray1[arg0][arg1][arg2];
		if (local43 != null) {
			for (@Pc(47) int local47 = 0; local47 < local43.anInt2465; local47++) {
				if ((local43.aClass73Array3[local47].anInt2737 & 0x100) == 256 && local43.aClass73Array3[local47].aClass1_Sub1_Sub1_8 instanceof Class1_Sub1_Sub1_Sub6) {
					@Pc(71) Class1_Sub1_Sub1_Sub6 local71 = (Class1_Sub1_Sub1_Sub6) local43.aClass73Array3[local47].aClass1_Sub1_Sub1_8;
					local71.method1338();
					if (local71.anInt2699 > local34) {
						local34 = local71.anInt2699;
					}
				}
			}
		}
		local3.anInt614 = local34;
		if (this.aClass1_Sub20ArrayArrayArray1[arg0][arg1][arg2] == null) {
			this.aClass1_Sub20ArrayArrayArray1[arg0][arg1][arg2] = new Class1_Sub20(arg0, arg1, arg2);
		}
		this.aClass1_Sub20ArrayArrayArray1[arg0][arg1][arg2].aClass15_1 = local3;
	}

	@OriginalMember(owner = "client!be", name = "b", descriptor = "(III)V")
	public void method309(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class1_Sub20 local8 = this.aClass1_Sub20ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 != null) {
			local8.aClass21_1 = null;
		}
	}

	@OriginalMember(owner = "client!be", name = "c", descriptor = "(IIII)I")
	public int method311(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(8) Class1_Sub20 local8 = this.aClass1_Sub20ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 == null) {
			return -1;
		} else if (local8.aClass21_1 != null && local8.aClass21_1.anInt732 == arg3) {
			return local8.aClass21_1.anInt741 & 0xFF;
		} else if (local8.aClass41_1 != null && local8.aClass41_1.anInt1862 == arg3) {
			return local8.aClass41_1.anInt1857 & 0xFF;
		} else if (local8.aClass82_1 != null && local8.aClass82_1.anInt2931 == arg3) {
			return local8.aClass82_1.anInt2927 & 0xFF;
		} else {
			for (@Pc(56) int local56 = 0; local56 < local8.anInt2465; local56++) {
				if (local8.aClass73Array3[local56].anInt2753 == arg3) {
					return local8.aClass73Array3[local56].anInt2737 & 0xFF;
				}
			}
			return -1;
		}
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(Lclient!ub;)V")
	private void method312(@OriginalArg(0) Class73 arg0) {
		for (@Pc(2) int local2 = arg0.anInt2740; local2 <= arg0.anInt2750; local2++) {
			for (@Pc(6) int local6 = arg0.anInt2747; local6 <= arg0.anInt2745; local6++) {
				@Pc(17) Class1_Sub20 local17 = this.aClass1_Sub20ArrayArrayArray1[arg0.anInt2741][local2][local6];
				if (local17 != null) {
					@Pc(36) int local36;
					for (@Pc(21) int local21 = 0; local21 < local17.anInt2465; local21++) {
						if (local17.aClass73Array3[local21] == arg0) {
							local17.anInt2465--;
							for (local36 = local21; local36 < local17.anInt2465; local36++) {
								local17.aClass73Array3[local36] = local17.aClass73Array3[local36 + 1];
								local17.anIntArray418[local36] = local17.anIntArray418[local36 + 1];
							}
							local17.aClass73Array3[local17.anInt2465] = null;
							break;
						}
					}
					local17.anInt2467 = 0;
					for (local36 = 0; local36 < local17.anInt2465; local36++) {
						local17.anInt2467 |= local17.anIntArray418[local36];
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "([IIIIII)V")
	public void method313(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(8) Class1_Sub20 local8 = this.aClass1_Sub20ArrayArrayArray1[arg2][arg3][arg4];
		if (local8 == null) {
			return;
		}
		@Pc(14) Class51 local14 = local8.aClass51_1;
		@Pc(24) int local24;
		if (local14 != null) {
			@Pc(19) int local19 = local14.anInt2160;
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
		@Pc(59) Class68 local59 = local8.aClass68_1;
		if (local59 == null) {
			return;
		}
		local24 = local59.anInt2618;
		@Pc(68) int local68 = local59.anInt2619;
		@Pc(71) int local71 = local59.anInt2620;
		@Pc(74) int local74 = local59.anInt2621;
		@Pc(79) int[] local79 = this.anIntArrayArray8[local24];
		@Pc(84) int[] local84 = this.anIntArrayArray7[local68];
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

	@OriginalMember(owner = "client!be", name = "c", descriptor = "(III)Z")
	private boolean method314(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) int local8 = this.anIntArrayArrayArray1[arg0][arg1][arg2];
		if (local8 == -Static10.anInt364) {
			return false;
		} else if (local8 == Static10.anInt364) {
			return true;
		} else {
			@Pc(23) int local23 = arg1 << 7;
			@Pc(27) int local27 = arg2 << 7;
			if (this.method353(local23 + 1, this.anIntArrayArrayArray2[arg0][arg1][arg2], local27 + 1) && this.method353(local23 + 128 - 1, this.anIntArrayArrayArray2[arg0][arg1 + 1][arg2], local27 + 1) && this.method353(local23 + 128 - 1, this.anIntArrayArrayArray2[arg0][arg1 + 1][arg2 + 1], local27 + 128 - 1) && this.method353(local23 + 1, this.anIntArrayArrayArray2[arg0][arg1][arg2 + 1], local27 + 128 - 1)) {
				this.anIntArrayArrayArray1[arg0][arg1][arg2] = Static10.anInt364;
				return true;
			} else {
				this.anIntArrayArrayArray1[arg0][arg1][arg2] = -Static10.anInt364;
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(IIIIILclient!wc;IIZ)Z")
	public boolean method315(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class1_Sub1_Sub1 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8) {
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
		return this.method349(arg0, local7, local11, local15 + 1 - local7, local19 - local11 + 1, arg1, arg2, arg3, arg5, arg6, true, arg7, 0);
	}

	@OriginalMember(owner = "client!be", name = "d", descriptor = "(III)Lclient!wd;")
	public Class82 method316(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class1_Sub20 local8 = this.aClass1_Sub20ArrayArrayArray1[arg0][arg1][arg2];
		return local8 == null || local8.aClass82_1 == null ? null : local8.aClass82_1;
	}

	@OriginalMember(owner = "client!be", name = "e", descriptor = "(III)V")
	public void method317(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		Static10.aBoolean15 = true;
		Static10.anInt371 = arg0;
		Static10.anInt353 = arg1;
		Static10.anInt375 = arg2;
		Static10.anInt377 = -1;
		Static10.anInt357 = -1;
	}

	@OriginalMember(owner = "client!be", name = "b", descriptor = "()V")
	public void method318() {
		@Pc(4) int local4;
		@Pc(7) int local7;
		for (@Pc(1) int local1 = 0; local1 < this.anInt373; local1++) {
			for (local4 = 0; local4 < this.anInt363; local4++) {
				for (local7 = 0; local7 < this.anInt352; local7++) {
					this.aClass1_Sub20ArrayArrayArray1[local1][local4][local7] = null;
				}
			}
		}
		for (local4 = 0; local4 < Static10.anInt376; local4++) {
			for (local7 = 0; local7 < Static10.anIntArray58[local4]; local7++) {
				Static10.aClass48ArrayArray1[local4][local7] = null;
			}
			Static10.anIntArray58[local4] = 0;
		}
		for (local7 = 0; local7 < this.anInt355; local7++) {
			this.aClass73Array2[local7] = null;
		}
		this.anInt355 = 0;
		for (@Pc(76) int local76 = 0; local76 < Static10.aClass73Array1.length; local76++) {
			Static10.aClass73Array1[local76] = null;
		}
	}

	@OriginalMember(owner = "client!be", name = "d", descriptor = "(IIII)V")
	public void method319(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(8) Class1_Sub20 local8 = this.aClass1_Sub20ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 == null) {
			return;
		}
		@Pc(14) Class41 local14 = local8.aClass41_1;
		if (local14 != null) {
			local14.anInt1856 = local14.anInt1856 * arg3 / 16;
			local14.anInt1863 = local14.anInt1863 * arg3 / 16;
		}
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(IIIIIILclient!wc;III)Z")
	public boolean method320(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class1_Sub1_Sub1 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		if (arg6 == null) {
			return true;
		} else {
			@Pc(11) int local11 = arg1 * 128 + arg4 * 64;
			@Pc(19) int local19 = arg2 * 128 + arg5 * 64;
			return this.method349(arg0, arg1, arg2, arg4, arg5, local11, local19, arg3, arg6, arg7, false, arg8, arg9);
		}
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(IIIILclient!wc;Lclient!wc;IIII)V")
	public void method321(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class1_Sub1_Sub1 arg4, @OriginalArg(5) Class1_Sub1_Sub1 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		if (arg4 == null && arg5 == null) {
			return;
		}
		@Pc(8) Class21 local8 = new Class21();
		local8.anInt732 = arg8;
		local8.anInt741 = arg9;
		local8.anInt740 = arg1 * 128 + 64;
		local8.anInt733 = arg2 * 128 + 64;
		local8.anInt744 = arg3;
		local8.aClass1_Sub1_Sub1_4 = arg4;
		local8.aClass1_Sub1_Sub1_5 = arg5;
		local8.anInt735 = arg6;
		local8.anInt738 = arg7;
		for (@Pc(45) int local45 = arg0; local45 >= 0; local45--) {
			if (this.aClass1_Sub20ArrayArrayArray1[local45][arg1][arg2] == null) {
				this.aClass1_Sub20ArrayArrayArray1[local45][arg1][arg2] = new Class1_Sub20(local45, arg1, arg2);
			}
		}
		this.aClass1_Sub20ArrayArrayArray1[arg0][arg1][arg2].aClass21_1 = local8;
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(IIIIII)V")
	public void method322(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (arg0 < 0) {
			arg0 = 0;
		} else if (arg0 >= this.anInt363 * 128) {
			arg0 = this.anInt363 * 128 - 1;
		}
		if (arg2 < 0) {
			arg2 = 0;
		} else if (arg2 >= this.anInt352 * 128) {
			arg2 = this.anInt352 * 128 - 1;
		}
		Static10.anInt364++;
		Static10.anInt359 = Class1_Sub1_Sub2_Sub4.anIntArray399[arg3];
		Static10.anInt365 = Class1_Sub1_Sub2_Sub4.anIntArray397[arg3];
		Static10.anInt358 = Class1_Sub1_Sub2_Sub4.anIntArray399[arg4];
		Static10.anInt356 = Class1_Sub1_Sub2_Sub4.anIntArray397[arg4];
		Static10.aBooleanArrayArray1 = Static10.aBooleanArrayArrayArrayArray1[(arg3 - 128) / 32][arg4 / 64];
		Static10.anInt379 = arg0;
		Static10.anInt361 = arg1;
		Static10.anInt367 = arg2;
		Static10.anInt362 = arg0 / 128;
		Static10.anInt370 = arg2 / 128;
		Static10.anInt378 = arg5;
		Static10.anInt372 = Static10.anInt362 - 25;
		if (Static10.anInt372 < 0) {
			Static10.anInt372 = 0;
		}
		Static10.anInt369 = Static10.anInt370 - 25;
		if (Static10.anInt369 < 0) {
			Static10.anInt369 = 0;
		}
		Static10.anInt360 = Static10.anInt362 + 25;
		if (Static10.anInt360 > this.anInt363) {
			Static10.anInt360 = this.anInt363;
		}
		Static10.anInt354 = Static10.anInt370 + 25;
		if (Static10.anInt354 > this.anInt352) {
			Static10.anInt354 = this.anInt352;
		}
		this.method339();
		Static10.anInt368 = 0;
		@Pc(136) int local136;
		@Pc(139) int local139;
		for (@Pc(128) int local128 = this.anInt374; local128 < this.anInt373; local128++) {
			@Pc(134) Class1_Sub20[][] local134 = this.aClass1_Sub20ArrayArrayArray1[local128];
			for (local136 = Static10.anInt372; local136 < Static10.anInt360; local136++) {
				for (local139 = Static10.anInt369; local139 < Static10.anInt354; local139++) {
					@Pc(146) Class1_Sub20 local146 = local134[local136][local139];
					if (local146 != null) {
						if (local146.anInt2464 <= arg5 && (Static10.aBooleanArrayArray1[local136 + 25 - Static10.anInt362][local139 + 25 - Static10.anInt370] || this.anIntArrayArrayArray2[local128][local136][local139] - arg1 >= 2000)) {
							local146.aBoolean106 = true;
							local146.aBoolean104 = true;
							if (local146.anInt2465 > 0) {
								local146.aBoolean105 = true;
							} else {
								local146.aBoolean105 = false;
							}
							Static10.anInt368++;
						} else {
							local146.aBoolean106 = false;
							local146.aBoolean104 = false;
							local146.anInt2470 = 0;
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
		for (@Pc(224) int local224 = this.anInt374; local224 < this.anInt373; local224++) {
			@Pc(230) Class1_Sub20[][] local230 = this.aClass1_Sub20ArrayArrayArray1[local224];
			for (local139 = -25; local139 <= 0; local139++) {
				local237 = Static10.anInt362 + local139;
				local241 = Static10.anInt362 - local139;
				if (local237 >= Static10.anInt372 || local241 < Static10.anInt360) {
					for (local249 = -25; local249 <= 0; local249++) {
						local254 = Static10.anInt370 + local249;
						local258 = Static10.anInt370 - local249;
						@Pc(270) Class1_Sub20 local270;
						if (local237 >= Static10.anInt372) {
							if (local254 >= Static10.anInt369) {
								local270 = local230[local237][local254];
								if (local270 != null && local270.aBoolean106) {
									this.method336(local270, true);
								}
							}
							if (local258 < Static10.anInt354) {
								local270 = local230[local237][local258];
								if (local270 != null && local270.aBoolean106) {
									this.method336(local270, true);
								}
							}
						}
						if (local241 < Static10.anInt360) {
							if (local254 >= Static10.anInt369) {
								local270 = local230[local241][local254];
								if (local270 != null && local270.aBoolean106) {
									this.method336(local270, true);
								}
							}
							if (local258 < Static10.anInt354) {
								local270 = local230[local241][local258];
								if (local270 != null && local270.aBoolean106) {
									this.method336(local270, true);
								}
							}
						}
						if (Static10.anInt368 == 0) {
							Static10.aBoolean15 = false;
							return;
						}
					}
				}
			}
		}
		for (local136 = this.anInt374; local136 < this.anInt373; local136++) {
			@Pc(361) Class1_Sub20[][] local361 = this.aClass1_Sub20ArrayArrayArray1[local136];
			for (local237 = -25; local237 <= 0; local237++) {
				local241 = Static10.anInt362 + local237;
				local249 = Static10.anInt362 - local237;
				if (local241 >= Static10.anInt372 || local249 < Static10.anInt360) {
					for (local254 = -25; local254 <= 0; local254++) {
						local258 = Static10.anInt370 + local254;
						@Pc(389) int local389 = Static10.anInt370 - local254;
						@Pc(401) Class1_Sub20 local401;
						if (local241 >= Static10.anInt372) {
							if (local258 >= Static10.anInt369) {
								local401 = local361[local241][local258];
								if (local401 != null && local401.aBoolean106) {
									this.method336(local401, false);
								}
							}
							if (local389 < Static10.anInt354) {
								local401 = local361[local241][local389];
								if (local401 != null && local401.aBoolean106) {
									this.method336(local401, false);
								}
							}
						}
						if (local249 < Static10.anInt360) {
							if (local258 >= Static10.anInt369) {
								local401 = local361[local249][local258];
								if (local401 != null && local401.aBoolean106) {
									this.method336(local401, false);
								}
							}
							if (local389 < Static10.anInt354) {
								local401 = local361[local249][local389];
								if (local401 != null && local401.aBoolean106) {
									this.method336(local401, false);
								}
							}
						}
						if (Static10.anInt368 == 0) {
							Static10.aBoolean15 = false;
							return;
						}
					}
				}
			}
		}
		Static10.aBoolean15 = false;
	}

	@OriginalMember(owner = "client!be", name = "f", descriptor = "(III)I")
	public int method323(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class1_Sub20 local8 = this.aClass1_Sub20ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 == null) {
			return 0;
		}
		for (@Pc(14) int local14 = 0; local14 < local8.anInt2465; local14++) {
			@Pc(20) Class73 local20 = local8.aClass73Array3[local14];
			if ((local20.anInt2753 >> 29 & 0x3) == 2 && local20.anInt2740 == arg1 && local20.anInt2747 == arg2) {
				return local20.anInt2753;
			}
		}
		return 0;
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(Lclient!se;IIIIII)V")
	private void method324(@OriginalArg(0) Class68 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(3) int local3 = arg0.anIntArray440.length;
		@Pc(13) int local13;
		@Pc(20) int local20;
		@Pc(27) int local27;
		@Pc(37) int local37;
		for (@Pc(5) int local5 = 0; local5 < local3; local5++) {
			local13 = arg0.anIntArray440[local5] - Static10.anInt379;
			local20 = arg0.anIntArray434[local5] - Static10.anInt361;
			local27 = arg0.anIntArray445[local5] - Static10.anInt367;
			local37 = local27 * arg3 + local13 * arg4 >> 16;
			@Pc(47) int local47 = local27 * arg4 - local13 * arg3 >> 16;
			@Pc(59) int local59 = local20 * arg2 - local47 * arg1 >> 16;
			@Pc(69) int local69 = local20 * arg1 + local47 * arg2 >> 16;
			if (local69 < 50) {
				return;
			}
			if (arg0.anIntArray431 != null) {
				Static107.anIntArray433[local5] = local37;
				Static107.anIntArray441[local5] = local59;
				Static107.anIntArray436[local5] = local69;
			}
			Static107.anIntArray432[local5] = Static91.anInt2376 + (local37 << 9) / local69;
			Static107.anIntArray444[local5] = Static91.anInt2375 + (local59 << 9) / local69;
		}
		Static91.anInt2377 = 0;
		local3 = arg0.anIntArray438.length;
		for (local13 = 0; local13 < local3; local13++) {
			local20 = arg0.anIntArray438[local13];
			local27 = arg0.anIntArray443[local13];
			local37 = arg0.anIntArray437[local13];
			@Pc(142) int local142 = Static107.anIntArray432[local20];
			@Pc(146) int local146 = Static107.anIntArray432[local27];
			@Pc(150) int local150 = Static107.anIntArray432[local37];
			@Pc(154) int local154 = Static107.anIntArray444[local20];
			@Pc(158) int local158 = Static107.anIntArray444[local27];
			@Pc(162) int local162 = Static107.anIntArray444[local37];
			if ((local142 - local146) * (local162 - local158) - (local154 - local158) * (local150 - local146) > 0) {
				Static91.aBoolean101 = false;
				if (local142 < 0 || local146 < 0 || local150 < 0 || local142 > Static91.anInt2374 || local146 > Static91.anInt2374 || local150 > Static91.anInt2374) {
					Static91.aBoolean101 = true;
				}
				if (Static10.aBoolean15 && this.method328(Static10.anInt353, Static10.anInt375, local154, local158, local162, local142, local146, local150)) {
					Static10.anInt377 = arg5;
					Static10.anInt357 = arg6;
				}
				if (arg0.anIntArray431 == null || arg0.anIntArray431[local13] == -1) {
					if (arg0.anIntArray442[local13] != 12345678) {
						Static91.method1683(local154, local158, local162, local142, local146, local150, arg0.anIntArray442[local13], arg0.anIntArray435[local13], arg0.anIntArray439[local13]);
					}
				} else if (Static10.aBoolean14) {
					@Pc(364) int local364 = Static91.anInterface2_1.method1699(arg0.anIntArray431[local13]);
					Static91.method1683(local154, local158, local162, local142, local146, local150, Static10.method350(local364, arg0.anIntArray442[local13]), Static10.method350(local364, arg0.anIntArray435[local13]), Static10.method350(local364, arg0.anIntArray439[local13]));
				} else if (arg0.aBoolean110) {
					Static91.method1692(local154, local158, local162, local142, local146, local150, arg0.anIntArray442[local13], arg0.anIntArray435[local13], arg0.anIntArray439[local13], Static107.anIntArray433[0], Static107.anIntArray433[1], Static107.anIntArray433[3], Static107.anIntArray441[0], Static107.anIntArray441[1], Static107.anIntArray441[3], Static107.anIntArray436[0], Static107.anIntArray436[1], Static107.anIntArray436[3], arg0.anIntArray431[local13]);
				} else {
					Static91.method1692(local154, local158, local162, local142, local146, local150, arg0.anIntArray442[local13], arg0.anIntArray435[local13], arg0.anIntArray439[local13], Static107.anIntArray433[local20], Static107.anIntArray433[local27], Static107.anIntArray433[local37], Static107.anIntArray441[local20], Static107.anIntArray441[local27], Static107.anIntArray441[local37], Static107.anIntArray436[local20], Static107.anIntArray436[local27], Static107.anIntArray436[local37], arg0.anIntArray431[local13]);
				}
			}
		}
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(I)V")
	public void method325(@OriginalArg(0) int arg0) {
		this.anInt374 = arg0;
		for (@Pc(4) int local4 = 0; local4 < this.anInt363; local4++) {
			for (@Pc(7) int local7 = 0; local7 < this.anInt352; local7++) {
				if (this.aClass1_Sub20ArrayArrayArray1[arg0][local4][local7] == null) {
					this.aClass1_Sub20ArrayArrayArray1[arg0][local4][local7] = new Class1_Sub20(arg0, local4, local7);
				}
			}
		}
	}

	@OriginalMember(owner = "client!be", name = "b", descriptor = "(IIIIII)Z")
	private boolean method326(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(17) int local17;
		@Pc(21) int local21;
		if (arg1 != arg2 || arg3 != arg4) {
			for (local17 = arg1; local17 <= arg2; local17++) {
				for (local21 = arg3; local21 <= arg4; local21++) {
					if (this.anIntArrayArrayArray1[arg0][local17][local21] == -Static10.anInt364) {
						return false;
					}
				}
			}
			local21 = (arg1 << 7) + 1;
			@Pc(156) int local156 = (arg3 << 7) + 2;
			@Pc(167) int local167 = this.anIntArrayArrayArray2[arg0][arg1][arg3] - arg5;
			if (!this.method353(local21, local167, local156)) {
				return false;
			}
			@Pc(181) int local181 = (arg2 << 7) - 1;
			if (!this.method353(local181, local167, local156)) {
				return false;
			}
			@Pc(195) int local195 = (arg4 << 7) - 1;
			if (!this.method353(local21, local167, local195)) {
				return false;
			} else if (this.method353(local181, local167, local195)) {
				return true;
			} else {
				return false;
			}
		} else if (this.method314(arg0, arg1, arg3)) {
			local17 = arg1 << 7;
			local21 = arg3 << 7;
			return this.method353(local17 + 1, this.anIntArrayArrayArray2[arg0][arg1][arg3] - arg5, local21 + 1) && this.method353(local17 + 128 - 1, this.anIntArrayArrayArray2[arg0][arg1 + 1][arg3] - arg5, local21 + 1) && this.method353(local17 + 128 - 1, this.anIntArrayArrayArray2[arg0][arg1 + 1][arg3 + 1] - arg5, local21 + 128 - 1) && this.method353(local17 + 1, this.anIntArrayArrayArray2[arg0][arg1][arg3 + 1] - arg5, local21 + 128 - 1);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!be", name = "b", descriptor = "(IIIIIIII)Z")
	private boolean method328(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
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

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(Lclient!ob;IIIIIII)V")
	private void method329(@OriginalArg(0) Class51 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(6) int local6;
		@Pc(7) int local7 = local6 = (arg6 << 7) - Static10.anInt379;
		@Pc(14) int local14;
		@Pc(15) int local15 = local14 = (arg7 << 7) - Static10.anInt367;
		@Pc(20) int local20;
		@Pc(21) int local21 = local20 = local7 + 128;
		@Pc(26) int local26;
		@Pc(27) int local27 = local26 = local15 + 128;
		@Pc(38) int local38 = this.anIntArrayArrayArray2[arg1][arg6][arg7] - Static10.anInt361;
		@Pc(51) int local51 = this.anIntArrayArrayArray2[arg1][arg6 + 1][arg7] - Static10.anInt361;
		@Pc(66) int local66 = this.anIntArrayArrayArray2[arg1][arg6 + 1][arg7 + 1] - Static10.anInt361;
		@Pc(79) int local79 = this.anIntArrayArrayArray2[arg1][arg6][arg7 + 1] - Static10.anInt361;
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
		@Pc(279) int local279 = Static91.anInt2376 + (local101 << 9) / local121;
		@Pc(287) int local287 = Static91.anInt2375 + (local123 << 9) / local121;
		@Pc(295) int local295 = Static91.anInt2376 + (local21 << 9) / local169;
		@Pc(303) int local303 = Static91.anInt2375 + (local51 << 9) / local169;
		@Pc(311) int local311 = Static91.anInt2376 + (local197 << 9) / local27;
		@Pc(319) int local319 = Static91.anInt2375 + (local66 << 9) / local27;
		@Pc(327) int local327 = Static91.anInt2376 + (local245 << 9) / local265;
		@Pc(335) int local335 = Static91.anInt2375 + (local89 << 9) / local265;
		Static91.anInt2377 = 0;
		@Pc(472) int local472;
		if ((local311 - local327) * (local303 - local335) - (local319 - local335) * (local295 - local327) > 0) {
			Static91.aBoolean101 = false;
			if (local311 < 0 || local327 < 0 || local295 < 0 || local311 > Static91.anInt2374 || local327 > Static91.anInt2374 || local295 > Static91.anInt2374) {
				Static91.aBoolean101 = true;
			}
			if (Static10.aBoolean15 && this.method328(Static10.anInt353, Static10.anInt375, local319, local335, local303, local311, local327, local295)) {
				Static10.anInt377 = arg6;
				Static10.anInt357 = arg7;
			}
			if (arg0.anInt2159 == -1) {
				if (arg0.anInt2154 != 12345678) {
					Static91.method1683(local319, local335, local303, local311, local327, local295, arg0.anInt2154, arg0.anInt2156, arg0.anInt2157);
				}
			} else if (Static10.aBoolean14) {
				local472 = Static91.anInterface2_1.method1699(arg0.anInt2159);
				Static91.method1683(local319, local335, local303, local311, local327, local295, Static10.method350(local472, arg0.anInt2154), Static10.method350(local472, arg0.anInt2156), Static10.method350(local472, arg0.anInt2157));
			} else if (arg0.aBoolean90) {
				Static91.method1692(local319, local335, local303, local311, local327, local295, arg0.anInt2154, arg0.anInt2156, arg0.anInt2157, local101, local21, local245, local123, local51, local89, local121, local169, local265, arg0.anInt2159);
			} else {
				Static91.method1692(local319, local335, local303, local311, local327, local295, arg0.anInt2154, arg0.anInt2156, arg0.anInt2157, local197, local245, local21, local66, local89, local51, local27, local265, local169, arg0.anInt2159);
			}
		}
		if ((local279 - local295) * (local335 - local303) - (local287 - local303) * (local327 - local295) <= 0) {
			return;
		}
		Static91.aBoolean101 = false;
		if (local279 < 0 || local295 < 0 || local327 < 0 || local279 > Static91.anInt2374 || local295 > Static91.anInt2374 || local327 > Static91.anInt2374) {
			Static91.aBoolean101 = true;
		}
		if (Static10.aBoolean15 && this.method328(Static10.anInt353, Static10.anInt375, local287, local303, local335, local279, local295, local327)) {
			Static10.anInt377 = arg6;
			Static10.anInt357 = arg7;
		}
		if (arg0.anInt2159 != -1) {
			if (!Static10.aBoolean14) {
				Static91.method1692(local287, local303, local335, local279, local295, local327, arg0.anInt2158, arg0.anInt2157, arg0.anInt2156, local101, local21, local245, local123, local51, local89, local121, local169, local265, arg0.anInt2159);
				return;
			}
			local472 = Static91.anInterface2_1.method1699(arg0.anInt2159);
			Static91.method1683(local287, local303, local335, local279, local295, local327, Static10.method350(local472, arg0.anInt2158), Static10.method350(local472, arg0.anInt2157), Static10.method350(local472, arg0.anInt2156));
		} else if (arg0.anInt2158 != 12345678) {
			Static91.method1683(local287, local303, local335, local279, local295, local327, arg0.anInt2158, arg0.anInt2157, arg0.anInt2156);
			return;
		}
	}

	@OriginalMember(owner = "client!be", name = "h", descriptor = "(III)Lclient!f;")
	public Class21 method330(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class1_Sub20 local8 = this.aClass1_Sub20ArrayArrayArray1[arg0][arg1][arg2];
		return local8 == null ? null : local8.aClass21_1;
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(II)V")
	public void method331(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class1_Sub20 local8 = this.aClass1_Sub20ArrayArrayArray1[0][arg0][arg1];
		for (@Pc(10) int local10 = 0; local10 < 3; local10++) {
			@Pc(31) Class1_Sub20 local31 = this.aClass1_Sub20ArrayArrayArray1[local10][arg0][arg1] = this.aClass1_Sub20ArrayArrayArray1[local10 + 1][arg0][arg1];
			if (local31 != null) {
				local31.anInt2463--;
				for (@Pc(41) int local41 = 0; local41 < local31.anInt2465; local41++) {
					@Pc(47) Class73 local47 = local31.aClass73Array3[local41];
					if ((local47.anInt2753 >> 29 & 0x3) == 2 && local47.anInt2740 == arg0 && local47.anInt2747 == arg1) {
						local47.anInt2741--;
					}
				}
			}
		}
		if (this.aClass1_Sub20ArrayArrayArray1[0][arg0][arg1] == null) {
			this.aClass1_Sub20ArrayArrayArray1[0][arg0][arg1] = new Class1_Sub20(0, arg0, arg1);
		}
		this.aClass1_Sub20ArrayArrayArray1[0][arg0][arg1].aClass1_Sub20_1 = local8;
		this.aClass1_Sub20ArrayArrayArray1[3][arg0][arg1] = null;
	}

	@OriginalMember(owner = "client!be", name = "i", descriptor = "(III)V")
	public void method332(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class1_Sub20 local8 = this.aClass1_Sub20ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 == null) {
			return;
		}
		for (@Pc(13) int local13 = 0; local13 < local8.anInt2465; local13++) {
			@Pc(19) Class73 local19 = local8.aClass73Array3[local13];
			if ((local19.anInt2753 >> 29 & 0x3) == 2 && local19.anInt2740 == arg1 && local19.anInt2747 == arg2) {
				this.method312(local19);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(IIIIIIIIIIIIIIIIIIII)V")
	public void method333(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int arg15, @OriginalArg(16) int arg16, @OriginalArg(17) int arg17, @OriginalArg(18) int arg18, @OriginalArg(19) int arg19) {
		@Pc(12) Class51 local12;
		@Pc(14) int local14;
		if (arg3 == 0) {
			local12 = new Class51(arg10, arg11, arg12, arg13, -1, arg18, false);
			for (local14 = arg0; local14 >= 0; local14--) {
				if (this.aClass1_Sub20ArrayArrayArray1[local14][arg1][arg2] == null) {
					this.aClass1_Sub20ArrayArrayArray1[local14][arg1][arg2] = new Class1_Sub20(local14, arg1, arg2);
				}
			}
			this.aClass1_Sub20ArrayArrayArray1[arg0][arg1][arg2].aClass51_1 = local12;
		} else if (arg3 == 1) {
			local12 = new Class51(arg14, arg15, arg16, arg17, arg5, arg19, arg6 == arg7 && arg6 == arg8 && arg6 == arg9);
			for (local14 = arg0; local14 >= 0; local14--) {
				if (this.aClass1_Sub20ArrayArrayArray1[local14][arg1][arg2] == null) {
					this.aClass1_Sub20ArrayArrayArray1[local14][arg1][arg2] = new Class1_Sub20(local14, arg1, arg2);
				}
			}
			this.aClass1_Sub20ArrayArrayArray1[arg0][arg1][arg2].aClass51_1 = local12;
		} else {
			@Pc(140) Class68 local140 = new Class68(arg3, arg4, arg5, arg1, arg2, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17, arg18, arg19);
			for (local14 = arg0; local14 >= 0; local14--) {
				if (this.aClass1_Sub20ArrayArrayArray1[local14][arg1][arg2] == null) {
					this.aClass1_Sub20ArrayArrayArray1[local14][arg1][arg2] = new Class1_Sub20(local14, arg1, arg2);
				}
			}
			this.aClass1_Sub20ArrayArrayArray1[arg0][arg1][arg2].aClass68_1 = local140;
		}
	}

	@OriginalMember(owner = "client!be", name = "e", descriptor = "(IIII)V")
	public void method334(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(8) Class1_Sub20 local8 = this.aClass1_Sub20ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 != null) {
			this.aClass1_Sub20ArrayArrayArray1[arg0][arg1][arg2].anInt2464 = arg3;
		}
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(IIIILclient!wc;II)V")
	public void method335(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class1_Sub1_Sub1 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (arg4 == null) {
			return;
		}
		@Pc(6) Class82 local6 = new Class82();
		local6.aClass1_Sub1_Sub1_9 = arg4;
		local6.anInt2926 = arg1 * 128 + 64;
		local6.anInt2928 = arg2 * 128 + 64;
		local6.anInt2929 = arg3;
		local6.anInt2931 = arg5;
		local6.anInt2927 = arg6;
		if (this.aClass1_Sub20ArrayArrayArray1[arg0][arg1][arg2] == null) {
			this.aClass1_Sub20ArrayArrayArray1[arg0][arg1][arg2] = new Class1_Sub20(arg0, arg1, arg2);
		}
		this.aClass1_Sub20ArrayArrayArray1[arg0][arg1][arg2].aClass82_1 = local6;
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(Lclient!ra;Z)V")
	private void method336(@OriginalArg(0) Class1_Sub20 arg0, @OriginalArg(1) boolean arg1) {
		Static10.aClass61_4.method1754(arg0);
		while (true) {
			@Pc(8) Class1_Sub20 local8;
			@Pc(17) int local17;
			@Pc(20) int local20;
			@Pc(23) int local23;
			@Pc(26) int local26;
			@Pc(31) Class1_Sub20[][] local31;
			@Pc(49) Class1_Sub20 local49;
			@Pc(251) int local251;
			@Pc(592) int local592;
			@Pc(597) int local597;
			@Pc(602) int local602;
			@Pc(919) Class21 local919;
			@Pc(1093) int local1093;
			@Pc(978) int local978;
			do {
				do {
					do {
						do {
							do {
								do {
									while (true) {
										@Pc(257) Class73 var12;
										@Pc(605) int var17;
										@Pc(614) int var18;
										@Pc(626) int var19;
										@Pc(345) int var21;
										@Pc(289) boolean var22;
										@Pc(800) Class1_Sub20 var33;
										while (true) {
											do {
												local8 = (Class1_Sub20) Static10.aClass61_4.method1756();
												if (local8 == null) {
													return;
												}
											} while (!local8.aBoolean104);
											local17 = local8.anInt2468;
											local20 = local8.anInt2459;
											local23 = local8.anInt2463;
											local26 = local8.anInt2458;
											local31 = this.aClass1_Sub20ArrayArrayArray1[local23];
											if (!local8.aBoolean106) {
												break;
											}
											if (arg1) {
												if (local23 > 0) {
													local49 = this.aClass1_Sub20ArrayArrayArray1[local23 - 1][local17][local20];
													if (local49 != null && local49.aBoolean104) {
														continue;
													}
												}
												if (local17 <= Static10.anInt362 && local17 > Static10.anInt372) {
													local49 = local31[local17 - 1][local20];
													if (local49 != null && local49.aBoolean104 && (local49.aBoolean106 || (local8.anInt2467 & 0x1) == 0)) {
														continue;
													}
												}
												if (local17 >= Static10.anInt362 && local17 < Static10.anInt360 - 1) {
													local49 = local31[local17 + 1][local20];
													if (local49 != null && local49.aBoolean104 && (local49.aBoolean106 || (local8.anInt2467 & 0x4) == 0)) {
														continue;
													}
												}
												if (local20 <= Static10.anInt370 && local20 > Static10.anInt369) {
													local49 = local31[local17][local20 - 1];
													if (local49 != null && local49.aBoolean104 && (local49.aBoolean106 || (local8.anInt2467 & 0x8) == 0)) {
														continue;
													}
												}
												if (local20 >= Static10.anInt370 && local20 < Static10.anInt354 - 1) {
													local49 = local31[local17][local20 + 1];
													if (local49 != null && local49.aBoolean104 && (local49.aBoolean106 || (local8.anInt2467 & 0x2) == 0)) {
														continue;
													}
												}
											} else {
												arg1 = true;
											}
											local8.aBoolean106 = false;
											if (local8.aClass1_Sub20_1 != null) {
												local49 = local8.aClass1_Sub20_1;
												if (local49.aClass51_1 == null) {
													if (local49.aClass68_1 != null && !this.method314(0, local17, local20)) {
														this.method324(local49.aClass68_1, Static10.anInt359, Static10.anInt365, Static10.anInt358, Static10.anInt356, local17, local20);
													}
												} else if (!this.method314(0, local17, local20)) {
													this.method329(local49.aClass51_1, 0, Static10.anInt359, Static10.anInt365, Static10.anInt358, Static10.anInt356, local17, local20);
												}
												@Pc(225) Class21 local225 = local49.aClass21_1;
												if (local225 != null) {
													local225.aClass1_Sub1_Sub1_4.method1895(0, Static10.anInt359, Static10.anInt365, Static10.anInt358, Static10.anInt356, local225.anInt740 - Static10.anInt379, local225.anInt744 - Static10.anInt361, local225.anInt733 - Static10.anInt367, local225.anInt732);
												}
												for (local251 = 0; local251 < local49.anInt2465; local251++) {
													var12 = local49.aClass73Array3[local251];
													if (var12 != null) {
														var12.aClass1_Sub1_Sub1_8.method1895(var12.anInt2748, Static10.anInt359, Static10.anInt365, Static10.anInt358, Static10.anInt356, var12.anInt2739 - Static10.anInt379, var12.anInt2751 - Static10.anInt361, var12.anInt2752 - Static10.anInt367, var12.anInt2753);
													}
												}
											}
											var22 = false;
											if (local8.aClass51_1 == null) {
												if (local8.aClass68_1 != null && !this.method314(local26, local17, local20)) {
													var22 = true;
													this.method324(local8.aClass68_1, Static10.anInt359, Static10.anInt365, Static10.anInt358, Static10.anInt356, local17, local20);
												}
											} else if (!this.method314(local26, local17, local20)) {
												var22 = true;
												if (local8.aClass51_1.anInt2154 != 12345678 || Static10.aBoolean15 && local23 <= Static10.anInt371) {
													this.method329(local8.aClass51_1, local26, Static10.anInt359, Static10.anInt365, Static10.anInt358, Static10.anInt356, local17, local20);
												}
											}
											var21 = 0;
											local251 = 0;
											@Pc(350) Class21 local350 = local8.aClass21_1;
											@Pc(353) Class41 local353 = local8.aClass41_1;
											if (local350 != null || local353 != null) {
												if (Static10.anInt362 == local17) {
													var21++;
												} else if (Static10.anInt362 < local17) {
													var21 += 2;
												}
												if (Static10.anInt370 == local20) {
													var21 += 3;
												} else if (Static10.anInt370 > local20) {
													var21 += 6;
												}
												local251 = Static10.anIntArray63[var21];
												local8.anInt2469 = Static10.anIntArray62[var21];
											}
											if (local350 != null) {
												if ((local350.anInt735 & Static10.anIntArray64[var21]) == 0) {
													local8.anInt2470 = 0;
												} else if (local350.anInt735 == 16) {
													local8.anInt2470 = 3;
													local8.anInt2460 = Static10.anIntArray59[var21];
													local8.anInt2462 = 3 - local8.anInt2460;
												} else if (local350.anInt735 == 32) {
													local8.anInt2470 = 6;
													local8.anInt2460 = Static10.anIntArray61[var21];
													local8.anInt2462 = 6 - local8.anInt2460;
												} else if (local350.anInt735 == 64) {
													local8.anInt2470 = 12;
													local8.anInt2460 = Static10.anIntArray65[var21];
													local8.anInt2462 = 12 - local8.anInt2460;
												} else {
													local8.anInt2470 = 9;
													local8.anInt2460 = Static10.anIntArray60[var21];
													local8.anInt2462 = 9 - local8.anInt2460;
												}
												if ((local350.anInt735 & local251) != 0 && !this.method307(local26, local17, local20, local350.anInt735)) {
													local350.aClass1_Sub1_Sub1_4.method1895(0, Static10.anInt359, Static10.anInt365, Static10.anInt358, Static10.anInt356, local350.anInt740 - Static10.anInt379, local350.anInt744 - Static10.anInt361, local350.anInt733 - Static10.anInt367, local350.anInt732);
												}
												if ((local350.anInt738 & local251) != 0 && !this.method307(local26, local17, local20, local350.anInt738)) {
													local350.aClass1_Sub1_Sub1_5.method1895(0, Static10.anInt359, Static10.anInt365, Static10.anInt358, Static10.anInt356, local350.anInt740 - Static10.anInt379, local350.anInt744 - Static10.anInt361, local350.anInt733 - Static10.anInt367, local350.anInt732);
												}
											}
											if (local353 != null && !this.method304(local26, local17, local20, local353.aClass1_Sub1_Sub1_6.anInt2699)) {
												if ((local353.anInt1860 & local251) != 0) {
													local353.aClass1_Sub1_Sub1_6.method1895(0, Static10.anInt359, Static10.anInt365, Static10.anInt358, Static10.anInt356, local353.anInt1851 + local353.anInt1856 - Static10.anInt379, local353.anInt1855 - Static10.anInt361, local353.anInt1854 + local353.anInt1863 - Static10.anInt367, local353.anInt1862);
												} else if (local353.anInt1860 == 256) {
													local592 = local353.anInt1851 - Static10.anInt379;
													local597 = local353.anInt1855 - Static10.anInt361;
													local602 = local353.anInt1854 - Static10.anInt367;
													var17 = local353.anInt1852;
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
														local353.aClass1_Sub1_Sub1_6.method1895(0, Static10.anInt359, Static10.anInt365, Static10.anInt358, Static10.anInt356, local592 + local353.anInt1856, local597, local602 + local353.anInt1863, local353.anInt1862);
													} else if (local353.aClass1_Sub1_Sub1_7 != null) {
														local353.aClass1_Sub1_Sub1_7.method1895(0, Static10.anInt359, Static10.anInt365, Static10.anInt358, Static10.anInt356, local592, local597, local602, local353.anInt1862);
													}
												}
											}
											if (var22) {
												@Pc(673) Class82 local673 = local8.aClass82_1;
												if (local673 != null) {
													local673.aClass1_Sub1_Sub1_9.method1895(0, Static10.anInt359, Static10.anInt365, Static10.anInt358, Static10.anInt356, local673.anInt2926 - Static10.anInt379, local673.anInt2929 - Static10.anInt361, local673.anInt2928 - Static10.anInt367, local673.anInt2931);
												}
												@Pc(700) Class15 local700 = local8.aClass15_1;
												if (local700 != null && local700.anInt614 == 0) {
													if (local700.aClass1_Sub1_Sub1_3 != null) {
														local700.aClass1_Sub1_Sub1_3.method1895(0, Static10.anInt359, Static10.anInt365, Static10.anInt358, Static10.anInt356, local700.anInt615 - Static10.anInt379, local700.anInt617 - Static10.anInt361, local700.anInt611 - Static10.anInt367, local700.anInt613);
													}
													if (local700.aClass1_Sub1_Sub1_1 != null) {
														local700.aClass1_Sub1_Sub1_1.method1895(0, Static10.anInt359, Static10.anInt365, Static10.anInt358, Static10.anInt356, local700.anInt615 - Static10.anInt379, local700.anInt617 - Static10.anInt361, local700.anInt611 - Static10.anInt367, local700.anInt613);
													}
													if (local700.aClass1_Sub1_Sub1_2 != null) {
														local700.aClass1_Sub1_Sub1_2.method1895(0, Static10.anInt359, Static10.anInt365, Static10.anInt358, Static10.anInt356, local700.anInt615 - Static10.anInt379, local700.anInt617 - Static10.anInt361, local700.anInt611 - Static10.anInt367, local700.anInt613);
													}
												}
											}
											local592 = local8.anInt2467;
											if (local592 != 0) {
												if (local17 < Static10.anInt362 && (local592 & 0x4) != 0) {
													var33 = local31[local17 + 1][local20];
													if (var33 != null && var33.aBoolean104) {
														Static10.aClass61_4.method1754(var33);
													}
												}
												if (local20 < Static10.anInt370 && (local592 & 0x2) != 0) {
													var33 = local31[local17][local20 + 1];
													if (var33 != null && var33.aBoolean104) {
														Static10.aClass61_4.method1754(var33);
													}
												}
												if (local17 > Static10.anInt362 && (local592 & 0x1) != 0) {
													var33 = local31[local17 - 1][local20];
													if (var33 != null && var33.aBoolean104) {
														Static10.aClass61_4.method1754(var33);
													}
												}
												if (local20 > Static10.anInt370 && (local592 & 0x8) != 0) {
													var33 = local31[local17][local20 - 1];
													if (var33 != null && var33.aBoolean104) {
														Static10.aClass61_4.method1754(var33);
													}
												}
											}
											break;
										}
										if (local8.anInt2470 != 0) {
											var22 = true;
											for (var21 = 0; var21 < local8.anInt2465; var21++) {
												if (local8.aClass73Array3[var21].anInt2746 != Static10.anInt364 && (local8.anIntArray418[var21] & local8.anInt2470) == local8.anInt2460) {
													var22 = false;
													break;
												}
											}
											if (var22) {
												local919 = local8.aClass21_1;
												if (!this.method307(local26, local17, local20, local919.anInt735)) {
													local919.aClass1_Sub1_Sub1_4.method1895(0, Static10.anInt359, Static10.anInt365, Static10.anInt358, Static10.anInt356, local919.anInt740 - Static10.anInt379, local919.anInt744 - Static10.anInt361, local919.anInt733 - Static10.anInt367, local919.anInt732);
												}
												local8.anInt2470 = 0;
											}
										}
										if (!local8.aBoolean105) {
											break;
										}
										try {
											@Pc(958) int local958 = local8.anInt2465;
											local8.aBoolean105 = false;
											var21 = 0;
											label558: for (local251 = 0; local251 < local958; local251++) {
												var12 = local8.aClass73Array3[local251];
												if (var12.anInt2746 != Static10.anInt364) {
													for (local978 = var12.anInt2740; local978 <= var12.anInt2750; local978++) {
														for (local592 = var12.anInt2747; local592 <= var12.anInt2745; local592++) {
															var33 = local31[local978][local592];
															if (var33.aBoolean106) {
																local8.aBoolean105 = true;
																continue label558;
															}
															if (var33.anInt2470 != 0) {
																local602 = 0;
																if (local978 > var12.anInt2740) {
																	local602++;
																}
																if (local978 < var12.anInt2750) {
																	local602 += 4;
																}
																if (local592 > var12.anInt2747) {
																	local602 += 8;
																}
																if (local592 < var12.anInt2745) {
																	local602 += 2;
																}
																if ((local602 & var33.anInt2470) == local8.anInt2462) {
																	local8.aBoolean105 = true;
																	continue label558;
																}
															}
														}
													}
													Static10.aClass73Array1[var21++] = var12;
													local592 = Static10.anInt362 - var12.anInt2740;
													local597 = var12.anInt2750 - Static10.anInt362;
													if (local597 > local592) {
														local592 = local597;
													}
													local602 = Static10.anInt370 - var12.anInt2747;
													var17 = var12.anInt2745 - Static10.anInt370;
													if (var17 > local602) {
														var12.anInt2744 = local592 + var17;
													} else {
														var12.anInt2744 = local592 + local602;
													}
												}
											}
											while (var21 > 0) {
												local1093 = -50;
												local978 = -1;
												@Pc(1102) Class73 local1102;
												for (local592 = 0; local592 < var21; local592++) {
													local1102 = Static10.aClass73Array1[local592];
													if (local1102.anInt2746 != Static10.anInt364) {
														if (local1102.anInt2744 > local1093) {
															local1093 = local1102.anInt2744;
															local978 = local592;
														} else if (local1102.anInt2744 == local1093) {
															local602 = local1102.anInt2739 - Static10.anInt379;
															var17 = local1102.anInt2752 - Static10.anInt367;
															var18 = Static10.aClass73Array1[local978].anInt2739 - Static10.anInt379;
															var19 = Static10.aClass73Array1[local978].anInt2752 - Static10.anInt367;
															if (local602 * local602 + var17 * var17 > var18 * var18 + var19 * var19) {
																local978 = local592;
															}
														}
													}
												}
												if (local978 == -1) {
													break;
												}
												local1102 = Static10.aClass73Array1[local978];
												local1102.anInt2746 = Static10.anInt364;
												if (!this.method326(local26, local1102.anInt2740, local1102.anInt2750, local1102.anInt2747, local1102.anInt2745, local1102.aClass1_Sub1_Sub1_8.anInt2699)) {
													local1102.aClass1_Sub1_Sub1_8.method1895(local1102.anInt2748, Static10.anInt359, Static10.anInt365, Static10.anInt358, Static10.anInt356, local1102.anInt2739 - Static10.anInt379, local1102.anInt2751 - Static10.anInt361, local1102.anInt2752 - Static10.anInt367, local1102.anInt2753);
												}
												for (local602 = local1102.anInt2740; local602 <= local1102.anInt2750; local602++) {
													for (var17 = local1102.anInt2747; var17 <= local1102.anInt2745; var17++) {
														@Pc(1227) Class1_Sub20 local1227 = local31[local602][var17];
														if (local1227.anInt2470 != 0) {
															Static10.aClass61_4.method1754(local1227);
														} else if ((local602 != local17 || var17 != local20) && local1227.aBoolean104) {
															Static10.aClass61_4.method1754(local1227);
														}
													}
												}
											}
											if (!local8.aBoolean105) {
												break;
											}
										} catch (@Pc(1265) Exception local1265) {
											local8.aBoolean105 = false;
											break;
										}
									}
								} while (!local8.aBoolean104);
							} while (local8.anInt2470 != 0);
							if (local17 > Static10.anInt362 || local17 <= Static10.anInt372) {
								break;
							}
							local49 = local31[local17 - 1][local20];
						} while (local49 != null && local49.aBoolean104);
						if (local17 < Static10.anInt362 || local17 >= Static10.anInt360 - 1) {
							break;
						}
						local49 = local31[local17 + 1][local20];
					} while (local49 != null && local49.aBoolean104);
					if (local20 > Static10.anInt370 || local20 <= Static10.anInt369) {
						break;
					}
					local49 = local31[local17][local20 - 1];
				} while (local49 != null && local49.aBoolean104);
				if (local20 < Static10.anInt370 || local20 >= Static10.anInt354 - 1) {
					break;
				}
				local49 = local31[local17][local20 + 1];
			} while (local49 != null && local49.aBoolean104);
			local8.aBoolean104 = false;
			Static10.anInt368--;
			@Pc(1369) Class15 local1369 = local8.aClass15_1;
			if (local1369 != null && local1369.anInt614 != 0) {
				if (local1369.aClass1_Sub1_Sub1_3 != null) {
					local1369.aClass1_Sub1_Sub1_3.method1895(0, Static10.anInt359, Static10.anInt365, Static10.anInt358, Static10.anInt356, local1369.anInt615 - Static10.anInt379, local1369.anInt617 - Static10.anInt361 - local1369.anInt614, local1369.anInt611 - Static10.anInt367, local1369.anInt613);
				}
				if (local1369.aClass1_Sub1_Sub1_1 != null) {
					local1369.aClass1_Sub1_Sub1_1.method1895(0, Static10.anInt359, Static10.anInt365, Static10.anInt358, Static10.anInt356, local1369.anInt615 - Static10.anInt379, local1369.anInt617 - Static10.anInt361 - local1369.anInt614, local1369.anInt611 - Static10.anInt367, local1369.anInt613);
				}
				if (local1369.aClass1_Sub1_Sub1_2 != null) {
					local1369.aClass1_Sub1_Sub1_2.method1895(0, Static10.anInt359, Static10.anInt365, Static10.anInt358, Static10.anInt356, local1369.anInt615 - Static10.anInt379, local1369.anInt617 - Static10.anInt361 - local1369.anInt614, local1369.anInt611 - Static10.anInt367, local1369.anInt613);
				}
			}
			if (local8.anInt2469 != 0) {
				@Pc(1464) Class41 local1464 = local8.aClass41_1;
				if (local1464 != null && !this.method304(local26, local17, local20, local1464.aClass1_Sub1_Sub1_6.anInt2699)) {
					if ((local1464.anInt1860 & local8.anInt2469) != 0) {
						local1464.aClass1_Sub1_Sub1_6.method1895(0, Static10.anInt359, Static10.anInt365, Static10.anInt358, Static10.anInt356, local1464.anInt1851 + local1464.anInt1856 - Static10.anInt379, local1464.anInt1855 - Static10.anInt361, local1464.anInt1854 + local1464.anInt1863 - Static10.anInt367, local1464.anInt1862);
					} else if (local1464.anInt1860 == 256) {
						local251 = local1464.anInt1851 - Static10.anInt379;
						local1093 = local1464.anInt1855 - Static10.anInt361;
						local978 = local1464.anInt1854 - Static10.anInt367;
						local592 = local1464.anInt1852;
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
							local1464.aClass1_Sub1_Sub1_6.method1895(0, Static10.anInt359, Static10.anInt365, Static10.anInt358, Static10.anInt356, local251 + local1464.anInt1856, local1093, local978 + local1464.anInt1863, local1464.anInt1862);
						} else if (local1464.aClass1_Sub1_Sub1_7 != null) {
							local1464.aClass1_Sub1_Sub1_7.method1895(0, Static10.anInt359, Static10.anInt365, Static10.anInt358, Static10.anInt356, local251, local1093, local978, local1464.anInt1862);
						}
					}
				}
				local919 = local8.aClass21_1;
				if (local919 != null) {
					if ((local919.anInt738 & local8.anInt2469) != 0 && !this.method307(local26, local17, local20, local919.anInt738)) {
						local919.aClass1_Sub1_Sub1_5.method1895(0, Static10.anInt359, Static10.anInt365, Static10.anInt358, Static10.anInt356, local919.anInt740 - Static10.anInt379, local919.anInt744 - Static10.anInt361, local919.anInt733 - Static10.anInt367, local919.anInt732);
					}
					if ((local919.anInt735 & local8.anInt2469) != 0 && !this.method307(local26, local17, local20, local919.anInt735)) {
						local919.aClass1_Sub1_Sub1_4.method1895(0, Static10.anInt359, Static10.anInt365, Static10.anInt358, Static10.anInt356, local919.anInt740 - Static10.anInt379, local919.anInt744 - Static10.anInt361, local919.anInt733 - Static10.anInt367, local919.anInt732);
					}
				}
			}
			@Pc(1689) Class1_Sub20 local1689;
			if (local23 < this.anInt373 - 1) {
				local1689 = this.aClass1_Sub20ArrayArrayArray1[local23 + 1][local17][local20];
				if (local1689 != null && local1689.aBoolean104) {
					Static10.aClass61_4.method1754(local1689);
				}
			}
			if (local17 < Static10.anInt362) {
				local1689 = local31[local17 + 1][local20];
				if (local1689 != null && local1689.aBoolean104) {
					Static10.aClass61_4.method1754(local1689);
				}
			}
			if (local20 < Static10.anInt370) {
				local1689 = local31[local17][local20 + 1];
				if (local1689 != null && local1689.aBoolean104) {
					Static10.aClass61_4.method1754(local1689);
				}
			}
			if (local17 > Static10.anInt362) {
				local1689 = local31[local17 - 1][local20];
				if (local1689 != null && local1689.aBoolean104) {
					Static10.aClass61_4.method1754(local1689);
				}
			}
			if (local20 > Static10.anInt370) {
				local1689 = local31[local17][local20 - 1];
				if (local1689 != null && local1689.aBoolean104) {
					Static10.aClass61_4.method1754(local1689);
				}
			}
		}
	}

	@OriginalMember(owner = "client!be", name = "j", descriptor = "(III)I")
	public int method337(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class1_Sub20 local8 = this.aClass1_Sub20ArrayArrayArray1[arg0][arg1][arg2];
		return local8 == null || local8.aClass21_1 == null ? 0 : local8.aClass21_1.anInt732;
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(IIIIILclient!wc;IIIIII)Z")
	public boolean method338(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) Class1_Sub1_Sub1 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		return arg4 == null ? true : this.method349(arg0, arg7, arg8, arg9 + 1 - arg7, arg10 - arg8 + 1, arg1, arg2, arg3, arg4, arg5, true, arg6, 0);
	}

	@OriginalMember(owner = "client!be", name = "c", descriptor = "()V")
	private void method339() {
		@Pc(3) int local3 = Static10.anIntArray58[Static10.anInt378];
		@Pc(7) Class48[] local7 = Static10.aClass48ArrayArray1[Static10.anInt378];
		Static10.anInt366 = 0;
		for (@Pc(11) int local11 = 0; local11 < local3; local11++) {
			@Pc(16) Class48 local16 = local7[local11];
			@Pc(27) int local27;
			@Pc(40) int local40;
			@Pc(51) int local51;
			@Pc(79) int local79;
			@Pc(58) boolean local58;
			if (local16.anInt2113 == 1) {
				local27 = local16.anInt2107 + 25 - Static10.anInt362;
				if (local27 >= 0 && local27 <= 50) {
					local40 = local16.anInt2101 + 25 - Static10.anInt370;
					if (local40 < 0) {
						local40 = 0;
					}
					local51 = local16.anInt2100 + 25 - Static10.anInt370;
					if (local51 > 50) {
						local51 = 50;
					}
					local58 = false;
					while (local40 <= local51) {
						if (Static10.aBooleanArrayArray1[local27][local40++]) {
							local58 = true;
							break;
						}
					}
					if (local58) {
						local79 = Static10.anInt379 - local16.anInt2099;
						if (local79 > 32) {
							local16.anInt2114 = 1;
						} else {
							if (local79 >= -32) {
								continue;
							}
							local16.anInt2114 = 2;
							local79 = -local79;
						}
						local16.anInt2108 = (local16.anInt2109 - Static10.anInt367 << 8) / local79;
						local16.anInt2104 = (local16.anInt2110 - Static10.anInt367 << 8) / local79;
						local16.anInt2105 = (local16.anInt2102 - Static10.anInt361 << 8) / local79;
						local16.anInt2112 = (local16.anInt2116 - Static10.anInt361 << 8) / local79;
						Static10.aClass48Array1[Static10.anInt366++] = local16;
					}
				}
			} else if (local16.anInt2113 == 2) {
				local27 = local16.anInt2101 + 25 - Static10.anInt370;
				if (local27 >= 0 && local27 <= 50) {
					local40 = local16.anInt2107 + 25 - Static10.anInt362;
					if (local40 < 0) {
						local40 = 0;
					}
					local51 = local16.anInt2098 + 25 - Static10.anInt362;
					if (local51 > 50) {
						local51 = 50;
					}
					local58 = false;
					while (local40 <= local51) {
						if (Static10.aBooleanArrayArray1[local40++][local27]) {
							local58 = true;
							break;
						}
					}
					if (local58) {
						local79 = Static10.anInt367 - local16.anInt2109;
						if (local79 > 32) {
							local16.anInt2114 = 3;
						} else {
							if (local79 >= -32) {
								continue;
							}
							local16.anInt2114 = 4;
							local79 = -local79;
						}
						local16.anInt2117 = (local16.anInt2099 - Static10.anInt379 << 8) / local79;
						local16.anInt2106 = (local16.anInt2111 - Static10.anInt379 << 8) / local79;
						local16.anInt2105 = (local16.anInt2102 - Static10.anInt361 << 8) / local79;
						local16.anInt2112 = (local16.anInt2116 - Static10.anInt361 << 8) / local79;
						Static10.aClass48Array1[Static10.anInt366++] = local16;
					}
				}
			} else if (local16.anInt2113 == 4) {
				local27 = local16.anInt2102 - Static10.anInt361;
				if (local27 > 128) {
					local40 = local16.anInt2101 + 25 - Static10.anInt370;
					if (local40 < 0) {
						local40 = 0;
					}
					local51 = local16.anInt2100 + 25 - Static10.anInt370;
					if (local51 > 50) {
						local51 = 50;
					}
					if (local40 <= local51) {
						@Pc(319) int local319 = local16.anInt2107 + 25 - Static10.anInt362;
						if (local319 < 0) {
							local319 = 0;
						}
						local79 = local16.anInt2098 + 25 - Static10.anInt362;
						if (local79 > 50) {
							local79 = 50;
						}
						@Pc(337) boolean local337 = false;
						label142: for (@Pc(339) int local339 = local319; local339 <= local79; local339++) {
							for (@Pc(342) int local342 = local40; local342 <= local51; local342++) {
								if (Static10.aBooleanArrayArray1[local339][local342]) {
									local337 = true;
									break label142;
								}
							}
						}
						if (local337) {
							local16.anInt2114 = 5;
							local16.anInt2117 = (local16.anInt2099 - Static10.anInt379 << 8) / local27;
							local16.anInt2106 = (local16.anInt2111 - Static10.anInt379 << 8) / local27;
							local16.anInt2108 = (local16.anInt2109 - Static10.anInt367 << 8) / local27;
							local16.anInt2104 = (local16.anInt2110 - Static10.anInt367 << 8) / local27;
							Static10.aClass48Array1[Static10.anInt366++] = local16;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(Lclient!td;IIIII)V")
	private void method340(@OriginalArg(0) Class1_Sub1_Sub1_Sub7 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(1) boolean local1 = true;
		@Pc(3) int local3 = arg2;
		@Pc(7) int local7 = arg2 + arg4;
		@Pc(11) int local11 = arg3 - 1;
		@Pc(15) int local15 = arg3 + arg5;
		for (@Pc(17) int local17 = arg1; local17 <= arg1 + 1; local17++) {
			if (local17 != this.anInt373) {
				for (@Pc(24) int local24 = local3; local24 <= local7; local24++) {
					if (local24 >= 0 && local24 < this.anInt363) {
						for (@Pc(34) int local34 = local11; local34 <= local15; local34++) {
							if (local34 >= 0 && local34 < this.anInt352 && (!local1 || local24 >= local7 || local34 >= local15 || local34 < arg3 && local24 != arg2)) {
								@Pc(66) Class1_Sub20 local66 = this.aClass1_Sub20ArrayArrayArray1[local17][local24][local34];
								if (local66 != null) {
									@Pc(160) int local160 = (this.anIntArrayArrayArray2[local17][local24][local34] + this.anIntArrayArrayArray2[local17][local24 + 1][local34] + this.anIntArrayArrayArray2[local17][local24][local34 + 1] + this.anIntArrayArrayArray2[local17][local24 + 1][local34 + 1]) / 4 - (this.anIntArrayArrayArray2[arg1][arg2][arg3] + this.anIntArrayArrayArray2[arg1][arg2 + 1][arg3] + this.anIntArrayArrayArray2[arg1][arg2][arg3 + 1] + this.anIntArrayArrayArray2[arg1][arg2 + 1][arg3 + 1]) / 4;
									@Pc(163) Class21 local163 = local66.aClass21_1;
									if (local163 != null) {
										@Pc(173) Class1_Sub1_Sub1_Sub7 local173;
										if (local163.aClass1_Sub1_Sub1_4 instanceof Class1_Sub1_Sub1_Sub7) {
											local173 = (Class1_Sub1_Sub1_Sub7) local163.aClass1_Sub1_Sub1_4;
											Static113.method1906(arg0, local173, (local24 - arg2) * 128 + (1 - arg4) * 64, local160, (local34 - arg3) * 128 + (1 - arg5) * 64, local1);
										}
										if (local163.aClass1_Sub1_Sub1_5 instanceof Class1_Sub1_Sub1_Sub7) {
											local173 = (Class1_Sub1_Sub1_Sub7) local163.aClass1_Sub1_Sub1_5;
											Static113.method1906(arg0, local173, (local24 - arg2) * 128 + (1 - arg4) * 64, local160, (local34 - arg3) * 128 + (1 - arg5) * 64, local1);
										}
									}
									for (@Pc(237) int local237 = 0; local237 < local66.anInt2465; local237++) {
										@Pc(243) Class73 local243 = local66.aClass73Array3[local237];
										if (local243 != null && local243.aClass1_Sub1_Sub1_8 instanceof Class1_Sub1_Sub1_Sub7) {
											@Pc(253) Class1_Sub1_Sub1_Sub7 local253 = (Class1_Sub1_Sub1_Sub7) local243.aClass1_Sub1_Sub1_8;
											@Pc(261) int local261 = local243.anInt2750 + 1 - local243.anInt2740;
											@Pc(269) int local269 = local243.anInt2745 + 1 - local243.anInt2747;
											Static113.method1906(arg0, local253, (local243.anInt2740 - arg2) * 128 + (local261 - arg4) * 64, local160, (local243.anInt2747 - arg3) * 128 + (local269 - arg5) * 64, local1);
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

	@OriginalMember(owner = "client!be", name = "k", descriptor = "(III)V")
	public void method341(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class1_Sub20 local8 = this.aClass1_Sub20ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 != null) {
			local8.aClass41_1 = null;
		}
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(IIIILclient!wc;Lclient!wc;IIIIII)V")
	public void method342(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class1_Sub1_Sub1 arg4, @OriginalArg(5) Class1_Sub1_Sub1 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11) {
		if (arg4 == null) {
			return;
		}
		@Pc(6) Class41 local6 = new Class41();
		local6.anInt1862 = arg10;
		local6.anInt1857 = arg11;
		local6.anInt1851 = arg1 * 128 + 64;
		local6.anInt1854 = arg2 * 128 + 64;
		local6.anInt1855 = arg3;
		local6.aClass1_Sub1_Sub1_6 = arg4;
		local6.aClass1_Sub1_Sub1_7 = arg5;
		local6.anInt1860 = arg6;
		local6.anInt1852 = arg7;
		local6.anInt1856 = arg8;
		local6.anInt1863 = arg9;
		for (@Pc(49) int local49 = arg0; local49 >= 0; local49--) {
			if (this.aClass1_Sub20ArrayArrayArray1[local49][arg1][arg2] == null) {
				this.aClass1_Sub20ArrayArrayArray1[local49][arg1][arg2] = new Class1_Sub20(local49, arg1, arg2);
			}
		}
		this.aClass1_Sub20ArrayArrayArray1[arg0][arg1][arg2].aClass41_1 = local6;
	}

	@OriginalMember(owner = "client!be", name = "l", descriptor = "(III)V")
	public void method343(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class1_Sub20 local8 = this.aClass1_Sub20ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 != null) {
			local8.aClass82_1 = null;
		}
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(Lclient!td;III)V")
	private void method344(@OriginalArg(0) Class1_Sub1_Sub1_Sub7 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(14) Class1_Sub20 local14;
		@Pc(29) Class1_Sub1_Sub1_Sub7 local29;
		if (arg2 < this.anInt363) {
			local14 = this.aClass1_Sub20ArrayArrayArray1[arg1][arg2 + 1][arg3];
			if (local14 != null && local14.aClass82_1 != null && local14.aClass82_1.aClass1_Sub1_Sub1_9 instanceof Class1_Sub1_Sub1_Sub7) {
				local29 = (Class1_Sub1_Sub1_Sub7) local14.aClass82_1.aClass1_Sub1_Sub1_9;
				Static113.method1906(arg0, local29, 128, 0, 0, true);
			}
		}
		if (arg3 < this.anInt363) {
			local14 = this.aClass1_Sub20ArrayArrayArray1[arg1][arg2][arg3 + 1];
			if (local14 != null && local14.aClass82_1 != null && local14.aClass82_1.aClass1_Sub1_Sub1_9 instanceof Class1_Sub1_Sub1_Sub7) {
				local29 = (Class1_Sub1_Sub1_Sub7) local14.aClass82_1.aClass1_Sub1_Sub1_9;
				Static113.method1906(arg0, local29, 0, 0, 128, true);
			}
		}
		if (arg2 < this.anInt363 && arg3 < this.anInt352) {
			local14 = this.aClass1_Sub20ArrayArrayArray1[arg1][arg2 + 1][arg3 + 1];
			if (local14 != null && local14.aClass82_1 != null && local14.aClass82_1.aClass1_Sub1_Sub1_9 instanceof Class1_Sub1_Sub1_Sub7) {
				local29 = (Class1_Sub1_Sub1_Sub7) local14.aClass82_1.aClass1_Sub1_Sub1_9;
				Static113.method1906(arg0, local29, 128, 0, 128, true);
			}
		}
		if (arg2 >= this.anInt363 || arg3 <= 0) {
			return;
		}
		local14 = this.aClass1_Sub20ArrayArrayArray1[arg1][arg2 + 1][arg3 - 1];
		if (local14 != null && local14.aClass82_1 != null && local14.aClass82_1.aClass1_Sub1_Sub1_9 instanceof Class1_Sub1_Sub1_Sub7) {
			local29 = (Class1_Sub1_Sub1_Sub7) local14.aClass82_1.aClass1_Sub1_Sub1_9;
			Static113.method1906(arg0, local29, 128, 0, -128, true);
		}
	}

	@OriginalMember(owner = "client!be", name = "m", descriptor = "(III)Lclient!ub;")
	public Class73 method345(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class1_Sub20 local8 = this.aClass1_Sub20ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 == null) {
			return null;
		}
		for (@Pc(14) int local14 = 0; local14 < local8.anInt2465; local14++) {
			@Pc(20) Class73 local20 = local8.aClass73Array3[local14];
			if ((local20.anInt2753 >> 29 & 0x3) == 2 && local20.anInt2740 == arg1 && local20.anInt2747 == arg2) {
				return local20;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!be", name = "n", descriptor = "(III)V")
	public void method346() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt373; local1++) {
			for (@Pc(4) int local4 = 0; local4 < this.anInt363; local4++) {
				for (@Pc(7) int local7 = 0; local7 < this.anInt352; local7++) {
					@Pc(17) Class1_Sub20 local17 = this.aClass1_Sub20ArrayArrayArray1[local1][local4][local7];
					if (local17 != null) {
						@Pc(22) Class21 local22 = local17.aClass21_1;
						if (local22 != null && local22.aClass1_Sub1_Sub1_4 instanceof Class1_Sub1_Sub1_Sub7) {
							@Pc(32) Class1_Sub1_Sub1_Sub7 local32 = (Class1_Sub1_Sub1_Sub7) local22.aClass1_Sub1_Sub1_4;
							this.method340(local32, local1, local4, local7, 1, 1);
							if (local22.aClass1_Sub1_Sub1_5 instanceof Class1_Sub1_Sub1_Sub7) {
								@Pc(48) Class1_Sub1_Sub1_Sub7 local48 = (Class1_Sub1_Sub1_Sub7) local22.aClass1_Sub1_Sub1_5;
								this.method340(local48, local1, local4, local7, 1, 1);
								Static113.method1906(local32, local48, 0, 0, 0, false);
								local22.aClass1_Sub1_Sub1_5 = local48.method1899(local48.aShort2, local48.aShort1, -50, -10, -50);
							}
							local22.aClass1_Sub1_Sub1_4 = local32.method1899(local32.aShort2, local32.aShort1, -50, -10, -50);
						}
						@Pc(103) Class1_Sub1_Sub1_Sub7 local103;
						for (@Pc(87) int local87 = 0; local87 < local17.anInt2465; local87++) {
							@Pc(93) Class73 local93 = local17.aClass73Array3[local87];
							if (local93 != null && local93.aClass1_Sub1_Sub1_8 instanceof Class1_Sub1_Sub1_Sub7) {
								local103 = (Class1_Sub1_Sub1_Sub7) local93.aClass1_Sub1_Sub1_8;
								this.method340(local103, local1, local4, local7, local93.anInt2750 + 1 - local93.anInt2740, local93.anInt2745 - local93.anInt2747 + 1);
								local93.aClass1_Sub1_Sub1_8 = local103.method1899(local103.aShort2, local103.aShort1, -50, -10, -50);
							}
						}
						@Pc(142) Class82 local142 = local17.aClass82_1;
						if (local142 != null && local142.aClass1_Sub1_Sub1_9 instanceof Class1_Sub1_Sub1_Sub7) {
							local103 = (Class1_Sub1_Sub1_Sub7) local142.aClass1_Sub1_Sub1_9;
							this.method344(local103, local1, local4, local7);
							local142.aClass1_Sub1_Sub1_9 = local103.method1899(local103.aShort2, local103.aShort1, -50, -10, -50);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!be", name = "d", descriptor = "()V")
	public void method347() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt355; local1++) {
			@Pc(7) Class73 local7 = this.aClass73Array2[local1];
			this.method312(local7);
			this.aClass73Array2[local1] = null;
		}
		this.anInt355 = 0;
	}

	@OriginalMember(owner = "client!be", name = "o", descriptor = "(III)Lclient!kf;")
	public Class41 method348(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class1_Sub20 local8 = this.aClass1_Sub20ArrayArrayArray1[arg0][arg1][arg2];
		return local8 == null ? null : local8.aClass41_1;
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(IIIIIIIILclient!wc;IZII)Z")
	private boolean method349(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) Class1_Sub1_Sub1 arg8, @OriginalArg(9) int arg9, @OriginalArg(10) boolean arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12) {
		for (@Pc(1) int local1 = arg1; local1 < arg1 + arg3; local1++) {
			for (@Pc(4) int local4 = arg2; local4 < arg2 + arg4; local4++) {
				if (local1 < 0 || local4 < 0 || local1 >= this.anInt363 || local4 >= this.anInt352) {
					return false;
				}
				@Pc(28) Class1_Sub20 local28 = this.aClass1_Sub20ArrayArrayArray1[arg0][local1][local4];
				if (local28 != null && local28.anInt2465 >= 5) {
					return false;
				}
			}
		}
		@Pc(52) Class73 local52 = new Class73();
		local52.anInt2753 = arg11;
		local52.anInt2737 = arg12;
		local52.anInt2741 = arg0;
		local52.anInt2739 = arg5;
		local52.anInt2752 = arg6;
		local52.anInt2751 = arg7;
		local52.aClass1_Sub1_Sub1_8 = arg8;
		local52.anInt2748 = arg9;
		local52.anInt2740 = arg1;
		local52.anInt2747 = arg2;
		local52.anInt2750 = arg1 + arg3 - 1;
		local52.anInt2745 = arg2 + arg4 - 1;
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
					if (this.aClass1_Sub20ArrayArrayArray1[local130][local98][local101] == null) {
						this.aClass1_Sub20ArrayArrayArray1[local130][local98][local101] = new Class1_Sub20(local130, local98, local101);
					}
				}
				@Pc(166) Class1_Sub20 local166 = this.aClass1_Sub20ArrayArrayArray1[arg0][local98][local101];
				local166.aClass73Array3[local166.anInt2465] = local52;
				local166.anIntArray418[local166.anInt2465] = local104;
				local166.anInt2467 |= local104;
				local166.anInt2465++;
			}
		}
		if (arg10) {
			this.aClass73Array2[this.anInt355++] = local52;
		}
		return true;
	}

	@OriginalMember(owner = "client!be", name = "p", descriptor = "(III)V")
	public void method351(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class1_Sub20 local8 = this.aClass1_Sub20ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 != null) {
			local8.aClass15_1 = null;
		}
	}

	@OriginalMember(owner = "client!be", name = "q", descriptor = "(III)I")
	public int method352(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class1_Sub20 local8 = this.aClass1_Sub20ArrayArrayArray1[arg0][arg1][arg2];
		return local8 == null || local8.aClass82_1 == null ? 0 : local8.aClass82_1.anInt2931;
	}

	@OriginalMember(owner = "client!be", name = "r", descriptor = "(III)Z")
	private boolean method353(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < Static10.anInt366; local1++) {
			@Pc(6) Class48 local6 = Static10.aClass48Array1[local1];
			@Pc(15) int local15;
			@Pc(27) int local27;
			@Pc(37) int local37;
			@Pc(47) int local47;
			@Pc(57) int local57;
			if (local6.anInt2114 == 1) {
				local15 = local6.anInt2099 - arg0;
				if (local15 > 0) {
					local27 = local6.anInt2109 + (local6.anInt2108 * local15 >> 8);
					local37 = local6.anInt2110 + (local6.anInt2104 * local15 >> 8);
					local47 = local6.anInt2102 + (local6.anInt2105 * local15 >> 8);
					local57 = local6.anInt2116 + (local6.anInt2112 * local15 >> 8);
					if (arg2 >= local27 && arg2 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt2114 == 2) {
				local15 = arg0 - local6.anInt2099;
				if (local15 > 0) {
					local27 = local6.anInt2109 + (local6.anInt2108 * local15 >> 8);
					local37 = local6.anInt2110 + (local6.anInt2104 * local15 >> 8);
					local47 = local6.anInt2102 + (local6.anInt2105 * local15 >> 8);
					local57 = local6.anInt2116 + (local6.anInt2112 * local15 >> 8);
					if (arg2 >= local27 && arg2 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt2114 == 3) {
				local15 = local6.anInt2109 - arg2;
				if (local15 > 0) {
					local27 = local6.anInt2099 + (local6.anInt2117 * local15 >> 8);
					local37 = local6.anInt2111 + (local6.anInt2106 * local15 >> 8);
					local47 = local6.anInt2102 + (local6.anInt2105 * local15 >> 8);
					local57 = local6.anInt2116 + (local6.anInt2112 * local15 >> 8);
					if (arg0 >= local27 && arg0 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt2114 == 4) {
				local15 = arg2 - local6.anInt2109;
				if (local15 > 0) {
					local27 = local6.anInt2099 + (local6.anInt2117 * local15 >> 8);
					local37 = local6.anInt2111 + (local6.anInt2106 * local15 >> 8);
					local47 = local6.anInt2102 + (local6.anInt2105 * local15 >> 8);
					local57 = local6.anInt2116 + (local6.anInt2112 * local15 >> 8);
					if (arg0 >= local27 && arg0 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt2114 == 5) {
				local15 = arg1 - local6.anInt2102;
				if (local15 > 0) {
					local27 = local6.anInt2099 + (local6.anInt2117 * local15 >> 8);
					local37 = local6.anInt2111 + (local6.anInt2106 * local15 >> 8);
					local47 = local6.anInt2109 + (local6.anInt2108 * local15 >> 8);
					local57 = local6.anInt2110 + (local6.anInt2104 * local15 >> 8);
					if (arg0 >= local27 && arg0 <= local37 && arg2 >= local47 && arg2 <= local57) {
						return true;
					}
				}
			}
		}
		return false;
	}
}
