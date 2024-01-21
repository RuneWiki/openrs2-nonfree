import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static49 {

	@OriginalMember(owner = "client!kd", name = "C", descriptor = "[J")
	public static long[] aLongArray4 = new long[32];

	@OriginalMember(owner = "client!kd", name = "F", descriptor = "Lclient!rc;")
	private static Class55 aClass55_596 = Static34.method846("Accept trade");

	@OriginalMember(owner = "client!kd", name = "D", descriptor = "Lclient!rc;")
	public static Class55 aClass55_595 = aClass55_596;

	@OriginalMember(owner = "client!kd", name = "E", descriptor = "I")
	public static int anInt1569 = -1;

	@OriginalMember(owner = "client!kd", name = "H", descriptor = "Lclient!rc;")
	private static Class55 aClass55_597 = Static34.method846("Add ignore");

	@OriginalMember(owner = "client!kd", name = "I", descriptor = "Lclient!rc;")
	public static Class55 aClass55_598 = aClass55_597;

	@OriginalMember(owner = "client!kd", name = "L", descriptor = "Lclient!rc;")
	private static Class55 aClass55_599 = Static34.method846("Hide");

	@OriginalMember(owner = "client!kd", name = "M", descriptor = "J")
	public static volatile long aLong58 = 0L;

	@OriginalMember(owner = "client!kd", name = "N", descriptor = "Lclient!rc;")
	public static Class55 aClass55_600 = Static34.method846("Bitte benutzen Sie eine andere Welt)3");

	@OriginalMember(owner = "client!kd", name = "O", descriptor = "Lclient!rc;")
	public static Class55 aClass55_601 = Static34.method846(" hat sich ausgeloggt)3");

	@OriginalMember(owner = "client!kd", name = "P", descriptor = "Lclient!rc;")
	public static Class55 aClass55_602 = aClass55_599;

	@OriginalMember(owner = "client!kd", name = "Q", descriptor = "I")
	public static int anInt1572 = 0;

	@OriginalMember(owner = "client!kd", name = "R", descriptor = "Lclient!rc;")
	public static Class55 aClass55_603 = Static34.method846("W-=hlen Sie eine Option");

	@OriginalMember(owner = "client!kd", name = "S", descriptor = "I")
	public static int anInt1573 = 0;

	@OriginalMember(owner = "client!kd", name = "c", descriptor = "(I)V")
	public static void method1083() {
		aClass55_598 = null;
		aClass55_599 = null;
		aClass55_596 = null;
		aClass55_602 = null;
		aLongArray4 = null;
		aClass55_603 = null;
		Class6_Sub8.anIntArray155 = null;
		aClass55_601 = null;
		aClass55_595 = null;
		aClass55_600 = null;
		aClass55_597 = null;
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(IBLclient!ua;III)V")
	public static void method1084(@OriginalArg(0) int arg0, @OriginalArg(2) Class6_Sub2_Sub15 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(15) Class6_Sub9 local15 = new Class6_Sub9();
		local15.anInt1925 = arg1.anInt2998 * 128;
		@Pc(24) int local24 = arg1.anInt2981;
		local15.anIntArray185 = arg1.anIntArray285;
		local15.anInt1915 = arg1.anInt2988;
		local15.anInt1919 = arg4;
		local15.anInt1906 = arg1.anInt2983;
		local15.anInt1918 = arg1.anInt3005;
		local15.anInt1920 = arg0 * 128;
		@Pc(51) int local51 = arg1.anInt2984;
		if (arg2 == 1 || arg2 == 3) {
			local51 = arg1.anInt2981;
			local24 = arg1.anInt2984;
		}
		local15.anInt1909 = arg3 * 128;
		local15.anInt1923 = (local24 + arg3) * 128;
		local15.anInt1917 = (local51 + arg0) * 128;
		if (arg1.anIntArray278 != null) {
			local15.aClass6_Sub2_Sub15_1 = arg1;
			local15.method1335();
		}
		Static89.aClass3_5.method23(local15);
		if (local15.anIntArray185 != null) {
			local15.anInt1908 = (int) ((double) (local15.anInt1915 - local15.anInt1918) * Math.random()) + local15.anInt1918;
		}
	}
}
