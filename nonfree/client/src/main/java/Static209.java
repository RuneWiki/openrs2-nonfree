import java.util.Calendar;
import java.util.TimeZone;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static209 {

	@OriginalMember(owner = "client!hi", name = "w", descriptor = "Lclient!ee;")
	public static Class76 aClass76_2;

	@OriginalMember(owner = "client!hi", name = "j", descriptor = "Ljava/util/Calendar;")
	public static final Calendar aCalendar2 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));

	@OriginalMember(owner = "client!hi", name = "e", descriptor = "(I)[Lclient!rha;")
	public static Class288[] method4114() {
		if (Static531.aClass288Array1 == null) {
			@Pc(17) Class288[] local17 = Static444.method6717(Static379.aClass228_6);
			@Pc(21) Class288[] local21 = new Class288[local17.length];
			@Pc(23) int local23 = 0;
			@Pc(28) int local28 = Static552.aClass3_Sub48_30.aClass23_Sub6_1.method2793();
			@Pc(87) int local87;
			@Pc(93) Class288 local93;
			label70: for (@Pc(30) int local30 = 0; local30 < local17.length; local30++) {
				@Pc(36) Class288 local36 = local17[local30];
				if ((local36.anInt8633 <= 0 || local36.anInt8633 >= 24) && local36.anInt8634 >= 800 && local36.anInt8630 >= 600 && (local28 != 2 || local36.anInt8634 <= 800 && local36.anInt8630 <= 600) && (local28 != 1 || local36.anInt8634 <= 1024 && local36.anInt8630 <= 768)) {
					for (local87 = 0; local87 < local23; local87++) {
						local93 = local21[local87];
						if (local93.anInt8634 == local36.anInt8634 && local36.anInt8630 == local93.anInt8630) {
							if (local36.anInt8633 > local93.anInt8633) {
								local21[local87] = local36;
							}
							continue label70;
						}
					}
					local21[local23] = local36;
					local23++;
				}
			}
			Static531.aClass288Array1 = new Class288[local23];
			Static655.method6407(local21, 0, Static531.aClass288Array1, 0, local23);
			@Pc(153) int[] local153 = new int[Static531.aClass288Array1.length];
			for (local87 = 0; local87 < Static531.aClass288Array1.length; local87++) {
				local93 = Static531.aClass288Array1[local87];
				local153[local87] = local93.anInt8630 * local93.anInt8634;
			}
			Static87.method2243(Static531.aClass288Array1, local153);
		}
		return Static531.aClass288Array1;
	}

	@OriginalMember(owner = "client!hi", name = "f", descriptor = "(I)Z")
	public static boolean method4116() {
		return Static565.anInt9608 != 0;
	}
}
