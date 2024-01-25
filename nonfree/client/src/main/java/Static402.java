import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static402 {

	@OriginalMember(owner = "client!pd", name = "f", descriptor = "[I")
	public static final int[] anIntArray426 = new int[14];

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(III)Z")
	public static boolean method5822(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(27) boolean local27 = (arg0 & 0x37) == 0 ? Static171.method3051(arg1, arg0) : Static317.method4651(arg0, arg1);
		return local27 | (arg1 & 0x10000) != 0 | Static269.method4101(arg1, arg0);
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(B)V")
	public static void method5823() {
		Static530.method7083();
		Static236.method3658();
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(II)V")
	public static void method5824(@OriginalArg(1) int arg0) {
		Static455.anInt7670 = -1;
		Static56.anInt1176 = arg0;
		Static406.anInt7005 = -1;
		Static109.method1915();
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(Z)V")
	public static void method5825() {
		if (Static150.aBoolean255) {
			return;
		}
		if (Static405.aClass3_Sub3_Sub1_1.aBoolean577) {
			Static43.aFloat20 = (int) Static43.aFloat20 + 191 & 0xFFFFFF80;
		} else {
			Static311.aFloat117 += (24.0F - Static311.aFloat117) / 2.0F;
		}
		Static115.aBoolean505 = true;
		Static150.aBoolean255 = true;
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(Lclient!rb;III)V")
	public static void method5826(@OriginalArg(0) Class41_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(12) Class299 local12;
		if (arg2 < Static155.anInt3254) {
			local12 = Static309.aClass299ArrayArrayArray3[arg1][arg2 + 1][arg3];
			if (local12 != null && local12.aClass41_Sub2_Sub5_1 != null && local12.aClass41_Sub2_Sub5_1.method7839()) {
				arg0.method7840(0, Static467.anInt7776, 0, local12.aClass41_Sub2_Sub5_1, Static511.aClass45_12, true);
			}
		}
		if (arg3 < Static155.anInt3254) {
			local12 = Static309.aClass299ArrayArrayArray3[arg1][arg2][arg3 + 1];
			if (local12 != null && local12.aClass41_Sub2_Sub5_1 != null && local12.aClass41_Sub2_Sub5_1.method7839()) {
				arg0.method7840(0, 0, Static467.anInt7776, local12.aClass41_Sub2_Sub5_1, Static511.aClass45_12, true);
			}
		}
		if (arg2 < Static155.anInt3254 && arg3 < Static39.anInt747) {
			local12 = Static309.aClass299ArrayArrayArray3[arg1][arg2 + 1][arg3 + 1];
			if (local12 != null && local12.aClass41_Sub2_Sub5_1 != null && local12.aClass41_Sub2_Sub5_1.method7839()) {
				arg0.method7840(0, Static467.anInt7776, Static467.anInt7776, local12.aClass41_Sub2_Sub5_1, Static511.aClass45_12, true);
			}
		}
		if (arg2 < Static155.anInt3254 && arg3 > 0) {
			local12 = Static309.aClass299ArrayArrayArray3[arg1][arg2 + 1][arg3 - 1];
			if (local12 != null && local12.aClass41_Sub2_Sub5_1 != null && local12.aClass41_Sub2_Sub5_1.method7839()) {
				arg0.method7840(0, Static467.anInt7776, -Static467.anInt7776, local12.aClass41_Sub2_Sub5_1, Static511.aClass45_12, true);
			}
		}
	}
}
