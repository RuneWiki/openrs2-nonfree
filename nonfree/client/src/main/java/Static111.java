import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static111 {

	@OriginalMember(owner = "client!eea", name = "c", descriptor = "Lclient!od;")
	public static Class130_Sub1 aClass130_Sub1_1;

	@OriginalMember(owner = "client!eea", name = "j", descriptor = "Ljava/math/BigInteger;")
	public static final BigInteger aBigInteger2 = new BigInteger("10001", 16);

	@OriginalMember(owner = "client!eea", name = "l", descriptor = "Lclient!pp;")
	public static final Class236 aClass236_21 = new Class236(69, 6);

	@OriginalMember(owner = "client!eea", name = "a", descriptor = "(IIIIIIIZII)V")
	public static void method2210(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(9) int arg6) {
		@Pc(7) Class5_Sub22 local7 = null;
		for (@Pc(17) Class5_Sub22 local17 = (Class5_Sub22) Static330.aClass99_53.method2526(); local17 != null; local17 = (Class5_Sub22) Static330.aClass99_53.method2519()) {
			if (local17.anInt3301 == arg0 && arg6 == local17.anInt3297 && local17.anInt3296 == arg4 && arg3 == local17.anInt3294) {
				local7 = local17;
				break;
			}
		}
		if (local7 == null) {
			local7 = new Class5_Sub22();
			local7.anInt3301 = arg0;
			local7.anInt3296 = arg4;
			local7.anInt3294 = arg3;
			local7.anInt3297 = arg6;
			if (arg6 >= 0 && arg4 >= 0 && Static460.anInt7894 > arg6 && Static235.anInt4493 > arg4) {
				Static24.method3372(local7);
			}
			Static330.aClass99_53.method2513(local7);
		}
		local7.anInt3298 = arg5;
		local7.anInt3295 = arg2;
		local7.anInt3293 = 0;
		local7.anInt3305 = arg1;
		local7.anInt3306 = -1;
	}

	@OriginalMember(owner = "client!eea", name = "a", descriptor = "(B)V")
	public static void method2212() {
		@Pc(16) Class5_Sub2_Sub7 local16 = Static144.method2728(0, 15);
		local16.method1324();
	}
}
