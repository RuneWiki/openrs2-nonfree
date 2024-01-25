import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static65 {

	@OriginalMember(owner = "client!ce", name = "fb", descriptor = "Lclient!lga;")
	public static final Class185 aClass185_18 = new Class185(6, 8);

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(IZ)V")
	public static void method1873() {
		@Pc(19) Class6_Sub17 local19 = Static330.method7824(Static30.aClass185_11, Static569.aClass134_2);
		Static452.method6867(local19);
		for (@Pc(27) Class6_Sub25 local27 = (Class6_Sub25) Static214.aClass380_15.method8755(); local27 != null; local27 = (Class6_Sub25) Static214.aClass380_15.method8752()) {
			if (!local27.method8791()) {
				local27 = (Class6_Sub25) Static214.aClass380_15.method8755();
				if (local27 == null) {
					break;
				}
			}
			if (local27.anInt5035 == 0) {
				Static360.method5823(true, local27, true);
			}
		}
		if (Static97.aClass302_2 != null) {
			Static580.method8049(Static97.aClass302_2);
			Static97.aClass302_2 = null;
		}
	}
}
