import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static124 {

	@OriginalMember(owner = "client!et", name = "hb", descriptor = "Z")
	public static boolean aBoolean223;

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(III)Z")
	public static boolean method2508(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return Static480.method7351(arg0, arg1) || Static286.method8366(arg0, arg1);
	}

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(IIII)Lclient!cg;")
	public static Class3_Sub9 method2509(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) Class3_Sub9 local5 = null;
		if (arg1 == 0) {
			local5 = Static587.method8316(Static187.aClass40_2, Static513.aClass230_3);
		}
		if (arg1 == 1) {
			local5 = Static587.method8316(Static187.aClass40_2, Static502.aClass230_97);
		}
		local5.aClass3_Sub7_Sub1_1.method6494(Static212.aClass193_1.method6323(82) ? 1 : 0);
		local5.aClass3_Sub7_Sub1_1.method6527(Static563.anInt10006 + arg2);
		local5.aClass3_Sub7_Sub1_1.method6527(Static230.anInt4667 + arg0);
		Static394.aBoolean643 = false;
		Static567.anInt10049 = arg0;
		Static387.anInt7430 = arg2;
		method2510();
		return local5;
	}

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(I)V")
	public static void method2510() {
		@Pc(10) Class3_Sub4_Sub6 local10 = Static367.method6025(15, 0);
		local10.method1896();
	}
}
