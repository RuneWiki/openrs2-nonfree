import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static485 {

	@OriginalMember(owner = "client!so", name = "c", descriptor = "[Lclient!te;")
	public static Class314[] aClass314Array4;

	@OriginalMember(owner = "client!so", name = "f", descriptor = "[Lclient!jq;")
	public static Class177[] aClass177Array1;

	@OriginalMember(owner = "client!so", name = "g", descriptor = "[[Z")
	public static final boolean[][] aBooleanArrayArray14 = new boolean[][] { new boolean[13], { false, false, true, true, true, true, true, false, false, false, false, false, true }, { true, true, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, false, false, true, true, true, false, false, false, false, false }, { true, false, false, false, false, true, true, true, false, false, false, false, false }, { false, false, true, true, true, true, false, false, false, false, false, false, false }, { false, true, true, true, true, true, false, false, false, false, false, false, true }, { false, true, true, true, true, true, true, true, false, false, false, false, true }, { true, true, false, false, false, false, false, true, false, false, false, false, false }, { true, true, true, true, true, false, false, false, true, true, false, false, false }, { true, false, false, false, true, true, true, true, true, true, false, false, false }, { true, false, true, true, true, true, true, true, false, false, true, true, false }, { true, true, true, true, true, true, true, true, true, true, true, true, true }, new boolean[13], { true, true, true, true, true, true, true, true, true, true, true, true, true } };

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(II)Z")
	public static boolean method7230(@OriginalArg(0) int arg0) {
		Static308.anInt6171 = arg0 + 1 & 0xFFFF;
		Static79.aBoolean83 = true;
		return true;
	}

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(III)Z")
	public static boolean method7231(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (Static562.method8063(arg0, arg1) | Static219.method3585(arg1, arg0) | Static394.method6254(arg0, arg1)) & Static526.method3100(arg1, arg0);
	}

	@OriginalMember(owner = "client!so", name = "b", descriptor = "(I)V")
	public static void method7232() {
		Static379.aClass223_51.method5398();
	}
}
