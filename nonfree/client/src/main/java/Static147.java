import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static147 {

	@OriginalMember(owner = "client!fe", name = "y", descriptor = "F")
	public static float aFloat105;

	@OriginalMember(owner = "client!fe", name = "c", descriptor = "Lclient!mu;")
	public static final Class215 aClass215_63 = new Class215(22, 0);

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(ILclient!ha;IIZI)V")
	public static void method3253(@OriginalArg(0) int arg0, @OriginalArg(1) Class20 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		arg1.KA(arg2, arg4, arg3 + arg2, arg4 + arg0);
		arg1.method7278(arg3, arg2, arg4, arg0, -16777216);
		if (Static124.anInt11089 < 100) {
			return;
		}
		@Pc(33) float local33 = (float) Static303.anInt111 / (float) Static303.anInt106;
		@Pc(35) int local35 = arg3;
		@Pc(37) int local37 = arg0;
		if (local33 < 1.0F) {
			local37 = (int) ((float) arg3 * local33);
		} else {
			local35 = (int) ((float) arg0 / local33);
		}
		@Pc(64) int local64 = arg4 + (arg0 - local37) / 2;
		@Pc(73) int local73 = arg2 + (arg3 - local35) / 2;
		if (Static285.aClass46_16 == null || arg3 != Static285.aClass46_16.method6210() || arg0 != Static285.aClass46_16.method6208()) {
			Static303.method148(Static303.anInt110, Static303.anInt111 + Static303.anInt108, Static303.anInt110 - -Static303.anInt106, Static303.anInt108, local73, local64, local35 + local73, local37 + local64);
			Static303.method145(arg1);
			Static285.aClass46_16 = arg1.method7286(local73, local64, local35, local37, false);
		}
		Static285.aClass46_16.method6213(local73, local64);
		@Pc(125) int local125 = Static221.anInt4940 * local35 / Static303.anInt106;
		@Pc(131) int local131 = local37 * Static449.anInt8346 / Static303.anInt111;
		@Pc(140) int local140 = local73 + local35 * Static158.anInt3976 / Static303.anInt106;
		@Pc(164) int local164 = local64 + local37 - local131 - local37 * Static528.anInt9612 / Static303.anInt111;
		@Pc(166) int local166 = -1996554240;
		if (Static557.aClass316_6 == Static423.aClass316_4) {
			local166 = -1996488705;
		}
		arg1.aa(local140, local164, local125, local131, local166, 1);
		arg1.method7231(local140, local164, local125, local131, local166, 0);
		if (Static302.anInt6299 <= 0) {
			return;
		}
		@Pc(196) int local196;
		if (Static422.anInt7962 <= 50) {
			local196 = Static422.anInt7962 * 5;
		} else {
			local196 = 500 - Static422.anInt7962 * 5;
		}
		for (@Pc(210) Class2_Sub32 local210 = (Class2_Sub32) Static303.aClass341_2.method8524(); local210 != null; local210 = (Class2_Sub32) Static303.aClass341_2.method8519()) {
			@Pc(218) Class153 local218 = Static303.aClass248_2.method6584(local210.anInt6568);
			if (Static273.method5008(local218)) {
				@Pc(235) int local235;
				@Pc(246) int local246;
				if (Static604.anInt10636 == local210.anInt6568) {
					local235 = local73 + local35 * local210.anInt6572 / Static303.anInt106;
					local246 = (Static303.anInt111 - local210.anInt6571) * local37 / Static303.anInt111 + local64;
					arg1.method7278(4, local235 - 2, local246 + -2, 4, local196 << 24 | 0xFFFF00);
				} else if (Static232.anInt5106 != -1 && Static232.anInt5106 == local218.anInt5239) {
					local235 = local73 + local210.anInt6572 * local35 / Static303.anInt106;
					local246 = local64 + local37 * (Static303.anInt111 - local210.anInt6571) / Static303.anInt111;
					arg1.method7278(4, local235 - 2, local246 + -2, 4, local196 << 24 | 0xFFFF00);
				}
			}
		}
	}

	@OriginalMember(owner = "client!fe", name = "c", descriptor = "(IIII)V")
	public static void method3257(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(35) String local35 = "tele " + arg1 + "," + (arg2 >> 6) + "," + (arg0 >> 6) + "," + (arg2 & 0x3F) + "," + (arg0 & 0x3F);
		System.out.println(local35);
		Static313.method5481(local35, true, false);
	}
}
