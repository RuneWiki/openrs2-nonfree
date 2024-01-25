import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static511 {

	@OriginalMember(owner = "client!tn", name = "f", descriptor = "Lclient!ui;")
	public static Class335 aClass335_2;

	@OriginalMember(owner = "client!tn", name = "c", descriptor = "I")
	public static int anInt940 = 1;

	@OriginalMember(owner = "client!tn", name = "d", descriptor = "Lclient!rda;")
	public static final Class286 aClass286_2 = new Class286();

	@OriginalMember(owner = "client!tn", name = "g", descriptor = "Lclient!db;")
	public static final Class64 aClass64_56 = new Class64(64, 6);

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(ZII)B")
	public static byte method836(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 == 9) {
			return (byte) ((arg1 & 0x1) == 0 ? 1 : 2);
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(ILclient!gba;)Ljava/lang/String;")
	public static String method843(@OriginalArg(1) Class115 arg0) {
		if (Static69.method1233(arg0).method4973() == 0) {
			return null;
		} else if (arg0.aString34 == null || arg0.aString34.trim().length() == 0) {
			return Static126.aBoolean235 ? "Hidden-use" : null;
		} else {
			return arg0.aString34;
		}
	}
}
