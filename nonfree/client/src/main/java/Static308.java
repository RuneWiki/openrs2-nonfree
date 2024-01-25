import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static308 {

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "Lclient!mn;")
	public static final Class163 aClass163_35 = new Class163(8);

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "(BIIIII)V")
	public static void method4348(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		Static80.anInt7141 = arg0;
		Static256.anInt4806 = arg1;
		Static28.anInt627 = arg4;
		Static146.anInt3069 = arg2;
		Static24.anInt5083 = arg3;
		if (Static256.anInt4806 >= 100) {
			@Pc(28) int local28 = Static80.anInt7141 * 128 + 64;
			@Pc(34) int local34 = Static28.anInt627 * 128 + 64;
			@Pc(42) int local42 = Static85.method1695(Static383.anInt6436, local34, local28) - Static146.anInt3069;
			@Pc(47) int local47 = local28 - Static364.anInt6270;
			@Pc(52) int local52 = local42 - Static355.anInt6031;
			@Pc(57) int local57 = local34 - Static23.anInt567;
			@Pc(69) int local69 = (int) Math.sqrt((double) (local47 * local47 + local57 * local57));
			Static119.anInt2680 = (int) (Math.atan2((double) local52, (double) local69) * 2607.5945876176133D) & 0x3FFF;
			Static140.anInt2975 = (int) (Math.atan2((double) local47, (double) local57) * -2607.5945876176133D) & 0x3FFF;
			if (Static119.anInt2680 < 1024) {
				Static119.anInt2680 = 1024;
			}
			Static130.anInt2796 = 0;
			if (Static119.anInt2680 > 3072) {
				Static119.anInt2680 = 3072;
			}
		}
		Static159.anInt3195 = 2;
	}
}
