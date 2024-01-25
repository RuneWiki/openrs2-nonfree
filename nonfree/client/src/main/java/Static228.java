import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static228 {

	@OriginalMember(owner = "client!lh", name = "q", descriptor = "[I")
	public static int[] anIntArray311;

	@OriginalMember(owner = "client!lh", name = "s", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray8;

	@OriginalMember(owner = "client!lh", name = "x", descriptor = "I")
	public static int anInt3926;

	@OriginalMember(owner = "client!lh", name = "z", descriptor = "[Lclient!f;")
	public static Class78[] aClass78Array5;

	@OriginalMember(owner = "client!lh", name = "r", descriptor = "I")
	public static int anInt3921 = 0;

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(IIIIII)V")
	public static void method3282(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(10) int local10 = arg1 - arg2;
		@Pc(15) int local15 = arg4 - arg0;
		if (local15 == 0) {
			if (local10 != 0) {
				Static320.method4413(arg1, arg0, arg2, arg3);
			}
		} else if (local10 == 0) {
			Static22.method259(arg3, arg4, arg0, arg2);
		} else {
			if (local10 < 0) {
				local10 = -local10;
			}
			if (local15 < 0) {
				local15 = -local15;
			}
			@Pc(58) boolean local58 = local10 > local15;
			@Pc(62) int local62;
			@Pc(66) int local66;
			if (local58) {
				local62 = arg0;
				arg0 = arg2;
				local66 = arg4;
				arg4 = arg1;
				arg2 = local62;
				arg1 = local66;
			}
			if (arg4 < arg0) {
				local62 = arg0;
				local66 = arg2;
				arg0 = arg4;
				arg2 = arg1;
				arg4 = local62;
				arg1 = local66;
			}
			local62 = arg2;
			local66 = arg4 - arg0;
			@Pc(103) int local103 = arg1 - arg2;
			@Pc(113) int local113 = -(local66 >> 1);
			@Pc(120) int local120 = arg2 >= arg1 ? -1 : 1;
			if (local103 < 0) {
				local103 = -local103;
			}
			@Pc(132) int local132;
			if (local58) {
				for (local132 = arg0; local132 <= arg4; local132++) {
					local113 += local103;
					Static283.anIntArrayArray30[local132][local62] = arg3;
					if (local113 > 0) {
						local62 += local120;
						local113 -= local66;
					}
				}
			} else {
				for (local132 = arg0; local132 <= arg4; local132++) {
					Static283.anIntArrayArray30[local62][local132] = arg3;
					local113 += local103;
					if (local113 > 0) {
						local113 -= local66;
						local62 += local120;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(B)[Lclient!sv;")
	public static Class222[] method3283() {
		return new Class222[] { Static390.aClass222_19, Static28.aClass222_4, Static85.aClass222_7, Static10.aClass222_22, Static205.aClass222_14, Static379.aClass222_18, Static11.aClass222_2, Static11.aClass222_3, Static401.aClass222_20, Static362.aClass222_16, Static59.aClass222_6, Static335.aClass222_15, Static225.aClass222_12, Static32.aClass222_5 };
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(BIII)V")
	public static void method3290(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(43) String local43 = "tele " + arg2 + "," + (arg1 >> 6) + "," + (arg0 >> 6) + "," + (arg1 & 0x3F) + "," + (arg0 & 0x3F);
		System.out.println(local43);
		Static238.method3491(true, local43);
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(BLclient!ir;)V")
	public static void method3296(@OriginalArg(1) Class47_Sub1_Sub5 arg0) {
		@Pc(5) boolean local5 = false;
		if (Static123.anInt2333 == arg0.anInt5380 || arg0.anInt5348 == -1 || arg0.anInt5370 != 0) {
			local5 = true;
		} else {
			@Pc(26) Class58 local26 = Static322.aClass45_5.method690(arg0.anInt5348);
			if (local26.aBoolean124 || local26.anIntArray66[arg0.anInt5350] < arg0.anInt5403 + 1) {
				local5 = true;
			}
		}
		if (local5) {
			@Pc(50) int local50 = arg0.anInt5380 - arg0.anInt5344;
			@Pc(56) int local56 = Static123.anInt2333 - arg0.anInt5344;
			@Pc(67) int local67 = arg0.anInt5394 * 128 + arg0.method4317() * 64;
			@Pc(78) int local78 = arg0.anInt5342 * 128 + arg0.method4317() * 64;
			@Pc(90) int local90 = arg0.anInt5405 * 128 + arg0.method4317() * 64;
			@Pc(102) int local102 = arg0.anInt5413 * 128 + arg0.method4317() * 64;
			arg0.anInt7066 = (local102 * local56 + local78 * (local50 - local56)) / local50;
			arg0.anInt7060 = ((local50 - local56) * local67 + local56 * local90) / local50;
		}
		arg0.anInt5419 = 0;
		if (arg0.anInt5355 == 0) {
			arg0.method4320(8192);
		}
		if (arg0.anInt5355 == 1) {
			arg0.method4320(12288);
		}
		if (arg0.anInt5355 == 2) {
			arg0.method4320(0);
		}
		if (arg0.anInt5355 == 3) {
			arg0.method4320(4096);
		}
	}
}
