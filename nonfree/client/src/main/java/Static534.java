import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static534 {

	@OriginalMember(owner = "client!su", name = "e", descriptor = "Ljava/lang/String;")
	public static String aString98;

	@OriginalMember(owner = "client!su", name = "c", descriptor = "[I")
	public static final int[] anIntArray480 = new int[14];

	@OriginalMember(owner = "client!su", name = "f", descriptor = "[I")
	public static final int[] anIntArray481 = new int[25];

	@OriginalMember(owner = "client!su", name = "a", descriptor = "(ILjava/lang/String;)Z")
	public static boolean method7568(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return false;
		}
		for (@Pc(11) int local11 = 0; local11 < Static544.anInt9412; local11++) {
			if (arg0.equalsIgnoreCase(Static277.aStringArray16[local11])) {
				return true;
			}
		}
		return arg0.equalsIgnoreCase(Static160.aClass9_Sub4_Sub2_Sub1_Sub2_1.aString46);
	}

	@OriginalMember(owner = "client!su", name = "a", descriptor = "(B)Lclient!uca;")
	public static Class6_Sub48 method7569() {
		if (Static491.aClass163_49 == null || Static60.aClass171_4 == null) {
			return null;
		}
		Static60.aClass171_4.method5093(Static491.aClass163_49);
		@Pc(18) Class6_Sub48 local18 = (Class6_Sub48) Static60.aClass171_4.method5092();
		if (local18 == null) {
			return null;
		} else {
			@Pc(28) Class36 local28 = Static491.aClass345_4.method8044(local18.anInt9722);
			return local28 != null && local28.aBoolean140 && local28.method1623(Static491.anInterface6_2) ? local18 : Static183.method8414();
		}
	}
}
