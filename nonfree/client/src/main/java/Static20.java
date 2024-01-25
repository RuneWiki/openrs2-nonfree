import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static20 {

	@OriginalMember(owner = "client!an", name = "v", descriptor = "Lclient!dja;")
	public static final Class80 aClass80_1 = new Class80("game4", "Game 4", 3);

	@OriginalMember(owner = "client!an", name = "u", descriptor = "Lclient!ida;")
	public static final Class170 aClass170_1 = new Class170();

	@OriginalMember(owner = "client!an", name = "w", descriptor = "Lclient!ho;")
	public static final Class160 aClass160_7 = new Class160(26, 6);

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(B)V")
	public static void method321() {
		for (@Pc(15) Class14_Sub2_Sub12 local15 = (Class14_Sub2_Sub12) Static230.aClass32_24.method584(); local15 != null; local15 = (Class14_Sub2_Sub12) Static230.aClass32_24.method577()) {
			@Pc(20) Class4_Sub3_Sub3_Sub4 local20 = local15.aClass4_Sub3_Sub3_Sub4_1;
			if (local20.anInt3626 < Static530.anInt9105) {
				local15.method9513();
				local20.method3081();
			} else if (local20.anInt3596 <= Static530.anInt9105) {
				local20.method3086();
				if (local20.anInt3603 > 0) {
					@Pc(58) Class14_Sub44 local58 = (Class14_Sub44) Static100.aClass125_9.method2630((long) (local20.anInt3603 - 1));
					if (local58 != null) {
						@Pc(63) Class4_Sub3_Sub3_Sub3_Sub1 local63 = local58.aClass4_Sub3_Sub3_Sub3_Sub1_2;
						if (local63.anInt11184 >= 0 && Static380.anInt6689 * 512 > local63.anInt11184 && local63.anInt11178 >= 0 && local63.anInt11178 < Static542.anInt9214 * 512) {
							local20.method3084(local63.anInt11184, Static388.method5919(local63.anInt11178, local63.anInt11184, local20.aByte146) - local20.anInt3602, Static530.anInt9105, local63.anInt11178);
						}
					}
				}
				if (local20.anInt3603 < 0) {
					@Pc(132) int local132 = -local20.anInt3603 - 1;
					@Pc(139) Class4_Sub3_Sub3_Sub3_Sub2 local139;
					if (local132 == Static597.anInt9858) {
						local139 = Static294.aClass4_Sub3_Sub3_Sub3_Sub2_1;
					} else {
						local139 = Static269.aClass4_Sub3_Sub3_Sub3_Sub2Array4[local132];
					}
					if (local139 != null && local139.anInt11184 >= 0 && Static380.anInt6689 * 512 > local139.anInt11184 && local139.anInt11178 >= 0 && Static542.anInt9214 * 512 > local139.anInt11178) {
						local20.method3084(local139.anInt11184, Static388.method5919(local139.anInt11178, local139.anInt11184, local20.aByte146) - local20.anInt3602, Static530.anInt9105, local139.anInt11178);
					}
				}
				local20.method3083(Static468.anInt7945);
				Static209.method9481(local20, true);
			}
		}
	}
}
