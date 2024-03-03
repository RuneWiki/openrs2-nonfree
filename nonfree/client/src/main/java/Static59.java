import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static59 {

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(Z)Lclient!kp;", line = 6)
	public static Class131 method1704() {
		try {
			return (Class131) Class.forName("Class131_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(15) Throwable local15) {
			return null;
		}
	}

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(B)[Lclient!oi;", line = 47)
	public static Class169[] method1705() {
		if (Static215.aClass169Array1 == null) {
			@Pc(15) Class169[] local15 = Static103.method2267(Static305.aClass152_5);
			@Pc(19) Class169[] local19 = new Class169[local15.length];
			@Pc(21) int local21 = 0;
			@Pc(75) int local75;
			@Pc(81) Class169 local81;
			label63: for (@Pc(23) int local23 = 0; local23 < local15.length; local23++) {
				@Pc(29) Class169 local29 = local15[local23];
				if ((local29.anInt4678 <= 0 || local29.anInt4678 >= 24) && local29.anInt4676 >= 800 && local29.anInt4675 >= 600 && (Class208.anInt5790 >= 96 || Class2_Sub10.anInt1760 != 0 || local29.anInt4676 <= 1024 && local29.anInt4675 <= 768)) {
					for (local75 = 0; local75 < local21; local75++) {
						local81 = local19[local75];
						if (local29.anInt4676 == local81.anInt4676 && local81.anInt4675 == local29.anInt4675) {
							if (local29.anInt4678 > local81.anInt4678) {
								local19[local75] = local29;
							}
							continue label63;
						}
					}
					local19[local21] = local29;
					local21++;
				}
			}
			Static215.aClass169Array1 = new Class169[local21];
			Static390.method4610(local19, 0, Static215.aClass169Array1, 0, local21);
			@Pc(145) int[] local145 = new int[Static215.aClass169Array1.length];
			for (local75 = 0; local75 < Static215.aClass169Array1.length; local75++) {
				local81 = Static215.aClass169Array1[local75];
				local145[local75] = local81.anInt4675 * local81.anInt4676;
			}
			Static210.method3985(Static215.aClass169Array1, local145);
		}
		return Static215.aClass169Array1;
	}
}
