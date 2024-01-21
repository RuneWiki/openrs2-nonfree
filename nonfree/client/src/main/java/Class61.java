import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qa")
public final class Class61 {

	@OriginalMember(owner = "client!qa", name = "d", descriptor = "I")
	private int anInt1938 = 0;

	@OriginalMember(owner = "client!qa", name = "A", descriptor = "[Lclient!j;")
	private final Class38[] aClass38Array2 = new Class38[5000];

	@OriginalMember(owner = "client!qa", name = "w", descriptor = "I")
	private int anInt1951 = 0;

	@OriginalMember(owner = "client!qa", name = "Q", descriptor = "[[I")
	private final int[][] anIntArrayArray19 = new int[][] { new int[16], { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 1 }, { 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0 }, { 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1 }, { 1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 1 } };

	@OriginalMember(owner = "client!qa", name = "S", descriptor = "[[I")
	private final int[][] anIntArrayArray20 = new int[][] { { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 }, { 12, 8, 4, 0, 13, 9, 5, 1, 14, 10, 6, 2, 15, 11, 7, 3 }, { 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 }, { 3, 7, 11, 15, 2, 6, 10, 14, 1, 5, 9, 13, 0, 4, 8, 12 } };

	@OriginalMember(owner = "client!qa", name = "T", descriptor = "I")
	private int anInt1961 = 0;

	@OriginalMember(owner = "client!qa", name = "R", descriptor = "[I")
	private final int[] anIntArray251 = new int[10000];

	@OriginalMember(owner = "client!qa", name = "V", descriptor = "[I")
	private final int[] anIntArray252 = new int[10000];

	@OriginalMember(owner = "client!qa", name = "y", descriptor = "I")
	private final int anInt1953;

	@OriginalMember(owner = "client!qa", name = "n", descriptor = "I")
	private final int anInt1946;

	@OriginalMember(owner = "client!qa", name = "o", descriptor = "I")
	private final int anInt1947;

	@OriginalMember(owner = "client!qa", name = "D", descriptor = "[[[Lclient!vc;")
	private final Class3_Sub11[][][] aClass3_Sub11ArrayArrayArray1;

	@OriginalMember(owner = "client!qa", name = "I", descriptor = "[[[I")
	private final int[][][] anIntArrayArrayArray21;

	@OriginalMember(owner = "client!qa", name = "N", descriptor = "[[[I")
	private final int[][][] anIntArrayArrayArray22;

	@OriginalMember(owner = "client!qa", name = "<init>", descriptor = "(III[[[I)V")
	public Class61(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[][][] arg3) {
		this.anInt1953 = arg0;
		this.anInt1946 = arg1;
		this.anInt1947 = arg2;
		this.aClass3_Sub11ArrayArrayArray1 = new Class3_Sub11[arg0][arg1][arg2];
		this.anIntArrayArrayArray21 = new int[arg0][arg1 + 1][arg2 + 1];
		this.anIntArrayArrayArray22 = arg3;
		this.method1310();
	}

	@OriginalMember(owner = "client!qa", name = "b", descriptor = "(II)V")
	public void method1301(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static84.aBoolean148 = true;
		Static84.anInt1937 = arg0;
		Static84.anInt1935 = arg1;
		Static84.anInt1949 = -1;
		Static84.anInt1941 = -1;
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lclient!jb;IIIIIII)V")
	private void method1302(@OriginalArg(0) Class39 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(6) int local6;
		@Pc(7) int local7 = local6 = (arg6 << 7) - Static84.anInt1939;
		@Pc(14) int local14;
		@Pc(15) int local15 = local14 = (arg7 << 7) - Static84.anInt1944;
		@Pc(20) int local20;
		@Pc(21) int local21 = local20 = local7 + 128;
		@Pc(26) int local26;
		@Pc(27) int local27 = local26 = local15 + 128;
		@Pc(38) int local38 = this.anIntArrayArrayArray22[arg1][arg6][arg7] - Static84.anInt1952;
		@Pc(51) int local51 = this.anIntArrayArrayArray22[arg1][arg6 + 1][arg7] - Static84.anInt1952;
		@Pc(66) int local66 = this.anIntArrayArrayArray22[arg1][arg6 + 1][arg7 + 1] - Static84.anInt1952;
		@Pc(79) int local79 = this.anIntArrayArrayArray22[arg1][arg6][arg7 + 1] - Static84.anInt1952;
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
		@Pc(279) int local279 = Static99.anInt2402 + (local101 << 9) / local121;
		@Pc(287) int local287 = Static99.anInt2403 + (local123 << 9) / local121;
		@Pc(295) int local295 = Static99.anInt2402 + (local21 << 9) / local169;
		@Pc(303) int local303 = Static99.anInt2403 + (local51 << 9) / local169;
		@Pc(311) int local311 = Static99.anInt2402 + (local197 << 9) / local27;
		@Pc(319) int local319 = Static99.anInt2403 + (local66 << 9) / local27;
		@Pc(327) int local327 = Static99.anInt2402 + (local245 << 9) / local265;
		@Pc(335) int local335 = Static99.anInt2403 + (local89 << 9) / local265;
		Static99.anInt2395 = 0;
		@Pc(472) int local472;
		if ((local311 - local327) * (local303 - local335) - (local319 - local335) * (local295 - local327) > 0) {
			Static99.aBoolean201 = false;
			if (local311 < 0 || local327 < 0 || local295 < 0 || local311 > Static99.anInt2399 || local327 > Static99.anInt2399 || local295 > Static99.anInt2399) {
				Static99.aBoolean201 = true;
			}
			if (Static84.aBoolean148 && this.method1306(Static84.anInt1937, Static84.anInt1935, local319, local335, local303, local311, local327, local295)) {
				Static84.anInt1949 = arg6;
				Static84.anInt1941 = arg7;
			}
			if (arg0.anInt1253 == -1) {
				if (arg0.anInt1252 != 12345678) {
					Static99.method1602(local319, local335, local303, local311, local327, local295, arg0.anInt1252, arg0.anInt1248, arg0.anInt1249);
				}
			} else if (Static84.aBoolean149) {
				local472 = Static99.anInterface2_1.method960(arg0.anInt1253);
				Static99.method1602(local319, local335, local303, local311, local327, local295, Static84.method1300(local472, arg0.anInt1252), Static84.method1300(local472, arg0.anInt1248), Static84.method1300(local472, arg0.anInt1249));
			} else if (arg0.aBoolean90) {
				Static99.method1604(local319, local335, local303, local311, local327, local295, arg0.anInt1252, arg0.anInt1248, arg0.anInt1249, local101, local21, local245, local123, local51, local89, local121, local169, local265, arg0.anInt1253);
			} else {
				Static99.method1604(local319, local335, local303, local311, local327, local295, arg0.anInt1252, arg0.anInt1248, arg0.anInt1249, local197, local245, local21, local66, local89, local51, local27, local265, local169, arg0.anInt1253);
			}
		}
		if ((local279 - local295) * (local335 - local303) - (local287 - local303) * (local327 - local295) <= 0) {
			return;
		}
		Static99.aBoolean201 = false;
		if (local279 < 0 || local295 < 0 || local327 < 0 || local279 > Static99.anInt2399 || local295 > Static99.anInt2399 || local327 > Static99.anInt2399) {
			Static99.aBoolean201 = true;
		}
		if (Static84.aBoolean148 && this.method1306(Static84.anInt1937, Static84.anInt1935, local287, local303, local335, local279, local295, local327)) {
			Static84.anInt1949 = arg6;
			Static84.anInt1941 = arg7;
		}
		if (arg0.anInt1253 != -1) {
			if (!Static84.aBoolean149) {
				Static99.method1604(local287, local303, local335, local279, local295, local327, arg0.anInt1256, arg0.anInt1249, arg0.anInt1248, local101, local21, local245, local123, local51, local89, local121, local169, local265, arg0.anInt1253);
				return;
			}
			local472 = Static99.anInterface2_1.method960(arg0.anInt1253);
			Static99.method1602(local287, local303, local335, local279, local295, local327, Static84.method1300(local472, arg0.anInt1256), Static84.method1300(local472, arg0.anInt1249), Static84.method1300(local472, arg0.anInt1248));
		} else if (arg0.anInt1256 != 12345678) {
			Static99.method1602(local287, local303, local335, local279, local295, local327, arg0.anInt1256, arg0.anInt1249, arg0.anInt1248);
			return;
		}
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIII)Z")
	private boolean method1303(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.method1308(arg0, arg1, arg2)) {
			@Pc(11) int local11 = arg1 << 7;
			@Pc(15) int local15 = arg2 << 7;
			return this.method1325(local11 + 1, this.anIntArrayArrayArray22[arg0][arg1][arg2] - arg3, local15 + 1) && this.method1325(local11 + 128 - 1, this.anIntArrayArrayArray22[arg0][arg1 + 1][arg2] - arg3, local15 + 1) && this.method1325(local11 + 128 - 1, this.anIntArrayArrayArray22[arg0][arg1 + 1][arg2 + 1] - arg3, local15 + 128 - 1) && this.method1325(local11 + 1, this.anIntArrayArrayArray22[arg0][arg1][arg2 + 1] - arg3, local15 + 128 - 1);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(III)I")
	public int method1304(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class3_Sub11 local8 = this.aClass3_Sub11ArrayArrayArray1[arg0][arg1][arg2];
		return local8 == null || local8.aClass43_1 == null ? 0 : local8.aClass43_1.anInt1401;
	}

	@OriginalMember(owner = "client!qa", name = "b", descriptor = "(III)V")
	public void method1305(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class3_Sub11 local8 = this.aClass3_Sub11ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 != null) {
			local8.aClass48_1 = null;
		}
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIIIIIII)Z")
	private boolean method1306(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
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

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lclient!hc;Lclient!hc;IIIZ)V")
	private void method1307(@OriginalArg(0) Class3_Sub1_Sub1_Sub4 arg0, @OriginalArg(1) Class3_Sub1_Sub1_Sub4 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		arg1.method780();
		this.anInt1961++;
		@Pc(9) int local9 = 0;
		@Pc(12) int[] local12 = arg1.anIntArray129;
		@Pc(15) int local15 = arg1.anInt1115;
		for (@Pc(17) int local17 = 0; local17 < arg0.anInt1115; local17++) {
			@Pc(23) Class1 local23 = arg0.aClass1Array2[local17];
			@Pc(28) Class1 local28 = arg0.aClass1Array1[local17];
			if (local28.anInt5 != 0) {
				@Pc(38) int local38 = arg0.anIntArray127[local17] - arg3;
				if (local38 <= arg1.anInt1109) {
					@Pc(49) int local49 = arg0.anIntArray129[local17] - arg2;
					if (local49 >= arg1.anInt1118 && local49 <= arg1.anInt1108) {
						@Pc(65) int local65 = arg0.anIntArray130[local17] - arg4;
						if (local65 >= arg1.anInt1110 && local65 <= arg1.anInt1112) {
							for (@Pc(76) int local76 = 0; local76 < local15; local76++) {
								@Pc(82) Class1 local82 = arg1.aClass1Array2[local76];
								@Pc(87) Class1 local87 = arg1.aClass1Array1[local76];
								if (local49 == local12[local76] && local65 == arg1.anIntArray130[local76] && local38 == arg1.anIntArray127[local76] && local87.anInt5 != 0) {
									local23.anInt6 += local87.anInt6;
									local23.anInt9 += local87.anInt9;
									local23.anInt7 += local87.anInt7;
									local23.anInt5 += local87.anInt5;
									local82.anInt6 += local28.anInt6;
									local82.anInt9 += local28.anInt9;
									local82.anInt7 += local28.anInt7;
									local82.anInt5 += local28.anInt5;
									local9++;
									this.anIntArray252[local17] = this.anInt1961;
									this.anIntArray251[local76] = this.anInt1961;
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
		for (@Pc(193) int local193 = 0; local193 < arg0.anInt1116; local193++) {
			if (this.anIntArray252[arg0.anIntArray133[local193]] == this.anInt1961 && this.anIntArray252[arg0.anIntArray121[local193]] == this.anInt1961 && this.anIntArray252[arg0.anIntArray117[local193]] == this.anInt1961) {
				arg0.anIntArray119[local193] = -1;
			}
		}
		for (@Pc(236) int local236 = 0; local236 < arg1.anInt1116; local236++) {
			if (this.anIntArray251[arg1.anIntArray133[local236]] == this.anInt1961 && this.anIntArray251[arg1.anIntArray121[local236]] == this.anInt1961 && this.anIntArray251[arg1.anIntArray117[local236]] == this.anInt1961) {
				arg1.anIntArray119[local236] = -1;
			}
		}
	}

	@OriginalMember(owner = "client!qa", name = "c", descriptor = "(III)Z")
	private boolean method1308(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) int local8 = this.anIntArrayArrayArray21[arg0][arg1][arg2];
		if (local8 == -Static84.anInt1955) {
			return false;
		} else if (local8 == Static84.anInt1955) {
			return true;
		} else {
			@Pc(23) int local23 = arg1 << 7;
			@Pc(27) int local27 = arg2 << 7;
			if (this.method1325(local23 + 1, this.anIntArrayArrayArray22[arg0][arg1][arg2], local27 + 1) && this.method1325(local23 + 128 - 1, this.anIntArrayArrayArray22[arg0][arg1 + 1][arg2], local27 + 1) && this.method1325(local23 + 128 - 1, this.anIntArrayArrayArray22[arg0][arg1 + 1][arg2 + 1], local27 + 128 - 1) && this.method1325(local23 + 1, this.anIntArrayArrayArray22[arg0][arg1][arg2 + 1], local27 + 128 - 1)) {
				this.anIntArrayArrayArray21[arg0][arg1][arg2] = Static84.anInt1955;
				return true;
			} else {
				this.anIntArrayArrayArray21[arg0][arg1][arg2] = -Static84.anInt1955;
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!qa", name = "d", descriptor = "(III)Lclient!b;")
	public Class6 method1309(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class3_Sub11 local8 = this.aClass3_Sub11ArrayArrayArray1[arg0][arg1][arg2];
		return local8 == null ? null : local8.aClass6_1;
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "()V")
	public void method1310() {
		@Pc(4) int local4;
		@Pc(7) int local7;
		for (@Pc(1) int local1 = 0; local1 < this.anInt1953; local1++) {
			for (local4 = 0; local4 < this.anInt1946; local4++) {
				for (local7 = 0; local7 < this.anInt1947; local7++) {
					this.aClass3_Sub11ArrayArrayArray1[local1][local4][local7] = null;
				}
			}
		}
		for (local4 = 0; local4 < Static84.anInt1950; local4++) {
			for (local7 = 0; local7 < Static84.anIntArray247[local4]; local7++) {
				Static84.aClass46ArrayArray1[local4][local7] = null;
			}
			Static84.anIntArray247[local4] = 0;
		}
		for (local7 = 0; local7 < this.anInt1938; local7++) {
			this.aClass38Array2[local7] = null;
		}
		this.anInt1938 = 0;
		for (@Pc(76) int local76 = 0; local76 < Static84.aClass38Array1.length; local76++) {
			Static84.aClass38Array1[local76] = null;
		}
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIIILclient!ra;ILclient!ra;Lclient!ra;)V")
	public void method1311(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class3_Sub1_Sub1 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class3_Sub1_Sub1 arg6, @OriginalArg(7) Class3_Sub1_Sub1 arg7) {
		@Pc(3) Class48 local3 = new Class48();
		local3.aClass3_Sub1_Sub1_8 = arg4;
		local3.anInt1612 = arg1 * 128 + 64;
		local3.anInt1622 = arg2 * 128 + 64;
		local3.anInt1615 = arg3;
		local3.anInt1611 = arg5;
		local3.aClass3_Sub1_Sub1_7 = arg6;
		local3.aClass3_Sub1_Sub1_6 = arg7;
		@Pc(34) int local34 = 0;
		@Pc(43) Class3_Sub11 local43 = this.aClass3_Sub11ArrayArrayArray1[arg0][arg1][arg2];
		if (local43 != null) {
			for (@Pc(47) int local47 = 0; local47 < local43.anInt2694; local47++) {
				if ((local43.aClass38Array3[local47].anInt1208 & 0x100) == 256 && local43.aClass38Array3[local47].aClass3_Sub1_Sub1_4 instanceof Class3_Sub1_Sub1_Sub4) {
					@Pc(71) Class3_Sub1_Sub1_Sub4 local71 = (Class3_Sub1_Sub1_Sub4) local43.aClass38Array3[local47].aClass3_Sub1_Sub1_4;
					local71.method776();
					if (local71.anInt2808 > local34) {
						local34 = local71.anInt2808;
					}
				}
			}
		}
		local3.anInt1618 = local34;
		if (this.aClass3_Sub11ArrayArrayArray1[arg0][arg1][arg2] == null) {
			this.aClass3_Sub11ArrayArrayArray1[arg0][arg1][arg2] = new Class3_Sub11(arg0, arg1, arg2);
		}
		this.aClass3_Sub11ArrayArrayArray1[arg0][arg1][arg2].aClass48_1 = local3;
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIIIIILclient!ra;III)Z")
	public boolean method1312(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class3_Sub1_Sub1 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		if (arg6 == null) {
			return true;
		} else {
			@Pc(11) int local11 = arg1 * 128 + arg4 * 64;
			@Pc(19) int local19 = arg2 * 128 + arg5 * 64;
			return this.method1323(arg0, arg1, arg2, arg4, arg5, local11, local19, arg3, arg6, arg7, false, arg8, arg9);
		}
	}

	@OriginalMember(owner = "client!qa", name = "b", descriptor = "(IIII)V")
	public void method1313(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(8) Class3_Sub11 local8 = this.aClass3_Sub11ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 != null) {
			this.aClass3_Sub11ArrayArrayArray1[arg0][arg1][arg2].anInt2698 = arg3;
		}
	}

	@OriginalMember(owner = "client!qa", name = "c", descriptor = "(II)V")
	public void method1314(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class3_Sub11 local8 = this.aClass3_Sub11ArrayArrayArray1[0][arg0][arg1];
		for (@Pc(10) int local10 = 0; local10 < 3; local10++) {
			@Pc(31) Class3_Sub11 local31 = this.aClass3_Sub11ArrayArrayArray1[local10][arg0][arg1] = this.aClass3_Sub11ArrayArrayArray1[local10 + 1][arg0][arg1];
			if (local31 != null) {
				local31.anInt2697--;
				for (@Pc(41) int local41 = 0; local41 < local31.anInt2694; local41++) {
					@Pc(47) Class38 local47 = local31.aClass38Array3[local41];
					if ((local47.anInt1221 >> 29 & 0x3) == 2 && local47.anInt1210 == arg0 && local47.anInt1218 == arg1) {
						local47.anInt1206--;
					}
				}
			}
		}
		if (this.aClass3_Sub11ArrayArrayArray1[0][arg0][arg1] == null) {
			this.aClass3_Sub11ArrayArrayArray1[0][arg0][arg1] = new Class3_Sub11(0, arg0, arg1);
		}
		this.aClass3_Sub11ArrayArrayArray1[0][arg0][arg1].aClass3_Sub11_1 = local8;
		this.aClass3_Sub11ArrayArrayArray1[3][arg0][arg1] = null;
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIIIILclient!ra;IIIIII)Z")
	public boolean method1315(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) Class3_Sub1_Sub1 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		return arg4 == null ? true : this.method1323(arg0, arg7, arg8, arg9 + 1 - arg7, arg10 - arg8 + 1, arg1, arg2, arg3, arg4, arg5, true, arg6, 0);
	}

	@OriginalMember(owner = "client!qa", name = "e", descriptor = "(III)V")
	public void method1316(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class3_Sub11 local8 = this.aClass3_Sub11ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 != null) {
			local8.aClass26_1 = null;
		}
	}

	@OriginalMember(owner = "client!qa", name = "b", descriptor = "()V")
	private void method1317() {
		@Pc(3) int local3 = Static84.anIntArray247[Static84.anInt1948];
		@Pc(7) Class46[] local7 = Static84.aClass46ArrayArray1[Static84.anInt1948];
		Static84.anInt1936 = 0;
		for (@Pc(11) int local11 = 0; local11 < local3; local11++) {
			@Pc(16) Class46 local16 = local7[local11];
			@Pc(27) int local27;
			@Pc(40) int local40;
			@Pc(51) int local51;
			@Pc(79) int local79;
			@Pc(58) boolean local58;
			if (local16.anInt1469 == 1) {
				local27 = local16.anInt1481 + 25 - Static84.anInt1940;
				if (local27 >= 0 && local27 <= 50) {
					local40 = local16.anInt1475 + 25 - Static84.anInt1943;
					if (local40 < 0) {
						local40 = 0;
					}
					local51 = local16.anInt1468 + 25 - Static84.anInt1943;
					if (local51 > 50) {
						local51 = 50;
					}
					local58 = false;
					while (local40 <= local51) {
						if (Static84.aBooleanArrayArray1[local27][local40++]) {
							local58 = true;
							break;
						}
					}
					if (local58) {
						local79 = Static84.anInt1939 - local16.anInt1485;
						if (local79 > 32) {
							local16.anInt1464 = 1;
						} else {
							if (local79 >= -32) {
								continue;
							}
							local16.anInt1464 = 2;
							local79 = -local79;
						}
						local16.anInt1480 = (local16.anInt1483 - Static84.anInt1944 << 8) / local79;
						local16.anInt1465 = (local16.anInt1470 - Static84.anInt1944 << 8) / local79;
						local16.anInt1492 = (local16.anInt1486 - Static84.anInt1952 << 8) / local79;
						local16.anInt1462 = (local16.anInt1474 - Static84.anInt1952 << 8) / local79;
						Static84.aClass46Array1[Static84.anInt1936++] = local16;
					}
				}
			} else if (local16.anInt1469 == 2) {
				local27 = local16.anInt1475 + 25 - Static84.anInt1943;
				if (local27 >= 0 && local27 <= 50) {
					local40 = local16.anInt1481 + 25 - Static84.anInt1940;
					if (local40 < 0) {
						local40 = 0;
					}
					local51 = local16.anInt1478 + 25 - Static84.anInt1940;
					if (local51 > 50) {
						local51 = 50;
					}
					local58 = false;
					while (local40 <= local51) {
						if (Static84.aBooleanArrayArray1[local40++][local27]) {
							local58 = true;
							break;
						}
					}
					if (local58) {
						local79 = Static84.anInt1944 - local16.anInt1483;
						if (local79 > 32) {
							local16.anInt1464 = 3;
						} else {
							if (local79 >= -32) {
								continue;
							}
							local16.anInt1464 = 4;
							local79 = -local79;
						}
						local16.anInt1479 = (local16.anInt1485 - Static84.anInt1939 << 8) / local79;
						local16.anInt1488 = (local16.anInt1471 - Static84.anInt1939 << 8) / local79;
						local16.anInt1492 = (local16.anInt1486 - Static84.anInt1952 << 8) / local79;
						local16.anInt1462 = (local16.anInt1474 - Static84.anInt1952 << 8) / local79;
						Static84.aClass46Array1[Static84.anInt1936++] = local16;
					}
				}
			} else if (local16.anInt1469 == 4) {
				local27 = local16.anInt1486 - Static84.anInt1952;
				if (local27 > 128) {
					local40 = local16.anInt1475 + 25 - Static84.anInt1943;
					if (local40 < 0) {
						local40 = 0;
					}
					local51 = local16.anInt1468 + 25 - Static84.anInt1943;
					if (local51 > 50) {
						local51 = 50;
					}
					if (local40 <= local51) {
						@Pc(319) int local319 = local16.anInt1481 + 25 - Static84.anInt1940;
						if (local319 < 0) {
							local319 = 0;
						}
						local79 = local16.anInt1478 + 25 - Static84.anInt1940;
						if (local79 > 50) {
							local79 = 50;
						}
						@Pc(337) boolean local337 = false;
						label142: for (@Pc(339) int local339 = local319; local339 <= local79; local339++) {
							for (@Pc(342) int local342 = local40; local342 <= local51; local342++) {
								if (Static84.aBooleanArrayArray1[local339][local342]) {
									local337 = true;
									break label142;
								}
							}
						}
						if (local337) {
							local16.anInt1464 = 5;
							local16.anInt1479 = (local16.anInt1485 - Static84.anInt1939 << 8) / local27;
							local16.anInt1488 = (local16.anInt1471 - Static84.anInt1939 << 8) / local27;
							local16.anInt1480 = (local16.anInt1483 - Static84.anInt1944 << 8) / local27;
							local16.anInt1465 = (local16.anInt1470 - Static84.anInt1944 << 8) / local27;
							Static84.aClass46Array1[Static84.anInt1936++] = local16;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIIIILclient!ra;IIZ)Z")
	public boolean method1318(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class3_Sub1_Sub1 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8) {
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
		return this.method1323(arg0, local7, local11, local15 + 1 - local7, local19 - local11 + 1, arg1, arg2, arg3, arg5, arg6, true, arg7, 0);
	}

	@OriginalMember(owner = "client!qa", name = "c", descriptor = "(IIII)I")
	public int method1319(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(8) Class3_Sub11 local8 = this.aClass3_Sub11ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 == null) {
			return -1;
		} else if (local8.aClass6_1 != null && local8.aClass6_1.anInt274 == arg3) {
			return local8.aClass6_1.anInt271 & 0xFF;
		} else if (local8.aClass43_1 != null && local8.aClass43_1.anInt1401 == arg3) {
			return local8.aClass43_1.anInt1410 & 0xFF;
		} else if (local8.aClass26_1 != null && local8.aClass26_1.anInt870 == arg3) {
			return local8.aClass26_1.anInt866 & 0xFF;
		} else {
			for (@Pc(56) int local56 = 0; local56 < local8.anInt2694; local56++) {
				if (local8.aClass38Array3[local56].anInt1221 == arg3) {
					return local8.aClass38Array3[local56].anInt1208 & 0xFF;
				}
			}
			return -1;
		}
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lclient!hc;IIIII)V")
	private void method1320(@OriginalArg(0) Class3_Sub1_Sub1_Sub4 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(1) boolean local1 = true;
		@Pc(3) int local3 = arg2;
		@Pc(7) int local7 = arg2 + arg4;
		@Pc(11) int local11 = arg3 - 1;
		@Pc(15) int local15 = arg3 + arg5;
		for (@Pc(17) int local17 = arg1; local17 <= arg1 + 1; local17++) {
			if (local17 != this.anInt1953) {
				for (@Pc(24) int local24 = local3; local24 <= local7; local24++) {
					if (local24 >= 0 && local24 < this.anInt1946) {
						for (@Pc(34) int local34 = local11; local34 <= local15; local34++) {
							if (local34 >= 0 && local34 < this.anInt1947 && (!local1 || local24 >= local7 || local34 >= local15 || local34 < arg3 && local24 != arg2)) {
								@Pc(66) Class3_Sub11 local66 = this.aClass3_Sub11ArrayArrayArray1[local17][local24][local34];
								if (local66 != null) {
									@Pc(160) int local160 = (this.anIntArrayArrayArray22[local17][local24][local34] + this.anIntArrayArrayArray22[local17][local24 + 1][local34] + this.anIntArrayArrayArray22[local17][local24][local34 + 1] + this.anIntArrayArrayArray22[local17][local24 + 1][local34 + 1]) / 4 - (this.anIntArrayArrayArray22[arg1][arg2][arg3] + this.anIntArrayArrayArray22[arg1][arg2 + 1][arg3] + this.anIntArrayArrayArray22[arg1][arg2][arg3 + 1] + this.anIntArrayArrayArray22[arg1][arg2 + 1][arg3 + 1]) / 4;
									@Pc(163) Class6 local163 = local66.aClass6_1;
									if (local163 != null) {
										@Pc(173) Class3_Sub1_Sub1_Sub4 local173;
										if (local163.aClass3_Sub1_Sub1_2 instanceof Class3_Sub1_Sub1_Sub4) {
											local173 = (Class3_Sub1_Sub1_Sub4) local163.aClass3_Sub1_Sub1_2;
											if (local173.aClass1Array2 != null) {
												this.method1307(arg0, local173, (local24 - arg2) * 128 + (1 - arg4) * 64, local160, (local34 - arg3) * 128 + (1 - arg5) * 64, local1);
											}
										}
										if (local163.aClass3_Sub1_Sub1_1 instanceof Class3_Sub1_Sub1_Sub4) {
											local173 = (Class3_Sub1_Sub1_Sub4) local163.aClass3_Sub1_Sub1_1;
											if (local173.aClass1Array2 != null) {
												this.method1307(arg0, local173, (local24 - arg2) * 128 + (1 - arg4) * 64, local160, (local34 - arg3) * 128 + (1 - arg5) * 64, local1);
											}
										}
									}
									for (@Pc(245) int local245 = 0; local245 < local66.anInt2694; local245++) {
										@Pc(251) Class38 local251 = local66.aClass38Array3[local245];
										if (local251 != null && local251.aClass3_Sub1_Sub1_4 instanceof Class3_Sub1_Sub1_Sub4) {
											@Pc(261) Class3_Sub1_Sub1_Sub4 local261 = (Class3_Sub1_Sub1_Sub4) local251.aClass3_Sub1_Sub1_4;
											if (local261.aClass1Array2 != null) {
												@Pc(272) int local272 = local251.anInt1213 + 1 - local251.anInt1210;
												@Pc(280) int local280 = local251.anInt1207 + 1 - local251.anInt1218;
												this.method1307(arg0, local261, (local251.anInt1210 - arg2) * 128 + (local272 - arg4) * 64, local160, (local251.anInt1218 - arg3) * 128 + (local280 - arg5) * 64, local1);
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

	@OriginalMember(owner = "client!qa", name = "f", descriptor = "(III)V")
	public void method1321() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt1953; local1++) {
			for (@Pc(4) int local4 = 0; local4 < this.anInt1946; local4++) {
				for (@Pc(7) int local7 = 0; local7 < this.anInt1947; local7++) {
					@Pc(17) Class3_Sub11 local17 = this.aClass3_Sub11ArrayArrayArray1[local1][local4][local7];
					if (local17 != null) {
						@Pc(22) Class6 local22 = local17.aClass6_1;
						if (local22 != null && local22.aClass3_Sub1_Sub1_2 instanceof Class3_Sub1_Sub1_Sub4) {
							@Pc(32) Class3_Sub1_Sub1_Sub4 local32 = (Class3_Sub1_Sub1_Sub4) local22.aClass3_Sub1_Sub1_2;
							if (local32.aClass1Array2 != null) {
								this.method1320(local32, local1, local4, local7, 1, 1);
								if (local22.aClass3_Sub1_Sub1_1 instanceof Class3_Sub1_Sub1_Sub4) {
									@Pc(51) Class3_Sub1_Sub1_Sub4 local51 = (Class3_Sub1_Sub1_Sub4) local22.aClass3_Sub1_Sub1_1;
									if (local51.aClass1Array2 != null) {
										this.method1320(local51, local1, local4, local7, 1, 1);
										this.method1307(local32, local51, 0, 0, 0, false);
										local51.method785();
									}
								}
								local32.method785();
							}
						}
						@Pc(98) Class3_Sub1_Sub1_Sub4 local98;
						for (@Pc(82) int local82 = 0; local82 < local17.anInt2694; local82++) {
							@Pc(88) Class38 local88 = local17.aClass38Array3[local82];
							if (local88 != null && local88.aClass3_Sub1_Sub1_4 instanceof Class3_Sub1_Sub1_Sub4) {
								local98 = (Class3_Sub1_Sub1_Sub4) local88.aClass3_Sub1_Sub1_4;
								if (local98.aClass1Array2 != null) {
									this.method1320(local98, local1, local4, local7, local88.anInt1213 + 1 - local88.anInt1210, local88.anInt1207 - local88.anInt1218 + 1);
									local98.method785();
								}
							}
						}
						@Pc(134) Class26 local134 = local17.aClass26_1;
						if (local134 != null && local134.aClass3_Sub1_Sub1_3 instanceof Class3_Sub1_Sub1_Sub4) {
							local98 = (Class3_Sub1_Sub1_Sub4) local134.aClass3_Sub1_Sub1_3;
							if (local98.aClass1Array2 != null) {
								this.method1338(local98, local1, local4, local7);
								local98.method785();
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lclient!vc;Z)V")
	private void method1322(@OriginalArg(0) Class3_Sub11 arg0, @OriginalArg(1) boolean arg1) {
		Static84.aClass20_9.method304(arg0);
		while (true) {
			@Pc(8) Class3_Sub11 local8;
			@Pc(17) int local17;
			@Pc(20) int local20;
			@Pc(23) int local23;
			@Pc(26) int local26;
			@Pc(31) Class3_Sub11[][] local31;
			@Pc(49) Class3_Sub11 local49;
			@Pc(251) int local251;
			@Pc(578) int local578;
			@Pc(583) int local583;
			@Pc(588) int local588;
			@Pc(591) int local591;
			@Pc(600) int local600;
			@Pc(942) Class6 local942;
			@Pc(1116) int local1116;
			@Pc(1001) int local1001;
			do {
				do {
					do {
						do {
							do {
								do {
									while (true) {
										@Pc(257) Class38 var12;
										@Pc(612) int var19;
										@Pc(335) int var23;
										@Pc(289) boolean var24;
										@Pc(823) Class3_Sub11 var35;
										while (true) {
											do {
												local8 = (Class3_Sub11) Static84.aClass20_9.method311();
												if (local8 == null) {
													return;
												}
											} while (!local8.aBoolean237);
											local17 = local8.anInt2696;
											local20 = local8.anInt2700;
											local23 = local8.anInt2697;
											local26 = local8.anInt2699;
											local31 = this.aClass3_Sub11ArrayArrayArray1[local23];
											if (!local8.aBoolean235) {
												break;
											}
											if (arg1) {
												if (local23 > 0) {
													local49 = this.aClass3_Sub11ArrayArrayArray1[local23 - 1][local17][local20];
													if (local49 != null && local49.aBoolean237) {
														continue;
													}
												}
												if (local17 <= Static84.anInt1940 && local17 > Static84.anInt1956) {
													local49 = local31[local17 - 1][local20];
													if (local49 != null && local49.aBoolean237 && (local49.aBoolean235 || (local8.anInt2702 & 0x1) == 0)) {
														continue;
													}
												}
												if (local17 >= Static84.anInt1940 && local17 < Static84.anInt1960 - 1) {
													local49 = local31[local17 + 1][local20];
													if (local49 != null && local49.aBoolean237 && (local49.aBoolean235 || (local8.anInt2702 & 0x4) == 0)) {
														continue;
													}
												}
												if (local20 <= Static84.anInt1943 && local20 > Static84.anInt1945) {
													local49 = local31[local17][local20 - 1];
													if (local49 != null && local49.aBoolean237 && (local49.aBoolean235 || (local8.anInt2702 & 0x8) == 0)) {
														continue;
													}
												}
												if (local20 >= Static84.anInt1943 && local20 < Static84.anInt1962 - 1) {
													local49 = local31[local17][local20 + 1];
													if (local49 != null && local49.aBoolean237 && (local49.aBoolean235 || (local8.anInt2702 & 0x2) == 0)) {
														continue;
													}
												}
											} else {
												arg1 = true;
											}
											local8.aBoolean235 = false;
											if (local8.aClass3_Sub11_1 != null) {
												local49 = local8.aClass3_Sub11_1;
												if (local49.aClass39_1 == null) {
													if (local49.aClass12_1 != null && !this.method1308(0, local17, local20)) {
														this.method1350(local49.aClass12_1, Static84.anInt1954, Static84.anInt1959, Static84.anInt1942, Static84.anInt1958, local17, local20);
													}
												} else if (!this.method1308(0, local17, local20)) {
													this.method1302(local49.aClass39_1, 0, Static84.anInt1954, Static84.anInt1959, Static84.anInt1942, Static84.anInt1958, local17, local20);
												}
												@Pc(225) Class6 local225 = local49.aClass6_1;
												if (local225 != null) {
													local225.aClass3_Sub1_Sub1_2.method1917(0, Static84.anInt1954, Static84.anInt1959, Static84.anInt1942, Static84.anInt1958, local225.anInt268 - Static84.anInt1939, local225.anInt277 - Static84.anInt1952, local225.anInt275 - Static84.anInt1944, local225.anInt274);
												}
												for (local251 = 0; local251 < local49.anInt2694; local251++) {
													var12 = local49.aClass38Array3[local251];
													if (var12 != null) {
														var12.aClass3_Sub1_Sub1_4.method1917(var12.anInt1212, Static84.anInt1954, Static84.anInt1959, Static84.anInt1942, Static84.anInt1958, var12.anInt1205 - Static84.anInt1939, var12.anInt1202 - Static84.anInt1952, var12.anInt1219 - Static84.anInt1944, var12.anInt1221);
													}
												}
											}
											var24 = false;
											if (local8.aClass39_1 == null) {
												if (local8.aClass12_1 != null && !this.method1308(local26, local17, local20)) {
													var24 = true;
													this.method1350(local8.aClass12_1, Static84.anInt1954, Static84.anInt1959, Static84.anInt1942, Static84.anInt1958, local17, local20);
												}
											} else if (!this.method1308(local26, local17, local20)) {
												var24 = true;
												this.method1302(local8.aClass39_1, local26, Static84.anInt1954, Static84.anInt1959, Static84.anInt1942, Static84.anInt1958, local17, local20);
											}
											var23 = 0;
											local251 = 0;
											@Pc(340) Class6 local340 = local8.aClass6_1;
											@Pc(343) Class43 local343 = local8.aClass43_1;
											if (local340 != null || local343 != null) {
												if (Static84.anInt1940 == local17) {
													var23++;
												} else if (Static84.anInt1940 < local17) {
													var23 += 2;
												}
												if (Static84.anInt1943 == local20) {
													var23 += 3;
												} else if (Static84.anInt1943 > local20) {
													var23 += 6;
												}
												local251 = Static84.anIntArray255[var23];
												local8.anInt2703 = Static84.anIntArray257[var23];
											}
											if (local340 != null) {
												if ((local340.anInt267 & Static84.anIntArray253[var23]) == 0) {
													local8.anInt2701 = 0;
												} else if (local340.anInt267 == 16) {
													local8.anInt2701 = 3;
													local8.anInt2704 = Static84.anIntArray259[var23];
													local8.anInt2695 = 3 - local8.anInt2704;
												} else if (local340.anInt267 == 32) {
													local8.anInt2701 = 6;
													local8.anInt2704 = Static84.anIntArray258[var23];
													local8.anInt2695 = 6 - local8.anInt2704;
												} else if (local340.anInt267 == 64) {
													local8.anInt2701 = 12;
													local8.anInt2704 = Static84.anIntArray256[var23];
													local8.anInt2695 = 12 - local8.anInt2704;
												} else {
													local8.anInt2701 = 9;
													local8.anInt2704 = Static84.anIntArray254[var23];
													local8.anInt2695 = 9 - local8.anInt2704;
												}
												if ((local340.anInt267 & local251) != 0 && !this.method1348(local26, local17, local20, local340.anInt267)) {
													local340.aClass3_Sub1_Sub1_2.method1917(0, Static84.anInt1954, Static84.anInt1959, Static84.anInt1942, Static84.anInt1958, local340.anInt268 - Static84.anInt1939, local340.anInt277 - Static84.anInt1952, local340.anInt275 - Static84.anInt1944, local340.anInt274);
												}
												if ((local340.anInt265 & local251) != 0 && !this.method1348(local26, local17, local20, local340.anInt265)) {
													local340.aClass3_Sub1_Sub1_1.method1917(0, Static84.anInt1954, Static84.anInt1959, Static84.anInt1942, Static84.anInt1958, local340.anInt268 - Static84.anInt1939, local340.anInt277 - Static84.anInt1952, local340.anInt275 - Static84.anInt1944, local340.anInt274);
												}
											}
											if (local343 != null && !this.method1303(local26, local17, local20, local343.aClass3_Sub1_Sub1_5.anInt2808)) {
												if ((local343.anInt1407 & local251) != 0) {
													local343.aClass3_Sub1_Sub1_5.method1917(local343.anInt1402, Static84.anInt1954, Static84.anInt1959, Static84.anInt1942, Static84.anInt1958, local343.anInt1405 - Static84.anInt1939, local343.anInt1403 - Static84.anInt1952, local343.anInt1399 - Static84.anInt1944, local343.anInt1401);
												} else if ((local343.anInt1407 & 0x300) != 0) {
													local578 = local343.anInt1405 - Static84.anInt1939;
													local583 = local343.anInt1403 - Static84.anInt1952;
													local588 = local343.anInt1399 - Static84.anInt1944;
													local591 = local343.anInt1402;
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
													if ((local343.anInt1407 & 0x100) != 0 && var19 < local600) {
														local629 = local578 + Static84.anIntArray248[local591];
														local635 = local588 + Static84.anIntArray249[local591];
														local343.aClass3_Sub1_Sub1_5.method1917(local591 * 512 + 256, Static84.anInt1954, Static84.anInt1959, Static84.anInt1942, Static84.anInt1958, local629, local583, local635, local343.anInt1401);
													}
													if ((local343.anInt1407 & 0x200) != 0 && var19 > local600) {
														local629 = local578 + Static84.anIntArray250[local591];
														local635 = local588 + Static84.anIntArray246[local591];
														local343.aClass3_Sub1_Sub1_5.method1917(local591 * 512 + 1280 & 0x7FF, Static84.anInt1954, Static84.anInt1959, Static84.anInt1942, Static84.anInt1958, local629, local583, local635, local343.anInt1401);
													}
												}
											}
											if (var24) {
												@Pc(696) Class26 local696 = local8.aClass26_1;
												if (local696 != null) {
													local696.aClass3_Sub1_Sub1_3.method1917(0, Static84.anInt1954, Static84.anInt1959, Static84.anInt1942, Static84.anInt1958, local696.anInt867 - Static84.anInt1939, local696.anInt873 - Static84.anInt1952, local696.anInt865 - Static84.anInt1944, local696.anInt870);
												}
												@Pc(723) Class48 local723 = local8.aClass48_1;
												if (local723 != null && local723.anInt1618 == 0) {
													if (local723.aClass3_Sub1_Sub1_7 != null) {
														local723.aClass3_Sub1_Sub1_7.method1917(0, Static84.anInt1954, Static84.anInt1959, Static84.anInt1942, Static84.anInt1958, local723.anInt1612 - Static84.anInt1939, local723.anInt1615 - Static84.anInt1952, local723.anInt1622 - Static84.anInt1944, local723.anInt1611);
													}
													if (local723.aClass3_Sub1_Sub1_6 != null) {
														local723.aClass3_Sub1_Sub1_6.method1917(0, Static84.anInt1954, Static84.anInt1959, Static84.anInt1942, Static84.anInt1958, local723.anInt1612 - Static84.anInt1939, local723.anInt1615 - Static84.anInt1952, local723.anInt1622 - Static84.anInt1944, local723.anInt1611);
													}
													if (local723.aClass3_Sub1_Sub1_8 != null) {
														local723.aClass3_Sub1_Sub1_8.method1917(0, Static84.anInt1954, Static84.anInt1959, Static84.anInt1942, Static84.anInt1958, local723.anInt1612 - Static84.anInt1939, local723.anInt1615 - Static84.anInt1952, local723.anInt1622 - Static84.anInt1944, local723.anInt1611);
													}
												}
											}
											local578 = local8.anInt2702;
											if (local578 != 0) {
												if (local17 < Static84.anInt1940 && (local578 & 0x4) != 0) {
													var35 = local31[local17 + 1][local20];
													if (var35 != null && var35.aBoolean237) {
														Static84.aClass20_9.method304(var35);
													}
												}
												if (local20 < Static84.anInt1943 && (local578 & 0x2) != 0) {
													var35 = local31[local17][local20 + 1];
													if (var35 != null && var35.aBoolean237) {
														Static84.aClass20_9.method304(var35);
													}
												}
												if (local17 > Static84.anInt1940 && (local578 & 0x1) != 0) {
													var35 = local31[local17 - 1][local20];
													if (var35 != null && var35.aBoolean237) {
														Static84.aClass20_9.method304(var35);
													}
												}
												if (local20 > Static84.anInt1943 && (local578 & 0x8) != 0) {
													var35 = local31[local17][local20 - 1];
													if (var35 != null && var35.aBoolean237) {
														Static84.aClass20_9.method304(var35);
													}
												}
											}
											break;
										}
										if (local8.anInt2701 != 0) {
											var24 = true;
											for (var23 = 0; var23 < local8.anInt2694; var23++) {
												if (local8.aClass38Array3[var23].anInt1220 != Static84.anInt1955 && (local8.anIntArray330[var23] & local8.anInt2701) == local8.anInt2704) {
													var24 = false;
													break;
												}
											}
											if (var24) {
												local942 = local8.aClass6_1;
												if (!this.method1348(local26, local17, local20, local942.anInt267)) {
													local942.aClass3_Sub1_Sub1_2.method1917(0, Static84.anInt1954, Static84.anInt1959, Static84.anInt1942, Static84.anInt1958, local942.anInt268 - Static84.anInt1939, local942.anInt277 - Static84.anInt1952, local942.anInt275 - Static84.anInt1944, local942.anInt274);
												}
												local8.anInt2701 = 0;
											}
										}
										if (!local8.aBoolean236) {
											break;
										}
										try {
											@Pc(981) int local981 = local8.anInt2694;
											local8.aBoolean236 = false;
											var23 = 0;
											label559: for (local251 = 0; local251 < local981; local251++) {
												var12 = local8.aClass38Array3[local251];
												if (var12.anInt1220 != Static84.anInt1955) {
													for (local1001 = var12.anInt1210; local1001 <= var12.anInt1213; local1001++) {
														for (local578 = var12.anInt1218; local578 <= var12.anInt1207; local578++) {
															var35 = local31[local1001][local578];
															if (var35.aBoolean235) {
																local8.aBoolean236 = true;
																continue label559;
															}
															if (var35.anInt2701 != 0) {
																local588 = 0;
																if (local1001 > var12.anInt1210) {
																	local588++;
																}
																if (local1001 < var12.anInt1213) {
																	local588 += 4;
																}
																if (local578 > var12.anInt1218) {
																	local588 += 8;
																}
																if (local578 < var12.anInt1207) {
																	local588 += 2;
																}
																if ((local588 & var35.anInt2701) == local8.anInt2695) {
																	local8.aBoolean236 = true;
																	continue label559;
																}
															}
														}
													}
													Static84.aClass38Array1[var23++] = var12;
													local578 = Static84.anInt1940 - var12.anInt1210;
													local583 = var12.anInt1213 - Static84.anInt1940;
													if (local583 > local578) {
														local578 = local583;
													}
													local588 = Static84.anInt1943 - var12.anInt1218;
													local591 = var12.anInt1207 - Static84.anInt1943;
													if (local591 > local588) {
														var12.anInt1215 = local578 + local591;
													} else {
														var12.anInt1215 = local578 + local588;
													}
												}
											}
											while (var23 > 0) {
												local1116 = -50;
												local1001 = -1;
												@Pc(1125) Class38 local1125;
												for (local578 = 0; local578 < var23; local578++) {
													local1125 = Static84.aClass38Array1[local578];
													if (local1125.anInt1220 != Static84.anInt1955) {
														if (local1125.anInt1215 > local1116) {
															local1116 = local1125.anInt1215;
															local1001 = local578;
														} else if (local1125.anInt1215 == local1116) {
															local588 = local1125.anInt1205 - Static84.anInt1939;
															local591 = local1125.anInt1219 - Static84.anInt1944;
															local600 = Static84.aClass38Array1[local1001].anInt1205 - Static84.anInt1939;
															var19 = Static84.aClass38Array1[local1001].anInt1219 - Static84.anInt1944;
															if (local588 * local588 + local591 * local591 > local600 * local600 + var19 * var19) {
																local1001 = local578;
															}
														}
													}
												}
												if (local1001 == -1) {
													break;
												}
												local1125 = Static84.aClass38Array1[local1001];
												local1125.anInt1220 = Static84.anInt1955;
												if (!this.method1342(local26, local1125.anInt1210, local1125.anInt1213, local1125.anInt1218, local1125.anInt1207, local1125.aClass3_Sub1_Sub1_4.anInt2808)) {
													local1125.aClass3_Sub1_Sub1_4.method1917(local1125.anInt1212, Static84.anInt1954, Static84.anInt1959, Static84.anInt1942, Static84.anInt1958, local1125.anInt1205 - Static84.anInt1939, local1125.anInt1202 - Static84.anInt1952, local1125.anInt1219 - Static84.anInt1944, local1125.anInt1221);
												}
												for (local588 = local1125.anInt1210; local588 <= local1125.anInt1213; local588++) {
													for (local591 = local1125.anInt1218; local591 <= local1125.anInt1207; local591++) {
														@Pc(1250) Class3_Sub11 local1250 = local31[local588][local591];
														if (local1250.anInt2701 != 0) {
															Static84.aClass20_9.method304(local1250);
														} else if ((local588 != local17 || local591 != local20) && local1250.aBoolean237) {
															Static84.aClass20_9.method304(local1250);
														}
													}
												}
											}
											if (!local8.aBoolean236) {
												break;
											}
										} catch (@Pc(1288) Exception local1288) {
											local8.aBoolean236 = false;
											break;
										}
									}
								} while (!local8.aBoolean237);
							} while (local8.anInt2701 != 0);
							if (local17 > Static84.anInt1940 || local17 <= Static84.anInt1956) {
								break;
							}
							local49 = local31[local17 - 1][local20];
						} while (local49 != null && local49.aBoolean237);
						if (local17 < Static84.anInt1940 || local17 >= Static84.anInt1960 - 1) {
							break;
						}
						local49 = local31[local17 + 1][local20];
					} while (local49 != null && local49.aBoolean237);
					if (local20 > Static84.anInt1943 || local20 <= Static84.anInt1945) {
						break;
					}
					local49 = local31[local17][local20 - 1];
				} while (local49 != null && local49.aBoolean237);
				if (local20 < Static84.anInt1943 || local20 >= Static84.anInt1962 - 1) {
					break;
				}
				local49 = local31[local17][local20 + 1];
			} while (local49 != null && local49.aBoolean237);
			local8.aBoolean237 = false;
			Static84.anInt1957--;
			@Pc(1392) Class48 local1392 = local8.aClass48_1;
			if (local1392 != null && local1392.anInt1618 != 0) {
				if (local1392.aClass3_Sub1_Sub1_7 != null) {
					local1392.aClass3_Sub1_Sub1_7.method1917(0, Static84.anInt1954, Static84.anInt1959, Static84.anInt1942, Static84.anInt1958, local1392.anInt1612 - Static84.anInt1939, local1392.anInt1615 - Static84.anInt1952 - local1392.anInt1618, local1392.anInt1622 - Static84.anInt1944, local1392.anInt1611);
				}
				if (local1392.aClass3_Sub1_Sub1_6 != null) {
					local1392.aClass3_Sub1_Sub1_6.method1917(0, Static84.anInt1954, Static84.anInt1959, Static84.anInt1942, Static84.anInt1958, local1392.anInt1612 - Static84.anInt1939, local1392.anInt1615 - Static84.anInt1952 - local1392.anInt1618, local1392.anInt1622 - Static84.anInt1944, local1392.anInt1611);
				}
				if (local1392.aClass3_Sub1_Sub1_8 != null) {
					local1392.aClass3_Sub1_Sub1_8.method1917(0, Static84.anInt1954, Static84.anInt1959, Static84.anInt1942, Static84.anInt1958, local1392.anInt1612 - Static84.anInt1939, local1392.anInt1615 - Static84.anInt1952 - local1392.anInt1618, local1392.anInt1622 - Static84.anInt1944, local1392.anInt1611);
				}
			}
			if (local8.anInt2703 != 0) {
				@Pc(1487) Class43 local1487 = local8.aClass43_1;
				if (local1487 != null && !this.method1303(local26, local17, local20, local1487.aClass3_Sub1_Sub1_5.anInt2808)) {
					if ((local1487.anInt1407 & local8.anInt2703) != 0) {
						local1487.aClass3_Sub1_Sub1_5.method1917(local1487.anInt1402, Static84.anInt1954, Static84.anInt1959, Static84.anInt1942, Static84.anInt1958, local1487.anInt1405 - Static84.anInt1939, local1487.anInt1403 - Static84.anInt1952, local1487.anInt1399 - Static84.anInt1944, local1487.anInt1401);
					} else if ((local1487.anInt1407 & 0x300) != 0) {
						local251 = local1487.anInt1405 - Static84.anInt1939;
						local1116 = local1487.anInt1403 - Static84.anInt1952;
						local1001 = local1487.anInt1399 - Static84.anInt1944;
						local578 = local1487.anInt1402;
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
						if ((local1487.anInt1407 & 0x100) != 0 && local588 >= local583) {
							local591 = local251 + Static84.anIntArray248[local578];
							local600 = local1001 + Static84.anIntArray249[local578];
							local1487.aClass3_Sub1_Sub1_5.method1917(local578 * 512 + 256, Static84.anInt1954, Static84.anInt1959, Static84.anInt1942, Static84.anInt1958, local591, local1116, local600, local1487.anInt1401);
						}
						if ((local1487.anInt1407 & 0x200) != 0 && local588 <= local583) {
							local591 = local251 + Static84.anIntArray250[local578];
							local600 = local1001 + Static84.anIntArray246[local578];
							local1487.aClass3_Sub1_Sub1_5.method1917(local578 * 512 + 1280 & 0x7FF, Static84.anInt1954, Static84.anInt1959, Static84.anInt1942, Static84.anInt1958, local591, local1116, local600, local1487.anInt1401);
						}
					}
				}
				local942 = local8.aClass6_1;
				if (local942 != null) {
					if ((local942.anInt265 & local8.anInt2703) != 0 && !this.method1348(local26, local17, local20, local942.anInt265)) {
						local942.aClass3_Sub1_Sub1_1.method1917(0, Static84.anInt1954, Static84.anInt1959, Static84.anInt1942, Static84.anInt1958, local942.anInt268 - Static84.anInt1939, local942.anInt277 - Static84.anInt1952, local942.anInt275 - Static84.anInt1944, local942.anInt274);
					}
					if ((local942.anInt267 & local8.anInt2703) != 0 && !this.method1348(local26, local17, local20, local942.anInt267)) {
						local942.aClass3_Sub1_Sub1_2.method1917(0, Static84.anInt1954, Static84.anInt1959, Static84.anInt1942, Static84.anInt1958, local942.anInt268 - Static84.anInt1939, local942.anInt277 - Static84.anInt1952, local942.anInt275 - Static84.anInt1944, local942.anInt274);
					}
				}
			}
			@Pc(1745) Class3_Sub11 local1745;
			if (local23 < this.anInt1953 - 1) {
				local1745 = this.aClass3_Sub11ArrayArrayArray1[local23 + 1][local17][local20];
				if (local1745 != null && local1745.aBoolean237) {
					Static84.aClass20_9.method304(local1745);
				}
			}
			if (local17 < Static84.anInt1940) {
				local1745 = local31[local17 + 1][local20];
				if (local1745 != null && local1745.aBoolean237) {
					Static84.aClass20_9.method304(local1745);
				}
			}
			if (local20 < Static84.anInt1943) {
				local1745 = local31[local17][local20 + 1];
				if (local1745 != null && local1745.aBoolean237) {
					Static84.aClass20_9.method304(local1745);
				}
			}
			if (local17 > Static84.anInt1940) {
				local1745 = local31[local17 - 1][local20];
				if (local1745 != null && local1745.aBoolean237) {
					Static84.aClass20_9.method304(local1745);
				}
			}
			if (local20 > Static84.anInt1943) {
				local1745 = local31[local17][local20 - 1];
				if (local1745 != null && local1745.aBoolean237) {
					Static84.aClass20_9.method304(local1745);
				}
			}
		}
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIIIIIIILclient!ra;IZII)Z")
	private boolean method1323(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) Class3_Sub1_Sub1 arg8, @OriginalArg(9) int arg9, @OriginalArg(10) boolean arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12) {
		for (@Pc(1) int local1 = arg1; local1 < arg1 + arg3; local1++) {
			for (@Pc(4) int local4 = arg2; local4 < arg2 + arg4; local4++) {
				if (local1 < 0 || local4 < 0 || local1 >= this.anInt1946 || local4 >= this.anInt1947) {
					return false;
				}
				@Pc(28) Class3_Sub11 local28 = this.aClass3_Sub11ArrayArrayArray1[arg0][local1][local4];
				if (local28 != null && local28.anInt2694 >= 5) {
					return false;
				}
			}
		}
		@Pc(52) Class38 local52 = new Class38();
		local52.anInt1221 = arg11;
		local52.anInt1208 = arg12;
		local52.anInt1206 = arg0;
		local52.anInt1205 = arg5;
		local52.anInt1219 = arg6;
		local52.anInt1202 = arg7;
		local52.aClass3_Sub1_Sub1_4 = arg8;
		local52.anInt1212 = arg9;
		local52.anInt1210 = arg1;
		local52.anInt1218 = arg2;
		local52.anInt1213 = arg1 + arg3 - 1;
		local52.anInt1207 = arg2 + arg4 - 1;
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
					if (this.aClass3_Sub11ArrayArrayArray1[local130][local98][local101] == null) {
						this.aClass3_Sub11ArrayArrayArray1[local130][local98][local101] = new Class3_Sub11(local130, local98, local101);
					}
				}
				@Pc(166) Class3_Sub11 local166 = this.aClass3_Sub11ArrayArrayArray1[arg0][local98][local101];
				local166.aClass38Array3[local166.anInt2694] = local52;
				local166.anIntArray330[local166.anInt2694] = local104;
				local166.anInt2702 |= local104;
				local166.anInt2694++;
			}
		}
		if (arg10) {
			this.aClass38Array2[this.anInt1938++] = local52;
		}
		return true;
	}

	@OriginalMember(owner = "client!qa", name = "g", descriptor = "(III)Z")
	private boolean method1325(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < Static84.anInt1936; local1++) {
			@Pc(6) Class46 local6 = Static84.aClass46Array1[local1];
			@Pc(15) int local15;
			@Pc(27) int local27;
			@Pc(37) int local37;
			@Pc(47) int local47;
			@Pc(57) int local57;
			if (local6.anInt1464 == 1) {
				local15 = local6.anInt1485 - arg0;
				if (local15 > 0) {
					local27 = local6.anInt1483 + (local6.anInt1480 * local15 >> 8);
					local37 = local6.anInt1470 + (local6.anInt1465 * local15 >> 8);
					local47 = local6.anInt1486 + (local6.anInt1492 * local15 >> 8);
					local57 = local6.anInt1474 + (local6.anInt1462 * local15 >> 8);
					if (arg2 >= local27 && arg2 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt1464 == 2) {
				local15 = arg0 - local6.anInt1485;
				if (local15 > 0) {
					local27 = local6.anInt1483 + (local6.anInt1480 * local15 >> 8);
					local37 = local6.anInt1470 + (local6.anInt1465 * local15 >> 8);
					local47 = local6.anInt1486 + (local6.anInt1492 * local15 >> 8);
					local57 = local6.anInt1474 + (local6.anInt1462 * local15 >> 8);
					if (arg2 >= local27 && arg2 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt1464 == 3) {
				local15 = local6.anInt1483 - arg2;
				if (local15 > 0) {
					local27 = local6.anInt1485 + (local6.anInt1479 * local15 >> 8);
					local37 = local6.anInt1471 + (local6.anInt1488 * local15 >> 8);
					local47 = local6.anInt1486 + (local6.anInt1492 * local15 >> 8);
					local57 = local6.anInt1474 + (local6.anInt1462 * local15 >> 8);
					if (arg0 >= local27 && arg0 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt1464 == 4) {
				local15 = arg2 - local6.anInt1483;
				if (local15 > 0) {
					local27 = local6.anInt1485 + (local6.anInt1479 * local15 >> 8);
					local37 = local6.anInt1471 + (local6.anInt1488 * local15 >> 8);
					local47 = local6.anInt1486 + (local6.anInt1492 * local15 >> 8);
					local57 = local6.anInt1474 + (local6.anInt1462 * local15 >> 8);
					if (arg0 >= local27 && arg0 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt1464 == 5) {
				local15 = arg1 - local6.anInt1486;
				if (local15 > 0) {
					local27 = local6.anInt1485 + (local6.anInt1479 * local15 >> 8);
					local37 = local6.anInt1471 + (local6.anInt1488 * local15 >> 8);
					local47 = local6.anInt1483 + (local6.anInt1480 * local15 >> 8);
					local57 = local6.anInt1470 + (local6.anInt1465 * local15 >> 8);
					if (arg0 >= local27 && arg0 <= local37 && arg2 >= local47 && arg2 <= local57) {
						return true;
					}
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIIILclient!ra;II)V")
	public void method1326(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class3_Sub1_Sub1 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (arg4 == null) {
			return;
		}
		@Pc(6) Class26 local6 = new Class26();
		local6.aClass3_Sub1_Sub1_3 = arg4;
		local6.anInt867 = arg1 * 128 + 64;
		local6.anInt865 = arg2 * 128 + 64;
		local6.anInt873 = arg3;
		local6.anInt870 = arg5;
		local6.anInt866 = arg6;
		if (this.aClass3_Sub11ArrayArrayArray1[arg0][arg1][arg2] == null) {
			this.aClass3_Sub11ArrayArrayArray1[arg0][arg1][arg2] = new Class3_Sub11(arg0, arg1, arg2);
		}
		this.aClass3_Sub11ArrayArrayArray1[arg0][arg1][arg2].aClass26_1 = local6;
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIIIII)V")
	public void method1327(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (arg0 < 0) {
			arg0 = 0;
		} else if (arg0 >= this.anInt1946 * 128) {
			arg0 = this.anInt1946 * 128 - 1;
		}
		if (arg2 < 0) {
			arg2 = 0;
		} else if (arg2 >= this.anInt1947 * 128) {
			arg2 = this.anInt1947 * 128 - 1;
		}
		Static84.anInt1955++;
		Static84.anInt1954 = Static41.anIntArray149[arg3];
		Static84.anInt1959 = Static41.anIntArray142[arg3];
		Static84.anInt1942 = Static41.anIntArray149[arg4];
		Static84.anInt1958 = Static41.anIntArray142[arg4];
		Static84.aBooleanArrayArray1 = Static84.aBooleanArrayArrayArrayArray1[(arg3 - 128) / 32][arg4 / 64];
		Static84.anInt1939 = arg0;
		Static84.anInt1952 = arg1;
		Static84.anInt1944 = arg2;
		Static84.anInt1940 = arg0 / 128;
		Static84.anInt1943 = arg2 / 128;
		Static84.anInt1948 = arg5;
		Static84.anInt1956 = Static84.anInt1940 - 25;
		if (Static84.anInt1956 < 0) {
			Static84.anInt1956 = 0;
		}
		Static84.anInt1945 = Static84.anInt1943 - 25;
		if (Static84.anInt1945 < 0) {
			Static84.anInt1945 = 0;
		}
		Static84.anInt1960 = Static84.anInt1940 + 25;
		if (Static84.anInt1960 > this.anInt1946) {
			Static84.anInt1960 = this.anInt1946;
		}
		Static84.anInt1962 = Static84.anInt1943 + 25;
		if (Static84.anInt1962 > this.anInt1947) {
			Static84.anInt1962 = this.anInt1947;
		}
		this.method1317();
		Static84.anInt1957 = 0;
		@Pc(136) int local136;
		@Pc(139) int local139;
		for (@Pc(128) int local128 = this.anInt1951; local128 < this.anInt1953; local128++) {
			@Pc(134) Class3_Sub11[][] local134 = this.aClass3_Sub11ArrayArrayArray1[local128];
			for (local136 = Static84.anInt1956; local136 < Static84.anInt1960; local136++) {
				for (local139 = Static84.anInt1945; local139 < Static84.anInt1962; local139++) {
					@Pc(146) Class3_Sub11 local146 = local134[local136][local139];
					if (local146 != null) {
						if (local146.anInt2698 <= arg5 && (Static84.aBooleanArrayArray1[local136 + 25 - Static84.anInt1940][local139 + 25 - Static84.anInt1943] || this.anIntArrayArrayArray22[local128][local136][local139] - arg1 >= 2000)) {
							local146.aBoolean235 = true;
							local146.aBoolean237 = true;
							if (local146.anInt2694 > 0) {
								local146.aBoolean236 = true;
							} else {
								local146.aBoolean236 = false;
							}
							Static84.anInt1957++;
						} else {
							local146.aBoolean235 = false;
							local146.aBoolean237 = false;
							local146.anInt2701 = 0;
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
		for (@Pc(224) int local224 = this.anInt1951; local224 < this.anInt1953; local224++) {
			@Pc(230) Class3_Sub11[][] local230 = this.aClass3_Sub11ArrayArrayArray1[local224];
			for (local139 = -25; local139 <= 0; local139++) {
				local237 = Static84.anInt1940 + local139;
				local241 = Static84.anInt1940 - local139;
				if (local237 >= Static84.anInt1956 || local241 < Static84.anInt1960) {
					for (local249 = -25; local249 <= 0; local249++) {
						local254 = Static84.anInt1943 + local249;
						local258 = Static84.anInt1943 - local249;
						@Pc(270) Class3_Sub11 local270;
						if (local237 >= Static84.anInt1956) {
							if (local254 >= Static84.anInt1945) {
								local270 = local230[local237][local254];
								if (local270 != null && local270.aBoolean235) {
									this.method1322(local270, true);
								}
							}
							if (local258 < Static84.anInt1962) {
								local270 = local230[local237][local258];
								if (local270 != null && local270.aBoolean235) {
									this.method1322(local270, true);
								}
							}
						}
						if (local241 < Static84.anInt1960) {
							if (local254 >= Static84.anInt1945) {
								local270 = local230[local241][local254];
								if (local270 != null && local270.aBoolean235) {
									this.method1322(local270, true);
								}
							}
							if (local258 < Static84.anInt1962) {
								local270 = local230[local241][local258];
								if (local270 != null && local270.aBoolean235) {
									this.method1322(local270, true);
								}
							}
						}
						if (Static84.anInt1957 == 0) {
							Static84.aBoolean148 = false;
							return;
						}
					}
				}
			}
		}
		for (local136 = this.anInt1951; local136 < this.anInt1953; local136++) {
			@Pc(361) Class3_Sub11[][] local361 = this.aClass3_Sub11ArrayArrayArray1[local136];
			for (local237 = -25; local237 <= 0; local237++) {
				local241 = Static84.anInt1940 + local237;
				local249 = Static84.anInt1940 - local237;
				if (local241 >= Static84.anInt1956 || local249 < Static84.anInt1960) {
					for (local254 = -25; local254 <= 0; local254++) {
						local258 = Static84.anInt1943 + local254;
						@Pc(389) int local389 = Static84.anInt1943 - local254;
						@Pc(401) Class3_Sub11 local401;
						if (local241 >= Static84.anInt1956) {
							if (local258 >= Static84.anInt1945) {
								local401 = local361[local241][local258];
								if (local401 != null && local401.aBoolean235) {
									this.method1322(local401, false);
								}
							}
							if (local389 < Static84.anInt1962) {
								local401 = local361[local241][local389];
								if (local401 != null && local401.aBoolean235) {
									this.method1322(local401, false);
								}
							}
						}
						if (local249 < Static84.anInt1960) {
							if (local258 >= Static84.anInt1945) {
								local401 = local361[local249][local258];
								if (local401 != null && local401.aBoolean235) {
									this.method1322(local401, false);
								}
							}
							if (local389 < Static84.anInt1962) {
								local401 = local361[local249][local389];
								if (local401 != null && local401.aBoolean235) {
									this.method1322(local401, false);
								}
							}
						}
						if (Static84.anInt1957 == 0) {
							Static84.aBoolean148 = false;
							return;
						}
					}
				}
			}
		}
		Static84.aBoolean148 = false;
	}

	@OriginalMember(owner = "client!qa", name = "h", descriptor = "(III)V")
	public void method1328(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class3_Sub11 local8 = this.aClass3_Sub11ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 != null) {
			local8.aClass43_1 = null;
		}
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIIILclient!ra;IIIIII)V")
	public void method1329(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class3_Sub1_Sub1 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		if (arg4 == null) {
			return;
		}
		@Pc(6) Class43 local6 = new Class43();
		local6.anInt1401 = arg9;
		local6.anInt1410 = arg10;
		local6.anInt1405 = arg1 * 128 + arg7 + 64;
		local6.anInt1399 = arg2 * 128 + arg8 + 64;
		local6.anInt1403 = arg3;
		local6.aClass3_Sub1_Sub1_5 = arg4;
		local6.anInt1407 = arg5;
		local6.anInt1402 = arg6;
		for (@Pc(44) int local44 = arg0; local44 >= 0; local44--) {
			if (this.aClass3_Sub11ArrayArrayArray1[local44][arg1][arg2] == null) {
				this.aClass3_Sub11ArrayArrayArray1[local44][arg1][arg2] = new Class3_Sub11(local44, arg1, arg2);
			}
		}
		this.aClass3_Sub11ArrayArrayArray1[arg0][arg1][arg2].aClass43_1 = local6;
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lclient!j;)V")
	private void method1330(@OriginalArg(0) Class38 arg0) {
		for (@Pc(2) int local2 = arg0.anInt1210; local2 <= arg0.anInt1213; local2++) {
			for (@Pc(6) int local6 = arg0.anInt1218; local6 <= arg0.anInt1207; local6++) {
				@Pc(17) Class3_Sub11 local17 = this.aClass3_Sub11ArrayArrayArray1[arg0.anInt1206][local2][local6];
				if (local17 != null) {
					@Pc(36) int local36;
					for (@Pc(21) int local21 = 0; local21 < local17.anInt2694; local21++) {
						if (local17.aClass38Array3[local21] == arg0) {
							local17.anInt2694--;
							for (local36 = local21; local36 < local17.anInt2694; local36++) {
								local17.aClass38Array3[local36] = local17.aClass38Array3[local36 + 1];
								local17.anIntArray330[local36] = local17.anIntArray330[local36 + 1];
							}
							local17.aClass38Array3[local17.anInt2694] = null;
							break;
						}
					}
					local17.anInt2702 = 0;
					for (local36 = 0; local36 < local17.anInt2694; local36++) {
						local17.anInt2702 |= local17.anIntArray330[local36];
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "([IIIIII)V")
	public void method1331(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(8) Class3_Sub11 local8 = this.aClass3_Sub11ArrayArrayArray1[arg2][arg3][arg4];
		if (local8 == null) {
			return;
		}
		@Pc(14) Class39 local14 = local8.aClass39_1;
		@Pc(24) int local24;
		if (local14 != null) {
			@Pc(19) int local19 = local14.anInt1246;
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
		@Pc(59) Class12 local59 = local8.aClass12_1;
		if (local59 == null) {
			return;
		}
		local24 = local59.anInt352;
		@Pc(68) int local68 = local59.anInt351;
		@Pc(71) int local71 = local59.anInt354;
		@Pc(74) int local74 = local59.anInt353;
		@Pc(79) int[] local79 = this.anIntArrayArray19[local24];
		@Pc(84) int[] local84 = this.anIntArrayArray20[local68];
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

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(I)V")
	public void method1332(@OriginalArg(0) int arg0) {
		this.anInt1951 = arg0;
		for (@Pc(4) int local4 = 0; local4 < this.anInt1946; local4++) {
			for (@Pc(7) int local7 = 0; local7 < this.anInt1947; local7++) {
				if (this.aClass3_Sub11ArrayArrayArray1[arg0][local4][local7] == null) {
					this.aClass3_Sub11ArrayArrayArray1[arg0][local4][local7] = new Class3_Sub11(arg0, local4, local7);
				}
			}
		}
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIIILclient!ra;Lclient!ra;IIII)V")
	public void method1333(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class3_Sub1_Sub1 arg4, @OriginalArg(5) Class3_Sub1_Sub1 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		if (arg4 == null && arg5 == null) {
			return;
		}
		@Pc(8) Class6 local8 = new Class6();
		local8.anInt274 = arg8;
		local8.anInt271 = arg9;
		local8.anInt268 = arg1 * 128 + 64;
		local8.anInt275 = arg2 * 128 + 64;
		local8.anInt277 = arg3;
		local8.aClass3_Sub1_Sub1_2 = arg4;
		local8.aClass3_Sub1_Sub1_1 = arg5;
		local8.anInt267 = arg6;
		local8.anInt265 = arg7;
		for (@Pc(45) int local45 = arg0; local45 >= 0; local45--) {
			if (this.aClass3_Sub11ArrayArrayArray1[local45][arg1][arg2] == null) {
				this.aClass3_Sub11ArrayArrayArray1[local45][arg1][arg2] = new Class3_Sub11(local45, arg1, arg2);
			}
		}
		this.aClass3_Sub11ArrayArrayArray1[arg0][arg1][arg2].aClass6_1 = local8;
	}

	@OriginalMember(owner = "client!qa", name = "i", descriptor = "(III)I")
	public int method1335(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class3_Sub11 local8 = this.aClass3_Sub11ArrayArrayArray1[arg0][arg1][arg2];
		return local8 == null || local8.aClass26_1 == null ? 0 : local8.aClass26_1.anInt870;
	}

	@OriginalMember(owner = "client!qa", name = "j", descriptor = "(III)Lclient!fa;")
	public Class26 method1336(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class3_Sub11 local8 = this.aClass3_Sub11ArrayArrayArray1[arg0][arg1][arg2];
		return local8 == null || local8.aClass26_1 == null ? null : local8.aClass26_1;
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lclient!hc;III)V")
	private void method1338(@OriginalArg(0) Class3_Sub1_Sub1_Sub4 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(14) Class3_Sub11 local14;
		@Pc(29) Class3_Sub1_Sub1_Sub4 local29;
		if (arg2 < this.anInt1946) {
			local14 = this.aClass3_Sub11ArrayArrayArray1[arg1][arg2 + 1][arg3];
			if (local14 != null && local14.aClass26_1 != null && local14.aClass26_1.aClass3_Sub1_Sub1_3 instanceof Class3_Sub1_Sub1_Sub4) {
				local29 = (Class3_Sub1_Sub1_Sub4) local14.aClass26_1.aClass3_Sub1_Sub1_3;
				if (local29.aClass1Array2 != null) {
					this.method1307(arg0, local29, 128, 0, 0, true);
				}
			}
		}
		if (arg3 < this.anInt1946) {
			local14 = this.aClass3_Sub11ArrayArrayArray1[arg1][arg2][arg3 + 1];
			if (local14 != null && local14.aClass26_1 != null && local14.aClass26_1.aClass3_Sub1_Sub1_3 instanceof Class3_Sub1_Sub1_Sub4) {
				local29 = (Class3_Sub1_Sub1_Sub4) local14.aClass26_1.aClass3_Sub1_Sub1_3;
				if (local29.aClass1Array2 != null) {
					this.method1307(arg0, local29, 0, 0, 128, true);
				}
			}
		}
		if (arg2 < this.anInt1946 && arg3 < this.anInt1947) {
			local14 = this.aClass3_Sub11ArrayArrayArray1[arg1][arg2 + 1][arg3 + 1];
			if (local14 != null && local14.aClass26_1 != null && local14.aClass26_1.aClass3_Sub1_Sub1_3 instanceof Class3_Sub1_Sub1_Sub4) {
				local29 = (Class3_Sub1_Sub1_Sub4) local14.aClass26_1.aClass3_Sub1_Sub1_3;
				if (local29.aClass1Array2 != null) {
					this.method1307(arg0, local29, 128, 0, 128, true);
				}
			}
		}
		if (arg2 >= this.anInt1946 || arg3 <= 0) {
			return;
		}
		local14 = this.aClass3_Sub11ArrayArrayArray1[arg1][arg2 + 1][arg3 - 1];
		if (local14 != null && local14.aClass26_1 != null && local14.aClass26_1.aClass3_Sub1_Sub1_3 instanceof Class3_Sub1_Sub1_Sub4) {
			local29 = (Class3_Sub1_Sub1_Sub4) local14.aClass26_1.aClass3_Sub1_Sub1_3;
			if (local29.aClass1Array2 != null) {
				this.method1307(arg0, local29, 128, 0, -128, true);
			}
		}
	}

	@OriginalMember(owner = "client!qa", name = "k", descriptor = "(III)I")
	public int method1339(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class3_Sub11 local8 = this.aClass3_Sub11ArrayArrayArray1[arg0][arg1][arg2];
		return local8 == null || local8.aClass6_1 == null ? 0 : local8.aClass6_1.anInt274;
	}

	@OriginalMember(owner = "client!qa", name = "d", descriptor = "(IIII)V")
	public void method1340(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(8) Class3_Sub11 local8 = this.aClass3_Sub11ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 == null) {
			return;
		}
		@Pc(14) Class43 local14 = local8.aClass43_1;
		if (local14 != null) {
			@Pc(23) int local23 = arg1 * 128 + 64;
			@Pc(29) int local29 = arg2 * 128 + 64;
			local14.anInt1405 = local23 + (local14.anInt1405 - local23) * arg3 / 16;
			local14.anInt1399 = local29 + (local14.anInt1399 - local29) * arg3 / 16;
		}
	}

	@OriginalMember(owner = "client!qa", name = "l", descriptor = "(III)Lclient!j;")
	public Class38 method1341(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class3_Sub11 local8 = this.aClass3_Sub11ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 == null) {
			return null;
		}
		for (@Pc(14) int local14 = 0; local14 < local8.anInt2694; local14++) {
			@Pc(20) Class38 local20 = local8.aClass38Array3[local14];
			if ((local20.anInt1221 >> 29 & 0x3) == 2 && local20.anInt1210 == arg1 && local20.anInt1218 == arg2) {
				return local20;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!qa", name = "b", descriptor = "(IIIIII)Z")
	private boolean method1342(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(17) int local17;
		@Pc(21) int local21;
		if (arg1 != arg2 || arg3 != arg4) {
			for (local17 = arg1; local17 <= arg2; local17++) {
				for (local21 = arg3; local21 <= arg4; local21++) {
					if (this.anIntArrayArrayArray21[arg0][local17][local21] == -Static84.anInt1955) {
						return false;
					}
				}
			}
			local21 = (arg1 << 7) + 1;
			@Pc(156) int local156 = (arg3 << 7) + 2;
			@Pc(167) int local167 = this.anIntArrayArrayArray22[arg0][arg1][arg3] - arg5;
			if (!this.method1325(local21, local167, local156)) {
				return false;
			}
			@Pc(181) int local181 = (arg2 << 7) - 1;
			if (!this.method1325(local181, local167, local156)) {
				return false;
			}
			@Pc(195) int local195 = (arg4 << 7) - 1;
			if (!this.method1325(local21, local167, local195)) {
				return false;
			} else if (this.method1325(local181, local167, local195)) {
				return true;
			} else {
				return false;
			}
		} else if (this.method1308(arg0, arg1, arg3)) {
			local17 = arg1 << 7;
			local21 = arg3 << 7;
			return this.method1325(local17 + 1, this.anIntArrayArrayArray22[arg0][arg1][arg3] - arg5, local21 + 1) && this.method1325(local17 + 128 - 1, this.anIntArrayArrayArray22[arg0][arg1 + 1][arg3] - arg5, local21 + 1) && this.method1325(local17 + 128 - 1, this.anIntArrayArrayArray22[arg0][arg1 + 1][arg3 + 1] - arg5, local21 + 128 - 1) && this.method1325(local17 + 1, this.anIntArrayArrayArray22[arg0][arg1][arg3 + 1] - arg5, local21 + 128 - 1);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!qa", name = "m", descriptor = "(III)I")
	public int method1343(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class3_Sub11 local8 = this.aClass3_Sub11ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 == null) {
			return 0;
		}
		for (@Pc(14) int local14 = 0; local14 < local8.anInt2694; local14++) {
			@Pc(20) Class38 local20 = local8.aClass38Array3[local14];
			if ((local20.anInt1221 >> 29 & 0x3) == 2 && local20.anInt1210 == arg1 && local20.anInt1218 == arg2) {
				return local20.anInt1221;
			}
		}
		return 0;
	}

	@OriginalMember(owner = "client!qa", name = "o", descriptor = "(III)Lclient!kc;")
	public Class43 method1345(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class3_Sub11 local8 = this.aClass3_Sub11ArrayArrayArray1[arg0][arg1][arg2];
		return local8 == null ? null : local8.aClass43_1;
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIIIIIIIIIIIIIIIIIII)V")
	public void method1346(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int arg15, @OriginalArg(16) int arg16, @OriginalArg(17) int arg17, @OriginalArg(18) int arg18, @OriginalArg(19) int arg19) {
		@Pc(12) Class39 local12;
		@Pc(14) int local14;
		if (arg3 == 0) {
			local12 = new Class39(arg10, arg11, arg12, arg13, -1, arg18, false);
			for (local14 = arg0; local14 >= 0; local14--) {
				if (this.aClass3_Sub11ArrayArrayArray1[local14][arg1][arg2] == null) {
					this.aClass3_Sub11ArrayArrayArray1[local14][arg1][arg2] = new Class3_Sub11(local14, arg1, arg2);
				}
			}
			this.aClass3_Sub11ArrayArrayArray1[arg0][arg1][arg2].aClass39_1 = local12;
		} else if (arg3 == 1) {
			local12 = new Class39(arg14, arg15, arg16, arg17, arg5, arg19, arg6 == arg7 && arg6 == arg8 && arg6 == arg9);
			for (local14 = arg0; local14 >= 0; local14--) {
				if (this.aClass3_Sub11ArrayArrayArray1[local14][arg1][arg2] == null) {
					this.aClass3_Sub11ArrayArrayArray1[local14][arg1][arg2] = new Class3_Sub11(local14, arg1, arg2);
				}
			}
			this.aClass3_Sub11ArrayArrayArray1[arg0][arg1][arg2].aClass39_1 = local12;
		} else {
			@Pc(140) Class12 local140 = new Class12(arg3, arg4, arg5, arg1, arg2, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17, arg18, arg19);
			for (local14 = arg0; local14 >= 0; local14--) {
				if (this.aClass3_Sub11ArrayArrayArray1[local14][arg1][arg2] == null) {
					this.aClass3_Sub11ArrayArrayArray1[local14][arg1][arg2] = new Class3_Sub11(local14, arg1, arg2);
				}
			}
			this.aClass3_Sub11ArrayArrayArray1[arg0][arg1][arg2].aClass12_1 = local140;
		}
	}

	@OriginalMember(owner = "client!qa", name = "p", descriptor = "(III)V")
	public void method1347(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class3_Sub11 local8 = this.aClass3_Sub11ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 != null) {
			local8.aClass6_1 = null;
		}
	}

	@OriginalMember(owner = "client!qa", name = "e", descriptor = "(IIII)Z")
	private boolean method1348(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!this.method1308(arg0, arg1, arg2)) {
			return false;
		}
		@Pc(11) int local11 = arg1 << 7;
		@Pc(15) int local15 = arg2 << 7;
		@Pc(26) int local26 = this.anIntArrayArrayArray22[arg0][arg1][arg2] - 1;
		@Pc(30) int local30 = local26 - 120;
		@Pc(34) int local34 = local26 - 230;
		@Pc(38) int local38 = local26 - 238;
		if (arg3 < 16) {
			if (arg3 == 1) {
				if (local11 > Static84.anInt1939) {
					if (!this.method1325(local11, local26, local15)) {
						return false;
					}
					if (!this.method1325(local11, local26, local15 + 128)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!this.method1325(local11, local30, local15)) {
						return false;
					}
					if (!this.method1325(local11, local30, local15 + 128)) {
						return false;
					}
				}
				if (!this.method1325(local11, local34, local15)) {
					return false;
				}
				if (!this.method1325(local11, local34, local15 + 128)) {
					return false;
				}
				return true;
			}
			if (arg3 == 2) {
				if (local15 < Static84.anInt1944) {
					if (!this.method1325(local11, local26, local15 + 128)) {
						return false;
					}
					if (!this.method1325(local11 + 128, local26, local15 + 128)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!this.method1325(local11, local30, local15 + 128)) {
						return false;
					}
					if (!this.method1325(local11 + 128, local30, local15 + 128)) {
						return false;
					}
				}
				if (!this.method1325(local11, local34, local15 + 128)) {
					return false;
				}
				if (!this.method1325(local11 + 128, local34, local15 + 128)) {
					return false;
				}
				return true;
			}
			if (arg3 == 4) {
				if (local11 < Static84.anInt1939) {
					if (!this.method1325(local11 + 128, local26, local15)) {
						return false;
					}
					if (!this.method1325(local11 + 128, local26, local15 + 128)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!this.method1325(local11 + 128, local30, local15)) {
						return false;
					}
					if (!this.method1325(local11 + 128, local30, local15 + 128)) {
						return false;
					}
				}
				if (!this.method1325(local11 + 128, local34, local15)) {
					return false;
				}
				if (!this.method1325(local11 + 128, local34, local15 + 128)) {
					return false;
				}
				return true;
			}
			if (arg3 == 8) {
				if (local15 > Static84.anInt1944) {
					if (!this.method1325(local11, local26, local15)) {
						return false;
					}
					if (!this.method1325(local11 + 128, local26, local15)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!this.method1325(local11, local30, local15)) {
						return false;
					}
					if (!this.method1325(local11 + 128, local30, local15)) {
						return false;
					}
				}
				if (!this.method1325(local11, local34, local15)) {
					return false;
				}
				if (!this.method1325(local11 + 128, local34, local15)) {
					return false;
				}
				return true;
			}
		}
		if (!this.method1325(local11 + 64, local38, local15 + 64)) {
			return false;
		} else if (arg3 == 16) {
			return this.method1325(local11, local34, local15 + 128);
		} else if (arg3 == 32) {
			return this.method1325(local11 + 128, local34, local15 + 128);
		} else if (arg3 == 64) {
			return this.method1325(local11 + 128, local34, local15);
		} else if (arg3 == 128) {
			return this.method1325(local11, local34, local15);
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!qa", name = "d", descriptor = "()V")
	public void method1349() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt1938; local1++) {
			@Pc(7) Class38 local7 = this.aClass38Array2[local1];
			this.method1330(local7);
			this.aClass38Array2[local1] = null;
		}
		this.anInt1938 = 0;
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lclient!cb;IIIIII)V")
	private void method1350(@OriginalArg(0) Class12 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(3) int local3 = arg0.anIntArray30.length;
		@Pc(13) int local13;
		@Pc(20) int local20;
		@Pc(27) int local27;
		@Pc(37) int local37;
		for (@Pc(5) int local5 = 0; local5 < local3; local5++) {
			local13 = arg0.anIntArray30[local5] - Static84.anInt1939;
			local20 = arg0.anIntArray19[local5] - Static84.anInt1952;
			local27 = arg0.anIntArray23[local5] - Static84.anInt1944;
			local37 = local27 * arg3 + local13 * arg4 >> 16;
			@Pc(47) int local47 = local27 * arg4 - local13 * arg3 >> 16;
			@Pc(59) int local59 = local20 * arg2 - local47 * arg1 >> 16;
			@Pc(69) int local69 = local20 * arg1 + local47 * arg2 >> 16;
			if (local69 < 50) {
				return;
			}
			if (arg0.anIntArray21 != null) {
				Static14.anIntArray22[local5] = local37;
				Static14.anIntArray24[local5] = local59;
				Static14.anIntArray28[local5] = local69;
			}
			Static14.anIntArray18[local5] = Static99.anInt2402 + (local37 << 9) / local69;
			Static14.anIntArray26[local5] = Static99.anInt2403 + (local59 << 9) / local69;
		}
		Static99.anInt2395 = 0;
		local3 = arg0.anIntArray29.length;
		for (local13 = 0; local13 < local3; local13++) {
			local20 = arg0.anIntArray29[local13];
			local27 = arg0.anIntArray27[local13];
			local37 = arg0.anIntArray25[local13];
			@Pc(142) int local142 = Static14.anIntArray18[local20];
			@Pc(146) int local146 = Static14.anIntArray18[local27];
			@Pc(150) int local150 = Static14.anIntArray18[local37];
			@Pc(154) int local154 = Static14.anIntArray26[local20];
			@Pc(158) int local158 = Static14.anIntArray26[local27];
			@Pc(162) int local162 = Static14.anIntArray26[local37];
			if ((local142 - local146) * (local162 - local158) - (local154 - local158) * (local150 - local146) > 0) {
				Static99.aBoolean201 = false;
				if (local142 < 0 || local146 < 0 || local150 < 0 || local142 > Static99.anInt2399 || local146 > Static99.anInt2399 || local150 > Static99.anInt2399) {
					Static99.aBoolean201 = true;
				}
				if (Static84.aBoolean148 && this.method1306(Static84.anInt1937, Static84.anInt1935, local154, local158, local162, local142, local146, local150)) {
					Static84.anInt1949 = arg5;
					Static84.anInt1941 = arg6;
				}
				if (arg0.anIntArray21 == null || arg0.anIntArray21[local13] == -1) {
					if (arg0.anIntArray17[local13] != 12345678) {
						Static99.method1602(local154, local158, local162, local142, local146, local150, arg0.anIntArray17[local13], arg0.anIntArray20[local13], arg0.anIntArray16[local13]);
					}
				} else if (Static84.aBoolean149) {
					@Pc(364) int local364 = Static99.anInterface2_1.method960(arg0.anIntArray21[local13]);
					Static99.method1602(local154, local158, local162, local142, local146, local150, Static84.method1300(local364, arg0.anIntArray17[local13]), Static84.method1300(local364, arg0.anIntArray20[local13]), Static84.method1300(local364, arg0.anIntArray16[local13]));
				} else if (arg0.aBoolean24) {
					Static99.method1604(local154, local158, local162, local142, local146, local150, arg0.anIntArray17[local13], arg0.anIntArray20[local13], arg0.anIntArray16[local13], Static14.anIntArray22[0], Static14.anIntArray22[1], Static14.anIntArray22[3], Static14.anIntArray24[0], Static14.anIntArray24[1], Static14.anIntArray24[3], Static14.anIntArray28[0], Static14.anIntArray28[1], Static14.anIntArray28[3], arg0.anIntArray21[local13]);
				} else {
					Static99.method1604(local154, local158, local162, local142, local146, local150, arg0.anIntArray17[local13], arg0.anIntArray20[local13], arg0.anIntArray16[local13], Static14.anIntArray22[local20], Static14.anIntArray22[local27], Static14.anIntArray22[local37], Static14.anIntArray24[local20], Static14.anIntArray24[local27], Static14.anIntArray24[local37], Static14.anIntArray28[local20], Static14.anIntArray28[local27], Static14.anIntArray28[local37], arg0.anIntArray21[local13]);
				}
			}
		}
	}

	@OriginalMember(owner = "client!qa", name = "q", descriptor = "(III)V")
	public void method1351(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class3_Sub11 local8 = this.aClass3_Sub11ArrayArrayArray1[arg0][arg1][arg2];
		if (local8 == null) {
			return;
		}
		for (@Pc(13) int local13 = 0; local13 < local8.anInt2694; local13++) {
			@Pc(19) Class38 local19 = local8.aClass38Array3[local13];
			if ((local19.anInt1221 >> 29 & 0x3) == 2 && local19.anInt1210 == arg1 && local19.anInt1218 == arg2) {
				this.method1330(local19);
				return;
			}
		}
	}
}
