import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static549 {

	@OriginalMember(owner = "client!sr", name = "m", descriptor = "[[[Lclient!rr;")
	public static Class313[][][] aClass313ArrayArrayArray6;

	@OriginalMember(owner = "client!sr", name = "s", descriptor = "Lclient!fa;")
	public static Class107 aClass107_3;

	@OriginalMember(owner = "client!sr", name = "w", descriptor = "[Z")
	public static final boolean[] aBooleanArray22 = new boolean[8];

	@OriginalMember(owner = "client!sr", name = "x", descriptor = "Lclient!dba;")
	public static final Class74 aClass74_17 = new Class74(8, 16);

	@OriginalMember(owner = "client!sr", name = "c", descriptor = "(BI)C")
	public static char method7576(@OriginalArg(0) byte arg0) {
		@Pc(7) int local7 = arg0 & 0xFF;
		if (local7 == 0) {
			throw new IllegalArgumentException("Non cp1252 character 0x" + Integer.toString(local7, 16) + " provided");
		}
		if (local7 >= 128 && local7 < 160) {
			@Pc(45) char local45 = Static218.aCharArray3[local7 - 128];
			if (local45 == '\u0000') {
				local45 = '?';
			}
			local7 = local45;
		}
		return (char) local7;
	}

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(IIIII)V")
	public static void method7581(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (Static498.anIntArrayArray67 != null) {
			Static498.anIntArrayArray67[arg0][arg1] = arg2 | 0xFF000000;
		}
		if (Static288.aShortArrayArray13 != null) {
			Static288.aShortArrayArray13[arg0][arg1] = (short) arg3;
		}
		if (Static106.aByteArrayArray2 != null) {
			Static106.aByteArrayArray2[arg0][arg1] = (byte) arg4;
		}
	}
}
