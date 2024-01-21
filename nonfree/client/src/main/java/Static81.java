import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static81 {

	@OriginalMember(owner = "client!oa", name = "x", descriptor = "[I")
	public static int[] anIntArray188;

	@OriginalMember(owner = "client!oa", name = "Z", descriptor = "Lclient!kd;")
	public static Class44_Sub1 aClass44_Sub1_53;

	@OriginalMember(owner = "client!oa", name = "c", descriptor = "[I")
	public static int[] anIntArray187 = new int[256];

	@OriginalMember(owner = "client!oa", name = "j", descriptor = "I")
	public static int anInt2156 = 0;

	@OriginalMember(owner = "client!oa", name = "r", descriptor = "Lclient!oa;")
	private static Class56 aClass56_1167 = Static33.method650("Checking for updates )2 ");

	@OriginalMember(owner = "client!oa", name = "M", descriptor = "Lclient!oa;")
	private static Class56 aClass56_1172 = Static33.method650("Take");

	@OriginalMember(owner = "client!oa", name = "s", descriptor = "Lclient!oa;")
	public static Class56 aClass56_1168 = aClass56_1172;

	@OriginalMember(owner = "client!oa", name = "t", descriptor = "I")
	public static int anInt2164 = 0;

	@OriginalMember(owner = "client!oa", name = "A", descriptor = "Lclient!oa;")
	public static Class56 aClass56_1169 = Static33.method650("Privater Chat");

	@OriginalMember(owner = "client!oa", name = "D", descriptor = "Lclient!oa;")
	public static Class56 aClass56_1170 = aClass56_1167;

	@OriginalMember(owner = "client!oa", name = "H", descriptor = "Lclient!oa;")
	public static Class56 aClass56_1171 = Static33.method650("Lade Konfiguration )2 ");

	@OriginalMember(owner = "client!oa", name = "Y", descriptor = "Lclient!oa;")
	public static Class56 aClass56_1173 = Static33.method650("gleiten:");

	@OriginalMember(owner = "client!oa", name = "cb", descriptor = "I")
	public static volatile int anInt2191 = -1;

	@OriginalMember(owner = "client!oa", name = "c", descriptor = "(I)V")
	public static void method1420() {
		anIntArray188 = null;
		aClass44_Sub1_53 = null;
		aClass56_1173 = null;
		anIntArray187 = null;
		aClass56_1169 = null;
		aClass56_1167 = null;
		aClass56_1170 = null;
		aClass56_1172 = null;
		aClass56_1171 = null;
		aClass56_1168 = null;
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIZILclient!tb;)V")
	public static void method1430(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) Class44 arg3) {
		Static19.anInt592 = 10000;
		Static117.anInt2967 = arg1;
		Static57.anInt1619 = arg2;
		Static57.anInt1621 = 1;
		Static2.aBoolean1 = false;
		Static47.aClass44_30 = arg3;
		Static19.anInt593 = arg0;
	}

	@OriginalMember(owner = "client!oa", name = "k", descriptor = "(I)V")
	public static void method1447() {
		Static16.aClass52_9.method1346();
		Static42.aClass52_25.method1346();
		Static38.aClass52_22.method1346();
	}

	@OriginalMember(owner = "client!oa", name = "f", descriptor = "(II)Z")
	public static boolean method1452(@OriginalArg(1) int arg0) {
		if (arg0 < 0) {
			return false;
		}
		@Pc(16) int local16 = Static9.anIntArray9[arg0];
		if (local16 >= 2000) {
			local16 -= 2000;
		}
		return local16 == 18;
	}
}
