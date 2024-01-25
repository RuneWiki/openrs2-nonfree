import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static438 {

	@OriginalMember(owner = "client!rb", name = "y", descriptor = "I")
	public static int anInt7792;

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(ILclient!faa;BI)V")
	public static void method6207(@OriginalArg(0) int arg0, @OriginalArg(1) Class97 arg1, @OriginalArg(3) int arg2) {
		@Pc(16) Class17 local16 = arg1.method2294(Static554.aClass90_12);
		if (local16 == null) {
			return;
		}
		Static554.aClass90_12.ca(arg2, arg0, arg2 + arg1.anInt2690, arg0 + arg1.anInt2670);
		if (Static154.anInt2875 >= 3) {
			Static554.aClass90_12.L(-16777216, local16, arg2, arg0);
		} else {
			Static171.aClass71_55.method7772((float) arg2 + (float) arg1.anInt2690 / 2.0F, (float) arg0 + (float) arg1.anInt2670 / 2.0F, ((int) -Static562.aFloat14 & 0x3FFF) << 2, local16, arg2, arg0);
		}
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(Lclient!bt;)V")
	public static void method6209(@OriginalArg(0) Class15_Sub2 arg0) {
		for (@Pc(2) int local2 = arg0.aShort116; local2 <= arg0.aShort115; local2++) {
			for (@Pc(6) int local6 = arg0.aShort114; local6 <= arg0.aShort117; local6++) {
				@Pc(16) Class133 local16 = Static113.aClass133ArrayArrayArray1[arg0.aByte98][local2][local6];
				if (local16 != null) {
					@Pc(21) Class315 local21 = local16.aClass315_1;
					@Pc(23) Class315 local23 = null;
					while (local21 != null) {
						if (local21.aClass15_Sub2_2 == arg0) {
							if (local23 == null) {
								local16.aClass315_1 = local21.aClass315_3;
							} else {
								local23.aClass315_3 = local21.aClass315_3;
							}
							local21.method7058();
							break;
						}
						local23 = local21;
						local21 = local21.aClass315_3;
					}
					local16.aByte46 = 0;
					for (@Pc(56) Class315 local56 = local16.aClass315_1; local56 != null; local56 = local56.aClass315_3) {
						local16.aByte46 = (byte) (local16.aByte46 | local56.anInt8858);
					}
				}
			}
		}
	}
}
