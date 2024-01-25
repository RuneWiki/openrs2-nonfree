import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static294 {

	@OriginalMember(owner = "client!iv", name = "K", descriptor = "Lclient!lba;")
	public static Class107 aClass107_2;

	@OriginalMember(owner = "client!iv", name = "N", descriptor = "Lclient!su;")
	public static Class349 aClass349_3;

	@OriginalMember(owner = "client!iv", name = "O", descriptor = "I")
	public static int anInt4507 = 0;

	@OriginalMember(owner = "client!iv", name = "G", descriptor = "Lclient!gs;")
	public static final Class144 aClass144_45 = new Class144(46, -1);

	@OriginalMember(owner = "client!iv", name = "F", descriptor = "[[I")
	public static final int[][] anIntArrayArray19 = new int[][] { { 12, 12, 12, 12 }, { 12, 12, 12, 12, 12, 5 }, { 5, 5, 1, 1 }, { 5, 1, 1, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 12, 12, 12, 12, 12, 12 }, { 1, 12, 12, 12, 12, 12 }, { 1, 1, 7, 1 }, { 8, 9, 9, 8, 8, 3, 1, 9 }, { 8, 8, 9, 8, 9, 9 }, { 10, 10, 11, 11, 11, 7, 3, 7 }, { 12, 12, 12, 12 } };

	@OriginalMember(owner = "client!iv", name = "a", descriptor = "(Lclient!et;B)Z")
	public static boolean method4088(@OriginalArg(0) Interface9 arg0) {
		@Pc(21) Class247 local21 = Static216.aClass53_3.method1523(arg0.method9107());
		if (local21.anInt6266 == -1) {
			return true;
		} else {
			@Pc(34) Class298 local34 = Static139.aClass68_3.method1961(local21.anInt6266);
			return local34.anInt8123 == -1 ? true : local34.method6955();
		}
	}
}
