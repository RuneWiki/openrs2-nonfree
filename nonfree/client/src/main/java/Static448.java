import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static448 {

	@OriginalMember(owner = "client!rp", name = "E", descriptor = "Z")
	public static boolean aBoolean602;

	@OriginalMember(owner = "client!rp", name = "G", descriptor = "[[I")
	public static int[][] anIntArrayArray53;

	@OriginalMember(owner = "client!rp", name = "J", descriptor = "Lclient!kfa;")
	public static final Class181 aClass181_93 = new Class181(81, 2);

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "(IIIIIII)V")
	public static void method6873(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(3) Class350 local3 = new Class350();
		local3.anInt9827 = arg1 >> Static494.anInt8859;
		local3.anInt9838 = arg2 >> Static494.anInt8859;
		local3.anInt9821 = arg3 >> Static494.anInt8859;
		local3.anInt9828 = arg4 >> Static494.anInt8859;
		local3.anInt9840 = arg0;
		local3.anInt9835 = arg1;
		local3.anInt9834 = arg2;
		local3.anInt9837 = arg3;
		local3.anInt9836 = arg4;
		local3.anInt9831 = arg5;
		local3.anInt9832 = arg6;
		Static456.aClass350Array2[Static499.anInt8899++] = local3;
	}

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "(IIIBIII)I")
	public static int method6875(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if ((arg3 & 0x1) == 1) {
			@Pc(12) int local12 = arg2;
			arg2 = arg4;
			arg4 = local12;
		}
		@Pc(25) int local25 = arg0 & 0x3;
		if (local25 == 0) {
			return arg1;
		} else if (local25 == 1) {
			return arg5;
		} else if (local25 == 2) {
			return 1 + 7 - arg2 - arg1;
		} else {
			return 1 + 7 - arg4 - arg5;
		}
	}

	@OriginalMember(owner = "client!rp", name = "b", descriptor = "(IIII)V")
	public static void method6876(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(22) Class6_Sub4_Sub6 local22 = Static68.method1408(11, arg1);
		local22.method3826();
		local22.anInt4399 = arg2;
		local22.anInt4403 = arg0;
	}
}
