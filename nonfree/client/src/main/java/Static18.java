import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static18 {

	@OriginalMember(owner = "client!ar", name = "a", descriptor = "I")
	public static int anInt3417 = 0;

	@OriginalMember(owner = "client!ar", name = "b", descriptor = "I")
	public static int anInt3418 = 0;

	@OriginalMember(owner = "client!ar", name = "c", descriptor = "[I")
	public static final int[] anIntArray300 = new int[4096];

	@OriginalMember(owner = "client!ar", name = "d", descriptor = "I")
	public static int anInt3419 = 503;

	@OriginalMember(owner = "client!ar", name = "f", descriptor = "Z")
	public static boolean aBoolean210 = false;

	@OriginalMember(owner = "client!ar", name = "a", descriptor = "(II)V")
	public static void method2728(@OriginalArg(0) int arg0) {
		@Pc(8) Class2_Sub5_Sub11 local8 = Static316.method4316(9, arg0);
		local8.method3101();
	}

	@OriginalMember(owner = "client!ar", name = "a", descriptor = "(IIIBII)V")
	public static void method2730(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(17) int local17 = 0;
		@Pc(19) int local19 = arg1;
		@Pc(23) int local23 = arg2 * arg2;
		@Pc(27) int local27 = arg1 * arg1;
		@Pc(31) int local31 = local27 << 1;
		@Pc(35) int local35 = local23 << 1;
		@Pc(39) int local39 = arg1 << 1;
		@Pc(47) int local47 = local23 * (1 - local39) + local31;
		@Pc(56) int local56 = local27 - (local39 - 1) * local35;
		@Pc(60) int local60 = local23 << 2;
		@Pc(64) int local64 = local27 << 2;
		@Pc(72) int local72 = local31 * 3;
		@Pc(80) int local80 = local35 * ((arg1 << 1) - 3);
		@Pc(86) int local86 = local64;
		@Pc(92) int local92 = local60 * (arg1 - 1);
		@Pc(111) int local111;
		@Pc(120) int local120;
		if (Static219.anInt6125 <= arg0 && Static155.anInt2670 >= arg0) {
			local111 = Static331.method4435(arg3 + arg2, Static215.anInt3546, Static317.anInt6670);
			local120 = Static331.method4435(arg3 - arg2, Static215.anInt3546, Static317.anInt6670);
			Static216.method2862(local120, local111, arg4, Static229.anIntArrayArray26[arg0]);
		}
		while (local19 > 0) {
			if (local47 < 0) {
				while (local47 < 0) {
					local47 += local72;
					local56 += local86;
					local17++;
					local72 += local64;
					local86 += local64;
				}
			}
			if (local56 < 0) {
				local47 += local72;
				local56 += local86;
				local86 += local64;
				local72 += local64;
				local17++;
			}
			local56 += -local80;
			local47 += -local92;
			local19--;
			local80 -= local60;
			local92 -= local60;
			local111 = arg0 - local19;
			local120 = arg0 + local19;
			if (Static219.anInt6125 <= local120 && local111 <= Static155.anInt2670) {
				@Pc(222) int local222 = Static331.method4435(local17 + arg3, Static215.anInt3546, Static317.anInt6670);
				@Pc(230) int local230 = Static331.method4435(arg3 - local17, Static215.anInt3546, Static317.anInt6670);
				if (local111 >= Static219.anInt6125) {
					Static216.method2862(local230, local222, arg4, Static229.anIntArrayArray26[local111]);
				}
				if (local120 <= Static155.anInt2670) {
					Static216.method2862(local230, local222, arg4, Static229.anIntArrayArray26[local120]);
				}
			}
		}
	}
}
