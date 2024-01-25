import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static555 {

	@OriginalMember(owner = "client!rk", name = "i", descriptor = "Lclient!bka;")
	public static Class9 aClass9_30;

	@OriginalMember(owner = "client!rk", name = "e", descriptor = "Z")
	public static boolean aBoolean678 = false;

	@OriginalMember(owner = "client!rk", name = "d", descriptor = "Lclient!pda;")
	public static final Class283 aClass283_12 = new Class283();

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "(IBI)Lclient!tq;")
	public static Class360 method7788(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(15) Class360 local15 = new Class360();
		local15.anInt10125 = arg1 + 5 + 1;
		local15.anInt10108 = -1;
		local15.anInt10104 = arg0 + 1 + 5;
		local15.anInt10114 = -1;
		local15.anIntArrayArray56 = new int[local15.anInt10104][local15.anInt10125];
		local15.method8481();
		return local15;
	}

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "(Lclient!tq;ZIIIIIIIII)Z")
	public static boolean method7790(@OriginalArg(0) Class360 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		@Pc(7) int local7 = arg5;
		@Pc(9) int local9 = arg9;
		@Pc(24) int local24 = arg5 - 64;
		Static407.anIntArrayArray40[64][64] = 99;
		@Pc(35) int local35 = arg9 - 64;
		Static717.anIntArrayArray62[64][64] = 0;
		@Pc(43) byte local43 = 0;
		@Pc(45) int local45 = 0;
		Static198.anIntArray177[0] = arg5;
		@Pc(52) int local52 = local43 + 1;
		Static469.anIntArray88[0] = arg9;
		@Pc(57) int[][] local57 = arg0.anIntArrayArray56;
		while (local52 != local45) {
			local9 = Static469.anIntArray88[local45];
			local7 = Static198.anIntArray177[local45];
			@Pc(73) int local73 = local7 - arg0.anInt10108;
			@Pc(78) int local78 = local7 - local24;
			local45 = local45 + 1 & 0xFFF;
			@Pc(90) int local90 = local9 - arg0.anInt10114;
			@Pc(95) int local95 = local9 - local35;
			if (arg6 == -4) {
				if (arg1 == local7 && local9 == arg8) {
					Static282.anInt5124 = local9;
					Static633.anInt3424 = local7;
					return true;
				}
			} else if (arg6 == -3) {
				if (Static85.method1104(arg1, 1, local7, arg2, 1, arg8, arg4, local9)) {
					Static282.anInt5124 = local9;
					Static633.anInt3424 = local7;
					return true;
				}
			} else if (arg6 == -2) {
				if (arg0.method8488(arg4, local7, local9, 1, arg3, arg1, arg8, arg2, 1)) {
					Static282.anInt5124 = local9;
					Static633.anInt3424 = local7;
					return true;
				}
			} else if (arg6 == -1) {
				if (arg0.method8494(arg4, 1, arg3, local7, arg8, arg2, arg1, local9)) {
					Static282.anInt5124 = local9;
					Static633.anInt3424 = local7;
					return true;
				}
			} else if (arg6 == 0 || arg6 == 1 || arg6 == 2 || arg6 == 3 || arg6 == 9) {
				if (arg0.method8485(arg1, 1, local9, local7, arg7, arg6, arg8)) {
					Static282.anInt5124 = local9;
					Static633.anInt3424 = local7;
					return true;
				}
			} else if (arg0.method8493(arg7, arg6, local7, arg8, 1, arg1, local9)) {
				Static633.anInt3424 = local7;
				Static282.anInt5124 = local9;
				return true;
			}
			@Pc(275) int local275 = Static717.anIntArrayArray62[local78][local95] + 1;
			if (local78 > 0 && Static407.anIntArrayArray40[local78 - 1][local95] == 0 && (local57[local73 - 1][local90] & 0x42240000) == 0) {
				Static198.anIntArray177[local52] = local7 - 1;
				Static469.anIntArray88[local52] = local9;
				Static407.anIntArrayArray40[local78 - 1][local95] = 2;
				local52 = local52 + 1 & 0xFFF;
				Static717.anIntArrayArray62[local78 - 1][local95] = local275;
			}
			if (local78 < 127 && Static407.anIntArrayArray40[local78 + 1][local95] == 0 && (local57[local73 + 1][local90] & 0x60240000) == 0) {
				Static198.anIntArray177[local52] = local7 + 1;
				Static469.anIntArray88[local52] = local9;
				Static407.anIntArrayArray40[local78 + 1][local95] = 8;
				local52 = local52 + 1 & 0xFFF;
				Static717.anIntArrayArray62[local78 + 1][local95] = local275;
			}
			if (local95 > 0 && Static407.anIntArrayArray40[local78][local95 - 1] == 0 && (local57[local73][local90 - 1] & 0x40A40000) == 0) {
				Static198.anIntArray177[local52] = local7;
				Static469.anIntArray88[local52] = local9 - 1;
				Static407.anIntArrayArray40[local78][local95 - 1] = 1;
				local52 = local52 + 1 & 0xFFF;
				Static717.anIntArrayArray62[local78][local95 - 1] = local275;
			}
			if (local95 < 127 && Static407.anIntArrayArray40[local78][local95 + 1] == 0 && (local57[local73][local90 + 1] & 0x48240000) == 0) {
				Static198.anIntArray177[local52] = local7;
				Static469.anIntArray88[local52] = local9 + 1;
				Static407.anIntArrayArray40[local78][local95 + 1] = 4;
				local52 = local52 + 1 & 0xFFF;
				Static717.anIntArrayArray62[local78][local95 + 1] = local275;
			}
			if (local78 > 0 && local95 > 0 && Static407.anIntArrayArray40[local78 - 1][local95 - 1] == 0 && (local57[local73 - 1][local90 - 1] & 0x43A40000) == 0 && (local57[local73 - 1][local90] & 0x42240000) == 0 && (local57[local73][local90 - 1] & 0x40A40000) == 0) {
				Static198.anIntArray177[local52] = local7 - 1;
				Static469.anIntArray88[local52] = local9 - 1;
				Static407.anIntArrayArray40[local78 - 1][local95 - 1] = 3;
				local52 = local52 + 1 & 0xFFF;
				Static717.anIntArrayArray62[local78 - 1][local95 - 1] = local275;
			}
			if (local78 < 127 && local95 > 0 && Static407.anIntArrayArray40[local78 + 1][local95 - 1] == 0 && (local57[local73 + 1][local90 - 1] & 0x60E40000) == 0 && (local57[local73 + 1][local90] & 0x60240000) == 0 && (local57[local73][local90 - 1] & 0x40A40000) == 0) {
				Static198.anIntArray177[local52] = local7 + 1;
				Static469.anIntArray88[local52] = local9 - 1;
				Static407.anIntArrayArray40[local78 + 1][local95 - 1] = 9;
				local52 = local52 + 1 & 0xFFF;
				Static717.anIntArrayArray62[local78 + 1][local95 - 1] = local275;
			}
			if (local78 > 0 && local95 < 127 && Static407.anIntArrayArray40[local78 - 1][local95 + 1] == 0 && (local57[local73 - 1][local90 + 1] & 0x4E240000) == 0 && (local57[local73 - 1][local90] & 0x42240000) == 0 && (local57[local73][local90 + 1] & 0x48240000) == 0) {
				Static198.anIntArray177[local52] = local7 - 1;
				Static469.anIntArray88[local52] = local9 + 1;
				Static407.anIntArrayArray40[local78 - 1][local95 + 1] = 6;
				local52 = local52 + 1 & 0xFFF;
				Static717.anIntArrayArray62[local78 - 1][local95 + 1] = local275;
			}
			if (local78 < 127 && local95 < 127 && Static407.anIntArrayArray40[local78 + 1][local95 + 1] == 0 && (local57[local73 + 1][local90 + 1] & 0x78240000) == 0 && (local57[local73 + 1][local90] & 0x60240000) == 0 && (local57[local73][local90 + 1] & 0x48240000) == 0) {
				Static198.anIntArray177[local52] = local7 + 1;
				Static469.anIntArray88[local52] = local9 + 1;
				Static407.anIntArrayArray40[local78 + 1][local95 + 1] = 12;
				local52 = local52 + 1 & 0xFFF;
				Static717.anIntArrayArray62[local78 + 1][local95 + 1] = local275;
			}
		}
		Static633.anInt3424 = local7;
		Static282.anInt5124 = local9;
		return false;
	}

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "(Ljava/lang/String;II)I")
	public static int method7791(@OriginalArg(0) String arg0) {
		return Static518.method7385(arg0, 16);
	}
}
