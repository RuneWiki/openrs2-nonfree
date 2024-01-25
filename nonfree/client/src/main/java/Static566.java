import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static566 {

	@OriginalMember(owner = "client!tca", name = "h", descriptor = "Lclient!gj;")
	public static Class143 aClass143_72;

	@OriginalMember(owner = "client!tca", name = "i", descriptor = "I")
	public static int anInt5236;

	@OriginalMember(owner = "client!tca", name = "b", descriptor = "(I)V")
	public static void method4437() {
		Static659.method8585();
		@Pc(17) int local17 = Static227.aClass3_Sub15_11.aClass17_Sub16_1.method5569();
		if (local17 == 2) {
			Static435.method6376(Static654.anInt10064, Static582.aClass16_12, Static483.anInt8181);
		} else if (local17 == 3) {
			Static286.method4506(Static633.anInt9772, Static582.aClass16_12, Static483.anInt8181, Static654.anInt10064, Static675.anInt10315);
		}
		if (Static227.aClass3_Sub15_11.aClass17_Sub16_1.method5568()) {
			Static359.method5385(Static469.aCanvas11);
		}
		if (Static582.aClass16_12 != null) {
			Static337.method5137();
		}
		Static148.aBoolean221 = Static227.aClass3_Sub15_11.aClass17_Sub16_1.method5569() != 0;
		Static649.aBoolean735 = Static227.aClass3_Sub15_11.aClass17_Sub16_1.method5568();
	}

	@OriginalMember(owner = "client!tca", name = "c", descriptor = "(I)V")
	public static void method4438() {
		try {
			@Pc(10) int local10;
			if (Static54.anInt1418 == 1) {
				local10 = Static402.aClass3_Sub9_Sub5_2.method6735();
				if (local10 > 0 && Static402.aClass3_Sub9_Sub5_2.method6711()) {
					local10 -= Static279.anInt5228;
					if (local10 < 0) {
						local10 = 0;
					}
					Static402.aClass3_Sub9_Sub5_2.method6705(local10);
					return;
				}
				Static402.aClass3_Sub9_Sub5_2.method6732();
				Static402.aClass3_Sub9_Sub5_2.method6703();
				Static417.aClass91_1 = null;
				if (Static548.aClass143_125 == null) {
					Static54.anInt1418 = 0;
				} else {
					Static54.anInt1418 = 2;
				}
				Static261.aClass3_Sub48_1 = null;
			}
			if (Static54.anInt1418 == 3) {
				local10 = Static402.aClass3_Sub9_Sub5_2.method6735();
				if (local10 < Static231.anInt4426 && Static402.aClass3_Sub9_Sub5_2.method6711()) {
					local10 += Static618.anInt9578;
					if (Static231.anInt4426 < local10) {
						local10 = Static231.anInt4426;
					}
					Static402.aClass3_Sub9_Sub5_2.method6705(local10);
					return;
				}
				Static54.anInt1418 = 0;
				Static618.anInt9578 = 0;
			}
		} catch (@Pc(84) Exception local84) {
			local84.printStackTrace();
			Static402.aClass3_Sub9_Sub5_2.method6732();
			Static417.aClass91_1 = null;
			Static261.aClass3_Sub48_1 = null;
			Static54.anInt1418 = 0;
			Static424.aClass3_Sub9_Sub5_3 = null;
			Static548.aClass143_125 = null;
		}
	}

	@OriginalMember(owner = "client!tca", name = "a", descriptor = "(IIZII)V")
	public static void method4440(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(5) int local5 = Static215.anInt6265;
		if (local5 == 0) {
			return;
		}
		if (local5 == 1) {
			Static367.anInt6503 = arg0;
			Static269.anInt5052 = arg1;
			Static215.anInt6265 = 2;
			Static628.anInt9742 = arg2;
			Static312.anInt5779 = arg3;
		} else if (local5 == 2) {
			if (arg2 > Static628.anInt9742) {
				Static628.anInt9742 = arg2;
			}
			if (Static367.anInt6503 > arg0) {
				Static367.anInt6503 = arg0;
			}
			if (arg1 > Static269.anInt5052) {
				Static269.anInt5052 = arg1;
			}
			if (Static312.anInt5779 > arg3) {
				Static312.anInt5779 = arg3;
			}
		}
	}
}
