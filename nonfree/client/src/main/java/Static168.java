import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static168 {

	@OriginalMember(owner = "client!re", name = "a", descriptor = "[I")
	public static int[] anIntArray407;

	@OriginalMember(owner = "client!re", name = "f", descriptor = "Lclient!bj;")
	public static Class15_Sub1 aClass15_Sub1_103;

	@OriginalMember(owner = "client!re", name = "m", descriptor = "I")
	public static int anInt3899;

	@OriginalMember(owner = "client!re", name = "n", descriptor = "Lclient!mf;")
	public static Class63 aClass63_3;

	@OriginalMember(owner = "client!re", name = "b", descriptor = "I")
	public static volatile int anInt3891 = 0;

	@OriginalMember(owner = "client!re", name = "g", descriptor = "[[I")
	public static int[][] anIntArrayArray35 = new int[104][104];

	@OriginalMember(owner = "client!re", name = "h", descriptor = "[I")
	public static int[] anIntArray408 = new int[5];

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(II)Lclient!nf;")
	public static Class2_Sub2_Sub14 method2705(@OriginalArg(0) int arg0) {
		@Pc(10) Class2_Sub2_Sub14 local10 = (Class2_Sub2_Sub14) Static160.aClass43_17.method1464((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(24) byte[] local24 = Static176.aClass15_36.method387(Static171.method2772(arg0), Static145.method2248(arg0));
		local10 = new Class2_Sub2_Sub14();
		local10.anInt3075 = arg0;
		if (local24 != null) {
			local10.method2124(new Class2_Sub3(local24));
		}
		local10.method2125();
		if (!Static18.aBoolean23 && local10.aBoolean176) {
			local10.aClass41Array45 = null;
		}
		if (local10.aBoolean173) {
			local10.anInt3067 = 0;
			local10.aBoolean171 = false;
		}
		Static160.aClass43_17.method1462((long) arg0, local10);
		return local10;
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(IILclient!nb;B)[Lclient!rh;")
	public static Class60_Sub1[] method2706(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class15 arg2) {
		return Static43.method900(arg2, arg0, arg1) ? Static156.method2540() : null;
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(B)[Lclient!lj;")
	public static Class60[] method2707() {
		@Pc(13) Class60[] local13 = new Class60[Static154.anInt3619];
		for (@Pc(15) int local15 = 0; local15 < Static154.anInt3619; local15++) {
			local13[local15] = new Class60_Sub1(Static14.anInt415, Static114.anInt2772, Static219.anIntArray501[local15], Static120.anIntArray310[local15], Static89.anIntArray224[local15], Static60.anIntArray498[local15], Static102.aByteArrayArray6[local15], Static25.anIntArray494);
		}
		Static212.method3255();
		return local13;
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(Lclient!nb;I)V")
	public static void method2708(@OriginalArg(0) Class15 arg0) {
		Static31.aClass15_5 = arg0;
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(IBLclient!nb;I)[Lclient!lj;")
	public static Class60[] method2709(@OriginalArg(0) int arg0, @OriginalArg(2) Class15 arg1, @OriginalArg(3) int arg2) {
		return Static43.method900(arg1, arg0, arg2) ? method2707() : null;
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(ZZ)V")
	public static void method2711() {
		@Pc(7) byte[][] local7 = Static41.aByteArrayArray5;
		@Pc(10) int local10 = Static150.aByteArrayArray9.length;
		for (@Pc(12) int local12 = 0; local12 < local10; local12++) {
			@Pc(18) byte[] local18 = local7[local12];
			if (local18 != null) {
				@Pc(31) int local31 = (Static131.anIntArray320[local12] >> 8) * 64 - Static198.anInt4451;
				@Pc(41) int local41 = (Static131.anIntArray320[local12] & 0xFF) * 64 - anInt3899;
				Static194.method3305();
				Static17.method323(Static149.aClass42Array1, local18, local31, local41);
			}
		}
	}

	@OriginalMember(owner = "client!re", name = "b", descriptor = "(I)V")
	public static void method2712() {
		if (Static217.aBoolean290 && Static134.anInt3147 != Static142.anInt3258) {
			Static106.method1815(Static134.anInt3147, Static213.aClass12_Sub3_Sub1_1.anIntArray414[0], Static125.anInt1525, Static96.anInt2367, Static213.aClass12_Sub3_Sub1_1.anIntArray412[0]);
		} else if (Static134.anInt3147 != Static154.anInt3612) {
			Static154.anInt3612 = Static134.anInt3147;
			Static215.method3282(Static134.anInt3147);
		}
	}
}
