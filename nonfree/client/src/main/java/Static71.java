import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static71 {

	@OriginalMember(owner = "client!cu", name = "w", descriptor = "Lclient!ada;")
	public static final Class6 aClass6_24 = new Class6(57, -1);

	@OriginalMember(owner = "client!cu", name = "x", descriptor = "Z")
	public static boolean aBoolean148 = true;

	@OriginalMember(owner = "client!cu", name = "a", descriptor = "(IZIIZII)V")
	public static void method1913(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg0 <= arg2) {
			return;
		}
		@Pc(12) int local12 = (arg0 + arg2) / 2;
		@Pc(14) int local14 = arg2;
		@Pc(18) Class50_Sub1 local18 = Static538.aClass50_Sub1Array2[local12];
		Static538.aClass50_Sub1Array2[local12] = Static538.aClass50_Sub1Array2[arg0];
		Static538.aClass50_Sub1Array2[arg0] = local18;
		for (@Pc(30) int local30 = arg2; local30 < arg0; local30++) {
			if (Static16.method807(Static538.aClass50_Sub1Array2[local30], arg5, arg4, local18, arg1, arg3) <= 0) {
				@Pc(46) Class50_Sub1 local46 = Static538.aClass50_Sub1Array2[local30];
				Static538.aClass50_Sub1Array2[local30] = Static538.aClass50_Sub1Array2[local14];
				Static538.aClass50_Sub1Array2[local14++] = local46;
			}
		}
		Static538.aClass50_Sub1Array2[arg0] = Static538.aClass50_Sub1Array2[local14];
		Static538.aClass50_Sub1Array2[local14] = local18;
		method1913(local14 - 1, arg1, arg2, arg3, arg4, arg5);
		method1913(arg0, arg1, local14 + 1, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!cu", name = "a", descriptor = "(III)Z")
	public static boolean method1916(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x8000) != 0;
	}
}
