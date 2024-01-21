import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static124 {

	@OriginalMember(owner = "client!n", name = "t", descriptor = "[[I")
	public static final int[][] anIntArrayArray29 = new int[5][5000];

	@OriginalMember(owner = "client!n", name = "c", descriptor = "(B)V")
	public static void method1951() {
		Static17.aClass8_7.method233();
	}

	@OriginalMember(owner = "client!n", name = "d", descriptor = "(I)V")
	public static void method1952() {
		while (true) {
			@Pc(10) Class91 local10 = Static140.aClass91_11;
			@Pc(17) Class5_Sub14 local17;
			synchronized (Static140.aClass91_11) {
				local17 = (Class5_Sub14) Static174.aClass91_16.method2683();
			}
			if (local17 == null) {
				return;
			}
			local17.aClass23_Sub1_11.method763(false, (int) local17.aLong253, local17.aClass17_3, local17.aByteArray20);
		}
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(IIIIIIII)V")
	public static void method1953(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg0 < 1 || arg2 < 1 || arg0 > 102 || arg2 > 102) {
			return;
		}
		@Pc(36) int local36;
		if (Static14.aBoolean14 && (Static168.aByteArrayArrayArray13[0][arg0][arg2] & 0x2) == 0) {
			local36 = arg5;
			if ((Static168.aByteArrayArrayArray13[arg5][arg0][arg2] & 0x8) != 0) {
				local36 = 0;
			}
			if (Static38.anInt829 != local36) {
				return;
			}
		}
		local36 = arg5;
		if (arg5 < 3 && (Static168.aByteArrayArrayArray13[1][arg0][arg2] & 0x2) == 2) {
			local36 = arg5 + 1;
		}
		Static197.method2920(arg0, Static9.aClass76Array1[arg5], arg4, local36, arg2, arg5);
		if (arg1 >= 0) {
			Static72.method1183(arg2, Static9.aClass76Array1[arg5], arg6, false, arg5, false, arg3, local36, arg0, arg1);
			return;
		}
	}
}
