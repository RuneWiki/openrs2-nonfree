import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static354 {

	@OriginalMember(owner = "client!rl", name = "j", descriptor = "F")
	public static float aFloat85;

	@OriginalMember(owner = "client!rl", name = "e", descriptor = "I")
	public static int anInt6241 = 0;

	@OriginalMember(owner = "client!rl", name = "g", descriptor = "Lclient!gw;")
	public static final Class91 aClass91_42 = new Class91();

	@OriginalMember(owner = "client!rl", name = "h", descriptor = "I")
	public static int anInt6243 = 0;

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(I)[Lclient!vi;")
	public static Class261[] method5122() {
		if (Static274.aClass261Array2 == null) {
			@Pc(7) Class261[] local7 = Static228.method3893(Static390.aClass255_5);
			@Pc(11) Class261[] local11 = new Class261[local7.length];
			@Pc(13) int local13 = 0;
			@Pc(61) int local61;
			@Pc(67) Class261 local67;
			label63: for (@Pc(15) int local15 = 0; local15 < local7.length; local15++) {
				@Pc(21) Class261 local21 = local7[local15];
				if ((local21.anInt7468 <= 0 || local21.anInt7468 >= 24) && local21.anInt7470 >= 800 && local21.anInt7469 >= 600 && (Static263.anInt5007 >= 96 || Static192.anInt3828 != 0 || local21.anInt7470 <= 1024 && local21.anInt7469 <= 768)) {
					for (local61 = 0; local61 < local13; local61++) {
						local67 = local11[local61];
						if (local67.anInt7470 == local21.anInt7470 && local21.anInt7469 == local67.anInt7469) {
							if (local67.anInt7468 < local21.anInt7468) {
								local11[local61] = local21;
							}
							continue label63;
						}
					}
					local11[local13] = local21;
					local13++;
				}
			}
			Static274.aClass261Array2 = new Class261[local13];
			Static474.method3329(local11, 0, Static274.aClass261Array2, 0, local13);
			@Pc(135) int[] local135 = new int[Static274.aClass261Array2.length];
			for (local61 = 0; local61 < Static274.aClass261Array2.length; local61++) {
				local67 = Static274.aClass261Array2[local61];
				local135[local61] = local67.anInt7470 * local67.anInt7469;
			}
			Static252.method4142(Static274.aClass261Array2, local135);
		}
		return Static274.aClass261Array2;
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(Lclient!tf;IZ)V")
	public static void method5123(@OriginalArg(0) Class240 arg0, @OriginalArg(2) boolean arg1) {
		@Pc(15) int local15 = arg0.anInt6839 == 0 ? arg0.anInt6904 : arg0.anInt6839;
		@Pc(27) int local27 = arg0.anInt6926 == 0 ? arg0.anInt6894 : arg0.anInt6926;
		Static170.method2988(Static122.aClass240ArrayArray2[arg0.anInt6909 >> 16], local15, arg0.anInt6909, arg1, local27);
		if (arg0.aClass240Array2 != null) {
			Static170.method2988(arg0.aClass240Array2, local15, arg0.anInt6909, arg1, local27);
		}
		@Pc(67) Class4_Sub39 local67 = (Class4_Sub39) Static157.aClass96_22.method2797((long) arg0.anInt6909);
		if (local67 != null) {
			Static156.method5967(local67.anInt6721, local15, arg1, local27);
		}
	}
}
