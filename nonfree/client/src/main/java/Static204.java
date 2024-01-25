import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static204 {

	@OriginalMember(owner = "client!kf", name = "w", descriptor = "Ljava/lang/String;")
	public static String aString23;

	@OriginalMember(owner = "client!kf", name = "C", descriptor = "Z")
	public static boolean aBoolean345;

	@OriginalMember(owner = "client!kf", name = "c", descriptor = "Z")
	public static boolean aBoolean340 = false;

	@OriginalMember(owner = "client!kf", name = "D", descriptor = "Lclient!iv;")
	public static final Class119 aClass119_87 = new Class119(70, -1);

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(II)I")
	public static int method3186(@OriginalArg(0) int arg0) {
		return arg0 >>> 10;
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(III)I")
	public static int method3187(@OriginalArg(1) int arg0) {
		if (arg0 == -2) {
			return 12345678;
		} else if (arg0 == -1) {
			return 96;
		} else {
			@Pc(41) int local41 = (arg0 & 0x7F) * 96 >> 7;
			if (local41 < 2) {
				local41 = 2;
			} else if (local41 > 126) {
				local41 = 126;
			}
			return (arg0 & 0xFF80) + local41;
		}
	}
}
