import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static333 {

	@OriginalMember(owner = "client!nn", name = "b", descriptor = "Lclient!kea;")
	public static Class161 aClass161_67;

	@OriginalMember(owner = "client!nn", name = "c", descriptor = "[I")
	public static final int[] anIntArray549 = new int[50];

	@OriginalMember(owner = "client!nn", name = "a", descriptor = "(II)V")
	public static void method5283(@OriginalArg(0) int arg0) {
		if (arg0 == Static512.anInt8932) {
			return;
		}
		if (Static512.anInt8932 == 0) {
			Static274.method4752();
		}
		if (arg0 == 12) {
			if (Static482.aString81 == null) {
				Static302.method4988(Static36.anInt940, Static179.aString36, Static494.aString82);
			} else {
				Static324.method5199(Static36.anInt940);
			}
		}
		if (arg0 != 12 && Static509.aClass41_2 != null) {
			Static509.aClass41_2.method1066();
			Static509.aClass41_2 = null;
		}
		if (arg0 == 2) {
			Static217.method3982(Static422.anInt8667 != Static194.anInt4422);
		}
		if (arg0 == 6) {
			Static299.method4969(Static524.anInt9120 != Static422.anInt8667);
		}
		if (arg0 == 4) {
			if (Static482.aString81 == null) {
				Static424.method6498(Static179.aString36, Static494.aString82);
			} else {
				Static318.method4377();
			}
		} else if (arg0 == 5) {
			if (Static482.aString81 == null) {
				Static302.method4988(Static36.anInt940, Static179.aString36, Static494.aString82);
			} else {
				Static324.method5199(Static36.anInt940);
			}
		} else if (arg0 == 8) {
			if (Static482.aString81 == null) {
				Static302.method4988(Static36.anInt940, Static179.aString36, Static494.aString82);
			} else {
				Static324.method5199(Static36.anInt940);
			}
		} else if (arg0 == 11) {
			if (Static482.aString81 == null) {
				Static424.method6498(Static179.aString36, Static494.aString82);
			} else {
				Static318.method4377();
			}
		}
		if (Static457.method6861(Static512.anInt8932)) {
			Static492.aClass161_109.anInt5061 = 2;
			Static197.aClass161_44.anInt5061 = 2;
			Static211.aClass161_49.anInt5061 = 2;
			Static205.aClass161_46.anInt5061 = 2;
			Static350.aClass161_75.anInt5061 = 2;
			Static326.aClass161_66.anInt5061 = 2;
			Static350.aClass161_76.anInt5061 = 2;
		}
		if (Static457.method6861(arg0)) {
			Static366.anInt6835 = 0;
			Static120.anInt2575 = 1;
			Static225.anInt4875 = 0;
			Static26.anInt760 = 0;
			Static92.anInt1968 = 1;
			Static308.method5029(true);
			Static492.aClass161_109.anInt5061 = 1;
			Static197.aClass161_44.anInt5061 = 1;
			Static211.aClass161_49.anInt5061 = 1;
			Static205.aClass161_46.anInt5061 = 1;
			Static350.aClass161_75.anInt5061 = 1;
			Static326.aClass161_66.anInt5061 = 1;
			Static350.aClass161_76.anInt5061 = 1;
		}
		if (arg0 == 10 || arg0 == 2) {
			Static36.method875();
		}
		if (arg0 == 1) {
			Static195.method3708(Static19.aClass161_7, Static121.aClass5_7);
		} else {
			Static397.method6050();
		}
		@Pc(240) boolean local240 = arg0 == 1 || Static316.method5110(arg0) || Static173.method3293(arg0);
		@Pc(255) boolean local255 = Static512.anInt8932 == 1 || Static316.method5110(Static512.anInt8932) || Static173.method3293(Static512.anInt8932);
		if (local240 != local255) {
			if (local240) {
				Static506.anInt8842 = Static311.anInt6054;
				if (Static7.aClass3_Sub15_Sub1_1.anInt8357 == 0) {
					Static61.method1235();
				} else {
					Static51.method1081(Static7.aClass3_Sub15_Sub1_1.anInt8357, Static311.anInt6054, Static460.aClass161_42);
				}
				Static349.aClass153_2.method4115(false);
			} else {
				Static61.method1235();
				Static349.aClass153_2.method4115(true);
			}
		}
		if (Static457.method6861(arg0) || arg0 == 12) {
			Static121.aClass5_7.method7428();
		}
		Static512.anInt8932 = arg0;
	}
}
