import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static54 {

	@OriginalMember(owner = "client!dj", name = "m", descriptor = "[Lclient!cq;")
	public static Class8[] aClass8Array3;

	@OriginalMember(owner = "client!dj", name = "n", descriptor = "Lclient!wd;")
	public static Class215 aClass215_2;

	@OriginalMember(owner = "client!dj", name = "o", descriptor = "Lclient!wl;")
	public static Class29 aClass29_1;

	@OriginalMember(owner = "client!dj", name = "p", descriptor = "Lclient!tj;")
	public static Class193 aClass193_2;

	@OriginalMember(owner = "client!dj", name = "q", descriptor = "Lclient!cr;")
	public static final Class37 aClass37_26 = new Class37(64);

	@OriginalMember(owner = "client!dj", name = "t", descriptor = "Z")
	public static boolean aBoolean93 = true;

	@OriginalMember(owner = "client!dj", name = "u", descriptor = "I")
	public static int anInt1303 = 0;

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(IZ)V")
	public static void method1087(@OriginalArg(1) boolean arg0) {
		if (Static121.aBoolean337 != arg0) {
			Static121.aBoolean337 = arg0;
			Static146.method4166();
		}
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(IIII)I")
	public static int method1088(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (arg1 < arg0) {
			return arg0;
		} else if (arg2 >= arg1) {
			return arg1;
		} else {
			return arg2;
		}
	}

	@OriginalMember(owner = "client!dj", name = "h", descriptor = "(I)V")
	public static void method1096() {
		Static152.aClass105_9.method4286(((float) Static182.anInt3805 * 0.1F + 0.7F) * Static266.aFloat71);
		Static152.aClass105_9.method4243(Static251.anInt5192, Static127.aFloat16, Static41.aFloat3, (float) Static169.anInt3544, (float) Static326.anInt5671, (float) Static59.anInt1394);
		Static152.aClass105_9.method4256(Static183.aClass78_4);
	}
}
