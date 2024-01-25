import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static400 {

	@OriginalMember(owner = "client!oga", name = "a", descriptor = "Lclient!sk;")
	public static Class39 aClass39_9;

	@OriginalMember(owner = "client!oga", name = "d", descriptor = "Lclient!la;")
	public static Class196 aClass196_81;

	@OriginalMember(owner = "client!oga", name = "h", descriptor = "[I")
	public static final int[] anIntArray455 = new int[] { 28, 35, 40, 44 };

	@OriginalMember(owner = "client!oga", name = "b", descriptor = "(B)V")
	public static void method6444() {
		try {
			@Pc(20) int local20;
			if (Static324.anInt8117 == 1) {
				local20 = Static594.aClass3_Sub7_Sub2_3.method2449();
				if (local20 > 0 && Static594.aClass3_Sub7_Sub2_3.method2445()) {
					local20 -= Static406.anInt7454;
					if (local20 < 0) {
						local20 = 0;
					}
					Static594.aClass3_Sub7_Sub2_3.method2441(local20);
					return;
				}
				Static594.aClass3_Sub7_Sub2_3.method2461();
				Static594.aClass3_Sub7_Sub2_3.method2448();
				Static131.aClass3_Sub39_2 = null;
				Static523.aClass52_1 = null;
				if (Static402.aClass196_83 == null) {
					Static324.anInt8117 = 0;
				} else {
					Static324.anInt8117 = 2;
				}
			}
			if (Static324.anInt8117 == 3) {
				local20 = Static594.aClass3_Sub7_Sub2_3.method2449();
				if (Static141.anInt2838 > local20 && Static594.aClass3_Sub7_Sub2_3.method2445()) {
					local20 += Static618.anInt9981;
					if (local20 > Static141.anInt2838) {
						local20 = Static141.anInt2838;
					}
					Static594.aClass3_Sub7_Sub2_3.method2441(local20);
				} else {
					Static324.anInt8117 = 0;
					Static618.anInt9981 = 0;
				}
			}
		} catch (@Pc(101) Exception local101) {
			local101.printStackTrace();
			Static594.aClass3_Sub7_Sub2_3.method2461();
			Static523.aClass52_1 = null;
			Static236.aClass3_Sub7_Sub2_1 = null;
			Static402.aClass196_83 = null;
			Static324.anInt8117 = 0;
			Static131.aClass3_Sub39_2 = null;
		}
	}

	@OriginalMember(owner = "client!oga", name = "b", descriptor = "(II)V")
	public static void method6445(@OriginalArg(1) int arg0) {
		@Pc(8) Class3_Sub4_Sub12 local8 = Static556.method8018(14, arg0);
		local8.method3607();
	}
}
