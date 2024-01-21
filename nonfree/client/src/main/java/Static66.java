import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static66 {

	@OriginalMember(owner = "client!ld", name = "c", descriptor = "[Lclient!ae;")
	public static Class2_Sub2_Sub1_Sub1[] aClass2_Sub2_Sub1_Sub1Array8;

	@OriginalMember(owner = "client!ld", name = "p", descriptor = "Lclient!pe;")
	public static Class26_Sub1 aClass26_Sub1_46;

	@OriginalMember(owner = "client!ld", name = "r", descriptor = "I")
	public static int anInt1462;

	@OriginalMember(owner = "client!ld", name = "B", descriptor = "I")
	public static int anInt1466;

	@OriginalMember(owner = "client!ld", name = "z", descriptor = "Lclient!u;")
	private static Class74 aClass74_1028 = Static72.method1077("Invalid username or password)3");

	@OriginalMember(owner = "client!ld", name = "d", descriptor = "Lclient!u;")
	public static Class74 aClass74_1020 = aClass74_1028;

	@OriginalMember(owner = "client!ld", name = "h", descriptor = "Lclient!u;")
	private static Class74 aClass74_1021 = Static72.method1077("shake:");

	@OriginalMember(owner = "client!ld", name = "j", descriptor = "I")
	public static int anInt1458 = -1;

	@OriginalMember(owner = "client!ld", name = "m", descriptor = "Lclient!u;")
	private static Class74 aClass74_1022 = Static72.method1077("Offline");

	@OriginalMember(owner = "client!ld", name = "n", descriptor = "I")
	public static int anInt1460 = 0;

	@OriginalMember(owner = "client!ld", name = "s", descriptor = "Lclient!u;")
	private static Class74 aClass74_1023 = Static72.method1077("Too many incorrect logins from your address)3");

	@OriginalMember(owner = "client!ld", name = "t", descriptor = "Lclient!u;")
	public static Class74 aClass74_1024 = aClass74_1023;

	@OriginalMember(owner = "client!ld", name = "u", descriptor = "Lclient!u;")
	public static Class74 aClass74_1025 = aClass74_1022;

	@OriginalMember(owner = "client!ld", name = "v", descriptor = "I")
	public static int anInt1463 = 0;

	@OriginalMember(owner = "client!ld", name = "x", descriptor = "Lclient!u;")
	public static Class74 aClass74_1026 = aClass74_1021;

	@OriginalMember(owner = "client!ld", name = "y", descriptor = "Lclient!u;")
	public static Class74 aClass74_1027 = aClass74_1021;

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(I)V")
	public static void method1012() {
		aClass74_1023 = null;
		aClass74_1027 = null;
		aClass74_1025 = null;
		aClass74_1024 = null;
		aClass74_1026 = null;
		aClass74_1021 = null;
		aClass74_1020 = null;
		aClass74_1028 = null;
		aClass26_Sub1_46 = null;
		aClass74_1022 = null;
		aClass2_Sub2_Sub1_Sub1Array8 = null;
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(IZIIILclient!rb;)V")
	public static void method1016(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class2_Sub2_Sub14 arg4) {
		@Pc(7) Class2_Sub9 local7 = new Class2_Sub9();
		local7.anInt1173 = arg4.anInt2275;
		local7.anIntArray138 = arg4.anIntArray319;
		local7.anInt1186 = arg0 * 128;
		local7.anInt1176 = arg3;
		local7.anInt1172 = arg4.anInt2257;
		@Pc(30) int local30 = arg4.anInt2279;
		local7.anInt1182 = arg1 * 128;
		local7.anInt1178 = arg4.anInt2273;
		local7.anInt1177 = arg4.anInt2264 * 128;
		@Pc(48) int local48 = arg4.anInt2259;
		if (arg2 == 1 || arg2 == 3) {
			local48 = arg4.anInt2279;
			local30 = arg4.anInt2259;
		}
		local7.anInt1184 = (arg0 + local48) * 128;
		local7.anInt1185 = (arg1 + local30) * 128;
		if (arg4.anIntArray318 != null) {
			local7.aClass2_Sub2_Sub14_1 = arg4;
			local7.method807();
		}
		Static35.aClass13_69.method418(local7);
		if (local7.anIntArray138 != null) {
			local7.anInt1183 = (int) ((double) (local7.anInt1173 - local7.anInt1172) * Math.random()) + local7.anInt1172;
		}
	}
}
