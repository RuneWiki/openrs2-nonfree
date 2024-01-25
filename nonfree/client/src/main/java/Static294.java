import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static294 {

	@OriginalMember(owner = "client!ke", name = "j", descriptor = "Lclient!k;")
	public static Class195 aClass195_1;

	@OriginalMember(owner = "client!ke", name = "d", descriptor = "Ljava/lang/String;")
	public static String aString58 = null;

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(IIZIII)V")
	public static void method4650(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg0 < 1) {
			arg0 = 1;
		}
		if (arg3 < 1) {
			arg3 = 1;
		}
		@Pc(19) int local19 = arg3 - 334;
		if (local19 < 0) {
			local19 = 0;
		} else if (local19 > 100) {
			local19 = 100;
		}
		@Pc(48) int local48 = Static377.aShort62 + local19 * (Static456.aShort81 - Static377.aShort62) / 100;
		if (local48 < Static171.aShort59) {
			local48 = Static171.aShort59;
		} else if (Static548.aShort101 < local48) {
			local48 = Static548.aShort101;
		}
		@Pc(72) int local72 = arg3 * local48 * 512 / (arg0 * 334);
		@Pc(102) int local102;
		@Pc(109) int local109;
		@Pc(77) short local77;
		if (local72 < Static155.aShort36) {
			local77 = Static155.aShort36;
			local48 = local77 * 334 * arg0 / (arg3 * 512);
			if (Static548.aShort101 < local48) {
				local48 = Static548.aShort101;
				local102 = local48 * 512 * arg3 / (local77 * 334);
				local109 = (arg0 - local102) / 2;
				if (arg1) {
					Static273.aClass100_6.la();
					Static273.aClass100_6.method8644(arg2, -16777216, local109, arg4, arg3);
					Static273.aClass100_6.method8644(arg2, -16777216, local109, arg0 + arg4 - local109, arg3);
				}
				arg4 += local109;
				arg0 -= local109 * 2;
			}
		} else if (Static631.aShort119 < local72) {
			local77 = Static631.aShort119;
			local48 = arg0 * 334 * local77 / (arg3 * 512);
			if (local48 < Static171.aShort59) {
				local48 = Static171.aShort59;
				local102 = local77 * arg0 * 334 / (local48 * 512);
				local109 = (arg3 - local102) / 2;
				if (arg1) {
					Static273.aClass100_6.la();
					Static273.aClass100_6.method8644(arg2, -16777216, arg0, arg4, local109);
					Static273.aClass100_6.method8644(arg3 + arg2 - local109, -16777216, arg0, arg4, local109);
				}
				arg2 += local109;
				arg3 -= local109 * 2;
			}
		}
		Static167.anInt3248 = arg3 * local48 / 334;
		Static391.anInt6612 = arg4;
		Static98.anInt1631 = (short) arg0;
		Static418.anInt7052 = arg2;
		Static455.anInt7373 = (short) arg3;
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(DI)V")
	public static void method4653(@OriginalArg(0) double arg0) {
		Static479.aClass10_8.method4212(Static500.aClass10_9);
		Static479.aClass10_8.method4225(0, 0, (int) arg0);
		Static548.aClass100_13.method8590(Static479.aClass10_8);
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(III)Z")
	public static boolean method4655(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return false;
	}
}
