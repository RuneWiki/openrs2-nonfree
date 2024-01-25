import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static667 {

	@OriginalMember(owner = "client!wm", name = "g", descriptor = "Lclient!pa;")
	public static final Class265 aClass265_65 = new Class265(4);

	@OriginalMember(owner = "client!wm", name = "h", descriptor = "Lclient!ke;")
	public static final Class196 aClass196_337 = new Class196(76, 3);

	@OriginalMember(owner = "client!wm", name = "j", descriptor = "I")
	public static int anInt10411 = -1;

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(IZIIII)V")
	public static void method8690(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		Static394.anInt6803 = arg2;
		Static19.anInt269 = arg1;
		Static144.anInt10373 = arg4;
		Static310.anInt5525 = arg0;
		Static345.anInt6197 = arg3;
		if (Static19.anInt269 >= 100) {
			@Pc(27) int local27 = Static345.anInt6197 * 512 + 256;
			@Pc(33) int local33 = Static144.anInt10373 * 512 + 256;
			@Pc(42) int local42 = Static161.method1246(Static458.anInt7955, local33, local27) - Static310.anInt5525;
			@Pc(47) int local47 = local27 - Static570.anInt9347;
			@Pc(52) int local52 = local42 - Static546.anInt8938;
			@Pc(57) int local57 = local33 - Static105.anInt1868;
			@Pc(69) int local69 = (int) Math.sqrt((double) (local47 * local47 + local57 * local57));
			Static498.anInt8495 = (int) (Math.atan2((double) local52, (double) local69) * 2607.5945876176133D) & 0x3FFF;
			Static493.anInt8442 = (int) (Math.atan2((double) local47, (double) local57) * -2607.5945876176133D) & 0x3FFF;
			Static78.anInt1274 = 0;
			if (Static498.anInt8495 < 1024) {
				Static498.anInt8495 = 1024;
			}
			if (Static498.anInt8495 > 3072) {
				Static498.anInt8495 = 3072;
			}
		}
		Static133.anInt2254 = 2;
		Static67.anInt1033 = -1;
		Static297.anInt571 = -1;
	}
}
