import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static137 {

	@OriginalMember(owner = "client!eda", name = "a", descriptor = "[I")
	public static int[] anIntArray170;

	@OriginalMember(owner = "client!eda", name = "a", descriptor = "(IBIIII)V")
	public static void method1988(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		Static567.anInt8900 = arg4;
		Static147.anInt2479 = arg3;
		Static48.anInt641 = arg1;
		Static414.anInt9481 = arg2;
		Static345.anInt5345 = arg0;
		if (Static345.anInt5345 >= 100) {
			@Pc(31) int local31 = Static567.anInt8900 * 512 + 256;
			@Pc(37) int local37 = Static147.anInt2479 * 512 + 256;
			@Pc(45) int local45 = Static324.method4554(Static684.anInt10516, local31, local37) - Static414.anInt9481;
			@Pc(50) int local50 = local31 - Static430.anInt7002;
			@Pc(55) int local55 = local45 - Static411.anInt6731;
			@Pc(60) int local60 = local37 - Static218.anInt3475;
			@Pc(71) int local71 = (int) Math.sqrt((double) (local50 * local50 + local60 * local60));
			Static583.anInt2354 = (int) (Math.atan2((double) local55, (double) local71) * 2607.5945876176133D) & 0x3FFF;
			Static611.anInt9456 = (int) (Math.atan2((double) local50, (double) local60) * -2607.5945876176133D) & 0x3FFF;
			if (Static583.anInt2354 < 1024) {
				Static583.anInt2354 = 1024;
			}
			Static322.anInt4929 = 0;
			if (Static583.anInt2354 > 3072) {
				Static583.anInt2354 = 3072;
			}
		}
		Static60.anInt1040 = 2;
		Static253.anInt3964 = -1;
		Static45.anInt602 = -1;
	}
}
