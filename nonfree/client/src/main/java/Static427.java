import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static427 {

	@OriginalMember(owner = "client!pe", name = "F", descriptor = "I")
	public static int anInt7462;

	@OriginalMember(owner = "client!pe", name = "J", descriptor = "[Lclient!fd;")
	public static Class103[] aClass103Array16;

	@OriginalMember(owner = "client!pe", name = "O", descriptor = "[I")
	public static int[] anIntArray447;

	@OriginalMember(owner = "client!pe", name = "T", descriptor = "Lclient!kr;")
	public static Class194 aClass194_241;

	@OriginalMember(owner = "client!pe", name = "H", descriptor = "[I")
	public static final int[] anIntArray445 = new int[4096];

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(Ljava/lang/String;Z)Z")
	public static boolean method6524(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return false;
		}
		for (@Pc(11) int local11 = 0; local11 < Static191.anInt3579; local11++) {
			if (arg0.equalsIgnoreCase(Static209.aStringArray30[local11])) {
				return true;
			}
			if (arg0.equalsIgnoreCase(Static492.aStringArray70[local11])) {
				return true;
			}
		}
		return false;
	}
}
