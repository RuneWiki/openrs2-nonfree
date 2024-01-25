import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static249 {

	@OriginalMember(owner = "client!pq", name = "c", descriptor = "I")
	public static int anInt4661 = 0;

	@OriginalMember(owner = "client!pq", name = "d", descriptor = "[B")
	public static final byte[] aByteArray73 = new byte[] { 0, 0, 2, 0, 0, 2, 1, 1, 0 };

	@OriginalMember(owner = "client!pq", name = "e", descriptor = "Z")
	public static boolean aBoolean326 = false;

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(IIIIILclient!pe;IBILclient!pe;)V")
	public static void method4315(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) Class44_Sub4_Sub4 arg3, @OriginalArg(6) int arg4, @OriginalArg(8) int arg5, @OriginalArg(9) Class44_Sub4_Sub4 arg6) {
		@Pc(7) int local7 = arg6.method4709();
		if (local7 == -1) {
			return;
		}
		@Pc(20) Class40 local20 = (Class40) Static323.aClass70_102.method1396((long) local7);
		if (local20 == null) {
			@Pc(27) Class88[] local27 = Static363.method2249(Static269.aClass53_124, local7);
			if (local27 == null) {
				return;
			}
			local20 = Static289.aClass81_7.method3015(local27[0]);
			Static323.aClass70_102.method1406(local20, (long) local7);
		}
		Static144.method2691(arg2 >> 1, arg3.method4714() * 64, arg0 >> 1, arg3.anInt6339, arg3.anInt6340, 0);
		@Pc(71) int local71 = Static158.anIntArray632[0] + arg1 - 18;
		@Pc(79) int local79 = local71 + arg4 / 4 * 18;
		@Pc(87) int local87 = Static158.anIntArray632[1] + arg5 - 70;
		@Pc(95) int local95 = local87 + arg4 % 4 * 18;
		local20.method5077(local79, local95);
		if (arg6 == arg3) {
			Static289.aClass81_7.method3002(local95 - 1, -256, local79 - 1, 18, 18);
		}
		@Pc(125) Class20_Sub5 local125 = Static31.method489();
		local125.anInt2538 = local79 + 16;
		local125.anInt2537 = local95;
		local125.anInt2535 = local95 + 16;
		local125.anInt2536 = local79;
		local125.aClass44_Sub4_Sub4_1 = arg6;
		Static126.aClass109_3.method2935(local125);
	}

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(IB)Lclient!mb;")
	public static Class132 method4316(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = arg0 >> 16;
		@Pc(16) int local16 = arg0 & 0xFFFF;
		if (Static81.aClass132ArrayArray1[local7] == null || Static81.aClass132ArrayArray1[local7][local16] == null) {
			@Pc(30) boolean local30 = Static31.method490(local7);
			if (!local30) {
				return null;
			}
		}
		return Static81.aClass132ArrayArray1[local7][local16];
	}
}
