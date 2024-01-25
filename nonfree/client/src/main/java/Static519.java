import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static519 {

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "Z")
	public static boolean aBoolean682 = false;

	@OriginalMember(owner = "client!uk", name = "b", descriptor = "[I")
	public static final int[] anIntArray795 = new int[1000];

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(I)V")
	public static void method7595() {
		if (Static323.aClass9_8.method5414()) {
			Static323.aClass9_8.method5410(Static38.aCanvas4);
			Static27.method984();
			Static323.aClass9_8.method5428(Static38.aCanvas4);
			Static323.aClass9_8.method5465(Static38.aCanvas4);
		} else {
			Static419.method6517(Static5.anInt145);
		}
		Static101.method2148();
	}

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(IZZ)Lclient!dn;")
	public static Class6_Sub15 method7596(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1) {
		@Pc(17) long local17 = (long) (arg0 | (arg1 ? Integer.MIN_VALUE : 0));
		return (Class6_Sub15) Static577.aClass305_40.method7447(local17);
	}

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(Z[[I)V")
	public static void method7598(@OriginalArg(1) int[][] arg0) {
		Static183.anIntArrayArray26 = arg0;
	}

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(ILclient!ep;)Ljava/lang/String;")
	public static String method7599(@OriginalArg(1) Class93 arg0) {
		if (Static69.method1454(arg0).method7359() == 0) {
			return null;
		} else if (arg0.aString32 == null || arg0.aString32.trim().length() == 0) {
			return Static13.aBoolean37 ? "Hidden-use" : null;
		} else {
			return arg0.aString32;
		}
	}
}
