import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static16 {

	@OriginalMember(owner = "client!bf", name = "v", descriptor = "I")
	public static int anInt462;

	@OriginalMember(owner = "client!bf", name = "F", descriptor = "I")
	public static int anInt467;

	@OriginalMember(owner = "client!bf", name = "I", descriptor = "Lclient!ue;")
	public static Class76_Sub1 aClass76_Sub1_1;

	@OriginalMember(owner = "client!bf", name = "w", descriptor = "[B")
	public static byte[] aByteArray5 = new byte[] { 95, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57 };

	@OriginalMember(owner = "client!bf", name = "x", descriptor = "J")
	public static long aLong23 = 0L;

	@OriginalMember(owner = "client!bf", name = "A", descriptor = "Lclient!rf;")
	private static Class70 aClass70_163 = Static49.method1293("You can(Wt add yourself to your own friend list)3");

	@OriginalMember(owner = "client!bf", name = "B", descriptor = "I")
	public static int anInt465 = 0;

	@OriginalMember(owner = "client!bf", name = "E", descriptor = "Lclient!fc;")
	public static Class25 aClass25_2 = new Class25(260);

	@OriginalMember(owner = "client!bf", name = "G", descriptor = "Lclient!rf;")
	public static Class70 aClass70_164 = aClass70_163;

	@OriginalMember(owner = "client!bf", name = "H", descriptor = "Lclient!rf;")
	public static Class70 aClass70_165 = Static49.method1293("Fehler beim Laden Ihres Spielcharakters)3");

	@OriginalMember(owner = "client!bf", name = "K", descriptor = "I")
	public static int anInt469 = 0;

	@OriginalMember(owner = "client!bf", name = "L", descriptor = "Lclient!rf;")
	public static Class70 aClass70_166 = Static49.method1293("blinken2:");

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(Lclient!rf;I)V")
	public static void method387(@OriginalArg(0) Class70 arg0) {
		if (Static157.aClass1_Sub25Array3 == null) {
			return;
		}
		@Pc(10) int local10 = 0;
		@Pc(16) long local16 = arg0.method2925();
		if (local16 == (long) 0) {
			return;
		}
		while (Static157.aClass1_Sub25Array3.length > local10 && local16 != Static157.aClass1_Sub25Array3[local10].aLong147) {
			local10++;
		}
		if (Static157.aClass1_Sub25Array3.length > local10 && Static157.aClass1_Sub25Array3[local10] != null) {
			Static131.aClass1_Sub9_Sub1_3.method1283(155);
			Static131.aClass1_Sub9_Sub1_3.method1263(Static157.aClass1_Sub25Array3[local10].aLong147);
		}
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(Z)V")
	public static void method388() {
		aClass25_2 = null;
		aByteArray5 = null;
		aClass70_165 = null;
		aClass76_Sub1_1 = null;
		aClass70_166 = null;
		aClass70_164 = null;
		aClass70_163 = null;
	}
}
