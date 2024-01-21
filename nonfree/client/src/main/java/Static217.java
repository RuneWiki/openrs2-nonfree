import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static217 {

	@OriginalMember(owner = "client!wh", name = "M", descriptor = "Lclient!uc;")
	public static Class100 aClass100_1;

	@OriginalMember(owner = "client!wh", name = "Y", descriptor = "Lclient!wa;")
	public static Class23 aClass23_79;

	@OriginalMember(owner = "client!wh", name = "V", descriptor = "Lclient!dc;")
	private static final Class20 aClass20_1557 = Static161.method2452("Enter your username (V password)3");

	@OriginalMember(owner = "client!wh", name = "L", descriptor = "Lclient!dc;")
	public static Class20 aClass20_1556 = aClass20_1557;

	@OriginalMember(owner = "client!wh", name = "P", descriptor = "Z")
	public static boolean aBoolean190 = false;

	@OriginalMember(owner = "client!wh", name = "S", descriptor = "I")
	public static int anInt4212 = 0;

	@OriginalMember(owner = "client!wh", name = "T", descriptor = "Lclient!fg;")
	public static final Class32 aClass32_2 = new Class32();

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(IIIIIBII)V")
	public static void method3203(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(5) int local5 = arg4 + arg3;
		@Pc(10) int local10 = arg5 - arg3;
		@Pc(14) int local14 = arg3 + arg0;
		@Pc(19) int local19 = arg6 - arg3;
		for (@Pc(25) int local25 = arg0; local25 < local14; local25++) {
			Static27.method409(arg5, arg1, Static9.anIntArrayArray1[local25], arg4);
		}
		for (@Pc(50) int local50 = arg6; local50 > local19; local50--) {
			Static27.method409(arg5, arg1, Static9.anIntArrayArray1[local50], arg4);
		}
		for (@Pc(70) int local70 = local14; local70 <= local19; local70++) {
			@Pc(76) int[] local76 = Static9.anIntArrayArray1[local70];
			Static27.method409(local5, arg1, local76, arg4);
			Static27.method409(local10, arg2, local76, local5);
			Static27.method409(arg5, arg1, local76, local10);
		}
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(Lclient!ng;B)V")
	public static void method3204(@OriginalArg(0) Class47_Sub1 arg0) {
		for (@Pc(9) int local9 = 0; local9 < Static183.anIntArray379.length; local9++) {
			Static183.anIntArray379[local9] = 0;
		}
		@Pc(48) int local48;
		for (@Pc(26) int local26 = 0; local26 < 5000; local26++) {
			local48 = (int) ((double) 256 * Math.random() * 128.0D);
			Static183.anIntArray379[local48] = (int) (Math.random() * 256.0D);
		}
		@Pc(67) int local67;
		@Pc(71) int local71;
		@Pc(79) int local79;
		for (local48 = 0; local48 < 20; local48++) {
			for (local67 = 1; local67 < 255; local67++) {
				for (local71 = 1; local71 < 127; local71++) {
					local79 = local71 + (local67 << 7);
					Static56.anIntArray110[local79] = (Static183.anIntArray379[local79 - 128] + Static183.anIntArray379[local79 - 1] + Static183.anIntArray379[local79 + 1] + Static183.anIntArray379[local79 + 128]) / 4;
				}
			}
			@Pc(119) int[] local119 = Static183.anIntArray379;
			Static183.anIntArray379 = Static56.anIntArray110;
			Static56.anIntArray110 = local119;
		}
		if (arg0 == null) {
			return;
		}
		local67 = 0;
		for (local71 = 0; local71 < arg0.anInt2709; local71++) {
			for (local79 = 0; local79 < arg0.anInt2707; local79++) {
				if (arg0.aByteArray43[local67++] != 0) {
					@Pc(152) int local152 = local79 + arg0.anInt2708 + 16;
					@Pc(159) int local159 = local71 + arg0.anInt2703 + 16;
					@Pc(166) int local166 = local152 + (local159 << 7);
					Static183.anIntArray379[local166] = 0;
				}
			}
		}
	}
}
