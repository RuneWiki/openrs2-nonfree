import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static418 {

	@OriginalMember(owner = "client!vf", name = "z", descriptor = "[[Lclient!ru;")
	public static Class219[][] aClass219ArrayArray1;

	@OriginalMember(owner = "client!vf", name = "t", descriptor = "Lclient!fe;")
	public static final Class74 aClass74_32 = new Class74(16);

	@OriginalMember(owner = "client!vf", name = "A", descriptor = "Lclient!gn;")
	public static final Class92 aClass92_146 = new Class92(66, 4);

	@OriginalMember(owner = "client!vf", name = "c", descriptor = "(I)[Lclient!il;")
	public static Class118[] method6135() {
		if (Static208.aClass118Array1 == null) {
			@Pc(15) Class118[] local15 = Static331.method4830(Static45.aClass209_127);
			@Pc(19) Class118[] local19 = new Class118[local15.length];
			@Pc(21) int local21 = 0;
			@Pc(69) int local69;
			@Pc(75) Class118 local75;
			label63: for (@Pc(23) int local23 = 0; local23 < local15.length; local23++) {
				@Pc(29) Class118 local29 = local15[local23];
				if ((local29.anInt3441 <= 0 || local29.anInt3441 >= 24) && local29.anInt3440 >= 800 && local29.anInt3438 >= 600 && (Static270.anInt4876 >= 96 || Static294.anInt5208 != 0 || local29.anInt3440 <= 1024 && local29.anInt3438 <= 768)) {
					for (local69 = 0; local69 < local21; local69++) {
						local75 = local19[local69];
						if (local75.anInt3440 == local29.anInt3440 && local75.anInt3438 == local29.anInt3438) {
							if (local75.anInt3441 < local29.anInt3441) {
								local19[local69] = local29;
							}
							continue label63;
						}
					}
					local19[local21] = local29;
					local21++;
				}
			}
			Static208.aClass118Array1 = new Class118[local21];
			Static459.method6342(local19, 0, Static208.aClass118Array1, 0, local21);
			@Pc(127) int[] local127 = new int[Static208.aClass118Array1.length];
			for (local69 = 0; local69 < Static208.aClass118Array1.length; local69++) {
				local75 = Static208.aClass118Array1[local69];
				local127[local69] = local75.anInt3438 * local75.anInt3440;
			}
			Static180.method2955(local127, Static208.aClass118Array1);
		}
		return Static208.aClass118Array1;
	}
}
