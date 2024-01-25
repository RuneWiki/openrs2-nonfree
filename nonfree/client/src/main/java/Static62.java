import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static62 {

	@OriginalMember(owner = "client!cf", name = "b", descriptor = "I")
	public static final int anInt10309 = 328;

	@OriginalMember(owner = "client!cf", name = "h", descriptor = "Lclient!iv;")
	public static final Class158 aClass158_19 = new Class158();

	@OriginalMember(owner = "client!cf", name = "c", descriptor = "(I)V")
	public static void method8024() {
		if (!Static333.aBoolean440) {
			return;
		}
		while (true) {
			while (Static357.anInt6909 < Static353.aClass222_Sub1Array1.length) {
				@Pc(26) Class222_Sub1 local26 = Static353.aClass222_Sub1Array1[Static357.anInt6909];
				if (local26 != null && local26.anInt10278 == -1) {
					if (Static363.aClass4_Sub46_2 == null) {
						Static363.aClass4_Sub46_2 = Static587.aClass164_1.method3934(local26.aString224);
					}
					@Pc(50) int local50 = Static363.aClass4_Sub46_2.anInt9249;
					if (local50 == -1) {
						return;
					}
					local26.anInt10278 = local50;
					Static363.aClass4_Sub46_2 = null;
					Static357.anInt6909++;
				} else {
					Static357.anInt6909++;
				}
			}
			return;
		}
	}
}
