import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static224 {

	@OriginalMember(owner = "client!oc", name = "w", descriptor = "Lclient!ij;")
	public static Class93 aClass93_83;

	@OriginalMember(owner = "client!oc", name = "p", descriptor = "I")
	public static int anInt4432 = -1;

	@OriginalMember(owner = "client!oc", name = "v", descriptor = "I")
	public static int anInt4437 = -1;

	@OriginalMember(owner = "client!oc", name = "x", descriptor = "[[I")
	public static final int[][] anIntArrayArray72 = new int[][] { { 12, 12, 12, 12 }, { 12, 12, 12, 12, 12, 5 }, { 5, 5, 1, 1 }, { 5, 1, 1, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 12, 12, 12, 12, 12, 12 }, { 1, 12, 12, 12, 12, 12 }, { 1, 1, 7, 1 }, { 8, 9, 9, 8, 8, 3, 1, 9 }, { 8, 8, 9, 8, 9, 9 }, { 10, 10, 11, 11, 11, 7, 3, 7 }, { 12, 12, 12, 12 } };

	@OriginalMember(owner = "client!oc", name = "y", descriptor = "Lclient!hc;")
	public static final Class85 aClass85_105 = new Class85(" more options", " weitere Optionen", " autres options", " mais opções");

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(ZI)Z")
	public static boolean method4077(@OriginalArg(1) int arg0) {
		return (arg0 & -arg0) == arg0;
	}

	@OriginalMember(owner = "client!oc", name = "b", descriptor = "(B)V")
	public static void method4078() {
		@Pc(1) Class109 local1 = Static331.aClass109_60;
		synchronized (Static331.aClass109_60) {
			Static331.aClass109_60.method2858();
		}
		local1 = Static128.aClass109_42;
		synchronized (Static128.aClass109_42) {
			Static128.aClass109_42.method2858();
		}
	}

	@OriginalMember(owner = "client!oc", name = "b", descriptor = "(IB)C")
	public static char method4079(@OriginalArg(1) byte arg0) {
		@Pc(7) int local7 = arg0 & 0xFF;
		if (local7 == 0) {
			throw new IllegalArgumentException("Non cp1252 character 0x" + Integer.toString(local7, 16) + " provided");
		}
		if (local7 >= 128 && local7 < 160) {
			@Pc(43) char local43 = Static198.aCharArray2[local7 - 128];
			if (local43 == '\u0000') {
				local43 = '?';
			}
			local7 = local43;
		}
		return (char) local7;
	}
}
