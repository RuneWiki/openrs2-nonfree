import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static35 {

	@OriginalMember(owner = "client!e", name = "Q", descriptor = "I")
	public static int anInt990;

	@OriginalMember(owner = "client!e", name = "M", descriptor = "Lclient!kb;")
	public static Class46 aClass46_272 = Static65.method1172(":");

	@OriginalMember(owner = "client!e", name = "N", descriptor = "I")
	public static int anInt987 = 0;

	@OriginalMember(owner = "client!e", name = "R", descriptor = "Lclient!kb;")
	public static Class46 aClass46_273 = Static65.method1172("Ihre Freunde)2Liste ist voll(Q Mitglieder k-Onnen 200 Freunde hinzuf-Ugen)1 freie Spieler nur 100)3");

	@OriginalMember(owner = "client!e", name = "T", descriptor = "[[I")
	public static int[][] anIntArrayArray2 = new int[][] { { 1, 1 }, { -1, 1 }, { 1, -1 }, { -1, -1 } };

	@OriginalMember(owner = "client!e", name = "U", descriptor = "Lclient!kb;")
	public static Class46 aClass46_274 = Static65.method1172(":duelstake:");

	@OriginalMember(owner = "client!e", name = "X", descriptor = "Lclient!kb;")
	private static Class46 aClass46_275 = Static65.method1172(" from your ignore list first)3");

	@OriginalMember(owner = "client!e", name = "Z", descriptor = "Lclient!kb;")
	public static Class46 aClass46_276 = aClass46_275;

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(IJ)V")
	public static void method626(@OriginalArg(1) long arg0) {
		if (arg0 != 0L) {
			Static133.aClass3_Sub4_Sub1_3.method233(86);
			Static133.aClass3_Sub4_Sub1_3.method201(arg0);
		}
	}

	@OriginalMember(owner = "client!e", name = "b", descriptor = "(IJ)V")
	public static void method627(@OriginalArg(1) long arg0) {
		if (arg0 <= 0L) {
			return;
		}
		if (arg0 % 10L == 0L) {
			Static55.method1032(arg0 - 1L);
			Static55.method1032(1L);
		} else {
			Static55.method1032(arg0);
		}
	}

	@OriginalMember(owner = "client!e", name = "b", descriptor = "(II)Lclient!dg;")
	public static Class3_Sub2_Sub2 method628(@OriginalArg(1) int arg0) {
		@Pc(17) Class3_Sub2_Sub2 local17 = (Class3_Sub2_Sub2) Static89.aClass57_17.method1719((long) arg0);
		if (local17 != null) {
			return local17;
		}
		@Pc(27) byte[] local27 = Static58.aClass44_10.method1624(12, arg0);
		local17 = new Class3_Sub2_Sub2();
		if (local27 != null) {
			local17.method599(new Class3_Sub4(local27));
		}
		local17.method597();
		Static89.aClass57_17.method1717(local17, (long) arg0);
		return local17;
	}

	@OriginalMember(owner = "client!e", name = "c", descriptor = "(Z)V")
	public static void method629() {
		aClass46_274 = null;
		aClass46_275 = null;
		aClass46_273 = null;
		aClass46_272 = null;
		aClass46_276 = null;
		anIntArrayArray2 = null;
	}
}
