import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static457 {

	@OriginalMember(owner = "client!wt", name = "b", descriptor = "Lclient!tf;")
	public static Class236 aClass236_8;

	@OriginalMember(owner = "client!wt", name = "e", descriptor = "Ljava/lang/String;")
	public static String aString73;

	@OriginalMember(owner = "client!wt", name = "g", descriptor = "I")
	public static int anInt7524 = 0;

	@OriginalMember(owner = "client!wt", name = "a", descriptor = "(III)I")
	public static int method5793(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		arg1 = (arg0 & 0x7F) * arg1 >> 7;
		if (arg1 < 2) {
			arg1 = 2;
		} else if (arg1 > 126) {
			arg1 = 126;
		}
		return (arg0 & 0xFF80) + arg1;
	}
}
