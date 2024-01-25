import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static567 {

	@OriginalMember(owner = "client!ud", name = "j", descriptor = "Lclient!uu;")
	public static Class343 aClass343_251;

	@OriginalMember(owner = "client!ud", name = "m", descriptor = "[[[Lclient!ve;")
	public static Class351[][][] aClass351ArrayArrayArray4;

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(IILjava/lang/String;)Z")
	public static boolean method8021(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1) {
		if (Static48.aClass298_12.aBoolean613) {
			Static28.aClass157_1 = new Class157();
			Static28.aClass157_1.aString34 = arg1;
			Static28.aClass157_1.anInt4641 = arg0;
			if (Static508.aClass220_11 != Static38.aClass220_2) {
				Static28.aClass157_1.anInt4643 = Static28.aClass157_1.anInt4641 + 40000;
				Static28.aClass157_1.anInt4640 = Static28.aClass157_1.anInt4641 + 50000;
			}
			for (@Pc(36) int local36 = 0; local36 < Static456.aClass354_Sub1Array2.length; local36++) {
				if (Static456.aClass354_Sub1Array2[local36].anInt9773 == arg0) {
					Static237.anInt4731 = Static456.aClass354_Sub1Array2[local36].anInt9771;
				}
			}
			return true;
		}
		@Pc(66) String local66 = "";
		if (Static38.aClass220_2 != Static508.aClass220_11) {
			local66 = ":" + (arg0 + 7000);
		}
		@Pc(81) String local81 = "";
		if (Static587.aString90 != null) {
			local81 = "/p=" + Static587.aString90;
		}
		@Pc(129) String local129 = "http://" + arg1 + local66 + "/l=" + Static455.anInt7738 + "/a=" + Static541.anInt9077 + local81 + "/j" + (Static543.aBoolean676 ? "1" : "0") + ",o" + (Static332.aBoolean460 ? "1" : "0") + ",a2";
		try {
			Static554.aClient1.getAppletContext().showDocument(new URL(local129), "_self");
			return true;
		} catch (@Pc(144) Exception local144) {
			return false;
		}
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(II)V")
	public static void method8022(@OriginalArg(1) int arg0) {
		Static415.method6435();
		@Pc(13) int local13 = Static580.aClass186_1.method4744(arg0).anInt242;
		if (local13 == 0) {
			return;
		}
		@Pc(24) int local24 = Static183.aClass285_1.anIntArray490[arg0];
		if (local13 == 5) {
			Static646.anInt4678 = local24;
		}
		if (local13 == 6) {
			Static291.anInt5619 = local24;
		}
	}
}
