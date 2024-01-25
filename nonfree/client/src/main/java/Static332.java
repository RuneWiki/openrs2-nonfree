import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static332 {

	@OriginalMember(owner = "client!mk", name = "j", descriptor = "F")
	public static float aFloat243;

	@OriginalMember(owner = "client!mk", name = "s", descriptor = "Lclient!mq;")
	public static Class12_Sub2_Sub1_Sub4_Sub1 aClass12_Sub2_Sub1_Sub4_Sub1_30;

	@OriginalMember(owner = "client!mk", name = "n", descriptor = "Lclient!iba;")
	public static final Class154 aClass154_129 = new Class154(70, 3);

	@OriginalMember(owner = "client!mk", name = "o", descriptor = "Z")
	public static boolean aBoolean802 = false;

	@OriginalMember(owner = "client!mk", name = "r", descriptor = "Z")
	public static boolean aBoolean803 = false;

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(Lclient!r;I)V")
	public static void method7658(@OriginalArg(0) Class162 arg0) {
		for (@Pc(11) Class12_Sub4 local11 = (Class12_Sub4) Static56.aClass220_1.method4661(); local11 != null; local11 = (Class12_Sub4) Static56.aClass220_1.method4660()) {
			if (local11.aBoolean382) {
				local11.method4140(arg0);
			}
		}
	}

	@OriginalMember(owner = "client!mk", name = "b", descriptor = "(I)V")
	public static void method7661() {
		Static15.aClass162_1.ra(((float) Static257.aClass2_Sub35_Sub1_1.anInt7508 * 0.1F + 0.7F) * 1.1523438F);
		Static15.aClass162_1.VA(Static268.anInt4385, 0.69921875F, 1.2F, -200.0F, -240.0F, (float) -200);
		Static15.aClass162_1.pa(Static179.anInt2669, -1, 0);
		Static15.aClass162_1.method6812(Static198.aClass17_2);
	}
}
