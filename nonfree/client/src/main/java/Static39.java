import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static39 {

	@OriginalMember(owner = "client!de", name = "sb", descriptor = "I")
	public static int anInt965;

	@OriginalMember(owner = "client!de", name = "tb", descriptor = "Lclient!ci;")
	public static Class24 aClass24_1;

	@OriginalMember(owner = "client!de", name = "pb", descriptor = "Lclient!sf;")
	public static Class105 aClass105_5 = new Class105();

	@OriginalMember(owner = "client!de", name = "ub", descriptor = "Lclient!ia;")
	private static Class51 aClass51_276 = Static64.method1101("Loaded config");

	@OriginalMember(owner = "client!de", name = "vb", descriptor = "Lclient!ia;")
	public static Class51 aClass51_277 = aClass51_276;

	@OriginalMember(owner = "client!de", name = "wb", descriptor = "I")
	public static int anInt966 = 0;

	@OriginalMember(owner = "client!de", name = "yb", descriptor = "Lclient!ia;")
	public static Class51 aClass51_278 = Static64.method1101("hint_mapmarkers");

	@OriginalMember(owner = "client!de", name = "zb", descriptor = "Lclient!ia;")
	public static Class51 aClass51_279 = Static64.method1101("slr2)3ws?order=LPWM");

	@OriginalMember(owner = "client!de", name = "Ab", descriptor = "I")
	public static int anInt968 = 0;

	@OriginalMember(owner = "client!de", name = "d", descriptor = "(II)V")
	public static void method700() {
		Static204.aClass53_26.method1496(5);
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(IIIIIIII)V")
	public static void method702(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(3) Class31 local3 = new Class31();
		local3.anInt1152 = arg2 / 128;
		local3.anInt1151 = arg3 / 128;
		local3.anInt1149 = arg4 / 128;
		local3.anInt1150 = arg5 / 128;
		local3.anInt1136 = arg1;
		local3.anInt1146 = arg2;
		local3.anInt1135 = arg3;
		local3.anInt1137 = arg4;
		local3.anInt1154 = arg5;
		local3.anInt1138 = arg6;
		local3.anInt1148 = arg7;
		Static92.aClass31ArrayArray1[arg0][Static92.anIntArray128[arg0]++] = local3;
	}
}
