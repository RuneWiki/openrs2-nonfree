import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static168 {

	@OriginalMember(owner = "client!h", name = "a", descriptor = "[F")
	public static final float[] aFloatArray24 = new float[4];

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(ZB)V")
	public static void method3191(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			if (Static328.anInt6167 != -1) {
				Static62.method1530(Static328.anInt6167);
			}
			for (@Pc(22) Class1_Sub35 local22 = (Class1_Sub35) Static362.aClass230_45.method6137(); local22 != null; local22 = (Class1_Sub35) Static362.aClass230_45.method6140()) {
				if (!local22.method8241()) {
					local22 = (Class1_Sub35) Static362.aClass230_45.method6137();
					if (local22 == null) {
						break;
					}
				}
				Static537.method8142(local22, false, true);
			}
			Static328.anInt6167 = -1;
			Static362.aClass230_45 = new Class230(8);
			Static51.method1405();
			Static328.anInt6167 = Static25.anInt735;
			Static220.method4021(false);
			Static402.method6385();
			Static173.method3206(Static328.anInt6167);
		}
		Static125.aBoolean217 = true;
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(BI)Z")
	public static boolean method3192(@OriginalArg(0) byte arg0) {
		@Pc(7) int local7 = arg0 & 0xFF;
		if (local7 == 0) {
			return false;
		} else {
			return local7 < 128 || local7 >= 160 || Static115.aCharArray5[local7 - 128] != '\u0000';
		}
	}
}
