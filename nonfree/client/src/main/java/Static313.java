import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static313 {

	@OriginalMember(owner = "client!pr", name = "e", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray12;

	@OriginalMember(owner = "client!pr", name = "f", descriptor = "I")
	public static int anInt5435;

	@OriginalMember(owner = "client!pr", name = "g", descriptor = "I")
	public static int anInt5436;

	@OriginalMember(owner = "client!pr", name = "c", descriptor = "Lclient!sl;")
	public static final Class215 aClass215_70 = new Class215(6, 8);

	@OriginalMember(owner = "client!pr", name = "d", descriptor = "[I")
	public static final int[] anIntArray374 = new int[2048];

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "(IIIIII)V")
	public static void method4175(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		Static222.anInt4125 = arg3;
		Static111.anInt2379 = arg4;
		Static381.anInt6417 = arg0;
		Static419.anInt6924 = arg2;
		Static238.anInt4509 = arg1;
		if (Static381.anInt6417 >= 100) {
			@Pc(30) int local30 = Static111.anInt2379 * 128 + 64;
			@Pc(36) int local36 = Static419.anInt6924 * 128 + 64;
			@Pc(45) int local45 = Static13.method135(local30, Static263.anInt4963, local36) - Static238.anInt4509;
			@Pc(50) int local50 = local30 - Static163.anInt3197;
			@Pc(55) int local55 = local45 - Static100.anInt2024;
			@Pc(59) int local59 = local36 - Static145.anInt2906;
			@Pc(70) int local70 = (int) Math.sqrt((double) (local59 * local59 + local50 * local50));
			Static431.anInt7074 = (int) (Math.atan2((double) local55, (double) local70) * 2607.5945876176133D) & 0x3FFF;
			Static136.anInt2790 = (int) (Math.atan2((double) local50, (double) local59) * -2607.5945876176133D) & 0x3FFF;
			if (Static431.anInt7074 < 1024) {
				Static431.anInt7074 = 1024;
			}
			Static103.anInt2070 = 0;
			if (Static431.anInt7074 > 3072) {
				Static431.anInt7074 = 3072;
			}
		}
		Static111.anInt2386 = 2;
	}

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "(BI)V")
	public static void method4176(@OriginalArg(1) int arg0) {
		@Pc(13) Class4_Sub1_Sub11 local13 = Static405.method5222(arg0, 12);
		local13.method2608();
	}
}
