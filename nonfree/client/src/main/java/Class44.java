import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!l")
public final class Class44 {

	@OriginalMember(owner = "client!l", name = "A", descriptor = "I")
	private int anInt1792 = 0;

	@OriginalMember(owner = "client!l", name = "G", descriptor = "I")
	private int anInt1796 = 0;

	@OriginalMember(owner = "client!l", name = "D", descriptor = "[Lclient!fe;")
	private final Class26[] aClass26Array3 = new Class26[5000];

	@OriginalMember(owner = "client!l", name = "R", descriptor = "[[I")
	private final int[][] anIntArrayArray16 = new int[][] { new int[16], { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 1 }, { 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0 }, { 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1 }, { 1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 1 } };

	@OriginalMember(owner = "client!l", name = "bb", descriptor = "[[I")
	private final int[][] anIntArrayArray17 = new int[][] { { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 }, { 12, 8, 4, 0, 13, 9, 5, 1, 14, 10, 6, 2, 15, 11, 7, 3 }, { 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 }, { 3, 7, 11, 15, 2, 6, 10, 14, 1, 5, 9, 13, 0, 4, 8, 12 } };

	@OriginalMember(owner = "client!l", name = "w", descriptor = "I")
	private final int anInt1788;

	@OriginalMember(owner = "client!l", name = "f", descriptor = "I")
	private final int anInt1777;

	@OriginalMember(owner = "client!l", name = "x", descriptor = "I")
	private final int anInt1789;

	@OriginalMember(owner = "client!l", name = "t", descriptor = "[[[Lclient!d;")
	private final Class1_Sub6[][][] aClass1_Sub6ArrayArrayArray1;

	@OriginalMember(owner = "client!l", name = "O", descriptor = "[[[I")
	private final int[][][] anIntArrayArrayArray3;

	@OriginalMember(owner = "client!l", name = "u", descriptor = "[[[I")
	private final int[][][] anIntArrayArrayArray2;

	@OriginalMember(owner = "client!l", name = "<init>", descriptor = "(III[[[I)V")
	public Class44(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[][][] arg3) {
		this.anInt1788 = arg0;
		this.anInt1777 = arg1;
		this.anInt1789 = arg2;
		this.aClass1_Sub6ArrayArrayArray1 = new Class1_Sub6[arg0][arg1][arg2];
		this.anIntArrayArrayArray3 = new int[arg0][arg1 + 1][arg2 + 1];
		this.anIntArrayArrayArray2 = arg3;
		this.method1171();
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(Lclient!fe;)V")
	private void method1133(@OriginalArg(0) Class26 arg0) {
		for (@Pc(2) int local2 = arg0.anInt1096; local2 <= arg0.anInt1092; local2++) {
			for (@Pc(6) int local6 = arg0.anInt1088; local6 <= arg0.anInt1091; local6++) {
				@Pc(17) Class1_Sub6 local17 = this.aClass1_Sub6ArrayArrayArray1[arg0.anInt1104][local2][local6];
				if (local17 != null) {
					@Pc(36) int local36;
					for (@Pc(21) int local21 = 0; local21 < local17.anInt759; local21++) {
						if (local17.aClass26Array1[local21] == arg0) {
							local17.anInt759--;
							for (local36 = local21; local36 < local17.anInt759; local36++) {
								local17.aClass26Array1[local36] = local17.aClass26Array1[local36 + 1];
								local17.anIntArray77[local36] = local17.anIntArray77[local36 + 1];
							}
							local17.aClass26Array1[local17.anInt759] = null;
							break;
						}
					}
					local17.anInt767 = 0;
					for (local36 = 0; local36 < local17.anInt759; local36++) {
						local17.anInt767 |= local17.anIntArray77[local36];
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(III)V")
	public void method1134() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt1788; local1++) {
			for (@Pc(4) int local4 = 0; local4 < this.anInt1777; local4++) {
				for (@Pc(7) int local7 = 0; local7 < this.anInt1789; local7++) {
					@Pc(17) Class1_Sub6 local17 = this.aClass1_Sub6ArrayArrayArray1[local1][local4][local7];
					if (local17 != null) {
						@Pc(22) Class50 local22 = local17.aClass50_1;
						if (local22 != null && local22.aClass1_Sub1_Sub1_3 instanceof Class1_Sub1_Sub1_Sub4) {
							@Pc(32) Class1_Sub1_Sub1_Sub4 local32 = (Class1_Sub1_Sub1_Sub4) local22.aClass1_Sub1_Sub1_3;
							this.method1167(local32, local1, local4, local7, 1, 1);
							if (local22.aClass1_Sub1_Sub1_4 instanceof Class1_Sub1_Sub1_Sub4) {
								@Pc(48) Class1_Sub1_Sub1_Sub4 local48 = (Class1_Sub1_Sub1_Sub4) local22.aClass1_Sub1_Sub1_4;
								this.method1167(local48, local1, local4, local7, 1, 1);
								Static83.method1409(local32, local48, 0, 0, 0, false);
								local22.aClass1_Sub1_Sub1_4 = local48.method1410(local48.aShort1, local48.aShort2, -50, -10, -50);
							}
							local22.aClass1_Sub1_Sub1_3 = local32.method1410(local32.aShort1, local32.aShort2, -50, -10, -50);
						}
						@Pc(103) Class1_Sub1_Sub1_Sub4 local103;
						for (@Pc(87) int local87 = 0; local87 < local17.anInt759; local87++) {
							@Pc(93) Class26 local93 = local17.aClass26Array1[local87];
							if (local93 != null && local93.aClass1_Sub1_Sub1_1 instanceof Class1_Sub1_Sub1_Sub4) {
								local103 = (Class1_Sub1_Sub1_Sub4) local93.aClass1_Sub1_Sub1_1;
								this.method1167(local103, local1, local4, local7, local93.anInt1092 + 1 - local93.anInt1096, local93.anInt1091 - local93.anInt1088 + 1);
								local93.aClass1_Sub1_Sub1_1 = local103.method1410(local103.aShort1, local103.aShort2, -50, -10, -50);
							}
						}
						@Pc(142) Class56 local142 = local17.aClass56_1;
						if (local142 != null && local142.aClass1_Sub1_Sub1_5 instanceof Class1_Sub1_Sub1_Sub4) {
							local103 = (Class1_Sub1_Sub1_Sub4) local142.aClass1_Sub1_Sub1_5;
							this.method1178(local103, local1, local4, local7);
							local142.aClass1_Sub1_Sub1_5 = local103.method1410(local103.aShort1, local103.aShort2, -50, -10, -50);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!l", name = "b", descriptor = "(III)V")
	public void method1135(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class1_Sub6 local8 = this.aClass1_Sub6ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 != null) {
			local8.aClass29_1 = null;
		}
	}

	@OriginalMember(owner = "client!l", name = "c", descriptor = "(III)V")
	public void method1136(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class1_Sub6 local8 = this.aClass1_Sub6ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 != null) {
			local8.aClass50_1 = null;
		}
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(Lclient!ne;IIIIII)V")
	private void method1137(@OriginalArg(0) Class54 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(3) int local3 = arg0.anIntArray263.length;
		@Pc(13) int local13;
		@Pc(20) int local20;
		@Pc(27) int local27;
		@Pc(37) int local37;
		for (@Pc(5) int local5 = 0; local5 < local3; local5++) {
			local13 = arg0.anIntArray263[local5] - Static68.anInt1783;
			local20 = arg0.anIntArray270[local5] - Static68.anInt1798;
			local27 = arg0.anIntArray276[local5] - Static68.anInt1785;
			local37 = local27 * arg3 + local13 * arg4 >> 16;
			@Pc(47) int local47 = local27 * arg4 - local13 * arg3 >> 16;
			@Pc(59) int local59 = local20 * arg2 - local47 * arg1 >> 16;
			@Pc(69) int local69 = local20 * arg1 + local47 * arg2 >> 16;
			if (local69 < 50) {
				return;
			}
			if (arg0.anIntArray265 != null) {
				Static82.anIntArray269[local5] = local37;
				Static82.anIntArray268[local5] = local59;
				Static82.anIntArray266[local5] = local69;
			}
			Static82.anIntArray274[local5] = Static108.anInt2647 + (local37 << 9) / local69;
			Static82.anIntArray272[local5] = Static108.anInt2643 + (local59 << 9) / local69;
		}
		Static108.anInt2644 = 0;
		local3 = arg0.anIntArray275.length;
		for (local13 = 0; local13 < local3; local13++) {
			local20 = arg0.anIntArray275[local13];
			local27 = arg0.anIntArray264[local13];
			local37 = arg0.anIntArray267[local13];
			@Pc(142) int local142 = Static82.anIntArray274[local20];
			@Pc(146) int local146 = Static82.anIntArray274[local27];
			@Pc(150) int local150 = Static82.anIntArray274[local37];
			@Pc(154) int local154 = Static82.anIntArray272[local20];
			@Pc(158) int local158 = Static82.anIntArray272[local27];
			@Pc(162) int local162 = Static82.anIntArray272[local37];
			if ((local142 - local146) * (local162 - local158) - (local154 - local158) * (local150 - local146) > 0) {
				Static108.aBoolean146 = false;
				if (local142 < 0 || local146 < 0 || local150 < 0 || local142 > Static108.anInt2649 || local146 > Static108.anInt2649 || local150 > Static108.anInt2649) {
					Static108.aBoolean146 = true;
				}
				if (Static68.aBoolean97 && this.method1168(Static68.anInt1791, Static68.anInt1790, local154, local158, local162, local142, local146, local150)) {
					Static68.anInt1776 = arg5;
					Static68.anInt1778 = arg6;
				}
				if (arg0.anIntArray265 == null || arg0.anIntArray265[local13] == -1) {
					if (arg0.anIntArray271[local13] != 12345678) {
						Static108.method1774(local154, local158, local162, local142, local146, local150, arg0.anIntArray271[local13], arg0.anIntArray273[local13], arg0.anIntArray277[local13]);
					}
				} else if (Static68.aBoolean96) {
					@Pc(364) int local364 = Static108.anInterface2_1.method1869(arg0.anIntArray265[local13]);
					Static108.method1774(local154, local158, local162, local142, local146, local150, Static68.method1166(local364, arg0.anIntArray271[local13]), Static68.method1166(local364, arg0.anIntArray273[local13]), Static68.method1166(local364, arg0.anIntArray277[local13]));
				} else if (arg0.aBoolean115) {
					Static108.method1782(local154, local158, local162, local142, local146, local150, arg0.anIntArray271[local13], arg0.anIntArray273[local13], arg0.anIntArray277[local13], Static82.anIntArray269[0], Static82.anIntArray269[1], Static82.anIntArray269[3], Static82.anIntArray268[0], Static82.anIntArray268[1], Static82.anIntArray268[3], Static82.anIntArray266[0], Static82.anIntArray266[1], Static82.anIntArray266[3], arg0.anIntArray265[local13]);
				} else {
					Static108.method1782(local154, local158, local162, local142, local146, local150, arg0.anIntArray271[local13], arg0.anIntArray273[local13], arg0.anIntArray277[local13], Static82.anIntArray269[local20], Static82.anIntArray269[local27], Static82.anIntArray269[local37], Static82.anIntArray268[local20], Static82.anIntArray268[local27], Static82.anIntArray268[local37], Static82.anIntArray266[local20], Static82.anIntArray266[local27], Static82.anIntArray266[local37], arg0.anIntArray265[local13]);
				}
			}
		}
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(IIII)I")
	public int method1138(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(8) Class1_Sub6 local8 = this.aClass1_Sub6ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 == null) {
			return -1;
		} else if (local8.aClass50_1 != null && local8.aClass50_1.anInt2078 == arg3) {
			return local8.aClass50_1.anInt2075 & 0xFF;
		} else if (local8.aClass29_1 != null && local8.aClass29_1.anInt1464 == arg3) {
			return local8.aClass29_1.anInt1463 & 0xFF;
		} else if (local8.aClass56_1 != null && local8.aClass56_1.anInt2279 == arg3) {
			return local8.aClass56_1.anInt2277 & 0xFF;
		} else {
			for (@Pc(56) int local56 = 0; local56 < local8.anInt759; local56++) {
				if (local8.aClass26Array1[local56].anInt1087 == arg3) {
					return local8.aClass26Array1[local56].anInt1101 & 0xFF;
				}
			}
			return -1;
		}
	}

	@OriginalMember(owner = "client!l", name = "d", descriptor = "(III)V")
	public void method1139(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class1_Sub6 local8 = this.aClass1_Sub6ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 != null) {
			local8.aClass56_1 = null;
		}
	}

	@OriginalMember(owner = "client!l", name = "b", descriptor = "(IIII)Z")
	private boolean method1141(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.method1147(arg0, arg1, arg2)) {
			@Pc(11) int local11 = arg1 << 7;
			@Pc(15) int local15 = arg2 << 7;
			return this.method1161(local11 + 1, this.anIntArrayArrayArray2[arg0][arg1][arg2] - arg3, local15 + 1) && this.method1161(local11 + 128 - 1, this.anIntArrayArrayArray2[arg0][arg1 + 1][arg2] - arg3, local15 + 1) && this.method1161(local11 + 128 - 1, this.anIntArrayArrayArray2[arg0][arg1 + 1][arg2 + 1] - arg3, local15 + 128 - 1) && this.method1161(local11 + 1, this.anIntArrayArrayArray2[arg0][arg1][arg2 + 1] - arg3, local15 + 128 - 1);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(IIIIIIIILclient!ha;IZII)Z")
	private boolean method1142(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) Class1_Sub1_Sub1 arg8, @OriginalArg(9) int arg9, @OriginalArg(10) boolean arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12) {
		for (@Pc(1) int local1 = arg1; local1 < arg1 + arg3; local1++) {
			for (@Pc(4) int local4 = arg2; local4 < arg2 + arg4; local4++) {
				if (local1 < 0 || local4 < 0 || local1 >= this.anInt1777 || local4 >= this.anInt1789) {
					return false;
				}
				@Pc(28) Class1_Sub6 local28 = this.aClass1_Sub6ArrayArrayArray1[arg0][local1][local4];
				if (local28 != null && local28.anInt759 >= 5) {
					return false;
				}
			}
		}
		@Pc(52) Class26 local52 = new Class26();
		local52.anInt1087 = arg11;
		local52.anInt1101 = arg12;
		local52.anInt1104 = arg0;
		local52.anInt1095 = arg5;
		local52.anInt1099 = arg6;
		local52.anInt1090 = arg7;
		local52.aClass1_Sub1_Sub1_1 = arg8;
		local52.anInt1089 = arg9;
		local52.anInt1096 = arg1;
		local52.anInt1088 = arg2;
		local52.anInt1092 = arg1 + arg3 - 1;
		local52.anInt1091 = arg2 + arg4 - 1;
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
					if (this.aClass1_Sub6ArrayArrayArray1[local130][local98][local101] == null) {
						this.aClass1_Sub6ArrayArrayArray1[local130][local98][local101] = new Class1_Sub6(local130, local98, local101);
					}
				}
				@Pc(166) Class1_Sub6 local166 = this.aClass1_Sub6ArrayArrayArray1[arg0][local98][local101];
				local166.aClass26Array1[local166.anInt759] = local52;
				local166.anIntArray77[local166.anInt759] = local104;
				local166.anInt767 |= local104;
				local166.anInt759++;
			}
		}
		if (arg10) {
			this.aClass26Array3[this.anInt1796++] = local52;
		}
		return true;
	}

	@OriginalMember(owner = "client!l", name = "e", descriptor = "(III)I")
	public int method1143(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class1_Sub6 local8 = this.aClass1_Sub6ArrayArrayArray1[arg0][arg1][arg2];
		return local8 == null || local8.aClass29_1 == null ? 0 : local8.aClass29_1.anInt1464;
	}

	@OriginalMember(owner = "client!l", name = "c", descriptor = "(IIII)Z")
	private boolean method1144(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!this.method1147(arg0, arg1, arg2)) {
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
				if (local11 > Static68.anInt1783) {
					if (!this.method1161(local11, local26, local15)) {
						return false;
					}
					if (!this.method1161(local11, local26, local15 + 128)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!this.method1161(local11, local30, local15)) {
						return false;
					}
					if (!this.method1161(local11, local30, local15 + 128)) {
						return false;
					}
				}
				if (!this.method1161(local11, local34, local15)) {
					return false;
				}
				if (!this.method1161(local11, local34, local15 + 128)) {
					return false;
				}
				return true;
			}
			if (arg3 == 2) {
				if (local15 < Static68.anInt1785) {
					if (!this.method1161(local11, local26, local15 + 128)) {
						return false;
					}
					if (!this.method1161(local11 + 128, local26, local15 + 128)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!this.method1161(local11, local30, local15 + 128)) {
						return false;
					}
					if (!this.method1161(local11 + 128, local30, local15 + 128)) {
						return false;
					}
				}
				if (!this.method1161(local11, local34, local15 + 128)) {
					return false;
				}
				if (!this.method1161(local11 + 128, local34, local15 + 128)) {
					return false;
				}
				return true;
			}
			if (arg3 == 4) {
				if (local11 < Static68.anInt1783) {
					if (!this.method1161(local11 + 128, local26, local15)) {
						return false;
					}
					if (!this.method1161(local11 + 128, local26, local15 + 128)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!this.method1161(local11 + 128, local30, local15)) {
						return false;
					}
					if (!this.method1161(local11 + 128, local30, local15 + 128)) {
						return false;
					}
				}
				if (!this.method1161(local11 + 128, local34, local15)) {
					return false;
				}
				if (!this.method1161(local11 + 128, local34, local15 + 128)) {
					return false;
				}
				return true;
			}
			if (arg3 == 8) {
				if (local15 > Static68.anInt1785) {
					if (!this.method1161(local11, local26, local15)) {
						return false;
					}
					if (!this.method1161(local11 + 128, local26, local15)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!this.method1161(local11, local30, local15)) {
						return false;
					}
					if (!this.method1161(local11 + 128, local30, local15)) {
						return false;
					}
				}
				if (!this.method1161(local11, local34, local15)) {
					return false;
				}
				if (!this.method1161(local11 + 128, local34, local15)) {
					return false;
				}
				return true;
			}
		}
		if (!this.method1161(local11 + 64, local38, local15 + 64)) {
			return false;
		} else if (arg3 == 16) {
			return this.method1161(local11, local34, local15 + 128);
		} else if (arg3 == 32) {
			return this.method1161(local11 + 128, local34, local15 + 128);
		} else if (arg3 == 64) {
			return this.method1161(local11 + 128, local34, local15);
		} else if (arg3 == 128) {
			return this.method1161(local11, local34, local15);
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!l", name = "f", descriptor = "(III)I")
	public int method1145(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class1_Sub6 local8 = this.aClass1_Sub6ArrayArrayArray1[arg0][arg1][arg2];
		return local8 == null || local8.aClass50_1 == null ? 0 : local8.aClass50_1.anInt2078;
	}

	@OriginalMember(owner = "client!l", name = "g", descriptor = "(III)Lclient!mf;")
	public Class50 method1146(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class1_Sub6 local8 = this.aClass1_Sub6ArrayArrayArray1[arg0][arg1][arg2];
		return local8 == null ? null : local8.aClass50_1;
	}

	@OriginalMember(owner = "client!l", name = "h", descriptor = "(III)Z")
	private boolean method1147(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) int local8 = this.anIntArrayArrayArray3[arg0][arg1][arg2];
		if (local8 == -Static68.anInt1797) {
			return false;
		} else if (local8 == Static68.anInt1797) {
			return true;
		} else {
			@Pc(23) int local23 = arg1 << 7;
			@Pc(27) int local27 = arg2 << 7;
			if (this.method1161(local23 + 1, this.anIntArrayArrayArray2[arg0][arg1][arg2], local27 + 1) && this.method1161(local23 + 128 - 1, this.anIntArrayArrayArray2[arg0][arg1 + 1][arg2], local27 + 1) && this.method1161(local23 + 128 - 1, this.anIntArrayArrayArray2[arg0][arg1 + 1][arg2 + 1], local27 + 128 - 1) && this.method1161(local23 + 1, this.anIntArrayArrayArray2[arg0][arg1][arg2 + 1], local27 + 128 - 1)) {
				this.anIntArrayArrayArray3[arg0][arg1][arg2] = Static68.anInt1797;
				return true;
			} else {
				this.anIntArrayArrayArray3[arg0][arg1][arg2] = -Static68.anInt1797;
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(Lclient!qa;IIIIIII)V")
	private void method1148(@OriginalArg(0) Class62 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(6) int local6;
		@Pc(7) int local7 = local6 = (arg6 << 7) - Static68.anInt1783;
		@Pc(14) int local14;
		@Pc(15) int local15 = local14 = (arg7 << 7) - Static68.anInt1785;
		@Pc(20) int local20;
		@Pc(21) int local21 = local20 = local7 + 128;
		@Pc(26) int local26;
		@Pc(27) int local27 = local26 = local15 + 128;
		@Pc(38) int local38 = this.anIntArrayArrayArray2[arg1][arg6][arg7] - Static68.anInt1798;
		@Pc(51) int local51 = this.anIntArrayArrayArray2[arg1][arg6 + 1][arg7] - Static68.anInt1798;
		@Pc(66) int local66 = this.anIntArrayArrayArray2[arg1][arg6 + 1][arg7 + 1] - Static68.anInt1798;
		@Pc(79) int local79 = this.anIntArrayArrayArray2[arg1][arg6][arg7 + 1] - Static68.anInt1798;
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
		@Pc(279) int local279 = Static108.anInt2647 + (local101 << 9) / local121;
		@Pc(287) int local287 = Static108.anInt2643 + (local123 << 9) / local121;
		@Pc(295) int local295 = Static108.anInt2647 + (local21 << 9) / local169;
		@Pc(303) int local303 = Static108.anInt2643 + (local51 << 9) / local169;
		@Pc(311) int local311 = Static108.anInt2647 + (local197 << 9) / local27;
		@Pc(319) int local319 = Static108.anInt2643 + (local66 << 9) / local27;
		@Pc(327) int local327 = Static108.anInt2647 + (local245 << 9) / local265;
		@Pc(335) int local335 = Static108.anInt2643 + (local89 << 9) / local265;
		Static108.anInt2644 = 0;
		@Pc(472) int local472;
		if ((local311 - local327) * (local303 - local335) - (local319 - local335) * (local295 - local327) > 0) {
			Static108.aBoolean146 = false;
			if (local311 < 0 || local327 < 0 || local295 < 0 || local311 > Static108.anInt2649 || local327 > Static108.anInt2649 || local295 > Static108.anInt2649) {
				Static108.aBoolean146 = true;
			}
			if (Static68.aBoolean97 && this.method1168(Static68.anInt1791, Static68.anInt1790, local319, local335, local303, local311, local327, local295)) {
				Static68.anInt1776 = arg6;
				Static68.anInt1778 = arg7;
			}
			if (arg0.anInt2488 == -1) {
				if (arg0.anInt2490 != 12345678) {
					Static108.method1774(local319, local335, local303, local311, local327, local295, arg0.anInt2490, arg0.anInt2484, arg0.anInt2493);
				}
			} else if (Static68.aBoolean96) {
				local472 = Static108.anInterface2_1.method1869(arg0.anInt2488);
				Static108.method1774(local319, local335, local303, local311, local327, local295, Static68.method1166(local472, arg0.anInt2490), Static68.method1166(local472, arg0.anInt2484), Static68.method1166(local472, arg0.anInt2493));
			} else if (arg0.aBoolean132) {
				Static108.method1782(local319, local335, local303, local311, local327, local295, arg0.anInt2490, arg0.anInt2484, arg0.anInt2493, local101, local21, local245, local123, local51, local89, local121, local169, local265, arg0.anInt2488);
			} else {
				Static108.method1782(local319, local335, local303, local311, local327, local295, arg0.anInt2490, arg0.anInt2484, arg0.anInt2493, local197, local245, local21, local66, local89, local51, local27, local265, local169, arg0.anInt2488);
			}
		}
		if ((local279 - local295) * (local335 - local303) - (local287 - local303) * (local327 - local295) <= 0) {
			return;
		}
		Static108.aBoolean146 = false;
		if (local279 < 0 || local295 < 0 || local327 < 0 || local279 > Static108.anInt2649 || local295 > Static108.anInt2649 || local327 > Static108.anInt2649) {
			Static108.aBoolean146 = true;
		}
		if (Static68.aBoolean97 && this.method1168(Static68.anInt1791, Static68.anInt1790, local287, local303, local335, local279, local295, local327)) {
			Static68.anInt1776 = arg6;
			Static68.anInt1778 = arg7;
		}
		if (arg0.anInt2488 != -1) {
			if (!Static68.aBoolean96) {
				Static108.method1782(local287, local303, local335, local279, local295, local327, arg0.anInt2487, arg0.anInt2493, arg0.anInt2484, local101, local21, local245, local123, local51, local89, local121, local169, local265, arg0.anInt2488);
				return;
			}
			local472 = Static108.anInterface2_1.method1869(arg0.anInt2488);
			Static108.method1774(local287, local303, local335, local279, local295, local327, Static68.method1166(local472, arg0.anInt2487), Static68.method1166(local472, arg0.anInt2493), Static68.method1166(local472, arg0.anInt2484));
		} else if (arg0.anInt2487 != 12345678) {
			Static108.method1774(local287, local303, local335, local279, local295, local327, arg0.anInt2487, arg0.anInt2493, arg0.anInt2484);
			return;
		}
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(IIIILclient!ha;Lclient!ha;IIII)V")
	public void method1149(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class1_Sub1_Sub1 arg4, @OriginalArg(5) Class1_Sub1_Sub1 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		if (arg4 == null && arg5 == null) {
			return;
		}
		@Pc(8) Class50 local8 = new Class50();
		local8.anInt2078 = arg8;
		local8.anInt2075 = arg9;
		local8.anInt2076 = arg1 * 128 + 64;
		local8.anInt2074 = arg2 * 128 + 64;
		local8.anInt2079 = arg3;
		local8.aClass1_Sub1_Sub1_3 = arg4;
		local8.aClass1_Sub1_Sub1_4 = arg5;
		local8.anInt2083 = arg6;
		local8.anInt2080 = arg7;
		for (@Pc(45) int local45 = arg0; local45 >= 0; local45--) {
			if (this.aClass1_Sub6ArrayArrayArray1[local45][arg1][arg2] == null) {
				this.aClass1_Sub6ArrayArrayArray1[local45][arg1][arg2] = new Class1_Sub6(local45, arg1, arg2);
			}
		}
		this.aClass1_Sub6ArrayArrayArray1[arg0][arg1][arg2].aClass50_1 = local8;
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(IIIIILclient!ha;IIZ)Z")
	public boolean method1150(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class1_Sub1_Sub1 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8) {
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
		return this.method1142(arg0, local7, local11, local15 + 1 - local7, local19 - local11 + 1, arg1, arg2, arg3, arg5, arg6, true, arg7, 0);
	}

	@OriginalMember(owner = "client!l", name = "i", descriptor = "(III)V")
	public void method1151(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		Static68.aBoolean97 = true;
		Static68.anInt1784 = arg0;
		Static68.anInt1791 = arg1;
		Static68.anInt1790 = arg2;
		Static68.anInt1776 = -1;
		Static68.anInt1778 = -1;
	}

	@OriginalMember(owner = "client!l", name = "j", descriptor = "(III)V")
	public void method1152(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class1_Sub6 local8 = this.aClass1_Sub6ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 != null) {
			local8.aClass69_1 = null;
		}
	}

	@OriginalMember(owner = "client!l", name = "k", descriptor = "(III)I")
	public int method1153(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class1_Sub6 local8 = this.aClass1_Sub6ArrayArrayArray1[arg0][arg1][arg2];
		return local8 == null || local8.aClass56_1 == null ? 0 : local8.aClass56_1.anInt2279;
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(I)V")
	public void method1154(@OriginalArg(0) int arg0) {
		this.anInt1792 = arg0;
		for (@Pc(4) int local4 = 0; local4 < this.anInt1777; local4++) {
			for (@Pc(7) int local7 = 0; local7 < this.anInt1789; local7++) {
				if (this.aClass1_Sub6ArrayArrayArray1[arg0][local4][local7] == null) {
					this.aClass1_Sub6ArrayArrayArray1[arg0][local4][local7] = new Class1_Sub6(arg0, local4, local7);
				}
			}
		}
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "([IIIIII)V")
	public void method1155(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(8) Class1_Sub6 local8 = this.aClass1_Sub6ArrayArrayArray1[arg2][arg3][arg4];
		if (local8 == null) {
			return;
		}
		@Pc(14) Class62 local14 = local8.aClass62_1;
		@Pc(24) int local24;
		if (local14 != null) {
			@Pc(19) int local19 = local14.anInt2489;
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
		@Pc(59) Class54 local59 = local8.aClass54_1;
		if (local59 == null) {
			return;
		}
		local24 = local59.anInt2138;
		@Pc(68) int local68 = local59.anInt2137;
		@Pc(71) int local71 = local59.anInt2139;
		@Pc(74) int local74 = local59.anInt2136;
		@Pc(79) int[] local79 = this.anIntArrayArray16[local24];
		@Pc(84) int[] local84 = this.anIntArrayArray17[local68];
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

	@OriginalMember(owner = "client!l", name = "l", descriptor = "(III)I")
	public int method1156(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class1_Sub6 local8 = this.aClass1_Sub6ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 == null) {
			return 0;
		}
		for (@Pc(14) int local14 = 0; local14 < local8.anInt759; local14++) {
			@Pc(20) Class26 local20 = local8.aClass26Array1[local14];
			if ((local20.anInt1087 >> 29 & 0x3) == 2 && local20.anInt1096 == arg1 && local20.anInt1088 == arg2) {
				return local20.anInt1087;
			}
		}
		return 0;
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(IIIIIIIIIIIIIIIIIIII)V")
	public void method1157(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int arg15, @OriginalArg(16) int arg16, @OriginalArg(17) int arg17, @OriginalArg(18) int arg18, @OriginalArg(19) int arg19) {
		@Pc(12) Class62 local12;
		@Pc(14) int local14;
		if (arg3 == 0) {
			local12 = new Class62(arg10, arg11, arg12, arg13, -1, arg18, false);
			for (local14 = arg0; local14 >= 0; local14--) {
				if (this.aClass1_Sub6ArrayArrayArray1[local14][arg1][arg2] == null) {
					this.aClass1_Sub6ArrayArrayArray1[local14][arg1][arg2] = new Class1_Sub6(local14, arg1, arg2);
				}
			}
			this.aClass1_Sub6ArrayArrayArray1[arg0][arg1][arg2].aClass62_1 = local12;
		} else if (arg3 == 1) {
			local12 = new Class62(arg14, arg15, arg16, arg17, arg5, arg19, arg6 == arg7 && arg6 == arg8 && arg6 == arg9);
			for (local14 = arg0; local14 >= 0; local14--) {
				if (this.aClass1_Sub6ArrayArrayArray1[local14][arg1][arg2] == null) {
					this.aClass1_Sub6ArrayArrayArray1[local14][arg1][arg2] = new Class1_Sub6(local14, arg1, arg2);
				}
			}
			this.aClass1_Sub6ArrayArrayArray1[arg0][arg1][arg2].aClass62_1 = local12;
		} else {
			@Pc(140) Class54 local140 = new Class54(arg3, arg4, arg5, arg1, arg2, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17, arg18, arg19);
			for (local14 = arg0; local14 >= 0; local14--) {
				if (this.aClass1_Sub6ArrayArrayArray1[local14][arg1][arg2] == null) {
					this.aClass1_Sub6ArrayArrayArray1[local14][arg1][arg2] = new Class1_Sub6(local14, arg1, arg2);
				}
			}
			this.aClass1_Sub6ArrayArrayArray1[arg0][arg1][arg2].aClass54_1 = local140;
		}
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(Lclient!d;Z)V")
	private void method1158(@OriginalArg(0) Class1_Sub6 arg0, @OriginalArg(1) boolean arg1) {
		Static68.aClass38_13.method1046(arg0);
		while (true) {
			@Pc(8) Class1_Sub6 local8;
			@Pc(17) int local17;
			@Pc(20) int local20;
			@Pc(23) int local23;
			@Pc(26) int local26;
			@Pc(31) Class1_Sub6[][] local31;
			@Pc(49) Class1_Sub6 local49;
			@Pc(251) int local251;
			@Pc(588) int local588;
			@Pc(593) int local593;
			@Pc(598) int local598;
			@Pc(601) int local601;
			@Pc(610) int local610;
			@Pc(952) Class50 local952;
			@Pc(1126) int local1126;
			@Pc(1011) int local1011;
			do {
				do {
					do {
						do {
							do {
								do {
									while (true) {
										@Pc(257) Class26 var12;
										@Pc(622) int var19;
										@Pc(345) int var23;
										@Pc(289) boolean var24;
										@Pc(833) Class1_Sub6 var35;
										while (true) {
											do {
												local8 = (Class1_Sub6) Static68.aClass38_13.method1040();
												if (local8 == null) {
													return;
												}
											} while (!local8.aBoolean37);
											local17 = local8.anInt761;
											local20 = local8.anInt762;
											local23 = local8.anInt768;
											local26 = local8.anInt763;
											local31 = this.aClass1_Sub6ArrayArrayArray1[local23];
											if (!local8.aBoolean38) {
												break;
											}
											if (arg1) {
												if (local23 > 0) {
													local49 = this.aClass1_Sub6ArrayArrayArray1[local23 - 1][local17][local20];
													if (local49 != null && local49.aBoolean37) {
														continue;
													}
												}
												if (local17 <= Static68.anInt1793 && local17 > Static68.anInt1781) {
													local49 = local31[local17 - 1][local20];
													if (local49 != null && local49.aBoolean37 && (local49.aBoolean38 || (local8.anInt767 & 0x1) == 0)) {
														continue;
													}
												}
												if (local17 >= Static68.anInt1793 && local17 < Static68.anInt1801 - 1) {
													local49 = local31[local17 + 1][local20];
													if (local49 != null && local49.aBoolean37 && (local49.aBoolean38 || (local8.anInt767 & 0x4) == 0)) {
														continue;
													}
												}
												if (local20 <= Static68.anInt1787 && local20 > Static68.anInt1782) {
													local49 = local31[local17][local20 - 1];
													if (local49 != null && local49.aBoolean37 && (local49.aBoolean38 || (local8.anInt767 & 0x8) == 0)) {
														continue;
													}
												}
												if (local20 >= Static68.anInt1787 && local20 < Static68.anInt1775 - 1) {
													local49 = local31[local17][local20 + 1];
													if (local49 != null && local49.aBoolean37 && (local49.aBoolean38 || (local8.anInt767 & 0x2) == 0)) {
														continue;
													}
												}
											} else {
												arg1 = true;
											}
											local8.aBoolean38 = false;
											if (local8.aClass1_Sub6_1 != null) {
												local49 = local8.aClass1_Sub6_1;
												if (local49.aClass62_1 == null) {
													if (local49.aClass54_1 != null && !this.method1147(0, local17, local20)) {
														this.method1137(local49.aClass54_1, Static68.anInt1800, Static68.anInt1780, Static68.anInt1794, Static68.anInt1799, local17, local20);
													}
												} else if (!this.method1147(0, local17, local20)) {
													this.method1148(local49.aClass62_1, 0, Static68.anInt1800, Static68.anInt1780, Static68.anInt1794, Static68.anInt1799, local17, local20);
												}
												@Pc(225) Class50 local225 = local49.aClass50_1;
												if (local225 != null) {
													local225.aClass1_Sub1_Sub1_3.method1843(0, Static68.anInt1800, Static68.anInt1780, Static68.anInt1794, Static68.anInt1799, local225.anInt2076 - Static68.anInt1783, local225.anInt2079 - Static68.anInt1798, local225.anInt2074 - Static68.anInt1785, local225.anInt2078);
												}
												for (local251 = 0; local251 < local49.anInt759; local251++) {
													var12 = local49.aClass26Array1[local251];
													if (var12 != null) {
														var12.aClass1_Sub1_Sub1_1.method1843(var12.anInt1089, Static68.anInt1800, Static68.anInt1780, Static68.anInt1794, Static68.anInt1799, var12.anInt1095 - Static68.anInt1783, var12.anInt1090 - Static68.anInt1798, var12.anInt1099 - Static68.anInt1785, var12.anInt1087);
													}
												}
											}
											var24 = false;
											if (local8.aClass62_1 == null) {
												if (local8.aClass54_1 != null && !this.method1147(local26, local17, local20)) {
													var24 = true;
													this.method1137(local8.aClass54_1, Static68.anInt1800, Static68.anInt1780, Static68.anInt1794, Static68.anInt1799, local17, local20);
												}
											} else if (!this.method1147(local26, local17, local20)) {
												var24 = true;
												if (local8.aClass62_1.anInt2490 != 12345678 || Static68.aBoolean97 && local23 <= Static68.anInt1784) {
													this.method1148(local8.aClass62_1, local26, Static68.anInt1800, Static68.anInt1780, Static68.anInt1794, Static68.anInt1799, local17, local20);
												}
											}
											var23 = 0;
											local251 = 0;
											@Pc(350) Class50 local350 = local8.aClass50_1;
											@Pc(353) Class29 local353 = local8.aClass29_1;
											if (local350 != null || local353 != null) {
												if (Static68.anInt1793 == local17) {
													var23++;
												} else if (Static68.anInt1793 < local17) {
													var23 += 2;
												}
												if (Static68.anInt1787 == local20) {
													var23 += 3;
												} else if (Static68.anInt1787 > local20) {
													var23 += 6;
												}
												local251 = Static68.anIntArray220[var23];
												local8.anInt758 = Static68.anIntArray222[var23];
											}
											if (local350 != null) {
												if ((local350.anInt2083 & Static68.anIntArray221[var23]) == 0) {
													local8.anInt757 = 0;
												} else if (local350.anInt2083 == 16) {
													local8.anInt757 = 3;
													local8.anInt760 = Static68.anIntArray224[var23];
													local8.anInt765 = 3 - local8.anInt760;
												} else if (local350.anInt2083 == 32) {
													local8.anInt757 = 6;
													local8.anInt760 = Static68.anIntArray225[var23];
													local8.anInt765 = 6 - local8.anInt760;
												} else if (local350.anInt2083 == 64) {
													local8.anInt757 = 12;
													local8.anInt760 = Static68.anIntArray219[var23];
													local8.anInt765 = 12 - local8.anInt760;
												} else {
													local8.anInt757 = 9;
													local8.anInt760 = Static68.anIntArray223[var23];
													local8.anInt765 = 9 - local8.anInt760;
												}
												if ((local350.anInt2083 & local251) != 0 && !this.method1144(local26, local17, local20, local350.anInt2083)) {
													local350.aClass1_Sub1_Sub1_3.method1843(0, Static68.anInt1800, Static68.anInt1780, Static68.anInt1794, Static68.anInt1799, local350.anInt2076 - Static68.anInt1783, local350.anInt2079 - Static68.anInt1798, local350.anInt2074 - Static68.anInt1785, local350.anInt2078);
												}
												if ((local350.anInt2080 & local251) != 0 && !this.method1144(local26, local17, local20, local350.anInt2080)) {
													local350.aClass1_Sub1_Sub1_4.method1843(0, Static68.anInt1800, Static68.anInt1780, Static68.anInt1794, Static68.anInt1799, local350.anInt2076 - Static68.anInt1783, local350.anInt2079 - Static68.anInt1798, local350.anInt2074 - Static68.anInt1785, local350.anInt2078);
												}
											}
											if (local353 != null && !this.method1141(local26, local17, local20, local353.aClass1_Sub1_Sub1_2.anInt2759)) {
												if ((local353.anInt1466 & local251) != 0) {
													local353.aClass1_Sub1_Sub1_2.method1843(local353.anInt1461, Static68.anInt1800, Static68.anInt1780, Static68.anInt1794, Static68.anInt1799, local353.anInt1469 - Static68.anInt1783, local353.anInt1467 - Static68.anInt1798, local353.anInt1462 - Static68.anInt1785, local353.anInt1464);
												} else if ((local353.anInt1466 & 0x300) != 0) {
													local588 = local353.anInt1469 - Static68.anInt1783;
													local593 = local353.anInt1467 - Static68.anInt1798;
													local598 = local353.anInt1462 - Static68.anInt1785;
													local601 = local353.anInt1461;
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
													if ((local353.anInt1466 & 0x100) != 0 && var19 < local610) {
														local639 = local588 + Static68.anIntArray216[local601];
														local645 = local598 + Static68.anIntArray217[local601];
														local353.aClass1_Sub1_Sub1_2.method1843(local601 * 512 + 256, Static68.anInt1800, Static68.anInt1780, Static68.anInt1794, Static68.anInt1799, local639, local593, local645, local353.anInt1464);
													}
													if ((local353.anInt1466 & 0x200) != 0 && var19 > local610) {
														local639 = local588 + Static68.anIntArray215[local601];
														local645 = local598 + Static68.anIntArray218[local601];
														local353.aClass1_Sub1_Sub1_2.method1843(local601 * 512 + 1280 & 0x7FF, Static68.anInt1800, Static68.anInt1780, Static68.anInt1794, Static68.anInt1799, local639, local593, local645, local353.anInt1464);
													}
												}
											}
											if (var24) {
												@Pc(706) Class56 local706 = local8.aClass56_1;
												if (local706 != null) {
													local706.aClass1_Sub1_Sub1_5.method1843(0, Static68.anInt1800, Static68.anInt1780, Static68.anInt1794, Static68.anInt1799, local706.anInt2283 - Static68.anInt1783, local706.anInt2287 - Static68.anInt1798, local706.anInt2280 - Static68.anInt1785, local706.anInt2279);
												}
												@Pc(733) Class69 local733 = local8.aClass69_1;
												if (local733 != null && local733.anInt2600 == 0) {
													if (local733.aClass1_Sub1_Sub1_6 != null) {
														local733.aClass1_Sub1_Sub1_6.method1843(0, Static68.anInt1800, Static68.anInt1780, Static68.anInt1794, Static68.anInt1799, local733.anInt2595 - Static68.anInt1783, local733.anInt2593 - Static68.anInt1798, local733.anInt2597 - Static68.anInt1785, local733.anInt2592);
													}
													if (local733.aClass1_Sub1_Sub1_7 != null) {
														local733.aClass1_Sub1_Sub1_7.method1843(0, Static68.anInt1800, Static68.anInt1780, Static68.anInt1794, Static68.anInt1799, local733.anInt2595 - Static68.anInt1783, local733.anInt2593 - Static68.anInt1798, local733.anInt2597 - Static68.anInt1785, local733.anInt2592);
													}
													if (local733.aClass1_Sub1_Sub1_8 != null) {
														local733.aClass1_Sub1_Sub1_8.method1843(0, Static68.anInt1800, Static68.anInt1780, Static68.anInt1794, Static68.anInt1799, local733.anInt2595 - Static68.anInt1783, local733.anInt2593 - Static68.anInt1798, local733.anInt2597 - Static68.anInt1785, local733.anInt2592);
													}
												}
											}
											local588 = local8.anInt767;
											if (local588 != 0) {
												if (local17 < Static68.anInt1793 && (local588 & 0x4) != 0) {
													var35 = local31[local17 + 1][local20];
													if (var35 != null && var35.aBoolean37) {
														Static68.aClass38_13.method1046(var35);
													}
												}
												if (local20 < Static68.anInt1787 && (local588 & 0x2) != 0) {
													var35 = local31[local17][local20 + 1];
													if (var35 != null && var35.aBoolean37) {
														Static68.aClass38_13.method1046(var35);
													}
												}
												if (local17 > Static68.anInt1793 && (local588 & 0x1) != 0) {
													var35 = local31[local17 - 1][local20];
													if (var35 != null && var35.aBoolean37) {
														Static68.aClass38_13.method1046(var35);
													}
												}
												if (local20 > Static68.anInt1787 && (local588 & 0x8) != 0) {
													var35 = local31[local17][local20 - 1];
													if (var35 != null && var35.aBoolean37) {
														Static68.aClass38_13.method1046(var35);
													}
												}
											}
											break;
										}
										if (local8.anInt757 != 0) {
											var24 = true;
											for (var23 = 0; var23 < local8.anInt759; var23++) {
												if (local8.aClass26Array1[var23].anInt1094 != Static68.anInt1797 && (local8.anIntArray77[var23] & local8.anInt757) == local8.anInt760) {
													var24 = false;
													break;
												}
											}
											if (var24) {
												local952 = local8.aClass50_1;
												if (!this.method1144(local26, local17, local20, local952.anInt2083)) {
													local952.aClass1_Sub1_Sub1_3.method1843(0, Static68.anInt1800, Static68.anInt1780, Static68.anInt1794, Static68.anInt1799, local952.anInt2076 - Static68.anInt1783, local952.anInt2079 - Static68.anInt1798, local952.anInt2074 - Static68.anInt1785, local952.anInt2078);
												}
												local8.anInt757 = 0;
											}
										}
										if (!local8.aBoolean36) {
											break;
										}
										try {
											@Pc(991) int local991 = local8.anInt759;
											local8.aBoolean36 = false;
											var23 = 0;
											label568: for (local251 = 0; local251 < local991; local251++) {
												var12 = local8.aClass26Array1[local251];
												if (var12.anInt1094 != Static68.anInt1797) {
													for (local1011 = var12.anInt1096; local1011 <= var12.anInt1092; local1011++) {
														for (local588 = var12.anInt1088; local588 <= var12.anInt1091; local588++) {
															var35 = local31[local1011][local588];
															if (var35.aBoolean38) {
																local8.aBoolean36 = true;
																continue label568;
															}
															if (var35.anInt757 != 0) {
																local598 = 0;
																if (local1011 > var12.anInt1096) {
																	local598++;
																}
																if (local1011 < var12.anInt1092) {
																	local598 += 4;
																}
																if (local588 > var12.anInt1088) {
																	local598 += 8;
																}
																if (local588 < var12.anInt1091) {
																	local598 += 2;
																}
																if ((local598 & var35.anInt757) == local8.anInt765) {
																	local8.aBoolean36 = true;
																	continue label568;
																}
															}
														}
													}
													Static68.aClass26Array2[var23++] = var12;
													local588 = Static68.anInt1793 - var12.anInt1096;
													local593 = var12.anInt1092 - Static68.anInt1793;
													if (local593 > local588) {
														local588 = local593;
													}
													local598 = Static68.anInt1787 - var12.anInt1088;
													local601 = var12.anInt1091 - Static68.anInt1787;
													if (local601 > local598) {
														var12.anInt1093 = local588 + local601;
													} else {
														var12.anInt1093 = local588 + local598;
													}
												}
											}
											while (var23 > 0) {
												local1126 = -50;
												local1011 = -1;
												@Pc(1135) Class26 local1135;
												for (local588 = 0; local588 < var23; local588++) {
													local1135 = Static68.aClass26Array2[local588];
													if (local1135.anInt1094 != Static68.anInt1797) {
														if (local1135.anInt1093 > local1126) {
															local1126 = local1135.anInt1093;
															local1011 = local588;
														} else if (local1135.anInt1093 == local1126) {
															local598 = local1135.anInt1095 - Static68.anInt1783;
															local601 = local1135.anInt1099 - Static68.anInt1785;
															local610 = Static68.aClass26Array2[local1011].anInt1095 - Static68.anInt1783;
															var19 = Static68.aClass26Array2[local1011].anInt1099 - Static68.anInt1785;
															if (local598 * local598 + local601 * local601 > local610 * local610 + var19 * var19) {
																local1011 = local588;
															}
														}
													}
												}
												if (local1011 == -1) {
													break;
												}
												local1135 = Static68.aClass26Array2[local1011];
												local1135.anInt1094 = Static68.anInt1797;
												if (!this.method1177(local26, local1135.anInt1096, local1135.anInt1092, local1135.anInt1088, local1135.anInt1091, local1135.aClass1_Sub1_Sub1_1.anInt2759)) {
													local1135.aClass1_Sub1_Sub1_1.method1843(local1135.anInt1089, Static68.anInt1800, Static68.anInt1780, Static68.anInt1794, Static68.anInt1799, local1135.anInt1095 - Static68.anInt1783, local1135.anInt1090 - Static68.anInt1798, local1135.anInt1099 - Static68.anInt1785, local1135.anInt1087);
												}
												for (local598 = local1135.anInt1096; local598 <= local1135.anInt1092; local598++) {
													for (local601 = local1135.anInt1088; local601 <= local1135.anInt1091; local601++) {
														@Pc(1260) Class1_Sub6 local1260 = local31[local598][local601];
														if (local1260.anInt757 != 0) {
															Static68.aClass38_13.method1046(local1260);
														} else if ((local598 != local17 || local601 != local20) && local1260.aBoolean37) {
															Static68.aClass38_13.method1046(local1260);
														}
													}
												}
											}
											if (!local8.aBoolean36) {
												break;
											}
										} catch (@Pc(1298) Exception local1298) {
											local8.aBoolean36 = false;
											break;
										}
									}
								} while (!local8.aBoolean37);
							} while (local8.anInt757 != 0);
							if (local17 > Static68.anInt1793 || local17 <= Static68.anInt1781) {
								break;
							}
							local49 = local31[local17 - 1][local20];
						} while (local49 != null && local49.aBoolean37);
						if (local17 < Static68.anInt1793 || local17 >= Static68.anInt1801 - 1) {
							break;
						}
						local49 = local31[local17 + 1][local20];
					} while (local49 != null && local49.aBoolean37);
					if (local20 > Static68.anInt1787 || local20 <= Static68.anInt1782) {
						break;
					}
					local49 = local31[local17][local20 - 1];
				} while (local49 != null && local49.aBoolean37);
				if (local20 < Static68.anInt1787 || local20 >= Static68.anInt1775 - 1) {
					break;
				}
				local49 = local31[local17][local20 + 1];
			} while (local49 != null && local49.aBoolean37);
			local8.aBoolean37 = false;
			Static68.anInt1779--;
			@Pc(1402) Class69 local1402 = local8.aClass69_1;
			if (local1402 != null && local1402.anInt2600 != 0) {
				if (local1402.aClass1_Sub1_Sub1_6 != null) {
					local1402.aClass1_Sub1_Sub1_6.method1843(0, Static68.anInt1800, Static68.anInt1780, Static68.anInt1794, Static68.anInt1799, local1402.anInt2595 - Static68.anInt1783, local1402.anInt2593 - Static68.anInt1798 - local1402.anInt2600, local1402.anInt2597 - Static68.anInt1785, local1402.anInt2592);
				}
				if (local1402.aClass1_Sub1_Sub1_7 != null) {
					local1402.aClass1_Sub1_Sub1_7.method1843(0, Static68.anInt1800, Static68.anInt1780, Static68.anInt1794, Static68.anInt1799, local1402.anInt2595 - Static68.anInt1783, local1402.anInt2593 - Static68.anInt1798 - local1402.anInt2600, local1402.anInt2597 - Static68.anInt1785, local1402.anInt2592);
				}
				if (local1402.aClass1_Sub1_Sub1_8 != null) {
					local1402.aClass1_Sub1_Sub1_8.method1843(0, Static68.anInt1800, Static68.anInt1780, Static68.anInt1794, Static68.anInt1799, local1402.anInt2595 - Static68.anInt1783, local1402.anInt2593 - Static68.anInt1798 - local1402.anInt2600, local1402.anInt2597 - Static68.anInt1785, local1402.anInt2592);
				}
			}
			if (local8.anInt758 != 0) {
				@Pc(1497) Class29 local1497 = local8.aClass29_1;
				if (local1497 != null && !this.method1141(local26, local17, local20, local1497.aClass1_Sub1_Sub1_2.anInt2759)) {
					if ((local1497.anInt1466 & local8.anInt758) != 0) {
						local1497.aClass1_Sub1_Sub1_2.method1843(local1497.anInt1461, Static68.anInt1800, Static68.anInt1780, Static68.anInt1794, Static68.anInt1799, local1497.anInt1469 - Static68.anInt1783, local1497.anInt1467 - Static68.anInt1798, local1497.anInt1462 - Static68.anInt1785, local1497.anInt1464);
					} else if ((local1497.anInt1466 & 0x300) != 0) {
						local251 = local1497.anInt1469 - Static68.anInt1783;
						local1126 = local1497.anInt1467 - Static68.anInt1798;
						local1011 = local1497.anInt1462 - Static68.anInt1785;
						local588 = local1497.anInt1461;
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
						if ((local1497.anInt1466 & 0x100) != 0 && local598 >= local593) {
							local601 = local251 + Static68.anIntArray216[local588];
							local610 = local1011 + Static68.anIntArray217[local588];
							local1497.aClass1_Sub1_Sub1_2.method1843(local588 * 512 + 256, Static68.anInt1800, Static68.anInt1780, Static68.anInt1794, Static68.anInt1799, local601, local1126, local610, local1497.anInt1464);
						}
						if ((local1497.anInt1466 & 0x200) != 0 && local598 <= local593) {
							local601 = local251 + Static68.anIntArray215[local588];
							local610 = local1011 + Static68.anIntArray218[local588];
							local1497.aClass1_Sub1_Sub1_2.method1843(local588 * 512 + 1280 & 0x7FF, Static68.anInt1800, Static68.anInt1780, Static68.anInt1794, Static68.anInt1799, local601, local1126, local610, local1497.anInt1464);
						}
					}
				}
				local952 = local8.aClass50_1;
				if (local952 != null) {
					if ((local952.anInt2080 & local8.anInt758) != 0 && !this.method1144(local26, local17, local20, local952.anInt2080)) {
						local952.aClass1_Sub1_Sub1_4.method1843(0, Static68.anInt1800, Static68.anInt1780, Static68.anInt1794, Static68.anInt1799, local952.anInt2076 - Static68.anInt1783, local952.anInt2079 - Static68.anInt1798, local952.anInt2074 - Static68.anInt1785, local952.anInt2078);
					}
					if ((local952.anInt2083 & local8.anInt758) != 0 && !this.method1144(local26, local17, local20, local952.anInt2083)) {
						local952.aClass1_Sub1_Sub1_3.method1843(0, Static68.anInt1800, Static68.anInt1780, Static68.anInt1794, Static68.anInt1799, local952.anInt2076 - Static68.anInt1783, local952.anInt2079 - Static68.anInt1798, local952.anInt2074 - Static68.anInt1785, local952.anInt2078);
					}
				}
			}
			@Pc(1755) Class1_Sub6 local1755;
			if (local23 < this.anInt1788 - 1) {
				local1755 = this.aClass1_Sub6ArrayArrayArray1[local23 + 1][local17][local20];
				if (local1755 != null && local1755.aBoolean37) {
					Static68.aClass38_13.method1046(local1755);
				}
			}
			if (local17 < Static68.anInt1793) {
				local1755 = local31[local17 + 1][local20];
				if (local1755 != null && local1755.aBoolean37) {
					Static68.aClass38_13.method1046(local1755);
				}
			}
			if (local20 < Static68.anInt1787) {
				local1755 = local31[local17][local20 + 1];
				if (local1755 != null && local1755.aBoolean37) {
					Static68.aClass38_13.method1046(local1755);
				}
			}
			if (local17 > Static68.anInt1793) {
				local1755 = local31[local17 - 1][local20];
				if (local1755 != null && local1755.aBoolean37) {
					Static68.aClass38_13.method1046(local1755);
				}
			}
			if (local20 > Static68.anInt1787) {
				local1755 = local31[local17][local20 - 1];
				if (local1755 != null && local1755.aBoolean37) {
					Static68.aClass38_13.method1046(local1755);
				}
			}
		}
	}

	@OriginalMember(owner = "client!l", name = "m", descriptor = "(III)Lclient!he;")
	public Class29 method1159(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class1_Sub6 local8 = this.aClass1_Sub6ArrayArrayArray1[arg0][arg1][arg2];
		return local8 == null ? null : local8.aClass29_1;
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(IIIIII)V")
	public void method1160(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (arg0 < 0) {
			arg0 = 0;
		} else if (arg0 >= this.anInt1777 * 128) {
			arg0 = this.anInt1777 * 128 - 1;
		}
		if (arg2 < 0) {
			arg2 = 0;
		} else if (arg2 >= this.anInt1789 * 128) {
			arg2 = this.anInt1789 * 128 - 1;
		}
		Static68.anInt1797++;
		Static68.anInt1800 = Class1_Sub1_Sub2_Sub4.anIntArray335[arg3];
		Static68.anInt1780 = Class1_Sub1_Sub2_Sub4.anIntArray334[arg3];
		Static68.anInt1794 = Class1_Sub1_Sub2_Sub4.anIntArray335[arg4];
		Static68.anInt1799 = Class1_Sub1_Sub2_Sub4.anIntArray334[arg4];
		Static68.aBooleanArrayArray1 = Static68.aBooleanArrayArrayArrayArray1[(arg3 - 128) / 32][arg4 / 64];
		Static68.anInt1783 = arg0;
		Static68.anInt1798 = arg1;
		Static68.anInt1785 = arg2;
		Static68.anInt1793 = arg0 / 128;
		Static68.anInt1787 = arg2 / 128;
		Static68.anInt1774 = arg5;
		Static68.anInt1781 = Static68.anInt1793 - 25;
		if (Static68.anInt1781 < 0) {
			Static68.anInt1781 = 0;
		}
		Static68.anInt1782 = Static68.anInt1787 - 25;
		if (Static68.anInt1782 < 0) {
			Static68.anInt1782 = 0;
		}
		Static68.anInt1801 = Static68.anInt1793 + 25;
		if (Static68.anInt1801 > this.anInt1777) {
			Static68.anInt1801 = this.anInt1777;
		}
		Static68.anInt1775 = Static68.anInt1787 + 25;
		if (Static68.anInt1775 > this.anInt1789) {
			Static68.anInt1775 = this.anInt1789;
		}
		this.method1172();
		Static68.anInt1779 = 0;
		@Pc(136) int local136;
		@Pc(139) int local139;
		for (@Pc(128) int local128 = this.anInt1792; local128 < this.anInt1788; local128++) {
			@Pc(134) Class1_Sub6[][] local134 = this.aClass1_Sub6ArrayArrayArray1[local128];
			for (local136 = Static68.anInt1781; local136 < Static68.anInt1801; local136++) {
				for (local139 = Static68.anInt1782; local139 < Static68.anInt1775; local139++) {
					@Pc(146) Class1_Sub6 local146 = local134[local136][local139];
					if (local146 != null) {
						if (local146.anInt764 <= arg5 && (Static68.aBooleanArrayArray1[local136 + 25 - Static68.anInt1793][local139 + 25 - Static68.anInt1787] || this.anIntArrayArrayArray2[local128][local136][local139] - arg1 >= 2000)) {
							local146.aBoolean38 = true;
							local146.aBoolean37 = true;
							if (local146.anInt759 > 0) {
								local146.aBoolean36 = true;
							} else {
								local146.aBoolean36 = false;
							}
							Static68.anInt1779++;
						} else {
							local146.aBoolean38 = false;
							local146.aBoolean37 = false;
							local146.anInt757 = 0;
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
		for (@Pc(224) int local224 = this.anInt1792; local224 < this.anInt1788; local224++) {
			@Pc(230) Class1_Sub6[][] local230 = this.aClass1_Sub6ArrayArrayArray1[local224];
			for (local139 = -25; local139 <= 0; local139++) {
				local237 = Static68.anInt1793 + local139;
				local241 = Static68.anInt1793 - local139;
				if (local237 >= Static68.anInt1781 || local241 < Static68.anInt1801) {
					for (local249 = -25; local249 <= 0; local249++) {
						local254 = Static68.anInt1787 + local249;
						local258 = Static68.anInt1787 - local249;
						@Pc(270) Class1_Sub6 local270;
						if (local237 >= Static68.anInt1781) {
							if (local254 >= Static68.anInt1782) {
								local270 = local230[local237][local254];
								if (local270 != null && local270.aBoolean38) {
									this.method1158(local270, true);
								}
							}
							if (local258 < Static68.anInt1775) {
								local270 = local230[local237][local258];
								if (local270 != null && local270.aBoolean38) {
									this.method1158(local270, true);
								}
							}
						}
						if (local241 < Static68.anInt1801) {
							if (local254 >= Static68.anInt1782) {
								local270 = local230[local241][local254];
								if (local270 != null && local270.aBoolean38) {
									this.method1158(local270, true);
								}
							}
							if (local258 < Static68.anInt1775) {
								local270 = local230[local241][local258];
								if (local270 != null && local270.aBoolean38) {
									this.method1158(local270, true);
								}
							}
						}
						if (Static68.anInt1779 == 0) {
							Static68.aBoolean97 = false;
							return;
						}
					}
				}
			}
		}
		for (local136 = this.anInt1792; local136 < this.anInt1788; local136++) {
			@Pc(361) Class1_Sub6[][] local361 = this.aClass1_Sub6ArrayArrayArray1[local136];
			for (local237 = -25; local237 <= 0; local237++) {
				local241 = Static68.anInt1793 + local237;
				local249 = Static68.anInt1793 - local237;
				if (local241 >= Static68.anInt1781 || local249 < Static68.anInt1801) {
					for (local254 = -25; local254 <= 0; local254++) {
						local258 = Static68.anInt1787 + local254;
						@Pc(389) int local389 = Static68.anInt1787 - local254;
						@Pc(401) Class1_Sub6 local401;
						if (local241 >= Static68.anInt1781) {
							if (local258 >= Static68.anInt1782) {
								local401 = local361[local241][local258];
								if (local401 != null && local401.aBoolean38) {
									this.method1158(local401, false);
								}
							}
							if (local389 < Static68.anInt1775) {
								local401 = local361[local241][local389];
								if (local401 != null && local401.aBoolean38) {
									this.method1158(local401, false);
								}
							}
						}
						if (local249 < Static68.anInt1801) {
							if (local258 >= Static68.anInt1782) {
								local401 = local361[local249][local258];
								if (local401 != null && local401.aBoolean38) {
									this.method1158(local401, false);
								}
							}
							if (local389 < Static68.anInt1775) {
								local401 = local361[local249][local389];
								if (local401 != null && local401.aBoolean38) {
									this.method1158(local401, false);
								}
							}
						}
						if (Static68.anInt1779 == 0) {
							Static68.aBoolean97 = false;
							return;
						}
					}
				}
			}
		}
		Static68.aBoolean97 = false;
	}

	@OriginalMember(owner = "client!l", name = "n", descriptor = "(III)Z")
	private boolean method1161(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < Static68.anInt1795; local1++) {
			@Pc(6) Class45 local6 = Static68.aClass45Array1[local1];
			@Pc(15) int local15;
			@Pc(27) int local27;
			@Pc(37) int local37;
			@Pc(47) int local47;
			@Pc(57) int local57;
			if (local6.anInt1831 == 1) {
				local15 = local6.anInt1842 - arg0;
				if (local15 > 0) {
					local27 = local6.anInt1827 + (local6.anInt1838 * local15 >> 8);
					local37 = local6.anInt1833 + (local6.anInt1830 * local15 >> 8);
					local47 = local6.anInt1841 + (local6.anInt1840 * local15 >> 8);
					local57 = local6.anInt1837 + (local6.anInt1834 * local15 >> 8);
					if (arg2 >= local27 && arg2 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt1831 == 2) {
				local15 = arg0 - local6.anInt1842;
				if (local15 > 0) {
					local27 = local6.anInt1827 + (local6.anInt1838 * local15 >> 8);
					local37 = local6.anInt1833 + (local6.anInt1830 * local15 >> 8);
					local47 = local6.anInt1841 + (local6.anInt1840 * local15 >> 8);
					local57 = local6.anInt1837 + (local6.anInt1834 * local15 >> 8);
					if (arg2 >= local27 && arg2 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt1831 == 3) {
				local15 = local6.anInt1827 - arg2;
				if (local15 > 0) {
					local27 = local6.anInt1842 + (local6.anInt1847 * local15 >> 8);
					local37 = local6.anInt1836 + (local6.anInt1826 * local15 >> 8);
					local47 = local6.anInt1841 + (local6.anInt1840 * local15 >> 8);
					local57 = local6.anInt1837 + (local6.anInt1834 * local15 >> 8);
					if (arg0 >= local27 && arg0 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt1831 == 4) {
				local15 = arg2 - local6.anInt1827;
				if (local15 > 0) {
					local27 = local6.anInt1842 + (local6.anInt1847 * local15 >> 8);
					local37 = local6.anInt1836 + (local6.anInt1826 * local15 >> 8);
					local47 = local6.anInt1841 + (local6.anInt1840 * local15 >> 8);
					local57 = local6.anInt1837 + (local6.anInt1834 * local15 >> 8);
					if (arg0 >= local27 && arg0 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt1831 == 5) {
				local15 = arg1 - local6.anInt1841;
				if (local15 > 0) {
					local27 = local6.anInt1842 + (local6.anInt1847 * local15 >> 8);
					local37 = local6.anInt1836 + (local6.anInt1826 * local15 >> 8);
					local47 = local6.anInt1827 + (local6.anInt1838 * local15 >> 8);
					local57 = local6.anInt1833 + (local6.anInt1830 * local15 >> 8);
					if (arg0 >= local27 && arg0 <= local37 && arg2 >= local47 && arg2 <= local57) {
						return true;
					}
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!l", name = "o", descriptor = "(III)Lclient!fe;")
	public Class26 method1162(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class1_Sub6 local8 = this.aClass1_Sub6ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 == null) {
			return null;
		}
		for (@Pc(14) int local14 = 0; local14 < local8.anInt759; local14++) {
			@Pc(20) Class26 local20 = local8.aClass26Array1[local14];
			if ((local20.anInt1087 >> 29 & 0x3) == 2 && local20.anInt1096 == arg1 && local20.anInt1088 == arg2) {
				return local20;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!l", name = "p", descriptor = "(III)V")
	public void method1163(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class1_Sub6 local8 = this.aClass1_Sub6ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 == null) {
			return;
		}
		for (@Pc(13) int local13 = 0; local13 < local8.anInt759; local13++) {
			@Pc(19) Class26 local19 = local8.aClass26Array1[local13];
			if ((local19.anInt1087 >> 29 & 0x3) == 2 && local19.anInt1096 == arg1 && local19.anInt1088 == arg2) {
				this.method1133(local19);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(IIIILclient!ha;II)V")
	public void method1165(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class1_Sub1_Sub1 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (arg4 == null) {
			return;
		}
		@Pc(6) Class56 local6 = new Class56();
		local6.aClass1_Sub1_Sub1_5 = arg4;
		local6.anInt2283 = arg1 * 128 + 64;
		local6.anInt2280 = arg2 * 128 + 64;
		local6.anInt2287 = arg3;
		local6.anInt2279 = arg5;
		local6.anInt2277 = arg6;
		if (this.aClass1_Sub6ArrayArrayArray1[arg0][arg1][arg2] == null) {
			this.aClass1_Sub6ArrayArrayArray1[arg0][arg1][arg2] = new Class1_Sub6(arg0, arg1, arg2);
		}
		this.aClass1_Sub6ArrayArrayArray1[arg0][arg1][arg2].aClass56_1 = local6;
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(Lclient!nf;IIIII)V")
	private void method1167(@OriginalArg(0) Class1_Sub1_Sub1_Sub4 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(1) boolean local1 = true;
		@Pc(3) int local3 = arg2;
		@Pc(7) int local7 = arg2 + arg4;
		@Pc(11) int local11 = arg3 - 1;
		@Pc(15) int local15 = arg3 + arg5;
		for (@Pc(17) int local17 = arg1; local17 <= arg1 + 1; local17++) {
			if (local17 != this.anInt1788) {
				for (@Pc(24) int local24 = local3; local24 <= local7; local24++) {
					if (local24 >= 0 && local24 < this.anInt1777) {
						for (@Pc(34) int local34 = local11; local34 <= local15; local34++) {
							if (local34 >= 0 && local34 < this.anInt1789 && (!local1 || local24 >= local7 || local34 >= local15 || local34 < arg3 && local24 != arg2)) {
								@Pc(66) Class1_Sub6 local66 = this.aClass1_Sub6ArrayArrayArray1[local17][local24][local34];
								if (local66 != null) {
									@Pc(160) int local160 = (this.anIntArrayArrayArray2[local17][local24][local34] + this.anIntArrayArrayArray2[local17][local24 + 1][local34] + this.anIntArrayArrayArray2[local17][local24][local34 + 1] + this.anIntArrayArrayArray2[local17][local24 + 1][local34 + 1]) / 4 - (this.anIntArrayArrayArray2[arg1][arg2][arg3] + this.anIntArrayArrayArray2[arg1][arg2 + 1][arg3] + this.anIntArrayArrayArray2[arg1][arg2][arg3 + 1] + this.anIntArrayArrayArray2[arg1][arg2 + 1][arg3 + 1]) / 4;
									@Pc(163) Class50 local163 = local66.aClass50_1;
									if (local163 != null) {
										@Pc(173) Class1_Sub1_Sub1_Sub4 local173;
										if (local163.aClass1_Sub1_Sub1_3 instanceof Class1_Sub1_Sub1_Sub4) {
											local173 = (Class1_Sub1_Sub1_Sub4) local163.aClass1_Sub1_Sub1_3;
											Static83.method1409(arg0, local173, (local24 - arg2) * 128 + (1 - arg4) * 64, local160, (local34 - arg3) * 128 + (1 - arg5) * 64, local1);
										}
										if (local163.aClass1_Sub1_Sub1_4 instanceof Class1_Sub1_Sub1_Sub4) {
											local173 = (Class1_Sub1_Sub1_Sub4) local163.aClass1_Sub1_Sub1_4;
											Static83.method1409(arg0, local173, (local24 - arg2) * 128 + (1 - arg4) * 64, local160, (local34 - arg3) * 128 + (1 - arg5) * 64, local1);
										}
									}
									for (@Pc(237) int local237 = 0; local237 < local66.anInt759; local237++) {
										@Pc(243) Class26 local243 = local66.aClass26Array1[local237];
										if (local243 != null && local243.aClass1_Sub1_Sub1_1 instanceof Class1_Sub1_Sub1_Sub4) {
											@Pc(253) Class1_Sub1_Sub1_Sub4 local253 = (Class1_Sub1_Sub1_Sub4) local243.aClass1_Sub1_Sub1_1;
											@Pc(261) int local261 = local243.anInt1092 + 1 - local243.anInt1096;
											@Pc(269) int local269 = local243.anInt1091 + 1 - local243.anInt1088;
											Static83.method1409(arg0, local253, (local243.anInt1096 - arg2) * 128 + (local261 - arg4) * 64, local160, (local243.anInt1088 - arg3) * 128 + (local269 - arg5) * 64, local1);
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

	@OriginalMember(owner = "client!l", name = "b", descriptor = "(IIIIIIII)Z")
	private boolean method1168(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
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

	@OriginalMember(owner = "client!l", name = "d", descriptor = "(IIII)V")
	public void method1169(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(8) Class1_Sub6 local8 = this.aClass1_Sub6ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 != null) {
			this.aClass1_Sub6ArrayArrayArray1[arg0][arg1][arg2].anInt764 = arg3;
		}
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "()V")
	public void method1171() {
		@Pc(4) int local4;
		@Pc(7) int local7;
		for (@Pc(1) int local1 = 0; local1 < this.anInt1788; local1++) {
			for (local4 = 0; local4 < this.anInt1777; local4++) {
				for (local7 = 0; local7 < this.anInt1789; local7++) {
					this.aClass1_Sub6ArrayArrayArray1[local1][local4][local7] = null;
				}
			}
		}
		for (local4 = 0; local4 < Static68.anInt1786; local4++) {
			for (local7 = 0; local7 < Static68.anIntArray214[local4]; local7++) {
				Static68.aClass45ArrayArray1[local4][local7] = null;
			}
			Static68.anIntArray214[local4] = 0;
		}
		for (local7 = 0; local7 < this.anInt1796; local7++) {
			this.aClass26Array3[local7] = null;
		}
		this.anInt1796 = 0;
		for (@Pc(76) int local76 = 0; local76 < Static68.aClass26Array2.length; local76++) {
			Static68.aClass26Array2[local76] = null;
		}
	}

	@OriginalMember(owner = "client!l", name = "b", descriptor = "()V")
	private void method1172() {
		@Pc(3) int local3 = Static68.anIntArray214[Static68.anInt1774];
		@Pc(7) Class45[] local7 = Static68.aClass45ArrayArray1[Static68.anInt1774];
		Static68.anInt1795 = 0;
		for (@Pc(11) int local11 = 0; local11 < local3; local11++) {
			@Pc(16) Class45 local16 = local7[local11];
			@Pc(27) int local27;
			@Pc(40) int local40;
			@Pc(51) int local51;
			@Pc(79) int local79;
			@Pc(58) boolean local58;
			if (local16.anInt1832 == 1) {
				local27 = local16.anInt1829 + 25 - Static68.anInt1793;
				if (local27 >= 0 && local27 <= 50) {
					local40 = local16.anInt1825 + 25 - Static68.anInt1787;
					if (local40 < 0) {
						local40 = 0;
					}
					local51 = local16.anInt1844 + 25 - Static68.anInt1787;
					if (local51 > 50) {
						local51 = 50;
					}
					local58 = false;
					while (local40 <= local51) {
						if (Static68.aBooleanArrayArray1[local27][local40++]) {
							local58 = true;
							break;
						}
					}
					if (local58) {
						local79 = Static68.anInt1783 - local16.anInt1842;
						if (local79 > 32) {
							local16.anInt1831 = 1;
						} else {
							if (local79 >= -32) {
								continue;
							}
							local16.anInt1831 = 2;
							local79 = -local79;
						}
						local16.anInt1838 = (local16.anInt1827 - Static68.anInt1785 << 8) / local79;
						local16.anInt1830 = (local16.anInt1833 - Static68.anInt1785 << 8) / local79;
						local16.anInt1840 = (local16.anInt1841 - Static68.anInt1798 << 8) / local79;
						local16.anInt1834 = (local16.anInt1837 - Static68.anInt1798 << 8) / local79;
						Static68.aClass45Array1[Static68.anInt1795++] = local16;
					}
				}
			} else if (local16.anInt1832 == 2) {
				local27 = local16.anInt1825 + 25 - Static68.anInt1787;
				if (local27 >= 0 && local27 <= 50) {
					local40 = local16.anInt1829 + 25 - Static68.anInt1793;
					if (local40 < 0) {
						local40 = 0;
					}
					local51 = local16.anInt1839 + 25 - Static68.anInt1793;
					if (local51 > 50) {
						local51 = 50;
					}
					local58 = false;
					while (local40 <= local51) {
						if (Static68.aBooleanArrayArray1[local40++][local27]) {
							local58 = true;
							break;
						}
					}
					if (local58) {
						local79 = Static68.anInt1785 - local16.anInt1827;
						if (local79 > 32) {
							local16.anInt1831 = 3;
						} else {
							if (local79 >= -32) {
								continue;
							}
							local16.anInt1831 = 4;
							local79 = -local79;
						}
						local16.anInt1847 = (local16.anInt1842 - Static68.anInt1783 << 8) / local79;
						local16.anInt1826 = (local16.anInt1836 - Static68.anInt1783 << 8) / local79;
						local16.anInt1840 = (local16.anInt1841 - Static68.anInt1798 << 8) / local79;
						local16.anInt1834 = (local16.anInt1837 - Static68.anInt1798 << 8) / local79;
						Static68.aClass45Array1[Static68.anInt1795++] = local16;
					}
				}
			} else if (local16.anInt1832 == 4) {
				local27 = local16.anInt1841 - Static68.anInt1798;
				if (local27 > 128) {
					local40 = local16.anInt1825 + 25 - Static68.anInt1787;
					if (local40 < 0) {
						local40 = 0;
					}
					local51 = local16.anInt1844 + 25 - Static68.anInt1787;
					if (local51 > 50) {
						local51 = 50;
					}
					if (local40 <= local51) {
						@Pc(319) int local319 = local16.anInt1829 + 25 - Static68.anInt1793;
						if (local319 < 0) {
							local319 = 0;
						}
						local79 = local16.anInt1839 + 25 - Static68.anInt1793;
						if (local79 > 50) {
							local79 = 50;
						}
						@Pc(337) boolean local337 = false;
						label142: for (@Pc(339) int local339 = local319; local339 <= local79; local339++) {
							for (@Pc(342) int local342 = local40; local342 <= local51; local342++) {
								if (Static68.aBooleanArrayArray1[local339][local342]) {
									local337 = true;
									break label142;
								}
							}
						}
						if (local337) {
							local16.anInt1831 = 5;
							local16.anInt1847 = (local16.anInt1842 - Static68.anInt1783 << 8) / local27;
							local16.anInt1826 = (local16.anInt1836 - Static68.anInt1783 << 8) / local27;
							local16.anInt1838 = (local16.anInt1827 - Static68.anInt1785 << 8) / local27;
							local16.anInt1830 = (local16.anInt1833 - Static68.anInt1785 << 8) / local27;
							Static68.aClass45Array1[Static68.anInt1795++] = local16;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(IIIIILclient!ha;IIIIII)Z")
	public boolean method1173(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) Class1_Sub1_Sub1 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		return arg4 == null ? true : this.method1142(arg0, arg7, arg8, arg9 + 1 - arg7, arg10 - arg8 + 1, arg1, arg2, arg3, arg4, arg5, true, arg6, 0);
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(IIIIIILclient!ha;III)Z")
	public boolean method1174(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class1_Sub1_Sub1 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		if (arg6 == null) {
			return true;
		} else {
			@Pc(11) int local11 = arg1 * 128 + arg4 * 64;
			@Pc(19) int local19 = arg2 * 128 + arg5 * 64;
			return this.method1142(arg0, arg1, arg2, arg4, arg5, local11, local19, arg3, arg6, arg7, false, arg8, arg9);
		}
	}

	@OriginalMember(owner = "client!l", name = "c", descriptor = "()V")
	public void method1175() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt1796; local1++) {
			@Pc(7) Class26 local7 = this.aClass26Array3[local1];
			this.method1133(local7);
			this.aClass26Array3[local1] = null;
		}
		this.anInt1796 = 0;
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(IIIILclient!ha;IIIIII)V")
	public void method1176(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class1_Sub1_Sub1 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		if (arg4 == null) {
			return;
		}
		@Pc(6) Class29 local6 = new Class29();
		local6.anInt1464 = arg9;
		local6.anInt1463 = arg10;
		local6.anInt1469 = arg1 * 128 + arg7 + 64;
		local6.anInt1462 = arg2 * 128 + arg8 + 64;
		local6.anInt1467 = arg3;
		local6.aClass1_Sub1_Sub1_2 = arg4;
		local6.anInt1466 = arg5;
		local6.anInt1461 = arg6;
		for (@Pc(44) int local44 = arg0; local44 >= 0; local44--) {
			if (this.aClass1_Sub6ArrayArrayArray1[local44][arg1][arg2] == null) {
				this.aClass1_Sub6ArrayArrayArray1[local44][arg1][arg2] = new Class1_Sub6(local44, arg1, arg2);
			}
		}
		this.aClass1_Sub6ArrayArrayArray1[arg0][arg1][arg2].aClass29_1 = local6;
	}

	@OriginalMember(owner = "client!l", name = "b", descriptor = "(IIIIII)Z")
	private boolean method1177(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(17) int local17;
		@Pc(21) int local21;
		if (arg1 != arg2 || arg3 != arg4) {
			for (local17 = arg1; local17 <= arg2; local17++) {
				for (local21 = arg3; local21 <= arg4; local21++) {
					if (this.anIntArrayArrayArray3[arg0][local17][local21] == -Static68.anInt1797) {
						return false;
					}
				}
			}
			local21 = (arg1 << 7) + 1;
			@Pc(156) int local156 = (arg3 << 7) + 2;
			@Pc(167) int local167 = this.anIntArrayArrayArray2[arg0][arg1][arg3] - arg5;
			if (!this.method1161(local21, local167, local156)) {
				return false;
			}
			@Pc(181) int local181 = (arg2 << 7) - 1;
			if (!this.method1161(local181, local167, local156)) {
				return false;
			}
			@Pc(195) int local195 = (arg4 << 7) - 1;
			if (!this.method1161(local21, local167, local195)) {
				return false;
			} else if (this.method1161(local181, local167, local195)) {
				return true;
			} else {
				return false;
			}
		} else if (this.method1147(arg0, arg1, arg3)) {
			local17 = arg1 << 7;
			local21 = arg3 << 7;
			return this.method1161(local17 + 1, this.anIntArrayArrayArray2[arg0][arg1][arg3] - arg5, local21 + 1) && this.method1161(local17 + 128 - 1, this.anIntArrayArrayArray2[arg0][arg1 + 1][arg3] - arg5, local21 + 1) && this.method1161(local17 + 128 - 1, this.anIntArrayArrayArray2[arg0][arg1 + 1][arg3 + 1] - arg5, local21 + 128 - 1) && this.method1161(local17 + 1, this.anIntArrayArrayArray2[arg0][arg1][arg3 + 1] - arg5, local21 + 128 - 1);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(Lclient!nf;III)V")
	private void method1178(@OriginalArg(0) Class1_Sub1_Sub1_Sub4 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(14) Class1_Sub6 local14;
		@Pc(29) Class1_Sub1_Sub1_Sub4 local29;
		if (arg2 < this.anInt1777) {
			local14 = this.aClass1_Sub6ArrayArrayArray1[arg1][arg2 + 1][arg3];
			if (local14 != null && local14.aClass56_1 != null && local14.aClass56_1.aClass1_Sub1_Sub1_5 instanceof Class1_Sub1_Sub1_Sub4) {
				local29 = (Class1_Sub1_Sub1_Sub4) local14.aClass56_1.aClass1_Sub1_Sub1_5;
				Static83.method1409(arg0, local29, 128, 0, 0, true);
			}
		}
		if (arg3 < this.anInt1777) {
			local14 = this.aClass1_Sub6ArrayArrayArray1[arg1][arg2][arg3 + 1];
			if (local14 != null && local14.aClass56_1 != null && local14.aClass56_1.aClass1_Sub1_Sub1_5 instanceof Class1_Sub1_Sub1_Sub4) {
				local29 = (Class1_Sub1_Sub1_Sub4) local14.aClass56_1.aClass1_Sub1_Sub1_5;
				Static83.method1409(arg0, local29, 0, 0, 128, true);
			}
		}
		if (arg2 < this.anInt1777 && arg3 < this.anInt1789) {
			local14 = this.aClass1_Sub6ArrayArrayArray1[arg1][arg2 + 1][arg3 + 1];
			if (local14 != null && local14.aClass56_1 != null && local14.aClass56_1.aClass1_Sub1_Sub1_5 instanceof Class1_Sub1_Sub1_Sub4) {
				local29 = (Class1_Sub1_Sub1_Sub4) local14.aClass56_1.aClass1_Sub1_Sub1_5;
				Static83.method1409(arg0, local29, 128, 0, 128, true);
			}
		}
		if (arg2 >= this.anInt1777 || arg3 <= 0) {
			return;
		}
		local14 = this.aClass1_Sub6ArrayArrayArray1[arg1][arg2 + 1][arg3 - 1];
		if (local14 != null && local14.aClass56_1 != null && local14.aClass56_1.aClass1_Sub1_Sub1_5 instanceof Class1_Sub1_Sub1_Sub4) {
			local29 = (Class1_Sub1_Sub1_Sub4) local14.aClass56_1.aClass1_Sub1_Sub1_5;
			Static83.method1409(arg0, local29, 128, 0, -128, true);
		}
	}

	@OriginalMember(owner = "client!l", name = "r", descriptor = "(III)Lclient!od;")
	public Class56 method1179(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class1_Sub6 local8 = this.aClass1_Sub6ArrayArrayArray1[arg0][arg1][arg2];
		return local8 == null || local8.aClass56_1 == null ? null : local8.aClass56_1;
	}

	@OriginalMember(owner = "client!l", name = "b", descriptor = "(II)V")
	public void method1181(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class1_Sub6 local8 = this.aClass1_Sub6ArrayArrayArray1[0][arg0][arg1];
		for (@Pc(10) int local10 = 0; local10 < 3; local10++) {
			@Pc(31) Class1_Sub6 local31 = this.aClass1_Sub6ArrayArrayArray1[local10][arg0][arg1] = this.aClass1_Sub6ArrayArrayArray1[local10 + 1][arg0][arg1];
			if (local31 != null) {
				local31.anInt768--;
				for (@Pc(41) int local41 = 0; local41 < local31.anInt759; local41++) {
					@Pc(47) Class26 local47 = local31.aClass26Array1[local41];
					if ((local47.anInt1087 >> 29 & 0x3) == 2 && local47.anInt1096 == arg0 && local47.anInt1088 == arg1) {
						local47.anInt1104--;
					}
				}
			}
		}
		if (this.aClass1_Sub6ArrayArrayArray1[0][arg0][arg1] == null) {
			this.aClass1_Sub6ArrayArrayArray1[0][arg0][arg1] = new Class1_Sub6(0, arg0, arg1);
		}
		this.aClass1_Sub6ArrayArrayArray1[0][arg0][arg1].aClass1_Sub6_1 = local8;
		this.aClass1_Sub6ArrayArrayArray1[3][arg0][arg1] = null;
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(IIIILclient!ha;ILclient!ha;Lclient!ha;)V")
	public void method1182(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class1_Sub1_Sub1 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class1_Sub1_Sub1 arg6, @OriginalArg(7) Class1_Sub1_Sub1 arg7) {
		@Pc(3) Class69 local3 = new Class69();
		local3.aClass1_Sub1_Sub1_8 = arg4;
		local3.anInt2595 = arg1 * 128 + 64;
		local3.anInt2597 = arg2 * 128 + 64;
		local3.anInt2593 = arg3;
		local3.anInt2592 = arg5;
		local3.aClass1_Sub1_Sub1_6 = arg6;
		local3.aClass1_Sub1_Sub1_7 = arg7;
		@Pc(34) int local34 = 0;
		@Pc(43) Class1_Sub6 local43 = this.aClass1_Sub6ArrayArrayArray1[arg0][arg1][arg2];
		if (local43 != null) {
			for (@Pc(47) int local47 = 0; local47 < local43.anInt759; local47++) {
				if ((local43.aClass26Array1[local47].anInt1101 & 0x100) == 256 && local43.aClass26Array1[local47].aClass1_Sub1_Sub1_1 instanceof Class1_Sub1_Sub1_Sub2) {
					@Pc(71) Class1_Sub1_Sub1_Sub2 local71 = (Class1_Sub1_Sub1_Sub2) local43.aClass26Array1[local47].aClass1_Sub1_Sub1_1;
					local71.method1103();
					if (local71.anInt2759 > local34) {
						local34 = local71.anInt2759;
					}
				}
			}
		}
		local3.anInt2600 = local34;
		if (this.aClass1_Sub6ArrayArrayArray1[arg0][arg1][arg2] == null) {
			this.aClass1_Sub6ArrayArrayArray1[arg0][arg1][arg2] = new Class1_Sub6(arg0, arg1, arg2);
		}
		this.aClass1_Sub6ArrayArrayArray1[arg0][arg1][arg2].aClass69_1 = local3;
	}

	@OriginalMember(owner = "client!l", name = "e", descriptor = "(IIII)V")
	public void method1183(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(8) Class1_Sub6 local8 = this.aClass1_Sub6ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 == null) {
			return;
		}
		@Pc(14) Class29 local14 = local8.aClass29_1;
		if (local14 != null) {
			@Pc(23) int local23 = arg1 * 128 + 64;
			@Pc(29) int local29 = arg2 * 128 + 64;
			local14.anInt1469 = local23 + (local14.anInt1469 - local23) * arg3 / 16;
			local14.anInt1462 = local29 + (local14.anInt1462 - local29) * arg3 / 16;
		}
	}
}
