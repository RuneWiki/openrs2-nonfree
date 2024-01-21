import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static56 {

	@OriginalMember(owner = "client!l", name = "h", descriptor = "Lclient!vc;")
	public static Class65 aClass65_2;

	@OriginalMember(owner = "client!l", name = "b", descriptor = "Lclient!a;")
	public static Class1 aClass1_1837 = Static94.method1596("@or3@");

	@OriginalMember(owner = "client!l", name = "c", descriptor = "Lclient!a;")
	public static Class1 aClass1_1838 = Static94.method1596("mapscene");

	@OriginalMember(owner = "client!l", name = "e", descriptor = "I")
	public static int anInt1778 = -1;

	@OriginalMember(owner = "client!l", name = "f", descriptor = "Lclient!a;")
	public static Class1 aClass1_1839 = Static94.method1596(" x");

	@OriginalMember(owner = "client!l", name = "j", descriptor = "I")
	public static int anInt1781 = 0;

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(I)V")
	public static void method1236() {
		aClass1_1839 = null;
		aClass1_1837 = null;
		aClass1_1838 = null;
		aClass65_2 = null;
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(III)Z")
	public static boolean method1237(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 == 0 && arg1 == Static96.anInt2465) {
			return true;
		} else if (arg0 == 1 && Static5.anInt402 == arg1) {
			return true;
		} else {
			return (arg0 == 2 || arg0 == 3) && Static90.anInt2332 == arg1;
		}
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(II)I")
	public static int method1238(@OriginalArg(1) int arg0) {
		return (int) (Math.log((double) arg0 * 0.00390625D) * 868.5889638065036D + 0.5D);
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(B)V")
	public static void method1239() {
		@Pc(10) int local10 = Static13.aClass2_Sub3_Sub1_1.method838(8);
		@Pc(19) int local19;
		if (Static99.anInt2521 > local10) {
			for (local19 = local10; local19 < Static99.anInt2521; local19++) {
				Static10.anIntArray317[Static27.anInt1037++] = Static93.anIntArray292[local19];
			}
		}
		if (local10 > Static99.anInt2521) {
			throw new RuntimeException("gppov1");
		}
		Static99.anInt2521 = 0;
		for (local19 = 0; local19 < local10; local19++) {
			@Pc(62) int local62 = Static93.anIntArray292[local19];
			@Pc(66) Class2_Sub1_Sub1_Sub1_Sub1 local66 = Static67.aClass2_Sub1_Sub1_Sub1_Sub1Array3[local62];
			@Pc(71) int local71 = Static13.aClass2_Sub3_Sub1_1.method838(1);
			if (local71 == 0) {
				Static93.anIntArray292[Static99.anInt2521++] = local62;
				local66.anInt2755 = Static69.anInt2806;
			} else {
				@Pc(91) int local91 = Static13.aClass2_Sub3_Sub1_1.method838(2);
				if (local91 == 0) {
					Static93.anIntArray292[Static99.anInt2521++] = local62;
					local66.anInt2755 = Static69.anInt2806;
					Static45.anIntArray156[Static67.anInt2767++] = local62;
				} else {
					@Pc(138) int local138;
					@Pc(148) int local148;
					if (local91 == 1) {
						Static93.anIntArray292[Static99.anInt2521++] = local62;
						local66.anInt2755 = Static69.anInt2806;
						local138 = Static13.aClass2_Sub3_Sub1_1.method838(3);
						local66.method1781(local138, false);
						local148 = Static13.aClass2_Sub3_Sub1_1.method838(1);
						if (local148 == 1) {
							Static45.anIntArray156[Static67.anInt2767++] = local62;
						}
					} else if (local91 == 2) {
						Static93.anIntArray292[Static99.anInt2521++] = local62;
						local66.anInt2755 = Static69.anInt2806;
						local138 = Static13.aClass2_Sub3_Sub1_1.method838(3);
						local66.method1781(local138, true);
						local148 = Static13.aClass2_Sub3_Sub1_1.method838(3);
						local66.method1781(local148, true);
						@Pc(200) int local200 = Static13.aClass2_Sub3_Sub1_1.method838(1);
						if (local200 == 1) {
							Static45.anIntArray156[Static67.anInt2767++] = local62;
						}
					} else if (local91 == 3) {
						Static10.anIntArray317[Static27.anInt1037++] = local62;
					}
				}
			}
		}
	}
}
