import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static397 {

	@OriginalMember(owner = "client!paa", name = "l", descriptor = "[I")
	public static final int[] anIntArray423 = new int[500];

	@OriginalMember(owner = "client!paa", name = "b", descriptor = "(II)V")
	public static void method5786(@OriginalArg(1) int arg0) {
		if (!Static293.method3974(arg0)) {
			return;
		}
		@Pc(19) Class361[] local19 = Static380.aClass361ArrayArray2[arg0];
		for (@Pc(21) int local21 = 0; local21 < local19.length; local21++) {
			@Pc(27) Class361 local27 = local19[local21];
			if (local27 != null) {
				local27.anInt9596 = 0;
				local27.anInt9664 = 1;
				local27.anInt9644 = 0;
			}
		}
	}
}
