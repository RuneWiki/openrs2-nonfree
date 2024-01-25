import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static162 {

	@OriginalMember(owner = "client!ic", name = "b", descriptor = "I")
	public static int anInt2876;

	@OriginalMember(owner = "client!ic", name = "j", descriptor = "Ljava/lang/String;")
	public static String aString46;

	@OriginalMember(owner = "client!ic", name = "l", descriptor = "Lclient!hh;")
	public static Class109 aClass109_37;

	@OriginalMember(owner = "client!ic", name = "c", descriptor = "Lclient!ob;")
	public static final Class179 aClass179_3 = new Class179("", 17);

	@OriginalMember(owner = "client!ic", name = "i", descriptor = "Lclient!vp;")
	public static final Class254 aClass254_63 = new Class254(53, 2);

	@OriginalMember(owner = "client!ic", name = "k", descriptor = "[I")
	public static int[] anIntArray219 = new int[2];

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(IIIIII)V")
	public static void method2536(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg1 >= Static47.anInt762 && Static60.anInt1086 >= arg4 && Static357.anInt6537 <= arg0 && arg2 <= Static85.anInt1517) {
			Static11.method191(arg0, arg2, arg3, arg1, arg4);
		} else {
			Static414.method5614(arg1, arg3, arg4, arg0, arg2);
		}
	}

	@OriginalMember(owner = "client!ic", name = "c", descriptor = "(I)[Lclient!ne;")
	public static Class173[] method2537() {
		if (Static233.aClass173Array1 == null) {
			@Pc(7) Class173[] local7 = Static304.method4178(Static403.aClass42_6);
			@Pc(11) Class173[] local11 = new Class173[local7.length];
			@Pc(13) int local13 = 0;
			@Pc(66) int local66;
			@Pc(72) Class173 local72;
			label63: for (@Pc(15) int local15 = 0; local15 < local7.length; local15++) {
				@Pc(21) Class173 local21 = local7[local15];
				if ((local21.anInt4480 <= 0 || local21.anInt4480 >= 24) && local21.anInt4475 >= 800 && local21.anInt4476 >= 600 && (Static188.anInt3481 >= 96 || Static146.anInt2664 != 0 || local21.anInt4475 <= 1024 && local21.anInt4476 <= 768)) {
					for (local66 = 0; local66 < local13; local66++) {
						local72 = local11[local66];
						if (local72.anInt4475 == local21.anInt4475 && local72.anInt4476 == local21.anInt4476) {
							if (local21.anInt4480 > local72.anInt4480) {
								local11[local66] = local21;
							}
							continue label63;
						}
					}
					local11[local13] = local21;
					local13++;
				}
			}
			Static233.aClass173Array1 = new Class173[local13];
			Static459.method1551(local11, 0, Static233.aClass173Array1, 0, local13);
			@Pc(128) int[] local128 = new int[Static233.aClass173Array1.length];
			for (local66 = 0; local66 < Static233.aClass173Array1.length; local66++) {
				local72 = Static233.aClass173Array1[local66];
				local128[local66] = local72.anInt4476 * local72.anInt4475;
			}
			Static380.method5361(local128, Static233.aClass173Array1);
		}
		return Static233.aClass173Array1;
	}
}
