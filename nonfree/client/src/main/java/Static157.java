import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static157 {

	@OriginalMember(owner = "client!tc", name = "w", descriptor = "[I")
	public static int[] anIntArray519;

	@OriginalMember(owner = "client!tc", name = "H", descriptor = "[I")
	public static int[] anIntArray521;

	@OriginalMember(owner = "client!tc", name = "K", descriptor = "Lclient!ed;")
	private static Class23 aClass23_1480 = Static169.method2903("This world is running a closed Beta)3");

	@OriginalMember(owner = "client!tc", name = "u", descriptor = "Lclient!ed;")
	public static Class23 aClass23_1474 = aClass23_1480;

	@OriginalMember(owner = "client!tc", name = "I", descriptor = "Lclient!ed;")
	private static Class23 aClass23_1479 = Static169.method2903("Loading wordpack )2 ");

	@OriginalMember(owner = "client!tc", name = "v", descriptor = "Lclient!ed;")
	public static Class23 aClass23_1475 = aClass23_1479;

	@OriginalMember(owner = "client!tc", name = "x", descriptor = "J")
	public static long aLong121 = 0L;

	@OriginalMember(owner = "client!tc", name = "B", descriptor = "Lclient!ed;")
	public static Class23 aClass23_1477 = Static169.method2903("Mitglieder)2Welt");

	@OriginalMember(owner = "client!tc", name = "F", descriptor = "Lclient!ed;")
	private static Class23 aClass23_1478 = Static169.method2903("Login");

	@OriginalMember(owner = "client!tc", name = "L", descriptor = "Lclient!ed;")
	public static Class23 aClass23_1481 = aClass23_1478;

	@OriginalMember(owner = "client!tc", name = "M", descriptor = "I")
	public static int anInt3834 = 0;

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(B)V")
	public static void method2650() {
		aClass23_1477 = null;
		anIntArray519 = null;
		aClass23_1474 = null;
		anIntArray521 = null;
		aClass23_1480 = null;
		aClass23_1475 = null;
		aClass23_1481 = null;
		aClass23_1479 = null;
		aClass23_1478 = null;
		Class1_Sub22.anIntArray520 = null;
	}

	@OriginalMember(owner = "client!tc", name = "d", descriptor = "(I)V")
	public static void method2651() {
		for (@Pc(3) int local3 = 0; local3 < Static86.anInt2307; local3++) {
			@Pc(9) int local9 = Static141.anIntArray476[local3];
			@Pc(13) Class1_Sub1_Sub1_Sub1_Sub2 local13 = Static154.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local9];
			if (local13 != null) {
				Static152.method2441(local13.aClass1_Sub1_Sub9_1.anInt1540, local13);
			}
		}
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(IZ)Lclient!wf;")
	public static Class1_Sub1_Sub18 method2652(@OriginalArg(0) int arg0) {
		@Pc(10) Class1_Sub1_Sub18 local10 = (Class1_Sub1_Sub18) Static57.aClass79_8.method2657((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(25) byte[] local25 = Static66.aClass30_27.method1301(12, arg0);
		local10 = new Class1_Sub1_Sub18();
		if (local25 != null) {
			local10.method3110(new Class1_Sub8(local25));
		}
		local10.method3104();
		Static57.aClass79_8.method2658((long) arg0, local10);
		return local10;
	}
}
