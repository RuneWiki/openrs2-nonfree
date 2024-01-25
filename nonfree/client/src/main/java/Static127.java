import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static127 {

	@OriginalMember(owner = "client!ia", name = "b", descriptor = "Lclient!dp;")
	public static Class53 aClass53_105;

	@OriginalMember(owner = "client!ia", name = "d", descriptor = "I")
	public static int anInt4327;

	@OriginalMember(owner = "client!ia", name = "f", descriptor = "Ljava/lang/String;")
	public static String aString182 = "You can't add yourself to your own ignore list.";

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(BI)V")
	public static void method4129(@OriginalArg(1) int arg0) {
		@Pc(13) Class6_Sub2_Sub8 local13 = Static239.method5786(10, arg0);
		local13.method2645();
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lclient!wk;")
	public static RuntimeException_Sub1 method4132(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		@Pc(12) RuntimeException_Sub1 local12;
		if (arg0 instanceof RuntimeException_Sub1) {
			local12 = (RuntimeException_Sub1) arg0;
			local12.aString302 = local12.aString302 + ' ' + arg1;
		} else {
			local12 = new RuntimeException_Sub1(arg0, arg1);
		}
		return local12;
	}

	@OriginalMember(owner = "client!ia", name = "c", descriptor = "(I)V")
	public static void method4135() {
		@Pc(10) Class70 local10 = Static80.aClass70_97;
		synchronized (Static80.aClass70_97) {
			Static80.aClass70_97.method1399();
		}
	}
}
