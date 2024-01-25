import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static231 {

	@OriginalMember(owner = "client!lj", name = "k", descriptor = "Lclient!qg;")
	public static Class30 aClass30_3;

	@OriginalMember(owner = "client!lj", name = "o", descriptor = "[S")
	public static short[] aShortArray59;

	@OriginalMember(owner = "client!lj", name = "p", descriptor = "F")
	public static float aFloat70 = 0.0F;

	@OriginalMember(owner = "client!lj", name = "b", descriptor = "(B)Z")
	public static boolean method3444() {
		try {
			return Static452.method3894();
		} catch (@Pc(17) IOException local17) {
			Static106.method1864();
			return true;
		} catch (@Pc(22) Exception local22) {
			@Pc(81) String local81 = "T2 - " + (Static116.aClass217_52 == null ? -1 : Static116.aClass217_52.method4861()) + "," + (Static163.aClass217_73 == null ? -1 : Static163.aClass217_73.method4861()) + "," + (Static320.aClass217_120 == null ? -1 : Static320.aClass217_120.method4861()) + " - " + Static10.anInt154 + "," + (Static263.aClass24_Sub3_Sub2_Sub2_4.anIntArray610[0] + Static168.anInt3353) + "," + (Static72.anInt1488 + Static263.aClass24_Sub3_Sub2_Sub2_4.anIntArray611[0]) + " - ";
			for (@Pc(83) int local83 = 0; Static10.anInt154 > local83 && local83 < 50; local83++) {
				local81 = local81 + Static203.aClass10_Sub8_Sub2_1.aByteArray44[local83] + ",";
			}
			Static432.method5720(local81, local22);
			Static172.method2923(false);
			return true;
		}
	}

	@OriginalMember(owner = "client!lj", name = "b", descriptor = "(II)Lclient!tc;")
	public static Class231 method3446(@OriginalArg(1) int arg0) {
		@Pc(10) Class231 local10 = (Class231) Static335.aClass267_57.method6014((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static288.aClass187_89.method4300(0, arg0);
		local10 = new Class231();
		if (local20 != null) {
			local10.method5156(new Class10_Sub8(local20), arg0);
		}
		Static335.aClass267_57.method6008(local10, (long) arg0);
		return local10;
	}
}
