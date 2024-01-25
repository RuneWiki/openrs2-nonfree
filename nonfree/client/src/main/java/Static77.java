import java.awt.Color;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static77 {

	@OriginalMember(owner = "client!ct", name = "d", descriptor = "F")
	public static float aFloat31;

	@OriginalMember(owner = "client!ct", name = "g", descriptor = "Lclient!q;")
	public static Class11 aClass11_1;

	@OriginalMember(owner = "client!ct", name = "c", descriptor = "[Ljava/awt/Color;")
	public static final Color[] aColorArray1 = new Color[] { new Color(16777215), new Color(16777215) };

	@OriginalMember(owner = "client!ct", name = "f", descriptor = "[F")
	public static final float[] aFloatArray13 = new float[4];

	@OriginalMember(owner = "client!ct", name = "a", descriptor = "([FII)[F")
	public static float[] method1597(@OriginalArg(0) float[] arg0, @OriginalArg(1) int arg1) {
		@Pc(6) float[] local6 = new float[arg1];
		Static601.method2817(arg0, 0, local6, 0, arg1);
		return local6;
	}

	@OriginalMember(owner = "client!ct", name = "a", descriptor = "(IJ)V")
	public static void method1598(@OriginalArg(1) long arg0) {
		@Pc(7) int local7 = Static28.anInt516;
		@Pc(14) int local14 = Static521.anInt8385;
		@Pc(22) int local22;
		@Pc(30) int local30;
		if (local7 != Static205.anInt3767) {
			local22 = local7 - Static205.anInt3767;
			local30 = (int) ((long) local22 * arg0 / 320L);
			if (local22 > 0) {
				if (local30 == 0) {
					local30 = 1;
				} else if (local30 > local22) {
					local30 = local22;
				}
			} else if (local30 == 0) {
				local30 = -1;
			} else if (local22 > local30) {
				local30 = local22;
			}
			Static205.anInt3767 += local30;
		}
		if (Static18.anInt315 != local14) {
			local22 = local14 - Static18.anInt315;
			local30 = (int) ((long) local22 * arg0 / 320L);
			if (local22 <= 0) {
				if (local30 == 0) {
					local30 = -1;
				} else if (local30 < local22) {
					local30 = local22;
				}
			} else if (local30 == 0) {
				local30 = 1;
			} else if (local30 > local22) {
				local30 = local22;
			}
			Static18.anInt315 += local30;
		}
		if (!Static405.aClass3_Sub3_Sub1_1.aBoolean577) {
			Static126.aFloat84 += Static63.aFloat30 * (float) arg0 / 40.0F * 8.0F;
			Static43.aFloat20 += (float) arg0 * Static311.aFloat117 / 40.0F * 8.0F;
		}
		Static336.method4787();
	}

	@OriginalMember(owner = "client!ct", name = "a", descriptor = "(BI)V")
	public static void method1599(@OriginalArg(1) int arg0) {
		@Pc(14) Class3_Sub7_Sub18 local14 = Static543.method7218(2, arg0);
		local14.method7329();
	}

	@OriginalMember(owner = "client!ct", name = "a", descriptor = "(IIIIII)V")
	public static void method1601(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		for (@Pc(8) int local8 = arg1; local8 <= arg3; local8++) {
			Static583.method7816(Static158.anIntArrayArray66[local8], arg4, arg2, arg0);
		}
	}
}
