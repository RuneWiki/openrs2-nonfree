import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static268 {

	@OriginalMember(owner = "client!nh", name = "l", descriptor = "Lclient!dk;")
	public static Class54 aClass54_76;

	@OriginalMember(owner = "client!nh", name = "j", descriptor = "Lclient!kc;")
	public static final Class134 aClass134_65 = new Class134("Loaded update list", "Update-Liste geladen.", "Liste des mises à jour chargée", "Lista de atualizações carregada");

	@OriginalMember(owner = "client!nh", name = "b", descriptor = "(I)V")
	public static void method3631() {
		try {
			if (Static76.anInt1460 == 1) {
				@Pc(17) int local17 = Static84.aClass2_Sub1_Sub2_3.method599();
				if (local17 > 0 && Static84.aClass2_Sub1_Sub2_3.method600()) {
					local17 -= Static228.anInt3708;
					if (local17 < 0) {
						local17 = 0;
					}
					Static84.aClass2_Sub1_Sub2_3.method574(local17);
				} else {
					Static84.aClass2_Sub1_Sub2_3.method572();
					Static84.aClass2_Sub1_Sub2_3.method605();
					Static424.aClass2_Sub32_3 = null;
					if (Static412.aClass54_111 == null) {
						Static76.anInt1460 = 0;
					} else {
						Static76.anInt1460 = 2;
					}
					Static294.aClass227_2 = null;
				}
			}
		} catch (@Pc(63) Exception local63) {
			local63.printStackTrace();
			Static84.aClass2_Sub1_Sub2_3.method572();
			Static412.aClass54_111 = null;
			Static424.aClass2_Sub32_3 = null;
			Static76.anInt1460 = 0;
			Static294.aClass227_2 = null;
		}
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(IB)Z")
	public static boolean method3635(@OriginalArg(0) int arg0) {
		return arg0 == 3 || arg0 == 4;
	}
}
