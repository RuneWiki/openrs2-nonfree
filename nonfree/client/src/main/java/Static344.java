import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static344 {

	@OriginalMember(owner = "client!rb", name = "b", descriptor = "[S")
	public static short[] aShortArray114;

	@OriginalMember(owner = "client!rb", name = "c", descriptor = "[Lclient!o;")
	public static Class137[] aClass137Array15;

	@OriginalMember(owner = "client!rb", name = "d", descriptor = "Z")
	public static boolean aBoolean402;

	@OriginalMember(owner = "client!rb", name = "e", descriptor = "Lclient!di;")
	public static Class56 aClass56_1;

	@OriginalMember(owner = "client!rb", name = "f", descriptor = "[Lclient!o;")
	public static Class137[] aClass137Array16;

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(IIILclient!za;BILclient!ec;Lclient!ta;I)V")
	public static void method4862(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class106 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class68 arg5, @OriginalArg(7) Class24 arg6, @OriginalArg(8) int arg7) {
		@Pc(16) Class47 local16 = Static163.aClass170_2.method3739(arg7);
		if (local16 == null || !local16.aBoolean101 || !local16.method1081(Static366.aClass190_1)) {
			return;
		}
		@Pc(36) int local36;
		if (local16.anIntArray135 != null) {
			@Pc(34) int[] local34 = new int[local16.anIntArray135.length];
			@Pc(48) int local48;
			for (local36 = 0; local36 < local34.length / 2; local36++) {
				if (Static21.anInt6762 == 4) {
					local48 = (int) Static267.aFloat83 & 0x3FFF;
				} else {
					local48 = Static217.anInt4366 + (int) Static267.aFloat83 & 0x3FFF;
				}
				@Pc(59) int local59 = Class90_Sub1.anIntArray304[local48];
				@Pc(63) int local63 = Class90_Sub1.anIntArray303[local48];
				if (Static21.anInt6762 != 4) {
					local63 = local63 * 256 / (Static135.anInt3022 + 256);
					local59 = local59 * 256 / (Static135.anInt3022 + 256);
				}
				local34[local36 * 2] = arg2 + arg5.anInt2107 / 2 + (local59 * (arg0 - -(local16.anIntArray135[local36 * 2 + 1] * 4)) - -(local63 * (arg4 + local16.anIntArray135[local36 * 2] * 4)) >> 15);
				local34[local36 * 2 + 1] = arg1 + arg5.anInt2149 / 2 - ((local16.anIntArray135[local36 * 2 + 1] * 4 + arg0) * local63 - (local16.anIntArray135[local36 * 2] * 4 + arg4) * local59 >> 15);
			}
			Static202.method3246(arg3, local34, local16.anInt1536, arg5.anIntArray225, arg5.anIntArray224);
			for (local48 = 0; local48 < local34.length / 2 - 1; local48++) {
				arg3.method5933(local34[local48 * 2], local34[local48 * 2 + 1], local34[(local48 + 1) * 2], local34[(local48 + 1) * 2 + 1], local16.anInt1556, arg6, arg2, arg1);
			}
			arg3.method5933(local34[local34.length - 2], local34[local34.length - 1], local34[0], local34[1], local16.anInt1556, arg6, arg2, arg1);
		}
		@Pc(264) Class137 local264 = null;
		if (local16.anInt1560 != -1) {
			local264 = local16.method1078(false, arg3);
			if (local264 != null) {
				Static16.method313(arg2, arg4, arg1, local264, arg6, arg0, arg5);
			}
		}
		if (local16.aString11 == null) {
			return;
		}
		local36 = 0;
		if (local264 != null) {
			local36 = local264.ZA();
		}
		@Pc(298) Class20 local298 = Static180.aClass20_3;
		@Pc(300) Class209 local300 = Static67.aClass209_3;
		if (local16.anInt1529 == 1) {
			local300 = Static215.aClass209_7;
			local298 = Static308.aClass20_5;
		}
		if (local16.anInt1529 == 2) {
			local298 = Static13.aClass20_2;
			local300 = Static394.aClass209_10;
		}
		Static372.method5187(arg1, local300, local298, arg6, arg5, arg0, local36, local16.aString11, arg4, arg2, local16.anInt1539);
		return;
	}
}
