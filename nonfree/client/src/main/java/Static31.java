import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static31 {

	@OriginalMember(owner = "client!d", name = "k", descriptor = "I")
	public static int anInt701;

	@OriginalMember(owner = "client!d", name = "l", descriptor = "Lclient!ah;")
	public static Class3_Sub3_Sub2_Sub1 aClass3_Sub3_Sub2_Sub1_2;

	@OriginalMember(owner = "client!d", name = "y", descriptor = "[Lclient!qc;")
	public static Class3_Sub3_Sub2_Sub2[] aClass3_Sub3_Sub2_Sub2Array1;

	@OriginalMember(owner = "client!d", name = "b", descriptor = "[I")
	public static final int[] anIntArray36 = new int[] { 2, 0, 0, 2, 0, 0, 0, 4, 4 };

	@OriginalMember(owner = "client!d", name = "d", descriptor = "Lclient!oc;")
	public static final Class70 aClass70_310 = Static193.method3027("rect_debug=");

	@OriginalMember(owner = "client!d", name = "u", descriptor = "Lclient!oc;")
	private static final Class70 aClass70_312 = Static193.method3027("wishes to trade with you)3");

	@OriginalMember(owner = "client!d", name = "i", descriptor = "Lclient!oc;")
	public static Class70 aClass70_311 = aClass70_312;

	@OriginalMember(owner = "client!d", name = "A", descriptor = "Z")
	public static boolean aBoolean41 = false;

	@OriginalMember(owner = "client!d", name = "C", descriptor = "I")
	public static int anInt714 = 0;

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(IIIII)V")
	public static void method566(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1) {
		Static52.anInt1117 = arg1;
		Static200.anInt4074 = arg0;
		Static119.anInt2428 = 0;
		Static26.anInt554 = 0;
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(IIIILclient!m;Lclient!m;IIJ)V")
	public static void method567(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class26 arg4, @OriginalArg(5) Class26 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8) {
		if (arg4 == null && arg5 == null) {
			return;
		}
		@Pc(8) Class36 local8 = new Class36();
		local8.aLong37 = arg8;
		local8.anInt1309 = arg1 * 128 + 64;
		local8.anInt1304 = arg2 * 128 + 64;
		local8.anInt1306 = arg3;
		local8.aClass26_4 = arg4;
		local8.aClass26_5 = arg5;
		local8.anInt1305 = arg6;
		local8.anInt1311 = arg7;
		for (@Pc(42) int local42 = arg0; local42 >= 0; local42--) {
			if (Static118.aClass3_Sub6ArrayArrayArray1[local42][arg1][arg2] == null) {
				Static118.aClass3_Sub6ArrayArrayArray1[local42][arg1][arg2] = new Class3_Sub6(local42, arg1, arg2);
			}
		}
		Static118.aClass3_Sub6ArrayArrayArray1[arg0][arg1][arg2].aClass36_1 = local8;
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(ILclient!ke;)V")
	public static void method570(@OriginalArg(1) Class52 arg0) {
		Static170.aClass52_14 = arg0;
	}
}
