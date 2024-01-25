import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static102 {

	@OriginalMember(owner = "client!ea", name = "i", descriptor = "Lclient!gp;")
	public static Class117 aClass117_58;

	@OriginalMember(owner = "client!ea", name = "d", descriptor = "Lclient!bv;")
	public static final Class40 aClass40_33 = new Class40("Walk here", "Hierhin gehen", "Atteindre", "Caminhar para cá");

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(ILclient!fa;Lclient!qa;ILclient!gb;IILclient!fm;)V")
	public static void method2127(@OriginalArg(0) int arg0, @OriginalArg(1) Class94 arg1, @OriginalArg(2) Class62 arg2, @OriginalArg(4) Class5_Sub18 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class101 arg6) {
		@Pc(20) int local20 = arg3.anInt3143 - arg4 / 2 - 5;
		@Pc(24) int local24 = arg0 + 2;
		if (arg6.anInt2869 != 0) {
			arg2.method7040(arg6.anInt2869, arg1.method2409() * arg5 + arg0 + 1 - local24, local24, local20, arg4 + 10);
		}
		if (arg6.anInt2889 != 0) {
			arg2.method7013(local24, arg1.method2409() * arg5 + arg0 + 1 - local24, arg6.anInt2889, local20, arg4 + 10);
		}
		@Pc(81) int local81 = arg6.anInt2879;
		if (arg3.aBoolean207 && arg6.anInt2892 != -1) {
			local81 = arg6.anInt2892;
		}
		for (@Pc(93) int local93 = 0; local93 < arg5; local93++) {
			@Pc(99) String local99 = Static395.aStringArray32[local93];
			if (arg5 - 1 > local93) {
				local99 = local99.substring(0, local99.length() - 4);
			}
			arg1.method2407(arg2, local99, arg3.anInt3143, arg0, local81);
			arg0 += arg1.method2409();
		}
	}
}
