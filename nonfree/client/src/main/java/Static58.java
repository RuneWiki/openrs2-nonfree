import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static58 {

	@OriginalMember(owner = "client!db", name = "e", descriptor = "I")
	public static int anInt1317;

	@OriginalMember(owner = "client!db", name = "k", descriptor = "Z")
	public static boolean aBoolean79;

	@OriginalMember(owner = "client!db", name = "m", descriptor = "[Lclient!ta;")
	public static Class64[] aClass64Array1;

	@OriginalMember(owner = "client!db", name = "n", descriptor = "[I")
	public static int[] anIntArray87;

	@OriginalMember(owner = "client!db", name = "b", descriptor = "Lclient!qp;")
	public static final Class209 aClass209_31 = new Class209("Attack", "Angreifen", "Attaquer", "Atacar");

	@OriginalMember(owner = "client!db", name = "i", descriptor = "I")
	public static int anInt1319 = 0;

	@OriginalMember(owner = "client!db", name = "l", descriptor = "Lclient!jq;")
	public static final Class2_Sub21 aClass2_Sub21_1 = new Class2_Sub21(0, 0);

	@OriginalMember(owner = "client!db", name = "o", descriptor = "[I")
	public static final int[] anIntArray88 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(III)Z")
	public static boolean method1145(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (Static362.method4949(arg0, arg1) | Static135.method2303(arg0, arg1) | Static335.method771(arg0, arg1)) & Static207.method3261(arg1, arg0);
	}
}
