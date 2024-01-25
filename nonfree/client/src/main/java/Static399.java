import java.applet.Applet;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static399 {

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "Ljava/applet/Applet;")
	public static Applet anApplet2;

	@OriginalMember(owner = "client!ni", name = "c", descriptor = "Lclient!qa;")
	public static Class109 aClass109_6;

	@OriginalMember(owner = "client!ni", name = "d", descriptor = "Lclient!mv;")
	public static final Class241 aClass241_87 = new Class241(76, 3);

	@OriginalMember(owner = "client!ni", name = "b", descriptor = "Lclient!tka;")
	public static final Class344 aClass344_3 = new Class344();

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(ILclient!kn;I)V")
	public static void method6105(@OriginalArg(0) int arg0, @OriginalArg(1) Class212 arg1) {
		if (Static74.anInt1034 >= 50 || (arg1 == null || arg1.anIntArrayArray31 == null || arg1.anIntArrayArray31.length <= arg0 || arg1.anIntArrayArray31[arg0] == null)) {
			return;
		}
		@Pc(44) int local44 = arg1.anIntArrayArray31[arg0][0];
		@Pc(48) int local48 = local44 >> 8;
		@Pc(67) int local67;
		if (arg1.anIntArrayArray31[arg0].length > 1) {
			local67 = (int) ((double) arg1.anIntArrayArray31[arg0].length * Math.random());
			if (local67 > 0) {
				local48 = arg1.anIntArrayArray31[arg0][local67];
			}
		}
		@Pc(85) int local85 = local44 >> 5 & 0x7;
		local67 = 256;
		if (arg1.anIntArray321 != null && arg1.anIntArray320 != null) {
			local67 = Static319.method5021(arg1.anIntArray321[arg0], arg1.anIntArray320[arg0]);
		}
		if (arg1.aBoolean415) {
			Static503.method7340(0, false, local48, local85, local67, 255);
		} else {
			Static241.method4231(local67, local48, 255, 0, local85);
		}
	}

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(I)V")
	public static void method6106() {
		Static15.aClass230Array1 = new Class230[500];
		Static318.anInt5491 = 0;
		Static91.aClass230Array2 = new Class230[2000];
		Static373.anInt6284 = 0;
		Static581.anInt9272 = Static234.anInt4537;
		Static329.aClass230Array4 = new Class230[1000];
		Static52.anIntArrayArrayArray11 = new int[Static66.anInt802][Static230.anInt4470 + 1][Static63.anInt777 + 1];
		Static141.anInt8738 = 0;
		Static370.aBoolean273 = false;
		Static567.anInt9140 = Static234.anInt4537;
		Static322.aClass230Array3 = new Class230[500];
		Static496.anInt8367 = 0;
		if (Static277.aClass75_7 instanceof oa) {
			Static519.aBoolean664 = false;
		} else {
			Static519.aBoolean664 = true;
		}
	}

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(BCLjava/lang/String;)I")
	public static int method6107(@OriginalArg(1) char arg0, @OriginalArg(2) String arg1) {
		@Pc(7) int local7 = 0;
		@Pc(16) int local16 = arg1.length();
		for (@Pc(18) int local18 = 0; local18 < local16; local18++) {
			if (arg1.charAt(local18) == arg0) {
				local7++;
			}
		}
		return local7;
	}
}
