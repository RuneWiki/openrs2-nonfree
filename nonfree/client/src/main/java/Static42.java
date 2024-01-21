import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static42 {

	@OriginalMember(owner = "client!ia", name = "V", descriptor = "Lclient!fc;")
	public static Class2_Sub2_Sub2_Sub2 aClass2_Sub2_Sub2_Sub2_2;

	@OriginalMember(owner = "client!ia", name = "Pb", descriptor = "Lclient!eb;")
	public static Class2_Sub3 aClass2_Sub3_3;

	@OriginalMember(owner = "client!ia", name = "T", descriptor = "Lclient!o;")
	public static Class40 aClass40_314 = Static13.method257("You have only just left another world");

	@OriginalMember(owner = "client!ia", name = "ib", descriptor = "I")
	public static int anInt1038 = 0;

	@OriginalMember(owner = "client!ia", name = "mb", descriptor = "Lclient!o;")
	public static Class40 aClass40_317 = Static13.method257(" unread messages");

	@OriginalMember(owner = "client!ia", name = "pb", descriptor = "Lclient!o;")
	public static Class40 aClass40_318 = Static13.method257("It(Ws a ");

	@OriginalMember(owner = "client!ia", name = "sb", descriptor = "Lclient!o;")
	public static Class40 aClass40_319 = Static13.method257("backtop1");

	@OriginalMember(owner = "client!ia", name = "yb", descriptor = "Lclient!o;")
	public static Class40 aClass40_320 = Static13.method257("Nov");

	@OriginalMember(owner = "client!ia", name = "zb", descriptor = "Lclient!o;")
	public static Class40 aClass40_321 = Static13.method257("yesterday");

	@OriginalMember(owner = "client!ia", name = "Ab", descriptor = "Lclient!o;")
	public static Class40 aClass40_322 = Static13.method257("Examine @yel@");

	@OriginalMember(owner = "client!ia", name = "Qb", descriptor = "Lclient!o;")
	public static Class40 aClass40_323 = Static13.method257("@cr1@");

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(ILjava/awt/Graphics;)V")
	public static void method768(@OriginalArg(1) Graphics arg0) {
		Static41.aClass45_20.method1474(arg0, 0, 4);
		Static30.aClass45_15.method1474(arg0, 0, 357);
		Static80.aClass45_28.method1474(arg0, 722, 4);
		Static29.aClass45_13.method1474(arg0, 743, 205);
		Static92.aClass45_29.method1474(arg0, 0, 0);
		Static20.aClass45_10.method1474(arg0, 516, 4);
		Static1.aClass45_1.method1474(arg0, 516, 205);
		Static44.aClass45_21.method1474(arg0, 496, 357);
		Static19.aClass45_9.method1474(arg0, 0, 338);
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(IIII)Z")
	public static boolean method770(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(16) int local16 = arg1 >> 14 & 0x7FFF;
		@Pc(23) int local23 = Static93.aClass55_1.method1449(Static1.anInt8, arg2, arg0, arg1);
		if (local23 == -1) {
			return false;
		}
		@Pc(34) int local34 = local23 >> 6 & 0x3;
		@Pc(38) int local38 = local23 & 0x1F;
		if (local38 == 10 || local38 == 11 || local38 == 22) {
			@Pc(53) Class2_Sub2_Sub10 local53 = Static91.method1470(local16);
			@Pc(66) int local66;
			@Pc(63) int local63;
			if (local34 == 0 || local34 == 2) {
				local66 = local53.anInt1036;
				local63 = local53.anInt1040;
			} else {
				local63 = local53.anInt1036;
				local66 = local53.anInt1040;
			}
			@Pc(77) int local77 = local53.anInt1057;
			if (local34 != 0) {
				local77 = (local77 << local34 & 0xF) + (local77 >> 4 - local34);
			}
			Static83.method1349(arg0, 0, Static88.aClass2_Sub2_Sub12_Sub1_Sub1_1.anIntArray492[0], local63, local77, 2, true, 0, Static88.aClass2_Sub2_Sub12_Sub1_Sub1_1.anIntArray496[0], local66, arg2);
		} else {
			Static83.method1349(arg0, local34, Static88.aClass2_Sub2_Sub12_Sub1_Sub1_1.anIntArray492[0], 0, 0, 2, true, local38 + 1, Static88.aClass2_Sub2_Sub12_Sub1_Sub1_1.anIntArray496[0], 0, arg2);
		}
		Static62.anInt1554 = Static107.anInt2500;
		Static45.anInt1096 = 2;
		Static102.anInt2465 = Static90.anInt2133;
		Static101.anInt2410 = 0;
		return true;
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(ZI)V")
	public static void method774(@OriginalArg(1) int arg0) {
		if (arg0 == -1 || !Static92.aBooleanArray31[arg0]) {
			return;
		}
		Static54.aClass5_17.method67(arg0);
		if (Static51.aClass2_Sub2_Sub13ArrayArray1[arg0] == null) {
			return;
		}
		@Pc(26) boolean local26 = true;
		for (@Pc(28) int local28 = 0; local28 < Static51.aClass2_Sub2_Sub13ArrayArray1[arg0].length; local28++) {
			if (Static51.aClass2_Sub2_Sub13ArrayArray1[arg0][local28] != null) {
				if (Static51.aClass2_Sub2_Sub13ArrayArray1[arg0][local28].anInt1613 == 2) {
					local26 = false;
				} else {
					Static51.aClass2_Sub2_Sub13ArrayArray1[arg0][local28] = null;
				}
			}
		}
		if (local26) {
			Static51.aClass2_Sub2_Sub13ArrayArray1[arg0] = null;
		}
		Static92.aBooleanArray31[arg0] = false;
	}

	@OriginalMember(owner = "client!ia", name = "g", descriptor = "(I)V")
	public static void method775() {
		aClass40_320 = null;
		aClass40_323 = null;
		aClass40_317 = null;
		aClass40_322 = null;
		aClass40_321 = null;
		aClass2_Sub2_Sub2_Sub2_2 = null;
		aClass40_318 = null;
		aClass2_Sub3_3 = null;
		aClass40_319 = null;
		aClass40_314 = null;
	}
}
