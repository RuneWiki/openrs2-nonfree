import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static608 {

	@OriginalMember(owner = "client!vk", name = "G", descriptor = "Lclient!id;")
	public static Class151 aClass151_1;

	@OriginalMember(owner = "client!vk", name = "H", descriptor = "I")
	public static int anInt9971;

	@OriginalMember(owner = "client!vk", name = "F", descriptor = "[I")
	public static final int[] anIntArray804 = new int[14];

	@OriginalMember(owner = "client!vk", name = "I", descriptor = "[[I")
	public static final int[][] anIntArrayArray61 = new int[128][128];

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "(IIIZBILclient!wu;)V")
	public static void method8468(@OriginalArg(1) int arg0, @OriginalArg(5) int arg1, @OriginalArg(6) Class384 arg2) {
		Static617.aBoolean818 = false;
		Static166.aClass384_43 = arg2;
		Static583.aClass5_Sub16_Sub1_6 = null;
		Static3.anInt29 = 2;
		Static474.anInt7949 = arg1;
		Static198.anInt3546 = 0;
		Static210.anInt3640 = arg0;
		Static571.anInt9391 = 1;
	}

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "(Lclient!kf;III)V")
	public static void method8470(@OriginalArg(0) Class14_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(12) Class156 local12;
		if (arg2 < Static129.anInt6336) {
			local12 = Static535.aClass156ArrayArrayArray2[arg1][arg2 + 1][arg3];
			if (local12 != null && local12.aClass14_Sub1_Sub5_1 != null && local12.aClass14_Sub1_Sub5_1.method7992()) {
				arg0.method7996(local12.aClass14_Sub1_Sub5_1, Static480.aClass126_12, Static407.anInt7012, 0, true, 0);
			}
		}
		if (arg3 < Static129.anInt6336) {
			local12 = Static535.aClass156ArrayArrayArray2[arg1][arg2][arg3 + 1];
			if (local12 != null && local12.aClass14_Sub1_Sub5_1 != null && local12.aClass14_Sub1_Sub5_1.method7992()) {
				arg0.method7996(local12.aClass14_Sub1_Sub5_1, Static480.aClass126_12, 0, Static407.anInt7012, true, 0);
			}
		}
		if (arg2 < Static129.anInt6336 && arg3 < Static150.anInt2400) {
			local12 = Static535.aClass156ArrayArrayArray2[arg1][arg2 + 1][arg3 + 1];
			if (local12 != null && local12.aClass14_Sub1_Sub5_1 != null && local12.aClass14_Sub1_Sub5_1.method7992()) {
				arg0.method7996(local12.aClass14_Sub1_Sub5_1, Static480.aClass126_12, Static407.anInt7012, Static407.anInt7012, true, 0);
			}
		}
		if (arg2 < Static129.anInt6336 && arg3 > 0) {
			local12 = Static535.aClass156ArrayArrayArray2[arg1][arg2 + 1][arg3 - 1];
			if (local12 != null && local12.aClass14_Sub1_Sub5_1 != null && local12.aClass14_Sub1_Sub5_1.method7992()) {
				arg0.method7996(local12.aClass14_Sub1_Sub5_1, Static480.aClass126_12, Static407.anInt7012, -Static407.anInt7012, true, 0);
			}
		}
	}
}
