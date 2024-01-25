import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static128 {

	@OriginalMember(owner = "client!il", name = "h", descriptor = "I")
	public static int anInt6686 = -1;

	@OriginalMember(owner = "client!il", name = "i", descriptor = "[[I")
	public static final int[][] anIntArrayArray66 = new int[][] { { 6, 6 }, { 6, 6 }, { 6, 5, 5 }, { 5, 6, 5 }, { 5, 5, 6 }, { 6, 5, 5 }, { 5, 0, 4, 1 }, { 7, 7, 1, 2 }, { 7, 1, 2, 7 }, { 8, 9, 4, 0, 8, 9 }, { 0, 8, 9, 8, 9, 4 }, { 11, 0, 10, 11, 4, 2 }, { 6, 6 }, { 7, 7, 1, 2 }, { 7, 7, 1, 2 } };

	@OriginalMember(owner = "client!il", name = "j", descriptor = "I")
	public static int anInt6687 = 0;

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(IZZI)I")
	public static int method5597(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2) {
		@Pc(15) Class1_Sub19 local15 = Static274.method4804(arg0, arg1);
		if (local15 == null) {
			return 0;
		} else if (arg2 == -1) {
			return 0;
		} else {
			@Pc(27) int local27 = 0;
			for (@Pc(29) int local29 = 0; local29 < local15.anIntArray248.length; local29++) {
				if (arg2 == local15.anIntArray247[local29]) {
					local27 += local15.anIntArray248[local29];
				}
			}
			return local27;
		}
	}
}
