import java.awt.FontMetrics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static112 {

	@OriginalMember(owner = "client!tb", name = "M", descriptor = "Lclient!ue;")
	public static Class1_Sub2_Sub2_Sub4 aClass1_Sub2_Sub2_Sub4_18;

	@OriginalMember(owner = "client!tb", name = "cb", descriptor = "Ljava/awt/FontMetrics;")
	public static FontMetrics aFontMetrics1;

	@OriginalMember(owner = "client!tb", name = "hb", descriptor = "Lclient!oc;")
	public static Class56 aClass56_82;

	@OriginalMember(owner = "client!tb", name = "S", descriptor = "Lclient!fc;")
	private static Class25 aClass25_1268 = Static78.method1313("go back to the main RuneScape webpage");

	@OriginalMember(owner = "client!tb", name = "jb", descriptor = "Lclient!fc;")
	private static Class25 aClass25_1276 = Static78.method1313("Friends");

	@OriginalMember(owner = "client!tb", name = "T", descriptor = "Lclient!fc;")
	public static Class25 aClass25_1269 = aClass25_1276;

	@OriginalMember(owner = "client!tb", name = "U", descriptor = "Lclient!fc;")
	public static Class25 aClass25_1270 = Static78.method1313(":0");

	@OriginalMember(owner = "client!tb", name = "eb", descriptor = "Lclient!fc;")
	private static Class25 aClass25_1274 = Static78.method1313("wave2:");

	@OriginalMember(owner = "client!tb", name = "W", descriptor = "Lclient!fc;")
	public static Class25 aClass25_1271 = aClass25_1274;

	@OriginalMember(owner = "client!tb", name = "Z", descriptor = "Lclient!fc;")
	public static Class25 aClass25_1272 = Static78.method1313("Lade Wordpack )2 ");

	@OriginalMember(owner = "client!tb", name = "bb", descriptor = "Lclient!fc;")
	public static Class25 aClass25_1273 = aClass25_1274;

	@OriginalMember(owner = "client!tb", name = "fb", descriptor = "Lclient!fc;")
	public static Class25 aClass25_1275 = aClass25_1268;

	@OriginalMember(owner = "client!tb", name = "lb", descriptor = "Lclient!fc;")
	public static Class25 aClass25_1277 = Static78.method1313("http:)4)4");

	@OriginalMember(owner = "client!tb", name = "b", descriptor = "(Z)V")
	public static void method1804() {
		aClass56_82 = null;
		aClass25_1273 = null;
		aClass25_1272 = null;
		aClass25_1268 = null;
		aClass1_Sub2_Sub2_Sub4_18 = null;
		aClass25_1270 = null;
		aClass25_1275 = null;
		aClass25_1271 = null;
		aClass25_1277 = null;
		aClass25_1274 = null;
		aClass25_1276 = null;
		aClass25_1269 = null;
		aFontMetrics1 = null;
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(Lclient!ta;I)V")
	public static void method1807(@OriginalArg(0) Class1_Sub16 arg0) {
		@Pc(5) int local5 = 0;
		if (arg0.anInt2581 == 0) {
			local5 = Static118.aClass4_1.method62(arg0.anInt2589, arg0.anInt2584, arg0.anInt2579);
		}
		@Pc(22) int local22 = -1;
		if (arg0.anInt2581 == 1) {
			local5 = Static118.aClass4_1.method64(arg0.anInt2589, arg0.anInt2584, arg0.anInt2579);
		}
		if (arg0.anInt2581 == 2) {
			local5 = Static118.aClass4_1.method60(arg0.anInt2589, arg0.anInt2584, arg0.anInt2579);
		}
		@Pc(54) int local54 = 0;
		if (arg0.anInt2581 == 3) {
			local5 = Static118.aClass4_1.method90(arg0.anInt2589, arg0.anInt2584, arg0.anInt2579);
		}
		@Pc(69) int local69 = 0;
		if (local5 != 0) {
			@Pc(84) int local84 = Static118.aClass4_1.method57(arg0.anInt2589, arg0.anInt2584, arg0.anInt2579, local5);
			local54 = local84 & 0x1F;
			local22 = local5 >> 14 & 0x7FFF;
			local69 = local84 >> 6 & 0x3;
		}
		arg0.anInt2595 = local54;
		arg0.anInt2590 = local22;
		arg0.anInt2583 = local69;
	}
}
