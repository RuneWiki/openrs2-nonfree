import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static71 {

	@OriginalMember(owner = "client!jc", name = "db", descriptor = "Z")
	public static boolean aBoolean83;

	@OriginalMember(owner = "client!jc", name = "fb", descriptor = "Z")
	public static boolean aBoolean84;

	@OriginalMember(owner = "client!jc", name = "P", descriptor = "Lclient!ea;")
	private static Class18 aClass18_528 = Static8.method128(" is already on your friend list)3");

	@OriginalMember(owner = "client!jc", name = "N", descriptor = "Lclient!ea;")
	public static Class18 aClass18_526 = aClass18_528;

	@OriginalMember(owner = "client!jc", name = "S", descriptor = "I")
	public static int anInt2160 = 0;

	@OriginalMember(owner = "client!jc", name = "T", descriptor = "Lclient!ea;")
	public static Class18 aClass18_529 = Static8.method128("sl_button");

	@OriginalMember(owner = "client!jc", name = "W", descriptor = "[I")
	public static int[] anIntArray190 = new int[50];

	@OriginalMember(owner = "client!jc", name = "bb", descriptor = "Ljava/lang/Object;")
	public static Object anObject3 = new Object();

	@OriginalMember(owner = "client!jc", name = "g", descriptor = "(I)V")
	public static void method1522() {
		anIntArray190 = null;
		aClass18_526 = null;
		anObject3 = null;
		Class1_Sub1_Sub10.anIntArray193 = null;
		aClass18_528 = null;
		aClass18_529 = null;
	}

	@OriginalMember(owner = "client!jc", name = "b", descriptor = "(IIII)Z")
	public static boolean method1523(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(12) int local12 = Static87.aClass68_1.method2657(Static9.anInt295, arg1, arg2, arg0);
		@Pc(18) int local18 = arg0 >> 14 & 0x7FFF;
		if (local12 == -1) {
			return false;
		}
		@Pc(31) int local31 = local12 >> 6 & 0x3;
		@Pc(35) int local35 = local12 & 0x1F;
		if (local35 == 10 || local35 == 11 || local35 == 22) {
			@Pc(48) Class1_Sub1_Sub11 local48 = Static62.method1274(local18);
			@Pc(56) int local56;
			@Pc(59) int local59;
			if (local31 == 0 || local31 == 2) {
				local56 = local48.anInt2815;
				local59 = local48.anInt2822;
			} else {
				local56 = local48.anInt2822;
				local59 = local48.anInt2815;
			}
			@Pc(70) int local70 = local48.anInt2799;
			if (local31 != 0) {
				local70 = (local70 << local31 & 0xF) + (local70 >> 4 - local31);
			}
			Static12.method3143(Static170.aClass1_Sub1_Sub5_Sub1_Sub2_1.anIntArray315[0], local70, arg1, Static170.aClass1_Sub1_Sub5_Sub1_Sub2_1.anIntArray314[0], true, 2, 0, local59, 0, arg2, local56);
		} else {
			Static12.method3143(Static170.aClass1_Sub1_Sub5_Sub1_Sub2_1.anIntArray315[0], 0, arg1, Static170.aClass1_Sub1_Sub5_Sub1_Sub2_1.anIntArray314[0], true, 2, local35 + 1, 0, local31, arg2, 0);
		}
		Static45.anInt1554 = 2;
		Static62.anInt1927 = 0;
		Static61.anInt1872 = Static91.anInt2764;
		Static35.anInt668 = Static74.anInt2247;
		return true;
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(IIIB)V")
	public static void method1524(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg1 < 128 || arg2 < 128 || arg1 > 13056 || arg2 > 13056) {
			Static170.anInt4621 = -1;
			Static59.anInt805 = -1;
			return;
		}
		@Pc(33) int local33 = Static34.method728(Static9.anInt295, arg2, arg1) - arg0;
		@Pc(37) int local37 = local33 - Static178.anInt4735;
		@Pc(41) int local41 = Class1_Sub1_Sub8_Sub4.anIntArray212[Static125.anInt3614];
		@Pc(45) int local45 = arg1 - Static45.anInt1552;
		@Pc(49) int local49 = arg2 - Static38.anInt1189;
		@Pc(53) int local53 = Class1_Sub1_Sub8_Sub4.anIntArray212[Static106.anInt3132];
		@Pc(57) int local57 = Class1_Sub1_Sub8_Sub4.anIntArray216[Static125.anInt3614];
		@Pc(61) int local61 = Class1_Sub1_Sub8_Sub4.anIntArray216[Static106.anInt3132];
		@Pc(71) int local71 = local45 * local61 + local49 * local53 >> 16;
		@Pc(82) int local82 = local49 * local61 - local53 * local45 >> 16;
		@Pc(84) int local84 = local71;
		@Pc(95) int local95 = local57 * local37 - local82 * local41 >> 16;
		@Pc(105) int local105 = local82 * local57 + local37 * local41 >> 16;
		if (local105 < 50) {
			Static59.anInt805 = -1;
			Static170.anInt4621 = -1;
		} else {
			Static59.anInt805 = (local95 << 9) / local105 + 167;
			Static170.anInt4621 = (local84 << 9) / local105 + 256;
		}
	}

	@OriginalMember(owner = "client!jc", name = "h", descriptor = "(I)V")
	public static void method1525() {
		if (Static97.aClass21_4 != null) {
			Static97.aClass21_4.method1029();
		}
	}
}
