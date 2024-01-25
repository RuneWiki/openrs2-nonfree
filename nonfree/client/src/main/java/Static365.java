import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static365 {

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "Lclient!uo;")
	public static Class251 aClass251_6;

	@OriginalMember(owner = "client!sf", name = "b", descriptor = "I")
	public static int anInt6680;

	@OriginalMember(owner = "client!sf", name = "h", descriptor = "[S")
	public static short[] aShortArray126;

	@OriginalMember(owner = "client!sf", name = "c", descriptor = "J")
	public static long aLong190 = -1L;

	@OriginalMember(owner = "client!sf", name = "d", descriptor = "I")
	public static int anInt6681 = 0;

	@OriginalMember(owner = "client!sf", name = "e", descriptor = "I")
	public static int anInt6682 = 0;

	@OriginalMember(owner = "client!sf", name = "f", descriptor = "[[I")
	public static final int[][] anIntArrayArray54 = new int[][] { { 0, 1, 2, 3 }, { 1, 2, 3, 0 }, { 1, 2, -1, 0 }, { 2, 0, -1, 1 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 1, 3, -1 }, { -1, 0, 2, -1 }, { 3, 5, 2, 0 }, { 0, 2, 5, 3 }, { 0, 2, 3, 5 }, { 0, 1, 2, 3 } };

	@OriginalMember(owner = "client!sf", name = "i", descriptor = "[B")
	public static final byte[] aByteArray83 = new byte[520];

	@OriginalMember(owner = "client!sf", name = "j", descriptor = "[I")
	public static final int[] anIntArray617 = new int[25];

	@OriginalMember(owner = "client!sf", name = "k", descriptor = "Lclient!nk;")
	public static final Class177 aClass177_96 = new Class177(41, 0);

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(IB)Z")
	public static boolean method5099(@OriginalArg(0) int arg0) {
		for (@Pc(18) Class1_Sub35 local18 = (Class1_Sub35) Static401.aClass203_47.method4548(); local18 != null; local18 = (Class1_Sub35) Static401.aClass203_47.method4545()) {
			if (Static370.method5159(local18.anInt5839) && (long) arg0 == local18.aLong166) {
				return true;
			}
		}
		return false;
	}
}
