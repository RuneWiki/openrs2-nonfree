import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static170 {

	@OriginalMember(owner = "client!vd", name = "Mb", descriptor = "[[B")
	public static byte[][] aByteArrayArray11;

	@OriginalMember(owner = "client!vd", name = "Tb", descriptor = "[Lclient!kf;")
	public static Class3_Sub1_Sub3_Sub3[] aClass3_Sub1_Sub3_Sub3Array44;

	@OriginalMember(owner = "client!vd", name = "Xb", descriptor = "Lclient!kf;")
	public static Class3_Sub1_Sub3_Sub3 aClass3_Sub1_Sub3_Sub3_15;

	@OriginalMember(owner = "client!vd", name = "t", descriptor = "Lclient!sd;")
	private static Class73 aClass73_1982 = Static122.method531("Bad session id)3");

	@OriginalMember(owner = "client!vd", name = "D", descriptor = "Lclient!sd;")
	public static Class73 aClass73_1984 = aClass73_1982;

	@OriginalMember(owner = "client!vd", name = "L", descriptor = "I")
	public static int anInt3687 = 0;

	@OriginalMember(owner = "client!vd", name = "O", descriptor = "Lclient!sd;")
	public static Class73 aClass73_1985 = Static122.method531("Update)2Liste geladen)3");

	@OriginalMember(owner = "client!vd", name = "wc", descriptor = "Lclient!sd;")
	private static Class73 aClass73_1993 = Static122.method531("Password: ");

	@OriginalMember(owner = "client!vd", name = "pb", descriptor = "Lclient!sd;")
	public static Class73 aClass73_1987 = aClass73_1993;

	@OriginalMember(owner = "client!vd", name = "Ab", descriptor = "I")
	public static int anInt3710 = 0;

	@OriginalMember(owner = "client!vd", name = "hc", descriptor = "Lclient!sd;")
	public static Class73 aClass73_1991 = Static122.method531("Stufe)2");

	@OriginalMember(owner = "client!vd", name = "oc", descriptor = "I")
	public static int anInt3730 = 0;

	@OriginalMember(owner = "client!vd", name = "qc", descriptor = "Lclient!sd;")
	public static Class73 aClass73_1992 = Static122.method531("Bitte warten Sie )2 es wird versucht)1 die Verbindung wiederherzustellen)3");

	@OriginalMember(owner = "client!vd", name = "Pc", descriptor = "I")
	public static int anInt3744 = 2;

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(III)I")
	public static int method2649(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(15) long local15 = (long) (arg0 + (arg1 << 16));
		return Static132.aClass3_Sub1_Sub11_1 != null && Static132.aClass3_Sub1_Sub11_1.aLong183 == local15 ? Static54.aClass3_Sub12_5.anInt1793 * 99 / (Static54.aClass3_Sub12_5.aByteArray16.length - Static132.aClass3_Sub1_Sub11_1.aByte3) + 1 : 0;
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(B)V")
	public static void method2657() {
		aClass73_1992 = null;
		aClass3_Sub1_Sub3_Sub3_15 = null;
		aClass73_1987 = null;
		aClass73_1984 = null;
		aClass73_1991 = null;
		aClass73_1982 = null;
		aClass73_1993 = null;
		aClass73_1985 = null;
		aClass3_Sub1_Sub3_Sub3Array44 = null;
		aByteArrayArray11 = null;
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(IIII[Lclient!pf;I[B)V")
	public static void method2658(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class60[] arg4, @OriginalArg(6) byte[] arg5) {
		@Pc(15) int local15;
		for (@Pc(7) int local7 = 0; local7 < 4; local7++) {
			for (@Pc(11) int local11 = 0; local11 < 64; local11++) {
				for (local15 = 0; local15 < 64; local15++) {
					if (local11 + arg1 > 0 && arg1 + local11 < 103 && local15 + arg2 > 0 && local15 + arg2 < 103) {
						arg4[local7].anIntArrayArray34[local11 + arg1][arg2 + local15] &= 0xFEFFFFFF;
					}
				}
			}
		}
		@Pc(93) Class3_Sub12 local93 = new Class3_Sub12(arg5);
		for (local15 = 0; local15 < 4; local15++) {
			for (@Pc(99) int local99 = 0; local99 < 64; local99++) {
				for (@Pc(103) int local103 = 0; local103 < 64; local103++) {
					Static101.method1772(arg0, 0, arg3, local93, arg2 + local103, arg1 + local99, local15);
				}
			}
		}
	}
}
