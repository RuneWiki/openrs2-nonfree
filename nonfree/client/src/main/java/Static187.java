import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static187 {

	@OriginalMember(owner = "client!vd", name = "h", descriptor = "I")
	public static int anInt4630;

	@OriginalMember(owner = "client!vd", name = "f", descriptor = "Lclient!ob;")
	public static final Class60 aClass60_1323 = Static158.method3034("(Udns");

	@OriginalMember(owner = "client!vd", name = "g", descriptor = "Lclient!ob;")
	public static final Class60 aClass60_1324 = Static158.method3034("nav");

	@OriginalMember(owner = "client!vd", name = "k", descriptor = "I")
	public static int anInt4632 = 0;

	@OriginalMember(owner = "client!vd", name = "m", descriptor = "[I")
	public static final int[] anIntArray505 = new int[128];

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(IB)Lclient!cc;")
	public static Class2_Sub1_Sub4 method3552(@OriginalArg(0) int arg0) {
		@Pc(18) Class2_Sub1_Sub4 local18 = (Class2_Sub1_Sub4) Static156.aClass89_57.method3437((long) arg0);
		if (local18 != null) {
			return local18;
		}
		@Pc(28) byte[] local28 = Static111.aClass13_25.method521(arg0, 5);
		local18 = new Class2_Sub1_Sub4();
		if (local28 != null) {
			local18.method615(new Class2_Sub3(local28));
		}
		Static156.aClass89_57.method3432(local18, (long) arg0);
		return local18;
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(IIIIII)V")
	public static void method3553(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(11) int local11 = Static96.method2447(Static36.anInt1076, Static117.anInt951, arg3);
		@Pc(17) int local17 = Static96.method2447(Static36.anInt1076, Static117.anInt951, arg0);
		@Pc(23) int local23 = Static96.method2447(Static64.anInt1962, Static123.anInt3379, arg1);
		@Pc(29) int local29 = Static96.method2447(Static64.anInt1962, Static123.anInt3379, arg4);
		for (@Pc(31) int local31 = local11; local31 <= local17; local31++) {
			Static163.method3070(local29, local23, arg2, Static42.anIntArrayArray8[local31]);
		}
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(II)Lclient!ob;")
	public static Class60 method3554(@OriginalArg(1) int arg0) {
		return Static193.method3536(new Class60[] { Static72.method1661(arg0 >> 24 & 0xFF), Static168.aClass60_1135, Static72.method1661(arg0 >> 16 & 0xFF), Static168.aClass60_1135, Static72.method1661(arg0 >> 8 & 0xFF), Static168.aClass60_1135, Static72.method1661(arg0 & 0xFF) });
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(III)Lclient!me;")
	public static Class52 method3555(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class2_Sub17 local7 = Static118.aClass2_Sub17ArrayArrayArray1[arg0][arg1][arg2];
		return local7 == null || local7.aClass52_1 == null ? null : local7.aClass52_1;
	}
}
