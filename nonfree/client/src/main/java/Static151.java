import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static151 {

	@OriginalMember(owner = "client!pe", name = "H", descriptor = "I")
	public static int anInt3441;

	@OriginalMember(owner = "client!pe", name = "L", descriptor = "I")
	public static int anInt3442;

	@OriginalMember(owner = "client!pe", name = "t", descriptor = "Lclient!id;")
	public static Class43 aClass43_16 = new Class43(64);

	@OriginalMember(owner = "client!pe", name = "B", descriptor = "Lclient!ca;")
	public static Class16 aClass16_9 = new Class16(50);

	@OriginalMember(owner = "client!pe", name = "C", descriptor = "Lclient!i;")
	public static Class41 aClass41_940 = Static184.method2923("document)3cookie=(R");

	@OriginalMember(owner = "client!pe", name = "D", descriptor = "[Lclient!i;")
	public static Class41[] aClass41Array51 = new Class41[200];

	@OriginalMember(owner = "client!pe", name = "E", descriptor = "Lclient!i;")
	public static Class41 aClass41_941 = Static184.method2923("Startseite auf (WSpielkonto wiederherstellen(W)3");

	@OriginalMember(owner = "client!pe", name = "F", descriptor = "[I")
	public static int[] anIntArray350 = new int[] { 1, -1, -1, 1 };

	@OriginalMember(owner = "client!pe", name = "G", descriptor = "Lclient!i;")
	public static Class41 aClass41_942 = Static184.method2923("Spieler kann nicht gefunden werden: ");

	@OriginalMember(owner = "client!pe", name = "I", descriptor = "Lclient!i;")
	public static Class41 aClass41_943 = Static184.method2923("Zugewiesener Speicher)3");

	@OriginalMember(owner = "client!pe", name = "J", descriptor = "Lclient!i;")
	private static Class41 aClass41_944 = Static184.method2923("<col=ff0000>");

	@OriginalMember(owner = "client!pe", name = "K", descriptor = "[I")
	public static int[] anIntArray351 = new int[2000];

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(BI)Lclient!si;")
	public static Class2_Sub2_Sub20 method2358(@OriginalArg(1) int arg0) {
		@Pc(6) Class2_Sub2_Sub20 local6 = (Class2_Sub2_Sub20) Static116.aClass43_11.method1464((long) arg0);
		if (local6 != null) {
			return local6;
		}
		@Pc(34) byte[] local34;
		if (arg0 >= 32768) {
			local34 = Static34.aClass15_7.method387(arg0 & 0x7FFF, 1);
		} else {
			local34 = Static68.aClass15_17.method387(arg0, 1);
		}
		local6 = new Class2_Sub2_Sub20();
		if (local34 != null) {
			local6.method2896(new Class2_Sub3(local34));
		}
		if (arg0 >= 32768) {
			local6.method2900();
		}
		Static116.aClass43_11.method1462((long) arg0, local6);
		return local6;
	}

	@OriginalMember(owner = "client!pe", name = "c", descriptor = "(B)V")
	public static void method2359() {
		Static204.aClass2_Sub3_Sub1_3.method225();
		@Pc(11) int local11 = Static204.aClass2_Sub3_Sub1_3.method219(1);
		if (local11 == 0) {
			return;
		}
		@Pc(22) int local22 = Static204.aClass2_Sub3_Sub1_3.method219(2);
		if (local22 == 0) {
			Static124.anIntArray313[Static170.anInt3986++] = 2047;
			return;
		}
		@Pc(43) int local43;
		@Pc(53) int local53;
		if (local22 == 1) {
			local43 = Static204.aClass2_Sub3_Sub1_3.method219(3);
			Static213.aClass12_Sub3_Sub1_1.method2724(false, local43);
			local53 = Static204.aClass2_Sub3_Sub1_3.method219(1);
			if (local53 == 1) {
				Static124.anIntArray313[Static170.anInt3986++] = 2047;
			}
			return;
		}
		@Pc(93) int local93;
		if (local22 == 2) {
			local43 = Static204.aClass2_Sub3_Sub1_3.method219(3);
			Static213.aClass12_Sub3_Sub1_1.method2724(true, local43);
			local53 = Static204.aClass2_Sub3_Sub1_3.method219(3);
			Static213.aClass12_Sub3_Sub1_1.method2724(true, local53);
			local93 = Static204.aClass2_Sub3_Sub1_3.method219(1);
			if (local93 == 1) {
				Static124.anIntArray313[Static170.anInt3986++] = 2047;
			}
		} else if (local22 == 3) {
			local43 = Static204.aClass2_Sub3_Sub1_3.method219(1);
			Static134.anInt3147 = Static204.aClass2_Sub3_Sub1_3.method219(2);
			local53 = Static204.aClass2_Sub3_Sub1_3.method219(1);
			if (local53 == 1) {
				Static124.anIntArray313[Static170.anInt3986++] = 2047;
			}
			local93 = Static204.aClass2_Sub3_Sub1_3.method219(7);
			@Pc(148) int local148 = Static204.aClass2_Sub3_Sub1_3.method219(7);
			Static213.aClass12_Sub3_Sub1_1.method2722(local43 == 1, local93, local148);
		}
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(III)Lclient!i;")
	public static Class41 method2360(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg1 - arg0;
		if (local12 < -9) {
			return aClass41_944;
		} else if (local12 < -6) {
			return Static165.aClass41_1028;
		} else if (local12 < -3) {
			return Static2.aClass41_17;
		} else if (local12 < 0) {
			return Static28.aClass41_189;
		} else if (local12 > 9) {
			return Static11.aClass41_80;
		} else if (local12 > 6) {
			return Static30.aClass41_208;
		} else if (local12 > 3) {
			return Static205.aClass41_1224;
		} else if (local12 > 0) {
			return Static121.aClass41_1281;
		} else {
			return Static7.aClass41_61;
		}
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(ZB[B)Ljava/lang/Object;")
	public static Object method2361(@OriginalArg(2) byte[] arg0) {
		if (arg0 == null) {
			return null;
		}
		if (arg0.length > 136 && !Static10.aBoolean19) {
			try {
				@Pc(25) Class1 local25 = (Class1) Class.forName("Class1_Sub1").getDeclaredConstructor().newInstance();
				local25.method2635(arg0);
				return local25;
			} catch (@Pc(32) Throwable local32) {
				Static10.aBoolean19 = true;
			}
		}
		return arg0;
	}
}
