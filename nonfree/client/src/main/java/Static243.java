import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static243 {

	@OriginalMember(owner = "client!ie", name = "m", descriptor = "[I")
	public static int[] anIntArray240;

	@OriginalMember(owner = "client!ie", name = "i", descriptor = "Lclient!iv;")
	public static final Class174 aClass174_2 = new Class174("game3", 2);

	@OriginalMember(owner = "client!ie", name = "k", descriptor = "[I")
	public static final int[] anIntArray239 = new int[] { 0, -1, 0, 1 };

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(Lclient!wga;Z)V")
	public static void method3479(@OriginalArg(0) Class41_Sub1_Sub1 arg0, @OriginalArg(1) boolean arg1) {
		for (@Pc(2) int local2 = arg0.aShort109; local2 <= arg0.aShort107; local2++) {
			for (@Pc(6) int local6 = arg0.aShort108; local6 <= arg0.aShort110; local6++) {
				@Pc(16) Class313 local16 = Static129.aClass313ArrayArrayArray7[arg0.aByte149][local2][local6];
				if (local16 != null) {
					@Pc(21) Class40 local21 = local16.aClass40_3;
					@Pc(23) Class40 local23 = null;
					while (local21 != null) {
						if (local21.aClass41_Sub1_Sub1_1 == arg0) {
							if (local23 == null) {
								local16.aClass40_3 = local21.aClass40_1;
							} else {
								local23.aClass40_1 = local21.aClass40_1;
							}
							local21.method626();
							break;
						}
						local23 = local21;
						local21 = local21.aClass40_1;
					}
				}
			}
		}
		if (!arg1) {
			Static65.method949(arg0);
		}
	}
}
