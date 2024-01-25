import java.awt.event.ActionEvent;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static57 {

	@OriginalMember(owner = "client!cg", name = "n", descriptor = "[Z")
	public static boolean[] aBooleanArray6;

	@OriginalMember(owner = "client!cg", name = "E", descriptor = "I")
	public static int anInt1228;

	@OriginalMember(owner = "client!cg", name = "t", descriptor = "Lclient!ig;")
	public static final Class133 aClass133_28 = new Class133(22, -2);

	@OriginalMember(owner = "client!cg", name = "u", descriptor = "I")
	public static int anInt1219 = 2;

	@OriginalMember(owner = "client!cg", name = "w", descriptor = "I")
	public static int anInt1221 = 0;

	@OriginalMember(owner = "client!cg", name = "B", descriptor = "[C")
	public static final char[] aCharArray3 = new char[] { ' ', ' ', '_', '-', 'à', 'á', 'â', 'ä', 'ã', 'À', 'Á', 'Â', 'Ä', 'Ã', 'è', 'é', 'ê', 'ë', 'È', 'É', 'Ê', 'Ë', 'í', 'î', 'ï', 'Í', 'Î', 'Ï', 'ò', 'ó', 'ô', 'ö', 'õ', 'Ò', 'Ó', 'Ô', 'Ö', 'Õ', 'ù', 'ú', 'û', 'ü', 'Ù', 'Ú', 'Û', 'Ü', 'ç', 'Ç', 'ÿ', 'Ÿ', 'ñ', 'Ñ', 'ß' };

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(I)V")
	public static void method1160() {
		Static68.aClass233_2.method5909();
		Static236.aClass58_3.method1558();
		Static299.aClass69_2.method2056();
		Static454.aClass298_3.method7191();
		Static345.aClass154_1.method4163();
		Static99.aClass96_7.method2507();
		Static46.aClass247_1.method6035();
		Static17.aClass231_2.method5900();
		Static231.aClass280_1.method6917();
		Static98.aClass309_1.method7401();
		Static546.aClass132_1.method3750();
		Static531.aClass135_4.method3802();
		Static241.aClass198_15.method5098();
		Static37.aClass121_1.method3428();
		Static174.aClass282_1.method6985();
		Static443.aClass72_1.method2112();
		Static144.aClass274_1.method6827();
		Static92.aClass316_1.method7631();
		Static25.aClass88_1.method2309();
		Static339.aClass318_3.method7669();
		Static37.method898();
		Static356.method5585();
		Static250.method4295();
		Static511.method7318();
		Static70.aClass125_5.method3522(5);
		Static104.aClass125_15.method3522(5);
		Static400.aClass125_49.method3522(5);
		Static301.aClass125_40.method3522(5);
		Static60.aClass125_7.method3522(5);
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(Lclient!tq;Ljava/lang/Object;I)V")
	public static void method1161(@OriginalArg(0) Class285 arg0, @OriginalArg(1) Object arg1) {
		if (arg0.anEventQueue1 == null) {
			return;
		}
		for (@Pc(11) int local11 = 0; local11 < 50 && arg0.anEventQueue1.peekEvent() != null; local11++) {
			Static327.method5231(1L);
		}
		if (arg1 != null) {
			arg0.anEventQueue1.postEvent(new ActionEvent(arg1, 1001, "dummy"));
		}
	}
}
