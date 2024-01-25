import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static191 {

	@OriginalMember(owner = "client!gn", name = "b", descriptor = "I")
	public static int anInt3244;

	@OriginalMember(owner = "client!gn", name = "e", descriptor = "Z")
	public static boolean aBoolean194 = false;

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(III)Z")
	public static boolean method2705(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return Static334.method4896(arg0, arg1) & Static556.method7864(arg1, arg0);
	}

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(II)Lclient!fea;")
	public static Class104 method2707(@OriginalArg(0) int arg0) {
		@Pc(10) Class104[] local10 = Static376.method5348();
		for (@Pc(12) int local12 = 0; local12 < local10.length; local12++) {
			@Pc(18) Class104 local18 = local10[local12];
			if (arg0 == local18.anInt2548) {
				return local18;
			}
		}
		return null;
	}
}
