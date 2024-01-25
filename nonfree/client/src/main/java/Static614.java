import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static614 {

	@OriginalMember(owner = "client!vw", name = "t", descriptor = "I")
	public static int anInt10281;

	@OriginalMember(owner = "client!vw", name = "b", descriptor = "(III)Lclient!mj;")
	public static Class4_Sub2_Sub2 method8756(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class217 local7 = Static421.aClass217ArrayArrayArray5[arg0][arg1][arg2];
		return local7 == null || local7.aClass4_Sub2_Sub2_1 == null ? null : local7.aClass4_Sub2_Sub2_1;
	}
}
