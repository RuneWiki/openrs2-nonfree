import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static242 {

	@OriginalMember(owner = "client!sk", name = "q", descriptor = "Lclient!rj;")
	public static Class2_Sub3_Sub1 aClass2_Sub3_Sub1_9;

	@OriginalMember(owner = "client!sk", name = "p", descriptor = "Z")
	public static boolean aBoolean412 = false;

	@OriginalMember(owner = "client!sk", name = "r", descriptor = "Ljava/lang/String;")
	public static String aString243 = "cyan:";

	@OriginalMember(owner = "client!sk", name = "u", descriptor = "Z")
	public static boolean aBoolean413 = false;

	@OriginalMember(owner = "client!sk", name = "v", descriptor = "Z")
	public static boolean aBoolean414 = true;

	@OriginalMember(owner = "client!sk", name = "z", descriptor = "I")
	public static int anInt4899 = 0;

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(Z)V")
	public static void method3951() {
		Static299.aClass46_19.method1077();
		Static165.aClass46_28.method1077();
		Static98.aClass46_13.method1077();
	}

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(IIIIIIII)V")
	public static void method3952(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(11) int local11 = Static202.method3411(Static127.anInt2664, arg2, Static290.anInt6021);
		@Pc(17) int local17 = Static202.method3411(Static127.anInt2664, arg0, Static290.anInt6021);
		@Pc(23) int local23 = Static202.method3411(Static68.anInt1509, arg6, Static43.anInt1054);
		@Pc(29) int local29 = Static202.method3411(Static68.anInt1509, arg3, Static43.anInt1054);
		@Pc(37) int local37 = Static202.method3411(Static127.anInt2664, arg2 + arg1, Static290.anInt6021);
		@Pc(46) int local46 = Static202.method3411(Static127.anInt2664, arg0 - arg1, Static290.anInt6021);
		@Pc(48) int local48;
		for (local48 = local11; local48 < local37; local48++) {
			Static133.method2321(local29, local23, Static274.anIntArrayArray50[local48], arg4);
		}
		for (local48 = local17; local48 > local46; local48--) {
			Static133.method2321(local29, local23, Static274.anIntArrayArray50[local48], arg4);
		}
		@Pc(94) int local94 = Static202.method3411(Static68.anInt1509, arg1 + arg6, Static43.anInt1054);
		@Pc(103) int local103 = Static202.method3411(Static68.anInt1509, arg3 - arg1, Static43.anInt1054);
		for (local48 = local37; local48 <= local46; local48++) {
			@Pc(116) int[] local116 = Static274.anIntArrayArray50[local48];
			Static133.method2321(local94, local23, local116, arg4);
			Static133.method2321(local103, local94, local116, arg5);
			Static133.method2321(local29, local103, local116, arg4);
		}
	}

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(DB)V")
	public static void method3953(@OriginalArg(0) double arg0) {
		if (Static139.aDouble1 == arg0) {
			return;
		}
		for (@Pc(7) int local7 = 0; local7 < 256; local7++) {
			@Pc(22) int local22 = (int) (Math.pow((double) local7 / 255.0D, arg0) * 255.0D);
			Static65.anIntArray107[local7] = local22 > 255 ? 255 : local22;
		}
		Static139.aDouble1 = arg0;
	}

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(ILclient!wm;B)Lclient!nf;")
	public static Class2_Sub3_Sub18 method3954(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub26 arg1) {
		@Pc(41) Class2_Sub3_Sub18 local41 = new Class2_Sub3_Sub18(arg0, arg1.method4265(), arg1.method4265(), arg1.method4228(), arg1.method4228(), arg1.method4261() == 1, arg1.method4261());
		@Pc(45) int local45 = arg1.method4261();
		for (@Pc(47) int local47 = 0; local47 < local45; local47++) {
			local41.aClass1_13.method11(new Class2_Sub25(arg1.method4261(), arg1.method4261(), arg1.method4242(), arg1.method4242(), arg1.method4242(), arg1.method4242(), arg1.method4242(), arg1.method4242(), arg1.method4242(), arg1.method4242()));
		}
		local41.method2978();
		return local41;
	}
}
