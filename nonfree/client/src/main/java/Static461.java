import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static461 {

	@OriginalMember(owner = "client!ol", name = "n", descriptor = "Z")
	public static boolean aBoolean646;

	@OriginalMember(owner = "client!ol", name = "C", descriptor = "Lclient!tda;")
	public static final Class349 aClass349_107 = new Class349(34, 3);

	@OriginalMember(owner = "client!ol", name = "w", descriptor = "[Lclient!ih;")
	public static Class177[] aClass177Array1 = new Class177[50];

	@OriginalMember(owner = "client!ol", name = "u", descriptor = "Lclient!lha;")
	public static final Class222 aClass222_1 = new Class222();

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(Lclient!efa;I)I")
	public static int method6669(@OriginalArg(0) Class4_Sub2_Sub1_Sub2_Sub2 arg0) {
		@Pc(8) Class261 local8 = arg0.aClass261_1;
		if (local8.anIntArray499 != null) {
			local8 = local8.method6272(Static396.aClass107_1);
			if (local8 == null) {
				return -1;
			}
		}
		@Pc(24) int local24 = local8.anInt7032;
		@Pc(28) Class49 local28 = arg0.method2064(-117);
		@Pc(33) int local33 = arg0.aClass53_6.method4088();
		if (local33 == -1 || arg0.aBoolean248) {
			local24 = local8.anInt7001;
		} else if (local33 == local28.anInt1071 || local28.anInt1057 == local33 || local28.anInt1059 == local33 || local28.anInt1100 == local33) {
			local24 = local8.anInt7037;
		} else if (local33 == local28.anInt1055 || local28.anInt1097 == local33 || local33 == local28.anInt1062 || local28.anInt1069 == local33) {
			local24 = local8.anInt7012;
		}
		return local24;
	}
}
