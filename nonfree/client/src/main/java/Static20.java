import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static20 {

	@OriginalMember(owner = "client!as", name = "c", descriptor = "Z")
	public static boolean aBoolean36 = false;

	@OriginalMember(owner = "client!as", name = "f", descriptor = "I")
	public static int anInt423 = 0;

	@OriginalMember(owner = "client!as", name = "k", descriptor = "I")
	public static int anInt428 = 0;

	@OriginalMember(owner = "client!as", name = "l", descriptor = "Z")
	public static boolean aBoolean37 = false;

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(Z)[Lclient!kw;")
	public static Class146[] method335() {
		if (Static423.aClass146Array1 == null) {
			@Pc(7) Class146[] local7 = Static358.method4637(Static7.aClass93_1);
			@Pc(11) Class146[] local11 = new Class146[local7.length];
			@Pc(13) int local13 = 0;
			@Pc(64) int local64;
			@Pc(70) Class146 local70;
			label63: for (@Pc(15) int local15 = 0; local15 < local7.length; local15++) {
				@Pc(21) Class146 local21 = local7[local15];
				if ((local21.anInt3804 <= 0 || local21.anInt3804 >= 24) && local21.anInt3802 >= 800 && local21.anInt3803 >= 600 && (Static102.anInt1724 >= 96 || Static146.anInt2644 != 0 || local21.anInt3802 <= 1024 && local21.anInt3803 <= 768)) {
					for (local64 = 0; local64 < local13; local64++) {
						local70 = local11[local64];
						if (local70.anInt3802 == local21.anInt3802 && local70.anInt3803 == local21.anInt3803) {
							if (local70.anInt3804 < local21.anInt3804) {
								local11[local64] = local21;
							}
							continue label63;
						}
					}
					local11[local13] = local21;
					local13++;
				}
			}
			Static423.aClass146Array1 = new Class146[local13];
			Static468.method3860(local11, 0, Static423.aClass146Array1, 0, local13);
			@Pc(122) int[] local122 = new int[Static423.aClass146Array1.length];
			for (local64 = 0; local64 < Static423.aClass146Array1.length; local64++) {
				local70 = Static423.aClass146Array1[local64];
				local122[local64] = local70.anInt3802 * local70.anInt3803;
			}
			Static29.method460(Static423.aClass146Array1, local122);
		}
		return Static423.aClass146Array1;
	}

	@OriginalMember(owner = "client!as", name = "b", descriptor = "(I)Z")
	public static boolean method336() {
		@Pc(7) Class5 local7 = Static122.aClass177_13.aClass5_167.aClass5_268;
		if (local7 == null || Static122.aClass177_13.aClass5_167 == local7) {
			return false;
		}
		@Pc(18) Class5_Sub41 local18 = (Class5_Sub41) local7;
		if (local18.anInt6815 >= 2000) {
			local18.anInt6815 -= 2000;
		}
		return local18.anInt6815 == 1008;
	}
}
