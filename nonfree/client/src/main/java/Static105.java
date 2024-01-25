import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static105 {

	@OriginalMember(owner = "client!gn", name = "gb", descriptor = "I")
	public static int anInt2399;

	@OriginalMember(owner = "client!gn", name = "yb", descriptor = "[[[Lclient!og;")
	public static Class155[][][] aClass155ArrayArrayArray3;

	@OriginalMember(owner = "client!gn", name = "L", descriptor = "[I")
	public static final int[] anIntArray179 = new int[30];

	@OriginalMember(owner = "client!gn", name = "tb", descriptor = "Lclient!ei;")
	public static final Class44 aClass44_5 = new Class44(64);

	@OriginalMember(owner = "client!gn", name = "Gb", descriptor = "I")
	public static int anInt2414 = -1;

	@OriginalMember(owner = "client!gn", name = "Hb", descriptor = "I")
	public static int anInt2415 = 127;

	@OriginalMember(owner = "client!gn", name = "c", descriptor = "(I)V")
	public static void method2287() {
		for (@Pc(17) Class1_Sub4_Sub1 local17 = (Class1_Sub4_Sub1) Static42.aClass42_3.method1543(); local17 != null; local17 = (Class1_Sub4_Sub1) Static42.aClass42_3.method1551()) {
			@Pc(22) Class11_Sub2_Sub2 local22 = local17.aClass11_Sub2_Sub2_1;
			if (local22.aBoolean127) {
				local17.method6045();
				local22.method1712();
			} else if (local22.anInt1773 <= Static51.anInt1301) {
				local22.method1715(Static217.anInt4314);
				if (local22.aBoolean127) {
					local17.method6045();
				} else {
					Static152.method2920(local22, true);
				}
			}
		}
	}
}
