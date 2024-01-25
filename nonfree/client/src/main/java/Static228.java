import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static228 {

	@OriginalMember(owner = "client!om", name = "c", descriptor = "F")
	public static float aFloat73;

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(IIIIII)V")
	public static void method4084(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(10) int local10 = arg4 - arg2;
		@Pc(15) int local15 = arg1 - arg0;
		if (local10 == 0) {
			if (local15 != 0) {
				Static82.method1381(arg1, arg2, arg0, arg3);
			}
		} else if (local15 == 0) {
			Static328.method5458(arg2, arg0, arg3, arg4);
		} else {
			@Pc(52) int local52 = (local15 << 12) / local10;
			@Pc(61) int local61 = arg0 - (arg2 * local52 >> 12);
			@Pc(81) int local81;
			@Pc(79) int local79;
			if (Static311.anInt5837 > arg2) {
				local79 = local61 + (Static311.anInt5837 * local52 >> 12);
				local81 = Static311.anInt5837;
			} else if (Static265.anInt4933 < arg2) {
				local79 = (Static265.anInt4933 * local52 >> 12) + local61;
				local81 = Static265.anInt4933;
			} else {
				local79 = arg0;
				local81 = arg2;
			}
			@Pc(109) int local109;
			@Pc(118) int local118;
			if (arg4 < Static311.anInt5837) {
				local109 = Static311.anInt5837;
				local118 = local61 + (Static311.anInt5837 * local52 >> 12);
			} else if (Static265.anInt4933 < arg4) {
				local118 = local61 + (Static265.anInt4933 * local52 >> 12);
				local109 = Static265.anInt4933;
			} else {
				local109 = arg4;
				local118 = arg1;
			}
			if (Static327.anInt3039 > local79) {
				local81 = (Static327.anInt3039 - local61 << 12) / local52;
				local79 = Static327.anInt3039;
			} else if (local79 > Static230.anInt4308) {
				local79 = Static230.anInt4308;
				local81 = (Static230.anInt4308 - local61 << 12) / local52;
			}
			if (local118 < Static327.anInt3039) {
				local118 = Static327.anInt3039;
				local109 = (Static327.anInt3039 - local61 << 12) / local52;
			} else if (Static230.anInt4308 < local118) {
				local118 = Static230.anInt4308;
				local109 = (Static230.anInt4308 - local61 << 12) / local52;
			}
			Static13.method225(local79, local81, local118, local109, arg3);
		}
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(II)I")
	public static int method4088(@OriginalArg(1) int arg0) {
		return arg0 >>> 7;
	}
}
