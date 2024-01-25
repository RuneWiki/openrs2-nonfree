import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static342 {

	@OriginalMember(owner = "client!lga", name = "n", descriptor = "I")
	public static int anInt6251;

	@OriginalMember(owner = "client!lga", name = "p", descriptor = "Lclient!mc;")
	public static Class5_Sub41 aClass5_Sub41_4;

	@OriginalMember(owner = "client!lga", name = "a", descriptor = "(Lclient!ek;B)Z")
	public static boolean method5200(@OriginalArg(0) Class103 arg0) {
		if (arg0 == null) {
			return false;
		} else if (!arg0.aBoolean238) {
			return false;
		} else if (!arg0.method2499(Static330.anInterface2_2)) {
			return false;
		} else if (Static478.aClass300_34.method7188((long) arg0.anInt2818) == null) {
			return Static217.aClass300_17.method7188((long) arg0.anInt2801) == null;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!lga", name = "a", descriptor = "(Z)V")
	public static void method5204() {
		for (@Pc(10) int local10 = 0; local10 < Static7.aByteArrayArrayArray1.length; local10++) {
			for (@Pc(14) int local14 = 0; local14 < Static7.aByteArrayArrayArray1[0].length; local14++) {
				for (@Pc(18) int local18 = 0; local18 < Static7.aByteArrayArrayArray1[0][0].length; local18++) {
					Static7.aByteArrayArrayArray1[local10][local14][local18] = 0;
				}
			}
		}
	}
}
