import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static121 {

	@OriginalMember(owner = "client!og", name = "e", descriptor = "I")
	public static int anInt2515;

	@OriginalMember(owner = "client!og", name = "k", descriptor = "[Lclient!kf;")
	public static Class2_Sub2_Sub2_Sub3[] aClass2_Sub2_Sub2_Sub3Array6;

	@OriginalMember(owner = "client!og", name = "n", descriptor = "Lclient!bg;")
	public static Class11 aClass11_97;

	@OriginalMember(owner = "client!og", name = "a", descriptor = "Lclient!lf;")
	public static Class49 aClass49_1163 = Static32.method683("scape main");

	@OriginalMember(owner = "client!og", name = "b", descriptor = "Lclient!lf;")
	private static Class49 aClass49_1164 = Static32.method683("Please wait)3)3)3");

	@OriginalMember(owner = "client!og", name = "c", descriptor = "[Lclient!ef;")
	public static Class23[] aClass23Array1 = new Class23[50];

	@OriginalMember(owner = "client!og", name = "h", descriptor = "Lclient!lf;")
	private static Class49 aClass49_1166 = Static32.method683("Click to switch");

	@OriginalMember(owner = "client!og", name = "g", descriptor = "Lclient!lf;")
	public static Class49 aClass49_1165 = aClass49_1166;

	@OriginalMember(owner = "client!og", name = "i", descriptor = "Lclient!lf;")
	public static Class49 aClass49_1167 = aClass49_1164;

	@OriginalMember(owner = "client!og", name = "j", descriptor = "Lclient!lf;")
	public static Class49 aClass49_1168 = Static32.method683("sch-Utteln:");

	@OriginalMember(owner = "client!og", name = "p", descriptor = "Lclient!lf;")
	private static Class49 aClass49_1172 = Static32.method683("yellow:");

	@OriginalMember(owner = "client!og", name = "l", descriptor = "Lclient!lf;")
	public static Class49 aClass49_1169 = aClass49_1172;

	@OriginalMember(owner = "client!og", name = "m", descriptor = "Lclient!lf;")
	public static Class49 aClass49_1170 = Static32.method683("rect_debug=");

	@OriginalMember(owner = "client!og", name = "o", descriptor = "Lclient!lf;")
	public static Class49 aClass49_1171 = Static32.method683("(U0a )2 via: ");

	@OriginalMember(owner = "client!og", name = "q", descriptor = "Lclient!lf;")
	public static Class49 aClass49_1173 = aClass49_1172;

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(IZIII)V")
	public static void method2047(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(3) int local3 = arg3; local3 <= arg2 + arg3; local3++) {
			for (@Pc(7) int local7 = arg0; local7 <= arg0 + arg1; local7++) {
				if (local7 >= 0 && local7 < 104 && local3 >= 0 && local3 < 104) {
					Static180.aByteArrayArrayArray9[0][local7][local3] = 127;
					if (local7 == arg0 && local7 > 0) {
						Static162.anIntArrayArrayArray7[0][local7][local3] = Static162.anIntArrayArrayArray7[0][local7 - 1][local3];
					}
					if (local7 == arg0 + arg1 && local7 < 103) {
						Static162.anIntArrayArrayArray7[0][local7][local3] = Static162.anIntArrayArrayArray7[0][local7 + 1][local3];
					}
					if (arg3 == local3 && local3 > 0) {
						Static162.anIntArrayArrayArray7[0][local7][local3] = Static162.anIntArrayArrayArray7[0][local7][local3 - 1];
					}
					if (arg2 + arg3 == local3 && local3 < 103) {
						Static162.anIntArrayArrayArray7[0][local7][local3] = Static162.anIntArrayArrayArray7[0][local7][local3 + 1];
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(I)V")
	public static void method2048() {
		aClass49_1171 = null;
		aClass2_Sub2_Sub2_Sub3Array6 = null;
		aClass49_1167 = null;
		aClass49_1166 = null;
		aClass23Array1 = null;
		aClass49_1170 = null;
		aClass49_1163 = null;
		aClass49_1172 = null;
		aClass49_1165 = null;
		aClass49_1173 = null;
		aClass11_97 = null;
		aClass49_1168 = null;
		aClass49_1169 = null;
		aClass49_1164 = null;
	}
}
