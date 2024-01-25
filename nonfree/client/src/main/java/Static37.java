import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static37 {

	@OriginalMember(owner = "client!cj", name = "M", descriptor = "Lclient!lm;")
	public static Class134 aClass134_18;

	@OriginalMember(owner = "client!cj", name = "N", descriptor = "[[I")
	public static int[][] anIntArrayArray7;

	@OriginalMember(owner = "client!cj", name = "U", descriptor = "Lclient!le;")
	public static Class129 aClass129_1;

	@OriginalMember(owner = "client!cj", name = "V", descriptor = "I")
	public static int anInt998;

	@OriginalMember(owner = "client!cj", name = "W", descriptor = "F")
	public static float aFloat1;

	@OriginalMember(owner = "client!cj", name = "ab", descriptor = "F")
	public static float aFloat2;

	@OriginalMember(owner = "client!cj", name = "P", descriptor = "[I")
	public static final int[] anIntArray60 = new int[13];

	@OriginalMember(owner = "client!cj", name = "T", descriptor = "I")
	public static int anInt997 = 0;

	@OriginalMember(owner = "client!cj", name = "Z", descriptor = "I")
	public static int anInt1000 = 0;

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(Lclient!lm;I)I")
	public static int method779(@OriginalArg(0) Class134 arg0) {
		@Pc(5) int local5 = 0;
		if (arg0.method3005(Static342.anInt2477)) {
			local5++;
		}
		if (arg0.method3005(Static165.anInt3414)) {
			local5++;
		}
		return local5;
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(ZIIII)V")
	public static void method780(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (Static274.method4904(arg3)) {
			Static99.method1592(Static313.aClass163ArrayArray1[arg3], -1, arg0, arg2, arg1);
		}
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(Lclient!cd;I)I")
	public static int method782(@OriginalArg(0) Class10_Sub1_Sub2_Sub1 arg0) {
		@Pc(8) Class60 local8 = arg0.aClass60_1;
		if (local8.anIntArray109 != null) {
			local8 = local8.method1274();
			if (local8 == null) {
				return -1;
			}
		}
		@Pc(29) int local29 = local8.anInt1525;
		@Pc(33) Class118 local33 = arg0.method3408();
		if (arg0.aBoolean307) {
			local29 = local8.anInt1503;
		} else if (local33.anInt2967 == arg0.anInt4034 || arg0.anInt4034 == local33.anInt2970 || local33.anInt2969 == arg0.anInt4034 || local33.anInt2968 == arg0.anInt4034) {
			local29 = local8.anInt1533;
		} else if (arg0.anInt4034 == local33.anInt2974 || arg0.anInt4034 == local33.anInt2984 || arg0.anInt4034 == local33.anInt2991 || arg0.anInt4034 == local33.anInt2957) {
			local29 = local8.anInt1498;
		}
		return local29;
	}
}
