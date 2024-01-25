import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static299 {

	@OriginalMember(owner = "client!lb", name = "R", descriptor = "I")
	public static int anInt5597;

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(BLjava/lang/String;)Z")
	public static boolean method4549(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return false;
		}
		for (@Pc(11) int local11 = 0; local11 < Static372.anInt6493; local11++) {
			if (arg0.equalsIgnoreCase(Static437.aStringArray36[local11])) {
				return true;
			}
		}
		return arg0.equalsIgnoreCase(Static254.aClass25_Sub2_Sub2_Sub5_Sub1_1.aString183);
	}
}
