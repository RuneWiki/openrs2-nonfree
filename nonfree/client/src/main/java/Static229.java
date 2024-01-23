import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static229 {

	@OriginalMember(owner = "client!ql", name = "u", descriptor = "I")
	public static int anInt4595 = 0;

	@OriginalMember(owner = "client!ql", name = "v", descriptor = "[J")
	public static long[] aLongArray8 = new long[100];

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(ZILclient!wi;IIZ)V")
	public static void method3598(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class186 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (Static111.anInt2210 >= 50 || (arg2 == null || arg2.anIntArrayArray42 == null || arg2.anIntArrayArray42.length <= arg4 || arg2.anIntArrayArray42[arg4] == null)) {
			return;
		}
		@Pc(34) int local34 = arg2.anIntArrayArray42[arg4][0];
		@Pc(38) int local38 = local34 >> 8;
		@Pc(58) int local58;
		if (arg2.anIntArrayArray42[arg4].length > 1) {
			local58 = (int) (Math.random() * (double) arg2.anIntArrayArray42[arg4].length);
			if (local58 > 0) {
				local38 = arg2.anIntArrayArray42[arg4][local58];
			}
		}
		@Pc(75) int local75 = local34 & 0x1F;
		@Pc(81) int local81 = local34 >> 5 & 0x7;
		if (local75 == 0) {
			if (arg0) {
				Static288.method4505(255, local38, 0, local81);
			}
		} else if (Static192.anInt815 != 0) {
			@Pc(110) int local110 = (arg1 - 64) / 128;
			Static246.anIntArray384[Static111.anInt2210] = local38;
			Static161.anIntArray270[Static111.anInt2210] = local81;
			Static32.anIntArray84[Static111.anInt2210] = 0;
			local58 = (arg3 - 64) / 128;
			Static68.aClass56Array2[Static111.anInt2210] = null;
			Static173.anIntArray293[Static111.anInt2210] = 255;
			Static97.anIntArray371[Static111.anInt2210] = local75 + (local58 << 16) + (local110 << 8);
			Static111.anInt2210++;
		}
	}

	@OriginalMember(owner = "client!ql", name = "f", descriptor = "(I)V")
	public static void method3599() {
		if (!Static145.aBoolean386) {
			return;
		}
		@Pc(19) Class97 local19 = Static77.method1320(Static109.anInt2178, Static144.anInt2858);
		if (local19 != null && local19.anObjectArray10 != null) {
			@Pc(30) Class4_Sub23 local30 = new Class4_Sub23();
			local30.anObjectArray32 = local19.anObjectArray10;
			local30.aClass97_15 = local19;
			Static145.method4497(local30);
		}
		Static145.aBoolean386 = false;
		Static60.anInt1341 = -1;
		Static178.method2927(local19);
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(IB)I")
	public static int method3601(@OriginalArg(0) int arg0) {
		if (arg0 <= 0) {
			return arg0 < 0 ? -1 : 0;
		} else {
			return 1;
		}
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(III)V")
	public static void method3602(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class4_Sub2_Sub15 local8 = Static131.method1210(arg0, 5);
		local8.method2876();
		local8.anInt3536 = arg1;
	}
}
