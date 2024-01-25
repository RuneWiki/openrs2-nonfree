import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static170 {

	@OriginalMember(owner = "client!ks", name = "G", descriptor = "Lclient!fa;")
	public static Class1_Sub6_Sub4 aClass1_Sub6_Sub4_2;

	@OriginalMember(owner = "client!ks", name = "L", descriptor = "Ljava/lang/String;")
	public static String aString147 = "yellow:";

	@OriginalMember(owner = "client!ks", name = "b", descriptor = "(III)B")
	public static byte method3407(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 9) {
			return (byte) ((arg0 & 0x1) == 0 ? 1 : 2);
		} else {
			return 0;
		}
	}
}
