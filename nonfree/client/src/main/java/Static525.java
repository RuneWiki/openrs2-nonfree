import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static525 {

	@OriginalMember(owner = "client!sl", name = "vb", descriptor = "I")
	public static int anInt4734;

	@OriginalMember(owner = "client!sl", name = "I", descriptor = "Lclient!gr;")
	public static final Class130 aClass130_76 = new Class130(6, -1);

	@OriginalMember(owner = "client!sl", name = "jb", descriptor = "I")
	public static int anInt4723 = 0;

	@OriginalMember(owner = "client!sl", name = "m", descriptor = "(I)V")
	public static void method4230() {
		for (@Pc(15) Class3_Sub4_Sub4 local15 = (Class3_Sub4_Sub4) Static367.aClass223_42.method5874(); local15 != null; local15 = (Class3_Sub4_Sub4) Static367.aClass223_42.method5870()) {
			@Pc(20) Class4_Sub1_Sub2_Sub3 local20 = local15.aClass4_Sub1_Sub2_Sub3_1;
			if (Static101.anInt2262 > local20.anInt5106) {
				local15.method8769();
				local20.method4598();
			} else if (Static101.anInt2262 >= local20.anInt5114) {
				local20.method4602();
				if (local20.anInt5097 > 0) {
					@Pc(59) Class3_Sub28 local59 = (Class3_Sub28) Static551.aClass280_43.method7107((long) (local20.anInt5097 - 1));
					if (local59 != null) {
						@Pc(64) Class4_Sub1_Sub2_Sub1_Sub1 local64 = local59.aClass4_Sub1_Sub2_Sub1_Sub1_2;
						if (local64.anInt8916 >= 0 && Static634.anInt10129 * 512 > local64.anInt8916 && local64.anInt8911 >= 0 && local64.anInt8911 < Static638.anInt10172 * 512) {
							local20.method4601(Static101.anInt2262, local64.anInt8911, local64.anInt8916, Static192.method3263(local64.anInt8911, local64.anInt8916, local20.aByte123) - local20.anInt5122);
						}
					}
				}
				if (local20.anInt5097 < 0) {
					@Pc(121) int local121 = -local20.anInt5097 - 1;
					@Pc(132) Class4_Sub1_Sub2_Sub1_Sub2 local132;
					if (local121 == Static97.anInt2234) {
						local132 = Static477.aClass4_Sub1_Sub2_Sub1_Sub2_2;
					} else {
						local132 = Static42.aClass4_Sub1_Sub2_Sub1_Sub2Array1[local121];
					}
					if (local132 != null && local132.anInt8916 >= 0 && Static634.anInt10129 * 512 > local132.anInt8916 && local132.anInt8911 >= 0 && Static638.anInt10172 * 512 > local132.anInt8911) {
						local20.method4601(Static101.anInt2262, local132.anInt8911, local132.anInt8916, Static192.method3263(local132.anInt8911, local132.anInt8916, local20.aByte123) - local20.anInt5122);
					}
				}
				local20.method4597(Static354.anInt6785);
				Static67.method1693(local20, true);
			}
		}
	}
}
