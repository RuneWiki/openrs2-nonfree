import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ka")
public final class Class44 {

	@OriginalMember(owner = "client!ka", name = "r", descriptor = "[Lclient!bd;")
	private final Class8[] aClass8Array1 = new Class8[5000];

	@OriginalMember(owner = "client!ka", name = "q", descriptor = "I")
	private int anInt1939 = 0;

	@OriginalMember(owner = "client!ka", name = "g", descriptor = "I")
	private int anInt1931 = 0;

	@OriginalMember(owner = "client!ka", name = "M", descriptor = "[[I")
	private final int[][] anIntArrayArray32 = new int[][] { new int[16], { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 1 }, { 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0 }, { 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1 }, { 1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 1 } };

	@OriginalMember(owner = "client!ka", name = "N", descriptor = "[[I")
	private final int[][] anIntArrayArray33 = new int[][] { { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 }, { 12, 8, 4, 0, 13, 9, 5, 1, 14, 10, 6, 2, 15, 11, 7, 3 }, { 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 }, { 3, 7, 11, 15, 2, 6, 10, 14, 1, 5, 9, 13, 0, 4, 8, 12 } };

	@OriginalMember(owner = "client!ka", name = "h", descriptor = "I")
	private final int anInt1932;

	@OriginalMember(owner = "client!ka", name = "z", descriptor = "I")
	private final int anInt1945;

	@OriginalMember(owner = "client!ka", name = "K", descriptor = "I")
	private final int anInt1952;

	@OriginalMember(owner = "client!ka", name = "B", descriptor = "[[[Lclient!kh;")
	private final Class2_Sub14[][][] aClass2_Sub14ArrayArrayArray1;

	@OriginalMember(owner = "client!ka", name = "E", descriptor = "[[[I")
	private final int[][][] anIntArrayArrayArray5;

	@OriginalMember(owner = "client!ka", name = "y", descriptor = "[[[I")
	private final int[][][] anIntArrayArrayArray4;

	@OriginalMember(owner = "client!ka", name = "<init>", descriptor = "(III[[[I)V")
	public Class44(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[][][] arg3) {
		this.anInt1932 = arg0;
		this.anInt1945 = arg1;
		this.anInt1952 = arg2;
		this.aClass2_Sub14ArrayArrayArray1 = new Class2_Sub14[arg0][arg1][arg2];
		this.anIntArrayArrayArray5 = new int[arg0][arg1 + 1][arg2 + 1];
		this.anIntArrayArrayArray4 = arg3;
		this.method1246();
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(III)V")
	public void method1243(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class2_Sub14 local8 = this.aClass2_Sub14ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 != null) {
			local8.aClass63_1 = null;
		}
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(I)V")
	public void method1244(@OriginalArg(0) int arg0) {
		this.anInt1939 = arg0;
		for (@Pc(4) int local4 = 0; local4 < this.anInt1945; local4++) {
			for (@Pc(7) int local7 = 0; local7 < this.anInt1952; local7++) {
				if (this.aClass2_Sub14ArrayArrayArray1[arg0][local4][local7] == null) {
					this.aClass2_Sub14ArrayArrayArray1[arg0][local4][local7] = new Class2_Sub14(arg0, local4, local7);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lclient!lc;IIIIII)V")
	private void method1245(@OriginalArg(0) Class51 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(3) int local3 = arg0.anIntArray162.length;
		@Pc(13) int local13;
		@Pc(20) int local20;
		@Pc(27) int local27;
		@Pc(37) int local37;
		for (@Pc(5) int local5 = 0; local5 < local3; local5++) {
			local13 = arg0.anIntArray162[local5] - Static80.anInt1930;
			local20 = arg0.anIntArray170[local5] - Static80.anInt1929;
			local27 = arg0.anIntArray169[local5] - Static80.anInt1943;
			local37 = local27 * arg3 + local13 * arg4 >> 16;
			@Pc(47) int local47 = local27 * arg4 - local13 * arg3 >> 16;
			@Pc(59) int local59 = local20 * arg2 - local47 * arg1 >> 16;
			@Pc(69) int local69 = local20 * arg1 + local47 * arg2 >> 16;
			if (local69 < 50) {
				return;
			}
			if (arg0.anIntArray166 != null) {
				Static91.anIntArray167[local5] = local37;
				Static91.anIntArray158[local5] = local59;
				Static91.anIntArray159[local5] = local69;
			}
			Static91.anIntArray161[local5] = Static100.anInt2496 + (local37 << 9) / local69;
			Static91.anIntArray156[local5] = Static100.anInt2491 + (local59 << 9) / local69;
		}
		Static100.anInt2495 = 0;
		local3 = arg0.anIntArray160.length;
		for (local13 = 0; local13 < local3; local13++) {
			local20 = arg0.anIntArray160[local13];
			local27 = arg0.anIntArray168[local13];
			local37 = arg0.anIntArray157[local13];
			@Pc(142) int local142 = Static91.anIntArray161[local20];
			@Pc(146) int local146 = Static91.anIntArray161[local27];
			@Pc(150) int local150 = Static91.anIntArray161[local37];
			@Pc(154) int local154 = Static91.anIntArray156[local20];
			@Pc(158) int local158 = Static91.anIntArray156[local27];
			@Pc(162) int local162 = Static91.anIntArray156[local37];
			if ((local142 - local146) * (local162 - local158) - (local154 - local158) * (local150 - local146) > 0) {
				if (Static80.aBoolean76 && this.method1260(Static80.anInt1936, Static80.anInt1940, local154, local158, local162, local142, local146, local150)) {
					Static80.anInt1953 = arg5;
					Static80.anInt1942 = arg6;
				}
				Static100.aBoolean100 = false;
				if (local142 < 0 || local146 < 0 || local150 < 0 || local142 > Static100.anInt2498 || local146 > Static100.anInt2498 || local150 > Static100.anInt2498) {
					Static100.aBoolean100 = true;
				}
				if (arg0.anIntArray166 == null || arg0.anIntArray166[local13] == -1) {
					if (arg0.anIntArray165[local13] != 12345678) {
						Static100.method1679(local154, local158, local162, local142, local146, local150, arg0.anIntArray165[local13], arg0.anIntArray163[local13], arg0.anIntArray164[local13]);
					}
				} else if (Static80.aBoolean77) {
					@Pc(364) int local364 = Static100.anInterface1_2.method1716(arg0.anIntArray166[local13]);
					Static100.method1679(local154, local158, local162, local142, local146, local150, Static80.method1242(local364, arg0.anIntArray165[local13]), Static80.method1242(local364, arg0.anIntArray163[local13]), Static80.method1242(local364, arg0.anIntArray164[local13]));
				} else if (arg0.aBoolean86) {
					Static100.method1678(local154, local158, local162, local142, local146, local150, arg0.anIntArray165[local13], arg0.anIntArray163[local13], arg0.anIntArray164[local13], Static91.anIntArray167[0], Static91.anIntArray167[1], Static91.anIntArray167[3], Static91.anIntArray158[0], Static91.anIntArray158[1], Static91.anIntArray158[3], Static91.anIntArray159[0], Static91.anIntArray159[1], Static91.anIntArray159[3], arg0.anIntArray166[local13]);
				} else {
					Static100.method1678(local154, local158, local162, local142, local146, local150, arg0.anIntArray165[local13], arg0.anIntArray163[local13], arg0.anIntArray164[local13], Static91.anIntArray167[local20], Static91.anIntArray167[local27], Static91.anIntArray167[local37], Static91.anIntArray158[local20], Static91.anIntArray158[local27], Static91.anIntArray158[local37], Static91.anIntArray159[local20], Static91.anIntArray159[local27], Static91.anIntArray159[local37], arg0.anIntArray166[local13]);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "()V")
	public void method1246() {
		@Pc(4) int local4;
		@Pc(7) int local7;
		for (@Pc(1) int local1 = 0; local1 < this.anInt1932; local1++) {
			for (local4 = 0; local4 < this.anInt1945; local4++) {
				for (local7 = 0; local7 < this.anInt1952; local7++) {
					this.aClass2_Sub14ArrayArrayArray1[local1][local4][local7] = null;
				}
			}
		}
		for (local4 = 0; local4 < Static80.anInt1933; local4++) {
			for (local7 = 0; local7 < Static80.anIntArray134[local4]; local7++) {
				Static80.aClass21ArrayArray1[local4][local7] = null;
			}
			Static80.anIntArray134[local4] = 0;
		}
		for (local7 = 0; local7 < this.anInt1931; local7++) {
			this.aClass8Array1[local7] = null;
		}
		this.anInt1931 = 0;
		for (@Pc(76) int local76 = 0; local76 < Static80.aClass8Array2.length; local76++) {
			Static80.aClass8Array2[local76] = null;
		}
	}

	@OriginalMember(owner = "client!ka", name = "b", descriptor = "(III)I")
	public int method1247(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class2_Sub14 local8 = this.aClass2_Sub14ArrayArrayArray1[arg0][arg1][arg2];
		return local8 == null || local8.aClass82_1 == null ? 0 : local8.aClass82_1.anInt3864;
	}

	@OriginalMember(owner = "client!ka", name = "c", descriptor = "(III)Z")
	private boolean method1248(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < Static80.anInt1949; local1++) {
			@Pc(6) Class21 local6 = Static80.aClass21Array1[local1];
			@Pc(15) int local15;
			@Pc(27) int local27;
			@Pc(37) int local37;
			@Pc(47) int local47;
			@Pc(57) int local57;
			if (local6.anInt1314 == 1) {
				local15 = local6.anInt1312 - arg0;
				if (local15 > 0) {
					local27 = local6.anInt1305 + (local6.anInt1309 * local15 >> 8);
					local37 = local6.anInt1294 + (local6.anInt1298 * local15 >> 8);
					local47 = local6.anInt1295 + (local6.anInt1302 * local15 >> 8);
					local57 = local6.anInt1307 + (local6.anInt1303 * local15 >> 8);
					if (arg2 >= local27 && arg2 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt1314 == 2) {
				local15 = arg0 - local6.anInt1312;
				if (local15 > 0) {
					local27 = local6.anInt1305 + (local6.anInt1309 * local15 >> 8);
					local37 = local6.anInt1294 + (local6.anInt1298 * local15 >> 8);
					local47 = local6.anInt1295 + (local6.anInt1302 * local15 >> 8);
					local57 = local6.anInt1307 + (local6.anInt1303 * local15 >> 8);
					if (arg2 >= local27 && arg2 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt1314 == 3) {
				local15 = local6.anInt1305 - arg2;
				if (local15 > 0) {
					local27 = local6.anInt1312 + (local6.anInt1313 * local15 >> 8);
					local37 = local6.anInt1300 + (local6.anInt1311 * local15 >> 8);
					local47 = local6.anInt1295 + (local6.anInt1302 * local15 >> 8);
					local57 = local6.anInt1307 + (local6.anInt1303 * local15 >> 8);
					if (arg0 >= local27 && arg0 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt1314 == 4) {
				local15 = arg2 - local6.anInt1305;
				if (local15 > 0) {
					local27 = local6.anInt1312 + (local6.anInt1313 * local15 >> 8);
					local37 = local6.anInt1300 + (local6.anInt1311 * local15 >> 8);
					local47 = local6.anInt1295 + (local6.anInt1302 * local15 >> 8);
					local57 = local6.anInt1307 + (local6.anInt1303 * local15 >> 8);
					if (arg0 >= local27 && arg0 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt1314 == 5) {
				local15 = arg1 - local6.anInt1295;
				if (local15 > 0) {
					local27 = local6.anInt1312 + (local6.anInt1313 * local15 >> 8);
					local37 = local6.anInt1300 + (local6.anInt1311 * local15 >> 8);
					local47 = local6.anInt1305 + (local6.anInt1309 * local15 >> 8);
					local57 = local6.anInt1294 + (local6.anInt1298 * local15 >> 8);
					if (arg0 >= local27 && arg0 <= local37 && arg2 >= local47 && arg2 <= local57) {
						return true;
					}
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(IIII)Z")
	private boolean method1249(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!this.method1257(arg0, arg1, arg2)) {
			return false;
		}
		@Pc(11) int local11 = arg1 << 7;
		@Pc(15) int local15 = arg2 << 7;
		@Pc(26) int local26 = this.anIntArrayArrayArray4[arg0][arg1][arg2] - 1;
		@Pc(30) int local30 = local26 - 120;
		@Pc(34) int local34 = local26 - 230;
		@Pc(38) int local38 = local26 - 238;
		if (arg3 < 16) {
			if (arg3 == 1) {
				if (local11 > Static80.anInt1930) {
					if (!this.method1248(local11, local26, local15)) {
						return false;
					}
					if (!this.method1248(local11, local26, local15 + 128)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!this.method1248(local11, local30, local15)) {
						return false;
					}
					if (!this.method1248(local11, local30, local15 + 128)) {
						return false;
					}
				}
				if (!this.method1248(local11, local34, local15)) {
					return false;
				}
				if (!this.method1248(local11, local34, local15 + 128)) {
					return false;
				}
				return true;
			}
			if (arg3 == 2) {
				if (local15 < Static80.anInt1943) {
					if (!this.method1248(local11, local26, local15 + 128)) {
						return false;
					}
					if (!this.method1248(local11 + 128, local26, local15 + 128)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!this.method1248(local11, local30, local15 + 128)) {
						return false;
					}
					if (!this.method1248(local11 + 128, local30, local15 + 128)) {
						return false;
					}
				}
				if (!this.method1248(local11, local34, local15 + 128)) {
					return false;
				}
				if (!this.method1248(local11 + 128, local34, local15 + 128)) {
					return false;
				}
				return true;
			}
			if (arg3 == 4) {
				if (local11 < Static80.anInt1930) {
					if (!this.method1248(local11 + 128, local26, local15)) {
						return false;
					}
					if (!this.method1248(local11 + 128, local26, local15 + 128)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!this.method1248(local11 + 128, local30, local15)) {
						return false;
					}
					if (!this.method1248(local11 + 128, local30, local15 + 128)) {
						return false;
					}
				}
				if (!this.method1248(local11 + 128, local34, local15)) {
					return false;
				}
				if (!this.method1248(local11 + 128, local34, local15 + 128)) {
					return false;
				}
				return true;
			}
			if (arg3 == 8) {
				if (local15 > Static80.anInt1943) {
					if (!this.method1248(local11, local26, local15)) {
						return false;
					}
					if (!this.method1248(local11 + 128, local26, local15)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!this.method1248(local11, local30, local15)) {
						return false;
					}
					if (!this.method1248(local11 + 128, local30, local15)) {
						return false;
					}
				}
				if (!this.method1248(local11, local34, local15)) {
					return false;
				}
				if (!this.method1248(local11 + 128, local34, local15)) {
					return false;
				}
				return true;
			}
		}
		if (!this.method1248(local11 + 64, local38, local15 + 64)) {
			return false;
		} else if (arg3 == 16) {
			return this.method1248(local11, local34, local15 + 128);
		} else if (arg3 == 32) {
			return this.method1248(local11 + 128, local34, local15 + 128);
		} else if (arg3 == 64) {
			return this.method1248(local11 + 128, local34, local15);
		} else if (arg3 == 128) {
			return this.method1248(local11, local34, local15);
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lclient!ha;IIIIIII)V")
	private void method1250(@OriginalArg(0) Class31 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(6) int local6;
		@Pc(7) int local7 = local6 = (arg6 << 7) - Static80.anInt1930;
		@Pc(14) int local14;
		@Pc(15) int local15 = local14 = (arg7 << 7) - Static80.anInt1943;
		@Pc(20) int local20;
		@Pc(21) int local21 = local20 = local7 + 128;
		@Pc(26) int local26;
		@Pc(27) int local27 = local26 = local15 + 128;
		@Pc(38) int local38 = this.anIntArrayArrayArray4[arg1][arg6][arg7] - Static80.anInt1929;
		@Pc(51) int local51 = this.anIntArrayArrayArray4[arg1][arg6 + 1][arg7] - Static80.anInt1929;
		@Pc(66) int local66 = this.anIntArrayArrayArray4[arg1][arg6 + 1][arg7 + 1] - Static80.anInt1929;
		@Pc(79) int local79 = this.anIntArrayArrayArray4[arg1][arg6][arg7 + 1] - Static80.anInt1929;
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
		@Pc(279) int local279 = Static100.anInt2496 + (local101 << 9) / local121;
		@Pc(287) int local287 = Static100.anInt2491 + (local123 << 9) / local121;
		@Pc(295) int local295 = Static100.anInt2496 + (local21 << 9) / local169;
		@Pc(303) int local303 = Static100.anInt2491 + (local51 << 9) / local169;
		@Pc(311) int local311 = Static100.anInt2496 + (local197 << 9) / local27;
		@Pc(319) int local319 = Static100.anInt2491 + (local66 << 9) / local27;
		@Pc(327) int local327 = Static100.anInt2496 + (local245 << 9) / local265;
		@Pc(335) int local335 = Static100.anInt2491 + (local89 << 9) / local265;
		Static100.anInt2495 = 0;
		@Pc(472) int local472;
		if ((local311 - local327) * (local303 - local335) - (local319 - local335) * (local295 - local327) > 0) {
			if (Static80.aBoolean76 && this.method1260(Static80.anInt1936, Static80.anInt1940, local319, local335, local303, local311, local327, local295)) {
				Static80.anInt1953 = arg6;
				Static80.anInt1942 = arg7;
			}
			Static100.aBoolean100 = false;
			if (local311 < 0 || local327 < 0 || local295 < 0 || local311 > Static100.anInt2498 || local327 > Static100.anInt2498 || local295 > Static100.anInt2498) {
				Static100.aBoolean100 = true;
			}
			if (arg0.anInt1450 == -1) {
				if (arg0.anInt1451 != 12345678) {
					Static100.method1679(local319, local335, local303, local311, local327, local295, arg0.anInt1451, arg0.anInt1456, arg0.anInt1447);
				}
			} else if (Static80.aBoolean77) {
				local472 = Static100.anInterface1_2.method1716(arg0.anInt1450);
				Static100.method1679(local319, local335, local303, local311, local327, local295, Static80.method1242(local472, arg0.anInt1451), Static80.method1242(local472, arg0.anInt1456), Static80.method1242(local472, arg0.anInt1447));
			} else if (arg0.aBoolean57) {
				Static100.method1678(local319, local335, local303, local311, local327, local295, arg0.anInt1451, arg0.anInt1456, arg0.anInt1447, local101, local21, local245, local123, local51, local89, local121, local169, local265, arg0.anInt1450);
			} else {
				Static100.method1678(local319, local335, local303, local311, local327, local295, arg0.anInt1451, arg0.anInt1456, arg0.anInt1447, local197, local245, local21, local66, local89, local51, local27, local265, local169, arg0.anInt1450);
			}
		}
		if ((local279 - local295) * (local335 - local303) - (local287 - local303) * (local327 - local295) <= 0) {
			return;
		}
		if (Static80.aBoolean76 && this.method1260(Static80.anInt1936, Static80.anInt1940, local287, local303, local335, local279, local295, local327)) {
			Static80.anInt1953 = arg6;
			Static80.anInt1942 = arg7;
		}
		Static100.aBoolean100 = false;
		if (local279 < 0 || local295 < 0 || local327 < 0 || local279 > Static100.anInt2498 || local295 > Static100.anInt2498 || local327 > Static100.anInt2498) {
			Static100.aBoolean100 = true;
		}
		if (arg0.anInt1450 != -1) {
			if (!Static80.aBoolean77) {
				Static100.method1678(local287, local303, local335, local279, local295, local327, arg0.anInt1455, arg0.anInt1447, arg0.anInt1456, local101, local21, local245, local123, local51, local89, local121, local169, local265, arg0.anInt1450);
				return;
			}
			local472 = Static100.anInterface1_2.method1716(arg0.anInt1450);
			Static100.method1679(local287, local303, local335, local279, local295, local327, Static80.method1242(local472, arg0.anInt1455), Static80.method1242(local472, arg0.anInt1447), Static80.method1242(local472, arg0.anInt1456));
		} else if (arg0.anInt1455 != 12345678) {
			Static100.method1679(local287, local303, local335, local279, local295, local327, arg0.anInt1455, arg0.anInt1447, arg0.anInt1456);
			return;
		}
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(IIIILclient!nd;ILclient!nd;Lclient!nd;)V")
	public void method1251(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class2_Sub3_Sub5 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class2_Sub3_Sub5 arg6, @OriginalArg(7) Class2_Sub3_Sub5 arg7) {
		@Pc(3) Class75 local3 = new Class75();
		local3.aClass2_Sub3_Sub5_7 = arg4;
		local3.anInt3456 = arg1 * 128 + 64;
		local3.anInt3452 = arg2 * 128 + 64;
		local3.anInt3454 = arg3;
		local3.anInt3455 = arg5;
		local3.aClass2_Sub3_Sub5_5 = arg6;
		local3.aClass2_Sub3_Sub5_6 = arg7;
		@Pc(34) short local34 = 0;
		@Pc(43) Class2_Sub14 local43 = this.aClass2_Sub14ArrayArrayArray1[arg0][arg1][arg2];
		if (local43 != null) {
			for (@Pc(47) int local47 = 0; local47 < local43.anInt2228; local47++) {
				if ((local43.aClass8Array3[local47].anInt331 & 0x100) == 256 && local43.aClass8Array3[local47].aClass2_Sub3_Sub5_1 instanceof Class2_Sub3_Sub5_Sub7) {
					@Pc(71) Class2_Sub3_Sub5_Sub7 local71 = (Class2_Sub3_Sub5_Sub7) local43.aClass8Array3[local47].aClass2_Sub3_Sub5_1;
					local71.method2312();
					if (local71.aShort25 < local34) {
						local34 = local71.aShort25;
					}
				}
			}
		}
		local3.anInt3457 = -local34;
		if (this.aClass2_Sub14ArrayArrayArray1[arg0][arg1][arg2] == null) {
			this.aClass2_Sub14ArrayArrayArray1[arg0][arg1][arg2] = new Class2_Sub14(arg0, arg1, arg2);
		}
		this.aClass2_Sub14ArrayArrayArray1[arg0][arg1][arg2].aClass75_1 = local3;
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lclient!mc;IIIII)V")
	private void method1252(@OriginalArg(0) Class2_Sub3_Sub5_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(1) boolean local1 = true;
		@Pc(3) int local3 = arg2;
		@Pc(7) int local7 = arg2 + arg4;
		@Pc(11) int local11 = arg3 - 1;
		@Pc(15) int local15 = arg3 + arg5;
		for (@Pc(17) int local17 = arg1; local17 <= arg1 + 1; local17++) {
			if (local17 != this.anInt1932) {
				for (@Pc(24) int local24 = local3; local24 <= local7; local24++) {
					if (local24 >= 0 && local24 < this.anInt1945) {
						for (@Pc(34) int local34 = local11; local34 <= local15; local34++) {
							if (local34 >= 0 && local34 < this.anInt1952 && (!local1 || local24 >= local7 || local34 >= local15 || local34 < arg3 && local24 != arg2)) {
								@Pc(66) Class2_Sub14 local66 = this.aClass2_Sub14ArrayArrayArray1[local17][local24][local34];
								if (local66 != null) {
									@Pc(160) int local160 = (this.anIntArrayArrayArray4[local17][local24][local34] + this.anIntArrayArrayArray4[local17][local24 + 1][local34] + this.anIntArrayArrayArray4[local17][local24][local34 + 1] + this.anIntArrayArrayArray4[local17][local24 + 1][local34 + 1]) / 4 - (this.anIntArrayArrayArray4[arg1][arg2][arg3] + this.anIntArrayArrayArray4[arg1][arg2 + 1][arg3] + this.anIntArrayArrayArray4[arg1][arg2][arg3 + 1] + this.anIntArrayArrayArray4[arg1][arg2 + 1][arg3 + 1]) / 4;
									@Pc(163) Class82 local163 = local66.aClass82_1;
									if (local163 != null) {
										@Pc(173) Class2_Sub3_Sub5_Sub3 local173;
										if (local163.aClass2_Sub3_Sub5_8 instanceof Class2_Sub3_Sub5_Sub3) {
											local173 = (Class2_Sub3_Sub5_Sub3) local163.aClass2_Sub3_Sub5_8;
											Static99.method1633(arg0, local173, (local24 - arg2) * 128 + (1 - arg4) * 64, local160, (local34 - arg3) * 128 + (1 - arg5) * 64, local1);
										}
										if (local163.aClass2_Sub3_Sub5_9 instanceof Class2_Sub3_Sub5_Sub3) {
											local173 = (Class2_Sub3_Sub5_Sub3) local163.aClass2_Sub3_Sub5_9;
											Static99.method1633(arg0, local173, (local24 - arg2) * 128 + (1 - arg4) * 64, local160, (local34 - arg3) * 128 + (1 - arg5) * 64, local1);
										}
									}
									for (@Pc(237) int local237 = 0; local237 < local66.anInt2228; local237++) {
										@Pc(243) Class8 local243 = local66.aClass8Array3[local237];
										if (local243 != null && local243.aClass2_Sub3_Sub5_1 instanceof Class2_Sub3_Sub5_Sub3) {
											@Pc(253) Class2_Sub3_Sub5_Sub3 local253 = (Class2_Sub3_Sub5_Sub3) local243.aClass2_Sub3_Sub5_1;
											@Pc(261) int local261 = local243.anInt329 + 1 - local243.anInt324;
											@Pc(269) int local269 = local243.anInt325 + 1 - local243.anInt326;
											Static99.method1633(arg0, local253, (local243.anInt324 - arg2) * 128 + (local261 - arg4) * 64, local160, (local243.anInt326 - arg3) * 128 + (local269 - arg5) * 64, local1);
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

	@OriginalMember(owner = "client!ka", name = "b", descriptor = "()V")
	public void method1254() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt1931; local1++) {
			@Pc(7) Class8 local7 = this.aClass8Array1[local1];
			this.method1284(local7);
			this.aClass8Array1[local1] = null;
		}
		this.anInt1931 = 0;
	}

	@OriginalMember(owner = "client!ka", name = "d", descriptor = "(III)I")
	public int method1255(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class2_Sub14 local8 = this.aClass2_Sub14ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 == null) {
			return 0;
		}
		for (@Pc(14) int local14 = 0; local14 < local8.anInt2228; local14++) {
			@Pc(20) Class8 local20 = local8.aClass8Array3[local14];
			if ((local20.anInt327 >> 29 & 0x3) == 2 && local20.anInt324 == arg1 && local20.anInt326 == arg2) {
				return local20.anInt327;
			}
		}
		return 0;
	}

	@OriginalMember(owner = "client!ka", name = "e", descriptor = "(III)Lclient!bd;")
	public Class8 method1256(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class2_Sub14 local8 = this.aClass2_Sub14ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 == null) {
			return null;
		}
		for (@Pc(14) int local14 = 0; local14 < local8.anInt2228; local14++) {
			@Pc(20) Class8 local20 = local8.aClass8Array3[local14];
			if ((local20.anInt327 >> 29 & 0x3) == 2 && local20.anInt324 == arg1 && local20.anInt326 == arg2) {
				return local20;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!ka", name = "f", descriptor = "(III)Z")
	private boolean method1257(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) int local8 = this.anIntArrayArrayArray5[arg0][arg1][arg2];
		if (local8 == -Static80.anInt1944) {
			return false;
		} else if (local8 == Static80.anInt1944) {
			return true;
		} else {
			@Pc(23) int local23 = arg1 << 7;
			@Pc(27) int local27 = arg2 << 7;
			if (this.method1248(local23 + 1, this.anIntArrayArrayArray4[arg0][arg1][arg2], local27 + 1) && this.method1248(local23 + 128 - 1, this.anIntArrayArrayArray4[arg0][arg1 + 1][arg2], local27 + 1) && this.method1248(local23 + 128 - 1, this.anIntArrayArrayArray4[arg0][arg1 + 1][arg2 + 1], local27 + 128 - 1) && this.method1248(local23 + 1, this.anIntArrayArrayArray4[arg0][arg1][arg2 + 1], local27 + 128 - 1)) {
				this.anIntArrayArrayArray5[arg0][arg1][arg2] = Static80.anInt1944;
				return true;
			} else {
				this.anIntArrayArrayArray5[arg0][arg1][arg2] = -Static80.anInt1944;
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lclient!mc;III)V")
	private void method1258(@OriginalArg(0) Class2_Sub3_Sub5_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(14) Class2_Sub14 local14;
		@Pc(29) Class2_Sub3_Sub5_Sub3 local29;
		if (arg2 < this.anInt1945) {
			local14 = this.aClass2_Sub14ArrayArrayArray1[arg1][arg2 + 1][arg3];
			if (local14 != null && local14.aClass63_1 != null && local14.aClass63_1.aClass2_Sub3_Sub5_4 instanceof Class2_Sub3_Sub5_Sub3) {
				local29 = (Class2_Sub3_Sub5_Sub3) local14.aClass63_1.aClass2_Sub3_Sub5_4;
				Static99.method1633(arg0, local29, 128, 0, 0, true);
			}
		}
		if (arg3 < this.anInt1945) {
			local14 = this.aClass2_Sub14ArrayArrayArray1[arg1][arg2][arg3 + 1];
			if (local14 != null && local14.aClass63_1 != null && local14.aClass63_1.aClass2_Sub3_Sub5_4 instanceof Class2_Sub3_Sub5_Sub3) {
				local29 = (Class2_Sub3_Sub5_Sub3) local14.aClass63_1.aClass2_Sub3_Sub5_4;
				Static99.method1633(arg0, local29, 0, 0, 128, true);
			}
		}
		if (arg2 < this.anInt1945 && arg3 < this.anInt1952) {
			local14 = this.aClass2_Sub14ArrayArrayArray1[arg1][arg2 + 1][arg3 + 1];
			if (local14 != null && local14.aClass63_1 != null && local14.aClass63_1.aClass2_Sub3_Sub5_4 instanceof Class2_Sub3_Sub5_Sub3) {
				local29 = (Class2_Sub3_Sub5_Sub3) local14.aClass63_1.aClass2_Sub3_Sub5_4;
				Static99.method1633(arg0, local29, 128, 0, 128, true);
			}
		}
		if (arg2 >= this.anInt1945 || arg3 <= 0) {
			return;
		}
		local14 = this.aClass2_Sub14ArrayArrayArray1[arg1][arg2 + 1][arg3 - 1];
		if (local14 != null && local14.aClass63_1 != null && local14.aClass63_1.aClass2_Sub3_Sub5_4 instanceof Class2_Sub3_Sub5_Sub3) {
			local29 = (Class2_Sub3_Sub5_Sub3) local14.aClass63_1.aClass2_Sub3_Sub5_4;
			Static99.method1633(arg0, local29, 128, 0, -128, true);
		}
	}

	@OriginalMember(owner = "client!ka", name = "b", descriptor = "(II)V")
	public void method1259(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class2_Sub14 local8 = this.aClass2_Sub14ArrayArrayArray1[0][arg0][arg1];
		for (@Pc(10) int local10 = 0; local10 < 3; local10++) {
			@Pc(31) Class2_Sub14 local31 = this.aClass2_Sub14ArrayArrayArray1[local10][arg0][arg1] = this.aClass2_Sub14ArrayArrayArray1[local10 + 1][arg0][arg1];
			if (local31 != null) {
				local31.anInt2224--;
				for (@Pc(41) int local41 = 0; local41 < local31.anInt2228; local41++) {
					@Pc(47) Class8 local47 = local31.aClass8Array3[local41];
					if ((local47.anInt327 >> 29 & 0x3) == 2 && local47.anInt324 == arg0 && local47.anInt326 == arg1) {
						local47.anInt328--;
					}
				}
			}
		}
		if (this.aClass2_Sub14ArrayArrayArray1[0][arg0][arg1] == null) {
			this.aClass2_Sub14ArrayArrayArray1[0][arg0][arg1] = new Class2_Sub14(0, arg0, arg1);
		}
		this.aClass2_Sub14ArrayArrayArray1[0][arg0][arg1].aClass2_Sub14_1 = local8;
		this.aClass2_Sub14ArrayArrayArray1[3][arg0][arg1] = null;
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(IIIIIIII)Z")
	private boolean method1260(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
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

	@OriginalMember(owner = "client!ka", name = "g", descriptor = "(III)V")
	public void method1261(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		Static80.aBoolean76 = true;
		Static80.anInt1947 = arg0;
		Static80.anInt1936 = arg1;
		Static80.anInt1940 = arg2;
		Static80.anInt1953 = -1;
		Static80.anInt1942 = -1;
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(IIIIII)V")
	public void method1262(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (arg0 < 0) {
			arg0 = 0;
		} else if (arg0 >= this.anInt1945 * 128) {
			arg0 = this.anInt1945 * 128 - 1;
		}
		if (arg2 < 0) {
			arg2 = 0;
		} else if (arg2 >= this.anInt1952 * 128) {
			arg2 = this.anInt1952 * 128 - 1;
		}
		Static80.anInt1944++;
		Static80.anInt1937 = Class2_Sub3_Sub2_Sub2.anIntArray208[arg3];
		Static80.anInt1938 = Class2_Sub3_Sub2_Sub2.anIntArray207[arg3];
		Static80.anInt1926 = Class2_Sub3_Sub2_Sub2.anIntArray208[arg4];
		Static80.anInt1935 = Class2_Sub3_Sub2_Sub2.anIntArray207[arg4];
		Static80.aBooleanArrayArray1 = Static80.aBooleanArrayArrayArrayArray1[(arg3 - 128) / 32][arg4 / 64];
		Static80.anInt1930 = arg0;
		Static80.anInt1929 = arg1;
		Static80.anInt1943 = arg2;
		Static80.anInt1950 = arg0 / 128;
		Static80.anInt1951 = arg2 / 128;
		Static80.anInt1927 = arg5;
		Static80.anInt1946 = Static80.anInt1950 - Static80.anInt1941;
		if (Static80.anInt1946 < 0) {
			Static80.anInt1946 = 0;
		}
		Static80.anInt1954 = Static80.anInt1951 - Static80.anInt1941;
		if (Static80.anInt1954 < 0) {
			Static80.anInt1954 = 0;
		}
		Static80.anInt1948 = Static80.anInt1950 + Static80.anInt1941;
		if (Static80.anInt1948 > this.anInt1945) {
			Static80.anInt1948 = this.anInt1945;
		}
		Static80.anInt1928 = Static80.anInt1951 + Static80.anInt1941;
		if (Static80.anInt1928 > this.anInt1952) {
			Static80.anInt1928 = this.anInt1952;
		}
		this.method1270();
		Static80.anInt1934 = 0;
		@Pc(136) int local136;
		@Pc(139) int local139;
		for (@Pc(128) int local128 = this.anInt1939; local128 < this.anInt1932; local128++) {
			@Pc(134) Class2_Sub14[][] local134 = this.aClass2_Sub14ArrayArrayArray1[local128];
			for (local136 = Static80.anInt1946; local136 < Static80.anInt1948; local136++) {
				for (local139 = Static80.anInt1954; local139 < Static80.anInt1928; local139++) {
					@Pc(146) Class2_Sub14 local146 = local134[local136][local139];
					if (local146 != null) {
						if (local146.anInt2233 <= arg5 && (Static80.aBooleanArrayArray1[local136 + Static80.anInt1941 - Static80.anInt1950][local139 + Static80.anInt1941 - Static80.anInt1951] || this.anIntArrayArrayArray4[local128][local136][local139] - arg1 >= 2000)) {
							local146.aBoolean83 = true;
							local146.aBoolean82 = true;
							if (local146.anInt2228 > 0) {
								local146.aBoolean84 = true;
							} else {
								local146.aBoolean84 = false;
							}
							Static80.anInt1934++;
						} else {
							local146.aBoolean83 = false;
							local146.aBoolean82 = false;
							local146.anInt2232 = 0;
						}
					}
				}
			}
		}
		@Pc(242) int local242;
		@Pc(251) int local251;
		@Pc(256) int local256;
		@Pc(260) int local260;
		@Pc(238) int local238;
		for (@Pc(224) int local224 = this.anInt1939; local224 < this.anInt1932; local224++) {
			@Pc(230) Class2_Sub14[][] local230 = this.aClass2_Sub14ArrayArrayArray1[local224];
			for (local139 = -Static80.anInt1941; local139 <= 0; local139++) {
				local238 = Static80.anInt1950 + local139;
				local242 = Static80.anInt1950 - local139;
				if (local238 >= Static80.anInt1946 || local242 < Static80.anInt1948) {
					for (local251 = -Static80.anInt1941; local251 <= 0; local251++) {
						local256 = Static80.anInt1951 + local251;
						local260 = Static80.anInt1951 - local251;
						@Pc(272) Class2_Sub14 local272;
						if (local238 >= Static80.anInt1946) {
							if (local256 >= Static80.anInt1954) {
								local272 = local230[local238][local256];
								if (local272 != null && local272.aBoolean83) {
									this.method1291(local272, true);
								}
							}
							if (local260 < Static80.anInt1928) {
								local272 = local230[local238][local260];
								if (local272 != null && local272.aBoolean83) {
									this.method1291(local272, true);
								}
							}
						}
						if (local242 < Static80.anInt1948) {
							if (local256 >= Static80.anInt1954) {
								local272 = local230[local242][local256];
								if (local272 != null && local272.aBoolean83) {
									this.method1291(local272, true);
								}
							}
							if (local260 < Static80.anInt1928) {
								local272 = local230[local242][local260];
								if (local272 != null && local272.aBoolean83) {
									this.method1291(local272, true);
								}
							}
						}
						if (Static80.anInt1934 == 0) {
							Static80.aBoolean76 = false;
							return;
						}
					}
				}
			}
		}
		for (local136 = this.anInt1939; local136 < this.anInt1932; local136++) {
			@Pc(363) Class2_Sub14[][] local363 = this.aClass2_Sub14ArrayArrayArray1[local136];
			for (local238 = -Static80.anInt1941; local238 <= 0; local238++) {
				local242 = Static80.anInt1950 + local238;
				local251 = Static80.anInt1950 - local238;
				if (local242 >= Static80.anInt1946 || local251 < Static80.anInt1948) {
					for (local256 = -Static80.anInt1941; local256 <= 0; local256++) {
						local260 = Static80.anInt1951 + local256;
						@Pc(393) int local393 = Static80.anInt1951 - local256;
						@Pc(405) Class2_Sub14 local405;
						if (local242 >= Static80.anInt1946) {
							if (local260 >= Static80.anInt1954) {
								local405 = local363[local242][local260];
								if (local405 != null && local405.aBoolean83) {
									this.method1291(local405, false);
								}
							}
							if (local393 < Static80.anInt1928) {
								local405 = local363[local242][local393];
								if (local405 != null && local405.aBoolean83) {
									this.method1291(local405, false);
								}
							}
						}
						if (local251 < Static80.anInt1948) {
							if (local260 >= Static80.anInt1954) {
								local405 = local363[local251][local260];
								if (local405 != null && local405.aBoolean83) {
									this.method1291(local405, false);
								}
							}
							if (local393 < Static80.anInt1928) {
								local405 = local363[local251][local393];
								if (local405 != null && local405.aBoolean83) {
									this.method1291(local405, false);
								}
							}
						}
						if (Static80.anInt1934 == 0) {
							Static80.aBoolean76 = false;
							return;
						}
					}
				}
			}
		}
		Static80.aBoolean76 = false;
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(IIIILclient!nd;Lclient!nd;IIIIII)V")
	public void method1263(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class2_Sub3_Sub5 arg4, @OriginalArg(5) Class2_Sub3_Sub5 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11) {
		if (arg4 == null) {
			return;
		}
		@Pc(6) Class49 local6 = new Class49();
		local6.anInt2258 = arg10;
		local6.anInt2257 = arg11;
		local6.anInt2264 = arg1 * 128 + 64;
		local6.anInt2269 = arg2 * 128 + 64;
		local6.anInt2262 = arg3;
		local6.aClass2_Sub3_Sub5_2 = arg4;
		local6.aClass2_Sub3_Sub5_3 = arg5;
		local6.anInt2263 = arg6;
		local6.anInt2265 = arg7;
		local6.anInt2256 = arg8;
		local6.anInt2260 = arg9;
		for (@Pc(49) int local49 = arg0; local49 >= 0; local49--) {
			if (this.aClass2_Sub14ArrayArrayArray1[local49][arg1][arg2] == null) {
				this.aClass2_Sub14ArrayArrayArray1[local49][arg1][arg2] = new Class2_Sub14(local49, arg1, arg2);
			}
		}
		this.aClass2_Sub14ArrayArrayArray1[arg0][arg1][arg2].aClass49_1 = local6;
	}

	@OriginalMember(owner = "client!ka", name = "h", descriptor = "(III)I")
	public int method1264(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class2_Sub14 local8 = this.aClass2_Sub14ArrayArrayArray1[arg0][arg1][arg2];
		return local8 == null || local8.aClass63_1 == null ? 0 : local8.aClass63_1.anInt2818;
	}

	@OriginalMember(owner = "client!ka", name = "i", descriptor = "(III)V")
	public void method1265(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class2_Sub14 local8 = this.aClass2_Sub14ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 != null) {
			local8.aClass82_1 = null;
		}
	}

	@OriginalMember(owner = "client!ka", name = "b", descriptor = "(IIIIII)Z")
	private boolean method1266(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(17) int local17;
		@Pc(21) int local21;
		if (arg1 != arg2 || arg3 != arg4) {
			for (local17 = arg1; local17 <= arg2; local17++) {
				for (local21 = arg3; local21 <= arg4; local21++) {
					if (this.anIntArrayArrayArray5[arg0][local17][local21] == -Static80.anInt1944) {
						return false;
					}
				}
			}
			local21 = (arg1 << 7) + 1;
			@Pc(156) int local156 = (arg3 << 7) + 2;
			@Pc(167) int local167 = this.anIntArrayArrayArray4[arg0][arg1][arg3] + arg5;
			if (!this.method1248(local21, local167, local156)) {
				return false;
			}
			@Pc(181) int local181 = (arg2 << 7) - 1;
			if (!this.method1248(local181, local167, local156)) {
				return false;
			}
			@Pc(195) int local195 = (arg4 << 7) - 1;
			if (!this.method1248(local21, local167, local195)) {
				return false;
			} else if (this.method1248(local181, local167, local195)) {
				return true;
			} else {
				return false;
			}
		} else if (this.method1257(arg0, arg1, arg3)) {
			local17 = arg1 << 7;
			local21 = arg3 << 7;
			return this.method1248(local17 + 1, this.anIntArrayArrayArray4[arg0][arg1][arg3] + arg5, local21 + 1) && this.method1248(local17 + 128 - 1, this.anIntArrayArrayArray4[arg0][arg1 + 1][arg3] + arg5, local21 + 1) && this.method1248(local17 + 128 - 1, this.anIntArrayArrayArray4[arg0][arg1 + 1][arg3 + 1] + arg5, local21 + 128 - 1) && this.method1248(local17 + 1, this.anIntArrayArrayArray4[arg0][arg1][arg3 + 1] + arg5, local21 + 128 - 1);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(IIIIILclient!nd;IIZ)Z")
	public boolean method1267(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class2_Sub3_Sub5 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8) {
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
		return this.method1269(arg0, local7, local11, local15 + 1 - local7, local19 - local11 + 1, arg1, arg2, arg3, arg5, arg6, true, arg7, 0);
	}

	@OriginalMember(owner = "client!ka", name = "j", descriptor = "(III)Lclient!og;")
	public Class63 method1268(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class2_Sub14 local8 = this.aClass2_Sub14ArrayArrayArray1[arg0][arg1][arg2];
		return local8 == null || local8.aClass63_1 == null ? null : local8.aClass63_1;
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(IIIIIIIILclient!nd;IZII)Z")
	private boolean method1269(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) Class2_Sub3_Sub5 arg8, @OriginalArg(9) int arg9, @OriginalArg(10) boolean arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12) {
		for (@Pc(1) int local1 = arg1; local1 < arg1 + arg3; local1++) {
			for (@Pc(4) int local4 = arg2; local4 < arg2 + arg4; local4++) {
				if (local1 < 0 || local4 < 0 || local1 >= this.anInt1945 || local4 >= this.anInt1952) {
					return false;
				}
				@Pc(28) Class2_Sub14 local28 = this.aClass2_Sub14ArrayArrayArray1[arg0][local1][local4];
				if (local28 != null && local28.anInt2228 >= 5) {
					return false;
				}
			}
		}
		@Pc(52) Class8 local52 = new Class8();
		local52.anInt327 = arg11;
		local52.anInt331 = arg12;
		local52.anInt328 = arg0;
		local52.anInt321 = arg5;
		local52.anInt323 = arg6;
		local52.anInt332 = arg7;
		local52.aClass2_Sub3_Sub5_1 = arg8;
		local52.anInt320 = arg9;
		local52.anInt324 = arg1;
		local52.anInt326 = arg2;
		local52.anInt329 = arg1 + arg3 - 1;
		local52.anInt325 = arg2 + arg4 - 1;
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
					if (this.aClass2_Sub14ArrayArrayArray1[local130][local98][local101] == null) {
						this.aClass2_Sub14ArrayArrayArray1[local130][local98][local101] = new Class2_Sub14(local130, local98, local101);
					}
				}
				@Pc(166) Class2_Sub14 local166 = this.aClass2_Sub14ArrayArrayArray1[arg0][local98][local101];
				local166.aClass8Array3[local166.anInt2228] = local52;
				local166.anIntArray152[local166.anInt2228] = local104;
				local166.anInt2227 |= local104;
				local166.anInt2228++;
			}
		}
		if (arg10) {
			this.aClass8Array1[this.anInt1931++] = local52;
		}
		return true;
	}

	@OriginalMember(owner = "client!ka", name = "c", descriptor = "()V")
	private void method1270() {
		@Pc(3) int local3 = Static80.anIntArray134[Static80.anInt1927];
		@Pc(7) Class21[] local7 = Static80.aClass21ArrayArray1[Static80.anInt1927];
		Static80.anInt1949 = 0;
		for (@Pc(11) int local11 = 0; local11 < local3; local11++) {
			@Pc(16) Class21 local16 = local7[local11];
			@Pc(27) int local27;
			@Pc(42) int local42;
			@Pc(53) int local53;
			@Pc(85) int local85;
			@Pc(64) boolean local64;
			if (local16.anInt1301 == 1) {
				local27 = local16.anInt1299 + Static80.anInt1941 - Static80.anInt1950;
				if (local27 >= 0 && local27 <= Static80.anInt1941 + Static80.anInt1941) {
					local42 = local16.anInt1308 + Static80.anInt1941 - Static80.anInt1951;
					if (local42 < 0) {
						local42 = 0;
					}
					local53 = local16.anInt1296 + Static80.anInt1941 - Static80.anInt1951;
					if (local53 > Static80.anInt1941 + Static80.anInt1941) {
						local53 = Static80.anInt1941 + Static80.anInt1941;
					}
					local64 = false;
					while (local42 <= local53) {
						if (Static80.aBooleanArrayArray1[local27][local42++]) {
							local64 = true;
							break;
						}
					}
					if (local64) {
						local85 = Static80.anInt1930 - local16.anInt1312;
						if (local85 > 32) {
							local16.anInt1314 = 1;
						} else {
							if (local85 >= -32) {
								continue;
							}
							local16.anInt1314 = 2;
							local85 = -local85;
						}
						local16.anInt1309 = (local16.anInt1305 - Static80.anInt1943 << 8) / local85;
						local16.anInt1298 = (local16.anInt1294 - Static80.anInt1943 << 8) / local85;
						local16.anInt1302 = (local16.anInt1295 - Static80.anInt1929 << 8) / local85;
						local16.anInt1303 = (local16.anInt1307 - Static80.anInt1929 << 8) / local85;
						Static80.aClass21Array1[Static80.anInt1949++] = local16;
					}
				}
			} else if (local16.anInt1301 == 2) {
				local27 = local16.anInt1308 + Static80.anInt1941 - Static80.anInt1951;
				if (local27 >= 0 && local27 <= Static80.anInt1941 + Static80.anInt1941) {
					local42 = local16.anInt1299 + Static80.anInt1941 - Static80.anInt1950;
					if (local42 < 0) {
						local42 = 0;
					}
					local53 = local16.anInt1304 + Static80.anInt1941 - Static80.anInt1950;
					if (local53 > Static80.anInt1941 + Static80.anInt1941) {
						local53 = Static80.anInt1941 + Static80.anInt1941;
					}
					local64 = false;
					while (local42 <= local53) {
						if (Static80.aBooleanArrayArray1[local42++][local27]) {
							local64 = true;
							break;
						}
					}
					if (local64) {
						local85 = Static80.anInt1943 - local16.anInt1305;
						if (local85 > 32) {
							local16.anInt1314 = 3;
						} else {
							if (local85 >= -32) {
								continue;
							}
							local16.anInt1314 = 4;
							local85 = -local85;
						}
						local16.anInt1313 = (local16.anInt1312 - Static80.anInt1930 << 8) / local85;
						local16.anInt1311 = (local16.anInt1300 - Static80.anInt1930 << 8) / local85;
						local16.anInt1302 = (local16.anInt1295 - Static80.anInt1929 << 8) / local85;
						local16.anInt1303 = (local16.anInt1307 - Static80.anInt1929 << 8) / local85;
						Static80.aClass21Array1[Static80.anInt1949++] = local16;
					}
				}
			} else if (local16.anInt1301 == 4) {
				local27 = local16.anInt1295 - Static80.anInt1929;
				if (local27 > 128) {
					local42 = local16.anInt1308 + Static80.anInt1941 - Static80.anInt1951;
					if (local42 < 0) {
						local42 = 0;
					}
					local53 = local16.anInt1296 + Static80.anInt1941 - Static80.anInt1951;
					if (local53 > Static80.anInt1941 + Static80.anInt1941) {
						local53 = Static80.anInt1941 + Static80.anInt1941;
					}
					if (local42 <= local53) {
						@Pc(335) int local335 = local16.anInt1299 + Static80.anInt1941 - Static80.anInt1950;
						if (local335 < 0) {
							local335 = 0;
						}
						local85 = local16.anInt1304 + Static80.anInt1941 - Static80.anInt1950;
						if (local85 > Static80.anInt1941 + Static80.anInt1941) {
							local85 = Static80.anInt1941 + Static80.anInt1941;
						}
						@Pc(357) boolean local357 = false;
						label142: for (@Pc(359) int local359 = local335; local359 <= local85; local359++) {
							for (@Pc(362) int local362 = local42; local362 <= local53; local362++) {
								if (Static80.aBooleanArrayArray1[local359][local362]) {
									local357 = true;
									break label142;
								}
							}
						}
						if (local357) {
							local16.anInt1314 = 5;
							local16.anInt1313 = (local16.anInt1312 - Static80.anInt1930 << 8) / local27;
							local16.anInt1311 = (local16.anInt1300 - Static80.anInt1930 << 8) / local27;
							local16.anInt1309 = (local16.anInt1305 - Static80.anInt1943 << 8) / local27;
							local16.anInt1298 = (local16.anInt1294 - Static80.anInt1943 << 8) / local27;
							Static80.aClass21Array1[Static80.anInt1949++] = local16;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ka", name = "k", descriptor = "(III)V")
	public void method1271() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt1932; local1++) {
			for (@Pc(4) int local4 = 0; local4 < this.anInt1945; local4++) {
				for (@Pc(7) int local7 = 0; local7 < this.anInt1952; local7++) {
					@Pc(17) Class2_Sub14 local17 = this.aClass2_Sub14ArrayArrayArray1[local1][local4][local7];
					if (local17 != null) {
						@Pc(22) Class82 local22 = local17.aClass82_1;
						if (local22 != null && local22.aClass2_Sub3_Sub5_8 instanceof Class2_Sub3_Sub5_Sub3) {
							@Pc(32) Class2_Sub3_Sub5_Sub3 local32 = (Class2_Sub3_Sub5_Sub3) local22.aClass2_Sub3_Sub5_8;
							this.method1252(local32, local1, local4, local7, 1, 1);
							if (local22.aClass2_Sub3_Sub5_9 instanceof Class2_Sub3_Sub5_Sub3) {
								@Pc(48) Class2_Sub3_Sub5_Sub3 local48 = (Class2_Sub3_Sub5_Sub3) local22.aClass2_Sub3_Sub5_9;
								this.method1252(local48, local1, local4, local7, 1, 1);
								Static99.method1633(local32, local48, 0, 0, 0, false);
								local22.aClass2_Sub3_Sub5_9 = local48.method1642(local48.aShort12, local48.aShort8, -50, -10, -50, false);
							}
							local22.aClass2_Sub3_Sub5_8 = local32.method1642(local32.aShort12, local32.aShort8, -50, -10, -50, false);
						}
						@Pc(107) Class2_Sub3_Sub5_Sub3 local107;
						for (@Pc(91) int local91 = 0; local91 < local17.anInt2228; local91++) {
							@Pc(97) Class8 local97 = local17.aClass8Array3[local91];
							if (local97 != null && local97.aClass2_Sub3_Sub5_1 instanceof Class2_Sub3_Sub5_Sub3) {
								local107 = (Class2_Sub3_Sub5_Sub3) local97.aClass2_Sub3_Sub5_1;
								this.method1252(local107, local1, local4, local7, local97.anInt329 + 1 - local97.anInt324, local97.anInt325 - local97.anInt326 + 1);
								local97.aClass2_Sub3_Sub5_1 = local107.method1642(local107.aShort12, local107.aShort8, -50, -10, -50, false);
							}
						}
						@Pc(148) Class63 local148 = local17.aClass63_1;
						if (local148 != null && local148.aClass2_Sub3_Sub5_4 instanceof Class2_Sub3_Sub5_Sub3) {
							local107 = (Class2_Sub3_Sub5_Sub3) local148.aClass2_Sub3_Sub5_4;
							this.method1258(local107, local1, local4, local7);
							local148.aClass2_Sub3_Sub5_4 = local107.method1642(local107.aShort12, local107.aShort8, -50, -10, -50, false);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ka", name = "b", descriptor = "(IIII)I")
	public int method1272(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(8) Class2_Sub14 local8 = this.aClass2_Sub14ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 == null) {
			return -1;
		} else if (local8.aClass82_1 != null && local8.aClass82_1.anInt3864 == arg3) {
			return local8.aClass82_1.anInt3867 & 0xFF;
		} else if (local8.aClass49_1 != null && local8.aClass49_1.anInt2258 == arg3) {
			return local8.aClass49_1.anInt2257 & 0xFF;
		} else if (local8.aClass63_1 != null && local8.aClass63_1.anInt2818 == arg3) {
			return local8.aClass63_1.anInt2822 & 0xFF;
		} else {
			for (@Pc(56) int local56 = 0; local56 < local8.anInt2228; local56++) {
				if (local8.aClass8Array3[local56].anInt327 == arg3) {
					return local8.aClass8Array3[local56].anInt331 & 0xFF;
				}
			}
			return -1;
		}
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(IIIIIILclient!nd;III)Z")
	public boolean method1274(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class2_Sub3_Sub5 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		if (arg6 == null) {
			return true;
		} else {
			@Pc(11) int local11 = arg1 * 128 + arg4 * 64;
			@Pc(19) int local19 = arg2 * 128 + arg5 * 64;
			return this.method1269(arg0, arg1, arg2, arg4, arg5, local11, local19, arg3, arg6, arg7, false, arg8, arg9);
		}
	}

	@OriginalMember(owner = "client!ka", name = "d", descriptor = "(IIII)Z")
	private boolean method1276(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.method1257(arg0, arg1, arg2)) {
			@Pc(11) int local11 = arg1 << 7;
			@Pc(15) int local15 = arg2 << 7;
			return this.method1248(local11 + 1, this.anIntArrayArrayArray4[arg0][arg1][arg2] + arg3, local15 + 1) && this.method1248(local11 + 128 - 1, this.anIntArrayArrayArray4[arg0][arg1 + 1][arg2] + arg3, local15 + 1) && this.method1248(local11 + 128 - 1, this.anIntArrayArrayArray4[arg0][arg1 + 1][arg2 + 1] + arg3, local15 + 128 - 1) && this.method1248(local11 + 1, this.anIntArrayArrayArray4[arg0][arg1][arg2 + 1] + arg3, local15 + 128 - 1);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "([IIIIII)V")
	public void method1277(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(8) Class2_Sub14 local8 = this.aClass2_Sub14ArrayArrayArray1[arg2][arg3][arg4];
		if (local8 == null) {
			return;
		}
		@Pc(14) Class31 local14 = local8.aClass31_1;
		@Pc(24) int local24;
		if (local14 != null) {
			@Pc(19) int local19 = local14.anInt1452;
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
		@Pc(59) Class51 local59 = local8.aClass51_1;
		if (local59 == null) {
			return;
		}
		local24 = local59.anInt2278;
		@Pc(68) int local68 = local59.anInt2277;
		@Pc(71) int local71 = local59.anInt2280;
		@Pc(74) int local74 = local59.anInt2279;
		@Pc(79) int[] local79 = this.anIntArrayArray32[local24];
		@Pc(84) int[] local84 = this.anIntArrayArray33[local68];
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

	@OriginalMember(owner = "client!ka", name = "l", descriptor = "(III)Lclient!ue;")
	public Class82 method1278(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class2_Sub14 local8 = this.aClass2_Sub14ArrayArrayArray1[arg0][arg1][arg2];
		return local8 == null ? null : local8.aClass82_1;
	}

	@OriginalMember(owner = "client!ka", name = "e", descriptor = "(IIII)V")
	public void method1279(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(8) Class2_Sub14 local8 = this.aClass2_Sub14ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 == null) {
			return;
		}
		@Pc(14) Class49 local14 = local8.aClass49_1;
		if (local14 != null) {
			local14.anInt2256 = local14.anInt2256 * arg3 / 16;
			local14.anInt2260 = local14.anInt2260 * arg3 / 16;
		}
	}

	@OriginalMember(owner = "client!ka", name = "m", descriptor = "(III)V")
	public void method1280(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class2_Sub14 local8 = this.aClass2_Sub14ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 == null) {
			return;
		}
		for (@Pc(13) int local13 = 0; local13 < local8.anInt2228; local13++) {
			@Pc(19) Class8 local19 = local8.aClass8Array3[local13];
			if ((local19.anInt327 >> 29 & 0x3) == 2 && local19.anInt324 == arg1 && local19.anInt326 == arg2) {
				this.method1284(local19);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!ka", name = "n", descriptor = "(III)V")
	public void method1281(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class2_Sub14 local8 = this.aClass2_Sub14ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 != null) {
			local8.aClass75_1 = null;
		}
	}

	@OriginalMember(owner = "client!ka", name = "o", descriptor = "(III)I")
	public int method1282(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class2_Sub14 local8 = this.aClass2_Sub14ArrayArrayArray1[arg0][arg1][arg2];
		return local8 == null || local8.aClass49_1 == null ? 0 : local8.aClass49_1.anInt2258;
	}

	@OriginalMember(owner = "client!ka", name = "p", descriptor = "(III)Lclient!la;")
	public Class49 method1283(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class2_Sub14 local8 = this.aClass2_Sub14ArrayArrayArray1[arg0][arg1][arg2];
		return local8 == null ? null : local8.aClass49_1;
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lclient!bd;)V")
	private void method1284(@OriginalArg(0) Class8 arg0) {
		for (@Pc(2) int local2 = arg0.anInt324; local2 <= arg0.anInt329; local2++) {
			for (@Pc(6) int local6 = arg0.anInt326; local6 <= arg0.anInt325; local6++) {
				@Pc(17) Class2_Sub14 local17 = this.aClass2_Sub14ArrayArrayArray1[arg0.anInt328][local2][local6];
				if (local17 != null) {
					@Pc(36) int local36;
					for (@Pc(21) int local21 = 0; local21 < local17.anInt2228; local21++) {
						if (local17.aClass8Array3[local21] == arg0) {
							local17.anInt2228--;
							for (local36 = local21; local36 < local17.anInt2228; local36++) {
								local17.aClass8Array3[local36] = local17.aClass8Array3[local36 + 1];
								local17.anIntArray152[local36] = local17.anIntArray152[local36 + 1];
							}
							local17.aClass8Array3[local17.anInt2228] = null;
							break;
						}
					}
					local17.anInt2227 = 0;
					for (local36 = 0; local36 < local17.anInt2228; local36++) {
						local17.anInt2227 |= local17.anIntArray152[local36];
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ka", name = "q", descriptor = "(III)V")
	public void method1285(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class2_Sub14 local8 = this.aClass2_Sub14ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 != null) {
			local8.aClass49_1 = null;
		}
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(IIIIIIIIIIIIIIIIIIII)V")
	public void method1286(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int arg15, @OriginalArg(16) int arg16, @OriginalArg(17) int arg17, @OriginalArg(18) int arg18, @OriginalArg(19) int arg19) {
		@Pc(12) Class31 local12;
		@Pc(14) int local14;
		if (arg3 == 0) {
			local12 = new Class31(arg10, arg11, arg12, arg13, -1, arg18, false);
			for (local14 = arg0; local14 >= 0; local14--) {
				if (this.aClass2_Sub14ArrayArrayArray1[local14][arg1][arg2] == null) {
					this.aClass2_Sub14ArrayArrayArray1[local14][arg1][arg2] = new Class2_Sub14(local14, arg1, arg2);
				}
			}
			this.aClass2_Sub14ArrayArrayArray1[arg0][arg1][arg2].aClass31_1 = local12;
		} else if (arg3 == 1) {
			local12 = new Class31(arg14, arg15, arg16, arg17, arg5, arg19, arg6 == arg7 && arg6 == arg8 && arg6 == arg9);
			for (local14 = arg0; local14 >= 0; local14--) {
				if (this.aClass2_Sub14ArrayArrayArray1[local14][arg1][arg2] == null) {
					this.aClass2_Sub14ArrayArrayArray1[local14][arg1][arg2] = new Class2_Sub14(local14, arg1, arg2);
				}
			}
			this.aClass2_Sub14ArrayArrayArray1[arg0][arg1][arg2].aClass31_1 = local12;
		} else {
			@Pc(140) Class51 local140 = new Class51(arg3, arg4, arg5, arg1, arg2, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17, arg18, arg19);
			for (local14 = arg0; local14 >= 0; local14--) {
				if (this.aClass2_Sub14ArrayArrayArray1[local14][arg1][arg2] == null) {
					this.aClass2_Sub14ArrayArrayArray1[local14][arg1][arg2] = new Class2_Sub14(local14, arg1, arg2);
				}
			}
			this.aClass2_Sub14ArrayArrayArray1[arg0][arg1][arg2].aClass51_1 = local140;
		}
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(IIIILclient!nd;Lclient!nd;IIII)V")
	public void method1288(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class2_Sub3_Sub5 arg4, @OriginalArg(5) Class2_Sub3_Sub5 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		if (arg4 == null && arg5 == null) {
			return;
		}
		@Pc(8) Class82 local8 = new Class82();
		local8.anInt3864 = arg8;
		local8.anInt3867 = arg9;
		local8.anInt3865 = arg1 * 128 + 64;
		local8.anInt3874 = arg2 * 128 + 64;
		local8.anInt3871 = arg3;
		local8.aClass2_Sub3_Sub5_8 = arg4;
		local8.aClass2_Sub3_Sub5_9 = arg5;
		local8.anInt3868 = arg6;
		local8.anInt3873 = arg7;
		for (@Pc(45) int local45 = arg0; local45 >= 0; local45--) {
			if (this.aClass2_Sub14ArrayArrayArray1[local45][arg1][arg2] == null) {
				this.aClass2_Sub14ArrayArrayArray1[local45][arg1][arg2] = new Class2_Sub14(local45, arg1, arg2);
			}
		}
		this.aClass2_Sub14ArrayArrayArray1[arg0][arg1][arg2].aClass82_1 = local8;
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(IIIIILclient!nd;IIIIII)Z")
	public boolean method1289(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) Class2_Sub3_Sub5 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		return arg4 == null ? true : this.method1269(arg0, arg7, arg8, arg9 + 1 - arg7, arg10 - arg8 + 1, arg1, arg2, arg3, arg4, arg5, true, arg6, 0);
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(IIIILclient!nd;II)V")
	public void method1290(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class2_Sub3_Sub5 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (arg4 == null) {
			return;
		}
		@Pc(6) Class63 local6 = new Class63();
		local6.aClass2_Sub3_Sub5_4 = arg4;
		local6.anInt2823 = arg1 * 128 + 64;
		local6.anInt2820 = arg2 * 128 + 64;
		local6.anInt2817 = arg3;
		local6.anInt2818 = arg5;
		local6.anInt2822 = arg6;
		if (this.aClass2_Sub14ArrayArrayArray1[arg0][arg1][arg2] == null) {
			this.aClass2_Sub14ArrayArrayArray1[arg0][arg1][arg2] = new Class2_Sub14(arg0, arg1, arg2);
		}
		this.aClass2_Sub14ArrayArrayArray1[arg0][arg1][arg2].aClass63_1 = local6;
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lclient!kh;Z)V")
	private void method1291(@OriginalArg(0) Class2_Sub14 arg0, @OriginalArg(1) boolean arg1) {
		Static80.aClass84_4.method2701(arg0);
		while (true) {
			@Pc(8) Class2_Sub14 local8;
			@Pc(17) int local17;
			@Pc(20) int local20;
			@Pc(23) int local23;
			@Pc(26) int local26;
			@Pc(31) Class2_Sub14[][] local31;
			@Pc(49) Class2_Sub14 local49;
			@Pc(251) int local251;
			@Pc(592) int local592;
			@Pc(597) int local597;
			@Pc(602) int local602;
			@Pc(919) Class82 local919;
			@Pc(1093) int local1093;
			@Pc(978) int local978;
			do {
				do {
					do {
						do {
							do {
								do {
									while (true) {
										@Pc(257) Class8 var12;
										@Pc(605) int var17;
										@Pc(614) int var18;
										@Pc(626) int var19;
										@Pc(345) int var21;
										@Pc(289) boolean var22;
										@Pc(800) Class2_Sub14 var33;
										while (true) {
											do {
												local8 = (Class2_Sub14) Static80.aClass84_4.method2703();
												if (local8 == null) {
													return;
												}
											} while (!local8.aBoolean82);
											local17 = local8.anInt2234;
											local20 = local8.anInt2223;
											local23 = local8.anInt2224;
											local26 = local8.anInt2230;
											local31 = this.aClass2_Sub14ArrayArrayArray1[local23];
											if (!local8.aBoolean83) {
												break;
											}
											if (arg1) {
												if (local23 > 0) {
													local49 = this.aClass2_Sub14ArrayArrayArray1[local23 - 1][local17][local20];
													if (local49 != null && local49.aBoolean82) {
														continue;
													}
												}
												if (local17 <= Static80.anInt1950 && local17 > Static80.anInt1946) {
													local49 = local31[local17 - 1][local20];
													if (local49 != null && local49.aBoolean82 && (local49.aBoolean83 || (local8.anInt2227 & 0x1) == 0)) {
														continue;
													}
												}
												if (local17 >= Static80.anInt1950 && local17 < Static80.anInt1948 - 1) {
													local49 = local31[local17 + 1][local20];
													if (local49 != null && local49.aBoolean82 && (local49.aBoolean83 || (local8.anInt2227 & 0x4) == 0)) {
														continue;
													}
												}
												if (local20 <= Static80.anInt1951 && local20 > Static80.anInt1954) {
													local49 = local31[local17][local20 - 1];
													if (local49 != null && local49.aBoolean82 && (local49.aBoolean83 || (local8.anInt2227 & 0x8) == 0)) {
														continue;
													}
												}
												if (local20 >= Static80.anInt1951 && local20 < Static80.anInt1928 - 1) {
													local49 = local31[local17][local20 + 1];
													if (local49 != null && local49.aBoolean82 && (local49.aBoolean83 || (local8.anInt2227 & 0x2) == 0)) {
														continue;
													}
												}
											} else {
												arg1 = true;
											}
											local8.aBoolean83 = false;
											if (local8.aClass2_Sub14_1 != null) {
												local49 = local8.aClass2_Sub14_1;
												if (local49.aClass31_1 == null) {
													if (local49.aClass51_1 != null && !this.method1257(0, local17, local20)) {
														this.method1245(local49.aClass51_1, Static80.anInt1937, Static80.anInt1938, Static80.anInt1926, Static80.anInt1935, local17, local20);
													}
												} else if (!this.method1257(0, local17, local20)) {
													this.method1250(local49.aClass31_1, 0, Static80.anInt1937, Static80.anInt1938, Static80.anInt1926, Static80.anInt1935, local17, local20);
												}
												@Pc(225) Class82 local225 = local49.aClass82_1;
												if (local225 != null) {
													local225.aClass2_Sub3_Sub5_8.method2297(0, Static80.anInt1937, Static80.anInt1938, Static80.anInt1926, Static80.anInt1935, local225.anInt3865 - Static80.anInt1930, local225.anInt3871 - Static80.anInt1929, local225.anInt3874 - Static80.anInt1943, local225.anInt3864);
												}
												for (local251 = 0; local251 < local49.anInt2228; local251++) {
													var12 = local49.aClass8Array3[local251];
													if (var12 != null) {
														var12.aClass2_Sub3_Sub5_1.method2297(var12.anInt320, Static80.anInt1937, Static80.anInt1938, Static80.anInt1926, Static80.anInt1935, var12.anInt321 - Static80.anInt1930, var12.anInt332 - Static80.anInt1929, var12.anInt323 - Static80.anInt1943, var12.anInt327);
													}
												}
											}
											var22 = false;
											if (local8.aClass31_1 == null) {
												if (local8.aClass51_1 != null && !this.method1257(local26, local17, local20)) {
													var22 = true;
													this.method1245(local8.aClass51_1, Static80.anInt1937, Static80.anInt1938, Static80.anInt1926, Static80.anInt1935, local17, local20);
												}
											} else if (!this.method1257(local26, local17, local20)) {
												var22 = true;
												if (local8.aClass31_1.anInt1451 != 12345678 || Static80.aBoolean76 && local23 <= Static80.anInt1947) {
													this.method1250(local8.aClass31_1, local26, Static80.anInt1937, Static80.anInt1938, Static80.anInt1926, Static80.anInt1935, local17, local20);
												}
											}
											var21 = 0;
											local251 = 0;
											@Pc(350) Class82 local350 = local8.aClass82_1;
											@Pc(353) Class49 local353 = local8.aClass49_1;
											if (local350 != null || local353 != null) {
												if (Static80.anInt1950 == local17) {
													var21++;
												} else if (Static80.anInt1950 < local17) {
													var21 += 2;
												}
												if (Static80.anInt1951 == local20) {
													var21 += 3;
												} else if (Static80.anInt1951 > local20) {
													var21 += 6;
												}
												local251 = Static80.anIntArray141[var21];
												local8.anInt2231 = Static80.anIntArray136[var21];
											}
											if (local350 != null) {
												if ((local350.anInt3868 & Static80.anIntArray137[var21]) == 0) {
													local8.anInt2232 = 0;
												} else if (local350.anInt3868 == 16) {
													local8.anInt2232 = 3;
													local8.anInt2229 = Static80.anIntArray139[var21];
													local8.anInt2225 = 3 - local8.anInt2229;
												} else if (local350.anInt3868 == 32) {
													local8.anInt2232 = 6;
													local8.anInt2229 = Static80.anIntArray138[var21];
													local8.anInt2225 = 6 - local8.anInt2229;
												} else if (local350.anInt3868 == 64) {
													local8.anInt2232 = 12;
													local8.anInt2229 = Static80.anIntArray140[var21];
													local8.anInt2225 = 12 - local8.anInt2229;
												} else {
													local8.anInt2232 = 9;
													local8.anInt2229 = Static80.anIntArray135[var21];
													local8.anInt2225 = 9 - local8.anInt2229;
												}
												if ((local350.anInt3868 & local251) != 0 && !this.method1249(local26, local17, local20, local350.anInt3868)) {
													local350.aClass2_Sub3_Sub5_8.method2297(0, Static80.anInt1937, Static80.anInt1938, Static80.anInt1926, Static80.anInt1935, local350.anInt3865 - Static80.anInt1930, local350.anInt3871 - Static80.anInt1929, local350.anInt3874 - Static80.anInt1943, local350.anInt3864);
												}
												if ((local350.anInt3873 & local251) != 0 && !this.method1249(local26, local17, local20, local350.anInt3873)) {
													local350.aClass2_Sub3_Sub5_9.method2297(0, Static80.anInt1937, Static80.anInt1938, Static80.anInt1926, Static80.anInt1935, local350.anInt3865 - Static80.anInt1930, local350.anInt3871 - Static80.anInt1929, local350.anInt3874 - Static80.anInt1943, local350.anInt3864);
												}
											}
											if (local353 != null && !this.method1276(local26, local17, local20, local353.aClass2_Sub3_Sub5_2.aShort25)) {
												if ((local353.anInt2263 & local251) != 0) {
													local353.aClass2_Sub3_Sub5_2.method2297(0, Static80.anInt1937, Static80.anInt1938, Static80.anInt1926, Static80.anInt1935, local353.anInt2264 + local353.anInt2256 - Static80.anInt1930, local353.anInt2262 - Static80.anInt1929, local353.anInt2269 + local353.anInt2260 - Static80.anInt1943, local353.anInt2258);
												} else if (local353.anInt2263 == 256) {
													local592 = local353.anInt2264 - Static80.anInt1930;
													local597 = local353.anInt2262 - Static80.anInt1929;
													local602 = local353.anInt2269 - Static80.anInt1943;
													var17 = local353.anInt2265;
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
														local353.aClass2_Sub3_Sub5_2.method2297(0, Static80.anInt1937, Static80.anInt1938, Static80.anInt1926, Static80.anInt1935, local592 + local353.anInt2256, local597, local602 + local353.anInt2260, local353.anInt2258);
													} else if (local353.aClass2_Sub3_Sub5_3 != null) {
														local353.aClass2_Sub3_Sub5_3.method2297(0, Static80.anInt1937, Static80.anInt1938, Static80.anInt1926, Static80.anInt1935, local592, local597, local602, local353.anInt2258);
													}
												}
											}
											if (var22) {
												@Pc(673) Class63 local673 = local8.aClass63_1;
												if (local673 != null) {
													local673.aClass2_Sub3_Sub5_4.method2297(0, Static80.anInt1937, Static80.anInt1938, Static80.anInt1926, Static80.anInt1935, local673.anInt2823 - Static80.anInt1930, local673.anInt2817 - Static80.anInt1929, local673.anInt2820 - Static80.anInt1943, local673.anInt2818);
												}
												@Pc(700) Class75 local700 = local8.aClass75_1;
												if (local700 != null && local700.anInt3457 == 0) {
													if (local700.aClass2_Sub3_Sub5_5 != null) {
														local700.aClass2_Sub3_Sub5_5.method2297(0, Static80.anInt1937, Static80.anInt1938, Static80.anInt1926, Static80.anInt1935, local700.anInt3456 - Static80.anInt1930, local700.anInt3454 - Static80.anInt1929, local700.anInt3452 - Static80.anInt1943, local700.anInt3455);
													}
													if (local700.aClass2_Sub3_Sub5_6 != null) {
														local700.aClass2_Sub3_Sub5_6.method2297(0, Static80.anInt1937, Static80.anInt1938, Static80.anInt1926, Static80.anInt1935, local700.anInt3456 - Static80.anInt1930, local700.anInt3454 - Static80.anInt1929, local700.anInt3452 - Static80.anInt1943, local700.anInt3455);
													}
													if (local700.aClass2_Sub3_Sub5_7 != null) {
														local700.aClass2_Sub3_Sub5_7.method2297(0, Static80.anInt1937, Static80.anInt1938, Static80.anInt1926, Static80.anInt1935, local700.anInt3456 - Static80.anInt1930, local700.anInt3454 - Static80.anInt1929, local700.anInt3452 - Static80.anInt1943, local700.anInt3455);
													}
												}
											}
											local592 = local8.anInt2227;
											if (local592 != 0) {
												if (local17 < Static80.anInt1950 && (local592 & 0x4) != 0) {
													var33 = local31[local17 + 1][local20];
													if (var33 != null && var33.aBoolean82) {
														Static80.aClass84_4.method2701(var33);
													}
												}
												if (local20 < Static80.anInt1951 && (local592 & 0x2) != 0) {
													var33 = local31[local17][local20 + 1];
													if (var33 != null && var33.aBoolean82) {
														Static80.aClass84_4.method2701(var33);
													}
												}
												if (local17 > Static80.anInt1950 && (local592 & 0x1) != 0) {
													var33 = local31[local17 - 1][local20];
													if (var33 != null && var33.aBoolean82) {
														Static80.aClass84_4.method2701(var33);
													}
												}
												if (local20 > Static80.anInt1951 && (local592 & 0x8) != 0) {
													var33 = local31[local17][local20 - 1];
													if (var33 != null && var33.aBoolean82) {
														Static80.aClass84_4.method2701(var33);
													}
												}
											}
											break;
										}
										if (local8.anInt2232 != 0) {
											var22 = true;
											for (var21 = 0; var21 < local8.anInt2228; var21++) {
												if (local8.aClass8Array3[var21].anInt318 != Static80.anInt1944 && (local8.anIntArray152[var21] & local8.anInt2232) == local8.anInt2229) {
													var22 = false;
													break;
												}
											}
											if (var22) {
												local919 = local8.aClass82_1;
												if (!this.method1249(local26, local17, local20, local919.anInt3868)) {
													local919.aClass2_Sub3_Sub5_8.method2297(0, Static80.anInt1937, Static80.anInt1938, Static80.anInt1926, Static80.anInt1935, local919.anInt3865 - Static80.anInt1930, local919.anInt3871 - Static80.anInt1929, local919.anInt3874 - Static80.anInt1943, local919.anInt3864);
												}
												local8.anInt2232 = 0;
											}
										}
										if (!local8.aBoolean84) {
											break;
										}
										try {
											@Pc(958) int local958 = local8.anInt2228;
											local8.aBoolean84 = false;
											var21 = 0;
											label558: for (local251 = 0; local251 < local958; local251++) {
												var12 = local8.aClass8Array3[local251];
												if (var12.anInt318 != Static80.anInt1944) {
													for (local978 = var12.anInt324; local978 <= var12.anInt329; local978++) {
														for (local592 = var12.anInt326; local592 <= var12.anInt325; local592++) {
															var33 = local31[local978][local592];
															if (var33.aBoolean83) {
																local8.aBoolean84 = true;
																continue label558;
															}
															if (var33.anInt2232 != 0) {
																local602 = 0;
																if (local978 > var12.anInt324) {
																	local602++;
																}
																if (local978 < var12.anInt329) {
																	local602 += 4;
																}
																if (local592 > var12.anInt326) {
																	local602 += 8;
																}
																if (local592 < var12.anInt325) {
																	local602 += 2;
																}
																if ((local602 & var33.anInt2232) == local8.anInt2225) {
																	local8.aBoolean84 = true;
																	continue label558;
																}
															}
														}
													}
													Static80.aClass8Array2[var21++] = var12;
													local592 = Static80.anInt1950 - var12.anInt324;
													local597 = var12.anInt329 - Static80.anInt1950;
													if (local597 > local592) {
														local592 = local597;
													}
													local602 = Static80.anInt1951 - var12.anInt326;
													var17 = var12.anInt325 - Static80.anInt1951;
													if (var17 > local602) {
														var12.anInt330 = local592 + var17;
													} else {
														var12.anInt330 = local592 + local602;
													}
												}
											}
											while (var21 > 0) {
												local1093 = -50;
												local978 = -1;
												@Pc(1102) Class8 local1102;
												for (local592 = 0; local592 < var21; local592++) {
													local1102 = Static80.aClass8Array2[local592];
													if (local1102.anInt318 != Static80.anInt1944) {
														if (local1102.anInt330 > local1093) {
															local1093 = local1102.anInt330;
															local978 = local592;
														} else if (local1102.anInt330 == local1093) {
															local602 = local1102.anInt321 - Static80.anInt1930;
															var17 = local1102.anInt323 - Static80.anInt1943;
															var18 = Static80.aClass8Array2[local978].anInt321 - Static80.anInt1930;
															var19 = Static80.aClass8Array2[local978].anInt323 - Static80.anInt1943;
															if (local602 * local602 + var17 * var17 > var18 * var18 + var19 * var19) {
																local978 = local592;
															}
														}
													}
												}
												if (local978 == -1) {
													break;
												}
												local1102 = Static80.aClass8Array2[local978];
												local1102.anInt318 = Static80.anInt1944;
												if (!this.method1266(local26, local1102.anInt324, local1102.anInt329, local1102.anInt326, local1102.anInt325, local1102.aClass2_Sub3_Sub5_1.aShort25)) {
													local1102.aClass2_Sub3_Sub5_1.method2297(local1102.anInt320, Static80.anInt1937, Static80.anInt1938, Static80.anInt1926, Static80.anInt1935, local1102.anInt321 - Static80.anInt1930, local1102.anInt332 - Static80.anInt1929, local1102.anInt323 - Static80.anInt1943, local1102.anInt327);
												}
												for (local602 = local1102.anInt324; local602 <= local1102.anInt329; local602++) {
													for (var17 = local1102.anInt326; var17 <= local1102.anInt325; var17++) {
														@Pc(1227) Class2_Sub14 local1227 = local31[local602][var17];
														if (local1227.anInt2232 != 0) {
															Static80.aClass84_4.method2701(local1227);
														} else if ((local602 != local17 || var17 != local20) && local1227.aBoolean82) {
															Static80.aClass84_4.method2701(local1227);
														}
													}
												}
											}
											if (!local8.aBoolean84) {
												break;
											}
										} catch (@Pc(1265) Exception local1265) {
											local8.aBoolean84 = false;
											break;
										}
									}
								} while (!local8.aBoolean82);
							} while (local8.anInt2232 != 0);
							if (local17 > Static80.anInt1950 || local17 <= Static80.anInt1946) {
								break;
							}
							local49 = local31[local17 - 1][local20];
						} while (local49 != null && local49.aBoolean82);
						if (local17 < Static80.anInt1950 || local17 >= Static80.anInt1948 - 1) {
							break;
						}
						local49 = local31[local17 + 1][local20];
					} while (local49 != null && local49.aBoolean82);
					if (local20 > Static80.anInt1951 || local20 <= Static80.anInt1954) {
						break;
					}
					local49 = local31[local17][local20 - 1];
				} while (local49 != null && local49.aBoolean82);
				if (local20 < Static80.anInt1951 || local20 >= Static80.anInt1928 - 1) {
					break;
				}
				local49 = local31[local17][local20 + 1];
			} while (local49 != null && local49.aBoolean82);
			local8.aBoolean82 = false;
			Static80.anInt1934--;
			@Pc(1369) Class75 local1369 = local8.aClass75_1;
			if (local1369 != null && local1369.anInt3457 != 0) {
				if (local1369.aClass2_Sub3_Sub5_5 != null) {
					local1369.aClass2_Sub3_Sub5_5.method2297(0, Static80.anInt1937, Static80.anInt1938, Static80.anInt1926, Static80.anInt1935, local1369.anInt3456 - Static80.anInt1930, local1369.anInt3454 - Static80.anInt1929 - local1369.anInt3457, local1369.anInt3452 - Static80.anInt1943, local1369.anInt3455);
				}
				if (local1369.aClass2_Sub3_Sub5_6 != null) {
					local1369.aClass2_Sub3_Sub5_6.method2297(0, Static80.anInt1937, Static80.anInt1938, Static80.anInt1926, Static80.anInt1935, local1369.anInt3456 - Static80.anInt1930, local1369.anInt3454 - Static80.anInt1929 - local1369.anInt3457, local1369.anInt3452 - Static80.anInt1943, local1369.anInt3455);
				}
				if (local1369.aClass2_Sub3_Sub5_7 != null) {
					local1369.aClass2_Sub3_Sub5_7.method2297(0, Static80.anInt1937, Static80.anInt1938, Static80.anInt1926, Static80.anInt1935, local1369.anInt3456 - Static80.anInt1930, local1369.anInt3454 - Static80.anInt1929 - local1369.anInt3457, local1369.anInt3452 - Static80.anInt1943, local1369.anInt3455);
				}
			}
			if (local8.anInt2231 != 0) {
				@Pc(1464) Class49 local1464 = local8.aClass49_1;
				if (local1464 != null && !this.method1276(local26, local17, local20, local1464.aClass2_Sub3_Sub5_2.aShort25)) {
					if ((local1464.anInt2263 & local8.anInt2231) != 0) {
						local1464.aClass2_Sub3_Sub5_2.method2297(0, Static80.anInt1937, Static80.anInt1938, Static80.anInt1926, Static80.anInt1935, local1464.anInt2264 + local1464.anInt2256 - Static80.anInt1930, local1464.anInt2262 - Static80.anInt1929, local1464.anInt2269 + local1464.anInt2260 - Static80.anInt1943, local1464.anInt2258);
					} else if (local1464.anInt2263 == 256) {
						local251 = local1464.anInt2264 - Static80.anInt1930;
						local1093 = local1464.anInt2262 - Static80.anInt1929;
						local978 = local1464.anInt2269 - Static80.anInt1943;
						local592 = local1464.anInt2265;
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
							local1464.aClass2_Sub3_Sub5_2.method2297(0, Static80.anInt1937, Static80.anInt1938, Static80.anInt1926, Static80.anInt1935, local251 + local1464.anInt2256, local1093, local978 + local1464.anInt2260, local1464.anInt2258);
						} else if (local1464.aClass2_Sub3_Sub5_3 != null) {
							local1464.aClass2_Sub3_Sub5_3.method2297(0, Static80.anInt1937, Static80.anInt1938, Static80.anInt1926, Static80.anInt1935, local251, local1093, local978, local1464.anInt2258);
						}
					}
				}
				local919 = local8.aClass82_1;
				if (local919 != null) {
					if ((local919.anInt3873 & local8.anInt2231) != 0 && !this.method1249(local26, local17, local20, local919.anInt3873)) {
						local919.aClass2_Sub3_Sub5_9.method2297(0, Static80.anInt1937, Static80.anInt1938, Static80.anInt1926, Static80.anInt1935, local919.anInt3865 - Static80.anInt1930, local919.anInt3871 - Static80.anInt1929, local919.anInt3874 - Static80.anInt1943, local919.anInt3864);
					}
					if ((local919.anInt3868 & local8.anInt2231) != 0 && !this.method1249(local26, local17, local20, local919.anInt3868)) {
						local919.aClass2_Sub3_Sub5_8.method2297(0, Static80.anInt1937, Static80.anInt1938, Static80.anInt1926, Static80.anInt1935, local919.anInt3865 - Static80.anInt1930, local919.anInt3871 - Static80.anInt1929, local919.anInt3874 - Static80.anInt1943, local919.anInt3864);
					}
				}
			}
			@Pc(1689) Class2_Sub14 local1689;
			if (local23 < this.anInt1932 - 1) {
				local1689 = this.aClass2_Sub14ArrayArrayArray1[local23 + 1][local17][local20];
				if (local1689 != null && local1689.aBoolean82) {
					Static80.aClass84_4.method2701(local1689);
				}
			}
			if (local17 < Static80.anInt1950) {
				local1689 = local31[local17 + 1][local20];
				if (local1689 != null && local1689.aBoolean82) {
					Static80.aClass84_4.method2701(local1689);
				}
			}
			if (local20 < Static80.anInt1951) {
				local1689 = local31[local17][local20 + 1];
				if (local1689 != null && local1689.aBoolean82) {
					Static80.aClass84_4.method2701(local1689);
				}
			}
			if (local17 > Static80.anInt1950) {
				local1689 = local31[local17 - 1][local20];
				if (local1689 != null && local1689.aBoolean82) {
					Static80.aClass84_4.method2701(local1689);
				}
			}
			if (local20 > Static80.anInt1951) {
				local1689 = local31[local17][local20 - 1];
				if (local1689 != null && local1689.aBoolean82) {
					Static80.aClass84_4.method2701(local1689);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ka", name = "f", descriptor = "(IIII)V")
	public void method1292(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(8) Class2_Sub14 local8 = this.aClass2_Sub14ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 != null) {
			this.aClass2_Sub14ArrayArrayArray1[arg0][arg1][arg2].anInt2233 = arg3;
		}
	}
}
