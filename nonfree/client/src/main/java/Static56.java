import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static56 {

	@OriginalMember(owner = "client!cca", name = "i", descriptor = "I")
	public static int anInt1418;

	@OriginalMember(owner = "client!cca", name = "m", descriptor = "Lclient!ra;")
	public static Class80 aClass80_2;

	@OriginalMember(owner = "client!cca", name = "b", descriptor = "I")
	public static final int anInt1412 = 0;

	@OriginalMember(owner = "client!cca", name = "k", descriptor = "Lclient!ml;")
	public static final Class202 aClass202_4 = new Class202(11, 19);

	@OriginalMember(owner = "client!cca", name = "l", descriptor = "S")
	public static short aShort33 = 1;

	@OriginalMember(owner = "client!cca", name = "a", descriptor = "(Lclient!vs;IIII)V")
	public static void method1419(@OriginalArg(0) Class253 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg1 == 1 && arg3 > 0) {
			Static102.method2108(arg0, arg2, arg3 - 1, arg4);
		} else if (arg1 == 4 && arg3 <= Static537.anInt9566) {
			Static102.method2108(arg0, arg2, arg3 + 1, arg4);
		} else if (arg1 == 8 && arg4 > 0) {
			Static102.method2108(arg0, arg2, arg3, arg4 - 1);
		} else if (arg1 == 2 && arg4 <= Static509.anInt9164) {
			Static102.method2108(arg0, arg2, arg3, arg4 + 1);
		} else if (arg1 == 16 && arg3 > 0 && arg4 <= Static509.anInt9164) {
			Static102.method2108(arg0, arg2, arg3 - 1, arg4 + 1);
		} else if (arg1 == 32 && arg3 <= Static537.anInt9566 && arg4 <= Static509.anInt9164) {
			Static102.method2108(arg0, arg2, arg3 + 1, arg4 + 1);
		} else if (arg1 == 128 && arg3 > 0 && arg4 > 0) {
			Static102.method2108(arg0, arg2, arg3 - 1, arg4 - 1);
		} else if (arg1 == 64 && arg3 <= Static537.anInt9566 && arg4 > 0) {
			Static102.method2108(arg0, arg2, arg3 + 1, arg4 - 1);
		} else {
			throw new RuntimeException("Unsupported wall shape " + arg1 + " in world2.setclosestlights_wall");
		}
	}

	@OriginalMember(owner = "client!cca", name = "a", descriptor = "(IJ)V")
	public static void method1420(@OriginalArg(1) long arg0) {
		@Pc(7) int local7 = Static247.anInt5092;
		@Pc(9) int local9 = Static357.anInt6674;
		@Pc(17) int local17;
		@Pc(25) int local25;
		if (local7 != Static401.anInt7550) {
			local17 = local7 - Static401.anInt7550;
			local25 = (int) ((long) local17 * arg0 / 320L);
			if (local17 > 0) {
				if (local25 == 0) {
					local25 = 1;
				} else if (local25 > local17) {
					local25 = local17;
				}
			} else if (local25 == 0) {
				local25 = -1;
			} else if (local25 < local17) {
				local25 = local17;
			}
			Static401.anInt7550 += local25;
		}
		if (!Static208.aClass12_Sub10_Sub1_1.aBoolean184) {
			Static500.aFloat186 += (float) arg0 * Static516.aFloat188 / 40.0F * 8.0F;
			Static49.aFloat10 += Static360.aFloat146 * (float) arg0 / 40.0F * 8.0F;
		}
		if (local9 != Static112.anInt2594) {
			local17 = local9 - Static112.anInt2594;
			local25 = (int) (arg0 * (long) local17 / 320L);
			if (local17 > 0) {
				if (local25 == 0) {
					local25 = 1;
				} else if (local25 > local17) {
					local25 = local17;
				}
			} else if (local25 == 0) {
				local25 = -1;
			} else if (local17 > local25) {
				local25 = local17;
			}
			Static112.anInt2594 += local25;
		}
		Static184.method3617();
	}

	@OriginalMember(owner = "client!cca", name = "a", descriptor = "(Ljava/lang/String;II)V")
	public static void method1423(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class12_Sub4_Sub1 local8 = Static389.method6156(2, arg1);
		local8.method820();
		local8.aString9 = arg0;
	}
}
