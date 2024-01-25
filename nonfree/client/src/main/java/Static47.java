import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static47 {

	@OriginalMember(owner = "client!bw", name = "i", descriptor = "Lclient!eea;")
	public static Class71 aClass71_68 = new Class71();

	@OriginalMember(owner = "client!bw", name = "l", descriptor = "[F")
	public static final float[] aFloatArray73 = new float[4];

	@OriginalMember(owner = "client!bw", name = "n", descriptor = "I")
	public static int anInt9385 = 10;

	@OriginalMember(owner = "client!bw", name = "q", descriptor = "[Lclient!ap;")
	public static final Class3_Sub3[] aClass3_Sub3Array4 = new Class3_Sub3[1024];

	@OriginalMember(owner = "client!bw", name = "a", descriptor = "(IZ)V")
	public static void method7753(@OriginalArg(1) boolean arg0) {
		Static64.method1306(Static422.anInt8667, Static412.anInt7547, Static480.anInt8652, arg0);
	}

	@OriginalMember(owner = "client!bw", name = "a", descriptor = "(Lclient!lm;I)Z")
	public static boolean method7754(@OriginalArg(0) Class179 arg0) {
		if (arg0 == null) {
			return false;
		} else if (!arg0.aBoolean371) {
			return false;
		} else if (!arg0.method4796(Static55.anInterface17_2)) {
			return false;
		} else if (Static257.aClass267_24.method6644((long) arg0.anInt5713) == null) {
			return Static40.aClass267_3.method6644((long) arg0.anInt5728) == null;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!bw", name = "a", descriptor = "(IJ)Ljava/lang/String;")
	public static String method7755(@OriginalArg(1) long arg0) {
		Static251.aCalendar2.setTime(new Date(arg0));
		@Pc(13) int local13 = Static251.aCalendar2.get(7);
		@Pc(17) int local17 = Static251.aCalendar2.get(5);
		@Pc(21) int local21 = Static251.aCalendar2.get(2);
		@Pc(25) int local25 = Static251.aCalendar2.get(1);
		@Pc(29) int local29 = Static251.aCalendar2.get(11);
		@Pc(38) int local38 = Static251.aCalendar2.get(12);
		@Pc(42) int local42 = Static251.aCalendar2.get(13);
		return Static204.aStringArray39[local13 - 1] + ", " + local17 / 10 + local17 % 10 + "-" + Static547.aStringArray53[local21] + "-" + local25 + " " + local29 / 10 + local29 % 10 + ":" + local38 / 10 + local38 % 10 + ":" + local42 / 10 + local42 % 10 + " GMT";
	}
}
