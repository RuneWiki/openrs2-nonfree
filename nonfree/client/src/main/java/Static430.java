import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static430 {

	@OriginalMember(owner = "client!qw", name = "e", descriptor = "I")
	public static int anInt868;

	@OriginalMember(owner = "client!qw", name = "f", descriptor = "Lclient!jo;")
	public static Class168 aClass168_12;

	@OriginalMember(owner = "client!qw", name = "g", descriptor = "I")
	public static int anInt869;

	@OriginalMember(owner = "client!qw", name = "d", descriptor = "I")
	public static int anInt867 = -1;

	@OriginalMember(owner = "client!qw", name = "a", descriptor = "(ZC)Z")
	public static boolean method839(@OriginalArg(1) char arg0) {
		if (Character.isISOControl(arg0)) {
			return false;
		} else if (Static21.method862(arg0)) {
			return true;
		} else {
			@Pc(18) char[] local18 = Static271.aCharArray5;
			for (@Pc(20) int local20 = 0; local20 < local18.length; local20++) {
				@Pc(26) char local26 = local18[local20];
				if (local26 == arg0) {
					return true;
				}
			}
			@Pc(42) char[] local42 = Static167.aCharArray1;
			for (@Pc(51) int local51 = 0; local51 < local42.length; local51++) {
				@Pc(57) char local57 = local42[local51];
				if (arg0 == local57) {
					return true;
				}
			}
			return false;
		}
	}

	@OriginalMember(owner = "client!qw", name = "a", descriptor = "(III)V")
	public static void method840(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class6_Sub4_Sub6 local8 = Static68.method1408(13, arg0);
		local8.method3826();
		local8.anInt4403 = arg1;
	}
}
