import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ac")
public final class Class4 {

	@OriginalMember(owner = "client!ac", name = "e", descriptor = "[Lclient!j;")
	private final Class38[] aClass38Array1 = new Class38[5000];

	@OriginalMember(owner = "client!ac", name = "f", descriptor = "I")
	private int anInt72 = 0;

	@OriginalMember(owner = "client!ac", name = "m", descriptor = "I")
	private int anInt76 = 0;

	@OriginalMember(owner = "client!ac", name = "R", descriptor = "[[I")
	private final int[][] anIntArrayArray1 = new int[][] { new int[16], { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 1 }, { 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0 }, { 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1 }, { 1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 1 } };

	@OriginalMember(owner = "client!ac", name = "S", descriptor = "[[I")
	private final int[][] anIntArrayArray2 = new int[][] { { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 }, { 12, 8, 4, 0, 13, 9, 5, 1, 14, 10, 6, 2, 15, 11, 7, 3 }, { 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 }, { 3, 7, 11, 15, 2, 6, 10, 14, 1, 5, 9, 13, 0, 4, 8, 12 } };

	@OriginalMember(owner = "client!ac", name = "A", descriptor = "I")
	private final int anInt84;

	@OriginalMember(owner = "client!ac", name = "b", descriptor = "I")
	private final int anInt69;

	@OriginalMember(owner = "client!ac", name = "n", descriptor = "I")
	private final int anInt77;

	@OriginalMember(owner = "client!ac", name = "g", descriptor = "[[[Lclient!n;")
	private final Class1_Sub12[][][] aClass1_Sub12ArrayArrayArray1;

	@OriginalMember(owner = "client!ac", name = "C", descriptor = "[[[I")
	private final int[][][] anIntArrayArrayArray2;

	@OriginalMember(owner = "client!ac", name = "u", descriptor = "[[[I")
	private final int[][][] anIntArrayArrayArray1;

	@OriginalMember(owner = "client!ac", name = "<init>", descriptor = "(III[[[I)V")
	public Class4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[][][] arg3) {
		this.anInt84 = arg0;
		this.anInt69 = arg1;
		this.anInt77 = arg2;
		this.aClass1_Sub12ArrayArrayArray1 = new Class1_Sub12[arg0][arg1][arg2];
		this.anIntArrayArrayArray2 = new int[arg0][arg1 + 1][arg2 + 1];
		this.anIntArrayArrayArray1 = arg3;
		this.method56();
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(IIII)V")
	public void method44(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(8) Class1_Sub12 local8 = this.aClass1_Sub12ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 == null) {
			return;
		}
		@Pc(14) Class10 local14 = local8.aClass10_1;
		if (local14 != null) {
			@Pc(23) int local23 = arg1 * 128 + 64;
			@Pc(29) int local29 = arg2 * 128 + 64;
			local14.anInt261 = local23 + (local14.anInt261 - local23) * arg3 / 16;
			local14.anInt262 = local29 + (local14.anInt262 - local29) * arg3 / 16;
		}
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(Lclient!ra;IIIIIII)V")
	private void method45(@OriginalArg(0) Class69 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(6) int local6;
		@Pc(7) int local7 = local6 = (arg6 << 7) - Static4.anInt80;
		@Pc(14) int local14;
		@Pc(15) int local15 = local14 = (arg7 << 7) - Static4.anInt94;
		@Pc(20) int local20;
		@Pc(21) int local21 = local20 = local7 + 128;
		@Pc(26) int local26;
		@Pc(27) int local27 = local26 = local15 + 128;
		@Pc(38) int local38 = this.anIntArrayArrayArray1[arg1][arg6][arg7] - Static4.anInt86;
		@Pc(51) int local51 = this.anIntArrayArrayArray1[arg1][arg6 + 1][arg7] - Static4.anInt86;
		@Pc(66) int local66 = this.anIntArrayArrayArray1[arg1][arg6 + 1][arg7 + 1] - Static4.anInt86;
		@Pc(79) int local79 = this.anIntArrayArrayArray1[arg1][arg6][arg7 + 1] - Static4.anInt86;
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
		@Pc(279) int local279 = Static36.anInt1030 + (local101 << 9) / local121;
		@Pc(287) int local287 = Static36.anInt1029 + (local123 << 9) / local121;
		@Pc(295) int local295 = Static36.anInt1030 + (local21 << 9) / local169;
		@Pc(303) int local303 = Static36.anInt1029 + (local51 << 9) / local169;
		@Pc(311) int local311 = Static36.anInt1030 + (local197 << 9) / local27;
		@Pc(319) int local319 = Static36.anInt1029 + (local66 << 9) / local27;
		@Pc(327) int local327 = Static36.anInt1030 + (local245 << 9) / local265;
		@Pc(335) int local335 = Static36.anInt1029 + (local89 << 9) / local265;
		Static36.anInt1024 = 0;
		@Pc(472) int local472;
		if ((local311 - local327) * (local303 - local335) - (local319 - local335) * (local295 - local327) > 0) {
			Static36.aBoolean41 = false;
			if (local311 < 0 || local327 < 0 || local295 < 0 || local311 > Static36.anInt1031 || local327 > Static36.anInt1031 || local295 > Static36.anInt1031) {
				Static36.aBoolean41 = true;
			}
			if (Static4.aBoolean2 && this.method50(Static4.anInt82, Static4.anInt85, local319, local335, local303, local311, local327, local295)) {
				Static4.anInt70 = arg6;
				Static4.anInt68 = arg7;
			}
			if (arg0.anInt2375 == -1) {
				if (arg0.anInt2373 != 12345678) {
					Static36.method842(local319, local335, local303, local311, local327, local295, arg0.anInt2373, arg0.anInt2371, arg0.anInt2369);
				}
			} else if (Static4.aBoolean1) {
				local472 = Static36.anInterface3_1.method1220(arg0.anInt2375);
				Static36.method842(local319, local335, local303, local311, local327, local295, Static4.method46(local472, arg0.anInt2373), Static4.method46(local472, arg0.anInt2371), Static4.method46(local472, arg0.anInt2369));
			} else if (arg0.aBoolean109) {
				Static36.method846(local319, local335, local303, local311, local327, local295, arg0.anInt2373, arg0.anInt2371, arg0.anInt2369, local101, local21, local245, local123, local51, local89, local121, local169, local265, arg0.anInt2375);
			} else {
				Static36.method846(local319, local335, local303, local311, local327, local295, arg0.anInt2373, arg0.anInt2371, arg0.anInt2369, local197, local245, local21, local66, local89, local51, local27, local265, local169, arg0.anInt2375);
			}
		}
		if ((local279 - local295) * (local335 - local303) - (local287 - local303) * (local327 - local295) <= 0) {
			return;
		}
		Static36.aBoolean41 = false;
		if (local279 < 0 || local295 < 0 || local327 < 0 || local279 > Static36.anInt1031 || local295 > Static36.anInt1031 || local327 > Static36.anInt1031) {
			Static36.aBoolean41 = true;
		}
		if (Static4.aBoolean2 && this.method50(Static4.anInt82, Static4.anInt85, local287, local303, local335, local279, local295, local327)) {
			Static4.anInt70 = arg6;
			Static4.anInt68 = arg7;
		}
		if (arg0.anInt2375 != -1) {
			if (!Static4.aBoolean1) {
				Static36.method846(local287, local303, local335, local279, local295, local327, arg0.anInt2370, arg0.anInt2369, arg0.anInt2371, local101, local21, local245, local123, local51, local89, local121, local169, local265, arg0.anInt2375);
				return;
			}
			local472 = Static36.anInterface3_1.method1220(arg0.anInt2375);
			Static36.method842(local287, local303, local335, local279, local295, local327, Static4.method46(local472, arg0.anInt2370), Static4.method46(local472, arg0.anInt2369), Static4.method46(local472, arg0.anInt2371));
		} else if (arg0.anInt2370 != 12345678) {
			Static36.method842(local287, local303, local335, local279, local295, local327, arg0.anInt2370, arg0.anInt2369, arg0.anInt2371);
			return;
		}
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(Lclient!cd;IIIIII)V")
	private void method48(@OriginalArg(0) Class14 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(3) int local3 = arg0.anIntArray94.length;
		@Pc(13) int local13;
		@Pc(20) int local20;
		@Pc(27) int local27;
		@Pc(37) int local37;
		for (@Pc(5) int local5 = 0; local5 < local3; local5++) {
			local13 = arg0.anIntArray94[local5] - Static4.anInt80;
			local20 = arg0.anIntArray86[local5] - Static4.anInt86;
			local27 = arg0.anIntArray83[local5] - Static4.anInt94;
			local37 = local27 * arg3 + local13 * arg4 >> 16;
			@Pc(47) int local47 = local27 * arg4 - local13 * arg3 >> 16;
			@Pc(59) int local59 = local20 * arg2 - local47 * arg1 >> 16;
			@Pc(69) int local69 = local20 * arg1 + local47 * arg2 >> 16;
			if (local69 < 50) {
				return;
			}
			if (arg0.anIntArray88 != null) {
				Static17.anIntArray90[local5] = local37;
				Static17.anIntArray89[local5] = local59;
				Static17.anIntArray87[local5] = local69;
			}
			Static17.anIntArray84[local5] = Static36.anInt1030 + (local37 << 9) / local69;
			Static17.anIntArray97[local5] = Static36.anInt1029 + (local59 << 9) / local69;
		}
		Static36.anInt1024 = 0;
		local3 = arg0.anIntArray93.length;
		for (local13 = 0; local13 < local3; local13++) {
			local20 = arg0.anIntArray93[local13];
			local27 = arg0.anIntArray96[local13];
			local37 = arg0.anIntArray92[local13];
			@Pc(142) int local142 = Static17.anIntArray84[local20];
			@Pc(146) int local146 = Static17.anIntArray84[local27];
			@Pc(150) int local150 = Static17.anIntArray84[local37];
			@Pc(154) int local154 = Static17.anIntArray97[local20];
			@Pc(158) int local158 = Static17.anIntArray97[local27];
			@Pc(162) int local162 = Static17.anIntArray97[local37];
			if ((local142 - local146) * (local162 - local158) - (local154 - local158) * (local150 - local146) > 0) {
				Static36.aBoolean41 = false;
				if (local142 < 0 || local146 < 0 || local150 < 0 || local142 > Static36.anInt1031 || local146 > Static36.anInt1031 || local150 > Static36.anInt1031) {
					Static36.aBoolean41 = true;
				}
				if (Static4.aBoolean2 && this.method50(Static4.anInt82, Static4.anInt85, local154, local158, local162, local142, local146, local150)) {
					Static4.anInt70 = arg5;
					Static4.anInt68 = arg6;
				}
				if (arg0.anIntArray88 == null || arg0.anIntArray88[local13] == -1) {
					if (arg0.anIntArray95[local13] != 12345678) {
						Static36.method842(local154, local158, local162, local142, local146, local150, arg0.anIntArray95[local13], arg0.anIntArray91[local13], arg0.anIntArray85[local13]);
					}
				} else if (Static4.aBoolean1) {
					@Pc(364) int local364 = Static36.anInterface3_1.method1220(arg0.anIntArray88[local13]);
					Static36.method842(local154, local158, local162, local142, local146, local150, Static4.method46(local364, arg0.anIntArray95[local13]), Static4.method46(local364, arg0.anIntArray91[local13]), Static4.method46(local364, arg0.anIntArray85[local13]));
				} else if (arg0.aBoolean13) {
					Static36.method846(local154, local158, local162, local142, local146, local150, arg0.anIntArray95[local13], arg0.anIntArray91[local13], arg0.anIntArray85[local13], Static17.anIntArray90[0], Static17.anIntArray90[1], Static17.anIntArray90[3], Static17.anIntArray89[0], Static17.anIntArray89[1], Static17.anIntArray89[3], Static17.anIntArray87[0], Static17.anIntArray87[1], Static17.anIntArray87[3], arg0.anIntArray88[local13]);
				} else {
					Static36.method846(local154, local158, local162, local142, local146, local150, arg0.anIntArray95[local13], arg0.anIntArray91[local13], arg0.anIntArray85[local13], Static17.anIntArray90[local20], Static17.anIntArray90[local27], Static17.anIntArray90[local37], Static17.anIntArray89[local20], Static17.anIntArray89[local27], Static17.anIntArray89[local37], Static17.anIntArray87[local20], Static17.anIntArray87[local27], Static17.anIntArray87[local37], arg0.anIntArray88[local13]);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(III)Z")
	private boolean method49(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < Static4.anInt91; local1++) {
			@Pc(6) Class55 local6 = Static4.aClass55Array1[local1];
			@Pc(15) int local15;
			@Pc(27) int local27;
			@Pc(37) int local37;
			@Pc(47) int local47;
			@Pc(57) int local57;
			if (local6.anInt1590 == 1) {
				local15 = local6.anInt1568 - arg0;
				if (local15 > 0) {
					local27 = local6.anInt1581 + (local6.anInt1585 * local15 >> 8);
					local37 = local6.anInt1592 + (local6.anInt1577 * local15 >> 8);
					local47 = local6.anInt1582 + (local6.anInt1572 * local15 >> 8);
					local57 = local6.anInt1573 + (local6.anInt1567 * local15 >> 8);
					if (arg2 >= local27 && arg2 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt1590 == 2) {
				local15 = arg0 - local6.anInt1568;
				if (local15 > 0) {
					local27 = local6.anInt1581 + (local6.anInt1585 * local15 >> 8);
					local37 = local6.anInt1592 + (local6.anInt1577 * local15 >> 8);
					local47 = local6.anInt1582 + (local6.anInt1572 * local15 >> 8);
					local57 = local6.anInt1573 + (local6.anInt1567 * local15 >> 8);
					if (arg2 >= local27 && arg2 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt1590 == 3) {
				local15 = local6.anInt1581 - arg2;
				if (local15 > 0) {
					local27 = local6.anInt1568 + (local6.anInt1575 * local15 >> 8);
					local37 = local6.anInt1584 + (local6.anInt1570 * local15 >> 8);
					local47 = local6.anInt1582 + (local6.anInt1572 * local15 >> 8);
					local57 = local6.anInt1573 + (local6.anInt1567 * local15 >> 8);
					if (arg0 >= local27 && arg0 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt1590 == 4) {
				local15 = arg2 - local6.anInt1581;
				if (local15 > 0) {
					local27 = local6.anInt1568 + (local6.anInt1575 * local15 >> 8);
					local37 = local6.anInt1584 + (local6.anInt1570 * local15 >> 8);
					local47 = local6.anInt1582 + (local6.anInt1572 * local15 >> 8);
					local57 = local6.anInt1573 + (local6.anInt1567 * local15 >> 8);
					if (arg0 >= local27 && arg0 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt1590 == 5) {
				local15 = arg1 - local6.anInt1582;
				if (local15 > 0) {
					local27 = local6.anInt1568 + (local6.anInt1575 * local15 >> 8);
					local37 = local6.anInt1584 + (local6.anInt1570 * local15 >> 8);
					local47 = local6.anInt1581 + (local6.anInt1585 * local15 >> 8);
					local57 = local6.anInt1592 + (local6.anInt1577 * local15 >> 8);
					if (arg0 >= local27 && arg0 <= local37 && arg2 >= local47 && arg2 <= local57) {
						return true;
					}
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(IIIIIIII)Z")
	private boolean method50(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
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

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(IIIILclient!qb;IIIIII)V")
	public void method51(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class1_Sub2_Sub3 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		if (arg4 == null) {
			return;
		}
		@Pc(6) Class10 local6 = new Class10();
		local6.anInt260 = arg9;
		local6.anInt258 = arg10;
		local6.anInt261 = arg1 * 128 + arg7 + 64;
		local6.anInt262 = arg2 * 128 + arg8 + 64;
		local6.anInt259 = arg3;
		local6.aClass1_Sub2_Sub3_4 = arg4;
		local6.anInt256 = arg5;
		local6.anInt255 = arg6;
		for (@Pc(44) int local44 = arg0; local44 >= 0; local44--) {
			if (this.aClass1_Sub12ArrayArrayArray1[local44][arg1][arg2] == null) {
				this.aClass1_Sub12ArrayArrayArray1[local44][arg1][arg2] = new Class1_Sub12(local44, arg1, arg2);
			}
		}
		this.aClass1_Sub12ArrayArrayArray1[arg0][arg1][arg2].aClass10_1 = local6;
	}

	@OriginalMember(owner = "client!ac", name = "b", descriptor = "(III)Lclient!mc;")
	public Class53 method52(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class1_Sub12 local8 = this.aClass1_Sub12ArrayArrayArray1[arg0][arg1][arg2];
		return local8 == null ? null : local8.aClass53_1;
	}

	@OriginalMember(owner = "client!ac", name = "c", descriptor = "(III)V")
	public void method53(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		Static4.aBoolean2 = true;
		Static4.anInt71 = arg0;
		Static4.anInt82 = arg1;
		Static4.anInt85 = arg2;
		Static4.anInt70 = -1;
		Static4.anInt68 = -1;
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(IIIILclient!qb;ILclient!qb;Lclient!qb;)V")
	public void method54(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class1_Sub2_Sub3 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class1_Sub2_Sub3 arg6, @OriginalArg(7) Class1_Sub2_Sub3 arg7) {
		@Pc(3) Class5 local3 = new Class5();
		local3.aClass1_Sub2_Sub3_2 = arg4;
		local3.anInt107 = arg1 * 128 + 64;
		local3.anInt105 = arg2 * 128 + 64;
		local3.anInt112 = arg3;
		local3.anInt110 = arg5;
		local3.aClass1_Sub2_Sub3_3 = arg6;
		local3.aClass1_Sub2_Sub3_1 = arg7;
		@Pc(34) int local34 = 0;
		@Pc(43) Class1_Sub12 local43 = this.aClass1_Sub12ArrayArrayArray1[arg0][arg1][arg2];
		if (local43 != null) {
			for (@Pc(47) int local47 = 0; local47 < local43.anInt1697; local47++) {
				if ((local43.aClass38Array3[local47].anInt1297 & 0x100) == 256 && local43.aClass38Array3[local47].aClass1_Sub2_Sub3_6 instanceof Class1_Sub2_Sub3_Sub2) {
					@Pc(71) Class1_Sub2_Sub3_Sub2 local71 = (Class1_Sub2_Sub3_Sub2) local43.aClass38Array3[local47].aClass1_Sub2_Sub3_6;
					local71.method465();
					if (local71.anInt2778 > local34) {
						local34 = local71.anInt2778;
					}
				}
			}
		}
		local3.anInt102 = local34;
		if (this.aClass1_Sub12ArrayArrayArray1[arg0][arg1][arg2] == null) {
			this.aClass1_Sub12ArrayArrayArray1[arg0][arg1][arg2] = new Class1_Sub12(arg0, arg1, arg2);
		}
		this.aClass1_Sub12ArrayArrayArray1[arg0][arg1][arg2].aClass5_1 = local3;
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(IIIIILclient!qb;IIIIII)Z")
	public boolean method55(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) Class1_Sub2_Sub3 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		return arg4 == null ? true : this.method87(arg0, arg7, arg8, arg9 + 1 - arg7, arg10 - arg8 + 1, arg1, arg2, arg3, arg4, arg5, true, arg6, 0);
	}

	@OriginalMember(owner = "client!ac", name = "b", descriptor = "()V")
	public void method56() {
		@Pc(4) int local4;
		@Pc(7) int local7;
		for (@Pc(1) int local1 = 0; local1 < this.anInt84; local1++) {
			for (local4 = 0; local4 < this.anInt69; local4++) {
				for (local7 = 0; local7 < this.anInt77; local7++) {
					this.aClass1_Sub12ArrayArrayArray1[local1][local4][local7] = null;
				}
			}
		}
		for (local4 = 0; local4 < Static4.anInt83; local4++) {
			for (local7 = 0; local7 < Static4.anIntArray13[local4]; local7++) {
				Static4.aClass55ArrayArray1[local4][local7] = null;
			}
			Static4.anIntArray13[local4] = 0;
		}
		for (local7 = 0; local7 < this.anInt72; local7++) {
			this.aClass38Array1[local7] = null;
		}
		this.anInt72 = 0;
		for (@Pc(76) int local76 = 0; local76 < Static4.aClass38Array2.length; local76++) {
			Static4.aClass38Array2[local76] = null;
		}
	}

	@OriginalMember(owner = "client!ac", name = "b", descriptor = "(IIII)I")
	public int method57(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(8) Class1_Sub12 local8 = this.aClass1_Sub12ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 == null) {
			return -1;
		} else if (local8.aClass53_1 != null && local8.aClass53_1.anInt1548 == arg3) {
			return local8.aClass53_1.anInt1540 & 0xFF;
		} else if (local8.aClass10_1 != null && local8.aClass10_1.anInt260 == arg3) {
			return local8.aClass10_1.anInt258 & 0xFF;
		} else if (local8.aClass31_1 != null && local8.aClass31_1.anInt1193 == arg3) {
			return local8.aClass31_1.anInt1195 & 0xFF;
		} else {
			for (@Pc(56) int local56 = 0; local56 < local8.anInt1697; local56++) {
				if (local8.aClass38Array3[local56].anInt1290 == arg3) {
					return local8.aClass38Array3[local56].anInt1297 & 0xFF;
				}
			}
			return -1;
		}
	}

	@OriginalMember(owner = "client!ac", name = "d", descriptor = "(III)V")
	public void method58(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class1_Sub12 local8 = this.aClass1_Sub12ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 != null) {
			local8.aClass31_1 = null;
		}
	}

	@OriginalMember(owner = "client!ac", name = "c", descriptor = "(IIII)Z")
	private boolean method59(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!this.method94(arg0, arg1, arg2)) {
			return false;
		}
		@Pc(11) int local11 = arg1 << 7;
		@Pc(15) int local15 = arg2 << 7;
		@Pc(26) int local26 = this.anIntArrayArrayArray1[arg0][arg1][arg2] - 1;
		@Pc(30) int local30 = local26 - 120;
		@Pc(34) int local34 = local26 - 230;
		@Pc(38) int local38 = local26 - 238;
		if (arg3 < 16) {
			if (arg3 == 1) {
				if (local11 > Static4.anInt80) {
					if (!this.method49(local11, local26, local15)) {
						return false;
					}
					if (!this.method49(local11, local26, local15 + 128)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!this.method49(local11, local30, local15)) {
						return false;
					}
					if (!this.method49(local11, local30, local15 + 128)) {
						return false;
					}
				}
				if (!this.method49(local11, local34, local15)) {
					return false;
				}
				if (!this.method49(local11, local34, local15 + 128)) {
					return false;
				}
				return true;
			}
			if (arg3 == 2) {
				if (local15 < Static4.anInt94) {
					if (!this.method49(local11, local26, local15 + 128)) {
						return false;
					}
					if (!this.method49(local11 + 128, local26, local15 + 128)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!this.method49(local11, local30, local15 + 128)) {
						return false;
					}
					if (!this.method49(local11 + 128, local30, local15 + 128)) {
						return false;
					}
				}
				if (!this.method49(local11, local34, local15 + 128)) {
					return false;
				}
				if (!this.method49(local11 + 128, local34, local15 + 128)) {
					return false;
				}
				return true;
			}
			if (arg3 == 4) {
				if (local11 < Static4.anInt80) {
					if (!this.method49(local11 + 128, local26, local15)) {
						return false;
					}
					if (!this.method49(local11 + 128, local26, local15 + 128)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!this.method49(local11 + 128, local30, local15)) {
						return false;
					}
					if (!this.method49(local11 + 128, local30, local15 + 128)) {
						return false;
					}
				}
				if (!this.method49(local11 + 128, local34, local15)) {
					return false;
				}
				if (!this.method49(local11 + 128, local34, local15 + 128)) {
					return false;
				}
				return true;
			}
			if (arg3 == 8) {
				if (local15 > Static4.anInt94) {
					if (!this.method49(local11, local26, local15)) {
						return false;
					}
					if (!this.method49(local11 + 128, local26, local15)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!this.method49(local11, local30, local15)) {
						return false;
					}
					if (!this.method49(local11 + 128, local30, local15)) {
						return false;
					}
				}
				if (!this.method49(local11, local34, local15)) {
					return false;
				}
				if (!this.method49(local11 + 128, local34, local15)) {
					return false;
				}
				return true;
			}
		}
		if (!this.method49(local11 + 64, local38, local15 + 64)) {
			return false;
		} else if (arg3 == 16) {
			return this.method49(local11, local34, local15 + 128);
		} else if (arg3 == 32) {
			return this.method49(local11 + 128, local34, local15 + 128);
		} else if (arg3 == 64) {
			return this.method49(local11 + 128, local34, local15);
		} else if (arg3 == 128) {
			return this.method49(local11, local34, local15);
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!ac", name = "e", descriptor = "(III)I")
	public int method60(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class1_Sub12 local8 = this.aClass1_Sub12ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 == null) {
			return 0;
		}
		for (@Pc(14) int local14 = 0; local14 < local8.anInt1697; local14++) {
			@Pc(20) Class38 local20 = local8.aClass38Array3[local14];
			if ((local20.anInt1290 >> 29 & 0x3) == 2 && local20.anInt1300 == arg1 && local20.anInt1277 == arg2) {
				return local20.anInt1290;
			}
		}
		return 0;
	}

	@OriginalMember(owner = "client!ac", name = "f", descriptor = "(III)V")
	public void method61() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt84; local1++) {
			for (@Pc(4) int local4 = 0; local4 < this.anInt69; local4++) {
				for (@Pc(7) int local7 = 0; local7 < this.anInt77; local7++) {
					@Pc(17) Class1_Sub12 local17 = this.aClass1_Sub12ArrayArrayArray1[local1][local4][local7];
					if (local17 != null) {
						@Pc(22) Class53 local22 = local17.aClass53_1;
						if (local22 != null && local22.aClass1_Sub2_Sub3_8 instanceof Class1_Sub2_Sub3_Sub7) {
							@Pc(32) Class1_Sub2_Sub3_Sub7 local32 = (Class1_Sub2_Sub3_Sub7) local22.aClass1_Sub2_Sub3_8;
							this.method77(local32, local1, local4, local7, 1, 1);
							if (local22.aClass1_Sub2_Sub3_7 instanceof Class1_Sub2_Sub3_Sub7) {
								@Pc(48) Class1_Sub2_Sub3_Sub7 local48 = (Class1_Sub2_Sub3_Sub7) local22.aClass1_Sub2_Sub3_7;
								this.method77(local48, local1, local4, local7, 1, 1);
								Static117.method1890(local32, local48, 0, 0, 0, false);
								local22.aClass1_Sub2_Sub3_7 = local48.method1893(local48.aShort1, local48.aShort2, -50, -10, -50);
							}
							local22.aClass1_Sub2_Sub3_8 = local32.method1893(local32.aShort1, local32.aShort2, -50, -10, -50);
						}
						@Pc(103) Class1_Sub2_Sub3_Sub7 local103;
						for (@Pc(87) int local87 = 0; local87 < local17.anInt1697; local87++) {
							@Pc(93) Class38 local93 = local17.aClass38Array3[local87];
							if (local93 != null && local93.aClass1_Sub2_Sub3_6 instanceof Class1_Sub2_Sub3_Sub7) {
								local103 = (Class1_Sub2_Sub3_Sub7) local93.aClass1_Sub2_Sub3_6;
								this.method77(local103, local1, local4, local7, local93.anInt1284 + 1 - local93.anInt1300, local93.anInt1292 - local93.anInt1277 + 1);
								local93.aClass1_Sub2_Sub3_6 = local103.method1893(local103.aShort1, local103.aShort2, -50, -10, -50);
							}
						}
						@Pc(142) Class31 local142 = local17.aClass31_1;
						if (local142 != null && local142.aClass1_Sub2_Sub3_5 instanceof Class1_Sub2_Sub3_Sub7) {
							local103 = (Class1_Sub2_Sub3_Sub7) local142.aClass1_Sub2_Sub3_5;
							this.method89(local103, local1, local4, local7);
							local142.aClass1_Sub2_Sub3_5 = local103.method1893(local103.aShort1, local103.aShort2, -50, -10, -50);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ac", name = "g", descriptor = "(III)I")
	public int method62(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class1_Sub12 local8 = this.aClass1_Sub12ArrayArrayArray1[arg0][arg1][arg2];
		return local8 == null || local8.aClass53_1 == null ? 0 : local8.aClass53_1.anInt1548;
	}

	@OriginalMember(owner = "client!ac", name = "h", descriptor = "(III)I")
	public int method64(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class1_Sub12 local8 = this.aClass1_Sub12ArrayArrayArray1[arg0][arg1][arg2];
		return local8 == null || local8.aClass10_1 == null ? 0 : local8.aClass10_1.anInt260;
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(IIIIII)Z")
	private boolean method65(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(17) int local17;
		@Pc(21) int local21;
		if (arg1 != arg2 || arg3 != arg4) {
			for (local17 = arg1; local17 <= arg2; local17++) {
				for (local21 = arg3; local21 <= arg4; local21++) {
					if (this.anIntArrayArrayArray2[arg0][local17][local21] == -Static4.anInt79) {
						return false;
					}
				}
			}
			local21 = (arg1 << 7) + 1;
			@Pc(156) int local156 = (arg3 << 7) + 2;
			@Pc(167) int local167 = this.anIntArrayArrayArray1[arg0][arg1][arg3] - arg5;
			if (!this.method49(local21, local167, local156)) {
				return false;
			}
			@Pc(181) int local181 = (arg2 << 7) - 1;
			if (!this.method49(local181, local167, local156)) {
				return false;
			}
			@Pc(195) int local195 = (arg4 << 7) - 1;
			if (!this.method49(local21, local167, local195)) {
				return false;
			} else if (this.method49(local181, local167, local195)) {
				return true;
			} else {
				return false;
			}
		} else if (this.method94(arg0, arg1, arg3)) {
			local17 = arg1 << 7;
			local21 = arg3 << 7;
			return this.method49(local17 + 1, this.anIntArrayArrayArray1[arg0][arg1][arg3] - arg5, local21 + 1) && this.method49(local17 + 128 - 1, this.anIntArrayArrayArray1[arg0][arg1 + 1][arg3] - arg5, local21 + 1) && this.method49(local17 + 128 - 1, this.anIntArrayArrayArray1[arg0][arg1 + 1][arg3 + 1] - arg5, local21 + 128 - 1) && this.method49(local17 + 1, this.anIntArrayArrayArray1[arg0][arg1][arg3 + 1] - arg5, local21 + 128 - 1);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(IIIIILclient!qb;IIZ)Z")
	public boolean method66(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class1_Sub2_Sub3 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8) {
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
		return this.method87(arg0, local7, local11, local15 + 1 - local7, local19 - local11 + 1, arg1, arg2, arg3, arg5, arg6, true, arg7, 0);
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(Lclient!n;Z)V")
	private void method67(@OriginalArg(0) Class1_Sub12 arg0, @OriginalArg(1) boolean arg1) {
		Static4.aClass2_1.method33(arg0);
		while (true) {
			@Pc(8) Class1_Sub12 local8;
			@Pc(17) int local17;
			@Pc(20) int local20;
			@Pc(23) int local23;
			@Pc(26) int local26;
			@Pc(31) Class1_Sub12[][] local31;
			@Pc(49) Class1_Sub12 local49;
			@Pc(251) int local251;
			@Pc(588) int local588;
			@Pc(593) int local593;
			@Pc(598) int local598;
			@Pc(601) int local601;
			@Pc(610) int local610;
			@Pc(952) Class53 local952;
			@Pc(1126) int local1126;
			@Pc(1011) int local1011;
			do {
				do {
					do {
						do {
							do {
								do {
									while (true) {
										@Pc(257) Class38 var12;
										@Pc(622) int var19;
										@Pc(345) int var23;
										@Pc(289) boolean var24;
										@Pc(833) Class1_Sub12 var35;
										while (true) {
											do {
												local8 = (Class1_Sub12) Static4.aClass2_1.method20();
												if (local8 == null) {
													return;
												}
											} while (!local8.aBoolean72);
											local17 = local8.anInt1694;
											local20 = local8.anInt1703;
											local23 = local8.anInt1692;
											local26 = local8.anInt1700;
											local31 = this.aClass1_Sub12ArrayArrayArray1[local23];
											if (!local8.aBoolean71) {
												break;
											}
											if (arg1) {
												if (local23 > 0) {
													local49 = this.aClass1_Sub12ArrayArrayArray1[local23 - 1][local17][local20];
													if (local49 != null && local49.aBoolean72) {
														continue;
													}
												}
												if (local17 <= Static4.anInt75 && local17 > Static4.anInt92) {
													local49 = local31[local17 - 1][local20];
													if (local49 != null && local49.aBoolean72 && (local49.aBoolean71 || (local8.anInt1698 & 0x1) == 0)) {
														continue;
													}
												}
												if (local17 >= Static4.anInt75 && local17 < Static4.anInt73 - 1) {
													local49 = local31[local17 + 1][local20];
													if (local49 != null && local49.aBoolean72 && (local49.aBoolean71 || (local8.anInt1698 & 0x4) == 0)) {
														continue;
													}
												}
												if (local20 <= Static4.anInt88 && local20 > Static4.anInt81) {
													local49 = local31[local17][local20 - 1];
													if (local49 != null && local49.aBoolean72 && (local49.aBoolean71 || (local8.anInt1698 & 0x8) == 0)) {
														continue;
													}
												}
												if (local20 >= Static4.anInt88 && local20 < Static4.anInt89 - 1) {
													local49 = local31[local17][local20 + 1];
													if (local49 != null && local49.aBoolean72 && (local49.aBoolean71 || (local8.anInt1698 & 0x2) == 0)) {
														continue;
													}
												}
											} else {
												arg1 = true;
											}
											local8.aBoolean71 = false;
											if (local8.aClass1_Sub12_1 != null) {
												local49 = local8.aClass1_Sub12_1;
												if (local49.aClass69_1 == null) {
													if (local49.aClass14_1 != null && !this.method94(0, local17, local20)) {
														this.method48(local49.aClass14_1, Static4.anInt90, Static4.anInt93, Static4.anInt95, Static4.anInt74, local17, local20);
													}
												} else if (!this.method94(0, local17, local20)) {
													this.method45(local49.aClass69_1, 0, Static4.anInt90, Static4.anInt93, Static4.anInt95, Static4.anInt74, local17, local20);
												}
												@Pc(225) Class53 local225 = local49.aClass53_1;
												if (local225 != null) {
													local225.aClass1_Sub2_Sub3_8.method1968(0, Static4.anInt90, Static4.anInt93, Static4.anInt95, Static4.anInt74, local225.anInt1538 - Static4.anInt80, local225.anInt1545 - Static4.anInt86, local225.anInt1542 - Static4.anInt94, local225.anInt1548);
												}
												for (local251 = 0; local251 < local49.anInt1697; local251++) {
													var12 = local49.aClass38Array3[local251];
													if (var12 != null) {
														var12.aClass1_Sub2_Sub3_6.method1968(var12.anInt1278, Static4.anInt90, Static4.anInt93, Static4.anInt95, Static4.anInt74, var12.anInt1301 - Static4.anInt80, var12.anInt1299 - Static4.anInt86, var12.anInt1289 - Static4.anInt94, var12.anInt1290);
													}
												}
											}
											var24 = false;
											if (local8.aClass69_1 == null) {
												if (local8.aClass14_1 != null && !this.method94(local26, local17, local20)) {
													var24 = true;
													this.method48(local8.aClass14_1, Static4.anInt90, Static4.anInt93, Static4.anInt95, Static4.anInt74, local17, local20);
												}
											} else if (!this.method94(local26, local17, local20)) {
												var24 = true;
												if (local8.aClass69_1.anInt2373 != 12345678 || Static4.aBoolean2 && local23 <= Static4.anInt71) {
													this.method45(local8.aClass69_1, local26, Static4.anInt90, Static4.anInt93, Static4.anInt95, Static4.anInt74, local17, local20);
												}
											}
											var23 = 0;
											local251 = 0;
											@Pc(350) Class53 local350 = local8.aClass53_1;
											@Pc(353) Class10 local353 = local8.aClass10_1;
											if (local350 != null || local353 != null) {
												if (Static4.anInt75 == local17) {
													var23++;
												} else if (Static4.anInt75 < local17) {
													var23 += 2;
												}
												if (Static4.anInt88 == local20) {
													var23 += 3;
												} else if (Static4.anInt88 > local20) {
													var23 += 6;
												}
												local251 = Static4.anIntArray21[var23];
												local8.anInt1701 = Static4.anIntArray23[var23];
											}
											if (local350 != null) {
												if ((local350.anInt1539 & Static4.anIntArray22[var23]) == 0) {
													local8.anInt1695 = 0;
												} else if (local350.anInt1539 == 16) {
													local8.anInt1695 = 3;
													local8.anInt1704 = Static4.anIntArray19[var23];
													local8.anInt1702 = 3 - local8.anInt1704;
												} else if (local350.anInt1539 == 32) {
													local8.anInt1695 = 6;
													local8.anInt1704 = Static4.anIntArray20[var23];
													local8.anInt1702 = 6 - local8.anInt1704;
												} else if (local350.anInt1539 == 64) {
													local8.anInt1695 = 12;
													local8.anInt1704 = Static4.anIntArray18[var23];
													local8.anInt1702 = 12 - local8.anInt1704;
												} else {
													local8.anInt1695 = 9;
													local8.anInt1704 = Static4.anIntArray24[var23];
													local8.anInt1702 = 9 - local8.anInt1704;
												}
												if ((local350.anInt1539 & local251) != 0 && !this.method59(local26, local17, local20, local350.anInt1539)) {
													local350.aClass1_Sub2_Sub3_8.method1968(0, Static4.anInt90, Static4.anInt93, Static4.anInt95, Static4.anInt74, local350.anInt1538 - Static4.anInt80, local350.anInt1545 - Static4.anInt86, local350.anInt1542 - Static4.anInt94, local350.anInt1548);
												}
												if ((local350.anInt1544 & local251) != 0 && !this.method59(local26, local17, local20, local350.anInt1544)) {
													local350.aClass1_Sub2_Sub3_7.method1968(0, Static4.anInt90, Static4.anInt93, Static4.anInt95, Static4.anInt74, local350.anInt1538 - Static4.anInt80, local350.anInt1545 - Static4.anInt86, local350.anInt1542 - Static4.anInt94, local350.anInt1548);
												}
											}
											if (local353 != null && !this.method85(local26, local17, local20, local353.aClass1_Sub2_Sub3_4.anInt2778)) {
												if ((local353.anInt256 & local251) != 0) {
													local353.aClass1_Sub2_Sub3_4.method1968(local353.anInt255, Static4.anInt90, Static4.anInt93, Static4.anInt95, Static4.anInt74, local353.anInt261 - Static4.anInt80, local353.anInt259 - Static4.anInt86, local353.anInt262 - Static4.anInt94, local353.anInt260);
												} else if ((local353.anInt256 & 0x300) != 0) {
													local588 = local353.anInt261 - Static4.anInt80;
													local593 = local353.anInt259 - Static4.anInt86;
													local598 = local353.anInt262 - Static4.anInt94;
													local601 = local353.anInt255;
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
													if ((local353.anInt256 & 0x100) != 0 && var19 < local610) {
														local639 = local588 + Static4.anIntArray15[local601];
														local645 = local598 + Static4.anIntArray17[local601];
														local353.aClass1_Sub2_Sub3_4.method1968(local601 * 512 + 256, Static4.anInt90, Static4.anInt93, Static4.anInt95, Static4.anInt74, local639, local593, local645, local353.anInt260);
													}
													if ((local353.anInt256 & 0x200) != 0 && var19 > local610) {
														local639 = local588 + Static4.anIntArray14[local601];
														local645 = local598 + Static4.anIntArray16[local601];
														local353.aClass1_Sub2_Sub3_4.method1968(local601 * 512 + 1280 & 0x7FF, Static4.anInt90, Static4.anInt93, Static4.anInt95, Static4.anInt74, local639, local593, local645, local353.anInt260);
													}
												}
											}
											if (var24) {
												@Pc(706) Class31 local706 = local8.aClass31_1;
												if (local706 != null) {
													local706.aClass1_Sub2_Sub3_5.method1968(0, Static4.anInt90, Static4.anInt93, Static4.anInt95, Static4.anInt74, local706.anInt1194 - Static4.anInt80, local706.anInt1200 - Static4.anInt86, local706.anInt1201 - Static4.anInt94, local706.anInt1193);
												}
												@Pc(733) Class5 local733 = local8.aClass5_1;
												if (local733 != null && local733.anInt102 == 0) {
													if (local733.aClass1_Sub2_Sub3_3 != null) {
														local733.aClass1_Sub2_Sub3_3.method1968(0, Static4.anInt90, Static4.anInt93, Static4.anInt95, Static4.anInt74, local733.anInt107 - Static4.anInt80, local733.anInt112 - Static4.anInt86, local733.anInt105 - Static4.anInt94, local733.anInt110);
													}
													if (local733.aClass1_Sub2_Sub3_1 != null) {
														local733.aClass1_Sub2_Sub3_1.method1968(0, Static4.anInt90, Static4.anInt93, Static4.anInt95, Static4.anInt74, local733.anInt107 - Static4.anInt80, local733.anInt112 - Static4.anInt86, local733.anInt105 - Static4.anInt94, local733.anInt110);
													}
													if (local733.aClass1_Sub2_Sub3_2 != null) {
														local733.aClass1_Sub2_Sub3_2.method1968(0, Static4.anInt90, Static4.anInt93, Static4.anInt95, Static4.anInt74, local733.anInt107 - Static4.anInt80, local733.anInt112 - Static4.anInt86, local733.anInt105 - Static4.anInt94, local733.anInt110);
													}
												}
											}
											local588 = local8.anInt1698;
											if (local588 != 0) {
												if (local17 < Static4.anInt75 && (local588 & 0x4) != 0) {
													var35 = local31[local17 + 1][local20];
													if (var35 != null && var35.aBoolean72) {
														Static4.aClass2_1.method33(var35);
													}
												}
												if (local20 < Static4.anInt88 && (local588 & 0x2) != 0) {
													var35 = local31[local17][local20 + 1];
													if (var35 != null && var35.aBoolean72) {
														Static4.aClass2_1.method33(var35);
													}
												}
												if (local17 > Static4.anInt75 && (local588 & 0x1) != 0) {
													var35 = local31[local17 - 1][local20];
													if (var35 != null && var35.aBoolean72) {
														Static4.aClass2_1.method33(var35);
													}
												}
												if (local20 > Static4.anInt88 && (local588 & 0x8) != 0) {
													var35 = local31[local17][local20 - 1];
													if (var35 != null && var35.aBoolean72) {
														Static4.aClass2_1.method33(var35);
													}
												}
											}
											break;
										}
										if (local8.anInt1695 != 0) {
											var24 = true;
											for (var23 = 0; var23 < local8.anInt1697; var23++) {
												if (local8.aClass38Array3[var23].anInt1286 != Static4.anInt79 && (local8.anIntArray311[var23] & local8.anInt1695) == local8.anInt1704) {
													var24 = false;
													break;
												}
											}
											if (var24) {
												local952 = local8.aClass53_1;
												if (!this.method59(local26, local17, local20, local952.anInt1539)) {
													local952.aClass1_Sub2_Sub3_8.method1968(0, Static4.anInt90, Static4.anInt93, Static4.anInt95, Static4.anInt74, local952.anInt1538 - Static4.anInt80, local952.anInt1545 - Static4.anInt86, local952.anInt1542 - Static4.anInt94, local952.anInt1548);
												}
												local8.anInt1695 = 0;
											}
										}
										if (!local8.aBoolean70) {
											break;
										}
										try {
											@Pc(991) int local991 = local8.anInt1697;
											local8.aBoolean70 = false;
											var23 = 0;
											label568: for (local251 = 0; local251 < local991; local251++) {
												var12 = local8.aClass38Array3[local251];
												if (var12.anInt1286 != Static4.anInt79) {
													for (local1011 = var12.anInt1300; local1011 <= var12.anInt1284; local1011++) {
														for (local588 = var12.anInt1277; local588 <= var12.anInt1292; local588++) {
															var35 = local31[local1011][local588];
															if (var35.aBoolean71) {
																local8.aBoolean70 = true;
																continue label568;
															}
															if (var35.anInt1695 != 0) {
																local598 = 0;
																if (local1011 > var12.anInt1300) {
																	local598++;
																}
																if (local1011 < var12.anInt1284) {
																	local598 += 4;
																}
																if (local588 > var12.anInt1277) {
																	local598 += 8;
																}
																if (local588 < var12.anInt1292) {
																	local598 += 2;
																}
																if ((local598 & var35.anInt1695) == local8.anInt1702) {
																	local8.aBoolean70 = true;
																	continue label568;
																}
															}
														}
													}
													Static4.aClass38Array2[var23++] = var12;
													local588 = Static4.anInt75 - var12.anInt1300;
													local593 = var12.anInt1284 - Static4.anInt75;
													if (local593 > local588) {
														local588 = local593;
													}
													local598 = Static4.anInt88 - var12.anInt1277;
													local601 = var12.anInt1292 - Static4.anInt88;
													if (local601 > local598) {
														var12.anInt1285 = local588 + local601;
													} else {
														var12.anInt1285 = local588 + local598;
													}
												}
											}
											while (var23 > 0) {
												local1126 = -50;
												local1011 = -1;
												@Pc(1135) Class38 local1135;
												for (local588 = 0; local588 < var23; local588++) {
													local1135 = Static4.aClass38Array2[local588];
													if (local1135.anInt1286 != Static4.anInt79) {
														if (local1135.anInt1285 > local1126) {
															local1126 = local1135.anInt1285;
															local1011 = local588;
														} else if (local1135.anInt1285 == local1126) {
															local598 = local1135.anInt1301 - Static4.anInt80;
															local601 = local1135.anInt1289 - Static4.anInt94;
															local610 = Static4.aClass38Array2[local1011].anInt1301 - Static4.anInt80;
															var19 = Static4.aClass38Array2[local1011].anInt1289 - Static4.anInt94;
															if (local598 * local598 + local601 * local601 > local610 * local610 + var19 * var19) {
																local1011 = local588;
															}
														}
													}
												}
												if (local1011 == -1) {
													break;
												}
												local1135 = Static4.aClass38Array2[local1011];
												local1135.anInt1286 = Static4.anInt79;
												if (!this.method65(local26, local1135.anInt1300, local1135.anInt1284, local1135.anInt1277, local1135.anInt1292, local1135.aClass1_Sub2_Sub3_6.anInt2778)) {
													local1135.aClass1_Sub2_Sub3_6.method1968(local1135.anInt1278, Static4.anInt90, Static4.anInt93, Static4.anInt95, Static4.anInt74, local1135.anInt1301 - Static4.anInt80, local1135.anInt1299 - Static4.anInt86, local1135.anInt1289 - Static4.anInt94, local1135.anInt1290);
												}
												for (local598 = local1135.anInt1300; local598 <= local1135.anInt1284; local598++) {
													for (local601 = local1135.anInt1277; local601 <= local1135.anInt1292; local601++) {
														@Pc(1260) Class1_Sub12 local1260 = local31[local598][local601];
														if (local1260.anInt1695 != 0) {
															Static4.aClass2_1.method33(local1260);
														} else if ((local598 != local17 || local601 != local20) && local1260.aBoolean72) {
															Static4.aClass2_1.method33(local1260);
														}
													}
												}
											}
											if (!local8.aBoolean70) {
												break;
											}
										} catch (@Pc(1298) Exception local1298) {
											local8.aBoolean70 = false;
											break;
										}
									}
								} while (!local8.aBoolean72);
							} while (local8.anInt1695 != 0);
							if (local17 > Static4.anInt75 || local17 <= Static4.anInt92) {
								break;
							}
							local49 = local31[local17 - 1][local20];
						} while (local49 != null && local49.aBoolean72);
						if (local17 < Static4.anInt75 || local17 >= Static4.anInt73 - 1) {
							break;
						}
						local49 = local31[local17 + 1][local20];
					} while (local49 != null && local49.aBoolean72);
					if (local20 > Static4.anInt88 || local20 <= Static4.anInt81) {
						break;
					}
					local49 = local31[local17][local20 - 1];
				} while (local49 != null && local49.aBoolean72);
				if (local20 < Static4.anInt88 || local20 >= Static4.anInt89 - 1) {
					break;
				}
				local49 = local31[local17][local20 + 1];
			} while (local49 != null && local49.aBoolean72);
			local8.aBoolean72 = false;
			Static4.anInt78--;
			@Pc(1402) Class5 local1402 = local8.aClass5_1;
			if (local1402 != null && local1402.anInt102 != 0) {
				if (local1402.aClass1_Sub2_Sub3_3 != null) {
					local1402.aClass1_Sub2_Sub3_3.method1968(0, Static4.anInt90, Static4.anInt93, Static4.anInt95, Static4.anInt74, local1402.anInt107 - Static4.anInt80, local1402.anInt112 - Static4.anInt86 - local1402.anInt102, local1402.anInt105 - Static4.anInt94, local1402.anInt110);
				}
				if (local1402.aClass1_Sub2_Sub3_1 != null) {
					local1402.aClass1_Sub2_Sub3_1.method1968(0, Static4.anInt90, Static4.anInt93, Static4.anInt95, Static4.anInt74, local1402.anInt107 - Static4.anInt80, local1402.anInt112 - Static4.anInt86 - local1402.anInt102, local1402.anInt105 - Static4.anInt94, local1402.anInt110);
				}
				if (local1402.aClass1_Sub2_Sub3_2 != null) {
					local1402.aClass1_Sub2_Sub3_2.method1968(0, Static4.anInt90, Static4.anInt93, Static4.anInt95, Static4.anInt74, local1402.anInt107 - Static4.anInt80, local1402.anInt112 - Static4.anInt86 - local1402.anInt102, local1402.anInt105 - Static4.anInt94, local1402.anInt110);
				}
			}
			if (local8.anInt1701 != 0) {
				@Pc(1497) Class10 local1497 = local8.aClass10_1;
				if (local1497 != null && !this.method85(local26, local17, local20, local1497.aClass1_Sub2_Sub3_4.anInt2778)) {
					if ((local1497.anInt256 & local8.anInt1701) != 0) {
						local1497.aClass1_Sub2_Sub3_4.method1968(local1497.anInt255, Static4.anInt90, Static4.anInt93, Static4.anInt95, Static4.anInt74, local1497.anInt261 - Static4.anInt80, local1497.anInt259 - Static4.anInt86, local1497.anInt262 - Static4.anInt94, local1497.anInt260);
					} else if ((local1497.anInt256 & 0x300) != 0) {
						local251 = local1497.anInt261 - Static4.anInt80;
						local1126 = local1497.anInt259 - Static4.anInt86;
						local1011 = local1497.anInt262 - Static4.anInt94;
						local588 = local1497.anInt255;
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
						if ((local1497.anInt256 & 0x100) != 0 && local598 >= local593) {
							local601 = local251 + Static4.anIntArray15[local588];
							local610 = local1011 + Static4.anIntArray17[local588];
							local1497.aClass1_Sub2_Sub3_4.method1968(local588 * 512 + 256, Static4.anInt90, Static4.anInt93, Static4.anInt95, Static4.anInt74, local601, local1126, local610, local1497.anInt260);
						}
						if ((local1497.anInt256 & 0x200) != 0 && local598 <= local593) {
							local601 = local251 + Static4.anIntArray14[local588];
							local610 = local1011 + Static4.anIntArray16[local588];
							local1497.aClass1_Sub2_Sub3_4.method1968(local588 * 512 + 1280 & 0x7FF, Static4.anInt90, Static4.anInt93, Static4.anInt95, Static4.anInt74, local601, local1126, local610, local1497.anInt260);
						}
					}
				}
				local952 = local8.aClass53_1;
				if (local952 != null) {
					if ((local952.anInt1544 & local8.anInt1701) != 0 && !this.method59(local26, local17, local20, local952.anInt1544)) {
						local952.aClass1_Sub2_Sub3_7.method1968(0, Static4.anInt90, Static4.anInt93, Static4.anInt95, Static4.anInt74, local952.anInt1538 - Static4.anInt80, local952.anInt1545 - Static4.anInt86, local952.anInt1542 - Static4.anInt94, local952.anInt1548);
					}
					if ((local952.anInt1539 & local8.anInt1701) != 0 && !this.method59(local26, local17, local20, local952.anInt1539)) {
						local952.aClass1_Sub2_Sub3_8.method1968(0, Static4.anInt90, Static4.anInt93, Static4.anInt95, Static4.anInt74, local952.anInt1538 - Static4.anInt80, local952.anInt1545 - Static4.anInt86, local952.anInt1542 - Static4.anInt94, local952.anInt1548);
					}
				}
			}
			@Pc(1755) Class1_Sub12 local1755;
			if (local23 < this.anInt84 - 1) {
				local1755 = this.aClass1_Sub12ArrayArrayArray1[local23 + 1][local17][local20];
				if (local1755 != null && local1755.aBoolean72) {
					Static4.aClass2_1.method33(local1755);
				}
			}
			if (local17 < Static4.anInt75) {
				local1755 = local31[local17 + 1][local20];
				if (local1755 != null && local1755.aBoolean72) {
					Static4.aClass2_1.method33(local1755);
				}
			}
			if (local20 < Static4.anInt88) {
				local1755 = local31[local17][local20 + 1];
				if (local1755 != null && local1755.aBoolean72) {
					Static4.aClass2_1.method33(local1755);
				}
			}
			if (local17 > Static4.anInt75) {
				local1755 = local31[local17 - 1][local20];
				if (local1755 != null && local1755.aBoolean72) {
					Static4.aClass2_1.method33(local1755);
				}
			}
			if (local20 > Static4.anInt88) {
				local1755 = local31[local17][local20 - 1];
				if (local1755 != null && local1755.aBoolean72) {
					Static4.aClass2_1.method33(local1755);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ac", name = "d", descriptor = "(IIII)V")
	public void method68(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(8) Class1_Sub12 local8 = this.aClass1_Sub12ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 != null) {
			this.aClass1_Sub12ArrayArrayArray1[arg0][arg1][arg2].anInt1696 = arg3;
		}
	}

	@OriginalMember(owner = "client!ac", name = "b", descriptor = "(II)V")
	public void method70(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class1_Sub12 local8 = this.aClass1_Sub12ArrayArrayArray1[0][arg0][arg1];
		for (@Pc(10) int local10 = 0; local10 < 3; local10++) {
			@Pc(31) Class1_Sub12 local31 = this.aClass1_Sub12ArrayArrayArray1[local10][arg0][arg1] = this.aClass1_Sub12ArrayArrayArray1[local10 + 1][arg0][arg1];
			if (local31 != null) {
				local31.anInt1692--;
				for (@Pc(41) int local41 = 0; local41 < local31.anInt1697; local41++) {
					@Pc(47) Class38 local47 = local31.aClass38Array3[local41];
					if ((local47.anInt1290 >> 29 & 0x3) == 2 && local47.anInt1300 == arg0 && local47.anInt1277 == arg1) {
						local47.anInt1291--;
					}
				}
			}
		}
		if (this.aClass1_Sub12ArrayArrayArray1[0][arg0][arg1] == null) {
			this.aClass1_Sub12ArrayArrayArray1[0][arg0][arg1] = new Class1_Sub12(0, arg0, arg1);
		}
		this.aClass1_Sub12ArrayArrayArray1[0][arg0][arg1].aClass1_Sub12_1 = local8;
		this.aClass1_Sub12ArrayArrayArray1[3][arg0][arg1] = null;
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(Lclient!j;)V")
	private void method71(@OriginalArg(0) Class38 arg0) {
		for (@Pc(2) int local2 = arg0.anInt1300; local2 <= arg0.anInt1284; local2++) {
			for (@Pc(6) int local6 = arg0.anInt1277; local6 <= arg0.anInt1292; local6++) {
				@Pc(17) Class1_Sub12 local17 = this.aClass1_Sub12ArrayArrayArray1[arg0.anInt1291][local2][local6];
				if (local17 != null) {
					@Pc(36) int local36;
					for (@Pc(21) int local21 = 0; local21 < local17.anInt1697; local21++) {
						if (local17.aClass38Array3[local21] == arg0) {
							local17.anInt1697--;
							for (local36 = local21; local36 < local17.anInt1697; local36++) {
								local17.aClass38Array3[local36] = local17.aClass38Array3[local36 + 1];
								local17.anIntArray311[local36] = local17.anIntArray311[local36 + 1];
							}
							local17.aClass38Array3[local17.anInt1697] = null;
							break;
						}
					}
					local17.anInt1698 = 0;
					for (local36 = 0; local36 < local17.anInt1697; local36++) {
						local17.anInt1698 |= local17.anIntArray311[local36];
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ac", name = "c", descriptor = "()V")
	private void method72() {
		@Pc(3) int local3 = Static4.anIntArray13[Static4.anInt87];
		@Pc(7) Class55[] local7 = Static4.aClass55ArrayArray1[Static4.anInt87];
		Static4.anInt91 = 0;
		for (@Pc(11) int local11 = 0; local11 < local3; local11++) {
			@Pc(16) Class55 local16 = local7[local11];
			@Pc(27) int local27;
			@Pc(40) int local40;
			@Pc(51) int local51;
			@Pc(79) int local79;
			@Pc(58) boolean local58;
			if (local16.anInt1591 == 1) {
				local27 = local16.anInt1586 + 25 - Static4.anInt75;
				if (local27 >= 0 && local27 <= 50) {
					local40 = local16.anInt1569 + 25 - Static4.anInt88;
					if (local40 < 0) {
						local40 = 0;
					}
					local51 = local16.anInt1571 + 25 - Static4.anInt88;
					if (local51 > 50) {
						local51 = 50;
					}
					local58 = false;
					while (local40 <= local51) {
						if (Static4.aBooleanArrayArray1[local27][local40++]) {
							local58 = true;
							break;
						}
					}
					if (local58) {
						local79 = Static4.anInt80 - local16.anInt1568;
						if (local79 > 32) {
							local16.anInt1590 = 1;
						} else {
							if (local79 >= -32) {
								continue;
							}
							local16.anInt1590 = 2;
							local79 = -local79;
						}
						local16.anInt1585 = (local16.anInt1581 - Static4.anInt94 << 8) / local79;
						local16.anInt1577 = (local16.anInt1592 - Static4.anInt94 << 8) / local79;
						local16.anInt1572 = (local16.anInt1582 - Static4.anInt86 << 8) / local79;
						local16.anInt1567 = (local16.anInt1573 - Static4.anInt86 << 8) / local79;
						Static4.aClass55Array1[Static4.anInt91++] = local16;
					}
				}
			} else if (local16.anInt1591 == 2) {
				local27 = local16.anInt1569 + 25 - Static4.anInt88;
				if (local27 >= 0 && local27 <= 50) {
					local40 = local16.anInt1586 + 25 - Static4.anInt75;
					if (local40 < 0) {
						local40 = 0;
					}
					local51 = local16.anInt1588 + 25 - Static4.anInt75;
					if (local51 > 50) {
						local51 = 50;
					}
					local58 = false;
					while (local40 <= local51) {
						if (Static4.aBooleanArrayArray1[local40++][local27]) {
							local58 = true;
							break;
						}
					}
					if (local58) {
						local79 = Static4.anInt94 - local16.anInt1581;
						if (local79 > 32) {
							local16.anInt1590 = 3;
						} else {
							if (local79 >= -32) {
								continue;
							}
							local16.anInt1590 = 4;
							local79 = -local79;
						}
						local16.anInt1575 = (local16.anInt1568 - Static4.anInt80 << 8) / local79;
						local16.anInt1570 = (local16.anInt1584 - Static4.anInt80 << 8) / local79;
						local16.anInt1572 = (local16.anInt1582 - Static4.anInt86 << 8) / local79;
						local16.anInt1567 = (local16.anInt1573 - Static4.anInt86 << 8) / local79;
						Static4.aClass55Array1[Static4.anInt91++] = local16;
					}
				}
			} else if (local16.anInt1591 == 4) {
				local27 = local16.anInt1582 - Static4.anInt86;
				if (local27 > 128) {
					local40 = local16.anInt1569 + 25 - Static4.anInt88;
					if (local40 < 0) {
						local40 = 0;
					}
					local51 = local16.anInt1571 + 25 - Static4.anInt88;
					if (local51 > 50) {
						local51 = 50;
					}
					if (local40 <= local51) {
						@Pc(319) int local319 = local16.anInt1586 + 25 - Static4.anInt75;
						if (local319 < 0) {
							local319 = 0;
						}
						local79 = local16.anInt1588 + 25 - Static4.anInt75;
						if (local79 > 50) {
							local79 = 50;
						}
						@Pc(337) boolean local337 = false;
						label142: for (@Pc(339) int local339 = local319; local339 <= local79; local339++) {
							for (@Pc(342) int local342 = local40; local342 <= local51; local342++) {
								if (Static4.aBooleanArrayArray1[local339][local342]) {
									local337 = true;
									break label142;
								}
							}
						}
						if (local337) {
							local16.anInt1590 = 5;
							local16.anInt1575 = (local16.anInt1568 - Static4.anInt80 << 8) / local27;
							local16.anInt1570 = (local16.anInt1584 - Static4.anInt80 << 8) / local27;
							local16.anInt1585 = (local16.anInt1581 - Static4.anInt94 << 8) / local27;
							local16.anInt1577 = (local16.anInt1592 - Static4.anInt94 << 8) / local27;
							Static4.aClass55Array1[Static4.anInt91++] = local16;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ac", name = "j", descriptor = "(III)V")
	public void method73(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class1_Sub12 local8 = this.aClass1_Sub12ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 != null) {
			local8.aClass53_1 = null;
		}
	}

	@OriginalMember(owner = "client!ac", name = "k", descriptor = "(III)V")
	public void method75(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class1_Sub12 local8 = this.aClass1_Sub12ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 == null) {
			return;
		}
		for (@Pc(13) int local13 = 0; local13 < local8.anInt1697; local13++) {
			@Pc(19) Class38 local19 = local8.aClass38Array3[local13];
			if ((local19.anInt1290 >> 29 & 0x3) == 2 && local19.anInt1300 == arg1 && local19.anInt1277 == arg2) {
				this.method71(local19);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(IIIILclient!qb;II)V")
	public void method76(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class1_Sub2_Sub3 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (arg4 == null) {
			return;
		}
		@Pc(6) Class31 local6 = new Class31();
		local6.aClass1_Sub2_Sub3_5 = arg4;
		local6.anInt1194 = arg1 * 128 + 64;
		local6.anInt1201 = arg2 * 128 + 64;
		local6.anInt1200 = arg3;
		local6.anInt1193 = arg5;
		local6.anInt1195 = arg6;
		if (this.aClass1_Sub12ArrayArrayArray1[arg0][arg1][arg2] == null) {
			this.aClass1_Sub12ArrayArrayArray1[arg0][arg1][arg2] = new Class1_Sub12(arg0, arg1, arg2);
		}
		this.aClass1_Sub12ArrayArrayArray1[arg0][arg1][arg2].aClass31_1 = local6;
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(Lclient!ub;IIIII)V")
	private void method77(@OriginalArg(0) Class1_Sub2_Sub3_Sub7 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(1) boolean local1 = true;
		@Pc(3) int local3 = arg2;
		@Pc(7) int local7 = arg2 + arg4;
		@Pc(11) int local11 = arg3 - 1;
		@Pc(15) int local15 = arg3 + arg5;
		for (@Pc(17) int local17 = arg1; local17 <= arg1 + 1; local17++) {
			if (local17 != this.anInt84) {
				for (@Pc(24) int local24 = local3; local24 <= local7; local24++) {
					if (local24 >= 0 && local24 < this.anInt69) {
						for (@Pc(34) int local34 = local11; local34 <= local15; local34++) {
							if (local34 >= 0 && local34 < this.anInt77 && (!local1 || local24 >= local7 || local34 >= local15 || local34 < arg3 && local24 != arg2)) {
								@Pc(66) Class1_Sub12 local66 = this.aClass1_Sub12ArrayArrayArray1[local17][local24][local34];
								if (local66 != null) {
									@Pc(160) int local160 = (this.anIntArrayArrayArray1[local17][local24][local34] + this.anIntArrayArrayArray1[local17][local24 + 1][local34] + this.anIntArrayArrayArray1[local17][local24][local34 + 1] + this.anIntArrayArrayArray1[local17][local24 + 1][local34 + 1]) / 4 - (this.anIntArrayArrayArray1[arg1][arg2][arg3] + this.anIntArrayArrayArray1[arg1][arg2 + 1][arg3] + this.anIntArrayArrayArray1[arg1][arg2][arg3 + 1] + this.anIntArrayArrayArray1[arg1][arg2 + 1][arg3 + 1]) / 4;
									@Pc(163) Class53 local163 = local66.aClass53_1;
									if (local163 != null) {
										@Pc(173) Class1_Sub2_Sub3_Sub7 local173;
										if (local163.aClass1_Sub2_Sub3_8 instanceof Class1_Sub2_Sub3_Sub7) {
											local173 = (Class1_Sub2_Sub3_Sub7) local163.aClass1_Sub2_Sub3_8;
											Static117.method1890(arg0, local173, (local24 - arg2) * 128 + (1 - arg4) * 64, local160, (local34 - arg3) * 128 + (1 - arg5) * 64, local1);
										}
										if (local163.aClass1_Sub2_Sub3_7 instanceof Class1_Sub2_Sub3_Sub7) {
											local173 = (Class1_Sub2_Sub3_Sub7) local163.aClass1_Sub2_Sub3_7;
											Static117.method1890(arg0, local173, (local24 - arg2) * 128 + (1 - arg4) * 64, local160, (local34 - arg3) * 128 + (1 - arg5) * 64, local1);
										}
									}
									for (@Pc(237) int local237 = 0; local237 < local66.anInt1697; local237++) {
										@Pc(243) Class38 local243 = local66.aClass38Array3[local237];
										if (local243 != null && local243.aClass1_Sub2_Sub3_6 instanceof Class1_Sub2_Sub3_Sub7) {
											@Pc(253) Class1_Sub2_Sub3_Sub7 local253 = (Class1_Sub2_Sub3_Sub7) local243.aClass1_Sub2_Sub3_6;
											@Pc(261) int local261 = local243.anInt1284 + 1 - local243.anInt1300;
											@Pc(269) int local269 = local243.anInt1292 + 1 - local243.anInt1277;
											Static117.method1890(arg0, local253, (local243.anInt1300 - arg2) * 128 + (local261 - arg4) * 64, local160, (local243.anInt1277 - arg3) * 128 + (local269 - arg5) * 64, local1);
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

	@OriginalMember(owner = "client!ac", name = "l", descriptor = "(III)Lclient!j;")
	public Class38 method78(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class1_Sub12 local8 = this.aClass1_Sub12ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 == null) {
			return null;
		}
		for (@Pc(14) int local14 = 0; local14 < local8.anInt1697; local14++) {
			@Pc(20) Class38 local20 = local8.aClass38Array3[local14];
			if ((local20.anInt1290 >> 29 & 0x3) == 2 && local20.anInt1300 == arg1 && local20.anInt1277 == arg2) {
				return local20;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(I)V")
	public void method79(@OriginalArg(0) int arg0) {
		this.anInt76 = arg0;
		for (@Pc(4) int local4 = 0; local4 < this.anInt69; local4++) {
			for (@Pc(7) int local7 = 0; local7 < this.anInt77; local7++) {
				if (this.aClass1_Sub12ArrayArrayArray1[arg0][local4][local7] == null) {
					this.aClass1_Sub12ArrayArrayArray1[arg0][local4][local7] = new Class1_Sub12(arg0, local4, local7);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ac", name = "b", descriptor = "(IIIIII)V")
	public void method80(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (arg0 < 0) {
			arg0 = 0;
		} else if (arg0 >= this.anInt69 * 128) {
			arg0 = this.anInt69 * 128 - 1;
		}
		if (arg2 < 0) {
			arg2 = 0;
		} else if (arg2 >= this.anInt77 * 128) {
			arg2 = this.anInt77 * 128 - 1;
		}
		Static4.anInt79++;
		Static4.anInt90 = Class1_Sub2_Sub2_Sub2.anIntArray189[arg3];
		Static4.anInt93 = Class1_Sub2_Sub2_Sub2.anIntArray185[arg3];
		Static4.anInt95 = Class1_Sub2_Sub2_Sub2.anIntArray189[arg4];
		Static4.anInt74 = Class1_Sub2_Sub2_Sub2.anIntArray185[arg4];
		Static4.aBooleanArrayArray1 = Static4.aBooleanArrayArrayArrayArray1[(arg3 - 128) / 32][arg4 / 64];
		Static4.anInt80 = arg0;
		Static4.anInt86 = arg1;
		Static4.anInt94 = arg2;
		Static4.anInt75 = arg0 / 128;
		Static4.anInt88 = arg2 / 128;
		Static4.anInt87 = arg5;
		Static4.anInt92 = Static4.anInt75 - 25;
		if (Static4.anInt92 < 0) {
			Static4.anInt92 = 0;
		}
		Static4.anInt81 = Static4.anInt88 - 25;
		if (Static4.anInt81 < 0) {
			Static4.anInt81 = 0;
		}
		Static4.anInt73 = Static4.anInt75 + 25;
		if (Static4.anInt73 > this.anInt69) {
			Static4.anInt73 = this.anInt69;
		}
		Static4.anInt89 = Static4.anInt88 + 25;
		if (Static4.anInt89 > this.anInt77) {
			Static4.anInt89 = this.anInt77;
		}
		this.method72();
		Static4.anInt78 = 0;
		@Pc(136) int local136;
		@Pc(139) int local139;
		for (@Pc(128) int local128 = this.anInt76; local128 < this.anInt84; local128++) {
			@Pc(134) Class1_Sub12[][] local134 = this.aClass1_Sub12ArrayArrayArray1[local128];
			for (local136 = Static4.anInt92; local136 < Static4.anInt73; local136++) {
				for (local139 = Static4.anInt81; local139 < Static4.anInt89; local139++) {
					@Pc(146) Class1_Sub12 local146 = local134[local136][local139];
					if (local146 != null) {
						if (local146.anInt1696 <= arg5 && (Static4.aBooleanArrayArray1[local136 + 25 - Static4.anInt75][local139 + 25 - Static4.anInt88] || this.anIntArrayArrayArray1[local128][local136][local139] - arg1 >= 2000)) {
							local146.aBoolean71 = true;
							local146.aBoolean72 = true;
							if (local146.anInt1697 > 0) {
								local146.aBoolean70 = true;
							} else {
								local146.aBoolean70 = false;
							}
							Static4.anInt78++;
						} else {
							local146.aBoolean71 = false;
							local146.aBoolean72 = false;
							local146.anInt1695 = 0;
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
		for (@Pc(224) int local224 = this.anInt76; local224 < this.anInt84; local224++) {
			@Pc(230) Class1_Sub12[][] local230 = this.aClass1_Sub12ArrayArrayArray1[local224];
			for (local139 = -25; local139 <= 0; local139++) {
				local237 = Static4.anInt75 + local139;
				local241 = Static4.anInt75 - local139;
				if (local237 >= Static4.anInt92 || local241 < Static4.anInt73) {
					for (local249 = -25; local249 <= 0; local249++) {
						local254 = Static4.anInt88 + local249;
						local258 = Static4.anInt88 - local249;
						@Pc(270) Class1_Sub12 local270;
						if (local237 >= Static4.anInt92) {
							if (local254 >= Static4.anInt81) {
								local270 = local230[local237][local254];
								if (local270 != null && local270.aBoolean71) {
									this.method67(local270, true);
								}
							}
							if (local258 < Static4.anInt89) {
								local270 = local230[local237][local258];
								if (local270 != null && local270.aBoolean71) {
									this.method67(local270, true);
								}
							}
						}
						if (local241 < Static4.anInt73) {
							if (local254 >= Static4.anInt81) {
								local270 = local230[local241][local254];
								if (local270 != null && local270.aBoolean71) {
									this.method67(local270, true);
								}
							}
							if (local258 < Static4.anInt89) {
								local270 = local230[local241][local258];
								if (local270 != null && local270.aBoolean71) {
									this.method67(local270, true);
								}
							}
						}
						if (Static4.anInt78 == 0) {
							Static4.aBoolean2 = false;
							return;
						}
					}
				}
			}
		}
		for (local136 = this.anInt76; local136 < this.anInt84; local136++) {
			@Pc(361) Class1_Sub12[][] local361 = this.aClass1_Sub12ArrayArrayArray1[local136];
			for (local237 = -25; local237 <= 0; local237++) {
				local241 = Static4.anInt75 + local237;
				local249 = Static4.anInt75 - local237;
				if (local241 >= Static4.anInt92 || local249 < Static4.anInt73) {
					for (local254 = -25; local254 <= 0; local254++) {
						local258 = Static4.anInt88 + local254;
						@Pc(389) int local389 = Static4.anInt88 - local254;
						@Pc(401) Class1_Sub12 local401;
						if (local241 >= Static4.anInt92) {
							if (local258 >= Static4.anInt81) {
								local401 = local361[local241][local258];
								if (local401 != null && local401.aBoolean71) {
									this.method67(local401, false);
								}
							}
							if (local389 < Static4.anInt89) {
								local401 = local361[local241][local389];
								if (local401 != null && local401.aBoolean71) {
									this.method67(local401, false);
								}
							}
						}
						if (local249 < Static4.anInt73) {
							if (local258 >= Static4.anInt81) {
								local401 = local361[local249][local258];
								if (local401 != null && local401.aBoolean71) {
									this.method67(local401, false);
								}
							}
							if (local389 < Static4.anInt89) {
								local401 = local361[local249][local389];
								if (local401 != null && local401.aBoolean71) {
									this.method67(local401, false);
								}
							}
						}
						if (Static4.anInt78 == 0) {
							Static4.aBoolean2 = false;
							return;
						}
					}
				}
			}
		}
		Static4.aBoolean2 = false;
	}

	@OriginalMember(owner = "client!ac", name = "m", descriptor = "(III)V")
	public void method81(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class1_Sub12 local8 = this.aClass1_Sub12ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 != null) {
			local8.aClass10_1 = null;
		}
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(IIIILclient!qb;Lclient!qb;IIII)V")
	public void method82(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class1_Sub2_Sub3 arg4, @OriginalArg(5) Class1_Sub2_Sub3 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		if (arg4 == null && arg5 == null) {
			return;
		}
		@Pc(8) Class53 local8 = new Class53();
		local8.anInt1548 = arg8;
		local8.anInt1540 = arg9;
		local8.anInt1538 = arg1 * 128 + 64;
		local8.anInt1542 = arg2 * 128 + 64;
		local8.anInt1545 = arg3;
		local8.aClass1_Sub2_Sub3_8 = arg4;
		local8.aClass1_Sub2_Sub3_7 = arg5;
		local8.anInt1539 = arg6;
		local8.anInt1544 = arg7;
		for (@Pc(45) int local45 = arg0; local45 >= 0; local45--) {
			if (this.aClass1_Sub12ArrayArrayArray1[local45][arg1][arg2] == null) {
				this.aClass1_Sub12ArrayArrayArray1[local45][arg1][arg2] = new Class1_Sub12(local45, arg1, arg2);
			}
		}
		this.aClass1_Sub12ArrayArrayArray1[arg0][arg1][arg2].aClass53_1 = local8;
	}

	@OriginalMember(owner = "client!ac", name = "d", descriptor = "()V")
	public void method83() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt72; local1++) {
			@Pc(7) Class38 local7 = this.aClass38Array1[local1];
			this.method71(local7);
			this.aClass38Array1[local1] = null;
		}
		this.anInt72 = 0;
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "([IIIIII)V")
	public void method84(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(8) Class1_Sub12 local8 = this.aClass1_Sub12ArrayArrayArray1[arg2][arg3][arg4];
		if (local8 == null) {
			return;
		}
		@Pc(14) Class69 local14 = local8.aClass69_1;
		@Pc(24) int local24;
		if (local14 != null) {
			@Pc(19) int local19 = local14.anInt2376;
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
		@Pc(59) Class14 local59 = local8.aClass14_1;
		if (local59 == null) {
			return;
		}
		local24 = local59.anInt451;
		@Pc(68) int local68 = local59.anInt448;
		@Pc(71) int local71 = local59.anInt449;
		@Pc(74) int local74 = local59.anInt450;
		@Pc(79) int[] local79 = this.anIntArrayArray1[local24];
		@Pc(84) int[] local84 = this.anIntArrayArray2[local68];
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

	@OriginalMember(owner = "client!ac", name = "e", descriptor = "(IIII)Z")
	private boolean method85(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.method94(arg0, arg1, arg2)) {
			@Pc(11) int local11 = arg1 << 7;
			@Pc(15) int local15 = arg2 << 7;
			return this.method49(local11 + 1, this.anIntArrayArrayArray1[arg0][arg1][arg2] - arg3, local15 + 1) && this.method49(local11 + 128 - 1, this.anIntArrayArrayArray1[arg0][arg1 + 1][arg2] - arg3, local15 + 1) && this.method49(local11 + 128 - 1, this.anIntArrayArrayArray1[arg0][arg1 + 1][arg2 + 1] - arg3, local15 + 128 - 1) && this.method49(local11 + 1, this.anIntArrayArrayArray1[arg0][arg1][arg2 + 1] - arg3, local15 + 128 - 1);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(IIIIIILclient!qb;III)Z")
	public boolean method86(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class1_Sub2_Sub3 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		if (arg6 == null) {
			return true;
		} else {
			@Pc(11) int local11 = arg1 * 128 + arg4 * 64;
			@Pc(19) int local19 = arg2 * 128 + arg5 * 64;
			return this.method87(arg0, arg1, arg2, arg4, arg5, local11, local19, arg3, arg6, arg7, false, arg8, arg9);
		}
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(IIIIIIIILclient!qb;IZII)Z")
	private boolean method87(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) Class1_Sub2_Sub3 arg8, @OriginalArg(9) int arg9, @OriginalArg(10) boolean arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12) {
		for (@Pc(1) int local1 = arg1; local1 < arg1 + arg3; local1++) {
			for (@Pc(4) int local4 = arg2; local4 < arg2 + arg4; local4++) {
				if (local1 < 0 || local4 < 0 || local1 >= this.anInt69 || local4 >= this.anInt77) {
					return false;
				}
				@Pc(28) Class1_Sub12 local28 = this.aClass1_Sub12ArrayArrayArray1[arg0][local1][local4];
				if (local28 != null && local28.anInt1697 >= 5) {
					return false;
				}
			}
		}
		@Pc(52) Class38 local52 = new Class38();
		local52.anInt1290 = arg11;
		local52.anInt1297 = arg12;
		local52.anInt1291 = arg0;
		local52.anInt1301 = arg5;
		local52.anInt1289 = arg6;
		local52.anInt1299 = arg7;
		local52.aClass1_Sub2_Sub3_6 = arg8;
		local52.anInt1278 = arg9;
		local52.anInt1300 = arg1;
		local52.anInt1277 = arg2;
		local52.anInt1284 = arg1 + arg3 - 1;
		local52.anInt1292 = arg2 + arg4 - 1;
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
					if (this.aClass1_Sub12ArrayArrayArray1[local130][local98][local101] == null) {
						this.aClass1_Sub12ArrayArrayArray1[local130][local98][local101] = new Class1_Sub12(local130, local98, local101);
					}
				}
				@Pc(166) Class1_Sub12 local166 = this.aClass1_Sub12ArrayArrayArray1[arg0][local98][local101];
				local166.aClass38Array3[local166.anInt1697] = local52;
				local166.anIntArray311[local166.anInt1697] = local104;
				local166.anInt1698 |= local104;
				local166.anInt1697++;
			}
		}
		if (arg10) {
			this.aClass38Array1[this.anInt72++] = local52;
		}
		return true;
	}

	@OriginalMember(owner = "client!ac", name = "n", descriptor = "(III)V")
	public void method88(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class1_Sub12 local8 = this.aClass1_Sub12ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 != null) {
			local8.aClass5_1 = null;
		}
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(Lclient!ub;III)V")
	private void method89(@OriginalArg(0) Class1_Sub2_Sub3_Sub7 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(14) Class1_Sub12 local14;
		@Pc(29) Class1_Sub2_Sub3_Sub7 local29;
		if (arg2 < this.anInt69) {
			local14 = this.aClass1_Sub12ArrayArrayArray1[arg1][arg2 + 1][arg3];
			if (local14 != null && local14.aClass31_1 != null && local14.aClass31_1.aClass1_Sub2_Sub3_5 instanceof Class1_Sub2_Sub3_Sub7) {
				local29 = (Class1_Sub2_Sub3_Sub7) local14.aClass31_1.aClass1_Sub2_Sub3_5;
				Static117.method1890(arg0, local29, 128, 0, 0, true);
			}
		}
		if (arg3 < this.anInt69) {
			local14 = this.aClass1_Sub12ArrayArrayArray1[arg1][arg2][arg3 + 1];
			if (local14 != null && local14.aClass31_1 != null && local14.aClass31_1.aClass1_Sub2_Sub3_5 instanceof Class1_Sub2_Sub3_Sub7) {
				local29 = (Class1_Sub2_Sub3_Sub7) local14.aClass31_1.aClass1_Sub2_Sub3_5;
				Static117.method1890(arg0, local29, 0, 0, 128, true);
			}
		}
		if (arg2 < this.anInt69 && arg3 < this.anInt77) {
			local14 = this.aClass1_Sub12ArrayArrayArray1[arg1][arg2 + 1][arg3 + 1];
			if (local14 != null && local14.aClass31_1 != null && local14.aClass31_1.aClass1_Sub2_Sub3_5 instanceof Class1_Sub2_Sub3_Sub7) {
				local29 = (Class1_Sub2_Sub3_Sub7) local14.aClass31_1.aClass1_Sub2_Sub3_5;
				Static117.method1890(arg0, local29, 128, 0, 128, true);
			}
		}
		if (arg2 >= this.anInt69 || arg3 <= 0) {
			return;
		}
		local14 = this.aClass1_Sub12ArrayArrayArray1[arg1][arg2 + 1][arg3 - 1];
		if (local14 != null && local14.aClass31_1 != null && local14.aClass31_1.aClass1_Sub2_Sub3_5 instanceof Class1_Sub2_Sub3_Sub7) {
			local29 = (Class1_Sub2_Sub3_Sub7) local14.aClass31_1.aClass1_Sub2_Sub3_5;
			Static117.method1890(arg0, local29, 128, 0, -128, true);
		}
	}

	@OriginalMember(owner = "client!ac", name = "o", descriptor = "(III)I")
	public int method90(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class1_Sub12 local8 = this.aClass1_Sub12ArrayArrayArray1[arg0][arg1][arg2];
		return local8 == null || local8.aClass31_1 == null ? 0 : local8.aClass31_1.anInt1193;
	}

	@OriginalMember(owner = "client!ac", name = "p", descriptor = "(III)Lclient!bd;")
	public Class10 method91(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class1_Sub12 local8 = this.aClass1_Sub12ArrayArrayArray1[arg0][arg1][arg2];
		return local8 == null ? null : local8.aClass10_1;
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(IIIIIIIIIIIIIIIIIIII)V")
	public void method92(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int arg15, @OriginalArg(16) int arg16, @OriginalArg(17) int arg17, @OriginalArg(18) int arg18, @OriginalArg(19) int arg19) {
		@Pc(12) Class69 local12;
		@Pc(14) int local14;
		if (arg3 == 0) {
			local12 = new Class69(arg10, arg11, arg12, arg13, -1, arg18, false);
			for (local14 = arg0; local14 >= 0; local14--) {
				if (this.aClass1_Sub12ArrayArrayArray1[local14][arg1][arg2] == null) {
					this.aClass1_Sub12ArrayArrayArray1[local14][arg1][arg2] = new Class1_Sub12(local14, arg1, arg2);
				}
			}
			this.aClass1_Sub12ArrayArrayArray1[arg0][arg1][arg2].aClass69_1 = local12;
		} else if (arg3 == 1) {
			local12 = new Class69(arg14, arg15, arg16, arg17, arg5, arg19, arg6 == arg7 && arg6 == arg8 && arg6 == arg9);
			for (local14 = arg0; local14 >= 0; local14--) {
				if (this.aClass1_Sub12ArrayArrayArray1[local14][arg1][arg2] == null) {
					this.aClass1_Sub12ArrayArrayArray1[local14][arg1][arg2] = new Class1_Sub12(local14, arg1, arg2);
				}
			}
			this.aClass1_Sub12ArrayArrayArray1[arg0][arg1][arg2].aClass69_1 = local12;
		} else {
			@Pc(140) Class14 local140 = new Class14(arg3, arg4, arg5, arg1, arg2, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17, arg18, arg19);
			for (local14 = arg0; local14 >= 0; local14--) {
				if (this.aClass1_Sub12ArrayArrayArray1[local14][arg1][arg2] == null) {
					this.aClass1_Sub12ArrayArrayArray1[local14][arg1][arg2] = new Class1_Sub12(local14, arg1, arg2);
				}
			}
			this.aClass1_Sub12ArrayArrayArray1[arg0][arg1][arg2].aClass14_1 = local140;
		}
	}

	@OriginalMember(owner = "client!ac", name = "q", descriptor = "(III)Lclient!he;")
	public Class31 method93(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class1_Sub12 local8 = this.aClass1_Sub12ArrayArrayArray1[arg0][arg1][arg2];
		return local8 == null || local8.aClass31_1 == null ? null : local8.aClass31_1;
	}

	@OriginalMember(owner = "client!ac", name = "r", descriptor = "(III)Z")
	private boolean method94(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) int local8 = this.anIntArrayArrayArray2[arg0][arg1][arg2];
		if (local8 == -Static4.anInt79) {
			return false;
		} else if (local8 == Static4.anInt79) {
			return true;
		} else {
			@Pc(23) int local23 = arg1 << 7;
			@Pc(27) int local27 = arg2 << 7;
			if (this.method49(local23 + 1, this.anIntArrayArrayArray1[arg0][arg1][arg2], local27 + 1) && this.method49(local23 + 128 - 1, this.anIntArrayArrayArray1[arg0][arg1 + 1][arg2], local27 + 1) && this.method49(local23 + 128 - 1, this.anIntArrayArrayArray1[arg0][arg1 + 1][arg2 + 1], local27 + 128 - 1) && this.method49(local23 + 1, this.anIntArrayArrayArray1[arg0][arg1][arg2 + 1], local27 + 128 - 1)) {
				this.anIntArrayArrayArray2[arg0][arg1][arg2] = Static4.anInt79;
				return true;
			} else {
				this.anIntArrayArrayArray2[arg0][arg1][arg2] = -Static4.anInt79;
				return false;
			}
		}
	}
}
