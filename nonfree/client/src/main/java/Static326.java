import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static326 {

	@OriginalMember(owner = "client!lba", name = "l", descriptor = "[Lclient!qda;")
	public static Class59[] aClass59Array13;

	@OriginalMember(owner = "client!lba", name = "r", descriptor = "I")
	public static int anInt5967;

	@OriginalMember(owner = "client!lba", name = "n", descriptor = "J")
	public static long aLong167 = 0L;

	@OriginalMember(owner = "client!lba", name = "p", descriptor = "I")
	public static int anInt5965 = 0;

	@OriginalMember(owner = "client!lba", name = "q", descriptor = "I")
	public static int anInt5966 = 16777215;

	@OriginalMember(owner = "client!lba", name = "a", descriptor = "(BLclient!wq;)Ljava/lang/String;")
	public static String method5086(@OriginalArg(1) Class394 arg0) {
		if (Static81.method1268(arg0).method6629() == 0) {
			return null;
		} else if (arg0.aString115 == null || arg0.aString115.trim().length() == 0) {
			return Static292.aBoolean301 ? "Hidden-use" : null;
		} else {
			return arg0.aString115;
		}
	}

	@OriginalMember(owner = "client!lba", name = "a", descriptor = "(III)I")
	public static int method5087(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		arg0 = (arg1 & 0x7F) * arg0 >> 7;
		if (arg0 < 2) {
			arg0 = 2;
		} else if (arg0 > 126) {
			arg0 = 126;
		}
		return arg0 + (arg1 & 0xFF80);
	}
}
