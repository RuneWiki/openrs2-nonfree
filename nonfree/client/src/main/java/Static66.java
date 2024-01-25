import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static66 {

	@OriginalMember(owner = "client!cd", name = "d", descriptor = "Lclient!ke;")
	public static final Class196 aClass196_49 = new Class196(54, -1);

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(BILjava/lang/String;)Z")
	public static boolean method953(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1) {
		if (Static150.aClass202_2.aBoolean384) {
			Static6.aClass365_1 = new Class365();
			Static6.aClass365_1.anInt9973 = arg0;
			Static6.aClass365_1.aString112 = arg1;
			if (Static99.aClass267_3 != Static71.aClass267_2) {
				Static6.aClass365_1.anInt9970 = Static6.aClass365_1.anInt9973 + 50000;
				Static6.aClass365_1.anInt9967 = Static6.aClass365_1.anInt9973 + 40000;
			}
			for (@Pc(34) int local34 = 0; local34 < Static475.aClass160_Sub1Array2.length; local34++) {
				if (arg0 == Static475.aClass160_Sub1Array2[local34].anInt3895) {
					Static276.anInt4337 = Static475.aClass160_Sub1Array2[local34].anInt3889;
				}
			}
			return true;
		}
		@Pc(55) String local55 = "";
		if (Static99.aClass267_3 != Static71.aClass267_2) {
			local55 = ":" + (arg0 + 7000);
		}
		@Pc(70) String local70 = "";
		if (Static471.aString82 != null) {
			local70 = "/p=" + Static471.aString82;
		}
		@Pc(118) String local118 = "http://" + arg1 + local55 + "/l=" + Static259.anInt4113 + "/a=" + Static312.anInt5547 + local70 + "/j" + (Static394.aBoolean491 ? "1" : "0") + ",o" + (Static240.aBoolean272 ? "1" : "0") + ",a2";
		try {
			Static437.aClient1.getAppletContext().showDocument(new URL(local118), "_self");
			return true;
		} catch (@Pc(128) Exception local128) {
			return false;
		}
	}
}
