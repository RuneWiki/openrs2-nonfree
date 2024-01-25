import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static471 {

	@OriginalMember(owner = "client!pv", name = "b", descriptor = "I")
	public static int anInt7772 = 0;

	@OriginalMember(owner = "client!pv", name = "a", descriptor = "(III)I")
	public static int method6824(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(41) int local41 = Static191.method3508(4, arg0 + 45365, arg1 + 91923) + (Static191.method3508(2, arg0 + 10294, arg1 - -37821) - 128 >> 1) + (Static191.method3508(1, arg0, arg1) + -128 >> 2) - 128;
		local41 = (int) ((double) local41 * 0.3D) + 35;
		if (local41 < 10) {
			local41 = 10;
		} else if (local41 > 60) {
			local41 = 60;
		}
		return local41;
	}

	@OriginalMember(owner = "client!pv", name = "b", descriptor = "(B)V")
	public static void method6825() {
		Static309.method4731();
	}

	@OriginalMember(owner = "client!pv", name = "b", descriptor = "(III)Z")
	public static boolean method6827(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x70000) != 0 | Static493.method7095(arg1, arg0) || Static94.method1709(arg1, arg0);
	}

	@OriginalMember(owner = "client!pv", name = "c", descriptor = "(III)Z")
	public static boolean method6828(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (!Static43.aBoolean74) {
			return false;
		}
		@Pc(13) int local13 = arg1 >> 16;
		@Pc(22) int local22 = arg1 & 0xFFFF;
		if (Static489.aClass260ArrayArray3[local13] == null || Static489.aClass260ArrayArray3[local13][local22] == null) {
			return false;
		}
		@Pc(40) Class260 local40 = Static489.aClass260ArrayArray3[local13][local22];
		@Pc(52) Class3_Sub11_Sub14 local52;
		if (arg0 == -1 && local40.anInt7003 == 0) {
			for (local52 = (Class3_Sub11_Sub14) Static78.aClass338_99.method8177(); local52 != null; local52 = (Class3_Sub11_Sub14) Static78.aClass338_99.method8168()) {
				if (local52.anInt6738 == 8 || local52.anInt6738 == 1001 || local52.anInt6738 == 18 || local52.anInt6738 == 30 || local52.anInt6738 == 19) {
					for (@Pc(134) Class260 local134 = Static383.method5492(local52.anInt6737); local134 != null; local134 = Static119.method2271(local134)) {
						if (local40.anInt6930 == local134.anInt6930) {
							return true;
						}
					}
				}
			}
		} else {
			for (local52 = (Class3_Sub11_Sub14) Static78.aClass338_99.method8177(); local52 != null; local52 = (Class3_Sub11_Sub14) Static78.aClass338_99.method8168()) {
				if (arg0 == local52.anInt6736 && local52.anInt6737 == local40.anInt6930 && (local52.anInt6738 == 8 || local52.anInt6738 == 1001 || local52.anInt6738 == 18 || local52.anInt6738 == 30 || local52.anInt6738 == 19)) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!pv", name = "a", descriptor = "(IIIBIIIIZ)Z")
	public static boolean method6829(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) boolean arg7) {
		@Pc(13) int local13 = Static546.aClass28_Sub1_Sub1_Sub1_Sub1_2.anIntArray956[0];
		@Pc(18) int local18 = Static546.aClass28_Sub1_Sub1_Sub1_Sub1_2.anIntArray955[0];
		if (local13 < 0 || local13 >= Static158.anInt927 || local18 < 0 || Static515.anInt8292 <= local18) {
			return false;
		} else if (arg4 >= 0 && arg4 < Static158.anInt927 && arg3 >= 0 && arg3 < Static515.anInt8292) {
			@Pc(73) int local73 = Static180.method3220(arg3, Static546.aClass28_Sub1_Sub1_Sub1_Sub1_2.method9314(), Static597.anIntArray826, arg0, arg7, local13, Static62.anIntArray112, local18, arg1, Static1.aClass252Array5[Static546.aClass28_Sub1_Sub1_Sub1_Sub1_2.aByte174], arg5, arg4, arg2, arg6);
			if (local73 < 1) {
				return false;
			}
			Static661.anInt10551 = Static62.anIntArray112[local73 - 1];
			Static514.anInt8261 = Static597.anIntArray826[local73 - 1];
			Static27.aBoolean43 = false;
			Static518.method7283();
			return true;
		} else {
			return false;
		}
	}
}
