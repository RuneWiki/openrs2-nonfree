import java.awt.Color;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static553 {

	@OriginalMember(owner = "client!ve", name = "h", descriptor = "I")
	public static int anInt9932;

	@OriginalMember(owner = "client!ve", name = "b", descriptor = "Lclient!ft;")
	public static final Class110 aClass110_38 = new Class110(6, 4);

	@OriginalMember(owner = "client!ve", name = "d", descriptor = "Lclient!oca;")
	public static final Class237 aClass237_13 = new Class237();

	@OriginalMember(owner = "client!ve", name = "e", descriptor = "[Ljava/awt/Color;")
	public static final Color[] aColorArray6 = new Color[] { new Color(9179409), new Color(16777215) };

	@OriginalMember(owner = "client!ve", name = "f", descriptor = "[I")
	public static final int[] anIntArray655 = new int[8];

	@OriginalMember(owner = "client!ve", name = "g", descriptor = "Z")
	public static boolean aBoolean825 = false;

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(II)Lclient!en;")
	public static Class87 method8063(@OriginalArg(0) int arg0) {
		@Pc(8) Class87[] local8 = Static167.method3101();
		for (@Pc(15) int local15 = 0; local15 < local8.length; local15++) {
			@Pc(20) Class87 local20 = local8[local15];
			if (arg0 == local20.anInt2743) {
				return local20;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(IIIIIIIIII)V")
	public static void method8064(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (arg8 == arg3 && arg6 == arg4 && arg2 == arg0 && arg7 == arg5) {
			Static223.method3822(arg5, arg8, arg1, arg2, arg6);
			return;
		}
		@Pc(31) int local31 = arg8;
		@Pc(33) int local33 = arg6;
		@Pc(37) int local37 = arg8 * 3;
		@Pc(41) int local41 = arg6 * 3;
		@Pc(45) int local45 = arg3 * 3;
		@Pc(49) int local49 = arg4 * 3;
		@Pc(53) int local53 = arg0 * 3;
		@Pc(57) int local57 = arg7 * 3;
		@Pc(67) int local67 = arg2 + local45 - local53 - arg8;
		@Pc(77) int local77 = arg5 + local49 - local57 - arg6;
		@Pc(87) int local87 = local37 + local53 - local45 - local45;
		@Pc(97) int local97 = local41 + local57 - local49 - local49;
		@Pc(102) int local102 = local45 - local37;
		@Pc(106) int local106 = local49 - local41;
		for (@Pc(108) int local108 = 128; local108 <= 4096; local108 += 128) {
			@Pc(116) int local116 = local108 * local108 >> 12;
			@Pc(122) int local122 = local108 * local116 >> 12;
			@Pc(126) int local126 = local67 * local122;
			@Pc(130) int local130 = local77 * local122;
			@Pc(134) int local134 = local116 * local87;
			@Pc(138) int local138 = local116 * local97;
			@Pc(142) int local142 = local102 * local108;
			@Pc(146) int local146 = local108 * local106;
			@Pc(156) int local156 = (local126 + local134 + local142 >> 12) + arg8;
			@Pc(167) int local167 = (local146 + local130 + local138 >> 12) + arg6;
			Static223.method3822(local167, local31, arg1, local156, local33);
			local31 = local156;
			local33 = local167;
		}
	}
}
