import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static101 {

	@OriginalMember(owner = "client!di", name = "n", descriptor = "I")
	public static int anInt2845;

	@OriginalMember(owner = "client!di", name = "g", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray15 = new String[200];

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(Ljava/lang/String;IBILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V")
	public static void method2658(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) String arg3, @OriginalArg(5) String arg4, @OriginalArg(6) String arg5) {
		Static550.method8230(arg0, arg3, -1, arg4, null, arg1, arg2, arg5);
	}

	@OriginalMember(owner = "client!di", name = "e", descriptor = "(I)V")
	public static void method2659() {
		@Pc(12) Class2_Sub52 local12 = Static130.method3019(Static487.aClass94_98, Static361.aClass183_1);
		local12.aClass2_Sub11_Sub2_7.method8374(Static89.method2478());
		local12.aClass2_Sub11_Sub2_7.method8333(Static81.anInt2497);
		local12.aClass2_Sub11_Sub2_7.method8333(Static423.anInt7984);
		local12.aClass2_Sub11_Sub2_7.method8374(Static74.aClass2_Sub13_5.aClass14_Sub27_2.method8731());
		Static96.method2563(local12);
	}

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(B)V")
	public static void method2660() {
		Static266.method4907();
		Static65.aBoolean754 = false;
		Static18.method369(Static274.anInt5852, Static278.anInt5905, Static332.anInt6717, Static589.anInt10431);
	}
}
