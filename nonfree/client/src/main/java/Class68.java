import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!re")
public final class Class68 {

	@OriginalMember(owner = "client!re", name = "e", descriptor = "I")
	private int anInt3847 = 0;

	@OriginalMember(owner = "client!re", name = "q", descriptor = "[Lclient!he;")
	private final Class29[] aClass29Array2 = new Class29[5000];

	@OriginalMember(owner = "client!re", name = "i", descriptor = "I")
	private int anInt3851 = 0;

	@OriginalMember(owner = "client!re", name = "N", descriptor = "[[I")
	private final int[][] anIntArrayArray109 = new int[][] { new int[16], { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 1 }, { 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0 }, { 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1 }, { 1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 1 } };

	@OriginalMember(owner = "client!re", name = "W", descriptor = "[[I")
	private final int[][] anIntArrayArray110 = new int[][] { { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 }, { 12, 8, 4, 0, 13, 9, 5, 1, 14, 10, 6, 2, 15, 11, 7, 3 }, { 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 }, { 3, 7, 11, 15, 2, 6, 10, 14, 1, 5, 9, 13, 0, 4, 8, 12 } };

	@OriginalMember(owner = "client!re", name = "f", descriptor = "I")
	private final int anInt3848;

	@OriginalMember(owner = "client!re", name = "J", descriptor = "I")
	private final int anInt3869;

	@OriginalMember(owner = "client!re", name = "M", descriptor = "I")
	private final int anInt3871;

	@OriginalMember(owner = "client!re", name = "d", descriptor = "[[[Lclient!ng;")
	private final Class1_Sub18[][][] aClass1_Sub18ArrayArrayArray1;

	@OriginalMember(owner = "client!re", name = "n", descriptor = "[[[I")
	private final int[][][] anIntArrayArrayArray6;

	@OriginalMember(owner = "client!re", name = "I", descriptor = "[[[I")
	private final int[][][] anIntArrayArrayArray7;

	@OriginalMember(owner = "client!re", name = "<init>", descriptor = "(III[[[I)V")
	public Class68(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[][][] arg3) {
		this.anInt3848 = arg0;
		this.anInt3869 = arg1;
		this.anInt3871 = arg2;
		this.aClass1_Sub18ArrayArrayArray1 = new Class1_Sub18[arg0][arg1][arg2];
		this.anIntArrayArrayArray6 = new int[arg0][arg1 + 1][arg2 + 1];
		this.anIntArrayArrayArray7 = arg3;
		this.method2659();
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(IIIILclient!ff;Lclient!ff;IIII)V")
	public void method2611(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class1_Sub1_Sub5 arg4, @OriginalArg(5) Class1_Sub1_Sub5 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		if (arg4 == null && arg5 == null) {
			return;
		}
		@Pc(8) Class75 local8 = new Class75();
		local8.anInt4208 = arg8;
		local8.anInt4206 = arg9;
		local8.anInt4207 = arg1 * 128 + 64;
		local8.anInt4209 = arg2 * 128 + 64;
		local8.anInt4210 = arg3;
		local8.aClass1_Sub1_Sub5_5 = arg4;
		local8.aClass1_Sub1_Sub5_6 = arg5;
		local8.anInt4211 = arg6;
		local8.anInt4205 = arg7;
		for (@Pc(45) int local45 = arg0; local45 >= 0; local45--) {
			if (this.aClass1_Sub18ArrayArrayArray1[local45][arg1][arg2] == null) {
				this.aClass1_Sub18ArrayArrayArray1[local45][arg1][arg2] = new Class1_Sub18(local45, arg1, arg2);
			}
		}
		this.aClass1_Sub18ArrayArrayArray1[arg0][arg1][arg2].aClass75_1 = local8;
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(III)V")
	public void method2612(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class1_Sub18 local8 = this.aClass1_Sub18ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 == null) {
			return;
		}
		for (@Pc(13) int local13 = 0; local13 < local8.anInt3128; local13++) {
			@Pc(19) Class29 local19 = local8.aClass29Array1[local13];
			if ((local19.anInt1869 >> 29 & 0x3) == 2 && local19.anInt1873 == arg1 && local19.anInt1870 == arg2) {
				this.method2633(local19);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!re", name = "b", descriptor = "(III)V")
	public void method2613() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt3848; local1++) {
			for (@Pc(4) int local4 = 0; local4 < this.anInt3869; local4++) {
				for (@Pc(7) int local7 = 0; local7 < this.anInt3871; local7++) {
					@Pc(17) Class1_Sub18 local17 = this.aClass1_Sub18ArrayArrayArray1[local1][local4][local7];
					if (local17 != null) {
						@Pc(22) Class75 local22 = local17.aClass75_1;
						if (local22 != null && local22.aClass1_Sub1_Sub5_5 instanceof Class1_Sub1_Sub5_Sub5) {
							@Pc(32) Class1_Sub1_Sub5_Sub5 local32 = (Class1_Sub1_Sub5_Sub5) local22.aClass1_Sub1_Sub5_5;
							this.method2636(local32, local1, local4, local7, 1, 1);
							if (local22.aClass1_Sub1_Sub5_6 instanceof Class1_Sub1_Sub5_Sub5) {
								@Pc(48) Class1_Sub1_Sub5_Sub5 local48 = (Class1_Sub1_Sub5_Sub5) local22.aClass1_Sub1_Sub5_6;
								this.method2636(local48, local1, local4, local7, 1, 1);
								Static70.method1484(local32, local48, 0, 0, 0, false);
								local22.aClass1_Sub1_Sub5_6 = local48.method1472(local48.aShort1, local48.aShort2, -50, -10, -50, false);
							}
							local22.aClass1_Sub1_Sub5_5 = local32.method1472(local32.aShort1, local32.aShort2, -50, -10, -50, false);
						}
						@Pc(107) Class1_Sub1_Sub5_Sub5 local107;
						for (@Pc(91) int local91 = 0; local91 < local17.anInt3128; local91++) {
							@Pc(97) Class29 local97 = local17.aClass29Array1[local91];
							if (local97 != null && local97.aClass1_Sub1_Sub5_1 instanceof Class1_Sub1_Sub5_Sub5) {
								local107 = (Class1_Sub1_Sub5_Sub5) local97.aClass1_Sub1_Sub5_1;
								this.method2636(local107, local1, local4, local7, local97.anInt1877 + 1 - local97.anInt1873, local97.anInt1866 - local97.anInt1870 + 1);
								local97.aClass1_Sub1_Sub5_1 = local107.method1472(local107.aShort1, local107.aShort2, -50, -10, -50, false);
							}
						}
						@Pc(148) Class40 local148 = local17.aClass40_1;
						if (local148 != null && local148.aClass1_Sub1_Sub5_2 instanceof Class1_Sub1_Sub5_Sub5) {
							local107 = (Class1_Sub1_Sub5_Sub5) local148.aClass1_Sub1_Sub5_2;
							this.method2624(local107, local1, local4, local7);
							local148.aClass1_Sub1_Sub5_2 = local107.method1472(local107.aShort1, local107.aShort2, -50, -10, -50, false);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!re", name = "c", descriptor = "(III)Z")
	private boolean method2614(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) int local8 = this.anIntArrayArrayArray6[arg0][arg1][arg2];
		if (local8 == -Static138.anInt3861) {
			return false;
		} else if (local8 == Static138.anInt3861) {
			return true;
		} else {
			@Pc(23) int local23 = arg1 << 7;
			@Pc(27) int local27 = arg2 << 7;
			if (this.method2628(local23 + 1, this.anIntArrayArrayArray7[arg0][arg1][arg2], local27 + 1) && this.method2628(local23 + 128 - 1, this.anIntArrayArrayArray7[arg0][arg1 + 1][arg2], local27 + 1) && this.method2628(local23 + 128 - 1, this.anIntArrayArrayArray7[arg0][arg1 + 1][arg2 + 1], local27 + 128 - 1) && this.method2628(local23 + 1, this.anIntArrayArrayArray7[arg0][arg1][arg2 + 1], local27 + 128 - 1)) {
				this.anIntArrayArrayArray6[arg0][arg1][arg2] = Static138.anInt3861;
				return true;
			} else {
				this.anIntArrayArrayArray6[arg0][arg1][arg2] = -Static138.anInt3861;
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!re", name = "d", descriptor = "(III)V")
	public void method2615(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class1_Sub18 local8 = this.aClass1_Sub18ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 != null) {
			local8.aClass76_1 = null;
		}
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(IIIIII)Z")
	private boolean method2616(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(17) int local17;
		@Pc(21) int local21;
		if (arg1 != arg2 || arg3 != arg4) {
			for (local17 = arg1; local17 <= arg2; local17++) {
				for (local21 = arg3; local21 <= arg4; local21++) {
					if (this.anIntArrayArrayArray6[arg0][local17][local21] == -Static138.anInt3861) {
						return false;
					}
				}
			}
			local21 = (arg1 << 7) + 1;
			@Pc(156) int local156 = (arg3 << 7) + 2;
			@Pc(167) int local167 = this.anIntArrayArrayArray7[arg0][arg1][arg3] - arg5;
			if (!this.method2628(local21, local167, local156)) {
				return false;
			}
			@Pc(181) int local181 = (arg2 << 7) - 1;
			if (!this.method2628(local181, local167, local156)) {
				return false;
			}
			@Pc(195) int local195 = (arg4 << 7) - 1;
			if (!this.method2628(local21, local167, local195)) {
				return false;
			} else if (this.method2628(local181, local167, local195)) {
				return true;
			} else {
				return false;
			}
		} else if (this.method2614(arg0, arg1, arg3)) {
			local17 = arg1 << 7;
			local21 = arg3 << 7;
			return this.method2628(local17 + 1, this.anIntArrayArrayArray7[arg0][arg1][arg3] - arg5, local21 + 1) && this.method2628(local17 + 128 - 1, this.anIntArrayArrayArray7[arg0][arg1 + 1][arg3] - arg5, local21 + 1) && this.method2628(local17 + 128 - 1, this.anIntArrayArrayArray7[arg0][arg1 + 1][arg3 + 1] - arg5, local21 + 128 - 1) && this.method2628(local17 + 1, this.anIntArrayArrayArray7[arg0][arg1][arg3 + 1] - arg5, local21 + 128 - 1);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!re", name = "e", descriptor = "(III)I")
	public int method2617(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class1_Sub18 local8 = this.aClass1_Sub18ArrayArrayArray1[arg0][arg1][arg2];
		return local8 == null || local8.aClass40_1 == null ? 0 : local8.aClass40_1.anInt2747;
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(IIII)V")
	public void method2618(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(8) Class1_Sub18 local8 = this.aClass1_Sub18ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 == null) {
			return;
		}
		@Pc(14) Class42 local14 = local8.aClass42_1;
		if (local14 != null) {
			local14.anInt2870 = local14.anInt2870 * arg3 / 16;
			local14.anInt2868 = local14.anInt2868 * arg3 / 16;
		}
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(IIIILclient!ff;Lclient!ff;IIIIII)V")
	public void method2619(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class1_Sub1_Sub5 arg4, @OriginalArg(5) Class1_Sub1_Sub5 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11) {
		if (arg4 == null) {
			return;
		}
		@Pc(6) Class42 local6 = new Class42();
		local6.anInt2879 = arg10;
		local6.anInt2874 = arg11;
		local6.anInt2877 = arg1 * 128 + 64;
		local6.anInt2871 = arg2 * 128 + 64;
		local6.anInt2869 = arg3;
		local6.aClass1_Sub1_Sub5_4 = arg4;
		local6.aClass1_Sub1_Sub5_3 = arg5;
		local6.anInt2875 = arg6;
		local6.anInt2878 = arg7;
		local6.anInt2870 = arg8;
		local6.anInt2868 = arg9;
		for (@Pc(49) int local49 = arg0; local49 >= 0; local49--) {
			if (this.aClass1_Sub18ArrayArrayArray1[local49][arg1][arg2] == null) {
				this.aClass1_Sub18ArrayArrayArray1[local49][arg1][arg2] = new Class1_Sub18(local49, arg1, arg2);
			}
		}
		this.aClass1_Sub18ArrayArrayArray1[arg0][arg1][arg2].aClass42_1 = local6;
	}

	@OriginalMember(owner = "client!re", name = "f", descriptor = "(III)I")
	public int method2620(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class1_Sub18 local8 = this.aClass1_Sub18ArrayArrayArray1[arg0][arg1][arg2];
		return local8 == null || local8.aClass42_1 == null ? 0 : local8.aClass42_1.anInt2879;
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(IIIIIILclient!ff;III)Z")
	public boolean method2621(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class1_Sub1_Sub5 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		if (arg6 == null) {
			return true;
		} else {
			@Pc(11) int local11 = arg1 * 128 + arg4 * 64;
			@Pc(19) int local19 = arg2 * 128 + arg5 * 64;
			return this.method2660(arg0, arg1, arg2, arg4, arg5, local11, local19, arg3, arg6, arg7, false, arg8, arg9);
		}
	}

	@OriginalMember(owner = "client!re", name = "g", descriptor = "(III)V")
	public void method2622(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		Static138.aBoolean169 = true;
		Static138.anInt3857 = arg0;
		Static138.anInt3860 = arg1;
		Static138.anInt3865 = arg2;
		Static138.anInt3862 = -1;
		Static138.anInt3855 = -1;
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(Lclient!ra;IIIIII)V")
	private void method2623(@OriginalArg(0) Class64 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(3) int local3 = arg0.anIntArray354.length;
		@Pc(13) int local13;
		@Pc(20) int local20;
		@Pc(27) int local27;
		@Pc(37) int local37;
		for (@Pc(5) int local5 = 0; local5 < local3; local5++) {
			local13 = arg0.anIntArray354[local5] - Static138.anInt3849;
			local20 = arg0.anIntArray340[local5] - Static138.anInt3850;
			local27 = arg0.anIntArray341[local5] - Static138.anInt3864;
			local37 = local27 * arg3 + local13 * arg4 >> 16;
			@Pc(47) int local47 = local27 * arg4 - local13 * arg3 >> 16;
			@Pc(59) int local59 = local20 * arg2 - local47 * arg1 >> 16;
			@Pc(69) int local69 = local20 * arg1 + local47 * arg2 >> 16;
			if (local69 < 50) {
				return;
			}
			if (arg0.anIntArray346 != null) {
				Static134.anIntArray352[local5] = local37;
				Static134.anIntArray349[local5] = local59;
				Static134.anIntArray348[local5] = local69;
			}
			Static134.anIntArray344[local5] = Static79.anInt2433 + (local37 << 9) / local69;
			Static134.anIntArray353[local5] = Static79.anInt2439 + (local59 << 9) / local69;
		}
		Static79.anInt2440 = 0;
		local3 = arg0.anIntArray343.length;
		for (local13 = 0; local13 < local3; local13++) {
			local20 = arg0.anIntArray343[local13];
			local27 = arg0.anIntArray347[local13];
			local37 = arg0.anIntArray345[local13];
			@Pc(142) int local142 = Static134.anIntArray344[local20];
			@Pc(146) int local146 = Static134.anIntArray344[local27];
			@Pc(150) int local150 = Static134.anIntArray344[local37];
			@Pc(154) int local154 = Static134.anIntArray353[local20];
			@Pc(158) int local158 = Static134.anIntArray353[local27];
			@Pc(162) int local162 = Static134.anIntArray353[local37];
			if ((local142 - local146) * (local162 - local158) - (local154 - local158) * (local150 - local146) > 0) {
				Static79.aBoolean99 = false;
				if (local142 < 0 || local146 < 0 || local150 < 0 || local142 > Static79.anInt2435 || local146 > Static79.anInt2435 || local150 > Static79.anInt2435) {
					Static79.aBoolean99 = true;
				}
				if (Static138.aBoolean169 && this.method2639(Static138.anInt3860, Static138.anInt3865, local154, local158, local162, local142, local146, local150)) {
					Static138.anInt3862 = arg5;
					Static138.anInt3855 = arg6;
				}
				if (arg0.anIntArray346 == null || arg0.anIntArray346[local13] == -1) {
					if (arg0.anIntArray350[local13] != 12345678) {
						Static79.method1749(local154, local158, local162, local142, local146, local150, arg0.anIntArray350[local13], arg0.anIntArray351[local13], arg0.anIntArray342[local13]);
					}
				} else if (Static138.aBoolean170) {
					@Pc(364) int local364 = Static79.anInterface3_1.method3054(arg0.anIntArray346[local13]);
					Static79.method1749(local154, local158, local162, local142, local146, local150, Static138.method2658(local364, arg0.anIntArray350[local13]), Static138.method2658(local364, arg0.anIntArray351[local13]), Static138.method2658(local364, arg0.anIntArray342[local13]));
				} else if (arg0.aBoolean167) {
					Static79.method1757(local154, local158, local162, local142, local146, local150, arg0.anIntArray350[local13], arg0.anIntArray351[local13], arg0.anIntArray342[local13], Static134.anIntArray352[0], Static134.anIntArray352[1], Static134.anIntArray352[3], Static134.anIntArray349[0], Static134.anIntArray349[1], Static134.anIntArray349[3], Static134.anIntArray348[0], Static134.anIntArray348[1], Static134.anIntArray348[3], arg0.anIntArray346[local13]);
				} else {
					Static79.method1757(local154, local158, local162, local142, local146, local150, arg0.anIntArray350[local13], arg0.anIntArray351[local13], arg0.anIntArray342[local13], Static134.anIntArray352[local20], Static134.anIntArray352[local27], Static134.anIntArray352[local37], Static134.anIntArray349[local20], Static134.anIntArray349[local27], Static134.anIntArray349[local37], Static134.anIntArray348[local20], Static134.anIntArray348[local27], Static134.anIntArray348[local37], arg0.anIntArray346[local13]);
				}
			}
		}
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(Lclient!ja;III)V")
	private void method2624(@OriginalArg(0) Class1_Sub1_Sub5_Sub5 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(14) Class1_Sub18 local14;
		@Pc(29) Class1_Sub1_Sub5_Sub5 local29;
		if (arg2 < this.anInt3869) {
			local14 = this.aClass1_Sub18ArrayArrayArray1[arg1][arg2 + 1][arg3];
			if (local14 != null && local14.aClass40_1 != null && local14.aClass40_1.aClass1_Sub1_Sub5_2 instanceof Class1_Sub1_Sub5_Sub5) {
				local29 = (Class1_Sub1_Sub5_Sub5) local14.aClass40_1.aClass1_Sub1_Sub5_2;
				Static70.method1484(arg0, local29, 128, 0, 0, true);
			}
		}
		if (arg3 < this.anInt3869) {
			local14 = this.aClass1_Sub18ArrayArrayArray1[arg1][arg2][arg3 + 1];
			if (local14 != null && local14.aClass40_1 != null && local14.aClass40_1.aClass1_Sub1_Sub5_2 instanceof Class1_Sub1_Sub5_Sub5) {
				local29 = (Class1_Sub1_Sub5_Sub5) local14.aClass40_1.aClass1_Sub1_Sub5_2;
				Static70.method1484(arg0, local29, 0, 0, 128, true);
			}
		}
		if (arg2 < this.anInt3869 && arg3 < this.anInt3871) {
			local14 = this.aClass1_Sub18ArrayArrayArray1[arg1][arg2 + 1][arg3 + 1];
			if (local14 != null && local14.aClass40_1 != null && local14.aClass40_1.aClass1_Sub1_Sub5_2 instanceof Class1_Sub1_Sub5_Sub5) {
				local29 = (Class1_Sub1_Sub5_Sub5) local14.aClass40_1.aClass1_Sub1_Sub5_2;
				Static70.method1484(arg0, local29, 128, 0, 128, true);
			}
		}
		if (arg2 >= this.anInt3869 || arg3 <= 0) {
			return;
		}
		local14 = this.aClass1_Sub18ArrayArrayArray1[arg1][arg2 + 1][arg3 - 1];
		if (local14 != null && local14.aClass40_1 != null && local14.aClass40_1.aClass1_Sub1_Sub5_2 instanceof Class1_Sub1_Sub5_Sub5) {
			local29 = (Class1_Sub1_Sub5_Sub5) local14.aClass40_1.aClass1_Sub1_Sub5_2;
			Static70.method1484(arg0, local29, 128, 0, -128, true);
		}
	}

	@OriginalMember(owner = "client!re", name = "h", descriptor = "(III)Lclient!he;")
	public Class29 method2625(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class1_Sub18 local8 = this.aClass1_Sub18ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 == null) {
			return null;
		}
		for (@Pc(14) int local14 = 0; local14 < local8.anInt3128; local14++) {
			@Pc(20) Class29 local20 = local8.aClass29Array1[local14];
			if ((local20.anInt1869 >> 29 & 0x3) == 2 && local20.anInt1873 == arg1 && local20.anInt1870 == arg2) {
				return local20;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!re", name = "b", descriptor = "(IIIIII)V")
	public void method2626(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (arg0 < 0) {
			arg0 = 0;
		} else if (arg0 >= this.anInt3869 * 128) {
			arg0 = this.anInt3869 * 128 - 1;
		}
		if (arg2 < 0) {
			arg2 = 0;
		} else if (arg2 >= this.anInt3871 * 128) {
			arg2 = this.anInt3871 * 128 - 1;
		}
		Static138.anInt3861++;
		Static138.anInt3854 = Class1_Sub1_Sub8_Sub4.anIntArray212[arg3];
		Static138.anInt3863 = Class1_Sub1_Sub8_Sub4.anIntArray216[arg3];
		Static138.anInt3868 = Class1_Sub1_Sub8_Sub4.anIntArray212[arg4];
		Static138.anInt3866 = Class1_Sub1_Sub8_Sub4.anIntArray216[arg4];
		Static138.aBooleanArrayArray1 = Static138.aBooleanArrayArrayArrayArray1[(arg3 - 128) / 32][arg4 / 64];
		Static138.anInt3849 = arg0;
		Static138.anInt3850 = arg1;
		Static138.anInt3864 = arg2;
		Static138.anInt3856 = arg0 / 128;
		Static138.anInt3870 = arg2 / 128;
		Static138.anInt3852 = arg5;
		Static138.anInt3846 = Static138.anInt3856 - 25;
		if (Static138.anInt3846 < 0) {
			Static138.anInt3846 = 0;
		}
		Static138.anInt3859 = Static138.anInt3870 - 25;
		if (Static138.anInt3859 < 0) {
			Static138.anInt3859 = 0;
		}
		Static138.anInt3867 = Static138.anInt3856 + 25;
		if (Static138.anInt3867 > this.anInt3869) {
			Static138.anInt3867 = this.anInt3869;
		}
		Static138.anInt3845 = Static138.anInt3870 + 25;
		if (Static138.anInt3845 > this.anInt3871) {
			Static138.anInt3845 = this.anInt3871;
		}
		this.method2645();
		Static138.anInt3872 = 0;
		@Pc(136) int local136;
		@Pc(139) int local139;
		for (@Pc(128) int local128 = this.anInt3851; local128 < this.anInt3848; local128++) {
			@Pc(134) Class1_Sub18[][] local134 = this.aClass1_Sub18ArrayArrayArray1[local128];
			for (local136 = Static138.anInt3846; local136 < Static138.anInt3867; local136++) {
				for (local139 = Static138.anInt3859; local139 < Static138.anInt3845; local139++) {
					@Pc(146) Class1_Sub18 local146 = local134[local136][local139];
					if (local146 != null) {
						if (local146.anInt3124 <= arg5 && (Static138.aBooleanArrayArray1[local136 + 25 - Static138.anInt3856][local139 + 25 - Static138.anInt3870] || this.anIntArrayArrayArray7[local128][local136][local139] - arg1 >= 2000)) {
							local146.aBoolean128 = true;
							local146.aBoolean129 = true;
							if (local146.anInt3128 > 0) {
								local146.aBoolean130 = true;
							} else {
								local146.aBoolean130 = false;
							}
							Static138.anInt3872++;
						} else {
							local146.aBoolean128 = false;
							local146.aBoolean129 = false;
							local146.anInt3129 = 0;
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
		for (@Pc(224) int local224 = this.anInt3851; local224 < this.anInt3848; local224++) {
			@Pc(230) Class1_Sub18[][] local230 = this.aClass1_Sub18ArrayArrayArray1[local224];
			for (local139 = -25; local139 <= 0; local139++) {
				local237 = Static138.anInt3856 + local139;
				local241 = Static138.anInt3856 - local139;
				if (local237 >= Static138.anInt3846 || local241 < Static138.anInt3867) {
					for (local249 = -25; local249 <= 0; local249++) {
						local254 = Static138.anInt3870 + local249;
						local258 = Static138.anInt3870 - local249;
						@Pc(270) Class1_Sub18 local270;
						if (local237 >= Static138.anInt3846) {
							if (local254 >= Static138.anInt3859) {
								local270 = local230[local237][local254];
								if (local270 != null && local270.aBoolean128) {
									this.method2647(local270, true);
								}
							}
							if (local258 < Static138.anInt3845) {
								local270 = local230[local237][local258];
								if (local270 != null && local270.aBoolean128) {
									this.method2647(local270, true);
								}
							}
						}
						if (local241 < Static138.anInt3867) {
							if (local254 >= Static138.anInt3859) {
								local270 = local230[local241][local254];
								if (local270 != null && local270.aBoolean128) {
									this.method2647(local270, true);
								}
							}
							if (local258 < Static138.anInt3845) {
								local270 = local230[local241][local258];
								if (local270 != null && local270.aBoolean128) {
									this.method2647(local270, true);
								}
							}
						}
						if (Static138.anInt3872 == 0) {
							Static138.aBoolean169 = false;
							return;
						}
					}
				}
			}
		}
		for (local136 = this.anInt3851; local136 < this.anInt3848; local136++) {
			@Pc(361) Class1_Sub18[][] local361 = this.aClass1_Sub18ArrayArrayArray1[local136];
			for (local237 = -25; local237 <= 0; local237++) {
				local241 = Static138.anInt3856 + local237;
				local249 = Static138.anInt3856 - local237;
				if (local241 >= Static138.anInt3846 || local249 < Static138.anInt3867) {
					for (local254 = -25; local254 <= 0; local254++) {
						local258 = Static138.anInt3870 + local254;
						@Pc(389) int local389 = Static138.anInt3870 - local254;
						@Pc(401) Class1_Sub18 local401;
						if (local241 >= Static138.anInt3846) {
							if (local258 >= Static138.anInt3859) {
								local401 = local361[local241][local258];
								if (local401 != null && local401.aBoolean128) {
									this.method2647(local401, false);
								}
							}
							if (local389 < Static138.anInt3845) {
								local401 = local361[local241][local389];
								if (local401 != null && local401.aBoolean128) {
									this.method2647(local401, false);
								}
							}
						}
						if (local249 < Static138.anInt3867) {
							if (local258 >= Static138.anInt3859) {
								local401 = local361[local249][local258];
								if (local401 != null && local401.aBoolean128) {
									this.method2647(local401, false);
								}
							}
							if (local389 < Static138.anInt3845) {
								local401 = local361[local249][local389];
								if (local401 != null && local401.aBoolean128) {
									this.method2647(local401, false);
								}
							}
						}
						if (Static138.anInt3872 == 0) {
							Static138.aBoolean169 = false;
							return;
						}
					}
				}
			}
		}
		Static138.aBoolean169 = false;
	}

	@OriginalMember(owner = "client!re", name = "i", descriptor = "(III)V")
	public void method2627(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class1_Sub18 local8 = this.aClass1_Sub18ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 != null) {
			local8.aClass40_1 = null;
		}
	}

	@OriginalMember(owner = "client!re", name = "j", descriptor = "(III)Z")
	private boolean method2628(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < Static138.anInt3858; local1++) {
			@Pc(6) Class79 local6 = Static138.aClass79Array1[local1];
			@Pc(15) int local15;
			@Pc(27) int local27;
			@Pc(37) int local37;
			@Pc(47) int local47;
			@Pc(57) int local57;
			if (local6.anInt4398 == 1) {
				local15 = local6.anInt4392 - arg0;
				if (local15 > 0) {
					local27 = local6.anInt4390 + (local6.anInt4388 * local15 >> 8);
					local37 = local6.anInt4397 + (local6.anInt4400 * local15 >> 8);
					local47 = local6.anInt4406 + (local6.anInt4411 * local15 >> 8);
					local57 = local6.anInt4395 + (local6.anInt4394 * local15 >> 8);
					if (arg2 >= local27 && arg2 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt4398 == 2) {
				local15 = arg0 - local6.anInt4392;
				if (local15 > 0) {
					local27 = local6.anInt4390 + (local6.anInt4388 * local15 >> 8);
					local37 = local6.anInt4397 + (local6.anInt4400 * local15 >> 8);
					local47 = local6.anInt4406 + (local6.anInt4411 * local15 >> 8);
					local57 = local6.anInt4395 + (local6.anInt4394 * local15 >> 8);
					if (arg2 >= local27 && arg2 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt4398 == 3) {
				local15 = local6.anInt4390 - arg2;
				if (local15 > 0) {
					local27 = local6.anInt4392 + (local6.anInt4408 * local15 >> 8);
					local37 = local6.anInt4409 + (local6.anInt4410 * local15 >> 8);
					local47 = local6.anInt4406 + (local6.anInt4411 * local15 >> 8);
					local57 = local6.anInt4395 + (local6.anInt4394 * local15 >> 8);
					if (arg0 >= local27 && arg0 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt4398 == 4) {
				local15 = arg2 - local6.anInt4390;
				if (local15 > 0) {
					local27 = local6.anInt4392 + (local6.anInt4408 * local15 >> 8);
					local37 = local6.anInt4409 + (local6.anInt4410 * local15 >> 8);
					local47 = local6.anInt4406 + (local6.anInt4411 * local15 >> 8);
					local57 = local6.anInt4395 + (local6.anInt4394 * local15 >> 8);
					if (arg0 >= local27 && arg0 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt4398 == 5) {
				local15 = arg1 - local6.anInt4406;
				if (local15 > 0) {
					local27 = local6.anInt4392 + (local6.anInt4408 * local15 >> 8);
					local37 = local6.anInt4409 + (local6.anInt4410 * local15 >> 8);
					local47 = local6.anInt4390 + (local6.anInt4388 * local15 >> 8);
					local57 = local6.anInt4397 + (local6.anInt4400 * local15 >> 8);
					if (arg0 >= local27 && arg0 <= local37 && arg2 >= local47 && arg2 <= local57) {
						return true;
					}
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(II)V")
	public void method2629(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class1_Sub18 local8 = this.aClass1_Sub18ArrayArrayArray1[0][arg0][arg1];
		for (@Pc(10) int local10 = 0; local10 < 3; local10++) {
			@Pc(31) Class1_Sub18 local31 = this.aClass1_Sub18ArrayArrayArray1[local10][arg0][arg1] = this.aClass1_Sub18ArrayArrayArray1[local10 + 1][arg0][arg1];
			if (local31 != null) {
				local31.anInt3125--;
				for (@Pc(41) int local41 = 0; local41 < local31.anInt3128; local41++) {
					@Pc(47) Class29 local47 = local31.aClass29Array1[local41];
					if ((local47.anInt1869 >> 29 & 0x3) == 2 && local47.anInt1873 == arg0 && local47.anInt1870 == arg1) {
						local47.anInt1878--;
					}
				}
			}
		}
		if (this.aClass1_Sub18ArrayArrayArray1[0][arg0][arg1] == null) {
			this.aClass1_Sub18ArrayArrayArray1[0][arg0][arg1] = new Class1_Sub18(0, arg0, arg1);
		}
		this.aClass1_Sub18ArrayArrayArray1[0][arg0][arg1].aClass1_Sub18_1 = local8;
		this.aClass1_Sub18ArrayArrayArray1[3][arg0][arg1] = null;
	}

	@OriginalMember(owner = "client!re", name = "b", descriptor = "(IIII)Z")
	private boolean method2630(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!this.method2614(arg0, arg1, arg2)) {
			return false;
		}
		@Pc(11) int local11 = arg1 << 7;
		@Pc(15) int local15 = arg2 << 7;
		@Pc(26) int local26 = this.anIntArrayArrayArray7[arg0][arg1][arg2] - 1;
		@Pc(30) int local30 = local26 - 120;
		@Pc(34) int local34 = local26 - 230;
		@Pc(38) int local38 = local26 - 238;
		if (arg3 < 16) {
			if (arg3 == 1) {
				if (local11 > Static138.anInt3849) {
					if (!this.method2628(local11, local26, local15)) {
						return false;
					}
					if (!this.method2628(local11, local26, local15 + 128)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!this.method2628(local11, local30, local15)) {
						return false;
					}
					if (!this.method2628(local11, local30, local15 + 128)) {
						return false;
					}
				}
				if (!this.method2628(local11, local34, local15)) {
					return false;
				}
				if (!this.method2628(local11, local34, local15 + 128)) {
					return false;
				}
				return true;
			}
			if (arg3 == 2) {
				if (local15 < Static138.anInt3864) {
					if (!this.method2628(local11, local26, local15 + 128)) {
						return false;
					}
					if (!this.method2628(local11 + 128, local26, local15 + 128)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!this.method2628(local11, local30, local15 + 128)) {
						return false;
					}
					if (!this.method2628(local11 + 128, local30, local15 + 128)) {
						return false;
					}
				}
				if (!this.method2628(local11, local34, local15 + 128)) {
					return false;
				}
				if (!this.method2628(local11 + 128, local34, local15 + 128)) {
					return false;
				}
				return true;
			}
			if (arg3 == 4) {
				if (local11 < Static138.anInt3849) {
					if (!this.method2628(local11 + 128, local26, local15)) {
						return false;
					}
					if (!this.method2628(local11 + 128, local26, local15 + 128)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!this.method2628(local11 + 128, local30, local15)) {
						return false;
					}
					if (!this.method2628(local11 + 128, local30, local15 + 128)) {
						return false;
					}
				}
				if (!this.method2628(local11 + 128, local34, local15)) {
					return false;
				}
				if (!this.method2628(local11 + 128, local34, local15 + 128)) {
					return false;
				}
				return true;
			}
			if (arg3 == 8) {
				if (local15 > Static138.anInt3864) {
					if (!this.method2628(local11, local26, local15)) {
						return false;
					}
					if (!this.method2628(local11 + 128, local26, local15)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!this.method2628(local11, local30, local15)) {
						return false;
					}
					if (!this.method2628(local11 + 128, local30, local15)) {
						return false;
					}
				}
				if (!this.method2628(local11, local34, local15)) {
					return false;
				}
				if (!this.method2628(local11 + 128, local34, local15)) {
					return false;
				}
				return true;
			}
		}
		if (!this.method2628(local11 + 64, local38, local15 + 64)) {
			return false;
		} else if (arg3 == 16) {
			return this.method2628(local11, local34, local15 + 128);
		} else if (arg3 == 32) {
			return this.method2628(local11 + 128, local34, local15 + 128);
		} else if (arg3 == 64) {
			return this.method2628(local11 + 128, local34, local15);
		} else if (arg3 == 128) {
			return this.method2628(local11, local34, local15);
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(IIIIIIIIIIIIIIIIIIII)V")
	public void method2631(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int arg15, @OriginalArg(16) int arg16, @OriginalArg(17) int arg17, @OriginalArg(18) int arg18, @OriginalArg(19) int arg19) {
		@Pc(12) Class52 local12;
		@Pc(14) int local14;
		if (arg3 == 0) {
			local12 = new Class52(arg10, arg11, arg12, arg13, -1, arg18, false);
			for (local14 = arg0; local14 >= 0; local14--) {
				if (this.aClass1_Sub18ArrayArrayArray1[local14][arg1][arg2] == null) {
					this.aClass1_Sub18ArrayArrayArray1[local14][arg1][arg2] = new Class1_Sub18(local14, arg1, arg2);
				}
			}
			this.aClass1_Sub18ArrayArrayArray1[arg0][arg1][arg2].aClass52_1 = local12;
		} else if (arg3 == 1) {
			local12 = new Class52(arg14, arg15, arg16, arg17, arg5, arg19, arg6 == arg7 && arg6 == arg8 && arg6 == arg9);
			for (local14 = arg0; local14 >= 0; local14--) {
				if (this.aClass1_Sub18ArrayArrayArray1[local14][arg1][arg2] == null) {
					this.aClass1_Sub18ArrayArrayArray1[local14][arg1][arg2] = new Class1_Sub18(local14, arg1, arg2);
				}
			}
			this.aClass1_Sub18ArrayArrayArray1[arg0][arg1][arg2].aClass52_1 = local12;
		} else {
			@Pc(140) Class64 local140 = new Class64(arg3, arg4, arg5, arg1, arg2, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17, arg18, arg19);
			for (local14 = arg0; local14 >= 0; local14--) {
				if (this.aClass1_Sub18ArrayArrayArray1[local14][arg1][arg2] == null) {
					this.aClass1_Sub18ArrayArrayArray1[local14][arg1][arg2] = new Class1_Sub18(local14, arg1, arg2);
				}
			}
			this.aClass1_Sub18ArrayArrayArray1[arg0][arg1][arg2].aClass64_1 = local140;
		}
	}

	@OriginalMember(owner = "client!re", name = "k", descriptor = "(III)Lclient!ma;")
	public Class42 method2632(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class1_Sub18 local8 = this.aClass1_Sub18ArrayArrayArray1[arg0][arg1][arg2];
		return local8 == null ? null : local8.aClass42_1;
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(Lclient!he;)V")
	private void method2633(@OriginalArg(0) Class29 arg0) {
		for (@Pc(2) int local2 = arg0.anInt1873; local2 <= arg0.anInt1877; local2++) {
			for (@Pc(6) int local6 = arg0.anInt1870; local6 <= arg0.anInt1866; local6++) {
				@Pc(17) Class1_Sub18 local17 = this.aClass1_Sub18ArrayArrayArray1[arg0.anInt1878][local2][local6];
				if (local17 != null) {
					@Pc(36) int local36;
					for (@Pc(21) int local21 = 0; local21 < local17.anInt3128; local21++) {
						if (local17.aClass29Array1[local21] == arg0) {
							local17.anInt3128--;
							for (local36 = local21; local36 < local17.anInt3128; local36++) {
								local17.aClass29Array1[local36] = local17.aClass29Array1[local36 + 1];
								local17.anIntArray276[local36] = local17.anIntArray276[local36 + 1];
							}
							local17.aClass29Array1[local17.anInt3128] = null;
							break;
						}
					}
					local17.anInt3122 = 0;
					for (local36 = 0; local36 < local17.anInt3128; local36++) {
						local17.anInt3122 |= local17.anIntArray276[local36];
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "([IIIIII)V")
	public void method2634(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(8) Class1_Sub18 local8 = this.aClass1_Sub18ArrayArrayArray1[arg2][arg3][arg4];
		if (local8 == null) {
			return;
		}
		@Pc(14) Class52 local14 = local8.aClass52_1;
		@Pc(24) int local24;
		if (local14 != null) {
			@Pc(19) int local19 = local14.anInt3253;
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
		@Pc(59) Class64 local59 = local8.aClass64_1;
		if (local59 == null) {
			return;
		}
		local24 = local59.anInt3811;
		@Pc(68) int local68 = local59.anInt3812;
		@Pc(71) int local71 = local59.anInt3813;
		@Pc(74) int local74 = local59.anInt3814;
		@Pc(79) int[] local79 = this.anIntArrayArray109[local24];
		@Pc(84) int[] local84 = this.anIntArrayArray110[local68];
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

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(IIIIILclient!ff;IIIIII)Z")
	public boolean method2635(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) Class1_Sub1_Sub5 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		return arg4 == null ? true : this.method2660(arg0, arg7, arg8, arg9 + 1 - arg7, arg10 - arg8 + 1, arg1, arg2, arg3, arg4, arg5, true, arg6, 0);
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(Lclient!ja;IIIII)V")
	private void method2636(@OriginalArg(0) Class1_Sub1_Sub5_Sub5 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(1) boolean local1 = true;
		@Pc(3) int local3 = arg2;
		@Pc(7) int local7 = arg2 + arg4;
		@Pc(11) int local11 = arg3 - 1;
		@Pc(15) int local15 = arg3 + arg5;
		for (@Pc(17) int local17 = arg1; local17 <= arg1 + 1; local17++) {
			if (local17 != this.anInt3848) {
				for (@Pc(24) int local24 = local3; local24 <= local7; local24++) {
					if (local24 >= 0 && local24 < this.anInt3869) {
						for (@Pc(34) int local34 = local11; local34 <= local15; local34++) {
							if (local34 >= 0 && local34 < this.anInt3871 && (!local1 || local24 >= local7 || local34 >= local15 || local34 < arg3 && local24 != arg2)) {
								@Pc(66) Class1_Sub18 local66 = this.aClass1_Sub18ArrayArrayArray1[local17][local24][local34];
								if (local66 != null) {
									@Pc(160) int local160 = (this.anIntArrayArrayArray7[local17][local24][local34] + this.anIntArrayArrayArray7[local17][local24 + 1][local34] + this.anIntArrayArrayArray7[local17][local24][local34 + 1] + this.anIntArrayArrayArray7[local17][local24 + 1][local34 + 1]) / 4 - (this.anIntArrayArrayArray7[arg1][arg2][arg3] + this.anIntArrayArrayArray7[arg1][arg2 + 1][arg3] + this.anIntArrayArrayArray7[arg1][arg2][arg3 + 1] + this.anIntArrayArrayArray7[arg1][arg2 + 1][arg3 + 1]) / 4;
									@Pc(163) Class75 local163 = local66.aClass75_1;
									if (local163 != null) {
										@Pc(173) Class1_Sub1_Sub5_Sub5 local173;
										if (local163.aClass1_Sub1_Sub5_5 instanceof Class1_Sub1_Sub5_Sub5) {
											local173 = (Class1_Sub1_Sub5_Sub5) local163.aClass1_Sub1_Sub5_5;
											Static70.method1484(arg0, local173, (local24 - arg2) * 128 + (1 - arg4) * 64, local160, (local34 - arg3) * 128 + (1 - arg5) * 64, local1);
										}
										if (local163.aClass1_Sub1_Sub5_6 instanceof Class1_Sub1_Sub5_Sub5) {
											local173 = (Class1_Sub1_Sub5_Sub5) local163.aClass1_Sub1_Sub5_6;
											Static70.method1484(arg0, local173, (local24 - arg2) * 128 + (1 - arg4) * 64, local160, (local34 - arg3) * 128 + (1 - arg5) * 64, local1);
										}
									}
									for (@Pc(237) int local237 = 0; local237 < local66.anInt3128; local237++) {
										@Pc(243) Class29 local243 = local66.aClass29Array1[local237];
										if (local243 != null && local243.aClass1_Sub1_Sub5_1 instanceof Class1_Sub1_Sub5_Sub5) {
											@Pc(253) Class1_Sub1_Sub5_Sub5 local253 = (Class1_Sub1_Sub5_Sub5) local243.aClass1_Sub1_Sub5_1;
											@Pc(261) int local261 = local243.anInt1877 + 1 - local243.anInt1873;
											@Pc(269) int local269 = local243.anInt1866 + 1 - local243.anInt1870;
											Static70.method1484(arg0, local253, (local243.anInt1873 - arg2) * 128 + (local261 - arg4) * 64, local160, (local243.anInt1870 - arg3) * 128 + (local269 - arg5) * 64, local1);
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

	@OriginalMember(owner = "client!re", name = "c", descriptor = "(IIII)V")
	public void method2637(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(8) Class1_Sub18 local8 = this.aClass1_Sub18ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 != null) {
			this.aClass1_Sub18ArrayArrayArray1[arg0][arg1][arg2].anInt3124 = arg3;
		}
	}

	@OriginalMember(owner = "client!re", name = "l", descriptor = "(III)V")
	public void method2638(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class1_Sub18 local8 = this.aClass1_Sub18ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 != null) {
			local8.aClass75_1 = null;
		}
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(IIIIIIII)Z")
	private boolean method2639(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
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

	@OriginalMember(owner = "client!re", name = "m", descriptor = "(III)V")
	public void method2640(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class1_Sub18 local8 = this.aClass1_Sub18ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 != null) {
			local8.aClass42_1 = null;
		}
	}

	@OriginalMember(owner = "client!re", name = "n", descriptor = "(III)Lclient!le;")
	public Class40 method2641(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class1_Sub18 local8 = this.aClass1_Sub18ArrayArrayArray1[arg0][arg1][arg2];
		return local8 == null || local8.aClass40_1 == null ? null : local8.aClass40_1;
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "()V")
	public void method2642() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt3847; local1++) {
			@Pc(7) Class29 local7 = this.aClass29Array2[local1];
			this.method2633(local7);
			this.aClass29Array2[local1] = null;
		}
		this.anInt3847 = 0;
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(IIIILclient!ff;II)V")
	public void method2643(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class1_Sub1_Sub5 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (arg4 == null) {
			return;
		}
		@Pc(6) Class40 local6 = new Class40();
		local6.aClass1_Sub1_Sub5_2 = arg4;
		local6.anInt2746 = arg1 * 128 + 64;
		local6.anInt2742 = arg2 * 128 + 64;
		local6.anInt2744 = arg3;
		local6.anInt2747 = arg5;
		local6.anInt2745 = arg6;
		if (this.aClass1_Sub18ArrayArrayArray1[arg0][arg1][arg2] == null) {
			this.aClass1_Sub18ArrayArrayArray1[arg0][arg1][arg2] = new Class1_Sub18(arg0, arg1, arg2);
		}
		this.aClass1_Sub18ArrayArrayArray1[arg0][arg1][arg2].aClass40_1 = local6;
	}

	@OriginalMember(owner = "client!re", name = "d", descriptor = "(IIII)Z")
	private boolean method2644(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.method2614(arg0, arg1, arg2)) {
			@Pc(11) int local11 = arg1 << 7;
			@Pc(15) int local15 = arg2 << 7;
			return this.method2628(local11 + 1, this.anIntArrayArrayArray7[arg0][arg1][arg2] - arg3, local15 + 1) && this.method2628(local11 + 128 - 1, this.anIntArrayArrayArray7[arg0][arg1 + 1][arg2] - arg3, local15 + 1) && this.method2628(local11 + 128 - 1, this.anIntArrayArrayArray7[arg0][arg1 + 1][arg2 + 1] - arg3, local15 + 128 - 1) && this.method2628(local11 + 1, this.anIntArrayArrayArray7[arg0][arg1][arg2 + 1] - arg3, local15 + 128 - 1);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!re", name = "b", descriptor = "()V")
	private void method2645() {
		@Pc(3) int local3 = Static138.anIntArray357[Static138.anInt3852];
		@Pc(7) Class79[] local7 = Static138.aClass79ArrayArray1[Static138.anInt3852];
		Static138.anInt3858 = 0;
		for (@Pc(11) int local11 = 0; local11 < local3; local11++) {
			@Pc(16) Class79 local16 = local7[local11];
			@Pc(27) int local27;
			@Pc(40) int local40;
			@Pc(51) int local51;
			@Pc(79) int local79;
			@Pc(58) boolean local58;
			if (local16.anInt4391 == 1) {
				local27 = local16.anInt4399 + 25 - Static138.anInt3856;
				if (local27 >= 0 && local27 <= 50) {
					local40 = local16.anInt4402 + 25 - Static138.anInt3870;
					if (local40 < 0) {
						local40 = 0;
					}
					local51 = local16.anInt4403 + 25 - Static138.anInt3870;
					if (local51 > 50) {
						local51 = 50;
					}
					local58 = false;
					while (local40 <= local51) {
						if (Static138.aBooleanArrayArray1[local27][local40++]) {
							local58 = true;
							break;
						}
					}
					if (local58) {
						local79 = Static138.anInt3849 - local16.anInt4392;
						if (local79 > 32) {
							local16.anInt4398 = 1;
						} else {
							if (local79 >= -32) {
								continue;
							}
							local16.anInt4398 = 2;
							local79 = -local79;
						}
						local16.anInt4388 = (local16.anInt4390 - Static138.anInt3864 << 8) / local79;
						local16.anInt4400 = (local16.anInt4397 - Static138.anInt3864 << 8) / local79;
						local16.anInt4411 = (local16.anInt4406 - Static138.anInt3850 << 8) / local79;
						local16.anInt4394 = (local16.anInt4395 - Static138.anInt3850 << 8) / local79;
						Static138.aClass79Array1[Static138.anInt3858++] = local16;
					}
				}
			} else if (local16.anInt4391 == 2) {
				local27 = local16.anInt4402 + 25 - Static138.anInt3870;
				if (local27 >= 0 && local27 <= 50) {
					local40 = local16.anInt4399 + 25 - Static138.anInt3856;
					if (local40 < 0) {
						local40 = 0;
					}
					local51 = local16.anInt4405 + 25 - Static138.anInt3856;
					if (local51 > 50) {
						local51 = 50;
					}
					local58 = false;
					while (local40 <= local51) {
						if (Static138.aBooleanArrayArray1[local40++][local27]) {
							local58 = true;
							break;
						}
					}
					if (local58) {
						local79 = Static138.anInt3864 - local16.anInt4390;
						if (local79 > 32) {
							local16.anInt4398 = 3;
						} else {
							if (local79 >= -32) {
								continue;
							}
							local16.anInt4398 = 4;
							local79 = -local79;
						}
						local16.anInt4408 = (local16.anInt4392 - Static138.anInt3849 << 8) / local79;
						local16.anInt4410 = (local16.anInt4409 - Static138.anInt3849 << 8) / local79;
						local16.anInt4411 = (local16.anInt4406 - Static138.anInt3850 << 8) / local79;
						local16.anInt4394 = (local16.anInt4395 - Static138.anInt3850 << 8) / local79;
						Static138.aClass79Array1[Static138.anInt3858++] = local16;
					}
				}
			} else if (local16.anInt4391 == 4) {
				local27 = local16.anInt4406 - Static138.anInt3850;
				if (local27 > 128) {
					local40 = local16.anInt4402 + 25 - Static138.anInt3870;
					if (local40 < 0) {
						local40 = 0;
					}
					local51 = local16.anInt4403 + 25 - Static138.anInt3870;
					if (local51 > 50) {
						local51 = 50;
					}
					if (local40 <= local51) {
						@Pc(319) int local319 = local16.anInt4399 + 25 - Static138.anInt3856;
						if (local319 < 0) {
							local319 = 0;
						}
						local79 = local16.anInt4405 + 25 - Static138.anInt3856;
						if (local79 > 50) {
							local79 = 50;
						}
						@Pc(337) boolean local337 = false;
						label142: for (@Pc(339) int local339 = local319; local339 <= local79; local339++) {
							for (@Pc(342) int local342 = local40; local342 <= local51; local342++) {
								if (Static138.aBooleanArrayArray1[local339][local342]) {
									local337 = true;
									break label142;
								}
							}
						}
						if (local337) {
							local16.anInt4398 = 5;
							local16.anInt4408 = (local16.anInt4392 - Static138.anInt3849 << 8) / local27;
							local16.anInt4410 = (local16.anInt4409 - Static138.anInt3849 << 8) / local27;
							local16.anInt4388 = (local16.anInt4390 - Static138.anInt3864 << 8) / local27;
							local16.anInt4400 = (local16.anInt4397 - Static138.anInt3864 << 8) / local27;
							Static138.aClass79Array1[Static138.anInt3858++] = local16;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!re", name = "o", descriptor = "(III)I")
	public int method2646(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class1_Sub18 local8 = this.aClass1_Sub18ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 == null) {
			return 0;
		}
		for (@Pc(14) int local14 = 0; local14 < local8.anInt3128; local14++) {
			@Pc(20) Class29 local20 = local8.aClass29Array1[local14];
			if ((local20.anInt1869 >> 29 & 0x3) == 2 && local20.anInt1873 == arg1 && local20.anInt1870 == arg2) {
				return local20.anInt1869;
			}
		}
		return 0;
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(Lclient!ng;Z)V")
	private void method2647(@OriginalArg(0) Class1_Sub18 arg0, @OriginalArg(1) boolean arg1) {
		Static138.aClass59_52.method2411(arg0);
		while (true) {
			@Pc(8) Class1_Sub18 local8;
			@Pc(17) int local17;
			@Pc(20) int local20;
			@Pc(23) int local23;
			@Pc(26) int local26;
			@Pc(31) Class1_Sub18[][] local31;
			@Pc(49) Class1_Sub18 local49;
			@Pc(251) int local251;
			@Pc(592) int local592;
			@Pc(597) int local597;
			@Pc(602) int local602;
			@Pc(919) Class75 local919;
			@Pc(1093) int local1093;
			@Pc(978) int local978;
			do {
				do {
					do {
						do {
							do {
								do {
									while (true) {
										@Pc(257) Class29 var12;
										@Pc(605) int var17;
										@Pc(614) int var18;
										@Pc(626) int var19;
										@Pc(345) int var21;
										@Pc(289) boolean var22;
										@Pc(800) Class1_Sub18 var33;
										while (true) {
											do {
												local8 = (Class1_Sub18) Static138.aClass59_52.method2423();
												if (local8 == null) {
													return;
												}
											} while (!local8.aBoolean129);
											local17 = local8.anInt3133;
											local20 = local8.anInt3123;
											local23 = local8.anInt3125;
											local26 = local8.anInt3130;
											local31 = this.aClass1_Sub18ArrayArrayArray1[local23];
											if (!local8.aBoolean128) {
												break;
											}
											if (arg1) {
												if (local23 > 0) {
													local49 = this.aClass1_Sub18ArrayArrayArray1[local23 - 1][local17][local20];
													if (local49 != null && local49.aBoolean129) {
														continue;
													}
												}
												if (local17 <= Static138.anInt3856 && local17 > Static138.anInt3846) {
													local49 = local31[local17 - 1][local20];
													if (local49 != null && local49.aBoolean129 && (local49.aBoolean128 || (local8.anInt3122 & 0x1) == 0)) {
														continue;
													}
												}
												if (local17 >= Static138.anInt3856 && local17 < Static138.anInt3867 - 1) {
													local49 = local31[local17 + 1][local20];
													if (local49 != null && local49.aBoolean129 && (local49.aBoolean128 || (local8.anInt3122 & 0x4) == 0)) {
														continue;
													}
												}
												if (local20 <= Static138.anInt3870 && local20 > Static138.anInt3859) {
													local49 = local31[local17][local20 - 1];
													if (local49 != null && local49.aBoolean129 && (local49.aBoolean128 || (local8.anInt3122 & 0x8) == 0)) {
														continue;
													}
												}
												if (local20 >= Static138.anInt3870 && local20 < Static138.anInt3845 - 1) {
													local49 = local31[local17][local20 + 1];
													if (local49 != null && local49.aBoolean129 && (local49.aBoolean128 || (local8.anInt3122 & 0x2) == 0)) {
														continue;
													}
												}
											} else {
												arg1 = true;
											}
											local8.aBoolean128 = false;
											if (local8.aClass1_Sub18_1 != null) {
												local49 = local8.aClass1_Sub18_1;
												if (local49.aClass52_1 == null) {
													if (local49.aClass64_1 != null && !this.method2614(0, local17, local20)) {
														this.method2623(local49.aClass64_1, Static138.anInt3854, Static138.anInt3863, Static138.anInt3868, Static138.anInt3866, local17, local20);
													}
												} else if (!this.method2614(0, local17, local20)) {
													this.method2661(local49.aClass52_1, 0, Static138.anInt3854, Static138.anInt3863, Static138.anInt3868, Static138.anInt3866, local17, local20);
												}
												@Pc(225) Class75 local225 = local49.aClass75_1;
												if (local225 != null) {
													local225.aClass1_Sub1_Sub5_5.method2897(0, Static138.anInt3854, Static138.anInt3863, Static138.anInt3868, Static138.anInt3866, local225.anInt4207 - Static138.anInt3849, local225.anInt4210 - Static138.anInt3850, local225.anInt4209 - Static138.anInt3864, local225.anInt4208);
												}
												for (local251 = 0; local251 < local49.anInt3128; local251++) {
													var12 = local49.aClass29Array1[local251];
													if (var12 != null) {
														var12.aClass1_Sub1_Sub5_1.method2897(var12.anInt1871, Static138.anInt3854, Static138.anInt3863, Static138.anInt3868, Static138.anInt3866, var12.anInt1868 - Static138.anInt3849, var12.anInt1875 - Static138.anInt3850, var12.anInt1874 - Static138.anInt3864, var12.anInt1869);
													}
												}
											}
											var22 = false;
											if (local8.aClass52_1 == null) {
												if (local8.aClass64_1 != null && !this.method2614(local26, local17, local20)) {
													var22 = true;
													this.method2623(local8.aClass64_1, Static138.anInt3854, Static138.anInt3863, Static138.anInt3868, Static138.anInt3866, local17, local20);
												}
											} else if (!this.method2614(local26, local17, local20)) {
												var22 = true;
												if (local8.aClass52_1.anInt3247 != 12345678 || Static138.aBoolean169 && local23 <= Static138.anInt3857) {
													this.method2661(local8.aClass52_1, local26, Static138.anInt3854, Static138.anInt3863, Static138.anInt3868, Static138.anInt3866, local17, local20);
												}
											}
											var21 = 0;
											local251 = 0;
											@Pc(350) Class75 local350 = local8.aClass75_1;
											@Pc(353) Class42 local353 = local8.aClass42_1;
											if (local350 != null || local353 != null) {
												if (Static138.anInt3856 == local17) {
													var21++;
												} else if (Static138.anInt3856 < local17) {
													var21 += 2;
												}
												if (Static138.anInt3870 == local20) {
													var21 += 3;
												} else if (Static138.anInt3870 > local20) {
													var21 += 6;
												}
												local251 = Static138.anIntArray360[var21];
												local8.anInt3131 = Static138.anIntArray361[var21];
											}
											if (local350 != null) {
												if ((local350.anInt4211 & Static138.anIntArray359[var21]) == 0) {
													local8.anInt3129 = 0;
												} else if (local350.anInt4211 == 16) {
													local8.anInt3129 = 3;
													local8.anInt3127 = Static138.anIntArray358[var21];
													local8.anInt3126 = 3 - local8.anInt3127;
												} else if (local350.anInt4211 == 32) {
													local8.anInt3129 = 6;
													local8.anInt3127 = Static138.anIntArray364[var21];
													local8.anInt3126 = 6 - local8.anInt3127;
												} else if (local350.anInt4211 == 64) {
													local8.anInt3129 = 12;
													local8.anInt3127 = Static138.anIntArray362[var21];
													local8.anInt3126 = 12 - local8.anInt3127;
												} else {
													local8.anInt3129 = 9;
													local8.anInt3127 = Static138.anIntArray363[var21];
													local8.anInt3126 = 9 - local8.anInt3127;
												}
												if ((local350.anInt4211 & local251) != 0 && !this.method2630(local26, local17, local20, local350.anInt4211)) {
													local350.aClass1_Sub1_Sub5_5.method2897(0, Static138.anInt3854, Static138.anInt3863, Static138.anInt3868, Static138.anInt3866, local350.anInt4207 - Static138.anInt3849, local350.anInt4210 - Static138.anInt3850, local350.anInt4209 - Static138.anInt3864, local350.anInt4208);
												}
												if ((local350.anInt4205 & local251) != 0 && !this.method2630(local26, local17, local20, local350.anInt4205)) {
													local350.aClass1_Sub1_Sub5_6.method2897(0, Static138.anInt3854, Static138.anInt3863, Static138.anInt3868, Static138.anInt3866, local350.anInt4207 - Static138.anInt3849, local350.anInt4210 - Static138.anInt3850, local350.anInt4209 - Static138.anInt3864, local350.anInt4208);
												}
											}
											if (local353 != null && !this.method2644(local26, local17, local20, local353.aClass1_Sub1_Sub5_4.anInt4233)) {
												if ((local353.anInt2875 & local251) != 0) {
													local353.aClass1_Sub1_Sub5_4.method2897(0, Static138.anInt3854, Static138.anInt3863, Static138.anInt3868, Static138.anInt3866, local353.anInt2877 + local353.anInt2870 - Static138.anInt3849, local353.anInt2869 - Static138.anInt3850, local353.anInt2871 + local353.anInt2868 - Static138.anInt3864, local353.anInt2879);
												} else if (local353.anInt2875 == 256) {
													local592 = local353.anInt2877 - Static138.anInt3849;
													local597 = local353.anInt2869 - Static138.anInt3850;
													local602 = local353.anInt2871 - Static138.anInt3864;
													var17 = local353.anInt2878;
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
														local353.aClass1_Sub1_Sub5_4.method2897(0, Static138.anInt3854, Static138.anInt3863, Static138.anInt3868, Static138.anInt3866, local592 + local353.anInt2870, local597, local602 + local353.anInt2868, local353.anInt2879);
													} else if (local353.aClass1_Sub1_Sub5_3 != null) {
														local353.aClass1_Sub1_Sub5_3.method2897(0, Static138.anInt3854, Static138.anInt3863, Static138.anInt3868, Static138.anInt3866, local592, local597, local602, local353.anInt2879);
													}
												}
											}
											if (var22) {
												@Pc(673) Class40 local673 = local8.aClass40_1;
												if (local673 != null) {
													local673.aClass1_Sub1_Sub5_2.method2897(0, Static138.anInt3854, Static138.anInt3863, Static138.anInt3868, Static138.anInt3866, local673.anInt2746 - Static138.anInt3849, local673.anInt2744 - Static138.anInt3850, local673.anInt2742 - Static138.anInt3864, local673.anInt2747);
												}
												@Pc(700) Class76 local700 = local8.aClass76_1;
												if (local700 != null && local700.anInt4258 == 0) {
													if (local700.aClass1_Sub1_Sub5_7 != null) {
														local700.aClass1_Sub1_Sub5_7.method2897(0, Static138.anInt3854, Static138.anInt3863, Static138.anInt3868, Static138.anInt3866, local700.anInt4263 - Static138.anInt3849, local700.anInt4257 - Static138.anInt3850, local700.anInt4264 - Static138.anInt3864, local700.anInt4265);
													}
													if (local700.aClass1_Sub1_Sub5_8 != null) {
														local700.aClass1_Sub1_Sub5_8.method2897(0, Static138.anInt3854, Static138.anInt3863, Static138.anInt3868, Static138.anInt3866, local700.anInt4263 - Static138.anInt3849, local700.anInt4257 - Static138.anInt3850, local700.anInt4264 - Static138.anInt3864, local700.anInt4265);
													}
													if (local700.aClass1_Sub1_Sub5_9 != null) {
														local700.aClass1_Sub1_Sub5_9.method2897(0, Static138.anInt3854, Static138.anInt3863, Static138.anInt3868, Static138.anInt3866, local700.anInt4263 - Static138.anInt3849, local700.anInt4257 - Static138.anInt3850, local700.anInt4264 - Static138.anInt3864, local700.anInt4265);
													}
												}
											}
											local592 = local8.anInt3122;
											if (local592 != 0) {
												if (local17 < Static138.anInt3856 && (local592 & 0x4) != 0) {
													var33 = local31[local17 + 1][local20];
													if (var33 != null && var33.aBoolean129) {
														Static138.aClass59_52.method2411(var33);
													}
												}
												if (local20 < Static138.anInt3870 && (local592 & 0x2) != 0) {
													var33 = local31[local17][local20 + 1];
													if (var33 != null && var33.aBoolean129) {
														Static138.aClass59_52.method2411(var33);
													}
												}
												if (local17 > Static138.anInt3856 && (local592 & 0x1) != 0) {
													var33 = local31[local17 - 1][local20];
													if (var33 != null && var33.aBoolean129) {
														Static138.aClass59_52.method2411(var33);
													}
												}
												if (local20 > Static138.anInt3870 && (local592 & 0x8) != 0) {
													var33 = local31[local17][local20 - 1];
													if (var33 != null && var33.aBoolean129) {
														Static138.aClass59_52.method2411(var33);
													}
												}
											}
											break;
										}
										if (local8.anInt3129 != 0) {
											var22 = true;
											for (var21 = 0; var21 < local8.anInt3128; var21++) {
												if (local8.aClass29Array1[var21].anInt1879 != Static138.anInt3861 && (local8.anIntArray276[var21] & local8.anInt3129) == local8.anInt3127) {
													var22 = false;
													break;
												}
											}
											if (var22) {
												local919 = local8.aClass75_1;
												if (!this.method2630(local26, local17, local20, local919.anInt4211)) {
													local919.aClass1_Sub1_Sub5_5.method2897(0, Static138.anInt3854, Static138.anInt3863, Static138.anInt3868, Static138.anInt3866, local919.anInt4207 - Static138.anInt3849, local919.anInt4210 - Static138.anInt3850, local919.anInt4209 - Static138.anInt3864, local919.anInt4208);
												}
												local8.anInt3129 = 0;
											}
										}
										if (!local8.aBoolean130) {
											break;
										}
										try {
											@Pc(958) int local958 = local8.anInt3128;
											local8.aBoolean130 = false;
											var21 = 0;
											label558: for (local251 = 0; local251 < local958; local251++) {
												var12 = local8.aClass29Array1[local251];
												if (var12.anInt1879 != Static138.anInt3861) {
													for (local978 = var12.anInt1873; local978 <= var12.anInt1877; local978++) {
														for (local592 = var12.anInt1870; local592 <= var12.anInt1866; local592++) {
															var33 = local31[local978][local592];
															if (var33.aBoolean128) {
																local8.aBoolean130 = true;
																continue label558;
															}
															if (var33.anInt3129 != 0) {
																local602 = 0;
																if (local978 > var12.anInt1873) {
																	local602++;
																}
																if (local978 < var12.anInt1877) {
																	local602 += 4;
																}
																if (local592 > var12.anInt1870) {
																	local602 += 8;
																}
																if (local592 < var12.anInt1866) {
																	local602 += 2;
																}
																if ((local602 & var33.anInt3129) == local8.anInt3126) {
																	local8.aBoolean130 = true;
																	continue label558;
																}
															}
														}
													}
													Static138.aClass29Array3[var21++] = var12;
													local592 = Static138.anInt3856 - var12.anInt1873;
													local597 = var12.anInt1877 - Static138.anInt3856;
													if (local597 > local592) {
														local592 = local597;
													}
													local602 = Static138.anInt3870 - var12.anInt1870;
													var17 = var12.anInt1866 - Static138.anInt3870;
													if (var17 > local602) {
														var12.anInt1867 = local592 + var17;
													} else {
														var12.anInt1867 = local592 + local602;
													}
												}
											}
											while (var21 > 0) {
												local1093 = -50;
												local978 = -1;
												@Pc(1102) Class29 local1102;
												for (local592 = 0; local592 < var21; local592++) {
													local1102 = Static138.aClass29Array3[local592];
													if (local1102.anInt1879 != Static138.anInt3861) {
														if (local1102.anInt1867 > local1093) {
															local1093 = local1102.anInt1867;
															local978 = local592;
														} else if (local1102.anInt1867 == local1093) {
															local602 = local1102.anInt1868 - Static138.anInt3849;
															var17 = local1102.anInt1874 - Static138.anInt3864;
															var18 = Static138.aClass29Array3[local978].anInt1868 - Static138.anInt3849;
															var19 = Static138.aClass29Array3[local978].anInt1874 - Static138.anInt3864;
															if (local602 * local602 + var17 * var17 > var18 * var18 + var19 * var19) {
																local978 = local592;
															}
														}
													}
												}
												if (local978 == -1) {
													break;
												}
												local1102 = Static138.aClass29Array3[local978];
												local1102.anInt1879 = Static138.anInt3861;
												if (!this.method2616(local26, local1102.anInt1873, local1102.anInt1877, local1102.anInt1870, local1102.anInt1866, local1102.aClass1_Sub1_Sub5_1.anInt4233)) {
													local1102.aClass1_Sub1_Sub5_1.method2897(local1102.anInt1871, Static138.anInt3854, Static138.anInt3863, Static138.anInt3868, Static138.anInt3866, local1102.anInt1868 - Static138.anInt3849, local1102.anInt1875 - Static138.anInt3850, local1102.anInt1874 - Static138.anInt3864, local1102.anInt1869);
												}
												for (local602 = local1102.anInt1873; local602 <= local1102.anInt1877; local602++) {
													for (var17 = local1102.anInt1870; var17 <= local1102.anInt1866; var17++) {
														@Pc(1227) Class1_Sub18 local1227 = local31[local602][var17];
														if (local1227.anInt3129 != 0) {
															Static138.aClass59_52.method2411(local1227);
														} else if ((local602 != local17 || var17 != local20) && local1227.aBoolean129) {
															Static138.aClass59_52.method2411(local1227);
														}
													}
												}
											}
											if (!local8.aBoolean130) {
												break;
											}
										} catch (@Pc(1265) Exception local1265) {
											local8.aBoolean130 = false;
											break;
										}
									}
								} while (!local8.aBoolean129);
							} while (local8.anInt3129 != 0);
							if (local17 > Static138.anInt3856 || local17 <= Static138.anInt3846) {
								break;
							}
							local49 = local31[local17 - 1][local20];
						} while (local49 != null && local49.aBoolean129);
						if (local17 < Static138.anInt3856 || local17 >= Static138.anInt3867 - 1) {
							break;
						}
						local49 = local31[local17 + 1][local20];
					} while (local49 != null && local49.aBoolean129);
					if (local20 > Static138.anInt3870 || local20 <= Static138.anInt3859) {
						break;
					}
					local49 = local31[local17][local20 - 1];
				} while (local49 != null && local49.aBoolean129);
				if (local20 < Static138.anInt3870 || local20 >= Static138.anInt3845 - 1) {
					break;
				}
				local49 = local31[local17][local20 + 1];
			} while (local49 != null && local49.aBoolean129);
			local8.aBoolean129 = false;
			Static138.anInt3872--;
			@Pc(1369) Class76 local1369 = local8.aClass76_1;
			if (local1369 != null && local1369.anInt4258 != 0) {
				if (local1369.aClass1_Sub1_Sub5_7 != null) {
					local1369.aClass1_Sub1_Sub5_7.method2897(0, Static138.anInt3854, Static138.anInt3863, Static138.anInt3868, Static138.anInt3866, local1369.anInt4263 - Static138.anInt3849, local1369.anInt4257 - Static138.anInt3850 - local1369.anInt4258, local1369.anInt4264 - Static138.anInt3864, local1369.anInt4265);
				}
				if (local1369.aClass1_Sub1_Sub5_8 != null) {
					local1369.aClass1_Sub1_Sub5_8.method2897(0, Static138.anInt3854, Static138.anInt3863, Static138.anInt3868, Static138.anInt3866, local1369.anInt4263 - Static138.anInt3849, local1369.anInt4257 - Static138.anInt3850 - local1369.anInt4258, local1369.anInt4264 - Static138.anInt3864, local1369.anInt4265);
				}
				if (local1369.aClass1_Sub1_Sub5_9 != null) {
					local1369.aClass1_Sub1_Sub5_9.method2897(0, Static138.anInt3854, Static138.anInt3863, Static138.anInt3868, Static138.anInt3866, local1369.anInt4263 - Static138.anInt3849, local1369.anInt4257 - Static138.anInt3850 - local1369.anInt4258, local1369.anInt4264 - Static138.anInt3864, local1369.anInt4265);
				}
			}
			if (local8.anInt3131 != 0) {
				@Pc(1464) Class42 local1464 = local8.aClass42_1;
				if (local1464 != null && !this.method2644(local26, local17, local20, local1464.aClass1_Sub1_Sub5_4.anInt4233)) {
					if ((local1464.anInt2875 & local8.anInt3131) != 0) {
						local1464.aClass1_Sub1_Sub5_4.method2897(0, Static138.anInt3854, Static138.anInt3863, Static138.anInt3868, Static138.anInt3866, local1464.anInt2877 + local1464.anInt2870 - Static138.anInt3849, local1464.anInt2869 - Static138.anInt3850, local1464.anInt2871 + local1464.anInt2868 - Static138.anInt3864, local1464.anInt2879);
					} else if (local1464.anInt2875 == 256) {
						local251 = local1464.anInt2877 - Static138.anInt3849;
						local1093 = local1464.anInt2869 - Static138.anInt3850;
						local978 = local1464.anInt2871 - Static138.anInt3864;
						local592 = local1464.anInt2878;
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
							local1464.aClass1_Sub1_Sub5_4.method2897(0, Static138.anInt3854, Static138.anInt3863, Static138.anInt3868, Static138.anInt3866, local251 + local1464.anInt2870, local1093, local978 + local1464.anInt2868, local1464.anInt2879);
						} else if (local1464.aClass1_Sub1_Sub5_3 != null) {
							local1464.aClass1_Sub1_Sub5_3.method2897(0, Static138.anInt3854, Static138.anInt3863, Static138.anInt3868, Static138.anInt3866, local251, local1093, local978, local1464.anInt2879);
						}
					}
				}
				local919 = local8.aClass75_1;
				if (local919 != null) {
					if ((local919.anInt4205 & local8.anInt3131) != 0 && !this.method2630(local26, local17, local20, local919.anInt4205)) {
						local919.aClass1_Sub1_Sub5_6.method2897(0, Static138.anInt3854, Static138.anInt3863, Static138.anInt3868, Static138.anInt3866, local919.anInt4207 - Static138.anInt3849, local919.anInt4210 - Static138.anInt3850, local919.anInt4209 - Static138.anInt3864, local919.anInt4208);
					}
					if ((local919.anInt4211 & local8.anInt3131) != 0 && !this.method2630(local26, local17, local20, local919.anInt4211)) {
						local919.aClass1_Sub1_Sub5_5.method2897(0, Static138.anInt3854, Static138.anInt3863, Static138.anInt3868, Static138.anInt3866, local919.anInt4207 - Static138.anInt3849, local919.anInt4210 - Static138.anInt3850, local919.anInt4209 - Static138.anInt3864, local919.anInt4208);
					}
				}
			}
			@Pc(1689) Class1_Sub18 local1689;
			if (local23 < this.anInt3848 - 1) {
				local1689 = this.aClass1_Sub18ArrayArrayArray1[local23 + 1][local17][local20];
				if (local1689 != null && local1689.aBoolean129) {
					Static138.aClass59_52.method2411(local1689);
				}
			}
			if (local17 < Static138.anInt3856) {
				local1689 = local31[local17 + 1][local20];
				if (local1689 != null && local1689.aBoolean129) {
					Static138.aClass59_52.method2411(local1689);
				}
			}
			if (local20 < Static138.anInt3870) {
				local1689 = local31[local17][local20 + 1];
				if (local1689 != null && local1689.aBoolean129) {
					Static138.aClass59_52.method2411(local1689);
				}
			}
			if (local17 > Static138.anInt3856) {
				local1689 = local31[local17 - 1][local20];
				if (local1689 != null && local1689.aBoolean129) {
					Static138.aClass59_52.method2411(local1689);
				}
			}
			if (local20 > Static138.anInt3870) {
				local1689 = local31[local17][local20 - 1];
				if (local1689 != null && local1689.aBoolean129) {
					Static138.aClass59_52.method2411(local1689);
				}
			}
		}
	}

	@OriginalMember(owner = "client!re", name = "p", descriptor = "(III)I")
	public int method2648(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class1_Sub18 local8 = this.aClass1_Sub18ArrayArrayArray1[arg0][arg1][arg2];
		return local8 == null || local8.aClass75_1 == null ? 0 : local8.aClass75_1.anInt4208;
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(IIIILclient!ff;ILclient!ff;Lclient!ff;)V")
	public void method2649(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class1_Sub1_Sub5 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class1_Sub1_Sub5 arg6, @OriginalArg(7) Class1_Sub1_Sub5 arg7) {
		@Pc(3) Class76 local3 = new Class76();
		local3.aClass1_Sub1_Sub5_9 = arg4;
		local3.anInt4263 = arg1 * 128 + 64;
		local3.anInt4264 = arg2 * 128 + 64;
		local3.anInt4257 = arg3;
		local3.anInt4265 = arg5;
		local3.aClass1_Sub1_Sub5_7 = arg6;
		local3.aClass1_Sub1_Sub5_8 = arg7;
		@Pc(34) int local34 = 0;
		@Pc(43) Class1_Sub18 local43 = this.aClass1_Sub18ArrayArrayArray1[arg0][arg1][arg2];
		if (local43 != null) {
			for (@Pc(47) int local47 = 0; local47 < local43.anInt3128; local47++) {
				if ((local43.aClass29Array1[local47].anInt1876 & 0x100) == 256 && local43.aClass29Array1[local47].aClass1_Sub1_Sub5_1 instanceof Class1_Sub1_Sub5_Sub4) {
					@Pc(71) Class1_Sub1_Sub5_Sub4 local71 = (Class1_Sub1_Sub5_Sub4) local43.aClass29Array1[local47].aClass1_Sub1_Sub5_1;
					local71.method1008();
					if (local71.anInt4233 > local34) {
						local34 = local71.anInt4233;
					}
				}
			}
		}
		local3.anInt4258 = local34;
		if (this.aClass1_Sub18ArrayArrayArray1[arg0][arg1][arg2] == null) {
			this.aClass1_Sub18ArrayArrayArray1[arg0][arg1][arg2] = new Class1_Sub18(arg0, arg1, arg2);
		}
		this.aClass1_Sub18ArrayArrayArray1[arg0][arg1][arg2].aClass76_1 = local3;
	}

	@OriginalMember(owner = "client!re", name = "q", descriptor = "(III)Lclient!te;")
	public Class75 method2650(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class1_Sub18 local8 = this.aClass1_Sub18ArrayArrayArray1[arg0][arg1][arg2];
		return local8 == null ? null : local8.aClass75_1;
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(I)V")
	public void method2652(@OriginalArg(0) int arg0) {
		this.anInt3851 = arg0;
		for (@Pc(4) int local4 = 0; local4 < this.anInt3869; local4++) {
			for (@Pc(7) int local7 = 0; local7 < this.anInt3871; local7++) {
				if (this.aClass1_Sub18ArrayArrayArray1[arg0][local4][local7] == null) {
					this.aClass1_Sub18ArrayArrayArray1[arg0][local4][local7] = new Class1_Sub18(arg0, local4, local7);
				}
			}
		}
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(IIIIILclient!ff;IIZ)Z")
	public boolean method2656(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class1_Sub1_Sub5 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8) {
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
		return this.method2660(arg0, local7, local11, local15 + 1 - local7, local19 - local11 + 1, arg1, arg2, arg3, arg5, arg6, true, arg7, 0);
	}

	@OriginalMember(owner = "client!re", name = "e", descriptor = "(IIII)I")
	public int method2657(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(8) Class1_Sub18 local8 = this.aClass1_Sub18ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 == null) {
			return -1;
		} else if (local8.aClass75_1 != null && local8.aClass75_1.anInt4208 == arg3) {
			return local8.aClass75_1.anInt4206 & 0xFF;
		} else if (local8.aClass42_1 != null && local8.aClass42_1.anInt2879 == arg3) {
			return local8.aClass42_1.anInt2874 & 0xFF;
		} else if (local8.aClass40_1 != null && local8.aClass40_1.anInt2747 == arg3) {
			return local8.aClass40_1.anInt2745 & 0xFF;
		} else {
			for (@Pc(56) int local56 = 0; local56 < local8.anInt3128; local56++) {
				if (local8.aClass29Array1[local56].anInt1869 == arg3) {
					return local8.aClass29Array1[local56].anInt1876 & 0xFF;
				}
			}
			return -1;
		}
	}

	@OriginalMember(owner = "client!re", name = "d", descriptor = "()V")
	public void method2659() {
		@Pc(4) int local4;
		@Pc(7) int local7;
		for (@Pc(1) int local1 = 0; local1 < this.anInt3848; local1++) {
			for (local4 = 0; local4 < this.anInt3869; local4++) {
				for (local7 = 0; local7 < this.anInt3871; local7++) {
					this.aClass1_Sub18ArrayArrayArray1[local1][local4][local7] = null;
				}
			}
		}
		for (local4 = 0; local4 < Static138.anInt3853; local4++) {
			for (local7 = 0; local7 < Static138.anIntArray357[local4]; local7++) {
				Static138.aClass79ArrayArray1[local4][local7] = null;
			}
			Static138.anIntArray357[local4] = 0;
		}
		for (local7 = 0; local7 < this.anInt3847; local7++) {
			this.aClass29Array2[local7] = null;
		}
		this.anInt3847 = 0;
		for (@Pc(76) int local76 = 0; local76 < Static138.aClass29Array3.length; local76++) {
			Static138.aClass29Array3[local76] = null;
		}
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(IIIIIIIILclient!ff;IZII)Z")
	private boolean method2660(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) Class1_Sub1_Sub5 arg8, @OriginalArg(9) int arg9, @OriginalArg(10) boolean arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12) {
		for (@Pc(1) int local1 = arg1; local1 < arg1 + arg3; local1++) {
			for (@Pc(4) int local4 = arg2; local4 < arg2 + arg4; local4++) {
				if (local1 < 0 || local4 < 0 || local1 >= this.anInt3869 || local4 >= this.anInt3871) {
					return false;
				}
				@Pc(28) Class1_Sub18 local28 = this.aClass1_Sub18ArrayArrayArray1[arg0][local1][local4];
				if (local28 != null && local28.anInt3128 >= 5) {
					return false;
				}
			}
		}
		@Pc(52) Class29 local52 = new Class29();
		local52.anInt1869 = arg11;
		local52.anInt1876 = arg12;
		local52.anInt1878 = arg0;
		local52.anInt1868 = arg5;
		local52.anInt1874 = arg6;
		local52.anInt1875 = arg7;
		local52.aClass1_Sub1_Sub5_1 = arg8;
		local52.anInt1871 = arg9;
		local52.anInt1873 = arg1;
		local52.anInt1870 = arg2;
		local52.anInt1877 = arg1 + arg3 - 1;
		local52.anInt1866 = arg2 + arg4 - 1;
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
					if (this.aClass1_Sub18ArrayArrayArray1[local130][local98][local101] == null) {
						this.aClass1_Sub18ArrayArrayArray1[local130][local98][local101] = new Class1_Sub18(local130, local98, local101);
					}
				}
				@Pc(166) Class1_Sub18 local166 = this.aClass1_Sub18ArrayArrayArray1[arg0][local98][local101];
				local166.aClass29Array1[local166.anInt3128] = local52;
				local166.anIntArray276[local166.anInt3128] = local104;
				local166.anInt3122 |= local104;
				local166.anInt3128++;
			}
		}
		if (arg10) {
			this.aClass29Array2[this.anInt3847++] = local52;
		}
		return true;
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(Lclient!oc;IIIIIII)V")
	private void method2661(@OriginalArg(0) Class52 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(6) int local6;
		@Pc(7) int local7 = local6 = (arg6 << 7) - Static138.anInt3849;
		@Pc(14) int local14;
		@Pc(15) int local15 = local14 = (arg7 << 7) - Static138.anInt3864;
		@Pc(20) int local20;
		@Pc(21) int local21 = local20 = local7 + 128;
		@Pc(26) int local26;
		@Pc(27) int local27 = local26 = local15 + 128;
		@Pc(38) int local38 = this.anIntArrayArrayArray7[arg1][arg6][arg7] - Static138.anInt3850;
		@Pc(51) int local51 = this.anIntArrayArrayArray7[arg1][arg6 + 1][arg7] - Static138.anInt3850;
		@Pc(66) int local66 = this.anIntArrayArrayArray7[arg1][arg6 + 1][arg7 + 1] - Static138.anInt3850;
		@Pc(79) int local79 = this.anIntArrayArrayArray7[arg1][arg6][arg7 + 1] - Static138.anInt3850;
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
		@Pc(279) int local279 = Static79.anInt2433 + (local101 << 9) / local121;
		@Pc(287) int local287 = Static79.anInt2439 + (local123 << 9) / local121;
		@Pc(295) int local295 = Static79.anInt2433 + (local21 << 9) / local169;
		@Pc(303) int local303 = Static79.anInt2439 + (local51 << 9) / local169;
		@Pc(311) int local311 = Static79.anInt2433 + (local197 << 9) / local27;
		@Pc(319) int local319 = Static79.anInt2439 + (local66 << 9) / local27;
		@Pc(327) int local327 = Static79.anInt2433 + (local245 << 9) / local265;
		@Pc(335) int local335 = Static79.anInt2439 + (local89 << 9) / local265;
		Static79.anInt2440 = 0;
		@Pc(472) int local472;
		if ((local311 - local327) * (local303 - local335) - (local319 - local335) * (local295 - local327) > 0) {
			Static79.aBoolean99 = false;
			if (local311 < 0 || local327 < 0 || local295 < 0 || local311 > Static79.anInt2435 || local327 > Static79.anInt2435 || local295 > Static79.anInt2435) {
				Static79.aBoolean99 = true;
			}
			if (Static138.aBoolean169 && this.method2639(Static138.anInt3860, Static138.anInt3865, local319, local335, local303, local311, local327, local295)) {
				Static138.anInt3862 = arg6;
				Static138.anInt3855 = arg7;
			}
			if (arg0.anInt3244 == -1) {
				if (arg0.anInt3247 != 12345678) {
					Static79.method1749(local319, local335, local303, local311, local327, local295, arg0.anInt3247, arg0.anInt3246, arg0.anInt3251);
				}
			} else if (Static138.aBoolean170) {
				local472 = Static79.anInterface3_1.method3054(arg0.anInt3244);
				Static79.method1749(local319, local335, local303, local311, local327, local295, Static138.method2658(local472, arg0.anInt3247), Static138.method2658(local472, arg0.anInt3246), Static138.method2658(local472, arg0.anInt3251));
			} else if (arg0.aBoolean139) {
				Static79.method1757(local319, local335, local303, local311, local327, local295, arg0.anInt3247, arg0.anInt3246, arg0.anInt3251, local101, local21, local245, local123, local51, local89, local121, local169, local265, arg0.anInt3244);
			} else {
				Static79.method1757(local319, local335, local303, local311, local327, local295, arg0.anInt3247, arg0.anInt3246, arg0.anInt3251, local197, local245, local21, local66, local89, local51, local27, local265, local169, arg0.anInt3244);
			}
		}
		if ((local279 - local295) * (local335 - local303) - (local287 - local303) * (local327 - local295) <= 0) {
			return;
		}
		Static79.aBoolean99 = false;
		if (local279 < 0 || local295 < 0 || local327 < 0 || local279 > Static79.anInt2435 || local295 > Static79.anInt2435 || local327 > Static79.anInt2435) {
			Static79.aBoolean99 = true;
		}
		if (Static138.aBoolean169 && this.method2639(Static138.anInt3860, Static138.anInt3865, local287, local303, local335, local279, local295, local327)) {
			Static138.anInt3862 = arg6;
			Static138.anInt3855 = arg7;
		}
		if (arg0.anInt3244 != -1) {
			if (!Static138.aBoolean170) {
				Static79.method1757(local287, local303, local335, local279, local295, local327, arg0.anInt3250, arg0.anInt3251, arg0.anInt3246, local101, local21, local245, local123, local51, local89, local121, local169, local265, arg0.anInt3244);
				return;
			}
			local472 = Static79.anInterface3_1.method3054(arg0.anInt3244);
			Static79.method1749(local287, local303, local335, local279, local295, local327, Static138.method2658(local472, arg0.anInt3250), Static138.method2658(local472, arg0.anInt3251), Static138.method2658(local472, arg0.anInt3246));
		} else if (arg0.anInt3250 != 12345678) {
			Static79.method1749(local287, local303, local335, local279, local295, local327, arg0.anInt3250, arg0.anInt3251, arg0.anInt3246);
			return;
		}
	}
}
