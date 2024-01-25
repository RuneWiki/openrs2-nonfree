import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static264 {

	@OriginalMember(owner = "client!kba", name = "e", descriptor = "I")
	public static int anInt6184;

	@OriginalMember(owner = "client!kba", name = "a", descriptor = "[[I")
	public static final int[][] anIntArrayArray43 = new int[][] { { 0, 2 }, { 0, 2 }, { 0, 0, 2 }, { 2, 0, 0 }, { 0, 2, 0 }, { 0, 0, 2 }, { 0, 5, 1, 4 }, { 0, 4, 4, 4 }, { 4, 4, 4, 0 }, { 6, 6, 6, 2, 2, 2 }, { 2, 2, 2, 6, 6, 6 }, { 0, 11, 6, 6, 6, 4 }, { 0, 2 }, { 0, 4, 4, 4 }, { 0, 4, 4, 4 } };

	@OriginalMember(owner = "client!kba", name = "d", descriptor = "[I")
	public static int[] anIntArray459 = new int[1];

	@OriginalMember(owner = "client!kba", name = "g", descriptor = "Lclient!kfa;")
	public static final Class181 aClass181_68 = new Class181(52, 4);

	@OriginalMember(owner = "client!kba", name = "h", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray37 = new String[] { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };

	@OriginalMember(owner = "client!kba", name = "a", descriptor = "(IFIFZLclient!wba;III[BFFF)V")
	public static void method5272(@OriginalArg(1) float arg0, @OriginalArg(2) int arg1, @OriginalArg(3) float arg2, @OriginalArg(5) Class79 arg3, @OriginalArg(9) byte[] arg4, @OriginalArg(10) float arg5, @OriginalArg(11) float arg6, @OriginalArg(12) float arg7) {
		for (@Pc(3) int local3 = 0; local3 < 16; local3++) {
			Static442.method6765(arg6, arg2, local3, arg1, arg7, arg0, arg4, arg5, arg3);
			arg1 += 16384;
		}
	}

	@OriginalMember(owner = "client!kba", name = "a", descriptor = "(III)Z")
	public static boolean method5273(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if ((arg0 & 0x10000) != 0 | Static181.method1443(arg1, arg0) || Static90.method2002(arg1, arg0)) {
			return true;
		} else {
			return (arg1 & 0x37) == 0 && Static401.method6295(arg1, arg0);
		}
	}
}
