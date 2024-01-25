import java.util.Calendar;
import java.util.Random;
import java.util.TimeZone;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static68 {

	@OriginalMember(owner = "client!cia", name = "L", descriptor = "Lclient!np;")
	public static Class258 aClass258_6;

	@OriginalMember(owner = "client!cia", name = "I", descriptor = "[Lclient!tn;")
	public static Class4_Sub9[] aClass4_Sub9Array3;

	@OriginalMember(owner = "client!cia", name = "M", descriptor = "Ljava/util/Calendar;")
	public static Calendar aCalendar3 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));

	@OriginalMember(owner = "client!cia", name = "G", descriptor = "Lclient!iha;")
	public static final Class168 aClass168_60 = new Class168(20);

	@OriginalMember(owner = "client!cia", name = "J", descriptor = "Lclient!hl;")
	public static final Class156 aClass156_129 = new Class156(117, 2);

	@OriginalMember(owner = "client!cia", name = "x", descriptor = "Lclient!lt;")
	public static final Class226 aClass226_15 = new Class226(14, 8);

	@OriginalMember(owner = "client!cia", name = "E", descriptor = "Lclient!hl;")
	public static final Class156 aClass156_130 = new Class156(30, 6);

	@OriginalMember(owner = "client!cia", name = "B", descriptor = "Ljava/util/Random;")
	public static final Random aRandom3 = new Random();

	@OriginalMember(owner = "client!cia", name = "a", descriptor = "(IB)Z")
	public static boolean method5675(@OriginalArg(0) int arg0) {
		return arg0 == 9 || arg0 == 10;
	}
}
