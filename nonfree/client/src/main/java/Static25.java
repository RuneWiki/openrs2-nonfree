import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static25 {

	@OriginalMember(owner = "client!ar", name = "d", descriptor = "[I")
	public static final int[] anIntArray12 = new int[64];

	@OriginalMember(owner = "client!ar", name = "a", descriptor = "(III)Lclient!uw;")
	public static Class4_Sub2_Sub4 method299(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class217 local7 = Static421.aClass217ArrayArrayArray5[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass4_Sub2_Sub4_2;
	}
}
