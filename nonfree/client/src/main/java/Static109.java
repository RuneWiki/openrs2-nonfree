import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static109 {

	@OriginalMember(owner = "client!du", name = "w", descriptor = "[B")
	public static byte[] aByteArray20;

	@OriginalMember(owner = "client!du", name = "u", descriptor = "I")
	public static int anInt2059 = 2;

	@OriginalMember(owner = "client!du", name = "a", descriptor = "(BIZ)V")
	public static void method1691(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1) {
		if (arg1) {
			@Pc(6) Class5_Sub48 local6 = Static16.method232(Static491.aClass46_88, Static276.aClass251_2);
			local6.aClass5_Sub22_Sub1_2.method5918(arg0);
			Static277.method4436(local6);
		} else {
			Static370.method5470(Static165.aClass98_55, arg0, -1);
		}
	}
}
