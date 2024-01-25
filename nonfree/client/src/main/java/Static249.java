import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static249 {

	@OriginalMember(owner = "client!pk", name = "G", descriptor = "I")
	public static int anInt4819;

	@OriginalMember(owner = "client!pk", name = "P", descriptor = "I")
	public static int anInt4824;

	@OriginalMember(owner = "client!pk", name = "I", descriptor = "I")
	public static int anInt4820 = 0;

	@OriginalMember(owner = "client!pk", name = "L", descriptor = "I")
	public static int anInt4822 = 0;

	@OriginalMember(owner = "client!pk", name = "M", descriptor = "[[Z")
	public static final boolean[][] aBooleanArrayArray3 = new boolean[][] { { true, true, true, true, true, true, true, true, true, true, true, true, true }, { true, true, true, false, false, false, true, true, false, false, false, false, true }, { true, false, false, false, false, true, true, true, false, false, false, false, false }, { false, false, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, false, false, true, true, true, false, false, false, false, false }, { true, true, false, false, false, true, true, true, false, false, false, false, true }, { true, true, false, false, false, false, false, true, false, false, false, false, false }, { false, true, true, true, true, true, true, true, false, false, false, false, false }, { true, false, false, false, true, true, true, true, true, true, false, false, false }, { true, true, true, true, true, false, false, false, true, true, false, false, false }, { true, true, true, false, false, false, false, false, false, false, true, true, false }, new boolean[13], { true, true, true, true, true, true, true, true, true, true, true, true, true }, new boolean[13] };

	@OriginalMember(owner = "client!pk", name = "O", descriptor = "Ljava/lang/String;")
	public static String aString181 = "skill: ";

	@OriginalMember(owner = "client!pk", name = "S", descriptor = "I")
	public static volatile int anInt4827 = 0;

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(Lclient!el;Lclient!wd;ZLclient!e;IILclient!br;I)V")
	public static void method4349(@OriginalArg(0) Class52 arg0, @OriginalArg(1) Class212 arg1, @OriginalArg(3) Class46 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class14_Sub5 arg5, @OriginalArg(7) int arg6) {
		@Pc(15) int local15 = arg5.anInt731 - arg3 / 2 - 5;
		@Pc(23) int local23 = arg4 + 2;
		if (arg0.anInt1731 != 0) {
			arg2.method5108(arg3 + 10, local15, arg4 + arg1.method5869() * arg6 + 1 - local23, arg0.anInt1731, local23);
		}
		if (arg0.anInt1739 != 0) {
			arg2.method5087(local23, arg4 + arg6 * arg1.method5869() + 1 - local23, local15, arg0.anInt1739, arg3 + 10);
		}
		@Pc(79) int local79 = arg0.anInt1735;
		if (arg5.aBoolean38 && arg0.anInt1748 != -1) {
			local79 = arg0.anInt1748;
		}
		for (@Pc(92) int local92 = 0; local92 < arg6; local92++) {
			@Pc(98) String local98 = Static335.aStringArray74[local92];
			if (local92 < arg6 - 1) {
				local98 = local98.substring(0, local98.length() - 4);
			}
			arg1.method5866(arg2, local98, arg5.anInt731, arg4, local79);
			arg4 += arg1.method5869();
		}
	}
}
