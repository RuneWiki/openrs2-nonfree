import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static330 {

	@OriginalMember(owner = "client!vf", name = "J", descriptor = "B")
	public static byte aByte74;

	@OriginalMember(owner = "client!vf", name = "S", descriptor = "I")
	public static int anInt6402;

	@OriginalMember(owner = "client!vf", name = "L", descriptor = "I")
	public static int anInt6398 = 0;

	@OriginalMember(owner = "client!vf", name = "M", descriptor = "[C")
	public static final char[] aCharArray11 = new char[] { ' ', ' ', '_', '-', 'à', 'á', 'â', 'ä', 'ã', 'À', 'Á', 'Â', 'Ä', 'Ã', 'è', 'é', 'ê', 'ë', 'È', 'É', 'Ê', 'Ë', 'í', 'î', 'ï', 'Í', 'Î', 'Ï', 'ò', 'ó', 'ô', 'ö', 'õ', 'Ò', 'Ó', 'Ô', 'Ö', 'Õ', 'ù', 'ú', 'û', 'ü', 'Ù', 'Ú', 'Û', 'Ü', 'ç', 'Ç', 'ÿ', 'Ÿ', 'ñ', 'Ñ', 'ß' };

	@OriginalMember(owner = "client!vf", name = "N", descriptor = "[Z")
	public static final boolean[] aBooleanArray30 = new boolean[100];

	@OriginalMember(owner = "client!vf", name = "U", descriptor = "Ljava/lang/String;")
	public static String aString236 = "Loaded textures";

	@OriginalMember(owner = "client!vf", name = "d", descriptor = "(Z)V")
	public static void method5420() {
		Static67.aClass181Array1 = null;
		Static23.method438(Static191.anInt3991, 0, -1, Static171.anInt3583, 0, 0, 0, Static298.anInt5944);
		if (Static67.aClass181Array1 != null) {
			Static98.method1678(Static298.anInt5944, Static171.anInt3583, Static94.anInt1921, Static67.aClass181Array1, Static163.aClass181_28.anInt5735, -1412584499, 0, 0, Static90.anInt1794);
			Static67.aClass181Array1 = null;
		}
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(ZIIBI)Lclient!nn;")
	public static Class3_Sub32 method5421(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(7) Class3_Sub32 local7 = new Class3_Sub32();
		local7.anInt4348 = arg3;
		local7.anInt4349 = arg1;
		Static188.aClass24_21.method598((long) arg2, local7);
		Static38.method679(arg3);
		@Pc(33) Class181 local33 = Static20.method415(arg2);
		if (local33 != null) {
			Static316.method5250(local33);
		}
		if (Static346.aClass181_57 != null) {
			Static316.method5250(Static346.aClass181_57);
			Static346.aClass181_57 = null;
		}
		Static313.method5228();
		if (local33 != null) {
			Static140.method2299(!arg0, local33);
		}
		if (!arg0) {
			Static139.method2274(arg3);
		}
		if (!arg0 && Static191.anInt3991 != -1) {
			Static82.method1278(Static191.anInt3991, 1);
		}
		return local7;
	}
}
