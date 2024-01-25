import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static165 {

	@OriginalMember(owner = "client!fha", name = "a", descriptor = "(I)V")
	public static void method2760() {
		if (!Static40.aBoolean104) {
			return;
		}
		while (true) {
			while (Static491.aClass31_Sub1Array7.length > Static175.anInt3314) {
				@Pc(20) Class31_Sub1 local20 = Static491.aClass31_Sub1Array7[Static175.anInt3314];
				if (local20 != null && local20.anInt10063 == -1) {
					if (Static559.aClass3_Sub55_2 == null) {
						Static559.aClass3_Sub55_2 = Static227.aClass358_1.method8042(local20.aString130);
					}
					@Pc(44) int local44 = Static559.aClass3_Sub55_2.anInt10339;
					if (local44 == -1) {
						return;
					}
					local20.anInt10063 = local44;
					Static175.anInt3314++;
					Static559.aClass3_Sub55_2 = null;
				} else {
					Static175.anInt3314++;
				}
			}
			return;
		}
	}
}
