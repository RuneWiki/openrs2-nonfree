import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static55 {

	@OriginalMember(owner = "client!cm", name = "b", descriptor = "Lclient!ia;")
	public static final Class6_Sub15_Sub1 aClass6_Sub15_Sub1_1 = new Class6_Sub15_Sub1(5000);

	@OriginalMember(owner = "client!cm", name = "h", descriptor = "Lclient!sk;")
	public static final Class231 aClass231_19 = new Class231(" from your friend list first.", " zuerst von deiner Freunde-Liste!", " de votre liste d'amis.", " da sua lista de amigos primeiro.");

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "(III)Lclient!ab;")
	public static Class3_Sub1 method1031(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class189 local7 = Static30.aClass189ArrayArrayArray2[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass3_Sub1_2;
	}

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "(IIIIILclient!ea;IIIZI)Z")
	public static boolean method1032(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class61 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(10) int arg9) {
		@Pc(12) int local12 = arg1;
		@Pc(14) int local14 = arg7;
		@Pc(23) int local23 = arg1 - 64;
		Static159.anIntArrayArray25[64][64] = 99;
		@Pc(34) int local34 = arg7 - 64;
		Static233.anIntArrayArray33[64][64] = 0;
		@Pc(42) byte local42 = 0;
		@Pc(44) int local44 = 0;
		Static238.anIntArray367[0] = arg1;
		@Pc(51) int local51 = local42 + 1;
		Static449.anIntArray635[0] = arg7;
		@Pc(56) int[][] local56 = arg5.anIntArrayArray18;
		while (local51 != local44) {
			local12 = Static238.anIntArray367[local44];
			local14 = Static449.anIntArray635[local44];
			@Pc(70) int local70 = local12 - local23;
			local44 = local44 + 1 & 0xFFF;
			@Pc(81) int local81 = local14 - local34;
			@Pc(86) int local86 = local12 - arg5.anInt1585;
			@Pc(91) int local91 = local14 - arg5.anInt1580;
			if (arg4 == -4) {
				if (local12 == arg2 && local14 == arg8) {
					Static211.anInt3670 = local14;
					Static327.anInt5539 = local12;
					return true;
				}
			} else if (arg4 == -3) {
				if (Static186.method2907(arg3, 2, local14, arg6, arg2, arg8, local12, 2)) {
					Static211.anInt3670 = local14;
					Static327.anInt5539 = local12;
					return true;
				}
			} else if (arg4 == -2) {
				if (arg5.method1485(arg6, local12, arg9, local14, 2, arg2, arg3, arg8, 2)) {
					Static327.anInt5539 = local12;
					Static211.anInt3670 = local14;
					return true;
				}
			} else if (arg4 == -1) {
				if (arg5.method1489(local12, local14, arg2, arg6, arg9, arg3, 2, arg8)) {
					Static211.anInt3670 = local14;
					Static327.anInt5539 = local12;
					return true;
				}
			} else if (arg4 == 0 || arg4 == 1 || arg4 == 2 || arg4 == 3 || arg4 == 9) {
				if (arg5.method1492(arg2, local12, arg8, arg0, local14, 2, arg4)) {
					Static211.anInt3670 = local14;
					Static327.anInt5539 = local12;
					return true;
				}
			} else if (arg5.method1479(arg8, arg0, local14, local12, 2, arg4, arg2)) {
				Static211.anInt3670 = local14;
				Static327.anInt5539 = local12;
				return true;
			}
			@Pc(241) int local241 = Static233.anIntArrayArray33[local70][local81] + 1;
			if (local70 > 0 && Static159.anIntArrayArray25[local70 - 1][local81] == 0 && (local56[local86 - 1][local91] & 0x43A40000) == 0 && (local56[local86 - 1][local91 + 1] & 0x4E240000) == 0) {
				Static238.anIntArray367[local51] = local12 - 1;
				Static449.anIntArray635[local51] = local14;
				local51 = local51 + 1 & 0xFFF;
				Static159.anIntArrayArray25[local70 - 1][local81] = 2;
				Static233.anIntArrayArray33[local70 - 1][local81] = local241;
			}
			if (local70 < 126 && Static159.anIntArrayArray25[local70 + 1][local81] == 0 && (local56[local86 + 2][local91] & 0x60E40000) == 0 && (local56[local86 + 2][local91 + 1] & 0x78240000) == 0) {
				Static238.anIntArray367[local51] = local12 + 1;
				Static449.anIntArray635[local51] = local14;
				Static159.anIntArrayArray25[local70 + 1][local81] = 8;
				local51 = local51 + 1 & 0xFFF;
				Static233.anIntArrayArray33[local70 + 1][local81] = local241;
			}
			if (local81 > 0 && Static159.anIntArrayArray25[local70][local81 - 1] == 0 && (local56[local86][local91 - 1] & 0x43A40000) == 0 && (local56[local86 + 1][local91 - 1] & 0x60E40000) == 0) {
				Static238.anIntArray367[local51] = local12;
				Static449.anIntArray635[local51] = local14 - 1;
				Static159.anIntArrayArray25[local70][local81 - 1] = 1;
				local51 = local51 + 1 & 0xFFF;
				Static233.anIntArrayArray33[local70][local81 - 1] = local241;
			}
			if (local81 < 126 && Static159.anIntArrayArray25[local70][local81 + 1] == 0 && (local56[local86][local91 + 2] & 0x4E240000) == 0 && (local56[local86 + 1][local91 + 2] & 0x78240000) == 0) {
				Static238.anIntArray367[local51] = local12;
				Static449.anIntArray635[local51] = local14 + 1;
				Static159.anIntArrayArray25[local70][local81 + 1] = 4;
				local51 = local51 + 1 & 0xFFF;
				Static233.anIntArrayArray33[local70][local81 + 1] = local241;
			}
			if (local70 > 0 && local81 > 0 && Static159.anIntArrayArray25[local70 - 1][local81 - 1] == 0 && (local56[local86 - 1][local91] & 0x4FA40000) == 0 && (local56[local86 - 1][local91 - 1] & 0x43A40000) == 0 && (local56[local86][local91 - 1] & 0x63E40000) == 0) {
				Static238.anIntArray367[local51] = local12 - 1;
				Static449.anIntArray635[local51] = local14 - 1;
				local51 = local51 + 1 & 0xFFF;
				Static159.anIntArrayArray25[local70 - 1][local81 - 1] = 3;
				Static233.anIntArrayArray33[local70 - 1][local81 - 1] = local241;
			}
			if (local70 < 126 && local81 > 0 && Static159.anIntArrayArray25[local70 + 1][local81 - 1] == 0 && (local56[local86 + 1][local91 - 1] & 0x63E40000) == 0 && (local56[local86 + 2][local91 - 1] & 0x60E40000) == 0 && (local56[local86 + 2][local91] & 0x78E40000) == 0) {
				Static238.anIntArray367[local51] = local12 + 1;
				Static449.anIntArray635[local51] = local14 - 1;
				local51 = local51 + 1 & 0xFFF;
				Static159.anIntArrayArray25[local70 + 1][local81 - 1] = 9;
				Static233.anIntArrayArray33[local70 + 1][local81 - 1] = local241;
			}
			if (local70 > 0 && local81 < 126 && Static159.anIntArrayArray25[local70 - 1][local81 + 1] == 0 && (local56[local86 - 1][local91 + 1] & 0x4FA40000) == 0 && (local56[local86 - 1][local91 + 2] & 0x4E240000) == 0 && (local56[local86][local91 + 2] & 0x7E240000) == 0) {
				Static238.anIntArray367[local51] = local12 - 1;
				Static449.anIntArray635[local51] = local14 + 1;
				Static159.anIntArrayArray25[local70 - 1][local81 + 1] = 6;
				local51 = local51 + 1 & 0xFFF;
				Static233.anIntArrayArray33[local70 - 1][local81 + 1] = local241;
			}
			if (local70 < 126 && local81 < 126 && Static159.anIntArrayArray25[local70 + 1][local81 + 1] == 0 && (local56[local86 + 1][local91 + 2] & 0x7E240000) == 0 && (local56[local86 + 2][local91 + 2] & 0x78240000) == 0 && (local56[local86 + 2][local91 + 1] & 0x78E40000) == 0) {
				Static238.anIntArray367[local51] = local12 + 1;
				Static449.anIntArray635[local51] = local14 + 1;
				Static159.anIntArrayArray25[local70 + 1][local81 + 1] = 12;
				local51 = local51 + 1 & 0xFFF;
				Static233.anIntArrayArray33[local70 + 1][local81 + 1] = local241;
			}
		}
		Static211.anInt3670 = local14;
		Static327.anInt5539 = local12;
		return false;
	}

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "(B)V")
	public static void method1034() {
		if (Static140.anInt2540 == 5) {
			Static140.anInt2540 = 6;
		}
	}
}
