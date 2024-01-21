import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static2 {

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "Lclient!ff;")
	public static Class3_Sub12 aClass3_Sub12_1;

	@OriginalMember(owner = "client!aa", name = "v", descriptor = "[I")
	public static int[] anIntArray2;

	@OriginalMember(owner = "client!aa", name = "j", descriptor = "[I")
	public static int[] anIntArray1 = new int[2048];

	@OriginalMember(owner = "client!aa", name = "k", descriptor = "Lclient!sd;")
	private static Class73 aClass73_1 = Static122.method531("Loaded input handler");

	@OriginalMember(owner = "client!aa", name = "n", descriptor = "Lclient!sd;")
	public static Class73 aClass73_2 = Static122.method531(":chalreq:");

	@OriginalMember(owner = "client!aa", name = "q", descriptor = "I")
	public static int anInt7 = 0;

	@OriginalMember(owner = "client!aa", name = "s", descriptor = "Lclient!sd;")
	public static Class73 aClass73_3 = aClass73_1;

	@OriginalMember(owner = "client!aa", name = "w", descriptor = "Lclient!sd;")
	public static Class73 aClass73_4 = Static122.method531(")1p");

	@OriginalMember(owner = "client!aa", name = "A", descriptor = "I")
	public static int anInt12 = 0;

	@OriginalMember(owner = "client!aa", name = "B", descriptor = "I")
	public static int anInt13 = 0;

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(IIIILclient!qa;I)V")
	public static void method11(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class3_Sub1_Sub15 arg3, @OriginalArg(5) int arg4) {
		@Pc(7) Class3_Sub3 local7 = new Class3_Sub3();
		local7.anInt242 = arg3.anInt3003 * 128;
		@Pc(16) int local16 = arg3.anInt3014;
		local7.anInt238 = arg0;
		local7.anInt234 = arg2 * 128;
		local7.anInt240 = arg3.anInt3036;
		@Pc(31) int local31 = arg3.anInt3012;
		local7.anIntArray11 = arg3.anIntArray315;
		local7.anInt241 = arg3.anInt3027;
		local7.anInt243 = arg1 * 128;
		local7.anInt233 = arg3.anInt3035;
		if (arg4 == 1 || arg4 == 3) {
			local31 = arg3.anInt3014;
			local16 = arg3.anInt3012;
		}
		local7.anInt236 = (local31 + arg1) * 128;
		local7.anInt231 = (local16 + arg2) * 128;
		if (arg3.anIntArray314 != null) {
			local7.aClass3_Sub1_Sub15_1 = arg3;
			local7.method156();
		}
		Static158.aClass72_48.method2404(local7);
		if (local7.anIntArray11 != null) {
			local7.anInt244 = (int) (Math.random() * (double) (local7.anInt241 - local7.anInt233)) + local7.anInt233;
		}
	}

	@OriginalMember(owner = "client!aa", name = "c", descriptor = "(B)V")
	public static void method14() {
		aClass73_4 = null;
		aClass3_Sub12_1 = null;
		anIntArray1 = null;
		anIntArray2 = null;
		aClass73_1 = null;
		aClass73_2 = null;
		aClass73_3 = null;
	}
}
