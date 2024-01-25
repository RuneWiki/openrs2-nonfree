import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static309 {

	@OriginalMember(owner = "client!ji", name = "m", descriptor = "[[I")
	public static int[][] anIntArrayArray22;

	@OriginalMember(owner = "client!ji", name = "G", descriptor = "I")
	public static int anInt4982;

	@OriginalMember(owner = "client!ji", name = "H", descriptor = "Lclient!nt;")
	public static Class270 aClass270_9 = null;

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(III)Lclient!tr;")
	public static Class364 method4578(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (Static448.aClass364ArrayArrayArray2[arg0][arg1][arg2] == null) {
			@Pc(33) boolean local33 = Static448.aClass364ArrayArrayArray2[0][arg1][arg2] != null && Static448.aClass364ArrayArrayArray2[0][arg1][arg2].aClass364_1 != null;
			if (local33 && arg0 >= Static169.anInt2992 - 1) {
				return null;
			}
			Static389.method5283(arg0, arg1, arg2);
		}
		return Static448.aClass364ArrayArrayArray2[arg0][arg1][arg2];
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(BB)C")
	public static char method4582(@OriginalArg(0) byte arg0) {
		@Pc(13) int local13 = arg0 & 0xFF;
		if (local13 == 0) {
			throw new IllegalArgumentException("Non cp1252 character 0x" + Integer.toString(local13, 16) + " provided");
		}
		if (local13 >= 128 && local13 < 160) {
			@Pc(51) char local51 = Static145.aCharArray8[local13 - 128];
			if (local51 == '\u0000') {
				local51 = '?';
			}
			local13 = local51;
		}
		return (char) local13;
	}
}
