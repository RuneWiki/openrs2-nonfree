import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static306 {

	@OriginalMember(owner = "client!kga", name = "r", descriptor = "I")
	public static int anInt5580;

	@OriginalMember(owner = "client!kga", name = "a", descriptor = "(III)Lclient!lg;")
	public static Class23_Sub2_Sub3 method4709(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class247 local7 = Static332.aClass247ArrayArrayArray1[arg0][arg1][arg2];
		return local7 == null || local7.aClass23_Sub2_Sub3_1 == null ? null : local7.aClass23_Sub2_Sub3_1;
	}
}
