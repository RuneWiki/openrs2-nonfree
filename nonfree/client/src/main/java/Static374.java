import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static374 {

	@OriginalMember(owner = "client!o", name = "e", descriptor = "Lclient!ri;")
	public static Class284 aClass284_111;

	@OriginalMember(owner = "client!o", name = "g", descriptor = "Lclient!ri;")
	public static Class284 aClass284_112;

	@OriginalMember(owner = "client!o", name = "i", descriptor = "J")
	public static long aLong178;

	@OriginalMember(owner = "client!o", name = "d", descriptor = "[Lclient!qg;")
	public static final Class270[] aClass270Array2 = new Class270[14];

	@OriginalMember(owner = "client!o", name = "h", descriptor = "[I")
	public static final int[] anIntArray363 = new int[500];

	@OriginalMember(owner = "client!o", name = "k", descriptor = "I")
	public static int anInt6505 = 0;

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(BI)I")
	public static int method5249(@OriginalArg(1) int arg0) {
		return arg0 & 0x3FF;
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(ZI)Z")
	public static boolean method5250(@OriginalArg(1) int arg0) {
		return arg0 >= 4 && arg0 <= 8;
	}
}
