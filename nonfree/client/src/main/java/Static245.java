import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static245 {

	@OriginalMember(owner = "client!mi", name = "c", descriptor = "[I")
	public static int[] anIntArray376;

	@OriginalMember(owner = "client!mi", name = "e", descriptor = "[I")
	public static int[] anIntArray378;

	@OriginalMember(owner = "client!mi", name = "d", descriptor = "[I")
	public static int[] anIntArray377 = new int[1];

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(B)V")
	public static void method3778() {
		Static22.method312(false);
		if (Static63.anInt1331 >= 0 && Static63.anInt1331 != 0) {
			Static385.method5310(Static63.anInt1331);
			Static63.anInt1331 = -1;
		}
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(IIIIII)V")
	public static void method3779(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		Static46.anInt5784 = arg1;
		Static38.anInt852 = arg3;
		Static131.anInt2335 = arg2;
		Static5.anInt47 = arg4;
		Static325.anInt5317 = arg0;
		if (Static131.anInt2335 >= 100) {
			@Pc(33) int local33 = Static38.anInt852 * 128 + 64;
			@Pc(39) int local39 = Static5.anInt47 * 128 + 64;
			@Pc(48) int local48 = Static165.method2689(local33, Static4.anInt30, local39) - Static46.anInt5784;
			@Pc(53) int local53 = local33 - Static32.anInt521;
			@Pc(58) int local58 = local48 - Static354.anInt5973;
			@Pc(63) int local63 = local39 - Static214.anInt3730;
			@Pc(75) int local75 = (int) Math.sqrt((double) (local53 * local53 + local63 * local63));
			Static303.anInt4990 = (int) (Math.atan2((double) local58, (double) local75) * 2607.5945876176133D) & 0x3FFF;
			Static217.anInt3768 = (int) (Math.atan2((double) local53, (double) local63) * -2607.5945876176133D) & 0x3FFF;
			Static189.anInt6581 = 0;
			if (Static303.anInt4990 < 1024) {
				Static303.anInt4990 = 1024;
			}
			if (Static303.anInt4990 > 3072) {
				Static303.anInt4990 = 3072;
			}
		}
		Static9.anInt164 = 2;
	}
}
