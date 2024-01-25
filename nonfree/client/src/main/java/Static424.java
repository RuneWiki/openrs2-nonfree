import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static424 {

	@OriginalMember(owner = "client!vk", name = "J", descriptor = "[I")
	public static final int[] anIntArray496 = new int[3];

	@OriginalMember(owner = "client!vk", name = "R", descriptor = "[[I")
	public static final int[][] anIntArrayArray59 = new int[][] { { 12, 12, 12, 12 }, { 12, 12, 12, 12 }, { 5, 5, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 12, 12, 12, 12, 12, 12 }, { 1, 1, 1, 7 }, { 1, 1, 7, 1 }, { 8, 9, 9, 8, 8, 9 }, { 8, 8, 9, 8, 9, 9 }, { 10, 10, 11, 11, 11, 10 }, { 12, 12, 12, 12 } };

	@OriginalMember(owner = "client!vk", name = "e", descriptor = "(I)V")
	public static void method5741() {
		@Pc(14) int local14 = (int) ((double) Static81.anInt1950 * 34.46D);
		local14 <<= 0x0;
		if (Static387.aClass26_9.method2272()) {
			local14 += 128;
		}
		Static387.aClass26_9.JA(50, local14);
	}

	@OriginalMember(owner = "client!vk", name = "f", descriptor = "(I)Lclient!bk;")
	public static Class2_Sub2_Sub2 method5742() {
		@Pc(13) Class2_Sub2_Sub2 local13 = (Class2_Sub2_Sub2) Static71.aClass145_1.method3390();
		if (local13 != null) {
			local13.method6072();
			local13.method5934();
			return local13;
		}
		do {
			local13 = (Class2_Sub2_Sub2) Static430.aClass145_10.method3390();
			if (local13 == null) {
				return null;
			}
			if (local13.method436() > Static208.method3182()) {
				return null;
			}
			local13.method6072();
			local13.method5934();
		} while ((Long.MIN_VALUE & local13.aLong223) == 0L);
		return local13;
	}
}
