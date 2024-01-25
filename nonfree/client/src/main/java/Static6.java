import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static6 {

	@OriginalMember(owner = "client!ad", name = "e", descriptor = "I")
	public static int anInt41;

	@OriginalMember(owner = "client!ad", name = "c", descriptor = "[F")
	public static final float[] aFloatArray3 = new float[16];

	@OriginalMember(owner = "client!ad", name = "f", descriptor = "Z")
	public static boolean aBoolean3 = false;

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(II)V")
	public static void method37(@OriginalArg(0) int arg0) {
		if (!Static220.method3432(arg0)) {
			return;
		}
		@Pc(18) Class230[] local18 = Static559.aClass230ArrayArray2[arg0];
		for (@Pc(20) int local20 = 0; local20 < local18.length; local20++) {
			@Pc(26) Class230 local26 = local18[local20];
			if (local26 != null) {
				local26.anInt6666 = 1;
				local26.anInt6723 = 0;
				local26.anInt6728 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!ad", name = "b", descriptor = "(II)I")
	public static int method38(@OriginalArg(1) int arg0) {
		return arg0 == 16711935 ? -1 : Static532.method7621(arg0);
	}
}
