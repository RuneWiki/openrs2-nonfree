import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static243 {

	@OriginalMember(owner = "client!pc", name = "c", descriptor = "I")
	public static int anInt4829;

	@OriginalMember(owner = "client!pc", name = "g", descriptor = "F")
	public static float aFloat65;

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(F)F", line = 166)
	public static float method4473(@OriginalArg(0) float arg0) {
		@Pc(7) float local7 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
		return local7 * 3.1415927F / 11025.0F;
	}
}
