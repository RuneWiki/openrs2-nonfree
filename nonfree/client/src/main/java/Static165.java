import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static165 {

	@OriginalMember(owner = "client!jm", name = "g", descriptor = "[I")
	public static int[] anIntArray264;

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "Lclient!re;")
	public static final Class199 aClass199_3 = new Class199();

	@OriginalMember(owner = "client!jm", name = "c", descriptor = "Lclient!pn;")
	public static final Class183 aClass183_46 = new Class183(18, 2);

	@OriginalMember(owner = "client!jm", name = "d", descriptor = "[Lclient!pe;")
	public static final Class178[] aClass178Array1 = new Class178[4];

	@OriginalMember(owner = "client!jm", name = "e", descriptor = "I")
	public static int anInt3408 = -1;

	@OriginalMember(owner = "client!jm", name = "f", descriptor = "I")
	public static int anInt3409 = 0;

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(CI)Z")
	public static boolean method2919(@OriginalArg(0) char arg0) {
		if (Character.isISOControl(arg0)) {
			return false;
		} else if (Static212.method3827(arg0)) {
			return true;
		} else {
			@Pc(23) char[] local23 = Static148.aCharArray2;
			for (@Pc(25) int local25 = 0; local25 < local23.length; local25++) {
				@Pc(31) char local31 = local23[local25];
				if (local31 == arg0) {
					return true;
				}
			}
			@Pc(43) char[] local43 = Static82.aCharArray1;
			for (@Pc(45) int local45 = 0; local45 < local43.length; local45++) {
				@Pc(51) char local51 = local43[local45];
				if (local51 == arg0) {
					return true;
				}
			}
			return false;
		}
	}
}
