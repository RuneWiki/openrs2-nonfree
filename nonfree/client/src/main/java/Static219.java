import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static219 {

	@OriginalMember(owner = "client!la", name = "c", descriptor = "Lclient!pn;")
	public static final Class186 aClass186_16 = new Class186("", 16);

	@OriginalMember(owner = "client!la", name = "k", descriptor = "I")
	public static int anInt6458 = 0;

	@OriginalMember(owner = "client!la", name = "n", descriptor = "Z")
	public static boolean aBoolean588 = false;

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(II)I")
	public static int method5061(@OriginalArg(1) int arg0) {
		return arg0 == 16711935 ? -1 : Static266.method3825(arg0);
	}
}
