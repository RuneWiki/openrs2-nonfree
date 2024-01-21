import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static56 {

	@OriginalMember(owner = "client!gg", name = "Z", descriptor = "Lclient!sd;")
	private static Class73 aClass73_729 = Static122.method531("Players");

	@OriginalMember(owner = "client!gg", name = "P", descriptor = "Lclient!sd;")
	public static Class73 aClass73_728 = aClass73_729;

	@OriginalMember(owner = "client!gg", name = "X", descriptor = "[I")
	public static int[] anIntArray137 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

	@OriginalMember(owner = "client!gg", name = "eb", descriptor = "[Lclient!re;")
	public static Class3_Sub1_Sub3_Sub4[] aClass3_Sub1_Sub3_Sub4Array5 = new Class3_Sub1_Sub3_Sub4[1000];

	@OriginalMember(owner = "client!gg", name = "fb", descriptor = "I")
	public static int anInt1324 = 0;

	@OriginalMember(owner = "client!gg", name = "ib", descriptor = "I")
	public static int anInt1327 = 0;

	@OriginalMember(owner = "client!gg", name = "b", descriptor = "(II)Lclient!sd;")
	public static Class73 method983(@OriginalArg(1) int arg0) {
		if (arg0 < 100000) {
			return Static19.method372(new Class73[] { Static44.aClass73_597, Static154.method2485(arg0), Static86.aClass73_1048 });
		} else if (arg0 < 10000000) {
			return Static19.method372(new Class73[] { Static69.aClass73_869, Static154.method2485(arg0 / 1000), Static88.aClass73_1071, Static86.aClass73_1048 });
		} else {
			return Static19.method372(new Class73[] { Static131.aClass73_1661, Static154.method2485(arg0 / 1000000), Static126.aClass73_1651, Static86.aClass73_1048 });
		}
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(Z)V")
	public static void method986() {
		anIntArray137 = null;
		aClass73_728 = null;
		aClass73_729 = null;
		aClass3_Sub1_Sub3_Sub4Array5 = null;
	}

	@OriginalMember(owner = "client!gg", name = "i", descriptor = "(I)V")
	public static void method989() {
		Static75.aClass69_1.method2512();
		for (@Pc(10) int local10 = 0; local10 < 32; local10++) {
			Static124.aLongArray3[local10] = 0L;
		}
		for (@Pc(30) int local30 = 0; local30 < 32; local30++) {
			Static137.aLongArray4[local30] = 0L;
		}
		Static142.anInt3258 = 0;
	}

	@OriginalMember(owner = "client!gg", name = "b", descriptor = "(B)V")
	public static void method994() {
		if (!Static159.aBoolean233) {
			return;
		}
		@Pc(19) Class83 local19 = Static109.method1959(Static115.anInt2750, Static113.anInt2744);
		if (local19 != null && local19.anObjectArray28 != null) {
			@Pc(28) Class3_Sub17 local28 = new Class3_Sub17();
			local28.aClass83_13 = local19;
			local28.anObjectArray3 = local19.anObjectArray28;
			Static148.method2418(local28);
		}
		Static159.aBoolean233 = false;
		Static60.method1104(local19);
	}
}
