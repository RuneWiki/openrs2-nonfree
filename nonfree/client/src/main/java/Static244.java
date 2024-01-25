import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static244 {

	@OriginalMember(owner = "client!jfa", name = "w", descriptor = "[Lclient!xa;")
	public static Class71[] aClass71Array31;

	@OriginalMember(owner = "client!jfa", name = "x", descriptor = "[Lclient!em;")
	public static Class89[] aClass89Array2;

	@OriginalMember(owner = "client!jfa", name = "v", descriptor = "I")
	public static int anInt4491 = 0;

	@OriginalMember(owner = "client!jfa", name = "a", descriptor = "(CB)Z")
	public static boolean method3821(@OriginalArg(0) char arg0) {
		if (arg0 >= ' ' && arg0 <= '~') {
			return true;
		} else if (arg0 >= ' ' && arg0 <= 'ÿ') {
			return true;
		} else {
			return arg0 == '€' || arg0 == 'Œ' || arg0 == '—' || arg0 == 'œ' || arg0 == 'Ÿ';
		}
	}

	@OriginalMember(owner = "client!jfa", name = "a", descriptor = "(Z)V")
	public static void method3822() {
		Static318.aBoolean442 = true;
	}

	@OriginalMember(owner = "client!jfa", name = "a", descriptor = "(Lclient!oa;BLclient!su;II)V")
	public static void method3823(@OriginalArg(0) Class90 arg0, @OriginalArg(2) Class298 arg1) {
		Static288.aClass298_170.method6808();
		if (Static194.aBoolean298) {
			return;
		}
		for (@Pc(21) Class6_Sub22 local21 = (Class6_Sub22) arg1.method6809(); local21 != null; local21 = (Class6_Sub22) arg1.method6821()) {
			@Pc(29) Class336 local29 = Static490.aClass320_2.method7209(local21.anInt4399);
			if (Static298.method4518(local29)) {
				@Pc(41) boolean local41 = Static181.method3010(arg0, local29, local21);
				if (local41) {
					Static194.method3293(arg0, local21, local29);
				}
			}
		}
	}
}
