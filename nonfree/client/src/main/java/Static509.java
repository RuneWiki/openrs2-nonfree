import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static509 {

	@OriginalMember(owner = "client!rg", name = "e", descriptor = "Lclient!wm;")
	public static Class390 aClass390_99;

	@OriginalMember(owner = "client!rg", name = "i", descriptor = "I")
	public static int anInt8531;

	@OriginalMember(owner = "client!rg", name = "g", descriptor = "I")
	public static int anInt8529 = 0;

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(IIII)V")
	public static void method7275(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (Static35.anInt561 == arg0 && arg2 == Static273.anInt5013 && arg1 == Static184.anInt3598) {
			return;
		}
		Static184.anInt3598 = arg1;
		Static35.anInt561 = arg0;
		Static375.aBoolean591 = true;
		Static273.anInt5013 = arg2;
		@Pc(39) double local39 = -((double) (arg0 * 2) * 3.141592653589793D) / 16384.0D;
		@Pc(49) double local49 = -((double) (arg2 * 2) * 3.141592653589793D) / 16384.0D;
		@Pc(52) double local52 = Math.cos(local49);
		@Pc(55) double local55 = Math.sin(local49);
		@Pc(58) double local58 = Math.cos(local39);
		@Pc(61) double local61 = Math.sin(local39);
		Static554.aDouble24 = local55;
		Static487.aDouble20 = 0.0D;
		Static642.aDouble25 = local58 * -local55;
		Static519.aDouble22 = local52 * local58;
		Static12.aDouble1 = local61;
		Static25.aDouble2 = local52;
		Static81.aDouble3 = -local52 * local61;
		Static179.aDouble7 = local58;
		Static231.aDouble8 = local61 * local55;
	}

	@OriginalMember(owner = "client!rg", name = "b", descriptor = "(I)V")
	public static void method7276() {
		for (@Pc(3) int local3 = 0; local3 < Static204.anInt3872; local3++) {
			@Pc(9) Class351 local9 = Static569.aClass351Array1[local3];
			if (local9.aByte134 == 3) {
				if (local9.aClass5_Sub17_Sub2_4 == null) {
					local9.anInt9878 = Integer.MIN_VALUE;
				} else {
					Static245.aClass5_Sub17_Sub4_2.method6184(local9.aClass5_Sub17_Sub2_4);
				}
			}
		}
	}
}
