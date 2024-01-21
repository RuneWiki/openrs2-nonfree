import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static126 {

	@OriginalMember(owner = "client!pc", name = "bb", descriptor = "[I")
	public static int[] anIntArray256;

	@OriginalMember(owner = "client!pc", name = "R", descriptor = "Lclient!ai;")
	public static Class6 aClass6_848 = Static38.method685("mapedge");

	@OriginalMember(owner = "client!pc", name = "T", descriptor = "[Lclient!w;")
	public static Class86[] aClass86Array1 = new Class86[50];

	@OriginalMember(owner = "client!pc", name = "X", descriptor = "Lclient!dd;")
	public static Class17 aClass17_17 = new Class17(30);

	@OriginalMember(owner = "client!pc", name = "f", descriptor = "(I)V")
	public static void method1961() {
		aClass86Array1 = null;
		aClass6_848 = null;
		anIntArray256 = null;
		aClass17_17 = null;
	}

	@OriginalMember(owner = "client!pc", name = "g", descriptor = "(I)V")
	public static void method1962() {
		@Pc(9) int local9 = Static85.aClass2_Sub3_Sub2_Sub4_Sub1_5.method2516(Static77.aClass6_589);
		@Pc(21) int local21;
		for (@Pc(11) int local11 = 0; local11 < Static46.anInt1322; local11++) {
			local21 = Static85.aClass2_Sub3_Sub2_Sub4_Sub1_5.method2516(Static29.method517(local11));
			if (local9 < local21) {
				local9 = local21;
			}
		}
		local9 += 8;
		Static171.anInt4010 = local9;
		Static160.aBoolean24 = true;
		Static105.anInt2554 = Static46.anInt1322 * 15 + 22;
		@Pc(52) int local52 = Static155.anInt3959 - local9 / 2;
		if (local9 + local52 > 765) {
			local52 = 765 - local9;
		}
		if (local52 < 0) {
			local52 = 0;
		}
		local21 = Static46.anInt1322 * 15 + 21;
		@Pc(74) int local74 = Static5.anInt84;
		if (local21 + local74 > 503) {
			local74 = 503 - local21;
		}
		if (local74 < 0) {
			local74 = 0;
		}
		Static96.anInt2389 = local74;
		Static144.anInt3388 = local52;
	}

	@OriginalMember(owner = "client!pc", name = "h", descriptor = "(I)V")
	public static void method1964() {
		Static66.aClass2_Sub13_Sub1_2.method1455(225);
		for (@Pc(10) Class2_Sub16 local10 = (Class2_Sub16) Static148.aClass16_10.method478(); local10 != null; local10 = (Class2_Sub16) Static148.aClass16_10.method481()) {
			if (local10.anInt2555 == 0) {
				Static21.method381(local10, true);
			}
		}
		if (Static124.aClass87_9 != null) {
			Static151.method2327(Static124.aClass87_9);
			Static124.aClass87_9 = null;
		}
	}
}
