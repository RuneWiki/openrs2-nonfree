import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static338 {

	@OriginalMember(owner = "client!vq", name = "b", descriptor = "I")
	public static int anInt6576 = 0;

	@OriginalMember(owner = "client!vq", name = "e", descriptor = "J")
	public static long aLong206 = 0L;

	@OriginalMember(owner = "client!vq", name = "n", descriptor = "Ljava/lang/String;")
	public static final String aString249 = "purple:";

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(II)Z")
	public static boolean method5554(@OriginalArg(1) int arg0) {
		return (arg0 & -arg0) == arg0;
	}
}
