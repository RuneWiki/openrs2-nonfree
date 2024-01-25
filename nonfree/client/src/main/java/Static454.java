import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static454 {

	@OriginalMember(owner = "client!sv", name = "t", descriptor = "Lclient!up;")
	public static Class298 aClass298_3;

	@OriginalMember(owner = "client!sv", name = "p", descriptor = "Lclient!ea;")
	public static final Class67 aClass67_135 = new Class67(" is already on your ignore list.", " steht bereits auf deiner Ignorieren-Liste!", " est déjà dans votre liste noire.", " já está na sua lista de ignorados.");

	@OriginalMember(owner = "client!sv", name = "r", descriptor = "Lclient!ea;")
	public static final Class67 aClass67_136 = new Class67("Loading SW3D - ", "Lade SW3D - ", "Chargement SW3D - ", "Carregando SW3D - ");

	@OriginalMember(owner = "client!sv", name = "a", descriptor = "(Lclient!qn;I)Z")
	public static boolean method6836(@OriginalArg(0) Interface15 arg0) {
		@Pc(10) Class242 local10 = aClass298_3.method7185(arg0.method7758());
		if (local10.anInt7188 == -1) {
			return true;
		} else {
			@Pc(27) Class32 local27 = Static241.aClass198_15.method5094(local10.anInt7188);
			return local27.anInt957 == -1 ? true : local27.method893();
		}
	}

	@OriginalMember(owner = "client!sv", name = "a", descriptor = "(BLjava/lang/String;)I")
	public static int method6837(@OriginalArg(1) String arg0) {
		return Static53.method1120(10, arg0);
	}

	@OriginalMember(owner = "client!sv", name = "a", descriptor = "(ILclient!fm;I)V")
	public static void method6838(@OriginalArg(0) int arg0, @OriginalArg(1) Class92 arg1) {
		if (Static347.aBoolean419) {
			arg0 = 0;
			Static347.aBoolean419 = false;
		}
		if (Static219.aClass92_1 != null && Static219.aClass92_1.method2459(arg1)) {
			return;
		}
		Static219.aClass92_1 = arg1;
		Static232.aLong129 = Static12.method647();
		Static227.anInt4885 = arg0;
		Static395.anInt7319 = arg0;
		if (Static395.anInt7319 != 0) {
			Static399.aFloat209 = Static92.aFloat67;
			Static549.aClass66_4 = Static401.aClass66_3;
			Static69.aFloat52 = Static40.aFloat41;
			Static535.aFloat267 = Static403.aFloat211;
			Static106.anInt2363 = Static293.anInt8472;
			Static16.anInt656 = Static477.anInt8634;
			Static255.aFloat159 = Static241.aFloat261;
			Static453.anInt8232 = Static309.anInt108;
			Static61.aFloat47 = Static159.aFloat130;
			Static312.aFloat175 = Static456.aFloat260;
			return;
		}
		Static24.method779();
	}
}
