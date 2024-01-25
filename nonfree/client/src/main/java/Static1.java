import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static1 {

	@OriginalMember(owner = "client!a", name = "S", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray4;

	@OriginalMember(owner = "client!a", name = "P", descriptor = "Lclient!vq;")
	public static final Class217 aClass217_1 = new Class217(33, -1);

	@OriginalMember(owner = "client!a", name = "Q", descriptor = "Lclient!ei;")
	public static final Class44 aClass44_1 = new Class44(64);

	@OriginalMember(owner = "client!a", name = "R", descriptor = "[I")
	public static final int[] anIntArray1 = new int[32];

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(BI)I")
	public static int method45(@OriginalArg(1) int arg0) {
		@Pc(13) int local13 = arg0 * (arg0 * arg0 >> 12) >> 12;
		@Pc(24) int local24 = arg0 * 6 - 61440;
		@Pc(32) int local32 = (local24 * arg0 >> 12) + 40960;
		return local13 * local32 >> 12;
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(Lclient!uk;IIII)V")
	public static void method46(@OriginalArg(0) Class172 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg1 == 1 && arg3 > 0) {
			Static148.method2877(arg0, arg2, arg3 - 1, arg4);
		} else if (arg1 == 4 && arg3 <= Static300.anInt5778) {
			Static148.method2877(arg0, arg2, arg3 + 1, arg4);
		} else if (arg1 == 8 && arg4 > 0) {
			Static148.method2877(arg0, arg2, arg3, arg4 - 1);
		} else if (arg1 == 2 && arg4 <= Static354.anInt6714) {
			Static148.method2877(arg0, arg2, arg3, arg4 + 1);
		} else if (arg1 == 16 && arg3 > 0 && arg4 <= Static354.anInt6714) {
			Static148.method2877(arg0, arg2, arg3 - 1, arg4 + 1);
		} else if (arg1 == 32 && arg3 <= Static300.anInt5778 && arg4 <= Static354.anInt6714) {
			Static148.method2877(arg0, arg2, arg3 + 1, arg4 + 1);
		} else if (arg1 == 128 && arg3 > 0 && arg4 > 0) {
			Static148.method2877(arg0, arg2, arg3 - 1, arg4 - 1);
		} else if (arg1 == 64 && arg3 <= Static300.anInt5778 && arg4 > 0) {
			Static148.method2877(arg0, arg2, arg3 + 1, arg4 - 1);
		} else {
			throw new RuntimeException("Unsupported wall shape " + arg1 + " in world2.setclosestlights_wall");
		}
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(IIIIII)V")
	public static void method47(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(10) int local10 = arg0 - arg2;
		@Pc(15) int local15 = arg1 - arg3;
		if (local10 == 0) {
			if (local15 != 0) {
				Static177.method3448(arg2, arg4, arg1, arg3);
			}
		} else if (local15 == 0) {
			Static281.method5011(arg0, arg4, arg3, arg2);
		} else {
			@Pc(49) int local49 = (local15 << 12) / local10;
			@Pc(58) int local58 = arg3 - (local49 * arg2 >> 12);
			@Pc(71) int local71;
			@Pc(69) int local69;
			if (Static93.anInt5014 > arg2) {
				local69 = local58 + (local49 * Static93.anInt5014 >> 12);
				local71 = Static93.anInt5014;
			} else if (arg2 <= Static122.anInt1360) {
				local69 = arg3;
				local71 = arg2;
			} else {
				local69 = local58 + (local49 * Static122.anInt1360 >> 12);
				local71 = Static122.anInt1360;
			}
			@Pc(113) int local113;
			@Pc(115) int local115;
			if (arg0 < Static93.anInt5014) {
				local113 = Static93.anInt5014;
				local115 = local58 + (local49 * Static93.anInt5014 >> 12);
			} else if (Static122.anInt1360 >= arg0) {
				local113 = arg0;
				local115 = arg1;
			} else {
				local115 = local58 + (local49 * Static122.anInt1360 >> 12);
				local113 = Static122.anInt1360;
			}
			if (local115 < Static131.anInt2843) {
				local115 = Static131.anInt2843;
				local113 = (Static131.anInt2843 - local58 << 12) / local49;
			} else if (Static38.anInt945 < local115) {
				local115 = Static38.anInt945;
				local113 = (Static38.anInt945 - local58 << 12) / local49;
			}
			if (local69 < Static131.anInt2843) {
				local69 = Static131.anInt2843;
				local71 = (Static131.anInt2843 - local58 << 12) / local49;
			} else if (Static38.anInt945 < local69) {
				local71 = (Static38.anInt945 - local58 << 12) / local49;
				local69 = Static38.anInt945;
			}
			Static324.method5526(local69, local71, arg4, local115, local113);
		}
	}

	@OriginalMember(owner = "client!a", name = "b", descriptor = "(II)I")
	public static int method48(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static118.anIntArrayArray20 == null ? 0 : Static118.anIntArrayArray20[arg0][arg1] >>> 21 & 0x7F8;
	}
}
