import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static258 {

	@OriginalMember(owner = "client!nc", name = "d", descriptor = "Lclient!sb;")
	public static Class212 aClass212_6;

	@OriginalMember(owner = "client!nc", name = "e", descriptor = "I")
	public static int anInt4823;

	@OriginalMember(owner = "client!nc", name = "b", descriptor = "Lclient!pn;")
	public static final Class186 aClass186_12 = new Class186("", 10);

	@OriginalMember(owner = "client!nc", name = "f", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray18 = new String[] { "en", "de", "fr", "pt", "nl" };

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(IIIIB)V")
	public static void method3728(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		for (@Pc(10) Class4_Sub8 local10 = (Class4_Sub8) Static281.aClass183_34.method4140(); local10 != null; local10 = (Class4_Sub8) Static281.aClass183_34.method4144()) {
			Static110.method2017(arg3, arg0, arg2, local10, arg1);
		}
		for (@Pc(31) Class4_Sub8 local31 = (Class4_Sub8) Static143.aClass183_20.method4140(); local31 != null; local31 = (Class4_Sub8) Static143.aClass183_20.method4144()) {
			@Pc(40) byte local40 = 1;
			@Pc(45) Class151 local45 = local31.aClass16_Sub1_Sub5_Sub2_1.method4757();
			if (local31.aClass16_Sub1_Sub5_Sub2_1.aBoolean562) {
				local40 = 0;
			} else if (local45.anInt4669 == local31.aClass16_Sub1_Sub5_Sub2_1.anInt6076 || local45.anInt4656 == local31.aClass16_Sub1_Sub5_Sub2_1.anInt6076 || local31.aClass16_Sub1_Sub5_Sub2_1.anInt6076 == local45.anInt4665 || local45.anInt4686 == local31.aClass16_Sub1_Sub5_Sub2_1.anInt6076) {
				local40 = 2;
			} else if (local31.aClass16_Sub1_Sub5_Sub2_1.anInt6076 == local45.anInt4667 || local45.anInt4681 == local31.aClass16_Sub1_Sub5_Sub2_1.anInt6076 || local31.aClass16_Sub1_Sub5_Sub2_1.anInt6076 == local45.anInt4688 || local45.anInt4675 == local31.aClass16_Sub1_Sub5_Sub2_1.anInt6076) {
				local40 = 3;
			}
			if (local31.anInt621 != local40) {
				@Pc(124) int local124 = Static325.method4392(local31.aClass16_Sub1_Sub5_Sub2_1);
				if (local31.anInt616 != local124) {
					if (local31.aClass4_Sub15_Sub3_2 != null) {
						Static360.aClass4_Sub15_Sub2_2.method2955(local31.aClass4_Sub15_Sub3_2);
						local31.aClass4_Sub15_Sub3_2 = null;
					}
					local31.anInt616 = local124;
				}
				local31.anInt621 = local40;
			}
			local31.anInt614 = local31.aClass16_Sub1_Sub5_Sub2_1.anInt6893;
			local31.anInt615 = local31.aClass16_Sub1_Sub5_Sub2_1.anInt6893 + (local31.aClass16_Sub1_Sub5_Sub2_1.method4751() << 6);
			local31.anInt613 = local31.aClass16_Sub1_Sub5_Sub2_1.anInt6892;
			local31.anInt612 = local31.aClass16_Sub1_Sub5_Sub2_1.anInt6892 + (local31.aClass16_Sub1_Sub5_Sub2_1.method4751() << 6);
			Static110.method2017(arg3, arg0, arg2, local31, arg1);
		}
		for (@Pc(202) Class4_Sub8 local202 = (Class4_Sub8) Static341.aClass102_38.method2705(); local202 != null; local202 = (Class4_Sub8) Static341.aClass102_38.method2704()) {
			@Pc(206) byte local206 = 1;
			@Pc(211) Class151 local211 = local202.aClass16_Sub1_Sub5_Sub1_2.method4757();
			if (local202.aClass16_Sub1_Sub5_Sub1_2.aBoolean562) {
				local206 = 0;
			} else if (local211.anInt4669 == local202.aClass16_Sub1_Sub5_Sub1_2.anInt6076 || local202.aClass16_Sub1_Sub5_Sub1_2.anInt6076 == local211.anInt4656 || local202.aClass16_Sub1_Sub5_Sub1_2.anInt6076 == local211.anInt4665 || local202.aClass16_Sub1_Sub5_Sub1_2.anInt6076 == local211.anInt4686) {
				local206 = 2;
			} else if (local211.anInt4667 == local202.aClass16_Sub1_Sub5_Sub1_2.anInt6076 || local202.aClass16_Sub1_Sub5_Sub1_2.anInt6076 == local211.anInt4681 || local211.anInt4688 == local202.aClass16_Sub1_Sub5_Sub1_2.anInt6076 || local211.anInt4675 == local202.aClass16_Sub1_Sub5_Sub1_2.anInt6076) {
				local206 = 3;
			}
			if (local206 != local202.anInt621) {
				@Pc(310) int local310 = Static33.method631(local202.aClass16_Sub1_Sub5_Sub1_2);
				if (local310 != local202.anInt616) {
					if (local202.aClass4_Sub15_Sub3_2 != null) {
						Static360.aClass4_Sub15_Sub2_2.method2955(local202.aClass4_Sub15_Sub3_2);
						local202.aClass4_Sub15_Sub3_2 = null;
					}
					local202.anInt616 = local310;
				}
				local202.anInt621 = local206;
			}
			local202.anInt614 = local202.aClass16_Sub1_Sub5_Sub1_2.anInt6893;
			local202.anInt615 = local202.aClass16_Sub1_Sub5_Sub1_2.anInt6893 + (local202.aClass16_Sub1_Sub5_Sub1_2.method4751() << 6);
			local202.anInt613 = local202.aClass16_Sub1_Sub5_Sub1_2.anInt6892;
			local202.anInt612 = local202.aClass16_Sub1_Sub5_Sub1_2.anInt6892 + (local202.aClass16_Sub1_Sub5_Sub1_2.method4751() << 6);
			Static110.method2017(arg3, arg0, arg2, local202, arg1);
		}
	}
}
