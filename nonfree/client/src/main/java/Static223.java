import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static223 {

	@OriginalMember(owner = "client!vg", name = "eb", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray12;

	@OriginalMember(owner = "client!vg", name = "hb", descriptor = "[I")
	public static int[] anIntArray373;

	@OriginalMember(owner = "client!vg", name = "W", descriptor = "I")
	public static int anInt4863 = (int) (Math.random() * 33.0D) - 16;

	@OriginalMember(owner = "client!vg", name = "Z", descriptor = "Lclient!sc;")
	public static Class107 aClass107_1315 = Static231.method3737("Mem:");

	@OriginalMember(owner = "client!vg", name = "cb", descriptor = "Lclient!sc;")
	public static Class107 aClass107_1316 = Static231.method3737("Art");

	@OriginalMember(owner = "client!vg", name = "fb", descriptor = "I")
	public static int anInt4869 = 0;

	@OriginalMember(owner = "client!vg", name = "gb", descriptor = "I")
	public static int anInt4870 = 0;

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(IBIIII)V")
	public static void method3650(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg4 > Static47.anInt1057 || anInt4869 > arg3) {
			return;
		}
		@Pc(24) boolean local24;
		if (Static99.anInt915 > arg1) {
			arg1 = Static99.anInt915;
			local24 = false;
		} else if (Static38.anInt784 >= arg1) {
			local24 = true;
		} else {
			arg1 = Static38.anInt784;
			local24 = false;
		}
		@Pc(43) boolean local43;
		if (arg0 < Static99.anInt915) {
			arg0 = Static99.anInt915;
			local43 = false;
		} else if (arg0 > Static38.anInt784) {
			arg0 = Static38.anInt784;
			local43 = false;
		} else {
			local43 = true;
		}
		if (anInt4869 <= arg4) {
			Static162.method2605(Static231.anIntArrayArray44[arg4++], arg1, arg2, arg0);
		} else {
			arg4 = anInt4869;
		}
		if (Static47.anInt1057 >= arg3) {
			Static162.method2605(Static231.anIntArrayArray44[arg3--], arg1, arg2, arg0);
		} else {
			arg3 = Static47.anInt1057;
		}
		@Pc(102) int local102;
		if (local24 && local43) {
			for (local102 = arg4; local102 <= arg3; local102++) {
				@Pc(144) int[] local144 = Static231.anIntArrayArray44[local102];
				local144[arg1] = local144[arg0] = arg2;
			}
		} else if (local24) {
			for (local102 = arg4; local102 <= arg3; local102++) {
				Static231.anIntArrayArray44[local102][arg1] = arg2;
			}
		} else if (local43) {
			for (local102 = arg4; local102 <= arg3; local102++) {
				Static231.anIntArrayArray44[local102][arg0] = arg2;
			}
		}
	}

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(IIIIIII)V")
	public static void method3651(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(3) Class126 local3 = new Class126();
		local3.anInt4972 = arg1 / 128;
		local3.anInt4966 = arg2 / 128;
		local3.anInt4967 = arg3 / 128;
		local3.anInt4971 = arg4 / 128;
		local3.anInt4965 = arg0;
		local3.anInt4975 = arg1;
		local3.anInt4984 = arg2;
		local3.anInt4969 = arg3;
		local3.anInt4976 = arg4;
		local3.anInt4968 = arg5;
		local3.anInt4977 = arg6;
		Static43.aClass126Array3[Static209.anInt4460++] = local3;
	}

	@OriginalMember(owner = "client!vg", name = "d", descriptor = "(III)V")
	public static void method3653(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) Class89 local12 = Static54.method1094(arg0);
		@Pc(15) int local15 = local12.anInt3396;
		@Pc(18) int local18 = local12.anInt3393;
		@Pc(21) int local21 = local12.anInt3397;
		@Pc(28) int local28 = Class1_Sub3.anIntArray18[local21 - local18];
		if (arg1 < 0 || local28 < arg1) {
			arg1 = 0;
		}
		local28 <<= local18;
		Static10.method311(local15, Static141.anIntArray267[local15] & ~local28 | local28 & arg1 << local18);
	}
}
