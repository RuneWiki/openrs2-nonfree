import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static312 {

	@OriginalMember(owner = "client!pq", name = "c", descriptor = "Lclient!fs;")
	public static Class76 aClass76_66;

	@OriginalMember(owner = "client!pq", name = "d", descriptor = "Lclient!pn;")
	public static final Class186 aClass186_13 = new Class186("", 15);

	@OriginalMember(owner = "client!pq", name = "e", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray25 = new String[100];

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(III)B")
	public static byte method4172(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 == 9) {
			return (byte) ((arg1 & 0x1) == 0 ? 1 : 2);
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!pq", name = "b", descriptor = "(III)Z")
	public static boolean method4173(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x60000) != 0 | Static92.method1613(arg1, arg0) || Static13.method137(arg0, arg1) || Static299.method4090(arg1, arg0);
	}
}
