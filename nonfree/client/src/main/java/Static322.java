import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static322 {

	@OriginalMember(owner = "client!kca", name = "d", descriptor = "I")
	public static int anInt4929;

	@OriginalMember(owner = "client!kca", name = "g", descriptor = "[I")
	public static final int[] anIntArray352 = new int[] { 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 120 };

	@OriginalMember(owner = "client!kca", name = "a", descriptor = "(I)V")
	public static void method4458() {
		Static466.anInt7550 = 0;
		Static368.anInt5896 = 0;
		for (@Pc(18) int local18 = 0; local18 < Static331.anInt5059; local18++) {
			@Pc(24) int local24 = local18 * Static59.anInt1029;
			for (@Pc(26) int local26 = 0; local26 < Static59.anInt1029; local26++) {
				@Pc(33) int local33 = local24 + local26;
				Class4_Sub2_Sub1_Sub1.lb[local33].method9367(Static405.anInt6687 * local26, local18 * Static136.anInt2255, Static405.anInt6687, Static136.anInt2255, true);
			}
		}
	}

	@OriginalMember(owner = "client!kca", name = "a", descriptor = "(III)V")
	public static void method4459(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (Static614.aClass145_14 == null) {
			return;
		}
		@Pc(11) int local11 = Static59.anInt1029;
		@Pc(13) int local13 = Static331.anInt5059;
		Static558.method7794(arg0, arg1);
		if (Static240.anInt10701 == 0) {
			Static136.anInterface1_1 = null;
			Static136.anInterface1_1 = Static614.aClass145_14.method9697(Static614.aClass145_14.method9657(Static501.anInt5842, Static23.anInt6817), Static614.aClass145_14.method9645(Static501.anInt5842, Static23.anInt6817));
		} else if (Static240.anInt10701 == 1 && (Class4_Sub2_Sub1_Sub1.lb == null || local11 != Static59.anInt1029 || local13 != Static331.anInt5059)) {
			Class4_Sub2_Sub1_Sub1.lb = new Interface1[Static59.anInt1029 * Static331.anInt5059];
			for (@Pc(71) int local71 = 0; local71 < Class4_Sub2_Sub1_Sub1.lb.length; local71++) {
				Class4_Sub2_Sub1_Sub1.lb[local71] = Static614.aClass145_14.method9697(Static614.aClass145_14.method9657(Static405.anInt6687, Static136.anInt2255), Static614.aClass145_14.method9645(Static405.anInt6687, Static136.anInt2255));
			}
			Static388.anInt6469 = 1;
			Static627.anIntArray698 = new int[Static59.anInt1029 * Static331.anInt5059];
		}
		Static415.aBoolean615 = true;
	}

	@OriginalMember(owner = "client!kca", name = "a", descriptor = "(IIIIIIII)V")
	public static void method4460(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg0 >= Static8.anInt99 && Static14.anInt206 >= arg3 && Static617.anInt9501 <= arg6 && arg4 <= Static519.anInt8267) {
			Static427.method6249(arg0, arg2, arg4, arg5, arg1, arg3, arg6);
		} else {
			Static274.method3833(arg3, arg6, arg2, arg0, arg4, arg1, arg5);
		}
	}

	@OriginalMember(owner = "client!kca", name = "a", descriptor = "(IIZIIILclient!lka;I[II[IIIII)I")
	public static int method4462(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class226 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int[] arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int[] arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11, @OriginalArg(13) int arg12, @OriginalArg(14) int arg13) {
		for (@Pc(13) int local13 = 0; local13 < 128; local13++) {
			for (@Pc(19) int local19 = 0; local19 < 128; local19++) {
				Static313.anIntArrayArray38[local13][local19] = 0;
				Static171.anIntArrayArray19[local13][local19] = 99999999;
			}
		}
		@Pc(77) boolean local77;
		if (arg12 == 1) {
			local77 = Static698.method9383(arg4, arg13, arg3, arg10, arg11, arg8, arg6, arg1, arg0, arg5);
		} else if (arg12 == 2) {
			local77 = Static330.method4581(arg4, arg8, arg11, arg3, arg13, arg1, arg0, arg6, arg5, arg10);
		} else {
			local77 = Static538.method7530(arg8, arg3, arg11, arg5, arg12, arg4, arg1, arg13, arg10, arg0, arg6);
		}
		@Pc(111) int local111 = arg10 - 64;
		@Pc(115) int local115 = arg3 - 64;
		@Pc(117) int local117 = Static313.anInt4796;
		@Pc(119) int local119 = Static653.anInt10222;
		@Pc(127) int local127;
		@Pc(129) int local129;
		@Pc(136) int local136;
		if (!local77) {
			if (!arg2) {
				return -1;
			}
			local127 = Integer.MAX_VALUE;
			local129 = Integer.MAX_VALUE;
			for (local136 = arg1 - 10; local136 <= arg1 + 10; local136++) {
				for (@Pc(145) int local145 = arg6 - 10; local145 <= arg6 + 10; local145++) {
					@Pc(151) int local151 = local136 - local111;
					@Pc(156) int local156 = local145 - local115;
					if (local151 >= 0 && local156 >= 0 && local151 < 128 && local156 < 128 && Static171.anIntArrayArray19[local151][local156] < 100) {
						@Pc(188) int local188 = 0;
						if (arg1 > local136) {
							local188 = arg1 - local136;
						} else if (arg1 + arg4 - 1 < local136) {
							local188 = local136 + 1 - arg1 - arg4;
						}
						@Pc(223) int local223 = 0;
						if (arg6 > local145) {
							local223 = arg6 - local145;
						} else if (arg6 + arg11 - 1 < local145) {
							local223 = local145 + 1 - arg6 - arg11;
						}
						@Pc(260) int local260 = local188 * local188 + local223 * local223;
						if (local127 > local260 || local127 == local260 && Static171.anIntArrayArray19[local151][local156] < local129) {
							local117 = local136;
							local127 = local260;
							local119 = local145;
							local129 = Static171.anIntArrayArray19[local151][local156];
						}
					}
				}
			}
			if (local127 == Integer.MAX_VALUE) {
				return -1;
			}
		}
		if (local117 == arg10 && local119 == arg3) {
			return 0;
		}
		@Pc(341) byte local341 = 0;
		Static564.anIntArray640[0] = local117;
		local127 = local341 + 1;
		Static585.anIntArray674[0] = local119;
		@Pc(363) int local363;
		local129 = local363 = Static313.anIntArrayArray38[local117 - local111][local119 - local115];
		while (arg10 != local117 || local119 != arg3) {
			if (local129 != local363) {
				Static564.anIntArray640[local127] = local117;
				local363 = local129;
				Static585.anIntArray674[local127++] = local119;
			}
			if ((local129 & 0x1) != 0) {
				local119++;
			} else if ((local129 & 0x4) != 0) {
				local119--;
			}
			if ((local129 & 0x2) != 0) {
				local117++;
			} else if ((local129 & 0x8) != 0) {
				local117--;
			}
			local129 = Static313.anIntArrayArray38[local117 - local111][local119 - local115];
		}
		local136 = 0;
		while (local127-- > 0) {
			arg7[local136] = Static564.anIntArray640[local127];
			arg9[local136++] = Static585.anIntArray674[local127];
			if (arg7.length <= local136) {
				break;
			}
		}
		return local136;
	}
}
