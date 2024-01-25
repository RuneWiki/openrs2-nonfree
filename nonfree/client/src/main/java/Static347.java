import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static347 {

	@OriginalMember(owner = "client!lo", name = "D", descriptor = "Lclient!ca;")
	public static Class5_Sub7 aClass5_Sub7_3;

	@OriginalMember(owner = "client!lo", name = "k", descriptor = "Lclient!wia;")
	public static final Class387 aClass387_62 = new Class387(31, 3);

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(Lclient!ffa;B)V")
	public static void method5233(@OriginalArg(0) Class57_Sub2 arg0) {
		@Pc(12) byte[] local12;
		if (Static601.anObject17 == null) {
			@Pc(5) Class40_Sub2_Sub2 local5 = new Class40_Sub2_Sub2();
			local12 = local5.method8460();
			Static601.anObject17 = Static631.method8844(local12);
		}
		if (Static272.anObject6 == null) {
			@Pc(27) Class40_Sub1_Sub1 local27 = new Class40_Sub1_Sub1();
			local12 = local27.method3703();
			Static272.anObject6 = Static631.method8844(local12);
		}
		@Pc(42) Class346 local42 = arg0.aClass346_1;
		if (local42.method8625() && Static329.anObject9 == null) {
			local12 = Static148.method2089(4.0F, 0.5F, 16.0F, 4.0F, 0.6F, new Class186_Sub1(419684));
			Static329.anObject9 = Static631.method8844(local12);
		}
	}

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(Lclient!la;I)V")
	public static void method5235(@OriginalArg(0) Class208 arg0) {
		Static411.anInt7152 = 0;
		Static236.anInt3939 = 0;
		Static120.aClass98_2 = new Class98();
		Static350.aClass8_Sub8_Sub1_Sub1Array2 = new Class8_Sub8_Sub1_Sub1[1024];
		Static387.aClass8_Sub5Array1 = new Class8_Sub5[Static506.anIntArray617[Static554.anInt9335] + 1];
		Static474.anInt8030 = 0;
		Static544.anInt9264 = 0;
		Static426.method6323(arg0);
		Static56.method5907(arg0);
	}

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(IZIIIIII)V")
	public static void method5240(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg5 == arg3) {
			Static189.method2755(arg4, arg0, arg6, arg5, arg1, arg2);
		} else if (arg2 - arg5 >= Static642.anInt10429 && Static456.anInt7806 >= arg2 + arg5 && arg1 - arg3 >= Static456.anInt7815 && arg1 + arg3 <= Static604.anInt10083) {
			Static32.method553(arg1, arg6, arg0, arg4, arg5, arg3, arg2);
		} else {
			Static106.method1542(arg2, arg4, arg5, arg3, arg0, arg1, arg6);
		}
	}
}
