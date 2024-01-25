import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static224 {

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "I")
	public static int anInt4385;

	@OriginalMember(owner = "client!ik", name = "f", descriptor = "I")
	public static int anInt4388 = 0;

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(B)V")
	public static void method3883() {
		for (@Pc(15) Class3_Sub3_Sub16 local15 = (Class3_Sub3_Sub16) Static240.aClass130_25.method3543(); local15 != null; local15 = (Class3_Sub3_Sub16) Static240.aClass130_25.method3551()) {
			@Pc(20) Class9_Sub1_Sub1_Sub3 local20 = local15.aClass9_Sub1_Sub1_Sub3_1;
			if (local20.anInt829 < Static305.anInt5560) {
				local15.method7812();
				local20.method623();
			} else if (local20.anInt815 <= Static305.anInt5560) {
				if (local20.anInt837 > 0) {
					@Pc(60) Class3_Sub39 local60 = (Class3_Sub39) Static243.aClass310_16.method6601((long) (local20.anInt837 - 1));
					if (local60 != null) {
						@Pc(65) Class9_Sub1_Sub1_Sub2_Sub1 local65 = local60.aClass9_Sub1_Sub1_Sub2_Sub1_2;
						if (local65.anInt8975 >= 0 && Static400.anInt6818 * 512 > local65.anInt8975 && local65.anInt8980 >= 0 && local65.anInt8980 < Static271.anInt5050 * 512) {
							local20.method618(Static130.method2562(local65.anInt8980, local20.aByte126, local65.anInt8975) - local20.anInt808, Static305.anInt5560, local65.anInt8975, local65.anInt8980);
						}
					}
				}
				if (local20.anInt837 < 0) {
					@Pc(118) int local118 = -local20.anInt837 - 1;
					@Pc(129) Class9_Sub1_Sub1_Sub2_Sub2 local129;
					if (Static502.anInt8011 == local118) {
						local129 = Static226.aClass9_Sub1_Sub1_Sub2_Sub2_2;
					} else {
						local129 = Static438.aClass9_Sub1_Sub1_Sub2_Sub2Array2[local118];
					}
					if (local129 != null && local129.anInt8975 >= 0 && local129.anInt8975 < Static400.anInt6818 * 512 && local129.anInt8980 >= 0 && Static271.anInt5050 * 512 > local129.anInt8980) {
						local20.method618(Static130.method2562(local129.anInt8980, local20.aByte126, local129.anInt8975) - local20.anInt808, Static305.anInt5560, local129.anInt8975, local129.anInt8980);
					}
				}
				local20.method619(Static14.anInt217);
				Static216.method3774(local20, true);
			}
		}
	}
}
