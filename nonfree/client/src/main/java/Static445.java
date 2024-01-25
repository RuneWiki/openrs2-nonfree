import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static445 {

	@OriginalMember(owner = "client!qt", name = "J", descriptor = "F")
	public static float aFloat232;

	@OriginalMember(owner = "client!qt", name = "y", descriptor = "I")
	public static int anInt7786 = 0;

	@OriginalMember(owner = "client!qt", name = "D", descriptor = "Lclient!wp;")
	public static final Class363 aClass363_221 = new Class363(48, 12);

	@OriginalMember(owner = "client!qt", name = "F", descriptor = "Lclient!ae;")
	public static final Class8 aClass8_54 = new Class8();

	@OriginalMember(owner = "client!qt", name = "I", descriptor = "I")
	public static int anInt7791 = 0;

	@OriginalMember(owner = "client!qt", name = "a", descriptor = "(ILclient!ww;Lclient!oj;Lclient!r;IILclient!vb;I)V")
	public static void method6396(@OriginalArg(0) int arg0, @OriginalArg(1) Class366 arg1, @OriginalArg(2) Class243 arg2, @OriginalArg(3) Class100 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class2_Sub46 arg6) {
		@Pc(15) int local15 = arg6.anInt9118 - arg5 / 2 - 5;
		@Pc(19) int local19 = arg4 + 2;
		if (arg1.anInt9631 != 0) {
			arg3.method6261(arg1.anInt9631, local15, local19, arg4 + arg0 * arg2.method5691() + 1 - local19, arg5 - -10);
		}
		if (arg1.anInt9637 != 0) {
			arg3.method6200(arg5 + 10, local19, arg4 + arg0 * arg2.method5691() + 1 - local19, local15, arg1.anInt9637);
		}
		@Pc(76) int local76 = arg1.anInt9643;
		if (arg6.aBoolean695 && arg1.anInt9640 != -1) {
			local76 = arg1.anInt9640;
		}
		for (@Pc(88) int local88 = 0; local88 < arg0; local88++) {
			@Pc(94) String local94 = Static370.aStringArray119[local88];
			if (arg0 - 1 > local88) {
				local94 = local94.substring(0, local94.length() - 4);
			}
			arg2.method5690(arg3, local94, arg6.anInt9118, arg4, local76);
			arg4 += arg2.method5691();
		}
	}
}
