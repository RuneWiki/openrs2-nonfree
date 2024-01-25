import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static448 {

	@OriginalMember(owner = "client!wo", name = "b", descriptor = "J")
	public static long aLong223 = 0L;

	@OriginalMember(owner = "client!wo", name = "d", descriptor = "[[I")
	public static final int[][] anIntArrayArray67 = new int[][] { { 2, 4 }, { 2, 4 }, { 5, 2, 4 }, { 4, 5, 2 }, { 2, 4, 5 }, { 5, 2, 4 }, { 1, 6, 2, 5 }, { 1, 6, 7, 1 }, { 6, 7, 1, 1 }, { 0, 8, 9, 8, 9, 4 }, { 8, 9, 4, 0, 8, 9 }, { 2, 10, 0, 10, 11, 11 }, { 2, 4 }, { 1, 6, 7, 1 }, { 1, 6, 7, 1 } };

	@OriginalMember(owner = "client!wo", name = "g", descriptor = "[S")
	public static final short[] aShortArray117 = new short[] { 60, 30, 59, 8, 23, 10, 25, 22 };

	@OriginalMember(owner = "client!wo", name = "k", descriptor = "I")
	public static int anInt7558 = 0;

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "(II)Lclient!pl;")
	public static Class3_Sub3_Sub17 method5928(@OriginalArg(1) int arg0) {
		@Pc(10) Class3_Sub3_Sub17 local10 = (Class3_Sub3_Sub17) Static291.aClass173_3.method4163((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static331.aClass56_71.method1384(arg0, 0);
		if (local20 == null || local20.length <= 1) {
			return null;
		} else {
			local10 = Static123.method2194(local20);
			Static291.aClass173_3.method4159(local10, (long) arg0);
			return local10;
		}
	}

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "(B)V")
	public static void method5929() {
		Static164.method2884(false);
		if (Static148.anInt3279 >= 0 && Static148.anInt3279 != 0) {
			Static69.method1302(Static148.anInt3279);
			Static148.anInt3279 = -1;
		}
	}

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "(ILclient!eo;)V")
	public static void method5930(@OriginalArg(1) Class68 arg0) {
		@Pc(12) Class68 local12 = Static94.method1636(arg0);
		@Pc(20) int local20;
		@Pc(17) int local17;
		if (local12 == null) {
			local20 = Static385.anInt6686;
			local17 = Static120.anInt2616;
		} else {
			local17 = local12.lb;
			local20 = local12.anInt2178;
		}
		Static193.method5124(arg0, local20, local17, false);
		Static46.method1007(local20, local17, arg0);
	}
}
