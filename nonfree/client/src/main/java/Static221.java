import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static221 {

	@OriginalMember(owner = "client!nm", name = "m", descriptor = "I")
	public static int anInt4331;

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(II)Lclient!kk;", line = 8)
	public static Class127 method4121(@OriginalArg(0) int arg0) {
		@Pc(13) Class127[] local13 = Static141.method2742();
		for (@Pc(15) int local15 = 0; local15 < local13.length; local15++) {
			@Pc(21) Class127 local21 = local13[local15];
			if (local21.anInt3423 == arg0) {
				return local21;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(IZI)I", line = 36)
	public static int method4122(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return arg0 == 4 || arg0 == 5 ? Class55.anIntArray112[arg1 & 0x3] : 256;
	}

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(IIIIII)V", line = 70)
	public static void method4124(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg1 > Class2_Sub20.anInt2951 || Class2_Sub40.anInt6819 > arg3) {
			return;
		}
		@Pc(23) boolean local23;
		if (arg4 < Class25_Sub1.anInt675) {
			local23 = false;
			arg4 = Class25_Sub1.anInt675;
		} else if (arg4 > Class61.anInt1835) {
			local23 = false;
			arg4 = Class61.anInt1835;
		} else {
			local23 = true;
		}
		@Pc(42) boolean local42;
		if (Class25_Sub1.anInt675 > arg0) {
			arg0 = Class25_Sub1.anInt675;
			local42 = false;
		} else if (arg0 > Class61.anInt1835) {
			local42 = false;
			arg0 = Class61.anInt1835;
		} else {
			local42 = true;
		}
		if (Class2_Sub40.anInt6819 <= arg1) {
			Static94.method2165(arg0, Static332.anIntArrayArray58[arg1++], arg2, arg4);
		} else {
			arg1 = Class2_Sub40.anInt6819;
		}
		if (arg3 <= Class2_Sub20.anInt2951) {
			Static94.method2165(arg0, Static332.anIntArrayArray58[arg3--], arg2, arg4);
		} else {
			arg3 = Class2_Sub20.anInt2951;
		}
		@Pc(95) int local95;
		if (local23 && local42) {
			for (local95 = arg1; local95 <= arg3; local95++) {
				@Pc(101) int[] local101 = Static332.anIntArrayArray58[local95];
				local101[arg4] = local101[arg0] = arg2;
			}
		} else if (local23) {
			for (local95 = arg1; local95 <= arg3; local95++) {
				Static332.anIntArrayArray58[local95][arg4] = arg2;
			}
		} else if (local42) {
			for (local95 = arg1; local95 <= arg3; local95++) {
				Static332.anIntArrayArray58[local95][arg0] = arg2;
			}
		}
	}
}
