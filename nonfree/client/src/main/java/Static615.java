import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static615 {

	@OriginalMember(owner = "client!te", name = "V", descriptor = "I")
	public static int anInt9306;

	@OriginalMember(owner = "client!te", name = "b", descriptor = "(I)I")
	public static int method7885() {
		return Static233.anInt3759;
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(ILjava/lang/String;B)Z")
	public static boolean method7906(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		if (Static122.aClass47_1.aBoolean105) {
			Static226.aClass43_3 = new Class43();
			Static226.aClass43_3.anInt1402 = arg0;
			Static226.aClass43_3.aString20 = arg1;
			if (Static416.aClass379_6 != Static286.aClass379_8) {
				Static226.aClass43_3.anInt1400 = Static226.aClass43_3.anInt1402 + 40000;
				Static226.aClass43_3.anInt1404 = Static226.aClass43_3.anInt1402 + 50000;
			}
			for (@Pc(47) int local47 = 0; local47 < Static85.aClass238_Sub1Array1.length; local47++) {
				if (arg0 == Static85.aClass238_Sub1Array1[local47].anInt6079) {
					Static297.anInt4549 = Static85.aClass238_Sub1Array1[local47].anInt6068;
				}
			}
			return true;
		}
		@Pc(77) String local77 = "";
		if (Static286.aClass379_8 != Static416.aClass379_6) {
			local77 = ":" + (arg0 + 7000);
		}
		@Pc(92) String local92 = "";
		if (Static65.aString113 != null) {
			local92 = "/p=" + Static65.aString113;
		}
		@Pc(156) String local156 = "http://" + arg1 + local77 + "/l=" + Static456.anInt7118 + "/a=" + Static281.anInt4321 + local92 + "/j" + (Static304.aBoolean320 ? "1" : "0") + ",o" + (Static632.aBoolean654 ? "1" : "0") + ",a2";
		try {
			Static459.aClient1.getAppletContext().showDocument(new URL(local156), "_self");
			return true;
		} catch (@Pc(168) Exception local168) {
			return false;
		}
	}

	@OriginalMember(owner = "client!te", name = "c", descriptor = "(II)[I")
	public static int[] method7919(@OriginalArg(1) int arg0) {
		Static464.method8626(Static96.method9132(arg0));
		return new int[] { Static280.aCalendar3.get(5), Static280.aCalendar3.get(2), Static280.aCalendar3.get(1) };
	}
}
