import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static460 {

	@OriginalMember(owner = "client!qj", name = "f", descriptor = "Lclient!la;")
	public static Class207 aClass207_96;

	@OriginalMember(owner = "client!qj", name = "l", descriptor = "D")
	public static double aDouble16;

	@OriginalMember(owner = "client!qj", name = "q", descriptor = "Lclient!vh;")
	public static Class363 aClass363_6;

	@OriginalMember(owner = "client!qj", name = "j", descriptor = "Ljava/util/Hashtable;")
	public static final Hashtable aHashtable5 = new Hashtable();

	@OriginalMember(owner = "client!qj", name = "m", descriptor = "[Z")
	public static final boolean[] aBooleanArray24 = new boolean[8];

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(Z)V")
	public static void method6843() {
		if (Static548.anInt9248 == 5) {
			Static548.anInt9248 = 6;
		}
	}

	@OriginalMember(owner = "client!qj", name = "b", descriptor = "(IZ)I")
	public static int method6846(@OriginalArg(0) int arg0) {
		@Pc(12) int local12 = arg0 >>> 1;
		@Pc(18) int local18 = local12 | local12 >>> 1;
		@Pc(24) int local24 = local18 | local18 >>> 2;
		@Pc(30) int local30 = local24 | local24 >>> 4;
		@Pc(36) int local36 = local30 | local30 >>> 8;
		@Pc(42) int local42 = local36 | local36 >>> 16;
		return arg0 & ~local42;
	}
}
