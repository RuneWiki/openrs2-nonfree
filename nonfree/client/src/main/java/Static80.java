import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static80 {

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(CB)Z", line = 18)
	public static boolean method1910(@OriginalArg(0) char arg0) {
		if (arg0 > '\u0000' && arg0 < '\u0080' || !(arg0 < ' ' || arg0 > 'ÿ')) {
			return true;
		}
		if (arg0 != '\u0000') {
			@Pc(37) char[] local37 = Class2_Sub3_Sub19.aCharArray2;
			for (@Pc(39) int local39 = 0; local39 < local37.length; local39++) {
				@Pc(45) char local45 = local37[local39];
				if (arg0 == local45) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(ZIIZ)V", line = 52)
	public static void method1911(@OriginalArg(3) boolean arg0) {
		Static329.aBoolean93 = arg0;
		Static187.anInt3694 = 2;
		Static331.anInt6630 = 22050;
	}
}
