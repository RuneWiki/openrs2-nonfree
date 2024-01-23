import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static162 {

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "I")
	public static int anInt3539;

	@OriginalMember(owner = "client!lm", name = "f", descriptor = "I")
	public static int anInt3543;

	@OriginalMember(owner = "client!lm", name = "b", descriptor = "[I")
	public static int[] anIntArray323 = new int[2];

	@OriginalMember(owner = "client!lm", name = "i", descriptor = "[[I")
	public static int[][] anIntArrayArray41 = new int[][] { { 0, 128, 0, 0, 128, 0, 128, 128 }, { 0, 128, 0, 0, 128, 0 }, { 0, 0, 64, 128, 0, 128 }, { 128, 128, 64, 128, 128, 0 }, { 0, 0, 128, 0, 128, 128, 64, 128 }, { 0, 128, 0, 0, 128, 0, 64, 128 }, { 64, 128, 0, 128, 0, 0, 64, 0 }, { 0, 0, 64, 0, 0, 64 }, { 128, 0, 128, 128, 0, 128, 0, 64, 64, 0 }, { 0, 128, 0, 0, 32, 64, 64, 96, 128, 128 }, { 0, 0, 128, 0, 128, 128, 64, 96, 32, 64 }, { 0, 0, 128, 0, 96, 32, 32, 32 } };

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(ZII)V")
	public static void method2565(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class1_Sub3_Sub22 local8 = Static271.method4108(5, arg0);
		local8.method4468();
		local8.anInt5852 = arg1;
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(B)V")
	public static void method2566() {
		Static103.method1724();
		Static141.method4430();
		Static222.method3477();
		Static220.method3473();
		Static245.method3802();
		Static35.method751();
		Static197.method3154();
		Static115.method1848();
		Static144.method2376();
		Static65.method1144();
		Static261.method3996();
		Static6.method214();
		Static105.method1740();
		Static190.method3081();
		Static215.method3443();
		Static147.method2380();
		Static159.method2555();
		Static303.method4619();
		Static78.method1324();
		Static303.method4616();
		Static101.method203();
		Static46.aClass89_7.method2273(5);
		Static203.aClass89_45.method2273(5);
		Static138.aClass89_18.method2273(5);
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(ILjava/lang/String;)V")
	public static void method2570(@OriginalArg(1) String arg0) {
		if (Static304.aClass132Array1 != null) {
			Static2.aClass1_Sub14_Sub1_1.method2252(165);
			Static2.aClass1_Sub14_Sub1_1.method2191(Static34.method690(arg0));
			Static2.aClass1_Sub14_Sub1_1.method2188(arg0);
		}
	}
}
