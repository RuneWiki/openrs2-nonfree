import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static314 {

	@OriginalMember(owner = "client!kk", name = "s", descriptor = "F")
	public static float aFloat86;

	@OriginalMember(owner = "client!kk", name = "A", descriptor = "I")
	public static int anInt5572;

	@OriginalMember(owner = "client!kk", name = "B", descriptor = "I")
	public static int anInt5581 = -1;

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(II)V")
	public static void method4782(@OriginalArg(0) int arg0) {
		Static471.method6861();
		@Pc(16) int local16 = Static637.aClass301_1.method7170(arg0).anInt9217;
		if (local16 == 0) {
			return;
		}
		@Pc(25) int local25 = Static413.aClass118_1.anIntArray137[arg0];
		if (local16 == 6) {
			Static572.anInt6194 = local25;
		}
		if (local16 == 5) {
			Static654.anInt10547 = local25;
		}
	}
}
