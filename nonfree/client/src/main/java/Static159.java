import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static159 {

	@OriginalMember(owner = "client!hu", name = "Q", descriptor = "Lclient!rh;")
	public static Class218 aClass218_1;

	@OriginalMember(owner = "client!hu", name = "H", descriptor = "Lclient!qv;")
	public static final Class214 aClass214_113 = new Class214(16, 20);

	@OriginalMember(owner = "client!hu", name = "O", descriptor = "I")
	public static int anInt3240 = 0;

	@OriginalMember(owner = "client!hu", name = "P", descriptor = "I")
	public static int anInt3241 = 0;

	@OriginalMember(owner = "client!hu", name = "R", descriptor = "Lclient!bd;")
	public static final Class21 aClass21_41 = new Class21("Checking for updates - ", "Suche nach Updates - ", "Vérification des mises à jour - ", "Verificando atualizações - ");

	@OriginalMember(owner = "client!hu", name = "S", descriptor = "Lclient!qt;")
	public static final Class212 aClass212_48 = new Class212(21, 7);

	@OriginalMember(owner = "client!hu", name = "b", descriptor = "(IB)I")
	public static int method2895(@OriginalArg(0) int arg0) {
		return arg0 & 0xFF;
	}

	@OriginalMember(owner = "client!hu", name = "a", descriptor = "(IZ)Z")
	public static boolean method2896(@OriginalArg(0) int arg0) {
		return arg0 == 0 || arg0 == 1 || arg0 == 2;
	}
}
