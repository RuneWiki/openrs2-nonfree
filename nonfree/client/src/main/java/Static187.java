import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static187 {

	@OriginalMember(owner = "client!km", name = "Dc", descriptor = "I")
	public static int anInt3390;

	@OriginalMember(owner = "client!km", name = "Gc", descriptor = "[I")
	public static int[] anIntArray379;

	@OriginalMember(owner = "client!km", name = "Lc", descriptor = "I")
	public static int anInt3395;

	@OriginalMember(owner = "client!km", name = "Nc", descriptor = "Lclient!b;")
	public static Class20 aClass20_46;

	@OriginalMember(owner = "client!km", name = "qc", descriptor = "Lclient!us;")
	public static final Class234 aClass234_72 = new Class234(19, 5);

	@OriginalMember(owner = "client!km", name = "Ic", descriptor = "Ljava/lang/String;")
	public static String aString34 = "";

	@OriginalMember(owner = "client!km", name = "Kc", descriptor = "J")
	public static long aLong131 = 0L;

	@OriginalMember(owner = "client!km", name = "Mc", descriptor = "I")
	public static int anInt3396 = 0;

	@OriginalMember(owner = "client!km", name = "Oc", descriptor = "I")
	public static int anInt3397 = 0;

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(IIILclient!sk;)V")
	public static void method2963(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class28_Sub2 arg3) {
		@Pc(4) Class48 local4 = Static382.method5674(arg0, arg1, arg2);
		if (local4 != null) {
			local4.aClass28_Sub2_2 = arg3;
		}
	}

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(IIIIII)V")
	public static void method2966(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (Static221.anInt3917 <= arg1 && arg4 <= Static365.anInt6140 && Static26.anInt345 <= arg2 && arg3 <= Static272.anInt4750) {
			Static304.method2754(arg3, arg0, arg1, arg2, arg4);
		} else {
			Static350.method5269(arg2, arg1, arg0, arg3, arg4);
		}
	}
}
