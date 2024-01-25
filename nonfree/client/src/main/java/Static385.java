import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static385 {

	@OriginalMember(owner = "client!nt", name = "j", descriptor = "Lclient!up;")
	public static Class345 aClass345_2;

	@OriginalMember(owner = "client!nt", name = "a", descriptor = "(IBI)Z")
	public static boolean method6056(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return Static301.method5133(arg1, arg0) & Static556.method7797(arg0, arg1);
	}

	@OriginalMember(owner = "client!nt", name = "a", descriptor = "(B)V")
	public static void method6057() {
		for (@Pc(11) int local11 = 0; local11 < Static288.anInt5977; local11++) {
			@Pc(17) int local17 = Static562.anIntArray508[local11];
			@Pc(24) Class6_Sub42 local24 = (Class6_Sub42) Static461.aClass380_35.method8747((long) local17);
			if (local24 != null) {
				@Pc(29) Class9_Sub4_Sub2_Sub1_Sub1 local29 = local24.aClass9_Sub4_Sub2_Sub1_Sub1_1;
				Static143.method2825(local29, local29.aClass158_1.anInt5826);
			}
		}
	}

	@OriginalMember(owner = "client!nt", name = "a", descriptor = "(IIIIB)V")
	public static void method6059(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(13) int local13 = Static78.anInt2674;
		if (local13 == 0) {
			return;
		}
		if (local13 == 1) {
			Static78.anInt2674 = 2;
			Static596.anInt10144 = arg1;
			Static153.anInt3558 = arg0;
			Static230.anInt5095 = arg2;
			Static568.anInt2489 = arg3;
		} else if (local13 == 2) {
			if (arg2 > Static230.anInt5095) {
				Static230.anInt5095 = arg2;
			}
			if (arg0 > Static153.anInt3558) {
				Static153.anInt3558 = arg0;
			}
			if (arg3 < Static568.anInt2489) {
				Static568.anInt2489 = arg3;
			}
			if (Static596.anInt10144 > arg1) {
				Static596.anInt10144 = arg1;
			}
		}
	}

	@OriginalMember(owner = "client!nt", name = "a", descriptor = "(IIII)V")
	public static void method6060(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 == Static274.anInt5859 && Static198.anInt4244 == arg2 && Static226.anInt5045 == arg1) {
			return;
		}
		Static274.anInt5859 = arg0;
		Static198.anInt4244 = arg2;
		Static610.aBoolean810 = true;
		Static226.anInt5045 = arg1;
		@Pc(43) double local43 = -((double) (arg0 * 2) * 3.141592653589793D) / 16384.0D;
		@Pc(53) double local53 = -((double) (arg2 * 2) * 3.141592653589793D) / 16384.0D;
		@Pc(56) double local56 = Math.cos(local53);
		@Pc(59) double local59 = Math.sin(local53);
		@Pc(62) double local62 = Math.cos(local43);
		@Pc(65) double local65 = Math.sin(local43);
		Static619.aDouble9 = -local59 * local62;
		Static246.aDouble4 = local65;
		Static221.aDouble2 = local59 * local65;
		Static625.aDouble25 = local56 * local62;
		Static492.aDouble13 = 0.0D;
		Static267.aDouble6 = local59;
		Static408.aDouble10 = local62;
		Static238.aDouble3 = local56;
		Static499.aDouble22 = local65 * -local56;
	}
}
