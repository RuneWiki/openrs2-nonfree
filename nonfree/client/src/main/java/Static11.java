import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static11 {

	@OriginalMember(owner = "client!c", name = "g", descriptor = "Lclient!pc;")
	public static Class57 aClass57_1;

	@OriginalMember(owner = "client!c", name = "i", descriptor = "I")
	public static int anInt234;

	@OriginalMember(owner = "client!c", name = "b", descriptor = "Lclient!ob;")
	public static Class55 aClass55_12 = new Class55(64);

	@OriginalMember(owner = "client!c", name = "m", descriptor = "Lclient!je;")
	private static Class40 aClass40_199 = Static69.method1231("Press (Wchange your password(W on front page)3");

	@OriginalMember(owner = "client!c", name = "f", descriptor = "Lclient!je;")
	public static Class40 aClass40_195 = aClass40_199;

	@OriginalMember(owner = "client!c", name = "o", descriptor = "Lclient!je;")
	private static Class40 aClass40_201 = Static69.method1231("Existing User");

	@OriginalMember(owner = "client!c", name = "h", descriptor = "Lclient!je;")
	public static Class40 aClass40_196 = aClass40_201;

	@OriginalMember(owner = "client!c", name = "j", descriptor = "Lclient!je;")
	public static Class40 aClass40_197 = Static69.method1231("gr-Un:");

	@OriginalMember(owner = "client!c", name = "k", descriptor = "[B")
	public static byte[] aByteArray7 = new byte[] { 95, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57 };

	@OriginalMember(owner = "client!c", name = "l", descriptor = "Lclient!je;")
	public static Class40 aClass40_198 = Static69.method1231("<col=c0ff00>");

	@OriginalMember(owner = "client!c", name = "n", descriptor = "Lclient!je;")
	public static Class40 aClass40_200 = null;

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(Z)V")
	public static void method205() {
		aClass40_200 = null;
		aClass40_197 = null;
		aClass40_196 = null;
		aByteArray7 = null;
		aClass40_195 = null;
		aClass40_199 = null;
		aClass57_1 = null;
		aClass55_12 = null;
		aClass40_201 = null;
		aClass40_198 = null;
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(II)Lclient!je;")
	public static Class40 method206(@OriginalArg(0) int arg0) {
		@Pc(14) Class40 local14 = Static49.method886(arg0);
		for (@Pc(20) int local20 = local14.method950() - 3; local20 > 0; local20 -= 3) {
			local14 = Static40.method722(new Class40[] { local14.method953(0, local20), Static43.aClass40_572, local14.method968(local20) });
		}
		if (local14.method950() > 9) {
			return Static40.method722(new Class40[] { Static39.aClass40_553, local14.method953(0, local14.method950() - 8), Static67.aClass40_887, Static101.aClass40_1320, local14, Static43.aClass40_570 });
		} else if (local14.method950() > 6) {
			return Static40.method722(new Class40[] { Static99.aClass40_1308, local14.method953(0, local14.method950() - 4), Static117.aClass40_1473, Static101.aClass40_1320, local14, Static43.aClass40_570 });
		} else {
			return Static40.method722(new Class40[] { Static55.aClass40_720, local14, Static103.aClass40_1340 });
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(IB)Z")
	public static boolean method207(@OriginalArg(0) int arg0) {
		return (arg0 >> 21 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(IIIII)I")
	public static int method208(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(23) int local23 = 65536 - Class2_Sub1_Sub2_Sub2.anIntArray221[arg3 * 1024 / arg0] >> 1;
		return (arg2 * local23 >> 16) + (arg1 * (65536 - local23) >> 16);
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(III)V")
	public static void method209(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(6) long local6 = (long) ((arg0 << 16) + arg1);
		@Pc(16) Class2_Sub1_Sub12 local16 = (Class2_Sub1_Sub12) Static121.aClass77_14.method2034(local6);
		if (local16 != null) {
			Static72.aClass56_1.method1587(local16);
		}
	}
}
