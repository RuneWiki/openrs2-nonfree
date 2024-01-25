import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static377 {

	@OriginalMember(owner = "client!ph", name = "b", descriptor = "I")
	public static int anInt9639 = 0;

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(B)Z")
	public static boolean method7984() {
		@Pc(7) Class12 local7 = Static192.aClass73_33.aClass12_47.aClass12_284;
		if (local7 == null || local7 == Static192.aClass73_33.aClass12_47) {
			return false;
		}
		@Pc(18) Class12_Sub20 local18 = (Class12_Sub20) local7;
		if (local18.anInt4329 >= 2000) {
			local18.anInt4329 -= 2000;
		}
		return local18.anInt4329 == 1009;
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(Z)Z")
	public static boolean method7985() {
		try {
			if (Static111.anInt2588 == 2) {
				if (Static108.aClass12_Sub45_1 == null) {
					Static108.aClass12_Sub45_1 = Static557.method6735(Static444.aClass16_104, Static105.anInt2408, Static83.anInt2006);
					if (Static108.aClass12_Sub45_1 == null) {
						return false;
					}
				}
				if (Static351.aClass132_1 == null) {
					Static351.aClass132_1 = new Class132(Static65.aClass16_14, Static476.aClass16_23);
				}
				if (Static493.aClass12_Sub13_Sub2_3.method4255(Static216.aClass16_57, Static351.aClass132_1, Static108.aClass12_Sub45_1)) {
					Static493.aClass12_Sub13_Sub2_3.method4274();
					Static493.aClass12_Sub13_Sub2_3.method4262(Static512.anInt9218);
					Static493.aClass12_Sub13_Sub2_3.method4261(Static108.aClass12_Sub45_1, Static340.aBoolean475);
					Static444.aClass16_104 = null;
					Static111.anInt2588 = 0;
					Static351.aClass132_1 = null;
					Static108.aClass12_Sub45_1 = null;
					return true;
				}
			}
		} catch (@Pc(65) Exception local65) {
			local65.printStackTrace();
			Static493.aClass12_Sub13_Sub2_3.method4242();
			Static108.aClass12_Sub45_1 = null;
			Static111.anInt2588 = 0;
			Static444.aClass16_104 = null;
			Static351.aClass132_1 = null;
		}
		return false;
	}
}
