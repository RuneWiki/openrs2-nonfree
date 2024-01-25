import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static108 {

	@OriginalMember(owner = "client!ea", name = "h", descriptor = "Lclient!ea;")
	public static final Class79 aClass79_1 = new Class79(0, 3, Static349.aClass239_16);

	@OriginalMember(owner = "client!ea", name = "j", descriptor = "Lclient!ea;")
	public static final Class79 aClass79_2 = new Class79(1, 3, Static349.aClass239_16);

	@OriginalMember(owner = "client!ea", name = "k", descriptor = "Lclient!ea;")
	public static final Class79 aClass79_3 = new Class79(2, 4, Static349.aClass239_12);

	@OriginalMember(owner = "client!ea", name = "l", descriptor = "Lclient!ea;")
	public static final Class79 aClass79_4 = new Class79(3, 1, Static349.aClass239_16);

	@OriginalMember(owner = "client!ea", name = "m", descriptor = "Lclient!ea;")
	public static final Class79 aClass79_5 = new Class79(4, 2, Static349.aClass239_16);

	@OriginalMember(owner = "client!ea", name = "n", descriptor = "Lclient!ea;")
	public static final Class79 aClass79_6 = new Class79(5, 3, Static349.aClass239_16);

	@OriginalMember(owner = "client!ea", name = "o", descriptor = "Lclient!ea;")
	private static final Class79 aClass79_7 = new Class79(6, 4, Static349.aClass239_16);

	@OriginalMember(owner = "client!ea", name = "p", descriptor = "I")
	public static final int anInt2607 = Static415.method5946(16);

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(Ljava/lang/String;BZLjava/lang/String;)V")
	public static void method2316(@OriginalArg(0) String arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) String arg2) {
		Static73.aBoolean137 = arg1;
		Static39.aString11 = arg0;
		Static321.aString71 = arg2;
		if (!Static73.aBoolean137 && Static140.anInt3152 != 3 && (Static39.aString11.equals("") || Static321.aString71.equals(""))) {
			Static112.method2333(3);
			return;
		}
		Static2.aBoolean2 = false;
		if (Static140.anInt3152 != 1) {
			Static158.anInt3479 = 0;
			Static497.anInt8608 = -1;
		}
		Static112.method2333(-3);
		Static101.anInt2479 = 0;
		Static81.anInt9842 = 1;
		Static574.anInt6915 = 0;
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(B)[Lclient!ea;")
	public static Class79[] method2317() {
		return new Class79[] { aClass79_1, aClass79_2, aClass79_3, aClass79_4, aClass79_5, aClass79_6, aClass79_7 };
	}
}
