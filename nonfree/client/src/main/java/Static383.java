import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static383 {

	@OriginalMember(owner = "client!wi", name = "j", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray44;

	@OriginalMember(owner = "client!wi", name = "q", descriptor = "I")
	public static int anInt6965;

	@OriginalMember(owner = "client!wi", name = "r", descriptor = "Lclient!oj;")
	public static Class48 aClass48_9;

	@OriginalMember(owner = "client!wi", name = "v", descriptor = "I")
	public static int anInt6968;

	@OriginalMember(owner = "client!wi", name = "d", descriptor = "Lclient!sd;")
	public static final Class208 aClass208_203 = new Class208(10, 3);

	@OriginalMember(owner = "client!wi", name = "m", descriptor = "Lclient!sd;")
	public static final Class208 aClass208_204 = new Class208(64, -2);

	@OriginalMember(owner = "client!wi", name = "s", descriptor = "I")
	public static int anInt6966 = -1;

	@OriginalMember(owner = "client!wi", name = "t", descriptor = "I")
	public static int anInt6967 = -60;

	@OriginalMember(owner = "client!wi", name = "u", descriptor = "Z")
	public static boolean aBoolean488 = false;

	@OriginalMember(owner = "client!wi", name = "w", descriptor = "[Lclient!hu;")
	public static final Class102[] aClass102Array2 = new Class102[14];

	@OriginalMember(owner = "client!wi", name = "x", descriptor = "Z")
	public static boolean aBoolean489 = true;

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(I[B)[B")
	public static byte[] method5998(@OriginalArg(1) byte[] arg0) {
		@Pc(6) int local6 = arg0.length;
		@Pc(9) byte[] local9 = new byte[local6];
		Static394.method2443(arg0, 0, local9, 0, local6);
		return local9;
	}

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(III)Lclient!il;")
	public static Class1_Sub4 method5999(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class188 local7 = Static45.aClass188ArrayArrayArray5[arg0][arg1][arg2];
		if (local7 == null) {
			return null;
		} else {
			@Pc(14) Class1_Sub4 local14 = local7.aClass1_Sub4_1;
			local7.aClass1_Sub4_1 = null;
			return local14;
		}
	}

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(ILjava/lang/String;IILjava/lang/String;Ljava/lang/String;)V")
	public static void method6001(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(3) int arg2, @OriginalArg(4) String arg3, @OriginalArg(5) String arg4) {
		Static295.method4840(arg1, -1, arg4, arg0, arg2, arg3, null);
	}
}
