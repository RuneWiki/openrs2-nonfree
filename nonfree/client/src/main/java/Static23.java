import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static23 {

	@OriginalMember(owner = "client!bm", name = "l", descriptor = "F")
	public static float aFloat4;

	@OriginalMember(owner = "client!bm", name = "o", descriptor = "I")
	public static int anInt440;

	@OriginalMember(owner = "client!bm", name = "u", descriptor = "S")
	public static short aShort1 = 1;

	@OriginalMember(owner = "client!bm", name = "b", descriptor = "(II)Z")
	public static boolean method451(@OriginalArg(1) int arg0) {
		@Pc(3) Class182_Sub1 local3 = Static40.method720(arg0);
		if (local3 == null) {
			return false;
		} else if (Static181.anInt3691 == 1 || Static181.anInt3691 == 2 || Static210.anInt4148 == 2) {
			Static216.aString139 = local3.aString186;
			Static108.anInt2138 = local3.anInt5535;
			if (Static210.anInt4148 != 0) {
				Static61.anInt1208 = Static108.anInt2138 + 50000;
				Static286.anInt5441 = Static108.anInt2138 + 40000;
				Static27.anInt508 = Static286.anInt5441;
			}
			return true;
		} else {
			@Pc(49) String local49 = "";
			@Pc(51) String local51 = "";
			if (Static198.aString134 != null) {
				local51 = "/p=" + Static198.aString134;
			}
			if (Static210.anInt4148 != 0) {
				local49 = ":" + (local3.anInt5535 + 7000);
			}
			@Pc(123) String local123 = "http://" + local3.aString186 + local49 + "/l=" + Static117.anInt2307 + "/a=" + Static119.anInt5881 + local51 + "/j" + (Static213.aBoolean287 ? "1" : "0") + ",o" + (Static204.aBoolean278 ? "1" : "0") + ",a2,m" + (Static242.aBoolean347 ? "1" : "0");
			try {
				Static265.aClient1.getAppletContext().showDocument(new URL(local123), "_self");
				return true;
			} catch (@Pc(133) Exception local133) {
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(I)V")
	public static void method453() {
		Static130.aClass169_72.method4014();
	}
}
