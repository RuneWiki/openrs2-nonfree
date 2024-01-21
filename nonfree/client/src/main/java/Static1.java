import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static1 {

	@OriginalMember(owner = "client!a", name = "c", descriptor = "Lclient!ja;")
	public static Class33 aClass33_1;

	@OriginalMember(owner = "client!a", name = "r", descriptor = "I")
	public static int anInt6;

	@OriginalMember(owner = "client!a", name = "a", descriptor = "Lclient!mc;")
	public static Class42 aClass42_1 = Static23.method501("Unerwartete Antwort vom Anmelde)2Server");

	@OriginalMember(owner = "client!a", name = "b", descriptor = "I")
	public static int anInt1 = 0;

	@OriginalMember(owner = "client!a", name = "k", descriptor = "Lclient!mc;")
	private static Class42 aClass42_8 = Static23.method501("Please wait 1 minute and try again)3");

	@OriginalMember(owner = "client!a", name = "d", descriptor = "Lclient!mc;")
	public static Class42 aClass42_2 = aClass42_8;

	@OriginalMember(owner = "client!a", name = "e", descriptor = "Lclient!mc;")
	private static Class42 aClass42_3 = Static23.method501("Enter name of friend to delete from list");

	@OriginalMember(owner = "client!a", name = "f", descriptor = "Lclient!mc;")
	public static Class42 aClass42_4 = Static23.method501("Bitte versuchen Sie)1");

	@OriginalMember(owner = "client!a", name = "h", descriptor = "Lclient!mc;")
	public static Class42 aClass42_5 = aClass42_8;

	@OriginalMember(owner = "client!a", name = "i", descriptor = "Lclient!mc;")
	private static Class42 aClass42_6 = Static23.method501("Off");

	@OriginalMember(owner = "client!a", name = "j", descriptor = "Lclient!mc;")
	private static Class42 aClass42_7 = Static23.method501("and choose the (Wcreate account(W");

	@OriginalMember(owner = "client!a", name = "m", descriptor = "Lclient!mc;")
	public static Class42 aClass42_9 = aClass42_8;

	@OriginalMember(owner = "client!a", name = "v", descriptor = "Lclient!mc;")
	private static Class42 aClass42_13 = Static23.method501("Remove");

	@OriginalMember(owner = "client!a", name = "o", descriptor = "Lclient!mc;")
	public static Class42 aClass42_10 = aClass42_13;

	@OriginalMember(owner = "client!a", name = "q", descriptor = "Lclient!mc;")
	public static Class42 aClass42_11 = aClass42_7;

	@OriginalMember(owner = "client!a", name = "t", descriptor = "Lclient!mc;")
	public static Class42 aClass42_12 = aClass42_6;

	@OriginalMember(owner = "client!a", name = "w", descriptor = "Lclient!mc;")
	public static Class42 aClass42_14 = aClass42_3;

	@OriginalMember(owner = "client!a", name = "x", descriptor = "Lclient!mc;")
	public static Class42 aClass42_15 = Static23.method501("Fehler beim Laden Ihres Charakter)2Profils");

	@OriginalMember(owner = "client!a", name = "A", descriptor = "Z")
	public static boolean aBoolean1 = false;

	@OriginalMember(owner = "client!a", name = "B", descriptor = "[I")
	public static int[] anIntArray1 = new int[500];

	@OriginalMember(owner = "client!a", name = "C", descriptor = "Lclient!mc;")
	public static Class42 aClass42_16 = Static23.method501("Empf-=nger:");

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(ZBI[B)V")
	public static void method1(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) {
		if (Static30.aClass14_1 == null) {
			return;
		}
		if (Static74.anInt1895 >= 0) {
			Static30.aClass14_1.method1426();
			Static24.anInt718 = 0;
			Static74.anInt1895 = -1;
			Static45.aByteArray25 = null;
			Static61.anInt1457 = 20;
		}
		if (arg2 == null) {
			return;
		}
		if (Static61.anInt1457 > 0) {
			Static30.aClass14_1.method1425(arg1);
			Static61.anInt1457 = 0;
		}
		Static74.anInt1895 = arg1;
		Static30.aClass14_1.method1421(arg2, arg1, arg0);
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(I)V")
	public static void method2() {
		aClass42_9 = null;
		aClass42_5 = null;
		aClass42_2 = null;
		aClass42_4 = null;
		aClass42_1 = null;
		aClass42_15 = null;
		aClass42_3 = null;
		aClass42_13 = null;
		aClass42_14 = null;
		anIntArray1 = null;
		aClass42_10 = null;
		aClass42_11 = null;
		aClass42_16 = null;
		aClass42_8 = null;
		aClass42_7 = null;
		aClass33_1 = null;
		aClass42_12 = null;
		aClass42_6 = null;
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(IIII)V")
	public static void method3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (arg0 < 128 || arg1 < 128 || arg0 > 13056 || arg1 > 13056) {
			Static84.anInt2238 = -1;
			Static46.anInt1209 = -1;
			return;
		}
		@Pc(33) int local33 = Static104.method1821(arg1, Static82.anInt2165, arg0) - arg2;
		@Pc(37) int local37 = Static76.anIntArray301[Static92.anInt2431];
		@Pc(41) int local41 = Static76.anIntArray306[Static30.anInt830];
		@Pc(45) int local45 = Static76.anIntArray301[Static30.anInt830];
		@Pc(49) int local49 = local33 - Static8.anInt243;
		@Pc(53) int local53 = arg1 - Static37.anInt917;
		@Pc(57) int local57 = arg0 - Static68.anInt1671;
		@Pc(66) int local66 = Static76.anIntArray306[Static92.anInt2431];
		@Pc(76) int local76 = local37 * local53 + local57 * local66 >> 16;
		@Pc(86) int local86 = local66 * local53 - local57 * local37 >> 16;
		@Pc(88) int local88 = local76;
		@Pc(99) int local99 = local49 * local41 - local86 * local45 >> 16;
		@Pc(109) int local109 = local41 * local86 + local49 * local45 >> 16;
		if (local109 >= 50) {
			Static46.anInt1209 = (local88 << 9) / local109 + 256;
			Static84.anInt2238 = (local99 << 9) / local109 + 167;
		} else {
			Static84.anInt2238 = -1;
			Static46.anInt1209 = -1;
		}
	}

	@OriginalMember(owner = "client!a", name = "b", descriptor = "(I)V")
	public static void method4() {
		for (@Pc(15) int local15 = -1; local15 < Static27.anInt770; local15++) {
			@Pc(24) int local24;
			if (local15 == -1) {
				local24 = 2047;
			} else {
				local24 = Static68.anIntArray240[local15];
			}
			@Pc(32) Class1_Sub1_Sub8_Sub1_Sub2 local32 = Static33.aClass1_Sub1_Sub8_Sub1_Sub2Array1[local24];
			if (local32 != null) {
				Static10.method251(1, local32);
			}
		}
	}
}
