import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static640 {

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(IIIZII)V")
	public static void method6760(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		Static485.anInt8265 = arg2;
		Static118.anInt2182 = arg0;
		Static563.anInt9475 = arg4;
		Static43.anInt935 = arg3;
		Static447.anInt7620 = arg1;
		if (Static563.anInt9475 >= 100) {
			@Pc(26) int local26 = Static447.anInt7620 * 512 + 256;
			@Pc(32) int local32 = Static43.anInt935 * 512 + 256;
			@Pc(40) int local40 = Static644.method9021(local32, local26, Static636.anInt10567) - Static485.anInt8265;
			@Pc(45) int local45 = local26 - Static19.anInt277;
			@Pc(49) int local49 = local40 - Static441.anInt7550;
			@Pc(53) int local53 = local32 - Static117.anInt2170;
			@Pc(64) int local64 = (int) Math.sqrt((double) (local45 * local45 + local53 * local53));
			Static210.anInt4029 = (int) (Math.atan2((double) local49, (double) local64) * 2607.5945876176133D) & 0x3FFF;
			Static491.anInt8292 = (int) (Math.atan2((double) local45, (double) local53) * -2607.5945876176133D) & 0x3FFF;
			Static290.anInt5062 = 0;
			if (Static210.anInt4029 < 1024) {
				Static210.anInt4029 = 1024;
			}
			if (Static210.anInt4029 > 3072) {
				Static210.anInt4029 = 3072;
			}
		}
		Static396.anInt6606 = -1;
		Static304.anInt5319 = -1;
		Static254.anInt4612 = 2;
	}
}
