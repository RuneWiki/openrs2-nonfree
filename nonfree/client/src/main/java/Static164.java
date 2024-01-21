import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static164 {

	@OriginalMember(owner = "client!v", name = "D", descriptor = "Lclient!fd;")
	public static Class7_Sub1 aClass7_Sub1_17;

	@OriginalMember(owner = "client!v", name = "E", descriptor = "I")
	public static int anInt3981;

	@OriginalMember(owner = "client!v", name = "s", descriptor = "Lclient!eh;")
	public static Class28 aClass28_1384 = Static170.method3101("lila:");

	@OriginalMember(owner = "client!v", name = "t", descriptor = "Lclient!eh;")
	private static Class28 aClass28_1385 = Static170.method3101(" is already on your friend list)3");

	@OriginalMember(owner = "client!v", name = "u", descriptor = "Lclient!eh;")
	public static Class28 aClass28_1386 = aClass28_1385;

	@OriginalMember(owner = "client!v", name = "w", descriptor = "Lclient!pa;")
	public static Class63 aClass63_29 = new Class63(64);

	@OriginalMember(owner = "client!v", name = "y", descriptor = "[[I")
	public static int[][] anIntArrayArray33 = new int[104][104];

	@OriginalMember(owner = "client!v", name = "G", descriptor = "Lclient!eh;")
	private static Class28 aClass28_1388 = Static170.method3101("Loaded title screen");

	@OriginalMember(owner = "client!v", name = "z", descriptor = "Lclient!eh;")
	public static Class28 aClass28_1387 = aClass28_1388;

	@OriginalMember(owner = "client!v", name = "I", descriptor = "Lclient!eh;")
	public static Class28 aClass28_1389 = Static170.method3101("<img=1>");

	@OriginalMember(owner = "client!v", name = "J", descriptor = "Lclient!eh;")
	private static Class28 aClass28_1390 = Static170.method3101("Welcome to RuneScape");

	@OriginalMember(owner = "client!v", name = "K", descriptor = "Lclient!eh;")
	public static Class28 aClass28_1391 = Static170.method3101("Das ist eine Mitglieder)2Welt(Q");

	@OriginalMember(owner = "client!v", name = "L", descriptor = "Lclient!eh;")
	public static Class28 aClass28_1392 = aClass28_1390;

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(IB)V")
	public static void method3023() {
		Static16.anInt492 = -1;
		Static8.anInt1209 = 1;
		Static2.anInt83 = -1;
		Static75.aClass7_32 = null;
		Static75.aBoolean117 = false;
		anInt3981 = 0;
		Static128.anInt3266 = 2;
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(IIII)V")
	public static void method3024(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) Class3_Sub20 local7 = Static149.aClass3_Sub20ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 != null) {
			Static149.aClass3_Sub20ArrayArrayArray1[arg0][arg1][arg2].anInt3343 = arg3;
		}
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(II)Z")
	public static boolean method3025(@OriginalArg(0) int arg0) {
		return arg0 >= 48 && arg0 <= 57;
	}

	@OriginalMember(owner = "client!v", name = "b", descriptor = "(Z)V")
	public static void method3026() {
		aClass28_1386 = null;
		aClass63_29 = null;
		aClass28_1390 = null;
		aClass28_1388 = null;
		aClass28_1385 = null;
		aClass7_Sub1_17 = null;
		aClass28_1391 = null;
		aClass28_1392 = null;
		aClass28_1387 = null;
		aClass28_1389 = null;
		anIntArrayArray33 = null;
		aClass28_1384 = null;
	}
}
