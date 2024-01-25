import java.util.Calendar;
import java.util.TimeZone;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static545 {

	@OriginalMember(owner = "client!ww", name = "e", descriptor = "Lclient!il;")
	public static final Class139 aClass139_7 = new Class139("WTI", 5);

	@OriginalMember(owner = "client!ww", name = "f", descriptor = "Ljava/util/Calendar;")
	public static final Calendar aCalendar2 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));

	@OriginalMember(owner = "client!ww", name = "a", descriptor = "(Lclient!os;II)Ljava/lang/String;")
	public static String method8262(@OriginalArg(0) Class1_Sub17 arg0) {
		try {
			@Pc(15) int local15 = arg0.method4480();
			if (local15 > 32767) {
				local15 = 32767;
			}
			@Pc(27) byte[] local27 = new byte[local15];
			arg0.anInt4872 += Static422.aClass199_1.method5476(local15, arg0.anInt4872, arg0.aByteArray58, 0, local27);
			return Static332.method5654(local27, 0, local15);
		} catch (@Pc(51) Exception local51) {
			return "Cabbage";
		}
	}

	@OriginalMember(owner = "client!ww", name = "a", descriptor = "(I)V")
	public static void method8263() {
		for (@Pc(3) int local3 = 0; local3 < 100; local3++) {
			Static77.aClass315Array1[local3] = null;
		}
		Static102.anInt2170 = 0;
	}

	@OriginalMember(owner = "client!ww", name = "a", descriptor = "(B)V")
	public static void method8265() {
		Static240.method4287();
		Static422.method6584();
	}
}
