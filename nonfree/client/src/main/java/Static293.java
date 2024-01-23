import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static293 {

	@OriginalMember(owner = "client!ve", name = "C", descriptor = "Lclient!ad;")
	public static Class3 aClass3_1;

	@OriginalMember(owner = "client!ve", name = "E", descriptor = "I")
	public static int anInt5866;

	@OriginalMember(owner = "client!ve", name = "y", descriptor = "Lclient!jl;")
	public static Class89 aClass89_50 = new Class89(16);

	@OriginalMember(owner = "client!ve", name = "A", descriptor = "Z")
	public static boolean aBoolean364 = true;

	@OriginalMember(owner = "client!ve", name = "B", descriptor = "[I")
	public static int[] anIntArray529 = new int[] { 2, 0, 0, 2, 0, 0, 0, 4, 4 };

	@OriginalMember(owner = "client!ve", name = "D", descriptor = "Lclient!jl;")
	public static Class89 aClass89_51 = new Class89(4);

	@OriginalMember(owner = "client!ve", name = "F", descriptor = "I")
	public static int anInt5867 = 0;

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(FIIIZIIII)[[I")
	public static int[][] method4478(@OriginalArg(0) float arg0) {
		@Pc(5) int[][] local5 = new int[256][64];
		@Pc(9) Class1_Sub1_Sub33 local9 = new Class1_Sub1_Sub33();
		local9.anInt5199 = (int) (arg0 * 4096.0F);
		local9.anInt5196 = 8;
		local9.aBoolean322 = false;
		local9.anInt5198 = 4;
		local9.anInt5194 = 3;
		local9.method4720();
		Static269.method4050(64, 256);
		for (@Pc(47) int local47 = 0; local47 < 256; local47++) {
			local9.method3941(local5[local47], local47);
		}
		return local5;
	}

	@OriginalMember(owner = "client!ve", name = "b", descriptor = "(I)V")
	public static void method4479() {
		Static290.aClass89_48.method2265();
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(IBIIII)V")
	public static void method4481(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		for (@Pc(12) int local12 = arg4; local12 <= arg2; local12++) {
			Static98.method3942(arg0, Static121.anIntArrayArray33[local12], arg1, arg3);
		}
	}
}
