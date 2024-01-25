import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static66 {

	@OriginalMember(owner = "client!ci", name = "f", descriptor = "I")
	public static int anInt1409;

	@OriginalMember(owner = "client!ci", name = "g", descriptor = "I")
	public static int anInt1410;

	@OriginalMember(owner = "client!ci", name = "i", descriptor = "Lclient!k;")
	public static final Class171 aClass171_2 = new Class171();

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(II)V")
	public static void method1483() {
		Static29.aClass112_5.method3637(5);
	}

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(ILclient!tn;)Lclient!eaa;")
	public static Class71_Sub2 method1484(@OriginalArg(1) Class3_Sub15 arg0) {
		return new Class71_Sub2(arg0.method8444(), arg0.method8444(), arg0.method8444(), arg0.method8444(), arg0.method8421(), arg0.method8401());
	}

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(I)I")
	public static int method1485() {
		return Static178.anInt4220 == 1 ? Static273.anInt5828 : Static448.anInt8136;
	}

	@OriginalMember(owner = "client!ci", name = "b", descriptor = "(II)Ljava/lang/String;")
	public static String method1486(@OriginalArg(0) int arg0) {
		@Pc(12) String local12 = Integer.toString(arg0);
		for (@Pc(17) int local17 = local12.length() - 3; local17 > 0; local17 -= 3) {
			local12 = local12.substring(0, local17) + "," + local12.substring(local17);
		}
		if (local12.length() > 9) {
			return " <col=00ff80>" + local12.substring(0, local12.length() - 8) + Static287.aClass176_33.method4986(Static380.anInt7247) + " (" + local12 + ")</col>";
		} else if (local12.length() > 6) {
			return " <col=ffffff>" + local12.substring(0, local12.length() - 4) + Static287.aClass176_35.method4986(Static380.anInt7247) + " (" + local12 + ")</col>";
		} else {
			return " <col=ffff00>" + local12 + "</col>";
		}
	}
}
