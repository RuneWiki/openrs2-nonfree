import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static371 {

	@OriginalMember(owner = "client!su", name = "a", descriptor = "(III)Lclient!ab;")
	public static Class3_Sub1 method5568(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class101 local7 = Static409.aClass101ArrayArrayArray3[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass3_Sub1_3;
	}
}
