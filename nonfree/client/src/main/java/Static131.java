import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static131 {

	@OriginalMember(owner = "client!qg", name = "j", descriptor = "[I")
	public static int[] anIntArray333;

	@OriginalMember(owner = "client!qg", name = "o", descriptor = "Lclient!da;")
	public static Class14 aClass14_10;

	@OriginalMember(owner = "client!qg", name = "g", descriptor = "Lclient!da;")
	public static Class14 aClass14_9 = new Class14(512);

	@OriginalMember(owner = "client!qg", name = "k", descriptor = "Lclient!ea;")
	public static Class18 aClass18_940 = Static8.method128("Wir vermuten)1 dass Ihr Konto gestohlen wurde");

	@OriginalMember(owner = "client!qg", name = "m", descriptor = "[I")
	public static int[] anIntArray334 = new int[500];

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(I)V")
	public static void method2537() {
		aClass14_10 = null;
		anIntArray334 = null;
		anIntArray333 = null;
		aClass18_940 = null;
		aClass14_9 = null;
	}

	@OriginalMember(owner = "client!qg", name = "c", descriptor = "(I)V")
	public static void method2540() {
		Static95.aClass1_Sub6_Sub1_1.method555(151);
		for (@Pc(23) Class1_Sub8 local23 = (Class1_Sub8) Static155.aClass14_14.method563(); local23 != null; local23 = (Class1_Sub8) Static155.aClass14_14.method571()) {
			if (local23.anInt1186 == 0 || local23.anInt1186 == 3) {
				Static24.method558(local23, true);
			}
		}
		if (Static161.aClass20_13 != null) {
			Static152.method2858(Static161.aClass20_13);
			Static161.aClass20_13 = null;
		}
	}
}
