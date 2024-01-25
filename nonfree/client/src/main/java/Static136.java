import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static136 {

	@OriginalMember(owner = "client!en", name = "b", descriptor = "I")
	public static int anInt2908;

	@OriginalMember(owner = "client!en", name = "a", descriptor = "Lclient!kg;")
	public static final Class200 aClass200_60 = new Class200(93, 3);

	@OriginalMember(owner = "client!en", name = "c", descriptor = "I")
	public static int anInt2909 = 0;

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(Lclient!ii;Z)V")
	public static void method2506(@OriginalArg(0) Class16_Sub1_Sub1 arg0, @OriginalArg(1) boolean arg1) {
		for (@Pc(2) int local2 = arg0.aShort103; local2 <= arg0.aShort104; local2++) {
			for (@Pc(6) int local6 = arg0.aShort106; local6 <= arg0.aShort105; local6++) {
				@Pc(16) Class84 local16 = Static348.aClass84ArrayArrayArray5[arg0.aByte109][local2][local6];
				if (local16 != null) {
					@Pc(21) Class333 local21 = local16.aClass333_1;
					@Pc(23) Class333 local23 = null;
					while (local21 != null) {
						if (local21.aClass16_Sub1_Sub1_1 == arg0) {
							if (local23 == null) {
								local16.aClass333_1 = local21.aClass333_3;
							} else {
								local23.aClass333_3 = local21.aClass333_3;
							}
							local21.method7822();
							break;
						}
						local23 = local21;
						local21 = local21.aClass333_3;
					}
				}
			}
		}
		if (!arg1) {
			Static43.method1103(arg0);
		}
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(BI)Z")
	public static boolean method2507(@OriginalArg(0) byte arg0) {
		@Pc(7) int local7 = arg0 & 0xFF;
		if (local7 == 0) {
			return false;
		} else {
			return local7 < 128 || local7 >= 160 || Static45.aCharArray1[local7 - 128] != '\u0000';
		}
	}
}
