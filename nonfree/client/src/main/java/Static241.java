import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static241 {

	@OriginalMember(owner = "client!iga", name = "D", descriptor = "[[Z")
	public static boolean[][] aBooleanArrayArray5;

	@OriginalMember(owner = "client!iga", name = "H", descriptor = "[I")
	public static final int[] anIntArray212 = new int[25];

	@OriginalMember(owner = "client!iga", name = "a", descriptor = "(III)V")
	public static void method3845(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(23) boolean local23 = Static283.aClass128ArrayArrayArray1[0][arg1][arg2] != null && Static283.aClass128ArrayArrayArray1[0][arg1][arg2].aClass128_1 != null;
		for (@Pc(25) int local25 = arg0; local25 >= 0; local25--) {
			if (Static283.aClass128ArrayArrayArray1[local25][arg1][arg2] == null) {
				@Pc(47) Class128 local47 = Static283.aClass128ArrayArrayArray1[local25][arg1][arg2] = new Class128(local25);
				if (local23) {
					local47.aByte40++;
				}
			}
		}
	}
}
