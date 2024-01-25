import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static164 {

	@OriginalMember(owner = "client!fw", name = "a", descriptor = "(Ljava/lang/String;II)Z")
	public static boolean method3284(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		if (Static51.aClass118_1.aBoolean302) {
			Static471.aClass280_2 = new Class280();
			Static471.aClass280_2.anInt8497 = arg1;
			Static471.aClass280_2.aString87 = arg0;
			if (Static277.aClass313_9 != Static101.aClass313_5) {
				Static471.aClass280_2.anInt8493 = Static471.aClass280_2.anInt8497 + 50000;
				Static471.aClass280_2.anInt8501 = Static471.aClass280_2.anInt8497 + 40000;
			}
			if (arg1 < Static313.aClass98_Sub1Array1.length && Static313.aClass98_Sub1Array1[arg1] != null) {
				Static349.anInt6743 = Static313.aClass98_Sub1Array1[arg1].anInt3678;
			}
			return true;
		}
		@Pc(56) String local56 = "";
		if (Static101.aClass313_5 != Static277.aClass313_9) {
			local56 = ":" + (arg1 + 7000);
		}
		@Pc(71) String local71 = "";
		if (Static254.aString54 != null) {
			local71 = "/p=" + Static254.aString54;
		}
		@Pc(119) String local119 = "http://" + arg0 + local56 + "/l=" + Static372.anInt7083 + "/a=" + Static60.anInt1930 + local71 + "/j" + (Static247.aBoolean402 ? "1" : "0") + ",o" + (Static109.aBoolean224 ? "1" : "0") + ",a2";
		try {
			Static227.aClient1.getAppletContext().showDocument(new URL(local119), "_self");
			return true;
		} catch (@Pc(129) Exception local129) {
			return false;
		}
	}
}
