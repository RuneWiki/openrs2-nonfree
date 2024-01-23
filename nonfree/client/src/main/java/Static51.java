import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static51 {

	@OriginalMember(owner = "client!dj", name = "m", descriptor = "[[I")
	public static int[][] anIntArrayArray15;

	@OriginalMember(owner = "client!dj", name = "j", descriptor = "Ljava/lang/String;")
	public static String aString29 = "Examine";

	@OriginalMember(owner = "client!dj", name = "l", descriptor = "J")
	public static volatile long aLong37 = 0L;

	@OriginalMember(owner = "client!dj", name = "q", descriptor = "Lclient!an;")
	public static Class10 aClass10_9 = new Class10();

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(IILclient!lc;I)[Lclient!hi;")
	public static Class59[] method852(@OriginalArg(0) int arg0, @OriginalArg(2) Class98 arg1) {
		return Static292.method4344(arg0, 0, arg1) ? Static249.method3771() : null;
	}

	@OriginalMember(owner = "client!dj", name = "b", descriptor = "(BI)I")
	public static int method853(@OriginalArg(1) int arg0) {
		@Pc(14) int local14 = (arg0 * arg0 >> 12) * arg0 >> 12;
		@Pc(24) int local24 = arg0 * 6 - 61440;
		@Pc(32) int local32 = (local24 * arg0 >> 12) + 40960;
		return local32 * local14 >> 12;
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(B)V")
	public static void method854() {
		aString29 = null;
		aClass10_9 = null;
		anIntArrayArray15 = null;
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(II)Lclient!wn;")
	public static Class4_Sub2_Sub22 method855(@OriginalArg(1) int arg0) {
		@Pc(12) Class4_Sub2_Sub22 local12 = (Class4_Sub2_Sub22) Static194.aClass69_7.method1930((long) arg0);
		if (local12 != null) {
			return local12;
		}
		@Pc(27) byte[] local27 = Static26.aClass98_14.method2396(arg0, 11);
		local12 = new Class4_Sub2_Sub22();
		if (local27 != null) {
			local12.method4401(new Class4_Sub17(local27));
		}
		Static194.aClass69_7.method1933((long) arg0, local12);
		return local12;
	}
}
