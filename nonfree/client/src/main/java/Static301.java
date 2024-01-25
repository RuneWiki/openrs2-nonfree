import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static301 {

	@OriginalMember(owner = "client!ke", name = "f", descriptor = "[[I")
	public static int[][] anIntArrayArray59;

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "[Lclient!c;")
	public static final Class48[] aClass48Array1 = new Class48[14];

	@OriginalMember(owner = "client!ke", name = "b", descriptor = "I")
	public static final int anInt5499 = 1;

	@OriginalMember(owner = "client!ke", name = "c", descriptor = "Z")
	public static boolean aBoolean425 = true;

	@OriginalMember(owner = "client!ke", name = "g", descriptor = "I")
	public static int anInt5502 = 13156520;

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(IIIIIIIIII)Z")
	public static boolean method4655(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (!Static111.method8750(arg2, arg5, arg1)) {
			return false;
		}
		@Pc(15) int local15 = Static46.anIntArray46[1];
		@Pc(19) int local19 = Static46.anIntArray46[2];
		@Pc(23) int local23 = Static46.anIntArray46[0];
		if (!Static111.method8750(arg3, arg6, arg8)) {
			return false;
		}
		@Pc(35) int local35 = Static46.anIntArray46[2];
		@Pc(39) int local39 = Static46.anIntArray46[1];
		@Pc(43) int local43 = Static46.anIntArray46[0];
		if (Static111.method8750(arg0, arg7, arg4)) {
			@Pc(63) int local63 = Static46.anIntArray46[2];
			@Pc(67) int local67 = Static46.anIntArray46[0];
			@Pc(71) int local71 = Static46.anIntArray46[1];
			return Static496.method7043(local39, local67, local35, local23, local43, local15, local63, local19, local71);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(Lclient!fe;Z)Lclient!dm;")
	public static Class85 method4656(@OriginalArg(0) Class23_Sub2_Sub1 arg0) {
		@Pc(9) Class85 local9;
		if (Static154.aClass85_2 == null) {
			local9 = new Class85();
		} else {
			local9 = Static154.aClass85_2;
			Static154.aClass85_2 = Static154.aClass85_2.aClass85_1;
			Static283.anInt5294--;
			local9.aClass85_1 = null;
		}
		local9.aClass23_Sub2_Sub1_1 = arg0;
		return local9;
	}
}
