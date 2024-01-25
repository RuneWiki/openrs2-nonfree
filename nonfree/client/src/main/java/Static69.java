import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static69 {

	@OriginalMember(owner = "client!du", name = "h", descriptor = "I")
	public static int anInt1310;

	@OriginalMember(owner = "client!du", name = "q", descriptor = "[I")
	public static int[] anIntArray170;

	@OriginalMember(owner = "client!du", name = "b", descriptor = "Lclient!uo;")
	public static Applet_Sub1 anApplet_Sub1_1 = null;

	@OriginalMember(owner = "client!du", name = "d", descriptor = "Lclient!mq;")
	public static final Class154 aClass154_5 = new Class154(8);

	@OriginalMember(owner = "client!du", name = "k", descriptor = "I")
	public static int anInt1312 = 0;

	@OriginalMember(owner = "client!du", name = "p", descriptor = "Lclient!cs;")
	public static final Class41 aClass41_30 = new Class41(38, 7);

	@OriginalMember(owner = "client!du", name = "r", descriptor = "I")
	public static int anInt1316 = -50;

	@OriginalMember(owner = "client!du", name = "a", descriptor = "(IB)V")
	public static void method1260(@OriginalArg(0) int arg0) {
		if (Static41.anIntArray129 == null || Static41.anIntArray129.length < arg0) {
			Static41.anIntArray129 = new int[arg0];
		}
	}
}
