import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static53 {

	@OriginalMember(owner = "client!bs", name = "D", descriptor = "I")
	public static int anInt1109 = -1;

	@OriginalMember(owner = "client!bs", name = "a", descriptor = "(IBI)Z")
	public static boolean method1175(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x800) != 0;
	}

	@OriginalMember(owner = "client!bs", name = "a", descriptor = "(Lclient!gea;I)Ljava/lang/String;")
	public static String method1179(@OriginalArg(0) Class3_Sub11_Sub8 arg0) {
		return arg0.aString31 + " <col=ffffff>>";
	}
}
