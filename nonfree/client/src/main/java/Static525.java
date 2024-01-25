import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static525 {

	@OriginalMember(owner = "client!vw", name = "x", descriptor = "[I")
	public static final int[] anIntArray765 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!vw", name = "c", descriptor = "(I)V")
	public static void method7465() {
		for (@Pc(5) int local5 = 0; local5 < Static208.aClass308ArrayArray1.length; local5++) {
			for (@Pc(8) int local8 = 0; local8 < Static208.aClass308ArrayArray1[local5].length; local8++) {
				Static208.aClass308ArrayArray1[local5][local8] = Static15.aClass308_1;
			}
		}
	}

	@OriginalMember(owner = "client!vw", name = "c", descriptor = "(II)I")
	public static int method7467(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static184.anIntArrayArray32 == null ? 0 : Static184.anIntArrayArray32[arg0][arg1] & 0xFFFFFF;
	}
}
