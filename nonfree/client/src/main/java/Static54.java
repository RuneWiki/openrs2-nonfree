import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static54 {

	@OriginalMember(owner = "client!caa", name = "t", descriptor = "I")
	public static int anInt1312;

	@OriginalMember(owner = "client!caa", name = "v", descriptor = "Lclient!sb;")
	public static final Class298 aClass298_27 = new Class298(51, 4);

	@OriginalMember(owner = "client!caa", name = "x", descriptor = "Lclient!sh;")
	public static final Class307 aClass307_2 = new Class307();

	@OriginalMember(owner = "client!caa", name = "a", descriptor = "(ILclient!lk;)V")
	public static void method1061(@OriginalArg(1) Class203 arg0) {
		if (arg0.anInt5473 == 5 && arg0.anInt5507 != -1) {
			Static441.method6204(arg0, Static4.aClass43_1);
		}
	}

	@OriginalMember(owner = "client!caa", name = "a", descriptor = "(II)I")
	public static int method1063(@OriginalArg(1) int arg0) {
		return arg0 >>> 8;
	}
}
