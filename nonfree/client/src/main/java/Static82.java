import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static82 {

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "[I")
	public static int[] anIntArray172;

	@OriginalMember(owner = "client!fn", name = "e", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray11;

	@OriginalMember(owner = "client!fn", name = "h", descriptor = "Lclient!sm;")
	public static Class158 aClass158_1;

	@OriginalMember(owner = "client!fn", name = "b", descriptor = "I")
	public static volatile int anInt1579 = 0;

	@OriginalMember(owner = "client!fn", name = "d", descriptor = "Lclient!dh;")
	public static Class33 aClass33_11 = new Class33(64);

	@OriginalMember(owner = "client!fn", name = "g", descriptor = "Z")
	public static boolean aBoolean124 = false;

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(Z)V")
	public static void method1276() {
		aClass158_1 = null;
		aClass33_11 = null;
		anIntArray172 = null;
		aStringArray11 = null;
	}

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(ZIIII)V")
	public static void method1277(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		Static284.aLong192 = 0L;
		@Pc(8) int local8 = Static40.method683();
		@Pc(10) boolean local10 = false;
		if (arg1 <= 0 == local8 > 0) {
			local10 = true;
		}
		if (arg1 == 3 || local8 == 3) {
			arg0 = true;
		}
		if (Static260.aString172.startsWith("mac") && arg1 > 0) {
			arg0 = true;
		}
		if (arg0 && arg1 > 0) {
			local10 = true;
		}
		Static235.method3669(local10, arg0, arg3, local8, arg2, arg1);
	}

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(B)Z")
	public static boolean method1278() {
		if (Static287.aBoolean169) {
			try {
				return !((Boolean) Static301.method121(Static87.aClass164_2.anApplet1, "showingVideoAd"));
			} catch (@Pc(27) Throwable local27) {
			}
		}
		return true;
	}
}
