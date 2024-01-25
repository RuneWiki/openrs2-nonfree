import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static124 {

	@OriginalMember(owner = "client!ft", name = "o", descriptor = "[Lclient!os;")
	public static Class41_Sub3_Sub2_Sub1[] aClass41_Sub3_Sub2_Sub1Array2;

	@OriginalMember(owner = "client!ft", name = "t", descriptor = "I")
	public static int anInt2755 = -2;

	@OriginalMember(owner = "client!ft", name = "a", descriptor = "(Lclient!i;III[Z)Z")
	public static boolean method2026(@OriginalArg(0) Class1_Sub1_Sub10 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean[] arg4) {
		@Pc(1) boolean local1 = false;
		if (Static396.aClass96Array5 != Static221.aClass96Array4) {
			@Pc(11) int local11 = Static262.aClass96Array3[arg1].ca(arg2, arg3);
			for (@Pc(13) int local13 = 0; local13 <= arg1; local13++) {
				@Pc(18) Class96 local18 = Static262.aClass96Array3[local13];
				if (local18 != null) {
					@Pc(27) int local27 = local11 - local18.ca(arg2, arg3);
					if (arg4 != null) {
						arg4[local13] = local18.method4435(arg0, arg2, local27, arg3);
						if (!arg4[local13]) {
							continue;
						}
					}
					local18.H(arg0, arg2, local27, arg3, 0, false);
					local1 = true;
				}
			}
		}
		return local1;
	}

	@OriginalMember(owner = "client!ft", name = "a", descriptor = "([J[Ljava/lang/Object;B)V")
	public static void method2027(@OriginalArg(0) long[] arg0, @OriginalArg(1) Object[] arg1) {
		Static461.method5962(arg0, 0, arg0.length - 1, arg1);
	}
}
