import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static165 {

	@OriginalMember(owner = "client!re", name = "O", descriptor = "I")
	public static int anInt3383;

	@OriginalMember(owner = "client!re", name = "P", descriptor = "I")
	public static int anInt3384;

	@OriginalMember(owner = "client!re", name = "N", descriptor = "I")
	public static int anInt3382 = 0;

	@OriginalMember(owner = "client!re", name = "Q", descriptor = "Lclient!qe;")
	public static final Class83 aClass83_978 = Static181.method2795("Bitte entfernen Sie ");

	@OriginalMember(owner = "client!re", name = "Z", descriptor = "Lclient!qe;")
	private static final Class83 aClass83_981 = Static181.method2795("Cancel");

	@OriginalMember(owner = "client!re", name = "S", descriptor = "Lclient!qe;")
	public static Class83 aClass83_979 = aClass83_981;

	@OriginalMember(owner = "client!re", name = "Y", descriptor = "Lclient!qe;")
	private static final Class83 aClass83_980 = Static181.method2795("No reply from loginserver)3");

	@OriginalMember(owner = "client!re", name = "ab", descriptor = "Lclient!qe;")
	public static Class83 aClass83_982 = aClass83_980;

	@OriginalMember(owner = "client!re", name = "bb", descriptor = "Lclient!qe;")
	public static final Class83 aClass83_983 = Static181.method2795("RuneScape wurde aktualisiert(Q");

	@OriginalMember(owner = "client!re", name = "eb", descriptor = "[J")
	public static final long[] aLongArray6 = new long[32];

	@OriginalMember(owner = "client!re", name = "gb", descriptor = "Z")
	public static boolean aBoolean158 = false;

	@OriginalMember(owner = "client!re", name = "c", descriptor = "(III)Z")
	public static boolean method2550(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 == 11) {
			arg0 = 10;
		}
		@Pc(17) Class2_Sub2_Sub20 local17 = Static99.method1689(arg1);
		if (arg0 >= 5 && arg0 <= 8) {
			arg0 = 4;
		}
		return local17.method2048(arg0);
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(IBLclient!qe;Lclient!qe;)V")
	public static void method2554(@OriginalArg(0) int arg0, @OriginalArg(2) Class83 arg1, @OriginalArg(3) Class83 arg2) {
		Static51.method1183(arg1, arg0, null, arg2, -1);
	}
}
