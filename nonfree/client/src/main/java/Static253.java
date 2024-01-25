import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static253 {

	@OriginalMember(owner = "client!iga", name = "m", descriptor = "I")
	public static int anInt4790;

	@OriginalMember(owner = "client!iga", name = "l", descriptor = "I")
	public static int anInt4796;

	@OriginalMember(owner = "client!iga", name = "r", descriptor = "Lclient!lga;")
	public static Class223 aClass223_56;

	@OriginalMember(owner = "client!iga", name = "x", descriptor = "[J")
	public static final long[] aLongArray7 = new long[100];

	@OriginalMember(owner = "client!iga", name = "i", descriptor = "I")
	public static int anInt4791 = -50;

	@OriginalMember(owner = "client!iga", name = "a", descriptor = "(B)V")
	public static void method4388() {
		if (Static420.aClass331_1 != null) {
			Static616.aClass339_1 = new Class339();
			Static616.aClass339_1.method8119(Static420.aClass331_1, Static420.aClass331_1.anInt9109, Static682.aLong344, Static420.aClass331_1.aClass43_64.method596(Static601.anInt9518));
			Static203.aThread7 = new Thread(Static616.aClass339_1, "");
			Static203.aThread7.start();
		}
	}

	@OriginalMember(owner = "client!iga", name = "a", descriptor = "(I)V")
	public static void method4389() {
		for (@Pc(8) Class6_Sub33 local8 = (Class6_Sub33) Static252.aClass74_67.method1404(); local8 != null; local8 = (Class6_Sub33) Static252.aClass74_67.method1405()) {
			Static277.method4643(local8.anInt5790);
		}
	}
}
