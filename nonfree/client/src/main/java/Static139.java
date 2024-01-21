import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static139 {

	@OriginalMember(owner = "client!rc", name = "V", descriptor = "Lclient!vd;")
	public static Class83 aClass83_11;

	@OriginalMember(owner = "client!rc", name = "hb", descriptor = "[[I")
	public static int[][] anIntArrayArray22;

	@OriginalMember(owner = "client!rc", name = "lb", descriptor = "[Lclient!db;")
	public static Class3_Sub5[] aClass3_Sub5Array2;

	@OriginalMember(owner = "client!rc", name = "nb", descriptor = "Lclient!aa;")
	public static Class2 aClass2_5;

	@OriginalMember(owner = "client!rc", name = "ab", descriptor = "Lclient!sd;")
	private static Class73 aClass73_1300 = Static122.method531("You can(Wt add yourself to your own ignore list)3");

	@OriginalMember(owner = "client!rc", name = "Y", descriptor = "Lclient!sd;")
	public static Class73 aClass73_1299 = aClass73_1300;

	@OriginalMember(owner = "client!rc", name = "Z", descriptor = "Ljava/util/zip/CRC32;")
	public static CRC32 aCRC32_2 = new CRC32();

	@OriginalMember(owner = "client!rc", name = "fb", descriptor = "Lclient!k;")
	public static Class3_Sub12_Sub1 aClass3_Sub12_Sub1_3 = new Class3_Sub12_Sub1(5000);

	@OriginalMember(owner = "client!rc", name = "ib", descriptor = "Lclient!sd;")
	private static Class73 aClass73_1301 = Static122.method531("Please wait 5 minutes before trying again)3");

	@OriginalMember(owner = "client!rc", name = "jb", descriptor = "[Z")
	public static boolean[] aBooleanArray9 = new boolean[100];

	@OriginalMember(owner = "client!rc", name = "kb", descriptor = "Lclient!sd;")
	public static Class73 aClass73_1302 = Static122.method531("(Z");

	@OriginalMember(owner = "client!rc", name = "mb", descriptor = "Lclient!sd;")
	public static Class73 aClass73_1303 = aClass73_1301;

	@OriginalMember(owner = "client!rc", name = "ob", descriptor = "Lclient!sd;")
	public static Class73 aClass73_1304 = Static122.method531("da dieser Computer gegen unsere ");

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(II)Z")
	public static boolean method1768(@OriginalArg(0) int arg0) {
		if (arg0 < 32) {
			return false;
		} else if (arg0 == 127) {
			return false;
		} else {
			return arg0 < 129 || arg0 > 159;
		}
	}

	@OriginalMember(owner = "client!rc", name = "f", descriptor = "(I)V")
	public static void method1769() {
		aClass73_1303 = null;
		aClass3_Sub5Array2 = null;
		aClass73_1304 = null;
		aClass73_1301 = null;
		aClass83_11 = null;
		aBooleanArray9 = null;
		aClass73_1300 = null;
		aClass2_5 = null;
		anIntArrayArray22 = null;
		aClass73_1302 = null;
		aClass73_1299 = null;
		aClass3_Sub12_Sub1_3 = null;
		aCRC32_2 = null;
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(IIII)I")
	public static int method1770(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		return arg0 * arg1 + arg2 * (4096 - arg0) >> 12;
	}
}
