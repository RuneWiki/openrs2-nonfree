import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static250 {

	@OriginalMember(owner = "client!mn", name = "m", descriptor = "I")
	public static int anInt4255;

	@OriginalMember(owner = "client!mn", name = "n", descriptor = "Lclient!lt;")
	public static Class158 aClass158_58;

	@OriginalMember(owner = "client!mn", name = "d", descriptor = "Lclient!oq;")
	public static final Class193 aClass193_4 = new Class193("", 15);

	@OriginalMember(owner = "client!mn", name = "g", descriptor = "I")
	public static final int anInt4252 = 328;

	@OriginalMember(owner = "client!mn", name = "i", descriptor = "[I")
	public static final int[] anIntArray385 = new int[] { 2, 1, 1, 1, 2, 2, 2, 1, 3, 3, 3, 2, 0, 4, 0 };

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(I)V")
	public static void method3852() {
		Static411.aBoolean471 = false;
		Static15.aClipboard1 = null;
		Static207.method3239();
	}

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(Ljava/lang/String;I)Z")
	public static boolean method3853(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return false;
		}
		for (@Pc(11) int local11 = 0; local11 < Static203.anInt3584; local11++) {
			if (arg0.equalsIgnoreCase(Static115.aStringArray15[local11])) {
				return true;
			}
			if (arg0.equalsIgnoreCase(Static451.aStringArray44[local11])) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(ILclient!o;)V")
	public static void method3854(@OriginalArg(1) Class183 arg0) {
		Static345.aClass183_1 = arg0;
	}
}
