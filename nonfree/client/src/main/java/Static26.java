import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static26 {

	@OriginalMember(owner = "client!eb", name = "v", descriptor = "[Lclient!ie;")
	public static Class4_Sub4_Sub5_Sub2[] aClass4_Sub4_Sub5_Sub2Array5;

	@OriginalMember(owner = "client!eb", name = "t", descriptor = "Lclient!v;")
	private static Class76 aClass76_229 = Static134.method2017("Please wait 1 minute and try again)3");

	@OriginalMember(owner = "client!eb", name = "h", descriptor = "Lclient!v;")
	public static Class76 aClass76_227 = aClass76_229;

	@OriginalMember(owner = "client!eb", name = "i", descriptor = "[I")
	public static int[] anIntArray83 = new int[500];

	@OriginalMember(owner = "client!eb", name = "k", descriptor = "Lclient!ua;")
	public static Class72 aClass72_10 = new Class72(64);

	@OriginalMember(owner = "client!eb", name = "p", descriptor = "I")
	public static int anInt573 = 0;

	@OriginalMember(owner = "client!eb", name = "s", descriptor = "Lclient!v;")
	public static Class76 aClass76_228 = aClass76_229;

	@OriginalMember(owner = "client!eb", name = "w", descriptor = "[[B")
	public static byte[][] aByteArrayArray1 = new byte[50][];

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(ZII)I")
	public static int method372(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(39) int local39 = method375(arg1 + 45365, 4, arg0 + 91923) + (method375(arg1 + 10294, 2, arg0 + 37821) - 128 >> 1) + (method375(arg1, 1, arg0) - 128 >> 2) - 128;
		local39 = (int) ((double) local39 * 0.3D) + 35;
		if (local39 < 10) {
			local39 = 10;
		} else if (local39 > 60) {
			local39 = 60;
		}
		return local39;
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(II)Z")
	public static boolean method373(@OriginalArg(1) int arg0) {
		return (arg0 >> 28 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(I)V")
	public static void method374() {
		aByteArrayArray1 = null;
		aClass72_10 = null;
		aClass76_229 = null;
		anIntArray83 = null;
		aClass76_228 = null;
		aClass4_Sub4_Sub5_Sub2Array5 = null;
		aClass76_227 = null;
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(IBII)I")
	private static int method375(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(12) int local12 = arg0 / arg1;
		@Pc(18) int local18 = arg0 & arg1 - 1;
		@Pc(22) int local22 = arg2 / arg1;
		@Pc(27) int local27 = Static33.method612(local12, local22);
		@Pc(33) int local33 = arg2 & arg1 - 1;
		@Pc(40) int local40 = Static33.method612(local12 + 1, local22);
		@Pc(47) int local47 = Static33.method612(local12, local22 + 1);
		@Pc(56) int local56 = Static33.method612(local12 + 1, local22 + 1);
		@Pc(63) int local63 = Static60.method1030(local40, local27, local18, arg1);
		@Pc(72) int local72 = Static60.method1030(local56, local47, local18, arg1);
		return Static60.method1030(local72, local63, local33, arg1);
	}
}
