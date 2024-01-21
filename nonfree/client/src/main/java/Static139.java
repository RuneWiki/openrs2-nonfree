import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static139 {

	@OriginalMember(owner = "client!re", name = "H", descriptor = "Lclient!md;")
	public static Class2_Sub1_Sub11 aClass2_Sub1_Sub11_1;

	@OriginalMember(owner = "client!re", name = "gb", descriptor = "Lclient!cd;")
	private static Class10 aClass10_1355 = Static51.method932("Please try using a different world)3");

	@OriginalMember(owner = "client!re", name = "D", descriptor = "Lclient!cd;")
	public static Class10 aClass10_1344 = aClass10_1355;

	@OriginalMember(owner = "client!re", name = "K", descriptor = "Lclient!cd;")
	public static Class10 aClass10_1345 = Static51.method932("sind fehlgeschlagen)3 Bitte warten Sie 5 Minuten)1");

	@OriginalMember(owner = "client!re", name = "O", descriptor = "I")
	public static volatile int anInt3077 = 0;

	@OriginalMember(owner = "client!re", name = "P", descriptor = "Lclient!cd;")
	public static Class10 aClass10_1346 = Static51.method932("runes");

	@OriginalMember(owner = "client!re", name = "Q", descriptor = "Lclient!cd;")
	public static Class10 aClass10_1347 = aClass10_1355;

	@OriginalMember(owner = "client!re", name = "S", descriptor = "Z")
	public static boolean aBoolean137 = false;

	@OriginalMember(owner = "client!re", name = "V", descriptor = "Lclient!cd;")
	public static Class10 aClass10_1348 = aClass10_1355;

	@OriginalMember(owner = "client!re", name = "W", descriptor = "I")
	public static int anInt3081 = 0;

	@OriginalMember(owner = "client!re", name = "db", descriptor = "Lclient!cd;")
	private static Class10 aClass10_1354 = Static51.method932("You are standing in a members)2only area)3");

	@OriginalMember(owner = "client!re", name = "X", descriptor = "Lclient!cd;")
	public static Class10 aClass10_1349 = aClass10_1354;

	@OriginalMember(owner = "client!re", name = "Y", descriptor = "Lclient!cd;")
	public static Class10 aClass10_1350 = aClass10_1355;

	@OriginalMember(owner = "client!re", name = "Z", descriptor = "Lclient!cd;")
	public static Class10 aClass10_1351 = Static51.method932(": ");

	@OriginalMember(owner = "client!re", name = "ab", descriptor = "Lclient!cd;")
	public static Class10 aClass10_1352 = Static51.method932("VOLL");

	@OriginalMember(owner = "client!re", name = "bb", descriptor = "Lclient!cd;")
	public static Class10 aClass10_1353 = aClass10_1355;

	@OriginalMember(owner = "client!re", name = "jb", descriptor = "Lclient!cd;")
	public static Class10 aClass10_1356 = aClass10_1355;

	@OriginalMember(owner = "client!re", name = "b", descriptor = "(BI)V")
	public static void method2196(@OriginalArg(1) int arg0) {
		for (@Pc(16) Class2_Sub8 local16 = (Class2_Sub8) Static180.aClass18_14.method687(); local16 != null; local16 = (Class2_Sub8) Static180.aClass18_14.method682()) {
			if ((local16.aLong139 >> 48 & 0xFFFFL) == (long) arg0) {
				local16.method2705();
			}
		}
	}

	@OriginalMember(owner = "client!re", name = "c", descriptor = "(BI)Z")
	public static boolean method2197(@OriginalArg(1) int arg0) {
		if (arg0 < 0) {
			return false;
		}
		@Pc(19) int local19 = Static93.anIntArray229[arg0];
		if (local19 >= 2000) {
			local19 -= 2000;
		}
		return local19 == 1006;
	}

	@OriginalMember(owner = "client!re", name = "c", descriptor = "(B)V")
	public static void method2199() {
		aClass10_1350 = null;
		aClass10_1356 = null;
		aClass10_1344 = null;
		aClass10_1354 = null;
		aClass10_1347 = null;
		aClass10_1353 = null;
		aClass10_1346 = null;
		aClass2_Sub1_Sub11_1 = null;
		aClass10_1351 = null;
		aClass10_1355 = null;
		aClass10_1345 = null;
		aClass10_1352 = null;
		aClass10_1348 = null;
		aClass10_1349 = null;
	}
}
