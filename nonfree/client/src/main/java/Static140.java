import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static140 {

	@OriginalMember(owner = "client!qh", name = "mc", descriptor = "[I")
	public static int[] anIntArray329;

	@OriginalMember(owner = "client!qh", name = "pc", descriptor = "Lclient!vb;")
	public static Class82 aClass82_55;

	@OriginalMember(owner = "client!qh", name = "rc", descriptor = "Lclient!oe;")
	public static Class1_Sub2_Sub2_Sub3 aClass1_Sub2_Sub2_Sub3_9;

	@OriginalMember(owner = "client!qh", name = "kc", descriptor = "Lclient!tg;")
	private static Class81 aClass81_1097 = Static120.method2057("Malformed login packet)3");

	@OriginalMember(owner = "client!qh", name = "lc", descriptor = "I")
	public static int anInt3065 = 0;

	@OriginalMember(owner = "client!qh", name = "nc", descriptor = "I")
	public static int anInt3066 = 0;

	@OriginalMember(owner = "client!qh", name = "qc", descriptor = "J")
	public static long aLong113 = 0L;

	@OriginalMember(owner = "client!qh", name = "tc", descriptor = "Lclient!tg;")
	public static Class81 aClass81_1098 = Static120.method2057("Fehler beim Laden Ihres Spielcharakters)3");

	@OriginalMember(owner = "client!qh", name = "vc", descriptor = "J")
	public static long aLong114 = 0L;

	@OriginalMember(owner = "client!qh", name = "wc", descriptor = "Lclient!tg;")
	public static Class81 aClass81_1099 = Static120.method2057("");

	@OriginalMember(owner = "client!qh", name = "yc", descriptor = "Lclient!tg;")
	public static Class81 aClass81_1100 = aClass81_1097;

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(II)V")
	public static void method2367(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) Class1_Sub17 local7 = Static167.aClass1_Sub17ArrayArrayArray1[0][arg0][arg1];
		for (@Pc(9) int local9 = 0; local9 < 3; local9++) {
			@Pc(28) Class1_Sub17 local28 = Static167.aClass1_Sub17ArrayArrayArray1[local9][arg0][arg1] = Static167.aClass1_Sub17ArrayArrayArray1[local9 + 1][arg0][arg1];
			if (local28 != null) {
				local28.anInt1846--;
				for (@Pc(38) int local38 = 0; local38 < local28.anInt1851; local38++) {
					@Pc(44) Class75 local44 = local28.aClass75Array2[local38];
					if ((local44.aLong118 >> 29 & 0x3L) == 2L && local44.anInt3164 == arg0 && local44.anInt3158 == arg1) {
						local44.anInt3155--;
					}
				}
			}
		}
		if (Static167.aClass1_Sub17ArrayArrayArray1[0][arg0][arg1] == null) {
			Static167.aClass1_Sub17ArrayArrayArray1[0][arg0][arg1] = new Class1_Sub17(0, arg0, arg1);
		}
		Static167.aClass1_Sub17ArrayArrayArray1[0][arg0][arg1].aClass1_Sub17_1 = local7;
		Static167.aClass1_Sub17ArrayArrayArray1[3][arg0][arg1] = null;
	}

	@OriginalMember(owner = "client!qh", name = "b", descriptor = "(Z)V")
	public static void method2368() {
		aClass82_55 = null;
		aClass81_1097 = null;
		anIntArray329 = null;
		aClass81_1098 = null;
		aClass81_1100 = null;
		aClass1_Sub2_Sub2_Sub3_9 = null;
		aClass81_1099 = null;
	}

	@OriginalMember(owner = "client!qh", name = "h", descriptor = "(I)V")
	public static void method2369() {
		Static59.aClass59_13.method1967();
	}
}
