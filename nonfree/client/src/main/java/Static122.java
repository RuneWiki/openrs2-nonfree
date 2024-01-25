import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static122 {

	@OriginalMember(owner = "client!efa", name = "a", descriptor = "I")
	public static int anInt10526;

	@OriginalMember(owner = "client!efa", name = "b", descriptor = "Z")
	public static boolean aBoolean721;

	@OriginalMember(owner = "client!efa", name = "c", descriptor = "I")
	public static int anInt10527;

	@OriginalMember(owner = "client!efa", name = "a", descriptor = "(I[[S[[F)[[S")
	public static short[][] method8784(@OriginalArg(1) short[][] arg0, @OriginalArg(2) float[][] arg1) {
		for (@Pc(8) int local8 = 0; local8 < arg1.length; local8++) {
			for (@Pc(12) int local12 = 0; local12 < arg0[local8].length; local12++) {
				arg0[local8][local12] = (short) (arg1[local8][local12] * 16383.0F);
			}
		}
		return arg0;
	}
}
