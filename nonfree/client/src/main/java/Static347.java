import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static347 {

	@OriginalMember(owner = "client!mea", name = "c", descriptor = "Lclient!wu;")
	public static Class384 aClass384_128;

	@OriginalMember(owner = "client!mea", name = "h", descriptor = "[[S")
	public static short[][] aShortArrayArray20;

	@OriginalMember(owner = "client!mea", name = "d", descriptor = "Lclient!mt;")
	public static final Class5_Sub34 aClass5_Sub34_2 = new Class5_Sub34(0, 0);

	@OriginalMember(owner = "client!mea", name = "f", descriptor = "Lclient!hda;")
	public static final Class136 aClass136_179 = new Class136(25, -1);

	@OriginalMember(owner = "client!mea", name = "g", descriptor = "I")
	public static int anInt9481 = -1;

	@OriginalMember(owner = "client!mea", name = "i", descriptor = "I")
	public static final int anInt9482 = 328;

	@OriginalMember(owner = "client!mea", name = "a", descriptor = "(IZIIZII)V")
	public static void method8140(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg4 <= arg5) {
			return;
		}
		@Pc(14) int local14 = (arg5 + arg4) / 2;
		@Pc(16) int local16 = arg5;
		@Pc(20) Class166_Sub1 local20 = Static106.aClass166_Sub1Array1[local14];
		Static106.aClass166_Sub1Array1[local14] = Static106.aClass166_Sub1Array1[arg4];
		Static106.aClass166_Sub1Array1[arg4] = local20;
		for (@Pc(32) int local32 = arg5; local32 < arg4; local32++) {
			if (Static113.method1653(arg3, arg1, local20, arg0, Static106.aClass166_Sub1Array1[local32], arg2) <= 0) {
				@Pc(49) Class166_Sub1 local49 = Static106.aClass166_Sub1Array1[local32];
				Static106.aClass166_Sub1Array1[local32] = Static106.aClass166_Sub1Array1[local16];
				Static106.aClass166_Sub1Array1[local16++] = local49;
			}
		}
		Static106.aClass166_Sub1Array1[arg4] = Static106.aClass166_Sub1Array1[local16];
		Static106.aClass166_Sub1Array1[local16] = local20;
		method8140(arg0, arg1, arg2, arg3, local16 - 1, arg5);
		method8140(arg0, arg1, arg2, arg3, arg4, local16 + 1);
	}

	@OriginalMember(owner = "client!mea", name = "a", descriptor = "(ILclient!uk;)Z")
	public static boolean method8141(@OriginalArg(1) Class346 arg0) {
		return arg0 == Static317.aClass346_3 || arg0 == Static601.aClass346_7 || Static383.aClass346_5 == arg0 || Static435.aClass346_6 == arg0;
	}

	@OriginalMember(owner = "client!mea", name = "a", descriptor = "(ZC)C")
	public static char method8145(@OriginalArg(1) char arg0) {
		if (arg0 == 'Æ') {
			return 'E';
		} else if (arg0 == 'æ') {
			return 'e';
		} else if (arg0 == 'ß') {
			return 's';
		} else if (arg0 == 'Œ') {
			return 'E';
		} else {
			return (char) (arg0 == 'œ' ? 'e' : '\u0000');
		}
	}
}
