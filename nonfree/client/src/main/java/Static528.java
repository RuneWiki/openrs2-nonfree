import java.io.IOException;
import java.net.Socket;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static528 {

	@OriginalMember(owner = "client!wba", name = "a", descriptor = "Lclient!qu;")
	public static final Class243 aClass243_92 = new Class243(38, 8);

	@OriginalMember(owner = "client!wba", name = "b", descriptor = "I")
	public static int anInt9120 = 0;

	@OriginalMember(owner = "client!wba", name = "d", descriptor = "I")
	public static int anInt9122 = 0;

	@OriginalMember(owner = "client!wba", name = "a", descriptor = "(ILjava/net/Socket;I)Lclient!lda;")
	public static Class173 method7624(@OriginalArg(1) Socket arg0) throws IOException {
		return new Class173_Sub1(arg0, 5000);
	}

	@OriginalMember(owner = "client!wba", name = "a", descriptor = "(ILjava/lang/String;I)Z")
	public static boolean method7626(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		if (Static482.anInt8574 != 3) {
			Static471.aClass163_5 = new Class163();
			Static471.aClass163_5.anInt4593 = arg0;
			Static471.aClass163_5.aString104 = arg1;
			if (Static414.aClass320_17 != Static455.aClass320_15) {
				Static471.aClass163_5.anInt4588 = Static471.aClass163_5.anInt4593 + 40000;
				Static471.aClass163_5.anInt4591 = Static471.aClass163_5.anInt4593 + 50000;
			}
			if (arg0 < Static386.aClass178_Sub1Array2.length && Static386.aClass178_Sub1Array2[arg0] != null) {
				Static332.anInt6223 = Static386.aClass178_Sub1Array2[arg0].anInt5255;
			}
			return true;
		}
		@Pc(56) String local56 = "";
		if (Static455.aClass320_15 != Static414.aClass320_17) {
			local56 = ":" + (arg0 + 7000);
		}
		@Pc(71) String local71 = "";
		if (Static530.aString206 != null) {
			local71 = "/p=" + Static530.aString206;
		}
		@Pc(119) String local119 = "http://" + arg1 + local56 + "/l=" + Static172.anInt6352 + "/a=" + Static224.anInt4041 + local71 + "/j" + (Static30.aBoolean40 ? "1" : "0") + ",o" + (Static496.aBoolean630 ? "1" : "0") + ",a2";
		try {
			Static456.aClient1.getAppletContext().showDocument(new URL(local119), "_self");
			return true;
		} catch (@Pc(129) Exception local129) {
			return false;
		}
	}

	@OriginalMember(owner = "client!wba", name = "a", descriptor = "(ZI)V")
	public static void method7627(@OriginalArg(0) boolean arg0) {
		if (Static118.aString57.length() == 0) {
			return;
		}
		Static120.method2321("--> " + Static118.aString57);
		Static172.method5411(arg0, false, Static118.aString57);
		Static210.anInt3785 = 0;
		Static118.aString57 = "";
		Static319.anInt5968 = 0;
	}
}
