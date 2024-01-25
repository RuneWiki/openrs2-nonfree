import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static213 {

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "Z")
	public static boolean aBoolean42;

	@OriginalMember(owner = "client!ks", name = "d", descriptor = "Ljava/lang/Object;")
	public static Object anObject4;

	@OriginalMember(owner = "client!ks", name = "e", descriptor = "[I")
	public static final int[] anIntArray58 = new int[] { -1, -1, 1, 1 };

	@OriginalMember(owner = "client!ks", name = "f", descriptor = "Z")
	public static boolean aBoolean43 = false;

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "(Lclient!ft;B[[B)V")
	public static void method574(@OriginalArg(0) Class26_Sub1 arg0, @OriginalArg(2) byte[][] arg1) {
		@Pc(12) int[] local12 = new int[] { -1, 0, 0, 0, 0 };
		@Pc(15) int local15 = arg1.length;
		@Pc(41) int local41;
		for (@Pc(22) int local22 = 0; local22 < local15; local22++) {
			@Pc(28) byte[] local28 = arg1[local22];
			if (local28 != null) {
				@Pc(35) Class4_Sub9 local35 = new Class4_Sub9(local28);
				local41 = Static91.anIntArray131[local22] >> 8;
				@Pc(47) int local47 = Static91.anIntArray131[local22] & 0xFF;
				@Pc(53) int local53 = local41 * 64 - Static365.anInt6047;
				@Pc(60) int local60 = local47 * 64 - Static366.anInt6052;
				Static150.method2112();
				arg0.method1713(Static409.aClass128Array1, local60, Static366.anInt6052, local53, Static365.anInt6047, local35);
				arg0.method1721(local35, local53, local12, Static39.aClass135_1, local60);
				if (!arg0.aBoolean148 && local41 == Static34.anInt2146 / 8 && Static361.anInt627 / 8 == local47 && local12[0] != -1) {
					Static113.aClass209_1 = Static344.aClass263_1.method5912(local12[2], local12[1], local12[3], Static28.aClass129_3, local12[0]);
					Static412.anInt6984 = local12[4];
				}
			}
		}
		for (@Pc(131) int local131 = 0; local131 < local15; local131++) {
			@Pc(144) int local144 = (Static91.anIntArray131[local131] >> 8) * 64 - Static365.anInt6047;
			local41 = (Static91.anIntArray131[local131] & 0xFF) * 64 - Static366.anInt6052;
			@Pc(159) byte[] local159 = arg1[local131];
			if (local159 == null && Static361.anInt627 < 800) {
				Static150.method2112();
				arg0.method1712(local41, local144);
			}
		}
	}
}
