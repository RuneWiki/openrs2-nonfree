import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static281 {

	@OriginalMember(owner = "client!ug", name = "A", descriptor = "[[B")
	public static byte[][] aByteArrayArray106;

	@OriginalMember(owner = "client!ug", name = "R", descriptor = "I")
	public static int anInt4631 = 2;

	@OriginalMember(owner = "client!ug", name = "jb", descriptor = "[Z")
	public static boolean[] aBooleanArray112 = new boolean[8];

	@OriginalMember(owner = "client!ug", name = "Db", descriptor = "I")
	public static int anInt4667 = 500;

	@OriginalMember(owner = "client!ug", name = "b", descriptor = "(II)Lclient!va;")
	public static Class182 method3885(@OriginalArg(0) int arg0) {
		@Pc(12) Class182 local12 = (Class182) Static153.aClass98_21.method2570((long) arg0);
		if (local12 != null) {
			return local12;
		}
		@Pc(25) byte[] local25 = Static264.aClass155_111.method4121(34, arg0);
		local12 = new Class182();
		if (local25 != null) {
			local12.method4742(new Class3_Sub26(local25), arg0);
		}
		Static153.aClass98_21.method2568(local12, (long) arg0);
		return local12;
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(IZ)V")
	public static void method3893(@OriginalArg(1) boolean arg0) {
		@Pc(11) byte local11;
		@Pc(13) byte[][] local13;
		if (Static283.aBoolean393 && arg0) {
			local11 = 1;
			local13 = Static249.aByteArrayArray111;
		} else {
			local11 = 4;
			local13 = Static44.aByteArrayArray18;
		}
		@Pc(27) int local27 = local13.length;
		@Pc(29) int local29;
		@Pc(46) int local46;
		for (local29 = 0; local29 < local27; local29++) {
			@Pc(34) int[] local34 = null;
			@Pc(40) int local40 = Static297.anIntArray220[local29] >> 8;
			local46 = Static297.anIntArray220[local29] & 0xFF;
			@Pc(52) int local52 = local40 * 64 - Static101.anInt1844;
			@Pc(56) byte[] local56 = local13[local29];
			@Pc(63) int local63 = local46 * 64 - Static43.anInt798;
			if (local56 != null) {
				Static174.method2872();
				local34 = Static199.method3280(local56, Static101.anInt1844, Static138.aClass153Array1, Static43.anInt798, local52, arg0, local63);
			}
			if (!arg0 && local40 == Static3.anInt70 / 8 && local46 == Static131.anInt2471 / 8) {
				if (local34 == null) {
					Static238.anInt4825 = -1;
				} else {
					Static90.anInt1670 = local34[4];
					Static25.anInt465 = local34[3];
					Static310.anInt6101 = local34[2];
					Static238.anInt4825 = local34[0];
					Static248.anInt5000 = local34[1];
				}
			}
		}
		for (local29 = 0; local29 < local27; local29++) {
			@Pc(140) int local140 = (Static297.anIntArray220[local29] >> 8) * 64 - Static101.anInt1844;
			@Pc(151) int local151 = (Static297.anIntArray220[local29] & 0xFF) * 64 - Static43.anInt798;
			@Pc(155) byte[] local155 = local13[local29];
			if (local155 == null && Static131.anInt2471 < 800) {
				Static174.method2872();
				for (local46 = 0; local46 < local11; local46++) {
					Static289.method4753(64, local46, local140, local151, 64);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(IILclient!rg;BIIII)V")
	public static void method3946(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class151 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (Static14.aBoolean22) {
			Static231.anInt4497 = 32;
		} else {
			Static231.anInt4497 = 0;
		}
		Static14.aBoolean22 = false;
		@Pc(121) int local121;
		if (Static39.anInt681 != 0) {
			if (arg6 >= arg1 && arg6 < arg1 + 16 && arg5 <= arg3 && arg3 < arg5 + 16) {
				arg2.anInt4747 -= 4;
				Static134.method3639(arg2);
			} else if (arg6 >= arg1 && arg1 + 16 > arg6 && arg4 + arg5 - 16 <= arg3 && arg4 + arg5 > arg3) {
				arg2.anInt4747 += 4;
				Static134.method3639(arg2);
			} else if (arg6 >= arg1 - Static231.anInt4497 && arg6 < Static231.anInt4497 + arg1 + 16 && arg3 >= arg5 + 16 && arg5 + arg4 - 16 > arg3) {
				local121 = arg4 * (arg4 - 32) / arg0;
				if (local121 < 8) {
					local121 = 8;
				}
				@Pc(140) int local140 = arg3 - arg5 - local121 / 2 - 16;
				@Pc(146) int local146 = arg4 - local121 - 32;
				arg2.anInt4747 = local140 * (arg0 - arg4) / local146;
				Static134.method3639(arg2);
				Static14.aBoolean22 = true;
			}
		}
		if (Static235.anInt4699 == 0) {
			return;
		}
		local121 = arg2.anInt4773;
		if (arg1 - local121 <= arg6 && arg3 >= arg5 && arg6 < arg1 + 16 && arg4 + arg5 >= arg3) {
			arg2.anInt4747 += Static235.anInt4699 * 45;
			Static134.method3639(arg2);
		}
	}
}
