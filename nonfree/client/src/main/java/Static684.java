import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static684 {

	@OriginalMember(owner = "client!tfa", name = "a", descriptor = "(IIIILclient!dc;)V")
	public static void method4305(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class15_Sub3_Sub2 arg4) {
		@Pc(4) Class291 local4 = Static654.method9606(arg0, arg1, arg2);
		if (local4 == null) {
			return;
		}
		arg4.anInt11022 = (arg1 << Static170.anInt3602) + Static124.anInt2431;
		arg4.anInt11029 = arg3;
		arg4.anInt11024 = (arg2 << Static170.anInt3602) + Static124.anInt2431;
		local4.aClass15_Sub3_Sub2_1 = arg4;
		@Pc(33) int local33 = Static245.aClass18Array14 == Static93.aClass18Array33 ? 1 : 0;
		if (arg4.method9425()) {
			if (arg4.method9434()) {
				arg4.aClass15_Sub3_23 = Static440.aClass15_Sub3Array4[local33];
				Static440.aClass15_Sub3Array4[local33] = arg4;
				return;
			}
			arg4.aClass15_Sub3_23 = Static603.aClass15_Sub3Array5[local33];
			Static603.aClass15_Sub3Array5[local33] = arg4;
			Static207.aBoolean327 = true;
			return;
		}
		arg4.aClass15_Sub3_23 = Static98.aClass15_Sub3Array2[local33];
		Static98.aClass15_Sub3Array2[local33] = arg4;
	}
}
