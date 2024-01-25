import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static19 {

	@OriginalMember(owner = "client!at", name = "J", descriptor = "I")
	public static int anInt343;

	@OriginalMember(owner = "client!at", name = "I", descriptor = "[I")
	public static final int[] anIntArray27 = new int[4096];

	@OriginalMember(owner = "client!at", name = "M", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray2 = new String[100];

	@OriginalMember(owner = "client!at", name = "N", descriptor = "Z")
	public static boolean aBoolean27 = false;

	@OriginalMember(owner = "client!at", name = "S", descriptor = "I")
	public static int anInt349 = -50;

	@OriginalMember(owner = "client!at", name = "T", descriptor = "[I")
	public static final int[] anIntArray28 = new int[] { 0, 1, 2, 3, 4, 5, 6, 14 };

	@OriginalMember(owner = "client!at", name = "a", descriptor = "(IIIZLclient!za;ILclient!la;)V")
	public static void method277(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) Class50 arg4, @OriginalArg(6) Class57 arg5) {
		if (arg3) {
			Static270.aClass80_15.method5558((Static90.anInt1891 - Static270.aClass80_15.RA()) / 2, (Static340.anInt5756 - Static270.aClass80_15.Q()) / 2);
			Static402.aClass80_23.method5558((Static90.anInt1891 - Static402.aClass80_23.RA()) / 2, 18);
		}
		@Pc(31) String local31 = "";
		if (Static102.aClass147_3 == Static53.aClass147_2) {
			local31 = Static185.aClass182_197.method4155(Static191.anInt3842);
		} else if (Static424.aClass147_4 == Static102.aClass147_3) {
			local31 = Static406.aClass182_233.method4155(Static191.anInt3842);
		}
		arg5.method5953(Static90.anInt1891 / 2, local31, arg0, Static340.anInt5756 / 2 - 26, -1);
		@Pc(74) int local74 = Static340.anInt5756 / 2 - 18;
		arg4.method5811(Static90.anInt1891 / 2 - 152, local74, 304, 34, arg2, 0);
		arg4.method5811(Static90.anInt1891 / 2 - 151, local74 - -1, 302, 32, 0, 0);
		arg4.P(Static90.anInt1891 / 2 - 150, local74 + 2, Static245.anInt4434 * 3, 30, arg1, 0);
		arg4.P(Static245.anInt4434 * 3 + Static90.anInt1891 / 2 - 150, local74 + 2, 300 - Static245.anInt4434 * 3, 30, 0, 0);
		arg5.method5953(Static90.anInt1891 / 2, Static88.aString70, arg0, Static340.anInt5756 / 2 + 4, -1);
	}

	@OriginalMember(owner = "client!at", name = "d", descriptor = "(I)V")
	public static void method278() {
		if (Static456.aClass50_11 != null) {
			Static456.aClass50_11.method5815();
			Static92.aClass57_1 = null;
			Static456.aClass50_11 = null;
		}
	}
}
