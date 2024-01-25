import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static423 {

	@OriginalMember(owner = "client!rq", name = "J", descriptor = "J")
	public static long aLong318 = 0L;

	@OriginalMember(owner = "client!rq", name = "a", descriptor = "(IIBIII)V")
	public static void method6197(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(10) int local10 = arg3 - arg0;
		@Pc(23) int local23 = arg2 - arg1;
		if (local10 == 0) {
			if (local23 != 0) {
				Static59.method1112(arg0, arg4, arg1, arg2);
			}
		} else if (local23 == 0) {
			Static44.method915(arg1, arg4, arg3, arg0);
		} else {
			@Pc(58) int local58 = (local23 << 12) / local10;
			@Pc(67) int local67 = arg1 - (local58 * arg0 >> 12);
			@Pc(72) int local72;
			@Pc(80) int local80;
			if (Static358.anInt8908 > arg3) {
				local72 = Static358.anInt8908;
				local80 = (local58 * Static358.anInt8908 >> 12) + local67;
			} else if (arg3 > Static216.anInt4203) {
				local80 = (local58 * Static216.anInt4203 >> 12) + local67;
				local72 = Static216.anInt4203;
			} else {
				local80 = arg2;
				local72 = arg3;
			}
			@Pc(111) int local111;
			@Pc(109) int local109;
			if (Static358.anInt8908 > arg0) {
				local109 = local67 + (Static358.anInt8908 * local58 >> 12);
				local111 = Static358.anInt8908;
			} else if (arg0 <= Static216.anInt4203) {
				local109 = arg1;
				local111 = arg0;
			} else {
				local109 = local67 + (local58 * Static216.anInt4203 >> 12);
				local111 = Static216.anInt4203;
			}
			if (local109 < Static99.anInt1988) {
				local111 = (Static99.anInt1988 - local67 << 12) / local58;
				local109 = Static99.anInt1988;
			} else if (local109 > Static205.anInt4042) {
				local111 = (Static205.anInt4042 - local67 << 12) / local58;
				local109 = Static205.anInt4042;
			}
			if (local80 < Static99.anInt1988) {
				local72 = (Static99.anInt1988 - local67 << 12) / local58;
				local80 = Static99.anInt1988;
			} else if (local80 > Static205.anInt4042) {
				local80 = Static205.anInt4042;
				local72 = (Static205.anInt4042 - local67 << 12) / local58;
			}
			Static24.method570(arg4, local72, local111, local80, local109);
		}
	}

	@OriginalMember(owner = "client!rq", name = "a", descriptor = "(II)Lclient!bda;")
	public static Class21 method6198(@OriginalArg(0) int arg0) {
		@Pc(8) Class21[] local8 = Static33.method779();
		for (@Pc(10) int local10 = 0; local10 < local8.length; local10++) {
			@Pc(16) Class21 local16 = local8[local10];
			if (local16.anInt787 == arg0) {
				return local16;
			}
		}
		return null;
	}
}
