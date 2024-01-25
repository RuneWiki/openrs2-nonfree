import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static341 {

	@OriginalMember(owner = "client!oda", name = "J", descriptor = "Lclient!ha;")
	public static Class12 aClass12_13;

	@OriginalMember(owner = "client!oda", name = "B", descriptor = "I")
	public static int anInt6379 = 100;

	@OriginalMember(owner = "client!oda", name = "H", descriptor = "Lclient!h;")
	public static final Class114 aClass114_124 = new Class114(" ", ": ", " ", " ");

	@OriginalMember(owner = "client!oda", name = "I", descriptor = "Z")
	public static boolean aBoolean425 = false;

	@OriginalMember(owner = "client!oda", name = "K", descriptor = "I")
	public static int anInt6385 = -1;

	@OriginalMember(owner = "client!oda", name = "a", descriptor = "(Lclient!vp;IZ)V")
	public static void method5527(@OriginalArg(0) Class309 arg0, @OriginalArg(2) boolean arg1) {
		@Pc(15) int local15 = arg0.anInt8807 == 0 ? arg0.anInt8790 : arg0.anInt8807;
		@Pc(27) int local27 = arg0.anInt8775 == 0 ? arg0.anInt8752 : arg0.anInt8775;
		Static154.method3119(Static352.aClass309ArrayArray2[arg0.anInt8750 >> 16], arg1, local15, arg0.anInt8750, local27);
		if (arg0.lb != null) {
			Static154.method3119(arg0.lb, arg1, local15, arg0.anInt8750, local27);
		}
		@Pc(67) Class1_Sub5 local67 = (Class1_Sub5) Static484.aClass174_32.method4422((long) arg0.anInt8750);
		if (local67 != null) {
			Static321.method5259(local67.anInt1389, local15, arg1, local27);
		}
	}

	@OriginalMember(owner = "client!oda", name = "a", descriptor = "(ILclient!vba;IIIIBIIII)Z")
	public static boolean method5528(@OriginalArg(0) int arg0, @OriginalArg(1) Class299 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		@Pc(5) int local5 = arg9;
		@Pc(7) int local7 = arg3;
		@Pc(16) int local16 = arg9 - 64;
		Static355.anIntArrayArray24[64][64] = 99;
		@Pc(26) int local26 = arg3 - 64;
		Static143.anIntArrayArray30[64][64] = 0;
		@Pc(34) byte local34 = 0;
		@Pc(36) int local36 = 0;
		Static460.anIntArray620[0] = arg9;
		@Pc(43) int local43 = local34 + 1;
		Static529.anIntArray773[0] = arg3;
		@Pc(48) int[][] local48 = arg1.anIntArrayArray84;
		while (local43 != local36) {
			local5 = Static460.anIntArray620[local36];
			local7 = Static529.anIntArray773[local36];
			@Pc(68) int local68 = local5 - arg1.anInt8548;
			@Pc(73) int local73 = local5 - local16;
			@Pc(77) int local77 = local7 - local26;
			local36 = local36 + 1 & 0xFFF;
			@Pc(88) int local88 = local7 - arg1.anInt8569;
			if (arg5 == -4) {
				if (arg4 == local5 && local7 == arg8) {
					Static144.anInt3323 = local5;
					Static504.anInt8566 = local7;
					return true;
				}
			} else if (arg5 == -3) {
				if (Static76.method1970(1, arg4, local5, local7, arg7, arg8, arg2, 1)) {
					Static504.anInt8566 = local7;
					Static144.anInt3323 = local5;
					return true;
				}
			} else if (arg5 == -2) {
				if (arg1.method7242(local5, arg7, 1, arg0, 1, local7, arg4, arg2, arg8)) {
					Static504.anInt8566 = local7;
					Static144.anInt3323 = local5;
					return true;
				}
			} else if (arg5 == -1) {
				if (arg1.method7227(arg8, 1, arg4, local5, arg7, local7, arg0, arg2)) {
					Static144.anInt3323 = local5;
					Static504.anInt8566 = local7;
					return true;
				}
			} else if (arg5 == 0 || arg5 == 1 || arg5 == 2 || arg5 == 3 || arg5 == 9) {
				if (arg1.method7240(arg8, local7, 1, arg6, arg4, arg5, local5)) {
					Static144.anInt3323 = local5;
					Static504.anInt8566 = local7;
					return true;
				}
			} else if (arg1.method7236(1, local7, arg8, arg4, arg5, arg6, local5)) {
				Static504.anInt8566 = local7;
				Static144.anInt3323 = local5;
				return true;
			}
			@Pc(245) int local245 = Static143.anIntArrayArray30[local73][local77] + 1;
			if (local73 > 0 && Static355.anIntArrayArray24[local73 - 1][local77] == 0 && (local48[local68 - 1][local88] & 0x42240000) == 0) {
				Static460.anIntArray620[local43] = local5 - 1;
				Static529.anIntArray773[local43] = local7;
				local43 = local43 + 1 & 0xFFF;
				Static355.anIntArrayArray24[local73 - 1][local77] = 2;
				Static143.anIntArrayArray30[local73 - 1][local77] = local245;
			}
			if (local73 < 127 && Static355.anIntArrayArray24[local73 + 1][local77] == 0 && (local48[local68 + 1][local88] & 0x60240000) == 0) {
				Static460.anIntArray620[local43] = local5 + 1;
				Static529.anIntArray773[local43] = local7;
				Static355.anIntArrayArray24[local73 + 1][local77] = 8;
				local43 = local43 + 1 & 0xFFF;
				Static143.anIntArrayArray30[local73 + 1][local77] = local245;
			}
			if (local77 > 0 && Static355.anIntArrayArray24[local73][local77 - 1] == 0 && (local48[local68][local88 - 1] & 0x40A40000) == 0) {
				Static460.anIntArray620[local43] = local5;
				Static529.anIntArray773[local43] = local7 - 1;
				local43 = local43 + 1 & 0xFFF;
				Static355.anIntArrayArray24[local73][local77 - 1] = 1;
				Static143.anIntArrayArray30[local73][local77 - 1] = local245;
			}
			if (local77 < 127 && Static355.anIntArrayArray24[local73][local77 + 1] == 0 && (local48[local68][local88 + 1] & 0x48240000) == 0) {
				Static460.anIntArray620[local43] = local5;
				Static529.anIntArray773[local43] = local7 + 1;
				Static355.anIntArrayArray24[local73][local77 + 1] = 4;
				local43 = local43 + 1 & 0xFFF;
				Static143.anIntArrayArray30[local73][local77 + 1] = local245;
			}
			if (local73 > 0 && local77 > 0 && Static355.anIntArrayArray24[local73 - 1][local77 - 1] == 0 && (local48[local68 - 1][local88 - 1] & 0x43A40000) == 0 && (local48[local68 - 1][local88] & 0x42240000) == 0 && (local48[local68][local88 - 1] & 0x40A40000) == 0) {
				Static460.anIntArray620[local43] = local5 - 1;
				Static529.anIntArray773[local43] = local7 - 1;
				Static355.anIntArrayArray24[local73 - 1][local77 - 1] = 3;
				local43 = local43 + 1 & 0xFFF;
				Static143.anIntArrayArray30[local73 - 1][local77 - 1] = local245;
			}
			if (local73 < 127 && local77 > 0 && Static355.anIntArrayArray24[local73 + 1][local77 - 1] == 0 && (local48[local68 + 1][local88 - 1] & 0x60E40000) == 0 && (local48[local68 + 1][local88] & 0x60240000) == 0 && (local48[local68][local88 - 1] & 0x40A40000) == 0) {
				Static460.anIntArray620[local43] = local5 + 1;
				Static529.anIntArray773[local43] = local7 - 1;
				Static355.anIntArrayArray24[local73 + 1][local77 - 1] = 9;
				local43 = local43 + 1 & 0xFFF;
				Static143.anIntArrayArray30[local73 + 1][local77 - 1] = local245;
			}
			if (local73 > 0 && local77 < 127 && Static355.anIntArrayArray24[local73 - 1][local77 + 1] == 0 && (local48[local68 - 1][local88 + 1] & 0x4E240000) == 0 && (local48[local68 - 1][local88] & 0x42240000) == 0 && (local48[local68][local88 + 1] & 0x48240000) == 0) {
				Static460.anIntArray620[local43] = local5 - 1;
				Static529.anIntArray773[local43] = local7 + 1;
				local43 = local43 + 1 & 0xFFF;
				Static355.anIntArrayArray24[local73 - 1][local77 + 1] = 6;
				Static143.anIntArrayArray30[local73 - 1][local77 + 1] = local245;
			}
			if (local73 < 127 && local77 < 127 && Static355.anIntArrayArray24[local73 + 1][local77 + 1] == 0 && (local48[local68 + 1][local88 + 1] & 0x78240000) == 0 && (local48[local68 + 1][local88] & 0x60240000) == 0 && (local48[local68][local88 + 1] & 0x48240000) == 0) {
				Static460.anIntArray620[local43] = local5 + 1;
				Static529.anIntArray773[local43] = local7 + 1;
				Static355.anIntArrayArray24[local73 + 1][local77 + 1] = 12;
				local43 = local43 + 1 & 0xFFF;
				Static143.anIntArrayArray30[local73 + 1][local77 + 1] = local245;
			}
		}
		Static504.anInt8566 = local7;
		Static144.anInt3323 = local5;
		return false;
	}
}
