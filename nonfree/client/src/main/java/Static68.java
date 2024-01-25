import java.util.Calendar;
import java.util.TimeZone;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static68 {

	@OriginalMember(owner = "client!ck", name = "Q", descriptor = "I")
	public static int anInt1813;

	@OriginalMember(owner = "client!ck", name = "A", descriptor = "[I")
	public static final int[] anIntArray71 = new int[14];

	@OriginalMember(owner = "client!ck", name = "I", descriptor = "Ljava/util/Calendar;")
	public static final Calendar aCalendar1 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));

	@OriginalMember(owner = "client!ck", name = "J", descriptor = "I")
	public static int anInt1811 = 0;

	@OriginalMember(owner = "client!ck", name = "P", descriptor = "J")
	public static long aLong43 = -1L;

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(Z)I")
	public static int method1512() {
		if (Static292.aClass155_7 == null) {
			if (!Static117.aBoolean207 && Static384.anInt7556 > 0) {
				if (Static405.aBoolean565 && Static38.aClass174_1.method4090(81) && Static384.anInt7556 > 2) {
					return ((Class4_Sub36) Static593.aClass22_65.aClass4_13.aClass4_285.aClass4_285).anInt7141;
				}
				return ((Class4_Sub36) Static593.aClass22_65.aClass4_13.aClass4_285).anInt7141;
			}
			@Pc(15) int local15 = Static294.aClass83_1.method6895();
			@Pc(19) int local19 = Static294.aClass83_1.method6896();
			@Pc(21) int local21 = Static593.anInt10604;
			@Pc(23) int local23 = Static469.anInt8895;
			@Pc(25) int local25 = Static303.anInt6098;
			if (local21 < local15 && local15 < local25 + local21) {
				@Pc(39) int local39 = -1;
				@Pc(59) int local59;
				for (@Pc(41) int local41 = 0; local41 < Static384.anInt7556; local41++) {
					if (Static70.aBoolean150) {
						local59 = local23 + (-local41 + -1 + Static384.anInt7556) * 16 + 33;
						if (local59 - 13 < local19 && local59 + 3 >= local19) {
							local39 = local41;
						}
					} else {
						local59 = local23 + (Static384.anInt7556 - local41 - 1) * 16 + 31;
						if (local19 > local59 - 13 && local59 + 3 >= local19) {
							local39 = local41;
						}
					}
				}
				if (local39 != -1) {
					local59 = 0;
					@Pc(126) Class92 local126 = new Class92(Static593.aClass22_65);
					for (@Pc(131) Class4_Sub36 local131 = (Class4_Sub36) local126.method2165(); local131 != null; local131 = (Class4_Sub36) local126.method2168()) {
						if (local39 == local59++) {
							return local131.anInt7141;
						}
					}
				}
			}
		}
		return -1;
	}
}
