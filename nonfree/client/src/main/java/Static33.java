import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static33 {

	@OriginalMember(owner = "client!bca", name = "z", descriptor = "I")
	public static int anInt738;

	@OriginalMember(owner = "client!bca", name = "w", descriptor = "Lclient!rm;")
	public static final Class2_Sub41 aClass2_Sub41_1 = new Class2_Sub41(0, -1);

	@OriginalMember(owner = "client!bca", name = "y", descriptor = "Lclient!bh;")
	public static final Class32 aClass32_9 = new Class32(64);

	@OriginalMember(owner = "client!bca", name = "A", descriptor = "I")
	public static int anInt739 = -1;

	@OriginalMember(owner = "client!bca", name = "a", descriptor = "(IILjava/lang/String;)Z")
	public static boolean method588(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1) {
		if (Static452.aClass226_6.aBoolean416) {
			Static216.aClass326_9 = new Class326();
			Static216.aClass326_9.aString102 = arg1;
			Static216.aClass326_9.anInt8758 = arg0;
			if (Static252.aClass80_3 != Static162.aClass80_2) {
				Static216.aClass326_9.anInt8760 = Static216.aClass326_9.anInt8758 + 50000;
				Static216.aClass326_9.anInt8764 = Static216.aClass326_9.anInt8758 + 40000;
			}
			if (Static1.aClass89_Sub1Array6.length > arg0 && Static1.aClass89_Sub1Array6[arg0] != null) {
				Static534.anInt8759 = Static1.aClass89_Sub1Array6[arg0].anInt2233;
			}
			return true;
		}
		@Pc(52) String local52 = "";
		if (Static162.aClass80_2 != Static252.aClass80_3) {
			local52 = ":" + (arg0 + 7000);
		}
		@Pc(67) String local67 = "";
		if (Static377.aString78 != null) {
			local67 = "/p=" + Static377.aString78;
		}
		@Pc(115) String local115 = "http://" + arg1 + local52 + "/l=" + Static483.anInt7694 + "/a=" + Static380.anInt5916 + local67 + "/j" + (Static418.aBoolean471 ? "1" : "0") + ",o" + (Static206.aBoolean251 ? "1" : "0") + ",a2";
		try {
			Static78.aClient1.getAppletContext().showDocument(new URL(local115), "_self");
			return true;
		} catch (@Pc(125) Exception local125) {
			return false;
		}
	}
}
