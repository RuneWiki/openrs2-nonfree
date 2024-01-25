import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static439 {

	@OriginalMember(owner = "client!pm", name = "b", descriptor = "J")
	public static long aLong173;

	@OriginalMember(owner = "client!pm", name = "c", descriptor = "I")
	public static int anInt6758 = -60;

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(IZILclient!bs;B)V")
	public static void method5792(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class20_Sub2_Sub2_Sub1_Sub1 arg2) {
		@Pc(10) int local10 = arg2.anIntArray335[0];
		@Pc(15) int local15 = arg2.anIntArray336[0];
		if (local10 < 0 || local10 >= Static442.anInt7975 || local15 < 0 || local15 >= Static284.anInt7916 || (arg0 < 0 || arg0 >= Static442.anInt7975 || arg1 < 0 || arg1 >= Static284.anInt7916)) {
			return;
		}
		@Pc(74) int local74 = Static108.method1764(local15, local10, arg0, 0, true, -4, 0, 0, Static297.anIntArray433, Static619.aClass319Array1[arg2.aByte131], arg1, 0, arg2.method4913(), Static647.anIntArray649);
		if (local74 >= 1 && local74 <= 3) {
			for (@Pc(88) int local88 = 0; local88 < local74 - 1; local88++) {
				arg2.method1031((byte) 2, Static297.anIntArray433[local88], Static647.anIntArray649[local88]);
			}
		}
	}
}
