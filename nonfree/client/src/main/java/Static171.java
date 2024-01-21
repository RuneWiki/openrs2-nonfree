import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static171 {

	@OriginalMember(owner = "client!ue", name = "b", descriptor = "Lclient!ag;")
	public static Class4 aClass4_100;

	@OriginalMember(owner = "client!ue", name = "j", descriptor = "Z")
	public static boolean aBoolean308;

	@OriginalMember(owner = "client!ue", name = "e", descriptor = "Lclient!dd;")
	private static Class13 aClass13_1368 = Static161.method2971("Loaded wordpack");

	@OriginalMember(owner = "client!ue", name = "c", descriptor = "Lclient!dd;")
	public static Class13 aClass13_1367 = aClass13_1368;

	@OriginalMember(owner = "client!ue", name = "d", descriptor = "I")
	public static int anInt3964 = 0;

	@OriginalMember(owner = "client!ue", name = "f", descriptor = "Lclient!dd;")
	public static Class13 aClass13_1369 = Static161.method2971("Startseite auf (WSpielkonto wiederherstellen(W)3");

	@OriginalMember(owner = "client!ue", name = "i", descriptor = "Lclient!dd;")
	public static Class13 aClass13_1370 = Static161.method2971("welle2:");

	@OriginalMember(owner = "client!ue", name = "l", descriptor = "Lclient!dd;")
	public static Class13 aClass13_1371 = Static161.method2971("Ihr Spielkonto wurde deaktiviert)3");

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(I[[I)V")
	public static void method2891(@OriginalArg(1) int[][] arg0) {
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(BI)Z")
	public static boolean method2892(@OriginalArg(1) int arg0) {
		if (Static46.aBooleanArray25[arg0]) {
			return true;
		} else if (Static62.aClass4_62.method2269(arg0)) {
			@Pc(23) int local23 = Static62.aClass4_62.method2260(arg0);
			if (local23 == 0) {
				Static46.aBooleanArray25[arg0] = true;
				return true;
			}
			if (Static145.aClass20ArrayArray1[arg0] == null) {
				Static145.aClass20ArrayArray1[arg0] = new Class20[local23];
			}
			for (@Pc(45) int local45 = 0; local45 < local23; local45++) {
				if (Static145.aClass20ArrayArray1[arg0][local45] == null) {
					@Pc(61) byte[] local61 = Static62.aClass4_62.method2243(arg0, local45);
					if (local61 != null) {
						Static145.aClass20ArrayArray1[arg0][local45] = new Class20();
						Static145.aClass20ArrayArray1[arg0][local45].anInt1630 = local45 + (arg0 << 16);
						if (local61[0] == -1) {
							Static145.aClass20ArrayArray1[arg0][local45].method1231(new Class1_Sub8(local61));
						} else {
							Static145.aClass20ArrayArray1[arg0][local45].method1229(new Class1_Sub8(local61));
						}
					}
				}
			}
			Static46.aBooleanArray25[arg0] = true;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(IIIILclient!lc;Lclient!lc;IIIIJ)V")
	public static void method2893(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class1_Sub2_Sub2 arg4, @OriginalArg(5) Class1_Sub2_Sub2 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) long arg10) {
		if (arg4 == null) {
			return;
		}
		@Pc(6) Class69 local6 = new Class69();
		local6.aLong114 = arg10;
		local6.anInt3380 = arg1 * 128 + 64;
		local6.anInt3376 = arg2 * 128 + 64;
		local6.anInt3381 = arg3;
		local6.aClass1_Sub2_Sub2_10 = arg4;
		local6.aClass1_Sub2_Sub2_9 = arg5;
		local6.anInt3385 = arg6;
		local6.anInt3374 = arg7;
		local6.anInt3375 = arg8;
		local6.anInt3383 = arg9;
		for (@Pc(46) int local46 = arg0; local46 >= 0; local46--) {
			if (Static170.aClass1_Sub10ArrayArrayArray35[local46][arg1][arg2] == null) {
				Static170.aClass1_Sub10ArrayArrayArray35[local46][arg1][arg2] = new Class1_Sub10(local46, arg1, arg2);
			}
		}
		Static170.aClass1_Sub10ArrayArrayArray35[arg0][arg1][arg2].aClass69_1 = local6;
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(I)V")
	public static void method2894() {
		aClass13_1370 = null;
		aClass13_1371 = null;
		aClass4_100 = null;
		aClass13_1369 = null;
		aClass13_1367 = null;
		aClass13_1368 = null;
	}

	@OriginalMember(owner = "client!ue", name = "b", descriptor = "(I)V")
	public static void method2895() {
		for (@Pc(7) int local7 = 0; local7 < Static156.anInt3694; local7++) {
			@Pc(13) int local13 = Static147.anIntArray350[local7];
			@Pc(17) Class1_Sub2_Sub2_Sub2_Sub2 local17 = Static45.aClass1_Sub2_Sub2_Sub2_Sub2Array1[local13];
			@Pc(21) int local21 = Static153.aClass1_Sub8_Sub1_2.method1607();
			if ((local21 & 0x8) != 0) {
				local21 += Static153.aClass1_Sub8_Sub1_2.method1607() << 8;
			}
			Static165.method2828(local21, local13, local17);
		}
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(IIJZ)Lclient!dd;")
	public static Class13 method2896(@OriginalArg(2) long arg0) {
		@Pc(28) int local28 = 1;
		for (@Pc(33) long local33 = arg0 / (long) 10; local33 != 0L; local33 /= 10) {
			local28++;
		}
		@Pc(49) int local49 = local28;
		if (arg0 < 0L) {
			local49 = local28 + 1;
		}
		@Pc(59) byte[] local59 = new byte[local49];
		if (arg0 < 0L) {
			local59[0] = 45;
		}
		for (@Pc(84) int local84 = 0; local84 < local28; local84++) {
			@Pc(92) int local92 = (int) (arg0 % (long) 10);
			if (local92 < 0) {
				local92 = -local92;
			}
			arg0 /= 10;
			if (local92 > 9) {
				local92 += 39;
			}
			local59[local49 - local84 - 1] = (byte) (local92 + 48);
		}
		@Pc(128) Class13 local128 = new Class13();
		local128.aByteArray19 = local59;
		local128.anInt1080 = local49;
		return local128;
	}
}
