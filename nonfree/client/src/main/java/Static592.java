import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static592 {

	@OriginalMember(owner = "client!ub", name = "u", descriptor = "Lclient!wia;")
	public static Class386 aClass386_21;

	@OriginalMember(owner = "client!ub", name = "q", descriptor = "Lclient!bu;")
	public static final Class44 aClass44_45 = new Class44(94, 9);

	@OriginalMember(owner = "client!ub", name = "s", descriptor = "F")
	public static float aFloat50 = 1.0F;

	@OriginalMember(owner = "client!ub", name = "t", descriptor = "Lclient!fba;")
	public static final Class100 aClass100_28 = new Class100(1, 2);

	@OriginalMember(owner = "client!ub", name = "v", descriptor = "I")
	public static int anInt1870 = 0;

	@OriginalMember(owner = "client!ub", name = "w", descriptor = "[I")
	public static final int[] anIntArray137 = new int[13];

	@OriginalMember(owner = "client!ub", name = "x", descriptor = "Z")
	public static boolean aBoolean153 = false;

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(IIIIIIIIII)V")
	public static void method1598(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(9) int arg8) {
		if (arg7 >= Static313.anInt9045 && arg7 <= Static575.anInt9879 && arg0 >= Static313.anInt9045 && Static575.anInt9879 >= arg0 && arg6 >= Static313.anInt9045 && arg6 <= Static575.anInt9879 && arg1 >= Static313.anInt9045 && Static575.anInt9879 >= arg1 && Static468.anInt355 <= arg4 && arg4 <= Static370.anInt10475 && Static468.anInt355 <= arg5 && Static370.anInt10475 >= arg5 && arg3 >= Static468.anInt355 && arg3 <= Static370.anInt10475 && Static468.anInt355 <= arg8 && arg8 <= Static370.anInt10475) {
			Static156.method2525(arg2, arg6, arg3, arg4, arg1, arg0, arg5, arg7, arg8);
		} else {
			Static251.method3686(arg4, arg5, arg1, arg3, arg7, arg2, arg8, arg6, arg0);
		}
	}

	@OriginalMember(owner = "client!ub", name = "c", descriptor = "(B)V")
	public static void method1599() {
		@Pc(8) Class14_Sub3_Sub9 local8 = Static142.method2219(0L, 15);
		local8.method2822();
	}

	@OriginalMember(owner = "client!ub", name = "b", descriptor = "(II)S")
	public static short method1600(@OriginalArg(1) int arg0) {
		@Pc(9) int local9 = arg0 >> 10 & 0x3F;
		@Pc(15) int local15 = arg0 >> 3 & 0x70;
		@Pc(19) int local19 = arg0 & 0x7F;
		@Pc(36) int local36 = local19 > 64 ? (127 - local19) * local15 >> 7 : local19 * local15 >> 7;
		@Pc(41) int local41 = local19 + local36;
		@Pc(52) int local52;
		if (local41 == 0) {
			local52 = local36 << 1;
		} else {
			local52 = (local36 << 8) / local41;
		}
		return (short) (local41 | local52 >> 4 << 7 | local9 << 10);
	}
}
