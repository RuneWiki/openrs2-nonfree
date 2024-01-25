import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static41 {

	@OriginalMember(owner = "client!cg", name = "p", descriptor = "Ljava/lang/String;")
	public static String aString27 = "Loaded world list data";

	@OriginalMember(owner = "client!cg", name = "v", descriptor = "Z")
	public static boolean aBoolean83 = true;

	@OriginalMember(owner = "client!cg", name = "d", descriptor = "(B)Lclient!kr;")
	public static Class111 method980() {
		try {
			return (Class111) Class.forName("Class111_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(14) Throwable local14) {
			return null;
		}
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(BI)Z")
	public static boolean method981(@OriginalArg(1) int arg0) {
		@Pc(7) Class74_Sub1 local7 = Static51.method4585(arg0);
		if (local7 == null) {
			return false;
		} else if (Static168.anInt3543 == 3) {
			@Pc(38) String local38 = "";
			if (Static123.anInt2380 != 0) {
				local38 = ":" + (local7.anInt2267 + 7000);
			}
			@Pc(58) String local58 = "";
			if (Static119.aString76 != null) {
				local58 = "/p=" + Static119.aString76;
			}
			@Pc(107) String local107 = "http://" + local7.aString91 + local38 + "/l=" + Static257.anInt5015 + "/a=" + Static61.anInt1330 + local58 + "/j" + (Static4.aBoolean16 ? "1" : "0") + ",o" + (Static102.aBoolean180 ? "1" : "0") + ",a2";
			try {
				Static242.aClient1.getAppletContext().showDocument(new URL(local107), "_self");
				return true;
			} catch (@Pc(117) Exception local117) {
				return false;
			}
		} else {
			Static91.aString73 = local7.aString91;
			Static232.anInt6331 = local7.anInt2267;
			if (Static123.anInt2380 != 0) {
				Static211.anInt4206 = Static232.anInt6331 + 40000;
				Static2.anInt3510 = Static232.anInt6331 + 50000;
				Static298.anInt5962 = Static211.anInt4206;
			}
			return true;
		}
	}
}
