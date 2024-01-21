import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static29 {

	@OriginalMember(owner = "client!cj", name = "C", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray2;

	@OriginalMember(owner = "client!cj", name = "E", descriptor = "Lclient!eh;")
	public static Class28 aClass28_38;

	@OriginalMember(owner = "client!cj", name = "F", descriptor = "Lclient!qe;")
	public static Class83 aClass83_220;

	@OriginalMember(owner = "client!cj", name = "G", descriptor = "Lclient!qe;")
	private static final Class83 aClass83_221 = Static181.method2795("Username: ");

	@OriginalMember(owner = "client!cj", name = "w", descriptor = "Lclient!qe;")
	public static Class83 aClass83_216 = aClass83_221;

	@OriginalMember(owner = "client!cj", name = "A", descriptor = "Lclient!qe;")
	private static final Class83 aClass83_218 = Static181.method2795("Loading )2 please wait)3");

	@OriginalMember(owner = "client!cj", name = "y", descriptor = "Lclient!qe;")
	public static Class83 aClass83_217 = aClass83_218;

	@OriginalMember(owner = "client!cj", name = "D", descriptor = "Lclient!qe;")
	public static final Class83 aClass83_219 = Static181.method2795("Weiter");

	@OriginalMember(owner = "client!cj", name = "I", descriptor = "I")
	public static int anInt739 = 1;

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(Lclient!ae;I)Z")
	public static boolean method604(@OriginalArg(0) Class5 arg0) {
		if (Static60.aBoolean108) {
			if (Static138.method2242(arg0) != 0) {
				return false;
			}
			if (arg0.anInt130 == 0) {
				return false;
			}
		}
		return arg0.aBoolean19;
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(IIIILclient!rb;Lclient!rb;IIIIJ)V")
	public static void method606(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class24 arg4, @OriginalArg(5) Class24 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) long arg10) {
		if (arg4 == null) {
			return;
		}
		@Pc(6) Class79 local6 = new Class79();
		local6.aLong108 = arg10;
		local6.anInt3044 = arg1 * 128 + 64;
		local6.anInt3047 = arg2 * 128 + 64;
		local6.anInt3049 = arg3;
		local6.aClass24_6 = arg4;
		local6.aClass24_5 = arg5;
		local6.anInt3045 = arg6;
		local6.anInt3043 = arg7;
		local6.anInt3048 = arg8;
		local6.anInt3042 = arg9;
		for (@Pc(46) int local46 = arg0; local46 >= 0; local46--) {
			if (Static203.aClass2_Sub23ArrayArrayArray1[local46][arg1][arg2] == null) {
				Static203.aClass2_Sub23ArrayArrayArray1[local46][arg1][arg2] = new Class2_Sub23(local46, arg1, arg2);
			}
		}
		Static203.aClass2_Sub23ArrayArrayArray1[arg0][arg1][arg2].aClass79_1 = local6;
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(III)I")
	public static int method607(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(6) long local6 = (long) (arg1 + (arg0 << 16));
		return Static63.aClass2_Sub2_Sub15_3 != null && Static63.aClass2_Sub2_Sub15_3.aLong149 == local6 ? Static168.aClass2_Sub3_3.anInt340 * 99 / (Static168.aClass2_Sub3_3.aByteArray2.length - Static63.aClass2_Sub2_Sub15_3.aByte7) + 1 : 0;
	}
}
