import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static186 {

	@OriginalMember(owner = "client!gja", name = "k", descriptor = "Lclient!hka;")
	public static Class147 aClass147_1;

	@OriginalMember(owner = "client!gja", name = "b", descriptor = "I")
	public static final int anInt3181 = -1;

	@OriginalMember(owner = "client!gja", name = "a", descriptor = "(BI)Z")
	public static boolean method2659(@OriginalArg(1) int arg0) {
		if (arg0 == 58 || arg0 == 4 || arg0 == 51 || arg0 == 13 || arg0 == 23) {
			return true;
		} else {
			return arg0 == 47 || arg0 == 1004;
		}
	}

	@OriginalMember(owner = "client!gja", name = "a", descriptor = "(IIIZII)V")
	public static void method2661(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(10) int local10 = arg3 - arg1;
		@Pc(15) int local15 = arg0 - arg4;
		if (local10 == 0) {
			if (local15 != 0) {
				Static510.method7255(arg4, arg0, arg2, arg1);
			}
		} else if (local15 == 0) {
			Static324.method4612(arg3, arg2, arg4, arg1);
		} else {
			@Pc(44) int local44 = (local15 << 12) / local10;
			@Pc(52) int local52 = arg4 - (arg1 * local44 >> 12);
			@Pc(76) int local76;
			@Pc(74) int local74;
			if (arg3 < Static502.anInt8456) {
				local74 = local52 + (local44 * Static502.anInt8456 >> 12);
				local76 = Static502.anInt8456;
			} else if (arg3 > Static153.anInt2554) {
				local74 = local52 + (local44 * Static153.anInt2554 >> 12);
				local76 = Static153.anInt2554;
			} else {
				local74 = arg0;
				local76 = arg3;
			}
			@Pc(100) int local100;
			@Pc(109) int local109;
			if (Static502.anInt8456 > arg1) {
				local100 = Static502.anInt8456;
				local109 = local52 + (Static502.anInt8456 * local44 >> 12);
			} else if (Static153.anInt2554 < arg1) {
				local109 = (local44 * Static153.anInt2554 >> 12) + local52;
				local100 = Static153.anInt2554;
			} else {
				local100 = arg1;
				local109 = arg4;
			}
			if (Static55.anInt4238 > local109) {
				local100 = (Static55.anInt4238 - local52 << 12) / local44;
				local109 = Static55.anInt4238;
			} else if (local109 > Static292.anInt4921) {
				local100 = (Static292.anInt4921 - local52 << 12) / local44;
				local109 = Static292.anInt4921;
			}
			if (Static55.anInt4238 > local74) {
				local74 = Static55.anInt4238;
				local76 = (Static55.anInt4238 - local52 << 12) / local44;
			} else if (Static292.anInt4921 < local74) {
				local74 = Static292.anInt4921;
				local76 = (Static292.anInt4921 - local52 << 12) / local44;
			}
			Static280.method4104(local74, local109, local100, local76, arg2);
		}
	}
}
