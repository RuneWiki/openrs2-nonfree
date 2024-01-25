import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static139 {

	@OriginalMember(owner = "client!fl", name = "C", descriptor = "[[Lclient!oh;")
	public static Class220[][] aClass220ArrayArray1;

	@OriginalMember(owner = "client!fl", name = "w", descriptor = "[I")
	public static final int[] anIntArray233 = new int[1];

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(ILjava/lang/String;I)Z")
	public static boolean method2597(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1) {
		if (Static9.anInt148 != 3) {
			Static212.aClass43_2 = new Class43();
			Static212.aClass43_2.aString27 = arg0;
			Static212.aClass43_2.anInt1149 = arg1;
			if (Static124.aClass199_3 != Static134.aClass199_4) {
				Static212.aClass43_2.anInt1152 = Static212.aClass43_2.anInt1149 + 50000;
				Static212.aClass43_2.anInt1154 = Static212.aClass43_2.anInt1149 + 40000;
			}
			if (Static74.aClass35_Sub1Array1.length > arg1 && Static74.aClass35_Sub1Array1[arg1] != null) {
				Static252.anInt5081 = Static74.aClass35_Sub1Array1[arg1].anInt998;
			}
			return true;
		}
		@Pc(53) String local53 = "";
		if (Static124.aClass199_3 != Static134.aClass199_4) {
			local53 = ":" + (arg1 + 7000);
		}
		@Pc(73) String local73 = "";
		if (Static466.aString72 != null) {
			local73 = "/p=" + Static466.aString72;
		}
		@Pc(121) String local121 = "http://" + arg0 + local53 + "/l=" + Static194.anInt3737 + "/a=" + Static433.anInt7630 + local73 + "/j" + (Static343.aBoolean436 ? "1" : "0") + ",o" + (Static270.aBoolean368 ? "1" : "0") + ",a2";
		try {
			Static263.aClient1.getAppletContext().showDocument(new URL(local121), "_self");
			return true;
		} catch (@Pc(131) Exception local131) {
			return false;
		}
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(ILclient!co;Ljava/lang/String;)I")
	public static int method2599(@OriginalArg(1) Class5_Sub3 arg0, @OriginalArg(2) String arg1) {
		@Pc(6) int local6 = arg0.anInt4960;
		@Pc(10) byte[] local10 = Static128.method2402(arg1);
		arg0.method4186(local10.length);
		arg0.anInt4960 += Static223.aClass302_1.method7109(0, local10.length, arg0.anInt4960, local10, arg0.aByteArray66);
		return arg0.anInt4960 - local6;
	}
}
