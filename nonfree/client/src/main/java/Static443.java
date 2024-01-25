import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static443 {

	@OriginalMember(owner = "client!wb", name = "e", descriptor = "[I")
	public static final int[] anIntArray727 = new int[5];

	@OriginalMember(owner = "client!wb", name = "h", descriptor = "Z")
	public static boolean aBoolean490 = false;

	@OriginalMember(owner = "client!wb", name = "v", descriptor = "I")
	public static int anInt7416 = 0;

	@OriginalMember(owner = "client!wb", name = "z", descriptor = "I")
	public static int anInt7418 = 0;

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(IIIIII)V")
	public static void method5909(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		Static448.anInt6973 = arg0;
		Static55.anInt1001 = arg4;
		Static284.anInt4989 = arg2;
		Static336.anInt5676 = arg3;
		Static169.anInt3383 = arg1;
		if (Static336.anInt5676 >= 100) {
			@Pc(30) int local30 = Static55.anInt1001 * 128 + 64;
			@Pc(36) int local36 = Static284.anInt4989 * 128 + 64;
			@Pc(44) int local44 = Static326.method4459(Static96.anInt1983, local30, local36) - Static448.anInt6973;
			@Pc(49) int local49 = local30 - Static80.anInt1679;
			@Pc(54) int local54 = local44 - Static8.anInt121;
			@Pc(59) int local59 = local36 - Static50.anInt906;
			@Pc(70) int local70 = (int) Math.sqrt((double) (local59 * local59 + local49 * local49));
			Static127.anInt2604 = (int) (Math.atan2((double) local54, (double) local70) * 2607.5945876176133D) & 0x3FFF;
			Static362.anInt6155 = (int) (Math.atan2((double) local49, (double) local59) * -2607.5945876176133D) & 0x3FFF;
			Static242.anInt5735 = 0;
			if (Static127.anInt2604 < 1024) {
				Static127.anInt2604 = 1024;
			}
			if (Static127.anInt2604 > 3072) {
				Static127.anInt2604 = 3072;
			}
		}
		Static157.anInt3176 = 2;
	}
}
