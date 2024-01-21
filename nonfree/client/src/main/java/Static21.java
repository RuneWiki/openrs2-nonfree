import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static21 {

	@OriginalMember(owner = "client!de", name = "g", descriptor = "[I")
	public static int[] anIntArray74;

	@OriginalMember(owner = "client!de", name = "k", descriptor = "Ljava/awt/Frame;")
	public static Frame aFrame1;

	@OriginalMember(owner = "client!de", name = "m", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray5;

	@OriginalMember(owner = "client!de", name = "v", descriptor = "I")
	public static int anInt647;

	@OriginalMember(owner = "client!de", name = "c", descriptor = "Lclient!je;")
	private static Class40 aClass40_355 = Static69.method1231("Unable to connect)3");

	@OriginalMember(owner = "client!de", name = "d", descriptor = "Lclient!je;")
	public static Class40 aClass40_356 = Static69.method1231("Diese Betatest)2Welt ist nur f-Ur eingeladene");

	@OriginalMember(owner = "client!de", name = "e", descriptor = "Lclient!je;")
	public static Class40 aClass40_357 = aClass40_355;

	@OriginalMember(owner = "client!de", name = "f", descriptor = "[[S")
	public static short[][] aShortArrayArray6 = new short[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, -31839, 22433, 2983, -11343 }, { 8741, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 25239 }, { 25238, 8742, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

	@OriginalMember(owner = "client!de", name = "h", descriptor = "I")
	public static int anInt643 = 0;

	@OriginalMember(owner = "client!de", name = "i", descriptor = "I")
	public static int anInt644 = 0;

	@OriginalMember(owner = "client!de", name = "l", descriptor = "Lclient!je;")
	public static Class40 aClass40_358 = aClass40_355;

	@OriginalMember(owner = "client!de", name = "n", descriptor = "Lclient!je;")
	public static Class40 aClass40_359 = Static69.method1231("RuneScape wird geladen )2 bitte warten)3)3)3");

	@OriginalMember(owner = "client!de", name = "o", descriptor = "Lclient!je;")
	public static Class40 aClass40_360 = Static69.method1231(":assist:");

	@OriginalMember(owner = "client!de", name = "p", descriptor = "Lclient!je;")
	public static Class40 aClass40_361 = Static69.method1231("scape main");

	@OriginalMember(owner = "client!de", name = "q", descriptor = "Lclient!je;")
	public static Class40 aClass40_362 = Static69.method1231("");

	@OriginalMember(owner = "client!de", name = "r", descriptor = "Lclient!je;")
	private static Class40 aClass40_363 = Static69.method1231("Loading textures )2 ");

	@OriginalMember(owner = "client!de", name = "t", descriptor = "Lclient!je;")
	public static Class40 aClass40_364 = Static69.method1231("Sie haben gerade eine andere Welt verlassen)3");

	@OriginalMember(owner = "client!de", name = "u", descriptor = "Lclient!je;")
	public static Class40 aClass40_365 = aClass40_363;

	@OriginalMember(owner = "client!de", name = "w", descriptor = "Lclient!je;")
	public static Class40 aClass40_366 = Static69.method1231("(U0a )2 in: ");

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(I)V")
	public static void method399() {
		aClass40_358 = null;
		aClass40_356 = null;
		aClass40_360 = null;
		aByteArrayArrayArray5 = null;
		aClass40_364 = null;
		aFrame1 = null;
		aClass40_365 = null;
		aClass40_366 = null;
		aClass40_361 = null;
		aShortArrayArray6 = null;
		anIntArray74 = null;
		aClass40_362 = null;
		aClass40_363 = null;
		aClass40_359 = null;
		aClass40_357 = null;
		aClass40_355 = null;
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(IIIII)V")
	public static void method400(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(7) int local7 = 0; local7 < Static70.anInt1897; local7++) {
			if (Static46.anIntArray131[local7] + Static60.anIntArray168[local7] > arg2 && arg3 + arg2 > Static60.anIntArray168[local7] && arg1 < Static24.anIntArray376[local7] + Static117.anIntArray323[local7] && arg1 + arg0 > Static24.anIntArray376[local7]) {
				Static84.aBooleanArray21[local7] = true;
			}
		}
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(Lclient!ha;IBLclient!ua;)V")
	public static void method401(@OriginalArg(0) Class29 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class24_Sub1 arg2) {
		@Pc(16) Class2_Sub17 local16 = new Class2_Sub17();
		local16.aClass29_4 = arg0;
		local16.aLong100 = arg1;
		local16.aClass24_Sub1_14 = arg2;
		local16.anInt2084 = 1;
		@Pc(31) Class3 local31 = Static5.aClass3_1;
		synchronized (Static5.aClass3_1) {
			Static5.aClass3_1.method75(local16);
		}
		Static81.method1412();
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(II)V")
	public static void method402(@OriginalArg(0) int arg0) {
		if (Static105.anInt2533 == arg0) {
			return;
		}
		if (Static105.anInt2533 == 0) {
			Static112.method1872();
		}
		if (arg0 == 20 || arg0 == 40) {
			Static41.anInt1092 = 0;
			Static26.anInt672 = 0;
			Static37.anInt1001 = 0;
		}
		if (arg0 != 20 && arg0 != 40 && Static129.aClass57_4 != null) {
			Static129.aClass57_4.method1596();
			Static129.aClass57_4 = null;
		}
		if (Static105.anInt2533 == 25) {
			Static95.anInt2421 = 0;
			Static105.anInt2523 = 1;
			anInt644 = 0;
			Static83.anInt2152 = 0;
			Static103.anInt2512 = 1;
		}
		if (arg0 == 5 || arg0 == 10 || arg0 == 20) {
			Static40.method723(Static10.aClass24_Sub1_20, Static92.aClass24_Sub1_15, Static80.aCanvas1);
		} else {
			Static52.method935();
		}
		Static105.anInt2533 = arg0;
	}

	@OriginalMember(owner = "client!de", name = "b", descriptor = "(IIIII)V")
	public static void method403(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(17) Class2_Sub20 local17 = (Class2_Sub20) Static63.aClass77_5.method2034((long) arg0);
		if (local17 == null) {
			local17 = new Class2_Sub20();
			Static63.aClass77_5.method2030((long) arg0, local17);
		}
		if (local17.anIntArray266.length <= arg3) {
			@Pc(43) int[] local43 = new int[arg3 + 1];
			@Pc(48) int[] local48 = new int[arg3 + 1];
			for (@Pc(50) int local50 = 0; local50 < local17.anIntArray266.length; local50++) {
				local43[local50] = local17.anIntArray266[local50];
				local48[local50] = local17.anIntArray265[local50];
			}
			for (@Pc(76) int local76 = local17.anIntArray266.length; local76 < arg3; local76++) {
				local43[local76] = -1;
				local48[local76] = 0;
			}
			local17.anIntArray266 = local43;
			local17.anIntArray265 = local48;
		}
		local17.anIntArray266[arg3] = arg2;
		local17.anIntArray265[arg3] = arg1;
	}
}
