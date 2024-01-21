import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static123 {

	@OriginalMember(owner = "client!vb", name = "j", descriptor = "J")
	public static long aLong87;

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray7 = new int[4][13][13];

	@OriginalMember(owner = "client!vb", name = "b", descriptor = "Lclient!je;")
	private static Class40 aClass40_1547 = Static69.method1231("Connecting to server)3)3)3");

	@OriginalMember(owner = "client!vb", name = "c", descriptor = "Lclient!je;")
	private static Class40 aClass40_1548 = Static69.method1231("Your friend list is full)3 Max of 100 for free users)1 and 200 for members");

	@OriginalMember(owner = "client!vb", name = "k", descriptor = "Lclient!je;")
	private static Class40 aClass40_1552 = Static69.method1231("To play on this world move to a free area first");

	@OriginalMember(owner = "client!vb", name = "d", descriptor = "Lclient!je;")
	public static Class40 aClass40_1549 = aClass40_1552;

	@OriginalMember(owner = "client!vb", name = "e", descriptor = "I")
	public static int anInt2870 = 0;

	@OriginalMember(owner = "client!vb", name = "f", descriptor = "Lclient!je;")
	public static Class40 aClass40_1550 = Static69.method1231("Die Verbindung konnte");

	@OriginalMember(owner = "client!vb", name = "i", descriptor = "Lclient!je;")
	public static Class40 aClass40_1551 = Static69.method1231("Hidden)2");

	@OriginalMember(owner = "client!vb", name = "l", descriptor = "Lclient!je;")
	public static Class40 aClass40_1553 = Static69.method1231("titlebox");

	@OriginalMember(owner = "client!vb", name = "n", descriptor = "I")
	public static int anInt2874 = (int) (Math.random() * 17.0D) - 8;

	@OriginalMember(owner = "client!vb", name = "o", descriptor = "[I")
	public static int[] anIntArray335 = new int[] { 57, 20, 35, 31, 19, 42, 50, 17 };

	@OriginalMember(owner = "client!vb", name = "p", descriptor = "Lclient!je;")
	public static Class40 aClass40_1554 = aClass40_1548;

	@OriginalMember(owner = "client!vb", name = "q", descriptor = "Lclient!je;")
	public static Class40 aClass40_1555 = Static69.method1231("sind fehlgeschlagen)3 Bitte warten Sie 5 Minuten)1");

	@OriginalMember(owner = "client!vb", name = "s", descriptor = "Lclient!je;")
	public static Class40 aClass40_1556 = Static69.method1231("Anmelde)2Limit -Uberschritten)3");

	@OriginalMember(owner = "client!vb", name = "t", descriptor = "Lclient!je;")
	public static Class40 aClass40_1557 = aClass40_1547;

	@OriginalMember(owner = "client!vb", name = "u", descriptor = "I")
	public static int anInt2876 = -1;

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(I)V")
	public static void method2066() {
		aClass40_1554 = null;
		aClass40_1552 = null;
		aClass40_1547 = null;
		aClass40_1556 = null;
		aClass40_1557 = null;
		aClass40_1555 = null;
		aClass40_1548 = null;
		anIntArray335 = null;
		aClass40_1553 = null;
		aClass40_1549 = null;
		aClass40_1551 = null;
		aClass40_1550 = null;
		anIntArrayArrayArray7 = null;
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(IILjava/awt/Component;ILclient!q;)Lclient!t;")
	public static Class34 method2067(@OriginalArg(0) int arg0, @OriginalArg(2) Component arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class59 arg3) {
		if (Static68.anInt1863 == 0) {
			throw new IllegalStateException();
		}
		try {
			@Pc(32) Class34 local32 = (Class34) Class.forName("Class34_Sub1").getDeclaredConstructor().newInstance();
			local32.anIntArray351 = new int[(Static34.aBoolean59 ? 2 : 1) * 256];
			local32.anInt2964 = arg2;
			local32.method2120(arg1);
			local32.anInt2965 = (arg2 & 0xFFFFFC00) + 1024;
			if (local32.anInt2965 > 16384) {
				local32.anInt2965 = 16384;
			}
			local32.method2124(local32.anInt2965);
			if (Static16.anInt408 > 0 && Static36.aClass70_1 == null) {
				Static36.aClass70_1 = new Class70();
				Static36.aClass70_1.aClass59_4 = arg3;
				arg3.method1638(Static16.anInt408, Static36.aClass70_1);
			}
			if (Static36.aClass70_1 != null) {
				if (Static36.aClass70_1.aClass34Array1[arg0] != null) {
					throw new IllegalArgumentException();
				}
				Static36.aClass70_1.aClass34Array1[arg0] = local32;
			}
			return local32;
		} catch (@Pc(104) Throwable local104) {
			try {
				@Pc(110) Class34_Sub2 local110 = new Class34_Sub2(arg3, arg0);
				local110.anInt2964 = arg2;
				local110.anIntArray351 = new int[(Static34.aBoolean59 ? 2 : 1) * 256];
				local110.method2120(arg1);
				local110.anInt2965 = 16384;
				local110.method2124(local110.anInt2965);
				if (Static16.anInt408 > 0 && Static36.aClass70_1 == null) {
					Static36.aClass70_1 = new Class70();
					Static36.aClass70_1.aClass59_4 = arg3;
					arg3.method1638(Static16.anInt408, Static36.aClass70_1);
				}
				if (Static36.aClass70_1 != null) {
					if (Static36.aClass70_1.aClass34Array1[arg0] != null) {
						throw new IllegalArgumentException();
					}
					Static36.aClass70_1.aClass34Array1[arg0] = local110;
				}
				return local110;
			} catch (@Pc(171) Throwable local171) {
				return new Class34();
			}
		}
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(IIIIIBIII)V")
	public static void method2068(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (Static112.method1873(arg1)) {
			Static40.aClass2_Sub13Array1 = null;
			Static62.method1116(arg7, arg6, arg3, arg0, arg5, -1, arg2, Static45.aClass2_Sub13ArrayArray1[arg1], arg4);
			if (Static40.aClass2_Sub13Array1 != null) {
				Static62.method1116(arg7, arg6, arg3, arg0, arg5, -1412584499, Static19.anInt612, Static40.aClass2_Sub13Array1, Static64.anInt1721);
				Static40.aClass2_Sub13Array1 = null;
			}
		} else if (arg3 == -1) {
			for (@Pc(22) int local22 = 0; local22 < 100; local22++) {
				Static64.aBooleanArray17[local22] = true;
			}
		} else {
			Static64.aBooleanArray17[arg3] = true;
		}
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(IB)[B")
	public static synchronized byte[] method2069(@OriginalArg(0) int arg0) {
		@Pc(26) byte[] local26;
		if (arg0 == 100 && Static88.anInt2283 > 0) {
			local26 = Static106.aByteArrayArray8[--Static88.anInt2283];
			Static106.aByteArrayArray8[Static88.anInt2283] = null;
			return local26;
		} else if (arg0 == 5000 && Static24.anInt3057 > 0) {
			local26 = Static18.aByteArrayArray2[--Static24.anInt3057];
			Static18.aByteArrayArray2[Static24.anInt3057] = null;
			return local26;
		} else if (arg0 == 30000 && Static33.anInt2663 > 0) {
			local26 = Static15.aByteArrayArray1[--Static33.anInt2663];
			Static15.aByteArrayArray1[Static33.anInt2663] = null;
			return local26;
		} else {
			return new byte[arg0];
		}
	}
}
