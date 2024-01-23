import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static27 {

	@OriginalMember(owner = "client!cf", name = "g", descriptor = "[I")
	public static int[] anIntArray44 = new int[] { 2, 2, 4, 2, 1, 8, 4, 1, 4, 4, 2 };

	@OriginalMember(owner = "client!cf", name = "i", descriptor = "I")
	public static int anInt651 = 1;

	@OriginalMember(owner = "client!cf", name = "k", descriptor = "[Lclient!ia;")
	public static Class51[] aClass51Array5 = new Class51[8];

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(II)Lclient!ia;")
	public static Class51 method511(@OriginalArg(1) int arg0) {
		return Static198.method3275(arg0, false);
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(IIIBII)V")
	public static void method512(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (Static160.anInt3454 <= arg3 && Static149.anInt3252 >= arg2 && arg4 >= Static225.anInt4729 && arg1 <= Static122.anInt2710) {
			Static218.method1764(arg4, arg2, arg0, arg3, arg1);
		} else {
			Static66.method1132(arg2, arg3, arg1, arg4, arg0);
		}
	}

	@OriginalMember(owner = "client!cf", name = "b", descriptor = "(II)Z")
	public static boolean method513(@OriginalArg(1) int arg0) {
		return (arg0 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!cf", name = "b", descriptor = "(I)V")
	public static void method514() {
		@Pc(3) Class22 local3 = Static188.aClass22_1;
		synchronized (Static188.aClass22_1) {
			Static39.anInt968 = Static193.anInt4185;
			Static13.anInt326++;
			@Pc(24) int local24;
			if (Static53.anInt1239 >= 0) {
				while (Static53.anInt1239 != Static123.anInt2719) {
					local24 = Static223.anIntArray373[Static123.anInt2719];
					Static123.anInt2719 = Static123.anInt2719 + 1 & 0x7F;
					if (local24 < 0) {
						Static208.aBooleanArray25[~local24] = false;
					} else {
						Static208.aBooleanArray25[local24] = true;
					}
				}
			} else {
				for (local24 = 0; local24 < 112; local24++) {
					Static208.aBooleanArray25[local24] = false;
				}
				Static53.anInt1239 = Static123.anInt2719;
			}
			Static193.anInt4185 = Static86.anInt2010;
		}
	}
}
