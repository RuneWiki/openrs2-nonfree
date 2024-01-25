import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static270 {

	@OriginalMember(owner = "client!l", name = "b", descriptor = "I")
	public static int anInt5288;

	@OriginalMember(owner = "client!l", name = "a", descriptor = "Z")
	public static boolean aBoolean368 = false;

	@OriginalMember(owner = "client!l", name = "d", descriptor = "I")
	public static int anInt5290 = -1;

	@OriginalMember(owner = "client!l", name = "e", descriptor = "[I")
	public static final int[] anIntArray360 = new int[] { 160, 192, 80, 96, 0, 144, 80, 48, 160 };

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(IZ)V")
	public static void method4455(@OriginalArg(1) boolean arg0) {
		Static144.anInt3037 = 0;
		Static370.anInt7928 = 0;
		Static282.method4789();
		Static420.method7310(arg0);
		Static481.method6698();
		@Pc(18) boolean local18 = false;
		@Pc(26) int local26;
		for (@Pc(20) int local20 = 0; local20 < Static370.anInt7928; local20++) {
			local26 = Static359.anIntArray506[local20];
			@Pc(33) Class5_Sub51 local33 = (Class5_Sub51) Static521.aClass42_42.method1109((long) local26);
			@Pc(36) Class15_Sub2_Sub1_Sub2 local36 = local33.aClass15_Sub2_Sub1_Sub2_2;
			if (Static218.aBoolean250 && Static76.method1383(local26)) {
				Static454.method6370();
			}
			if (Static481.anInt8318 != local36.anInt4749) {
				if (local36.aClass305_1.method7141()) {
					Static243.method4137(local36);
				}
				local36.method4045(null);
				local18 = true;
				local33.method7425();
			}
		}
		if (local18) {
			Static310.anInt6066 = Static521.aClass42_42.method1111();
			Static521.aClass42_42.method1113(Static275.aClass5_Sub51Array1);
		}
		if (Static319.anInt6170 != Static131.aClass5_Sub3_Sub1_1.anInt4960) {
			throw new RuntimeException("gnp1 pos:" + Static131.aClass5_Sub3_Sub1_1.anInt4960 + " psize:" + Static319.anInt6170);
		}
		for (local26 = 0; local26 < Static438.anInt7689; local26++) {
			if (Static521.aClass42_42.method1109((long) Static547.anIntArray731[local26]) == null) {
				throw new RuntimeException("gnp2 pos:" + local26 + " size:" + Static438.anInt7689);
			}
		}
	}
}
