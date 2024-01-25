import java.awt.Point;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static411 {

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "(IFIIIIIII[F)V")
	public static void method5662(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) float[] arg8) {
		@Pc(9) int local9 = arg7 - arg5;
		@Pc(13) int local13 = arg2 - arg0;
		@Pc(17) int local17 = arg4 - arg6;
		@Pc(38) float local38 = arg8[2] * (float) local17 + (float) local9 * arg8[1] + (float) local13 * arg8[0];
		@Pc(59) float local59 = arg8[5] * (float) local17 + arg8[3] * (float) local13 + (float) local9 * arg8[4];
		@Pc(80) float local80 = arg8[7] * (float) local9 + (float) local13 * arg8[6] + arg8[8] * (float) local17;
		@Pc(95) float local95 = (float) Math.sqrt((double) (local59 * local59 + local38 * local38 + local80 * local80));
		@Pc(106) float local106 = (float) Math.atan2((double) local38, (double) local80) / 6.2831855F + 0.5F;
		@Pc(119) float local119 = (float) Math.asin((double) (local59 / local95)) / 3.1415927F + arg1 + 0.5F;
		@Pc(142) float local142;
		if (arg3 == 1) {
			local142 = local106;
			local106 = -local119;
			local119 = local142;
		} else if (arg3 == 2) {
			local119 = -local119;
			local106 = -local106;
		} else if (arg3 == 3) {
			local142 = local106;
			local106 = local119;
			local119 = -local142;
		}
		Static480.aFloat185 = local119;
		Static522.aFloat205 = local106;
	}

	@OriginalMember(owner = "client!pr", name = "b", descriptor = "(B)V")
	public static void method5663() {
		@Pc(12) Class1_Sub16 local12 = (Class1_Sub16) Static587.aClass353_67.method7677();
		@Pc(20) boolean local20 = Static93.aClass341_8 != null || Static229.anInt4305 > 0;
		if (local20) {
			Static142.anInt2691 = 1;
		}
		if (Static197.aBoolean491 && Static137.aClass295_1.method7719(81) && Static337.anInt8004 > 2) {
			if (local20) {
				Static129.aClass1_Sub51_3 = (Class1_Sub51) Static310.aClass353_32.aClass1_271.aClass1_286.aClass1_286;
			} else {
				Static157.method2280((Class1_Sub51) Static310.aClass353_32.aClass1_271.aClass1_286.aClass1_286, local12.method3650(), local12.method3652());
			}
		} else if (local20) {
			Static129.aClass1_Sub51_3 = (Class1_Sub51) Static310.aClass353_32.aClass1_271.aClass1_286;
		} else {
			Static157.method2280((Class1_Sub51) Static310.aClass353_32.aClass1_271.aClass1_286, local12.method3650(), local12.method3652());
		}
	}

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "(BI)V")
	public static void method5664(@OriginalArg(1) int arg0) {
		if (!Static348.aClass1_Sub30_Sub1_1.aBoolean389) {
			arg0 = -1;
		}
		if (Static344.anInt5738 == arg0) {
			return;
		}
		if (arg0 != -1) {
			@Pc(32) Class30 local32 = Static348.aClass141_2.method2983(arg0);
			@Pc(38) Class102 local38 = local32.method479();
			if (local38 == null) {
				arg0 = -1;
			} else {
				Static362.aClass109_5.method2183(new Point(local32.anInt537, local32.anInt538), local38.method2069(), Static499.aCanvas9, local38.method2082(), local38.method2068());
				Static344.anInt5738 = arg0;
			}
		}
		if (arg0 == -1 && Static344.anInt5738 != -1) {
			Static362.aClass109_5.method2183(new Point(), -1, Static499.aCanvas9, null, -1);
			Static344.anInt5738 = -1;
		}
	}

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "(III)I")
	public static int method5665(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return arg0 == 1 || arg0 == 3 ? Static445.anIntArray591[arg1 & 0x3] : Static505.anIntArray649[arg1 & 0x3];
	}
}
