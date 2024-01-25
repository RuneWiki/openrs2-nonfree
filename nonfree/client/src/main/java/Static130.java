import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static130 {

	@OriginalMember(owner = "client!ew", name = "O", descriptor = "I")
	public static int anInt2959;

	@OriginalMember(owner = "client!ew", name = "a", descriptor = "()V")
	public static void method2381() {
		for (@Pc(1) int local1 = 0; local1 < Static496.anInt9339; local1++) {
			@Pc(6) Class21_Sub1_Sub1 local6 = Static80.aClass21_Sub1_Sub1Array1[local1];
			Static18.method815(local6, true);
			Static80.aClass21_Sub1_Sub1Array1[local1] = null;
		}
		Static496.anInt9339 = 0;
	}

	@OriginalMember(owner = "client!ew", name = "a", descriptor = "(IIII)I")
	public static int method2382(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(3) int local3 = arg0 & 0x3;
		if (local3 == 0) {
			return arg1;
		} else if (local3 == 1) {
			return 4095 - arg2;
		} else if (local3 == 2) {
			return 4095 - arg1;
		} else {
			return arg2;
		}
	}
}
