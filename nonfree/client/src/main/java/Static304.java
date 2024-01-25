import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static304 {

	@OriginalMember(owner = "client!kfa", name = "K", descriptor = "I")
	public static int anInt5557;

	@OriginalMember(owner = "client!kfa", name = "b", descriptor = "(IBI)Z")
	public static boolean method4692(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x22) != 0;
	}

	@OriginalMember(owner = "client!kfa", name = "a", descriptor = "(Ljava/lang/String;II)V")
	public static void method4693(@OriginalArg(0) String arg0) {
		Static310.method4784(4, arg0, "", "", 0, "");
	}
}
