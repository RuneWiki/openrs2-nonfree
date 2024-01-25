import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static362 {

	@OriginalMember(owner = "client!si", name = "o", descriptor = "Lclient!sv;")
	public static final Class222 aClass222_16 = new Class222(11, 0, 1, 2);

	@OriginalMember(owner = "client!si", name = "t", descriptor = "[Lclient!ps;")
	public static final Class47_Sub1_Sub5_Sub2[] aClass47_Sub1_Sub5_Sub2Array1 = new Class47_Sub1_Sub5_Sub2[2048];

	@OriginalMember(owner = "client!si", name = "B", descriptor = "Lclient!ao;")
	public static final Class12 aClass12_319 = new Class12(32, 11);

	@OriginalMember(owner = "client!si", name = "C", descriptor = "I")
	public static int anInt6604 = -1;

	@OriginalMember(owner = "client!si", name = "D", descriptor = "Lclient!ao;")
	public static final Class12 aClass12_320 = new Class12(47, 2);

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(III)Z")
	public static boolean method5155(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x800) != 0;
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(IILclient!ps;BI)V")
	public static void method5156(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class47_Sub1_Sub5_Sub2 arg2) {
		@Pc(10) int local10 = arg2.anIntArray407[0];
		@Pc(15) int local15 = arg2.anIntArray408[0];
		if (local10 < 0 || Static80.anInt6558 <= local10 || local15 < 0 || Static104.anInt2048 <= local15 || (arg1 < 0 || Static80.anInt6558 <= arg1 || arg0 < 0 || Static104.anInt2048 <= arg0)) {
			return;
		}
		@Pc(80) int local80 = Static272.method3778(0, Static299.anIntArray382, 0, local15, 0, true, arg1, arg0, -4, arg2.method4317(), 0, Static429.anIntArray191, local10, Static20.aClass181Array2[arg2.aByte97]);
		if (local80 >= 1 && local80 <= 3) {
			for (@Pc(90) int local90 = 0; local90 < local80 - 1; local90++) {
				arg2.method4337(Static429.anIntArray191[local90], (byte) 2, Static299.anIntArray382[local90]);
			}
		}
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(IIIIIII)V")
	public static void method5157(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(6) Class36_Sub2 local6 = (Class36_Sub2) Static311.aClass242_8.method5503(); local6 != null; local6 = (Class36_Sub2) Static311.aClass242_8.method5506()) {
			if (local6.anInt1988 <= Static123.anInt2333) {
				local6.method5131();
			} else {
				Static45.method610((local6.anInt1995 << 7) + 64, arg3 >> 1, arg0 >> 1, local6.anInt1989, local6.anInt1987 * 2, (local6.anInt1992 << 7) + 64);
				Static237.aClass4_5.method5840(local6.anInt1994 | 0xFF000000, arg2 + Static116.anIntArray114[1], 0, arg1 + Static116.anIntArray114[0], local6.aString40);
			}
		}
	}

	@OriginalMember(owner = "client!si", name = "b", descriptor = "(III)Z")
	public static boolean method5162(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x21) != 0;
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(II)Z")
	public static boolean method5163(@OriginalArg(1) int arg0) {
		return (-arg0 & arg0) == arg0;
	}
}
