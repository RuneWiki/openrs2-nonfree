import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static229 {

	@OriginalMember(owner = "client!n", name = "D", descriptor = "I")
	public static int anInt4044;

	@OriginalMember(owner = "client!n", name = "F", descriptor = "Lclient!b;")
	public static Class20 aClass20_53;

	@OriginalMember(owner = "client!n", name = "G", descriptor = "[[B")
	public static final byte[][] aByteArrayArray13 = new byte[50][];

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(CB)Z")
	public static boolean method3782(@OriginalArg(0) char arg0) {
		return arg0 >= '0' && arg0 <= '9';
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(Lclient!wf;I)V")
	public static void method3783(@OriginalArg(0) Class244 arg0) {
		Static23.aClass3_Sub5_Sub1_1.method856(arg0.method5675());
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(BLclient!b;)I")
	public static int method3784(@OriginalArg(1) Class20 arg0) {
		@Pc(10) int local10 = 0;
		if (arg0.method226(Static317.anInt4553)) {
			local10++;
		}
		if (arg0.method226(Static363.anInt6167)) {
			local10++;
		}
		return local10;
	}
}
