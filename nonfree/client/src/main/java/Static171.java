import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static171 {

	@OriginalMember(owner = "client!fv", name = "z", descriptor = "Lclient!ql;")
	public static Class154 aClass154_2;

	@OriginalMember(owner = "client!fv", name = "C", descriptor = "I")
	public static int anInt3561 = 2;

	@OriginalMember(owner = "client!fv", name = "F", descriptor = "[Lclient!ci;")
	public static Class52[] aClass52Array1 = null;

	@OriginalMember(owner = "client!fv", name = "a", descriptor = "(III)Z")
	public static boolean method3148(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(15) Class312 local15 = Static283.aClass210_2.method5629(arg1);
		if (arg0 == 11) {
			arg0 = 10;
		}
		if (arg0 >= 5 && arg0 <= 8) {
			arg0 = 4;
		}
		return local15.method7855(arg0);
	}
}
