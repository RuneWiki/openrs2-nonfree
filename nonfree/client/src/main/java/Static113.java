import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static113 {

	@OriginalMember(owner = "client!te", name = "a", descriptor = "I")
	public static int anInt3001 = 0;

	@OriginalMember(owner = "client!te", name = "k", descriptor = "Lclient!he;")
	public static Class26 aClass26_1606 = Static6.method100("blinken3:");

	@OriginalMember(owner = "client!te", name = "n", descriptor = "Lclient!he;")
	private static Class26 aClass26_1607 = Static6.method100("Existing User");

	@OriginalMember(owner = "client!te", name = "p", descriptor = "Lclient!he;")
	public static Class26 aClass26_1608 = aClass26_1607;

	@OriginalMember(owner = "client!te", name = "q", descriptor = "I")
	public static int anInt3014 = 0;

	@OriginalMember(owner = "client!te", name = "r", descriptor = "[I")
	public static int[] anIntArray364 = new int[] { 4, 10, 4, 0, 0, 2, 0, 0, 4, 6, 0, 0, 0, 0, 0, 6, 2, 4, 0, 0, 0, 0, 0, -1, 0, 0, 7, 0, 0, 0, 2, 0, 0, 0, 0, 0, 0, 6, 0, 3, 5, 0, 0, 0, 0, 0, 0, -2, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 5, 0, 6, 0, 0, 0, 0, 0, -2, 0, 0, -1, 0, 0, -2, 0, 2, 0, -2, 0, 0, 6, 0, 0, 0, 5, 0, 0, -1, -2, 0, -2, 0, 0, 0, 0, 0, 0, 0, 11, 0, 0, 0, 11, 0, 0, 0, -1, 0, 0, 0, 5, 6, 10, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 0, 0, 0, 4, 0, 0, 4, 0, 5, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 3, 0, 0, 2, 6, 0, 0, 1, 0, 0, 6, 0, 2, 0, 0, 0, 0, 4, -2, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, 0, 6, 0, 0, 0, 6, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 8, 0, 0, 0, 0, 0, 6, 7, 0, 0, 0, 0, 0, -2, 0, 0, 0, 15, 0, 0, -2, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 8, 0, 0, 0, 3, 7, 14, 0, 0, 0, 0, 6, 3, 0, 0, 0, 0, 0, 0, -2, 0, 12, 0 };

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(B)V")
	public static void method2065() {
		@Pc(1) Class70 local1 = Static124.aClass70_1;
		synchronized (Static124.aClass70_1) {
			Static21.anInt826 = Static67.anInt2790;
			Static59.anInt1807 = Static46.anInt1414;
			Static7.anInt187 = Static4.anInt134;
			Static102.anInt2770 = Static87.anInt2438;
			Static59.anInt1803 = Static115.anInt3047;
			Static19.anInt514 = Static54.anInt1633;
			Static101.aLong86 = Static14.aLong14;
			Static87.anInt2438 = 0;
		}
	}

	@OriginalMember(owner = "client!te", name = "b", descriptor = "(B)V")
	public static void method2066() {
		anIntArray364 = null;
		aClass26_1606 = null;
		aClass26_1608 = null;
		aClass26_1607 = null;
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(IILclient!ef;IIZ)V")
	public static void method2067(@OriginalArg(0) int arg0, @OriginalArg(2) Class16 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		Static108.anInt2897 = arg3;
		Static110.aClass16_136 = arg1;
		Static42.aBoolean71 = false;
		Static70.anInt1540 = 1;
		Static40.anInt1261 = arg2;
		Static63.anInt1933 = arg0;
		Static33.anInt1080 = 10000;
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(ILclient!vb;BLclient!m;)V")
	public static void method2068(@OriginalArg(0) int arg0, @OriginalArg(1) Class75 arg1, @OriginalArg(3) Class3_Sub11 arg2) {
		@Pc(9) Class3_Sub7 local9 = new Class3_Sub7();
		local9.anInt1042 = arg2.method981();
		local9.anInt1051 = arg2.method984();
		local9.aClass22Array2 = new Class22[local9.anInt1042];
		local9.anIntArray109 = new int[local9.anInt1042];
		local9.aClass22Array1 = new Class22[local9.anInt1042];
		local9.anIntArray110 = new int[local9.anInt1042];
		local9.aByteArrayArrayArray2 = new byte[local9.anInt1042][][];
		local9.anIntArray107 = new int[local9.anInt1042];
		for (@Pc(55) int local55 = 0; local55 < local9.anInt1042; local55++) {
			try {
				@Pc(63) int local63 = arg2.method981();
				@Pc(97) String local97;
				@Pc(108) String local108;
				@Pc(114) int local114;
				if (local63 == 0 || local63 == 1 || local63 == 2) {
					local97 = new String(arg2.method977().method850());
					local108 = new String(arg2.method977().method850());
					local114 = 0;
					if (local63 == 1) {
						local114 = arg2.method984();
					}
					local9.anIntArray107[local55] = local63;
					local9.anIntArray110[local55] = local114;
					local9.aClass22Array2[local55] = arg1.method2173(Static29.method608(local97), local108);
				} else if (local63 == 3 || local63 == 4) {
					local97 = new String(arg2.method977().method850());
					local108 = new String(arg2.method977().method850());
					local114 = arg2.method981();
					@Pc(117) String[] local117 = new String[local114];
					for (@Pc(119) int local119 = 0; local119 < local114; local119++) {
						local117[local119] = new String(arg2.method977().method850());
					}
					@Pc(145) byte[][] local145 = new byte[local114][];
					@Pc(156) int local156;
					if (local63 == 3) {
						for (@Pc(150) int local150 = 0; local150 < local114; local150++) {
							local156 = arg2.method984();
							local145[local150] = new byte[local156];
							arg2.method1018(local156, local145[local150]);
						}
					}
					local9.anIntArray107[local55] = local63;
					@Pc(181) Class[] local181 = new Class[local114];
					for (local156 = 0; local156 < local114; local156++) {
						local181[local156] = Static29.method608(local117[local156]);
					}
					local9.aClass22Array1[local55] = arg1.method2172(local181, local108, Static29.method608(local97));
					local9.aByteArrayArrayArray2[local55] = local145;
				}
			} catch (@Pc(276) ClassNotFoundException local276) {
				local9.anIntArray109[local55] = -1;
			} catch (@Pc(283) SecurityException local283) {
				local9.anIntArray109[local55] = -2;
			} catch (@Pc(290) NullPointerException local290) {
				local9.anIntArray109[local55] = -3;
			} catch (@Pc(297) Exception local297) {
				local9.anIntArray109[local55] = -4;
			} catch (@Pc(304) Throwable local304) {
				local9.anIntArray109[local55] = -5;
			}
		}
		Static12.aClass65_11.method1955(local9);
	}
}
