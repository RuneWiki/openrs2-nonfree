import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static34 {

	@OriginalMember(owner = "client!be", name = "u", descriptor = "[I")
	public static final int[] anIntArray62 = new int[500];

	@OriginalMember(owner = "client!be", name = "v", descriptor = "I")
	public static int anInt869 = 0;

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(BLclient!ps;)V")
	public static void method813(@OriginalArg(1) Class5_Sub15 arg0) {
		if (arg0.aClass5_Sub5_5 != null) {
			arg0.aClass5_Sub5_5.anInt481 = 0;
		}
		arg0.aBoolean572 = false;
		for (@Pc(24) Class5_Sub15 local24 = arg0.method6506(); local24 != null; local24 = arg0.method6511()) {
			method813(local24);
		}
	}
}
