import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static286 {

	@OriginalMember(owner = "client!lc", name = "b", descriptor = "I")
	public static int anInt5275;

	@OriginalMember(owner = "client!lc", name = "c", descriptor = "Ljava/lang/String;")
	public static String aString42 = "";

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(Lclient!nd;B)I")
	public static int method4358(@OriginalArg(0) Class214 arg0) {
		if (Static140.aClass214_2 == arg0) {
			return 7681;
		} else if (Static547.aClass214_5 == arg0) {
			return 8448;
		} else if (Static458.aClass214_3 == arg0) {
			return 34165;
		} else if (Static74.aClass214_1 == arg0) {
			return 260;
		} else if (arg0 == Static472.aClass214_4) {
			return 34023;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(B)V")
	public static void method4360() {
		Static266.aBoolean351 = false;
		Static368.method5431(Static415.anInt7406, Static420.anInt8173, Static237.anInt4304, Static308.anInt5670);
	}
}
