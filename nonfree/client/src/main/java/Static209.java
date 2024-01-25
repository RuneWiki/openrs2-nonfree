import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static209 {

	@OriginalMember(owner = "client!ko", name = "b", descriptor = "Lclient!dh;")
	public static final Class49 aClass49_14 = new Class49(1, 3);

	@OriginalMember(owner = "client!ko", name = "c", descriptor = "[Lclient!dp;")
	public static final Class51[] aClass51Array1 = new Class51[8];

	@OriginalMember(owner = "client!ko", name = "d", descriptor = "I")
	public static int anInt4256 = -1;

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(DB)V")
	public static void method3676(@OriginalArg(0) double arg0) {
		if (arg0 == Static326.aDouble1) {
			return;
		}
		for (@Pc(11) int local11 = 0; local11 < 256; local11++) {
			@Pc(23) int local23 = (int) (Math.pow((double) local11 / 255.0D, arg0) * 255.0D);
			Static77.anIntArray131[local11] = local23 > 255 ? 255 : local23;
		}
		Static326.aDouble1 = arg0;
	}
}
