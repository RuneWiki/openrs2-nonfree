import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static444 {

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "I")
	public static int anInt7641;

	@OriginalMember(owner = "client!sl", name = "b", descriptor = "I")
	public static int anInt7642;

	@OriginalMember(owner = "client!sl", name = "c", descriptor = "I")
	public static int anInt7643;

	@OriginalMember(owner = "client!sl", name = "d", descriptor = "[I")
	public static final int[] anIntArray720 = new int[] { 4, 4, 1, 2, 6, 4, 2, 45, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "(Lclient!qa;ILclient!bv;II)V")
	public static void method6364(@OriginalArg(0) Class122 arg0, @OriginalArg(2) Class37 arg1) {
		Static442.aClass37_83.method967();
		if (Static439.aBoolean544) {
			return;
		}
		for (@Pc(21) Class1_Sub39 local21 = (Class1_Sub39) arg1.method977(); local21 != null; local21 = (Class1_Sub39) arg1.method971()) {
			@Pc(29) Class30 local29 = Static118.aClass272_2.method6380(local21.anInt7253);
			if (Static300.method4761(local29)) {
				@Pc(41) boolean local41 = Static132.method2209(local21, arg0, local29);
				if (local41) {
					Static206.method3557(arg0, local21, local29);
				}
			}
		}
	}
}
