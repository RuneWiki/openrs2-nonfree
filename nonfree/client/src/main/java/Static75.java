import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static75 {

	@OriginalMember(owner = "client!nb", name = "H", descriptor = "I")
	public static int anInt1945 = 0;

	@OriginalMember(owner = "client!nb", name = "J", descriptor = "Lclient!je;")
	public static Class40 aClass40_968 = Static69.method1231("Unerwartete Antwort vom Anmelde)2Server)3");

	@OriginalMember(owner = "client!nb", name = "K", descriptor = "Lclient!je;")
	public static Class40 aClass40_969 = Static69.method1231("null");

	@OriginalMember(owner = "client!nb", name = "L", descriptor = "[I")
	public static int[] anIntArray208 = new int[128];

	@OriginalMember(owner = "client!nb", name = "M", descriptor = "Lclient!je;")
	private static Class40 aClass40_970 = Static69.method1231("Press (Wrecover a locked account(W on front page)3");

	@OriginalMember(owner = "client!nb", name = "N", descriptor = "Lclient!ob;")
	public static Class55 aClass55_53 = new Class55(50);

	@OriginalMember(owner = "client!nb", name = "P", descriptor = "Lclient!je;")
	public static Class40 aClass40_972 = aClass40_970;

	@OriginalMember(owner = "client!nb", name = "Q", descriptor = "Lclient!je;")
	public static Class40 aClass40_973 = Static69.method1231("da dieser Computer gegen unsere ");

	@OriginalMember(owner = "client!nb", name = "R", descriptor = "Lclient!ob;")
	public static Class55 aClass55_54 = new Class55(64);

	@OriginalMember(owner = "client!nb", name = "S", descriptor = "Lclient!je;")
	public static Class40 aClass40_974 = Static69.method1231(")2");

	@OriginalMember(owner = "client!nb", name = "T", descriptor = "I")
	public static int anInt1947 = -1;

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(Lclient!d;I)V")
	public static void method1246(@OriginalArg(0) Class2_Sub5 arg0) {
		if (arg0.aClass2_Sub4_5 != null) {
			arg0.aClass2_Sub4_5.anInt2499 = 0;
		}
		arg0.aBoolean227 = false;
		for (@Pc(23) Class2_Sub5 local23 = arg0.method1960(); local23 != null; local23 = arg0.method1954()) {
			method1246(local23);
		}
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(IBI)V")
	public static void method1247(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (Static57.anInt1500 < 2 && Static111.anInt2597 == 0 && !Static31.aBoolean53) {
			return;
		}
		@Pc(47) Class40 local47;
		if (Static111.anInt2597 == 1 && Static57.anInt1500 < 2) {
			local47 = Static40.method722(new Class40[] { Static70.aClass40_936, Static96.aClass40_1276, Static2.aClass40_72, Static50.aClass40_659 });
		} else if (Static31.aBoolean53 && Static57.anInt1500 < 2) {
			local47 = Static40.method722(new Class40[] { Static34.aClass40_471, Static96.aClass40_1276, Static118.aClass40_1491, Static50.aClass40_659 });
		} else {
			local47 = Static30.method465(Static57.anInt1500 - 1);
		}
		if (Static57.anInt1500 > 2) {
			local47 = Static40.method722(new Class40[] { local47, Static2.aClass40_70, Static49.method886(Static57.anInt1500 - 2), Static64.aClass40_849 });
		}
		Static73.aClass2_Sub1_Sub2_Sub3_Sub1_3.method1540(local47, arg1 + 4, arg0 + 15, Static28.anInt704 / 1000);
	}

	@OriginalMember(owner = "client!nb", name = "c", descriptor = "(B)V")
	public static void method1248() {
		anIntArray208 = null;
		aClass40_969 = null;
		aClass40_973 = null;
		Class2_Sub16.anIntArray207 = null;
		aClass40_968 = null;
		aClass40_972 = null;
		aClass55_53 = null;
		aClass40_974 = null;
		aClass40_970 = null;
		aClass55_54 = null;
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(IIBILclient!ua;IZ)V")
	public static void method1249(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class24_Sub1 arg4, @OriginalArg(6) boolean arg5) {
		@Pc(11) long local11 = (long) ((arg0 << 16) + arg3);
		@Pc(17) Class2_Sub1_Sub12 local17 = (Class2_Sub1_Sub12) Static68.aClass77_7.method2034(local11);
		if (local17 != null) {
			return;
		}
		local17 = (Class2_Sub1_Sub12) Static97.aClass77_10.method2034(local11);
		if (local17 != null) {
			return;
		}
		local17 = (Class2_Sub1_Sub12) Static121.aClass77_14.method2034(local11);
		if (local17 == null) {
			if (!arg5) {
				local17 = (Class2_Sub1_Sub12) Static14.aClass77_3.method2034(local11);
				if (local17 != null) {
					return;
				}
			}
			local17 = new Class2_Sub1_Sub12();
			local17.aClass24_Sub1_16 = arg4;
			local17.aByte6 = arg2;
			local17.anInt2468 = arg1;
			if (arg5) {
				Static68.aClass77_7.method2030(local11, local17);
				Static79.anInt2064++;
			} else {
				Static72.aClass56_1.method1584(local17);
				Static121.aClass77_14.method2030(local11, local17);
				Static121.anInt2842++;
			}
		} else if (arg5) {
			local17.method2211();
			Static68.aClass77_7.method2030(local11, local17);
			Static79.anInt2064++;
			Static121.anInt2842--;
		}
	}
}
