import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static33 {

	@OriginalMember(owner = "client!bc", name = "b", descriptor = "I")
	public static int anInt607;

	@OriginalMember(owner = "client!bc", name = "l", descriptor = "Z")
	public static boolean aBoolean36;

	@OriginalMember(owner = "client!bc", name = "o", descriptor = "I")
	public static int anInt615 = 0;

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(IIII)Z")
	public static boolean method519(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) boolean local5 = true;
		@Pc(11) Interface22 local11 = (Interface22) Static556.method7726(arg2, arg0, arg1);
		if (local11 != null) {
			local5 = Static90.method4175(local11) & true;
		}
		local11 = (Interface22) Static406.method5850(arg2, arg0, arg1, uq.class);
		if (local11 != null) {
			local5 &= Static90.method4175(local11);
		}
		local11 = (Interface22) Static361.method5373(arg2, arg0, arg1);
		if (local11 != null) {
			local5 &= Static90.method4175(local11);
		}
		return local5;
	}
}
