import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static394 {

	@OriginalMember(owner = "client!mi", name = "l", descriptor = "[I")
	public static int[] anIntArray381;

	@OriginalMember(owner = "client!mi", name = "k", descriptor = "I")
	public static int anInt7067;

	@OriginalMember(owner = "client!mi", name = "m", descriptor = "I")
	public static int anInt7065 = 1;

	@OriginalMember(owner = "client!mi", name = "i", descriptor = "Lclient!si;")
	public static final Class338 aClass338_38 = new Class338(20);

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(BLclient!av;)V")
	public static void method5925(@OriginalArg(1) Class20 arg0) {
		if (!Static212.aBoolean297) {
			return;
		}
		if (arg0.anObjectArray17 != null) {
			@Pc(15) Class20 local15 = Static244.method3731(Static397.anInt7112, Static198.anInt3491);
			if (local15 != null) {
				@Pc(21) Class3_Sub7 local21 = new Class3_Sub7();
				local21.aClass20_2 = arg0;
				local21.anObjectArray1 = arg0.anObjectArray17;
				local21.aClass20_1 = local15;
				Static185.method2811(local21);
			}
		}
		@Pc(43) Class3_Sub48 local43 = Static89.method1200(Static558.aClass286_97, Static532.aClass400_3.aClass399_2);
		local43.aClass3_Sub28_Sub2_1.method5273(Static397.anInt7112);
		local43.aClass3_Sub28_Sub2_1.method5273(arg0.anInt600);
		local43.aClass3_Sub28_Sub2_1.method5292(arg0.anInt583);
		local43.aClass3_Sub28_Sub2_1.method5282(Static198.anInt3491);
		local43.aClass3_Sub28_Sub2_1.method5313(arg0.anInt595);
		local43.aClass3_Sub28_Sub2_1.method5270(Static575.anInt9446);
		Static532.aClass400_3.method9223(local43);
	}
}
