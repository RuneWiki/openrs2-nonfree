import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static77 {

	@OriginalMember(owner = "client!p", name = "m", descriptor = "Lclient!oe;")
	public static Class47 aClass47_1;

	@OriginalMember(owner = "client!p", name = "n", descriptor = "Lclient!ne;")
	public static Class3_Sub3_Sub2_Sub4 aClass3_Sub3_Sub2_Sub4_88;

	@OriginalMember(owner = "client!p", name = "a", descriptor = "Lclient!hb;")
	public static Class27 aClass27_1016 = Static87.method1648("Wen m-Ochten Sie entfernen?");

	@OriginalMember(owner = "client!p", name = "b", descriptor = "Lclient!hb;")
	public static Class27 aClass27_1017 = Static87.method1648("backvmid1");

	@OriginalMember(owner = "client!p", name = "g", descriptor = "I")
	public static int anInt2149 = -1;

	@OriginalMember(owner = "client!p", name = "h", descriptor = "I")
	public static int anInt2150 = 0;

	@OriginalMember(owner = "client!p", name = "o", descriptor = "Lclient!hb;")
	private static Class27 aClass27_1020 = Static87.method1648("purple:");

	@OriginalMember(owner = "client!p", name = "i", descriptor = "Lclient!hb;")
	public static Class27 aClass27_1018 = aClass27_1020;

	@OriginalMember(owner = "client!p", name = "j", descriptor = "Lclient!hb;")
	public static Class27 aClass27_1019 = Static87.method1648(": ");

	@OriginalMember(owner = "client!p", name = "k", descriptor = "I")
	public static int anInt2151 = -1;

	@OriginalMember(owner = "client!p", name = "p", descriptor = "Z")
	public static volatile boolean aBoolean102 = false;

	@OriginalMember(owner = "client!p", name = "r", descriptor = "[I")
	public static int[] anIntArray330 = new int[5];

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(II)Z")
	public static boolean method1515(@OriginalArg(1) int arg0) {
		return arg0 >= 48 && arg0 <= 57;
	}

	@OriginalMember(owner = "client!p", name = "b", descriptor = "(II)Lclient!m;")
	public static Class3_Sub3_Sub6 method1516(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = arg0 & 0xFFFF;
		@Pc(11) int local11 = arg0 >> 16;
		if (Static96.aClass3_Sub3_Sub6ArrayArray5[local11] == null || Static96.aClass3_Sub3_Sub6ArrayArray5[local11][local7] == null) {
			@Pc(25) boolean local25 = Static80.method1535(local11);
			if (!local25) {
				return null;
			}
		}
		return Static96.aClass3_Sub3_Sub6ArrayArray5[local11][local7];
	}

	@OriginalMember(owner = "client!p", name = "c", descriptor = "(II)Lclient!mb;")
	public static Class3_Sub3_Sub7 method1517(@OriginalArg(0) int arg0) {
		@Pc(13) Class3_Sub3_Sub7 local13 = (Class3_Sub3_Sub7) Static90.aClass21_29.method658((long) arg0);
		if (local13 != null) {
			return local13;
		}
		@Pc(27) byte[] local27 = Static8.aClass54_2.method1615(3, arg0);
		local13 = new Class3_Sub3_Sub7();
		if (local27 != null) {
			local13.method1183(new Class3_Sub11(local27));
		}
		Static90.aClass21_29.method660(local13, (long) arg0);
		return local13;
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(I)V")
	public static void method1518() {
		aClass3_Sub3_Sub2_Sub4_88 = null;
		aClass27_1020 = null;
		aClass27_1019 = null;
		aClass27_1017 = null;
		aClass27_1018 = null;
		aClass47_1 = null;
		anIntArray330 = null;
		aClass27_1016 = null;
	}

	@OriginalMember(owner = "client!p", name = "d", descriptor = "(II)Z")
	public static boolean method1519(@OriginalArg(0) int arg0) {
		if (arg0 < 32) {
			return false;
		} else if (arg0 == 127) {
			return false;
		} else {
			return arg0 < 129 || arg0 > 159;
		}
	}
}
