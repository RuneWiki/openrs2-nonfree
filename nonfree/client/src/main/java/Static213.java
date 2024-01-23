import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static213 {

	@OriginalMember(owner = "client!ph", name = "m", descriptor = "I")
	public static int anInt5511;

	@OriginalMember(owner = "client!ph", name = "w", descriptor = "[[Lclient!jb;")
	public static Class1_Sub15[][] aClass1_Sub15ArrayArray37;

	@OriginalMember(owner = "client!ph", name = "p", descriptor = "I")
	public static int anInt5512 = 0;

	@OriginalMember(owner = "client!ph", name = "t", descriptor = "[I")
	public static int[] anIntArray605 = new int[32];

	@OriginalMember(owner = "client!ph", name = "x", descriptor = "Ljava/lang/String;")
	public static String aString218 = "Loaded textures";

	@OriginalMember(owner = "client!ph", name = "y", descriptor = "Z")
	public static boolean aBoolean520 = false;

	@OriginalMember(owner = "client!ph", name = "b", descriptor = "(III)V")
	public static void method4575(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		Static99.anIntArray148[arg1] = arg0;
		@Pc(20) Class1_Sub19 local20 = (Class1_Sub19) Static284.aClass86_35.method2136((long) arg1);
		if (local20 == null) {
			local20 = new Class1_Sub19(Static244.method3859() + 500L);
			Static284.aClass86_35.method2144(local20, (long) arg1);
		} else {
			local20.aLong120 = Static244.method3859() + 500L;
		}
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(IIIIIIBI)V")
	public static void method4576(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6) {
		@Pc(9) int local9 = arg1 + arg6;
		@Pc(14) int local14 = arg5 - arg1;
		@Pc(19) int local19 = arg2 - arg1;
		@Pc(23) int local23 = arg1 + arg0;
		@Pc(25) int local25;
		for (local25 = arg6; local25 < local9; local25++) {
			Static103.method1978(arg4, arg2, arg0, Static40.anIntArrayArray6[local25]);
		}
		for (local25 = arg5; local25 > local14; local25--) {
			Static103.method1978(arg4, arg2, arg0, Static40.anIntArrayArray6[local25]);
		}
		for (local25 = local9; local25 <= local14; local25++) {
			@Pc(84) int[] local84 = Static40.anIntArrayArray6[local25];
			Static103.method1978(arg4, local23, arg0, local84);
			Static103.method1978(arg3, local19, local23, local84);
			Static103.method1978(arg4, arg2, local19, local84);
		}
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(IB)Lclient!cl;")
	public static Class28 method4578(@OriginalArg(0) int arg0) {
		@Pc(22) Class28 local22 = (Class28) Static273.aClass175_40.method4295((long) arg0);
		if (local22 != null) {
			return local22;
		}
		@Pc(33) byte[] local33 = Static14.aClass119_3.method3235(arg0, 32);
		local22 = new Class28();
		if (local33 != null) {
			local22.method726(new Class1_Sub13(local33));
		}
		local22.method725();
		Static273.aClass175_40.method4285(local22, (long) arg0);
		return local22;
	}
}
