import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static34 {

	@OriginalMember(owner = "client!fc", name = "r", descriptor = "[Lclient!ec;")
	public static Class22[] aClass22Array7;

	@OriginalMember(owner = "client!fc", name = "y", descriptor = "[I")
	public static int[] anIntArray94;

	@OriginalMember(owner = "client!fc", name = "E", descriptor = "I")
	public static int anInt859;

	@OriginalMember(owner = "client!fc", name = "t", descriptor = "Lclient!ec;")
	public static Class22 aClass22_237 = Static60.method1113("Keine Antwort vom Server)3");

	@OriginalMember(owner = "client!fc", name = "H", descriptor = "Lclient!ec;")
	private static Class22 aClass22_241 = Static60.method1113("flash2:");

	@OriginalMember(owner = "client!fc", name = "u", descriptor = "Lclient!ec;")
	public static Class22 aClass22_238 = aClass22_241;

	@OriginalMember(owner = "client!fc", name = "z", descriptor = "I")
	public static int anInt856 = 0;

	@OriginalMember(owner = "client!fc", name = "A", descriptor = "Lclient!ec;")
	public static Class22 aClass22_239 = Static60.method1113("mod_icons");

	@OriginalMember(owner = "client!fc", name = "B", descriptor = "I")
	public static int anInt857 = 0;

	@OriginalMember(owner = "client!fc", name = "G", descriptor = "Lclient!ec;")
	public static Class22 aClass22_240 = aClass22_241;

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(IIII)I")
	public static int method556(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(3) int local3 = arg0 & 0x3;
		if (local3 == 0) {
			return arg1;
		} else if (local3 == 1) {
			return arg2;
		} else if (local3 == 2) {
			return 7 - arg1;
		} else {
			return 7 - arg2;
		}
	}

	@OriginalMember(owner = "client!fc", name = "d", descriptor = "(I)V")
	public static void method557() {
		anIntArray94 = null;
		aClass22_241 = null;
		aClass22_240 = null;
		aClass22_239 = null;
		aClass22_238 = null;
		aClass22_237 = null;
		aClass22Array7 = null;
	}
}
