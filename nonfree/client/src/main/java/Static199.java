import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static199 {

	@OriginalMember(owner = "client!jv", name = "N", descriptor = "Lclient!oa;")
	public static Class4 aClass4_4;

	@OriginalMember(owner = "client!jv", name = "P", descriptor = "[I")
	public static int[] anIntArray292;

	@OriginalMember(owner = "client!jv", name = "R", descriptor = "F")
	public static float aFloat62;

	@OriginalMember(owner = "client!jv", name = "e", descriptor = "(I)V")
	public static void method3070() {
		if (Static138.aString88.length() == 0) {
			return;
		}
		Static161.method2529("--> " + Static138.aString88);
		Static238.method3491(false, Static138.aString88);
		Static138.aString88 = "";
		Static213.anInt3819 = 0;
		Static379.anInt6817 = 0;
	}

	@OriginalMember(owner = "client!jv", name = "a", descriptor = "(IC)Z")
	public static boolean method3071(@OriginalArg(1) char arg0) {
		if (arg0 > '\u0000' && arg0 < '\u0080' || !(arg0 < ' ' || arg0 > 'ÿ')) {
			return true;
		}
		if (arg0 != '\u0000') {
			@Pc(32) char[] local32 = Static393.aCharArray4;
			for (@Pc(34) int local34 = 0; local34 < local32.length; local34++) {
				@Pc(40) char local40 = local32[local34];
				if (local40 == arg0) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!jv", name = "a", descriptor = "(Ljava/lang/String;B)I")
	public static int method3072(@OriginalArg(0) String arg0) {
		for (@Pc(12) int local12 = 0; local12 < Static190.aStringArray22.length; local12++) {
			if (Static190.aStringArray22[local12].equalsIgnoreCase(arg0)) {
				return local12;
			}
		}
		return -1;
	}
}
