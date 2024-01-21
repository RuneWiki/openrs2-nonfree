import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static154 {

	@OriginalMember(owner = "client!th", name = "Y", descriptor = "Lclient!eh;")
	public static Class28 aClass28_1284 = Static170.method3101("und haben es deaktiviert)3 Klicken Sie auf der");

	@OriginalMember(owner = "client!th", name = "cb", descriptor = "Z")
	public static boolean aBoolean178 = false;

	@OriginalMember(owner = "client!th", name = "db", descriptor = "Lclient!eh;")
	private static Class28 aClass28_1285 = Static170.method3101("cyan:");

	@OriginalMember(owner = "client!th", name = "gb", descriptor = "Lclient!eh;")
	public static Class28 aClass28_1286 = Static170.method3101("Willkommen auf RuneScape");

	@OriginalMember(owner = "client!th", name = "hb", descriptor = "Lclient!eh;")
	public static Class28 aClass28_1287 = aClass28_1285;

	@OriginalMember(owner = "client!th", name = "ib", descriptor = "I")
	public static int anInt3821 = -1;

	@OriginalMember(owner = "client!th", name = "lb", descriptor = "Lclient!eh;")
	public static Class28 aClass28_1288 = null;

	@OriginalMember(owner = "client!th", name = "mb", descriptor = "Lclient!eh;")
	public static Class28 aClass28_1289 = aClass28_1285;

	@OriginalMember(owner = "client!th", name = "ob", descriptor = "Lclient!eh;")
	public static Class28 aClass28_1290 = Static170.method3101("auf einer freien Welt zu spielen)3");

	@OriginalMember(owner = "client!th", name = "c", descriptor = "(Z)V")
	public static void method2919() {
		try {
			if (Static140.aClass82_1 == null) {
				Static140.aClass82_1 = new Class82(Static123.aClass68_4, Static4.method96(new Class28[] { Static4.aClass28_41, Static156.aClass28_1304, Static124.aClass28_1043 }).method909());
			} else {
				@Pc(41) byte[] local41 = Static140.aClass82_1.method3105();
				if (local41 != null) {
					@Pc(48) Class3_Sub8 local48 = new Class3_Sub8(local41);
					Static83.anInt2455 = local48.method1510();
					Static59.aClass67Array1 = new Class67[Static83.anInt2455];
					for (@Pc(57) int local57 = 0; local57 < Static83.anInt2455; local57++) {
						@Pc(67) Class67 local67 = Static59.aClass67Array1[local57] = new Class67();
						@Pc(71) int local71 = local48.method1510();
						local67.aBoolean155 = (local71 & 0x8000) != 0;
						local67.anInt3279 = local71 & 0x7FFF;
						local67.aClass28_1077 = local48.method1516();
						local67.anInt3286 = local48.method1542();
						local67.anInt3281 = local57;
						local67.anInt3283 = Static171.method3107(local67.aClass28_1077);
					}
					Static102.method2117(Static59.aClass67Array1.length - 1, Static96.anIntArray697, 0, Static109.anIntArray492, Static59.aClass67Array1);
					Static109.aBoolean138 = true;
					Static140.aClass82_1 = null;
				}
			}
		} catch (@Pc(124) Exception local124) {
			local124.printStackTrace();
			Static140.aClass82_1 = null;
		}
	}

	@OriginalMember(owner = "client!th", name = "c", descriptor = "(B)V")
	public static void method2920() {
		aClass28_1285 = null;
		aClass28_1287 = null;
		aClass28_1284 = null;
		aClass28_1286 = null;
		aClass28_1289 = null;
		aClass28_1288 = null;
		aClass28_1290 = null;
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(Lclient!eh;Lclient!eh;ILclient!ah;)Lclient!dh;")
	public static Class3_Sub2_Sub2_Sub3 method2921(@OriginalArg(0) Class28 arg0, @OriginalArg(1) Class28 arg1, @OriginalArg(3) Class7 arg2) {
		@Pc(13) int local13 = arg2.method1029(arg1);
		@Pc(19) int local19 = arg2.method1031(arg0, local13);
		return Static173.method3142(local19, arg2, local13);
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(II)Lclient!eh;")
	public static Class28 method2922(@OriginalArg(1) int arg0) {
		return arg0 < 999999999 ? Static146.method2793(arg0) : Static128.aClass28_1073;
	}
}
