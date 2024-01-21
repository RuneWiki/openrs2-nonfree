import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static12 {

	@OriginalMember(owner = "client!cb", name = "E", descriptor = "I")
	public static int anInt282;

	@OriginalMember(owner = "client!cb", name = "H", descriptor = "Lclient!ne;")
	public static Class3_Sub3_Sub2_Sub4 aClass3_Sub3_Sub2_Sub4_17;

	@OriginalMember(owner = "client!cb", name = "U", descriptor = "[I")
	public static int[] anIntArray52;

	@OriginalMember(owner = "client!cb", name = "y", descriptor = "Lclient!hb;")
	public static Class27 aClass27_141 = Static87.method1648("Keine Antwort vom Server)3");

	@OriginalMember(owner = "client!cb", name = "z", descriptor = "Lclient!hb;")
	public static Class27 aClass27_142 = Static87.method1648("auf einer freien Welt zu spielen)3");

	@OriginalMember(owner = "client!cb", name = "A", descriptor = "Lclient!hb;")
	private static Class27 aClass27_143 = Static87.method1648("Please use a different world)3");

	@OriginalMember(owner = "client!cb", name = "B", descriptor = "I")
	public static int anInt281 = 0;

	@OriginalMember(owner = "client!cb", name = "C", descriptor = "Lclient!hb;")
	private static Class27 aClass27_144 = Static87.method1648("Loaded sprites");

	@OriginalMember(owner = "client!cb", name = "D", descriptor = "Lclient!hb;")
	private static Class27 aClass27_145 = Static87.method1648("Enter name of friend to delete from list");

	@OriginalMember(owner = "client!cb", name = "F", descriptor = "I")
	public static int anInt283 = -1;

	@OriginalMember(owner = "client!cb", name = "G", descriptor = "Lclient!hb;")
	public static Class27 aClass27_146 = aClass27_144;

	@OriginalMember(owner = "client!cb", name = "I", descriptor = "Z")
	public static boolean aBoolean16 = false;

	@OriginalMember(owner = "client!cb", name = "K", descriptor = "Lclient!hb;")
	public static Class27 aClass27_147 = aClass27_145;

	@OriginalMember(owner = "client!cb", name = "L", descriptor = "Lclient!hb;")
	public static Class27 aClass27_148 = Static87.method1648("titlebutton");

	@OriginalMember(owner = "client!cb", name = "O", descriptor = "I")
	public static int anInt286 = 0;

	@OriginalMember(owner = "client!cb", name = "P", descriptor = "Lclient!hb;")
	public static Class27 aClass27_150 = Static87.method1648(")1");

	@OriginalMember(owner = "client!cb", name = "R", descriptor = "Lclient!hb;")
	private static Class27 aClass27_152 = Static87.method1648("Loading sprites )2 ");

	@OriginalMember(owner = "client!cb", name = "Q", descriptor = "Lclient!hb;")
	public static Class27 aClass27_151 = aClass27_152;

	@OriginalMember(owner = "client!cb", name = "V", descriptor = "Lclient!hb;")
	public static Class27 aClass27_153 = aClass27_143;

	@OriginalMember(owner = "client!cb", name = "W", descriptor = "Lclient!hb;")
	public static Class27 aClass27_154 = Static87.method1648("Welt");

	@OriginalMember(owner = "client!cb", name = "X", descriptor = "[I")
	public static int[] anIntArray53 = new int[50];

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(ILclient!jc;IIII)V")
	public static void method244(@OriginalArg(1) Class3_Sub3_Sub4 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(12) Class3_Sub9 local12 = new Class3_Sub9();
		local12.anInt1421 = arg0.anInt1320;
		local12.anIntArray233 = arg0.anIntArray216;
		@Pc(23) int local23 = arg0.anInt1334;
		local12.anInt1420 = arg0.anInt1308;
		local12.anInt1413 = arg4 * 128;
		local12.anInt1411 = arg2 * 128;
		local12.anInt1419 = arg0.anInt1331;
		local12.anInt1412 = arg0.anInt1305 * 128;
		local12.anInt1410 = arg1;
		@Pc(53) int local53 = arg0.anInt1309;
		if (arg3 == 1 || arg3 == 3) {
			local53 = arg0.anInt1334;
			local23 = arg0.anInt1309;
		}
		local12.anInt1408 = (arg2 + local23) * 128;
		local12.anInt1415 = (arg4 + local53) * 128;
		if (arg0.anIntArray215 != null) {
			local12.aClass3_Sub3_Sub4_1 = arg0;
			local12.method1054();
		}
		Static40.aClass28_9.method889(local12);
		if (local12.anIntArray233 != null) {
			local12.anInt1417 = local12.anInt1419 + (int) (Math.random() * (double) (local12.anInt1421 - local12.anInt1419));
		}
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(Lclient!td;Lclient!td;Z)V")
	public static void method245(@OriginalArg(0) Class54 arg0, @OriginalArg(1) Class54 arg1) {
		Static102.aClass54_32 = arg1;
		Static32.aClass54_16 = arg0;
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(IZII)I")
	public static int method246(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(5) int local5 = arg0 - 1 & arg2;
		@Pc(13) int local13 = arg2 / arg0;
		@Pc(17) int local17 = arg1 / arg0;
		@Pc(22) int local22 = Static103.method1839(local17, local13);
		@Pc(28) int local28 = arg0 - 1 & arg1;
		@Pc(40) int local40 = Static103.method1839(local17, local13 + 1);
		@Pc(47) int local47 = Static103.method1839(local17 + 1, local13);
		@Pc(56) int local56 = Static103.method1839(local17 + 1, local13 + 1);
		@Pc(63) int local63 = Static101.method1815(local22, local40, arg0, local5);
		@Pc(70) int local70 = Static101.method1815(local47, local56, arg0, local5);
		return Static101.method1815(local63, local70, arg0, local28);
	}

	@OriginalMember(owner = "client!cb", name = "b", descriptor = "(B)V")
	public static void method247() {
		aClass27_148 = null;
		aClass3_Sub3_Sub2_Sub4_17 = null;
		anIntArray53 = null;
		aClass27_152 = null;
		aClass27_142 = null;
		aClass27_150 = null;
		aClass27_153 = null;
		aClass27_145 = null;
		aClass27_143 = null;
		aClass27_151 = null;
		aClass27_146 = null;
		aClass27_141 = null;
		anIntArray52 = null;
		aClass27_144 = null;
		aClass27_147 = null;
		aClass27_154 = null;
	}
}
