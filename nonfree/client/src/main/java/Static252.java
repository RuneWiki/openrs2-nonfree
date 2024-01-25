import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static252 {

	@OriginalMember(owner = "client!mn", name = "p", descriptor = "Lclient!f;")
	public static Class22 aClass22_12;

	@OriginalMember(owner = "client!mn", name = "o", descriptor = "Lclient!eo;")
	public static Class68 aClass68_7 = null;

	@OriginalMember(owner = "client!mn", name = "c", descriptor = "(B)[Lclient!hk;")
	public static Class98[] method3856() {
		if (Static292.aClass98Array1 == null) {
			@Pc(12) Class98[] local12 = Static420.method5622(Static295.aClass103_5);
			@Pc(16) Class98[] local16 = new Class98[local12.length];
			@Pc(18) int local18 = 0;
			@Pc(68) int local68;
			@Pc(73) Class98 local73;
			label63: for (@Pc(20) int local20 = 0; local20 < local12.length; local20++) {
				@Pc(25) Class98 local25 = local12[local20];
				if ((local25.anInt3338 <= 0 || local25.anInt3338 >= 24) && local25.anInt3341 >= 800 && local25.anInt3339 >= 600 && (Static102.anInt619 >= 96 || Static347.anInt6318 != 0 || local25.anInt3341 <= 1024 && local25.anInt3339 <= 768)) {
					for (local68 = 0; local68 < local18; local68++) {
						local73 = local16[local68];
						if (local73.anInt3341 == local25.anInt3341 && local25.anInt3339 == local73.anInt3339) {
							if (local73.anInt3338 < local25.anInt3338) {
								local16[local68] = local25;
							}
							continue label63;
						}
					}
					local16[local18] = local25;
					local18++;
				}
			}
			Static292.aClass98Array1 = new Class98[local18];
			Static464.method5799(local16, 0, Static292.aClass98Array1, 0, local18);
			@Pc(132) int[] local132 = new int[Static292.aClass98Array1.length];
			for (local68 = 0; local68 < Static292.aClass98Array1.length; local68++) {
				local73 = Static292.aClass98Array1[local68];
				local132[local68] = local73.anInt3341 * local73.anInt3339;
			}
			Static363.method5129(local132, Static292.aClass98Array1);
		}
		return Static292.aClass98Array1;
	}
}
