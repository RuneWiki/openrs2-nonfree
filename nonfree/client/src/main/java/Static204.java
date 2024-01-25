import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static204 {

	@OriginalMember(owner = "client!ln", name = "R", descriptor = "[I")
	public static int[] anIntArray452;

	@OriginalMember(owner = "client!ln", name = "jb", descriptor = "I")
	public static int anInt3770 = -1;

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(Z)Z")
	public static boolean method3410() {
		if (Static374.aBoolean489) {
			try {
				Static400.method4007(Static92.aClass53_2.anApplet1, "showVideoAd");
				return true;
			} catch (@Pc(14) Throwable local14) {
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(BIIIIIIII)V")
	public static void method3414(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (Static138.method2407(arg6)) {
			Static137.method2400(arg3, Static228.aClass155ArrayArray1[arg6], arg1, arg0, arg5, arg4, arg7, arg2, -1);
		} else if (arg4 == -1) {
			for (@Pc(24) int local24 = 0; local24 < 100; local24++) {
				Static370.aBooleanArray143[local24] = true;
			}
		} else {
			Static370.aBooleanArray143[arg4] = true;
		}
	}

	@OriginalMember(owner = "client!ln", name = "b", descriptor = "(BZ)V")
	public static void method3427(@OriginalArg(1) boolean arg0) {
		if (arg0) {
			if (Static226.anInt4223 != -1) {
				Static117.method2166(Static226.anInt4223);
			}
			for (@Pc(18) Class2_Sub41 local18 = (Class2_Sub41) Static362.aClass214_32.method5060(); local18 != null; local18 = (Class2_Sub41) Static362.aClass214_32.method5064()) {
				if (!local18.method5744()) {
					local18 = (Class2_Sub41) Static362.aClass214_32.method5060();
					if (local18 == null) {
						break;
					}
				}
				Static303.method4757(local18, true, false);
			}
			Static226.anInt4223 = -1;
			Static362.aClass214_32 = new Class214(8);
			Static374.method5600();
			Static226.anInt4223 = Static197.anInt3622;
			Static260.method4054(false);
			Static303.method4753();
			Static157.method2606(Static226.anInt4223);
		}
		Static250.method3991();
		Static332.anInt5811 = -1;
		Static344.method5463(Static29.anInt669);
		Static267.aClass12_Sub1_Sub2_Sub2_1 = new Class12_Sub1_Sub2_Sub2();
		Static267.aClass12_Sub1_Sub2_Sub2_1.anInt6328 = 6656;
		Static267.aClass12_Sub1_Sub2_Sub2_1.anIntArray659[0] = 52;
		Static267.aClass12_Sub1_Sub2_Sub2_1.anInt6317 = 6656;
		Static267.aClass12_Sub1_Sub2_Sub2_1.anIntArray658[0] = 52;
		Static22.anInt547 = 0;
		Static160.anInt2915 = 0;
		if (Static283.anInt5017 == 2) {
			Static22.anInt547 = Static250.anInt4500 << 7;
			Static160.anInt2915 = Static239.anInt4366 << 7;
		} else {
			Static144.method2461();
		}
		Static150.method2531();
		if (Static160.anInt2915 == 0 || Static22.anInt547 == 0) {
			Static345.method5253(10);
		} else {
			Static75.method1342();
			Static345.method5253(28);
		}
	}
}
