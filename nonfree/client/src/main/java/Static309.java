import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static309 {

	@OriginalMember(owner = "client!kfa", name = "c", descriptor = "I")
	public static int anInt5585;

	@OriginalMember(owner = "client!kfa", name = "a", descriptor = "I")
	public static int anInt5583 = -1;

	@OriginalMember(owner = "client!kfa", name = "b", descriptor = "I")
	public static int anInt5584 = 0;

	@OriginalMember(owner = "client!kfa", name = "a", descriptor = "(IIILclient!ne;)V")
	public static void method5063(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class15_Sub3_Sub5 arg3) {
		@Pc(4) Class291 local4 = Static654.method9606(arg0, arg1, arg2);
		if (local4 == null) {
			return;
		}
		local4.aClass15_Sub3_Sub5_1 = arg3;
		@Pc(16) int local16 = Static245.aClass18Array14 == Static93.aClass18Array33 ? 1 : 0;
		if (arg3.method9425()) {
			if (arg3.method9434()) {
				arg3.aClass15_Sub3_23 = Static440.aClass15_Sub3Array4[local16];
				Static440.aClass15_Sub3Array4[local16] = arg3;
				return;
			}
			arg3.aClass15_Sub3_23 = Static603.aClass15_Sub3Array5[local16];
			Static603.aClass15_Sub3Array5[local16] = arg3;
			Static207.aBoolean327 = true;
			return;
		}
		arg3.aClass15_Sub3_23 = Static98.aClass15_Sub3Array2[local16];
		Static98.aClass15_Sub3Array2[local16] = arg3;
	}
}
