import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static439 {

	@OriginalMember(owner = "client!paa", name = "B", descriptor = "Lclient!vi;")
	public static Class372 aClass372_1;

	@OriginalMember(owner = "client!paa", name = "r", descriptor = "Lclient!qk;")
	public static final Class289 aClass289_106 = new Class289(57, 8);

	@OriginalMember(owner = "client!paa", name = "x", descriptor = "[I")
	public static final int[] anIntArray496 = new int[25];

	@OriginalMember(owner = "client!paa", name = "a", descriptor = "(I)V")
	public static void method6445() {
		try {
			@Pc(12) int local12;
			if (Static338.anInt5833 == 1) {
				local12 = Static544.aClass6_Sub8_Sub4_10.method5084();
				if (local12 > 0 && Static544.aClass6_Sub8_Sub4_10.method5075()) {
					local12 -= Static335.anInt5754;
					if (local12 < 0) {
						local12 = 0;
					}
					Static544.aClass6_Sub8_Sub4_10.method5066(local12);
					return;
				}
				Static544.aClass6_Sub8_Sub4_10.method5098();
				Static544.aClass6_Sub8_Sub4_10.method5093();
				if (Static589.aClass8_129 == null) {
					Static338.anInt5833 = 0;
				} else {
					Static338.anInt5833 = 2;
				}
				Static622.aClass158_1 = null;
				Static488.aClass6_Sub53_2 = null;
			}
			if (Static338.anInt5833 == 3) {
				local12 = Static544.aClass6_Sub8_Sub4_10.method5084();
				if (Static382.anInt6400 > local12 && Static544.aClass6_Sub8_Sub4_10.method5075()) {
					local12 += Static557.anInt9343;
					if (local12 > Static382.anInt6400) {
						local12 = Static382.anInt6400;
					}
					Static544.aClass6_Sub8_Sub4_10.method5066(local12);
					return;
				}
				Static557.anInt9343 = 0;
				Static338.anInt5833 = 0;
			}
		} catch (@Pc(98) Exception local98) {
			local98.printStackTrace();
			Static544.aClass6_Sub8_Sub4_10.method5098();
			Static589.aClass8_129 = null;
			Static338.anInt5833 = 0;
			Static622.aClass158_1 = null;
			Static488.aClass6_Sub53_2 = null;
			Static471.aClass6_Sub8_Sub4_9 = null;
		}
	}

	@OriginalMember(owner = "client!paa", name = "a", descriptor = "(IIIIII)V")
	public static void method6446(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg0 == arg3) {
			Static596.method8224(arg2, arg3, arg4, arg1);
		} else if (arg1 - arg3 >= Static502.anInt8456 && arg3 + arg1 <= Static153.anInt2554 && Static55.anInt4238 <= arg2 - arg0 && arg2 + arg0 <= Static292.anInt4921) {
			Static613.method8477(arg2, arg1, arg3, arg0, arg4);
		} else {
			Static264.method3895(arg0, arg4, arg2, arg1, arg3);
		}
	}
}
