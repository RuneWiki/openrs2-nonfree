import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static168 {

	@OriginalMember(owner = "client!ic", name = "n", descriptor = "Lclient!ii;")
	public static Class115 aClass115_2;

	@OriginalMember(owner = "client!ic", name = "f", descriptor = "Z")
	public static boolean aBoolean183 = false;

	@OriginalMember(owner = "client!ic", name = "o", descriptor = "[I")
	public static final int[] anIntArray265 = new int[8];

	@OriginalMember(owner = "client!ic", name = "p", descriptor = "Lclient!ss;")
	public static Class219 aClass219_10 = null;

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(IFFF)F")
	public static float method2674(@OriginalArg(1) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2) {
		return arg2 + (arg0 - arg2) * arg1;
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(IIII)I")
	public static int method2675(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = arg0 & 0x3;
		if (local7 == 0) {
			return arg2;
		} else if (local7 == 1) {
			return 1023 - arg1;
		} else if (local7 == 2) {
			return 1023 - arg2;
		} else {
			return arg1;
		}
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(B)V")
	public static void method2676() {
		try {
			if (Static144.anInt2452 == 1) {
				@Pc(16) int local16 = Static327.aClass1_Sub7_Sub3_3.method5000();
				if (local16 > 0 && Static327.aClass1_Sub7_Sub3_3.method4982()) {
					local16 -= Static363.anInt6199;
					if (local16 < 0) {
						local16 = 0;
					}
					Static327.aClass1_Sub7_Sub3_3.method4997(local16);
				} else {
					Static327.aClass1_Sub7_Sub3_3.method5007();
					Static327.aClass1_Sub7_Sub3_3.method4989();
					Static111.aClass1_Sub41_1 = null;
					if (Static32.aClass250_7 == null) {
						Static144.anInt2452 = 0;
					} else {
						Static144.anInt2452 = 2;
					}
					Static178.aClass227_1 = null;
				}
			}
		} catch (@Pc(55) Exception local55) {
			local55.printStackTrace();
			Static327.aClass1_Sub7_Sub3_3.method5007();
			Static32.aClass250_7 = null;
			Static144.anInt2452 = 0;
			Static178.aClass227_1 = null;
			Static111.aClass1_Sub41_1 = null;
		}
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(IIB)V")
	public static void method2678(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class1_Sub2_Sub1 local8 = Static258.method5559(arg0, 14);
		local8.method202();
		local8.anInt214 = arg1;
	}
}
