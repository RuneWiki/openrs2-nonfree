import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static109 {

	@OriginalMember(owner = "client!el", name = "h", descriptor = "Lclient!qp;")
	public static final Class239 aClass239_54 = new Class239(93, 0);

	@OriginalMember(owner = "client!el", name = "j", descriptor = "[[I")
	public static final int[][] anIntArrayArray26 = new int[][] { { 6, 6 }, { 6, 6 }, { 6, 5, 5 }, { 5, 6, 5 }, { 5, 5, 6 }, { 6, 5, 5 }, { 5, 0, 4, 1 }, { 7, 7, 1, 2 }, { 7, 1, 2, 7 }, { 8, 9, 4, 0, 8, 9 }, { 0, 8, 9, 8, 9, 4 }, { 11, 0, 10, 11, 4, 2 }, { 6, 6 }, { 7, 7, 1, 2 }, { 7, 7, 1, 2 } };

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(BILjava/lang/String;[B)I")
	public static int method2115(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1, @OriginalArg(3) byte[] arg2) {
		@Pc(15) int local15 = arg1.length();
		for (@Pc(17) int local17 = 0; local17 < local15; local17 += 4) {
			@Pc(25) int local25 = Static278.method4396(arg1.charAt(local17));
			@Pc(42) int local42 = local15 > local17 + 1 ? Static278.method4396(arg1.charAt(local17 + 1)) : -1;
			@Pc(57) int local57 = local15 <= local17 + 2 ? -1 : Static278.method4396(arg1.charAt(local17 + 2));
			@Pc(74) int local74 = local15 <= local17 + 3 ? -1 : Static278.method4396(arg1.charAt(local17 + 3));
			arg2[arg0++] = (byte) (local42 >>> 4 | local25 << 2);
			if (local57 == -1) {
				break;
			}
			arg2[arg0++] = (byte) (local57 >>> 2 | (local42 & 0xF) << 4);
			if (local74 == -1) {
				break;
			}
			arg2[arg0++] = (byte) (local74 | (local57 & 0x3) << 6);
		}
		return arg0;
	}
}
