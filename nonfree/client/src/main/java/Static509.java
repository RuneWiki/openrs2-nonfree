import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static509 {

	@OriginalMember(owner = "client!qd", name = "b", descriptor = "Lclient!mga;")
	public static Class241 aClass241_1;

	@OriginalMember(owner = "client!qd", name = "n", descriptor = "I")
	public static int anInt8051 = -1;

	@OriginalMember(owner = "client!qd", name = "c", descriptor = "[I")
	public static final int[] anIntArray575 = new int[6];

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(IB)V")
	public static void method7194(@OriginalArg(0) int arg0) {
		@Pc(17) Class2_Sub6_Sub12 local17 = Static636.method8647(7, (long) arg0);
		local17.method6245();
	}

	@OriginalMember(owner = "client!qd", name = "d", descriptor = "(I)V")
	public static void method7195() {
		Static49.aClass60_17 = new Class60();
	}
}
