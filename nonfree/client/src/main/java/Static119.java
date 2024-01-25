import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static119 {

	@OriginalMember(owner = "client!hj", name = "U", descriptor = "I")
	public static int anInt2859;

	@OriginalMember(owner = "client!hj", name = "R", descriptor = "Lclient!lm;")
	public static final Class124 aClass124_3 = new Class124(64);

	@OriginalMember(owner = "client!hj", name = "S", descriptor = "[Z")
	public static final boolean[] aBooleanArray15 = new boolean[8];

	@OriginalMember(owner = "client!hj", name = "V", descriptor = "I")
	public static int anInt2860 = -1;

	@OriginalMember(owner = "client!hj", name = "W", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray33 = new String[] { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };

	@OriginalMember(owner = "client!hj", name = "c", descriptor = "(I)V")
	public static void method2513(@OriginalArg(0) int arg0) {
		Static346.anInt6569 = arg0;
		for (@Pc(3) int local3 = 0; local3 < Static198.anInt4128; local3++) {
			for (@Pc(6) int local6 = 0; local6 < Static15.anInt1162; local6++) {
				if (Static273.aClass128ArrayArrayArray4[arg0][local3][local6] == null) {
					Static273.aClass128ArrayArrayArray4[arg0][local3][local6] = new Class128(arg0, local3, local6);
				}
			}
		}
	}
}
