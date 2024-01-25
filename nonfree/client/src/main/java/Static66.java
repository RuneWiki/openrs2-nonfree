import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static66 {

	@OriginalMember(owner = "client!ck", name = "s", descriptor = "Lclient!gp;")
	public static Class117 aClass117_32;

	@OriginalMember(owner = "client!ck", name = "w", descriptor = "I")
	public static int anInt1272;

	// $FF: synthetic field
	@OriginalMember(owner = "client!ck", name = "x", descriptor = "Ljava/lang/Class;")
	private static Class aClass1;

	@OriginalMember(owner = "client!ck", name = "r", descriptor = "Lclient!ed;")
	public static final Class77 aClass77_4 = new Class77();

	@OriginalMember(owner = "client!ck", name = "t", descriptor = "[I")
	public static final int[] anIntArray161 = new int[4];

	@OriginalMember(owner = "client!ck", name = "u", descriptor = "Lclient!bv;")
	public static final Class40 aClass40_20 = new Class40("Loaded update list", "Update-Liste geladen.", "Liste des mises à jour chargée", "Lista de atualizações carregada");

	@OriginalMember(owner = "client!ck", name = "v", descriptor = "[Lclient!bj;")
	public static final Class31[] aClass31Array1 = new Class31[14];

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(ZLjava/lang/String;)Z")
	public static boolean method1216(@OriginalArg(1) String arg0) {
		return Static157.method2865(aClass1 == null ? (aClass1 = Class52.a("cr")) : aClass1, arg0);
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(IIB)Z")
	public static boolean method1217(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x84080) != 0;
	}
}
