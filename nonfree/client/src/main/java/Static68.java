import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static68 {

	@OriginalMember(owner = "client!ci", name = "y", descriptor = "[I")
	public static int[] anIntArray94;

	@OriginalMember(owner = "client!ci", name = "z", descriptor = "Lclient!uu;")
	public static Class63 aClass63_1;

	@OriginalMember(owner = "client!ci", name = "C", descriptor = "[I")
	public static int[] anIntArray95;

	@OriginalMember(owner = "client!ci", name = "F", descriptor = "I")
	public static int anInt1096 = -1;

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(ILclient!wu;Z)Lclient!hu;")
	public static Class44 method1134(@OriginalArg(0) int arg0, @OriginalArg(1) Class384 arg1) {
		@Pc(10) Class44 local10 = (Class44) Static625.aClass293_74.method6921((long) arg0);
		if (local10 == null) {
			if (Static432.aBoolean607) {
				local10 = Static485.aClass126_17.method6994(Static654.method4049(arg1, arg0), true);
			} else {
				local10 = Static577.method8146(arg1.method8893(arg0));
			}
			Static625.aClass293_74.method6925((long) arg0, local10);
		}
		return local10;
	}
}
