import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static408 {

	@OriginalMember(owner = "client!nha", name = "d", descriptor = "I")
	public static int anInt7042;

	@OriginalMember(owner = "client!nha", name = "l", descriptor = "I")
	public static int anInt7044;

	@OriginalMember(owner = "client!nha", name = "i", descriptor = "F")
	public static float aFloat107;

	@OriginalMember(owner = "client!nha", name = "k", descriptor = "F")
	public static float aFloat108;

	@OriginalMember(owner = "client!nha", name = "a", descriptor = "Lclient!ho;")
	public static final Class160 aClass160_182 = new Class160(98, -1);

	@OriginalMember(owner = "client!nha", name = "b", descriptor = "Lclient!pg;")
	public static final Class14_Sub36 aClass14_Sub36_1 = new Class14_Sub36(0, 0);

	@OriginalMember(owner = "client!nha", name = "e", descriptor = "Lclient!pj;")
	public static final Class287 aClass287_3 = new Class287();

	@OriginalMember(owner = "client!nha", name = "a", descriptor = "(Lclient!haa;III)V")
	public static void method6135(@OriginalArg(0) Class4_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(12) Class89 local12;
		if (arg2 < Static654.anInt10715) {
			local12 = Static63.aClass89ArrayArrayArray1[arg1][arg2 + 1][arg3];
			if (local12 != null && local12.aClass4_Sub3_Sub2_1 != null && local12.aClass4_Sub3_Sub2_1.method9483()) {
				arg0.method9480(Static554.aClass144_12, Static391.anInt6813, 0, true, local12.aClass4_Sub3_Sub2_1, 0);
			}
		}
		if (arg3 < Static654.anInt10715) {
			local12 = Static63.aClass89ArrayArrayArray1[arg1][arg2][arg3 + 1];
			if (local12 != null && local12.aClass4_Sub3_Sub2_1 != null && local12.aClass4_Sub3_Sub2_1.method9483()) {
				arg0.method9480(Static554.aClass144_12, 0, Static391.anInt6813, true, local12.aClass4_Sub3_Sub2_1, 0);
			}
		}
		if (arg2 < Static654.anInt10715 && arg3 < Static180.anInt2928) {
			local12 = Static63.aClass89ArrayArrayArray1[arg1][arg2 + 1][arg3 + 1];
			if (local12 != null && local12.aClass4_Sub3_Sub2_1 != null && local12.aClass4_Sub3_Sub2_1.method9483()) {
				arg0.method9480(Static554.aClass144_12, Static391.anInt6813, Static391.anInt6813, true, local12.aClass4_Sub3_Sub2_1, 0);
			}
		}
		if (arg2 < Static654.anInt10715 && arg3 > 0) {
			local12 = Static63.aClass89ArrayArrayArray1[arg1][arg2 + 1][arg3 - 1];
			if (local12 != null && local12.aClass4_Sub3_Sub2_1 != null && local12.aClass4_Sub3_Sub2_1.method9483()) {
				arg0.method9480(Static554.aClass144_12, Static391.anInt6813, -Static391.anInt6813, true, local12.aClass4_Sub3_Sub2_1, 0);
			}
		}
	}

	@OriginalMember(owner = "client!nha", name = "a", descriptor = "(IZLclient!qga;)Ljava/lang/String;")
	public static String method6137(@OriginalArg(0) int arg0, @OriginalArg(2) Class299 arg1) {
		if (!Static80.method1360(arg1).method479(arg0) && arg1.anObjectArray15 == null) {
			return null;
		} else if (arg1.aStringArray36 == null || arg0 >= arg1.aStringArray36.length || arg1.aStringArray36[arg0] == null || arg1.aStringArray36[arg0].trim().length() == 0) {
			return Static123.aBoolean140 ? "Hidden-" + arg0 : null;
		} else {
			return arg1.aStringArray36[arg0];
		}
	}
}
