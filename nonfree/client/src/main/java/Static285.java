import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static285 {

	@OriginalMember(owner = "client!rr", name = "x", descriptor = "Lclient!r;")
	public static Class197 aClass197_80;

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "(IIZIIB)V", line = 3)
	public static void method5274(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg3 < 1) {
			arg3 = 1;
		}
		if (arg1 < 1) {
			arg1 = 1;
		}
		@Pc(21) int local21 = arg1 - 334;
		if (local21 < 0) {
			local21 = 0;
		} else if (local21 > 100) {
			local21 = 100;
		}
		@Pc(44) int local44 = local21 * (Class12_Sub6.aShort78 - Class171.aShort73) / 100 + Class171.aShort73;
		if (Class49.aShort86 > local44) {
			local44 = Class49.aShort86;
		} else if (local44 > Class87.aShort35) {
			local44 = Class87.aShort35;
		}
		@Pc(70) int local70 = arg1 * 512 * local44 / (arg3 * 334);
		@Pc(111) int local111;
		@Pc(118) int local118;
		@Pc(86) short local86;
		if (Class233.aShort92 > local70) {
			local86 = Class233.aShort92;
			local44 = arg3 * 334 * local86 / (arg1 * 512);
			if (local44 > Class87.aShort35) {
				local44 = Class87.aShort35;
				local111 = arg1 * local44 * 512 / (local86 * 334);
				local118 = (arg3 - local111) / 2;
				if (arg2) {
					Static177.aClass19_8.method2900();
					Static177.aClass19_8.method2870(arg1, arg0, arg4, -16777216, local118);
					Static177.aClass19_8.method2870(arg1, arg0 + arg3 - local118, arg4, -16777216, local118);
				}
				arg3 -= local118 * 2;
				arg0 += local118;
			}
		} else if (local70 > Class53.aShort19) {
			local86 = Class53.aShort19;
			local44 = local86 * 334 * arg3 / (arg1 * 512);
			if (Class49.aShort86 > local44) {
				local44 = Class49.aShort86;
				local111 = arg3 * 334 * local86 / (local44 * 512);
				local118 = (arg1 - local111) / 2;
				if (arg2) {
					Static177.aClass19_8.method2900();
					Static177.aClass19_8.method2870(local118, arg0, arg4, -16777216, arg3);
					Static177.aClass19_8.method2870(local118, arg0, arg4 + arg1 - local118, -16777216, arg3);
				}
				arg1 -= local118 * 2;
				arg4 += local118;
			}
		}
		Class123.anInt3364 = arg0;
		Class243.anInt7038 = arg4;
		Class110.anInt2805 = (short) arg3;
		Class2_Sub35.anInt5994 = local44 * arg1 / 334;
		Class124.anInt3404 = (short) arg1;
	}

	@OriginalMember(owner = "client!rr", name = "b", descriptor = "(I)V", line = 98)
	public static void method5275() {
		for (@Pc(10) Class2_Sub37 local10 = (Class2_Sub37) Class145.aClass135_26.method3552(); local10 != null; local10 = (Class2_Sub37) Class145.aClass135_26.method3553()) {
			if (local10.anInt6473 > 0) {
				local10.anInt6473--;
			}
			if (local10.anInt6473 != 0) {
				if (local10.anInt6476 > 0) {
					local10.anInt6476--;
				}
				if (local10.anInt6476 == 0 && local10.anInt6472 >= 1 && local10.anInt6474 >= 1 && Class241.anInt7020 - 2 >= local10.anInt6472 && OutputStream_Sub1.anInt4442 - 2 >= local10.anInt6474 && (local10.anInt6468 < 0 || Static264.method4932(local10.anInt6468, local10.anInt6467))) {
					Static75.method1873(local10.anInt6469, local10.anInt6472, local10.anInt6468, local10.anInt6482, local10.anInt6479, -1, local10.anInt6467, local10.anInt6474);
					local10.anInt6476 = -1;
					if (local10.anInt6468 == local10.anInt6480 && local10.anInt6480 == -1) {
						local10.method6469();
					} else if (local10.anInt6468 == local10.anInt6480 && local10.anInt6481 == local10.anInt6482 && local10.anInt6470 == local10.anInt6467) {
						local10.method6469();
					}
				}
			} else if (local10.anInt6480 < 0 || Static264.method4932(local10.anInt6480, local10.anInt6470)) {
				Static75.method1873(local10.anInt6469, local10.anInt6472, local10.anInt6480, local10.anInt6481, local10.anInt6479, -1, local10.anInt6470, local10.anInt6474);
				local10.method6469();
			}
		}
	}

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "(Lclient!bt;I)Ljava/lang/String;", line = 167)
	public static String method5277(@OriginalArg(0) Class2_Sub4 arg0) {
		return Static113.method2386(arg0);
	}
}
