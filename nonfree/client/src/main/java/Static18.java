import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static18 {

	@OriginalMember(owner = "client!at", name = "d", descriptor = "[[[Lclient!fq;")
	public static Class80[][][] aClass80ArrayArrayArray2;

	@OriginalMember(owner = "client!at", name = "r", descriptor = "I")
	public static int anInt3463;

	@OriginalMember(owner = "client!at", name = "J", descriptor = "[I")
	public static int[] anIntArray306;

	@OriginalMember(owner = "client!at", name = "h", descriptor = "Lclient!hn;")
	public static final Class107 aClass107_118 = new Class107(39, 8);

	@OriginalMember(owner = "client!at", name = "B", descriptor = "Lclient!ak;")
	public static final Class7 aClass7_89 = new Class7("Loading interfaces - ", "Lade Benutzeroberfläche - ", "Chargement des interfaces - ", "Carregando interfaces - ");

	@OriginalMember(owner = "client!at", name = "F", descriptor = "Z")
	public static final boolean aBoolean211 = false;

	@OriginalMember(owner = "client!at", name = "a", descriptor = "(I)V")
	public static void method2990() {
		@Pc(1) Class134 local1 = Static223.aClass134_33;
		synchronized (Static223.aClass134_33) {
			Static223.aClass134_33.method3267();
		}
	}

	@OriginalMember(owner = "client!at", name = "a", descriptor = "(BI)V")
	public static void method2992(@OriginalArg(1) int arg0) {
		Static434.anInt7031 = 100;
		Static440.anInt7076 = 3;
		Static92.anInt1947 = -1;
		Static304.anInt5263 = arg0;
	}

	@OriginalMember(owner = "client!at", name = "a", descriptor = "(ZLjava/lang/String;ZLclient!la;)V")
	public static void method3000(@OriginalArg(0) boolean arg0, @OriginalArg(1) String arg1, @OriginalArg(3) Class71 arg2) {
		@Pc(25) int local25 = Static325.aClass151_103.method3473(250, null, arg1);
		@Pc(34) int local34 = Static325.aClass151_103.method3467(250, null, arg1) * 13;
		Static415.aClass39_11.O(6, 6, local25 + 4 + 4, local34 + 4 + 4, -16777216, 0);
		Static415.aClass39_11.method4513(6, 6, local25 + 8, local34 + 4 + 4, -1, 0);
		arg2.method5459(0, local25, null, arg1, -1, null, null, local34, 0, 10, 10, 1, -1);
		Static17.method466(6, local25 + 4 + 4, 6, local34 + 4 + 4);
		if (arg0) {
			Static415.aClass39_11.method4558();
		}
	}
}
