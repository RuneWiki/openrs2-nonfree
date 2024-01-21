import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static104 {

	@OriginalMember(owner = "client!sb", name = "w", descriptor = "Ljava/awt/Canvas;")
	public static Canvas aCanvas1;

	@OriginalMember(owner = "client!sb", name = "o", descriptor = "Lclient!sc;")
	private static Class66 aClass66_1431 = Static106.method1849("Existing User");

	@OriginalMember(owner = "client!sb", name = "d", descriptor = "Lclient!sc;")
	public static Class66 aClass66_1428 = aClass66_1431;

	@OriginalMember(owner = "client!sb", name = "e", descriptor = "Lclient!sc;")
	private static Class66 aClass66_1429 = Static106.method1849("Free world");

	@OriginalMember(owner = "client!sb", name = "f", descriptor = "I")
	public static int anInt2550 = 0;

	@OriginalMember(owner = "client!sb", name = "i", descriptor = "Lclient!sc;")
	public static Class66 aClass66_1430 = Static106.method1849("scrollen:");

	@OriginalMember(owner = "client!sb", name = "l", descriptor = "I")
	public static int anInt2553 = 0;

	@OriginalMember(owner = "client!sb", name = "n", descriptor = "I")
	public static int anInt2555 = 0;

	@OriginalMember(owner = "client!sb", name = "r", descriptor = "Lclient!sc;")
	public static Class66 aClass66_1432 = Static106.method1849("me");

	@OriginalMember(owner = "client!sb", name = "s", descriptor = "I")
	public static int anInt2558 = -1;

	@OriginalMember(owner = "client!sb", name = "t", descriptor = "Lclient!sc;")
	public static Class66 aClass66_1433 = aClass66_1429;

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(IIIII)I")
	public static int method1798(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(16) int local16 = 65536 - Class1_Sub1_Sub2_Sub4.anIntArray397[arg3 * 1024 / arg1] >> 1;
		return ((65536 - local16) * arg2 >> 16) + (local16 * arg0 >> 16);
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(B)V")
	public static void method1800() {
		aClass66_1430 = null;
		aClass66_1431 = null;
		aCanvas1 = null;
		aClass66_1432 = null;
		aClass66_1429 = null;
		aClass66_1428 = null;
		aClass66_1433 = null;
	}
}
