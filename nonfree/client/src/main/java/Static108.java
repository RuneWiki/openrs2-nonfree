import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static108 {

	@OriginalMember(owner = "client!go", name = "n", descriptor = "I")
	public static int anInt1317;

	@OriginalMember(owner = "client!go", name = "o", descriptor = "Lclient!rk;")
	public static Class180 aClass180_14;

	@OriginalMember(owner = "client!go", name = "h", descriptor = "I")
	public static int anInt1312 = 0;

	@OriginalMember(owner = "client!go", name = "i", descriptor = "Z")
	public static boolean aBoolean108 = true;

	@OriginalMember(owner = "client!go", name = "j", descriptor = "I")
	public static int anInt1313 = 0;

	@OriginalMember(owner = "client!go", name = "k", descriptor = "I")
	public static int anInt1314 = 0;

	@OriginalMember(owner = "client!go", name = "l", descriptor = "I")
	public static int anInt1315 = 0;

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(II)I")
	public static int method1053(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = arg0 >>> 1;
		@Pc(13) int local13 = local7 | local7 >>> 1;
		@Pc(23) int local23 = local13 | local13 >>> 2;
		@Pc(29) int local29 = local23 | local23 >>> 4;
		@Pc(35) int local35 = local29 | local29 >>> 8;
		@Pc(41) int local41 = local35 | local35 >>> 16;
		return ~local41 & arg0;
	}

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(ILjava/lang/String;)V")
	public static void method1054(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return;
		}
		@Pc(10) String local10 = Static142.method2873(arg0);
		if (local10 == null) {
			return;
		}
		for (@Pc(15) int local15 = 0; local15 < Static124.anInt2775; local15++) {
			@Pc(22) String local22 = Static142.method2873(Static64.aStringArray15[local15]);
			if (local22 != null && local22.equals(local10)) {
				Static124.anInt2775--;
				for (@Pc(34) int local34 = local15; local34 < Static124.anInt2775; local34++) {
					Static64.aStringArray15[local34] = Static64.aStringArray15[local34 + 1];
					Static323.aStringArray49[local34] = Static323.aStringArray49[local34 + 1];
					Static263.anIntArray667[local34] = Static263.anIntArray667[local34 + 1];
					Static107.aStringArray13[local34] = Static107.aStringArray13[local34 + 1];
					Static299.anIntArray734[local34] = Static299.anIntArray734[local34 + 1];
					Static44.aBooleanArray10[local34] = Static44.aBooleanArray10[local34 + 1];
				}
				Static55.anInt1452 = Static34.anInt776;
				Static29.aClass7_Sub3_Sub2_1.method2799(34);
				Static29.aClass7_Sub3_Sub2_1.method2735(Static344.method5559(arg0));
				Static29.aClass7_Sub3_Sub2_1.method2738(arg0);
				return;
			}
		}
	}
}
