import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static341 {

	@OriginalMember(owner = "client!ve", name = "b", descriptor = "Lclient!iq;")
	public static Class104 aClass104_24;

	@OriginalMember(owner = "client!ve", name = "g", descriptor = "I")
	public static int anInt462;

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "Z")
	public static boolean aBoolean38 = false;

	@OriginalMember(owner = "client!ve", name = "d", descriptor = "Lclient!nn;")
	public static final Class140 aClass140_11 = new Class140("Examine", "Untersuchen", "Examiner", "Examinar");

	@OriginalMember(owner = "client!ve", name = "h", descriptor = "I")
	public static int anInt463 = 16777215;

	@OriginalMember(owner = "client!ve", name = "i", descriptor = "I")
	public static int anInt464 = 0;

	@OriginalMember(owner = "client!ve", name = "j", descriptor = "I")
	public static int anInt465 = 0;

	@OriginalMember(owner = "client!ve", name = "k", descriptor = "[I")
	public static final int[] anIntArray58 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(Lclient!je;B)V")
	public static void method393(@OriginalArg(0) Class1_Sub2_Sub3_Sub1 arg0) {
		@Pc(19) Class2_Sub37 local19 = (Class2_Sub37) Static13.aClass41_1.method902((long) arg0.anInt6896);
		if (local19 == null) {
			Static177.method3424(0, arg0, arg0.aByte77, null, arg0.anIntArray534[0], arg0.anIntArray535[0], null);
		} else {
			local19.method4838();
		}
	}

	@OriginalMember(owner = "client!ve", name = "b", descriptor = "(I)V")
	public static void method396() {
		Static165.aClass107_18.method3012();
	}
}
