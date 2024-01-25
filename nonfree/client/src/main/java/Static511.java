import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static511 {

	@OriginalMember(owner = "client!tp", name = "a", descriptor = "[I")
	public static int[] anIntArray616;

	@OriginalMember(owner = "client!tp", name = "e", descriptor = "[[Z")
	public static final boolean[][] aBooleanArrayArray6 = new boolean[][] { new boolean[4], { false, true, true, false }, { true, false, true, false }, { true, false, true, false }, { false, false, true, false }, { false, false, true, false }, { true, false, true, false }, { true, false, false, true }, { true, false, false, true }, { true, true, false, false }, new boolean[4], { false, true, false, true }, new boolean[4] };

	@OriginalMember(owner = "client!tp", name = "a", descriptor = "(ID)V")
	public static void method7660(@OriginalArg(1) double arg0) {
		if (arg0 == Static309.aDouble1) {
			return;
		}
		for (@Pc(19) int local19 = 0; local19 < 256; local19++) {
			@Pc(31) int local31 = (int) (Math.pow((double) local19 / 255.0D, arg0) * 255.0D);
			Static404.anIntArray490[local19] = local31 > 255 ? 255 : local31;
		}
		Static309.aDouble1 = arg0;
	}
}
