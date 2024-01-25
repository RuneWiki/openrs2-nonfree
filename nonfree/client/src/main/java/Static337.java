import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static337 {

	@OriginalMember(owner = "client!r", name = "j", descriptor = "[[S")
	public static final short[][] aShortArrayArray5 = new short[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, -31839, 22433, 2983, -11343, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 8741, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 25239, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 25238, 8742, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(III)V")
	public static void method4387(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) Class7_Sub4_Sub14 local13 = Static54.method750(0, 15);
		local13.method4716();
		local13.anInt5868 = arg1;
		local13.anInt5867 = arg0;
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(Lclient!ma;Lclient!go;IIJIIII)V")
	public static void method4389(@OriginalArg(0) Class119 arg0, @OriginalArg(1) Class95 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) long arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(24) int local24 = arg2 * arg2 + arg5 * arg5;
		if (arg4 < (long) local24) {
			return;
		}
		@Pc(44) int local44 = Math.min(arg1.anInt2595 / 2, arg1.anInt2638 / 2);
		if (local24 <= local44 * local44) {
			Static299.method3997(arg6, arg5, arg0, Static21.aClass11Array3[arg3], arg7, arg1, arg2);
			return;
		}
		local44 -= 10;
		@Pc(74) int local74;
		if (Static9.anInt60 == 4) {
			local74 = (int) Static97.aFloat52 & 0x3FFF;
		} else {
			local74 = Static436.anInt7298 + (int) Static97.aFloat52 & 0x3FFF;
		}
		@Pc(85) int local85 = Class22_Sub7.anIntArray411[local74];
		@Pc(89) int local89 = Class22_Sub7.anIntArray410[local74];
		if (Static9.anInt60 != 4) {
			local85 = local85 * 256 / (Static3.anInt11 + 256);
			local89 = local89 * 256 / (Static3.anInt11 + 256);
		}
		@Pc(120) int local120 = arg5 * local89 + local85 * arg2 >> 15;
		@Pc(131) int local131 = local89 * arg2 - local85 * arg5 >> 15;
		@Pc(137) double local137 = Math.atan2((double) local120, (double) local131);
		@Pc(144) int local144 = (int) ((double) local44 * Math.sin(local137));
		@Pc(151) int local151 = (int) ((double) local44 * Math.cos(local137));
		Static407.aClass11Array14[arg3].method4393((float) arg1.anInt2595 / 2.0F + (float) arg7 + (float) local144, (float) -local151 + (float) arg6 + (float) arg1.anInt2638 / 2.0F, 4096, (int) (-local137 / 6.283185307179586D * 65535.0D));
	}
}
