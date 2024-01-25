import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static501 {

	@OriginalMember(owner = "client!tk", name = "j", descriptor = "I")
	public static int anInt8701;

	@OriginalMember(owner = "client!tk", name = "o", descriptor = "Z")
	public static boolean aBoolean566;

	@OriginalMember(owner = "client!tk", name = "B", descriptor = "[[B")
	public static byte[][] aByteArrayArray28;

	@OriginalMember(owner = "client!tk", name = "v", descriptor = "Lclient!uc;")
	public static final Class316 aClass316_111 = new Class316(60, 8);

	@OriginalMember(owner = "client!tk", name = "x", descriptor = "I")
	public static int anInt8709 = 0;

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(III)Lclient!ti;")
	public static Class15_Sub4 method6928(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class133 local7 = Static113.aClass133ArrayArrayArray1[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass15_Sub4_1;
	}

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(IIIIII)V")
	public static void method6930(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(10) int local10 = arg0 - arg3;
		@Pc(14) int local14 = arg1 - arg2;
		if (local14 == 0) {
			if (local10 != 0) {
				Static281.method4295(arg4, arg0, arg3, arg2);
			}
		} else if (local10 == 0) {
			Static139.method2293(arg2, arg4, arg3, arg1);
		} else {
			if (local14 < 0) {
				local14 = -local14;
			}
			if (local10 < 0) {
				local10 = -local10;
			}
			@Pc(58) boolean local58 = local10 > local14;
			@Pc(62) int local62;
			@Pc(66) int local66;
			if (local58) {
				local62 = arg2;
				arg2 = arg3;
				local66 = arg1;
				arg1 = arg0;
				arg3 = local62;
				arg0 = local66;
			}
			if (arg1 < arg2) {
				local62 = arg2;
				local66 = arg3;
				arg2 = arg1;
				arg3 = arg0;
				arg1 = local62;
				arg0 = local66;
			}
			local62 = arg3;
			local66 = arg1 - arg2;
			@Pc(98) int local98 = arg0 - arg3;
			@Pc(103) int local103 = -(local66 >> 1);
			if (local98 < 0) {
				local98 = -local98;
			}
			@Pc(119) int local119 = arg0 > arg3 ? 1 : -1;
			@Pc(123) int local123;
			if (local58) {
				for (local123 = arg2; local123 <= arg1; local123++) {
					local103 += local98;
					Static155.anIntArrayArray32[local123][local62] = arg4;
					if (local103 > 0) {
						local62 += local119;
						local103 -= local66;
					}
				}
			} else {
				for (local123 = arg2; local123 <= arg1; local123++) {
					local103 += local98;
					Static155.anIntArrayArray32[local62][local123] = arg4;
					if (local103 > 0) {
						local103 -= local66;
						local62 += local119;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(II)V")
	public static void method6932(@OriginalArg(1) int arg0) {
		Static76.method1084();
		@Pc(11) int local11 = Static382.aClass78_1.method1673(arg0).anInt2885;
		if (local11 == 0) {
			return;
		}
		@Pc(29) int local29 = Static65.aClass51_1.anIntArray111[arg0];
		if (local11 == 6) {
			Static105.anInt1767 = local29;
		}
		if (local11 == 5) {
			Static451.anInt7957 = local29;
		}
	}
}
