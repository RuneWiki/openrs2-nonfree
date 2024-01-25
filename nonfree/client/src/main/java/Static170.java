import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static170 {

	@OriginalMember(owner = "client!gb", name = "q", descriptor = "F")
	public static float aFloat143;

	@OriginalMember(owner = "client!gb", name = "s", descriptor = "[[[Lclient!fu;")
	public static Class106[][][] aClass106ArrayArrayArray1;

	@OriginalMember(owner = "client!gb", name = "p", descriptor = "[I")
	public static int[] anIntArray225 = new int[2];

	@OriginalMember(owner = "client!gb", name = "r", descriptor = "[Lclient!rj;")
	public static final Class290[] aClass290Array1 = new Class290[14];

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(Lclient!mb;III)V")
	public static void method3545(@OriginalArg(0) Class2_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(12) Class106 local12;
		if (arg2 < Static642.anInt10523) {
			local12 = aClass106ArrayArrayArray1[arg1][arg2 + 1][arg3];
			if (local12 != null && local12.aClass2_Sub3_Sub5_1 != null && local12.aClass2_Sub3_Sub5_1.method8564()) {
				arg0.method8569(true, local12.aClass2_Sub3_Sub5_1, Static185.aClass33_8, Static325.anInt6512, 0, 0);
			}
		}
		if (arg3 < Static642.anInt10523) {
			local12 = aClass106ArrayArrayArray1[arg1][arg2][arg3 + 1];
			if (local12 != null && local12.aClass2_Sub3_Sub5_1 != null && local12.aClass2_Sub3_Sub5_1.method8564()) {
				arg0.method8569(true, local12.aClass2_Sub3_Sub5_1, Static185.aClass33_8, 0, Static325.anInt6512, 0);
			}
		}
		if (arg2 < Static642.anInt10523 && arg3 < Static158.anInt3845) {
			local12 = aClass106ArrayArrayArray1[arg1][arg2 + 1][arg3 + 1];
			if (local12 != null && local12.aClass2_Sub3_Sub5_1 != null && local12.aClass2_Sub3_Sub5_1.method8564()) {
				arg0.method8569(true, local12.aClass2_Sub3_Sub5_1, Static185.aClass33_8, Static325.anInt6512, Static325.anInt6512, 0);
			}
		}
		if (arg2 < Static642.anInt10523 && arg3 > 0) {
			local12 = aClass106ArrayArrayArray1[arg1][arg2 + 1][arg3 - 1];
			if (local12 != null && local12.aClass2_Sub3_Sub5_1 != null && local12.aClass2_Sub3_Sub5_1.method8564()) {
				arg0.method8569(true, local12.aClass2_Sub3_Sub5_1, Static185.aClass33_8, Static325.anInt6512, -Static325.anInt6512, 0);
			}
		}
	}

	@OriginalMember(owner = "client!gb", name = "b", descriptor = "(B)Ljava/lang/String;")
	public static String method3547() {
		@Pc(12) String local12 = "www";
		if (Static85.aClass107_2 == Static200.aClass107_4) {
			local12 = "www-wtrc";
		} else if (Static85.aClass107_2 == Static619.aClass107_6) {
			local12 = "www-wtqa";
		} else if (Static85.aClass107_2 == Static559.aClass107_5) {
			local12 = "www-wtwip";
		}
		@Pc(33) String local33 = "";
		if (Static455.aString92 != null) {
			local33 = "/p=" + Static455.aString92;
		}
		return "http://" + local12 + "." + Static648.aClass62_16.aString18 + ".com/l=" + Static380.anInt7247 + "/a=" + Static134.anInt3486 + local33 + "/";
	}
}
