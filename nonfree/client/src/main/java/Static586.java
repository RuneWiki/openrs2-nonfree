import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static586 {

	@OriginalMember(owner = "client!uo", name = "mb", descriptor = "Lclient!vn;")
	public static Class190 aClass190_7;

	@OriginalMember(owner = "client!uo", name = "u", descriptor = "Lclient!mia;")
	public static final Class208 aClass208_88 = new Class208(79, 4);

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(FLclient!oia;IBIFIFFFI)[B")
	public static byte[] method8240(@OriginalArg(0) float arg0, @OriginalArg(1) Class206 arg1, @OriginalArg(5) float arg2, @OriginalArg(7) float arg3, @OriginalArg(8) float arg4, @OriginalArg(9) float arg5) {
		@Pc(15) byte[] local15 = new byte[262144];
		Static414.method6514(local15, arg4, arg5, arg3, arg0, 0, arg1, arg2);
		return local15;
	}

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(IIBIII)V")
	public static void method8243(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(11) int local11 = Static384.method6192(Static567.anInt9578, Static100.anInt10042, arg0);
		@Pc(17) int local17 = Static384.method6192(Static567.anInt9578, Static100.anInt10042, arg2);
		@Pc(23) int local23 = Static384.method6192(Static553.anInt9425, Static347.anInt6542, arg1);
		@Pc(29) int local29 = Static384.method6192(Static553.anInt9425, Static347.anInt6542, arg4);
		for (@Pc(31) int local31 = local11; local31 <= local17; local31++) {
			Static312.method5228(arg3, Static484.anIntArrayArray41[local31], local29, local23);
		}
	}
}
