import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static534 {

	@OriginalMember(owner = "client!rn", name = "c", descriptor = "[I")
	public static final int[] anIntArray473 = new int[8];

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(I)Lclient!pc;")
	public static Class2 method7888() {
		try {
			return new Class2_Sub2();
		} catch (@Pc(8) Throwable local8) {
			try {
				return (Class2) Class.forName("aaa").getDeclaredConstructor().newInstance();
			} catch (@Pc(22) Throwable local22) {
				return new Class2_Sub3();
			}
		}
	}

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(II)Z")
	public static boolean method7889(@OriginalArg(0) int arg0) {
		return arg0 >= 12 && arg0 <= 17;
	}
}
