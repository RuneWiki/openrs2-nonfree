import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static48 {

	@OriginalMember(owner = "client!j", name = "d", descriptor = "I")
	public static int anInt1496;

	@OriginalMember(owner = "client!j", name = "j", descriptor = "Z")
	public static boolean aBoolean63;

	@OriginalMember(owner = "client!j", name = "k", descriptor = "[I")
	public static int[] anIntArray226;

	@OriginalMember(owner = "client!j", name = "o", descriptor = "I")
	public static int anInt1502;

	@OriginalMember(owner = "client!j", name = "b", descriptor = "Lclient!sc;")
	public static Class66 aClass66_800 = Static106.method1849(": ");

	@OriginalMember(owner = "client!j", name = "e", descriptor = "Lclient!sc;")
	private static Class66 aClass66_801 = Static106.method1849("Unable to find ");

	@OriginalMember(owner = "client!j", name = "h", descriptor = "Lclient!sc;")
	public static Class66 aClass66_802 = Static106.method1849("Fehler beim Laden Ihres Spielcharakters)3");

	@OriginalMember(owner = "client!j", name = "i", descriptor = "I")
	public static int anInt1499 = 0;

	@OriginalMember(owner = "client!j", name = "l", descriptor = "[Lclient!ae;")
	public static Class5_Sub1[] aClass5_Sub1Array1 = new Class5_Sub1[256];

	@OriginalMember(owner = "client!j", name = "p", descriptor = "Lclient!sc;")
	public static Class66 aClass66_803 = aClass66_801;

	@OriginalMember(owner = "client!j", name = "q", descriptor = "[I")
	public static int[] anIntArray227 = new int[] { -1, -1, 1, 1 };

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(ZLclient!sc;Lclient!sc;Lclient!sc;)V")
	public static void method1050(@OriginalArg(1) Class66 arg0, @OriginalArg(2) Class66 arg1, @OriginalArg(3) Class66 arg2) {
		Static109.aClass66_1479 = arg0;
		Static109.aClass66_1452 = arg1;
		Static109.aClass66_1491 = arg2;
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(III)I")
	public static int method1051(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(17) Class1_Sub24 local17 = (Class1_Sub24) Static38.aClass65_43.method1802((long) arg0);
		if (local17 == null) {
			return -1;
		} else if (arg1 >= 0 && arg1 < local17.anIntArray501.length) {
			return local17.anIntArray501[arg1];
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(IZ)Z")
	public static boolean method1052(@OriginalArg(0) int arg0) {
		return arg0 >= 97 && arg0 <= 122 || arg0 >= 65 && arg0 <= 90;
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(I)V")
	public static void method1053() {
		anIntArray226 = null;
		aClass5_Sub1Array1 = null;
		aClass66_803 = null;
		aClass66_800 = null;
		anIntArray227 = null;
		aClass66_801 = null;
		aClass66_802 = null;
	}
}
