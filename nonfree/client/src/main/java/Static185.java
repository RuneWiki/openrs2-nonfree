import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static185 {

	@OriginalMember(owner = "client!kk", name = "F", descriptor = "[[B")
	public static byte[][] aByteArrayArray9;

	@OriginalMember(owner = "client!kk", name = "I", descriptor = "[[I")
	public static int[][] anIntArrayArray35;

	@OriginalMember(owner = "client!kk", name = "y", descriptor = "I")
	public static int anInt3278 = -1;

	@OriginalMember(owner = "client!kk", name = "C", descriptor = "Lclient!kr;")
	public static final Class138 aClass138_23 = new Class138();

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(Ljava/lang/String;I)Z")
	public static boolean method2922(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return false;
		}
		for (@Pc(16) int local16 = 0; local16 < Static196.anInt5194; local16++) {
			if (arg0.equalsIgnoreCase(Static78.aStringArray12[local16])) {
				return true;
			}
			if (arg0.equalsIgnoreCase(Static247.aStringArray29[local16])) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!kk", name = "d", descriptor = "(B)V")
	public static void method2923() {
		if (Static291.aClass171_5 != Static310.aClass171_6) {
			try {
				Static398.method1714(Static144.aClient1, "tbrefresh");
			} catch (@Pc(19) Throwable local19) {
			}
		}
	}
}
