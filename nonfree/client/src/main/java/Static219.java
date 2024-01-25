import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static219 {

	@OriginalMember(owner = "client!hfa", name = "b", descriptor = "Z")
	public static volatile boolean aBoolean352 = true;

	@OriginalMember(owner = "client!hfa", name = "a", descriptor = "(Z)V")
	public static void method4050() {
		if (!Static213.aBoolean347) {
			return;
		}
		while (true) {
			while (Static641.anInt11087 < Static604.aClass234_Sub1Array2.length) {
				@Pc(25) Class234_Sub1 local25 = Static604.aClass234_Sub1Array2[Static641.anInt11087];
				if (local25 != null && local25.anInt7095 == -1) {
					if (Static396.aClass2_Sub22_2 == null) {
						Static396.aClass2_Sub22_2 = Static40.aClass188_1.method4912(local25.aString85);
					}
					@Pc(49) int local49 = Static396.aClass2_Sub22_2.anInt2415;
					if (local49 == -1) {
						return;
					}
					local25.anInt7095 = local49;
					Static641.anInt11087++;
					Static396.aClass2_Sub22_2 = null;
				} else {
					Static641.anInt11087++;
				}
			}
			return;
		}
	}
}
