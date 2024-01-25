import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static295 {

	@OriginalMember(owner = "client!ot", name = "b", descriptor = "I")
	public static int anInt4910;

	@OriginalMember(owner = "client!ot", name = "e", descriptor = "I")
	public static int anInt4913;

	@OriginalMember(owner = "client!ot", name = "f", descriptor = "Ljava/lang/Boolean;")
	public static Boolean aBoolean306 = Boolean.FALSE;

	@OriginalMember(owner = "client!ot", name = "a", descriptor = "(IIIILclient!kh;Lclient!kh;IZII)V")
	public static void method3892(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class26_Sub2_Sub4 arg3, @OriginalArg(5) Class26_Sub2_Sub4 arg4, @OriginalArg(8) int arg5, @OriginalArg(9) int arg6) {
		@Pc(7) int local7 = arg4.method5508();
		if (local7 == -1) {
			return;
		}
		@Pc(24) Class11 local24 = (Class11) Static322.aClass126_44.method2822((long) local7);
		if (local24 == null) {
			@Pc(31) Class246[] local31 = Static469.method5146(Static25.aClass178_9, local7);
			if (local31 == null) {
				return;
			}
			local24 = Static269.aClass51_9.method5308(local31[0]);
			Static322.aClass126_44.method2824((long) local7, local24);
		}
		Static124.method2021(arg6 >> 1, arg3.anInt7388, 0, arg3.method5512() * 64, arg3.aByte102, arg5 >> 1, arg3.anInt7383);
		@Pc(77) int local77 = Static25.anIntArray37[0] + arg2 - 18;
		@Pc(87) int local87 = Static25.anIntArray37[1] + arg0 - 16 - 54;
		@Pc(95) int local95 = local77 + arg1 / 4 * 18;
		@Pc(103) int local103 = local87 + arg1 % 4 * 18;
		local24.method4394(local95, local103);
		if (arg4 == arg3) {
			Static269.aClass51_9.method5325(local103 - 1, -256, 18, 18, local95 - 1);
		}
		@Pc(125) Class28_Sub8 local125 = Static49.method623();
		local125.anInt6314 = local95;
		local125.anInt6310 = local103 + 16;
		local125.aClass26_Sub2_Sub4_1 = arg4;
		local125.anInt6309 = local103;
		local125.anInt6308 = local95 + 16;
		Static104.aClass169_3.method3603(local125);
	}

	@OriginalMember(owner = "client!ot", name = "a", descriptor = "(Ljava/lang/String;BC)[Ljava/lang/String;")
	public static String[] method3893(@OriginalArg(0) String arg0, @OriginalArg(2) char arg1) {
		@Pc(10) int local10 = Static373.method4784(arg1, arg0);
		@Pc(15) String[] local15 = new String[local10 + 1];
		@Pc(17) int local17 = 0;
		@Pc(19) int local19 = 0;
		for (@Pc(26) int local26 = 0; local26 < local10; local26++) {
			@Pc(30) int local30;
			for (local30 = local19; arg0.charAt(local30) != arg1; local30++) {
			}
			local15[local17++] = arg0.substring(local19, local30);
			local19 = local30 + 1;
		}
		local15[local10] = arg0.substring(local19);
		return local15;
	}

	@OriginalMember(owner = "client!ot", name = "a", descriptor = "([BII)[B")
	public static byte[] method3894(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		@Pc(11) byte[] local11 = new byte[arg1];
		Static464.method3633(arg0, 0, local11, 0, arg1);
		return local11;
	}
}
