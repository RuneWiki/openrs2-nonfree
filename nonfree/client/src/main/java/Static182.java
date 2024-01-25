import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static182 {

	@OriginalMember(owner = "client!gf", name = "U", descriptor = "Lclient!fba;")
	public static final Class100 aClass100_53 = new Class100(60, 4);

	@OriginalMember(owner = "client!gf", name = "Z", descriptor = "I")
	public static int anInt3496 = 0;

	@OriginalMember(owner = "client!gf", name = "k", descriptor = "(I)V")
	public static void method2905() {
		Static629.aClass264_62.method6368();
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(IILclient!qe;Lclient!br;Lclient!gj;Lclient!ha;III)V")
	public static void method2906(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class14_Sub46 arg2, @OriginalArg(3) Class42 arg3, @OriginalArg(4) Class124 arg4, @OriginalArg(5) Class137 arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7) {
		@Pc(14) int local14 = arg1 - arg0 / 2 - 5;
		@Pc(18) int local18 = arg6 + 2;
		if (arg3.anInt1300 != 0) {
			arg5.method7869(local14, arg0 + 10, arg3.anInt1300, local18, arg6 + arg4.method2947() * arg7 + 1 - local18);
		}
		if (arg3.anInt1295 != 0) {
			arg5.method7941(arg4.method2947() * arg7 + arg6 + 1 - local18, local14, arg3.anInt1295, local18, arg0 + 10);
		}
		@Pc(70) int local70 = arg3.anInt1293;
		if (arg2.aBoolean575 && arg3.anInt1269 != -1) {
			local70 = arg3.anInt1269;
		}
		for (@Pc(83) int local83 = 0; local83 < arg7; local83++) {
			@Pc(89) String local89 = Static135.aStringArray8[local83];
			if (arg7 - 1 > local83) {
				local89 = local89.substring(0, local89.length() - 4);
			}
			arg4.method2945(arg5, local89, arg1, arg6, local70);
			arg6 += arg4.method2947();
		}
	}
}
