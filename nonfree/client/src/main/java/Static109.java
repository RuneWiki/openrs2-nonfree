import java.util.Calendar;
import java.util.TimeZone;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static109 {

	@OriginalMember(owner = "client!gr", name = "G", descriptor = "I")
	public static int anInt2439 = 0;

	@OriginalMember(owner = "client!gr", name = "K", descriptor = "Ljava/util/Calendar;")
	public static final Calendar aCalendar1 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));

	@OriginalMember(owner = "client!gr", name = "M", descriptor = "I")
	public static int anInt2443 = -1;

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "(IZI)I")
	public static int method2322(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = 0;
		while (arg1 > 0) {
			local7 = arg0 & 0x1 | local7 << 1;
			arg0 >>>= 0x1;
			arg1--;
		}
		return local7;
	}

	@OriginalMember(owner = "client!gr", name = "f", descriptor = "(I)V")
	public static void method2323() {
		for (@Pc(3) int local3 = 0; local3 < 5; local3++) {
			Static26.aBooleanArray1[local3] = false;
		}
		Static2.anInt123 = -1;
		Static133.anInt2876 = 0;
		Static50.anInt1273 = 1;
		Static7.anInt214 = -1;
		Static31.anInt789 = 0;
	}

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "(III)Lclient!cl;")
	public static Class11_Sub1 method2324(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class155 local7 = Static105.aClass155ArrayArrayArray3[arg0][arg1][arg2];
		return local7 == null || local7.aClass11_Sub1_2 == null ? null : local7.aClass11_Sub1_2;
	}
}
