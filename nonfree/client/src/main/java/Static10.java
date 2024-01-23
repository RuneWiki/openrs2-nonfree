import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static10 {

	@OriginalMember(owner = "client!aj", name = "R", descriptor = "I")
	public static int anInt369;

	@OriginalMember(owner = "client!aj", name = "Y", descriptor = "I")
	public static int anInt373;

	@OriginalMember(owner = "client!aj", name = "ab", descriptor = "I")
	public static int anInt374;

	@OriginalMember(owner = "client!aj", name = "S", descriptor = "Lclient!i;")
	private static Class41 aClass41_75 = Static184.method2923("You can(Wt add yourself to your own ignore list)3");

	@OriginalMember(owner = "client!aj", name = "Q", descriptor = "Lclient!i;")
	public static Class41 aClass41_74 = aClass41_75;

	@OriginalMember(owner = "client!aj", name = "U", descriptor = "Lclient!i;")
	public static Class41 aClass41_76 = Static184.method2923("lila:");

	@OriginalMember(owner = "client!aj", name = "V", descriptor = "Lclient!i;")
	public static Class41 aClass41_77 = Static184.method2923("::clientdrop");

	@OriginalMember(owner = "client!aj", name = "Z", descriptor = "Lclient!i;")
	private static Class41 aClass41_78 = Static184.method2923("Connection timed out)3");

	@OriginalMember(owner = "client!aj", name = "bb", descriptor = "Lclient!i;")
	public static Class41 aClass41_79 = aClass41_78;

	@OriginalMember(owner = "client!aj", name = "fb", descriptor = "Z")
	public static boolean aBoolean19 = false;

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(IIIIB)V")
	public static void method278(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (Static142.anInt3253 == 1) {
			Static139.aClass2_Sub2_Sub16Array15[Static41.anInt1265 / 100].method2407(Static132.anInt3013 - 8, Static140.anInt3235 + -8);
		}
		if (Static142.anInt3253 == 2) {
			Static139.aClass2_Sub2_Sub16Array15[Static41.anInt1265 / 100 + 4].method2407(Static132.anInt3013 - 8, Static140.anInt3235 + -8);
		}
		Static178.method2847();
		if (!Static133.aBoolean166) {
			return;
		}
		@Pc(51) int local51 = arg0 + 512 - 5;
		@Pc(55) int local55 = arg2 + 20;
		Static3.aClass2_Sub2_Sub4_1.method780(Static149.method2324(new Class41[] { Static161.aClass41_1007, Static152.method2471(Static12.anInt393) }), local51, local55, 16776960, -1);
		@Pc(76) int local76 = local55 + 15;
		@Pc(78) int local78 = 16776960;
		@Pc(80) Runtime local80 = Runtime.getRuntime();
		@Pc(89) int local89 = (int) ((local80.totalMemory() - local80.freeMemory()) / 1024L);
		if (local89 > 32768 && Static217.aBoolean290) {
			local78 = 16711680;
		}
		if (local89 > 65536 && !Static217.aBoolean290) {
			local78 = 16711680;
		}
		Static3.aClass2_Sub2_Sub4_1.method780(Static149.method2324(new Class41[] { Static182.aClass41_1107, Static152.method2471(local89), Static96.aClass41_702 }), local51, local76, local78, -1);
		local55 = local76 + 15;
	}

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(IJ)V")
	public static void method279(@OriginalArg(1) long arg0) {
		if (arg0 == 0L) {
			return;
		}
		if (Static60.anInt4785 >= 100) {
			Static198.method3075(Static104.aClass41_750, 0, Static156.aClass41_981);
			return;
		}
		@Pc(25) Class41 local25 = Static176.method2837(arg0).method1403();
		for (@Pc(27) int local27 = 0; local27 < Static60.anInt4785; local27++) {
			if (Static83.aLongArray6[local27] == arg0) {
				Static198.method3075(Static149.method2324(new Class41[] { local25, Static140.aClass41_892 }), 0, Static156.aClass41_981);
				return;
			}
		}
		for (@Pc(68) int local68 = 0; local68 < Static131.anInt2996; local68++) {
			if (arg0 == Static101.aLongArray7[local68]) {
				Static198.method3075(Static149.method2324(new Class41[] { Static95.aClass41_694, local25, Static101.aClass41_733 }), 0, Static156.aClass41_981);
				return;
			}
		}
		if (local25.method1386(Static213.aClass12_Sub3_Sub1_1.aClass41_362)) {
			Static198.method3075(aClass41_74, 0, Static156.aClass41_981);
			return;
		}
		Static83.aLongArray6[Static60.anInt4785] = arg0;
		Static131.aClass41Array44[Static60.anInt4785++] = Static176.method2837(arg0);
		Static18.anInt491 = Static60.anInt4782;
		Static131.aClass2_Sub3_Sub1_2.method221(28);
		Static131.aClass2_Sub3_Sub1_2.method190(arg0);
	}

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(III)V")
	public static void method280(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class2_Sub7 local7 = Static27.aClass2_Sub7ArrayArrayArray4[arg0][arg1][arg2];
		if (local7 != null) {
			local7.aClass71_1 = null;
		}
	}
}
