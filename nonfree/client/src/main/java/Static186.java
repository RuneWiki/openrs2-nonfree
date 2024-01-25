import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static186 {

	@OriginalMember(owner = "client!hk", name = "e", descriptor = "I")
	public static int anInt3582;

	@OriginalMember(owner = "client!hk", name = "h", descriptor = "Z")
	public static boolean aBoolean219;

	@OriginalMember(owner = "client!hk", name = "b", descriptor = "Lclient!pp;")
	public static final Class236 aClass236_34 = new Class236(12, 7);

	@OriginalMember(owner = "client!hk", name = "f", descriptor = "I")
	public static int anInt3583 = 0;

	@OriginalMember(owner = "client!hk", name = "g", descriptor = "[I")
	public static final int[] anIntArray265 = new int[14];

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(Ljava/lang/String;II)V")
	public static void method3138(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1) {
		Static415.method5995(Static217.aClass236_43);
		Static164.aClass5_Sub3_Sub1_2.method4192(Static52.method1102(arg0) + 1);
		Static164.aClass5_Sub3_Sub1_2.method4219(arg1);
		Static164.aClass5_Sub3_Sub1_2.method4208(arg0);
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(ZZ)Z")
	public static boolean method3140(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		return arg0 | arg1;
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(IIII)I")
	public static int method3141(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(3) int local3 = arg2 & 0x3;
		if (local3 == 0) {
			return arg1;
		} else if (local3 == 1) {
			return 7 - arg0;
		} else if (local3 == 2) {
			return 7 - arg1;
		} else {
			return arg0;
		}
	}
}
