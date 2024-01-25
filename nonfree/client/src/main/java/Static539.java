import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static539 {

	@OriginalMember(owner = "client!tea", name = "c", descriptor = "Z")
	public static boolean aBoolean658;

	@OriginalMember(owner = "client!tea", name = "e", descriptor = "I")
	public static int anInt8993;

	@OriginalMember(owner = "client!tea", name = "h", descriptor = "[Lclient!kr;")
	public static Class20[] aClass20Array13;

	@OriginalMember(owner = "client!tea", name = "a", descriptor = "(ILclient!da;ILclient!dm;IILjava/lang/String;BILclient!fp;ILclient!aa;)V")
	public static void method7531(@OriginalArg(0) int arg0, @OriginalArg(1) Class64 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class78 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) String arg6, @OriginalArg(8) int arg7, @OriginalArg(9) Class114 arg8, @OriginalArg(10) int arg9, @OriginalArg(11) Class1 arg10) {
		@Pc(19) int local19;
		if (Static2.anInt31 == 4) {
			local19 = (int) Static378.aFloat160 & 0x3FFF;
		} else {
			local19 = (int) Static378.aFloat160 + Static415.anInt7576 & 0x3FFF;
		}
		@Pc(37) int local37 = Math.max(arg3.anInt1964 / 2, arg3.anInt1991 / 2) + 10;
		@Pc(45) int local45 = arg2 * arg2 + arg0 * arg0;
		if (local37 * local37 < local45) {
			return;
		}
		@Pc(55) int local55 = Class353.anIntArray681[local19];
		@Pc(59) int local59 = Class353.anIntArray682[local19];
		if (Static2.anInt31 != 4) {
			local59 = local59 * 256 / (Static30.anInt6668 + 256);
			local55 = local55 * 256 / (Static30.anInt6668 + 256);
		}
		@Pc(89) int local89 = arg0 * local55 + local59 * arg2 >> 14;
		@Pc(99) int local99 = local59 * arg0 - local55 * arg2 >> 14;
		@Pc(106) int local106 = arg8.method3012(100, null, arg6);
		@Pc(114) int local114 = arg8.method3017(null, 0, 100, arg6);
		@Pc(120) int local120 = local89 - local106 / 2;
		if (-arg3.anInt1964 <= local120 && arg3.anInt1964 >= local120 && local99 >= -arg3.anInt1991 && arg3.anInt1991 >= local99) {
			arg1.method7490(0, arg5, arg3.anInt1964 / 2 + arg5 + local120, null, arg4 + arg3.anInt1991 / 2 - local114 - arg7 - local99, 50, arg10, 0, local106, arg9, arg6, 1, 0, arg4, null);
		}
	}

	@OriginalMember(owner = "client!tea", name = "a", descriptor = "(II)Z")
	public static boolean method7533(@OriginalArg(1) int arg0) {
		if (arg0 == 6 || arg0 == 20 || arg0 == 13 || arg0 == 49 || arg0 == 5) {
			return true;
		} else {
			return arg0 == 10 || arg0 == 1006;
		}
	}

	@OriginalMember(owner = "client!tea", name = "a", descriptor = "(Z)V")
	public static void method7534() {
		for (@Pc(9) int local9 = 0; local9 < 100; local9++) {
			Static618.aBooleanArray50[local9] = true;
		}
	}
}
