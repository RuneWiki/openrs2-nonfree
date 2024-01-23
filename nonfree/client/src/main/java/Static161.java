import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static161 {

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "I")
	public static int anInt3536 = -1;

	@OriginalMember(owner = "client!ll", name = "b", descriptor = "Z")
	public static boolean aBoolean230 = false;

	@OriginalMember(owner = "client!ll", name = "c", descriptor = "Ljava/lang/String;")
	public static String aString214 = " has logged out.";

	@OriginalMember(owner = "client!ll", name = "d", descriptor = "[Lclient!ui;")
	public static Class1_Sub3_Sub21[] aClass1_Sub3_Sub21Array2 = new Class1_Sub3_Sub21[14];

	@OriginalMember(owner = "client!ll", name = "e", descriptor = "Z")
	public static boolean aBoolean231 = false;

	@OriginalMember(owner = "client!ll", name = "f", descriptor = "[I")
	public static int[] anIntArray322 = new int[] { 0, -1, 0, 1 };

	@OriginalMember(owner = "client!ll", name = "g", descriptor = "Ljava/lang/String;")
	public static String aString215 = "";

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "(IIIIIII)V")
	public static void method2562(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(11) int local11 = Static131.method2259(Static90.anInt2088, arg0, Static206.anInt4449);
		@Pc(17) int local17 = Static131.method2259(Static90.anInt2088, arg4, Static206.anInt4449);
		@Pc(23) int local23 = Static131.method2259(Static310.anInt6206, arg1, Static170.anInt3814);
		@Pc(29) int local29 = Static131.method2259(Static310.anInt6206, arg3, Static170.anInt3814);
		@Pc(37) int local37 = Static131.method2259(Static90.anInt2088, arg0 + arg2, Static206.anInt4449);
		@Pc(45) int local45 = Static131.method2259(Static90.anInt2088, arg4 - arg2, Static206.anInt4449);
		@Pc(47) int local47;
		for (local47 = local11; local47 < local37; local47++) {
			Static98.method3942(local29, Static121.anIntArrayArray33[local47], arg5, local23);
		}
		for (@Pc(75) int local75 = local17; local75 > local45; local75--) {
			Static98.method3942(local29, Static121.anIntArrayArray33[local75], arg5, local23);
		}
		@Pc(102) int local102 = Static131.method2259(Static310.anInt6206, arg1 + arg2, Static170.anInt3814);
		@Pc(110) int local110 = Static131.method2259(Static310.anInt6206, arg3 - arg2, Static170.anInt3814);
		for (local47 = local37; local47 <= local45; local47++) {
			@Pc(123) int[] local123 = Static121.anIntArrayArray33[local47];
			Static98.method3942(local102, local123, arg5, local23);
			Static98.method3942(local29, local123, arg5, local110);
		}
	}

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "(I[B)Lclient!df;")
	public static Class1_Sub3_Sub5 method2564(@OriginalArg(1) byte[] arg0) {
		if (arg0 == null) {
			return null;
		}
		@Pc(20) Class1_Sub3_Sub5 local20;
		if (Static294.aBoolean367) {
			local20 = new Class1_Sub3_Sub5_Sub2(arg0, Static250.anIntArray469, Static137.anIntArray227, Static95.anIntArray212, Static50.anIntArray22, Static34.aByteArrayArray5);
		} else {
			local20 = new Class1_Sub3_Sub5_Sub1(arg0, Static250.anIntArray469, Static137.anIntArray227, Static95.anIntArray212, Static50.anIntArray22, Static34.aByteArrayArray5);
		}
		Static20.method432();
		return local20;
	}
}
