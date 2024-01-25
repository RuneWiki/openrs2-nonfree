import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static113 {

	@OriginalMember(owner = "client!fi", name = "n", descriptor = "Lclient!dn;")
	public static Class56 aClass56_82;

	@OriginalMember(owner = "client!fi", name = "o", descriptor = "Lclient!mv;")
	public static Class1_Sub3_Sub3_Sub1 aClass1_Sub3_Sub3_Sub1_4;

	@OriginalMember(owner = "client!fi", name = "m", descriptor = "Lclient!hb;")
	public static final Class92 aClass92_227 = new Class92(3, -1);

	@OriginalMember(owner = "client!fi", name = "p", descriptor = "I")
	public static int anInt6862 = 0;

	@OriginalMember(owner = "client!fi", name = "c", descriptor = "(I)V")
	public static void method5341() {
		for (@Pc(17) Class3_Sub3_Sub8 local17 = (Class3_Sub3_Sub8) Static144.aClass229_24.method5328(); local17 != null; local17 = (Class3_Sub3_Sub8) Static144.aClass229_24.method5325()) {
			@Pc(22) Class1_Sub3_Sub5 local22 = local17.aClass1_Sub3_Sub5_1;
			if (Static124.anInt2688 != local22.aByte77 || Static290.anInt5325 > local22.anInt4938) {
				local17.method5987();
				local22.method3963();
			} else if (local22.anInt4958 <= Static290.anInt5325) {
				if (local22.anInt4946 > 0) {
					@Pc(61) Class1_Sub3_Sub3_Sub2 local61 = Static451.aClass1_Sub3_Sub3_Sub2Array1[local22.anInt4946 - 1];
					if (local61 != null && local61.anInt6053 >= 0 && local61.anInt6053 < Static399.anInt6923 * 128 && local61.anInt6055 >= 0 && Static127.anInt2696 * 128 > local61.anInt6055) {
						local22.method3961(local61.anInt6053, Static124.method2209(local22.aByte77, local61.anInt6053, local61.anInt6055) - local22.anInt4955, Static290.anInt5325, local61.anInt6055);
					}
				}
				if (local22.anInt4946 < 0) {
					@Pc(124) int local124 = -local22.anInt4946 - 1;
					@Pc(135) Class1_Sub3_Sub3_Sub1 local135;
					if (local124 == Static177.anInt3617) {
						local135 = aClass1_Sub3_Sub3_Sub1_4;
					} else {
						local135 = Static308.aClass1_Sub3_Sub3_Sub1Array1[local124];
					}
					if (local135 != null && local135.anInt6053 >= 0 && Static399.anInt6923 * 128 > local135.anInt6053 && local135.anInt6055 >= 0 && local135.anInt6055 < Static127.anInt2696 * 128) {
						local22.method3961(local135.anInt6053, Static124.method2209(local22.aByte77, local135.anInt6053, local135.anInt6055) - local22.anInt4955, Static290.anInt5325, local135.anInt6055);
					}
				}
				local22.method3966(Static429.anInt7317);
				Static199.method3242(local22, true);
			}
		}
	}
}
