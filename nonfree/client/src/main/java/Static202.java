import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static202 {

	@OriginalMember(owner = "client!jp", name = "q", descriptor = "[Lclient!o;")
	public static Class41[] aClass41Array4;

	@OriginalMember(owner = "client!jp", name = "z", descriptor = "[I")
	public static int[] anIntArray289;

	@OriginalMember(owner = "client!jp", name = "c", descriptor = "Lclient!qu;")
	public static final Class208 aClass208_55 = new Class208(31, 3);

	@OriginalMember(owner = "client!jp", name = "B", descriptor = "[I")
	public static int[] anIntArray290 = new int[2];

	@OriginalMember(owner = "client!jp", name = "D", descriptor = "S")
	public static short aShort42 = 1;

	@OriginalMember(owner = "client!jp", name = "F", descriptor = "Lclient!tq;")
	public static final Class2_Sub17_Sub1 aClass2_Sub17_Sub1_1 = new Class2_Sub17_Sub1(5000);

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "(IZZ)V")
	public static void method2831(@OriginalArg(1) boolean arg0, @OriginalArg(2) boolean arg1) {
		if (arg1) {
			Static124.anInt2080++;
			Static354.method4962();
		}
		if (arg0) {
			Static433.anInt7313++;
			Static407.method5650();
		}
	}

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "(I)V")
	public static void method2832() {
		if (Static411.aClass136_7 == null) {
			return;
		}
		if (Static411.aClass136_7.anInt3418 == 1) {
			Static411.aClass136_7 = null;
			return;
		}
		if (Static411.aClass136_7.anInt3418 == 2) {
			Static232.method3158(Static261.aString40, 2, Static115.aClass194_1);
			Static411.aClass136_7 = null;
			return;
		}
	}

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "(JIZZLjava/lang/String;IILjava/lang/String;III)V")
	public static void method2833(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) String arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) String arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		if (!Static45.aBoolean34 && Static377.anInt6585 < 500) {
			@Pc(19) int local19 = arg9 == -1 ? Static236.anInt3995 : arg9;
			@Pc(33) Class2_Sub35 local33 = new Class2_Sub35(arg7, arg4, local19, arg8, arg5, arg0, arg6, arg1, arg2, arg3);
			Static93.aClass181_7.method3973(local33);
			Static377.anInt6585++;
		}
	}

	@OriginalMember(owner = "client!jp", name = "c", descriptor = "(I)V")
	public static void method2839() {
		if (Static307.aString52.toLowerCase().indexOf("microsoft") != -1) {
			Static215.anIntArray339[221] = 43;
			Static215.anIntArray339[188] = 71;
			Static215.anIntArray339[189] = 26;
			Static215.anIntArray339[220] = 74;
			Static215.anIntArray339[192] = 58;
			Static215.anIntArray339[222] = 59;
			Static215.anIntArray339[219] = 42;
			Static215.anIntArray339[223] = 28;
			Static215.anIntArray339[191] = 73;
			Static215.anIntArray339[187] = 27;
			Static215.anIntArray339[186] = 57;
			Static215.anIntArray339[190] = 72;
			return;
		}
		Static215.anIntArray339[47] = 73;
		Static215.anIntArray339[44] = 71;
		Static215.anIntArray339[91] = 42;
		Static215.anIntArray339[46] = 72;
		Static215.anIntArray339[45] = 26;
		Static215.anIntArray339[92] = 74;
		Static215.anIntArray339[61] = 27;
		if (Static307.aMethod2 == null) {
			Static215.anIntArray339[192] = 58;
			Static215.anIntArray339[222] = 59;
		} else {
			Static215.anIntArray339[520] = 59;
			Static215.anIntArray339[222] = 58;
			Static215.anIntArray339[192] = 28;
		}
		Static215.anIntArray339[93] = 43;
		Static215.anIntArray339[59] = 57;
	}
}
