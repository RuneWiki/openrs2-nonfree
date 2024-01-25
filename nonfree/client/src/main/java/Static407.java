import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static407 {

	@OriginalMember(owner = "client!mr", name = "d", descriptor = "[I")
	public static int[] anIntArray469 = new int[4];

	@OriginalMember(owner = "client!mr", name = "f", descriptor = "I")
	public static final int anInt6702 = 5000;

	@OriginalMember(owner = "client!mr", name = "a", descriptor = "(Lclient!oh;I)Lclient!oh;")
	public static Class273 method6010(@OriginalArg(0) Class273 arg0) {
		if (arg0.anInt7392 != -1) {
			return Static417.method6111(arg0.anInt7392);
		}
		@Pc(20) int local20 = arg0.anInt7350 >>> 16;
		@Pc(25) Class129 local25 = new Class129(Static463.aClass218_36);
		for (@Pc(30) Class2_Sub26 local30 = (Class2_Sub26) local25.method2682(); local30 != null; local30 = (Class2_Sub26) local25.method2681()) {
			if (local20 == local30.anInt3020) {
				return Static417.method6111((int) local30.aLong352);
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!mr", name = "a", descriptor = "(IIZIIIZ)V")
	public static void method6011(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5) {
		if (arg3 <= arg1) {
			return;
		}
		@Pc(21) int local21 = (arg1 + arg3) / 2;
		@Pc(23) int local23 = arg1;
		@Pc(27) Class88_Sub1 local27 = Static313.aClass88_Sub1Array2[local21];
		Static313.aClass88_Sub1Array2[local21] = Static313.aClass88_Sub1Array2[arg3];
		Static313.aClass88_Sub1Array2[arg3] = local27;
		for (@Pc(39) int local39 = arg1; local39 < arg3; local39++) {
			if (Static446.method6519(arg0, arg5, local27, arg2, arg4, Static313.aClass88_Sub1Array2[local39]) <= 0) {
				@Pc(61) Class88_Sub1 local61 = Static313.aClass88_Sub1Array2[local39];
				Static313.aClass88_Sub1Array2[local39] = Static313.aClass88_Sub1Array2[local23];
				Static313.aClass88_Sub1Array2[local23++] = local61;
			}
		}
		Static313.aClass88_Sub1Array2[arg3] = Static313.aClass88_Sub1Array2[local23];
		Static313.aClass88_Sub1Array2[local23] = local27;
		method6011(arg0, arg1, arg2, local23 - 1, arg4, arg5);
		method6011(arg0, local23 + 1, arg2, arg3, arg4, arg5);
	}
}
