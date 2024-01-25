import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static276 {

	@OriginalMember(owner = "client!nu", name = "E", descriptor = "Lclient!qa;")
	public static Class109 aClass109_10;

	@OriginalMember(owner = "client!nu", name = "J", descriptor = "[[B")
	public static byte[][] aByteArrayArray96;

	@OriginalMember(owner = "client!nu", name = "P", descriptor = "Lclient!vh;")
	public static Class250 aClass250_59;

	@OriginalMember(owner = "client!nu", name = "B", descriptor = "Lclient!uf;")
	public static final Class237 aClass237_83 = new Class237(42, -1);

	@OriginalMember(owner = "client!nu", name = "I", descriptor = "I")
	public static int anInt4920 = 0;

	@OriginalMember(owner = "client!nu", name = "O", descriptor = "[[[I")
	public static final int[][][] anIntArrayArrayArray14 = new int[2][][];

	@OriginalMember(owner = "client!nu", name = "a", descriptor = "(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;")
	public static String method4001(@OriginalArg(1) String arg0, @OriginalArg(2) String arg1, @OriginalArg(3) String arg2) {
		for (@Pc(9) int local9 = arg1.indexOf(arg0); local9 != -1; local9 = arg1.indexOf(arg0, local9 + arg2.length())) {
			arg1 = arg1.substring(0, local9) + arg2 + arg1.substring(arg0.length() + local9);
		}
		return arg1;
	}
}
