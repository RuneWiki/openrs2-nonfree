import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static253 {

	@OriginalMember(owner = "client!jca", name = "f", descriptor = "I")
	public static int anInt5086;

	@OriginalMember(owner = "client!jca", name = "a", descriptor = "Lclient!qe;")
	public static final Class268 aClass268_84 = new Class268(108, -2);

	@OriginalMember(owner = "client!jca", name = "c", descriptor = "[I")
	public static final int[] anIntArray289 = new int[200];

	@OriginalMember(owner = "client!jca", name = "e", descriptor = "Lclient!cda;")
	public static final Class47 aClass47_5 = new Class47("WIP", 2);

	@OriginalMember(owner = "client!jca", name = "a", descriptor = "(ZI)I")
	public static int method4540(@OriginalArg(1) int arg0) {
		return arg0 & 0xFF;
	}

	@OriginalMember(owner = "client!jca", name = "a", descriptor = "(IZ)V")
	public static void method4541(@OriginalArg(1) boolean arg0) {
		if (Static489.aString98.length() == 0) {
			return;
		}
		Static97.method1576("--> " + Static489.aString98);
		Static525.method7812(arg0, false, Static489.aString98);
		Static44.anInt872 = 0;
		Static180.anInt3707 = 0;
		Static489.aString98 = "";
	}
}
