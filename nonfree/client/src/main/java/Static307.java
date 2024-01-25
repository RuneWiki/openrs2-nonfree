import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static307 {

	@OriginalMember(owner = "client!ms", name = "o", descriptor = "Lclient!kr;")
	public static Class171 aClass171_88;

	@OriginalMember(owner = "client!ms", name = "u", descriptor = "I")
	public static int anInt5684;

	@OriginalMember(owner = "client!ms", name = "a", descriptor = "(IZI)Ljava/lang/String;")
	public static String method4852(@OriginalArg(2) int arg0) {
		return arg0 < 0 ? Integer.toString(arg0) : Static220.method3800(arg0);
	}
}
