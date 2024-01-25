import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static247 {

	@OriginalMember(owner = "client!pi", name = "X", descriptor = "I")
	public static int anInt4790;

	@OriginalMember(owner = "client!pi", name = "L", descriptor = "[I")
	public static final int[] anIntArray433 = new int[] { 8, 11, 4, 6, 9, 7, 10, 0 };

	@OriginalMember(owner = "client!pi", name = "S", descriptor = "Ljava/lang/String;")
	public static final String aString179 = "red:";

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(II)I")
	public static int method4305(@OriginalArg(0) int arg0) {
		return arg0 >>> 7;
	}

	@OriginalMember(owner = "client!pi", name = "b", descriptor = "(II)Lclient!el;")
	public static Class52 method4306(@OriginalArg(1) int arg0) {
		@Pc(10) Class52 local10 = (Class52) Static189.aClass11_135.method209((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static13.aClass143_55.method3745(36, arg0);
		local10 = new Class52();
		local10.anInt1741 = arg0;
		if (local20 != null) {
			local10.method1774(new Class14_Sub4(local20));
		}
		local10.method1773();
		Static189.aClass11_135.method219((long) arg0, local10);
		return local10;
	}

	@OriginalMember(owner = "client!pi", name = "b", descriptor = "(III)I")
	public static int method4307(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(10) Class14_Sub37 local10 = (Class14_Sub37) Static316.aClass25_15.method691((long) arg0);
		if (local10 == null) {
			return 0;
		} else if (arg1 >= 0 && arg1 < local10.anIntArray612.length) {
			return local10.anIntArray612[arg1];
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(Lclient!ri;IIIII)V")
	public static void method4308(@OriginalArg(0) Class14_Sub28 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg0.anInt5308 == -1 && arg0.anIntArray480 == null) {
			return;
		}
		@Pc(16) int local16 = 0;
		@Pc(23) int local23 = arg0.anInt5309 * Static78.anInt1894 >> 8;
		if (arg4 > arg0.anInt5304) {
			local16 = arg4 - arg0.anInt5304;
		} else if (arg0.anInt5307 > arg4) {
			local16 = arg0.anInt5307 - arg4;
		}
		if (arg0.anInt5316 < arg2) {
			local16 += arg2 - arg0.anInt5316;
		} else if (arg0.anInt5298 > arg2) {
			local16 += arg0.anInt5298 - arg2;
		}
		if (arg0.anInt5313 == 0 || local16 - 64 > arg0.anInt5313 || Static78.anInt1894 == 0 || arg0.anInt5300 != arg1) {
			if (arg0.aClass14_Sub19_Sub3_2 != null) {
				Static49.aClass14_Sub19_Sub2_1.method4245(arg0.aClass14_Sub19_Sub3_2);
				arg0.aClass14_Sub19_Sub3_2 = null;
			}
			if (arg0.aClass14_Sub19_Sub3_1 != null) {
				Static49.aClass14_Sub19_Sub2_1.method4245(arg0.aClass14_Sub19_Sub3_1);
				arg0.aClass14_Sub19_Sub3_1 = null;
			}
			return;
		}
		local16 -= 64;
		if (local16 < 0) {
			local16 = 0;
		}
		@Pc(152) int local152 = local23 * (arg0.anInt5313 - local16) / arg0.anInt5313;
		if (arg0.aClass14_Sub19_Sub3_2 != null) {
			arg0.aClass14_Sub19_Sub3_2.method4844(local152);
		} else if (arg0.anInt5308 >= 0) {
			@Pc(173) Class91 local173 = Static359.method2708(Static54.aClass143_38, arg0.anInt5308, 0);
			if (local173 != null) {
				@Pc(180) Class14_Sub11_Sub1 local180 = local173.method2706().method3344(Static290.aClass204_1);
				@Pc(185) Class14_Sub19_Sub3 local185 = Static365.method4842(local180, local152);
				local185.method4840(-1);
				Static49.aClass14_Sub19_Sub2_1.method4248(local185);
				arg0.aClass14_Sub19_Sub3_2 = local185;
			}
		}
		if (arg0.aClass14_Sub19_Sub3_1 != null) {
			arg0.aClass14_Sub19_Sub3_1.method4844(local152);
			if (arg0.aClass14_Sub19_Sub3_1.method5989()) {
				return;
			}
			arg0.aClass14_Sub19_Sub3_1 = null;
		} else if (arg0.anIntArray480 != null && (arg0.anInt5315 -= arg3) <= 0) {
			@Pc(216) int local216 = (int) (Math.random() * (double) arg0.anIntArray480.length);
			@Pc(224) Class91 local224 = Static359.method2708(Static54.aClass143_38, arg0.anIntArray480[local216], 0);
			if (local224 != null) {
				@Pc(231) Class14_Sub11_Sub1 local231 = local224.method2706().method3344(Static290.aClass204_1);
				@Pc(236) Class14_Sub19_Sub3 local236 = Static365.method4842(local231, local152);
				local236.method4840(0);
				Static49.aClass14_Sub19_Sub2_1.method4248(local236);
				arg0.aClass14_Sub19_Sub3_1 = local236;
				arg0.anInt5315 = arg0.anInt5305 + (int) ((double) (arg0.anInt5301 - arg0.anInt5305) * Math.random());
				return;
			}
		}
	}

	@OriginalMember(owner = "client!pi", name = "f", descriptor = "(I)V")
	public static void method4309() {
		if (Static41.aClass46_3 != null) {
			Static41.aClass46_3.method5158();
			Static41.aClass46_3 = null;
			Static236.aClass30_2 = null;
		}
	}
}
