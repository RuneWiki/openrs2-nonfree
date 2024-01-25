import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static689 {

	@OriginalMember(owner = "client!vl", name = "n", descriptor = "Lclient!sla;")
	public static final Class344 aClass344_14 = new Class344(2, 7);

	@OriginalMember(owner = "client!vl", name = "j", descriptor = "[I")
	public static final int[] anIntArray768 = new int[2];

	@OriginalMember(owner = "client!vl", name = "k", descriptor = "I")
	public static final int anInt10732 = 1409;

	@OriginalMember(owner = "client!vl", name = "q", descriptor = "Ljava/lang/String;")
	public static String aString129 = "";

	@OriginalMember(owner = "client!vl", name = "l", descriptor = "Z")
	public static volatile boolean aBoolean728 = false;

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(IIIB)I")
	public static int method9122(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg1 > arg2) {
			return arg1;
		} else if (arg2 <= arg0) {
			return arg2;
		} else {
			return arg0;
		}
	}
}
