import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static22 {

	@OriginalMember(owner = "client!db", name = "n", descriptor = "I")
	public static int anInt2547;

	@OriginalMember(owner = "client!db", name = "w", descriptor = "Lclient!ce;")
	public static Class8_Sub1_Sub3_Sub2 aClass8_Sub1_Sub3_Sub2_7;

	@OriginalMember(owner = "client!db", name = "c", descriptor = "Lclient!ic;")
	public static Class34 aClass34_1199 = Static56.method816(": ");

	@OriginalMember(owner = "client!db", name = "f", descriptor = "Lclient!ic;")
	public static Class34 aClass34_1200 = Static56.method816(")4lang)4de");

	@OriginalMember(owner = "client!db", name = "k", descriptor = "I")
	public static int anInt2546 = 0;

	@OriginalMember(owner = "client!db", name = "m", descriptor = "Lclient!ic;")
	public static Class34 aClass34_1201 = Static56.method816("<col=ffffff>");

	@OriginalMember(owner = "client!db", name = "o", descriptor = "J")
	public static long aLong86 = 0L;

	@OriginalMember(owner = "client!db", name = "q", descriptor = "Lclient!ic;")
	public static Class34 aClass34_1202 = Static56.method816("::clientdrop");

	@OriginalMember(owner = "client!db", name = "x", descriptor = "Lclient!ic;")
	private static Class34 aClass34_1203 = Static56.method816("Use");

	@OriginalMember(owner = "client!db", name = "y", descriptor = "Lclient!ic;")
	public static Class34 aClass34_1204 = aClass34_1203;

	@OriginalMember(owner = "client!db", name = "D", descriptor = "[I")
	public static int[] anIntArray344 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(IIIZ)I")
	public static int method1595(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(14) int local14 = 256 - arg0;
		return (local14 * (arg2 & 0xFF00FF) + (arg1 & 0xFF00FF) * arg0 & 0xFF00FF00) + (arg0 * (arg1 & 0xFF00) + (arg2 & 0xFF00) * local14 & 0xFF0000) >> 8;
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(III)V")
	public static void method1598(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (Static100.method1458(arg0)) {
			Static101.method1459(Static44.aClass8_Sub24ArrayArray1[arg0], arg1);
		}
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(I)V")
	public static void method1599() {
		aClass8_Sub1_Sub3_Sub2_7 = null;
		aClass34_1201 = null;
		aClass34_1200 = null;
		aClass34_1199 = null;
		aClass34_1202 = null;
		aClass34_1204 = null;
		anIntArray344 = null;
		aClass34_1203 = null;
	}

	@OriginalMember(owner = "client!db", name = "e", descriptor = "(I)V")
	public static void method1612() {
		@Pc(9) int local9 = Static41.aClass8_Sub1_Sub3_Sub4_Sub1_2.method1766(Static90.aClass34_170);
		@Pc(19) int local19;
		for (@Pc(11) int local11 = 0; local11 < Static96.anInt552; local11++) {
			local19 = Static41.aClass8_Sub1_Sub3_Sub4_Sub1_2.method1766(Static4.method32(local11));
			if (local9 < local19) {
				local9 = local19;
			}
		}
		Static90.aBoolean14 = true;
		local19 = Static96.anInt552 * 15 + 21;
		local9 += 8;
		Static28.anInt802 = Static96.anInt552 * 15 + 22;
		@Pc(49) int local49 = Static3.anInt51 - local9 / 2;
		@Pc(51) int local51 = Static74.anInt1781;
		if (local51 + local19 > 503) {
			local51 = 503 - local19;
		}
		Static117.anInt2629 = local9;
		if (local49 + local9 > 765) {
			local49 = 765 - local9;
		}
		if (local51 < 0) {
			local51 = 0;
		}
		if (local49 < 0) {
			local49 = 0;
		}
		Static109.anInt2499 = local51;
		Static134.anInt3164 = local49;
	}
}
