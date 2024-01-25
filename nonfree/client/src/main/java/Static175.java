import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static175 {

	@OriginalMember(owner = "client!gv", name = "a", descriptor = "I")
	public static int anInt3559;

	@OriginalMember(owner = "client!gv", name = "e", descriptor = "Lclient!nj;")
	public static final Class230 aClass230_39 = new Class230(40, 2);

	@OriginalMember(owner = "client!gv", name = "a", descriptor = "(II)V")
	public static void method3124(@OriginalArg(1) int arg0) {
		@Pc(8) Class3_Sub4_Sub6 local8 = Static367.method6025(4, arg0);
		local8.method1896();
	}

	@OriginalMember(owner = "client!gv", name = "a", descriptor = "(Ljava/lang/String;II)Z")
	public static boolean method3125(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1) {
		if (Static480.aClass326_3.aBoolean802) {
			Static461.aClass329_6 = new Class329();
			Static461.aClass329_6.aString124 = arg0;
			Static461.aClass329_6.anInt9698 = arg1;
			if (Static51.aClass109_2 != Static508.aClass109_7) {
				Static461.aClass329_6.anInt9689 = Static461.aClass329_6.anInt9698 + 50000;
				Static461.aClass329_6.anInt9687 = Static461.aClass329_6.anInt9698 + 40000;
			}
			if (Static228.aClass69_Sub1Array1.length > arg1 && Static228.aClass69_Sub1Array1[arg1] != null) {
				Static235.anInt4858 = Static228.aClass69_Sub1Array1[arg1].anInt4846;
			}
			return true;
		}
		@Pc(48) String local48 = "";
		if (Static51.aClass109_2 != Static508.aClass109_7) {
			local48 = ":" + (arg1 + 7000);
		}
		@Pc(63) String local63 = "";
		if (Static64.aString16 != null) {
			local63 = "/p=" + Static64.aString16;
		}
		@Pc(111) String local111 = "http://" + arg0 + local48 + "/l=" + Static126.anInt2904 + "/a=" + Static32.anInt2893 + local63 + "/j" + (Static116.aBoolean210 ? "1" : "0") + ",o" + (Static376.aBoolean619 ? "1" : "0") + ",a2";
		try {
			Static173.aClient1.getAppletContext().showDocument(new URL(local111), "_self");
			return true;
		} catch (@Pc(126) Exception local126) {
			return false;
		}
	}

	@OriginalMember(owner = "client!gv", name = "a", descriptor = "(BLclient!fd;)V")
	public static void method3126(@OriginalArg(1) Class3_Sub7 arg0) {
		for (@Pc(10) int local10 = 0; local10 < Static244.anInt5120; local10++) {
			@Pc(15) int local15 = arg0.method6542();
			@Pc(19) int local19 = arg0.method6535();
			if (local19 == 65535) {
				local19 = -1;
			}
			if (Static390.aClass69_Sub1Array2[local15] != null) {
				Static390.aClass69_Sub1Array2[local15].anInt4839 = local19;
			}
		}
	}
}
