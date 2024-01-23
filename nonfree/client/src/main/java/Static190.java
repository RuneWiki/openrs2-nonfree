import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static190 {

	@OriginalMember(owner = "client!ni", name = "i", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray10;

	@OriginalMember(owner = "client!ni", name = "b", descriptor = "I")
	public static int anInt3615 = 0;

	@OriginalMember(owner = "client!ni", name = "c", descriptor = "[I")
	public static int[] anIntArray300 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

	@OriginalMember(owner = "client!ni", name = "h", descriptor = "[I")
	public static int[] anIntArray301 = new int[] { 16, 32, 64, 128 };

	@OriginalMember(owner = "client!ni", name = "m", descriptor = "Ljava/lang/String;")
	public static String aString206 = "Loaded title screen";

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(I)V")
	public static void method3091() {
		Static236.aClass187_119.method4530();
	}

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(ZBZIILclient!vj;Lclient!vj;)I")
	public static int method3092(@OriginalArg(0) boolean arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class29_Sub1 arg4, @OriginalArg(6) Class29_Sub1 arg5) {
		@Pc(10) int local10 = Static306.method4613(arg5, arg3, arg4, arg0);
		if (local10 != 0) {
			return arg0 ? -local10 : local10;
		} else if (arg2 == -1) {
			return 0;
		} else {
			@Pc(41) int local41 = Static306.method4613(arg5, arg2, arg4, arg1);
			return arg1 ? -local41 : local41;
		}
	}

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(B)V")
	public static void method3094() {
		Static256.aClass1_Sub2_Sub20_6 = null;
		Static22.aClass1_Sub2_Sub20_1 = null;
		Static75.aClass1_Sub2_Sub20_3 = null;
		Static32.aClass1_Sub2_Sub20_4 = null;
	}

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(CLjava/lang/String;I)I")
	public static int method3095(@OriginalArg(0) char arg0, @OriginalArg(1) String arg1) {
		@Pc(7) int local7 = 0;
		@Pc(10) int local10 = arg1.length();
		for (@Pc(12) int local12 = 0; local12 < local10; local12++) {
			if (arg0 == arg1.charAt(local12)) {
				local7++;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!ni", name = "b", descriptor = "(B)V")
	public static void method3096() {
		Static160.aClass187_85.method4530();
		Static285.aClass187_143.method4530();
		Static226.aClass187_114.method4530();
	}

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(ZI)Lclient!so;")
	public static Class165 method3097(@OriginalArg(1) int arg0) {
		@Pc(10) Class165 local10 = (Class165) Static173.aClass187_90.method4527((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(27) byte[] local27 = Static267.aClass121_118.method3115(0, arg0);
		local10 = new Class165();
		if (local27 != null) {
			local10.method4145(new Class1_Sub14(local27));
		}
		local10.method4154();
		Static173.aClass187_90.method4524((long) arg0, local10);
		return local10;
	}
}
