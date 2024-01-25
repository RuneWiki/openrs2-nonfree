import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static213 {

	@OriginalMember(owner = "client!og", name = "e", descriptor = "Ljava/lang/String;")
	public static String aString172 = "Discard";

	@OriginalMember(owner = "client!og", name = "f", descriptor = "I")
	public static int anInt4529 = 0;

	@OriginalMember(owner = "client!og", name = "p", descriptor = "[I")
	public static final int[] anIntArray421 = new int[200];

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(Lclient!lm;B)V")
	public static void method3950(@OriginalArg(0) Class134 arg0) {
		Static277.aClass134_127 = arg0;
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(B)V")
	public static void method3953() {
		@Pc(1) Class37 local1 = Static165.aClass37_54;
		synchronized (Static165.aClass37_54) {
			Static165.aClass37_54.method919();
		}
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(II)V")
	public static void method3954(@OriginalArg(0) int arg0) {
		Static206.anInt4319 = arg0;
		Static245.aClass37_20.method919();
	}
}
