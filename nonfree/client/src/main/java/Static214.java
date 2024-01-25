import java.util.Calendar;
import java.util.TimeZone;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static214 {

	@OriginalMember(owner = "client!gka", name = "o", descriptor = "I")
	public static int anInt3521 = -60;

	@OriginalMember(owner = "client!gka", name = "n", descriptor = "[S")
	public static short[] aShortArray28 = new short[256];

	@OriginalMember(owner = "client!gka", name = "m", descriptor = "Ljava/util/Calendar;")
	public static final Calendar aCalendar1 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));

	@OriginalMember(owner = "client!gka", name = "a", descriptor = "([[SI[[F)[[S")
	public static short[][] method3202(@OriginalArg(0) short[][] arg0, @OriginalArg(2) float[][] arg1) {
		for (@Pc(14) int local14 = 0; local14 < arg1.length; local14++) {
			for (@Pc(18) int local18 = 0; local18 < arg0[local14].length; local18++) {
				arg0[local14][local18] = (short) (int) (arg1[local14][local18] * 16383.0F);
			}
		}
		return arg0;
	}
}
