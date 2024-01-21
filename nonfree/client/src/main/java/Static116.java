import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static116 {

	@OriginalMember(owner = "client!ua", name = "vb", descriptor = "Z")
	public static boolean aBoolean223;

	@OriginalMember(owner = "client!ua", name = "Db", descriptor = "I")
	public static int anInt2704;

	@OriginalMember(owner = "client!ua", name = "kb", descriptor = "Lclient!ob;")
	public static Class55 aClass55_81 = new Class55(30);

	@OriginalMember(owner = "client!ua", name = "wb", descriptor = "Lclient!je;")
	private static Class40 aClass40_1454 = Static69.method1231(" seconds)3");

	@OriginalMember(owner = "client!ua", name = "ub", descriptor = "Lclient!je;")
	public static Class40 aClass40_1453 = aClass40_1454;

	@OriginalMember(owner = "client!ua", name = "Ab", descriptor = "Lclient!je;")
	public static Class40 aClass40_1455 = Static69.method1231(" )2> ");

	@OriginalMember(owner = "client!ua", name = "Bb", descriptor = "I")
	public static int anInt2703 = -1;

	@OriginalMember(owner = "client!ua", name = "Cb", descriptor = "Lclient!je;")
	public static Class40 aClass40_1456 = Static69.method1231("Lade Konfiguration )2 ");

	@OriginalMember(owner = "client!ua", name = "Eb", descriptor = "Lclient!je;")
	public static Class40 aClass40_1457 = Static69.method1231("Hidden)2use");

	@OriginalMember(owner = "client!ua", name = "Fb", descriptor = "Lclient!je;")
	public static Class40 aClass40_1458 = Static69.method1231(" zuerst von Ihrer Freunde)2Liste(Q");

	@OriginalMember(owner = "client!ua", name = "Gb", descriptor = "I")
	public static int anInt2705 = 0;

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(IBII)I")
	public static int method1935(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if ((Static66.aByteArrayArrayArray10[arg2][arg1][arg0] & 0x8) == 0) {
			return arg2 <= 0 || (Static66.aByteArrayArrayArray10[1][arg1][arg0] & 0x2) == 0 ? arg2 : arg2 - 1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!ua", name = "d", descriptor = "(I)V")
	public static void method1940() {
		aClass40_1457 = null;
		aClass40_1454 = null;
		aClass40_1456 = null;
		aClass40_1458 = null;
		aClass40_1455 = null;
		aClass55_81 = null;
		aClass40_1453 = null;
	}

	@OriginalMember(owner = "client!ua", name = "e", descriptor = "(B)Lclient!qb;")
	public static Class2_Sub1_Sub2_Sub4 method1941() {
		@Pc(9) Class2_Sub1_Sub2_Sub4 local9 = new Class2_Sub1_Sub2_Sub4();
		local9.anInt2387 = Static10.anInt2972;
		local9.anInt2385 = Static57.anIntArray149[0];
		local9.anInt2389 = Static105.anIntArray287[0];
		local9.anInt2386 = Static3.anIntArray6[0];
		local9.anInt2388 = Static16.anInt410;
		local9.anInt2390 = Static3.anIntArray5[0];
		@Pc(44) byte[] local44 = Static127.aByteArrayArray9[0];
		@Pc(50) int local50 = local9.anInt2386 * local9.anInt2385;
		local9.anIntArray259 = new int[local50];
		for (@Pc(56) int local56 = 0; local56 < local50; local56++) {
			local9.anIntArray259[local56] = Static69.anIntArray205[local44[local56] & 0xFF];
		}
		Static126.method2088();
		return local9;
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(IILclient!ge;III)V")
	public static void method1944(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class2_Sub1_Sub4 arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		@Pc(7) Class2_Sub14 local7 = new Class2_Sub14();
		local7.anInt1671 = arg1 * 128;
		local7.anIntArray167 = arg2.anIntArray105;
		local7.anInt1677 = arg2.anInt1069 * 128;
		local7.anInt1675 = arg2.anInt1061;
		local7.anInt1674 = arg2.anInt1046;
		local7.anInt1670 = arg2.anInt1064;
		local7.anInt1664 = arg0;
		local7.anInt1663 = arg3 * 128;
		@Pc(45) int local45 = arg2.anInt1036;
		@Pc(48) int local48 = arg2.anInt1066;
		if (arg4 == 1 || arg4 == 3) {
			local48 = arg2.anInt1036;
			local45 = arg2.anInt1066;
		}
		local7.anInt1667 = (local45 + arg1) * 128;
		local7.anInt1660 = (arg3 + local48) * 128;
		if (arg2.anIntArray103 != null) {
			local7.aClass2_Sub1_Sub4_1 = arg2;
			local7.method1109();
		}
		Static49.aClass3_6.method75(local7);
		if (local7.anIntArray167 != null) {
			local7.anInt1673 = (int) (Math.random() * (double) (local7.anInt1675 - local7.anInt1670)) + local7.anInt1670;
		}
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(Lclient!kc;B)I")
	public static int method1945(@OriginalArg(0) Class2_Sub13 arg0) {
		@Pc(17) Class2_Sub15 local17 = (Class2_Sub15) Static105.aClass77_11.method2034((long) arg0.anInt1578 + ((long) arg0.anInt1560 << 32));
		return local17 == null ? arg0.anInt1540 : local17.anInt1862;
	}
}
