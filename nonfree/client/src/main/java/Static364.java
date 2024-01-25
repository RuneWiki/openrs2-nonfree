import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static364 {

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(IILclient!je;)V")
	public static void method6183(@OriginalArg(1) int arg0, @OriginalArg(2) Class178 arg1) {
		if (Static356.anInt6821 >= 50 || (arg1 == null || arg1.anIntArrayArray18 == null || arg0 >= arg1.anIntArrayArray18.length || arg1.anIntArrayArray18[arg0] == null)) {
			return;
		}
		@Pc(32) int local32 = arg1.anIntArrayArray18[arg0][0];
		@Pc(36) int local36 = local32 >> 8;
		@Pc(59) int local59;
		if (arg1.anIntArrayArray18[arg0].length > 1) {
			local59 = (int) ((double) arg1.anIntArrayArray18[arg0].length * Math.random());
			if (local59 > 0) {
				local36 = arg1.anIntArrayArray18[arg0][local59];
			}
		}
		@Pc(74) int local74 = local32 >> 5 & 0x7;
		local59 = 256;
		if (arg1.anIntArray258 != null && arg1.anIntArray262 != null) {
			local59 = Static237.method4263(arg1.anIntArray262[arg0], arg1.anIntArray258[arg0]);
		}
		if (arg1.aBoolean383) {
			Static248.method4409(local74, 255, local36, 0, local59, false);
		} else {
			Static28.method487(local36, local74, 255, local59, 0);
		}
	}
}
