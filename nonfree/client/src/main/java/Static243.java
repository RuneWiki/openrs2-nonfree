import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static243 {

	@OriginalMember(owner = "client!pj", name = "O", descriptor = "Lclient!wn;")
	public static Class82 aClass82_1;

	@OriginalMember(owner = "client!pj", name = "P", descriptor = "[I")
	public static int[] anIntArray642;

	@OriginalMember(owner = "client!pj", name = "R", descriptor = "F")
	public static float aFloat68;

	@OriginalMember(owner = "client!pj", name = "U", descriptor = "I")
	public static int anInt4806;

	@OriginalMember(owner = "client!pj", name = "H", descriptor = "I")
	public static int anInt4797 = 2;

	@OriginalMember(owner = "client!pj", name = "I", descriptor = "I")
	public static int anInt4798 = 0;

	@OriginalMember(owner = "client!pj", name = "K", descriptor = "Lclient!td;")
	public static final Class191 aClass191_5 = new Class191();

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(BIIIILclient!oa;IIIII)Z")
	public static boolean method4199(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class149 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		@Pc(5) int local5 = arg9;
		@Pc(7) int local7 = arg8;
		@Pc(16) int local16 = arg9 - 64;
		@Pc(21) int local21 = arg8 - 64;
		Static218.anIntArrayArray34[64][64] = 99;
		Static342.anIntArrayArray56[64][64] = 0;
		@Pc(35) byte local35 = 0;
		Static197.anIntArray538[0] = arg9;
		@Pc(41) int local41 = 0;
		@Pc(44) int local44 = local35 + 1;
		Static354.anIntArray851[0] = arg8;
		@Pc(57) int[][] local57 = arg4.anIntArrayArray36;
		while (local44 != local41) {
			local5 = Static197.anIntArray538[local41];
			local7 = Static354.anIntArray851[local41];
			@Pc(71) int local71 = local5 - local16;
			@Pc(75) int local75 = local7 - local21;
			local41 = local41 + 1 & 0xFFF;
			@Pc(87) int local87 = local5 - arg4.anInt4488;
			@Pc(92) int local92 = local7 - arg4.anInt4484;
			if (arg5 == -4) {
				if (local5 == arg7 && local7 == arg6) {
					Static76.anInt1897 = local7;
					Static138.anInt3014 = local5;
					return true;
				}
			} else if (arg5 == -3) {
				if (Static241.method4148(arg3, local5, arg7, 2, local7, arg0, arg6, 2)) {
					Static138.anInt3014 = local5;
					Static76.anInt1897 = local7;
					return true;
				}
			} else if (arg5 == -2) {
				if (arg4.method3956(2, arg6, local7, local5, arg7, arg0, arg1, arg3, 2)) {
					Static76.anInt1897 = local7;
					Static138.anInt3014 = local5;
					return true;
				}
			} else if (arg5 == -1) {
				if (arg4.method3951(arg1, arg6, arg7, local5, 2, local7, arg3, arg0)) {
					Static76.anInt1897 = local7;
					Static138.anInt3014 = local5;
					return true;
				}
			} else if (arg5 == 0 || arg5 == 1 || arg5 == 2 || arg5 == 3 || arg5 == 9) {
				if (arg4.method3950(2, arg7, arg5, arg6, local5, local7, arg2)) {
					Static76.anInt1897 = local7;
					Static138.anInt3014 = local5;
					return true;
				}
			} else if (arg4.method3960(arg5, arg2, 2, arg6, local5, local7, arg7)) {
				Static138.anInt3014 = local5;
				Static76.anInt1897 = local7;
				return true;
			}
			@Pc(233) int local233 = Static342.anIntArrayArray56[local71][local75] + 1;
			if (local71 > 0 && Static218.anIntArrayArray34[local71 - 1][local75] == 0 && (local57[local87 - 1][local92] & 0x43A40000) == 0 && (local57[local87 - 1][local92 + 1] & 0x4E240000) == 0) {
				Static197.anIntArray538[local44] = local5 - 1;
				Static354.anIntArray851[local44] = local7;
				Static218.anIntArrayArray34[local71 - 1][local75] = 2;
				local44 = local44 + 1 & 0xFFF;
				Static342.anIntArrayArray56[local71 - 1][local75] = local233;
			}
			if (local71 < 126 && Static218.anIntArrayArray34[local71 + 1][local75] == 0 && (local57[local87 + 2][local92] & 0x60E40000) == 0 && (local57[local87 + 2][local92 + 1] & 0x78240000) == 0) {
				Static197.anIntArray538[local44] = local5 + 1;
				Static354.anIntArray851[local44] = local7;
				local44 = local44 + 1 & 0xFFF;
				Static218.anIntArrayArray34[local71 + 1][local75] = 8;
				Static342.anIntArrayArray56[local71 + 1][local75] = local233;
			}
			if (local75 > 0 && Static218.anIntArrayArray34[local71][local75 - 1] == 0 && (local57[local87][local92 - 1] & 0x43A40000) == 0 && (local57[local87 + 1][local92 - 1] & 0x60E40000) == 0) {
				Static197.anIntArray538[local44] = local5;
				Static354.anIntArray851[local44] = local7 - 1;
				local44 = local44 + 1 & 0xFFF;
				Static218.anIntArrayArray34[local71][local75 - 1] = 1;
				Static342.anIntArrayArray56[local71][local75 - 1] = local233;
			}
			if (local75 < 126 && Static218.anIntArrayArray34[local71][local75 + 1] == 0 && (local57[local87][local92 + 2] & 0x4E240000) == 0 && (local57[local87 + 1][local92 + 2] & 0x78240000) == 0) {
				Static197.anIntArray538[local44] = local5;
				Static354.anIntArray851[local44] = local7 + 1;
				local44 = local44 + 1 & 0xFFF;
				Static218.anIntArrayArray34[local71][local75 + 1] = 4;
				Static342.anIntArrayArray56[local71][local75 + 1] = local233;
			}
			if (local71 > 0 && local75 > 0 && Static218.anIntArrayArray34[local71 - 1][local75 - 1] == 0 && (local57[local87 - 1][local92] & 0x4FA40000) == 0 && (local57[local87 - 1][local92 - 1] & 0x43A40000) == 0 && (local57[local87][local92 - 1] & 0x63E40000) == 0) {
				Static197.anIntArray538[local44] = local5 - 1;
				Static354.anIntArray851[local44] = local7 - 1;
				Static218.anIntArrayArray34[local71 - 1][local75 - 1] = 3;
				local44 = local44 + 1 & 0xFFF;
				Static342.anIntArrayArray56[local71 - 1][local75 - 1] = local233;
			}
			if (local71 < 126 && local75 > 0 && Static218.anIntArrayArray34[local71 + 1][local75 - 1] == 0 && (local57[local87 + 1][local92 - 1] & 0x63E40000) == 0 && (local57[local87 + 2][local92 - 1] & 0x60E40000) == 0 && (local57[local87 + 2][local92] & 0x78E40000) == 0) {
				Static197.anIntArray538[local44] = local5 + 1;
				Static354.anIntArray851[local44] = local7 - 1;
				local44 = local44 + 1 & 0xFFF;
				Static218.anIntArrayArray34[local71 + 1][local75 - 1] = 9;
				Static342.anIntArrayArray56[local71 + 1][local75 - 1] = local233;
			}
			if (local71 > 0 && local75 < 126 && Static218.anIntArrayArray34[local71 - 1][local75 + 1] == 0 && (local57[local87 - 1][local92 + 1] & 0x4FA40000) == 0 && (local57[local87 - 1][local92 + 2] & 0x4E240000) == 0 && (local57[local87][local92 + 2] & 0x7E240000) == 0) {
				Static197.anIntArray538[local44] = local5 - 1;
				Static354.anIntArray851[local44] = local7 + 1;
				local44 = local44 + 1 & 0xFFF;
				Static218.anIntArrayArray34[local71 - 1][local75 + 1] = 6;
				Static342.anIntArrayArray56[local71 - 1][local75 + 1] = local233;
			}
			if (local71 < 126 && local75 < 126 && Static218.anIntArrayArray34[local71 + 1][local75 + 1] == 0 && (local57[local87 + 1][local92 + 2] & 0x7E240000) == 0 && (local57[local87 + 2][local92 + 2] & 0x78240000) == 0 && (local57[local87 + 2][local92 + 1] & 0x78E40000) == 0) {
				Static197.anIntArray538[local44] = local5 + 1;
				Static354.anIntArray851[local44] = local7 + 1;
				Static218.anIntArrayArray34[local71 + 1][local75 + 1] = 12;
				local44 = local44 + 1 & 0xFFF;
				Static342.anIntArrayArray56[local71 + 1][local75 + 1] = local233;
			}
		}
		Static138.anInt3014 = local5;
		Static76.anInt1897 = local7;
		return false;
	}

	@OriginalMember(owner = "client!pj", name = "b", descriptor = "(II)Lclient!sk;")
	public static Class184 method4200(@OriginalArg(0) int arg0) {
		@Pc(5) Class103 local5 = Static299.aClass103_61;
		@Pc(14) Class184 local14;
		synchronized (Static299.aClass103_61) {
			local14 = (Class184) Static299.aClass103_61.method2682((long) arg0);
		}
		if (local14 != null) {
			return local14;
		}
		@Pc(30) byte[] local30 = Static308.aClass180_86.method4560(arg0, 16);
		local14 = new Class184();
		if (local30 != null) {
			local14.method4751(new Class7_Sub3(local30));
		}
		@Pc(52) Class103 local52 = Static299.aClass103_61;
		synchronized (Static299.aClass103_61) {
			Static299.aClass103_61.method2687(local14, (long) arg0);
			return local14;
		}
	}
}
