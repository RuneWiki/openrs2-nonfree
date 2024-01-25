import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static60 {

	@OriginalMember(owner = "client!cg", name = "i", descriptor = "Lclient!faa;")
	public static final Class91 aClass91_3 = new Class91(16);

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(Lclient!tg;Z)V")
	public static void method1000(@OriginalArg(0) Class11_Sub1_Sub1 arg0, @OriginalArg(1) boolean arg1) {
		for (@Pc(2) int local2 = arg0.aShort90; local2 <= arg0.aShort91; local2++) {
			for (@Pc(6) int local6 = arg0.aShort88; local6 <= arg0.aShort89; local6++) {
				@Pc(16) Class360 local16 = Static568.aClass360ArrayArrayArray22[arg0.aByte113][local2][local6];
				if (local16 != null) {
					@Pc(21) Class21 local21 = local16.aClass21_4;
					@Pc(23) Class21 local23 = null;
					while (local21 != null) {
						if (local21.aClass11_Sub1_Sub1_1 == arg0) {
							if (local23 == null) {
								local16.aClass21_4 = local21.aClass21_1;
							} else {
								local23.aClass21_1 = local21.aClass21_1;
							}
							local21.method639();
							break;
						}
						local23 = local21;
						local21 = local21.aClass21_1;
					}
				}
			}
		}
		if (!arg1) {
			Static328.method4862(arg0);
		}
	}
}
