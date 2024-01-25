import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static31 {

	@OriginalMember(owner = "client!bi", name = "cb", descriptor = "I")
	public static int anInt477;

	@OriginalMember(owner = "client!bi", name = "db", descriptor = "Lclient!pv;")
	public static Class204 aClass204_1;

	@OriginalMember(owner = "client!bi", name = "eb", descriptor = "I")
	public static int anInt478;

	@OriginalMember(owner = "client!bi", name = "w", descriptor = "I")
	public static int anInt456 = -1;

	@OriginalMember(owner = "client!bi", name = "Z", descriptor = "Lclient!kn;")
	public static final Class142 aClass142_7 = new Class142("glow2:", "leuchten2:", "brillant2:", "brilho2:");

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(ILjava/lang/String;B)I")
	public static int method447(@OriginalArg(1) String arg0) {
		return Static45.method604(16, arg0);
	}

	@OriginalMember(owner = "client!bi", name = "f", descriptor = "(B)V")
	public static void method451() {
		if (Static397.aBoolean557) {
			return;
		}
		if (Static126.aClass19_Sub1_1.aBoolean382) {
			Static99.aFloat9 = (int) Static99.aFloat9 - 65 & 0xFFFFFF80;
		} else {
			Static392.aFloat81 += (-Static392.aFloat81 - 24.0F) / 2.0F;
		}
		Static413.aBoolean582 = true;
		Static397.aBoolean557 = true;
	}
}
