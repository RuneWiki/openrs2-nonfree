import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static401 {

	@OriginalMember(owner = "client!mn", name = "h", descriptor = "I")
	public static int anInt7164;

	@OriginalMember(owner = "client!mn", name = "b", descriptor = "Lclient!lb;")
	public static Class221 aClass221_114;

	@OriginalMember(owner = "client!mn", name = "c", descriptor = "I")
	public static int anInt7165 = 0;

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(BZIIIZI)V")
	public static void method6008(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5) {
		if (arg5 <= arg3) {
			return;
		}
		@Pc(21) int local21 = (arg5 + arg3) / 2;
		@Pc(23) int local23 = arg3;
		@Pc(27) Class256_Sub1 local27 = Static372.aClass256_Sub1Array1[local21];
		Static372.aClass256_Sub1Array1[local21] = Static372.aClass256_Sub1Array1[arg5];
		Static372.aClass256_Sub1Array1[arg5] = local27;
		for (@Pc(39) int local39 = arg3; local39 < arg5; local39++) {
			if (Static528.method7481(Static372.aClass256_Sub1Array1[local39], arg2, arg0, arg4, local27, arg1) <= 0) {
				@Pc(61) Class256_Sub1 local61 = Static372.aClass256_Sub1Array1[local39];
				Static372.aClass256_Sub1Array1[local39] = Static372.aClass256_Sub1Array1[local23];
				Static372.aClass256_Sub1Array1[local23++] = local61;
			}
		}
		Static372.aClass256_Sub1Array1[arg5] = Static372.aClass256_Sub1Array1[local23];
		Static372.aClass256_Sub1Array1[local23] = local27;
		method6008(arg0, arg1, arg2, arg3, arg4, local23 - 1);
		method6008(arg0, arg1, arg2, local23 + 1, arg4, arg5);
	}

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(ZB)V")
	public static void method6009(@OriginalArg(0) boolean arg0) {
		Static608.method8325(Static272.anInt5005, arg0, Static633.anInt3426, Static575.anInt9435);
	}
}
