import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static322 {

	@OriginalMember(owner = "client!qg", name = "E", descriptor = "F")
	public static float aFloat160;

	@OriginalMember(owner = "client!qg", name = "F", descriptor = "I")
	public static int anInt5750;

	@OriginalMember(owner = "client!qg", name = "H", descriptor = "[I")
	public static int[] anIntArray502 = new int[2];

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(IIIBI)V")
	public static void method4428(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (arg2 >= Static388.anInt6740 && Static387.anInt6727 >= arg2) {
			@Pc(30) int local30 = Static360.method5003(Static198.anInt3778, Static414.anInt7043, arg3);
			@Pc(36) int local36 = Static360.method5003(Static198.anInt3778, Static414.anInt7043, arg1);
			Static31.method579(local30, arg0, arg2, local36);
		}
	}
}
