import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static1 {

	@OriginalMember(owner = "client!aa", name = "c", descriptor = "Lclient!qh;")
	public static Class286 aClass286_5;

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "I")
	public static int anInt6922 = -1;

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(IIIII)V")
	public static void method5882(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(9) float local9 = (float) Static407.anInt6536 / (float) Static407.anInt6541;
		@Pc(11) int local11 = arg2;
		@Pc(13) int local13 = arg1;
		if (local9 < 1.0F) {
			local13 = (int) ((float) arg2 * local9);
		} else {
			local11 = (int) ((float) arg1 / local9);
		}
		@Pc(39) int local39 = arg3 - (arg1 - local13) / 2;
		@Pc(47) int local47 = arg0 - (arg2 - local11) / 2;
		Static255.anInt4085 = local47 * Static407.anInt6541 / local11;
		Static361.anInt6318 = Static407.anInt6536 - local39 * Static407.anInt6536 / local13;
		Static195.anInt3145 = -1;
		Static158.anInt2662 = -1;
		Static383.method5626();
	}
}
