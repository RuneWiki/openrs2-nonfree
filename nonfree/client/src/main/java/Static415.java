import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static415 {

	@OriginalMember(owner = "client!oc", name = "M", descriptor = "I")
	public static int anInt7536;

	@OriginalMember(owner = "client!oc", name = "O", descriptor = "I")
	public static int anInt7538 = -1;

	@OriginalMember(owner = "client!oc", name = "c", descriptor = "(II)Ljava/lang/String;")
	public static String method6203(@OriginalArg(1) int arg0) {
		return (arg0 >> 24 & 0xFF) + "." + (arg0 >> 16 & 0xFF) + "." + (arg0 >> 8 & 0xFF) + "." + (arg0 & 0xFF);
	}
}
