import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static352 {

	@OriginalMember(owner = "client!rv", name = "l", descriptor = "[Lclient!f;")
	public static Class3[] aClass3Array13;

	@OriginalMember(owner = "client!rv", name = "b", descriptor = "Lclient!gl;")
	public static final Class93 aClass93_6 = new Class93("", 16);

	@OriginalMember(owner = "client!rv", name = "h", descriptor = "[I")
	public static final int[] anIntArray557 = new int[] { 1, 0, -1, 0 };

	@OriginalMember(owner = "client!rv", name = "n", descriptor = "Lclient!pg;")
	public static final Class186 aClass186_210 = new Class186(39, -2);

	@OriginalMember(owner = "client!rv", name = "p", descriptor = "Lclient!cm;")
	public static final Class36 aClass36_112 = new Class36(57, 3);

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "([[[Lclient!dr;I)V")
	public static void method4939(@OriginalArg(0) Class53[][][] arg0) {
		for (@Pc(7) int local7 = 0; local7 < arg0.length; local7++) {
			@Pc(13) Class53[][] local13 = arg0[local7];
			for (@Pc(15) int local15 = 0; local15 < local13.length; local15++) {
				for (@Pc(19) int local19 = 0; local19 < local13[local15].length; local19++) {
					@Pc(27) Class53 local27 = local13[local15][local19];
					if (local27 != null) {
						if (local27.aClass6_Sub4_1 instanceof Interface11) {
							((Interface11) local27.aClass6_Sub4_1).method5647();
						}
						if (local27.aClass6_Sub3_1 instanceof Interface11) {
							((Interface11) local27.aClass6_Sub3_1).method5647();
						}
						if (local27.aClass6_Sub3_2 instanceof Interface11) {
							((Interface11) local27.aClass6_Sub3_2).method5647();
						}
						if (local27.aClass6_Sub1_1 instanceof Interface11) {
							((Interface11) local27.aClass6_Sub1_1).method5647();
						}
						if (local27.aClass6_Sub1_2 instanceof Interface11) {
							((Interface11) local27.aClass6_Sub1_2).method5647();
						}
						for (@Pc(77) Class165 local77 = local27.aClass165_1; local77 != null; local77 = local77.aClass165_2) {
							@Pc(82) Class6_Sub2 local82 = local77.aClass6_Sub2_2;
							if (local82 instanceof Interface11) {
								((Interface11) local82).method5647();
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "(IIIIZ)V")
	public static void method4941(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3) {
		Static158.aLong77 = 0L;
		@Pc(8) int local8 = Static144.method2104();
		if (arg2 == 3 || local8 == 3) {
			arg3 = true;
		}
		if (!Static16.aClass30_11.method4688()) {
			arg3 = true;
		}
		Static5.method159(arg3, local8, arg2, arg1, arg0);
	}
}
