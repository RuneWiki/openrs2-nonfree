import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static33 {

	@OriginalMember(owner = "client!aw", name = "B", descriptor = "D")
	public static double aDouble1;

	@OriginalMember(owner = "client!aw", name = "s", descriptor = "Lclient!pi;")
	public static final Class286 aClass286_10 = new Class286(45, 18);

	@OriginalMember(owner = "client!aw", name = "w", descriptor = "[Lclient!pk;")
	public static Class288[] aClass288Array1 = null;

	@OriginalMember(owner = "client!aw", name = "a", descriptor = "(Lclient!bla;III)V")
	public static void method506(@OriginalArg(0) Class19_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(12) Class262 local12;
		if (arg2 < Static509.anInt8656) {
			local12 = Static584.aClass262ArrayArrayArray2[arg1][arg2 + 1][arg3];
			if (local12 != null && local12.aClass19_Sub1_Sub5_1 != null && local12.aClass19_Sub1_Sub5_1.method9368()) {
				arg0.method9373(true, Static495.anInt8508, Static626.aClass67_16, 0, local12.aClass19_Sub1_Sub5_1, 0);
			}
		}
		if (arg3 < Static509.anInt8656) {
			local12 = Static584.aClass262ArrayArrayArray2[arg1][arg2][arg3 + 1];
			if (local12 != null && local12.aClass19_Sub1_Sub5_1 != null && local12.aClass19_Sub1_Sub5_1.method9368()) {
				arg0.method9373(true, 0, Static626.aClass67_16, 0, local12.aClass19_Sub1_Sub5_1, Static495.anInt8508);
			}
		}
		if (arg2 < Static509.anInt8656 && arg3 < Static164.anInt3059) {
			local12 = Static584.aClass262ArrayArrayArray2[arg1][arg2 + 1][arg3 + 1];
			if (local12 != null && local12.aClass19_Sub1_Sub5_1 != null && local12.aClass19_Sub1_Sub5_1.method9368()) {
				arg0.method9373(true, Static495.anInt8508, Static626.aClass67_16, 0, local12.aClass19_Sub1_Sub5_1, Static495.anInt8508);
			}
		}
		if (arg2 < Static509.anInt8656 && arg3 > 0) {
			local12 = Static584.aClass262ArrayArrayArray2[arg1][arg2 + 1][arg3 - 1];
			if (local12 != null && local12.aClass19_Sub1_Sub5_1 != null && local12.aClass19_Sub1_Sub5_1.method9368()) {
				arg0.method9373(true, Static495.anInt8508, Static626.aClass67_16, 0, local12.aClass19_Sub1_Sub5_1, -Static495.anInt8508);
			}
		}
	}
}
