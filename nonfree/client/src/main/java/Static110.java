import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static110 {

	@OriginalMember(owner = "client!eaa", name = "p", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray1;

	@OriginalMember(owner = "client!eaa", name = "k", descriptor = "Lclient!or;")
	public static final Class244 aClass244_20 = new Class244();

	@OriginalMember(owner = "client!eaa", name = "a", descriptor = "(ILjava/lang/String;I)Z")
	public static boolean method2208(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		if (Static467.aClass168_12.aBoolean334) {
			Static104.aClass212_1 = new Class212();
			Static104.aClass212_1.aString157 = arg1;
			Static104.aClass212_1.anInt6145 = arg0;
			if (Static332.aClass5_3 != Static412.aClass5_7) {
				Static104.aClass212_1.anInt6142 = Static104.aClass212_1.anInt6145 + 50000;
				Static104.aClass212_1.anInt6137 = Static104.aClass212_1.anInt6145 + 40000;
			}
			if (arg0 < Static497.aClass48_Sub1Array2.length && Static497.aClass48_Sub1Array2[arg0] != null) {
				Static503.anInt8662 = Static497.aClass48_Sub1Array2[arg0].anInt1523;
			}
			return true;
		}
		@Pc(57) String local57 = "";
		if (Static412.aClass5_7 != Static332.aClass5_3) {
			local57 = ":" + (arg0 + 7000);
		}
		@Pc(72) String local72 = "";
		if (Static44.aString268 != null) {
			local72 = "/p=" + Static44.aString268;
		}
		@Pc(120) String local120 = "http://" + arg1 + local57 + "/l=" + Static201.anInt4321 + "/a=" + Static501.anInt8649 + local72 + "/j" + (Static458.aBoolean553 ? "1" : "0") + ",o" + (Static215.aBoolean292 ? "1" : "0") + ",a2";
		try {
			Static507.aClient1.getAppletContext().showDocument(new URL(local120), "_self");
			return true;
		} catch (@Pc(130) Exception local130) {
			return false;
		}
	}
}
