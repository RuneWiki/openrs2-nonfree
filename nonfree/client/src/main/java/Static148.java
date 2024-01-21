import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static148 {

	@OriginalMember(owner = "client!sf", name = "M", descriptor = "[[[Lclient!nd;")
	public static Class59[][][] aClass59ArrayArrayArray2 = new Class59[4][104][104];

	@OriginalMember(owner = "client!sf", name = "O", descriptor = "Z")
	public static boolean aBoolean151 = false;

	@OriginalMember(owner = "client!sf", name = "Q", descriptor = "Lclient!kb;")
	public static Class46 aClass46_1288 = Static65.method1172("Zu viele Anmelde)2Versuche von Ihrer Adresse");

	@OriginalMember(owner = "client!sf", name = "R", descriptor = "Lclient!kb;")
	public static Class46 aClass46_1289 = Static65.method1172("<img=0>");

	@OriginalMember(owner = "client!sf", name = "T", descriptor = "Lclient!kb;")
	public static Class46 aClass46_1290 = Static65.method1172("Wir vermuten)1 dass Ihr Konto gestohlen wurde");

	@OriginalMember(owner = "client!sf", name = "U", descriptor = "[I")
	public static int[] anIntArray406 = new int[128];

	@OriginalMember(owner = "client!sf", name = "W", descriptor = "I")
	public static int anInt3558 = 99;

	@OriginalMember(owner = "client!sf", name = "Y", descriptor = "Lclient!kb;")
	public static Class46 aClass46_1291 = Static65.method1172("RuneScape wird geladen )2 bitte warten)3)3)3");

	@OriginalMember(owner = "client!sf", name = "Z", descriptor = "J")
	public static volatile long aLong125 = 0L;

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(IIIII)V")
	public static void method2572(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(17) Class3_Sub7 local17 = (Class3_Sub7) Static28.aClass54_2.method1602((long) arg1);
		if (local17 == null) {
			local17 = new Class3_Sub7();
			Static28.aClass54_2.method1603((long) arg1, local17);
		}
		if (arg0 >= local17.anIntArray70.length) {
			@Pc(39) int[] local39 = new int[arg0 + 1];
			@Pc(44) int[] local44 = new int[arg0 + 1];
			for (@Pc(46) int local46 = 0; local46 < local17.anIntArray70.length; local46++) {
				local39[local46] = local17.anIntArray70[local46];
				local44[local46] = local17.anIntArray69[local46];
			}
			for (@Pc(72) int local72 = local17.anIntArray70.length; local72 < arg0; local72++) {
				local39[local72] = -1;
				local44[local72] = 0;
			}
			local17.anIntArray69 = local44;
			local17.anIntArray70 = local39;
		}
		local17.anIntArray70[arg0] = arg2;
		local17.anIntArray69[arg0] = arg3;
	}

	@OriginalMember(owner = "client!sf", name = "e", descriptor = "(I)V")
	public static void method2574() {
		aClass46_1290 = null;
		aClass46_1288 = null;
		aClass59ArrayArrayArray2 = null;
		aClass46_1289 = null;
		anIntArray406 = null;
		aClass46_1291 = null;
	}
}
