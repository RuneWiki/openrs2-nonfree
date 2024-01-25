import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static125 {

	@OriginalMember(owner = "client!eda", name = "x", descriptor = "I")
	public static int anInt2572;

	@OriginalMember(owner = "client!eda", name = "g", descriptor = "Lclient!ss;")
	public static final Class326 aClass326_1 = new Class326();

	@OriginalMember(owner = "client!eda", name = "a", descriptor = "(BJ)V")
	public static void method2359(@OriginalArg(1) long arg0) {
		Static379.aCalendar20.setTime(new Date(arg0));
	}

	@OriginalMember(owner = "client!eda", name = "a", descriptor = "(ILclient!jp;)V")
	public static void method2361(@OriginalArg(1) Class3_Sub25 arg0) {
		if (arg0.aByteArray106.length - arg0.anInt9765 < 1) {
			return;
		}
		@Pc(22) int local22 = arg0.method8632();
		if (local22 < 0 || local22 > 1 || arg0.aByteArray106.length - arg0.anInt9765 < 2) {
			return;
		}
		@Pc(45) int local45 = arg0.method8593();
		if (local45 * 6 > arg0.aByteArray106.length - arg0.anInt9765) {
			return;
		}
		for (@Pc(62) int local62 = 0; local62 < local45; local62++) {
			@Pc(68) int local68 = arg0.method8593();
			@Pc(74) int local74 = arg0.method8618();
			if (local68 < Static449.anIntArray636.length && Static487.aBooleanArray38[local68] && (Static399.aClass32_1.method939(local68).aChar2 != '1' || local74 >= -1 && local74 <= 1)) {
				Static449.anIntArray636[local68] = local74;
			}
		}
	}
}
