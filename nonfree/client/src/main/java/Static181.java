import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static181 {

	@OriginalMember(owner = "client!wh", name = "d", descriptor = "Lclient!fd;")
	public static Class7_Sub1 aClass7_Sub1_19;

	@OriginalMember(owner = "client!wh", name = "g", descriptor = "I")
	public static int anInt4285 = 0;

	@OriginalMember(owner = "client!wh", name = "l", descriptor = "I")
	public static int anInt4289 = 0;

	@OriginalMember(owner = "client!wh", name = "n", descriptor = "Lclient!pa;")
	public static Class63 aClass63_32 = new Class63(200);

	@OriginalMember(owner = "client!wh", name = "o", descriptor = "Lclient!eh;")
	private static Class28 aClass28_1500 = Static170.method3101("Connecting to update server");

	@OriginalMember(owner = "client!wh", name = "q", descriptor = "Lclient!eh;")
	private static Class28 aClass28_1502 = Static170.method3101("Error connecting to server)3");

	@OriginalMember(owner = "client!wh", name = "p", descriptor = "Lclient!eh;")
	public static Class28 aClass28_1501 = aClass28_1502;

	@OriginalMember(owner = "client!wh", name = "r", descriptor = "Lclient!eh;")
	public static Class28 aClass28_1503 = aClass28_1500;

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(I)V")
	public static void method3212() {
		aClass7_Sub1_19 = null;
		aClass28_1501 = null;
		aClass28_1503 = null;
		aClass63_32 = null;
		aClass28_1502 = null;
		aClass28_1500 = null;
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(II)Lclient!eh;")
	public static Class28 method3213(@OriginalArg(0) int arg0) {
		return Static4.method96(new Class28[] { Static146.method2793(arg0 >> 24 & 0xFF), Static144.aClass28_536, Static146.method2793(arg0 >> 16 & 0xFF), Static144.aClass28_536, Static146.method2793(arg0 >> 8 & 0xFF), Static144.aClass28_536, Static146.method2793(arg0 & 0xFF) });
	}
}
