import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static106 {

	@OriginalMember(owner = "client!ea", name = "B", descriptor = "[[[Lclient!df;")
	public static Class63[][][] aClass63ArrayArrayArray1;

	@OriginalMember(owner = "client!ea", name = "D", descriptor = "Lclient!saa;")
	public static Class3_Sub44 aClass3_Sub44_3;

	@OriginalMember(owner = "client!ea", name = "O", descriptor = "J")
	public static long aLong64;

	@OriginalMember(owner = "client!ea", name = "t", descriptor = "Lclient!cb;")
	public static final Class37 aClass37_2 = new Class37();

	@OriginalMember(owner = "client!ea", name = "N", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray10 = new String[5];

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(IIIIZZI)V")
	public static void method2232(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5) {
		if (arg1 <= arg5) {
			return;
		}
		@Pc(14) int local14 = (arg5 + arg1) / 2;
		@Pc(16) int local16 = arg5;
		@Pc(20) Class133_Sub1 local20 = Static338.aClass133_Sub1Array2[local14];
		Static338.aClass133_Sub1Array2[local14] = Static338.aClass133_Sub1Array2[arg1];
		Static338.aClass133_Sub1Array2[arg1] = local20;
		for (@Pc(32) int local32 = arg5; local32 < arg1; local32++) {
			if (Static525.method6984(Static338.aClass133_Sub1Array2[local32], local20, arg4, arg2, arg0, arg3) <= 0) {
				@Pc(49) Class133_Sub1 local49 = Static338.aClass133_Sub1Array2[local32];
				Static338.aClass133_Sub1Array2[local32] = Static338.aClass133_Sub1Array2[local16];
				Static338.aClass133_Sub1Array2[local16++] = local49;
			}
		}
		Static338.aClass133_Sub1Array2[arg1] = Static338.aClass133_Sub1Array2[local16];
		Static338.aClass133_Sub1Array2[local16] = local20;
		method2232(arg0, local16 - 1, arg2, arg3, arg4, arg5);
		method2232(arg0, arg1, arg2, arg3, arg4, local16 + 1);
	}
}
