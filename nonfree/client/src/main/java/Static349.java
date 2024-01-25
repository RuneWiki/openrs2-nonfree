import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static349 {

	@OriginalMember(owner = "client!nr", name = "f", descriptor = "Lclient!mga;")
	public static Class206 aClass206_5;

	@OriginalMember(owner = "client!nr", name = "j", descriptor = "I")
	public static int anInt6234;

	@OriginalMember(owner = "client!nr", name = "a", descriptor = "I")
	public static int anInt6230 = 0;

	@OriginalMember(owner = "client!nr", name = "g", descriptor = "I")
	public static int anInt6232 = -2;

	@OriginalMember(owner = "client!nr", name = "a", descriptor = "(IZZIIBI)V")
	public static void method5330(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		if (arg3 <= arg4) {
			return;
		}
		@Pc(18) int local18 = (arg3 + arg4) / 2;
		@Pc(20) int local20 = arg4;
		@Pc(24) Class299_Sub1 local24 = Static332.aClass299_Sub1Array2[local18];
		Static332.aClass299_Sub1Array2[local18] = Static332.aClass299_Sub1Array2[arg3];
		Static332.aClass299_Sub1Array2[arg3] = local24;
		for (@Pc(36) int local36 = arg4; local36 < arg3; local36++) {
			if (Static515.method7132(arg0, arg5, arg2, arg1, Static332.aClass299_Sub1Array2[local36], local24) <= 0) {
				@Pc(53) Class299_Sub1 local53 = Static332.aClass299_Sub1Array2[local36];
				Static332.aClass299_Sub1Array2[local36] = Static332.aClass299_Sub1Array2[local20];
				Static332.aClass299_Sub1Array2[local20++] = local53;
			}
		}
		Static332.aClass299_Sub1Array2[arg3] = Static332.aClass299_Sub1Array2[local20];
		Static332.aClass299_Sub1Array2[local20] = local24;
		method5330(arg0, arg1, arg2, local20 - 1, arg4, arg5);
		method5330(arg0, arg1, arg2, arg3, local20 + 1, arg5);
	}

	@OriginalMember(owner = "client!nr", name = "a", descriptor = "(Lclient!pba;IIB)J")
	public static long method5331(@OriginalArg(0) Interface18 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(13) long local13 = 4194304L;
		@Pc(15) long local15 = 2147483648L;
		@Pc(17) long local17 = Long.MIN_VALUE;
		@Pc(24) Class252 local24 = Static412.aClass307_4.method6636(arg0.method6265());
		@Pc(45) long local45 = (long) ((arg2 | 0x800000) << 7 | arg1 | arg0.method6268() << 14 | arg0.method6272() << 20);
		if (local24.anInt6889 == 0) {
			local45 |= local17;
		}
		if (local24.anInt6928 == 1) {
			local45 |= local13;
		}
		if (local24.aBoolean483) {
			local45 |= local15;
		}
		return local45 | (long) arg0.method6265() << 32;
	}
}
