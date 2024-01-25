import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static490 {

	@OriginalMember(owner = "client!uda", name = "a", descriptor = "I")
	public static int anInt8412 = 2;

	@OriginalMember(owner = "client!uda", name = "a", descriptor = "(III)Lclient!nba;")
	public static Class15_Sub3 method6780(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class37 local7 = Static152.aClass37ArrayArrayArray1[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass15_Sub3_3;
	}
}
