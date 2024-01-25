import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static328 {

	@OriginalMember(owner = "client!lm", name = "r", descriptor = "I")
	public static int anInt6237;

	@OriginalMember(owner = "client!lm", name = "t", descriptor = "D")
	public static double aDouble13;

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(Ljava/lang/String;I)Z")
	public static boolean method5384(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return false;
		}
		for (@Pc(11) int local11 = 0; local11 < Static606.anInt9791; local11++) {
			if (arg0.equalsIgnoreCase(Static233.aStringArray32[local11])) {
				return true;
			}
		}
		return arg0.equalsIgnoreCase(Static68.aClass9_Sub2_Sub1_Sub2_Sub1_1.aString5);
	}

	@OriginalMember(owner = "client!lm", name = "c", descriptor = "(B)Lclient!nk;")
	public static Class9_Sub9 method5386() {
		@Pc(8) Class9_Sub9 local8 = (Class9_Sub9) Static565.aClass139_15.method3204();
		if (local8 == null) {
			return new Class9_Sub9();
		} else {
			Static645.anInt10267--;
			return local8;
		}
	}
}
