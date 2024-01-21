import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static117 {

	@OriginalMember(owner = "client!ub", name = "K", descriptor = "Lclient!je;")
	private static Class40 aClass40_1470 = Static69.method1231(" is already on your ignore list");

	@OriginalMember(owner = "client!ub", name = "Q", descriptor = "Lclient!je;")
	public static Class40 aClass40_1471 = Static69.method1231("<img=1>");

	@OriginalMember(owner = "client!ub", name = "S", descriptor = "Lclient!je;")
	private static Class40 aClass40_1472 = Static69.method1231("K");

	@OriginalMember(owner = "client!ub", name = "T", descriptor = "Lclient!je;")
	public static Class40 aClass40_1473 = aClass40_1472;

	@OriginalMember(owner = "client!ub", name = "Z", descriptor = "J")
	public static volatile long aLong77 = 0L;

	@OriginalMember(owner = "client!ub", name = "ab", descriptor = "Lclient!je;")
	public static Class40 aClass40_1474 = Static69.method1231(":assistreq:");

	@OriginalMember(owner = "client!ub", name = "cb", descriptor = "Lclient!je;")
	public static Class40 aClass40_1475 = aClass40_1472;

	@OriginalMember(owner = "client!ub", name = "nb", descriptor = "Lclient!je;")
	public static Class40 aClass40_1476 = Static69.method1231("cross");

	@OriginalMember(owner = "client!ub", name = "qb", descriptor = "Lclient!je;")
	public static Class40 aClass40_1477 = aClass40_1470;

	@OriginalMember(owner = "client!ub", name = "Rb", descriptor = "Lclient!je;")
	public static Class40 aClass40_1478 = Static69.method1231("Benutzername: ");

	@OriginalMember(owner = "client!ub", name = "Sb", descriptor = "[I")
	public static int[] anIntArray323 = new int[100];

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(ZLjava/awt/Component;)V")
	public static void method1969(@OriginalArg(1) Component arg0) {
		arg0.removeMouseListener(Static49.aClass10_1);
		arg0.removeMouseMotionListener(Static49.aClass10_1);
		arg0.removeFocusListener(Static49.aClass10_1);
		Static73.anInt1925 = 0;
	}

	@OriginalMember(owner = "client!ub", name = "d", descriptor = "(B)V")
	public static void method1992() {
		aClass40_1475 = null;
		aClass40_1470 = null;
		aClass40_1478 = null;
		aClass40_1474 = null;
		aClass40_1472 = null;
		aClass40_1473 = null;
		anIntArray323 = null;
		aClass40_1476 = null;
		aClass40_1471 = null;
		aClass40_1477 = null;
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(BI[BLclient!ha;)V")
	public static void method1993(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) Class29 arg2) {
		@Pc(12) Class2_Sub17 local12 = new Class2_Sub17();
		local12.anInt2084 = 0;
		local12.aByteArray28 = arg1;
		local12.aLong100 = arg0;
		local12.aClass29_4 = arg2;
		@Pc(27) Class3 local27 = Static5.aClass3_1;
		synchronized (Static5.aClass3_1) {
			Static5.aClass3_1.method75(local12);
		}
		Static81.method1412();
	}
}
