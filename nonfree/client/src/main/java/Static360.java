import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static360 {

	@OriginalMember(owner = "client!ow", name = "R", descriptor = "I")
	public static int anInt6507;

	@OriginalMember(owner = "client!ow", name = "Z", descriptor = "I")
	public static int anInt6512;

	@OriginalMember(owner = "client!ow", name = "ab", descriptor = "I")
	public static int anInt6513;

	@OriginalMember(owner = "client!ow", name = "O", descriptor = "[I")
	public static final int[] anIntArray634 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!ow", name = "Q", descriptor = "Lclient!bg;")
	public static final Class27 aClass27_5 = new Class27();

	@OriginalMember(owner = "client!ow", name = "T", descriptor = "Z")
	public static boolean aBoolean481 = false;

	@OriginalMember(owner = "client!ow", name = "W", descriptor = "Lclient!et;")
	public static Class91 aClass91_10 = null;

	@OriginalMember(owner = "client!ow", name = "Y", descriptor = "F")
	public static float aFloat140 = 0.0F;

	@OriginalMember(owner = "client!ow", name = "e", descriptor = "(III)I")
	public static int method5865(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(9) int local9 = arg0 * 57 + arg1;
		@Pc(23) int local23 = local9 ^ local9 << 13;
		@Pc(37) int local37 = Integer.MAX_VALUE & (local23 * local23 * 15731 + 789221) * local23 + 1376312589;
		return local37 >> 19 & 0xFF;
	}

	@OriginalMember(owner = "client!ow", name = "a", descriptor = "(Ljava/lang/String;II)Z")
	public static boolean method5866(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		if (Static380.anInt6743 != 3) {
			Class216.lb = new Class210();
			Class216.lb.anInt6291 = arg1;
			Class216.lb.aString150 = arg0;
			if (Static334.aClass139_4 != Static190.aClass139_1) {
				Class216.lb.anInt6287 = Class216.lb.anInt6291 + 40000;
				Class216.lb.anInt6288 = Class216.lb.anInt6291 + 50000;
			}
			if (Static529.aClass38_Sub1Array140.length > arg1 && Static529.aClass38_Sub1Array140[arg1] != null) {
				Static460.anInt7963 = Static529.aClass38_Sub1Array140[arg1].anInt5571;
			}
			return true;
		}
		@Pc(50) String local50 = "";
		if (Static334.aClass139_4 != Static190.aClass139_1) {
			local50 = ":" + (arg1 + 7000);
		}
		@Pc(65) String local65 = "";
		if (Static18.aString9 != null) {
			local65 = "/p=" + Static18.aString9;
		}
		@Pc(118) String local118 = "http://" + arg0 + local50 + "/l=" + Static544.anInt7853 + "/a=" + Static27.anInt767 + local65 + "/j" + (Static23.aBoolean56 ? "1" : "0") + ",o" + (Static197.aBoolean322 ? "1" : "0") + ",a2";
		try {
			Static125.aClient1.getAppletContext().showDocument(new URL(local118), "_self");
			return true;
		} catch (@Pc(128) Exception local128) {
			return false;
		}
	}
}
