import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static135 {

	@OriginalMember(owner = "client!ni", name = "e", descriptor = "Lclient!pb;")
	public static Class71 aClass71_27;

	@OriginalMember(owner = "client!ni", name = "f", descriptor = "Lclient!hh;")
	public static Class42 aClass42_3;

	@OriginalMember(owner = "client!ni", name = "q", descriptor = "[Lclient!vi;")
	public static Class2_Sub1_Sub2[] aClass2_Sub1_Sub2Array8;

	@OriginalMember(owner = "client!ni", name = "p", descriptor = "Lclient!mb;")
	private static final Class62 aClass62_1016 = Static151.method2243("wishes to trade with you)3");

	@OriginalMember(owner = "client!ni", name = "c", descriptor = "Lclient!mb;")
	public static Class62 aClass62_1012 = aClass62_1016;

	@OriginalMember(owner = "client!ni", name = "h", descriptor = "Lclient!mb;")
	public static final Class62 aClass62_1013 = Static151.method2243("rot:");

	@OriginalMember(owner = "client!ni", name = "k", descriptor = "Lclient!mb;")
	private static final Class62 aClass62_1014 = Static151.method2243("Your profile will be transferred in:");

	@OriginalMember(owner = "client!ni", name = "l", descriptor = "[I")
	public static final int[] anIntArray255 = new int[] { 2, 2, 4, 0, 1, 8, 0 };

	@OriginalMember(owner = "client!ni", name = "o", descriptor = "Lclient!mb;")
	public static Class62 aClass62_1015 = aClass62_1014;

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(BI)Z")
	public static boolean method2041(@OriginalArg(1) int arg0) {
		return arg0 == (-arg0 & arg0);
	}

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(IIIZI)V")
	public static void method2042(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(10) int local10 = 0; local10 < Static29.anInt713; local10++) {
			if (Static181.anIntArray332[local10] + Static11.anIntArray26[local10] > arg2 && arg3 + arg2 > Static181.anIntArray332[local10] && Static209.anIntArray391[local10] + Static115.anIntArray237[local10] > arg1 && arg0 + arg1 > Static209.anIntArray391[local10]) {
				Static176.aBooleanArray19[local10] = true;
			}
		}
	}
}
