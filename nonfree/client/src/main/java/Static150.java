import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static150 {

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "Lclient!ra;")
	public static Class72 aClass72_8;

	@OriginalMember(owner = "client!qh", name = "c", descriptor = "[Lclient!ob;")
	public static Class60[] aClass60Array22;

	@OriginalMember(owner = "client!qh", name = "e", descriptor = "[I")
	public static int[] anIntArray425;

	@OriginalMember(owner = "client!qh", name = "d", descriptor = "Lclient!ob;")
	private static final Class60 aClass60_1050 = Static158.method3034("flash3:");

	@OriginalMember(owner = "client!qh", name = "i", descriptor = "Lclient!ob;")
	public static final Class60 aClass60_1051 = aClass60_1050;

	@OriginalMember(owner = "client!qh", name = "j", descriptor = "Lclient!ob;")
	public static Class60 aClass60_1052 = aClass60_1050;

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(II)I")
	public static int method2965(@OriginalArg(0) int arg0) {
		@Pc(0) int local0 = arg0 - 1;
		@Pc(6) int local6 = local0 | local0 >>> 1;
		@Pc(12) int local12 = local6 | local6 >>> 2;
		@Pc(27) int local27 = local12 | local12 >>> 4;
		@Pc(33) int local33 = local27 | local27 >>> 8;
		@Pc(39) int local39 = local33 | local33 >>> 16;
		return local39 + 1;
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(I)V")
	public static void method2966() {
		if (Static8.aBoolean3 && Static62.anInt1923 != Static53.anInt1670) {
			Static111.method2461(Static62.anInt1923, Static160.anInt1995, Static103.aClass2_Sub1_Sub1_Sub3_Sub1_1.anIntArray369[0], Static103.aClass2_Sub1_Sub1_Sub3_Sub1_1.anIntArray371[0], Static30.anInt898);
		} else if (Static62.anInt1923 != Static160.anInt1996) {
			Static160.anInt1996 = Static62.anInt1923;
			Static106.method2397(Static62.anInt1923);
		}
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(Lclient!sg;B)V")
	public static void method2967(@OriginalArg(0) Class2_Sub7 arg0) {
		arg0.aBoolean171 = false;
		if (arg0.aClass2_Sub16_5 != null) {
			arg0.aClass2_Sub16_5.anInt3444 = 0;
		}
		for (@Pc(28) Class2_Sub7 local28 = arg0.method3313(); local28 != null; local28 = arg0.method3314()) {
			method2967(local28);
		}
	}

	@OriginalMember(owner = "client!qh", name = "b", descriptor = "(II)I")
	public static int method2968(@OriginalArg(0) int arg0) {
		return arg0 >>> 8;
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(IIIIII)V")
	public static void method2970(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		Static94.aClass2_Sub1_Sub7_Sub2Array8[0].method1202(arg3, arg1);
		Static94.aClass2_Sub1_Sub7_Sub2Array8[1].method1202(arg3, arg0 + arg1 - 16);
		@Pc(27) int local27 = (arg0 - 32) * arg0 / arg4;
		if (local27 < 8) {
			local27 = 8;
		}
		@Pc(45) int local45 = (arg0 - local27 - 32) * arg2 / (arg4 - arg0);
		Static133.method2120(arg3, arg1 + 16, 16, arg0 - 32, Static194.anInt4622);
		Static133.method2120(arg3, arg1 + local45 + 16, 16, local27, Static114.anInt3178);
		Static133.method2112(arg3, arg1 + local45 + 16, local27, Static117.anInt941);
		Static133.method2112(arg3 + 1, arg1 + 16 + local45, local27, Static117.anInt941);
		Static133.method2122(arg3, arg1 + local45 + 16, 16, Static117.anInt941);
		Static133.method2122(arg3, local45 + arg1 + 17, 16, Static117.anInt941);
		Static133.method2112(arg3 + 15, local45 + 16 + arg1, local27, Static116.anInt3217);
		Static133.method2112(arg3 + 14, arg1 + 17 - -local45, local27 - 1, Static116.anInt3217);
		Static133.method2122(arg3, local27 + local45 + arg1 + 15, 16, Static116.anInt3217);
		Static133.method2122(arg3 + 1, local45 + 14 + arg1 + local27, 15, Static116.anInt3217);
	}
}
