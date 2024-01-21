import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static81 {

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "Lclient!sc;")
	public static Class4_Sub1_Sub7_Sub3 aClass4_Sub1_Sub7_Sub3_2;

	@OriginalMember(owner = "client!jb", name = "h", descriptor = "I")
	public static int anInt2016 = 0;

	@OriginalMember(owner = "client!jb", name = "k", descriptor = "Lclient!jd;")
	private static final Class46 aClass46_771 = Static177.method3050("OFF");

	@OriginalMember(owner = "client!jb", name = "j", descriptor = "Lclient!jd;")
	public static Class46 aClass46_770 = aClass46_771;

	@OriginalMember(owner = "client!jb", name = "l", descriptor = "[Lclient!jd;")
	public static final Class46[] aClass46Array14 = new Class46[8];

	@OriginalMember(owner = "client!jb", name = "m", descriptor = "Lclient!jd;")
	public static final Class46 aClass46_772 = Static177.method3050("gr-Un:");

	@OriginalMember(owner = "client!jb", name = "n", descriptor = "[[I")
	public static final int[][] anIntArrayArray14 = new int[][] { new int[16], { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 1 }, { 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0 }, { 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1 }, { 1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 1 } };

	@OriginalMember(owner = "client!jb", name = "o", descriptor = "Lclient!jd;")
	public static final Class46 aClass46_773 = Static177.method3050("gelb:");

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(III)I")
	public static int method1608(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) int local8 = 0;
		while (arg1 > 0) {
			local8 = arg0 & 0x1 | local8 << 1;
			arg0 >>>= 0x1;
			arg1--;
		}
		return local8;
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(IIIIII)Z")
	public static boolean method1610(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(16) int local16;
		@Pc(20) int local20;
		if (arg1 != arg2 || arg3 != arg4) {
			for (local16 = arg1; local16 <= arg2; local16++) {
				for (local20 = arg3; local20 <= arg4; local20++) {
					if (Static73.anIntArrayArrayArray21[arg0][local16][local20] == -Static87.anInt2220) {
						return false;
					}
				}
			}
			local20 = (arg1 << 7) + 1;
			@Pc(146) int local146 = (arg3 << 7) + 2;
			@Pc(156) int local156 = Static142.anIntArrayArrayArray33[arg0][arg1][arg3] + arg5;
			if (!Static72.method1496(local20, local156, local146)) {
				return false;
			}
			@Pc(169) int local169 = (arg2 << 7) - 1;
			if (!Static72.method1496(local169, local156, local146)) {
				return false;
			}
			@Pc(182) int local182 = (arg4 << 7) - 1;
			if (!Static72.method1496(local20, local156, local182)) {
				return false;
			} else if (Static72.method1496(local169, local156, local182)) {
				return true;
			} else {
				return false;
			}
		} else if (Static13.method263(arg0, arg1, arg3)) {
			local16 = arg1 << 7;
			local20 = arg3 << 7;
			return Static72.method1496(local16 + 1, Static142.anIntArrayArrayArray33[arg0][arg1][arg3] + arg5, local20 + 1) && Static72.method1496(local16 + 128 - 1, Static142.anIntArrayArrayArray33[arg0][arg1 + 1][arg3] + arg5, local20 + 1) && Static72.method1496(local16 + 128 - 1, Static142.anIntArrayArrayArray33[arg0][arg1 + 1][arg3 + 1] + arg5, local20 + 128 - 1) && Static72.method1496(local16 + 1, Static142.anIntArrayArrayArray33[arg0][arg1][arg3 + 1] + arg5, local20 + 128 - 1);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(IIIILclient!tg;IJIIII)Z")
	public static boolean method1611(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class4_Sub1_Sub1 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) long arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		return arg4 == null ? true : Static106.method2001(arg0, arg7, arg8, arg9 + 1 - arg7, arg10 - arg8 + 1, arg1, arg2, arg3, arg4, arg5, true, arg6);
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(IB)I")
	public static int method1612(@OriginalArg(0) int arg0) {
		return arg0 >>> 7;
	}
}
