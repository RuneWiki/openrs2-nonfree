import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static319 {

	@OriginalMember(owner = "client!uj", name = "h", descriptor = "Lclient!dp;")
	public static Class53 aClass53_145;

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "I")
	public static volatile int anInt5900 = 0;

	@OriginalMember(owner = "client!uj", name = "b", descriptor = "J")
	public static long aLong198 = 0L;

	@OriginalMember(owner = "client!uj", name = "c", descriptor = "I")
	public static int anInt5901 = 0;

	@OriginalMember(owner = "client!uj", name = "d", descriptor = "[Lclient!kf;")
	public static final Class6_Sub2_Sub9[] aClass6_Sub2_Sub9Array8 = new Class6_Sub2_Sub9[14];

	@OriginalMember(owner = "client!uj", name = "e", descriptor = "[I")
	public static final int[] anIntArray668 = new int[13];

	@OriginalMember(owner = "client!uj", name = "f", descriptor = "Lclient!fg;")
	public static final Class70 aClass70_101 = new Class70(32);

	@OriginalMember(owner = "client!uj", name = "g", descriptor = "I")
	public static int anInt5902 = 0;

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(IC)Z")
	public static boolean method5325(@OriginalArg(1) char arg0) {
		if (arg0 >= ' ' && arg0 <= '~') {
			return true;
		} else if (arg0 >= ' ' && arg0 <= 'ÿ') {
			return true;
		} else {
			return arg0 == '€' || arg0 == 'Œ' || arg0 == '—' || arg0 == 'œ' || arg0 == 'Ÿ';
		}
	}

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(BI)I")
	public static int method5326(@OriginalArg(1) int arg0) {
		return arg0 & 0x3FF;
	}
}
