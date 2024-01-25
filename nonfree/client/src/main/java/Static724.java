import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static724 {

	@OriginalMember(owner = "client!wv", name = "b", descriptor = "I")
	public static int anInt11286;

	@OriginalMember(owner = "client!wv", name = "a", descriptor = "(III)Lclient!wha;")
	public static Class19_Sub1_Sub5 method9433(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class262 local7 = Static584.aClass262ArrayArrayArray2[arg0][arg1][arg2];
		return local7 == null || local7.aClass19_Sub1_Sub5_1 == null ? null : local7.aClass19_Sub1_Sub5_1;
	}
}
