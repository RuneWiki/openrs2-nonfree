import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static233 {

	@OriginalMember(owner = "client!ln", name = "f", descriptor = "I")
	public static int anInt6981;

	@OriginalMember(owner = "client!ln", name = "b", descriptor = "Lclient!mg;")
	public static Class156 aClass156_57 = new Class156();

	@OriginalMember(owner = "client!ln", name = "c", descriptor = "Lclient!qh;")
	public static final Class75 aClass75_4 = Static212.method2822();

	@OriginalMember(owner = "client!ln", name = "d", descriptor = "[F")
	public static final float[] aFloatArray35 = new float[] { 0.0F, -1.0F, 0.0F, 0.0F };

	@OriginalMember(owner = "client!ln", name = "e", descriptor = "I")
	public static int anInt6980 = -1;

	@OriginalMember(owner = "client!ln", name = "h", descriptor = "I")
	public static int anInt6983 = 0;

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(ZZII)V")
	public static void method5398(@OriginalArg(0) boolean arg0) {
		Static441.anInt7097 = 2;
		Static333.anInt5628 = 22050;
		Static257.aBoolean291 = arg0;
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(IJ)Ljava/lang/String;")
	public static String method5401(@OriginalArg(1) long arg0) {
		Static129.aCalendar1.setTime(new Date(arg0));
		@Pc(18) int local18 = Static129.aCalendar1.get(7);
		@Pc(22) int local22 = Static129.aCalendar1.get(5);
		@Pc(26) int local26 = Static129.aCalendar1.get(2);
		@Pc(30) int local30 = Static129.aCalendar1.get(1);
		@Pc(34) int local34 = Static129.aCalendar1.get(11);
		@Pc(38) int local38 = Static129.aCalendar1.get(12);
		@Pc(42) int local42 = Static129.aCalendar1.get(13);
		return Static109.aStringArray8[local18 - 1] + ", " + local22 / 10 + local22 % 10 + "-" + Static129.aStringArray10[local26] + "-" + local30 + " " + local34 / 10 + local34 % 10 + ":" + local38 / 10 + local38 % 10 + ":" + local42 / 10 + local42 % 10 + " GMT";
	}
}
