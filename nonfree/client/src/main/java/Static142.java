import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static142 {

	@OriginalMember(owner = "client!oe", name = "c", descriptor = "I")
	public static int anInt3255;

	@OriginalMember(owner = "client!oe", name = "q", descriptor = "I")
	public static int anInt3263;

	@OriginalMember(owner = "client!oe", name = "r", descriptor = "[I")
	public static int[] anIntArray339;

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "I")
	public static int anInt3253 = 0;

	@OriginalMember(owner = "client!oe", name = "d", descriptor = "Lclient!id;")
	public static Class43 aClass43_14 = new Class43(20);

	@OriginalMember(owner = "client!oe", name = "f", descriptor = "Lclient!i;")
	public static Class41 aClass41_901 = Static184.method2923("Wir vermuten)1 dass Ihr Konto gestohlen wurde");

	@OriginalMember(owner = "client!oe", name = "i", descriptor = "Lclient!i;")
	public static Class41 aClass41_902 = Static184.method2923(":duelstake:");

	@OriginalMember(owner = "client!oe", name = "j", descriptor = "I")
	public static int anInt3258 = 0;

	@OriginalMember(owner = "client!oe", name = "s", descriptor = "I")
	public static int anInt3264 = 0;

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(III)J")
	public static long method2228(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class2_Sub7 local7 = Static27.aClass2_Sub7ArrayArrayArray4[arg0][arg1][arg2];
		return local7 == null || local7.aClass71_1 == null ? 0L : local7.aClass71_1.aLong100;
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(II)V")
	public static void method2229(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) Class2_Sub7 local7 = Static27.aClass2_Sub7ArrayArrayArray4[0][arg0][arg1];
		for (@Pc(9) int local9 = 0; local9 < 3; local9++) {
			@Pc(28) Class2_Sub7 local28 = Static27.aClass2_Sub7ArrayArrayArray4[local9][arg0][arg1] = Static27.aClass2_Sub7ArrayArrayArray4[local9 + 1][arg0][arg1];
			if (local28 != null) {
				local28.anInt1383--;
				for (@Pc(38) int local38 = 0; local38 < local28.anInt1382; local38++) {
					@Pc(44) Class51 local44 = local28.aClass51Array1[local38];
					if ((local44.aLong69 >> 29 & 0x3L) == 2L && local44.anInt2305 == arg0 && local44.anInt2308 == arg1) {
						local44.anInt2318--;
					}
				}
			}
		}
		if (Static27.aClass2_Sub7ArrayArrayArray4[0][arg0][arg1] == null) {
			Static27.aClass2_Sub7ArrayArrayArray4[0][arg0][arg1] = new Class2_Sub7(0, arg0, arg1);
		}
		Static27.aClass2_Sub7ArrayArrayArray4[0][arg0][arg1].aClass2_Sub7_1 = local7;
		Static27.aClass2_Sub7ArrayArrayArray4[3][arg0][arg1] = null;
	}
}
