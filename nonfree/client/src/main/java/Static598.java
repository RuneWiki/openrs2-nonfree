import java.util.Date;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static598 {

	@OriginalMember(owner = "client!ww", name = "m", descriptor = "Lclient!ta;")
	public static Class111 aClass111_14;

	@OriginalMember(owner = "client!ww", name = "h", descriptor = "Ljava/util/Hashtable;")
	public static final Hashtable aHashtable7 = new Hashtable();

	@OriginalMember(owner = "client!ww", name = "i", descriptor = "F")
	public static float aFloat205 = 1.0F;

	@OriginalMember(owner = "client!ww", name = "j", descriptor = "Lclient!nj;")
	public static final Class230 aClass230_112 = new Class230(71, 7);

	@OriginalMember(owner = "client!ww", name = "k", descriptor = "[[B")
	public static final byte[][] aByteArrayArray36 = new byte[1000][];

	@OriginalMember(owner = "client!ww", name = "l", descriptor = "J")
	public static long aLong264 = -1L;

	@OriginalMember(owner = "client!ww", name = "a", descriptor = "(IJ)Ljava/lang/String;")
	public static String method8436(@OriginalArg(1) long arg0) {
		Static77.aCalendar1.setTime(new Date(arg0));
		@Pc(13) int local13 = Static77.aCalendar1.get(7);
		@Pc(17) int local17 = Static77.aCalendar1.get(5);
		@Pc(21) int local21 = Static77.aCalendar1.get(2);
		@Pc(25) int local25 = Static77.aCalendar1.get(1);
		@Pc(29) int local29 = Static77.aCalendar1.get(11);
		@Pc(33) int local33 = Static77.aCalendar1.get(12);
		@Pc(37) int local37 = Static77.aCalendar1.get(13);
		return Static501.aStringArray33[local13 - 1] + ", " + local17 / 10 + local17 % 10 + "-" + Static334.aStringArray25[local21] + "-" + local25 + " " + local29 / 10 + local29 % 10 + ":" + local33 / 10 + local33 % 10 + ":" + local37 / 10 + local37 % 10 + " GMT";
	}
}
