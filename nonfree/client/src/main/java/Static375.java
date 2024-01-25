import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static375 {

	@OriginalMember(owner = "client!st", name = "a", descriptor = "Lclient!ml;")
	public static Class160 aClass160_3;

	@OriginalMember(owner = "client!st", name = "j", descriptor = "F")
	public static float aFloat98;

	@OriginalMember(owner = "client!st", name = "m", descriptor = "I")
	public static int anInt6251;

	@OriginalMember(owner = "client!st", name = "d", descriptor = "I")
	public static int anInt6248 = 0;

	@OriginalMember(owner = "client!st", name = "f", descriptor = "[I")
	public static final int[] anIntArray539 = new int[50];

	@OriginalMember(owner = "client!st", name = "i", descriptor = "I")
	public static int anInt6250 = 0;

	@OriginalMember(owner = "client!st", name = "k", descriptor = "Lclient!rb;")
	public static final Class211 aClass211_131 = new Class211(42, 3);

	@OriginalMember(owner = "client!st", name = "l", descriptor = "Lclient!rb;")
	public static final Class211 aClass211_132 = new Class211(84, 10);

	@OriginalMember(owner = "client!st", name = "n", descriptor = "Lclient!kc;")
	public static final Class134 aClass134_86 = new Class134("Loading interfaces - ", "Lade Benutzeroberfläche - ", "Chargement des interfaces - ", "Carregando interfaces - ");

	@OriginalMember(owner = "client!st", name = "a", descriptor = "(I)J")
	public static long method4873() {
		return Static336.aClass140_1.method5403();
	}

	@OriginalMember(owner = "client!st", name = "a", descriptor = "(IIIII)Z")
	public static boolean method4874(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if ((Static253.aByteArrayArrayArray11[0][arg3][arg2] & 0x2) != 0) {
			return true;
		} else if ((Static253.aByteArrayArrayArray11[arg0][arg3][arg2] & 0x10) == 0) {
			return arg1 == Static204.method2724(arg3, arg0, arg2);
		} else {
			return false;
		}
	}
}
