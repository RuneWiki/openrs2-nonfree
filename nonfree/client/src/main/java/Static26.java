import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static26 {

	@OriginalMember(owner = "client!bk", name = "B", descriptor = "I")
	public static int anInt694;

	@OriginalMember(owner = "client!bk", name = "C", descriptor = "[[I")
	public static final int[][] anIntArrayArray4 = new int[][] { { 6, 6 }, { 6, 6 }, { 6, 5, 5 }, { 5, 6, 5 }, { 5, 5, 6 }, { 6, 5, 5 }, { 5, 0, 4, 1 }, { 7, 7, 1, 2 }, { 7, 1, 2, 7 }, { 8, 9, 4, 0, 8, 9 }, { 0, 8, 9, 8, 9, 4 }, { 11, 0, 10, 11, 4, 2 }, { 6, 6 }, { 7, 7, 1, 2 }, { 7, 7, 1, 2 } };

	@OriginalMember(owner = "client!bk", name = "J", descriptor = "I")
	public static int anInt699 = 64;

	@OriginalMember(owner = "client!bk", name = "K", descriptor = "Ljava/lang/String;")
	public static String aString17 = "Starting 3d Library";

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(Lclient!ir;IIB)Lclient!d;")
	public static Class40 method559(@OriginalArg(0) Class100 arg0, @OriginalArg(2) int arg1) {
		@Pc(9) byte[] local9 = arg0.method2319(arg1, 0);
		return local9 == null ? null : new Class40(local9);
	}

	@OriginalMember(owner = "client!bk", name = "f", descriptor = "(I)V")
	public static void method561() {
		Static10.aClass198_4.method5236();
	}

	@OriginalMember(owner = "client!bk", name = "b", descriptor = "(IIIIII)V")
	public static void method562(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		Static341.anInt6652 = arg4;
		anInt694 = arg3;
		Static335.anInt6512 = arg0;
		Static327.anInt6306 = arg1;
		Static119.anInt2573 = arg2;
		if (Static119.anInt2573 >= 100) {
			@Pc(32) int local32 = Static341.anInt6652 * 128 + 64;
			@Pc(38) int local38 = Static327.anInt6306 * 128 + 64;
			@Pc(47) int local47 = Static286.method4919(local32, local38, Static163.anInt3184) - anInt694;
			@Pc(52) int local52 = local32 - Static110.anInt2324;
			@Pc(57) int local57 = local47 - Static175.anInt3631;
			@Pc(62) int local62 = local38 - Static210.anInt4317;
			@Pc(73) int local73 = (int) Math.sqrt((double) (local62 * local62 + local52 * local52));
			Static154.anInt6368 = (int) (Math.atan2((double) local57, (double) local73) * 2607.5945876176133D) & 0x3FFF;
			Static350.anInt6797 = (int) (Math.atan2((double) local52, (double) local62) * -2607.5945876176133D) & 0x3FFF;
			if (Static154.anInt6368 < 1024) {
				Static154.anInt6368 = 1024;
			}
			if (Static154.anInt6368 > 3072) {
				Static154.anInt6368 = 3072;
			}
		}
		Static261.anInt5200 = 2;
	}

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(Lclient!so;IIB)V")
	public static void method563(@OriginalArg(0) Class184 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		Static58.aClass184ArrayArray1[arg2][arg1] = arg0;
	}
}
