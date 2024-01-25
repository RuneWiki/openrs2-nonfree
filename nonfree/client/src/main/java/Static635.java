import java.util.Calendar;
import java.util.TimeZone;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static635 {

	@OriginalMember(owner = "client!vg", name = "M", descriptor = "I")
	public static int anInt9807;

	@OriginalMember(owner = "client!vg", name = "A", descriptor = "Ljava/util/Calendar;")
	public static final Calendar aCalendar2 = Calendar.getInstance();

	@OriginalMember(owner = "client!vg", name = "I", descriptor = "Ljava/util/Calendar;")
	public static final Calendar aCalendar3 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));

	@OriginalMember(owner = "client!vg", name = "L", descriptor = "Lclient!fja;")
	public static final Class126 aClass126_195 = new Class126(30, -1);

	@OriginalMember(owner = "client!vg", name = "N", descriptor = "Lclient!fja;")
	public static final Class126 aClass126_196 = new Class126(28, 4);

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(I[B)V")
	public static void method8350(@OriginalArg(1) byte[] arg0) {
		@Pc(10) Class3_Sub17 local10 = new Class3_Sub17(arg0);
		@Pc(12) boolean local12 = false;
		while (true) {
			while (true) {
				@Pc(16) int local16 = local10.method4888();
				if (local16 == 0) {
					if (local12) {
						return;
					}
					if (Static292.anIntArray356 == null) {
						Static508.anInt8494 = 4;
						Static292.anIntArray356 = new int[4];
						Static656.anIntArray58 = new int[4];
					}
					for (local16 = 0; local16 < Static292.anIntArray356.length; local16++) {
						Static292.anIntArray356[local16] = 0;
						Static656.anIntArray58[local16] = local16 * 20;
					}
					return;
				}
				if (local16 == 1) {
					if (Static292.anIntArray356 == null) {
						Static656.anIntArray58 = new int[4];
						Static508.anInt8494 = 4;
						Static292.anIntArray356 = new int[4];
					}
					local12 = true;
					for (@Pc(67) int local67 = 0; local67 < Static292.anIntArray356.length; local67++) {
						Static292.anIntArray356[local67] = local10.method4869();
						Static656.anIntArray58[local67] = local10.method4869();
					}
				} else if (local16 == 2) {
					Static205.anInt3816 = local10.method4858();
				} else if (local16 == 3) {
					Static508.anInt8494 = local10.method4888();
					Static292.anIntArray356 = new int[Static508.anInt8494];
					Static656.anIntArray58 = new int[Static508.anInt8494];
				}
			}
		}
	}
}
