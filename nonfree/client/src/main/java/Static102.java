import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static102 {

	@OriginalMember(owner = "client!ec", name = "e", descriptor = "[I")
	public static final int[] anIntArray528 = new int[250];

	@OriginalMember(owner = "client!ec", name = "f", descriptor = "[I")
	public static final int[] anIntArray529 = new int[13];

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(II)V")
	public static void method4938(@OriginalArg(0) int arg0) {
		if (arg0 != -1 && Static57.aBooleanArray6[arg0]) {
			Static337.aClass161_70.method4264(arg0);
			Static459.aClass245ArrayArray2[arg0] = null;
			Static107.aClass245ArrayArray1[arg0] = null;
			Static57.aBooleanArray6[arg0] = false;
		}
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(IIIIII)V")
	public static void method4939(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		Static347.anInt6621 = arg2;
		Static22.anInt8153 = arg0;
		Static99.anInt6726 = arg1;
		Static515.anInt8982 = arg3;
		Static236.anInt1380 = arg4;
		if (Static515.anInt8982 >= 100) {
			@Pc(34) int local34 = Static22.anInt8153 * 512 + 256;
			@Pc(40) int local40 = Static347.anInt6621 * 512 + 256;
			@Pc(49) int local49 = Static58.method1166(local40, local34, Static420.anInt7829) - Static236.anInt1380;
			@Pc(53) int local53 = local34 - Static311.anInt6050;
			@Pc(58) int local58 = local49 - Static347.anInt6620;
			@Pc(63) int local63 = local40 - Static329.anInt6297;
			@Pc(74) int local74 = (int) Math.sqrt((double) (local53 * local53 + local63 * local63));
			Static27.anInt778 = (int) (Math.atan2((double) local58, (double) local74) * 2607.5945876176133D) & 0x3FFF;
			Static262.anInt5491 = (int) (-2607.5945876176133D * Math.atan2((double) local53, (double) local63)) & 0x3FFF;
			Static100.anInt2054 = 0;
			if (Static27.anInt778 < 1024) {
				Static27.anInt778 = 1024;
			}
			if (Static27.anInt778 > 3072) {
				Static27.anInt778 = 3072;
			}
		}
		Static305.anInt5998 = 2;
	}
}
