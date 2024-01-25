import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static32 {

	@OriginalMember(owner = "client!b", name = "s", descriptor = "I")
	public static int anInt1113;

	@OriginalMember(owner = "client!b", name = "u", descriptor = "I")
	public static int anInt1120;

	@OriginalMember(owner = "client!b", name = "D", descriptor = "J")
	public static long aLong30;

	@OriginalMember(owner = "client!b", name = "I", descriptor = "Lclient!lma;")
	public static final Class234 aClass234_1 = new Class234();

	@OriginalMember(owner = "client!b", name = "y", descriptor = "Lclient!sja;")
	public static final Class342 aClass342_16 = new Class342();

	@OriginalMember(owner = "client!b", name = "B", descriptor = "Lclient!gs;")
	public static final Class144 aClass144_10 = new Class144(37, 6);

	@OriginalMember(owner = "client!b", name = "d", descriptor = "(I)V")
	public static void method1057(@OriginalArg(0) int arg0) {
		Static477.aClass87_1.method6747();
		for (@Pc(10) int local10 = 0; local10 < 32; local10++) {
			Static13.aLongArray1[local10] = 0L;
		}
		if (arg0 <= 87) {
			method1057(100);
		}
		for (@Pc(37) int local37 = 0; local37 < 32; local37++) {
			Static651.aLongArray25[local37] = 0L;
		}
		Static65.anInt8657 = 0;
	}
}
