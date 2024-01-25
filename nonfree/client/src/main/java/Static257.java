import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static257 {

	@OriginalMember(owner = "client!mw", name = "F", descriptor = "Ljava/lang/Object;")
	public static Object anObject5;

	@OriginalMember(owner = "client!mw", name = "O", descriptor = "I")
	public static int anInt4975;

	@OriginalMember(owner = "client!mw", name = "o", descriptor = "Lclient!qv;")
	public static final Class214 aClass214_153 = new Class214(34, 14);

	@OriginalMember(owner = "client!mw", name = "M", descriptor = "[C")
	public static final char[] aCharArray3 = new char[] { '[', ']', '#' };

	@OriginalMember(owner = "client!mw", name = "N", descriptor = "Lclient!bd;")
	public static final Class21 aClass21_70 = new Class21("Starting 3D Library", "Starte 3D-Softwarebibliothek.", "Démarrage de la librairie 3D", "Iniciando biblioteca 3D");

	@OriginalMember(owner = "client!mw", name = "b", descriptor = "(II)Z")
	public static boolean method4208(@OriginalArg(1) int arg0) {
		return arg0 == 3 || arg0 == 7 || arg0 == 10;
	}

	@OriginalMember(owner = "client!mw", name = "a", descriptor = "()V")
	public static void method4209() {
		for (@Pc(1) int local1 = 0; local1 < Static132.anInt2706; local1++) {
			@Pc(6) Class11_Sub5 local6 = Static95.aClass11_Sub5Array1[local1];
			Static248.method4081(local6);
			Static95.aClass11_Sub5Array1[local1] = null;
		}
		Static132.anInt2706 = 0;
	}

	@OriginalMember(owner = "client!mw", name = "a", descriptor = "([BIII)[B")
	public static byte[] method4211(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		@Pc(14) byte[] local14 = new byte[32768];
		Static474.method3327(arg0, arg1, local14, 0, 32768);
		return local14;
	}
}
