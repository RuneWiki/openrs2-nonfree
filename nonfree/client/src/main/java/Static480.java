import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static480 {

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "I")
	public static int anInt10076;

	@OriginalMember(owner = "client!sj", name = "k", descriptor = "I")
	public static int anInt10082;

	@OriginalMember(owner = "client!sj", name = "m", descriptor = "I")
	public static int anInt10083;

	@OriginalMember(owner = "client!sj", name = "e", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray71 = new String[] { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };

	@OriginalMember(owner = "client!sj", name = "j", descriptor = "Lclient!wo;")
	public static final Class362 aClass362_230 = new Class362(3, 8);

	@OriginalMember(owner = "client!sj", name = "l", descriptor = "Lclient!fca;")
	public static final Class97 aClass97_55 = new Class97(2);

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(IZLjava/lang/String;)Z")
	public static boolean method8253(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1) {
		if (Static406.aClass354_5.aBoolean711) {
			Static60.aClass342_1 = new Class342();
			Static60.aClass342_1.anInt9881 = arg0;
			Static60.aClass342_1.aString96 = arg1;
			if (Static296.aClass145_5 != Static565.aClass145_11) {
				Static60.aClass342_1.anInt9874 = Static60.aClass342_1.anInt9881 + 40000;
				Static60.aClass342_1.anInt9876 = Static60.aClass342_1.anInt9881 + 50000;
			}
			if (Static5.aClass158_Sub1Array1.length > arg0 && Static5.aClass158_Sub1Array1[arg0] != null) {
				Static80.anInt9684 = Static5.aClass158_Sub1Array1[arg0].anInt4053;
			}
			return true;
		}
		@Pc(48) String local48 = "";
		if (Static296.aClass145_5 != Static565.aClass145_11) {
			local48 = ":" + (arg0 + 7000);
		}
		@Pc(63) String local63 = "";
		if (Static450.aString79 != null) {
			local63 = "/p=" + Static450.aString79;
		}
		@Pc(116) String local116 = "http://" + arg1 + local48 + "/l=" + Static154.anInt3181 + "/a=" + Static566.anInt9919 + local63 + "/j" + (Static429.aBoolean557 ? "1" : "0") + ",o" + (Static429.aBoolean558 ? "1" : "0") + ",a2";
		try {
			Static430.aClient1.getAppletContext().showDocument(new URL(local116), "_self");
			return true;
		} catch (@Pc(126) Exception local126) {
			return false;
		}
	}

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(III)Z")
	public static boolean method8255(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x100) != 0;
	}

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(Lclient!te;BI)Z")
	public static boolean method8256(@OriginalArg(0) Class314 arg0, @OriginalArg(2) int arg1) {
		Static215.aClass8_2.method6811(arg0.anIntArray487[arg1], arg0.anIntArray486[arg1], arg0.anIntArray488[arg1], Static518.anIntArray501);
		@Pc(22) int local22 = Static518.anIntArray501[2];
		if (local22 < 50) {
			return false;
		} else {
			arg0.aShortArray120[arg1] = (short) (Static297.anInt6004 + Static518.anIntArray501[0] * Static375.anInt7258 / local22);
			arg0.aShortArray121[arg1] = (short) (Static308.anInt6172 + Static518.anIntArray501[1] * Static445.anInt8291 / local22);
			arg0.aShortArray122[arg1] = (short) local22;
			return true;
		}
	}

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(IBI)I")
	public static int method8257(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(45) int local45 = Static567.method8135(arg1 + 45365, 4, arg0 + 91923) + (Static567.method8135(arg1 + 10294, 2, arg0 + 37821) - 128 >> 1) + (Static567.method8135(arg1, 1, arg0) + -128 >> 2) - 128;
		local45 = (int) ((double) local45 * 0.3D) + 35;
		if (local45 < 10) {
			local45 = 10;
		} else if (local45 > 60) {
			local45 = 60;
		}
		return local45;
	}
}
