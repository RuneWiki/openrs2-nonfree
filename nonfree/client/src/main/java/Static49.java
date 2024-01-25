import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static49 {

	@OriginalMember(owner = "client!cs", name = "u", descriptor = "[I")
	public static int[] anIntArray108;

	@OriginalMember(owner = "client!cs", name = "m", descriptor = "Z")
	public static boolean aBoolean76 = false;

	@OriginalMember(owner = "client!cs", name = "s", descriptor = "[I")
	public static final int[] anIntArray107 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!cs", name = "v", descriptor = "[I")
	public static final int[] anIntArray109 = new int[4096];

	@OriginalMember(owner = "client!cs", name = "x", descriptor = "Ljava/lang/String;")
	public static final String aString38 = "flash1:";

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "(IILclient!mb;)Ljava/lang/String;")
	public static String method841(@OriginalArg(0) int arg0, @OriginalArg(2) Class132 arg1) {
		if (!Static43.method751(arg1).method4580(arg0) && arg1.anObjectArray19 == null) {
			return null;
		} else if (arg1.aStringArray23 == null || arg0 >= arg1.aStringArray23.length || arg1.aStringArray23[arg0] == null || arg1.aStringArray23[arg0].trim().length() == 0) {
			return Static249.aBoolean326 ? "Hidden-" + arg0 : null;
		} else {
			return arg1.aStringArray23[arg0];
		}
	}

	@OriginalMember(owner = "client!cs", name = "c", descriptor = "(B)V")
	public static void method842() {
		@Pc(5) Class48 local5 = Static88.aClass48_1;
		synchronized (Static88.aClass48_1) {
			Static193.anInt3653 = Static319.anInt5900;
			Static5.anInt94++;
			Static7.anInt149 = Static92.anInt1680;
			Static79.anInt1449 = Static210.anInt3837;
			Static118.anInt2240 = Static59.anInt1111;
			Static182.anInt3425 = Static204.anInt3763;
			Static198.anInt3691 = Static175.anInt3283;
			Static104.aLong66 = Static236.aLong88;
			Static59.anInt1111 = 0;
		}
	}

	@OriginalMember(owner = "client!cs", name = "c", descriptor = "(I)V")
	public static void method844() {
		Static256.anInt4749 = 0;
		Static214.aClass211_24.method5584();
		Static214.aClass211_24.method5585(Static292.aClass6_Sub32_1);
		Static256.anInt4749++;
	}

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "(BLclient!dp;Lclient!dp;)I")
	public static int method845(@OriginalArg(1) Class53 arg0, @OriginalArg(2) Class53 arg1) {
		@Pc(5) int local5 = 0;
		if (arg0.method1026(Static53.anInt1015)) {
			local5++;
		}
		if (arg0.method1026(Static210.anInt3845)) {
			local5++;
		}
		if (arg0.method1026(Static336.anInt6137)) {
			local5++;
		}
		if (arg1.method1026(Static53.anInt1015)) {
			local5++;
		}
		if (arg1.method1026(Static210.anInt3845)) {
			local5++;
		}
		if (arg1.method1026(Static336.anInt6137)) {
			local5++;
		}
		return local5;
	}
}
