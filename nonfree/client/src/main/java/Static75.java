import java.awt.Image;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static75 {

	@OriginalMember(owner = "client!n", name = "i", descriptor = "[I")
	public static int[] anIntArray175;

	@OriginalMember(owner = "client!n", name = "q", descriptor = "[Lclient!id;")
	public static Class3_Sub1_Sub1_Sub2[] aClass3_Sub1_Sub1_Sub2Array41;

	@OriginalMember(owner = "client!n", name = "r", descriptor = "Ljava/awt/Image;")
	public static Image anImage4;

	@OriginalMember(owner = "client!n", name = "C", descriptor = "I")
	public static int anInt2033;

	@OriginalMember(owner = "client!n", name = "b", descriptor = "J")
	public static long aLong55 = 0L;

	@OriginalMember(owner = "client!n", name = "d", descriptor = "I")
	public static int anInt2022 = 0;

	@OriginalMember(owner = "client!n", name = "e", descriptor = "Lclient!oa;")
	public static Class56 aClass56_1081 = Static33.method650("Anmelde)2Limit -Uberschritten)3");

	@OriginalMember(owner = "client!n", name = "f", descriptor = "Lclient!oa;")
	public static Class56 aClass56_1082 = Static33.method650("Freund hinzuf-Ugen");

	@OriginalMember(owner = "client!n", name = "h", descriptor = "Lclient!oa;")
	public static Class56 aClass56_1083 = Static33.method650(" loggt sich ein)3");

	@OriginalMember(owner = "client!n", name = "j", descriptor = "I")
	public static int anInt2024 = 0;

	@OriginalMember(owner = "client!n", name = "n", descriptor = "Lclient!oa;")
	private static Class56 aClass56_1084 = Static33.method650("Unexpected loginserver response)3");

	@OriginalMember(owner = "client!n", name = "t", descriptor = "Lclient!oa;")
	private static Class56 aClass56_1085 = Static33.method650("Off");

	@OriginalMember(owner = "client!n", name = "u", descriptor = "Lclient!oa;")
	public static Class56 aClass56_1086 = aClass56_1084;

	@OriginalMember(owner = "client!n", name = "v", descriptor = "[I")
	public static int[] anIntArray176 = new int[32768];

	@OriginalMember(owner = "client!n", name = "w", descriptor = "Lclient!oa;")
	public static Class56 aClass56_1087 = Static33.method650("Spiel)2Engine wird gestartet)3)3)3");

	@OriginalMember(owner = "client!n", name = "B", descriptor = "Lclient!oa;")
	public static Class56 aClass56_1088 = aClass56_1085;

	@OriginalMember(owner = "client!n", name = "F", descriptor = "Lclient!oa;")
	public static Class56 aClass56_1089 = Static33.method650("m-Ochte sich mit Ihnen duellieren)3");

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(BI)I")
	public static int method1343(@OriginalArg(1) int arg0) {
		@Pc(12) Class3_Sub1_Sub13 local12 = Static83.method1508(arg0);
		@Pc(15) int local15 = local12.anInt2468;
		@Pc(18) int local18 = local12.anInt2462;
		@Pc(21) int local21 = local12.anInt2466;
		@Pc(28) int local28 = client.anIntArray33[local21 - local15];
		return Static115.anIntArray292[local18] >> local15 & local28;
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(Lclient!tb;BII)Lclient!gb;")
	public static Class3_Sub1_Sub1_Sub1 method1347(@OriginalArg(0) Class44 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		return Static87.method1606(arg1, arg0, arg2) ? Static19.method400() : null;
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(ILclient!oa;ZLclient!oa;)V")
	public static void method1348(@OriginalArg(0) int arg0, @OriginalArg(1) Class56 arg1, @OriginalArg(3) Class56 arg2) {
		if (arg0 == 0 && Static69.anInt1918 != -1) {
			Static34.aClass56_531 = arg1;
			Static36.anInt1014 = 0;
		}
		if (Static57.anInt1609 == -1) {
			Static12.aBoolean17 = true;
		}
		for (@Pc(20) int local20 = 99; local20 > 0; local20--) {
			Static125.anIntArray337[local20] = Static125.anIntArray337[local20 - 1];
			Static54.aClass56Array5[local20] = Static54.aClass56Array5[local20 - 1];
			Static119.aClass56Array19[local20] = Static119.aClass56Array19[local20 - 1];
		}
		Static54.aClass56Array5[0] = arg2;
		Static125.anIntArray337[0] = arg0;
		Static119.aClass56Array19[0] = arg1;
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(II)Lclient!oa;")
	public static Class56 method1349(@OriginalArg(1) int arg0) {
		return Static84.method1524(new Class56[] { Static111.method1851(arg0 >> 24 & 0xFF), Static111.aClass56_1544, Static111.method1851(arg0 >> 16 & 0xFF), Static111.aClass56_1544, Static111.method1851(arg0 >> 8 & 0xFF), Static111.aClass56_1544, Static111.method1851(arg0 & 0xFF) });
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(B)V")
	public static void method1350() {
		aClass56_1088 = null;
		aClass56_1086 = null;
		aClass56_1089 = null;
		aClass56_1084 = null;
		aClass56_1081 = null;
		aClass56_1087 = null;
		aClass56_1083 = null;
		anImage4 = null;
		anIntArray175 = null;
		aClass56_1082 = null;
		aClass3_Sub1_Sub1_Sub2Array41 = null;
		anIntArray176 = null;
		aClass56_1085 = null;
	}
}
