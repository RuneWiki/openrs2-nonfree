import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static172 {

	@OriginalMember(owner = "client!ik", name = "z", descriptor = "I")
	public static int anInt3305 = 2;

	@OriginalMember(owner = "client!ik", name = "D", descriptor = "Lclient!jp;")
	public static final Class129 aClass129_26 = new Class129(8);

	@OriginalMember(owner = "client!ik", name = "L", descriptor = "[I")
	public static final int[] anIntArray221 = new int[25];

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(ZZ)Z")
	public static boolean method2653(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		return arg0 | arg1;
	}

	@OriginalMember(owner = "client!ik", name = "b", descriptor = "(B)V")
	public static void method2658() {
		for (@Pc(15) Class38_Sub6 local15 = (Class38_Sub6) Static384.aClass184_7.method4212(); local15 != null; local15 = (Class38_Sub6) Static384.aClass184_7.method4215()) {
			local15.method3545();
		}
	}
}
