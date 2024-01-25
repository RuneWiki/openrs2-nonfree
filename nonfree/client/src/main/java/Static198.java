import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static198 {

	@OriginalMember(owner = "client!hn", name = "d", descriptor = "[I")
	public static int[] anIntArray185;

	@OriginalMember(owner = "client!hn", name = "e", descriptor = "[Lclient!kea;")
	public static Class187[] aClass187Array1;

	@OriginalMember(owner = "client!hn", name = "g", descriptor = "I")
	public static int anInt3804 = -1;

	@OriginalMember(owner = "client!hn", name = "i", descriptor = "I")
	public static int anInt3805 = 0;

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(BIII)V")
	public static void method3089(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(9) int local9 = Static539.anInt9045 + arg2;
		@Pc(13) int local13 = arg0 + Static311.anInt5708;
		if (Static568.aClass360ArrayArrayArray22 == null || arg2 < 0 || arg0 < 0 || Static458.anInt9736 <= arg2 || arg0 >= Static378.anInt6747 || !Static86.aClass1_Sub30_Sub1_1.method5029(Static286.anInt5239) && arg1 != Static201.aClass11_Sub1_Sub1_Sub3_Sub1_2.aByte113) {
			return;
		}
		@Pc(63) long local63 = (long) (local13 << 14 | arg1 << 28 | local9);
		@Pc(69) Class1_Sub20 local69 = (Class1_Sub20) Static365.aClass91_29.method2271(local63);
		if (local69 == null) {
			Static464.method7009(arg1, arg2, arg0);
			return;
		}
		@Pc(83) Class1_Sub37 local83 = (Class1_Sub37) local69.aClass111_10.method2547();
		if (local83 == null) {
			Static464.method7009(arg1, arg2, arg0);
			return;
		}
		@Pc(97) Class11_Sub1_Sub2_Sub1 local97 = (Class11_Sub1_Sub2_Sub1) Static464.method7009(arg1, arg2, arg0);
		if (local97 == null) {
			local97 = new Class11_Sub1_Sub2_Sub1(arg2 << 9, Static310.aClass129Array5[arg1].method6481(arg0, arg2), arg0 << 9, arg1, arg1);
		} else {
			local97.anInt7870 = local97.anInt7871 = -1;
		}
		local97.anInt7886 = local83.anInt6969;
		local97.anInt7882 = local83.anInt6970;
		label56: while (true) {
			@Pc(140) Class1_Sub37 local140 = (Class1_Sub37) local69.aClass111_10.method2554();
			if (local140 == null) {
				break;
			}
			if (local97.anInt7882 != local140.anInt6970) {
				local97.anInt7870 = local140.anInt6970;
				local97.anInt7875 = local140.anInt6969;
				while (true) {
					@Pc(165) Class1_Sub37 local165 = (Class1_Sub37) local69.aClass111_10.method2554();
					if (local165 == null) {
						break label56;
					}
					if (local165.anInt6970 != local97.anInt7882 && local165.anInt6970 != local97.anInt7870) {
						local97.anInt7871 = local165.anInt6970;
						local97.anInt7873 = local165.anInt6969;
					}
				}
			}
		}
		@Pc(209) int local209 = Static538.method6114(arg1, (arg0 << 9) + 256, (arg2 << 9) + 256);
		local97.anInt8902 = arg2 << 9;
		local97.aByte112 = (byte) arg1;
		local97.anInt8906 = arg0 << 9;
		local97.anInt8908 = local209;
		local97.anInt7877 = 0;
		local97.aByte113 = (byte) arg1;
		if (Static34.method641(arg2, arg0)) {
			local97.aByte112++;
		}
		Static275.method4013(arg1, arg2, arg0, local209, local97);
	}
}
