import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static281 {

	@OriginalMember(owner = "client!oa", name = "o", descriptor = "I")
	public static int anInt7178;

	@OriginalMember(owner = "client!oa", name = "h", descriptor = "I")
	public static int anInt7172 = -1;

	@OriginalMember(owner = "client!oa", name = "n", descriptor = "Lclient!jo;")
	public static final Class126 aClass126_61 = new Class126(260);

	@OriginalMember(owner = "client!oa", name = "f", descriptor = "(I)V")
	public static void method5550() {
		Static1.aClass164_1.method3509();
		Static406.aClass164_37.method3509();
	}

	@OriginalMember(owner = "client!oa", name = "e", descriptor = "(B)V")
	public static void method5553() {
		@Pc(10) int local10 = 0;
		if (Static130.aClass153_Sub1_1.method4218(Static377.anInt6113)) {
			local10 = 55;
		}
		if (!Static130.aClass153_Sub1_1.aBoolean338) {
			local10 |= 0x40;
		}
		Static210.method5515(local10);
		Static411.aClass142_4.method3146(local10);
		Static259.aClass206_2.method4322(local10);
		Static442.aClass98_1.method2242(local10);
		Static79.aClass231_1.method4831(local10);
		Static115.method1950(local10);
		Static386.method4942(local10);
		Static392.method4991(local10);
		Static84.method3639(local10);
		Static145.method2628();
	}
}
