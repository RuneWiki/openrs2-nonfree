import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static74 {

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "Lclient!ch;")
	public static Class14 aClass14_101 = new Class14(64);

	@OriginalMember(owner = "client!ic", name = "b", descriptor = "[[I")
	public static int[][] anIntArrayArray14 = new int[104][104];

	@OriginalMember(owner = "client!ic", name = "d", descriptor = "Lclient!gg;")
	public static Class28 aClass28_1149 = Static107.method1838("p12_full");

	@OriginalMember(owner = "client!ic", name = "g", descriptor = "[I")
	public static int[] anIntArray188 = new int[] { 160, 192, 80, 96, 0, 144, 80, 48, 160 };

	@OriginalMember(owner = "client!ic", name = "h", descriptor = "I")
	public static int anInt1949 = 0;

	@OriginalMember(owner = "client!ic", name = "i", descriptor = "[I")
	public static int[] anIntArray189 = new int[256];

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(II)Z")
	public static boolean method1351(@OriginalArg(1) int arg0) {
		return (arg0 >> 30 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(B)V")
	public static void method1352() {
		for (@Pc(10) Class2_Sub4_Sub1_Sub7 local10 = (Class2_Sub4_Sub1_Sub7) Static100.aClass65_9.method2115(); local10 != null; local10 = (Class2_Sub4_Sub1_Sub7) Static100.aClass65_9.method2117()) {
			if (local10.anInt4025 != Static103.anInt2568 || local10.anInt4031 < Static156.anInt3491) {
				local10.method2888();
			} else if (Static156.anInt3491 >= local10.anInt4017) {
				if (local10.anInt4030 > 0) {
					@Pc(54) Class2_Sub4_Sub1_Sub1_Sub1 local54 = Static55.aClass2_Sub4_Sub1_Sub1_Sub1Array1[local10.anInt4030 - 1];
					if (local54 != null && local54.anInt1633 >= 0 && local54.anInt1633 < 13312 && local54.anInt1635 >= 0 && local54.anInt1635 < 13312) {
						local10.method2868(Static103.method1808(local10.anInt4025, local54.anInt1633, local54.anInt1635) - local10.anInt4019, local54.anInt1635, local54.anInt1633, Static156.anInt3491);
					}
				}
				if (local10.anInt4030 < 0) {
					@Pc(106) int local106 = -local10.anInt4030 - 1;
					@Pc(117) Class2_Sub4_Sub1_Sub1_Sub2 local117;
					if (Static50.anInt1313 == local106) {
						local117 = Static3.aClass2_Sub4_Sub1_Sub1_Sub2_2;
					} else {
						local117 = Static34.aClass2_Sub4_Sub1_Sub1_Sub2Array1[local106];
					}
					if (local117 != null && local117.anInt1633 >= 0 && local117.anInt1633 < 13312 && local117.anInt1635 >= 0 && local117.anInt1635 < 13312) {
						local10.method2868(Static103.method1808(local10.anInt4025, local117.anInt1633, local117.anInt1635) - local10.anInt4019, local117.anInt1635, local117.anInt1633, Static156.anInt3491);
					}
				}
				local10.method2865(Static119.anInt2853);
				Static122.method2002(Static103.anInt2568, (int) local10.aDouble8, (int) local10.aDouble4, (int) local10.aDouble3, 60, local10, local10.anInt4016, -1L, false);
			}
		}
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(I)V")
	public static void method1353() {
		anIntArray189 = null;
		anIntArrayArray14 = null;
		anIntArray188 = null;
		aClass14_101 = null;
		aClass28_1149 = null;
	}
}
