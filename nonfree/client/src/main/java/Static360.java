import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static360 {

	@OriginalMember(owner = "client!um", name = "c", descriptor = "I")
	public static int anInt3947;

	@OriginalMember(owner = "client!um", name = "b", descriptor = "Lclient!gp;")
	public static final Class94 aClass94_7 = new Class94("stellardawn", 1);

	@OriginalMember(owner = "client!um", name = "d", descriptor = "Lclient!sl;")
	public static final Class213 aClass213_16 = new Class213("", 15);

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(IBLclient!bg;II)V")
	public static void method3252(@OriginalArg(2) Class25_Sub1_Sub1_Sub1 arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2) {
		@Pc(15) int local15 = arg0.anIntArray296[0];
		@Pc(20) int local20 = arg0.anIntArray295[0];
		if (local15 < 0 || Static92.anInt1675 <= local15 || local20 < 0 || Static262.anInt6340 <= local20 || (arg1 < 0 || arg1 >= Static92.anInt1675 || arg2 < 0 || Static262.anInt6340 <= arg2)) {
			return;
		}
		@Pc(71) int local71 = Static126.method1835(0, arg0.method1877(), local15, Static42.anIntArray123, 0, Static257.aClass222Array1[arg0.aByte70], arg2, Static48.anIntArray134, arg1, 0, local20, -4, true, 0);
		if (local71 >= 1) {
			for (@Pc(79) int local79 = 0; local79 < local71 - 1; local79++) {
				arg0.method465(Static48.anIntArray134[local79], Static42.anIntArray123[local79], (byte) 2);
			}
		}
	}
}
