import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static50 {

	@OriginalMember(owner = "client!cr", name = "t", descriptor = "[Lclient!wn;")
	public static Class95[] aClass95Array5;

	@OriginalMember(owner = "client!cr", name = "s", descriptor = "Lclient!we;")
	public static final Class212 aClass212_1 = new Class212();

	@OriginalMember(owner = "client!cr", name = "u", descriptor = "[[I")
	public static final int[][] anIntArrayArray22 = new int[][] { { 0, 2, 4, 6 }, { 6, 0, 2, 4 }, { 6, 0, 2 }, { 2, 6, 0 }, { 0, 2, 6 }, { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 2, 4, 4 }, { 2, 4, 4, 7 }, { 6, 6, 4, 0, 2, 2 }, { 0, 2, 2, 6, 6, 4 }, { 0, 2, 2, 4, 6, 6 }, { 0, 2, 4, 6 } };

	@OriginalMember(owner = "client!cr", name = "y", descriptor = "[I")
	public static int[] anIntArray90 = new int[2];

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(II)V")
	public static void method822(@OriginalArg(0) int arg0) {
		if (Static278.anInt5495 == arg0) {
			return;
		}
		if (Static278.anInt5495 == 0) {
			Static123.method2171();
		}
		if (arg0 == 40) {
			Static170.method3098();
		}
		if (arg0 != 40 && Static325.aClass41_39 != null) {
			Static325.aClass41_39.method825();
			Static325.aClass41_39 = null;
		}
		if (Static278.anInt5495 == 25 || Static278.anInt5495 == 28) {
			Static200.aClass93_77.anInt2609 = 2;
			Static253.aClass93_96.anInt2609 = 2;
			Static29.aClass93_11.anInt2609 = 2;
			Static254.aClass93_97.anInt2609 = 2;
			Static233.aClass93_88.anInt2609 = 2;
			Static1.aClass93_2.anInt2609 = 2;
			Static180.aClass93_66.anInt2609 = 2;
		}
		if (arg0 == 25 || arg0 == 28) {
			Static277.anInt5470 = 1;
			Static237.anInt4724 = 0;
			Static325.anInt6291 = 1;
			Static267.anInt5275 = 0;
			Static75.anInt1444 = 0;
			Static92.method1666(true);
			Static200.aClass93_77.anInt2609 = 1;
			Static253.aClass93_96.anInt2609 = 1;
			Static29.aClass93_11.anInt2609 = 1;
			Static254.aClass93_97.anInt2609 = 1;
			Static233.aClass93_88.anInt2609 = 1;
			Static1.aClass93_2.anInt2609 = 1;
			Static180.aClass93_66.anInt2609 = 1;
		}
		if (arg0 == 25 || arg0 == 10) {
			Static48.method799();
		}
		if (arg0 == 5) {
			Static249.method5573(Static244.aClass93_93, Static236.aClass55_9);
		} else {
			Static92.method1669();
		}
		@Pc(139) boolean local139 = arg0 == 5 || arg0 == 10 || arg0 == 28;
		@Pc(156) boolean local156 = Static278.anInt5495 == 5 || Static278.anInt5495 == 10 || Static278.anInt5495 == 28;
		if (local139 != local156) {
			if (local139) {
				Static236.anInt4219 = Static104.anInt2004;
				if (Static349.anInt6699 == 0) {
					Static5.method87();
				} else {
					Static163.method2867(Static104.anInt2004, 255, Static319.aClass93_121);
				}
				Static170.aClass162_2.method4454(false);
			} else {
				Static5.method87();
				Static170.aClass162_2.method4454(true);
				if (Static222.aClass136_1 != null) {
					Static222.aClass136_1.method3753();
					Static222.aClass136_1 = null;
				}
			}
		}
		if (arg0 == 25 || arg0 == 28 || arg0 == 40) {
			Static236.aClass55_9.method5212();
		}
		Static278.anInt5495 = arg0;
	}

	@OriginalMember(owner = "client!cr", name = "e", descriptor = "(I)V")
	public static void method828() {
		if (Static236.aBoolean348) {
			return;
		}
		Static236.aBoolean348 = true;
		Static289.aBoolean472 = true;
		if (Static131.aBoolean194) {
			Static164.aFloat24 = (int) Static164.aFloat24 + 191 & 0xFFFFFF80;
		} else {
			Static192.aFloat34 += (24.0F - Static192.aFloat34) / 2.0F;
		}
	}
}
