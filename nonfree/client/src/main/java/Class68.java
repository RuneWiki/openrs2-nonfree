import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ua")
public final class Class68 {

	@OriginalMember(owner = "client!ua", name = "c", descriptor = "[Lclient!la;")
	private final Class43[] aClass43Array3 = new Class43[5000];

	@OriginalMember(owner = "client!ua", name = "e", descriptor = "I")
	private int anInt2506 = 0;

	@OriginalMember(owner = "client!ua", name = "q", descriptor = "I")
	private int anInt2513 = 0;

	@OriginalMember(owner = "client!ua", name = "O", descriptor = "[[I")
	private final int[][] anIntArrayArray32 = new int[][] { { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 }, { 12, 8, 4, 0, 13, 9, 5, 1, 14, 10, 6, 2, 15, 11, 7, 3 }, { 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 }, { 3, 7, 11, 15, 2, 6, 10, 14, 1, 5, 9, 13, 0, 4, 8, 12 } };

	@OriginalMember(owner = "client!ua", name = "L", descriptor = "[[I")
	private final int[][] anIntArrayArray31 = new int[][] { new int[16], { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 1 }, { 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0 }, { 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1 }, { 1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 1 } };

	@OriginalMember(owner = "client!ua", name = "F", descriptor = "I")
	private final int anInt2524;

	@OriginalMember(owner = "client!ua", name = "n", descriptor = "I")
	private final int anInt2511;

	@OriginalMember(owner = "client!ua", name = "s", descriptor = "I")
	private final int anInt2515;

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "[[[Lclient!me;")
	private final Class1_Sub8[][][] aClass1_Sub8ArrayArrayArray1;

	@OriginalMember(owner = "client!ua", name = "p", descriptor = "[[[I")
	private final int[][][] anIntArrayArrayArray6;

	@OriginalMember(owner = "client!ua", name = "J", descriptor = "[[[I")
	private final int[][][] anIntArrayArrayArray7;

	@OriginalMember(owner = "client!ua", name = "<init>", descriptor = "(III[[[I)V")
	public Class68(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[][][] arg3) {
		this.anInt2524 = arg0;
		this.anInt2511 = arg1;
		this.anInt2515 = arg2;
		this.aClass1_Sub8ArrayArrayArray1 = new Class1_Sub8[arg0][arg1][arg2];
		this.anIntArrayArrayArray6 = new int[arg0][arg1 + 1][arg2 + 1];
		this.anIntArrayArrayArray7 = arg3;
		this.method1768();
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(IIIILclient!ha;IIIIII)V")
	public void method1744(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class1_Sub1_Sub2 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		if (arg4 == null) {
			return;
		}
		@Pc(6) Class9 local6 = new Class9();
		local6.anInt342 = arg9;
		local6.anInt348 = arg10;
		local6.anInt358 = arg1 * 128 + arg7 + 64;
		local6.anInt355 = arg2 * 128 + arg8 + 64;
		local6.anInt345 = arg3;
		local6.aClass1_Sub1_Sub2_1 = arg4;
		local6.anInt356 = arg5;
		local6.anInt344 = arg6;
		for (@Pc(44) int local44 = arg0; local44 >= 0; local44--) {
			if (this.aClass1_Sub8ArrayArrayArray1[local44][arg1][arg2] == null) {
				this.aClass1_Sub8ArrayArrayArray1[local44][arg1][arg2] = new Class1_Sub8(local44, arg1, arg2);
			}
		}
		this.aClass1_Sub8ArrayArrayArray1[arg0][arg1][arg2].aClass9_1 = local6;
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(III)Lclient!bc;")
	public Class9 method1745(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class1_Sub8 local8 = this.aClass1_Sub8ArrayArrayArray1[arg0][arg1][arg2];
		return local8 == null ? null : local8.aClass9_1;
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(Lclient!la;)V")
	private void method1746(@OriginalArg(0) Class43 arg0) {
		for (@Pc(2) int local2 = arg0.anInt1464; local2 <= arg0.anInt1463; local2++) {
			for (@Pc(6) int local6 = arg0.anInt1476; local6 <= arg0.anInt1472; local6++) {
				@Pc(17) Class1_Sub8 local17 = this.aClass1_Sub8ArrayArrayArray1[arg0.anInt1465][local2][local6];
				if (local17 != null) {
					@Pc(36) int local36;
					for (@Pc(21) int local21 = 0; local21 < local17.anInt1585; local21++) {
						if (local17.aClass43Array1[local21] == arg0) {
							local17.anInt1585--;
							for (local36 = local21; local36 < local17.anInt1585; local36++) {
								local17.aClass43Array1[local36] = local17.aClass43Array1[local36 + 1];
								local17.anIntArray237[local36] = local17.anIntArray237[local36 + 1];
							}
							local17.aClass43Array1[local17.anInt1585] = null;
							break;
						}
					}
					local17.anInt1586 = 0;
					for (local36 = 0; local36 < local17.anInt1585; local36++) {
						local17.anInt1586 |= local17.anIntArray237[local36];
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(Lclient!kc;III)V")
	private void method1747(@OriginalArg(0) Class1_Sub1_Sub2_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(14) Class1_Sub8 local14;
		@Pc(29) Class1_Sub1_Sub2_Sub3 local29;
		if (arg2 < this.anInt2511) {
			local14 = this.aClass1_Sub8ArrayArrayArray1[arg1][arg2 + 1][arg3];
			if (local14 != null && local14.aClass62_1 != null && local14.aClass62_1.aClass1_Sub1_Sub2_6 instanceof Class1_Sub1_Sub2_Sub3) {
				local29 = (Class1_Sub1_Sub2_Sub3) local14.aClass62_1.aClass1_Sub1_Sub2_6;
				Static59.method1007(arg0, local29, 128, 0, 0, true);
			}
		}
		if (arg3 < this.anInt2511) {
			local14 = this.aClass1_Sub8ArrayArrayArray1[arg1][arg2][arg3 + 1];
			if (local14 != null && local14.aClass62_1 != null && local14.aClass62_1.aClass1_Sub1_Sub2_6 instanceof Class1_Sub1_Sub2_Sub3) {
				local29 = (Class1_Sub1_Sub2_Sub3) local14.aClass62_1.aClass1_Sub1_Sub2_6;
				Static59.method1007(arg0, local29, 0, 0, 128, true);
			}
		}
		if (arg2 < this.anInt2511 && arg3 < this.anInt2515) {
			local14 = this.aClass1_Sub8ArrayArrayArray1[arg1][arg2 + 1][arg3 + 1];
			if (local14 != null && local14.aClass62_1 != null && local14.aClass62_1.aClass1_Sub1_Sub2_6 instanceof Class1_Sub1_Sub2_Sub3) {
				local29 = (Class1_Sub1_Sub2_Sub3) local14.aClass62_1.aClass1_Sub1_Sub2_6;
				Static59.method1007(arg0, local29, 128, 0, 128, true);
			}
		}
		if (arg2 >= this.anInt2511 || arg3 <= 0) {
			return;
		}
		local14 = this.aClass1_Sub8ArrayArrayArray1[arg1][arg2 + 1][arg3 - 1];
		if (local14 != null && local14.aClass62_1 != null && local14.aClass62_1.aClass1_Sub1_Sub2_6 instanceof Class1_Sub1_Sub2_Sub3) {
			local29 = (Class1_Sub1_Sub2_Sub3) local14.aClass62_1.aClass1_Sub1_Sub2_6;
			Static59.method1007(arg0, local29, 128, 0, -128, true);
		}
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(IIIIILclient!ha;IIIIII)Z")
	public boolean method1748(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) Class1_Sub1_Sub2 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		return arg4 == null ? true : this.method1787(arg0, arg7, arg8, arg9 + 1 - arg7, arg10 - arg8 + 1, arg1, arg2, arg3, arg4, arg5, true, arg6, 0);
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(II)V")
	public void method1749(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class1_Sub8 local8 = this.aClass1_Sub8ArrayArrayArray1[0][arg0][arg1];
		for (@Pc(10) int local10 = 0; local10 < 3; local10++) {
			@Pc(31) Class1_Sub8 local31 = this.aClass1_Sub8ArrayArrayArray1[local10][arg0][arg1] = this.aClass1_Sub8ArrayArrayArray1[local10 + 1][arg0][arg1];
			if (local31 != null) {
				local31.anInt1580--;
				for (@Pc(41) int local41 = 0; local41 < local31.anInt1585; local41++) {
					@Pc(47) Class43 local47 = local31.aClass43Array1[local41];
					if ((local47.anInt1468 >> 29 & 0x3) == 2 && local47.anInt1464 == arg0 && local47.anInt1476 == arg1) {
						local47.anInt1465--;
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

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(Lclient!ob;IIIIII)V")
	private void method1750(@OriginalArg(0) Class55 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(3) int local3 = arg0.anIntArray271.length;
		@Pc(13) int local13;
		@Pc(20) int local20;
		@Pc(27) int local27;
		@Pc(37) int local37;
		for (@Pc(5) int local5 = 0; local5 < local3; local5++) {
			local13 = arg0.anIntArray271[local5] - Static107.anInt2521;
			local20 = arg0.anIntArray260[local5] - Static107.anInt2523;
			local27 = arg0.anIntArray273[local5] - Static107.anInt2530;
			local37 = local27 * arg3 + local13 * arg4 >> 16;
			@Pc(47) int local47 = local27 * arg4 - local13 * arg3 >> 16;
			@Pc(59) int local59 = local20 * arg2 - local47 * arg1 >> 16;
			@Pc(69) int local69 = local20 * arg1 + local47 * arg2 >> 16;
			if (local69 < 50) {
				return;
			}
			if (arg0.anIntArray270 != null) {
				Static76.anIntArray266[local5] = local37;
				Static76.anIntArray265[local5] = local59;
				Static76.anIntArray272[local5] = local69;
			}
			Static76.anIntArray269[local5] = Static112.anInt2715 + (local37 << 9) / local69;
			Static76.anIntArray268[local5] = Static112.anInt2722 + (local59 << 9) / local69;
		}
		Static112.anInt2716 = 0;
		local3 = arg0.anIntArray262.length;
		for (local13 = 0; local13 < local3; local13++) {
			local20 = arg0.anIntArray262[local13];
			local27 = arg0.anIntArray274[local13];
			local37 = arg0.anIntArray267[local13];
			@Pc(142) int local142 = Static76.anIntArray269[local20];
			@Pc(146) int local146 = Static76.anIntArray269[local27];
			@Pc(150) int local150 = Static76.anIntArray269[local37];
			@Pc(154) int local154 = Static76.anIntArray268[local20];
			@Pc(158) int local158 = Static76.anIntArray268[local27];
			@Pc(162) int local162 = Static76.anIntArray268[local37];
			if ((local142 - local146) * (local162 - local158) - (local154 - local158) * (local150 - local146) > 0) {
				Static112.aBoolean160 = false;
				if (local142 < 0 || local146 < 0 || local150 < 0 || local142 > Static112.anInt2721 || local146 > Static112.anInt2721 || local150 > Static112.anInt2721) {
					Static112.aBoolean160 = true;
				}
				if (Static107.aBoolean153 && this.method1784(Static107.anInt2510, Static107.anInt2507, local154, local158, local162, local142, local146, local150)) {
					Static107.anInt2512 = arg5;
					Static107.anInt2514 = arg6;
				}
				if (arg0.anIntArray270 == null || arg0.anIntArray270[local13] == -1) {
					if (arg0.anIntArray263[local13] != 12345678) {
						Static112.method1978(local154, local158, local162, local142, local146, local150, arg0.anIntArray263[local13], arg0.anIntArray261[local13], arg0.anIntArray264[local13]);
					}
				} else if (Static107.aBoolean154) {
					@Pc(364) int local364 = Static112.anInterface2_1.method2090(arg0.anIntArray270[local13]);
					Static112.method1978(local154, local158, local162, local142, local146, local150, Static107.method1792(local364, arg0.anIntArray263[local13]), Static107.method1792(local364, arg0.anIntArray261[local13]), Static107.method1792(local364, arg0.anIntArray264[local13]));
				} else if (arg0.aBoolean109) {
					Static112.method1964(local154, local158, local162, local142, local146, local150, arg0.anIntArray263[local13], arg0.anIntArray261[local13], arg0.anIntArray264[local13], Static76.anIntArray266[0], Static76.anIntArray266[1], Static76.anIntArray266[3], Static76.anIntArray265[0], Static76.anIntArray265[1], Static76.anIntArray265[3], Static76.anIntArray272[0], Static76.anIntArray272[1], Static76.anIntArray272[3], arg0.anIntArray270[local13]);
				} else {
					Static112.method1964(local154, local158, local162, local142, local146, local150, arg0.anIntArray263[local13], arg0.anIntArray261[local13], arg0.anIntArray264[local13], Static76.anIntArray266[local20], Static76.anIntArray266[local27], Static76.anIntArray266[local37], Static76.anIntArray265[local20], Static76.anIntArray265[local27], Static76.anIntArray265[local37], Static76.anIntArray272[local20], Static76.anIntArray272[local27], Static76.anIntArray272[local37], arg0.anIntArray270[local13]);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ua", name = "b", descriptor = "(III)Lclient!ra;")
	public Class62 method1751(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class1_Sub8 local8 = this.aClass1_Sub8ArrayArrayArray1[arg0][arg1][arg2];
		return local8 == null || local8.aClass62_1 == null ? null : local8.aClass62_1;
	}

	@OriginalMember(owner = "client!ua", name = "c", descriptor = "(III)I")
	public int method1752(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class1_Sub8 local8 = this.aClass1_Sub8ArrayArrayArray1[arg0][arg1][arg2];
		return local8 == null || local8.aClass9_1 == null ? 0 : local8.aClass9_1.anInt342;
	}

	@OriginalMember(owner = "client!ua", name = "d", descriptor = "(III)V")
	public void method1753(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class1_Sub8 local8 = this.aClass1_Sub8ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 != null) {
			local8.aClass49_1 = null;
		}
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(IIIIIILclient!ha;III)Z")
	public boolean method1754(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class1_Sub1_Sub2 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		if (arg6 == null) {
			return true;
		} else {
			@Pc(11) int local11 = arg1 * 128 + arg4 * 64;
			@Pc(19) int local19 = arg2 * 128 + arg5 * 64;
			return this.method1787(arg0, arg1, arg2, arg4, arg5, local11, local19, arg3, arg6, arg7, false, arg8, arg9);
		}
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(IIIIII)Z")
	private boolean method1755(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(17) int local17;
		@Pc(21) int local21;
		if (arg1 != arg2 || arg3 != arg4) {
			for (local17 = arg1; local17 <= arg2; local17++) {
				for (local21 = arg3; local21 <= arg4; local21++) {
					if (this.anIntArrayArrayArray6[arg0][local17][local21] == -Static107.anInt2509) {
						return false;
					}
				}
			}
			local21 = (arg1 << 7) + 1;
			@Pc(156) int local156 = (arg3 << 7) + 2;
			@Pc(167) int local167 = this.anIntArrayArrayArray7[arg0][arg1][arg3] - arg5;
			if (!this.method1763(local21, local167, local156)) {
				return false;
			}
			@Pc(181) int local181 = (arg2 << 7) - 1;
			if (!this.method1763(local181, local167, local156)) {
				return false;
			}
			@Pc(195) int local195 = (arg4 << 7) - 1;
			if (!this.method1763(local21, local167, local195)) {
				return false;
			} else if (this.method1763(local181, local167, local195)) {
				return true;
			} else {
				return false;
			}
		} else if (this.method1771(arg0, arg1, arg3)) {
			local17 = arg1 << 7;
			local21 = arg3 << 7;
			return this.method1763(local17 + 1, this.anIntArrayArrayArray7[arg0][arg1][arg3] - arg5, local21 + 1) && this.method1763(local17 + 128 - 1, this.anIntArrayArrayArray7[arg0][arg1 + 1][arg3] - arg5, local21 + 1) && this.method1763(local17 + 128 - 1, this.anIntArrayArrayArray7[arg0][arg1 + 1][arg3 + 1] - arg5, local21 + 128 - 1) && this.method1763(local17 + 1, this.anIntArrayArrayArray7[arg0][arg1][arg3 + 1] - arg5, local21 + 128 - 1);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ua", name = "e", descriptor = "(III)V")
	public void method1756(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class1_Sub8 local8 = this.aClass1_Sub8ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 == null) {
			return;
		}
		for (@Pc(13) int local13 = 0; local13 < local8.anInt1585; local13++) {
			@Pc(19) Class43 local19 = local8.aClass43Array1[local13];
			if ((local19.anInt1468 >> 29 & 0x3) == 2 && local19.anInt1464 == arg1 && local19.anInt1476 == arg2) {
				this.method1746(local19);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(IIII)Z")
	private boolean method1757(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!this.method1771(arg0, arg1, arg2)) {
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
				if (local11 > Static107.anInt2521) {
					if (!this.method1763(local11, local26, local15)) {
						return false;
					}
					if (!this.method1763(local11, local26, local15 + 128)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!this.method1763(local11, local30, local15)) {
						return false;
					}
					if (!this.method1763(local11, local30, local15 + 128)) {
						return false;
					}
				}
				if (!this.method1763(local11, local34, local15)) {
					return false;
				}
				if (!this.method1763(local11, local34, local15 + 128)) {
					return false;
				}
				return true;
			}
			if (arg3 == 2) {
				if (local15 < Static107.anInt2530) {
					if (!this.method1763(local11, local26, local15 + 128)) {
						return false;
					}
					if (!this.method1763(local11 + 128, local26, local15 + 128)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!this.method1763(local11, local30, local15 + 128)) {
						return false;
					}
					if (!this.method1763(local11 + 128, local30, local15 + 128)) {
						return false;
					}
				}
				if (!this.method1763(local11, local34, local15 + 128)) {
					return false;
				}
				if (!this.method1763(local11 + 128, local34, local15 + 128)) {
					return false;
				}
				return true;
			}
			if (arg3 == 4) {
				if (local11 < Static107.anInt2521) {
					if (!this.method1763(local11 + 128, local26, local15)) {
						return false;
					}
					if (!this.method1763(local11 + 128, local26, local15 + 128)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!this.method1763(local11 + 128, local30, local15)) {
						return false;
					}
					if (!this.method1763(local11 + 128, local30, local15 + 128)) {
						return false;
					}
				}
				if (!this.method1763(local11 + 128, local34, local15)) {
					return false;
				}
				if (!this.method1763(local11 + 128, local34, local15 + 128)) {
					return false;
				}
				return true;
			}
			if (arg3 == 8) {
				if (local15 > Static107.anInt2530) {
					if (!this.method1763(local11, local26, local15)) {
						return false;
					}
					if (!this.method1763(local11 + 128, local26, local15)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!this.method1763(local11, local30, local15)) {
						return false;
					}
					if (!this.method1763(local11 + 128, local30, local15)) {
						return false;
					}
				}
				if (!this.method1763(local11, local34, local15)) {
					return false;
				}
				if (!this.method1763(local11 + 128, local34, local15)) {
					return false;
				}
				return true;
			}
		}
		if (!this.method1763(local11 + 64, local38, local15 + 64)) {
			return false;
		} else if (arg3 == 16) {
			return this.method1763(local11, local34, local15 + 128);
		} else if (arg3 == 32) {
			return this.method1763(local11 + 128, local34, local15 + 128);
		} else if (arg3 == 64) {
			return this.method1763(local11 + 128, local34, local15);
		} else if (arg3 == 128) {
			return this.method1763(local11, local34, local15);
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!ua", name = "f", descriptor = "(III)V")
	public void method1758(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class1_Sub8 local8 = this.aClass1_Sub8ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 != null) {
			local8.aClass67_1 = null;
		}
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(Lclient!nb;IIIIIII)V")
	private void method1759(@OriginalArg(0) Class51 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(6) int local6;
		@Pc(7) int local7 = local6 = (arg6 << 7) - Static107.anInt2521;
		@Pc(14) int local14;
		@Pc(15) int local15 = local14 = (arg7 << 7) - Static107.anInt2530;
		@Pc(20) int local20;
		@Pc(21) int local21 = local20 = local7 + 128;
		@Pc(26) int local26;
		@Pc(27) int local27 = local26 = local15 + 128;
		@Pc(38) int local38 = this.anIntArrayArrayArray7[arg1][arg6][arg7] - Static107.anInt2523;
		@Pc(51) int local51 = this.anIntArrayArrayArray7[arg1][arg6 + 1][arg7] - Static107.anInt2523;
		@Pc(66) int local66 = this.anIntArrayArrayArray7[arg1][arg6 + 1][arg7 + 1] - Static107.anInt2523;
		@Pc(79) int local79 = this.anIntArrayArrayArray7[arg1][arg6][arg7 + 1] - Static107.anInt2523;
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
		@Pc(279) int local279 = Static112.anInt2715 + (local101 << 9) / local121;
		@Pc(287) int local287 = Static112.anInt2722 + (local123 << 9) / local121;
		@Pc(295) int local295 = Static112.anInt2715 + (local21 << 9) / local169;
		@Pc(303) int local303 = Static112.anInt2722 + (local51 << 9) / local169;
		@Pc(311) int local311 = Static112.anInt2715 + (local197 << 9) / local27;
		@Pc(319) int local319 = Static112.anInt2722 + (local66 << 9) / local27;
		@Pc(327) int local327 = Static112.anInt2715 + (local245 << 9) / local265;
		@Pc(335) int local335 = Static112.anInt2722 + (local89 << 9) / local265;
		Static112.anInt2716 = 0;
		@Pc(472) int local472;
		if ((local311 - local327) * (local303 - local335) - (local319 - local335) * (local295 - local327) > 0) {
			Static112.aBoolean160 = false;
			if (local311 < 0 || local327 < 0 || local295 < 0 || local311 > Static112.anInt2721 || local327 > Static112.anInt2721 || local295 > Static112.anInt2721) {
				Static112.aBoolean160 = true;
			}
			if (Static107.aBoolean153 && this.method1784(Static107.anInt2510, Static107.anInt2507, local319, local335, local303, local311, local327, local295)) {
				Static107.anInt2512 = arg6;
				Static107.anInt2514 = arg7;
			}
			if (arg0.anInt1633 == -1) {
				if (arg0.anInt1636 != 12345678) {
					Static112.method1978(local319, local335, local303, local311, local327, local295, arg0.anInt1636, arg0.anInt1638, arg0.anInt1644);
				}
			} else if (Static107.aBoolean154) {
				local472 = Static112.anInterface2_1.method2090(arg0.anInt1633);
				Static112.method1978(local319, local335, local303, local311, local327, local295, Static107.method1792(local472, arg0.anInt1636), Static107.method1792(local472, arg0.anInt1638), Static107.method1792(local472, arg0.anInt1644));
			} else if (arg0.aBoolean91) {
				Static112.method1964(local319, local335, local303, local311, local327, local295, arg0.anInt1636, arg0.anInt1638, arg0.anInt1644, local101, local21, local245, local123, local51, local89, local121, local169, local265, arg0.anInt1633);
			} else {
				Static112.method1964(local319, local335, local303, local311, local327, local295, arg0.anInt1636, arg0.anInt1638, arg0.anInt1644, local197, local245, local21, local66, local89, local51, local27, local265, local169, arg0.anInt1633);
			}
		}
		if ((local279 - local295) * (local335 - local303) - (local287 - local303) * (local327 - local295) <= 0) {
			return;
		}
		Static112.aBoolean160 = false;
		if (local279 < 0 || local295 < 0 || local327 < 0 || local279 > Static112.anInt2721 || local295 > Static112.anInt2721 || local327 > Static112.anInt2721) {
			Static112.aBoolean160 = true;
		}
		if (Static107.aBoolean153 && this.method1784(Static107.anInt2510, Static107.anInt2507, local287, local303, local335, local279, local295, local327)) {
			Static107.anInt2512 = arg6;
			Static107.anInt2514 = arg7;
		}
		if (arg0.anInt1633 != -1) {
			if (!Static107.aBoolean154) {
				Static112.method1964(local287, local303, local335, local279, local295, local327, arg0.anInt1637, arg0.anInt1644, arg0.anInt1638, local101, local21, local245, local123, local51, local89, local121, local169, local265, arg0.anInt1633);
				return;
			}
			local472 = Static112.anInterface2_1.method2090(arg0.anInt1633);
			Static112.method1978(local287, local303, local335, local279, local295, local327, Static107.method1792(local472, arg0.anInt1637), Static107.method1792(local472, arg0.anInt1644), Static107.method1792(local472, arg0.anInt1638));
		} else if (arg0.anInt1637 != 12345678) {
			Static112.method1978(local287, local303, local335, local279, local295, local327, arg0.anInt1637, arg0.anInt1644, arg0.anInt1638);
			return;
		}
	}

	@OriginalMember(owner = "client!ua", name = "b", descriptor = "(IIII)I")
	public int method1760(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(8) Class1_Sub8 local8 = this.aClass1_Sub8ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 == null) {
			return -1;
		} else if (local8.aClass67_1 != null && local8.aClass67_1.anInt2226 == arg3) {
			return local8.aClass67_1.anInt2221 & 0xFF;
		} else if (local8.aClass9_1 != null && local8.aClass9_1.anInt342 == arg3) {
			return local8.aClass9_1.anInt348 & 0xFF;
		} else if (local8.aClass62_1 != null && local8.aClass62_1.anInt2039 == arg3) {
			return local8.aClass62_1.anInt2036 & 0xFF;
		} else {
			for (@Pc(56) int local56 = 0; local56 < local8.anInt1585; local56++) {
				if (local8.aClass43Array1[local56].anInt1468 == arg3) {
					return local8.aClass43Array1[local56].anInt1471 & 0xFF;
				}
			}
			return -1;
		}
	}

	@OriginalMember(owner = "client!ua", name = "g", descriptor = "(III)V")
	public void method1761() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt2524; local1++) {
			for (@Pc(4) int local4 = 0; local4 < this.anInt2511; local4++) {
				for (@Pc(7) int local7 = 0; local7 < this.anInt2515; local7++) {
					@Pc(17) Class1_Sub8 local17 = this.aClass1_Sub8ArrayArrayArray1[local1][local4][local7];
					if (local17 != null) {
						@Pc(22) Class67 local22 = local17.aClass67_1;
						if (local22 != null && local22.aClass1_Sub1_Sub2_7 instanceof Class1_Sub1_Sub2_Sub3) {
							@Pc(32) Class1_Sub1_Sub2_Sub3 local32 = (Class1_Sub1_Sub2_Sub3) local22.aClass1_Sub1_Sub2_7;
							this.method1778(local32, local1, local4, local7, 1, 1);
							if (local22.aClass1_Sub1_Sub2_8 instanceof Class1_Sub1_Sub2_Sub3) {
								@Pc(48) Class1_Sub1_Sub2_Sub3 local48 = (Class1_Sub1_Sub2_Sub3) local22.aClass1_Sub1_Sub2_8;
								this.method1778(local48, local1, local4, local7, 1, 1);
								Static59.method1007(local32, local48, 0, 0, 0, false);
								local22.aClass1_Sub1_Sub2_8 = local48.method1002(local48.aShort2, local48.aShort1, -50, -10, -50);
							}
							local22.aClass1_Sub1_Sub2_7 = local32.method1002(local32.aShort2, local32.aShort1, -50, -10, -50);
						}
						@Pc(103) Class1_Sub1_Sub2_Sub3 local103;
						for (@Pc(87) int local87 = 0; local87 < local17.anInt1585; local87++) {
							@Pc(93) Class43 local93 = local17.aClass43Array1[local87];
							if (local93 != null && local93.aClass1_Sub1_Sub2_2 instanceof Class1_Sub1_Sub2_Sub3) {
								local103 = (Class1_Sub1_Sub2_Sub3) local93.aClass1_Sub1_Sub2_2;
								this.method1778(local103, local1, local4, local7, local93.anInt1463 + 1 - local93.anInt1464, local93.anInt1472 - local93.anInt1476 + 1);
								local93.aClass1_Sub1_Sub2_2 = local103.method1002(local103.aShort2, local103.aShort1, -50, -10, -50);
							}
						}
						@Pc(142) Class62 local142 = local17.aClass62_1;
						if (local142 != null && local142.aClass1_Sub1_Sub2_6 instanceof Class1_Sub1_Sub2_Sub3) {
							local103 = (Class1_Sub1_Sub2_Sub3) local142.aClass1_Sub1_Sub2_6;
							this.method1747(local103, local1, local4, local7);
							local142.aClass1_Sub1_Sub2_6 = local103.method1002(local103.aShort2, local103.aShort1, -50, -10, -50);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ua", name = "h", descriptor = "(III)Z")
	private boolean method1763(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < Static107.anInt2517; local1++) {
			@Pc(6) Class61 local6 = Static107.aClass61Array1[local1];
			@Pc(15) int local15;
			@Pc(27) int local27;
			@Pc(37) int local37;
			@Pc(47) int local47;
			@Pc(57) int local57;
			if (local6.anInt2025 == 1) {
				local15 = local6.anInt2012 - arg0;
				if (local15 > 0) {
					local27 = local6.anInt2031 + (local6.anInt2023 * local15 >> 8);
					local37 = local6.anInt2015 + (local6.anInt2035 * local15 >> 8);
					local47 = local6.anInt2021 + (local6.anInt2017 * local15 >> 8);
					local57 = local6.anInt2010 + (local6.anInt2018 * local15 >> 8);
					if (arg2 >= local27 && arg2 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt2025 == 2) {
				local15 = arg0 - local6.anInt2012;
				if (local15 > 0) {
					local27 = local6.anInt2031 + (local6.anInt2023 * local15 >> 8);
					local37 = local6.anInt2015 + (local6.anInt2035 * local15 >> 8);
					local47 = local6.anInt2021 + (local6.anInt2017 * local15 >> 8);
					local57 = local6.anInt2010 + (local6.anInt2018 * local15 >> 8);
					if (arg2 >= local27 && arg2 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt2025 == 3) {
				local15 = local6.anInt2031 - arg2;
				if (local15 > 0) {
					local27 = local6.anInt2012 + (local6.anInt2020 * local15 >> 8);
					local37 = local6.anInt2011 + (local6.anInt2032 * local15 >> 8);
					local47 = local6.anInt2021 + (local6.anInt2017 * local15 >> 8);
					local57 = local6.anInt2010 + (local6.anInt2018 * local15 >> 8);
					if (arg0 >= local27 && arg0 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt2025 == 4) {
				local15 = arg2 - local6.anInt2031;
				if (local15 > 0) {
					local27 = local6.anInt2012 + (local6.anInt2020 * local15 >> 8);
					local37 = local6.anInt2011 + (local6.anInt2032 * local15 >> 8);
					local47 = local6.anInt2021 + (local6.anInt2017 * local15 >> 8);
					local57 = local6.anInt2010 + (local6.anInt2018 * local15 >> 8);
					if (arg0 >= local27 && arg0 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt2025 == 5) {
				local15 = arg1 - local6.anInt2021;
				if (local15 > 0) {
					local27 = local6.anInt2012 + (local6.anInt2020 * local15 >> 8);
					local37 = local6.anInt2011 + (local6.anInt2032 * local15 >> 8);
					local47 = local6.anInt2031 + (local6.anInt2023 * local15 >> 8);
					local57 = local6.anInt2015 + (local6.anInt2035 * local15 >> 8);
					if (arg0 >= local27 && arg0 <= local37 && arg2 >= local47 && arg2 <= local57) {
						return true;
					}
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "()V")
	private void method1764() {
		@Pc(3) int local3 = Static107.anIntArray366[Static107.anInt2531];
		@Pc(7) Class61[] local7 = Static107.aClass61ArrayArray1[Static107.anInt2531];
		Static107.anInt2517 = 0;
		for (@Pc(11) int local11 = 0; local11 < local3; local11++) {
			@Pc(16) Class61 local16 = local7[local11];
			@Pc(27) int local27;
			@Pc(40) int local40;
			@Pc(51) int local51;
			@Pc(79) int local79;
			@Pc(58) boolean local58;
			if (local16.anInt2030 == 1) {
				local27 = local16.anInt2014 + 25 - Static107.anInt2522;
				if (local27 >= 0 && local27 <= 50) {
					local40 = local16.anInt2027 + 25 - Static107.anInt2532;
					if (local40 < 0) {
						local40 = 0;
					}
					local51 = local16.anInt2029 + 25 - Static107.anInt2532;
					if (local51 > 50) {
						local51 = 50;
					}
					local58 = false;
					while (local40 <= local51) {
						if (Static107.aBooleanArrayArray1[local27][local40++]) {
							local58 = true;
							break;
						}
					}
					if (local58) {
						local79 = Static107.anInt2521 - local16.anInt2012;
						if (local79 > 32) {
							local16.anInt2025 = 1;
						} else {
							if (local79 >= -32) {
								continue;
							}
							local16.anInt2025 = 2;
							local79 = -local79;
						}
						local16.anInt2023 = (local16.anInt2031 - Static107.anInt2530 << 8) / local79;
						local16.anInt2035 = (local16.anInt2015 - Static107.anInt2530 << 8) / local79;
						local16.anInt2017 = (local16.anInt2021 - Static107.anInt2523 << 8) / local79;
						local16.anInt2018 = (local16.anInt2010 - Static107.anInt2523 << 8) / local79;
						Static107.aClass61Array1[Static107.anInt2517++] = local16;
					}
				}
			} else if (local16.anInt2030 == 2) {
				local27 = local16.anInt2027 + 25 - Static107.anInt2532;
				if (local27 >= 0 && local27 <= 50) {
					local40 = local16.anInt2014 + 25 - Static107.anInt2522;
					if (local40 < 0) {
						local40 = 0;
					}
					local51 = local16.anInt2022 + 25 - Static107.anInt2522;
					if (local51 > 50) {
						local51 = 50;
					}
					local58 = false;
					while (local40 <= local51) {
						if (Static107.aBooleanArrayArray1[local40++][local27]) {
							local58 = true;
							break;
						}
					}
					if (local58) {
						local79 = Static107.anInt2530 - local16.anInt2031;
						if (local79 > 32) {
							local16.anInt2025 = 3;
						} else {
							if (local79 >= -32) {
								continue;
							}
							local16.anInt2025 = 4;
							local79 = -local79;
						}
						local16.anInt2020 = (local16.anInt2012 - Static107.anInt2521 << 8) / local79;
						local16.anInt2032 = (local16.anInt2011 - Static107.anInt2521 << 8) / local79;
						local16.anInt2017 = (local16.anInt2021 - Static107.anInt2523 << 8) / local79;
						local16.anInt2018 = (local16.anInt2010 - Static107.anInt2523 << 8) / local79;
						Static107.aClass61Array1[Static107.anInt2517++] = local16;
					}
				}
			} else if (local16.anInt2030 == 4) {
				local27 = local16.anInt2021 - Static107.anInt2523;
				if (local27 > 128) {
					local40 = local16.anInt2027 + 25 - Static107.anInt2532;
					if (local40 < 0) {
						local40 = 0;
					}
					local51 = local16.anInt2029 + 25 - Static107.anInt2532;
					if (local51 > 50) {
						local51 = 50;
					}
					if (local40 <= local51) {
						@Pc(319) int local319 = local16.anInt2014 + 25 - Static107.anInt2522;
						if (local319 < 0) {
							local319 = 0;
						}
						local79 = local16.anInt2022 + 25 - Static107.anInt2522;
						if (local79 > 50) {
							local79 = 50;
						}
						@Pc(337) boolean local337 = false;
						label142: for (@Pc(339) int local339 = local319; local339 <= local79; local339++) {
							for (@Pc(342) int local342 = local40; local342 <= local51; local342++) {
								if (Static107.aBooleanArrayArray1[local339][local342]) {
									local337 = true;
									break label142;
								}
							}
						}
						if (local337) {
							local16.anInt2025 = 5;
							local16.anInt2020 = (local16.anInt2012 - Static107.anInt2521 << 8) / local27;
							local16.anInt2032 = (local16.anInt2011 - Static107.anInt2521 << 8) / local27;
							local16.anInt2023 = (local16.anInt2031 - Static107.anInt2530 << 8) / local27;
							local16.anInt2035 = (local16.anInt2015 - Static107.anInt2530 << 8) / local27;
							Static107.aClass61Array1[Static107.anInt2517++] = local16;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(IIIIILclient!ha;IIZ)Z")
	public boolean method1765(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class1_Sub1_Sub2 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8) {
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
		return this.method1787(arg0, local7, local11, local15 + 1 - local7, local19 - local11 + 1, arg1, arg2, arg3, arg5, arg6, true, arg7, 0);
	}

	@OriginalMember(owner = "client!ua", name = "c", descriptor = "()V")
	public void method1768() {
		@Pc(4) int local4;
		@Pc(7) int local7;
		for (@Pc(1) int local1 = 0; local1 < this.anInt2524; local1++) {
			for (local4 = 0; local4 < this.anInt2511; local4++) {
				for (local7 = 0; local7 < this.anInt2515; local7++) {
					this.aClass1_Sub8ArrayArrayArray1[local1][local4][local7] = null;
				}
			}
		}
		for (local4 = 0; local4 < Static107.anInt2516; local4++) {
			for (local7 = 0; local7 < Static107.anIntArray366[local4]; local7++) {
				Static107.aClass61ArrayArray1[local4][local7] = null;
			}
			Static107.anIntArray366[local4] = 0;
		}
		for (local7 = 0; local7 < this.anInt2513; local7++) {
			this.aClass43Array3[local7] = null;
		}
		this.anInt2513 = 0;
		for (@Pc(76) int local76 = 0; local76 < Static107.aClass43Array2.length; local76++) {
			Static107.aClass43Array2[local76] = null;
		}
	}

	@OriginalMember(owner = "client!ua", name = "j", descriptor = "(III)V")
	public void method1769(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class1_Sub8 local8 = this.aClass1_Sub8ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 != null) {
			local8.aClass62_1 = null;
		}
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(IIIILclient!ha;ILclient!ha;Lclient!ha;)V")
	public void method1770(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class1_Sub1_Sub2 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class1_Sub1_Sub2 arg6, @OriginalArg(7) Class1_Sub1_Sub2 arg7) {
		@Pc(3) Class49 local3 = new Class49();
		local3.aClass1_Sub1_Sub2_3 = arg4;
		local3.anInt1538 = arg1 * 128 + 64;
		local3.anInt1544 = arg2 * 128 + 64;
		local3.anInt1541 = arg3;
		local3.anInt1545 = arg5;
		local3.aClass1_Sub1_Sub2_5 = arg6;
		local3.aClass1_Sub1_Sub2_4 = arg7;
		@Pc(34) int local34 = 0;
		@Pc(43) Class1_Sub8 local43 = this.aClass1_Sub8ArrayArrayArray1[arg0][arg1][arg2];
		if (local43 != null) {
			for (@Pc(47) int local47 = 0; local47 < local43.anInt1585; local47++) {
				if ((local43.aClass43Array1[local47].anInt1471 & 0x100) == 256 && local43.aClass43Array1[local47].aClass1_Sub1_Sub2_2 instanceof Class1_Sub1_Sub2_Sub7) {
					@Pc(71) Class1_Sub1_Sub2_Sub7 local71 = (Class1_Sub1_Sub2_Sub7) local43.aClass43Array1[local47].aClass1_Sub1_Sub2_2;
					local71.method1919();
					if (local71.anInt2678 > local34) {
						local34 = local71.anInt2678;
					}
				}
			}
		}
		local3.anInt1537 = local34;
		if (this.aClass1_Sub8ArrayArrayArray1[arg0][arg1][arg2] == null) {
			this.aClass1_Sub8ArrayArrayArray1[arg0][arg1][arg2] = new Class1_Sub8(arg0, arg1, arg2);
		}
		this.aClass1_Sub8ArrayArrayArray1[arg0][arg1][arg2].aClass49_1 = local3;
	}

	@OriginalMember(owner = "client!ua", name = "k", descriptor = "(III)Z")
	private boolean method1771(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) int local8 = this.anIntArrayArrayArray6[arg0][arg1][arg2];
		if (local8 == -Static107.anInt2509) {
			return false;
		} else if (local8 == Static107.anInt2509) {
			return true;
		} else {
			@Pc(23) int local23 = arg1 << 7;
			@Pc(27) int local27 = arg2 << 7;
			if (this.method1763(local23 + 1, this.anIntArrayArrayArray7[arg0][arg1][arg2], local27 + 1) && this.method1763(local23 + 128 - 1, this.anIntArrayArrayArray7[arg0][arg1 + 1][arg2], local27 + 1) && this.method1763(local23 + 128 - 1, this.anIntArrayArrayArray7[arg0][arg1 + 1][arg2 + 1], local27 + 128 - 1) && this.method1763(local23 + 1, this.anIntArrayArrayArray7[arg0][arg1][arg2 + 1], local27 + 128 - 1)) {
				this.anIntArrayArrayArray6[arg0][arg1][arg2] = Static107.anInt2509;
				return true;
			} else {
				this.anIntArrayArrayArray6[arg0][arg1][arg2] = -Static107.anInt2509;
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(IIIILclient!ha;II)V")
	public void method1772(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class1_Sub1_Sub2 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (arg4 == null) {
			return;
		}
		@Pc(6) Class62 local6 = new Class62();
		local6.aClass1_Sub1_Sub2_6 = arg4;
		local6.anInt2038 = arg1 * 128 + 64;
		local6.anInt2042 = arg2 * 128 + 64;
		local6.anInt2040 = arg3;
		local6.anInt2039 = arg5;
		local6.anInt2036 = arg6;
		if (this.aClass1_Sub8ArrayArrayArray1[arg0][arg1][arg2] == null) {
			this.aClass1_Sub8ArrayArrayArray1[arg0][arg1][arg2] = new Class1_Sub8(arg0, arg1, arg2);
		}
		this.aClass1_Sub8ArrayArrayArray1[arg0][arg1][arg2].aClass62_1 = local6;
	}

	@OriginalMember(owner = "client!ua", name = "l", descriptor = "(III)Lclient!la;")
	public Class43 method1773(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class1_Sub8 local8 = this.aClass1_Sub8ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 == null) {
			return null;
		}
		for (@Pc(14) int local14 = 0; local14 < local8.anInt1585; local14++) {
			@Pc(20) Class43 local20 = local8.aClass43Array1[local14];
			if ((local20.anInt1468 >> 29 & 0x3) == 2 && local20.anInt1464 == arg1 && local20.anInt1476 == arg2) {
				return local20;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!ua", name = "c", descriptor = "(IIII)Z")
	private boolean method1774(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.method1771(arg0, arg1, arg2)) {
			@Pc(11) int local11 = arg1 << 7;
			@Pc(15) int local15 = arg2 << 7;
			return this.method1763(local11 + 1, this.anIntArrayArrayArray7[arg0][arg1][arg2] - arg3, local15 + 1) && this.method1763(local11 + 128 - 1, this.anIntArrayArrayArray7[arg0][arg1 + 1][arg2] - arg3, local15 + 1) && this.method1763(local11 + 128 - 1, this.anIntArrayArrayArray7[arg0][arg1 + 1][arg2 + 1] - arg3, local15 + 128 - 1) && this.method1763(local11 + 1, this.anIntArrayArrayArray7[arg0][arg1][arg2 + 1] - arg3, local15 + 128 - 1);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ua", name = "m", descriptor = "(III)V")
	public void method1775(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class1_Sub8 local8 = this.aClass1_Sub8ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 != null) {
			local8.aClass9_1 = null;
		}
	}

	@OriginalMember(owner = "client!ua", name = "n", descriptor = "(III)Lclient!t;")
	public Class67 method1776(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class1_Sub8 local8 = this.aClass1_Sub8ArrayArrayArray1[arg0][arg1][arg2];
		return local8 == null ? null : local8.aClass67_1;
	}

	@OriginalMember(owner = "client!ua", name = "d", descriptor = "()V")
	public void method1777() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt2513; local1++) {
			@Pc(7) Class43 local7 = this.aClass43Array3[local1];
			this.method1746(local7);
			this.aClass43Array3[local1] = null;
		}
		this.anInt2513 = 0;
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(Lclient!kc;IIIII)V")
	private void method1778(@OriginalArg(0) Class1_Sub1_Sub2_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(1) boolean local1 = true;
		@Pc(3) int local3 = arg2;
		@Pc(7) int local7 = arg2 + arg4;
		@Pc(11) int local11 = arg3 - 1;
		@Pc(15) int local15 = arg3 + arg5;
		for (@Pc(17) int local17 = arg1; local17 <= arg1 + 1; local17++) {
			if (local17 != this.anInt2524) {
				for (@Pc(24) int local24 = local3; local24 <= local7; local24++) {
					if (local24 >= 0 && local24 < this.anInt2511) {
						for (@Pc(34) int local34 = local11; local34 <= local15; local34++) {
							if (local34 >= 0 && local34 < this.anInt2515 && (!local1 || local24 >= local7 || local34 >= local15 || local34 < arg3 && local24 != arg2)) {
								@Pc(66) Class1_Sub8 local66 = this.aClass1_Sub8ArrayArrayArray1[local17][local24][local34];
								if (local66 != null) {
									@Pc(160) int local160 = (this.anIntArrayArrayArray7[local17][local24][local34] + this.anIntArrayArrayArray7[local17][local24 + 1][local34] + this.anIntArrayArrayArray7[local17][local24][local34 + 1] + this.anIntArrayArrayArray7[local17][local24 + 1][local34 + 1]) / 4 - (this.anIntArrayArrayArray7[arg1][arg2][arg3] + this.anIntArrayArrayArray7[arg1][arg2 + 1][arg3] + this.anIntArrayArrayArray7[arg1][arg2][arg3 + 1] + this.anIntArrayArrayArray7[arg1][arg2 + 1][arg3 + 1]) / 4;
									@Pc(163) Class67 local163 = local66.aClass67_1;
									if (local163 != null) {
										@Pc(173) Class1_Sub1_Sub2_Sub3 local173;
										if (local163.aClass1_Sub1_Sub2_7 instanceof Class1_Sub1_Sub2_Sub3) {
											local173 = (Class1_Sub1_Sub2_Sub3) local163.aClass1_Sub1_Sub2_7;
											Static59.method1007(arg0, local173, (local24 - arg2) * 128 + (1 - arg4) * 64, local160, (local34 - arg3) * 128 + (1 - arg5) * 64, local1);
										}
										if (local163.aClass1_Sub1_Sub2_8 instanceof Class1_Sub1_Sub2_Sub3) {
											local173 = (Class1_Sub1_Sub2_Sub3) local163.aClass1_Sub1_Sub2_8;
											Static59.method1007(arg0, local173, (local24 - arg2) * 128 + (1 - arg4) * 64, local160, (local34 - arg3) * 128 + (1 - arg5) * 64, local1);
										}
									}
									for (@Pc(237) int local237 = 0; local237 < local66.anInt1585; local237++) {
										@Pc(243) Class43 local243 = local66.aClass43Array1[local237];
										if (local243 != null && local243.aClass1_Sub1_Sub2_2 instanceof Class1_Sub1_Sub2_Sub3) {
											@Pc(253) Class1_Sub1_Sub2_Sub3 local253 = (Class1_Sub1_Sub2_Sub3) local243.aClass1_Sub1_Sub2_2;
											@Pc(261) int local261 = local243.anInt1463 + 1 - local243.anInt1464;
											@Pc(269) int local269 = local243.anInt1472 + 1 - local243.anInt1476;
											Static59.method1007(arg0, local253, (local243.anInt1464 - arg2) * 128 + (local261 - arg4) * 64, local160, (local243.anInt1476 - arg3) * 128 + (local269 - arg5) * 64, local1);
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

	@OriginalMember(owner = "client!ua", name = "o", descriptor = "(III)I")
	public int method1779(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class1_Sub8 local8 = this.aClass1_Sub8ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 == null) {
			return 0;
		}
		for (@Pc(14) int local14 = 0; local14 < local8.anInt1585; local14++) {
			@Pc(20) Class43 local20 = local8.aClass43Array1[local14];
			if ((local20.anInt1468 >> 29 & 0x3) == 2 && local20.anInt1464 == arg1 && local20.anInt1476 == arg2) {
				return local20.anInt1468;
			}
		}
		return 0;
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(IIIILclient!ha;Lclient!ha;IIII)V")
	public void method1780(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class1_Sub1_Sub2 arg4, @OriginalArg(5) Class1_Sub1_Sub2 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		if (arg4 == null && arg5 == null) {
			return;
		}
		@Pc(8) Class67 local8 = new Class67();
		local8.anInt2226 = arg8;
		local8.anInt2221 = arg9;
		local8.anInt2227 = arg1 * 128 + 64;
		local8.anInt2228 = arg2 * 128 + 64;
		local8.anInt2219 = arg3;
		local8.aClass1_Sub1_Sub2_7 = arg4;
		local8.aClass1_Sub1_Sub2_8 = arg5;
		local8.anInt2213 = arg6;
		local8.anInt2229 = arg7;
		for (@Pc(45) int local45 = arg0; local45 >= 0; local45--) {
			if (this.aClass1_Sub8ArrayArrayArray1[local45][arg1][arg2] == null) {
				this.aClass1_Sub8ArrayArrayArray1[local45][arg1][arg2] = new Class1_Sub8(local45, arg1, arg2);
			}
		}
		this.aClass1_Sub8ArrayArrayArray1[arg0][arg1][arg2].aClass67_1 = local8;
	}

	@OriginalMember(owner = "client!ua", name = "d", descriptor = "(IIII)V")
	public void method1781(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(8) Class1_Sub8 local8 = this.aClass1_Sub8ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 != null) {
			this.aClass1_Sub8ArrayArrayArray1[arg0][arg1][arg2].anInt1592 = arg3;
		}
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(Lclient!me;Z)V")
	private void method1782(@OriginalArg(0) Class1_Sub8 arg0, @OriginalArg(1) boolean arg1) {
		Static107.aClass50_13.method1142(arg0);
		while (true) {
			@Pc(8) Class1_Sub8 local8;
			@Pc(17) int local17;
			@Pc(20) int local20;
			@Pc(23) int local23;
			@Pc(26) int local26;
			@Pc(31) Class1_Sub8[][] local31;
			@Pc(49) Class1_Sub8 local49;
			@Pc(251) int local251;
			@Pc(588) int local588;
			@Pc(593) int local593;
			@Pc(598) int local598;
			@Pc(601) int local601;
			@Pc(610) int local610;
			@Pc(952) Class67 local952;
			@Pc(1126) int local1126;
			@Pc(1011) int local1011;
			do {
				do {
					do {
						do {
							do {
								do {
									while (true) {
										@Pc(257) Class43 var12;
										@Pc(622) int var19;
										@Pc(345) int var23;
										@Pc(289) boolean var24;
										@Pc(833) Class1_Sub8 var35;
										while (true) {
											do {
												local8 = (Class1_Sub8) Static107.aClass50_13.method1150();
												if (local8 == null) {
													return;
												}
											} while (!local8.aBoolean88);
											local17 = local8.anInt1579;
											local20 = local8.anInt1589;
											local23 = local8.anInt1580;
											local26 = local8.anInt1587;
											local31 = this.aClass1_Sub8ArrayArrayArray1[local23];
											if (!local8.aBoolean86) {
												break;
											}
											if (arg1) {
												if (local23 > 0) {
													local49 = this.aClass1_Sub8ArrayArrayArray1[local23 - 1][local17][local20];
													if (local49 != null && local49.aBoolean88) {
														continue;
													}
												}
												if (local17 <= Static107.anInt2522 && local17 > Static107.anInt2519) {
													local49 = local31[local17 - 1][local20];
													if (local49 != null && local49.aBoolean88 && (local49.aBoolean86 || (local8.anInt1586 & 0x1) == 0)) {
														continue;
													}
												}
												if (local17 >= Static107.anInt2522 && local17 < Static107.anInt2518 - 1) {
													local49 = local31[local17 + 1][local20];
													if (local49 != null && local49.aBoolean88 && (local49.aBoolean86 || (local8.anInt1586 & 0x4) == 0)) {
														continue;
													}
												}
												if (local20 <= Static107.anInt2532 && local20 > Static107.anInt2525) {
													local49 = local31[local17][local20 - 1];
													if (local49 != null && local49.aBoolean88 && (local49.aBoolean86 || (local8.anInt1586 & 0x8) == 0)) {
														continue;
													}
												}
												if (local20 >= Static107.anInt2532 && local20 < Static107.anInt2526 - 1) {
													local49 = local31[local17][local20 + 1];
													if (local49 != null && local49.aBoolean88 && (local49.aBoolean86 || (local8.anInt1586 & 0x2) == 0)) {
														continue;
													}
												}
											} else {
												arg1 = true;
											}
											local8.aBoolean86 = false;
											if (local8.aClass1_Sub8_1 != null) {
												local49 = local8.aClass1_Sub8_1;
												if (local49.aClass51_1 == null) {
													if (local49.aClass55_1 != null && !this.method1771(0, local17, local20)) {
														this.method1750(local49.aClass55_1, Static107.anInt2508, Static107.anInt2520, Static107.anInt2505, Static107.anInt2529, local17, local20);
													}
												} else if (!this.method1771(0, local17, local20)) {
													this.method1759(local49.aClass51_1, 0, Static107.anInt2508, Static107.anInt2520, Static107.anInt2505, Static107.anInt2529, local17, local20);
												}
												@Pc(225) Class67 local225 = local49.aClass67_1;
												if (local225 != null) {
													local225.aClass1_Sub1_Sub2_7.method1911(0, Static107.anInt2508, Static107.anInt2520, Static107.anInt2505, Static107.anInt2529, local225.anInt2227 - Static107.anInt2521, local225.anInt2219 - Static107.anInt2523, local225.anInt2228 - Static107.anInt2530, local225.anInt2226);
												}
												for (local251 = 0; local251 < local49.anInt1585; local251++) {
													var12 = local49.aClass43Array1[local251];
													if (var12 != null) {
														var12.aClass1_Sub1_Sub2_2.method1911(var12.anInt1477, Static107.anInt2508, Static107.anInt2520, Static107.anInt2505, Static107.anInt2529, var12.anInt1466 - Static107.anInt2521, var12.anInt1462 - Static107.anInt2523, var12.anInt1460 - Static107.anInt2530, var12.anInt1468);
													}
												}
											}
											var24 = false;
											if (local8.aClass51_1 == null) {
												if (local8.aClass55_1 != null && !this.method1771(local26, local17, local20)) {
													var24 = true;
													this.method1750(local8.aClass55_1, Static107.anInt2508, Static107.anInt2520, Static107.anInt2505, Static107.anInt2529, local17, local20);
												}
											} else if (!this.method1771(local26, local17, local20)) {
												var24 = true;
												if (local8.aClass51_1.anInt1636 != 12345678 || Static107.aBoolean153 && local23 <= Static107.anInt2527) {
													this.method1759(local8.aClass51_1, local26, Static107.anInt2508, Static107.anInt2520, Static107.anInt2505, Static107.anInt2529, local17, local20);
												}
											}
											var23 = 0;
											local251 = 0;
											@Pc(350) Class67 local350 = local8.aClass67_1;
											@Pc(353) Class9 local353 = local8.aClass9_1;
											if (local350 != null || local353 != null) {
												if (Static107.anInt2522 == local17) {
													var23++;
												} else if (Static107.anInt2522 < local17) {
													var23 += 2;
												}
												if (Static107.anInt2532 == local20) {
													var23 += 3;
												} else if (Static107.anInt2532 > local20) {
													var23 += 6;
												}
												local251 = Static107.anIntArray371[var23];
												local8.anInt1590 = Static107.anIntArray372[var23];
											}
											if (local350 != null) {
												if ((local350.anInt2213 & Static107.anIntArray375[var23]) == 0) {
													local8.anInt1588 = 0;
												} else if (local350.anInt2213 == 16) {
													local8.anInt1588 = 3;
													local8.anInt1584 = Static107.anIntArray373[var23];
													local8.anInt1583 = 3 - local8.anInt1584;
												} else if (local350.anInt2213 == 32) {
													local8.anInt1588 = 6;
													local8.anInt1584 = Static107.anIntArray374[var23];
													local8.anInt1583 = 6 - local8.anInt1584;
												} else if (local350.anInt2213 == 64) {
													local8.anInt1588 = 12;
													local8.anInt1584 = Static107.anIntArray376[var23];
													local8.anInt1583 = 12 - local8.anInt1584;
												} else {
													local8.anInt1588 = 9;
													local8.anInt1584 = Static107.anIntArray377[var23];
													local8.anInt1583 = 9 - local8.anInt1584;
												}
												if ((local350.anInt2213 & local251) != 0 && !this.method1757(local26, local17, local20, local350.anInt2213)) {
													local350.aClass1_Sub1_Sub2_7.method1911(0, Static107.anInt2508, Static107.anInt2520, Static107.anInt2505, Static107.anInt2529, local350.anInt2227 - Static107.anInt2521, local350.anInt2219 - Static107.anInt2523, local350.anInt2228 - Static107.anInt2530, local350.anInt2226);
												}
												if ((local350.anInt2229 & local251) != 0 && !this.method1757(local26, local17, local20, local350.anInt2229)) {
													local350.aClass1_Sub1_Sub2_8.method1911(0, Static107.anInt2508, Static107.anInt2520, Static107.anInt2505, Static107.anInt2529, local350.anInt2227 - Static107.anInt2521, local350.anInt2219 - Static107.anInt2523, local350.anInt2228 - Static107.anInt2530, local350.anInt2226);
												}
											}
											if (local353 != null && !this.method1774(local26, local17, local20, local353.aClass1_Sub1_Sub2_1.anInt2678)) {
												if ((local353.anInt356 & local251) != 0) {
													local353.aClass1_Sub1_Sub2_1.method1911(local353.anInt344, Static107.anInt2508, Static107.anInt2520, Static107.anInt2505, Static107.anInt2529, local353.anInt358 - Static107.anInt2521, local353.anInt345 - Static107.anInt2523, local353.anInt355 - Static107.anInt2530, local353.anInt342);
												} else if ((local353.anInt356 & 0x300) != 0) {
													local588 = local353.anInt358 - Static107.anInt2521;
													local593 = local353.anInt345 - Static107.anInt2523;
													local598 = local353.anInt355 - Static107.anInt2530;
													local601 = local353.anInt344;
													if (local601 == 1 || local601 == 2) {
														local610 = -local588;
													} else {
														local610 = local588;
													}
													if (local601 == 2 || local601 == 3) {
														var19 = -local598;
													} else {
														var19 = local598;
													}
													@Pc(639) int local639;
													@Pc(645) int local645;
													if ((local353.anInt356 & 0x100) != 0 && var19 < local610) {
														local639 = local588 + Static107.anIntArray368[local601];
														local645 = local598 + Static107.anIntArray367[local601];
														local353.aClass1_Sub1_Sub2_1.method1911(local601 * 512 + 256, Static107.anInt2508, Static107.anInt2520, Static107.anInt2505, Static107.anInt2529, local639, local593, local645, local353.anInt342);
													}
													if ((local353.anInt356 & 0x200) != 0 && var19 > local610) {
														local639 = local588 + Static107.anIntArray370[local601];
														local645 = local598 + Static107.anIntArray369[local601];
														local353.aClass1_Sub1_Sub2_1.method1911(local601 * 512 + 1280 & 0x7FF, Static107.anInt2508, Static107.anInt2520, Static107.anInt2505, Static107.anInt2529, local639, local593, local645, local353.anInt342);
													}
												}
											}
											if (var24) {
												@Pc(706) Class62 local706 = local8.aClass62_1;
												if (local706 != null) {
													local706.aClass1_Sub1_Sub2_6.method1911(0, Static107.anInt2508, Static107.anInt2520, Static107.anInt2505, Static107.anInt2529, local706.anInt2038 - Static107.anInt2521, local706.anInt2040 - Static107.anInt2523, local706.anInt2042 - Static107.anInt2530, local706.anInt2039);
												}
												@Pc(733) Class49 local733 = local8.aClass49_1;
												if (local733 != null && local733.anInt1537 == 0) {
													if (local733.aClass1_Sub1_Sub2_5 != null) {
														local733.aClass1_Sub1_Sub2_5.method1911(0, Static107.anInt2508, Static107.anInt2520, Static107.anInt2505, Static107.anInt2529, local733.anInt1538 - Static107.anInt2521, local733.anInt1541 - Static107.anInt2523, local733.anInt1544 - Static107.anInt2530, local733.anInt1545);
													}
													if (local733.aClass1_Sub1_Sub2_4 != null) {
														local733.aClass1_Sub1_Sub2_4.method1911(0, Static107.anInt2508, Static107.anInt2520, Static107.anInt2505, Static107.anInt2529, local733.anInt1538 - Static107.anInt2521, local733.anInt1541 - Static107.anInt2523, local733.anInt1544 - Static107.anInt2530, local733.anInt1545);
													}
													if (local733.aClass1_Sub1_Sub2_3 != null) {
														local733.aClass1_Sub1_Sub2_3.method1911(0, Static107.anInt2508, Static107.anInt2520, Static107.anInt2505, Static107.anInt2529, local733.anInt1538 - Static107.anInt2521, local733.anInt1541 - Static107.anInt2523, local733.anInt1544 - Static107.anInt2530, local733.anInt1545);
													}
												}
											}
											local588 = local8.anInt1586;
											if (local588 != 0) {
												if (local17 < Static107.anInt2522 && (local588 & 0x4) != 0) {
													var35 = local31[local17 + 1][local20];
													if (var35 != null && var35.aBoolean88) {
														Static107.aClass50_13.method1142(var35);
													}
												}
												if (local20 < Static107.anInt2532 && (local588 & 0x2) != 0) {
													var35 = local31[local17][local20 + 1];
													if (var35 != null && var35.aBoolean88) {
														Static107.aClass50_13.method1142(var35);
													}
												}
												if (local17 > Static107.anInt2522 && (local588 & 0x1) != 0) {
													var35 = local31[local17 - 1][local20];
													if (var35 != null && var35.aBoolean88) {
														Static107.aClass50_13.method1142(var35);
													}
												}
												if (local20 > Static107.anInt2532 && (local588 & 0x8) != 0) {
													var35 = local31[local17][local20 - 1];
													if (var35 != null && var35.aBoolean88) {
														Static107.aClass50_13.method1142(var35);
													}
												}
											}
											break;
										}
										if (local8.anInt1588 != 0) {
											var24 = true;
											for (var23 = 0; var23 < local8.anInt1585; var23++) {
												if (local8.aClass43Array1[var23].anInt1470 != Static107.anInt2509 && (local8.anIntArray237[var23] & local8.anInt1588) == local8.anInt1584) {
													var24 = false;
													break;
												}
											}
											if (var24) {
												local952 = local8.aClass67_1;
												if (!this.method1757(local26, local17, local20, local952.anInt2213)) {
													local952.aClass1_Sub1_Sub2_7.method1911(0, Static107.anInt2508, Static107.anInt2520, Static107.anInt2505, Static107.anInt2529, local952.anInt2227 - Static107.anInt2521, local952.anInt2219 - Static107.anInt2523, local952.anInt2228 - Static107.anInt2530, local952.anInt2226);
												}
												local8.anInt1588 = 0;
											}
										}
										if (!local8.aBoolean87) {
											break;
										}
										try {
											@Pc(991) int local991 = local8.anInt1585;
											local8.aBoolean87 = false;
											var23 = 0;
											label568: for (local251 = 0; local251 < local991; local251++) {
												var12 = local8.aClass43Array1[local251];
												if (var12.anInt1470 != Static107.anInt2509) {
													for (local1011 = var12.anInt1464; local1011 <= var12.anInt1463; local1011++) {
														for (local588 = var12.anInt1476; local588 <= var12.anInt1472; local588++) {
															var35 = local31[local1011][local588];
															if (var35.aBoolean86) {
																local8.aBoolean87 = true;
																continue label568;
															}
															if (var35.anInt1588 != 0) {
																local598 = 0;
																if (local1011 > var12.anInt1464) {
																	local598++;
																}
																if (local1011 < var12.anInt1463) {
																	local598 += 4;
																}
																if (local588 > var12.anInt1476) {
																	local598 += 8;
																}
																if (local588 < var12.anInt1472) {
																	local598 += 2;
																}
																if ((local598 & var35.anInt1588) == local8.anInt1583) {
																	local8.aBoolean87 = true;
																	continue label568;
																}
															}
														}
													}
													Static107.aClass43Array2[var23++] = var12;
													local588 = Static107.anInt2522 - var12.anInt1464;
													local593 = var12.anInt1463 - Static107.anInt2522;
													if (local593 > local588) {
														local588 = local593;
													}
													local598 = Static107.anInt2532 - var12.anInt1476;
													local601 = var12.anInt1472 - Static107.anInt2532;
													if (local601 > local598) {
														var12.anInt1461 = local588 + local601;
													} else {
														var12.anInt1461 = local588 + local598;
													}
												}
											}
											while (var23 > 0) {
												local1126 = -50;
												local1011 = -1;
												@Pc(1135) Class43 local1135;
												for (local588 = 0; local588 < var23; local588++) {
													local1135 = Static107.aClass43Array2[local588];
													if (local1135.anInt1470 != Static107.anInt2509) {
														if (local1135.anInt1461 > local1126) {
															local1126 = local1135.anInt1461;
															local1011 = local588;
														} else if (local1135.anInt1461 == local1126) {
															local598 = local1135.anInt1466 - Static107.anInt2521;
															local601 = local1135.anInt1460 - Static107.anInt2530;
															local610 = Static107.aClass43Array2[local1011].anInt1466 - Static107.anInt2521;
															var19 = Static107.aClass43Array2[local1011].anInt1460 - Static107.anInt2530;
															if (local598 * local598 + local601 * local601 > local610 * local610 + var19 * var19) {
																local1011 = local588;
															}
														}
													}
												}
												if (local1011 == -1) {
													break;
												}
												local1135 = Static107.aClass43Array2[local1011];
												local1135.anInt1470 = Static107.anInt2509;
												if (!this.method1755(local26, local1135.anInt1464, local1135.anInt1463, local1135.anInt1476, local1135.anInt1472, local1135.aClass1_Sub1_Sub2_2.anInt2678)) {
													local1135.aClass1_Sub1_Sub2_2.method1911(local1135.anInt1477, Static107.anInt2508, Static107.anInt2520, Static107.anInt2505, Static107.anInt2529, local1135.anInt1466 - Static107.anInt2521, local1135.anInt1462 - Static107.anInt2523, local1135.anInt1460 - Static107.anInt2530, local1135.anInt1468);
												}
												for (local598 = local1135.anInt1464; local598 <= local1135.anInt1463; local598++) {
													for (local601 = local1135.anInt1476; local601 <= local1135.anInt1472; local601++) {
														@Pc(1260) Class1_Sub8 local1260 = local31[local598][local601];
														if (local1260.anInt1588 != 0) {
															Static107.aClass50_13.method1142(local1260);
														} else if ((local598 != local17 || local601 != local20) && local1260.aBoolean88) {
															Static107.aClass50_13.method1142(local1260);
														}
													}
												}
											}
											if (!local8.aBoolean87) {
												break;
											}
										} catch (@Pc(1298) Exception local1298) {
											local8.aBoolean87 = false;
											break;
										}
									}
								} while (!local8.aBoolean88);
							} while (local8.anInt1588 != 0);
							if (local17 > Static107.anInt2522 || local17 <= Static107.anInt2519) {
								break;
							}
							local49 = local31[local17 - 1][local20];
						} while (local49 != null && local49.aBoolean88);
						if (local17 < Static107.anInt2522 || local17 >= Static107.anInt2518 - 1) {
							break;
						}
						local49 = local31[local17 + 1][local20];
					} while (local49 != null && local49.aBoolean88);
					if (local20 > Static107.anInt2532 || local20 <= Static107.anInt2525) {
						break;
					}
					local49 = local31[local17][local20 - 1];
				} while (local49 != null && local49.aBoolean88);
				if (local20 < Static107.anInt2532 || local20 >= Static107.anInt2526 - 1) {
					break;
				}
				local49 = local31[local17][local20 + 1];
			} while (local49 != null && local49.aBoolean88);
			local8.aBoolean88 = false;
			Static107.anInt2528--;
			@Pc(1402) Class49 local1402 = local8.aClass49_1;
			if (local1402 != null && local1402.anInt1537 != 0) {
				if (local1402.aClass1_Sub1_Sub2_5 != null) {
					local1402.aClass1_Sub1_Sub2_5.method1911(0, Static107.anInt2508, Static107.anInt2520, Static107.anInt2505, Static107.anInt2529, local1402.anInt1538 - Static107.anInt2521, local1402.anInt1541 - Static107.anInt2523 - local1402.anInt1537, local1402.anInt1544 - Static107.anInt2530, local1402.anInt1545);
				}
				if (local1402.aClass1_Sub1_Sub2_4 != null) {
					local1402.aClass1_Sub1_Sub2_4.method1911(0, Static107.anInt2508, Static107.anInt2520, Static107.anInt2505, Static107.anInt2529, local1402.anInt1538 - Static107.anInt2521, local1402.anInt1541 - Static107.anInt2523 - local1402.anInt1537, local1402.anInt1544 - Static107.anInt2530, local1402.anInt1545);
				}
				if (local1402.aClass1_Sub1_Sub2_3 != null) {
					local1402.aClass1_Sub1_Sub2_3.method1911(0, Static107.anInt2508, Static107.anInt2520, Static107.anInt2505, Static107.anInt2529, local1402.anInt1538 - Static107.anInt2521, local1402.anInt1541 - Static107.anInt2523 - local1402.anInt1537, local1402.anInt1544 - Static107.anInt2530, local1402.anInt1545);
				}
			}
			if (local8.anInt1590 != 0) {
				@Pc(1497) Class9 local1497 = local8.aClass9_1;
				if (local1497 != null && !this.method1774(local26, local17, local20, local1497.aClass1_Sub1_Sub2_1.anInt2678)) {
					if ((local1497.anInt356 & local8.anInt1590) != 0) {
						local1497.aClass1_Sub1_Sub2_1.method1911(local1497.anInt344, Static107.anInt2508, Static107.anInt2520, Static107.anInt2505, Static107.anInt2529, local1497.anInt358 - Static107.anInt2521, local1497.anInt345 - Static107.anInt2523, local1497.anInt355 - Static107.anInt2530, local1497.anInt342);
					} else if ((local1497.anInt356 & 0x300) != 0) {
						local251 = local1497.anInt358 - Static107.anInt2521;
						local1126 = local1497.anInt345 - Static107.anInt2523;
						local1011 = local1497.anInt355 - Static107.anInt2530;
						local588 = local1497.anInt344;
						if (local588 == 1 || local588 == 2) {
							local593 = -local251;
						} else {
							local593 = local251;
						}
						if (local588 == 2 || local588 == 3) {
							local598 = -local1011;
						} else {
							local598 = local1011;
						}
						if ((local1497.anInt356 & 0x100) != 0 && local598 >= local593) {
							local601 = local251 + Static107.anIntArray368[local588];
							local610 = local1011 + Static107.anIntArray367[local588];
							local1497.aClass1_Sub1_Sub2_1.method1911(local588 * 512 + 256, Static107.anInt2508, Static107.anInt2520, Static107.anInt2505, Static107.anInt2529, local601, local1126, local610, local1497.anInt342);
						}
						if ((local1497.anInt356 & 0x200) != 0 && local598 <= local593) {
							local601 = local251 + Static107.anIntArray370[local588];
							local610 = local1011 + Static107.anIntArray369[local588];
							local1497.aClass1_Sub1_Sub2_1.method1911(local588 * 512 + 1280 & 0x7FF, Static107.anInt2508, Static107.anInt2520, Static107.anInt2505, Static107.anInt2529, local601, local1126, local610, local1497.anInt342);
						}
					}
				}
				local952 = local8.aClass67_1;
				if (local952 != null) {
					if ((local952.anInt2229 & local8.anInt1590) != 0 && !this.method1757(local26, local17, local20, local952.anInt2229)) {
						local952.aClass1_Sub1_Sub2_8.method1911(0, Static107.anInt2508, Static107.anInt2520, Static107.anInt2505, Static107.anInt2529, local952.anInt2227 - Static107.anInt2521, local952.anInt2219 - Static107.anInt2523, local952.anInt2228 - Static107.anInt2530, local952.anInt2226);
					}
					if ((local952.anInt2213 & local8.anInt1590) != 0 && !this.method1757(local26, local17, local20, local952.anInt2213)) {
						local952.aClass1_Sub1_Sub2_7.method1911(0, Static107.anInt2508, Static107.anInt2520, Static107.anInt2505, Static107.anInt2529, local952.anInt2227 - Static107.anInt2521, local952.anInt2219 - Static107.anInt2523, local952.anInt2228 - Static107.anInt2530, local952.anInt2226);
					}
				}
			}
			@Pc(1755) Class1_Sub8 local1755;
			if (local23 < this.anInt2524 - 1) {
				local1755 = this.aClass1_Sub8ArrayArrayArray1[local23 + 1][local17][local20];
				if (local1755 != null && local1755.aBoolean88) {
					Static107.aClass50_13.method1142(local1755);
				}
			}
			if (local17 < Static107.anInt2522) {
				local1755 = local31[local17 + 1][local20];
				if (local1755 != null && local1755.aBoolean88) {
					Static107.aClass50_13.method1142(local1755);
				}
			}
			if (local20 < Static107.anInt2532) {
				local1755 = local31[local17][local20 + 1];
				if (local1755 != null && local1755.aBoolean88) {
					Static107.aClass50_13.method1142(local1755);
				}
			}
			if (local17 > Static107.anInt2522) {
				local1755 = local31[local17 - 1][local20];
				if (local1755 != null && local1755.aBoolean88) {
					Static107.aClass50_13.method1142(local1755);
				}
			}
			if (local20 > Static107.anInt2532) {
				local1755 = local31[local17][local20 - 1];
				if (local1755 != null && local1755.aBoolean88) {
					Static107.aClass50_13.method1142(local1755);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(I)V")
	public void method1783(@OriginalArg(0) int arg0) {
		this.anInt2506 = arg0;
		for (@Pc(4) int local4 = 0; local4 < this.anInt2511; local4++) {
			for (@Pc(7) int local7 = 0; local7 < this.anInt2515; local7++) {
				if (this.aClass1_Sub8ArrayArrayArray1[arg0][local4][local7] == null) {
					this.aClass1_Sub8ArrayArrayArray1[arg0][local4][local7] = new Class1_Sub8(arg0, local4, local7);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(IIIIIIII)Z")
	private boolean method1784(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
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

	@OriginalMember(owner = "client!ua", name = "p", descriptor = "(III)I")
	public int method1785(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class1_Sub8 local8 = this.aClass1_Sub8ArrayArrayArray1[arg0][arg1][arg2];
		return local8 == null || local8.aClass67_1 == null ? 0 : local8.aClass67_1.anInt2226;
	}

	@OriginalMember(owner = "client!ua", name = "q", descriptor = "(III)I")
	public int method1786(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class1_Sub8 local8 = this.aClass1_Sub8ArrayArrayArray1[arg0][arg1][arg2];
		return local8 == null || local8.aClass62_1 == null ? 0 : local8.aClass62_1.anInt2039;
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(IIIIIIIILclient!ha;IZII)Z")
	private boolean method1787(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) Class1_Sub1_Sub2 arg8, @OriginalArg(9) int arg9, @OriginalArg(10) boolean arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12) {
		for (@Pc(1) int local1 = arg1; local1 < arg1 + arg3; local1++) {
			for (@Pc(4) int local4 = arg2; local4 < arg2 + arg4; local4++) {
				if (local1 < 0 || local4 < 0 || local1 >= this.anInt2511 || local4 >= this.anInt2515) {
					return false;
				}
				@Pc(28) Class1_Sub8 local28 = this.aClass1_Sub8ArrayArrayArray1[arg0][local1][local4];
				if (local28 != null && local28.anInt1585 >= 5) {
					return false;
				}
			}
		}
		@Pc(52) Class43 local52 = new Class43();
		local52.anInt1468 = arg11;
		local52.anInt1471 = arg12;
		local52.anInt1465 = arg0;
		local52.anInt1466 = arg5;
		local52.anInt1460 = arg6;
		local52.anInt1462 = arg7;
		local52.aClass1_Sub1_Sub2_2 = arg8;
		local52.anInt1477 = arg9;
		local52.anInt1464 = arg1;
		local52.anInt1476 = arg2;
		local52.anInt1463 = arg1 + arg3 - 1;
		local52.anInt1472 = arg2 + arg4 - 1;
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
				local166.aClass43Array1[local166.anInt1585] = local52;
				local166.anIntArray237[local166.anInt1585] = local104;
				local166.anInt1586 |= local104;
				local166.anInt1585++;
			}
		}
		if (arg10) {
			this.aClass43Array3[this.anInt2513++] = local52;
		}
		return true;
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(IIIIIIIIIIIIIIIIIIII)V")
	public void method1789(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int arg15, @OriginalArg(16) int arg16, @OriginalArg(17) int arg17, @OriginalArg(18) int arg18, @OriginalArg(19) int arg19) {
		@Pc(12) Class51 local12;
		@Pc(14) int local14;
		if (arg3 == 0) {
			local12 = new Class51(arg10, arg11, arg12, arg13, -1, arg18, false);
			for (local14 = arg0; local14 >= 0; local14--) {
				if (this.aClass1_Sub8ArrayArrayArray1[local14][arg1][arg2] == null) {
					this.aClass1_Sub8ArrayArrayArray1[local14][arg1][arg2] = new Class1_Sub8(local14, arg1, arg2);
				}
			}
			this.aClass1_Sub8ArrayArrayArray1[arg0][arg1][arg2].aClass51_1 = local12;
		} else if (arg3 == 1) {
			local12 = new Class51(arg14, arg15, arg16, arg17, arg5, arg19, arg6 == arg7 && arg6 == arg8 && arg6 == arg9);
			for (local14 = arg0; local14 >= 0; local14--) {
				if (this.aClass1_Sub8ArrayArrayArray1[local14][arg1][arg2] == null) {
					this.aClass1_Sub8ArrayArrayArray1[local14][arg1][arg2] = new Class1_Sub8(local14, arg1, arg2);
				}
			}
			this.aClass1_Sub8ArrayArrayArray1[arg0][arg1][arg2].aClass51_1 = local12;
		} else {
			@Pc(140) Class55 local140 = new Class55(arg3, arg4, arg5, arg1, arg2, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17, arg18, arg19);
			for (local14 = arg0; local14 >= 0; local14--) {
				if (this.aClass1_Sub8ArrayArrayArray1[local14][arg1][arg2] == null) {
					this.aClass1_Sub8ArrayArrayArray1[local14][arg1][arg2] = new Class1_Sub8(local14, arg1, arg2);
				}
			}
			this.aClass1_Sub8ArrayArrayArray1[arg0][arg1][arg2].aClass55_1 = local140;
		}
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "([IIIIII)V")
	public void method1790(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(8) Class1_Sub8 local8 = this.aClass1_Sub8ArrayArrayArray1[arg2][arg3][arg4];
		if (local8 == null) {
			return;
		}
		@Pc(14) Class51 local14 = local8.aClass51_1;
		@Pc(24) int local24;
		if (local14 != null) {
			@Pc(19) int local19 = local14.anInt1643;
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
		@Pc(59) Class55 local59 = local8.aClass55_1;
		if (local59 == null) {
			return;
		}
		local24 = local59.anInt1803;
		@Pc(68) int local68 = local59.anInt1804;
		@Pc(71) int local71 = local59.anInt1801;
		@Pc(74) int local74 = local59.anInt1802;
		@Pc(79) int[] local79 = this.anIntArrayArray31[local24];
		@Pc(84) int[] local84 = this.anIntArrayArray32[local68];
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

	@OriginalMember(owner = "client!ua", name = "b", descriptor = "(IIIIII)V")
	public void method1791(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (arg0 < 0) {
			arg0 = 0;
		} else if (arg0 >= this.anInt2511 * 128) {
			arg0 = this.anInt2511 * 128 - 1;
		}
		if (arg2 < 0) {
			arg2 = 0;
		} else if (arg2 >= this.anInt2515 * 128) {
			arg2 = this.anInt2515 * 128 - 1;
		}
		Static107.anInt2509++;
		Static107.anInt2508 = Class1_Sub1_Sub5_Sub4.anIntArray427[arg3];
		Static107.anInt2520 = Class1_Sub1_Sub5_Sub4.anIntArray429[arg3];
		Static107.anInt2505 = Class1_Sub1_Sub5_Sub4.anIntArray427[arg4];
		Static107.anInt2529 = Class1_Sub1_Sub5_Sub4.anIntArray429[arg4];
		Static107.aBooleanArrayArray1 = Static107.aBooleanArrayArrayArrayArray1[(arg3 - 128) / 32][arg4 / 64];
		Static107.anInt2521 = arg0;
		Static107.anInt2523 = arg1;
		Static107.anInt2530 = arg2;
		Static107.anInt2522 = arg0 / 128;
		Static107.anInt2532 = arg2 / 128;
		Static107.anInt2531 = arg5;
		Static107.anInt2519 = Static107.anInt2522 - 25;
		if (Static107.anInt2519 < 0) {
			Static107.anInt2519 = 0;
		}
		Static107.anInt2525 = Static107.anInt2532 - 25;
		if (Static107.anInt2525 < 0) {
			Static107.anInt2525 = 0;
		}
		Static107.anInt2518 = Static107.anInt2522 + 25;
		if (Static107.anInt2518 > this.anInt2511) {
			Static107.anInt2518 = this.anInt2511;
		}
		Static107.anInt2526 = Static107.anInt2532 + 25;
		if (Static107.anInt2526 > this.anInt2515) {
			Static107.anInt2526 = this.anInt2515;
		}
		this.method1764();
		Static107.anInt2528 = 0;
		@Pc(136) int local136;
		@Pc(139) int local139;
		for (@Pc(128) int local128 = this.anInt2506; local128 < this.anInt2524; local128++) {
			@Pc(134) Class1_Sub8[][] local134 = this.aClass1_Sub8ArrayArrayArray1[local128];
			for (local136 = Static107.anInt2519; local136 < Static107.anInt2518; local136++) {
				for (local139 = Static107.anInt2525; local139 < Static107.anInt2526; local139++) {
					@Pc(146) Class1_Sub8 local146 = local134[local136][local139];
					if (local146 != null) {
						if (local146.anInt1592 <= arg5 && (Static107.aBooleanArrayArray1[local136 + 25 - Static107.anInt2522][local139 + 25 - Static107.anInt2532] || this.anIntArrayArrayArray7[local128][local136][local139] - arg1 >= 2000)) {
							local146.aBoolean86 = true;
							local146.aBoolean88 = true;
							if (local146.anInt1585 > 0) {
								local146.aBoolean87 = true;
							} else {
								local146.aBoolean87 = false;
							}
							Static107.anInt2528++;
						} else {
							local146.aBoolean86 = false;
							local146.aBoolean88 = false;
							local146.anInt1588 = 0;
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
		for (@Pc(224) int local224 = this.anInt2506; local224 < this.anInt2524; local224++) {
			@Pc(230) Class1_Sub8[][] local230 = this.aClass1_Sub8ArrayArrayArray1[local224];
			for (local139 = -25; local139 <= 0; local139++) {
				local237 = Static107.anInt2522 + local139;
				local241 = Static107.anInt2522 - local139;
				if (local237 >= Static107.anInt2519 || local241 < Static107.anInt2518) {
					for (local249 = -25; local249 <= 0; local249++) {
						local254 = Static107.anInt2532 + local249;
						local258 = Static107.anInt2532 - local249;
						@Pc(270) Class1_Sub8 local270;
						if (local237 >= Static107.anInt2519) {
							if (local254 >= Static107.anInt2525) {
								local270 = local230[local237][local254];
								if (local270 != null && local270.aBoolean86) {
									this.method1782(local270, true);
								}
							}
							if (local258 < Static107.anInt2526) {
								local270 = local230[local237][local258];
								if (local270 != null && local270.aBoolean86) {
									this.method1782(local270, true);
								}
							}
						}
						if (local241 < Static107.anInt2518) {
							if (local254 >= Static107.anInt2525) {
								local270 = local230[local241][local254];
								if (local270 != null && local270.aBoolean86) {
									this.method1782(local270, true);
								}
							}
							if (local258 < Static107.anInt2526) {
								local270 = local230[local241][local258];
								if (local270 != null && local270.aBoolean86) {
									this.method1782(local270, true);
								}
							}
						}
						if (Static107.anInt2528 == 0) {
							Static107.aBoolean153 = false;
							return;
						}
					}
				}
			}
		}
		for (local136 = this.anInt2506; local136 < this.anInt2524; local136++) {
			@Pc(361) Class1_Sub8[][] local361 = this.aClass1_Sub8ArrayArrayArray1[local136];
			for (local237 = -25; local237 <= 0; local237++) {
				local241 = Static107.anInt2522 + local237;
				local249 = Static107.anInt2522 - local237;
				if (local241 >= Static107.anInt2519 || local249 < Static107.anInt2518) {
					for (local254 = -25; local254 <= 0; local254++) {
						local258 = Static107.anInt2532 + local254;
						@Pc(389) int local389 = Static107.anInt2532 - local254;
						@Pc(401) Class1_Sub8 local401;
						if (local241 >= Static107.anInt2519) {
							if (local258 >= Static107.anInt2525) {
								local401 = local361[local241][local258];
								if (local401 != null && local401.aBoolean86) {
									this.method1782(local401, false);
								}
							}
							if (local389 < Static107.anInt2526) {
								local401 = local361[local241][local389];
								if (local401 != null && local401.aBoolean86) {
									this.method1782(local401, false);
								}
							}
						}
						if (local249 < Static107.anInt2518) {
							if (local258 >= Static107.anInt2525) {
								local401 = local361[local249][local258];
								if (local401 != null && local401.aBoolean86) {
									this.method1782(local401, false);
								}
							}
							if (local389 < Static107.anInt2526) {
								local401 = local361[local249][local389];
								if (local401 != null && local401.aBoolean86) {
									this.method1782(local401, false);
								}
							}
						}
						if (Static107.anInt2528 == 0) {
							Static107.aBoolean153 = false;
							return;
						}
					}
				}
			}
		}
		Static107.aBoolean153 = false;
	}

	@OriginalMember(owner = "client!ua", name = "e", descriptor = "(IIII)V")
	public void method1793(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(8) Class1_Sub8 local8 = this.aClass1_Sub8ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 == null) {
			return;
		}
		@Pc(14) Class9 local14 = local8.aClass9_1;
		if (local14 != null) {
			@Pc(23) int local23 = arg1 * 128 + 64;
			@Pc(29) int local29 = arg2 * 128 + 64;
			local14.anInt358 = local23 + (local14.anInt358 - local23) * arg3 / 16;
			local14.anInt355 = local29 + (local14.anInt355 - local29) * arg3 / 16;
		}
	}

	@OriginalMember(owner = "client!ua", name = "r", descriptor = "(III)V")
	public void method1794(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		Static107.aBoolean153 = true;
		Static107.anInt2527 = arg0;
		Static107.anInt2510 = arg1;
		Static107.anInt2507 = arg2;
		Static107.anInt2512 = -1;
		Static107.anInt2514 = -1;
	}
}
