import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static642 {

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "[Lclient!vs;")
	public static Class379[] aClass379Array4;

	@OriginalMember(owner = "client!vo", name = "h", descriptor = "[Lclient!cv;")
	public static Interface5[] anInterface5Array1;

	@OriginalMember(owner = "client!vo", name = "d", descriptor = "I")
	public static int anInt10377 = 0;

	@OriginalMember(owner = "client!vo", name = "e", descriptor = "D")
	public static double aDouble180 = -1.0D;

	@OriginalMember(owner = "client!vo", name = "g", descriptor = "I")
	public static int anInt10379 = 0;

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "()V")
	public static void method8766() {
		for (@Pc(1) int local1 = 0; local1 < Static47.aClass329Array1.length; local1++) {
			Static47.aClass329Array1[local1].method7845();
		}
		Static47.aClass329Array1 = null;
	}

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(IZII)I")
	public static int method8767(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2) {
		@Pc(17) Class6_Sub6 local17 = Static249.method3626(arg1, arg2);
		if (local17 == null) {
			return 0;
		} else if (arg0 >= 0 && local17.anIntArray54.length > arg0) {
			return local17.anIntArray54[arg0];
		} else {
			return 0;
		}
	}
}
