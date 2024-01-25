import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static331 {

	@OriginalMember(owner = "client!ms", name = "p", descriptor = "Lclient!lh;")
	public static final Class208 aClass208_76 = new Class208(38, -1);

	@OriginalMember(owner = "client!ms", name = "q", descriptor = "F")
	public static float aFloat172 = 0.0F;

	@OriginalMember(owner = "client!ms", name = "r", descriptor = "I")
	public static int anInt6047 = 0;

	@OriginalMember(owner = "client!ms", name = "t", descriptor = "Lclient!lh;")
	public static final Class208 aClass208_77 = new Class208(83, 3);

	@OriginalMember(owner = "client!ms", name = "u", descriptor = "I")
	public static int anInt6049 = 0;

	@OriginalMember(owner = "client!ms", name = "a", descriptor = "(ZLjava/lang/String;Ljava/lang/String;II)V")
	public static void method4897(@OriginalArg(0) boolean arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3) {
		Static411.method5861(arg0, arg3, arg2, arg1, true, -1);
	}

	@OriginalMember(owner = "client!ms", name = "a", descriptor = "(BLjava/lang/String;)I")
	public static int method4899(@OriginalArg(1) String arg0) {
		return arg0.length() + 1;
	}
}
