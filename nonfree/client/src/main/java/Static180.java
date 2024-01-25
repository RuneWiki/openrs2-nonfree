import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static180 {

	@OriginalMember(owner = "client!go", name = "p", descriptor = "I")
	public static int anInt3476;

	@OriginalMember(owner = "client!go", name = "u", descriptor = "Lclient!ko;")
	public static Class183 aClass183_4;

	@OriginalMember(owner = "client!go", name = "m", descriptor = "I")
	public static final int anInt3474 = 4;

	@OriginalMember(owner = "client!go", name = "r", descriptor = "[I")
	public static final int[] anIntArray180 = new int[2];

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(I[Ljava/lang/String;)[Ljava/lang/String;")
	public static String[] method3111(@OriginalArg(1) String[] arg0) {
		@Pc(8) String[] local8 = new String[5];
		for (@Pc(10) int local10 = 0; local10 < 5; local10++) {
			local8[local10] = local10 + ": ";
			if (arg0 != null && arg0[local10] != null) {
				local8[local10] = local8[local10] + arg0[local10];
			}
		}
		return local8;
	}

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;)V")
	public static void method3112(@OriginalArg(1) String arg0, @OriginalArg(2) String arg1, @OriginalArg(3) String arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) String arg5) {
		Static224.method3527(arg5, arg2, null, -1, arg1, arg4, arg3, arg0);
	}

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(B)V")
	public static void method3113() {
		Static308.aClient1.method1508();
		Static121.method2498();
		Static566.anInt9223 = 0;
		Static532.aClass3_Sub11_Sub1_2.anInt6128 = 0;
		Static399.aClass56_133 = null;
		Static466.aClass56_155 = null;
		Static308.aClass56_102 = null;
		Static35.anInt636 = 0;
		Static111.method7204();
		Static495.anInt8058 = 0;
		Static507.anInt8256 = 0;
		Static138.aString13 = null;
		Static187.aClass103Array1 = null;
		Static591.anInt9675 = 0;
	}
}
