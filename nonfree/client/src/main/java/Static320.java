import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static320 {

	@OriginalMember(owner = "client!lha", name = "A", descriptor = "Lclient!cl;")
	public static Class53 aClass53_2;

	@OriginalMember(owner = "client!lha", name = "B", descriptor = "I")
	public static final int anInt6023 = 2;

	@OriginalMember(owner = "client!lha", name = "D", descriptor = "[I")
	public static final int[] anIntArray341 = new int[3];

	@OriginalMember(owner = "client!lha", name = "a", descriptor = "([[SB[[F)[[S")
	public static short[][] method5249(@OriginalArg(0) short[][] arg0, @OriginalArg(2) float[][] arg1) {
		for (@Pc(12) int local12 = 0; local12 < arg1.length; local12++) {
			for (@Pc(16) int local16 = 0; local16 < arg0[local12].length; local16++) {
				arg0[local12][local16] = (short) (arg1[local12][local16] * 16383.0F);
			}
		}
		return arg0;
	}
}
