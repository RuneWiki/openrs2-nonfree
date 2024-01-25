import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static145 {

	@OriginalMember(owner = "client!fs", name = "E", descriptor = "Lclient!gp;")
	public static Class117 aClass117_76;

	@OriginalMember(owner = "client!fs", name = "g", descriptor = "Lclient!bv;")
	public static final Class40 aClass40_46 = new Class40("Checking for updates - ", "Suche nach Updates - ", "Vérification des mises à jour - ", "Verificando atualizações - ");

	@OriginalMember(owner = "client!fs", name = "k", descriptor = "Lclient!oh;")
	public static Class220 aClass220_7 = null;

	@OriginalMember(owner = "client!fs", name = "n", descriptor = "I")
	public static int anInt3048 = 0;

	@OriginalMember(owner = "client!fs", name = "a", descriptor = "(III)V")
	public static void method2742(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		Static107.anInt2341 = arg0 - Static245.anInt7315;
		Static201.anInt3833 = arg1 - Static245.anInt7314;
	}

	@OriginalMember(owner = "client!fs", name = "f", descriptor = "(I)Z")
	public static boolean method2747() {
		try {
			if (Static332.anInt6296 == 2) {
				if (Static360.aClass5_Sub46_1 == null) {
					Static360.aClass5_Sub46_1 = Static558.method6685(Static409.aClass117_173, Static289.anInt5853, Static235.anInt4584);
					if (Static360.aClass5_Sub46_1 == null) {
						return false;
					}
				}
				if (Static126.aClass165_3 == null) {
					Static126.aClass165_3 = new Class165(Static151.aClass117_79, Static66.aClass117_32);
				}
				if (Static290.aClass5_Sub15_Sub4_1.method6538(Static126.aClass165_3, Static514.aClass117_218, Static360.aClass5_Sub46_1)) {
					Static290.aClass5_Sub15_Sub4_1.method6530();
					Static290.aClass5_Sub15_Sub4_1.method6528(Static296.anInt5926);
					Static290.aClass5_Sub15_Sub4_1.method6532(Static431.aBoolean537, Static360.aClass5_Sub46_1);
					Static360.aClass5_Sub46_1 = null;
					Static126.aClass165_3 = null;
					Static332.anInt6296 = 0;
					Static409.aClass117_173 = null;
					return true;
				}
			}
		} catch (@Pc(63) Exception local63) {
			local63.printStackTrace();
			Static290.aClass5_Sub15_Sub4_1.method6526();
			Static409.aClass117_173 = null;
			Static332.anInt6296 = 0;
			Static360.aClass5_Sub46_1 = null;
			Static126.aClass165_3 = null;
		}
		return false;
	}
}
