import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static82 {

	@OriginalMember(owner = "client!f", name = "J", descriptor = "I")
	public static int anInt1847 = 765;

	@OriginalMember(owner = "client!f", name = "M", descriptor = "Lclient!jn;")
	public static final Class106 aClass106_66 = new Class106("Loading world list data", "Lade Liste der Welten", "Chargement de la liste des serveurs", "Carregando dados da lista de mundos");

	@OriginalMember(owner = "client!f", name = "P", descriptor = "Z")
	public static boolean aBoolean133 = false;

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(Lclient!at;B)Lclient!wq;")
	public static Class25_Sub3 method1766(@OriginalArg(0) Class1_Sub7 arg0) {
		return new Class25_Sub3(arg0.method2141(), arg0.method2141(), arg0.method2141(), arg0.method2141(), arg0.method2119(), arg0.method2119(), arg0.method2132());
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(IIIB)V")
	public static void method1767(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		Static331.anInt6243 = arg1;
		Static320.anInt4363 = arg0;
		Static254.anInt5167 = arg2;
	}

	@OriginalMember(owner = "client!f", name = "h", descriptor = "(I)V")
	public static void method1769() {
		if (Static61.aClass48_4 != null) {
			Static61.aClass48_4.method1830();
		}
		if (Static284.aClass48_12 != null) {
			Static284.aClass48_12.method1830();
		}
	}

	@OriginalMember(owner = "client!f", name = "d", descriptor = "(III)Lclient!hl;")
	public static Class11_Sub3 method1770(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class155 local7 = Static105.aClass155ArrayArrayArray3[arg0][arg1][arg2];
		if (local7 == null) {
			return null;
		} else {
			@Pc(14) Class11_Sub3 local14 = local7.aClass11_Sub3_1;
			local7.aClass11_Sub3_1 = null;
			return local14;
		}
	}
}
