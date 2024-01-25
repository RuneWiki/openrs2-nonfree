import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static463 {

	@OriginalMember(owner = "client!rw", name = "b", descriptor = "Lclient!pu;")
	public static Class270 aClass270_98;

	@OriginalMember(owner = "client!rw", name = "e", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray33;

	@OriginalMember(owner = "client!rw", name = "a", descriptor = "(III)I")
	public static int method6384(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		arg1 = (arg0 & 0x7F) * arg1 >> 7;
		if (arg1 < 2) {
			arg1 = 2;
		} else if (arg1 > 126) {
			arg1 = 126;
		}
		return (arg0 & 0xFF80) + arg1;
	}
}
