import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static104 {

	@OriginalMember(owner = "client!dp", name = "f", descriptor = "Lclient!cl;")
	public static Class57 aClass57_4;

	@OriginalMember(owner = "client!dp", name = "g", descriptor = "Lclient!ro;")
	public static Class306 aClass306_2;

	@OriginalMember(owner = "client!dp", name = "h", descriptor = "Lclient!eha;")
	public static Class91 aClass91_2;

	@OriginalMember(owner = "client!dp", name = "b", descriptor = "Lclient!tm;")
	public static final Class337 aClass337_36 = new Class337(116, -2);

	@OriginalMember(owner = "client!dp", name = "c", descriptor = "I")
	public static int anInt2011 = -2;

	@OriginalMember(owner = "client!dp", name = "e", descriptor = "Lclient!ed;")
	public static Class5_Sub19 aClass5_Sub19_2 = null;

	@OriginalMember(owner = "client!dp", name = "a", descriptor = "(IIIIIIIILclient!up;ZI)Z")
	public static boolean method1657(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) Class352 arg8, @OriginalArg(10) int arg9) {
		@Pc(7) int local7 = arg2;
		@Pc(9) int local9 = arg5;
		@Pc(22) int local22 = arg2 - 64;
		@Pc(27) int local27 = arg5 - 64;
		Static499.anIntArrayArray72[64][64] = 99;
		Static348.anIntArrayArray44[64][64] = 0;
		@Pc(41) byte local41 = 0;
		@Pc(43) int local43 = 0;
		Static120.anIntArray137[0] = arg2;
		@Pc(50) int local50 = local41 + 1;
		Static330.anIntArray303[0] = arg5;
		@Pc(55) int[][] local55 = arg8.anIntArrayArray67;
		while (local50 != local43) {
			local7 = Static120.anIntArray137[local43];
			local9 = Static330.anIntArray303[local43];
			@Pc(70) int local70 = local9 - local27;
			@Pc(75) int local75 = local7 - arg8.anInt9711;
			@Pc(80) int local80 = local7 - local22;
			local43 = local43 + 1 & 0xFFF;
			@Pc(91) int local91 = local9 - arg8.anInt9709;
			if (arg3 == -4) {
				if (local7 == arg0 && local9 == arg1) {
					Static541.anInt9200 = local9;
					Static199.anInt3913 = local7;
					return true;
				}
			} else if (arg3 == -3) {
				if (Static536.method7904(arg0, arg1, local9, 1, 1, local7, arg6, arg4)) {
					Static541.anInt9200 = local9;
					Static199.anInt3913 = local7;
					return true;
				}
			} else if (arg3 == -2) {
				if (arg8.method8345(local7, 1, 1, arg1, local9, arg6, arg4, arg0, arg7)) {
					Static199.anInt3913 = local7;
					Static541.anInt9200 = local9;
					return true;
				}
			} else if (arg3 == -1) {
				if (arg8.method8343(arg0, arg6, local7, local9, arg4, arg7, 1, arg1)) {
					Static199.anInt3913 = local7;
					Static541.anInt9200 = local9;
					return true;
				}
			} else if (arg3 == 0 || arg3 == 1 || arg3 == 2 || arg3 == 3 || arg3 == 9) {
				if (arg8.method8334(local7, arg1, 1, arg3, local9, arg9, arg0)) {
					Static541.anInt9200 = local9;
					Static199.anInt3913 = local7;
					return true;
				}
			} else if (arg8.method8351(arg9, arg1, arg3, 1, arg0, local9, local7)) {
				Static541.anInt9200 = local9;
				Static199.anInt3913 = local7;
				return true;
			}
			@Pc(242) int local242 = Static348.anIntArrayArray44[local80][local70] + 1;
			if (local80 > 0 && Static499.anIntArrayArray72[local80 - 1][local70] == 0 && (local55[local75 - 1][local91] & 0x42240000) == 0) {
				Static120.anIntArray137[local50] = local7 - 1;
				Static330.anIntArray303[local50] = local9;
				Static499.anIntArrayArray72[local80 - 1][local70] = 2;
				local50 = local50 + 1 & 0xFFF;
				Static348.anIntArrayArray44[local80 - 1][local70] = local242;
			}
			if (local80 < 127 && Static499.anIntArrayArray72[local80 + 1][local70] == 0 && (local55[local75 + 1][local91] & 0x60240000) == 0) {
				Static120.anIntArray137[local50] = local7 + 1;
				Static330.anIntArray303[local50] = local9;
				local50 = local50 + 1 & 0xFFF;
				Static499.anIntArrayArray72[local80 + 1][local70] = 8;
				Static348.anIntArrayArray44[local80 + 1][local70] = local242;
			}
			if (local70 > 0 && Static499.anIntArrayArray72[local80][local70 - 1] == 0 && (local55[local75][local91 - 1] & 0x40A40000) == 0) {
				Static120.anIntArray137[local50] = local7;
				Static330.anIntArray303[local50] = local9 - 1;
				Static499.anIntArrayArray72[local80][local70 - 1] = 1;
				local50 = local50 + 1 & 0xFFF;
				Static348.anIntArrayArray44[local80][local70 - 1] = local242;
			}
			if (local70 < 127 && Static499.anIntArrayArray72[local80][local70 + 1] == 0 && (local55[local75][local91 + 1] & 0x48240000) == 0) {
				Static120.anIntArray137[local50] = local7;
				Static330.anIntArray303[local50] = local9 + 1;
				Static499.anIntArrayArray72[local80][local70 + 1] = 4;
				local50 = local50 + 1 & 0xFFF;
				Static348.anIntArrayArray44[local80][local70 + 1] = local242;
			}
			if (local80 > 0 && local70 > 0 && Static499.anIntArrayArray72[local80 - 1][local70 - 1] == 0 && (local55[local75 - 1][local91 - 1] & 0x43A40000) == 0 && (local55[local75 - 1][local91] & 0x42240000) == 0 && (local55[local75][local91 - 1] & 0x40A40000) == 0) {
				Static120.anIntArray137[local50] = local7 - 1;
				Static330.anIntArray303[local50] = local9 - 1;
				local50 = local50 + 1 & 0xFFF;
				Static499.anIntArrayArray72[local80 - 1][local70 - 1] = 3;
				Static348.anIntArrayArray44[local80 - 1][local70 - 1] = local242;
			}
			if (local80 < 127 && local70 > 0 && Static499.anIntArrayArray72[local80 + 1][local70 - 1] == 0 && (local55[local75 + 1][local91 - 1] & 0x60E40000) == 0 && (local55[local75 + 1][local91] & 0x60240000) == 0 && (local55[local75][local91 - 1] & 0x40A40000) == 0) {
				Static120.anIntArray137[local50] = local7 + 1;
				Static330.anIntArray303[local50] = local9 - 1;
				local50 = local50 + 1 & 0xFFF;
				Static499.anIntArrayArray72[local80 + 1][local70 - 1] = 9;
				Static348.anIntArrayArray44[local80 + 1][local70 - 1] = local242;
			}
			if (local80 > 0 && local70 < 127 && Static499.anIntArrayArray72[local80 - 1][local70 + 1] == 0 && (local55[local75 - 1][local91 + 1] & 0x4E240000) == 0 && (local55[local75 - 1][local91] & 0x42240000) == 0 && (local55[local75][local91 + 1] & 0x48240000) == 0) {
				Static120.anIntArray137[local50] = local7 - 1;
				Static330.anIntArray303[local50] = local9 + 1;
				Static499.anIntArrayArray72[local80 - 1][local70 + 1] = 6;
				local50 = local50 + 1 & 0xFFF;
				Static348.anIntArrayArray44[local80 - 1][local70 + 1] = local242;
			}
			if (local80 < 127 && local70 < 127 && Static499.anIntArrayArray72[local80 + 1][local70 + 1] == 0 && (local55[local75 + 1][local91 + 1] & 0x78240000) == 0 && (local55[local75 + 1][local91] & 0x60240000) == 0 && (local55[local75][local91 + 1] & 0x48240000) == 0) {
				Static120.anIntArray137[local50] = local7 + 1;
				Static330.anIntArray303[local50] = local9 + 1;
				Static499.anIntArrayArray72[local80 + 1][local70 + 1] = 12;
				local50 = local50 + 1 & 0xFFF;
				Static348.anIntArrayArray44[local80 + 1][local70 + 1] = local242;
			}
		}
		Static541.anInt9200 = local9;
		Static199.anInt3913 = local7;
		return false;
	}

	@OriginalMember(owner = "client!dp", name = "a", descriptor = "(ILjava/lang/String;)Z")
	public static boolean method1658(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return false;
		}
		for (@Pc(19) int local19 = 0; local19 < Static225.anInt4205; local19++) {
			if (arg0.equalsIgnoreCase(Static518.aStringArray70[local19])) {
				return true;
			}
			if (arg0.equalsIgnoreCase(Static530.aStringArray75[local19])) {
				return true;
			}
		}
		return false;
	}
}
