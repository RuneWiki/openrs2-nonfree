import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static239 {

	@OriginalMember(owner = "client!hw", name = "C", descriptor = "Lclient!ho;")
	public static final Class160 aClass160_126 = new Class160(82, -1);

	@OriginalMember(owner = "client!hw", name = "F", descriptor = "[I")
	public static final int[] anIntArray232 = new int[3];

	@OriginalMember(owner = "client!hw", name = "a", descriptor = "(III)V")
	public static void method4000(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(9) Class342 local9 = Static556.aClass342ArrayArray1[arg1][arg0];
		if (local9 != null) {
			Static266.anInt10256 = local9.anInt9491;
			Static285.anInt5245 = local9.anInt9487;
			Static473.anInt8120 = local9.anInt9489;
		}
		Static137.method2081();
	}

	@OriginalMember(owner = "client!hw", name = "a", descriptor = "(IFIIZIIII)[[I")
	public static int[][] method4005(@OriginalArg(1) float arg0) {
		@Pc(7) int[][] local7 = new int[256][64];
		@Pc(11) Class14_Sub7_Sub9 local11 = new Class14_Sub7_Sub9();
		local11.aBoolean148 = false;
		local11.anInt2137 = 4;
		local11.anInt2128 = (int) (arg0 * 4096.0F);
		local11.anInt2129 = 4;
		local11.anInt2136 = 3;
		local11.method9386();
		Static598.method8463(256, 64);
		for (@Pc(45) int local45 = 0; local45 < 256; local45++) {
			local11.method2055(local7[local45], local45);
		}
		return local7;
	}
}
