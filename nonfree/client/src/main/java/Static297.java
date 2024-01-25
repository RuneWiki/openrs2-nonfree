import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static297 {

	@OriginalMember(owner = "client!ju", name = "t", descriptor = "I")
	public static int anInt5412;

	@OriginalMember(owner = "client!ju", name = "u", descriptor = "I")
	public static int anInt5413;

	@OriginalMember(owner = "client!ju", name = "l", descriptor = "[I")
	public static final int[] anIntArray274 = new int[] { 28, 35, 40, 44 };

	@OriginalMember(owner = "client!ju", name = "o", descriptor = "Lclient!in;")
	public static final Class169 aClass169_145 = new Class169(65, -1);

	@OriginalMember(owner = "client!ju", name = "a", descriptor = "(Ljava/lang/String;Z)I")
	public static int method4908(@OriginalArg(0) String arg0) {
		return arg0.length() + 1;
	}
}
