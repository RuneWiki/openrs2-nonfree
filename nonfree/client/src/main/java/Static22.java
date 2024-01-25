import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static22 {

	@OriginalMember(owner = "client!ba", name = "b", descriptor = "I")
	public static int anInt338 = 0;

	@OriginalMember(owner = "client!ba", name = "c", descriptor = "I")
	public static int anInt339 = 1;

	@OriginalMember(owner = "client!ba", name = "d", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray2 = new String[] { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(IIIIIII)V")
	public static void method248(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3) {
		@Pc(3) Class247[] local3 = Static16.aClass247Array1;
		for (@Pc(5) int local5 = 0; local5 < local3.length; local5++) {
			@Pc(11) Class247 local11 = local3[local5];
			if (local11 != null && local11.anInt6960 == 2) {
				Static55.method856(local11.anInt6962 * 2, arg2 >> 1, arg0 >> 1, (local11.anInt6958 - Static279.anInt5198 << 7) + local11.anInt6959, local11.anInt6952 + (-Static350.anInt6470 + local11.anInt6957 << 7), local11.anInt6953);
				if (Static128.anIntArray211[0] > -1 && Static339.anInt6265 % 20 < 10) {
					Static94.aClass27Array12[local11.anInt6956].method5318(arg1 + Static128.anIntArray211[0] - 12, arg3 - (-Static128.anIntArray211[1] - -28));
				}
			}
		}
	}
}
