import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static245 {

	@OriginalMember(owner = "client!pq", name = "d", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray12;

	@OriginalMember(owner = "client!pq", name = "u", descriptor = "[[I")
	public static int[][] anIntArrayArray46;

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "I")
	public static int anInt4839 = 0;

	@OriginalMember(owner = "client!pq", name = "j", descriptor = "[I")
	public static final int[] anIntArray398 = new int[] { 0, 1, 2, 2, 1, 1, 2, 3, 1, 3, 3, 4, 2, 0, 4 };

	@OriginalMember(owner = "client!pq", name = "p", descriptor = "[[I")
	public static final int[][] anIntArrayArray45 = new int[][] { { 0, 2 }, { 0, 2 }, { 0, 0, 2 }, { 2, 0, 0 }, { 0, 2, 0 }, { 0, 0, 2 }, { 0, 5, 1, 4 }, { 0, 4, 4, 4 }, { 4, 4, 4, 0 }, { 6, 6, 6, 2, 2, 2 }, { 2, 2, 2, 6, 6, 6 }, { 0, 11, 6, 6, 6, 4 }, { 0, 2 }, { 0, 4, 4, 4 }, { 0, 4, 4, 4 } };

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "([BI)Z")
	public static boolean method4179(@OriginalArg(0) byte[] arg0) {
		@Pc(8) Class3_Sub4 local8 = new Class3_Sub4(arg0);
		@Pc(12) int local12 = local8.method3643();
		if (local12 != 1) {
			return false;
		}
		@Pc(28) boolean local28 = local8.method3643() == 1;
		if (local28) {
			Static297.method5051(local8);
		}
		Static102.method1722(local8);
		return true;
	}
}
