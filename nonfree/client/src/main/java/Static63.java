import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static63 {

	@OriginalMember(owner = "client!cv", name = "q", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray39;

	@OriginalMember(owner = "client!cv", name = "v", descriptor = "Lclient!qn;")
	public static Class211 aClass211_79;

	@OriginalMember(owner = "client!cv", name = "A", descriptor = "I")
	public static int anInt5744;

	@OriginalMember(owner = "client!cv", name = "r", descriptor = "[I")
	public static final int[] anIntArray454 = new int[200];

	@OriginalMember(owner = "client!cv", name = "u", descriptor = "J")
	public static long aLong175 = 0L;

	@OriginalMember(owner = "client!cv", name = "w", descriptor = "[I")
	public static final int[] anIntArray455 = new int[5];

	@OriginalMember(owner = "client!cv", name = "x", descriptor = "Lclient!cq;")
	public static final Class43 aClass43_16 = new Class43("", 14);

	@OriginalMember(owner = "client!cv", name = "y", descriptor = "I")
	public static int anInt5743 = 13156520;

	@OriginalMember(owner = "client!cv", name = "z", descriptor = "Lclient!hd;")
	public static Class110 aClass110_16 = null;

	@OriginalMember(owner = "client!cv", name = "a", descriptor = "(BII)Z")
	public static boolean method4598(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x60000) != 0 | Static272.method3621(arg1, arg0) || Static107.method1597(arg0, arg1) || Static447.method5933(arg0, arg1);
	}
}
