import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static259 {

	@OriginalMember(owner = "client!pb", name = "f", descriptor = "I")
	public static int anInt4530;

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(I)V")
	public static void method4010() {
		if (!Static110.aBoolean180) {
			return;
		}
		@Pc(11) Class4 local11 = Static164.method2913(Static309.anInt5189, Static23.anInt501);
		if (local11 != null && local11.anObjectArray19 != null) {
			@Pc(20) Class2_Sub22 local20 = new Class2_Sub22();
			local20.aClass4_15 = local11;
			local20.anObjectArray33 = local11.anObjectArray19;
			Static256.method4003(local20);
		}
		Static284.anInt4920 = -1;
		Static110.aBoolean180 = false;
		Static62.anInt1263 = -1;
		if (local11 != null) {
			Static51.method872(local11);
		}
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(II)I")
	public static int method4011(@OriginalArg(1) int arg0) {
		@Pc(12) int local12 = arg0 >>> 1;
		@Pc(18) int local18 = local12 | local12 >>> 1;
		@Pc(24) int local24 = local18 | local18 >>> 2;
		@Pc(30) int local30 = local24 | local24 >>> 4;
		@Pc(36) int local36 = local30 | local30 >>> 8;
		@Pc(42) int local42 = local36 | local36 >>> 16;
		return arg0 & ~local42;
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(BI)I")
	public static int method4012(@OriginalArg(1) int arg0) {
		return arg0 >>> 8;
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(IIIIII)V")
	public static void method4013(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg4 > Static40.anInt818 || Static138.anInt932 > arg2) {
			return;
		}
		@Pc(25) boolean local25;
		if (arg3 < Static243.anInt4326) {
			arg3 = Static243.anInt4326;
			local25 = false;
		} else if (arg3 > Static235.anInt4193) {
			arg3 = Static235.anInt4193;
			local25 = false;
		} else {
			local25 = true;
		}
		@Pc(43) boolean local43;
		if (arg1 < Static243.anInt4326) {
			local43 = false;
			arg1 = Static243.anInt4326;
		} else if (Static235.anInt4193 >= arg1) {
			local43 = true;
		} else {
			local43 = false;
			arg1 = Static235.anInt4193;
		}
		if (arg4 < Static138.anInt932) {
			arg4 = Static138.anInt932;
		} else {
			Static315.method4662(arg1, Static15.anIntArrayArray1[arg4++], arg3, arg0);
		}
		if (Static40.anInt818 < arg2) {
			arg2 = Static40.anInt818;
		} else {
			Static315.method4662(arg1, Static15.anIntArrayArray1[arg2--], arg3, arg0);
		}
		@Pc(110) int local110;
		if (local25 && local43) {
			for (local110 = arg4; local110 <= arg2; local110++) {
				@Pc(152) int[] local152 = Static15.anIntArrayArray1[local110];
				local152[arg3] = local152[arg1] = arg0;
			}
			return;
		}
		if (local25) {
			for (local110 = arg4; local110 <= arg2; local110++) {
				Static15.anIntArrayArray1[local110][arg3] = arg0;
			}
			return;
		}
		if (local43) {
			for (local110 = arg4; local110 <= arg2; local110++) {
				Static15.anIntArrayArray1[local110][arg1] = arg0;
			}
			return;
		}
	}
}
