import java.util.Calendar;
import java.util.TimeZone;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static132 {

	@OriginalMember(owner = "client!ei", name = "Nb", descriptor = "Lclient!iea;")
	public static Class31 aClass31_7;

	@OriginalMember(owner = "client!ei", name = "Sb", descriptor = "Lclient!jn;")
	public static Class184 aClass184_1;

	@OriginalMember(owner = "client!ei", name = "Tb", descriptor = "I")
	public static int anInt2866;

	@OriginalMember(owner = "client!ei", name = "Ib", descriptor = "Ljava/util/Calendar;")
	public static final Calendar aCalendar1 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));

	@OriginalMember(owner = "client!ei", name = "Vb", descriptor = "S")
	public static short aShort55 = 32767;

	@OriginalMember(owner = "client!ei", name = "Xb", descriptor = "I")
	public static int anInt2869 = -1;

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(BD)V")
	public static void method2449(@OriginalArg(1) double arg0) {
		if (arg0 == Static460.aDouble16) {
			return;
		}
		for (@Pc(7) int local7 = 0; local7 < 256; local7++) {
			@Pc(19) int local19 = (int) (Math.pow((double) local7 / 255.0D, arg0) * 255.0D);
			Static184.anIntArray237[local7] = local19 <= 255 ? local19 : 255;
		}
		Static460.aDouble16 = arg0;
	}

	@OriginalMember(owner = "client!ei", name = "u", descriptor = "(I)Lclient!cs;")
	public static Class2_Sub13 method2450() {
		if (Static371.aClass114_54 == null || Static601.aClass370_1 == null) {
			return null;
		}
		Static601.aClass370_1.method8627(Static371.aClass114_54);
		@Pc(26) Class2_Sub13 local26 = (Class2_Sub13) Static601.aClass370_1.method8628();
		if (local26 == null) {
			return null;
		} else {
			@Pc(36) Class353 local36 = Static371.aClass336_4.method7855(local26.anInt2179);
			return local36 != null && local36.aBoolean709 && local36.method8340(Static371.anInterface5_2) ? local26 : Static234.method3747();
		}
	}
}
