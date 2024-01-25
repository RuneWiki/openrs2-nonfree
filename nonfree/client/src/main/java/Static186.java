import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static186 {

	@OriginalMember(owner = "client!lj", name = "s", descriptor = "I")
	public static int anInt4092 = 0;

	@OriginalMember(owner = "client!lj", name = "w", descriptor = "Lclient!jg;")
	public static final Class107 aClass107_20 = new Class107(64);

	@OriginalMember(owner = "client!lj", name = "D", descriptor = "[I")
	public static final int[] anIntArray310 = new int[50];

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(Lclient!ek;Lclient!dr;IIIIII)V")
	public static void method3501(@OriginalArg(0) Class61 arg0, @OriginalArg(1) Class37 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(5) Interface8 local5 = null;
		if (arg4 == 0) {
			local5 = (Interface8) Static356.method5687(arg5, arg2, arg6);
		}
		if (arg4 == 1) {
			local5 = (Interface8) Static346.method5010(arg5, arg2, arg6);
		}
		if (arg4 == 2) {
			local5 = (Interface8) Static109.method2112(arg5, arg2, arg6, rc.class);
		}
		if (arg4 == 3) {
			local5 = (Interface8) Static217.method4135(arg5, arg2, arg6);
		}
		if (local5 == null) {
			return;
		}
		@Pc(59) int local59 = local5.method5503();
		@Pc(63) int local63 = local5.method5501();
		@Pc(69) Class74 local69 = Static228.method4210(local5.method5502());
		if (local69.method2009()) {
			Static272.method4033(local69, arg5, arg6, arg2);
		}
		if (local5.method5497()) {
			local5.method5500(arg1);
		}
		if (arg4 != 0) {
			if (arg4 == 1) {
				Static230.method4869(arg5, arg2, arg6);
				return;
			}
			if (arg4 == 2) {
				Static351.method5657(arg5, arg2, arg6, rc.class);
				if (local69.anInt2064 != 0 && Static66.anInt1177 > local69.anInt2094 + arg2 && local69.anInt2094 + arg6 < Static12.anInt213 && Static66.anInt1177 > arg2 + local69.anInt2048 && Static12.anInt213 > arg6 + local69.anInt2048) {
					arg0.method1606(local69.anInt2094, local69.aBoolean200, arg2, local69.anInt2048, !local69.aBoolean190, local63, arg6);
					return;
				}
			} else if (arg4 == 3) {
				Static71.method1443(arg5, arg2, arg6);
				if (local69.anInt2064 != 1) {
					return;
				}
				arg0.method1617(arg2, arg6);
			} else {
				return;
			}
			return;
		}
		Static187.method3506(arg5, arg2, arg6);
		if (local69.anInt2064 != 0) {
			arg0.method1610(arg6, local59, !local69.aBoolean190, arg2, local63, local69.aBoolean200);
			return;
		}
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(IIIZIZZ)V")
	public static void method3502(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		if (arg2 >= arg4) {
			return;
		}
		@Pc(23) int local23 = (arg4 + arg2) / 2;
		@Pc(25) int local25 = arg2;
		@Pc(29) Class120_Sub1 local29 = Static339.aClass120_Sub1Array6[local23];
		Static339.aClass120_Sub1Array6[local23] = Static339.aClass120_Sub1Array6[arg4];
		Static339.aClass120_Sub1Array6[arg4] = local29;
		for (@Pc(41) int local41 = arg2; local41 < arg4; local41++) {
			if (Static346.method5013(local29, arg1, Static339.aClass120_Sub1Array6[local41], arg3, arg5, arg0) <= 0) {
				@Pc(58) Class120_Sub1 local58 = Static339.aClass120_Sub1Array6[local41];
				Static339.aClass120_Sub1Array6[local41] = Static339.aClass120_Sub1Array6[local25];
				Static339.aClass120_Sub1Array6[local25++] = local58;
			}
		}
		Static339.aClass120_Sub1Array6[arg4] = Static339.aClass120_Sub1Array6[local25];
		Static339.aClass120_Sub1Array6[local25] = local29;
		method3502(arg0, arg1, arg2, arg3, local25 - 1, arg5);
		method3502(arg0, arg1, local25 + 1, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!lj", name = "d", descriptor = "(I)V")
	public static void method3505() {
		@Pc(3) Class193[] local3 = Class49.aClass193Array3;
		synchronized (Class49.aClass193Array3) {
			for (@Pc(12) int local12 = 0; local12 < Class49.aClass193Array3.length; local12++) {
				Class49.aClass193Array3[local12] = new Class193();
				Static331.anIntArray497[local12] = 0;
			}
		}
	}
}
