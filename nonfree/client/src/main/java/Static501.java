import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static501 {

	@OriginalMember(owner = "client!tfa", name = "n", descriptor = "Lclient!fl;")
	public static final Class103 aClass103_9 = new Class103(0, 1);

	@OriginalMember(owner = "client!tfa", name = "p", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray33 = new String[] { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };

	@OriginalMember(owner = "client!tfa", name = "a", descriptor = "(Lclient!wk;B)V")
	public static void method7560(@OriginalArg(0) Class2_Sub2_Sub1 arg0) {
		if (arg0 instanceof Class2_Sub2_Sub1_Sub2) {
			@Pc(11) Class2_Sub2_Sub1_Sub2 local11 = (Class2_Sub2_Sub1_Sub2) arg0;
			if (local11.aClass169_1 != null) {
				Static557.method1632(local11.aByte103 != Static443.aClass2_Sub2_Sub1_Sub1_2.aByte103, local11);
			}
		} else if (arg0 instanceof Class2_Sub2_Sub1_Sub1) {
			@Pc(32) Class2_Sub2_Sub1_Sub1 local32 = (Class2_Sub2_Sub1_Sub1) arg0;
			Static411.method6653(Static443.aClass2_Sub2_Sub1_Sub1_2.aByte103 != local32.aByte103, local32);
		}
	}

	@OriginalMember(owner = "client!tfa", name = "a", descriptor = "(IIZIIIILclient!wca;III)Z")
	public static boolean method7562(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class350 arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		@Pc(5) int local5 = arg1;
		@Pc(7) int local7 = arg8;
		@Pc(21) int local21 = arg1 - 64;
		@Pc(25) int local25 = arg8 - 64;
		Static114.anIntArrayArray22[64][64] = 99;
		Static187.anIntArrayArray30[64][64] = 0;
		@Pc(39) byte local39 = 0;
		@Pc(41) int local41 = 0;
		Static299.anIntArray374[0] = arg1;
		@Pc(48) int local48 = local39 + 1;
		Static279.anIntArray360[0] = arg8;
		@Pc(53) int[][] local53 = arg6.anIntArrayArray82;
		while (local48 != local41) {
			local5 = Static299.anIntArray374[local41];
			local7 = Static279.anIntArray360[local41];
			@Pc(68) int local68 = local7 - arg6.anInt10122;
			@Pc(73) int local73 = local5 - local21;
			local41 = local41 + 1 & 0xFFF;
			@Pc(84) int local84 = local5 - arg6.anInt10126;
			@Pc(89) int local89 = local7 - local25;
			if (arg5 == -4) {
				if (local5 == arg2 && local7 == arg0) {
					Static364.anInt7216 = local5;
					Static524.anInt9583 = local7;
					return true;
				}
			} else if (arg5 == -3) {
				if (Static2.method179(local7, 1, 1, local5, arg9, arg2, arg3, arg0)) {
					Static524.anInt9583 = local7;
					Static364.anInt7216 = local5;
					return true;
				}
			} else if (arg5 == -2) {
				if (arg6.method8221(arg2, arg3, 1, local5, local7, arg0, arg4, arg9, 1)) {
					Static364.anInt7216 = local5;
					Static524.anInt9583 = local7;
					return true;
				}
			} else if (arg5 == -1) {
				if (arg6.method8214(arg2, arg9, local7, arg3, arg0, local5, arg4, 1)) {
					Static364.anInt7216 = local5;
					Static524.anInt9583 = local7;
					return true;
				}
			} else if (arg5 == 0 || arg5 == 1 || arg5 == 2 || arg5 == 3 || arg5 == 9) {
				if (arg6.method8218(arg2, 1, arg5, arg7, arg0, local5, local7)) {
					Static524.anInt9583 = local7;
					Static364.anInt7216 = local5;
					return true;
				}
			} else if (arg6.method8216(local7, 1, arg0, arg2, arg7, arg5, local5)) {
				Static364.anInt7216 = local5;
				Static524.anInt9583 = local7;
				return true;
			}
			@Pc(245) int local245 = Static187.anIntArrayArray30[local73][local89] + 1;
			if (local73 > 0 && Static114.anIntArrayArray22[local73 - 1][local89] == 0 && (local53[local84 - 1][local68] & 0x42240000) == 0) {
				Static299.anIntArray374[local48] = local5 - 1;
				Static279.anIntArray360[local48] = local7;
				Static114.anIntArrayArray22[local73 - 1][local89] = 2;
				local48 = local48 + 1 & 0xFFF;
				Static187.anIntArrayArray30[local73 - 1][local89] = local245;
			}
			if (local73 < 127 && Static114.anIntArrayArray22[local73 + 1][local89] == 0 && (local53[local84 + 1][local68] & 0x60240000) == 0) {
				Static299.anIntArray374[local48] = local5 + 1;
				Static279.anIntArray360[local48] = local7;
				Static114.anIntArrayArray22[local73 + 1][local89] = 8;
				local48 = local48 + 1 & 0xFFF;
				Static187.anIntArrayArray30[local73 + 1][local89] = local245;
			}
			if (local89 > 0 && Static114.anIntArrayArray22[local73][local89 - 1] == 0 && (local53[local84][local68 - 1] & 0x40A40000) == 0) {
				Static299.anIntArray374[local48] = local5;
				Static279.anIntArray360[local48] = local7 - 1;
				local48 = local48 + 1 & 0xFFF;
				Static114.anIntArrayArray22[local73][local89 - 1] = 1;
				Static187.anIntArrayArray30[local73][local89 - 1] = local245;
			}
			if (local89 < 127 && Static114.anIntArrayArray22[local73][local89 + 1] == 0 && (local53[local84][local68 + 1] & 0x48240000) == 0) {
				Static299.anIntArray374[local48] = local5;
				Static279.anIntArray360[local48] = local7 + 1;
				local48 = local48 + 1 & 0xFFF;
				Static114.anIntArrayArray22[local73][local89 + 1] = 4;
				Static187.anIntArrayArray30[local73][local89 + 1] = local245;
			}
			if (local73 > 0 && local89 > 0 && Static114.anIntArrayArray22[local73 - 1][local89 - 1] == 0 && (local53[local84 - 1][local68 - 1] & 0x43A40000) == 0 && (local53[local84 - 1][local68] & 0x42240000) == 0 && (local53[local84][local68 - 1] & 0x40A40000) == 0) {
				Static299.anIntArray374[local48] = local5 - 1;
				Static279.anIntArray360[local48] = local7 - 1;
				Static114.anIntArrayArray22[local73 - 1][local89 - 1] = 3;
				local48 = local48 + 1 & 0xFFF;
				Static187.anIntArrayArray30[local73 - 1][local89 - 1] = local245;
			}
			if (local73 < 127 && local89 > 0 && Static114.anIntArrayArray22[local73 + 1][local89 - 1] == 0 && (local53[local84 + 1][local68 - 1] & 0x60E40000) == 0 && (local53[local84 + 1][local68] & 0x60240000) == 0 && (local53[local84][local68 - 1] & 0x40A40000) == 0) {
				Static299.anIntArray374[local48] = local5 + 1;
				Static279.anIntArray360[local48] = local7 - 1;
				local48 = local48 + 1 & 0xFFF;
				Static114.anIntArrayArray22[local73 + 1][local89 - 1] = 9;
				Static187.anIntArrayArray30[local73 + 1][local89 - 1] = local245;
			}
			if (local73 > 0 && local89 < 127 && Static114.anIntArrayArray22[local73 - 1][local89 + 1] == 0 && (local53[local84 - 1][local68 + 1] & 0x4E240000) == 0 && (local53[local84 - 1][local68] & 0x42240000) == 0 && (local53[local84][local68 + 1] & 0x48240000) == 0) {
				Static299.anIntArray374[local48] = local5 - 1;
				Static279.anIntArray360[local48] = local7 + 1;
				Static114.anIntArrayArray22[local73 - 1][local89 + 1] = 6;
				local48 = local48 + 1 & 0xFFF;
				Static187.anIntArrayArray30[local73 - 1][local89 + 1] = local245;
			}
			if (local73 < 127 && local89 < 127 && Static114.anIntArrayArray22[local73 + 1][local89 + 1] == 0 && (local53[local84 + 1][local68 + 1] & 0x78240000) == 0 && (local53[local84 + 1][local68] & 0x60240000) == 0 && (local53[local84][local68 + 1] & 0x48240000) == 0) {
				Static299.anIntArray374[local48] = local5 + 1;
				Static279.anIntArray360[local48] = local7 + 1;
				local48 = local48 + 1 & 0xFFF;
				Static114.anIntArrayArray22[local73 + 1][local89 + 1] = 12;
				Static187.anIntArrayArray30[local73 + 1][local89 + 1] = local245;
			}
		}
		Static524.anInt9583 = local7;
		Static364.anInt7216 = local5;
		return false;
	}
}
