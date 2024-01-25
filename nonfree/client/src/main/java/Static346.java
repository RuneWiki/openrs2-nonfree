import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static346 {

	@OriginalMember(owner = "client!li", name = "j", descriptor = "Lclient!lga;")
	public static Class223 aClass223_75;

	@OriginalMember(owner = "client!li", name = "n", descriptor = "[I")
	public static int[] anIntArray343;

	@OriginalMember(owner = "client!li", name = "c", descriptor = "(III)Z")
	public static boolean method5314(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x60000) != 0 | Static137.method2610(arg1, arg0) || Static337.method5204(arg1, arg0);
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(ILclient!vo;)Ljava/lang/String;")
	public static String method5315(@OriginalArg(1) Class381 arg0) {
		if (Static78.method1061(arg0).method5217() == 0) {
			return null;
		} else if (arg0.aString122 == null || arg0.aString122.trim().length() == 0) {
			return Static628.aBoolean728 ? "Hidden-use" : null;
		} else {
			return arg0.aString122;
		}
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(Ljava/lang/String;I)Z")
	public static boolean method5316(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return false;
		}
		for (@Pc(18) int local18 = 0; local18 < Static265.anInt5023; local18++) {
			if (arg0.equalsIgnoreCase(Static35.aStringArray5[local18])) {
				return true;
			}
		}
		return arg0.equalsIgnoreCase(Static194.aClass60_Sub1_Sub1_Sub3_Sub1_1.aString23);
	}
}
