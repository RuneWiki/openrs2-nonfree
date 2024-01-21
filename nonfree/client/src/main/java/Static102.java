import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static102 {

	@OriginalMember(owner = "client!re", name = "b", descriptor = "I")
	public static int anInt2481;

	@OriginalMember(owner = "client!re", name = "c", descriptor = "I")
	public static int anInt2482 = 0;

	@OriginalMember(owner = "client!re", name = "e", descriptor = "I")
	public static int anInt2484 = 0;

	@OriginalMember(owner = "client!re", name = "g", descriptor = "I")
	public static int anInt2486 = 0;

	@OriginalMember(owner = "client!re", name = "i", descriptor = "J")
	public static long aLong69 = 0L;

	@OriginalMember(owner = "client!re", name = "j", descriptor = "Lclient!je;")
	public static Class40 aClass40_1324 = Static69.method1231("Ihr Charakter)2Profil wird in:");

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(IBLclient!na;IIIII)V")
	public static void method1799(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub9 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(30) int local30;
		if (arg3 < 0 || arg3 >= 104 || arg6 < 0 || arg6 >= 104) {
			while (true) {
				local30 = arg1.method640();
				if (local30 == 0) {
					break;
				}
				if (local30 == 1) {
					arg1.method640();
					break;
				}
				if (local30 <= 49) {
					arg1.method640();
				}
			}
			return;
		}
		Static66.aByteArrayArrayArray10[arg5][arg3][arg6] = 0;
		while (true) {
			local30 = arg1.method640();
			if (local30 == 0) {
				if (arg5 == 0) {
					Static118.anIntArrayArrayArray6[0][arg3][arg6] = -Static80.method1407(arg3 + arg4 + 932731, arg6 + 556238 - -arg0) * 8;
				} else {
					Static118.anIntArrayArrayArray6[arg5][arg3][arg6] = Static118.anIntArrayArrayArray6[arg5 - 1][arg3][arg6] - 240;
				}
				break;
			}
			if (local30 == 1) {
				@Pc(92) int local92 = arg1.method640();
				if (local92 == 1) {
					local92 = 0;
				}
				if (arg5 == 0) {
					Static118.anIntArrayArrayArray6[0][arg3][arg6] = -local92 * 8;
				} else {
					Static118.anIntArrayArrayArray6[arg5][arg3][arg6] = Static118.anIntArrayArrayArray6[arg5 - 1][arg3][arg6] - local92 * 8;
				}
				break;
			}
			if (local30 <= 49) {
				Static48.aByteArrayArrayArray8[arg5][arg3][arg6] = arg1.method658();
				Static21.aByteArrayArrayArray5[arg5][arg3][arg6] = (byte) ((local30 - 2) / 4);
				Static33.aByteArrayArrayArray11[arg5][arg3][arg6] = (byte) (arg2 + local30 - 2 & 0x3);
			} else if (local30 <= 81) {
				Static66.aByteArrayArrayArray10[arg5][arg3][arg6] = (byte) (local30 - 49);
			} else {
				Static63.aByteArrayArrayArray2[arg5][arg3][arg6] = (byte) (local30 - 81);
			}
		}
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(II)Lclient!of;")
	public static Class2_Sub1_Sub10 method1800(@OriginalArg(0) int arg0) {
		@Pc(10) Class2_Sub1_Sub10 local10 = (Class2_Sub1_Sub10) Static93.aClass55_75.method1410((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static54.aClass24_14.method1931(arg0, 10);
		local10 = new Class2_Sub1_Sub10();
		local10.anInt2230 = arg0;
		if (local20 != null) {
			local10.method1570(new Class2_Sub9(local20));
		}
		local10.method1575();
		if (local10.anInt2215 != -1) {
			local10.method1579(method1800(local10.anInt2215), method1800(local10.anInt2253));
		}
		if (!Static124.aBoolean237 && local10.aBoolean171) {
			local10.anInt2225 = 0;
			local10.aClass40_1161 = Static112.aClass40_1419;
			local10.aClass40Array15 = null;
			local10.aClass40Array14 = null;
		}
		Static93.aClass55_75.method1411((long) arg0, local10);
		return local10;
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(I)V")
	public static void method1801() {
		if (Static85.aClass57_2 != null) {
			Static85.aClass57_2.method1596();
			Static85.aClass57_2 = null;
		}
		Static120.method2023();
		Static111.aClass30_1.method762();
		for (@Pc(26) int local26 = 0; local26 < 4; local26++) {
			Static70.aClass20Array1[local26].method446();
		}
		System.gc();
		Static24.method2212();
		Static86.aBoolean247 = false;
		Static79.anInt2069 = -1;
		Static13.method211();
		Static21.method402(10);
	}

	@OriginalMember(owner = "client!re", name = "b", descriptor = "(I)V")
	public static void method1802() {
		Static110.aClass55_49.method1413();
	}

	@OriginalMember(owner = "client!re", name = "c", descriptor = "(I)V")
	public static void method1803() {
		aClass40_1324 = null;
	}
}
