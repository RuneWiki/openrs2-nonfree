import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static140 {

	@OriginalMember(owner = "client!qd", name = "v", descriptor = "Lclient!nh;")
	public static Class62 aClass62_35;

	@OriginalMember(owner = "client!qd", name = "p", descriptor = "Lclient!sf;")
	public static final Class78 aClass78_2 = new Class78();

	@OriginalMember(owner = "client!qd", name = "q", descriptor = "[I")
	public static final int[] anIntArray314 = new int[1000];

	@OriginalMember(owner = "client!qd", name = "t", descriptor = "I")
	public static int anInt3262 = -2;

	@OriginalMember(owner = "client!qd", name = "B", descriptor = "I")
	public static int anInt3267 = 0;

	@OriginalMember(owner = "client!qd", name = "E", descriptor = "I")
	public static int anInt3269 = -1;

	@OriginalMember(owner = "client!qd", name = "G", descriptor = "[I")
	public static final int[] anIntArray315 = new int[32];

	@OriginalMember(owner = "client!qd", name = "H", descriptor = "Lclient!oe;")
	public static final Class66 aClass66_43 = new Class66(50);

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(Lclient!ib;IIIIII)V")
	public static void method2404(@OriginalArg(0) Class40 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(3) int local3 = arg0.anIntArray177.length;
		@Pc(13) int local13;
		@Pc(20) int local20;
		@Pc(27) int local27;
		@Pc(37) int local37;
		for (@Pc(5) int local5 = 0; local5 < local3; local5++) {
			local13 = arg0.anIntArray177[local5] - Static116.anInt2858;
			local20 = arg0.anIntArray181[local5] - Static90.anInt2341;
			local27 = arg0.anIntArray175[local5] - Static83.anInt2133;
			local37 = local27 * arg3 + local13 * arg4 >> 16;
			@Pc(47) int local47 = local27 * arg4 - local13 * arg3 >> 16;
			@Pc(59) int local59 = local20 * arg2 - local47 * arg1 >> 16;
			@Pc(69) int local69 = local20 * arg1 + local47 * arg2 >> 16;
			if (local69 < 50) {
				return;
			}
			if (arg0.anIntArray179 != null) {
				Static74.anIntArray186[local5] = local37;
				Static74.anIntArray187[local5] = local59;
				Static74.anIntArray183[local5] = local69;
			}
			Static74.anIntArray178[local5] = Static171.anInt3847 + (local37 << 9) / local69;
			Static74.anIntArray180[local5] = Static171.anInt3846 + (local59 << 9) / local69;
		}
		Static171.anInt3850 = 0;
		local3 = arg0.anIntArray184.length;
		for (local13 = 0; local13 < local3; local13++) {
			local20 = arg0.anIntArray184[local13];
			local27 = arg0.anIntArray174[local13];
			local37 = arg0.anIntArray182[local13];
			@Pc(142) int local142 = Static74.anIntArray178[local20];
			@Pc(146) int local146 = Static74.anIntArray178[local27];
			@Pc(150) int local150 = Static74.anIntArray178[local37];
			@Pc(154) int local154 = Static74.anIntArray180[local20];
			@Pc(158) int local158 = Static74.anIntArray180[local27];
			@Pc(162) int local162 = Static74.anIntArray180[local37];
			if ((local142 - local146) * (local162 - local158) - (local154 - local158) * (local150 - local146) > 0) {
				if (Static28.aBoolean38 && Static154.method3130(Static30.anInt762, Static134.anInt3184, local154, local158, local162, local142, local146, local150)) {
					Static104.anInt2621 = arg5;
					Static188.anInt4186 = arg6;
				}
				Static171.aBoolean157 = false;
				if (local142 < 0 || local146 < 0 || local150 < 0 || local142 > Static171.anInt3849 || local146 > Static171.anInt3849 || local150 > Static171.anInt3849) {
					Static171.aBoolean157 = true;
				}
				if (arg0.anIntArray179 == null || arg0.anIntArray179[local13] == -1) {
					if (arg0.anIntArray176[local13] != 12345678) {
						Static171.method2950(local154, local158, local162, local142, local146, local150, arg0.anIntArray176[local13], arg0.anIntArray185[local13], arg0.anIntArray173[local13]);
					}
				} else if (Static186.aBoolean169) {
					@Pc(363) int local363 = Static171.anInterface1_2.method381(arg0.anIntArray179[local13]);
					Static171.method2950(local154, local158, local162, local142, local146, local150, Static10.method214(local363, arg0.anIntArray176[local13]), Static10.method214(local363, arg0.anIntArray185[local13]), Static10.method214(local363, arg0.anIntArray173[local13]));
				} else if (arg0.aBoolean85) {
					Static171.method2956(local154, local158, local162, local142, local146, local150, arg0.anIntArray176[local13], arg0.anIntArray185[local13], arg0.anIntArray173[local13], Static74.anIntArray186[0], Static74.anIntArray186[1], Static74.anIntArray186[3], Static74.anIntArray187[0], Static74.anIntArray187[1], Static74.anIntArray187[3], Static74.anIntArray183[0], Static74.anIntArray183[1], Static74.anIntArray183[3], arg0.anIntArray179[local13]);
				} else {
					Static171.method2956(local154, local158, local162, local142, local146, local150, arg0.anIntArray176[local13], arg0.anIntArray185[local13], arg0.anIntArray173[local13], Static74.anIntArray186[local20], Static74.anIntArray186[local27], Static74.anIntArray186[local37], Static74.anIntArray187[local20], Static74.anIntArray187[local27], Static74.anIntArray187[local37], Static74.anIntArray183[local20], Static74.anIntArray183[local27], Static74.anIntArray183[local37], arg0.anIntArray179[local13]);
				}
			}
		}
	}
}
