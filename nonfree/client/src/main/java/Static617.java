import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static617 {

	@OriginalMember(owner = "client!vv", name = "c", descriptor = "I")
	public static int anInt10418;

	@OriginalMember(owner = "client!vv", name = "i", descriptor = "I")
	public static int anInt10422;

	@OriginalMember(owner = "client!vv", name = "j", descriptor = "I")
	public static int anInt10423 = 0;

	@OriginalMember(owner = "client!vv", name = "a", descriptor = "(ZBLclient!gv;II)V")
	public static void method8472(@OriginalArg(2) Class9_Sub4_Sub2_Sub1_Sub2 arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2) {
		@Pc(10) int local10 = arg0.anIntArray197[0];
		@Pc(15) int local15 = arg0.anIntArray198[0];
		if (local10 < 0 || local10 >= Static306.anInt6176 || local15 < 0 || local15 >= Static108.anInt2930 || (arg2 < 0 || arg2 >= Static306.anInt6176 || arg1 < 0 || arg1 >= Static108.anInt2930)) {
			return;
		}
		@Pc(87) int local87 = Static568.method2131(Static313.aClass258Array1[arg0.aByte135], arg0.method3620(), Static267.anIntArray255, 0, 0, arg1, 0, local15, Static217.anIntArray207, true, arg2, -4, local10, 0);
		if (local87 >= 1 && local87 <= 3) {
			for (@Pc(104) int local104 = 0; local104 < local87 - 1; local104++) {
				arg0.method3635((byte) 2, Static217.anIntArray207[local104], Static267.anIntArray255[local104]);
			}
		}
	}
}
