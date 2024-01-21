import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static35 {

	@OriginalMember(owner = "client!fc", name = "d", descriptor = "Lclient!ra;")
	public static Class6_Sub3_Sub3_Sub3 aClass6_Sub3_Sub3_Sub3_9;

	@OriginalMember(owner = "client!fc", name = "e", descriptor = "I")
	public static int anInt1172;

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "Lclient!rd;")
	public static Class63 aClass63_623 = Static80.method1463("::qa_op_test");

	@OriginalMember(owner = "client!fc", name = "b", descriptor = "Lclient!rd;")
	public static Class63 aClass63_624 = Static80.method1463("Gegenstand konnte nicht gefunden werden)1 verk-Urzen Sie den Suchbegriff)3");

	@OriginalMember(owner = "client!fc", name = "c", descriptor = "Lclient!rd;")
	public static Class63 aClass63_625 = Static80.method1463("Ladevorgang )2 bitte warten Sie)3");

	@OriginalMember(owner = "client!fc", name = "k", descriptor = "Lclient!rd;")
	private static Class63 aClass63_628 = Static80.method1463("Trade)4compete");

	@OriginalMember(owner = "client!fc", name = "f", descriptor = "Lclient!rd;")
	public static Class63 aClass63_626 = aClass63_628;

	@OriginalMember(owner = "client!fc", name = "g", descriptor = "I")
	public static int anInt1173 = 0;

	@OriginalMember(owner = "client!fc", name = "h", descriptor = "Lclient!rd;")
	public static Class63 aClass63_627 = Static80.method1463("@cr2@");

	@OriginalMember(owner = "client!fc", name = "i", descriptor = "Z")
	public static boolean aBoolean58 = false;

	@OriginalMember(owner = "client!fc", name = "j", descriptor = "I")
	public static int anInt1174 = 0;

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(ILclient!ge;Lclient!ge;)I")
	public static int method847(@OriginalArg(1) Class7 arg0, @OriginalArg(2) Class7 arg1) {
		@Pc(5) int local5 = 0;
		if (arg0.method99(Static90.aClass63_1332, Static49.aClass63_802)) {
			local5++;
		}
		if (arg1.method99(Static44.aClass63_739, Static49.aClass63_802)) {
			local5++;
		}
		if (arg1.method99(Static76.aClass63_1118, Static49.aClass63_802)) {
			local5++;
		}
		if (arg1.method99(Static124.aClass63_1783, Static49.aClass63_802)) {
			local5++;
		}
		if (arg1.method99(Static113.aClass63_400, Static49.aClass63_802)) {
			local5++;
		}
		if (arg1.method99(Static103.aClass63_1764, Static49.aClass63_802)) {
			local5++;
		}
		return local5;
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(I)V")
	public static void method848() {
		aClass63_627 = null;
		aClass63_626 = null;
		aClass63_624 = null;
		aClass63_625 = null;
		aClass63_623 = null;
		aClass63_628 = null;
		aClass6_Sub3_Sub3_Sub3_9 = null;
	}
}
