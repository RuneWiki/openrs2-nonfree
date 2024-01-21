import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static121 {

	@OriginalMember(owner = "client!wc", name = "Rb", descriptor = "Lclient!ge;")
	public static Class29_Sub1 aClass29_Sub1_38;

	@OriginalMember(owner = "client!wc", name = "ec", descriptor = "Lclient!nc;")
	public static Class4 aClass4_3;

	@OriginalMember(owner = "client!wc", name = "Dc", descriptor = "[I")
	public static int[] anIntArray353;

	@OriginalMember(owner = "client!wc", name = "fc", descriptor = "Lclient!mb;")
	private static Class45 aClass45_1015 = Static63.method1251("Loaded interfaces");

	@OriginalMember(owner = "client!wc", name = "tb", descriptor = "Lclient!mb;")
	public static Class45 aClass45_1011 = aClass45_1015;

	@OriginalMember(owner = "client!wc", name = "yb", descriptor = "Lclient!mb;")
	public static Class45 aClass45_1012 = Static63.method1251("mapedge");

	@OriginalMember(owner = "client!wc", name = "zb", descriptor = "Lclient!sa;")
	public static Class67 aClass67_19 = new Class67(64);

	@OriginalMember(owner = "client!wc", name = "Cb", descriptor = "I")
	public static int anInt2385 = 0;

	@OriginalMember(owner = "client!wc", name = "Ib", descriptor = "Lclient!mb;")
	public static Class45 aClass45_1013 = Static63.method1251("Anmelde)2Limit -Uberschritten)3");

	@OriginalMember(owner = "client!wc", name = "Sb", descriptor = "I")
	public static int anInt2398 = 0;

	@OriginalMember(owner = "client!wc", name = "ic", descriptor = "Lclient!mb;")
	public static Class45 aClass45_1016 = Static63.method1251("Spiel)2Engine wird gestartet)3)3)3");

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(IIII)V")
	public static void method1615(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7;
		for (@Pc(3) int local3 = 0; local3 < 8; local3++) {
			for (local7 = 0; local7 < 8; local7++) {
				Static40.anIntArrayArrayArray2[arg1][arg0 + local3][arg2 + local7] = 0;
			}
		}
		if (arg0 > 0) {
			for (local7 = 1; local7 < 8; local7++) {
				Static40.anIntArrayArrayArray2[arg1][arg0][local7 + arg2] = Static40.anIntArrayArrayArray2[arg1][arg0 - 1][arg2 + local7];
			}
		}
		if (arg2 > 0) {
			for (local7 = 1; local7 < 8; local7++) {
				Static40.anIntArrayArrayArray2[arg1][arg0 + local7][arg2] = Static40.anIntArrayArrayArray2[arg1][arg0 + local7][arg2 - 1];
			}
		}
		if (arg0 > 0 && Static40.anIntArrayArrayArray2[arg1][arg0 - 1][arg2] != 0) {
			Static40.anIntArrayArrayArray2[arg1][arg0][arg2] = Static40.anIntArrayArrayArray2[arg1][arg0 - 1][arg2];
		} else if (arg2 > 0 && Static40.anIntArrayArrayArray2[arg1][arg0][arg2 - 1] != 0) {
			Static40.anIntArrayArrayArray2[arg1][arg0][arg2] = Static40.anIntArrayArrayArray2[arg1][arg0][arg2 - 1];
		} else if (arg0 > 0 && arg2 > 0 && Static40.anIntArrayArrayArray2[arg1][arg0 - 1][arg2 - 1] != 0) {
			Static40.anIntArrayArrayArray2[arg1][arg0][arg2] = Static40.anIntArrayArrayArray2[arg1][arg0 - 1][arg2 - 1];
		}
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(ILclient!mb;ILclient!sd;Lclient!mb;IZ)V")
	public static void method1617(@OriginalArg(1) Class45 arg0, @OriginalArg(3) Class29 arg1, @OriginalArg(4) Class45 arg2) {
		@Pc(15) int local15 = arg1.method746(arg0);
		@Pc(21) int local21 = arg1.method753(arg2, local15);
		Static59.method1212(arg1, local15, 255, local21);
	}

	@OriginalMember(owner = "client!wc", name = "e", descriptor = "(Z)V")
	public static void method1618() {
		Static67.aClass67_15.method1819();
		Static79.aClass67_18.method1819();
		Static72.aClass67_17.method1819();
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(IIIB)I")
	public static int method1620(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if ((Static48.aByteArrayArrayArray3[arg1][arg2][arg0] & 0x8) == 0) {
			return arg1 <= 0 || (Static48.aByteArrayArrayArray3[1][arg2][arg0] & 0x2) == 0 ? arg1 : arg1 - 1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!wc", name = "i", descriptor = "(I)V")
	public static void method1623() {
		aClass67_19 = null;
		aClass45_1011 = null;
		aClass45_1015 = null;
		aClass29_Sub1_38 = null;
		aClass4_3 = null;
		anIntArray353 = null;
		aClass45_1013 = null;
		aClass45_1012 = null;
		aClass45_1016 = null;
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(ILjava/awt/Component;)V")
	public static void method1624(@OriginalArg(1) Component arg0) {
		arg0.removeMouseListener(Static71.aClass63_1);
		arg0.removeMouseMotionListener(Static71.aClass63_1);
		arg0.removeFocusListener(Static71.aClass63_1);
	}
}
