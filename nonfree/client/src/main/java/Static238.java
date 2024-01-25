import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static238 {

	@OriginalMember(owner = "client!jb", name = "F", descriptor = "[[I")
	public static int[][] anIntArrayArray34;

	@OriginalMember(owner = "client!jb", name = "J", descriptor = "F")
	public static float aFloat111;

	@OriginalMember(owner = "client!jb", name = "I", descriptor = "I")
	public static int anInt4881 = 0;

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(BII)Z")
	public static boolean method4200(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x22) != 0;
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(ZBI)V")
	public static void method4201(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1) {
		@Pc(14) Class6_Sub15 local14 = Static519.method7596(arg1, arg0);
		if (local14 != null) {
			for (@Pc(19) int local19 = 0; local19 < local14.anIntArray173.length; local19++) {
				local14.anIntArray173[local19] = -1;
				local14.anIntArray174[local19] = 0;
			}
		}
	}
}
