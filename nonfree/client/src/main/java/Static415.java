import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static415 {

	@OriginalMember(owner = "client!ut", name = "b", descriptor = "I")
	public static int anInt6598;

	@OriginalMember(owner = "client!ut", name = "i", descriptor = "Lclient!ok;")
	public static Class178 aClass178_127;

	@OriginalMember(owner = "client!ut", name = "q", descriptor = "I")
	public static int anInt6610;

	@OriginalMember(owner = "client!ut", name = "a", descriptor = "(Lclient!ok;Lclient!ok;Z)V")
	public static void method5216(@OriginalArg(0) Class178 arg0, @OriginalArg(1) Class178 arg1) {
		Static220.aClass178_61 = arg0;
		Static422.aClass178_132 = arg1;
	}

	@OriginalMember(owner = "client!ut", name = "a", descriptor = "(IIILclient!sh;IFFIIF[BFF)V")
	public static void method5220(@OriginalArg(1) int arg0, @OriginalArg(3) Class72 arg1, @OriginalArg(5) float arg2, @OriginalArg(6) float arg3, @OriginalArg(9) float arg4, @OriginalArg(10) byte[] arg5, @OriginalArg(11) float arg6, @OriginalArg(12) float arg7) {
		for (@Pc(7) int local7 = 0; local7 < 16; local7++) {
			Static237.method3232(arg3, local7, arg1, arg2, arg5, arg7, arg0, arg6, arg4);
			arg0 += 16384;
		}
	}

	@OriginalMember(owner = "client!ut", name = "a", descriptor = "(IZ)V")
	public static void method5222(@OriginalArg(1) boolean arg0) {
		if (arg0) {
			if (Static183.anInt3293 != -1) {
				Static348.method5606(Static183.anInt3293);
			}
			for (@Pc(17) Class7_Sub44 local17 = (Class7_Sub44) Static23.aClass164_3.method3514(); local17 != null; local17 = (Class7_Sub44) Static23.aClass164_3.method3519()) {
				if (!local17.method5801()) {
					local17 = (Class7_Sub44) Static23.aClass164_3.method3514();
					if (local17 == null) {
						break;
					}
				}
				Static255.method3394(true, local17, false);
			}
			Static183.anInt3293 = -1;
			Static23.aClass164_3 = new Class164(8);
			Static64.method946();
			Static183.anInt3293 = Static231.anInt6548;
			Static301.method4014(false);
			Static193.method2788();
			Static159.method2348(Static183.anInt3293);
		}
		Static385.aBoolean406 = true;
	}
}
