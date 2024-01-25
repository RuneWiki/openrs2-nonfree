import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static114 {

	@OriginalMember(owner = "client!dp", name = "e", descriptor = "I")
	public static int anInt2292;

	@OriginalMember(owner = "client!dp", name = "f", descriptor = "Lclient!gj;")
	public static Class143 aClass143_26;

	@OriginalMember(owner = "client!dp", name = "b", descriptor = "Lclient!vl;")
	public static final Class376 aClass376_32 = new Class376(31, 6);

	@OriginalMember(owner = "client!dp", name = "a", descriptor = "(I)V")
	public static void method2118() {
		for (@Pc(15) Class3_Sub6_Sub15 local15 = (Class3_Sub6_Sub15) Static607.aClass193_65.method4457(); local15 != null; local15 = (Class3_Sub6_Sub15) Static607.aClass193_65.method4459()) {
			@Pc(20) Class23_Sub2_Sub1_Sub1 local20 = local15.aClass23_Sub2_Sub1_Sub1_1;
			if (local20.anInt869 < Static621.anInt9665) {
				local15.method8770();
				local20.method926();
			} else if (Static621.anInt9665 >= local20.anInt884) {
				local20.method924();
				if (local20.anInt876 > 0) {
					@Pc(44) Class3_Sub11 local44 = (Class3_Sub11) Static500.aClass62_40.method1682((long) (local20.anInt876 - 1));
					if (local44 != null) {
						@Pc(49) Class23_Sub2_Sub1_Sub2_Sub2 local49 = local44.aClass23_Sub2_Sub1_Sub2_Sub2_1;
						if (local49.anInt10108 >= 0 && Static251.anInt4680 * 512 > local49.anInt10108 && local49.anInt10109 >= 0 && local49.anInt10109 < Static406.anInt6924 * 512) {
							local20.method923(local49.anInt10109, Static621.anInt9665, Static194.method5133(local49.anInt10108, local49.anInt10109, local20.aByte142) - local20.anInt878, local49.anInt10108);
						}
					}
				}
				if (local20.anInt876 < 0) {
					@Pc(105) int local105 = -local20.anInt876 - 1;
					@Pc(112) Class23_Sub2_Sub1_Sub2_Sub1 local112;
					if (Static251.anInt4687 == local105) {
						local112 = Static515.aClass23_Sub2_Sub1_Sub2_Sub1_2;
					} else {
						local112 = Static346.aClass23_Sub2_Sub1_Sub2_Sub1Array1[local105];
					}
					if (local112 != null && local112.anInt10108 >= 0 && Static251.anInt4680 * 512 > local112.anInt10108 && local112.anInt10109 >= 0 && Static406.anInt6924 * 512 > local112.anInt10109) {
						local20.method923(local112.anInt10109, Static621.anInt9665, Static194.method5133(local112.anInt10108, local112.anInt10109, local20.aByte142) - local20.anInt878, local112.anInt10108);
					}
				}
				local20.method922(Static527.anInt8716);
				Static309.method4748(local20, true);
			}
		}
	}

	@OriginalMember(owner = "client!dp", name = "a", descriptor = "(B)I")
	public static int method2119() {
		@Pc(24) byte local24;
		if (Static595.anInt9375 >= 96) {
			@Pc(19) int local19 = Static424.method6048();
			if (local19 <= 100) {
				local24 = 4;
				Static650.method8525();
			} else if (local19 <= 500) {
				local24 = 3;
				Static627.method8276();
			} else if (local19 > 1000) {
				local24 = 1;
				Static53.method1374();
			} else {
				Static638.method8379();
				local24 = 2;
			}
		} else {
			local24 = 1;
			Static53.method1374();
		}
		if (Static227.aClass3_Sub15_11.aClass17_Sub20_1.method6402() != 0) {
			Static227.aClass3_Sub15_11.method2425(Static227.aClass3_Sub15_11.aClass17_Sub20_2, 0);
			Static422.method6016(false, 0);
		}
		Static57.method6341();
		return local24;
	}
}
