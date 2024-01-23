import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static50 {

	@OriginalMember(owner = "client!dl", name = "R", descriptor = "I")
	public static int anInt1165;

	@OriginalMember(owner = "client!dl", name = "Y", descriptor = "Lclient!mn;")
	public static Class115 aClass115_6 = null;

	@OriginalMember(owner = "client!dl", name = "ab", descriptor = "Ljava/lang/String;")
	public static String aString57 = "Discard";

	@OriginalMember(owner = "client!dl", name = "bb", descriptor = "Lclient!ii;")
	public static Class79 aClass79_4 = new Class79(32);

	@OriginalMember(owner = "client!dl", name = "cb", descriptor = "S")
	public static short aShort12 = 256;

	@OriginalMember(owner = "client!dl", name = "e", descriptor = "(B)V")
	public static void method1010() {
		if (Static19.aClass162_1 != null) {
			@Pc(11) Class162 local11 = Static19.aClass162_1;
			synchronized (Static19.aClass162_1) {
				Static19.aClass162_1 = null;
			}
		}
	}
}
