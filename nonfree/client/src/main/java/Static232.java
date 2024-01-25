import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static232 {

	@OriginalMember(owner = "client!no", name = "m", descriptor = "I")
	public static int anInt4636 = 0;

	@OriginalMember(owner = "client!no", name = "n", descriptor = "I")
	public static int anInt4637 = 2;

	@OriginalMember(owner = "client!no", name = "q", descriptor = "I")
	public static int anInt4640 = 0;

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(IBIIZ)V")
	public static void method4182(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3) {
		if (Static300.method4909(arg2)) {
			Static94.method1603(arg0, -1, arg1, arg3, Static272.aClass3ArrayArray1[arg2]);
		}
	}

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(ZLclient!so;)Z")
	public static boolean method4183(@OriginalArg(1) Class212 arg0) {
		if (arg0 == null) {
			return false;
		} else if (!arg0.aBoolean439) {
			return false;
		} else if (!arg0.method5244(Static20.anInterface4_2)) {
			return false;
		} else if (Static120.aClass243_10.method5967((long) arg0.anInt5989) == null) {
			return Static158.aClass243_13.method5967((long) arg0.anInt5985) == null;
		} else {
			return false;
		}
	}
}
