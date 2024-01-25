import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static342 {

	@OriginalMember(owner = "client!nb", name = "h", descriptor = "Lclient!ft;")
	public static Class109 aClass109_10;

	@OriginalMember(owner = "client!nb", name = "p", descriptor = "[I")
	public static int[] anIntArray467;

	@OriginalMember(owner = "client!nb", name = "q", descriptor = "[[I")
	public static int[][] anIntArrayArray132;

	@OriginalMember(owner = "client!nb", name = "r", descriptor = "I")
	public static int anInt5722;

	@OriginalMember(owner = "client!nb", name = "j", descriptor = "[I")
	public static final int[] anIntArray465 = new int[5];

	@OriginalMember(owner = "client!nb", name = "l", descriptor = "Lclient!dg;")
	public static final Class70 aClass70_60 = new Class70(33, 7);

	@OriginalMember(owner = "client!nb", name = "s", descriptor = "Z")
	public static boolean aBoolean452 = true;

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(I)V")
	public static void method4693() {
		Static104.aClass22Array5 = null;
		Static274.aClass22_2 = null;
		Static242.aClass22_23 = null;
		Static259.aClass22_24 = null;
		Static264.aClass22_26 = null;
		Static260.aClass22_25 = null;
		Static143.aClass22_14 = null;
		Static199.aClass22_19 = null;
		Static220.aClass22_21 = null;
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(Ljava/lang/String;I)Z")
	public static boolean method4694(@OriginalArg(0) String arg0) {
		return Static187.method6838(hq.class, arg0);
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(BIZLclient!vb;ZILclient!vb;)I")
	public static int method4696(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) Class317_Sub1 arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class317_Sub1 arg5) {
		@Pc(10) int local10 = Static69.method1215(arg1, arg4, arg2, arg5);
		if (local10 != 0) {
			return arg1 ? -local10 : local10;
		} else if (arg0 == -1) {
			return 0;
		} else {
			@Pc(40) int local40 = Static69.method1215(arg3, arg0, arg2, arg5);
			return arg3 ? -local40 : local40;
		}
	}
}
