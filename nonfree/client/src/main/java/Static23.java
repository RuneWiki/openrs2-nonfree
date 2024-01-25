import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static23 {

	@OriginalMember(owner = "client!ba", name = "w", descriptor = "I")
	public static int anInt5191;

	@OriginalMember(owner = "client!ba", name = "y", descriptor = "[[Z")
	public static boolean[][] aBooleanArrayArray4;

	@OriginalMember(owner = "client!ba", name = "x", descriptor = "[I")
	public static final int[] anIntArray448 = new int[4];

	@OriginalMember(owner = "client!ba", name = "B", descriptor = "I")
	public static int anInt5194 = 0;

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(IBI)Z")
	public static boolean method4301(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return false;
	}

	@OriginalMember(owner = "client!ba", name = "b", descriptor = "(B)Lclient!bn;")
	public static Class25 method4302() {
		try {
			return (Class25) Class.forName("Class25_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(14) Throwable local14) {
			return null;
		}
	}
}
