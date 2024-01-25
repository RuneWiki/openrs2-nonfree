import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static241 {

	@OriginalMember(owner = "client!iha", name = "e", descriptor = "[[B")
	public static byte[][] aByteArrayArray12;

	@OriginalMember(owner = "client!iha", name = "d", descriptor = "Lclient!gr;")
	public static final Class130 aClass130_71 = new Class130(1, 4);

	@OriginalMember(owner = "client!iha", name = "g", descriptor = "I")
	public static int anInt4470 = 0;

	@OriginalMember(owner = "client!iha", name = "i", descriptor = "Z")
	public static boolean aBoolean301 = false;

	@OriginalMember(owner = "client!iha", name = "a", descriptor = "(I)[Lclient!uv;")
	public static Class347[] method3942() {
		if (Static49.aClass347Array1 == null) {
			@Pc(7) Class347[] local7 = Static265.method4360(Static205.aClass138_2);
			@Pc(11) Class347[] local11 = new Class347[local7.length];
			@Pc(13) int local13 = 0;
			@Pc(18) int local18 = Static262.aClass3_Sub27_12.aClass21_Sub17_1.method6184();
			@Pc(77) int local77;
			@Pc(83) Class347 local83;
			label69: for (@Pc(20) int local20 = 0; local20 < local7.length; local20++) {
				@Pc(26) Class347 local26 = local7[local20];
				if ((local26.anInt9593 <= 0 || local26.anInt9593 >= 24) && local26.anInt9596 >= 800 && local26.anInt9597 >= 600 && (local18 != 2 || local26.anInt9596 <= 800 && local26.anInt9597 <= 600) && (local18 != 1 || local26.anInt9596 <= 1024 && local26.anInt9597 <= 768)) {
					for (local77 = 0; local77 < local13; local77++) {
						local83 = local11[local77];
						if (local26.anInt9596 == local83.anInt9596 && local83.anInt9597 == local26.anInt9597) {
							if (local83.anInt9593 < local26.anInt9593) {
								local11[local77] = local26;
							}
							continue label69;
						}
					}
					local11[local13] = local26;
					local13++;
				}
			}
			Static49.aClass347Array1 = new Class347[local13];
			Static653.method6855(local11, 0, Static49.aClass347Array1, 0, local13);
			@Pc(147) int[] local147 = new int[Static49.aClass347Array1.length];
			for (local77 = 0; local77 < Static49.aClass347Array1.length; local77++) {
				local83 = Static49.aClass347Array1[local77];
				local147[local77] = local83.anInt9596 * local83.anInt9597;
			}
			Static475.method7132(local147, Static49.aClass347Array1);
		}
		return Static49.aClass347Array1;
	}
}
