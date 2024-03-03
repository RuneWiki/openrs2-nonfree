import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static278 {

	@OriginalMember(owner = "client!ri", name = "R", descriptor = "I")
	public static int anInt5685;

	@OriginalMember(owner = "client!ri", name = "X", descriptor = "[[I")
	public static int[][] anIntArrayArray50;

	@OriginalMember(owner = "client!ri", name = "c", descriptor = "(Z)V", line = 610)
	public static void method5189() {
		for (@Pc(14) Class2_Sub2_Sub9 local14 = (Class2_Sub2_Sub9) Class6.aClass135_38.method3552(); local14 != null; local14 = (Class2_Sub2_Sub9) Class6.aClass135_38.method3553()) {
			@Pc(19) Class11_Sub5_Sub3 local19 = local14.aClass11_Sub5_Sub3_1;
			if (local19.aByte78 != Static330.anInt6573 || local19.anInt4713 < Class83.anInt2345) {
				local14.method6469();
				local19.method4392();
			} else if (Class83.anInt2345 >= local19.anInt4716) {
				if (local19.anInt4705 > 0) {
					@Pc(56) Class11_Sub5_Sub2_Sub2 local56 = Class2_Sub40.aClass11_Sub5_Sub2_Sub2Array1[local19.anInt4705 - 1];
					if (local56 != null && local56.anInt6768 >= 0 && local56.anInt6768 < Class241.anInt7020 * 128 && local56.anInt6770 >= 0 && OutputStream_Sub1.anInt4442 * 128 > local56.anInt6770) {
						local19.method4398(Static360.method6033(local56.anInt6768, local56.anInt6770, local19.aByte78) - local19.anInt4727, local56.anInt6768, Class83.anInt2345, local56.anInt6770);
					}
				}
				if (local19.anInt4705 < 0) {
					@Pc(111) int local111 = -local19.anInt4705 - 1;
					@Pc(120) Class11_Sub5_Sub2_Sub1 local120;
					if (local111 == Class11_Sub3_Sub2.anInt4220) {
						local120 = Static17.aClass11_Sub5_Sub2_Sub1_3;
					} else {
						local120 = Class9.aClass11_Sub5_Sub2_Sub1Array1[local111];
					}
					if (local120 != null && local120.anInt6768 >= 0 && local120.anInt6768 < Class241.anInt7020 * 128 && local120.anInt6770 >= 0 && local120.anInt6770 < OutputStream_Sub1.anInt4442 * 128) {
						local19.method4398(Static360.method6033(local120.anInt6768, local120.anInt6770, local19.aByte78) - local19.anInt4727, local120.anInt6768, Class83.anInt2345, local120.anInt6770);
					}
				}
				local19.method4393(Class116.anInt3144);
				Static306.method5631(local19, true);
			}
		}
	}
}
