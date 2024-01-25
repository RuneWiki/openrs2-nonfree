import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static187 {

	@OriginalMember(owner = "client!mb", name = "Gc", descriptor = "I")
	public static int anInt3557;

	@OriginalMember(owner = "client!mb", name = "F", descriptor = "[[I")
	public static final int[][] anIntArrayArray127 = new int[][] { { 0, 2, 4, 6 }, { 6, 0, 2, 3, 5, 3 }, { 6, 0, 2, 4 }, { 2, 5, 6, 1 }, { 0, 2, 6 }, { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 7, 1, 2, 4, 6 }, { 2, 4, 4, 7 }, { 6, 6, 4, 0, 1, 1, 3, 3 }, { 0, 2, 2, 6, 6, 4 }, { 0, 2, 2, 3, 7, 0, 4, 3 }, { 0, 2, 4, 6 } };

	@OriginalMember(owner = "client!mb", name = "V", descriptor = "I")
	public static int anInt3514 = 0;

	@OriginalMember(owner = "client!mb", name = "Nb", descriptor = "[S")
	public static final short[] aShortArray68 = new short[] { -10304, 9104, -1, -1, -1 };

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(IB)Lclient!pn;")
	public static Class162 method3520(@OriginalArg(0) int arg0) {
		@Pc(10) Class162 local10 = (Class162) Static268.aClass70_86.method1396((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(22) byte[] local22 = Static239.aClass53_160.method1033(arg0, 0);
		local10 = new Class162();
		if (local22 != null) {
			local10.method4303(new Class6_Sub10(local22));
		}
		local10.method4301();
		Static268.aClass70_86.method1406(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(IBIIII)V")
	public static void method3522(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		Static350.anInt6299 = arg2;
		Static273.anInt6141 = arg3;
		Static233.anInt4352 = arg0;
		Static13.anInt229 = arg1;
		Static148.anInt2742 = arg4;
		if (Static233.anInt4352 >= 100) {
			@Pc(30) int local30 = Static148.anInt2742 * 128 + 64;
			@Pc(36) int local36 = Static13.anInt229 * 128 + 64;
			@Pc(45) int local45 = Static306.method5249(local36, local30, Static343.anInt6225) - Static273.anInt6141;
			@Pc(49) int local49 = local30 - Static287.anInt5405;
			@Pc(54) int local54 = local45 - Static217.anInt4016;
			@Pc(59) int local59 = local36 - Static11.anInt197;
			@Pc(70) int local70 = (int) Math.sqrt((double) (local59 * local59 + local49 * local49));
			Static110.anInt2047 = (int) (Math.atan2((double) local54, (double) local70) * 2607.5945876176133D) & 0x3FFF;
			Static79.anInt1450 = (int) (Math.atan2((double) local49, (double) local59) * -2607.5945876176133D) & 0x3FFF;
			if (Static110.anInt2047 < 1024) {
				Static110.anInt2047 = 1024;
			}
			if (Static110.anInt2047 > 3072) {
				Static110.anInt2047 = 3072;
			}
		}
		Static334.anInt6112 = 2;
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(ILclient!mb;II)V")
	public static void method3524(@OriginalArg(0) int arg0, @OriginalArg(1) Class132 arg1, @OriginalArg(2) int arg2) {
		Static120.anInt2268 = arg0;
		Static161.anInt3051 = arg2;
		Static136.aClass132_8 = arg1;
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(II)V")
	public static void method3537(@OriginalArg(1) int arg0) {
		@Pc(8) Class6_Sub2_Sub8 local8 = Static239.method5786(8, arg0);
		local8.method2645();
	}
}
