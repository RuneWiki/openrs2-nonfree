import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static157 {

	@OriginalMember(owner = "client!eq", name = "b", descriptor = "(III)Lclient!qca;")
	public static Class19_Sub1_Sub2 method8979(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class262 local7 = Static584.aClass262ArrayArrayArray2[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass19_Sub1_Sub2_1;
	}

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(Z)V")
	public static void method8980() {
		if (!Static175.aBoolean765) {
			Static71.aBoolean90 = true;
			Static144.aFloat56 += (-24.0F - Static144.aFloat56) / 2.0F;
			Static175.aBoolean765 = true;
		}
	}
}
