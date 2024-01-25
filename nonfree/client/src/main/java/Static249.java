import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static249 {

	@OriginalMember(owner = "client!jn", name = "c", descriptor = "Z")
	public static boolean aBoolean342 = false;

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(BILjava/lang/String;)Z")
	public static boolean method3697(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1) {
		if (Static362.aClass109_5.aBoolean206) {
			Static382.aClass227_2 = new Class227();
			Static382.aClass227_2.anInt5547 = arg0;
			Static382.aClass227_2.aString53 = arg1;
			if (Static199.aClass308_3 != Static357.aClass308_6) {
				Static382.aClass227_2.anInt5548 = Static382.aClass227_2.anInt5547 + 50000;
				Static382.aClass227_2.anInt5546 = Static382.aClass227_2.anInt5547 + 40000;
			}
			if (arg0 < Static436.aClass317_Sub1Array2.length && Static436.aClass317_Sub1Array2[arg0] != null) {
				Static200.anInt3986 = Static436.aClass317_Sub1Array2[arg0].anInt9102;
			}
			return true;
		}
		@Pc(61) String local61 = "";
		if (Static357.aClass308_6 != Static199.aClass308_3) {
			local61 = ":" + (arg0 + 7000);
		}
		@Pc(76) String local76 = "";
		if (Static499.aString36 != null) {
			local76 = "/p=" + Static499.aString36;
		}
		@Pc(124) String local124 = "http://" + arg1 + local61 + "/l=" + Static307.anInt5279 + "/a=" + Static47.anInt802 + local76 + "/j" + (Static566.aBoolean734 ? "1" : "0") + ",o" + (Static114.aBoolean166 ? "1" : "0") + ",a2";
		try {
			Static399.aClient1.getAppletContext().showDocument(new URL(local124), "_self");
			return true;
		} catch (@Pc(134) Exception local134) {
			return false;
		}
	}
}
