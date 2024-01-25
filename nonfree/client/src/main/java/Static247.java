import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static247 {

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "Lclient!sea;")
	public static Class308 aClass308_96;

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "(Ljava/lang/String;II)Z")
	public static boolean method3623(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1) {
		if (Static361.aClass198_3.aBoolean401) {
			Static221.aClass261_3 = new Class261();
			Static221.aClass261_3.aString81 = arg0;
			Static221.aClass261_3.anInt6921 = arg1;
			if (Static405.aClass93_6 != Static76.aClass93_3) {
				Static221.aClass261_3.anInt6923 = Static221.aClass261_3.anInt6921 + 50000;
				Static221.aClass261_3.anInt6913 = Static221.aClass261_3.anInt6921 + 40000;
			}
			if (arg1 < Static332.aClass248_Sub1Array1.length && Static332.aClass248_Sub1Array1[arg1] != null) {
				Static405.anInt7235 = Static332.aClass248_Sub1Array1[arg1].anInt8296;
			}
			return true;
		}
		@Pc(56) String local56 = "";
		if (Static405.aClass93_6 != Static76.aClass93_3) {
			local56 = ":" + (arg1 + 7000);
		}
		@Pc(71) String local71 = "";
		if (Static9.aString2 != null) {
			local71 = "/p=" + Static9.aString2;
		}
		@Pc(119) String local119 = "http://" + arg0 + local56 + "/l=" + Static161.anInt3095 + "/a=" + Static547.anInt9149 + local71 + "/j" + (Static144.aBoolean206 ? "1" : "0") + ",o" + (Static170.aBoolean234 ? "1" : "0") + ",a2";
		try {
			Static475.aClient1.getAppletContext().showDocument(new URL(local119), "_self");
			return true;
		} catch (@Pc(129) Exception local129) {
			return false;
		}
	}
}
