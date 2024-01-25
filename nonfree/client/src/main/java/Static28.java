import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static28 {

	@OriginalMember(owner = "client!bp", name = "Q", descriptor = "F")
	public static float aFloat14;

	@OriginalMember(owner = "client!bp", name = "R", descriptor = "I")
	public static int anInt773;

	@OriginalMember(owner = "client!bp", name = "J", descriptor = "[I")
	public static final int[] anIntArray39 = new int[4096];

	@OriginalMember(owner = "client!bp", name = "L", descriptor = "[I")
	public static int[] anIntArray40 = new int[2];

	@OriginalMember(owner = "client!bp", name = "N", descriptor = "I")
	public static int anInt770 = 0;

	@OriginalMember(owner = "client!bp", name = "S", descriptor = "[B")
	public static final byte[] aByteArray5 = new byte[] { 0, 4, 4, 8, 0, 0, 8, 0, 0 };

	@OriginalMember(owner = "client!bp", name = "T", descriptor = "I")
	public static int anInt774 = 0;

	@OriginalMember(owner = "client!bp", name = "U", descriptor = "I")
	public static int anInt775 = 13156520;

	@OriginalMember(owner = "client!bp", name = "a", descriptor = "(IIIIILclient!dl;IIIII)Z")
	public static boolean method713(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) Class49 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		@Pc(7) int local7 = arg6;
		@Pc(14) int local14 = arg2;
		@Pc(23) int local23 = arg6 - 64;
		@Pc(28) int local28 = arg2 - 64;
		Static55.anIntArrayArray6[64][64] = 99;
		Static144.anIntArrayArray19[64][64] = 0;
		@Pc(42) byte local42 = 0;
		Static219.anIntArray309[0] = arg6;
		@Pc(48) int local48 = 0;
		@Pc(51) int local51 = local42 + 1;
		Static302.anIntArray449[0] = arg2;
		@Pc(56) int[][] local56 = arg4.anIntArrayArray7;
		while (local51 != local48) {
			local14 = Static302.anIntArray449[local48];
			local7 = Static219.anIntArray309[local48];
			@Pc(72) int local72 = local14 - arg4.anInt1400;
			@Pc(78) int local78 = local7 - arg4.anInt1413;
			@Pc(82) int local82 = local7 - local23;
			@Pc(87) int local87 = local14 - local28;
			local48 = local48 + 1 & 0xFFF;
			if (arg0 == -4) {
				if (local7 == arg3 && local14 == arg7) {
					Static259.anInt3212 = local7;
					Static9.anInt309 = local14;
					return true;
				}
			} else if (arg0 == -3) {
				if (Static324.method5466(1, arg1, local14, arg3, arg9, local7, arg7, 1)) {
					Static259.anInt3212 = local7;
					Static9.anInt309 = local14;
					return true;
				}
			} else if (arg0 == -2) {
				if (arg4.method1243(1, local14, arg9, arg1, local7, arg7, arg5, 1, arg3)) {
					Static259.anInt3212 = local7;
					Static9.anInt309 = local14;
					return true;
				}
			} else if (arg0 == -1) {
				if (arg4.method1242(arg7, local7, arg3, arg5, local14, arg1, 1, arg9)) {
					Static9.anInt309 = local14;
					Static259.anInt3212 = local7;
					return true;
				}
			} else if (arg0 == 0 || arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 9) {
				if (arg4.method1239(1, arg7, arg3, local7, local14, arg8, arg0)) {
					Static259.anInt3212 = local7;
					Static9.anInt309 = local14;
					return true;
				}
			} else if (arg4.method1233(local14, arg7, local7, arg8, arg3, arg0, 1)) {
				Static259.anInt3212 = local7;
				Static9.anInt309 = local14;
				return true;
			}
			@Pc(248) int local248 = Static144.anIntArrayArray19[local82][local87] + 1;
			if (local82 > 0 && Static55.anIntArrayArray6[local82 - 1][local87] == 0 && (local56[local78 - 1][local72] & 0x42240000) == 0) {
				Static219.anIntArray309[local51] = local7 - 1;
				Static302.anIntArray449[local51] = local14;
				Static55.anIntArrayArray6[local82 - 1][local87] = 2;
				local51 = local51 + 1 & 0xFFF;
				Static144.anIntArrayArray19[local82 - 1][local87] = local248;
			}
			if (local82 < 127 && Static55.anIntArrayArray6[local82 + 1][local87] == 0 && (local56[local78 + 1][local72] & 0x60240000) == 0) {
				Static219.anIntArray309[local51] = local7 + 1;
				Static302.anIntArray449[local51] = local14;
				local51 = local51 + 1 & 0xFFF;
				Static55.anIntArrayArray6[local82 + 1][local87] = 8;
				Static144.anIntArrayArray19[local82 + 1][local87] = local248;
			}
			if (local87 > 0 && Static55.anIntArrayArray6[local82][local87 - 1] == 0 && (local56[local78][local72 - 1] & 0x40A40000) == 0) {
				Static219.anIntArray309[local51] = local7;
				Static302.anIntArray449[local51] = local14 - 1;
				local51 = local51 + 1 & 0xFFF;
				Static55.anIntArrayArray6[local82][local87 - 1] = 1;
				Static144.anIntArrayArray19[local82][local87 - 1] = local248;
			}
			if (local87 < 127 && Static55.anIntArrayArray6[local82][local87 + 1] == 0 && (local56[local78][local72 + 1] & 0x48240000) == 0) {
				Static219.anIntArray309[local51] = local7;
				Static302.anIntArray449[local51] = local14 + 1;
				local51 = local51 + 1 & 0xFFF;
				Static55.anIntArrayArray6[local82][local87 + 1] = 4;
				Static144.anIntArrayArray19[local82][local87 + 1] = local248;
			}
			if (local82 > 0 && local87 > 0 && Static55.anIntArrayArray6[local82 - 1][local87 - 1] == 0 && (local56[local78 - 1][local72 - 1] & 0x43A40000) == 0 && (local56[local78 - 1][local72] & 0x42240000) == 0 && (local56[local78][local72 - 1] & 0x40A40000) == 0) {
				Static219.anIntArray309[local51] = local7 - 1;
				Static302.anIntArray449[local51] = local14 - 1;
				Static55.anIntArrayArray6[local82 - 1][local87 - 1] = 3;
				local51 = local51 + 1 & 0xFFF;
				Static144.anIntArrayArray19[local82 - 1][local87 - 1] = local248;
			}
			if (local82 < 127 && local87 > 0 && Static55.anIntArrayArray6[local82 + 1][local87 - 1] == 0 && (local56[local78 + 1][local72 - 1] & 0x60E40000) == 0 && (local56[local78 + 1][local72] & 0x60240000) == 0 && (local56[local78][local72 - 1] & 0x40A40000) == 0) {
				Static219.anIntArray309[local51] = local7 + 1;
				Static302.anIntArray449[local51] = local14 - 1;
				Static55.anIntArrayArray6[local82 + 1][local87 - 1] = 9;
				local51 = local51 + 1 & 0xFFF;
				Static144.anIntArrayArray19[local82 + 1][local87 - 1] = local248;
			}
			if (local82 > 0 && local87 < 127 && Static55.anIntArrayArray6[local82 - 1][local87 + 1] == 0 && (local56[local78 - 1][local72 + 1] & 0x4E240000) == 0 && (local56[local78 - 1][local72] & 0x42240000) == 0 && (local56[local78][local72 + 1] & 0x48240000) == 0) {
				Static219.anIntArray309[local51] = local7 - 1;
				Static302.anIntArray449[local51] = local14 + 1;
				local51 = local51 + 1 & 0xFFF;
				Static55.anIntArrayArray6[local82 - 1][local87 + 1] = 6;
				Static144.anIntArrayArray19[local82 - 1][local87 + 1] = local248;
			}
			if (local82 < 127 && local87 < 127 && Static55.anIntArrayArray6[local82 + 1][local87 + 1] == 0 && (local56[local78 + 1][local72 + 1] & 0x78240000) == 0 && (local56[local78 + 1][local72] & 0x60240000) == 0 && (local56[local78][local72 + 1] & 0x48240000) == 0) {
				Static219.anIntArray309[local51] = local7 + 1;
				Static302.anIntArray449[local51] = local14 + 1;
				Static55.anIntArrayArray6[local82 + 1][local87 + 1] = 12;
				local51 = local51 + 1 & 0xFFF;
				Static144.anIntArrayArray19[local82 + 1][local87 + 1] = local248;
			}
		}
		Static9.anInt309 = local14;
		Static259.anInt3212 = local7;
		return false;
	}

	@OriginalMember(owner = "client!bp", name = "c", descriptor = "(II)Ljava/lang/String;")
	public static String method714(@OriginalArg(0) int arg0) {
		return arg0 < 999999999 ? Integer.toString(arg0) : "*";
	}

	@OriginalMember(owner = "client!bp", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lclient!mr;")
	public static RuntimeException_Sub1 method715(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		@Pc(9) RuntimeException_Sub1 local9;
		if (arg0 instanceof RuntimeException_Sub1) {
			local9 = (RuntimeException_Sub1) arg0;
			local9.aString229 = local9.aString229 + ' ' + arg1;
		} else {
			local9 = new RuntimeException_Sub1(arg0, arg1);
		}
		return local9;
	}
}
