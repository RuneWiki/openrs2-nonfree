import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static630 {

	@OriginalMember(owner = "client!vea", name = "a", descriptor = "Z")
	public static boolean aBoolean763 = true;

	@OriginalMember(owner = "client!vea", name = "c", descriptor = "Lclient!jw;")
	public static final Class180 aClass180_201 = new Class180(44, -1);

	@OriginalMember(owner = "client!vea", name = "f", descriptor = "Lclient!mga;")
	public static final Class218 aClass218_150 = new Class218(64, 11);

	@OriginalMember(owner = "client!vea", name = "g", descriptor = "Lclient!jw;")
	public static final Class180 aClass180_202 = new Class180(127, 6);

	@OriginalMember(owner = "client!vea", name = "h", descriptor = "Lclient!gb;")
	public static Class3_Sub26 aClass3_Sub26_2 = null;

	@OriginalMember(owner = "client!vea", name = "a", descriptor = "(ZI)Z")
	public static boolean method8802(@OriginalArg(1) int arg0) {
		return arg0 == 0 || arg0 == 1 || arg0 == 2;
	}

	@OriginalMember(owner = "client!vea", name = "a", descriptor = "(IIIII[[[BIIILclient!ha;III)V")
	public static void method8803(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte[][][] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(9) Class13 arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11) {
		if (arg4 == 0 || arg0 == 0) {
			return;
		}
		if (arg4 == 9) {
			arg6 = arg6 + 1 & 0x3;
			arg4 = 1;
		}
		if (arg4 == 10) {
			arg6 = arg6 + 3 & 0x3;
			arg4 = 1;
		}
		if (arg4 == 11) {
			arg6 = arg6 + 3 & 0x3;
			arg4 = 8;
		}
		arg8.Q(arg11, arg1, arg10, arg7, arg2, arg3, arg5[arg4 - 1][arg6], arg0, arg9);
	}

	@OriginalMember(owner = "client!vea", name = "a", descriptor = "(Z)V")
	public static void method8804() {
		for (@Pc(11) Class3_Sub40 local11 = (Class3_Sub40) Static244.aClass83_11.method2375(); local11 != null; local11 = (Class3_Sub40) Static244.aClass83_11.method2370()) {
			if (local11.aClass121_Sub1_1.method3603()) {
				Static674.method9364(local11.anInt5753);
			} else {
				local11.aClass121_Sub1_1.method3618();
				try {
					local11.aClass121_Sub1_1.method3601();
				} catch (@Pc(28) Exception local28) {
					Static503.method7153("TV: " + local11.anInt5753, local28);
					Static674.method9364(local11.anInt5753);
				}
				if (!local11.aBoolean415 && !local11.aBoolean416) {
					@Pc(54) Class3_Sub19_Sub4 local54 = local11.aClass121_Sub1_1.method3609();
					if (local54 != null) {
						@Pc(60) Class3_Sub1_Sub5 local60 = local54.method8045();
						if (local60 != null) {
							local60.method5786(local11.anInt5756);
							Static313.aClass3_Sub1_Sub2_1.method934(local60);
							local11.aBoolean415 = true;
						}
					}
				}
			}
		}
	}
}
