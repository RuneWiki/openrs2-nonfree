import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static344 {

	@OriginalMember(owner = "client!lia", name = "v", descriptor = "Z")
	public static boolean aBoolean410 = false;

	@OriginalMember(owner = "client!lia", name = "a", descriptor = "(II)V")
	public static void method5168(@OriginalArg(1) int arg0) {
		if (arg0 != -1 && Static509.aBooleanArray39[arg0]) {
			Static322.aClass15_85.method539(arg0);
			Static489.aClass260ArrayArray3[arg0] = null;
			Static285.aClass260ArrayArray4[arg0] = null;
			Static509.aBooleanArray39[arg0] = false;
		}
	}

	@OriginalMember(owner = "client!lia", name = "a", descriptor = "([[[Lclient!jd;I)V")
	public static void method5170(@OriginalArg(0) Class164[][][] arg0) {
		for (@Pc(7) int local7 = 0; local7 < arg0.length; local7++) {
			@Pc(13) Class164[][] local13 = arg0[local7];
			for (@Pc(15) int local15 = 0; local15 < local13.length; local15++) {
				for (@Pc(19) int local19 = 0; local19 < local13[local15].length; local19++) {
					@Pc(27) Class164 local27 = local13[local15][local19];
					if (local27 != null) {
						if (local27.aClass28_Sub1_Sub3_1 instanceof Interface11) {
							((Interface11) local27.aClass28_Sub1_Sub3_1).method9219();
						}
						if (local27.aClass28_Sub1_Sub2_2 instanceof Interface11) {
							((Interface11) local27.aClass28_Sub1_Sub2_2).method9219();
						}
						if (local27.aClass28_Sub1_Sub2_1 instanceof Interface11) {
							((Interface11) local27.aClass28_Sub1_Sub2_1).method9219();
						}
						if (local27.aClass28_Sub1_Sub4_2 instanceof Interface11) {
							((Interface11) local27.aClass28_Sub1_Sub4_2).method9219();
						}
						if (local27.aClass28_Sub1_Sub4_1 instanceof Interface11) {
							((Interface11) local27.aClass28_Sub1_Sub4_1).method9219();
						}
						for (@Pc(77) Class125 local77 = local27.aClass125_2; local77 != null; local77 = local77.aClass125_1) {
							@Pc(82) Class28_Sub1_Sub1 local82 = local77.aClass28_Sub1_Sub1_1;
							if (local82 instanceof Interface11) {
								((Interface11) local82).method9219();
							}
						}
					}
				}
			}
		}
	}
}
