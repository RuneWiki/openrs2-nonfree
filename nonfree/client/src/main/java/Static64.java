import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static64 {

	@OriginalMember(owner = "client!dr", name = "s", descriptor = "Lclient!vd;")
	public static Class205 aClass205_4;

	@OriginalMember(owner = "client!dr", name = "l", descriptor = "[Z")
	public static final boolean[] aBooleanArray2 = new boolean[8];

	@OriginalMember(owner = "client!dr", name = "q", descriptor = "I")
	public static int anInt1541 = 0;

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "([Lclient!ne;IIZII)V")
	public static void method1506(@OriginalArg(0) Class146[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4) {
		for (@Pc(3) int local3 = 0; local3 < arg0.length; local3++) {
			@Pc(14) Class146 local14 = arg0[local3];
			if (local14 != null && local14.anInt4146 == arg2) {
				Static220.method3966(arg3, local14, arg4, arg1);
				Static42.method1039(arg4, local14, arg1);
				if (local14.anInt4183 - local14.anInt4133 < local14.anInt4176) {
					local14.anInt4176 = local14.anInt4183 - local14.anInt4133;
				}
				if (local14.anInt4128 > local14.anInt4197 - local14.anInt4199) {
					local14.anInt4128 = local14.anInt4197 - local14.anInt4199;
				}
				if (local14.anInt4176 < 0) {
					local14.anInt4176 = 0;
				}
				if (local14.anInt4128 < 0) {
					local14.anInt4128 = 0;
				}
				if (local14.anInt4135 == 0) {
					Static191.method3632(local14, arg3);
				}
			}
		}
	}

	@OriginalMember(owner = "client!dr", name = "d", descriptor = "(I)Z")
	public static boolean method1507() {
		@Pc(10) Class43 local10 = Static65.aClass43_3;
		synchronized (Static65.aClass43_3) {
			if (Static182.anInt3773 == Static347.anInt6625) {
				return false;
			} else {
				Static251.anInt3169 = Static259.anIntArray452[Static347.anInt6625];
				Static81.aChar2 = Static278.aCharArray6[Static347.anInt6625];
				Static347.anInt6625 = Static347.anInt6625 + 1 & 0x7F;
				return true;
			}
		}
	}

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "(III)I")
	public static int method1508(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = arg1 >>> 24;
		@Pc(21) int local21 = 255 - local7;
		@Pc(39) int local39 = (local7 * (arg1 & 0xFF00) & 0xFF0000 | (arg1 & 0xFF00FF) * local7 & 0xFF00FF00) >>> 8;
		return (((arg0 & 0xFF00) * local21 & 0xFF0000 | local21 * (arg0 & 0xFF00FF) & 0xFF00FF00) >>> 8) + local39;
	}

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "(IIIII)V")
	public static void method1509(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static282.anInt5377 == 0 || arg0 == 0 || Static58.anInt1401 >= 50 || arg3 == -1) {
			return;
		}
		Static354.anIntArray649[Static58.anInt1401] = arg3;
		Static162.anIntArray300[Static58.anInt1401] = arg0;
		Static275.anIntArray475[Static58.anInt1401] = arg1;
		Static251.aClass91Array2[Static58.anInt1401] = null;
		Static15.anIntArray544[Static58.anInt1401] = 0;
		Static252.anIntArray439[Static58.anInt1401] = arg2;
		Static58.anInt1401++;
	}

	@OriginalMember(owner = "client!dr", name = "e", descriptor = "(I)V")
	public static void method1510() {
		Static30.aClass14_Sub4_Sub2_1.method2556();
		@Pc(11) int local11 = Static30.aClass14_Sub4_Sub2_1.method2558(1);
		if (local11 == 0) {
			return;
		}
		@Pc(21) int local21 = Static30.aClass14_Sub4_Sub2_1.method2558(2);
		if (local21 == 0) {
			Static116.anIntArray227[Static222.anInt4457++] = 2047;
			return;
		}
		@Pc(42) int local42;
		@Pc(52) int local52;
		if (local21 == 1) {
			local42 = Static30.aClass14_Sub4_Sub2_1.method2558(3);
			Static173.aClass10_Sub3_Sub3_Sub2_1.method5361(local42, 1);
			local52 = Static30.aClass14_Sub4_Sub2_1.method2558(1);
			if (local52 == 1) {
				Static116.anIntArray227[Static222.anInt4457++] = 2047;
			}
		} else if (local21 == 2) {
			if (Static30.aClass14_Sub4_Sub2_1.method2558(1) == 1) {
				local42 = Static30.aClass14_Sub4_Sub2_1.method2558(3);
				Static173.aClass10_Sub3_Sub3_Sub2_1.method5361(local42, 2);
				local52 = Static30.aClass14_Sub4_Sub2_1.method2558(3);
				Static173.aClass10_Sub3_Sub3_Sub2_1.method5361(local52, 2);
			} else {
				local42 = Static30.aClass14_Sub4_Sub2_1.method2558(3);
				Static173.aClass10_Sub3_Sub3_Sub2_1.method5361(local42, 0);
			}
			local42 = Static30.aClass14_Sub4_Sub2_1.method2558(1);
			if (local42 == 1) {
				Static116.anIntArray227[Static222.anInt4457++] = 2047;
			}
		} else if (local21 == 3) {
			local42 = Static30.aClass14_Sub4_Sub2_1.method2558(7);
			local52 = Static30.aClass14_Sub4_Sub2_1.method2558(1);
			@Pc(146) int local146 = Static30.aClass14_Sub4_Sub2_1.method2558(1);
			if (local146 == 1) {
				Static116.anIntArray227[Static222.anInt4457++] = 2047;
			}
			@Pc(164) int local164 = Static30.aClass14_Sub4_Sub2_1.method2558(7);
			Static219.anInt4400 = Static30.aClass14_Sub4_Sub2_1.method2558(2);
			Static173.aClass10_Sub3_Sub3_Sub2_1.method5378(local164, local52 == 1, local42, Static219.anInt4400);
		}
	}

	@OriginalMember(owner = "client!dr", name = "b", descriptor = "(B)V")
	public static void method1511() {
		Static300.aByteArrayArrayArray14 = null;
		Static277.anIntArray476 = null;
		Static21.aByteArrayArrayArray4 = null;
		Static47.anIntArray67 = null;
		Static208.aByteArrayArrayArray8 = null;
		Static302.anIntArray529 = null;
		Static1.anIntArrayArrayArray12 = null;
		Static210.anIntArray377 = null;
		Static294.aByteArrayArrayArray12 = null;
		Static263.aByteArrayArrayArray11 = null;
		Static101.anIntArray209 = null;
		Static27.anIntArray40 = null;
	}
}
