import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static199 {

	@OriginalMember(owner = "client!mk", name = "U", descriptor = "I")
	public static int anInt3969;

	@OriginalMember(owner = "client!mk", name = "Q", descriptor = "Lclient!tn;")
	public static final Class190 aClass190_22 = new Class190(16);

	@OriginalMember(owner = "client!mk", name = "S", descriptor = "Lclient!hc;")
	public static final Class85 aClass85_92 = new Class85("Loading world list data", "Lade Liste der Welten", "Chargement de la liste des serveurs", "Carregando dados da lista de mundos");

	@OriginalMember(owner = "client!mk", name = "V", descriptor = "I")
	public static int anInt3970 = -1;

	@OriginalMember(owner = "client!mk", name = "c", descriptor = "(III)I")
	public static int method3519(@OriginalArg(0) int arg0) {
		if (arg0 == -2) {
			return 12345678;
		} else if (arg0 == -1) {
			return 96;
		} else {
			@Pc(46) int local46 = (arg0 & 0x7F) * 96 >> 7;
			if (local46 < 2) {
				local46 = 2;
			} else if (local46 > 126) {
				local46 = 126;
			}
			return local46 + (arg0 & 0xFF80);
		}
	}

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(BIIII)V")
	public static void method3520(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg2 - arg3 >= Static163.anInt3234 && arg2 + arg3 <= Static353.anInt6760 && arg1 - arg3 >= Static75.anInt1447 && Static346.anInt6668 >= arg1 + arg3) {
			Static135.method698(arg2, arg3, arg0, arg1);
		} else {
			Static291.method5031(arg2, arg0, arg1, arg3);
		}
	}

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "([Ljava/lang/Object;[IB)V")
	public static void method3521(@OriginalArg(0) Object[] arg0, @OriginalArg(1) int[] arg1) {
		Static29.method537(0, arg1.length - 1, arg1, arg0);
	}
}
