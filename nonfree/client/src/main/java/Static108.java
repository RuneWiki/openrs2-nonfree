import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static108 {

	@OriginalMember(owner = "client!md", name = "z", descriptor = "Lclient!nh;")
	public static Class62 aClass62_29;

	@OriginalMember(owner = "client!md", name = "D", descriptor = "I")
	public static int anInt2665;

	@OriginalMember(owner = "client!md", name = "L", descriptor = "Lclient!jd;")
	private static final Class46 aClass46_981 = Static177.method3050("as it was used to break our rules)3");

	@OriginalMember(owner = "client!md", name = "A", descriptor = "Lclient!jd;")
	public static Class46 aClass46_976 = aClass46_981;

	@OriginalMember(owner = "client!md", name = "P", descriptor = "Lclient!jd;")
	private static final Class46 aClass46_982 = Static177.method3050("Please try again)3");

	@OriginalMember(owner = "client!md", name = "C", descriptor = "Lclient!jd;")
	public static Class46 aClass46_977 = aClass46_982;

	@OriginalMember(owner = "client!md", name = "K", descriptor = "Lclient!jd;")
	private static final Class46 aClass46_980 = Static177.method3050("Could not complete login)3");

	@OriginalMember(owner = "client!md", name = "E", descriptor = "Lclient!jd;")
	public static Class46 aClass46_978 = aClass46_980;

	@OriginalMember(owner = "client!md", name = "J", descriptor = "Lclient!jd;")
	public static final Class46 aClass46_979 = Static177.method3050("sl_back");

	@OriginalMember(owner = "client!md", name = "Q", descriptor = "Lclient!jd;")
	public static final Class46 aClass46_983 = Static177.method3050("Schrifts-=tze geladen)3");

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(IIIIIIII)V")
	public static void method2015(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg0 < 1 || arg2 < 1 || arg0 > 102 || arg2 > 102) {
			return;
		}
		if (Static103.aBoolean113 && Static73.anInt1873 != arg5) {
			return;
		}
		@Pc(39) long local39 = 0L;
		if (arg1 == 0) {
			local39 = Static111.method2060(arg5, arg0, arg2);
		}
		if (arg1 == 1) {
			local39 = Static66.method1448(arg5, arg0, arg2);
		}
		if (arg1 == 2) {
			local39 = Static187.method3164(arg5, arg0, arg2);
		}
		if (arg1 == 3) {
			local39 = Static78.method1588(arg5, arg0, arg2);
		}
		if (local39 != 0L) {
			@Pc(91) int local91 = (int) local39 >> 20 & 0x3;
			@Pc(98) int local98 = Integer.MAX_VALUE & (int) (local39 >>> 32);
			@Pc(105) int local105 = (int) local39 >> 14 & 0x1F;
			@Pc(118) Class4_Sub1_Sub19 local118;
			if (arg1 == 0) {
				Static93.method1818(arg5, arg0, arg2);
				local118 = Static113.method2090(local98);
				if (local118.anInt4156 != 0) {
					Static29.aClass58Array1[arg5].method1984(arg2, local118.aBoolean177, arg0, local91, local105);
				}
			}
			if (arg1 == 1) {
				Static72.method1500(arg5, arg0, arg2);
			}
			if (arg1 == 2) {
				Static37.method661(arg5, arg0, arg2);
				local118 = Static113.method2090(local98);
				if (local118.anInt4191 + arg0 > 103 || local118.anInt4191 + arg2 > 103 || local118.anInt4187 + arg0 > 103 || local118.anInt4187 + arg2 > 103) {
					return;
				}
				if (local118.anInt4156 != 0) {
					Static29.aClass58Array1[arg5].method1986(local118.anInt4187, local91, local118.anInt4191, arg2, arg0, local118.aBoolean177);
				}
			}
			if (arg1 == 3) {
				Static122.method2203(arg5, arg0, arg2);
				local118 = Static113.method2090(local98);
				if (local118.anInt4156 == 1) {
					Static29.aClass58Array1[arg5].method1999(arg2, arg0);
				}
			}
		}
		if (arg4 < 0) {
			return;
		}
		@Pc(237) int local237 = arg5;
		if (arg5 < 3 && (Static53.aByteArrayArrayArray2[1][arg0][arg2] & 0x2) == 2) {
			local237 = arg5 + 1;
		}
		Static10.method212(arg0, local237, Static29.aClass58Array1[arg5], arg6, arg2, arg5, arg3, arg4);
		return;
	}
}
