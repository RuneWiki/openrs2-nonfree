import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static162 {

	@OriginalMember(owner = "client!ffa", name = "e", descriptor = "I")
	public static int anInt2990 = 0;

	@OriginalMember(owner = "client!ffa", name = "j", descriptor = "Lclient!vl;")
	public static final Class376 aClass376_42 = new Class376(85, 8);

	@OriginalMember(owner = "client!ffa", name = "m", descriptor = "S")
	public static short aShort37 = 32767;

	@OriginalMember(owner = "client!ffa", name = "a", descriptor = "(IIIIII)V")
	public static void method2743(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		Static409.anInt6761 = arg1;
		Static290.anInt5356 = arg3;
		Static452.anInt7747 = arg0;
		Static108.anInt2245 = arg2;
		Static404.anInt6908 = arg4;
		if (Static452.anInt7747 >= 100) {
			@Pc(30) int local30 = Static409.anInt6761 * 512 + 256;
			@Pc(36) int local36 = Static108.anInt2245 * 512 + 256;
			@Pc(45) int local45 = Static194.method5133(local30, local36, Static576.anInt9136) - Static404.anInt6908;
			@Pc(49) int local49 = local30 - Static97.anInt2082;
			@Pc(54) int local54 = local45 - Static265.anInt9363;
			@Pc(59) int local59 = local36 - Static663.anInt10236;
			@Pc(70) int local70 = (int) Math.sqrt((double) (local49 * local49 + local59 * local59));
			Static118.anInt2323 = (int) (Math.atan2((double) local54, (double) local70) * 2607.5945876176133D) & 0x3FFF;
			Static206.anInt3821 = (int) (Math.atan2((double) local49, (double) local59) * -2607.5945876176133D) & 0x3FFF;
			Static260.anInt4898 = 0;
			if (Static118.anInt2323 < 1024) {
				Static118.anInt2323 = 1024;
			}
			if (Static118.anInt2323 > 3072) {
				Static118.anInt2323 = 3072;
			}
		}
		Static378.anInt6662 = 2;
		Static18.anInt682 = -1;
		Static65.anInt1581 = -1;
	}
}
