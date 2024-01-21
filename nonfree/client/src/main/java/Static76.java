import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static76 {

	@OriginalMember(owner = "client!nb", name = "w", descriptor = "[I")
	public static int[] anIntArray193;

	@OriginalMember(owner = "client!nb", name = "x", descriptor = "Lclient!kd;")
	public static Class40_Sub1 aClass40_Sub1_12;

	@OriginalMember(owner = "client!nb", name = "C", descriptor = "I")
	public static int anInt1896;

	@OriginalMember(owner = "client!nb", name = "G", descriptor = "I")
	public static int anInt1898;

	@OriginalMember(owner = "client!nb", name = "K", descriptor = "Lclient!lc;")
	public static Class40 aClass40_56;

	@OriginalMember(owner = "client!nb", name = "M", descriptor = "I")
	public static int anInt1900;

	@OriginalMember(owner = "client!nb", name = "r", descriptor = "Lclient!qc;")
	private static Class60 aClass60_741 = Static121.method2047("OFF");

	@OriginalMember(owner = "client!nb", name = "q", descriptor = "Lclient!qc;")
	public static Class60 aClass60_740 = aClass60_741;

	@OriginalMember(owner = "client!nb", name = "u", descriptor = "I")
	public static int anInt1891 = 2;

	@OriginalMember(owner = "client!nb", name = "v", descriptor = "Lclient!qc;")
	private static Class60 aClass60_742 = Static121.method2047("and choose the (Wcreate account(W");

	@OriginalMember(owner = "client!nb", name = "D", descriptor = "Z")
	public static boolean aBoolean76 = false;

	@OriginalMember(owner = "client!nb", name = "F", descriptor = "Lclient!qc;")
	public static Class60 aClass60_743 = aClass60_742;

	@OriginalMember(owner = "client!nb", name = "P", descriptor = "Lclient!qc;")
	private static Class60 aClass60_746 = Static121.method2047("Click to switch");

	@OriginalMember(owner = "client!nb", name = "O", descriptor = "Lclient!qc;")
	public static Class60 aClass60_745 = aClass60_746;

	@OriginalMember(owner = "client!nb", name = "R", descriptor = "[I")
	public static int[] anIntArray194 = new int[500];

	@OriginalMember(owner = "client!nb", name = "b", descriptor = "(I)V")
	public static void method1414() {
		anIntArray194 = null;
		anIntArray193 = null;
		aClass60_740 = null;
		aClass40_Sub1_12 = null;
		aClass60_742 = null;
		aClass60_745 = null;
		aClass60_746 = null;
		aClass60_743 = null;
		aClass60_741 = null;
		aClass40_56 = null;
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(IIII)V")
	public static void method1415(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class4_Sub17 local8 = Static23.method459(arg2, arg1);
		if (local8 != null && local8.anObjectArray16 != null) {
			@Pc(17) Class4_Sub16 local17 = new Class4_Sub16();
			local17.anObjectArray3 = local8.anObjectArray16;
			local17.aClass4_Sub17_9 = local8;
			Static18.method296(local17);
		}
		Static85.anInt2034 = arg0;
		Static89.anInt2076 = arg2;
		Static52.anInt1348 = arg1;
		Static71.aBoolean70 = true;
		Static130.method2133(local8);
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(III)V")
	public static void method1416(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) Class4_Sub4_Sub4 local7 = Static89.method1525(arg1);
		@Pc(10) int local10 = local7.anInt1030;
		@Pc(13) int local13 = local7.anInt1034;
		@Pc(16) int local16 = local7.anInt1038;
		@Pc(22) int local22 = Class4_Sub4_Sub1_Sub2.anIntArray289[local16 - local13];
		if (arg0 < 0 || local22 < arg0) {
			arg0 = 0;
		}
		local22 <<= local13;
		Static62.anIntArray168[local10] = local22 & arg0 << local13 | Static62.anIntArray168[local10] & ~local22;
	}

	@OriginalMember(owner = "client!nb", name = "c", descriptor = "(B)V")
	public static void method1417() {
		Static95.aClass48_53.method1393();
	}
}
