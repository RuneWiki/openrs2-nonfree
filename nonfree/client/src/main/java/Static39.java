import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static39 {

	@OriginalMember(owner = "client!bl", name = "z", descriptor = "Lclient!nn;")
	public static final Class216 aClass216_3 = new Class216(2, 7);

	@OriginalMember(owner = "client!bl", name = "F", descriptor = "I")
	public static int anInt679 = 0;

	@OriginalMember(owner = "client!bl", name = "G", descriptor = "I")
	public static final int anInt680 = 328;

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(III)Z")
	public static boolean method562(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x22) != 0;
	}

	@OriginalMember(owner = "client!bl", name = "e", descriptor = "(B)[Lclient!mh;")
	public static Class199[] method564() {
		if (Static399.aClass199Array1 == null) {
			@Pc(7) Class199[] local7 = Static434.method6275(Static152.aClass57_4);
			@Pc(11) Class199[] local11 = new Class199[local7.length];
			@Pc(13) int local13 = 0;
			@Pc(18) int local18 = Static480.aClass6_Sub37_Sub1_1.method5156(Static567.anInt9503);
			@Pc(78) int local78;
			@Pc(84) Class199 local84;
			label69: for (@Pc(20) int local20 = 0; local20 < local7.length; local20++) {
				@Pc(26) Class199 local26 = local7[local20];
				if ((local26.anInt5565 <= 0 || local26.anInt5565 >= 24) && local26.anInt5562 >= 800 && local26.anInt5559 >= 600 && (local18 != 2 || local26.anInt5562 <= 800 && local26.anInt5559 <= 600) && (local18 != 1 || local26.anInt5562 <= 1024 && local26.anInt5559 <= 768)) {
					for (local78 = 0; local78 < local13; local78++) {
						local84 = local11[local78];
						if (local26.anInt5562 == local84.anInt5562 && local26.anInt5559 == local84.anInt5559) {
							if (local26.anInt5565 > local84.anInt5565) {
								local11[local78] = local26;
							}
							continue label69;
						}
					}
					local11[local13] = local26;
					local13++;
				}
			}
			Static399.aClass199Array1 = new Class199[local13];
			Static585.method3081(local11, 0, Static399.aClass199Array1, 0, local13);
			@Pc(144) int[] local144 = new int[Static399.aClass199Array1.length];
			for (local78 = 0; local78 < Static399.aClass199Array1.length; local78++) {
				local84 = Static399.aClass199Array1[local78];
				local144[local78] = local84.anInt5559 * local84.anInt5562;
			}
			Static148.method2193(local144, Static399.aClass199Array1);
		}
		return Static399.aClass199Array1;
	}
}
