import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static190 {

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "Lclient!gi;")
	public static Class97 aClass97_1;

	@OriginalMember(owner = "client!jp", name = "d", descriptor = "[Lclient!ke;")
	public static Class145[] aClass145Array1;

	@OriginalMember(owner = "client!jp", name = "c", descriptor = "I")
	public static int anInt3490 = 0;

	@OriginalMember(owner = "client!jp", name = "f", descriptor = "J")
	public static long aLong95 = 0L;

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "(III)Lclient!kn;")
	public static Class8_Sub4 method2771(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class75 local7 = Static432.aClass75ArrayArrayArray6[arg0][arg1][arg2];
		return local7 == null || local7.aClass8_Sub4_1 == null ? null : local7.aClass8_Sub4_1;
	}

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "(I)Z")
	public static boolean method2772() {
		if (Static443.aBoolean524) {
			try {
				Static467.method6000("showVideoAd", Static24.aClass196_1.anApplet1);
				return true;
			} catch (@Pc(14) Throwable local14) {
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "(B)V")
	public static void method2774() {
		if (Static65.aClass45_3 == null) {
			return;
		}
		if (Static65.aClass45_3.anInt1129 == 1) {
			Static65.aClass45_3 = null;
			return;
		}
		if (Static65.aClass45_3.anInt1129 == 2) {
			Static34.method1702(Static281.aString42, Static45.aClass196_3, 2);
			Static65.aClass45_3 = null;
			return;
		}
	}
}
