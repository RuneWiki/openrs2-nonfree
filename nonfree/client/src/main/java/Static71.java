import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static71 {

	@OriginalMember(owner = "client!f", name = "db", descriptor = "Lclient!lc;")
	public static Class98 aClass98_43;

	@OriginalMember(owner = "client!f", name = "eb", descriptor = "Lclient!lc;")
	public static Class98 aClass98_44;

	@OriginalMember(owner = "client!f", name = "ib", descriptor = "I")
	public static int anInt1318;

	@OriginalMember(owner = "client!f", name = "I", descriptor = "[S")
	public static short[] aShortArray12 = new short[] { -10304, 9104, -1, -1, -1 };

	@OriginalMember(owner = "client!f", name = "M", descriptor = "I")
	public static int anInt1312 = 127;

	@OriginalMember(owner = "client!f", name = "fb", descriptor = "I")
	public static int anInt1315 = 500;

	@OriginalMember(owner = "client!f", name = "gb", descriptor = "I")
	public static int anInt1316 = 0;

	@OriginalMember(owner = "client!f", name = "b", descriptor = "(II)V")
	public static void method1075(@OriginalArg(1) int arg0) {
		Static60.anInt1152--;
		if (Static60.anInt1152 == arg0) {
			return;
		}
		Static307.method3243(Static261.aStringArray34, arg0 + 1, Static261.aStringArray34, arg0, Static60.anInt1152 - arg0);
		Static307.method3243(Static35.aStringArray7, arg0 + 1, Static35.aStringArray7, arg0, Static60.anInt1152 - arg0);
		Static307.method3248(Static196.anIntArray322, arg0 + 1, Static196.anIntArray322, arg0, Static60.anInt1152 - arg0);
		Static307.method3241(Static299.aShortArray93, arg0 + 1, Static299.aShortArray93, arg0, Static60.anInt1152 - arg0);
		Static307.method3242(Static100.aLongArray4, arg0 + 1, Static100.aLongArray4, arg0, Static60.anInt1152 - arg0);
		Static307.method3248(Static66.anIntArray136, arg0 + 1, Static66.anIntArray136, arg0, Static60.anInt1152 - arg0);
		Static307.method3248(Static136.anIntArray251, arg0 + 1, Static136.anIntArray251, arg0, Static60.anInt1152 - arg0);
	}

	@OriginalMember(owner = "client!f", name = "j", descriptor = "(I)V")
	public static void method1076() {
		aClass98_43 = null;
		aClass98_44 = null;
		aShortArray12 = null;
	}

	@OriginalMember(owner = "client!f", name = "b", descriptor = "(IB)I")
	public static int method1077(@OriginalArg(0) int arg0) {
		return arg0 >>> 8;
	}
}
