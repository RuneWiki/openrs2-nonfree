import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static416 {

	@OriginalMember(owner = "client!od", name = "D", descriptor = "[I")
	public static final int[] anIntArray406 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };

	@OriginalMember(owner = "client!od", name = "L", descriptor = "J")
	public static long aLong216 = 0L;

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(Lclient!wq;BLclient!wq;)V")
	public static void method6118(@OriginalArg(0) Class394 arg0, @OriginalArg(2) Class394 arg1) {
		@Pc(17) Class5_Sub16 local17 = Static455.method6717(Static670.aClass187_112, Static16.aClass332_8);
		local17.aClass5_Sub15_Sub2_1.method3679(arg1.anInt10490);
		local17.aClass5_Sub15_Sub2_1.method3696(arg0.anInt10469);
		local17.aClass5_Sub15_Sub2_1.method3679(arg0.anInt10490);
		local17.aClass5_Sub15_Sub2_1.method3656(arg1.anInt10502);
		local17.aClass5_Sub15_Sub2_1.method3656(arg1.anInt10469);
		local17.aClass5_Sub15_Sub2_1.method3632(arg0.anInt10502);
		Static479.method7038(local17);
	}

	@OriginalMember(owner = "client!od", name = "c", descriptor = "(III)V")
	public static void method6119(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (Static175.method2576(arg0)) {
			Static100.method1663(arg1, Static227.aClass394ArrayArray2[arg0]);
		}
	}

	@OriginalMember(owner = "client!od", name = "d", descriptor = "(III)Z")
	public static boolean method6121(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x800) != 0;
	}

	@OriginalMember(owner = "client!od", name = "b", descriptor = "(IBI)Z")
	public static boolean method6123(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x100100) != 0;
	}
}
