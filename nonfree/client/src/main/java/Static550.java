import java.awt.Image;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static550 {

	@OriginalMember(owner = "client!vh", name = "h", descriptor = "Lclient!pj;")
	public static Class248 aClass248_107;

	@OriginalMember(owner = "client!vh", name = "m", descriptor = "Ljava/awt/Image;")
	public static Image anImage3;

	@OriginalMember(owner = "client!vh", name = "b", descriptor = "(B)V")
	public static void method7684() {
		@Pc(10) int local10 = 0;
		if (Static58.aClass6_Sub17_Sub1_1 != null) {
			local10 = Static58.aClass6_Sub17_Sub1_1.method7355(Static79.anInt2700);
		}
		@Pc(34) int local34;
		@Pc(52) int local52;
		if (local10 == 2) {
			local34 = Static258.anInt4672 <= 800 ? Static258.anInt4672 : 800;
			local52 = Static460.anInt8100 <= 600 ? Static460.anInt8100 : 600;
			Static367.anInt6719 = local34;
			Static201.anInt3846 = (Static258.anInt4672 - local34) / 2;
			Static154.anInt2867 = local52;
			Static223.anInt4111 = 0;
		} else if (local10 == 1) {
			local34 = Static258.anInt4672 <= 1024 ? Static258.anInt4672 : 1024;
			Static201.anInt3846 = (Static258.anInt4672 - local34) / 2;
			Static367.anInt6719 = local34;
			local52 = Static460.anInt8100 > 768 ? 768 : Static460.anInt8100;
			Static223.anInt4111 = 0;
			Static154.anInt2867 = local52;
		} else {
			Static154.anInt2867 = Static460.anInt8100;
			Static223.anInt4111 = 0;
			Static367.anInt6719 = Static258.anInt4672;
			Static201.anInt3846 = 0;
		}
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(BILjava/lang/String;)Z")
	public static boolean method7685(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1) {
		if (Static174.aClass313_24.aBoolean569) {
			Static65.aClass297_1 = new Class297();
			Static65.aClass297_1.aString70 = arg1;
			Static65.aClass297_1.anInt8579 = arg0;
			if (Static101.aClass45_4 != Static338.aClass45_6) {
				Static65.aClass297_1.anInt8574 = Static65.aClass297_1.anInt8579 + 50000;
				Static65.aClass297_1.anInt8578 = Static65.aClass297_1.anInt8579 + 40000;
			}
			if (Static446.aClass139_Sub1Array2.length > arg0 && Static446.aClass139_Sub1Array2[arg0] != null) {
				Static152.anInt1937 = Static446.aClass139_Sub1Array2[arg0].anInt7124;
			}
			return true;
		}
		@Pc(57) String local57 = "";
		if (Static338.aClass45_6 != Static101.aClass45_4) {
			local57 = ":" + (arg0 + 7000);
		}
		@Pc(72) String local72 = "";
		if (Static315.aString50 != null) {
			local72 = "/p=" + Static315.aString50;
		}
		@Pc(120) String local120 = "http://" + arg1 + local57 + "/l=" + Static188.anInt28 + "/a=" + Static543.anInt9322 + local72 + "/j" + (Static71.aBoolean84 ? "1" : "0") + ",o" + (Static90.aBoolean359 ? "1" : "0") + ",a2";
		try {
			Static536.aClient1.getAppletContext().showDocument(new URL(local120), "_self");
			return true;
		} catch (@Pc(130) Exception local130) {
			return false;
		}
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(ILclient!jr;)Lclient!eca;")
	public static Class6_Sub3 method7687(@OriginalArg(1) Class6_Sub12 arg0) {
		arg0.method6019();
		@Pc(17) int local17 = arg0.method6019();
		@Pc(21) Class6_Sub3 local21 = Static351.method5315(local17);
		local21.anInt9975 = arg0.method6019();
		@Pc(30) int local30 = arg0.method6019();
		for (@Pc(32) int local32 = 0; local32 < local30; local32++) {
			@Pc(40) int local40 = arg0.method6019();
			local21.method7955(local40, arg0);
		}
		local21.method7957();
		return local21;
	}
}
