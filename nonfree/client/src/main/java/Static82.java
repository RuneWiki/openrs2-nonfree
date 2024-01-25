import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static82 {

	@OriginalMember(owner = "client!du", name = "c", descriptor = "I")
	public static int anInt1991;

	@OriginalMember(owner = "client!du", name = "a", descriptor = "Lclient!ff;")
	public static final Class81 aClass81_36 = new Class81(84, 10);

	@OriginalMember(owner = "client!du", name = "b", descriptor = "Lclient!ff;")
	public static final Class81 aClass81_37 = new Class81(96, -2);

	@OriginalMember(owner = "client!du", name = "e", descriptor = "[[I")
	public static final int[][] anIntArrayArray10 = new int[][] { { 0, 1, 2, 3 }, { 1, 2, 3, 0 }, { 1, 2, -1, 0 }, { 2, 0, -1, 1 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 1, 3, -1 }, { -1, 0, 2, -1 }, { 3, 5, 2, 0 }, { 0, 2, 5, 3 }, { 0, 2, 3, 5 }, { 0, 1, 2, 3 } };

	@OriginalMember(owner = "client!du", name = "a", descriptor = "(IB)C")
	public static char method1460(@OriginalArg(1) byte arg0) {
		@Pc(14) int local14 = arg0 & 0xFF;
		if (local14 == 0) {
			throw new IllegalArgumentException("Non cp1252 character 0x" + Integer.toString(local14, 16) + " provided");
		}
		if (local14 >= 128 && local14 < 160) {
			@Pc(43) char local43 = Static127.aCharArray3[local14 - 128];
			if (local43 == '\u0000') {
				local43 = '?';
			}
			local14 = local43;
		}
		return (char) local14;
	}
}
