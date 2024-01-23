import java.util.Calendar;
import java.util.TimeZone;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static211 {

	@OriginalMember(owner = "client!ue", name = "eb", descriptor = "I")
	public static int anInt4553;

	@OriginalMember(owner = "client!ue", name = "fb", descriptor = "Lclient!dg;")
	public static Class28_Sub1 aClass28_Sub1_120;

	@OriginalMember(owner = "client!ue", name = "X", descriptor = "Lclient!sc;")
	public static Class107 aClass107_1238 = Static231.method3737("l");

	@OriginalMember(owner = "client!ue", name = "Z", descriptor = "Ljava/util/Calendar;")
	public static Calendar aCalendar2 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));

	@OriginalMember(owner = "client!ue", name = "ab", descriptor = "I")
	public static volatile int anInt4552 = 0;

	@OriginalMember(owner = "client!ue", name = "bb", descriptor = "[[I")
	public static int[][] anIntArrayArray43 = new int[5][5000];

	@OriginalMember(owner = "client!ue", name = "cb", descriptor = "[Z")
	public static boolean[] aBooleanArray27 = new boolean[200];

	@OriginalMember(owner = "client!ue", name = "db", descriptor = "Lclient!hg;")
	public static Class52 aClass52_1 = new Class52();

	@OriginalMember(owner = "client!ue", name = "d", descriptor = "(III)I")
	public static int method3402(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class1_Sub20 local8 = (Class1_Sub20) Static169.aClass50_20.method1364((long) arg1);
		if (local8 == null) {
			return 0;
		} else if (arg0 == -1) {
			return 0;
		} else {
			@Pc(23) int local23 = 0;
			for (@Pc(25) int local25 = 0; local25 < local8.anIntArray263.length; local25++) {
				if (local8.anIntArray264[local25] == arg0) {
					local23 += local8.anIntArray263[local25];
				}
			}
			return local23;
		}
	}
}
