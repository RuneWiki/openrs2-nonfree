import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static509 {

	@OriginalMember(owner = "client!qw", name = "n", descriptor = "I")
	public static int anInt8459 = -1;

	@OriginalMember(owner = "client!qw", name = "a", descriptor = "(I)V")
	public static void method7379() {
		if (Static635.anInt9910 == -1) {
			return;
		}
		@Pc(12) int local12 = Static331.aClass42_8.method6019();
		@Pc(16) int local16 = Static331.aClass42_8.method6014();
		@Pc(21) Class6_Sub9 local21 = (Class6_Sub9) Static518.aClass340_65.method8124();
		if (local21 != null) {
			local12 = local21.method7137();
			local16 = local21.method7139();
		}
		@Pc(33) int local33 = 0;
		@Pc(35) int local35 = 0;
		if (Static93.aBoolean113) {
			local33 = Static24.method290();
			local35 = Static488.method7227();
		}
		Static298.method4809(Static635.anInt9910, local35, local33, local16, local33 + Static535.anInt4128, local35 + local16, Static274.anInt3226 + local35, local12, local33, local12 + local33, local35);
		if (Static88.aClass381_2 != null) {
			Static613.method8458(local16 + local35, local12 - -local33);
		}
	}
}
