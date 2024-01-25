import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static610 {

	@OriginalMember(owner = "client!vq", name = "z", descriptor = "Z")
	public static boolean aBoolean728 = false;

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(DB)V")
	public static void method8936(@OriginalArg(0) double arg0) {
		if (arg0 == Static307.aDouble12) {
			return;
		}
		for (@Pc(11) int local11 = 0; local11 < 256; local11++) {
			@Pc(23) int local23 = (int) (Math.pow((double) local11 / 255.0D, arg0) * 255.0D);
			Static286.anIntArray352[local11] = local23 > 255 ? 255 : local23;
		}
		Static307.aDouble12 = arg0;
	}
}
